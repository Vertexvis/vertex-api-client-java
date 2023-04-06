package com.vertexvis.model;

import com.vertexvis.JSON;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullTypeTest {

    @Test
    void serializeMetadataFloatType() {
        var md =
                new AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType(
                        new MetadataFloatType().type("float").value(123.456f));

        String expected = "{\"type\":\"float\",\"value\":123.456}";
        String observed = new JSON().serialize(md);
        assertEquals(expected, observed);
    }

    @Test
    void deserializeMetadataFloatType() {
        String json = "{\"type\":\"float\",\"value\":123.456}";
        var out = deserializeAnyOf(json);

        assertTrue(
                out instanceof AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType);
        var anyOf =
                (AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType) out;
        assertTrue(anyOf.isMetadataFloatType());
        assertEquals(123.456f, Objects.requireNonNull(anyOf.getMetadataFloatType()).getValue());
        assertEquals("float",
                Objects.requireNonNull(anyOf.getMetadataFloatType()).getType());
    }

    @Test
    void serializeMetadataLongType() {
        var md =
                new AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType(
                        new MetadataLongType().type("long").value(1234567890L));

        String expected = "{\"type\":\"long\",\"value\":1234567890}";
        String observed = new JSON().serialize(md);
        assertEquals(expected, observed);
    }

    @Test
    void deserializeMetadataLongType() {
        String json = "{\"type\":\"long\",\"value\":1234567890}";
        var out = deserializeAnyOf(json);

        assertTrue(
                out instanceof AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType);
        var anyOf =
                (AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType) out;
        assertTrue(anyOf.isMetadataLongType());
        assertEquals(1234567890, Objects.requireNonNull(anyOf.getMetadataLongType()).getValue());
        assertEquals("long",
                Objects.requireNonNull(anyOf.getMetadataLongType()).getType());
    }

    @Test
    void serializeMetadataDateType() {
        var expectedDate = OffsetDateTime.of(2023, 1, 2, 3, 4, 5, 6, ZoneOffset.ofHours(7));
        var md =
                new AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType(
                        new MetadataDateType().type("date").value(expectedDate));

        String expected = "{\"type\":\"date\",\"value\":\"2023-01-02T03:04:05.000000006+07:00\"}";
        String observed = new JSON().serialize(md);
        assertEquals(expected, observed);
    }

    @Test
    void deserializeMetadataDateType() {
        String json = "{\"type\":\"date\",\"value\":\"2023-01-02T03:04:05.000000006+07:00\"}";
        var expectedDate = OffsetDateTime.of(2023, 1, 2, 3, 4, 5, 6, ZoneOffset.ofHours(7));
        var out = deserializeAnyOf(json);

        assertTrue(
                out instanceof AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType);
        var anyOf =
                (AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType) out;
        assertTrue(anyOf.isMetadataDateType());
        assertEquals(expectedDate, Objects.requireNonNull(anyOf.getMetadataDateType()).getValue());
        assertEquals("date",
                Objects.requireNonNull(anyOf.getMetadataDateType()).getType());
    }

    @Test
    void serializeMetadataStringType() {
        var md =
                new AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType(
                        new MetadataStringType().type("string").value("Hello world"));

        String expected = "{\"type\":\"string\",\"value\":\"Hello world\"}";
        String observed = new JSON().serialize(md);
        assertEquals(expected, observed);
    }

    @Test
    void deserializeMetadataStringType() {
        String json = "{\"type\":\"string\",\"value\":\"Hello world\"}";
        var out = deserializeAnyOf(json);

        assertTrue(
                out instanceof AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType);
        var anyOf =
                (AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType) out;
        assertTrue(anyOf.isMetadataStringType());
        assertEquals("Hello world",
                Objects.requireNonNull(anyOf.getMetadataStringType()).getValue());
        assertEquals("string",
                Objects.requireNonNull(anyOf.getMetadataStringType()).getType());
    }

    @Test
    void serializeMetadataNullType() {
        var md =
                new AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType(
                        new MetadataNullType().type("null"));

        String expected = "{\"type\":\"null\"}";
        String observed = new JSON().serialize(md);
        assertEquals(expected, observed);
    }

    @Test
    void deserializeMetadataNullType() {
        String json = "{\"type\":\"null\"}";
        var out = deserializeAnyOf(json);

        assertTrue(
                out instanceof AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType);
        var anyOf =
                (AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType) out;
        assertTrue(anyOf.isMetadataNullType());
    }

    @Test
    void deserializeFails() {
        String json = "{\"type\":\"long\",\"value\":1234.567890}";
        assertThrows(UnsupportedOperationException.class, () -> deserializeAnyOf(json));
        String json2 = "{\"type\":\"date\",\"value\":1234.567890}";
        assertThrows(UnsupportedOperationException.class, () -> deserializeAnyOf(json2));
        String json3 = "{\"type\":\"null\",\"value\":1234.567890}";
        assertThrows(UnsupportedOperationException.class, () -> deserializeAnyOf(json3));
    }

    @Test
    void serializeUpdateSceneItemRequestDataAttributes() {
        var md =
                new AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType(
                        new MetadataStringType().type("string").value("Hello world"));
        var map = new UpdateSceneItemRequestDataAttributes().putMetadataItem("key", md);
        String observed = new JSON().serialize(map);
        String expected = "{\"metadata\":{\"key\":{\"type\":\"string\",\"value\":\"Hello world\"}}}";
        assertEquals(expected, observed);
    }


    private static Object deserializeAnyOf(String json) {
        return new JSON().deserialize(json,
                AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType.class);
    }
}