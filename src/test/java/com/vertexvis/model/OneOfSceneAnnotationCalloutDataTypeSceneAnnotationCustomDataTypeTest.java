package com.vertexvis.model;

import com.google.gson.reflect.TypeToken;
import com.vertexvis.JSON;
import io.swagger.annotations.ApiModelProperty;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class OneOfSceneAnnotationCalloutDataTypeSceneAnnotationCustomDataTypeTest {

    @Test
    void deserializeSceneAnnotationCalloutDataType() {
        String input = "{\"calloutType\":{\"type\":\"callout\",\"position\":{\"x\":1,\"y\":2,\"z\":3},\"icon\":\"comment-show\",\"primaryColor\":\"#FFFF00\",\"accentColor\":\"#FF00FF\"}}";
        OneOfSceneAnnotationCalloutDataTypeSceneAnnotationCustomDataType oneOf=
                new JSON().deserialize(input, TypeToken.get(OneOfSceneAnnotationCalloutDataTypeSceneAnnotationCustomDataType.class).getType());

        SceneAnnotationCalloutDataType annotation= oneOf.getSceneAnnotationCalloutDataType();
        assertNotNull(annotation);
        assertEquals(annotation.getType(), "callout");
        Vector3 position= new Vector3();
        position.setX(new BigDecimal(1.0));
        position.setY(new BigDecimal(2.0));
        position.setZ(new BigDecimal(3.0));
        assertEquals(annotation.getPosition(), position);
        assertEquals(annotation.getIcon(), "comment-show");
        assertEquals(annotation.getPrimaryColor(),"#FFFF00");
        assertEquals(annotation.getAccentColor(), "#FF00FF");
    }

    @Test
    void serializeSceneAnnotationCalloutDataType() {
        SceneAnnotationCalloutDataType annotation = new SceneAnnotationCalloutDataType();

        annotation.setType("callout");
        Vector3 position= new Vector3();
        position.setX(new BigDecimal(1.0));
        position.setY(new BigDecimal(2.0));
        position.setZ(new BigDecimal(3.0));
        annotation.setPosition(position);
        annotation.setIcon("comment-show");
        annotation.setPrimaryColor("#FFFF00");
        annotation.setAccentColor("#FF00FF");

        OneOfSceneAnnotationCalloutDataTypeSceneAnnotationCustomDataType oneOf =
                new OneOfSceneAnnotationCalloutDataTypeSceneAnnotationCustomDataType(annotation);

        String expected = "{\"calloutType\":{\"type\":\"callout\",\"position\":{\"x\":1,\"y\":2,\"z\":3},\"icon\":\"comment-show\",\"primaryColor\":\"#FFFF00\",\"accentColor\":\"#FF00FF\"}}";

        assertEquals(expected, new JSON().serialize(oneOf));
    }

    @Test
    void deserializeSceneAnnotationCustomDataType() {
        String input = "{\"customType\":{\"type\":\"custom\",\"jsonType\":\"my-annotation-type\",\"json\":\"{\\\"label\\\":\\\"my annotation\\\",\\\"anchor\\\":{\\\"x\\\":0,\\\"y\\\":0,\\\"z\\\":0}}\"}}";
        OneOfSceneAnnotationCalloutDataTypeSceneAnnotationCustomDataType oneOf =
                new JSON().deserialize(input, TypeToken.get(OneOfSceneAnnotationCalloutDataTypeSceneAnnotationCustomDataType.class).getType());

        SceneAnnotationCustomDataType annotation= oneOf.getSceneAnnotationCustomDataType();
        assertNotNull(annotation);
        assertEquals(annotation.getType(), "custom");
        assertEquals(annotation.getJsonType(), "my-annotation-type");
        assertEquals(annotation.getJson(), "{\"label\":\"my annotation\",\"anchor\":{\"x\":0,\"y\":0,\"z\":0}}");
    }

    @Test
    void serializeSceneAnnotationCustomDataType() {
        SceneAnnotationCustomDataType annotation = new SceneAnnotationCustomDataType();

        annotation.setType("custom");
        annotation.setJsonType("my-annotation-type");
        annotation.setJson("{\"label\":\"my annotation\",\"anchor\":{\"x\":0,\"y\":0,\"z\":0}}");

        OneOfSceneAnnotationCalloutDataTypeSceneAnnotationCustomDataType oneOf =
                new OneOfSceneAnnotationCalloutDataTypeSceneAnnotationCustomDataType(annotation);

        String expected = "{\"customType\":{\"type\":\"custom\",\"jsonType\":\"my-annotation-type\",\"json\":\"{\\\"label\\\":\\\"my annotation\\\",\\\"anchor\\\":{\\\"x\\\":0,\\\"y\\\":0,\\\"z\\\":0}}\"}}";

        assertEquals(expected, new JSON().serialize(oneOf));
    }

}
