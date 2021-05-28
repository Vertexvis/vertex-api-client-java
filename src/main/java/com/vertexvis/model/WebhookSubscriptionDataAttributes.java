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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * WebhookSubscriptionDataAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WebhookSubscriptionDataAttributes {
  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_TOPICS = "topics";
  @SerializedName(SERIALIZED_NAME_TOPICS)
  private List<String> topics = new ArrayList<>();

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ACTIVE("active"),
    
    PAUSED("paused");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;


  public WebhookSubscriptionDataAttributes url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(required = true, value = "")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public WebhookSubscriptionDataAttributes secret(String secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * Get secret
   * @return secret
  **/
  @ApiModelProperty(example = "i3MFRDOmg1pxD36dGCTONRwOujkgV8m9LQ", required = true, value = "")

  public String getSecret() {
    return secret;
  }


  public void setSecret(String secret) {
    this.secret = secret;
  }


  public WebhookSubscriptionDataAttributes topics(List<String> topics) {
    
    this.topics = topics;
    return this;
  }

  public WebhookSubscriptionDataAttributes addTopicsItem(String topicsItem) {
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


  public WebhookSubscriptionDataAttributes status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "active", required = true, value = "")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public WebhookSubscriptionDataAttributes created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(example = "2020-01-01T12:00Z", required = true, value = "")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookSubscriptionDataAttributes webhookSubscriptionDataAttributes = (WebhookSubscriptionDataAttributes) o;
    return Objects.equals(this.url, webhookSubscriptionDataAttributes.url) &&
        Objects.equals(this.secret, webhookSubscriptionDataAttributes.secret) &&
        Objects.equals(this.topics, webhookSubscriptionDataAttributes.topics) &&
        Objects.equals(this.status, webhookSubscriptionDataAttributes.status) &&
        Objects.equals(this.created, webhookSubscriptionDataAttributes.created);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, secret, topics, status, created);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookSubscriptionDataAttributes {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
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

