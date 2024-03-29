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
import com.vertexvis.model.ColorMaterialNullable;
import com.vertexvis.model.Matrix4Nullable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * UpdateSceneItemOverrideRequestDataAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateSceneItemOverrideRequestDataAttributes {
  public static final String SERIALIZED_NAME_VISIBLE = "visible";
  @SerializedName(SERIALIZED_NAME_VISIBLE)
  private Boolean visible;

  public static final String SERIALIZED_NAME_TRANSFORM = "transform";
  @SerializedName(SERIALIZED_NAME_TRANSFORM)
  private Matrix4Nullable transform;

  public static final String SERIALIZED_NAME_MATERIAL = "material";
  @SerializedName(SERIALIZED_NAME_MATERIAL)
  private ColorMaterialNullable material;

  public static final String SERIALIZED_NAME_SELECTED = "selected";
  @SerializedName(SERIALIZED_NAME_SELECTED)
  private Boolean selected;

  public static final String SERIALIZED_NAME_PHANTOM = "phantom";
  @SerializedName(SERIALIZED_NAME_PHANTOM)
  private Boolean phantom;

  public static final String SERIALIZED_NAME_END_ITEM = "endItem";
  @SerializedName(SERIALIZED_NAME_END_ITEM)
  private Boolean endItem;

  public UpdateSceneItemOverrideRequestDataAttributes() { 
  }

  public UpdateSceneItemOverrideRequestDataAttributes visible(Boolean visible) {
    
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


  public UpdateSceneItemOverrideRequestDataAttributes transform(Matrix4Nullable transform) {
    
    this.transform = transform;
    return this;
  }

   /**
   * Get transform
   * @return transform
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Matrix4Nullable getTransform() {
    return transform;
  }


  public void setTransform(Matrix4Nullable transform) {
    this.transform = transform;
  }


  public UpdateSceneItemOverrideRequestDataAttributes material(ColorMaterialNullable material) {
    
    this.material = material;
    return this;
  }

   /**
   * Get material
   * @return material
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ColorMaterialNullable getMaterial() {
    return material;
  }


  public void setMaterial(ColorMaterialNullable material) {
    this.material = material;
  }


  public UpdateSceneItemOverrideRequestDataAttributes selected(Boolean selected) {
    
    this.selected = selected;
    return this;
  }

   /**
   * Get selected
   * @return selected
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSelected() {
    return selected;
  }


  public void setSelected(Boolean selected) {
    this.selected = selected;
  }


  public UpdateSceneItemOverrideRequestDataAttributes phantom(Boolean phantom) {
    
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


  public UpdateSceneItemOverrideRequestDataAttributes endItem(Boolean endItem) {
    
    this.endItem = endItem;
    return this;
  }

   /**
   * Get endItem
   * @return endItem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEndItem() {
    return endItem;
  }


  public void setEndItem(Boolean endItem) {
    this.endItem = endItem;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSceneItemOverrideRequestDataAttributes updateSceneItemOverrideRequestDataAttributes = (UpdateSceneItemOverrideRequestDataAttributes) o;
    return Objects.equals(this.visible, updateSceneItemOverrideRequestDataAttributes.visible) &&
        Objects.equals(this.transform, updateSceneItemOverrideRequestDataAttributes.transform) &&
        Objects.equals(this.material, updateSceneItemOverrideRequestDataAttributes.material) &&
        Objects.equals(this.selected, updateSceneItemOverrideRequestDataAttributes.selected) &&
        Objects.equals(this.phantom, updateSceneItemOverrideRequestDataAttributes.phantom) &&
        Objects.equals(this.endItem, updateSceneItemOverrideRequestDataAttributes.endItem);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(visible, transform, material, selected, phantom, endItem);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSceneItemOverrideRequestDataAttributes {\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
    sb.append("    transform: ").append(toIndentedString(transform)).append("\n");
    sb.append("    material: ").append(toIndentedString(material)).append("\n");
    sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
    sb.append("    phantom: ").append(toIndentedString(phantom)).append("\n");
    sb.append("    endItem: ").append(toIndentedString(endItem)).append("\n");
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

