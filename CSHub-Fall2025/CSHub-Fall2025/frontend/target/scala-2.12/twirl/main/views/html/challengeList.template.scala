
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

object challengeList extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template14[List[Challenge],Challenge,Integer,String,Integer,Integer,Integer,String,Integer,String,String,Long,Integer,Integer,play.twirl.api.HtmlFormat.Appendable] {

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
                    json.url = "/challenge/challengeDetail/" + json.id;
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
                                <th style="cursor: pointer;">Status</th>
                                <th style="cursor: pointer;">Location</th>
                                <th style="width: 130px;">Budget</th>
                                <th style="cursor: pointer;">updateTime</th>
                            </tr>
                        </thead>
                        <tbody>
                        """),_display_(/*193.26*/for((entry, index) <- challenges.zipWithIndex if entry.getStatus() != "closed" ) yield /*193.106*/ {_display_(Seq[Any](format.raw/*193.108*/("""
                            """),format.raw/*194.29*/("""<tr>
                                <td>"""),_display_(/*195.38*/entry/*195.43*/.getId()),format.raw/*195.51*/("""</td>
                                <td>
                                    <a href=""""),_display_(/*197.47*/routes/*197.53*/.ChallengeController.challengeDetail(entry.getId())),format.raw/*197.104*/("""">
                                    """),_display_(/*198.38*/entry/*198.43*/.getChallengeTitle()),format.raw/*198.63*/("""
                                    """),format.raw/*199.37*/("""</a>
                                </td>

                                """),_display_(/*202.34*/if((entry.getShortDescription() != null) && (entry.getShortDescription() != ""))/*202.114*/ {_display_(Seq[Any](format.raw/*202.116*/("""
                                    """),format.raw/*203.37*/("""<td class="tooltip" style="max-width: 450px !important">
                                        """),_display_(/*204.42*/entry/*204.47*/.getShortDescription()),format.raw/*204.69*/("""
                                        """),format.raw/*205.41*/("""<span class="tooltiptext">"""),_display_(/*205.68*/entry/*205.73*/.getShortDescription()),format.raw/*205.95*/("""</span>
                                    </td>
                                """)))}/*207.35*/else/*207.40*/{_display_(Seq[Any](format.raw/*207.41*/("""
                                    """),format.raw/*208.37*/("""<td><span class=""""),_display_(/*208.55*/entry/*208.60*/.getId()),format.raw/*208.68*/(""" """),format.raw/*208.69*/("""editable" data-name="shortDescription">&ensp; -</span></td>
                                """)))}),format.raw/*209.34*/("""

                                """),_display_(/*211.34*/if(entry.getStatus() == "open")/*211.65*/ {_display_(Seq[Any](format.raw/*211.67*/("""
                                    """),format.raw/*212.37*/("""<td>
                                        <span class="new badge light-green darken-1" data-badge-caption="open"></span>
                                    </td>
                                """)))}/*215.35*/else if(entry.getStatus() == "pending")/*215.74*/{_display_(Seq[Any](format.raw/*215.75*/("""
                                """),format.raw/*216.33*/("""<td>
                                    <span class="new badge purple darken-1" data-badge-caption="pending"></span>
                                </td>
                                """),format.raw/*219.105*/("""
                                """),format.raw/*220.73*/("""
                                """),format.raw/*221.146*/("""
                                """),format.raw/*222.74*/("""
                                """)))}/*223.34*/else/*223.38*/{_display_(Seq[Any](format.raw/*223.39*/("""
                                """),format.raw/*224.33*/("""<td>
                                    <span class="new badge blue darken-3" data-badge-caption="updated"></span>
                                </td>
                                """)))}),format.raw/*227.34*/("""

                                """),_display_(/*229.34*/if(entry.getLocation() != "")/*229.63*/ {_display_(Seq[Any](format.raw/*229.65*/("""
                                    """),format.raw/*230.37*/("""<td>
                                        <span class=""""),_display_(/*231.55*/entry/*231.60*/.getId()),format.raw/*231.68*/(""" """),format.raw/*231.69*/("""editable" data-name="location"></span>
                                        """),_display_(/*232.42*/entry/*232.47*/.getLocation()),format.raw/*232.61*/("""
                                    """),format.raw/*233.37*/("""</td>
                                """)))}/*234.35*/else/*234.40*/{_display_(Seq[Any](format.raw/*234.41*/("""
                                    """),format.raw/*235.37*/("""<td><span class=""""),_display_(/*235.55*/entry/*235.60*/.getId()),format.raw/*235.68*/(""" """),format.raw/*235.69*/("""editable" data-name="location"> -</span></td>
                                """)))}),format.raw/*236.34*/("""
                                """),_display_(/*237.34*/if(entry.getBudget() != "")/*237.61*/ {_display_(Seq[Any](format.raw/*237.63*/("""
                                    """),format.raw/*238.37*/("""<td>
                                        <span class=""""),_display_(/*239.55*/entry/*239.60*/.getId()),format.raw/*239.68*/(""" """),format.raw/*239.69*/("""editable" data-name="budget"></span>
                                        """),_display_(/*240.42*/entry/*240.47*/.getBudget()),format.raw/*240.59*/("""
                                    """),format.raw/*241.37*/("""</td>
                                """)))}/*242.35*/else/*242.40*/{_display_(Seq[Any](format.raw/*242.41*/("""
                                    """),format.raw/*243.37*/("""<td><span class=""""),_display_(/*243.55*/entry/*243.60*/.getId()),format.raw/*243.68*/(""" """),format.raw/*243.69*/("""editable" data-name="budget"> -</span></td>
                                """)))}),format.raw/*244.34*/("""
                                """),_display_(/*245.34*/if(entry.getUpdateTime() != "")/*245.65*/ {_display_(Seq[Any](format.raw/*245.67*/("""
                                    """),format.raw/*246.37*/("""<td><span class=""""),_display_(/*246.55*/entry/*246.60*/.getId()),format.raw/*246.68*/(""" """),format.raw/*246.69*/("""editable" data-name='updateTime'></span>
                                        """),_display_(/*247.42*/entry/*247.47*/.getUpdateTime()),format.raw/*247.63*/("""
                                    """),format.raw/*248.37*/("""</td>
                                """)))}/*249.35*/else/*249.40*/{_display_(Seq[Any](format.raw/*249.41*/("""
                                    """),format.raw/*250.37*/("""<td><span class=""""),_display_(/*250.55*/entry/*250.60*/.getId()),format.raw/*250.68*/(""" """),format.raw/*250.69*/("""editable" data-name='updateTime'>&ensp; -</span></td>
                                """)))}),format.raw/*251.34*/("""
                            """),format.raw/*252.29*/("""</tr>
                        """)))}),format.raw/*253.26*/("""
                        """),format.raw/*254.25*/("""</tbody>
                    </table>

                    <div class="row">
                        <div class="col s12">
                            <ul class="pagination center-align">
                                """),_display_(/*260.34*/if(listType.equals("all"))/*260.60*/ {_display_(Seq[Any](format.raw/*260.62*/("""
                                    """),_display_(/*261.38*/if(pageNum == 1)/*261.54*/ {_display_(Seq[Any](format.raw/*261.56*/("""
                                        """),format.raw/*262.41*/("""<li class="waves-effect disabled" style="color: #c3bfbf;">
                                            <i class="material-icons">first_page</i>
                                        </li>
                                        <li class="waves-effect disabled" style="color: #c3bfbf;">
                                            <i class="material-icons">chevron_left</i>
                                        </li>
                                    """)))}/*268.39*/else/*268.44*/{_display_(Seq[Any](format.raw/*268.45*/("""
                                        """),format.raw/*269.41*/("""<li class="waves-effect">
                                            <a href=""""),_display_(/*270.55*/routes/*270.61*/.ChallengeController.challengeList(1, sort)),format.raw/*270.104*/("""">
                                                <i class="material-icons">first_page</i>
                                            </a>
                                        </li>
                                        <li class="waves-effect">
                                            <a href=""""),_display_(/*275.55*/routes/*275.61*/.ChallengeController.challengeList(pageNum - 1, sort)),format.raw/*275.114*/("""">
                                                <i class="material-icons">chevron_left</i>
                                            </a>
                                        </li>
                                    """)))}),format.raw/*279.38*/("""
                                    """),_display_(/*280.38*/if(beginIndexForPagination > 1)/*280.69*/ {_display_(Seq[Any](format.raw/*280.71*/("""
                                        """),format.raw/*281.41*/("""<li class="waves-effect modal-trigger" href="#allPageModal" style="cursor: pointer; font-size: 20px; font-weight: bold">...</li>
                                    """)))}),format.raw/*282.38*/("""
                                    """),_display_(/*283.38*/for(i <- (beginIndexForPagination + 0) to (endIndexForPagination + 0)) yield /*283.108*/ {_display_(Seq[Any](format.raw/*283.110*/("""
                                        """),format.raw/*284.41*/("""<li """),_display_(/*284.46*/if(pageNum == i)/*284.62*/ {_display_(Seq[Any](format.raw/*284.64*/(""" """),format.raw/*284.65*/("""class="active" """)))}),format.raw/*284.81*/(""">
                                            <a href=""""),_display_(/*285.55*/routes/*285.61*/.ChallengeController.challengeList(i, sort)),format.raw/*285.104*/("""">"""),_display_(/*285.107*/i),format.raw/*285.108*/("""</a>
                                        </li>
                                    """)))}),format.raw/*287.38*/("""
                                    """),_display_(/*288.38*/if(endIndexForPagination < ((total - 1) / pageLimit + 1))/*288.95*/ {_display_(Seq[Any](format.raw/*288.97*/("""
                                        """),format.raw/*289.41*/("""<li class="waves-effect modal-trigger" href="#allPageModal" style="cursor: pointer; font-size: 20px; font-weight: bold">...</li>
                                    """)))}),format.raw/*290.38*/("""
                                    """),_display_(/*291.38*/if((offset + count) >= total)/*291.67*/ {_display_(Seq[Any](format.raw/*291.69*/("""
                                        """),format.raw/*292.41*/("""<li class="waves-effect disabled" style="color: #c3bfbf;">
                                            <i class="material-icons">chevron_right</i>
                                        </li>
                                        <li class="waves-effect disabled" style="color: #c3bfbf;">
                                            <i class="material-icons">last_page</i>
                                        </li>
                                    """)))}/*298.39*/else/*298.44*/{_display_(Seq[Any](format.raw/*298.45*/("""
                                        """),format.raw/*299.41*/("""<li class="waves-effect">
                                            <a href=""""),_display_(/*300.55*/routes/*300.61*/.ChallengeController.challengeList(pageNum + 1, sort)),format.raw/*300.114*/("""">
                                                <i class="material-icons">chevron_right</i>
                                            </a>
                                        </li>
                                        <li class="waves-effect">
                                            <a href=""""),_display_(/*305.55*/routes/*305.61*/.ChallengeController.challengeList((total - 1) / pageLimit + 1, sort)),format.raw/*305.130*/("""">
                                                <i class="material-icons">last_page</i>
                                            </a>
                                        </li>
                                    """)))}),format.raw/*309.38*/("""
                                """)))}/*310.35*/else if(listType.equals("my enroll"))/*310.72*/{_display_(Seq[Any](format.raw/*310.73*/("""
                                """),_display_(/*311.34*/if(pageNum == 1)/*311.50*/ {_display_(Seq[Any](format.raw/*311.52*/("""
                                    """),format.raw/*312.37*/("""<li class="waves-effect disabled" style="color: #c3bfbf;">
                                        <i class="material-icons">first_page</i>
                                    </li>
                                    <li class="waves-effect disabled" style="color: #c3bfbf;">
                                        <i class="material-icons">chevron_left</i>
                                    </li>
                                """)))}/*318.35*/else/*318.40*/{_display_(Seq[Any](format.raw/*318.41*/("""
                                    """),format.raw/*319.37*/("""<li class="waves-effect">
                                        <a href=""""),_display_(/*320.51*/routes/*320.57*/.ProjectController.getMyEnrolledProjects(1, sort)),format.raw/*320.106*/("""">
                                            <i class="material-icons">first_page</i>
                                        </a>
                                    </li>
                                    <li class="waves-effect">
                                        <a href=""""),_display_(/*325.51*/routes/*325.57*/.ProjectController.getMyEnrolledProjects(pageNum - 1, sort)),format.raw/*325.116*/("""">
                                            <i class="material-icons">chevron_left</i>
                                        </a>
                                    </li>
                                """)))}),format.raw/*329.34*/("""
                                """),_display_(/*330.34*/if(beginIndexForPagination > 1)/*330.65*/ {_display_(Seq[Any](format.raw/*330.67*/("""
                                    """),format.raw/*331.37*/("""<li class="waves-effect modal-trigger" href="#enrollPageModal" style="cursor: pointer; font-size: 20px; font-weight: bold">...</li>
                                """)))}),format.raw/*332.34*/("""
                                """),_display_(/*333.34*/for(i <- (beginIndexForPagination + 0) to (endIndexForPagination + 0)) yield /*333.104*/ {_display_(Seq[Any](format.raw/*333.106*/("""
                                    """),format.raw/*334.37*/("""<li """),_display_(/*334.42*/if(pageNum == i)/*334.58*/ {_display_(Seq[Any](format.raw/*334.60*/(""" """),format.raw/*334.61*/("""class="active" """)))}),format.raw/*334.77*/(""">
                                        <a href=""""),_display_(/*335.51*/routes/*335.57*/.ProjectController.getMyEnrolledProjects(i, sort)),format.raw/*335.106*/("""">"""),_display_(/*335.109*/i),format.raw/*335.110*/("""</a>
                                    </li>
                                """)))}),format.raw/*337.34*/("""
                                """),_display_(/*338.34*/if(endIndexForPagination < ((total - 1) / pageLimit + 1))/*338.91*/ {_display_(Seq[Any](format.raw/*338.93*/("""
                                    """),format.raw/*339.37*/("""<li class="waves-effect modal-trigger" href="#enrollPageModal" style="cursor: pointer; font-size: 20px; font-weight: bold">...</li>
                                """)))}),format.raw/*340.34*/("""
                                """),_display_(/*341.34*/if((offset + count) >= total)/*341.63*/ {_display_(Seq[Any](format.raw/*341.65*/("""
                                    """),format.raw/*342.37*/("""<li class="waves-effect disabled" style="color: #c3bfbf;">
                                        <i class="material-icons">chevron_right</i>
                                    </li>
                                    <li class="waves-effect disabled" style="color: #c3bfbf;">
                                        <i class="material-icons">last_page</i>
                                    </li>
                                """)))}/*348.35*/else/*348.40*/{_display_(Seq[Any](format.raw/*348.41*/("""
                                    """),format.raw/*349.37*/("""<li class="waves-effect">
                                        <a href=""""),_display_(/*350.51*/routes/*350.57*/.ProjectController.getMyEnrolledProjects(pageNum + 1, sort)),format.raw/*350.116*/("""">
                                            <i class="material-icons">chevron_right</i>
                                        </a>
                                    </li>
                                    <li class="waves-effect">
                                        <a href=""""),_display_(/*355.51*/routes/*355.57*/.ProjectController.getMyEnrolledProjects((total - 1) / pageLimit + 1, sort)),format.raw/*355.132*/("""">
                                            <i class="material-icons">last_page</i>
                                        </a>
                                    </li>
                                """)))}),format.raw/*359.34*/("""
                                """)))}/*360.35*/else/*360.40*/{_display_(Seq[Any](format.raw/*360.41*/("""
                                """),_display_(/*361.34*/if(pageNum == 1)/*361.50*/ {_display_(Seq[Any](format.raw/*361.52*/("""
                                    """),format.raw/*362.37*/("""<li class="waves-effect disabled" style="color: #c3bfbf;">
                                        <i class="material-icons">first_page</i>
                                    </li>
                                    <li class="waves-effect disabled" style="color: #c3bfbf;">
                                        <i class="material-icons">chevron_left</i>
                                    </li>
                                """)))}/*368.35*/else/*368.40*/{_display_(Seq[Any](format.raw/*368.41*/("""
                                    """),format.raw/*369.37*/("""<li class="waves-effect">
                                        <a href="#!" onclick="jumpToPage(1, '"""),_display_(/*370.79*/sort),format.raw/*370.83*/("""', '"""),_display_(/*370.88*/searchBody),format.raw/*370.98*/("""')">
                                            <i class="material-icons">first_page</i>
                                        </a>
                                    </li>
                                    <li class="waves-effect">
                                        <a href="#!" onclick="jumpToPage("""),_display_(/*375.75*/pageNum),format.raw/*375.82*/("""-1, '"""),_display_(/*375.88*/sort),format.raw/*375.92*/("""', '"""),_display_(/*375.97*/searchBody),format.raw/*375.107*/("""')">
                                            <i class="material-icons">chevron_left</i>
                                        </a>
                                    </li>
                                """)))}),format.raw/*379.34*/("""
                                """),_display_(/*380.34*/if(beginIndexForPagination > 1)/*380.65*/ {_display_(Seq[Any](format.raw/*380.67*/("""
                                    """),format.raw/*381.37*/("""<li class="waves-effect modal-trigger" href="#searchPageModal" style="cursor: pointer; font-size: 20px; font-weight: bold">...</li>
                                """)))}),format.raw/*382.34*/("""
                                """),_display_(/*383.34*/for(i <- (beginIndexForPagination + 0) to (endIndexForPagination + 0)) yield /*383.104*/ {_display_(Seq[Any](format.raw/*383.106*/("""
                                    """),format.raw/*384.37*/("""<li """),_display_(/*384.42*/if(pageNum == i)/*384.58*/ {_display_(Seq[Any](format.raw/*384.60*/(""" """),format.raw/*384.61*/("""class="active" """)))}),format.raw/*384.77*/(""">
                                        <a href="#!" onclick="jumpToPage("""),_display_(/*385.75*/i),format.raw/*385.76*/(""", '"""),_display_(/*385.80*/sort),format.raw/*385.84*/("""', '"""),_display_(/*385.89*/searchBody),format.raw/*385.99*/("""')">
                                        """),_display_(/*386.42*/i),format.raw/*386.43*/("""
                                        """),format.raw/*387.41*/("""</a>
                                    </li>
                                """)))}),format.raw/*389.34*/("""
                                """),_display_(/*390.34*/if(endIndexForPagination < ((total - 1) / pageLimit + 1))/*390.91*/ {_display_(Seq[Any](format.raw/*390.93*/("""
                                    """),format.raw/*391.37*/("""<li class="waves-effect modal-trigger" href="#searchPageModal" style="cursor: pointer; font-size: 20px; font-weight: bold">...</li>
                                """)))}),format.raw/*392.34*/("""
                                """),_display_(/*393.34*/if((offset + count) >= total)/*393.63*/ {_display_(Seq[Any](format.raw/*393.65*/("""
                                    """),format.raw/*394.37*/("""<li class="waves-effect disabled" style="color: #c3bfbf;">
                                        <i class="material-icons">chevron_right</i>
                                    </li>
                                    <li class="waves-effect disabled" style="color: #c3bfbf;">
                                        <i class="material-icons">last_page</i>
                                    </li>
                                """)))}/*400.35*/else/*400.40*/{_display_(Seq[Any](format.raw/*400.41*/("""
                                    """),format.raw/*401.37*/("""<li class="waves-effect">
                                        <a href="#!" onclick="jumpToPage("""),_display_(/*402.75*/pageNum),format.raw/*402.82*/("""+1, '"""),_display_(/*402.88*/sort),format.raw/*402.92*/("""', '"""),_display_(/*402.97*/searchBody),format.raw/*402.107*/("""')">
                                            <i class="material-icons">chevron_right</i>
                                        </a>
                                    </li>
                                    <li class="waves-effect">
                                        <a href="#!" onclick="jumpToPage(("""),_display_(/*407.76*/total),format.raw/*407.81*/("""-1)/("""),_display_(/*407.87*/pageLimit),format.raw/*407.96*/(""")+1, '"""),_display_(/*407.103*/sort),format.raw/*407.107*/("""', '"""),_display_(/*407.112*/searchBody),format.raw/*407.122*/("""')">
                                            <i class="material-icons">last_page</i>
                                        </a>
                                    </li>
                                """)))}),format.raw/*411.34*/("""
                                """)))}),format.raw/*412.34*/("""
                            """),format.raw/*413.29*/("""</ul>
                        </div>
                    </div>
                """)))}/*416.19*/else/*416.24*/{_display_(Seq[Any](format.raw/*416.25*/("""
                    """),format.raw/*417.21*/("""<h5>No challenge was found.</h5>
                """)))}),format.raw/*418.18*/("""

                    """),format.raw/*420.21*/("""<!-- All Page Modal -->
                <div id="allPageModal" class="modal">
                    <div class="modal-content">
                        <h6>Select the page number you want to jump to</h6>
                        <div class="card z-depth-0">
                        """),_display_(/*425.26*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*425.83*/ {_display_(Seq[Any](format.raw/*425.85*/("""
                            """),format.raw/*426.29*/("""<ul class="pagination center-align">
                            """),_display_(/*427.30*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*427.69*/ {_display_(Seq[Any](format.raw/*427.71*/("""
                                """),_display_(/*428.34*/if(j <= ((total - 1)/(pageLimit) + 1))/*428.72*/ {_display_(Seq[Any](format.raw/*428.74*/("""
                                    """),_display_(/*429.38*/if(j != pageNum)/*429.54*/ {_display_(Seq[Any](format.raw/*429.56*/("""
                                        """),format.raw/*430.41*/("""<li class="waves-effect grey lighten-3">
                                            <a href='"""),_display_(/*431.55*/routes/*431.61*/.ChallengeController.challengeList(j, sort)),format.raw/*431.104*/("""'>"""),_display_(/*431.107*/j),format.raw/*431.108*/("""</a>
                                        </li>
                                    """)))}/*433.39*/else/*433.44*/{_display_(Seq[Any](format.raw/*433.45*/("""
                                        """),format.raw/*434.41*/("""<li class="waves-effect active">
                                            <a href='"""),_display_(/*435.55*/routes/*435.61*/.ChallengeController.challengeList(j, sort)),format.raw/*435.104*/("""'>"""),_display_(/*435.107*/j),format.raw/*435.108*/("""</a>
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

                    <!-- Enrolled Page Modal -->
                <div id="enrollPageModal" class="modal">
                    <div class="modal-content">
                        <h6>Select the page number you want to jump to</h6>
                        <div class="card z-depth-0">
                        """),_display_(/*454.26*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*454.83*/ {_display_(Seq[Any](format.raw/*454.85*/("""
                            """),format.raw/*455.29*/("""<ul class="pagination center-align">
                            """),_display_(/*456.30*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*456.69*/ {_display_(Seq[Any](format.raw/*456.71*/("""
                                """),_display_(/*457.34*/if(j <= ((total - 1)/(pageLimit) + 1))/*457.72*/ {_display_(Seq[Any](format.raw/*457.74*/("""
                                    """),_display_(/*458.38*/if(j != pageNum)/*458.54*/ {_display_(Seq[Any](format.raw/*458.56*/("""
                                        """),format.raw/*459.41*/("""<li class="waves-effect grey lighten-3">
                                            <a href='"""),_display_(/*460.55*/routes/*460.61*/.ProjectController.getMyEnrolledProjects(j, sort)),format.raw/*460.110*/("""'>"""),_display_(/*460.113*/j),format.raw/*460.114*/("""</a>
                                        </li>
                                    """)))}/*462.39*/else/*462.44*/{_display_(Seq[Any](format.raw/*462.45*/("""
                                        """),format.raw/*463.41*/("""<li class="waves-effect active">
                                            <a href='"""),_display_(/*464.55*/routes/*464.61*/.ProjectController.getMyEnrolledProjects(j, sort)),format.raw/*464.110*/("""'>"""),_display_(/*464.113*/j),format.raw/*464.114*/("""</a>
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

                    <!-- Search Page Modal -->
                <div id="searchPageModal" class="modal">
                    <div class="modal-content">
                        <h6>Select the page number you want to jump to</h6>
                        <div class="card z-depth-0">
                        """),_display_(/*483.26*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*483.83*/ {_display_(Seq[Any](format.raw/*483.85*/("""
                            """),format.raw/*484.29*/("""<ul class="pagination center-align">
                            """),_display_(/*485.30*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*485.69*/ {_display_(Seq[Any](format.raw/*485.71*/("""
                                """),_display_(/*486.34*/if(j <= ((total - 1)/(pageLimit) + 1))/*486.72*/ {_display_(Seq[Any](format.raw/*486.74*/("""
                                    """),_display_(/*487.38*/if(j != pageNum)/*487.54*/ {_display_(Seq[Any](format.raw/*487.56*/("""
                                        """),format.raw/*488.41*/("""<li class="waves-effect grey lighten-3">
                                            <a href="#!" onclick="jumpToPage("""),_display_(/*489.79*/j),format.raw/*489.80*/(""", 'id', '"""),_display_(/*489.90*/searchBody),format.raw/*489.100*/("""')">"""),_display_(/*489.105*/j),format.raw/*489.106*/("""</a>
                                        </li>
                                    """)))}/*491.39*/else/*491.44*/{_display_(Seq[Any](format.raw/*491.45*/("""
                                        """),format.raw/*492.41*/("""<li class="waves-effect active">
                                            <a href="#!" onclick="jumpToPage("""),_display_(/*493.79*/j),format.raw/*493.80*/(""", 'id', '"""),_display_(/*493.90*/searchBody),format.raw/*493.100*/("""')">"""),_display_(/*493.105*/j),format.raw/*493.106*/("""</a>
                                        </li>
                                    """)))}),format.raw/*495.38*/("""
                                """)))}),format.raw/*496.34*/("""
                            """)))}),format.raw/*497.30*/("""
                            """),format.raw/*498.29*/("""</ul>
                        """)))}),format.raw/*499.26*/("""
                        """),format.raw/*500.25*/("""</div>
                    </div>
                    <div class="modal-footer">
                        <a href="#!" class="modal-close waves-effect waves-green btn-flat">Cancel</a>
                    </div>
                </div>
            </div>
        </div>
    """)))}),format.raw/*508.6*/("""
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
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/challengeList.scala.html
                  HASH: 33ff2e9a3dd59462c7f08fda3a71d9e316de9b53
                  MATRIX: 1228->1|1694->399|1718->420|1742->441|1779->471|1795->478|1876->482|1912->491|1967->519|1982->525|2041->563|2167->661|2196->662|2245->683|2324->735|2373->768|2413->770|2462->791|2501->802|2530->803|2559->804|2620->838|2639->848|2675->863|2811->972|2830->982|2876->1007|3095->1195|3144->1216|3458->1502|3487->1503|3584->1572|3613->1573|3662->1594|4486->2390|4515->2391|4561->2409|4614->2434|4643->2435|4692->2456|4937->2673|4966->2674|5019->2699|5153->2805|5182->2806|5211->2807|5676->3244|5705->3245|5762->3274|5923->3407|5952->3408|6005->3433|6147->3547|6176->3548|6225->3569|6281->3597|6310->3598|6346->3607|6428->3661|6457->3662|6506->3683|6663->3812|6692->3813|6728->3822|6782->393|6814->415|6845->436|6876->465|6908->3836|6941->3843|6981->3874|7021->3876|7057->3885|7169->3970|7207->3999|7247->4001|7296->4022|7757->4464|7798->4496|7839->4498|7885->4515|8361->4959|8408->4978|8443->5003|8484->5005|8534->5026|9117->5581|9153->5595|9183->5596|9215->5600|9256->5618|9287->5619|9320->5623|9348->5628|9886->6138|9917->6159|9958->6161|10028->6202|10098->6252|10146->6290|10186->6291|10248->6324|10317->6373|10367->6413|10407->6414|10469->6447|10540->6498|10582->6530|10622->6531|10684->6564|10746->6606|10786->6636|10826->6637|10888->6670|10947->6709|10961->6713|11001->6714|11063->6747|11141->6793|11199->6822|11479->7074|11515->7100|11556->7102|11618->7135|11660->7149|11676->7155|11741->7198|11906->7335|11922->7341|12000->7396|12176->7544|12192->7550|12272->7607|12450->7757|12466->7763|12538->7812|12707->7953|12723->7959|12793->8006|12934->8128|12948->8133|12988->8134|13050->8167|13153->8242|13185->8252|13504->8543|13536->8553|13860->8849|13892->8859|14223->9162|14255->9172|14494->9379|14552->9408|15526->10354|15624->10434|15666->10436|15724->10465|15794->10507|15809->10512|15839->10520|15956->10609|15972->10615|16046->10666|16114->10706|16129->10711|16171->10731|16237->10768|16342->10845|16433->10925|16475->10927|16541->10964|16667->11062|16682->11067|16726->11089|16796->11130|16851->11157|16866->11162|16910->11184|17013->11268|17027->11273|17067->11274|17133->11311|17179->11329|17194->11334|17224->11342|17254->11343|17379->11436|17442->11471|17483->11502|17524->11504|17590->11541|17809->11741|17858->11780|17898->11781|17960->11814|18178->12074|18240->12147|18303->12293|18365->12367|18419->12401|18433->12405|18473->12406|18535->12439|18754->12626|18817->12661|18856->12690|18897->12692|18963->12729|19050->12788|19065->12793|19095->12801|19125->12802|19233->12882|19248->12887|19284->12901|19350->12938|19409->12978|19423->12983|19463->12984|19529->13021|19575->13039|19590->13044|19620->13052|19650->13053|19761->13132|19823->13166|19860->13193|19901->13195|19967->13232|20054->13291|20069->13296|20099->13304|20129->13305|20235->13383|20250->13388|20284->13400|20350->13437|20409->13477|20423->13482|20463->13483|20529->13520|20575->13538|20590->13543|20620->13551|20650->13552|20759->13629|20821->13663|20862->13694|20903->13696|20969->13733|21015->13751|21030->13756|21060->13764|21090->13765|21200->13847|21215->13852|21253->13868|21319->13905|21378->13945|21392->13950|21432->13951|21498->13988|21544->14006|21559->14011|21589->14019|21619->14020|21738->14107|21796->14136|21859->14167|21913->14192|22162->14413|22198->14439|22239->14441|22305->14479|22331->14495|22372->14497|22442->14538|22921->14998|22935->15003|22975->15004|23045->15045|23153->15125|23169->15131|23235->15174|23570->15481|23586->15487|23662->15540|23920->15766|23986->15804|24027->15835|24068->15837|24138->15878|24336->16044|24402->16082|24490->16152|24532->16154|24602->16195|24635->16200|24661->16216|24702->16218|24732->16219|24780->16235|24864->16291|24880->16297|24946->16340|24978->16343|25002->16344|25122->16432|25188->16470|25255->16527|25296->16529|25366->16570|25564->16736|25630->16774|25669->16803|25710->16805|25780->16846|26259->17306|26273->17311|26313->17312|26383->17353|26491->17433|26507->17439|26583->17492|26921->17802|26937->17808|27029->17877|27284->18100|27338->18135|27385->18172|27425->18173|27487->18207|27513->18223|27554->18225|27620->18262|28075->18698|28089->18703|28129->18704|28195->18741|28299->18817|28315->18823|28387->18872|28702->19159|28718->19165|28800->19224|29042->19434|29104->19468|29145->19499|29186->19501|29252->19538|29449->19703|29511->19737|29599->19807|29641->19809|29707->19846|29740->19851|29766->19867|29807->19869|29837->19870|29885->19886|29965->19938|29981->19944|30053->19993|30085->19996|30109->19997|30221->20077|30283->20111|30350->20168|30391->20170|30457->20207|30654->20372|30716->20406|30755->20435|30796->20437|30862->20474|31317->20910|31331->20915|31371->20916|31437->20953|31541->21029|31557->21035|31639->21094|31957->21384|31973->21390|32071->21465|32310->21672|32364->21707|32378->21712|32418->21713|32480->21747|32506->21763|32547->21765|32613->21802|33068->22238|33082->22243|33122->22244|33188->22281|33320->22385|33346->22389|33379->22394|33411->22404|33752->22717|33781->22724|33815->22730|33841->22734|33874->22739|33907->22749|34151->22961|34213->22995|34254->23026|34295->23028|34361->23065|34558->23230|34620->23264|34708->23334|34750->23336|34816->23373|34849->23378|34875->23394|34916->23396|34946->23397|34994->23413|35098->23489|35121->23490|35153->23494|35179->23498|35212->23503|35244->23513|35318->23559|35341->23560|35411->23601|35523->23681|35585->23715|35652->23772|35693->23774|35759->23811|35956->23976|36018->24010|36057->24039|36098->24041|36164->24078|36619->24514|36633->24519|36673->24520|36739->24557|36867->24657|36896->24664|36930->24670|36956->24674|36989->24679|37022->24689|37367->25006|37394->25011|37428->25017|37459->25026|37495->25033|37522->25037|37556->25042|37589->25052|37830->25261|37896->25295|37954->25324|38055->25406|38069->25411|38109->25412|38159->25433|38241->25483|38292->25505|38600->25785|38674->25842|38715->25844|38773->25873|38867->25939|38923->25978|38964->25980|39026->26014|39074->26052|39115->26054|39181->26092|39207->26108|39248->26110|39318->26151|39441->26246|39457->26252|39523->26295|39555->26298|39579->26299|39687->26388|39701->26393|39741->26394|39811->26435|39926->26522|39942->26528|40008->26571|40040->26574|40064->26575|40184->26663|40250->26697|40312->26727|40370->26756|40433->26787|40487->26812|41057->27354|41131->27411|41172->27413|41230->27442|41324->27508|41380->27547|41421->27549|41483->27583|41531->27621|41572->27623|41638->27661|41664->27677|41705->27679|41775->27720|41898->27815|41914->27821|41986->27870|42018->27873|42042->27874|42150->27963|42164->27968|42204->27969|42274->28010|42389->28097|42405->28103|42477->28152|42509->28155|42533->28156|42653->28244|42719->28278|42781->28308|42839->28337|42902->28368|42956->28393|43524->28933|43598->28990|43639->28992|43697->29021|43791->29087|43847->29126|43888->29128|43950->29162|43998->29200|44039->29202|44105->29240|44131->29256|44172->29258|44242->29299|44389->29418|44412->29419|44450->29429|44483->29439|44517->29444|44541->29445|44649->29534|44663->29539|44703->29540|44773->29581|44912->29692|44935->29693|44973->29703|45006->29713|45040->29718|45064->29719|45184->29807|45250->29841|45312->29871|45370->29900|45433->29931|45487->29956|45790->30228
                  LINES: 35->1|51->15|52->16|53->17|55->19|55->19|57->19|58->20|58->20|58->20|58->20|60->22|60->22|61->23|62->24|62->24|62->24|63->25|63->25|63->25|63->25|64->26|64->26|64->26|66->28|66->28|66->28|69->31|70->32|77->39|77->39|79->41|79->41|80->42|96->58|96->58|98->60|98->60|98->60|99->61|102->64|102->64|103->65|104->66|104->66|104->66|112->74|112->74|113->75|115->77|115->77|116->78|118->80|118->80|119->81|120->82|120->82|121->83|123->85|123->85|124->86|127->89|127->89|128->90|130->14|131->16|131->17|131->18|132->91|134->93|134->93|134->93|135->94|137->96|137->96|137->96|138->97|145->104|145->104|145->104|146->105|153->112|155->114|155->114|155->114|156->115|167->126|167->126|167->126|167->126|167->126|167->126|167->126|167->126|172->131|172->131|172->131|173->132|174->133|174->133|174->133|175->134|176->135|176->135|176->135|177->136|178->137|178->137|178->137|179->138|180->139|180->139|180->139|181->140|182->141|182->141|182->141|183->142|184->143|185->144|190->149|190->149|190->149|191->150|191->150|191->150|191->150|192->151|192->151|192->151|193->152|193->152|193->152|194->153|194->153|194->153|195->154|195->154|195->154|196->155|196->155|196->155|197->156|198->157|198->157|203->162|203->162|208->167|208->167|213->172|213->172|217->176|218->177|234->193|234->193|234->193|235->194|236->195|236->195|236->195|238->197|238->197|238->197|239->198|239->198|239->198|240->199|243->202|243->202|243->202|244->203|245->204|245->204|245->204|246->205|246->205|246->205|246->205|248->207|248->207|248->207|249->208|249->208|249->208|249->208|249->208|250->209|252->211|252->211|252->211|253->212|256->215|256->215|256->215|257->216|260->219|261->220|262->221|263->222|264->223|264->223|264->223|265->224|268->227|270->229|270->229|270->229|271->230|272->231|272->231|272->231|272->231|273->232|273->232|273->232|274->233|275->234|275->234|275->234|276->235|276->235|276->235|276->235|276->235|277->236|278->237|278->237|278->237|279->238|280->239|280->239|280->239|280->239|281->240|281->240|281->240|282->241|283->242|283->242|283->242|284->243|284->243|284->243|284->243|284->243|285->244|286->245|286->245|286->245|287->246|287->246|287->246|287->246|287->246|288->247|288->247|288->247|289->248|290->249|290->249|290->249|291->250|291->250|291->250|291->250|291->250|292->251|293->252|294->253|295->254|301->260|301->260|301->260|302->261|302->261|302->261|303->262|309->268|309->268|309->268|310->269|311->270|311->270|311->270|316->275|316->275|316->275|320->279|321->280|321->280|321->280|322->281|323->282|324->283|324->283|324->283|325->284|325->284|325->284|325->284|325->284|325->284|326->285|326->285|326->285|326->285|326->285|328->287|329->288|329->288|329->288|330->289|331->290|332->291|332->291|332->291|333->292|339->298|339->298|339->298|340->299|341->300|341->300|341->300|346->305|346->305|346->305|350->309|351->310|351->310|351->310|352->311|352->311|352->311|353->312|359->318|359->318|359->318|360->319|361->320|361->320|361->320|366->325|366->325|366->325|370->329|371->330|371->330|371->330|372->331|373->332|374->333|374->333|374->333|375->334|375->334|375->334|375->334|375->334|375->334|376->335|376->335|376->335|376->335|376->335|378->337|379->338|379->338|379->338|380->339|381->340|382->341|382->341|382->341|383->342|389->348|389->348|389->348|390->349|391->350|391->350|391->350|396->355|396->355|396->355|400->359|401->360|401->360|401->360|402->361|402->361|402->361|403->362|409->368|409->368|409->368|410->369|411->370|411->370|411->370|411->370|416->375|416->375|416->375|416->375|416->375|416->375|420->379|421->380|421->380|421->380|422->381|423->382|424->383|424->383|424->383|425->384|425->384|425->384|425->384|425->384|425->384|426->385|426->385|426->385|426->385|426->385|426->385|427->386|427->386|428->387|430->389|431->390|431->390|431->390|432->391|433->392|434->393|434->393|434->393|435->394|441->400|441->400|441->400|442->401|443->402|443->402|443->402|443->402|443->402|443->402|448->407|448->407|448->407|448->407|448->407|448->407|448->407|448->407|452->411|453->412|454->413|457->416|457->416|457->416|458->417|459->418|461->420|466->425|466->425|466->425|467->426|468->427|468->427|468->427|469->428|469->428|469->428|470->429|470->429|470->429|471->430|472->431|472->431|472->431|472->431|472->431|474->433|474->433|474->433|475->434|476->435|476->435|476->435|476->435|476->435|478->437|479->438|480->439|481->440|482->441|483->442|495->454|495->454|495->454|496->455|497->456|497->456|497->456|498->457|498->457|498->457|499->458|499->458|499->458|500->459|501->460|501->460|501->460|501->460|501->460|503->462|503->462|503->462|504->463|505->464|505->464|505->464|505->464|505->464|507->466|508->467|509->468|510->469|511->470|512->471|524->483|524->483|524->483|525->484|526->485|526->485|526->485|527->486|527->486|527->486|528->487|528->487|528->487|529->488|530->489|530->489|530->489|530->489|530->489|530->489|532->491|532->491|532->491|533->492|534->493|534->493|534->493|534->493|534->493|534->493|536->495|537->496|538->497|539->498|540->499|541->500|549->508
                  -- GENERATED --
              */
          