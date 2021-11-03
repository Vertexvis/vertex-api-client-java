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
import com.vertexvis.model.AnyOfCameraCameraFit;
import com.vertexvis.model.CrossSectioning;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * UpdateSceneViewRequestDataAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateSceneViewRequestDataAttributes {
  public static final String SERIALIZED_NAME_CAMERA = "camera";
  @SerializedName(SERIALIZED_NAME_CAMERA)
  private AnyOfCameraCameraFit camera;

  public static final String SERIALIZED_NAME_CROSS_SECTIONING = "crossSectioning";
  @SerializedName(SERIALIZED_NAME_CROSS_SECTIONING)
  private CrossSectioning crossSectioning;


  public UpdateSceneViewRequestDataAttributes camera(AnyOfCameraCameraFit camera) {
    
    this.camera = camera;
    return this;
  }

   /**
   * Get camera
   * @return camera
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AnyOfCameraCameraFit getCamera() {
    return camera;
  }


  public void setCamera(AnyOfCameraCameraFit camera) {
    this.camera = camera;
  }


  public UpdateSceneViewRequestDataAttributes crossSectioning(CrossSectioning crossSectioning) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSceneViewRequestDataAttributes updateSceneViewRequestDataAttributes = (UpdateSceneViewRequestDataAttributes) o;
    return Objects.equals(this.camera, updateSceneViewRequestDataAttributes.camera) &&
        Objects.equals(this.crossSectioning, updateSceneViewRequestDataAttributes.crossSectioning);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && a.get().getClass().isArray() ? Arrays.equals((T[])a.get(), (T[])b.get()) : Objects.equals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(camera, crossSectioning);
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
    sb.append("class UpdateSceneViewRequestDataAttributes {\n");
    sb.append("    camera: ").append(toIndentedString(camera)).append("\n");
    sb.append("    crossSectioning: ").append(toIndentedString(crossSectioning)).append("\n");
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

