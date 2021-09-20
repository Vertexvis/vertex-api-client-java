package com.vertexvis.model.serialization;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.vertexvis.model.AnyOfCameraCameraFit;

import java.io.IOException;
import java.util.function.Supplier;

public class AnyOfCameraCameraFitTypeAdapter extends TypeAdapter<AnyOfCameraCameraFit> {
  private final Supplier<Gson> gsonSupplier;

  public AnyOfCameraCameraFitTypeAdapter(Supplier<Gson> gsonSupplier) {
    this.gsonSupplier = gsonSupplier;
  }

  @Override
  public void write(JsonWriter out, AnyOfCameraCameraFit value) throws IOException {
    out.jsonValue(gsonSupplier.get().toJson(value.getCam()));
  }

  @Override
  public AnyOfCameraCameraFit read(JsonReader in) throws IOException {
    throw new UnsupportedOperationException("Deserializing this is currently not supported.");
  }
}
