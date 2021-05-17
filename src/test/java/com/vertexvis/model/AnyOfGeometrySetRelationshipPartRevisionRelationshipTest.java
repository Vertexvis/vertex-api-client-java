package com.vertexvis.model;

import com.google.gson.reflect.TypeToken;
import com.vertexvis.JSON;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnyOfGeometrySetRelationshipPartRevisionRelationshipTest {
    @Test
    void serializesGeometrySetRelationships() {
        UUID id = UUID.randomUUID();

        AnyOfGeometrySetRelationshipPartRevisionRelationship rel =
                new AnyOfGeometrySetRelationshipPartRevisionRelationship(
                        new GeometrySetRelationship()
                                .data(new GeometrySetRelationshipData().id(id).type(GeometrySetRelationshipData.TypeEnum.GEOMETRY_SET)));

        UpdateSceneItemRequestDataRelationships reqData = new UpdateSceneItemRequestDataRelationships().source(rel);

        String expected = "{\"source\":{\"data\":{\"type\":\"geometry-set\",\"id\":\"" + id + "\"}}}";

        assertEquals(expected, new JSON().serialize(reqData));
    }

    @Test
    void deserializeGeometrySetRelationships() {
        UUID id = UUID.randomUUID();

        String input = "{\"source\":{\"data\":{\"type\":\"geometry-set\",\"id\":\"" + id + "\"}}}";

        UpdateSceneItemRequestDataRelationships result = new JSON().deserialize(input, TypeToken.get(UpdateSceneItemRequestDataRelationships.class).getType());
        GeometrySetRelationship expected =
                new GeometrySetRelationship()
                        .data(new GeometrySetRelationshipData().id(id).type(GeometrySetRelationshipData.TypeEnum.GEOMETRY_SET));

        assertEquals(result.getSource().getRel(), expected);
        assertEquals(result.getSource().getGeometrySetRel(), expected);
    }

    @Test
    void serializesPartRevisionRelationships() {
        UUID id = UUID.randomUUID();

        AnyOfGeometrySetRelationshipPartRevisionRelationship rel =
                new AnyOfGeometrySetRelationshipPartRevisionRelationship(
                        new PartRevisionRelationship()
                                .data(new PartDataRelationshipsPartRevisions().id(id).type(PartDataRelationshipsPartRevisions.TypeEnum.PART_REVISION)));

        UpdateSceneItemRequestDataRelationships reqData = new UpdateSceneItemRequestDataRelationships().source(rel);

        String expected = "{\"source\":{\"data\":{\"type\":\"part-revision\",\"id\":\"" + id + "\"}}}";

        assertEquals(expected, new JSON().serialize(reqData));
    }

    @Test
    void deserializePartRevisionRelationships() {
        UUID id = UUID.randomUUID();

        String input = "{\"source\":{\"data\":{\"type\":\"part-revision\",\"id\":\"" + id + "\"}}}";

        UpdateSceneItemRequestDataRelationships result = new JSON().deserialize(input, TypeToken.get(UpdateSceneItemRequestDataRelationships.class).getType());
        PartRevisionRelationship expected =
                new PartRevisionRelationship()
                        .data(new PartDataRelationshipsPartRevisions().id(id).type(PartDataRelationshipsPartRevisions.TypeEnum.PART_REVISION));

        assertEquals(result.getSource().getRel(), expected);
        assertEquals(result.getSource().getPartRevisionRel(), expected);
    }
}
