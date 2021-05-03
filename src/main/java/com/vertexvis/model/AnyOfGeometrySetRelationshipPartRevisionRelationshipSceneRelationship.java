package com.vertexvis.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;
import javax.annotation.Nullable;

public class AnyOfGeometrySetRelationshipPartRevisionRelationshipSceneRelationship {
  private GeometrySetRelationship geometrySetRelationship;
  private PartRevisionRelationship partRevisionRelationship;
  private SceneRelationship sceneRelationship;

  public AnyOfGeometrySetRelationshipPartRevisionRelationshipSceneRelationship geometrySetRelationship(
      GeometrySetRelationship geometrySetRelationship) {
    this.geometrySetRelationship = geometrySetRelationship;
    this.partRevisionRelationship = null;
    this.sceneRelationship = null;
    return this;
  }

  @Nullable
  @SerializedName("geometrySetRelationship")
  public GeometrySetRelationship getGeometrySetRelationship() {
    return this.geometrySetRelationship;
  }

  public void setGeometrySetRelationship(GeometrySetRelationship geometrySetRelationship) {
    geometrySetRelationship(geometrySetRelationship);
  }

  public AnyOfGeometrySetRelationshipPartRevisionRelationshipSceneRelationship partRevisionRelationship(
      PartRevisionRelationship partRevisionRelationship) {
    this.geometrySetRelationship = null;
    this.partRevisionRelationship = partRevisionRelationship;
    this.sceneRelationship = null;
    return this;
  }

  @Nullable
  @SerializedName("partRevisionRelationship")
  public PartRevisionRelationship getPartRevisionRelationship() {
    return this.partRevisionRelationship;
  }

  public void setPartRevisionRelationship(PartRevisionRelationship partRevisionRelationship) {
    partRevisionRelationship(partRevisionRelationship);
  }

  public AnyOfGeometrySetRelationshipPartRevisionRelationshipSceneRelationship sceneRelationship(
      SceneRelationship sceneRelationship) {
    this.geometrySetRelationship = null;
    this.partRevisionRelationship = null;
    this.sceneRelationship = sceneRelationship;
    return this;
  }

  @Nullable
  @SerializedName("sceneRelationship")
  public SceneRelationship getSceneRelationship() {
    return this.sceneRelationship;
  }

  public void setSceneRelationship(SceneRelationship sceneRelationship) {
    sceneRelationship(sceneRelationship);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnyOfGeometrySetRelationshipPartRevisionRelationshipSceneRelationship that =
        (AnyOfGeometrySetRelationshipPartRevisionRelationshipSceneRelationship) o;
    return Objects.equals(geometrySetRelationship, that.geometrySetRelationship) &&
        Objects.equals(partRevisionRelationship, that.partRevisionRelationship) &&
        Objects.equals(sceneRelationship, that.sceneRelationship);
  }

  @Override
  public int hashCode() {
    return Objects.hash(geometrySetRelationship, partRevisionRelationship, sceneRelationship);
  }

  @Override
  public String toString() {
    return "AnyOfGeometrySetRelationshipPartRevisionRelationshipSceneRelationship{" +
        "geometrySetRelationship=" + geometrySetRelationship +
        ", partRevisionRelationship=" + partRevisionRelationship +
        ", sceneRelationship=" + sceneRelationship +
        '}';
  }
}
