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


import com.vertexvis.model.CreateSceneItemOverrideRequest;
import com.vertexvis.model.Failure;
import com.vertexvis.model.SceneItemOverride;
import com.vertexvis.model.SceneItemOverrideList;
import java.util.UUID;
import com.vertexvis.model.UpdateSceneItemOverrideRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SceneItemOverridesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public SceneItemOverridesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SceneItemOverridesApi(ApiClient apiClient) {
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
     * Build call for createSceneItemOverride
     * @param id The &#x60;scene-view&#x60; ID. (required)
     * @param createSceneItemOverrideRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  * location -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createSceneItemOverrideCall(UUID id, CreateSceneItemOverrideRequest createSceneItemOverrideRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = createSceneItemOverrideRequest;

        // create path and map variables
        String localVarPath = "/scene-views/{id}/scene-item-overrides"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
    private okhttp3.Call createSceneItemOverrideValidateBeforeCall(UUID id, CreateSceneItemOverrideRequest createSceneItemOverrideRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling createSceneItemOverride(Async)");
        }
        
        // verify the required parameter 'createSceneItemOverrideRequest' is set
        if (createSceneItemOverrideRequest == null) {
            throw new ApiException("Missing the required parameter 'createSceneItemOverrideRequest' when calling createSceneItemOverride(Async)");
        }
        

        okhttp3.Call localVarCall = createSceneItemOverrideCall(id, createSceneItemOverrideRequest, _callback);
        return localVarCall;

    }

    /**
     * 
     * Create a &#x60;scene-item-override&#x60; for a &#x60;scene-view&#x60;.
     * @param id The &#x60;scene-view&#x60; ID. (required)
     * @param createSceneItemOverrideRequest  (required)
     * @return SceneItemOverride
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  * location -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
     </table>
     */
    public SceneItemOverride createSceneItemOverride(UUID id, CreateSceneItemOverrideRequest createSceneItemOverrideRequest) throws ApiException {
        ApiResponse<SceneItemOverride> localVarResp = createSceneItemOverrideWithHttpInfo(id, createSceneItemOverrideRequest);
        return localVarResp.getData();
    }

    /**
     * 
     * Create a &#x60;scene-item-override&#x60; for a &#x60;scene-view&#x60;.
     * @param id The &#x60;scene-view&#x60; ID. (required)
     * @param createSceneItemOverrideRequest  (required)
     * @return ApiResponse&lt;SceneItemOverride&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  * location -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SceneItemOverride> createSceneItemOverrideWithHttpInfo(UUID id, CreateSceneItemOverrideRequest createSceneItemOverrideRequest) throws ApiException {
        okhttp3.Call localVarCall = createSceneItemOverrideValidateBeforeCall(id, createSceneItemOverrideRequest, null);
        Type localVarReturnType = new TypeToken<SceneItemOverride>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Create a &#x60;scene-item-override&#x60; for a &#x60;scene-view&#x60;.
     * @param id The &#x60;scene-view&#x60; ID. (required)
     * @param createSceneItemOverrideRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  * location -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createSceneItemOverrideAsync(UUID id, CreateSceneItemOverrideRequest createSceneItemOverrideRequest, final ApiCallback<SceneItemOverride> _callback) throws ApiException {

        okhttp3.Call localVarCall = createSceneItemOverrideValidateBeforeCall(id, createSceneItemOverrideRequest, _callback);
        Type localVarReturnType = new TypeToken<SceneItemOverride>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteSceneItemOverride
     * @param id The &#x60;scene-item-override&#x60; ID. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteSceneItemOverrideCall(UUID id, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/scene-item-overrides/{id}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/vnd.api+json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteSceneItemOverrideValidateBeforeCall(UUID id, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteSceneItemOverride(Async)");
        }
        

        okhttp3.Call localVarCall = deleteSceneItemOverrideCall(id, _callback);
        return localVarCall;

    }

    /**
     * 
     * Delete a &#x60;scene-item-override&#x60;.
     * @param id The &#x60;scene-item-override&#x60; ID. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
     </table>
     */
    public void deleteSceneItemOverride(UUID id) throws ApiException {
        deleteSceneItemOverrideWithHttpInfo(id);
    }

    /**
     * 
     * Delete a &#x60;scene-item-override&#x60;.
     * @param id The &#x60;scene-item-override&#x60; ID. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteSceneItemOverrideWithHttpInfo(UUID id) throws ApiException {
        okhttp3.Call localVarCall = deleteSceneItemOverrideValidateBeforeCall(id, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     * Delete a &#x60;scene-item-override&#x60;.
     * @param id The &#x60;scene-item-override&#x60; ID. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteSceneItemOverrideAsync(UUID id, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteSceneItemOverrideValidateBeforeCall(id, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getSceneItemOverrides
     * @param id The &#x60;scene-view&#x60; ID. (required)
     * @param pageCursor The cursor for the next page of items. (optional)
     * @param pageSize The number of items to return. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSceneItemOverridesCall(UUID id, String pageCursor, Integer pageSize, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/scene-views/{id}/scene-item-overrides"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (pageCursor != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page[cursor]", pageCursor));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page[size]", pageSize));
        }

        final String[] localVarAccepts = {
            "application/vnd.api+json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getSceneItemOverridesValidateBeforeCall(UUID id, String pageCursor, Integer pageSize, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getSceneItemOverrides(Async)");
        }
        

        okhttp3.Call localVarCall = getSceneItemOverridesCall(id, pageCursor, pageSize, _callback);
        return localVarCall;

    }

    /**
     * 
     * Get &#x60;scene-item-overrides&#x60; for a &#x60;scene-view&#x60;.
     * @param id The &#x60;scene-view&#x60; ID. (required)
     * @param pageCursor The cursor for the next page of items. (optional)
     * @param pageSize The number of items to return. (optional)
     * @return SceneItemOverrideList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
     </table>
     */
    public SceneItemOverrideList getSceneItemOverrides(UUID id, String pageCursor, Integer pageSize) throws ApiException {
        ApiResponse<SceneItemOverrideList> localVarResp = getSceneItemOverridesWithHttpInfo(id, pageCursor, pageSize);
        return localVarResp.getData();
    }

    /**
     * 
     * Get &#x60;scene-item-overrides&#x60; for a &#x60;scene-view&#x60;.
     * @param id The &#x60;scene-view&#x60; ID. (required)
     * @param pageCursor The cursor for the next page of items. (optional)
     * @param pageSize The number of items to return. (optional)
     * @return ApiResponse&lt;SceneItemOverrideList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SceneItemOverrideList> getSceneItemOverridesWithHttpInfo(UUID id, String pageCursor, Integer pageSize) throws ApiException {
        okhttp3.Call localVarCall = getSceneItemOverridesValidateBeforeCall(id, pageCursor, pageSize, null);
        Type localVarReturnType = new TypeToken<SceneItemOverrideList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get &#x60;scene-item-overrides&#x60; for a &#x60;scene-view&#x60;.
     * @param id The &#x60;scene-view&#x60; ID. (required)
     * @param pageCursor The cursor for the next page of items. (optional)
     * @param pageSize The number of items to return. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSceneItemOverridesAsync(UUID id, String pageCursor, Integer pageSize, final ApiCallback<SceneItemOverrideList> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSceneItemOverridesValidateBeforeCall(id, pageCursor, pageSize, _callback);
        Type localVarReturnType = new TypeToken<SceneItemOverrideList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateSceneItemOverride
     * @param id The &#x60;scene-item-override&#x60; ID. (required)
     * @param updateSceneItemOverrideRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateSceneItemOverrideCall(UUID id, UpdateSceneItemOverrideRequest updateSceneItemOverrideRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = updateSceneItemOverrideRequest;

        // create path and map variables
        String localVarPath = "/scene-item-overrides/{id}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
        return localVarApiClient.buildCall(basePath, localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateSceneItemOverrideValidateBeforeCall(UUID id, UpdateSceneItemOverrideRequest updateSceneItemOverrideRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updateSceneItemOverride(Async)");
        }
        
        // verify the required parameter 'updateSceneItemOverrideRequest' is set
        if (updateSceneItemOverrideRequest == null) {
            throw new ApiException("Missing the required parameter 'updateSceneItemOverrideRequest' when calling updateSceneItemOverride(Async)");
        }
        

        okhttp3.Call localVarCall = updateSceneItemOverrideCall(id, updateSceneItemOverrideRequest, _callback);
        return localVarCall;

    }

    /**
     * 
     * Update a &#x60;scene-item-override&#x60;.
     * @param id The &#x60;scene-item-override&#x60; ID. (required)
     * @param updateSceneItemOverrideRequest  (required)
     * @return SceneItemOverride
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
     </table>
     */
    public SceneItemOverride updateSceneItemOverride(UUID id, UpdateSceneItemOverrideRequest updateSceneItemOverrideRequest) throws ApiException {
        ApiResponse<SceneItemOverride> localVarResp = updateSceneItemOverrideWithHttpInfo(id, updateSceneItemOverrideRequest);
        return localVarResp.getData();
    }

    /**
     * 
     * Update a &#x60;scene-item-override&#x60;.
     * @param id The &#x60;scene-item-override&#x60; ID. (required)
     * @param updateSceneItemOverrideRequest  (required)
     * @return ApiResponse&lt;SceneItemOverride&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SceneItemOverride> updateSceneItemOverrideWithHttpInfo(UUID id, UpdateSceneItemOverrideRequest updateSceneItemOverrideRequest) throws ApiException {
        okhttp3.Call localVarCall = updateSceneItemOverrideValidateBeforeCall(id, updateSceneItemOverrideRequest, null);
        Type localVarReturnType = new TypeToken<SceneItemOverride>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Update a &#x60;scene-item-override&#x60;.
     * @param id The &#x60;scene-item-override&#x60; ID. (required)
     * @param updateSceneItemOverrideRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateSceneItemOverrideAsync(UUID id, UpdateSceneItemOverrideRequest updateSceneItemOverrideRequest, final ApiCallback<SceneItemOverride> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateSceneItemOverrideValidateBeforeCall(id, updateSceneItemOverrideRequest, _callback);
        Type localVarReturnType = new TypeToken<SceneItemOverride>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
