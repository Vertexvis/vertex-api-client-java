package com.vertexvis.auth;

import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.api.PartRevisionsApi;
import okhttp3.OkHttpClient;
import okhttp3.mockwebserver.Dispatcher;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

public class RetryingOAuthTest {
    final static int numThreads = 10;
    private static void startServer(MockWebServer server) throws IOException {
        server.setDispatcher(new Dispatcher() {
            static final AtomicInteger numCalls = new AtomicInteger();
            static final AtomicInteger tokenVersion = new AtomicInteger(0);
            static final AtomicInteger requestCount = new AtomicInteger(0);

            @NotNull
            @Override
            public MockResponse dispatch(@NotNull RecordedRequest recordedRequest) throws InterruptedException {
                Thread.sleep(200);
                int reqNum = requestCount.incrementAndGet();
                System.out.println("[" + reqNum + "] Request to: " + recordedRequest.getPath());
                
                if (recordedRequest.getPath().equals("/oauth2/token")) {
                    if (numCalls.incrementAndGet() > (numThreads / 2)) {
                        int oldVersion = tokenVersion.get();
                        tokenVersion.set(1);
                        if (oldVersion != 1) {
                            System.out.println("[" + reqNum + "] **** Token version changed from v" + oldVersion + " to v1 ****");
                        }
                    }
                    String token = "token-v" + tokenVersion.get();
                    System.out.println("[" + reqNum + "] Issuing new token: " + token);
                    return new MockResponse()
                        .addHeader("Content-Type", "application/json")
                        .setBody("{\"access_token\": \"" + token + "\", \"token_type\": \"bearer\"}");
                }
                
                // Check if it's a part revision delete request
                if (recordedRequest.getPath().startsWith("/part-revisions/")) {
                    String path = recordedRequest.getPath();
                    String authHeader = recordedRequest.getHeaders().get("Authorization");
                    String expectedToken = "Bearer token-v" + tokenVersion.get();
                    System.out.println("[" + reqNum + "] Path: " + path);
                    System.out.println("[" + reqNum + "] Auth header: " + authHeader);
                    System.out.println("[" + reqNum + "] Expected token: " + expectedToken);
                    
                    if (authHeader == null || !authHeader.equals(expectedToken)) {
                        System.out.println("[" + reqNum + "] Token mismatch - returning 401");
                        return new MockResponse()
                            .setResponseCode(HttpURLConnection.HTTP_UNAUTHORIZED)
                            .setBody("{\"errors\":[{\"id\":\"" + UUID.randomUUID() + "\",\"status\":\"401\",\"code\":\"Unauthorized\",\"title\":\"Invalid or missing credentials.\"}]}");
                    }

                    System.out.println("[" + reqNum + "] Request successful");
                    return new MockResponse()
                        .setBody("{\"data\": {\"id\": \"" + UUID.randomUUID() + "\", \"type\": \"queued-job\", \"attributes\": {\"status\": \"complete\", \"created\": \"2023-04-03T12:34:56Z\"}}}");
                }
                
                return new MockResponse()
                    .setResponseCode(HttpURLConnection.HTTP_NOT_FOUND)
                    .setBody("{\"errors\":[{\"status\":\"404\",\"code\":\"NotFound\",\"title\":\"Not found\"}]}");
            }
        });
        server.start();
    }

    @Test
    public void multithreading() throws ApiException, IOException {
        final AtomicInteger numFails = new AtomicInteger();
        try (var server = new MockWebServer()) {
            startServer(server);

            final String baseUrl = server.url("").toString().replaceAll("/$", "");
            var client = new ApiClient();
            client.setBasePath(baseUrl);
            
            // Set up RetryingOAuth
            var auth = new RetryingOAuth(
                baseUrl + "/oauth2/token",
                "clientid", 
                OAuthFlow.APPLICATION,
                "clientsecret",
                null
            );
            client.setHttpClient(new OkHttpClient.Builder()
                .addInterceptor(auth)
                .build());
                
            var prs = new PartRevisionsApi(client);
            Thread[] threads = new Thread[numThreads];
            
            for (var i = 0; i < numThreads; i++) {
                threads[i] = new Thread(() -> {
                    try {
                        prs.deletePartRevision(UUID.randomUUID());
                    } catch (Exception e) {
                        e.printStackTrace();
                        numFails.incrementAndGet();
                    }
                });
                threads[i].start();
            }

            for (var i = 0; i < numThreads; i++) {
                threads[i].join();
            }

            Assertions.assertEquals(0, numFails.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}