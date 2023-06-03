package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.model.Guessit200Response;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UtilitiesApi
 */
public class UtilitiesApiTest {

    private UtilitiesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(UtilitiesApi.class);
    }

    /**
     * Guessit
     *
     * Extracts as much information as possible from a video filename.  It has a very powerful matcher that allows to guess properties from a video using its filename only. This matcher works with both movies and tv shows episodes.  This is a simple implementation of the python guessit library. https://doc.guessit.io  Find examples of the returned data. https://doc.guessit.io/properties/
     */
    @Test
    public void guessitTest() {
        String filename = null;
        // Guessit200Response response = api.guessit(filename);

        // TODO: test validations
    }
}
