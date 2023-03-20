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
import com.vertexvis.model.CreateSceneViewRequestDataAttributes;
import com.vertexvis.model.CreateSceneViewRequestDataRelationships;
import java.io.IOException;

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
 * CreateSceneViewRequestData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateSceneViewRequestData {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private CreateSceneViewRequestDataAttributes attributes;

  public static final String SERIALIZED_NAME_RELATIONSHIPS = "relationships";
  @SerializedName(SERIALIZED_NAME_RELATIONSHIPS)
  private CreateSceneViewRequestDataRelationships relationships;

  public CreateSceneViewRequestData() {
  }

  public CreateSceneViewRequestData type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Resource object type.
   * @return type
  **/
  @javax.annotation.Nonnull

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public CreateSceneViewRequestData attributes(CreateSceneViewRequestDataAttributes attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nonnull

  public CreateSceneViewRequestDataAttributes getAttributes() {
    return attributes;
  }


  public void setAttributes(CreateSceneViewRequestDataAttributes attributes) {
    this.attributes = attributes;
  }


  public CreateSceneViewRequestData relationships(CreateSceneViewRequestDataRelationships relationships) {
    
    this.relationships = relationships;
    return this;
  }

   /**
   * Get relationships
   * @return relationships
  **/
  @javax.annotation.Nullable

  public CreateSceneViewRequestDataRelationships getRelationships() {
    return relationships;
  }


  public void setRelationships(CreateSceneViewRequestDataRelationships relationships) {
    this.relationships = relationships;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSceneViewRequestData createSceneViewRequestData = (CreateSceneViewRequestData) o;
    return Objects.equals(this.type, createSceneViewRequestData.type) &&
        Objects.equals(this.attributes, createSceneViewRequestData.attributes) &&
        Objects.equals(this.relationships, createSceneViewRequestData.relationships);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, attributes, relationships);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSceneViewRequestData {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
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
    openapiFields.add("attributes");
    openapiFields.add("relationships");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("attributes");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateSceneViewRequestData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateSceneViewRequestData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateSceneViewRequestData is not found in the empty JSON string", CreateSceneViewRequestData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateSceneViewRequestData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateSceneViewRequestData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateSceneViewRequestData.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the required field `attributes`
      CreateSceneViewRequestDataAttributes.validateJsonObject(jsonObj.getAsJsonObject("attributes"));
      // validate the optional field `relationships`
      if (jsonObj.get("relationships") != null && !jsonObj.get("relationships").isJsonNull()) {
        CreateSceneViewRequestDataRelationships.validateJsonObject(jsonObj.getAsJsonObject("relationships"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateSceneViewRequestData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateSceneViewRequestData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateSceneViewRequestData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateSceneViewRequestData.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateSceneViewRequestData>() {
           @Override
           public void write(JsonWriter out, CreateSceneViewRequestData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateSceneViewRequestData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateSceneViewRequestData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateSceneViewRequestData
  * @throws IOException if the JSON string is invalid with respect to CreateSceneViewRequestData
  */
  public static CreateSceneViewRequestData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateSceneViewRequestData.class);
  }

 /**
  * Convert an instance of CreateSceneViewRequestData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

