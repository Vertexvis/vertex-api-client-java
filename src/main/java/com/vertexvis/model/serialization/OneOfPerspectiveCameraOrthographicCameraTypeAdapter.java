package com.vertexvis.model.serialization;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.vertexvis.model.OneOfPerspectiveCameraOrthographicCamera;

import java.io.IOException;
import java.util.function.Supplier;

public class OneOfPerspectiveCameraOrthographicCameraTypeAdapter  extends TypeAdapter<OneOfPerspectiveCameraOrthographicCamera> {
  private final Supplier<Gson> gsonSupplier;
  public OneOfPerspectiveCameraOrthographicCameraTypeAdapter(Supplier<Gson> gsonSupplier) {
    this.gsonSupplier = gsonSupplier;
  }

  @Override
  public void write(JsonWriter out, OneOfPerspectiveCameraOrthographicCamera value)
      throws IOException {
    out.jsonValue(gsonSupplier.get().toJson(value.getData()));
  }

  @Override
  public OneOfPerspectiveCameraOrthographicCamera read(JsonReader in) throws IOException {
    throw new UnsupportedOperationException("Deserializing this is currently not supported.");
  }
}
