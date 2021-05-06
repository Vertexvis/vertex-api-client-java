package com.vertexvis.model.serialization;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.vertexvis.model.*;

import java.io.IOException;
import java.util.UUID;
import java.util.function.Supplier;

public class AnyOfQueryByIdQueryByCollectionQueryAllTypeAdapter extends TypeAdapter<AnyOfQueryByIdQueryByCollectionQueryAll> {
    private final Supplier<Gson> gsonSupplier;

    public AnyOfQueryByIdQueryByCollectionQueryAllTypeAdapter(Supplier<Gson> gsonSupplier) {
        this.gsonSupplier = gsonSupplier;
    }

    @Override
    public void write(JsonWriter out, AnyOfQueryByIdQueryByCollectionQueryAll value) throws IOException {
        out.jsonValue(gsonSupplier.get().toJson(value.getQuery()));
    }

    @Override
    public AnyOfQueryByIdQueryByCollectionQueryAll read(JsonReader in) throws IOException {
        throw new UnsupportedOperationException("Deserializing this is currently not supported.");
    }
}
