package com.vertexvis.model;

import com.vertexvis.JSON;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AnyOfPerspectiveCameraOrthographicCameraTest {

    @Test
    void testSerializeSceneRequestWithCamera() {
        CreateSceneRequest request = new CreateSceneRequest();

        Orientation worldOrientation = new Orientation();
        Vector3 up = new Vector3().x(BigDecimal.valueOf(1)).y(BigDecimal.valueOf(0)).z(BigDecimal.valueOf(0));
        Vector3 front = new Vector3().x(BigDecimal.valueOf(2)).y(BigDecimal.valueOf(1)).z(BigDecimal.valueOf(0));
        worldOrientation.setUp(up);
        worldOrientation.setFront(front);

        CreateSceneRequestData data = new CreateSceneRequestData();
        CreateSceneRequestDataAttributes attributes = new CreateSceneRequestDataAttributes();
        attributes.setTreeEnabled(true);
        attributes.setName("My name");
        attributes.setWorldOrientation(worldOrientation);
        data = data.attributes(attributes);

        data.setType("scene");
        request = request.data(data);


        String expected = "{\"data\":{\"type\":\"scene\",\"attributes\":{\"name\":\"My name\",\"treeEnabled\":true,\"worldOrientation\":{\"up\":{\"x\":1,\"y\":0,\"z\":0},\"front\":{\"x\":2,\"y\":1,\"z\":0}}}}}";
        assertEquals(expected, new JSON().serialize(request));
    }

    @Test
    void testingUpdateSceneRequestShouldAllowNotSpecifyingTheCamera() {
        String name = "Updated Name";

        UpdateSceneRequest request = new UpdateSceneRequest().data(new UpdateSceneRequestData()
            .type("scene")
            .attributes(
                new UpdateSceneRequestDataAttributes()
                    .name(name)
            )
        );

        String expected = String.format("{\"data\":{\"type\":\"scene\",\"attributes\":{\"name\":\"%s\"}}}", name);
        assertEquals(expected, new JSON().serialize(request));
    }
}
