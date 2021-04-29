package com.vertexvis;

import com.vertexvis.api.FilesApi;
import com.vertexvis.auth.OAuth;
import com.vertexvis.model.FileList;

public class Example {
  public static void main(String[] args) {
    ApiClient client = Configuration.getDefaultApiClient();
    client.setBasePath("https://platform.vertexvis.com");

    OAuth auth = (OAuth) client.getAuthentication("OAuth2");
    auth.setAccessToken("YOUR ACCESS TOKEN");

    FilesApi apiInstance = new FilesApi(client);
    try {
      FileList result = apiInstance.getFiles(null, 10, null);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
    }
  }
}
