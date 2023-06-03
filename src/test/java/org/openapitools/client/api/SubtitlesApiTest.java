package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SubtitlesApi
 */
public class SubtitlesApiTest {

    private SubtitlesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SubtitlesApi.class);
    }

    /**
     * Search for subtitles
     *
     * Find subtitle for a video file. All parameters can be combined following various logics: searching by a specific external id (imdb, tmdb), a file moviehash, or a simple text query.  &lt;!-- theme: warning --&gt; &gt; Something wrong? Read about [common mistakes and best practices](docs/2-Best-Practices.md).   &gt; Getting no results? Follow HTTP redirects! &#x60;&#x60;&#x60;curl --location&#x60;&#x60;&#x60; and use verbose mode   Implement the logic that best fit your needs, remembering that: - if you can get moviehash from file - send it - if you know the ID, IMDB or TMDB, send this rather than a query, an ID will always be more precise - if you search for TV show episodes, sending the parent ID, episode and season number will give best results - send the filename as &#x60;&#x60;&#x60;query&#x60;&#x60;&#x60; parameter together with the &#x60;&#x60;&#x60;moviehash&#x60;&#x60;&#x60; for better results. If your filenames are generally irrelevant, for example a dynamically generated filename from a streaming service, no need to send it. - you can combine all together (send everything what you have and we will take of rest)   &gt; Avoid http redirection by sending request parameters sorted and without default values, and send all queries in lowercase. Remove leading zeroes in ID parameters (IMDB ID, TMDB ID...)  ### Moviehash  If a &#x60;&#x60;&#x60;moviehash&#x60;&#x60;&#x60; is sent with a request, a &#x60;&#x60;&#x60;moviehash_match&#x60;&#x60;&#x60; boolean field will be added to the response.  The matching subtitles will always come first in the response.   ### Ordering You can order the results using the &#x60;&#x60;&#x60;order_by&#x60;&#x60;&#x60; parameter. Ordering is possible on the following fields: &#x60;&#x60;&#x60;language&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;download_count&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;new_download_count&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;hearing_impaired&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;hd&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;fps&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;votes&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;points&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;ratings&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;from_trusted&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;foreign_parts_only&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;ai_translated&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;machine_translated&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;upload_date&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;release&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;comments&#x60;&#x60;&#x60;  Change the order direction with *order_direction* (asc/desc)  ### Final notes &#x60;&#x60;&#x60;ai_translated&#x60;&#x60;&#x60; (default include in search results) subtitles should be much better quality than &#x60;&#x60;&#x60;machine_translated&#x60;&#x60;&#x60; subtitles (excluded in search results).  
     */
    @Test
    public void subtitlesTest() {
        Integer id = null;
        Integer imdbId = null;
        Integer tmdbId = null;
        String type = null;
        String query = null;
        String languages = null;
        String moviehash = null;
        Integer userId = null;
        String hearingImpaired = null;
        String foreignPartsOnly = null;
        String trustedSources = null;
        String machineTranslated = null;
        String aiTranslated = null;
        String orderBy = null;
        String orderDirection = null;
        Integer parentFeatureId = null;
        Integer parentImdbId = null;
        Integer parentTmdbId = null;
        Integer seasonNumber = null;
        Integer episodeNumber = null;
        Integer year = null;
        String moviehashMatch = null;
        Integer page = null;
        // api.subtitles(id, imdbId, tmdbId, type, query, languages, moviehash, userId, hearingImpaired, foreignPartsOnly, trustedSources, machineTranslated, aiTranslated, orderBy, orderDirection, parentFeatureId, parentImdbId, parentTmdbId, seasonNumber, episodeNumber, year, moviehashMatch, page);

        // TODO: test validations
    }
}
