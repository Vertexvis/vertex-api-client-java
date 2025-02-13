package com.vertexvis.model;

public class AnyOfPropertySetRelationshipPartRevisionRelationshipSceneItemRelationshipPartInstanceRelationship {
    private PropertySetRelationship psRel = null;
    private PartRevisionRelationship prRel = null;
    private SceneItemRelationship siRel = null;
    private PartInstanceRelationship piRel = null;

    public AnyOfPropertySetRelationshipPartRevisionRelationshipSceneItemRelationshipPartInstanceRelationship(
            PropertySetRelationship psRel) {
        this.psRel = psRel;
    }

    public AnyOfPropertySetRelationshipPartRevisionRelationshipSceneItemRelationshipPartInstanceRelationship(
            PartRevisionRelationship prRel) {
        this.prRel = prRel;
    }

    public AnyOfPropertySetRelationshipPartRevisionRelationshipSceneItemRelationshipPartInstanceRelationship(
            SceneItemRelationship siRel) {
        this.siRel = siRel;
    }

    public AnyOfPropertySetRelationshipPartRevisionRelationshipSceneItemRelationshipPartInstanceRelationship(
            PartInstanceRelationship piRel) {
        this.piRel = piRel;
    }

    public Object getRel() {
        if (this.psRel != null) {
            return this.psRel;
        }
        if (this.prRel != null) {
            return this.prRel;
        }
        if (this.siRel != null) {
            return this.siRel;
        }
        if (this.piRel != null) {
            return this.piRel;
        }

        return null;
    }

    public boolean isPropertySetRel() {
        return this.psRel != null;
    }

    public boolean isPartRevisionRel() {
        return this.prRel != null;
    }

    public boolean isSceneItemRel() {
        return this.siRel != null;
    }

    public boolean isPartInstanceRel() {
        return this.piRel != null;
    }

    public PropertySetRelationship getPropertySetRel() {
        return psRel;
    }

    public PartRevisionRelationship getPartRevisionRel() {
        return prRel;
    }

    public SceneItemRelationship getSceneItemRel() {
        return siRel;
    }

    public PartInstanceRelationship getPartInstanceRel() { return piRel; }
}
