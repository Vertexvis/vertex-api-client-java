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
import com.vertexvis.model.SceneViewRelationship;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CreateSceneViewStateRequestDataRelationships
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateSceneViewStateRequestDataRelationships {
  public static final String SERIALIZED_NAME_SCENE_VIEW = "sceneView";
  @SerializedName(SERIALIZED_NAME_SCENE_VIEW)
  private SceneViewRelationship sceneView;


  public CreateSceneViewStateRequestDataRelationships sceneView(SceneViewRelationship sceneView) {
    
    this.sceneView = sceneView;
    return this;
  }

   /**
   * Get sceneView
   * @return sceneView
  **/
  @ApiModelProperty(required = true, value = "")

  public SceneViewRelationship getSceneView() {
    return sceneView;
  }


  public void setSceneView(SceneViewRelationship sceneView) {
    this.sceneView = sceneView;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSceneViewStateRequestDataRelationships createSceneViewStateRequestDataRelationships = (CreateSceneViewStateRequestDataRelationships) o;
    return Objects.equals(this.sceneView, createSceneViewStateRequestDataRelationships.sceneView);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sceneView);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSceneViewStateRequestDataRelationships {\n");
    sb.append("    sceneView: ").append(toIndentedString(sceneView)).append("\n");
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

