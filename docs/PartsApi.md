# PartsApi

All URIs are relative to *https://platform.vertexvis.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPart**](PartsApi.md#createPart) | **POST** /parts | 
[**deletePart**](PartsApi.md#deletePart) | **DELETE** /parts/{id} | 
[**getPart**](PartsApi.md#getPart) | **GET** /parts/{id} | 
[**getParts**](PartsApi.md#getParts) | **GET** /parts | 
[**getQueuedPartDeletion**](PartsApi.md#getQueuedPartDeletion) | **GET** /queued-part-deletions/{id} | 


<a name="createPart"></a>
# **createPart**
> QueuedJob createPart(createPartRequest)



Create a &#x60;part&#x60;. This API is asynchronous, returning the location of a &#x60;queued-translation&#x60;. Check the status via the getQueuedTranslation API. For details, see our [Import data](https://developer.vertexvis.com/docs/guides/import-data-with-api) guide.

### Example
```java
// Import classes:
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.Configuration;
import com.vertexvis.auth.*;
import com.vertexvis.models.*;
import com.vertexvis.api.PartsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://platform.vertexvis.com");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    PartsApi apiInstance = new PartsApi(defaultClient);
    CreatePartRequest createPartRequest = new CreatePartRequest(); // CreatePartRequest | 
    try {
      QueuedJob result = apiInstance.createPart(createPartRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PartsApi#createPart");
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
 **createPartRequest** | [**CreatePartRequest**](CreatePartRequest.md)|  |

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
**415** | Unsupported Media Type |  -  |

<a name="deletePart"></a>
# **deletePart**
> QueuedJob deletePart(id)



Delete a &#x60;part&#x60;.

### Example
```java
// Import classes:
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.Configuration;
import com.vertexvis.auth.*;
import com.vertexvis.models.*;
import com.vertexvis.api.PartsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://platform.vertexvis.com");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    PartsApi apiInstance = new PartsApi(defaultClient);
    UUID id = new UUID(); // UUID | The `part` ID.
    try {
      QueuedJob result = apiInstance.deletePart(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PartsApi#deletePart");
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

<a name="getPart"></a>
# **getPart**
> Part getPart(id, include)



Get a &#x60;part&#x60; by ID.

### Example
```java
// Import classes:
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.Configuration;
import com.vertexvis.auth.*;
import com.vertexvis.models.*;
import com.vertexvis.api.PartsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://platform.vertexvis.com");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    PartsApi apiInstance = new PartsApi(defaultClient);
    UUID id = new UUID(); // UUID | The `part` ID.
    String include = "partRevisions"; // String | Comma-separated list of relationships to include in response.
    try {
      Part result = apiInstance.getPart(id, include);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PartsApi#getPart");
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
 **include** | **String**| Comma-separated list of relationships to include in response. | [optional]

### Return type

[**Part**](Part.md)

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

<a name="getParts"></a>
# **getParts**
> PartList getParts(pageCursor, pageSize, filterSuppliedId)



Get &#x60;parts&#x60;.

### Example
```java
// Import classes:
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.Configuration;
import com.vertexvis.auth.*;
import com.vertexvis.models.*;
import com.vertexvis.api.PartsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://platform.vertexvis.com");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    PartsApi apiInstance = new PartsApi(defaultClient);
    String pageCursor = "cHJkMDVFR2RLag=="; // String | The cursor for the next page of items.
    Integer pageSize = 10; // Integer | The number of items to return.
    String filterSuppliedId = "some-id-1,some-id-2"; // String | Comma-separated list of supplied IDs to filter on.
    try {
      PartList result = apiInstance.getParts(pageCursor, pageSize, filterSuppliedId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PartsApi#getParts");
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
 **pageCursor** | **String**| The cursor for the next page of items. | [optional]
 **pageSize** | **Integer**| The number of items to return. | [optional]
 **filterSuppliedId** | **String**| Comma-separated list of supplied IDs to filter on. | [optional]

### Return type

[**PartList**](PartList.md)

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
**415** | Unsupported Media Type |  -  |

<a name="getQueuedPartDeletion"></a>
# **getQueuedPartDeletion**
> QueuedJob getQueuedPartDeletion(id)



Get a &#x60;queued-part-deletion&#x60; by ID.

### Example
```java
// Import classes:
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.Configuration;
import com.vertexvis.auth.*;
import com.vertexvis.models.*;
import com.vertexvis.api.PartsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://platform.vertexvis.com");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    PartsApi apiInstance = new PartsApi(defaultClient);
    UUID id = new UUID(); // UUID | The `queued-part-deletion` ID.
    try {
      QueuedJob result = apiInstance.getQueuedPartDeletion(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PartsApi#getQueuedPartDeletion");
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
 **id** | [**UUID**](.md)| The &#x60;queued-part-deletion&#x60; ID. |

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

