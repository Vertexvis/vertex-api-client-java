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
import java.util.ArrayList;
import java.util.List;

/**
 * CreateWebhookSubscriptionRequestDataAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateWebhookSubscriptionRequestDataAttributes {
  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_TOPICS = "topics";
  @SerializedName(SERIALIZED_NAME_TOPICS)
  private List<String> topics = new ArrayList<>();


  public CreateWebhookSubscriptionRequestDataAttributes url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(example = "some-string", required = true, value = "")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public CreateWebhookSubscriptionRequestDataAttributes topics(List<String> topics) {
    
    this.topics = topics;
    return this;
  }

  public CreateWebhookSubscriptionRequestDataAttributes addTopicsItem(String topicsItem) {
    this.topics.add(topicsItem);
    return this;
  }

   /**
   * Get topics
   * @return topics
  **/
  @ApiModelProperty(required = true, value = "")

  public List<String> getTopics() {
    return topics;
  }


  public void setTopics(List<String> topics) {
    this.topics = topics;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateWebhookSubscriptionRequestDataAttributes createWebhookSubscriptionRequestDataAttributes = (CreateWebhookSubscriptionRequestDataAttributes) o;
    return Objects.equals(this.url, createWebhookSubscriptionRequestDataAttributes.url) &&
        Objects.equals(this.topics, createWebhookSubscriptionRequestDataAttributes.topics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, topics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateWebhookSubscriptionRequestDataAttributes {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
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
