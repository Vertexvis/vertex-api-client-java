package com.vertexvis.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;
import javax.annotation.Nullable;

public class AnyOfCameraCameraFit {
  private Camera camera;
  private CameraFit cameraFit;

  public AnyOfCameraCameraFit camera(Camera camera) {
    this.camera = camera;
    this.cameraFit = null;
    return this;
  }

  @Nullable
  @SerializedName("camera")
  public Camera getCamera() {
    return this.camera;
  }

  public void setCamera(Camera camera) {
    camera(camera);
  }

  public AnyOfCameraCameraFit cameraFit(CameraFit cameraFit) {
    this.camera = null;
    this.cameraFit = cameraFit;
    return this;
  }

  @Nullable
  @SerializedName("cameraFit")
  public CameraFit getCameraFit() {
    return this.cameraFit;
  }

  public void setCameraFit(CameraFit cameraFit) {
    cameraFit(cameraFit);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnyOfCameraCameraFit that = (AnyOfCameraCameraFit) o;
    return Objects.equals(camera, that.camera) &&
        Objects.equals(cameraFit, that.cameraFit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(camera, cameraFit);
  }

  @Override
  public String toString() {
    return "AnyOfCameraCameraFit{" +
        "camera=" + camera +
        ", cameraFit=" + cameraFit +
        '}';
  }
}