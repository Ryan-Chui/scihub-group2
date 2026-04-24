
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

object projectList extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template14[List[Project],Project,Integer,String,Integer,Integer,Integer,String,Integer,String,String,Long,Integer,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(projects: List[Project],
        projectZone: Project,
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
/*13.6*/import helper._;
/*14.6*/import models._
/*15.2*/import models.Project

def /*17.2*/scripts/*17.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*17.13*/("""
        """),format.raw/*18.9*/("""<script type = "module" src='"""),_display_(/*18.39*/routes/*18.45*/.Assets.at("javascripts/voiceJump.js")),format.raw/*18.83*/("""'></script>
        <script type="text/javascript">

                $(document).ready(function () """),format.raw/*21.47*/("""{"""),format.raw/*21.48*/("""
                    """),format.raw/*22.21*/("""var nasaEndorsedAPIArray = []
                    """),_display_(/*23.22*/for(i <- 0 until projects.size) yield /*23.53*/ {_display_(Seq[Any](format.raw/*23.55*/("""
                    """),format.raw/*24.21*/("""var json = """),format.raw/*24.32*/("""{"""),format.raw/*24.33*/("""}"""),format.raw/*24.34*/(""";
                    json.id = '"""),_display_(/*25.33*/projects/*25.41*/.get(i).getId()),format.raw/*25.56*/("""';
                    json.url = "/project/projectDetail/" + json.id;

                    json.name = '"""),_display_(/*28.35*/projects/*28.43*/.get(i).getTitle),format.raw/*28.59*/("""'.replace(/[^a-zA-Z0-9]/g, " ").replace(/  +/g, " ").trim();
                    console.log("jsonhere:" + json)
                    nasaEndorsedAPIArray.push(json)
                    """)))}),format.raw/*31.22*/("""
                    """),format.raw/*32.21*/("""$("#nasaText").text(JSON.stringify(nasaEndorsedAPIArray));

                    $('.tooltipped').tooltip();

                    // $("#speak-from-filter").click();
                    // $("#speak-nasa").click();
                    // $("#speak-from-filter").click();

                """),format.raw/*40.17*/("""}"""),format.raw/*40.18*/(""");

                function jumpToPage(pageNum, sort, searchString) """),format.raw/*42.66*/("""{"""),format.raw/*42.67*/("""

                    """),format.raw/*44.21*/("""pageNum =  parseInt(pageNum);

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
                """),format.raw/*62.17*/("""}"""),format.raw/*62.18*/("""

                                """),format.raw/*64.33*/("""function string2Map(str) """),format.raw/*64.58*/("""{"""),format.raw/*64.59*/("""

                    """),format.raw/*66.21*/("""var map = new Map();
                    var splitedString = str.replace(new RegExp("],", 'g'), ";");
                    var array = splitedString.split(";");
                    for(var i=0; i<array.length; i++)"""),format.raw/*69.54*/("""{"""),format.raw/*69.55*/("""
                        """),format.raw/*70.25*/("""var idAndEventsString = array[i];
                        idAndEventsString = idAndEventsString.replace(/["""),format.raw/*71.73*/("""{"""),format.raw/*71.74*/("""}"""),format.raw/*71.75*/("""[\]\\]/g, " ");
                        var idAndEvents = idAndEventsString.split("=");
                        var id = idAndEvents[0];
                        var eventsString = idAndEvents[1];
                        var events = eventsString.split(",");
                        console.log("events:" + events + "," + i);

                        var formatedEvents = "";
                        for(var j=0; j<events.length; j++)"""),format.raw/*79.59*/("""{"""),format.raw/*79.60*/("""
                            """),format.raw/*80.29*/("""events[j] = events[j].trim();
                            formatedEvents = formatedEvents + events[j] + ";";
                        """),format.raw/*82.25*/("""}"""),format.raw/*82.26*/("""
                        """),format.raw/*83.25*/("""if(formatedEvents.length > 1)
                            map.set(id.trim(), formatedEvents);
                    """),format.raw/*85.21*/("""}"""),format.raw/*85.22*/("""

                    """),format.raw/*87.21*/("""return map;
                """),format.raw/*88.17*/("""}"""),format.raw/*88.18*/("""

        """),format.raw/*90.9*/("""</script>
        <style>
                .follow-fab """),format.raw/*92.29*/("""{"""),format.raw/*92.30*/("""
                    """),format.raw/*93.21*/("""top: -20px !important;
                    bottom: auto !important;
                    right: -20px !important;
                """),format.raw/*96.17*/("""}"""),format.raw/*96.18*/("""
        """),format.raw/*97.9*/("""</style>
    """)))};
Seq[Any](format.raw/*12.84*/("""
    """),format.raw/*14.1*/("""    """),format.raw/*16.1*/("""
"""),format.raw/*98.6*/("""

    """),_display_(/*100.6*/main("All Projects", scripts)/*100.35*/ {_display_(Seq[Any](format.raw/*100.37*/("""
        """),format.raw/*101.9*/("""<div class="container">
            <div class="card-panel center">

                """),_display_(/*104.18*/if(listType.equals("search"))/*104.47*/ {_display_(Seq[Any](format.raw/*104.49*/("""
                    """),format.raw/*105.21*/("""<div class="row card-panel z-depth-0 project-zone-panel">
                        <div class="col s12" style="margin-top: -10px;
                            margin-bottom: -10px;">
                            <h6 class="center tooltipped" data-position="bottom" data-tooltip="This list shows the search results." >
                                Search Result
                            </h6>
                        </div>
                    </div>
                """)))}/*113.18*/else if(listType.equals("all"))/*113.50*/ {_display_(Seq[Any](format.raw/*113.52*/("""
                """),format.raw/*114.17*/("""<div class="row card-panel z-depth-0 project-zone-panel">
                    <div class="col s12" style="margin-top: -10px;
                        margin-bottom: -10px;">
                        <h6 class="center tooltipped" data-position="bottom" data-tooltip="This list shows all the projects." >
                            List of Projects Registered at SMU-Hub
                        </h6>
                    </div>
                </div>
                """)))}),format.raw/*122.18*/("""

                """),_display_(/*124.18*/if(projects.size() > 0)/*124.41*/ {_display_(Seq[Any](format.raw/*124.43*/("""
                    """),format.raw/*125.21*/("""<div class="col s8 offset-s2">
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
                            <h6 class="left">Showing results: """),_display_(/*137.64*/{
                                offset + 1
                            }),format.raw/*139.30*/(""" """),format.raw/*139.31*/("""to """),_display_(/*139.35*/{
                                offset + count
                            }),format.raw/*141.30*/(""" """),format.raw/*141.31*/("""of """),_display_(/*141.35*/total),format.raw/*141.40*/("""</h6>
                        </div>
                        <div class="col s6" style="padding-top: -5px;
                            margin-top: -2px">
                            <a class='dropdown-trigger btn-flat right' href='#' data-target='dropdown2' style="text-transform: none;
                                font-weight: bold;
                                color: black;
                                font-family: AmazonEmberBold, Helvetica Neue Bold, Helvetica Neue, Helvetica, Arial, sans-serif;
                            !important; ">
                                Sort By: &nbsp; <font color="#3a5dc3">
                                """),_display_(/*151.34*/if(sort.equals("id"))/*151.55*/ {_display_(Seq[Any](format.raw/*151.57*/("""
                                    """),format.raw/*152.37*/("""Project ID
                                """)))}/*153.34*/else if(sort.equals("title"))/*153.63*/{_display_(Seq[Any](format.raw/*153.64*/("""
                            """),format.raw/*154.29*/("""Project Title
                            """)))}/*155.30*/else if(sort.equals("access_times"))/*155.66*/{_display_(Seq[Any](format.raw/*155.67*/("""
                                """),format.raw/*156.33*/("""Popularity
                                """)))}/*157.34*/else/*157.39*/{_display_(Seq[Any](format.raw/*157.40*/("""
                            """),format.raw/*158.29*/("""Project Location
                            """)))}),format.raw/*159.30*/("""</font> <i class="material-icons right">expand_more</i></a>

                                <!-- Dropdown Structure -->
                            <ul id='dropdown2' class='dropdown-content'>
                            """),_display_(/*163.30*/if(listType.equals("all"))/*163.56*/ {_display_(Seq[Any](format.raw/*163.58*/("""
                                """),format.raw/*164.33*/("""<li><a href=""""),_display_(/*164.47*/routes/*164.53*/.ProjectController.projectList(1, "id")),format.raw/*164.92*/("""" class="grey-text text-darken-4"><i class="material-icons">
                                    event</i>Project ID</a></li>
                                <li><a href=""""),_display_(/*166.47*/routes/*166.53*/.ProjectController.projectList(1, "title")),format.raw/*166.95*/("""" class="grey-text text-darken-4"><i class="material-icons">
                                    sort_by_alpha</i>Project Title </a></li>
                                <li><a href=""""),_display_(/*168.47*/routes/*168.53*/.ProjectController.projectList(1, "location")),format.raw/*168.98*/("""" class="grey-text text-darken-4"><i class="material-icons">
                                    sort_by_alpha</i>Project Location </a></li>
                                <li><a href=""""),_display_(/*170.47*/routes/*170.53*/.ProjectController.projectList(1, "access_times")),format.raw/*170.102*/("""" class="grey-text text-darken-4"><i class="material-icons">
                                    sort_by_alpha</i>Popularity </a></li>
                            """)))}/*172.30*/else/*172.35*/{_display_(Seq[Any](format.raw/*172.36*/("""
                                """),format.raw/*173.33*/("""<li>
                                    <a onclick="jumpToPage(1, 'id', '"""),_display_(/*174.71*/searchBody),format.raw/*174.81*/("""')">
                                        <i class="material-icons">event</i>Project ID
                                    </a>
                                </li>
                                <li>
                                    <a onclick="jumpToPage(1, 'title', '"""),_display_(/*179.74*/searchBody),format.raw/*179.84*/("""')">
                                        <i class="material-icons">sort_by_alpha</i>Project Title
                                    </a>
                                </li>
                                <li>
                                    <a onclick="jumpToPage(1, 'location', '"""),_display_(/*184.77*/searchBody),format.raw/*184.87*/("""')">
                                        <i class="material-icons">sort_by_alpha</i>Project Location
                                    </a>
                                </li>
                                <li>
                                    <a onclick="jumpToPage(1, 'access_times', '"""),_display_(/*189.81*/searchBody),format.raw/*189.91*/("""')">
                                        <i class="material-icons">sort_by_alpha</i>Popularity
                                    </a>
                                </li>
                            """)))}),format.raw/*193.30*/("""
                            """),format.raw/*194.29*/("""</ul>
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
                        """),_display_(/*209.26*/for((entry, index) <- projects.zipWithIndex) yield /*209.70*/ {_display_(Seq[Any](format.raw/*209.72*/("""
                            """),format.raw/*210.29*/("""<tr>
                                <td>"""),_display_(/*211.38*/entry/*211.43*/.getId()),format.raw/*211.51*/("""</td>

                                <td><a href = """"),_display_(/*213.49*/routes/*213.55*/.ProjectController.projectDetail(entry.getId())),format.raw/*213.102*/("""">"""),_display_(/*213.105*/entry/*213.110*/.getTitle()),format.raw/*213.121*/("""</a></td>

                                """),_display_(/*215.34*/if((entry.getGoals() != null) && (entry.getGoals() != ""))/*215.92*/ {_display_(Seq[Any](format.raw/*215.94*/("""
                                    """),format.raw/*216.108*/("""
                                    """),format.raw/*217.60*/("""
                                    """),format.raw/*218.46*/("""
                                    """),format.raw/*219.37*/("""<td>
                                        <span class="tooltiptext"> """),_display_(/*220.69*/entry/*220.74*/.getGoals()),format.raw/*220.85*/("""</span>

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

                                """),format.raw/*235.33*/("""<td>
                                    """),_display_(/*236.38*/if(entry.getAuthentication.equals("private"))/*236.83*/{_display_(Seq[Any](format.raw/*236.84*/("""
                                        """),format.raw/*237.41*/("""<i class="material-icons">
                                            lock_open</i>
                                    """)))}/*239.38*/else/*239.42*/{_display_(Seq[Any](format.raw/*239.43*/("""
                                        """),format.raw/*240.41*/("""<i class="material-icons">
                                            public</i>
                                    """)))}),format.raw/*242.38*/("""
                                """),format.raw/*243.33*/("""</td>

                            </tr>
                        """)))}),format.raw/*246.26*/("""
                        """),format.raw/*247.25*/("""</tbody>
                    </table>

                    <div class="row">
                        <div class="col s12">
                            <ul class="pagination center-align">

                                """),_display_(/*254.34*/if(listType.equals("all"))/*254.60*/ {_display_(Seq[Any](format.raw/*254.62*/("""
                                    """),_display_(/*255.38*/if(pageNum == 1)/*255.54*/ {_display_(Seq[Any](format.raw/*255.56*/("""
                                        """),format.raw/*256.41*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                            first_page</i></li>
                                        <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                            chevron_left</i></li>
                                    """)))}/*260.39*/else/*260.44*/{_display_(Seq[Any](format.raw/*260.45*/("""
                                        """),format.raw/*261.41*/("""<li class="waves-effect"><a href=""""),_display_(/*261.76*/routes/*261.82*/.ProjectController.projectList(1, sort)),format.raw/*261.121*/(""""><i class="material-icons">
                                            first_page</i></a></li>
                                        <li class="waves-effect"><a href=""""),_display_(/*263.76*/routes/*263.82*/.ProjectController.projectList(pageNum - 1, sort)),format.raw/*263.131*/(""""><i class="material-icons">
                                            chevron_left</i></a></li>
                                    """)))}),format.raw/*265.38*/("""
                                    """),_display_(/*266.38*/if(beginIndexForPagination > 1)/*266.69*/ {_display_(Seq[Any](format.raw/*266.71*/("""
                                        """),format.raw/*267.41*/("""<li class="waves-effect modal-trigger" href="#allPageModal" style="cursor: pointer;
                                            font-size: 20px;
                                            font-weight: bold">...</li>
                                    """)))}),format.raw/*270.38*/("""
                                    """),_display_(/*271.38*/for(i <- (beginIndexForPagination + 0) to (endIndexForPagination + 0)) yield /*271.108*/ {_display_(Seq[Any](format.raw/*271.110*/("""
                                        """),format.raw/*272.41*/("""<li """),_display_(/*272.46*/if(pageNum == i)/*272.62*/ {_display_(Seq[Any](format.raw/*272.64*/("""
                                            """),format.raw/*273.45*/("""class="active"""")))}),format.raw/*273.60*/("""><a href=""""),_display_(/*273.71*/routes/*273.77*/.ProjectController.projectList(i, sort)),format.raw/*273.116*/("""">"""),_display_(/*273.119*/i),format.raw/*273.120*/("""</a></li>
                                    """)))}),format.raw/*274.38*/("""
                                    """),_display_(/*275.38*/if(endIndexForPagination < ((total - 1) / pageLimit + 1))/*275.95*/ {_display_(Seq[Any](format.raw/*275.97*/("""
                                        """),format.raw/*276.41*/("""<li class="waves-effect modal-trigger" href="#allPageModal" style="cursor: pointer;
                                            font-size: 20px;
                                            font-weight: bold">...</li>
                                    """)))}),format.raw/*279.38*/("""
                                    """),_display_(/*280.38*/if((offset + count) >= total)/*280.67*/ {_display_(Seq[Any](format.raw/*280.69*/("""
                                        """),format.raw/*281.41*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                            chevron_right</i></li>
                                        <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                            last_page</i></li>
                                    """)))}/*285.39*/else/*285.44*/{_display_(Seq[Any](format.raw/*285.45*/("""
                                        """),format.raw/*286.41*/("""<li class="waves-effect"><a href=""""),_display_(/*286.76*/routes/*286.82*/.ProjectController.projectList(pageNum + 1, sort)),format.raw/*286.131*/(""""><i class="material-icons">
                                            chevron_right</i></a></li>
                                        <li class="waves-effect"><a href=""""),_display_(/*288.76*/routes/*288.82*/.ProjectController.projectList((total - 1) / pageLimit + 1, sort)),format.raw/*288.147*/(""""><i class="material-icons">
                                            last_page</i></a></li>
                                    """)))}),format.raw/*290.38*/("""
                                """)))}/*291.34*/else if(listType.equals("my enroll"))/*291.71*/{_display_(Seq[Any](format.raw/*291.72*/("""
                                    """),_display_(/*292.38*/if(pageNum == 1)/*292.54*/ {_display_(Seq[Any](format.raw/*292.56*/("""
                                        """),format.raw/*293.41*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                            first_page</i></li>
                                        <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                            chevron_left</i></li>
                                    """)))}/*297.39*/else/*297.44*/{_display_(Seq[Any](format.raw/*297.45*/("""
                                        """),format.raw/*298.41*/("""<li class="waves-effect"><a href=""""),_display_(/*298.76*/routes/*298.82*/.ProjectController.getMyEnrolledProjects(1, sort)),format.raw/*298.131*/(""""><i class="material-icons">
                                            first_page</i></a></li>
                                        <li class="waves-effect"><a href=""""),_display_(/*300.76*/routes/*300.82*/.ProjectController.getMyEnrolledProjects(pageNum - 1, sort)),format.raw/*300.141*/(""""><i class="material-icons">
                                            chevron_left</i></a></li>
                                    """)))}),format.raw/*302.38*/("""
                                    """),_display_(/*303.38*/if(beginIndexForPagination > 1)/*303.69*/ {_display_(Seq[Any](format.raw/*303.71*/("""
                                        """),format.raw/*304.41*/("""<li class="waves-effect modal-trigger" href="#enrollPageModal" style="cursor: pointer;
                                        font-size: 20px;
                                        font-weight: bold">...</li>
                                    """)))}),format.raw/*307.38*/("""
                                    """),_display_(/*308.38*/for(i <- (beginIndexForPagination + 0) to (endIndexForPagination + 0)) yield /*308.108*/ {_display_(Seq[Any](format.raw/*308.110*/("""
                                        """),format.raw/*309.41*/("""<li """),_display_(/*309.46*/if(pageNum == i)/*309.62*/ {_display_(Seq[Any](format.raw/*309.64*/("""
                                            """),format.raw/*310.45*/("""class="active"""")))}),format.raw/*310.60*/("""><a href=""""),_display_(/*310.71*/routes/*310.77*/.ProjectController.getMyEnrolledProjects(i, sort)),format.raw/*310.126*/("""">"""),_display_(/*310.129*/i),format.raw/*310.130*/("""</a></li>
                                    """)))}),format.raw/*311.38*/("""
                                    """),_display_(/*312.38*/if(endIndexForPagination < ((total - 1) / pageLimit + 1))/*312.95*/ {_display_(Seq[Any](format.raw/*312.97*/("""
                                        """),format.raw/*313.41*/("""<li class="waves-effect modal-trigger" href="#enrollPageModal" style="cursor: pointer;
                                        font-size: 20px;
                                        font-weight: bold">...</li>
                                    """)))}),format.raw/*316.38*/("""
                                    """),_display_(/*317.38*/if((offset + count) >= total)/*317.67*/ {_display_(Seq[Any](format.raw/*317.69*/("""
                                        """),format.raw/*318.41*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                            chevron_right</i></li>
                                        <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                            last_page</i></li>
                                    """)))}/*322.39*/else/*322.44*/{_display_(Seq[Any](format.raw/*322.45*/("""
                                        """),format.raw/*323.41*/("""<li class="waves-effect"><a href=""""),_display_(/*323.76*/routes/*323.82*/.ProjectController.getMyEnrolledProjects(pageNum + 1, sort)),format.raw/*323.141*/(""""><i class="material-icons">
                                            chevron_right</i></a></li>
                                        <li class="waves-effect"><a href=""""),_display_(/*325.76*/routes/*325.82*/.ProjectController.getMyEnrolledProjects((total - 1) / pageLimit + 1, sort)),format.raw/*325.157*/(""""><i class="material-icons">
                                            last_page</i></a></li>
                                    """)))}),format.raw/*327.38*/("""
                                """)))}/*328.34*/else/*328.38*/{_display_(Seq[Any](format.raw/*328.39*/("""
                                """),_display_(/*329.34*/if(pageNum == 1)/*329.50*/ {_display_(Seq[Any](format.raw/*329.52*/("""
                                    """),format.raw/*330.37*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                        first_page</i></li>
                                    <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                        chevron_left</i></li>
                                """)))}/*334.35*/else/*334.40*/{_display_(Seq[Any](format.raw/*334.41*/("""
                                    """),format.raw/*335.37*/("""<li class="waves-effect">
                                        <a href="#!" onclick="jumpToPage(1, '"""),_display_(/*336.79*/sort),format.raw/*336.83*/("""', '"""),_display_(/*336.88*/searchBody),format.raw/*336.98*/("""')">
                                            <i class="material-icons">first_page</i>
                                        </a>
                                    </li>
                                    <li class="waves-effect">
                                        <a href="#!" onclick="jumpToPage("""),_display_(/*341.75*/pageNum),format.raw/*341.82*/("""-1, '"""),_display_(/*341.88*/sort),format.raw/*341.92*/("""', '"""),_display_(/*341.97*/searchBody),format.raw/*341.107*/("""')">
                                            <i class="material-icons">chevron_left</i>
                                        </a>
                                    </li>
                                """)))}),format.raw/*345.34*/("""
                                """),_display_(/*346.34*/if(beginIndexForPagination > 1)/*346.65*/ {_display_(Seq[Any](format.raw/*346.67*/("""
                                    """),format.raw/*347.37*/("""<li class="waves-effect modal-trigger" href="#searchPageModal" style="cursor: pointer;
                                        font-size: 20px;
                                        font-weight: bold">...</li>
                                """)))}),format.raw/*350.34*/("""
                                """),_display_(/*351.34*/for(i <- (beginIndexForPagination + 0) to (endIndexForPagination + 0)) yield /*351.104*/ {_display_(Seq[Any](format.raw/*351.106*/("""
                                    """),format.raw/*352.37*/("""<li """),_display_(/*352.42*/if(pageNum == i)/*352.58*/ {_display_(Seq[Any](format.raw/*352.60*/("""
                                        """),format.raw/*353.41*/("""class="active"""")))}),format.raw/*353.56*/(""">
                                        <a href="#!" onclick="jumpToPage("""),_display_(/*354.75*/i),format.raw/*354.76*/(""", '"""),_display_(/*354.80*/sort),format.raw/*354.84*/("""', '"""),_display_(/*354.89*/searchBody),format.raw/*354.99*/("""')">
                                        """),_display_(/*355.42*/i),format.raw/*355.43*/("""
                                        """),format.raw/*356.41*/("""</a>
                                    </li>
                                """)))}),format.raw/*358.34*/("""
                                """),_display_(/*359.34*/if(endIndexForPagination < ((total - 1) / pageLimit + 1))/*359.91*/ {_display_(Seq[Any](format.raw/*359.93*/("""
                                    """),format.raw/*360.37*/("""<li class="waves-effect modal-trigger" href="#searchPageModal" style="cursor: pointer;
                                        font-size: 20px;
                                        font-weight: bold">...</li>
                                """)))}),format.raw/*363.34*/("""
                                """),_display_(/*364.34*/if((offset + count) >= total)/*364.63*/ {_display_(Seq[Any](format.raw/*364.65*/("""
                                    """),format.raw/*365.37*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                        chevron_right</i></li>
                                    <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                        last_page</i></li>
                                """)))}/*369.35*/else/*369.40*/{_display_(Seq[Any](format.raw/*369.41*/("""
                                    """),format.raw/*370.37*/("""<li class="waves-effect">
                                        <a href="#!" onclick="jumpToPage("""),_display_(/*371.75*/pageNum),format.raw/*371.82*/("""+1, '"""),_display_(/*371.88*/sort),format.raw/*371.92*/("""', '"""),_display_(/*371.97*/searchBody),format.raw/*371.107*/("""')">
                                            <i class="material-icons">chevron_right</i>
                                        </a>
                                    </li>
                                    <li class="waves-effect">
                                        <a href="#!" onclick="jumpToPage(("""),_display_(/*376.76*/total),format.raw/*376.81*/("""-1)/("""),_display_(/*376.87*/pageLimit),format.raw/*376.96*/(""")+1, '"""),_display_(/*376.103*/sort),format.raw/*376.107*/("""', '"""),_display_(/*376.112*/searchBody),format.raw/*376.122*/("""')">
                                        <i class="material-icons">last_page</i>
                                        </a>
                                    </li>
                                """)))}),format.raw/*380.34*/("""
                                """)))}),format.raw/*381.34*/("""
                            """),format.raw/*382.29*/("""</ul>
                        </div>
                    </div>
                """)))}/*385.19*/else/*385.24*/{_display_(Seq[Any](format.raw/*385.25*/("""
                    """),format.raw/*386.21*/("""<h5>No project was found.</h5>
                """)))}),format.raw/*387.18*/("""
                """),format.raw/*388.17*/("""<div id="allPageModal" class="modal">
                    <div class="modal-content">
                        <h6>Select the page number you want to jump to</h6>
                        <div class="card z-depth-0">

                        """),_display_(/*393.26*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*393.83*/ {_display_(Seq[Any](format.raw/*393.85*/("""
                            """),format.raw/*394.29*/("""<ul class="pagination center-align">
                            """),_display_(/*395.30*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*395.69*/ {_display_(Seq[Any](format.raw/*395.71*/("""
                                """),_display_(/*396.34*/if(j <= ((total - 1)/(pageLimit) + 1))/*396.72*/ {_display_(Seq[Any](format.raw/*396.74*/("""
                                    """),_display_(/*397.38*/if(j != pageNum)/*397.54*/ {_display_(Seq[Any](format.raw/*397.56*/("""
                                        """),format.raw/*398.41*/("""<li class="waves-effect grey lighten-3"><a href='"""),_display_(/*398.91*/routes/*398.97*/.ProjectController.projectList(j, sort)),format.raw/*398.136*/("""'>"""),_display_(/*398.139*/j),format.raw/*398.140*/("""</a></li>
                                    """)))}/*399.38*/else/*399.42*/{_display_(Seq[Any](format.raw/*399.43*/("""
                                        """),format.raw/*400.41*/("""<li class="waves-effect active"><a href=""""),_display_(/*400.83*/routes/*400.89*/.ProjectController.projectList(j, sort)),format.raw/*400.128*/("""">"""),_display_(/*400.131*/j),format.raw/*400.132*/("""</a></li>
                                    """)))}),format.raw/*401.38*/("""
                                """)))}),format.raw/*402.34*/("""
                            """)))}),format.raw/*403.30*/("""
                            """),format.raw/*404.29*/("""</ul>
                        """)))}),format.raw/*405.26*/("""
                        """),format.raw/*406.25*/("""</div>
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

                        """),_display_(/*418.26*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*418.83*/ {_display_(Seq[Any](format.raw/*418.85*/("""
                            """),format.raw/*419.29*/("""<ul class="pagination center-align">
                            """),_display_(/*420.30*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*420.69*/ {_display_(Seq[Any](format.raw/*420.71*/("""
                                """),_display_(/*421.34*/if(j <= ((total - 1)/(pageLimit) + 1))/*421.72*/ {_display_(Seq[Any](format.raw/*421.74*/("""
                                    """),_display_(/*422.38*/if(j != pageNum)/*422.54*/ {_display_(Seq[Any](format.raw/*422.56*/("""
                                        """),format.raw/*423.41*/("""<li class="waves-effect grey lighten-3"><a href='"""),_display_(/*423.91*/routes/*423.97*/.ProjectController.getMyEnrolledProjects(j, sort)),format.raw/*423.146*/("""'>"""),_display_(/*423.149*/j),format.raw/*423.150*/("""</a></li>
                                    """)))}/*424.38*/else/*424.42*/{_display_(Seq[Any](format.raw/*424.43*/("""
                                        """),format.raw/*425.41*/("""<li class="waves-effect active"><a href=""""),_display_(/*425.83*/routes/*425.89*/.ProjectController.getMyEnrolledProjects(j, sort)),format.raw/*425.138*/("""">"""),_display_(/*425.141*/j),format.raw/*425.142*/("""</a></li>
                                    """)))}),format.raw/*426.38*/("""
                                """)))}),format.raw/*427.34*/("""
                            """)))}),format.raw/*428.30*/("""
                            """),format.raw/*429.29*/("""</ul>
                        """)))}),format.raw/*430.26*/("""
                        """),format.raw/*431.25*/("""</div>
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

                        """),_display_(/*443.26*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*443.83*/ {_display_(Seq[Any](format.raw/*443.85*/("""
                            """),format.raw/*444.29*/("""<ul class="pagination center-align">
                            """),_display_(/*445.30*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*445.69*/ {_display_(Seq[Any](format.raw/*445.71*/("""
                                """),_display_(/*446.34*/if(j <= ((total - 1)/(pageLimit) + 1))/*446.72*/ {_display_(Seq[Any](format.raw/*446.74*/("""
                                    """),_display_(/*447.38*/if(j != pageNum)/*447.54*/ {_display_(Seq[Any](format.raw/*447.56*/("""
                                        """),format.raw/*448.41*/("""<li class="waves-effect grey lighten-3"><a href='#!' onclick="jumpToPage("""),_display_(/*448.115*/j),format.raw/*448.116*/(""", 'id', '"""),_display_(/*448.126*/searchBody),format.raw/*448.136*/("""')">"""),_display_(/*448.141*/j),format.raw/*448.142*/("""</a></li>
                                    """)))}/*449.38*/else/*449.42*/{_display_(Seq[Any](format.raw/*449.43*/("""
                                        """),format.raw/*450.41*/("""<li class="waves-effect active"><a href="#!" onclick="jumpToPage("""),_display_(/*450.107*/j),format.raw/*450.108*/(""", 'id', '"""),_display_(/*450.118*/searchBody),format.raw/*450.128*/("""')">"""),_display_(/*450.133*/j),format.raw/*450.134*/("""</a></li>
                                    """)))}),format.raw/*451.38*/("""
                                """)))}),format.raw/*452.34*/("""
                            """)))}),format.raw/*453.30*/("""
                            """),format.raw/*454.29*/("""</ul>
                        """)))}),format.raw/*455.26*/("""
                        """),format.raw/*456.25*/("""</div>
                    </div>
                    <div class="modal-footer">
                        <a href="#!" class="modal-close waves-effect waves-green btn-flat">
                            Cancel</a>
                    </div>
                </div>
            </div>
        </div>
    """)))}),format.raw/*465.6*/("""

"""))
      }
    }
  }

  def render(projects:List[Project],projectZone:Project,pageNum:Integer,sort:String,offset:Integer,total:Integer,count:Integer,listType:String,pageLimit:Integer,searchBody:String,userName:String,id:Long,beginIndexForPagination:Integer,endIndexForPagination:Integer): play.twirl.api.HtmlFormat.Appendable = apply(projects,projectZone,pageNum,sort,offset,total,count,listType,pageLimit,searchBody,userName,id,beginIndexForPagination,endIndexForPagination)

  def f:((List[Project],Project,Integer,String,Integer,Integer,Integer,String,Integer,String,String,Long,Integer,Integer) => play.twirl.api.HtmlFormat.Appendable) = (projects,projectZone,pageNum,sort,offset,total,count,listType,pageLimit,searchBody,userName,id,beginIndexForPagination,endIndexForPagination) => apply(projects,projectZone,pageNum,sort,offset,total,count,listType,pageLimit,searchBody,userName,id,beginIndexForPagination,endIndexForPagination)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:34 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/projectList.scala.html
                  HASH: adba2f761c20a5494942e2911e305d99ca0246fa
                  MATRIX: 1222->1|1664->375|1689->397|1713->414|1748->438|1763->445|1844->449|1880->458|1937->488|1952->494|2011->532|2138->631|2167->632|2216->653|2294->704|2341->735|2381->737|2430->758|2469->769|2498->770|2527->771|2588->805|2605->813|2641->828|2774->934|2791->942|2828->958|3045->1144|3094->1165|3409->1452|3438->1453|3535->1522|3564->1523|3614->1545|4440->2343|4469->2344|4531->2378|4584->2403|4613->2404|4663->2426|4904->2639|4933->2640|4986->2665|5120->2771|5149->2772|5178->2773|5639->3206|5668->3207|5725->3236|5886->3369|5915->3370|5968->3395|6110->3509|6139->3510|6189->3532|6245->3560|6274->3561|6311->3571|6393->3625|6422->3626|6471->3647|6628->3776|6657->3777|6693->3786|6747->369|6779->392|6810->436|6838->3800|6872->3807|6911->3836|6952->3838|6989->3847|7103->3933|7142->3962|7183->3964|7233->3985|7723->4455|7764->4487|7805->4489|7851->4506|8348->4971|8395->4990|8428->5013|8469->5015|8519->5036|9103->5592|9199->5666|9229->5667|9261->5671|9361->5749|9391->5750|9423->5754|9450->5759|10138->6419|10169->6440|10210->6442|10276->6479|10340->6523|10379->6552|10419->6553|10477->6582|10540->6625|10586->6661|10626->6662|10688->6695|10752->6739|10766->6744|10806->6745|10864->6774|10942->6820|11193->7043|11229->7069|11270->7071|11332->7104|11374->7118|11390->7124|11451->7163|11651->7335|11667->7341|11731->7383|11943->7567|11959->7573|12026->7618|12241->7805|12257->7811|12329->7860|12513->8024|12527->8029|12567->8030|12629->8063|12732->8138|12764->8148|13072->8428|13104->8438|13426->8732|13458->8742|13787->9043|13819->9053|14058->9260|14116->9289|14955->10100|15016->10144|15057->10146|15115->10175|15185->10217|15200->10222|15230->10230|15313->10285|15329->10291|15399->10338|15431->10341|15447->10346|15481->10357|15553->10401|15621->10459|15662->10461|15729->10569|15795->10629|15861->10675|15927->10712|16028->10785|16043->10790|16076->10801|16180->10886|16194->10891|16234->10892|16300->10929|16346->10947|16361->10952|16391->10960|16421->10961|16535->11043|16598->11078|16637->11107|16678->11109|16744->11146|16790->11164|16805->11169|16835->11177|16865->11178|16973->11258|16988->11263|17024->11277|17090->11314|17149->11354|17163->11359|17203->11360|17269->11397|17315->11415|17330->11420|17360->11428|17390->11429|17507->11514|17570->11548|17640->11590|17695->11635|17735->11636|17805->11677|17947->11799|17961->11803|18001->11804|18071->11845|18222->11964|18284->11997|18382->12063|18436->12088|18686->12310|18722->12336|18763->12338|18829->12376|18855->12392|18896->12394|18966->12435|19363->12813|19377->12818|19417->12819|19487->12860|19550->12895|19566->12901|19628->12940|19828->13112|19844->13118|19916->13167|20084->13303|20150->13341|20191->13372|20232->13374|20302->13415|20588->13669|20654->13707|20742->13777|20784->13779|20854->13820|20887->13825|20913->13841|20954->13843|21028->13888|21075->13903|21114->13914|21130->13920|21192->13959|21224->13962|21248->13963|21327->14010|21393->14048|21460->14105|21501->14107|21571->14148|21857->14402|21923->14440|21962->14469|22003->14471|22073->14512|22470->14890|22484->14895|22524->14896|22594->14937|22657->14972|22673->14978|22745->15027|22948->15202|22964->15208|23052->15273|23217->15406|23271->15440|23318->15477|23358->15478|23424->15516|23450->15532|23491->15534|23561->15575|23958->15953|23972->15958|24012->15959|24082->16000|24145->16035|24161->16041|24233->16090|24433->16262|24449->16268|24531->16327|24699->16463|24765->16501|24806->16532|24847->16534|24917->16575|25198->16824|25264->16862|25352->16932|25394->16934|25464->16975|25497->16980|25523->16996|25564->16998|25638->17043|25685->17058|25724->17069|25740->17075|25812->17124|25844->17127|25868->17128|25947->17175|26013->17213|26080->17270|26121->17272|26191->17313|26472->17562|26538->17600|26577->17629|26618->17631|26688->17672|27085->18050|27099->18055|27139->18056|27209->18097|27272->18132|27288->18138|27370->18197|27573->18372|27589->18378|27687->18453|27852->18586|27906->18620|27920->18624|27960->18625|28022->18659|28048->18675|28089->18677|28155->18714|28536->19076|28550->19081|28590->19082|28656->19119|28788->19223|28814->19227|28847->19232|28879->19242|29220->19555|29249->19562|29283->19568|29309->19572|29342->19577|29375->19587|29619->19799|29681->19833|29722->19864|29763->19866|29829->19903|30106->20148|30168->20182|30256->20252|30298->20254|30364->20291|30397->20296|30423->20312|30464->20314|30534->20355|30581->20370|30685->20446|30708->20447|30740->20451|30766->20455|30799->20460|30831->20470|30905->20516|30928->20517|30998->20558|31110->20638|31172->20672|31239->20729|31280->20731|31346->20768|31623->21013|31685->21047|31724->21076|31765->21078|31831->21115|32212->21477|32226->21482|32266->21483|32332->21520|32460->21620|32489->21627|32523->21633|32549->21637|32582->21642|32615->21652|32960->21969|32987->21974|33021->21980|33052->21989|33088->21996|33115->22000|33149->22005|33182->22015|33419->22220|33485->22254|33543->22283|33644->22365|33658->22370|33698->22371|33748->22392|33828->22440|33874->22457|34143->22698|34217->22755|34258->22757|34316->22786|34410->22852|34466->22891|34507->22893|34569->22927|34617->22965|34658->22967|34724->23005|34750->23021|34791->23023|34861->23064|34939->23114|34955->23120|35017->23159|35049->23162|35073->23163|35140->23210|35154->23214|35194->23215|35264->23256|35334->23298|35350->23304|35412->23343|35444->23346|35468->23347|35547->23394|35613->23428|35675->23458|35733->23487|35796->23518|35850->23543|36400->24065|36474->24122|36515->24124|36573->24153|36667->24219|36723->24258|36764->24260|36826->24294|36874->24332|36915->24334|36981->24372|37007->24388|37048->24390|37118->24431|37196->24481|37212->24487|37284->24536|37316->24539|37340->24540|37407->24587|37421->24591|37461->24592|37531->24633|37601->24675|37617->24681|37689->24730|37721->24733|37745->24734|37824->24781|37890->24815|37952->24845|38010->24874|38073->24905|38127->24930|38677->25452|38751->25509|38792->25511|38850->25540|38944->25606|39000->25645|39041->25647|39103->25681|39151->25719|39192->25721|39258->25759|39284->25775|39325->25777|39395->25818|39498->25892|39522->25893|39561->25903|39594->25913|39628->25918|39652->25919|39719->25966|39733->25970|39773->25971|39843->26012|39938->26078|39962->26079|40001->26089|40034->26099|40068->26104|40092->26105|40171->26152|40237->26186|40299->26216|40357->26245|40420->26276|40474->26301|40806->26602
                  LINES: 35->1|49->13|50->14|51->15|53->17|53->17|55->17|56->18|56->18|56->18|56->18|59->21|59->21|60->22|61->23|61->23|61->23|62->24|62->24|62->24|62->24|63->25|63->25|63->25|66->28|66->28|66->28|69->31|70->32|78->40|78->40|80->42|80->42|82->44|100->62|100->62|102->64|102->64|102->64|104->66|107->69|107->69|108->70|109->71|109->71|109->71|117->79|117->79|118->80|120->82|120->82|121->83|123->85|123->85|125->87|126->88|126->88|128->90|130->92|130->92|131->93|134->96|134->96|135->97|137->12|138->14|138->16|139->98|141->100|141->100|141->100|142->101|145->104|145->104|145->104|146->105|154->113|154->113|154->113|155->114|163->122|165->124|165->124|165->124|166->125|178->137|180->139|180->139|180->139|182->141|182->141|182->141|182->141|192->151|192->151|192->151|193->152|194->153|194->153|194->153|195->154|196->155|196->155|196->155|197->156|198->157|198->157|198->157|199->158|200->159|204->163|204->163|204->163|205->164|205->164|205->164|205->164|207->166|207->166|207->166|209->168|209->168|209->168|211->170|211->170|211->170|213->172|213->172|213->172|214->173|215->174|215->174|220->179|220->179|225->184|225->184|230->189|230->189|234->193|235->194|250->209|250->209|250->209|251->210|252->211|252->211|252->211|254->213|254->213|254->213|254->213|254->213|254->213|256->215|256->215|256->215|257->216|258->217|259->218|260->219|261->220|261->220|261->220|264->223|264->223|264->223|265->224|265->224|265->224|265->224|265->224|266->225|268->227|268->227|268->227|269->228|269->228|269->228|269->228|269->228|270->229|270->229|270->229|271->230|272->231|272->231|272->231|273->232|273->232|273->232|273->232|273->232|274->233|276->235|277->236|277->236|277->236|278->237|280->239|280->239|280->239|281->240|283->242|284->243|287->246|288->247|295->254|295->254|295->254|296->255|296->255|296->255|297->256|301->260|301->260|301->260|302->261|302->261|302->261|302->261|304->263|304->263|304->263|306->265|307->266|307->266|307->266|308->267|311->270|312->271|312->271|312->271|313->272|313->272|313->272|313->272|314->273|314->273|314->273|314->273|314->273|314->273|314->273|315->274|316->275|316->275|316->275|317->276|320->279|321->280|321->280|321->280|322->281|326->285|326->285|326->285|327->286|327->286|327->286|327->286|329->288|329->288|329->288|331->290|332->291|332->291|332->291|333->292|333->292|333->292|334->293|338->297|338->297|338->297|339->298|339->298|339->298|339->298|341->300|341->300|341->300|343->302|344->303|344->303|344->303|345->304|348->307|349->308|349->308|349->308|350->309|350->309|350->309|350->309|351->310|351->310|351->310|351->310|351->310|351->310|351->310|352->311|353->312|353->312|353->312|354->313|357->316|358->317|358->317|358->317|359->318|363->322|363->322|363->322|364->323|364->323|364->323|364->323|366->325|366->325|366->325|368->327|369->328|369->328|369->328|370->329|370->329|370->329|371->330|375->334|375->334|375->334|376->335|377->336|377->336|377->336|377->336|382->341|382->341|382->341|382->341|382->341|382->341|386->345|387->346|387->346|387->346|388->347|391->350|392->351|392->351|392->351|393->352|393->352|393->352|393->352|394->353|394->353|395->354|395->354|395->354|395->354|395->354|395->354|396->355|396->355|397->356|399->358|400->359|400->359|400->359|401->360|404->363|405->364|405->364|405->364|406->365|410->369|410->369|410->369|411->370|412->371|412->371|412->371|412->371|412->371|412->371|417->376|417->376|417->376|417->376|417->376|417->376|417->376|417->376|421->380|422->381|423->382|426->385|426->385|426->385|427->386|428->387|429->388|434->393|434->393|434->393|435->394|436->395|436->395|436->395|437->396|437->396|437->396|438->397|438->397|438->397|439->398|439->398|439->398|439->398|439->398|439->398|440->399|440->399|440->399|441->400|441->400|441->400|441->400|441->400|441->400|442->401|443->402|444->403|445->404|446->405|447->406|459->418|459->418|459->418|460->419|461->420|461->420|461->420|462->421|462->421|462->421|463->422|463->422|463->422|464->423|464->423|464->423|464->423|464->423|464->423|465->424|465->424|465->424|466->425|466->425|466->425|466->425|466->425|466->425|467->426|468->427|469->428|470->429|471->430|472->431|484->443|484->443|484->443|485->444|486->445|486->445|486->445|487->446|487->446|487->446|488->447|488->447|488->447|489->448|489->448|489->448|489->448|489->448|489->448|489->448|490->449|490->449|490->449|491->450|491->450|491->450|491->450|491->450|491->450|491->450|492->451|493->452|494->453|495->454|496->455|497->456|506->465
                  -- GENERATED --
              */
          