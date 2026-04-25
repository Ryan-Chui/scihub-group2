package controllers;

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

import static org.assertj.core.api.Assertions.assertThat;
import static play.mvc.Http.Status.BAD_REQUEST;
import static play.mvc.Http.Status.OK;
import static play.test.Helpers.POST;
import static play.test.Helpers.inMemoryDatabase;
import static play.test.Helpers.route;

public class RAJobControllerTest extends WithApplication {

    @Override
    protected Application provideApplication() {
        return play.test.Helpers.fakeApplication(inMemoryDatabase());
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
        assertThat(result).isNotNull();
        assertThat(result.status()).isEqualTo(OK);

        RAJobApplication updated = RAJobApplication.find.byId(application.getId());
        assertThat(updated.getStatus()).isEqualTo("pending");
        assertThat(updated.getInterviewSlot1()).isEqualTo("2026-05-01T10:00");
        assertThat(updated.getInterviewSlot2()).isNull();
        assertThat(updated.getInterviewSlot3()).isEqualTo("2026-05-02T14:30");
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
        assertThat(result).isNotNull();
        assertThat(result.status()).isEqualTo(BAD_REQUEST);
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
