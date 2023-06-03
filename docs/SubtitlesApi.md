# SubtitlesApi

All URIs are relative to *https://api.opensubtitles.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**subtitles**](SubtitlesApi.md#subtitles) | **GET** subtitles | Search for subtitles |



## subtitles

> subtitles(id, imdbId, tmdbId, type, query, languages, moviehash, userId, hearingImpaired, foreignPartsOnly, trustedSources, machineTranslated, aiTranslated, orderBy, orderDirection, parentFeatureId, parentImdbId, parentTmdbId, seasonNumber, episodeNumber, year, moviehashMatch, page)

Search for subtitles

Find subtitle for a video file. All parameters can be combined following various logics: searching by a specific external id (imdb, tmdb), a file moviehash, or a simple text query.  &lt;!-- theme: warning --&gt; &gt; Something wrong? Read about [common mistakes and best practices](docs/2-Best-Practices.md).   &gt; Getting no results? Follow HTTP redirects! &#x60;&#x60;&#x60;curl --location&#x60;&#x60;&#x60; and use verbose mode   Implement the logic that best fit your needs, remembering that: - if you can get moviehash from file - send it - if you know the ID, IMDB or TMDB, send this rather than a query, an ID will always be more precise - if you search for TV show episodes, sending the parent ID, episode and season number will give best results - send the filename as &#x60;&#x60;&#x60;query&#x60;&#x60;&#x60; parameter together with the &#x60;&#x60;&#x60;moviehash&#x60;&#x60;&#x60; for better results. If your filenames are generally irrelevant, for example a dynamically generated filename from a streaming service, no need to send it. - you can combine all together (send everything what you have and we will take of rest)   &gt; Avoid http redirection by sending request parameters sorted and without default values, and send all queries in lowercase. Remove leading zeroes in ID parameters (IMDB ID, TMDB ID...)  ### Moviehash  If a &#x60;&#x60;&#x60;moviehash&#x60;&#x60;&#x60; is sent with a request, a &#x60;&#x60;&#x60;moviehash_match&#x60;&#x60;&#x60; boolean field will be added to the response.  The matching subtitles will always come first in the response.   ### Ordering You can order the results using the &#x60;&#x60;&#x60;order_by&#x60;&#x60;&#x60; parameter. Ordering is possible on the following fields: &#x60;&#x60;&#x60;language&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;download_count&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;new_download_count&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;hearing_impaired&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;hd&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;fps&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;votes&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;points&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;ratings&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;from_trusted&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;foreign_parts_only&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;ai_translated&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;machine_translated&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;upload_date&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;release&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;comments&#x60;&#x60;&#x60;  Change the order direction with *order_direction* (asc/desc)  ### Final notes &#x60;&#x60;&#x60;ai_translated&#x60;&#x60;&#x60; (default include in search results) subtitles should be much better quality than &#x60;&#x60;&#x60;machine_translated&#x60;&#x60;&#x60; subtitles (excluded in search results).  

### Example

```java
// Import classes:

import nl.giejay.subtitles.opensubtitles.ApiClient;
import nl.giejay.subtitles.opensubtitles.ApiException;
import nl.giejay.subtitles.opensubtitles.Configuration;
import nl.giejay.subtitles.opensubtitles.auth.*;
import nl.giejay.subtitles.opensubtitles.models.*;
import nl.giejay.subtitles.opensubtitles.api.SubtitlesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.opensubtitles.com/api/v1");

        // Configure API key authorization: Api-Key
        ApiKeyAuth Api -Key = (ApiKeyAuth) defaultClient.getAuthentication("Api-Key");
        Api - Key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Api-Key.setApiKeyPrefix("Token");

        SubtitlesApi apiInstance = new SubtitlesApi(defaultClient);
        Integer id = 56; // Integer | ID of the movie or episode
        Integer imdbId = 56; // Integer | IMDB ID of the movie or episode
        Integer tmdbId = 56; // Integer | TMDB ID of the movie or episode
        String type = "type_example"; // String | movie, episode or all, (default: all) 
        String query = "query_example"; // String | file name or text search
        String languages = "languages_example"; // String | Language code(s), coma separated (en,fr)
        String moviehash = "moviehash_example"; // String | Moviehash of the movie
        Integer userId = 56; // Integer | To be used alone - for user uploads listing
        String hearingImpaired = "hearingImpaired_example"; // String | include, exclude, only. (default: include)
        String foreignPartsOnly = "foreignPartsOnly_example"; // String | exclude, include, only (default: include)
        String trustedSources = "trustedSources_example"; // String | include, only (default: include)
        String machineTranslated = "machineTranslated_example"; // String | exclude, include  (default: exclude)
        String aiTranslated = "aiTranslated_example"; // String | exclude, include  (default: include)
        String orderBy = "orderBy_example"; // String | Order of the returned results, accept any of above fields
        String orderDirection = "orderDirection_example"; // String | Order direction of the returned results (asc,desc)
        Integer parentFeatureId = 56; // Integer | For Tvshows
        Integer parentImdbId = 56; // Integer | For Tvshows
        Integer parentTmdbId = 56; // Integer | For Tvshows
        Integer seasonNumber = 56; // Integer | For Tvshows 
        Integer episodeNumber = 56; // Integer | For Tvshows
        Integer year = 56; // Integer | Filter by movie/episode year
        String moviehashMatch = "moviehashMatch_example"; // String | include, only (default: include)
        Integer page = 56; // Integer | Results page to display
        try {
            apiInstance.subtitles(id, imdbId, tmdbId, type, query, languages, moviehash, userId, hearingImpaired, foreignPartsOnly, trustedSources, machineTranslated, aiTranslated, orderBy, orderDirection, parentFeatureId, parentImdbId, parentTmdbId, seasonNumber, episodeNumber, year, moviehashMatch, page);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubtitlesApi#subtitles");
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
| **id** | **Integer**| ID of the movie or episode | [optional] |
| **imdbId** | **Integer**| IMDB ID of the movie or episode | [optional] |
| **tmdbId** | **Integer**| TMDB ID of the movie or episode | [optional] |
| **type** | **String**| movie, episode or all, (default: all)  | [optional] |
| **query** | **String**| file name or text search | [optional] |
| **languages** | **String**| Language code(s), coma separated (en,fr) | [optional] |
| **moviehash** | **String**| Moviehash of the movie | [optional] |
| **userId** | **Integer**| To be used alone - for user uploads listing | [optional] |
| **hearingImpaired** | **String**| include, exclude, only. (default: include) | [optional] |
| **foreignPartsOnly** | **String**| exclude, include, only (default: include) | [optional] |
| **trustedSources** | **String**| include, only (default: include) | [optional] |
| **machineTranslated** | **String**| exclude, include  (default: exclude) | [optional] |
| **aiTranslated** | **String**| exclude, include  (default: include) | [optional] |
| **orderBy** | **String**| Order of the returned results, accept any of above fields | [optional] |
| **orderDirection** | **String**| Order direction of the returned results (asc,desc) | [optional] |
| **parentFeatureId** | **Integer**| For Tvshows | [optional] |
| **parentImdbId** | **Integer**| For Tvshows | [optional] |
| **parentTmdbId** | **Integer**| For Tvshows | [optional] |
| **seasonNumber** | **Integer**| For Tvshows  | [optional] |
| **episodeNumber** | **Integer**| For Tvshows | [optional] |
| **year** | **Integer**| Filter by movie/episode year | [optional] |
| **moviehashMatch** | **String**| include, only (default: include) | [optional] |
| **page** | **Integer**| Results page to display | [optional] |

### Return type

null (empty response body)

### Authorization

[Api-Key](../README.md#Api-Key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

