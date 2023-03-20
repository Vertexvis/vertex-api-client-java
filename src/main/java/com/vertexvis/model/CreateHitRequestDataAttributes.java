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
import com.vertexvis.model.Dimensions;
import com.vertexvis.model.Point;
import java.io.IOException;

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
 * CreateHitRequestDataAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateHitRequestDataAttributes {
  public static final String SERIALIZED_NAME_POINT = "point";
  @SerializedName(SERIALIZED_NAME_POINT)
  private Point point;

  public static final String SERIALIZED_NAME_VIEWPORT = "viewport";
  @SerializedName(SERIALIZED_NAME_VIEWPORT)
  private Dimensions viewport;

  public CreateHitRequestDataAttributes() {
  }

  public CreateHitRequestDataAttributes point(Point point) {
    
    this.point = point;
    return this;
  }

   /**
   * Get point
   * @return point
  **/
  @javax.annotation.Nonnull

  public Point getPoint() {
    return point;
  }


  public void setPoint(Point point) {
    this.point = point;
  }


  public CreateHitRequestDataAttributes viewport(Dimensions viewport) {
    
    this.viewport = viewport;
    return this;
  }

   /**
   * Get viewport
   * @return viewport
  **/
  @javax.annotation.Nonnull

  public Dimensions getViewport() {
    return viewport;
  }


  public void setViewport(Dimensions viewport) {
    this.viewport = viewport;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateHitRequestDataAttributes createHitRequestDataAttributes = (CreateHitRequestDataAttributes) o;
    return Objects.equals(this.point, createHitRequestDataAttributes.point) &&
        Objects.equals(this.viewport, createHitRequestDataAttributes.viewport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(point, viewport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateHitRequestDataAttributes {\n");
    sb.append("    point: ").append(toIndentedString(point)).append("\n");
    sb.append("    viewport: ").append(toIndentedString(viewport)).append("\n");
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
    openapiFields.add("point");
    openapiFields.add("viewport");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("point");
    openapiRequiredFields.add("viewport");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateHitRequestDataAttributes
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateHitRequestDataAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateHitRequestDataAttributes is not found in the empty JSON string", CreateHitRequestDataAttributes.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateHitRequestDataAttributes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateHitRequestDataAttributes` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateHitRequestDataAttributes.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `point`
      Point.validateJsonObject(jsonObj.getAsJsonObject("point"));
      // validate the required field `viewport`
      Dimensions.validateJsonObject(jsonObj.getAsJsonObject("viewport"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateHitRequestDataAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateHitRequestDataAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateHitRequestDataAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateHitRequestDataAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateHitRequestDataAttributes>() {
           @Override
           public void write(JsonWriter out, CreateHitRequestDataAttributes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateHitRequestDataAttributes read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateHitRequestDataAttributes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateHitRequestDataAttributes
  * @throws IOException if the JSON string is invalid with respect to CreateHitRequestDataAttributes
  */
  public static CreateHitRequestDataAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateHitRequestDataAttributes.class);
  }

 /**
  * Convert an instance of CreateHitRequestDataAttributes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

