package com.vertexvis.model;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class AnyOfPropertyStringTypePropertyDoubleTypePropertyLongTypePropertyDateTypeobject {
    private PropertyStringType stringType= null;
    private PropertyDoubleType doubleType= null;
    private PropertyLongType longType= null;
    private PropertyDateType dateType= null;

    public AnyOfPropertyStringTypePropertyDoubleTypePropertyLongTypePropertyDateTypeobject(PropertyStringType stringType) {
        this.stringType= stringType;
    }

    public AnyOfPropertyStringTypePropertyDoubleTypePropertyLongTypePropertyDateTypeobject(PropertyDoubleType doubleType) {
        this.doubleType= doubleType;
    }

    public AnyOfPropertyStringTypePropertyDoubleTypePropertyLongTypePropertyDateTypeobject(PropertyLongType longType) {
        this.longType= longType;
    }

    public AnyOfPropertyStringTypePropertyDoubleTypePropertyLongTypePropertyDateTypeobject(PropertyDateType dateType) {
        this.dateType= dateType;
    }

    public Object getPropertyObject() {
        if (stringType != null) {
            return stringType;
        } else if (doubleType != null) {
            return doubleType;
        } else if (longType != null) {
            return longType;
        }
        return dateType;
    }

    public boolean isPropertyStringType() {
        return stringType != null;
    }

    public boolean isPropertyDoubleType() {
        return doubleType != null;
    }

    public boolean isPropertyLongType() {
        return longType != null;
    }

    public boolean isPropertyDateType() {
        return dateType != null;
    }

    public PropertyStringType getPropertyStringType() {
        return stringType;
    }

    public PropertyDoubleType getPropertyDoubleType()  {
        return doubleType;
    }

    public PropertyLongType getPropertyLongType(){
        return longType;
    }

    public PropertyDateType getPropertyDateType() {
        return dateType;
    }
}

