package models;

import com.fasterxml.jackson.databind.JsonNode;
import play.libs.Json;

import java.util.ArrayList;
import java.util.List;

public class Mail {
    private long id;
    private String title;
    private String content;
    private String timestamp;
    private User sender;
    private User receiver;

    public static Mail deserialize(JsonNode json) throws Exception {
        if (json == null || json.isNull()) {
            throw new NullPointerException("Mail node should not be null.");
        }
        return Json.fromJson(json, Mail.class);
    }

    public static List<Mail> deserializeJsonToMailList(JsonNode mailsJson) throws Exception {
        List<Mail> mails = new ArrayList<>();
        if (mailsJson == null || !mailsJson.isArray()) {
            return mails;
        }
        for (JsonNode mailJson : mailsJson) {
            mails.add(deserialize(mailJson));
        }
        return mails;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }
}
