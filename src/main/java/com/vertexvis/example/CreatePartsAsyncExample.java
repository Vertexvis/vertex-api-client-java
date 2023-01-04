package com.vertexvis.example;

import static com.vertexvis.example.CallbackUtil.execute;


import com.vertexvis.ApiCallback;
import com.vertexvis.ApiClient;
import com.vertexvis.api.FilesApi;
import com.vertexvis.model.CreateFileRequest;
import com.vertexvis.model.CreateFileRequestData;
import com.vertexvis.model.CreateFileRequestDataAttributes;
import com.vertexvis.model.FileMetadata;
import com.vertexvis.model.Part;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreatePartsAsyncExample {
  public static void main(String[] args) {
    String clientId = System.getenv("VERTEX_CLIENT_ID");
    String secret = System.getenv("VERTEX_CLIENT_SECRET");
    if (isNullOrEmpty(clientId) || isNullOrEmpty(secret)) {
      throw new RuntimeException(
          "Environment variables containing your Vertex client ID and secret are required."
      );
    }

    ApiClient client =
        new ApiClient("https://platform.vertexvis.com", clientId, secret, new HashMap<>());

    PartCreator pc = new PartCreator(client);
    FilesApi files = new FilesApi(client);

    List<CompletableFuture<Part>> futureParts = Stream.of("file-1.jt", "file-2.jt", "file-3.jt")
        .map(CreatePartsAsyncExample::buildCreateFileReq)
        .map(req -> createAndUploadFile(files, req).thenCompose(partId -> pc.createPartFromFileAsync(partId, req)))
        .collect(Collectors.toList());

    CompletableFuture.allOf(futureParts.toArray(new CompletableFuture[0])).join();
    futureParts.stream()
        .map(CompletableFuture::join)
        .forEach(p -> System.out.println("Created part: " + p.getData().getId() + " with name " +
            p.getData().getAttributes().getName()));

    System.exit(0);
  }

  private static CompletableFuture<UUID> createAndUploadFile(FilesApi files,
                                                             CreateFileRequest req) {
    return CallbackUtil.<FileMetadata>execute(fmdCB -> files.createFileAsync(req, fmdCB))
        .thenCompose(
            md -> uploadFile(files, md.getData().getAttributes().getName(), md.getData().getId()));
  }

  private static CompletableFuture<UUID> uploadFile(FilesApi files, String name, UUID id) {
    return execute((ApiCallback<Void> uCB) ->
        files.uploadFileAsync(id, new File("/path/to/" + name), uCB))
        .thenApply((Void) -> id);
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
