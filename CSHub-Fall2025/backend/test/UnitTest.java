import akka.actor.ActorSystem;
import controllers.AsyncController;
import controllers.CountController;
import org.junit.Test;
import play.mvc.Result;
import scala.concurrent.ExecutionContextExecutor;
import org.junit.Ignore;

import java.util.concurrent.CompletionStage;

import static org.junit.Assert.assertEquals;
import static play.test.Helpers.contentAsString;

/**
 * Unit testing does not require Play application start up.
 *
 * https://www.playframework.com/documentation/latest/JavaTest
 */
public class UnitTest {
@Ignore
    @Test
    public void simpleCheck() {
        int a = 1 + 1;
        assertEquals(2, a);
    }

    // Unit test a controller
    @Ignore
    @Test
    public void testCount() {
        final CountController controller = new CountController(() -> 49);
        Result result = controller.count();
        assertEquals("49", contentAsString(result));
    }

    // Unit test a controller with async return
    @Ignore
    @Test
    public void testAsync() {
        final ActorSystem actorSystem = ActorSystem.create("test");
        try {
            final ExecutionContextExecutor ec = actorSystem.dispatcher();
            final AsyncController controller = new AsyncController(actorSystem, ec);
            final CompletionStage<Result> future = controller.message();

            assertEquals("Hi!", contentAsString(future.toCompletableFuture().join()));
        } finally {
            actorSystem.terminate();
        }
    }

}
