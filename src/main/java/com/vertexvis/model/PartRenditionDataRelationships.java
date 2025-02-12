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
import com.vertexvis.model.GeometrySetRelationshipData;
import com.vertexvis.model.PartRevisionRelationship;
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
 * PartRenditionDataRelationships
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class PartRenditionDataRelationships {
  public static final String SERIALIZED_NAME_GEOMETRY_SET = "geometrySet";
  @SerializedName(SERIALIZED_NAME_GEOMETRY_SET)
  @javax.annotation.Nullable
  private GeometrySetRelationshipData geometrySet;

  public static final String SERIALIZED_NAME_PART_REVISION = "partRevision";
  @SerializedName(SERIALIZED_NAME_PART_REVISION)
  @javax.annotation.Nullable
  private PartRevisionRelationship partRevision;

  public PartRenditionDataRelationships() {
  }

  public PartRenditionDataRelationships geometrySet(@javax.annotation.Nullable GeometrySetRelationshipData geometrySet) {
    this.geometrySet = geometrySet;
    return this;
  }

  /**
   * Get geometrySet
   * @return geometrySet
   */
  @javax.annotation.Nullable
  public GeometrySetRelationshipData getGeometrySet() {
    return geometrySet;
  }

  public void setGeometrySet(@javax.annotation.Nullable GeometrySetRelationshipData geometrySet) {
    this.geometrySet = geometrySet;
  }


  public PartRenditionDataRelationships partRevision(@javax.annotation.Nullable PartRevisionRelationship partRevision) {
    this.partRevision = partRevision;
    return this;
  }

  /**
   * Get partRevision
   * @return partRevision
   */
  @javax.annotation.Nullable
  public PartRevisionRelationship getPartRevision() {
    return partRevision;
  }

  public void setPartRevision(@javax.annotation.Nullable PartRevisionRelationship partRevision) {
    this.partRevision = partRevision;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartRenditionDataRelationships partRenditionDataRelationships = (PartRenditionDataRelationships) o;
    return Objects.equals(this.geometrySet, partRenditionDataRelationships.geometrySet) &&
        Objects.equals(this.partRevision, partRenditionDataRelationships.partRevision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(geometrySet, partRevision);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartRenditionDataRelationships {\n");
    sb.append("    geometrySet: ").append(toIndentedString(geometrySet)).append("\n");
    sb.append("    partRevision: ").append(toIndentedString(partRevision)).append("\n");
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
    openapiFields.add("geometrySet");
    openapiFields.add("partRevision");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PartRenditionDataRelationships
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PartRenditionDataRelationships.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PartRenditionDataRelationships is not found in the empty JSON string", PartRenditionDataRelationships.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PartRenditionDataRelationships.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PartRenditionDataRelationships` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `geometrySet`
      if (jsonObj.get("geometrySet") != null && !jsonObj.get("geometrySet").isJsonNull()) {
        GeometrySetRelationshipData.validateJsonElement(jsonObj.get("geometrySet"));
      }
      // validate the optional field `partRevision`
      if (jsonObj.get("partRevision") != null && !jsonObj.get("partRevision").isJsonNull()) {
        PartRevisionRelationship.validateJsonElement(jsonObj.get("partRevision"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PartRenditionDataRelationships.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PartRenditionDataRelationships' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PartRenditionDataRelationships> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PartRenditionDataRelationships.class));

       return (TypeAdapter<T>) new TypeAdapter<PartRenditionDataRelationships>() {
           @Override
           public void write(JsonWriter out, PartRenditionDataRelationships value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PartRenditionDataRelationships read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PartRenditionDataRelationships given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PartRenditionDataRelationships
   * @throws IOException if the JSON string is invalid with respect to PartRenditionDataRelationships
   */
  public static PartRenditionDataRelationships fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PartRenditionDataRelationships.class);
  }

  /**
   * Convert an instance of PartRenditionDataRelationships to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

