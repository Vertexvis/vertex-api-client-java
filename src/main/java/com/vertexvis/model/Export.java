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
import com.vertexvis.model.ExportData;
import com.vertexvis.model.Link;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
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
 * Export
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class Export {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  @javax.annotation.Nonnull
  private ExportData data;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  @javax.annotation.Nullable
  private Map<String, Link> links = new HashMap<>();

  public Export() {
  }

  public Export data(@javax.annotation.Nonnull ExportData data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @javax.annotation.Nonnull
  public ExportData getData() {
    return data;
  }

  public void setData(@javax.annotation.Nonnull ExportData data) {
    this.data = data;
  }


  public Export links(@javax.annotation.Nullable Map<String, Link> links) {
    this.links = links;
    return this;
  }

  public Export putLinksItem(String key, Link linksItem) {
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
    Export export = (Export) o;
    return Objects.equals(this.data, export.data) &&
        Objects.equals(this.links, export.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Export {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
    openapiFields.add("links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("data");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Export
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Export.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Export is not found in the empty JSON string", Export.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Export.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Export` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Export.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `data`
      ExportData.validateJsonElement(jsonObj.get("data"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Export.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Export' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Export> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Export.class));

       return (TypeAdapter<T>) new TypeAdapter<Export>() {
           @Override
           public void write(JsonWriter out, Export value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Export read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Export given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Export
   * @throws IOException if the JSON string is invalid with respect to Export
   */
  public static Export fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Export.class);
  }

  /**
   * Convert an instance of Export to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

