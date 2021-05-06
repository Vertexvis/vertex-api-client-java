package com.vertexvis.model;

import com.vertexvis.JSON;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.UUID;

import static com.vertexvis.model.CameraFit.TypeEnum.FIT_VISIBLE_SCENE_ITEMS;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OneOfHitResultDataSceneItemDataPartRevisionDataTest {

    @Test
    void serializesHitResultData() {
        UUID id = UUID.randomUUID();
        OneOfHitResultDataSceneItemDataPartRevisionData d =
                new OneOfHitResultDataSceneItemDataPartRevisionData(new HitResultData().type("some-type").id(id));

        String expected = "{\"type\":\"some-type\",\"id\":\"" + id + "\"}";

        assertEquals(expected, new JSON().serialize(d));
    }

    @Test
    void serializesSceneItemData() {
        UUID id = UUID.randomUUID();
        OneOfHitResultDataSceneItemDataPartRevisionData d =
                new OneOfHitResultDataSceneItemDataPartRevisionData(new SceneItemData().id(id).type("scene-item"));

        String expected = "{\"type\":\"scene-item\",\"id\":\"" + id + "\"}";

        assertEquals(expected, new JSON().serialize(d));
    }

    @Test
    void serializesPartRevisionData() {
        UUID id = UUID.randomUUID();
        OneOfHitResultDataSceneItemDataPartRevisionData d =
                new OneOfHitResultDataSceneItemDataPartRevisionData(new PartRevisionData().id(id).type("part-revision"));

        String expected = "{\"type\":\"part-revision\",\"id\":\"" + id + "\"}";

        assertEquals(expected, new JSON().serialize(d));
    }
}


