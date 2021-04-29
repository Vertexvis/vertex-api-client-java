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
import com.vertexvis.model.BoundingBox;
import com.vertexvis.model.ColorMaterial;
import com.vertexvis.model.Matrix4;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * SceneItemDataAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-29T18:33:10.334418Z[Etc/UTC]")
public class SceneItemDataAttributes {
  public static final String SERIALIZED_NAME_SUPPLIED_ID = "suppliedId";
  @SerializedName(SERIALIZED_NAME_SUPPLIED_ID)
  private String suppliedId;

  public static final String SERIALIZED_NAME_VISIBLE = "visible";
  @SerializedName(SERIALIZED_NAME_VISIBLE)
  private Boolean visible;

  public static final String SERIALIZED_NAME_TRANSFORM = "transform";
  @SerializedName(SERIALIZED_NAME_TRANSFORM)
  private Matrix4 transform;

  public static final String SERIALIZED_NAME_MATERIAL_OVERRIDE = "materialOverride";
  @SerializedName(SERIALIZED_NAME_MATERIAL_OVERRIDE)
  private ColorMaterial materialOverride;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_BOUNDING_BOX = "boundingBox";
  @SerializedName(SERIALIZED_NAME_BOUNDING_BOX)
  private BoundingBox boundingBox;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public SceneItemDataAttributes suppliedId(String suppliedId) {
    
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


  public SceneItemDataAttributes visible(Boolean visible) {
    
    this.visible = visible;
    return this;
  }

   /**
   * Get visible
   * @return visible
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getVisible() {
    return visible;
  }


  public void setVisible(Boolean visible) {
    this.visible = visible;
  }


  public SceneItemDataAttributes transform(Matrix4 transform) {
    
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


  public SceneItemDataAttributes materialOverride(ColorMaterial materialOverride) {
    
    this.materialOverride = materialOverride;
    return this;
  }

   /**
   * Get materialOverride
   * @return materialOverride
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ColorMaterial getMaterialOverride() {
    return materialOverride;
  }


  public void setMaterialOverride(ColorMaterial materialOverride) {
    this.materialOverride = materialOverride;
  }


  public SceneItemDataAttributes created(OffsetDateTime created) {
    
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


  public SceneItemDataAttributes boundingBox(BoundingBox boundingBox) {
    
    this.boundingBox = boundingBox;
    return this;
  }

   /**
   * Get boundingBox
   * @return boundingBox
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BoundingBox getBoundingBox() {
    return boundingBox;
  }


  public void setBoundingBox(BoundingBox boundingBox) {
    this.boundingBox = boundingBox;
  }


  public SceneItemDataAttributes name(String name) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SceneItemDataAttributes sceneItemDataAttributes = (SceneItemDataAttributes) o;
    return Objects.equals(this.suppliedId, sceneItemDataAttributes.suppliedId) &&
        Objects.equals(this.visible, sceneItemDataAttributes.visible) &&
        Objects.equals(this.transform, sceneItemDataAttributes.transform) &&
        Objects.equals(this.materialOverride, sceneItemDataAttributes.materialOverride) &&
        Objects.equals(this.created, sceneItemDataAttributes.created) &&
        Objects.equals(this.boundingBox, sceneItemDataAttributes.boundingBox) &&
        Objects.equals(this.name, sceneItemDataAttributes.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(suppliedId, visible, transform, materialOverride, created, boundingBox, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SceneItemDataAttributes {\n");
    sb.append("    suppliedId: ").append(toIndentedString(suppliedId)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
    sb.append("    transform: ").append(toIndentedString(transform)).append("\n");
    sb.append("    materialOverride: ").append(toIndentedString(materialOverride)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    boundingBox: ").append(toIndentedString(boundingBox)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

