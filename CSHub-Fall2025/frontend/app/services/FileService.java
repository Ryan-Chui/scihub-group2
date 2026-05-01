package services;

import play.mvc.*;
import java.io.File;
import com.fasterxml.jackson.databind.node.ObjectNode;

import com.typesafe.config.Config;
import javax.inject.Inject;
import play.mvc.Result;
import play.mvc.Results;
import play.Logger;
import com.fasterxml.jackson.databind.JsonNode;
import utils.RESTfulCalls;
import utils.Constants;
import play.libs.Json;

public class FileService {

    private final Config config;

    @Inject
    public FileService(Config config) {
        this.config = config;
    }
    public static String getUploadedFilePath(Http.MultipartFormData body, String fieldName, ObjectNode jsonData) {
        Http.MultipartFormData.FilePart<File> filePart = body.getFile(fieldName);
        if (filePart != null) {
            File file = filePart.getFile();
            if (file != null && file.length() > 0) {
                String filePath = file.getAbsolutePath();
                jsonData.put(fieldName, filePath);
            } else {
            }
        }
        return null;
    }

    public Boolean checkFile(String tableName, String fileType, String tableRecorderId) {
        try {
            String apiPath = Constants.CHECK_FILE + tableName + "/" + fileType + "/" + tableRecorderId;
            String fullUrl = RESTfulCalls.getBackendAPIUrl(config, apiPath);

            JsonNode response = RESTfulCalls.getAPI(fullUrl);
            if (response == null) {
                Logger.warn("checkFile: no response from backend for {}", fullUrl);
                return false;
            }
            if (response.has("error")) {
                Logger.warn("checkFile: backend reported error for {} -> {}", fullUrl, response.get("error"));
                return false;
            }

            if (response.has("dbRecord") && !response.get("dbRecord").isNull()) {
                return true;
            }
        } catch (Exception e) {
            Logger.warn("checkFile: failed for tableName={}, fileType={}, tableRecorderId={}: {}",
                    tableName, fileType, tableRecorderId, e.toString());
        }
        return false;
    }

    public JsonNode uploadFile(Http.MultipartFormData body,
                               String fieldName,
                               String tableName,
                               String fileType,
                               Long recordId) {
        Http.MultipartFormData.FilePart<File> part = body.getFile(fieldName);

        if (part == null || part.getFile() == null || part.getFile().length() == 0) {
            Logger.warn("uploadFile: No file uploaded or file is empty for field: " + fieldName);
            return null;
        }

        File file = part.getFile();

        String endpoint = Constants.FILE_UPLOAD_ENDPOINT
                + "/" + tableName
                + "/" + fileType
                + "/" + recordId;
        String url = RESTfulCalls.getBackendAPIUrl(config, endpoint);

        Logger.debug("uploadFile: Uploading file to URL: " + url);
        return RESTfulCalls.postAPIWithFile(url, file);
    }
}

