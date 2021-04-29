# SceneItemOverridesApi

All URIs are relative to *https://platform.vertexvis.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSceneItemOverride**](SceneItemOverridesApi.md#createSceneItemOverride) | **POST** /scene-views/{id}/scene-item-overrides | 
[**deleteSceneItemOverride**](SceneItemOverridesApi.md#deleteSceneItemOverride) | **DELETE** /scene-item-overrides/{id} | 
[**getSceneItemOverrides**](SceneItemOverridesApi.md#getSceneItemOverrides) | **GET** /scene-views/{id}/scene-item-overrides | 
[**updateSceneItemOverride**](SceneItemOverridesApi.md#updateSceneItemOverride) | **PATCH** /scene-item-overrides/{id} | 


<a name="createSceneItemOverride"></a>
# **createSceneItemOverride**
> SceneItemOverride createSceneItemOverride(id, createSceneItemOverrideRequest)



Create a &#x60;scene-item-override&#x60; for a &#x60;scene-view&#x60;.

### Example
```java
// Import classes:
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.Configuration;
import com.vertexvis.auth.*;
import com.vertexvis.models.*;
import com.vertexvis.api.SceneItemOverridesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://platform.vertexvis.com");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    SceneItemOverridesApi apiInstance = new SceneItemOverridesApi(defaultClient);
    UUID id = new UUID(); // UUID | The `scene-view` ID.
    CreateSceneItemOverrideRequest createSceneItemOverrideRequest = new CreateSceneItemOverrideRequest(); // CreateSceneItemOverrideRequest | 
    try {
      SceneItemOverride result = apiInstance.createSceneItemOverride(id, createSceneItemOverrideRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SceneItemOverridesApi#createSceneItemOverride");
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
 **createSceneItemOverrideRequest** | [**CreateSceneItemOverrideRequest**](CreateSceneItemOverrideRequest.md)|  |

### Return type

[**SceneItemOverride**](SceneItemOverride.md)

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

<a name="deleteSceneItemOverride"></a>
# **deleteSceneItemOverride**
> deleteSceneItemOverride(id)



Delete a &#x60;scene-item-override&#x60;.

### Example
```java
// Import classes:
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.Configuration;
import com.vertexvis.auth.*;
import com.vertexvis.models.*;
import com.vertexvis.api.SceneItemOverridesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://platform.vertexvis.com");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    SceneItemOverridesApi apiInstance = new SceneItemOverridesApi(defaultClient);
    UUID id = new UUID(); // UUID | The `scene-item-override` ID.
    try {
      apiInstance.deleteSceneItemOverride(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling SceneItemOverridesApi#deleteSceneItemOverride");
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
 **id** | [**UUID**](.md)| The &#x60;scene-item-override&#x60; ID. |

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

<a name="getSceneItemOverrides"></a>
# **getSceneItemOverrides**
> SceneItemOverrideList getSceneItemOverrides(id)



Get &#x60;scene-item-overrides&#x60; for a &#x60;scene-view&#x60;.

### Example
```java
// Import classes:
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.Configuration;
import com.vertexvis.auth.*;
import com.vertexvis.models.*;
import com.vertexvis.api.SceneItemOverridesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://platform.vertexvis.com");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    SceneItemOverridesApi apiInstance = new SceneItemOverridesApi(defaultClient);
    UUID id = new UUID(); // UUID | The `scene-view` ID.
    try {
      SceneItemOverrideList result = apiInstance.getSceneItemOverrides(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SceneItemOverridesApi#getSceneItemOverrides");
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

[**SceneItemOverrideList**](SceneItemOverrideList.md)

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

<a name="updateSceneItemOverride"></a>
# **updateSceneItemOverride**
> SceneItemOverride updateSceneItemOverride(id, updateSceneItemOverrideRequest)



Update a &#x60;scene-item-override&#x60;.

### Example
```java
// Import classes:
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.Configuration;
import com.vertexvis.auth.*;
import com.vertexvis.models.*;
import com.vertexvis.api.SceneItemOverridesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://platform.vertexvis.com");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    SceneItemOverridesApi apiInstance = new SceneItemOverridesApi(defaultClient);
    UUID id = new UUID(); // UUID | The `scene-item-override` ID.
    UpdateSceneItemOverrideRequest updateSceneItemOverrideRequest = new UpdateSceneItemOverrideRequest(); // UpdateSceneItemOverrideRequest | 
    try {
      SceneItemOverride result = apiInstance.updateSceneItemOverride(id, updateSceneItemOverrideRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SceneItemOverridesApi#updateSceneItemOverride");
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
 **id** | [**UUID**](.md)| The &#x60;scene-item-override&#x60; ID. |
 **updateSceneItemOverrideRequest** | [**UpdateSceneItemOverrideRequest**](UpdateSceneItemOverrideRequest.md)|  |

### Return type

[**SceneItemOverride**](SceneItemOverride.md)

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

