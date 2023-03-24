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
import com.vertexvis.model.Vector4;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * 4x4 affine transformation matrix, see [Matrix transformations](https://developer.vertexvis.com/docs/guides/matrix-transformations) for details.
 */
@ApiModel(description = "4x4 affine transformation matrix, see [Matrix transformations](https://developer.vertexvis.com/docs/guides/matrix-transformations) for details.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Matrix4Nullable {
  public static final String SERIALIZED_NAME_R0 = "r0";
  @SerializedName(SERIALIZED_NAME_R0)
  private Vector4 r0;

  public static final String SERIALIZED_NAME_R1 = "r1";
  @SerializedName(SERIALIZED_NAME_R1)
  private Vector4 r1;

  public static final String SERIALIZED_NAME_R2 = "r2";
  @SerializedName(SERIALIZED_NAME_R2)
  private Vector4 r2;

  public static final String SERIALIZED_NAME_R3 = "r3";
  @SerializedName(SERIALIZED_NAME_R3)
  private Vector4 r3;

  public Matrix4Nullable() { 
  }

  public Matrix4Nullable r0(Vector4 r0) {
    
    this.r0 = r0;
    return this;
  }

   /**
   * Get r0
   * @return r0
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Vector4 getR0() {
    return r0;
  }


  public void setR0(Vector4 r0) {
    this.r0 = r0;
  }


  public Matrix4Nullable r1(Vector4 r1) {
    
    this.r1 = r1;
    return this;
  }

   /**
   * Get r1
   * @return r1
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Vector4 getR1() {
    return r1;
  }


  public void setR1(Vector4 r1) {
    this.r1 = r1;
  }


  public Matrix4Nullable r2(Vector4 r2) {
    
    this.r2 = r2;
    return this;
  }

   /**
   * Get r2
   * @return r2
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Vector4 getR2() {
    return r2;
  }


  public void setR2(Vector4 r2) {
    this.r2 = r2;
  }


  public Matrix4Nullable r3(Vector4 r3) {
    
    this.r3 = r3;
    return this;
  }

   /**
   * Get r3
   * @return r3
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Vector4 getR3() {
    return r3;
  }


  public void setR3(Vector4 r3) {
    this.r3 = r3;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Matrix4Nullable matrix4Nullable = (Matrix4Nullable) o;
    return Objects.equals(this.r0, matrix4Nullable.r0) &&
        Objects.equals(this.r1, matrix4Nullable.r1) &&
        Objects.equals(this.r2, matrix4Nullable.r2) &&
        Objects.equals(this.r3, matrix4Nullable.r3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(r0, r1, r2, r3);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Matrix4Nullable {\n");
    sb.append("    r0: ").append(toIndentedString(r0)).append("\n");
    sb.append("    r1: ").append(toIndentedString(r1)).append("\n");
    sb.append("    r2: ").append(toIndentedString(r2)).append("\n");
    sb.append("    r3: ").append(toIndentedString(r3)).append("\n");
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

