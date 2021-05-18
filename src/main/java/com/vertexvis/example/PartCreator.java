package com.vertexvis.example;

import com.vertexvis.ApiCallback;
import com.vertexvis.ApiClient;
import com.vertexvis.api.PartsApi;
import com.vertexvis.api.TranslationInspectionsApi;
import com.vertexvis.model.*;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

import static com.vertexvis.example.CallbackUtil.execute;

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

    public CompletableFuture<Part> createPartFromFileAsync(UUID id) {
        CompletableFuture<QueuedJob> p = execute(cb -> parts.createPartAsync(getCreatePartRequest(id), cb));
        CompletableFuture<UUID> partId = p.thenCompose(qj ->
                JobPoller.pollUntilJobDoneAsync("part", () ->
                        execute(cb -> tiApi.getQueuedTranslationAsync(qj.getData().getId(), cb))));

        return partId.thenCompose(pId -> execute((ApiCallback<Part> cb) -> parts.getPartAsync(pId, null, cb)));
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
