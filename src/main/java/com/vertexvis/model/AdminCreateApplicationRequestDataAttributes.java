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
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * AdminCreateApplicationRequestDataAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class AdminCreateApplicationRequestDataAttributes {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  public static final String SERIALIZED_NAME_SCOPES = "scopes";
  @SerializedName(SERIALIZED_NAME_SCOPES)
  @javax.annotation.Nullable
  private List<String> scopes = new ArrayList<>();

  public static final String SERIALIZED_NAME_REDIRECT_URIS = "redirect_uris";
  @SerializedName(SERIALIZED_NAME_REDIRECT_URIS)
  @javax.annotation.Nullable
  private List<String> redirectUris = new ArrayList<>();

  public AdminCreateApplicationRequestDataAttributes() {
  }

  public AdminCreateApplicationRequestDataAttributes name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public AdminCreateApplicationRequestDataAttributes scopes(@javax.annotation.Nullable List<String> scopes) {
    this.scopes = scopes;
    return this;
  }

  public AdminCreateApplicationRequestDataAttributes addScopesItem(String scopesItem) {
    if (this.scopes == null) {
      this.scopes = new ArrayList<>();
    }
    this.scopes.add(scopesItem);
    return this;
  }

  /**
   * Get scopes
   * @return scopes
   */
  @javax.annotation.Nullable
  public List<String> getScopes() {
    return scopes;
  }

  public void setScopes(@javax.annotation.Nullable List<String> scopes) {
    this.scopes = scopes;
  }


  public AdminCreateApplicationRequestDataAttributes redirectUris(@javax.annotation.Nullable List<String> redirectUris) {
    this.redirectUris = redirectUris;
    return this;
  }

  public AdminCreateApplicationRequestDataAttributes addRedirectUrisItem(String redirectUrisItem) {
    if (this.redirectUris == null) {
      this.redirectUris = new ArrayList<>();
    }
    this.redirectUris.add(redirectUrisItem);
    return this;
  }

  /**
   * Get redirectUris
   * @return redirectUris
   */
  @javax.annotation.Nullable
  public List<String> getRedirectUris() {
    return redirectUris;
  }

  public void setRedirectUris(@javax.annotation.Nullable List<String> redirectUris) {
    this.redirectUris = redirectUris;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdminCreateApplicationRequestDataAttributes adminCreateApplicationRequestDataAttributes = (AdminCreateApplicationRequestDataAttributes) o;
    return Objects.equals(this.name, adminCreateApplicationRequestDataAttributes.name) &&
        Objects.equals(this.scopes, adminCreateApplicationRequestDataAttributes.scopes) &&
        Objects.equals(this.redirectUris, adminCreateApplicationRequestDataAttributes.redirectUris);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, scopes, redirectUris);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminCreateApplicationRequestDataAttributes {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("    redirectUris: ").append(toIndentedString(redirectUris)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("scopes");
    openapiFields.add("redirect_uris");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AdminCreateApplicationRequestDataAttributes
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AdminCreateApplicationRequestDataAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AdminCreateApplicationRequestDataAttributes is not found in the empty JSON string", AdminCreateApplicationRequestDataAttributes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AdminCreateApplicationRequestDataAttributes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AdminCreateApplicationRequestDataAttributes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AdminCreateApplicationRequestDataAttributes.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("scopes") != null && !jsonObj.get("scopes").isJsonNull() && !jsonObj.get("scopes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `scopes` to be an array in the JSON string but got `%s`", jsonObj.get("scopes").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("redirect_uris") != null && !jsonObj.get("redirect_uris").isJsonNull() && !jsonObj.get("redirect_uris").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `redirect_uris` to be an array in the JSON string but got `%s`", jsonObj.get("redirect_uris").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdminCreateApplicationRequestDataAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdminCreateApplicationRequestDataAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdminCreateApplicationRequestDataAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdminCreateApplicationRequestDataAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<AdminCreateApplicationRequestDataAttributes>() {
           @Override
           public void write(JsonWriter out, AdminCreateApplicationRequestDataAttributes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdminCreateApplicationRequestDataAttributes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AdminCreateApplicationRequestDataAttributes given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AdminCreateApplicationRequestDataAttributes
   * @throws IOException if the JSON string is invalid with respect to AdminCreateApplicationRequestDataAttributes
   */
  public static AdminCreateApplicationRequestDataAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdminCreateApplicationRequestDataAttributes.class);
  }

  /**
   * Convert an instance of AdminCreateApplicationRequestDataAttributes to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

