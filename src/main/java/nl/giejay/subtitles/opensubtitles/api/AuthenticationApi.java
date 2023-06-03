package nl.giejay.subtitles.opensubtitles.api;

import retrofit2.Call;
import retrofit2.http.*;

import nl.giejay.subtitles.opensubtitles.model.Login200Response;
import nl.giejay.subtitles.opensubtitles.model.LoginRequest;

public interface AuthenticationApi {
  /**
   * Login
   * Create a token to authenticate a user. If response code is &#x60;&#x60;&#x60;401 Unathorized&#x60;&#x60;&#x60; stop sending further requests with the same credentials.  Request rate limit is 1 request per 1 second.  Further API requests must continue on returned &#x60;&#x60;&#x60;base_url&#x60;&#x60;&#x60; host, which can have different cache time for search results and different request rate limits.
   * @param contentType application/json (required)
   * @param loginRequest  (optional)
   * @return Call&lt;Login200Response&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("login")
  Call<Login200Response> login(
    @retrofit2.http.Header("Content-Type") String contentType, @retrofit2.http.Body LoginRequest loginRequest
  );

  /**
   * Logout
   * Destroy a user token to end a session. Bearer token is required for this endpoint.
   * @return Call&lt;Object&gt;
   */
  @DELETE("logout")
  Call<Object> logout();


}
