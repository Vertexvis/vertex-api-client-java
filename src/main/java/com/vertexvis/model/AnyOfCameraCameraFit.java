package com.vertexvis.model;

import javax.annotation.Nullable;

public class AnyOfCameraCameraFit {
  private Camera camera;
  private CameraFit cameraFit;

  public AnyOfCameraCameraFit(Camera camera) {
    this.camera = camera;
  }

  public AnyOfCameraCameraFit(CameraFit cameraFit) {
    this.cameraFit = cameraFit;
  }

  public Object getCam() {
    if (this.camera != null) {
      return this.camera;
    }
    if (this.cameraFit != null) {
      return this.cameraFit;
    }

    return null;
  }

  @Nullable
  public Camera getCamera() {
    return this.camera;
  }

  @Nullable
  public CameraFit getCameraFit() {
    return this.cameraFit;
  }
}
