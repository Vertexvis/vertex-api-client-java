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
import com.vertexvis.model.ColorMaterial;
import com.vertexvis.model.Matrix4;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * SceneItemOverrideDataAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SceneItemOverrideDataAttributes {
  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_VISIBLE = "visible";
  @SerializedName(SERIALIZED_NAME_VISIBLE)
  private Boolean visible;

  public static final String SERIALIZED_NAME_TRANSFORM = "transform";
  @SerializedName(SERIALIZED_NAME_TRANSFORM)
  private Matrix4 transform;

  public static final String SERIALIZED_NAME_MATERIAL = "material";
  @SerializedName(SERIALIZED_NAME_MATERIAL)
  private ColorMaterial material;

  public static final String SERIALIZED_NAME_SELECTED = "selected";
  @SerializedName(SERIALIZED_NAME_SELECTED)
  private ColorMaterial selected;

  public static final String SERIALIZED_NAME_PHANTOM = "phantom";
  @SerializedName(SERIALIZED_NAME_PHANTOM)
  private Boolean phantom;

  public SceneItemOverrideDataAttributes() { 
  }

  public SceneItemOverrideDataAttributes created(OffsetDateTime created) {
    
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


  public SceneItemOverrideDataAttributes visible(Boolean visible) {
    
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


  public SceneItemOverrideDataAttributes transform(Matrix4 transform) {
    
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


  public SceneItemOverrideDataAttributes material(ColorMaterial material) {
    
    this.material = material;
    return this;
  }

   /**
   * Get material
   * @return material
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ColorMaterial getMaterial() {
    return material;
  }


  public void setMaterial(ColorMaterial material) {
    this.material = material;
  }


  public SceneItemOverrideDataAttributes selected(ColorMaterial selected) {
    
    this.selected = selected;
    return this;
  }

   /**
   * Get selected
   * @return selected
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ColorMaterial getSelected() {
    return selected;
  }


  public void setSelected(ColorMaterial selected) {
    this.selected = selected;
  }


  public SceneItemOverrideDataAttributes phantom(Boolean phantom) {
    
    this.phantom = phantom;
    return this;
  }

   /**
   * Get phantom
   * @return phantom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPhantom() {
    return phantom;
  }


  public void setPhantom(Boolean phantom) {
    this.phantom = phantom;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SceneItemOverrideDataAttributes sceneItemOverrideDataAttributes = (SceneItemOverrideDataAttributes) o;
    return Objects.equals(this.created, sceneItemOverrideDataAttributes.created) &&
        Objects.equals(this.visible, sceneItemOverrideDataAttributes.visible) &&
        Objects.equals(this.transform, sceneItemOverrideDataAttributes.transform) &&
        Objects.equals(this.material, sceneItemOverrideDataAttributes.material) &&
        Objects.equals(this.selected, sceneItemOverrideDataAttributes.selected) &&
        Objects.equals(this.phantom, sceneItemOverrideDataAttributes.phantom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, visible, transform, material, selected, phantom);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SceneItemOverrideDataAttributes {\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
    sb.append("    transform: ").append(toIndentedString(transform)).append("\n");
    sb.append("    material: ").append(toIndentedString(material)).append("\n");
    sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
    sb.append("    phantom: ").append(toIndentedString(phantom)).append("\n");
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

