# ScenesApi

All URIs are relative to *https://platform.vertexvis.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createScene**](ScenesApi.md#createScene) | **POST** /scenes | 
[**deleteScene**](ScenesApi.md#deleteScene) | **DELETE** /scenes/{id} | 
[**getQueuedScene**](ScenesApi.md#getQueuedScene) | **GET** /queued-scenes/{id} | 
[**getScene**](ScenesApi.md#getScene) | **GET** /scenes/{id} | 
[**getScenes**](ScenesApi.md#getScenes) | **GET** /scenes | 
[**renderScene**](ScenesApi.md#renderScene) | **GET** /scenes/{id}/image | 
[**updateScene**](ScenesApi.md#updateScene) | **PATCH** /scenes/{id} | 


<a name="createScene"></a>
# **createScene**
> Scene createScene(createSceneRequest)



Create a &#x60;scene&#x60;. Once created, add scene items via the createSceneItem API. For details, see our [Render static scenes](https://developer.vertexvis.com/docs/guides/render-static-scenes) guide.

### Example
```java
// Import classes:
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.Configuration;
import com.vertexvis.auth.*;
import com.vertexvis.models.*;
import com.vertexvis.api.ScenesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://platform.vertexvis.com");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    ScenesApi apiInstance = new ScenesApi(defaultClient);
    CreateSceneRequest createSceneRequest = new CreateSceneRequest(); // CreateSceneRequest | 
    try {
      Scene result = apiInstance.createScene(createSceneRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenesApi#createScene");
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
 **createSceneRequest** | [**CreateSceneRequest**](CreateSceneRequest.md)|  |

### Return type

[**Scene**](Scene.md)

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
**415** | Unsupported Media Type |  -  |

<a name="deleteScene"></a>
# **deleteScene**
> deleteScene(id)



Delete a &#x60;scene&#x60;.

### Example
```java
// Import classes:
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.Configuration;
import com.vertexvis.auth.*;
import com.vertexvis.models.*;
import com.vertexvis.api.ScenesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://platform.vertexvis.com");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    ScenesApi apiInstance = new ScenesApi(defaultClient);
    UUID id = new UUID(); // UUID | The `scene` ID.
    try {
      apiInstance.deleteScene(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenesApi#deleteScene");
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

<a name="getQueuedScene"></a>
# **getQueuedScene**
> QueuedJob getQueuedScene(id)



Get a &#x60;queued-scene&#x60;.

### Example
```java
// Import classes:
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.Configuration;
import com.vertexvis.auth.*;
import com.vertexvis.models.*;
import com.vertexvis.api.ScenesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://platform.vertexvis.com");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    ScenesApi apiInstance = new ScenesApi(defaultClient);
    UUID id = new UUID(); // UUID | The `scene` ID.
    try {
      QueuedJob result = apiInstance.getQueuedScene(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenesApi#getQueuedScene");
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

<a name="getScene"></a>
# **getScene**
> Scene getScene(id)



Get a &#x60;scene&#x60; by ID.

### Example
```java
// Import classes:
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.Configuration;
import com.vertexvis.auth.*;
import com.vertexvis.models.*;
import com.vertexvis.api.ScenesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://platform.vertexvis.com");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    ScenesApi apiInstance = new ScenesApi(defaultClient);
    UUID id = new UUID(); // UUID | The `scene` ID.
    try {
      Scene result = apiInstance.getScene(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenesApi#getScene");
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

### Return type

[**Scene**](Scene.md)

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

<a name="getScenes"></a>
# **getScenes**
> SceneList getScenes(pageCursor, pageSize)



Get &#x60;scenes&#x60;.

### Example
```java
// Import classes:
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.Configuration;
import com.vertexvis.auth.*;
import com.vertexvis.models.*;
import com.vertexvis.api.ScenesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://platform.vertexvis.com");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    ScenesApi apiInstance = new ScenesApi(defaultClient);
    String pageCursor = "cHJkMDVFR2RLag=="; // String | The cursor for the next page of items.
    Integer pageSize = 10; // Integer | The number of items to return.
    try {
      SceneList result = apiInstance.getScenes(pageCursor, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenesApi#getScenes");
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

[**SceneList**](SceneList.md)

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

<a name="renderScene"></a>
# **renderScene**
> File renderScene(id, height, width)



Get a rendered image of a &#x60;scene&#x60;. If only a single pixel is returned, ensure the &#x60;scene&#x60; is in the &#x60;commit&#x60; state and contains scene items.

### Example
```java
// Import classes:
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.Configuration;
import com.vertexvis.auth.*;
import com.vertexvis.models.*;
import com.vertexvis.api.ScenesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://platform.vertexvis.com");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    ScenesApi apiInstance = new ScenesApi(defaultClient);
    UUID id = new UUID(); // UUID | The `scene` ID.
    Integer height = 1000; // Integer | The height of the image to render.
    Integer width = 1000; // Integer | The width of the image to render.
    try {
      File result = apiInstance.renderScene(id, height, width);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenesApi#renderScene");
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

<a name="updateScene"></a>
# **updateScene**
> Scene updateScene(id, updateSceneRequest)



Update a &#x60;scene&#x60; camera and/or state. Once updated, view the scene via the renderScene API or with the Viewer SDK. For details, see our [Render static scenes](https://developer.vertexvis.com/docs/guides/render-static-scenes) guide.

### Example
```java
// Import classes:
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.Configuration;
import com.vertexvis.auth.*;
import com.vertexvis.models.*;
import com.vertexvis.api.ScenesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://platform.vertexvis.com");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    ScenesApi apiInstance = new ScenesApi(defaultClient);
    UUID id = new UUID(); // UUID | The `scene` ID.
    UpdateSceneRequest updateSceneRequest = new UpdateSceneRequest(); // UpdateSceneRequest | 
    try {
      Scene result = apiInstance.updateScene(id, updateSceneRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScenesApi#updateScene");
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
 **updateSceneRequest** | [**UpdateSceneRequest**](UpdateSceneRequest.md)|  |

### Return type

[**Scene**](Scene.md)

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

