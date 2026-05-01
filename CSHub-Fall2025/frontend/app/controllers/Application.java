package controllers;

import actions.OperationLoggingAction;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.typesafe.config.Config;
import models.Project;
import models.User;
import play.Logger;
import play.data.Form;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import play.mvc.With;
import services.ProjectService;
import utils.Constants;
import utils.RESTfulCalls;
import utils.RESTfulCalls.ResponseType;
import views.html.*;

import javax.inject.Inject;
import java.io.File;
import java.util.Iterator;
import java.util.Map.Entry;

public class Application extends Controller {
    public static final String PRIVATE_PROJECT_ZONE = "-1";
    private static final String DEFAULT_AVATAR_ASSET = "images/user.png";

    private final ProjectService projectService;

    private Form<User> userForm;

    private FormFactory myFactory;

    /******************************* Constructor **********************************************************************/
    @Inject
    public Application(FormFactory factory, ProjectService projectService) {
        userForm = factory.form(User.class);

        myFactory = factory;

        this.projectService = projectService;
    }

    // Injecting the configuration file to add system configurations.
    @Inject
    Config config;

    @Inject
    ProjectController projectController;

    /**
     * This method returns whether the current ProjectZone is private project zone
     *
     * @return Project current ProjectZone
     */
    public static boolean isPrivateProjectZone() {
        try {
            if (session("projectId") != null && Long.parseLong(session("projectId")) < 0) {
                return true;
            }
        } catch (Exception e) {
            Logger.debug("Application.isPrivateProjectZone(): error: " + e.toString());
        }
        return false;
    }

    /**
     * This method checks if the user is logged in or not
     *
     * @return if the user is not logged in redirect the user to log in page;
     * other case return 200 OK
     */
    public static Result checkLoginStatus() {
        if (session("username") == null || session("id") == null) {
            Logger.debug("User has not logged in!");
            return redirect(routes.Application.login());
        }
        return ok();
    }

    /**
     * This method redirects to /opennex route.
     * @return if NEX is selected redirect user to /opennex route
     */
    public Result NEX() {
        return redirect("/opennex");
    }

    /**
     * This method intends to prepare data to render the whole app home page (home.scala.html)
     *
     * @return
     */
    @With(OperationLoggingAction.class)
    public Result home() {
        String ip = request().remoteAddress();
        ObjectNode jsonData = Json.newObject();
        try {
            jsonData.put("ip", ip);

            String location = "0,0";
            JsonNode locationNode = RESTfulCalls.getAPI("http://freegeoip.net/json/" + ip);
            if (locationNode != null && locationNode.get("latitude") != null && locationNode.get("longitude") != null) {
                location = locationNode.get("latitude") + "," + locationNode.get("longitude");
            }
            jsonData.put("location", location);

            // POST address data
            JsonNode response = RESTfulCalls.postAPI(RESTfulCalls.getBackendAPIUrl(config,
                    Constants.ADD_ACCESS_IP), jsonData);

        } catch (IllegalStateException e) {
            e.printStackTrace();
            Application.flashMsg(RESTfulCalls
                    .createResponse(ResponseType.CONVERSIONERROR));
        } catch (Exception e) {
            e.printStackTrace();
            Application.flashMsg(RESTfulCalls
                    .createResponse(ResponseType.UNKNOWN));
        }

        if (session("projectId") != null && Long.parseLong(session("projectId")) > 0) {
            Project currentProject = projectService.getProjectById(Long.parseLong(session("projectId")));
            return ok(home.render(currentProject, Long.parseLong(session("id")), session("username")));
        }
        Long userId = null;
        if (session("id") != null && session("id") != "") {
            userId = Long.parseLong(session("id"));
        }
        return ok(home.render(null, userId, session("username")));
    }

    /**
     * This method provides a result message for the login process.
     *
     * @return
     */
    public Result login() {
        return ok(login.render(userForm, getPublicRecaptchaKey()));
    }

    /**
     * TODO: Define them as constants instead of hard coded here...
     *
     * @return
     */
    public String getPublicRecaptchaKey() {
        String publicKey = null;
        // Add the recaptcha based on the server type.
        if (config.getString("system.frontend.host").equals("hawking.sv.cmu.edu")) {
            publicKey = config.getString("recaptcha.public.hawking.key");
        } else if (config.getString("system.frontend.host").equals("opennex.org")) {
            publicKey = config.getString("recaptcha.public.opennex.key");
        } else {
            publicKey = config.getString("recaptcha.public.scihub.key");
        }
        return publicKey;
    }

    /**
     * This method clears a session and logs user out.
     *
     * @return sends user to home page logged out.
     */
    @With(OperationLoggingAction.class)
    public Result logout() {
        session().clear();
        flash("success", "You've been logged out");
        return home();
    }

    /**
     * This method displays success when new user is registered.
     *
     * @return Message showing uaer was successfully registered.
     */
    public Result createUserSuccess() {
        return ok(userConfirmation.render("Congratulations!", "Your registration is successful"));
    }

    /**
     * This method displays message error when user tries to click a link more than once.
     *
     * @return
     */
    public Result showLinkIsAlreadyClick() {
        return ok(userConfirmation.render("Oops!",
                "This Link has already been used. Sending you back to login page..."));
    }

    /**
     * This method provide confirmation that email verification was sent.
     *
     * @return
     */
    public Result showVerificationEmailIsSent() {
        return ok(userConfirmation.render("Verification Email is Sent",
                "We have sent you an activation link to your email address." +
                        " Please verify your email within 5 minutes"));
    }

    /**
     * This method displays error when verification link is expired.
     *
     * @return
     */
    public Result showVerificationEmailIsExpired() {
        return ok(userConfirmation.render("This Link has expired",
                "Please suggestionRegisterPage again."));
    }

    /**
     * This method deletes an account using session id.
     *
     * @return
     */
    public Result deleteAccount() {
        checkLoginStatus();

        String id = session("id");
        return ok(userDelete.render(id));
    }

    /**
     *
     * @param json
     * @return
     * @throws Exception
     */
    private User deserializeJsonToUserWithLevel(JsonNode json) throws Exception {
        User oneUser = new User();
        oneUser.setId(json.findPath("id").asLong());
        System.out.println(json.findPath("id").asLong());
        oneUser.setUserName(json.findPath("userName").asText());
        oneUser.setPassword(json.findPath("password").asText());
        oneUser.setFirstName(json.findPath("firstName").asText());
        oneUser.setMiddleInitial(json.findPath("middleInitial").asText());
        oneUser.setLastName(json.findPath("lastName").asText());
//        oneUser.setAffiliation(json.findPath("affiliation").asText());
        oneUser.setPhoneNumber(json.findPath("phoneNumber").asText());
        oneUser.setEmail(json.findPath("email").asText());
        oneUser.setMailingAddress(json.findPath("mailingAddress").asText());
//        oneUser.setHighestDegree(json.findPath("highestDegree").asText());
//        oneUser.setResearchFields(json.findPath("researchFields").asText());
        JsonNode projectNode = json.findPath("project");
        if (!projectNode.asText().equals("null")) {
            Project project = Project.deserialize(projectNode);
            oneUser.setProjectZone(project);
        }
        oneUser.setLevel(json.findPath("level").asText());
        return oneUser;
    }

    /**
     *
     * @param json
     * @return
     */
    private User deserializeJsonToUser(JsonNode json) {
        User oneUser = new User();
        oneUser.setId(json.findPath("id").asLong());
        oneUser.setUserName(json.findPath("userName").asText());
        oneUser.setPassword(json.findPath("password").asText());
        oneUser.setFirstName(json.findPath("firstName").asText());
        oneUser.setMiddleInitial(json.findPath("middleInitial").asText());
        oneUser.setLastName(json.findPath("lastName").asText());
//        oneUser.setAffiliation(json.findPath("affiliation").asText());
        oneUser.setEmail(json.findPath("email").asText());
//        oneUser.setResearchFields(json.findPath("researchFields").asText());
        return oneUser;
    }

    /**
     * This method aims to put the content in JsonNode (a collection of <key, value> pairs into flash.
     * See also flashMsg(String key, String value)
     *
     * @param jsonNode
     */
    public static void flashMsg(JsonNode jsonNode) {
        Iterator<Entry<String, JsonNode>> it = jsonNode.fields();
        while (it.hasNext()) {
            Entry<String, JsonNode> field = it.next();
            flash(field.getKey(), field.getValue().asText());
        }
    }

    /**
     * This method aims to put the content <key, value> pairs into flash.
     * See also flashMsg(JsonNode jsonNode)
     *
     * @param key
     * @param value
     */
    public static void flashMsg(String key, String value) {
        flash(key, value);
    }

    /***
     * This method updates the session projectId to change the viewpoint
     * @param projectZone this can either be normal/default(which is the user's default viewpoint)/or another projectId
     * @return go to render the homepage, by calling the home() method in this controller
     */
    public Result updateProjectZone(String projectZone) {
        checkLoginStatus();

        try {
            if (projectZone.equals("default")) {
                JsonNode userNode = RESTfulCalls.getAPI(RESTfulCalls.getBackendAPIUrl(config,
                        Constants.USER_DETAIL + session("id")));
                if (userNode == null || userNode.has("error")) {
                    Logger.debug("Application.updateProjectZone: userNode null or error");
                    return badRequest("User is not valid");
                }

                User user = deserializeJsonToUserWithLevel(userNode);
                session("projectId", user.getProjectZone().getId() + "");
            } else if (projectZone.equals("private")) {
                session("projectId", PRIVATE_PROJECT_ZONE);
            } else {
                try {
                    Long newProjectId = Long.parseLong(projectZone);
                    session("projectId", newProjectId.toString());
                } catch (Exception e) {
                    Logger.debug("Application.updateProjectZone exception: " + e.toString());
                    session("projectId", "0");
                }
            }
            return ok();
        } catch (Exception e) {
            Logger.debug("Application.updateProjectZone() exception: " + e.toString());
            Application.flashMsg(RESTfulCalls.createUserResponse(RESTfulCalls.UserResponseType.GENERALERROR));
            return ok(generalError.render());
        }
    }

    /**
     * upload file
     *
     */
    public Result upload() {
        Http.MultipartFormData<File> body = request().body().asMultipartFormData();
        Http.MultipartFormData.FilePart<File> picture = body.getFile("picture");
        if (picture != null) {
            String fileName = picture.getFilename();
            String contentType = picture.getContentType();
            File file = picture.getFile();
            return ok("File uploaded");
        } else {
            flash("error", "Missing file");
            return badRequest();
        }
    }

    public Result getImageFromPath(String path){
        try {
            if (path == null || path.trim().isEmpty()) {
                return redirect(routes.Assets.at(DEFAULT_AVATAR_ASSET));
            }
            String normalizedPath = path.trim();

            // Avoid server-side S3 dependency. For S3 URLs, serve local fallback.
            if (normalizedPath.startsWith("http://") || normalizedPath.startsWith("https://")) {
                if (normalizedPath.contains(".s3.amazonaws.com")) {
                    return redirect(routes.Assets.at(DEFAULT_AVATAR_ASSET));
                }
                return redirect(normalizedPath);
            }

            int assetsIndex = normalizedPath.indexOf("assets/");
            if (assetsIndex >= 0) {
                String assetPath = normalizedPath.substring(assetsIndex + "assets/".length());
                return redirect(routes.Assets.at(assetPath));
            }

            if (normalizedPath.startsWith("/assets/")) {
                String assetPath = normalizedPath.substring("/assets/".length());
                return redirect(routes.Assets.at(assetPath));
            }

            return redirect(routes.Assets.at(DEFAULT_AVATAR_ASSET));
        } catch (Exception e) {
            Logger.warn("getImageFromPath fallback due to invalid path: {}", path);
            return redirect(routes.Assets.at(DEFAULT_AVATAR_ASSET));
        }
    }

    public Result getDefaultAvatar(){
        return redirect(routes.Assets.at(DEFAULT_AVATAR_ASSET));
    }

    /**
     *
     * @param email
     * @return
     */
    public Result updatePassword(String email) {
        return ok(userPasswordUpdate.render(userForm, email));
    }
}
