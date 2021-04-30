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
import com.vertexvis.model.Color3;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Color properties describing how a material looks.
 */
@ApiModel(description = "Color properties describing how a material looks.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ColorMaterialNullable {
  public static final String SERIALIZED_NAME_OPACITY = "opacity";
  @SerializedName(SERIALIZED_NAME_OPACITY)
  private Integer opacity;

  public static final String SERIALIZED_NAME_GLOSSINESS = "glossiness";
  @SerializedName(SERIALIZED_NAME_GLOSSINESS)
  private Integer glossiness;

  public static final String SERIALIZED_NAME_AMBIENT = "ambient";
  @SerializedName(SERIALIZED_NAME_AMBIENT)
  private Color3 ambient;

  public static final String SERIALIZED_NAME_DIFFUSE = "diffuse";
  @SerializedName(SERIALIZED_NAME_DIFFUSE)
  private Color3 diffuse;

  public static final String SERIALIZED_NAME_SPECULAR = "specular";
  @SerializedName(SERIALIZED_NAME_SPECULAR)
  private Color3 specular;

  public static final String SERIALIZED_NAME_EMISSIVE = "emissive";
  @SerializedName(SERIALIZED_NAME_EMISSIVE)
  private Color3 emissive;


  public ColorMaterialNullable opacity(Integer opacity) {
    
    this.opacity = opacity;
    return this;
  }

   /**
   * Opacity from 0 to 100.
   * minimum: 0
   * maximum: 100
   * @return opacity
  **/
  @ApiModelProperty(example = "0", required = true, value = "Opacity from 0 to 100.")

  public Integer getOpacity() {
    return opacity;
  }


  public void setOpacity(Integer opacity) {
    this.opacity = opacity;
  }


  public ColorMaterialNullable glossiness(Integer glossiness) {
    
    this.glossiness = glossiness;
    return this;
  }

   /**
   * Glossiness from 0 to 128.
   * minimum: 0
   * maximum: 128
   * @return glossiness
  **/
  @ApiModelProperty(example = "0", required = true, value = "Glossiness from 0 to 128.")

  public Integer getGlossiness() {
    return glossiness;
  }


  public void setGlossiness(Integer glossiness) {
    this.glossiness = glossiness;
  }


  public ColorMaterialNullable ambient(Color3 ambient) {
    
    this.ambient = ambient;
    return this;
  }

   /**
   * Get ambient
   * @return ambient
  **/
  @ApiModelProperty(required = true, value = "")

  public Color3 getAmbient() {
    return ambient;
  }


  public void setAmbient(Color3 ambient) {
    this.ambient = ambient;
  }


  public ColorMaterialNullable diffuse(Color3 diffuse) {
    
    this.diffuse = diffuse;
    return this;
  }

   /**
   * Get diffuse
   * @return diffuse
  **/
  @ApiModelProperty(required = true, value = "")

  public Color3 getDiffuse() {
    return diffuse;
  }


  public void setDiffuse(Color3 diffuse) {
    this.diffuse = diffuse;
  }


  public ColorMaterialNullable specular(Color3 specular) {
    
    this.specular = specular;
    return this;
  }

   /**
   * Get specular
   * @return specular
  **/
  @ApiModelProperty(required = true, value = "")

  public Color3 getSpecular() {
    return specular;
  }


  public void setSpecular(Color3 specular) {
    this.specular = specular;
  }


  public ColorMaterialNullable emissive(Color3 emissive) {
    
    this.emissive = emissive;
    return this;
  }

   /**
   * Get emissive
   * @return emissive
  **/
  @ApiModelProperty(required = true, value = "")

  public Color3 getEmissive() {
    return emissive;
  }


  public void setEmissive(Color3 emissive) {
    this.emissive = emissive;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ColorMaterialNullable colorMaterialNullable = (ColorMaterialNullable) o;
    return Objects.equals(this.opacity, colorMaterialNullable.opacity) &&
        Objects.equals(this.glossiness, colorMaterialNullable.glossiness) &&
        Objects.equals(this.ambient, colorMaterialNullable.ambient) &&
        Objects.equals(this.diffuse, colorMaterialNullable.diffuse) &&
        Objects.equals(this.specular, colorMaterialNullable.specular) &&
        Objects.equals(this.emissive, colorMaterialNullable.emissive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(opacity, glossiness, ambient, diffuse, specular, emissive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ColorMaterialNullable {\n");
    sb.append("    opacity: ").append(toIndentedString(opacity)).append("\n");
    sb.append("    glossiness: ").append(toIndentedString(glossiness)).append("\n");
    sb.append("    ambient: ").append(toIndentedString(ambient)).append("\n");
    sb.append("    diffuse: ").append(toIndentedString(diffuse)).append("\n");
    sb.append("    specular: ").append(toIndentedString(specular)).append("\n");
    sb.append("    emissive: ").append(toIndentedString(emissive)).append("\n");
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

