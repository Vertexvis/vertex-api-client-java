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
import com.vertexvis.model.BatchOperation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CreateBatchRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateBatchRequest {
  public static final String SERIALIZED_NAME_VERTEXVIS_BATCH_COLON_OPERATIONS = "vertexvis/batch:operations";
  @SerializedName(SERIALIZED_NAME_VERTEXVIS_BATCH_COLON_OPERATIONS)
  private List<BatchOperation> vertexvisBatchColonOperations = new ArrayList<>();

  public CreateBatchRequest() { 
  }

  public CreateBatchRequest vertexvisBatchColonOperations(List<BatchOperation> vertexvisBatchColonOperations) {
    
    this.vertexvisBatchColonOperations = vertexvisBatchColonOperations;
    return this;
  }

  public CreateBatchRequest addVertexvisBatchColonOperationsItem(BatchOperation vertexvisBatchColonOperationsItem) {
    this.vertexvisBatchColonOperations.add(vertexvisBatchColonOperationsItem);
    return this;
  }

   /**
   * List of operations to perform as a batch.
   * @return vertexvisBatchColonOperations
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "List of operations to perform as a batch.")

  public List<BatchOperation> getVertexvisBatchColonOperations() {
    return vertexvisBatchColonOperations;
  }


  public void setVertexvisBatchColonOperations(List<BatchOperation> vertexvisBatchColonOperations) {
    this.vertexvisBatchColonOperations = vertexvisBatchColonOperations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateBatchRequest createBatchRequest = (CreateBatchRequest) o;
    return Objects.equals(this.vertexvisBatchColonOperations, createBatchRequest.vertexvisBatchColonOperations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vertexvisBatchColonOperations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBatchRequest {\n");
    sb.append("    vertexvisBatchColonOperations: ").append(toIndentedString(vertexvisBatchColonOperations)).append("\n");
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

