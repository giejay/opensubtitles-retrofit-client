package org.openapitools.client.api;

import org.openapitools.client.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.openapitools.client.model.Formats200Response;
import org.openapitools.client.model.Languages200Response;
import org.openapitools.client.model.Userinfo200Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
