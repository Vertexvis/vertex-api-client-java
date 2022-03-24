package com.vertexvis.example;

import static com.vertexvis.model.CameraFit.TypeEnum.FIT_VISIBLE_SCENE_ITEMS;


import com.vertexvis.ApiClient;
import com.vertexvis.api.SceneItemsApi;
import com.vertexvis.api.ScenesApi;
import com.vertexvis.model.AnyOfGeometrySetRelationshipPartRevisionRelationshipSceneRelationship;
import com.vertexvis.model.CameraFit;
import com.vertexvis.model.CreateSceneItemRequest;
import com.vertexvis.model.CreateSceneItemRequestData;
import com.vertexvis.model.CreateSceneItemRequestDataAttributes;
import com.vertexvis.model.CreateSceneItemRequestDataRelationships;
import com.vertexvis.model.CreateSceneRequest;
import com.vertexvis.model.CreateSceneRequestData;
import com.vertexvis.model.CreateSceneRequestDataAttributes;
import com.vertexvis.model.Part;
import com.vertexvis.model.PartDataRelationshipsPartRevisions;
import com.vertexvis.model.PartRevisionRelationship;
import com.vertexvis.model.QueuedJob;
import com.vertexvis.model.Scene;
import com.vertexvis.model.UpdateSceneRequest;
import com.vertexvis.model.UpdateSceneRequestData;
import com.vertexvis.model.UpdateSceneRequestDataAttributes;

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
                            .state(UpdateSceneRequestDataAttributes.StateEnum.COMMIT))));
                            // .camera(
                            //     new AnyOfCameraCameraFit(
                            //         new CameraFit().type(FIT_VISIBLE_SCENE_ITEMS))))));

    return scene;
  }
}
