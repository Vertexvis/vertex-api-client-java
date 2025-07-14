package com.vertexvis.example;

import com.vertexvis.ApiCallback;
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.JSON;
import com.vertexvis.api.PartsApi;
import com.vertexvis.api.TranslationInspectionsApi;
import com.vertexvis.example.JobPoller.PartQueuedJob;
import com.vertexvis.example.JobPoller.PollableQueuedJob;
import com.vertexvis.model.*;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static com.vertexvis.example.CallbackUtil.execute;

class PartCreator {
    private final TranslationInspectionsApi tiApi;
    private final PartsApi parts;

    public PartCreator(ApiClient client) {
        this.parts = new PartsApi(client);
        this.tiApi = new TranslationInspectionsApi(client);
    }

    public Part createPartFromFile(FileMetadata metadata) throws InterruptedException {
        return createPartFromFile(metadata, Collections.emptyMap());
    }

    public Part createPartFromFile(FileMetadata metadata, Map<String, UpdatePartRevisionRequestDataAttributesMetadataValue> partMetadata) throws InterruptedException {
        Part qp = parts.createPart(getCreatePartRequest(metadata.getData().getId(), metadata.getData().getAttributes().getName(), partMetadata));
        var pollingPartJob = new PartQueuedJob(tiApi.getQueuedTranslationJob(qp.getData().getId()));
        List<UUID> partIds =
                JobPoller.pollUntilJobDone("part", () -> pollingPartJob);
        var partId = partIds.stream()
                .findFirst()
                .orElseThrow(() -> new ApiException("No part ID found after polling"));
        return parts.getPart(partId, null);
    }

    public CompletableFuture<Part> createPartFromFileAsync(UUID id, CreateFileRequest req) {
        return createPartFromFileAsync(id, req, Collections.emptyMap());
    }

//   public CompletableFuture<Part> createPartFromFileAsync(UUID id, CreateFileRequest req, Map<String, UpdatePartRevisionRequestDataAttributesMetadataValue> metadata) {
//         return CompletableFuture.supplyAsync(() -> {
//            try {
//                 // Create part - returns a queued job first
//                 Part queuedPart = parts.createPart(getCreatePartRequest(id, req.getData().getAttributes().getName(), metadata));
                
//                 // Poll for translation completion using the synchronous methods
//                 UUID jobId = queuedPart.getData().getId();
//                 var pollingPartJob = new PartQueuedJob(tiApi.getQueuedTranslationJob(jobId));
//                 UUID partId = JobPoller.pollUntilJobDone("part", () -> pollingPartJob);
                
//                 // Get the final part
//                 return parts.getPart(partId, null);
//         } catch (ApiException | InterruptedException | IllegalArgumentException e) {
//                 throw new CompletionException(e);
//         }
//        }, JobPoller.scheduler); // Use the existing scheduler from JobPoller
//   }
// public CompletableFuture<Part> createPartFromFileAsync(UUID id, CreateFileRequest req, Map<String, UpdatePartRevisionRequestDataAttributesMetadataValue> metadata) {
//     // First create the part, which returns a queued job
//     CompletableFuture<Part> initialPart =
//             execute(cb -> parts.createPartAsync(getCreatePartRequest(id, req.getData().getAttributes().getName(), metadata), cb));

//     // Poll for translation completion
//     CompletableFuture<UUID> completedPartId = initialPart.thenCompose(qj -> {
//         UUID jobId = qj.getData().getId();
//         return JobPoller.pollUntilJobDoneAsync("part", () -> {
//             // Get translation job status and convert to PollableQueuedJob
//             CompletableFuture<QueuedTranslationJob> jobFuture = 
//                 execute(cb -> tiApi.getQueuedTranslationJobAsync(jobId, cb));
//             return jobFuture.thenApply(job -> new JobPoller.PartQueuedJob(job));
//         });
//     });

//     // Finally get the actual part
//     return completedPartId.thenCompose(
//             pId -> execute(cb -> parts.getPartAsync(pId, null, cb)));
// }
public CompletableFuture<Part> createPartFromFileAsync(UUID id, CreateFileRequest req, Map<String, UpdatePartRevisionRequestDataAttributesMetadataValue> metadata) {
    return CompletableFuture.supplyAsync(() -> {
        try {
            // Create the part request
            CreatePartRequest partRequest = getCreatePartRequest(id, req.getData().getAttributes().getName(), metadata);
            
            // Make direct API call to get raw response
            okhttp3.Call call = parts.createPartCall(partRequest, null);
            okhttp3.Response rawResponse = call.execute();
            
            try {
                int statusCode = rawResponse.code();
                String responseBody = rawResponse.body() != null ? rawResponse.body().string() : null;
                
                if (statusCode == 201) {
                    // 201 Created - direct part creation
                    Part part = JSON.deserialize(responseBody, Part.class);
                    return part;
                } else if (statusCode == 202) {
                    // 202 Accepted - queued job
                    QueuedJob queuedJob = JSON.deserialize(responseBody, QueuedJob.class);

                    // Now handle the queued job by polling for completion
                    UUID jobId = queuedJob.getData().getId();
                    Supplier<PollableQueuedJob> pollingPartJob = () -> new PartQueuedJob(tiApi.getQueuedTranslationJob(jobId));
                    List<UUID> partIds = JobPoller.pollUntilJobDone("complete", pollingPartJob);

                    // Return the final part
                    var partId = partIds.stream()
                        .findFirst()
                        .orElseThrow(() -> new ApiException("No part ID found after polling"));
                    return parts.getPart(partId, null);
                } else {
                    throw new ApiException("Unexpected status code: " + statusCode, statusCode, rawResponse.headers().toMultimap(), responseBody);
                }
            } finally {
                if (rawResponse.body() != null) {
                    rawResponse.body().close();
                }
            }
        } catch (ApiException | InterruptedException | IOException e) {
            throw new CompletionException(e);
        }
    }, JobPoller.scheduler);
}
    public CompletableFuture<Part> createAssemblyFromRevisions(List<UUID> revisions, String name) {
        CompletableFuture<Part> p =
                execute(cb -> parts.createPartAsync(createPartAssemblyRequest(revisions, name), cb));
        return p.thenCompose(
                pId -> execute((ApiCallback<Part> cb) -> parts.getPartAsync(pId.getData().getId(), null, cb)));
    }

    private static CreatePartRequest getCreatePartRequest(UUID fileId, String partName) {
        return getCreatePartRequest(fileId, partName, Collections.emptyMap());
    }

    private static CreatePartRequest getCreatePartRequest(UUID fileId, String partName, Map<String, UpdatePartRevisionRequestDataAttributesMetadataValue> metadata) {
        FileRelationship fileRelationship = new FileRelationship()
                .data(
                        new FileRelationshipData()
                                .id(fileId)
                                .type(FileRelationshipData.TypeEnum.FILE));
        return new CreatePartRequest()
                .data(
                        new CreatePartRequestData()
                                .type("create-part")
                                .attributes(
                                        new CreatePartRequestDataAttributes()
                                                .suppliedId("my-part-" + UUID.randomUUID())
                                                .suppliedRevisionId("my-part-rev-A")
                                                .name(partName)
                                                .metadata(metadata))
                                .relationships(new CreatePartRequestDataRelationships()
                                        .source(new CreatePartRequestDataRelationshipsSource(fileRelationship)
                                        )));
    }

    private static CreatePartRequest createPartAssemblyRequest(List<UUID> revisionIds, String assemblyName) {

        PartAssemblyRelationship partAssemblyRelationship = new PartAssemblyRelationship()
                .data(new PartAssemblyRelationshipData()
                        .metadata(Collections.emptyMap())
                        .children(createPartRevisionInstances(revisionIds))
                );
        var uuid = UUID.randomUUID();
        return new CreatePartRequest()
                .data(
                        new CreatePartRequestData()
                                .type("assembly")
                                .attributes(new CreatePartRequestDataAttributes()
                                        .suppliedId("my-assembly-" + uuid)
                                        .suppliedRevisionId("my-part-rev-" + uuid)
                                        .name(assemblyName))
                                .relationships(new CreatePartRequestDataRelationships()
                                        .source(new CreatePartRequestDataRelationshipsSource(partAssemblyRelationship))
                                ));
    }

    private static List<PartRevisionInstance> createPartRevisionInstances(List<UUID> ids) {
        int num = ids.size();
        return IntStream.range(0, num)
                .mapToObj(ordinal -> new PartRevisionInstance().
                        ordinal(ordinal)
                        .revisionId(ids.get(ordinal))
                        .transform(new Matrix4()
                                .r0(createVector4(BigDecimal.ONE, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ONE))
                                .r1(createVector4(BigDecimal.ZERO, BigDecimal.ONE, BigDecimal.ZERO, BigDecimal.ONE))
                                .r2(createVector4(BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ONE, BigDecimal.ONE))
                                .r3(createVector4(BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ONE))
                        ))
                .collect(Collectors.toList());
    }

    private static Vector4 createVector4(BigDecimal x, BigDecimal y, BigDecimal z, BigDecimal w) {
        return new Vector4()
                .x(x)
                .y(y)
                .z(z)
                .w(w);
    }
}
