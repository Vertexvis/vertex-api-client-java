package com.vertexvis.auth;

import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.ServerConfiguration;
import com.vertexvis.ServerVariable;
import com.vertexvis.api.PartRevisionsApi;
import okhttp3.Call;
import okhttp3.Request;
import okhttp3.mockwebserver.Dispatcher;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class RetryingOAuthTest {
    final static int numThreads = 10;
    private static void startServer(MockWebServer server) throws IOException {
        server.setDispatcher(new Dispatcher()
        {
            static final AtomicInteger numCalls = new AtomicInteger();

            @NotNull
            @Override
            public MockResponse dispatch(@NotNull RecordedRequest recordedRequest) throws InterruptedException {
                Thread.sleep(200);
                var token = numCalls.incrementAndGet() > (numThreads / 2) ? "1" : "0";
                if (Objects.equals(recordedRequest.getPath(), "/oauth2/token")) {
                    return new MockResponse().addHeader("Content-Type", "application/json").setBody("{\"access_token\": \"" + token + "\"}");
                }
                if (!recordedRequest.getHeaders().get("Authorization").endsWith(token)) {
                    return new MockResponse().setResponseCode(HttpURLConnection.HTTP_UNAUTHORIZED).setBody("{\"error\": \"invalid_token\"}");
                }
                return new MockResponse().setBody("{\"data\": {\"id\": \"" + UUID.randomUUID().toString() +
                        "\",\"type\":\"deletePartRevisionJob\",\"attributes\":{\"status\":\"running\"," +
                        "\"created\":\"2020-01-01T12:00:00Z\"}}}");
            }
        });
        server.start();
    }

    @Test
    public void multithreading() throws ApiException, IOException {
        final AtomicInteger numFails = new AtomicInteger();
        try (var server = new MockWebServer()) {
            startServer(server);

            final String baseUrl = server.url("/api").toString();
            var client = new ApiClient(baseUrl, "clientid", "clientsecret", new HashMap<>());

            client.setServers(Arrays.asList(new ServerConfiguration(server.url("/").toString(), "debug server", new HashMap<String, ServerVariable>())));

            var prs = new PartRevisionsApi(client);
            Thread[] threads = new Thread[numThreads];
            for (var i = 0; i < numThreads; i++) {
                threads[i] = new Thread(() -> {
                    try {
                        prs.deletePartRevision(UUID.randomUUID());
                    } catch (Exception e) {
                        System.err.println(e.toString());
                        numFails.incrementAndGet();
                    }
                });
               threads[i].start();
            }

            for (var i = 0; i < numThreads; i++) {
                threads[i].join();
            }

            Assertions.assertEquals(0, numFails.get());
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
