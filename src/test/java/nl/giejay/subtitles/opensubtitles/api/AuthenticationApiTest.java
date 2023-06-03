package nl.giejay.subtitles.opensubtitles.api;

import nl.giejay.subtitles.opensubtitles.ApiClient;
import nl.giejay.subtitles.opensubtitles.model.LoginRequest;
import org.junit.Before;
import org.junit.Test;

/**
 * API tests for AuthenticationApi
 */
public class AuthenticationApiTest {

    private AuthenticationApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(AuthenticationApi.class);
    }

    /**
     * Login
     *
     * Create a token to authenticate a user. If response code is &#x60;&#x60;&#x60;401 Unathorized&#x60;&#x60;&#x60; stop sending further requests with the same credentials.  Request rate limit is 1 request per 1 second.  Further API requests must continue on returned &#x60;&#x60;&#x60;base_url&#x60;&#x60;&#x60; host, which can have different cache time for search results and different request rate limits.
     */
    @Test
    public void loginTest() {
        String contentType = null;
        LoginRequest loginRequest = null;
        // Login200Response response = api.login(contentType, loginRequest);

        // TODO: test validations
    }
    /**
     * Logout
     *
     * Destroy a user token to end a session. Bearer token is required for this endpoint.
     */
    @Test
    public void logoutTest() {
        // Object response = api.logout();

        // TODO: test validations
    }
}
