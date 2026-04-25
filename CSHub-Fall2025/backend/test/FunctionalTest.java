import org.junit.Test;
import play.test.WithApplication;
import play.twirl.api.Content;
import org.junit.Ignore;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * A functional test starts a Play application for every test.
 *
 * https://www.playframework.com/documentation/latest/JavaFunctionalTest
 */
public class FunctionalTest extends WithApplication {
    @Ignore
    @Test
    public void renderTemplate() {
        // If you are calling out to Assets, then you must instantiate an application
        // because it makes use of assets metadata that is configured from
        // the application.

        Content html = views.html.index.render("Your new application is ready.");
        assertEquals("text/html", html.contentType());
        assertTrue(html.body().contains("Your new application is ready."));
    }
}
