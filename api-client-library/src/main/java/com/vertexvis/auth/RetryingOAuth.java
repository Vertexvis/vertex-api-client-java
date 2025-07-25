package com.vertexvis.auth;

import com.vertexvis.Pair;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.util.List;
import java.util.Map;

import okhttp3.Credentials;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.oltu.oauth2.client.OAuthClient;
import org.apache.oltu.oauth2.client.request.OAuthBearerClientRequest;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest.TokenRequestBuilder;
import org.apache.oltu.oauth2.client.response.OAuthJSONAccessTokenResponse;
import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.apache.oltu.oauth2.common.message.types.GrantType;
import org.jetbrains.annotations.NotNull;

public class RetryingOAuth extends OAuth implements Interceptor {
  private final OAuthClient oAuthClient;
  private final TokenRequestBuilder tokenRequestBuilder;

  public RetryingOAuth(
      String tokenUrl,
      String clientId,
      OAuthFlow flow,
      String clientSecret,
      Map<String, String> parameters
  ) {
    this.oAuthClient = new OAuthClient(new OAuthOkHttpClient(
        new OkHttpClient.Builder()
            .addInterceptor(new AuthInterceptor(clientId, clientSecret))
            .build()));
    this.tokenRequestBuilder = OAuthClientRequest.tokenLocation(tokenUrl);
    setFlow(flow);
    if (parameters != null) {
      for (String paramName : parameters.keySet()) {
        tokenRequestBuilder.setParameter(paramName, parameters.get(paramName));
      }
    }
  }

  public void setFlow(OAuthFlow flow) {
    if (flow == OAuthFlow.APPLICATION) {
      tokenRequestBuilder.setGrantType(GrantType.CLIENT_CREDENTIALS);
    }
  }

  @NotNull
  @Override
  public Response intercept(Chain chain) throws IOException {
    return retryingIntercept(chain, true);
  }

  private Response retryingIntercept(Chain chain, boolean updateTokenAndRetryOnAuthorizationFailure)
      throws IOException {
    Request request = chain.request();

    // If the request already has an authorization (e.g. Basic auth), proceed with the request as is
    if (request.header("Authorization") != null) {
      return chain.proceed(request);
    }

    // Get the token if it has not yet been acquired
    if (getAccessToken() == null) {
      updateAccessToken(null);
    }

    OAuthClientRequest oAuthRequest;
    if (getAccessToken() != null) {
      // Build the request
      Request.Builder requestBuilder = request.newBuilder();

      String requestAccessToken = getAccessToken();
      try {
        oAuthRequest =
            new OAuthBearerClientRequest(request.url().toString()).
                setAccessToken(requestAccessToken).
                buildHeaderMessage();
      } catch (OAuthSystemException e) {
        throw new IOException(e);
      }

      Map<String, String> headers = oAuthRequest.getHeaders();
      for (String headerName : headers.keySet()) {
        requestBuilder.addHeader(headerName, headers.get(headerName));
      }
      requestBuilder.url(oAuthRequest.getLocationUri());

      // Execute the request
      Response response = chain.proceed(requestBuilder.build());

      // 401/403 response codes most likely indicate an expired access token, unless it happens two times in a row
      if (
          (response.code() == HttpURLConnection.HTTP_UNAUTHORIZED ||
              response.code() == HttpURLConnection.HTTP_FORBIDDEN) &&
              updateTokenAndRetryOnAuthorizationFailure
      ) {
        try {
          updateAccessToken(requestAccessToken);
          response.body().close();
          return retryingIntercept(chain, false);
        } catch (Exception e) {
          response.body().close();
          throw e;
        }
      }
      return response;
    } else {
      return chain.proceed(chain.request());
    }
  }

  private synchronized void updateAccessToken(String requestAccessToken) throws IOException {
    // if we don't have a token at all, we go get one
    // if we are here and requestAccessToken is not equal to getAccessToken(), that means
    // some other thread has already updated the token and we can just continue on to retry with the new token.
    if (getAccessToken() == null || getAccessToken().equals(requestAccessToken)) {
      try {
        OAuthJSONAccessTokenResponse accessTokenResponse =
            oAuthClient.accessToken(tokenRequestBuilder.buildBodyMessage());
        if (accessTokenResponse != null && accessTokenResponse.getAccessToken() != null) {
          setAccessToken(accessTokenResponse.getAccessToken());
        }
      } catch (OAuthSystemException | OAuthProblemException e) {
        throw new IOException(e);
      }
    }
  }

  public TokenRequestBuilder getTokenRequestBuilder() {
    return tokenRequestBuilder;
  }

  // Applying authorization to parameters is performed in the retryingIntercept method
  @Override
  public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams, Map<String, String> cookieParams,
                            String payload, String method, URI uri) {
    // No implementation necessary
  }

  private static class AuthInterceptor implements Interceptor {
    private final String clientId;
    private final String clientSecret;

    public AuthInterceptor(String clientId, String clientSecret) {
      this.clientId = clientId;
      this.clientSecret = clientSecret;
    }

    @NotNull
    @Override
    public Response intercept(Chain chain) throws IOException {
      return chain.proceed(
          chain.request()
              .newBuilder().addHeader("Authorization", Credentials.basic(clientId, clientSecret))
              .build()
      );
    }
  }
}