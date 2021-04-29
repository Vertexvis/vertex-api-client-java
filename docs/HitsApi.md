# HitsApi

All URIs are relative to *https://platform.vertexvis.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSceneHit**](HitsApi.md#createSceneHit) | **POST** /scenes/{id}/hits | 
[**createSceneViewHit**](HitsApi.md#createSceneViewHit) | **POST** /scene-views/{id}/hits | 


<a name="createSceneHit"></a>
# **createSceneHit**
> Hit createSceneHit(id, createHitRequest, include, fieldsPartRevision)



Create a &#x60;hit&#x60; for a &#x60;scene&#x60;.

### Example
```java
// Import classes:
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.Configuration;
import com.vertexvis.auth.*;
import com.vertexvis.models.*;
import com.vertexvis.api.HitsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://platform.vertexvis.com");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    HitsApi apiInstance = new HitsApi(defaultClient);
    UUID id = new UUID(); // UUID | The `scene` ID.
    CreateHitRequest createHitRequest = new CreateHitRequest(); // CreateHitRequest | 
    String include = "results.sceneItem.source"; // String | Comma-separated list of relationships to include in response.
    String fieldsPartRevision = "created,suppliedId"; // String | Comma-separated list of fields to return in response. An empty value returns no fields. Due to its potential size, metadata is only returned if explicitly requested.
    try {
      Hit result = apiInstance.createSceneHit(id, createHitRequest, include, fieldsPartRevision);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HitsApi#createSceneHit");
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
 **createHitRequest** | [**CreateHitRequest**](CreateHitRequest.md)|  |
 **include** | **String**| Comma-separated list of relationships to include in response. | [optional]
 **fieldsPartRevision** | **String**| Comma-separated list of fields to return in response. An empty value returns no fields. Due to its potential size, metadata is only returned if explicitly requested. | [optional]

### Return type

[**Hit**](Hit.md)

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

<a name="createSceneViewHit"></a>
# **createSceneViewHit**
> Hit createSceneViewHit(id, createHitRequest, include, fieldsPartRevision)



Create a &#x60;hit&#x60; for a &#x60;scene-view&#x60;.

### Example
```java
// Import classes:
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.Configuration;
import com.vertexvis.auth.*;
import com.vertexvis.models.*;
import com.vertexvis.api.HitsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://platform.vertexvis.com");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    HitsApi apiInstance = new HitsApi(defaultClient);
    UUID id = new UUID(); // UUID | The `scene-view` ID.
    CreateHitRequest createHitRequest = new CreateHitRequest(); // CreateHitRequest | 
    String include = "results.sceneItem.source"; // String | Comma-separated list of relationships to include in response.
    String fieldsPartRevision = "created,suppliedId"; // String | Comma-separated list of fields to return in response. An empty value returns no fields. Due to its potential size, metadata is only returned if explicitly requested.
    try {
      Hit result = apiInstance.createSceneViewHit(id, createHitRequest, include, fieldsPartRevision);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HitsApi#createSceneViewHit");
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
 **createHitRequest** | [**CreateHitRequest**](CreateHitRequest.md)|  |
 **include** | **String**| Comma-separated list of relationships to include in response. | [optional]
 **fieldsPartRevision** | **String**| Comma-separated list of fields to return in response. An empty value returns no fields. Due to its potential size, metadata is only returned if explicitly requested. | [optional]

### Return type

[**Hit**](Hit.md)

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

