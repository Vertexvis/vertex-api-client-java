# StreamKeysApi

All URIs are relative to *https://platform.vertexvis.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSceneStreamKey**](StreamKeysApi.md#createSceneStreamKey) | **POST** /scenes/{id}/stream-keys | 
[**deleteStreamKey**](StreamKeysApi.md#deleteStreamKey) | **DELETE** /stream-keys/{id} | 
[**getStreamKeys**](StreamKeysApi.md#getStreamKeys) | **GET** /stream-keys | 


<a name="createSceneStreamKey"></a>
# **createSceneStreamKey**
> StreamKey createSceneStreamKey(id, createStreamKeyRequest)



Create a &#x60;stream-key&#x60; for a &#x60;scene&#x60;.

### Example
```java
// Import classes:
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.Configuration;
import com.vertexvis.auth.*;
import com.vertexvis.models.*;
import com.vertexvis.api.StreamKeysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://platform.vertexvis.com");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    StreamKeysApi apiInstance = new StreamKeysApi(defaultClient);
    UUID id = new UUID(); // UUID | The `scene` ID.
    CreateStreamKeyRequest createStreamKeyRequest = new CreateStreamKeyRequest(); // CreateStreamKeyRequest | 
    try {
      StreamKey result = apiInstance.createSceneStreamKey(id, createStreamKeyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamKeysApi#createSceneStreamKey");
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
 **createStreamKeyRequest** | [**CreateStreamKeyRequest**](CreateStreamKeyRequest.md)|  |

### Return type

[**StreamKey**](StreamKey.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  * location -  <br>  |
**401** | Unauthorized |  -  |
**404** | Not Found |  -  |
**415** | Unsupported Media Type |  -  |

<a name="deleteStreamKey"></a>
# **deleteStreamKey**
> deleteStreamKey(id)



Delete a &#x60;stream-key&#x60;.

### Example
```java
// Import classes:
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.Configuration;
import com.vertexvis.auth.*;
import com.vertexvis.models.*;
import com.vertexvis.api.StreamKeysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://platform.vertexvis.com");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    StreamKeysApi apiInstance = new StreamKeysApi(defaultClient);
    UUID id = new UUID(); // UUID | The `stream-key` ID.
    try {
      apiInstance.deleteStreamKey(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamKeysApi#deleteStreamKey");
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
 **id** | [**UUID**](.md)| The &#x60;stream-key&#x60; ID. |

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

<a name="getStreamKeys"></a>
# **getStreamKeys**
> StreamKeyList getStreamKeys(pageCursor, pageSize, filterKey)



Get &#x60;stream-key&#x60;s.

### Example
```java
// Import classes:
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.Configuration;
import com.vertexvis.auth.*;
import com.vertexvis.models.*;
import com.vertexvis.api.StreamKeysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://platform.vertexvis.com");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    StreamKeysApi apiInstance = new StreamKeysApi(defaultClient);
    String pageCursor = "cHJkMDVFR2RLag=="; // String | The cursor for the next page of items.
    Integer pageSize = 10; // Integer | The number of items to return.
    String filterKey = "i3MFRDOmg1pxD36dGCTONRwOujkgV8m9LQ"; // String | Stream key to filter on.
    try {
      StreamKeyList result = apiInstance.getStreamKeys(pageCursor, pageSize, filterKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamKeysApi#getStreamKeys");
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
 **filterKey** | **String**| Stream key to filter on. | [optional]

### Return type

[**StreamKeyList**](StreamKeyList.md)

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

