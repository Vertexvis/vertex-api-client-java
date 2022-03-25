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
import com.vertexvis.model.Vector3;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * A camera type where an object&#39;s size stays consistent regardless of its distance to the camera.
 */
@ApiModel(description = "A camera type where an object's size stays consistent regardless of its distance to the camera.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OrthographicCamera {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_VIEW_VECTOR = "viewVector";
  @SerializedName(SERIALIZED_NAME_VIEW_VECTOR)
  private Vector3 viewVector;

  public static final String SERIALIZED_NAME_LOOK_AT = "lookAt";
  @SerializedName(SERIALIZED_NAME_LOOK_AT)
  private Vector3 lookAt;

  public static final String SERIALIZED_NAME_UP = "up";
  @SerializedName(SERIALIZED_NAME_UP)
  private Vector3 up;

  public static final String SERIALIZED_NAME_FOV_HEIGHT = "fovHeight";
  @SerializedName(SERIALIZED_NAME_FOV_HEIGHT)
  private BigDecimal fovHeight;


  public OrthographicCamera type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "orthographic", value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public OrthographicCamera viewVector(Vector3 viewVector) {
    
    this.viewVector = viewVector;
    return this;
  }

   /**
   * Get viewVector
   * @return viewVector
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Vector3 getViewVector() {
    return viewVector;
  }


  public void setViewVector(Vector3 viewVector) {
    this.viewVector = viewVector;
  }


  public OrthographicCamera lookAt(Vector3 lookAt) {
    
    this.lookAt = lookAt;
    return this;
  }

   /**
   * Get lookAt
   * @return lookAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Vector3 getLookAt() {
    return lookAt;
  }


  public void setLookAt(Vector3 lookAt) {
    this.lookAt = lookAt;
  }


  public OrthographicCamera up(Vector3 up) {
    
    this.up = up;
    return this;
  }

   /**
   * Get up
   * @return up
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Vector3 getUp() {
    return up;
  }


  public void setUp(Vector3 up) {
    this.up = up;
  }


  public OrthographicCamera fovHeight(BigDecimal fovHeight) {
    
    this.fovHeight = fovHeight;
    return this;
  }

   /**
   * Get fovHeight
   * @return fovHeight
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getFovHeight() {
    return fovHeight;
  }


  public void setFovHeight(BigDecimal fovHeight) {
    this.fovHeight = fovHeight;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrthographicCamera orthographicCamera = (OrthographicCamera) o;
    return Objects.equals(this.type, orthographicCamera.type) &&
        Objects.equals(this.viewVector, orthographicCamera.viewVector) &&
        Objects.equals(this.lookAt, orthographicCamera.lookAt) &&
        Objects.equals(this.up, orthographicCamera.up) &&
        Objects.equals(this.fovHeight, orthographicCamera.fovHeight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, viewVector, lookAt, up, fovHeight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrthographicCamera {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    viewVector: ").append(toIndentedString(viewVector)).append("\n");
    sb.append("    lookAt: ").append(toIndentedString(lookAt)).append("\n");
    sb.append("    up: ").append(toIndentedString(up)).append("\n");
    sb.append("    fovHeight: ").append(toIndentedString(fovHeight)).append("\n");
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
