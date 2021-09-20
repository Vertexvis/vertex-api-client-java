package com.vertexvis.model;

import static org.junit.jupiter.api.Assertions.assertEquals;


import com.google.gson.reflect.TypeToken;
import com.vertexvis.JSON;

import java.util.UUID;

import org.junit.jupiter.api.Test;

public class OneOfSceneViewRelationshipSceneViewStateRelationshipTest {
  @Test
  void serializesSceneViewRelationship() {
    UUID id = UUID.randomUUID();
    OneOfSceneViewRelationshipSceneViewStateRelationship rel =
        new OneOfSceneViewRelationshipSceneViewStateRelationship(new SceneViewRelationship()
            .data(
                new SceneViewRelationshipData().type(SceneViewRelationshipData.TypeEnum.SCENE_VIEW)
                    .id(id)));

    CreateSceneViewStateRequestDataRelationships reqData =
        new CreateSceneViewStateRequestDataRelationships().source(rel);

    String expected = "{\"source\":{\"data\":{\"type\":\"scene-view\",\"id\":\"" + id + "\"}}}";

    assertEquals(expected, new JSON().serialize(reqData));
  }

  @Test
  void deserializeSceneViewRelationship() {
    UUID id = UUID.randomUUID();
    String input = "{\"source\":{\"data\":{\"type\":\"scene-view\",\"id\":\"" + id + "\"}}}";

    CreateSceneViewStateRequestDataRelationships result = new JSON()
        .deserialize(input,
            TypeToken.get(CreateSceneViewStateRequestDataRelationships.class).getType());
    SceneViewRelationship expected =
        new SceneViewRelationship()
            .data(new SceneViewRelationshipData().id(id)
                .type(SceneViewRelationshipData.TypeEnum.SCENE_VIEW));

    assertEquals(result.getSource().getRel(), expected);
    assertEquals(result.getSource().getSceneViewRel(), expected);
  }

  @Test
  void serializesSceneViewStateRelationship() {
    UUID id = UUID.randomUUID();
    OneOfSceneViewRelationshipSceneViewStateRelationship rel =
        new OneOfSceneViewRelationshipSceneViewStateRelationship(
            new SceneViewStateRelationship()
                .data(
                    new SceneViewStateRelationshipData()
                        .type(SceneViewStateRelationshipData.TypeEnum.SCENE_VIEW_STATE)
                        .id(id)));

    CreateSceneViewStateRequestDataRelationships reqData =
        new CreateSceneViewStateRequestDataRelationships().source(rel);

    String expected =
        "{\"source\":{\"data\":{\"type\":\"scene-view-state\",\"id\":\"" + id + "\"}}}";

    assertEquals(expected, new JSON().serialize(reqData));
  }

  @Test
  void deserializeSceneViewStateRelationship() {
    UUID id = UUID.randomUUID();
    String input = "{\"source\":{\"data\":{\"type\":\"scene-view-state\",\"id\":\"" + id + "\"}}}";

    CreateSceneViewStateRequestDataRelationships result = new JSON()
        .deserialize(input,
            TypeToken.get(CreateSceneViewStateRequestDataRelationships.class).getType());
    SceneViewStateRelationship expected =
        new SceneViewStateRelationship()
            .data(new SceneViewStateRelationshipData().id(id)
                .type(SceneViewStateRelationshipData.TypeEnum.SCENE_VIEW_STATE));

    assertEquals(result.getSource().getRel(), expected);
    assertEquals(result.getSource().getSceneViewStateRel(), expected);
  }
}
