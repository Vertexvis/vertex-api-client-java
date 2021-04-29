# TranslationInspectionsApi

All URIs are relative to *https://platform.vertexvis.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTranslationInspection**](TranslationInspectionsApi.md#createTranslationInspection) | **POST** /translation-inspections | 
[**getInspectionJob**](TranslationInspectionsApi.md#getInspectionJob) | **GET** /translation-inspections/{id} | 
[**getQueuedTranslation**](TranslationInspectionsApi.md#getQueuedTranslation) | **GET** /queued-translations/{id} | 


<a name="createTranslationInspection"></a>
# **createTranslationInspection**
> TranslationInspectionJob createTranslationInspection(createTranslationInspectionRequest)



Create a &#x60;translation-inspection&#x60;.

### Example
```java
// Import classes:
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.Configuration;
import com.vertexvis.auth.*;
import com.vertexvis.models.*;
import com.vertexvis.api.TranslationInspectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://platform.vertexvis.com");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    TranslationInspectionsApi apiInstance = new TranslationInspectionsApi(defaultClient);
    CreateTranslationInspectionRequest createTranslationInspectionRequest = new CreateTranslationInspectionRequest(); // CreateTranslationInspectionRequest | 
    try {
      TranslationInspectionJob result = apiInstance.createTranslationInspection(createTranslationInspectionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationInspectionsApi#createTranslationInspection");
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
 **createTranslationInspectionRequest** | [**CreateTranslationInspectionRequest**](CreateTranslationInspectionRequest.md)|  |

### Return type

[**TranslationInspectionJob**](TranslationInspectionJob.md)

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

<a name="getInspectionJob"></a>
# **getInspectionJob**
> TranslationInspectionJob getInspectionJob(id)



Get a &#x60;translation-inspection&#x60; by ID.

### Example
```java
// Import classes:
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.Configuration;
import com.vertexvis.auth.*;
import com.vertexvis.models.*;
import com.vertexvis.api.TranslationInspectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://platform.vertexvis.com");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    TranslationInspectionsApi apiInstance = new TranslationInspectionsApi(defaultClient);
    UUID id = new UUID(); // UUID | The `translation-inspection` ID.
    try {
      TranslationInspectionJob result = apiInstance.getInspectionJob(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationInspectionsApi#getInspectionJob");
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
 **id** | [**UUID**](.md)| The &#x60;translation-inspection&#x60; ID. |

### Return type

[**TranslationInspectionJob**](TranslationInspectionJob.md)

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

<a name="getQueuedTranslation"></a>
# **getQueuedTranslation**
> QueuedJob getQueuedTranslation(id)



Get a &#x60;queued-translation&#x60;. The response is either the status if &#x60;running&#x60; or &#x60;error&#x60; or, upon completion, redirects to the created &#x60;part-revision&#x60;. Once created, create scenes via the createScene API. For details, see our [Render static scenes](https://developer.vertexvis.com/docs/guides/render-static-scenes) guide.

### Example
```java
// Import classes:
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.Configuration;
import com.vertexvis.auth.*;
import com.vertexvis.models.*;
import com.vertexvis.api.TranslationInspectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://platform.vertexvis.com");
    
    // Configure OAuth2 access token for authorization: OAuth2
    OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
    OAuth2.setAccessToken("YOUR ACCESS TOKEN");

    TranslationInspectionsApi apiInstance = new TranslationInspectionsApi(defaultClient);
    UUID id = new UUID(); // UUID | The `queued-translation` ID.
    try {
      QueuedJob result = apiInstance.getQueuedTranslation(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslationInspectionsApi#getQueuedTranslation");
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
 **id** | [**UUID**](.md)| The &#x60;queued-translation&#x60; ID. |

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

