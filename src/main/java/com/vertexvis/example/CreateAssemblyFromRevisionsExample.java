package com.vertexvis.example;

import com.vertexvis.ApiCallback;
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.api.FilesApi;
import com.vertexvis.example.cmdline.CommandLineOptions;
import com.vertexvis.model.CreateFileRequest;
import com.vertexvis.model.CreateFileRequestData;
import com.vertexvis.model.CreateFileRequestDataAttributes;
import com.vertexvis.model.FileMetadata;
import com.vertexvis.model.Part;
import com.vertexvis.model.PartDataRelationshipsPartRevisions;
import picocli.CommandLine;

import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.vertexvis.example.CallbackUtil.execute;

public class CreateAssemblyFromRevisionsExample extends CommandLineOptions {
    private static final Logger logger = Logger.getLogger(CreateAssemblyFromRevisionsExample.class.getName());

    @Override
    public void run() {
        String clientId = getClientId();
        String secret = getClientSecret();
        if (isNullOrEmpty(clientId) || isNullOrEmpty(secret)) {
            throw new CommandLine.ParameterException(getSpec().commandLine(),
                    "Environment variables [VERTEX_CLIENT_ID] [VERTEX_CLIENT_SECRET] or command line options " +
                            "[--clientId]" +
                            "[--clientSecret]" +
                            "containing your Vertex client ID and secret are required."
            );
        }

        ApiClient client =
                new ApiClient(getVertexApiUrl(), clientId, secret, new HashMap<>()).setDebugging(isVerboseDebugLogging());

        PartCreator pc = new PartCreator(client);
        FilesApi files = new FilesApi(client);
        SceneCreator sc = new SceneCreator(client);


        List<CompletableFuture<Part>> futureParts = getPartFiles().stream()
                .map(CreateAssemblyFromRevisionsExample::buildCreateFileReq)
                .map(req -> createAndUploadFile(files, req)
                        .thenCompose(partId -> pc.createPartFromFileAsync(partId, req)))
                .collect(Collectors.toList());

        CompletableFuture.allOf(futureParts.toArray(new CompletableFuture[0])).join();
        List<Part> newParts = futureParts.stream()
                .map(CompletableFuture::join)
                .collect(Collectors.toList());
        newParts.forEach(p -> logger.info("Created part: " + p.getData().getId() + " with name " +
                p.getData().getAttributes().getName()));

        try {
            Part assembly = newParts.stream()
                    .map(part -> part.getData().getRelationships().getPartRevisions())
                    .flatMap(Collection::stream)
                    .map(PartDataRelationshipsPartRevisions::getId)
                    .peek(uuid -> logger.info(uuid.toString()))
                    .collect(Collectors.collectingAndThen(Collectors.toList(), (l) -> pc.createAssemblyFromRevisions(l, getAssemblyName())))
                    .handle((part, ex) -> {
                        if (ex != null) {
                            if (ex.getCause() instanceof ApiException) {
                                logger.log(Level.SEVERE, ((ApiException) ex.getCause()).getResponseBody(), ex.getCause());
                            }
                            logger.log(Level.SEVERE, ex.getCause().getMessage(), ex);
                            return null;
                        } else {
                            return part;
                        }
                    }).join();

            logger.info("Created assembly: " + assembly.getData().getId() + " with name " +
                    assembly.getData().getAttributes().getName());
            var scene = sc.createSceneFromPart(assembly);
            logger.info("Created scene: " + scene.getData().getId() + " with name " +
                    scene.getData().getAttributes().getName());
        } catch (ApiException e) {
            logger.log(Level.SEVERE, "Error Code [" + e.getCode() + "], Response body " + e.getResponseBody(), e);
        } catch (InterruptedException e) {
            logger.severe(e.getMessage());
        }
    }

    public static void main(String[] args) {

        var exitCode = new CommandLine(new CreateAssemblyFromRevisionsExample()).execute(args);
        System.exit(exitCode);
    }

    private static CompletableFuture<UUID> createAndUploadFile(FilesApi files,
                                                               CreateFileRequest req) {
        return CallbackUtil.<FileMetadata>execute(fmdCB -> files.createFileAsync(req, fmdCB))
                .thenCompose(
                        md -> uploadFile(files, md.getData().getAttributes().getName(), md.getData().getId()));
    }

    private static CompletableFuture<UUID> uploadFile(FilesApi files, String name, UUID id) {
        return execute((ApiCallback<Void> uCB) ->
                files.uploadFileAsync(id, new File(name), uCB))
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
