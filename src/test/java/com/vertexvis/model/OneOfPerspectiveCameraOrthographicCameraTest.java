package com.vertexvis.model;

import org.junit.jupiter.api.Test;
import com.google.gson.reflect.TypeToken;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.vertexvis.JSON;

public class OneOfPerspectiveCameraOrthographicCameraTest {

    @Test
    void deserializeOrthographicCamera() {
        String input = "{\"camera\":{\"type\":\"orthographic\",\"viewVector\":{\"x\":373.0473327636719,\"y\":-27.94504737854004,\"z\":-111.1329345703125},\"lookAt\":{\"x\":751.756103515625,\"y\":302.235595703125,\"z\":218.3965301513672},\"up\":{\"x\":-0.61683189868927,\"y\":0.6955335140228271,\"z\":-0.3684447407722473},\"fovHeight\":781.2822875976562}}";
        SceneViewStateDataAttributes dataAttributes = new JSON().deserialize(input, TypeToken.get(SceneViewStateDataAttributes.class).getType());

        assertNotNull(dataAttributes.getCamera().getOrthographicCamera());
        assertEquals(781.2822875976562, dataAttributes.getCamera().getOrthographicCamera().getFovHeight().doubleValue());

        assertEquals(dataAttributes.getCamera().getOrthographicCamera().getType(), "orthographic");
        assertNotNull(dataAttributes.getCamera().getOrthographicCamera().getViewVector());
        assertNotNull(dataAttributes.getCamera().getOrthographicCamera().getUp());
        assertNotNull(dataAttributes.getCamera().getOrthographicCamera().getLookAt());
    }

    @Test
    void deserializePerspectiveCamera() {
        String input = "{\"camera\":{\"type\":\"perspective\",\"position\":{\"x\":373.0473327636719,\"y\":-27.94504737854004,\"z\":-111.1329345703125},\"lookAt\":{\"x\":751.756103515625,\"y\":302.235595703125,\"z\":218.3965301513672},\"up\":{\"x\":-0.61683189868927,\"y\":0.6955335140228271,\"z\":-0.3684447407722473}}}";
        SceneViewStateDataAttributes dataAttributes = new JSON().deserialize(input, TypeToken.get(SceneViewStateDataAttributes.class).getType());

        assertNotNull(dataAttributes.getCamera().getPerspectiveCamera());

        assertEquals(dataAttributes.getCamera().getPerspectiveCamera().getType(), "perspective");
        assertNotNull(dataAttributes.getCamera().getPerspectiveCamera().getPosition());
        assertNotNull(dataAttributes.getCamera().getPerspectiveCamera().getUp());
        assertNotNull(dataAttributes.getCamera().getPerspectiveCamera().getLookAt());
    }
}
