/*
 * Vertex Platform API
 * The Vertex distributed cloud rendering platform includes a set of APIs and SDKs, which together allow easily integrating 3D product data into your business application.  See our [Developer Guides](https://developer.vertexvis.com/docs/guides/render-your-first-scene) to get started.  Notes about the Postman collection and API Reference code samples,   - They include all required and optional body parameters for completeness. Remove any optional parameters as desired.   - They use auto-generated IDs and other values that may share the same value for ease of documentation only. In actual requests and responses, the IDs should uniquely identify their corresponding resource. 
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
import com.vertexvis.model.AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * PartRevisionDataAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PartRevisionDataAttributes {
  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType> metadata = null;

  public static final String SERIALIZED_NAME_SUPPLIED_ID = "suppliedId";
  @SerializedName(SERIALIZED_NAME_SUPPLIED_ID)
  private String suppliedId;

  public PartRevisionDataAttributes() { 
  }

  public PartRevisionDataAttributes created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-01-01T12:00Z", value = "")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public PartRevisionDataAttributes metadata(Map<String, AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public PartRevisionDataAttributes putMetadataItem(String key, AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType> metadata) {
    this.metadata = metadata;
  }


  public PartRevisionDataAttributes suppliedId(String suppliedId) {
    
    this.suppliedId = suppliedId;
    return this;
  }

   /**
   * Get suppliedId
   * @return suppliedId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "some-string", value = "")

  public String getSuppliedId() {
    return suppliedId;
  }


  public void setSuppliedId(String suppliedId) {
    this.suppliedId = suppliedId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartRevisionDataAttributes partRevisionDataAttributes = (PartRevisionDataAttributes) o;
    return Objects.equals(this.created, partRevisionDataAttributes.created) &&
        Objects.equals(this.metadata, partRevisionDataAttributes.metadata) &&
        Objects.equals(this.suppliedId, partRevisionDataAttributes.suppliedId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, metadata, suppliedId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartRevisionDataAttributes {\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    suppliedId: ").append(toIndentedString(suppliedId)).append("\n");
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

