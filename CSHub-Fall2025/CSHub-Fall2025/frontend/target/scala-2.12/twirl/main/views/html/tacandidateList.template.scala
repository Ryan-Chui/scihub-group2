
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

object tacandidateList extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template12[List[TACandidate],Integer,String,Integer,Integer,Integer,String,Integer,String,Long,Integer,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(tacandidates: List[TACandidate],
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
/*11.2*/import helper._;
/*12.2*/import models._
/*13.2*/import models.TACandidate

def /*15.2*/scripts/*15.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*15.13*/("""
    """),format.raw/*16.5*/("""<script type = "module" src='"""),_display_(/*16.35*/routes/*16.41*/.Assets.at("javascripts/voiceJump.js")),format.raw/*16.79*/("""'></script>
    <script type="text/javascript">

            $(document).ready(function () """),format.raw/*19.43*/("""{"""),format.raw/*19.44*/("""
                """),format.raw/*20.17*/("""var technologiesArtay = []
                """),_display_(/*21.18*/for(i <- 0 until tacandidates.size) yield /*21.53*/ {_display_(Seq[Any](format.raw/*21.55*/("""
                """),format.raw/*22.17*/("""var json = """),format.raw/*22.28*/("""{"""),format.raw/*22.29*/("""}"""),format.raw/*22.30*/(""";
                json.id = '"""),_display_(/*23.29*/tacandidates/*23.41*/.get(i).getId()),format.raw/*23.56*/("""';
                json.url = "/tacandidate/candidateDetail/" + json.id;

                json.name = '"""),_display_(/*26.31*/tacandidates/*26.43*/.get(i).getSmuId),format.raw/*26.59*/("""'.replace(/[^a-zA-Z0-9]/g, " ").replace(/  +/g, " ").trim();
                console.log("jsonhere:" + json)
                technologiesArtay.push(json)
                """)))}),format.raw/*29.18*/("""
                """),format.raw/*30.17*/("""$("#nasaText").text(JSON.stringify(technologiesArtay));

                $('.tooltipped').tooltip();

                // $("#speak-from-filter").click();
                // $("#speak-nasa").click();
                // $("#speak-from-filter").click();



            """),format.raw/*40.13*/("""}"""),format.raw/*40.14*/(""");

            function jumpToPage(pageNum, sort, searchString) """),format.raw/*42.62*/("""{"""),format.raw/*42.63*/("""

                """),format.raw/*44.17*/("""pageNum =  parseInt(pageNum);

                var url = "/tacandidate/searchPOST?pageNum=" + (pageNum) + "&sortCriteria=" + sort;
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
            """),format.raw/*61.13*/("""}"""),format.raw/*61.14*/("""

            """),format.raw/*63.13*/("""function string2Map(str) """),format.raw/*63.38*/("""{"""),format.raw/*63.39*/("""

                """),format.raw/*65.17*/("""var map = new Map();
                var splitedString = str.replace(new RegExp("],", 'g'), ";");
                var artay = splitedString.split(";");
                for(var i=0; i<artay.length; i++)"""),format.raw/*68.50*/("""{"""),format.raw/*68.51*/("""
                    """),format.raw/*69.21*/("""var idAndEventsString = artay[i];
                    idAndEventsString = idAndEventsString.replace(/["""),format.raw/*70.69*/("""{"""),format.raw/*70.70*/("""}"""),format.raw/*70.71*/("""[\]\\]/g, " ");
                    var idAndEvents = idAndEventsString.split("=");
                    var id = idAndEvents[0];
                    var eventsString = idAndEvents[1];
                    var events = eventsString.split(",");
                    console.log("events:" + events + "," + i);

                    var formatedEvents = "";
                    for(var j=0; j<events.length; j++)"""),format.raw/*78.55*/("""{"""),format.raw/*78.56*/("""
                        """),format.raw/*79.25*/("""events[j] = events[j].trim();
                        formatedEvents = formatedEvents + events[j] + ";";
                    """),format.raw/*81.21*/("""}"""),format.raw/*81.22*/("""
                    """),format.raw/*82.21*/("""if(formatedEvents.length > 1)
                        map.set(id.trim(), formatedEvents);
                """),format.raw/*84.17*/("""}"""),format.raw/*84.18*/("""

                """),format.raw/*86.17*/("""return map;
            """),format.raw/*87.13*/("""}"""),format.raw/*87.14*/("""



    """),format.raw/*91.5*/("""</script>
    <style>
            .follow-fab """),format.raw/*93.25*/("""{"""),format.raw/*93.26*/("""
                """),format.raw/*94.17*/("""top: -20px !important;
                bottom: auto !important;
                right: -20px !important;
            """),format.raw/*97.13*/("""}"""),format.raw/*97.14*/("""
    """),format.raw/*98.5*/("""</style>
""")))};
Seq[Any](format.raw/*10.84*/("""
"""),format.raw/*14.1*/("""
"""),format.raw/*99.2*/("""

"""),_display_(/*101.2*/main("All TA Candidates", scripts)/*101.36*/ {_display_(Seq[Any](format.raw/*101.38*/("""
    """),format.raw/*102.5*/("""<div class="container">
        <div class="card-panel center">
            """),_display_(/*104.14*/if(listType.equals("search"))/*104.43*/ {_display_(Seq[Any](format.raw/*104.45*/("""
                """),format.raw/*105.17*/("""<div class="row card-panel z-depth-0 project-zone-panel">
                    <div class="col s12" style="margin-top: -10px;
                        margin-bottom: -10px;">
                        <h6 class="center tooltipped" data-position="bottom" data-tooltip="This list shows the search results." >
                            Search Result
                        </h6>
                    </div>
                </div>
            """)))}/*113.14*/else if(listType.equals("all"))/*113.46*/ {_display_(Seq[Any](format.raw/*113.48*/("""
            """),format.raw/*114.13*/("""<div class="row card-panel z-depth-0 project-zone-panel">
                <div class="col s12" style="margin-top: -10px;
                    margin-bottom: -10px;">
                    <h6 class="center tooltipped" data-position="bottom" data-tooltip="This list shows all the TA candidates." >
                        List of TA Pool at SMU-Sci-Hub
                    </h6>
                </div>
            </div>
            """)))}),format.raw/*122.14*/("""

            """),_display_(/*124.14*/if(tacandidates.size() > 0)/*124.41*/ {_display_(Seq[Any](format.raw/*124.43*/("""
                """),format.raw/*125.17*/("""<div class="col s8 offset-s2">
                    <h4>Candidate List</h4>

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
                            <th style="cursor: pointer;">Index</th>
                            <th style="cursor: pointer;">Name</th>
                            <th style="cursor: pointer;">Status</th>
                            <th style="cursor: pointer;">TA Preference</th>
                            <th style="cursor: pointer;">Hired by Courses</th>
                            <th style="cursor: pointer;">Hired History</th>
                        </tr>
                    </thead>
                    <tbody>
                    """),_display_(/*149.22*/for((entry, index) <- tacandidates.zipWithIndex) yield /*149.70*/ {_display_(Seq[Any](format.raw/*149.72*/("""
                        """),format.raw/*150.25*/("""<tr>
                            <td><a href = """"),_display_(/*151.45*/routes/*151.51*/.TACandidateController.tacandidateDetail(entry.getId())),format.raw/*151.106*/("""">"""),_display_(/*151.109*/entry/*151.114*/.getId()),format.raw/*151.122*/("""</a></td>


                            """),_display_(/*154.30*/if(entry.getSmuId() != "")/*154.56*/ {_display_(Seq[Any](format.raw/*154.58*/("""
                                """),format.raw/*155.33*/("""<td><span class=""""),_display_(/*155.51*/entry/*155.56*/.getId()),format.raw/*155.64*/(""" """),format.raw/*155.65*/("""editable" data-name='Name'></span>
                                    """),_display_(/*156.38*/entry/*156.43*/.getApplicant().getUserName()),format.raw/*156.72*/("""
                                """),format.raw/*157.33*/("""</td>
                            """)))}/*158.31*/else/*158.36*/{_display_(Seq[Any](format.raw/*158.37*/("""
                                """),format.raw/*159.33*/("""<td><span class=""""),_display_(/*159.51*/entry/*159.56*/.getId()),format.raw/*159.64*/(""" """),format.raw/*159.65*/("""editable" data-name='Name'> -</span></td>
                            """)))}),format.raw/*160.30*/("""

                            """),_display_(/*162.30*/if(entry.getStatus() != "")/*162.57*/ {_display_(Seq[Any](format.raw/*162.59*/("""
                                """),format.raw/*163.33*/("""<td><span class=""""),_display_(/*163.51*/entry/*163.56*/.getId()),format.raw/*163.64*/(""" """),format.raw/*163.65*/("""editable" data-name='status'></span>

                                    """),_display_(/*165.38*/entry/*165.43*/.getStatus()),format.raw/*165.55*/("""
                                """),format.raw/*166.33*/("""</td>
                            """)))}/*167.31*/else/*167.36*/{_display_(Seq[Any](format.raw/*167.37*/("""
                                """),format.raw/*168.33*/("""<td><span class=""""),_display_(/*168.51*/entry/*168.56*/.getId()),format.raw/*168.64*/(""" """),format.raw/*168.65*/("""editable" data-name='status'> -</span></td>
                            """)))}),format.raw/*169.30*/("""



                            """),_display_(/*173.30*/if(entry.getPreference() != "")/*173.61*/ {_display_(Seq[Any](format.raw/*173.63*/("""
                                """),format.raw/*174.33*/("""<td>
                                    <span class=""""),_display_(/*175.51*/entry/*175.56*/.getId()),format.raw/*175.64*/(""" """),format.raw/*175.65*/("""editable" data-name='TAPreference'>
                                    """),_display_(/*176.38*/for(course <- entry.getPreference().split(";")) yield /*176.85*/ {_display_(Seq[Any](format.raw/*176.87*/("""
                                        """),_display_(/*177.42*/course/*177.48*/.trim.split(" ")/*177.64*/(0)),_display_(/*177.68*/course/*177.74*/.trim.split(" ")/*177.90*/(1)),format.raw/*177.93*/(""";
                                    """)))}),format.raw/*178.38*/("""
                                    """),format.raw/*179.37*/("""</span>
                                </td>
                            """)))}/*181.31*/else/*181.36*/{_display_(Seq[Any](format.raw/*181.37*/("""
                                """),format.raw/*182.33*/("""<td><span class=""""),_display_(/*182.51*/entry/*182.56*/.getId()),format.raw/*182.64*/(""" """),format.raw/*182.65*/("""editable" data-name='TAPreference'>-</span></td>
                            """)))}),format.raw/*183.30*/("""

                            """),_display_(/*185.30*/if(entry.getAssignments.filter(assignment => assignment.getCourse.isActive && assignment.getYear == "2024" && assignment.getSemester == "spring").nonEmpty)/*185.185*/ {_display_(Seq[Any](format.raw/*185.187*/("""
                                """),format.raw/*186.33*/("""<td>
                                    <span class=""""),_display_(/*187.51*/entry/*187.56*/.getId()),format.raw/*187.64*/(""" """),format.raw/*187.65*/("""editable" data-name='CourseHired'>
                                    """),_display_(/*188.38*/entry/*188.43*/.getAssignments.filter(assignment => assignment.getCourse.isActive && assignment.getYear == "2024" && assignment.getSemester == "spring").map(assignment => assignment.getCourse.getCourseId).mkString(", ")),format.raw/*188.247*/("""
                                    """),format.raw/*189.37*/("""</span>
                                </td>
                            """)))}/*191.31*/else/*191.36*/{_display_(Seq[Any](format.raw/*191.37*/("""
                                """),format.raw/*192.33*/("""<td><span class=""""),_display_(/*192.51*/entry/*192.56*/.getId()),format.raw/*192.64*/(""" """),format.raw/*192.65*/("""editable" data-name='CourseHired'>&ensp; -</span></td>
                            """)))}),format.raw/*193.30*/("""


                            """),_display_(/*196.30*/if(entry.getAssignments.filter(assignment => !assignment.getCourse.isActive || assignment.getYear != "2024" || assignment.getSemester != "spring").nonEmpty)/*196.186*/ {_display_(Seq[Any](format.raw/*196.188*/("""
                                """),format.raw/*197.33*/("""<td>
                                    <span class=""""),_display_(/*198.51*/entry/*198.56*/.getId()),format.raw/*198.64*/(""" """),format.raw/*198.65*/("""editable" data-name='HiredHistory'>
                                    """),_display_(/*199.38*/entry/*199.43*/.getAssignments.filter(assignment => !assignment.getCourse.isActive || assignment.getYear != "2024" || assignment.getSemester != "spring").map(assignment => assignment.getCourse.getCourseId).mkString(", ")),format.raw/*199.248*/("""
                                    """),format.raw/*200.37*/("""</span>
                                </td>
                            """)))}/*202.31*/else/*202.36*/{_display_(Seq[Any](format.raw/*202.37*/("""
                                """),format.raw/*203.33*/("""<td><span class=""""),_display_(/*203.51*/entry/*203.56*/.getId()),format.raw/*203.64*/(""" """),format.raw/*203.65*/("""editable" data-name='HiredHistory'>&ensp; -</span></td>
                            """)))}),format.raw/*204.30*/("""



                        """),format.raw/*208.25*/("""</tr>
                    """)))}),format.raw/*209.22*/("""
                    """),format.raw/*210.21*/("""</tbody>
                </table>

                <div class="row">
                    <div class="col s12">
                        <ul class="pagination center-align">

                            """),_display_(/*217.30*/if(listType.equals("all"))/*217.56*/ {_display_(Seq[Any](format.raw/*217.58*/("""
                                """),_display_(/*218.34*/if(pageNum == 1)/*218.50*/ {_display_(Seq[Any](format.raw/*218.52*/("""
                                    """),format.raw/*219.37*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                        first_page</i></li>
                                    <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                        chevron_left</i></li>
                                """)))}/*223.35*/else/*223.40*/{_display_(Seq[Any](format.raw/*223.41*/("""
                                    """),format.raw/*224.37*/("""<li class="waves-effect"><a href=""""),_display_(/*224.72*/routes/*224.78*/.TACandidateController.tacandidateList(1, sort)),format.raw/*224.125*/(""""><i class="material-icons">
                                        first_page</i></a></li>
                                    <li class="waves-effect"><a href=""""),_display_(/*226.72*/routes/*226.78*/.TACandidateController.tacandidateList(pageNum - 1, sort)),format.raw/*226.135*/(""""><i class="material-icons">
                                        chevron_left</i></a></li>
                                """)))}),format.raw/*228.34*/("""
                                """),_display_(/*229.34*/if(beginIndexForPagination > 1)/*229.65*/ {_display_(Seq[Any](format.raw/*229.67*/("""
                                    """),format.raw/*230.37*/("""<li class="waves-effect modal-trigger" href="#allPageModal" style="cursor: pointer;
                                        font-size: 20px;
                                        font-weight: bold">...</li>
                                """)))}),format.raw/*233.34*/("""
                                """),_display_(/*234.34*/for(i <- (beginIndexForPagination + 0) to (endIndexForPagination + 0)) yield /*234.104*/ {_display_(Seq[Any](format.raw/*234.106*/("""
                                    """),format.raw/*235.37*/("""<li """),_display_(/*235.42*/if(pageNum == i)/*235.58*/ {_display_(Seq[Any](format.raw/*235.60*/("""
                                        """),format.raw/*236.41*/("""class="active"""")))}),format.raw/*236.56*/("""><a href=""""),_display_(/*236.67*/routes/*236.73*/.TACandidateController.tacandidateList(i, sort)),format.raw/*236.120*/("""">"""),_display_(/*236.123*/i),format.raw/*236.124*/("""</a></li>
                                """)))}),format.raw/*237.34*/("""
                                """),_display_(/*238.34*/if(endIndexForPagination < ((total - 1) / pageLimit + 1))/*238.91*/ {_display_(Seq[Any](format.raw/*238.93*/("""
                                    """),format.raw/*239.37*/("""<li class="waves-effect modal-trigger" href="#allPageModal" style="cursor: pointer;
                                        font-size: 20px;
                                        font-weight: bold">...</li>
                                """)))}),format.raw/*242.34*/("""
                                """),_display_(/*243.34*/if((offset + count) >= total)/*243.63*/ {_display_(Seq[Any](format.raw/*243.65*/("""
                                    """),format.raw/*244.37*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                        chevron_right</i></li>
                                    <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                        last_page</i></li>
                                """)))}/*248.35*/else/*248.40*/{_display_(Seq[Any](format.raw/*248.41*/("""
                                    """),format.raw/*249.37*/("""<li class="waves-effect"><a href=""""),_display_(/*249.72*/routes/*249.78*/.TACandidateController.tacandidateList(pageNum + 1, sort)),format.raw/*249.135*/(""""><i class="material-icons">
                                        chevron_right</i></a></li>
                                    <li class="waves-effect"><a href=""""),_display_(/*251.72*/routes/*251.78*/.TACandidateController.tacandidateList((total - 1) / pageLimit + 1, sort)),format.raw/*251.151*/(""""><i class="material-icons">
                                        last_page</i></a></li>
                                """)))}),format.raw/*253.34*/("""
                            """)))}/*254.30*/else if(listType.equals("my enroll"))/*254.67*/{_display_(Seq[Any](format.raw/*254.68*/("""
                            """),_display_(/*255.30*/if(pageNum == 1)/*255.46*/ {_display_(Seq[Any](format.raw/*255.48*/("""
                                """),format.raw/*256.33*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    first_page</i></li>
                                <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    chevron_left</i></li>
                            """)))}),format.raw/*260.30*/("""
                            """),_display_(/*261.30*/if(beginIndexForPagination > 1)/*261.61*/ {_display_(Seq[Any](format.raw/*261.63*/("""
                                """),format.raw/*262.33*/("""<li class="waves-effect modal-trigger" href="#enrollPageModal" style="cursor: pointer;
                                    font-size: 20px;
                                    font-weight: bold">...</li>
                            """)))}),format.raw/*265.30*/("""

                            """),_display_(/*267.30*/if(endIndexForPagination < ((total - 1) / pageLimit + 1))/*267.87*/ {_display_(Seq[Any](format.raw/*267.89*/("""
                                """),format.raw/*268.33*/("""<li class="waves-effect modal-trigger" href="#enrollPageModal" style="cursor: pointer;
                                    font-size: 20px;
                                    font-weight: bold">...</li>
                            """)))}),format.raw/*271.30*/("""

                        """)))}/*273.26*/else/*273.30*/{_display_(Seq[Any](format.raw/*273.31*/("""
                            """),_display_(/*274.30*/if(pageNum == 1)/*274.46*/ {_display_(Seq[Any](format.raw/*274.48*/("""
                                """),format.raw/*275.33*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    first_page</i></li>
                                <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    chevron_left</i></li>
                            """)))}/*279.31*/else/*279.36*/{_display_(Seq[Any](format.raw/*279.37*/("""
                                """),format.raw/*280.33*/("""<li class="waves-effect">
                                    <a href="#!" onclick="jumpToPage(1, '"""),_display_(/*281.75*/sort),format.raw/*281.79*/("""', '"""),_display_(/*281.84*/searchBody),format.raw/*281.94*/("""')">
                                        <i class="material-icons">first_page</i>
                                    </a>
                                </li>
                                <li class="waves-effect">
                                    <a href="#!" onclick="jumpToPage("""),_display_(/*286.71*/pageNum),format.raw/*286.78*/("""-1, '"""),_display_(/*286.84*/sort),format.raw/*286.88*/("""', '"""),_display_(/*286.93*/searchBody),format.raw/*286.103*/("""')">
                                        <i class="material-icons">chevron_left</i>
                                    </a>
                                </li>
                            """)))}),format.raw/*290.30*/("""
                            """),_display_(/*291.30*/if(beginIndexForPagination > 1)/*291.61*/ {_display_(Seq[Any](format.raw/*291.63*/("""
                                """),format.raw/*292.33*/("""<li class="waves-effect modal-trigger" href="#searchPageModal" style="cursor: pointer;
                                    font-size: 20px;
                                    font-weight: bold">...</li>
                            """)))}),format.raw/*295.30*/("""
                            """),_display_(/*296.30*/for(i <- (beginIndexForPagination + 0) to (endIndexForPagination + 0)) yield /*296.100*/ {_display_(Seq[Any](format.raw/*296.102*/("""
                                """),format.raw/*297.33*/("""<li """),_display_(/*297.38*/if(pageNum == i)/*297.54*/ {_display_(Seq[Any](format.raw/*297.56*/("""
                                    """),format.raw/*298.37*/("""class="active"""")))}),format.raw/*298.52*/(""">
                                    <a href="#!" onclick="jumpToPage("""),_display_(/*299.71*/i),format.raw/*299.72*/(""", '"""),_display_(/*299.76*/sort),format.raw/*299.80*/("""', '"""),_display_(/*299.85*/searchBody),format.raw/*299.95*/("""')">
                                    """),_display_(/*300.38*/i),format.raw/*300.39*/("""
                                    """),format.raw/*301.37*/("""</a>
                                </li>
                            """)))}),format.raw/*303.30*/("""
                            """),_display_(/*304.30*/if(endIndexForPagination < ((total - 1) / pageLimit + 1))/*304.87*/ {_display_(Seq[Any](format.raw/*304.89*/("""
                                """),format.raw/*305.33*/("""<li class="waves-effect modal-trigger" href="#searchPageModal" style="cursor: pointer;
                                    font-size: 20px;
                                    font-weight: bold">...</li>
                            """)))}),format.raw/*308.30*/("""
                            """),_display_(/*309.30*/if((offset + count) >= total)/*309.59*/ {_display_(Seq[Any](format.raw/*309.61*/("""
                                """),format.raw/*310.33*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    chevron_right</i></li>
                                <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    last_page</i></li>
                            """)))}/*314.31*/else/*314.36*/{_display_(Seq[Any](format.raw/*314.37*/("""
                                """),format.raw/*315.33*/("""<li class="waves-effect">
                                    <a href="#!" onclick="jumpToPage("""),_display_(/*316.71*/pageNum),format.raw/*316.78*/("""+1, '"""),_display_(/*316.84*/sort),format.raw/*316.88*/("""', '"""),_display_(/*316.93*/searchBody),format.raw/*316.103*/("""')">
                                        <i class="material-icons">chevron_right</i>
                                    </a>
                                </li>
                                <li class="waves-effect">
                                    <a href="#!" onclick="jumpToPage(("""),_display_(/*321.72*/total),format.raw/*321.77*/("""-1)/("""),_display_(/*321.83*/pageLimit),format.raw/*321.92*/(""")+1, '"""),_display_(/*321.99*/sort),format.raw/*321.103*/("""', '"""),_display_(/*321.108*/searchBody),format.raw/*321.118*/("""')">
                                        <i class="material-icons">last_page</i>
                                    </a>
                                </li>
                            """)))}),format.raw/*325.30*/("""
                            """)))}),format.raw/*326.30*/("""
                        """),format.raw/*327.25*/("""</ul>
                    </div>
                </div>
            """)))}/*330.15*/else/*330.20*/{_display_(Seq[Any](format.raw/*330.21*/("""
                """),format.raw/*331.17*/("""<h5>No TA applied yet.</h5>
            """)))}),format.raw/*332.14*/("""
            """),format.raw/*333.13*/("""<div id="allPageModal" class="modal">
                <div class="modal-content">
                    <h6>Select the page number you want to jump to</h6>
                    <div class="card z-depth-0">

                    """),_display_(/*338.22*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*338.79*/ {_display_(Seq[Any](format.raw/*338.81*/("""
                        """),format.raw/*339.25*/("""<ul class="pagination center-align">
                        """),_display_(/*340.26*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*340.65*/ {_display_(Seq[Any](format.raw/*340.67*/("""
                            """),_display_(/*341.30*/if(j <= ((total - 1)/(pageLimit) + 1))/*341.68*/ {_display_(Seq[Any](format.raw/*341.70*/("""
                                """),_display_(/*342.34*/if(j != pageNum)/*342.50*/ {_display_(Seq[Any](format.raw/*342.52*/("""
                                    """),format.raw/*343.37*/("""<li class="waves-effect grey lighten-3"><a href='"""),_display_(/*343.87*/routes/*343.93*/.TACandidateController.tacandidateList(j, sort)),format.raw/*343.140*/("""'>"""),_display_(/*343.143*/j),format.raw/*343.144*/("""</a></li>
                                """)))}/*344.34*/else/*344.38*/{_display_(Seq[Any](format.raw/*344.39*/("""
                                    """),format.raw/*345.37*/("""<li class="waves-effect active"><a href=""""),_display_(/*345.79*/routes/*345.85*/.TACandidateController.tacandidateList(j, sort)),format.raw/*345.132*/("""">"""),_display_(/*345.135*/j),format.raw/*345.136*/("""</a></li>
                                """)))}),format.raw/*346.34*/("""
                            """)))}),format.raw/*347.30*/("""
                        """)))}),format.raw/*348.26*/("""
                        """),format.raw/*349.25*/("""</ul>
                    """)))}),format.raw/*350.22*/("""
                    """),format.raw/*351.21*/("""</div>
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

                    """),_display_(/*364.22*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*364.79*/ {_display_(Seq[Any](format.raw/*364.81*/("""
                        """),format.raw/*365.25*/("""<ul class="pagination center-align">
                        """),_display_(/*366.26*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*366.65*/ {_display_(Seq[Any](format.raw/*366.67*/("""
                            """),_display_(/*367.30*/if(j <= ((total - 1)/(pageLimit) + 1))/*367.68*/ {_display_(Seq[Any](format.raw/*367.70*/("""
                                """),_display_(/*368.34*/if(j != pageNum)/*368.50*/ {_display_(Seq[Any](format.raw/*368.52*/("""
                                    """),format.raw/*369.37*/("""<li class="waves-effect grey lighten-3"><a href='"""),_display_(/*369.87*/routes/*369.93*/.TACandidateController.tacandidateList(j, sort)),format.raw/*369.140*/("""'>"""),_display_(/*369.143*/j),format.raw/*369.144*/("""</a></li>
                                """)))}/*370.34*/else/*370.38*/{_display_(Seq[Any](format.raw/*370.39*/("""
                                    """),format.raw/*371.37*/("""<li class="waves-effect active"><a href=""""),_display_(/*371.79*/routes/*371.85*/.TACandidateController.tacandidateList(j, sort)),format.raw/*371.132*/("""">"""),_display_(/*371.135*/j),format.raw/*371.136*/("""</a></li>
                                """)))}),format.raw/*372.34*/("""
                            """)))}),format.raw/*373.30*/("""
                        """)))}),format.raw/*374.26*/("""
                        """),format.raw/*375.25*/("""</ul>
                    """)))}),format.raw/*376.22*/("""
                    """),format.raw/*377.21*/("""</div>
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

                    """),_display_(/*390.22*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*390.79*/ {_display_(Seq[Any](format.raw/*390.81*/("""
                        """),format.raw/*391.25*/("""<ul class="pagination center-align">
                        """),_display_(/*392.26*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*392.65*/ {_display_(Seq[Any](format.raw/*392.67*/("""
                            """),_display_(/*393.30*/if(j <= ((total - 1)/(pageLimit) + 1))/*393.68*/ {_display_(Seq[Any](format.raw/*393.70*/("""
                                """),_display_(/*394.34*/if(j != pageNum)/*394.50*/ {_display_(Seq[Any](format.raw/*394.52*/("""
                                    """),format.raw/*395.37*/("""<li class="waves-effect grey lighten-3"><a href='#!' onclick="jumpToPage("""),_display_(/*395.111*/j),format.raw/*395.112*/(""", 'id', '"""),_display_(/*395.122*/searchBody),format.raw/*395.132*/("""')">"""),_display_(/*395.137*/j),format.raw/*395.138*/("""</a></li>
                                """)))}/*396.34*/else/*396.38*/{_display_(Seq[Any](format.raw/*396.39*/("""
                                    """),format.raw/*397.37*/("""<li class="waves-effect active"><a href="#!" onclick="jumpToPage("""),_display_(/*397.103*/j),format.raw/*397.104*/(""", 'id', '"""),_display_(/*397.114*/searchBody),format.raw/*397.124*/("""')">"""),_display_(/*397.129*/j),format.raw/*397.130*/("""</a></li>
                                """)))}),format.raw/*398.34*/("""
                            """)))}),format.raw/*399.30*/("""
                        """)))}),format.raw/*400.26*/("""
                        """),format.raw/*401.25*/("""</ul>
                    """)))}),format.raw/*402.22*/("""
                    """),format.raw/*403.21*/("""</div>
                </div>
                <div class="modal-footer">
                    <a href="#!" class="modal-close waves-effect waves-green btn-flat">
                        Cancel</a>
                </div>
            </div>

        </div>
    </div>

""")))}),format.raw/*414.2*/("""

"""))
      }
    }
  }

  def render(tacandidates:List[TACandidate],pageNum:Integer,sort:String,offset:Integer,total:Integer,count:Integer,listType:String,pageLimit:Integer,searchBody:String,id:Long,beginIndexForPagination:Integer,endIndexForPagination:Integer): play.twirl.api.HtmlFormat.Appendable = apply(tacandidates,pageNum,sort,offset,total,count,listType,pageLimit,searchBody,id,beginIndexForPagination,endIndexForPagination)

  def f:((List[TACandidate],Integer,String,Integer,Integer,Integer,String,Integer,String,Long,Integer,Integer) => play.twirl.api.HtmlFormat.Appendable) = (tacandidates,pageNum,sort,offset,total,count,listType,pageLimit,searchBody,id,beginIndexForPagination,endIndexForPagination) => apply(tacandidates,pageNum,sort,offset,total,count,listType,pageLimit,searchBody,id,beginIndexForPagination,endIndexForPagination)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:36 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/tacandidateList.scala.html
                  HASH: f8c63fff1790c75b421f0508c1aac53cf0d07de8
                  MATRIX: 1215->1|1609->323|1634->341|1658->358|1697->386|1712->393|1793->397|1825->402|1882->432|1897->438|1956->476|2075->567|2104->568|2149->585|2220->629|2271->664|2311->666|2356->683|2395->694|2424->695|2453->696|2510->726|2531->738|2567->753|2698->857|2719->869|2756->885|2958->1056|3003->1073|3297->1339|3326->1340|3419->1405|3448->1406|3494->1424|4202->2104|4231->2105|4273->2119|4326->2144|4355->2145|4401->2163|4630->2364|4659->2365|4708->2386|4838->2488|4867->2489|4896->2490|5329->2895|5358->2896|5411->2921|5564->3046|5593->3047|5642->3068|5776->3174|5805->3175|5851->3193|5903->3217|5932->3218|5967->3226|6041->3272|6070->3273|6115->3290|6260->3407|6289->3408|6321->3413|6371->321|6399->384|6427->3423|6457->3426|6501->3460|6542->3462|6575->3467|6680->3544|6719->3573|6760->3575|6806->3592|7264->4030|7305->4062|7346->4064|7388->4077|7850->4507|7893->4522|7930->4549|7971->4551|8017->4568|9201->5724|9266->5772|9307->5774|9361->5799|9438->5848|9454->5854|9532->5909|9564->5912|9580->5917|9611->5925|9680->5966|9716->5992|9757->5994|9819->6027|9865->6045|9880->6050|9910->6058|9940->6059|10040->6131|10055->6136|10106->6165|10168->6198|10223->6234|10237->6239|10277->6240|10339->6273|10385->6291|10400->6296|10430->6304|10460->6305|10563->6376|10622->6407|10659->6434|10700->6436|10762->6469|10808->6487|10823->6492|10853->6500|10883->6501|10986->6576|11001->6581|11035->6593|11097->6626|11152->6662|11166->6667|11206->6668|11268->6701|11314->6719|11329->6724|11359->6732|11389->6733|11494->6806|11555->6839|11596->6870|11637->6872|11699->6905|11782->6960|11797->6965|11827->6973|11857->6974|11958->7047|12022->7094|12063->7096|12133->7138|12149->7144|12175->7160|12200->7164|12216->7170|12242->7186|12267->7189|12338->7228|12404->7265|12499->7341|12513->7346|12553->7347|12615->7380|12661->7398|12676->7403|12706->7411|12736->7412|12846->7490|12905->7521|13071->7676|13113->7678|13175->7711|13258->7766|13273->7771|13303->7779|13333->7780|13433->7852|13448->7857|13675->8061|13741->8098|13836->8174|13850->8179|13890->8180|13952->8213|13998->8231|14013->8236|14043->8244|14073->8245|14189->8329|14249->8361|14416->8517|14458->8519|14520->8552|14603->8607|14618->8612|14648->8620|14678->8621|14779->8694|14794->8699|15022->8904|15088->8941|15183->9017|15197->9022|15237->9023|15299->9056|15345->9074|15360->9079|15390->9087|15420->9088|15537->9173|15594->9201|15653->9228|15703->9249|15933->9451|15969->9477|16010->9479|16072->9513|16098->9529|16139->9531|16205->9568|16586->9930|16600->9935|16640->9936|16706->9973|16769->10008|16785->10014|16855->10061|17047->10225|17063->10231|17143->10288|17303->10416|17365->10450|17406->10481|17447->10483|17513->10520|17787->10762|17849->10796|17937->10866|17979->10868|18045->10905|18078->10910|18104->10926|18145->10928|18215->10969|18262->10984|18301->10995|18317->11001|18387->11048|18419->11051|18443->11052|18518->11095|18580->11129|18647->11186|18688->11188|18754->11225|19028->11467|19090->11501|19129->11530|19170->11532|19236->11569|19617->11931|19631->11936|19671->11937|19737->11974|19800->12009|19816->12015|19896->12072|20091->12239|20107->12245|20203->12318|20360->12443|20410->12473|20457->12510|20497->12511|20555->12541|20581->12557|20622->12559|20684->12592|21061->12937|21119->12967|21160->12998|21201->13000|21263->13033|21528->13266|21587->13297|21654->13354|21695->13356|21757->13389|22022->13622|22069->13649|22083->13653|22123->13654|22181->13684|22207->13700|22248->13702|22310->13735|22675->14081|22689->14086|22729->14087|22791->14120|22919->14220|22945->14224|22978->14229|23010->14239|23331->14532|23360->14539|23394->14545|23420->14549|23453->14554|23486->14564|23714->14760|23772->14790|23813->14821|23854->14823|23916->14856|24181->15089|24239->15119|24327->15189|24369->15191|24431->15224|24464->15229|24490->15245|24531->15247|24597->15284|24644->15299|24744->15371|24767->15372|24799->15376|24825->15380|24858->15385|24890->15395|24960->15437|24983->15438|25049->15475|25153->15547|25211->15577|25278->15634|25319->15636|25381->15669|25646->15902|25704->15932|25743->15961|25784->15963|25846->15996|26211->16342|26225->16347|26265->16348|26327->16381|26451->16477|26480->16484|26514->16490|26540->16494|26573->16499|26606->16509|26931->16806|26958->16811|26992->16817|27023->16826|27058->16833|27085->16837|27119->16842|27152->16852|27377->17045|27439->17075|27493->17100|27582->17170|27596->17175|27636->17176|27682->17193|27755->17234|27797->17247|28050->17472|28124->17529|28165->17531|28219->17556|28309->17618|28365->17657|28406->17659|28464->17689|28512->17727|28553->17729|28615->17763|28641->17779|28682->17781|28748->17818|28826->17868|28842->17874|28912->17921|28944->17924|28968->17925|29031->17968|29045->17972|29085->17973|29151->18010|29221->18052|29237->18058|29307->18105|29339->18108|29363->18109|29438->18152|29500->18182|29558->18208|29612->18233|29671->18260|29721->18281|30228->18760|30302->18817|30343->18819|30397->18844|30487->18906|30543->18945|30584->18947|30642->18977|30690->19015|30731->19017|30793->19051|30819->19067|30860->19069|30926->19106|31004->19156|31020->19162|31090->19209|31122->19212|31146->19213|31209->19256|31223->19260|31263->19261|31329->19298|31399->19340|31415->19346|31485->19393|31517->19396|31541->19397|31616->19440|31678->19470|31736->19496|31790->19521|31849->19548|31899->19569|32406->20048|32480->20105|32521->20107|32575->20132|32665->20194|32721->20233|32762->20235|32820->20265|32868->20303|32909->20305|32971->20339|32997->20355|33038->20357|33104->20394|33207->20468|33231->20469|33270->20479|33303->20489|33337->20494|33361->20495|33424->20538|33438->20542|33478->20543|33544->20580|33639->20646|33663->20647|33702->20657|33735->20667|33769->20672|33793->20673|33868->20716|33930->20746|33988->20772|34042->20797|34101->20824|34151->20845|34449->21112
                  LINES: 35->1|47->11|48->12|49->13|51->15|51->15|53->15|54->16|54->16|54->16|54->16|57->19|57->19|58->20|59->21|59->21|59->21|60->22|60->22|60->22|60->22|61->23|61->23|61->23|64->26|64->26|64->26|67->29|68->30|78->40|78->40|80->42|80->42|82->44|99->61|99->61|101->63|101->63|101->63|103->65|106->68|106->68|107->69|108->70|108->70|108->70|116->78|116->78|117->79|119->81|119->81|120->82|122->84|122->84|124->86|125->87|125->87|129->91|131->93|131->93|132->94|135->97|135->97|136->98|138->10|139->14|140->99|142->101|142->101|142->101|143->102|145->104|145->104|145->104|146->105|154->113|154->113|154->113|155->114|163->122|165->124|165->124|165->124|166->125|190->149|190->149|190->149|191->150|192->151|192->151|192->151|192->151|192->151|192->151|195->154|195->154|195->154|196->155|196->155|196->155|196->155|196->155|197->156|197->156|197->156|198->157|199->158|199->158|199->158|200->159|200->159|200->159|200->159|200->159|201->160|203->162|203->162|203->162|204->163|204->163|204->163|204->163|204->163|206->165|206->165|206->165|207->166|208->167|208->167|208->167|209->168|209->168|209->168|209->168|209->168|210->169|214->173|214->173|214->173|215->174|216->175|216->175|216->175|216->175|217->176|217->176|217->176|218->177|218->177|218->177|218->177|218->177|218->177|218->177|219->178|220->179|222->181|222->181|222->181|223->182|223->182|223->182|223->182|223->182|224->183|226->185|226->185|226->185|227->186|228->187|228->187|228->187|228->187|229->188|229->188|229->188|230->189|232->191|232->191|232->191|233->192|233->192|233->192|233->192|233->192|234->193|237->196|237->196|237->196|238->197|239->198|239->198|239->198|239->198|240->199|240->199|240->199|241->200|243->202|243->202|243->202|244->203|244->203|244->203|244->203|244->203|245->204|249->208|250->209|251->210|258->217|258->217|258->217|259->218|259->218|259->218|260->219|264->223|264->223|264->223|265->224|265->224|265->224|265->224|267->226|267->226|267->226|269->228|270->229|270->229|270->229|271->230|274->233|275->234|275->234|275->234|276->235|276->235|276->235|276->235|277->236|277->236|277->236|277->236|277->236|277->236|277->236|278->237|279->238|279->238|279->238|280->239|283->242|284->243|284->243|284->243|285->244|289->248|289->248|289->248|290->249|290->249|290->249|290->249|292->251|292->251|292->251|294->253|295->254|295->254|295->254|296->255|296->255|296->255|297->256|301->260|302->261|302->261|302->261|303->262|306->265|308->267|308->267|308->267|309->268|312->271|314->273|314->273|314->273|315->274|315->274|315->274|316->275|320->279|320->279|320->279|321->280|322->281|322->281|322->281|322->281|327->286|327->286|327->286|327->286|327->286|327->286|331->290|332->291|332->291|332->291|333->292|336->295|337->296|337->296|337->296|338->297|338->297|338->297|338->297|339->298|339->298|340->299|340->299|340->299|340->299|340->299|340->299|341->300|341->300|342->301|344->303|345->304|345->304|345->304|346->305|349->308|350->309|350->309|350->309|351->310|355->314|355->314|355->314|356->315|357->316|357->316|357->316|357->316|357->316|357->316|362->321|362->321|362->321|362->321|362->321|362->321|362->321|362->321|366->325|367->326|368->327|371->330|371->330|371->330|372->331|373->332|374->333|379->338|379->338|379->338|380->339|381->340|381->340|381->340|382->341|382->341|382->341|383->342|383->342|383->342|384->343|384->343|384->343|384->343|384->343|384->343|385->344|385->344|385->344|386->345|386->345|386->345|386->345|386->345|386->345|387->346|388->347|389->348|390->349|391->350|392->351|405->364|405->364|405->364|406->365|407->366|407->366|407->366|408->367|408->367|408->367|409->368|409->368|409->368|410->369|410->369|410->369|410->369|410->369|410->369|411->370|411->370|411->370|412->371|412->371|412->371|412->371|412->371|412->371|413->372|414->373|415->374|416->375|417->376|418->377|431->390|431->390|431->390|432->391|433->392|433->392|433->392|434->393|434->393|434->393|435->394|435->394|435->394|436->395|436->395|436->395|436->395|436->395|436->395|436->395|437->396|437->396|437->396|438->397|438->397|438->397|438->397|438->397|438->397|438->397|439->398|440->399|441->400|442->401|443->402|444->403|455->414
                  -- GENERATED --
              */
          