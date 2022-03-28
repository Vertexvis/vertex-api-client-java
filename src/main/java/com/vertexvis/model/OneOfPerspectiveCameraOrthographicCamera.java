package com.vertexvis.model;

import javax.annotation.Nullable;

public class OneOfPerspectiveCameraOrthographicCamera {
  private PerspectiveCamera perspectiveCamera;
  private OrthographicCamera orthographicCamera;

  public OneOfPerspectiveCameraOrthographicCamera(PerspectiveCamera perspectiveCamera) {
    this.perspectiveCamera = perspectiveCamera;
  }

  public OneOfPerspectiveCameraOrthographicCamera() {}

  public OneOfPerspectiveCameraOrthographicCamera(OrthographicCamera orthographicCamera) {
    this.orthographicCamera = orthographicCamera;
  }

  public Object getData() {
    if (this.perspectiveCamera != null) {
      return this.perspectiveCamera;
    }
    if (this.orthographicCamera != null) {
      return this.orthographicCamera;
    }

    return null;
  }

  @Nullable
  public OrthographicCamera getOrthographicCamera() {
    return this.orthographicCamera;
  }

  @Nullable
  public PerspectiveCamera getPerspectiveCamera() {
    return this.perspectiveCamera;
  }
}

