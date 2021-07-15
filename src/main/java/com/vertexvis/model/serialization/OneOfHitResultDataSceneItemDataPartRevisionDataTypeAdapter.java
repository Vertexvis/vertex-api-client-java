package com.vertexvis.model.serialization;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.vertexvis.model.OneOfHitResultDataSceneItemDataPartRevisionData;

import java.io.IOException;
import java.util.function.Supplier;

public class OneOfHitResultDataSceneItemDataPartRevisionDataTypeAdapter
    extends TypeAdapter<OneOfHitResultDataSceneItemDataPartRevisionData> {
  private final Supplier<Gson> gsonSupplier;

  public OneOfHitResultDataSceneItemDataPartRevisionDataTypeAdapter(Supplier<Gson> gsonSupplier) {
    this.gsonSupplier = gsonSupplier;
  }

  @Override
  public void write(JsonWriter out, OneOfHitResultDataSceneItemDataPartRevisionData value)
      throws IOException {
    out.jsonValue(gsonSupplier.get().toJson(value.getData()));
  }

  @Override
  public OneOfHitResultDataSceneItemDataPartRevisionData read(JsonReader in) throws IOException {
    throw new UnsupportedOperationException("Deserializing this is currently not supported.");
  }
}
