
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

object paperList extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template13[List[Paper],Integer,String,Integer,Integer,Integer,String,Integer,String,String,Long,Integer,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(entries: List[Paper],
        pageNum: Integer,
        sort: String,
        offset: Integer,
        total: Integer,
        count: Integer,
        listType: String,
        pageLimit: Integer,
        searchBody: String,
        title: String,
        id: Long, beginIndexForPagination: Integer, endIndexForPagination: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*12.6*/import helper._;
/*13.6*/import models._
/*14.2*/import models.Paper

def /*16.2*/scripts/*16.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*16.13*/("""
        """),format.raw/*17.9*/("""<script type = "module" src='"""),_display_(/*17.39*/routes/*17.45*/.Assets.at("javascripts/voiceJump.js")),format.raw/*17.83*/("""'></script>
        <script type="text/javascript">

                $(document).ready(function () """),format.raw/*20.47*/("""{"""),format.raw/*20.48*/("""
                    """),format.raw/*21.21*/("""var nasaEndorsedAPIArray = []
                    """),_display_(/*22.22*/for(i <- 0 until entries.size) yield /*22.52*/ {_display_(Seq[Any](format.raw/*22.54*/("""
                    """),format.raw/*23.21*/("""var json = """),format.raw/*23.32*/("""{"""),format.raw/*23.33*/("""}"""),format.raw/*23.34*/(""";
                    json.id = '"""),_display_(/*24.33*/entries/*24.40*/.get(i).getId()),format.raw/*24.55*/("""';
                    json.url = "/paper/paperDetail/" + json.id;

                    json.name = '"""),_display_(/*27.35*/entries/*27.42*/.get(i).getTitle),format.raw/*27.58*/("""'.replace(/[^a-zA-Z0-9]/g, " ").replace(/  +/g, " ").trim();
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

                    var url = "/paper/searchPOST?pageNum=" + (pageNum) + "&sortCriteria=" + sort;
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
                """),format.raw/*88.17*/("""function changeView(view) """),format.raw/*88.43*/("""{"""),format.raw/*88.44*/("""
                    """),format.raw/*89.21*/("""$.ajax("""),format.raw/*89.28*/("""{"""),format.raw/*89.29*/("""
                        """),format.raw/*90.25*/("""url: "/updateProjectZone/" + view,
                        headers: """),format.raw/*91.34*/("""{"""),format.raw/*91.35*/("""
                            """),format.raw/*92.29*/("""'Content-Type': 'application/json'
                        """),format.raw/*93.25*/("""}"""),format.raw/*93.26*/(""",
                        type: "GET"
                    """),format.raw/*95.21*/("""}"""),format.raw/*95.22*/(""").done(function (data) """),format.raw/*95.45*/("""{"""),format.raw/*95.46*/("""
                        """),format.raw/*96.25*/("""window.location.href = "/author/authorList/1?sortCriteria=id";
                    """),format.raw/*97.21*/("""}"""),format.raw/*97.22*/(""");
                """),format.raw/*98.17*/("""}"""),format.raw/*98.18*/("""
        """),format.raw/*99.9*/("""</script>
        <style>
                .follow-fab """),format.raw/*101.29*/("""{"""),format.raw/*101.30*/("""
                    """),format.raw/*102.21*/("""top: -20px !important;
                    bottom: auto !important;
                    right: -20px !important;
                """),format.raw/*105.17*/("""}"""),format.raw/*105.18*/("""
        """),format.raw/*106.9*/("""</style>
    """)))};
Seq[Any](format.raw/*11.84*/("""
    """),format.raw/*13.1*/("""    """),format.raw/*15.1*/("""
"""),format.raw/*107.6*/("""

    """),_display_(/*109.6*/main("All Papers", scripts)/*109.33*/ {_display_(Seq[Any](format.raw/*109.35*/("""
        """),format.raw/*110.9*/("""<div class="container">
            <div class="card-panel center">

                """),_display_(/*113.18*/if(listType.equals("search"))/*113.47*/ {_display_(Seq[Any](format.raw/*113.49*/("""
                    """),format.raw/*114.21*/("""<div class="row card-panel z-depth-0 paper-zone-panel">
                        <div class="col s12" style="margin-top: -10px;
                            margin-bottom: -10px;">
                            <h6 class="center tooltipped" data-position="bottom" data-tooltip="This list shows the search results." >
                                Search Result
                            </h6>
                        </div>
                    </div>
                """)))}),format.raw/*122.18*/("""
                """),_display_(/*123.18*/if(entries.size() > 0)/*123.40*/ {_display_(Seq[Any](format.raw/*123.42*/("""
                    """),format.raw/*124.21*/("""<div class="col s8 offset-s2">
                        <h4>Paper List</h4>

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
                                offset +1
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
                                """),_display_(/*150.34*/if(sort.equals("id"))/*150.55*/{_display_(Seq[Any](format.raw/*150.56*/("""
                                    """),format.raw/*151.37*/("""Paper ID
                                """)))}/*152.34*/else/*152.39*/{_display_(Seq[Any](format.raw/*152.40*/("""
                                    """),format.raw/*153.37*/("""Paper Title
                                """)))}),format.raw/*154.34*/("""</font> <i class="material-icons right">expand_more</i></a>

                                <!-- Dropdown Structure -->
                            <ul id='dropdown2' class='dropdown-content'>
                            """),_display_(/*158.30*/if(listType.equals("all"))/*158.56*/ {_display_(Seq[Any](format.raw/*158.58*/("""
                                """),format.raw/*159.33*/("""<li><a href=""""),_display_(/*159.47*/routes/*159.53*/.PaperController.paperList(1, "id")),format.raw/*159.88*/("""" class="grey-text text-darken-4"><i class="material-icons">
                                    event</i>Paper ID</a></li>
                                <li><a href=""""),_display_(/*161.47*/routes/*161.53*/.PaperController.paperList(1, "title")),format.raw/*161.91*/("""" class="grey-text text-darken-4"><i class="material-icons">
                                    sort_by_alpha</i>Paper Title </a></li>
                             """)))}/*163.31*/else/*163.36*/{_display_(Seq[Any](format.raw/*163.37*/("""
                                """),format.raw/*164.33*/("""<li>
                                    <a onclick="jumpToPage(1, 'id', '"""),_display_(/*165.71*/searchBody),format.raw/*165.81*/("""')">
                                        <i class="material-icons">event</i>Paper ID
                                    </a>
                                </li>
                                <li>
                                    <a onclick="jumpToPage(1, 'title', '"""),_display_(/*170.74*/searchBody),format.raw/*170.84*/("""')">
                                        <i class="material-icons">sort_by_alpha</i>Paper Title
                                    </a>
                                </li>
                               """)))}),format.raw/*174.33*/("""
                            """),format.raw/*175.29*/("""</ul>
                        </div>
                    </div>
                    <table class="centered responsive-table striped" id="paperTable" >
                        <thead>
                            <tr class="list-header" style="border-bottom: 1px solid;
                            !important;">
                                <th style="cursor: pointer;">Paper Id</th>
                                <th style="cursor: pointer;">Paper Title</th>
                                <th style="cursor: pointer;">Channel</th>
                                <th style="cursor: pointer;">Year</th>
                             </tr>
                        </thead>
                        <tbody>
                        """),_display_(/*189.26*/for((entry, index) <- entries.zipWithIndex) yield /*189.69*/ {_display_(Seq[Any](format.raw/*189.71*/("""
                            """),format.raw/*190.29*/("""<tr>
                                <td>"""),_display_(/*191.38*/entry/*191.43*/.getId()),format.raw/*191.51*/("""</td>

                                <td><a href = """"),_display_(/*193.49*/routes/*193.55*/.PaperController.paperDetail(entry.getId())),format.raw/*193.98*/("""">"""),_display_(/*193.101*/entry/*193.106*/.getTitle()),format.raw/*193.117*/("""</a></td>

                                """),_display_(/*195.34*/if((entry.getBookTitle() != null) && (entry.getBookTitle() != ""))/*195.100*/ {_display_(Seq[Any](format.raw/*195.102*/("""
                                    """),format.raw/*196.108*/("""
                                    """),format.raw/*197.73*/("""
                                    """),format.raw/*198.46*/("""
                                    """),format.raw/*199.37*/("""<td class="tooltip" style="max-width: 450px;
                                    !important">
                                        """),_display_(/*201.42*/entry/*201.47*/.getBookTitle()),format.raw/*201.62*/("""
                                        """),format.raw/*202.41*/("""<span class="tooltiptext"> """),_display_(/*202.69*/entry/*202.74*/.getBookTitle()),format.raw/*202.89*/("""</span>
                                    </td>
                                """)))}/*204.35*/else/*204.40*/{_display_(Seq[Any](format.raw/*204.41*/("""
                                    """),format.raw/*205.37*/("""<td><span class=""""),_display_(/*205.55*/entry/*205.60*/.getId()),format.raw/*205.68*/(""" """),format.raw/*205.69*/("""editable" data-name='goals'>&ensp; -</span></td>
                                """)))}),format.raw/*206.34*/("""

                                """),format.raw/*208.33*/("""<td>"""),_display_(/*208.38*/entry/*208.43*/.getYear()),format.raw/*208.53*/("""</td>


                            </tr>
                        """)))}),format.raw/*212.26*/("""
                        """),format.raw/*213.25*/("""</tbody>
                    </table>
                    <div class="row">
                        <div class="col s12">
                            <ul class="pagination center-align">

                            """),_display_(/*219.30*/if(listType.equals("all"))/*219.56*/ {_display_(Seq[Any](format.raw/*219.58*/("""
                                """),_display_(/*220.34*/if(pageNum == 1)/*220.50*/ {_display_(Seq[Any](format.raw/*220.52*/("""
                                    """),format.raw/*221.37*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">first_page</i></li>
                                    <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">chevron_left</i></li>
                                """)))}/*223.34*/else/*223.38*/{_display_(Seq[Any](format.raw/*223.39*/("""
                                    """),format.raw/*224.37*/("""<li class="waves-effect"><a href=""""),_display_(/*224.72*/routes/*224.78*/.PaperController.paperList(1, sort)),format.raw/*224.113*/(""""><i class="material-icons">first_page</i></a></li>
                                    <li class="waves-effect"><a href=""""),_display_(/*225.72*/routes/*225.78*/.PaperController.paperList(pageNum - 1, sort)),format.raw/*225.123*/(""""><i class="material-icons">chevron_left</i></a></li>
                                """)))}),format.raw/*226.34*/("""
                                """),_display_(/*227.34*/if(beginIndexForPagination>1)/*227.63*/{_display_(Seq[Any](format.raw/*227.64*/("""
                                    """),format.raw/*228.37*/("""<li class="waves-effect modal-trigger" href="#allPageModal" style="cursor: pointer;
                                        font-size: 20px;
                                        font-weight: bold">...</li>
                                """)))}),format.raw/*231.34*/("""
                                """),_display_(/*232.34*/for(i <- (beginIndexForPagination + 0) to (endIndexForPagination + 0)) yield /*232.104*/ {_display_(Seq[Any](format.raw/*232.106*/("""
                                    """),format.raw/*233.37*/("""<li """),_display_(/*233.42*/if(pageNum == i)/*233.58*/ {_display_(Seq[Any](format.raw/*233.60*/("""
                                        """),format.raw/*234.41*/("""class="active"""")))}),format.raw/*234.56*/("""><a href=""""),_display_(/*234.67*/routes/*234.73*/.PaperController.paperList(i, sort)),format.raw/*234.108*/("""">"""),_display_(/*234.111*/i),format.raw/*234.112*/("""</a></li>
                                """)))}),format.raw/*235.34*/("""
                                """),_display_(/*236.34*/if(endIndexForPagination< ((total - 1) / pageLimit + 1))/*236.90*/{_display_(Seq[Any](format.raw/*236.91*/("""
                                    """),format.raw/*237.37*/("""<li class="waves-effect modal-trigger" href="#allPageModal" style="cursor: pointer;
                                        font-size: 20px;
                                        font-weight: bold">...</li>
                                """)))}),format.raw/*240.34*/("""
                                """),_display_(/*241.34*/if((offset + count) >= total)/*241.63*/ {_display_(Seq[Any](format.raw/*241.65*/("""
                                    """),format.raw/*242.37*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">chevron_right</i></li>
                                    <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">last_page</i></li>
                                """)))}/*244.34*/else/*244.39*/{_display_(Seq[Any](format.raw/*244.40*/("""
                                    """),format.raw/*245.37*/("""<li class="waves-effect"><a href=""""),_display_(/*245.72*/routes/*245.78*/.PaperController.paperList(pageNum + 1, sort)),format.raw/*245.123*/(""""><i class="material-icons">chevron_right</i></a></li>
                                    <li class="waves-effect"><a href=""""),_display_(/*246.72*/routes/*246.78*/.PaperController.paperList((total-1)/pageLimit+1, sort)),format.raw/*246.133*/(""""><i class="material-icons">last_page</i></a></li>
                                """)))}),format.raw/*247.34*/("""
                            """)))}/*248.30*/else/*248.34*/{_display_(Seq[Any](format.raw/*248.35*/("""
                                """),_display_(/*249.34*/if(pageNum == 1)/*249.50*/ {_display_(Seq[Any](format.raw/*249.52*/("""
                                    """),format.raw/*250.37*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">first_page</i></li>
                                    <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">chevron_left</i></li>
                                """)))}/*252.34*/else/*252.38*/{_display_(Seq[Any](format.raw/*252.39*/("""
                                    """),format.raw/*253.37*/("""<li class="waves-effect">
                                        <a href="#!" onclick="jumpToPage(1, '"""),_display_(/*254.79*/sort),format.raw/*254.83*/("""', '"""),_display_(/*254.88*/searchBody),format.raw/*254.98*/("""')">
                                            <i class="material-icons">first_page</i>
                                        </a>
                                    </li>
                                    <li class="waves-effect">
                                        <a href="#!" onclick="jumpToPage("""),_display_(/*259.75*/pageNum),format.raw/*259.82*/("""-1, '"""),_display_(/*259.88*/sort),format.raw/*259.92*/("""', '"""),_display_(/*259.97*/searchBody),format.raw/*259.107*/("""')">
                                            <i class="material-icons">chevron_left</i>
                                        </a>
                                    </li>
                                """)))}),format.raw/*263.34*/("""
                                """),_display_(/*264.34*/if(beginIndexForPagination>1)/*264.63*/{_display_(Seq[Any](format.raw/*264.64*/("""
                                    """),format.raw/*265.37*/("""<li class="waves-effect modal-trigger" href="#searchPageModal" style="cursor: pointer;
                                        font-size: 20px;
                                        font-weight: bold">...</li>
                                """)))}),format.raw/*268.34*/("""
                                """),_display_(/*269.34*/for(i <- (beginIndexForPagination + 0) to (endIndexForPagination + 0)) yield /*269.104*/ {_display_(Seq[Any](format.raw/*269.106*/("""
                                    """),format.raw/*270.37*/("""<li """),_display_(/*270.42*/if(pageNum == i)/*270.58*/ {_display_(Seq[Any](format.raw/*270.60*/("""
                                        """),format.raw/*271.41*/("""class="active"""")))}),format.raw/*271.56*/(""">
                                        <a href="#!" onclick="jumpToPage("""),_display_(/*272.75*/i),format.raw/*272.76*/(""", '"""),_display_(/*272.80*/sort),format.raw/*272.84*/("""', '"""),_display_(/*272.89*/searchBody),format.raw/*272.99*/("""')">
                                        """),_display_(/*273.42*/i),format.raw/*273.43*/("""
                                        """),format.raw/*274.41*/("""</a>
                                    </li>
                                """)))}),format.raw/*276.34*/("""
                                """),_display_(/*277.34*/if(endIndexForPagination< ((total - 1) / pageLimit + 1))/*277.90*/{_display_(Seq[Any](format.raw/*277.91*/("""
                                    """),format.raw/*278.37*/("""<li class="waves-effect modal-trigger" href="#searchPageModal" style="cursor: pointer;
                                        font-size: 20px;
                                        font-weight: bold">...</li>
                                """)))}),format.raw/*281.34*/("""
                                """),_display_(/*282.34*/if((offset + count) >= total)/*282.63*/ {_display_(Seq[Any](format.raw/*282.65*/("""
                                    """),format.raw/*283.37*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">chevron_right</i></li>
                                    <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">last_page</i></li>
                                """)))}/*285.34*/else/*285.39*/{_display_(Seq[Any](format.raw/*285.40*/("""
                                    """),format.raw/*286.37*/("""<li class="waves-effect">
                                        <a href="#!" onclick="jumpToPage("""),_display_(/*287.75*/pageNum),format.raw/*287.82*/("""+1, '"""),_display_(/*287.88*/sort),format.raw/*287.92*/("""', '"""),_display_(/*287.97*/searchBody),format.raw/*287.107*/("""')">
                                            <i class="material-icons">chevron_right</i>
                                        </a>
                                    </li>
                                    <li class="waves-effect">
                                        <a href="#!" onclick="jumpToPage(("""),_display_(/*292.76*/total),format.raw/*292.81*/("""-1)/("""),_display_(/*292.87*/pageLimit),format.raw/*292.96*/(""")+1, '"""),_display_(/*292.103*/sort),format.raw/*292.107*/("""', '"""),_display_(/*292.112*/searchBody),format.raw/*292.122*/("""')
                                        <i class="material-icons">last_page</i>
                                        </a>
                                    </li>
                                """)))}),format.raw/*296.34*/("""
                            """)))}),format.raw/*297.30*/("""
                            """),format.raw/*298.29*/("""</ul>
                        </div>
                    </div>
                """)))}/*301.18*/else/*301.23*/{_display_(Seq[Any](format.raw/*301.24*/("""
                    """),format.raw/*302.21*/("""<h5>No Paper was found.</h5>
                """)))}),format.raw/*303.18*/("""

                """),format.raw/*305.17*/("""<div id="allPageModal" class="modal">
                    <div class="modal-content">
                        <h6>Select the page number you want to jump to</h6>
                        <div class="card z-depth-0">

                        """),_display_(/*310.26*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*310.83*/ {_display_(Seq[Any](format.raw/*310.85*/("""
                            """),format.raw/*311.29*/("""<ul class="pagination center-align">
                            """),_display_(/*312.30*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*312.69*/ {_display_(Seq[Any](format.raw/*312.71*/("""
                                """),_display_(/*313.34*/if(j <= ((total - 1)/(pageLimit) + 1))/*313.72*/ {_display_(Seq[Any](format.raw/*313.74*/("""
                                    """),_display_(/*314.38*/if(j != pageNum)/*314.54*/ {_display_(Seq[Any](format.raw/*314.56*/("""
                                        """),format.raw/*315.41*/("""<li class="waves-effect grey lighten-3"><a href='"""),_display_(/*315.91*/routes/*315.97*/.PaperController.paperList(j, sort)),format.raw/*315.132*/("""'>"""),_display_(/*315.135*/j),format.raw/*315.136*/("""</a></li>
                                    """)))}/*316.38*/else/*316.42*/{_display_(Seq[Any](format.raw/*316.43*/("""
                                        """),format.raw/*317.41*/("""<li class="waves-effect active"><a href=""""),_display_(/*317.83*/routes/*317.89*/.PaperController.paperList(j, sort)),format.raw/*317.124*/("""">"""),_display_(/*317.127*/j),format.raw/*317.128*/("""</a></li>
                                    """)))}),format.raw/*318.38*/("""
                                """)))}),format.raw/*319.34*/("""
                            """)))}),format.raw/*320.30*/("""
                            """),format.raw/*321.29*/("""</ul>
                        """)))}),format.raw/*322.26*/("""
                        """),format.raw/*323.25*/("""</div>
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

                        """),_display_(/*336.26*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*336.83*/ {_display_(Seq[Any](format.raw/*336.85*/("""
                            """),format.raw/*337.29*/("""<ul class="pagination center-align">
                            """),_display_(/*338.30*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*338.69*/ {_display_(Seq[Any](format.raw/*338.71*/("""
                                """),_display_(/*339.34*/if(j <= ((total - 1)/(pageLimit) + 1))/*339.72*/ {_display_(Seq[Any](format.raw/*339.74*/("""
                                    """),_display_(/*340.38*/if(j != pageNum)/*340.54*/ {_display_(Seq[Any](format.raw/*340.56*/("""
                                        """),format.raw/*341.41*/("""<li class="waves-effect grey lighten-3"><a href='#!' onclick="jumpToPage("""),_display_(/*341.115*/j),format.raw/*341.116*/(""", 'id', '"""),_display_(/*341.126*/searchBody),format.raw/*341.136*/("""')">"""),_display_(/*341.141*/j),format.raw/*341.142*/("""</a></li>
                                    """)))}/*342.38*/else/*342.42*/{_display_(Seq[Any](format.raw/*342.43*/("""
                                        """),format.raw/*343.41*/("""<li class="waves-effect active"><a href="#!" onclick="jumpToPage("""),_display_(/*343.107*/j),format.raw/*343.108*/(""", 'id', '"""),_display_(/*343.118*/searchBody),format.raw/*343.128*/("""')">"""),_display_(/*343.133*/j),format.raw/*343.134*/("""</a></li>
                                    """)))}),format.raw/*344.38*/("""
                                """)))}),format.raw/*345.34*/("""
                            """)))}),format.raw/*346.30*/("""
                            """),format.raw/*347.29*/("""</ul>
                        """)))}),format.raw/*348.26*/("""
                        """),format.raw/*349.25*/("""</div>
                    </div>
                    <div class="modal-footer">
                        <a href="#!" class="modal-close waves-effect waves-green btn-flat">
                            Cancel</a>
                    </div>
                </div>


            </div>
        </div>
    """)))}),format.raw/*360.6*/("""

"""))
      }
    }
  }

  def render(entries:List[Paper],pageNum:Integer,sort:String,offset:Integer,total:Integer,count:Integer,listType:String,pageLimit:Integer,searchBody:String,title:String,id:Long,beginIndexForPagination:Integer,endIndexForPagination:Integer): play.twirl.api.HtmlFormat.Appendable = apply(entries,pageNum,sort,offset,total,count,listType,pageLimit,searchBody,title,id,beginIndexForPagination,endIndexForPagination)

  def f:((List[Paper],Integer,String,Integer,Integer,Integer,String,Integer,String,String,Long,Integer,Integer) => play.twirl.api.HtmlFormat.Appendable) = (entries,pageNum,sort,offset,total,count,listType,pageLimit,searchBody,title,id,beginIndexForPagination,endIndexForPagination) => apply(entries,pageNum,sort,offset,total,count,listType,pageLimit,searchBody,title,id,beginIndexForPagination,endIndexForPagination)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:33 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/paperList.scala.html
                  HASH: e5ac04771f965507ba949462848b4ad42da50dab
                  MATRIX: 1210->1|1616->339|1641->361|1665->378|1698->400|1713->407|1794->411|1830->420|1887->450|1902->456|1961->494|2088->593|2117->594|2166->615|2244->666|2290->696|2330->698|2379->719|2418->730|2447->731|2476->732|2537->766|2553->773|2589->788|2718->890|2734->897|2771->913|2988->1099|3037->1120|3352->1407|3381->1408|3478->1477|3507->1478|3557->1500|4381->2296|4410->2297|4472->2331|4525->2356|4554->2357|4604->2379|4845->2592|4874->2593|4927->2618|5061->2724|5090->2725|5119->2726|5580->3159|5609->3160|5666->3189|5827->3322|5856->3323|5909->3348|6051->3462|6080->3463|6130->3485|6186->3513|6215->3514|6260->3531|6314->3557|6343->3558|6392->3579|6427->3586|6456->3587|6509->3612|6605->3680|6634->3681|6691->3710|6778->3769|6807->3770|6893->3828|6922->3829|6973->3852|7002->3853|7055->3878|7166->3961|7195->3962|7242->3981|7271->3982|7307->3991|7390->4045|7420->4046|7470->4067|7628->4196|7658->4197|7695->4206|7749->333|7781->356|7812->398|7841->4220|7875->4227|7912->4254|7953->4256|7990->4265|8104->4351|8143->4380|8184->4382|8234->4403|8734->4871|8780->4889|8812->4911|8853->4913|8903->4934|9485->5488|9580->5561|9610->5562|9642->5566|9742->5644|9772->5645|9804->5649|9831->5654|10519->6314|10550->6335|10590->6336|10656->6373|10718->6415|10732->6420|10772->6421|10838->6458|10915->6503|11166->6726|11202->6752|11243->6754|11305->6787|11347->6801|11363->6807|11420->6842|11618->7012|11634->7018|11694->7056|11880->7222|11894->7227|11934->7228|11996->7261|12099->7336|12131->7346|12437->7624|12469->7634|12712->7845|12770->7874|13531->8607|13591->8650|13632->8652|13690->8681|13760->8723|13775->8728|13805->8736|13888->8791|13904->8797|13969->8840|14001->8843|14017->8848|14051->8859|14123->8903|14200->8969|14242->8971|14309->9079|14375->9152|14441->9198|14507->9235|14670->9370|14685->9375|14722->9390|14792->9431|14848->9459|14863->9464|14900->9479|15003->9563|15017->9568|15057->9569|15123->9606|15169->9624|15184->9629|15214->9637|15244->9638|15358->9720|15421->9754|15454->9759|15469->9764|15501->9774|15600->9841|15654->9866|15899->10083|15935->10109|15976->10111|16038->10145|16064->10161|16105->10163|16171->10200|16470->10479|16484->10483|16524->10484|16590->10521|16653->10556|16669->10562|16727->10597|16878->10720|16894->10726|16962->10771|17081->10858|17143->10892|17182->10921|17222->10922|17288->10959|17562->11201|17624->11235|17712->11305|17754->11307|17820->11344|17853->11349|17879->11365|17920->11367|17990->11408|18037->11423|18076->11434|18092->11440|18150->11475|18182->11478|18206->11479|18281->11522|18343->11556|18409->11612|18449->11613|18515->11650|18789->11892|18851->11926|18890->11955|18931->11957|18997->11994|19296->12273|19310->12278|19350->12279|19416->12316|19479->12351|19495->12357|19563->12402|19717->12528|19733->12534|19811->12589|19927->12673|19977->12703|19991->12707|20031->12708|20093->12742|20119->12758|20160->12760|20226->12797|20525->13076|20539->13080|20579->13081|20645->13118|20777->13222|20803->13226|20836->13231|20868->13241|21209->13554|21238->13561|21272->13567|21298->13571|21331->13576|21364->13586|21608->13798|21670->13832|21709->13861|21749->13862|21815->13899|22092->14144|22154->14178|22242->14248|22284->14250|22350->14287|22383->14292|22409->14308|22450->14310|22520->14351|22567->14366|22671->14442|22694->14443|22726->14447|22752->14451|22785->14456|22817->14466|22891->14512|22914->14513|22984->14554|23096->14634|23158->14668|23224->14724|23264->14725|23330->14762|23607->15007|23669->15041|23708->15070|23749->15072|23815->15109|24114->15388|24128->15393|24168->15394|24234->15431|24362->15531|24391->15538|24425->15544|24451->15548|24484->15553|24517->15563|24862->15880|24889->15885|24923->15891|24954->15900|24990->15907|25017->15911|25051->15916|25084->15926|25319->16129|25381->16159|25439->16188|25540->16269|25554->16274|25594->16275|25644->16296|25722->16342|25769->16360|26038->16601|26112->16658|26153->16660|26211->16689|26305->16755|26361->16794|26402->16796|26464->16830|26512->16868|26553->16870|26619->16908|26645->16924|26686->16926|26756->16967|26834->17017|26850->17023|26908->17058|26940->17061|26964->17062|27031->17109|27045->17113|27085->17114|27155->17155|27225->17197|27241->17203|27299->17238|27331->17241|27355->17242|27434->17289|27500->17323|27562->17353|27620->17382|27683->17413|27737->17438|28288->17961|28362->18018|28403->18020|28461->18049|28555->18115|28611->18154|28652->18156|28714->18190|28762->18228|28803->18230|28869->18268|28895->18284|28936->18286|29006->18327|29109->18401|29133->18402|29172->18412|29205->18422|29239->18427|29263->18428|29330->18475|29344->18479|29384->18480|29454->18521|29549->18587|29573->18588|29612->18598|29645->18608|29679->18613|29703->18614|29782->18661|29848->18695|29910->18725|29968->18754|30031->18785|30085->18810|30419->19113
                  LINES: 35->1|48->12|49->13|50->14|52->16|52->16|54->16|55->17|55->17|55->17|55->17|58->20|58->20|59->21|60->22|60->22|60->22|61->23|61->23|61->23|61->23|62->24|62->24|62->24|65->27|65->27|65->27|68->30|69->31|77->39|77->39|79->41|79->41|81->43|99->61|99->61|101->63|101->63|101->63|103->65|106->68|106->68|107->69|108->70|108->70|108->70|116->78|116->78|117->79|119->81|119->81|120->82|122->84|122->84|124->86|125->87|125->87|126->88|126->88|126->88|127->89|127->89|127->89|128->90|129->91|129->91|130->92|131->93|131->93|133->95|133->95|133->95|133->95|134->96|135->97|135->97|136->98|136->98|137->99|139->101|139->101|140->102|143->105|143->105|144->106|146->11|147->13|147->15|148->107|150->109|150->109|150->109|151->110|154->113|154->113|154->113|155->114|163->122|164->123|164->123|164->123|165->124|177->136|179->138|179->138|179->138|181->140|181->140|181->140|181->140|191->150|191->150|191->150|192->151|193->152|193->152|193->152|194->153|195->154|199->158|199->158|199->158|200->159|200->159|200->159|200->159|202->161|202->161|202->161|204->163|204->163|204->163|205->164|206->165|206->165|211->170|211->170|215->174|216->175|230->189|230->189|230->189|231->190|232->191|232->191|232->191|234->193|234->193|234->193|234->193|234->193|234->193|236->195|236->195|236->195|237->196|238->197|239->198|240->199|242->201|242->201|242->201|243->202|243->202|243->202|243->202|245->204|245->204|245->204|246->205|246->205|246->205|246->205|246->205|247->206|249->208|249->208|249->208|249->208|253->212|254->213|260->219|260->219|260->219|261->220|261->220|261->220|262->221|264->223|264->223|264->223|265->224|265->224|265->224|265->224|266->225|266->225|266->225|267->226|268->227|268->227|268->227|269->228|272->231|273->232|273->232|273->232|274->233|274->233|274->233|274->233|275->234|275->234|275->234|275->234|275->234|275->234|275->234|276->235|277->236|277->236|277->236|278->237|281->240|282->241|282->241|282->241|283->242|285->244|285->244|285->244|286->245|286->245|286->245|286->245|287->246|287->246|287->246|288->247|289->248|289->248|289->248|290->249|290->249|290->249|291->250|293->252|293->252|293->252|294->253|295->254|295->254|295->254|295->254|300->259|300->259|300->259|300->259|300->259|300->259|304->263|305->264|305->264|305->264|306->265|309->268|310->269|310->269|310->269|311->270|311->270|311->270|311->270|312->271|312->271|313->272|313->272|313->272|313->272|313->272|313->272|314->273|314->273|315->274|317->276|318->277|318->277|318->277|319->278|322->281|323->282|323->282|323->282|324->283|326->285|326->285|326->285|327->286|328->287|328->287|328->287|328->287|328->287|328->287|333->292|333->292|333->292|333->292|333->292|333->292|333->292|333->292|337->296|338->297|339->298|342->301|342->301|342->301|343->302|344->303|346->305|351->310|351->310|351->310|352->311|353->312|353->312|353->312|354->313|354->313|354->313|355->314|355->314|355->314|356->315|356->315|356->315|356->315|356->315|356->315|357->316|357->316|357->316|358->317|358->317|358->317|358->317|358->317|358->317|359->318|360->319|361->320|362->321|363->322|364->323|377->336|377->336|377->336|378->337|379->338|379->338|379->338|380->339|380->339|380->339|381->340|381->340|381->340|382->341|382->341|382->341|382->341|382->341|382->341|382->341|383->342|383->342|383->342|384->343|384->343|384->343|384->343|384->343|384->343|384->343|385->344|386->345|387->346|388->347|389->348|390->349|401->360
                  -- GENERATED --
              */
          