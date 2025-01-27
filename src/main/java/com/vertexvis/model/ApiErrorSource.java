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
import java.io.IOException;
import java.util.Arrays;

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
 * ApiErrorSource
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class ApiErrorSource {
  public static final String SERIALIZED_NAME_POINTER = "pointer";
  @SerializedName(SERIALIZED_NAME_POINTER)
  @javax.annotation.Nullable
  private String pointer;

  public static final String SERIALIZED_NAME_PARAMETER = "parameter";
  @SerializedName(SERIALIZED_NAME_PARAMETER)
  @javax.annotation.Nullable
  private String parameter;

  public ApiErrorSource() {
  }

  public ApiErrorSource pointer(@javax.annotation.Nullable String pointer) {
    this.pointer = pointer;
    return this;
  }

  /**
   * Get pointer
   * @return pointer
   */
  @javax.annotation.Nullable
  public String getPointer() {
    return pointer;
  }

  public void setPointer(@javax.annotation.Nullable String pointer) {
    this.pointer = pointer;
  }


  public ApiErrorSource parameter(@javax.annotation.Nullable String parameter) {
    this.parameter = parameter;
    return this;
  }

  /**
   * Get parameter
   * @return parameter
   */
  @javax.annotation.Nullable
  public String getParameter() {
    return parameter;
  }

  public void setParameter(@javax.annotation.Nullable String parameter) {
    this.parameter = parameter;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiErrorSource apiErrorSource = (ApiErrorSource) o;
    return Objects.equals(this.pointer, apiErrorSource.pointer) &&
        Objects.equals(this.parameter, apiErrorSource.parameter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pointer, parameter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiErrorSource {\n");
    sb.append("    pointer: ").append(toIndentedString(pointer)).append("\n");
    sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
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
    openapiFields.add("pointer");
    openapiFields.add("parameter");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ApiErrorSource
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApiErrorSource.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiErrorSource is not found in the empty JSON string", ApiErrorSource.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ApiErrorSource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiErrorSource` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("pointer") != null && !jsonObj.get("pointer").isJsonNull()) && !jsonObj.get("pointer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pointer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pointer").toString()));
      }
      if ((jsonObj.get("parameter") != null && !jsonObj.get("parameter").isJsonNull()) && !jsonObj.get("parameter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parameter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parameter").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiErrorSource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiErrorSource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiErrorSource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiErrorSource.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiErrorSource>() {
           @Override
           public void write(JsonWriter out, ApiErrorSource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiErrorSource read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ApiErrorSource given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ApiErrorSource
   * @throws IOException if the JSON string is invalid with respect to ApiErrorSource
   */
  public static ApiErrorSource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiErrorSource.class);
  }

  /**
   * Convert an instance of ApiErrorSource to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

