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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PartRevisionSuppliedId
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PartRevisionSuppliedId {
  public static final String SERIALIZED_NAME_SUPPLIED_PART_ID = "suppliedPartId";
  @SerializedName(SERIALIZED_NAME_SUPPLIED_PART_ID)
  private String suppliedPartId;

  public static final String SERIALIZED_NAME_SUPPLIED_REVISION_ID = "suppliedRevisionId";
  @SerializedName(SERIALIZED_NAME_SUPPLIED_REVISION_ID)
  private String suppliedRevisionId;

  public PartRevisionSuppliedId() { 
  }

  public PartRevisionSuppliedId suppliedPartId(String suppliedPartId) {
    
    this.suppliedPartId = suppliedPartId;
    return this;
  }

   /**
   * ID provided for correlation. For example, an existing ID from a PLM system.
   * @return suppliedPartId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "ID provided for correlation. For example, an existing ID from a PLM system.")

  public String getSuppliedPartId() {
    return suppliedPartId;
  }


  public void setSuppliedPartId(String suppliedPartId) {
    this.suppliedPartId = suppliedPartId;
  }


  public PartRevisionSuppliedId suppliedRevisionId(String suppliedRevisionId) {
    
    this.suppliedRevisionId = suppliedRevisionId;
    return this;
  }

   /**
   * ID provided for correlation. For example, an existing ID from a PLM system.
   * @return suppliedRevisionId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "ID provided for correlation. For example, an existing ID from a PLM system.")

  public String getSuppliedRevisionId() {
    return suppliedRevisionId;
  }


  public void setSuppliedRevisionId(String suppliedRevisionId) {
    this.suppliedRevisionId = suppliedRevisionId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartRevisionSuppliedId partRevisionSuppliedId = (PartRevisionSuppliedId) o;
    return Objects.equals(this.suppliedPartId, partRevisionSuppliedId.suppliedPartId) &&
        Objects.equals(this.suppliedRevisionId, partRevisionSuppliedId.suppliedRevisionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(suppliedPartId, suppliedRevisionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartRevisionSuppliedId {\n");
    sb.append("    suppliedPartId: ").append(toIndentedString(suppliedPartId)).append("\n");
    sb.append("    suppliedRevisionId: ").append(toIndentedString(suppliedRevisionId)).append("\n");
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

