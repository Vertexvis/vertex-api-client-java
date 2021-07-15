package com.vertexvis.model;

import javax.annotation.Nullable;

public class OneOfSceneViewRelationshipSceneViewStateRelationship {
  private SceneViewRelationship sceneViewRelationship;
  private SceneViewStateRelationship sceneViewStateRelationship;

  public OneOfSceneViewRelationshipSceneViewStateRelationship(
      SceneViewRelationship sceneViewRelationship) {
    this.sceneViewRelationship = sceneViewRelationship;
  }

  public OneOfSceneViewRelationshipSceneViewStateRelationship(
      SceneViewStateRelationship sceneViewStateRelationship) {
    this.sceneViewStateRelationship = sceneViewStateRelationship;
  }

  public Object getData() {
    if (this.sceneViewRelationship != null) {
      return this.sceneViewRelationship;
    }
    if (this.sceneViewStateRelationship != null) {
      return this.sceneViewStateRelationship;
    }

    return null;
  }

  @Nullable
  public SceneViewRelationship getSceneViewRelationship() {
    return this.sceneViewRelationship;
  }

  @Nullable
  public SceneViewStateRelationship getSceneViewStateRelationship() {
    return this.sceneViewStateRelationship;
  }
}
