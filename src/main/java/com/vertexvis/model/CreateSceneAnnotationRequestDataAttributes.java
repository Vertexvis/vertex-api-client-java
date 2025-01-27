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
 * CreateSceneAnnotationRequestDataAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class CreateSceneAnnotationRequestDataAttributes {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  @javax.annotation.Nonnull
  private CreateSceneAnnotationRequestDataAttributesData data;

  public static final String SERIALIZED_NAME_SUPPLIED_ID = "suppliedId";
  @SerializedName(SERIALIZED_NAME_SUPPLIED_ID)
  @javax.annotation.Nullable
  private String suppliedId;

  public CreateSceneAnnotationRequestDataAttributes() {
  }

  public CreateSceneAnnotationRequestDataAttributes data(@javax.annotation.Nonnull CreateSceneAnnotationRequestDataAttributesData data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @javax.annotation.Nonnull
  public CreateSceneAnnotationRequestDataAttributesData getData() {
    return data;
  }

  public void setData(@javax.annotation.Nonnull CreateSceneAnnotationRequestDataAttributesData data) {
    this.data = data;
  }


  public CreateSceneAnnotationRequestDataAttributes suppliedId(@javax.annotation.Nullable String suppliedId) {
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
    CreateSceneAnnotationRequestDataAttributes createSceneAnnotationRequestDataAttributes = (CreateSceneAnnotationRequestDataAttributes) o;
    return Objects.equals(this.data, createSceneAnnotationRequestDataAttributes.data) &&
        Objects.equals(this.suppliedId, createSceneAnnotationRequestDataAttributes.suppliedId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, suppliedId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSceneAnnotationRequestDataAttributes {\n");
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
    openapiRequiredFields.add("data");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateSceneAnnotationRequestDataAttributes
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateSceneAnnotationRequestDataAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateSceneAnnotationRequestDataAttributes is not found in the empty JSON string", CreateSceneAnnotationRequestDataAttributes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateSceneAnnotationRequestDataAttributes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateSceneAnnotationRequestDataAttributes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateSceneAnnotationRequestDataAttributes.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `data`
      CreateSceneAnnotationRequestDataAttributesData.validateJsonElement(jsonObj.get("data"));
      if ((jsonObj.get("suppliedId") != null && !jsonObj.get("suppliedId").isJsonNull()) && !jsonObj.get("suppliedId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `suppliedId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("suppliedId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateSceneAnnotationRequestDataAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateSceneAnnotationRequestDataAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateSceneAnnotationRequestDataAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateSceneAnnotationRequestDataAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateSceneAnnotationRequestDataAttributes>() {
           @Override
           public void write(JsonWriter out, CreateSceneAnnotationRequestDataAttributes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateSceneAnnotationRequestDataAttributes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreateSceneAnnotationRequestDataAttributes given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateSceneAnnotationRequestDataAttributes
   * @throws IOException if the JSON string is invalid with respect to CreateSceneAnnotationRequestDataAttributes
   */
  public static CreateSceneAnnotationRequestDataAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateSceneAnnotationRequestDataAttributes.class);
  }

  /**
   * Convert an instance of CreateSceneAnnotationRequestDataAttributes to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

