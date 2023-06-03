package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.model.Features200Response;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FeaturesApi
 */
public class FeaturesApiTest {

    private FeaturesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(FeaturesApi.class);
    }

    /**
     * Search for features
     *
     * With the \&quot;query\&quot; parameter, search for a Feature from a simple text input. Typically used for a text search or autocomplete.  With an ID, get basic information and subtitles count for a specific title.  &lt;!-- theme: warning --&gt;  &gt; ### Watch Out! &gt; &gt; If you create an autocomplete, don&#39;t set a too small refresh limit, remember you must not go over 40 requests per 10 seconds!
     */
    @Test
    public void featuresTest() {
        String query = null;
        String type = null;
        Integer featureId = null;
        String imdbId = null;
        String tmdbId = null;
        Integer year = null;
        // Features200Response response = api.features(query, type, featureId, imdbId, tmdbId, year);

        // TODO: test validations
    }
}
