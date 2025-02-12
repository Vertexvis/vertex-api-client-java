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
import com.vertexvis.model.CameraFit;
import com.vertexvis.model.OrthographicCamera;
import com.vertexvis.model.PerspectiveCamera;
import com.vertexvis.model.Vector3;
import java.io.IOException;
import java.math.BigDecimal;
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
public class UpdateSceneViewRequestDataAttributesCamera extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(UpdateSceneViewRequestDataAttributesCamera.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!UpdateSceneViewRequestDataAttributesCamera.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'UpdateSceneViewRequestDataAttributesCamera' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<PerspectiveCamera> adapterPerspectiveCamera = gson.getDelegateAdapter(this, TypeToken.get(PerspectiveCamera.class));
            final TypeAdapter<OrthographicCamera> adapterOrthographicCamera = gson.getDelegateAdapter(this, TypeToken.get(OrthographicCamera.class));
            final TypeAdapter<CameraFit> adapterCameraFit = gson.getDelegateAdapter(this, TypeToken.get(CameraFit.class));

            return (TypeAdapter<T>) new TypeAdapter<UpdateSceneViewRequestDataAttributesCamera>() {
                @Override
                public void write(JsonWriter out, UpdateSceneViewRequestDataAttributesCamera value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `PerspectiveCamera`
                    if (value.getActualInstance() instanceof PerspectiveCamera) {
                        JsonElement element = adapterPerspectiveCamera.toJsonTree((PerspectiveCamera)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `OrthographicCamera`
                    if (value.getActualInstance() instanceof OrthographicCamera) {
                        JsonElement element = adapterOrthographicCamera.toJsonTree((OrthographicCamera)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `CameraFit`
                    if (value.getActualInstance() instanceof CameraFit) {
                        JsonElement element = adapterCameraFit.toJsonTree((CameraFit)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: CameraFit, OrthographicCamera, PerspectiveCamera");
                }

                @Override
                public UpdateSceneViewRequestDataAttributesCamera read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize PerspectiveCamera
                    try {
                        // validate the JSON object to see if any exception is thrown
                        PerspectiveCamera.validateJsonElement(jsonElement);
                        actualAdapter = adapterPerspectiveCamera;
                        UpdateSceneViewRequestDataAttributesCamera ret = new UpdateSceneViewRequestDataAttributesCamera();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for PerspectiveCamera failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'PerspectiveCamera'", e);
                    }
                    // deserialize OrthographicCamera
                    try {
                        // validate the JSON object to see if any exception is thrown
                        OrthographicCamera.validateJsonElement(jsonElement);
                        actualAdapter = adapterOrthographicCamera;
                        UpdateSceneViewRequestDataAttributesCamera ret = new UpdateSceneViewRequestDataAttributesCamera();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for OrthographicCamera failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'OrthographicCamera'", e);
                    }
                    // deserialize CameraFit
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CameraFit.validateJsonElement(jsonElement);
                        actualAdapter = adapterCameraFit;
                        UpdateSceneViewRequestDataAttributesCamera ret = new UpdateSceneViewRequestDataAttributesCamera();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CameraFit failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CameraFit'", e);
                    }

                    throw new IOException(String.format("Failed deserialization for UpdateSceneViewRequestDataAttributesCamera: no class matches result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public UpdateSceneViewRequestDataAttributesCamera() {
        super("anyOf", Boolean.FALSE);
    }

    public UpdateSceneViewRequestDataAttributesCamera(Object o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("PerspectiveCamera", PerspectiveCamera.class);
        schemas.put("OrthographicCamera", OrthographicCamera.class);
        schemas.put("CameraFit", CameraFit.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return UpdateSceneViewRequestDataAttributesCamera.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * CameraFit, OrthographicCamera, PerspectiveCamera
     *
     * It could be an instance of the 'anyOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof PerspectiveCamera) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof OrthographicCamera) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CameraFit) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be CameraFit, OrthographicCamera, PerspectiveCamera");
    }

    /**
     * Get the actual instance, which can be the following:
     * CameraFit, OrthographicCamera, PerspectiveCamera
     *
     * @return The actual instance (CameraFit, OrthographicCamera, PerspectiveCamera)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `PerspectiveCamera`. If the actual instance is not `PerspectiveCamera`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PerspectiveCamera`
     * @throws ClassCastException if the instance is not `PerspectiveCamera`
     */
    public PerspectiveCamera getPerspectiveCamera() throws ClassCastException {
        return (PerspectiveCamera)super.getActualInstance();
    }

    /**
     * Get the actual instance of `OrthographicCamera`. If the actual instance is not `OrthographicCamera`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `OrthographicCamera`
     * @throws ClassCastException if the instance is not `OrthographicCamera`
     */
    public OrthographicCamera getOrthographicCamera() throws ClassCastException {
        return (OrthographicCamera)super.getActualInstance();
    }

    /**
     * Get the actual instance of `CameraFit`. If the actual instance is not `CameraFit`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CameraFit`
     * @throws ClassCastException if the instance is not `CameraFit`
     */
    public CameraFit getCameraFit() throws ClassCastException {
        return (CameraFit)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to UpdateSceneViewRequestDataAttributesCamera
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate anyOf schemas one by one
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with PerspectiveCamera
        try {
            PerspectiveCamera.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for PerspectiveCamera failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with OrthographicCamera
        try {
            OrthographicCamera.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for OrthographicCamera failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with CameraFit
        try {
            CameraFit.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for CameraFit failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        throw new IOException(String.format("The JSON string is invalid for UpdateSceneViewRequestDataAttributesCamera with anyOf schemas: CameraFit, OrthographicCamera, PerspectiveCamera. no class match the result, expected at least 1. Detailed failure message for anyOf schemas: %s. JSON: %s", errorMessages, jsonElement.toString()));
    }

    /**
     * Create an instance of UpdateSceneViewRequestDataAttributesCamera given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of UpdateSceneViewRequestDataAttributesCamera
     * @throws IOException if the JSON string is invalid with respect to UpdateSceneViewRequestDataAttributesCamera
     */
    public static UpdateSceneViewRequestDataAttributesCamera fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, UpdateSceneViewRequestDataAttributesCamera.class);
    }

    /**
     * Convert an instance of UpdateSceneViewRequestDataAttributesCamera to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

