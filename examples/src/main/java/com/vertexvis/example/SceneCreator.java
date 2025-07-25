package com.vertexvis.example;

import com.vertexvis.ApiClient;
import com.vertexvis.api.SceneItemsApi;
import com.vertexvis.api.ScenesApi;
import com.vertexvis.example.JobPoller.PollableQueuedJob;
import com.vertexvis.example.JobPoller.SceneItemQueuedJob;
import com.vertexvis.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;
import java.util.UUID;
import java.util.function.Supplier;

class SceneCreator {
    private final ScenesApi scenes;
    private final SceneItemsApi sceneItems;

    private static final Logger logger = LoggerFactory.getLogger(SceneCreator.class);

    public SceneCreator(ApiClient apiClient) {
        this.scenes = new ScenesApi(apiClient);
        this.sceneItems = new SceneItemsApi(apiClient);
    }

    Scene commitSceneChanges(UUID sceneId) {
        return scenes.updateScene(
                sceneId,
                new UpdateSceneRequest()
                        .data(
                                new UpdateSceneRequestData()
                                        .type("scene")
                                        .attributes(
                                                new UpdateSceneRequestDataAttributes()
                                                        .state(UpdateSceneRequestDataAttributes.StateEnum.COMMIT)
                                                        .camera(
                                                                new UpdateSceneViewRequestDataAttributesCamera(new CameraFit().type(CameraFit.TypeEnum.FIT_VISIBLE_SCENE_ITEMS))))));
    }

    public Scene createSceneFromPart(Part p) throws InterruptedException {
        return createSceneFromPart(p, true);
    }

    public Scene createSceneFromPart(Part p, boolean commitChanges) throws InterruptedException {
        assert p.getData().getRelationships() != null;
        UUID revisionId = p.getData().getRelationships().getPartRevisions().get(0).getId();
        var name = Optional.of(p.getData().getAttributes()).map(PartDataAttributes::getName).orElse("ACube");
        Scene scene =
                scenes.createScene(
                        new CreateSceneRequest()
                                .data(
                                        new CreateSceneRequestData()
                                                .type("scene")
                                                .attributes(new CreateSceneRequestDataAttributes().name(name).treeEnabled(true))));

        QueuedJob job =
                sceneItems.createSceneItem(
                        scene.getData().getId(),
                        new CreateSceneItemRequest()
                                .data(
                                        new CreateSceneItemRequestData()
                                                .type("scene-item")
                                                .attributes(
                                                        new CreateSceneItemRequestDataAttributes().suppliedId("my-part"))
                                                .relationships(
                                                        new CreateSceneItemRequestDataRelationships()
                                                                .source(
                                                                        new CreateSceneItemRequestDataRelationshipsSource(new PartRevisionRelationship()
                                                                                                .data(
                                                                                                        new PartDataRelationshipsPartRevisions()
                                                                                                                .type(
                                                                                                                        PartDataRelationshipsPartRevisions.TypeEnum
                                                                                                                                .PART_REVISION)
                                                                                                                .id(revisionId)))))));
        Supplier<PollableQueuedJob> pollableSceneItemJob = () -> new SceneItemQueuedJob(sceneItems.getQueuedSceneItem(job.getData().getId()));
        JobPoller.pollUntilJobDone(
                "complete", pollableSceneItemJob);


        return commitChanges ? commitSceneChanges(scene.getData().getId()) : scene;
    }
}
