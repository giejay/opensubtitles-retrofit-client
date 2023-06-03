package nl.giejay.subtitles.opensubtitles.api;

import nl.giejay.subtitles.opensubtitles.ApiClient;
import org.junit.Before;
import org.junit.Test;

/**
 * API tests for InfosApi
 */
public class InfosApiTest {

    private InfosApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(InfosApi.class);
    }

    /**
     * Subtitle Formats
     *
     * List subtitle formats recognized by the API
     */
    @Test
    public void formatsTest() {
        // Formats200Response response = api.formats();

        // TODO: test validations
    }
    /**
     * Languages
     *
     * Get the languages information
     */
    @Test
    public void languagesTest() {
        // Languages200Response response = api.languages();

        // TODO: test validations
    }
    /**
     * User Informations
     *
     * Gather informations about the user authenticated by a bearer token. User information are already sent when user is authenticated, and the remaining downloads is returned with each download, but you can also get these information here.
     */
    @Test
    public void userinfoTest() {
        // Userinfo200Response response = api.userinfo();

        // TODO: test validations
    }
}
