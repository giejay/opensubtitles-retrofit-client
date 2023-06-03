package nl.giejay.subtitles.opensubtitles.api;

import nl.giejay.subtitles.opensubtitles.model.SubtitleResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface SubtitlesApi {
  /**
   * Search for subtitles
   * Find subtitle for a video file. All parameters can be combined following various logics: searching by a specific external id (imdb, tmdb), a file moviehash, or a simple text query.  &lt;!-- theme: warning --&gt; &gt; Something wrong? Read about [common mistakes and best practices](docs/2-Best-Practices.md).   &gt; Getting no results? Follow HTTP redirects! &#x60;&#x60;&#x60;curl --location&#x60;&#x60;&#x60; and use verbose mode   Implement the logic that best fit your needs, remembering that: - if you can get moviehash from file - send it - if you know the ID, IMDB or TMDB, send this rather than a query, an ID will always be more precise - if you search for TV show episodes, sending the parent ID, episode and season number will give best results - send the filename as &#x60;&#x60;&#x60;query&#x60;&#x60;&#x60; parameter together with the &#x60;&#x60;&#x60;moviehash&#x60;&#x60;&#x60; for better results. If your filenames are generally irrelevant, for example a dynamically generated filename from a streaming service, no need to send it. - you can combine all together (send everything what you have and we will take of rest)   &gt; Avoid http redirection by sending request parameters sorted and without default values, and send all queries in lowercase. Remove leading zeroes in ID parameters (IMDB ID, TMDB ID...)  ### Moviehash  If a &#x60;&#x60;&#x60;moviehash&#x60;&#x60;&#x60; is sent with a request, a &#x60;&#x60;&#x60;moviehash_match&#x60;&#x60;&#x60; boolean field will be added to the response.  The matching subtitles will always come first in the response.   ### Ordering You can order the results using the &#x60;&#x60;&#x60;order_by&#x60;&#x60;&#x60; parameter. Ordering is possible on the following fields: &#x60;&#x60;&#x60;language&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;download_count&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;new_download_count&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;hearing_impaired&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;hd&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;fps&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;votes&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;points&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;ratings&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;from_trusted&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;foreign_parts_only&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;ai_translated&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;machine_translated&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;upload_date&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;release&#x60;&#x60;&#x60;, &#x60;&#x60;&#x60;comments&#x60;&#x60;&#x60;  Change the order direction with *order_direction* (asc/desc)  ### Final notes &#x60;&#x60;&#x60;ai_translated&#x60;&#x60;&#x60; (default include in search results) subtitles should be much better quality than &#x60;&#x60;&#x60;machine_translated&#x60;&#x60;&#x60; subtitles (excluded in search results).
   * @param id ID of the movie or episode (optional)
   * @param imdbId IMDB ID of the movie or episode (optional)
   * @param tmdbId TMDB ID of the movie or episode (optional)
   * @param type movie, episode or all, (default: all)  (optional)
   * @param query file name or text search (optional)
   * @param languages Language code(s), coma separated (en,fr) (optional)
   * @param moviehash Moviehash of the movie (optional)
   * @param userId To be used alone - for user uploads listing (optional)
   * @param hearingImpaired include, exclude, only. (default: include) (optional)
   * @param foreignPartsOnly exclude, include, only (default: include) (optional)
   * @param trustedSources include, only (default: include) (optional)
   * @param machineTranslated exclude, include  (default: exclude) (optional)
   * @param aiTranslated exclude, include  (default: include) (optional)
   * @param orderBy Order of the returned results, accept any of above fields (optional)
   * @param orderDirection Order direction of the returned results (asc,desc) (optional)
   * @param parentFeatureId For Tvshows (optional)
   * @param parentImdbId For Tvshows (optional)
   * @param parentTmdbId For Tvshows (optional)
   * @param seasonNumber For Tvshows  (optional)
   * @param episodeNumber For Tvshows (optional)
   * @param year Filter by movie/episode year (optional)
   * @param moviehashMatch include, only (default: include) (optional)
   * @param page Results page to display (optional)
   * @return Call&lt;Void&gt;
   */
  @GET("subtitles")
  Call<SubtitleResponse> subtitles(
    @retrofit2.http.Query("query") String query, @retrofit2.http.Query("languages") String languages, @retrofit2.http.Query("moviehash") String moviehash, @retrofit2.http.Query("season_number") Integer seasonNumber, @retrofit2.http.Query("episode_number") Integer episodeNumber, @retrofit2.http.Query("year") Integer year, @retrofit2.http.Query("page") Integer page
  );

}
