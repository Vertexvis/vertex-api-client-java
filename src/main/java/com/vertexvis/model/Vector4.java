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
import java.math.BigDecimal;

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
 * 4D vector.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Vector4 {
  public static final String SERIALIZED_NAME_X = "x";
  @SerializedName(SERIALIZED_NAME_X)
  private BigDecimal x;

  public static final String SERIALIZED_NAME_Y = "y";
  @SerializedName(SERIALIZED_NAME_Y)
  private BigDecimal y;

  public static final String SERIALIZED_NAME_Z = "z";
  @SerializedName(SERIALIZED_NAME_Z)
  private BigDecimal z;

  public static final String SERIALIZED_NAME_W = "w";
  @SerializedName(SERIALIZED_NAME_W)
  private BigDecimal w;

  public Vector4() {
  }

  public Vector4 x(BigDecimal x) {
    
    this.x = x;
    return this;
  }

   /**
   * x-axis coordinate.
   * @return x
  **/
  @javax.annotation.Nonnull

  public BigDecimal getX() {
    return x;
  }


  public void setX(BigDecimal x) {
    this.x = x;
  }


  public Vector4 y(BigDecimal y) {
    
    this.y = y;
    return this;
  }

   /**
   * y-axis coordinate.
   * @return y
  **/
  @javax.annotation.Nonnull

  public BigDecimal getY() {
    return y;
  }


  public void setY(BigDecimal y) {
    this.y = y;
  }


  public Vector4 z(BigDecimal z) {
    
    this.z = z;
    return this;
  }

   /**
   * z-axis coordinate.
   * @return z
  **/
  @javax.annotation.Nonnull

  public BigDecimal getZ() {
    return z;
  }


  public void setZ(BigDecimal z) {
    this.z = z;
  }


  public Vector4 w(BigDecimal w) {
    
    this.w = w;
    return this;
  }

   /**
   * w value.
   * @return w
  **/
  @javax.annotation.Nonnull

  public BigDecimal getW() {
    return w;
  }


  public void setW(BigDecimal w) {
    this.w = w;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vector4 vector4 = (Vector4) o;
    return Objects.equals(this.x, vector4.x) &&
        Objects.equals(this.y, vector4.y) &&
        Objects.equals(this.z, vector4.z) &&
        Objects.equals(this.w, vector4.w);
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y, z, w);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vector4 {\n");
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
    sb.append("    z: ").append(toIndentedString(z)).append("\n");
    sb.append("    w: ").append(toIndentedString(w)).append("\n");
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
    openapiFields.add("x");
    openapiFields.add("y");
    openapiFields.add("z");
    openapiFields.add("w");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("x");
    openapiRequiredFields.add("y");
    openapiRequiredFields.add("z");
    openapiRequiredFields.add("w");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Vector4
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Vector4.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Vector4 is not found in the empty JSON string", Vector4.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Vector4.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Vector4` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Vector4.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Vector4.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Vector4' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Vector4> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Vector4.class));

       return (TypeAdapter<T>) new TypeAdapter<Vector4>() {
           @Override
           public void write(JsonWriter out, Vector4 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Vector4 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Vector4 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Vector4
  * @throws IOException if the JSON string is invalid with respect to Vector4
  */
  public static Vector4 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Vector4.class);
  }

 /**
  * Convert an instance of Vector4 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

