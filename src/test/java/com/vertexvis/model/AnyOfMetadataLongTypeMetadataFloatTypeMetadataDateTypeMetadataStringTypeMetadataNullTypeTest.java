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
                        new MetadataFloatType().value(123.456f));

        String expected = "{\"value\":123.456}";
        String observed = new JSON().serialize(md);
        assertEquals(expected, observed);
    }

    @Test
    void deserializeMetadataFloatType() {
        String json = "{\"value\":123.456}";
        var out = deserializeAnyOf(json);

        assertTrue(
                out instanceof AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType);
        var anyOf =
                (AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType) out;
        assertTrue(anyOf.isMetadataFloatType());
        assertEquals(123.456f, Objects.requireNonNull(anyOf.getMetadataFloatType()).getValue());
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
    void deserializeMetadataLongType() {
        String json = "{\"value\":1234567890}";
        var out = deserializeAnyOf(json);

        assertTrue(
                out instanceof AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType);
        var anyOf =
                (AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType) out;
        assertTrue(anyOf.isMetadataLongType());
        assertEquals(1234567890, Objects.requireNonNull(anyOf.getMetadataLongType()).getValue());
    }

    @Test
    void serializeMetadataDateType() {
        var expectedDate = OffsetDateTime.of(2023, 1, 2, 3, 4, 5, 6, ZoneOffset.ofHours(7));
        var md =
                new AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType(
                        new MetadataDateType().value(expectedDate));

        String expected = "{\"value\":\"2023-01-02T03:04:05.000000006+07:00\"}";
        String observed = new JSON().serialize(md);
        assertEquals(expected, observed);
    }

    @Test
    void deserializeMetadataDateType() {
        String json = "{\"value\":\"2023-01-02T03:04:05.000000006+07:00\"}";
        var expectedDate = OffsetDateTime.of(2023, 1, 2, 3, 4, 5, 6, ZoneOffset.ofHours(7));
        var out = deserializeAnyOf(json);

        assertTrue(
                out instanceof AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType);
        var anyOf =
                (AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType) out;
        assertTrue(anyOf.isMetadataDateType());
        assertEquals(expectedDate, Objects.requireNonNull(anyOf.getMetadataDateType()).getValue());
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
    void deserializeMetadataStringType() {
        String json = "{\"value\":\"Hello world\"}";
        var out = deserializeAnyOf(json);

        assertTrue(
                out instanceof AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType);
        var anyOf =
                (AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType) out;
        assertTrue(anyOf.isMetadataStringType());
        assertEquals("Hello world",
                Objects.requireNonNull(anyOf.getMetadataStringType()).getValue());
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

    @Test
    void deserializeMetadataNullType() {
        String json = "{}";
        var out = deserializeAnyOf(json);

        assertTrue(
                out instanceof AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType);
        var anyOf =
                (AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType) out;
        assertTrue(anyOf.isMetadataNullType());
    }

    @Test
    void deserializeFails() {
        String json = "{ number: 1 }";
        assertThrows(UnsupportedOperationException.class, () -> deserializeAnyOf(json));
    }

    private static Object deserializeAnyOf(String json) {
        return new JSON().deserialize(json,
                AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType.class);
    }
}