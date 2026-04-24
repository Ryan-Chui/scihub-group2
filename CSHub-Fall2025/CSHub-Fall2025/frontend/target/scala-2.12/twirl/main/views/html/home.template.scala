
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

object home extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Project,Long,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(projectZone: Project, userId: Long, username: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._
/*4.2*/import Long._

def /*6.2*/scripts/*6.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.13*/("""
    """),format.raw/*7.5*/("""<script type="text/javascript">
            $(document).ready(function () """),format.raw/*8.43*/("""{"""),format.raw/*8.44*/("""
                """),format.raw/*9.17*/("""// var doc = document.getElementById('description').contentWindow.document;
                // doc.open();
                var quill = new Quill('#quill-container', """),format.raw/*11.59*/("""{"""),format.raw/*11.60*/("""
                    """),format.raw/*12.21*/("""scrollingContainer: '#scrolling-container'
                """),format.raw/*13.17*/("""}"""),format.raw/*13.18*/(""");

                quill.clipboard.dangerouslyPasteHTML(entityToString());
                quill.enable(false);

                $('.dropdown-trigger').dropdown();

                $('.carousel.carousel-slider').carousel("""),format.raw/*20.57*/("""{"""),format.raw/*20.58*/("""
                    """),format.raw/*21.21*/("""fullWidth: true,
                    indicators: true
                """),format.raw/*23.17*/("""}"""),format.raw/*23.18*/(""");
            """),format.raw/*24.13*/("""}"""),format.raw/*24.14*/(""");

            function reinitIframe() """),format.raw/*26.37*/("""{"""),format.raw/*26.38*/("""
                """),format.raw/*27.17*/("""var iframe = document.getElementById("description");
                try """),format.raw/*28.21*/("""{"""),format.raw/*28.22*/("""
                    """),format.raw/*29.21*/("""var bHeight = iframe.contentWindow.document.body.scrollHeight;
                    var dHeight = iframe.contentWindow.document.documentElement.scrollHeight;
                    var height = Math.max(bHeight, dHeight);
                    iframe.height = height;
                """),format.raw/*33.17*/("""}"""),format.raw/*33.18*/(""" """),format.raw/*33.19*/("""catch (ex) """),format.raw/*33.30*/("""{"""),format.raw/*33.31*/("""
                """),format.raw/*34.17*/("""}"""),format.raw/*34.18*/("""
            """),format.raw/*35.13*/("""}"""),format.raw/*35.14*/("""

            """),format.raw/*37.13*/("""window.setInterval("reinitIframe()", 200);

            function entityToString() """),format.raw/*39.39*/("""{"""),format.raw/*39.40*/("""
                """),format.raw/*40.17*/("""var div = document.createElement('div');
                """),_display_(/*41.18*/if(projectZone!=null)/*41.39*/{_display_(Seq[Any](format.raw/*41.40*/("""
                """),format.raw/*42.17*/("""div.innerHTML = """"),_display_(/*42.35*/projectZone/*42.46*/.getDescription()),format.raw/*42.63*/("""";
                """)))}),format.raw/*43.18*/("""
                """),format.raw/*44.17*/("""var res = div.innerText || div.textContent;
                return res;
            """),format.raw/*46.13*/("""}"""),format.raw/*46.14*/("""

            """),format.raw/*48.13*/("""function readNews(newsId) """),format.raw/*48.39*/("""{"""),format.raw/*48.40*/("""

                """),format.raw/*50.17*/("""$.ajax("""),format.raw/*50.24*/("""{"""),format.raw/*50.25*/("""
                    """),format.raw/*51.21*/("""url: "/news/readNews/" + newsId,
                    type: "GET"
                """),format.raw/*53.17*/("""}"""),format.raw/*53.18*/(""").done(function (data) """),format.raw/*53.41*/("""{"""),format.raw/*53.42*/("""
                    """),format.raw/*54.21*/("""console.log(data);
                """),format.raw/*55.17*/("""}"""),format.raw/*55.18*/(""");
            """),format.raw/*56.13*/("""}"""),format.raw/*56.14*/("""

            """),format.raw/*58.76*/("""
            """),format.raw/*59.13*/("""function changeView(view)"""),format.raw/*59.38*/("""{"""),format.raw/*59.39*/("""
                """),format.raw/*60.17*/("""$.ajax("""),format.raw/*60.24*/("""{"""),format.raw/*60.25*/("""
                    """),format.raw/*61.21*/("""url: "/updateProjectZone/" + view,
                    headers: """),format.raw/*62.30*/("""{"""),format.raw/*62.31*/("""
                        """),format.raw/*63.25*/("""'Content-Type': 'application/json'
                    """),format.raw/*64.21*/("""}"""),format.raw/*64.22*/(""",
                    type: "GET"
                """),format.raw/*66.17*/("""}"""),format.raw/*66.18*/(""").done(function (data) """),format.raw/*66.41*/("""{"""),format.raw/*66.42*/("""
                    """),format.raw/*67.21*/("""window.location.reload();
                """),format.raw/*68.17*/("""}"""),format.raw/*68.18*/(""");
            """),format.raw/*69.13*/("""}"""),format.raw/*69.14*/("""
    """),format.raw/*70.5*/("""</script>
    <style>
            #prevOnMainCarousel """),format.raw/*72.33*/("""{"""),format.raw/*72.34*/("""
                """),format.raw/*73.17*/("""position: absolute;
                top: 100%;
                left: calc(50% - 100px);
            """),format.raw/*76.13*/("""}"""),format.raw/*76.14*/("""

            """),format.raw/*78.13*/("""#nextOnMainCarousel """),format.raw/*78.33*/("""{"""),format.raw/*78.34*/("""
                """),format.raw/*79.17*/("""position: absolute;
                top: 100%;
                right: calc(50% - 100px);
            """),format.raw/*82.13*/("""}"""),format.raw/*82.14*/("""
    """),format.raw/*83.5*/("""</style>

""")))};
Seq[Any](format.raw/*1.56*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*85.2*/("""

"""),_display_(/*87.2*/main("SMU-Lyle-Sci-Hub", scripts)/*87.35*/ {_display_(Seq[Any](format.raw/*87.37*/("""
    """),format.raw/*88.5*/("""<link href='"""),_display_(/*88.18*/routes/*88.24*/.Assets.at("stylesheets/quill.snow.css")),format.raw/*88.64*/("""'
    rel="stylesheet" />
    <script type="text/javascript" src='"""),_display_(/*90.42*/routes/*90.48*/.Assets.at("javascripts/plugins/quill.js")),format.raw/*90.90*/("""'></script>
    """),_display_(/*91.6*/if(projectZone != null)/*91.29*/ {_display_(Seq[Any](format.raw/*91.31*/("""
        """),format.raw/*92.9*/("""<div class="container">
            <div class="row">
                <div class="col s12 m12">
                    <div class="card-panel center">
                        <div class="row card-panel z-depth-0 project-zone-panel">
                            <div class="col s12" style="margin-top: -10px; margin-bottom: -10px;">
                                <h6 class="left tooltipped" data-position="bottom" data-tooltip="This list shows all the Notebooks associated with your current project zone." >
                                    Current Project Zone :
                                    """),_display_(/*100.38*/if(projectZone != null)/*100.61*/ {_display_(Seq[Any](format.raw/*100.63*/("""
                                        """),format.raw/*101.41*/("""<a style="color: #97f1ac;" href=""""),_display_(/*101.75*/routes/*101.81*/.ProjectController.projectDetail(projectZone.getId())),format.raw/*101.134*/("""">"""),_display_(/*101.137*/projectZone/*101.148*/.getTitle()),format.raw/*101.159*/(""" """),format.raw/*101.160*/("""</a>
                                    """)))}/*102.39*/else/*102.44*/{_display_(Seq[Any](format.raw/*102.45*/("""
                                        """),format.raw/*103.41*/("""OpenNEX
                                    """)))}),format.raw/*104.38*/("""
                                """),format.raw/*105.33*/("""</h6>
                                <a class='dropdown-trigger right' href='#' data-target='dropdown1' style="text-transform: none;
                                    font-weight: bold;
                                    color: white;
                                    padding-top: 8px;
                                    font-family: AmazonEmberBold, Helvetica Neue Bold, Helvetica Neue, Helvetica, Arial, sans-serif;
                                !important;"><font style="weight: bold;"> <u>
                                    Change Project Zone </u></font><i class="material-icons right">expand_more</i>
                                </a>
                                    <!-- Dropdown Structure -->
                                <ul id='dropdown1' class='dropdown-content'>
                                    <li><a href="#!" onclick="changeView('normal')"><i class="material-icons">view_module </i>OpenNEX project zone</a></li>
                                    <li><a href="#!" onclick="changeView('default')"><i class="material-icons">pages</i>Your default zone</a></li>
                                    <li><a href=""""),_display_(/*118.51*/routes/*118.57*/.ProjectController.projectList(1, "")),format.raw/*118.94*/(""""><i class="material-icons">monochrome_photos</i>Change to other project zone</a></li>
                                </ul>

                                    <!-- Dropdown Trigger -->

                            </div>
                        </div>
                        <div class="row">
                            <div class=" col s12">
                                <h4 class="center"> """),_display_(/*127.54*/projectZone/*127.65*/.getTitle()),format.raw/*127.76*/("""</h4>
                                """),format.raw/*128.100*/("""
                            """),format.raw/*129.29*/("""</div>
                        </div>

                        """),_display_(/*132.26*/if(projectZone.getImageUrl != "null" && projectZone.getImageUrl.length > 0)/*132.101*/ {_display_(Seq[Any](format.raw/*132.103*/("""
                            """),format.raw/*133.29*/("""<div class="row">
                                <div class="col s12">
                                    <img width="100%" style="display: block;
                                        margin-left: auto;
                                        margin-right: auto;" src =""""),_display_(/*137.69*/projectZone/*137.80*/.getImageUrl),format.raw/*137.92*/(""""/>
                                </div>
                            </div>
                        """)))}),format.raw/*140.26*/("""

                        """),format.raw/*142.25*/("""<div class="row">
                            <div class=" col s12">
                                <div id="quill-container">
                                </div>
                            </div>
                        </div>
                        """),_display_(/*148.26*/if(projectZone.getPdf != null && projectZone.getPdf != "null" && projectZone.getPdf != "")/*148.116*/ {_display_(Seq[Any](format.raw/*148.118*/("""
                            """),format.raw/*149.29*/("""<a href=""""),_display_(/*149.39*/projectZone/*149.50*/.getPdf),format.raw/*149.57*/("""" class="btn waves-effect waves-light yellow darken-3">
                                Download Project PDF</a>
                        """)))}),format.raw/*151.26*/("""
                    """),format.raw/*152.21*/("""</div>
                </div>
            </div>
        </div>
    """)))}/*156.7*/else/*156.12*/{_display_(Seq[Any](format.raw/*156.13*/("""
        """),format.raw/*157.9*/("""<div class="row">
            <div class="col s12 blue darken-4 white-text" style='background: url(""""),_display_(/*158.84*/routes/*158.90*/.Assets.at("images/starfield-banner-blue.jpg")),format.raw/*158.136*/("""") repeat;'>
                <div class="container">
                    <div class="carousel carousel-slider center" id="mainCarousel">
                        <div class="carousel-fixed-item center">
                            <a class="btn-floating white waves-effect waves-light" id="prevOnMainCarousel" title="Previous Slide"><i class="material-icons blue-text text-darken-3">
                                keyboard_arrow_left</i></a>
                            <a class="btn-floating white waves-effect waves-light" id="nextOnMainCarousel" title="Next Slide"><i class="material-icons blue-text text-darken-3">
                                keyboard_arrow_right</i></a>
                        </div>
                        <div class="carousel-item white-text" href="#one!">
                            <div class="col s12">
                                <h1 class="center"><strong>SMU-Lyle-Sci-Hub</strong></h1>
                                <h3 class="center">Intelligent Assistant Linking SMU to Local Industry</h3>
                            </div>
                        </div>

                        <div class="carousel-item white-text" href="#two!">
                            <div class="row">
                                <div class="col s5 offset-s1 left-align">
                                    <h1 style='font-size: 3.5em;'><strong>Open Collaboration Platform</strong></h1>
                                    <h6 style="font-size: 1.5em;
                                        font-weight: 100;
                                        line-height: 40px;">
                                        A platform supporting and facilitating SMU/industry collaboration.</h6>
                                </div>
                                <div class="col s6">
                                    """),format.raw/*184.156*/("""
                                    """),format.raw/*185.99*/("""
                                    """),format.raw/*186.37*/("""<img src='"""),_display_(/*186.48*/routes/*186.54*/.Assets.at("images/home_collaboration.png")),format.raw/*186.97*/("""' class="responsive-img" style="width: 350px;
                                        margin-top: 1rem;">
                                </div>
                            </div>
                        </div>
                        <div class="carousel-item white-text" href="#three!">
                            <div class="row">
                                <div class="col s5 offset-s1 left-align">
                                    <h1 style='font-size: 3.5em;'><strong>SMU World of Talent at Your Fingertips</strong></h1>
                                    <h6 style="font-size: 1.5em;
                                        font-weight: 100;
                                        line-height: 40px;">
                                        With a full understanding of the needs of university/industry collaboration, we make it easy for industry to find SMU researchers.</h6>
                                </div>
                                <div class="col s6 left-align">
                                    """),format.raw/*201.170*/("""
                                    """),format.raw/*202.97*/("""
                                    """),format.raw/*203.104*/("""
                                    """),format.raw/*204.37*/("""<img src='"""),_display_(/*204.48*/routes/*204.54*/.Assets.at("images/red_home_smu.jpg")),format.raw/*204.91*/("""' class="responsive-img" style="width: 500px;
                                        margin-top: 1rem;">
                                </div>
                            </div>
                        </div>
                        <div class="carousel-item white-text" href="#four!">
                            <div class="row">
                                <div class="col s5 offset-s1 left-align">
                                    <h1 style='font-size: 3.5em;'><strong>Window to SMU technology</strong></h1>
                                    <h6 style="font-size: 1.5em;
                                        font-weight: 100;
                                        line-height: 40px;">
                                        Help you understand the latest exciting technology invented by SMU faculty and students.</h6>
                                </div>
                                <div class="col s6 left-align">
                                    """),format.raw/*219.150*/("""
                                    """),format.raw/*220.99*/("""
                                    """),format.raw/*221.37*/("""<img src='"""),_display_(/*221.48*/routes/*221.54*/.Assets.at("images/research_day.jpg")),format.raw/*221.91*/("""' class="responsive-img" style="margin-top: 1rem;">

                                </div>
                            </div>
                        </div>
                        <div class="carousel-item white-text" href="#five!">
                            <div class="row">
                                <div class="col s5 offset-s1 left-align">
                                    <h1 style='font-size: 3.5em;'><strong>A Community-Driven Hub</strong></h1>
                                    <h6 style="font-size: 1.5em;
                                        font-weight: 100;
                                        line-height: 40px;">
                                        Tell us your wishes, and we will update this portal for you.</h6>
                                </div>
                                <div class="col s6">
                                    """),format.raw/*236.184*/("""
                                    """),format.raw/*237.98*/("""
                                    """),format.raw/*238.83*/("""
                                    """),format.raw/*239.37*/("""<img src='"""),_display_(/*239.48*/routes/*239.54*/.Assets.at("images/collaboration_flat.png")),format.raw/*239.97*/("""' class="responsive-img" style="width: 60%;
                                        height: 60%;
                                        margin-top: 1rem;">

                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="row">
                <div class="col l3 s12">
                    <div class="card z-depth-0">
                        <div class="card-content" style="padding: 0;">
                            <ul class="collection borderless with-header">
                                <li class="collection-header"><h5 class="center">Local Industry</h5></li>


                                <li class="collection-item">
                                """),_display_(/*259.34*/if(userId > 0)/*259.48*/ {_display_(Seq[Any](format.raw/*259.50*/("""
                                    """),format.raw/*260.37*/("""<a href=""""),_display_(/*260.47*/routes/*260.53*/.OrganizationController.organizationListPage(1, "")),format.raw/*260.104*/("""">
                                        Organization List
                                    </a>
                                """)))}/*263.35*/else/*263.40*/{_display_(Seq[Any](format.raw/*263.41*/("""
                                    """),format.raw/*264.37*/("""<span style="color: black;">
                                        Organization List
                                    </span>
                                """)))}),format.raw/*267.34*/("""
                                """),format.raw/*268.33*/("""</li>
                                <li class="collection-item">
                                """),_display_(/*270.34*/if(userId > 0)/*270.48*/ {_display_(Seq[Any](format.raw/*270.50*/("""
                                    """),format.raw/*271.37*/("""<a href=""""),_display_(/*271.47*/routes/*271.53*/.ChallengeController.challengeList(1, "")),format.raw/*271.94*/("""">
                                        Challenge List
                                    </a>
                                """)))}/*274.35*/else/*274.40*/{_display_(Seq[Any](format.raw/*274.41*/("""
                                    """),format.raw/*275.37*/("""<span style="color: black;">
                                        Challenge List
                                    </span>
                                """)))}),format.raw/*278.34*/("""
                                """),format.raw/*279.33*/("""</li>
                                <li class="collection-item">
                                """),_display_(/*281.34*/if(userId > 0)/*281.48*/ {_display_(Seq[Any](format.raw/*281.50*/("""
                                    """),format.raw/*282.37*/("""<a href=""""),_display_(/*282.47*/routes/*282.53*/.RAJobController.rajobList(1, "")),format.raw/*282.86*/("""">
                                        RA Job  List
                                    </a>
                                """)))}/*285.35*/else/*285.40*/{_display_(Seq[Any](format.raw/*285.41*/("""
                                    """),format.raw/*286.37*/("""<span style="color: black;">
                                        RA Job List
                                    </span>
                                """)))}),format.raw/*289.34*/("""
                                """),format.raw/*290.33*/("""</li>
                                """),format.raw/*296.63*/("""
                            """),format.raw/*297.29*/("""</ul>
                        </div>
                    </div>
                </div>
                <div class="col l3 s12">
                    <div class="card z-depth-0">
                        <div class="card-content" style="padding: 0;">
                            <ul class="collection borderless with-header">
                                <li class="collection-header"><h5 class="center">SMU Researchers</h5></li>
                                <li class="collection-item">
                                """),_display_(/*307.34*/if(userId > 0)/*307.48*/ {_display_(Seq[Any](format.raw/*307.50*/("""
                                    """),format.raw/*308.37*/("""<a href=""""),_display_(/*308.47*/routes/*308.53*/.AuthorController.authorList(1, "id")),format.raw/*308.90*/("""">
                                        Researcher List
                                    </a>
                                """)))}/*311.35*/else/*311.40*/{_display_(Seq[Any](format.raw/*311.41*/("""
                                    """),format.raw/*312.37*/("""<span style="color: black;">
                                        Researcher List
                                    </span>
                                """)))}),format.raw/*315.34*/("""
                                """),format.raw/*316.33*/("""</li>
                                <li class="collection-item">
                                """),_display_(/*318.34*/if(userId > 0)/*318.48*/ {_display_(Seq[Any](format.raw/*318.50*/("""
                                    """),format.raw/*319.37*/("""<a href=""""),_display_(/*319.47*/routes/*319.53*/.TechnologyController.technologyList(1, "id")),format.raw/*319.98*/("""">
                                        Technology List
                                    </a>
                                """)))}/*322.35*/else/*322.40*/{_display_(Seq[Any](format.raw/*322.41*/("""
                                    """),format.raw/*323.37*/("""<span style="color: black;">
                                        Technology List
                                    </span>
                                """)))}),format.raw/*326.34*/("""
                                """),format.raw/*327.33*/("""</li>
                                <li class="collection-item">
                                """),_display_(/*329.34*/if(userId > 0)/*329.48*/ {_display_(Seq[Any](format.raw/*329.50*/("""
                                    """),format.raw/*330.37*/("""<a href=""""),_display_(/*330.47*/routes/*330.53*/.AuthorController.searchPage()),format.raw/*330.83*/("""">
                                        Find researchers
                                    </a>
                                """)))}/*333.35*/else/*333.40*/{_display_(Seq[Any](format.raw/*333.41*/("""
                                    """),format.raw/*334.37*/("""<span style="color: black;">
                                        Find researchers
                                    </span>
                                """)))}),format.raw/*337.34*/("""
                                """),format.raw/*338.33*/("""</li>
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="col l3 s12">
                    <div class="card z-depth-0">
                        <div class="card-content" style="padding: 0;">
                            <ul class="collection borderless with-header">
                                <li class="collection-header"><h5 class="center">My Dashboard</h5></li>

                                <li class="collection-item">
                                """),_display_(/*350.34*/if(userId > 0)/*350.48*/ {_display_(Seq[Any](format.raw/*350.50*/("""
                                    """),format.raw/*351.37*/("""<a href=""""),_display_(/*351.47*/routes/*351.53*/.UserController.userEditPage()),format.raw/*351.83*/("""">
                                        My Account
                                    </a>
                                """)))}/*354.35*/else/*354.40*/{_display_(Seq[Any](format.raw/*354.41*/("""
                                    """),format.raw/*355.37*/("""<span style="color: black;">
                                        My Account
                                    </span>
                                """)))}),format.raw/*358.34*/("""
                                """),format.raw/*359.33*/("""</li>

                                <li class="collection-item">
                                """),_display_(/*362.34*/if(userId > 0)/*362.48*/ {_display_(Seq[Any](format.raw/*362.50*/("""
                                    """),format.raw/*363.37*/("""<a href=""""),_display_(/*363.47*/routes/*363.53*/.JobController.jobList(1, "id")),format.raw/*363.84*/("""">
                                        Posted Jobs
                                    </a>
                                """)))}/*366.35*/else/*366.40*/{_display_(Seq[Any](format.raw/*366.41*/("""
                                    """),format.raw/*367.37*/("""<span style="color: black;">
                                        Posted Jobs
                                    </span>
                                """)))}),format.raw/*370.34*/("""
                                """),format.raw/*371.33*/("""</li>

                                <li class="collection-item">
                                """),_display_(/*374.34*/if(userId > 0)/*374.48*/ {_display_(Seq[Any](format.raw/*374.50*/("""
                                    """),format.raw/*375.37*/("""<a href=""""),_display_(/*375.47*/routes/*375.53*/.RAJobController.rajobList(1, "id")),format.raw/*375.88*/("""">
                                        Posted RA Jobs
                                    </a>
                                """)))}/*378.35*/else/*378.40*/{_display_(Seq[Any](format.raw/*378.41*/("""
                                    """),format.raw/*379.37*/("""<span style="color: black;">
                                        Posted RA Jobs
                                    </span>
                                """)))}),format.raw/*382.34*/("""
                                """),format.raw/*383.33*/("""</li>
                                """),format.raw/*389.63*/("""
                            """),format.raw/*390.29*/("""</ul>
                        </div>
                    </div>
                </div>
                <div class="col l3 s12">
                    <div class="card z-depth-0">
                        <div class="card-content" style="padding: 0;">
                            <ul class="collection borderless with-header">
                                <li class="collection-header"><h5 class="center">SMU-Lyle-Sci-Hub</h5></li>

                                <li class="collection-item">
                                    <a href="https://www.youtube.com/watch?v=JKLLeDUGH68">
                                        Visual tutorials</a><a class="secondary-content"><i class="material-icons black-text" style="curser:default">
                                    list</i></a></li>
                                <li class="collection-item"><a href=""""),_display_(/*404.71*/routes/*404.77*/.AboutController.aboutProject()),format.raw/*404.108*/("""">
                                    About Project</a><a class="secondary-content"><i class="material-icons black-text">
                                    view_list</i></a></li>
                                <li class="collection-item"><a href=""""),_display_(/*407.71*/routes/*407.77*/.AboutController.aboutUs()),format.raw/*407.103*/("""">
                                    About Us</a><a class="secondary-content"><i class="material-icons black-text">
                                    view_module</i></a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
            <br>
            <div class="row" style="margin-top: -30px;">
                """),format.raw/*417.57*/("""
                """),format.raw/*418.17*/("""<div class="col s8 offset-s2">
                    <div class="card-content z-depth-0">
                        <div class="center" style="padding: 7px;">


                            """),format.raw/*423.151*/("""
                            """),format.raw/*424.100*/("""
                            """),format.raw/*425.98*/("""
                            """),format.raw/*426.96*/("""
                            """),format.raw/*427.106*/("""
                            """),format.raw/*428.109*/("""
                            """),format.raw/*429.70*/("""
                        """),format.raw/*430.25*/("""</div>
                        """),format.raw/*431.35*/("""
                    """),format.raw/*432.21*/("""</div>
                </div>
            </div>
            <br>

            <div class="row">
                <div class="col s12">

                </div>
            </div>
        </div>
    """)))}),format.raw/*443.6*/("""
""")))}))
      }
    }
  }

  def render(projectZone:Project,userId:Long,username:String): play.twirl.api.HtmlFormat.Appendable = apply(projectZone,userId,username)

  def f:((Project,Long,String) => play.twirl.api.HtmlFormat.Appendable) = (projectZone,userId,username) => apply(projectZone,userId,username)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:31 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/home.scala.html
                  HASH: 869fa6b1689ba5c46efef5be802b9f537ec6f833
                  MATRIX: 1123->1|1250->58|1273->75|1299->91|1313->98|1393->102|1424->107|1525->181|1553->182|1597->199|1790->364|1819->365|1868->386|1955->445|1984->446|2234->668|2263->669|2312->690|2410->760|2439->761|2482->776|2511->777|2579->817|2608->818|2653->835|2754->908|2783->909|2832->930|3138->1208|3167->1209|3196->1210|3235->1221|3264->1222|3309->1239|3338->1240|3379->1253|3408->1254|3450->1268|3560->1350|3589->1351|3634->1368|3719->1426|3749->1447|3788->1448|3833->1465|3878->1483|3898->1494|3936->1511|3987->1531|4032->1548|4144->1632|4173->1633|4215->1647|4269->1673|4298->1674|4344->1692|4379->1699|4408->1700|4457->1721|4566->1802|4595->1803|4646->1826|4675->1827|4724->1848|4787->1883|4816->1884|4859->1899|4888->1900|4930->1977|4971->1990|5024->2015|5053->2016|5098->2033|5133->2040|5162->2041|5211->2062|5303->2126|5332->2127|5385->2152|5468->2207|5497->2208|5575->2258|5604->2259|5655->2282|5684->2283|5733->2304|5803->2346|5832->2347|5875->2362|5904->2363|5936->2368|6018->2422|6047->2423|6092->2440|6220->2540|6249->2541|6291->2555|6339->2575|6368->2576|6413->2593|6542->2694|6571->2695|6603->2700|6653->55|6681->89|6709->2711|6738->2714|6780->2747|6820->2749|6852->2754|6892->2767|6907->2773|6968->2813|7062->2880|7077->2886|7140->2928|7183->2945|7215->2968|7255->2970|7291->2979|7921->3581|7954->3604|7995->3606|8065->3647|8127->3681|8143->3687|8219->3740|8251->3743|8273->3754|8307->3765|8338->3766|8400->3809|8414->3814|8454->3815|8524->3856|8601->3901|8663->3934|9841->5084|9857->5090|9916->5127|10345->5528|10366->5539|10399->5550|10467->5655|10525->5684|10617->5748|10703->5823|10745->5825|10803->5854|11107->6130|11128->6141|11162->6153|11297->6256|11352->6282|11638->6540|11739->6630|11781->6632|11839->6661|11877->6671|11898->6682|11927->6689|12097->6827|12147->6848|12235->6918|12249->6923|12289->6924|12326->6933|12455->7034|12471->7040|12540->7086|14409->9044|14475->9143|14541->9180|14580->9191|14596->9197|14661->9240|15726->10408|15792->10505|15859->10609|15925->10646|15964->10657|15980->10663|16039->10700|17047->11791|17113->11890|17179->11927|17218->11938|17234->11944|17293->11981|18207->13012|18273->13110|18339->13193|18405->13230|18444->13241|18460->13247|18525->13290|19354->14091|19378->14105|19419->14107|19485->14144|19523->14154|19539->14160|19613->14211|19768->14347|19782->14352|19822->14353|19888->14390|20084->14554|20146->14587|20274->14687|20298->14701|20339->14703|20405->14740|20443->14750|20459->14756|20522->14797|20674->14930|20688->14935|20728->14936|20794->14973|20987->15134|21049->15167|21177->15267|21201->15281|21242->15283|21308->15320|21346->15330|21362->15336|21417->15369|21567->15500|21581->15505|21621->15506|21687->15543|21877->15701|21939->15734|22006->16264|22064->16293|22616->16817|22640->16831|22681->16833|22747->16870|22785->16880|22801->16886|22860->16923|23013->17057|23027->17062|23067->17063|23133->17100|23327->17262|23389->17295|23517->17395|23541->17409|23582->17411|23648->17448|23686->17458|23702->17464|23769->17509|23922->17643|23936->17648|23976->17649|24042->17686|24236->17848|24298->17881|24426->17981|24450->17995|24491->17997|24557->18034|24595->18044|24611->18050|24663->18080|24817->18215|24831->18220|24871->18221|24937->18258|25132->18421|25194->18454|25778->19010|25802->19024|25843->19026|25909->19063|25947->19073|25963->19079|26015->19109|26163->19238|26177->19243|26217->19244|26283->19281|26472->19438|26534->19471|26663->19572|26687->19586|26728->19588|26794->19625|26832->19635|26848->19641|26901->19672|27050->19802|27064->19807|27104->19808|27170->19845|27360->20003|27422->20036|27551->20137|27575->20151|27616->20153|27682->20190|27720->20200|27736->20206|27793->20241|27945->20374|27959->20379|27999->20380|28065->20417|28258->20578|28320->20611|28387->21145|28445->21174|29331->22032|29347->22038|29401->22069|29681->22321|29697->22327|29746->22353|30178->22796|30224->22813|30439->23120|30498->23220|30556->23318|30614->23414|30673->23520|30732->23629|30790->23699|30844->23724|30904->23765|30954->23786|31183->23984
                  LINES: 35->1|38->3|39->4|41->6|41->6|43->6|44->7|45->8|45->8|46->9|48->11|48->11|49->12|50->13|50->13|57->20|57->20|58->21|60->23|60->23|61->24|61->24|63->26|63->26|64->27|65->28|65->28|66->29|70->33|70->33|70->33|70->33|70->33|71->34|71->34|72->35|72->35|74->37|76->39|76->39|77->40|78->41|78->41|78->41|79->42|79->42|79->42|79->42|80->43|81->44|83->46|83->46|85->48|85->48|85->48|87->50|87->50|87->50|88->51|90->53|90->53|90->53|90->53|91->54|92->55|92->55|93->56|93->56|95->58|96->59|96->59|96->59|97->60|97->60|97->60|98->61|99->62|99->62|100->63|101->64|101->64|103->66|103->66|103->66|103->66|104->67|105->68|105->68|106->69|106->69|107->70|109->72|109->72|110->73|113->76|113->76|115->78|115->78|115->78|116->79|119->82|119->82|120->83|123->1|125->5|126->85|128->87|128->87|128->87|129->88|129->88|129->88|129->88|131->90|131->90|131->90|132->91|132->91|132->91|133->92|141->100|141->100|141->100|142->101|142->101|142->101|142->101|142->101|142->101|142->101|142->101|143->102|143->102|143->102|144->103|145->104|146->105|159->118|159->118|159->118|168->127|168->127|168->127|169->128|170->129|173->132|173->132|173->132|174->133|178->137|178->137|178->137|181->140|183->142|189->148|189->148|189->148|190->149|190->149|190->149|190->149|192->151|193->152|197->156|197->156|197->156|198->157|199->158|199->158|199->158|225->184|226->185|227->186|227->186|227->186|227->186|242->201|243->202|244->203|245->204|245->204|245->204|245->204|260->219|261->220|262->221|262->221|262->221|262->221|277->236|278->237|279->238|280->239|280->239|280->239|280->239|300->259|300->259|300->259|301->260|301->260|301->260|301->260|304->263|304->263|304->263|305->264|308->267|309->268|311->270|311->270|311->270|312->271|312->271|312->271|312->271|315->274|315->274|315->274|316->275|319->278|320->279|322->281|322->281|322->281|323->282|323->282|323->282|323->282|326->285|326->285|326->285|327->286|330->289|331->290|332->296|333->297|343->307|343->307|343->307|344->308|344->308|344->308|344->308|347->311|347->311|347->311|348->312|351->315|352->316|354->318|354->318|354->318|355->319|355->319|355->319|355->319|358->322|358->322|358->322|359->323|362->326|363->327|365->329|365->329|365->329|366->330|366->330|366->330|366->330|369->333|369->333|369->333|370->334|373->337|374->338|386->350|386->350|386->350|387->351|387->351|387->351|387->351|390->354|390->354|390->354|391->355|394->358|395->359|398->362|398->362|398->362|399->363|399->363|399->363|399->363|402->366|402->366|402->366|403->367|406->370|407->371|410->374|410->374|410->374|411->375|411->375|411->375|411->375|414->378|414->378|414->378|415->379|418->382|419->383|420->389|421->390|435->404|435->404|435->404|438->407|438->407|438->407|448->417|449->418|454->423|455->424|456->425|457->426|458->427|459->428|460->429|461->430|462->431|463->432|474->443
                  -- GENERATED --
              */
          