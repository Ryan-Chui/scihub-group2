
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

object technologyList extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template12[List[Technology],Integer,String,Integer,Integer,Integer,String,Integer,String,Long,Integer,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(technologies: List[Technology],
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
/*13.2*/import models.Technology

def /*15.2*/scripts/*15.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*15.13*/("""
    """),format.raw/*16.5*/("""<script type = "module" src='"""),_display_(/*16.35*/routes/*16.41*/.Assets.at("javascripts/voiceJump.js")),format.raw/*16.79*/("""'></script>
    <link rel="stylesheet" href="/assets/stylesheets/responsive-table.css">
    <script type="text/javascript">

            $(document).ready(function () """),format.raw/*20.43*/("""{"""),format.raw/*20.44*/("""
                """),format.raw/*21.17*/("""var technologiesArray = []
                """),_display_(/*22.18*/for(i <- 0 until technologies.size) yield /*22.53*/ {_display_(Seq[Any](format.raw/*22.55*/("""
                """),format.raw/*23.17*/("""var json = """),format.raw/*23.28*/("""{"""),format.raw/*23.29*/("""}"""),format.raw/*23.30*/(""";
                json.id = '"""),_display_(/*24.29*/technologies/*24.41*/.get(i).getId()),format.raw/*24.56*/("""';
                json.url = "/technology/technologyDetail/" + json.id;

                json.name = '"""),_display_(/*27.31*/technologies/*27.43*/.get(i).getTechnologyTitle),format.raw/*27.69*/("""'.replace(/[^a-zA-Z0-9]/g, " ").replace(/  +/g, " ").trim();
                console.log("jsonhere:" + json)
                technologiesArray.push(json)
                """)))}),format.raw/*30.18*/("""
                """),format.raw/*31.17*/("""$("#nasaText").text(JSON.stringify(technologiesArray));

                $('.tooltipped').tooltip();

                // $("#speak-from-filter").click();
                // $("#speak-nasa").click();
                // $("#speak-from-filter").click();

            """),format.raw/*39.13*/("""}"""),format.raw/*39.14*/(""");

            function jumpToPage(pageNum, sort, searchString) """),format.raw/*41.62*/("""{"""),format.raw/*41.63*/("""

                """),format.raw/*43.17*/("""pageNum =  parseInt(pageNum);

                var url = "/technology/searchPOST?pageNum=" + (pageNum) + "&sortCriteria=" + sort;
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
            """),format.raw/*61.13*/("""}"""),format.raw/*61.14*/("""

            """),format.raw/*63.13*/("""function string2Map(str) """),format.raw/*63.38*/("""{"""),format.raw/*63.39*/("""

                """),format.raw/*65.17*/("""var map = new Map();
                var splitedString = str.replace(new RegExp("],", 'g'), ";");
                var array = splitedString.split(";");
                for(var i=0; i<array.length; i++)"""),format.raw/*68.50*/("""{"""),format.raw/*68.51*/("""
                    """),format.raw/*69.21*/("""var idAndEventsString = array[i];
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


    """),format.raw/*90.5*/("""</script>
    <style>
            .follow-fab """),format.raw/*92.25*/("""{"""),format.raw/*92.26*/("""
                """),format.raw/*93.17*/("""top: -20px !important;
                bottom: auto !important;
                right: -20px !important;
            """),format.raw/*96.13*/("""}"""),format.raw/*96.14*/("""

            """),format.raw/*98.13*/("""/*To hide the long text*/

            .truncate-multiline """),format.raw/*100.33*/("""{"""),format.raw/*100.34*/("""
                """),format.raw/*101.17*/("""display: -webkit-box;
                -webkit-line-clamp: 3;  /* Limit to 3 lines */
                -webkit-box-orient: vertical;
                overflow: hidden;
                text-overflow: ellipsis;
                white-space: normal;
            """),format.raw/*107.13*/("""}"""),format.raw/*107.14*/("""

            """),format.raw/*109.13*/(""".table-responsive """),format.raw/*109.31*/("""{"""),format.raw/*109.32*/("""
                """),format.raw/*110.17*/("""overflow-x: auto;
                -webkit-overflow-scrolling: touch;
            """),format.raw/*112.13*/("""}"""),format.raw/*112.14*/("""

    """),format.raw/*114.5*/("""</style>
""")))};
Seq[Any](format.raw/*10.84*/("""
"""),format.raw/*14.1*/("""
"""),format.raw/*115.2*/("""

"""),_display_(/*117.2*/main("All Technologies", scripts)/*117.35*/ {_display_(Seq[Any](format.raw/*117.37*/("""
    """),format.raw/*118.5*/("""<div class="container">
        <div class="card-panel center">
            """),_display_(/*120.14*/if(listType.equals("search"))/*120.43*/ {_display_(Seq[Any](format.raw/*120.45*/("""
                """),format.raw/*121.17*/("""<div class="row card-panel z-depth-0 project-zone-panel">
                    <div class="col s12" style="margin-top: -10px;
                        margin-bottom: -10px;">
                        <h6 class="center tooltipped" data-position="bottom" data-tooltip="This list shows the search results." >
                            Search Result
                        </h6>
                    </div>
                </div>
            """)))}/*129.14*/else if(listType.equals("all"))/*129.46*/ {_display_(Seq[Any](format.raw/*129.48*/("""
            """),format.raw/*130.13*/("""<div class="row card-panel z-depth-0 project-zone-panel">
                <div class="col s12" style="margin-top: -10px;
                    margin-bottom: -10px;">
                    <h6 class="center tooltipped" data-position="bottom" data-tooltip="This list shows all the projects." >
                        List of Technologies Registered at SMU-Lyle-Sci-Hub
                    </h6>
                </div>
            </div>
            """)))}),format.raw/*138.14*/("""

            """),_display_(/*140.14*/if(technologies.size() > 0)/*140.41*/ {_display_(Seq[Any](format.raw/*140.43*/("""
                """),format.raw/*141.17*/("""<div class="col s8 offset-s2">
                    <h4>Technology List</h4>

                </div>
                <div class="col s2">
                    <button id = "speak-from-filter" hidden></button>
                    <div id="nasaText" hidden></div>
                    <div id="requestField"></div>
                    <div id="replyField"></div>
                </div>
                <div class="row">
                    <div class="col s6">
                        <h6 class="left">Showing results: """),_display_(/*153.60*/{
                            offset + 1
                        }),format.raw/*155.26*/(""" """),format.raw/*155.27*/("""to """),_display_(/*155.31*/{
                            offset + count
                        }),format.raw/*157.26*/(""" """),format.raw/*157.27*/("""of """),_display_(/*157.31*/total),format.raw/*157.36*/("""</h6>
                    </div>
                    <div class="col s6" style="padding-top: -5px;
                        margin-top: -2px">
                        <a class='dropdown-trigger btn-flat right' href='#' data-target='dropdown2' style="text-transform: none;
                            font-weight: bold;
                            color: black;
                            font-family: AmazonEmberBold, Helvetica Neue Bold, Helvetica Neue, Helvetica, Arial, sans-serif;
                        !important; ">
                            Sort By: &nbsp; <font color="#3a5dc3">
                            """),_display_(/*167.30*/if(sort.equals("id"))/*167.51*/ {_display_(Seq[Any](format.raw/*167.53*/("""
                                """),format.raw/*168.33*/("""Technology ID
                            """)))}/*169.30*/else if(sort.equals("technologyTitle"))/*169.69*/{_display_(Seq[Any](format.raw/*169.70*/("""
                                """),format.raw/*170.33*/("""Technology Title
                                """)))}/*171.34*/else if(sort.equals("access_times"))/*171.70*/{_display_(Seq[Any](format.raw/*171.71*/("""
                                """),format.raw/*172.33*/("""Popularity
                            """)))}/*173.30*/else/*173.35*/{_display_(Seq[Any](format.raw/*173.36*/("""
                                """),format.raw/*174.33*/("""Technology Title
                            """)))}),format.raw/*175.30*/("""</font> <i class="material-icons right">expand_more</i></a>

                            <!-- Dropdown Structure -->
                        <ul id='dropdown2' class='dropdown-content'>
                        """),_display_(/*179.26*/if(listType.equals("all"))/*179.52*/ {_display_(Seq[Any](format.raw/*179.54*/("""
                            """),format.raw/*180.29*/("""<li><a href=""""),_display_(/*180.43*/routes/*180.49*/.TechnologyController.technologyList(1, "id")),format.raw/*180.94*/("""" class="grey-text text-darken-4"><i class="material-icons">
                                event</i>Technology ID</a></li>
                            <li><a href=""""),_display_(/*182.43*/routes/*182.49*/.TechnologyController.technologyList(1, "technology_title")),format.raw/*182.108*/("""" class="grey-text text-darken-4"><i class="material-icons">
                                sort_by_alpha</i>Technology Title </a></li>
"""),format.raw/*184.158*/("""
"""),format.raw/*185.82*/("""
"""),format.raw/*186.162*/("""
"""),format.raw/*187.74*/("""
                        """)))}/*188.26*/else/*188.31*/{_display_(Seq[Any](format.raw/*188.32*/("""
                            """),format.raw/*189.29*/("""<li>
                                <a onclick="jumpToPage(1, 'id', '"""),_display_(/*190.67*/searchBody),format.raw/*190.77*/("""')">
                                    <i class="material-icons">event</i>Technology ID
                                </a>
                            </li>
                            <li>
                                <a onclick="jumpToPage(1, 'title', '"""),_display_(/*195.70*/searchBody),format.raw/*195.80*/("""')">
                                    <i class="material-icons">sort_by_alpha</i>Technology Title
                                </a>
                            </li>
"""),format.raw/*199.37*/("""
"""),format.raw/*200.91*/("""
"""),format.raw/*201.100*/("""
"""),format.raw/*202.41*/("""
"""),format.raw/*203.38*/("""
"""),format.raw/*204.37*/("""
"""),format.raw/*205.95*/("""
"""),format.raw/*206.94*/("""
"""),format.raw/*207.41*/("""
"""),format.raw/*208.38*/("""
                        """)))}),format.raw/*209.26*/("""
                        """),format.raw/*210.25*/("""</ul>
                    </div>
                </div>

                <!-- Desktop Table -->
                <div class="desktop-table-view">
                    <div class="table-responsive">
                        <table class="centered responsive-table striped" id="projectTable" >
                            <thead>
                                <tr class="list-header" style="border-bottom: 1px solid;
                                !important;">
                                    <th style="cursor: pointer;">Technology Id</th>
                                    <th style="cursor: pointer;">Title</th>
                                    <th style="cursor: pointer;">Short Description</th>
                                    <th style="cursor: pointer;">Keywords</th>
                                    <th style="cursor: pointer;">Fields</th>
                                </tr>
                            </thead>
                            <tbody>
                            """),_display_(/*229.30*/for((entry, index) <- technologies.zipWithIndex) yield /*229.78*/ {_display_(Seq[Any](format.raw/*229.80*/("""
                                """),format.raw/*230.33*/("""<tr>
        """),format.raw/*231.141*/("""

        """),format.raw/*233.80*/("""
        """),format.raw/*234.112*/("""
        """),format.raw/*235.76*/("""
        """),format.raw/*236.50*/("""
        """),format.raw/*237.49*/("""
        """),format.raw/*238.125*/("""
        """),format.raw/*239.42*/("""

                                    """),format.raw/*241.37*/("""<!-- Technology ID as plain text (no hyperlink) -->
                                    <td>"""),_display_(/*242.42*/entry/*242.47*/.getId()),format.raw/*242.55*/("""</td>

                                    <!-- Technology Title with hyperlink -->
                                    """),_display_(/*245.38*/if(entry.getTechnologyTitle() != "")/*245.74*/ {_display_(Seq[Any](format.raw/*245.76*/("""
                                        """),format.raw/*246.41*/("""<td>
                                            <a href=""""),_display_(/*247.55*/routes/*247.61*/.TechnologyController.technologyDetail(entry.getId())),format.raw/*247.114*/("""" class=""""),_display_(/*247.124*/entry/*247.129*/.getId()),format.raw/*247.137*/(""" """),format.raw/*247.138*/("""editable" data-name='title'>
                                            """),_display_(/*248.46*/entry/*248.51*/.getTechnologyTitle()),format.raw/*248.72*/("""
                                            """),format.raw/*249.45*/("""</a>
                                        </td>
                                    """)))}/*251.39*/else/*251.44*/{_display_(Seq[Any](format.raw/*251.45*/("""
                                        """),format.raw/*252.41*/("""<td>
                                            <span class=""""),_display_(/*253.59*/entry/*253.64*/.getId()),format.raw/*253.72*/(""" """),format.raw/*253.73*/("""editable" data-name='title'>&ensp; -</span>
                                        </td>
                                    """)))}),format.raw/*255.38*/("""

                                    """),format.raw/*257.109*/("""
        """),format.raw/*258.123*/("""

        """),format.raw/*260.77*/("""
        """),format.raw/*261.50*/("""
        """),format.raw/*262.49*/("""
        """),format.raw/*263.125*/("""
        """),format.raw/*264.42*/("""

                                    """),_display_(/*266.38*/if(entry.getShortDescription() != null && entry.getShortDescription().nonEmpty)/*266.117*/ {_display_(Seq[Any](format.raw/*266.119*/("""
                                        """),format.raw/*267.41*/("""<td>
        """),format.raw/*268.127*/("""
        """),format.raw/*269.77*/("""
        """),format.raw/*270.56*/("""

                                            """),_display_(/*272.46*/defining(Option(entry.getShortDescription).getOrElse(""))/*272.103*/ { shortDesc =>_display_(Seq[Any](format.raw/*272.118*/("""
                                                """),format.raw/*273.49*/("""<span class="tooltipped truncate-multiline"
                                                data-position="bottom"
                                                data-tooltip=""""),_display_(/*275.64*/shortDesc),format.raw/*275.73*/("""">
                                                """),_display_(/*276.50*/shortDesc),format.raw/*276.59*/("""
                                                """),format.raw/*277.49*/("""</span>
                                            """)))}),format.raw/*278.46*/("""

                                        """),format.raw/*280.41*/("""</td>
                                    """)))}/*281.39*/else/*281.44*/{_display_(Seq[Any](format.raw/*281.45*/("""
                                        """),format.raw/*282.41*/("""<td>
                                            <span class=""""),_display_(/*283.59*/entry/*283.64*/.getId()),format.raw/*283.72*/(""" """),format.raw/*283.73*/("""editable" data-name="shortDescription">&ensp; -</span>
                                        </td>
                                    """)))}),format.raw/*285.38*/("""

                                    """),_display_(/*287.38*/if(entry.getKeywords() != "")/*287.67*/ {_display_(Seq[Any](format.raw/*287.69*/("""
                                        """),format.raw/*288.41*/("""<td><span class=""""),_display_(/*288.59*/entry/*288.64*/.getId()),format.raw/*288.72*/(""" """),format.raw/*288.73*/("""editable" data-name='keywords'></span>

                                            """),_display_(/*290.46*/entry/*290.51*/.getKeywords()),format.raw/*290.65*/("""
                                        """),format.raw/*291.41*/("""</td>
                                    """)))}/*292.39*/else/*292.44*/{_display_(Seq[Any](format.raw/*292.45*/("""
                                        """),format.raw/*293.41*/("""<td><span class=""""),_display_(/*293.59*/entry/*293.64*/.getId()),format.raw/*293.72*/(""" """),format.raw/*293.73*/("""editable" data-name='title'>&ensp; -</span></td>
                                    """)))}),format.raw/*294.38*/("""


                                    """),_display_(/*297.38*/if(entry.getFields() != "")/*297.65*/ {_display_(Seq[Any](format.raw/*297.67*/("""
                                        """),format.raw/*298.41*/("""<td><span class=""""),_display_(/*298.59*/entry/*298.64*/.getId()),format.raw/*298.72*/(""" """),format.raw/*298.73*/("""editable" data-name='fields'></span>

                                            """),_display_(/*300.46*/entry/*300.51*/.getFields()),format.raw/*300.63*/("""
                                        """),format.raw/*301.41*/("""</td>
                                    """)))}/*302.39*/else/*302.44*/{_display_(Seq[Any](format.raw/*302.45*/("""
                                        """),format.raw/*303.41*/("""<td><span class=""""),_display_(/*303.59*/entry/*303.64*/.getId()),format.raw/*303.72*/(""" """),format.raw/*303.73*/("""editable" data-name='title'>&ensp; -</span></td>
                                    """)))}),format.raw/*304.38*/("""

                                """),format.raw/*306.33*/("""</tr>
                            """)))}),format.raw/*307.30*/("""
                            """),format.raw/*308.29*/("""</tbody>
                        </table>
                    </div>
                </div>

                <!-- Mobile Cards for Technology List -->
                <div class="mobile-table-view">
                """),_display_(/*315.18*/for(entry <- technologies.asScala) yield /*315.52*/ {_display_(Seq[Any](format.raw/*315.54*/("""
                    """),format.raw/*316.21*/("""<div class="card-panel z-depth-1" style="margin-bottom: 16px;">

                            <!-- Technology Title -->
                        <div><h6>Technology Title:</h6>
                            <a href=""""),_display_(/*320.39*/routes/*320.45*/.TechnologyController.technologyDetail(entry.getId())),format.raw/*320.98*/("""">"""),_display_(/*320.101*/entry/*320.106*/.getTechnologyTitle()),format.raw/*320.127*/("""</a>
                        </div>

                            <!-- Short Description (Truncated if too long) -->
                        <div><h6>Short Description:</h6>
                            """),_display_(/*325.30*/{
                                val shortDesc = Option(entry.getShortDescription).getOrElse("")
                                val words = shortDesc.split("\\s+")
                                if (words.length > 30) words.take(30).mkString(" ") + "..." else shortDesc
                            }),format.raw/*329.30*/("""
                        """),format.raw/*330.25*/("""</div>

                            <!-- Keywords (Truncated if too long) -->
                        <div><h6>Keywords:</h6>
                            """),_display_(/*334.30*/{
                                val keywords = Option(entry.getKeywords).getOrElse("")
                                if (keywords.length > 50) keywords.take(50) + "..." else keywords
                            }),format.raw/*337.30*/("""
                        """),format.raw/*338.25*/("""</div>

                            <!-- Fields (Truncated if too long) -->
                        <div><h6>Fields:</h6>
                            """),_display_(/*342.30*/{
                                val fields = Option(entry.getFields).getOrElse("")
                                if (fields.length > 50) fields.take(50) + "..." else fields
                            }),format.raw/*345.30*/("""
                        """),format.raw/*346.25*/("""</div>
                    </div>
                """)))}),format.raw/*348.18*/("""
                """),format.raw/*349.17*/("""</div>

                <div class="row">
                    <div class="col s12">
                        <ul class="pagination center-align">

                            """),_display_(/*355.30*/if(listType.equals("all"))/*355.56*/ {_display_(Seq[Any](format.raw/*355.58*/("""
                                """),_display_(/*356.34*/if(pageNum == 1)/*356.50*/ {_display_(Seq[Any](format.raw/*356.52*/("""
                                    """),format.raw/*357.37*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                        first_page</i></li>
                                    <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                        chevron_left</i></li>
                                """)))}/*361.35*/else/*361.40*/{_display_(Seq[Any](format.raw/*361.41*/("""
                                    """),format.raw/*362.37*/("""<li class="waves-effect"><a href=""""),_display_(/*362.72*/routes/*362.78*/.ProjectController.projectList(1, sort)),format.raw/*362.117*/(""""><i class="material-icons">
                                        first_page</i></a></li>
                                    <li class="waves-effect"><a href=""""),_display_(/*364.72*/routes/*364.78*/.ProjectController.projectList(pageNum - 1, sort)),format.raw/*364.127*/(""""><i class="material-icons">
                                        chevron_left</i></a></li>
                                """)))}),format.raw/*366.34*/("""
                                """),_display_(/*367.34*/if(beginIndexForPagination > 1)/*367.65*/ {_display_(Seq[Any](format.raw/*367.67*/("""
                                    """),format.raw/*368.37*/("""<li class="waves-effect modal-trigger" href="#allPageModal" style="cursor: pointer;
                                        font-size: 20px;
                                        font-weight: bold">...</li>
                                """)))}),format.raw/*371.34*/("""
                                """),_display_(/*372.34*/for(i <- (beginIndexForPagination + 0) to (endIndexForPagination + 0)) yield /*372.104*/ {_display_(Seq[Any](format.raw/*372.106*/("""
                                    """),format.raw/*373.37*/("""<li """),_display_(/*373.42*/if(pageNum == i)/*373.58*/ {_display_(Seq[Any](format.raw/*373.60*/("""
                                        """),format.raw/*374.41*/("""class="active"""")))}),format.raw/*374.56*/("""><a href=""""),_display_(/*374.67*/routes/*374.73*/.ProjectController.projectList(i, sort)),format.raw/*374.112*/("""">"""),_display_(/*374.115*/i),format.raw/*374.116*/("""</a></li>
                                """)))}),format.raw/*375.34*/("""
                                """),_display_(/*376.34*/if(endIndexForPagination < ((total - 1) / pageLimit + 1))/*376.91*/ {_display_(Seq[Any](format.raw/*376.93*/("""
                                    """),format.raw/*377.37*/("""<li class="waves-effect modal-trigger" href="#allPageModal" style="cursor: pointer;
                                        font-size: 20px;
                                        font-weight: bold">...</li>
                                """)))}),format.raw/*380.34*/("""
                                """),_display_(/*381.34*/if((offset + count) >= total)/*381.63*/ {_display_(Seq[Any](format.raw/*381.65*/("""
                                    """),format.raw/*382.37*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                        chevron_right</i></li>
                                    <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                        last_page</i></li>
                                """)))}/*386.35*/else/*386.40*/{_display_(Seq[Any](format.raw/*386.41*/("""
                                    """),format.raw/*387.37*/("""<li class="waves-effect"><a href=""""),_display_(/*387.72*/routes/*387.78*/.ProjectController.projectList(pageNum + 1, sort)),format.raw/*387.127*/(""""><i class="material-icons">
                                        chevron_right</i></a></li>
                                    <li class="waves-effect"><a href=""""),_display_(/*389.72*/routes/*389.78*/.ProjectController.projectList((total - 1) / pageLimit + 1, sort)),format.raw/*389.143*/(""""><i class="material-icons">
                                        last_page</i></a></li>
                                """)))}),format.raw/*391.34*/("""
                            """)))}/*392.30*/else if(listType.equals("my enroll"))/*392.67*/{_display_(Seq[Any](format.raw/*392.68*/("""
                            """),_display_(/*393.30*/if(pageNum == 1)/*393.46*/ {_display_(Seq[Any](format.raw/*393.48*/("""
                                """),format.raw/*394.33*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    first_page</i></li>
                                <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    chevron_left</i></li>
                            """)))}/*398.31*/else/*398.36*/{_display_(Seq[Any](format.raw/*398.37*/("""
                                """),format.raw/*399.33*/("""<li class="waves-effect"><a href=""""),_display_(/*399.68*/routes/*399.74*/.ProjectController.getMyEnrolledProjects(1, sort)),format.raw/*399.123*/(""""><i class="material-icons">
                                    first_page</i></a></li>
                                <li class="waves-effect"><a href=""""),_display_(/*401.68*/routes/*401.74*/.ProjectController.getMyEnrolledProjects(pageNum - 1, sort)),format.raw/*401.133*/(""""><i class="material-icons">
                                    chevron_left</i></a></li>
                            """)))}),format.raw/*403.30*/("""
                            """),_display_(/*404.30*/if(beginIndexForPagination > 1)/*404.61*/ {_display_(Seq[Any](format.raw/*404.63*/("""
                                """),format.raw/*405.33*/("""<li class="waves-effect modal-trigger" href="#enrollPageModal" style="cursor: pointer;
                                    font-size: 20px;
                                    font-weight: bold">...</li>
                            """)))}),format.raw/*408.30*/("""
                            """),_display_(/*409.30*/for(i <- (beginIndexForPagination + 0) to (endIndexForPagination + 0)) yield /*409.100*/ {_display_(Seq[Any](format.raw/*409.102*/("""
                                """),format.raw/*410.33*/("""<li """),_display_(/*410.38*/if(pageNum == i)/*410.54*/ {_display_(Seq[Any](format.raw/*410.56*/("""
                                    """),format.raw/*411.37*/("""class="active"""")))}),format.raw/*411.52*/("""><a href=""""),_display_(/*411.63*/routes/*411.69*/.ProjectController.getMyEnrolledProjects(i, sort)),format.raw/*411.118*/("""">"""),_display_(/*411.121*/i),format.raw/*411.122*/("""</a></li>
                            """)))}),format.raw/*412.30*/("""
                            """),_display_(/*413.30*/if(endIndexForPagination < ((total - 1) / pageLimit + 1))/*413.87*/ {_display_(Seq[Any](format.raw/*413.89*/("""
                                """),format.raw/*414.33*/("""<li class="waves-effect modal-trigger" href="#enrollPageModal" style="cursor: pointer;
                                    font-size: 20px;
                                    font-weight: bold">...</li>
                            """)))}),format.raw/*417.30*/("""
                            """),_display_(/*418.30*/if((offset + count) >= total)/*418.59*/ {_display_(Seq[Any](format.raw/*418.61*/("""
                                """),format.raw/*419.33*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    chevron_right</i></li>
                                <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    last_page</i></li>
                            """)))}/*423.31*/else/*423.36*/{_display_(Seq[Any](format.raw/*423.37*/("""
                                """),format.raw/*424.33*/("""<li class="waves-effect"><a href=""""),_display_(/*424.68*/routes/*424.74*/.ProjectController.getMyEnrolledProjects(pageNum + 1, sort)),format.raw/*424.133*/(""""><i class="material-icons">
                                    chevron_right</i></a></li>
                                <li class="waves-effect"><a href=""""),_display_(/*426.68*/routes/*426.74*/.ProjectController.getMyEnrolledProjects((total - 1) / pageLimit + 1, sort)),format.raw/*426.149*/(""""><i class="material-icons">
                                    last_page</i></a></li>
                            """)))}),format.raw/*428.30*/("""
                            """)))}/*429.30*/else/*429.34*/{_display_(Seq[Any](format.raw/*429.35*/("""
                            """),_display_(/*430.30*/if(pageNum == 1)/*430.46*/ {_display_(Seq[Any](format.raw/*430.48*/("""
                                """),format.raw/*431.33*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    first_page</i></li>
                                <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    chevron_left</i></li>
                            """)))}/*435.31*/else/*435.36*/{_display_(Seq[Any](format.raw/*435.37*/("""
                                """),format.raw/*436.33*/("""<li class="waves-effect">
                                    <a href="#!" onclick="jumpToPage(1, '"""),_display_(/*437.75*/sort),format.raw/*437.79*/("""', '"""),_display_(/*437.84*/searchBody),format.raw/*437.94*/("""')">
                                        <i class="material-icons">first_page</i>
                                    </a>
                                </li>
                                <li class="waves-effect">
                                    <a href="#!" onclick="jumpToPage("""),_display_(/*442.71*/pageNum),format.raw/*442.78*/("""-1, '"""),_display_(/*442.84*/sort),format.raw/*442.88*/("""', '"""),_display_(/*442.93*/searchBody),format.raw/*442.103*/("""')">
                                        <i class="material-icons">chevron_left</i>
                                    </a>
                                </li>
                            """)))}),format.raw/*446.30*/("""
                            """),_display_(/*447.30*/if(beginIndexForPagination > 1)/*447.61*/ {_display_(Seq[Any](format.raw/*447.63*/("""
                                """),format.raw/*448.33*/("""<li class="waves-effect modal-trigger" href="#searchPageModal" style="cursor: pointer;
                                    font-size: 20px;
                                    font-weight: bold">...</li>
                            """)))}),format.raw/*451.30*/("""
                            """),_display_(/*452.30*/for(i <- (beginIndexForPagination + 0) to (endIndexForPagination + 0)) yield /*452.100*/ {_display_(Seq[Any](format.raw/*452.102*/("""
                                """),format.raw/*453.33*/("""<li """),_display_(/*453.38*/if(pageNum == i)/*453.54*/ {_display_(Seq[Any](format.raw/*453.56*/("""
                                    """),format.raw/*454.37*/("""class="active"""")))}),format.raw/*454.52*/(""">
                                    <a href="#!" onclick="jumpToPage("""),_display_(/*455.71*/i),format.raw/*455.72*/(""", '"""),_display_(/*455.76*/sort),format.raw/*455.80*/("""', '"""),_display_(/*455.85*/searchBody),format.raw/*455.95*/("""')">
                                    """),_display_(/*456.38*/i),format.raw/*456.39*/("""
                                    """),format.raw/*457.37*/("""</a>
                                </li>
                            """)))}),format.raw/*459.30*/("""
                            """),_display_(/*460.30*/if(endIndexForPagination < ((total - 1) / pageLimit + 1))/*460.87*/ {_display_(Seq[Any](format.raw/*460.89*/("""
                                """),format.raw/*461.33*/("""<li class="waves-effect modal-trigger" href="#searchPageModal" style="cursor: pointer;
                                    font-size: 20px;
                                    font-weight: bold">...</li>
                            """)))}),format.raw/*464.30*/("""
                            """),_display_(/*465.30*/if((offset + count) >= total)/*465.59*/ {_display_(Seq[Any](format.raw/*465.61*/("""
                                """),format.raw/*466.33*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    chevron_right</i></li>
                                <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    last_page</i></li>
                            """)))}/*470.31*/else/*470.36*/{_display_(Seq[Any](format.raw/*470.37*/("""
                                """),format.raw/*471.33*/("""<li class="waves-effect">
                                    <a href="#!" onclick="jumpToPage("""),_display_(/*472.71*/pageNum),format.raw/*472.78*/("""+1, '"""),_display_(/*472.84*/sort),format.raw/*472.88*/("""', '"""),_display_(/*472.93*/searchBody),format.raw/*472.103*/("""')">
                                        <i class="material-icons">chevron_right</i>
                                    </a>
                                </li>
                                <li class="waves-effect">
                                    <a href="#!" onclick="jumpToPage(("""),_display_(/*477.72*/total),format.raw/*477.77*/("""-1)/("""),_display_(/*477.83*/pageLimit),format.raw/*477.92*/(""")+1, '"""),_display_(/*477.99*/sort),format.raw/*477.103*/("""', '"""),_display_(/*477.108*/searchBody),format.raw/*477.118*/("""')">
                                        <i class="material-icons">last_page</i>
                                    </a>
                                </li>
                            """)))}),format.raw/*481.30*/("""
                            """)))}),format.raw/*482.30*/("""
                        """),format.raw/*483.25*/("""</ul>
                    </div>
                </div>
            """)))}/*486.15*/else/*486.20*/{_display_(Seq[Any](format.raw/*486.21*/("""
                """),format.raw/*487.17*/("""<h5>No technology was found.</h5>
            """)))}),format.raw/*488.14*/("""
            """),format.raw/*489.13*/("""<div id="allPageModal" class="modal">
                <div class="modal-content">
                    <h6>Select the page number you want to jump to</h6>
                    <div class="card z-depth-0">

                    """),_display_(/*494.22*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*494.79*/ {_display_(Seq[Any](format.raw/*494.81*/("""
                        """),format.raw/*495.25*/("""<ul class="pagination center-align">
                        """),_display_(/*496.26*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*496.65*/ {_display_(Seq[Any](format.raw/*496.67*/("""
                            """),_display_(/*497.30*/if(j <= ((total - 1)/(pageLimit) + 1))/*497.68*/ {_display_(Seq[Any](format.raw/*497.70*/("""
                                """),_display_(/*498.34*/if(j != pageNum)/*498.50*/ {_display_(Seq[Any](format.raw/*498.52*/("""
                                    """),format.raw/*499.37*/("""<li class="waves-effect grey lighten-3"><a href='"""),_display_(/*499.87*/routes/*499.93*/.ProjectController.projectList(j, sort)),format.raw/*499.132*/("""'>"""),_display_(/*499.135*/j),format.raw/*499.136*/("""</a></li>
                                """)))}/*500.34*/else/*500.38*/{_display_(Seq[Any](format.raw/*500.39*/("""
                                    """),format.raw/*501.37*/("""<li class="waves-effect active"><a href=""""),_display_(/*501.79*/routes/*501.85*/.ProjectController.projectList(j, sort)),format.raw/*501.124*/("""">"""),_display_(/*501.127*/j),format.raw/*501.128*/("""</a></li>
                                """)))}),format.raw/*502.34*/("""
                            """)))}),format.raw/*503.30*/("""
                        """)))}),format.raw/*504.26*/("""
                        """),format.raw/*505.25*/("""</ul>
                    """)))}),format.raw/*506.22*/("""
                    """),format.raw/*507.21*/("""</div>
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

                    """),_display_(/*520.22*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*520.79*/ {_display_(Seq[Any](format.raw/*520.81*/("""
                        """),format.raw/*521.25*/("""<ul class="pagination center-align">
                        """),_display_(/*522.26*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*522.65*/ {_display_(Seq[Any](format.raw/*522.67*/("""
                            """),_display_(/*523.30*/if(j <= ((total - 1)/(pageLimit) + 1))/*523.68*/ {_display_(Seq[Any](format.raw/*523.70*/("""
                                """),_display_(/*524.34*/if(j != pageNum)/*524.50*/ {_display_(Seq[Any](format.raw/*524.52*/("""
                                    """),format.raw/*525.37*/("""<li class="waves-effect grey lighten-3"><a href='"""),_display_(/*525.87*/routes/*525.93*/.ProjectController.getMyEnrolledProjects(j, sort)),format.raw/*525.142*/("""'>"""),_display_(/*525.145*/j),format.raw/*525.146*/("""</a></li>
                                """)))}/*526.34*/else/*526.38*/{_display_(Seq[Any](format.raw/*526.39*/("""
                                    """),format.raw/*527.37*/("""<li class="waves-effect active"><a href=""""),_display_(/*527.79*/routes/*527.85*/.ProjectController.getMyEnrolledProjects(j, sort)),format.raw/*527.134*/("""">"""),_display_(/*527.137*/j),format.raw/*527.138*/("""</a></li>
                                """)))}),format.raw/*528.34*/("""
                            """)))}),format.raw/*529.30*/("""
                        """)))}),format.raw/*530.26*/("""
                        """),format.raw/*531.25*/("""</ul>
                    """)))}),format.raw/*532.22*/("""
                    """),format.raw/*533.21*/("""</div>
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

                    """),_display_(/*546.22*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*546.79*/ {_display_(Seq[Any](format.raw/*546.81*/("""
                        """),format.raw/*547.25*/("""<ul class="pagination center-align">
                        """),_display_(/*548.26*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*548.65*/ {_display_(Seq[Any](format.raw/*548.67*/("""
                            """),_display_(/*549.30*/if(j <= ((total - 1)/(pageLimit) + 1))/*549.68*/ {_display_(Seq[Any](format.raw/*549.70*/("""
                                """),_display_(/*550.34*/if(j != pageNum)/*550.50*/ {_display_(Seq[Any](format.raw/*550.52*/("""
                                    """),format.raw/*551.37*/("""<li class="waves-effect grey lighten-3"><a href='#!' onclick="jumpToPage("""),_display_(/*551.111*/j),format.raw/*551.112*/(""", 'id', '"""),_display_(/*551.122*/searchBody),format.raw/*551.132*/("""')">"""),_display_(/*551.137*/j),format.raw/*551.138*/("""</a></li>
                                """)))}/*552.34*/else/*552.38*/{_display_(Seq[Any](format.raw/*552.39*/("""
                                    """),format.raw/*553.37*/("""<li class="waves-effect active"><a href="#!" onclick="jumpToPage("""),_display_(/*553.103*/j),format.raw/*553.104*/(""", 'id', '"""),_display_(/*553.114*/searchBody),format.raw/*553.124*/("""')">"""),_display_(/*553.129*/j),format.raw/*553.130*/("""</a></li>
                                """)))}),format.raw/*554.34*/("""
                            """)))}),format.raw/*555.30*/("""
                        """)))}),format.raw/*556.26*/("""
                        """),format.raw/*557.25*/("""</ul>
                    """)))}),format.raw/*558.22*/("""
                    """),format.raw/*559.21*/("""</div>
                </div>
                <div class="modal-footer">
                    <a href="#!" class="modal-close waves-effect waves-green btn-flat">
                        Cancel</a>
                </div>
            </div>

        </div>
    </div>
""")))}),format.raw/*569.2*/("""

"""))
      }
    }
  }

  def render(technologies:List[Technology],pageNum:Integer,sort:String,offset:Integer,total:Integer,count:Integer,listType:String,pageLimit:Integer,searchBody:String,id:Long,beginIndexForPagination:Integer,endIndexForPagination:Integer): play.twirl.api.HtmlFormat.Appendable = apply(technologies,pageNum,sort,offset,total,count,listType,pageLimit,searchBody,id,beginIndexForPagination,endIndexForPagination)

  def f:((List[Technology],Integer,String,Integer,Integer,Integer,String,Integer,String,Long,Integer,Integer) => play.twirl.api.HtmlFormat.Appendable) = (technologies,pageNum,sort,offset,total,count,listType,pageLimit,searchBody,id,beginIndexForPagination,endIndexForPagination) => apply(technologies,pageNum,sort,offset,total,count,listType,pageLimit,searchBody,id,beginIndexForPagination,endIndexForPagination)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:39 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/technologyList.scala.html
                  HASH: 7ee79bb903639a44b5a2e4da08ec4e0353921599
                  MATRIX: 1213->1|1606->322|1631->340|1655->357|1693->384|1708->391|1789->395|1821->400|1878->430|1893->436|1952->474|2147->641|2176->642|2221->659|2292->703|2343->738|2383->740|2428->757|2467->768|2496->769|2525->770|2582->800|2603->812|2639->827|2770->931|2791->943|2838->969|3040->1140|3085->1157|3377->1421|3406->1422|3499->1487|3528->1488|3574->1506|4347->2251|4376->2252|4418->2266|4471->2291|4500->2292|4546->2310|4775->2511|4804->2512|4853->2533|4983->2635|5012->2636|5041->2637|5474->3042|5503->3043|5556->3068|5709->3193|5738->3194|5787->3215|5921->3321|5950->3322|5996->3340|6048->3364|6077->3365|6111->3372|6185->3418|6214->3419|6259->3436|6404->3553|6433->3554|6475->3568|6563->3627|6593->3628|6639->3645|6923->3900|6953->3901|6996->3915|7043->3933|7073->3934|7119->3951|7229->4032|7259->4033|7293->4039|7343->320|7371->382|7400->4049|7430->4052|7473->4085|7514->4087|7547->4092|7652->4169|7691->4198|7732->4200|7778->4217|8236->4655|8277->4687|8318->4689|8360->4702|8838->5148|8881->5163|8918->5190|8959->5192|9005->5209|9548->5724|9636->5790|9666->5791|9698->5795|9790->5865|9820->5866|9852->5870|9879->5875|10527->6495|10558->6516|10599->6518|10661->6551|10724->6594|10773->6633|10813->6634|10875->6667|10945->6717|10991->6753|11031->6754|11093->6787|11153->6827|11167->6832|11207->6833|11269->6866|11347->6912|11586->7123|11622->7149|11663->7151|11721->7180|11763->7194|11779->7200|11846->7245|12041->7412|12057->7418|12139->7477|12306->7771|12336->7853|12367->8015|12397->8089|12443->8115|12457->8120|12497->8121|12555->8150|12654->8221|12686->8231|12977->8494|13009->8504|13210->8712|13240->8803|13271->8903|13301->8944|13331->8982|13361->9019|13391->9114|13421->9208|13451->9249|13481->9287|13539->9313|13593->9338|14625->10342|14690->10390|14731->10392|14793->10425|14836->10570|14875->10651|14914->10763|14952->10839|14990->10889|15028->10938|15067->11063|15105->11105|15172->11143|15293->11236|15308->11241|15338->11249|15487->11370|15533->11406|15574->11408|15644->11449|15731->11508|15747->11514|15823->11567|15862->11577|15878->11582|15909->11590|15940->11591|16042->11665|16057->11670|16100->11691|16174->11736|16282->11825|16296->11830|16336->11831|16406->11872|16497->11935|16512->11940|16542->11948|16572->11949|16731->12076|16799->12186|16838->12309|16877->12387|16915->12437|16953->12486|16992->12611|17030->12653|17097->12692|17187->12771|17229->12773|17299->12814|17342->12945|17380->13022|17418->13078|17493->13125|17561->13182|17616->13197|17694->13246|17900->13424|17931->13433|18011->13485|18042->13494|18120->13543|18205->13596|18276->13638|18339->13682|18353->13687|18393->13688|18463->13729|18554->13792|18569->13797|18599->13805|18629->13806|18799->13944|18866->13983|18905->14012|18946->14014|19016->14055|19062->14073|19077->14078|19107->14086|19137->14087|19250->14172|19265->14177|19301->14191|19371->14232|19434->14276|19448->14281|19488->14282|19558->14323|19604->14341|19619->14346|19649->14354|19679->14355|19797->14441|19865->14481|19902->14508|19943->14510|20013->14551|20059->14569|20074->14574|20104->14582|20134->14583|20245->14666|20260->14671|20294->14683|20364->14724|20427->14768|20441->14773|20481->14774|20551->14815|20597->14833|20612->14838|20642->14846|20672->14847|20790->14933|20853->14967|20920->15002|20978->15031|21222->15247|21273->15281|21314->15283|21364->15304|21605->15517|21621->15523|21696->15576|21728->15579|21744->15584|21788->15605|22018->15807|22342->16109|22396->16134|22579->16289|22817->16505|22871->16530|23050->16681|23278->16887|23332->16912|23415->16963|23461->16980|23664->17155|23700->17181|23741->17183|23803->17217|23829->17233|23870->17235|23936->17272|24317->17634|24331->17639|24371->17640|24437->17677|24500->17712|24516->17718|24578->17757|24770->17921|24786->17927|24858->17976|25018->18104|25080->18138|25121->18169|25162->18171|25228->18208|25502->18450|25564->18484|25652->18554|25694->18556|25760->18593|25793->18598|25819->18614|25860->18616|25930->18657|25977->18672|26016->18683|26032->18689|26094->18728|26126->18731|26150->18732|26225->18775|26287->18809|26354->18866|26395->18868|26461->18905|26735->19147|26797->19181|26836->19210|26877->19212|26943->19249|27324->19611|27338->19616|27378->19617|27444->19654|27507->19689|27523->19695|27595->19744|27790->19911|27806->19917|27894->19982|28051->20107|28101->20137|28148->20174|28188->20175|28246->20205|28272->20221|28313->20223|28375->20256|28740->20602|28754->20607|28794->20608|28856->20641|28919->20676|28935->20682|29007->20731|29191->20887|29207->20893|29289->20952|29441->21072|29499->21102|29540->21133|29581->21135|29643->21168|29908->21401|29966->21431|30054->21501|30096->21503|30158->21536|30191->21541|30217->21557|30258->21559|30324->21596|30371->21611|30410->21622|30426->21628|30498->21677|30530->21680|30554->21681|30625->21720|30683->21750|30750->21807|30791->21809|30853->21842|31118->22075|31176->22105|31215->22134|31256->22136|31318->22169|31683->22515|31697->22520|31737->22521|31799->22554|31862->22589|31878->22595|31960->22654|32147->22813|32163->22819|32261->22894|32410->23011|32460->23041|32474->23045|32514->23046|32572->23076|32598->23092|32639->23094|32701->23127|33066->23473|33080->23478|33120->23479|33182->23512|33310->23612|33336->23616|33369->23621|33401->23631|33722->23924|33751->23931|33785->23937|33811->23941|33844->23946|33877->23956|34105->24152|34163->24182|34204->24213|34245->24215|34307->24248|34572->24481|34630->24511|34718->24581|34760->24583|34822->24616|34855->24621|34881->24637|34922->24639|34988->24676|35035->24691|35135->24763|35158->24764|35190->24768|35216->24772|35249->24777|35281->24787|35351->24829|35374->24830|35440->24867|35544->24939|35602->24969|35669->25026|35710->25028|35772->25061|36037->25294|36095->25324|36134->25353|36175->25355|36237->25388|36602->25734|36616->25739|36656->25740|36718->25773|36842->25869|36871->25876|36905->25882|36931->25886|36964->25891|36997->25901|37322->26198|37349->26203|37383->26209|37414->26218|37449->26225|37476->26229|37510->26234|37543->26244|37768->26437|37830->26467|37884->26492|37973->26562|37987->26567|38027->26568|38073->26585|38152->26632|38194->26645|38447->26870|38521->26927|38562->26929|38616->26954|38706->27016|38762->27055|38803->27057|38861->27087|38909->27125|38950->27127|39012->27161|39038->27177|39079->27179|39145->27216|39223->27266|39239->27272|39301->27311|39333->27314|39357->27315|39420->27358|39434->27362|39474->27363|39540->27400|39610->27442|39626->27448|39688->27487|39720->27490|39744->27491|39819->27534|39881->27564|39939->27590|39993->27615|40052->27642|40102->27663|40609->28142|40683->28199|40724->28201|40778->28226|40868->28288|40924->28327|40965->28329|41023->28359|41071->28397|41112->28399|41174->28433|41200->28449|41241->28451|41307->28488|41385->28538|41401->28544|41473->28593|41505->28596|41529->28597|41592->28640|41606->28644|41646->28645|41712->28682|41782->28724|41798->28730|41870->28779|41902->28782|41926->28783|42001->28826|42063->28856|42121->28882|42175->28907|42234->28934|42284->28955|42791->29434|42865->29491|42906->29493|42960->29518|43050->29580|43106->29619|43147->29621|43205->29651|43253->29689|43294->29691|43356->29725|43382->29741|43423->29743|43489->29780|43592->29854|43616->29855|43655->29865|43688->29875|43722->29880|43746->29881|43809->29924|43823->29928|43863->29929|43929->29966|44024->30032|44048->30033|44087->30043|44120->30053|44154->30058|44178->30059|44253->30102|44315->30132|44373->30158|44427->30183|44486->30210|44536->30231|44833->30497
                  LINES: 35->1|47->11|48->12|49->13|51->15|51->15|53->15|54->16|54->16|54->16|54->16|58->20|58->20|59->21|60->22|60->22|60->22|61->23|61->23|61->23|61->23|62->24|62->24|62->24|65->27|65->27|65->27|68->30|69->31|77->39|77->39|79->41|79->41|81->43|99->61|99->61|101->63|101->63|101->63|103->65|106->68|106->68|107->69|108->70|108->70|108->70|116->78|116->78|117->79|119->81|119->81|120->82|122->84|122->84|124->86|125->87|125->87|128->90|130->92|130->92|131->93|134->96|134->96|136->98|138->100|138->100|139->101|145->107|145->107|147->109|147->109|147->109|148->110|150->112|150->112|152->114|154->10|155->14|156->115|158->117|158->117|158->117|159->118|161->120|161->120|161->120|162->121|170->129|170->129|170->129|171->130|179->138|181->140|181->140|181->140|182->141|194->153|196->155|196->155|196->155|198->157|198->157|198->157|198->157|208->167|208->167|208->167|209->168|210->169|210->169|210->169|211->170|212->171|212->171|212->171|213->172|214->173|214->173|214->173|215->174|216->175|220->179|220->179|220->179|221->180|221->180|221->180|221->180|223->182|223->182|223->182|225->184|226->185|227->186|228->187|229->188|229->188|229->188|230->189|231->190|231->190|236->195|236->195|240->199|241->200|242->201|243->202|244->203|245->204|246->205|247->206|248->207|249->208|250->209|251->210|270->229|270->229|270->229|271->230|272->231|274->233|275->234|276->235|277->236|278->237|279->238|280->239|282->241|283->242|283->242|283->242|286->245|286->245|286->245|287->246|288->247|288->247|288->247|288->247|288->247|288->247|288->247|289->248|289->248|289->248|290->249|292->251|292->251|292->251|293->252|294->253|294->253|294->253|294->253|296->255|298->257|299->258|301->260|302->261|303->262|304->263|305->264|307->266|307->266|307->266|308->267|309->268|310->269|311->270|313->272|313->272|313->272|314->273|316->275|316->275|317->276|317->276|318->277|319->278|321->280|322->281|322->281|322->281|323->282|324->283|324->283|324->283|324->283|326->285|328->287|328->287|328->287|329->288|329->288|329->288|329->288|329->288|331->290|331->290|331->290|332->291|333->292|333->292|333->292|334->293|334->293|334->293|334->293|334->293|335->294|338->297|338->297|338->297|339->298|339->298|339->298|339->298|339->298|341->300|341->300|341->300|342->301|343->302|343->302|343->302|344->303|344->303|344->303|344->303|344->303|345->304|347->306|348->307|349->308|356->315|356->315|356->315|357->316|361->320|361->320|361->320|361->320|361->320|361->320|366->325|370->329|371->330|375->334|378->337|379->338|383->342|386->345|387->346|389->348|390->349|396->355|396->355|396->355|397->356|397->356|397->356|398->357|402->361|402->361|402->361|403->362|403->362|403->362|403->362|405->364|405->364|405->364|407->366|408->367|408->367|408->367|409->368|412->371|413->372|413->372|413->372|414->373|414->373|414->373|414->373|415->374|415->374|415->374|415->374|415->374|415->374|415->374|416->375|417->376|417->376|417->376|418->377|421->380|422->381|422->381|422->381|423->382|427->386|427->386|427->386|428->387|428->387|428->387|428->387|430->389|430->389|430->389|432->391|433->392|433->392|433->392|434->393|434->393|434->393|435->394|439->398|439->398|439->398|440->399|440->399|440->399|440->399|442->401|442->401|442->401|444->403|445->404|445->404|445->404|446->405|449->408|450->409|450->409|450->409|451->410|451->410|451->410|451->410|452->411|452->411|452->411|452->411|452->411|452->411|452->411|453->412|454->413|454->413|454->413|455->414|458->417|459->418|459->418|459->418|460->419|464->423|464->423|464->423|465->424|465->424|465->424|465->424|467->426|467->426|467->426|469->428|470->429|470->429|470->429|471->430|471->430|471->430|472->431|476->435|476->435|476->435|477->436|478->437|478->437|478->437|478->437|483->442|483->442|483->442|483->442|483->442|483->442|487->446|488->447|488->447|488->447|489->448|492->451|493->452|493->452|493->452|494->453|494->453|494->453|494->453|495->454|495->454|496->455|496->455|496->455|496->455|496->455|496->455|497->456|497->456|498->457|500->459|501->460|501->460|501->460|502->461|505->464|506->465|506->465|506->465|507->466|511->470|511->470|511->470|512->471|513->472|513->472|513->472|513->472|513->472|513->472|518->477|518->477|518->477|518->477|518->477|518->477|518->477|518->477|522->481|523->482|524->483|527->486|527->486|527->486|528->487|529->488|530->489|535->494|535->494|535->494|536->495|537->496|537->496|537->496|538->497|538->497|538->497|539->498|539->498|539->498|540->499|540->499|540->499|540->499|540->499|540->499|541->500|541->500|541->500|542->501|542->501|542->501|542->501|542->501|542->501|543->502|544->503|545->504|546->505|547->506|548->507|561->520|561->520|561->520|562->521|563->522|563->522|563->522|564->523|564->523|564->523|565->524|565->524|565->524|566->525|566->525|566->525|566->525|566->525|566->525|567->526|567->526|567->526|568->527|568->527|568->527|568->527|568->527|568->527|569->528|570->529|571->530|572->531|573->532|574->533|587->546|587->546|587->546|588->547|589->548|589->548|589->548|590->549|590->549|590->549|591->550|591->550|591->550|592->551|592->551|592->551|592->551|592->551|592->551|592->551|593->552|593->552|593->552|594->553|594->553|594->553|594->553|594->553|594->553|594->553|595->554|596->555|597->556|598->557|599->558|600->559|610->569
                  -- GENERATED --
              */
          