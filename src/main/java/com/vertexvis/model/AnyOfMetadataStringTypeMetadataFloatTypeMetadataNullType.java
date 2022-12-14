package com.vertexvis.model;

import javax.annotation.Nullable;

public class AnyOfMetadataStringTypeMetadataFloatTypeMetadataNullType {
    private MetadataStringType stringType;
    private MetadataFloatType floatType;
    private MetadataNullType nullType;

    public AnyOfMetadataStringTypeMetadataFloatTypeMetadataNullType(MetadataFloatType floatType) {
        this.floatType = floatType;
    }

    public AnyOfMetadataStringTypeMetadataFloatTypeMetadataNullType(MetadataStringType stringType) {
        this.stringType = stringType;
    }

    public AnyOfMetadataStringTypeMetadataFloatTypeMetadataNullType(MetadataNullType nullType) {
        this.nullType = nullType;
    }

    public Object getMetadata() {
        if (this.floatType != null) {
            return this.floatType;
        } else if (this.stringType != null) {
            return this.stringType;
        } else if (this.nullType != null) {
            return this.nullType;
        } else {
            return null;
        }
    }
    @Nullable
    public MetadataFloatType getFloatType() {
        return this.getFloatType();
    }

    @Nullable
    public MetadataStringType getStringType() {
        return this.stringType;
    }

    @Nullable
    public MetadataNullType getNullType() {
        return this.nullType;
    }
}
