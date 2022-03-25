package com.vertexvis.example;

import static com.vertexvis.model.CameraFit.TypeEnum.FIT_VISIBLE_SCENE_ITEMS;


import com.vertexvis.ApiClient;
import com.vertexvis.api.SceneItemsApi;
import com.vertexvis.api.ScenesApi;
import com.vertexvis.model.*;

import java.util.UUID;

class SceneCreator {
  private final ScenesApi scenes;
  private final SceneItemsApi sceneItems;

  public SceneCreator(ApiClient apiClient) {
    this.scenes = new ScenesApi(apiClient);
    this.sceneItems = new SceneItemsApi(apiClient);
  }

  public Scene createSceneFromPart(Part p) throws InterruptedException {
    UUID revisionId = p.getData().getRelationships().getPartRevisions().get(0).getId();
    Scene scene =
        scenes.createScene(
            new CreateSceneRequest()
                .data(
                    new CreateSceneRequestData()
                        .type("scene")
                        .attributes(new CreateSceneRequestDataAttributes().name("ACube"))));

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

    scenes.updateScene(
        scene.getData().getId(),
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

    return scene;
  }
}
