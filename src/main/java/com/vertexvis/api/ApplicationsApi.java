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


import com.vertexvis.model.Application;
import com.vertexvis.model.ApplicationList;
import com.vertexvis.model.CreateApplicationRequest;
import com.vertexvis.model.CreatedApplication;
import com.vertexvis.model.Failure;
import java.util.UUID;
import com.vertexvis.model.UpdateApplicationRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApplicationsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ApplicationsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ApplicationsApi(ApiClient apiClient) {
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
     * Build call for createApplication
     * @param createApplicationRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  * location -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createApplicationCall(CreateApplicationRequest createApplicationRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = createApplicationRequest;

        // create path and map variables
        String localVarPath = "/applications";

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
    private okhttp3.Call createApplicationValidateBeforeCall(CreateApplicationRequest createApplicationRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'createApplicationRequest' is set
        if (createApplicationRequest == null) {
            throw new ApiException("Missing the required parameter 'createApplicationRequest' when calling createApplication(Async)");
        }
        

        okhttp3.Call localVarCall = createApplicationCall(createApplicationRequest, _callback);
        return localVarCall;

    }

    /**
     * 
     * Create an OAuth2 &#x60;application&#x60;.
     * @param createApplicationRequest  (required)
     * @return CreatedApplication
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  * location -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
     </table>
     */
    public CreatedApplication createApplication(CreateApplicationRequest createApplicationRequest) throws ApiException {
        ApiResponse<CreatedApplication> localVarResp = createApplicationWithHttpInfo(createApplicationRequest);
        return localVarResp.getData();
    }

    /**
     * 
     * Create an OAuth2 &#x60;application&#x60;.
     * @param createApplicationRequest  (required)
     * @return ApiResponse&lt;CreatedApplication&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  * location -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CreatedApplication> createApplicationWithHttpInfo(CreateApplicationRequest createApplicationRequest) throws ApiException {
        okhttp3.Call localVarCall = createApplicationValidateBeforeCall(createApplicationRequest, null);
        Type localVarReturnType = new TypeToken<CreatedApplication>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Create an OAuth2 &#x60;application&#x60;.
     * @param createApplicationRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  * location -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createApplicationAsync(CreateApplicationRequest createApplicationRequest, final ApiCallback<CreatedApplication> _callback) throws ApiException {

        okhttp3.Call localVarCall = createApplicationValidateBeforeCall(createApplicationRequest, _callback);
        Type localVarReturnType = new TypeToken<CreatedApplication>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteApplication
     * @param id The &#x60;application&#x60; ID. (required)
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
    public okhttp3.Call deleteApplicationCall(UUID id, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/applications/{id}"
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
    private okhttp3.Call deleteApplicationValidateBeforeCall(UUID id, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteApplication(Async)");
        }
        

        okhttp3.Call localVarCall = deleteApplicationCall(id, _callback);
        return localVarCall;

    }

    /**
     * 
     * Delete an &#x60;application&#x60;.
     * @param id The &#x60;application&#x60; ID. (required)
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
    public void deleteApplication(UUID id) throws ApiException {
        deleteApplicationWithHttpInfo(id);
    }

    /**
     * 
     * Delete an &#x60;application&#x60;.
     * @param id The &#x60;application&#x60; ID. (required)
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
    public ApiResponse<Void> deleteApplicationWithHttpInfo(UUID id) throws ApiException {
        okhttp3.Call localVarCall = deleteApplicationValidateBeforeCall(id, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     * Delete an &#x60;application&#x60;.
     * @param id The &#x60;application&#x60; ID. (required)
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
    public okhttp3.Call deleteApplicationAsync(UUID id, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteApplicationValidateBeforeCall(id, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getApplication
     * @param id The &#x60;application&#x60; ID. (required)
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
    public okhttp3.Call getApplicationCall(UUID id, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/applications/{id}"
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
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getApplicationValidateBeforeCall(UUID id, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getApplication(Async)");
        }
        

        okhttp3.Call localVarCall = getApplicationCall(id, _callback);
        return localVarCall;

    }

    /**
     * 
     * Get an &#x60;application&#x60;.
     * @param id The &#x60;application&#x60; ID. (required)
     * @return Application
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
    public Application getApplication(UUID id) throws ApiException {
        ApiResponse<Application> localVarResp = getApplicationWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * 
     * Get an &#x60;application&#x60;.
     * @param id The &#x60;application&#x60; ID. (required)
     * @return ApiResponse&lt;Application&gt;
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
    public ApiResponse<Application> getApplicationWithHttpInfo(UUID id) throws ApiException {
        okhttp3.Call localVarCall = getApplicationValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<Application>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get an &#x60;application&#x60;.
     * @param id The &#x60;application&#x60; ID. (required)
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
    public okhttp3.Call getApplicationAsync(UUID id, final ApiCallback<Application> _callback) throws ApiException {

        okhttp3.Call localVarCall = getApplicationValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<Application>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getApplications
     * @param pageCursor The cursor for the next page of items. (optional)
     * @param pageSize The number of items to return. (optional)
     * @param filterClientId Comma-separated list of client IDs to filter on. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getApplicationsCall(String pageCursor, Integer pageSize, String filterClientId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/applications";

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

        if (filterClientId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter[clientId]", filterClientId));
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
    private okhttp3.Call getApplicationsValidateBeforeCall(String pageCursor, Integer pageSize, String filterClientId, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getApplicationsCall(pageCursor, pageSize, filterClientId, _callback);
        return localVarCall;

    }

    /**
     * 
     * Get &#x60;applications&#x60;.
     * @param pageCursor The cursor for the next page of items. (optional)
     * @param pageSize The number of items to return. (optional)
     * @param filterClientId Comma-separated list of client IDs to filter on. (optional)
     * @return ApplicationList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
     </table>
     */
    public ApplicationList getApplications(String pageCursor, Integer pageSize, String filterClientId) throws ApiException {
        ApiResponse<ApplicationList> localVarResp = getApplicationsWithHttpInfo(pageCursor, pageSize, filterClientId);
        return localVarResp.getData();
    }

    /**
     * 
     * Get &#x60;applications&#x60;.
     * @param pageCursor The cursor for the next page of items. (optional)
     * @param pageSize The number of items to return. (optional)
     * @param filterClientId Comma-separated list of client IDs to filter on. (optional)
     * @return ApiResponse&lt;ApplicationList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ApplicationList> getApplicationsWithHttpInfo(String pageCursor, Integer pageSize, String filterClientId) throws ApiException {
        okhttp3.Call localVarCall = getApplicationsValidateBeforeCall(pageCursor, pageSize, filterClientId, null);
        Type localVarReturnType = new TypeToken<ApplicationList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get &#x60;applications&#x60;.
     * @param pageCursor The cursor for the next page of items. (optional)
     * @param pageSize The number of items to return. (optional)
     * @param filterClientId Comma-separated list of client IDs to filter on. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getApplicationsAsync(String pageCursor, Integer pageSize, String filterClientId, final ApiCallback<ApplicationList> _callback) throws ApiException {

        okhttp3.Call localVarCall = getApplicationsValidateBeforeCall(pageCursor, pageSize, filterClientId, _callback);
        Type localVarReturnType = new TypeToken<ApplicationList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateApplication
     * @param id The &#x60;application&#x60; ID. (required)
     * @param updateApplicationRequest  (required)
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
    public okhttp3.Call updateApplicationCall(UUID id, UpdateApplicationRequest updateApplicationRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = updateApplicationRequest;

        // create path and map variables
        String localVarPath = "/applications/{id}"
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
    private okhttp3.Call updateApplicationValidateBeforeCall(UUID id, UpdateApplicationRequest updateApplicationRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updateApplication(Async)");
        }
        
        // verify the required parameter 'updateApplicationRequest' is set
        if (updateApplicationRequest == null) {
            throw new ApiException("Missing the required parameter 'updateApplicationRequest' when calling updateApplication(Async)");
        }
        

        okhttp3.Call localVarCall = updateApplicationCall(id, updateApplicationRequest, _callback);
        return localVarCall;

    }

    /**
     * 
     * Update an &#x60;application&#x60;.
     * @param id The &#x60;application&#x60; ID. (required)
     * @param updateApplicationRequest  (required)
     * @return Application
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
    public Application updateApplication(UUID id, UpdateApplicationRequest updateApplicationRequest) throws ApiException {
        ApiResponse<Application> localVarResp = updateApplicationWithHttpInfo(id, updateApplicationRequest);
        return localVarResp.getData();
    }

    /**
     * 
     * Update an &#x60;application&#x60;.
     * @param id The &#x60;application&#x60; ID. (required)
     * @param updateApplicationRequest  (required)
     * @return ApiResponse&lt;Application&gt;
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
    public ApiResponse<Application> updateApplicationWithHttpInfo(UUID id, UpdateApplicationRequest updateApplicationRequest) throws ApiException {
        okhttp3.Call localVarCall = updateApplicationValidateBeforeCall(id, updateApplicationRequest, null);
        Type localVarReturnType = new TypeToken<Application>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Update an &#x60;application&#x60;.
     * @param id The &#x60;application&#x60; ID. (required)
     * @param updateApplicationRequest  (required)
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
    public okhttp3.Call updateApplicationAsync(UUID id, UpdateApplicationRequest updateApplicationRequest, final ApiCallback<Application> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateApplicationValidateBeforeCall(id, updateApplicationRequest, _callback);
        Type localVarReturnType = new TypeToken<Application>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
