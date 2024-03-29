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
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * AdminCreateApplicationRequestDataAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdminCreateApplicationRequestDataAttributes {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SCOPES = "scopes";
  @SerializedName(SERIALIZED_NAME_SCOPES)
  private List<String> scopes = null;

  public static final String SERIALIZED_NAME_REDIRECT_URIS = "redirect_uris";
  @SerializedName(SERIALIZED_NAME_REDIRECT_URIS)
  private List<String> redirectUris = null;

  public AdminCreateApplicationRequestDataAttributes() { 
  }

  public AdminCreateApplicationRequestDataAttributes name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "some-string", required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AdminCreateApplicationRequestDataAttributes scopes(List<String> scopes) {
    
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getScopes() {
    return scopes;
  }


  public void setScopes(List<String> scopes) {
    this.scopes = scopes;
  }


  public AdminCreateApplicationRequestDataAttributes redirectUris(List<String> redirectUris) {
    
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getRedirectUris() {
    return redirectUris;
  }


  public void setRedirectUris(List<String> redirectUris) {
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

}

