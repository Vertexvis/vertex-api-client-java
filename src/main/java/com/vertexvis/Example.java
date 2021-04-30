package com.vertexvis;

import com.vertexvis.api.FilesApi;
import com.vertexvis.auth.OAuth;
import com.vertexvis.model.CreateFileRequest;
import com.vertexvis.model.CreateFileRequestData;
import com.vertexvis.model.CreateFileRequestDataAttributes;
import java.util.HashMap;

public class Example {
  public static void main(String[] args) {
    String basePath = "https://platform.platdev.vertexvis.io";
    ApiClient client = Configuration.getDefaultApiClient();
    client.setBasePath(basePath);

    OAuth auth = (OAuth) client.getAuthentication("OAuth2");
    auth.setAccessToken("YOUR_ACCESS_TOKEN");
    FilesApi files = new FilesApi(client);
    try {
      System.out.println(files.createFile(buildCreateFileReq("my-file.jt")));
      System.out.println(files.getFiles(null, 2, null));
    } catch (ApiException e) {
      Throwable cause = e.getCause();
      System.err.printf(
          "Exception calling Vertex API.\ncode=%d\nmessage=%s\nbody=%s%n",
          e.getCode(),
          cause == null ? e.getMessage() : cause.getMessage(),
          e.getResponseBody()
      );
    }
  }

  public static boolean isNullOrEmpty(String s) {
    return s == null || s.trim().length() == 0;
  }

  private static CreateFileRequest buildCreateFileReq(String fileName) {
    return new CreateFileRequest()
        .data(new CreateFileRequestData()
            .type("file")
            .attributes(new CreateFileRequestDataAttributes()
                .name(fileName)));
  }
}
