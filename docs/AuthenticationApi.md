# AuthenticationApi

All URIs are relative to *https://api.opensubtitles.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**login**](AuthenticationApi.md#login) | **POST** login | Login |
| [**logout**](AuthenticationApi.md#logout) | **DELETE** logout | Logout |



## login

> Login200Response login(contentType, loginRequest)

Login

Create a token to authenticate a user. If response code is &#x60;&#x60;&#x60;401 Unathorized&#x60;&#x60;&#x60; stop sending further requests with the same credentials.  Request rate limit is 1 request per 1 second.  Further API requests must continue on returned &#x60;&#x60;&#x60;base_url&#x60;&#x60;&#x60; host, which can have different cache time for search results and different request rate limits.

### Example

```java
// Import classes:

import nl.giejay.subtitles.opensubtitles.ApiClient;
import nl.giejay.subtitles.opensubtitles.ApiException;
import nl.giejay.subtitles.opensubtitles.Configuration;
import nl.giejay.subtitles.opensubtitles.auth.*;
import nl.giejay.subtitles.opensubtitles.models.*;
import nl.giejay.subtitles.opensubtitles.api.AuthenticationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.opensubtitles.com/api/v1");

        // Configure API key authorization: Api-Key
        ApiKeyAuth Api -Key = (ApiKeyAuth) defaultClient.getAuthentication("Api-Key");
        Api - Key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Key.setApiKeyPrefix("Token");

        AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
        String contentType = "application/json"; // String | application/json
        LoginRequest loginRequest = new LoginRequest(); // LoginRequest | 
        try {
            Login200Response result = apiInstance.login(contentType, loginRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationApi#login");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **contentType** | **String**| application/json | [default to application/json] |
| **loginRequest** | [**LoginRequest**](LoginRequest.md)|  | [optional] |

### Return type

[**Login200Response**](Login200Response.md)

### Authorization

[Api-Key](../README.md#Api-Key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create session and token |  -  |


## logout

> Object logout()

Logout

Destroy a user token to end a session. Bearer token is required for this endpoint.

### Example

```java
// Import classes:

import nl.giejay.subtitles.opensubtitles.ApiClient;
import nl.giejay.subtitles.opensubtitles.ApiException;
import nl.giejay.subtitles.opensubtitles.Configuration;
import nl.giejay.subtitles.opensubtitles.auth.*;
import nl.giejay.subtitles.opensubtitles.models.*;
import nl.giejay.subtitles.opensubtitles.api.AuthenticationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.opensubtitles.com/api/v1");

        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        // Configure API key authorization: Api-Key
        ApiKeyAuth Api -Key = (ApiKeyAuth) defaultClient.getAuthentication("Api-Key");
        Api - Key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Key.setApiKeyPrefix("Token");

        AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
        try {
            Object result = apiInstance.logout();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationApi#logout");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[Bearer](../README.md#Bearer), [Api-Key](../README.md#Api-Key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Destroy session and current token |  -  |

