
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

object challengeListAdmin extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template14[List[Challenge],Challenge,Integer,String,Integer,Integer,Integer,String,Integer,String,String,Long,Integer,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(challenges: List[Challenge],
        challengeZone: Challenge,
        pageNum: Integer,
        sort: String,
        offset: Integer,
        total: Integer,
        count: Integer,
        listType: String,
        pageLimit: Integer,
        searchBody: String,
        userName: String,
        id: Long,
        beginIndexForPagination: Integer,
        endIndexForPagination: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*15.6*/import helper._
/*16.6*/import models._
/*17.6*/import models.Challenge

def /*19.6*/scripts/*19.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*19.17*/("""
        """),format.raw/*20.9*/("""<script type="module" src='"""),_display_(/*20.37*/routes/*20.43*/.Assets.at("javascripts/voiceJump.js")),format.raw/*20.81*/("""'></script>
        <script type="text/javascript">
                $(document).ready(function () """),format.raw/*22.47*/("""{"""),format.raw/*22.48*/("""
                    """),format.raw/*23.21*/("""var nasaEndorsedAPIArray = [];
                    """),_display_(/*24.22*/for(i <- 0 until challenges.size) yield /*24.55*/ {_display_(Seq[Any](format.raw/*24.57*/("""
                    """),format.raw/*25.21*/("""var json = """),format.raw/*25.32*/("""{"""),format.raw/*25.33*/("""}"""),format.raw/*25.34*/(""";
                    json.id = '"""),_display_(/*26.33*/challenges/*26.43*/.get(i).getId()),format.raw/*26.58*/("""';
                    json.url = "/challenge/challengeEditPageAdmin/" + json.id;
                    json.name = '"""),_display_(/*28.35*/challenges/*28.45*/.get(i).getChallengeTitle),format.raw/*28.70*/("""'.replace(/[^a-zA-Z0-9]/g, " ").replace(/  +/g, " ").trim();
                    console.log("jsonhere:" + json);
                    nasaEndorsedAPIArray.push(json);
                    """)))}),format.raw/*31.22*/("""
                    """),format.raw/*32.21*/("""$("#nasaText").text(JSON.stringify(nasaEndorsedAPIArray));

                    $('.tooltipped').tooltip();

                    // $("#speak-from-filter").click();
                    // $("#speak-nasa").click();
                    // $("#speak-from-filter").click();
                """),format.raw/*39.17*/("""}"""),format.raw/*39.18*/(""");

                function jumpToPage(pageNum, sort, searchString) """),format.raw/*41.66*/("""{"""),format.raw/*41.67*/("""
                    """),format.raw/*42.21*/("""pageNum = parseInt(pageNum);
                    var url = "/challenge/searchPOST?pageNum=" + pageNum + "&sortCriteria=" + sort;
                    var form = $(document.createElement('form'));
                    $(form).attr("action", url);
                    $(form).attr("method", "POST");
                    $(form).css("display", "none");

                    var form_searchString = $("<input>")
                            .attr("type", "text")
                            .attr("name", "searchString")
                            .val(searchString);
                    $(form).append($(form_searchString));

                    console.log("<<<<<<<searchString" + searchString);
                    form.appendTo(document.body);
                    $(form).submit();
                """),format.raw/*58.17*/("""}"""),format.raw/*58.18*/("""

                """),format.raw/*60.17*/("""function string2Map(str) """),format.raw/*60.42*/("""{"""),format.raw/*60.43*/("""
                    """),format.raw/*61.21*/("""var map = new Map();
                    var splitedString = str.replace(new RegExp("],", 'g'), ";");
                    var array = splitedString.split(";");
                    for(var i = 0; i < array.length; i++)"""),format.raw/*64.58*/("""{"""),format.raw/*64.59*/("""
                        """),format.raw/*65.25*/("""var idAndEventsString = array[i];
                        idAndEventsString = idAndEventsString.replace(/["""),format.raw/*66.73*/("""{"""),format.raw/*66.74*/("""}"""),format.raw/*66.75*/("""[\]\\]/g, " ");
                        var idAndEvents = idAndEventsString.split("=");
                        var id = idAndEvents[0];
                        var eventsString = idAndEvents[1];
                        var events = eventsString.split(",");
                        console.log("events:" + events + "," + i);

                        var formatedEvents = "";
                        for(var j = 0; j < events.length; j++)"""),format.raw/*74.63*/("""{"""),format.raw/*74.64*/("""
                            """),format.raw/*75.29*/("""events[j] = events[j].trim();
                            formatedEvents = formatedEvents + events[j] + ";";
                        """),format.raw/*77.25*/("""}"""),format.raw/*77.26*/("""
                        """),format.raw/*78.25*/("""if(formatedEvents.length > 1)
                            map.set(id.trim(), formatedEvents);
                    """),format.raw/*80.21*/("""}"""),format.raw/*80.22*/("""
                    """),format.raw/*81.21*/("""return map;
                """),format.raw/*82.17*/("""}"""),format.raw/*82.18*/("""
        """),format.raw/*83.9*/("""</script>
        <style>
                .follow-fab """),format.raw/*85.29*/("""{"""),format.raw/*85.30*/("""
                    """),format.raw/*86.21*/("""top: -20px !important;
                    bottom: auto !important;
                    right: -20px !important;
                """),format.raw/*89.17*/("""}"""),format.raw/*89.18*/("""
        """),format.raw/*90.9*/("""</style>
    """)))};
Seq[Any](format.raw/*14.40*/("""
    """),format.raw/*16.1*/("""    """),format.raw/*17.1*/("""    """),format.raw/*18.1*/("""
    """),format.raw/*91.6*/("""

    """),_display_(/*93.6*/main("All Challenges", scripts)/*93.37*/ {_display_(Seq[Any](format.raw/*93.39*/("""
        """),format.raw/*94.9*/("""<div class="container">
            <div class="card-panel center">
                """),_display_(/*96.18*/if(listType.equals("search"))/*96.47*/ {_display_(Seq[Any](format.raw/*96.49*/("""
                    """),format.raw/*97.21*/("""<div class="row card-panel z-depth-0 project-zone-panel">
                        <div class="col s12" style="margin-top: -10px; margin-bottom: -10px;">
                            <h6 class="center tooltipped" data-position="bottom" data-tooltip="This list shows the search results.">
                                Search Result
                            </h6>
                        </div>
                    </div>
                """)))}/*104.19*/else if(listType.equals("all"))/*104.51*/ {_display_(Seq[Any](format.raw/*104.53*/("""
                """),format.raw/*105.17*/("""<div class="row card-panel z-depth-0 project-zone-panel">
                    <div class="col s12" style="margin-top: -10px; margin-bottom: -10px;">
                        <h6 class="center tooltipped" data-position="bottom" data-tooltip="This list shows all the challenges.">
                            List of Challenges Registered at SMU-Hub
                        </h6>
                    </div>
                </div>
                """)))}),format.raw/*112.18*/("""

                """),_display_(/*114.18*/if(challenges.size() > 0)/*114.43*/ {_display_(Seq[Any](format.raw/*114.45*/("""
                    """),format.raw/*115.21*/("""<div class="col s8 offset-s2">
                        <h4>Challenge List</h4>
                    </div>
                    <div class="col s2">
                        <button id="speak-from-filter" hidden></button>
                        <div id="nasaText" hidden></div>
                        <div id="requestField"></div>
                        <div id="replyField"></div>
                    </div>
                    <div class="row">
                        <div class="col s6">
                            <h6 class="left">Showing results: """),_display_(/*126.64*/{ offset + 1 }),format.raw/*126.78*/(""" """),format.raw/*126.79*/("""to """),_display_(/*126.83*/{ offset + count }),format.raw/*126.101*/(""" """),format.raw/*126.102*/("""of """),_display_(/*126.106*/total),format.raw/*126.111*/("""</h6>
                        </div>
                        <div class="col s6" style="padding-top: -5px; margin-top: -2px">
                            <a class='dropdown-trigger btn-flat right' href='#' data-target='dropdown2' style="text-transform: none; font-weight: bold; color: black; font-family: AmazonEmberBold, Helvetica Neue Bold, Helvetica Neue, Helvetica, Arial, sans-serif !important;">
                                Sort By: &nbsp; <font color="#3a5dc3">
                                    """),_display_(/*131.38*/if(sort.equals("id"))/*131.59*/ {_display_(Seq[Any](format.raw/*131.61*/("""
                                        """),format.raw/*132.41*/("""Challenge Id
                                    """)))}/*133.38*/else if(sort.equals("challengeTitle"))/*133.76*/{_display_(Seq[Any](format.raw/*133.77*/("""
                                """),format.raw/*134.33*/("""Challenge Title
                                """)))}/*135.34*/else if(sort.equals("shortDescription"))/*135.74*/{_display_(Seq[Any](format.raw/*135.75*/("""
                                """),format.raw/*136.33*/("""Short Description
                                """)))}/*137.34*/else if(sort.equals("location"))/*137.66*/{_display_(Seq[Any](format.raw/*137.67*/("""
                                """),format.raw/*138.33*/("""Location
                                """)))}/*139.34*/else if(sort.equals("budget"))/*139.64*/{_display_(Seq[Any](format.raw/*139.65*/("""
                                """),format.raw/*140.33*/("""Budge
                                """)))}/*141.34*/else/*141.38*/{_display_(Seq[Any](format.raw/*141.39*/("""
                                """),format.raw/*142.33*/("""Challenge Id
                                """)))}),format.raw/*143.34*/("""
                            """),format.raw/*144.29*/("""</font> <i class="material-icons right">expand_more</i>
                            </a>

                                <!-- Dropdown Structure -->
                            <ul id='dropdown2' class='dropdown-content'>
                            """),_display_(/*149.30*/if(listType.equals("all"))/*149.56*/ {_display_(Seq[Any](format.raw/*149.58*/("""
                                """),format.raw/*150.33*/("""<li><a href=""""),_display_(/*150.47*/routes/*150.53*/.ChallengeController.challengeList(1, "id")),format.raw/*150.96*/("""" class="grey-text text-darken-4"><i class="material-icons">event</i>Challenge Id</a></li>
                                <li><a href=""""),_display_(/*151.47*/routes/*151.53*/.ChallengeController.challengeList(1, "challengeTitle")),format.raw/*151.108*/("""" class="grey-text text-darken-4"><i class="material-icons">sort_by_alpha</i>Challenge Title</a></li>
                                <li><a href=""""),_display_(/*152.47*/routes/*152.53*/.ChallengeController.challengeList(1, "shortDescription")),format.raw/*152.110*/("""" class="grey-text text-darken-4"><i class="material-icons">sort_by_alpha</i>Short Description</a></li>
                                <li><a href=""""),_display_(/*153.47*/routes/*153.53*/.ChallengeController.challengeList(1, "location")),format.raw/*153.102*/("""" class="grey-text text-darken-4"><i class="material-icons">sort_by_alpha</i>Location</a></li>
                                <li><a href=""""),_display_(/*154.47*/routes/*154.53*/.ChallengeController.challengeList(1, "budget")),format.raw/*154.100*/("""" class="grey-text text-darken-4"><i class="material-icons">sort_by_alpha</i>Budge</a></li>
                            """)))}/*155.31*/else/*155.36*/{_display_(Seq[Any](format.raw/*155.37*/("""
                                """),format.raw/*156.33*/("""<li>
                                    <a onclick="jumpToPage(1, 'id', '"""),_display_(/*157.71*/searchBody),format.raw/*157.81*/("""')">
                                        <i class="material-icons">event</i>Challenge ID
                                    </a>
                                </li>
                                <li>
                                    <a onclick="jumpToPage(1, 'challengeTitle', '"""),_display_(/*162.83*/searchBody),format.raw/*162.93*/("""')">
                                        <i class="material-icons">sort_by_alpha</i>Challenge Title
                                    </a>
                                </li>
                                <li>
                                    <a onclick="jumpToPage(1, 'location', '"""),_display_(/*167.77*/searchBody),format.raw/*167.87*/("""')">
                                        <i class="material-icons">sort_by_alpha</i>Challenge Location
                                    </a>
                                </li>
                                <li>
                                    <a onclick="jumpToPage(1, 'access_times', '"""),_display_(/*172.81*/searchBody),format.raw/*172.91*/("""')">
                                        <i class="material-icons">sort_by_alpha</i>Popularity
                                    </a>
                                </li>
                            """)))}),format.raw/*176.30*/("""
                            """),format.raw/*177.29*/("""</ul>
                        </div>
                    </div>
                    <table class="centered responsive-table striped" id="projectTable">
                        <thead>
                            <tr class="list-header" style="border-bottom: 1px solid !important;">
                                <th style="cursor: pointer;">Challenge Id</th>
                                <th style="cursor: pointer;">Challenge Title</th>
                                <th style="cursor: pointer;">Short Description</th>
                                <th style="cursor: pointer;">Location</th>
                                <th style="width: 130px;">Budget</th>
                            </tr>
                        </thead>
                        <tbody>
                        """),_display_(/*191.26*/for((entry, index) <- challenges.zipWithIndex) yield /*191.72*/ {_display_(Seq[Any](format.raw/*191.74*/("""
                            """),format.raw/*192.29*/("""<tr>
                                <td>"""),_display_(/*193.38*/entry/*193.43*/.getId()),format.raw/*193.51*/("""</td>
                                <td>
                                    <a href=""""),_display_(/*195.47*/routes/*195.53*/.ChallengeController.challengeEditPageAdmin(entry.getId())),format.raw/*195.111*/("""">
                                    """),_display_(/*196.38*/entry/*196.43*/.getChallengeTitle()),format.raw/*196.63*/("""
                                    """),format.raw/*197.37*/("""</a>
                                </td>
                                """),_display_(/*199.34*/if((entry.getShortDescription() != null) && (entry.getShortDescription() != ""))/*199.114*/ {_display_(Seq[Any](format.raw/*199.116*/("""
                                    """),format.raw/*200.37*/("""<td class="tooltip" style="max-width: 450px !important">
                                        """),_display_(/*201.42*/entry/*201.47*/.getShortDescription()),format.raw/*201.69*/("""
                                        """),format.raw/*202.41*/("""<span class="tooltiptext">"""),_display_(/*202.68*/entry/*202.73*/.getShortDescription()),format.raw/*202.95*/("""</span>
                                    </td>
                                """)))}/*204.35*/else/*204.40*/{_display_(Seq[Any](format.raw/*204.41*/("""
                                    """),format.raw/*205.37*/("""<td><span class=""""),_display_(/*205.55*/entry/*205.60*/.getId()),format.raw/*205.68*/(""" """),format.raw/*205.69*/("""editable" data-name="shortDescription">&ensp; -</span></td>
                                """)))}),format.raw/*206.34*/("""
                                """),_display_(/*207.34*/if(entry.getLocation() != "")/*207.63*/ {_display_(Seq[Any](format.raw/*207.65*/("""
                                    """),format.raw/*208.37*/("""<td>
                                        <span class=""""),_display_(/*209.55*/entry/*209.60*/.getId()),format.raw/*209.68*/(""" """),format.raw/*209.69*/("""editable" data-name="location"></span>
                                        """),_display_(/*210.42*/entry/*210.47*/.getLocation()),format.raw/*210.61*/("""
                                    """),format.raw/*211.37*/("""</td>
                                """)))}/*212.35*/else/*212.40*/{_display_(Seq[Any](format.raw/*212.41*/("""
                                    """),format.raw/*213.37*/("""<td><span class=""""),_display_(/*213.55*/entry/*213.60*/.getId()),format.raw/*213.68*/(""" """),format.raw/*213.69*/("""editable" data-name="location"> -</span></td>
                                """)))}),format.raw/*214.34*/("""
                                """),_display_(/*215.34*/if(entry.getBudget() != "")/*215.61*/ {_display_(Seq[Any](format.raw/*215.63*/("""
                                    """),format.raw/*216.37*/("""<td>
                                        <span class=""""),_display_(/*217.55*/entry/*217.60*/.getId()),format.raw/*217.68*/(""" """),format.raw/*217.69*/("""editable" data-name="budget"></span>
                                        """),_display_(/*218.42*/entry/*218.47*/.getBudget()),format.raw/*218.59*/("""
                                    """),format.raw/*219.37*/("""</td>
                                """)))}/*220.35*/else/*220.40*/{_display_(Seq[Any](format.raw/*220.41*/("""
                                    """),format.raw/*221.37*/("""<td><span class=""""),_display_(/*221.55*/entry/*221.60*/.getId()),format.raw/*221.68*/(""" """),format.raw/*221.69*/("""editable" data-name="budget"> -</span></td>
                                """)))}),format.raw/*222.34*/("""
                            """),format.raw/*223.29*/("""</tr>
                        """)))}),format.raw/*224.26*/("""
                        """),format.raw/*225.25*/("""</tbody>
                    </table>

                    <div class="row">
                        <div class="col s12">
                            <ul class="pagination center-align">
                                """),_display_(/*231.34*/if(listType.equals("all"))/*231.60*/ {_display_(Seq[Any](format.raw/*231.62*/("""
                                    """),_display_(/*232.38*/if(pageNum == 1)/*232.54*/ {_display_(Seq[Any](format.raw/*232.56*/("""
                                        """),format.raw/*233.41*/("""<li class="waves-effect disabled" style="color: #c3bfbf;">
                                            <i class="material-icons">first_page</i>
                                        </li>
                                        <li class="waves-effect disabled" style="color: #c3bfbf;">
                                            <i class="material-icons">chevron_left</i>
                                        </li>
                                    """)))}/*239.39*/else/*239.44*/{_display_(Seq[Any](format.raw/*239.45*/("""
                                        """),format.raw/*240.41*/("""<li class="waves-effect">
                                            <a href=""""),_display_(/*241.55*/routes/*241.61*/.ChallengeController.challengeList(1, sort)),format.raw/*241.104*/("""">
                                                <i class="material-icons">first_page</i>
                                            </a>
                                        </li>
                                        <li class="waves-effect">
                                            <a href=""""),_display_(/*246.55*/routes/*246.61*/.ChallengeController.challengeList(pageNum - 1, sort)),format.raw/*246.114*/("""">
                                                <i class="material-icons">chevron_left</i>
                                            </a>
                                        </li>
                                    """)))}),format.raw/*250.38*/("""
                                    """),_display_(/*251.38*/if(beginIndexForPagination > 1)/*251.69*/ {_display_(Seq[Any](format.raw/*251.71*/("""
                                        """),format.raw/*252.41*/("""<li class="waves-effect modal-trigger" href="#allPageModal" style="cursor: pointer; font-size: 20px; font-weight: bold">...</li>
                                    """)))}),format.raw/*253.38*/("""
                                    """),_display_(/*254.38*/for(i <- (beginIndexForPagination + 0) to (endIndexForPagination + 0)) yield /*254.108*/ {_display_(Seq[Any](format.raw/*254.110*/("""
                                        """),format.raw/*255.41*/("""<li """),_display_(/*255.46*/if(pageNum == i)/*255.62*/ {_display_(Seq[Any](format.raw/*255.64*/(""" """),format.raw/*255.65*/("""class="active" """)))}),format.raw/*255.81*/(""">
                                            <a href=""""),_display_(/*256.55*/routes/*256.61*/.ChallengeController.challengeList(i, sort)),format.raw/*256.104*/("""">"""),_display_(/*256.107*/i),format.raw/*256.108*/("""</a>
                                        </li>
                                    """)))}),format.raw/*258.38*/("""
                                    """),_display_(/*259.38*/if(endIndexForPagination < ((total - 1) / pageLimit + 1))/*259.95*/ {_display_(Seq[Any](format.raw/*259.97*/("""
                                        """),format.raw/*260.41*/("""<li class="waves-effect modal-trigger" href="#allPageModal" style="cursor: pointer; font-size: 20px; font-weight: bold">...</li>
                                    """)))}),format.raw/*261.38*/("""
                                    """),_display_(/*262.38*/if((offset + count) >= total)/*262.67*/ {_display_(Seq[Any](format.raw/*262.69*/("""
                                        """),format.raw/*263.41*/("""<li class="waves-effect disabled" style="color: #c3bfbf;">
                                            <i class="material-icons">chevron_right</i>
                                        </li>
                                        <li class="waves-effect disabled" style="color: #c3bfbf;">
                                            <i class="material-icons">last_page</i>
                                        </li>
                                    """)))}/*269.39*/else/*269.44*/{_display_(Seq[Any](format.raw/*269.45*/("""
                                        """),format.raw/*270.41*/("""<li class="waves-effect">
                                            <a href=""""),_display_(/*271.55*/routes/*271.61*/.ChallengeController.challengeList(pageNum + 1, sort)),format.raw/*271.114*/("""">
                                                <i class="material-icons">chevron_right</i>
                                            </a>
                                        </li>
                                        <li class="waves-effect">
                                            <a href=""""),_display_(/*276.55*/routes/*276.61*/.ChallengeController.challengeList((total - 1) / pageLimit + 1, sort)),format.raw/*276.130*/("""">
                                                <i class="material-icons">last_page</i>
                                            </a>
                                        </li>
                                    """)))}),format.raw/*280.38*/("""
                                """)))}/*281.35*/else if(listType.equals("my enroll"))/*281.72*/{_display_(Seq[Any](format.raw/*281.73*/("""
                                """),_display_(/*282.34*/if(pageNum == 1)/*282.50*/ {_display_(Seq[Any](format.raw/*282.52*/("""
                                    """),format.raw/*283.37*/("""<li class="waves-effect disabled" style="color: #c3bfbf;">
                                        <i class="material-icons">first_page</i>
                                    </li>
                                    <li class="waves-effect disabled" style="color: #c3bfbf;">
                                        <i class="material-icons">chevron_left</i>
                                    </li>
                                """)))}/*289.35*/else/*289.40*/{_display_(Seq[Any](format.raw/*289.41*/("""
                                    """),format.raw/*290.37*/("""<li class="waves-effect">
                                        <a href=""""),_display_(/*291.51*/routes/*291.57*/.ProjectController.getMyEnrolledProjects(1, sort)),format.raw/*291.106*/("""">
                                            <i class="material-icons">first_page</i>
                                        </a>
                                    </li>
                                    <li class="waves-effect">
                                        <a href=""""),_display_(/*296.51*/routes/*296.57*/.ProjectController.getMyEnrolledProjects(pageNum - 1, sort)),format.raw/*296.116*/("""">
                                            <i class="material-icons">chevron_left</i>
                                        </a>
                                    </li>
                                """)))}),format.raw/*300.34*/("""
                                """),_display_(/*301.34*/if(beginIndexForPagination > 1)/*301.65*/ {_display_(Seq[Any](format.raw/*301.67*/("""
                                    """),format.raw/*302.37*/("""<li class="waves-effect modal-trigger" href="#enrollPageModal" style="cursor: pointer; font-size: 20px; font-weight: bold">...</li>
                                """)))}),format.raw/*303.34*/("""
                                """),_display_(/*304.34*/for(i <- (beginIndexForPagination + 0) to (endIndexForPagination + 0)) yield /*304.104*/ {_display_(Seq[Any](format.raw/*304.106*/("""
                                    """),format.raw/*305.37*/("""<li """),_display_(/*305.42*/if(pageNum == i)/*305.58*/ {_display_(Seq[Any](format.raw/*305.60*/(""" """),format.raw/*305.61*/("""class="active" """)))}),format.raw/*305.77*/(""">
                                        <a href=""""),_display_(/*306.51*/routes/*306.57*/.ProjectController.getMyEnrolledProjects(i, sort)),format.raw/*306.106*/("""">"""),_display_(/*306.109*/i),format.raw/*306.110*/("""</a>
                                    </li>
                                """)))}),format.raw/*308.34*/("""
                                """),_display_(/*309.34*/if(endIndexForPagination < ((total - 1) / pageLimit + 1))/*309.91*/ {_display_(Seq[Any](format.raw/*309.93*/("""
                                    """),format.raw/*310.37*/("""<li class="waves-effect modal-trigger" href="#enrollPageModal" style="cursor: pointer; font-size: 20px; font-weight: bold">...</li>
                                """)))}),format.raw/*311.34*/("""
                                """),_display_(/*312.34*/if((offset + count) >= total)/*312.63*/ {_display_(Seq[Any](format.raw/*312.65*/("""
                                    """),format.raw/*313.37*/("""<li class="waves-effect disabled" style="color: #c3bfbf;">
                                        <i class="material-icons">chevron_right</i>
                                    </li>
                                    <li class="waves-effect disabled" style="color: #c3bfbf;">
                                        <i class="material-icons">last_page</i>
                                    </li>
                                """)))}/*319.35*/else/*319.40*/{_display_(Seq[Any](format.raw/*319.41*/("""
                                    """),format.raw/*320.37*/("""<li class="waves-effect">
                                        <a href=""""),_display_(/*321.51*/routes/*321.57*/.ProjectController.getMyEnrolledProjects(pageNum + 1, sort)),format.raw/*321.116*/("""">
                                            <i class="material-icons">chevron_right</i>
                                        </a>
                                    </li>
                                    <li class="waves-effect">
                                        <a href=""""),_display_(/*326.51*/routes/*326.57*/.ProjectController.getMyEnrolledProjects((total - 1) / pageLimit + 1, sort)),format.raw/*326.132*/("""">
                                            <i class="material-icons">last_page</i>
                                        </a>
                                    </li>
                                """)))}),format.raw/*330.34*/("""
                                """)))}/*331.35*/else/*331.40*/{_display_(Seq[Any](format.raw/*331.41*/("""
                                """),_display_(/*332.34*/if(pageNum == 1)/*332.50*/ {_display_(Seq[Any](format.raw/*332.52*/("""
                                    """),format.raw/*333.37*/("""<li class="waves-effect disabled" style="color: #c3bfbf;">
                                        <i class="material-icons">first_page</i>
                                    </li>
                                    <li class="waves-effect disabled" style="color: #c3bfbf;">
                                        <i class="material-icons">chevron_left</i>
                                    </li>
                                """)))}/*339.35*/else/*339.40*/{_display_(Seq[Any](format.raw/*339.41*/("""
                                    """),format.raw/*340.37*/("""<li class="waves-effect">
                                        <a href="#!" onclick="jumpToPage(1, '"""),_display_(/*341.79*/sort),format.raw/*341.83*/("""', '"""),_display_(/*341.88*/searchBody),format.raw/*341.98*/("""')">
                                            <i class="material-icons">first_page</i>
                                        </a>
                                    </li>
                                    <li class="waves-effect">
                                        <a href="#!" onclick="jumpToPage("""),_display_(/*346.75*/pageNum),format.raw/*346.82*/("""-1, '"""),_display_(/*346.88*/sort),format.raw/*346.92*/("""', '"""),_display_(/*346.97*/searchBody),format.raw/*346.107*/("""')">
                                            <i class="material-icons">chevron_left</i>
                                        </a>
                                    </li>
                                """)))}),format.raw/*350.34*/("""
                                """),_display_(/*351.34*/if(beginIndexForPagination > 1)/*351.65*/ {_display_(Seq[Any](format.raw/*351.67*/("""
                                    """),format.raw/*352.37*/("""<li class="waves-effect modal-trigger" href="#searchPageModal" style="cursor: pointer; font-size: 20px; font-weight: bold">...</li>
                                """)))}),format.raw/*353.34*/("""
                                """),_display_(/*354.34*/for(i <- (beginIndexForPagination + 0) to (endIndexForPagination + 0)) yield /*354.104*/ {_display_(Seq[Any](format.raw/*354.106*/("""
                                    """),format.raw/*355.37*/("""<li """),_display_(/*355.42*/if(pageNum == i)/*355.58*/ {_display_(Seq[Any](format.raw/*355.60*/(""" """),format.raw/*355.61*/("""class="active" """)))}),format.raw/*355.77*/(""">
                                        <a href="#!" onclick="jumpToPage("""),_display_(/*356.75*/i),format.raw/*356.76*/(""", '"""),_display_(/*356.80*/sort),format.raw/*356.84*/("""', '"""),_display_(/*356.89*/searchBody),format.raw/*356.99*/("""')">
                                        """),_display_(/*357.42*/i),format.raw/*357.43*/("""
                                        """),format.raw/*358.41*/("""</a>
                                    </li>
                                """)))}),format.raw/*360.34*/("""
                                """),_display_(/*361.34*/if(endIndexForPagination < ((total - 1) / pageLimit + 1))/*361.91*/ {_display_(Seq[Any](format.raw/*361.93*/("""
                                    """),format.raw/*362.37*/("""<li class="waves-effect modal-trigger" href="#searchPageModal" style="cursor: pointer; font-size: 20px; font-weight: bold">...</li>
                                """)))}),format.raw/*363.34*/("""
                                """),_display_(/*364.34*/if((offset + count) >= total)/*364.63*/ {_display_(Seq[Any](format.raw/*364.65*/("""
                                    """),format.raw/*365.37*/("""<li class="waves-effect disabled" style="color: #c3bfbf;">
                                        <i class="material-icons">chevron_right</i>
                                    </li>
                                    <li class="waves-effect disabled" style="color: #c3bfbf;">
                                        <i class="material-icons">last_page</i>
                                    </li>
                                """)))}/*371.35*/else/*371.40*/{_display_(Seq[Any](format.raw/*371.41*/("""
                                    """),format.raw/*372.37*/("""<li class="waves-effect">
                                        <a href="#!" onclick="jumpToPage("""),_display_(/*373.75*/pageNum),format.raw/*373.82*/("""+1, '"""),_display_(/*373.88*/sort),format.raw/*373.92*/("""', '"""),_display_(/*373.97*/searchBody),format.raw/*373.107*/("""')">
                                            <i class="material-icons">chevron_right</i>
                                        </a>
                                    </li>
                                    <li class="waves-effect">
                                        <a href="#!" onclick="jumpToPage(("""),_display_(/*378.76*/total),format.raw/*378.81*/("""-1)/("""),_display_(/*378.87*/pageLimit),format.raw/*378.96*/(""")+1, '"""),_display_(/*378.103*/sort),format.raw/*378.107*/("""', '"""),_display_(/*378.112*/searchBody),format.raw/*378.122*/("""')">
                                            <i class="material-icons">last_page</i>
                                        </a>
                                    </li>
                                """)))}),format.raw/*382.34*/("""
                                """)))}),format.raw/*383.34*/("""
                            """),format.raw/*384.29*/("""</ul>
                        </div>
                    </div>
                """)))}/*387.19*/else/*387.24*/{_display_(Seq[Any](format.raw/*387.25*/("""
                    """),format.raw/*388.21*/("""<h5>No challenge was found.</h5>
                """)))}),format.raw/*389.18*/("""

                    """),format.raw/*391.21*/("""<!-- All Page Modal -->
                <div id="allPageModal" class="modal">
                    <div class="modal-content">
                        <h6>Select the page number you want to jump to</h6>
                        <div class="card z-depth-0">
                        """),_display_(/*396.26*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*396.83*/ {_display_(Seq[Any](format.raw/*396.85*/("""
                            """),format.raw/*397.29*/("""<ul class="pagination center-align">
                            """),_display_(/*398.30*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*398.69*/ {_display_(Seq[Any](format.raw/*398.71*/("""
                                """),_display_(/*399.34*/if(j <= ((total - 1)/(pageLimit) + 1))/*399.72*/ {_display_(Seq[Any](format.raw/*399.74*/("""
                                    """),_display_(/*400.38*/if(j != pageNum)/*400.54*/ {_display_(Seq[Any](format.raw/*400.56*/("""
                                        """),format.raw/*401.41*/("""<li class="waves-effect grey lighten-3">
                                            <a href='"""),_display_(/*402.55*/routes/*402.61*/.ChallengeController.challengeList(j, sort)),format.raw/*402.104*/("""'>"""),_display_(/*402.107*/j),format.raw/*402.108*/("""</a>
                                        </li>
                                    """)))}/*404.39*/else/*404.44*/{_display_(Seq[Any](format.raw/*404.45*/("""
                                        """),format.raw/*405.41*/("""<li class="waves-effect active">
                                            <a href='"""),_display_(/*406.55*/routes/*406.61*/.ChallengeController.challengeList(j, sort)),format.raw/*406.104*/("""'>"""),_display_(/*406.107*/j),format.raw/*406.108*/("""</a>
                                        </li>
                                    """)))}),format.raw/*408.38*/("""
                                """)))}),format.raw/*409.34*/("""
                            """)))}),format.raw/*410.30*/("""
                            """),format.raw/*411.29*/("""</ul>
                        """)))}),format.raw/*412.26*/("""
                        """),format.raw/*413.25*/("""</div>
                    </div>
                    <div class="modal-footer">
                        <a href="#!" class="modal-close waves-effect waves-green btn-flat">Cancel</a>
                    </div>
                </div>

                    <!-- Enrolled Page Modal -->
                <div id="enrollPageModal" class="modal">
                    <div class="modal-content">
                        <h6>Select the page number you want to jump to</h6>
                        <div class="card z-depth-0">
                        """),_display_(/*425.26*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*425.83*/ {_display_(Seq[Any](format.raw/*425.85*/("""
                            """),format.raw/*426.29*/("""<ul class="pagination center-align">
                            """),_display_(/*427.30*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*427.69*/ {_display_(Seq[Any](format.raw/*427.71*/("""
                                """),_display_(/*428.34*/if(j <= ((total - 1)/(pageLimit) + 1))/*428.72*/ {_display_(Seq[Any](format.raw/*428.74*/("""
                                    """),_display_(/*429.38*/if(j != pageNum)/*429.54*/ {_display_(Seq[Any](format.raw/*429.56*/("""
                                        """),format.raw/*430.41*/("""<li class="waves-effect grey lighten-3">
                                            <a href='"""),_display_(/*431.55*/routes/*431.61*/.ProjectController.getMyEnrolledProjects(j, sort)),format.raw/*431.110*/("""'>"""),_display_(/*431.113*/j),format.raw/*431.114*/("""</a>
                                        </li>
                                    """)))}/*433.39*/else/*433.44*/{_display_(Seq[Any](format.raw/*433.45*/("""
                                        """),format.raw/*434.41*/("""<li class="waves-effect active">
                                            <a href='"""),_display_(/*435.55*/routes/*435.61*/.ProjectController.getMyEnrolledProjects(j, sort)),format.raw/*435.110*/("""'>"""),_display_(/*435.113*/j),format.raw/*435.114*/("""</a>
                                        </li>
                                    """)))}),format.raw/*437.38*/("""
                                """)))}),format.raw/*438.34*/("""
                            """)))}),format.raw/*439.30*/("""
                            """),format.raw/*440.29*/("""</ul>
                        """)))}),format.raw/*441.26*/("""
                        """),format.raw/*442.25*/("""</div>
                    </div>
                    <div class="modal-footer">
                        <a href="#!" class="modal-close waves-effect waves-green btn-flat">Cancel</a>
                    </div>
                </div>

                    <!-- Search Page Modal -->
                <div id="searchPageModal" class="modal">
                    <div class="modal-content">
                        <h6>Select the page number you want to jump to</h6>
                        <div class="card z-depth-0">
                        """),_display_(/*454.26*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*454.83*/ {_display_(Seq[Any](format.raw/*454.85*/("""
                            """),format.raw/*455.29*/("""<ul class="pagination center-align">
                            """),_display_(/*456.30*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*456.69*/ {_display_(Seq[Any](format.raw/*456.71*/("""
                                """),_display_(/*457.34*/if(j <= ((total - 1)/(pageLimit) + 1))/*457.72*/ {_display_(Seq[Any](format.raw/*457.74*/("""
                                    """),_display_(/*458.38*/if(j != pageNum)/*458.54*/ {_display_(Seq[Any](format.raw/*458.56*/("""
                                        """),format.raw/*459.41*/("""<li class="waves-effect grey lighten-3">
                                            <a href="#!" onclick="jumpToPage("""),_display_(/*460.79*/j),format.raw/*460.80*/(""", 'id', '"""),_display_(/*460.90*/searchBody),format.raw/*460.100*/("""')">"""),_display_(/*460.105*/j),format.raw/*460.106*/("""</a>
                                        </li>
                                    """)))}/*462.39*/else/*462.44*/{_display_(Seq[Any](format.raw/*462.45*/("""
                                        """),format.raw/*463.41*/("""<li class="waves-effect active">
                                            <a href="#!" onclick="jumpToPage("""),_display_(/*464.79*/j),format.raw/*464.80*/(""", 'id', '"""),_display_(/*464.90*/searchBody),format.raw/*464.100*/("""')">"""),_display_(/*464.105*/j),format.raw/*464.106*/("""</a>
                                        </li>
                                    """)))}),format.raw/*466.38*/("""
                                """)))}),format.raw/*467.34*/("""
                            """)))}),format.raw/*468.30*/("""
                            """),format.raw/*469.29*/("""</ul>
                        """)))}),format.raw/*470.26*/("""
                        """),format.raw/*471.25*/("""</div>
                    </div>
                    <div class="modal-footer">
                        <a href="#!" class="modal-close waves-effect waves-green btn-flat">Cancel</a>
                    </div>
                </div>
            </div>
        </div>
    """)))}),format.raw/*479.6*/("""
"""))
      }
    }
  }

  def render(challenges:List[Challenge],challengeZone:Challenge,pageNum:Integer,sort:String,offset:Integer,total:Integer,count:Integer,listType:String,pageLimit:Integer,searchBody:String,userName:String,id:Long,beginIndexForPagination:Integer,endIndexForPagination:Integer): play.twirl.api.HtmlFormat.Appendable = apply(challenges,challengeZone,pageNum,sort,offset,total,count,listType,pageLimit,searchBody,userName,id,beginIndexForPagination,endIndexForPagination)

  def f:((List[Challenge],Challenge,Integer,String,Integer,Integer,Integer,String,Integer,String,String,Long,Integer,Integer) => play.twirl.api.HtmlFormat.Appendable) = (challenges,challengeZone,pageNum,sort,offset,total,count,listType,pageLimit,searchBody,userName,id,beginIndexForPagination,endIndexForPagination) => apply(challenges,challengeZone,pageNum,sort,offset,total,count,listType,pageLimit,searchBody,userName,id,beginIndexForPagination,endIndexForPagination)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:30 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/challengeListAdmin.scala.html
                  HASH: 881252dec3629444addc4e225f57120d3f60177c
                  MATRIX: 1233->1|1699->399|1723->420|1747->441|1784->471|1800->478|1881->482|1917->491|1972->519|1987->525|2046->563|2172->661|2201->662|2250->683|2329->735|2378->768|2418->770|2467->791|2506->802|2535->803|2564->804|2625->838|2644->848|2680->863|2823->979|2842->989|2888->1014|3107->1202|3156->1223|3470->1509|3499->1510|3596->1579|3625->1580|3674->1601|4498->2397|4527->2398|4573->2416|4626->2441|4655->2442|4704->2463|4949->2680|4978->2681|5031->2706|5165->2812|5194->2813|5223->2814|5688->3251|5717->3252|5774->3281|5935->3414|5964->3415|6017->3440|6159->3554|6188->3555|6237->3576|6293->3604|6322->3605|6358->3614|6440->3668|6469->3669|6518->3690|6675->3819|6704->3820|6740->3829|6794->393|6826->415|6857->436|6888->465|6920->3843|6953->3850|6993->3881|7033->3883|7069->3892|7181->3977|7219->4006|7259->4008|7308->4029|7769->4471|7810->4503|7851->4505|7897->4522|8373->4966|8420->4985|8455->5010|8496->5012|8546->5033|9129->5588|9165->5602|9195->5603|9227->5607|9268->5625|9299->5626|9332->5630|9360->5635|9898->6145|9929->6166|9970->6168|10040->6209|10110->6259|10158->6297|10198->6298|10260->6331|10329->6380|10379->6420|10419->6421|10481->6454|10552->6505|10594->6537|10634->6538|10696->6571|10758->6613|10798->6643|10838->6644|10900->6677|10959->6716|10973->6720|11013->6721|11075->6754|11153->6800|11211->6829|11491->7081|11527->7107|11568->7109|11630->7142|11672->7156|11688->7162|11753->7205|11918->7342|11934->7348|12012->7403|12188->7551|12204->7557|12284->7614|12462->7764|12478->7770|12550->7819|12719->7960|12735->7966|12805->8013|12946->8135|12960->8140|13000->8141|13062->8174|13165->8249|13197->8259|13516->8550|13548->8560|13872->8856|13904->8866|14235->9169|14267->9179|14506->9386|14564->9415|15388->10211|15451->10257|15492->10259|15550->10288|15620->10330|15635->10335|15665->10343|15782->10432|15798->10438|15879->10496|15947->10536|15962->10541|16004->10561|16070->10598|16174->10674|16265->10754|16307->10756|16373->10793|16499->10891|16514->10896|16558->10918|16628->10959|16683->10986|16698->10991|16742->11013|16845->11097|16859->11102|16899->11103|16965->11140|17011->11158|17026->11163|17056->11171|17086->11172|17211->11265|17273->11299|17312->11328|17353->11330|17419->11367|17506->11426|17521->11431|17551->11439|17581->11440|17689->11520|17704->11525|17740->11539|17806->11576|17865->11616|17879->11621|17919->11622|17985->11659|18031->11677|18046->11682|18076->11690|18106->11691|18217->11770|18279->11804|18316->11831|18357->11833|18423->11870|18510->11929|18525->11934|18555->11942|18585->11943|18691->12021|18706->12026|18740->12038|18806->12075|18865->12115|18879->12120|18919->12121|18985->12158|19031->12176|19046->12181|19076->12189|19106->12190|19215->12267|19273->12296|19336->12327|19390->12352|19639->12573|19675->12599|19716->12601|19782->12639|19808->12655|19849->12657|19919->12698|20398->13158|20412->13163|20452->13164|20522->13205|20630->13285|20646->13291|20712->13334|21047->13641|21063->13647|21139->13700|21397->13926|21463->13964|21504->13995|21545->13997|21615->14038|21813->14204|21879->14242|21967->14312|22009->14314|22079->14355|22112->14360|22138->14376|22179->14378|22209->14379|22257->14395|22341->14451|22357->14457|22423->14500|22455->14503|22479->14504|22599->14592|22665->14630|22732->14687|22773->14689|22843->14730|23041->14896|23107->14934|23146->14963|23187->14965|23257->15006|23736->15466|23750->15471|23790->15472|23860->15513|23968->15593|23984->15599|24060->15652|24398->15962|24414->15968|24506->16037|24761->16260|24815->16295|24862->16332|24902->16333|24964->16367|24990->16383|25031->16385|25097->16422|25552->16858|25566->16863|25606->16864|25672->16901|25776->16977|25792->16983|25864->17032|26179->17319|26195->17325|26277->17384|26519->17594|26581->17628|26622->17659|26663->17661|26729->17698|26926->17863|26988->17897|27076->17967|27118->17969|27184->18006|27217->18011|27243->18027|27284->18029|27314->18030|27362->18046|27442->18098|27458->18104|27530->18153|27562->18156|27586->18157|27698->18237|27760->18271|27827->18328|27868->18330|27934->18367|28131->18532|28193->18566|28232->18595|28273->18597|28339->18634|28794->19070|28808->19075|28848->19076|28914->19113|29018->19189|29034->19195|29116->19254|29434->19544|29450->19550|29548->19625|29787->19832|29841->19867|29855->19872|29895->19873|29957->19907|29983->19923|30024->19925|30090->19962|30545->20398|30559->20403|30599->20404|30665->20441|30797->20545|30823->20549|30856->20554|30888->20564|31229->20877|31258->20884|31292->20890|31318->20894|31351->20899|31384->20909|31628->21121|31690->21155|31731->21186|31772->21188|31838->21225|32035->21390|32097->21424|32185->21494|32227->21496|32293->21533|32326->21538|32352->21554|32393->21556|32423->21557|32471->21573|32575->21649|32598->21650|32630->21654|32656->21658|32689->21663|32721->21673|32795->21719|32818->21720|32888->21761|33000->21841|33062->21875|33129->21932|33170->21934|33236->21971|33433->22136|33495->22170|33534->22199|33575->22201|33641->22238|34096->22674|34110->22679|34150->22680|34216->22717|34344->22817|34373->22824|34407->22830|34433->22834|34466->22839|34499->22849|34844->23166|34871->23171|34905->23177|34936->23186|34972->23193|34999->23197|35033->23202|35066->23212|35307->23421|35373->23455|35431->23484|35532->23566|35546->23571|35586->23572|35636->23593|35718->23643|35769->23665|36077->23945|36151->24002|36192->24004|36250->24033|36344->24099|36400->24138|36441->24140|36503->24174|36551->24212|36592->24214|36658->24252|36684->24268|36725->24270|36795->24311|36918->24406|36934->24412|37000->24455|37032->24458|37056->24459|37164->24548|37178->24553|37218->24554|37288->24595|37403->24682|37419->24688|37485->24731|37517->24734|37541->24735|37661->24823|37727->24857|37789->24887|37847->24916|37910->24947|37964->24972|38534->25514|38608->25571|38649->25573|38707->25602|38801->25668|38857->25707|38898->25709|38960->25743|39008->25781|39049->25783|39115->25821|39141->25837|39182->25839|39252->25880|39375->25975|39391->25981|39463->26030|39495->26033|39519->26034|39627->26123|39641->26128|39681->26129|39751->26170|39866->26257|39882->26263|39954->26312|39986->26315|40010->26316|40130->26404|40196->26438|40258->26468|40316->26497|40379->26528|40433->26553|41001->27093|41075->27150|41116->27152|41174->27181|41268->27247|41324->27286|41365->27288|41427->27322|41475->27360|41516->27362|41582->27400|41608->27416|41649->27418|41719->27459|41866->27578|41889->27579|41927->27589|41960->27599|41994->27604|42018->27605|42126->27694|42140->27699|42180->27700|42250->27741|42389->27852|42412->27853|42450->27863|42483->27873|42517->27878|42541->27879|42661->27967|42727->28001|42789->28031|42847->28060|42910->28091|42964->28116|43267->28388
                  LINES: 35->1|51->15|52->16|53->17|55->19|55->19|57->19|58->20|58->20|58->20|58->20|60->22|60->22|61->23|62->24|62->24|62->24|63->25|63->25|63->25|63->25|64->26|64->26|64->26|66->28|66->28|66->28|69->31|70->32|77->39|77->39|79->41|79->41|80->42|96->58|96->58|98->60|98->60|98->60|99->61|102->64|102->64|103->65|104->66|104->66|104->66|112->74|112->74|113->75|115->77|115->77|116->78|118->80|118->80|119->81|120->82|120->82|121->83|123->85|123->85|124->86|127->89|127->89|128->90|130->14|131->16|131->17|131->18|132->91|134->93|134->93|134->93|135->94|137->96|137->96|137->96|138->97|145->104|145->104|145->104|146->105|153->112|155->114|155->114|155->114|156->115|167->126|167->126|167->126|167->126|167->126|167->126|167->126|167->126|172->131|172->131|172->131|173->132|174->133|174->133|174->133|175->134|176->135|176->135|176->135|177->136|178->137|178->137|178->137|179->138|180->139|180->139|180->139|181->140|182->141|182->141|182->141|183->142|184->143|185->144|190->149|190->149|190->149|191->150|191->150|191->150|191->150|192->151|192->151|192->151|193->152|193->152|193->152|194->153|194->153|194->153|195->154|195->154|195->154|196->155|196->155|196->155|197->156|198->157|198->157|203->162|203->162|208->167|208->167|213->172|213->172|217->176|218->177|232->191|232->191|232->191|233->192|234->193|234->193|234->193|236->195|236->195|236->195|237->196|237->196|237->196|238->197|240->199|240->199|240->199|241->200|242->201|242->201|242->201|243->202|243->202|243->202|243->202|245->204|245->204|245->204|246->205|246->205|246->205|246->205|246->205|247->206|248->207|248->207|248->207|249->208|250->209|250->209|250->209|250->209|251->210|251->210|251->210|252->211|253->212|253->212|253->212|254->213|254->213|254->213|254->213|254->213|255->214|256->215|256->215|256->215|257->216|258->217|258->217|258->217|258->217|259->218|259->218|259->218|260->219|261->220|261->220|261->220|262->221|262->221|262->221|262->221|262->221|263->222|264->223|265->224|266->225|272->231|272->231|272->231|273->232|273->232|273->232|274->233|280->239|280->239|280->239|281->240|282->241|282->241|282->241|287->246|287->246|287->246|291->250|292->251|292->251|292->251|293->252|294->253|295->254|295->254|295->254|296->255|296->255|296->255|296->255|296->255|296->255|297->256|297->256|297->256|297->256|297->256|299->258|300->259|300->259|300->259|301->260|302->261|303->262|303->262|303->262|304->263|310->269|310->269|310->269|311->270|312->271|312->271|312->271|317->276|317->276|317->276|321->280|322->281|322->281|322->281|323->282|323->282|323->282|324->283|330->289|330->289|330->289|331->290|332->291|332->291|332->291|337->296|337->296|337->296|341->300|342->301|342->301|342->301|343->302|344->303|345->304|345->304|345->304|346->305|346->305|346->305|346->305|346->305|346->305|347->306|347->306|347->306|347->306|347->306|349->308|350->309|350->309|350->309|351->310|352->311|353->312|353->312|353->312|354->313|360->319|360->319|360->319|361->320|362->321|362->321|362->321|367->326|367->326|367->326|371->330|372->331|372->331|372->331|373->332|373->332|373->332|374->333|380->339|380->339|380->339|381->340|382->341|382->341|382->341|382->341|387->346|387->346|387->346|387->346|387->346|387->346|391->350|392->351|392->351|392->351|393->352|394->353|395->354|395->354|395->354|396->355|396->355|396->355|396->355|396->355|396->355|397->356|397->356|397->356|397->356|397->356|397->356|398->357|398->357|399->358|401->360|402->361|402->361|402->361|403->362|404->363|405->364|405->364|405->364|406->365|412->371|412->371|412->371|413->372|414->373|414->373|414->373|414->373|414->373|414->373|419->378|419->378|419->378|419->378|419->378|419->378|419->378|419->378|423->382|424->383|425->384|428->387|428->387|428->387|429->388|430->389|432->391|437->396|437->396|437->396|438->397|439->398|439->398|439->398|440->399|440->399|440->399|441->400|441->400|441->400|442->401|443->402|443->402|443->402|443->402|443->402|445->404|445->404|445->404|446->405|447->406|447->406|447->406|447->406|447->406|449->408|450->409|451->410|452->411|453->412|454->413|466->425|466->425|466->425|467->426|468->427|468->427|468->427|469->428|469->428|469->428|470->429|470->429|470->429|471->430|472->431|472->431|472->431|472->431|472->431|474->433|474->433|474->433|475->434|476->435|476->435|476->435|476->435|476->435|478->437|479->438|480->439|481->440|482->441|483->442|495->454|495->454|495->454|496->455|497->456|497->456|497->456|498->457|498->457|498->457|499->458|499->458|499->458|500->459|501->460|501->460|501->460|501->460|501->460|501->460|503->462|503->462|503->462|504->463|505->464|505->464|505->464|505->464|505->464|505->464|507->466|508->467|509->468|510->469|511->470|512->471|520->479
                  -- GENERATED --
              */
          