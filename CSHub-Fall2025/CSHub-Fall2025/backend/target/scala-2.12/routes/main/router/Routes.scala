// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ryan1/CSHub-Fall2025/CSHub-Fall2025/backend/conf/routes
// @DATE:Fri Apr 10 13:06:00 CDT 2026

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:40
  HomeController_5: controllers.HomeController,
  // @LINE:50
  CountController_4: controllers.CountController,
  // @LINE:60
  AsyncController_8: controllers.AsyncController,
  // @LINE:63
  Assets_23: controllers.Assets,
  // @LINE:72
  ProjectController_16: controllers.ProjectController,
  // @LINE:96
  ProjectController_21: javax.inject.Provider[controllers.ProjectController],
  // @LINE:104
  ChallengeController_19: controllers.ChallengeController,
  // @LINE:154
  JobController_13: controllers.JobController,
  // @LINE:180
  RAJobController_18: controllers.RAJobController,
  // @LINE:211
  TAJobController_12: controllers.TAJobController,
  // @LINE:237
  TACandidateController_24: controllers.TACandidateController,
  // @LINE:247
  CourseController_3: controllers.CourseController,
  // @LINE:257
  CourseTAAssignmentController_9: controllers.CourseTAAssignmentController,
  // @LINE:266
  UserController_14: controllers.UserController,
  // @LINE:295
  UserController_1: javax.inject.Provider[controllers.UserController],
  // @LINE:307
  OrganizationController_20: controllers.OrganizationController,
  // @LINE:320
  BugReportController_2: javax.inject.Provider[controllers.BugReportController],
  // @LINE:334
  SuggestionController_11: javax.inject.Provider[controllers.SuggestionController],
  // @LINE:343
  TechnologyController_10: controllers.TechnologyController,
  // @LINE:378
  AdminController_0: controllers.AdminController,
  // @LINE:393
  AuthorController_6: controllers.AuthorController,
  // @LINE:407
  ReviewerController_22: controllers.ReviewerController,
  // @LINE:419
  PaperController_17: controllers.PaperController,
  // @LINE:429
  GraphController_15: controllers.GraphController,
  // @LINE:440
  LogController_7: controllers.LogController,
  // @LINE:443
  FileController_25: controllers.FileController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:40
    HomeController_5: controllers.HomeController,
    // @LINE:50
    CountController_4: controllers.CountController,
    // @LINE:60
    AsyncController_8: controllers.AsyncController,
    // @LINE:63
    Assets_23: controllers.Assets,
    // @LINE:72
    ProjectController_16: controllers.ProjectController,
    // @LINE:96
    ProjectController_21: javax.inject.Provider[controllers.ProjectController],
    // @LINE:104
    ChallengeController_19: controllers.ChallengeController,
    // @LINE:154
    JobController_13: controllers.JobController,
    // @LINE:180
    RAJobController_18: controllers.RAJobController,
    // @LINE:211
    TAJobController_12: controllers.TAJobController,
    // @LINE:237
    TACandidateController_24: controllers.TACandidateController,
    // @LINE:247
    CourseController_3: controllers.CourseController,
    // @LINE:257
    CourseTAAssignmentController_9: controllers.CourseTAAssignmentController,
    // @LINE:266
    UserController_14: controllers.UserController,
    // @LINE:295
    UserController_1: javax.inject.Provider[controllers.UserController],
    // @LINE:307
    OrganizationController_20: controllers.OrganizationController,
    // @LINE:320
    BugReportController_2: javax.inject.Provider[controllers.BugReportController],
    // @LINE:334
    SuggestionController_11: javax.inject.Provider[controllers.SuggestionController],
    // @LINE:343
    TechnologyController_10: controllers.TechnologyController,
    // @LINE:378
    AdminController_0: controllers.AdminController,
    // @LINE:393
    AuthorController_6: controllers.AuthorController,
    // @LINE:407
    ReviewerController_22: controllers.ReviewerController,
    // @LINE:419
    PaperController_17: controllers.PaperController,
    // @LINE:429
    GraphController_15: controllers.GraphController,
    // @LINE:440
    LogController_7: controllers.LogController,
    // @LINE:443
    FileController_25: controllers.FileController
  ) = this(errorHandler, HomeController_5, CountController_4, AsyncController_8, Assets_23, ProjectController_16, ProjectController_21, ChallengeController_19, JobController_13, RAJobController_18, TAJobController_12, TACandidateController_24, CourseController_3, CourseTAAssignmentController_9, UserController_14, UserController_1, OrganizationController_20, BugReportController_2, SuggestionController_11, TechnologyController_10, AdminController_0, AuthorController_6, ReviewerController_22, PaperController_17, GraphController_15, LogController_7, FileController_25, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_5, CountController_4, AsyncController_8, Assets_23, ProjectController_16, ProjectController_21, ChallengeController_19, JobController_13, RAJobController_18, TAJobController_12, TACandidateController_24, CourseController_3, CourseTAAssignmentController_9, UserController_14, UserController_1, OrganizationController_20, BugReportController_2, SuggestionController_11, TechnologyController_10, AdminController_0, AuthorController_6, ReviewerController_22, PaperController_17, GraphController_15, LogController_7, FileController_25, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/addProject""", """controllers.ProjectController.addProject()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/updateProject/""" + "$" + """projectId<[^/]+>""", """controllers.ProjectController.updateProject(projectId:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/deleteProjectImage/""" + "$" + """projectId<[^/]+>""", """controllers.ProjectController.deleteProjectImage(projectId:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/deleteProjectPDF/""" + "$" + """projectId<[^/]+>""", """controllers.ProjectController.deleteProjectPDF(projectId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/projectList/""" + "$" + """userId<[^/]+>""", """controllers.ProjectController.projectList(userId:Long, pageLimit:Integer, pageNum:Integer, sortCriteria:java.util.Optional[String])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/teammember/""" + "$" + """projectId<[^/]+>""", """controllers.ProjectController.getTeamMembersByProjectId(projectId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/projectDetail/""" + "$" + """projectId<[^/]+>""", """controllers.ProjectController.getProjectById(projectId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/getProjectCreator/""" + "$" + """projectId<[^/]+>""", """controllers.ProjectController.getProjectCreator(projectId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/search/conditions""", """controllers.ProjectController.searchProjectsByCondition()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/setImage/""" + "$" + """projectId<[^/]+>""", """controllers.ProjectController.setImage(projectId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/setPDF/""" + "$" + """projectId<[^/]+>""", """controllers.ProjectController.setPDF(projectId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/addTeamMember/""" + "$" + """projectId<[^/]+>""", """controllers.ProjectController.addTeamMember(projectId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/setTeamMemberPhoto/""" + "$" + """memberId<[^/]+>""", """controllers.ProjectController.setTeamMemberPhoto(memberId:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/deleteTeamMember/""" + "$" + """memberId<[^/]+>""", """controllers.ProjectController.deleteTeamMember(memberId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/deleteProject/""" + "$" + """projectId<[^/]+>""", """controllers.ProjectController.deleteProject(projectId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/getProjectsByUser/""" + "$" + """userId<[^/]+>""", """controllers.ProjectController.getProjectsByCreator(userId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/checkProjectExist/""" + "$" + """projectId<[^/]+>""", """controllers.ProjectController.checkProjectExist(projectId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/isProjectNameExisted""", """controllers.ProjectController.checkProjectNameAvailability()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/saveDescriptionImage/""" + "$" + """projectId<[^/]+>/""" + "$" + """imageNumber<[^/]+>""", """controllers.ProjectController.saveDescriptionImage(projectId:Long, imageNumber:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/renameDescriptionImage/""" + "$" + """projectId<[^/]+>/""" + "$" + """imageNumber<[^/]+>/""" + "$" + """currentImageNumber<[^/]+>""", """controllers.ProjectController.renameDescriptionImage(projectId:Long, imageNumber:Integer, currentImageNumber:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/getMyEnrolledProjects""", """controllers.ProjectController.getMyEnrolledProjects(pageLimit:Integer, pageNum:Integer, sortCriteria:java.util.Optional[String], userId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/allproject""", """@controllers.ProjectController@.getAllProject()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/updatedes""", """@controllers.ProjectController@.updateProjectDes()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """project/getIdByName/""" + "$" + """name<[^/]+>""", """controllers.ProjectController.getIdByName(name:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """challenge/addChallenge""", """controllers.ChallengeController.addChallenge()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """challenge/updateChallenge/""" + "$" + """challengeId<[^/]+>""", """controllers.ChallengeController.updateChallenge(challengeId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """challenge/updateChallengeAdmin/""" + "$" + """challengeId<[^/]+>""", """controllers.ChallengeController.updateChallengeAdmin(challengeId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """challenge/challengeList/""" + "$" + """userId<[^/]+>""", """controllers.ChallengeController.challengeList(userId:Long, pageLimit:Integer, pageNum:Integer, sortCriteria:java.util.Optional[String])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """challenge/challengeListAdmin/""" + "$" + """userId<[^/]+>""", """controllers.ChallengeController.challengeListAdmin(userId:Long, pageLimit:Integer, pageNum:Integer, sortCriteria:java.util.Optional[String])"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """challenge/applyChallenge/""" + "$" + """challengeId<[^/]+>""", """controllers.ChallengeController.applyChallenge(challengeId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """challenge/challengeDetail/""" + "$" + """challengeId<[^/]+>""", """controllers.ChallengeController.getChallengeById(challengeId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """challenge/getChallengesByUser/""" + "$" + """userId<[^/]+>""", """controllers.ChallengeController.getChallengesByPublisher(userId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """challenge/challengeApplicationDetail/""" + "$" + """challengeApplicationId<[^/]+>""", """controllers.ChallengeController.getChallengeApplicationById(challengeApplicationId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """challenge/challengeApplicationDetailId/""" + "$" + """challengeApplicationId<[^/]+>""", """controllers.ChallengeController.getChallengeApplicationIdById(challengeApplicationId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """challenge/updateChallengeApplicationStatus/""" + "$" + """challengeApplicationId<[^/]+>""", """controllers.ChallengeController.giveChallengeOffertoStudent(challengeApplicationId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """challenge/updateStatus/""" + "$" + """challengeId<[^/]+>""", """controllers.ChallengeController.challengeUpdateStatus(challengeId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """challenge/getApplications/""" + "$" + """challengeType<[^/]+>/""" + "$" + """challengeId<[^/]+>""", """controllers.ChallengeController.getApplicationsByChallengeId(challengeType:String, challengeId:Long, pageLimit:Integer, pageNum:Integer, sortCriteria:java.util.Optional[String])"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """challenge/setImage/""" + "$" + """challengeId<[^/]+>""", """controllers.ChallengeController.setImage(challengeId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """challenge/getImage/""" + "$" + """challengeId<[^/]+>""", """controllers.ChallengeController.getImage(challengeId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """challenge/setPdf/""" + "$" + """challengeId<[^/]+>""", """controllers.ChallengeController.setPdf(challengeId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """challenge/search""", """controllers.ChallengeController.searchChallenges(pageLimit:Integer, pageNum:Integer, sortCriteria:java.util.Optional[String])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """challenge/closeChallenge/""" + "$" + """challengeId<[^/]+>""", """controllers.ChallengeController.closeChallenge(challengeId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """challenge/getChallengesByApplicant/""" + "$" + """userId<[^/]+>""", """controllers.ChallengeController.getChallengesByApplicant(userId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """job/addJob""", """controllers.JobController.addJob()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """job/updateJob/""" + "$" + """jobId<[^/]+>""", """controllers.JobController.updateJob(jobId:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """job/deleteJobImage/""" + "$" + """jobId<[^/]+>""", """controllers.JobController.deleteJobImage(jobId:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """job/deleteJobPDF/""" + "$" + """jobId<[^/]+>""", """controllers.JobController.deleteJobPDF(jobId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """job/jobList/""" + "$" + """userId<[^/]+>""", """controllers.JobController.jobList(userId:Long, pageLimit:Integer, pageNum:Integer, sortCriteria:java.util.Optional[String])"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """job/applyJob/""" + "$" + """jobId<[^/]+>""", """controllers.JobController.applyJob(jobId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """job/updateStatus/""" + "$" + """jobId<[^/]+>""", """controllers.JobController.jobUpdateStatue(jobId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """job/jobApplicationDetail/""" + "$" + """jobApplicationId<[^/]+>""", """controllers.JobController.getJobApplicationById(jobApplicationId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """job/jobDetail/""" + "$" + """jobId<[^/]+>""", """controllers.JobController.getJobById(jobId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """job/getJobPublisher/""" + "$" + """jobId<[^/]+>""", """controllers.JobController.getJobPublisher(jobId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """job/search/conditions""", """controllers.JobController.searchJobsByCondition()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """job/setImage/""" + "$" + """jobId<[^/]+>""", """controllers.JobController.setImage(jobId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """job/setPDF/""" + "$" + """jobId<[^/]+>""", """controllers.JobController.setPDF(jobId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """job/deleteJob/""" + "$" + """jobId<[^/]+>""", """controllers.JobController.deleteJob(jobId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """job/getJobsByUser/""" + "$" + """userId<[^/]+>""", """controllers.JobController.getJobsByPublisher(userId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """job/getJobsByApplicant/""" + "$" + """userId<[^/]+>""", """controllers.JobController.getJobsByApplicant(userId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """job/checkJobExist/""" + "$" + """jobId<[^/]+>""", """controllers.JobController.checkJobExist(jobId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """job/isJobNameExisted""", """controllers.JobController.checkJobNameAvailability()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """job/getIdByName/""" + "$" + """name<[^/]+>""", """controllers.ProjectController.getIdByName(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """job/getApplications/""" + "$" + """jobType<[^/]+>/""" + "$" + """jobId<[^/]+>""", """controllers.JobController.getApplicationsByJobId(jobType:String, jobId:Long, pageLimit:Integer, pageNum:Integer, sortCriteria:java.util.Optional[String])"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rajob/addRAJob""", """controllers.RAJobController.addRAJob()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rajob/updateRAJob/""" + "$" + """rajobId<[^/]+>""", """controllers.RAJobController.updateRAJob(rajobId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rajob/closeRAJob/""" + "$" + """rajobId<[^/]+>""", """controllers.RAJobController.closeRAJob(rajobId:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rajob/deleteRAJobImage/""" + "$" + """rajobId<[^/]+>""", """controllers.RAJobController.deleteRAJobImage(rajobId:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rajob/deleteRAJobPDF/""" + "$" + """rajobId<[^/]+>""", """controllers.RAJobController.deleteRAJobPDF(rajobId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rajob/rajobList/""" + "$" + """userId<[^/]+>""", """controllers.RAJobController.rajobList(userId:Long, pageLimit:Integer, pageNum:Integer, sortCriteria:java.util.Optional[String])"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rajob/applyRAJob/""" + "$" + """rajobId<[^/]+>""", """controllers.RAJobController.applyRAJob(rajobId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rajob/updateStatus/""" + "$" + """rajobId<[^/]+>""", """controllers.RAJobController.rajobUpdateStatue(rajobId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rajob/updateRAjobApplicationStatus/""" + "$" + """rajobApplicationId<[^/]+>""", """controllers.RAJobController.giveRAJobOffertoStudent(rajobApplicationId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rajob/rajobApplicationDetail/""" + "$" + """rajobApplicationId<[^/]+>""", """controllers.RAJobController.getRAJobApplicationById(rajobApplicationId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rajob/rajobDetail/""" + "$" + """rajobId<[^/]+>""", """controllers.RAJobController.getRAJobById(rajobId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rajob/getRAJobPublisher/""" + "$" + """rajobId<[^/]+>""", """controllers.RAJobController.getRAJobPublisher(rajobId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rajob/search/conditions""", """controllers.RAJobController.searchRAJobsByCondition()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rajob/setImage/""" + "$" + """rajobId<[^/]+>""", """controllers.RAJobController.setImage(rajobId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rajob/setPDF/""" + "$" + """rajobId<[^/]+>""", """controllers.RAJobController.setPDF(rajobId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rajob/deleteRAJob/""" + "$" + """rajobId<[^/]+>""", """controllers.RAJobController.deleteRAJob(rajobId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rajob/getRAJobsByUser/""" + "$" + """userId<[^/]+>""", """controllers.RAJobController.getRAJobsByPublisher(userId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rajob/getRAJobsByApplicant/""" + "$" + """userId<[^/]+>""", """controllers.RAJobController.getRAJobsByApplicant(userId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rajob/checkRAJobExist/""" + "$" + """rajobId<[^/]+>""", """controllers.RAJobController.checkRAJobExist(rajobId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rajob/isRAJobNameExisted""", """controllers.RAJobController.checkRAJobNameAvailability()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rajob/getIdByName/""" + "$" + """name<[^/]+>""", """controllers.RAJobController.getIdByName(name:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rajob/offer""", """controllers.RAJobController.sendOfferEmail()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rajob/sendPostedEmail""", """controllers.RAJobController.sendRAJobPostedEmail()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rajob/sendAppliedEmail""", """controllers.RAJobController.sendRAJobAppliedEmail()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rajob/professors""", """controllers.RAJobController.listProfessorsJson()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tajob/addTAJob""", """controllers.TAJobController.addTAJob()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tajob/updateTAJob/""" + "$" + """tajobId<[^/]+>""", """controllers.TAJobController.updateTAJob(tajobId:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tajob/deleteTAJobImage/""" + "$" + """tajobId<[^/]+>""", """controllers.TAJobController.deleteTAJobImage(tajobId:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tajob/deleteTAJobPDF/""" + "$" + """tajobId<[^/]+>""", """controllers.TAJobController.deleteTAJobPDF(tajobId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tajob/tajobList/""" + "$" + """userId<[^/]+>""", """controllers.TAJobController.tajobList(userId:Long, pageLimit:Integer, pageNum:Integer, sortCriteria:java.util.Optional[String])"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tajob/applyTAJob/""" + "$" + """tajobId<[^/]+>""", """controllers.TAJobController.applyTAJob(tajobId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tajob/updateStatus/""" + "$" + """tajobId<[^/]+>""", """controllers.TAJobController.tajobUpdateStatue(tajobId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tajob/tajobApplicationDetail/""" + "$" + """tajobApplicationId<[^/]+>""", """controllers.TAJobController.getTAJobApplicationById(tajobApplicationId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tajob/tajobDetail/""" + "$" + """tajobId<[^/]+>""", """controllers.TAJobController.getTAJobById(tajobId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tajob/getTAJobPublisher/""" + "$" + """tajobId<[^/]+>""", """controllers.TAJobController.getTAJobPublisher(tajobId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tajob/search/conditions""", """controllers.TAJobController.searchTAJobsByCondition()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tajob/setImage/""" + "$" + """tajobId<[^/]+>""", """controllers.TAJobController.setImage(tajobId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tajob/setPDF/""" + "$" + """tajobId<[^/]+>""", """controllers.TAJobController.setPDF(tajobId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tajob/deleteTAJob/""" + "$" + """tajobId<[^/]+>""", """controllers.TAJobController.deleteTAJob(tajobId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tajob/getTAJobsByUser/""" + "$" + """userId<[^/]+>""", """controllers.TAJobController.getTAJobsByPublisher(userId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tajob/checkTAJobExist/""" + "$" + """tajobId<[^/]+>""", """controllers.TAJobController.checkTAJobExist(tajobId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tajob/isTAJobNameExisted""", """controllers.TAJobController.checkTAJobNameAvailability()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tajob/getIdByName/""" + "$" + """name<[^/]+>""", """controllers.TAJobController.getIdByName(name:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tacandidate/addTACandidate""", """controllers.TACandidateController.addTACandidate()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tacandidate/tacandidateList/""" + "$" + """userId<[^/]+>""", """controllers.TACandidateController.tacandidateList(userId:Long, pageLimit:Integer, pageNum:Integer, sortCriteria:java.util.Optional[String])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tacandidate/candidateDetail/""" + "$" + """Id<[^/]+>""", """controllers.TACandidateController.getTACandidateById(Id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tacandidate/assignments/""" + "$" + """userId<[^/]+>""", """controllers.TACandidateController.getAssignmentsByUserId(userId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """courses""", """controllers.CourseController.listCourses"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """courses/details/""" + "$" + """courseId<[^/]+>""", """controllers.CourseController.getCourseDetails(courseId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """courses/approve/""" + "$" + """courseId<[^/]+>/""" + "$" + """week<[^/]+>""", """controllers.CourseController.approveTA(courseId:Long, week:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tahiring/addAssignment""", """controllers.CourseTAAssignmentController.addAssignment()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tahiring/status/""" + "$" + """Id<[^/]+>""", """controllers.CourseTAAssignmentController.getCourseTAAssignmentById(Id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tahiring/assignmentList/""" + "$" + """Id<[^/]+>""", """controllers.CourseTAAssignmentController.courseTAAssignmentList(Id:Long, pageLimit:Integer, pageNum:Integer, sortCriteria:java.util.Optional[String])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tahiring/assignmentDetail/""" + "$" + """Id<[^/]+>""", """controllers.CourseTAAssignmentController.getCourseTAAssignmentById(Id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/addUser""", """controllers.UserController.addUser"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/userDetail/""" + "$" + """userId<[^/]+>""", """controllers.UserController.userDetail(userId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/getResearcherInfo/""" + "$" + """userId<[^/]+>""", """controllers.UserController.getResearcherInfo(userId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/getStudentInfo/""" + "$" + """userId<[^/]+>""", """controllers.UserController.getStudentInfo(userId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/updateUser""", """controllers.UserController.updateUser"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/userLogin""", """controllers.UserController.userLogin"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/checkEmail""", """controllers.UserController.checkNewUserEmailAvailability"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/userList""", """controllers.UserController.userList(pageLimit:java.util.Optional[Integer], offset:java.util.Optional[Integer], sortCriteria:java.util.Optional[String])"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/validateEmail""", """controllers.UserController.validateEmail"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/search/conditions""", """controllers.UserController.searchUserByCondition(pageLimit:java.util.Optional[Integer], offset:java.util.Optional[Integer], sortCriteria:java.util.Optional[String])"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/userDelete""", """controllers.UserController.inactivateUserPOST"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/autoRegisterUser""", """controllers.UserController.autoRegisterUser"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/getAllUsers""", """controllers.UserController.getAllUsersInAllRoles"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/getAllNormalUsers""", """controllers.UserController.getAllNormalUsers"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/updateImageForUser/""" + "$" + """userId<[^/]+>""", """controllers.UserController.updateImageByUserId(userId:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/deleteImageForUser/""" + "$" + """userId<[^/]+>""", """controllers.UserController.deleteImageByUserId(userId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/search/""" + "$" + """display_name<[^/]+>""", """controllers.UserController.userSearch(display_name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/getActiveUsers/json""", """@controllers.UserController@.getActiveUsers(format:String = "json")"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/sendPasswordEmail""", """@controllers.UserController@.sendPasswordEmail"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/updatePassword""", """@controllers.UserController@.updatePassword"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/""" + "$" + """hashcode<[^/]+>""", """@controllers.UserController@.userActivation(hashcode:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/validate""", """controllers.UserController.sendRegisterEmail()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/validate/resend""", """controllers.UserController.resendRegisterEmail()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/updateLevel/""" + "$" + """uid<[^/]+>""", """@controllers.UserController@.updateLevel(uid:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/getUserByEmail""", """@controllers.UserController@.getUserByEmail"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """organization/organizationList""", """controllers.OrganizationController.organizationList()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """organization/organizationListPage""", """controllers.OrganizationController.organizationListPage(pageLimit:java.util.Optional[Integer], offset:java.util.Optional[Integer], sortCriteria:java.util.Optional[String])"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """organization/addUsers""", """controllers.OrganizationController.addUsers()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """organization/register""", """controllers.OrganizationController.registerOrganization()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """organization/organizationDetail/""" + "$" + """id<[^/]+>""", """controllers.OrganizationController.organizationDetail(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """organization/organizationUpdate""", """controllers.OrganizationController.organizationUpdate()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """organization/organizationListByName""", """controllers.OrganizationController.organizationListbyName(pageLimit:java.util.Optional[Integer], offset:java.util.Optional[Integer], sortCriteria:java.util.Optional[String])"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bugReport/addBugReport""", """@controllers.BugReportController@.addBugReport"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bugReport/getBugReport/id/""" + "$" + """id<[^/]+>""", """@controllers.BugReportController@.getBugReport(id:Long, format:String = "json")"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bugReport/updateBugReport/id/""" + "$" + """id<[^/]+>""", """@controllers.BugReportController@.updateBugReport(id:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bugReport/deleteBugReport/id/""" + "$" + """id<[^/]+>""", """@controllers.BugReportController@.deleteBugReport(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bugReport/updateBugReportSolved/""" + "$" + """bugId<[^/]+>/""" + "$" + """fixerId<[^/]+>""", """@controllers.BugReportController@.updateBugReportSolved(bugId:Long, fixerId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bugReport/getAllBugReports/json""", """@controllers.BugReportController@.getAllBugReports(pageLimit:java.util.Optional[Integer], offset:java.util.Optional[Integer], sortCriteria:java.util.Optional[String])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bugReport/getAllUnsolvedBugReports/json""", """@controllers.BugReportController@.getAllUnsolvedBugReports"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bugReport/getAllSolvedBugReports/json""", """@controllers.BugReportController@.getAllSolvedBugReports"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """suggestion/addSuggestion""", """@controllers.SuggestionController@.addSuggestion"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """suggestion/getSuggestion/id/""" + "$" + """id<[^/]+>""", """@controllers.SuggestionController@.getSuggestion(id:Long, format:String = "json")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """suggestion/suggestionList/json""", """@controllers.SuggestionController@.suggestionList(pageLimit:java.util.Optional[Integer], offset:java.util.Optional[Integer], sortCriteria:java.util.Optional[String])"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """suggestion/updateSuggestion/id/""" + "$" + """id<[^/]+>""", """@controllers.SuggestionController@.updateSuggestion(id:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """suggestion/deleteSuggestion/id/""" + "$" + """id<[^/]+>""", """@controllers.SuggestionController@.deleteSuggestion(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """suggestion/updateSuggestionSolve/""" + "$" + """suggestionId<[^/]+>/""" + "$" + """implementorId<[^/]+>""", """@controllers.SuggestionController@.updateSuggestionSolved(suggestionId:Long, implementorId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """technology/addTechnology""", """controllers.TechnologyController.addTechnology()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """technology/updateTechnology/""" + "$" + """technologyId<[^/]+>""", """controllers.TechnologyController.updateTechnology(technologyId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """technology/technologyList/""" + "$" + """userId<[^/]+>""", """controllers.TechnologyController.technologyList(userId:Long, pageLimit:Integer, pageNum:Integer, sortCriteria:java.util.Optional[String])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """technology/technologyDetail/""" + "$" + """technologyId<[^/]+>""", """controllers.TechnologyController.getTechnologyById(technologyId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """technology/search/conditions""", """controllers.TechnologyController.searchTechnologiesByCondition()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/users""", """controllers.AdminController.getUserList(pageNum:Integer ?= 1, pageLimit:Integer ?= 20, sortCriteria:String ?= "id")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/users/""" + "$" + """userId<[^/]+>""", """controllers.AdminController.getUserDetail(userId:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/users/""" + "$" + """userId<[^/]+>/status""", """controllers.AdminController.updateUserStatus(userId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/jobs""", """controllers.AdminController.getJobList(pageNum:Integer ?= 1, pageLimit:Integer ?= 20, sortCriteria:String ?= "id")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/jobs/""" + "$" + """jobType<[^/]+>/""" + "$" + """jobId<[^/]+>""", """controllers.AdminController.getJobDetail(jobType:String, jobId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/organizations""", """controllers.AdminController.getOrganizationList(pageNum:Integer ?= 1, pageLimit:Integer ?= 20, sortCriteria:String ?= "id")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/technologies""", """controllers.AdminController.getTechnologyList(pageNum:Integer ?= 1, pageLimit:Integer ?= 20, sortCriteria:String ?= "id")"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """author/addAuthor""", """controllers.AuthorController.addAuthor"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """author/authorDetail/""" + "$" + """userId<[^/]+>""", """controllers.AuthorController.authorDetail(userId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """author/updateAuthor""", """controllers.AuthorController.updateAuthor"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """author/authorList""", """controllers.AuthorController.authorList(pageLimit:java.util.Optional[Integer], offset:java.util.Optional[Integer], sortCriteria:java.util.Optional[String])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """author/userDetailAdmin/""" + "$" + """userId<[^/]+>""", """controllers.AuthorController.userDetailAdmin(userId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """author/updateUserAdmin""", """controllers.AuthorController.updateUserAdmin"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """author/userListAdmin""", """controllers.AuthorController.userListAdmin(pageLimit:java.util.Optional[Integer], offset:java.util.Optional[Integer], sortCriteria:java.util.Optional[String])"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """author/search""", """controllers.AuthorController.searchAuthorByCondition(pageLimit:java.util.Optional[Integer], offset:java.util.Optional[Integer], sortCriteria:java.util.Optional[String])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """author/topAuthors""", """controllers.AuthorController.topAuthors()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reviewer/addReviewer""", """controllers.ReviewerController.addReviewer"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reviewer/reviewerDetail/""" + "$" + """userId<[^/]+>""", """controllers.ReviewerController.reviewerDetail(userId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reviewer/updateReviewer""", """controllers.ReviewerController.updateReviewer"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reviewer/reviewerList""", """controllers.ReviewerController.reviewerList(pageLimit:java.util.Optional[Integer], offset:java.util.Optional[Integer], sortCriteria:java.util.Optional[String])"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reviewer/search/conditions""", """controllers.ReviewerController.searchReviewerByCondition(pageLimit:java.util.Optional[Integer], offset:java.util.Optional[Integer], sortCriteria:java.util.Optional[String])"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paper/addPaper""", """controllers.PaperController.addPaper()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paper/paperList""", """controllers.PaperController.paperList(pageLimit:java.util.Optional[Integer], offset:java.util.Optional[Integer], sortCriteria:java.util.Optional[String])"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paper/author""", """controllers.PaperController.getAuthorByPaperId(paperId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paper/deletePaper""", """controllers.PaperController.deletePaper(paperId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paper/paperDetail/""" + "$" + """paperId<[^/]+>""", """controllers.PaperController.getPaperById(paperId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paper/addAuthor/""" + "$" + """paperId<[^/]+>""", """controllers.PaperController.addAuthor(paperId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paper/deleteAuthor""", """controllers.PaperController.deleteAuthor(memberId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """graph/primePOC""", """controllers.GraphController.printPrimeConnections()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paper/paperAuthorList""", """controllers.PaperController.paperAuthorList()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paper/loadPaper""", """controllers.PaperController.storeDBLP()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paper/lda""", """controllers.PaperController.loadLDA()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paper/authorRelation""", """controllers.PaperController.authorRelation()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paper/loadSchema""", """controllers.PaperController.storeDBLPSchema()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paper/ldaTopicList""", """controllers.PaperController.ldaTopicDistribution()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paper/search""", """controllers.PaperController.paperSearchList()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """log/loggingOperation""", """controllers.LogController.operationLogging()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """file/""" + "$" + """tableName<[^/]+>/""" + "$" + """fileType<[^/]+>/""" + "$" + """tableRecorderId<[^/]+>""", """controllers.FileController.getFile(tableName:String, fileType:String, tableRecorderId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """file/checkFile/""" + "$" + """tableName<[^/]+>/""" + "$" + """fileType<[^/]+>/""" + "$" + """tableRecorderId<[^/]+>""", """controllers.FileController.checkFile(tableName:String, fileType:String, tableRecorderId:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """technology/setFiles/""" + "$" + """serviceId<[^/]+>""", """controllers.TechnologyController.setFiles(serviceId:Long, fileName:String, fileType:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """technology/fileDetail/""" + "$" + """serviceId<[^/]+>""", """controllers.TechnologyController.getFileById(serviceId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """file/upload/""" + "$" + """tableName<[^/]+>/""" + "$" + """fileType<[^/]+>/""" + "$" + """recordId<[^/]+>""", """controllers.FileController.uploadRawFile(tableName:String, fileType:String, recordId:Long)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:40
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_5.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """##
  summary: Example - index
  description: Play welcome index page
  responses:
    200:
      description: index page
##""",
      Seq()
    )
  )

  // @LINE:50
  private[this] lazy val controllers_CountController_count1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count1_invoker = createInvoker(
    CountController_4.count,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      this.prefix + """count""",
      """##
  summary: Example - count
  description: Get a count number
  responses:
    200:
      description: count number
      schema:
        type: integer
##""",
      Seq()
    )
  )

  // @LINE:60
  private[this] lazy val controllers_AsyncController_message2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message2_invoker = createInvoker(
    AsyncController_8.message,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      this.prefix + """message""",
      """##
  summary: Example - message
  description: Get welcome message
  responses:
    200:
      description: welcome message
      schema:
        type: string
##""",
      Seq()
    )
  )

  // @LINE:63
  private[this] lazy val controllers_Assets_versioned3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned3_invoker = createInvoker(
    Assets_23.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """## NoDocs ###""",
      Seq()
    )
  )

  // @LINE:72
  private[this] lazy val controllers_ProjectController_addProject4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/addProject")))
  )
  private[this] lazy val controllers_ProjectController_addProject4_invoker = createInvoker(
    ProjectController_16.addProject(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "addProject",
      Nil,
      "POST",
      this.prefix + """project/addProject""",
      """################################### Projects #####################################################################""",
      Seq()
    )
  )

  // @LINE:73
  private[this] lazy val controllers_ProjectController_updateProject5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/updateProject/"), DynamicPart("projectId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjectController_updateProject5_invoker = createInvoker(
    ProjectController_16.updateProject(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "updateProject",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """project/updateProject/""" + "$" + """projectId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:74
  private[this] lazy val controllers_ProjectController_deleteProjectImage6_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/deleteProjectImage/"), DynamicPart("projectId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjectController_deleteProjectImage6_invoker = createInvoker(
    ProjectController_16.deleteProjectImage(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "deleteProjectImage",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """project/deleteProjectImage/""" + "$" + """projectId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:75
  private[this] lazy val controllers_ProjectController_deleteProjectPDF7_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/deleteProjectPDF/"), DynamicPart("projectId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjectController_deleteProjectPDF7_invoker = createInvoker(
    ProjectController_16.deleteProjectPDF(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "deleteProjectPDF",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """project/deleteProjectPDF/""" + "$" + """projectId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:76
  private[this] lazy val controllers_ProjectController_projectList8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/projectList/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjectController_projectList8_invoker = createInvoker(
    ProjectController_16.projectList(fakeValue[Long], fakeValue[Integer], fakeValue[Integer], fakeValue[java.util.Optional[String]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "projectList",
      Seq(classOf[Long], classOf[Integer], classOf[Integer], classOf[java.util.Optional[String]]),
      "GET",
      this.prefix + """project/projectList/""" + "$" + """userId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:77
  private[this] lazy val controllers_ProjectController_getTeamMembersByProjectId9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/teammember/"), DynamicPart("projectId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjectController_getTeamMembersByProjectId9_invoker = createInvoker(
    ProjectController_16.getTeamMembersByProjectId(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "getTeamMembersByProjectId",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """project/teammember/""" + "$" + """projectId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:79
  private[this] lazy val controllers_ProjectController_getProjectById10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/projectDetail/"), DynamicPart("projectId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjectController_getProjectById10_invoker = createInvoker(
    ProjectController_16.getProjectById(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "getProjectById",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """project/projectDetail/""" + "$" + """projectId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:80
  private[this] lazy val controllers_ProjectController_getProjectCreator11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/getProjectCreator/"), DynamicPart("projectId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjectController_getProjectCreator11_invoker = createInvoker(
    ProjectController_16.getProjectCreator(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "getProjectCreator",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """project/getProjectCreator/""" + "$" + """projectId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:81
  private[this] lazy val controllers_ProjectController_searchProjectsByCondition12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/search/conditions")))
  )
  private[this] lazy val controllers_ProjectController_searchProjectsByCondition12_invoker = createInvoker(
    ProjectController_16.searchProjectsByCondition(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "searchProjectsByCondition",
      Nil,
      "POST",
      this.prefix + """project/search/conditions""",
      """""",
      Seq()
    )
  )

  // @LINE:82
  private[this] lazy val controllers_ProjectController_setImage13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/setImage/"), DynamicPart("projectId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjectController_setImage13_invoker = createInvoker(
    ProjectController_16.setImage(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "setImage",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """project/setImage/""" + "$" + """projectId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:83
  private[this] lazy val controllers_ProjectController_setPDF14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/setPDF/"), DynamicPart("projectId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjectController_setPDF14_invoker = createInvoker(
    ProjectController_16.setPDF(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "setPDF",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """project/setPDF/""" + "$" + """projectId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:84
  private[this] lazy val controllers_ProjectController_addTeamMember15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/addTeamMember/"), DynamicPart("projectId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjectController_addTeamMember15_invoker = createInvoker(
    ProjectController_16.addTeamMember(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "addTeamMember",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """project/addTeamMember/""" + "$" + """projectId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:85
  private[this] lazy val controllers_ProjectController_setTeamMemberPhoto16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/setTeamMemberPhoto/"), DynamicPart("memberId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjectController_setTeamMemberPhoto16_invoker = createInvoker(
    ProjectController_16.setTeamMemberPhoto(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "setTeamMemberPhoto",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """project/setTeamMemberPhoto/""" + "$" + """memberId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:86
  private[this] lazy val controllers_ProjectController_deleteTeamMember17_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/deleteTeamMember/"), DynamicPart("memberId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjectController_deleteTeamMember17_invoker = createInvoker(
    ProjectController_16.deleteTeamMember(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "deleteTeamMember",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """project/deleteTeamMember/""" + "$" + """memberId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:87
  private[this] lazy val controllers_ProjectController_deleteProject18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/deleteProject/"), DynamicPart("projectId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjectController_deleteProject18_invoker = createInvoker(
    ProjectController_16.deleteProject(fakeValue[Long]),
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

  // @LINE:88
  private[this] lazy val controllers_ProjectController_getProjectsByCreator19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/getProjectsByUser/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjectController_getProjectsByCreator19_invoker = createInvoker(
    ProjectController_16.getProjectsByCreator(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "getProjectsByCreator",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """project/getProjectsByUser/""" + "$" + """userId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:89
  private[this] lazy val controllers_ProjectController_checkProjectExist20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/checkProjectExist/"), DynamicPart("projectId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjectController_checkProjectExist20_invoker = createInvoker(
    ProjectController_16.checkProjectExist(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "checkProjectExist",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """project/checkProjectExist/""" + "$" + """projectId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:90
  private[this] lazy val controllers_ProjectController_checkProjectNameAvailability21_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/isProjectNameExisted")))
  )
  private[this] lazy val controllers_ProjectController_checkProjectNameAvailability21_invoker = createInvoker(
    ProjectController_16.checkProjectNameAvailability(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "checkProjectNameAvailability",
      Nil,
      "POST",
      this.prefix + """project/isProjectNameExisted""",
      """""",
      Seq()
    )
  )

  // @LINE:91
  private[this] lazy val controllers_ProjectController_saveDescriptionImage22_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/saveDescriptionImage/"), DynamicPart("projectId", """[^/]+""",true), StaticPart("/"), DynamicPart("imageNumber", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjectController_saveDescriptionImage22_invoker = createInvoker(
    ProjectController_16.saveDescriptionImage(fakeValue[Long], fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "saveDescriptionImage",
      Seq(classOf[Long], classOf[Integer]),
      "POST",
      this.prefix + """project/saveDescriptionImage/""" + "$" + """projectId<[^/]+>/""" + "$" + """imageNumber<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:92
  private[this] lazy val controllers_ProjectController_renameDescriptionImage23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/renameDescriptionImage/"), DynamicPart("projectId", """[^/]+""",true), StaticPart("/"), DynamicPart("imageNumber", """[^/]+""",true), StaticPart("/"), DynamicPart("currentImageNumber", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjectController_renameDescriptionImage23_invoker = createInvoker(
    ProjectController_16.renameDescriptionImage(fakeValue[Long], fakeValue[Integer], fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "renameDescriptionImage",
      Seq(classOf[Long], classOf[Integer], classOf[Integer]),
      "GET",
      this.prefix + """project/renameDescriptionImage/""" + "$" + """projectId<[^/]+>/""" + "$" + """imageNumber<[^/]+>/""" + "$" + """currentImageNumber<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:94
  private[this] lazy val controllers_ProjectController_getMyEnrolledProjects24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/getMyEnrolledProjects")))
  )
  private[this] lazy val controllers_ProjectController_getMyEnrolledProjects24_invoker = createInvoker(
    ProjectController_16.getMyEnrolledProjects(fakeValue[Integer], fakeValue[Integer], fakeValue[java.util.Optional[String]], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "getMyEnrolledProjects",
      Seq(classOf[Integer], classOf[Integer], classOf[java.util.Optional[String]], classOf[Long]),
      "GET",
      this.prefix + """project/getMyEnrolledProjects""",
      """""",
      Seq()
    )
  )

  // @LINE:96
  private[this] lazy val controllers_ProjectController_getAllProject25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/allproject")))
  )
  private[this] lazy val controllers_ProjectController_getAllProject25_invoker = createInvoker(
    ProjectController_21.get.getAllProject(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "getAllProject",
      Nil,
      "GET",
      this.prefix + """project/allproject""",
      """# Return all projects""",
      Seq()
    )
  )

  // @LINE:97
  private[this] lazy val controllers_ProjectController_updateProjectDes26_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/updatedes")))
  )
  private[this] lazy val controllers_ProjectController_updateProjectDes26_invoker = createInvoker(
    ProjectController_21.get.updateProjectDes(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "updateProjectDes",
      Nil,
      "POST",
      this.prefix + """project/updatedes""",
      """""",
      Seq()
    )
  )

  // @LINE:99
  private[this] lazy val controllers_ProjectController_getIdByName27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("project/getIdByName/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjectController_getIdByName27_invoker = createInvoker(
    ProjectController_16.getIdByName(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "getIdByName",
      Seq(classOf[String]),
      "GET",
      this.prefix + """project/getIdByName/""" + "$" + """name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:104
  private[this] lazy val controllers_ChallengeController_addChallenge28_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("challenge/addChallenge")))
  )
  private[this] lazy val controllers_ChallengeController_addChallenge28_invoker = createInvoker(
    ChallengeController_19.addChallenge(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChallengeController",
      "addChallenge",
      Nil,
      "POST",
      this.prefix + """challenge/addChallenge""",
      """######################################### Challenge ###################################################################""",
      Seq()
    )
  )

  // @LINE:105
  private[this] lazy val controllers_ChallengeController_updateChallenge29_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("challenge/updateChallenge/"), DynamicPart("challengeId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ChallengeController_updateChallenge29_invoker = createInvoker(
    ChallengeController_19.updateChallenge(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChallengeController",
      "updateChallenge",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """challenge/updateChallenge/""" + "$" + """challengeId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:106
  private[this] lazy val controllers_ChallengeController_updateChallengeAdmin30_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("challenge/updateChallengeAdmin/"), DynamicPart("challengeId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ChallengeController_updateChallengeAdmin30_invoker = createInvoker(
    ChallengeController_19.updateChallengeAdmin(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChallengeController",
      "updateChallengeAdmin",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """challenge/updateChallengeAdmin/""" + "$" + """challengeId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:109
  private[this] lazy val controllers_ChallengeController_challengeList31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("challenge/challengeList/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ChallengeController_challengeList31_invoker = createInvoker(
    ChallengeController_19.challengeList(fakeValue[Long], fakeValue[Integer], fakeValue[Integer], fakeValue[java.util.Optional[String]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChallengeController",
      "challengeList",
      Seq(classOf[Long], classOf[Integer], classOf[Integer], classOf[java.util.Optional[String]]),
      "GET",
      this.prefix + """challenge/challengeList/""" + "$" + """userId<[^/]+>""",
      """DELETE        /challenge/deleteChallengeImage/:challengeId                                                              controllers.ChallengeController.deleteChallengeImage(ChallengeId: Long)
DELETE        /challenge/deleteChallengePDF/:challengeId                                                                controllers.ChallengeController.deleteChallengePDF(ChallengeId: Long)""",
      Seq()
    )
  )

  // @LINE:110
  private[this] lazy val controllers_ChallengeController_challengeListAdmin32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("challenge/challengeListAdmin/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ChallengeController_challengeListAdmin32_invoker = createInvoker(
    ChallengeController_19.challengeListAdmin(fakeValue[Long], fakeValue[Integer], fakeValue[Integer], fakeValue[java.util.Optional[String]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChallengeController",
      "challengeListAdmin",
      Seq(classOf[Long], classOf[Integer], classOf[Integer], classOf[java.util.Optional[String]]),
      "GET",
      this.prefix + """challenge/challengeListAdmin/""" + "$" + """userId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:112
  private[this] lazy val controllers_ChallengeController_applyChallenge33_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("challenge/applyChallenge/"), DynamicPart("challengeId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ChallengeController_applyChallenge33_invoker = createInvoker(
    ChallengeController_19.applyChallenge(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChallengeController",
      "applyChallenge",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """challenge/applyChallenge/""" + "$" + """challengeId<[^/]+>""",
      """GET           /project/teammember/:projectId                                                                      controllers.ProjectController.getTeamMembersByProjectId(projectId: Long)""",
      Seq()
    )
  )

  // @LINE:113
  private[this] lazy val controllers_ChallengeController_getChallengeById34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("challenge/challengeDetail/"), DynamicPart("challengeId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ChallengeController_getChallengeById34_invoker = createInvoker(
    ChallengeController_19.getChallengeById(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChallengeController",
      "getChallengeById",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """challenge/challengeDetail/""" + "$" + """challengeId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:114
  private[this] lazy val controllers_ChallengeController_getChallengesByPublisher35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("challenge/getChallengesByUser/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ChallengeController_getChallengesByPublisher35_invoker = createInvoker(
    ChallengeController_19.getChallengesByPublisher(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChallengeController",
      "getChallengesByPublisher",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """challenge/getChallengesByUser/""" + "$" + """userId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:115
  private[this] lazy val controllers_ChallengeController_getChallengeApplicationById36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("challenge/challengeApplicationDetail/"), DynamicPart("challengeApplicationId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ChallengeController_getChallengeApplicationById36_invoker = createInvoker(
    ChallengeController_19.getChallengeApplicationById(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChallengeController",
      "getChallengeApplicationById",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """challenge/challengeApplicationDetail/""" + "$" + """challengeApplicationId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:116
  private[this] lazy val controllers_ChallengeController_getChallengeApplicationIdById37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("challenge/challengeApplicationDetailId/"), DynamicPart("challengeApplicationId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ChallengeController_getChallengeApplicationIdById37_invoker = createInvoker(
    ChallengeController_19.getChallengeApplicationIdById(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChallengeController",
      "getChallengeApplicationIdById",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """challenge/challengeApplicationDetailId/""" + "$" + """challengeApplicationId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:117
  private[this] lazy val controllers_ChallengeController_giveChallengeOffertoStudent38_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("challenge/updateChallengeApplicationStatus/"), DynamicPart("challengeApplicationId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ChallengeController_giveChallengeOffertoStudent38_invoker = createInvoker(
    ChallengeController_19.giveChallengeOffertoStudent(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChallengeController",
      "giveChallengeOffertoStudent",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """challenge/updateChallengeApplicationStatus/""" + "$" + """challengeApplicationId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:119
  private[this] lazy val controllers_ChallengeController_challengeUpdateStatus39_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("challenge/updateStatus/"), DynamicPart("challengeId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ChallengeController_challengeUpdateStatus39_invoker = createInvoker(
    ChallengeController_19.challengeUpdateStatus(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChallengeController",
      "challengeUpdateStatus",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """challenge/updateStatus/""" + "$" + """challengeId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:120
  private[this] lazy val controllers_ChallengeController_getApplicationsByChallengeId40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("challenge/getApplications/"), DynamicPart("challengeType", """[^/]+""",true), StaticPart("/"), DynamicPart("challengeId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ChallengeController_getApplicationsByChallengeId40_invoker = createInvoker(
    ChallengeController_19.getApplicationsByChallengeId(fakeValue[String], fakeValue[Long], fakeValue[Integer], fakeValue[Integer], fakeValue[java.util.Optional[String]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChallengeController",
      "getApplicationsByChallengeId",
      Seq(classOf[String], classOf[Long], classOf[Integer], classOf[Integer], classOf[java.util.Optional[String]]),
      "GET",
      this.prefix + """challenge/getApplications/""" + "$" + """challengeType<[^/]+>/""" + "$" + """challengeId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:121
  private[this] lazy val controllers_ChallengeController_setImage41_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("challenge/setImage/"), DynamicPart("challengeId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ChallengeController_setImage41_invoker = createInvoker(
    ChallengeController_19.setImage(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChallengeController",
      "setImage",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """challenge/setImage/""" + "$" + """challengeId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:122
  private[this] lazy val controllers_ChallengeController_getImage42_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("challenge/getImage/"), DynamicPart("challengeId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ChallengeController_getImage42_invoker = createInvoker(
    ChallengeController_19.getImage(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChallengeController",
      "getImage",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """challenge/getImage/""" + "$" + """challengeId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:123
  private[this] lazy val controllers_ChallengeController_setPdf43_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("challenge/setPdf/"), DynamicPart("challengeId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ChallengeController_setPdf43_invoker = createInvoker(
    ChallengeController_19.setPdf(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChallengeController",
      "setPdf",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """challenge/setPdf/""" + "$" + """challengeId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:124
  private[this] lazy val controllers_ChallengeController_searchChallenges44_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("challenge/search")))
  )
  private[this] lazy val controllers_ChallengeController_searchChallenges44_invoker = createInvoker(
    ChallengeController_19.searchChallenges(fakeValue[Integer], fakeValue[Integer], fakeValue[java.util.Optional[String]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChallengeController",
      "searchChallenges",
      Seq(classOf[Integer], classOf[Integer], classOf[java.util.Optional[String]]),
      "POST",
      this.prefix + """challenge/search""",
      """""",
      Seq()
    )
  )

  // @LINE:125
  private[this] lazy val controllers_ChallengeController_closeChallenge45_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("challenge/closeChallenge/"), DynamicPart("challengeId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ChallengeController_closeChallenge45_invoker = createInvoker(
    ChallengeController_19.closeChallenge(fakeValue[Long]),
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

  // @LINE:126
  private[this] lazy val controllers_ChallengeController_getChallengesByApplicant46_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("challenge/getChallengesByApplicant/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ChallengeController_getChallengesByApplicant46_invoker = createInvoker(
    ChallengeController_19.getChallengesByApplicant(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChallengeController",
      "getChallengesByApplicant",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """challenge/getChallengesByApplicant/""" + "$" + """userId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:154
  private[this] lazy val controllers_JobController_addJob47_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("job/addJob")))
  )
  private[this] lazy val controllers_JobController_addJob47_invoker = createInvoker(
    JobController_13.addJob(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JobController",
      "addJob",
      Nil,
      "POST",
      this.prefix + """job/addJob""",
      """######################################### Job #########################################################################""",
      Seq()
    )
  )

  // @LINE:155
  private[this] lazy val controllers_JobController_updateJob48_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("job/updateJob/"), DynamicPart("jobId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_JobController_updateJob48_invoker = createInvoker(
    JobController_13.updateJob(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JobController",
      "updateJob",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """job/updateJob/""" + "$" + """jobId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:156
  private[this] lazy val controllers_JobController_deleteJobImage49_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("job/deleteJobImage/"), DynamicPart("jobId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_JobController_deleteJobImage49_invoker = createInvoker(
    JobController_13.deleteJobImage(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JobController",
      "deleteJobImage",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """job/deleteJobImage/""" + "$" + """jobId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:157
  private[this] lazy val controllers_JobController_deleteJobPDF50_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("job/deleteJobPDF/"), DynamicPart("jobId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_JobController_deleteJobPDF50_invoker = createInvoker(
    JobController_13.deleteJobPDF(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JobController",
      "deleteJobPDF",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """job/deleteJobPDF/""" + "$" + """jobId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:158
  private[this] lazy val controllers_JobController_jobList51_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("job/jobList/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_JobController_jobList51_invoker = createInvoker(
    JobController_13.jobList(fakeValue[Long], fakeValue[Integer], fakeValue[Integer], fakeValue[java.util.Optional[String]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JobController",
      "jobList",
      Seq(classOf[Long], classOf[Integer], classOf[Integer], classOf[java.util.Optional[String]]),
      "GET",
      this.prefix + """job/jobList/""" + "$" + """userId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:159
  private[this] lazy val controllers_JobController_applyJob52_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("job/applyJob/"), DynamicPart("jobId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_JobController_applyJob52_invoker = createInvoker(
    JobController_13.applyJob(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JobController",
      "applyJob",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """job/applyJob/""" + "$" + """jobId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:160
  private[this] lazy val controllers_JobController_jobUpdateStatue53_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("job/updateStatus/"), DynamicPart("jobId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_JobController_jobUpdateStatue53_invoker = createInvoker(
    JobController_13.jobUpdateStatue(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JobController",
      "jobUpdateStatue",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """job/updateStatus/""" + "$" + """jobId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:161
  private[this] lazy val controllers_JobController_getJobApplicationById54_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("job/jobApplicationDetail/"), DynamicPart("jobApplicationId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_JobController_getJobApplicationById54_invoker = createInvoker(
    JobController_13.getJobApplicationById(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JobController",
      "getJobApplicationById",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """job/jobApplicationDetail/""" + "$" + """jobApplicationId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:163
  private[this] lazy val controllers_JobController_getJobById55_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("job/jobDetail/"), DynamicPart("jobId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_JobController_getJobById55_invoker = createInvoker(
    JobController_13.getJobById(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JobController",
      "getJobById",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """job/jobDetail/""" + "$" + """jobId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:164
  private[this] lazy val controllers_JobController_getJobPublisher56_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("job/getJobPublisher/"), DynamicPart("jobId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_JobController_getJobPublisher56_invoker = createInvoker(
    JobController_13.getJobPublisher(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JobController",
      "getJobPublisher",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """job/getJobPublisher/""" + "$" + """jobId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:165
  private[this] lazy val controllers_JobController_searchJobsByCondition57_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("job/search/conditions")))
  )
  private[this] lazy val controllers_JobController_searchJobsByCondition57_invoker = createInvoker(
    JobController_13.searchJobsByCondition(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JobController",
      "searchJobsByCondition",
      Nil,
      "POST",
      this.prefix + """job/search/conditions""",
      """""",
      Seq()
    )
  )

  // @LINE:166
  private[this] lazy val controllers_JobController_setImage58_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("job/setImage/"), DynamicPart("jobId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_JobController_setImage58_invoker = createInvoker(
    JobController_13.setImage(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JobController",
      "setImage",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """job/setImage/""" + "$" + """jobId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:167
  private[this] lazy val controllers_JobController_setPDF59_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("job/setPDF/"), DynamicPart("jobId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_JobController_setPDF59_invoker = createInvoker(
    JobController_13.setPDF(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JobController",
      "setPDF",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """job/setPDF/""" + "$" + """jobId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:168
  private[this] lazy val controllers_JobController_deleteJob60_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("job/deleteJob/"), DynamicPart("jobId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_JobController_deleteJob60_invoker = createInvoker(
    JobController_13.deleteJob(fakeValue[Long]),
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

  // @LINE:169
  private[this] lazy val controllers_JobController_getJobsByPublisher61_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("job/getJobsByUser/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_JobController_getJobsByPublisher61_invoker = createInvoker(
    JobController_13.getJobsByPublisher(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JobController",
      "getJobsByPublisher",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """job/getJobsByUser/""" + "$" + """userId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:170
  private[this] lazy val controllers_JobController_getJobsByApplicant62_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("job/getJobsByApplicant/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_JobController_getJobsByApplicant62_invoker = createInvoker(
    JobController_13.getJobsByApplicant(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JobController",
      "getJobsByApplicant",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """job/getJobsByApplicant/""" + "$" + """userId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:171
  private[this] lazy val controllers_JobController_checkJobExist63_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("job/checkJobExist/"), DynamicPart("jobId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_JobController_checkJobExist63_invoker = createInvoker(
    JobController_13.checkJobExist(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JobController",
      "checkJobExist",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """job/checkJobExist/""" + "$" + """jobId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:172
  private[this] lazy val controllers_JobController_checkJobNameAvailability64_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("job/isJobNameExisted")))
  )
  private[this] lazy val controllers_JobController_checkJobNameAvailability64_invoker = createInvoker(
    JobController_13.checkJobNameAvailability(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JobController",
      "checkJobNameAvailability",
      Nil,
      "POST",
      this.prefix + """job/isJobNameExisted""",
      """""",
      Seq()
    )
  )

  // @LINE:173
  private[this] lazy val controllers_ProjectController_getIdByName65_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("job/getIdByName/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjectController_getIdByName65_invoker = createInvoker(
    ProjectController_16.getIdByName(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "getIdByName",
      Seq(classOf[String]),
      "GET",
      this.prefix + """job/getIdByName/""" + "$" + """name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:174
  private[this] lazy val controllers_JobController_getApplicationsByJobId66_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("job/getApplications/"), DynamicPart("jobType", """[^/]+""",true), StaticPart("/"), DynamicPart("jobId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_JobController_getApplicationsByJobId66_invoker = createInvoker(
    JobController_13.getApplicationsByJobId(fakeValue[String], fakeValue[Long], fakeValue[Integer], fakeValue[Integer], fakeValue[java.util.Optional[String]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JobController",
      "getApplicationsByJobId",
      Seq(classOf[String], classOf[Long], classOf[Integer], classOf[Integer], classOf[java.util.Optional[String]]),
      "GET",
      this.prefix + """job/getApplications/""" + "$" + """jobType<[^/]+>/""" + "$" + """jobId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:180
  private[this] lazy val controllers_RAJobController_addRAJob67_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rajob/addRAJob")))
  )
  private[this] lazy val controllers_RAJobController_addRAJob67_invoker = createInvoker(
    RAJobController_18.addRAJob(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RAJobController",
      "addRAJob",
      Nil,
      "POST",
      this.prefix + """rajob/addRAJob""",
      """######################################### RAJob #######################################################################""",
      Seq()
    )
  )

  // @LINE:181
  private[this] lazy val controllers_RAJobController_updateRAJob68_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rajob/updateRAJob/"), DynamicPart("rajobId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RAJobController_updateRAJob68_invoker = createInvoker(
    RAJobController_18.updateRAJob(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RAJobController",
      "updateRAJob",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """rajob/updateRAJob/""" + "$" + """rajobId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:182
  private[this] lazy val controllers_RAJobController_closeRAJob69_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rajob/closeRAJob/"), DynamicPart("rajobId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RAJobController_closeRAJob69_invoker = createInvoker(
    RAJobController_18.closeRAJob(fakeValue[Long]),
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

  // @LINE:183
  private[this] lazy val controllers_RAJobController_deleteRAJobImage70_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rajob/deleteRAJobImage/"), DynamicPart("rajobId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RAJobController_deleteRAJobImage70_invoker = createInvoker(
    RAJobController_18.deleteRAJobImage(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RAJobController",
      "deleteRAJobImage",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """rajob/deleteRAJobImage/""" + "$" + """rajobId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:184
  private[this] lazy val controllers_RAJobController_deleteRAJobPDF71_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rajob/deleteRAJobPDF/"), DynamicPart("rajobId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RAJobController_deleteRAJobPDF71_invoker = createInvoker(
    RAJobController_18.deleteRAJobPDF(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RAJobController",
      "deleteRAJobPDF",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """rajob/deleteRAJobPDF/""" + "$" + """rajobId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:185
  private[this] lazy val controllers_RAJobController_rajobList72_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rajob/rajobList/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RAJobController_rajobList72_invoker = createInvoker(
    RAJobController_18.rajobList(fakeValue[Long], fakeValue[Integer], fakeValue[Integer], fakeValue[java.util.Optional[String]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RAJobController",
      "rajobList",
      Seq(classOf[Long], classOf[Integer], classOf[Integer], classOf[java.util.Optional[String]]),
      "GET",
      this.prefix + """rajob/rajobList/""" + "$" + """userId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:186
  private[this] lazy val controllers_RAJobController_applyRAJob73_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rajob/applyRAJob/"), DynamicPart("rajobId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RAJobController_applyRAJob73_invoker = createInvoker(
    RAJobController_18.applyRAJob(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RAJobController",
      "applyRAJob",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """rajob/applyRAJob/""" + "$" + """rajobId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:187
  private[this] lazy val controllers_RAJobController_rajobUpdateStatue74_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rajob/updateStatus/"), DynamicPart("rajobId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RAJobController_rajobUpdateStatue74_invoker = createInvoker(
    RAJobController_18.rajobUpdateStatue(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RAJobController",
      "rajobUpdateStatue",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """rajob/updateStatus/""" + "$" + """rajobId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:188
  private[this] lazy val controllers_RAJobController_giveRAJobOffertoStudent75_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rajob/updateRAjobApplicationStatus/"), DynamicPart("rajobApplicationId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RAJobController_giveRAJobOffertoStudent75_invoker = createInvoker(
    RAJobController_18.giveRAJobOffertoStudent(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RAJobController",
      "giveRAJobOffertoStudent",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """rajob/updateRAjobApplicationStatus/""" + "$" + """rajobApplicationId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:189
  private[this] lazy val controllers_RAJobController_getRAJobApplicationById76_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rajob/rajobApplicationDetail/"), DynamicPart("rajobApplicationId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RAJobController_getRAJobApplicationById76_invoker = createInvoker(
    RAJobController_18.getRAJobApplicationById(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RAJobController",
      "getRAJobApplicationById",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """rajob/rajobApplicationDetail/""" + "$" + """rajobApplicationId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:192
  private[this] lazy val controllers_RAJobController_getRAJobById77_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rajob/rajobDetail/"), DynamicPart("rajobId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RAJobController_getRAJobById77_invoker = createInvoker(
    RAJobController_18.getRAJobById(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RAJobController",
      "getRAJobById",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """rajob/rajobDetail/""" + "$" + """rajobId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:193
  private[this] lazy val controllers_RAJobController_getRAJobPublisher78_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rajob/getRAJobPublisher/"), DynamicPart("rajobId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RAJobController_getRAJobPublisher78_invoker = createInvoker(
    RAJobController_18.getRAJobPublisher(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RAJobController",
      "getRAJobPublisher",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """rajob/getRAJobPublisher/""" + "$" + """rajobId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:194
  private[this] lazy val controllers_RAJobController_searchRAJobsByCondition79_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rajob/search/conditions")))
  )
  private[this] lazy val controllers_RAJobController_searchRAJobsByCondition79_invoker = createInvoker(
    RAJobController_18.searchRAJobsByCondition(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RAJobController",
      "searchRAJobsByCondition",
      Nil,
      "POST",
      this.prefix + """rajob/search/conditions""",
      """""",
      Seq()
    )
  )

  // @LINE:195
  private[this] lazy val controllers_RAJobController_setImage80_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rajob/setImage/"), DynamicPart("rajobId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RAJobController_setImage80_invoker = createInvoker(
    RAJobController_18.setImage(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RAJobController",
      "setImage",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """rajob/setImage/""" + "$" + """rajobId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:196
  private[this] lazy val controllers_RAJobController_setPDF81_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rajob/setPDF/"), DynamicPart("rajobId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RAJobController_setPDF81_invoker = createInvoker(
    RAJobController_18.setPDF(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RAJobController",
      "setPDF",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """rajob/setPDF/""" + "$" + """rajobId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:197
  private[this] lazy val controllers_RAJobController_deleteRAJob82_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rajob/deleteRAJob/"), DynamicPart("rajobId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RAJobController_deleteRAJob82_invoker = createInvoker(
    RAJobController_18.deleteRAJob(fakeValue[Long]),
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

  // @LINE:198
  private[this] lazy val controllers_RAJobController_getRAJobsByPublisher83_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rajob/getRAJobsByUser/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RAJobController_getRAJobsByPublisher83_invoker = createInvoker(
    RAJobController_18.getRAJobsByPublisher(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RAJobController",
      "getRAJobsByPublisher",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """rajob/getRAJobsByUser/""" + "$" + """userId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:199
  private[this] lazy val controllers_RAJobController_getRAJobsByApplicant84_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rajob/getRAJobsByApplicant/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RAJobController_getRAJobsByApplicant84_invoker = createInvoker(
    RAJobController_18.getRAJobsByApplicant(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RAJobController",
      "getRAJobsByApplicant",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """rajob/getRAJobsByApplicant/""" + "$" + """userId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:200
  private[this] lazy val controllers_RAJobController_checkRAJobExist85_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rajob/checkRAJobExist/"), DynamicPart("rajobId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RAJobController_checkRAJobExist85_invoker = createInvoker(
    RAJobController_18.checkRAJobExist(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RAJobController",
      "checkRAJobExist",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """rajob/checkRAJobExist/""" + "$" + """rajobId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:201
  private[this] lazy val controllers_RAJobController_checkRAJobNameAvailability86_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rajob/isRAJobNameExisted")))
  )
  private[this] lazy val controllers_RAJobController_checkRAJobNameAvailability86_invoker = createInvoker(
    RAJobController_18.checkRAJobNameAvailability(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RAJobController",
      "checkRAJobNameAvailability",
      Nil,
      "POST",
      this.prefix + """rajob/isRAJobNameExisted""",
      """""",
      Seq()
    )
  )

  // @LINE:202
  private[this] lazy val controllers_RAJobController_getIdByName87_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rajob/getIdByName/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RAJobController_getIdByName87_invoker = createInvoker(
    RAJobController_18.getIdByName(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RAJobController",
      "getIdByName",
      Seq(classOf[String]),
      "GET",
      this.prefix + """rajob/getIdByName/""" + "$" + """name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:203
  private[this] lazy val controllers_RAJobController_sendOfferEmail88_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rajob/offer")))
  )
  private[this] lazy val controllers_RAJobController_sendOfferEmail88_invoker = createInvoker(
    RAJobController_18.sendOfferEmail(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RAJobController",
      "sendOfferEmail",
      Nil,
      "POST",
      this.prefix + """rajob/offer""",
      """""",
      Seq()
    )
  )

  // @LINE:204
  private[this] lazy val controllers_RAJobController_sendRAJobPostedEmail89_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rajob/sendPostedEmail")))
  )
  private[this] lazy val controllers_RAJobController_sendRAJobPostedEmail89_invoker = createInvoker(
    RAJobController_18.sendRAJobPostedEmail(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RAJobController",
      "sendRAJobPostedEmail",
      Nil,
      "POST",
      this.prefix + """rajob/sendPostedEmail""",
      """""",
      Seq()
    )
  )

  // @LINE:205
  private[this] lazy val controllers_RAJobController_sendRAJobAppliedEmail90_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rajob/sendAppliedEmail")))
  )
  private[this] lazy val controllers_RAJobController_sendRAJobAppliedEmail90_invoker = createInvoker(
    RAJobController_18.sendRAJobAppliedEmail(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RAJobController",
      "sendRAJobAppliedEmail",
      Nil,
      "POST",
      this.prefix + """rajob/sendAppliedEmail""",
      """""",
      Seq()
    )
  )

  // @LINE:206
  private[this] lazy val controllers_RAJobController_listProfessorsJson91_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rajob/professors")))
  )
  private[this] lazy val controllers_RAJobController_listProfessorsJson91_invoker = createInvoker(
    RAJobController_18.listProfessorsJson(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RAJobController",
      "listProfessorsJson",
      Nil,
      "GET",
      this.prefix + """rajob/professors""",
      """""",
      Seq()
    )
  )

  // @LINE:211
  private[this] lazy val controllers_TAJobController_addTAJob92_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tajob/addTAJob")))
  )
  private[this] lazy val controllers_TAJobController_addTAJob92_invoker = createInvoker(
    TAJobController_12.addTAJob(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TAJobController",
      "addTAJob",
      Nil,
      "POST",
      this.prefix + """tajob/addTAJob""",
      """######################################### TAJob #######################################################################""",
      Seq()
    )
  )

  // @LINE:212
  private[this] lazy val controllers_TAJobController_updateTAJob93_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tajob/updateTAJob/"), DynamicPart("tajobId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TAJobController_updateTAJob93_invoker = createInvoker(
    TAJobController_12.updateTAJob(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TAJobController",
      "updateTAJob",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """tajob/updateTAJob/""" + "$" + """tajobId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:213
  private[this] lazy val controllers_TAJobController_deleteTAJobImage94_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tajob/deleteTAJobImage/"), DynamicPart("tajobId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TAJobController_deleteTAJobImage94_invoker = createInvoker(
    TAJobController_12.deleteTAJobImage(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TAJobController",
      "deleteTAJobImage",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """tajob/deleteTAJobImage/""" + "$" + """tajobId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:214
  private[this] lazy val controllers_TAJobController_deleteTAJobPDF95_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tajob/deleteTAJobPDF/"), DynamicPart("tajobId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TAJobController_deleteTAJobPDF95_invoker = createInvoker(
    TAJobController_12.deleteTAJobPDF(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TAJobController",
      "deleteTAJobPDF",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """tajob/deleteTAJobPDF/""" + "$" + """tajobId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:215
  private[this] lazy val controllers_TAJobController_tajobList96_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tajob/tajobList/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TAJobController_tajobList96_invoker = createInvoker(
    TAJobController_12.tajobList(fakeValue[Long], fakeValue[Integer], fakeValue[Integer], fakeValue[java.util.Optional[String]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TAJobController",
      "tajobList",
      Seq(classOf[Long], classOf[Integer], classOf[Integer], classOf[java.util.Optional[String]]),
      "GET",
      this.prefix + """tajob/tajobList/""" + "$" + """userId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:216
  private[this] lazy val controllers_TAJobController_applyTAJob97_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tajob/applyTAJob/"), DynamicPart("tajobId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TAJobController_applyTAJob97_invoker = createInvoker(
    TAJobController_12.applyTAJob(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TAJobController",
      "applyTAJob",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """tajob/applyTAJob/""" + "$" + """tajobId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:217
  private[this] lazy val controllers_TAJobController_tajobUpdateStatue98_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tajob/updateStatus/"), DynamicPart("tajobId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TAJobController_tajobUpdateStatue98_invoker = createInvoker(
    TAJobController_12.tajobUpdateStatue(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TAJobController",
      "tajobUpdateStatue",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """tajob/updateStatus/""" + "$" + """tajobId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:218
  private[this] lazy val controllers_TAJobController_getTAJobApplicationById99_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tajob/tajobApplicationDetail/"), DynamicPart("tajobApplicationId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TAJobController_getTAJobApplicationById99_invoker = createInvoker(
    TAJobController_12.getTAJobApplicationById(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TAJobController",
      "getTAJobApplicationById",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """tajob/tajobApplicationDetail/""" + "$" + """tajobApplicationId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:221
  private[this] lazy val controllers_TAJobController_getTAJobById100_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tajob/tajobDetail/"), DynamicPart("tajobId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TAJobController_getTAJobById100_invoker = createInvoker(
    TAJobController_12.getTAJobById(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TAJobController",
      "getTAJobById",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """tajob/tajobDetail/""" + "$" + """tajobId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:222
  private[this] lazy val controllers_TAJobController_getTAJobPublisher101_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tajob/getTAJobPublisher/"), DynamicPart("tajobId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TAJobController_getTAJobPublisher101_invoker = createInvoker(
    TAJobController_12.getTAJobPublisher(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TAJobController",
      "getTAJobPublisher",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """tajob/getTAJobPublisher/""" + "$" + """tajobId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:223
  private[this] lazy val controllers_TAJobController_searchTAJobsByCondition102_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tajob/search/conditions")))
  )
  private[this] lazy val controllers_TAJobController_searchTAJobsByCondition102_invoker = createInvoker(
    TAJobController_12.searchTAJobsByCondition(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TAJobController",
      "searchTAJobsByCondition",
      Nil,
      "POST",
      this.prefix + """tajob/search/conditions""",
      """""",
      Seq()
    )
  )

  // @LINE:224
  private[this] lazy val controllers_TAJobController_setImage103_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tajob/setImage/"), DynamicPart("tajobId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TAJobController_setImage103_invoker = createInvoker(
    TAJobController_12.setImage(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TAJobController",
      "setImage",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """tajob/setImage/""" + "$" + """tajobId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:225
  private[this] lazy val controllers_TAJobController_setPDF104_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tajob/setPDF/"), DynamicPart("tajobId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TAJobController_setPDF104_invoker = createInvoker(
    TAJobController_12.setPDF(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TAJobController",
      "setPDF",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """tajob/setPDF/""" + "$" + """tajobId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:226
  private[this] lazy val controllers_TAJobController_deleteTAJob105_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tajob/deleteTAJob/"), DynamicPart("tajobId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TAJobController_deleteTAJob105_invoker = createInvoker(
    TAJobController_12.deleteTAJob(fakeValue[Long]),
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

  // @LINE:227
  private[this] lazy val controllers_TAJobController_getTAJobsByPublisher106_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tajob/getTAJobsByUser/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TAJobController_getTAJobsByPublisher106_invoker = createInvoker(
    TAJobController_12.getTAJobsByPublisher(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TAJobController",
      "getTAJobsByPublisher",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """tajob/getTAJobsByUser/""" + "$" + """userId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:228
  private[this] lazy val controllers_TAJobController_checkTAJobExist107_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tajob/checkTAJobExist/"), DynamicPart("tajobId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TAJobController_checkTAJobExist107_invoker = createInvoker(
    TAJobController_12.checkTAJobExist(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TAJobController",
      "checkTAJobExist",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """tajob/checkTAJobExist/""" + "$" + """tajobId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:229
  private[this] lazy val controllers_TAJobController_checkTAJobNameAvailability108_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tajob/isTAJobNameExisted")))
  )
  private[this] lazy val controllers_TAJobController_checkTAJobNameAvailability108_invoker = createInvoker(
    TAJobController_12.checkTAJobNameAvailability(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TAJobController",
      "checkTAJobNameAvailability",
      Nil,
      "POST",
      this.prefix + """tajob/isTAJobNameExisted""",
      """""",
      Seq()
    )
  )

  // @LINE:230
  private[this] lazy val controllers_TAJobController_getIdByName109_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tajob/getIdByName/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TAJobController_getIdByName109_invoker = createInvoker(
    TAJobController_12.getIdByName(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TAJobController",
      "getIdByName",
      Seq(classOf[String]),
      "GET",
      this.prefix + """tajob/getIdByName/""" + "$" + """name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:237
  private[this] lazy val controllers_TACandidateController_addTACandidate110_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tacandidate/addTACandidate")))
  )
  private[this] lazy val controllers_TACandidateController_addTACandidate110_invoker = createInvoker(
    TACandidateController_24.addTACandidate(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TACandidateController",
      "addTACandidate",
      Nil,
      "POST",
      this.prefix + """tacandidate/addTACandidate""",
      """""",
      Seq()
    )
  )

  // @LINE:238
  private[this] lazy val controllers_TACandidateController_tacandidateList111_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tacandidate/tacandidateList/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TACandidateController_tacandidateList111_invoker = createInvoker(
    TACandidateController_24.tacandidateList(fakeValue[Long], fakeValue[Integer], fakeValue[Integer], fakeValue[java.util.Optional[String]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TACandidateController",
      "tacandidateList",
      Seq(classOf[Long], classOf[Integer], classOf[Integer], classOf[java.util.Optional[String]]),
      "GET",
      this.prefix + """tacandidate/tacandidateList/""" + "$" + """userId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:239
  private[this] lazy val controllers_TACandidateController_getTACandidateById112_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tacandidate/candidateDetail/"), DynamicPart("Id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TACandidateController_getTACandidateById112_invoker = createInvoker(
    TACandidateController_24.getTACandidateById(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TACandidateController",
      "getTACandidateById",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """tacandidate/candidateDetail/""" + "$" + """Id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:240
  private[this] lazy val controllers_TACandidateController_getAssignmentsByUserId113_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tacandidate/assignments/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TACandidateController_getAssignmentsByUserId113_invoker = createInvoker(
    TACandidateController_24.getAssignmentsByUserId(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TACandidateController",
      "getAssignmentsByUserId",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """tacandidate/assignments/""" + "$" + """userId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:247
  private[this] lazy val controllers_CourseController_listCourses114_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("courses")))
  )
  private[this] lazy val controllers_CourseController_listCourses114_invoker = createInvoker(
    CourseController_3.listCourses,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CourseController",
      "listCourses",
      Nil,
      "GET",
      this.prefix + """courses""",
      """""",
      Seq()
    )
  )

  // @LINE:248
  private[this] lazy val controllers_CourseController_getCourseDetails115_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("courses/details/"), DynamicPart("courseId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CourseController_getCourseDetails115_invoker = createInvoker(
    CourseController_3.getCourseDetails(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CourseController",
      "getCourseDetails",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """courses/details/""" + "$" + """courseId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:249
  private[this] lazy val controllers_CourseController_approveTA116_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("courses/approve/"), DynamicPart("courseId", """[^/]+""",true), StaticPart("/"), DynamicPart("week", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CourseController_approveTA116_invoker = createInvoker(
    CourseController_3.approveTA(fakeValue[Long], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CourseController",
      "approveTA",
      Seq(classOf[Long], classOf[Int]),
      "POST",
      this.prefix + """courses/approve/""" + "$" + """courseId<[^/]+>/""" + "$" + """week<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:257
  private[this] lazy val controllers_CourseTAAssignmentController_addAssignment117_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tahiring/addAssignment")))
  )
  private[this] lazy val controllers_CourseTAAssignmentController_addAssignment117_invoker = createInvoker(
    CourseTAAssignmentController_9.addAssignment(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CourseTAAssignmentController",
      "addAssignment",
      Nil,
      "POST",
      this.prefix + """tahiring/addAssignment""",
      """""",
      Seq()
    )
  )

  // @LINE:258
  private[this] lazy val controllers_CourseTAAssignmentController_getCourseTAAssignmentById118_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tahiring/status/"), DynamicPart("Id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CourseTAAssignmentController_getCourseTAAssignmentById118_invoker = createInvoker(
    CourseTAAssignmentController_9.getCourseTAAssignmentById(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CourseTAAssignmentController",
      "getCourseTAAssignmentById",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """tahiring/status/""" + "$" + """Id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:259
  private[this] lazy val controllers_CourseTAAssignmentController_courseTAAssignmentList119_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tahiring/assignmentList/"), DynamicPart("Id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CourseTAAssignmentController_courseTAAssignmentList119_invoker = createInvoker(
    CourseTAAssignmentController_9.courseTAAssignmentList(fakeValue[Long], fakeValue[Integer], fakeValue[Integer], fakeValue[java.util.Optional[String]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CourseTAAssignmentController",
      "courseTAAssignmentList",
      Seq(classOf[Long], classOf[Integer], classOf[Integer], classOf[java.util.Optional[String]]),
      "GET",
      this.prefix + """tahiring/assignmentList/""" + "$" + """Id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:260
  private[this] lazy val controllers_CourseTAAssignmentController_getCourseTAAssignmentById120_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tahiring/assignmentDetail/"), DynamicPart("Id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CourseTAAssignmentController_getCourseTAAssignmentById120_invoker = createInvoker(
    CourseTAAssignmentController_9.getCourseTAAssignmentById(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CourseTAAssignmentController",
      "getCourseTAAssignmentById",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """tahiring/assignmentDetail/""" + "$" + """Id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:266
  private[this] lazy val controllers_UserController_addUser121_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/addUser")))
  )
  private[this] lazy val controllers_UserController_addUser121_invoker = createInvoker(
    UserController_14.addUser,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "addUser",
      Nil,
      "POST",
      this.prefix + """user/addUser""",
      """################################### Users #####################################################################""",
      Seq()
    )
  )

  // @LINE:267
  private[this] lazy val controllers_UserController_userDetail122_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/userDetail/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_userDetail122_invoker = createInvoker(
    UserController_14.userDetail(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "userDetail",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """user/userDetail/""" + "$" + """userId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:268
  private[this] lazy val controllers_UserController_getResearcherInfo123_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/getResearcherInfo/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_getResearcherInfo123_invoker = createInvoker(
    UserController_14.getResearcherInfo(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "getResearcherInfo",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """user/getResearcherInfo/""" + "$" + """userId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:269
  private[this] lazy val controllers_UserController_getStudentInfo124_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/getStudentInfo/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_getStudentInfo124_invoker = createInvoker(
    UserController_14.getStudentInfo(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "getStudentInfo",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """user/getStudentInfo/""" + "$" + """userId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:270
  private[this] lazy val controllers_UserController_updateUser125_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/updateUser")))
  )
  private[this] lazy val controllers_UserController_updateUser125_invoker = createInvoker(
    UserController_14.updateUser,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "updateUser",
      Nil,
      "POST",
      this.prefix + """user/updateUser""",
      """""",
      Seq()
    )
  )

  // @LINE:271
  private[this] lazy val controllers_UserController_userLogin126_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/userLogin")))
  )
  private[this] lazy val controllers_UserController_userLogin126_invoker = createInvoker(
    UserController_14.userLogin,
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

  // @LINE:272
  private[this] lazy val controllers_UserController_checkNewUserEmailAvailability127_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/checkEmail")))
  )
  private[this] lazy val controllers_UserController_checkNewUserEmailAvailability127_invoker = createInvoker(
    UserController_14.checkNewUserEmailAvailability,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "checkNewUserEmailAvailability",
      Nil,
      "POST",
      this.prefix + """user/checkEmail""",
      """""",
      Seq()
    )
  )

  // @LINE:273
  private[this] lazy val controllers_UserController_userList128_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/userList")))
  )
  private[this] lazy val controllers_UserController_userList128_invoker = createInvoker(
    UserController_14.userList(fakeValue[java.util.Optional[Integer]], fakeValue[java.util.Optional[Integer]], fakeValue[java.util.Optional[String]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "userList",
      Seq(classOf[java.util.Optional[Integer]], classOf[java.util.Optional[Integer]], classOf[java.util.Optional[String]]),
      "GET",
      this.prefix + """user/userList""",
      """""",
      Seq()
    )
  )

  // @LINE:274
  private[this] lazy val controllers_UserController_validateEmail129_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/validateEmail")))
  )
  private[this] lazy val controllers_UserController_validateEmail129_invoker = createInvoker(
    UserController_14.validateEmail,
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

  // @LINE:276
  private[this] lazy val controllers_UserController_searchUserByCondition130_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/search/conditions")))
  )
  private[this] lazy val controllers_UserController_searchUserByCondition130_invoker = createInvoker(
    UserController_14.searchUserByCondition(fakeValue[java.util.Optional[Integer]], fakeValue[java.util.Optional[Integer]], fakeValue[java.util.Optional[String]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "searchUserByCondition",
      Seq(classOf[java.util.Optional[Integer]], classOf[java.util.Optional[Integer]], classOf[java.util.Optional[String]]),
      "POST",
      this.prefix + """user/search/conditions""",
      """""",
      Seq()
    )
  )

  // @LINE:277
  private[this] lazy val controllers_UserController_inactivateUserPOST131_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/userDelete")))
  )
  private[this] lazy val controllers_UserController_inactivateUserPOST131_invoker = createInvoker(
    UserController_14.inactivateUserPOST,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "inactivateUserPOST",
      Nil,
      "POST",
      this.prefix + """user/userDelete""",
      """""",
      Seq()
    )
  )

  // @LINE:281
  private[this] lazy val controllers_UserController_autoRegisterUser132_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/autoRegisterUser")))
  )
  private[this] lazy val controllers_UserController_autoRegisterUser132_invoker = createInvoker(
    UserController_14.autoRegisterUser,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "autoRegisterUser",
      Nil,
      "POST",
      this.prefix + """user/autoRegisterUser""",
      """""",
      Seq()
    )
  )

  // @LINE:284
  private[this] lazy val controllers_UserController_getAllUsersInAllRoles133_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/getAllUsers")))
  )
  private[this] lazy val controllers_UserController_getAllUsersInAllRoles133_invoker = createInvoker(
    UserController_14.getAllUsersInAllRoles,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "getAllUsersInAllRoles",
      Nil,
      "GET",
      this.prefix + """user/getAllUsers""",
      """""",
      Seq()
    )
  )

  // @LINE:285
  private[this] lazy val controllers_UserController_getAllNormalUsers134_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/getAllNormalUsers")))
  )
  private[this] lazy val controllers_UserController_getAllNormalUsers134_invoker = createInvoker(
    UserController_14.getAllNormalUsers,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "getAllNormalUsers",
      Nil,
      "GET",
      this.prefix + """user/getAllNormalUsers""",
      """""",
      Seq()
    )
  )

  // @LINE:286
  private[this] lazy val controllers_UserController_updateImageByUserId135_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/updateImageForUser/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_updateImageByUserId135_invoker = createInvoker(
    UserController_14.updateImageByUserId(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "updateImageByUserId",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """user/updateImageForUser/""" + "$" + """userId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:287
  private[this] lazy val controllers_UserController_deleteImageByUserId136_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/deleteImageForUser/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_deleteImageByUserId136_invoker = createInvoker(
    UserController_14.deleteImageByUserId(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "deleteImageByUserId",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """user/deleteImageForUser/""" + "$" + """userId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:293
  private[this] lazy val controllers_UserController_userSearch137_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/search/"), DynamicPart("display_name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_userSearch137_invoker = createInvoker(
    UserController_14.userSearch(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "userSearch",
      Seq(classOf[String]),
      "GET",
      this.prefix + """user/search/""" + "$" + """display_name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:295
  private[this] lazy val controllers_UserController_getActiveUsers138_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/getActiveUsers/json")))
  )
  private[this] lazy val controllers_UserController_getActiveUsers138_invoker = createInvoker(
    UserController_1.get.getActiveUsers(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "getActiveUsers",
      Seq(classOf[String]),
      "GET",
      this.prefix + """user/getActiveUsers/json""",
      """# search user""",
      Seq()
    )
  )

  // @LINE:296
  private[this] lazy val controllers_UserController_sendPasswordEmail139_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/sendPasswordEmail")))
  )
  private[this] lazy val controllers_UserController_sendPasswordEmail139_invoker = createInvoker(
    UserController_1.get.sendPasswordEmail,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "sendPasswordEmail",
      Nil,
      "POST",
      this.prefix + """user/sendPasswordEmail""",
      """""",
      Seq()
    )
  )

  // @LINE:297
  private[this] lazy val controllers_UserController_updatePassword140_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/updatePassword")))
  )
  private[this] lazy val controllers_UserController_updatePassword140_invoker = createInvoker(
    UserController_1.get.updatePassword,
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

  // @LINE:298
  private[this] lazy val controllers_UserController_userActivation141_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/"), DynamicPart("hashcode", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_userActivation141_invoker = createInvoker(
    UserController_1.get.userActivation(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "userActivation",
      Seq(classOf[String]),
      "GET",
      this.prefix + """users/""" + "$" + """hashcode<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:299
  private[this] lazy val controllers_UserController_sendRegisterEmail142_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/validate")))
  )
  private[this] lazy val controllers_UserController_sendRegisterEmail142_invoker = createInvoker(
    UserController_14.sendRegisterEmail(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "sendRegisterEmail",
      Nil,
      "POST",
      this.prefix + """user/validate""",
      """""",
      Seq()
    )
  )

  // @LINE:300
  private[this] lazy val controllers_UserController_resendRegisterEmail143_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/validate/resend")))
  )
  private[this] lazy val controllers_UserController_resendRegisterEmail143_invoker = createInvoker(
    UserController_14.resendRegisterEmail(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "resendRegisterEmail",
      Nil,
      "POST",
      this.prefix + """user/validate/resend""",
      """""",
      Seq()
    )
  )

  // @LINE:302
  private[this] lazy val controllers_UserController_updateLevel144_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/updateLevel/"), DynamicPart("uid", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_updateLevel144_invoker = createInvoker(
    UserController_1.get.updateLevel(fakeValue[Long]),
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

  // @LINE:303
  private[this] lazy val controllers_UserController_getUserByEmail145_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/getUserByEmail")))
  )
  private[this] lazy val controllers_UserController_getUserByEmail145_invoker = createInvoker(
    UserController_1.get.getUserByEmail,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "getUserByEmail",
      Nil,
      "POST",
      this.prefix + """user/getUserByEmail""",
      """""",
      Seq()
    )
  )

  // @LINE:307
  private[this] lazy val controllers_OrganizationController_organizationList146_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("organization/organizationList")))
  )
  private[this] lazy val controllers_OrganizationController_organizationList146_invoker = createInvoker(
    OrganizationController_20.organizationList(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrganizationController",
      "organizationList",
      Nil,
      "GET",
      this.prefix + """organization/organizationList""",
      """################################### Organizations #############################################################################""",
      Seq()
    )
  )

  // @LINE:308
  private[this] lazy val controllers_OrganizationController_organizationListPage147_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("organization/organizationListPage")))
  )
  private[this] lazy val controllers_OrganizationController_organizationListPage147_invoker = createInvoker(
    OrganizationController_20.organizationListPage(fakeValue[java.util.Optional[Integer]], fakeValue[java.util.Optional[Integer]], fakeValue[java.util.Optional[String]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrganizationController",
      "organizationListPage",
      Seq(classOf[java.util.Optional[Integer]], classOf[java.util.Optional[Integer]], classOf[java.util.Optional[String]]),
      "GET",
      this.prefix + """organization/organizationListPage""",
      """""",
      Seq()
    )
  )

  // @LINE:309
  private[this] lazy val controllers_OrganizationController_addUsers148_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("organization/addUsers")))
  )
  private[this] lazy val controllers_OrganizationController_addUsers148_invoker = createInvoker(
    OrganizationController_20.addUsers(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrganizationController",
      "addUsers",
      Nil,
      "POST",
      this.prefix + """organization/addUsers""",
      """""",
      Seq()
    )
  )

  // @LINE:310
  private[this] lazy val controllers_OrganizationController_registerOrganization149_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("organization/register")))
  )
  private[this] lazy val controllers_OrganizationController_registerOrganization149_invoker = createInvoker(
    OrganizationController_20.registerOrganization(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrganizationController",
      "registerOrganization",
      Nil,
      "POST",
      this.prefix + """organization/register""",
      """""",
      Seq()
    )
  )

  // @LINE:311
  private[this] lazy val controllers_OrganizationController_organizationDetail150_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("organization/organizationDetail/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_OrganizationController_organizationDetail150_invoker = createInvoker(
    OrganizationController_20.organizationDetail(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrganizationController",
      "organizationDetail",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """organization/organizationDetail/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:312
  private[this] lazy val controllers_OrganizationController_organizationUpdate151_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("organization/organizationUpdate")))
  )
  private[this] lazy val controllers_OrganizationController_organizationUpdate151_invoker = createInvoker(
    OrganizationController_20.organizationUpdate(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrganizationController",
      "organizationUpdate",
      Nil,
      "POST",
      this.prefix + """organization/organizationUpdate""",
      """""",
      Seq()
    )
  )

  // @LINE:313
  private[this] lazy val controllers_OrganizationController_organizationListbyName152_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("organization/organizationListByName")))
  )
  private[this] lazy val controllers_OrganizationController_organizationListbyName152_invoker = createInvoker(
    OrganizationController_20.organizationListbyName(fakeValue[java.util.Optional[Integer]], fakeValue[java.util.Optional[Integer]], fakeValue[java.util.Optional[String]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.OrganizationController",
      "organizationListbyName",
      Seq(classOf[java.util.Optional[Integer]], classOf[java.util.Optional[Integer]], classOf[java.util.Optional[String]]),
      "POST",
      this.prefix + """organization/organizationListByName""",
      """""",
      Seq()
    )
  )

  // @LINE:320
  private[this] lazy val controllers_BugReportController_addBugReport153_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bugReport/addBugReport")))
  )
  private[this] lazy val controllers_BugReportController_addBugReport153_invoker = createInvoker(
    BugReportController_2.get.addBugReport,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BugReportController",
      "addBugReport",
      Nil,
      "POST",
      this.prefix + """bugReport/addBugReport""",
      """################################### Bug Reports #######################################################################""",
      Seq()
    )
  )

  // @LINE:321
  private[this] lazy val controllers_BugReportController_getBugReport154_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bugReport/getBugReport/id/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BugReportController_getBugReport154_invoker = createInvoker(
    BugReportController_2.get.getBugReport(fakeValue[Long], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BugReportController",
      "getBugReport",
      Seq(classOf[Long], classOf[String]),
      "GET",
      this.prefix + """bugReport/getBugReport/id/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:322
  private[this] lazy val controllers_BugReportController_updateBugReport155_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bugReport/updateBugReport/id/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BugReportController_updateBugReport155_invoker = createInvoker(
    BugReportController_2.get.updateBugReport(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BugReportController",
      "updateBugReport",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """bugReport/updateBugReport/id/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:323
  private[this] lazy val controllers_BugReportController_deleteBugReport156_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bugReport/deleteBugReport/id/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BugReportController_deleteBugReport156_invoker = createInvoker(
    BugReportController_2.get.deleteBugReport(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BugReportController",
      "deleteBugReport",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """bugReport/deleteBugReport/id/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:324
  private[this] lazy val controllers_BugReportController_updateBugReportSolved157_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bugReport/updateBugReportSolved/"), DynamicPart("bugId", """[^/]+""",true), StaticPart("/"), DynamicPart("fixerId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BugReportController_updateBugReportSolved157_invoker = createInvoker(
    BugReportController_2.get.updateBugReportSolved(fakeValue[Long], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BugReportController",
      "updateBugReportSolved",
      Seq(classOf[Long], classOf[Long]),
      "GET",
      this.prefix + """bugReport/updateBugReportSolved/""" + "$" + """bugId<[^/]+>/""" + "$" + """fixerId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:325
  private[this] lazy val controllers_BugReportController_getAllBugReports158_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bugReport/getAllBugReports/json")))
  )
  private[this] lazy val controllers_BugReportController_getAllBugReports158_invoker = createInvoker(
    BugReportController_2.get.getAllBugReports(fakeValue[java.util.Optional[Integer]], fakeValue[java.util.Optional[Integer]], fakeValue[java.util.Optional[String]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BugReportController",
      "getAllBugReports",
      Seq(classOf[java.util.Optional[Integer]], classOf[java.util.Optional[Integer]], classOf[java.util.Optional[String]]),
      "GET",
      this.prefix + """bugReport/getAllBugReports/json""",
      """""",
      Seq()
    )
  )

  // @LINE:327
  private[this] lazy val controllers_BugReportController_getAllUnsolvedBugReports159_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bugReport/getAllUnsolvedBugReports/json")))
  )
  private[this] lazy val controllers_BugReportController_getAllUnsolvedBugReports159_invoker = createInvoker(
    BugReportController_2.get.getAllUnsolvedBugReports,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BugReportController",
      "getAllUnsolvedBugReports",
      Nil,
      "GET",
      this.prefix + """bugReport/getAllUnsolvedBugReports/json""",
      """""",
      Seq()
    )
  )

  // @LINE:328
  private[this] lazy val controllers_BugReportController_getAllSolvedBugReports160_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bugReport/getAllSolvedBugReports/json")))
  )
  private[this] lazy val controllers_BugReportController_getAllSolvedBugReports160_invoker = createInvoker(
    BugReportController_2.get.getAllSolvedBugReports,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BugReportController",
      "getAllSolvedBugReports",
      Nil,
      "GET",
      this.prefix + """bugReport/getAllSolvedBugReports/json""",
      """""",
      Seq()
    )
  )

  // @LINE:334
  private[this] lazy val controllers_SuggestionController_addSuggestion161_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("suggestion/addSuggestion")))
  )
  private[this] lazy val controllers_SuggestionController_addSuggestion161_invoker = createInvoker(
    SuggestionController_11.get.addSuggestion,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SuggestionController",
      "addSuggestion",
      Nil,
      "POST",
      this.prefix + """suggestion/addSuggestion""",
      """################################### Suggestions #####################################################################""",
      Seq()
    )
  )

  // @LINE:335
  private[this] lazy val controllers_SuggestionController_getSuggestion162_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("suggestion/getSuggestion/id/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SuggestionController_getSuggestion162_invoker = createInvoker(
    SuggestionController_11.get.getSuggestion(fakeValue[Long], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SuggestionController",
      "getSuggestion",
      Seq(classOf[Long], classOf[String]),
      "GET",
      this.prefix + """suggestion/getSuggestion/id/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:336
  private[this] lazy val controllers_SuggestionController_suggestionList163_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("suggestion/suggestionList/json")))
  )
  private[this] lazy val controllers_SuggestionController_suggestionList163_invoker = createInvoker(
    SuggestionController_11.get.suggestionList(fakeValue[java.util.Optional[Integer]], fakeValue[java.util.Optional[Integer]], fakeValue[java.util.Optional[String]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SuggestionController",
      "suggestionList",
      Seq(classOf[java.util.Optional[Integer]], classOf[java.util.Optional[Integer]], classOf[java.util.Optional[String]]),
      "GET",
      this.prefix + """suggestion/suggestionList/json""",
      """""",
      Seq()
    )
  )

  // @LINE:337
  private[this] lazy val controllers_SuggestionController_updateSuggestion164_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("suggestion/updateSuggestion/id/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SuggestionController_updateSuggestion164_invoker = createInvoker(
    SuggestionController_11.get.updateSuggestion(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SuggestionController",
      "updateSuggestion",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """suggestion/updateSuggestion/id/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:338
  private[this] lazy val controllers_SuggestionController_deleteSuggestion165_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("suggestion/deleteSuggestion/id/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SuggestionController_deleteSuggestion165_invoker = createInvoker(
    SuggestionController_11.get.deleteSuggestion(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SuggestionController",
      "deleteSuggestion",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """suggestion/deleteSuggestion/id/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:339
  private[this] lazy val controllers_SuggestionController_updateSuggestionSolved166_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("suggestion/updateSuggestionSolve/"), DynamicPart("suggestionId", """[^/]+""",true), StaticPart("/"), DynamicPart("implementorId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SuggestionController_updateSuggestionSolved166_invoker = createInvoker(
    SuggestionController_11.get.updateSuggestionSolved(fakeValue[Long], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SuggestionController",
      "updateSuggestionSolved",
      Seq(classOf[Long], classOf[Long]),
      "GET",
      this.prefix + """suggestion/updateSuggestionSolve/""" + "$" + """suggestionId<[^/]+>/""" + "$" + """implementorId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:343
  private[this] lazy val controllers_TechnologyController_addTechnology167_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technology/addTechnology")))
  )
  private[this] lazy val controllers_TechnologyController_addTechnology167_invoker = createInvoker(
    TechnologyController_10.addTechnology(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TechnologyController",
      "addTechnology",
      Nil,
      "POST",
      this.prefix + """technology/addTechnology""",
      """######################################### Technology ###################################################################""",
      Seq()
    )
  )

  // @LINE:344
  private[this] lazy val controllers_TechnologyController_updateTechnology168_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technology/updateTechnology/"), DynamicPart("technologyId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TechnologyController_updateTechnology168_invoker = createInvoker(
    TechnologyController_10.updateTechnology(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TechnologyController",
      "updateTechnology",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """technology/updateTechnology/""" + "$" + """technologyId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:347
  private[this] lazy val controllers_TechnologyController_technologyList169_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technology/technologyList/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TechnologyController_technologyList169_invoker = createInvoker(
    TechnologyController_10.technologyList(fakeValue[Long], fakeValue[Integer], fakeValue[Integer], fakeValue[java.util.Optional[String]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TechnologyController",
      "technologyList",
      Seq(classOf[Long], classOf[Integer], classOf[Integer], classOf[java.util.Optional[String]]),
      "GET",
      this.prefix + """technology/technologyList/""" + "$" + """userId<[^/]+>""",
      """DELETE        /technology/deleteTechnologyImage/:projectId                                                              controllers.TechnologyController.deleteProjectImage(projectId: Long)
DELETE        /technology/deleteTechnologyPDF/:projectId                                                                controllers.TechnologyController.deleteProjectPDF(projectId: Long)""",
      Seq()
    )
  )

  // @LINE:350
  private[this] lazy val controllers_TechnologyController_getTechnologyById170_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technology/technologyDetail/"), DynamicPart("technologyId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TechnologyController_getTechnologyById170_invoker = createInvoker(
    TechnologyController_10.getTechnologyById(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TechnologyController",
      "getTechnologyById",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """technology/technologyDetail/""" + "$" + """technologyId<[^/]+>""",
      """GET           /technology/teammember/:projectId                                                                      controllers.TechnologyController.getTeamMembersByProjectId(projectId: Long)
""",
      Seq()
    )
  )

  // @LINE:352
  private[this] lazy val controllers_TechnologyController_searchTechnologiesByCondition171_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technology/search/conditions")))
  )
  private[this] lazy val controllers_TechnologyController_searchTechnologiesByCondition171_invoker = createInvoker(
    TechnologyController_10.searchTechnologiesByCondition(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TechnologyController",
      "searchTechnologiesByCondition",
      Nil,
      "POST",
      this.prefix + """technology/search/conditions""",
      """GET           /technology/getTechnologyCreator/:technologyId                                                               controllers.TechnologyController.getTechnologyCreator(technologyId: Long)""",
      Seq()
    )
  )

  // @LINE:378
  private[this] lazy val controllers_AdminController_getUserList172_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/users")))
  )
  private[this] lazy val controllers_AdminController_getUserList172_invoker = createInvoker(
    AdminController_0.getUserList(fakeValue[Integer], fakeValue[Integer], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "getUserList",
      Seq(classOf[Integer], classOf[Integer], classOf[String]),
      "GET",
      this.prefix + """admin/users""",
      """################################### Admin Management #############################################################################""",
      Seq()
    )
  )

  // @LINE:379
  private[this] lazy val controllers_AdminController_getUserDetail173_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/users/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminController_getUserDetail173_invoker = createInvoker(
    AdminController_0.getUserDetail(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "getUserDetail",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """admin/users/""" + "$" + """userId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:380
  private[this] lazy val controllers_AdminController_updateUserStatus174_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/users/"), DynamicPart("userId", """[^/]+""",true), StaticPart("/status")))
  )
  private[this] lazy val controllers_AdminController_updateUserStatus174_invoker = createInvoker(
    AdminController_0.updateUserStatus(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "updateUserStatus",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """admin/users/""" + "$" + """userId<[^/]+>/status""",
      """""",
      Seq()
    )
  )

  // @LINE:381
  private[this] lazy val controllers_AdminController_getJobList175_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/jobs")))
  )
  private[this] lazy val controllers_AdminController_getJobList175_invoker = createInvoker(
    AdminController_0.getJobList(fakeValue[Integer], fakeValue[Integer], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "getJobList",
      Seq(classOf[Integer], classOf[Integer], classOf[String]),
      "GET",
      this.prefix + """admin/jobs""",
      """""",
      Seq()
    )
  )

  // @LINE:382
  private[this] lazy val controllers_AdminController_getJobDetail176_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/jobs/"), DynamicPart("jobType", """[^/]+""",true), StaticPart("/"), DynamicPart("jobId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminController_getJobDetail176_invoker = createInvoker(
    AdminController_0.getJobDetail(fakeValue[String], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "getJobDetail",
      Seq(classOf[String], classOf[Long]),
      "GET",
      this.prefix + """admin/jobs/""" + "$" + """jobType<[^/]+>/""" + "$" + """jobId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:383
  private[this] lazy val controllers_AdminController_getOrganizationList177_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/organizations")))
  )
  private[this] lazy val controllers_AdminController_getOrganizationList177_invoker = createInvoker(
    AdminController_0.getOrganizationList(fakeValue[Integer], fakeValue[Integer], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "getOrganizationList",
      Seq(classOf[Integer], classOf[Integer], classOf[String]),
      "GET",
      this.prefix + """admin/organizations""",
      """""",
      Seq()
    )
  )

  // @LINE:384
  private[this] lazy val controllers_AdminController_getTechnologyList178_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/technologies")))
  )
  private[this] lazy val controllers_AdminController_getTechnologyList178_invoker = createInvoker(
    AdminController_0.getTechnologyList(fakeValue[Integer], fakeValue[Integer], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "getTechnologyList",
      Seq(classOf[Integer], classOf[Integer], classOf[String]),
      "GET",
      this.prefix + """admin/technologies""",
      """""",
      Seq()
    )
  )

  // @LINE:393
  private[this] lazy val controllers_AuthorController_addAuthor179_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("author/addAuthor")))
  )
  private[this] lazy val controllers_AuthorController_addAuthor179_invoker = createInvoker(
    AuthorController_6.addAuthor,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthorController",
      "addAuthor",
      Nil,
      "POST",
      this.prefix + """author/addAuthor""",
      """################################### Authors #####################################################################""",
      Seq()
    )
  )

  // @LINE:394
  private[this] lazy val controllers_AuthorController_authorDetail180_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("author/authorDetail/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AuthorController_authorDetail180_invoker = createInvoker(
    AuthorController_6.authorDetail(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthorController",
      "authorDetail",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """author/authorDetail/""" + "$" + """userId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:395
  private[this] lazy val controllers_AuthorController_updateAuthor181_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("author/updateAuthor")))
  )
  private[this] lazy val controllers_AuthorController_updateAuthor181_invoker = createInvoker(
    AuthorController_6.updateAuthor,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthorController",
      "updateAuthor",
      Nil,
      "POST",
      this.prefix + """author/updateAuthor""",
      """""",
      Seq()
    )
  )

  // @LINE:396
  private[this] lazy val controllers_AuthorController_authorList182_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("author/authorList")))
  )
  private[this] lazy val controllers_AuthorController_authorList182_invoker = createInvoker(
    AuthorController_6.authorList(fakeValue[java.util.Optional[Integer]], fakeValue[java.util.Optional[Integer]], fakeValue[java.util.Optional[String]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthorController",
      "authorList",
      Seq(classOf[java.util.Optional[Integer]], classOf[java.util.Optional[Integer]], classOf[java.util.Optional[String]]),
      "GET",
      this.prefix + """author/authorList""",
      """""",
      Seq()
    )
  )

  // @LINE:398
  private[this] lazy val controllers_AuthorController_userDetailAdmin183_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("author/userDetailAdmin/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AuthorController_userDetailAdmin183_invoker = createInvoker(
    AuthorController_6.userDetailAdmin(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthorController",
      "userDetailAdmin",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """author/userDetailAdmin/""" + "$" + """userId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:399
  private[this] lazy val controllers_AuthorController_updateUserAdmin184_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("author/updateUserAdmin")))
  )
  private[this] lazy val controllers_AuthorController_updateUserAdmin184_invoker = createInvoker(
    AuthorController_6.updateUserAdmin,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthorController",
      "updateUserAdmin",
      Nil,
      "POST",
      this.prefix + """author/updateUserAdmin""",
      """""",
      Seq()
    )
  )

  // @LINE:400
  private[this] lazy val controllers_AuthorController_userListAdmin185_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("author/userListAdmin")))
  )
  private[this] lazy val controllers_AuthorController_userListAdmin185_invoker = createInvoker(
    AuthorController_6.userListAdmin(fakeValue[java.util.Optional[Integer]], fakeValue[java.util.Optional[Integer]], fakeValue[java.util.Optional[String]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthorController",
      "userListAdmin",
      Seq(classOf[java.util.Optional[Integer]], classOf[java.util.Optional[Integer]], classOf[java.util.Optional[String]]),
      "GET",
      this.prefix + """author/userListAdmin""",
      """""",
      Seq()
    )
  )

  // @LINE:402
  private[this] lazy val controllers_AuthorController_searchAuthorByCondition186_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("author/search")))
  )
  private[this] lazy val controllers_AuthorController_searchAuthorByCondition186_invoker = createInvoker(
    AuthorController_6.searchAuthorByCondition(fakeValue[java.util.Optional[Integer]], fakeValue[java.util.Optional[Integer]], fakeValue[java.util.Optional[String]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthorController",
      "searchAuthorByCondition",
      Seq(classOf[java.util.Optional[Integer]], classOf[java.util.Optional[Integer]], classOf[java.util.Optional[String]]),
      "POST",
      this.prefix + """author/search""",
      """""",
      Seq()
    )
  )

  // @LINE:403
  private[this] lazy val controllers_AuthorController_topAuthors187_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("author/topAuthors")))
  )
  private[this] lazy val controllers_AuthorController_topAuthors187_invoker = createInvoker(
    AuthorController_6.topAuthors(),
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

  // @LINE:407
  private[this] lazy val controllers_ReviewerController_addReviewer188_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reviewer/addReviewer")))
  )
  private[this] lazy val controllers_ReviewerController_addReviewer188_invoker = createInvoker(
    ReviewerController_22.addReviewer,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ReviewerController",
      "addReviewer",
      Nil,
      "POST",
      this.prefix + """reviewer/addReviewer""",
      """################################### Reviewer #####################################################################""",
      Seq()
    )
  )

  // @LINE:408
  private[this] lazy val controllers_ReviewerController_reviewerDetail189_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reviewer/reviewerDetail/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ReviewerController_reviewerDetail189_invoker = createInvoker(
    ReviewerController_22.reviewerDetail(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ReviewerController",
      "reviewerDetail",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """reviewer/reviewerDetail/""" + "$" + """userId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:409
  private[this] lazy val controllers_ReviewerController_updateReviewer190_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reviewer/updateReviewer")))
  )
  private[this] lazy val controllers_ReviewerController_updateReviewer190_invoker = createInvoker(
    ReviewerController_22.updateReviewer,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ReviewerController",
      "updateReviewer",
      Nil,
      "POST",
      this.prefix + """reviewer/updateReviewer""",
      """""",
      Seq()
    )
  )

  // @LINE:410
  private[this] lazy val controllers_ReviewerController_reviewerList191_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reviewer/reviewerList")))
  )
  private[this] lazy val controllers_ReviewerController_reviewerList191_invoker = createInvoker(
    ReviewerController_22.reviewerList(fakeValue[java.util.Optional[Integer]], fakeValue[java.util.Optional[Integer]], fakeValue[java.util.Optional[String]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ReviewerController",
      "reviewerList",
      Seq(classOf[java.util.Optional[Integer]], classOf[java.util.Optional[Integer]], classOf[java.util.Optional[String]]),
      "GET",
      this.prefix + """reviewer/reviewerList""",
      """""",
      Seq()
    )
  )

  // @LINE:412
  private[this] lazy val controllers_ReviewerController_searchReviewerByCondition192_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reviewer/search/conditions")))
  )
  private[this] lazy val controllers_ReviewerController_searchReviewerByCondition192_invoker = createInvoker(
    ReviewerController_22.searchReviewerByCondition(fakeValue[java.util.Optional[Integer]], fakeValue[java.util.Optional[Integer]], fakeValue[java.util.Optional[String]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ReviewerController",
      "searchReviewerByCondition",
      Seq(classOf[java.util.Optional[Integer]], classOf[java.util.Optional[Integer]], classOf[java.util.Optional[String]]),
      "POST",
      this.prefix + """reviewer/search/conditions""",
      """""",
      Seq()
    )
  )

  // @LINE:419
  private[this] lazy val controllers_PaperController_addPaper193_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paper/addPaper")))
  )
  private[this] lazy val controllers_PaperController_addPaper193_invoker = createInvoker(
    PaperController_17.addPaper(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaperController",
      "addPaper",
      Nil,
      "POST",
      this.prefix + """paper/addPaper""",
      """""",
      Seq()
    )
  )

  // @LINE:420
  private[this] lazy val controllers_PaperController_paperList194_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paper/paperList")))
  )
  private[this] lazy val controllers_PaperController_paperList194_invoker = createInvoker(
    PaperController_17.paperList(fakeValue[java.util.Optional[Integer]], fakeValue[java.util.Optional[Integer]], fakeValue[java.util.Optional[String]]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaperController",
      "paperList",
      Seq(classOf[java.util.Optional[Integer]], classOf[java.util.Optional[Integer]], classOf[java.util.Optional[String]]),
      "GET",
      this.prefix + """paper/paperList""",
      """""",
      Seq()
    )
  )

  // @LINE:421
  private[this] lazy val controllers_PaperController_getAuthorByPaperId195_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paper/author")))
  )
  private[this] lazy val controllers_PaperController_getAuthorByPaperId195_invoker = createInvoker(
    PaperController_17.getAuthorByPaperId(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaperController",
      "getAuthorByPaperId",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """paper/author""",
      """""",
      Seq()
    )
  )

  // @LINE:422
  private[this] lazy val controllers_PaperController_deletePaper196_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paper/deletePaper")))
  )
  private[this] lazy val controllers_PaperController_deletePaper196_invoker = createInvoker(
    PaperController_17.deletePaper(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaperController",
      "deletePaper",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """paper/deletePaper""",
      """""",
      Seq()
    )
  )

  // @LINE:424
  private[this] lazy val controllers_PaperController_getPaperById197_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paper/paperDetail/"), DynamicPart("paperId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PaperController_getPaperById197_invoker = createInvoker(
    PaperController_17.getPaperById(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaperController",
      "getPaperById",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """paper/paperDetail/""" + "$" + """paperId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:425
  private[this] lazy val controllers_PaperController_addAuthor198_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paper/addAuthor/"), DynamicPart("paperId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PaperController_addAuthor198_invoker = createInvoker(
    PaperController_17.addAuthor(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaperController",
      "addAuthor",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """paper/addAuthor/""" + "$" + """paperId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:426
  private[this] lazy val controllers_PaperController_deleteAuthor199_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paper/deleteAuthor")))
  )
  private[this] lazy val controllers_PaperController_deleteAuthor199_invoker = createInvoker(
    PaperController_17.deleteAuthor(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaperController",
      "deleteAuthor",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """paper/deleteAuthor""",
      """""",
      Seq()
    )
  )

  // @LINE:429
  private[this] lazy val controllers_GraphController_printPrimeConnections200_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("graph/primePOC")))
  )
  private[this] lazy val controllers_GraphController_printPrimeConnections200_invoker = createInvoker(
    GraphController_15.printPrimeConnections(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GraphController",
      "printPrimeConnections",
      Nil,
      "GET",
      this.prefix + """graph/primePOC""",
      """################################# Paper #############################################################################""",
      Seq()
    )
  )

  // @LINE:430
  private[this] lazy val controllers_PaperController_paperAuthorList201_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paper/paperAuthorList")))
  )
  private[this] lazy val controllers_PaperController_paperAuthorList201_invoker = createInvoker(
    PaperController_17.paperAuthorList(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaperController",
      "paperAuthorList",
      Nil,
      "GET",
      this.prefix + """paper/paperAuthorList""",
      """""",
      Seq()
    )
  )

  // @LINE:431
  private[this] lazy val controllers_PaperController_storeDBLP202_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paper/loadPaper")))
  )
  private[this] lazy val controllers_PaperController_storeDBLP202_invoker = createInvoker(
    PaperController_17.storeDBLP(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaperController",
      "storeDBLP",
      Nil,
      "POST",
      this.prefix + """paper/loadPaper""",
      """""",
      Seq()
    )
  )

  // @LINE:432
  private[this] lazy val controllers_PaperController_loadLDA203_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paper/lda")))
  )
  private[this] lazy val controllers_PaperController_loadLDA203_invoker = createInvoker(
    PaperController_17.loadLDA(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaperController",
      "loadLDA",
      Nil,
      "GET",
      this.prefix + """paper/lda""",
      """""",
      Seq()
    )
  )

  // @LINE:433
  private[this] lazy val controllers_PaperController_authorRelation204_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paper/authorRelation")))
  )
  private[this] lazy val controllers_PaperController_authorRelation204_invoker = createInvoker(
    PaperController_17.authorRelation(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaperController",
      "authorRelation",
      Nil,
      "GET",
      this.prefix + """paper/authorRelation""",
      """""",
      Seq()
    )
  )

  // @LINE:434
  private[this] lazy val controllers_PaperController_storeDBLPSchema205_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paper/loadSchema")))
  )
  private[this] lazy val controllers_PaperController_storeDBLPSchema205_invoker = createInvoker(
    PaperController_17.storeDBLPSchema(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaperController",
      "storeDBLPSchema",
      Nil,
      "POST",
      this.prefix + """paper/loadSchema""",
      """""",
      Seq()
    )
  )

  // @LINE:435
  private[this] lazy val controllers_PaperController_ldaTopicDistribution206_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paper/ldaTopicList")))
  )
  private[this] lazy val controllers_PaperController_ldaTopicDistribution206_invoker = createInvoker(
    PaperController_17.ldaTopicDistribution(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaperController",
      "ldaTopicDistribution",
      Nil,
      "GET",
      this.prefix + """paper/ldaTopicList""",
      """""",
      Seq()
    )
  )

  // @LINE:436
  private[this] lazy val controllers_PaperController_paperSearchList207_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paper/search")))
  )
  private[this] lazy val controllers_PaperController_paperSearchList207_invoker = createInvoker(
    PaperController_17.paperSearchList(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PaperController",
      "paperSearchList",
      Nil,
      "POST",
      this.prefix + """paper/search""",
      """""",
      Seq()
    )
  )

  // @LINE:440
  private[this] lazy val controllers_LogController_operationLogging208_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("log/loggingOperation")))
  )
  private[this] lazy val controllers_LogController_operationLogging208_invoker = createInvoker(
    LogController_7.operationLogging(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LogController",
      "operationLogging",
      Nil,
      "POST",
      this.prefix + """log/loggingOperation""",
      """################################# Log #############################################################################""",
      Seq()
    )
  )

  // @LINE:443
  private[this] lazy val controllers_FileController_getFile209_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("file/"), DynamicPart("tableName", """[^/]+""",true), StaticPart("/"), DynamicPart("fileType", """[^/]+""",true), StaticPart("/"), DynamicPart("tableRecorderId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FileController_getFile209_invoker = createInvoker(
    FileController_25.getFile(fakeValue[String], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FileController",
      "getFile",
      Seq(classOf[String], classOf[String], classOf[String]),
      "GET",
      this.prefix + """file/""" + "$" + """tableName<[^/]+>/""" + "$" + """fileType<[^/]+>/""" + "$" + """tableRecorderId<[^/]+>""",
      """################################ File #############################################################################""",
      Seq()
    )
  )

  // @LINE:444
  private[this] lazy val controllers_FileController_checkFile210_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("file/checkFile/"), DynamicPart("tableName", """[^/]+""",true), StaticPart("/"), DynamicPart("fileType", """[^/]+""",true), StaticPart("/"), DynamicPart("tableRecorderId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FileController_checkFile210_invoker = createInvoker(
    FileController_25.checkFile(fakeValue[String], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FileController",
      "checkFile",
      Seq(classOf[String], classOf[String], classOf[String]),
      "GET",
      this.prefix + """file/checkFile/""" + "$" + """tableName<[^/]+>/""" + "$" + """fileType<[^/]+>/""" + "$" + """tableRecorderId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:445
  private[this] lazy val controllers_TechnologyController_setFiles211_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technology/setFiles/"), DynamicPart("serviceId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TechnologyController_setFiles211_invoker = createInvoker(
    TechnologyController_10.setFiles(fakeValue[Long], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TechnologyController",
      "setFiles",
      Seq(classOf[Long], classOf[String], classOf[String]),
      "POST",
      this.prefix + """technology/setFiles/""" + "$" + """serviceId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:446
  private[this] lazy val controllers_TechnologyController_getFileById212_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("technology/fileDetail/"), DynamicPart("serviceId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TechnologyController_getFileById212_invoker = createInvoker(
    TechnologyController_10.getFileById(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TechnologyController",
      "getFileById",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """technology/fileDetail/""" + "$" + """serviceId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:447
  private[this] lazy val controllers_FileController_uploadRawFile213_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("file/upload/"), DynamicPart("tableName", """[^/]+""",true), StaticPart("/"), DynamicPart("fileType", """[^/]+""",true), StaticPart("/"), DynamicPart("recordId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FileController_uploadRawFile213_invoker = createInvoker(
    FileController_25.uploadRawFile(fakeValue[String], fakeValue[String], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FileController",
      "uploadRawFile",
      Seq(classOf[String], classOf[String], classOf[Long]),
      "POST",
      this.prefix + """file/upload/""" + "$" + """tableName<[^/]+>/""" + "$" + """fileType<[^/]+>/""" + "$" + """recordId<[^/]+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:40
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_5.index)
      }
  
    // @LINE:50
    case controllers_CountController_count1_route(params@_) =>
      call { 
        controllers_CountController_count1_invoker.call(CountController_4.count)
      }
  
    // @LINE:60
    case controllers_AsyncController_message2_route(params@_) =>
      call { 
        controllers_AsyncController_message2_invoker.call(AsyncController_8.message)
      }
  
    // @LINE:63
    case controllers_Assets_versioned3_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned3_invoker.call(Assets_23.versioned(path, file))
      }
  
    // @LINE:72
    case controllers_ProjectController_addProject4_route(params@_) =>
      call { 
        controllers_ProjectController_addProject4_invoker.call(ProjectController_16.addProject())
      }
  
    // @LINE:73
    case controllers_ProjectController_updateProject5_route(params@_) =>
      call(params.fromPath[Long]("projectId", None)) { (projectId) =>
        controllers_ProjectController_updateProject5_invoker.call(ProjectController_16.updateProject(projectId))
      }
  
    // @LINE:74
    case controllers_ProjectController_deleteProjectImage6_route(params@_) =>
      call(params.fromPath[Long]("projectId", None)) { (projectId) =>
        controllers_ProjectController_deleteProjectImage6_invoker.call(ProjectController_16.deleteProjectImage(projectId))
      }
  
    // @LINE:75
    case controllers_ProjectController_deleteProjectPDF7_route(params@_) =>
      call(params.fromPath[Long]("projectId", None)) { (projectId) =>
        controllers_ProjectController_deleteProjectPDF7_invoker.call(ProjectController_16.deleteProjectPDF(projectId))
      }
  
    // @LINE:76
    case controllers_ProjectController_projectList8_route(params@_) =>
      call(params.fromPath[Long]("userId", None), params.fromQuery[Integer]("pageLimit", None), params.fromQuery[Integer]("pageNum", None), params.fromQuery[java.util.Optional[String]]("sortCriteria", None)) { (userId, pageLimit, pageNum, sortCriteria) =>
        controllers_ProjectController_projectList8_invoker.call(ProjectController_16.projectList(userId, pageLimit, pageNum, sortCriteria))
      }
  
    // @LINE:77
    case controllers_ProjectController_getTeamMembersByProjectId9_route(params@_) =>
      call(params.fromPath[Long]("projectId", None)) { (projectId) =>
        controllers_ProjectController_getTeamMembersByProjectId9_invoker.call(ProjectController_16.getTeamMembersByProjectId(projectId))
      }
  
    // @LINE:79
    case controllers_ProjectController_getProjectById10_route(params@_) =>
      call(params.fromPath[Long]("projectId", None)) { (projectId) =>
        controllers_ProjectController_getProjectById10_invoker.call(ProjectController_16.getProjectById(projectId))
      }
  
    // @LINE:80
    case controllers_ProjectController_getProjectCreator11_route(params@_) =>
      call(params.fromPath[Long]("projectId", None)) { (projectId) =>
        controllers_ProjectController_getProjectCreator11_invoker.call(ProjectController_16.getProjectCreator(projectId))
      }
  
    // @LINE:81
    case controllers_ProjectController_searchProjectsByCondition12_route(params@_) =>
      call { 
        controllers_ProjectController_searchProjectsByCondition12_invoker.call(ProjectController_16.searchProjectsByCondition())
      }
  
    // @LINE:82
    case controllers_ProjectController_setImage13_route(params@_) =>
      call(params.fromPath[Long]("projectId", None)) { (projectId) =>
        controllers_ProjectController_setImage13_invoker.call(ProjectController_16.setImage(projectId))
      }
  
    // @LINE:83
    case controllers_ProjectController_setPDF14_route(params@_) =>
      call(params.fromPath[Long]("projectId", None)) { (projectId) =>
        controllers_ProjectController_setPDF14_invoker.call(ProjectController_16.setPDF(projectId))
      }
  
    // @LINE:84
    case controllers_ProjectController_addTeamMember15_route(params@_) =>
      call(params.fromPath[Long]("projectId", None)) { (projectId) =>
        controllers_ProjectController_addTeamMember15_invoker.call(ProjectController_16.addTeamMember(projectId))
      }
  
    // @LINE:85
    case controllers_ProjectController_setTeamMemberPhoto16_route(params@_) =>
      call(params.fromPath[Long]("memberId", None)) { (memberId) =>
        controllers_ProjectController_setTeamMemberPhoto16_invoker.call(ProjectController_16.setTeamMemberPhoto(memberId))
      }
  
    // @LINE:86
    case controllers_ProjectController_deleteTeamMember17_route(params@_) =>
      call(params.fromPath[Long]("memberId", None)) { (memberId) =>
        controllers_ProjectController_deleteTeamMember17_invoker.call(ProjectController_16.deleteTeamMember(memberId))
      }
  
    // @LINE:87
    case controllers_ProjectController_deleteProject18_route(params@_) =>
      call(params.fromPath[Long]("projectId", None)) { (projectId) =>
        controllers_ProjectController_deleteProject18_invoker.call(ProjectController_16.deleteProject(projectId))
      }
  
    // @LINE:88
    case controllers_ProjectController_getProjectsByCreator19_route(params@_) =>
      call(params.fromPath[Long]("userId", None)) { (userId) =>
        controllers_ProjectController_getProjectsByCreator19_invoker.call(ProjectController_16.getProjectsByCreator(userId))
      }
  
    // @LINE:89
    case controllers_ProjectController_checkProjectExist20_route(params@_) =>
      call(params.fromPath[Long]("projectId", None)) { (projectId) =>
        controllers_ProjectController_checkProjectExist20_invoker.call(ProjectController_16.checkProjectExist(projectId))
      }
  
    // @LINE:90
    case controllers_ProjectController_checkProjectNameAvailability21_route(params@_) =>
      call { 
        controllers_ProjectController_checkProjectNameAvailability21_invoker.call(ProjectController_16.checkProjectNameAvailability())
      }
  
    // @LINE:91
    case controllers_ProjectController_saveDescriptionImage22_route(params@_) =>
      call(params.fromPath[Long]("projectId", None), params.fromPath[Integer]("imageNumber", None)) { (projectId, imageNumber) =>
        controllers_ProjectController_saveDescriptionImage22_invoker.call(ProjectController_16.saveDescriptionImage(projectId, imageNumber))
      }
  
    // @LINE:92
    case controllers_ProjectController_renameDescriptionImage23_route(params@_) =>
      call(params.fromPath[Long]("projectId", None), params.fromPath[Integer]("imageNumber", None), params.fromPath[Integer]("currentImageNumber", None)) { (projectId, imageNumber, currentImageNumber) =>
        controllers_ProjectController_renameDescriptionImage23_invoker.call(ProjectController_16.renameDescriptionImage(projectId, imageNumber, currentImageNumber))
      }
  
    // @LINE:94
    case controllers_ProjectController_getMyEnrolledProjects24_route(params@_) =>
      call(params.fromQuery[Integer]("pageLimit", None), params.fromQuery[Integer]("pageNum", None), params.fromQuery[java.util.Optional[String]]("sortCriteria", None), params.fromQuery[Long]("userId", None)) { (pageLimit, pageNum, sortCriteria, userId) =>
        controllers_ProjectController_getMyEnrolledProjects24_invoker.call(ProjectController_16.getMyEnrolledProjects(pageLimit, pageNum, sortCriteria, userId))
      }
  
    // @LINE:96
    case controllers_ProjectController_getAllProject25_route(params@_) =>
      call { 
        controllers_ProjectController_getAllProject25_invoker.call(ProjectController_21.get.getAllProject())
      }
  
    // @LINE:97
    case controllers_ProjectController_updateProjectDes26_route(params@_) =>
      call { 
        controllers_ProjectController_updateProjectDes26_invoker.call(ProjectController_21.get.updateProjectDes())
      }
  
    // @LINE:99
    case controllers_ProjectController_getIdByName27_route(params@_) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_ProjectController_getIdByName27_invoker.call(ProjectController_16.getIdByName(name))
      }
  
    // @LINE:104
    case controllers_ChallengeController_addChallenge28_route(params@_) =>
      call { 
        controllers_ChallengeController_addChallenge28_invoker.call(ChallengeController_19.addChallenge())
      }
  
    // @LINE:105
    case controllers_ChallengeController_updateChallenge29_route(params@_) =>
      call(params.fromPath[Long]("challengeId", None)) { (challengeId) =>
        controllers_ChallengeController_updateChallenge29_invoker.call(ChallengeController_19.updateChallenge(challengeId))
      }
  
    // @LINE:106
    case controllers_ChallengeController_updateChallengeAdmin30_route(params@_) =>
      call(params.fromPath[Long]("challengeId", None)) { (challengeId) =>
        controllers_ChallengeController_updateChallengeAdmin30_invoker.call(ChallengeController_19.updateChallengeAdmin(challengeId))
      }
  
    // @LINE:109
    case controllers_ChallengeController_challengeList31_route(params@_) =>
      call(params.fromPath[Long]("userId", None), params.fromQuery[Integer]("pageLimit", None), params.fromQuery[Integer]("pageNum", None), params.fromQuery[java.util.Optional[String]]("sortCriteria", None)) { (userId, pageLimit, pageNum, sortCriteria) =>
        controllers_ChallengeController_challengeList31_invoker.call(ChallengeController_19.challengeList(userId, pageLimit, pageNum, sortCriteria))
      }
  
    // @LINE:110
    case controllers_ChallengeController_challengeListAdmin32_route(params@_) =>
      call(params.fromPath[Long]("userId", None), params.fromQuery[Integer]("pageLimit", None), params.fromQuery[Integer]("pageNum", None), params.fromQuery[java.util.Optional[String]]("sortCriteria", None)) { (userId, pageLimit, pageNum, sortCriteria) =>
        controllers_ChallengeController_challengeListAdmin32_invoker.call(ChallengeController_19.challengeListAdmin(userId, pageLimit, pageNum, sortCriteria))
      }
  
    // @LINE:112
    case controllers_ChallengeController_applyChallenge33_route(params@_) =>
      call(params.fromPath[Long]("challengeId", None)) { (challengeId) =>
        controllers_ChallengeController_applyChallenge33_invoker.call(ChallengeController_19.applyChallenge(challengeId))
      }
  
    // @LINE:113
    case controllers_ChallengeController_getChallengeById34_route(params@_) =>
      call(params.fromPath[Long]("challengeId", None)) { (challengeId) =>
        controllers_ChallengeController_getChallengeById34_invoker.call(ChallengeController_19.getChallengeById(challengeId))
      }
  
    // @LINE:114
    case controllers_ChallengeController_getChallengesByPublisher35_route(params@_) =>
      call(params.fromPath[Long]("userId", None)) { (userId) =>
        controllers_ChallengeController_getChallengesByPublisher35_invoker.call(ChallengeController_19.getChallengesByPublisher(userId))
      }
  
    // @LINE:115
    case controllers_ChallengeController_getChallengeApplicationById36_route(params@_) =>
      call(params.fromPath[Long]("challengeApplicationId", None)) { (challengeApplicationId) =>
        controllers_ChallengeController_getChallengeApplicationById36_invoker.call(ChallengeController_19.getChallengeApplicationById(challengeApplicationId))
      }
  
    // @LINE:116
    case controllers_ChallengeController_getChallengeApplicationIdById37_route(params@_) =>
      call(params.fromPath[Long]("challengeApplicationId", None)) { (challengeApplicationId) =>
        controllers_ChallengeController_getChallengeApplicationIdById37_invoker.call(ChallengeController_19.getChallengeApplicationIdById(challengeApplicationId))
      }
  
    // @LINE:117
    case controllers_ChallengeController_giveChallengeOffertoStudent38_route(params@_) =>
      call(params.fromPath[Long]("challengeApplicationId", None)) { (challengeApplicationId) =>
        controllers_ChallengeController_giveChallengeOffertoStudent38_invoker.call(ChallengeController_19.giveChallengeOffertoStudent(challengeApplicationId))
      }
  
    // @LINE:119
    case controllers_ChallengeController_challengeUpdateStatus39_route(params@_) =>
      call(params.fromPath[Long]("challengeId", None)) { (challengeId) =>
        controllers_ChallengeController_challengeUpdateStatus39_invoker.call(ChallengeController_19.challengeUpdateStatus(challengeId))
      }
  
    // @LINE:120
    case controllers_ChallengeController_getApplicationsByChallengeId40_route(params@_) =>
      call(params.fromPath[String]("challengeType", None), params.fromPath[Long]("challengeId", None), params.fromQuery[Integer]("pageLimit", None), params.fromQuery[Integer]("pageNum", None), params.fromQuery[java.util.Optional[String]]("sortCriteria", None)) { (challengeType, challengeId, pageLimit, pageNum, sortCriteria) =>
        controllers_ChallengeController_getApplicationsByChallengeId40_invoker.call(ChallengeController_19.getApplicationsByChallengeId(challengeType, challengeId, pageLimit, pageNum, sortCriteria))
      }
  
    // @LINE:121
    case controllers_ChallengeController_setImage41_route(params@_) =>
      call(params.fromPath[Long]("challengeId", None)) { (challengeId) =>
        controllers_ChallengeController_setImage41_invoker.call(ChallengeController_19.setImage(challengeId))
      }
  
    // @LINE:122
    case controllers_ChallengeController_getImage42_route(params@_) =>
      call(params.fromPath[Long]("challengeId", None)) { (challengeId) =>
        controllers_ChallengeController_getImage42_invoker.call(ChallengeController_19.getImage(challengeId))
      }
  
    // @LINE:123
    case controllers_ChallengeController_setPdf43_route(params@_) =>
      call(params.fromPath[Long]("challengeId", None)) { (challengeId) =>
        controllers_ChallengeController_setPdf43_invoker.call(ChallengeController_19.setPdf(challengeId))
      }
  
    // @LINE:124
    case controllers_ChallengeController_searchChallenges44_route(params@_) =>
      call(params.fromQuery[Integer]("pageLimit", None), params.fromQuery[Integer]("pageNum", None), params.fromQuery[java.util.Optional[String]]("sortCriteria", None)) { (pageLimit, pageNum, sortCriteria) =>
        controllers_ChallengeController_searchChallenges44_invoker.call(ChallengeController_19.searchChallenges(pageLimit, pageNum, sortCriteria))
      }
  
    // @LINE:125
    case controllers_ChallengeController_closeChallenge45_route(params@_) =>
      call(params.fromPath[Long]("challengeId", None)) { (challengeId) =>
        controllers_ChallengeController_closeChallenge45_invoker.call(ChallengeController_19.closeChallenge(challengeId))
      }
  
    // @LINE:126
    case controllers_ChallengeController_getChallengesByApplicant46_route(params@_) =>
      call(params.fromPath[Long]("userId", None)) { (userId) =>
        controllers_ChallengeController_getChallengesByApplicant46_invoker.call(ChallengeController_19.getChallengesByApplicant(userId))
      }
  
    // @LINE:154
    case controllers_JobController_addJob47_route(params@_) =>
      call { 
        controllers_JobController_addJob47_invoker.call(JobController_13.addJob())
      }
  
    // @LINE:155
    case controllers_JobController_updateJob48_route(params@_) =>
      call(params.fromPath[Long]("jobId", None)) { (jobId) =>
        controllers_JobController_updateJob48_invoker.call(JobController_13.updateJob(jobId))
      }
  
    // @LINE:156
    case controllers_JobController_deleteJobImage49_route(params@_) =>
      call(params.fromPath[Long]("jobId", None)) { (jobId) =>
        controllers_JobController_deleteJobImage49_invoker.call(JobController_13.deleteJobImage(jobId))
      }
  
    // @LINE:157
    case controllers_JobController_deleteJobPDF50_route(params@_) =>
      call(params.fromPath[Long]("jobId", None)) { (jobId) =>
        controllers_JobController_deleteJobPDF50_invoker.call(JobController_13.deleteJobPDF(jobId))
      }
  
    // @LINE:158
    case controllers_JobController_jobList51_route(params@_) =>
      call(params.fromPath[Long]("userId", None), params.fromQuery[Integer]("pageLimit", None), params.fromQuery[Integer]("pageNum", None), params.fromQuery[java.util.Optional[String]]("sortCriteria", None)) { (userId, pageLimit, pageNum, sortCriteria) =>
        controllers_JobController_jobList51_invoker.call(JobController_13.jobList(userId, pageLimit, pageNum, sortCriteria))
      }
  
    // @LINE:159
    case controllers_JobController_applyJob52_route(params@_) =>
      call(params.fromPath[Long]("jobId", None)) { (jobId) =>
        controllers_JobController_applyJob52_invoker.call(JobController_13.applyJob(jobId))
      }
  
    // @LINE:160
    case controllers_JobController_jobUpdateStatue53_route(params@_) =>
      call(params.fromPath[Long]("jobId", None)) { (jobId) =>
        controllers_JobController_jobUpdateStatue53_invoker.call(JobController_13.jobUpdateStatue(jobId))
      }
  
    // @LINE:161
    case controllers_JobController_getJobApplicationById54_route(params@_) =>
      call(params.fromPath[Long]("jobApplicationId", None)) { (jobApplicationId) =>
        controllers_JobController_getJobApplicationById54_invoker.call(JobController_13.getJobApplicationById(jobApplicationId))
      }
  
    // @LINE:163
    case controllers_JobController_getJobById55_route(params@_) =>
      call(params.fromPath[Long]("jobId", None)) { (jobId) =>
        controllers_JobController_getJobById55_invoker.call(JobController_13.getJobById(jobId))
      }
  
    // @LINE:164
    case controllers_JobController_getJobPublisher56_route(params@_) =>
      call(params.fromPath[Long]("jobId", None)) { (jobId) =>
        controllers_JobController_getJobPublisher56_invoker.call(JobController_13.getJobPublisher(jobId))
      }
  
    // @LINE:165
    case controllers_JobController_searchJobsByCondition57_route(params@_) =>
      call { 
        controllers_JobController_searchJobsByCondition57_invoker.call(JobController_13.searchJobsByCondition())
      }
  
    // @LINE:166
    case controllers_JobController_setImage58_route(params@_) =>
      call(params.fromPath[Long]("jobId", None)) { (jobId) =>
        controllers_JobController_setImage58_invoker.call(JobController_13.setImage(jobId))
      }
  
    // @LINE:167
    case controllers_JobController_setPDF59_route(params@_) =>
      call(params.fromPath[Long]("jobId", None)) { (jobId) =>
        controllers_JobController_setPDF59_invoker.call(JobController_13.setPDF(jobId))
      }
  
    // @LINE:168
    case controllers_JobController_deleteJob60_route(params@_) =>
      call(params.fromPath[Long]("jobId", None)) { (jobId) =>
        controllers_JobController_deleteJob60_invoker.call(JobController_13.deleteJob(jobId))
      }
  
    // @LINE:169
    case controllers_JobController_getJobsByPublisher61_route(params@_) =>
      call(params.fromPath[Long]("userId", None)) { (userId) =>
        controllers_JobController_getJobsByPublisher61_invoker.call(JobController_13.getJobsByPublisher(userId))
      }
  
    // @LINE:170
    case controllers_JobController_getJobsByApplicant62_route(params@_) =>
      call(params.fromPath[Long]("userId", None)) { (userId) =>
        controllers_JobController_getJobsByApplicant62_invoker.call(JobController_13.getJobsByApplicant(userId))
      }
  
    // @LINE:171
    case controllers_JobController_checkJobExist63_route(params@_) =>
      call(params.fromPath[Long]("jobId", None)) { (jobId) =>
        controllers_JobController_checkJobExist63_invoker.call(JobController_13.checkJobExist(jobId))
      }
  
    // @LINE:172
    case controllers_JobController_checkJobNameAvailability64_route(params@_) =>
      call { 
        controllers_JobController_checkJobNameAvailability64_invoker.call(JobController_13.checkJobNameAvailability())
      }
  
    // @LINE:173
    case controllers_ProjectController_getIdByName65_route(params@_) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_ProjectController_getIdByName65_invoker.call(ProjectController_16.getIdByName(name))
      }
  
    // @LINE:174
    case controllers_JobController_getApplicationsByJobId66_route(params@_) =>
      call(params.fromPath[String]("jobType", None), params.fromPath[Long]("jobId", None), params.fromQuery[Integer]("pageLimit", None), params.fromQuery[Integer]("pageNum", None), params.fromQuery[java.util.Optional[String]]("sortCriteria", None)) { (jobType, jobId, pageLimit, pageNum, sortCriteria) =>
        controllers_JobController_getApplicationsByJobId66_invoker.call(JobController_13.getApplicationsByJobId(jobType, jobId, pageLimit, pageNum, sortCriteria))
      }
  
    // @LINE:180
    case controllers_RAJobController_addRAJob67_route(params@_) =>
      call { 
        controllers_RAJobController_addRAJob67_invoker.call(RAJobController_18.addRAJob())
      }
  
    // @LINE:181
    case controllers_RAJobController_updateRAJob68_route(params@_) =>
      call(params.fromPath[Long]("rajobId", None)) { (rajobId) =>
        controllers_RAJobController_updateRAJob68_invoker.call(RAJobController_18.updateRAJob(rajobId))
      }
  
    // @LINE:182
    case controllers_RAJobController_closeRAJob69_route(params@_) =>
      call(params.fromPath[Long]("rajobId", None)) { (rajobId) =>
        controllers_RAJobController_closeRAJob69_invoker.call(RAJobController_18.closeRAJob(rajobId))
      }
  
    // @LINE:183
    case controllers_RAJobController_deleteRAJobImage70_route(params@_) =>
      call(params.fromPath[Long]("rajobId", None)) { (rajobId) =>
        controllers_RAJobController_deleteRAJobImage70_invoker.call(RAJobController_18.deleteRAJobImage(rajobId))
      }
  
    // @LINE:184
    case controllers_RAJobController_deleteRAJobPDF71_route(params@_) =>
      call(params.fromPath[Long]("rajobId", None)) { (rajobId) =>
        controllers_RAJobController_deleteRAJobPDF71_invoker.call(RAJobController_18.deleteRAJobPDF(rajobId))
      }
  
    // @LINE:185
    case controllers_RAJobController_rajobList72_route(params@_) =>
      call(params.fromPath[Long]("userId", None), params.fromQuery[Integer]("pageLimit", None), params.fromQuery[Integer]("pageNum", None), params.fromQuery[java.util.Optional[String]]("sortCriteria", None)) { (userId, pageLimit, pageNum, sortCriteria) =>
        controllers_RAJobController_rajobList72_invoker.call(RAJobController_18.rajobList(userId, pageLimit, pageNum, sortCriteria))
      }
  
    // @LINE:186
    case controllers_RAJobController_applyRAJob73_route(params@_) =>
      call(params.fromPath[Long]("rajobId", None)) { (rajobId) =>
        controllers_RAJobController_applyRAJob73_invoker.call(RAJobController_18.applyRAJob(rajobId))
      }
  
    // @LINE:187
    case controllers_RAJobController_rajobUpdateStatue74_route(params@_) =>
      call(params.fromPath[Long]("rajobId", None)) { (rajobId) =>
        controllers_RAJobController_rajobUpdateStatue74_invoker.call(RAJobController_18.rajobUpdateStatue(rajobId))
      }
  
    // @LINE:188
    case controllers_RAJobController_giveRAJobOffertoStudent75_route(params@_) =>
      call(params.fromPath[Long]("rajobApplicationId", None)) { (rajobApplicationId) =>
        controllers_RAJobController_giveRAJobOffertoStudent75_invoker.call(RAJobController_18.giveRAJobOffertoStudent(rajobApplicationId))
      }
  
    // @LINE:189
    case controllers_RAJobController_getRAJobApplicationById76_route(params@_) =>
      call(params.fromPath[Long]("rajobApplicationId", None)) { (rajobApplicationId) =>
        controllers_RAJobController_getRAJobApplicationById76_invoker.call(RAJobController_18.getRAJobApplicationById(rajobApplicationId))
      }
  
    // @LINE:192
    case controllers_RAJobController_getRAJobById77_route(params@_) =>
      call(params.fromPath[Long]("rajobId", None)) { (rajobId) =>
        controllers_RAJobController_getRAJobById77_invoker.call(RAJobController_18.getRAJobById(rajobId))
      }
  
    // @LINE:193
    case controllers_RAJobController_getRAJobPublisher78_route(params@_) =>
      call(params.fromPath[Long]("rajobId", None)) { (rajobId) =>
        controllers_RAJobController_getRAJobPublisher78_invoker.call(RAJobController_18.getRAJobPublisher(rajobId))
      }
  
    // @LINE:194
    case controllers_RAJobController_searchRAJobsByCondition79_route(params@_) =>
      call { 
        controllers_RAJobController_searchRAJobsByCondition79_invoker.call(RAJobController_18.searchRAJobsByCondition())
      }
  
    // @LINE:195
    case controllers_RAJobController_setImage80_route(params@_) =>
      call(params.fromPath[Long]("rajobId", None)) { (rajobId) =>
        controllers_RAJobController_setImage80_invoker.call(RAJobController_18.setImage(rajobId))
      }
  
    // @LINE:196
    case controllers_RAJobController_setPDF81_route(params@_) =>
      call(params.fromPath[Long]("rajobId", None)) { (rajobId) =>
        controllers_RAJobController_setPDF81_invoker.call(RAJobController_18.setPDF(rajobId))
      }
  
    // @LINE:197
    case controllers_RAJobController_deleteRAJob82_route(params@_) =>
      call(params.fromPath[Long]("rajobId", None)) { (rajobId) =>
        controllers_RAJobController_deleteRAJob82_invoker.call(RAJobController_18.deleteRAJob(rajobId))
      }
  
    // @LINE:198
    case controllers_RAJobController_getRAJobsByPublisher83_route(params@_) =>
      call(params.fromPath[Long]("userId", None)) { (userId) =>
        controllers_RAJobController_getRAJobsByPublisher83_invoker.call(RAJobController_18.getRAJobsByPublisher(userId))
      }
  
    // @LINE:199
    case controllers_RAJobController_getRAJobsByApplicant84_route(params@_) =>
      call(params.fromPath[Long]("userId", None)) { (userId) =>
        controllers_RAJobController_getRAJobsByApplicant84_invoker.call(RAJobController_18.getRAJobsByApplicant(userId))
      }
  
    // @LINE:200
    case controllers_RAJobController_checkRAJobExist85_route(params@_) =>
      call(params.fromPath[Long]("rajobId", None)) { (rajobId) =>
        controllers_RAJobController_checkRAJobExist85_invoker.call(RAJobController_18.checkRAJobExist(rajobId))
      }
  
    // @LINE:201
    case controllers_RAJobController_checkRAJobNameAvailability86_route(params@_) =>
      call { 
        controllers_RAJobController_checkRAJobNameAvailability86_invoker.call(RAJobController_18.checkRAJobNameAvailability())
      }
  
    // @LINE:202
    case controllers_RAJobController_getIdByName87_route(params@_) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_RAJobController_getIdByName87_invoker.call(RAJobController_18.getIdByName(name))
      }
  
    // @LINE:203
    case controllers_RAJobController_sendOfferEmail88_route(params@_) =>
      call { 
        controllers_RAJobController_sendOfferEmail88_invoker.call(RAJobController_18.sendOfferEmail())
      }
  
    // @LINE:204
    case controllers_RAJobController_sendRAJobPostedEmail89_route(params@_) =>
      call { 
        controllers_RAJobController_sendRAJobPostedEmail89_invoker.call(RAJobController_18.sendRAJobPostedEmail())
      }
  
    // @LINE:205
    case controllers_RAJobController_sendRAJobAppliedEmail90_route(params@_) =>
      call { 
        controllers_RAJobController_sendRAJobAppliedEmail90_invoker.call(RAJobController_18.sendRAJobAppliedEmail())
      }
  
    // @LINE:206
    case controllers_RAJobController_listProfessorsJson91_route(params@_) =>
      call { 
        controllers_RAJobController_listProfessorsJson91_invoker.call(RAJobController_18.listProfessorsJson())
      }
  
    // @LINE:211
    case controllers_TAJobController_addTAJob92_route(params@_) =>
      call { 
        controllers_TAJobController_addTAJob92_invoker.call(TAJobController_12.addTAJob())
      }
  
    // @LINE:212
    case controllers_TAJobController_updateTAJob93_route(params@_) =>
      call(params.fromPath[Long]("tajobId", None)) { (tajobId) =>
        controllers_TAJobController_updateTAJob93_invoker.call(TAJobController_12.updateTAJob(tajobId))
      }
  
    // @LINE:213
    case controllers_TAJobController_deleteTAJobImage94_route(params@_) =>
      call(params.fromPath[Long]("tajobId", None)) { (tajobId) =>
        controllers_TAJobController_deleteTAJobImage94_invoker.call(TAJobController_12.deleteTAJobImage(tajobId))
      }
  
    // @LINE:214
    case controllers_TAJobController_deleteTAJobPDF95_route(params@_) =>
      call(params.fromPath[Long]("tajobId", None)) { (tajobId) =>
        controllers_TAJobController_deleteTAJobPDF95_invoker.call(TAJobController_12.deleteTAJobPDF(tajobId))
      }
  
    // @LINE:215
    case controllers_TAJobController_tajobList96_route(params@_) =>
      call(params.fromPath[Long]("userId", None), params.fromQuery[Integer]("pageLimit", None), params.fromQuery[Integer]("pageNum", None), params.fromQuery[java.util.Optional[String]]("sortCriteria", None)) { (userId, pageLimit, pageNum, sortCriteria) =>
        controllers_TAJobController_tajobList96_invoker.call(TAJobController_12.tajobList(userId, pageLimit, pageNum, sortCriteria))
      }
  
    // @LINE:216
    case controllers_TAJobController_applyTAJob97_route(params@_) =>
      call(params.fromPath[Long]("tajobId", None)) { (tajobId) =>
        controllers_TAJobController_applyTAJob97_invoker.call(TAJobController_12.applyTAJob(tajobId))
      }
  
    // @LINE:217
    case controllers_TAJobController_tajobUpdateStatue98_route(params@_) =>
      call(params.fromPath[Long]("tajobId", None)) { (tajobId) =>
        controllers_TAJobController_tajobUpdateStatue98_invoker.call(TAJobController_12.tajobUpdateStatue(tajobId))
      }
  
    // @LINE:218
    case controllers_TAJobController_getTAJobApplicationById99_route(params@_) =>
      call(params.fromPath[Long]("tajobApplicationId", None)) { (tajobApplicationId) =>
        controllers_TAJobController_getTAJobApplicationById99_invoker.call(TAJobController_12.getTAJobApplicationById(tajobApplicationId))
      }
  
    // @LINE:221
    case controllers_TAJobController_getTAJobById100_route(params@_) =>
      call(params.fromPath[Long]("tajobId", None)) { (tajobId) =>
        controllers_TAJobController_getTAJobById100_invoker.call(TAJobController_12.getTAJobById(tajobId))
      }
  
    // @LINE:222
    case controllers_TAJobController_getTAJobPublisher101_route(params@_) =>
      call(params.fromPath[Long]("tajobId", None)) { (tajobId) =>
        controllers_TAJobController_getTAJobPublisher101_invoker.call(TAJobController_12.getTAJobPublisher(tajobId))
      }
  
    // @LINE:223
    case controllers_TAJobController_searchTAJobsByCondition102_route(params@_) =>
      call { 
        controllers_TAJobController_searchTAJobsByCondition102_invoker.call(TAJobController_12.searchTAJobsByCondition())
      }
  
    // @LINE:224
    case controllers_TAJobController_setImage103_route(params@_) =>
      call(params.fromPath[Long]("tajobId", None)) { (tajobId) =>
        controllers_TAJobController_setImage103_invoker.call(TAJobController_12.setImage(tajobId))
      }
  
    // @LINE:225
    case controllers_TAJobController_setPDF104_route(params@_) =>
      call(params.fromPath[Long]("tajobId", None)) { (tajobId) =>
        controllers_TAJobController_setPDF104_invoker.call(TAJobController_12.setPDF(tajobId))
      }
  
    // @LINE:226
    case controllers_TAJobController_deleteTAJob105_route(params@_) =>
      call(params.fromPath[Long]("tajobId", None)) { (tajobId) =>
        controllers_TAJobController_deleteTAJob105_invoker.call(TAJobController_12.deleteTAJob(tajobId))
      }
  
    // @LINE:227
    case controllers_TAJobController_getTAJobsByPublisher106_route(params@_) =>
      call(params.fromPath[Long]("userId", None)) { (userId) =>
        controllers_TAJobController_getTAJobsByPublisher106_invoker.call(TAJobController_12.getTAJobsByPublisher(userId))
      }
  
    // @LINE:228
    case controllers_TAJobController_checkTAJobExist107_route(params@_) =>
      call(params.fromPath[Long]("tajobId", None)) { (tajobId) =>
        controllers_TAJobController_checkTAJobExist107_invoker.call(TAJobController_12.checkTAJobExist(tajobId))
      }
  
    // @LINE:229
    case controllers_TAJobController_checkTAJobNameAvailability108_route(params@_) =>
      call { 
        controllers_TAJobController_checkTAJobNameAvailability108_invoker.call(TAJobController_12.checkTAJobNameAvailability())
      }
  
    // @LINE:230
    case controllers_TAJobController_getIdByName109_route(params@_) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_TAJobController_getIdByName109_invoker.call(TAJobController_12.getIdByName(name))
      }
  
    // @LINE:237
    case controllers_TACandidateController_addTACandidate110_route(params@_) =>
      call { 
        controllers_TACandidateController_addTACandidate110_invoker.call(TACandidateController_24.addTACandidate())
      }
  
    // @LINE:238
    case controllers_TACandidateController_tacandidateList111_route(params@_) =>
      call(params.fromPath[Long]("userId", None), params.fromQuery[Integer]("pageLimit", None), params.fromQuery[Integer]("pageNum", None), params.fromQuery[java.util.Optional[String]]("sortCriteria", None)) { (userId, pageLimit, pageNum, sortCriteria) =>
        controllers_TACandidateController_tacandidateList111_invoker.call(TACandidateController_24.tacandidateList(userId, pageLimit, pageNum, sortCriteria))
      }
  
    // @LINE:239
    case controllers_TACandidateController_getTACandidateById112_route(params@_) =>
      call(params.fromPath[Long]("Id", None)) { (Id) =>
        controllers_TACandidateController_getTACandidateById112_invoker.call(TACandidateController_24.getTACandidateById(Id))
      }
  
    // @LINE:240
    case controllers_TACandidateController_getAssignmentsByUserId113_route(params@_) =>
      call(params.fromPath[Long]("userId", None)) { (userId) =>
        controllers_TACandidateController_getAssignmentsByUserId113_invoker.call(TACandidateController_24.getAssignmentsByUserId(userId))
      }
  
    // @LINE:247
    case controllers_CourseController_listCourses114_route(params@_) =>
      call { 
        controllers_CourseController_listCourses114_invoker.call(CourseController_3.listCourses)
      }
  
    // @LINE:248
    case controllers_CourseController_getCourseDetails115_route(params@_) =>
      call(params.fromPath[Long]("courseId", None)) { (courseId) =>
        controllers_CourseController_getCourseDetails115_invoker.call(CourseController_3.getCourseDetails(courseId))
      }
  
    // @LINE:249
    case controllers_CourseController_approveTA116_route(params@_) =>
      call(params.fromPath[Long]("courseId", None), params.fromPath[Int]("week", None)) { (courseId, week) =>
        controllers_CourseController_approveTA116_invoker.call(CourseController_3.approveTA(courseId, week))
      }
  
    // @LINE:257
    case controllers_CourseTAAssignmentController_addAssignment117_route(params@_) =>
      call { 
        controllers_CourseTAAssignmentController_addAssignment117_invoker.call(CourseTAAssignmentController_9.addAssignment())
      }
  
    // @LINE:258
    case controllers_CourseTAAssignmentController_getCourseTAAssignmentById118_route(params@_) =>
      call(params.fromPath[Long]("Id", None)) { (Id) =>
        controllers_CourseTAAssignmentController_getCourseTAAssignmentById118_invoker.call(CourseTAAssignmentController_9.getCourseTAAssignmentById(Id))
      }
  
    // @LINE:259
    case controllers_CourseTAAssignmentController_courseTAAssignmentList119_route(params@_) =>
      call(params.fromPath[Long]("Id", None), params.fromQuery[Integer]("pageLimit", None), params.fromQuery[Integer]("pageNum", None), params.fromQuery[java.util.Optional[String]]("sortCriteria", None)) { (Id, pageLimit, pageNum, sortCriteria) =>
        controllers_CourseTAAssignmentController_courseTAAssignmentList119_invoker.call(CourseTAAssignmentController_9.courseTAAssignmentList(Id, pageLimit, pageNum, sortCriteria))
      }
  
    // @LINE:260
    case controllers_CourseTAAssignmentController_getCourseTAAssignmentById120_route(params@_) =>
      call(params.fromPath[Long]("Id", None)) { (Id) =>
        controllers_CourseTAAssignmentController_getCourseTAAssignmentById120_invoker.call(CourseTAAssignmentController_9.getCourseTAAssignmentById(Id))
      }
  
    // @LINE:266
    case controllers_UserController_addUser121_route(params@_) =>
      call { 
        controllers_UserController_addUser121_invoker.call(UserController_14.addUser)
      }
  
    // @LINE:267
    case controllers_UserController_userDetail122_route(params@_) =>
      call(params.fromPath[Long]("userId", None)) { (userId) =>
        controllers_UserController_userDetail122_invoker.call(UserController_14.userDetail(userId))
      }
  
    // @LINE:268
    case controllers_UserController_getResearcherInfo123_route(params@_) =>
      call(params.fromPath[Long]("userId", None)) { (userId) =>
        controllers_UserController_getResearcherInfo123_invoker.call(UserController_14.getResearcherInfo(userId))
      }
  
    // @LINE:269
    case controllers_UserController_getStudentInfo124_route(params@_) =>
      call(params.fromPath[Long]("userId", None)) { (userId) =>
        controllers_UserController_getStudentInfo124_invoker.call(UserController_14.getStudentInfo(userId))
      }
  
    // @LINE:270
    case controllers_UserController_updateUser125_route(params@_) =>
      call { 
        controllers_UserController_updateUser125_invoker.call(UserController_14.updateUser)
      }
  
    // @LINE:271
    case controllers_UserController_userLogin126_route(params@_) =>
      call { 
        controllers_UserController_userLogin126_invoker.call(UserController_14.userLogin)
      }
  
    // @LINE:272
    case controllers_UserController_checkNewUserEmailAvailability127_route(params@_) =>
      call { 
        controllers_UserController_checkNewUserEmailAvailability127_invoker.call(UserController_14.checkNewUserEmailAvailability)
      }
  
    // @LINE:273
    case controllers_UserController_userList128_route(params@_) =>
      call(params.fromQuery[java.util.Optional[Integer]]("pageLimit", None), params.fromQuery[java.util.Optional[Integer]]("offset", None), params.fromQuery[java.util.Optional[String]]("sortCriteria", None)) { (pageLimit, offset, sortCriteria) =>
        controllers_UserController_userList128_invoker.call(UserController_14.userList(pageLimit, offset, sortCriteria))
      }
  
    // @LINE:274
    case controllers_UserController_validateEmail129_route(params@_) =>
      call { 
        controllers_UserController_validateEmail129_invoker.call(UserController_14.validateEmail)
      }
  
    // @LINE:276
    case controllers_UserController_searchUserByCondition130_route(params@_) =>
      call(params.fromQuery[java.util.Optional[Integer]]("pageLimit", None), params.fromQuery[java.util.Optional[Integer]]("offset", None), params.fromQuery[java.util.Optional[String]]("sortCriteria", None)) { (pageLimit, offset, sortCriteria) =>
        controllers_UserController_searchUserByCondition130_invoker.call(UserController_14.searchUserByCondition(pageLimit, offset, sortCriteria))
      }
  
    // @LINE:277
    case controllers_UserController_inactivateUserPOST131_route(params@_) =>
      call { 
        controllers_UserController_inactivateUserPOST131_invoker.call(UserController_14.inactivateUserPOST)
      }
  
    // @LINE:281
    case controllers_UserController_autoRegisterUser132_route(params@_) =>
      call { 
        controllers_UserController_autoRegisterUser132_invoker.call(UserController_14.autoRegisterUser)
      }
  
    // @LINE:284
    case controllers_UserController_getAllUsersInAllRoles133_route(params@_) =>
      call { 
        controllers_UserController_getAllUsersInAllRoles133_invoker.call(UserController_14.getAllUsersInAllRoles)
      }
  
    // @LINE:285
    case controllers_UserController_getAllNormalUsers134_route(params@_) =>
      call { 
        controllers_UserController_getAllNormalUsers134_invoker.call(UserController_14.getAllNormalUsers)
      }
  
    // @LINE:286
    case controllers_UserController_updateImageByUserId135_route(params@_) =>
      call(params.fromPath[Long]("userId", None)) { (userId) =>
        controllers_UserController_updateImageByUserId135_invoker.call(UserController_14.updateImageByUserId(userId))
      }
  
    // @LINE:287
    case controllers_UserController_deleteImageByUserId136_route(params@_) =>
      call(params.fromPath[Long]("userId", None)) { (userId) =>
        controllers_UserController_deleteImageByUserId136_invoker.call(UserController_14.deleteImageByUserId(userId))
      }
  
    // @LINE:293
    case controllers_UserController_userSearch137_route(params@_) =>
      call(params.fromPath[String]("display_name", None)) { (display_name) =>
        controllers_UserController_userSearch137_invoker.call(UserController_14.userSearch(display_name))
      }
  
    // @LINE:295
    case controllers_UserController_getActiveUsers138_route(params@_) =>
      call(Param[String]("format", Right("json"))) { (format) =>
        controllers_UserController_getActiveUsers138_invoker.call(UserController_1.get.getActiveUsers(format))
      }
  
    // @LINE:296
    case controllers_UserController_sendPasswordEmail139_route(params@_) =>
      call { 
        controllers_UserController_sendPasswordEmail139_invoker.call(UserController_1.get.sendPasswordEmail)
      }
  
    // @LINE:297
    case controllers_UserController_updatePassword140_route(params@_) =>
      call { 
        controllers_UserController_updatePassword140_invoker.call(UserController_1.get.updatePassword)
      }
  
    // @LINE:298
    case controllers_UserController_userActivation141_route(params@_) =>
      call(params.fromPath[String]("hashcode", None)) { (hashcode) =>
        controllers_UserController_userActivation141_invoker.call(UserController_1.get.userActivation(hashcode))
      }
  
    // @LINE:299
    case controllers_UserController_sendRegisterEmail142_route(params@_) =>
      call { 
        controllers_UserController_sendRegisterEmail142_invoker.call(UserController_14.sendRegisterEmail())
      }
  
    // @LINE:300
    case controllers_UserController_resendRegisterEmail143_route(params@_) =>
      call { 
        controllers_UserController_resendRegisterEmail143_invoker.call(UserController_14.resendRegisterEmail())
      }
  
    // @LINE:302
    case controllers_UserController_updateLevel144_route(params@_) =>
      call(params.fromPath[Long]("uid", None)) { (uid) =>
        controllers_UserController_updateLevel144_invoker.call(UserController_1.get.updateLevel(uid))
      }
  
    // @LINE:303
    case controllers_UserController_getUserByEmail145_route(params@_) =>
      call { 
        controllers_UserController_getUserByEmail145_invoker.call(UserController_1.get.getUserByEmail)
      }
  
    // @LINE:307
    case controllers_OrganizationController_organizationList146_route(params@_) =>
      call { 
        controllers_OrganizationController_organizationList146_invoker.call(OrganizationController_20.organizationList())
      }
  
    // @LINE:308
    case controllers_OrganizationController_organizationListPage147_route(params@_) =>
      call(params.fromQuery[java.util.Optional[Integer]]("pageLimit", None), params.fromQuery[java.util.Optional[Integer]]("offset", None), params.fromQuery[java.util.Optional[String]]("sortCriteria", None)) { (pageLimit, offset, sortCriteria) =>
        controllers_OrganizationController_organizationListPage147_invoker.call(OrganizationController_20.organizationListPage(pageLimit, offset, sortCriteria))
      }
  
    // @LINE:309
    case controllers_OrganizationController_addUsers148_route(params@_) =>
      call { 
        controllers_OrganizationController_addUsers148_invoker.call(OrganizationController_20.addUsers())
      }
  
    // @LINE:310
    case controllers_OrganizationController_registerOrganization149_route(params@_) =>
      call { 
        controllers_OrganizationController_registerOrganization149_invoker.call(OrganizationController_20.registerOrganization())
      }
  
    // @LINE:311
    case controllers_OrganizationController_organizationDetail150_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_OrganizationController_organizationDetail150_invoker.call(OrganizationController_20.organizationDetail(id))
      }
  
    // @LINE:312
    case controllers_OrganizationController_organizationUpdate151_route(params@_) =>
      call { 
        controllers_OrganizationController_organizationUpdate151_invoker.call(OrganizationController_20.organizationUpdate())
      }
  
    // @LINE:313
    case controllers_OrganizationController_organizationListbyName152_route(params@_) =>
      call(params.fromQuery[java.util.Optional[Integer]]("pageLimit", None), params.fromQuery[java.util.Optional[Integer]]("offset", None), params.fromQuery[java.util.Optional[String]]("sortCriteria", None)) { (pageLimit, offset, sortCriteria) =>
        controllers_OrganizationController_organizationListbyName152_invoker.call(OrganizationController_20.organizationListbyName(pageLimit, offset, sortCriteria))
      }
  
    // @LINE:320
    case controllers_BugReportController_addBugReport153_route(params@_) =>
      call { 
        controllers_BugReportController_addBugReport153_invoker.call(BugReportController_2.get.addBugReport)
      }
  
    // @LINE:321
    case controllers_BugReportController_getBugReport154_route(params@_) =>
      call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_BugReportController_getBugReport154_invoker.call(BugReportController_2.get.getBugReport(id, format))
      }
  
    // @LINE:322
    case controllers_BugReportController_updateBugReport155_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_BugReportController_updateBugReport155_invoker.call(BugReportController_2.get.updateBugReport(id))
      }
  
    // @LINE:323
    case controllers_BugReportController_deleteBugReport156_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_BugReportController_deleteBugReport156_invoker.call(BugReportController_2.get.deleteBugReport(id))
      }
  
    // @LINE:324
    case controllers_BugReportController_updateBugReportSolved157_route(params@_) =>
      call(params.fromPath[Long]("bugId", None), params.fromPath[Long]("fixerId", None)) { (bugId, fixerId) =>
        controllers_BugReportController_updateBugReportSolved157_invoker.call(BugReportController_2.get.updateBugReportSolved(bugId, fixerId))
      }
  
    // @LINE:325
    case controllers_BugReportController_getAllBugReports158_route(params@_) =>
      call(params.fromQuery[java.util.Optional[Integer]]("pageLimit", None), params.fromQuery[java.util.Optional[Integer]]("offset", None), params.fromQuery[java.util.Optional[String]]("sortCriteria", None)) { (pageLimit, offset, sortCriteria) =>
        controllers_BugReportController_getAllBugReports158_invoker.call(BugReportController_2.get.getAllBugReports(pageLimit, offset, sortCriteria))
      }
  
    // @LINE:327
    case controllers_BugReportController_getAllUnsolvedBugReports159_route(params@_) =>
      call { 
        controllers_BugReportController_getAllUnsolvedBugReports159_invoker.call(BugReportController_2.get.getAllUnsolvedBugReports)
      }
  
    // @LINE:328
    case controllers_BugReportController_getAllSolvedBugReports160_route(params@_) =>
      call { 
        controllers_BugReportController_getAllSolvedBugReports160_invoker.call(BugReportController_2.get.getAllSolvedBugReports)
      }
  
    // @LINE:334
    case controllers_SuggestionController_addSuggestion161_route(params@_) =>
      call { 
        controllers_SuggestionController_addSuggestion161_invoker.call(SuggestionController_11.get.addSuggestion)
      }
  
    // @LINE:335
    case controllers_SuggestionController_getSuggestion162_route(params@_) =>
      call(params.fromPath[Long]("id", None), Param[String]("format", Right("json"))) { (id, format) =>
        controllers_SuggestionController_getSuggestion162_invoker.call(SuggestionController_11.get.getSuggestion(id, format))
      }
  
    // @LINE:336
    case controllers_SuggestionController_suggestionList163_route(params@_) =>
      call(params.fromQuery[java.util.Optional[Integer]]("pageLimit", None), params.fromQuery[java.util.Optional[Integer]]("offset", None), params.fromQuery[java.util.Optional[String]]("sortCriteria", None)) { (pageLimit, offset, sortCriteria) =>
        controllers_SuggestionController_suggestionList163_invoker.call(SuggestionController_11.get.suggestionList(pageLimit, offset, sortCriteria))
      }
  
    // @LINE:337
    case controllers_SuggestionController_updateSuggestion164_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_SuggestionController_updateSuggestion164_invoker.call(SuggestionController_11.get.updateSuggestion(id))
      }
  
    // @LINE:338
    case controllers_SuggestionController_deleteSuggestion165_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_SuggestionController_deleteSuggestion165_invoker.call(SuggestionController_11.get.deleteSuggestion(id))
      }
  
    // @LINE:339
    case controllers_SuggestionController_updateSuggestionSolved166_route(params@_) =>
      call(params.fromPath[Long]("suggestionId", None), params.fromPath[Long]("implementorId", None)) { (suggestionId, implementorId) =>
        controllers_SuggestionController_updateSuggestionSolved166_invoker.call(SuggestionController_11.get.updateSuggestionSolved(suggestionId, implementorId))
      }
  
    // @LINE:343
    case controllers_TechnologyController_addTechnology167_route(params@_) =>
      call { 
        controllers_TechnologyController_addTechnology167_invoker.call(TechnologyController_10.addTechnology())
      }
  
    // @LINE:344
    case controllers_TechnologyController_updateTechnology168_route(params@_) =>
      call(params.fromPath[Long]("technologyId", None)) { (technologyId) =>
        controllers_TechnologyController_updateTechnology168_invoker.call(TechnologyController_10.updateTechnology(technologyId))
      }
  
    // @LINE:347
    case controllers_TechnologyController_technologyList169_route(params@_) =>
      call(params.fromPath[Long]("userId", None), params.fromQuery[Integer]("pageLimit", None), params.fromQuery[Integer]("pageNum", None), params.fromQuery[java.util.Optional[String]]("sortCriteria", None)) { (userId, pageLimit, pageNum, sortCriteria) =>
        controllers_TechnologyController_technologyList169_invoker.call(TechnologyController_10.technologyList(userId, pageLimit, pageNum, sortCriteria))
      }
  
    // @LINE:350
    case controllers_TechnologyController_getTechnologyById170_route(params@_) =>
      call(params.fromPath[Long]("technologyId", None)) { (technologyId) =>
        controllers_TechnologyController_getTechnologyById170_invoker.call(TechnologyController_10.getTechnologyById(technologyId))
      }
  
    // @LINE:352
    case controllers_TechnologyController_searchTechnologiesByCondition171_route(params@_) =>
      call { 
        controllers_TechnologyController_searchTechnologiesByCondition171_invoker.call(TechnologyController_10.searchTechnologiesByCondition())
      }
  
    // @LINE:378
    case controllers_AdminController_getUserList172_route(params@_) =>
      call(params.fromQuery[Integer]("pageNum", Some(1)), params.fromQuery[Integer]("pageLimit", Some(20)), params.fromQuery[String]("sortCriteria", Some("id"))) { (pageNum, pageLimit, sortCriteria) =>
        controllers_AdminController_getUserList172_invoker.call(AdminController_0.getUserList(pageNum, pageLimit, sortCriteria))
      }
  
    // @LINE:379
    case controllers_AdminController_getUserDetail173_route(params@_) =>
      call(params.fromPath[Long]("userId", None)) { (userId) =>
        controllers_AdminController_getUserDetail173_invoker.call(AdminController_0.getUserDetail(userId))
      }
  
    // @LINE:380
    case controllers_AdminController_updateUserStatus174_route(params@_) =>
      call(params.fromPath[Long]("userId", None)) { (userId) =>
        controllers_AdminController_updateUserStatus174_invoker.call(AdminController_0.updateUserStatus(userId))
      }
  
    // @LINE:381
    case controllers_AdminController_getJobList175_route(params@_) =>
      call(params.fromQuery[Integer]("pageNum", Some(1)), params.fromQuery[Integer]("pageLimit", Some(20)), params.fromQuery[String]("sortCriteria", Some("id"))) { (pageNum, pageLimit, sortCriteria) =>
        controllers_AdminController_getJobList175_invoker.call(AdminController_0.getJobList(pageNum, pageLimit, sortCriteria))
      }
  
    // @LINE:382
    case controllers_AdminController_getJobDetail176_route(params@_) =>
      call(params.fromPath[String]("jobType", None), params.fromPath[Long]("jobId", None)) { (jobType, jobId) =>
        controllers_AdminController_getJobDetail176_invoker.call(AdminController_0.getJobDetail(jobType, jobId))
      }
  
    // @LINE:383
    case controllers_AdminController_getOrganizationList177_route(params@_) =>
      call(params.fromQuery[Integer]("pageNum", Some(1)), params.fromQuery[Integer]("pageLimit", Some(20)), params.fromQuery[String]("sortCriteria", Some("id"))) { (pageNum, pageLimit, sortCriteria) =>
        controllers_AdminController_getOrganizationList177_invoker.call(AdminController_0.getOrganizationList(pageNum, pageLimit, sortCriteria))
      }
  
    // @LINE:384
    case controllers_AdminController_getTechnologyList178_route(params@_) =>
      call(params.fromQuery[Integer]("pageNum", Some(1)), params.fromQuery[Integer]("pageLimit", Some(20)), params.fromQuery[String]("sortCriteria", Some("id"))) { (pageNum, pageLimit, sortCriteria) =>
        controllers_AdminController_getTechnologyList178_invoker.call(AdminController_0.getTechnologyList(pageNum, pageLimit, sortCriteria))
      }
  
    // @LINE:393
    case controllers_AuthorController_addAuthor179_route(params@_) =>
      call { 
        controllers_AuthorController_addAuthor179_invoker.call(AuthorController_6.addAuthor)
      }
  
    // @LINE:394
    case controllers_AuthorController_authorDetail180_route(params@_) =>
      call(params.fromPath[Long]("userId", None)) { (userId) =>
        controllers_AuthorController_authorDetail180_invoker.call(AuthorController_6.authorDetail(userId))
      }
  
    // @LINE:395
    case controllers_AuthorController_updateAuthor181_route(params@_) =>
      call { 
        controllers_AuthorController_updateAuthor181_invoker.call(AuthorController_6.updateAuthor)
      }
  
    // @LINE:396
    case controllers_AuthorController_authorList182_route(params@_) =>
      call(params.fromQuery[java.util.Optional[Integer]]("pageLimit", None), params.fromQuery[java.util.Optional[Integer]]("offset", None), params.fromQuery[java.util.Optional[String]]("sortCriteria", None)) { (pageLimit, offset, sortCriteria) =>
        controllers_AuthorController_authorList182_invoker.call(AuthorController_6.authorList(pageLimit, offset, sortCriteria))
      }
  
    // @LINE:398
    case controllers_AuthorController_userDetailAdmin183_route(params@_) =>
      call(params.fromPath[Long]("userId", None)) { (userId) =>
        controllers_AuthorController_userDetailAdmin183_invoker.call(AuthorController_6.userDetailAdmin(userId))
      }
  
    // @LINE:399
    case controllers_AuthorController_updateUserAdmin184_route(params@_) =>
      call { 
        controllers_AuthorController_updateUserAdmin184_invoker.call(AuthorController_6.updateUserAdmin)
      }
  
    // @LINE:400
    case controllers_AuthorController_userListAdmin185_route(params@_) =>
      call(params.fromQuery[java.util.Optional[Integer]]("pageLimit", None), params.fromQuery[java.util.Optional[Integer]]("offset", None), params.fromQuery[java.util.Optional[String]]("sortCriteria", None)) { (pageLimit, offset, sortCriteria) =>
        controllers_AuthorController_userListAdmin185_invoker.call(AuthorController_6.userListAdmin(pageLimit, offset, sortCriteria))
      }
  
    // @LINE:402
    case controllers_AuthorController_searchAuthorByCondition186_route(params@_) =>
      call(params.fromQuery[java.util.Optional[Integer]]("pageLimit", None), params.fromQuery[java.util.Optional[Integer]]("offset", None), params.fromQuery[java.util.Optional[String]]("sortCriteria", None)) { (pageLimit, offset, sortCriteria) =>
        controllers_AuthorController_searchAuthorByCondition186_invoker.call(AuthorController_6.searchAuthorByCondition(pageLimit, offset, sortCriteria))
      }
  
    // @LINE:403
    case controllers_AuthorController_topAuthors187_route(params@_) =>
      call { 
        controllers_AuthorController_topAuthors187_invoker.call(AuthorController_6.topAuthors())
      }
  
    // @LINE:407
    case controllers_ReviewerController_addReviewer188_route(params@_) =>
      call { 
        controllers_ReviewerController_addReviewer188_invoker.call(ReviewerController_22.addReviewer)
      }
  
    // @LINE:408
    case controllers_ReviewerController_reviewerDetail189_route(params@_) =>
      call(params.fromPath[Long]("userId", None)) { (userId) =>
        controllers_ReviewerController_reviewerDetail189_invoker.call(ReviewerController_22.reviewerDetail(userId))
      }
  
    // @LINE:409
    case controllers_ReviewerController_updateReviewer190_route(params@_) =>
      call { 
        controllers_ReviewerController_updateReviewer190_invoker.call(ReviewerController_22.updateReviewer)
      }
  
    // @LINE:410
    case controllers_ReviewerController_reviewerList191_route(params@_) =>
      call(params.fromQuery[java.util.Optional[Integer]]("pageLimit", None), params.fromQuery[java.util.Optional[Integer]]("offset", None), params.fromQuery[java.util.Optional[String]]("sortCriteria", None)) { (pageLimit, offset, sortCriteria) =>
        controllers_ReviewerController_reviewerList191_invoker.call(ReviewerController_22.reviewerList(pageLimit, offset, sortCriteria))
      }
  
    // @LINE:412
    case controllers_ReviewerController_searchReviewerByCondition192_route(params@_) =>
      call(params.fromQuery[java.util.Optional[Integer]]("pageLimit", None), params.fromQuery[java.util.Optional[Integer]]("offset", None), params.fromQuery[java.util.Optional[String]]("sortCriteria", None)) { (pageLimit, offset, sortCriteria) =>
        controllers_ReviewerController_searchReviewerByCondition192_invoker.call(ReviewerController_22.searchReviewerByCondition(pageLimit, offset, sortCriteria))
      }
  
    // @LINE:419
    case controllers_PaperController_addPaper193_route(params@_) =>
      call { 
        controllers_PaperController_addPaper193_invoker.call(PaperController_17.addPaper())
      }
  
    // @LINE:420
    case controllers_PaperController_paperList194_route(params@_) =>
      call(params.fromQuery[java.util.Optional[Integer]]("pageLimit", None), params.fromQuery[java.util.Optional[Integer]]("offset", None), params.fromQuery[java.util.Optional[String]]("sortCriteria", None)) { (pageLimit, offset, sortCriteria) =>
        controllers_PaperController_paperList194_invoker.call(PaperController_17.paperList(pageLimit, offset, sortCriteria))
      }
  
    // @LINE:421
    case controllers_PaperController_getAuthorByPaperId195_route(params@_) =>
      call(params.fromQuery[Long]("paperId", None)) { (paperId) =>
        controllers_PaperController_getAuthorByPaperId195_invoker.call(PaperController_17.getAuthorByPaperId(paperId))
      }
  
    // @LINE:422
    case controllers_PaperController_deletePaper196_route(params@_) =>
      call(params.fromQuery[Long]("paperId", None)) { (paperId) =>
        controllers_PaperController_deletePaper196_invoker.call(PaperController_17.deletePaper(paperId))
      }
  
    // @LINE:424
    case controllers_PaperController_getPaperById197_route(params@_) =>
      call(params.fromPath[Long]("paperId", None)) { (paperId) =>
        controllers_PaperController_getPaperById197_invoker.call(PaperController_17.getPaperById(paperId))
      }
  
    // @LINE:425
    case controllers_PaperController_addAuthor198_route(params@_) =>
      call(params.fromPath[Long]("paperId", None)) { (paperId) =>
        controllers_PaperController_addAuthor198_invoker.call(PaperController_17.addAuthor(paperId))
      }
  
    // @LINE:426
    case controllers_PaperController_deleteAuthor199_route(params@_) =>
      call(params.fromQuery[Long]("memberId", None)) { (memberId) =>
        controllers_PaperController_deleteAuthor199_invoker.call(PaperController_17.deleteAuthor(memberId))
      }
  
    // @LINE:429
    case controllers_GraphController_printPrimeConnections200_route(params@_) =>
      call { 
        controllers_GraphController_printPrimeConnections200_invoker.call(GraphController_15.printPrimeConnections())
      }
  
    // @LINE:430
    case controllers_PaperController_paperAuthorList201_route(params@_) =>
      call { 
        controllers_PaperController_paperAuthorList201_invoker.call(PaperController_17.paperAuthorList())
      }
  
    // @LINE:431
    case controllers_PaperController_storeDBLP202_route(params@_) =>
      call { 
        controllers_PaperController_storeDBLP202_invoker.call(PaperController_17.storeDBLP())
      }
  
    // @LINE:432
    case controllers_PaperController_loadLDA203_route(params@_) =>
      call { 
        controllers_PaperController_loadLDA203_invoker.call(PaperController_17.loadLDA())
      }
  
    // @LINE:433
    case controllers_PaperController_authorRelation204_route(params@_) =>
      call { 
        controllers_PaperController_authorRelation204_invoker.call(PaperController_17.authorRelation())
      }
  
    // @LINE:434
    case controllers_PaperController_storeDBLPSchema205_route(params@_) =>
      call { 
        controllers_PaperController_storeDBLPSchema205_invoker.call(PaperController_17.storeDBLPSchema())
      }
  
    // @LINE:435
    case controllers_PaperController_ldaTopicDistribution206_route(params@_) =>
      call { 
        controllers_PaperController_ldaTopicDistribution206_invoker.call(PaperController_17.ldaTopicDistribution())
      }
  
    // @LINE:436
    case controllers_PaperController_paperSearchList207_route(params@_) =>
      call { 
        controllers_PaperController_paperSearchList207_invoker.call(PaperController_17.paperSearchList())
      }
  
    // @LINE:440
    case controllers_LogController_operationLogging208_route(params@_) =>
      call { 
        controllers_LogController_operationLogging208_invoker.call(LogController_7.operationLogging())
      }
  
    // @LINE:443
    case controllers_FileController_getFile209_route(params@_) =>
      call(params.fromPath[String]("tableName", None), params.fromPath[String]("fileType", None), params.fromPath[String]("tableRecorderId", None)) { (tableName, fileType, tableRecorderId) =>
        controllers_FileController_getFile209_invoker.call(FileController_25.getFile(tableName, fileType, tableRecorderId))
      }
  
    // @LINE:444
    case controllers_FileController_checkFile210_route(params@_) =>
      call(params.fromPath[String]("tableName", None), params.fromPath[String]("fileType", None), params.fromPath[String]("tableRecorderId", None)) { (tableName, fileType, tableRecorderId) =>
        controllers_FileController_checkFile210_invoker.call(FileController_25.checkFile(tableName, fileType, tableRecorderId))
      }
  
    // @LINE:445
    case controllers_TechnologyController_setFiles211_route(params@_) =>
      call(params.fromPath[Long]("serviceId", None), params.fromQuery[String]("fileName", None), params.fromQuery[String]("fileType", None)) { (serviceId, fileName, fileType) =>
        controllers_TechnologyController_setFiles211_invoker.call(TechnologyController_10.setFiles(serviceId, fileName, fileType))
      }
  
    // @LINE:446
    case controllers_TechnologyController_getFileById212_route(params@_) =>
      call(params.fromPath[Long]("serviceId", None)) { (serviceId) =>
        controllers_TechnologyController_getFileById212_invoker.call(TechnologyController_10.getFileById(serviceId))
      }
  
    // @LINE:447
    case controllers_FileController_uploadRawFile213_route(params@_) =>
      call(params.fromPath[String]("tableName", None), params.fromPath[String]("fileType", None), params.fromPath[Long]("recordId", None)) { (tableName, fileType, recordId) =>
        controllers_FileController_uploadRawFile213_invoker.call(FileController_25.uploadRawFile(tableName, fileType, recordId))
      }
  }
}
