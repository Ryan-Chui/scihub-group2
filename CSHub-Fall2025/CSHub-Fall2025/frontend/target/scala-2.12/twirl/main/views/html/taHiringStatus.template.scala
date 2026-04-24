
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

object taHiringStatus extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template12[List[CourseTAAssignment],Integer,String,Integer,Integer,Integer,String,Integer,String,Long,Integer,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(courseTAAssignments: List[CourseTAAssignment],
        pageNum: Integer,
        sort: String,
        offset: Integer,
        total: Integer,
        count: Integer,
        listType: String,
        pageLimit: Integer,
        searchBody: String,
        id: Long, beginIndexForPagination: Integer, endIndexForPagination: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*12.2*/import models.CourseTAAssignment
/*13.2*/import models._
/*14.2*/import models.Course

def /*17.2*/scripts/*17.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*17.13*/("""
    """),format.raw/*18.5*/("""<script type = "module" src='"""),_display_(/*18.35*/routes/*18.41*/.Assets.at("javascripts/voiceJump.js")),format.raw/*18.79*/("""'></script>
    <script type="text/javascript">

            $(document).ready(function () """),format.raw/*21.43*/("""{"""),format.raw/*21.44*/("""
                """),format.raw/*22.17*/("""var technologiesArtay = []
                """),_display_(/*23.18*/for(i <- 0 until courseTAAssignments.size) yield /*23.60*/ {_display_(Seq[Any](format.raw/*23.62*/("""
                """),format.raw/*24.17*/("""var json = """),format.raw/*24.28*/("""{"""),format.raw/*24.29*/("""}"""),format.raw/*24.30*/(""";
                json.id = '"""),_display_(/*25.29*/courseTAAssignments/*25.48*/.get(i).getId()),format.raw/*25.63*/("""';
                json.url = "/tahiring/status/" + json.id;

                json.courseId = '"""),_display_(/*28.35*/courseTAAssignments/*28.54*/.get(i).getCourse().getCourseId()),format.raw/*28.87*/("""'.replace(/[^a-zA-Z0-9]/g, " ").replace(/  +/g, " ").trim();
                console.log("jsonhere:" + json)
                technologiesArtay.push(json)
                """)))}),format.raw/*31.18*/("""
                """),format.raw/*32.17*/("""$("#nasaText").text(JSON.stringify(technologiesArtay));

                $('.tooltipped').tooltip();

                // $("#speak-from-filter").click();
                // $("#speak-nasa").click();
                // $("#speak-from-filter").click();



            """),format.raw/*42.13*/("""}"""),format.raw/*42.14*/(""");

            function jumpToPage(pageNum, sort, searchString) """),format.raw/*44.62*/("""{"""),format.raw/*44.63*/("""

                """),format.raw/*46.17*/("""pageNum =  parseInt(pageNum);

                var url = "/tahiring/searchPOST?pageNum=" + (pageNum) + "&sortCriteria=" + sort;
                var form = $(document.createElement('form'));
                $(form).attr("action", url);
                $(form).attr("method", "POST");
                $(form).css("display", "none");


                var form_searchString = $("<input>")
                        .attr("type", "text")
                        .attr("name", "searchString")
                        .val(searchString);
                $(form).append($(form_searchString));

                form.appendTo(document.body);
                $(form).submit();
            """),format.raw/*63.13*/("""}"""),format.raw/*63.14*/("""

            """),format.raw/*65.13*/("""function string2Map(str) """),format.raw/*65.38*/("""{"""),format.raw/*65.39*/("""

                """),format.raw/*67.17*/("""var map = new Map();
                var splitedString = str.replace(new RegExp("],", 'g'), ";");
                var artay = splitedString.split(";");
                for(var i=0; i<artay.length ;i++)"""),format.raw/*70.50*/("""{"""),format.raw/*70.51*/("""
                    """),format.raw/*71.21*/("""var idAndEventsString = artay[i];
                    idAndEventsString = idAndEventsString.replace(/["""),format.raw/*72.69*/("""{"""),format.raw/*72.70*/("""}"""),format.raw/*72.71*/("""[\]\\]/g, " ");
                    var idAndEvents = idAndEventsString.split("=");
                    var id = idAndEvents[0];
                    var eventsString = idAndEvents[1];
                    var events = eventsString.split(",");
                    console.log("events:" + events + "," + i);

                    var formatedEvents = "";
                    for(var j=0; j<events.length ;j++)"""),format.raw/*80.55*/("""{"""),format.raw/*80.56*/("""
                        """),format.raw/*81.25*/("""events[j] = events[j].trim();
                        formatedEvents = formatedEvents + events[j] + ";";
                    """),format.raw/*83.21*/("""}"""),format.raw/*83.22*/("""
                    """),format.raw/*84.21*/("""if(formatedEvents.length > 1)
                        map.set(id.trim(), formatedEvents);
                """),format.raw/*86.17*/("""}"""),format.raw/*86.18*/("""

                """),format.raw/*88.17*/("""return map;
            """),format.raw/*89.13*/("""}"""),format.raw/*89.14*/("""



    """),format.raw/*93.5*/("""</script>
    <style>
            .follow-fab """),format.raw/*95.25*/("""{"""),format.raw/*95.26*/("""
                """),format.raw/*96.17*/("""top: -20px !important;
                bottom: auto !important;
                right: -20px !important;
            """),format.raw/*99.13*/("""}"""),format.raw/*99.14*/("""
    """),format.raw/*100.5*/("""</style>
""")))};
Seq[Any](format.raw/*10.84*/("""

"""),format.raw/*15.1*/("""

"""),format.raw/*101.2*/("""

"""),_display_(/*103.2*/main("TA Hiring Status", scripts)/*103.35*/ {_display_(Seq[Any](format.raw/*103.37*/("""
    """),format.raw/*104.5*/("""<div class="container">
        <div class="card-panel center">
            """),_display_(/*106.14*/if(listType.equals("search"))/*106.43*/ {_display_(Seq[Any](format.raw/*106.45*/("""
                """),format.raw/*107.17*/("""<div class="row card-panel z-depth-0 project-zone-panel">
                    <div class="col s12" style="margin-top: -10px;
                        margin-bottom: -10px;">
                        <h6 class="center tooltipped" data-position="bottom" data-tooltip="This list shows the search results." >
                            Search Result
                        </h6>
                    </div>
                </div>
            """)))}/*115.14*/else if(listType.equals("all"))/*115.46*/ {_display_(Seq[Any](format.raw/*115.48*/("""
            """),format.raw/*116.13*/("""<div class="row card-panel z-depth-0 project-zone-panel">
                <div class="col s12" style="margin-top: -10px;
                    margin-bottom: -10px;">
                    <h6 class="center tooltipped" data-position="bottom" data-tooltip="This list shows all the TA candidates." >
                        Current TA at SMU-Sci-Hub
                    </h6>
                </div>
            </div>
            """)))}),format.raw/*124.14*/("""

            """),_display_(/*126.14*/if(courseTAAssignments.size() > 0)/*126.48*/ {_display_(Seq[Any](format.raw/*126.50*/("""
                """),format.raw/*127.17*/("""<div class="col s8 offset-s2">
                    <h4>TA Hiring Status List</h4>

                </div>
                <div class="col s2">
                    <button id = "speak-from-filter" hidden></button>
                    <div id="nasaText" hidden></div>
                    <div id="requestField"></div>
                    <div id="replyField"></div>
                </div>

                <table class="centered responsive-table striped" id="projectTable" >
                    <thead>
                        <tr class="list-header" style="border-bottom: 1px solid;
                        !important;">
                            <th style="cursor: pointer;">Student Name</th>
                            <th style="cursor: pointer;">Email</th>
                            <th style="cursor: pointer;">Status</th>
                            <th style="cursor: pointer;">Hrs/week</th>
                            <th style="cursor: pointer;">TA Course ID</th>
                        </tr>
                    </thead>
                    <tbody>
                    """),_display_(/*150.22*/for((entry, index) <- courseTAAssignments.zipWithIndex) yield /*150.77*/ {_display_(Seq[Any](format.raw/*150.79*/("""
                        """),format.raw/*151.25*/("""<tr>
"""),format.raw/*152.141*/("""


                            """),_display_(/*155.30*/if(entry.getTaCandidate().getApplicant().getUserName() != "")/*155.91*/ {_display_(Seq[Any](format.raw/*155.93*/("""
                                """),format.raw/*156.33*/("""<td><span class=""""),_display_(/*156.51*/entry/*156.56*/.getId()),format.raw/*156.64*/(""" """),format.raw/*156.65*/("""editable" data-name='Name'></span>
                                    """),_display_(/*157.38*/entry/*157.43*/.getTaCandidate().getApplicant().getUserName()),format.raw/*157.89*/("""
                                """),format.raw/*158.33*/("""</td>
                            """)))}/*159.31*/else/*159.36*/{_display_(Seq[Any](format.raw/*159.37*/("""
                                """),format.raw/*160.33*/("""<td><span class=""""),_display_(/*160.51*/entry/*160.56*/.getId()),format.raw/*160.64*/(""" """),format.raw/*160.65*/("""editable" data-name='Name'> -</span></td>
                            """)))}),format.raw/*161.30*/("""

                            """),_display_(/*163.30*/if(entry.getTaCandidate().getApplicant().getEmail() != "")/*163.88*/ {_display_(Seq[Any](format.raw/*163.90*/("""
                                """),format.raw/*164.33*/("""<td><span class=""""),_display_(/*164.51*/entry/*164.56*/.getId()),format.raw/*164.64*/(""" """),format.raw/*164.65*/("""editable" data-name='status'></span>

                                    """),_display_(/*166.38*/entry/*166.43*/.getTaCandidate().getApplicant().getEmail()),format.raw/*166.86*/("""
                                """),format.raw/*167.33*/("""</td>
                            """)))}/*168.31*/else/*168.36*/{_display_(Seq[Any](format.raw/*168.37*/("""
                                """),format.raw/*169.33*/("""<td><span class=""""),_display_(/*169.51*/entry/*169.56*/.getId()),format.raw/*169.64*/(""" """),format.raw/*169.65*/("""editable" data-name='status'> -</span></td>
                            """)))}),format.raw/*170.30*/("""

                            """),_display_(/*172.30*/if(entry.getTaCandidate().getStatus() != "")/*172.74*/ {_display_(Seq[Any](format.raw/*172.76*/("""
                                """),format.raw/*173.33*/("""<td><span class=""""),_display_(/*173.51*/entry/*173.56*/.getId()),format.raw/*173.64*/(""" """),format.raw/*173.65*/("""editable" data-name='status'></span>

                                    """),_display_(/*175.38*/entry/*175.43*/.getTaCandidate().getStatus()),format.raw/*175.72*/("""
                                """),format.raw/*176.33*/("""</td>
                            """)))}/*177.31*/else/*177.36*/{_display_(Seq[Any](format.raw/*177.37*/("""
                                """),format.raw/*178.33*/("""<td><span class=""""),_display_(/*178.51*/entry/*178.56*/.getId()),format.raw/*178.64*/(""" """),format.raw/*178.65*/("""editable" data-name='status'> -</span></td>
                            """)))}),format.raw/*179.30*/("""

                            """),_display_(/*181.30*/if(entry.getApprovedHours() != "")/*181.64*/ {_display_(Seq[Any](format.raw/*181.66*/("""
                                """),format.raw/*182.33*/("""<td><span class=""""),_display_(/*182.51*/entry/*182.56*/.getId()),format.raw/*182.64*/(""" """),format.raw/*182.65*/("""editable" data-name='status'></span>

                                    """),_display_(/*184.38*/entry/*184.43*/.getApprovedHours()),format.raw/*184.62*/("""
                                """),format.raw/*185.33*/("""</td>
                            """)))}/*186.31*/else/*186.36*/{_display_(Seq[Any](format.raw/*186.37*/("""
                                """),format.raw/*187.33*/("""<td><span class=""""),_display_(/*187.51*/entry/*187.56*/.getId()),format.raw/*187.64*/(""" """),format.raw/*187.65*/("""editable" data-name='status'> -</span></td>
                            """)))}),format.raw/*188.30*/("""


                            """),_display_(/*191.30*/if(entry.getCourse() != "")/*191.57*/ {_display_(Seq[Any](format.raw/*191.59*/("""
                                """),format.raw/*192.33*/("""<td><span class=""""),_display_(/*192.51*/entry/*192.56*/.getId()),format.raw/*192.64*/(""" """),format.raw/*192.65*/("""editable" data-name='status'></span>

                                    """),_display_(/*194.38*/entry/*194.43*/.getCourse().getCourseId()),format.raw/*194.69*/("""
                                """),format.raw/*195.33*/("""</td>
                            """)))}/*196.31*/else/*196.36*/{_display_(Seq[Any](format.raw/*196.37*/("""
                                """),format.raw/*197.33*/("""<td><span class=""""),_display_(/*197.51*/entry/*197.56*/.getId()),format.raw/*197.64*/(""" """),format.raw/*197.65*/("""editable" data-name='status'> -</span></td>
                            """)))}),format.raw/*198.30*/("""





                        """),format.raw/*204.25*/("""</tr>
                    """)))}),format.raw/*205.22*/("""
                    """),format.raw/*206.21*/("""</tbody>
                </table>

                <div class="row">
                    <div class="col s12">
                        <ul class="pagination center-align">

                            """),_display_(/*213.30*/if(listType.equals("all"))/*213.56*/ {_display_(Seq[Any](format.raw/*213.58*/("""
                                """),_display_(/*214.34*/if(pageNum == 1)/*214.50*/ {_display_(Seq[Any](format.raw/*214.52*/("""
                                    """),format.raw/*215.37*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                        first_page</i></li>
                                    <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                        chevron_left</i></li>
                                """)))}/*219.35*/else/*219.40*/{_display_(Seq[Any](format.raw/*219.41*/("""
                                    """),format.raw/*220.37*/("""<li class="waves-effect"><a href=""""),_display_(/*220.72*/routes/*220.78*/.CourseTAAssignmentController.taHiringStatusList(1, sort)),format.raw/*220.135*/(""""><i class="material-icons">
                                        first_page</i></a></li>
                                    <li class="waves-effect"><a href=""""),_display_(/*222.72*/routes/*222.78*/.CourseTAAssignmentController.taHiringStatusList(pageNum - 1, sort)),format.raw/*222.145*/(""""><i class="material-icons">
                                        chevron_left</i></a></li>
                                """)))}),format.raw/*224.34*/("""
                                """),_display_(/*225.34*/if(beginIndexForPagination > 1)/*225.65*/ {_display_(Seq[Any](format.raw/*225.67*/("""
                                    """),format.raw/*226.37*/("""<li class="waves-effect modal-trigger" href="#allPageModal" style="cursor: pointer;
                                        font-size: 20px;
                                        font-weight: bold">...</li>
                                """)))}),format.raw/*229.34*/("""
                                """),_display_(/*230.34*/for(i <- (beginIndexForPagination + 0) to (endIndexForPagination + 0)) yield /*230.104*/ {_display_(Seq[Any](format.raw/*230.106*/("""
                                    """),format.raw/*231.37*/("""<li """),_display_(/*231.42*/if(pageNum == i)/*231.58*/ {_display_(Seq[Any](format.raw/*231.60*/("""
                                        """),format.raw/*232.41*/("""class="active"""")))}),format.raw/*232.56*/("""><a href=""""),_display_(/*232.67*/routes/*232.73*/.CourseTAAssignmentController.taHiringStatusList(i, sort)),format.raw/*232.130*/("""">"""),_display_(/*232.133*/i),format.raw/*232.134*/("""</a></li>
                                """)))}),format.raw/*233.34*/("""
                                """),_display_(/*234.34*/if(endIndexForPagination < ((total - 1) / pageLimit + 1))/*234.91*/ {_display_(Seq[Any](format.raw/*234.93*/("""
                                    """),format.raw/*235.37*/("""<li class="waves-effect modal-trigger" href="#allPageModal" style="cursor: pointer;
                                        font-size: 20px;
                                        font-weight: bold">...</li>
                                """)))}),format.raw/*238.34*/("""
                                """),_display_(/*239.34*/if((offset + count) >= total)/*239.63*/ {_display_(Seq[Any](format.raw/*239.65*/("""
                                    """),format.raw/*240.37*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                        chevron_right</i></li>
                                    <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                        last_page</i></li>
                                """)))}/*244.35*/else/*244.40*/{_display_(Seq[Any](format.raw/*244.41*/("""
                                    """),format.raw/*245.37*/("""<li class="waves-effect"><a href=""""),_display_(/*245.72*/routes/*245.78*/.CourseTAAssignmentController.taHiringStatusList(pageNum + 1, sort)),format.raw/*245.145*/(""""><i class="material-icons">
                                        chevron_right</i></a></li>
                                    <li class="waves-effect"><a href=""""),_display_(/*247.72*/routes/*247.78*/.CourseTAAssignmentController.taHiringStatusList((total - 1) / pageLimit + 1, sort)),format.raw/*247.161*/(""""><i class="material-icons">
                                        last_page</i></a></li>
                                """)))}),format.raw/*249.34*/("""
                            """)))}/*250.30*/else if(listType.equals("my enroll"))/*250.67*/{_display_(Seq[Any](format.raw/*250.68*/("""
                            """),_display_(/*251.30*/if(pageNum == 1)/*251.46*/ {_display_(Seq[Any](format.raw/*251.48*/("""
                                """),format.raw/*252.33*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    first_page</i></li>
                                <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    chevron_left</i></li>
                            """)))}),format.raw/*256.30*/("""
                            """),_display_(/*257.30*/if(beginIndexForPagination > 1)/*257.61*/ {_display_(Seq[Any](format.raw/*257.63*/("""
                                """),format.raw/*258.33*/("""<li class="waves-effect modal-trigger" href="#enrollPageModal" style="cursor: pointer;
                                    font-size: 20px;
                                    font-weight: bold">...</li>
                            """)))}),format.raw/*261.30*/("""

                            """),_display_(/*263.30*/if(endIndexForPagination < ((total - 1) / pageLimit + 1))/*263.87*/ {_display_(Seq[Any](format.raw/*263.89*/("""
                                """),format.raw/*264.33*/("""<li class="waves-effect modal-trigger" href="#enrollPageModal" style="cursor: pointer;
                                    font-size: 20px;
                                    font-weight: bold">...</li>
                            """)))}),format.raw/*267.30*/("""

                            """)))}/*269.30*/else/*269.34*/{_display_(Seq[Any](format.raw/*269.35*/("""
                            """),_display_(/*270.30*/if(pageNum == 1)/*270.46*/ {_display_(Seq[Any](format.raw/*270.48*/("""
                                """),format.raw/*271.33*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    first_page</i></li>
                                <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    chevron_left</i></li>
                            """)))}/*275.31*/else/*275.36*/{_display_(Seq[Any](format.raw/*275.37*/("""
                                """),format.raw/*276.33*/("""<li class="waves-effect">
                                    <a href="#!" onclick="jumpToPage(1, '"""),_display_(/*277.75*/sort),format.raw/*277.79*/("""', '"""),_display_(/*277.84*/searchBody),format.raw/*277.94*/("""')">
                                        <i class="material-icons">first_page</i>
                                    </a>
                                </li>
                                <li class="waves-effect">
                                    <a href="#!" onclick="jumpToPage("""),_display_(/*282.71*/pageNum),format.raw/*282.78*/("""-1, '"""),_display_(/*282.84*/sort),format.raw/*282.88*/("""', '"""),_display_(/*282.93*/searchBody),format.raw/*282.103*/("""')">
                                        <i class="material-icons">chevron_left</i>
                                    </a>
                                </li>
                            """)))}),format.raw/*286.30*/("""
                            """),_display_(/*287.30*/if(beginIndexForPagination > 1)/*287.61*/ {_display_(Seq[Any](format.raw/*287.63*/("""
                                """),format.raw/*288.33*/("""<li class="waves-effect modal-trigger" href="#searchPageModal" style="cursor: pointer;
                                    font-size: 20px;
                                    font-weight: bold">...</li>
                            """)))}),format.raw/*291.30*/("""
                            """),_display_(/*292.30*/for(i <- (beginIndexForPagination + 0) to (endIndexForPagination + 0)) yield /*292.100*/ {_display_(Seq[Any](format.raw/*292.102*/("""
                                """),format.raw/*293.33*/("""<li """),_display_(/*293.38*/if(pageNum == i)/*293.54*/ {_display_(Seq[Any](format.raw/*293.56*/("""
                                    """),format.raw/*294.37*/("""class="active"""")))}),format.raw/*294.52*/(""">
                                    <a href="#!" onclick="jumpToPage("""),_display_(/*295.71*/i),format.raw/*295.72*/(""", '"""),_display_(/*295.76*/sort),format.raw/*295.80*/("""', '"""),_display_(/*295.85*/searchBody),format.raw/*295.95*/("""')">
                                    """),_display_(/*296.38*/i),format.raw/*296.39*/("""
                                    """),format.raw/*297.37*/("""</a>
                                </li>
                            """)))}),format.raw/*299.30*/("""
                            """),_display_(/*300.30*/if(endIndexForPagination < ((total - 1) / pageLimit + 1))/*300.87*/ {_display_(Seq[Any](format.raw/*300.89*/("""
                                """),format.raw/*301.33*/("""<li class="waves-effect modal-trigger" href="#searchPageModal" style="cursor: pointer;
                                    font-size: 20px;
                                    font-weight: bold">...</li>
                            """)))}),format.raw/*304.30*/("""
                            """),_display_(/*305.30*/if((offset + count) >= total)/*305.59*/ {_display_(Seq[Any](format.raw/*305.61*/("""
                                """),format.raw/*306.33*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    chevron_right</i></li>
                                <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    last_page</i></li>
                            """)))}/*310.31*/else/*310.36*/{_display_(Seq[Any](format.raw/*310.37*/("""
                                """),format.raw/*311.33*/("""<li class="waves-effect">
                                    <a href="#!" onclick="jumpToPage("""),_display_(/*312.71*/pageNum),format.raw/*312.78*/("""+1, '"""),_display_(/*312.84*/sort),format.raw/*312.88*/("""', '"""),_display_(/*312.93*/searchBody),format.raw/*312.103*/("""')">
                                        <i class="material-icons">chevron_right</i>
                                    </a>
                                </li>
                                <li class="waves-effect">
                                    <a href="#!" onclick="jumpToPage(("""),_display_(/*317.72*/total),format.raw/*317.77*/("""-1)/("""),_display_(/*317.83*/pageLimit),format.raw/*317.92*/(""")+1, '"""),_display_(/*317.99*/sort),format.raw/*317.103*/("""', '"""),_display_(/*317.108*/searchBody),format.raw/*317.118*/("""')">
                                        <i class="material-icons">last_page</i>
                                    </a>
                                </li>
                            """)))}),format.raw/*321.30*/("""
                            """)))}),format.raw/*322.30*/("""
                        """),format.raw/*323.25*/("""</ul>
                    </div>
                </div>
            """)))}/*326.15*/else/*326.20*/{_display_(Seq[Any](format.raw/*326.21*/("""
                """),format.raw/*327.17*/("""<h5>No TA hired yet.</h5>
            """)))}),format.raw/*328.14*/("""
            """),format.raw/*329.13*/("""<div id="allPageModal" class="modal">
                <div class="modal-content">
                    <h6>Select the page number you want to jump to</h6>
                    <div class="card z-depth-0">

                    """),_display_(/*334.22*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*334.79*/ {_display_(Seq[Any](format.raw/*334.81*/("""
                        """),format.raw/*335.25*/("""<ul class="pagination center-align">
                        """),_display_(/*336.26*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*336.65*/ {_display_(Seq[Any](format.raw/*336.67*/("""
                            """),_display_(/*337.30*/if(j <= ((total - 1)/(pageLimit) + 1))/*337.68*/ {_display_(Seq[Any](format.raw/*337.70*/("""
                                """),_display_(/*338.34*/if(j != pageNum)/*338.50*/ {_display_(Seq[Any](format.raw/*338.52*/("""
                                    """),format.raw/*339.37*/("""<li class="waves-effect grey lighten-3"><a href='"""),_display_(/*339.87*/routes/*339.93*/.CourseTAAssignmentController.taHiringStatusList(j, sort)),format.raw/*339.150*/("""'>"""),_display_(/*339.153*/j),format.raw/*339.154*/("""</a></li>
                                """)))}/*340.34*/else/*340.38*/{_display_(Seq[Any](format.raw/*340.39*/("""
                                    """),format.raw/*341.37*/("""<li class="waves-effect active"><a href=""""),_display_(/*341.79*/routes/*341.85*/.CourseTAAssignmentController.taHiringStatusList(j, sort)),format.raw/*341.142*/("""">"""),_display_(/*341.145*/j),format.raw/*341.146*/("""</a></li>
                                """)))}),format.raw/*342.34*/("""
                            """)))}),format.raw/*343.30*/("""
                        """)))}),format.raw/*344.26*/("""
                        """),format.raw/*345.25*/("""</ul>
                    """)))}),format.raw/*346.22*/("""
                    """),format.raw/*347.21*/("""</div>
                </div>
                <div class="modal-footer">
                    <a href="#!" class="modal-close waves-effect waves-green btn-flat">
                        Cancel</a>
                </div>
            </div>

            <div id="enrollPageModal" class="modal">
                <div class="modal-content">
                    <h6>Select the page number you want to jump to</h6>
                    <div class="card z-depth-0">

                    """),_display_(/*360.22*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*360.79*/ {_display_(Seq[Any](format.raw/*360.81*/("""
                        """),format.raw/*361.25*/("""<ul class="pagination center-align">
                        """),_display_(/*362.26*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*362.65*/ {_display_(Seq[Any](format.raw/*362.67*/("""
                            """),_display_(/*363.30*/if(j <= ((total - 1)/(pageLimit) + 1))/*363.68*/ {_display_(Seq[Any](format.raw/*363.70*/("""
                                """),_display_(/*364.34*/if(j != pageNum)/*364.50*/ {_display_(Seq[Any](format.raw/*364.52*/("""
                                    """),format.raw/*365.37*/("""<li class="waves-effect grey lighten-3"><a href='"""),_display_(/*365.87*/routes/*365.93*/.CourseTAAssignmentController.taHiringStatusList(j, sort)),format.raw/*365.150*/("""'>"""),_display_(/*365.153*/j),format.raw/*365.154*/("""</a></li>
                                """)))}/*366.34*/else/*366.38*/{_display_(Seq[Any](format.raw/*366.39*/("""
                                    """),format.raw/*367.37*/("""<li class="waves-effect active"><a href=""""),_display_(/*367.79*/routes/*367.85*/.CourseTAAssignmentController.taHiringStatusList(j, sort)),format.raw/*367.142*/("""">"""),_display_(/*367.145*/j),format.raw/*367.146*/("""</a></li>
                                """)))}),format.raw/*368.34*/("""
                            """)))}),format.raw/*369.30*/("""
                        """)))}),format.raw/*370.26*/("""
                        """),format.raw/*371.25*/("""</ul>
                    """)))}),format.raw/*372.22*/("""
                    """),format.raw/*373.21*/("""</div>
                </div>
                <div class="modal-footer">
                    <a href="#!" class="modal-close waves-effect waves-green btn-flat">
                        Cancel</a>
                </div>
            </div>

            <div id="searchPageModal" class="modal">
                <div class="modal-content">
                    <h6>Select the page number you want to jump to</h6>
                    <div class="card z-depth-0">

                    """),_display_(/*386.22*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*386.79*/ {_display_(Seq[Any](format.raw/*386.81*/("""
                        """),format.raw/*387.25*/("""<ul class="pagination center-align">
                        """),_display_(/*388.26*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*388.65*/ {_display_(Seq[Any](format.raw/*388.67*/("""
                            """),_display_(/*389.30*/if(j <= ((total - 1)/(pageLimit) + 1))/*389.68*/ {_display_(Seq[Any](format.raw/*389.70*/("""
                                """),_display_(/*390.34*/if(j != pageNum)/*390.50*/ {_display_(Seq[Any](format.raw/*390.52*/("""
                                    """),format.raw/*391.37*/("""<li class="waves-effect grey lighten-3"><a href='#!' onclick="jumpToPage("""),_display_(/*391.111*/j),format.raw/*391.112*/(""", 'id', '"""),_display_(/*391.122*/searchBody),format.raw/*391.132*/("""')">"""),_display_(/*391.137*/j),format.raw/*391.138*/("""</a></li>
                                """)))}/*392.34*/else/*392.38*/{_display_(Seq[Any](format.raw/*392.39*/("""
                                    """),format.raw/*393.37*/("""<li class="waves-effect active"><a href="#!" onclick="jumpToPage("""),_display_(/*393.103*/j),format.raw/*393.104*/(""", 'id', '"""),_display_(/*393.114*/searchBody),format.raw/*393.124*/("""')">"""),_display_(/*393.129*/j),format.raw/*393.130*/("""</a></li>
                                """)))}),format.raw/*394.34*/("""
                            """)))}),format.raw/*395.30*/("""
                        """)))}),format.raw/*396.26*/("""
                        """),format.raw/*397.25*/("""</ul>
                    """)))}),format.raw/*398.22*/("""
                    """),format.raw/*399.21*/("""</div>
                </div>
                <div class="modal-footer">
                    <a href="#!" class="modal-close waves-effect waves-green btn-flat">
                        Cancel</a>
                </div>
            </div>

        </div>
    </div>

""")))}),format.raw/*410.2*/("""

"""))
      }
    }
  }

  def render(courseTAAssignments:List[CourseTAAssignment],pageNum:Integer,sort:String,offset:Integer,total:Integer,count:Integer,listType:String,pageLimit:Integer,searchBody:String,id:Long,beginIndexForPagination:Integer,endIndexForPagination:Integer): play.twirl.api.HtmlFormat.Appendable = apply(courseTAAssignments,pageNum,sort,offset,total,count,listType,pageLimit,searchBody,id,beginIndexForPagination,endIndexForPagination)

  def f:((List[CourseTAAssignment],Integer,String,Integer,Integer,Integer,String,Integer,String,Long,Integer,Integer) => play.twirl.api.HtmlFormat.Appendable) = (courseTAAssignments,pageNum,sort,offset,total,count,listType,pageLimit,searchBody,id,beginIndexForPagination,endIndexForPagination) => apply(courseTAAssignments,pageNum,sort,offset,total,count,listType,pageLimit,searchBody,id,beginIndexForPagination,endIndexForPagination)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:36 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/taHiringStatus.scala.html
                  HASH: 46a93bd046fc6d308b31318150bca172df872458
                  MATRIX: 1221->1|1629->338|1670->372|1694->389|1728->413|1743->420|1824->424|1856->429|1913->459|1928->465|1987->503|2106->594|2135->595|2180->612|2251->656|2309->698|2349->700|2394->717|2433->728|2462->729|2491->730|2548->760|2576->779|2612->794|2735->890|2763->909|2817->942|3019->1113|3064->1130|3358->1396|3387->1397|3480->1462|3509->1463|3555->1481|4260->2158|4289->2159|4331->2173|4384->2198|4413->2199|4459->2217|4688->2418|4717->2419|4766->2440|4896->2542|4925->2543|4954->2544|5387->2949|5416->2950|5469->2975|5622->3100|5651->3101|5700->3122|5834->3228|5863->3229|5909->3247|5961->3271|5990->3272|6025->3280|6099->3326|6128->3327|6173->3344|6318->3461|6347->3462|6380->3467|6430->335|6459->410|6489->3477|6519->3480|6562->3513|6603->3515|6636->3520|6741->3597|6780->3626|6821->3628|6867->3645|7325->4083|7366->4115|7407->4117|7449->4130|7906->4555|7949->4570|7993->4604|8034->4606|8080->4623|9194->5709|9266->5764|9307->5766|9361->5791|9396->5936|9456->5968|9527->6029|9568->6031|9630->6064|9676->6082|9691->6087|9721->6095|9751->6096|9851->6168|9866->6173|9934->6219|9996->6252|10051->6288|10065->6293|10105->6294|10167->6327|10213->6345|10228->6350|10258->6358|10288->6359|10391->6430|10450->6461|10518->6519|10559->6521|10621->6554|10667->6572|10682->6577|10712->6585|10742->6586|10845->6661|10860->6666|10925->6709|10987->6742|11042->6778|11056->6783|11096->6784|11158->6817|11204->6835|11219->6840|11249->6848|11279->6849|11384->6922|11443->6953|11497->6997|11538->6999|11600->7032|11646->7050|11661->7055|11691->7063|11721->7064|11824->7139|11839->7144|11890->7173|11952->7206|12007->7242|12021->7247|12061->7248|12123->7281|12169->7299|12184->7304|12214->7312|12244->7313|12349->7386|12408->7417|12452->7451|12493->7453|12555->7486|12601->7504|12616->7509|12646->7517|12676->7518|12779->7593|12794->7598|12835->7617|12897->7650|12952->7686|12966->7691|13006->7692|13068->7725|13114->7743|13129->7748|13159->7756|13189->7757|13294->7830|13354->7862|13391->7889|13432->7891|13494->7924|13540->7942|13555->7947|13585->7955|13615->7956|13718->8031|13733->8036|13781->8062|13843->8095|13898->8131|13912->8136|13952->8137|14014->8170|14060->8188|14075->8193|14105->8201|14135->8202|14240->8275|14299->8305|14358->8332|14408->8353|14638->8555|14674->8581|14715->8583|14777->8617|14803->8633|14844->8635|14910->8672|15291->9034|15305->9039|15345->9040|15411->9077|15474->9112|15490->9118|15570->9175|15762->9339|15778->9345|15868->9412|16028->9540|16090->9574|16131->9605|16172->9607|16238->9644|16512->9886|16574->9920|16662->9990|16704->9992|16770->10029|16803->10034|16829->10050|16870->10052|16940->10093|16987->10108|17026->10119|17042->10125|17122->10182|17154->10185|17178->10186|17253->10229|17315->10263|17382->10320|17423->10322|17489->10359|17763->10601|17825->10635|17864->10664|17905->10666|17971->10703|18352->11065|18366->11070|18406->11071|18472->11108|18535->11143|18551->11149|18641->11216|18836->11383|18852->11389|18958->11472|19115->11597|19165->11627|19212->11664|19252->11665|19310->11695|19336->11711|19377->11713|19439->11746|19816->12091|19874->12121|19915->12152|19956->12154|20018->12187|20283->12420|20342->12451|20409->12508|20450->12510|20512->12543|20777->12776|20828->12807|20842->12811|20882->12812|20940->12842|20966->12858|21007->12860|21069->12893|21434->13239|21448->13244|21488->13245|21550->13278|21678->13378|21704->13382|21737->13387|21769->13397|22090->13690|22119->13697|22153->13703|22179->13707|22212->13712|22245->13722|22473->13918|22531->13948|22572->13979|22613->13981|22675->14014|22940->14247|22998->14277|23086->14347|23128->14349|23190->14382|23223->14387|23249->14403|23290->14405|23356->14442|23403->14457|23503->14529|23526->14530|23558->14534|23584->14538|23617->14543|23649->14553|23719->14595|23742->14596|23808->14633|23912->14705|23970->14735|24037->14792|24078->14794|24140->14827|24405->15060|24463->15090|24502->15119|24543->15121|24605->15154|24970->15500|24984->15505|25024->15506|25086->15539|25210->15635|25239->15642|25273->15648|25299->15652|25332->15657|25365->15667|25690->15964|25717->15969|25751->15975|25782->15984|25817->15991|25844->15995|25878->16000|25911->16010|26136->16203|26198->16233|26252->16258|26341->16328|26355->16333|26395->16334|26441->16351|26512->16390|26554->16403|26807->16628|26881->16685|26922->16687|26976->16712|27066->16774|27122->16813|27163->16815|27221->16845|27269->16883|27310->16885|27372->16919|27398->16935|27439->16937|27505->16974|27583->17024|27599->17030|27679->17087|27711->17090|27735->17091|27798->17134|27812->17138|27852->17139|27918->17176|27988->17218|28004->17224|28084->17281|28116->17284|28140->17285|28215->17328|28277->17358|28335->17384|28389->17409|28448->17436|28498->17457|29005->17936|29079->17993|29120->17995|29174->18020|29264->18082|29320->18121|29361->18123|29419->18153|29467->18191|29508->18193|29570->18227|29596->18243|29637->18245|29703->18282|29781->18332|29797->18338|29877->18395|29909->18398|29933->18399|29996->18442|30010->18446|30050->18447|30116->18484|30186->18526|30202->18532|30282->18589|30314->18592|30338->18593|30413->18636|30475->18666|30533->18692|30587->18717|30646->18744|30696->18765|31203->19244|31277->19301|31318->19303|31372->19328|31462->19390|31518->19429|31559->19431|31617->19461|31665->19499|31706->19501|31768->19535|31794->19551|31835->19553|31901->19590|32004->19664|32028->19665|32067->19675|32100->19685|32134->19690|32158->19691|32221->19734|32235->19738|32275->19739|32341->19776|32436->19842|32460->19843|32499->19853|32532->19863|32566->19868|32590->19869|32665->19912|32727->19942|32785->19968|32839->19993|32898->20020|32948->20041|33246->20308
                  LINES: 35->1|47->12|48->13|49->14|51->17|51->17|53->17|54->18|54->18|54->18|54->18|57->21|57->21|58->22|59->23|59->23|59->23|60->24|60->24|60->24|60->24|61->25|61->25|61->25|64->28|64->28|64->28|67->31|68->32|78->42|78->42|80->44|80->44|82->46|99->63|99->63|101->65|101->65|101->65|103->67|106->70|106->70|107->71|108->72|108->72|108->72|116->80|116->80|117->81|119->83|119->83|120->84|122->86|122->86|124->88|125->89|125->89|129->93|131->95|131->95|132->96|135->99|135->99|136->100|138->10|140->15|142->101|144->103|144->103|144->103|145->104|147->106|147->106|147->106|148->107|156->115|156->115|156->115|157->116|165->124|167->126|167->126|167->126|168->127|191->150|191->150|191->150|192->151|193->152|196->155|196->155|196->155|197->156|197->156|197->156|197->156|197->156|198->157|198->157|198->157|199->158|200->159|200->159|200->159|201->160|201->160|201->160|201->160|201->160|202->161|204->163|204->163|204->163|205->164|205->164|205->164|205->164|205->164|207->166|207->166|207->166|208->167|209->168|209->168|209->168|210->169|210->169|210->169|210->169|210->169|211->170|213->172|213->172|213->172|214->173|214->173|214->173|214->173|214->173|216->175|216->175|216->175|217->176|218->177|218->177|218->177|219->178|219->178|219->178|219->178|219->178|220->179|222->181|222->181|222->181|223->182|223->182|223->182|223->182|223->182|225->184|225->184|225->184|226->185|227->186|227->186|227->186|228->187|228->187|228->187|228->187|228->187|229->188|232->191|232->191|232->191|233->192|233->192|233->192|233->192|233->192|235->194|235->194|235->194|236->195|237->196|237->196|237->196|238->197|238->197|238->197|238->197|238->197|239->198|245->204|246->205|247->206|254->213|254->213|254->213|255->214|255->214|255->214|256->215|260->219|260->219|260->219|261->220|261->220|261->220|261->220|263->222|263->222|263->222|265->224|266->225|266->225|266->225|267->226|270->229|271->230|271->230|271->230|272->231|272->231|272->231|272->231|273->232|273->232|273->232|273->232|273->232|273->232|273->232|274->233|275->234|275->234|275->234|276->235|279->238|280->239|280->239|280->239|281->240|285->244|285->244|285->244|286->245|286->245|286->245|286->245|288->247|288->247|288->247|290->249|291->250|291->250|291->250|292->251|292->251|292->251|293->252|297->256|298->257|298->257|298->257|299->258|302->261|304->263|304->263|304->263|305->264|308->267|310->269|310->269|310->269|311->270|311->270|311->270|312->271|316->275|316->275|316->275|317->276|318->277|318->277|318->277|318->277|323->282|323->282|323->282|323->282|323->282|323->282|327->286|328->287|328->287|328->287|329->288|332->291|333->292|333->292|333->292|334->293|334->293|334->293|334->293|335->294|335->294|336->295|336->295|336->295|336->295|336->295|336->295|337->296|337->296|338->297|340->299|341->300|341->300|341->300|342->301|345->304|346->305|346->305|346->305|347->306|351->310|351->310|351->310|352->311|353->312|353->312|353->312|353->312|353->312|353->312|358->317|358->317|358->317|358->317|358->317|358->317|358->317|358->317|362->321|363->322|364->323|367->326|367->326|367->326|368->327|369->328|370->329|375->334|375->334|375->334|376->335|377->336|377->336|377->336|378->337|378->337|378->337|379->338|379->338|379->338|380->339|380->339|380->339|380->339|380->339|380->339|381->340|381->340|381->340|382->341|382->341|382->341|382->341|382->341|382->341|383->342|384->343|385->344|386->345|387->346|388->347|401->360|401->360|401->360|402->361|403->362|403->362|403->362|404->363|404->363|404->363|405->364|405->364|405->364|406->365|406->365|406->365|406->365|406->365|406->365|407->366|407->366|407->366|408->367|408->367|408->367|408->367|408->367|408->367|409->368|410->369|411->370|412->371|413->372|414->373|427->386|427->386|427->386|428->387|429->388|429->388|429->388|430->389|430->389|430->389|431->390|431->390|431->390|432->391|432->391|432->391|432->391|432->391|432->391|432->391|433->392|433->392|433->392|434->393|434->393|434->393|434->393|434->393|434->393|434->393|435->394|436->395|437->396|438->397|439->398|440->399|451->410
                  -- GENERATED --
              */
          