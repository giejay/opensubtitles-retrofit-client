package nl.giejay.subtitles.opensubtitles.api;

import nl.giejay.subtitles.opensubtitles.ApiClient;
import nl.giejay.subtitles.opensubtitles.model.MostDownloaded200Response;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;

/**
 * API tests for DiscoverApi
 */
public class DiscoverApiTest {

    private DiscoverApi api;

    @Before
    public void setup() {
        api = new ApiClient("Api-Key").setApiKey(System.getProperty("API-KEY")).createService(DiscoverApi.class);
    }

    /**
     * Latest subtitles
     *
     * Lists 60 latest uploaded subtitles
     */
    @Test
    public void latestTest() {
        String languages = null;
        String type = null;
        // Latest200Response response = api.latest(languages, type);

        // TODO: test validations
    }
    /**
     * Most downloaded subtitles
     *
     * Discover popular subtitles, according to last 30 days downloads on opensubtitles.com. This list can be filtered by language code or feature type (movie, episode)
     */
    @Test
    @Ignore
    public void mostDownloadedTest() throws IOException {
        String languages = "en";
        String type = "movie";
         MostDownloaded200Response response = api.mostDownloaded(languages, type).execute().body();

        // TODO: test validations
    }
    /**
     * Popular features
     *
     * Discover popular features on opensubtitles.com, according to last 30 days downloads.
     */
    @Test
    public void popularTest() {
        String languages = null;
        String type = null;
        // Subtitle response = api.popular(languages, type);

        // TODO: test validations
    }
}
