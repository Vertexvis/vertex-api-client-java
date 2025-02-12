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
import com.vertexvis.model.CreateSceneAnnotationRequestDataAttributesData;
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
 * UpdateSceneAnnotationRequestDataAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class UpdateSceneAnnotationRequestDataAttributes {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  @javax.annotation.Nullable
  private CreateSceneAnnotationRequestDataAttributesData data;

  public static final String SERIALIZED_NAME_SUPPLIED_ID = "suppliedId";
  @SerializedName(SERIALIZED_NAME_SUPPLIED_ID)
  @javax.annotation.Nullable
  private String suppliedId;

  public UpdateSceneAnnotationRequestDataAttributes() {
  }

  public UpdateSceneAnnotationRequestDataAttributes data(@javax.annotation.Nullable CreateSceneAnnotationRequestDataAttributesData data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @javax.annotation.Nullable
  public CreateSceneAnnotationRequestDataAttributesData getData() {
    return data;
  }

  public void setData(@javax.annotation.Nullable CreateSceneAnnotationRequestDataAttributesData data) {
    this.data = data;
  }


  public UpdateSceneAnnotationRequestDataAttributes suppliedId(@javax.annotation.Nullable String suppliedId) {
    this.suppliedId = suppliedId;
    return this;
  }

  /**
   * A customer provided ID used for correlation.
   * @return suppliedId
   */
  @javax.annotation.Nullable
  public String getSuppliedId() {
    return suppliedId;
  }

  public void setSuppliedId(@javax.annotation.Nullable String suppliedId) {
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
    UpdateSceneAnnotationRequestDataAttributes updateSceneAnnotationRequestDataAttributes = (UpdateSceneAnnotationRequestDataAttributes) o;
    return Objects.equals(this.data, updateSceneAnnotationRequestDataAttributes.data) &&
        Objects.equals(this.suppliedId, updateSceneAnnotationRequestDataAttributes.suppliedId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, suppliedId);
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
    sb.append("class UpdateSceneAnnotationRequestDataAttributes {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("data");
    openapiFields.add("suppliedId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateSceneAnnotationRequestDataAttributes
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateSceneAnnotationRequestDataAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateSceneAnnotationRequestDataAttributes is not found in the empty JSON string", UpdateSceneAnnotationRequestDataAttributes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateSceneAnnotationRequestDataAttributes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateSceneAnnotationRequestDataAttributes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `data`
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) {
        CreateSceneAnnotationRequestDataAttributesData.validateJsonElement(jsonObj.get("data"));
      }
      if ((jsonObj.get("suppliedId") != null && !jsonObj.get("suppliedId").isJsonNull()) && !jsonObj.get("suppliedId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `suppliedId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("suppliedId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateSceneAnnotationRequestDataAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateSceneAnnotationRequestDataAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateSceneAnnotationRequestDataAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateSceneAnnotationRequestDataAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateSceneAnnotationRequestDataAttributes>() {
           @Override
           public void write(JsonWriter out, UpdateSceneAnnotationRequestDataAttributes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateSceneAnnotationRequestDataAttributes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateSceneAnnotationRequestDataAttributes given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateSceneAnnotationRequestDataAttributes
   * @throws IOException if the JSON string is invalid with respect to UpdateSceneAnnotationRequestDataAttributes
   */
  public static UpdateSceneAnnotationRequestDataAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateSceneAnnotationRequestDataAttributes.class);
  }

  /**
   * Convert an instance of UpdateSceneAnnotationRequestDataAttributes to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

