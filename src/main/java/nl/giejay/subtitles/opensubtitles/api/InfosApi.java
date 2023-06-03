package nl.giejay.subtitles.opensubtitles.api;

import retrofit2.Call;
import retrofit2.http.*;

import nl.giejay.subtitles.opensubtitles.model.Formats200Response;
import nl.giejay.subtitles.opensubtitles.model.Languages200Response;
import nl.giejay.subtitles.opensubtitles.model.Userinfo200Response;

public interface InfosApi {
  /**
   * Subtitle Formats
   * List subtitle formats recognized by the API
   * @return Call&lt;Formats200Response&gt;
   */
  @GET("infos/formats")
  Call<Formats200Response> formats();


  /**
   * Languages
   * Get the languages information
   * @return Call&lt;Languages200Response&gt;
   */
  @GET("infos/languages")
  Call<Languages200Response> languages();


  /**
   * User Informations
   * Gather informations about the user authenticated by a bearer token. User information are already sent when user is authenticated, and the remaining downloads is returned with each download, but you can also get these information here.
   * @return Call&lt;Userinfo200Response&gt;
   */
  @GET("infos/user")
  Call<Userinfo200Response> userinfo();


}
