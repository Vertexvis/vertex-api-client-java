package com.vertexvis.model.serialization;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.vertexvis.model.AnyOfQueryByIdQueryByCollectionQueryAllQueryByMetadata;

import java.io.IOException;
import java.util.function.Supplier;

public class AnyOfQueryByIdQueryByCollectionQueryAllTypeAdapter
    extends TypeAdapter<AnyOfQueryByIdQueryByCollectionQueryAllQueryByMetadata> {
  private final Supplier<Gson> gsonSupplier;

  public AnyOfQueryByIdQueryByCollectionQueryAllTypeAdapter(Supplier<Gson> gsonSupplier) {
    this.gsonSupplier = gsonSupplier;
  }

  @Override
  public void write(JsonWriter out, AnyOfQueryByIdQueryByCollectionQueryAllQueryByMetadata value)
      throws IOException {
    out.jsonValue(gsonSupplier.get().toJson(value.getQuery()));
  }

  @Override
  public AnyOfQueryByIdQueryByCollectionQueryAllQueryByMetadata read(JsonReader in) throws IOException {
    throw new UnsupportedOperationException("Deserializing this is currently not supported.");
  }
}
