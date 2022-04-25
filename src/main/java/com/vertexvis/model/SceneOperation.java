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
import com.vertexvis.model.SceneOperationOperationsInner;
import com.vertexvis.model.SceneOperationQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SceneOperation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SceneOperation {
  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  private SceneOperationQuery query;

  public static final String SERIALIZED_NAME_OPERATIONS = "operations";
  @SerializedName(SERIALIZED_NAME_OPERATIONS)
  private List<SceneOperationOperationsInner> operations = new ArrayList<>();


  public SceneOperation query(SceneOperationQuery query) {
    
    this.query = query;
    return this;
  }

   /**
   * Get query
   * @return query
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public SceneOperationQuery getQuery() {
    return query;
  }


  public void setQuery(SceneOperationQuery query) {
    this.query = query;
  }


  public SceneOperation operations(List<SceneOperationOperationsInner> operations) {
    
    this.operations = operations;
    return this;
  }

  public SceneOperation addOperationsItem(SceneOperationOperationsInner operationsItem) {
    this.operations.add(operationsItem);
    return this;
  }

   /**
   * List of operations to perform on &#x60;scene-items&#x60; matching the query.
   * @return operations
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "List of operations to perform on `scene-items` matching the query.")

  public List<SceneOperationOperationsInner> getOperations() {
    return operations;
  }


  public void setOperations(List<SceneOperationOperationsInner> operations) {
    this.operations = operations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SceneOperation sceneOperation = (SceneOperation) o;
    return Objects.equals(this.query, sceneOperation.query) &&
        Objects.equals(this.operations, sceneOperation.operations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, operations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SceneOperation {\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
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

