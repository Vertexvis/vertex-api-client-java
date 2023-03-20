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
import com.vertexvis.model.Vector3;
import java.io.IOException;
import java.math.BigDecimal;

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
 * A camera type where an object&#39;s size stays consistent regardless of its distance to the camera.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OrthographicCamera {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_VIEW_VECTOR = "viewVector";
  @SerializedName(SERIALIZED_NAME_VIEW_VECTOR)
  private Vector3 viewVector;

  public static final String SERIALIZED_NAME_LOOK_AT = "lookAt";
  @SerializedName(SERIALIZED_NAME_LOOK_AT)
  private Vector3 lookAt;

  public static final String SERIALIZED_NAME_UP = "up";
  @SerializedName(SERIALIZED_NAME_UP)
  private Vector3 up;

  public static final String SERIALIZED_NAME_FOV_HEIGHT = "fovHeight";
  @SerializedName(SERIALIZED_NAME_FOV_HEIGHT)
  private BigDecimal fovHeight;

  public OrthographicCamera() {
  }

  public OrthographicCamera type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public OrthographicCamera viewVector(Vector3 viewVector) {
    
    this.viewVector = viewVector;
    return this;
  }

   /**
   * Get viewVector
   * @return viewVector
  **/
  @javax.annotation.Nonnull

  public Vector3 getViewVector() {
    return viewVector;
  }


  public void setViewVector(Vector3 viewVector) {
    this.viewVector = viewVector;
  }


  public OrthographicCamera lookAt(Vector3 lookAt) {
    
    this.lookAt = lookAt;
    return this;
  }

   /**
   * Get lookAt
   * @return lookAt
  **/
  @javax.annotation.Nonnull

  public Vector3 getLookAt() {
    return lookAt;
  }


  public void setLookAt(Vector3 lookAt) {
    this.lookAt = lookAt;
  }


  public OrthographicCamera up(Vector3 up) {
    
    this.up = up;
    return this;
  }

   /**
   * Get up
   * @return up
  **/
  @javax.annotation.Nonnull

  public Vector3 getUp() {
    return up;
  }


  public void setUp(Vector3 up) {
    this.up = up;
  }


  public OrthographicCamera fovHeight(BigDecimal fovHeight) {
    
    this.fovHeight = fovHeight;
    return this;
  }

   /**
   * Get fovHeight
   * @return fovHeight
  **/
  @javax.annotation.Nonnull

  public BigDecimal getFovHeight() {
    return fovHeight;
  }


  public void setFovHeight(BigDecimal fovHeight) {
    this.fovHeight = fovHeight;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrthographicCamera orthographicCamera = (OrthographicCamera) o;
    return Objects.equals(this.type, orthographicCamera.type) &&
        Objects.equals(this.viewVector, orthographicCamera.viewVector) &&
        Objects.equals(this.lookAt, orthographicCamera.lookAt) &&
        Objects.equals(this.up, orthographicCamera.up) &&
        Objects.equals(this.fovHeight, orthographicCamera.fovHeight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, viewVector, lookAt, up, fovHeight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrthographicCamera {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    viewVector: ").append(toIndentedString(viewVector)).append("\n");
    sb.append("    lookAt: ").append(toIndentedString(lookAt)).append("\n");
    sb.append("    up: ").append(toIndentedString(up)).append("\n");
    sb.append("    fovHeight: ").append(toIndentedString(fovHeight)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("viewVector");
    openapiFields.add("lookAt");
    openapiFields.add("up");
    openapiFields.add("fovHeight");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("viewVector");
    openapiRequiredFields.add("lookAt");
    openapiRequiredFields.add("up");
    openapiRequiredFields.add("fovHeight");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrthographicCamera
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OrthographicCamera.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrthographicCamera is not found in the empty JSON string", OrthographicCamera.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OrthographicCamera.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrthographicCamera` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OrthographicCamera.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the required field `viewVector`
      Vector3.validateJsonObject(jsonObj.getAsJsonObject("viewVector"));
      // validate the required field `lookAt`
      Vector3.validateJsonObject(jsonObj.getAsJsonObject("lookAt"));
      // validate the required field `up`
      Vector3.validateJsonObject(jsonObj.getAsJsonObject("up"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrthographicCamera.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrthographicCamera' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrthographicCamera> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrthographicCamera.class));

       return (TypeAdapter<T>) new TypeAdapter<OrthographicCamera>() {
           @Override
           public void write(JsonWriter out, OrthographicCamera value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrthographicCamera read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrthographicCamera given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrthographicCamera
  * @throws IOException if the JSON string is invalid with respect to OrthographicCamera
  */
  public static OrthographicCamera fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrthographicCamera.class);
  }

 /**
  * Convert an instance of OrthographicCamera to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

