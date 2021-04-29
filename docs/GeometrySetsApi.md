# GeometrySetsApi

All URIs are relative to *https://platform.vertexvis.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createGeometrySet**](GeometrySetsApi.md#createGeometrySet) | **POST** /geometry-sets | 
[**getGeometrySet**](GeometrySetsApi.md#getGeometrySet) | **GET** /geometry-sets/{id} | 
[**getGeometrySets**](GeometrySetsApi.md#getGeometrySets) | **GET** /geometry-sets | 


<a name="createGeometrySet"></a>
# **createGeometrySet**
> QueuedJob createGeometrySet(createGeometrySetRequest)



Create a &#x60;geometry-set&#x60;. Once created, create scenes via the createScene API. For details, see our [Import data](https://developer.vertexvis.com/docs/guides/import-data-with-api) guide.

### Example
```java
// Import classes:
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.Configuration;
import com.vertexvis.auth.*;
import com.vertexvis.models.*;
import com.vertexvis.api.GeometrySetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://platform.vertexvis.com");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    GeometrySetsApi apiInstance = new GeometrySetsApi(defaultClient);
    CreateGeometrySetRequest createGeometrySetRequest = new CreateGeometrySetRequest(); // CreateGeometrySetRequest | 
    try {
      QueuedJob result = apiInstance.createGeometrySet(createGeometrySetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GeometrySetsApi#createGeometrySet");
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
 **createGeometrySetRequest** | [**CreateGeometrySetRequest**](CreateGeometrySetRequest.md)|  |

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

<a name="getGeometrySet"></a>
# **getGeometrySet**
> GeometrySet getGeometrySet(id)



Get a &#x60;geometry-set&#x60; by ID.

### Example
```java
// Import classes:
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.Configuration;
import com.vertexvis.auth.*;
import com.vertexvis.models.*;
import com.vertexvis.api.GeometrySetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://platform.vertexvis.com");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    GeometrySetsApi apiInstance = new GeometrySetsApi(defaultClient);
    UUID id = new UUID(); // UUID | The `geometry-set` ID.
    try {
      GeometrySet result = apiInstance.getGeometrySet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GeometrySetsApi#getGeometrySet");
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
 **id** | [**UUID**](.md)| The &#x60;geometry-set&#x60; ID. |

### Return type

[**GeometrySet**](GeometrySet.md)

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

<a name="getGeometrySets"></a>
# **getGeometrySets**
> GeometrySetList getGeometrySets(pageCursor, pageSize)



Get &#x60;geometry-sets&#x60;.

### Example
```java
// Import classes:
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.Configuration;
import com.vertexvis.auth.*;
import com.vertexvis.models.*;
import com.vertexvis.api.GeometrySetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://platform.vertexvis.com");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    GeometrySetsApi apiInstance = new GeometrySetsApi(defaultClient);
    String pageCursor = "cHJkMDVFR2RLag=="; // String | The cursor for the next page of items.
    Integer pageSize = 10; // Integer | The number of items to return.
    try {
      GeometrySetList result = apiInstance.getGeometrySets(pageCursor, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GeometrySetsApi#getGeometrySets");
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

### Return type

[**GeometrySetList**](GeometrySetList.md)

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

