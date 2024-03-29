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

/**
 * RGB color.
 */
@ApiModel(description = "RGB color.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Color3 {
  public static final String SERIALIZED_NAME_R = "r";
  @SerializedName(SERIALIZED_NAME_R)
  private Integer r;

  public static final String SERIALIZED_NAME_G = "g";
  @SerializedName(SERIALIZED_NAME_G)
  private Integer g;

  public static final String SERIALIZED_NAME_B = "b";
  @SerializedName(SERIALIZED_NAME_B)
  private Integer b;

  public Color3() { 
  }

  public Color3 r(Integer r) {
    
    this.r = r;
    return this;
  }

   /**
   * Color value from 0 to 255.
   * minimum: 0
   * maximum: 255
   * @return r
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "255", required = true, value = "Color value from 0 to 255.")

  public Integer getR() {
    return r;
  }


  public void setR(Integer r) {
    this.r = r;
  }


  public Color3 g(Integer g) {
    
    this.g = g;
    return this;
  }

   /**
   * Color value from 0 to 255.
   * minimum: 0
   * maximum: 255
   * @return g
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "255", required = true, value = "Color value from 0 to 255.")

  public Integer getG() {
    return g;
  }


  public void setG(Integer g) {
    this.g = g;
  }


  public Color3 b(Integer b) {
    
    this.b = b;
    return this;
  }

   /**
   * Color value from 0 to 255.
   * minimum: 0
   * maximum: 255
   * @return b
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "255", required = true, value = "Color value from 0 to 255.")

  public Integer getB() {
    return b;
  }


  public void setB(Integer b) {
    this.b = b;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Color3 color3 = (Color3) o;
    return Objects.equals(this.r, color3.r) &&
        Objects.equals(this.g, color3.g) &&
        Objects.equals(this.b, color3.b);
  }

  @Override
  public int hashCode() {
    return Objects.hash(r, g, b);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Color3 {\n");
    sb.append("    r: ").append(toIndentedString(r)).append("\n");
    sb.append("    g: ").append(toIndentedString(g)).append("\n");
    sb.append("    b: ").append(toIndentedString(b)).append("\n");
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

