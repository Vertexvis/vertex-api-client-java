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


import com.vertexvis.model.CreatePartRequest;
import com.vertexvis.model.Failure;
import com.vertexvis.model.Part;
import com.vertexvis.model.PartList;
import com.vertexvis.model.QueuedJob;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class PartsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public PartsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PartsApi(ApiClient apiClient) {
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
     * Build call for createPart
     * @param createPartRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created Part </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted </td><td>  * content-location -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createPartCall(CreatePartRequest createPartRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = createPartRequest;

        // create path and map variables
        String localVarPath = "/parts";

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
    private okhttp3.Call createPartValidateBeforeCall(CreatePartRequest createPartRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'createPartRequest' is set
        if (createPartRequest == null) {
            throw new ApiException("Missing the required parameter 'createPartRequest' when calling createPart(Async)");
        }

        return createPartCall(createPartRequest, _callback);

    }

    /**
     * 
     * Create a &#x60;part&#x60;.  This endpoint includes multiple successful response codes: [&#x60;201&#x60;, &#x60;202&#x60;].  When not given a relationship, this endpoint will create a part with an empty part revision and return a &#x60;201&#x60;  status code of the part.  When given a relationship to translate, this endpoint will return a &#x60;202&#x60; status code with the location of a &#x60;queued-translation&#x60;. The status of the translation can be queried via &#x60;getQueuedTranslation&#x60;. After the translation is complete, a &#x60;part&#x60; and &#x60;part-revision&#x60; that references the translated geometry.  A unique suppliedId/suppliedRevisionId combination will create a new part and new part revision. For instance, sending my-part-id/my-revision-id will create a new part and new revision with those corresponding supplied ids. To create a new revision for &#x60;my-part-id&#x60;, likewise you can invoke this endpoint with a new revision id: &#x60;my-part-id/my-new-revision-id&#x60; and a new revision will be created for the existing part.  See our [Import Data](https://developer.vertexvis.com/docs/guides/import-data-with-api) guides for more information. 
     * @param createPartRequest  (required)
     * @return Part
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created Part </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted </td><td>  * content-location -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
     </table>
     */
    public Part createPart(CreatePartRequest createPartRequest) throws ApiException {
        ApiResponse<Part> localVarResp = createPartWithHttpInfo(createPartRequest);
        return localVarResp.getData();
    }

    /**
     * 
     * Create a &#x60;part&#x60;.  This endpoint includes multiple successful response codes: [&#x60;201&#x60;, &#x60;202&#x60;].  When not given a relationship, this endpoint will create a part with an empty part revision and return a &#x60;201&#x60;  status code of the part.  When given a relationship to translate, this endpoint will return a &#x60;202&#x60; status code with the location of a &#x60;queued-translation&#x60;. The status of the translation can be queried via &#x60;getQueuedTranslation&#x60;. After the translation is complete, a &#x60;part&#x60; and &#x60;part-revision&#x60; that references the translated geometry.  A unique suppliedId/suppliedRevisionId combination will create a new part and new part revision. For instance, sending my-part-id/my-revision-id will create a new part and new revision with those corresponding supplied ids. To create a new revision for &#x60;my-part-id&#x60;, likewise you can invoke this endpoint with a new revision id: &#x60;my-part-id/my-new-revision-id&#x60; and a new revision will be created for the existing part.  See our [Import Data](https://developer.vertexvis.com/docs/guides/import-data-with-api) guides for more information. 
     * @param createPartRequest  (required)
     * @return ApiResponse&lt;Part&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created Part </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted </td><td>  * content-location -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Part> createPartWithHttpInfo(CreatePartRequest createPartRequest) throws ApiException {
        okhttp3.Call localVarCall = createPartValidateBeforeCall(createPartRequest, null);
        Type localVarReturnType = new TypeToken<Part>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Create a &#x60;part&#x60;.  This endpoint includes multiple successful response codes: [&#x60;201&#x60;, &#x60;202&#x60;].  When not given a relationship, this endpoint will create a part with an empty part revision and return a &#x60;201&#x60;  status code of the part.  When given a relationship to translate, this endpoint will return a &#x60;202&#x60; status code with the location of a &#x60;queued-translation&#x60;. The status of the translation can be queried via &#x60;getQueuedTranslation&#x60;. After the translation is complete, a &#x60;part&#x60; and &#x60;part-revision&#x60; that references the translated geometry.  A unique suppliedId/suppliedRevisionId combination will create a new part and new part revision. For instance, sending my-part-id/my-revision-id will create a new part and new revision with those corresponding supplied ids. To create a new revision for &#x60;my-part-id&#x60;, likewise you can invoke this endpoint with a new revision id: &#x60;my-part-id/my-new-revision-id&#x60; and a new revision will be created for the existing part.  See our [Import Data](https://developer.vertexvis.com/docs/guides/import-data-with-api) guides for more information. 
     * @param createPartRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created Part </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted </td><td>  * content-location -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createPartAsync(CreatePartRequest createPartRequest, final ApiCallback<Part> _callback) throws ApiException {

        okhttp3.Call localVarCall = createPartValidateBeforeCall(createPartRequest, _callback);
        Type localVarReturnType = new TypeToken<Part>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deletePart
     * @param id The &#x60;part&#x60; ID. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Accepted </td><td>  * content-location -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deletePartCall(UUID id, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/parts/{id}"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

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
    private okhttp3.Call deletePartValidateBeforeCall(UUID id, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deletePart(Async)");
        }

        return deletePartCall(id, _callback);

    }

    /**
     * 
     * Delete a &#x60;part&#x60;.
     * @param id The &#x60;part&#x60; ID. (required)
     * @return QueuedJob
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Accepted </td><td>  * content-location -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
     </table>
     */
    public QueuedJob deletePart(UUID id) throws ApiException {
        ApiResponse<QueuedJob> localVarResp = deletePartWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * 
     * Delete a &#x60;part&#x60;.
     * @param id The &#x60;part&#x60; ID. (required)
     * @return ApiResponse&lt;QueuedJob&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Accepted </td><td>  * content-location -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<QueuedJob> deletePartWithHttpInfo(UUID id) throws ApiException {
        okhttp3.Call localVarCall = deletePartValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<QueuedJob>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Delete a &#x60;part&#x60;.
     * @param id The &#x60;part&#x60; ID. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Accepted </td><td>  * content-location -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deletePartAsync(UUID id, final ApiCallback<QueuedJob> _callback) throws ApiException {

        okhttp3.Call localVarCall = deletePartValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<QueuedJob>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getPart
     * @param id The &#x60;part&#x60; ID. (required)
     * @param include Comma-separated list of relationships to include in response. (optional)
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
    public okhttp3.Call getPartCall(UUID id, String include, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/parts/{id}"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (include != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("include", include));
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
    private okhttp3.Call getPartValidateBeforeCall(UUID id, String include, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getPart(Async)");
        }

        return getPartCall(id, include, _callback);

    }

    /**
     * 
     * Get a &#x60;part&#x60; by ID.
     * @param id The &#x60;part&#x60; ID. (required)
     * @param include Comma-separated list of relationships to include in response. (optional)
     * @return Part
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
    public Part getPart(UUID id, String include) throws ApiException {
        ApiResponse<Part> localVarResp = getPartWithHttpInfo(id, include);
        return localVarResp.getData();
    }

    /**
     * 
     * Get a &#x60;part&#x60; by ID.
     * @param id The &#x60;part&#x60; ID. (required)
     * @param include Comma-separated list of relationships to include in response. (optional)
     * @return ApiResponse&lt;Part&gt;
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
    public ApiResponse<Part> getPartWithHttpInfo(UUID id, String include) throws ApiException {
        okhttp3.Call localVarCall = getPartValidateBeforeCall(id, include, null);
        Type localVarReturnType = new TypeToken<Part>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get a &#x60;part&#x60; by ID.
     * @param id The &#x60;part&#x60; ID. (required)
     * @param include Comma-separated list of relationships to include in response. (optional)
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
    public okhttp3.Call getPartAsync(UUID id, String include, final ApiCallback<Part> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPartValidateBeforeCall(id, include, _callback);
        Type localVarReturnType = new TypeToken<Part>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getParts
     * @param pageCursor The cursor for the next page of items. (optional)
     * @param pageSize The number of items to return. (optional)
     * @param filterSuppliedId Comma-separated list of supplied IDs to filter on. (optional)
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
    public okhttp3.Call getPartsCall(String pageCursor, Integer pageSize, String filterSuppliedId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/parts";

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

        if (filterSuppliedId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter[suppliedId]", filterSuppliedId));
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
    private okhttp3.Call getPartsValidateBeforeCall(String pageCursor, Integer pageSize, String filterSuppliedId, final ApiCallback _callback) throws ApiException {
        return getPartsCall(pageCursor, pageSize, filterSuppliedId, _callback);

    }

    /**
     * 
     * Get &#x60;parts&#x60;.
     * @param pageCursor The cursor for the next page of items. (optional)
     * @param pageSize The number of items to return. (optional)
     * @param filterSuppliedId Comma-separated list of supplied IDs to filter on. (optional)
     * @return PartList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
     </table>
     */
    public PartList getParts(String pageCursor, Integer pageSize, String filterSuppliedId) throws ApiException {
        ApiResponse<PartList> localVarResp = getPartsWithHttpInfo(pageCursor, pageSize, filterSuppliedId);
        return localVarResp.getData();
    }

    /**
     * 
     * Get &#x60;parts&#x60;.
     * @param pageCursor The cursor for the next page of items. (optional)
     * @param pageSize The number of items to return. (optional)
     * @param filterSuppliedId Comma-separated list of supplied IDs to filter on. (optional)
     * @return ApiResponse&lt;PartList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 415 </td><td> Unsupported Media Type </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PartList> getPartsWithHttpInfo(String pageCursor, Integer pageSize, String filterSuppliedId) throws ApiException {
        okhttp3.Call localVarCall = getPartsValidateBeforeCall(pageCursor, pageSize, filterSuppliedId, null);
        Type localVarReturnType = new TypeToken<PartList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get &#x60;parts&#x60;.
     * @param pageCursor The cursor for the next page of items. (optional)
     * @param pageSize The number of items to return. (optional)
     * @param filterSuppliedId Comma-separated list of supplied IDs to filter on. (optional)
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
    public okhttp3.Call getPartsAsync(String pageCursor, Integer pageSize, String filterSuppliedId, final ApiCallback<PartList> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPartsValidateBeforeCall(pageCursor, pageSize, filterSuppliedId, _callback);
        Type localVarReturnType = new TypeToken<PartList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getQueuedPartDeletion
     * @param id The &#x60;queued-part-deletion&#x60; ID. (required)
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
    public okhttp3.Call getQueuedPartDeletionCall(UUID id, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/queued-part-deletions/{id}"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

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
    private okhttp3.Call getQueuedPartDeletionValidateBeforeCall(UUID id, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getQueuedPartDeletion(Async)");
        }

        return getQueuedPartDeletionCall(id, _callback);

    }

    /**
     * 
     * Get a &#x60;queued-part-deletion&#x60; by ID.
     * @param id The &#x60;queued-part-deletion&#x60; ID. (required)
     * @return QueuedJob
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
    public QueuedJob getQueuedPartDeletion(UUID id) throws ApiException {
        ApiResponse<QueuedJob> localVarResp = getQueuedPartDeletionWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * 
     * Get a &#x60;queued-part-deletion&#x60; by ID.
     * @param id The &#x60;queued-part-deletion&#x60; ID. (required)
     * @return ApiResponse&lt;QueuedJob&gt;
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
    public ApiResponse<QueuedJob> getQueuedPartDeletionWithHttpInfo(UUID id) throws ApiException {
        okhttp3.Call localVarCall = getQueuedPartDeletionValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<QueuedJob>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get a &#x60;queued-part-deletion&#x60; by ID.
     * @param id The &#x60;queued-part-deletion&#x60; ID. (required)
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
    public okhttp3.Call getQueuedPartDeletionAsync(UUID id, final ApiCallback<QueuedJob> _callback) throws ApiException {

        okhttp3.Call localVarCall = getQueuedPartDeletionValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<QueuedJob>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
