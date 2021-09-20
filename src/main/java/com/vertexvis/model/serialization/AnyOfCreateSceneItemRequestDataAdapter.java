package com.vertexvis.model.serialization;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.vertexvis.model.AnyOfCreateSceneItemRequestData;

import java.io.IOException;
import java.util.function.Supplier;

public class AnyOfCreateSceneItemRequestDataAdapter
    extends TypeAdapter<AnyOfCreateSceneItemRequestData> {
  private final Supplier<Gson> gsonSupplier;

  public AnyOfCreateSceneItemRequestDataAdapter(Supplier<Gson> gsonSupplier) {
    this.gsonSupplier = gsonSupplier;
  }

  @Override
  public void write(JsonWriter out, AnyOfCreateSceneItemRequestData value) throws IOException {
    out.jsonValue(gsonSupplier.get().toJson(value.getObj()));
  }

  @Override
  public AnyOfCreateSceneItemRequestData read(JsonReader in) throws IOException {
    throw new UnsupportedOperationException("Deserializing this is currently not supported.");
  }
}
