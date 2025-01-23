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
import com.vertexvis.model.SceneAnnotationCalloutDataType;
import com.vertexvis.model.SceneAnnotationCustomDataType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CreateSceneAnnotationRequestDataAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateSceneAnnotationRequestDataAttributes {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private OneOfSceneAnnotationCalloutDataTypeSceneAnnotationCustomDataType data;

  public static final String SERIALIZED_NAME_SUPPLIED_ID = "suppliedId";
  @SerializedName(SERIALIZED_NAME_SUPPLIED_ID)
  private String suppliedId;

  public CreateSceneAnnotationRequestDataAttributes() { 
  }

  public CreateSceneAnnotationRequestDataAttributes data(OneOfSceneAnnotationCalloutDataTypeSceneAnnotationCustomDataType data) {
    
    this.data = data;
    return this;
  }

   /**
   * The data describing how to render this annotation.
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The data describing how to render this annotation.")

  public OneOfSceneAnnotationCalloutDataTypeSceneAnnotationCustomDataType getData() {
    return data;
  }


  public void setData(OneOfSceneAnnotationCalloutDataTypeSceneAnnotationCustomDataType data) {
    this.data = data;
  }


  public CreateSceneAnnotationRequestDataAttributes suppliedId(String suppliedId) {
    
    this.suppliedId = suppliedId;
    return this;
  }

   /**
   * A customer provided ID used for correlation.
   * @return suppliedId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PN12345", value = "A customer provided ID used for correlation.")

  public String getSuppliedId() {
    return suppliedId;
  }


  public void setSuppliedId(String suppliedId) {
    this.suppliedId = suppliedId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSceneAnnotationRequestDataAttributes createSceneAnnotationRequestDataAttributes = (CreateSceneAnnotationRequestDataAttributes) o;
    return Objects.equals(this.data, createSceneAnnotationRequestDataAttributes.data) &&
        Objects.equals(this.suppliedId, createSceneAnnotationRequestDataAttributes.suppliedId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, suppliedId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSceneAnnotationRequestDataAttributes {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    suppliedId: ").append(toIndentedString(suppliedId)).append("\n");
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

