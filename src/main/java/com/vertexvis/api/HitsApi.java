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


package com.vertexvis.api;

import com.vertexvis.ApiCallback;
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.ApiResponse;
import com.vertexvis.Configuration;
import com.vertexvis.Pair;
import com.vertexvis.ProgressRequestBody;
import com.vertexvis.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.vertexvis.model.CreateHitRequest;
import com.vertexvis.model.Failure;
import com.vertexvis.model.Hit;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HitsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public HitsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public HitsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for createSceneHit
     * @param id The &#x60;scene&#x60; ID. (required)
     * @param createHitRequest  (required)
     * @param include Comma-separated list of relationships to include in response. (optional)
     * @param fieldsPartRevision Comma-separated list of fields to return in response. An empty value returns no fields. Due to its potential size, metadata is only returned if explicitly requested. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  * location -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createSceneHitCall(UUID id, CreateHitRequest createHitRequest, String include, String fieldsPartRevision, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = createHitRequest;

        // create path and map variables
        String localVarPath = "/scenes/{id}/hits"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (include != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("include", include));
        }

        if (fieldsPartRevision != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fields[part-revision]", fieldsPartRevision));
        }

        final String[] localVarAccepts = {
            "application/vnd.api+json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/vnd.api+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createSceneHitValidateBeforeCall(UUID id, CreateHitRequest createHitRequest, String include, String fieldsPartRevision, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling createSceneHit(Async)");
        }

        // verify the required parameter 'createHitRequest' is set
        if (createHitRequest == null) {
            throw new ApiException("Missing the required parameter 'createHitRequest' when calling createSceneHit(Async)");
        }

        return createSceneHitCall(id, createHitRequest, include, fieldsPartRevision, _callback);

    }

    /**
     * 
     * Create a &#x60;hit&#x60; for a &#x60;scene&#x60;.
     * @param id The &#x60;scene&#x60; ID. (required)
     * @param createHitRequest  (required)
     * @param include Comma-separated list of relationships to include in response. (optional)
     * @param fieldsPartRevision Comma-separated list of fields to return in response. An empty value returns no fields. Due to its potential size, metadata is only returned if explicitly requested. (optional)
     * @return Hit
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  * location -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
     </table>
     */
    public Hit createSceneHit(UUID id, CreateHitRequest createHitRequest, String include, String fieldsPartRevision) throws ApiException {
        ApiResponse<Hit> localVarResp = createSceneHitWithHttpInfo(id, createHitRequest, include, fieldsPartRevision);
        return localVarResp.getData();
    }

    /**
     * 
     * Create a &#x60;hit&#x60; for a &#x60;scene&#x60;.
     * @param id The &#x60;scene&#x60; ID. (required)
     * @param createHitRequest  (required)
     * @param include Comma-separated list of relationships to include in response. (optional)
     * @param fieldsPartRevision Comma-separated list of fields to return in response. An empty value returns no fields. Due to its potential size, metadata is only returned if explicitly requested. (optional)
     * @return ApiResponse&lt;Hit&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  * location -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Hit> createSceneHitWithHttpInfo(UUID id, CreateHitRequest createHitRequest, String include, String fieldsPartRevision) throws ApiException {
        okhttp3.Call localVarCall = createSceneHitValidateBeforeCall(id, createHitRequest, include, fieldsPartRevision, null);
        Type localVarReturnType = new TypeToken<Hit>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Create a &#x60;hit&#x60; for a &#x60;scene&#x60;.
     * @param id The &#x60;scene&#x60; ID. (required)
     * @param createHitRequest  (required)
     * @param include Comma-separated list of relationships to include in response. (optional)
     * @param fieldsPartRevision Comma-separated list of fields to return in response. An empty value returns no fields. Due to its potential size, metadata is only returned if explicitly requested. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  * location -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createSceneHitAsync(UUID id, CreateHitRequest createHitRequest, String include, String fieldsPartRevision, final ApiCallback<Hit> _callback) throws ApiException {

        okhttp3.Call localVarCall = createSceneHitValidateBeforeCall(id, createHitRequest, include, fieldsPartRevision, _callback);
        Type localVarReturnType = new TypeToken<Hit>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for createSceneViewHit
     * @param id The &#x60;scene-view&#x60; ID. (required)
     * @param createHitRequest  (required)
     * @param include Comma-separated list of relationships to include in response. (optional)
     * @param fieldsPartRevision Comma-separated list of fields to return in response. An empty value returns no fields. Due to its potential size, metadata is only returned if explicitly requested. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  * location -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createSceneViewHitCall(UUID id, CreateHitRequest createHitRequest, String include, String fieldsPartRevision, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = createHitRequest;

        // create path and map variables
        String localVarPath = "/scene-views/{id}/hits"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (include != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("include", include));
        }

        if (fieldsPartRevision != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fields[part-revision]", fieldsPartRevision));
        }

        final String[] localVarAccepts = {
            "application/vnd.api+json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/vnd.api+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createSceneViewHitValidateBeforeCall(UUID id, CreateHitRequest createHitRequest, String include, String fieldsPartRevision, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling createSceneViewHit(Async)");
        }

        // verify the required parameter 'createHitRequest' is set
        if (createHitRequest == null) {
            throw new ApiException("Missing the required parameter 'createHitRequest' when calling createSceneViewHit(Async)");
        }

        return createSceneViewHitCall(id, createHitRequest, include, fieldsPartRevision, _callback);

    }

    /**
     * 
     * Create a &#x60;hit&#x60; for a &#x60;scene-view&#x60;.
     * @param id The &#x60;scene-view&#x60; ID. (required)
     * @param createHitRequest  (required)
     * @param include Comma-separated list of relationships to include in response. (optional)
     * @param fieldsPartRevision Comma-separated list of fields to return in response. An empty value returns no fields. Due to its potential size, metadata is only returned if explicitly requested. (optional)
     * @return Hit
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  * location -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
     </table>
     */
    public Hit createSceneViewHit(UUID id, CreateHitRequest createHitRequest, String include, String fieldsPartRevision) throws ApiException {
        ApiResponse<Hit> localVarResp = createSceneViewHitWithHttpInfo(id, createHitRequest, include, fieldsPartRevision);
        return localVarResp.getData();
    }

    /**
     * 
     * Create a &#x60;hit&#x60; for a &#x60;scene-view&#x60;.
     * @param id The &#x60;scene-view&#x60; ID. (required)
     * @param createHitRequest  (required)
     * @param include Comma-separated list of relationships to include in response. (optional)
     * @param fieldsPartRevision Comma-separated list of fields to return in response. An empty value returns no fields. Due to its potential size, metadata is only returned if explicitly requested. (optional)
     * @return ApiResponse&lt;Hit&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  * location -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Hit> createSceneViewHitWithHttpInfo(UUID id, CreateHitRequest createHitRequest, String include, String fieldsPartRevision) throws ApiException {
        okhttp3.Call localVarCall = createSceneViewHitValidateBeforeCall(id, createHitRequest, include, fieldsPartRevision, null);
        Type localVarReturnType = new TypeToken<Hit>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Create a &#x60;hit&#x60; for a &#x60;scene-view&#x60;.
     * @param id The &#x60;scene-view&#x60; ID. (required)
     * @param createHitRequest  (required)
     * @param include Comma-separated list of relationships to include in response. (optional)
     * @param fieldsPartRevision Comma-separated list of fields to return in response. An empty value returns no fields. Due to its potential size, metadata is only returned if explicitly requested. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  * location -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createSceneViewHitAsync(UUID id, CreateHitRequest createHitRequest, String include, String fieldsPartRevision, final ApiCallback<Hit> _callback) throws ApiException {

        okhttp3.Call localVarCall = createSceneViewHitValidateBeforeCall(id, createHitRequest, include, fieldsPartRevision, _callback);
        Type localVarReturnType = new TypeToken<Hit>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
