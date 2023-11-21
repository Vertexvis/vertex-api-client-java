package com.vertexvis.model;

public class AnyOfGeometrySetRelationshipPartRevisionRelationshipSceneRelationshipPartRenditionRelationship {
  private GeometrySetRelationship gsRel = null;
  private PartRevisionRelationship prRel = null;
  private SceneRelationship sRel = null;
  private PartRenditionRelationship partRenRel = null;

  public AnyOfGeometrySetRelationshipPartRevisionRelationshipSceneRelationshipPartRenditionRelationship(
      GeometrySetRelationship gsRel) {
    this.gsRel = gsRel;
  }

  public AnyOfGeometrySetRelationshipPartRevisionRelationshipSceneRelationshipPartRenditionRelationship(
      PartRevisionRelationship prRel) {
    this.prRel = prRel;
  }

  public AnyOfGeometrySetRelationshipPartRevisionRelationshipSceneRelationshipPartRenditionRelationship(
      SceneRelationship sRel) {
    this.sRel = sRel;
  }

  public AnyOfGeometrySetRelationshipPartRevisionRelationshipSceneRelationshipPartRenditionRelationship(
          PartRenditionRelationship partRenRel) {
    this.partRenRel = partRenRel;
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
    if (this.partRenRel != null) {
      return this.partRenRel;
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

  public PartRenditionRelationship getPartRenditionRel() {
    return partRenRel;
  }
}
