package com.vertexvis.model;

import javax.annotation.Nullable;

public class OneOfSceneViewRelationshipSceneViewStateRelationship {
  private SceneViewRelationship svRel;
  private SceneViewStateRelationship svsRel;

  public OneOfSceneViewRelationshipSceneViewStateRelationship(SceneViewRelationship svRel) {
    this.svRel = svRel;
  }

  public OneOfSceneViewRelationshipSceneViewStateRelationship(SceneViewStateRelationship svsRel) {
    this.svsRel = svsRel;
  }

  public Object getRel() {
    if (this.svRel != null) {
      return this.svRel;
    }
    if (this.svsRel != null) {
      return this.svsRel;
    }

    return null;
  }

  public boolean isSceneViewRel() {
    return this.svRel != null;
  }

  public boolean isSceneViewStateRel() {
    return this.svsRel != null;
  }

  @Nullable
  public SceneViewRelationship getSceneViewRel() {
    return this.svRel;
  }

  @Nullable
  public SceneViewStateRelationship getSceneViewStateRel() {
    return this.svsRel;
  }
}
