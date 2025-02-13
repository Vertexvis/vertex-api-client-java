package com.vertexvis.model;

import com.google.gson.reflect.TypeToken;
import com.vertexvis.JSON;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class AnyOfPropertyStringTypePropertyDoubleTypePropertyLongTypePropertyDateTypeTest {

    @Test
    void deserializePropertyStringType() {
        String input = "{\"stringType\":{\"type\":\"string\",\"value\":\"some-value\"}}";
        AnyOfPropertyStringTypePropertyDoubleTypePropertyLongTypePropertyDateType anyOf=
            new JSON().deserialize(input, TypeToken.get(AnyOfPropertyStringTypePropertyDoubleTypePropertyLongTypePropertyDateType.class).getType());

        assertTrue(anyOf.isPropertyStringType());
        PropertyStringType property= anyOf.getPropertyStringType();
        assertNotNull(property);
        assertEquals(property.getType(), PropertyStringType.TypeEnum.STRING);
        assertEquals(property.getValue(), "some-value");
    }

    @Test
    void serializePropertyStringType() {
        PropertyStringType property = new PropertyStringType();

        property.setType(PropertyStringType.TypeEnum.STRING);
        property.setValue("some-value");

        AnyOfPropertyStringTypePropertyDoubleTypePropertyLongTypePropertyDateType anyOf =
                new AnyOfPropertyStringTypePropertyDoubleTypePropertyLongTypePropertyDateType(property);

        String expected = "{\"stringType\":{\"type\":\"string\",\"value\":\"some-value\"}}";
        assertEquals(expected, new JSON().serialize(anyOf));
    }

    @Test
    void deserializePropertyDoubleType() {
        String input = "{\"doubleType\":{\"type\":\"double\",\"value\":1234.5678}}";
        AnyOfPropertyStringTypePropertyDoubleTypePropertyLongTypePropertyDateType anyOf=
                new JSON().deserialize(input, TypeToken.get(AnyOfPropertyStringTypePropertyDoubleTypePropertyLongTypePropertyDateType.class).getType());

        assertTrue(anyOf.isPropertyDoubleType());
        PropertyDoubleType property= anyOf.getPropertyDoubleType();
        assertNotNull(property);
        assertEquals(property.getType(), PropertyDoubleType.TypeEnum.DOUBLE);
        assertEquals(property.getValue(), 1234.5678);
    }

    @Test
    void serializePropertyDoubleType() {
        PropertyDoubleType property = new PropertyDoubleType();

        property.setType(PropertyDoubleType.TypeEnum.DOUBLE);
        property.setValue(1234.5678);

        AnyOfPropertyStringTypePropertyDoubleTypePropertyLongTypePropertyDateType anyOf =
                new AnyOfPropertyStringTypePropertyDoubleTypePropertyLongTypePropertyDateType(property);

        String expected = "{\"doubleType\":{\"type\":\"double\",\"value\":1234.5678}}";

        assertEquals(expected, new JSON().serialize(anyOf));
    }

    @Test
    void deserializePropertyLongType() {
        String input = "{\"longType\":{\"type\":\"long\",\"value\":1234}}";
        AnyOfPropertyStringTypePropertyDoubleTypePropertyLongTypePropertyDateType anyOf=
                new JSON().deserialize(input, TypeToken.get(AnyOfPropertyStringTypePropertyDoubleTypePropertyLongTypePropertyDateType.class).getType());

        assertTrue(anyOf.isPropertyLongType());
        PropertyLongType property= anyOf.getPropertyLongType();
        assertNotNull(property);
        assertEquals(property.getType(), PropertyLongType.TypeEnum.LONG);
        assertEquals(property.getValue(), 1234L);
    }

    @Test
    void serializePropertyLongType() {
        PropertyLongType property = new PropertyLongType();

        property.setType(PropertyLongType.TypeEnum.LONG);
        property.setValue(1234L);

        AnyOfPropertyStringTypePropertyDoubleTypePropertyLongTypePropertyDateType anyOf =
                new AnyOfPropertyStringTypePropertyDoubleTypePropertyLongTypePropertyDateType(property);

        String expected = "{\"longType\":{\"type\":\"long\",\"value\":1234}}";

        assertEquals(expected, new JSON().serialize(anyOf));
    }

    @Test
    void deserializePropertyDateType() {
        String input = "{\"dateType\":{\"type\":\"date\",\"value\":\"2025-02-13T11:45:10.123-05:00\"}}";
        AnyOfPropertyStringTypePropertyDoubleTypePropertyLongTypePropertyDateType anyOf=
                new JSON().deserialize(input, TypeToken.get(AnyOfPropertyStringTypePropertyDoubleTypePropertyLongTypePropertyDateType.class).getType());

        assertTrue(anyOf.isPropertyDateType());
        PropertyDateType property= anyOf.getPropertyDateType();
        assertNotNull(property);
        assertEquals(property.getType(), PropertyDateType.TypeEnum.DATE);
        assertEquals(property.getValue(), OffsetDateTime.parse("2025-02-13T11:45:10.123-05:00"));
    }

    @Test
    void serializePropertyDateType() {
        PropertyDateType property = new PropertyDateType();

        property.setType(PropertyDateType.TypeEnum.DATE);
        String date= OffsetDateTime.now().toString();
        property.setValue(OffsetDateTime.parse("2025-02-13T11:45:10.123-05:00"));

        AnyOfPropertyStringTypePropertyDoubleTypePropertyLongTypePropertyDateType anyOf =
                new AnyOfPropertyStringTypePropertyDoubleTypePropertyLongTypePropertyDateType(property);

        String expected = "{\"dateType\":{\"type\":\"date\",\"value\":\"2025-02-13T11:45:10.123-05:00\"}}";

        assertEquals(expected, new JSON().serialize(anyOf));
    }
}
