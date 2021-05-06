package com.vertexvis.model;

import com.vertexvis.JSON;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.UUID;

import static com.vertexvis.model.CameraFit.TypeEnum.FIT_VISIBLE_SCENE_ITEMS;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnyOfCameraCameraFitTest {

    @Test
    void serializesCamera() {
        AnyOfCameraCameraFit c =
                new AnyOfCameraCameraFit(new Camera().lookAt(new Vector3().x(new BigDecimal(2)).y(new BigDecimal(4)).z(new BigDecimal(6))));

        String expected = "{\"lookAt\":{\"x\":2,\"y\":4,\"z\":6}}";

        assertEquals(expected, new JSON().serialize(c));
    }

    @Test
    void serializesCameraFit() {
        AnyOfCameraCameraFit c =
                new AnyOfCameraCameraFit(new CameraFit().type(FIT_VISIBLE_SCENE_ITEMS));

        String expected = "{\"type\":\"fit-visible-scene-items\"}";

        assertEquals(expected, new JSON().serialize(c));
    }
}


