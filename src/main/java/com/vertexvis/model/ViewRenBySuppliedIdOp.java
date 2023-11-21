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

/**
 * ViewRenBySuppliedIdOp
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ViewRenBySuppliedIdOp {
  /**
   * Resource object type.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    VIEW_RENDITION_BY_SUPPLIED_ID("view-rendition-by-supplied-id");

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

  public static final String SERIALIZED_NAME_RENDITION_SUPPLIED_ID = "renditionSuppliedId";
  @SerializedName(SERIALIZED_NAME_RENDITION_SUPPLIED_ID)
  private String renditionSuppliedId;

  public ViewRenBySuppliedIdOp() { 
  }

  public ViewRenBySuppliedIdOp type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Resource object type.
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "view-rendition-by-supplied-id", required = true, value = "Resource object type.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public ViewRenBySuppliedIdOp renditionSuppliedId(String renditionSuppliedId) {
    
    this.renditionSuppliedId = renditionSuppliedId;
    return this;
  }

   /**
   * Get renditionSuppliedId
   * @return renditionSuppliedId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getRenditionSuppliedId() {
    return renditionSuppliedId;
  }


  public void setRenditionSuppliedId(String renditionSuppliedId) {
    this.renditionSuppliedId = renditionSuppliedId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewRenBySuppliedIdOp viewRenBySuppliedIdOp = (ViewRenBySuppliedIdOp) o;
    return Objects.equals(this.type, viewRenBySuppliedIdOp.type) &&
        Objects.equals(this.renditionSuppliedId, viewRenBySuppliedIdOp.renditionSuppliedId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, renditionSuppliedId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewRenBySuppliedIdOp {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    renditionSuppliedId: ").append(toIndentedString(renditionSuppliedId)).append("\n");
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

