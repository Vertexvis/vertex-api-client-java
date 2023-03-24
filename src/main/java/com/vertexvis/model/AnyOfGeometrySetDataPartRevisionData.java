package com.vertexvis.model;

public class AnyOfGeometrySetDataPartRevisionData {
    private Object value = null;

    public AnyOfGeometrySetDataPartRevisionData() {
    }

    public AnyOfGeometrySetDataPartRevisionData(GeometrySetData value) {
        this.value = value;
    }

    public AnyOfGeometrySetDataPartRevisionData(PartRevisionData value) {
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

    public GeometrySetData getGeometrySetData() {
        return isGeometrySetData() ? (GeometrySetData) value : null;
    }

    public PartRevisionData getPartRevisionData() {
        return isPartRevisionData() ? (PartRevisionData) value : null;
    }
}
