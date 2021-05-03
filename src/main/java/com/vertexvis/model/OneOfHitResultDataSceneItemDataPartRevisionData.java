package com.vertexvis.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;
import javax.annotation.Nullable;

public class OneOfHitResultDataSceneItemDataPartRevisionData {
  private HitResultData hitResultData;
  private SceneItemData sceneItemData;
  private PartRevisionData partRevisionData;

  public OneOfHitResultDataSceneItemDataPartRevisionData hitResultData(
      HitResultData hitResultData) {
    this.hitResultData = hitResultData;
    this.sceneItemData = null;
    this.partRevisionData = null;
    return this;
  }

  @Nullable
  @SerializedName("hitResultData")
  public HitResultData getHitResultData() {
    return this.hitResultData;
  }

  public void setHitResultData(HitResultData hitResultData) {
    hitResultData(hitResultData);
  }

  public OneOfHitResultDataSceneItemDataPartRevisionData sceneItemData(
      SceneItemData sceneItemData) {
    this.hitResultData = null;
    this.sceneItemData = sceneItemData;
    this.partRevisionData = null;
    return this;
  }

  @Nullable
  @SerializedName("sceneItemData")
  public SceneItemData getSceneItemData() {
    return this.sceneItemData;
  }

  public void setSceneItemData(SceneItemData sceneItemData) {
    sceneItemData(sceneItemData);
  }

  public OneOfHitResultDataSceneItemDataPartRevisionData partRevisionData(
      PartRevisionData partRevisionData) {
    this.hitResultData = null;
    this.sceneItemData = null;
    this.partRevisionData = partRevisionData;
    return this;
  }

  @Nullable
  @SerializedName("partRevisionData")
  public PartRevisionData getPartRevisionData() {
    return this.partRevisionData;
  }

  public void setPartRevisionData(PartRevisionData partRevisionData) {
    partRevisionData(partRevisionData);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OneOfHitResultDataSceneItemDataPartRevisionData that =
        (OneOfHitResultDataSceneItemDataPartRevisionData) o;
    return Objects.equals(hitResultData, that.hitResultData) &&
        Objects.equals(sceneItemData, that.sceneItemData) &&
        Objects.equals(partRevisionData, that.partRevisionData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hitResultData, sceneItemData, partRevisionData);
  }

  @Override
  public String toString() {
    return "OneOfHitResultDataSceneItemDataPartRevisionData{" +
        "hitResultData=" + hitResultData +
        ", sceneItemData=" + sceneItemData +
        ", partRevisionData=" + partRevisionData +
        '}';
  }
}