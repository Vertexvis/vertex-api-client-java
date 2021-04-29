# PartRevisionsApi

All URIs are relative to *https://platform.vertexvis.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletePartRevision**](PartRevisionsApi.md#deletePartRevision) | **DELETE** /part-revisions/{id} | 
[**getPartRevision**](PartRevisionsApi.md#getPartRevision) | **GET** /part-revisions/{id} | 
[**getPartRevisions**](PartRevisionsApi.md#getPartRevisions) | **GET** /parts/{id}/part-revisions | 
[**getQueuedPartRevisionDeletion**](PartRevisionsApi.md#getQueuedPartRevisionDeletion) | **GET** /queued-part-revision-deletions/{id} | 
[**renderPartRevision**](PartRevisionsApi.md#renderPartRevision) | **GET** /part-revisions/{id}/image | 
[**updatePartRevision**](PartRevisionsApi.md#updatePartRevision) | **PATCH** /part-revisions/{id} | 


<a name="deletePartRevision"></a>
# **deletePartRevision**
> QueuedJob deletePartRevision(id)



Delete a &#x60;part-revision&#x60;.

### Example
```java
// Import classes:
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.Configuration;
import com.vertexvis.auth.*;
import com.vertexvis.models.*;
import com.vertexvis.api.PartRevisionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://platform.vertexvis.com");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    PartRevisionsApi apiInstance = new PartRevisionsApi(defaultClient);
    UUID id = new UUID(); // UUID | The `part-revision` ID.
    try {
      QueuedJob result = apiInstance.deletePartRevision(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PartRevisionsApi#deletePartRevision");
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
 **id** | [**UUID**](.md)| The &#x60;part-revision&#x60; ID. |

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
**202** | Accepted |  * content-location -  <br>  |
**401** | Unauthorized |  -  |
**404** | Not Found |  -  |
**415** | Unsupported Media Type |  -  |

<a name="getPartRevision"></a>
# **getPartRevision**
> PartRevision getPartRevision(id, fieldsPartRevision)



Get a &#x60;part-revision&#x60; by ID.

### Example
```java
// Import classes:
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.Configuration;
import com.vertexvis.auth.*;
import com.vertexvis.models.*;
import com.vertexvis.api.PartRevisionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://platform.vertexvis.com");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    PartRevisionsApi apiInstance = new PartRevisionsApi(defaultClient);
    UUID id = new UUID(); // UUID | The `part-revision` ID.
    String fieldsPartRevision = "created,suppliedId"; // String | Comma-separated list of fields to return in response. An empty value returns no fields. Due to its potential size, metadata is only returned if explicitly requested.
    try {
      PartRevision result = apiInstance.getPartRevision(id, fieldsPartRevision);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PartRevisionsApi#getPartRevision");
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
 **id** | [**UUID**](.md)| The &#x60;part-revision&#x60; ID. |
 **fieldsPartRevision** | **String**| Comma-separated list of fields to return in response. An empty value returns no fields. Due to its potential size, metadata is only returned if explicitly requested. | [optional]

### Return type

[**PartRevision**](PartRevision.md)

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

<a name="getPartRevisions"></a>
# **getPartRevisions**
> PartRevisionList getPartRevisions(id, pageCursor, pageSize, filterSuppliedId)



Get &#x60;part-revisions&#x60; for a &#x60;part&#x60;.

### Example
```java
// Import classes:
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.Configuration;
import com.vertexvis.auth.*;
import com.vertexvis.models.*;
import com.vertexvis.api.PartRevisionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://platform.vertexvis.com");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    PartRevisionsApi apiInstance = new PartRevisionsApi(defaultClient);
    UUID id = new UUID(); // UUID | The `part` ID.
    String pageCursor = "cHJkMDVFR2RLag=="; // String | The cursor for the next page of items.
    Integer pageSize = 10; // Integer | The number of items to return.
    String filterSuppliedId = "some-id-1,some-id-2"; // String | Comma-separated list of supplied IDs to filter on.
    try {
      PartRevisionList result = apiInstance.getPartRevisions(id, pageCursor, pageSize, filterSuppliedId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PartRevisionsApi#getPartRevisions");
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
 **id** | [**UUID**](.md)| The &#x60;part&#x60; ID. |
 **pageCursor** | **String**| The cursor for the next page of items. | [optional]
 **pageSize** | **Integer**| The number of items to return. | [optional]
 **filterSuppliedId** | **String**| Comma-separated list of supplied IDs to filter on. | [optional]

### Return type

[**PartRevisionList**](PartRevisionList.md)

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

<a name="getQueuedPartRevisionDeletion"></a>
# **getQueuedPartRevisionDeletion**
> QueuedJob getQueuedPartRevisionDeletion(id)



Get a &#x60;queued-part-revision-deletion&#x60; by ID.

### Example
```java
// Import classes:
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.Configuration;
import com.vertexvis.auth.*;
import com.vertexvis.models.*;
import com.vertexvis.api.PartRevisionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://platform.vertexvis.com");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    PartRevisionsApi apiInstance = new PartRevisionsApi(defaultClient);
    UUID id = new UUID(); // UUID | The `queued-part-revision-deletion` ID.
    try {
      QueuedJob result = apiInstance.getQueuedPartRevisionDeletion(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PartRevisionsApi#getQueuedPartRevisionDeletion");
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
 **id** | [**UUID**](.md)| The &#x60;queued-part-revision-deletion&#x60; ID. |

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

<a name="renderPartRevision"></a>
# **renderPartRevision**
> File renderPartRevision(id, height, width)



Get a rendered image of a &#x60;part-revision&#x60;.

### Example
```java
// Import classes:
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.Configuration;
import com.vertexvis.auth.*;
import com.vertexvis.models.*;
import com.vertexvis.api.PartRevisionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://platform.vertexvis.com");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    PartRevisionsApi apiInstance = new PartRevisionsApi(defaultClient);
    UUID id = new UUID(); // UUID | The `part-revision` ID.
    Integer height = 1000; // Integer | The height of the image to render.
    Integer width = 1000; // Integer | The width of the image to render.
    try {
      File result = apiInstance.renderPartRevision(id, height, width);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PartRevisionsApi#renderPartRevision");
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
 **id** | [**UUID**](.md)| The &#x60;part-revision&#x60; ID. |
 **height** | **Integer**| The height of the image to render. | [optional]
 **width** | **Integer**| The width of the image to render. | [optional]

### Return type

[**File**](File.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: image/jpeg, application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**404** | Not Found |  -  |
**415** | Unsupported Media Type |  -  |
**504** | GatewayTimeout |  -  |

<a name="updatePartRevision"></a>
# **updatePartRevision**
> PartRevision updatePartRevision(id, updatePartRevisionRequest)



Update a &#x60;part-revision&#x60;. Note that metadata updates are eventually consistent.

### Example
```java
// Import classes:
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.Configuration;
import com.vertexvis.auth.*;
import com.vertexvis.models.*;
import com.vertexvis.api.PartRevisionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://platform.vertexvis.com");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    PartRevisionsApi apiInstance = new PartRevisionsApi(defaultClient);
    UUID id = new UUID(); // UUID | The `part-revision` ID.
    UpdatePartRevisionRequest updatePartRevisionRequest = new UpdatePartRevisionRequest(); // UpdatePartRevisionRequest | 
    try {
      PartRevision result = apiInstance.updatePartRevision(id, updatePartRevisionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PartRevisionsApi#updatePartRevision");
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
 **id** | [**UUID**](.md)| The &#x60;part-revision&#x60; ID. |
 **updatePartRevisionRequest** | [**UpdatePartRevisionRequest**](UpdatePartRevisionRequest.md)|  |

### Return type

[**PartRevision**](PartRevision.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**404** | Not Found |  -  |
**415** | Unsupported Media Type |  -  |

