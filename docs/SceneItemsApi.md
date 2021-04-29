# SceneItemsApi

All URIs are relative to *https://platform.vertexvis.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSceneItem**](SceneItemsApi.md#createSceneItem) | **POST** /scenes/{id}/scene-items | 
[**deleteSceneItem**](SceneItemsApi.md#deleteSceneItem) | **DELETE** /scene-items/{id} | 
[**getQueuedSceneItem**](SceneItemsApi.md#getQueuedSceneItem) | **GET** /queued-scene-items/{id} | 
[**getQueuedSceneItemDeletion**](SceneItemsApi.md#getQueuedSceneItemDeletion) | **GET** /queued-scene-item-deletions/{id} | 
[**getSceneItem**](SceneItemsApi.md#getSceneItem) | **GET** /scene-items/{id} | 
[**getSceneItems**](SceneItemsApi.md#getSceneItems) | **GET** /scenes/{id}/scene-items | 
[**updateSceneItem**](SceneItemsApi.md#updateSceneItem) | **PATCH** /scene-items/{id} | 


<a name="createSceneItem"></a>
# **createSceneItem**
> QueuedJob createSceneItem(id, createSceneItemRequest)



Create a &#x60;scene-item&#x60; for a &#x60;scene&#x60;. Provide the source geometry either via &#x60;part-revision&#x60; or &#x60;geometry-set&#x60; UUID using &#x60;relationship.source&#x60; or by supplied IDs using &#x60;attributes.source&#x60;. Provide an existing &#x60;scene&#x60; using &#x60;relationship.source&#x60; to clone it. Provide the hierarchical parent either via &#x60;scene-item&#x60; UUID using &#x60;relationship.source&#x60; or by supplied ID using &#x60;attributes.parent&#x60;. To reduce the time taken creating many hierarchical &#x60;scene-items&#x60;, make a best effort to create parents before children. One way to do this is by sorting the items by depth and starting at the root. This API is asynchronous, returning the location of a &#x60;queued-scene-item&#x60;. Check the status via the getQueuedSceneItem API. For details, see our [Render static scenes](https://developer.vertexvis.com/docs/guides/render-static-scenes) guide.

### Example
```java
// Import classes:
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.Configuration;
import com.vertexvis.auth.*;
import com.vertexvis.models.*;
import com.vertexvis.api.SceneItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://platform.vertexvis.com");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    SceneItemsApi apiInstance = new SceneItemsApi(defaultClient);
    UUID id = new UUID(); // UUID | The `scene` ID.
    CreateSceneItemRequest createSceneItemRequest = new CreateSceneItemRequest(); // CreateSceneItemRequest | 
    try {
      QueuedJob result = apiInstance.createSceneItem(id, createSceneItemRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SceneItemsApi#createSceneItem");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| The &#x60;scene&#x60; ID. |
 **createSceneItemRequest** | [**CreateSceneItemRequest**](CreateSceneItemRequest.md)|  |

### Return type

[**QueuedJob**](QueuedJob.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Accepted |  * content-location -  <br>  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**404** | Not Found |  -  |
**409** | Conflict |  -  |
**415** | Unsupported Media Type |  -  |

<a name="deleteSceneItem"></a>
# **deleteSceneItem**
> deleteSceneItem(id)



Delete a &#x60;scene-item&#x60;.

### Example
```java
// Import classes:
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.Configuration;
import com.vertexvis.auth.*;
import com.vertexvis.models.*;
import com.vertexvis.api.SceneItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://platform.vertexvis.com");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    SceneItemsApi apiInstance = new SceneItemsApi(defaultClient);
    UUID id = new UUID(); // UUID | The `scene-item` ID.
    try {
      apiInstance.deleteSceneItem(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling SceneItemsApi#deleteSceneItem");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| The &#x60;scene-item&#x60; ID. |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content |  -  |
**401** | Unauthorized |  -  |
**404** | Not Found |  -  |
**415** | Unsupported Media Type |  -  |

<a name="getQueuedSceneItem"></a>
# **getQueuedSceneItem**
> QueuedJob getQueuedSceneItem(id)



Get a &#x60;queued-scene-item&#x60;. The response is either the status if &#x60;running&#x60; or &#x60;error&#x60; or, upon completion, redirects to the created &#x60;scene-item&#x60;. Once created, commit the scene via the updateScene API. For details, see our [Render static scenes](https://developer.vertexvis.com/docs/guides/render-static-scenes) guide.

### Example
```java
// Import classes:
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.Configuration;
import com.vertexvis.auth.*;
import com.vertexvis.models.*;
import com.vertexvis.api.SceneItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://platform.vertexvis.com");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    SceneItemsApi apiInstance = new SceneItemsApi(defaultClient);
    UUID id = new UUID(); // UUID | The `queued-scene-item` ID.
    try {
      QueuedJob result = apiInstance.getQueuedSceneItem(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SceneItemsApi#getQueuedSceneItem");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| The &#x60;queued-scene-item&#x60; ID. |

### Return type

[**QueuedJob**](QueuedJob.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**301** | Moved Permanently |  -  |
**401** | Unauthorized |  -  |
**404** | Not Found |  -  |
**415** | Unsupported Media Type |  -  |

<a name="getQueuedSceneItemDeletion"></a>
# **getQueuedSceneItemDeletion**
> QueuedJob getQueuedSceneItemDeletion(id)



Get a &#x60;queued-scene-item-deletion&#x60; by ID.

### Example
```java
// Import classes:
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.Configuration;
import com.vertexvis.auth.*;
import com.vertexvis.models.*;
import com.vertexvis.api.SceneItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://platform.vertexvis.com");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    SceneItemsApi apiInstance = new SceneItemsApi(defaultClient);
    UUID id = new UUID(); // UUID | The `queued-scene-item-deletion` ID.
    try {
      QueuedJob result = apiInstance.getQueuedSceneItemDeletion(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SceneItemsApi#getQueuedSceneItemDeletion");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| The &#x60;queued-scene-item-deletion&#x60; ID. |

### Return type

[**QueuedJob**](QueuedJob.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**404** | Not Found |  -  |
**415** | Unsupported Media Type |  -  |

<a name="getSceneItem"></a>
# **getSceneItem**
> SceneItem getSceneItem(id, fieldsSceneItem)



Get a &#x60;scene-item&#x60; by ID.

### Example
```java
// Import classes:
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.Configuration;
import com.vertexvis.auth.*;
import com.vertexvis.models.*;
import com.vertexvis.api.SceneItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://platform.vertexvis.com");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    SceneItemsApi apiInstance = new SceneItemsApi(defaultClient);
    UUID id = new UUID(); // UUID | The `scene-item` ID.
    String fieldsSceneItem = "created,suppliedId,visible,transform,materialOverride"; // String | Comma-separated list of fields to return in response. An empty value returns no fields. `boundingBox` is only returned if explicitly requested.
    try {
      SceneItem result = apiInstance.getSceneItem(id, fieldsSceneItem);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SceneItemsApi#getSceneItem");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| The &#x60;scene-item&#x60; ID. |
 **fieldsSceneItem** | **String**| Comma-separated list of fields to return in response. An empty value returns no fields. &#x60;boundingBox&#x60; is only returned if explicitly requested. | [optional]

### Return type

[**SceneItem**](SceneItem.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**404** | Not Found |  -  |
**415** | Unsupported Media Type |  -  |

<a name="getSceneItems"></a>
# **getSceneItems**
> SceneItemList getSceneItems(id, pageCursor, pageSize, filterSource, filterSuppliedId, filterParent)



Get &#x60;scene-items&#x60; for a &#x60;scene&#x60;.

### Example
```java
// Import classes:
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.Configuration;
import com.vertexvis.auth.*;
import com.vertexvis.models.*;
import com.vertexvis.api.SceneItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://platform.vertexvis.com");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    SceneItemsApi apiInstance = new SceneItemsApi(defaultClient);
    UUID id = new UUID(); // UUID | The `scene` ID.
    String pageCursor = "cHJkMDVFR2RLag=="; // String | The cursor for the next page of items.
    Integer pageSize = 10; // Integer | The number of items to return.
    String filterSource = "f79d4760-0b71-44e4-ad0b-22743fdd4ca3"; // String | Source ID to filter on.
    String filterSuppliedId = "some-id-1,some-id-2"; // String | Comma-separated list of supplied IDs to filter on.
    UUID filterParent = new UUID(); // UUID | Parent ID to filter on.
    try {
      SceneItemList result = apiInstance.getSceneItems(id, pageCursor, pageSize, filterSource, filterSuppliedId, filterParent);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SceneItemsApi#getSceneItems");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| The &#x60;scene&#x60; ID. |
 **pageCursor** | **String**| The cursor for the next page of items. | [optional]
 **pageSize** | **Integer**| The number of items to return. | [optional]
 **filterSource** | **String**| Source ID to filter on. | [optional]
 **filterSuppliedId** | **String**| Comma-separated list of supplied IDs to filter on. | [optional]
 **filterParent** | [**UUID**](.md)| Parent ID to filter on. | [optional]

### Return type

[**SceneItemList**](SceneItemList.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**404** | Not Found |  -  |
**415** | Unsupported Media Type |  -  |

<a name="updateSceneItem"></a>
# **updateSceneItem**
> QueuedJob updateSceneItem(id, updateSceneItemRequest)



Update a &#x60;scene-item&#x60;.

### Example
```java
// Import classes:
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.Configuration;
import com.vertexvis.auth.*;
import com.vertexvis.models.*;
import com.vertexvis.api.SceneItemsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://platform.vertexvis.com");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    SceneItemsApi apiInstance = new SceneItemsApi(defaultClient);
    UUID id = new UUID(); // UUID | The `scene-item` ID.
    UpdateSceneItemRequest updateSceneItemRequest = new UpdateSceneItemRequest(); // UpdateSceneItemRequest | 
    try {
      QueuedJob result = apiInstance.updateSceneItem(id, updateSceneItemRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SceneItemsApi#updateSceneItem");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| The &#x60;scene-item&#x60; ID. |
 **updateSceneItemRequest** | [**UpdateSceneItemRequest**](UpdateSceneItemRequest.md)|  |

### Return type

[**QueuedJob**](QueuedJob.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Accepted |  * content-location -  <br>  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**404** | Not Found |  -  |
**415** | Unsupported Media Type |  -  |

