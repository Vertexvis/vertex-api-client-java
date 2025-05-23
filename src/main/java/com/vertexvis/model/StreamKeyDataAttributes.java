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
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * StreamKeyDataAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StreamKeyDataAttributes {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_EXPIRY = "expiry";
  @SerializedName(SERIALIZED_NAME_EXPIRY)
  private Integer expiry;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_EXCLUDE_PRUNED_ITEMS = "excludePrunedItems";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_PRUNED_ITEMS)
  private Boolean excludePrunedItems;

  public static final String SERIALIZED_NAME_SCENE_VIEW_STATE_SUPPLIED_ID = "sceneViewStateSuppliedId";
  @SerializedName(SERIALIZED_NAME_SCENE_VIEW_STATE_SUPPLIED_ID)
  private String sceneViewStateSuppliedId;

  public static final String SERIALIZED_NAME_SCENE_VIEW_STATE_ID = "sceneViewStateId";
  @SerializedName(SERIALIZED_NAME_SCENE_VIEW_STATE_ID)
  private UUID sceneViewStateId;

  public StreamKeyDataAttributes() { 
  }

  public StreamKeyDataAttributes key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "i3MFRDOmg1pxD36dGCTONRwOujkgV8m9LQ", value = "")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public StreamKeyDataAttributes expiry(Integer expiry) {
    
    this.expiry = expiry;
    return this;
  }

   /**
   * Get expiry
   * @return expiry
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "600", required = true, value = "")

  public Integer getExpiry() {
    return expiry;
  }


  public void setExpiry(Integer expiry) {
    this.expiry = expiry;
  }


  public StreamKeyDataAttributes created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2020-01-01T12:00Z", required = true, value = "")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public StreamKeyDataAttributes excludePrunedItems(Boolean excludePrunedItems) {
    
    this.excludePrunedItems = excludePrunedItems;
    return this;
  }

   /**
   * Get excludePrunedItems
   * @return excludePrunedItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getExcludePrunedItems() {
    return excludePrunedItems;
  }


  public void setExcludePrunedItems(Boolean excludePrunedItems) {
    this.excludePrunedItems = excludePrunedItems;
  }


  public StreamKeyDataAttributes sceneViewStateSuppliedId(String sceneViewStateSuppliedId) {
    
    this.sceneViewStateSuppliedId = sceneViewStateSuppliedId;
    return this;
  }

   /**
   * Get sceneViewStateSuppliedId
   * @return sceneViewStateSuppliedId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "some-string", value = "")

  public String getSceneViewStateSuppliedId() {
    return sceneViewStateSuppliedId;
  }


  public void setSceneViewStateSuppliedId(String sceneViewStateSuppliedId) {
    this.sceneViewStateSuppliedId = sceneViewStateSuppliedId;
  }


  public StreamKeyDataAttributes sceneViewStateId(UUID sceneViewStateId) {
    
    this.sceneViewStateId = sceneViewStateId;
    return this;
  }

   /**
   * ID of the resource.
   * @return sceneViewStateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "f79d4760-0b71-44e4-ad0b-22743fdd4ca3", value = "ID of the resource.")

  public UUID getSceneViewStateId() {
    return sceneViewStateId;
  }


  public void setSceneViewStateId(UUID sceneViewStateId) {
    this.sceneViewStateId = sceneViewStateId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamKeyDataAttributes streamKeyDataAttributes = (StreamKeyDataAttributes) o;
    return Objects.equals(this.key, streamKeyDataAttributes.key) &&
        Objects.equals(this.expiry, streamKeyDataAttributes.expiry) &&
        Objects.equals(this.created, streamKeyDataAttributes.created) &&
        Objects.equals(this.excludePrunedItems, streamKeyDataAttributes.excludePrunedItems) &&
        Objects.equals(this.sceneViewStateSuppliedId, streamKeyDataAttributes.sceneViewStateSuppliedId) &&
        Objects.equals(this.sceneViewStateId, streamKeyDataAttributes.sceneViewStateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, expiry, created, excludePrunedItems, sceneViewStateSuppliedId, sceneViewStateId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamKeyDataAttributes {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    expiry: ").append(toIndentedString(expiry)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    excludePrunedItems: ").append(toIndentedString(excludePrunedItems)).append("\n");
    sb.append("    sceneViewStateSuppliedId: ").append(toIndentedString(sceneViewStateSuppliedId)).append("\n");
    sb.append("    sceneViewStateId: ").append(toIndentedString(sceneViewStateId)).append("\n");
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

