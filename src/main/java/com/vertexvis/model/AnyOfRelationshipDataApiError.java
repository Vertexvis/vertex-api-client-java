package com.vertexvis.model;

import javax.annotation.Nullable;

public class AnyOfRelationshipDataApiError {
  private RelationshipData relationshipData;
  private ApiError apiError;

  public AnyOfRelationshipDataApiError(RelationshipData relationshipData) {
    this.relationshipData = relationshipData;
  }

  public AnyOfRelationshipDataApiError(ApiError apiError) {
    this.apiError = apiError;
  }

  public Object getObj() {
    if (this.relationshipData != null) {
      return this.relationshipData;
    }
    if (this.apiError != null) {
      return this.apiError;
    }

    return null;
  }

  @Nullable
  public RelationshipData getRelationshipData() {
    return this.relationshipData;
  }

  @Nullable
  public ApiError getApiError() {
    return this.apiError;
  }
}
