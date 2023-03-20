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
import com.vertexvis.model.PartDataRelationshipsPartRevisions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * PartDataRelationships
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PartDataRelationships {
  public static final String SERIALIZED_NAME_PART_REVISIONS = "partRevisions";
  @SerializedName(SERIALIZED_NAME_PART_REVISIONS)
  private List<PartDataRelationshipsPartRevisions> partRevisions = new ArrayList<>();

  public PartDataRelationships() {
  }

  public PartDataRelationships partRevisions(List<PartDataRelationshipsPartRevisions> partRevisions) {
    
    this.partRevisions = partRevisions;
    return this;
  }

  public PartDataRelationships addPartRevisionsItem(PartDataRelationshipsPartRevisions partRevisionsItem) {
    this.partRevisions.add(partRevisionsItem);
    return this;
  }

   /**
   * Get partRevisions
   * @return partRevisions
  **/
  @javax.annotation.Nonnull

  public List<PartDataRelationshipsPartRevisions> getPartRevisions() {
    return partRevisions;
  }


  public void setPartRevisions(List<PartDataRelationshipsPartRevisions> partRevisions) {
    this.partRevisions = partRevisions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartDataRelationships partDataRelationships = (PartDataRelationships) o;
    return Objects.equals(this.partRevisions, partDataRelationships.partRevisions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partRevisions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartDataRelationships {\n");
    sb.append("    partRevisions: ").append(toIndentedString(partRevisions)).append("\n");
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
    openapiFields.add("partRevisions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("partRevisions");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PartDataRelationships
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PartDataRelationships.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PartDataRelationships is not found in the empty JSON string", PartDataRelationships.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PartDataRelationships.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PartDataRelationships` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PartDataRelationships.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("partRevisions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `partRevisions` to be an array in the JSON string but got `%s`", jsonObj.get("partRevisions").toString()));
      }

      JsonArray jsonArraypartRevisions = jsonObj.getAsJsonArray("partRevisions");
      // validate the required field `partRevisions` (array)
      for (int i = 0; i < jsonArraypartRevisions.size(); i++) {
        PartDataRelationshipsPartRevisions.validateJsonObject(jsonArraypartRevisions.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PartDataRelationships.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PartDataRelationships' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PartDataRelationships> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PartDataRelationships.class));

       return (TypeAdapter<T>) new TypeAdapter<PartDataRelationships>() {
           @Override
           public void write(JsonWriter out, PartDataRelationships value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PartDataRelationships read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PartDataRelationships given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PartDataRelationships
  * @throws IOException if the JSON string is invalid with respect to PartDataRelationships
  */
  public static PartDataRelationships fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PartDataRelationships.class);
  }

 /**
  * Convert an instance of PartDataRelationships to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

