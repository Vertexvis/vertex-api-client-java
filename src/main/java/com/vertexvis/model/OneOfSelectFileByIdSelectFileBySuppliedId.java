package com.vertexvis.model;

import javax.annotation.Nullable;

public class OneOfSelectFileByIdSelectFileBySuppliedId {
    private SelectFileById selectFileById;
    private SelectFileBySuppliedId selectFileBySuppliedId;

    public OneOfSelectFileByIdSelectFileBySuppliedId(SelectFileById selectFileById) {
        this.selectFileById = selectFileById;
    }

    public OneOfSelectFileByIdSelectFileBySuppliedId(SelectFileBySuppliedId selectFileBySuppliedId) {
        this.selectFileBySuppliedId = selectFileBySuppliedId;
    }

    public Object getData() {
        if (this.selectFileById != null) {
            return this.selectFileById;
        }
        if (this.selectFileBySuppliedId != null) {
            return this.selectFileBySuppliedId;
        }
        return null;
    }

    @Nullable
    public SelectFileById getSelectFileById() {
        return this.selectFileById;
    }

    @Nullable
    public SelectFileBySuppliedId getSelectFileBySuppliedId() {
        return this.selectFileBySuppliedId;
    }
}
