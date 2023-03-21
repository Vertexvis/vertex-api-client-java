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
import java.util.Objects;
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
        AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType
                retval = null;

        in.beginObject();

        if (!in.hasNext()) {
            retval =
                    new AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType(
                            new MetadataNullType());
        }

        if (retval == null) {
            if (!Objects.equals(in.nextName(), "value")) {
                throw new UnsupportedOperationException("Missing 'value' field");
            }
        }

        if (retval == null) {
            try {
                var longValue = in.nextLong();
                retval =
                        new AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType(
                                new MetadataLongType().value(longValue));
            }
            catch (Exception ignored) {
            }
        }

        if (retval == null) {
            try {
                var floatValue = in.nextDouble();
                retval =
                        new AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType(
                                new MetadataFloatType().value((float)floatValue));
            }
            catch (Exception ignored) {
            }
        }

        if (retval == null) {
            final var stringValue = in.nextString();
            if (retval == null) {
                try {
                    var dateTimeValue = OffsetDateTime.parse(stringValue);
                    retval =
                            new AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType(
                                    new MetadataDateType().value(dateTimeValue));
                }
                catch (Exception ignored) {
                }
            }

            if (retval == null) {
                retval =
                        new AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType(
                                new MetadataStringType().value(stringValue));
            }
        }

        in.endObject();
        return retval;
    }
}
