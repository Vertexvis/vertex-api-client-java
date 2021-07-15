package com.vertexvis.model;

import static org.junit.jupiter.api.Assertions.assertEquals;


import com.vertexvis.JSON;
import java.util.UUID;
import org.junit.jupiter.api.Test;

public class OneOfSceneViewRelationshipSceneViewStateRelationshipTest {

  @Test
  void serializesHitResultData() {
    UUID id = UUID.randomUUID();
    OneOfSceneViewRelationshipSceneViewStateRelationship d =
        new OneOfSceneViewRelationshipSceneViewStateRelationship(new SceneViewRelationship()
            .data(
                new SceneViewRelationshipData().type(SceneViewRelationshipData.TypeEnum.SCENE_VIEW)
                    .id(id)));

    String expected = "{\"sceneViewRelationship\":{\"data\":{\"type\":\"scene-view\",\"id\":\"" + id + "\"}}}";

    assertEquals(expected, new JSON().serialize(d));
  }

  @Test
  void serializesSceneItemData() {
    UUID id = UUID.randomUUID();
    OneOfSceneViewRelationshipSceneViewStateRelationship d =
        new OneOfSceneViewRelationshipSceneViewStateRelationship(
            new SceneViewStateRelationship()
                .data(
                    new SceneViewStateRelationshipData().type(SceneViewStateRelationshipData.TypeEnum.SCENE_VIEW_STATE)
                        .id(id)));

    String expected = "{\"sceneViewStateRelationship\":{\"data\":{\"type\":\"scene-view-state\",\"id\":\"" + id + "\"}}}";

    assertEquals(expected, new JSON().serialize(d));
  }
}
