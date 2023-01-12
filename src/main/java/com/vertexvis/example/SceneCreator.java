package com.vertexvis.example;

import static com.vertexvis.model.CameraFit.TypeEnum.FIT_VISIBLE_SCENE_ITEMS;


import com.vertexvis.ApiClient;
import com.vertexvis.api.SceneItemsApi;
import com.vertexvis.api.ScenesApi;
import com.vertexvis.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

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
                                                                new AnyOfPerspectiveCameraOrthographicCameraCameraFit(
                                                                        new CameraFit().type(FIT_VISIBLE_SCENE_ITEMS))))));
    }

    public Scene createSceneFromPart(Part p) throws InterruptedException {
        return createSceneFromPart(p, true);
    }

    public Scene createSceneFromPart(Part p, boolean commitChanges) throws InterruptedException {
        UUID revisionId = p.getData().getRelationships().getPartRevisions().get(0).getId();
        var name = Optional.ofNullable(p.getData().getAttributes()).map(PartDataAttributes::getName).orElse("ACube");
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
                                                                        new AnyOfGeometrySetRelationshipPartRevisionRelationshipSceneRelationship(
                                                                                new PartRevisionRelationship()
                                                                                        .data(
                                                                                                new PartDataRelationshipsPartRevisions()
                                                                                                        .type(
                                                                                                                PartDataRelationshipsPartRevisions.TypeEnum
                                                                                                                        .PART_REVISION)
                                                                                                        .id(revisionId)))))));

        JobPoller.pollUntilJobDone(
                "scene-item", () -> sceneItems.getQueuedSceneItem(job.getData().getId()));


        return commitChanges ? commitSceneChanges(scene.getData().getId()) : scene;
    }
}
