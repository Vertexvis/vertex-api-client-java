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
import com.vertexvis.model.ColorMaterial;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ChangeMaterialOp
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ChangeMaterialOp {
  /**
   * Resource object type.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    CHANGE_MATERIAL("change-material");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_MATERIAL = "material";
  @SerializedName(SERIALIZED_NAME_MATERIAL)
  private ColorMaterial material;

  public ChangeMaterialOp() { 
  }

  public ChangeMaterialOp type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Resource object type.
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "change-material", required = true, value = "Resource object type.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public ChangeMaterialOp material(ColorMaterial material) {
    
    this.material = material;
    return this;
  }

   /**
   * Get material
   * @return material
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ColorMaterial getMaterial() {
    return material;
  }


  public void setMaterial(ColorMaterial material) {
    this.material = material;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeMaterialOp changeMaterialOp = (ChangeMaterialOp) o;
    return Objects.equals(this.type, changeMaterialOp.type) &&
        Objects.equals(this.material, changeMaterialOp.material);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, material);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeMaterialOp {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    material: ").append(toIndentedString(material)).append("\n");
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

