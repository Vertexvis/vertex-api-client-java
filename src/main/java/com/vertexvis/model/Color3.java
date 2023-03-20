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
 * RGB color.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Color3 {
  public static final String SERIALIZED_NAME_R = "r";
  @SerializedName(SERIALIZED_NAME_R)
  private Integer r;

  public static final String SERIALIZED_NAME_G = "g";
  @SerializedName(SERIALIZED_NAME_G)
  private Integer g;

  public static final String SERIALIZED_NAME_B = "b";
  @SerializedName(SERIALIZED_NAME_B)
  private Integer b;

  public Color3() {
  }

  public Color3 r(Integer r) {
    
    this.r = r;
    return this;
  }

   /**
   * Color value from 0 to 255.
   * minimum: 0
   * maximum: 255
   * @return r
  **/
  @javax.annotation.Nonnull

  public Integer getR() {
    return r;
  }


  public void setR(Integer r) {
    this.r = r;
  }


  public Color3 g(Integer g) {
    
    this.g = g;
    return this;
  }

   /**
   * Color value from 0 to 255.
   * minimum: 0
   * maximum: 255
   * @return g
  **/
  @javax.annotation.Nonnull

  public Integer getG() {
    return g;
  }


  public void setG(Integer g) {
    this.g = g;
  }


  public Color3 b(Integer b) {
    
    this.b = b;
    return this;
  }

   /**
   * Color value from 0 to 255.
   * minimum: 0
   * maximum: 255
   * @return b
  **/
  @javax.annotation.Nonnull

  public Integer getB() {
    return b;
  }


  public void setB(Integer b) {
    this.b = b;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Color3 color3 = (Color3) o;
    return Objects.equals(this.r, color3.r) &&
        Objects.equals(this.g, color3.g) &&
        Objects.equals(this.b, color3.b);
  }

  @Override
  public int hashCode() {
    return Objects.hash(r, g, b);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Color3 {\n");
    sb.append("    r: ").append(toIndentedString(r)).append("\n");
    sb.append("    g: ").append(toIndentedString(g)).append("\n");
    sb.append("    b: ").append(toIndentedString(b)).append("\n");
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
    openapiFields.add("r");
    openapiFields.add("g");
    openapiFields.add("b");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("r");
    openapiRequiredFields.add("g");
    openapiRequiredFields.add("b");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Color3
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Color3.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Color3 is not found in the empty JSON string", Color3.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Color3.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Color3` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Color3.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Color3.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Color3' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Color3> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Color3.class));

       return (TypeAdapter<T>) new TypeAdapter<Color3>() {
           @Override
           public void write(JsonWriter out, Color3 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Color3 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Color3 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Color3
  * @throws IOException if the JSON string is invalid with respect to Color3
  */
  public static Color3 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Color3.class);
  }

 /**
  * Convert an instance of Color3 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

