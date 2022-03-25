package com.vertexvis.model.serialization;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.vertexvis.model.*;

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
    Camera camera = gsonSupplier.get().fromJson(in, TypeToken.get(Camera.class).getType());

    OneOfPerspectiveCameraOrthographicCamera oneOfCamera = null;
    switch (camera.getType()) {
      case "perspective":
        oneOfCamera = new OneOfPerspectiveCameraOrthographicCamera(
          new PerspectiveCamera()
                  .type(camera.getType())
                  .position(camera.getPosition())
                  .lookAt(camera.getLookAt())
                  .up(camera.getUp())
        );
        break;
      case "orthographic":
        oneOfCamera = new OneOfPerspectiveCameraOrthographicCamera(
          new OrthographicCamera()
            .type(camera.getType())
            .viewVector(camera.getViewVector())
            .lookAt(camera.getLookAt())
            .up(camera.getUp())
            .fovHeight(camera.getFovHeight())
        );
        break;
    }
    return oneOfCamera;
  }
}
