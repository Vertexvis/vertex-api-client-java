package com.vertexvis.model.serialization;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.vertexvis.model.AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType;
import com.vertexvis.model.MetadataDateType;
import com.vertexvis.model.MetadataFloatType;
import com.vertexvis.model.MetadataLongType;
import com.vertexvis.model.MetadataNullType;
import com.vertexvis.model.MetadataStringType;

import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.function.Supplier;

public class AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullTypeAdapter
        extends
        TypeAdapter<AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType> {

    private final Supplier<Gson> gsonSupplier;

    public AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullTypeAdapter(
            Supplier<Gson> gsonSupplier) {
        this.gsonSupplier = gsonSupplier;
    }

    @Override
    public void write(JsonWriter out,
                      AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType value)
            throws IOException {
        out.jsonValue(gsonSupplier.get().toJson(value.getValue()));
    }

    @Override
    public AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType read(
            JsonReader in) throws IOException {
        in.beginObject();

        String stringValue = null;
        Double doubleValue = null;
        String typeValue = null;
        while (in.hasNext() && ((stringValue == null && doubleValue == null)
                || typeValue == null)) {
            var name = in.nextName();
            if (name.equals("type")) {
                typeValue = in.nextString();
            }
            else if (name.equals("value")) {
                var token = in.peek();
                switch (token) {
                    case NUMBER:
                        doubleValue = in.nextDouble();
                        break;
                    case STRING:
                        stringValue = in.nextString();
                        break;
                    default:
                        throw new UnsupportedOperationException("Unexpected token");
                }
            }
            else {
                in.skipValue();
            }
        }

        if (typeValue == null || (stringValue == null && doubleValue == null && !typeValue.equals(
                "null"))) {
            throw new UnsupportedOperationException("Missing fields");
        }

        AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType
                retval = null;

        // The type field always wins in case of ambiguity.
        switch (typeValue) {
            case "null":
                if (!(stringValue == null && doubleValue == null)) {
                    throw new UnsupportedOperationException("Value type mismatch");
                }

                retval =
                        new AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType(
                                new MetadataNullType());
                break;
            case "long":
                Long longValue = null;
                if (doubleValue != null) {
                    var casted = doubleValue.longValue();
                    if (((double) casted) != doubleValue) {
                        throw new UnsupportedOperationException("Value type mismatch");
                    }
                    longValue = casted;
                }
                else {
                    try {
                        longValue = Long.parseLong(stringValue);
                    }
                    catch (Exception ignored) {
                        throw new UnsupportedOperationException("Value type mismatch");
                    }
                }

                retval =
                        new AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType(
                                new MetadataLongType().value(longValue));
                break;
            case "float":
                Float floatValue = null;
                if (doubleValue != null) {
                    floatValue = doubleValue.floatValue();
                }
                else {
                    try {
                        floatValue = Float.parseFloat(stringValue);
                    }
                    catch (Exception ignored) {
                        throw new UnsupportedOperationException("Value type mismatch");
                    }
                }

                retval =
                        new AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType(
                                new MetadataFloatType().value(floatValue));
                break;
            case "date":
                OffsetDateTime dateTimeValue = null;
                if (stringValue != null) {
                    try {
                        dateTimeValue = OffsetDateTime.parse(stringValue);
                    }
                    catch (Exception ignored) {
                        throw new UnsupportedOperationException("Value type mismatch");
                    }
                }
                else {
                    throw new UnsupportedOperationException("Value type mismatch");
                }

                retval =
                        new AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType(
                                new MetadataDateType().value(dateTimeValue));
                break;
            case "string":
                retval =
                        new AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType(
                                new MetadataStringType().value(stringValue));
                break;
            default:
                throw new UnsupportedOperationException("Unknown metadata type");
        }

        in.endObject();

        return retval;
    }
}
