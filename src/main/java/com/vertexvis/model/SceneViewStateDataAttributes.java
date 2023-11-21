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
import com.vertexvis.model.FeatureLines;
import com.vertexvis.model.OrthographicCamera;
import com.vertexvis.model.PerspectiveCamera;
import com.vertexvis.model.ThumbnailData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * SceneViewStateDataAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SceneViewStateDataAttributes {
  public static final String SERIALIZED_NAME_CAMERA = "camera";
  @SerializedName(SERIALIZED_NAME_CAMERA)
  private OneOfPerspectiveCameraOrthographicCamera camera;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_THUMBNAILS = "thumbnails";
  @SerializedName(SERIALIZED_NAME_THUMBNAILS)
  private List<ThumbnailData> thumbnails = null;

  public static final String SERIALIZED_NAME_FEATURE_LINES = "featureLines";
  @SerializedName(SERIALIZED_NAME_FEATURE_LINES)
  private FeatureLines featureLines;

  public static final String SERIALIZED_NAME_NO_DEFAULT_LIGHTS = "noDefaultLights";
  @SerializedName(SERIALIZED_NAME_NO_DEFAULT_LIGHTS)
  private Boolean noDefaultLights;

  public static final String SERIALIZED_NAME_SUPPLIED_ID = "suppliedId";
  @SerializedName(SERIALIZED_NAME_SUPPLIED_ID)
  private String suppliedId;

  public SceneViewStateDataAttributes() { 
  }

  public SceneViewStateDataAttributes camera(OneOfPerspectiveCameraOrthographicCamera camera) {
    
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


  public SceneViewStateDataAttributes created(OffsetDateTime created) {
    
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


  public SceneViewStateDataAttributes name(String name) {
    
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


  public SceneViewStateDataAttributes thumbnails(List<ThumbnailData> thumbnails) {
    
    this.thumbnails = thumbnails;
    return this;
  }

  public SceneViewStateDataAttributes addThumbnailsItem(ThumbnailData thumbnailsItem) {
    if (this.thumbnails == null) {
      this.thumbnails = new ArrayList<>();
    }
    this.thumbnails.add(thumbnailsItem);
    return this;
  }

   /**
   * Get thumbnails
   * @return thumbnails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ThumbnailData> getThumbnails() {
    return thumbnails;
  }


  public void setThumbnails(List<ThumbnailData> thumbnails) {
    this.thumbnails = thumbnails;
  }


  public SceneViewStateDataAttributes featureLines(FeatureLines featureLines) {
    
    this.featureLines = featureLines;
    return this;
  }

   /**
   * Get featureLines
   * @return featureLines
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FeatureLines getFeatureLines() {
    return featureLines;
  }


  public void setFeatureLines(FeatureLines featureLines) {
    this.featureLines = featureLines;
  }


  public SceneViewStateDataAttributes noDefaultLights(Boolean noDefaultLights) {
    
    this.noDefaultLights = noDefaultLights;
    return this;
  }

   /**
   * Get noDefaultLights
   * @return noDefaultLights
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getNoDefaultLights() {
    return noDefaultLights;
  }


  public void setNoDefaultLights(Boolean noDefaultLights) {
    this.noDefaultLights = noDefaultLights;
  }


  public SceneViewStateDataAttributes suppliedId(String suppliedId) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SceneViewStateDataAttributes sceneViewStateDataAttributes = (SceneViewStateDataAttributes) o;
    return Objects.equals(this.camera, sceneViewStateDataAttributes.camera) &&
        Objects.equals(this.created, sceneViewStateDataAttributes.created) &&
        Objects.equals(this.name, sceneViewStateDataAttributes.name) &&
        Objects.equals(this.thumbnails, sceneViewStateDataAttributes.thumbnails) &&
        Objects.equals(this.featureLines, sceneViewStateDataAttributes.featureLines) &&
        Objects.equals(this.noDefaultLights, sceneViewStateDataAttributes.noDefaultLights) &&
        Objects.equals(this.suppliedId, sceneViewStateDataAttributes.suppliedId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(camera, created, name, thumbnails, featureLines, noDefaultLights, suppliedId);
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
    sb.append("class SceneViewStateDataAttributes {\n");
    sb.append("    camera: ").append(toIndentedString(camera)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    thumbnails: ").append(toIndentedString(thumbnails)).append("\n");
    sb.append("    featureLines: ").append(toIndentedString(featureLines)).append("\n");
    sb.append("    noDefaultLights: ").append(toIndentedString(noDefaultLights)).append("\n");
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

