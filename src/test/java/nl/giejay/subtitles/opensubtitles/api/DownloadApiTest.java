package nl.giejay.subtitles.opensubtitles.api;

import nl.giejay.subtitles.opensubtitles.ApiClient;
import nl.giejay.subtitles.opensubtitles.model.DownloadRequest;
import org.junit.Before;
import org.junit.Test;

/**
 * API tests for DownloadApi
 */
public class DownloadApiTest {

    private DownloadApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(DownloadApi.class);
    }

    /**
     * Download
     *
     * Request a download url for a subtitle. Subtitle file in temporary URL will be always in UTF-8 encoding.  &lt;!-- theme: warning --&gt;  &gt; VERY IMPORTANT: In HTTP request must be both headers: &#x60;&#x60;&#x60;Api-Key&#x60;&#x60;&#x60; and &#x60;&#x60;&#x60;Authorization&#x60;&#x60;&#x60; stoplight.io doesn&#39;t allow to use in shown example both headers   &gt; The download count is calculated on this action, not the file download itself  &gt; IN and OUT FPS must be indicated for subtitle conversions, we want to make sure you know what you are doing, and therefore collected the current FPS from the subtitle search result, or calculated it somehow.  &lt;!-- theme: warning --&gt;  &gt; The download URL is temporary, and cannot be used more than 3 hours, so do not cache it, but you can download the file more than once if needed.
     */
    @Test
    public void downloadTest() {
        DownloadRequest body = null;
        // Download200Response response = api.download(body);

        // TODO: test validations
    }
}
