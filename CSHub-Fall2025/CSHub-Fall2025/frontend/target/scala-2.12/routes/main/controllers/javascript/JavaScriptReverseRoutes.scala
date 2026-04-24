
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/conf/routes
// @DATE:Fri Apr 24 12:50:26 CDT 2026

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers.javascript {

  // @LINE:399
  class ReverseReviewerController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:404
    def reviewerDetailPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ReviewerController.reviewerDetailPage",
      """
        function(userId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reviewer/reviewerDetailPage/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("userId", userId0))})
        }
      """
    )
  
    // @LINE:410
    def reviewerDelete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ReviewerController.reviewerDelete",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reviewer/reviewerDelete"})
        }
      """
    )
  
    // @LINE:408
    def searchPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ReviewerController.searchPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reviewer/searchPage"})
        }
      """
    )
  
    // @LINE:401
    def reviewerEditPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ReviewerController.reviewerEditPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reviewer/reviewerEditPage"})
        }
      """
    )
  
    // @LINE:399
    def reviewerRegisterPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ReviewerController.reviewerRegisterPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reviewer/reviewerRegisterPage"})
        }
      """
    )
  
    // @LINE:402
    def reviewerEditPOST: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ReviewerController.reviewerEditPOST",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "reviewer/reviewerEditPOST"})
        }
      """
    )
  
    // @LINE:403
    def reviewerList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ReviewerController.reviewerList",
      """
        function(pageNum0,sortCriteria1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reviewer/reviewerList/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum0)) + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("sortCriteria", sortCriteria1)])})
        }
      """
    )
  
    // @LINE:409
    def searchPOST: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ReviewerController.searchPOST",
      """
        function(pageNum0,sortCriteria1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "reviewer/searchPOST" + _qS([(pageNum0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum0)), (sortCriteria1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("sortCriteria", sortCriteria1))])})
        }
      """
    )
  
    // @LINE:400
    def reviewerRegisterPOST: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ReviewerController.reviewerRegisterPOST",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reviewer/reviewerRegister"})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file1)})
          }
        
        }
      """
    )
  
  }

  // @LINE:368
  class ReverseAdminController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:372
    def jobDetail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.jobDetail",
      """
        function(jobType0,jobId1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/jobs/detail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("jobType", jobType0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("jobId", jobId1))})
        }
      """
    )
  
    // @LINE:373
    def organizationManagement: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.organizationManagement",
      """
        function(pageNum0,sortCriteria1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/organizations/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum0)) + _qS([(sortCriteria1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("sortCriteria", sortCriteria1))])})
        }
      """
    )
  
    // @LINE:374
    def technologyManagement: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.technologyManagement",
      """
        function(pageNum0,sortCriteria1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/technologies/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum0)) + _qS([(sortCriteria1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("sortCriteria", sortCriteria1))])})
        }
      """
    )
  
    // @LINE:368
    def dashboard: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.dashboard",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/dashboard"})
        }
      """
    )
  
    // @LINE:370
    def userDetail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.userDetail",
      """
        function(userId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/users/detail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("userId", userId0))})
        }
      """
    )
  
    // @LINE:371
    def jobManagement: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.jobManagement",
      """
        function(pageNum0,sortCriteria1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/jobs/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum0)) + _qS([(sortCriteria1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("sortCriteria", sortCriteria1))])})
        }
      """
    )
  
    // @LINE:369
    def userManagement: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.userManagement",
      """
        function(pageNum0,sortCriteria1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/users/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum0)) + _qS([(sortCriteria1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("sortCriteria", sortCriteria1))])})
        }
      """
    )
  
  }

  // @LINE:43
  class ReverseProjectController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:65
    def unFollowedByUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.unFollowedByUser",
      """
        function(id0,eventList1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/unFollowedByUser/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("eventList", eventList1))})
        }
      """
    )
  
    // @LINE:68
    def addProjectFollowersPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.addProjectFollowersPage",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/addProjectFollowersPage/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:43
    def projectRegisterPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.projectRegisterPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/projectRegisterPage"})
        }
      """
    )
  
    // @LINE:67
    def checkParentProject: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.checkParentProject",
      """
        function(parentProjectId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/checkParentProject/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("parentProjectId", parentProjectId0))})
        }
      """
    )
  
    // @LINE:52
    def deleteProject: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.deleteProject",
      """
        function(projectId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/deleteProject/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("projectId", projectId0))})
        }
      """
    )
  
    // @LINE:48
    def projectList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.projectList",
      """
        function(pageNum0,sortCriteria1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/projectList/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum0)) + _qS([(sortCriteria1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("sortCriteria", sortCriteria1))])})
        }
      """
    )
  
    // @LINE:62
    def getMyEnrolledProjects: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.getMyEnrolledProjects",
      """
        function(pageNum0,sortCriteria1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/myEnrolledProjects/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum0)) + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("sortCriteria", sortCriteria1)])})
        }
      """
    )
  
    // @LINE:49
    def projectDetail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.projectDetail",
      """
        function(projectId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/projectDetail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("projectId", projectId0))})
        }
      """
    )
  
    // @LINE:69
    def addOneFollower: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.addOneFollower",
      """
        function(id0,event1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "project/addOneFollower/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("event", event1))})
        }
      """
    )
  
    // @LINE:50
    def searchPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.searchPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/searchPage"})
        }
      """
    )
  
    // @LINE:54
    def uploadDescriptionImage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.uploadDescriptionImage",
      """
        function(projectId0,imageNumber1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "project/uploadDescriptionImg/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("projectId", projectId0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("imageNumber", imageNumber1))})
        }
      """
    )
  
    // @LINE:55
    def renameDescriptionImage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.renameDescriptionImage",
      """
        function(projectId0,imageNumber1,currentImageNumber2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/renameDescriptionImg/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("projectId", projectId0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("imageNumber", imageNumber1)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("currentImageNumber", currentImageNumber2))})
        }
      """
    )
  
    // @LINE:64
    def followedByUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.followedByUser",
      """
        function(id0,eventList1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/followedByUser/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("eventList", eventList1))})
        }
      """
    )
  
    // @LINE:53
    def isProjectNameExisted: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.isProjectNameExisted",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "project/isProjectNameExisted"})
        }
      """
    )
  
    // @LINE:59
    def isProjectExist: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.isProjectExist",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/doesProjectExist/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:66
    def myFollowedProjects: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.myFollowedProjects",
      """
        function(page0,sortCriteria1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/myFollowedProjects" + _qS([(page0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("page", page0)), (sortCriteria1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("sortCriteria", sortCriteria1))])})
        }
      """
    )
  
    // @LINE:45
    def projectEditPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.projectEditPage",
      """
        function(projectId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/projectEditPage/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("projectId", projectId0))})
        }
      """
    )
  
    // @LINE:46
    def projectEditPOST: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.projectEditPOST",
      """
        function(projectId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "project/projectEditPOST/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("projectId", projectId0))})
        }
      """
    )
  
    // @LINE:70
    def deleteOneFollower: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.deleteOneFollower",
      """
        function(userId0,projectId1,eventType2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/deleteOneFollower/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("userId", userId0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("projectId", projectId1)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("eventType", eventType2))})
        }
      """
    )
  
    // @LINE:61
    def getProjectLists: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.getProjectLists",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/getProjects"})
        }
      """
    )
  
    // @LINE:60
    def associateProjectsToNotebook: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.associateProjectsToNotebook",
      """
        function(notebookId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "project/associateProjectsToNotebook/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("notebookId", notebookId0))})
        }
      """
    )
  
    // @LINE:44
    def projectRegisterPOST: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.projectRegisterPOST",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "project/projectRegisterPOST"})
        }
      """
    )
  
    // @LINE:63
    def setProjectZoneAsGeoNEX: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.setProjectZoneAsGeoNEX",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "project/setProjectZoneAsGeoNEX"})
        }
      """
    )
  
    // @LINE:51
    def searchPOST: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProjectController.searchPOST",
      """
        function(pageNum0,sortCriteria1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "project/searchPOST" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("sortCriteria", sortCriteria1)])})
        }
      """
    )
  
  }

  // @LINE:340
  class ReverseTAJobController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:349
    def tajobApplicationDetail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TAJobController.tajobApplicationDetail",
      """
        function(tajobApplicationId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tajob/tajobApplicationDetail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("tajobApplicationId", tajobApplicationId0))})
        }
      """
    )
  
    // @LINE:352
    def tajobList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TAJobController.tajobList",
      """
        function(pageNum0,sortCriteria1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tajob/tajobList/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum0)) + _qS([(sortCriteria1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("sortCriteria", sortCriteria1))])})
        }
      """
    )
  
    // @LINE:354
    def tajobDetail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TAJobController.tajobDetail",
      """
        function(tajobId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tajob/tajobDetail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("tajobId", tajobId0))})
        }
      """
    )
  
    // @LINE:343
    def tajobEditPOST: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TAJobController.tajobEditPOST",
      """
        function(tajobId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tajob/tajobEditPOST/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("tajobId", tajobId0))})
        }
      """
    )
  
    // @LINE:341
    def tajobRegisterPOST: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TAJobController.tajobRegisterPOST",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tajob/tajobRegisterPOST"})
        }
      """
    )
  
    // @LINE:340
    def tajobRegisterPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TAJobController.tajobRegisterPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tajob/tajobRegisterPage"})
        }
      """
    )
  
    // @LINE:342
    def tajobEditPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TAJobController.tajobEditPage",
      """
        function(tajobId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tajob/tajobEditPage/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("tajobId", tajobId0))})
        }
      """
    )
  
    // @LINE:345
    def tajobApplyPOST: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TAJobController.tajobApplyPOST",
      """
        function(tajobId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tajob/tajobApplyPOST/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("tajobId", tajobId0))})
        }
      """
    )
  
    // @LINE:355
    def searchPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TAJobController.searchPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tajob/searchPage"})
        }
      """
    )
  
    // @LINE:357
    def deleteTAJob: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TAJobController.deleteTAJob",
      """
        function(tajobId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tajob/deleteTAJob/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("tajobId", tajobId0))})
        }
      """
    )
  
    // @LINE:344
    def tajobApplyPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TAJobController.tajobApplyPage",
      """
        function(tajobId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tajob/tajobApplyPage/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("tajobId", tajobId0))})
        }
      """
    )
  
    // @LINE:347
    def tajobStatueChange: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TAJobController.tajobStatueChange",
      """
        function(tajobId0,tajobStatus1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tajob/tajobStatue/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("tajobId", tajobId0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("tajobStatus", tajobStatus1))})
        }
      """
    )
  
    // @LINE:353
    def tajobListPostedByUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TAJobController.tajobListPostedByUser",
      """
        function(pageNum0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tajob/tajobListPostedByUser/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum0))})
        }
      """
    )
  
    // @LINE:350
    def saveTAJobPdf: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TAJobController.saveTAJobPdf",
      """
        function(tajobApplicationId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tajob/saveTAJobPdf/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("tajobApplicationId", tajobApplicationId0))})
        }
      """
    )
  
    // @LINE:356
    def searchPOST: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TAJobController.searchPOST",
      """
        function(pageNum0,sortCriteria1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tajob/searchPOST" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("sortCriteria", sortCriteria1)])})
        }
      """
    )
  
  }

  // @LINE:212
  class ReverseTechnologyController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:222
    def downloadTechnologyFile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TechnologyController.downloadTechnologyFile",
      """
        function(serviceId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "technology/downloadPDFFile/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("serviceId", serviceId0))})
        }
      """
    )
  
    // @LINE:221
    def deleteTechnology: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TechnologyController.deleteTechnology",
      """
        function(technologyId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "technology/deleteTechnology/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("technologyId", technologyId0))})
        }
      """
    )
  
    // @LINE:213
    def technologyRegisterPOST: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TechnologyController.technologyRegisterPOST",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "technology/technologyRegisterPOST"})
        }
      """
    )
  
    // @LINE:215
    def technologyEditPOST: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TechnologyController.technologyEditPOST",
      """
        function(technologyId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "technology/technologyEditPOST/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("technologyId", technologyId0))})
        }
      """
    )
  
    // @LINE:219
    def searchPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TechnologyController.searchPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "technology/searchPage"})
        }
      """
    )
  
    // @LINE:214
    def technologyEditPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TechnologyController.technologyEditPage",
      """
        function(technologyId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "technology/technologyEditPage/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("technologyId", technologyId0))})
        }
      """
    )
  
    // @LINE:212
    def technologyRegisterPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TechnologyController.technologyRegisterPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "technology/technologyRegisterPage"})
        }
      """
    )
  
    // @LINE:218
    def technologyDetail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TechnologyController.technologyDetail",
      """
        function(technologyId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "technology/technologyDetail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("technologyId", technologyId0))})
        }
      """
    )
  
    // @LINE:217
    def technologyList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TechnologyController.technologyList",
      """
        function(pageNum0,sortCriteria1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "technology/technologyList/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum0)) + _qS([(sortCriteria1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("sortCriteria", sortCriteria1))])})
        }
      """
    )
  
    // @LINE:220
    def searchPOST: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TechnologyController.searchPOST",
      """
        function(pageNum0,sortCriteria1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "technology/searchPOST" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("sortCriteria", sortCriteria1)])})
        }
      """
    )
  
  }

  // @LINE:414
  class ReversePaperController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:432
    def searchPaper: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaperController.searchPaper",
      """
        function(pageNum0,sortCriteria1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "paper/searchPaper" + _qS([(pageNum0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum0)), (sortCriteria1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("sortCriteria", sortCriteria1))])})
        }
      """
    )
  
    // @LINE:430
    def ldaTopicDistribution: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaperController.ldaTopicDistribution",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paper/ldaTopicDistribution"})
        }
      """
    )
  
    // @LINE:424
    def loadUploadPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaperController.loadUploadPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paper/loadDBLP"})
        }
      """
    )
  
    // @LINE:429
    def authorAuthorRel: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaperController.authorAuthorRel",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paper/authorRelation"})
        }
      """
    )
  
    // @LINE:425
    def processDBPLFile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaperController.processDBPLFile",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "paper/uploadDBLP"})
        }
      """
    )
  
    // @LINE:417
    def paperList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaperController.paperList",
      """
        function(pageNum0,sortCriteria1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paper/paperList/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum0)) + _qS([(sortCriteria1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("sortCriteria", sortCriteria1))])})
        }
      """
    )
  
    // @LINE:419
    def deletePaper: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaperController.deletePaper",
      """
        function(paperId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "paper/deletePaper/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("paperId", paperId0))})
        }
      """
    )
  
    // @LINE:431
    def searchPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaperController.searchPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paper/searchPage"})
        }
      """
    )
  
    // @LINE:421
    def primeConnections: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaperController.primeConnections",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paper/primeConnections"})
        }
      """
    )
  
    // @LINE:414
    def paperRegisterPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaperController.paperRegisterPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paper/paperRegisterPage"})
        }
      """
    )
  
    // @LINE:415
    def paperRegisterPOST: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaperController.paperRegisterPOST",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "paper/paperRegisterPOST"})
        }
      """
    )
  
    // @LINE:423
    def relationGraph: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaperController.relationGraph",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paper/relationGraph"})
        }
      """
    )
  
    // @LINE:418
    def paperDetail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaperController.paperDetail",
      """
        function(paperId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paper/paperDetail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("paperId", paperId0))})
        }
      """
    )
  
    // @LINE:427
    def paperLDA: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PaperController.paperLDA",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paper/ldaPage"})
        }
      """
    )
  
  }

  // @LINE:379
  class ReverseAuthorController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:386
    def userEditPageAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthorController.userEditPageAdmin",
      """
        function(userId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "author/userEditPageAdmin/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("userId", userId0))})
        }
      """
    )
  
    // @LINE:396
    def topAuthors: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthorController.topAuthors",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "author/topAuthors"})
        }
      """
    )
  
    // @LINE:395
    def authorDelete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthorController.authorDelete",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "author/authorDelete"})
        }
      """
    )
  
    // @LINE:389
    def userDetailPageAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthorController.userDetailPageAdmin",
      """
        function(userId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "author/userDetailPageAdmin/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("userId", userId0))})
        }
      """
    )
  
    // @LINE:387
    def userEditPOSTAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthorController.userEditPOSTAdmin",
      """
        function(userId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "author/userEditPOSTAdmin/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("userId", userId0))})
        }
      """
    )
  
    // @LINE:393
    def searchPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthorController.searchPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "author/searchPage"})
        }
      """
    )
  
    // @LINE:382
    def authorEditPOST: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthorController.authorEditPOST",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "author/authorEditPOST"})
        }
      """
    )
  
    // @LINE:380
    def authorRegisterPOST: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthorController.authorRegisterPOST",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "author/authorRegister"})
        }
      """
    )
  
    // @LINE:379
    def authorRegisterPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthorController.authorRegisterPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "author/authorRegisterPage"})
        }
      """
    )
  
    // @LINE:381
    def authorEditPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthorController.authorEditPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "author/authorEditPage"})
        }
      """
    )
  
    // @LINE:383
    def authorList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthorController.authorList",
      """
        function(pageNum0,sortCriteria1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "author/authorList/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum0)) + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("sortCriteria", sortCriteria1)])})
        }
      """
    )
  
    // @LINE:394
    def searchPOST: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthorController.searchPOST",
      """
        function(pageNum0,sortCriteria1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "author/searchPOST" + _qS([(pageNum0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum0)), (sortCriteria1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("sortCriteria", sortCriteria1))])})
        }
      """
    )
  
    // @LINE:388
    def userListAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthorController.userListAdmin",
      """
        function(pageNum0,sortCriteria1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "author/userListAdmin/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum0)) + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("sortCriteria", sortCriteria1)])})
        }
      """
    )
  
    // @LINE:384
    def authorDetailPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthorController.authorDetailPage",
      """
        function(userId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "author/authorDetailPage/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("userId", userId0))})
        }
      """
    )
  
  }

  // @LINE:187
  class ReverseBugReportController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:192
    def bugReportList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BugReportController.bugReportList",
      """
        function(page0,sortCriteria1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bugReport/bugReportList" + _qS([(page0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Long]].javascriptUnbind + """)("page", page0)), (sortCriteria1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("sortCriteria", sortCriteria1))])})
        }
      """
    )
  
    // @LINE:188
    def bugReportRegisterPOST: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BugReportController.bugReportRegisterPOST",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "bugReport/bugReportRegisterPOST"})
        }
      """
    )
  
    // @LINE:193
    def bugReportDelete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BugReportController.bugReportDelete",
      """
        function(bugReportId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bugReport/bugReportDelete/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("bugReportId", bugReportId0))})
        }
      """
    )
  
    // @LINE:195
    def markAsSolved: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BugReportController.markAsSolved",
      """
        function(bugReportId0,fixerId1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bugReport/solve/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("bugReportId", bugReportId0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("fixerId", fixerId1))})
        }
      """
    )
  
    // @LINE:189
    def bugReportEditPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BugReportController.bugReportEditPage",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bugReport/bugReportEditPage/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:190
    def bugReportEditPOST: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BugReportController.bugReportEditPOST",
      """
        function(bugReportId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "bugReport/bugReportEditPost/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("bugReportId", bugReportId0))})
        }
      """
    )
  
    // @LINE:187
    def bugReportRegisterPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BugReportController.bugReportRegisterPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bugReport/bugReportRegisterPage"})
        }
      """
    )
  
    // @LINE:191
    def bugReportDetail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BugReportController.bugReportDetail",
      """
        function(bugReportId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bugReport/bugReportDetail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("bugReportId", bugReportId0))})
        }
      """
    )
  
  }

  // @LINE:11
  class ReverseAboutController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def aboutProject: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AboutController.aboutProject",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "aboutProject"})
        }
      """
    )
  
    // @LINE:13
    def frequentlyAskedQuestions: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AboutController.frequentlyAskedQuestions",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "frequentlyAskedQuestions"})
        }
      """
    )
  
    // @LINE:14
    def popularQueries: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AboutController.popularQueries",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "popularQueries"})
        }
      """
    )
  
    // @LINE:11
    def aboutUs: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AboutController.aboutUs",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "aboutUs"})
        }
      """
    )
  
  }

  // @LINE:174
  class ReverseOrganizationController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:180
    def organizationRegisterPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrganizationController.organizationRegisterPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "organization/organizationRegisterPage"})
        }
      """
    )
  
    // @LINE:174
    def organizationDetailPageAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrganizationController.organizationDetailPageAdmin",
      """
        function(organizationId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "organization/organizationDetailPageAdmin/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("organizationId", organizationId0))})
        }
      """
    )
  
    // @LINE:182
    def searchPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrganizationController.searchPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "organization/searchPage"})
        }
      """
    )
  
    // @LINE:179
    def organizationEditPOST: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrganizationController.organizationEditPOST",
      """
        function(organizationId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "organization/organizationEditPOST" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Long]].javascriptUnbind + """)("organizationId", organizationId0)])})
        }
      """
    )
  
    // @LINE:178
    def organizationRegisterPOST: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrganizationController.organizationRegisterPOST",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "organization/organizationRegisterPOST"})
        }
      """
    )
  
    // @LINE:175
    def organizationDetailPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrganizationController.organizationDetailPage",
      """
        function(organizationId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "organization/organizationDetailPage/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("organizationId", organizationId0))})
        }
      """
    )
  
    // @LINE:177
    def organizationListPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrganizationController.organizationListPage",
      """
        function(pageNum0,sortCriteria1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "organization/organizationListPage/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum0)) + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("sortCriteria", sortCriteria1)])})
        }
      """
    )
  
    // @LINE:181
    def organizationEditPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrganizationController.organizationEditPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "organization/organizationEditPage"})
        }
      """
    )
  
    // @LINE:183
    def searchPOST: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.OrganizationController.searchPOST",
      """
        function(pageNum0,sortCriteria1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "organization/searchPOST" + _qS([(pageNum0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum0)), (sortCriteria1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("sortCriteria", sortCriteria1))])})
        }
      """
    )
  
  }

  // @LINE:323
  class ReverseCourseController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:323
    def courseList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CourseController.courseList",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "courses"})
        }
      """
    )
  
  }

  // @LINE:130
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:140
    def userList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.userList",
      """
        function(pageNum0,sortCriteria1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/userList/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum0)) + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("sortCriteria", sortCriteria1)])})
        }
      """
    )
  
    // @LINE:147
    def unFollowedByUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.unFollowedByUser",
      """
        function(id0,page1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/unFollowedByUser/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("page", page1))})
        }
      """
    )
  
    // @LINE:163
    def activateUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.activateUser",
      """
        function(hashcode0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("hashcode", hashcode0))})
        }
      """
    )
  
    // @LINE:155
    def userDelete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.userDelete",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/userDelete"})
        }
      """
    )
  
    // @LINE:133
    def userResetPassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.userResetPassword",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user/userResetPassword"})
        }
      """
    )
  
    // @LINE:131
    def userForgotPasswordPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.userForgotPasswordPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/userForgotPasswordPage"})
        }
      """
    )
  
    // @LINE:136
    def userRegisterPOST: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.userRegisterPOST",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/userRegister"})
        }
      """
    )
  
    // @LINE:137
    def userEditPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.userEditPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/userEditPage"})
        }
      """
    )
  
    // @LINE:134
    def updatePasswordPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.updatePasswordPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/userUpdatePasswordPage"})
        }
      """
    )
  
    // @LINE:138
    def userEditPOST: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.userEditPOST",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user/userEditPOST"})
        }
      """
    )
  
    // @LINE:143
    def userLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.userLogin",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user/userLogin"})
        }
      """
    )
  
    // @LINE:135
    def updatePasswordForUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.updatePasswordForUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user/userUpdatePasswordForUser"})
        }
      """
    )
  
    // @LINE:139
    def isEmailExisted: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.isEmailExisted",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user/isEmailExisted"})
        }
      """
    )
  
    // @LINE:153
    def searchPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.searchPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/searchPage"})
        }
      """
    )
  
    // @LINE:132
    def resendActivationEmail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.resendActivationEmail",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/resendActivationEmail"})
        }
      """
    )
  
    // @LINE:141
    def userDetailPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.userDetailPage",
      """
        function(userId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/userDetailPage/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("userId", userId0))})
        }
      """
    )
  
    // @LINE:161
    def mySpacePage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.mySpacePage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/mySpace"})
        }
      """
    )
  
    // @LINE:130
    def userRegisterPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.userRegisterPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/userRegisterPage"})
        }
      """
    )
  
    // @LINE:146
    def followedByUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.followedByUser",
      """
        function(id0,page1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/followedByUser/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("page", page1))})
        }
      """
    )
  
    // @LINE:159
    def myFollowees: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.myFollowees",
      """
        function(page0,sortCriteria1,isCallerMySpacePage2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/myFollowees" + _qS([(page0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("page", page0)), (sortCriteria1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("sortCriteria", sortCriteria1)), (isCallerMySpacePage2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Boolean]].javascriptUnbind + """)("isCallerMySpacePage", isCallerMySpacePage2))])})
        }
      """
    )
  
    // @LINE:170
    def userSaved: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.userSaved",
      """
        function(hashcode0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("hashcode", hashcode0))})
        }
      """
    )
  
    // @LINE:144
    def userImageByImageId: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.userImageByImageId",
      """
        function(imageId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/userImageByImageId/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("imageId", imageId0))})
        }
      """
    )
  
    // @LINE:150
    def checkPassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.checkPassword",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user/checkCurPassword"})
        }
      """
    )
  
    // @LINE:149
    def updatePassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.updatePassword",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user/updatePassword"})
        }
      """
    )
  
    // @LINE:158
    def myFollowers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.myFollowers",
      """
        function(page0,sortCriteria1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/myFollowers" + _qS([(page0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("page", page0)), (sortCriteria1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("sortCriteria", sortCriteria1))])})
        }
      """
    )
  
    // @LINE:148
    def updateLevel: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.updateLevel",
      """
        function(uid0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user/updateLevel/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("uid", uid0))})
        }
      """
    )
  
    // @LINE:145
    def validateEmail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.validateEmail",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user/validateEmail"})
        }
      """
    )
  
    // @LINE:154
    def searchPOST: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.searchPOST",
      """
        function(pageNum0,sortCriteria1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user/searchPOST" + _qS([(pageNum0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum0)), (sortCriteria1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("sortCriteria", sortCriteria1))])})
        }
      """
    )
  
    // @LINE:156
    def allUserIds: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.allUserIds",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/allUserIds"})
        }
      """
    )
  
  }

  // @LINE:199
  class ReverseSuggestionController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:203
    def suggestionDetail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SuggestionController.suggestionDetail",
      """
        function(suggestionId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "suggestion/suggestionDetail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("suggestionId", suggestionId0))})
        }
      """
    )
  
    // @LINE:207
    def markAsSolved: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SuggestionController.markAsSolved",
      """
        function(suggestionId0,implementorId1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "suggestion/solve/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("suggestionId", suggestionId0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("implementorId", implementorId1))})
        }
      """
    )
  
    // @LINE:201
    def suggestionEditPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SuggestionController.suggestionEditPage",
      """
        function(suggestionId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "suggestion/suggestionEditPage/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("suggestionId", suggestionId0))})
        }
      """
    )
  
    // @LINE:199
    def suggestionRegisterPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SuggestionController.suggestionRegisterPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "suggestion/suggestionRegisterPage"})
        }
      """
    )
  
    // @LINE:204
    def suggestionList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SuggestionController.suggestionList",
      """
        function(page0,sortCriteria1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "suggestion/suggestionList" + _qS([(page0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Long]].javascriptUnbind + """)("page", page0)), (sortCriteria1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("sortCriteria", sortCriteria1))])})
        }
      """
    )
  
    // @LINE:200
    def suggestionRegisterPOST: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SuggestionController.suggestionRegisterPOST",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "suggestion/suggestionRegisterPOST"})
        }
      """
    )
  
    // @LINE:202
    def suggestionEditPOST: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SuggestionController.suggestionEditPOST",
      """
        function(suggestionId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "suggestion/suggestionEditPOST/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("suggestionId", suggestionId0))})
        }
      """
    )
  
    // @LINE:205
    def suggestionDelete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SuggestionController.suggestionDelete",
      """
        function(suggestionId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "suggestion/suggestionDelete/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("suggestionId", suggestionId0))})
        }
      """
    )
  
  }

  // @LINE:5
  class ReverseAsyncController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:5
    def message: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AsyncController.message",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
        }
      """
    )
  
  }

  // @LINE:276
  class ReverseRAJobController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:296
    def deleteRAJob: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RAJobController.deleteRAJob",
      """
        function(rajobId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rajob/deleteRAJob/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("rajobId", rajobId0))})
        }
      """
    )
  
    // @LINE:291
    def rajobListAppliedByUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RAJobController.rajobListAppliedByUser",
      """
        function(pageNum0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rajob/rajobListAppliedByUser/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum0))})
        }
      """
    )
  
    // @LINE:280
    def rajobApplyPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RAJobController.rajobApplyPage",
      """
        function(rajobId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rajob/rajobApplyPage/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("rajobId", rajobId0))})
        }
      """
    )
  
    // @LINE:284
    def rajobApplicationStatusChange: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RAJobController.rajobApplicationStatusChange",
      """
        function(rajobApplicationId0,rajobApplicationStatus1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "rajob/rajobApplicationStatusChange/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("rajobApplicationId", rajobApplicationId0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("rajobApplicationStatus", rajobApplicationStatus1))})
        }
      """
    )
  
    // @LINE:306
    def sendOfferEmail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RAJobController.sendOfferEmail",
      """
        function(rajobApplicationId0,ccString1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "rajob/sendOfferEmail" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Long]].javascriptUnbind + """)("rajobApplicationId", rajobApplicationId0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("ccString", ccString1)])})
        }
      """
    )
  
    // @LINE:278
    def rajobEditPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RAJobController.rajobEditPage",
      """
        function(rajobId0,status1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rajob/rajobEditPage/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("rajobId", rajobId0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("status", status1))})
        }
      """
    )
  
    // @LINE:286
    def rajobApplicationDetail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RAJobController.rajobApplicationDetail",
      """
        function(rajobApplicationId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rajob/rajobApplicationDetail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("rajobApplicationId", rajobApplicationId0))})
        }
      """
    )
  
    // @LINE:294
    def searchPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RAJobController.searchPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rajob/searchPage"})
        }
      """
    )
  
    // @LINE:279
    def rajobEditPOST: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RAJobController.rajobEditPOST",
      """
        function(rajobId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "rajob/rajobEditPOST/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("rajobId", rajobId0))})
        }
      """
    )
  
    // @LINE:290
    def rajobListPostedByUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RAJobController.rajobListPostedByUser",
      """
        function(pageNum0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rajob/rajobListPostedByUser/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum0))})
        }
      """
    )
  
    // @LINE:289
    def rajobList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RAJobController.rajobList",
      """
        function(pageNum0,sortCriteria1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rajob/rajobList/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum0)) + _qS([(sortCriteria1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("sortCriteria", sortCriteria1))])})
        }
      """
    )
  
    // @LINE:276
    def rajobRegisterPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RAJobController.rajobRegisterPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rajob/rajobRegisterPage"})
        }
      """
    )
  
    // @LINE:281
    def rajobApplyPOST: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RAJobController.rajobApplyPOST",
      """
        function(rajobId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "rajob/rajobApplyPOST/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("rajobId", rajobId0))})
        }
      """
    )
  
    // @LINE:297
    def closeRAJob: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RAJobController.closeRAJob",
      """
        function(rajobId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rajob/closeRAJob/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("rajobId", rajobId0))})
        }
      """
    )
  
    // @LINE:295
    def searchPOST: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RAJobController.searchPOST",
      """
        function(pageNum0,sortCriteria1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "rajob/searchPOST" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("sortCriteria", sortCriteria1)])})
        }
      """
    )
  
    // @LINE:283
    def rajobStatueChange: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RAJobController.rajobStatueChange",
      """
        function(rajobId0,rajobStatus1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "rajob/rajobStatue/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("rajobId", rajobId0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("rajobStatus", rajobStatus1))})
        }
      """
    )
  
    // @LINE:277
    def rajobRegisterPOST: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RAJobController.rajobRegisterPOST",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "rajob/rajobRegisterPOST"})
        }
      """
    )
  
    // @LINE:293
    def rajobDetail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RAJobController.rajobDetail",
      """
        function(rajobId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rajob/rajobDetail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("rajobId", rajobId0))})
        }
      """
    )
  
  }

  // @LINE:75
  class ReverseChallengeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:82
    def challengeEditPOST: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ChallengeController.challengeEditPOST",
      """
        function(challengeId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "challenge/challengeEditPOST/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("challengeId", challengeId0))})
        }
      """
    )
  
    // @LINE:89
    def challengeApplicationStatusChange: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ChallengeController.challengeApplicationStatusChange",
      """
        function(challengeApplicationId0,challengeApplicationStatus1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "challenge/challengeApplicationStatusChange/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("challengeApplicationId", challengeApplicationId0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("challengeApplicationStatus", challengeApplicationStatus1))})
        }
      """
    )
  
    // @LINE:83
    def challengeEditPOSTAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ChallengeController.challengeEditPOSTAdmin",
      """
        function(challengeId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "challenge/challengeEditPOSTAdmin/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("challengeId", challengeId0))})
        }
      """
    )
  
    // @LINE:78
    def challengeApplyPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ChallengeController.challengeApplyPage",
      """
        function(challengeId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "challenge/challengeApplyPage/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("challengeId", challengeId0))})
        }
      """
    )
  
    // @LINE:84
    def closeChallenge: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ChallengeController.closeChallenge",
      """
        function(challengeId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "challenge/closeChallenge/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("challengeId", challengeId0))})
        }
      """
    )
  
    // @LINE:95
    def challengeStatusChange: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ChallengeController.challengeStatusChange",
      """
        function(challengeId0,challengeStatus1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "challenge/challengeStatus/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("challengeId", challengeId0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("challengeStatus", challengeStatus1))})
        }
      """
    )
  
    // @LINE:92
    def challengeApplicationList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ChallengeController.challengeApplicationList",
      """
        function(pageNum0,sortCriteria1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "challenge/challengeApplicationList/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum0)) + _qS([(sortCriteria1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("sortCriteria", sortCriteria1))])})
        }
      """
    )
  
    // @LINE:96
    def challengeApplicationsDetail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ChallengeController.challengeApplicationsDetail",
      """
        function(challengeApplicationId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "challenge/challengeApplicationsDetail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("challengeApplicationId", challengeApplicationId0))})
        }
      """
    )
  
    // @LINE:101
    def searchPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ChallengeController.searchPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "challenge/searchPage"})
        }
      """
    )
  
    // @LINE:98
    def challengeList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ChallengeController.challengeList",
      """
        function(pageNum0,sortCriteria1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "challenge/challengeList/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum0)) + _qS([(sortCriteria1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("sortCriteria", sortCriteria1))])})
        }
      """
    )
  
    // @LINE:85
    def challengeApplicationsList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ChallengeController.challengeApplicationsList",
      """
        function(challengeType0,challengeId1,pageNum2,sortCriteria3) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "challenge/applications/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("challengeType", challengeType0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("challengeId", challengeId1)) + _qS([(pageNum2 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum2)), (sortCriteria3 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("sortCriteria", sortCriteria3))])})
        }
      """
    )
  
    // @LINE:99
    def challengeListAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ChallengeController.challengeListAdmin",
      """
        function(pageNum0,sortCriteria1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "challenge/challengeListAdmin/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum0)) + _qS([(sortCriteria1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("sortCriteria", sortCriteria1))])})
        }
      """
    )
  
    // @LINE:79
    def challengeApplyPOST: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ChallengeController.challengeApplyPOST",
      """
        function(challengeId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "challenge/challengeApplyPOST/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("challengeId", challengeId0))})
        }
      """
    )
  
    // @LINE:94
    def challengeApplicationDetail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ChallengeController.challengeApplicationDetail",
      """
        function(challengeApplicationId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "challenge/challengeApplicationDetail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("challengeApplicationId", challengeApplicationId0))})
        }
      """
    )
  
    // @LINE:80
    def challengeEditPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ChallengeController.challengeEditPage",
      """
        function(challengeId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "challenge/challengeEditPage/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("challengeId", challengeId0))})
        }
      """
    )
  
    // @LINE:76
    def challengeRegisterPOST: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ChallengeController.challengeRegisterPOST",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "challenge/challengeRegisterPOST"})
        }
      """
    )
  
    // @LINE:93
    def challengeListPostedByUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ChallengeController.challengeListPostedByUser",
      """
        function(pageNum0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "challenge/challengeListPostedByUser/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum0))})
        }
      """
    )
  
    // @LINE:75
    def challengeRegisterPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ChallengeController.challengeRegisterPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "challenge/challengeRegisterPage"})
        }
      """
    )
  
    // @LINE:81
    def challengeEditPageAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ChallengeController.challengeEditPageAdmin",
      """
        function(challengeId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "challenge/challengeEditPageAdmin/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("challengeId", challengeId0))})
        }
      """
    )
  
    // @LINE:100
    def challengeDetail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ChallengeController.challengeDetail",
      """
        function(challengeId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "challenge/challengeDetail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("challengeId", challengeId0))})
        }
      """
    )
  
    // @LINE:102
    def searchPOST: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ChallengeController.searchPOST",
      """
        function(pageNum0,sortCriteria1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "challenge/searchPOST/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum0)) + _qS([(sortCriteria1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("sortCriteria", sortCriteria1))])})
        }
      """
    )
  
    // @LINE:91
    def challengeListAppliedByUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ChallengeController.challengeListAppliedByUser",
      """
        function(pageNum0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "challenge/challengeListAppliedByUser/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum0))})
        }
      """
    )
  
  }

  // @LINE:22
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:31
    def updateProjectZone: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.updateProjectZone",
      """
        function(view0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateProjectZone/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("view", view0))})
        }
      """
    )
  
    // @LINE:25
    def createUserSuccess: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.createUserSuccess",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "createUserSuccess"})
        }
      """
    )
  
    // @LINE:27
    def showVerificationEmailIsSent: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.showVerificationEmailIsSent",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "showVerificationEmailIsSent"})
        }
      """
    )
  
    // @LINE:26
    def showLinkIsAlreadyClick: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.showLinkIsAlreadyClick",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "showLinkIsAlreadyClick"})
        }
      """
    )
  
    // @LINE:32
    def getImageFromPath: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getImageFromPath",
      """
        function(filePath0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getimage" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("filePath", filePath0)])})
        }
      """
    )
  
    // @LINE:28
    def showVerificationEmailIsExpired: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.showVerificationEmailIsExpired",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "showVerificationEmailIsExpired"})
        }
      """
    )
  
    // @LINE:30
    def updatePassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.updatePassword",
      """
        function(email0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updatePassword" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("email", email0)])})
        }
      """
    )
  
    // @LINE:24
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:33
    def getDefaultAvatar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getDefaultAvatar",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getDefualtAvatar"})
        }
      """
    )
  
    // @LINE:29
    def deleteAccount: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.deleteAccount",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteAccount"})
        }
      """
    )
  
    // @LINE:22
    def home: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.home",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:23
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:240
  class ReverseJobController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:251
    def jobDetail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.JobController.jobDetail",
      """
        function(jobId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "job/jobDetail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("jobId", jobId0))})
        }
      """
    )
  
    // @LINE:256
    def jobStatueChange: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.JobController.jobStatueChange",
      """
        function(jobId0,jobStatus1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "job/jobStatue/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("jobId", jobId0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("jobStatus", jobStatus1))})
        }
      """
    )
  
    // @LINE:243
    def jobEditPOST: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.JobController.jobEditPOST",
      """
        function(jobId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "job/jobEditPOST/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("jobId", jobId0))})
        }
      """
    )
  
    // @LINE:246
    def jobApplicationList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.JobController.jobApplicationList",
      """
        function(pageNum0,sortCriteria1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "job/jobApplicationList/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum0)) + _qS([(sortCriteria1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("sortCriteria", sortCriteria1))])})
        }
      """
    )
  
    // @LINE:247
    def jobListAppliedByUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.JobController.jobListAppliedByUser",
      """
        function(pageNum0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "job/listAppliedByUser/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum0))})
        }
      """
    )
  
    // @LINE:254
    def deleteJob: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.JobController.deleteJob",
      """
        function(jobId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "job/deleteJob/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("jobId", jobId0))})
        }
      """
    )
  
    // @LINE:252
    def searchPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.JobController.searchPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "job/searchPage"})
        }
      """
    )
  
    // @LINE:269
    def jobApplicationsList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.JobController.jobApplicationsList",
      """
        function(jobType0,jobId1,pageNum2,sortCriteria3) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "job/applications/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("jobType", jobType0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("jobId", jobId1)) + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum2), (sortCriteria3 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("sortCriteria", sortCriteria3))])})
        }
      """
    )
  
    // @LINE:241
    def jobRegisterPOST: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.JobController.jobRegisterPOST",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "job/jobRegisterPOST"})
        }
      """
    )
  
    // @LINE:258
    def jobApplicationDetail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.JobController.jobApplicationDetail",
      """
        function(jobApplicationId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "job/jobApplicationDetail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("jobApplicationId", jobApplicationId0))})
        }
      """
    )
  
    // @LINE:240
    def jobRegisterPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.JobController.jobRegisterPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "job/jobRegisterPage"})
        }
      """
    )
  
    // @LINE:244
    def jobApplyPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.JobController.jobApplyPage",
      """
        function(jobId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "job/jobApplyPage/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("jobId", jobId0))})
        }
      """
    )
  
    // @LINE:245
    def jobApplyPOST: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.JobController.jobApplyPOST",
      """
        function(jobId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "job/jobApplyPOST/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("jobId", jobId0))})
        }
      """
    )
  
    // @LINE:249
    def jobList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.JobController.jobList",
      """
        function(pageNum0,sortCriteria1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "job/jobList/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum0)) + _qS([(sortCriteria1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("sortCriteria", sortCriteria1))])})
        }
      """
    )
  
    // @LINE:250
    def jobListPostedByUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.JobController.jobListPostedByUser",
      """
        function(pageNum0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "job/jobListPostedByUser/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum0))})
        }
      """
    )
  
    // @LINE:253
    def searchPOST: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.JobController.searchPOST",
      """
        function(pageNum0,sortCriteria1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "job/searchPOST" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("sortCriteria", sortCriteria1)])})
        }
      """
    )
  
    // @LINE:242
    def jobEditPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.JobController.jobEditPage",
      """
        function(jobId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "job/jobEditPage/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("jobId", jobId0))})
        }
      """
    )
  
  }

  // @LINE:331
  class ReverseCourseTAAssignmentController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:333
    def assignmentRegisterPOST: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CourseTAAssignmentController.assignmentRegisterPOST",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tahiring/assignmentRegisterPOST"})
        }
      """
    )
  
    // @LINE:331
    def taHiringStatusList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CourseTAAssignmentController.taHiringStatusList",
      """
        function(pageNum0,sortCriteria1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tahiring/statuslist/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum0)) + _qS([(sortCriteria1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("sortCriteria", sortCriteria1))])})
        }
      """
    )
  
    // @LINE:332
    def assignmentDetail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CourseTAAssignmentController.assignmentDetail",
      """
        function(Id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tahiring/statusDetail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("Id", Id0))})
        }
      """
    )
  
  }

  // @LINE:436
  class ReverseFileController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:436
    def getFile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FileController.getFile",
      """
        function(tableName0,challengeFileType1,tableRecorderId2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "file/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("tableName", tableName0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("challengeFileType", challengeFileType1)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("tableRecorderId", tableRecorderId2))})
        }
      """
    )
  
  }

  // @LINE:435
  class ReverseGraphController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:435
    def researchInterest: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GraphController.researchInterest",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "graphs/research"})
        }
      """
    )
  
  }

  // @LINE:312
  class ReverseTACandidateController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:316
    def getCurrentUserAssignments: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TACandidateController.getCurrentUserAssignments",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ta/weeklyhours"})
        }
      """
    )
  
    // @LINE:314
    def tacandidateList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TACandidateController.tacandidateList",
      """
        function(pageNum0,sortCriteria1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tapool/candidateList/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("pageNum", pageNum0)) + _qS([(sortCriteria1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("sortCriteria", sortCriteria1))])})
        }
      """
    )
  
    // @LINE:312
    def tacandidateRegisterPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TACandidateController.tacandidateRegisterPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tapool/tacandidateRegisterPage"})
        }
      """
    )
  
    // @LINE:313
    def tacandidateRegisterPOST: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TACandidateController.tacandidateRegisterPOST",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tapool/tacandidateRegisterPOST"})
        }
      """
    )
  
    // @LINE:315
    def tacandidateDetail: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TACandidateController.tacandidateDetail",
      """
        function(Id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tapool/tacandidateDetail/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("Id", Id0))})
        }
      """
    )
  
  }


}
