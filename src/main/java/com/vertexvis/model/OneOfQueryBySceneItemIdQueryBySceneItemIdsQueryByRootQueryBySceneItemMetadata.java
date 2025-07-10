package com.vertexvis.model;

import javax.annotation.Nullable;

public class OneOfQueryBySceneItemIdQueryBySceneItemIdsQueryByRootQueryBySceneItemMetadata {
    private QueryBySceneItemId queryBySceneItemId;
    private QueryBySceneItemIds queryBySceneItemIds;
    private QueryByRoot queryByRoot;
    private QueryBySceneItemMetadata queryBySceneItemMetadata;

    public OneOfQueryBySceneItemIdQueryBySceneItemIdsQueryByRootQueryBySceneItemMetadata(QueryBySceneItemId queryBySceneItemId) {
        this.queryBySceneItemId = queryBySceneItemId;
    }

    public OneOfQueryBySceneItemIdQueryBySceneItemIdsQueryByRootQueryBySceneItemMetadata(QueryBySceneItemIds queryBySceneItemIds) {
        this.queryBySceneItemIds = queryBySceneItemIds;
    }

    public OneOfQueryBySceneItemIdQueryBySceneItemIdsQueryByRootQueryBySceneItemMetadata(QueryByRoot queryByRoot) {
        this.queryByRoot = queryByRoot;
    }

    public OneOfQueryBySceneItemIdQueryBySceneItemIdsQueryByRootQueryBySceneItemMetadata(QueryBySceneItemMetadata queryBySceneItemMetadata) {
        this.queryBySceneItemMetadata = queryBySceneItemMetadata;
    }

    public Object getData() {
        if (this.queryBySceneItemId != null) {
            return this.queryBySceneItemId;
        }
        if (this.queryBySceneItemIds != null) {
            return this.queryBySceneItemIds;
        }
        if (this.queryByRoot != null) {
            return this.queryByRoot;
        }
        if (this.queryBySceneItemMetadata != null) {
            return this.queryBySceneItemMetadata;
        }
        return null;
    }

    @Nullable
    public QueryBySceneItemId getQueryBySceneItemId() {
        return this.queryBySceneItemId;
    }

    @Nullable
    public QueryBySceneItemIds getQueryBySceneItemIds() {
        return this.queryBySceneItemIds;
    }

    @Nullable
    public QueryByRoot getQueryByRoot() {
        return this.queryByRoot;
    }

    @Nullable
    public QueryBySceneItemMetadata getQueryBySceneItemMetadata() {
        return this.queryBySceneItemMetadata;
    }
}