package com.vertexvis.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.google.gson.reflect.TypeToken;
import com.vertexvis.JSON;

import java.util.UUID;

import org.junit.jupiter.api.Test;

public class AnyOfGeometrySetRelationshipPartRevisionRelationshipSceneRelationshipPartRenditionRelationshipTypeAdapterTest {

  @Test
  void serializesGeometrySetRelationships() {
    UUID id = UUID.randomUUID();

    CreateSceneItemRequestDataRelationshipsSource rel =
        new CreateSceneItemRequestDataRelationshipsSource(
            new GeometrySetRelationship()
                .data(new GeometrySetRelationshipData().id(id)
                    .type(GeometrySetRelationshipData.TypeEnum.GEOMETRY_SET)));

    CreateSceneItemRequestData reqData = new CreateSceneItemRequestData()
        .relationships(new CreateSceneItemRequestDataRelationships().source(rel));

    String expected =
        "{\"relationships\":{\"source\":{\"data\":{\"type\":\"geometry-set\",\"id\":\"" + id +
            "\"}}}}";

    assertEquals(expected, new JSON().serialize(reqData));
  }

  @Test
  void deserializeGeometrySetRelationships() {
    UUID id = UUID.randomUUID();

    String input =
        "{\"attributes\":{},\"type\":\"scene-item\"," +
        "\"relationships\":{\"source\":{\"data\":{\"type\":\"geometry-set\",\"id\":\"" + id +
            "\"}}}}";

    CreateSceneItemRequestData result =
        new JSON().deserialize(input, TypeToken.get(CreateSceneItemRequestData.class).getType());
    GeometrySetRelationship expected =
        new GeometrySetRelationship()
            .data(new GeometrySetRelationshipData().id(id)
                .type(GeometrySetRelationshipData.TypeEnum.GEOMETRY_SET));

    assertEquals(result.getRelationships().getSource().getActualInstance(), expected);
    assertEquals(result.getRelationships().getSource().getGeometrySetRelationship(), expected);
  }

  @Test
  void serializesPartRevisionRelationships() {
    UUID id = UUID.randomUUID();

    CreateSceneItemRequestDataRelationshipsSource rel =
        new CreateSceneItemRequestDataRelationshipsSource(
            new PartRevisionRelationship()
                .data(new PartDataRelationshipsPartRevisions().id(id)
                    .type(PartDataRelationshipsPartRevisions.TypeEnum.PART_REVISION)));

    CreateSceneItemRequestData reqData = new CreateSceneItemRequestData()
        .relationships(new CreateSceneItemRequestDataRelationships().source(rel));

    String expected =
        "{\"relationships\":{\"source\":{\"data\":{\"type\":\"part-revision\",\"id\":\"" + id +
            "\"}}}}";

    assertEquals(expected, new JSON().serialize(reqData));
  }

  @Test
  void deserializePartRevisionRelationships() {
    UUID id = UUID.randomUUID();

    String input =
        "{\"attributes\":{\"metadata\":{},\"experimentalSourceMetadataKeys\":[]},\"type\":\"scene-item\"," +
        "\"relationships\":{\"source\":{\"data\":{\"type\":\"part-revision\",\"id\":\"" + id +
        "\"}}}}";

    CreateSceneItemRequestData result =
        new JSON().deserialize(input, TypeToken.get(CreateSceneItemRequestData.class).getType());
    PartRevisionRelationship expected =
        new PartRevisionRelationship()
            .data(new PartDataRelationshipsPartRevisions().id(id)
                .type(PartDataRelationshipsPartRevisions.TypeEnum.PART_REVISION));

    assertEquals(result.getRelationships().getSource().getActualInstance(), expected);
    assertEquals(result.getRelationships().getSource().getPartRevisionRelationship(), expected);
  }

  @Test
  void serializesSceneRelationships() {
    UUID id = UUID.randomUUID();

    CreateSceneItemRequestDataRelationshipsSource rel =
        new CreateSceneItemRequestDataRelationshipsSource(
            new SceneRelationship()
                .data(
                    new SceneRelationshipData().id(id).type(SceneRelationshipData.TypeEnum.SCENE)));

    CreateSceneItemRequestData reqData = new CreateSceneItemRequestData()
        .relationships(new CreateSceneItemRequestDataRelationships().source(rel));

    String expected =
        "{\"relationships\":{\"source\":{\"data\":{\"type\":\"scene\",\"id\":\"" + id + "\"}}}}";

    assertEquals(expected, new JSON().serialize(reqData));
  }

  @Test
  void deserializeSceneRelationships() {
    UUID id = UUID.randomUUID();

    String input =
        "{\"attributes\":{},\"type\":\"scene-item\"," +
        "\"relationships\":{\"source\":{\"data\":{\"type\":\"scene\",\"id\":\"" + id + "\"}}}}";

    CreateSceneItemRequestData result =
        new JSON().deserialize(input, TypeToken.get(CreateSceneItemRequestData.class).getType());
    SceneRelationship expected =
        new SceneRelationship()
            .data(new SceneRelationshipData().id(id).type(SceneRelationshipData.TypeEnum.SCENE));

    assertEquals(result.getRelationships().getSource().getActualInstance(), expected);
    assertEquals(result.getRelationships().getSource().getSceneRelationship(), expected);
  }
}


