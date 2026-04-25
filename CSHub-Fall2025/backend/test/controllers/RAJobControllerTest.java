package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import models.Mail;
import models.RAJob;
import models.RAJobApplication;
import models.User;
import org.junit.Test;
import play.Application;
import play.libs.Json;
import play.mvc.Http;
import play.mvc.Result;
import play.test.WithApplication;
import support.RAJobTestHelper;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static play.mvc.Http.Status.BAD_REQUEST;
import static play.mvc.Http.Status.NOT_FOUND;
import static play.mvc.Http.Status.OK;
import static play.test.Helpers.POST;
import static play.test.Helpers.route;

public class RAJobControllerTest extends WithApplication {

    @Override
    protected Application provideApplication() {
        return play.test.Helpers.fakeApplication(RAJobTestHelper.buildBackendTestConfig("play-rajob-controller"));
    }

    @org.junit.Before
    public void setUpSchema() {
        RAJobTestHelper.resetSchema();
    }

    @Test
    public void giveRAJobOffertoStudentPersistsInterviewSlots() {
        RAJobApplication application = seedRAJobApplication();

        ObjectNode payload = Json.newObject();
        payload.put("status", "pending");
        payload.put("interviewSlot1", "2026-05-01T10:00");
        payload.put("interviewSlot2", "");
        payload.put("interviewSlot3", "2026-05-02T14:30");

        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(POST)
                .uri("/rajob/updateRAjobApplicationStatus/" + application.getId())
                .bodyJson(payload);

        Result result = route(app, request);
        assertNotNull(result);
        assertEquals(OK, result.status());

        RAJobApplication updated = RAJobApplication.find.byId(application.getId());
        assertEquals("pending", updated.getStatus());
        assertEquals("2026-05-01T10:00", updated.getInterviewSlot1());
        assertNull(updated.getInterviewSlot2());
        assertEquals("2026-05-02T14:30", updated.getInterviewSlot3());
    }

    @Test
    public void giveRAJobOffertoStudentRequiresStatusField() {
        RAJobApplication application = seedRAJobApplication();

        ObjectNode payload = Json.newObject();
        payload.put("interviewSlot1", "2026-05-01T10:00");

        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(POST)
                .uri("/rajob/updateRAjobApplicationStatus/" + application.getId())
                .bodyJson(payload);

        Result result = route(app, request);
        assertNotNull(result);
        assertEquals(BAD_REQUEST, result.status());
    }

    @Test
    public void giveRAJobOffertoStudentReturnsNotFoundForMissingApplication() {
        ObjectNode payload = Json.newObject();
        payload.put("status", "pending");

        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(POST)
                .uri("/rajob/updateRAjobApplicationStatus/999999")
                .bodyJson(payload);

        Result result = route(app, request);
        assertNotNull(result);
        assertEquals(NOT_FOUND, result.status());
    }

    @Test
    public void giveRAJobOffertoStudentTrimsAndNormalizesInterviewSlots() {
        RAJobApplication application = seedRAJobApplication();

        ObjectNode payload = Json.newObject();
        payload.put("status", "pending");
        payload.put("interviewSlot1", "   2026-05-01T10:00   ");
        payload.put("interviewSlot2", "   ");
        payload.put("interviewSlot3", "\n\t");

        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(POST)
                .uri("/rajob/updateRAjobApplicationStatus/" + application.getId())
                .bodyJson(payload);

        Result result = route(app, request);
        assertNotNull(result);
        assertEquals(OK, result.status());

        RAJobApplication updated = RAJobApplication.find.byId(application.getId());
        assertEquals("2026-05-01T10:00", updated.getInterviewSlot1());
        assertNull(updated.getInterviewSlot2());
        assertNull(updated.getInterviewSlot3());
    }

    @Test
    public void giveRAJobOffertoStudentCreatesPushNotificationWhenSlotsProvided() {
        RAJobApplication application = seedRAJobApplication();

        ObjectNode payload = Json.newObject();
        payload.put("status", "pending");
        payload.put("interviewSlot1", "2026-05-01T10:00");

        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(POST)
                .uri("/rajob/updateRAjobApplicationStatus/" + application.getId())
                .bodyJson(payload);

        Result result = route(app, request);
        assertNotNull(result);
        assertEquals(OK, result.status());

        List<Mail> notifications = Mail.find.query()
                .where()
                .eq("receiver.id", application.getApplicant().getId())
                .findList();
        assertEquals(1, notifications.size());
        assertEquals(
                "No-reply: Your [RA Position] Application Has Been Approved",
                notifications.get(0).getTitle()
        );
    }

    private RAJobApplication seedRAJobApplication() {
        User publisher = new User();
        publisher.setUserName("facultyUser");
        publisher.setEmail("faculty@example.com");
        publisher.setPassword("password");
        publisher.setIsActive("True");
        publisher.setLevel("normal");
        publisher.save();

        User applicant = new User();
        applicant.setUserName("studentUser");
        applicant.setEmail("student@example.com");
        applicant.setPassword("password");
        applicant.setIsActive("True");
        applicant.setLevel("normal");
        applicant.save();

        RAJob rajob = new RAJob();
        rajob.setTitle("RA Position");
        rajob.setStatus("open");
        rajob.setIsActive("True");
        rajob.setCreateTime("now");
        rajob.setUpdateTime("now");
        rajob.setRajobPublisher(publisher);
        rajob.save();

        RAJobApplication application = new RAJobApplication();
        application.setAppliedRAJob(rajob);
        application.setApplicant(applicant);
        application.setStatus("open");
        application.setIsActive("True");
        application.setCreatedTime("now");
        application.save();
        return application;
    }
}
