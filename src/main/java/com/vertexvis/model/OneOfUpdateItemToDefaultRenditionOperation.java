package com.vertexvis.model;

import javax.annotation.Nullable;

public class OneOfUpdateItemToDefaultRenditionOperation {
    private UpdateItemToDefaultRenditionOperation updateItemToDefaultRenditionOperation;

    public OneOfUpdateItemToDefaultRenditionOperation(UpdateItemToDefaultRenditionOperation updateItemToDefaultRenditionOperation) {
        this.updateItemToDefaultRenditionOperation = updateItemToDefaultRenditionOperation;
    }

    public Object getData() {
        if (this.updateItemToDefaultRenditionOperation != null) {
            return this.updateItemToDefaultRenditionOperation;
        }

        return null;
    }

    @Nullable
    public UpdateItemToDefaultRenditionOperation getUpdateItemToDefaultRenditionOperation() {
        return updateItemToDefaultRenditionOperation;
    }
}
