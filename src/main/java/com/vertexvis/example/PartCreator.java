package com.vertexvis.example;

import com.vertexvis.ApiClient;
import com.vertexvis.api.PartsApi;
import com.vertexvis.api.TranslationInspectionsApi;
import com.vertexvis.model.*;

import java.util.UUID;

class PartCreator {
  private final TranslationInspectionsApi tiApi;
  private final PartsApi parts;

  public PartCreator(ApiClient client) {
    this.parts = new PartsApi(client);
    this.tiApi = new TranslationInspectionsApi(client);
  }

  public Part createPartFromFile(UUID id) throws InterruptedException {
    QueuedJob qp = parts.createPart(getCreatePartRequest(id));
    UUID partId =
        JobPoller.pollUntilJobDone("part", () -> tiApi.getQueuedTranslation(qp.getData().getId()));
    return parts.getPart(partId, null);
  }

  private static CreatePartRequest getCreatePartRequest(UUID fileId) {
    return new CreatePartRequest()
        .data(
            new CreatePartRequestData()
                .type("part")
                .attributes(
                    new CreatePartRequestDataAttributes()
                        .suppliedId("my-part-" + UUID.randomUUID())
                        .suppliedRevisionId("my-part-rev-A"))
                .relationships(
                    new CreateGeometrySetRequestDataRelationships()
                        .source(
                            new FileRelationship()
                                .data(
                                    new FileRelationshipData()
                                        .id(fileId)
                                        .type(FileRelationshipData.TypeEnum.FILE)))));
  }
}
