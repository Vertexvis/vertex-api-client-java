/*
 * Vertex Platform API
 * The Vertex distributed cloud rendering platform includes a set of APIs and SDKs, which together allow easily integrating 3D product data into your business application.  See our [Developer Guides](https://developer.vertexvis.com/docs/guides/render-your-first-scene) to get started.  Notes about the Postman collection and API Reference code samples:   - They include all required and optional body parameters for completeness. Remove any optional parameters as desired.   - They use auto-generated IDs and other values that may share the same value for ease of documentation only. In actual requests and responses, the IDs should uniquely identify their corresponding resource. 
 *
 * The version of the OpenAPI document: 1.0
 * Contact: support@vertexvis.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.vertexvis.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.vertexvis.model.GeometrySetRelationshipData;
import com.vertexvis.model.PartRelationshipData;
import com.vertexvis.model.PartRenditionRelationship;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PartRevisionDataRelationships
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PartRevisionDataRelationships {
  public static final String SERIALIZED_NAME_GEOMETRY_SET = "geometrySet";
  @SerializedName(SERIALIZED_NAME_GEOMETRY_SET)
  private GeometrySetRelationshipData geometrySet;

  public static final String SERIALIZED_NAME_PART = "part";
  @SerializedName(SERIALIZED_NAME_PART)
  private PartRelationshipData part;

  public static final String SERIALIZED_NAME_DEFAULT_PART_RENDITION = "defaultPartRendition";
  @SerializedName(SERIALIZED_NAME_DEFAULT_PART_RENDITION)
  private PartRenditionRelationship defaultPartRendition;

  public PartRevisionDataRelationships() { 
  }

  public PartRevisionDataRelationships geometrySet(GeometrySetRelationshipData geometrySet) {
    
    this.geometrySet = geometrySet;
    return this;
  }

   /**
   * Get geometrySet
   * @return geometrySet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GeometrySetRelationshipData getGeometrySet() {
    return geometrySet;
  }


  public void setGeometrySet(GeometrySetRelationshipData geometrySet) {
    this.geometrySet = geometrySet;
  }


  public PartRevisionDataRelationships part(PartRelationshipData part) {
    
    this.part = part;
    return this;
  }

   /**
   * Get part
   * @return part
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PartRelationshipData getPart() {
    return part;
  }


  public void setPart(PartRelationshipData part) {
    this.part = part;
  }


  public PartRevisionDataRelationships defaultPartRendition(PartRenditionRelationship defaultPartRendition) {
    
    this.defaultPartRendition = defaultPartRendition;
    return this;
  }

   /**
   * Get defaultPartRendition
   * @return defaultPartRendition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PartRenditionRelationship getDefaultPartRendition() {
    return defaultPartRendition;
  }


  public void setDefaultPartRendition(PartRenditionRelationship defaultPartRendition) {
    this.defaultPartRendition = defaultPartRendition;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartRevisionDataRelationships partRevisionDataRelationships = (PartRevisionDataRelationships) o;
    return Objects.equals(this.geometrySet, partRevisionDataRelationships.geometrySet) &&
        Objects.equals(this.part, partRevisionDataRelationships.part) &&
        Objects.equals(this.defaultPartRendition, partRevisionDataRelationships.defaultPartRendition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(geometrySet, part, defaultPartRendition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartRevisionDataRelationships {\n");
    sb.append("    geometrySet: ").append(toIndentedString(geometrySet)).append("\n");
    sb.append("    part: ").append(toIndentedString(part)).append("\n");
    sb.append("    defaultPartRendition: ").append(toIndentedString(defaultPartRendition)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

