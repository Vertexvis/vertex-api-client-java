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
import com.vertexvis.model.SceneItemRelationship;
import com.vertexvis.model.SceneViewRelationship;
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
 * SceneItemOverrideDataRelationships
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class SceneItemOverrideDataRelationships {
  public static final String SERIALIZED_NAME_SCENE_ITEM = "sceneItem";
  @SerializedName(SERIALIZED_NAME_SCENE_ITEM)
  @javax.annotation.Nonnull
  private SceneItemRelationship sceneItem;

  public static final String SERIALIZED_NAME_SCENE_VIEW = "sceneView";
  @SerializedName(SERIALIZED_NAME_SCENE_VIEW)
  @javax.annotation.Nonnull
  private SceneViewRelationship sceneView;

  public SceneItemOverrideDataRelationships() {
  }

  public SceneItemOverrideDataRelationships sceneItem(@javax.annotation.Nonnull SceneItemRelationship sceneItem) {
    this.sceneItem = sceneItem;
    return this;
  }

  /**
   * Get sceneItem
   * @return sceneItem
   */
  @javax.annotation.Nonnull
  public SceneItemRelationship getSceneItem() {
    return sceneItem;
  }

  public void setSceneItem(@javax.annotation.Nonnull SceneItemRelationship sceneItem) {
    this.sceneItem = sceneItem;
  }


  public SceneItemOverrideDataRelationships sceneView(@javax.annotation.Nonnull SceneViewRelationship sceneView) {
    this.sceneView = sceneView;
    return this;
  }

  /**
   * Get sceneView
   * @return sceneView
   */
  @javax.annotation.Nonnull
  public SceneViewRelationship getSceneView() {
    return sceneView;
  }

  public void setSceneView(@javax.annotation.Nonnull SceneViewRelationship sceneView) {
    this.sceneView = sceneView;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SceneItemOverrideDataRelationships sceneItemOverrideDataRelationships = (SceneItemOverrideDataRelationships) o;
    return Objects.equals(this.sceneItem, sceneItemOverrideDataRelationships.sceneItem) &&
        Objects.equals(this.sceneView, sceneItemOverrideDataRelationships.sceneView);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sceneItem, sceneView);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SceneItemOverrideDataRelationships {\n");
    sb.append("    sceneItem: ").append(toIndentedString(sceneItem)).append("\n");
    sb.append("    sceneView: ").append(toIndentedString(sceneView)).append("\n");
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
    openapiFields.add("sceneItem");
    openapiFields.add("sceneView");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("sceneItem");
    openapiRequiredFields.add("sceneView");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SceneItemOverrideDataRelationships
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SceneItemOverrideDataRelationships.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SceneItemOverrideDataRelationships is not found in the empty JSON string", SceneItemOverrideDataRelationships.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SceneItemOverrideDataRelationships.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SceneItemOverrideDataRelationships` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SceneItemOverrideDataRelationships.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `sceneItem`
      SceneItemRelationship.validateJsonElement(jsonObj.get("sceneItem"));
      // validate the required field `sceneView`
      SceneViewRelationship.validateJsonElement(jsonObj.get("sceneView"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SceneItemOverrideDataRelationships.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SceneItemOverrideDataRelationships' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SceneItemOverrideDataRelationships> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SceneItemOverrideDataRelationships.class));

       return (TypeAdapter<T>) new TypeAdapter<SceneItemOverrideDataRelationships>() {
           @Override
           public void write(JsonWriter out, SceneItemOverrideDataRelationships value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SceneItemOverrideDataRelationships read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SceneItemOverrideDataRelationships given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SceneItemOverrideDataRelationships
   * @throws IOException if the JSON string is invalid with respect to SceneItemOverrideDataRelationships
   */
  public static SceneItemOverrideDataRelationships fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SceneItemOverrideDataRelationships.class);
  }

  /**
   * Convert an instance of SceneItemOverrideDataRelationships to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

