package com.vertexvis.model;

public class AnyOfGeometrySetDataPartRevisionDataPartRenditionData {
    private Object value = null;

    public AnyOfGeometrySetDataPartRevisionDataPartRenditionData() {
    }

    public AnyOfGeometrySetDataPartRevisionDataPartRenditionData(GeometrySetData value) {
        this.value = value;
    }

    public AnyOfGeometrySetDataPartRevisionDataPartRenditionData(PartRevisionData value) {
        this.value = value;
    }

    public AnyOfGeometrySetDataPartRevisionDataPartRenditionData(PartRenditionData value) {
        this.value = value;
    }

    public Object getRel() {
        return value;
    }

    public boolean isGeometrySetData() {
        return value != null && value instanceof GeometrySetData;
    }

    public boolean isPartRevisionData() {
        return value != null && value instanceof PartRevisionData;
    }

    public boolean isPartRenditionData() {
        return value != null && value instanceof PartRenditionData;
    }

    public GeometrySetData getGeometrySetData() {
        return isGeometrySetData() ? (GeometrySetData) value : null;
    }

    public PartRevisionData getPartRevisionData() {
        return isPartRevisionData() ? (PartRevisionData) value : null;
    }

    public PartRenditionData getPartRenditionData() {
        return isPartRenditionData() ? (PartRenditionData) value : null;
    }
}
