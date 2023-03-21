package com.vertexvis.model;

import javax.annotation.Nullable;

public class AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType {
    private Object value = null;

    public AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType() {
    }

    public AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType(
            MetadataLongType value) {
        this.value = value;
    }

    public AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType(
            MetadataFloatType value) {
        this.value = value;
    }

    public AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType(
            MetadataDateType value) {
        this.value = value;
    }

    public AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType(
            MetadataStringType value) {
        this.value = value;
    }

    public AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType(
            MetadataNullType value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public boolean isMetadataLongType() {
        return this.value != null && this.value instanceof MetadataLongType;
    }

    public boolean isMetadataFloatType() {
        return this.value != null && this.value instanceof MetadataFloatType;
    }

    public boolean isMetadataDateType() {
        return this.value != null && this.value instanceof MetadataDateType;
    }

    public boolean isMetadataStringType() {
        return this.value != null && this.value instanceof MetadataStringType;
    }

    public boolean isMetadataNullType() {
        return this.value != null && this.value instanceof MetadataNullType;
    }

    @Nullable
    public MetadataLongType getMetadataLongType() {
        return isMetadataLongType() ? (MetadataLongType) this.value : null;
    }

    @Nullable
    public MetadataFloatType getMetadataFloatType() {
        return isMetadataFloatType() ? (MetadataFloatType) this.value : null;
    }

    @Nullable
    public MetadataDateType getMetadataDateType() {
        return isMetadataDateType() ? (MetadataDateType) this.value : null;
    }

    @Nullable
    public MetadataStringType getMetadataStringType() {
        return isMetadataStringType() ? (MetadataStringType) this.value : null;
    }

    @Nullable
    public MetadataNullType getMetadataNullType() {
        return isMetadataNullType() ? (MetadataNullType) this.value : null;
    }
}
