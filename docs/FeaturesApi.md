# FeaturesApi

All URIs are relative to *https://api.opensubtitles.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**features**](FeaturesApi.md#features) | **GET** features | Search for features |



## features

> Features200Response features(query, type, featureId, imdbId, tmdbId, year)

Search for features

With the \&quot;query\&quot; parameter, search for a Feature from a simple text input. Typically used for a text search or autocomplete.  With an ID, get basic information and subtitles count for a specific title.  &lt;!-- theme: warning --&gt;  &gt; ### Watch Out! &gt; &gt; If you create an autocomplete, don&#39;t set a too small refresh limit, remember you must not go over 40 requests per 10 seconds!

### Example

```java
// Import classes:

import nl.giejay.subtitles.opensubtitles.ApiClient;
import nl.giejay.subtitles.opensubtitles.ApiException;
import nl.giejay.subtitles.opensubtitles.Configuration;
import nl.giejay.subtitles.opensubtitles.auth.*;
import nl.giejay.subtitles.opensubtitles.models.*;
import nl.giejay.subtitles.opensubtitles.api.FeaturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.opensubtitles.com/api/v1");

        // Configure API key authorization: Api-Key
        ApiKeyAuth Api -Key = (ApiKeyAuth) defaultClient.getAuthentication("Api-Key");
        Api - Key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Key.setApiKeyPrefix("Token");

        FeaturesApi apiInstance = new FeaturesApi(defaultClient);
        String query = "query_example"; // String | query to search, release/file name accepted
        String type = "type_example"; // String | empty to list all or **movie**, **tvshow** or **episode**.
        Integer featureId = 56; // Integer | opensubtitles **feature_id**
        String imdbId = "imdbId_example"; // String | IMDB ID, delete leading zeroes
        String tmdbId = "tmdbId_example"; // String | TheMovieDB ID - combine with type to avoid errors
        Integer year = 56; // Integer | Filter by year. Can only be used in combination with a query
        try {
            Features200Response result = apiInstance.features(query, type, featureId, imdbId, tmdbId, year);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FeaturesApi#features");
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
| **query** | **String**| query to search, release/file name accepted | [optional] |
| **type** | **String**| empty to list all or **movie**, **tvshow** or **episode**. | [optional] |
| **featureId** | **Integer**| opensubtitles **feature_id** | [optional] |
| **imdbId** | **String**| IMDB ID, delete leading zeroes | [optional] |
| **tmdbId** | **String**| TheMovieDB ID - combine with type to avoid errors | [optional] |
| **year** | **Integer**| Filter by year. Can only be used in combination with a query | [optional] |

### Return type

[**Features200Response**](Features200Response.md)

### Authorization

[Api-Key](../README.md#Api-Key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, example


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Search for a feature |  -  |

