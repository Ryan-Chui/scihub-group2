// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ryan1/CSHub-Fall2025/CSHub-Fall2025/backend/conf/routes
// @DATE:Fri Apr 10 13:06:00 CDT 2026

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:40
package controllers {

  // @LINE:407
  class ReverseReviewerController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:408
    def reviewerDetail(userId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "reviewer/reviewerDetail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("userId", userId)))
    }
  
    // @LINE:410
    def reviewerList(pageLimit:java.util.Optional[Integer], offset:java.util.Optional[Integer], sortCriteria:java.util.Optional[String]): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "reviewer/reviewerList" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[Integer]]].unbind("pageLimit", pageLimit)), Some(implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[Integer]]].unbind("offset", offset)), Some(implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[String]]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:412
    def searchReviewerByCondition(pageLimit:java.util.Optional[Integer], offset:java.util.Optional[Integer], sortCriteria:java.util.Optional[String]): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "reviewer/search/conditions" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[Integer]]].unbind("pageLimit", pageLimit)), Some(implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[Integer]]].unbind("offset", offset)), Some(implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[String]]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:407
    def addReviewer(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "reviewer/addReviewer")
    }
  
    // @LINE:409
    def updateReviewer(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "reviewer/updateReviewer")
    }
  
  }

  // @LINE:63
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:63
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:378
  class ReverseAdminController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:381
    def getJobList(pageNum:Integer = 1, pageLimit:Integer = 20, sortCriteria:String = "id"): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/jobs" + play.core.routing.queryString(List(if(pageNum == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("pageNum", pageNum)), if(pageLimit == 20) None else Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("pageLimit", pageLimit)), if(sortCriteria == "id") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:380
    def updateUserStatus(userId:Long): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "admin/users/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("userId", userId)) + "/status")
    }
  
    // @LINE:378
    def getUserList(pageNum:Integer = 1, pageLimit:Integer = 20, sortCriteria:String = "id"): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/users" + play.core.routing.queryString(List(if(pageNum == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("pageNum", pageNum)), if(pageLimit == 20) None else Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("pageLimit", pageLimit)), if(sortCriteria == "id") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:379
    def getUserDetail(userId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/users/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("userId", userId)))
    }
  
    // @LINE:382
    def getJobDetail(jobType:String, jobId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/jobs/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("jobType", jobType)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("jobId", jobId)))
    }
  
    // @LINE:383
    def getOrganizationList(pageNum:Integer = 1, pageLimit:Integer = 20, sortCriteria:String = "id"): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/organizations" + play.core.routing.queryString(List(if(pageNum == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("pageNum", pageNum)), if(pageLimit == 20) None else Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("pageLimit", pageLimit)), if(sortCriteria == "id") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:384
    def getTechnologyList(pageNum:Integer = 1, pageLimit:Integer = 20, sortCriteria:String = "id"): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/technologies" + play.core.routing.queryString(List(if(pageNum == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("pageNum", pageNum)), if(pageLimit == 20) None else Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("pageLimit", pageLimit)), if(sortCriteria == "id") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("sortCriteria", sortCriteria)))))
    }
  
  }

  // @LINE:72
  class ReverseProjectController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:77
    def getTeamMembersByProjectId(projectId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "project/teammember/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("projectId", projectId)))
    }
  
    // @LINE:75
    def deleteProjectPDF(projectId:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "project/deleteProjectPDF/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("projectId", projectId)))
    }
  
    // @LINE:72
    def addProject(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "project/addProject")
    }
  
    // @LINE:87
    def deleteProject(projectId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "project/deleteProject/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("projectId", projectId)))
    }
  
    // @LINE:90
    def checkProjectNameAvailability(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "project/isProjectNameExisted")
    }
  
    // @LINE:94
    def getMyEnrolledProjects(pageLimit:Integer, pageNum:Integer, sortCriteria:java.util.Optional[String], userId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "project/getMyEnrolledProjects" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("pageLimit", pageLimit)), Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("pageNum", pageNum)), Some(implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[String]]].unbind("sortCriteria", sortCriteria)), Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("userId", userId)))))
    }
  
    // @LINE:73
    def updateProject(projectId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "project/updateProject/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("projectId", projectId)))
    }
  
    // @LINE:89
    def checkProjectExist(projectId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "project/checkProjectExist/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("projectId", projectId)))
    }
  
    // @LINE:88
    def getProjectsByCreator(userId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "project/getProjectsByUser/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("userId", userId)))
    }
  
    // @LINE:91
    def saveDescriptionImage(projectId:Long, imageNumber:Integer): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "project/saveDescriptionImage/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("projectId", projectId)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("imageNumber", imageNumber)))
    }
  
    // @LINE:99
    def getIdByName(name:String): Call = {
    
      (name: @unchecked) match {
      
        // @LINE:99
        case (name)  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "project/getIdByName/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)))
      
      }
    
    }
  
    // @LINE:79
    def getProjectById(projectId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "project/projectDetail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("projectId", projectId)))
    }
  
    // @LINE:83
    def setPDF(projectId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "project/setPDF/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("projectId", projectId)))
    }
  
    // @LINE:84
    def addTeamMember(projectId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "project/addTeamMember/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("projectId", projectId)))
    }
  
    // @LINE:92
    def renameDescriptionImage(projectId:Long, imageNumber:Integer, currentImageNumber:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "project/renameDescriptionImage/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("projectId", projectId)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("imageNumber", imageNumber)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("currentImageNumber", currentImageNumber)))
    }
  
    // @LINE:80
    def getProjectCreator(projectId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "project/getProjectCreator/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("projectId", projectId)))
    }
  
    // @LINE:97
    def updateProjectDes(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "project/updatedes")
    }
  
    // @LINE:86
    def deleteTeamMember(memberId:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "project/deleteTeamMember/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("memberId", memberId)))
    }
  
    // @LINE:85
    def setTeamMemberPhoto(memberId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "project/setTeamMemberPhoto/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("memberId", memberId)))
    }
  
    // @LINE:76
    def projectList(userId:Long, pageLimit:Integer, pageNum:Integer, sortCriteria:java.util.Optional[String]): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "project/projectList/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("userId", userId)) + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("pageLimit", pageLimit)), Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("pageNum", pageNum)), Some(implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[String]]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:82
    def setImage(projectId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "project/setImage/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("projectId", projectId)))
    }
  
    // @LINE:96
    def getAllProject(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "project/allproject")
    }
  
    // @LINE:81
    def searchProjectsByCondition(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "project/search/conditions")
    }
  
    // @LINE:74
    def deleteProjectImage(projectId:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "project/deleteProjectImage/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("projectId", projectId)))
    }
  
  }

  // @LINE:211
  class ReverseTAJobController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:221
    def getTAJobById(tajobId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tajob/tajobDetail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("tajobId", tajobId)))
    }
  
    // @LINE:227
    def getTAJobsByPublisher(userId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tajob/getTAJobsByUser/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("userId", userId)))
    }
  
    // @LINE:228
    def checkTAJobExist(tajobId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tajob/checkTAJobExist/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("tajobId", tajobId)))
    }
  
    // @LINE:214
    def deleteTAJobPDF(tajobId:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "tajob/deleteTAJobPDF/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("tajobId", tajobId)))
    }
  
    // @LINE:217
    def tajobUpdateStatue(tajobId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "tajob/updateStatus/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("tajobId", tajobId)))
    }
  
    // @LINE:222
    def getTAJobPublisher(tajobId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tajob/getTAJobPublisher/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("tajobId", tajobId)))
    }
  
    // @LINE:212
    def updateTAJob(tajobId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "tajob/updateTAJob/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("tajobId", tajobId)))
    }
  
    // @LINE:230
    def getIdByName(name:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tajob/getIdByName/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)))
    }
  
    // @LINE:226
    def deleteTAJob(tajobId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tajob/deleteTAJob/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("tajobId", tajobId)))
    }
  
    // @LINE:225
    def setPDF(tajobId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "tajob/setPDF/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("tajobId", tajobId)))
    }
  
    // @LINE:215
    def tajobList(userId:Long, pageLimit:Integer, pageNum:Integer, sortCriteria:java.util.Optional[String]): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tajob/tajobList/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("userId", userId)) + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("pageLimit", pageLimit)), Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("pageNum", pageNum)), Some(implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[String]]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:218
    def getTAJobApplicationById(tajobApplicationId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tajob/tajobApplicationDetail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("tajobApplicationId", tajobApplicationId)))
    }
  
    // @LINE:229
    def checkTAJobNameAvailability(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "tajob/isTAJobNameExisted")
    }
  
    // @LINE:223
    def searchTAJobsByCondition(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "tajob/search/conditions")
    }
  
    // @LINE:211
    def addTAJob(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "tajob/addTAJob")
    }
  
    // @LINE:213
    def deleteTAJobImage(tajobId:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "tajob/deleteTAJobImage/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("tajobId", tajobId)))
    }
  
    // @LINE:224
    def setImage(tajobId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "tajob/setImage/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("tajobId", tajobId)))
    }
  
    // @LINE:216
    def applyTAJob(tajobId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "tajob/applyTAJob/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("tajobId", tajobId)))
    }
  
  }

  // @LINE:343
  class ReverseTechnologyController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:343
    def addTechnology(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "technology/addTechnology")
    }
  
    // @LINE:352
    def searchTechnologiesByCondition(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "technology/search/conditions")
    }
  
    // @LINE:445
    def setFiles(serviceId:Long, fileName:String, fileType:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "technology/setFiles/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("serviceId", serviceId)) + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("fileName", fileName)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("fileType", fileType)))))
    }
  
    // @LINE:446
    def getFileById(serviceId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "technology/fileDetail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("serviceId", serviceId)))
    }
  
    // @LINE:347
    def technologyList(userId:Long, pageLimit:Integer, pageNum:Integer, sortCriteria:java.util.Optional[String]): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "technology/technologyList/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("userId", userId)) + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("pageLimit", pageLimit)), Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("pageNum", pageNum)), Some(implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[String]]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:350
    def getTechnologyById(technologyId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "technology/technologyDetail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("technologyId", technologyId)))
    }
  
    // @LINE:344
    def updateTechnology(technologyId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "technology/updateTechnology/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("technologyId", technologyId)))
    }
  
  }

  // @LINE:419
  class ReversePaperController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:436
    def paperSearchList(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "paper/search")
    }
  
    // @LINE:433
    def authorRelation(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "paper/authorRelation")
    }
  
    // @LINE:435
    def ldaTopicDistribution(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "paper/ldaTopicList")
    }
  
    // @LINE:430
    def paperAuthorList(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "paper/paperAuthorList")
    }
  
    // @LINE:419
    def addPaper(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "paper/addPaper")
    }
  
    // @LINE:422
    def deletePaper(paperId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "paper/deletePaper" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("paperId", paperId)))))
    }
  
    // @LINE:424
    def getPaperById(paperId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "paper/paperDetail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("paperId", paperId)))
    }
  
    // @LINE:421
    def getAuthorByPaperId(paperId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "paper/author" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("paperId", paperId)))))
    }
  
    // @LINE:426
    def deleteAuthor(memberId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "paper/deleteAuthor" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("memberId", memberId)))))
    }
  
    // @LINE:431
    def storeDBLP(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "paper/loadPaper")
    }
  
    // @LINE:434
    def storeDBLPSchema(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "paper/loadSchema")
    }
  
    // @LINE:425
    def addAuthor(paperId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "paper/addAuthor/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("paperId", paperId)))
    }
  
    // @LINE:420
    def paperList(pageLimit:java.util.Optional[Integer], offset:java.util.Optional[Integer], sortCriteria:java.util.Optional[String]): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "paper/paperList" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[Integer]]].unbind("pageLimit", pageLimit)), Some(implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[Integer]]].unbind("offset", offset)), Some(implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[String]]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:432
    def loadLDA(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "paper/lda")
    }
  
  }

  // @LINE:393
  class ReverseAuthorController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:400
    def userListAdmin(pageLimit:java.util.Optional[Integer], offset:java.util.Optional[Integer], sortCriteria:java.util.Optional[String]): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "author/userListAdmin" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[Integer]]].unbind("pageLimit", pageLimit)), Some(implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[Integer]]].unbind("offset", offset)), Some(implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[String]]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:403
    def topAuthors(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "author/topAuthors")
    }
  
    // @LINE:393
    def addAuthor(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "author/addAuthor")
    }
  
    // @LINE:394
    def authorDetail(userId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "author/authorDetail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("userId", userId)))
    }
  
    // @LINE:398
    def userDetailAdmin(userId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "author/userDetailAdmin/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("userId", userId)))
    }
  
    // @LINE:399
    def updateUserAdmin(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "author/updateUserAdmin")
    }
  
    // @LINE:396
    def authorList(pageLimit:java.util.Optional[Integer], offset:java.util.Optional[Integer], sortCriteria:java.util.Optional[String]): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "author/authorList" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[Integer]]].unbind("pageLimit", pageLimit)), Some(implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[Integer]]].unbind("offset", offset)), Some(implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[String]]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:402
    def searchAuthorByCondition(pageLimit:java.util.Optional[Integer], offset:java.util.Optional[Integer], sortCriteria:java.util.Optional[String]): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "author/search" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[Integer]]].unbind("pageLimit", pageLimit)), Some(implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[Integer]]].unbind("offset", offset)), Some(implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[String]]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:395
    def updateAuthor(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "author/updateAuthor")
    }
  
  }

  // @LINE:320
  class ReverseBugReportController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:321
    def getBugReport(id:Long): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("format", "json"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "bugReport/getBugReport/id/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:324
    def updateBugReportSolved(bugId:Long, fixerId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "bugReport/updateBugReportSolved/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("bugId", bugId)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("fixerId", fixerId)))
    }
  
    // @LINE:320
    def addBugReport(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "bugReport/addBugReport")
    }
  
    // @LINE:327
    def getAllUnsolvedBugReports(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "bugReport/getAllUnsolvedBugReports/json")
    }
  
    // @LINE:323
    def deleteBugReport(id:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "bugReport/deleteBugReport/id/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:328
    def getAllSolvedBugReports(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "bugReport/getAllSolvedBugReports/json")
    }
  
    // @LINE:325
    def getAllBugReports(pageLimit:java.util.Optional[Integer], offset:java.util.Optional[Integer], sortCriteria:java.util.Optional[String]): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "bugReport/getAllBugReports/json" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[Integer]]].unbind("pageLimit", pageLimit)), Some(implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[Integer]]].unbind("offset", offset)), Some(implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[String]]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:322
    def updateBugReport(id:Long): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "bugReport/updateBugReport/id/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
  }

  // @LINE:50
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:50
    def count(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }

  // @LINE:307
  class ReverseOrganizationController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:307
    def organizationList(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "organization/organizationList")
    }
  
    // @LINE:312
    def organizationUpdate(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "organization/organizationUpdate")
    }
  
    // @LINE:313
    def organizationListbyName(pageLimit:java.util.Optional[Integer], offset:java.util.Optional[Integer], sortCriteria:java.util.Optional[String]): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "organization/organizationListByName" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[Integer]]].unbind("pageLimit", pageLimit)), Some(implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[Integer]]].unbind("offset", offset)), Some(implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[String]]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:309
    def addUsers(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "organization/addUsers")
    }
  
    // @LINE:311
    def organizationDetail(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "organization/organizationDetail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:308
    def organizationListPage(pageLimit:java.util.Optional[Integer], offset:java.util.Optional[Integer], sortCriteria:java.util.Optional[String]): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "organization/organizationListPage" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[Integer]]].unbind("pageLimit", pageLimit)), Some(implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[Integer]]].unbind("offset", offset)), Some(implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[String]]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:310
    def registerOrganization(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "organization/register")
    }
  
  }

  // @LINE:247
  class ReverseCourseController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:249
    def approveTA(courseId:Long, week:Int): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "courses/approve/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("courseId", courseId)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("week", week)))
    }
  
    // @LINE:248
    def getCourseDetails(courseId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "courses/details/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("courseId", courseId)))
    }
  
    // @LINE:247
    def listCourses(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "courses")
    }
  
  }

  // @LINE:266
  class ReverseUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:298
    def userActivation(hashcode:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "users/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("hashcode", hashcode)))
    }
  
    // @LINE:270
    def updateUser(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "user/updateUser")
    }
  
    // @LINE:295
    def getActiveUsers(): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("format", "json"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "user/getActiveUsers/json")
    }
  
    // @LINE:281
    def autoRegisterUser(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "user/autoRegisterUser")
    }
  
    // @LINE:285
    def getAllNormalUsers(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/getAllNormalUsers")
    }
  
    // @LINE:296
    def sendPasswordEmail(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "user/sendPasswordEmail")
    }
  
    // @LINE:266
    def addUser(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "user/addUser")
    }
  
    // @LINE:268
    def getResearcherInfo(userId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/getResearcherInfo/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("userId", userId)))
    }
  
    // @LINE:286
    def updateImageByUserId(userId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "user/updateImageForUser/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("userId", userId)))
    }
  
    // @LINE:299
    def sendRegisterEmail(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "user/validate")
    }
  
    // @LINE:293
    def userSearch(display_name:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/search/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("display_name", display_name)))
    }
  
    // @LINE:271
    def userLogin(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "user/userLogin")
    }
  
    // @LINE:267
    def userDetail(userId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/userDetail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("userId", userId)))
    }
  
    // @LINE:303
    def getUserByEmail(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "user/getUserByEmail")
    }
  
    // @LINE:277
    def inactivateUserPOST(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "user/userDelete")
    }
  
    // @LINE:300
    def resendRegisterEmail(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "user/validate/resend")
    }
  
    // @LINE:287
    def deleteImageByUserId(userId:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "user/deleteImageForUser/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("userId", userId)))
    }
  
    // @LINE:273
    def userList(pageLimit:java.util.Optional[Integer], offset:java.util.Optional[Integer], sortCriteria:java.util.Optional[String]): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/userList" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[Integer]]].unbind("pageLimit", pageLimit)), Some(implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[Integer]]].unbind("offset", offset)), Some(implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[String]]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:269
    def getStudentInfo(userId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/getStudentInfo/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("userId", userId)))
    }
  
    // @LINE:276
    def searchUserByCondition(pageLimit:java.util.Optional[Integer], offset:java.util.Optional[Integer], sortCriteria:java.util.Optional[String]): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "user/search/conditions" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[Integer]]].unbind("pageLimit", pageLimit)), Some(implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[Integer]]].unbind("offset", offset)), Some(implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[String]]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:297
    def updatePassword(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "user/updatePassword")
    }
  
    // @LINE:284
    def getAllUsersInAllRoles(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/getAllUsers")
    }
  
    // @LINE:302
    def updateLevel(uid:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "user/updateLevel/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("uid", uid)))
    }
  
    // @LINE:274
    def validateEmail(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "user/validateEmail")
    }
  
    // @LINE:272
    def checkNewUserEmailAvailability(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "user/checkEmail")
    }
  
  }

  // @LINE:40
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:40
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:334
  class ReverseSuggestionController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:336
    def suggestionList(pageLimit:java.util.Optional[Integer], offset:java.util.Optional[Integer], sortCriteria:java.util.Optional[String]): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "suggestion/suggestionList/json" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[Integer]]].unbind("pageLimit", pageLimit)), Some(implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[Integer]]].unbind("offset", offset)), Some(implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[String]]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:335
    def getSuggestion(id:Long): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("format", "json"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "suggestion/getSuggestion/id/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:338
    def deleteSuggestion(id:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "suggestion/deleteSuggestion/id/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:334
    def addSuggestion(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "suggestion/addSuggestion")
    }
  
    // @LINE:337
    def updateSuggestion(id:Long): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "suggestion/updateSuggestion/id/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:339
    def updateSuggestionSolved(suggestionId:Long, implementorId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "suggestion/updateSuggestionSolve/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("suggestionId", suggestionId)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("implementorId", implementorId)))
    }
  
  }

  // @LINE:60
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:60
    def message(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }

  // @LINE:180
  class ReverseRAJobController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:206
    def listProfessorsJson(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "rajob/professors")
    }
  
    // @LINE:197
    def deleteRAJob(rajobId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "rajob/deleteRAJob/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("rajobId", rajobId)))
    }
  
    // @LINE:205
    def sendRAJobAppliedEmail(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "rajob/sendAppliedEmail")
    }
  
    // @LINE:192
    def getRAJobById(rajobId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "rajob/rajobDetail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("rajobId", rajobId)))
    }
  
    // @LINE:180
    def addRAJob(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "rajob/addRAJob")
    }
  
    // @LINE:189
    def getRAJobApplicationById(rajobApplicationId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "rajob/rajobApplicationDetail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("rajobApplicationId", rajobApplicationId)))
    }
  
    // @LINE:183
    def deleteRAJobImage(rajobId:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "rajob/deleteRAJobImage/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("rajobId", rajobId)))
    }
  
    // @LINE:194
    def searchRAJobsByCondition(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "rajob/search/conditions")
    }
  
    // @LINE:188
    def giveRAJobOffertoStudent(rajobApplicationId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "rajob/updateRAjobApplicationStatus/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("rajobApplicationId", rajobApplicationId)))
    }
  
    // @LINE:199
    def getRAJobsByApplicant(userId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "rajob/getRAJobsByApplicant/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("userId", userId)))
    }
  
    // @LINE:202
    def getIdByName(name:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "rajob/getIdByName/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)))
    }
  
    // @LINE:203
    def sendOfferEmail(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "rajob/offer")
    }
  
    // @LINE:200
    def checkRAJobExist(rajobId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "rajob/checkRAJobExist/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("rajobId", rajobId)))
    }
  
    // @LINE:196
    def setPDF(rajobId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "rajob/setPDF/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("rajobId", rajobId)))
    }
  
    // @LINE:198
    def getRAJobsByPublisher(userId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "rajob/getRAJobsByUser/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("userId", userId)))
    }
  
    // @LINE:187
    def rajobUpdateStatue(rajobId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "rajob/updateStatus/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("rajobId", rajobId)))
    }
  
    // @LINE:181
    def updateRAJob(rajobId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "rajob/updateRAJob/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("rajobId", rajobId)))
    }
  
    // @LINE:201
    def checkRAJobNameAvailability(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "rajob/isRAJobNameExisted")
    }
  
    // @LINE:204
    def sendRAJobPostedEmail(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "rajob/sendPostedEmail")
    }
  
    // @LINE:185
    def rajobList(userId:Long, pageLimit:Integer, pageNum:Integer, sortCriteria:java.util.Optional[String]): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "rajob/rajobList/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("userId", userId)) + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("pageLimit", pageLimit)), Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("pageNum", pageNum)), Some(implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[String]]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:193
    def getRAJobPublisher(rajobId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "rajob/getRAJobPublisher/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("rajobId", rajobId)))
    }
  
    // @LINE:195
    def setImage(rajobId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "rajob/setImage/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("rajobId", rajobId)))
    }
  
    // @LINE:184
    def deleteRAJobPDF(rajobId:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "rajob/deleteRAJobPDF/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("rajobId", rajobId)))
    }
  
    // @LINE:182
    def closeRAJob(rajobId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "rajob/closeRAJob/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("rajobId", rajobId)))
    }
  
    // @LINE:186
    def applyRAJob(rajobId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "rajob/applyRAJob/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("rajobId", rajobId)))
    }
  
  }

  // @LINE:104
  class ReverseChallengeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:116
    def getChallengeApplicationIdById(challengeApplicationId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "challenge/challengeApplicationDetailId/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("challengeApplicationId", challengeApplicationId)))
    }
  
    // @LINE:126
    def getChallengesByApplicant(userId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "challenge/getChallengesByApplicant/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("userId", userId)))
    }
  
    // @LINE:109
    def challengeList(userId:Long, pageLimit:Integer, pageNum:Integer, sortCriteria:java.util.Optional[String]): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "challenge/challengeList/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("userId", userId)) + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("pageLimit", pageLimit)), Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("pageNum", pageNum)), Some(implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[String]]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:112
    def applyChallenge(challengeId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "challenge/applyChallenge/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("challengeId", challengeId)))
    }
  
    // @LINE:113
    def getChallengeById(challengeId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "challenge/challengeDetail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("challengeId", challengeId)))
    }
  
    // @LINE:125
    def closeChallenge(challengeId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "challenge/closeChallenge/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("challengeId", challengeId)))
    }
  
    // @LINE:110
    def challengeListAdmin(userId:Long, pageLimit:Integer, pageNum:Integer, sortCriteria:java.util.Optional[String]): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "challenge/challengeListAdmin/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("userId", userId)) + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("pageLimit", pageLimit)), Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("pageNum", pageNum)), Some(implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[String]]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:117
    def giveChallengeOffertoStudent(challengeApplicationId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "challenge/updateChallengeApplicationStatus/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("challengeApplicationId", challengeApplicationId)))
    }
  
    // @LINE:120
    def getApplicationsByChallengeId(challengeType:String, challengeId:Long, pageLimit:Integer, pageNum:Integer, sortCriteria:java.util.Optional[String]): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "challenge/getApplications/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("challengeType", challengeType)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("challengeId", challengeId)) + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("pageLimit", pageLimit)), Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("pageNum", pageNum)), Some(implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[String]]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:106
    def updateChallengeAdmin(challengeId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "challenge/updateChallengeAdmin/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("challengeId", challengeId)))
    }
  
    // @LINE:114
    def getChallengesByPublisher(userId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "challenge/getChallengesByUser/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("userId", userId)))
    }
  
    // @LINE:104
    def addChallenge(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "challenge/addChallenge")
    }
  
    // @LINE:115
    def getChallengeApplicationById(challengeApplicationId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "challenge/challengeApplicationDetail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("challengeApplicationId", challengeApplicationId)))
    }
  
    // @LINE:122
    def getImage(challengeId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "challenge/getImage/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("challengeId", challengeId)))
    }
  
    // @LINE:123
    def setPdf(challengeId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "challenge/setPdf/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("challengeId", challengeId)))
    }
  
    // @LINE:124
    def searchChallenges(pageLimit:Integer, pageNum:Integer, sortCriteria:java.util.Optional[String]): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "challenge/search" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("pageLimit", pageLimit)), Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("pageNum", pageNum)), Some(implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[String]]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:105
    def updateChallenge(challengeId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "challenge/updateChallenge/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("challengeId", challengeId)))
    }
  
    // @LINE:119
    def challengeUpdateStatus(challengeId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "challenge/updateStatus/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("challengeId", challengeId)))
    }
  
    // @LINE:121
    def setImage(challengeId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "challenge/setImage/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("challengeId", challengeId)))
    }
  
  }

  // @LINE:154
  class ReverseJobController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:160
    def jobUpdateStatue(jobId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "job/updateStatus/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("jobId", jobId)))
    }
  
    // @LINE:169
    def getJobsByPublisher(userId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "job/getJobsByUser/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("userId", userId)))
    }
  
    // @LINE:159
    def applyJob(jobId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "job/applyJob/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("jobId", jobId)))
    }
  
    // @LINE:155
    def updateJob(jobId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "job/updateJob/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("jobId", jobId)))
    }
  
    // @LINE:156
    def deleteJobImage(jobId:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "job/deleteJobImage/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("jobId", jobId)))
    }
  
    // @LINE:157
    def deleteJobPDF(jobId:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "job/deleteJobPDF/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("jobId", jobId)))
    }
  
    // @LINE:154
    def addJob(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "job/addJob")
    }
  
    // @LINE:171
    def checkJobExist(jobId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "job/checkJobExist/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("jobId", jobId)))
    }
  
    // @LINE:168
    def deleteJob(jobId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "job/deleteJob/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("jobId", jobId)))
    }
  
    // @LINE:163
    def getJobById(jobId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "job/jobDetail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("jobId", jobId)))
    }
  
    // @LINE:167
    def setPDF(jobId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "job/setPDF/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("jobId", jobId)))
    }
  
    // @LINE:165
    def searchJobsByCondition(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "job/search/conditions")
    }
  
    // @LINE:158
    def jobList(userId:Long, pageLimit:Integer, pageNum:Integer, sortCriteria:java.util.Optional[String]): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "job/jobList/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("userId", userId)) + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("pageLimit", pageLimit)), Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("pageNum", pageNum)), Some(implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[String]]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:161
    def getJobApplicationById(jobApplicationId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "job/jobApplicationDetail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("jobApplicationId", jobApplicationId)))
    }
  
    // @LINE:170
    def getJobsByApplicant(userId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "job/getJobsByApplicant/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("userId", userId)))
    }
  
    // @LINE:164
    def getJobPublisher(jobId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "job/getJobPublisher/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("jobId", jobId)))
    }
  
    // @LINE:174
    def getApplicationsByJobId(jobType:String, jobId:Long, pageLimit:Integer, pageNum:Integer, sortCriteria:java.util.Optional[String]): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "job/getApplications/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("jobType", jobType)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("jobId", jobId)) + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("pageLimit", pageLimit)), Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("pageNum", pageNum)), Some(implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[String]]].unbind("sortCriteria", sortCriteria)))))
    }
  
    // @LINE:172
    def checkJobNameAvailability(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "job/isJobNameExisted")
    }
  
    // @LINE:166
    def setImage(jobId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "job/setImage/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("jobId", jobId)))
    }
  
  }

  // @LINE:257
  class ReverseCourseTAAssignmentController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:258
    def getCourseTAAssignmentById(Id:Long): Call = {
    
      (Id: @unchecked) match {
      
        // @LINE:258
        case (Id)  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "tahiring/status/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("Id", Id)))
      
      }
    
    }
  
    // @LINE:257
    def addAssignment(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "tahiring/addAssignment")
    }
  
    // @LINE:259
    def courseTAAssignmentList(Id:Long, pageLimit:Integer, pageNum:Integer, sortCriteria:java.util.Optional[String]): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tahiring/assignmentList/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("Id", Id)) + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("pageLimit", pageLimit)), Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("pageNum", pageNum)), Some(implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[String]]].unbind("sortCriteria", sortCriteria)))))
    }
  
  }

  // @LINE:443
  class ReverseFileController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:447
    def uploadRawFile(tableName:String, fileType:String, recordId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "file/upload/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("tableName", tableName)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("fileType", fileType)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("recordId", recordId)))
    }
  
    // @LINE:443
    def getFile(tableName:String, fileType:String, tableRecorderId:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "file/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("tableName", tableName)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("fileType", fileType)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("tableRecorderId", tableRecorderId)))
    }
  
    // @LINE:444
    def checkFile(tableName:String, fileType:String, tableRecorderId:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "file/checkFile/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("tableName", tableName)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("fileType", fileType)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("tableRecorderId", tableRecorderId)))
    }
  
  }

  // @LINE:429
  class ReverseGraphController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:429
    def printPrimeConnections(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "graph/primePOC")
    }
  
  }

  // @LINE:440
  class ReverseLogController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:440
    def operationLogging(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "log/loggingOperation")
    }
  
  }

  // @LINE:237
  class ReverseTACandidateController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:240
    def getAssignmentsByUserId(userId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tacandidate/assignments/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("userId", userId)))
    }
  
    // @LINE:237
    def addTACandidate(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "tacandidate/addTACandidate")
    }
  
    // @LINE:239
    def getTACandidateById(Id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tacandidate/candidateDetail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("Id", Id)))
    }
  
    // @LINE:238
    def tacandidateList(userId:Long, pageLimit:Integer, pageNum:Integer, sortCriteria:java.util.Optional[String]): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tacandidate/tacandidateList/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("userId", userId)) + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("pageLimit", pageLimit)), Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("pageNum", pageNum)), Some(implicitly[play.api.mvc.QueryStringBindable[java.util.Optional[String]]].unbind("sortCriteria", sortCriteria)))))
    }
  
  }


}
