package com.vertexvis.model;

public class AnyOfGeometrySetRelationshipPartRevisionRelationshipSceneRelationship {
  private GeometrySetRelationship gsRel = null;
  private PartRevisionRelationship prRel = null;
  private SceneRelationship sRel = null;

  public AnyOfGeometrySetRelationshipPartRevisionRelationshipSceneRelationship(
      GeometrySetRelationship gsRel) {
    this.gsRel = gsRel;
  }

  public AnyOfGeometrySetRelationshipPartRevisionRelationshipSceneRelationship(
      PartRevisionRelationship prRel) {
    this.prRel = prRel;
  }

  public AnyOfGeometrySetRelationshipPartRevisionRelationshipSceneRelationship(
      SceneRelationship sRel) {
    this.sRel = sRel;
  }

  public Object getRel() {
    if (this.gsRel != null) {
      return this.gsRel;
    }
    if (this.prRel != null) {
      return this.prRel;
    }
    if (this.sRel != null) {
      return this.sRel;
    }

    return null;
  }

  public boolean isGeometrySetRel() {
    return this.gsRel != null;
  }

  public boolean isPartRevisionRel() {
    return this.prRel != null;
  }

  public boolean isSceneRel() {
    return this.sRel != null;
  }

  public GeometrySetRelationship getGeometrySetRel() {
    return gsRel;
  }

  public PartRevisionRelationship getPartRevisionRel() {
    return prRel;
  }

  public SceneRelationship getSceneRel() {
    return sRel;
  }
}
