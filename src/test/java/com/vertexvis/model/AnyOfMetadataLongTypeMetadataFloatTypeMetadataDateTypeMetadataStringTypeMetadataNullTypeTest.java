package com.vertexvis.model;

import com.vertexvis.JSON;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

import static org.junit.jupiter.api.Assertions.*;

class AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullTypeTest {

    @Test
    void serializeMetadataFloatType() {
        var md =
                new AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType(
                        new MetadataFloatType().value(123.456f));

        String expected = "{\"value\":123.456}";
        String observed = new JSON().serialize(md);
        assertEquals(expected, observed);
    }

    @Test
    void serializeMetadataLongType() {
        var md =
                new AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType(
                        new MetadataLongType().value(1234567890L));

        String expected = "{\"value\":1234567890}";
        String observed = new JSON().serialize(md);
        assertEquals(expected, observed);
    }

    @Test
    void serializeMetadataDateType() {
        var md =
                new AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType(
                        new MetadataDateType().value(OffsetDateTime.of(2023,1,2,3,4,5,6,
                                ZoneOffset.ofHours(7))));

        String expected = "{\"value\":\"2023-01-02T03:04:05.000000006+07:00\"}";
        String observed = new JSON().serialize(md);
        assertEquals(expected, observed);
    }

    @Test
    void serializeMetadataStringType() {
        var md =
                new AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType(
                        new MetadataStringType().value("Hello world"));

        String expected = "{\"value\":\"Hello world\"}";
        String observed = new JSON().serialize(md);
        assertEquals(expected, observed);
    }

    @Test
    void serializeMetadataNullType() {
        var md =
                new AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType(
                        new MetadataNullType());

        String expected = "{}";
        String observed = new JSON().serialize(md);
        assertEquals(expected, observed);
    }

}