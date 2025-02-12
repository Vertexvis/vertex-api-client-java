package com.vertexvis.model;

import static org.junit.jupiter.api.Assertions.assertEquals;


import com.google.gson.reflect.TypeToken;
import com.vertexvis.JSON;

import java.util.UUID;

import org.junit.jupiter.api.Test;

public class AnyOfGeometrySetRelationshipPartRevisionRelationshipTest {
  @Test
  void serializesGeometrySetRelationships() {
    UUID id = UUID.randomUUID();
    UpdateSceneItemRequestDataRelationshipsSource rel =
        new UpdateSceneItemRequestDataRelationshipsSource(
            new GeometrySetRelationship()
                .data(new GeometrySetRelationshipData().id(id)
                    .type(GeometrySetRelationshipData.TypeEnum.GEOMETRY_SET)));

    UpdateSceneItemRequestDataRelationships reqData =
        new UpdateSceneItemRequestDataRelationships().source(rel);

    String expected = "{\"source\":{\"data\":{\"type\":\"geometry-set\",\"id\":\"" + id + "\"}}}";

    assertEquals(expected, new JSON().serialize(reqData));
  }

  @Test
  void deserializeGeometrySetRelationships() {
    UUID id = UUID.randomUUID();

    String input = "{\"source\":{\"data\":{\"type\":\"geometry-set\",\"id\":\"" + id + "\"}}}";

    UpdateSceneItemRequestDataRelationships result = new JSON()
        .deserialize(input, TypeToken.get(UpdateSceneItemRequestDataRelationships.class).getType());
    GeometrySetRelationship expected =
        new GeometrySetRelationship()
            .data(new GeometrySetRelationshipData().id(id)
                .type(GeometrySetRelationshipData.TypeEnum.GEOMETRY_SET));

    assertEquals(result.getSource().getActualInstance(), expected);
    assertEquals(result.getSource().getGeometrySetRelationship(), expected);
  }

  @Test
  void serializesPartRevisionRelationships() {
    UUID id = UUID.randomUUID();

    UpdateSceneItemRequestDataRelationshipsSource rel =
        new UpdateSceneItemRequestDataRelationshipsSource(
            new PartRevisionRelationship()
                .data(new PartDataRelationshipsPartRevisions().id(id)
                    .type(PartDataRelationshipsPartRevisions.TypeEnum.PART_REVISION)));

    UpdateSceneItemRequestDataRelationships reqData =
        new UpdateSceneItemRequestDataRelationships().source(rel);

    String expected = "{\"source\":{\"data\":{\"type\":\"part-revision\",\"id\":\"" + id + "\"}}}";

    assertEquals(expected, new JSON().serialize(reqData));
  }

  @Test
  void deserializePartRevisionRelationships() {
    UUID id = UUID.randomUUID();

    String input = "{\"source\":{\"data\":{\"type\":\"part-revision\",\"id\":\"" + id + "\"}}}";

    UpdateSceneItemRequestDataRelationships result = new JSON()
        .deserialize(input, TypeToken.get(UpdateSceneItemRequestDataRelationships.class).getType());
    PartRevisionRelationship expected =
        new PartRevisionRelationship()
            .data(new PartDataRelationshipsPartRevisions().id(id)
                .type(PartDataRelationshipsPartRevisions.TypeEnum.PART_REVISION));

    assertEquals(result.getSource().getActualInstance(), expected);
    assertEquals(result.getSource().getPartRevisionRelationship(), expected);
  }
}
