# UtilitiesApi

All URIs are relative to *https://api.opensubtitles.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**guessit**](UtilitiesApi.md#guessit) | **GET** utilities/guessit | Guessit |



## guessit

> Guessit200Response guessit(filename)

Guessit

Extracts as much information as possible from a video filename.  It has a very powerful matcher that allows to guess properties from a video using its filename only. This matcher works with both movies and tv shows episodes.  This is a simple implementation of the python guessit library. https://doc.guessit.io  Find examples of the returned data. https://doc.guessit.io/properties/

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UtilitiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.opensubtitles.com/api/v1");
        
        // Configure API key authorization: Api-Key
        ApiKeyAuth Api-Key = (ApiKeyAuth) defaultClient.getAuthentication("Api-Key");
        Api-Key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Key.setApiKeyPrefix("Token");

        UtilitiesApi apiInstance = new UtilitiesApi(defaultClient);
        String filename = "filename_example"; // String | File name
        try {
            Guessit200Response result = apiInstance.guessit(filename);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UtilitiesApi#guessit");
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
| **filename** | **String**| File name | [optional] |

### Return type

[**Guessit200Response**](Guessit200Response.md)

### Authorization

[Api-Key](../README.md#Api-Key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

