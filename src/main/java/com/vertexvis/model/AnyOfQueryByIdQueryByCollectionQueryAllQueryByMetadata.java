package com.vertexvis.model;

import javax.annotation.Nullable;

public class AnyOfQueryByIdQueryByCollectionQueryAllQueryByMetadata {
  private QueryById queryById;
  private QueryByCollection queryByCollection;
  private QueryAll queryAll;
  private QueryByMetadata queryByMetadata;

  public AnyOfQueryByIdQueryByCollectionQueryAllQueryByMetadata(QueryById queryById) {
    this.queryById = queryById;
  }

  public AnyOfQueryByIdQueryByCollectionQueryAllQueryByMetadata(QueryByCollection queryByCollection) {
    this.queryByCollection = queryByCollection;
  }

  public AnyOfQueryByIdQueryByCollectionQueryAllQueryByMetadata(QueryAll queryAll) {
    this.queryAll = queryAll;
  }

  public AnyOfQueryByIdQueryByCollectionQueryAllQueryByMetadata(QueryByMetadata queryByMetadata) {
      this.queryByMetadata = queryByMetadata;
  }

  public Object getQuery() {
    if (queryById != null) {
      return this.queryById;
    }
    if (queryByCollection != null) {
      return this.queryByCollection;
    }
    if (queryAll != null) {
      return this.queryAll;
    }
    if (queryByMetadata != null) {
      return this.queryByMetadata;
    }

    return null;
  }

  @Nullable
  public QueryById getQueryById() {
    return this.queryById;
  }

  @Nullable
  public QueryByCollection getQueryByCollection() {
    return this.queryByCollection;
  }

  @Nullable
  public QueryAll getQueryAll() {
    return this.queryAll;
  }

  @Nullable
  public QueryByMetadata getQueryByMetadata() {
        return this.queryByMetadata;
    }
}
