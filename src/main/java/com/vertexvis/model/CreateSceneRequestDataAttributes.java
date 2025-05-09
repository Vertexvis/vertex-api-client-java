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
import com.vertexvis.model.Orientation;
import com.vertexvis.model.OrthographicCamera;
import com.vertexvis.model.PerspectiveCamera;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * CreateSceneRequestDataAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateSceneRequestDataAttributes {
  public static final String SERIALIZED_NAME_CAMERA = "camera";
  @SerializedName(SERIALIZED_NAME_CAMERA)
  private OneOfPerspectiveCameraOrthographicCamera camera;

  public static final String SERIALIZED_NAME_SUPPLIED_ID = "suppliedId";
  @SerializedName(SERIALIZED_NAME_SUPPLIED_ID)
  private String suppliedId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TREE_ENABLED = "treeEnabled";
  @SerializedName(SERIALIZED_NAME_TREE_ENABLED)
  private Boolean treeEnabled;

  public static final String SERIALIZED_NAME_WORLD_ORIENTATION = "worldOrientation";
  @SerializedName(SERIALIZED_NAME_WORLD_ORIENTATION)
  private Orientation worldOrientation;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = null;

  public static final String SERIALIZED_NAME_EXPIRY = "expiry";
  @SerializedName(SERIALIZED_NAME_EXPIRY)
  private Integer expiry;

  public CreateSceneRequestDataAttributes() { 
  }

  public CreateSceneRequestDataAttributes camera(OneOfPerspectiveCameraOrthographicCamera camera) {
    
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


  public CreateSceneRequestDataAttributes suppliedId(String suppliedId) {
    
    this.suppliedId = suppliedId;
    return this;
  }

   /**
   * ID provided for correlation. For example, an existing ID from a PLM system.
   * @return suppliedId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PN12345", value = "ID provided for correlation. For example, an existing ID from a PLM system.")

  public String getSuppliedId() {
    return suppliedId;
  }


  public void setSuppliedId(String suppliedId) {
    this.suppliedId = suppliedId;
  }


  public CreateSceneRequestDataAttributes name(String name) {
    
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


  public CreateSceneRequestDataAttributes treeEnabled(Boolean treeEnabled) {
    
    this.treeEnabled = treeEnabled;
    return this;
  }

   /**
   * Get treeEnabled
   * @return treeEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getTreeEnabled() {
    return treeEnabled;
  }


  public void setTreeEnabled(Boolean treeEnabled) {
    this.treeEnabled = treeEnabled;
  }


  public CreateSceneRequestDataAttributes worldOrientation(Orientation worldOrientation) {
    
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


  public CreateSceneRequestDataAttributes metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public CreateSceneRequestDataAttributes putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * User supplied key-value pairs for a scene. You can supply up to 50 entries, with key names limited to 64 characters and values limited to 256 characters. A null value will delete the entry in the map, all other key/value pairs provided here will be inserted or updated into the existing scene metadata. 
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User supplied key-value pairs for a scene. You can supply up to 50 entries, with key names limited to 64 characters and values limited to 256 characters. A null value will delete the entry in the map, all other key/value pairs provided here will be inserted or updated into the existing scene metadata. ")

  public Map<String, String> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }


  public CreateSceneRequestDataAttributes expiry(Integer expiry) {
    
    this.expiry = expiry;
    return this;
  }

   /**
   * Number of seconds before expiration
   * minimum: 1
   * @return expiry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "600", value = "Number of seconds before expiration")

  public Integer getExpiry() {
    return expiry;
  }


  public void setExpiry(Integer expiry) {
    this.expiry = expiry;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSceneRequestDataAttributes createSceneRequestDataAttributes = (CreateSceneRequestDataAttributes) o;
    return Objects.equals(this.camera, createSceneRequestDataAttributes.camera) &&
        Objects.equals(this.suppliedId, createSceneRequestDataAttributes.suppliedId) &&
        Objects.equals(this.name, createSceneRequestDataAttributes.name) &&
        Objects.equals(this.treeEnabled, createSceneRequestDataAttributes.treeEnabled) &&
        Objects.equals(this.worldOrientation, createSceneRequestDataAttributes.worldOrientation) &&
        Objects.equals(this.metadata, createSceneRequestDataAttributes.metadata) &&
        Objects.equals(this.expiry, createSceneRequestDataAttributes.expiry);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(camera, suppliedId, name, treeEnabled, worldOrientation, metadata, expiry);
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
    sb.append("class CreateSceneRequestDataAttributes {\n");
    sb.append("    camera: ").append(toIndentedString(camera)).append("\n");
    sb.append("    suppliedId: ").append(toIndentedString(suppliedId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    treeEnabled: ").append(toIndentedString(treeEnabled)).append("\n");
    sb.append("    worldOrientation: ").append(toIndentedString(worldOrientation)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    expiry: ").append(toIndentedString(expiry)).append("\n");
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

