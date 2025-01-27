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
import com.vertexvis.model.UpdatePartRevisionRequestDataAttributesMetadataValue;
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
 * CreatePartRequestDataAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class CreatePartRequestDataAttributes {
  public static final String SERIALIZED_NAME_SUPPLIED_ID = "suppliedId";
  @SerializedName(SERIALIZED_NAME_SUPPLIED_ID)
  @javax.annotation.Nullable
  private String suppliedId;

  public static final String SERIALIZED_NAME_SUPPLIED_REVISION_ID = "suppliedRevisionId";
  @SerializedName(SERIALIZED_NAME_SUPPLIED_REVISION_ID)
  @javax.annotation.Nullable
  private String suppliedRevisionId;

  public static final String SERIALIZED_NAME_SUPPLIED_ITERATION_ID = "suppliedIterationId";
  @SerializedName(SERIALIZED_NAME_SUPPLIED_ITERATION_ID)
  @javax.annotation.Nullable
  private String suppliedIterationId;

  public static final String SERIALIZED_NAME_INDEX_METADATA = "indexMetadata";
  @SerializedName(SERIALIZED_NAME_INDEX_METADATA)
  @javax.annotation.Nullable
  private Boolean indexMetadata;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  @javax.annotation.Nullable
  private Map<String, UpdatePartRevisionRequestDataAttributesMetadataValue> metadata = new HashMap<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_REVISION_NAME = "revisionName";
  @SerializedName(SERIALIZED_NAME_REVISION_NAME)
  @javax.annotation.Nullable
  private String revisionName;

  public static final String SERIALIZED_NAME_SUPPLIED_ID_KEY = "suppliedIdKey";
  @SerializedName(SERIALIZED_NAME_SUPPLIED_ID_KEY)
  @javax.annotation.Nullable
  private String suppliedIdKey;

  public static final String SERIALIZED_NAME_SUPPLIED_REVISION_ID_KEY = "suppliedRevisionIdKey";
  @SerializedName(SERIALIZED_NAME_SUPPLIED_REVISION_ID_KEY)
  @javax.annotation.Nullable
  private String suppliedRevisionIdKey;

  public static final String SERIALIZED_NAME_SUPPLIED_INSTANCE_ID_KEY = "suppliedInstanceIdKey";
  @SerializedName(SERIALIZED_NAME_SUPPLIED_INSTANCE_ID_KEY)
  @javax.annotation.Nullable
  private String suppliedInstanceIdKey;

  public CreatePartRequestDataAttributes() {
  }

  public CreatePartRequestDataAttributes suppliedId(@javax.annotation.Nullable String suppliedId) {
    this.suppliedId = suppliedId;
    return this;
  }

  /**
   * ID provided for correlation. For example, an existing ID from a PLM system. 
   * @return suppliedId
   */
  @javax.annotation.Nullable
  public String getSuppliedId() {
    return suppliedId;
  }

  public void setSuppliedId(@javax.annotation.Nullable String suppliedId) {
    this.suppliedId = suppliedId;
  }


  public CreatePartRequestDataAttributes suppliedRevisionId(@javax.annotation.Nullable String suppliedRevisionId) {
    this.suppliedRevisionId = suppliedRevisionId;
    return this;
  }

  /**
   * ID provided for correlation. For example, an existing ID from a PLM system. Sending a new suppliedRevisionId combined with an existing suppliedId will create a new part revision for an existing part. 
   * @return suppliedRevisionId
   */
  @javax.annotation.Nullable
  public String getSuppliedRevisionId() {
    return suppliedRevisionId;
  }

  public void setSuppliedRevisionId(@javax.annotation.Nullable String suppliedRevisionId) {
    this.suppliedRevisionId = suppliedRevisionId;
  }


  public CreatePartRequestDataAttributes suppliedIterationId(@javax.annotation.Nullable String suppliedIterationId) {
    this.suppliedIterationId = suppliedIterationId;
    return this;
  }

  /**
   * ID provided for correlation of the revision. This is an optional ID to be able to create a version of a revision. For example, if and existing revision in a PLM system is modified, the suppliedIterationId can be used to allow creating a new part revision having an already existing suppliedId and suppliedRevisionId. This can be used when modification to an existing revision is made in the PLM system before the revision is released. 
   * @return suppliedIterationId
   */
  @javax.annotation.Nullable
  public String getSuppliedIterationId() {
    return suppliedIterationId;
  }

  public void setSuppliedIterationId(@javax.annotation.Nullable String suppliedIterationId) {
    this.suppliedIterationId = suppliedIterationId;
  }


  public CreatePartRequestDataAttributes indexMetadata(@javax.annotation.Nullable Boolean indexMetadata) {
    this.indexMetadata = indexMetadata;
    return this;
  }

  /**
   * Whether or not to index metadata in the part file. To ignore metadata from the part file and add your own, pass &#x60;false&#x60; for &#x60;indexMetadata&#x60; and supply custom metadata using the &#x60;metadata&#x60; field. 
   * @return indexMetadata
   */
  @javax.annotation.Nullable
  public Boolean getIndexMetadata() {
    return indexMetadata;
  }

  public void setIndexMetadata(@javax.annotation.Nullable Boolean indexMetadata) {
    this.indexMetadata = indexMetadata;
  }


  public CreatePartRequestDataAttributes metadata(@javax.annotation.Nullable Map<String, UpdatePartRevisionRequestDataAttributesMetadataValue> metadata) {
    this.metadata = metadata;
    return this;
  }

  public CreatePartRequestDataAttributes putMetadataItem(String key, UpdatePartRevisionRequestDataAttributesMetadataValue metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

  /**
   * Additional metadata about the &#x60;part&#x60; and/or &#x60;part-revision&#x60;. This metadata will take precedence over any metadata that belongs to the part file if &#x60;indexMetadata&#x60; is specified. 
   * @return metadata
   */
  @javax.annotation.Nullable
  public Map<String, UpdatePartRevisionRequestDataAttributesMetadataValue> getMetadata() {
    return metadata;
  }

  public void setMetadata(@javax.annotation.Nullable Map<String, UpdatePartRevisionRequestDataAttributesMetadataValue> metadata) {
    this.metadata = metadata;
  }


  public CreatePartRequestDataAttributes name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Name to be used for the root part.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public CreatePartRequestDataAttributes revisionName(@javax.annotation.Nullable String revisionName) {
    this.revisionName = revisionName;
    return this;
  }

  /**
   * Optional name to be used for the part revision.
   * @return revisionName
   */
  @javax.annotation.Nullable
  public String getRevisionName() {
    return revisionName;
  }

  public void setRevisionName(@javax.annotation.Nullable String revisionName) {
    this.revisionName = revisionName;
  }


  public CreatePartRequestDataAttributes suppliedIdKey(@javax.annotation.Nullable String suppliedIdKey) {
    this.suppliedIdKey = suppliedIdKey;
    return this;
  }

  /**
   * Metadata key used to extract an ID used for correlation.
   * @return suppliedIdKey
   */
  @javax.annotation.Nullable
  public String getSuppliedIdKey() {
    return suppliedIdKey;
  }

  public void setSuppliedIdKey(@javax.annotation.Nullable String suppliedIdKey) {
    this.suppliedIdKey = suppliedIdKey;
  }


  public CreatePartRequestDataAttributes suppliedRevisionIdKey(@javax.annotation.Nullable String suppliedRevisionIdKey) {
    this.suppliedRevisionIdKey = suppliedRevisionIdKey;
    return this;
  }

  /**
   * Metadata key used to extract an ID used for correlation.
   * @return suppliedRevisionIdKey
   */
  @javax.annotation.Nullable
  public String getSuppliedRevisionIdKey() {
    return suppliedRevisionIdKey;
  }

  public void setSuppliedRevisionIdKey(@javax.annotation.Nullable String suppliedRevisionIdKey) {
    this.suppliedRevisionIdKey = suppliedRevisionIdKey;
  }


  public CreatePartRequestDataAttributes suppliedInstanceIdKey(@javax.annotation.Nullable String suppliedInstanceIdKey) {
    this.suppliedInstanceIdKey = suppliedInstanceIdKey;
    return this;
  }

  /**
   * Metadata key used to extract an ID used for correlation.
   * @return suppliedInstanceIdKey
   */
  @javax.annotation.Nullable
  public String getSuppliedInstanceIdKey() {
    return suppliedInstanceIdKey;
  }

  public void setSuppliedInstanceIdKey(@javax.annotation.Nullable String suppliedInstanceIdKey) {
    this.suppliedInstanceIdKey = suppliedInstanceIdKey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePartRequestDataAttributes createPartRequestDataAttributes = (CreatePartRequestDataAttributes) o;
    return Objects.equals(this.suppliedId, createPartRequestDataAttributes.suppliedId) &&
        Objects.equals(this.suppliedRevisionId, createPartRequestDataAttributes.suppliedRevisionId) &&
        Objects.equals(this.suppliedIterationId, createPartRequestDataAttributes.suppliedIterationId) &&
        Objects.equals(this.indexMetadata, createPartRequestDataAttributes.indexMetadata) &&
        Objects.equals(this.metadata, createPartRequestDataAttributes.metadata) &&
        Objects.equals(this.name, createPartRequestDataAttributes.name) &&
        Objects.equals(this.revisionName, createPartRequestDataAttributes.revisionName) &&
        Objects.equals(this.suppliedIdKey, createPartRequestDataAttributes.suppliedIdKey) &&
        Objects.equals(this.suppliedRevisionIdKey, createPartRequestDataAttributes.suppliedRevisionIdKey) &&
        Objects.equals(this.suppliedInstanceIdKey, createPartRequestDataAttributes.suppliedInstanceIdKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(suppliedId, suppliedRevisionId, suppliedIterationId, indexMetadata, metadata, name, revisionName, suppliedIdKey, suppliedRevisionIdKey, suppliedInstanceIdKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePartRequestDataAttributes {\n");
    sb.append("    suppliedId: ").append(toIndentedString(suppliedId)).append("\n");
    sb.append("    suppliedRevisionId: ").append(toIndentedString(suppliedRevisionId)).append("\n");
    sb.append("    suppliedIterationId: ").append(toIndentedString(suppliedIterationId)).append("\n");
    sb.append("    indexMetadata: ").append(toIndentedString(indexMetadata)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    revisionName: ").append(toIndentedString(revisionName)).append("\n");
    sb.append("    suppliedIdKey: ").append(toIndentedString(suppliedIdKey)).append("\n");
    sb.append("    suppliedRevisionIdKey: ").append(toIndentedString(suppliedRevisionIdKey)).append("\n");
    sb.append("    suppliedInstanceIdKey: ").append(toIndentedString(suppliedInstanceIdKey)).append("\n");
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
    openapiFields.add("suppliedId");
    openapiFields.add("suppliedRevisionId");
    openapiFields.add("suppliedIterationId");
    openapiFields.add("indexMetadata");
    openapiFields.add("metadata");
    openapiFields.add("name");
    openapiFields.add("revisionName");
    openapiFields.add("suppliedIdKey");
    openapiFields.add("suppliedRevisionIdKey");
    openapiFields.add("suppliedInstanceIdKey");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreatePartRequestDataAttributes
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreatePartRequestDataAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreatePartRequestDataAttributes is not found in the empty JSON string", CreatePartRequestDataAttributes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreatePartRequestDataAttributes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreatePartRequestDataAttributes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("suppliedId") != null && !jsonObj.get("suppliedId").isJsonNull()) && !jsonObj.get("suppliedId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `suppliedId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("suppliedId").toString()));
      }
      if ((jsonObj.get("suppliedRevisionId") != null && !jsonObj.get("suppliedRevisionId").isJsonNull()) && !jsonObj.get("suppliedRevisionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `suppliedRevisionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("suppliedRevisionId").toString()));
      }
      if ((jsonObj.get("suppliedIterationId") != null && !jsonObj.get("suppliedIterationId").isJsonNull()) && !jsonObj.get("suppliedIterationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `suppliedIterationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("suppliedIterationId").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("revisionName") != null && !jsonObj.get("revisionName").isJsonNull()) && !jsonObj.get("revisionName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `revisionName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("revisionName").toString()));
      }
      if ((jsonObj.get("suppliedIdKey") != null && !jsonObj.get("suppliedIdKey").isJsonNull()) && !jsonObj.get("suppliedIdKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `suppliedIdKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("suppliedIdKey").toString()));
      }
      if ((jsonObj.get("suppliedRevisionIdKey") != null && !jsonObj.get("suppliedRevisionIdKey").isJsonNull()) && !jsonObj.get("suppliedRevisionIdKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `suppliedRevisionIdKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("suppliedRevisionIdKey").toString()));
      }
      if ((jsonObj.get("suppliedInstanceIdKey") != null && !jsonObj.get("suppliedInstanceIdKey").isJsonNull()) && !jsonObj.get("suppliedInstanceIdKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `suppliedInstanceIdKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("suppliedInstanceIdKey").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreatePartRequestDataAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreatePartRequestDataAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreatePartRequestDataAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreatePartRequestDataAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<CreatePartRequestDataAttributes>() {
           @Override
           public void write(JsonWriter out, CreatePartRequestDataAttributes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreatePartRequestDataAttributes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CreatePartRequestDataAttributes given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreatePartRequestDataAttributes
   * @throws IOException if the JSON string is invalid with respect to CreatePartRequestDataAttributes
   */
  public static CreatePartRequestDataAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreatePartRequestDataAttributes.class);
  }

  /**
   * Convert an instance of CreatePartRequestDataAttributes to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

