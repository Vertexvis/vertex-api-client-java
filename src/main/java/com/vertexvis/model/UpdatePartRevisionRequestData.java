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
import com.vertexvis.model.CreateGeometrySetRequestDataRelationships;
import com.vertexvis.model.UpdatePartRevisionRequestDataAttributes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;

/**
 * Modify existing part revisions using this endpoint. When specifying a &#x60;relationship&#x60;, the generated output from that relationship will be used to replace any relationship that is present on the revision prior to the update. For example, sending a file relationship that has geometry will replace the existing geometry on the revision with the new geometry in the given file. 
 */
@ApiModel(description = "Modify existing part revisions using this endpoint. When specifying a `relationship`, the generated output from that relationship will be used to replace any relationship that is present on the revision prior to the update. For example, sending a file relationship that has geometry will replace the existing geometry on the revision with the new geometry in the given file. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdatePartRevisionRequestData {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private UpdatePartRevisionRequestDataAttributes attributes;

  public static final String SERIALIZED_NAME_RELATIONSHIPS = "relationships";
  @SerializedName(SERIALIZED_NAME_RELATIONSHIPS)
  private CreateGeometrySetRequestDataRelationships relationships;


  public UpdatePartRevisionRequestData type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Resource object type.
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "part-revision", required = true, value = "Resource object type.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public UpdatePartRevisionRequestData id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of the resource.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "f79d4760-0b71-44e4-ad0b-22743fdd4ca3", required = true, value = "ID of the resource.")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public UpdatePartRevisionRequestData attributes(UpdatePartRevisionRequestDataAttributes attributes) {
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UpdatePartRevisionRequestDataAttributes getAttributes() {
    return attributes;
  }


  public void setAttributes(UpdatePartRevisionRequestDataAttributes attributes) {
    this.attributes = attributes;
  }


  public UpdatePartRevisionRequestData relationships(CreateGeometrySetRequestDataRelationships relationships) {
    
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
    UpdatePartRevisionRequestData updatePartRevisionRequestData = (UpdatePartRevisionRequestData) o;
    return Objects.equals(this.type, updatePartRevisionRequestData.type) &&
        Objects.equals(this.id, updatePartRevisionRequestData.id) &&
        Objects.equals(this.attributes, updatePartRevisionRequestData.attributes) &&
        Objects.equals(this.relationships, updatePartRevisionRequestData.relationships);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, attributes, relationships);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePartRevisionRequestData {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

