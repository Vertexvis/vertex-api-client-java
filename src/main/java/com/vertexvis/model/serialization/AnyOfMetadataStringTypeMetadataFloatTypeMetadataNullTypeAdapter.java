package com.vertexvis.model.serialization;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.vertexvis.model.AnyOfMetadataStringTypeMetadataFloatTypeMetadataNullType;

import java.io.IOException;
import java.util.function.Supplier;

public class AnyOfMetadataStringTypeMetadataFloatTypeMetadataNullTypeAdapter extends TypeAdapter<AnyOfMetadataStringTypeMetadataFloatTypeMetadataNullType> {

    private final Supplier<Gson> gsonSupplier;

    public AnyOfMetadataStringTypeMetadataFloatTypeMetadataNullTypeAdapter(Supplier<Gson> gsonSupplier) {
        this.gsonSupplier = gsonSupplier;
    }

    @Override
    public void write(JsonWriter out, AnyOfMetadataStringTypeMetadataFloatTypeMetadataNullType value) throws IOException {
        out.jsonValue(gsonSupplier.get().toJson(value.getMetadata()));
    }

    @Override
    public AnyOfMetadataStringTypeMetadataFloatTypeMetadataNullType read(JsonReader in) throws IOException {
        throw new UnsupportedOperationException("Deserializing this is currently not supported.");
    }
}
