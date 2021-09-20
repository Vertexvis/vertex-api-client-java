package com.vertexvis.model;

import javax.annotation.Nullable;

public class AnyOfCreateSceneItemRequestData {
  private final CreateSceneItemRequestData createSceneItemRequestData;

  public AnyOfCreateSceneItemRequestData(CreateSceneItemRequestData createSceneItemRequestData) {
    this.createSceneItemRequestData = createSceneItemRequestData;
  }

  public Object getObj() {
    return this.createSceneItemRequestData;
  }

  @Nullable
  public CreateSceneItemRequestData getCreateSceneItemRequestData() {
    return this.createSceneItemRequestData;
  }
}
