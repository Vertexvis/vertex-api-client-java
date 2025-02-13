package com.vertexvis.model;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class OneOfSceneAnnotationCalloutDataTypeSceneAnnotationCustomDataType {
    private SceneAnnotationCalloutDataType calloutType;
    private SceneAnnotationCustomDataType customType;

    public OneOfSceneAnnotationCalloutDataTypeSceneAnnotationCustomDataType(SceneAnnotationCalloutDataType calloutType) {
        this.calloutType= calloutType;
    }

    public OneOfSceneAnnotationCalloutDataTypeSceneAnnotationCustomDataType(SceneAnnotationCustomDataType customType) {
        this.customType= customType;
    }

    public Object getData() {
        if (calloutType != null) {
            return calloutType;
        }
        return customType;
    }

    SceneAnnotationCalloutDataType getSceneAnnotationCalloutDataType() {
        return calloutType;
    }

    SceneAnnotationCustomDataType getSceneAnnotationCustomDataType() {
        return customType;
    }
}

