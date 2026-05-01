package services;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.typesafe.config.Config;
import controllers.routes;
import models.RAJob;
import models.User;
import play.Logger;
import play.data.Form;
import play.libs.Json;
import play.mvc.Http;
import play.mvc.Result;
import utils.Constants;
import utils.RESTfulCalls;
import views.html.rajobList;

import javax.inject.Inject;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static play.mvc.Controller.session;
import static play.mvc.Results.ok;
import static play.mvc.Results.redirect;
import static utils.Common.beginIndexForPagination;
import static utils.Common.endIndexForPagination;

/**
 * This class intends to provide support for RAJobController.
 */
public class RAJobService {
    @Inject
    Config config;

    private final UserService userService;
    private Form<RAJob> RAJobForm;

    @Inject
    public RAJobService(UserService userService) {
        this.userService = userService;
    }


    /**
     * This method intends to get RAJob by id by calling backend APIs.
     *
     * @param rajobId
     * @return RAJob
     */
    public RAJob getRAJobById(Long rajobId) {
        RAJob rajob = null;

        try {
            JsonNode response = RESTfulCalls.getAPI(RESTfulCalls.getBackendAPIUrl(config,
                    Constants.GET_RAJOB_BY_ID + rajobId));
            if (response == null || response.has("error")) {
                Logger.debug("RAJobService.getRAJobById() did not get RA job from backend with error.");
                return null;
            }

            rajob = RAJob.deserialize(response);
        } catch (Exception e) {
            Logger.debug("RAJobService.getRAJobById() exception: " + e.toString());
            return null;
        }
        return rajob;
    }


    /**
     * This method intends to save a pdf to RA job.
     *
     * @param body
     * @param rajobId: RA job id
     * @throws Exception
     */
    public void savePDFToRAJob(Http.MultipartFormData body, Long rajobId) throws Exception {
        try {
            if (body.getFile("pdf") != null) {
                Http.MultipartFormData.FilePart pdf = body.getFile("pdf");
                if (pdf != null && !pdf.getFilename().equals("")) {
                    File file = (File) pdf.getFile();
                    JsonNode pdfResponse = RESTfulCalls.postAPIWithFile(RESTfulCalls.getBackendAPIUrl(config,
                            Constants.SET_RAJOB_PDF + rajobId), file);
                }
            }
        } catch (Exception e) {
            Logger.debug("RAJobService.savePDFToJob exception: " + e.toString());
            throw e;
        }
    }


    /************************************************ Page Render Preparation ******************************************/
    /**
     * This private method renders the RA job list page.
     * Note that for performance consideration, the backend only passes back the RA jobs for the needed page stored in
     * the RAJobListJsonNode, together with the offset/count/total/sortCriteria information.
     *
     * @param rajobListJsonNode
     * @param pageLimit
     * @param searchBody
     * @param listType          : "all"; "search" (draw this page from list function or from search function)
     * @param username
     * @param userId
     * @return render challenge list page; If exception happened then render the homepage
     */
    public Result renderRAJobListPage(JsonNode rajobListJsonNode,
                                      int pageLimit,
                                      String searchBody,
                                      String listType,
                                      String username,
                                      Long userId) {
        try {
            // if no value is returned or error
            if (rajobListJsonNode == null || rajobListJsonNode.has("error")) {
                Logger.debug("RAJob list is empty or error!");
                return redirect(routes.Application.home());
            }

            JsonNode rajobsJsonArray = rajobListJsonNode.get("items");
            if (!rajobsJsonArray.isArray()) {
                Logger.debug("RAJob list is not array!");
                return redirect(routes.Application.home());
            }

            List<RAJob> rajobs = new ArrayList<>();
            for (int i = 0; i < rajobsJsonArray.size(); i++) {
                JsonNode json = rajobsJsonArray.path(i);
                RAJob rajob = RAJob.deserialize(json);
                rajobs.add(rajob);
            }

            // offset: starting index of the pageNum; count: the number of items in the pageNum;
            // total: the total number of items in all pages; sortCriteria: the sorting criteria (field)
            // pageNum: the current page number
            String sortCriteria = rajobListJsonNode.get("sort").asText();

            int total = rajobListJsonNode.get("total").asInt();
            int count = rajobListJsonNode.get("count").asInt();
            int offset = rajobListJsonNode.get("offset").asInt();
            int pageNum = offset / pageLimit + 1;

            int beginIndexPagination = beginIndexForPagination(pageLimit, total, pageNum);
            int endIndexPagination = endIndexForPagination(pageLimit, total, pageNum);

            return ok(rajobList.render(rajobs, pageNum, sortCriteria, offset, total, count,
                    listType, pageLimit, searchBody, userId, beginIndexPagination, endIndexPagination));
        } catch (Exception e) {
            Logger.debug("Exception in renderRAJobListPage:" + e.toString());
            e.printStackTrace();
            return redirect(routes.Application.home());
        }
    }


    /**************************************************** (De)Serialization *******************************************/
    /**
     * This method intends to prepare a json RA job from RA Job form.
     *
     * @param rajobForm: RA job registration form
     * @return
     * @throws Exception
     */
    public JsonNode serializeFormToJson(Form<RAJob> rajobForm) throws Exception {
        try {
            RAJob rajob = rajobForm.get();
            ObjectNode jsonData = Json.newObject();

            jsonData.put("title", rajob.getTitle() == null ? "" : rajob.getTitle());
            jsonData.put("goals", rajob.getGoals() == null ? "" : rajob.getGoals());
            jsonData.put("minSalary", rajob.getMinSalary());
            jsonData.put("maxSalary", rajob.getMaxSalary());
            jsonData.put("raTypes", rajob.getRaTypes());
            jsonData.put("shortDescription", rajob.getShortDescription() == null ? "" : rajob.getShortDescription());
            jsonData.put("longDescription", rajob.getLongDescription() == null ? "" :
                    rajob.getLongDescription().replace("\n", "").replace("\r", ""));
            jsonData.put("fields", rajob.getFields() == null ? "" : rajob.getFields());
            jsonData.put("publishDate", rajob.getPublishDate() == null ? "" : rajob.getPublishDate());
            jsonData.put("publishYear", rajob.getPublishYear() == null ? "" : rajob.getPublishYear());
            jsonData.put("publishMonth", rajob.getPublishMonth() == null ? "" : rajob.getPublishMonth());
            jsonData.put("imageURL", rajob.getImageURL() == null ? "" : rajob.getImageURL());
            jsonData.put("url", rajob.getUrl() == null ? "" : rajob.getUrl());
            jsonData.put("organization", rajob.getOrganization() == null ? "" : rajob.getOrganization());
            jsonData.put("location", rajob.getLocation() == null ? "" : rajob.getLocation());
            jsonData.put("requiredExpertise", rajob.getRequiredExpertise() == null ? "" : rajob.getRequiredExpertise());
            jsonData.put("preferredExpertise", rajob.getPreferredExpertise() == null ? "" : rajob.getPreferredExpertise());
            jsonData.put("numberOfPositions", rajob.getNumberOfPositions() == null ? "" : rajob.getNumberOfPositions());
            jsonData.put("expectedStartDate", rajob.getExpectedStartDate() == null ? "" : rajob.getExpectedStartDate());
            jsonData.put("numberOfApplicants", rajob.getNumberOfApplicants());

            User publisher = rajob.getRajobPublisher();
            long publisherId = publisher != null ? publisher.getId() : 0L;
            String publisherEmail = publisher != null ? publisher.getEmail() : null;
            if (session("id") != null && !session("id").isEmpty()) {
                publisherId = Long.parseLong(session("id"));
            }
            if (session("email") != null && !session("email").trim().isEmpty()) {
                publisherEmail = session("email");
            }

            ObjectNode publisherNode = Json.newObject();
            if (publisherId > 0) {
                publisherNode.put("id", publisherId);
            }
            if (publisherEmail != null && !publisherEmail.trim().isEmpty()) {
                publisherNode.put("email", publisherEmail.trim());
            }
            jsonData.set("rajobPublisher", publisherNode);

            return jsonData;
        } catch (Exception e) {
            Logger.debug("RAJobService.serializeFormToJson exception: " + e.toString());
            throw e;
        }
    }

}
