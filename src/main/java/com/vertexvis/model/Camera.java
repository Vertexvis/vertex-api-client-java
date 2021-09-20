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

/**
 * Camera placement in 3D space.
 */
@ApiModel(description = "Camera placement in 3D space.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Camera {
  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private Vector3 position;

  public static final String SERIALIZED_NAME_LOOK_AT = "lookAt";
  @SerializedName(SERIALIZED_NAME_LOOK_AT)
  private Vector3 lookAt;

  public static final String SERIALIZED_NAME_UP = "up";
  @SerializedName(SERIALIZED_NAME_UP)
  private Vector3 up;


  public Camera position(Vector3 position) {
    
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


  public Camera lookAt(Vector3 lookAt) {
    
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


  public Camera up(Vector3 up) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Camera camera = (Camera) o;
    return Objects.equals(this.position, camera.position) &&
        Objects.equals(this.lookAt, camera.lookAt) &&
        Objects.equals(this.up, camera.up);
  }

  @Override
  public int hashCode() {
    return Objects.hash(position, lookAt, up);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Camera {\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    lookAt: ").append(toIndentedString(lookAt)).append("\n");
    sb.append("    up: ").append(toIndentedString(up)).append("\n");
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

