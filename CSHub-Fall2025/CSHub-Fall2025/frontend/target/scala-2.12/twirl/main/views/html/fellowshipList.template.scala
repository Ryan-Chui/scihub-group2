
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

object fellowshipList extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template13[List[Fellowship],Integer,String,Integer,Integer,Integer,String,Integer,String,String,Long,Integer,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(projects: List[Fellowship],
        pageNum: Integer,
        sort: String,
        offset: Integer,
        total: Integer,
        count: Integer,
        listType: String,
        pageLimit: Integer,
        searchBody: String,
        userName: String,
        id: Long, beginIndexForPagination: Integer, endIndexForPagination: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*12.6*/import helper._;
/*13.6*/import models._
/*14.2*/import models.Project

def /*16.2*/scripts/*16.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*16.13*/("""
        """),format.raw/*17.9*/("""<script type = "module" src='"""),_display_(/*17.39*/routes/*17.45*/.Assets.at("javascripts/voiceJump.js")),format.raw/*17.83*/("""'></script>
        <script type="text/javascript">

                $(document).ready(function () """),format.raw/*20.47*/("""{"""),format.raw/*20.48*/("""
                    """),format.raw/*21.21*/("""var nasaEndorsedAPIArray = []
                    """),_display_(/*22.22*/for(i <- 0 until projects.size) yield /*22.53*/ {_display_(Seq[Any](format.raw/*22.55*/("""
                    """),format.raw/*23.21*/("""var json = """),format.raw/*23.32*/("""{"""),format.raw/*23.33*/("""}"""),format.raw/*23.34*/(""";
                    json.id = '"""),_display_(/*24.33*/projects/*24.41*/.get(i).getId()),format.raw/*24.56*/("""';
                    json.url = "/project/projectDetail/" + json.id;

                    json.name = '"""),_display_(/*27.35*/projects/*27.43*/.get(i).getTitle),format.raw/*27.59*/("""'.replace(/[^a-zA-Z0-9]/g, " ").replace(/  +/g, " ").trim();
                    console.log("jsonhere:" + json)
                    nasaEndorsedAPIArray.push(json)
                    """)))}),format.raw/*30.22*/("""
                    """),format.raw/*31.21*/("""$("#nasaText").text(JSON.stringify(nasaEndorsedAPIArray));

                    $('.tooltipped').tooltip();

                    // $("#speak-from-filter").click();
                    // $("#speak-nasa").click();
                    // $("#speak-from-filter").click();

                """),format.raw/*39.17*/("""}"""),format.raw/*39.18*/(""");

                function jumpToPage(pageNum, sort, searchString) """),format.raw/*41.66*/("""{"""),format.raw/*41.67*/("""

                    """),format.raw/*43.21*/("""pageNum =  parseInt(pageNum);

                    var url = "/project/searchPOST?pageNum=" + (pageNum) + "&sortCriteria=" + sort;
                    var form = $(document.createElement('form'));
                    $(form).attr("action", url);
                    $(form).attr("method", "POST");
                    $(form).css("display", "none");


                    var form_searchString = $("<input>")
                            .attr("type", "text")
                            .attr("name", "searchString")
                            .val(searchString);
                    $(form).append($(form_searchString));

                    console.log("<<<<<<<searchString" + searchString)
                    form.appendTo(document.body);
                    $(form).submit();
                """),format.raw/*61.17*/("""}"""),format.raw/*61.18*/("""

                                """),format.raw/*63.33*/("""function string2Map(str) """),format.raw/*63.58*/("""{"""),format.raw/*63.59*/("""

                    """),format.raw/*65.21*/("""var map = new Map();
                    var splitedString = str.replace(new RegExp("],", 'g'), ";");
                    var array = splitedString.split(";");
                    for(var i=0; i<array.length; i++)"""),format.raw/*68.54*/("""{"""),format.raw/*68.55*/("""
                        """),format.raw/*69.25*/("""var idAndEventsString = array[i];
                        idAndEventsString = idAndEventsString.replace(/["""),format.raw/*70.73*/("""{"""),format.raw/*70.74*/("""}"""),format.raw/*70.75*/("""[\]\\]/g, " ");
                        var idAndEvents = idAndEventsString.split("=");
                        var id = idAndEvents[0];
                        var eventsString = idAndEvents[1];
                        var events = eventsString.split(",");
                        console.log("events:" + events + "," + i);

                        var formatedEvents = "";
                        for(var j=0; j<events.length; j++)"""),format.raw/*78.59*/("""{"""),format.raw/*78.60*/("""
                            """),format.raw/*79.29*/("""events[j] = events[j].trim();
                            formatedEvents = formatedEvents + events[j] + ";";
                        """),format.raw/*81.25*/("""}"""),format.raw/*81.26*/("""
                        """),format.raw/*82.25*/("""if(formatedEvents.length > 1)
                            map.set(id.trim(), formatedEvents);
                    """),format.raw/*84.21*/("""}"""),format.raw/*84.22*/("""

                    """),format.raw/*86.21*/("""return map;
                """),format.raw/*87.17*/("""}"""),format.raw/*87.18*/("""

        """),format.raw/*89.9*/("""</script>
        <style>
                .follow-fab """),format.raw/*91.29*/("""{"""),format.raw/*91.30*/("""
                    """),format.raw/*92.21*/("""top: -20px !important;
                    bottom: auto !important;
                    right: -20px !important;
                """),format.raw/*95.17*/("""}"""),format.raw/*95.18*/("""
        """),format.raw/*96.9*/("""</style>
    """)))};
Seq[Any](format.raw/*11.84*/("""
    """),format.raw/*13.1*/("""    """),format.raw/*15.1*/("""
"""),format.raw/*97.6*/("""

    """),_display_(/*99.6*/main("All Projects", scripts)/*99.35*/ {_display_(Seq[Any](format.raw/*99.37*/("""
        """),format.raw/*100.9*/("""<div class="container">
            <div class="card-panel center">

                """),_display_(/*103.18*/if(listType.equals("search"))/*103.47*/ {_display_(Seq[Any](format.raw/*103.49*/("""
                    """),format.raw/*104.21*/("""<div class="row card-panel z-depth-0 project-zone-panel">
                        <div class="col s12" style="margin-top: -10px;
                            margin-bottom: -10px;">
                            <h6 class="center tooltipped" data-position="bottom" data-tooltip="This list shows the search results." >
                                Search Result
                            </h6>
                        </div>
                    </div>
                """)))}/*112.18*/else if(listType.equals("all"))/*112.50*/ {_display_(Seq[Any](format.raw/*112.52*/("""
                """),format.raw/*113.17*/("""<div class="row card-panel z-depth-0 project-zone-panel">
                    <div class="col s12" style="margin-top: -10px;
                        margin-bottom: -10px;">
                        <h6 class="center tooltipped" data-position="bottom" data-tooltip="This list shows all the projects." >
                            List of Projects Registered at SciBot
                        </h6>
                    </div>
                </div>
                """)))}),format.raw/*121.18*/("""

                """),_display_(/*123.18*/if(projects.size() > 0)/*123.41*/ {_display_(Seq[Any](format.raw/*123.43*/("""
                    """),format.raw/*124.21*/("""<div class="col s8 offset-s2">
                        <h4>Project List</h4>

                    </div>
                    <div class="col s2">
                        <button id = "speak-from-filter" hidden></button>
                        <div id="nasaText" hidden></div>
                        <div id="requestField"></div>
                        <div id="replyField"></div>
                    </div>
                    <div class="row">
                        <div class="col s6">
                            <h6 class="left">Showing results: """),_display_(/*136.64*/{
                                offset + 1
                            }),format.raw/*138.30*/(""" """),format.raw/*138.31*/("""to """),_display_(/*138.35*/{
                                offset + count
                            }),format.raw/*140.30*/(""" """),format.raw/*140.31*/("""of """),_display_(/*140.35*/total),format.raw/*140.40*/("""</h6>
                        </div>
                        <div class="col s6" style="padding-top: -5px;
                            margin-top: -2px">
                            <a class='dropdown-trigger btn-flat right' href='#' data-target='dropdown2' style="text-transform: none;
                                font-weight: bold;
                                color: black;
                                font-family: AmazonEmberBold, Helvetica Neue Bold, Helvetica Neue, Helvetica, Arial, sans-serif;
                            !important; ">
                                Sort By: &nbsp; <font color="#3a5dc3">
                                """),_display_(/*150.34*/if(sort.equals("id"))/*150.55*/ {_display_(Seq[Any](format.raw/*150.57*/("""
                                    """),format.raw/*151.37*/("""Project ID
                                """)))}/*152.34*/else if(sort.equals("title"))/*152.63*/{_display_(Seq[Any](format.raw/*152.64*/("""
                            """),format.raw/*153.29*/("""Project Title
                            """)))}/*154.30*/else if(sort.equals("access_times"))/*154.66*/{_display_(Seq[Any](format.raw/*154.67*/("""
                                """),format.raw/*155.33*/("""Popularity
                                """)))}/*156.34*/else/*156.39*/{_display_(Seq[Any](format.raw/*156.40*/("""
                            """),format.raw/*157.29*/("""Project Location
                            """)))}),format.raw/*158.30*/("""</font> <i class="material-icons right">expand_more</i></a>

                                <!-- Dropdown Structure -->
                            <ul id='dropdown2' class='dropdown-content'>
                            """),_display_(/*162.30*/if(listType.equals("all"))/*162.56*/ {_display_(Seq[Any](format.raw/*162.58*/("""
                                """),format.raw/*163.33*/("""<li><a href=""""),_display_(/*163.47*/routes/*163.53*/.ProjectController.projectList(1, "id")),format.raw/*163.92*/("""" class="grey-text text-darken-4"><i class="material-icons">
                                    event</i>Project ID</a></li>
                                <li><a href=""""),_display_(/*165.47*/routes/*165.53*/.ProjectController.projectList(1, "title")),format.raw/*165.95*/("""" class="grey-text text-darken-4"><i class="material-icons">
                                    sort_by_alpha</i>Project Title </a></li>
                                <li><a href=""""),_display_(/*167.47*/routes/*167.53*/.ProjectController.projectList(1, "location")),format.raw/*167.98*/("""" class="grey-text text-darken-4"><i class="material-icons">
                                    sort_by_alpha</i>Project Location </a></li>
                                <li><a href=""""),_display_(/*169.47*/routes/*169.53*/.ProjectController.projectList(1, "access_times")),format.raw/*169.102*/("""" class="grey-text text-darken-4"><i class="material-icons">
                                    sort_by_alpha</i>Popularity </a></li>
                            """)))}/*171.30*/else/*171.35*/{_display_(Seq[Any](format.raw/*171.36*/("""
                                """),format.raw/*172.33*/("""<li>
                                    <a onclick="jumpToPage(1, 'id', '"""),_display_(/*173.71*/searchBody),format.raw/*173.81*/("""')">
                                        <i class="material-icons">event</i>Project ID
                                    </a>
                                </li>
                                <li>
                                    <a onclick="jumpToPage(1, 'title', '"""),_display_(/*178.74*/searchBody),format.raw/*178.84*/("""')">
                                        <i class="material-icons">sort_by_alpha</i>Project Title
                                    </a>
                                </li>
                                <li>
                                    <a onclick="jumpToPage(1, 'location', '"""),_display_(/*183.77*/searchBody),format.raw/*183.87*/("""')">
                                        <i class="material-icons">sort_by_alpha</i>Project Location
                                    </a>
                                </li>
                                <li>
                                    <a onclick="jumpToPage(1, 'access_times', '"""),_display_(/*188.81*/searchBody),format.raw/*188.91*/("""')">
                                        <i class="material-icons">sort_by_alpha</i>Popularity
                                    </a>
                                </li>
                            """)))}),format.raw/*192.30*/("""
                            """),format.raw/*193.29*/("""</ul>
                        </div>
                    </div>
                    <table class="centered responsive-table striped" id="projectTable" >
                        <thead>
                            <tr class="list-header" style="border-bottom: 1px solid;
                            !important;">
                                <th style="cursor: pointer;">Project Id</th>
                                <th style="cursor: pointer;">Project Title</th>
                                <th style="cursor: pointer;">Goals</th>
                                <th style="cursor: pointer;">Location</th>
                                <th style="width: 130px; ">Public</th>
                            </tr>
                        </thead>
                        <tbody>
                        """),_display_(/*208.26*/for((entry, index) <- projects.zipWithIndex) yield /*208.70*/ {_display_(Seq[Any](format.raw/*208.72*/("""
                            """),format.raw/*209.29*/("""<tr>
                                <td>"""),_display_(/*210.38*/entry/*210.43*/.getId()),format.raw/*210.51*/("""</td>

                                <td><a href = """"),_display_(/*212.49*/routes/*212.55*/.ProjectController.projectDetail(entry.getId())),format.raw/*212.102*/("""">"""),_display_(/*212.105*/entry/*212.110*/.getTitle()),format.raw/*212.121*/("""</a></td>

                                """),_display_(/*214.34*/if((entry.getGoals() != null) && (entry.getGoals() != ""))/*214.92*/ {_display_(Seq[Any](format.raw/*214.94*/("""
                                    """),format.raw/*215.108*/("""
                                    """),format.raw/*216.60*/("""
                                    """),format.raw/*217.46*/("""
                                    """),format.raw/*218.37*/("""<td class="tooltip" style="max-width: 450px;
                                    !important">
                                        """),_display_(/*220.42*/entry/*220.47*/.getTruncGoals()),format.raw/*220.63*/("""
                                        """),format.raw/*221.41*/("""<span class="tooltiptext"> """),_display_(/*221.69*/entry/*221.74*/.getGoals()),format.raw/*221.85*/("""</span>
                                    </td>
                                """)))}/*223.35*/else/*223.40*/{_display_(Seq[Any](format.raw/*223.41*/("""
                                    """),format.raw/*224.37*/("""<td><span class=""""),_display_(/*224.55*/entry/*224.60*/.getId()),format.raw/*224.68*/(""" """),format.raw/*224.69*/("""editable" data-name='goals'>&ensp; -</span></td>
                                """)))}),format.raw/*225.34*/("""

                                """),_display_(/*227.34*/if(entry.getLocation() != "")/*227.63*/ {_display_(Seq[Any](format.raw/*227.65*/("""
                                    """),format.raw/*228.37*/("""<td><span class=""""),_display_(/*228.55*/entry/*228.60*/.getId()),format.raw/*228.68*/(""" """),format.raw/*228.69*/("""editable" data-name='location'></span>
                                        """),_display_(/*229.42*/entry/*229.47*/.getLocation()),format.raw/*229.61*/("""
                                    """),format.raw/*230.37*/("""</td>
                                """)))}/*231.35*/else/*231.40*/{_display_(Seq[Any](format.raw/*231.41*/("""
                                    """),format.raw/*232.37*/("""<td><span class=""""),_display_(/*232.55*/entry/*232.60*/.getId()),format.raw/*232.68*/(""" """),format.raw/*232.69*/("""editable" data-name='location'>&ensp; -</span></td>
                                """)))}),format.raw/*233.34*/("""
                                """),format.raw/*234.33*/("""<td>





                                </td>
                                <td>
                                    """),_display_(/*242.38*/if(entry.getAuthentication.equals("private"))/*242.83*/{_display_(Seq[Any](format.raw/*242.84*/("""
                                        """),format.raw/*243.41*/("""<i class="material-icons">
                                            lock_open</i>
                                    """)))}/*245.38*/else/*245.42*/{_display_(Seq[Any](format.raw/*245.43*/("""
                                        """),format.raw/*246.41*/("""<i class="material-icons">
                                            public</i>
                                    """)))}),format.raw/*248.38*/("""
                                """),format.raw/*249.33*/("""</td>

                            </tr>
                        """)))}),format.raw/*252.26*/("""
                        """),format.raw/*253.25*/("""</tbody>
                    </table>

                    <div class="row">
                        <div class="col s12">
                            <ul class="pagination center-align">

                                """),_display_(/*260.34*/if(listType.equals("all"))/*260.60*/ {_display_(Seq[Any](format.raw/*260.62*/("""
                                    """),_display_(/*261.38*/if(pageNum == 1)/*261.54*/ {_display_(Seq[Any](format.raw/*261.56*/("""
                                        """),format.raw/*262.41*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                            first_page</i></li>
                                        <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                            chevron_left</i></li>
                                    """)))}/*266.39*/else/*266.44*/{_display_(Seq[Any](format.raw/*266.45*/("""
                                        """),format.raw/*267.41*/("""<li class="waves-effect"><a href=""""),_display_(/*267.76*/routes/*267.82*/.ProjectController.projectList(1, sort)),format.raw/*267.121*/(""""><i class="material-icons">
                                            first_page</i></a></li>
                                        <li class="waves-effect"><a href=""""),_display_(/*269.76*/routes/*269.82*/.ProjectController.projectList(pageNum - 1, sort)),format.raw/*269.131*/(""""><i class="material-icons">
                                            chevron_left</i></a></li>
                                    """)))}),format.raw/*271.38*/("""
                                    """),_display_(/*272.38*/if(beginIndexForPagination > 1)/*272.69*/ {_display_(Seq[Any](format.raw/*272.71*/("""
                                        """),format.raw/*273.41*/("""<li class="waves-effect modal-trigger" href="#allPageModal" style="cursor: pointer;
                                            font-size: 20px;
                                            font-weight: bold">...</li>
                                    """)))}),format.raw/*276.38*/("""
                                    """),_display_(/*277.38*/for(i <- (beginIndexForPagination + 0) to (endIndexForPagination + 0)) yield /*277.108*/ {_display_(Seq[Any](format.raw/*277.110*/("""
                                        """),format.raw/*278.41*/("""<li """),_display_(/*278.46*/if(pageNum == i)/*278.62*/ {_display_(Seq[Any](format.raw/*278.64*/("""
                                            """),format.raw/*279.45*/("""class="active"""")))}),format.raw/*279.60*/("""><a href=""""),_display_(/*279.71*/routes/*279.77*/.ProjectController.projectList(i, sort)),format.raw/*279.116*/("""">"""),_display_(/*279.119*/i),format.raw/*279.120*/("""</a></li>
                                    """)))}),format.raw/*280.38*/("""
                                    """),_display_(/*281.38*/if(endIndexForPagination < ((total - 1) / pageLimit + 1))/*281.95*/ {_display_(Seq[Any](format.raw/*281.97*/("""
                                        """),format.raw/*282.41*/("""<li class="waves-effect modal-trigger" href="#allPageModal" style="cursor: pointer;
                                            font-size: 20px;
                                            font-weight: bold">...</li>
                                    """)))}),format.raw/*285.38*/("""
                                    """),_display_(/*286.38*/if((offset + count) >= total)/*286.67*/ {_display_(Seq[Any](format.raw/*286.69*/("""
                                        """),format.raw/*287.41*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                            chevron_right</i></li>
                                        <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                            last_page</i></li>
                                    """)))}/*291.39*/else/*291.44*/{_display_(Seq[Any](format.raw/*291.45*/("""
                                        """),format.raw/*292.41*/("""<li class="waves-effect"><a href=""""),_display_(/*292.76*/routes/*292.82*/.ProjectController.projectList(pageNum + 1, sort)),format.raw/*292.131*/(""""><i class="material-icons">
                                            chevron_right</i></a></li>
                                        <li class="waves-effect"><a href=""""),_display_(/*294.76*/routes/*294.82*/.ProjectController.projectList((total - 1) / pageLimit + 1, sort)),format.raw/*294.147*/(""""><i class="material-icons">
                                            last_page</i></a></li>
                                    """)))}),format.raw/*296.38*/("""
                                """)))}/*297.34*/else if(listType.equals("my enroll"))/*297.71*/{_display_(Seq[Any](format.raw/*297.72*/("""
                                    """),_display_(/*298.38*/if(pageNum == 1)/*298.54*/ {_display_(Seq[Any](format.raw/*298.56*/("""
                                        """),format.raw/*299.41*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                            first_page</i></li>
                                        <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                            chevron_left</i></li>
                                    """)))}/*303.39*/else/*303.44*/{_display_(Seq[Any](format.raw/*303.45*/("""
                                        """),format.raw/*304.41*/("""<li class="waves-effect"><a href=""""),_display_(/*304.76*/routes/*304.82*/.ProjectController.getMyEnrolledProjects(1, sort)),format.raw/*304.131*/(""""><i class="material-icons">
                                            first_page</i></a></li>
                                        <li class="waves-effect"><a href=""""),_display_(/*306.76*/routes/*306.82*/.ProjectController.getMyEnrolledProjects(pageNum - 1, sort)),format.raw/*306.141*/(""""><i class="material-icons">
                                            chevron_left</i></a></li>
                                    """)))}),format.raw/*308.38*/("""
                                    """),_display_(/*309.38*/if(beginIndexForPagination > 1)/*309.69*/ {_display_(Seq[Any](format.raw/*309.71*/("""
                                        """),format.raw/*310.41*/("""<li class="waves-effect modal-trigger" href="#enrollPageModal" style="cursor: pointer;
                                        font-size: 20px;
                                        font-weight: bold">...</li>
                                    """)))}),format.raw/*313.38*/("""
                                    """),_display_(/*314.38*/for(i <- (beginIndexForPagination + 0) to (endIndexForPagination + 0)) yield /*314.108*/ {_display_(Seq[Any](format.raw/*314.110*/("""
                                        """),format.raw/*315.41*/("""<li """),_display_(/*315.46*/if(pageNum == i)/*315.62*/ {_display_(Seq[Any](format.raw/*315.64*/("""
                                            """),format.raw/*316.45*/("""class="active"""")))}),format.raw/*316.60*/("""><a href=""""),_display_(/*316.71*/routes/*316.77*/.ProjectController.getMyEnrolledProjects(i, sort)),format.raw/*316.126*/("""">"""),_display_(/*316.129*/i),format.raw/*316.130*/("""</a></li>
                                    """)))}),format.raw/*317.38*/("""
                                    """),_display_(/*318.38*/if(endIndexForPagination < ((total - 1) / pageLimit + 1))/*318.95*/ {_display_(Seq[Any](format.raw/*318.97*/("""
                                        """),format.raw/*319.41*/("""<li class="waves-effect modal-trigger" href="#enrollPageModal" style="cursor: pointer;
                                        font-size: 20px;
                                        font-weight: bold">...</li>
                                    """)))}),format.raw/*322.38*/("""
                                    """),_display_(/*323.38*/if((offset + count) >= total)/*323.67*/ {_display_(Seq[Any](format.raw/*323.69*/("""
                                        """),format.raw/*324.41*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                            chevron_right</i></li>
                                        <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                            last_page</i></li>
                                    """)))}/*328.39*/else/*328.44*/{_display_(Seq[Any](format.raw/*328.45*/("""
                                        """),format.raw/*329.41*/("""<li class="waves-effect"><a href=""""),_display_(/*329.76*/routes/*329.82*/.ProjectController.getMyEnrolledProjects(pageNum + 1, sort)),format.raw/*329.141*/(""""><i class="material-icons">
                                            chevron_right</i></a></li>
                                        <li class="waves-effect"><a href=""""),_display_(/*331.76*/routes/*331.82*/.ProjectController.getMyEnrolledProjects((total - 1) / pageLimit + 1, sort)),format.raw/*331.157*/(""""><i class="material-icons">
                                            last_page</i></a></li>
                                    """)))}),format.raw/*333.38*/("""
                                """)))}/*334.34*/else/*334.38*/{_display_(Seq[Any](format.raw/*334.39*/("""
                                """),_display_(/*335.34*/if(pageNum == 1)/*335.50*/ {_display_(Seq[Any](format.raw/*335.52*/("""
                                    """),format.raw/*336.37*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                        first_page</i></li>
                                    <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                        chevron_left</i></li>
                                """)))}/*340.35*/else/*340.40*/{_display_(Seq[Any](format.raw/*340.41*/("""
                                    """),format.raw/*341.37*/("""<li class="waves-effect">
                                        <a href="#!" onclick="jumpToPage(1, '"""),_display_(/*342.79*/sort),format.raw/*342.83*/("""', '"""),_display_(/*342.88*/searchBody),format.raw/*342.98*/("""')">
                                            <i class="material-icons">first_page</i>
                                        </a>
                                    </li>
                                    <li class="waves-effect">
                                        <a href="#!" onclick="jumpToPage("""),_display_(/*347.75*/pageNum),format.raw/*347.82*/("""-1, '"""),_display_(/*347.88*/sort),format.raw/*347.92*/("""', '"""),_display_(/*347.97*/searchBody),format.raw/*347.107*/("""')">
                                            <i class="material-icons">chevron_left</i>
                                        </a>
                                    </li>
                                """)))}),format.raw/*351.34*/("""
                                """),_display_(/*352.34*/if(beginIndexForPagination > 1)/*352.65*/ {_display_(Seq[Any](format.raw/*352.67*/("""
                                    """),format.raw/*353.37*/("""<li class="waves-effect modal-trigger" href="#searchPageModal" style="cursor: pointer;
                                        font-size: 20px;
                                        font-weight: bold">...</li>
                                """)))}),format.raw/*356.34*/("""
                                """),_display_(/*357.34*/for(i <- (beginIndexForPagination + 0) to (endIndexForPagination + 0)) yield /*357.104*/ {_display_(Seq[Any](format.raw/*357.106*/("""
                                    """),format.raw/*358.37*/("""<li """),_display_(/*358.42*/if(pageNum == i)/*358.58*/ {_display_(Seq[Any](format.raw/*358.60*/("""
                                        """),format.raw/*359.41*/("""class="active"""")))}),format.raw/*359.56*/(""">
                                        <a href="#!" onclick="jumpToPage("""),_display_(/*360.75*/i),format.raw/*360.76*/(""", '"""),_display_(/*360.80*/sort),format.raw/*360.84*/("""', '"""),_display_(/*360.89*/searchBody),format.raw/*360.99*/("""')">
                                        """),_display_(/*361.42*/i),format.raw/*361.43*/("""
                                        """),format.raw/*362.41*/("""</a>
                                    </li>
                                """)))}),format.raw/*364.34*/("""
                                """),_display_(/*365.34*/if(endIndexForPagination < ((total - 1) / pageLimit + 1))/*365.91*/ {_display_(Seq[Any](format.raw/*365.93*/("""
                                    """),format.raw/*366.37*/("""<li class="waves-effect modal-trigger" href="#searchPageModal" style="cursor: pointer;
                                        font-size: 20px;
                                        font-weight: bold">...</li>
                                """)))}),format.raw/*369.34*/("""
                                """),_display_(/*370.34*/if((offset + count) >= total)/*370.63*/ {_display_(Seq[Any](format.raw/*370.65*/("""
                                    """),format.raw/*371.37*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                        chevron_right</i></li>
                                    <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                        last_page</i></li>
                                """)))}/*375.35*/else/*375.40*/{_display_(Seq[Any](format.raw/*375.41*/("""
                                    """),format.raw/*376.37*/("""<li class="waves-effect">
                                        <a href="#!" onclick="jumpToPage("""),_display_(/*377.75*/pageNum),format.raw/*377.82*/("""+1, '"""),_display_(/*377.88*/sort),format.raw/*377.92*/("""', '"""),_display_(/*377.97*/searchBody),format.raw/*377.107*/("""')">
                                            <i class="material-icons">chevron_right</i>
                                        </a>
                                    </li>
                                    <li class="waves-effect">
                                        <a href="#!" onclick="jumpToPage(("""),_display_(/*382.76*/total),format.raw/*382.81*/("""-1)/("""),_display_(/*382.87*/pageLimit),format.raw/*382.96*/(""")+1, '"""),_display_(/*382.103*/sort),format.raw/*382.107*/("""', '"""),_display_(/*382.112*/searchBody),format.raw/*382.122*/("""')">
                                        <i class="material-icons">last_page</i>
                                        </a>
                                    </li>
                                """)))}),format.raw/*386.34*/("""
                                """)))}),format.raw/*387.34*/("""
                            """),format.raw/*388.29*/("""</ul>
                        </div>
                    </div>
                """)))}/*391.19*/else/*391.24*/{_display_(Seq[Any](format.raw/*391.25*/("""
                    """),format.raw/*392.21*/("""<h5>No project was found.</h5>
                """)))}),format.raw/*393.18*/("""
                """),format.raw/*394.17*/("""<div id="allPageModal" class="modal">
                    <div class="modal-content">
                        <h6>Select the page number you want to jump to</h6>
                        <div class="card z-depth-0">

                        """),_display_(/*399.26*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*399.83*/ {_display_(Seq[Any](format.raw/*399.85*/("""
                            """),format.raw/*400.29*/("""<ul class="pagination center-align">
                            """),_display_(/*401.30*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*401.69*/ {_display_(Seq[Any](format.raw/*401.71*/("""
                                """),_display_(/*402.34*/if(j <= ((total - 1)/(pageLimit) + 1))/*402.72*/ {_display_(Seq[Any](format.raw/*402.74*/("""
                                    """),_display_(/*403.38*/if(j != pageNum)/*403.54*/ {_display_(Seq[Any](format.raw/*403.56*/("""
                                        """),format.raw/*404.41*/("""<li class="waves-effect grey lighten-3"><a href='"""),_display_(/*404.91*/routes/*404.97*/.ProjectController.projectList(j, sort)),format.raw/*404.136*/("""'>"""),_display_(/*404.139*/j),format.raw/*404.140*/("""</a></li>
                                    """)))}/*405.38*/else/*405.42*/{_display_(Seq[Any](format.raw/*405.43*/("""
                                        """),format.raw/*406.41*/("""<li class="waves-effect active"><a href=""""),_display_(/*406.83*/routes/*406.89*/.ProjectController.projectList(j, sort)),format.raw/*406.128*/("""">"""),_display_(/*406.131*/j),format.raw/*406.132*/("""</a></li>
                                    """)))}),format.raw/*407.38*/("""
                                """)))}),format.raw/*408.34*/("""
                            """)))}),format.raw/*409.30*/("""
                            """),format.raw/*410.29*/("""</ul>
                        """)))}),format.raw/*411.26*/("""
                        """),format.raw/*412.25*/("""</div>
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

                        """),_display_(/*424.26*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*424.83*/ {_display_(Seq[Any](format.raw/*424.85*/("""
                            """),format.raw/*425.29*/("""<ul class="pagination center-align">
                            """),_display_(/*426.30*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*426.69*/ {_display_(Seq[Any](format.raw/*426.71*/("""
                                """),_display_(/*427.34*/if(j <= ((total - 1)/(pageLimit) + 1))/*427.72*/ {_display_(Seq[Any](format.raw/*427.74*/("""
                                    """),_display_(/*428.38*/if(j != pageNum)/*428.54*/ {_display_(Seq[Any](format.raw/*428.56*/("""
                                        """),format.raw/*429.41*/("""<li class="waves-effect grey lighten-3"><a href='"""),_display_(/*429.91*/routes/*429.97*/.ProjectController.getMyEnrolledProjects(j, sort)),format.raw/*429.146*/("""'>"""),_display_(/*429.149*/j),format.raw/*429.150*/("""</a></li>
                                    """)))}/*430.38*/else/*430.42*/{_display_(Seq[Any](format.raw/*430.43*/("""
                                        """),format.raw/*431.41*/("""<li class="waves-effect active"><a href=""""),_display_(/*431.83*/routes/*431.89*/.ProjectController.getMyEnrolledProjects(j, sort)),format.raw/*431.138*/("""">"""),_display_(/*431.141*/j),format.raw/*431.142*/("""</a></li>
                                    """)))}),format.raw/*432.38*/("""
                                """)))}),format.raw/*433.34*/("""
                            """)))}),format.raw/*434.30*/("""
                            """),format.raw/*435.29*/("""</ul>
                        """)))}),format.raw/*436.26*/("""
                        """),format.raw/*437.25*/("""</div>
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

                        """),_display_(/*449.26*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*449.83*/ {_display_(Seq[Any](format.raw/*449.85*/("""
                            """),format.raw/*450.29*/("""<ul class="pagination center-align">
                            """),_display_(/*451.30*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*451.69*/ {_display_(Seq[Any](format.raw/*451.71*/("""
                                """),_display_(/*452.34*/if(j <= ((total - 1)/(pageLimit) + 1))/*452.72*/ {_display_(Seq[Any](format.raw/*452.74*/("""
                                    """),_display_(/*453.38*/if(j != pageNum)/*453.54*/ {_display_(Seq[Any](format.raw/*453.56*/("""
                                        """),format.raw/*454.41*/("""<li class="waves-effect grey lighten-3"><a href='#!' onclick="jumpToPage("""),_display_(/*454.115*/j),format.raw/*454.116*/(""", 'id', '"""),_display_(/*454.126*/searchBody),format.raw/*454.136*/("""')">"""),_display_(/*454.141*/j),format.raw/*454.142*/("""</a></li>
                                    """)))}/*455.38*/else/*455.42*/{_display_(Seq[Any](format.raw/*455.43*/("""
                                        """),format.raw/*456.41*/("""<li class="waves-effect active"><a href="#!" onclick="jumpToPage("""),_display_(/*456.107*/j),format.raw/*456.108*/(""", 'id', '"""),_display_(/*456.118*/searchBody),format.raw/*456.128*/("""')">"""),_display_(/*456.133*/j),format.raw/*456.134*/("""</a></li>
                                    """)))}),format.raw/*457.38*/("""
                                """)))}),format.raw/*458.34*/("""
                            """)))}),format.raw/*459.30*/("""
                            """),format.raw/*460.29*/("""</ul>
                        """)))}),format.raw/*461.26*/("""
                        """),format.raw/*462.25*/("""</div>
                    </div>
                    <div class="modal-footer">
                        <a href="#!" class="modal-close waves-effect waves-green btn-flat">
                            Cancel</a>
                    </div>
                </div>
            </div>
        </div>
    """)))}),format.raw/*471.6*/("""

"""))
      }
    }
  }

  def render(projects:List[Fellowship],pageNum:Integer,sort:String,offset:Integer,total:Integer,count:Integer,listType:String,pageLimit:Integer,searchBody:String,userName:String,id:Long,beginIndexForPagination:Integer,endIndexForPagination:Integer): play.twirl.api.HtmlFormat.Appendable = apply(projects,pageNum,sort,offset,total,count,listType,pageLimit,searchBody,userName,id,beginIndexForPagination,endIndexForPagination)

  def f:((List[Fellowship],Integer,String,Integer,Integer,Integer,String,Integer,String,String,Long,Integer,Integer) => play.twirl.api.HtmlFormat.Appendable) = (projects,pageNum,sort,offset,total,count,listType,pageLimit,searchBody,userName,id,beginIndexForPagination,endIndexForPagination) => apply(projects,pageNum,sort,offset,total,count,listType,pageLimit,searchBody,userName,id,beginIndexForPagination,endIndexForPagination)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:31 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/fellowshipList.scala.html
                  HASH: ca6f729213fdd610b30d5cc598f17ebad8d583ad
                  MATRIX: 1220->1|1635->348|1660->370|1684->387|1719->411|1734->418|1815->422|1851->431|1908->461|1923->467|1982->505|2109->604|2138->605|2187->626|2265->677|2312->708|2352->710|2401->731|2440->742|2469->743|2498->744|2559->778|2576->786|2612->801|2745->907|2762->915|2799->931|3016->1117|3065->1138|3380->1425|3409->1426|3506->1495|3535->1496|3585->1518|4411->2316|4440->2317|4502->2351|4555->2376|4584->2377|4634->2399|4875->2612|4904->2613|4957->2638|5091->2744|5120->2745|5149->2746|5610->3179|5639->3180|5696->3209|5857->3342|5886->3343|5939->3368|6081->3482|6110->3483|6160->3505|6216->3533|6245->3534|6282->3544|6364->3598|6393->3599|6442->3620|6599->3749|6628->3750|6664->3759|6718->342|6750->365|6781->409|6809->3773|6842->3780|6880->3809|6920->3811|6957->3820|7071->3906|7110->3935|7151->3937|7201->3958|7691->4428|7732->4460|7773->4462|7819->4479|8315->4943|8362->4962|8395->4985|8436->4987|8486->5008|9070->5564|9166->5638|9196->5639|9228->5643|9328->5721|9358->5722|9390->5726|9417->5731|10105->6391|10136->6412|10177->6414|10243->6451|10307->6495|10346->6524|10386->6525|10444->6554|10507->6597|10553->6633|10593->6634|10655->6667|10719->6711|10733->6716|10773->6717|10831->6746|10909->6792|11160->7015|11196->7041|11237->7043|11299->7076|11341->7090|11357->7096|11418->7135|11618->7307|11634->7313|11698->7355|11910->7539|11926->7545|11993->7590|12208->7777|12224->7783|12296->7832|12480->7996|12494->8001|12534->8002|12596->8035|12699->8110|12731->8120|13039->8400|13071->8410|13393->8704|13425->8714|13754->9015|13786->9025|14025->9232|14083->9261|14922->10072|14983->10116|15024->10118|15082->10147|15152->10189|15167->10194|15197->10202|15280->10257|15296->10263|15366->10310|15398->10313|15414->10318|15448->10329|15520->10373|15588->10431|15629->10433|15696->10541|15762->10601|15828->10647|15894->10684|16057->10819|16072->10824|16110->10840|16180->10881|16236->10909|16251->10914|16284->10925|16387->11009|16401->11014|16441->11015|16507->11052|16553->11070|16568->11075|16598->11083|16628->11084|16742->11166|16805->11201|16844->11230|16885->11232|16951->11269|16997->11287|17012->11292|17042->11300|17072->11301|17180->11381|17195->11386|17231->11400|17297->11437|17356->11477|17370->11482|17410->11483|17476->11520|17522->11538|17537->11543|17567->11551|17597->11552|17714->11637|17776->11670|17926->11792|17981->11837|18021->11838|18091->11879|18233->12001|18247->12005|18287->12006|18357->12047|18508->12166|18570->12199|18668->12265|18722->12290|18972->12512|19008->12538|19049->12540|19115->12578|19141->12594|19182->12596|19252->12637|19649->13015|19663->13020|19703->13021|19773->13062|19836->13097|19852->13103|19914->13142|20114->13314|20130->13320|20202->13369|20370->13505|20436->13543|20477->13574|20518->13576|20588->13617|20874->13871|20940->13909|21028->13979|21070->13981|21140->14022|21173->14027|21199->14043|21240->14045|21314->14090|21361->14105|21400->14116|21416->14122|21478->14161|21510->14164|21534->14165|21613->14212|21679->14250|21746->14307|21787->14309|21857->14350|22143->14604|22209->14642|22248->14671|22289->14673|22359->14714|22756->15092|22770->15097|22810->15098|22880->15139|22943->15174|22959->15180|23031->15229|23234->15404|23250->15410|23338->15475|23503->15608|23557->15642|23604->15679|23644->15680|23710->15718|23736->15734|23777->15736|23847->15777|24244->16155|24258->16160|24298->16161|24368->16202|24431->16237|24447->16243|24519->16292|24719->16464|24735->16470|24817->16529|24985->16665|25051->16703|25092->16734|25133->16736|25203->16777|25484->17026|25550->17064|25638->17134|25680->17136|25750->17177|25783->17182|25809->17198|25850->17200|25924->17245|25971->17260|26010->17271|26026->17277|26098->17326|26130->17329|26154->17330|26233->17377|26299->17415|26366->17472|26407->17474|26477->17515|26758->17764|26824->17802|26863->17831|26904->17833|26974->17874|27371->18252|27385->18257|27425->18258|27495->18299|27558->18334|27574->18340|27656->18399|27859->18574|27875->18580|27973->18655|28138->18788|28192->18822|28206->18826|28246->18827|28308->18861|28334->18877|28375->18879|28441->18916|28822->19278|28836->19283|28876->19284|28942->19321|29074->19425|29100->19429|29133->19434|29165->19444|29506->19757|29535->19764|29569->19770|29595->19774|29628->19779|29661->19789|29905->20001|29967->20035|30008->20066|30049->20068|30115->20105|30392->20350|30454->20384|30542->20454|30584->20456|30650->20493|30683->20498|30709->20514|30750->20516|30820->20557|30867->20572|30971->20648|30994->20649|31026->20653|31052->20657|31085->20662|31117->20672|31191->20718|31214->20719|31284->20760|31396->20840|31458->20874|31525->20931|31566->20933|31632->20970|31909->21215|31971->21249|32010->21278|32051->21280|32117->21317|32498->21679|32512->21684|32552->21685|32618->21722|32746->21822|32775->21829|32809->21835|32835->21839|32868->21844|32901->21854|33246->22171|33273->22176|33307->22182|33338->22191|33374->22198|33401->22202|33435->22207|33468->22217|33705->22422|33771->22456|33829->22485|33930->22567|33944->22572|33984->22573|34034->22594|34114->22642|34160->22659|34429->22900|34503->22957|34544->22959|34602->22988|34696->23054|34752->23093|34793->23095|34855->23129|34903->23167|34944->23169|35010->23207|35036->23223|35077->23225|35147->23266|35225->23316|35241->23322|35303->23361|35335->23364|35359->23365|35426->23412|35440->23416|35480->23417|35550->23458|35620->23500|35636->23506|35698->23545|35730->23548|35754->23549|35833->23596|35899->23630|35961->23660|36019->23689|36082->23720|36136->23745|36686->24267|36760->24324|36801->24326|36859->24355|36953->24421|37009->24460|37050->24462|37112->24496|37160->24534|37201->24536|37267->24574|37293->24590|37334->24592|37404->24633|37482->24683|37498->24689|37570->24738|37602->24741|37626->24742|37693->24789|37707->24793|37747->24794|37817->24835|37887->24877|37903->24883|37975->24932|38007->24935|38031->24936|38110->24983|38176->25017|38238->25047|38296->25076|38359->25107|38413->25132|38963->25654|39037->25711|39078->25713|39136->25742|39230->25808|39286->25847|39327->25849|39389->25883|39437->25921|39478->25923|39544->25961|39570->25977|39611->25979|39681->26020|39784->26094|39808->26095|39847->26105|39880->26115|39914->26120|39938->26121|40005->26168|40019->26172|40059->26173|40129->26214|40224->26280|40248->26281|40287->26291|40320->26301|40354->26306|40378->26307|40457->26354|40523->26388|40585->26418|40643->26447|40706->26478|40760->26503|41092->26804
                  LINES: 35->1|48->12|49->13|50->14|52->16|52->16|54->16|55->17|55->17|55->17|55->17|58->20|58->20|59->21|60->22|60->22|60->22|61->23|61->23|61->23|61->23|62->24|62->24|62->24|65->27|65->27|65->27|68->30|69->31|77->39|77->39|79->41|79->41|81->43|99->61|99->61|101->63|101->63|101->63|103->65|106->68|106->68|107->69|108->70|108->70|108->70|116->78|116->78|117->79|119->81|119->81|120->82|122->84|122->84|124->86|125->87|125->87|127->89|129->91|129->91|130->92|133->95|133->95|134->96|136->11|137->13|137->15|138->97|140->99|140->99|140->99|141->100|144->103|144->103|144->103|145->104|153->112|153->112|153->112|154->113|162->121|164->123|164->123|164->123|165->124|177->136|179->138|179->138|179->138|181->140|181->140|181->140|181->140|191->150|191->150|191->150|192->151|193->152|193->152|193->152|194->153|195->154|195->154|195->154|196->155|197->156|197->156|197->156|198->157|199->158|203->162|203->162|203->162|204->163|204->163|204->163|204->163|206->165|206->165|206->165|208->167|208->167|208->167|210->169|210->169|210->169|212->171|212->171|212->171|213->172|214->173|214->173|219->178|219->178|224->183|224->183|229->188|229->188|233->192|234->193|249->208|249->208|249->208|250->209|251->210|251->210|251->210|253->212|253->212|253->212|253->212|253->212|253->212|255->214|255->214|255->214|256->215|257->216|258->217|259->218|261->220|261->220|261->220|262->221|262->221|262->221|262->221|264->223|264->223|264->223|265->224|265->224|265->224|265->224|265->224|266->225|268->227|268->227|268->227|269->228|269->228|269->228|269->228|269->228|270->229|270->229|270->229|271->230|272->231|272->231|272->231|273->232|273->232|273->232|273->232|273->232|274->233|275->234|283->242|283->242|283->242|284->243|286->245|286->245|286->245|287->246|289->248|290->249|293->252|294->253|301->260|301->260|301->260|302->261|302->261|302->261|303->262|307->266|307->266|307->266|308->267|308->267|308->267|308->267|310->269|310->269|310->269|312->271|313->272|313->272|313->272|314->273|317->276|318->277|318->277|318->277|319->278|319->278|319->278|319->278|320->279|320->279|320->279|320->279|320->279|320->279|320->279|321->280|322->281|322->281|322->281|323->282|326->285|327->286|327->286|327->286|328->287|332->291|332->291|332->291|333->292|333->292|333->292|333->292|335->294|335->294|335->294|337->296|338->297|338->297|338->297|339->298|339->298|339->298|340->299|344->303|344->303|344->303|345->304|345->304|345->304|345->304|347->306|347->306|347->306|349->308|350->309|350->309|350->309|351->310|354->313|355->314|355->314|355->314|356->315|356->315|356->315|356->315|357->316|357->316|357->316|357->316|357->316|357->316|357->316|358->317|359->318|359->318|359->318|360->319|363->322|364->323|364->323|364->323|365->324|369->328|369->328|369->328|370->329|370->329|370->329|370->329|372->331|372->331|372->331|374->333|375->334|375->334|375->334|376->335|376->335|376->335|377->336|381->340|381->340|381->340|382->341|383->342|383->342|383->342|383->342|388->347|388->347|388->347|388->347|388->347|388->347|392->351|393->352|393->352|393->352|394->353|397->356|398->357|398->357|398->357|399->358|399->358|399->358|399->358|400->359|400->359|401->360|401->360|401->360|401->360|401->360|401->360|402->361|402->361|403->362|405->364|406->365|406->365|406->365|407->366|410->369|411->370|411->370|411->370|412->371|416->375|416->375|416->375|417->376|418->377|418->377|418->377|418->377|418->377|418->377|423->382|423->382|423->382|423->382|423->382|423->382|423->382|423->382|427->386|428->387|429->388|432->391|432->391|432->391|433->392|434->393|435->394|440->399|440->399|440->399|441->400|442->401|442->401|442->401|443->402|443->402|443->402|444->403|444->403|444->403|445->404|445->404|445->404|445->404|445->404|445->404|446->405|446->405|446->405|447->406|447->406|447->406|447->406|447->406|447->406|448->407|449->408|450->409|451->410|452->411|453->412|465->424|465->424|465->424|466->425|467->426|467->426|467->426|468->427|468->427|468->427|469->428|469->428|469->428|470->429|470->429|470->429|470->429|470->429|470->429|471->430|471->430|471->430|472->431|472->431|472->431|472->431|472->431|472->431|473->432|474->433|475->434|476->435|477->436|478->437|490->449|490->449|490->449|491->450|492->451|492->451|492->451|493->452|493->452|493->452|494->453|494->453|494->453|495->454|495->454|495->454|495->454|495->454|495->454|495->454|496->455|496->455|496->455|497->456|497->456|497->456|497->456|497->456|497->456|497->456|498->457|499->458|500->459|501->460|502->461|503->462|512->471
                  -- GENERATED --
              */
          