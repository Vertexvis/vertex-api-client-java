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
import com.vertexvis.model.ColorMaterialNullable;
import com.vertexvis.model.Matrix4Nullable;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * UpdateSceneItemOverrideRequestDataAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateSceneItemOverrideRequestDataAttributes {
  public static final String SERIALIZED_NAME_VISIBLE = "visible";
  @SerializedName(SERIALIZED_NAME_VISIBLE)
  private Boolean visible;

  public static final String SERIALIZED_NAME_TRANSFORM = "transform";
  @SerializedName(SERIALIZED_NAME_TRANSFORM)
  private Matrix4Nullable transform;

  public static final String SERIALIZED_NAME_MATERIAL = "material";
  @SerializedName(SERIALIZED_NAME_MATERIAL)
  private ColorMaterialNullable material;

  public static final String SERIALIZED_NAME_SELECTED = "selected";
  @SerializedName(SERIALIZED_NAME_SELECTED)
  private ColorMaterialNullable selected;

  public UpdateSceneItemOverrideRequestDataAttributes() {
  }

  public UpdateSceneItemOverrideRequestDataAttributes visible(Boolean visible) {
    
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


  public UpdateSceneItemOverrideRequestDataAttributes transform(Matrix4Nullable transform) {
    
    this.transform = transform;
    return this;
  }

   /**
   * Get transform
   * @return transform
  **/
  @javax.annotation.Nullable

  public Matrix4Nullable getTransform() {
    return transform;
  }


  public void setTransform(Matrix4Nullable transform) {
    this.transform = transform;
  }


  public UpdateSceneItemOverrideRequestDataAttributes material(ColorMaterialNullable material) {
    
    this.material = material;
    return this;
  }

   /**
   * Get material
   * @return material
  **/
  @javax.annotation.Nullable

  public ColorMaterialNullable getMaterial() {
    return material;
  }


  public void setMaterial(ColorMaterialNullable material) {
    this.material = material;
  }


  public UpdateSceneItemOverrideRequestDataAttributes selected(ColorMaterialNullable selected) {
    
    this.selected = selected;
    return this;
  }

   /**
   * Get selected
   * @return selected
  **/
  @javax.annotation.Nullable

  public ColorMaterialNullable getSelected() {
    return selected;
  }


  public void setSelected(ColorMaterialNullable selected) {
    this.selected = selected;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSceneItemOverrideRequestDataAttributes updateSceneItemOverrideRequestDataAttributes = (UpdateSceneItemOverrideRequestDataAttributes) o;
    return Objects.equals(this.visible, updateSceneItemOverrideRequestDataAttributes.visible) &&
        Objects.equals(this.transform, updateSceneItemOverrideRequestDataAttributes.transform) &&
        Objects.equals(this.material, updateSceneItemOverrideRequestDataAttributes.material) &&
        Objects.equals(this.selected, updateSceneItemOverrideRequestDataAttributes.selected);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(visible, transform, material, selected);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSceneItemOverrideRequestDataAttributes {\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
    sb.append("    transform: ").append(toIndentedString(transform)).append("\n");
    sb.append("    material: ").append(toIndentedString(material)).append("\n");
    sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
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
    openapiFields.add("transform");
    openapiFields.add("material");
    openapiFields.add("selected");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateSceneItemOverrideRequestDataAttributes
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UpdateSceneItemOverrideRequestDataAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateSceneItemOverrideRequestDataAttributes is not found in the empty JSON string", UpdateSceneItemOverrideRequestDataAttributes.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdateSceneItemOverrideRequestDataAttributes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateSceneItemOverrideRequestDataAttributes` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `transform`
      if (jsonObj.get("transform") != null && !jsonObj.get("transform").isJsonNull()) {
        Matrix4Nullable.validateJsonObject(jsonObj.getAsJsonObject("transform"));
      }
      // validate the optional field `material`
      if (jsonObj.get("material") != null && !jsonObj.get("material").isJsonNull()) {
        ColorMaterialNullable.validateJsonObject(jsonObj.getAsJsonObject("material"));
      }
      // validate the optional field `selected`
      if (jsonObj.get("selected") != null && !jsonObj.get("selected").isJsonNull()) {
        ColorMaterialNullable.validateJsonObject(jsonObj.getAsJsonObject("selected"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateSceneItemOverrideRequestDataAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateSceneItemOverrideRequestDataAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateSceneItemOverrideRequestDataAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateSceneItemOverrideRequestDataAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateSceneItemOverrideRequestDataAttributes>() {
           @Override
           public void write(JsonWriter out, UpdateSceneItemOverrideRequestDataAttributes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateSceneItemOverrideRequestDataAttributes read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateSceneItemOverrideRequestDataAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateSceneItemOverrideRequestDataAttributes
  * @throws IOException if the JSON string is invalid with respect to UpdateSceneItemOverrideRequestDataAttributes
  */
  public static UpdateSceneItemOverrideRequestDataAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateSceneItemOverrideRequestDataAttributes.class);
  }

 /**
  * Convert an instance of UpdateSceneItemOverrideRequestDataAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

