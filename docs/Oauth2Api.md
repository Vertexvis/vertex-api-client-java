# Oauth2Api

All URIs are relative to *https://platform.vertexvis.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createToken**](Oauth2Api.md#createToken) | **POST** /oauth2/token | 
[**revokeToken**](Oauth2Api.md#revokeToken) | **POST** /oauth2/revoke | 


<a name="createToken"></a>
# **createToken**
> OAuth2Token createToken(grantType, scope)



Create an OAuth2 access token. For details, see our [Authentication](https://developer.vertexvis.com/docs/guides/authentication) guide.

### Example
```java
// Import classes:
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.Configuration;
import com.vertexvis.auth.*;
import com.vertexvis.models.*;
import com.vertexvis.api.Oauth2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://platform.vertexvis.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    Oauth2Api apiInstance = new Oauth2Api(defaultClient);
    String grantType = "grantType_example"; // String | 
    String scope = "scope_example"; // String | 
    try {
      OAuth2Token result = apiInstance.createToken(grantType, scope);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Oauth2Api#createToken");
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
 **grantType** | **String**|  |
 **scope** | **String**|  | [optional]

### Return type

[**OAuth2Token**](OAuth2Token.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/vnd.api+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Invalid or missing request. |  -  |

<a name="revokeToken"></a>
# **revokeToken**
> revokeToken(revokeOAuth2TokenRequest)



Revoke an OAuth2 access token.

### Example
```java
// Import classes:
import com.vertexvis.ApiClient;
import com.vertexvis.ApiException;
import com.vertexvis.Configuration;
import com.vertexvis.auth.*;
import com.vertexvis.models.*;
import com.vertexvis.api.Oauth2Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://platform.vertexvis.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    Oauth2Api apiInstance = new Oauth2Api(defaultClient);
    RevokeOAuth2TokenRequest revokeOAuth2TokenRequest = new RevokeOAuth2TokenRequest(); // RevokeOAuth2TokenRequest | 
    try {
      apiInstance.revokeToken(revokeOAuth2TokenRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling Oauth2Api#revokeToken");
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
 **revokeOAuth2TokenRequest** | [**RevokeOAuth2TokenRequest**](RevokeOAuth2TokenRequest.md)|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content |  -  |

