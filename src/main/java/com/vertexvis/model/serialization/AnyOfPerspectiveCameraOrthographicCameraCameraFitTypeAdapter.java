package com.vertexvis.model.serialization;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.vertexvis.model.AnyOfPerspectiveCameraOrthographicCameraCameraFit;

import java.io.IOException;
import java.util.function.Supplier;

public class AnyOfPerspectiveCameraOrthographicCameraCameraFitTypeAdapter extends TypeAdapter<AnyOfPerspectiveCameraOrthographicCameraCameraFit> {
  private final Supplier<Gson> gsonSupplier;

  public AnyOfPerspectiveCameraOrthographicCameraCameraFitTypeAdapter(Supplier<Gson> gsonSupplier) {
    this.gsonSupplier = gsonSupplier;
  }

  @Override
  public void write(JsonWriter out, AnyOfPerspectiveCameraOrthographicCameraCameraFit value) throws IOException {
    out.jsonValue(gsonSupplier.get().toJson(value.getAnyOfCameraFit()));
  }

  @Override
  public AnyOfPerspectiveCameraOrthographicCameraCameraFit read(JsonReader in) throws IOException {
    throw new UnsupportedOperationException("Deserializing this is currently not supported.");
  }
}

