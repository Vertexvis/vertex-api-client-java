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
import com.vertexvis.model.Orientation;
import com.vertexvis.model.OrthographicCamera;
import com.vertexvis.model.PerspectiveCamera;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * SceneDataAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SceneDataAttributes {
  public static final String SERIALIZED_NAME_CAMERA = "camera";
  @SerializedName(SERIALIZED_NAME_CAMERA)
  private OneOfPerspectiveCameraOrthographicCamera camera;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_SUPPLIED_ID = "suppliedId";
  @SerializedName(SERIALIZED_NAME_SUPPLIED_ID)
  private String suppliedId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TREE_ENABLED = "treeEnabled";
  @SerializedName(SERIALIZED_NAME_TREE_ENABLED)
  private Boolean treeEnabled;

  public static final String SERIALIZED_NAME_MODIFIED = "modified";
  @SerializedName(SERIALIZED_NAME_MODIFIED)
  private OffsetDateTime modified;

  public static final String SERIALIZED_NAME_WORLD_ORIENTATION = "worldOrientation";
  @SerializedName(SERIALIZED_NAME_WORLD_ORIENTATION)
  private Orientation worldOrientation;

  public static final String SERIALIZED_NAME_SCENE_ITEM_COUNT = "sceneItemCount";
  @SerializedName(SERIALIZED_NAME_SCENE_ITEM_COUNT)
  private Integer sceneItemCount;

  public SceneDataAttributes() { 
  }

  public SceneDataAttributes camera(OneOfPerspectiveCameraOrthographicCamera camera) {
    
    this.camera = camera;
    return this;
  }

   /**
   * Get camera
   * @return camera
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OneOfPerspectiveCameraOrthographicCamera getCamera() {
    return camera;
  }


  public void setCamera(OneOfPerspectiveCameraOrthographicCamera camera) {
    this.camera = camera;
  }


  public SceneDataAttributes state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "draft", value = "")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public SceneDataAttributes created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-01-01T12:00Z", value = "")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public SceneDataAttributes suppliedId(String suppliedId) {
    
    this.suppliedId = suppliedId;
    return this;
  }

   /**
   * Get suppliedId
   * @return suppliedId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "some-string", value = "")

  public String getSuppliedId() {
    return suppliedId;
  }


  public void setSuppliedId(String suppliedId) {
    this.suppliedId = suppliedId;
  }


  public SceneDataAttributes name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "some-string", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SceneDataAttributes treeEnabled(Boolean treeEnabled) {
    
    this.treeEnabled = treeEnabled;
    return this;
  }

   /**
   * Get treeEnabled
   * @return treeEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getTreeEnabled() {
    return treeEnabled;
  }


  public void setTreeEnabled(Boolean treeEnabled) {
    this.treeEnabled = treeEnabled;
  }


  public SceneDataAttributes modified(OffsetDateTime modified) {
    
    this.modified = modified;
    return this;
  }

   /**
   * Get modified
   * @return modified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-01-01T12:00Z", value = "")

  public OffsetDateTime getModified() {
    return modified;
  }


  public void setModified(OffsetDateTime modified) {
    this.modified = modified;
  }


  public SceneDataAttributes worldOrientation(Orientation worldOrientation) {
    
    this.worldOrientation = worldOrientation;
    return this;
  }

   /**
   * Get worldOrientation
   * @return worldOrientation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Orientation getWorldOrientation() {
    return worldOrientation;
  }


  public void setWorldOrientation(Orientation worldOrientation) {
    this.worldOrientation = worldOrientation;
  }


  public SceneDataAttributes sceneItemCount(Integer sceneItemCount) {
    
    this.sceneItemCount = sceneItemCount;
    return this;
  }

   /**
   * The number of scene items in this scene. (This field needs to be explicitly requested)
   * @return sceneItemCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "The number of scene items in this scene. (This field needs to be explicitly requested)")

  public Integer getSceneItemCount() {
    return sceneItemCount;
  }


  public void setSceneItemCount(Integer sceneItemCount) {
    this.sceneItemCount = sceneItemCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SceneDataAttributes sceneDataAttributes = (SceneDataAttributes) o;
    return Objects.equals(this.camera, sceneDataAttributes.camera) &&
        Objects.equals(this.state, sceneDataAttributes.state) &&
        Objects.equals(this.created, sceneDataAttributes.created) &&
        Objects.equals(this.suppliedId, sceneDataAttributes.suppliedId) &&
        Objects.equals(this.name, sceneDataAttributes.name) &&
        Objects.equals(this.treeEnabled, sceneDataAttributes.treeEnabled) &&
        Objects.equals(this.modified, sceneDataAttributes.modified) &&
        Objects.equals(this.worldOrientation, sceneDataAttributes.worldOrientation) &&
        Objects.equals(this.sceneItemCount, sceneDataAttributes.sceneItemCount);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(camera, state, created, suppliedId, name, treeEnabled, modified, worldOrientation, sceneItemCount);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SceneDataAttributes {\n");
    sb.append("    camera: ").append(toIndentedString(camera)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    suppliedId: ").append(toIndentedString(suppliedId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    treeEnabled: ").append(toIndentedString(treeEnabled)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    worldOrientation: ").append(toIndentedString(worldOrientation)).append("\n");
    sb.append("    sceneItemCount: ").append(toIndentedString(sceneItemCount)).append("\n");
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

