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
import com.vertexvis.model.SceneOperation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CreateSceneAlterationRequestDataAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateSceneAlterationRequestDataAttributes {
  public static final String SERIALIZED_NAME_ALTERATIONS = "alterations";
  @SerializedName(SERIALIZED_NAME_ALTERATIONS)
  private List<SceneOperation> alterations = new ArrayList<>();

  public CreateSceneAlterationRequestDataAttributes() { 
  }

  public CreateSceneAlterationRequestDataAttributes alterations(List<SceneOperation> alterations) {
    
    this.alterations = alterations;
    return this;
  }

  public CreateSceneAlterationRequestDataAttributes addAlterationsItem(SceneOperation alterationsItem) {
    this.alterations.add(alterationsItem);
    return this;
  }

   /**
   * List of alterations to apply.
   * @return alterations
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "List of alterations to apply.")

  public List<SceneOperation> getAlterations() {
    return alterations;
  }


  public void setAlterations(List<SceneOperation> alterations) {
    this.alterations = alterations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSceneAlterationRequestDataAttributes createSceneAlterationRequestDataAttributes = (CreateSceneAlterationRequestDataAttributes) o;
    return Objects.equals(this.alterations, createSceneAlterationRequestDataAttributes.alterations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alterations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSceneAlterationRequestDataAttributes {\n");
    sb.append("    alterations: ").append(toIndentedString(alterations)).append("\n");
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

