package com.vertexvis.model;

import javax.annotation.Nullable;

public class OneOfFileJobArchiveOperation {
    private FileJobArchiveOperation fileJobArchiveOperation;

    public OneOfFileJobArchiveOperation(FileJobArchiveOperation fileJobArchiveOperation) {
        this.fileJobArchiveOperation = fileJobArchiveOperation;
    }

    public Object getData() {
        if (this.fileJobArchiveOperation != null) {
            return this.fileJobArchiveOperation;
        }

        return null;
    }


    @Nullable
    public FileJobArchiveOperation getFileJobArchiveOperation() {
        return this.fileJobArchiveOperation;
    }
}
