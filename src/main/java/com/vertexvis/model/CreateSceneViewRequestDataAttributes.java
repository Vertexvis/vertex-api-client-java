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
import com.vertexvis.model.CreateSceneViewRequestDataAttributesCamera;
import com.vertexvis.model.CrossSectioning;
import java.io.IOException;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.vertexvis.JSON;

/**
 * CreateSceneViewRequestDataAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateSceneViewRequestDataAttributes {
  public static final String SERIALIZED_NAME_CAMERA = "camera";
  @SerializedName(SERIALIZED_NAME_CAMERA)
  private CreateSceneViewRequestDataAttributesCamera camera;

  public static final String SERIALIZED_NAME_CROSS_SECTIONING = "crossSectioning";
  @SerializedName(SERIALIZED_NAME_CROSS_SECTIONING)
  private CrossSectioning crossSectioning;

  public static final String SERIALIZED_NAME_EXCLUDE_PRUNED_ITEMS = "excludePrunedItems";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_PRUNED_ITEMS)
  private Boolean excludePrunedItems;

  public CreateSceneViewRequestDataAttributes() {
  }

  public CreateSceneViewRequestDataAttributes camera(CreateSceneViewRequestDataAttributesCamera camera) {
    
    this.camera = camera;
    return this;
  }

   /**
   * Get camera
   * @return camera
  **/
  @javax.annotation.Nullable

  public CreateSceneViewRequestDataAttributesCamera getCamera() {
    return camera;
  }


  public void setCamera(CreateSceneViewRequestDataAttributesCamera camera) {
    this.camera = camera;
  }


  public CreateSceneViewRequestDataAttributes crossSectioning(CrossSectioning crossSectioning) {
    
    this.crossSectioning = crossSectioning;
    return this;
  }

   /**
   * Get crossSectioning
   * @return crossSectioning
  **/
  @javax.annotation.Nullable

  public CrossSectioning getCrossSectioning() {
    return crossSectioning;
  }


  public void setCrossSectioning(CrossSectioning crossSectioning) {
    this.crossSectioning = crossSectioning;
  }


  public CreateSceneViewRequestDataAttributes excludePrunedItems(Boolean excludePrunedItems) {
    
    this.excludePrunedItems = excludePrunedItems;
    return this;
  }

   /**
   * Whether to exclude non-visible items in the view
   * @return excludePrunedItems
  **/
  @javax.annotation.Nullable

  public Boolean getExcludePrunedItems() {
    return excludePrunedItems;
  }


  public void setExcludePrunedItems(Boolean excludePrunedItems) {
    this.excludePrunedItems = excludePrunedItems;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSceneViewRequestDataAttributes createSceneViewRequestDataAttributes = (CreateSceneViewRequestDataAttributes) o;
    return Objects.equals(this.camera, createSceneViewRequestDataAttributes.camera) &&
        Objects.equals(this.crossSectioning, createSceneViewRequestDataAttributes.crossSectioning) &&
        Objects.equals(this.excludePrunedItems, createSceneViewRequestDataAttributes.excludePrunedItems);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(camera, crossSectioning, excludePrunedItems);
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
    sb.append("class CreateSceneViewRequestDataAttributes {\n");
    sb.append("    camera: ").append(toIndentedString(camera)).append("\n");
    sb.append("    crossSectioning: ").append(toIndentedString(crossSectioning)).append("\n");
    sb.append("    excludePrunedItems: ").append(toIndentedString(excludePrunedItems)).append("\n");
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
    openapiFields.add("excludePrunedItems");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateSceneViewRequestDataAttributes
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateSceneViewRequestDataAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateSceneViewRequestDataAttributes is not found in the empty JSON string", CreateSceneViewRequestDataAttributes.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateSceneViewRequestDataAttributes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateSceneViewRequestDataAttributes` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `camera`
      if (jsonObj.get("camera") != null && !jsonObj.get("camera").isJsonNull()) {
        CreateSceneViewRequestDataAttributesCamera.validateJsonObject(jsonObj.getAsJsonObject("camera"));
      }
      // validate the optional field `crossSectioning`
      if (jsonObj.get("crossSectioning") != null && !jsonObj.get("crossSectioning").isJsonNull()) {
        CrossSectioning.validateJsonObject(jsonObj.getAsJsonObject("crossSectioning"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateSceneViewRequestDataAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateSceneViewRequestDataAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateSceneViewRequestDataAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateSceneViewRequestDataAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateSceneViewRequestDataAttributes>() {
           @Override
           public void write(JsonWriter out, CreateSceneViewRequestDataAttributes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateSceneViewRequestDataAttributes read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateSceneViewRequestDataAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateSceneViewRequestDataAttributes
  * @throws IOException if the JSON string is invalid with respect to CreateSceneViewRequestDataAttributes
  */
  public static CreateSceneViewRequestDataAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateSceneViewRequestDataAttributes.class);
  }

 /**
  * Convert an instance of CreateSceneViewRequestDataAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

