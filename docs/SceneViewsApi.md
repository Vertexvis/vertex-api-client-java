# SceneViewsApi

All URIs are relative to *https://platform.vertexvis.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSceneView**](SceneViewsApi.md#createSceneView) | **POST** /scenes/{id}/scene-views | 
[**deleteSceneView**](SceneViewsApi.md#deleteSceneView) | **DELETE** /scene-views/{id} | 
[**getSceneView**](SceneViewsApi.md#getSceneView) | **GET** /scene-views/{id} | 
[**getViewSceneItem**](SceneViewsApi.md#getViewSceneItem) | **GET** /scene-views/{id}/scene-items/{itemId} | 
[**renderSceneView**](SceneViewsApi.md#renderSceneView) | **GET** /scene-views/{id}/image | 
[**updateSceneView**](SceneViewsApi.md#updateSceneView) | **PATCH** /scene-views/{id} | 


<a name="createSceneView"></a>
# **createSceneView**
> SceneView createSceneView(id, createSceneViewRequest)



Create a &#x60;scene-view&#x60; of a &#x60;scene&#x60;.

### Example
```java
// Import classes:
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.Configuration;
import com.vertexvis.auth.*;
import com.vertexvis.models.*;
import com.vertexvis.api.SceneViewsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://platform.vertexvis.com");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    SceneViewsApi apiInstance = new SceneViewsApi(defaultClient);
    UUID id = new UUID(); // UUID | The `scene` ID.
    CreateSceneViewRequest createSceneViewRequest = new CreateSceneViewRequest(); // CreateSceneViewRequest | 
    try {
      SceneView result = apiInstance.createSceneView(id, createSceneViewRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SceneViewsApi#createSceneView");
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
 **createSceneViewRequest** | [**CreateSceneViewRequest**](CreateSceneViewRequest.md)|  |

### Return type

[**SceneView**](SceneView.md)

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

<a name="deleteSceneView"></a>
# **deleteSceneView**
> deleteSceneView(id)



Delete a &#x60;scene-view&#x60;.

### Example
```java
// Import classes:
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.Configuration;
import com.vertexvis.auth.*;
import com.vertexvis.models.*;
import com.vertexvis.api.SceneViewsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://platform.vertexvis.com");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    SceneViewsApi apiInstance = new SceneViewsApi(defaultClient);
    UUID id = new UUID(); // UUID | The `scene-view` ID.
    try {
      apiInstance.deleteSceneView(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling SceneViewsApi#deleteSceneView");
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
 **id** | [**UUID**](.md)| The &#x60;scene-view&#x60; ID. |

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

<a name="getSceneView"></a>
# **getSceneView**
> SceneView getSceneView(id)



Get a &#x60;scene-view&#x60; by ID.

### Example
```java
// Import classes:
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.Configuration;
import com.vertexvis.auth.*;
import com.vertexvis.models.*;
import com.vertexvis.api.SceneViewsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://platform.vertexvis.com");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    SceneViewsApi apiInstance = new SceneViewsApi(defaultClient);
    UUID id = new UUID(); // UUID | The `scene-view` ID.
    try {
      SceneView result = apiInstance.getSceneView(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SceneViewsApi#getSceneView");
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
 **id** | [**UUID**](.md)| The &#x60;scene-view&#x60; ID. |

### Return type

[**SceneView**](SceneView.md)

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

<a name="getViewSceneItem"></a>
# **getViewSceneItem**
> SceneViewItem getViewSceneItem(id, itemId, fieldsSceneItem, include)



Get a &#x60;scene-item&#x60; within a view by ID.

### Example
```java
// Import classes:
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.Configuration;
import com.vertexvis.auth.*;
import com.vertexvis.models.*;
import com.vertexvis.api.SceneViewsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://platform.vertexvis.com");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    SceneViewsApi apiInstance = new SceneViewsApi(defaultClient);
    UUID id = new UUID(); // UUID | The `scene-view` ID.
    UUID itemId = new UUID(); // UUID | The `scene-item` ID.
    String fieldsSceneItem = "created,suppliedId,visible,transform,materialOverride"; // String | Comma-separated list of fields to return in response. An empty value returns no fields. `boundingBox` is only returned if explicitly requested.
    String include = "sceneItemOverride"; // String | Comma-separated list of relationships to include in response.
    try {
      SceneViewItem result = apiInstance.getViewSceneItem(id, itemId, fieldsSceneItem, include);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SceneViewsApi#getViewSceneItem");
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
 **id** | [**UUID**](.md)| The &#x60;scene-view&#x60; ID. |
 **itemId** | [**UUID**](.md)| The &#x60;scene-item&#x60; ID. |
 **fieldsSceneItem** | **String**| Comma-separated list of fields to return in response. An empty value returns no fields. &#x60;boundingBox&#x60; is only returned if explicitly requested. | [optional]
 **include** | **String**| Comma-separated list of relationships to include in response. | [optional]

### Return type

[**SceneViewItem**](SceneViewItem.md)

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

<a name="renderSceneView"></a>
# **renderSceneView**
> File renderSceneView(id, height, width)



Get a rendered image of a &#x60;scene-view&#x60;. If a single pixel is returned, ensure the &#x60;scene&#x60; is in the &#x60;commit&#x60; state and contains scene items.

### Example
```java
// Import classes:
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.Configuration;
import com.vertexvis.auth.*;
import com.vertexvis.models.*;
import com.vertexvis.api.SceneViewsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://platform.vertexvis.com");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    SceneViewsApi apiInstance = new SceneViewsApi(defaultClient);
    UUID id = new UUID(); // UUID | The `scene-view` ID.
    Integer height = 1000; // Integer | The height of the image to render.
    Integer width = 1000; // Integer | The width of the image to render.
    try {
      File result = apiInstance.renderSceneView(id, height, width);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SceneViewsApi#renderSceneView");
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
 **id** | [**UUID**](.md)| The &#x60;scene-view&#x60; ID. |
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

<a name="updateSceneView"></a>
# **updateSceneView**
> SceneView updateSceneView(id, updateSceneViewRequest)



Update a &#x60;scene-view&#x60;.

### Example
```java
// Import classes:
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.Configuration;
import com.vertexvis.auth.*;
import com.vertexvis.models.*;
import com.vertexvis.api.SceneViewsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://platform.vertexvis.com");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    SceneViewsApi apiInstance = new SceneViewsApi(defaultClient);
    UUID id = new UUID(); // UUID | The `scene-view` ID.
    UpdateSceneViewRequest updateSceneViewRequest = new UpdateSceneViewRequest(); // UpdateSceneViewRequest | 
    try {
      SceneView result = apiInstance.updateSceneView(id, updateSceneViewRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SceneViewsApi#updateSceneView");
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
 **id** | [**UUID**](.md)| The &#x60;scene-view&#x60; ID. |
 **updateSceneViewRequest** | [**UpdateSceneViewRequest**](UpdateSceneViewRequest.md)|  |

### Return type

[**SceneView**](SceneView.md)

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

