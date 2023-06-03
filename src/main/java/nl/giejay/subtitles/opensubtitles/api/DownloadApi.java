package nl.giejay.subtitles.opensubtitles.api;

import nl.giejay.subtitles.opensubtitles.model.Download200Response;
import nl.giejay.subtitles.opensubtitles.model.DownloadRequest;

import retrofit2.Call;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface DownloadApi {
    /**
     * Download
     * Request a download url for a subtitle. Subtitle file in temporary URL will be always in UTF-8 encoding.  &lt;!-- theme: warning --&gt;  &gt; VERY IMPORTANT: In HTTP request must be both headers: &#x60;&#x60;&#x60;Api-Key&#x60;&#x60;&#x60; and &#x60;&#x60;&#x60;Authorization&#x60;&#x60;&#x60; stoplight.io doesn&#39;t allow to use in shown example both headers   &gt; The download count is calculated on this action, not the file download itself  &gt; IN and OUT FPS must be indicated for subtitle conversions, we want to make sure you know what you are doing, and therefore collected the current FPS from the subtitle search result, or calculated it somehow.  &lt;!-- theme: warning --&gt;  &gt; The download URL is temporary, and cannot be used more than 3 hours, so do not cache it, but you can download the file more than once if needed.
     *
     * @param body (optional)
     * @return Call&lt;Download200Response&gt;
     */
    @Headers({
            "Content-Type:application/json",
            "Accept:application/json"
    })
    @POST("download")
    Call<Download200Response> download(
            @retrofit2.http.Body DownloadRequest body
    );

}
