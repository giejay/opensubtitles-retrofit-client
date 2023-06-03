# DiscoverApi

All URIs are relative to *https://api.opensubtitles.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**latest**](DiscoverApi.md#latest) | **GET** discover/latest | Latest subtitles |
| [**mostDownloaded**](DiscoverApi.md#mostDownloaded) | **GET** discover/most_downloaded | Most downloaded subtitles |
| [**popular**](DiscoverApi.md#popular) | **GET** discover/popular | Popular features |



## latest

> Latest200Response latest(languages, type)

Latest subtitles

Lists 60 latest uploaded subtitles

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DiscoverApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.opensubtitles.com/api/v1");
        
        // Configure API key authorization: Api-Key
        ApiKeyAuth Api-Key = (ApiKeyAuth) defaultClient.getAuthentication("Api-Key");
        Api-Key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Key.setApiKeyPrefix("Token");

        DiscoverApi apiInstance = new DiscoverApi(defaultClient);
        String languages = "languages_example"; // String | Language code(s), coma separated (en,fr) or \"all\"
        String type = "type_example"; // String | Type (movie or tvshow)
        try {
            Latest200Response result = apiInstance.latest(languages, type);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DiscoverApi#latest");
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
| **languages** | **String**| Language code(s), coma separated (en,fr) or \&quot;all\&quot; | [optional] |
| **type** | **String**| Type (movie or tvshow) | [optional] |

### Return type

[**Latest200Response**](Latest200Response.md)

### Authorization

[Api-Key](../README.md#Api-Key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, example


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## mostDownloaded

> MostDownloaded200Response mostDownloaded(languages, type)

Most downloaded subtitles

Discover popular subtitles, according to last 30 days downloads on opensubtitles.com. This list can be filtered by language code or feature type (movie, episode)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DiscoverApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.opensubtitles.com/api/v1");
        
        // Configure API key authorization: Api-Key
        ApiKeyAuth Api-Key = (ApiKeyAuth) defaultClient.getAuthentication("Api-Key");
        Api-Key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Key.setApiKeyPrefix("Token");

        DiscoverApi apiInstance = new DiscoverApi(defaultClient);
        String languages = "languages_example"; // String | Language code(s), coma separated (en,fr), or \"all\"
        String type = "type_example"; // String | Type (movie or tvshow)
        try {
            MostDownloaded200Response result = apiInstance.mostDownloaded(languages, type);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DiscoverApi#mostDownloaded");
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
| **languages** | **String**| Language code(s), coma separated (en,fr), or \&quot;all\&quot; | [optional] |
| **type** | **String**| Type (movie or tvshow) | [optional] |

### Return type

[**MostDownloaded200Response**](MostDownloaded200Response.md)

### Authorization

[Api-Key](../README.md#Api-Key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, example


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Lists most downloaded movie subtitles  |  -  |


## popular

> Subtitle popular(languages, type)

Popular features

Discover popular features on opensubtitles.com, according to last 30 days downloads.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DiscoverApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.opensubtitles.com/api/v1");
        
        // Configure API key authorization: Api-Key
        ApiKeyAuth Api-Key = (ApiKeyAuth) defaultClient.getAuthentication("Api-Key");
        Api-Key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Key.setApiKeyPrefix("Token");

        DiscoverApi apiInstance = new DiscoverApi(defaultClient);
        String languages = "languages_example"; // String | Language code(s), coma separated (en,fr) or \"all\"
        String type = "type_example"; // String | Type (movie or tvshow)
        try {
            Subtitle result = apiInstance.popular(languages, type);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DiscoverApi#popular");
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
| **languages** | **String**| Language code(s), coma separated (en,fr) or \&quot;all\&quot; | [optional] |
| **type** | **String**| Type (movie or tvshow) | [optional] |

### Return type

[**Subtitle**](Subtitle.md)

### Authorization

[Api-Key](../README.md#Api-Key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

