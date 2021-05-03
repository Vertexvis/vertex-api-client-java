package com.vertexvis.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;
import javax.annotation.Nullable;

public class AnyOfQueryByIdQueryByCollectionQueryAll {
  private QueryById queryById;
  private QueryByCollection queryByCollection;
  private QueryAll queryAll;

  public AnyOfQueryByIdQueryByCollectionQueryAll queryById(QueryById queryById) {
    this.queryById = queryById;
    this.queryByCollection = null;
    this.queryAll = null;
    return this;
  }

  @Nullable
  @SerializedName("queryById")
  public QueryById getQueryById() {
    return this.queryById;
  }

  public void setQueryById(QueryById queryById) {
    queryById(queryById);
  }

  public AnyOfQueryByIdQueryByCollectionQueryAll queryByCollection(
      QueryByCollection queryByCollection) {
    this.queryById = null;
    this.queryByCollection = queryByCollection;
    this.queryAll = null;
    return this;
  }

  @Nullable
  @SerializedName("queryByCollection")
  public QueryByCollection getQueryByCollection() {
    return this.queryByCollection;
  }

  public void setQueryByCollection(QueryByCollection queryByCollection) {
    queryByCollection(queryByCollection);
  }

  public AnyOfQueryByIdQueryByCollectionQueryAll queryAll(QueryAll queryAll) {
    this.queryById = null;
    this.queryByCollection = null;
    this.queryAll = queryAll;
    return this;
  }

  @Nullable
  @SerializedName("queryAll")
  public QueryAll getQueryAll() {
    return this.queryAll;
  }

  public void setQueryAll(QueryAll queryAll) {
    queryAll(queryAll);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnyOfQueryByIdQueryByCollectionQueryAll that = (AnyOfQueryByIdQueryByCollectionQueryAll) o;
    return Objects.equals(queryById, that.queryById) &&
        Objects.equals(queryByCollection, that.queryByCollection) &&
        queryAll == that.queryAll;
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryById, queryByCollection, queryAll);
  }

  @Override
  public String toString() {
    return "AnyOfQueryByIdQueryByCollectionQueryAll{" +
        "queryById=" + queryById +
        ", queryByCollection=" + queryByCollection +
        ", queryAll=" + queryAll +
        '}';
  }
}
