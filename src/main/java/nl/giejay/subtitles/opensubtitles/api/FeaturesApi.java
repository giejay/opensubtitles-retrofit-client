package nl.giejay.subtitles.opensubtitles.api;

import retrofit2.Call;
import retrofit2.http.*;

import nl.giejay.subtitles.opensubtitles.model.Features200Response;

public interface FeaturesApi {
  /**
   * Search for features
   * With the \&quot;query\&quot; parameter, search for a Feature from a simple text input. Typically used for a text search or autocomplete.  With an ID, get basic information and subtitles count for a specific title.  &lt;!-- theme: warning --&gt;  &gt; ### Watch Out! &gt; &gt; If you create an autocomplete, don&#39;t set a too small refresh limit, remember you must not go over 40 requests per 10 seconds!
   * @param query query to search, release/file name accepted (optional)
   * @param type empty to list all or **movie**, **tvshow** or **episode**. (optional)
   * @param featureId opensubtitles **feature_id** (optional)
   * @param imdbId IMDB ID, delete leading zeroes (optional)
   * @param tmdbId TheMovieDB ID - combine with type to avoid errors (optional)
   * @param year Filter by year. Can only be used in combination with a query (optional)
   * @return Call&lt;Features200Response&gt;
   */
  @GET("features")
  Call<Features200Response> features(
    @retrofit2.http.Query("query") String query, @retrofit2.http.Query("type") String type, @retrofit2.http.Query("feature_id") Integer featureId, @retrofit2.http.Query("imdb_id") String imdbId, @retrofit2.http.Query("tmdb_id") String tmdbId, @retrofit2.http.Query("year") Integer year
  );

}
