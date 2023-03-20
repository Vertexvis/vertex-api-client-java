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
import com.vertexvis.model.MaterialOverride;
import com.vertexvis.model.Matrix4;
import com.vertexvis.model.UpdatePartRevisionRequestDataAttributesMetadataValue;
import java.io.IOException;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.vertexvis.JSON;

/**
 * UpdateSceneItemRequestDataAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateSceneItemRequestDataAttributes {
  public static final String SERIALIZED_NAME_VISIBLE = "visible";
  @SerializedName(SERIALIZED_NAME_VISIBLE)
  private Boolean visible;

  public static final String SERIALIZED_NAME_MATERIAL_OVERRIDE = "materialOverride";
  @SerializedName(SERIALIZED_NAME_MATERIAL_OVERRIDE)
  private MaterialOverride materialOverride;

  public static final String SERIALIZED_NAME_TRANSFORM = "transform";
  @SerializedName(SERIALIZED_NAME_TRANSFORM)
  private Matrix4 transform;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SUPPLIED_ID = "suppliedId";
  @SerializedName(SERIALIZED_NAME_SUPPLIED_ID)
  private String suppliedId;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, UpdatePartRevisionRequestDataAttributesMetadataValue> metadata = new HashMap<>();

  public UpdateSceneItemRequestDataAttributes() {
  }

  public UpdateSceneItemRequestDataAttributes visible(Boolean visible) {
    
    this.visible = visible;
    return this;
  }

   /**
   * Item visibility.
   * @return visible
  **/
  @javax.annotation.Nullable

  public Boolean getVisible() {
    return visible;
  }


  public void setVisible(Boolean visible) {
    this.visible = visible;
  }


  public UpdateSceneItemRequestDataAttributes materialOverride(MaterialOverride materialOverride) {
    
    this.materialOverride = materialOverride;
    return this;
  }

   /**
   * Get materialOverride
   * @return materialOverride
  **/
  @javax.annotation.Nullable

  public MaterialOverride getMaterialOverride() {
    return materialOverride;
  }


  public void setMaterialOverride(MaterialOverride materialOverride) {
    this.materialOverride = materialOverride;
  }


  public UpdateSceneItemRequestDataAttributes transform(Matrix4 transform) {
    
    this.transform = transform;
    return this;
  }

   /**
   * Get transform
   * @return transform
  **/
  @javax.annotation.Nullable

  public Matrix4 getTransform() {
    return transform;
  }


  public void setTransform(Matrix4 transform) {
    this.transform = transform;
  }


  public UpdateSceneItemRequestDataAttributes name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UpdateSceneItemRequestDataAttributes suppliedId(String suppliedId) {
    
    this.suppliedId = suppliedId;
    return this;
  }

   /**
   * ID provided for correlation. For example, an existing ID from a PLM system.
   * @return suppliedId
  **/
  @javax.annotation.Nullable

  public String getSuppliedId() {
    return suppliedId;
  }


  public void setSuppliedId(String suppliedId) {
    this.suppliedId = suppliedId;
  }


  public UpdateSceneItemRequestDataAttributes metadata(Map<String, UpdatePartRevisionRequestDataAttributesMetadataValue> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public UpdateSceneItemRequestDataAttributes putMetadataItem(String key, UpdatePartRevisionRequestDataAttributesMetadataValue metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Additional metadata for the scene-item. This metadata will take precedence over any metadata that belongs to the part file. 
   * @return metadata
  **/
  @javax.annotation.Nullable

  public Map<String, UpdatePartRevisionRequestDataAttributesMetadataValue> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, UpdatePartRevisionRequestDataAttributesMetadataValue> metadata) {
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
    UpdateSceneItemRequestDataAttributes updateSceneItemRequestDataAttributes = (UpdateSceneItemRequestDataAttributes) o;
    return Objects.equals(this.visible, updateSceneItemRequestDataAttributes.visible) &&
        Objects.equals(this.materialOverride, updateSceneItemRequestDataAttributes.materialOverride) &&
        Objects.equals(this.transform, updateSceneItemRequestDataAttributes.transform) &&
        Objects.equals(this.name, updateSceneItemRequestDataAttributes.name) &&
        Objects.equals(this.suppliedId, updateSceneItemRequestDataAttributes.suppliedId) &&
        Objects.equals(this.metadata, updateSceneItemRequestDataAttributes.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(visible, materialOverride, transform, name, suppliedId, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSceneItemRequestDataAttributes {\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
    sb.append("    materialOverride: ").append(toIndentedString(materialOverride)).append("\n");
    sb.append("    transform: ").append(toIndentedString(transform)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    suppliedId: ").append(toIndentedString(suppliedId)).append("\n");
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
    openapiFields.add("visible");
    openapiFields.add("materialOverride");
    openapiFields.add("transform");
    openapiFields.add("name");
    openapiFields.add("suppliedId");
    openapiFields.add("metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateSceneItemRequestDataAttributes
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UpdateSceneItemRequestDataAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateSceneItemRequestDataAttributes is not found in the empty JSON string", UpdateSceneItemRequestDataAttributes.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdateSceneItemRequestDataAttributes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateSceneItemRequestDataAttributes` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `materialOverride`
      if (jsonObj.get("materialOverride") != null && !jsonObj.get("materialOverride").isJsonNull()) {
        MaterialOverride.validateJsonObject(jsonObj.getAsJsonObject("materialOverride"));
      }
      // validate the optional field `transform`
      if (jsonObj.get("transform") != null && !jsonObj.get("transform").isJsonNull()) {
        Matrix4.validateJsonObject(jsonObj.getAsJsonObject("transform"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("suppliedId") != null && !jsonObj.get("suppliedId").isJsonNull()) && !jsonObj.get("suppliedId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `suppliedId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("suppliedId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateSceneItemRequestDataAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateSceneItemRequestDataAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateSceneItemRequestDataAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateSceneItemRequestDataAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateSceneItemRequestDataAttributes>() {
           @Override
           public void write(JsonWriter out, UpdateSceneItemRequestDataAttributes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateSceneItemRequestDataAttributes read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateSceneItemRequestDataAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateSceneItemRequestDataAttributes
  * @throws IOException if the JSON string is invalid with respect to UpdateSceneItemRequestDataAttributes
  */
  public static UpdateSceneItemRequestDataAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateSceneItemRequestDataAttributes.class);
  }

 /**
  * Convert an instance of UpdateSceneItemRequestDataAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

