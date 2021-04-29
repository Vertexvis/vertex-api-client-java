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


package com.vertexvis.api;

import com.vertexvis.ApiException;
import com.vertexvis.model.CreateSceneItemOverrideRequest;
import com.vertexvis.model.Failure;
import com.vertexvis.model.SceneItemOverride;
import com.vertexvis.model.SceneItemOverrideList;
import java.util.UUID;
import com.vertexvis.model.UpdateSceneItemOverrideRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SceneItemOverridesApi
 */
@Ignore
public class SceneItemOverridesApiTest {

    private final SceneItemOverridesApi api = new SceneItemOverridesApi();

    
    /**
     * 
     *
     * Create a &#x60;scene-item-override&#x60; for a &#x60;scene-view&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSceneItemOverrideTest() throws ApiException {
        UUID id = null;
        CreateSceneItemOverrideRequest createSceneItemOverrideRequest = null;
        SceneItemOverride response = api.createSceneItemOverride(id, createSceneItemOverrideRequest);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Delete a &#x60;scene-item-override&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSceneItemOverrideTest() throws ApiException {
        UUID id = null;
        api.deleteSceneItemOverride(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get &#x60;scene-item-overrides&#x60; for a &#x60;scene-view&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSceneItemOverridesTest() throws ApiException {
        UUID id = null;
        SceneItemOverrideList response = api.getSceneItemOverrides(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Update a &#x60;scene-item-override&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateSceneItemOverrideTest() throws ApiException {
        UUID id = null;
        UpdateSceneItemOverrideRequest updateSceneItemOverrideRequest = null;
        SceneItemOverride response = api.updateSceneItemOverride(id, updateSceneItemOverrideRequest);

        // TODO: test validations
    }
    
}
