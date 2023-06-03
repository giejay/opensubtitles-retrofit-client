# InfosApi

All URIs are relative to *https://api.opensubtitles.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**formats**](InfosApi.md#formats) | **GET** infos/formats | Subtitle Formats |
| [**languages**](InfosApi.md#languages) | **GET** infos/languages | Languages |
| [**userinfo**](InfosApi.md#userinfo) | **GET** infos/user | User Informations |



## formats

> Formats200Response formats()

Subtitle Formats

List subtitle formats recognized by the API  

### Example

```java
// Import classes:

import nl.giejay.subtitles.opensubtitles.ApiClient;
import nl.giejay.subtitles.opensubtitles.ApiException;
import nl.giejay.subtitles.opensubtitles.Configuration;
import nl.giejay.subtitles.opensubtitles.auth.*;
import nl.giejay.subtitles.opensubtitles.models.*;
import nl.giejay.subtitles.opensubtitles.api.InfosApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.opensubtitles.com/api/v1");

        // Configure API key authorization: Api-Key
        ApiKeyAuth Api -Key = (ApiKeyAuth) defaultClient.getAuthentication("Api-Key");
        Api - Key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Key.setApiKeyPrefix("Token");

        InfosApi apiInstance = new InfosApi(defaultClient);
        try {
            Formats200Response result = apiInstance.formats();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InfosApi#formats");
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

[**Formats200Response**](Formats200Response.md)

### Authorization

[Api-Key](../README.md#Api-Key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, example


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## languages

> Languages200Response languages()

Languages

Get the languages information

### Example

```java
// Import classes:

import nl.giejay.subtitles.opensubtitles.ApiClient;
import nl.giejay.subtitles.opensubtitles.ApiException;
import nl.giejay.subtitles.opensubtitles.Configuration;
import nl.giejay.subtitles.opensubtitles.auth.*;
import nl.giejay.subtitles.opensubtitles.models.*;
import nl.giejay.subtitles.opensubtitles.api.InfosApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.opensubtitles.com/api/v1");

        // Configure API key authorization: Api-Key
        ApiKeyAuth Api -Key = (ApiKeyAuth) defaultClient.getAuthentication("Api-Key");
        Api - Key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Key.setApiKeyPrefix("Token");

        InfosApi apiInstance = new InfosApi(defaultClient);
        try {
            Languages200Response result = apiInstance.languages();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InfosApi#languages");
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

[**Languages200Response**](Languages200Response.md)

### Authorization

[Api-Key](../README.md#Api-Key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, example


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get the languages table containing the codes and names used through the API |  -  |


## userinfo

> Userinfo200Response userinfo()

User Informations

Gather informations about the user authenticated by a bearer token. User information are already sent when user is authenticated, and the remaining downloads is returned with each download, but you can also get these information here.

### Example

```java
// Import classes:

import nl.giejay.subtitles.opensubtitles.ApiClient;
import nl.giejay.subtitles.opensubtitles.ApiException;
import nl.giejay.subtitles.opensubtitles.Configuration;
import nl.giejay.subtitles.opensubtitles.auth.*;
import nl.giejay.subtitles.opensubtitles.models.*;
import nl.giejay.subtitles.opensubtitles.api.InfosApi;

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

        InfosApi apiInstance = new InfosApi(defaultClient);
        try {
            Userinfo200Response result = apiInstance.userinfo();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InfosApi#userinfo");
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

[**Userinfo200Response**](Userinfo200Response.md)

### Authorization

[Bearer](../README.md#Bearer), [Api-Key](../README.md#Api-Key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get user data |  -  |

