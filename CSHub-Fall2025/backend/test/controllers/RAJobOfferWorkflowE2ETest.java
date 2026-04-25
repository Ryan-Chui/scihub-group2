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

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static play.mvc.Http.Status.OK;
import static play.test.Helpers.GET;
import static play.test.Helpers.POST;
import static play.test.Helpers.contentAsString;
import static play.test.Helpers.fakeApplication;
import static play.test.Helpers.inMemoryDatabase;
import static play.test.Helpers.route;

public class RAJobOfferWorkflowE2ETest extends WithApplication {

    @Override
    protected Application provideApplication() {
        Map<String, String> config = new HashMap<>(inMemoryDatabase());
        config.put("db.default.url", "jdbc:h2:mem:play;MODE=MySQL;DATABASE_TO_LOWER=TRUE;DB_CLOSE_DELAY=-1");
        config.put("play.evolutions.enabled", "true");
        config.put("play.evolutions.db.default.enabled", "true");
        config.put("play.evolutions.db.default.autoApply", "true");
        return fakeApplication(config);
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
        assertThat(updateResult).isNotNull();
        assertThat(updateResult.status()).isEqualTo(OK);

        Http.RequestBuilder detailRequest = new Http.RequestBuilder()
                .method(GET)
                .uri("/rajob/rajobApplicationDetail/" + application.getId());

        Result detailResult = route(app, detailRequest);
        assertThat(detailResult).isNotNull();
        assertThat(detailResult.status()).isEqualTo(OK);

        JsonNode detailJson = Json.parse(contentAsString(detailResult));
        assertThat(detailJson.path("status").asText()).isEqualTo("pending");
        assertThat(detailJson.path("interviewSlot1").asText()).isEqualTo("2026-05-01T10:00");
        assertThat(detailJson.has("interviewSlot2")).isTrue();
        assertThat(detailJson.get("interviewSlot2").isNull()).isTrue();
        assertThat(detailJson.path("interviewSlot3").asText()).isEqualTo("2026-05-02T14:30");
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
