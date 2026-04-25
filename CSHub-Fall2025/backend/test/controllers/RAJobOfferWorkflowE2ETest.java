package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static play.mvc.Http.Status.OK;
import static play.test.Helpers.GET;
import static play.test.Helpers.POST;
import static play.test.Helpers.contentAsString;
import static play.test.Helpers.route;

public class RAJobOfferWorkflowE2ETest extends WithApplication {

    @Override
    protected Application provideApplication() {
        return play.test.Helpers.fakeApplication(RAJobTestHelper.buildBackendTestConfig("play-rajob-e2e"));
    }

    @org.junit.Before
    public void setUpSchema() {
        RAJobTestHelper.resetSchema();
    }

    @Test
    public void facultyOfferWorkflowUpdatesAndFetchesInterviewSlots() {
        RAJobApplication application = seedRAJobApplication();

        ObjectNode updatePayload = Json.newObject();
        updatePayload.put("status", "pending");
        updatePayload.put("interviewSlot1", " 2026-05-01T10:00 ");
        updatePayload.put("interviewSlot2", " ");
        updatePayload.put("interviewSlot3", "2026-05-02T14:30");

        Http.RequestBuilder updateRequest = new Http.RequestBuilder()
                .method(POST)
                .uri("/rajob/updateRAjobApplicationStatus/" + application.getId())
                .bodyJson(updatePayload);

        Result updateResult = route(app, updateRequest);
        assertNotNull(updateResult);
        assertEquals(OK, updateResult.status());

        Http.RequestBuilder detailRequest = new Http.RequestBuilder()
                .method(GET)
                .uri("/rajob/rajobApplicationDetail/" + application.getId());

        Result detailResult = route(app, detailRequest);
        assertNotNull(detailResult);
        assertEquals(OK, detailResult.status());

        JsonNode detailJson = Json.parse(contentAsString(detailResult));
        assertEquals("pending", detailJson.path("status").asText());
        assertEquals("2026-05-01T10:00", detailJson.path("interviewSlot1").asText());
        assertTrue(detailJson.has("interviewSlot2"));
        assertTrue(detailJson.get("interviewSlot2").isNull());
        assertEquals("2026-05-02T14:30", detailJson.path("interviewSlot3").asText());

        Http.RequestBuilder notificationsRequest = new Http.RequestBuilder()
                .method(GET)
                .uri("/mail/received/" + application.getApplicant().getId());

        Result notificationsResult = route(app, notificationsRequest);
        assertNotNull(notificationsResult);
        assertEquals(OK, notificationsResult.status());

        JsonNode notificationsJson = Json.parse(contentAsString(notificationsResult));
        assertEquals(1, notificationsJson.size());
        assertTrue(notificationsJson.get(0).path("content").asText().contains("2026-05-01T10:00"));
    }

    private RAJobApplication seedRAJobApplication() {
        User publisher = new User();
        publisher.setUserName("facultyUserE2E");
        publisher.setEmail("faculty-e2e@example.com");
        publisher.setPassword("password");
        publisher.setIsActive("True");
        publisher.setLevel("normal");
        publisher.save();

        User applicant = new User();
        applicant.setUserName("studentUserE2E");
        applicant.setEmail("student-e2e@example.com");
        applicant.setPassword("password");
        applicant.setIsActive("True");
        applicant.setLevel("normal");
        applicant.save();

        RAJob rajob = new RAJob();
        rajob.setTitle("RA Position E2E");
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
