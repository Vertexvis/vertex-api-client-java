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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * UpdatePartRevisionRequestDataAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdatePartRevisionRequestDataAttributes {
  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType> metadata = null;

  public static final String SERIALIZED_NAME_INDEX_METADATA = "indexMetadata";
  @SerializedName(SERIALIZED_NAME_INDEX_METADATA)
  private Boolean indexMetadata;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SUPPLIED_ID_KEY = "suppliedIdKey";
  @SerializedName(SERIALIZED_NAME_SUPPLIED_ID_KEY)
  private String suppliedIdKey;

  public static final String SERIALIZED_NAME_SUPPLIED_REVISION_ID_KEY = "suppliedRevisionIdKey";
  @SerializedName(SERIALIZED_NAME_SUPPLIED_REVISION_ID_KEY)
  private String suppliedRevisionIdKey;

  public static final String SERIALIZED_NAME_SUPPLIED_INSTANCE_ID_KEY = "suppliedInstanceIdKey";
  @SerializedName(SERIALIZED_NAME_SUPPLIED_INSTANCE_ID_KEY)
  private String suppliedInstanceIdKey;

  public UpdatePartRevisionRequestDataAttributes() { 
  }

  public UpdatePartRevisionRequestDataAttributes metadata(Map<String, AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public UpdatePartRevisionRequestDataAttributes putMetadataItem(String key, AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Metadata about the &#x60;part&#x60; and/or &#x60;part-revision&#x60;. This metadata will take precedence over any metadata that belongs to the part file if &#x60;indexMetadata&#x60; is specified. 
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Metadata about the `part` and/or `part-revision`. This metadata will take precedence over any metadata that belongs to the part file if `indexMetadata` is specified. ")

  public Map<String, AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType> metadata) {
    this.metadata = metadata;
  }


  public UpdatePartRevisionRequestDataAttributes indexMetadata(Boolean indexMetadata) {
    
    this.indexMetadata = indexMetadata;
    return this;
  }

   /**
   * Whether or not to index metadata in the part file when sending a file relationship - not used otherwise. To ignore metadata from the part file and add your own, pass &#x60;false&#x60; for &#x60;indexMetadata&#x60; and supply custom metadata using the &#x60;metadata&#x60; field. 
   * @return indexMetadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Whether or not to index metadata in the part file when sending a file relationship - not used otherwise. To ignore metadata from the part file and add your own, pass `false` for `indexMetadata` and supply custom metadata using the `metadata` field. ")

  public Boolean getIndexMetadata() {
    return indexMetadata;
  }


  public void setIndexMetadata(Boolean indexMetadata) {
    this.indexMetadata = indexMetadata;
  }


  public UpdatePartRevisionRequestDataAttributes name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name to be used for the root part. This will be used when given a file relationship - not used otherwise.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1/2in. Flat Washer", value = "Name to be used for the root part. This will be used when given a file relationship - not used otherwise.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UpdatePartRevisionRequestDataAttributes suppliedIdKey(String suppliedIdKey) {
    
    this.suppliedIdKey = suppliedIdKey;
    return this;
  }

   /**
   * Metadata key used to extract an ID used for correlation. This will be used when given a file relationship - not used otherwise.
   * @return suppliedIdKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ProductNumber", value = "Metadata key used to extract an ID used for correlation. This will be used when given a file relationship - not used otherwise.")

  public String getSuppliedIdKey() {
    return suppliedIdKey;
  }


  public void setSuppliedIdKey(String suppliedIdKey) {
    this.suppliedIdKey = suppliedIdKey;
  }


  public UpdatePartRevisionRequestDataAttributes suppliedRevisionIdKey(String suppliedRevisionIdKey) {
    
    this.suppliedRevisionIdKey = suppliedRevisionIdKey;
    return this;
  }

   /**
   * Metadata key used to extract an ID used for correlation. This will be used when given a file relationship - not used otherwise.
   * @return suppliedRevisionIdKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "RevisionId", value = "Metadata key used to extract an ID used for correlation. This will be used when given a file relationship - not used otherwise.")

  public String getSuppliedRevisionIdKey() {
    return suppliedRevisionIdKey;
  }


  public void setSuppliedRevisionIdKey(String suppliedRevisionIdKey) {
    this.suppliedRevisionIdKey = suppliedRevisionIdKey;
  }


  public UpdatePartRevisionRequestDataAttributes suppliedInstanceIdKey(String suppliedInstanceIdKey) {
    
    this.suppliedInstanceIdKey = suppliedInstanceIdKey;
    return this;
  }

   /**
   * Metadata key used to extract an ID used for correlation. This will be used when given a file relationship - not used otherwise.
   * @return suppliedInstanceIdKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "InstanceId", value = "Metadata key used to extract an ID used for correlation. This will be used when given a file relationship - not used otherwise.")

  public String getSuppliedInstanceIdKey() {
    return suppliedInstanceIdKey;
  }


  public void setSuppliedInstanceIdKey(String suppliedInstanceIdKey) {
    this.suppliedInstanceIdKey = suppliedInstanceIdKey;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePartRevisionRequestDataAttributes updatePartRevisionRequestDataAttributes = (UpdatePartRevisionRequestDataAttributes) o;
    return Objects.equals(this.metadata, updatePartRevisionRequestDataAttributes.metadata) &&
        Objects.equals(this.indexMetadata, updatePartRevisionRequestDataAttributes.indexMetadata) &&
        Objects.equals(this.name, updatePartRevisionRequestDataAttributes.name) &&
        Objects.equals(this.suppliedIdKey, updatePartRevisionRequestDataAttributes.suppliedIdKey) &&
        Objects.equals(this.suppliedRevisionIdKey, updatePartRevisionRequestDataAttributes.suppliedRevisionIdKey) &&
        Objects.equals(this.suppliedInstanceIdKey, updatePartRevisionRequestDataAttributes.suppliedInstanceIdKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, indexMetadata, name, suppliedIdKey, suppliedRevisionIdKey, suppliedInstanceIdKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePartRevisionRequestDataAttributes {\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    indexMetadata: ").append(toIndentedString(indexMetadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    suppliedIdKey: ").append(toIndentedString(suppliedIdKey)).append("\n");
    sb.append("    suppliedRevisionIdKey: ").append(toIndentedString(suppliedRevisionIdKey)).append("\n");
    sb.append("    suppliedInstanceIdKey: ").append(toIndentedString(suppliedInstanceIdKey)).append("\n");
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

