package com.vertexvis.example;

import com.vertexvis.ApiClient;
import com.vertexvis.api.FilesApi;
import com.vertexvis.api.StreamKeysApi;
import com.vertexvis.model.CreateFileRequest;
import com.vertexvis.model.CreateFileRequestData;
import com.vertexvis.model.CreateFileRequestDataAttributes;
import com.vertexvis.model.CreateStreamKeyRequest;
import com.vertexvis.model.CreateStreamKeyRequestData;
import com.vertexvis.model.CreateStreamKeyRequestDataAttributes;
import com.vertexvis.model.FileMetadata;
import com.vertexvis.model.Part;
import com.vertexvis.model.Scene;
import com.vertexvis.model.StreamKey;

import java.io.File;
import java.util.HashMap;
import java.util.UUID;

import org.slf4j.Logger;

public class CreateSceneExample {
  private final static Logger logger =
      org.slf4j.LoggerFactory.getLogger(CreateSceneExample.class);
  public static void main(String[] args) throws InterruptedException {
    String id = System.getenv("VERTEX_CLIENT_ID");
    String secret = System.getenv("VERTEX_CLIENT_SECRET");
    if (isNullOrEmpty(id) || isNullOrEmpty(secret)) {
      throw new RuntimeException(
          "Environment variables containing your Vertex client ID and secret are required."
      );
    }

    try {
      ApiClient client =
          new ApiClient("https://platform.vertexvis.com", id, secret, new HashMap<>());

      PartCreator partCreator = new PartCreator(client);
      SceneCreator sceneCreator = new SceneCreator(client);
      FilesApi files = new FilesApi(client);

      FileMetadata file = files.createFile(buildCreateFileReq("my-file.jt"));
      UUID fileId = file.getData().getId();
      files.uploadFile(fileId, new File("/path/to/my-file.jt"));

      Part part = partCreator.createPartFromFile(file);
      Scene scene = sceneCreator.createSceneFromPart(part);

      StreamKey sceneStreamKey =
          new StreamKeysApi(client).createSceneStreamKey(scene.getData().getId(),
              buildCreateStreamKeyReq());

      System.out.println(
          "Use key: '"
              + sceneStreamKey.getData().getAttributes().getKey()
              + "' to render scene: "
              + scene.getData().getId());
    } catch (RuntimeException e) {
     logger.error("An error occurred while creating the scene: ", e);
      throw e;
    }
  }

  private static CreateStreamKeyRequest buildCreateStreamKeyReq() {
    int TWENTY_FOUR_HOURS = 86400;
    return new CreateStreamKeyRequest()
        .data(
            new CreateStreamKeyRequestData()
                .type("stream-key")
                .attributes(
                    new CreateStreamKeyRequestDataAttributes().expiry(TWENTY_FOUR_HOURS)));
  }

  private static CreateFileRequest buildCreateFileReq(String fileName) {
    return new CreateFileRequest()
        .data(
            new CreateFileRequestData()
                .type("file")
                .attributes(new CreateFileRequestDataAttributes().name(fileName)));
  }

  private static boolean isNullOrEmpty(String s) {
    return s == null || s.trim().length() == 0;
  }
}
