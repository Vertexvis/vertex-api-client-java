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

/**
 * CreateSceneItemOverrideRequestDataAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateSceneItemOverrideRequestDataAttributes {
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

  public CreateSceneItemOverrideRequestDataAttributes() { 
  }

  public CreateSceneItemOverrideRequestDataAttributes visible(Boolean visible) {
    
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


  public CreateSceneItemOverrideRequestDataAttributes transform(Matrix4 transform) {
    
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


  public CreateSceneItemOverrideRequestDataAttributes material(ColorMaterial material) {
    
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


  public CreateSceneItemOverrideRequestDataAttributes selected(ColorMaterial selected) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSceneItemOverrideRequestDataAttributes createSceneItemOverrideRequestDataAttributes = (CreateSceneItemOverrideRequestDataAttributes) o;
    return Objects.equals(this.visible, createSceneItemOverrideRequestDataAttributes.visible) &&
        Objects.equals(this.transform, createSceneItemOverrideRequestDataAttributes.transform) &&
        Objects.equals(this.material, createSceneItemOverrideRequestDataAttributes.material) &&
        Objects.equals(this.selected, createSceneItemOverrideRequestDataAttributes.selected);
  }

  @Override
  public int hashCode() {
    return Objects.hash(visible, transform, material, selected);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSceneItemOverrideRequestDataAttributes {\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
    sb.append("    transform: ").append(toIndentedString(transform)).append("\n");
    sb.append("    material: ").append(toIndentedString(material)).append("\n");
    sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
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

