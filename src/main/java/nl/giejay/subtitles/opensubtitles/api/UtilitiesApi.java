package nl.giejay.subtitles.opensubtitles.api;

import retrofit2.Call;
import retrofit2.http.*;

import nl.giejay.subtitles.opensubtitles.model.Guessit200Response;

public interface UtilitiesApi {
  /**
   * Guessit
   * Extracts as much information as possible from a video filename.  It has a very powerful matcher that allows to guess properties from a video using its filename only. This matcher works with both movies and tv shows episodes.  This is a simple implementation of the python guessit library. https://doc.guessit.io  Find examples of the returned data. https://doc.guessit.io/properties/
   * @param filename File name (optional)
   * @return Call&lt;Guessit200Response&gt;
   */
  @GET("utilities/guessit")
  Call<Guessit200Response> guessit(
    @retrofit2.http.Query("filename") String filename
  );

}
