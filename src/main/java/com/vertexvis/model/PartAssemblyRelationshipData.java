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
import com.vertexvis.model.PartRevisionInstance;
import com.vertexvis.model.UpdatePartRevisionRequestDataAttributesMetadataValue;
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
 * PartAssemblyRelationshipData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class PartAssemblyRelationshipData {
  public static final String SERIALIZED_NAME_CHILDREN = "children";
  @SerializedName(SERIALIZED_NAME_CHILDREN)
  @javax.annotation.Nonnull
  private List<PartRevisionInstance> children = new ArrayList<>();

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  @javax.annotation.Nullable
  private Map<String, UpdatePartRevisionRequestDataAttributesMetadataValue> metadata = new HashMap<>();

  public PartAssemblyRelationshipData() {
  }

  public PartAssemblyRelationshipData children(@javax.annotation.Nonnull List<PartRevisionInstance> children) {
    this.children = children;
    return this;
  }

  public PartAssemblyRelationshipData addChildrenItem(PartRevisionInstance childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<>();
    }
    this.children.add(childrenItem);
    return this;
  }

  /**
   * Get children
   * @return children
   */
  @javax.annotation.Nonnull
  public List<PartRevisionInstance> getChildren() {
    return children;
  }

  public void setChildren(@javax.annotation.Nonnull List<PartRevisionInstance> children) {
    this.children = children;
  }


  public PartAssemblyRelationshipData metadata(@javax.annotation.Nullable Map<String, UpdatePartRevisionRequestDataAttributesMetadataValue> metadata) {
    this.metadata = metadata;
    return this;
  }

  public PartAssemblyRelationshipData putMetadataItem(String key, UpdatePartRevisionRequestDataAttributesMetadataValue metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

  /**
   * Additional metadata about the &#x60;part&#x60; and/or &#x60;part-revision&#x60;. 
   * @return metadata
   */
  @javax.annotation.Nullable
  public Map<String, UpdatePartRevisionRequestDataAttributesMetadataValue> getMetadata() {
    return metadata;
  }

  public void setMetadata(@javax.annotation.Nullable Map<String, UpdatePartRevisionRequestDataAttributesMetadataValue> metadata) {
    this.metadata = metadata;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartAssemblyRelationshipData partAssemblyRelationshipData = (PartAssemblyRelationshipData) o;
    return Objects.equals(this.children, partAssemblyRelationshipData.children) &&
        Objects.equals(this.metadata, partAssemblyRelationshipData.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(children, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartAssemblyRelationshipData {\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
    openapiFields.add("children");
    openapiFields.add("metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("children");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PartAssemblyRelationshipData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PartAssemblyRelationshipData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PartAssemblyRelationshipData is not found in the empty JSON string", PartAssemblyRelationshipData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PartAssemblyRelationshipData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PartAssemblyRelationshipData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PartAssemblyRelationshipData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("children").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `children` to be an array in the JSON string but got `%s`", jsonObj.get("children").toString()));
      }

      JsonArray jsonArraychildren = jsonObj.getAsJsonArray("children");
      // validate the required field `children` (array)
      for (int i = 0; i < jsonArraychildren.size(); i++) {
        PartRevisionInstance.validateJsonElement(jsonArraychildren.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PartAssemblyRelationshipData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PartAssemblyRelationshipData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PartAssemblyRelationshipData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PartAssemblyRelationshipData.class));

       return (TypeAdapter<T>) new TypeAdapter<PartAssemblyRelationshipData>() {
           @Override
           public void write(JsonWriter out, PartAssemblyRelationshipData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PartAssemblyRelationshipData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PartAssemblyRelationshipData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PartAssemblyRelationshipData
   * @throws IOException if the JSON string is invalid with respect to PartAssemblyRelationshipData
   */
  public static PartAssemblyRelationshipData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PartAssemblyRelationshipData.class);
  }

  /**
   * Convert an instance of PartAssemblyRelationshipData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

