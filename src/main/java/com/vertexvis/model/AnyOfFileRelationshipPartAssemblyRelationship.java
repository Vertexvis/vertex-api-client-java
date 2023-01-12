package com.vertexvis.model;

import java.util.Objects;

public class AnyOfFileRelationshipPartAssemblyRelationship {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnyOfFileRelationshipPartAssemblyRelationship that = (AnyOfFileRelationshipPartAssemblyRelationship) o;
        return Objects.equals(fileRelationship, that.fileRelationship) && Objects.equals(partAssemblyRelationship, that.partAssemblyRelationship);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileRelationship, partAssemblyRelationship);
    }

    private FileRelationship fileRelationship;
    private PartAssemblyRelationship partAssemblyRelationship;

    public AnyOfFileRelationshipPartAssemblyRelationship(FileRelationship rel){
        this.fileRelationship = rel;
    }

    public AnyOfFileRelationshipPartAssemblyRelationship(PartAssemblyRelationship rel){
        this.partAssemblyRelationship = rel;
    }
    public FileRelationship getFileRelationship() {
        return fileRelationship;
    }

    public PartAssemblyRelationship getPartAssemblyRelationship() {
        return partAssemblyRelationship;
    }

}
