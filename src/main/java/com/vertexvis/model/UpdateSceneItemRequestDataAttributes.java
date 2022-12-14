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
import com.vertexvis.model.AnyOfMetadataStringTypeMetadataFloatTypeMetadataNullType;
import com.vertexvis.model.MaterialOverride;
import com.vertexvis.model.Matrix4;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * UpdateSceneItemRequestDataAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateSceneItemRequestDataAttributes {
  public static final String SERIALIZED_NAME_VISIBLE = "visible";
  @SerializedName(SERIALIZED_NAME_VISIBLE)
  private Boolean visible;

  public static final String SERIALIZED_NAME_MATERIAL_OVERRIDE = "materialOverride";
  @SerializedName(SERIALIZED_NAME_MATERIAL_OVERRIDE)
  private MaterialOverride materialOverride;

  public static final String SERIALIZED_NAME_TRANSFORM = "transform";
  @SerializedName(SERIALIZED_NAME_TRANSFORM)
  private Matrix4 transform;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SUPPLIED_ID = "suppliedId";
  @SerializedName(SERIALIZED_NAME_SUPPLIED_ID)
  private String suppliedId;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, AnyOfMetadataStringTypeMetadataFloatTypeMetadataNullType> metadata = null;


  public UpdateSceneItemRequestDataAttributes visible(Boolean visible) {
    
    this.visible = visible;
    return this;
  }

   /**
   * Item visibility.
   * @return visible
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Item visibility.")

  public Boolean getVisible() {
    return visible;
  }


  public void setVisible(Boolean visible) {
    this.visible = visible;
  }


  public UpdateSceneItemRequestDataAttributes materialOverride(MaterialOverride materialOverride) {
    
    this.materialOverride = materialOverride;
    return this;
  }

   /**
   * Get materialOverride
   * @return materialOverride
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MaterialOverride getMaterialOverride() {
    return materialOverride;
  }


  public void setMaterialOverride(MaterialOverride materialOverride) {
    this.materialOverride = materialOverride;
  }


  public UpdateSceneItemRequestDataAttributes transform(Matrix4 transform) {
    
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


  public UpdateSceneItemRequestDataAttributes name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "some-string", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UpdateSceneItemRequestDataAttributes suppliedId(String suppliedId) {
    
    this.suppliedId = suppliedId;
    return this;
  }

   /**
   * ID provided for correlation. For example, an existing ID from a PLM system.
   * @return suppliedId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PN12345", value = "ID provided for correlation. For example, an existing ID from a PLM system.")

  public String getSuppliedId() {
    return suppliedId;
  }


  public void setSuppliedId(String suppliedId) {
    this.suppliedId = suppliedId;
  }


  public UpdateSceneItemRequestDataAttributes metadata(Map<String, AnyOfMetadataStringTypeMetadataFloatTypeMetadataNullType> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public UpdateSceneItemRequestDataAttributes putMetadataItem(String key, AnyOfMetadataStringTypeMetadataFloatTypeMetadataNullType metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Additional metadata for the scene-item. This metadata will take precedence over any metadata that belongs to the part file. 
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional metadata for the scene-item. This metadata will take precedence over any metadata that belongs to the part file. ")

  public Map<String, AnyOfMetadataStringTypeMetadataFloatTypeMetadataNullType> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, AnyOfMetadataStringTypeMetadataFloatTypeMetadataNullType> metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSceneItemRequestDataAttributes updateSceneItemRequestDataAttributes = (UpdateSceneItemRequestDataAttributes) o;
    return Objects.equals(this.visible, updateSceneItemRequestDataAttributes.visible) &&
        Objects.equals(this.materialOverride, updateSceneItemRequestDataAttributes.materialOverride) &&
        Objects.equals(this.transform, updateSceneItemRequestDataAttributes.transform) &&
        Objects.equals(this.name, updateSceneItemRequestDataAttributes.name) &&
        Objects.equals(this.suppliedId, updateSceneItemRequestDataAttributes.suppliedId) &&
        Objects.equals(this.metadata, updateSceneItemRequestDataAttributes.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(visible, materialOverride, transform, name, suppliedId, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSceneItemRequestDataAttributes {\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
    sb.append("    materialOverride: ").append(toIndentedString(materialOverride)).append("\n");
    sb.append("    transform: ").append(toIndentedString(transform)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    suppliedId: ").append(toIndentedString(suppliedId)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

