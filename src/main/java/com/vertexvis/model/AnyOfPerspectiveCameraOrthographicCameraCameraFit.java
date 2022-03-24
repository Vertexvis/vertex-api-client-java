package com.vertexvis.model;

import javax.annotation.Nullable;

public class AnyOfPerspectiveCameraOrthographicCameraCameraFit {
  private PerspectiveCamera perspectiveCamera;
  private OrthographicCamera orthographicCamera;
  private CameraFit cameraFit;

  public AnyOfPerspectiveCameraOrthographicCameraCameraFit(PerspectiveCamera perspectiveCamera) {
    this.perspectiveCamera = perspectiveCamera;
  }

  public AnyOfPerspectiveCameraOrthographicCameraCameraFit(OrthographicCamera orthographicCamera) {
    this.orthographicCamera = orthographicCamera;
  }

  public AnyOfPerspectiveCameraOrthographicCameraCameraFit(CameraFit cameraFit) {
    this.cameraFit = cameraFit;
  }

  public Object getAnyOfCameraFit() {
    if (orthographicCamera != null) {
      return this.orthographicCamera;
    }
    if (perspectiveCamera != null) {
      return this.perspectiveCamera;
    }

    if (this.cameraFit != null) {
      return this.cameraFit;
    }

    return null;
  }

  @Nullable
  public PerspectiveCamera getPerspectiveCamera() {
    return this.perspectiveCamera;
  }

  @Nullable
  public OrthographicCamera getOrthographicCamera() {
    return this.orthographicCamera;
  }

  @Nullable
  public CameraFit getCameraFit() {
    return this.cameraFit;
  }
}

