
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/conf/routes
// @DATE:Fri Apr 24 12:50:26 CDT 2026

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:5
  AsyncController_4: controllers.AsyncController,
  // @LINE:7
  Assets_19: controllers.Assets,
  // @LINE:11
  AboutController_15: controllers.AboutController,
  // @LINE:22
  Application_21: controllers.Application,
  // @LINE:43
  ProjectController_12: controllers.ProjectController,
  // @LINE:75
  ChallengeController_16: controllers.ChallengeController,
  // @LINE:130
  UserController_10: controllers.UserController,
  // @LINE:174
  OrganizationController_17: controllers.OrganizationController,
  // @LINE:187
  BugReportController_6: controllers.BugReportController,
  // @LINE:199
  SuggestionController_1: controllers.SuggestionController,
  // @LINE:212
  TechnologyController_7: controllers.TechnologyController,
  // @LINE:240
  JobController_9: controllers.JobController,
  // @LINE:276
  RAJobController_14: controllers.RAJobController,
  // @LINE:312
  TACandidateController_20: controllers.TACandidateController,
  // @LINE:323
  CourseController_2: controllers.CourseController,
  // @LINE:331
  CourseTAAssignmentController_5: controllers.CourseTAAssignmentController,
  // @LINE:340
  TAJobController_8: controllers.TAJobController,
  // @LINE:368
  AdminController_0: controllers.AdminController,
  // @LINE:379
  AuthorController_3: controllers.AuthorController,
  // @LINE:399
  ReviewerController_18: controllers.ReviewerController,
  // @LINE:414
  PaperController_13: controllers.PaperController,
  // @LINE:435
  GraphController_11: controllers.GraphController,
  // @LINE:436
  FileController_22: controllers.FileController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:5
    AsyncController_4: controllers.AsyncController,
    // @LINE:7
    Assets_19: controllers.Assets,
    // @LINE:11
    AboutController_15: controllers.AboutController,
    // @LINE:22
    Application_21: controllers.Application,
    // @LINE:43
    ProjectController_12: controllers.ProjectController,
    // @LINE:75
    ChallengeController_16: controllers.ChallengeController,
    // @LINE:130
    UserController_10: controllers.UserController,
    // @LINE:174
    OrganizationController_17: controllers.OrganizationController,
    // @LINE:187
    BugReportController_6: controllers.BugReportController,
    // @LINE:199
    SuggestionController_1: controllers.SuggestionController,
    // @LINE:212
    TechnologyController_7: controllers.TechnologyController,
    // @LINE:240
    JobController_9: controllers.JobController,
    // @LINE:276
    RAJobController_14: controllers.RAJobController,
    // @LINE:312
    TACandidateController_20: controllers.TACandidateController,
    // @LINE:323
    CourseController_2: controllers.CourseController,
    // @LINE:331
    CourseTAAssignmentController_5: controllers.CourseTAAssignmentController,
    // @LINE:340
    TAJobController_8: controllers.TAJobController,
    // @LINE:368
    AdminController_0: controllers.AdminController,
    // @LINE:379
    AuthorController_3: controllers.AuthorController,
    // @LINE:399
    ReviewerController_18: controllers.ReviewerController,
    // @LINE:414
    PaperController_13: controllers.PaperController,
    // @LINE:435
    GraphController_11: controllers.GraphController,
    // @LINE:436
    FileController_22: controllers.FileController
  ) = this(errorHandler, AsyncController_4, Assets_19, AboutController_15, Application_21, ProjectController_12, ChallengeController_16, UserController_10, OrganizationController_17, BugReportController_6, SuggestionController_1, TechnologyController_7, JobController_9, RAJobController_14, TACandidateController_20, CourseController_2, CourseTAAssignmentController_5, TAJobController_8, AdminController_0, AuthorController_3, ReviewerController_18, PaperController_13, GraphController_11, FileController_22, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, AsyncController_4, Assets_19, AboutController_15, Application_21, ProjectController_12, ChallengeController_16, UserController_10, OrganizationController_17, BugReportController_6, SuggestionController_1, TechnologyController_7, JobController_9, RAJobController_14, TACandidateController_20, CourseController_2, CourseTAAssignmentController_5, TAJobController_8, AdminController_0, AuthorController_3, ReviewerController_18, PaperController_13, GraphController_11, FileController_22, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """aboutUs""", """controllers.AboutController.aboutUs()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """aboutProject""", """controllers.AboutController.aboutProject()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """frequentlyAskedQuestions""", """controllers.AboutController.frequentlyAskedQuestions()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """popularQueries""", """controllers.AboutController.popularQueries()"""),
    ("""GET""", this.prefix, """controllers.Application.home()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Application.login()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.Application.logout()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """createUserSuccess""", """controllers.Application.createUserSuccess()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """showLinkIsAlreadyClick""", """controllers.Application.showLinkIsAlreadyClick()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """showVerificationEmailIsSent""", """controllers.Application.showVerificationEmailIsSent()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """showVerificationEmailIsExpired""", """controllers.Application.showVerificationEmailIsExpired()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteAccount""", """controllers.Application.deleteAccount()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatePassword""", """controllers.Application.updatePassword(email:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateProjectZone/""" + "$" + """view<[^/]+>""", """controllers.Application.updateProjectZone(view:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getimage""", """controllers.Application.getImageFromPath(filePath:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getDefualtAvatar""", """controllers.Application.getDefaultAvatar"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/projectRegisterPage""", """controllers.ProjectController.projectRegisterPage()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/projectRegisterPOST""", """controllers.ProjectController.projectRegisterPOST()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/projectEditPage/""" + "$" + """projectId<[^/]+>""", """controllers.ProjectController.projectEditPage(projectId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/projectEditPOST/""" + "$" + """projectId<[^/]+>""", """controllers.ProjectController.projectEditPOST(projectId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/projectList/""" + "$" + """pageNum<[^/]+>""", """controllers.ProjectController.projectList(pageNum:Integer, sortCriteria:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/projectDetail/""" + "$" + """projectId<[^/]+>""", """controllers.ProjectController.projectDetail(projectId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/searchPage""", """controllers.ProjectController.searchPage()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/searchPOST""", """controllers.ProjectController.searchPOST(pageNum:Integer, sortCriteria:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/deleteProject/""" + "$" + """projectId<[^/]+>""", """controllers.ProjectController.deleteProject(projectId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/isProjectNameExisted""", """controllers.ProjectController.isProjectNameExisted()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/uploadDescriptionImg/""" + "$" + """projectId<[^/]+>/""" + "$" + """imageNumber<[^/]+>""", """controllers.ProjectController.uploadDescriptionImage(projectId:Long, imageNumber:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/renameDescriptionImg/""" + "$" + """projectId<[^/]+>/""" + "$" + """imageNumber<[^/]+>/""" + "$" + """currentImageNumber<[^/]+>""", """controllers.ProjectController.renameDescriptionImage(projectId:Long, imageNumber:Integer, currentImageNumber:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/doesProjectExist/""" + "$" + """id<[^/]+>""", """controllers.ProjectController.isProjectExist(id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/associateProjectsToNotebook/""" + "$" + """notebookId<[^/]+>""", """controllers.ProjectController.associateProjectsToNotebook(notebookId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/getProjects""", """controllers.ProjectController.getProjectLists()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/myEnrolledProjects/""" + "$" + """pageNum<[^/]+>""", """controllers.ProjectController.getMyEnrolledProjects(pageNum:Integer, sortCriteria:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/setProjectZoneAsGeoNEX""", """controllers.ProjectController.setProjectZoneAsGeoNEX()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/followedByUser/""" + "$" + """id<[^/]+>/""" + "$" + """eventList<[^/]+>""", """controllers.ProjectController.followedByUser(id:Long, eventList:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/unFollowedByUser/""" + "$" + """id<[^/]+>/""" + "$" + """eventList<[^/]+>""", """controllers.ProjectController.unFollowedByUser(id:Long, eventList:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/myFollowedProjects""", """controllers.ProjectController.myFollowedProjects(page:Integer ?= 1, sortCriteria:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/checkParentProject/""" + "$" + """parentProjectId<[^/]+>""", """controllers.ProjectController.checkParentProject(parentProjectId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/addProjectFollowersPage/""" + "$" + """id<[^/]+>""", """controllers.ProjectController.addProjectFollowersPage(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/addOneFollower/""" + "$" + """id<[^/]+>/""" + "$" + """event<[^/]+>""", """controllers.ProjectController.addOneFollower(id:Long, event:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/deleteOneFollower/""" + "$" + """userId<[^/]+>/""" + "$" + """projectId<[^/]+>/""" + "$" + """eventType<[^/]+>""", """controllers.ProjectController.deleteOneFollower(userId:Long, projectId:Long, eventType:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """challenge/challengeRegisterPage""", """controllers.ChallengeController.challengeRegisterPage()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """challenge/challengeRegisterPOST""", """controllers.ChallengeController.challengeRegisterPOST()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """challenge/challengeApplyPage/""" + "$" + """challengeId<[^/]+>""", """controllers.ChallengeController.challengeApplyPage(challengeId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """challenge/challengeApplyPOST/""" + "$" + """challengeId<[^/]+>""", """controllers.ChallengeController.challengeApplyPOST(challengeId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """challenge/challengeEditPage/""" + "$" + """challengeId<[^/]+>""", """controllers.ChallengeController.challengeEditPage(challengeId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """challenge/challengeEditPageAdmin/""" + "$" + """challengeId<[^/]+>""", """controllers.ChallengeController.challengeEditPageAdmin(challengeId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """challenge/challengeEditPOST/""" + "$" + """challengeId<[^/]+>""", """controllers.ChallengeController.challengeEditPOST(challengeId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """challenge/challengeEditPOSTAdmin/""" + "$" + """challengeId<[^/]+>""", """controllers.ChallengeController.challengeEditPOSTAdmin(challengeId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """challenge/closeChallenge/""" + "$" + """challengeId<[^/]+>""", """controllers.ChallengeController.closeChallenge(challengeId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """challenge/applications/""" + "$" + """challengeType<[^/]+>/""" + "$" + """challengeId<[^/]+>""", """controllers.ChallengeController.challengeApplicationsList(challengeType:String, challengeId:Long, pageNum:Integer ?= 1, sortCriteria:String ?= "")"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """challenge/challengeApplicationStatusChange/""" + "$" + """challengeApplicationId<[^/]+>/""" + "$" + """challengeApplicationStatus<[^/]+>""", """controllers.ChallengeController.challengeApplicationStatusChange(challengeApplicationId:Long, challengeApplicationStatus:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """challenge/challengeListAppliedByUser/""" + "$" + """pageNum<[^/]+>""", """controllers.ChallengeController.challengeListAppliedByUser(pageNum:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """challenge/challengeApplicationList/""" + "$" + """pageNum<[^/]+>""", """controllers.ChallengeController.challengeApplicationList(pageNum:Integer, sortCriteria:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """challenge/challengeListPostedByUser/""" + "$" + """pageNum<[^/]+>""", """controllers.ChallengeController.challengeListPostedByUser(pageNum:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """challenge/challengeApplicationDetail/""" + "$" + """challengeApplicationId<[^/]+>""", """controllers.ChallengeController.challengeApplicationDetail(challengeApplicationId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """challenge/challengeStatus/""" + "$" + """challengeId<[^/]+>/""" + "$" + """challengeStatus<[^/]+>""", """controllers.ChallengeController.challengeStatusChange(challengeId:Long, challengeStatus:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """challenge/challengeApplicationsDetail/""" + "$" + """challengeApplicationId<[^/]+>""", """controllers.ChallengeController.challengeApplicationsDetail(challengeApplicationId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """challenge/challengeList/""" + "$" + """pageNum<[^/]+>""", """controllers.ChallengeController.challengeList(pageNum:Integer, sortCriteria:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """challenge/challengeListAdmin/""" + "$" + """pageNum<[^/]+>""", """controllers.ChallengeController.challengeListAdmin(pageNum:Integer, sortCriteria:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """challenge/challengeDetail/""" + "$" + """challengeId<[^/]+>""", """controllers.ChallengeController.challengeDetail(challengeId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """challenge/searchPage""", """controllers.ChallengeController.searchPage()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """challenge/searchPOST/""" + "$" + """pageNum<[^/]+>""", """controllers.ChallengeController.searchPOST(pageNum:Integer, sortCriteria:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/userRegisterPage""", """controllers.UserController.userRegisterPage()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/userForgotPasswordPage""", """controllers.UserController.userForgotPasswordPage()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/resendActivationEmail""", """controllers.UserController.resendActivationEmail()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/userResetPassword""", """controllers.UserController.userResetPassword()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/userUpdatePasswordPage""", """controllers.UserController.updatePasswordPage()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/userUpdatePasswordForUser""", """controllers.UserController.updatePasswordForUser()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/userRegister""", """controllers.UserController.userRegisterPOST()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/userEditPage""", """controllers.UserController.userEditPage()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/userEditPOST""", """controllers.UserController.userEditPOST()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/isEmailExisted""", """controllers.UserController.isEmailExisted()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/userList/""" + "$" + """pageNum<[^/]+>""", """controllers.UserController.userList(pageNum:Integer, sortCriteria:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/userDetailPage/""" + "$" + """userId<[^/]+>""", """controllers.UserController.userDetailPage(userId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/userLogin""", """controllers.UserController.userLogin()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/userImageByImageId/""" + "$" + """imageId<[^/]+>""", """controllers.UserController.userImageByImageId(imageId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/validateEmail""", """controllers.UserController.validateEmail()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/followedByUser/""" + "$" + """id<[^/]+>/""" + "$" + """page<[^/]+>""", """controllers.UserController.followedByUser(id:Long, page:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/unFollowedByUser/""" + "$" + """id<[^/]+>/""" + "$" + """page<[^/]+>""", """controllers.UserController.unFollowedByUser(id:Long, page:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/updateLevel/""" + "$" + """uid<[^/]+>""", """controllers.UserController.updateLevel(uid:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/updatePassword""", """controllers.UserController.updatePassword"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/checkCurPassword""", """controllers.UserController.checkPassword()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/searchPage""", """controllers.UserController.searchPage()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/searchPOST""", """controllers.UserController.searchPOST(pageNum:Integer ?= 1, sortCriteria:String ?= "id")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/userDelete""", """controllers.UserController.userDelete()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/allUserIds""", """controllers.UserController.allUserIds()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/myFollowers""", """controllers.UserController.myFollowers(page:Integer ?= 1, sortCriteria:String ?= "id")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/myFollowees""", """controllers.UserController.myFollowees(page:Integer ?= 1, sortCriteria:String ?= "id", isCallerMySpacePage:Boolean ?= false)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/mySpace""", """controllers.UserController.mySpacePage()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/""" + "$" + """hashcode<[^/]+>""", """controllers.UserController.activateUser(hashcode:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/""" + "$" + """hashcode<[^/]+>""", """controllers.UserController.userSaved(hashcode:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """organization/organizationDetailPageAdmin/""" + "$" + """organizationId<[^/]+>""", """controllers.OrganizationController.organizationDetailPageAdmin(organizationId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """organization/organizationDetailPage/""" + "$" + """organizationId<[^/]+>""", """controllers.OrganizationController.organizationDetailPage(organizationId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """organization/organizationListPage/""" + "$" + """pageNum<[^/]+>""", """controllers.OrganizationController.organizationListPage(pageNum:Integer, sortCriteria:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """organization/organizationRegisterPOST""", """controllers.OrganizationController.organizationRegisterPOST()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """organization/organizationEditPOST""", """controllers.OrganizationController.organizationEditPOST(organizationId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """organization/organizationRegisterPage""", """controllers.OrganizationController.organizationRegisterPage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """organization/organizationEditPage""", """controllers.OrganizationController.organizationEditPage()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """organization/searchPage""", """controllers.OrganizationController.searchPage"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """organization/searchPOST""", """controllers.OrganizationController.searchPOST(pageNum:Integer ?= 1, sortCriteria:String ?= "id")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bugReport/bugReportRegisterPage""", """controllers.BugReportController.bugReportRegisterPage()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bugReport/bugReportRegisterPOST""", """controllers.BugReportController.bugReportRegisterPOST()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bugReport/bugReportEditPage/""" + "$" + """id<[^/]+>""", """controllers.BugReportController.bugReportEditPage(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bugReport/bugReportEditPost/""" + "$" + """bugReportId<[^/]+>""", """controllers.BugReportController.bugReportEditPOST(bugReportId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bugReport/bugReportDetail/""" + "$" + """bugReportId<[^/]+>""", """controllers.BugReportController.bugReportDetail(bugReportId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bugReport/bugReportList""", """controllers.BugReportController.bugReportList(page:Long ?= 1, sortCriteria:String ?= "publish_time_stamp" )"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bugReport/bugReportDelete/""" + "$" + """bugReportId<[^/]+>""", """controllers.BugReportController.bugReportDelete(bugReportId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bugReport/solve/""" + "$" + """bugReportId<[^/]+>/""" + "$" + """fixerId<[^/]+>""", """controllers.BugReportController.markAsSolved(bugReportId:Long, fixerId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """suggestion/suggestionRegisterPage""", """controllers.SuggestionController.suggestionRegisterPage()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """suggestion/suggestionRegisterPOST""", """controllers.SuggestionController.suggestionRegisterPOST()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """suggestion/suggestionEditPage/""" + "$" + """suggestionId<[^/]+>""", """controllers.SuggestionController.suggestionEditPage(suggestionId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """suggestion/suggestionEditPOST/""" + "$" + """suggestionId<[^/]+>""", """controllers.SuggestionController.suggestionEditPOST(suggestionId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """suggestion/suggestionDetail/""" + "$" + """suggestionId<[^/]+>""", """controllers.SuggestionController.suggestionDetail(suggestionId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """suggestion/suggestionList""", """controllers.SuggestionController.suggestionList(page:Long ?= 1, sortCriteria:String ?= "publish_time_stamp" )"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """suggestion/suggestionDelete/""" + "$" + """suggestionId<[^/]+>""", """controllers.SuggestionController.suggestionDelete(suggestionId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """suggestion/solve/""" + "$" + """suggestionId<[^/]+>/""" + "$" + """implementorId<[^/]+>""", """controllers.SuggestionController.markAsSolved(suggestionId:Long, implementorId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """technology/technologyRegisterPage""", """controllers.TechnologyController.technologyRegisterPage()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """technology/technologyRegisterPOST""", """controllers.TechnologyController.technologyRegisterPOST()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """technology/technologyEditPage/""" + "$" + """technologyId<[^/]+>""", """controllers.TechnologyController.technologyEditPage(technologyId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """technology/technologyEditPOST/""" + "$" + """technologyId<[^/]+>""", """controllers.TechnologyController.technologyEditPOST(technologyId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """technology/technologyList/""" + "$" + """pageNum<[^/]+>""", """controllers.TechnologyController.technologyList(pageNum:Integer, sortCriteria:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """technology/technologyDetail/""" + "$" + """technologyId<[^/]+>""", """controllers.TechnologyController.technologyDetail(technologyId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """technology/searchPage""", """controllers.TechnologyController.searchPage()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """technology/searchPOST""", """controllers.TechnologyController.searchPOST(pageNum:Integer, sortCriteria:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """technology/deleteTechnology/""" + "$" + """technologyId<[^/]+>""", """controllers.TechnologyController.deleteTechnology(technologyId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """technology/downloadPDFFile/""" + "$" + """serviceId<[^/]+>""", """controllers.TechnologyController.downloadTechnologyFile(serviceId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """job/jobRegisterPage""", """controllers.JobController.jobRegisterPage()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """job/jobRegisterPOST""", """controllers.JobController.jobRegisterPOST()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """job/jobEditPage/""" + "$" + """jobId<[^/]+>""", """controllers.JobController.jobEditPage(jobId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """job/jobEditPOST/""" + "$" + """jobId<[^/]+>""", """controllers.JobController.jobEditPOST(jobId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """job/jobApplyPage/""" + "$" + """jobId<[^/]+>""", """controllers.JobController.jobApplyPage(jobId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """job/jobApplyPOST/""" + "$" + """jobId<[^/]+>""", """controllers.JobController.jobApplyPOST(jobId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """job/jobApplicationList/""" + "$" + """pageNum<[^/]+>""", """controllers.JobController.jobApplicationList(pageNum:Integer, sortCriteria:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """job/listAppliedByUser/""" + "$" + """pageNum<[^/]+>""", """controllers.JobController.jobListAppliedByUser(pageNum:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """job/jobList/""" + "$" + """pageNum<[^/]+>""", """controllers.JobController.jobList(pageNum:Integer, sortCriteria:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """job/jobListPostedByUser/""" + "$" + """pageNum<[^/]+>""", """controllers.JobController.jobListPostedByUser(pageNum:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """job/jobDetail/""" + "$" + """jobId<[^/]+>""", """controllers.JobController.jobDetail(jobId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """job/searchPage""", """controllers.JobController.searchPage()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """job/searchPOST""", """controllers.JobController.searchPOST(pageNum:Integer, sortCriteria:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """job/deleteJob/""" + "$" + """jobId<[^/]+>""", """controllers.JobController.deleteJob(jobId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """job/jobStatue/""" + "$" + """jobId<[^/]+>/""" + "$" + """jobStatus<[^/]+>""", """controllers.JobController.jobStatueChange(jobId:Long, jobStatus:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """job/jobApplicationDetail/""" + "$" + """jobApplicationId<[^/]+>""", """controllers.JobController.jobApplicationDetail(jobApplicationId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """job/applications/""" + "$" + """jobType<[^/]+>/""" + "$" + """jobId<[^/]+>""", """controllers.JobController.jobApplicationsList(jobType:String, jobId:Long, pageNum:Integer, sortCriteria:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rajob/rajobRegisterPage""", """controllers.RAJobController.rajobRegisterPage()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rajob/rajobRegisterPOST""", """controllers.RAJobController.rajobRegisterPOST()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rajob/rajobEditPage/""" + "$" + """rajobId<[^/]+>/""" + "$" + """status<[^/]+>""", """controllers.RAJobController.rajobEditPage(rajobId:Long, status:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rajob/rajobEditPOST/""" + "$" + """rajobId<[^/]+>""", """controllers.RAJobController.rajobEditPOST(rajobId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rajob/rajobApplyPage/""" + "$" + """rajobId<[^/]+>""", """controllers.RAJobController.rajobApplyPage(rajobId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rajob/rajobApplyPOST/""" + "$" + """rajobId<[^/]+>""", """controllers.RAJobController.rajobApplyPOST(rajobId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rajob/rajobStatue/""" + "$" + """rajobId<[^/]+>/""" + "$" + """rajobStatus<[^/]+>""", """controllers.RAJobController.rajobStatueChange(rajobId:Long, rajobStatus:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rajob/rajobApplicationStatusChange/""" + "$" + """rajobApplicationId<[^/]+>/""" + "$" + """rajobApplicationStatus<[^/]+>""", """controllers.RAJobController.rajobApplicationStatusChange(rajobApplicationId:Long, rajobApplicationStatus:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rajob/rajobApplicationDetail/""" + "$" + """rajobApplicationId<[^/]+>""", """controllers.RAJobController.rajobApplicationDetail(rajobApplicationId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rajob/rajobList/""" + "$" + """pageNum<[^/]+>""", """controllers.RAJobController.rajobList(pageNum:Integer, sortCriteria:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rajob/rajobListPostedByUser/""" + "$" + """pageNum<[^/]+>""", """controllers.RAJobController.rajobListPostedByUser(pageNum:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rajob/rajobListAppliedByUser/""" + "$" + """pageNum<[^/]+>""", """controllers.RAJobController.rajobListAppliedByUser(pageNum:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rajob/rajobDetail/""" + "$" + """rajobId<[^/]+>""", """controllers.RAJobController.rajobDetail(rajobId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rajob/searchPage""", """controllers.RAJobController.searchPage()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rajob/searchPOST""", """controllers.RAJobController.searchPOST(pageNum:Integer, sortCriteria:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rajob/deleteRAJob/""" + "$" + """rajobId<[^/]+>""", """controllers.RAJobController.deleteRAJob(rajobId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rajob/closeRAJob/""" + "$" + """rajobId<[^/]+>""", """controllers.RAJobController.closeRAJob(rajobId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rajob/sendOfferEmail""", """controllers.RAJobController.sendOfferEmail(rajobApplicationId:Long, ccString:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tapool/tacandidateRegisterPage""", """controllers.TACandidateController.tacandidateRegisterPage()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tapool/tacandidateRegisterPOST""", """controllers.TACandidateController.tacandidateRegisterPOST()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tapool/candidateList/""" + "$" + """pageNum<[^/]+>""", """controllers.TACandidateController.tacandidateList(pageNum:Integer, sortCriteria:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tapool/tacandidateDetail/""" + "$" + """Id<[^/]+>""", """controllers.TACandidateController.tacandidateDetail(Id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ta/weeklyhours""", """controllers.TACandidateController.getCurrentUserAssignments()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """courses""", """controllers.CourseController.courseList()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tahiring/statuslist/""" + "$" + """pageNum<[^/]+>""", """controllers.CourseTAAssignmentController.taHiringStatusList(pageNum:Integer, sortCriteria:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tahiring/statusDetail/""" + "$" + """Id<[^/]+>""", """controllers.CourseTAAssignmentController.assignmentDetail(Id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tahiring/assignmentRegisterPOST""", """controllers.CourseTAAssignmentController.assignmentRegisterPOST()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tajob/tajobRegisterPage""", """controllers.TAJobController.tajobRegisterPage()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tajob/tajobRegisterPOST""", """controllers.TAJobController.tajobRegisterPOST()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tajob/tajobEditPage/""" + "$" + """tajobId<[^/]+>""", """controllers.TAJobController.tajobEditPage(tajobId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tajob/tajobEditPOST/""" + "$" + """tajobId<[^/]+>""", """controllers.TAJobController.tajobEditPOST(tajobId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tajob/tajobApplyPage/""" + "$" + """tajobId<[^/]+>""", """controllers.TAJobController.tajobApplyPage(tajobId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tajob/tajobApplyPOST/""" + "$" + """tajobId<[^/]+>""", """controllers.TAJobController.tajobApplyPOST(tajobId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tajob/tajobStatue/""" + "$" + """tajobId<[^/]+>/""" + "$" + """tajobStatus<[^/]+>""", """controllers.TAJobController.tajobStatueChange(tajobId:Long, tajobStatus:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tajob/tajobApplicationDetail/""" + "$" + """tajobApplicationId<[^/]+>""", """controllers.TAJobController.tajobApplicationDetail(tajobApplicationId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tajob/saveTAJobPdf/""" + "$" + """tajobApplicationId<[^/]+>""", """controllers.TAJobController.saveTAJobPdf(tajobApplicationId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tajob/tajobList/""" + "$" + """pageNum<[^/]+>""", """controllers.TAJobController.tajobList(pageNum:Integer, sortCriteria:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tajob/tajobListPostedByUser/""" + "$" + """pageNum<[^/]+>""", """controllers.TAJobController.tajobListPostedByUser(pageNum:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tajob/tajobDetail/""" + "$" + """tajobId<[^/]+>""", """controllers.TAJobController.tajobDetail(tajobId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tajob/searchPage""", """controllers.TAJobController.searchPage()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tajob/searchPOST""", """controllers.TAJobController.searchPOST(pageNum:Integer, sortCriteria:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tajob/deleteTAJob/""" + "$" + """tajobId<[^/]+>""", """controllers.TAJobController.deleteTAJob(tajobId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/dashboard""", """controllers.AdminController.dashboard()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/users/""" + "$" + """pageNum<[^/]+>""", """controllers.AdminController.userManagement(pageNum:Integer, sortCriteria:String ?= "id")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/users/detail/""" + "$" + """userId<[^/]+>""", """controllers.AdminController.userDetail(userId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/jobs/""" + "$" + """pageNum<[^/]+>""", """controllers.AdminController.jobManagement(pageNum:Integer, sortCriteria:String ?= "id")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/jobs/detail/""" + "$" + """jobType<[^/]+>/""" + "$" + """jobId<[^/]+>""", """controllers.AdminController.jobDetail(jobType:String, jobId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/organizations/""" + "$" + """pageNum<[^/]+>""", """controllers.AdminController.organizationManagement(pageNum:Integer, sortCriteria:String ?= "id")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/technologies/""" + "$" + """pageNum<[^/]+>""", """controllers.AdminController.technologyManagement(pageNum:Integer, sortCriteria:String ?= "id")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """author/authorRegisterPage""", """controllers.AuthorController.authorRegisterPage()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """author/authorRegister""", """controllers.AuthorController.authorRegisterPOST()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """author/authorEditPage""", """controllers.AuthorController.authorEditPage()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """author/authorEditPOST""", """controllers.AuthorController.authorEditPOST()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """author/authorList/""" + "$" + """pageNum<[^/]+>""", """controllers.AuthorController.authorList(pageNum:Integer, sortCriteria:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """author/authorDetailPage/""" + "$" + """userId<[^/]+>""", """controllers.AuthorController.authorDetailPage(userId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """author/userEditPageAdmin/""" + "$" + """userId<[^/]+>""", """controllers.AuthorController.userEditPageAdmin(userId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """author/userEditPOSTAdmin/""" + "$" + """userId<[^/]+>""", """controllers.AuthorController.userEditPOSTAdmin(userId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """author/userListAdmin/""" + "$" + """pageNum<[^/]+>""", """controllers.AuthorController.userListAdmin(pageNum:Integer, sortCriteria:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """author/userDetailPageAdmin/""" + "$" + """userId<[^/]+>""", """controllers.AuthorController.userDetailPageAdmin(userId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """author/searchPage""", """controllers.AuthorController.searchPage()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """author/searchPOST""", """controllers.AuthorController.searchPOST(pageNum:Integer ?= 1, sortCriteria:String ?= "id")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """author/authorDelete""", """controllers.AuthorController.authorDelete()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """author/topAuthors""", """controllers.AuthorController.topAuthors()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reviewer/reviewerRegisterPage""", """controllers.ReviewerController.reviewerRegisterPage()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reviewer/reviewerRegister""", """controllers.ReviewerController.reviewerRegisterPOST()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reviewer/reviewerEditPage""", """controllers.ReviewerController.reviewerEditPage()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reviewer/reviewerEditPOST""", """controllers.ReviewerController.reviewerEditPOST()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reviewer/reviewerList/""" + "$" + """pageNum<[^/]+>""", """controllers.ReviewerController.reviewerList(pageNum:Integer, sortCriteria:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reviewer/reviewerDetailPage/""" + "$" + """userId<[^/]+>""", """controllers.ReviewerController.reviewerDetailPage(userId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reviewer/searchPage""", """controllers.ReviewerController.searchPage()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reviewer/searchPOST""", """controllers.ReviewerController.searchPOST(pageNum:Integer ?= 1, sortCriteria:String ?= "id")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reviewer/reviewerDelete""", """controllers.ReviewerController.reviewerDelete()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paper/paperRegisterPage""", """controllers.PaperController.paperRegisterPage()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paper/paperRegisterPOST""", """controllers.PaperController.paperRegisterPOST()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paper/paperList/""" + "$" + """pageNum<[^/]+>""", """controllers.PaperController.paperList(pageNum:Integer, sortCriteria:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paper/paperDetail/""" + "$" + """paperId<[^/]+>""", """controllers.PaperController.paperDetail(paperId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paper/deletePaper/""" + "$" + """paperId<[^/]+>""", """controllers.PaperController.deletePaper(paperId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paper/primeConnections""", """controllers.PaperController.primeConnections()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paper/relationGraph""", """controllers.PaperController.relationGraph()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paper/loadDBLP""", """controllers.PaperController.loadUploadPage()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paper/uploadDBLP""", """controllers.PaperController.processDBPLFile()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paper/ldaPage""", """controllers.PaperController.paperLDA()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paper/authorRelation""", """controllers.PaperController.authorAuthorRel()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paper/ldaTopicDistribution""", """controllers.PaperController.ldaTopicDistribution()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paper/searchPage""", """controllers.PaperController.searchPage()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paper/searchPaper""", """controllers.PaperController.searchPaper(pageNum:Integer ?= 1, sortCriteria:String ?= "id")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """graphs/research""", """controllers.GraphController.researchInterest()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """file/""" + "$" + """tableName<[^/]+>/""" + "$" + """challengeFileType<[^/]+>/""" + "$" + """tableRecorderId<[^/]+>""", """controllers.FileController.getFile(tableName:String, challengeFileType:String, tableRecorderId:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:5
  private[this] lazy val controllers_AsyncController_message0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message0_invoker = createInvoker(
    AsyncController_4.message,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      this.prefix + """message""",
      """""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_Assets_at1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at1_invoker = createInvoker(
    Assets_19.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Assets_at2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at2_invoker = createInvoker(
    Assets_19.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "POST",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_AboutController_aboutUs3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("aboutUs")))
  )
  private[this] lazy val controllers_AboutController_aboutUs3_invoker = createInvoker(
    AboutController_15.aboutUs(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AboutController",
      "aboutUs",
      Nil,
      "GET",
      this.prefix + """aboutUs""",
      """######################################################### About ###################################################################################""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_AboutController_aboutProject4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("aboutProject")))
  )
  private[this] lazy val controllers_AboutController_aboutProject4_invoker = createInvoker(
    AboutController_15.aboutProject(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AboutController",
      "aboutProject",
      Nil,
      "GET",
      this.prefix + """aboutProject""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_AboutController_frequentlyAskedQuestions5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("frequentlyAskedQuestions")))
  )
  private[this] lazy val controllers_AboutController_frequentlyAskedQuestions5_invoker = createInvoker(
    AboutController_15.frequentlyAskedQuestions(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AboutController",
      "frequentlyAskedQuestions",
      Nil,
      "GET",
      this.prefix + """frequentlyAskedQuestions""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_AboutController_popularQueries6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("popularQueries")))
  )
  private[this] lazy val controllers_AboutController_popularQueries6_invoker = createInvoker(
    AboutController_15.popularQueries(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AboutController",
      "popularQueries",
      Nil,
      "GET",
      this.prefix + """popularQueries""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Application_home7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_home7_invoker = createInvoker(
    Application_21.home(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "home",
      Nil,
      "GET",
      this.prefix + """""",
      """######################################################### Homepage #####################################################################""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Application_login8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Application_login8_invoker = createInvoker(
    Application_21.login(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "login",
      Nil,
      "GET",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_Application_logout9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_Application_logout9_invoker = createInvoker(
    Application_21.logout(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "logout",
      Nil,
      "GET",
      this.prefix + """logout""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_Application_createUserSuccess10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("createUserSuccess")))
  )
  private[this] lazy val controllers_Application_createUserSuccess10_invoker = createInvoker(
    Application_21.createUserSuccess(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "createUserSuccess",
      Nil,
      "GET",
      this.prefix + """createUserSuccess""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_Application_showLinkIsAlreadyClick11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("showLinkIsAlreadyClick")))
  )
  private[this] lazy val controllers_Application_showLinkIsAlreadyClick11_invoker = createInvoker(
    Application_21.showLinkIsAlreadyClick(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "showLinkIsAlreadyClick",
      Nil,
      "GET",
      this.prefix + """showLinkIsAlreadyClick""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_Application_showVerificationEmailIsSent12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("showVerificationEmailIsSent")))
  )
  private[this] lazy val controllers_Application_showVerificationEmailIsSent12_invoker = createInvoker(
    Application_21.showVerificationEmailIsSent(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "showVerificationEmailIsSent",
      Nil,
      "GET",
      this.prefix + """showVerificationEmailIsSent""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_Application_showVerificationEmailIsExpired13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("showVerificationEmailIsExpired")))
  )
  private[this] lazy val controllers_Application_showVerificationEmailIsExpired13_invoker = createInvoker(
    Application_21.showVerificationEmailIsExpired(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "showVerificationEmailIsExpired",
      Nil,
      "GET",
      this.prefix + """showVerificationEmailIsExpired""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_Application_deleteAccount14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteAccount")))
  )
  private[this] lazy val controllers_Application_deleteAccount14_invoker = createInvoker(
    Application_21.deleteAccount(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "deleteAccount",
      Nil,
      "GET",
      this.prefix + """deleteAccount""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_Application_updatePassword15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatePassword")))
  )
  private[this] lazy val controllers_Application_updatePassword15_invoker = createInvoker(
    Application_21.updatePassword(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "updatePassword",
      Seq(classOf[String]),
      "GET",
      this.prefix + """updatePassword""",
      """""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_Application_updateProjectZone16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateProjectZone/"), DynamicPart("view", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_updateProjectZone16_invoker = createInvoker(
    Application_21.updateProjectZone(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "updateProjectZone",
      Seq(classOf[String]),
      "GET",
      this.prefix + """updateProjectZone/""" + "$" + """view<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_Application_getImageFromPath17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getimage")))
  )
  private[this] lazy val controllers_Application_getImageFromPath17_invoker = createInvoker(
    Application_21.getImageFromPath(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getImageFromPath",
      Seq(classOf[String]),
      "GET",
      this.prefix + """getimage""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_Application_getDefaultAvatar18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getDefualtAvatar")))
  )
  private[this] lazy val controllers_Application_getDefaultAvatar18_invoker = createInvoker(
    Application_21.getDefaultAvatar,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getDefaultAvatar",
      Nil,
      "GET",
      this.prefix + """getDefualtAvatar""",
      """""",
      Seq()
    )
  )

  // @LINE:43
  private[this] lazy val controllers_ProjectController_projectRegisterPage19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/projectRegisterPage")))
  )
  private[this] lazy val controllers_ProjectController_projectRegisterPage19_invoker = createInvoker(
    ProjectController_12.projectRegisterPage(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "projectRegisterPage",
      Nil,
      "GET",
      this.prefix + """project/projectRegisterPage""",
      """######################################################### Projects #####################################################################""",
      Seq()
    )
  )

  // @LINE:44
  private[this] lazy val controllers_ProjectController_projectRegisterPOST20_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/projectRegisterPOST")))
  )
  private[this] lazy val controllers_ProjectController_projectRegisterPOST20_invoker = createInvoker(
    ProjectController_12.projectRegisterPOST(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "projectRegisterPOST",
      Nil,
      "POST",
      this.prefix + """project/projectRegisterPOST""",
      """""",
      Seq()
    )
  )

  // @LINE:45
  private[this] lazy val controllers_ProjectController_projectEditPage21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/projectEditPage/"), DynamicPart("projectId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjectController_projectEditPage21_invoker = createInvoker(
    ProjectController_12.projectEditPage(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "projectEditPage",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """project/projectEditPage/""" + "$" + """projectId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:46
  private[this] lazy val controllers_ProjectController_projectEditPOST22_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/projectEditPOST/"), DynamicPart("projectId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjectController_projectEditPOST22_invoker = createInvoker(
    ProjectController_12.projectEditPOST(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "projectEditPOST",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """project/projectEditPOST/""" + "$" + """projectId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:48
  private[this] lazy val controllers_ProjectController_projectList23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/projectList/"), DynamicPart("pageNum", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjectController_projectList23_invoker = createInvoker(
    ProjectController_12.projectList(fakeValue[Integer], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "projectList",
      Seq(classOf[Integer], classOf[String]),
      "GET",
      this.prefix + """project/projectList/""" + "$" + """pageNum<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:49
  private[this] lazy val controllers_ProjectController_projectDetail24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/projectDetail/"), DynamicPart("projectId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjectController_projectDetail24_invoker = createInvoker(
    ProjectController_12.projectDetail(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "projectDetail",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """project/projectDetail/""" + "$" + """projectId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:50
  private[this] lazy val controllers_ProjectController_searchPage25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/searchPage")))
  )
  private[this] lazy val controllers_ProjectController_searchPage25_invoker = createInvoker(
    ProjectController_12.searchPage(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "searchPage",
      Nil,
      "GET",
      this.prefix + """project/searchPage""",
      """""",
      Seq()
    )
  )

  // @LINE:51
  private[this] lazy val controllers_ProjectController_searchPOST26_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/searchPOST")))
  )
  private[this] lazy val controllers_ProjectController_searchPOST26_invoker = createInvoker(
    ProjectController_12.searchPOST(fakeValue[Integer], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "searchPOST",
      Seq(classOf[Integer], classOf[String]),
      "POST",
      this.prefix + """project/searchPOST""",
      """""",
      Seq()
    )
  )

  // @LINE:52
  private[this] lazy val controllers_ProjectController_deleteProject27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/deleteProject/"), DynamicPart("projectId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjectController_deleteProject27_invoker = createInvoker(
    ProjectController_12.deleteProject(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "deleteProject",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """project/deleteProject/""" + "$" + """projectId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:53
  private[this] lazy val controllers_ProjectController_isProjectNameExisted28_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/isProjectNameExisted")))
  )
  private[this] lazy val controllers_ProjectController_isProjectNameExisted28_invoker = createInvoker(
    ProjectController_12.isProjectNameExisted(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "isProjectNameExisted",
      Nil,
      "POST",
      this.prefix + """project/isProjectNameExisted""",
      """""",
      Seq()
    )
  )

  // @LINE:54
  private[this] lazy val controllers_ProjectController_uploadDescriptionImage29_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/uploadDescriptionImg/"), DynamicPart("projectId", """[^/]+""",true), StaticPart("/"), DynamicPart("imageNumber", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjectController_uploadDescriptionImage29_invoker = createInvoker(
    ProjectController_12.uploadDescriptionImage(fakeValue[Long], fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "uploadDescriptionImage",
      Seq(classOf[Long], classOf[Integer]),
      "POST",
      this.prefix + """project/uploadDescriptionImg/""" + "$" + """projectId<[^/]+>/""" + "$" + """imageNumber<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:55
  private[this] lazy val controllers_ProjectController_renameDescriptionImage30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/renameDescriptionImg/"), DynamicPart("projectId", """[^/]+""",true), StaticPart("/"), DynamicPart("imageNumber", """[^/]+""",true), StaticPart("/"), DynamicPart("currentImageNumber", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjectController_renameDescriptionImage30_invoker = createInvoker(
    ProjectController_12.renameDescriptionImage(fakeValue[Long], fakeValue[Integer], fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "renameDescriptionImage",
      Seq(classOf[Long], classOf[Integer], classOf[Integer]),
      "GET",
      this.prefix + """project/renameDescriptionImg/""" + "$" + """projectId<[^/]+>/""" + "$" + """imageNumber<[^/]+>/""" + "$" + """currentImageNumber<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:59
  private[this] lazy val controllers_ProjectController_isProjectExist31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/doesProjectExist/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjectController_isProjectExist31_invoker = createInvoker(
    ProjectController_12.isProjectExist(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "isProjectExist",
      Seq(classOf[String]),
      "GET",
      this.prefix + """project/doesProjectExist/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:60
  private[this] lazy val controllers_ProjectController_associateProjectsToNotebook32_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/associateProjectsToNotebook/"), DynamicPart("notebookId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjectController_associateProjectsToNotebook32_invoker = createInvoker(
    ProjectController_12.associateProjectsToNotebook(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "associateProjectsToNotebook",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """project/associateProjectsToNotebook/""" + "$" + """notebookId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:61
  private[this] lazy val controllers_ProjectController_getProjectLists33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/getProjects")))
  )
  private[this] lazy val controllers_ProjectController_getProjectLists33_invoker = createInvoker(
    ProjectController_12.getProjectLists(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "getProjectLists",
      Nil,
      "GET",
      this.prefix + """project/getProjects""",
      """""",
      Seq()
    )
  )

  // @LINE:62
  private[this] lazy val controllers_ProjectController_getMyEnrolledProjects34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/myEnrolledProjects/"), DynamicPart("pageNum", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjectController_getMyEnrolledProjects34_invoker = createInvoker(
    ProjectController_12.getMyEnrolledProjects(fakeValue[Integer], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "getMyEnrolledProjects",
      Seq(classOf[Integer], classOf[String]),
      "GET",
      this.prefix + """project/myEnrolledProjects/""" + "$" + """pageNum<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:63
  private[this] lazy val controllers_ProjectController_setProjectZoneAsGeoNEX35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/setProjectZoneAsGeoNEX")))
  )
  private[this] lazy val controllers_ProjectController_setProjectZoneAsGeoNEX35_invoker = createInvoker(
    ProjectController_12.setProjectZoneAsGeoNEX(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "setProjectZoneAsGeoNEX",
      Nil,
      "GET",
      this.prefix + """project/setProjectZoneAsGeoNEX""",
      """""",
      Seq()
    )
  )

  // @LINE:64
  private[this] lazy val controllers_ProjectController_followedByUser36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/followedByUser/"), DynamicPart("id", """[^/]+""",true), StaticPart("/"), DynamicPart("eventList", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjectController_followedByUser36_invoker = createInvoker(
    ProjectController_12.followedByUser(fakeValue[Long], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "followedByUser",
      Seq(classOf[Long], classOf[String]),
      "GET",
      this.prefix + """project/followedByUser/""" + "$" + """id<[^/]+>/""" + "$" + """eventList<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:65
  private[this] lazy val controllers_ProjectController_unFollowedByUser37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/unFollowedByUser/"), DynamicPart("id", """[^/]+""",true), StaticPart("/"), DynamicPart("eventList", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjectController_unFollowedByUser37_invoker = createInvoker(
    ProjectController_12.unFollowedByUser(fakeValue[Long], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "unFollowedByUser",
      Seq(classOf[Long], classOf[String]),
      "GET",
      this.prefix + """project/unFollowedByUser/""" + "$" + """id<[^/]+>/""" + "$" + """eventList<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:66
  private[this] lazy val controllers_ProjectController_myFollowedProjects38_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/myFollowedProjects")))
  )
  private[this] lazy val controllers_ProjectController_myFollowedProjects38_invoker = createInvoker(
    ProjectController_12.myFollowedProjects(fakeValue[Integer], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "myFollowedProjects",
      Seq(classOf[Integer], classOf[String]),
      "GET",
      this.prefix + """project/myFollowedProjects""",
      """""",
      Seq()
    )
  )

  // @LINE:67
  private[this] lazy val controllers_ProjectController_checkParentProject39_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/checkParentProject/"), DynamicPart("parentProjectId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjectController_checkParentProject39_invoker = createInvoker(
    ProjectController_12.checkParentProject(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "checkParentProject",
      Seq(classOf[String]),
      "GET",
      this.prefix + """project/checkParentProject/""" + "$" + """parentProjectId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:68
  private[this] lazy val controllers_ProjectController_addProjectFollowersPage40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/addProjectFollowersPage/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjectController_addProjectFollowersPage40_invoker = createInvoker(
    ProjectController_12.addProjectFollowersPage(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "addProjectFollowersPage",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """project/addProjectFollowersPage/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:69
  private[this] lazy val controllers_ProjectController_addOneFollower41_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/addOneFollower/"), DynamicPart("id", """[^/]+""",true), StaticPart("/"), DynamicPart("event", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjectController_addOneFollower41_invoker = createInvoker(
    ProjectController_12.addOneFollower(fakeValue[Long], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "addOneFollower",
      Seq(classOf[Long], classOf[String]),
      "POST",
      this.prefix + """project/addOneFollower/""" + "$" + """id<[^/]+>/""" + "$" + """event<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:70
  private[this] lazy val controllers_ProjectController_deleteOneFollower42_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/deleteOneFollower/"), DynamicPart("userId", """[^/]+""",true), StaticPart("/"), DynamicPart("projectId", """[^/]+""",true), StaticPart("/"), DynamicPart("eventType", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjectController_deleteOneFollower42_invoker = createInvoker(
    ProjectController_12.deleteOneFollower(fakeValue[Long], fakeValue[Long], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "deleteOneFollower",
      Seq(classOf[Long], classOf[Long], classOf[String]),
      "GET",
      this.prefix + """project/deleteOneFollower/""" + "$" + """userId<[^/]+>/""" + "$" + """projectId<[^/]+>/""" + "$" + """eventType<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:75
  private[this] lazy val controllers_ChallengeController_challengeRegisterPage43_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("challenge/challengeRegisterPage")))
  )
  private[this] lazy val controllers_ChallengeController_challengeRegisterPage43_invoker = createInvoker(
    ChallengeController_16.challengeRegisterPage(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChallengeController",
      "challengeRegisterPage",
      Nil,
      "GET",
      this.prefix + """challenge/challengeRegisterPage""",
      """######################################################### Challenge ####################################################################""",
      Seq()
    )
  )

  // @LINE:76
  private[this] lazy val controllers_ChallengeController_challengeRegisterPOST44_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("challenge/challengeRegisterPOST")))
  )
  private[this] lazy val controllers_ChallengeController_challengeRegisterPOST44_invoker = createInvoker(
    ChallengeController_16.challengeRegisterPOST(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChallengeController",
      "challengeRegisterPOST",
      Nil,
      "POST",
      this.prefix + """challenge/challengeRegisterPOST""",
      """""",
      Seq()
    )
  )

  // @LINE:78
  private[this] lazy val controllers_ChallengeController_challengeApplyPage45_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("challenge/challengeApplyPage/"), DynamicPart("challengeId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ChallengeController_challengeApplyPage45_invoker = createInvoker(
    ChallengeController_16.challengeApplyPage(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChallengeController",
      "challengeApplyPage",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """challenge/challengeApplyPage/""" + "$" + """challengeId<[^/]+>""",
      """ POST        /challenge/challengeApplicationPOST/:challengeId/:applicantId                   controllers.ChallengeController.challengeApplitionPOST(challengeId: Long, applicantId: Long)""",
      Seq()
    )
  )

  // @LINE:79
  private[this] lazy val controllers_ChallengeController_challengeApplyPOST46_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("challenge/challengeApplyPOST/"), DynamicPart("challengeId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ChallengeController_challengeApplyPOST46_invoker = createInvoker(
    ChallengeController_16.challengeApplyPOST(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChallengeController",
      "challengeApplyPOST",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """challenge/challengeApplyPOST/""" + "$" + """challengeId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:80
  private[this] lazy val controllers_ChallengeController_challengeEditPage47_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("challenge/challengeEditPage/"), DynamicPart("challengeId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ChallengeController_challengeEditPage47_invoker = createInvoker(
    ChallengeController_16.challengeEditPage(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChallengeController",
      "challengeEditPage",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """challenge/challengeEditPage/""" + "$" + """challengeId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:81
  private[this] lazy val controllers_ChallengeController_challengeEditPageAdmin48_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("challenge/challengeEditPageAdmin/"), DynamicPart("challengeId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ChallengeController_challengeEditPageAdmin48_invoker = createInvoker(
    ChallengeController_16.challengeEditPageAdmin(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChallengeController",
      "challengeEditPageAdmin",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """challenge/challengeEditPageAdmin/""" + "$" + """challengeId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:82
  private[this] lazy val controllers_ChallengeController_challengeEditPOST49_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("challenge/challengeEditPOST/"), DynamicPart("challengeId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ChallengeController_challengeEditPOST49_invoker = createInvoker(
    ChallengeController_16.challengeEditPOST(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChallengeController",
      "challengeEditPOST",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """challenge/challengeEditPOST/""" + "$" + """challengeId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:83
  private[this] lazy val controllers_ChallengeController_challengeEditPOSTAdmin50_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("challenge/challengeEditPOSTAdmin/"), DynamicPart("challengeId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ChallengeController_challengeEditPOSTAdmin50_invoker = createInvoker(
    ChallengeController_16.challengeEditPOSTAdmin(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChallengeController",
      "challengeEditPOSTAdmin",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """challenge/challengeEditPOSTAdmin/""" + "$" + """challengeId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:84
  private[this] lazy val controllers_ChallengeController_closeChallenge51_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("challenge/closeChallenge/"), DynamicPart("challengeId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ChallengeController_closeChallenge51_invoker = createInvoker(
    ChallengeController_16.closeChallenge(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChallengeController",
      "closeChallenge",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """challenge/closeChallenge/""" + "$" + """challengeId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:85
  private[this] lazy val controllers_ChallengeController_challengeApplicationsList52_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("challenge/applications/"), DynamicPart("challengeType", """[^/]+""",true), StaticPart("/"), DynamicPart("challengeId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ChallengeController_challengeApplicationsList52_invoker = createInvoker(
    ChallengeController_16.challengeApplicationsList(fakeValue[String], fakeValue[Long], fakeValue[Integer], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChallengeController",
      "challengeApplicationsList",
      Seq(classOf[String], classOf[Long], classOf[Integer], classOf[String]),
      "GET",
      this.prefix + """challenge/applications/""" + "$" + """challengeType<[^/]+>/""" + "$" + """challengeId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:89
  private[this] lazy val controllers_ChallengeController_challengeApplicationStatusChange53_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("challenge/challengeApplicationStatusChange/"), DynamicPart("challengeApplicationId", """[^/]+""",true), StaticPart("/"), DynamicPart("challengeApplicationStatus", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ChallengeController_challengeApplicationStatusChange53_invoker = createInvoker(
    ChallengeController_16.challengeApplicationStatusChange(fakeValue[Long], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChallengeController",
      "challengeApplicationStatusChange",
      Seq(classOf[Long], classOf[String]),
      "POST",
      this.prefix + """challenge/challengeApplicationStatusChange/""" + "$" + """challengeApplicationId<[^/]+>/""" + "$" + """challengeApplicationStatus<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:91
  private[this] lazy val controllers_ChallengeController_challengeListAppliedByUser54_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("challenge/challengeListAppliedByUser/"), DynamicPart("pageNum", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ChallengeController_challengeListAppliedByUser54_invoker = createInvoker(
    ChallengeController_16.challengeListAppliedByUser(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChallengeController",
      "challengeListAppliedByUser",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """challenge/challengeListAppliedByUser/""" + "$" + """pageNum<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:92
  private[this] lazy val controllers_ChallengeController_challengeApplicationList55_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("challenge/challengeApplicationList/"), DynamicPart("pageNum", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ChallengeController_challengeApplicationList55_invoker = createInvoker(
    ChallengeController_16.challengeApplicationList(fakeValue[Integer], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChallengeController",
      "challengeApplicationList",
      Seq(classOf[Integer], classOf[String]),
      "GET",
      this.prefix + """challenge/challengeApplicationList/""" + "$" + """pageNum<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:93
  private[this] lazy val controllers_ChallengeController_challengeListPostedByUser56_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("challenge/challengeListPostedByUser/"), DynamicPart("pageNum", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ChallengeController_challengeListPostedByUser56_invoker = createInvoker(
    ChallengeController_16.challengeListPostedByUser(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChallengeController",
      "challengeListPostedByUser",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """challenge/challengeListPostedByUser/""" + "$" + """pageNum<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:94
  private[this] lazy val controllers_ChallengeController_challengeApplicationDetail57_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("challenge/challengeApplicationDetail/"), DynamicPart("challengeApplicationId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ChallengeController_challengeApplicationDetail57_invoker = createInvoker(
    ChallengeController_16.challengeApplicationDetail(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChallengeController",
      "challengeApplicationDetail",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """challenge/challengeApplicationDetail/""" + "$" + """challengeApplicationId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:95
  private[this] lazy val controllers_ChallengeController_challengeStatusChange58_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("challenge/challengeStatus/"), DynamicPart("challengeId", """[^/]+""",true), StaticPart("/"), DynamicPart("challengeStatus", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ChallengeController_challengeStatusChange58_invoker = createInvoker(
    ChallengeController_16.challengeStatusChange(fakeValue[Long], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChallengeController",
      "challengeStatusChange",
      Seq(classOf[Long], classOf[String]),
      "POST",
      this.prefix + """challenge/challengeStatus/""" + "$" + """challengeId<[^/]+>/""" + "$" + """challengeStatus<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:96
  private[this] lazy val controllers_ChallengeController_challengeApplicationsDetail59_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("challenge/challengeApplicationsDetail/"), DynamicPart("challengeApplicationId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ChallengeController_challengeApplicationsDetail59_invoker = createInvoker(
    ChallengeController_16.challengeApplicationsDetail(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChallengeController",
      "challengeApplicationsDetail",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """challenge/challengeApplicationsDetail/""" + "$" + """challengeApplicationId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:98
  private[this] lazy val controllers_ChallengeController_challengeList60_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("challenge/challengeList/"), DynamicPart("pageNum", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ChallengeController_challengeList60_invoker = createInvoker(
    ChallengeController_16.challengeList(fakeValue[Integer], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChallengeController",
      "challengeList",
      Seq(classOf[Integer], classOf[String]),
      "GET",
      this.prefix + """challenge/challengeList/""" + "$" + """pageNum<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:99
  private[this] lazy val controllers_ChallengeController_challengeListAdmin61_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("challenge/challengeListAdmin/"), DynamicPart("pageNum", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ChallengeController_challengeListAdmin61_invoker = createInvoker(
    ChallengeController_16.challengeListAdmin(fakeValue[Integer], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChallengeController",
      "challengeListAdmin",
      Seq(classOf[Integer], classOf[String]),
      "GET",
      this.prefix + """challenge/challengeListAdmin/""" + "$" + """pageNum<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:100
  private[this] lazy val controllers_ChallengeController_challengeDetail62_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("challenge/challengeDetail/"), DynamicPart("challengeId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ChallengeController_challengeDetail62_invoker = createInvoker(
    ChallengeController_16.challengeDetail(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChallengeController",
      "challengeDetail",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """challenge/challengeDetail/""" + "$" + """challengeId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:101
  private[this] lazy val controllers_ChallengeController_searchPage63_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("challenge/searchPage")))
  )
  private[this] lazy val controllers_ChallengeController_searchPage63_invoker = createInvoker(
    ChallengeController_16.searchPage(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChallengeController",
      "searchPage",
      Nil,
      "GET",
      this.prefix + """challenge/searchPage""",
      """""",
      Seq()
    )
  )

  // @LINE:102
  private[this] lazy val controllers_ChallengeController_searchPOST64_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("challenge/searchPOST/"), DynamicPart("pageNum", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ChallengeController_searchPOST64_invoker = createInvoker(
    ChallengeController_16.searchPOST(fakeValue[Integer], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChallengeController",
      "searchPOST",
      Seq(classOf[Integer], classOf[String]),
      "POST",
      this.prefix + """challenge/searchPOST/""" + "$" + """pageNum<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:130
  private[this] lazy val controllers_UserController_userRegisterPage65_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/userRegisterPage")))
  )
  private[this] lazy val controllers_UserController_userRegisterPage65_invoker = createInvoker(
    UserController_10.userRegisterPage(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "userRegisterPage",
      Nil,
      "GET",
      this.prefix + """user/userRegisterPage""",
      """######################################################### Users #####################################################################""",
      Seq()
    )
  )

  // @LINE:131
  private[this] lazy val controllers_UserController_userForgotPasswordPage66_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/userForgotPasswordPage")))
  )
  private[this] lazy val controllers_UserController_userForgotPasswordPage66_invoker = createInvoker(
    UserController_10.userForgotPasswordPage(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "userForgotPasswordPage",
      Nil,
      "GET",
      this.prefix + """user/userForgotPasswordPage""",
      """""",
      Seq()
    )
  )

  // @LINE:132
  private[this] lazy val controllers_UserController_resendActivationEmail67_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/resendActivationEmail")))
  )
  private[this] lazy val controllers_UserController_resendActivationEmail67_invoker = createInvoker(
    UserController_10.resendActivationEmail(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "resendActivationEmail",
      Nil,
      "GET",
      this.prefix + """user/resendActivationEmail""",
      """""",
      Seq()
    )
  )

  // @LINE:133
  private[this] lazy val controllers_UserController_userResetPassword68_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/userResetPassword")))
  )
  private[this] lazy val controllers_UserController_userResetPassword68_invoker = createInvoker(
    UserController_10.userResetPassword(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "userResetPassword",
      Nil,
      "POST",
      this.prefix + """user/userResetPassword""",
      """""",
      Seq()
    )
  )

  // @LINE:134
  private[this] lazy val controllers_UserController_updatePasswordPage69_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/userUpdatePasswordPage")))
  )
  private[this] lazy val controllers_UserController_updatePasswordPage69_invoker = createInvoker(
    UserController_10.updatePasswordPage(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "updatePasswordPage",
      Nil,
      "GET",
      this.prefix + """user/userUpdatePasswordPage""",
      """""",
      Seq()
    )
  )

  // @LINE:135
  private[this] lazy val controllers_UserController_updatePasswordForUser70_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/userUpdatePasswordForUser")))
  )
  private[this] lazy val controllers_UserController_updatePasswordForUser70_invoker = createInvoker(
    UserController_10.updatePasswordForUser(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "updatePasswordForUser",
      Nil,
      "POST",
      this.prefix + """user/userUpdatePasswordForUser""",
      """""",
      Seq()
    )
  )

  // @LINE:136
  private[this] lazy val controllers_UserController_userRegisterPOST71_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/userRegister")))
  )
  private[this] lazy val controllers_UserController_userRegisterPOST71_invoker = createInvoker(
    UserController_10.userRegisterPOST(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "userRegisterPOST",
      Nil,
      "GET",
      this.prefix + """users/userRegister""",
      """""",
      Seq()
    )
  )

  // @LINE:137
  private[this] lazy val controllers_UserController_userEditPage72_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/userEditPage")))
  )
  private[this] lazy val controllers_UserController_userEditPage72_invoker = createInvoker(
    UserController_10.userEditPage(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "userEditPage",
      Nil,
      "GET",
      this.prefix + """user/userEditPage""",
      """""",
      Seq()
    )
  )

  // @LINE:138
  private[this] lazy val controllers_UserController_userEditPOST73_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/userEditPOST")))
  )
  private[this] lazy val controllers_UserController_userEditPOST73_invoker = createInvoker(
    UserController_10.userEditPOST(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "userEditPOST",
      Nil,
      "POST",
      this.prefix + """user/userEditPOST""",
      """""",
      Seq()
    )
  )

  // @LINE:139
  private[this] lazy val controllers_UserController_isEmailExisted74_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/isEmailExisted")))
  )
  private[this] lazy val controllers_UserController_isEmailExisted74_invoker = createInvoker(
    UserController_10.isEmailExisted(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "isEmailExisted",
      Nil,
      "POST",
      this.prefix + """user/isEmailExisted""",
      """""",
      Seq()
    )
  )

  // @LINE:140
  private[this] lazy val controllers_UserController_userList75_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/userList/"), DynamicPart("pageNum", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_userList75_invoker = createInvoker(
    UserController_10.userList(fakeValue[Integer], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "userList",
      Seq(classOf[Integer], classOf[String]),
      "GET",
      this.prefix + """user/userList/""" + "$" + """pageNum<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:141
  private[this] lazy val controllers_UserController_userDetailPage76_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/userDetailPage/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_userDetailPage76_invoker = createInvoker(
    UserController_10.userDetailPage(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "userDetailPage",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """user/userDetailPage/""" + "$" + """userId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:143
  private[this] lazy val controllers_UserController_userLogin77_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/userLogin")))
  )
  private[this] lazy val controllers_UserController_userLogin77_invoker = createInvoker(
    UserController_10.userLogin(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "userLogin",
      Nil,
      "POST",
      this.prefix + """user/userLogin""",
      """""",
      Seq()
    )
  )

  // @LINE:144
  private[this] lazy val controllers_UserController_userImageByImageId78_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/userImageByImageId/"), DynamicPart("imageId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_userImageByImageId78_invoker = createInvoker(
    UserController_10.userImageByImageId(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "userImageByImageId",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """user/userImageByImageId/""" + "$" + """imageId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:145
  private[this] lazy val controllers_UserController_validateEmail79_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/validateEmail")))
  )
  private[this] lazy val controllers_UserController_validateEmail79_invoker = createInvoker(
    UserController_10.validateEmail(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "validateEmail",
      Nil,
      "POST",
      this.prefix + """user/validateEmail""",
      """""",
      Seq()
    )
  )

  // @LINE:146
  private[this] lazy val controllers_UserController_followedByUser80_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/followedByUser/"), DynamicPart("id", """[^/]+""",true), StaticPart("/"), DynamicPart("page", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_followedByUser80_invoker = createInvoker(
    UserController_10.followedByUser(fakeValue[Long], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "followedByUser",
      Seq(classOf[Long], classOf[String]),
      "GET",
      this.prefix + """user/followedByUser/""" + "$" + """id<[^/]+>/""" + "$" + """page<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:147
  private[this] lazy val controllers_UserController_unFollowedByUser81_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/unFollowedByUser/"), DynamicPart("id", """[^/]+""",true), StaticPart("/"), DynamicPart("page", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_unFollowedByUser81_invoker = createInvoker(
    UserController_10.unFollowedByUser(fakeValue[Long], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "unFollowedByUser",
      Seq(classOf[Long], classOf[String]),
      "GET",
      this.prefix + """user/unFollowedByUser/""" + "$" + """id<[^/]+>/""" + "$" + """page<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:148
  private[this] lazy val controllers_UserController_updateLevel82_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/updateLevel/"), DynamicPart("uid", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_updateLevel82_invoker = createInvoker(
    UserController_10.updateLevel(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "updateLevel",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """user/updateLevel/""" + "$" + """uid<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:149
  private[this] lazy val controllers_UserController_updatePassword83_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/updatePassword")))
  )
  private[this] lazy val controllers_UserController_updatePassword83_invoker = createInvoker(
    UserController_10.updatePassword,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "updatePassword",
      Nil,
      "POST",
      this.prefix + """user/updatePassword""",
      """""",
      Seq()
    )
  )

  // @LINE:150
  private[this] lazy val controllers_UserController_checkPassword84_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/checkCurPassword")))
  )
  private[this] lazy val controllers_UserController_checkPassword84_invoker = createInvoker(
    UserController_10.checkPassword(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "checkPassword",
      Nil,
      "POST",
      this.prefix + """user/checkCurPassword""",
      """""",
      Seq()
    )
  )

  // @LINE:153
  private[this] lazy val controllers_UserController_searchPage85_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/searchPage")))
  )
  private[this] lazy val controllers_UserController_searchPage85_invoker = createInvoker(
    UserController_10.searchPage(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "searchPage",
      Nil,
      "GET",
      this.prefix + """user/searchPage""",
      """""",
      Seq()
    )
  )

  // @LINE:154
  private[this] lazy val controllers_UserController_searchPOST86_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/searchPOST")))
  )
  private[this] lazy val controllers_UserController_searchPOST86_invoker = createInvoker(
    UserController_10.searchPOST(fakeValue[Integer], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "searchPOST",
      Seq(classOf[Integer], classOf[String]),
      "POST",
      this.prefix + """user/searchPOST""",
      """""",
      Seq()
    )
  )

  // @LINE:155
  private[this] lazy val controllers_UserController_userDelete87_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/userDelete")))
  )
  private[this] lazy val controllers_UserController_userDelete87_invoker = createInvoker(
    UserController_10.userDelete(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "userDelete",
      Nil,
      "GET",
      this.prefix + """user/userDelete""",
      """""",
      Seq()
    )
  )

  // @LINE:156
  private[this] lazy val controllers_UserController_allUserIds88_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/allUserIds")))
  )
  private[this] lazy val controllers_UserController_allUserIds88_invoker = createInvoker(
    UserController_10.allUserIds(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "allUserIds",
      Nil,
      "GET",
      this.prefix + """user/allUserIds""",
      """""",
      Seq()
    )
  )

  // @LINE:158
  private[this] lazy val controllers_UserController_myFollowers89_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/myFollowers")))
  )
  private[this] lazy val controllers_UserController_myFollowers89_invoker = createInvoker(
    UserController_10.myFollowers(fakeValue[Integer], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "myFollowers",
      Seq(classOf[Integer], classOf[String]),
      "GET",
      this.prefix + """user/myFollowers""",
      """""",
      Seq()
    )
  )

  // @LINE:159
  private[this] lazy val controllers_UserController_myFollowees90_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/myFollowees")))
  )
  private[this] lazy val controllers_UserController_myFollowees90_invoker = createInvoker(
    UserController_10.myFollowees(fakeValue[Integer], fakeValue[String], fakeValue[Boolean]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "myFollowees",
      Seq(classOf[Integer], classOf[String], classOf[Boolean]),
      "GET",
      this.prefix + """user/myFollowees""",
      """""",
      Seq()
    )
  )

  // @LINE:161
  private[this] lazy val controllers_UserController_mySpacePage91_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/mySpace")))
  )
  private[this] lazy val controllers_UserController_mySpacePage91_invoker = createInvoker(
    UserController_10.mySpacePage(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "mySpacePage",
      Nil,
      "GET",
      this.prefix + """user/mySpace""",
      """""",
      Seq()
    )
  )

  // @LINE:163
  private[this] lazy val controllers_UserController_activateUser92_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/"), DynamicPart("hashcode", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_activateUser92_invoker = createInvoker(
    UserController_10.activateUser(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "activateUser",
      Seq(classOf[String]),
      "GET",
      this.prefix + """users/""" + "$" + """hashcode<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:170
  private[this] lazy val controllers_UserController_userSaved93_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/"), DynamicPart("hashcode", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_userSaved93_invoker = createInvoker(
    UserController_10.userSaved(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "userSaved",
      Seq(classOf[String]),
      "GET",
      this.prefix + """users/""" + "$" + """hashcode<[^/]+>""",
      """####### All new routes items with user please go beyond this line!!! ################################################################""",
      Seq()
    )
  )

  // @LINE:174
  private[this] lazy val controllers_OrganizationController_organizationDetailPageAdmin94_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("organization/organizationDetailPageAdmin/"), DynamicPart("organizationId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_OrganizationController_organizationDetailPageAdmin94_invoker = createInvoker(
    OrganizationController_17.organizationDetailPageAdmin(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrganizationController",
      "organizationDetailPageAdmin",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """organization/organizationDetailPageAdmin/""" + "$" + """organizationId<[^/]+>""",
      """######################################################### Organizations ######################################################################""",
      Seq()
    )
  )

  // @LINE:175
  private[this] lazy val controllers_OrganizationController_organizationDetailPage95_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("organization/organizationDetailPage/"), DynamicPart("organizationId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_OrganizationController_organizationDetailPage95_invoker = createInvoker(
    OrganizationController_17.organizationDetailPage(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrganizationController",
      "organizationDetailPage",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """organization/organizationDetailPage/""" + "$" + """organizationId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:177
  private[this] lazy val controllers_OrganizationController_organizationListPage96_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("organization/organizationListPage/"), DynamicPart("pageNum", """[^/]+""",true)))
  )
  private[this] lazy val controllers_OrganizationController_organizationListPage96_invoker = createInvoker(
    OrganizationController_17.organizationListPage(fakeValue[Integer], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrganizationController",
      "organizationListPage",
      Seq(classOf[Integer], classOf[String]),
      "GET",
      this.prefix + """organization/organizationListPage/""" + "$" + """pageNum<[^/]+>""",
      """GET         /organization/organizationList                                                  controllers.OrganizationController.organizationList()""",
      Seq()
    )
  )

  // @LINE:178
  private[this] lazy val controllers_OrganizationController_organizationRegisterPOST97_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("organization/organizationRegisterPOST")))
  )
  private[this] lazy val controllers_OrganizationController_organizationRegisterPOST97_invoker = createInvoker(
    OrganizationController_17.organizationRegisterPOST(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrganizationController",
      "organizationRegisterPOST",
      Nil,
      "POST",
      this.prefix + """organization/organizationRegisterPOST""",
      """""",
      Seq()
    )
  )

  // @LINE:179
  private[this] lazy val controllers_OrganizationController_organizationEditPOST98_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("organization/organizationEditPOST")))
  )
  private[this] lazy val controllers_OrganizationController_organizationEditPOST98_invoker = createInvoker(
    OrganizationController_17.organizationEditPOST(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrganizationController",
      "organizationEditPOST",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """organization/organizationEditPOST""",
      """""",
      Seq()
    )
  )

  // @LINE:180
  private[this] lazy val controllers_OrganizationController_organizationRegisterPage99_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("organization/organizationRegisterPage")))
  )
  private[this] lazy val controllers_OrganizationController_organizationRegisterPage99_invoker = createInvoker(
    OrganizationController_17.organizationRegisterPage,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrganizationController",
      "organizationRegisterPage",
      Nil,
      "GET",
      this.prefix + """organization/organizationRegisterPage""",
      """""",
      Seq()
    )
  )

  // @LINE:181
  private[this] lazy val controllers_OrganizationController_organizationEditPage100_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("organization/organizationEditPage")))
  )
  private[this] lazy val controllers_OrganizationController_organizationEditPage100_invoker = createInvoker(
    OrganizationController_17.organizationEditPage(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrganizationController",
      "organizationEditPage",
      Nil,
      "GET",
      this.prefix + """organization/organizationEditPage""",
      """""",
      Seq()
    )
  )

  // @LINE:182
  private[this] lazy val controllers_OrganizationController_searchPage101_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("organization/searchPage")))
  )
  private[this] lazy val controllers_OrganizationController_searchPage101_invoker = createInvoker(
    OrganizationController_17.searchPage,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrganizationController",
      "searchPage",
      Nil,
      "GET",
      this.prefix + """organization/searchPage""",
      """""",
      Seq()
    )
  )

  // @LINE:183
  private[this] lazy val controllers_OrganizationController_searchPOST102_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("organization/searchPOST")))
  )
  private[this] lazy val controllers_OrganizationController_searchPOST102_invoker = createInvoker(
    OrganizationController_17.searchPOST(fakeValue[Integer], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrganizationController",
      "searchPOST",
      Seq(classOf[Integer], classOf[String]),
      "POST",
      this.prefix + """organization/searchPOST""",
      """""",
      Seq()
    )
  )

  // @LINE:187
  private[this] lazy val controllers_BugReportController_bugReportRegisterPage103_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bugReport/bugReportRegisterPage")))
  )
  private[this] lazy val controllers_BugReportController_bugReportRegisterPage103_invoker = createInvoker(
    BugReportController_6.bugReportRegisterPage(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BugReportController",
      "bugReportRegisterPage",
      Nil,
      "GET",
      this.prefix + """bugReport/bugReportRegisterPage""",
      """######################################################### Bug Reports ############################################################################""",
      Seq()
    )
  )

  // @LINE:188
  private[this] lazy val controllers_BugReportController_bugReportRegisterPOST104_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bugReport/bugReportRegisterPOST")))
  )
  private[this] lazy val controllers_BugReportController_bugReportRegisterPOST104_invoker = createInvoker(
    BugReportController_6.bugReportRegisterPOST(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BugReportController",
      "bugReportRegisterPOST",
      Nil,
      "POST",
      this.prefix + """bugReport/bugReportRegisterPOST""",
      """""",
      Seq()
    )
  )

  // @LINE:189
  private[this] lazy val controllers_BugReportController_bugReportEditPage105_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bugReport/bugReportEditPage/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BugReportController_bugReportEditPage105_invoker = createInvoker(
    BugReportController_6.bugReportEditPage(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BugReportController",
      "bugReportEditPage",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """bugReport/bugReportEditPage/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:190
  private[this] lazy val controllers_BugReportController_bugReportEditPOST106_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bugReport/bugReportEditPost/"), DynamicPart("bugReportId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BugReportController_bugReportEditPOST106_invoker = createInvoker(
    BugReportController_6.bugReportEditPOST(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BugReportController",
      "bugReportEditPOST",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """bugReport/bugReportEditPost/""" + "$" + """bugReportId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:191
  private[this] lazy val controllers_BugReportController_bugReportDetail107_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bugReport/bugReportDetail/"), DynamicPart("bugReportId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BugReportController_bugReportDetail107_invoker = createInvoker(
    BugReportController_6.bugReportDetail(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BugReportController",
      "bugReportDetail",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """bugReport/bugReportDetail/""" + "$" + """bugReportId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:192
  private[this] lazy val controllers_BugReportController_bugReportList108_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bugReport/bugReportList")))
  )
  private[this] lazy val controllers_BugReportController_bugReportList108_invoker = createInvoker(
    BugReportController_6.bugReportList(fakeValue[Long], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BugReportController",
      "bugReportList",
      Seq(classOf[Long], classOf[String]),
      "GET",
      this.prefix + """bugReport/bugReportList""",
      """""",
      Seq()
    )
  )

  // @LINE:193
  private[this] lazy val controllers_BugReportController_bugReportDelete109_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bugReport/bugReportDelete/"), DynamicPart("bugReportId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BugReportController_bugReportDelete109_invoker = createInvoker(
    BugReportController_6.bugReportDelete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BugReportController",
      "bugReportDelete",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """bugReport/bugReportDelete/""" + "$" + """bugReportId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:195
  private[this] lazy val controllers_BugReportController_markAsSolved110_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bugReport/solve/"), DynamicPart("bugReportId", """[^/]+""",true), StaticPart("/"), DynamicPart("fixerId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BugReportController_markAsSolved110_invoker = createInvoker(
    BugReportController_6.markAsSolved(fakeValue[Long], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BugReportController",
      "markAsSolved",
      Seq(classOf[Long], classOf[Long]),
      "GET",
      this.prefix + """bugReport/solve/""" + "$" + """bugReportId<[^/]+>/""" + "$" + """fixerId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:199
  private[this] lazy val controllers_SuggestionController_suggestionRegisterPage111_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("suggestion/suggestionRegisterPage")))
  )
  private[this] lazy val controllers_SuggestionController_suggestionRegisterPage111_invoker = createInvoker(
    SuggestionController_1.suggestionRegisterPage(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SuggestionController",
      "suggestionRegisterPage",
      Nil,
      "GET",
      this.prefix + """suggestion/suggestionRegisterPage""",
      """######################################################### Suggestions #####################################################################""",
      Seq()
    )
  )

  // @LINE:200
  private[this] lazy val controllers_SuggestionController_suggestionRegisterPOST112_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("suggestion/suggestionRegisterPOST")))
  )
  private[this] lazy val controllers_SuggestionController_suggestionRegisterPOST112_invoker = createInvoker(
    SuggestionController_1.suggestionRegisterPOST(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SuggestionController",
      "suggestionRegisterPOST",
      Nil,
      "POST",
      this.prefix + """suggestion/suggestionRegisterPOST""",
      """""",
      Seq()
    )
  )

  // @LINE:201
  private[this] lazy val controllers_SuggestionController_suggestionEditPage113_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("suggestion/suggestionEditPage/"), DynamicPart("suggestionId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SuggestionController_suggestionEditPage113_invoker = createInvoker(
    SuggestionController_1.suggestionEditPage(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SuggestionController",
      "suggestionEditPage",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """suggestion/suggestionEditPage/""" + "$" + """suggestionId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:202
  private[this] lazy val controllers_SuggestionController_suggestionEditPOST114_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("suggestion/suggestionEditPOST/"), DynamicPart("suggestionId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SuggestionController_suggestionEditPOST114_invoker = createInvoker(
    SuggestionController_1.suggestionEditPOST(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SuggestionController",
      "suggestionEditPOST",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """suggestion/suggestionEditPOST/""" + "$" + """suggestionId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:203
  private[this] lazy val controllers_SuggestionController_suggestionDetail115_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("suggestion/suggestionDetail/"), DynamicPart("suggestionId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SuggestionController_suggestionDetail115_invoker = createInvoker(
    SuggestionController_1.suggestionDetail(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SuggestionController",
      "suggestionDetail",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """suggestion/suggestionDetail/""" + "$" + """suggestionId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:204
  private[this] lazy val controllers_SuggestionController_suggestionList116_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("suggestion/suggestionList")))
  )
  private[this] lazy val controllers_SuggestionController_suggestionList116_invoker = createInvoker(
    SuggestionController_1.suggestionList(fakeValue[Long], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SuggestionController",
      "suggestionList",
      Seq(classOf[Long], classOf[String]),
      "GET",
      this.prefix + """suggestion/suggestionList""",
      """""",
      Seq()
    )
  )

  // @LINE:205
  private[this] lazy val controllers_SuggestionController_suggestionDelete117_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("suggestion/suggestionDelete/"), DynamicPart("suggestionId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SuggestionController_suggestionDelete117_invoker = createInvoker(
    SuggestionController_1.suggestionDelete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SuggestionController",
      "suggestionDelete",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """suggestion/suggestionDelete/""" + "$" + """suggestionId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:207
  private[this] lazy val controllers_SuggestionController_markAsSolved118_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("suggestion/solve/"), DynamicPart("suggestionId", """[^/]+""",true), StaticPart("/"), DynamicPart("implementorId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SuggestionController_markAsSolved118_invoker = createInvoker(
    SuggestionController_1.markAsSolved(fakeValue[Long], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SuggestionController",
      "markAsSolved",
      Seq(classOf[Long], classOf[Long]),
      "GET",
      this.prefix + """suggestion/solve/""" + "$" + """suggestionId<[^/]+>/""" + "$" + """implementorId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:212
  private[this] lazy val controllers_TechnologyController_technologyRegisterPage119_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technology/technologyRegisterPage")))
  )
  private[this] lazy val controllers_TechnologyController_technologyRegisterPage119_invoker = createInvoker(
    TechnologyController_7.technologyRegisterPage(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TechnologyController",
      "technologyRegisterPage",
      Nil,
      "GET",
      this.prefix + """technology/technologyRegisterPage""",
      """######################################################### Technologies ######################################################################################""",
      Seq()
    )
  )

  // @LINE:213
  private[this] lazy val controllers_TechnologyController_technologyRegisterPOST120_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technology/technologyRegisterPOST")))
  )
  private[this] lazy val controllers_TechnologyController_technologyRegisterPOST120_invoker = createInvoker(
    TechnologyController_7.technologyRegisterPOST(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TechnologyController",
      "technologyRegisterPOST",
      Nil,
      "POST",
      this.prefix + """technology/technologyRegisterPOST""",
      """""",
      Seq()
    )
  )

  // @LINE:214
  private[this] lazy val controllers_TechnologyController_technologyEditPage121_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technology/technologyEditPage/"), DynamicPart("technologyId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TechnologyController_technologyEditPage121_invoker = createInvoker(
    TechnologyController_7.technologyEditPage(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TechnologyController",
      "technologyEditPage",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """technology/technologyEditPage/""" + "$" + """technologyId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:215
  private[this] lazy val controllers_TechnologyController_technologyEditPOST122_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technology/technologyEditPOST/"), DynamicPart("technologyId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TechnologyController_technologyEditPOST122_invoker = createInvoker(
    TechnologyController_7.technologyEditPOST(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TechnologyController",
      "technologyEditPOST",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """technology/technologyEditPOST/""" + "$" + """technologyId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:217
  private[this] lazy val controllers_TechnologyController_technologyList123_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technology/technologyList/"), DynamicPart("pageNum", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TechnologyController_technologyList123_invoker = createInvoker(
    TechnologyController_7.technologyList(fakeValue[Integer], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TechnologyController",
      "technologyList",
      Seq(classOf[Integer], classOf[String]),
      "GET",
      this.prefix + """technology/technologyList/""" + "$" + """pageNum<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:218
  private[this] lazy val controllers_TechnologyController_technologyDetail124_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technology/technologyDetail/"), DynamicPart("technologyId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TechnologyController_technologyDetail124_invoker = createInvoker(
    TechnologyController_7.technologyDetail(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TechnologyController",
      "technologyDetail",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """technology/technologyDetail/""" + "$" + """technologyId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:219
  private[this] lazy val controllers_TechnologyController_searchPage125_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technology/searchPage")))
  )
  private[this] lazy val controllers_TechnologyController_searchPage125_invoker = createInvoker(
    TechnologyController_7.searchPage(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TechnologyController",
      "searchPage",
      Nil,
      "GET",
      this.prefix + """technology/searchPage""",
      """""",
      Seq()
    )
  )

  // @LINE:220
  private[this] lazy val controllers_TechnologyController_searchPOST126_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technology/searchPOST")))
  )
  private[this] lazy val controllers_TechnologyController_searchPOST126_invoker = createInvoker(
    TechnologyController_7.searchPOST(fakeValue[Integer], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TechnologyController",
      "searchPOST",
      Seq(classOf[Integer], classOf[String]),
      "POST",
      this.prefix + """technology/searchPOST""",
      """""",
      Seq()
    )
  )

  // @LINE:221
  private[this] lazy val controllers_TechnologyController_deleteTechnology127_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technology/deleteTechnology/"), DynamicPart("technologyId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TechnologyController_deleteTechnology127_invoker = createInvoker(
    TechnologyController_7.deleteTechnology(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TechnologyController",
      "deleteTechnology",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """technology/deleteTechnology/""" + "$" + """technologyId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:222
  private[this] lazy val controllers_TechnologyController_downloadTechnologyFile128_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technology/downloadPDFFile/"), DynamicPart("serviceId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TechnologyController_downloadTechnologyFile128_invoker = createInvoker(
    TechnologyController_7.downloadTechnologyFile(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TechnologyController",
      "downloadTechnologyFile",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """technology/downloadPDFFile/""" + "$" + """serviceId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:240
  private[this] lazy val controllers_JobController_jobRegisterPage129_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("job/jobRegisterPage")))
  )
  private[this] lazy val controllers_JobController_jobRegisterPage129_invoker = createInvoker(
    JobController_9.jobRegisterPage(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JobController",
      "jobRegisterPage",
      Nil,
      "GET",
      this.prefix + """job/jobRegisterPage""",
      """######################################################### Jobs ######################################################################################""",
      Seq()
    )
  )

  // @LINE:241
  private[this] lazy val controllers_JobController_jobRegisterPOST130_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("job/jobRegisterPOST")))
  )
  private[this] lazy val controllers_JobController_jobRegisterPOST130_invoker = createInvoker(
    JobController_9.jobRegisterPOST(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JobController",
      "jobRegisterPOST",
      Nil,
      "POST",
      this.prefix + """job/jobRegisterPOST""",
      """""",
      Seq()
    )
  )

  // @LINE:242
  private[this] lazy val controllers_JobController_jobEditPage131_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("job/jobEditPage/"), DynamicPart("jobId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_JobController_jobEditPage131_invoker = createInvoker(
    JobController_9.jobEditPage(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JobController",
      "jobEditPage",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """job/jobEditPage/""" + "$" + """jobId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:243
  private[this] lazy val controllers_JobController_jobEditPOST132_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("job/jobEditPOST/"), DynamicPart("jobId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_JobController_jobEditPOST132_invoker = createInvoker(
    JobController_9.jobEditPOST(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JobController",
      "jobEditPOST",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """job/jobEditPOST/""" + "$" + """jobId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:244
  private[this] lazy val controllers_JobController_jobApplyPage133_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("job/jobApplyPage/"), DynamicPart("jobId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_JobController_jobApplyPage133_invoker = createInvoker(
    JobController_9.jobApplyPage(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JobController",
      "jobApplyPage",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """job/jobApplyPage/""" + "$" + """jobId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:245
  private[this] lazy val controllers_JobController_jobApplyPOST134_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("job/jobApplyPOST/"), DynamicPart("jobId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_JobController_jobApplyPOST134_invoker = createInvoker(
    JobController_9.jobApplyPOST(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JobController",
      "jobApplyPOST",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """job/jobApplyPOST/""" + "$" + """jobId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:246
  private[this] lazy val controllers_JobController_jobApplicationList135_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("job/jobApplicationList/"), DynamicPart("pageNum", """[^/]+""",true)))
  )
  private[this] lazy val controllers_JobController_jobApplicationList135_invoker = createInvoker(
    JobController_9.jobApplicationList(fakeValue[Integer], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JobController",
      "jobApplicationList",
      Seq(classOf[Integer], classOf[String]),
      "GET",
      this.prefix + """job/jobApplicationList/""" + "$" + """pageNum<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:247
  private[this] lazy val controllers_JobController_jobListAppliedByUser136_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("job/listAppliedByUser/"), DynamicPart("pageNum", """[^/]+""",true)))
  )
  private[this] lazy val controllers_JobController_jobListAppliedByUser136_invoker = createInvoker(
    JobController_9.jobListAppliedByUser(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JobController",
      "jobListAppliedByUser",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """job/listAppliedByUser/""" + "$" + """pageNum<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:249
  private[this] lazy val controllers_JobController_jobList137_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("job/jobList/"), DynamicPart("pageNum", """[^/]+""",true)))
  )
  private[this] lazy val controllers_JobController_jobList137_invoker = createInvoker(
    JobController_9.jobList(fakeValue[Integer], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JobController",
      "jobList",
      Seq(classOf[Integer], classOf[String]),
      "GET",
      this.prefix + """job/jobList/""" + "$" + """pageNum<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:250
  private[this] lazy val controllers_JobController_jobListPostedByUser138_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("job/jobListPostedByUser/"), DynamicPart("pageNum", """[^/]+""",true)))
  )
  private[this] lazy val controllers_JobController_jobListPostedByUser138_invoker = createInvoker(
    JobController_9.jobListPostedByUser(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JobController",
      "jobListPostedByUser",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """job/jobListPostedByUser/""" + "$" + """pageNum<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:251
  private[this] lazy val controllers_JobController_jobDetail139_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("job/jobDetail/"), DynamicPart("jobId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_JobController_jobDetail139_invoker = createInvoker(
    JobController_9.jobDetail(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JobController",
      "jobDetail",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """job/jobDetail/""" + "$" + """jobId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:252
  private[this] lazy val controllers_JobController_searchPage140_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("job/searchPage")))
  )
  private[this] lazy val controllers_JobController_searchPage140_invoker = createInvoker(
    JobController_9.searchPage(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JobController",
      "searchPage",
      Nil,
      "GET",
      this.prefix + """job/searchPage""",
      """""",
      Seq()
    )
  )

  // @LINE:253
  private[this] lazy val controllers_JobController_searchPOST141_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("job/searchPOST")))
  )
  private[this] lazy val controllers_JobController_searchPOST141_invoker = createInvoker(
    JobController_9.searchPOST(fakeValue[Integer], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JobController",
      "searchPOST",
      Seq(classOf[Integer], classOf[String]),
      "POST",
      this.prefix + """job/searchPOST""",
      """""",
      Seq()
    )
  )

  // @LINE:254
  private[this] lazy val controllers_JobController_deleteJob142_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("job/deleteJob/"), DynamicPart("jobId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_JobController_deleteJob142_invoker = createInvoker(
    JobController_9.deleteJob(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JobController",
      "deleteJob",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """job/deleteJob/""" + "$" + """jobId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:256
  private[this] lazy val controllers_JobController_jobStatueChange143_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("job/jobStatue/"), DynamicPart("jobId", """[^/]+""",true), StaticPart("/"), DynamicPart("jobStatus", """[^/]+""",true)))
  )
  private[this] lazy val controllers_JobController_jobStatueChange143_invoker = createInvoker(
    JobController_9.jobStatueChange(fakeValue[Long], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JobController",
      "jobStatueChange",
      Seq(classOf[Long], classOf[String]),
      "POST",
      this.prefix + """job/jobStatue/""" + "$" + """jobId<[^/]+>/""" + "$" + """jobStatus<[^/]+>""",
      """POST        /job/isTechnologyNameExisted                                                    controllers.TechnologyController.isTechnologyNameExisted()""",
      Seq()
    )
  )

  // @LINE:258
  private[this] lazy val controllers_JobController_jobApplicationDetail144_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("job/jobApplicationDetail/"), DynamicPart("jobApplicationId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_JobController_jobApplicationDetail144_invoker = createInvoker(
    JobController_9.jobApplicationDetail(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JobController",
      "jobApplicationDetail",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """job/jobApplicationDetail/""" + "$" + """jobApplicationId<[^/]+>""",
      """#GET         /job/downloadPDFFile/:technologyId                                            controllers.TechnologyController.downloadPDFFile(technologyId: Long)""",
      Seq()
    )
  )

  // @LINE:269
  private[this] lazy val controllers_JobController_jobApplicationsList145_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("job/applications/"), DynamicPart("jobType", """[^/]+""",true), StaticPart("/"), DynamicPart("jobId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_JobController_jobApplicationsList145_invoker = createInvoker(
    JobController_9.jobApplicationsList(fakeValue[String], fakeValue[Long], fakeValue[Integer], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JobController",
      "jobApplicationsList",
      Seq(classOf[String], classOf[Long], classOf[Integer], classOf[String]),
      "GET",
      this.prefix + """job/applications/""" + "$" + """jobType<[^/]+>/""" + "$" + """jobId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:276
  private[this] lazy val controllers_RAJobController_rajobRegisterPage146_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rajob/rajobRegisterPage")))
  )
  private[this] lazy val controllers_RAJobController_rajobRegisterPage146_invoker = createInvoker(
    RAJobController_14.rajobRegisterPage(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RAJobController",
      "rajobRegisterPage",
      Nil,
      "GET",
      this.prefix + """rajob/rajobRegisterPage""",
      """######################################################### RAJobs ######################################################################################""",
      Seq()
    )
  )

  // @LINE:277
  private[this] lazy val controllers_RAJobController_rajobRegisterPOST147_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rajob/rajobRegisterPOST")))
  )
  private[this] lazy val controllers_RAJobController_rajobRegisterPOST147_invoker = createInvoker(
    RAJobController_14.rajobRegisterPOST(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RAJobController",
      "rajobRegisterPOST",
      Nil,
      "POST",
      this.prefix + """rajob/rajobRegisterPOST""",
      """""",
      Seq()
    )
  )

  // @LINE:278
  private[this] lazy val controllers_RAJobController_rajobEditPage148_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rajob/rajobEditPage/"), DynamicPart("rajobId", """[^/]+""",true), StaticPart("/"), DynamicPart("status", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RAJobController_rajobEditPage148_invoker = createInvoker(
    RAJobController_14.rajobEditPage(fakeValue[Long], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RAJobController",
      "rajobEditPage",
      Seq(classOf[Long], classOf[String]),
      "GET",
      this.prefix + """rajob/rajobEditPage/""" + "$" + """rajobId<[^/]+>/""" + "$" + """status<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:279
  private[this] lazy val controllers_RAJobController_rajobEditPOST149_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rajob/rajobEditPOST/"), DynamicPart("rajobId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RAJobController_rajobEditPOST149_invoker = createInvoker(
    RAJobController_14.rajobEditPOST(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RAJobController",
      "rajobEditPOST",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """rajob/rajobEditPOST/""" + "$" + """rajobId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:280
  private[this] lazy val controllers_RAJobController_rajobApplyPage150_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rajob/rajobApplyPage/"), DynamicPart("rajobId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RAJobController_rajobApplyPage150_invoker = createInvoker(
    RAJobController_14.rajobApplyPage(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RAJobController",
      "rajobApplyPage",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """rajob/rajobApplyPage/""" + "$" + """rajobId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:281
  private[this] lazy val controllers_RAJobController_rajobApplyPOST151_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rajob/rajobApplyPOST/"), DynamicPart("rajobId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RAJobController_rajobApplyPOST151_invoker = createInvoker(
    RAJobController_14.rajobApplyPOST(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RAJobController",
      "rajobApplyPOST",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """rajob/rajobApplyPOST/""" + "$" + """rajobId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:283
  private[this] lazy val controllers_RAJobController_rajobStatueChange152_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rajob/rajobStatue/"), DynamicPart("rajobId", """[^/]+""",true), StaticPart("/"), DynamicPart("rajobStatus", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RAJobController_rajobStatueChange152_invoker = createInvoker(
    RAJobController_14.rajobStatueChange(fakeValue[Long], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RAJobController",
      "rajobStatueChange",
      Seq(classOf[Long], classOf[String]),
      "POST",
      this.prefix + """rajob/rajobStatue/""" + "$" + """rajobId<[^/]+>/""" + "$" + """rajobStatus<[^/]+>""",
      """ GET         /rajob/rajobApplicationList/:pageNum                                                controllers.RAJobController.rajobApplicationList(pageNum: Integer, sortCriteria: String ?= "")""",
      Seq()
    )
  )

  // @LINE:284
  private[this] lazy val controllers_RAJobController_rajobApplicationStatusChange153_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rajob/rajobApplicationStatusChange/"), DynamicPart("rajobApplicationId", """[^/]+""",true), StaticPart("/"), DynamicPart("rajobApplicationStatus", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RAJobController_rajobApplicationStatusChange153_invoker = createInvoker(
    RAJobController_14.rajobApplicationStatusChange(fakeValue[Long], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RAJobController",
      "rajobApplicationStatusChange",
      Seq(classOf[Long], classOf[String]),
      "POST",
      this.prefix + """rajob/rajobApplicationStatusChange/""" + "$" + """rajobApplicationId<[^/]+>/""" + "$" + """rajobApplicationStatus<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:286
  private[this] lazy val controllers_RAJobController_rajobApplicationDetail154_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rajob/rajobApplicationDetail/"), DynamicPart("rajobApplicationId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RAJobController_rajobApplicationDetail154_invoker = createInvoker(
    RAJobController_14.rajobApplicationDetail(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RAJobController",
      "rajobApplicationDetail",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """rajob/rajobApplicationDetail/""" + "$" + """rajobApplicationId<[^/]+>""",
      """#GET         /job/downloadPDFFile/:technologyId                                            controllers.TechnologyController.downloadPDFFile(technologyId: Long)""",
      Seq()
    )
  )

  // @LINE:289
  private[this] lazy val controllers_RAJobController_rajobList155_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rajob/rajobList/"), DynamicPart("pageNum", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RAJobController_rajobList155_invoker = createInvoker(
    RAJobController_14.rajobList(fakeValue[Integer], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RAJobController",
      "rajobList",
      Seq(classOf[Integer], classOf[String]),
      "GET",
      this.prefix + """rajob/rajobList/""" + "$" + """pageNum<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:290
  private[this] lazy val controllers_RAJobController_rajobListPostedByUser156_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rajob/rajobListPostedByUser/"), DynamicPart("pageNum", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RAJobController_rajobListPostedByUser156_invoker = createInvoker(
    RAJobController_14.rajobListPostedByUser(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RAJobController",
      "rajobListPostedByUser",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """rajob/rajobListPostedByUser/""" + "$" + """pageNum<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:291
  private[this] lazy val controllers_RAJobController_rajobListAppliedByUser157_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rajob/rajobListAppliedByUser/"), DynamicPart("pageNum", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RAJobController_rajobListAppliedByUser157_invoker = createInvoker(
    RAJobController_14.rajobListAppliedByUser(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RAJobController",
      "rajobListAppliedByUser",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """rajob/rajobListAppliedByUser/""" + "$" + """pageNum<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:293
  private[this] lazy val controllers_RAJobController_rajobDetail158_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rajob/rajobDetail/"), DynamicPart("rajobId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RAJobController_rajobDetail158_invoker = createInvoker(
    RAJobController_14.rajobDetail(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RAJobController",
      "rajobDetail",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """rajob/rajobDetail/""" + "$" + """rajobId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:294
  private[this] lazy val controllers_RAJobController_searchPage159_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rajob/searchPage")))
  )
  private[this] lazy val controllers_RAJobController_searchPage159_invoker = createInvoker(
    RAJobController_14.searchPage(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RAJobController",
      "searchPage",
      Nil,
      "GET",
      this.prefix + """rajob/searchPage""",
      """""",
      Seq()
    )
  )

  // @LINE:295
  private[this] lazy val controllers_RAJobController_searchPOST160_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rajob/searchPOST")))
  )
  private[this] lazy val controllers_RAJobController_searchPOST160_invoker = createInvoker(
    RAJobController_14.searchPOST(fakeValue[Integer], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RAJobController",
      "searchPOST",
      Seq(classOf[Integer], classOf[String]),
      "POST",
      this.prefix + """rajob/searchPOST""",
      """""",
      Seq()
    )
  )

  // @LINE:296
  private[this] lazy val controllers_RAJobController_deleteRAJob161_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rajob/deleteRAJob/"), DynamicPart("rajobId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RAJobController_deleteRAJob161_invoker = createInvoker(
    RAJobController_14.deleteRAJob(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RAJobController",
      "deleteRAJob",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """rajob/deleteRAJob/""" + "$" + """rajobId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:297
  private[this] lazy val controllers_RAJobController_closeRAJob162_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rajob/closeRAJob/"), DynamicPart("rajobId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RAJobController_closeRAJob162_invoker = createInvoker(
    RAJobController_14.closeRAJob(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RAJobController",
      "closeRAJob",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """rajob/closeRAJob/""" + "$" + """rajobId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:306
  private[this] lazy val controllers_RAJobController_sendOfferEmail163_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rajob/sendOfferEmail")))
  )
  private[this] lazy val controllers_RAJobController_sendOfferEmail163_invoker = createInvoker(
    RAJobController_14.sendOfferEmail(fakeValue[Long], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RAJobController",
      "sendOfferEmail",
      Seq(classOf[Long], classOf[String]),
      "POST",
      this.prefix + """rajob/sendOfferEmail""",
      """ GET        /rajob/offer/sendOffer/:rajobId/:recipientId                                      controllers.RAJobController.sendOfferEmail(rajobId: String, recipientId: String)""",
      Seq()
    )
  )

  // @LINE:312
  private[this] lazy val controllers_TACandidateController_tacandidateRegisterPage164_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tapool/tacandidateRegisterPage")))
  )
  private[this] lazy val controllers_TACandidateController_tacandidateRegisterPage164_invoker = createInvoker(
    TACandidateController_20.tacandidateRegisterPage(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TACandidateController",
      "tacandidateRegisterPage",
      Nil,
      "GET",
      this.prefix + """tapool/tacandidateRegisterPage""",
      """""",
      Seq()
    )
  )

  // @LINE:313
  private[this] lazy val controllers_TACandidateController_tacandidateRegisterPOST165_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tapool/tacandidateRegisterPOST")))
  )
  private[this] lazy val controllers_TACandidateController_tacandidateRegisterPOST165_invoker = createInvoker(
    TACandidateController_20.tacandidateRegisterPOST(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TACandidateController",
      "tacandidateRegisterPOST",
      Nil,
      "POST",
      this.prefix + """tapool/tacandidateRegisterPOST""",
      """""",
      Seq()
    )
  )

  // @LINE:314
  private[this] lazy val controllers_TACandidateController_tacandidateList166_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tapool/candidateList/"), DynamicPart("pageNum", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TACandidateController_tacandidateList166_invoker = createInvoker(
    TACandidateController_20.tacandidateList(fakeValue[Integer], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TACandidateController",
      "tacandidateList",
      Seq(classOf[Integer], classOf[String]),
      "GET",
      this.prefix + """tapool/candidateList/""" + "$" + """pageNum<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:315
  private[this] lazy val controllers_TACandidateController_tacandidateDetail167_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tapool/tacandidateDetail/"), DynamicPart("Id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TACandidateController_tacandidateDetail167_invoker = createInvoker(
    TACandidateController_20.tacandidateDetail(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TACandidateController",
      "tacandidateDetail",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """tapool/tacandidateDetail/""" + "$" + """Id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:316
  private[this] lazy val controllers_TACandidateController_getCurrentUserAssignments168_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ta/weeklyhours")))
  )
  private[this] lazy val controllers_TACandidateController_getCurrentUserAssignments168_invoker = createInvoker(
    TACandidateController_20.getCurrentUserAssignments(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TACandidateController",
      "getCurrentUserAssignments",
      Nil,
      "GET",
      this.prefix + """ta/weeklyhours""",
      """""",
      Seq()
    )
  )

  // @LINE:323
  private[this] lazy val controllers_CourseController_courseList169_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("courses")))
  )
  private[this] lazy val controllers_CourseController_courseList169_invoker = createInvoker(
    CourseController_2.courseList(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CourseController",
      "courseList",
      Nil,
      "GET",
      this.prefix + """courses""",
      """""",
      Seq()
    )
  )

  // @LINE:331
  private[this] lazy val controllers_CourseTAAssignmentController_taHiringStatusList170_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tahiring/statuslist/"), DynamicPart("pageNum", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CourseTAAssignmentController_taHiringStatusList170_invoker = createInvoker(
    CourseTAAssignmentController_5.taHiringStatusList(fakeValue[Integer], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CourseTAAssignmentController",
      "taHiringStatusList",
      Seq(classOf[Integer], classOf[String]),
      "GET",
      this.prefix + """tahiring/statuslist/""" + "$" + """pageNum<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:332
  private[this] lazy val controllers_CourseTAAssignmentController_assignmentDetail171_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tahiring/statusDetail/"), DynamicPart("Id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CourseTAAssignmentController_assignmentDetail171_invoker = createInvoker(
    CourseTAAssignmentController_5.assignmentDetail(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CourseTAAssignmentController",
      "assignmentDetail",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """tahiring/statusDetail/""" + "$" + """Id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:333
  private[this] lazy val controllers_CourseTAAssignmentController_assignmentRegisterPOST172_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tahiring/assignmentRegisterPOST")))
  )
  private[this] lazy val controllers_CourseTAAssignmentController_assignmentRegisterPOST172_invoker = createInvoker(
    CourseTAAssignmentController_5.assignmentRegisterPOST(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CourseTAAssignmentController",
      "assignmentRegisterPOST",
      Nil,
      "POST",
      this.prefix + """tahiring/assignmentRegisterPOST""",
      """""",
      Seq()
    )
  )

  // @LINE:340
  private[this] lazy val controllers_TAJobController_tajobRegisterPage173_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tajob/tajobRegisterPage")))
  )
  private[this] lazy val controllers_TAJobController_tajobRegisterPage173_invoker = createInvoker(
    TAJobController_8.tajobRegisterPage(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TAJobController",
      "tajobRegisterPage",
      Nil,
      "GET",
      this.prefix + """tajob/tajobRegisterPage""",
      """######################################################### TAJobs ######################################################################################""",
      Seq()
    )
  )

  // @LINE:341
  private[this] lazy val controllers_TAJobController_tajobRegisterPOST174_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tajob/tajobRegisterPOST")))
  )
  private[this] lazy val controllers_TAJobController_tajobRegisterPOST174_invoker = createInvoker(
    TAJobController_8.tajobRegisterPOST(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TAJobController",
      "tajobRegisterPOST",
      Nil,
      "POST",
      this.prefix + """tajob/tajobRegisterPOST""",
      """""",
      Seq()
    )
  )

  // @LINE:342
  private[this] lazy val controllers_TAJobController_tajobEditPage175_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tajob/tajobEditPage/"), DynamicPart("tajobId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TAJobController_tajobEditPage175_invoker = createInvoker(
    TAJobController_8.tajobEditPage(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TAJobController",
      "tajobEditPage",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """tajob/tajobEditPage/""" + "$" + """tajobId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:343
  private[this] lazy val controllers_TAJobController_tajobEditPOST176_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tajob/tajobEditPOST/"), DynamicPart("tajobId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TAJobController_tajobEditPOST176_invoker = createInvoker(
    TAJobController_8.tajobEditPOST(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TAJobController",
      "tajobEditPOST",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """tajob/tajobEditPOST/""" + "$" + """tajobId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:344
  private[this] lazy val controllers_TAJobController_tajobApplyPage177_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tajob/tajobApplyPage/"), DynamicPart("tajobId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TAJobController_tajobApplyPage177_invoker = createInvoker(
    TAJobController_8.tajobApplyPage(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TAJobController",
      "tajobApplyPage",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """tajob/tajobApplyPage/""" + "$" + """tajobId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:345
  private[this] lazy val controllers_TAJobController_tajobApplyPOST178_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tajob/tajobApplyPOST/"), DynamicPart("tajobId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TAJobController_tajobApplyPOST178_invoker = createInvoker(
    TAJobController_8.tajobApplyPOST(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TAJobController",
      "tajobApplyPOST",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """tajob/tajobApplyPOST/""" + "$" + """tajobId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:347
  private[this] lazy val controllers_TAJobController_tajobStatueChange179_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tajob/tajobStatue/"), DynamicPart("tajobId", """[^/]+""",true), StaticPart("/"), DynamicPart("tajobStatus", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TAJobController_tajobStatueChange179_invoker = createInvoker(
    TAJobController_8.tajobStatueChange(fakeValue[Long], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TAJobController",
      "tajobStatueChange",
      Seq(classOf[Long], classOf[String]),
      "POST",
      this.prefix + """tajob/tajobStatue/""" + "$" + """tajobId<[^/]+>/""" + "$" + """tajobStatus<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:349
  private[this] lazy val controllers_TAJobController_tajobApplicationDetail180_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tajob/tajobApplicationDetail/"), DynamicPart("tajobApplicationId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TAJobController_tajobApplicationDetail180_invoker = createInvoker(
    TAJobController_8.tajobApplicationDetail(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TAJobController",
      "tajobApplicationDetail",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """tajob/tajobApplicationDetail/""" + "$" + """tajobApplicationId<[^/]+>""",
      """GET         /job/downloadPDFFile/:technologyId                                            controllers.TechnologyController.downloadPDFFile(technologyId: Long)""",
      Seq()
    )
  )

  // @LINE:350
  private[this] lazy val controllers_TAJobController_saveTAJobPdf181_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tajob/saveTAJobPdf/"), DynamicPart("tajobApplicationId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TAJobController_saveTAJobPdf181_invoker = createInvoker(
    TAJobController_8.saveTAJobPdf(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TAJobController",
      "saveTAJobPdf",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """tajob/saveTAJobPdf/""" + "$" + """tajobApplicationId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:352
  private[this] lazy val controllers_TAJobController_tajobList182_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tajob/tajobList/"), DynamicPart("pageNum", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TAJobController_tajobList182_invoker = createInvoker(
    TAJobController_8.tajobList(fakeValue[Integer], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TAJobController",
      "tajobList",
      Seq(classOf[Integer], classOf[String]),
      "GET",
      this.prefix + """tajob/tajobList/""" + "$" + """pageNum<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:353
  private[this] lazy val controllers_TAJobController_tajobListPostedByUser183_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tajob/tajobListPostedByUser/"), DynamicPart("pageNum", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TAJobController_tajobListPostedByUser183_invoker = createInvoker(
    TAJobController_8.tajobListPostedByUser(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TAJobController",
      "tajobListPostedByUser",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """tajob/tajobListPostedByUser/""" + "$" + """pageNum<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:354
  private[this] lazy val controllers_TAJobController_tajobDetail184_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tajob/tajobDetail/"), DynamicPart("tajobId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TAJobController_tajobDetail184_invoker = createInvoker(
    TAJobController_8.tajobDetail(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TAJobController",
      "tajobDetail",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """tajob/tajobDetail/""" + "$" + """tajobId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:355
  private[this] lazy val controllers_TAJobController_searchPage185_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tajob/searchPage")))
  )
  private[this] lazy val controllers_TAJobController_searchPage185_invoker = createInvoker(
    TAJobController_8.searchPage(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TAJobController",
      "searchPage",
      Nil,
      "GET",
      this.prefix + """tajob/searchPage""",
      """""",
      Seq()
    )
  )

  // @LINE:356
  private[this] lazy val controllers_TAJobController_searchPOST186_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tajob/searchPOST")))
  )
  private[this] lazy val controllers_TAJobController_searchPOST186_invoker = createInvoker(
    TAJobController_8.searchPOST(fakeValue[Integer], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TAJobController",
      "searchPOST",
      Seq(classOf[Integer], classOf[String]),
      "POST",
      this.prefix + """tajob/searchPOST""",
      """""",
      Seq()
    )
  )

  // @LINE:357
  private[this] lazy val controllers_TAJobController_deleteTAJob187_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tajob/deleteTAJob/"), DynamicPart("tajobId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TAJobController_deleteTAJob187_invoker = createInvoker(
    TAJobController_8.deleteTAJob(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TAJobController",
      "deleteTAJob",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """tajob/deleteTAJob/""" + "$" + """tajobId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:368
  private[this] lazy val controllers_AdminController_dashboard188_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/dashboard")))
  )
  private[this] lazy val controllers_AdminController_dashboard188_invoker = createInvoker(
    AdminController_0.dashboard(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "dashboard",
      Nil,
      "GET",
      this.prefix + """admin/dashboard""",
      """######################################################### Admin Management #####################################################################""",
      Seq()
    )
  )

  // @LINE:369
  private[this] lazy val controllers_AdminController_userManagement189_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/users/"), DynamicPart("pageNum", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminController_userManagement189_invoker = createInvoker(
    AdminController_0.userManagement(fakeValue[Integer], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "userManagement",
      Seq(classOf[Integer], classOf[String]),
      "GET",
      this.prefix + """admin/users/""" + "$" + """pageNum<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:370
  private[this] lazy val controllers_AdminController_userDetail190_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/users/detail/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminController_userDetail190_invoker = createInvoker(
    AdminController_0.userDetail(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "userDetail",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """admin/users/detail/""" + "$" + """userId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:371
  private[this] lazy val controllers_AdminController_jobManagement191_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/jobs/"), DynamicPart("pageNum", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminController_jobManagement191_invoker = createInvoker(
    AdminController_0.jobManagement(fakeValue[Integer], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "jobManagement",
      Seq(classOf[Integer], classOf[String]),
      "GET",
      this.prefix + """admin/jobs/""" + "$" + """pageNum<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:372
  private[this] lazy val controllers_AdminController_jobDetail192_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/jobs/detail/"), DynamicPart("jobType", """[^/]+""",true), StaticPart("/"), DynamicPart("jobId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminController_jobDetail192_invoker = createInvoker(
    AdminController_0.jobDetail(fakeValue[String], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "jobDetail",
      Seq(classOf[String], classOf[Long]),
      "GET",
      this.prefix + """admin/jobs/detail/""" + "$" + """jobType<[^/]+>/""" + "$" + """jobId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:373
  private[this] lazy val controllers_AdminController_organizationManagement193_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/organizations/"), DynamicPart("pageNum", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminController_organizationManagement193_invoker = createInvoker(
    AdminController_0.organizationManagement(fakeValue[Integer], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "organizationManagement",
      Seq(classOf[Integer], classOf[String]),
      "GET",
      this.prefix + """admin/organizations/""" + "$" + """pageNum<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:374
  private[this] lazy val controllers_AdminController_technologyManagement194_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/technologies/"), DynamicPart("pageNum", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminController_technologyManagement194_invoker = createInvoker(
    AdminController_0.technologyManagement(fakeValue[Integer], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "technologyManagement",
      Seq(classOf[Integer], classOf[String]),
      "GET",
      this.prefix + """admin/technologies/""" + "$" + """pageNum<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:379
  private[this] lazy val controllers_AuthorController_authorRegisterPage195_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("author/authorRegisterPage")))
  )
  private[this] lazy val controllers_AuthorController_authorRegisterPage195_invoker = createInvoker(
    AuthorController_3.authorRegisterPage(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthorController",
      "authorRegisterPage",
      Nil,
      "GET",
      this.prefix + """author/authorRegisterPage""",
      """######################################################### Authors #####################################################################""",
      Seq()
    )
  )

  // @LINE:380
  private[this] lazy val controllers_AuthorController_authorRegisterPOST196_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("author/authorRegister")))
  )
  private[this] lazy val controllers_AuthorController_authorRegisterPOST196_invoker = createInvoker(
    AuthorController_3.authorRegisterPOST(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthorController",
      "authorRegisterPOST",
      Nil,
      "GET",
      this.prefix + """author/authorRegister""",
      """""",
      Seq()
    )
  )

  // @LINE:381
  private[this] lazy val controllers_AuthorController_authorEditPage197_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("author/authorEditPage")))
  )
  private[this] lazy val controllers_AuthorController_authorEditPage197_invoker = createInvoker(
    AuthorController_3.authorEditPage(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthorController",
      "authorEditPage",
      Nil,
      "GET",
      this.prefix + """author/authorEditPage""",
      """""",
      Seq()
    )
  )

  // @LINE:382
  private[this] lazy val controllers_AuthorController_authorEditPOST198_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("author/authorEditPOST")))
  )
  private[this] lazy val controllers_AuthorController_authorEditPOST198_invoker = createInvoker(
    AuthorController_3.authorEditPOST(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthorController",
      "authorEditPOST",
      Nil,
      "POST",
      this.prefix + """author/authorEditPOST""",
      """""",
      Seq()
    )
  )

  // @LINE:383
  private[this] lazy val controllers_AuthorController_authorList199_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("author/authorList/"), DynamicPart("pageNum", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AuthorController_authorList199_invoker = createInvoker(
    AuthorController_3.authorList(fakeValue[Integer], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthorController",
      "authorList",
      Seq(classOf[Integer], classOf[String]),
      "GET",
      this.prefix + """author/authorList/""" + "$" + """pageNum<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:384
  private[this] lazy val controllers_AuthorController_authorDetailPage200_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("author/authorDetailPage/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AuthorController_authorDetailPage200_invoker = createInvoker(
    AuthorController_3.authorDetailPage(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthorController",
      "authorDetailPage",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """author/authorDetailPage/""" + "$" + """userId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:386
  private[this] lazy val controllers_AuthorController_userEditPageAdmin201_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("author/userEditPageAdmin/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AuthorController_userEditPageAdmin201_invoker = createInvoker(
    AuthorController_3.userEditPageAdmin(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthorController",
      "userEditPageAdmin",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """author/userEditPageAdmin/""" + "$" + """userId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:387
  private[this] lazy val controllers_AuthorController_userEditPOSTAdmin202_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("author/userEditPOSTAdmin/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AuthorController_userEditPOSTAdmin202_invoker = createInvoker(
    AuthorController_3.userEditPOSTAdmin(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthorController",
      "userEditPOSTAdmin",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """author/userEditPOSTAdmin/""" + "$" + """userId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:388
  private[this] lazy val controllers_AuthorController_userListAdmin203_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("author/userListAdmin/"), DynamicPart("pageNum", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AuthorController_userListAdmin203_invoker = createInvoker(
    AuthorController_3.userListAdmin(fakeValue[Integer], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthorController",
      "userListAdmin",
      Seq(classOf[Integer], classOf[String]),
      "GET",
      this.prefix + """author/userListAdmin/""" + "$" + """pageNum<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:389
  private[this] lazy val controllers_AuthorController_userDetailPageAdmin204_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("author/userDetailPageAdmin/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AuthorController_userDetailPageAdmin204_invoker = createInvoker(
    AuthorController_3.userDetailPageAdmin(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthorController",
      "userDetailPageAdmin",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """author/userDetailPageAdmin/""" + "$" + """userId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:393
  private[this] lazy val controllers_AuthorController_searchPage205_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("author/searchPage")))
  )
  private[this] lazy val controllers_AuthorController_searchPage205_invoker = createInvoker(
    AuthorController_3.searchPage(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthorController",
      "searchPage",
      Nil,
      "GET",
      this.prefix + """author/searchPage""",
      """""",
      Seq()
    )
  )

  // @LINE:394
  private[this] lazy val controllers_AuthorController_searchPOST206_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("author/searchPOST")))
  )
  private[this] lazy val controllers_AuthorController_searchPOST206_invoker = createInvoker(
    AuthorController_3.searchPOST(fakeValue[Integer], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthorController",
      "searchPOST",
      Seq(classOf[Integer], classOf[String]),
      "POST",
      this.prefix + """author/searchPOST""",
      """""",
      Seq()
    )
  )

  // @LINE:395
  private[this] lazy val controllers_AuthorController_authorDelete207_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("author/authorDelete")))
  )
  private[this] lazy val controllers_AuthorController_authorDelete207_invoker = createInvoker(
    AuthorController_3.authorDelete(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthorController",
      "authorDelete",
      Nil,
      "GET",
      this.prefix + """author/authorDelete""",
      """""",
      Seq()
    )
  )

  // @LINE:396
  private[this] lazy val controllers_AuthorController_topAuthors208_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("author/topAuthors")))
  )
  private[this] lazy val controllers_AuthorController_topAuthors208_invoker = createInvoker(
    AuthorController_3.topAuthors(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthorController",
      "topAuthors",
      Nil,
      "GET",
      this.prefix + """author/topAuthors""",
      """""",
      Seq()
    )
  )

  // @LINE:399
  private[this] lazy val controllers_ReviewerController_reviewerRegisterPage209_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reviewer/reviewerRegisterPage")))
  )
  private[this] lazy val controllers_ReviewerController_reviewerRegisterPage209_invoker = createInvoker(
    ReviewerController_18.reviewerRegisterPage(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ReviewerController",
      "reviewerRegisterPage",
      Nil,
      "GET",
      this.prefix + """reviewer/reviewerRegisterPage""",
      """######################################################### Reviewers #####################################################################""",
      Seq()
    )
  )

  // @LINE:400
  private[this] lazy val controllers_ReviewerController_reviewerRegisterPOST210_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reviewer/reviewerRegister")))
  )
  private[this] lazy val controllers_ReviewerController_reviewerRegisterPOST210_invoker = createInvoker(
    ReviewerController_18.reviewerRegisterPOST(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ReviewerController",
      "reviewerRegisterPOST",
      Nil,
      "GET",
      this.prefix + """reviewer/reviewerRegister""",
      """""",
      Seq()
    )
  )

  // @LINE:401
  private[this] lazy val controllers_ReviewerController_reviewerEditPage211_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reviewer/reviewerEditPage")))
  )
  private[this] lazy val controllers_ReviewerController_reviewerEditPage211_invoker = createInvoker(
    ReviewerController_18.reviewerEditPage(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ReviewerController",
      "reviewerEditPage",
      Nil,
      "GET",
      this.prefix + """reviewer/reviewerEditPage""",
      """""",
      Seq()
    )
  )

  // @LINE:402
  private[this] lazy val controllers_ReviewerController_reviewerEditPOST212_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reviewer/reviewerEditPOST")))
  )
  private[this] lazy val controllers_ReviewerController_reviewerEditPOST212_invoker = createInvoker(
    ReviewerController_18.reviewerEditPOST(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ReviewerController",
      "reviewerEditPOST",
      Nil,
      "POST",
      this.prefix + """reviewer/reviewerEditPOST""",
      """""",
      Seq()
    )
  )

  // @LINE:403
  private[this] lazy val controllers_ReviewerController_reviewerList213_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reviewer/reviewerList/"), DynamicPart("pageNum", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ReviewerController_reviewerList213_invoker = createInvoker(
    ReviewerController_18.reviewerList(fakeValue[Integer], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ReviewerController",
      "reviewerList",
      Seq(classOf[Integer], classOf[String]),
      "GET",
      this.prefix + """reviewer/reviewerList/""" + "$" + """pageNum<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:404
  private[this] lazy val controllers_ReviewerController_reviewerDetailPage214_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reviewer/reviewerDetailPage/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ReviewerController_reviewerDetailPage214_invoker = createInvoker(
    ReviewerController_18.reviewerDetailPage(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ReviewerController",
      "reviewerDetailPage",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """reviewer/reviewerDetailPage/""" + "$" + """userId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:408
  private[this] lazy val controllers_ReviewerController_searchPage215_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reviewer/searchPage")))
  )
  private[this] lazy val controllers_ReviewerController_searchPage215_invoker = createInvoker(
    ReviewerController_18.searchPage(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ReviewerController",
      "searchPage",
      Nil,
      "GET",
      this.prefix + """reviewer/searchPage""",
      """""",
      Seq()
    )
  )

  // @LINE:409
  private[this] lazy val controllers_ReviewerController_searchPOST216_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reviewer/searchPOST")))
  )
  private[this] lazy val controllers_ReviewerController_searchPOST216_invoker = createInvoker(
    ReviewerController_18.searchPOST(fakeValue[Integer], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ReviewerController",
      "searchPOST",
      Seq(classOf[Integer], classOf[String]),
      "POST",
      this.prefix + """reviewer/searchPOST""",
      """""",
      Seq()
    )
  )

  // @LINE:410
  private[this] lazy val controllers_ReviewerController_reviewerDelete217_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reviewer/reviewerDelete")))
  )
  private[this] lazy val controllers_ReviewerController_reviewerDelete217_invoker = createInvoker(
    ReviewerController_18.reviewerDelete(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ReviewerController",
      "reviewerDelete",
      Nil,
      "GET",
      this.prefix + """reviewer/reviewerDelete""",
      """""",
      Seq()
    )
  )

  // @LINE:414
  private[this] lazy val controllers_PaperController_paperRegisterPage218_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paper/paperRegisterPage")))
  )
  private[this] lazy val controllers_PaperController_paperRegisterPage218_invoker = createInvoker(
    PaperController_13.paperRegisterPage(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaperController",
      "paperRegisterPage",
      Nil,
      "GET",
      this.prefix + """paper/paperRegisterPage""",
      """######################################################### Paper #####################################################################""",
      Seq()
    )
  )

  // @LINE:415
  private[this] lazy val controllers_PaperController_paperRegisterPOST219_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paper/paperRegisterPOST")))
  )
  private[this] lazy val controllers_PaperController_paperRegisterPOST219_invoker = createInvoker(
    PaperController_13.paperRegisterPOST(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaperController",
      "paperRegisterPOST",
      Nil,
      "POST",
      this.prefix + """paper/paperRegisterPOST""",
      """""",
      Seq()
    )
  )

  // @LINE:417
  private[this] lazy val controllers_PaperController_paperList220_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paper/paperList/"), DynamicPart("pageNum", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PaperController_paperList220_invoker = createInvoker(
    PaperController_13.paperList(fakeValue[Integer], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaperController",
      "paperList",
      Seq(classOf[Integer], classOf[String]),
      "GET",
      this.prefix + """paper/paperList/""" + "$" + """pageNum<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:418
  private[this] lazy val controllers_PaperController_paperDetail221_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paper/paperDetail/"), DynamicPart("paperId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PaperController_paperDetail221_invoker = createInvoker(
    PaperController_13.paperDetail(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaperController",
      "paperDetail",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """paper/paperDetail/""" + "$" + """paperId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:419
  private[this] lazy val controllers_PaperController_deletePaper222_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paper/deletePaper/"), DynamicPart("paperId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PaperController_deletePaper222_invoker = createInvoker(
    PaperController_13.deletePaper(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaperController",
      "deletePaper",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """paper/deletePaper/""" + "$" + """paperId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:421
  private[this] lazy val controllers_PaperController_primeConnections223_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paper/primeConnections")))
  )
  private[this] lazy val controllers_PaperController_primeConnections223_invoker = createInvoker(
    PaperController_13.primeConnections(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaperController",
      "primeConnections",
      Nil,
      "GET",
      this.prefix + """paper/primeConnections""",
      """""",
      Seq()
    )
  )

  // @LINE:423
  private[this] lazy val controllers_PaperController_relationGraph224_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paper/relationGraph")))
  )
  private[this] lazy val controllers_PaperController_relationGraph224_invoker = createInvoker(
    PaperController_13.relationGraph(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaperController",
      "relationGraph",
      Nil,
      "GET",
      this.prefix + """paper/relationGraph""",
      """""",
      Seq()
    )
  )

  // @LINE:424
  private[this] lazy val controllers_PaperController_loadUploadPage225_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paper/loadDBLP")))
  )
  private[this] lazy val controllers_PaperController_loadUploadPage225_invoker = createInvoker(
    PaperController_13.loadUploadPage(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaperController",
      "loadUploadPage",
      Nil,
      "GET",
      this.prefix + """paper/loadDBLP""",
      """""",
      Seq()
    )
  )

  // @LINE:425
  private[this] lazy val controllers_PaperController_processDBPLFile226_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paper/uploadDBLP")))
  )
  private[this] lazy val controllers_PaperController_processDBPLFile226_invoker = createInvoker(
    PaperController_13.processDBPLFile(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaperController",
      "processDBPLFile",
      Nil,
      "POST",
      this.prefix + """paper/uploadDBLP""",
      """""",
      Seq()
    )
  )

  // @LINE:427
  private[this] lazy val controllers_PaperController_paperLDA227_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paper/ldaPage")))
  )
  private[this] lazy val controllers_PaperController_paperLDA227_invoker = createInvoker(
    PaperController_13.paperLDA(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaperController",
      "paperLDA",
      Nil,
      "GET",
      this.prefix + """paper/ldaPage""",
      """""",
      Seq()
    )
  )

  // @LINE:429
  private[this] lazy val controllers_PaperController_authorAuthorRel228_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paper/authorRelation")))
  )
  private[this] lazy val controllers_PaperController_authorAuthorRel228_invoker = createInvoker(
    PaperController_13.authorAuthorRel(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaperController",
      "authorAuthorRel",
      Nil,
      "GET",
      this.prefix + """paper/authorRelation""",
      """""",
      Seq()
    )
  )

  // @LINE:430
  private[this] lazy val controllers_PaperController_ldaTopicDistribution229_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paper/ldaTopicDistribution")))
  )
  private[this] lazy val controllers_PaperController_ldaTopicDistribution229_invoker = createInvoker(
    PaperController_13.ldaTopicDistribution(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaperController",
      "ldaTopicDistribution",
      Nil,
      "GET",
      this.prefix + """paper/ldaTopicDistribution""",
      """""",
      Seq()
    )
  )

  // @LINE:431
  private[this] lazy val controllers_PaperController_searchPage230_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paper/searchPage")))
  )
  private[this] lazy val controllers_PaperController_searchPage230_invoker = createInvoker(
    PaperController_13.searchPage(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaperController",
      "searchPage",
      Nil,
      "GET",
      this.prefix + """paper/searchPage""",
      """""",
      Seq()
    )
  )

  // @LINE:432
  private[this] lazy val controllers_PaperController_searchPaper231_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paper/searchPaper")))
  )
  private[this] lazy val controllers_PaperController_searchPaper231_invoker = createInvoker(
    PaperController_13.searchPaper(fakeValue[Integer], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaperController",
      "searchPaper",
      Seq(classOf[Integer], classOf[String]),
      "POST",
      this.prefix + """paper/searchPaper""",
      """""",
      Seq()
    )
  )

  // @LINE:435
  private[this] lazy val controllers_GraphController_researchInterest232_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("graphs/research")))
  )
  private[this] lazy val controllers_GraphController_researchInterest232_invoker = createInvoker(
    GraphController_11.researchInterest(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GraphController",
      "researchInterest",
      Nil,
      "GET",
      this.prefix + """graphs/research""",
      """######################################################### Graph #####################################################################""",
      Seq()
    )
  )

  // @LINE:436
  private[this] lazy val controllers_FileController_getFile233_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("file/"), DynamicPart("tableName", """[^/]+""",true), StaticPart("/"), DynamicPart("challengeFileType", """[^/]+""",true), StaticPart("/"), DynamicPart("tableRecorderId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FileController_getFile233_invoker = createInvoker(
    FileController_22.getFile(fakeValue[String], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FileController",
      "getFile",
      Seq(classOf[String], classOf[String], classOf[String]),
      "GET",
      this.prefix + """file/""" + "$" + """tableName<[^/]+>/""" + "$" + """challengeFileType<[^/]+>/""" + "$" + """tableRecorderId<[^/]+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:5
    case controllers_AsyncController_message0_route(params@_) =>
      call { 
        controllers_AsyncController_message0_invoker.call(AsyncController_4.message)
      }
  
    // @LINE:7
    case controllers_Assets_at1_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at1_invoker.call(Assets_19.at(path, file))
      }
  
    // @LINE:8
    case controllers_Assets_at2_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at2_invoker.call(Assets_19.at(path, file))
      }
  
    // @LINE:11
    case controllers_AboutController_aboutUs3_route(params@_) =>
      call { 
        controllers_AboutController_aboutUs3_invoker.call(AboutController_15.aboutUs())
      }
  
    // @LINE:12
    case controllers_AboutController_aboutProject4_route(params@_) =>
      call { 
        controllers_AboutController_aboutProject4_invoker.call(AboutController_15.aboutProject())
      }
  
    // @LINE:13
    case controllers_AboutController_frequentlyAskedQuestions5_route(params@_) =>
      call { 
        controllers_AboutController_frequentlyAskedQuestions5_invoker.call(AboutController_15.frequentlyAskedQuestions())
      }
  
    // @LINE:14
    case controllers_AboutController_popularQueries6_route(params@_) =>
      call { 
        controllers_AboutController_popularQueries6_invoker.call(AboutController_15.popularQueries())
      }
  
    // @LINE:22
    case controllers_Application_home7_route(params@_) =>
      call { 
        controllers_Application_home7_invoker.call(Application_21.home())
      }
  
    // @LINE:23
    case controllers_Application_login8_route(params@_) =>
      call { 
        controllers_Application_login8_invoker.call(Application_21.login())
      }
  
    // @LINE:24
    case controllers_Application_logout9_route(params@_) =>
      call { 
        controllers_Application_logout9_invoker.call(Application_21.logout())
      }
  
    // @LINE:25
    case controllers_Application_createUserSuccess10_route(params@_) =>
      call { 
        controllers_Application_createUserSuccess10_invoker.call(Application_21.createUserSuccess())
      }
  
    // @LINE:26
    case controllers_Application_showLinkIsAlreadyClick11_route(params@_) =>
      call { 
        controllers_Application_showLinkIsAlreadyClick11_invoker.call(Application_21.showLinkIsAlreadyClick())
      }
  
    // @LINE:27
    case controllers_Application_showVerificationEmailIsSent12_route(params@_) =>
      call { 
        controllers_Application_showVerificationEmailIsSent12_invoker.call(Application_21.showVerificationEmailIsSent())
      }
  
    // @LINE:28
    case controllers_Application_showVerificationEmailIsExpired13_route(params@_) =>
      call { 
        controllers_Application_showVerificationEmailIsExpired13_invoker.call(Application_21.showVerificationEmailIsExpired())
      }
  
    // @LINE:29
    case controllers_Application_deleteAccount14_route(params@_) =>
      call { 
        controllers_Application_deleteAccount14_invoker.call(Application_21.deleteAccount())
      }
  
    // @LINE:30
    case controllers_Application_updatePassword15_route(params@_) =>
      call(params.fromQuery[String]("email", None)) { (email) =>
        controllers_Application_updatePassword15_invoker.call(Application_21.updatePassword(email))
      }
  
    // @LINE:31
    case controllers_Application_updateProjectZone16_route(params@_) =>
      call(params.fromPath[String]("view", None)) { (view) =>
        controllers_Application_updateProjectZone16_invoker.call(Application_21.updateProjectZone(view))
      }
  
    // @LINE:32
    case controllers_Application_getImageFromPath17_route(params@_) =>
      call(params.fromQuery[String]("filePath", None)) { (filePath) =>
        controllers_Application_getImageFromPath17_invoker.call(Application_21.getImageFromPath(filePath))
      }
  
    // @LINE:33
    case controllers_Application_getDefaultAvatar18_route(params@_) =>
      call { 
        controllers_Application_getDefaultAvatar18_invoker.call(Application_21.getDefaultAvatar)
      }
  
    // @LINE:43
    case controllers_ProjectController_projectRegisterPage19_route(params@_) =>
      call { 
        controllers_ProjectController_projectRegisterPage19_invoker.call(ProjectController_12.projectRegisterPage())
      }
  
    // @LINE:44
    case controllers_ProjectController_projectRegisterPOST20_route(params@_) =>
      call { 
        controllers_ProjectController_projectRegisterPOST20_invoker.call(ProjectController_12.projectRegisterPOST())
      }
  
    // @LINE:45
    case controllers_ProjectController_projectEditPage21_route(params@_) =>
      call(params.fromPath[Long]("projectId", None)) { (projectId) =>
        controllers_ProjectController_projectEditPage21_invoker.call(ProjectController_12.projectEditPage(projectId))
      }
  
    // @LINE:46
    case controllers_ProjectController_projectEditPOST22_route(params@_) =>
      call(params.fromPath[Long]("projectId", None)) { (projectId) =>
        controllers_ProjectController_projectEditPOST22_invoker.call(ProjectController_12.projectEditPOST(projectId))
      }
  
    // @LINE:48
    case controllers_ProjectController_projectList23_route(params@_) =>
      call(params.fromPath[Integer]("pageNum", None), params.fromQuery[String]("sortCriteria", Some(""))) { (pageNum, sortCriteria) =>
        controllers_ProjectController_projectList23_invoker.call(ProjectController_12.projectList(pageNum, sortCriteria))
      }
  
    // @LINE:49
    case controllers_ProjectController_projectDetail24_route(params@_) =>
      call(params.fromPath[Long]("projectId", None)) { (projectId) =>
        controllers_ProjectController_projectDetail24_invoker.call(ProjectController_12.projectDetail(projectId))
      }
  
    // @LINE:50
    case controllers_ProjectController_searchPage25_route(params@_) =>
      call { 
        controllers_ProjectController_searchPage25_invoker.call(ProjectController_12.searchPage())
      }
  
    // @LINE:51
    case controllers_ProjectController_searchPOST26_route(params@_) =>
      call(params.fromQuery[Integer]("pageNum", None), params.fromQuery[String]("sortCriteria", None)) { (pageNum, sortCriteria) =>
        controllers_ProjectController_searchPOST26_invoker.call(ProjectController_12.searchPOST(pageNum, sortCriteria))
      }
  
    // @LINE:52
    case controllers_ProjectController_deleteProject27_route(params@_) =>
      call(params.fromPath[Long]("projectId", None)) { (projectId) =>
        controllers_ProjectController_deleteProject27_invoker.call(ProjectController_12.deleteProject(projectId))
      }
  
    // @LINE:53
    case controllers_ProjectController_isProjectNameExisted28_route(params@_) =>
      call { 
        controllers_ProjectController_isProjectNameExisted28_invoker.call(ProjectController_12.isProjectNameExisted())
      }
  
    // @LINE:54
    case controllers_ProjectController_uploadDescriptionImage29_route(params@_) =>
      call(params.fromPath[Long]("projectId", None), params.fromPath[Integer]("imageNumber", None)) { (projectId, imageNumber) =>
        controllers_ProjectController_uploadDescriptionImage29_invoker.call(ProjectController_12.uploadDescriptionImage(projectId, imageNumber))
      }
  
    // @LINE:55
    case controllers_ProjectController_renameDescriptionImage30_route(params@_) =>
      call(params.fromPath[Long]("projectId", None), params.fromPath[Integer]("imageNumber", None), params.fromPath[Integer]("currentImageNumber", None)) { (projectId, imageNumber, currentImageNumber) =>
        controllers_ProjectController_renameDescriptionImage30_invoker.call(ProjectController_12.renameDescriptionImage(projectId, imageNumber, currentImageNumber))
      }
  
    // @LINE:59
    case controllers_ProjectController_isProjectExist31_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_ProjectController_isProjectExist31_invoker.call(ProjectController_12.isProjectExist(id))
      }
  
    // @LINE:60
    case controllers_ProjectController_associateProjectsToNotebook32_route(params@_) =>
      call(params.fromPath[Long]("notebookId", None)) { (notebookId) =>
        controllers_ProjectController_associateProjectsToNotebook32_invoker.call(ProjectController_12.associateProjectsToNotebook(notebookId))
      }
  
    // @LINE:61
    case controllers_ProjectController_getProjectLists33_route(params@_) =>
      call { 
        controllers_ProjectController_getProjectLists33_invoker.call(ProjectController_12.getProjectLists())
      }
  
    // @LINE:62
    case controllers_ProjectController_getMyEnrolledProjects34_route(params@_) =>
      call(params.fromPath[Integer]("pageNum", None), params.fromQuery[String]("sortCriteria", None)) { (pageNum, sortCriteria) =>
        controllers_ProjectController_getMyEnrolledProjects34_invoker.call(ProjectController_12.getMyEnrolledProjects(pageNum, sortCriteria))
      }
  
    // @LINE:63
    case controllers_ProjectController_setProjectZoneAsGeoNEX35_route(params@_) =>
      call { 
        controllers_ProjectController_setProjectZoneAsGeoNEX35_invoker.call(ProjectController_12.setProjectZoneAsGeoNEX())
      }
  
    // @LINE:64
    case controllers_ProjectController_followedByUser36_route(params@_) =>
      call(params.fromPath[Long]("id", None), params.fromPath[String]("eventList", None)) { (id, eventList) =>
        controllers_ProjectController_followedByUser36_invoker.call(ProjectController_12.followedByUser(id, eventList))
      }
  
    // @LINE:65
    case controllers_ProjectController_unFollowedByUser37_route(params@_) =>
      call(params.fromPath[Long]("id", None), params.fromPath[String]("eventList", None)) { (id, eventList) =>
        controllers_ProjectController_unFollowedByUser37_invoker.call(ProjectController_12.unFollowedByUser(id, eventList))
      }
  
    // @LINE:66
    case controllers_ProjectController_myFollowedProjects38_route(params@_) =>
      call(params.fromQuery[Integer]("page", Some(1)), params.fromQuery[String]("sortCriteria", Some(""))) { (page, sortCriteria) =>
        controllers_ProjectController_myFollowedProjects38_invoker.call(ProjectController_12.myFollowedProjects(page, sortCriteria))
      }
  
    // @LINE:67
    case controllers_ProjectController_checkParentProject39_route(params@_) =>
      call(params.fromPath[String]("parentProjectId", None)) { (parentProjectId) =>
        controllers_ProjectController_checkParentProject39_invoker.call(ProjectController_12.checkParentProject(parentProjectId))
      }
  
    // @LINE:68
    case controllers_ProjectController_addProjectFollowersPage40_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProjectController_addProjectFollowersPage40_invoker.call(ProjectController_12.addProjectFollowersPage(id))
      }
  
    // @LINE:69
    case controllers_ProjectController_addOneFollower41_route(params@_) =>
      call(params.fromPath[Long]("id", None), params.fromPath[String]("event", None)) { (id, event) =>
        controllers_ProjectController_addOneFollower41_invoker.call(ProjectController_12.addOneFollower(id, event))
      }
  
    // @LINE:70
    case controllers_ProjectController_deleteOneFollower42_route(params@_) =>
      call(params.fromPath[Long]("userId", None), params.fromPath[Long]("projectId", None), params.fromPath[String]("eventType", None)) { (userId, projectId, eventType) =>
        controllers_ProjectController_deleteOneFollower42_invoker.call(ProjectController_12.deleteOneFollower(userId, projectId, eventType))
      }
  
    // @LINE:75
    case controllers_ChallengeController_challengeRegisterPage43_route(params@_) =>
      call { 
        controllers_ChallengeController_challengeRegisterPage43_invoker.call(ChallengeController_16.challengeRegisterPage())
      }
  
    // @LINE:76
    case controllers_ChallengeController_challengeRegisterPOST44_route(params@_) =>
      call { 
        controllers_ChallengeController_challengeRegisterPOST44_invoker.call(ChallengeController_16.challengeRegisterPOST())
      }
  
    // @LINE:78
    case controllers_ChallengeController_challengeApplyPage45_route(params@_) =>
      call(params.fromPath[Long]("challengeId", None)) { (challengeId) =>
        controllers_ChallengeController_challengeApplyPage45_invoker.call(ChallengeController_16.challengeApplyPage(challengeId))
      }
  
    // @LINE:79
    case controllers_ChallengeController_challengeApplyPOST46_route(params@_) =>
      call(params.fromPath[Long]("challengeId", None)) { (challengeId) =>
        controllers_ChallengeController_challengeApplyPOST46_invoker.call(ChallengeController_16.challengeApplyPOST(challengeId))
      }
  
    // @LINE:80
    case controllers_ChallengeController_challengeEditPage47_route(params@_) =>
      call(params.fromPath[Long]("challengeId", None)) { (challengeId) =>
        controllers_ChallengeController_challengeEditPage47_invoker.call(ChallengeController_16.challengeEditPage(challengeId))
      }
  
    // @LINE:81
    case controllers_ChallengeController_challengeEditPageAdmin48_route(params@_) =>
      call(params.fromPath[Long]("challengeId", None)) { (challengeId) =>
        controllers_ChallengeController_challengeEditPageAdmin48_invoker.call(ChallengeController_16.challengeEditPageAdmin(challengeId))
      }
  
    // @LINE:82
    case controllers_ChallengeController_challengeEditPOST49_route(params@_) =>
      call(params.fromPath[Long]("challengeId", None)) { (challengeId) =>
        controllers_ChallengeController_challengeEditPOST49_invoker.call(ChallengeController_16.challengeEditPOST(challengeId))
      }
  
    // @LINE:83
    case controllers_ChallengeController_challengeEditPOSTAdmin50_route(params@_) =>
      call(params.fromPath[Long]("challengeId", None)) { (challengeId) =>
        controllers_ChallengeController_challengeEditPOSTAdmin50_invoker.call(ChallengeController_16.challengeEditPOSTAdmin(challengeId))
      }
  
    // @LINE:84
    case controllers_ChallengeController_closeChallenge51_route(params@_) =>
      call(params.fromPath[Long]("challengeId", None)) { (challengeId) =>
        controllers_ChallengeController_closeChallenge51_invoker.call(ChallengeController_16.closeChallenge(challengeId))
      }
  
    // @LINE:85
    case controllers_ChallengeController_challengeApplicationsList52_route(params@_) =>
      call(params.fromPath[String]("challengeType", None), params.fromPath[Long]("challengeId", None), params.fromQuery[Integer]("pageNum", Some(1)), params.fromQuery[String]("sortCriteria", Some(""))) { (challengeType, challengeId, pageNum, sortCriteria) =>
        controllers_ChallengeController_challengeApplicationsList52_invoker.call(ChallengeController_16.challengeApplicationsList(challengeType, challengeId, pageNum, sortCriteria))
      }
  
    // @LINE:89
    case controllers_ChallengeController_challengeApplicationStatusChange53_route(params@_) =>
      call(params.fromPath[Long]("challengeApplicationId", None), params.fromPath[String]("challengeApplicationStatus", None)) { (challengeApplicationId, challengeApplicationStatus) =>
        controllers_ChallengeController_challengeApplicationStatusChange53_invoker.call(ChallengeController_16.challengeApplicationStatusChange(challengeApplicationId, challengeApplicationStatus))
      }
  
    // @LINE:91
    case controllers_ChallengeController_challengeListAppliedByUser54_route(params@_) =>
      call(params.fromPath[Integer]("pageNum", None)) { (pageNum) =>
        controllers_ChallengeController_challengeListAppliedByUser54_invoker.call(ChallengeController_16.challengeListAppliedByUser(pageNum))
      }
  
    // @LINE:92
    case controllers_ChallengeController_challengeApplicationList55_route(params@_) =>
      call(params.fromPath[Integer]("pageNum", None), params.fromQuery[String]("sortCriteria", Some(""))) { (pageNum, sortCriteria) =>
        controllers_ChallengeController_challengeApplicationList55_invoker.call(ChallengeController_16.challengeApplicationList(pageNum, sortCriteria))
      }
  
    // @LINE:93
    case controllers_ChallengeController_challengeListPostedByUser56_route(params@_) =>
      call(params.fromPath[Integer]("pageNum", None)) { (pageNum) =>
        controllers_ChallengeController_challengeListPostedByUser56_invoker.call(ChallengeController_16.challengeListPostedByUser(pageNum))
      }
  
    // @LINE:94
    case controllers_ChallengeController_challengeApplicationDetail57_route(params@_) =>
      call(params.fromPath[Long]("challengeApplicationId", None)) { (challengeApplicationId) =>
        controllers_ChallengeController_challengeApplicationDetail57_invoker.call(ChallengeController_16.challengeApplicationDetail(challengeApplicationId))
      }
  
    // @LINE:95
    case controllers_ChallengeController_challengeStatusChange58_route(params@_) =>
      call(params.fromPath[Long]("challengeId", None), params.fromPath[String]("challengeStatus", None)) { (challengeId, challengeStatus) =>
        controllers_ChallengeController_challengeStatusChange58_invoker.call(ChallengeController_16.challengeStatusChange(challengeId, challengeStatus))
      }
  
    // @LINE:96
    case controllers_ChallengeController_challengeApplicationsDetail59_route(params@_) =>
      call(params.fromPath[Long]("challengeApplicationId", None)) { (challengeApplicationId) =>
        controllers_ChallengeController_challengeApplicationsDetail59_invoker.call(ChallengeController_16.challengeApplicationsDetail(challengeApplicationId))
      }
  
    // @LINE:98
    case controllers_ChallengeController_challengeList60_route(params@_) =>
      call(params.fromPath[Integer]("pageNum", None), params.fromQuery[String]("sortCriteria", Some(""))) { (pageNum, sortCriteria) =>
        controllers_ChallengeController_challengeList60_invoker.call(ChallengeController_16.challengeList(pageNum, sortCriteria))
      }
  
    // @LINE:99
    case controllers_ChallengeController_challengeListAdmin61_route(params@_) =>
      call(params.fromPath[Integer]("pageNum", None), params.fromQuery[String]("sortCriteria", Some(""))) { (pageNum, sortCriteria) =>
        controllers_ChallengeController_challengeListAdmin61_invoker.call(ChallengeController_16.challengeListAdmin(pageNum, sortCriteria))
      }
  
    // @LINE:100
    case controllers_ChallengeController_challengeDetail62_route(params@_) =>
      call(params.fromPath[Long]("challengeId", None)) { (challengeId) =>
        controllers_ChallengeController_challengeDetail62_invoker.call(ChallengeController_16.challengeDetail(challengeId))
      }
  
    // @LINE:101
    case controllers_ChallengeController_searchPage63_route(params@_) =>
      call { 
        controllers_ChallengeController_searchPage63_invoker.call(ChallengeController_16.searchPage())
      }
  
    // @LINE:102
    case controllers_ChallengeController_searchPOST64_route(params@_) =>
      call(params.fromPath[Integer]("pageNum", None), params.fromQuery[String]("sortCriteria", Some(""))) { (pageNum, sortCriteria) =>
        controllers_ChallengeController_searchPOST64_invoker.call(ChallengeController_16.searchPOST(pageNum, sortCriteria))
      }
  
    // @LINE:130
    case controllers_UserController_userRegisterPage65_route(params@_) =>
      call { 
        controllers_UserController_userRegisterPage65_invoker.call(UserController_10.userRegisterPage())
      }
  
    // @LINE:131
    case controllers_UserController_userForgotPasswordPage66_route(params@_) =>
      call { 
        controllers_UserController_userForgotPasswordPage66_invoker.call(UserController_10.userForgotPasswordPage())
      }
  
    // @LINE:132
    case controllers_UserController_resendActivationEmail67_route(params@_) =>
      call { 
        controllers_UserController_resendActivationEmail67_invoker.call(UserController_10.resendActivationEmail())
      }
  
    // @LINE:133
    case controllers_UserController_userResetPassword68_route(params@_) =>
      call { 
        controllers_UserController_userResetPassword68_invoker.call(UserController_10.userResetPassword())
      }
  
    // @LINE:134
    case controllers_UserController_updatePasswordPage69_route(params@_) =>
      call { 
        controllers_UserController_updatePasswordPage69_invoker.call(UserController_10.updatePasswordPage())
      }
  
    // @LINE:135
    case controllers_UserController_updatePasswordForUser70_route(params@_) =>
      call { 
        controllers_UserController_updatePasswordForUser70_invoker.call(UserController_10.updatePasswordForUser())
      }
  
    // @LINE:136
    case controllers_UserController_userRegisterPOST71_route(params@_) =>
      call { 
        controllers_UserController_userRegisterPOST71_invoker.call(UserController_10.userRegisterPOST())
      }
  
    // @LINE:137
    case controllers_UserController_userEditPage72_route(params@_) =>
      call { 
        controllers_UserController_userEditPage72_invoker.call(UserController_10.userEditPage())
      }
  
    // @LINE:138
    case controllers_UserController_userEditPOST73_route(params@_) =>
      call { 
        controllers_UserController_userEditPOST73_invoker.call(UserController_10.userEditPOST())
      }
  
    // @LINE:139
    case controllers_UserController_isEmailExisted74_route(params@_) =>
      call { 
        controllers_UserController_isEmailExisted74_invoker.call(UserController_10.isEmailExisted())
      }
  
    // @LINE:140
    case controllers_UserController_userList75_route(params@_) =>
      call(params.fromPath[Integer]("pageNum", None), params.fromQuery[String]("sortCriteria", None)) { (pageNum, sortCriteria) =>
        controllers_UserController_userList75_invoker.call(UserController_10.userList(pageNum, sortCriteria))
      }
  
    // @LINE:141
    case controllers_UserController_userDetailPage76_route(params@_) =>
      call(params.fromPath[Long]("userId", None)) { (userId) =>
        controllers_UserController_userDetailPage76_invoker.call(UserController_10.userDetailPage(userId))
      }
  
    // @LINE:143
    case controllers_UserController_userLogin77_route(params@_) =>
      call { 
        controllers_UserController_userLogin77_invoker.call(UserController_10.userLogin())
      }
  
    // @LINE:144
    case controllers_UserController_userImageByImageId78_route(params@_) =>
      call(params.fromPath[Long]("imageId", None)) { (imageId) =>
        controllers_UserController_userImageByImageId78_invoker.call(UserController_10.userImageByImageId(imageId))
      }
  
    // @LINE:145
    case controllers_UserController_validateEmail79_route(params@_) =>
      call { 
        controllers_UserController_validateEmail79_invoker.call(UserController_10.validateEmail())
      }
  
    // @LINE:146
    case controllers_UserController_followedByUser80_route(params@_) =>
      call(params.fromPath[Long]("id", None), params.fromPath[String]("page", None)) { (id, page) =>
        controllers_UserController_followedByUser80_invoker.call(UserController_10.followedByUser(id, page))
      }
  
    // @LINE:147
    case controllers_UserController_unFollowedByUser81_route(params@_) =>
      call(params.fromPath[Long]("id", None), params.fromPath[String]("page", None)) { (id, page) =>
        controllers_UserController_unFollowedByUser81_invoker.call(UserController_10.unFollowedByUser(id, page))
      }
  
    // @LINE:148
    case controllers_UserController_updateLevel82_route(params@_) =>
      call(params.fromPath[Long]("uid", None)) { (uid) =>
        controllers_UserController_updateLevel82_invoker.call(UserController_10.updateLevel(uid))
      }
  
    // @LINE:149
    case controllers_UserController_updatePassword83_route(params@_) =>
      call { 
        controllers_UserController_updatePassword83_invoker.call(UserController_10.updatePassword)
      }
  
    // @LINE:150
    case controllers_UserController_checkPassword84_route(params@_) =>
      call { 
        controllers_UserController_checkPassword84_invoker.call(UserController_10.checkPassword())
      }
  
    // @LINE:153
    case controllers_UserController_searchPage85_route(params@_) =>
      call { 
        controllers_UserController_searchPage85_invoker.call(UserController_10.searchPage())
      }
  
    // @LINE:154
    case controllers_UserController_searchPOST86_route(params@_) =>
      call(params.fromQuery[Integer]("pageNum", Some(1)), params.fromQuery[String]("sortCriteria", Some("id"))) { (pageNum, sortCriteria) =>
        controllers_UserController_searchPOST86_invoker.call(UserController_10.searchPOST(pageNum, sortCriteria))
      }
  
    // @LINE:155
    case controllers_UserController_userDelete87_route(params@_) =>
      call { 
        controllers_UserController_userDelete87_invoker.call(UserController_10.userDelete())
      }
  
    // @LINE:156
    case controllers_UserController_allUserIds88_route(params@_) =>
      call { 
        controllers_UserController_allUserIds88_invoker.call(UserController_10.allUserIds())
      }
  
    // @LINE:158
    case controllers_UserController_myFollowers89_route(params@_) =>
      call(params.fromQuery[Integer]("page", Some(1)), params.fromQuery[String]("sortCriteria", Some("id"))) { (page, sortCriteria) =>
        controllers_UserController_myFollowers89_invoker.call(UserController_10.myFollowers(page, sortCriteria))
      }
  
    // @LINE:159
    case controllers_UserController_myFollowees90_route(params@_) =>
      call(params.fromQuery[Integer]("page", Some(1)), params.fromQuery[String]("sortCriteria", Some("id")), params.fromQuery[Boolean]("isCallerMySpacePage", Some(false))) { (page, sortCriteria, isCallerMySpacePage) =>
        controllers_UserController_myFollowees90_invoker.call(UserController_10.myFollowees(page, sortCriteria, isCallerMySpacePage))
      }
  
    // @LINE:161
    case controllers_UserController_mySpacePage91_route(params@_) =>
      call { 
        controllers_UserController_mySpacePage91_invoker.call(UserController_10.mySpacePage())
      }
  
    // @LINE:163
    case controllers_UserController_activateUser92_route(params@_) =>
      call(params.fromPath[String]("hashcode", None)) { (hashcode) =>
        controllers_UserController_activateUser92_invoker.call(UserController_10.activateUser(hashcode))
      }
  
    // @LINE:170
    case controllers_UserController_userSaved93_route(params@_) =>
      call(params.fromPath[String]("hashcode", None)) { (hashcode) =>
        controllers_UserController_userSaved93_invoker.call(UserController_10.userSaved(hashcode))
      }
  
    // @LINE:174
    case controllers_OrganizationController_organizationDetailPageAdmin94_route(params@_) =>
      call(params.fromPath[Long]("organizationId", None)) { (organizationId) =>
        controllers_OrganizationController_organizationDetailPageAdmin94_invoker.call(OrganizationController_17.organizationDetailPageAdmin(organizationId))
      }
  
    // @LINE:175
    case controllers_OrganizationController_organizationDetailPage95_route(params@_) =>
      call(params.fromPath[Long]("organizationId", None)) { (organizationId) =>
        controllers_OrganizationController_organizationDetailPage95_invoker.call(OrganizationController_17.organizationDetailPage(organizationId))
      }
  
    // @LINE:177
    case controllers_OrganizationController_organizationListPage96_route(params@_) =>
      call(params.fromPath[Integer]("pageNum", None), params.fromQuery[String]("sortCriteria", None)) { (pageNum, sortCriteria) =>
        controllers_OrganizationController_organizationListPage96_invoker.call(OrganizationController_17.organizationListPage(pageNum, sortCriteria))
      }
  
    // @LINE:178
    case controllers_OrganizationController_organizationRegisterPOST97_route(params@_) =>
      call { 
        controllers_OrganizationController_organizationRegisterPOST97_invoker.call(OrganizationController_17.organizationRegisterPOST())
      }
  
    // @LINE:179
    case controllers_OrganizationController_organizationEditPOST98_route(params@_) =>
      call(params.fromQuery[Long]("organizationId", None)) { (organizationId) =>
        controllers_OrganizationController_organizationEditPOST98_invoker.call(OrganizationController_17.organizationEditPOST(organizationId))
      }
  
    // @LINE:180
    case controllers_OrganizationController_organizationRegisterPage99_route(params@_) =>
      call { 
        controllers_OrganizationController_organizationRegisterPage99_invoker.call(OrganizationController_17.organizationRegisterPage)
      }
  
    // @LINE:181
    case controllers_OrganizationController_organizationEditPage100_route(params@_) =>
      call { 
        controllers_OrganizationController_organizationEditPage100_invoker.call(OrganizationController_17.organizationEditPage())
      }
  
    // @LINE:182
    case controllers_OrganizationController_searchPage101_route(params@_) =>
      call { 
        controllers_OrganizationController_searchPage101_invoker.call(OrganizationController_17.searchPage)
      }
  
    // @LINE:183
    case controllers_OrganizationController_searchPOST102_route(params@_) =>
      call(params.fromQuery[Integer]("pageNum", Some(1)), params.fromQuery[String]("sortCriteria", Some("id"))) { (pageNum, sortCriteria) =>
        controllers_OrganizationController_searchPOST102_invoker.call(OrganizationController_17.searchPOST(pageNum, sortCriteria))
      }
  
    // @LINE:187
    case controllers_BugReportController_bugReportRegisterPage103_route(params@_) =>
      call { 
        controllers_BugReportController_bugReportRegisterPage103_invoker.call(BugReportController_6.bugReportRegisterPage())
      }
  
    // @LINE:188
    case controllers_BugReportController_bugReportRegisterPOST104_route(params@_) =>
      call { 
        controllers_BugReportController_bugReportRegisterPOST104_invoker.call(BugReportController_6.bugReportRegisterPOST())
      }
  
    // @LINE:189
    case controllers_BugReportController_bugReportEditPage105_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_BugReportController_bugReportEditPage105_invoker.call(BugReportController_6.bugReportEditPage(id))
      }
  
    // @LINE:190
    case controllers_BugReportController_bugReportEditPOST106_route(params@_) =>
      call(params.fromPath[Long]("bugReportId", None)) { (bugReportId) =>
        controllers_BugReportController_bugReportEditPOST106_invoker.call(BugReportController_6.bugReportEditPOST(bugReportId))
      }
  
    // @LINE:191
    case controllers_BugReportController_bugReportDetail107_route(params@_) =>
      call(params.fromPath[Long]("bugReportId", None)) { (bugReportId) =>
        controllers_BugReportController_bugReportDetail107_invoker.call(BugReportController_6.bugReportDetail(bugReportId))
      }
  
    // @LINE:192
    case controllers_BugReportController_bugReportList108_route(params@_) =>
      call(params.fromQuery[Long]("page", Some(1)), params.fromQuery[String]("sortCriteria", Some("publish_time_stamp" ))) { (page, sortCriteria) =>
        controllers_BugReportController_bugReportList108_invoker.call(BugReportController_6.bugReportList(page, sortCriteria))
      }
  
    // @LINE:193
    case controllers_BugReportController_bugReportDelete109_route(params@_) =>
      call(params.fromPath[Long]("bugReportId", None)) { (bugReportId) =>
        controllers_BugReportController_bugReportDelete109_invoker.call(BugReportController_6.bugReportDelete(bugReportId))
      }
  
    // @LINE:195
    case controllers_BugReportController_markAsSolved110_route(params@_) =>
      call(params.fromPath[Long]("bugReportId", None), params.fromPath[Long]("fixerId", None)) { (bugReportId, fixerId) =>
        controllers_BugReportController_markAsSolved110_invoker.call(BugReportController_6.markAsSolved(bugReportId, fixerId))
      }
  
    // @LINE:199
    case controllers_SuggestionController_suggestionRegisterPage111_route(params@_) =>
      call { 
        controllers_SuggestionController_suggestionRegisterPage111_invoker.call(SuggestionController_1.suggestionRegisterPage())
      }
  
    // @LINE:200
    case controllers_SuggestionController_suggestionRegisterPOST112_route(params@_) =>
      call { 
        controllers_SuggestionController_suggestionRegisterPOST112_invoker.call(SuggestionController_1.suggestionRegisterPOST())
      }
  
    // @LINE:201
    case controllers_SuggestionController_suggestionEditPage113_route(params@_) =>
      call(params.fromPath[Long]("suggestionId", None)) { (suggestionId) =>
        controllers_SuggestionController_suggestionEditPage113_invoker.call(SuggestionController_1.suggestionEditPage(suggestionId))
      }
  
    // @LINE:202
    case controllers_SuggestionController_suggestionEditPOST114_route(params@_) =>
      call(params.fromPath[Long]("suggestionId", None)) { (suggestionId) =>
        controllers_SuggestionController_suggestionEditPOST114_invoker.call(SuggestionController_1.suggestionEditPOST(suggestionId))
      }
  
    // @LINE:203
    case controllers_SuggestionController_suggestionDetail115_route(params@_) =>
      call(params.fromPath[Long]("suggestionId", None)) { (suggestionId) =>
        controllers_SuggestionController_suggestionDetail115_invoker.call(SuggestionController_1.suggestionDetail(suggestionId))
      }
  
    // @LINE:204
    case controllers_SuggestionController_suggestionList116_route(params@_) =>
      call(params.fromQuery[Long]("page", Some(1)), params.fromQuery[String]("sortCriteria", Some("publish_time_stamp" ))) { (page, sortCriteria) =>
        controllers_SuggestionController_suggestionList116_invoker.call(SuggestionController_1.suggestionList(page, sortCriteria))
      }
  
    // @LINE:205
    case controllers_SuggestionController_suggestionDelete117_route(params@_) =>
      call(params.fromPath[Long]("suggestionId", None)) { (suggestionId) =>
        controllers_SuggestionController_suggestionDelete117_invoker.call(SuggestionController_1.suggestionDelete(suggestionId))
      }
  
    // @LINE:207
    case controllers_SuggestionController_markAsSolved118_route(params@_) =>
      call(params.fromPath[Long]("suggestionId", None), params.fromPath[Long]("implementorId", None)) { (suggestionId, implementorId) =>
        controllers_SuggestionController_markAsSolved118_invoker.call(SuggestionController_1.markAsSolved(suggestionId, implementorId))
      }
  
    // @LINE:212
    case controllers_TechnologyController_technologyRegisterPage119_route(params@_) =>
      call { 
        controllers_TechnologyController_technologyRegisterPage119_invoker.call(TechnologyController_7.technologyRegisterPage())
      }
  
    // @LINE:213
    case controllers_TechnologyController_technologyRegisterPOST120_route(params@_) =>
      call { 
        controllers_TechnologyController_technologyRegisterPOST120_invoker.call(TechnologyController_7.technologyRegisterPOST())
      }
  
    // @LINE:214
    case controllers_TechnologyController_technologyEditPage121_route(params@_) =>
      call(params.fromPath[Long]("technologyId", None)) { (technologyId) =>
        controllers_TechnologyController_technologyEditPage121_invoker.call(TechnologyController_7.technologyEditPage(technologyId))
      }
  
    // @LINE:215
    case controllers_TechnologyController_technologyEditPOST122_route(params@_) =>
      call(params.fromPath[Long]("technologyId", None)) { (technologyId) =>
        controllers_TechnologyController_technologyEditPOST122_invoker.call(TechnologyController_7.technologyEditPOST(technologyId))
      }
  
    // @LINE:217
    case controllers_TechnologyController_technologyList123_route(params@_) =>
      call(params.fromPath[Integer]("pageNum", None), params.fromQuery[String]("sortCriteria", Some(""))) { (pageNum, sortCriteria) =>
        controllers_TechnologyController_technologyList123_invoker.call(TechnologyController_7.technologyList(pageNum, sortCriteria))
      }
  
    // @LINE:218
    case controllers_TechnologyController_technologyDetail124_route(params@_) =>
      call(params.fromPath[Long]("technologyId", None)) { (technologyId) =>
        controllers_TechnologyController_technologyDetail124_invoker.call(TechnologyController_7.technologyDetail(technologyId))
      }
  
    // @LINE:219
    case controllers_TechnologyController_searchPage125_route(params@_) =>
      call { 
        controllers_TechnologyController_searchPage125_invoker.call(TechnologyController_7.searchPage())
      }
  
    // @LINE:220
    case controllers_TechnologyController_searchPOST126_route(params@_) =>
      call(params.fromQuery[Integer]("pageNum", None), params.fromQuery[String]("sortCriteria", None)) { (pageNum, sortCriteria) =>
        controllers_TechnologyController_searchPOST126_invoker.call(TechnologyController_7.searchPOST(pageNum, sortCriteria))
      }
  
    // @LINE:221
    case controllers_TechnologyController_deleteTechnology127_route(params@_) =>
      call(params.fromPath[Long]("technologyId", None)) { (technologyId) =>
        controllers_TechnologyController_deleteTechnology127_invoker.call(TechnologyController_7.deleteTechnology(technologyId))
      }
  
    // @LINE:222
    case controllers_TechnologyController_downloadTechnologyFile128_route(params@_) =>
      call(params.fromPath[Long]("serviceId", None)) { (serviceId) =>
        controllers_TechnologyController_downloadTechnologyFile128_invoker.call(TechnologyController_7.downloadTechnologyFile(serviceId))
      }
  
    // @LINE:240
    case controllers_JobController_jobRegisterPage129_route(params@_) =>
      call { 
        controllers_JobController_jobRegisterPage129_invoker.call(JobController_9.jobRegisterPage())
      }
  
    // @LINE:241
    case controllers_JobController_jobRegisterPOST130_route(params@_) =>
      call { 
        controllers_JobController_jobRegisterPOST130_invoker.call(JobController_9.jobRegisterPOST())
      }
  
    // @LINE:242
    case controllers_JobController_jobEditPage131_route(params@_) =>
      call(params.fromPath[Long]("jobId", None)) { (jobId) =>
        controllers_JobController_jobEditPage131_invoker.call(JobController_9.jobEditPage(jobId))
      }
  
    // @LINE:243
    case controllers_JobController_jobEditPOST132_route(params@_) =>
      call(params.fromPath[Long]("jobId", None)) { (jobId) =>
        controllers_JobController_jobEditPOST132_invoker.call(JobController_9.jobEditPOST(jobId))
      }
  
    // @LINE:244
    case controllers_JobController_jobApplyPage133_route(params@_) =>
      call(params.fromPath[Long]("jobId", None)) { (jobId) =>
        controllers_JobController_jobApplyPage133_invoker.call(JobController_9.jobApplyPage(jobId))
      }
  
    // @LINE:245
    case controllers_JobController_jobApplyPOST134_route(params@_) =>
      call(params.fromPath[Long]("jobId", None)) { (jobId) =>
        controllers_JobController_jobApplyPOST134_invoker.call(JobController_9.jobApplyPOST(jobId))
      }
  
    // @LINE:246
    case controllers_JobController_jobApplicationList135_route(params@_) =>
      call(params.fromPath[Integer]("pageNum", None), params.fromQuery[String]("sortCriteria", Some(""))) { (pageNum, sortCriteria) =>
        controllers_JobController_jobApplicationList135_invoker.call(JobController_9.jobApplicationList(pageNum, sortCriteria))
      }
  
    // @LINE:247
    case controllers_JobController_jobListAppliedByUser136_route(params@_) =>
      call(params.fromPath[Integer]("pageNum", None)) { (pageNum) =>
        controllers_JobController_jobListAppliedByUser136_invoker.call(JobController_9.jobListAppliedByUser(pageNum))
      }
  
    // @LINE:249
    case controllers_JobController_jobList137_route(params@_) =>
      call(params.fromPath[Integer]("pageNum", None), params.fromQuery[String]("sortCriteria", Some(""))) { (pageNum, sortCriteria) =>
        controllers_JobController_jobList137_invoker.call(JobController_9.jobList(pageNum, sortCriteria))
      }
  
    // @LINE:250
    case controllers_JobController_jobListPostedByUser138_route(params@_) =>
      call(params.fromPath[Integer]("pageNum", None)) { (pageNum) =>
        controllers_JobController_jobListPostedByUser138_invoker.call(JobController_9.jobListPostedByUser(pageNum))
      }
  
    // @LINE:251
    case controllers_JobController_jobDetail139_route(params@_) =>
      call(params.fromPath[Long]("jobId", None)) { (jobId) =>
        controllers_JobController_jobDetail139_invoker.call(JobController_9.jobDetail(jobId))
      }
  
    // @LINE:252
    case controllers_JobController_searchPage140_route(params@_) =>
      call { 
        controllers_JobController_searchPage140_invoker.call(JobController_9.searchPage())
      }
  
    // @LINE:253
    case controllers_JobController_searchPOST141_route(params@_) =>
      call(params.fromQuery[Integer]("pageNum", None), params.fromQuery[String]("sortCriteria", None)) { (pageNum, sortCriteria) =>
        controllers_JobController_searchPOST141_invoker.call(JobController_9.searchPOST(pageNum, sortCriteria))
      }
  
    // @LINE:254
    case controllers_JobController_deleteJob142_route(params@_) =>
      call(params.fromPath[Long]("jobId", None)) { (jobId) =>
        controllers_JobController_deleteJob142_invoker.call(JobController_9.deleteJob(jobId))
      }
  
    // @LINE:256
    case controllers_JobController_jobStatueChange143_route(params@_) =>
      call(params.fromPath[Long]("jobId", None), params.fromPath[String]("jobStatus", None)) { (jobId, jobStatus) =>
        controllers_JobController_jobStatueChange143_invoker.call(JobController_9.jobStatueChange(jobId, jobStatus))
      }
  
    // @LINE:258
    case controllers_JobController_jobApplicationDetail144_route(params@_) =>
      call(params.fromPath[Long]("jobApplicationId", None)) { (jobApplicationId) =>
        controllers_JobController_jobApplicationDetail144_invoker.call(JobController_9.jobApplicationDetail(jobApplicationId))
      }
  
    // @LINE:269
    case controllers_JobController_jobApplicationsList145_route(params@_) =>
      call(params.fromPath[String]("jobType", None), params.fromPath[Long]("jobId", None), params.fromQuery[Integer]("pageNum", None), params.fromQuery[String]("sortCriteria", Some(""))) { (jobType, jobId, pageNum, sortCriteria) =>
        controllers_JobController_jobApplicationsList145_invoker.call(JobController_9.jobApplicationsList(jobType, jobId, pageNum, sortCriteria))
      }
  
    // @LINE:276
    case controllers_RAJobController_rajobRegisterPage146_route(params@_) =>
      call { 
        controllers_RAJobController_rajobRegisterPage146_invoker.call(RAJobController_14.rajobRegisterPage())
      }
  
    // @LINE:277
    case controllers_RAJobController_rajobRegisterPOST147_route(params@_) =>
      call { 
        controllers_RAJobController_rajobRegisterPOST147_invoker.call(RAJobController_14.rajobRegisterPOST())
      }
  
    // @LINE:278
    case controllers_RAJobController_rajobEditPage148_route(params@_) =>
      call(params.fromPath[Long]("rajobId", None), params.fromPath[String]("status", None)) { (rajobId, status) =>
        controllers_RAJobController_rajobEditPage148_invoker.call(RAJobController_14.rajobEditPage(rajobId, status))
      }
  
    // @LINE:279
    case controllers_RAJobController_rajobEditPOST149_route(params@_) =>
      call(params.fromPath[Long]("rajobId", None)) { (rajobId) =>
        controllers_RAJobController_rajobEditPOST149_invoker.call(RAJobController_14.rajobEditPOST(rajobId))
      }
  
    // @LINE:280
    case controllers_RAJobController_rajobApplyPage150_route(params@_) =>
      call(params.fromPath[Long]("rajobId", None)) { (rajobId) =>
        controllers_RAJobController_rajobApplyPage150_invoker.call(RAJobController_14.rajobApplyPage(rajobId))
      }
  
    // @LINE:281
    case controllers_RAJobController_rajobApplyPOST151_route(params@_) =>
      call(params.fromPath[Long]("rajobId", None)) { (rajobId) =>
        controllers_RAJobController_rajobApplyPOST151_invoker.call(RAJobController_14.rajobApplyPOST(rajobId))
      }
  
    // @LINE:283
    case controllers_RAJobController_rajobStatueChange152_route(params@_) =>
      call(params.fromPath[Long]("rajobId", None), params.fromPath[String]("rajobStatus", None)) { (rajobId, rajobStatus) =>
        controllers_RAJobController_rajobStatueChange152_invoker.call(RAJobController_14.rajobStatueChange(rajobId, rajobStatus))
      }
  
    // @LINE:284
    case controllers_RAJobController_rajobApplicationStatusChange153_route(params@_) =>
      call(params.fromPath[Long]("rajobApplicationId", None), params.fromPath[String]("rajobApplicationStatus", None)) { (rajobApplicationId, rajobApplicationStatus) =>
        controllers_RAJobController_rajobApplicationStatusChange153_invoker.call(RAJobController_14.rajobApplicationStatusChange(rajobApplicationId, rajobApplicationStatus))
      }
  
    // @LINE:286
    case controllers_RAJobController_rajobApplicationDetail154_route(params@_) =>
      call(params.fromPath[Long]("rajobApplicationId", None)) { (rajobApplicationId) =>
        controllers_RAJobController_rajobApplicationDetail154_invoker.call(RAJobController_14.rajobApplicationDetail(rajobApplicationId))
      }
  
    // @LINE:289
    case controllers_RAJobController_rajobList155_route(params@_) =>
      call(params.fromPath[Integer]("pageNum", None), params.fromQuery[String]("sortCriteria", Some(""))) { (pageNum, sortCriteria) =>
        controllers_RAJobController_rajobList155_invoker.call(RAJobController_14.rajobList(pageNum, sortCriteria))
      }
  
    // @LINE:290
    case controllers_RAJobController_rajobListPostedByUser156_route(params@_) =>
      call(params.fromPath[Integer]("pageNum", None)) { (pageNum) =>
        controllers_RAJobController_rajobListPostedByUser156_invoker.call(RAJobController_14.rajobListPostedByUser(pageNum))
      }
  
    // @LINE:291
    case controllers_RAJobController_rajobListAppliedByUser157_route(params@_) =>
      call(params.fromPath[Integer]("pageNum", None)) { (pageNum) =>
        controllers_RAJobController_rajobListAppliedByUser157_invoker.call(RAJobController_14.rajobListAppliedByUser(pageNum))
      }
  
    // @LINE:293
    case controllers_RAJobController_rajobDetail158_route(params@_) =>
      call(params.fromPath[Long]("rajobId", None)) { (rajobId) =>
        controllers_RAJobController_rajobDetail158_invoker.call(RAJobController_14.rajobDetail(rajobId))
      }
  
    // @LINE:294
    case controllers_RAJobController_searchPage159_route(params@_) =>
      call { 
        controllers_RAJobController_searchPage159_invoker.call(RAJobController_14.searchPage())
      }
  
    // @LINE:295
    case controllers_RAJobController_searchPOST160_route(params@_) =>
      call(params.fromQuery[Integer]("pageNum", None), params.fromQuery[String]("sortCriteria", None)) { (pageNum, sortCriteria) =>
        controllers_RAJobController_searchPOST160_invoker.call(RAJobController_14.searchPOST(pageNum, sortCriteria))
      }
  
    // @LINE:296
    case controllers_RAJobController_deleteRAJob161_route(params@_) =>
      call(params.fromPath[Long]("rajobId", None)) { (rajobId) =>
        controllers_RAJobController_deleteRAJob161_invoker.call(RAJobController_14.deleteRAJob(rajobId))
      }
  
    // @LINE:297
    case controllers_RAJobController_closeRAJob162_route(params@_) =>
      call(params.fromPath[Long]("rajobId", None)) { (rajobId) =>
        controllers_RAJobController_closeRAJob162_invoker.call(RAJobController_14.closeRAJob(rajobId))
      }
  
    // @LINE:306
    case controllers_RAJobController_sendOfferEmail163_route(params@_) =>
      call(params.fromQuery[Long]("rajobApplicationId", None), params.fromQuery[String]("ccString", None)) { (rajobApplicationId, ccString) =>
        controllers_RAJobController_sendOfferEmail163_invoker.call(RAJobController_14.sendOfferEmail(rajobApplicationId, ccString))
      }
  
    // @LINE:312
    case controllers_TACandidateController_tacandidateRegisterPage164_route(params@_) =>
      call { 
        controllers_TACandidateController_tacandidateRegisterPage164_invoker.call(TACandidateController_20.tacandidateRegisterPage())
      }
  
    // @LINE:313
    case controllers_TACandidateController_tacandidateRegisterPOST165_route(params@_) =>
      call { 
        controllers_TACandidateController_tacandidateRegisterPOST165_invoker.call(TACandidateController_20.tacandidateRegisterPOST())
      }
  
    // @LINE:314
    case controllers_TACandidateController_tacandidateList166_route(params@_) =>
      call(params.fromPath[Integer]("pageNum", None), params.fromQuery[String]("sortCriteria", Some(""))) { (pageNum, sortCriteria) =>
        controllers_TACandidateController_tacandidateList166_invoker.call(TACandidateController_20.tacandidateList(pageNum, sortCriteria))
      }
  
    // @LINE:315
    case controllers_TACandidateController_tacandidateDetail167_route(params@_) =>
      call(params.fromPath[Long]("Id", None)) { (Id) =>
        controllers_TACandidateController_tacandidateDetail167_invoker.call(TACandidateController_20.tacandidateDetail(Id))
      }
  
    // @LINE:316
    case controllers_TACandidateController_getCurrentUserAssignments168_route(params@_) =>
      call { 
        controllers_TACandidateController_getCurrentUserAssignments168_invoker.call(TACandidateController_20.getCurrentUserAssignments())
      }
  
    // @LINE:323
    case controllers_CourseController_courseList169_route(params@_) =>
      call { 
        controllers_CourseController_courseList169_invoker.call(CourseController_2.courseList())
      }
  
    // @LINE:331
    case controllers_CourseTAAssignmentController_taHiringStatusList170_route(params@_) =>
      call(params.fromPath[Integer]("pageNum", None), params.fromQuery[String]("sortCriteria", Some(""))) { (pageNum, sortCriteria) =>
        controllers_CourseTAAssignmentController_taHiringStatusList170_invoker.call(CourseTAAssignmentController_5.taHiringStatusList(pageNum, sortCriteria))
      }
  
    // @LINE:332
    case controllers_CourseTAAssignmentController_assignmentDetail171_route(params@_) =>
      call(params.fromPath[Long]("Id", None)) { (Id) =>
        controllers_CourseTAAssignmentController_assignmentDetail171_invoker.call(CourseTAAssignmentController_5.assignmentDetail(Id))
      }
  
    // @LINE:333
    case controllers_CourseTAAssignmentController_assignmentRegisterPOST172_route(params@_) =>
      call { 
        controllers_CourseTAAssignmentController_assignmentRegisterPOST172_invoker.call(CourseTAAssignmentController_5.assignmentRegisterPOST())
      }
  
    // @LINE:340
    case controllers_TAJobController_tajobRegisterPage173_route(params@_) =>
      call { 
        controllers_TAJobController_tajobRegisterPage173_invoker.call(TAJobController_8.tajobRegisterPage())
      }
  
    // @LINE:341
    case controllers_TAJobController_tajobRegisterPOST174_route(params@_) =>
      call { 
        controllers_TAJobController_tajobRegisterPOST174_invoker.call(TAJobController_8.tajobRegisterPOST())
      }
  
    // @LINE:342
    case controllers_TAJobController_tajobEditPage175_route(params@_) =>
      call(params.fromPath[Long]("tajobId", None)) { (tajobId) =>
        controllers_TAJobController_tajobEditPage175_invoker.call(TAJobController_8.tajobEditPage(tajobId))
      }
  
    // @LINE:343
    case controllers_TAJobController_tajobEditPOST176_route(params@_) =>
      call(params.fromPath[Long]("tajobId", None)) { (tajobId) =>
        controllers_TAJobController_tajobEditPOST176_invoker.call(TAJobController_8.tajobEditPOST(tajobId))
      }
  
    // @LINE:344
    case controllers_TAJobController_tajobApplyPage177_route(params@_) =>
      call(params.fromPath[Long]("tajobId", None)) { (tajobId) =>
        controllers_TAJobController_tajobApplyPage177_invoker.call(TAJobController_8.tajobApplyPage(tajobId))
      }
  
    // @LINE:345
    case controllers_TAJobController_tajobApplyPOST178_route(params@_) =>
      call(params.fromPath[Long]("tajobId", None)) { (tajobId) =>
        controllers_TAJobController_tajobApplyPOST178_invoker.call(TAJobController_8.tajobApplyPOST(tajobId))
      }
  
    // @LINE:347
    case controllers_TAJobController_tajobStatueChange179_route(params@_) =>
      call(params.fromPath[Long]("tajobId", None), params.fromPath[String]("tajobStatus", None)) { (tajobId, tajobStatus) =>
        controllers_TAJobController_tajobStatueChange179_invoker.call(TAJobController_8.tajobStatueChange(tajobId, tajobStatus))
      }
  
    // @LINE:349
    case controllers_TAJobController_tajobApplicationDetail180_route(params@_) =>
      call(params.fromPath[Long]("tajobApplicationId", None)) { (tajobApplicationId) =>
        controllers_TAJobController_tajobApplicationDetail180_invoker.call(TAJobController_8.tajobApplicationDetail(tajobApplicationId))
      }
  
    // @LINE:350
    case controllers_TAJobController_saveTAJobPdf181_route(params@_) =>
      call(params.fromPath[Long]("tajobApplicationId", None)) { (tajobApplicationId) =>
        controllers_TAJobController_saveTAJobPdf181_invoker.call(TAJobController_8.saveTAJobPdf(tajobApplicationId))
      }
  
    // @LINE:352
    case controllers_TAJobController_tajobList182_route(params@_) =>
      call(params.fromPath[Integer]("pageNum", None), params.fromQuery[String]("sortCriteria", Some(""))) { (pageNum, sortCriteria) =>
        controllers_TAJobController_tajobList182_invoker.call(TAJobController_8.tajobList(pageNum, sortCriteria))
      }
  
    // @LINE:353
    case controllers_TAJobController_tajobListPostedByUser183_route(params@_) =>
      call(params.fromPath[Integer]("pageNum", None)) { (pageNum) =>
        controllers_TAJobController_tajobListPostedByUser183_invoker.call(TAJobController_8.tajobListPostedByUser(pageNum))
      }
  
    // @LINE:354
    case controllers_TAJobController_tajobDetail184_route(params@_) =>
      call(params.fromPath[Long]("tajobId", None)) { (tajobId) =>
        controllers_TAJobController_tajobDetail184_invoker.call(TAJobController_8.tajobDetail(tajobId))
      }
  
    // @LINE:355
    case controllers_TAJobController_searchPage185_route(params@_) =>
      call { 
        controllers_TAJobController_searchPage185_invoker.call(TAJobController_8.searchPage())
      }
  
    // @LINE:356
    case controllers_TAJobController_searchPOST186_route(params@_) =>
      call(params.fromQuery[Integer]("pageNum", None), params.fromQuery[String]("sortCriteria", None)) { (pageNum, sortCriteria) =>
        controllers_TAJobController_searchPOST186_invoker.call(TAJobController_8.searchPOST(pageNum, sortCriteria))
      }
  
    // @LINE:357
    case controllers_TAJobController_deleteTAJob187_route(params@_) =>
      call(params.fromPath[Long]("tajobId", None)) { (tajobId) =>
        controllers_TAJobController_deleteTAJob187_invoker.call(TAJobController_8.deleteTAJob(tajobId))
      }
  
    // @LINE:368
    case controllers_AdminController_dashboard188_route(params@_) =>
      call { 
        controllers_AdminController_dashboard188_invoker.call(AdminController_0.dashboard())
      }
  
    // @LINE:369
    case controllers_AdminController_userManagement189_route(params@_) =>
      call(params.fromPath[Integer]("pageNum", None), params.fromQuery[String]("sortCriteria", Some("id"))) { (pageNum, sortCriteria) =>
        controllers_AdminController_userManagement189_invoker.call(AdminController_0.userManagement(pageNum, sortCriteria))
      }
  
    // @LINE:370
    case controllers_AdminController_userDetail190_route(params@_) =>
      call(params.fromPath[Long]("userId", None)) { (userId) =>
        controllers_AdminController_userDetail190_invoker.call(AdminController_0.userDetail(userId))
      }
  
    // @LINE:371
    case controllers_AdminController_jobManagement191_route(params@_) =>
      call(params.fromPath[Integer]("pageNum", None), params.fromQuery[String]("sortCriteria", Some("id"))) { (pageNum, sortCriteria) =>
        controllers_AdminController_jobManagement191_invoker.call(AdminController_0.jobManagement(pageNum, sortCriteria))
      }
  
    // @LINE:372
    case controllers_AdminController_jobDetail192_route(params@_) =>
      call(params.fromPath[String]("jobType", None), params.fromPath[Long]("jobId", None)) { (jobType, jobId) =>
        controllers_AdminController_jobDetail192_invoker.call(AdminController_0.jobDetail(jobType, jobId))
      }
  
    // @LINE:373
    case controllers_AdminController_organizationManagement193_route(params@_) =>
      call(params.fromPath[Integer]("pageNum", None), params.fromQuery[String]("sortCriteria", Some("id"))) { (pageNum, sortCriteria) =>
        controllers_AdminController_organizationManagement193_invoker.call(AdminController_0.organizationManagement(pageNum, sortCriteria))
      }
  
    // @LINE:374
    case controllers_AdminController_technologyManagement194_route(params@_) =>
      call(params.fromPath[Integer]("pageNum", None), params.fromQuery[String]("sortCriteria", Some("id"))) { (pageNum, sortCriteria) =>
        controllers_AdminController_technologyManagement194_invoker.call(AdminController_0.technologyManagement(pageNum, sortCriteria))
      }
  
    // @LINE:379
    case controllers_AuthorController_authorRegisterPage195_route(params@_) =>
      call { 
        controllers_AuthorController_authorRegisterPage195_invoker.call(AuthorController_3.authorRegisterPage())
      }
  
    // @LINE:380
    case controllers_AuthorController_authorRegisterPOST196_route(params@_) =>
      call { 
        controllers_AuthorController_authorRegisterPOST196_invoker.call(AuthorController_3.authorRegisterPOST())
      }
  
    // @LINE:381
    case controllers_AuthorController_authorEditPage197_route(params@_) =>
      call { 
        controllers_AuthorController_authorEditPage197_invoker.call(AuthorController_3.authorEditPage())
      }
  
    // @LINE:382
    case controllers_AuthorController_authorEditPOST198_route(params@_) =>
      call { 
        controllers_AuthorController_authorEditPOST198_invoker.call(AuthorController_3.authorEditPOST())
      }
  
    // @LINE:383
    case controllers_AuthorController_authorList199_route(params@_) =>
      call(params.fromPath[Integer]("pageNum", None), params.fromQuery[String]("sortCriteria", None)) { (pageNum, sortCriteria) =>
        controllers_AuthorController_authorList199_invoker.call(AuthorController_3.authorList(pageNum, sortCriteria))
      }
  
    // @LINE:384
    case controllers_AuthorController_authorDetailPage200_route(params@_) =>
      call(params.fromPath[Long]("userId", None)) { (userId) =>
        controllers_AuthorController_authorDetailPage200_invoker.call(AuthorController_3.authorDetailPage(userId))
      }
  
    // @LINE:386
    case controllers_AuthorController_userEditPageAdmin201_route(params@_) =>
      call(params.fromPath[Long]("userId", None)) { (userId) =>
        controllers_AuthorController_userEditPageAdmin201_invoker.call(AuthorController_3.userEditPageAdmin(userId))
      }
  
    // @LINE:387
    case controllers_AuthorController_userEditPOSTAdmin202_route(params@_) =>
      call(params.fromPath[Long]("userId", None)) { (userId) =>
        controllers_AuthorController_userEditPOSTAdmin202_invoker.call(AuthorController_3.userEditPOSTAdmin(userId))
      }
  
    // @LINE:388
    case controllers_AuthorController_userListAdmin203_route(params@_) =>
      call(params.fromPath[Integer]("pageNum", None), params.fromQuery[String]("sortCriteria", None)) { (pageNum, sortCriteria) =>
        controllers_AuthorController_userListAdmin203_invoker.call(AuthorController_3.userListAdmin(pageNum, sortCriteria))
      }
  
    // @LINE:389
    case controllers_AuthorController_userDetailPageAdmin204_route(params@_) =>
      call(params.fromPath[Long]("userId", None)) { (userId) =>
        controllers_AuthorController_userDetailPageAdmin204_invoker.call(AuthorController_3.userDetailPageAdmin(userId))
      }
  
    // @LINE:393
    case controllers_AuthorController_searchPage205_route(params@_) =>
      call { 
        controllers_AuthorController_searchPage205_invoker.call(AuthorController_3.searchPage())
      }
  
    // @LINE:394
    case controllers_AuthorController_searchPOST206_route(params@_) =>
      call(params.fromQuery[Integer]("pageNum", Some(1)), params.fromQuery[String]("sortCriteria", Some("id"))) { (pageNum, sortCriteria) =>
        controllers_AuthorController_searchPOST206_invoker.call(AuthorController_3.searchPOST(pageNum, sortCriteria))
      }
  
    // @LINE:395
    case controllers_AuthorController_authorDelete207_route(params@_) =>
      call { 
        controllers_AuthorController_authorDelete207_invoker.call(AuthorController_3.authorDelete())
      }
  
    // @LINE:396
    case controllers_AuthorController_topAuthors208_route(params@_) =>
      call { 
        controllers_AuthorController_topAuthors208_invoker.call(AuthorController_3.topAuthors())
      }
  
    // @LINE:399
    case controllers_ReviewerController_reviewerRegisterPage209_route(params@_) =>
      call { 
        controllers_ReviewerController_reviewerRegisterPage209_invoker.call(ReviewerController_18.reviewerRegisterPage())
      }
  
    // @LINE:400
    case controllers_ReviewerController_reviewerRegisterPOST210_route(params@_) =>
      call { 
        controllers_ReviewerController_reviewerRegisterPOST210_invoker.call(ReviewerController_18.reviewerRegisterPOST())
      }
  
    // @LINE:401
    case controllers_ReviewerController_reviewerEditPage211_route(params@_) =>
      call { 
        controllers_ReviewerController_reviewerEditPage211_invoker.call(ReviewerController_18.reviewerEditPage())
      }
  
    // @LINE:402
    case controllers_ReviewerController_reviewerEditPOST212_route(params@_) =>
      call { 
        controllers_ReviewerController_reviewerEditPOST212_invoker.call(ReviewerController_18.reviewerEditPOST())
      }
  
    // @LINE:403
    case controllers_ReviewerController_reviewerList213_route(params@_) =>
      call(params.fromPath[Integer]("pageNum", None), params.fromQuery[String]("sortCriteria", None)) { (pageNum, sortCriteria) =>
        controllers_ReviewerController_reviewerList213_invoker.call(ReviewerController_18.reviewerList(pageNum, sortCriteria))
      }
  
    // @LINE:404
    case controllers_ReviewerController_reviewerDetailPage214_route(params@_) =>
      call(params.fromPath[Long]("userId", None)) { (userId) =>
        controllers_ReviewerController_reviewerDetailPage214_invoker.call(ReviewerController_18.reviewerDetailPage(userId))
      }
  
    // @LINE:408
    case controllers_ReviewerController_searchPage215_route(params@_) =>
      call { 
        controllers_ReviewerController_searchPage215_invoker.call(ReviewerController_18.searchPage())
      }
  
    // @LINE:409
    case controllers_ReviewerController_searchPOST216_route(params@_) =>
      call(params.fromQuery[Integer]("pageNum", Some(1)), params.fromQuery[String]("sortCriteria", Some("id"))) { (pageNum, sortCriteria) =>
        controllers_ReviewerController_searchPOST216_invoker.call(ReviewerController_18.searchPOST(pageNum, sortCriteria))
      }
  
    // @LINE:410
    case controllers_ReviewerController_reviewerDelete217_route(params@_) =>
      call { 
        controllers_ReviewerController_reviewerDelete217_invoker.call(ReviewerController_18.reviewerDelete())
      }
  
    // @LINE:414
    case controllers_PaperController_paperRegisterPage218_route(params@_) =>
      call { 
        controllers_PaperController_paperRegisterPage218_invoker.call(PaperController_13.paperRegisterPage())
      }
  
    // @LINE:415
    case controllers_PaperController_paperRegisterPOST219_route(params@_) =>
      call { 
        controllers_PaperController_paperRegisterPOST219_invoker.call(PaperController_13.paperRegisterPOST())
      }
  
    // @LINE:417
    case controllers_PaperController_paperList220_route(params@_) =>
      call(params.fromPath[Integer]("pageNum", None), params.fromQuery[String]("sortCriteria", Some(""))) { (pageNum, sortCriteria) =>
        controllers_PaperController_paperList220_invoker.call(PaperController_13.paperList(pageNum, sortCriteria))
      }
  
    // @LINE:418
    case controllers_PaperController_paperDetail221_route(params@_) =>
      call(params.fromPath[Long]("paperId", None)) { (paperId) =>
        controllers_PaperController_paperDetail221_invoker.call(PaperController_13.paperDetail(paperId))
      }
  
    // @LINE:419
    case controllers_PaperController_deletePaper222_route(params@_) =>
      call(params.fromPath[Long]("paperId", None)) { (paperId) =>
        controllers_PaperController_deletePaper222_invoker.call(PaperController_13.deletePaper(paperId))
      }
  
    // @LINE:421
    case controllers_PaperController_primeConnections223_route(params@_) =>
      call { 
        controllers_PaperController_primeConnections223_invoker.call(PaperController_13.primeConnections())
      }
  
    // @LINE:423
    case controllers_PaperController_relationGraph224_route(params@_) =>
      call { 
        controllers_PaperController_relationGraph224_invoker.call(PaperController_13.relationGraph())
      }
  
    // @LINE:424
    case controllers_PaperController_loadUploadPage225_route(params@_) =>
      call { 
        controllers_PaperController_loadUploadPage225_invoker.call(PaperController_13.loadUploadPage())
      }
  
    // @LINE:425
    case controllers_PaperController_processDBPLFile226_route(params@_) =>
      call { 
        controllers_PaperController_processDBPLFile226_invoker.call(PaperController_13.processDBPLFile())
      }
  
    // @LINE:427
    case controllers_PaperController_paperLDA227_route(params@_) =>
      call { 
        controllers_PaperController_paperLDA227_invoker.call(PaperController_13.paperLDA())
      }
  
    // @LINE:429
    case controllers_PaperController_authorAuthorRel228_route(params@_) =>
      call { 
        controllers_PaperController_authorAuthorRel228_invoker.call(PaperController_13.authorAuthorRel())
      }
  
    // @LINE:430
    case controllers_PaperController_ldaTopicDistribution229_route(params@_) =>
      call { 
        controllers_PaperController_ldaTopicDistribution229_invoker.call(PaperController_13.ldaTopicDistribution())
      }
  
    // @LINE:431
    case controllers_PaperController_searchPage230_route(params@_) =>
      call { 
        controllers_PaperController_searchPage230_invoker.call(PaperController_13.searchPage())
      }
  
    // @LINE:432
    case controllers_PaperController_searchPaper231_route(params@_) =>
      call(params.fromQuery[Integer]("pageNum", Some(1)), params.fromQuery[String]("sortCriteria", Some("id"))) { (pageNum, sortCriteria) =>
        controllers_PaperController_searchPaper231_invoker.call(PaperController_13.searchPaper(pageNum, sortCriteria))
      }
  
    // @LINE:435
    case controllers_GraphController_researchInterest232_route(params@_) =>
      call { 
        controllers_GraphController_researchInterest232_invoker.call(GraphController_11.researchInterest())
      }
  
    // @LINE:436
    case controllers_FileController_getFile233_route(params@_) =>
      call(params.fromPath[String]("tableName", None), params.fromPath[String]("challengeFileType", None), params.fromPath[String]("tableRecorderId", None)) { (tableName, challengeFileType, tableRecorderId) =>
        controllers_FileController_getFile233_invoker.call(FileController_22.getFile(tableName, challengeFileType, tableRecorderId))
      }
  }
}
