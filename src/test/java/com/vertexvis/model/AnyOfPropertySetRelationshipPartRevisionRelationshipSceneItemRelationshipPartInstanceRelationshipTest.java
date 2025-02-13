package com.vertexvis.model;

import com.google.gson.reflect.TypeToken;
import com.vertexvis.JSON;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AnyOfPropertySetRelationshipPartRevisionRelationshipSceneItemRelationshipPartInstanceRelationshipTest {
    private final UUID id= UUID.randomUUID();

    @Test
    void deserializePropertySetRelationship() {
        String input = "{\"psRel\":{\"data\":{\"type\":\"property-set\",\"id\":\"" + id.toString() + "\"}}}";
        AnyOfPropertySetRelationshipPartRevisionRelationshipSceneItemRelationshipPartInstanceRelationship anyOf = new JSON().deserialize(input, TypeToken.get(AnyOfPropertySetRelationshipPartRevisionRelationshipSceneItemRelationshipPartInstanceRelationship.class).getType());

        assertTrue(anyOf.isPropertySetRel());
        PropertySetRelationship relationship= anyOf.getPropertySetRel();
        assertNotNull(relationship);
        PropertySetRelationshipData data= relationship.getData();
        assertNotNull(data);

        assertEquals(data.getType(), PropertySetRelationshipData.TypeEnum.PROPERTY_SET);
        assertEquals(data.getId(), id);
    }

    @Test
    void serializePropertySetRelationship() {
        PropertySetRelationship relationship = new PropertySetRelationship();

        PropertySetRelationshipData data= new PropertySetRelationshipData();
        data.setType(PropertySetRelationshipData.TypeEnum.PROPERTY_SET);
        data.setId(id);

        relationship.setData(data);

        AnyOfPropertySetRelationshipPartRevisionRelationshipSceneItemRelationshipPartInstanceRelationship anyOf =
                new AnyOfPropertySetRelationshipPartRevisionRelationshipSceneItemRelationshipPartInstanceRelationship(relationship);

        String expected = "{\"psRel\":{\"data\":{\"type\":\"property-set\",\"id\":\"" + id.toString() + "\"}}}";

        assertEquals(expected, new JSON().serialize(anyOf));
    }

    @Test
    void deserializePartRevisionRelationship() {
        String input = "{\"prRel\":{\"data\":{\"type\":\"part-revision\",\"id\":\"" + id.toString() + "\"}}}";
        AnyOfPropertySetRelationshipPartRevisionRelationshipSceneItemRelationshipPartInstanceRelationship anyOf = new JSON().deserialize(input, TypeToken.get(AnyOfPropertySetRelationshipPartRevisionRelationshipSceneItemRelationshipPartInstanceRelationship.class).getType());

        assertTrue(anyOf.isPartRevisionRel());
        PartRevisionRelationship relationship= anyOf.getPartRevisionRel();
        assertNotNull(relationship);
        PartDataRelationshipsPartRevisions data= relationship.getData();
        assertNotNull(data);

        assertEquals(data.getType(), PartDataRelationshipsPartRevisions.TypeEnum.PART_REVISION);
        assertEquals(data.getId(), id);
    }

    @Test
    void serializePartRevisionRelationship() {
        PartRevisionRelationship relationship = new PartRevisionRelationship();

        PartDataRelationshipsPartRevisions data= new PartDataRelationshipsPartRevisions();
        data.setType(PartDataRelationshipsPartRevisions.TypeEnum.PART_REVISION);
        data.setId(id);

        relationship.setData(data);

        AnyOfPropertySetRelationshipPartRevisionRelationshipSceneItemRelationshipPartInstanceRelationship anyOf =
                new AnyOfPropertySetRelationshipPartRevisionRelationshipSceneItemRelationshipPartInstanceRelationship(relationship);

        String expected = "{\"prRel\":{\"data\":{\"type\":\"part-revision\",\"id\":\"" + id.toString() + "\"}}}";

        assertEquals(expected, new JSON().serialize(anyOf));
    }

    @Test
    void deserializeSceneItemRelationship() {
        String input = "{\"siRel\":{\"data\":{\"type\":\"scene-item\",\"id\":\"" + id.toString() + "\"}}}";
        AnyOfPropertySetRelationshipPartRevisionRelationshipSceneItemRelationshipPartInstanceRelationship anyOf = new JSON().deserialize(input, TypeToken.get(AnyOfPropertySetRelationshipPartRevisionRelationshipSceneItemRelationshipPartInstanceRelationship.class).getType());

        assertTrue(anyOf.isSceneItemRel());
        SceneItemRelationship relationship= anyOf.getSceneItemRel();
        assertNotNull(relationship);
        SceneItemRelationshipData data= relationship.getData();
        assertNotNull(data);

        assertEquals(data.getType(), SceneItemRelationshipData.TypeEnum.SCENE_ITEM);
        assertEquals(data.getId(), id);
    }

    @Test
    void serializeSceneItemRelationship() {
        SceneItemRelationship relationship = new SceneItemRelationship();

        SceneItemRelationshipData data= new SceneItemRelationshipData();
        data.setType(SceneItemRelationshipData.TypeEnum.SCENE_ITEM);
        data.setId(id);

        relationship.setData(data);

        AnyOfPropertySetRelationshipPartRevisionRelationshipSceneItemRelationshipPartInstanceRelationship anyOf =
                new AnyOfPropertySetRelationshipPartRevisionRelationshipSceneItemRelationshipPartInstanceRelationship(relationship);

        String expected = "{\"siRel\":{\"data\":{\"type\":\"scene-item\",\"id\":\"" + id.toString() + "\"}}}";

        assertEquals(expected, new JSON().serialize(anyOf));
    }

    @Test
    void deserializePartInstanceRelationship() {
        String input = "{\"piRel\":{\"data\":{\"type\":\"part-instance\",\"id\":\"" + id.toString() + "\"}}}";
        AnyOfPropertySetRelationshipPartRevisionRelationshipSceneItemRelationshipPartInstanceRelationship anyOf = new JSON().deserialize(input, TypeToken.get(AnyOfPropertySetRelationshipPartRevisionRelationshipSceneItemRelationshipPartInstanceRelationship.class).getType());

        assertTrue(anyOf.isPartInstanceRel());
        PartInstanceRelationship relationship= anyOf.getPartInstanceRel();
        assertNotNull(relationship);
        PartInstanceRelationshipData data= relationship.getData();
        assertNotNull(data);

        assertEquals(data.getType(), PartInstanceRelationshipData.TypeEnum.PART_INSTANCE);
        assertEquals(data.getId(), id);    }

    @Test
    void serializePartInstanceRelationship() {
        PartInstanceRelationship relationship = new PartInstanceRelationship();

        PartInstanceRelationshipData data= new PartInstanceRelationshipData();
        data.setType(PartInstanceRelationshipData.TypeEnum.PART_INSTANCE);
        data.setId(id);

        relationship.setData(data);

        AnyOfPropertySetRelationshipPartRevisionRelationshipSceneItemRelationshipPartInstanceRelationship anyOf =
                new AnyOfPropertySetRelationshipPartRevisionRelationshipSceneItemRelationshipPartInstanceRelationship(relationship);

        String expected = "{\"piRel\":{\"data\":{\"type\":\"part-instance\",\"id\":\"" + id.toString() + "\"}}}";

        assertEquals(expected, new JSON().serialize(anyOf));
    }
}
