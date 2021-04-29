# SceneViewStatesApi

All URIs are relative to *https://platform.vertexvis.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSceneViewState**](SceneViewStatesApi.md#createSceneViewState) | **POST** /scenes/{id}/scene-view-states | 
[**deleteSceneViewState**](SceneViewStatesApi.md#deleteSceneViewState) | **DELETE** /scene-view-states/{id} | 
[**getSceneViewState**](SceneViewStatesApi.md#getSceneViewState) | **GET** /scene-view-states/{id} | 
[**getSceneViewStates**](SceneViewStatesApi.md#getSceneViewStates) | **GET** /scenes/{id}/scene-view-states | 


<a name="createSceneViewState"></a>
# **createSceneViewState**
> SceneViewState createSceneViewState(id, createSceneViewStateRequest)



Create a &#x60;scene-view-state&#x60; for a &#x60;scene&#x60;.

### Example
```java
// Import classes:
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.Configuration;
import com.vertexvis.auth.*;
import com.vertexvis.models.*;
import com.vertexvis.api.SceneViewStatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://platform.vertexvis.com");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    SceneViewStatesApi apiInstance = new SceneViewStatesApi(defaultClient);
    UUID id = new UUID(); // UUID | The `scene` ID.
    CreateSceneViewStateRequest createSceneViewStateRequest = new CreateSceneViewStateRequest(); // CreateSceneViewStateRequest | 
    try {
      SceneViewState result = apiInstance.createSceneViewState(id, createSceneViewStateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SceneViewStatesApi#createSceneViewState");
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
 **createSceneViewStateRequest** | [**CreateSceneViewStateRequest**](CreateSceneViewStateRequest.md)|  |

### Return type

[**SceneViewState**](SceneViewState.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  * location -  <br>  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**404** | Not Found |  -  |
**415** | Unsupported Media Type |  -  |

<a name="deleteSceneViewState"></a>
# **deleteSceneViewState**
> deleteSceneViewState(id)



Delete a &#x60;scene-view-state&#x60;.

### Example
```java
// Import classes:
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.Configuration;
import com.vertexvis.auth.*;
import com.vertexvis.models.*;
import com.vertexvis.api.SceneViewStatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://platform.vertexvis.com");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    SceneViewStatesApi apiInstance = new SceneViewStatesApi(defaultClient);
    UUID id = new UUID(); // UUID | The `scene-view-state` ID.
    try {
      apiInstance.deleteSceneViewState(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling SceneViewStatesApi#deleteSceneViewState");
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
 **id** | [**UUID**](.md)| The &#x60;scene-view-state&#x60; ID. |

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

<a name="getSceneViewState"></a>
# **getSceneViewState**
> SceneViewState getSceneViewState(id)



Get a &#x60;scene-view-state&#x60; by ID.

### Example
```java
// Import classes:
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.Configuration;
import com.vertexvis.auth.*;
import com.vertexvis.models.*;
import com.vertexvis.api.SceneViewStatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://platform.vertexvis.com");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    SceneViewStatesApi apiInstance = new SceneViewStatesApi(defaultClient);
    UUID id = new UUID(); // UUID | The `scene-view-state` ID.
    try {
      SceneViewState result = apiInstance.getSceneViewState(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SceneViewStatesApi#getSceneViewState");
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
 **id** | [**UUID**](.md)| The &#x60;scene-view-state&#x60; ID. |

### Return type

[**SceneViewState**](SceneViewState.md)

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

<a name="getSceneViewStates"></a>
# **getSceneViewStates**
> SceneViewStateList getSceneViewStates(id, pageCursor, pageSize)



Get &#x60;scene-view-states&#x60; for a &#x60;scene&#x60;.

### Example
```java
// Import classes:
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.Configuration;
import com.vertexvis.auth.*;
import com.vertexvis.models.*;
import com.vertexvis.api.SceneViewStatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://platform.vertexvis.com");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    SceneViewStatesApi apiInstance = new SceneViewStatesApi(defaultClient);
    UUID id = new UUID(); // UUID | The `scene` ID.
    String pageCursor = "cHJkMDVFR2RLag=="; // String | The cursor for the next page of items.
    Integer pageSize = 10; // Integer | The number of items to return.
    try {
      SceneViewStateList result = apiInstance.getSceneViewStates(id, pageCursor, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SceneViewStatesApi#getSceneViewStates");
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

### Return type

[**SceneViewStateList**](SceneViewStateList.md)

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

