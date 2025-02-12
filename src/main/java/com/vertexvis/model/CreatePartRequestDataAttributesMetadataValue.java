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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.vertexvis.model.MetadataDateType;
import com.vertexvis.model.MetadataFloatType;
import com.vertexvis.model.MetadataLongType;
import com.vertexvis.model.MetadataNullType;
import com.vertexvis.model.MetadataStringType;
import java.io.IOException;
import java.util.Arrays;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import com.vertexvis.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class CreatePartRequestDataAttributesMetadataValue extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CreatePartRequestDataAttributesMetadataValue.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CreatePartRequestDataAttributesMetadataValue.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CreatePartRequestDataAttributesMetadataValue' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<MetadataLongType> adapterMetadataLongType = gson.getDelegateAdapter(this, TypeToken.get(MetadataLongType.class));
            final TypeAdapter<MetadataFloatType> adapterMetadataFloatType = gson.getDelegateAdapter(this, TypeToken.get(MetadataFloatType.class));
            final TypeAdapter<MetadataDateType> adapterMetadataDateType = gson.getDelegateAdapter(this, TypeToken.get(MetadataDateType.class));
            final TypeAdapter<MetadataStringType> adapterMetadataStringType = gson.getDelegateAdapter(this, TypeToken.get(MetadataStringType.class));
            final TypeAdapter<MetadataNullType> adapterMetadataNullType = gson.getDelegateAdapter(this, TypeToken.get(MetadataNullType.class));

            return (TypeAdapter<T>) new TypeAdapter<CreatePartRequestDataAttributesMetadataValue>() {
                @Override
                public void write(JsonWriter out, CreatePartRequestDataAttributesMetadataValue value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `MetadataLongType`
                    if (value.getActualInstance() instanceof MetadataLongType) {
                        JsonElement element = adapterMetadataLongType.toJsonTree((MetadataLongType)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `MetadataFloatType`
                    if (value.getActualInstance() instanceof MetadataFloatType) {
                        JsonElement element = adapterMetadataFloatType.toJsonTree((MetadataFloatType)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `MetadataDateType`
                    if (value.getActualInstance() instanceof MetadataDateType) {
                        JsonElement element = adapterMetadataDateType.toJsonTree((MetadataDateType)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `MetadataStringType`
                    if (value.getActualInstance() instanceof MetadataStringType) {
                        JsonElement element = adapterMetadataStringType.toJsonTree((MetadataStringType)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `MetadataNullType`
                    if (value.getActualInstance() instanceof MetadataNullType) {
                        JsonElement element = adapterMetadataNullType.toJsonTree((MetadataNullType)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: MetadataDateType, MetadataFloatType, MetadataLongType, MetadataNullType, MetadataStringType");
                }

                @Override
                public CreatePartRequestDataAttributesMetadataValue read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize MetadataLongType
                    try {
                        // validate the JSON object to see if any exception is thrown
                        MetadataLongType.validateJsonElement(jsonElement);
                        actualAdapter = adapterMetadataLongType;
                        CreatePartRequestDataAttributesMetadataValue ret = new CreatePartRequestDataAttributesMetadataValue();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for MetadataLongType failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'MetadataLongType'", e);
                    }
                    // deserialize MetadataFloatType
                    try {
                        // validate the JSON object to see if any exception is thrown
                        MetadataFloatType.validateJsonElement(jsonElement);
                        actualAdapter = adapterMetadataFloatType;
                        CreatePartRequestDataAttributesMetadataValue ret = new CreatePartRequestDataAttributesMetadataValue();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for MetadataFloatType failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'MetadataFloatType'", e);
                    }
                    // deserialize MetadataDateType
                    try {
                        // validate the JSON object to see if any exception is thrown
                        MetadataDateType.validateJsonElement(jsonElement);
                        actualAdapter = adapterMetadataDateType;
                        CreatePartRequestDataAttributesMetadataValue ret = new CreatePartRequestDataAttributesMetadataValue();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for MetadataDateType failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'MetadataDateType'", e);
                    }
                    // deserialize MetadataStringType
                    try {
                        // validate the JSON object to see if any exception is thrown
                        MetadataStringType.validateJsonElement(jsonElement);
                        actualAdapter = adapterMetadataStringType;
                        CreatePartRequestDataAttributesMetadataValue ret = new CreatePartRequestDataAttributesMetadataValue();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for MetadataStringType failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'MetadataStringType'", e);
                    }
                    // deserialize MetadataNullType
                    try {
                        // validate the JSON object to see if any exception is thrown
                        MetadataNullType.validateJsonElement(jsonElement);
                        actualAdapter = adapterMetadataNullType;
                        CreatePartRequestDataAttributesMetadataValue ret = new CreatePartRequestDataAttributesMetadataValue();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for MetadataNullType failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'MetadataNullType'", e);
                    }

                    throw new IOException(String.format("Failed deserialization for CreatePartRequestDataAttributesMetadataValue: no class matches result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public CreatePartRequestDataAttributesMetadataValue() {
        super("anyOf", Boolean.FALSE);
    }

    public CreatePartRequestDataAttributesMetadataValue(Object o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("MetadataLongType", MetadataLongType.class);
        schemas.put("MetadataFloatType", MetadataFloatType.class);
        schemas.put("MetadataDateType", MetadataDateType.class);
        schemas.put("MetadataStringType", MetadataStringType.class);
        schemas.put("MetadataNullType", MetadataNullType.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return CreatePartRequestDataAttributesMetadataValue.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * MetadataDateType, MetadataFloatType, MetadataLongType, MetadataNullType, MetadataStringType
     *
     * It could be an instance of the 'anyOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof MetadataLongType) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof MetadataFloatType) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof MetadataDateType) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof MetadataStringType) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof MetadataNullType) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be MetadataDateType, MetadataFloatType, MetadataLongType, MetadataNullType, MetadataStringType");
    }

    /**
     * Get the actual instance, which can be the following:
     * MetadataDateType, MetadataFloatType, MetadataLongType, MetadataNullType, MetadataStringType
     *
     * @return The actual instance (MetadataDateType, MetadataFloatType, MetadataLongType, MetadataNullType, MetadataStringType)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `MetadataLongType`. If the actual instance is not `MetadataLongType`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `MetadataLongType`
     * @throws ClassCastException if the instance is not `MetadataLongType`
     */
    public MetadataLongType getMetadataLongType() throws ClassCastException {
        return (MetadataLongType)super.getActualInstance();
    }

    /**
     * Get the actual instance of `MetadataFloatType`. If the actual instance is not `MetadataFloatType`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `MetadataFloatType`
     * @throws ClassCastException if the instance is not `MetadataFloatType`
     */
    public MetadataFloatType getMetadataFloatType() throws ClassCastException {
        return (MetadataFloatType)super.getActualInstance();
    }

    /**
     * Get the actual instance of `MetadataDateType`. If the actual instance is not `MetadataDateType`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `MetadataDateType`
     * @throws ClassCastException if the instance is not `MetadataDateType`
     */
    public MetadataDateType getMetadataDateType() throws ClassCastException {
        return (MetadataDateType)super.getActualInstance();
    }

    /**
     * Get the actual instance of `MetadataStringType`. If the actual instance is not `MetadataStringType`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `MetadataStringType`
     * @throws ClassCastException if the instance is not `MetadataStringType`
     */
    public MetadataStringType getMetadataStringType() throws ClassCastException {
        return (MetadataStringType)super.getActualInstance();
    }

    /**
     * Get the actual instance of `MetadataNullType`. If the actual instance is not `MetadataNullType`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `MetadataNullType`
     * @throws ClassCastException if the instance is not `MetadataNullType`
     */
    public MetadataNullType getMetadataNullType() throws ClassCastException {
        return (MetadataNullType)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to CreatePartRequestDataAttributesMetadataValue
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate anyOf schemas one by one
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with MetadataLongType
        try {
            MetadataLongType.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for MetadataLongType failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with MetadataFloatType
        try {
            MetadataFloatType.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for MetadataFloatType failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with MetadataDateType
        try {
            MetadataDateType.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for MetadataDateType failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with MetadataStringType
        try {
            MetadataStringType.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for MetadataStringType failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with MetadataNullType
        try {
            MetadataNullType.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for MetadataNullType failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        throw new IOException(String.format("The JSON string is invalid for CreatePartRequestDataAttributesMetadataValue with anyOf schemas: MetadataDateType, MetadataFloatType, MetadataLongType, MetadataNullType, MetadataStringType. no class match the result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
    }

    /**
     * Create an instance of CreatePartRequestDataAttributesMetadataValue given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CreatePartRequestDataAttributesMetadataValue
     * @throws IOException if the JSON string is invalid with respect to CreatePartRequestDataAttributesMetadataValue
     */
    public static CreatePartRequestDataAttributesMetadataValue fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CreatePartRequestDataAttributesMetadataValue.class);
    }

    /**
     * Convert an instance of CreatePartRequestDataAttributesMetadataValue to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

