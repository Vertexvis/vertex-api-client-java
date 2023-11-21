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
import com.vertexvis.model.CreateGeometrySetRequestDataRelationships;
import com.vertexvis.model.CreatePartRenditionRequestDataAttributes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Create a new part rendition.  This endpoint includes multiple successful response codes: [&#x60;201&#x60;, &#x60;202&#x60;].  When not given a relationship, this endpoint will create a part rendition with an empty geometry and return a &#x60;201&#x60; status code.  When given a relationship to translate, this endpoint will return a &#x60;202&#x60; status code with the location of a &#x60;queued-translation&#x60;. The status of the translation can be queried via &#x60;getQueuedTranslation&#x60;. After the translation is complete, the returned value will include a &#x60;part-rendition&#x60; that references the translated geometry. 
 */
@ApiModel(description = "Create a new part rendition.  This endpoint includes multiple successful response codes: [`201`, `202`].  When not given a relationship, this endpoint will create a part rendition with an empty geometry and return a `201` status code.  When given a relationship to translate, this endpoint will return a `202` status code with the location of a `queued-translation`. The status of the translation can be queried via `getQueuedTranslation`. After the translation is complete, the returned value will include a `part-rendition` that references the translated geometry. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreatePartRenditionRequestData {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private CreatePartRenditionRequestDataAttributes attributes;

  public static final String SERIALIZED_NAME_RELATIONSHIPS = "relationships";
  @SerializedName(SERIALIZED_NAME_RELATIONSHIPS)
  private CreateGeometrySetRequestDataRelationships relationships;

  public CreatePartRenditionRequestData() { 
  }

  public CreatePartRenditionRequestData type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Resource object type.
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "part-rendition", required = true, value = "Resource object type.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public CreatePartRenditionRequestData attributes(CreatePartRenditionRequestDataAttributes attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public CreatePartRenditionRequestDataAttributes getAttributes() {
    return attributes;
  }


  public void setAttributes(CreatePartRenditionRequestDataAttributes attributes) {
    this.attributes = attributes;
  }


  public CreatePartRenditionRequestData relationships(CreateGeometrySetRequestDataRelationships relationships) {
    
    this.relationships = relationships;
    return this;
  }

   /**
   * Get relationships
   * @return relationships
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreateGeometrySetRequestDataRelationships getRelationships() {
    return relationships;
  }


  public void setRelationships(CreateGeometrySetRequestDataRelationships relationships) {
    this.relationships = relationships;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePartRenditionRequestData createPartRenditionRequestData = (CreatePartRenditionRequestData) o;
    return Objects.equals(this.type, createPartRenditionRequestData.type) &&
        Objects.equals(this.attributes, createPartRenditionRequestData.attributes) &&
        Objects.equals(this.relationships, createPartRenditionRequestData.relationships);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, attributes, relationships);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePartRenditionRequestData {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
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
