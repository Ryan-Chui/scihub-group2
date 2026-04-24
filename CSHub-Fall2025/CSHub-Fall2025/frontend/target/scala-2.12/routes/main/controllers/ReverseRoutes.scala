
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/conf/routes
// @DATE:Fri Apr 24 12:50:26 CDT 2026

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers {

  // @LINE:399
  class ReverseReviewerController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:404
    def reviewerDetailPage(userId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "reviewer/reviewerDetailPage/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("userId", userId)))
    }
  
    // @LINE:410
    def reviewerDelete(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "reviewer/reviewerDelete")
    }
  
    // @LINE:408
    def searchPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "reviewer/searchPage")
    }
  
    // @LINE:401
    def reviewerEditPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "reviewer/reviewerEditPage")
    }
  
    // @LINE:399
    def reviewerRegisterPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "reviewer/reviewerRegisterPage")
    }
  
    // @LINE:402
    def reviewerEditPOST(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "reviewer/reviewerEditPOST")
    }
  
    // @LINE:403
    def reviewerList(pageNum:Integer, sortCriteria:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "reviewer/reviewerList/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("pageNum", pageNum)) + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:409
    def searchPOST(pageNum:Integer = 1, sortCriteria:String = "id"): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "reviewer/searchPOST" + play.core.routing.queryString(List(if(pageNum == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("pageNum", pageNum)), if(sortCriteria == "id") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:400
    def reviewerRegisterPOST(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "reviewer/reviewerRegister")
    }
  
  }

  // @LINE:7
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def at(file:String): Call = {
    
      (file: @unchecked) match {
      
        // @LINE:7
        case (file)  =>
          implicit val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public")))
          Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
      
      }
    
    }
  
  }

  // @LINE:368
  class ReverseAdminController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:372
    def jobDetail(jobType:String, jobId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/jobs/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("jobType", jobType)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("jobId", jobId)))
    }
  
    // @LINE:373
    def organizationManagement(pageNum:Integer, sortCriteria:String = "id"): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/organizations/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("pageNum", pageNum)) + play.core.routing.queryString(List(if(sortCriteria == "id") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:374
    def technologyManagement(pageNum:Integer, sortCriteria:String = "id"): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/technologies/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("pageNum", pageNum)) + play.core.routing.queryString(List(if(sortCriteria == "id") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:368
    def dashboard(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/dashboard")
    }
  
    // @LINE:370
    def userDetail(userId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/users/detail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("userId", userId)))
    }
  
    // @LINE:371
    def jobManagement(pageNum:Integer, sortCriteria:String = "id"): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/jobs/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("pageNum", pageNum)) + play.core.routing.queryString(List(if(sortCriteria == "id") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:369
    def userManagement(pageNum:Integer, sortCriteria:String = "id"): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/users/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("pageNum", pageNum)) + play.core.routing.queryString(List(if(sortCriteria == "id") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("sortCriteria", sortCriteria)))))
    }
  
  }

  // @LINE:43
  class ReverseProjectController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:65
    def unFollowedByUser(id:Long, eventList:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "project/unFollowedByUser/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("eventList", eventList)))
    }
  
    // @LINE:68
    def addProjectFollowersPage(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "project/addProjectFollowersPage/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:43
    def projectRegisterPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "project/projectRegisterPage")
    }
  
    // @LINE:67
    def checkParentProject(parentProjectId:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "project/checkParentProject/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("parentProjectId", parentProjectId)))
    }
  
    // @LINE:52
    def deleteProject(projectId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "project/deleteProject/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("projectId", projectId)))
    }
  
    // @LINE:48
    def projectList(pageNum:Integer, sortCriteria:String = ""): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "project/projectList/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("pageNum", pageNum)) + play.core.routing.queryString(List(if(sortCriteria == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:62
    def getMyEnrolledProjects(pageNum:Integer, sortCriteria:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "project/myEnrolledProjects/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("pageNum", pageNum)) + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:49
    def projectDetail(projectId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "project/projectDetail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("projectId", projectId)))
    }
  
    // @LINE:69
    def addOneFollower(id:Long, event:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "project/addOneFollower/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("event", event)))
    }
  
    // @LINE:50
    def searchPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "project/searchPage")
    }
  
    // @LINE:54
    def uploadDescriptionImage(projectId:Long, imageNumber:Integer): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "project/uploadDescriptionImg/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("projectId", projectId)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("imageNumber", imageNumber)))
    }
  
    // @LINE:55
    def renameDescriptionImage(projectId:Long, imageNumber:Integer, currentImageNumber:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "project/renameDescriptionImg/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("projectId", projectId)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("imageNumber", imageNumber)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("currentImageNumber", currentImageNumber)))
    }
  
    // @LINE:64
    def followedByUser(id:Long, eventList:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "project/followedByUser/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("eventList", eventList)))
    }
  
    // @LINE:53
    def isProjectNameExisted(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "project/isProjectNameExisted")
    }
  
    // @LINE:59
    def isProjectExist(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "project/doesProjectExist/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:66
    def myFollowedProjects(page:Integer = 1, sortCriteria:String = ""): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "project/myFollowedProjects" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("page", page)), if(sortCriteria == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:45
    def projectEditPage(projectId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "project/projectEditPage/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("projectId", projectId)))
    }
  
    // @LINE:46
    def projectEditPOST(projectId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "project/projectEditPOST/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("projectId", projectId)))
    }
  
    // @LINE:70
    def deleteOneFollower(userId:Long, projectId:Long, eventType:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "project/deleteOneFollower/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("userId", userId)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("projectId", projectId)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("eventType", eventType)))
    }
  
    // @LINE:61
    def getProjectLists(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "project/getProjects")
    }
  
    // @LINE:60
    def associateProjectsToNotebook(notebookId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "project/associateProjectsToNotebook/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("notebookId", notebookId)))
    }
  
    // @LINE:44
    def projectRegisterPOST(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "project/projectRegisterPOST")
    }
  
    // @LINE:63
    def setProjectZoneAsGeoNEX(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "project/setProjectZoneAsGeoNEX")
    }
  
    // @LINE:51
    def searchPOST(pageNum:Integer, sortCriteria:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "project/searchPOST" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("pageNum", pageNum)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("sortCriteria", sortCriteria)))))
    }
  
  }

  // @LINE:340
  class ReverseTAJobController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:349
    def tajobApplicationDetail(tajobApplicationId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tajob/tajobApplicationDetail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("tajobApplicationId", tajobApplicationId)))
    }
  
    // @LINE:352
    def tajobList(pageNum:Integer, sortCriteria:String = ""): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tajob/tajobList/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("pageNum", pageNum)) + play.core.routing.queryString(List(if(sortCriteria == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:354
    def tajobDetail(tajobId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tajob/tajobDetail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("tajobId", tajobId)))
    }
  
    // @LINE:343
    def tajobEditPOST(tajobId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "tajob/tajobEditPOST/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("tajobId", tajobId)))
    }
  
    // @LINE:341
    def tajobRegisterPOST(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "tajob/tajobRegisterPOST")
    }
  
    // @LINE:340
    def tajobRegisterPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tajob/tajobRegisterPage")
    }
  
    // @LINE:342
    def tajobEditPage(tajobId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tajob/tajobEditPage/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("tajobId", tajobId)))
    }
  
    // @LINE:345
    def tajobApplyPOST(tajobId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tajob/tajobApplyPOST/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("tajobId", tajobId)))
    }
  
    // @LINE:355
    def searchPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tajob/searchPage")
    }
  
    // @LINE:357
    def deleteTAJob(tajobId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tajob/deleteTAJob/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("tajobId", tajobId)))
    }
  
    // @LINE:344
    def tajobApplyPage(tajobId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tajob/tajobApplyPage/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("tajobId", tajobId)))
    }
  
    // @LINE:347
    def tajobStatueChange(tajobId:Long, tajobStatus:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "tajob/tajobStatue/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("tajobId", tajobId)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("tajobStatus", tajobStatus)))
    }
  
    // @LINE:353
    def tajobListPostedByUser(pageNum:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tajob/tajobListPostedByUser/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("pageNum", pageNum)))
    }
  
    // @LINE:350
    def saveTAJobPdf(tajobApplicationId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "tajob/saveTAJobPdf/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("tajobApplicationId", tajobApplicationId)))
    }
  
    // @LINE:356
    def searchPOST(pageNum:Integer, sortCriteria:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "tajob/searchPOST" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("pageNum", pageNum)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("sortCriteria", sortCriteria)))))
    }
  
  }

  // @LINE:212
  class ReverseTechnologyController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:222
    def downloadTechnologyFile(serviceId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "technology/downloadPDFFile/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("serviceId", serviceId)))
    }
  
    // @LINE:221
    def deleteTechnology(technologyId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "technology/deleteTechnology/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("technologyId", technologyId)))
    }
  
    // @LINE:213
    def technologyRegisterPOST(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "technology/technologyRegisterPOST")
    }
  
    // @LINE:215
    def technologyEditPOST(technologyId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "technology/technologyEditPOST/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("technologyId", technologyId)))
    }
  
    // @LINE:219
    def searchPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "technology/searchPage")
    }
  
    // @LINE:214
    def technologyEditPage(technologyId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "technology/technologyEditPage/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("technologyId", technologyId)))
    }
  
    // @LINE:212
    def technologyRegisterPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "technology/technologyRegisterPage")
    }
  
    // @LINE:218
    def technologyDetail(technologyId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "technology/technologyDetail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("technologyId", technologyId)))
    }
  
    // @LINE:217
    def technologyList(pageNum:Integer, sortCriteria:String = ""): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "technology/technologyList/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("pageNum", pageNum)) + play.core.routing.queryString(List(if(sortCriteria == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:220
    def searchPOST(pageNum:Integer, sortCriteria:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "technology/searchPOST" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("pageNum", pageNum)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("sortCriteria", sortCriteria)))))
    }
  
  }

  // @LINE:414
  class ReversePaperController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:432
    def searchPaper(pageNum:Integer = 1, sortCriteria:String = "id"): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "paper/searchPaper" + play.core.routing.queryString(List(if(pageNum == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("pageNum", pageNum)), if(sortCriteria == "id") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:430
    def ldaTopicDistribution(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "paper/ldaTopicDistribution")
    }
  
    // @LINE:424
    def loadUploadPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "paper/loadDBLP")
    }
  
    // @LINE:429
    def authorAuthorRel(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "paper/authorRelation")
    }
  
    // @LINE:425
    def processDBPLFile(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "paper/uploadDBLP")
    }
  
    // @LINE:417
    def paperList(pageNum:Integer, sortCriteria:String = ""): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "paper/paperList/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("pageNum", pageNum)) + play.core.routing.queryString(List(if(sortCriteria == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:419
    def deletePaper(paperId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "paper/deletePaper/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("paperId", paperId)))
    }
  
    // @LINE:431
    def searchPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "paper/searchPage")
    }
  
    // @LINE:421
    def primeConnections(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "paper/primeConnections")
    }
  
    // @LINE:414
    def paperRegisterPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "paper/paperRegisterPage")
    }
  
    // @LINE:415
    def paperRegisterPOST(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "paper/paperRegisterPOST")
    }
  
    // @LINE:423
    def relationGraph(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "paper/relationGraph")
    }
  
    // @LINE:418
    def paperDetail(paperId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "paper/paperDetail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("paperId", paperId)))
    }
  
    // @LINE:427
    def paperLDA(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "paper/ldaPage")
    }
  
  }

  // @LINE:379
  class ReverseAuthorController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:386
    def userEditPageAdmin(userId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "author/userEditPageAdmin/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("userId", userId)))
    }
  
    // @LINE:396
    def topAuthors(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "author/topAuthors")
    }
  
    // @LINE:395
    def authorDelete(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "author/authorDelete")
    }
  
    // @LINE:389
    def userDetailPageAdmin(userId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "author/userDetailPageAdmin/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("userId", userId)))
    }
  
    // @LINE:387
    def userEditPOSTAdmin(userId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "author/userEditPOSTAdmin/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("userId", userId)))
    }
  
    // @LINE:393
    def searchPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "author/searchPage")
    }
  
    // @LINE:382
    def authorEditPOST(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "author/authorEditPOST")
    }
  
    // @LINE:380
    def authorRegisterPOST(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "author/authorRegister")
    }
  
    // @LINE:379
    def authorRegisterPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "author/authorRegisterPage")
    }
  
    // @LINE:381
    def authorEditPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "author/authorEditPage")
    }
  
    // @LINE:383
    def authorList(pageNum:Integer, sortCriteria:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "author/authorList/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("pageNum", pageNum)) + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:394
    def searchPOST(pageNum:Integer = 1, sortCriteria:String = "id"): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "author/searchPOST" + play.core.routing.queryString(List(if(pageNum == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("pageNum", pageNum)), if(sortCriteria == "id") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:388
    def userListAdmin(pageNum:Integer, sortCriteria:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "author/userListAdmin/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("pageNum", pageNum)) + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:384
    def authorDetailPage(userId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "author/authorDetailPage/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("userId", userId)))
    }
  
  }

  // @LINE:187
  class ReverseBugReportController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:192
    def bugReportList(page:Long = 1, sortCriteria:String = "publish_time_stamp" ): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "bugReport/bugReportList" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("page", page)), if(sortCriteria == "publish_time_stamp" ) None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:188
    def bugReportRegisterPOST(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "bugReport/bugReportRegisterPOST")
    }
  
    // @LINE:193
    def bugReportDelete(bugReportId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "bugReport/bugReportDelete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("bugReportId", bugReportId)))
    }
  
    // @LINE:195
    def markAsSolved(bugReportId:Long, fixerId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "bugReport/solve/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("bugReportId", bugReportId)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("fixerId", fixerId)))
    }
  
    // @LINE:189
    def bugReportEditPage(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "bugReport/bugReportEditPage/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:190
    def bugReportEditPOST(bugReportId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "bugReport/bugReportEditPost/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("bugReportId", bugReportId)))
    }
  
    // @LINE:187
    def bugReportRegisterPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "bugReport/bugReportRegisterPage")
    }
  
    // @LINE:191
    def bugReportDetail(bugReportId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "bugReport/bugReportDetail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("bugReportId", bugReportId)))
    }
  
  }

  // @LINE:11
  class ReverseAboutController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def aboutProject(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "aboutProject")
    }
  
    // @LINE:13
    def frequentlyAskedQuestions(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "frequentlyAskedQuestions")
    }
  
    // @LINE:14
    def popularQueries(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "popularQueries")
    }
  
    // @LINE:11
    def aboutUs(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "aboutUs")
    }
  
  }

  // @LINE:174
  class ReverseOrganizationController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:180
    def organizationRegisterPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "organization/organizationRegisterPage")
    }
  
    // @LINE:174
    def organizationDetailPageAdmin(organizationId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "organization/organizationDetailPageAdmin/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("organizationId", organizationId)))
    }
  
    // @LINE:182
    def searchPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "organization/searchPage")
    }
  
    // @LINE:179
    def organizationEditPOST(organizationId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "organization/organizationEditPOST" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("organizationId", organizationId)))))
    }
  
    // @LINE:178
    def organizationRegisterPOST(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "organization/organizationRegisterPOST")
    }
  
    // @LINE:175
    def organizationDetailPage(organizationId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "organization/organizationDetailPage/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("organizationId", organizationId)))
    }
  
    // @LINE:177
    def organizationListPage(pageNum:Integer, sortCriteria:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "organization/organizationListPage/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("pageNum", pageNum)) + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:181
    def organizationEditPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "organization/organizationEditPage")
    }
  
    // @LINE:183
    def searchPOST(pageNum:Integer = 1, sortCriteria:String = "id"): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "organization/searchPOST" + play.core.routing.queryString(List(if(pageNum == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("pageNum", pageNum)), if(sortCriteria == "id") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("sortCriteria", sortCriteria)))))
    }
  
  }

  // @LINE:323
  class ReverseCourseController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:323
    def courseList(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "courses")
    }
  
  }

  // @LINE:130
  class ReverseUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:140
    def userList(pageNum:Integer, sortCriteria:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/userList/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("pageNum", pageNum)) + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:147
    def unFollowedByUser(id:Long, page:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/unFollowedByUser/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("page", page)))
    }
  
    // @LINE:163
    def activateUser(hashcode:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "users/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("hashcode", hashcode)))
    }
  
    // @LINE:155
    def userDelete(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/userDelete")
    }
  
    // @LINE:133
    def userResetPassword(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "user/userResetPassword")
    }
  
    // @LINE:131
    def userForgotPasswordPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/userForgotPasswordPage")
    }
  
    // @LINE:136
    def userRegisterPOST(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "users/userRegister")
    }
  
    // @LINE:137
    def userEditPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/userEditPage")
    }
  
    // @LINE:134
    def updatePasswordPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/userUpdatePasswordPage")
    }
  
    // @LINE:138
    def userEditPOST(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "user/userEditPOST")
    }
  
    // @LINE:143
    def userLogin(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "user/userLogin")
    }
  
    // @LINE:135
    def updatePasswordForUser(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "user/userUpdatePasswordForUser")
    }
  
    // @LINE:139
    def isEmailExisted(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "user/isEmailExisted")
    }
  
    // @LINE:153
    def searchPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/searchPage")
    }
  
    // @LINE:132
    def resendActivationEmail(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/resendActivationEmail")
    }
  
    // @LINE:141
    def userDetailPage(userId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/userDetailPage/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("userId", userId)))
    }
  
    // @LINE:161
    def mySpacePage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/mySpace")
    }
  
    // @LINE:130
    def userRegisterPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/userRegisterPage")
    }
  
    // @LINE:146
    def followedByUser(id:Long, page:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/followedByUser/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("page", page)))
    }
  
    // @LINE:159
    def myFollowees(page:Integer = 1, sortCriteria:String = "id", isCallerMySpacePage:Boolean = false): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/myFollowees" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("page", page)), if(sortCriteria == "id") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("sortCriteria", sortCriteria)), if(isCallerMySpacePage == false) None else Some(implicitly[play.api.mvc.QueryStringBindable[Boolean]].unbind("isCallerMySpacePage", isCallerMySpacePage)))))
    }
  
    // @LINE:170
    def userSaved(hashcode:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "users/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("hashcode", hashcode)))
    }
  
    // @LINE:144
    def userImageByImageId(imageId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/userImageByImageId/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("imageId", imageId)))
    }
  
    // @LINE:150
    def checkPassword(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "user/checkCurPassword")
    }
  
    // @LINE:149
    def updatePassword(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "user/updatePassword")
    }
  
    // @LINE:158
    def myFollowers(page:Integer = 1, sortCriteria:String = "id"): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/myFollowers" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("page", page)), if(sortCriteria == "id") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:148
    def updateLevel(uid:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "user/updateLevel/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("uid", uid)))
    }
  
    // @LINE:145
    def validateEmail(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "user/validateEmail")
    }
  
    // @LINE:154
    def searchPOST(pageNum:Integer = 1, sortCriteria:String = "id"): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "user/searchPOST" + play.core.routing.queryString(List(if(pageNum == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("pageNum", pageNum)), if(sortCriteria == "id") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:156
    def allUserIds(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/allUserIds")
    }
  
  }

  // @LINE:199
  class ReverseSuggestionController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:203
    def suggestionDetail(suggestionId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "suggestion/suggestionDetail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("suggestionId", suggestionId)))
    }
  
    // @LINE:207
    def markAsSolved(suggestionId:Long, implementorId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "suggestion/solve/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("suggestionId", suggestionId)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("implementorId", implementorId)))
    }
  
    // @LINE:201
    def suggestionEditPage(suggestionId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "suggestion/suggestionEditPage/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("suggestionId", suggestionId)))
    }
  
    // @LINE:199
    def suggestionRegisterPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "suggestion/suggestionRegisterPage")
    }
  
    // @LINE:204
    def suggestionList(page:Long = 1, sortCriteria:String = "publish_time_stamp" ): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "suggestion/suggestionList" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("page", page)), if(sortCriteria == "publish_time_stamp" ) None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:200
    def suggestionRegisterPOST(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "suggestion/suggestionRegisterPOST")
    }
  
    // @LINE:202
    def suggestionEditPOST(suggestionId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "suggestion/suggestionEditPOST/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("suggestionId", suggestionId)))
    }
  
    // @LINE:205
    def suggestionDelete(suggestionId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "suggestion/suggestionDelete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("suggestionId", suggestionId)))
    }
  
  }

  // @LINE:5
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:5
    def message(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }

  // @LINE:276
  class ReverseRAJobController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:296
    def deleteRAJob(rajobId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "rajob/deleteRAJob/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("rajobId", rajobId)))
    }
  
    // @LINE:291
    def rajobListAppliedByUser(pageNum:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "rajob/rajobListAppliedByUser/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("pageNum", pageNum)))
    }
  
    // @LINE:280
    def rajobApplyPage(rajobId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "rajob/rajobApplyPage/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("rajobId", rajobId)))
    }
  
    // @LINE:284
    def rajobApplicationStatusChange(rajobApplicationId:Long, rajobApplicationStatus:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "rajob/rajobApplicationStatusChange/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("rajobApplicationId", rajobApplicationId)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("rajobApplicationStatus", rajobApplicationStatus)))
    }
  
    // @LINE:306
    def sendOfferEmail(rajobApplicationId:Long, ccString:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "rajob/sendOfferEmail" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("rajobApplicationId", rajobApplicationId)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("ccString", ccString)))))
    }
  
    // @LINE:278
    def rajobEditPage(rajobId:Long, status:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "rajob/rajobEditPage/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("rajobId", rajobId)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("status", status)))
    }
  
    // @LINE:286
    def rajobApplicationDetail(rajobApplicationId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "rajob/rajobApplicationDetail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("rajobApplicationId", rajobApplicationId)))
    }
  
    // @LINE:294
    def searchPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "rajob/searchPage")
    }
  
    // @LINE:279
    def rajobEditPOST(rajobId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "rajob/rajobEditPOST/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("rajobId", rajobId)))
    }
  
    // @LINE:290
    def rajobListPostedByUser(pageNum:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "rajob/rajobListPostedByUser/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("pageNum", pageNum)))
    }
  
    // @LINE:289
    def rajobList(pageNum:Integer, sortCriteria:String = ""): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "rajob/rajobList/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("pageNum", pageNum)) + play.core.routing.queryString(List(if(sortCriteria == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:276
    def rajobRegisterPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "rajob/rajobRegisterPage")
    }
  
    // @LINE:281
    def rajobApplyPOST(rajobId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "rajob/rajobApplyPOST/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("rajobId", rajobId)))
    }
  
    // @LINE:297
    def closeRAJob(rajobId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "rajob/closeRAJob/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("rajobId", rajobId)))
    }
  
    // @LINE:295
    def searchPOST(pageNum:Integer, sortCriteria:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "rajob/searchPOST" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("pageNum", pageNum)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:283
    def rajobStatueChange(rajobId:Long, rajobStatus:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "rajob/rajobStatue/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("rajobId", rajobId)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("rajobStatus", rajobStatus)))
    }
  
    // @LINE:277
    def rajobRegisterPOST(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "rajob/rajobRegisterPOST")
    }
  
    // @LINE:293
    def rajobDetail(rajobId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "rajob/rajobDetail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("rajobId", rajobId)))
    }
  
  }

  // @LINE:75
  class ReverseChallengeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:82
    def challengeEditPOST(challengeId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "challenge/challengeEditPOST/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("challengeId", challengeId)))
    }
  
    // @LINE:89
    def challengeApplicationStatusChange(challengeApplicationId:Long, challengeApplicationStatus:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "challenge/challengeApplicationStatusChange/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("challengeApplicationId", challengeApplicationId)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("challengeApplicationStatus", challengeApplicationStatus)))
    }
  
    // @LINE:83
    def challengeEditPOSTAdmin(challengeId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "challenge/challengeEditPOSTAdmin/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("challengeId", challengeId)))
    }
  
    // @LINE:78
    def challengeApplyPage(challengeId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "challenge/challengeApplyPage/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("challengeId", challengeId)))
    }
  
    // @LINE:84
    def closeChallenge(challengeId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "challenge/closeChallenge/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("challengeId", challengeId)))
    }
  
    // @LINE:95
    def challengeStatusChange(challengeId:Long, challengeStatus:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "challenge/challengeStatus/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("challengeId", challengeId)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("challengeStatus", challengeStatus)))
    }
  
    // @LINE:92
    def challengeApplicationList(pageNum:Integer, sortCriteria:String = ""): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "challenge/challengeApplicationList/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("pageNum", pageNum)) + play.core.routing.queryString(List(if(sortCriteria == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:96
    def challengeApplicationsDetail(challengeApplicationId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "challenge/challengeApplicationsDetail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("challengeApplicationId", challengeApplicationId)))
    }
  
    // @LINE:101
    def searchPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "challenge/searchPage")
    }
  
    // @LINE:98
    def challengeList(pageNum:Integer, sortCriteria:String = ""): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "challenge/challengeList/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("pageNum", pageNum)) + play.core.routing.queryString(List(if(sortCriteria == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:85
    def challengeApplicationsList(challengeType:String, challengeId:Long, pageNum:Integer = 1, sortCriteria:String = ""): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "challenge/applications/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("challengeType", challengeType)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("challengeId", challengeId)) + play.core.routing.queryString(List(if(pageNum == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("pageNum", pageNum)), if(sortCriteria == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:99
    def challengeListAdmin(pageNum:Integer, sortCriteria:String = ""): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "challenge/challengeListAdmin/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("pageNum", pageNum)) + play.core.routing.queryString(List(if(sortCriteria == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:79
    def challengeApplyPOST(challengeId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "challenge/challengeApplyPOST/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("challengeId", challengeId)))
    }
  
    // @LINE:94
    def challengeApplicationDetail(challengeApplicationId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "challenge/challengeApplicationDetail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("challengeApplicationId", challengeApplicationId)))
    }
  
    // @LINE:80
    def challengeEditPage(challengeId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "challenge/challengeEditPage/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("challengeId", challengeId)))
    }
  
    // @LINE:76
    def challengeRegisterPOST(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "challenge/challengeRegisterPOST")
    }
  
    // @LINE:93
    def challengeListPostedByUser(pageNum:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "challenge/challengeListPostedByUser/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("pageNum", pageNum)))
    }
  
    // @LINE:75
    def challengeRegisterPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "challenge/challengeRegisterPage")
    }
  
    // @LINE:81
    def challengeEditPageAdmin(challengeId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "challenge/challengeEditPageAdmin/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("challengeId", challengeId)))
    }
  
    // @LINE:100
    def challengeDetail(challengeId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "challenge/challengeDetail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("challengeId", challengeId)))
    }
  
    // @LINE:102
    def searchPOST(pageNum:Integer, sortCriteria:String = ""): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "challenge/searchPOST/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("pageNum", pageNum)) + play.core.routing.queryString(List(if(sortCriteria == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:91
    def challengeListAppliedByUser(pageNum:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "challenge/challengeListAppliedByUser/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("pageNum", pageNum)))
    }
  
  }

  // @LINE:22
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:31
    def updateProjectZone(view:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateProjectZone/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("view", view)))
    }
  
    // @LINE:25
    def createUserSuccess(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "createUserSuccess")
    }
  
    // @LINE:27
    def showVerificationEmailIsSent(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "showVerificationEmailIsSent")
    }
  
    // @LINE:26
    def showLinkIsAlreadyClick(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "showLinkIsAlreadyClick")
    }
  
    // @LINE:32
    def getImageFromPath(filePath:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "getimage" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("filePath", filePath)))))
    }
  
    // @LINE:28
    def showVerificationEmailIsExpired(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "showVerificationEmailIsExpired")
    }
  
    // @LINE:30
    def updatePassword(email:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updatePassword" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("email", email)))))
    }
  
    // @LINE:24
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:33
    def getDefaultAvatar(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "getDefualtAvatar")
    }
  
    // @LINE:29
    def deleteAccount(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deleteAccount")
    }
  
    // @LINE:22
    def home(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:23
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:240
  class ReverseJobController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:251
    def jobDetail(jobId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "job/jobDetail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("jobId", jobId)))
    }
  
    // @LINE:256
    def jobStatueChange(jobId:Long, jobStatus:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "job/jobStatue/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("jobId", jobId)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("jobStatus", jobStatus)))
    }
  
    // @LINE:243
    def jobEditPOST(jobId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "job/jobEditPOST/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("jobId", jobId)))
    }
  
    // @LINE:246
    def jobApplicationList(pageNum:Integer, sortCriteria:String = ""): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "job/jobApplicationList/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("pageNum", pageNum)) + play.core.routing.queryString(List(if(sortCriteria == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:247
    def jobListAppliedByUser(pageNum:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "job/listAppliedByUser/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("pageNum", pageNum)))
    }
  
    // @LINE:254
    def deleteJob(jobId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "job/deleteJob/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("jobId", jobId)))
    }
  
    // @LINE:252
    def searchPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "job/searchPage")
    }
  
    // @LINE:269
    def jobApplicationsList(jobType:String, jobId:Long, pageNum:Integer, sortCriteria:String = ""): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "job/applications/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("jobType", jobType)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("jobId", jobId)) + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("pageNum", pageNum)), if(sortCriteria == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:241
    def jobRegisterPOST(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "job/jobRegisterPOST")
    }
  
    // @LINE:258
    def jobApplicationDetail(jobApplicationId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "job/jobApplicationDetail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("jobApplicationId", jobApplicationId)))
    }
  
    // @LINE:240
    def jobRegisterPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "job/jobRegisterPage")
    }
  
    // @LINE:244
    def jobApplyPage(jobId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "job/jobApplyPage/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("jobId", jobId)))
    }
  
    // @LINE:245
    def jobApplyPOST(jobId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "job/jobApplyPOST/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("jobId", jobId)))
    }
  
    // @LINE:249
    def jobList(pageNum:Integer, sortCriteria:String = ""): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "job/jobList/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("pageNum", pageNum)) + play.core.routing.queryString(List(if(sortCriteria == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:250
    def jobListPostedByUser(pageNum:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "job/jobListPostedByUser/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("pageNum", pageNum)))
    }
  
    // @LINE:253
    def searchPOST(pageNum:Integer, sortCriteria:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "job/searchPOST" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("pageNum", pageNum)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:242
    def jobEditPage(jobId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "job/jobEditPage/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("jobId", jobId)))
    }
  
  }

  // @LINE:331
  class ReverseCourseTAAssignmentController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:333
    def assignmentRegisterPOST(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "tahiring/assignmentRegisterPOST")
    }
  
    // @LINE:331
    def taHiringStatusList(pageNum:Integer, sortCriteria:String = ""): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tahiring/statuslist/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("pageNum", pageNum)) + play.core.routing.queryString(List(if(sortCriteria == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:332
    def assignmentDetail(Id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tahiring/statusDetail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("Id", Id)))
    }
  
  }

  // @LINE:436
  class ReverseFileController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:436
    def getFile(tableName:String, challengeFileType:String, tableRecorderId:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "file/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("tableName", tableName)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("challengeFileType", challengeFileType)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("tableRecorderId", tableRecorderId)))
    }
  
  }

  // @LINE:435
  class ReverseGraphController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:435
    def researchInterest(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "graphs/research")
    }
  
  }

  // @LINE:312
  class ReverseTACandidateController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:316
    def getCurrentUserAssignments(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "ta/weeklyhours")
    }
  
    // @LINE:314
    def tacandidateList(pageNum:Integer, sortCriteria:String = ""): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tapool/candidateList/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("pageNum", pageNum)) + play.core.routing.queryString(List(if(sortCriteria == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:312
    def tacandidateRegisterPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tapool/tacandidateRegisterPage")
    }
  
    // @LINE:313
    def tacandidateRegisterPOST(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "tapool/tacandidateRegisterPOST")
    }
  
    // @LINE:315
    def tacandidateDetail(Id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tapool/tacandidateDetail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("Id", Id)))
    }
  
  }


}
