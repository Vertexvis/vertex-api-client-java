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
import com.vertexvis.model.Link;
import com.vertexvis.model.QueuedTranslationJobData;
import com.vertexvis.model.QueuedTranslationJobIncludedInner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * QueuedTranslationJob
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class QueuedTranslationJob {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  @javax.annotation.Nonnull
  private QueuedTranslationJobData data;

  public static final String SERIALIZED_NAME_INCLUDED = "included";
  @SerializedName(SERIALIZED_NAME_INCLUDED)
  @javax.annotation.Nullable
  private List<QueuedTranslationJobIncludedInner> included = new ArrayList<>();

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  @javax.annotation.Nullable
  private Map<String, Link> links = new HashMap<>();

  public QueuedTranslationJob() {
  }

  public QueuedTranslationJob data(@javax.annotation.Nonnull QueuedTranslationJobData data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @javax.annotation.Nonnull
  public QueuedTranslationJobData getData() {
    return data;
  }

  public void setData(@javax.annotation.Nonnull QueuedTranslationJobData data) {
    this.data = data;
  }


  public QueuedTranslationJob included(@javax.annotation.Nullable List<QueuedTranslationJobIncludedInner> included) {
    this.included = included;
    return this;
  }

  public QueuedTranslationJob addIncludedItem(QueuedTranslationJobIncludedInner includedItem) {
    if (this.included == null) {
      this.included = new ArrayList<>();
    }
    this.included.add(includedItem);
    return this;
  }

  /**
   * Get included
   * @return included
   */
  @javax.annotation.Nullable
  public List<QueuedTranslationJobIncludedInner> getIncluded() {
    return included;
  }

  public void setIncluded(@javax.annotation.Nullable List<QueuedTranslationJobIncludedInner> included) {
    this.included = included;
  }


  public QueuedTranslationJob links(@javax.annotation.Nullable Map<String, Link> links) {
    this.links = links;
    return this;
  }

  public QueuedTranslationJob putLinksItem(String key, Link linksItem) {
    if (this.links == null) {
      this.links = new HashMap<>();
    }
    this.links.put(key, linksItem);
    return this;
  }

  /**
   * Get links
   * @return links
   */
  @javax.annotation.Nullable
  public Map<String, Link> getLinks() {
    return links;
  }

  public void setLinks(@javax.annotation.Nullable Map<String, Link> links) {
    this.links = links;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueuedTranslationJob queuedTranslationJob = (QueuedTranslationJob) o;
    return Objects.equals(this.data, queuedTranslationJob.data) &&
        Objects.equals(this.included, queuedTranslationJob.included) &&
        Objects.equals(this.links, queuedTranslationJob.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, included, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueuedTranslationJob {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
    openapiFields.add("included");
    openapiFields.add("links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("data");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to QueuedTranslationJob
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!QueuedTranslationJob.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QueuedTranslationJob is not found in the empty JSON string", QueuedTranslationJob.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!QueuedTranslationJob.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QueuedTranslationJob` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : QueuedTranslationJob.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `data`
      QueuedTranslationJobData.validateJsonElement(jsonObj.get("data"));
      if (jsonObj.get("included") != null && !jsonObj.get("included").isJsonNull()) {
        JsonArray jsonArrayincluded = jsonObj.getAsJsonArray("included");
        if (jsonArrayincluded != null) {
          // ensure the json data is an array
          if (!jsonObj.get("included").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `included` to be an array in the JSON string but got `%s`", jsonObj.get("included").toString()));
          }

          // validate the optional field `included` (array)
          for (int i = 0; i < jsonArrayincluded.size(); i++) {
            QueuedTranslationJobIncludedInner.validateJsonElement(jsonArrayincluded.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QueuedTranslationJob.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QueuedTranslationJob' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QueuedTranslationJob> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QueuedTranslationJob.class));

       return (TypeAdapter<T>) new TypeAdapter<QueuedTranslationJob>() {
           @Override
           public void write(JsonWriter out, QueuedTranslationJob value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QueuedTranslationJob read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of QueuedTranslationJob given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of QueuedTranslationJob
   * @throws IOException if the JSON string is invalid with respect to QueuedTranslationJob
   */
  public static QueuedTranslationJob fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QueuedTranslationJob.class);
  }

  /**
   * Convert an instance of QueuedTranslationJob to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

