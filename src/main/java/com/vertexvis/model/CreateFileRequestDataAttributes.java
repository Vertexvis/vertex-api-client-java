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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CreateFileRequestDataAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateFileRequestDataAttributes {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SUPPLIED_ID = "suppliedId";
  @SerializedName(SERIALIZED_NAME_SUPPLIED_ID)
  private String suppliedId;

  public static final String SERIALIZED_NAME_ROOT_FILE_NAME = "rootFileName";
  @SerializedName(SERIALIZED_NAME_ROOT_FILE_NAME)
  private String rootFileName;


  public CreateFileRequestDataAttributes name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name matching that of the file you are uploading, including file extension.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "model.zip", required = true, value = "Name matching that of the file you are uploading, including file extension.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateFileRequestDataAttributes suppliedId(String suppliedId) {
    
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


  public CreateFileRequestDataAttributes rootFileName(String rootFileName) {
    
    this.rootFileName = rootFileName;
    return this;
  }

   /**
   * File name of the root part or assembly, including file extension. Required if &#x60;name&#x60; references an archive file extension, ignored otherwise.
   * @return rootFileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "root-assembly.prt.1", value = "File name of the root part or assembly, including file extension. Required if `name` references an archive file extension, ignored otherwise.")

  public String getRootFileName() {
    return rootFileName;
  }


  public void setRootFileName(String rootFileName) {
    this.rootFileName = rootFileName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateFileRequestDataAttributes createFileRequestDataAttributes = (CreateFileRequestDataAttributes) o;
    return Objects.equals(this.name, createFileRequestDataAttributes.name) &&
        Objects.equals(this.suppliedId, createFileRequestDataAttributes.suppliedId) &&
        Objects.equals(this.rootFileName, createFileRequestDataAttributes.rootFileName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, suppliedId, rootFileName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFileRequestDataAttributes {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    suppliedId: ").append(toIndentedString(suppliedId)).append("\n");
    sb.append("    rootFileName: ").append(toIndentedString(rootFileName)).append("\n");
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

