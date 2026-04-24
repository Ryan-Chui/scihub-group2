
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object header extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.37*/("""

"""),_display_(/*3.2*/defining(session.get("userTypes"))/*3.36*/ { userTypes =>_display_(Seq[Any](format.raw/*3.51*/("""

"""),format.raw/*5.1*/("""<div class="navbar-fixed" style="z-index: 9999;">
    <nav class="blue darken-4" style='background: url(""""),_display_(/*6.57*/routes/*6.63*/.Assets.at("images/starfield-banner-blue.jpg")),format.raw/*6.109*/("""") repeat;
        margin-bottom: 20px;'>
        <div class="nav-wrapper">

            <span class="brand-logo">
                <a href="https://nex.nasa.gov/opennex/" target="_blank">
                    <img src='"""),_display_(/*12.32*/routes/*12.38*/.Assets.at("/images/scibot-logo.png")),format.raw/*12.75*/("""' style=   "
                    margin-top: 8px;
                    height: 50px;
                    width: 65px;"> </a>
                </span>

                <a href="#" data-target="nav-right" class="sidenav-trigger right"><i class="material-icons">menu</i></a>
                <ul id="nav-mobile" class="right hide-on-med-and-down">
                <li><a href=""""),_display_(/*20.31*/routes/*20.37*/.Application.home()),format.raw/*20.56*/("""" title="Home"><i class="material-icons">home</i></a></li>
                    """),_display_(/*21.22*/if(!session.get("email"))/*21.47*/ {_display_(Seq[Any](format.raw/*21.49*/("""
                        """),format.raw/*22.25*/("""<li class="dropdown">
                            <a href="#" class="dropdown-trigger" data-target="dropdown-About" title = "About"><i class="material-icons">
                                help</i></a>
                            <ul class="dropdown-content" id="dropdown-About">
                                <li><a href=""""),_display_(/*26.47*/routes/*26.53*/.AboutController.aboutUs()),format.raw/*26.79*/("""">About Us</a></li>
                                <li><a href=""""),_display_(/*27.47*/routes/*27.53*/.AboutController.aboutProject()),format.raw/*27.84*/("""">About Project</a></li>
                            </ul>
                        </li>
                    """)))}/*30.23*/else/*30.28*/{_display_(Seq[Any](format.raw/*30.29*/("""
                        """),format.raw/*31.25*/("""<li class="dropdown">
                            <a href="#" class="dropdown-trigger" data-target="dropdown-About" title = "About"><i class="material-icons">
                                help</i></a>
                            <ul class="dropdown-content" id="dropdown-About">
                                <li><a href=""""),_display_(/*35.47*/routes/*35.53*/.AboutController.aboutUs()),format.raw/*35.79*/("""">About Us</a></li>
                                <li><a href=""""),_display_(/*36.47*/routes/*36.53*/.AboutController.aboutProject()),format.raw/*36.84*/("""">About Project</a></li>
                                <li><a href=""""),_display_(/*37.47*/routes/*37.53*/.AboutController.frequentlyAskedQuestions()),format.raw/*37.96*/("""">Frequently Asked Questions</a></li>
                                <li><a href=""""),_display_(/*38.47*/routes/*38.53*/.AboutController.popularQueries()),format.raw/*38.86*/("""">Popular Queries</a></li>

                                <li class="divider"></li>
                                """),format.raw/*42.52*/("""
                                """),format.raw/*45.35*/("""

                                """),format.raw/*47.33*/("""<li class="divider"></li>

                                <li><a href=""""),_display_(/*49.47*/routes/*49.53*/.BugReportController.bugReportRegisterPage),format.raw/*49.95*/("""">Report Bug</a></li>
                                <li><a href=""""),_display_(/*50.47*/routes/*50.53*/.BugReportController.bugReportList(1)),format.raw/*50.90*/("""">Bug List</a></li>

                                <li><a href=""""),_display_(/*52.47*/routes/*52.53*/.SuggestionController.suggestionRegisterPage()),format.raw/*52.99*/("""">Add Suggestion</a></li>
                                <li><a href=""""),_display_(/*53.47*/routes/*53.53*/.SuggestionController.suggestionList(1)),format.raw/*53.92*/("""">Suggestion List</a></li>
                                """),format.raw/*54.62*/("""
                                """),format.raw/*55.118*/("""
                                """),format.raw/*56.103*/("""
                            """),format.raw/*57.29*/("""</ul>
                        </li>
                    """)))}),format.raw/*59.22*/("""


                    """),_display_(/*62.22*/if(session.get("email"))/*62.46*/ {_display_(Seq[Any](format.raw/*62.48*/("""
                        """),format.raw/*63.25*/("""<li class="dropdown">
                            <a href="#" class="dropdown-trigger" data-target="dropdown-Organizations">
                                Organization</a>
                            <ul class="dropdown-content" id="dropdown-Organizations">
                                <li><a href=""""),_display_(/*67.47*/routes/*67.53*/.OrganizationController.organizationListPage(1, "id")),format.raw/*67.106*/("""">Organization List</a></li>
                                <li><a href=""""),_display_(/*68.47*/routes/*68.53*/.OrganizationController.searchPage()),format.raw/*68.89*/("""">Search Organization</a></li>

                                <li class="divider"></li>
                                <li><a href=""""),_display_(/*71.47*/routes/*71.53*/.OrganizationController.organizationRegisterPage()),format.raw/*71.103*/("""">
                                    Register Organization</a></li>
                                """),format.raw/*73.127*/("""
                                """),format.raw/*74.94*/("""
                            """),format.raw/*75.29*/("""</ul>
                        </li>

                        <li class="dropdown">
                            <a href="#" class="dropdown-trigger" data-target="dropdown-Challenges">
                                Challenge</a>
                            <ul class="dropdown-content" id="dropdown-Challenges">
                                <li><a href=""""),_display_(/*82.47*/routes/*82.53*/.ChallengeController.challengeList(1, "")),format.raw/*82.94*/("""">
                                    Challenge List</a></li>
                                <li><a href=""""),_display_(/*84.47*/routes/*84.53*/.ChallengeController.searchPage()),format.raw/*84.86*/("""">
                                    Search Challenge</a></li>

                                <li class="divider"></li>
"""),format.raw/*88.103*/("""
"""),format.raw/*89.67*/("""
                                """),_display_(/*90.34*/if(userTypes != null && userTypes != "4")/*90.75*/ {_display_(Seq[Any](format.raw/*90.77*/("""
                                    """),format.raw/*91.37*/("""<li><a href=""""),_display_(/*91.51*/routes/*91.57*/.ChallengeController.challengeRegisterPage()),format.raw/*91.101*/("""">
                                        Publish Challenge</a></li>

                                """)))}),format.raw/*94.34*/("""

                            """),format.raw/*96.29*/("""</ul>
                        </li>
                        """),format.raw/*116.32*/("""




                        """),format.raw/*121.25*/("""<li class="dropdown">
                            <a href="#" class="dropdown-trigger" data-target="dropdown-Technology">
                                Technology</a>
                            <ul class="dropdown-content" id="dropdown-Technology">
                                <li><a href=""""),_display_(/*125.47*/routes/*125.53*/.TechnologyController.technologyList(1, "id")),format.raw/*125.98*/("""">
                                    Technology List</a></li>
                                <li><a href=""""),_display_(/*127.47*/routes/*127.53*/.TechnologyController.searchPage()),format.raw/*127.87*/("""">
                                    Search Technology</a></li>

                                <li class="divider"></li>

                                <li><a href=""""),_display_(/*132.47*/routes/*132.53*/.TechnologyController.technologyRegisterPage()),format.raw/*132.99*/("""">
                                    Register Technology</a></li>
                                """),format.raw/*135.53*/("""

                            """),format.raw/*137.29*/("""</ul>
                        </li>

                        <li class="dropdown">
                            <a href="#" class="dropdown-trigger" data-target="dropdown-Job">
                                Job</a>
                            <ul class="dropdown-content" id="dropdown-Job">

                                """),format.raw/*163.60*/("""

                                """),format.raw/*165.33*/("""<li><a href=""""),_display_(/*165.47*/routes/*165.53*/.JobController.jobList(1, "id")),format.raw/*165.84*/("""">
                                    Job List</a></li>
                                """),format.raw/*168.59*/("""
                                """),format.raw/*169.33*/("""<li><a href=""""),_display_(/*169.47*/routes/*169.53*/.RAJobController.rajobList(1, "id")),format.raw/*169.88*/("""">
                                    RA Job List</a></li>
                                """),format.raw/*172.55*/("""

                                """),format.raw/*174.33*/("""<li class="divider"></li>

                                <li><a href=""""),_display_(/*176.47*/routes/*176.53*/.JobController.searchPage()),format.raw/*176.80*/("""">
                                    Search Job</a></li>
                                """),format.raw/*179.61*/("""
                                """),format.raw/*180.33*/("""<li><a href=""""),_display_(/*180.47*/routes/*180.53*/.RAJobController.searchPage()),format.raw/*180.82*/("""">
                                    Search RA Job</a></li>
                                """),format.raw/*183.57*/("""

                                """),format.raw/*185.33*/("""<li class="divider"></li>

                                """),_display_(/*187.34*/if(userTypes != null && userTypes != "4")/*187.75*/ {_display_(Seq[Any](format.raw/*187.77*/("""
                                    """),format.raw/*188.37*/("""<li><a href=""""),_display_(/*188.51*/routes/*188.57*/.JobController.jobRegisterPage()),format.raw/*188.89*/("""">
                                        Post Job</a></li>
                                    <li><a href=""""),_display_(/*190.51*/routes/*190.57*/.RAJobController.rajobRegisterPage()),format.raw/*190.93*/("""">
                                        Post RA Job</a></li>
                                """)))}),format.raw/*192.34*/("""

                                """),format.raw/*194.119*/("""
                                """),format.raw/*195.93*/("""
                                """),format.raw/*197.55*/("""
                                """),format.raw/*199.53*/("""

                            """),format.raw/*201.29*/("""</ul>
                        </li>

                        <li class="dropdown">
                            <a href="#" class="dropdown-trigger" data-target="dropdown-Author">
                                Researcher</a>
                            <ul class="dropdown-content" id="dropdown-Author">
                                <li><a href=""""),_display_(/*208.47*/routes/*208.53*/.AuthorController.authorList(1, "id")),format.raw/*208.90*/("""">
                                    Researcher List</a></li>
                                <li><a href=""""),_display_(/*210.47*/routes/*210.53*/.AuthorController.searchPage()),format.raw/*210.83*/("""">
                                    Search Researcher</a></li>
                                <li><a href=""""),_display_(/*212.47*/routes/*212.53*/.GraphController.researchInterest()),format.raw/*212.88*/("""">
                                    Researcher Analytics</a></li>
                                """),format.raw/*215.70*/("""
                            """),format.raw/*216.29*/("""</ul>
                        </li>

                        """),format.raw/*219.70*/("""
                        """),format.raw/*220.124*/("""
                        """),format.raw/*221.65*/("""
                        """),format.raw/*222.107*/("""
                        """),format.raw/*223.130*/("""
                        """),format.raw/*224.127*/("""
                        """),format.raw/*225.58*/("""
                        """),format.raw/*226.54*/("""

                        """),format.raw/*250.32*/("""
                        """),_display_(/*251.26*/if(userTypes != null && userTypes == "0")/*251.67*/ {_display_(Seq[Any](format.raw/*251.69*/("""
                            """),format.raw/*252.29*/("""<li class="dropdown">
                                <a href="#" class="dropdown-trigger" data-target="dropdown-Admin">
                                    Admin</a>
                                <ul class="dropdown-content" id="dropdown-Admin">
                                    <li><a href=""""),_display_(/*256.51*/routes/*256.57*/.ChallengeController.challengeListAdmin(1, "")),format.raw/*256.103*/("""">
                                        Challenge</a></li>
                                    <li><a href=""""),_display_(/*258.51*/routes/*258.57*/.AdminController.userManagement(1, "id")),format.raw/*258.97*/("""">
                                        User</a></li>
                                    <li><a href=""""),_display_(/*260.51*/routes/*260.57*/.AdminController.jobManagement(1, "id")),format.raw/*260.96*/("""">
                                        Job & RA job</a></li>
                                    <li><a href=""""),_display_(/*262.51*/routes/*262.57*/.AdminController.organizationManagement(1, "id")),format.raw/*262.105*/("""">
                                        Organization</a></li>
                                    <li><a href=""""),_display_(/*264.51*/routes/*264.57*/.AdminController.technologyManagement(1, "id")),format.raw/*264.103*/("""">
                                        Technology</a></li>
                                </ul>
                            </li>
                        """)))}),format.raw/*268.26*/("""
                    """)))}),format.raw/*269.22*/("""



                    """),_display_(/*273.22*/if(!session.get("email"))/*273.47*/ {_display_(Seq[Any](format.raw/*273.49*/("""
                        """),format.raw/*274.25*/("""<li style="margin-right: 10px;">
                            <a href=""""),_display_(/*275.39*/routes/*275.45*/.Application.login()),format.raw/*275.65*/("""" title="Login">
                            Sign in
                            </a>
                            </li>
                            """)))}/*279.31*/else/*279.36*/{_display_(Seq[Any](format.raw/*279.37*/("""
                        """),format.raw/*280.25*/("""<li class="dropdown" style="margin-right: 10px;">
                            <a href="#" class="dropdown-trigger" data-target="dropdown-logout" id="profile-dropDown" title ="MyProfile">
                                """),_display_(/*282.34*/if(session.get("avatar")!=null && session.get("avatar")!="")/*282.94*/ {_display_(Seq[Any](format.raw/*282.96*/("""
                                    """),format.raw/*283.178*/("""
                                    """),format.raw/*284.202*/("""
                                    """),format.raw/*285.37*/("""<img class="circle nav_item center" id="userAvatar" src=""""),_display_(/*285.95*/routes/*285.101*/.Application.getImageFromPath(session.get("avatar"))),format.raw/*285.153*/("""" height="30" width="30" >
                                """)))}/*286.34*/else/*286.38*/{_display_(Seq[Any](format.raw/*286.39*/("""
                                    """),format.raw/*287.37*/("""<img class="circle nav_item center" id="userAvatar" src=""""),_display_(/*287.95*/routes/*287.101*/.Application.getDefaultAvatar()),format.raw/*287.132*/("""" height="30" width="30" >
                                """)))}),format.raw/*288.34*/("""
                                """),format.raw/*289.33*/("""<div id="me">
                                    <span style="display: inline-block; padding-top:25px;">
                                    """),_display_(/*291.38*/session/*291.45*/.get("userfirstname")),format.raw/*291.66*/("""</span> """),format.raw/*291.105*/("""
                                    """),format.raw/*292.37*/("""<i class="material-icons" style="width: 10px;
                                        margin: 0;
                                        height: 10px;
                                        transition: color .3s;
                                        position: relative;
                                        display: inline-block; vertical-align: top">expand_more
                                    </i>
                                </div>
                            </a>
                            <ul class="dropdown-content" id="dropdown-logout">
                                <li><a href="#">"""),_display_(/*302.50*/session/*302.57*/.get("email")),format.raw/*302.70*/("""</a></li>
                                <li class="divider" tabindex="-1"></li>
                                <li><a href=""""),_display_(/*304.47*/routes/*304.53*/.UserController.userEditPage()),format.raw/*304.83*/("""">
                                    Account Management</a></li>
                                <li><a href=""""),_display_(/*306.47*/routes/*306.53*/.UserController.mySpacePage()),format.raw/*306.82*/("""">
                                    My Space</a></li>
                                <li><a href=""""),_display_(/*308.47*/routes/*308.53*/.UserController.updatePasswordPage()),format.raw/*308.89*/("""">Update password</a></li>
                                <li class="divider"></li>
                                <li><a href=""""),_display_(/*310.47*/routes/*310.53*/.Application.logout()),format.raw/*310.74*/("""">Sign out</a></li>
                                """),format.raw/*312.58*/("""
                            """),format.raw/*313.29*/("""</ul>
                        </li>
                    """)))}),format.raw/*315.22*/("""
                    """),format.raw/*316.21*/("""</ul>
                    <ul class="sidenav hide-on-large-only" id="nav-right">
                        <li>
                            <a href=""""),_display_(/*319.39*/routes/*319.45*/.Application.home()),format.raw/*319.64*/("""">Home</a>
                        </li>
                        """),_display_(/*321.26*/if(!session.get("email"))/*321.51*/ {_display_(Seq[Any](format.raw/*321.53*/("""
                            """),format.raw/*322.29*/("""<li>
                                <a href="#">About</a>
                                <ul class="sub-menu">
                                    <li><a href=""""),_display_(/*325.51*/routes/*325.57*/.AboutController.aboutUs()),format.raw/*325.83*/("""">About Us</a></li>
                                    <li><a href=""""),_display_(/*326.51*/routes/*326.57*/.AboutController.aboutProject()),format.raw/*326.88*/("""">About Project</a></li>
                                </ul>
                            </li>
                            <li>
                                <a href=""""),_display_(/*330.43*/routes/*330.49*/.Application.login()),format.raw/*330.69*/("""" title="Login">Sign in</a>
                                </li>
                                """)))}/*332.35*/else/*332.40*/{_display_(Seq[Any](format.raw/*332.41*/("""
                            """),format.raw/*333.29*/("""<li>
                                <a href="#">About</a>
                                <ul class="sub-menu">
                                    <li><a href=""""),_display_(/*336.51*/routes/*336.57*/.AboutController.aboutUs()),format.raw/*336.83*/("""">About Us</a></li>
                                    <li><a href=""""),_display_(/*337.51*/routes/*337.57*/.AboutController.aboutProject()),format.raw/*337.88*/("""">About Project</a></li>
                                    <li><a href=""""),_display_(/*338.51*/routes/*338.57*/.AboutController.frequentlyAskedQuestions()),format.raw/*338.100*/("""">Frequently Asked Questions</a></li>
                                    <li><a href=""""),_display_(/*339.51*/routes/*339.57*/.BugReportController.bugReportRegisterPage),format.raw/*339.99*/("""">Report Bug</a></li>
                                    <li><a href=""""),_display_(/*340.51*/routes/*340.57*/.BugReportController.bugReportList(1)),format.raw/*340.94*/("""">Bug List</a></li>
                                    <li><a href=""""),_display_(/*341.51*/routes/*341.57*/.SuggestionController.suggestionRegisterPage()),format.raw/*341.103*/("""">Add Suggestion</a></li>
                                    <li><a href=""""),_display_(/*342.51*/routes/*342.57*/.SuggestionController.suggestionList(1)),format.raw/*342.96*/("""">Suggestion List</a></li>
                                </ul>
                            </li>
                            <li>
                                <a href="#">Organization</a>
                                <ul class="sub-menu">
                                    <li><a href=""""),_display_(/*348.51*/routes/*348.57*/.OrganizationController.organizationListPage(1, "id")),format.raw/*348.110*/("""">Organization List</a></li>
                                    <li><a href=""""),_display_(/*349.51*/routes/*349.57*/.OrganizationController.searchPage()),format.raw/*349.93*/("""">Search Organization</a></li>
                                    <li><a href=""""),_display_(/*350.51*/routes/*350.57*/.OrganizationController.organizationRegisterPage()),format.raw/*350.107*/("""">Register Organization</a></li>
                                </ul>
                            </li>
                            <li>
                                <a href="#">Challenge</a>
                                <ul class="sub-menu">
                                    <li><a href=""""),_display_(/*356.51*/routes/*356.57*/.ChallengeController.challengeList(1, "")),format.raw/*356.98*/("""">Challenge List</a></li>
                                    <li><a href=""""),_display_(/*357.51*/routes/*357.57*/.ChallengeController.searchPage()),format.raw/*357.90*/("""">Search Challenge</a></li>
"""),format.raw/*358.133*/("""
                                    """),_display_(/*359.38*/if(userTypes != null && userTypes != "4")/*359.79*/ {_display_(Seq[Any](format.raw/*359.81*/("""
                                        """),format.raw/*360.41*/("""<li><a href=""""),_display_(/*360.55*/routes/*360.61*/.ChallengeController.challengeRegisterPage()),format.raw/*360.105*/("""">
                                            Publish Challenge</a></li>

                                    """)))}),format.raw/*363.38*/("""
                                """),format.raw/*364.33*/("""</ul>
                            </li>
                            <li>
                                <a href="#">Technology</a>
                                <ul class="sub-menu">
                                    <li><a href=""""),_display_(/*369.51*/routes/*369.57*/.TechnologyController.technologyList(1, "id")),format.raw/*369.102*/("""">Technology List</a></li>
                                    <li><a href=""""),_display_(/*370.51*/routes/*370.57*/.TechnologyController.searchPage()),format.raw/*370.91*/("""">Search Technology</a></li>
                                    <li><a href=""""),_display_(/*371.51*/routes/*371.57*/.TechnologyController.technologyRegisterPage()),format.raw/*371.103*/("""">Register Technology</a></li>
                                </ul>
                            </li>
                            <li>
                                <a href="#">Job</a>
                                <ul class="sub-menu">
                                    <li><a href=""""),_display_(/*377.51*/routes/*377.57*/.JobController.jobList(1, "id")),format.raw/*377.88*/("""">Job List</a></li>
                                    <li><a href=""""),_display_(/*378.51*/routes/*378.57*/.RAJobController.rajobList(1, "id")),format.raw/*378.92*/("""">RA Job List</a></li>
                                    <li><a href=""""),_display_(/*379.51*/routes/*379.57*/.JobController.searchPage()),format.raw/*379.84*/("""">Search Job</a></li>
                                    <li><a href=""""),_display_(/*380.51*/routes/*380.57*/.RAJobController.searchPage()),format.raw/*380.86*/("""">Search RA Job</a></li>
                                    """),_display_(/*381.38*/if(userTypes != null && userTypes != "4")/*381.79*/ {_display_(Seq[Any](format.raw/*381.81*/("""
                                        """),format.raw/*382.41*/("""<li><a href=""""),_display_(/*382.55*/routes/*382.61*/.JobController.jobRegisterPage()),format.raw/*382.93*/("""">Post Job</a></li>
                                        <li><a href=""""),_display_(/*383.55*/routes/*383.61*/.RAJobController.rajobRegisterPage()),format.raw/*383.97*/("""">Post RA Job</a></li>
                                    """)))}),format.raw/*384.38*/("""
                                """),format.raw/*385.33*/("""</ul>
                            </li>
                            <li>
                                <a href="#">Researcher</a>
                                <ul class="sub-menu">
                                    <li><a href=""""),_display_(/*390.51*/routes/*390.57*/.AuthorController.authorList(1, "id")),format.raw/*390.94*/("""">Researcher List</a></li>
                                    <li><a href=""""),_display_(/*391.51*/routes/*391.57*/.AuthorController.searchPage()),format.raw/*391.87*/("""">Search Researcher</a></li>
                                    <li><a href=""""),_display_(/*392.51*/routes/*392.57*/.GraphController.researchInterest()),format.raw/*392.92*/("""">Researcher Analytics</a></li>
                                </ul>
                            </li>
                            <li>
                                <a href="#">MyProfile</a>
                                <ul class="sub-menu">
                                    <li><a href=""""),_display_(/*398.51*/routes/*398.57*/.UserController.userDetailPage(session.get("id").toLong)),format.raw/*398.113*/("""">"""),_display_(/*398.116*/session/*398.123*/.get("email")),format.raw/*398.136*/("""</a></li>
                                    <li><a href=""""),_display_(/*399.51*/routes/*399.57*/.UserController.userEditPage()),format.raw/*399.87*/("""">Account Management</a></li>
                                    <li><a href=""""),_display_(/*400.51*/routes/*400.57*/.UserController.updatePasswordPage()),format.raw/*400.93*/("""">Update password</a></li>
                                    <li><a href=""""),_display_(/*401.51*/routes/*401.57*/.Application.logout()),format.raw/*401.78*/("""">Sign out</a></li>
                                </ul>
                            </li>
                        """)))}),format.raw/*404.26*/("""
                    """),format.raw/*405.21*/("""</ul>
        </div>
    </nav>
</div>

<style>
    .sidenav .sub-menu """),format.raw/*411.24*/("""{"""),format.raw/*411.25*/("""
        """),format.raw/*412.9*/("""display: none;
        margin-left: 20px;
        border-left: 2px solid #ccc;
        padding-left: 10px;
    """),format.raw/*416.5*/("""}"""),format.raw/*416.6*/("""
    """),format.raw/*417.5*/(""".sidenav li.active > .sub-menu """),format.raw/*417.36*/("""{"""),format.raw/*417.37*/("""
        """),format.raw/*418.9*/("""display: block;
    """),format.raw/*419.5*/("""}"""),format.raw/*419.6*/("""

    """),format.raw/*421.5*/(""".sidenav li > a """),format.raw/*421.21*/("""{"""),format.raw/*421.22*/("""
        """),format.raw/*422.9*/("""color: #0D47A1;
    """),format.raw/*423.5*/("""}"""),format.raw/*423.6*/("""
"""),format.raw/*424.1*/("""</style>

<script>
        document.addEventListener('DOMContentLoaded', function() """),format.raw/*427.66*/("""{"""),format.raw/*427.67*/("""
            """),format.raw/*428.13*/("""var sidenavElems = document.querySelectorAll('.sidenav');
            M.Sidenav.init(sidenavElems, """),format.raw/*429.42*/("""{"""),format.raw/*429.43*/("""edge: 'right'"""),format.raw/*429.56*/("""}"""),format.raw/*429.57*/(""");

            var sidenavItems = document.querySelectorAll('.sidenav > li > a');
            sidenavItems.forEach(function(item) """),format.raw/*432.49*/("""{"""),format.raw/*432.50*/("""
                """),format.raw/*433.17*/("""item.addEventListener('click', function(event) """),format.raw/*433.64*/("""{"""),format.raw/*433.65*/("""
                    """),format.raw/*434.21*/("""var parent = this.parentElement;
                    if (parent.querySelector('.sub-menu')) """),format.raw/*435.60*/("""{"""),format.raw/*435.61*/("""
                        """),format.raw/*436.25*/("""event.preventDefault();
                        if (parent.classList.contains('active')) """),format.raw/*437.66*/("""{"""),format.raw/*437.67*/("""
                            """),format.raw/*438.29*/("""parent.classList.remove('active');
                        """),format.raw/*439.25*/("""}"""),format.raw/*439.26*/(""" """),format.raw/*439.27*/("""else """),format.raw/*439.32*/("""{"""),format.raw/*439.33*/("""
                            """),format.raw/*440.29*/("""document.querySelectorAll('.sidenav > li').forEach(function(li) """),format.raw/*440.93*/("""{"""),format.raw/*440.94*/("""
                                """),format.raw/*441.33*/("""li.classList.remove('active');
                            """),format.raw/*442.29*/("""}"""),format.raw/*442.30*/(""");
                            parent.classList.add('active');
                        """),format.raw/*444.25*/("""}"""),format.raw/*444.26*/("""
                    """),format.raw/*445.21*/("""}"""),format.raw/*445.22*/("""
                """),format.raw/*446.17*/("""}"""),format.raw/*446.18*/(""");
            """),format.raw/*447.13*/("""}"""),format.raw/*447.14*/(""");
        """),format.raw/*448.9*/("""}"""),format.raw/*448.10*/(""");
</script>
""")))}))
      }
    }
  }

  def render(request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply()(request)

  def f:(() => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = () => (request) => apply()(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:31 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/header.scala.html
                  HASH: 872d9033d716e11c2fed1129b43bcf263777578e
                  MATRIX: 1119->1|1249->36|1277->39|1319->73|1371->88|1399->90|1531->196|1545->202|1612->248|1858->467|1873->473|1931->510|2330->882|2345->888|2385->907|2492->987|2526->1012|2566->1014|2619->1039|2974->1367|2989->1373|3036->1399|3129->1465|3144->1471|3196->1502|3325->1613|3338->1618|3377->1619|3430->1644|3785->1972|3800->1978|3847->2004|3940->2070|3955->2076|4007->2107|4105->2178|4120->2184|4184->2227|4295->2311|4310->2317|4364->2350|4510->2613|4571->2789|4633->2823|4733->2896|4748->2902|4811->2944|4906->3012|4921->3018|4979->3055|5073->3122|5088->3128|5155->3174|5254->3246|5269->3252|5329->3291|5416->3379|5478->3497|5540->3600|5597->3629|5685->3686|5736->3710|5769->3734|5809->3736|5862->3761|6195->4067|6210->4073|6285->4126|6387->4201|6402->4207|6459->4243|6622->4379|6637->4385|6709->4435|6840->4631|6901->4725|6958->4754|7343->5112|7358->5118|7420->5159|7556->5268|7571->5274|7625->5307|7778->5533|7807->5600|7868->5634|7918->5675|7958->5677|8023->5714|8064->5728|8079->5734|8145->5778|8280->5882|8338->5912|8427->6848|8485->6877|8811->7175|8827->7181|8894->7226|9032->7336|9048->7342|9104->7376|9304->7548|9320->7554|9388->7600|9517->7770|9576->7800|9930->9057|9993->9091|10035->9105|10051->9111|10104->9142|10222->9373|10284->9406|10326->9420|10342->9426|10399->9461|10520->9667|10583->9701|10684->9774|10700->9780|10749->9807|10869->10038|10931->10071|10973->10085|10989->10091|11040->10120|11163->10324|11226->10358|11314->10418|11365->10459|11406->10461|11472->10498|11514->10512|11530->10518|11584->10550|11723->10661|11739->10667|11797->10703|11926->10800|11990->10920|12052->11013|12114->11161|12176->11264|12235->11294|12614->11645|12630->11651|12689->11688|12827->11798|12843->11804|12895->11834|13035->11946|13051->11952|13108->11987|13238->12212|13296->12241|13386->12347|13441->12471|13495->12536|13550->12643|13605->12773|13660->12900|13714->12958|13768->13012|13823->14166|13877->14192|13928->14233|13969->14235|14027->14264|14354->14563|14370->14569|14439->14615|14579->14727|14595->14733|14657->14773|14792->14880|14808->14886|14869->14925|15012->15040|15028->15046|15099->15094|15242->15209|15258->15215|15327->15261|15519->15421|15573->15443|15626->15468|15661->15493|15702->15495|15756->15520|15855->15591|15871->15597|15913->15617|16082->15767|16096->15772|16136->15773|16190->15798|16438->16018|16508->16078|16549->16080|16616->16258|16683->16460|16749->16497|16835->16555|16852->16561|16927->16613|17007->16673|17021->16677|17061->16678|17127->16715|17213->16773|17230->16779|17284->16810|17376->16870|17438->16903|17609->17046|17626->17053|17669->17074|17707->17113|17773->17150|18412->17761|18429->17768|18464->17781|18620->17909|18636->17915|18688->17945|18829->18058|18845->18064|18896->18093|19027->18196|19043->18202|19101->18238|19260->18369|19276->18375|19319->18396|19400->18558|19458->18587|19547->18644|19597->18665|19773->18813|19789->18819|19830->18838|19924->18904|19959->18929|20000->18931|20058->18960|20249->19123|20265->19129|20313->19155|20411->19225|20427->19231|20480->19262|20680->19434|20696->19440|20738->19460|20857->19560|20871->19565|20911->19566|20969->19595|21160->19758|21176->19764|21224->19790|21322->19860|21338->19866|21391->19897|21494->19972|21510->19978|21576->20021|21692->20109|21708->20115|21772->20157|21872->20229|21888->20235|21947->20272|22045->20342|22061->20348|22130->20394|22234->20470|22250->20476|22311->20515|22636->20812|22652->20818|22728->20871|22835->20950|22851->20956|22909->20992|23018->21073|23034->21079|23107->21129|23435->21429|23451->21435|23514->21476|23618->21552|23634->21558|23689->21591|23747->21751|23813->21789|23864->21830|23905->21832|23975->21873|24017->21887|24033->21893|24100->21937|24244->22049|24306->22082|24570->22318|24586->22324|24654->22369|24759->22446|24775->22452|24831->22486|24938->22565|24954->22571|25023->22617|25343->22909|25359->22915|25412->22946|25510->23016|25526->23022|25583->23057|25684->23130|25700->23136|25749->23163|25849->23235|25865->23241|25916->23270|26006->23332|26057->23373|26098->23375|26168->23416|26210->23430|26226->23436|26280->23468|26382->23542|26398->23548|26456->23584|26548->23644|26610->23677|26874->23913|26890->23919|26949->23956|27054->24033|27070->24039|27122->24069|27229->24148|27245->24154|27302->24189|27629->24488|27645->24494|27724->24550|27756->24553|27774->24560|27810->24573|27898->24633|27914->24639|27966->24669|28074->24749|28090->24755|28148->24791|28253->24868|28269->24874|28312->24895|28461->25012|28511->25033|28611->25104|28641->25105|28678->25114|28817->25225|28846->25226|28879->25231|28939->25262|28969->25263|29006->25272|29054->25292|29083->25293|29117->25299|29162->25315|29192->25316|29229->25325|29277->25345|29306->25346|29335->25347|29448->25431|29478->25432|29520->25445|29648->25544|29678->25545|29720->25558|29750->25559|29910->25690|29940->25691|29986->25708|30062->25755|30092->25756|30142->25777|30263->25869|30293->25870|30347->25895|30465->25984|30495->25985|30553->26014|30641->26073|30671->26074|30701->26075|30735->26080|30765->26081|30823->26110|30916->26174|30946->26175|31008->26208|31096->26267|31126->26268|31242->26355|31272->26356|31322->26377|31352->26378|31398->26395|31428->26396|31472->26411|31502->26412|31541->26423|31571->26424
                  LINES: 35->1|40->1|42->3|42->3|42->3|44->5|45->6|45->6|45->6|51->12|51->12|51->12|59->20|59->20|59->20|60->21|60->21|60->21|61->22|65->26|65->26|65->26|66->27|66->27|66->27|69->30|69->30|69->30|70->31|74->35|74->35|74->35|75->36|75->36|75->36|76->37|76->37|76->37|77->38|77->38|77->38|80->42|81->45|83->47|85->49|85->49|85->49|86->50|86->50|86->50|88->52|88->52|88->52|89->53|89->53|89->53|90->54|91->55|92->56|93->57|95->59|98->62|98->62|98->62|99->63|103->67|103->67|103->67|104->68|104->68|104->68|107->71|107->71|107->71|109->73|110->74|111->75|118->82|118->82|118->82|120->84|120->84|120->84|124->88|125->89|126->90|126->90|126->90|127->91|127->91|127->91|127->91|130->94|132->96|134->116|139->121|143->125|143->125|143->125|145->127|145->127|145->127|150->132|150->132|150->132|152->135|154->137|162->163|164->165|164->165|164->165|164->165|166->168|167->169|167->169|167->169|167->169|169->172|171->174|173->176|173->176|173->176|175->179|176->180|176->180|176->180|176->180|178->183|180->185|182->187|182->187|182->187|183->188|183->188|183->188|183->188|185->190|185->190|185->190|187->192|189->194|190->195|191->197|192->199|194->201|201->208|201->208|201->208|203->210|203->210|203->210|205->212|205->212|205->212|207->215|208->216|211->219|212->220|213->221|214->222|215->223|216->224|217->225|218->226|220->250|221->251|221->251|221->251|222->252|226->256|226->256|226->256|228->258|228->258|228->258|230->260|230->260|230->260|232->262|232->262|232->262|234->264|234->264|234->264|238->268|239->269|243->273|243->273|243->273|244->274|245->275|245->275|245->275|249->279|249->279|249->279|250->280|252->282|252->282|252->282|253->283|254->284|255->285|255->285|255->285|255->285|256->286|256->286|256->286|257->287|257->287|257->287|257->287|258->288|259->289|261->291|261->291|261->291|261->291|262->292|272->302|272->302|272->302|274->304|274->304|274->304|276->306|276->306|276->306|278->308|278->308|278->308|280->310|280->310|280->310|281->312|282->313|284->315|285->316|288->319|288->319|288->319|290->321|290->321|290->321|291->322|294->325|294->325|294->325|295->326|295->326|295->326|299->330|299->330|299->330|301->332|301->332|301->332|302->333|305->336|305->336|305->336|306->337|306->337|306->337|307->338|307->338|307->338|308->339|308->339|308->339|309->340|309->340|309->340|310->341|310->341|310->341|311->342|311->342|311->342|317->348|317->348|317->348|318->349|318->349|318->349|319->350|319->350|319->350|325->356|325->356|325->356|326->357|326->357|326->357|327->358|328->359|328->359|328->359|329->360|329->360|329->360|329->360|332->363|333->364|338->369|338->369|338->369|339->370|339->370|339->370|340->371|340->371|340->371|346->377|346->377|346->377|347->378|347->378|347->378|348->379|348->379|348->379|349->380|349->380|349->380|350->381|350->381|350->381|351->382|351->382|351->382|351->382|352->383|352->383|352->383|353->384|354->385|359->390|359->390|359->390|360->391|360->391|360->391|361->392|361->392|361->392|367->398|367->398|367->398|367->398|367->398|367->398|368->399|368->399|368->399|369->400|369->400|369->400|370->401|370->401|370->401|373->404|374->405|380->411|380->411|381->412|385->416|385->416|386->417|386->417|386->417|387->418|388->419|388->419|390->421|390->421|390->421|391->422|392->423|392->423|393->424|396->427|396->427|397->428|398->429|398->429|398->429|398->429|401->432|401->432|402->433|402->433|402->433|403->434|404->435|404->435|405->436|406->437|406->437|407->438|408->439|408->439|408->439|408->439|408->439|409->440|409->440|409->440|410->441|411->442|411->442|413->444|413->444|414->445|414->445|415->446|415->446|416->447|416->447|417->448|417->448
                  -- GENERATED --
              */
          