package com.vertexvis.model;

import javax.annotation.Nullable;

public class OneOfHitResultDataSceneItemDataPartRevisionData {
  private HitResultData hitResultData;
  private SceneItemData sceneItemData;
  private PartRevisionData partRevisionData;

  public OneOfHitResultDataSceneItemDataPartRevisionData(HitResultData hitResultData) {
    this.hitResultData = hitResultData;
  }

  public OneOfHitResultDataSceneItemDataPartRevisionData(SceneItemData sceneItemData) {
    this.sceneItemData = sceneItemData;
  }

  public OneOfHitResultDataSceneItemDataPartRevisionData(PartRevisionData partRevisionData) {
    this.partRevisionData = partRevisionData;
  }

  public Object getData() {
    if (this.hitResultData != null) return this.hitResultData;
    if (this.partRevisionData != null) return this.partRevisionData;
    if (this.sceneItemData != null) return this.sceneItemData;

    return null;
  }

  @Nullable
  public HitResultData getHitResultData() {
    return this.hitResultData;
  }

  @Nullable
  public SceneItemData getSceneItemData() {
    return this.sceneItemData;
  }

  @Nullable
  public PartRevisionData getPartRevisionData() {
    return this.partRevisionData;
  }
}
