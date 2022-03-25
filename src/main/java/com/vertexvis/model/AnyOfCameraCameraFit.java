package com.vertexvis.model;

import javax.annotation.Nullable;

public class AnyOfCameraCameraFit {
  private OneOfPerspectiveCameraOrthographicCamera camera;
  private CameraFit cameraFit;

  public AnyOfCameraCameraFit(OneOfPerspectiveCameraOrthographicCamera camera) {
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
  public OneOfPerspectiveCameraOrthographicCamera getCamera() {
    return this.camera;
  }

  @Nullable
  public CameraFit getCameraFit() {
    return this.cameraFit;
  }
}
