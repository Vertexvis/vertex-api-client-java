package com.vertexvis.model;

import javax.annotation.Nullable;

public class AnyOfQueryByIdQueryByCollectionQueryAll {
  private QueryById queryById;
  private QueryByCollection queryByCollection;
  private QueryAll queryAll;

  public AnyOfQueryByIdQueryByCollectionQueryAll(QueryById queryById) {
    this.queryById = queryById;
  }

  public AnyOfQueryByIdQueryByCollectionQueryAll(QueryByCollection queryByCollection) {
    this.queryByCollection = queryByCollection;
  }

  public AnyOfQueryByIdQueryByCollectionQueryAll(QueryAll queryAll) {
    this.queryAll = queryAll;
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
}
