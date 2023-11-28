package com.vertexvis.model;

public class AnyOfGeometrySetRelationshipPartRevisionRelationship {
    private GeometrySetRelationship gsRel = null;
    private PartRevisionRelationship prRel = null;

    public AnyOfGeometrySetRelationshipPartRevisionRelationship(GeometrySetRelationship gsRel) {
        this.gsRel = gsRel;
    }

    public AnyOfGeometrySetRelationshipPartRevisionRelationship(PartRevisionRelationship prRel) {
        this.prRel = prRel;
    }

    public Object getRel() {
        if (this.gsRel != null) {
            return this.gsRel;
        }
        if (this.prRel != null) {
            return this.prRel;
        }

        return null;
    }

    public boolean isGeometrySetRel() {
        return this.gsRel != null;
    }

    public boolean isPartRevisionRel() {
        return this.prRel != null;
    }

    public GeometrySetRelationship getGeometrySetRel() {
        return gsRel;
    }

    public PartRevisionRelationship getPartRevisionRel() {
        return prRel;
    }
}
