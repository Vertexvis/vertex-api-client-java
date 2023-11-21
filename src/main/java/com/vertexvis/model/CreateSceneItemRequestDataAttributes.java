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
import com.vertexvis.model.AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType;
import com.vertexvis.model.ColorMaterial;
import com.vertexvis.model.Matrix4;
import com.vertexvis.model.PartRevisionSuppliedId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * CreateSceneItemRequestDataAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateSceneItemRequestDataAttributes {
  public static final String SERIALIZED_NAME_MATERIAL_OVERRIDE = "materialOverride";
  @SerializedName(SERIALIZED_NAME_MATERIAL_OVERRIDE)
  private ColorMaterial materialOverride;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ORDINAL = "ordinal";
  @SerializedName(SERIALIZED_NAME_ORDINAL)
  private Integer ordinal;

  public static final String SERIALIZED_NAME_PARENT = "parent";
  @SerializedName(SERIALIZED_NAME_PARENT)
  private String parent;

  public static final String SERIALIZED_NAME_PART_INSTANCE_SUPPLIED_IDS_AS_SUPPLIED_IDS = "partInstanceSuppliedIdsAsSuppliedIds";
  @SerializedName(SERIALIZED_NAME_PART_INSTANCE_SUPPLIED_IDS_AS_SUPPLIED_IDS)
  private Boolean partInstanceSuppliedIdsAsSuppliedIds;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private PartRevisionSuppliedId source;

  public static final String SERIALIZED_NAME_SUPPLIED_ID = "suppliedId";
  @SerializedName(SERIALIZED_NAME_SUPPLIED_ID)
  private String suppliedId;

  public static final String SERIALIZED_NAME_TRANSFORM = "transform";
  @SerializedName(SERIALIZED_NAME_TRANSFORM)
  private Matrix4 transform;

  public static final String SERIALIZED_NAME_VISIBLE = "visible";
  @SerializedName(SERIALIZED_NAME_VISIBLE)
  private Boolean visible;

  public static final String SERIALIZED_NAME_PHANTOM = "phantom";
  @SerializedName(SERIALIZED_NAME_PHANTOM)
  private Boolean phantom;

  public static final String SERIALIZED_NAME_END_ITEM = "endItem";
  @SerializedName(SERIALIZED_NAME_END_ITEM)
  private Boolean endItem;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType> metadata = null;

  public CreateSceneItemRequestDataAttributes() { 
  }

  public CreateSceneItemRequestDataAttributes materialOverride(ColorMaterial materialOverride) {
    
    this.materialOverride = materialOverride;
    return this;
  }

   /**
   * Get materialOverride
   * @return materialOverride
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ColorMaterial getMaterialOverride() {
    return materialOverride;
  }


  public void setMaterialOverride(ColorMaterial materialOverride) {
    this.materialOverride = materialOverride;
  }


  public CreateSceneItemRequestDataAttributes name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "some-string", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateSceneItemRequestDataAttributes ordinal(Integer ordinal) {
    
    this.ordinal = ordinal;
    return this;
  }

   /**
   * A 0-based index used for defining a consistent ordering amongst sibling scene items.
   * @return ordinal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A 0-based index used for defining a consistent ordering amongst sibling scene items.")

  public Integer getOrdinal() {
    return ordinal;
  }


  public void setOrdinal(Integer ordinal) {
    this.ordinal = ordinal;
  }


  public CreateSceneItemRequestDataAttributes parent(String parent) {
    
    this.parent = parent;
    return this;
  }

   /**
   * Optional ability to specify a parent scene item by scene item supplied ID. For example, an  existing ID from a PLM system. This approach is an alternative to providing a specific scene  item ID with the relationship parent property. 
   * @return parent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PN12345", value = "Optional ability to specify a parent scene item by scene item supplied ID. For example, an  existing ID from a PLM system. This approach is an alternative to providing a specific scene  item ID with the relationship parent property. ")

  public String getParent() {
    return parent;
  }


  public void setParent(String parent) {
    this.parent = parent;
  }


  public CreateSceneItemRequestDataAttributes partInstanceSuppliedIdsAsSuppliedIds(Boolean partInstanceSuppliedIdsAsSuppliedIds) {
    
    this.partInstanceSuppliedIdsAsSuppliedIds = partInstanceSuppliedIdsAsSuppliedIds;
    return this;
  }

   /**
   * Whether or not to use part instance supplied IDs as scene item supplied IDs.
   * @return partInstanceSuppliedIdsAsSuppliedIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Whether or not to use part instance supplied IDs as scene item supplied IDs.")

  public Boolean getPartInstanceSuppliedIdsAsSuppliedIds() {
    return partInstanceSuppliedIdsAsSuppliedIds;
  }


  public void setPartInstanceSuppliedIdsAsSuppliedIds(Boolean partInstanceSuppliedIdsAsSuppliedIds) {
    this.partInstanceSuppliedIdsAsSuppliedIds = partInstanceSuppliedIdsAsSuppliedIds;
  }


  public CreateSceneItemRequestDataAttributes source(PartRevisionSuppliedId source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PartRevisionSuppliedId getSource() {
    return source;
  }


  public void setSource(PartRevisionSuppliedId source) {
    this.source = source;
  }


  public CreateSceneItemRequestDataAttributes suppliedId(String suppliedId) {
    
    this.suppliedId = suppliedId;
    return this;
  }

   /**
   * ID provided for correlation. For example, an existing ID from a PLM system.
   * @return suppliedId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PN12345", value = "ID provided for correlation. For example, an existing ID from a PLM system.")

  public String getSuppliedId() {
    return suppliedId;
  }


  public void setSuppliedId(String suppliedId) {
    this.suppliedId = suppliedId;
  }


  public CreateSceneItemRequestDataAttributes transform(Matrix4 transform) {
    
    this.transform = transform;
    return this;
  }

   /**
   * Get transform
   * @return transform
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Matrix4 getTransform() {
    return transform;
  }


  public void setTransform(Matrix4 transform) {
    this.transform = transform;
  }


  public CreateSceneItemRequestDataAttributes visible(Boolean visible) {
    
    this.visible = visible;
    return this;
  }

   /**
   * Item visibility.
   * @return visible
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Item visibility.")

  public Boolean getVisible() {
    return visible;
  }


  public void setVisible(Boolean visible) {
    this.visible = visible;
  }


  public CreateSceneItemRequestDataAttributes phantom(Boolean phantom) {
    
    this.phantom = phantom;
    return this;
  }

   /**
   * Phantom state of the item.
   * @return phantom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Phantom state of the item.")

  public Boolean getPhantom() {
    return phantom;
  }


  public void setPhantom(Boolean phantom) {
    this.phantom = phantom;
  }


  public CreateSceneItemRequestDataAttributes endItem(Boolean endItem) {
    
    this.endItem = endItem;
    return this;
  }

   /**
   * Whether this item is an end item.
   * @return endItem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether this item is an end item.")

  public Boolean getEndItem() {
    return endItem;
  }


  public void setEndItem(Boolean endItem) {
    this.endItem = endItem;
  }


  public CreateSceneItemRequestDataAttributes metadata(Map<String, AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public CreateSceneItemRequestDataAttributes putMetadataItem(String key, AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Additional metadata for the scene-item. This metadata will take precedence over any metadata that belongs to the part file. 
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional metadata for the scene-item. This metadata will take precedence over any metadata that belongs to the part file. ")

  public Map<String, AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, AnyOfMetadataLongTypeMetadataFloatTypeMetadataDateTypeMetadataStringTypeMetadataNullType> metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSceneItemRequestDataAttributes createSceneItemRequestDataAttributes = (CreateSceneItemRequestDataAttributes) o;
    return Objects.equals(this.materialOverride, createSceneItemRequestDataAttributes.materialOverride) &&
        Objects.equals(this.name, createSceneItemRequestDataAttributes.name) &&
        Objects.equals(this.ordinal, createSceneItemRequestDataAttributes.ordinal) &&
        Objects.equals(this.parent, createSceneItemRequestDataAttributes.parent) &&
        Objects.equals(this.partInstanceSuppliedIdsAsSuppliedIds, createSceneItemRequestDataAttributes.partInstanceSuppliedIdsAsSuppliedIds) &&
        Objects.equals(this.source, createSceneItemRequestDataAttributes.source) &&
        Objects.equals(this.suppliedId, createSceneItemRequestDataAttributes.suppliedId) &&
        Objects.equals(this.transform, createSceneItemRequestDataAttributes.transform) &&
        Objects.equals(this.visible, createSceneItemRequestDataAttributes.visible) &&
        Objects.equals(this.phantom, createSceneItemRequestDataAttributes.phantom) &&
        Objects.equals(this.endItem, createSceneItemRequestDataAttributes.endItem) &&
        Objects.equals(this.metadata, createSceneItemRequestDataAttributes.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(materialOverride, name, ordinal, parent, partInstanceSuppliedIdsAsSuppliedIds, source, suppliedId, transform, visible, phantom, endItem, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSceneItemRequestDataAttributes {\n");
    sb.append("    materialOverride: ").append(toIndentedString(materialOverride)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ordinal: ").append(toIndentedString(ordinal)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    partInstanceSuppliedIdsAsSuppliedIds: ").append(toIndentedString(partInstanceSuppliedIdsAsSuppliedIds)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    suppliedId: ").append(toIndentedString(suppliedId)).append("\n");
    sb.append("    transform: ").append(toIndentedString(transform)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
    sb.append("    phantom: ").append(toIndentedString(phantom)).append("\n");
    sb.append("    endItem: ").append(toIndentedString(endItem)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

