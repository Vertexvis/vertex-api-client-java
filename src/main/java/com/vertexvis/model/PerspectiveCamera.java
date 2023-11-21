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
import com.vertexvis.model.Vector3;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A camera type that mimics the way the human eye sees.
 */
@ApiModel(description = "A camera type that mimics the way the human eye sees.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PerspectiveCamera {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private Vector3 position;

  public static final String SERIALIZED_NAME_LOOK_AT = "lookAt";
  @SerializedName(SERIALIZED_NAME_LOOK_AT)
  private Vector3 lookAt;

  public static final String SERIALIZED_NAME_UP = "up";
  @SerializedName(SERIALIZED_NAME_UP)
  private Vector3 up;

  public static final String SERIALIZED_NAME_FOV_Y = "fovY";
  @SerializedName(SERIALIZED_NAME_FOV_Y)
  private Float fovY;

  public PerspectiveCamera() { 
  }

  public PerspectiveCamera type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "perspective", value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public PerspectiveCamera position(Vector3 position) {
    
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Vector3 getPosition() {
    return position;
  }


  public void setPosition(Vector3 position) {
    this.position = position;
  }


  public PerspectiveCamera lookAt(Vector3 lookAt) {
    
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


  public PerspectiveCamera up(Vector3 up) {
    
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


  public PerspectiveCamera fovY(Float fovY) {
    
    this.fovY = fovY;
    return this;
  }

   /**
   * A numerical floating-point value representing the field of view
   * minimum: 1
   * maximum: 179
   * @return fovY
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A numerical floating-point value representing the field of view")

  public Float getFovY() {
    return fovY;
  }


  public void setFovY(Float fovY) {
    this.fovY = fovY;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PerspectiveCamera perspectiveCamera = (PerspectiveCamera) o;
    return Objects.equals(this.type, perspectiveCamera.type) &&
        Objects.equals(this.position, perspectiveCamera.position) &&
        Objects.equals(this.lookAt, perspectiveCamera.lookAt) &&
        Objects.equals(this.up, perspectiveCamera.up) &&
        Objects.equals(this.fovY, perspectiveCamera.fovY);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, position, lookAt, up, fovY);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PerspectiveCamera {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    lookAt: ").append(toIndentedString(lookAt)).append("\n");
    sb.append("    up: ").append(toIndentedString(up)).append("\n");
    sb.append("    fovY: ").append(toIndentedString(fovY)).append("\n");
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

