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

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
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
        Map<String, Object> config = new HashMap<>();
        config.put("db.default.driver", "org.h2.Driver");
        config.put("db.default.url",
                "jdbc:h2:mem:play-rajob-notification;MODE=MySQL;DB_CLOSE_DELAY=-1;DATABASE_TO_LOWER=TRUE;NON_KEYWORDS=USER");
        config.put("db.default.username", "sa");
        config.put("db.default.password", "");
        config.put("ebean.default", Collections.singletonList("models.*"));
        config.put("system.mail.host", "localhost");
        config.put("system.mail.port", "25");
        config.put("system.mail.user", "");
        config.put("system.mail.password", "");
        config.put("system.mail.auth", "false");
        config.put("system.mail.starttls.enabled", "false");
        config.put("system.mail.ssl.enabled", "false");
        return fakeApplication(config);
    }

    @Before
    public void setUpSchemaAndData() {
        Ebean.createSqlUpdate("drop table if exists mail").execute();
        Ebean.createSqlUpdate("drop table if exists rajob_application").execute();
        Ebean.createSqlUpdate("drop table if exists rajob").execute();
        Ebean.createSqlUpdate("drop table if exists researcher_info").execute();
        Ebean.createSqlUpdate("drop table if exists student_info").execute();
        Ebean.createSqlUpdate("drop table if exists user").execute();

        Ebean.createSqlUpdate(
                "create table user (" +
                        "id bigint auto_increment not null," +
                        "user_name varchar(255)," +
                        "password varchar(255)," +
                        "first_name varchar(255)," +
                        "last_name varchar(255)," +
                        "middle_initial varchar(255)," +
                        "organization varchar(255)," +
                        "email varchar(255)," +
                        "mailing_address varchar(255)," +
                        "phone_number varchar(255)," +
                        "level varchar(255)," +
                        "rating double not null," +
                        "rating_count bigint not null," +
                        "recommend_rating double not null," +
                        "recommend_rating_count bigint not null," +
                        "homepage varchar(255)," +
                        "avatar varchar(255)," +
                        "service_provider boolean not null," +
                        "expertises varchar(255)," +
                        "categories varchar(255)," +
                        "detail varchar(255)," +
                        "user_type integer," +
                        "service_execution_counts bigint not null," +
                        "service_user boolean not null," +
                        "create_time varchar(255)," +
                        "is_active varchar(255)," +
                        "token varchar(255)," +
                        "project_zone_id bigint," +
                        "unread_mention boolean not null," +
                        "constraint pk_user primary key (id))").execute();

        Ebean.createSqlUpdate(
                "create table researcher_info (" +
                        "user_id bigint not null," +
                        "highest_degree varchar(255)," +
                        "orcid varchar(255)," +
                        "research_fields varchar(255)," +
                        "constraint pk_researcher_info primary key (user_id))").execute();

        Ebean.createSqlUpdate(
                "create table student_info (" +
                        "user_id bigint not null," +
                        "id_number varchar(255)," +
                        "student_year varchar(255)," +
                        "student_type varchar(255)," +
                        "major varchar(255)," +
                        "first_enroll_date varchar(255)," +
                        "constraint pk_student_info primary key (user_id))").execute();

        Ebean.createSqlUpdate(
                "create table rajob (" +
                        "id bigint auto_increment not null," +
                        "is_active varchar(255)," +
                        "pdf varchar(255)," +
                        "status varchar(255)," +
                        "title varchar(255)," +
                        "goals varchar(255)," +
                        "min_salary integer not null," +
                        "max_salary integer not null," +
                        "ra_types integer not null," +
                        "short_description varchar(255)," +
                        "long_description varchar(255)," +
                        "fields varchar(255)," +
                        "publish_date varchar(255)," +
                        "publish_year varchar(255)," +
                        "publish_month varchar(255)," +
                        "image_url varchar(255)," +
                        "url varchar(255)," +
                        "organization varchar(255)," +
                        "location varchar(255)," +
                        "required_expertise varchar(255)," +
                        "preferred_expertise varchar(255)," +
                        "number_of_positions varchar(255)," +
                        "expected_start_date varchar(255)," +
                        "expected_time_duration varchar(255)," +
                        "rajob_publisher_id bigint," +
                        "number_of_applicants integer not null," +
                        "create_time varchar(255)," +
                        "update_time varchar(255)," +
                        "constraint pk_rajob primary key (id))").execute();

        Ebean.createSqlUpdate(
                "create table rajob_application (" +
                        "id bigint auto_increment not null," +
                        "rajob_id bigint," +
                        "applicant_id bigint," +
                        "apply_headline varchar(255)," +
                        "apply_cover_letter varchar(255)," +
                        "referee1title varchar(255)," +
                        "referee1last_name varchar(255)," +
                        "referee1first_name varchar(255)," +
                        "referee1email varchar(255)," +
                        "referee1phone varchar(255)," +
                        "referee2title varchar(255)," +
                        "referee2last_name varchar(255)," +
                        "referee2first_name varchar(255)," +
                        "referee2email varchar(255)," +
                        "referee2phone varchar(255)," +
                        "referee3title varchar(255)," +
                        "referee3last_name varchar(255)," +
                        "referee3first_name varchar(255)," +
                        "referee3email varchar(255)," +
                        "referee3phone varchar(255)," +
                        "rating double not null," +
                        "rating_count bigint not null," +
                        "recommend_rating double not null," +
                        "recommend_rating_count bigint not null," +
                        "homepage varchar(255)," +
                        "avatar varchar(255)," +
                        "created_time varchar(255)," +
                        "is_active varchar(255)," +
                        "status varchar(255)," +
                        "constraint pk_rajob_application primary key (id))").execute();

        Ebean.createSqlUpdate(
                "create table mail (" +
                        "id bigint auto_increment not null," +
                        "title varchar(255)," +
                        "content clob," +
                        "timestamp timestamp," +
                        "sender_id bigint," +
                        "receiver_id bigint," +
                        "constraint pk_mail primary key (id))").execute();

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
    public void sendOfferEmailCreatesInAppNotificationForApplicant() {
        ObjectNode requestJson = Json.newObject();
        requestJson.put("rajobApplicationId", APPLICATION_ID);
        requestJson.put("ccSelected", "chair@smu.edu");

        Result result = route(app, fakeRequest("POST", "/rajob/offer").bodyJson(requestJson));

        assertThat(result).isNotNull();
        assertThat(result.status()).isEqualTo(OK);

        List<Mail> notifications = Mail.find.query()
                .where()
                .eq("receiver.id", STUDENT_ID)
                .findList();

        assertThat(notifications).hasSize(1);
        Mail notification = notifications.get(0);
        assertThat(notification.getSender().getId()).isEqualTo(PROFESSOR_ID);
        assertThat(notification.getTitle()).contains("AI Research Assistant");
        assertThat(notification.getContent()).contains("reviewed and approved");
    }

    @Test
    public void getReceivedMailsReturnsCreatedNotification() {
        ObjectNode requestJson = Json.newObject();
        requestJson.put("rajobApplicationId", APPLICATION_ID);
        requestJson.put("ccSelected", "");

        Result offerResult = route(app, fakeRequest("POST", "/rajob/offer").bodyJson(requestJson));
        assertThat(offerResult.status()).isEqualTo(OK);

        Result result = route(app, fakeRequest("GET", "/mail/received/" + STUDENT_ID));

        assertThat(result).isNotNull();
        assertThat(result.status()).isEqualTo(OK);

        JsonNode responseJson = Json.parse(contentAsString(result));
        assertThat(responseJson.isArray()).isTrue();
        assertThat(responseJson.size()).isEqualTo(1);
        assertThat(responseJson.get(0).get("title").asText()).contains("AI Research Assistant");
        assertThat(responseJson.get(0).get("content").asText()).contains("reserved for you for five days");
    }

    @Test
    public void getReceivedMailsReturnsErrorPayloadForUnknownUser() {
        Result result = route(app, fakeRequest("GET", "/mail/received/9999"));

        assertThat(result).isNotNull();
        assertThat(result.status()).isEqualTo(OK);
        assertThat(contentAsString(result)).contains("User not found");
    }
}
