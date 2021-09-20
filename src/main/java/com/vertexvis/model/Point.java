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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * 2D point.
 */
@ApiModel(description = "2D point.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Point {
  public static final String SERIALIZED_NAME_DX = "dx";
  @SerializedName(SERIALIZED_NAME_DX)
  private Integer dx;

  public static final String SERIALIZED_NAME_DY = "dy";
  @SerializedName(SERIALIZED_NAME_DY)
  private Integer dy;


  public Point dx(Integer dx) {
    
    this.dx = dx;
    return this;
  }

   /**
   * x-axis coordinate.
   * @return dx
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "x-axis coordinate.")

  public Integer getDx() {
    return dx;
  }


  public void setDx(Integer dx) {
    this.dx = dx;
  }


  public Point dy(Integer dy) {
    
    this.dy = dy;
    return this;
  }

   /**
   * y-axis coordinate.
   * @return dy
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "y-axis coordinate.")

  public Integer getDy() {
    return dy;
  }


  public void setDy(Integer dy) {
    this.dy = dy;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Point point = (Point) o;
    return Objects.equals(this.dx, point.dx) &&
        Objects.equals(this.dy, point.dy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dx, dy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Point {\n");
    sb.append("    dx: ").append(toIndentedString(dx)).append("\n");
    sb.append("    dy: ").append(toIndentedString(dy)).append("\n");
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

