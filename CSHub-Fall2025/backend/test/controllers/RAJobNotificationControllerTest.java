package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.ebean.Ebean;
import models.Mail;
import org.junit.Before;
import org.junit.Test;
import play.Application;
import play.libs.Json;
import play.mvc.Result;
import play.test.Helpers;
import play.test.WithApplication;
import support.RAJobTestHelper;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static play.mvc.Http.Status.OK;
import static play.test.Helpers.contentAsString;
import static play.test.Helpers.fakeApplication;
import static play.test.Helpers.fakeRequest;
import static play.test.Helpers.route;

public class RAJobNotificationControllerTest extends WithApplication {

    private static final long PROFESSOR_ID = 1L;
    private static final long STUDENT_ID = 2L;
    private static final long RA_JOB_ID = 10L;
    private static final long APPLICATION_ID = 20L;

    @Override
    protected Application provideApplication() {
        return fakeApplication(RAJobTestHelper.buildBackendTestConfig("play-rajob-notification"));
    }

    @Before
    public void setUpSchemaAndData() {
        RAJobTestHelper.resetSchema();

        Ebean.createSqlUpdate(
                "insert into user (id, user_name, password, first_name, last_name, email, level, rating, rating_count, " +
                        "recommend_rating, recommend_rating_count, service_provider, service_execution_counts, service_user, unread_mention, is_active) " +
                        "values (" + PROFESSOR_ID + ", 'professorUser', 'secret', 'Ada', 'Professor', 'ada@smu.edu', 'normal', 0, 0, 0, 0, false, 0, false, false, 'True')")
                .execute();
        Ebean.createSqlUpdate(
                "insert into user (id, user_name, password, first_name, last_name, email, level, rating, rating_count, " +
                        "recommend_rating, recommend_rating_count, service_provider, service_execution_counts, service_user, unread_mention, is_active) " +
                        "values (" + STUDENT_ID + ", 'studentUser', 'secret', 'Sam', 'Student', 'sam@smu.edu', 'normal', 0, 0, 0, 0, false, 0, false, false, 'True')")
                .execute();

        Ebean.createSqlUpdate(
                "insert into rajob (id, status, title, min_salary, max_salary, ra_types, rajob_publisher_id, number_of_applicants) " +
                        "values (" + RA_JOB_ID + ", 'open', 'AI Research Assistant', 10, 20, 1, " + PROFESSOR_ID + ", 1)")
                .execute();

        Ebean.createSqlUpdate(
                "insert into rajob_application (id, rajob_id, applicant_id, apply_headline, apply_cover_letter, rating, rating_count, " +
                        "recommend_rating, recommend_rating_count, status) values (" +
                        APPLICATION_ID + ", " + RA_JOB_ID + ", " + STUDENT_ID + ", 'Interested in research', 'Please consider me', 0, 0, 0, 0, 'open')")
                .execute();
    }

    @Test
    public void updatingApplicationStatusCreatesInAppNotificationForApplicant() {
        ObjectNode requestJson = Json.newObject();
        requestJson.put("status", "pending");
        requestJson.put("interviewSlot1", "2026-05-01T10:00");
        requestJson.put("interviewSlot2", "");
        requestJson.put("interviewSlot3", "2026-05-02T14:30");

        Result result = route(app, fakeRequest("POST",
                "/rajob/updateRAjobApplicationStatus/" + APPLICATION_ID).bodyJson(requestJson));

        assertNotNull(result);
        assertEquals(OK, result.status());

        List<Mail> notifications = Mail.find.query()
                .where()
                .eq("receiver.id", STUDENT_ID)
                .findList();

        assertEquals(1, notifications.size());
        Mail notification = notifications.get(0);
        assertEquals(PROFESSOR_ID, notification.getSender().getId());
        assertTrue(notification.getTitle().contains("AI Research Assistant"));
        assertTrue(notification.getContent().contains("reviewed and approved"));
        assertTrue(notification.getContent().contains("1. 2026-05-01T10:00"));
        assertTrue(notification.getContent().contains("2. 2026-05-02T14:30"));
    }

    @Test
    public void getReceivedMailsReturnsCreatedNotification() {
        ObjectNode requestJson = Json.newObject();
        requestJson.put("status", "pending");
        requestJson.put("interviewSlot1", "2026-05-01T10:00");

        Result offerResult = route(app, fakeRequest("POST",
                "/rajob/updateRAjobApplicationStatus/" + APPLICATION_ID).bodyJson(requestJson));
        assertEquals(OK, offerResult.status());

        Result result = route(app, fakeRequest("GET", "/mail/received/" + STUDENT_ID));

        assertNotNull(result);
        assertEquals(OK, result.status());

        JsonNode responseJson = Json.parse(contentAsString(result));
        assertTrue(responseJson.isArray());
        assertEquals(1, responseJson.size());
        assertTrue(responseJson.get(0).get("title").asText().contains("AI Research Assistant"));
        assertTrue(responseJson.get(0).get("content").asText().contains("reserved for you for five days"));
        assertTrue(responseJson.get(0).get("content").asText().contains("2026-05-01T10:00"));
    }

    @Test
    public void getReceivedMailsReturnsErrorPayloadForUnknownUser() {
        Result result = route(app, fakeRequest("GET", "/mail/received/9999"));

        assertNotNull(result);
        assertEquals(OK, result.status());
        assertTrue(contentAsString(result).contains("User not found"));
    }
}
