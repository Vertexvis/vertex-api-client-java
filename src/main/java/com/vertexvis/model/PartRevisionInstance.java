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
import com.vertexvis.model.Matrix4;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;

/**
 * A reference to an existing PartRevision. Specify one and only one of referenceId or suppliedReferenceId to refer to a revision.
 */
@ApiModel(description = "A reference to an existing PartRevision. Specify one and only one of referenceId or suppliedReferenceId to refer to a revision.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PartRevisionInstance {
  public static final String SERIALIZED_NAME_ORDINAL = "ordinal";
  @SerializedName(SERIALIZED_NAME_ORDINAL)
  private Integer ordinal;

  public static final String SERIALIZED_NAME_REVISION_ID = "revisionId";
  @SerializedName(SERIALIZED_NAME_REVISION_ID)
  private UUID revisionId;

  public static final String SERIALIZED_NAME_SUPPLIED_REVISION_ID = "suppliedRevisionId";
  @SerializedName(SERIALIZED_NAME_SUPPLIED_REVISION_ID)
  private String suppliedRevisionId;

  public static final String SERIALIZED_NAME_TRANSFORM = "transform";
  @SerializedName(SERIALIZED_NAME_TRANSFORM)
  private Matrix4 transform;

  public PartRevisionInstance() { 
  }

  public PartRevisionInstance ordinal(Integer ordinal) {
    
    this.ordinal = ordinal;
    return this;
  }

   /**
   * A 0-based index used for defining a consistent ordering for children of an assembly
   * minimum: 0
   * @return ordinal
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A 0-based index used for defining a consistent ordering for children of an assembly")

  public Integer getOrdinal() {
    return ordinal;
  }


  public void setOrdinal(Integer ordinal) {
    this.ordinal = ordinal;
  }


  public PartRevisionInstance revisionId(UUID revisionId) {
    
    this.revisionId = revisionId;
    return this;
  }

   /**
   * ID of the resource.
   * @return revisionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "f79d4760-0b71-44e4-ad0b-22743fdd4ca3", value = "ID of the resource.")

  public UUID getRevisionId() {
    return revisionId;
  }


  public void setRevisionId(UUID revisionId) {
    this.revisionId = revisionId;
  }


  public PartRevisionInstance suppliedRevisionId(String suppliedRevisionId) {
    
    this.suppliedRevisionId = suppliedRevisionId;
    return this;
  }

   /**
   * Get suppliedRevisionId
   * @return suppliedRevisionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "some-string", value = "")

  public String getSuppliedRevisionId() {
    return suppliedRevisionId;
  }


  public void setSuppliedRevisionId(String suppliedRevisionId) {
    this.suppliedRevisionId = suppliedRevisionId;
  }


  public PartRevisionInstance transform(Matrix4 transform) {
    
    this.transform = transform;
    return this;
  }

   /**
   * Get transform
   * @return transform
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Matrix4 getTransform() {
    return transform;
  }


  public void setTransform(Matrix4 transform) {
    this.transform = transform;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartRevisionInstance partRevisionInstance = (PartRevisionInstance) o;
    return Objects.equals(this.ordinal, partRevisionInstance.ordinal) &&
        Objects.equals(this.revisionId, partRevisionInstance.revisionId) &&
        Objects.equals(this.suppliedRevisionId, partRevisionInstance.suppliedRevisionId) &&
        Objects.equals(this.transform, partRevisionInstance.transform);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ordinal, revisionId, suppliedRevisionId, transform);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartRevisionInstance {\n");
    sb.append("    ordinal: ").append(toIndentedString(ordinal)).append("\n");
    sb.append("    revisionId: ").append(toIndentedString(revisionId)).append("\n");
    sb.append("    suppliedRevisionId: ").append(toIndentedString(suppliedRevisionId)).append("\n");
    sb.append("    transform: ").append(toIndentedString(transform)).append("\n");
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

