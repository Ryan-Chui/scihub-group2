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

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static play.mvc.Http.Status.BAD_REQUEST;
import static play.mvc.Http.Status.NOT_FOUND;
import static play.mvc.Http.Status.OK;
import static play.test.Helpers.POST;
import static play.test.Helpers.GET;
import static play.test.Helpers.contentAsString;
import static play.test.Helpers.inMemoryDatabase;
import static play.test.Helpers.route;

public class RAJobControllerTest extends WithApplication {

    @Override
    protected Application provideApplication() {
        System.setProperty("config.file", new File("test/resources/test-constants.conf").getAbsolutePath());
        Map<String, String> config = new HashMap<>(inMemoryDatabase());
        config.put("db.default.url", "jdbc:h2:mem:play;MODE=MySQL;DATABASE_TO_LOWER=TRUE;DB_CLOSE_DELAY=-1");
        config.put("db.default.user", "sa");
        config.put("db.default.username", "sa");
        config.put("db.default.password", "");
        config.put("ebean.default", "models.*");
        config.put("play.evolutions.enabled", "true");
        config.put("play.evolutions.db.default.enabled", "true");
        config.put("play.evolutions.db.default.autoApply", "true");
        config.put("aws.s3.bucketName", "test-bucket");
        config.put("aws.fileNamePrefix", "test");
        config.put("system.aws.access-key", "test");
        config.put("system.aws.secret-access-key", "test");
        config.put("system.aws.region", "us-east-1");
        config.put("system.aws.bucket", "test-bucket");
        return play.test.Helpers.fakeApplication(config);
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

    @Test
    public void giveRAJobOffertoStudentReturnsNotFoundForMissingApplication() {
        ObjectNode payload = Json.newObject();
        payload.put("status", "pending");

        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(POST)
                .uri("/rajob/updateRAjobApplicationStatus/999999")
                .bodyJson(payload);

        Result result = route(app, request);
        assertThat(result).isNotNull();
        assertThat(result.status()).isEqualTo(NOT_FOUND);
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
        assertThat(result).isNotNull();
        assertThat(result.status()).isEqualTo(OK);

        RAJobApplication updated = RAJobApplication.find.byId(application.getId());
        assertThat(updated.getInterviewSlot1()).isEqualTo("2026-05-01T10:00");
        assertThat(updated.getInterviewSlot2()).isNull();
        assertThat(updated.getInterviewSlot3()).isNull();
    }

    @Test
    public void facultyCalendarReturnsScheduledInterviewsForFacultyJobs() {
        RAJobApplication application = seedRAJobApplication();
        application.setStatus("pending");
        application.setInterviewSlot1("2026-05-01T10:00");
        application.update();

        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(GET)
                .uri("/rajob/interviewCalendar/" + application.getAppliedRAJob().getRajobPublisher().getId());

        Result result = route(app, request);
        assertThat(result).isNotNull();
        assertThat(result.status()).isEqualTo(OK);
        assertThat(contentAsString(result)).contains("RA Position");
        assertThat(contentAsString(result)).contains("student@example.com");
        assertThat(contentAsString(result)).contains("2026-05-01T10:00");
    }

    @Test
    public void rescheduleRAInterviewUpdatesStatusAndInterviewTime() {
        RAJobApplication application = seedRAJobApplication();
        application.setStatus("pending");
        application.setInterviewSlot1("2026-05-01T10:00");
        application.update();

        ObjectNode payload = Json.newObject();
        payload.put("interviewTime", "2026-05-03T09:15");
        payload.put("note", "Please use the Teams link from the original message.");

        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(POST)
                .uri("/rajob/interview/" + application.getId() + "/reschedule")
                .bodyJson(payload);

        Result result = route(app, request);
        assertThat(result).isNotNull();
        assertThat(result.status()).isEqualTo(OK);

        RAJobApplication updated = RAJobApplication.find.byId(application.getId());
        assertThat(updated.getStatus()).isEqualTo("rescheduled");
        assertThat(updated.getInterviewSlot1()).isEqualTo("2026-05-03T09:15");
        assertThat(updated.getInterviewSlot2()).isNull();
        assertThat(updated.getInterviewSlot3()).isNull();
    }

    @Test
    public void cancelRAInterviewUpdatesStatus() {
        RAJobApplication application = seedRAJobApplication();
        application.setStatus("pending");
        application.setInterviewSlot1("2026-05-01T10:00");
        application.update();

        ObjectNode payload = Json.newObject();
        payload.put("note", "Position has been filled.");

        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(POST)
                .uri("/rajob/interview/" + application.getId() + "/cancel")
                .bodyJson(payload);

        Result result = route(app, request);
        assertThat(result).isNotNull();
        assertThat(result.status()).isEqualTo(OK);

        RAJobApplication updated = RAJobApplication.find.byId(application.getId());
        assertThat(updated.getStatus()).isEqualTo("canceled");
        assertThat(updated.getInterviewSlot1()).isEqualTo("2026-05-01T10:00");
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
