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
import com.vertexvis.model.BoundingBox;
import com.vertexvis.model.ColorMaterial;
import com.vertexvis.model.Matrix4;
import com.vertexvis.model.UpdatePartRevisionRequestDataAttributesMetadataValue;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * SceneItemDataAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SceneItemDataAttributes {
  public static final String SERIALIZED_NAME_BOUNDING_BOX = "boundingBox";
  @SerializedName(SERIALIZED_NAME_BOUNDING_BOX)
  private BoundingBox boundingBox;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_MATERIAL_OVERRIDE = "materialOverride";
  @SerializedName(SERIALIZED_NAME_MATERIAL_OVERRIDE)
  private ColorMaterial materialOverride;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, UpdatePartRevisionRequestDataAttributesMetadataValue> metadata = new HashMap<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SUPPLIED_ID = "suppliedId";
  @SerializedName(SERIALIZED_NAME_SUPPLIED_ID)
  private String suppliedId;

  public static final String SERIALIZED_NAME_TRANSFORM = "transform";
  @SerializedName(SERIALIZED_NAME_TRANSFORM)
  private Matrix4 transform;

  public static final String SERIALIZED_NAME_VISIBLE = "visible";
  @SerializedName(SERIALIZED_NAME_VISIBLE)
  private Boolean visible;

  public static final String SERIALIZED_NAME_WORLD_TRANSFORM = "worldTransform";
  @SerializedName(SERIALIZED_NAME_WORLD_TRANSFORM)
  private Matrix4 worldTransform;

  public SceneItemDataAttributes() {
  }

  public SceneItemDataAttributes boundingBox(BoundingBox boundingBox) {
    
    this.boundingBox = boundingBox;
    return this;
  }

   /**
   * Get boundingBox
   * @return boundingBox
  **/
  @javax.annotation.Nullable

  public BoundingBox getBoundingBox() {
    return boundingBox;
  }


  public void setBoundingBox(BoundingBox boundingBox) {
    this.boundingBox = boundingBox;
  }


  public SceneItemDataAttributes created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public SceneItemDataAttributes materialOverride(ColorMaterial materialOverride) {
    
    this.materialOverride = materialOverride;
    return this;
  }

   /**
   * Get materialOverride
   * @return materialOverride
  **/
  @javax.annotation.Nullable

  public ColorMaterial getMaterialOverride() {
    return materialOverride;
  }


  public void setMaterialOverride(ColorMaterial materialOverride) {
    this.materialOverride = materialOverride;
  }


  public SceneItemDataAttributes metadata(Map<String, UpdatePartRevisionRequestDataAttributesMetadataValue> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public SceneItemDataAttributes putMetadataItem(String key, UpdatePartRevisionRequestDataAttributesMetadataValue metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable

  public Map<String, UpdatePartRevisionRequestDataAttributesMetadataValue> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, UpdatePartRevisionRequestDataAttributesMetadataValue> metadata) {
    this.metadata = metadata;
  }


  public SceneItemDataAttributes name(String name) {
    
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


  public SceneItemDataAttributes suppliedId(String suppliedId) {
    
    this.suppliedId = suppliedId;
    return this;
  }

   /**
   * Get suppliedId
   * @return suppliedId
  **/
  @javax.annotation.Nullable

  public String getSuppliedId() {
    return suppliedId;
  }


  public void setSuppliedId(String suppliedId) {
    this.suppliedId = suppliedId;
  }


  public SceneItemDataAttributes transform(Matrix4 transform) {
    
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


  public SceneItemDataAttributes visible(Boolean visible) {
    
    this.visible = visible;
    return this;
  }

   /**
   * Get visible
   * @return visible
  **/
  @javax.annotation.Nullable

  public Boolean getVisible() {
    return visible;
  }


  public void setVisible(Boolean visible) {
    this.visible = visible;
  }


  public SceneItemDataAttributes worldTransform(Matrix4 worldTransform) {
    
    this.worldTransform = worldTransform;
    return this;
  }

   /**
   * Get worldTransform
   * @return worldTransform
  **/
  @javax.annotation.Nullable

  public Matrix4 getWorldTransform() {
    return worldTransform;
  }


  public void setWorldTransform(Matrix4 worldTransform) {
    this.worldTransform = worldTransform;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SceneItemDataAttributes sceneItemDataAttributes = (SceneItemDataAttributes) o;
    return Objects.equals(this.boundingBox, sceneItemDataAttributes.boundingBox) &&
        Objects.equals(this.created, sceneItemDataAttributes.created) &&
        Objects.equals(this.materialOverride, sceneItemDataAttributes.materialOverride) &&
        Objects.equals(this.metadata, sceneItemDataAttributes.metadata) &&
        Objects.equals(this.name, sceneItemDataAttributes.name) &&
        Objects.equals(this.suppliedId, sceneItemDataAttributes.suppliedId) &&
        Objects.equals(this.transform, sceneItemDataAttributes.transform) &&
        Objects.equals(this.visible, sceneItemDataAttributes.visible) &&
        Objects.equals(this.worldTransform, sceneItemDataAttributes.worldTransform);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boundingBox, created, materialOverride, metadata, name, suppliedId, transform, visible, worldTransform);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SceneItemDataAttributes {\n");
    sb.append("    boundingBox: ").append(toIndentedString(boundingBox)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    materialOverride: ").append(toIndentedString(materialOverride)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    suppliedId: ").append(toIndentedString(suppliedId)).append("\n");
    sb.append("    transform: ").append(toIndentedString(transform)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
    sb.append("    worldTransform: ").append(toIndentedString(worldTransform)).append("\n");
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
    openapiFields.add("boundingBox");
    openapiFields.add("created");
    openapiFields.add("materialOverride");
    openapiFields.add("metadata");
    openapiFields.add("name");
    openapiFields.add("suppliedId");
    openapiFields.add("transform");
    openapiFields.add("visible");
    openapiFields.add("worldTransform");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SceneItemDataAttributes
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SceneItemDataAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SceneItemDataAttributes is not found in the empty JSON string", SceneItemDataAttributes.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SceneItemDataAttributes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SceneItemDataAttributes` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `boundingBox`
      if (jsonObj.get("boundingBox") != null && !jsonObj.get("boundingBox").isJsonNull()) {
        BoundingBox.validateJsonObject(jsonObj.getAsJsonObject("boundingBox"));
      }
      // validate the optional field `materialOverride`
      if (jsonObj.get("materialOverride") != null && !jsonObj.get("materialOverride").isJsonNull()) {
        ColorMaterial.validateJsonObject(jsonObj.getAsJsonObject("materialOverride"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("suppliedId") != null && !jsonObj.get("suppliedId").isJsonNull()) && !jsonObj.get("suppliedId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `suppliedId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("suppliedId").toString()));
      }
      // validate the optional field `transform`
      if (jsonObj.get("transform") != null && !jsonObj.get("transform").isJsonNull()) {
        Matrix4.validateJsonObject(jsonObj.getAsJsonObject("transform"));
      }
      // validate the optional field `worldTransform`
      if (jsonObj.get("worldTransform") != null && !jsonObj.get("worldTransform").isJsonNull()) {
        Matrix4.validateJsonObject(jsonObj.getAsJsonObject("worldTransform"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SceneItemDataAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SceneItemDataAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SceneItemDataAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SceneItemDataAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<SceneItemDataAttributes>() {
           @Override
           public void write(JsonWriter out, SceneItemDataAttributes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SceneItemDataAttributes read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SceneItemDataAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SceneItemDataAttributes
  * @throws IOException if the JSON string is invalid with respect to SceneItemDataAttributes
  */
  public static SceneItemDataAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SceneItemDataAttributes.class);
  }

 /**
  * Convert an instance of SceneItemDataAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

