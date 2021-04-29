# SceneAlterationsApi

All URIs are relative to *https://platform.vertexvis.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSceneAlteration**](SceneAlterationsApi.md#createSceneAlteration) | **POST** /scene-views/{id}/scene-alterations | 
[**getQueuedSceneAlteration**](SceneAlterationsApi.md#getQueuedSceneAlteration) | **GET** /queued-scene-alterations/{id} | 
[**getSceneAlteration**](SceneAlterationsApi.md#getSceneAlteration) | **GET** /scene-alterations/{id} | 
[**getSceneAlterations**](SceneAlterationsApi.md#getSceneAlterations) | **GET** /scene-views/{id}/scene-alterations | 


<a name="createSceneAlteration"></a>
# **createSceneAlteration**
> QueuedJob createSceneAlteration(id, createSceneAlterationRequest)



Create a &#x60;scene-alteration&#x60; for a &#x60;scene-view&#x60;.

### Example
```java
// Import classes:
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.Configuration;
import com.vertexvis.auth.*;
import com.vertexvis.models.*;
import com.vertexvis.api.SceneAlterationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://platform.vertexvis.com");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    SceneAlterationsApi apiInstance = new SceneAlterationsApi(defaultClient);
    UUID id = new UUID(); // UUID | The `scene-view` ID.
    CreateSceneAlterationRequest createSceneAlterationRequest = new CreateSceneAlterationRequest(); // CreateSceneAlterationRequest | 
    try {
      QueuedJob result = apiInstance.createSceneAlteration(id, createSceneAlterationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SceneAlterationsApi#createSceneAlteration");
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
 **createSceneAlterationRequest** | [**CreateSceneAlterationRequest**](CreateSceneAlterationRequest.md)|  |

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

<a name="getQueuedSceneAlteration"></a>
# **getQueuedSceneAlteration**
> QueuedJob getQueuedSceneAlteration(id)



Get a &#x60;queued-scene-alteration&#x60; by ID.

### Example
```java
// Import classes:
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.Configuration;
import com.vertexvis.auth.*;
import com.vertexvis.models.*;
import com.vertexvis.api.SceneAlterationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://platform.vertexvis.com");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    SceneAlterationsApi apiInstance = new SceneAlterationsApi(defaultClient);
    UUID id = new UUID(); // UUID | The `queued-scene-alteration` ID.
    try {
      QueuedJob result = apiInstance.getQueuedSceneAlteration(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SceneAlterationsApi#getQueuedSceneAlteration");
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
 **id** | [**UUID**](.md)| The &#x60;queued-scene-alteration&#x60; ID. |

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

<a name="getSceneAlteration"></a>
# **getSceneAlteration**
> SceneAlteration getSceneAlteration(id)



Get a &#x60;scene-alteration&#x60; by ID.

### Example
```java
// Import classes:
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.Configuration;
import com.vertexvis.auth.*;
import com.vertexvis.models.*;
import com.vertexvis.api.SceneAlterationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://platform.vertexvis.com");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    SceneAlterationsApi apiInstance = new SceneAlterationsApi(defaultClient);
    UUID id = new UUID(); // UUID | The `scene-alteration` ID.
    try {
      SceneAlteration result = apiInstance.getSceneAlteration(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SceneAlterationsApi#getSceneAlteration");
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
 **id** | [**UUID**](.md)| The &#x60;scene-alteration&#x60; ID. |

### Return type

[**SceneAlteration**](SceneAlteration.md)

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

<a name="getSceneAlterations"></a>
# **getSceneAlterations**
> SceneAlterationList getSceneAlterations(id)



Get &#x60;scene-alterations&#x60; for a &#x60;scene-view&#x60;.

### Example
```java
// Import classes:
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.Configuration;
import com.vertexvis.auth.*;
import com.vertexvis.models.*;
import com.vertexvis.api.SceneAlterationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://platform.vertexvis.com");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    SceneAlterationsApi apiInstance = new SceneAlterationsApi(defaultClient);
    UUID id = new UUID(); // UUID | The `scene-view` ID.
    try {
      SceneAlterationList result = apiInstance.getSceneAlterations(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SceneAlterationsApi#getSceneAlterations");
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

[**SceneAlterationList**](SceneAlterationList.md)

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

