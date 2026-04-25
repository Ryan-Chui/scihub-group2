package support;

import io.ebean.Ebean;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class RAJobTestHelper {

    private RAJobTestHelper() {
    }

    public static Map<String, Object> buildBackendTestConfig(String databaseName) {
        Map<String, Object> config = new HashMap<>();
        config.put("db.default.driver", "org.h2.Driver");
        config.put("db.default.url",
                "jdbc:h2:mem:" + databaseName + ";MODE=MySQL;DB_CLOSE_DELAY=-1;DATABASE_TO_LOWER=TRUE;NON_KEYWORDS=USER,YEAR,MONTH,DATE");
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
        config.put("play.evolutions.enabled", "false");
        config.put("play.evolutions.db.default.enabled", "false");
        config.put("aws.s3.bucketName", "test-bucket");
        config.put("aws.fileNamePrefix", "test-prefix/");
        return config;
    }

    public static void resetSchema() {
        Ebean.createSqlUpdate("drop table if exists mail_file").execute();
        Ebean.createSqlUpdate("drop table if exists mail").execute();
        Ebean.createSqlUpdate("drop table if exists rajob_application").execute();
        Ebean.createSqlUpdate("drop table if exists rajob").execute();
        Ebean.createSqlUpdate("drop table if exists user_participation_project").execute();
        Ebean.createSqlUpdate("drop table if exists project").execute();
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
                "create table project (" +
                        "id bigint auto_increment not null," +
                        "is_active varchar(255)," +
                        "parent_project_id bigint," +
                        "is_popular boolean not null," +
                        "popular_ranking bigint not null," +
                        "authentication varchar(255)," +
                        "access_times bigint not null," +
                        "next_image_index integer," +
                        "title varchar(255)," +
                        "technology varchar(255)," +
                        "pdf varchar(255)," +
                        "image_url varchar(255)," +
                        "goals varchar(255)," +
                        "video_url varchar(255)," +
                        "github_url varchar(255)," +
                        "team_page_url varchar(255)," +
                        "location varchar(255)," +
                        "description varchar(255)," +
                        "start_date varchar(255)," +
                        "end_date varchar(255)," +
                        "principal_investigator_id bigint," +
                        "sponsor_contact_id bigint," +
                        "principal_investigator_organization_id bigint," +
                        "sponsor_organization_id bigint," +
                        "constraint pk_project primary key (id))").execute();

        Ebean.createSqlUpdate(
                "create table user_participation_project (" +
                        "user_id bigint not null," +
                        "project_id bigint not null," +
                        "constraint pk_user_participation_project primary key (user_id, project_id))").execute();

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
                        "interview_slot1 varchar(255)," +
                        "interview_slot2 varchar(255)," +
                        "interview_slot3 varchar(255)," +
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
                "create table mail_file (" +
                        "mail_id bigint not null," +
                        "file_id bigint not null," +
                        "constraint pk_mail_file primary key (mail_id, file_id))").execute();
    }
}
