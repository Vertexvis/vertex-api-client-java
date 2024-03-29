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
import com.vertexvis.model.GeometrySetRelationship;
import com.vertexvis.model.PartRenditionRelationship;
import com.vertexvis.model.PartRevisionRelationship;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * QueuedTranslationJobDataRelationships
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class QueuedTranslationJobDataRelationships {
  public static final String SERIALIZED_NAME_GEOMETRY_SET = "geometrySet";
  @SerializedName(SERIALIZED_NAME_GEOMETRY_SET)
  private GeometrySetRelationship geometrySet;

  public static final String SERIALIZED_NAME_PART_REVISION = "partRevision";
  @SerializedName(SERIALIZED_NAME_PART_REVISION)
  private PartRevisionRelationship partRevision;

  public static final String SERIALIZED_NAME_PART_RENDITION = "partRendition";
  @SerializedName(SERIALIZED_NAME_PART_RENDITION)
  private PartRenditionRelationship partRendition;

  public QueuedTranslationJobDataRelationships() { 
  }

  public QueuedTranslationJobDataRelationships geometrySet(GeometrySetRelationship geometrySet) {
    
    this.geometrySet = geometrySet;
    return this;
  }

   /**
   * Get geometrySet
   * @return geometrySet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GeometrySetRelationship getGeometrySet() {
    return geometrySet;
  }


  public void setGeometrySet(GeometrySetRelationship geometrySet) {
    this.geometrySet = geometrySet;
  }


  public QueuedTranslationJobDataRelationships partRevision(PartRevisionRelationship partRevision) {
    
    this.partRevision = partRevision;
    return this;
  }

   /**
   * Get partRevision
   * @return partRevision
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PartRevisionRelationship getPartRevision() {
    return partRevision;
  }


  public void setPartRevision(PartRevisionRelationship partRevision) {
    this.partRevision = partRevision;
  }


  public QueuedTranslationJobDataRelationships partRendition(PartRenditionRelationship partRendition) {
    
    this.partRendition = partRendition;
    return this;
  }

   /**
   * Get partRendition
   * @return partRendition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PartRenditionRelationship getPartRendition() {
    return partRendition;
  }


  public void setPartRendition(PartRenditionRelationship partRendition) {
    this.partRendition = partRendition;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueuedTranslationJobDataRelationships queuedTranslationJobDataRelationships = (QueuedTranslationJobDataRelationships) o;
    return Objects.equals(this.geometrySet, queuedTranslationJobDataRelationships.geometrySet) &&
        Objects.equals(this.partRevision, queuedTranslationJobDataRelationships.partRevision) &&
        Objects.equals(this.partRendition, queuedTranslationJobDataRelationships.partRendition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(geometrySet, partRevision, partRendition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueuedTranslationJobDataRelationships {\n");
    sb.append("    geometrySet: ").append(toIndentedString(geometrySet)).append("\n");
    sb.append("    partRevision: ").append(toIndentedString(partRevision)).append("\n");
    sb.append("    partRendition: ").append(toIndentedString(partRendition)).append("\n");
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

