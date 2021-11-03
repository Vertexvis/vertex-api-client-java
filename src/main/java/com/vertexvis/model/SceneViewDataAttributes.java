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
import com.vertexvis.model.Camera;
import com.vertexvis.model.CrossSectioning;
import com.vertexvis.model.Orientation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * SceneViewDataAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SceneViewDataAttributes {
  public static final String SERIALIZED_NAME_CAMERA = "camera";
  @SerializedName(SERIALIZED_NAME_CAMERA)
  private Camera camera;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_CROSS_SECTIONING = "crossSectioning";
  @SerializedName(SERIALIZED_NAME_CROSS_SECTIONING)
  private CrossSectioning crossSectioning;

  public static final String SERIALIZED_NAME_WORLD_ORIENTATION = "worldOrientation";
  @SerializedName(SERIALIZED_NAME_WORLD_ORIENTATION)
  private Orientation worldOrientation;


  public SceneViewDataAttributes camera(Camera camera) {
    
    this.camera = camera;
    return this;
  }

   /**
   * Get camera
   * @return camera
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Camera getCamera() {
    return camera;
  }


  public void setCamera(Camera camera) {
    this.camera = camera;
  }


  public SceneViewDataAttributes created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2020-01-01T12:00Z", required = true, value = "")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public SceneViewDataAttributes crossSectioning(CrossSectioning crossSectioning) {
    
    this.crossSectioning = crossSectioning;
    return this;
  }

   /**
   * Get crossSectioning
   * @return crossSectioning
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CrossSectioning getCrossSectioning() {
    return crossSectioning;
  }


  public void setCrossSectioning(CrossSectioning crossSectioning) {
    this.crossSectioning = crossSectioning;
  }


  public SceneViewDataAttributes worldOrientation(Orientation worldOrientation) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SceneViewDataAttributes sceneViewDataAttributes = (SceneViewDataAttributes) o;
    return Objects.equals(this.camera, sceneViewDataAttributes.camera) &&
        Objects.equals(this.created, sceneViewDataAttributes.created) &&
        Objects.equals(this.crossSectioning, sceneViewDataAttributes.crossSectioning) &&
        Objects.equals(this.worldOrientation, sceneViewDataAttributes.worldOrientation);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && a.get().getClass().isArray() ? Arrays.equals((T[])a.get(), (T[])b.get()) : Objects.equals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(camera, created, crossSectioning, worldOrientation);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent()
      ? (a.get().getClass().isArray() ? Arrays.hashCode((T[])a.get()) : Objects.hashCode(a.get()))
      : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SceneViewDataAttributes {\n");
    sb.append("    camera: ").append(toIndentedString(camera)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    crossSectioning: ").append(toIndentedString(crossSectioning)).append("\n");
    sb.append("    worldOrientation: ").append(toIndentedString(worldOrientation)).append("\n");
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

