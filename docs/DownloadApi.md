# DownloadApi

All URIs are relative to *https://api.opensubtitles.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**download**](DownloadApi.md#download) | **POST** download | Download |



## download

> Download200Response download(body)

Download

Request a download url for a subtitle. Subtitle file in temporary URL will be always in UTF-8 encoding.  &lt;!-- theme: warning --&gt;  &gt; VERY IMPORTANT: In HTTP request must be both headers: &#x60;&#x60;&#x60;Api-Key&#x60;&#x60;&#x60; and &#x60;&#x60;&#x60;Authorization&#x60;&#x60;&#x60; stoplight.io doesn&#39;t allow to use in shown example both headers   &gt; The download count is calculated on this action, not the file download itself  &gt; IN and OUT FPS must be indicated for subtitle conversions, we want to make sure you know what you are doing, and therefore collected the current FPS from the subtitle search result, or calculated it somehow.  &lt;!-- theme: warning --&gt;  &gt; The download URL is temporary, and cannot be used more than 3 hours, so do not cache it, but you can download the file more than once if needed.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DownloadApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.opensubtitles.com/api/v1");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        // Configure API key authorization: Api-Key
        ApiKeyAuth Api-Key = (ApiKeyAuth) defaultClient.getAuthentication("Api-Key");
        Api-Key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Key.setApiKeyPrefix("Token");

        DownloadApi apiInstance = new DownloadApi(defaultClient);
        DownloadRequest body = new DownloadRequest(); // DownloadRequest | 
        try {
            Download200Response result = apiInstance.download(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DownloadApi#download");
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
| **body** | [**DownloadRequest**](DownloadRequest.md)|  | [optional] |

### Return type

[**Download200Response**](Download200Response.md)

### Authorization

[Bearer](../README.md#Bearer), [Api-Key](../README.md#Api-Key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Request a download URL for a subtitle.   |  -  |

