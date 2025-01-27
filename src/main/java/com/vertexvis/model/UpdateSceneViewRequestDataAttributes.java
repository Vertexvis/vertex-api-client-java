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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.vertexvis.model.CrossSectioning;
import com.vertexvis.model.UpdateSceneViewRequestDataAttributesCamera;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.vertexvis.JSON;

/**
 * UpdateSceneViewRequestDataAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class UpdateSceneViewRequestDataAttributes {
  public static final String SERIALIZED_NAME_CAMERA = "camera";
  @SerializedName(SERIALIZED_NAME_CAMERA)
  @javax.annotation.Nullable
  private UpdateSceneViewRequestDataAttributesCamera camera;

  public static final String SERIALIZED_NAME_CROSS_SECTIONING = "crossSectioning";
  @SerializedName(SERIALIZED_NAME_CROSS_SECTIONING)
  @javax.annotation.Nullable
  private CrossSectioning crossSectioning;

  public static final String SERIALIZED_NAME_NO_DEFAULT_LIGHTS = "noDefaultLights";
  @SerializedName(SERIALIZED_NAME_NO_DEFAULT_LIGHTS)
  @javax.annotation.Nullable
  private Boolean noDefaultLights;

  public UpdateSceneViewRequestDataAttributes() {
  }

  public UpdateSceneViewRequestDataAttributes camera(@javax.annotation.Nullable UpdateSceneViewRequestDataAttributesCamera camera) {
    this.camera = camera;
    return this;
  }

  /**
   * Get camera
   * @return camera
   */
  @javax.annotation.Nullable
  public UpdateSceneViewRequestDataAttributesCamera getCamera() {
    return camera;
  }

  public void setCamera(@javax.annotation.Nullable UpdateSceneViewRequestDataAttributesCamera camera) {
    this.camera = camera;
  }


  public UpdateSceneViewRequestDataAttributes crossSectioning(@javax.annotation.Nullable CrossSectioning crossSectioning) {
    this.crossSectioning = crossSectioning;
    return this;
  }

  /**
   * Get crossSectioning
   * @return crossSectioning
   */
  @javax.annotation.Nullable
  public CrossSectioning getCrossSectioning() {
    return crossSectioning;
  }

  public void setCrossSectioning(@javax.annotation.Nullable CrossSectioning crossSectioning) {
    this.crossSectioning = crossSectioning;
  }


  public UpdateSceneViewRequestDataAttributes noDefaultLights(@javax.annotation.Nullable Boolean noDefaultLights) {
    this.noDefaultLights = noDefaultLights;
    return this;
  }

  /**
   * Whether or not to turn off default lighting
   * @return noDefaultLights
   */
  @javax.annotation.Nullable
  public Boolean getNoDefaultLights() {
    return noDefaultLights;
  }

  public void setNoDefaultLights(@javax.annotation.Nullable Boolean noDefaultLights) {
    this.noDefaultLights = noDefaultLights;
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
        Objects.equals(this.crossSectioning, updateSceneViewRequestDataAttributes.crossSectioning) &&
        Objects.equals(this.noDefaultLights, updateSceneViewRequestDataAttributes.noDefaultLights);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(camera, crossSectioning, noDefaultLights);
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
    sb.append("class UpdateSceneViewRequestDataAttributes {\n");
    sb.append("    camera: ").append(toIndentedString(camera)).append("\n");
    sb.append("    crossSectioning: ").append(toIndentedString(crossSectioning)).append("\n");
    sb.append("    noDefaultLights: ").append(toIndentedString(noDefaultLights)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("camera");
    openapiFields.add("crossSectioning");
    openapiFields.add("noDefaultLights");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateSceneViewRequestDataAttributes
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateSceneViewRequestDataAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateSceneViewRequestDataAttributes is not found in the empty JSON string", UpdateSceneViewRequestDataAttributes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateSceneViewRequestDataAttributes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateSceneViewRequestDataAttributes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `camera`
      if (jsonObj.get("camera") != null && !jsonObj.get("camera").isJsonNull()) {
        UpdateSceneViewRequestDataAttributesCamera.validateJsonElement(jsonObj.get("camera"));
      }
      // validate the optional field `crossSectioning`
      if (jsonObj.get("crossSectioning") != null && !jsonObj.get("crossSectioning").isJsonNull()) {
        CrossSectioning.validateJsonElement(jsonObj.get("crossSectioning"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateSceneViewRequestDataAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateSceneViewRequestDataAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateSceneViewRequestDataAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateSceneViewRequestDataAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateSceneViewRequestDataAttributes>() {
           @Override
           public void write(JsonWriter out, UpdateSceneViewRequestDataAttributes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateSceneViewRequestDataAttributes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateSceneViewRequestDataAttributes given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateSceneViewRequestDataAttributes
   * @throws IOException if the JSON string is invalid with respect to UpdateSceneViewRequestDataAttributes
   */
  public static UpdateSceneViewRequestDataAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateSceneViewRequestDataAttributes.class);
  }

  /**
   * Convert an instance of UpdateSceneViewRequestDataAttributes to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

