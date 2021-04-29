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
import com.vertexvis.model.CreateHitRequest;
import com.vertexvis.model.Failure;
import com.vertexvis.model.Hit;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for HitsApi
 */
@Ignore
public class HitsApiTest {

    private final HitsApi api = new HitsApi();

    
    /**
     * 
     *
     * Create a &#x60;hit&#x60; for a &#x60;scene&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSceneHitTest() throws ApiException {
        UUID id = null;
        CreateHitRequest createHitRequest = null;
        String include = null;
        String fieldsPartRevision = null;
        Hit response = api.createSceneHit(id, createHitRequest, include, fieldsPartRevision);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Create a &#x60;hit&#x60; for a &#x60;scene-view&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSceneViewHitTest() throws ApiException {
        UUID id = null;
        CreateHitRequest createHitRequest = null;
        String include = null;
        String fieldsPartRevision = null;
        Hit response = api.createSceneViewHit(id, createHitRequest, include, fieldsPartRevision);

        // TODO: test validations
    }
    
}
