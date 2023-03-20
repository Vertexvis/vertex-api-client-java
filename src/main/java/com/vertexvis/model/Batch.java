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
import com.vertexvis.model.BatchVertexvisBatchResultsInner;
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
 * Batch
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Batch {
  public static final String SERIALIZED_NAME_VERTEXVIS_BATCH_COLON_RESULTS = "vertexvis/batch:results";
  @SerializedName(SERIALIZED_NAME_VERTEXVIS_BATCH_COLON_RESULTS)
  private List<BatchVertexvisBatchResultsInner> vertexvisBatchColonResults = new ArrayList<>();

  public Batch() {
  }

  public Batch vertexvisBatchColonResults(List<BatchVertexvisBatchResultsInner> vertexvisBatchColonResults) {
    
    this.vertexvisBatchColonResults = vertexvisBatchColonResults;
    return this;
  }

  public Batch addVertexvisBatchColonResultsItem(BatchVertexvisBatchResultsInner vertexvisBatchColonResultsItem) {
    this.vertexvisBatchColonResults.add(vertexvisBatchColonResultsItem);
    return this;
  }

   /**
   * List of operation results.
   * @return vertexvisBatchColonResults
  **/
  @javax.annotation.Nonnull

  public List<BatchVertexvisBatchResultsInner> getVertexvisBatchColonResults() {
    return vertexvisBatchColonResults;
  }


  public void setVertexvisBatchColonResults(List<BatchVertexvisBatchResultsInner> vertexvisBatchColonResults) {
    this.vertexvisBatchColonResults = vertexvisBatchColonResults;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Batch batch = (Batch) o;
    return Objects.equals(this.vertexvisBatchColonResults, batch.vertexvisBatchColonResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vertexvisBatchColonResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Batch {\n");
    sb.append("    vertexvisBatchColonResults: ").append(toIndentedString(vertexvisBatchColonResults)).append("\n");
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
    openapiFields.add("vertexvis/batch:results");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("vertexvis/batch:results");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Batch
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Batch.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Batch is not found in the empty JSON string", Batch.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Batch.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Batch` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Batch.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("vertexvis/batch:results").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `vertexvis/batch:results` to be an array in the JSON string but got `%s`", jsonObj.get("vertexvis/batch:results").toString()));
      }

      JsonArray jsonArrayvertexvisBatchColonResults = jsonObj.getAsJsonArray("vertexvis/batch:results");
      // validate the required field `vertexvis/batch:results` (array)
      for (int i = 0; i < jsonArrayvertexvisBatchColonResults.size(); i++) {
        BatchVertexvisBatchResultsInner.validateJsonObject(jsonArrayvertexvisBatchColonResults.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Batch.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Batch' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Batch> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Batch.class));

       return (TypeAdapter<T>) new TypeAdapter<Batch>() {
           @Override
           public void write(JsonWriter out, Batch value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Batch read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Batch given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Batch
  * @throws IOException if the JSON string is invalid with respect to Batch
  */
  public static Batch fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Batch.class);
  }

 /**
  * Convert an instance of Batch to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

