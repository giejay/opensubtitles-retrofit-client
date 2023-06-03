package org.openapitools.client.api;

import org.openapitools.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.openapitools.client.model.Latest200Response;
import org.openapitools.client.model.MostDownloaded200Response;
import org.openapitools.client.model.Subtitle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface DiscoverApi {
  /**
   * Latest subtitles
   * Lists 60 latest uploaded subtitles
   * @param languages Language code(s), coma separated (en,fr) or \&quot;all\&quot; (optional)
   * @param type Type (movie or tvshow) (optional)
   * @return Call&lt;Latest200Response&gt;
   */
  @GET("discover/latest")
  Call<Latest200Response> latest(
    @retrofit2.http.Query("languages") String languages, @retrofit2.http.Query("type") String type
  );

  /**
   * Most downloaded subtitles
   * Discover popular subtitles, according to last 30 days downloads on opensubtitles.com. This list can be filtered by language code or feature type (movie, episode)
   * @param languages Language code(s), coma separated (en,fr), or \&quot;all\&quot; (optional)
   * @param type Type (movie or tvshow) (optional)
   * @return Call&lt;MostDownloaded200Response&gt;
   */
  @GET("discover/most_downloaded")
  Call<MostDownloaded200Response> mostDownloaded(
    @retrofit2.http.Query("languages") String languages, @retrofit2.http.Query("type") String type
  );

  /**
   * Popular features
   * Discover popular features on opensubtitles.com, according to last 30 days downloads.
   * @param languages Language code(s), coma separated (en,fr) or \&quot;all\&quot; (optional)
   * @param type Type (movie or tvshow) (optional)
   * @return Call&lt;Subtitle&gt;
   */
  @GET("discover/popular")
  Call<Subtitle> popular(
    @retrofit2.http.Query("languages") String languages, @retrofit2.http.Query("type") String type
  );

}
