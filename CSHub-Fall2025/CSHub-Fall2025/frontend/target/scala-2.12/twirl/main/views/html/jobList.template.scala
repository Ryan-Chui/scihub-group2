
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

object jobList extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template12[List[Job],Integer,String,Integer,Integer,Integer,String,Integer,String,Long,Integer,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(jobs: List[Job],
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
/*13.2*/import models.Job

def /*15.2*/scripts/*15.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*15.13*/("""
    """),format.raw/*16.5*/("""<script type = "module" src='"""),_display_(/*16.35*/routes/*16.41*/.Assets.at("javascripts/voiceJump.js")),format.raw/*16.79*/("""'></script>
    <link rel="stylesheet" href="/assets/stylesheets/responsive-table.css">
    <script type="text/javascript">

            $(document).ready(function () """),format.raw/*20.43*/("""{"""),format.raw/*20.44*/("""
                """),format.raw/*21.17*/("""var technologiesArray = []
                """),_display_(/*22.18*/for(i <- 0 until jobs.size) yield /*22.45*/ {_display_(Seq[Any](format.raw/*22.47*/("""
                """),format.raw/*23.17*/("""var json = """),format.raw/*23.28*/("""{"""),format.raw/*23.29*/("""}"""),format.raw/*23.30*/(""";
                json.id = '"""),_display_(/*24.29*/jobs/*24.33*/.get(i).getId()),format.raw/*24.48*/("""';
                json.url = "/job/jobDetail/" + json.id;

                json.name = '"""),_display_(/*27.31*/jobs/*27.35*/.get(i).getTitle),format.raw/*27.51*/("""'.replace(/[^a-zA-Z0-9]/g, " ").replace(/  +/g, " ").trim();
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

                var url = "/job/searchPOST?pageNum=" + (pageNum) + "&sortCriteria=" + sort;
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
            """),format.raw/*60.13*/("""}"""),format.raw/*60.14*/("""

            """),format.raw/*62.13*/("""function string2Map(str) """),format.raw/*62.38*/("""{"""),format.raw/*62.39*/("""

                """),format.raw/*64.17*/("""var map = new Map();
                var splitedString = str.replace(new RegExp("],", 'g'), ";");
                var array = splitedString.split(";");
                for(var i=0; i<array.length; i++)"""),format.raw/*67.50*/("""{"""),format.raw/*67.51*/("""
                    """),format.raw/*68.21*/("""var idAndEventsString = array[i];
                    idAndEventsString = idAndEventsString.replace(/["""),format.raw/*69.69*/("""{"""),format.raw/*69.70*/("""}"""),format.raw/*69.71*/("""[\]\\]/g, " ");
                    var idAndEvents = idAndEventsString.split("=");
                    var id = idAndEvents[0];
                    var eventsString = idAndEvents[1];
                    var events = eventsString.split(",");
                    console.log("events:" + events + "," + i);

                    var formatedEvents = "";
                    for(var j=0; j<events.length; j++)"""),format.raw/*77.55*/("""{"""),format.raw/*77.56*/("""
                        """),format.raw/*78.25*/("""events[j] = events[j].trim();
                        formatedEvents = formatedEvents + events[j] + ";";
                    """),format.raw/*80.21*/("""}"""),format.raw/*80.22*/("""
                    """),format.raw/*81.21*/("""if(formatedEvents.length > 1)
                        map.set(id.trim(), formatedEvents);
                """),format.raw/*83.17*/("""}"""),format.raw/*83.18*/("""

                """),format.raw/*85.17*/("""return map;
            """),format.raw/*86.13*/("""}"""),format.raw/*86.14*/("""

    """),format.raw/*88.5*/("""</script>
    <style>
            .follow-fab """),format.raw/*90.25*/("""{"""),format.raw/*90.26*/("""
                """),format.raw/*91.17*/("""top: -20px !important;
                bottom: auto !important;
                right: -20px !important;
            """),format.raw/*94.13*/("""}"""),format.raw/*94.14*/("""
    """),format.raw/*95.5*/("""</style>
""")))};
Seq[Any](format.raw/*10.84*/("""
"""),format.raw/*14.1*/("""
"""),format.raw/*96.2*/("""

"""),_display_(/*98.2*/main("All Jobs", scripts)/*98.27*/ {_display_(Seq[Any](format.raw/*98.29*/("""
    """),format.raw/*99.5*/("""<div class="container">
        <div class="card-panel center">
            """),_display_(/*101.14*/if(listType.equals("search"))/*101.43*/ {_display_(Seq[Any](format.raw/*101.45*/("""
                """),format.raw/*102.17*/("""<div class="row card-panel z-depth-0 project-zone-panel">
                    <div class="col s12" style="margin-top: -10px;
                        margin-bottom: -10px;">
                        <h6 class="center tooltipped" data-position="bottom" data-tooltip="This list shows the search results." >
                            Search Result
                        </h6>
                    </div>
                </div>
            """)))}/*110.14*/else if(listType.equals("all"))/*110.46*/ {_display_(Seq[Any](format.raw/*110.48*/("""
            """),format.raw/*111.13*/("""<div class="row card-panel z-depth-0 project-zone-panel">
                <div class="col s12" style="margin-top: -10px;
                    margin-bottom: -10px;">
                    <h6 class="center tooltipped" data-position="bottom" data-tooltip="This list shows all the projects." >
                        List of Jobs Posted at SMU-Lyle-Sci-Hub
                    </h6>
                </div>
            </div>
            """)))}),format.raw/*119.14*/("""

            """),_display_(/*121.14*/if(jobs.size() > 0)/*121.33*/ {_display_(Seq[Any](format.raw/*121.35*/("""
                """),format.raw/*122.17*/("""<div class="col s8 offset-s2">
                    <h4>Job List</h4>

                </div>
                <div class="col s2">
                    <button id = "speak-from-filter" hidden></button>
                    <div id="nasaText" hidden></div>
                    <div id="requestField"></div>
                    <div id="replyField"></div>
                </div>
                <div class="row">
                    <div class="col s6">
                        <h6 class="left">Showing results: """),_display_(/*134.60*/{
                            offset + 1
                        }),format.raw/*136.26*/(""" """),format.raw/*136.27*/("""to """),_display_(/*136.31*/{
                            offset + count
                        }),format.raw/*138.26*/(""" """),format.raw/*138.27*/("""of """),_display_(/*138.31*/total),format.raw/*138.36*/("""</h6>
                    </div>
                    <div class="col s6" style="padding-top: -5px;
                        margin-top: -2px">
                        <a class='dropdown-trigger btn-flat right' href='#' data-target='dropdown2' style="text-transform: none;
                            font-weight: bold;
                            color: black;
                            font-family: AmazonEmberBold, Helvetica Neue Bold, Helvetica Neue, Helvetica, Arial, sans-serif;
                        !important; ">
                            Sort By: &nbsp; <font color="#3a5dc3">
                            """),_display_(/*148.30*/if(sort.equals("id"))/*148.51*/ {_display_(Seq[Any](format.raw/*148.53*/("""
                                """),format.raw/*149.33*/("""Job ID
                            """)))}/*150.30*/else if(sort.equals("jobTitle"))/*150.62*/{_display_(Seq[Any](format.raw/*150.63*/("""
                        """),format.raw/*151.25*/("""Job Title
                        """)))}/*152.26*/else/*152.31*/{_display_(Seq[Any](format.raw/*152.32*/("""
                        """),format.raw/*153.25*/("""Job Keywords
                        """)))}),format.raw/*154.26*/("""</font> <i class="material-icons right">expand_more</i></a>

                            <!-- Dropdown Structure -->
                        <ul id='dropdown2' class='dropdown-content'>
                        """),_display_(/*158.26*/if(listType.equals("all"))/*158.52*/ {_display_(Seq[Any](format.raw/*158.54*/("""
                            """),format.raw/*159.29*/("""<li><a href=""""),_display_(/*159.43*/routes/*159.49*/.JobController.jobList(1, "id")),format.raw/*159.80*/("""" class="grey-text text-darken-4"><i class="material-icons">
                                event</i>Job ID</a></li>
                            <li><a href=""""),_display_(/*161.43*/routes/*161.49*/.JobController.jobList(1, "title")),format.raw/*161.83*/("""" class="grey-text text-darken-4"><i class="material-icons">
                                sort_by_alpha</i>Job Title </a></li>
                            <li><a href=""""),_display_(/*163.43*/routes/*163.49*/.JobController.jobList(1, "fields")),format.raw/*163.84*/("""" class="grey-text text-darken-4"><i class="material-icons">
                                sort_by_alpha</i>Job Fields </a></li>
                        """)))}/*165.26*/else/*165.31*/{_display_(Seq[Any](format.raw/*165.32*/("""
                            """),format.raw/*166.29*/("""<li>
                                <a onclick="jumpToPage(1, 'id', '"""),_display_(/*167.67*/searchBody),format.raw/*167.77*/("""')">
                                    <i class="material-icons">event</i>Job ID
                                </a>
                            </li>
                            <li>
                                <a onclick="jumpToPage(1, 'title', '"""),_display_(/*172.70*/searchBody),format.raw/*172.80*/("""')">
                                    <i class="material-icons">sort_by_alpha</i>Job Title
                                </a>
                            </li>
                            <li>
                                <a onclick="jumpToPage(1, 'location', '"""),_display_(/*177.73*/searchBody),format.raw/*177.83*/("""')">
                                    <i class="material-icons">sort_by_alpha</i>Job Location
                                </a>
                            </li>
                        """)))}),format.raw/*181.26*/("""
                        """),format.raw/*182.25*/("""</ul>
                    </div>
                </div>
                <div class="desktop-table-view">
                    <div class="table-responsive">
                        <table class="centered responsive-table striped" id="projectTable" >
                            <thead>
                                <tr class="list-header" style="border-bottom: 1px solid;
                        !important;">
                                    <th style="cursor: pointer;">Job Id</th>
                                    <th style="cursor: pointer;">Title</th>
                                    <th style="cursor: pointer;">Short Description</th>
                                    <th style="cursor: pointer;">Fields</th>
                                    <th style="cursor: pointer;">Status</th>
                                    <th style="cursor: pointer;">updateTime</th>
                                </tr>
                            </thead>
                            <tbody>
                            """),_display_(/*200.30*/for((entry, index) <- jobs.zipWithIndex if entry.getStatus() != "closed" ) yield /*200.104*/ {_display_(Seq[Any](format.raw/*200.106*/("""
                                """),format.raw/*201.33*/("""<tr>
                                    <td>"""),_display_(/*202.42*/entry/*202.47*/.getId()),format.raw/*202.55*/("""</td>


"""),format.raw/*205.62*/("""
"""),format.raw/*206.104*/("""
"""),format.raw/*207.58*/("""
"""),format.raw/*208.42*/("""
"""),format.raw/*209.41*/("""
"""),format.raw/*210.117*/("""
"""),format.raw/*211.34*/("""
                                    """),format.raw/*212.37*/("""<td>
                                        """),_display_(/*213.42*/if(entry.getTitle() != null && entry.getTitle().nonEmpty)/*213.99*/ {_display_(Seq[Any](format.raw/*213.101*/("""
                                            """),format.raw/*214.45*/("""<a href = """"),_display_(/*214.57*/routes/*214.63*/.JobController.jobDetail(entry.getId())),format.raw/*214.102*/("""">"""),_display_(/*214.105*/entry/*214.110*/.getTitle()),format.raw/*214.121*/("""</a>
                                            <span class=""""),_display_(/*215.59*/entry/*215.64*/.getId()),format.raw/*215.72*/(""" """),format.raw/*215.73*/("""editable" data-name="title"></span>
"""),format.raw/*216.76*/("""
"""),format.raw/*217.82*/("""
"""),format.raw/*218.49*/("""
"""),format.raw/*219.62*/("""
"""),format.raw/*220.42*/("""
                                        """)))}/*221.43*/else/*221.48*/{_display_(Seq[Any](format.raw/*221.49*/("""
                                            """),format.raw/*222.45*/("""<span class=""""),_display_(/*222.59*/entry/*222.64*/.getId()),format.raw/*222.72*/(""" """),format.raw/*222.73*/("""editable" data-name="title"> -</span>
                                        """)))}),format.raw/*223.42*/("""
                                    """),format.raw/*224.37*/("""</td>

"""),format.raw/*226.73*/("""
"""),format.raw/*227.115*/("""

"""),format.raw/*229.69*/("""
"""),format.raw/*230.42*/("""
"""),format.raw/*231.41*/("""
"""),format.raw/*232.128*/("""
"""),format.raw/*233.34*/("""



"""),format.raw/*237.63*/("""
"""),format.raw/*238.105*/("""

"""),format.raw/*240.59*/("""
"""),format.raw/*241.42*/("""
"""),format.raw/*242.41*/("""
"""),format.raw/*243.118*/("""
"""),format.raw/*244.34*/("""
                                    """),format.raw/*245.37*/("""<td>
                                        <span class=""""),_display_(/*246.55*/entry/*246.60*/.getId()),format.raw/*246.68*/(""" """),format.raw/*246.69*/("""editable" data-name="shortDescription"></span>
                                        """),_display_(/*247.42*/if(entry.getShortDescription() != null && entry.getShortDescription().nonEmpty)/*247.121*/ {_display_(Seq[Any](format.raw/*247.123*/("""
"""),format.raw/*248.87*/("""
"""),format.raw/*249.93*/("""
"""),format.raw/*250.49*/("""
"""),format.raw/*251.73*/("""
"""),format.raw/*252.42*/("""
                                            """),_display_(/*253.46*/entry/*253.51*/.getShortDescription()),format.raw/*253.73*/("""
                                        """)))}/*254.43*/else/*254.48*/{_display_(Seq[Any](format.raw/*254.49*/("""
                                            """),format.raw/*255.45*/("""<span class=""""),_display_(/*255.59*/entry/*255.64*/.getId()),format.raw/*255.72*/(""" """),format.raw/*255.73*/("""editable" data-name="shortDescription"> -</span>
                                        """)))}),format.raw/*256.42*/("""
                                    """),format.raw/*257.37*/("""</td>
                                    <td>
                                        <span class=""""),_display_(/*259.55*/entry/*259.60*/.getId()),format.raw/*259.68*/(""" """),format.raw/*259.69*/("""editable" data-name="fields"></span>
                                        """),_display_(/*260.42*/if(entry.getFields() != null && entry.getFields().nonEmpty)/*260.101*/ {_display_(Seq[Any](format.raw/*260.103*/("""
"""),format.raw/*261.77*/("""
"""),format.raw/*262.83*/("""
"""),format.raw/*263.49*/("""
"""),format.raw/*264.63*/("""
"""),format.raw/*265.42*/("""
                                            """),_display_(/*266.46*/entry/*266.51*/.getFields()),format.raw/*266.63*/("""
                                        """)))}/*267.43*/else/*267.48*/{_display_(Seq[Any](format.raw/*267.49*/("""
                                            """),format.raw/*268.45*/("""<span class=""""),_display_(/*268.59*/entry/*268.64*/.getId()),format.raw/*268.72*/(""" """),format.raw/*268.73*/("""editable" data-name="fields">&ensp; -</span>
                                        """)))}),format.raw/*269.42*/("""
                                    """),format.raw/*270.37*/("""</td>
                                    """),_display_(/*271.38*/if(entry.getStatus() == "open")/*271.69*/ {_display_(Seq[Any](format.raw/*271.71*/("""
                                        """),format.raw/*272.41*/("""<td>
                                            <span class="new badge light-green darken-1" data-badge-caption="open"></span>
                                        </td>
                                    """)))}/*275.39*/else if(entry.getStatus() == "pending")/*275.78*/{_display_(Seq[Any](format.raw/*275.79*/("""
                                    """),format.raw/*276.37*/("""<td>
                                        <span class="new badge purple darken-1" data-badge-caption="pending"></span>
                                    </td>
                                    """)))}/*279.38*/else/*279.42*/{_display_(Seq[Any](format.raw/*279.43*/("""
                                    """),format.raw/*280.37*/("""<td>
                                        <span class="new badge blue darken-3" data-badge-caption="updated"></span>
                                    </td>
                                    """)))}),format.raw/*283.38*/("""
                                    """),_display_(/*284.38*/if(entry.getUpdateTime() != "")/*284.69*/ {_display_(Seq[Any](format.raw/*284.71*/("""
                                        """),format.raw/*285.41*/("""<td><span class=""""),_display_(/*285.59*/entry/*285.64*/.getId()),format.raw/*285.72*/(""" """),format.raw/*285.73*/("""editable" data-name='updateTime'></span>
                                            """),_display_(/*286.46*/entry/*286.51*/.getUpdateTime()),format.raw/*286.67*/("""
                                        """),format.raw/*287.41*/("""</td>
                                    """)))}/*288.39*/else/*288.44*/{_display_(Seq[Any](format.raw/*288.45*/("""
                                        """),format.raw/*289.41*/("""<td><span class=""""),_display_(/*289.59*/entry/*289.64*/.getId()),format.raw/*289.72*/(""" """),format.raw/*289.73*/("""editable" data-name='updateTime'> -</span></td>
                                    """)))}),format.raw/*290.38*/("""
                                """),format.raw/*291.33*/("""</tr>
                            """)))}),format.raw/*292.30*/("""
                            """),format.raw/*293.29*/("""</tbody>
                        </table>
                    </div>
                </div>

                <div class="mobile-table-view">
                    """),_display_(/*299.22*/for(entry <- jobs.asScala) yield /*299.48*/ {_display_(Seq[Any](format.raw/*299.50*/("""
                        """),format.raw/*300.25*/("""<div class="card-panel z-depth-1" style="margin-bottom: 16px;">

                                <!-- Job Id -->
                            <div><h6>Job Id:</h6> """),_display_(/*303.52*/entry/*303.57*/.getId()),format.raw/*303.65*/("""</div>

                                <!-- Title -->
                            <div><h6>Title:</h6>
                                """),_display_(/*307.34*/if(entry.getTitle() != null && entry.getTitle().nonEmpty)/*307.91*/ {_display_(Seq[Any](format.raw/*307.93*/("""
                                    """),format.raw/*308.37*/("""<a href = """"),_display_(/*308.49*/routes/*308.55*/.JobController.jobDetail(entry.getId())),format.raw/*308.94*/("""">
                                    """),_display_(/*309.38*/entry/*309.43*/.getTitle()),format.raw/*309.54*/("""</a>
                                """)))}/*310.35*/else/*310.40*/{_display_(Seq[Any](format.raw/*310.41*/("""
                                    """),format.raw/*311.37*/("""<span> -</span>
                                """)))}),format.raw/*312.34*/("""
                            """),format.raw/*313.29*/("""</div>

                            <!-- Short Description (Truncated if too long) -->
                            <div><h6>Short Description:</h6>
                                """),_display_(/*317.34*/{
                                    val desc = Option(entry.getShortDescription).getOrElse("")
                                    val words = desc.split("\\s+")
                                    if (words.length > 30) words.take(30).mkString(" ") + "..." else desc
                                }),format.raw/*321.34*/("""
                            """),format.raw/*322.29*/("""</div>

                                <!-- Fields (Truncated if too long) -->
                            <div><h6>Fields:</h6>
                                """),_display_(/*326.34*/{
                                    val fields = Option(entry.getFields).getOrElse("")
                                    if (fields.length > 50) fields.take(50) + "..." else fields
                                }),format.raw/*329.34*/("""
                            """),format.raw/*330.29*/("""</div>

                                <!-- Status -->
                            <div><h6>Status:</h6> """),_display_(/*333.52*/entry/*333.57*/.getStatus()),format.raw/*333.69*/("""</div>

                                <!-- Update Time -->
                            <div><h6>Update Time:</h6>
                                """),_display_(/*337.34*/if(entry.getUpdateTime() != null && entry.getUpdateTime().nonEmpty)/*337.101*/ {_display_(Seq[Any](format.raw/*337.103*/("""
                                    """),_display_(/*338.38*/entry/*338.43*/.getUpdateTime()),format.raw/*338.59*/("""
                                """)))}/*339.35*/else/*339.40*/{_display_(Seq[Any](format.raw/*339.41*/("""
                                    """),format.raw/*340.37*/("""<span> -</span>
                                """)))}),format.raw/*341.34*/("""
                            """),format.raw/*342.29*/("""</div>

                        </div>
                    """)))}),format.raw/*345.22*/("""
                """),format.raw/*346.17*/("""</div>

                <div class="row">
                    <div class="col s12">
                        <ul class="pagination center-align">

                            """),_display_(/*352.30*/if(listType.equals("all"))/*352.56*/ {_display_(Seq[Any](format.raw/*352.58*/("""
                                """),_display_(/*353.34*/if(pageNum == 1)/*353.50*/ {_display_(Seq[Any](format.raw/*353.52*/("""
                                    """),format.raw/*354.37*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                        first_page</i></li>
                                    <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                        chevron_left</i></li>
                                """)))}/*358.35*/else/*358.40*/{_display_(Seq[Any](format.raw/*358.41*/("""
                                    """),format.raw/*359.37*/("""<li class="waves-effect"><a href=""""),_display_(/*359.72*/routes/*359.78*/.JobController.jobList(1, sort)),format.raw/*359.109*/(""""><i class="material-icons">
                                        first_page</i></a></li>
                                    <li class="waves-effect"><a href=""""),_display_(/*361.72*/routes/*361.78*/.JobController.jobList(pageNum - 1, sort)),format.raw/*361.119*/(""""><i class="material-icons">
                                        chevron_left</i></a></li>
                                """)))}),format.raw/*363.34*/("""
                                """),_display_(/*364.34*/if(beginIndexForPagination > 1)/*364.65*/ {_display_(Seq[Any](format.raw/*364.67*/("""
                                    """),format.raw/*365.37*/("""<li class="waves-effect modal-trigger" href="#allPageModal" style="cursor: pointer;
                                        font-size: 20px;
                                        font-weight: bold">...</li>
                                """)))}),format.raw/*368.34*/("""
                                """),_display_(/*369.34*/for(i <- (beginIndexForPagination + 0) to (endIndexForPagination + 0)) yield /*369.104*/ {_display_(Seq[Any](format.raw/*369.106*/("""
                                    """),format.raw/*370.37*/("""<li """),_display_(/*370.42*/if(pageNum == i)/*370.58*/ {_display_(Seq[Any](format.raw/*370.60*/("""
                                        """),format.raw/*371.41*/("""class="active"""")))}),format.raw/*371.56*/("""><a href=""""),_display_(/*371.67*/routes/*371.73*/.JobController.jobList(i, sort)),format.raw/*371.104*/("""">"""),_display_(/*371.107*/i),format.raw/*371.108*/("""</a></li>
                                """)))}),format.raw/*372.34*/("""
                                """),_display_(/*373.34*/if(endIndexForPagination < ((total - 1) / pageLimit + 1))/*373.91*/ {_display_(Seq[Any](format.raw/*373.93*/("""
                                    """),format.raw/*374.37*/("""<li class="waves-effect modal-trigger" href="#allPageModal" style="cursor: pointer;
                                        font-size: 20px;
                                        font-weight: bold">...</li>
                                """)))}),format.raw/*377.34*/("""
                                """),_display_(/*378.34*/if((offset + count) >= total)/*378.63*/ {_display_(Seq[Any](format.raw/*378.65*/("""
                                    """),format.raw/*379.37*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                        chevron_right</i></li>
                                    <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                        last_page</i></li>
                                """)))}/*383.35*/else/*383.40*/{_display_(Seq[Any](format.raw/*383.41*/("""
                                    """),format.raw/*384.37*/("""<li class="waves-effect"><a href=""""),_display_(/*384.72*/routes/*384.78*/.JobController.jobList(pageNum + 1, sort)),format.raw/*384.119*/(""""><i class="material-icons">
                                        chevron_right</i></a></li>
                                    <li class="waves-effect"><a href=""""),_display_(/*386.72*/routes/*386.78*/.JobController.jobList((total - 1) / pageLimit + 1, sort)),format.raw/*386.135*/(""""><i class="material-icons">
                                        last_page</i></a></li>
                                """)))}),format.raw/*388.34*/("""
                            """)))}/*389.30*/else if(listType.equals("my enroll"))/*389.67*/{_display_(Seq[Any](format.raw/*389.68*/("""
                            """),_display_(/*390.30*/if(pageNum == 1)/*390.46*/ {_display_(Seq[Any](format.raw/*390.48*/("""
                                """),format.raw/*391.33*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    first_page</i></li>
                                <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    chevron_left</i></li>
                            """)))}/*395.31*/else/*395.36*/{_display_(Seq[Any](format.raw/*395.37*/("""
                                """),format.raw/*396.33*/("""<li class="waves-effect"><a href=""""),_display_(/*396.68*/routes/*396.74*/.ProjectController.getMyEnrolledProjects(1, sort)),format.raw/*396.123*/(""""><i class="material-icons">
                                    first_page</i></a></li>
                                <li class="waves-effect"><a href=""""),_display_(/*398.68*/routes/*398.74*/.ProjectController.getMyEnrolledProjects(pageNum - 1, sort)),format.raw/*398.133*/(""""><i class="material-icons">
                                    chevron_left</i></a></li>
                            """)))}),format.raw/*400.30*/("""
                            """),_display_(/*401.30*/if(beginIndexForPagination > 1)/*401.61*/ {_display_(Seq[Any](format.raw/*401.63*/("""
                                """),format.raw/*402.33*/("""<li class="waves-effect modal-trigger" href="#enrollPageModal" style="cursor: pointer;
                                    font-size: 20px;
                                    font-weight: bold">...</li>
                            """)))}),format.raw/*405.30*/("""
                            """),_display_(/*406.30*/for(i <- (beginIndexForPagination + 0) to (endIndexForPagination + 0)) yield /*406.100*/ {_display_(Seq[Any](format.raw/*406.102*/("""
                                """),format.raw/*407.33*/("""<li """),_display_(/*407.38*/if(pageNum == i)/*407.54*/ {_display_(Seq[Any](format.raw/*407.56*/("""
                                    """),format.raw/*408.37*/("""class="active"""")))}),format.raw/*408.52*/("""><a href=""""),_display_(/*408.63*/routes/*408.69*/.ProjectController.getMyEnrolledProjects(i, sort)),format.raw/*408.118*/("""">"""),_display_(/*408.121*/i),format.raw/*408.122*/("""</a></li>
                            """)))}),format.raw/*409.30*/("""
                            """),_display_(/*410.30*/if(endIndexForPagination < ((total - 1) / pageLimit + 1))/*410.87*/ {_display_(Seq[Any](format.raw/*410.89*/("""
                                """),format.raw/*411.33*/("""<li class="waves-effect modal-trigger" href="#enrollPageModal" style="cursor: pointer;
                                    font-size: 20px;
                                    font-weight: bold">...</li>
                            """)))}),format.raw/*414.30*/("""
                            """),_display_(/*415.30*/if((offset + count) >= total)/*415.59*/ {_display_(Seq[Any](format.raw/*415.61*/("""
                                """),format.raw/*416.33*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    chevron_right</i></li>
                                <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    last_page</i></li>
                            """)))}/*420.31*/else/*420.36*/{_display_(Seq[Any](format.raw/*420.37*/("""
                                """),format.raw/*421.33*/("""<li class="waves-effect"><a href=""""),_display_(/*421.68*/routes/*421.74*/.ProjectController.getMyEnrolledProjects(pageNum + 1, sort)),format.raw/*421.133*/(""""><i class="material-icons">
                                    chevron_right</i></a></li>
                                <li class="waves-effect"><a href=""""),_display_(/*423.68*/routes/*423.74*/.ProjectController.getMyEnrolledProjects((total - 1) / pageLimit + 1, sort)),format.raw/*423.149*/(""""><i class="material-icons">
                                    last_page</i></a></li>
                            """)))}),format.raw/*425.30*/("""
                            """)))}/*426.30*/else/*426.34*/{_display_(Seq[Any](format.raw/*426.35*/("""
                            """),_display_(/*427.30*/if(pageNum == 1)/*427.46*/ {_display_(Seq[Any](format.raw/*427.48*/("""
                                """),format.raw/*428.33*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    first_page</i></li>
                                <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    chevron_left</i></li>
                            """)))}/*432.31*/else/*432.36*/{_display_(Seq[Any](format.raw/*432.37*/("""
                                """),format.raw/*433.33*/("""<li class="waves-effect">
                                    <a href="#!" onclick="jumpToPage(1, '"""),_display_(/*434.75*/sort),format.raw/*434.79*/("""', '"""),_display_(/*434.84*/searchBody),format.raw/*434.94*/("""')">
                                        <i class="material-icons">first_page</i>
                                    </a>
                                </li>
                                <li class="waves-effect">
                                    <a href="#!" onclick="jumpToPage("""),_display_(/*439.71*/pageNum),format.raw/*439.78*/("""-1, '"""),_display_(/*439.84*/sort),format.raw/*439.88*/("""', '"""),_display_(/*439.93*/searchBody),format.raw/*439.103*/("""')">
                                        <i class="material-icons">chevron_left</i>
                                    </a>
                                </li>
                            """)))}),format.raw/*443.30*/("""
                            """),_display_(/*444.30*/if(beginIndexForPagination > 1)/*444.61*/ {_display_(Seq[Any](format.raw/*444.63*/("""
                                """),format.raw/*445.33*/("""<li class="waves-effect modal-trigger" href="#searchPageModal" style="cursor: pointer;
                                    font-size: 20px;
                                    font-weight: bold">...</li>
                            """)))}),format.raw/*448.30*/("""
                            """),_display_(/*449.30*/for(i <- (beginIndexForPagination + 0) to (endIndexForPagination + 0)) yield /*449.100*/ {_display_(Seq[Any](format.raw/*449.102*/("""
                                """),format.raw/*450.33*/("""<li """),_display_(/*450.38*/if(pageNum == i)/*450.54*/ {_display_(Seq[Any](format.raw/*450.56*/("""
                                    """),format.raw/*451.37*/("""class="active"""")))}),format.raw/*451.52*/(""">
                                    <a href="#!" onclick="jumpToPage("""),_display_(/*452.71*/i),format.raw/*452.72*/(""", '"""),_display_(/*452.76*/sort),format.raw/*452.80*/("""', '"""),_display_(/*452.85*/searchBody),format.raw/*452.95*/("""')">
                                    """),_display_(/*453.38*/i),format.raw/*453.39*/("""
                                    """),format.raw/*454.37*/("""</a>
                                </li>
                            """)))}),format.raw/*456.30*/("""
                            """),_display_(/*457.30*/if(endIndexForPagination < ((total - 1) / pageLimit + 1))/*457.87*/ {_display_(Seq[Any](format.raw/*457.89*/("""
                                """),format.raw/*458.33*/("""<li class="waves-effect modal-trigger" href="#searchPageModal" style="cursor: pointer;
                                    font-size: 20px;
                                    font-weight: bold">...</li>
                            """)))}),format.raw/*461.30*/("""
                            """),_display_(/*462.30*/if((offset + count) >= total)/*462.59*/ {_display_(Seq[Any](format.raw/*462.61*/("""
                                """),format.raw/*463.33*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    chevron_right</i></li>
                                <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    last_page</i></li>
                            """)))}/*467.31*/else/*467.36*/{_display_(Seq[Any](format.raw/*467.37*/("""
                                """),format.raw/*468.33*/("""<li class="waves-effect">
                                    <a href="#!" onclick="jumpToPage("""),_display_(/*469.71*/pageNum),format.raw/*469.78*/("""+1, '"""),_display_(/*469.84*/sort),format.raw/*469.88*/("""', '"""),_display_(/*469.93*/searchBody),format.raw/*469.103*/("""')">
                                        <i class="material-icons">chevron_right</i>
                                    </a>
                                </li>
                                <li class="waves-effect">
                                    <a href="#!" onclick="jumpToPage(("""),_display_(/*474.72*/total),format.raw/*474.77*/("""-1)/("""),_display_(/*474.83*/pageLimit),format.raw/*474.92*/(""")+1, '"""),_display_(/*474.99*/sort),format.raw/*474.103*/("""', '"""),_display_(/*474.108*/searchBody),format.raw/*474.118*/("""')">
                                        <i class="material-icons">last_page</i>
                                    </a>
                                </li>
                            """)))}),format.raw/*478.30*/("""
                            """)))}),format.raw/*479.30*/("""
                        """),format.raw/*480.25*/("""</ul>
                    </div>
                </div>
            """)))}/*483.15*/else/*483.20*/{_display_(Seq[Any](format.raw/*483.21*/("""
                """),format.raw/*484.17*/("""<h5>No jobs registered yet.</h5>
            """)))}),format.raw/*485.14*/("""
            """),format.raw/*486.13*/("""<div id="allPageModal" class="modal">
                <div class="modal-content">
                    <h6>Select the page number you want to jump to</h6>
                    <div class="card z-depth-0">

                    """),_display_(/*491.22*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*491.79*/ {_display_(Seq[Any](format.raw/*491.81*/("""
                        """),format.raw/*492.25*/("""<ul class="pagination center-align">
                        """),_display_(/*493.26*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*493.65*/ {_display_(Seq[Any](format.raw/*493.67*/("""
                            """),_display_(/*494.30*/if(j <= ((total - 1)/(pageLimit) + 1))/*494.68*/ {_display_(Seq[Any](format.raw/*494.70*/("""
                                """),_display_(/*495.34*/if(j != pageNum)/*495.50*/ {_display_(Seq[Any](format.raw/*495.52*/("""
                                    """),format.raw/*496.37*/("""<li class="waves-effect grey lighten-3"><a href='"""),_display_(/*496.87*/routes/*496.93*/.JobController.jobList(j, sort)),format.raw/*496.124*/("""'>"""),_display_(/*496.127*/j),format.raw/*496.128*/("""</a></li>
                                """)))}/*497.34*/else/*497.38*/{_display_(Seq[Any](format.raw/*497.39*/("""
                                    """),format.raw/*498.37*/("""<li class="waves-effect active"><a href=""""),_display_(/*498.79*/routes/*498.85*/.JobController.jobList(j, sort)),format.raw/*498.116*/("""">"""),_display_(/*498.119*/j),format.raw/*498.120*/("""</a></li>
                                """)))}),format.raw/*499.34*/("""
                            """)))}),format.raw/*500.30*/("""
                        """)))}),format.raw/*501.26*/("""
                        """),format.raw/*502.25*/("""</ul>
                    """)))}),format.raw/*503.22*/("""
                    """),format.raw/*504.21*/("""</div>
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

                    """),_display_(/*517.22*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*517.79*/ {_display_(Seq[Any](format.raw/*517.81*/("""
                        """),format.raw/*518.25*/("""<ul class="pagination center-align">
                        """),_display_(/*519.26*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*519.65*/ {_display_(Seq[Any](format.raw/*519.67*/("""
                            """),_display_(/*520.30*/if(j <= ((total - 1)/(pageLimit) + 1))/*520.68*/ {_display_(Seq[Any](format.raw/*520.70*/("""
                                """),_display_(/*521.34*/if(j != pageNum)/*521.50*/ {_display_(Seq[Any](format.raw/*521.52*/("""
                                    """),format.raw/*522.37*/("""<li class="waves-effect grey lighten-3"><a href='"""),_display_(/*522.87*/routes/*522.93*/.ProjectController.getMyEnrolledProjects(j, sort)),format.raw/*522.142*/("""'>"""),_display_(/*522.145*/j),format.raw/*522.146*/("""</a></li>
                                """)))}/*523.34*/else/*523.38*/{_display_(Seq[Any](format.raw/*523.39*/("""
                                    """),format.raw/*524.37*/("""<li class="waves-effect active"><a href=""""),_display_(/*524.79*/routes/*524.85*/.ProjectController.getMyEnrolledProjects(j, sort)),format.raw/*524.134*/("""">"""),_display_(/*524.137*/j),format.raw/*524.138*/("""</a></li>
                                """)))}),format.raw/*525.34*/("""
                            """)))}),format.raw/*526.30*/("""
                        """)))}),format.raw/*527.26*/("""
                        """),format.raw/*528.25*/("""</ul>
                    """)))}),format.raw/*529.22*/("""
                    """),format.raw/*530.21*/("""</div>
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

                    """),_display_(/*543.22*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*543.79*/ {_display_(Seq[Any](format.raw/*543.81*/("""
                        """),format.raw/*544.25*/("""<ul class="pagination center-align">
                        """),_display_(/*545.26*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*545.65*/ {_display_(Seq[Any](format.raw/*545.67*/("""
                            """),_display_(/*546.30*/if(j <= ((total - 1)/(pageLimit) + 1))/*546.68*/ {_display_(Seq[Any](format.raw/*546.70*/("""
                                """),_display_(/*547.34*/if(j != pageNum)/*547.50*/ {_display_(Seq[Any](format.raw/*547.52*/("""
                                    """),format.raw/*548.37*/("""<li class="waves-effect grey lighten-3"><a href='#!' onclick="jumpToPage("""),_display_(/*548.111*/j),format.raw/*548.112*/(""", 'id', '"""),_display_(/*548.122*/searchBody),format.raw/*548.132*/("""')">"""),_display_(/*548.137*/j),format.raw/*548.138*/("""</a></li>
                                """)))}/*549.34*/else/*549.38*/{_display_(Seq[Any](format.raw/*549.39*/("""
                                    """),format.raw/*550.37*/("""<li class="waves-effect active"><a href="#!" onclick="jumpToPage("""),_display_(/*550.103*/j),format.raw/*550.104*/(""", 'id', '"""),_display_(/*550.114*/searchBody),format.raw/*550.124*/("""')">"""),_display_(/*550.129*/j),format.raw/*550.130*/("""</a></li>
                                """)))}),format.raw/*551.34*/("""
                            """)))}),format.raw/*552.30*/("""
                        """)))}),format.raw/*553.26*/("""
                        """),format.raw/*554.25*/("""</ul>
                    """)))}),format.raw/*555.22*/("""
                    """),format.raw/*556.21*/("""</div>
                </div>
                <div class="modal-footer">
                    <a href="#!" class="modal-close waves-effect waves-green btn-flat">
                        Cancel</a>
                </div>
            </div>

        </div>
    </div>
""")))}),format.raw/*566.2*/("""

"""))
      }
    }
  }

  def render(jobs:List[Job],pageNum:Integer,sort:String,offset:Integer,total:Integer,count:Integer,listType:String,pageLimit:Integer,searchBody:String,id:Long,beginIndexForPagination:Integer,endIndexForPagination:Integer): play.twirl.api.HtmlFormat.Appendable = apply(jobs,pageNum,sort,offset,total,count,listType,pageLimit,searchBody,id,beginIndexForPagination,endIndexForPagination)

  def f:((List[Job],Integer,String,Integer,Integer,Integer,String,Integer,String,Long,Integer,Integer) => play.twirl.api.HtmlFormat.Appendable) = (jobs,pageNum,sort,offset,total,count,listType,pageLimit,searchBody,id,beginIndexForPagination,endIndexForPagination) => apply(jobs,pageNum,sort,offset,total,count,listType,pageLimit,searchBody,id,beginIndexForPagination,endIndexForPagination)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:32 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/jobList.scala.html
                  HASH: 508bd5cde876b694e19793cd53f9234a4c532692
                  MATRIX: 1199->1|1577->307|1602->325|1626->342|1657->362|1672->369|1753->373|1785->378|1842->408|1857->414|1916->452|2111->619|2140->620|2185->637|2256->681|2299->708|2339->710|2384->727|2423->738|2452->739|2481->740|2538->770|2551->774|2587->789|2704->879|2717->883|2754->899|2956->1070|3001->1087|3293->1351|3322->1352|3415->1417|3444->1418|3490->1436|4190->2108|4219->2109|4261->2123|4314->2148|4343->2149|4389->2167|4618->2368|4647->2369|4696->2390|4826->2492|4855->2493|4884->2494|5317->2899|5346->2900|5399->2925|5552->3050|5581->3051|5630->3072|5764->3178|5793->3179|5839->3197|5891->3221|5920->3222|5953->3228|6027->3274|6056->3275|6101->3292|6246->3409|6275->3410|6307->3415|6357->305|6385->360|6413->3425|6442->3428|6476->3453|6516->3455|6548->3460|6653->3537|6692->3566|6733->3568|6779->3585|7237->4023|7278->4055|7319->4057|7361->4070|7827->4504|7870->4519|7899->4538|7940->4540|7986->4557|8522->5065|8610->5131|8640->5132|8672->5136|8764->5206|8794->5207|8826->5211|8853->5216|9501->5836|9532->5857|9573->5859|9635->5892|9691->5928|9733->5960|9773->5961|9827->5986|9882->6021|9896->6026|9936->6027|9990->6052|10060->6090|10299->6301|10335->6327|10376->6329|10434->6358|10476->6372|10492->6378|10545->6409|10733->6569|10749->6575|10805->6609|11005->6781|11021->6787|11078->6822|11254->6978|11268->6983|11308->6984|11366->7013|11465->7084|11497->7094|11781->7350|11813->7360|12111->7630|12143->7640|12368->7833|12422->7858|13478->8886|13570->8960|13612->8962|13674->8995|13748->9041|13763->9046|13793->9054|13830->9123|13861->9227|13891->9285|13921->9327|13951->9368|13982->9485|14012->9519|14078->9556|14152->9602|14219->9659|14261->9661|14335->9706|14375->9718|14391->9724|14453->9763|14485->9766|14501->9771|14535->9782|14626->9845|14641->9850|14671->9858|14701->9859|14766->9970|14796->10052|14826->10101|14856->10163|14886->10205|14948->10248|14962->10253|15002->10254|15076->10299|15118->10313|15133->10318|15163->10326|15193->10327|15304->10406|15370->10443|15406->10522|15437->10637|15468->10707|15498->10749|15528->10790|15559->10918|15589->10952|15622->11018|15653->11123|15684->11183|15714->11225|15744->11266|15775->11384|15805->11418|15871->11455|15958->11514|15973->11519|16003->11527|16033->11528|16149->11616|16239->11695|16281->11697|16311->11784|16341->11877|16371->11926|16401->11999|16431->12041|16505->12087|16520->12092|16564->12114|16626->12157|16640->12162|16680->12163|16754->12208|16796->12222|16811->12227|16841->12235|16871->12236|16993->12326|17059->12363|17188->12464|17203->12469|17233->12477|17263->12478|17369->12556|17439->12615|17481->12617|17511->12694|17541->12777|17571->12826|17601->12889|17631->12931|17705->12977|17720->12982|17754->12994|17816->13037|17830->13042|17870->13043|17944->13088|17986->13102|18001->13107|18031->13115|18061->13116|18179->13202|18245->13239|18316->13282|18357->13313|18398->13315|18468->13356|18699->13568|18748->13607|18788->13608|18854->13645|19075->13846|19089->13850|19129->13851|19195->13888|19426->14087|19492->14125|19533->14156|19574->14158|19644->14199|19690->14217|19705->14222|19735->14230|19765->14231|19879->14317|19894->14322|19932->14338|20002->14379|20065->14423|20079->14428|20119->14429|20189->14470|20235->14488|20250->14493|20280->14501|20310->14502|20427->14587|20489->14620|20556->14655|20614->14684|20804->14846|20847->14872|20888->14874|20942->14899|21134->15063|21149->15068|21179->15076|21344->15213|21411->15270|21452->15272|21518->15309|21558->15321|21574->15327|21635->15366|21703->15406|21718->15411|21751->15422|21809->15461|21823->15466|21863->15467|21929->15504|22010->15553|22068->15582|22277->15763|22602->16066|22660->16095|22851->16258|23091->16476|23149->16505|23284->16612|23299->16617|23333->16629|23510->16778|23588->16845|23630->16847|23696->16885|23711->16890|23749->16906|23803->16941|23817->16946|23857->16947|23923->16984|24004->17033|24062->17062|24154->17122|24200->17139|24403->17314|24439->17340|24480->17342|24542->17376|24568->17392|24609->17394|24675->17431|25056->17793|25070->17798|25110->17799|25176->17836|25239->17871|25255->17877|25309->17908|25501->18072|25517->18078|25581->18119|25741->18247|25803->18281|25844->18312|25885->18314|25951->18351|26225->18593|26287->18627|26375->18697|26417->18699|26483->18736|26516->18741|26542->18757|26583->18759|26653->18800|26700->18815|26739->18826|26755->18832|26809->18863|26841->18866|26865->18867|26940->18910|27002->18944|27069->19001|27110->19003|27176->19040|27450->19282|27512->19316|27551->19345|27592->19347|27658->19384|28039->19746|28053->19751|28093->19752|28159->19789|28222->19824|28238->19830|28302->19871|28497->20038|28513->20044|28593->20101|28750->20226|28800->20256|28847->20293|28887->20294|28945->20324|28971->20340|29012->20342|29074->20375|29439->20721|29453->20726|29493->20727|29555->20760|29618->20795|29634->20801|29706->20850|29890->21006|29906->21012|29988->21071|30140->21191|30198->21221|30239->21252|30280->21254|30342->21287|30607->21520|30665->21550|30753->21620|30795->21622|30857->21655|30890->21660|30916->21676|30957->21678|31023->21715|31070->21730|31109->21741|31125->21747|31197->21796|31229->21799|31253->21800|31324->21839|31382->21869|31449->21926|31490->21928|31552->21961|31817->22194|31875->22224|31914->22253|31955->22255|32017->22288|32382->22634|32396->22639|32436->22640|32498->22673|32561->22708|32577->22714|32659->22773|32846->22932|32862->22938|32960->23013|33109->23130|33159->23160|33173->23164|33213->23165|33271->23195|33297->23211|33338->23213|33400->23246|33765->23592|33779->23597|33819->23598|33881->23631|34009->23731|34035->23735|34068->23740|34100->23750|34421->24043|34450->24050|34484->24056|34510->24060|34543->24065|34576->24075|34804->24271|34862->24301|34903->24332|34944->24334|35006->24367|35271->24600|35329->24630|35417->24700|35459->24702|35521->24735|35554->24740|35580->24756|35621->24758|35687->24795|35734->24810|35834->24882|35857->24883|35889->24887|35915->24891|35948->24896|35980->24906|36050->24948|36073->24949|36139->24986|36243->25058|36301->25088|36368->25145|36409->25147|36471->25180|36736->25413|36794->25443|36833->25472|36874->25474|36936->25507|37301->25853|37315->25858|37355->25859|37417->25892|37541->25988|37570->25995|37604->26001|37630->26005|37663->26010|37696->26020|38021->26317|38048->26322|38082->26328|38113->26337|38148->26344|38175->26348|38209->26353|38242->26363|38467->26556|38529->26586|38583->26611|38672->26681|38686->26686|38726->26687|38772->26704|38850->26750|38892->26763|39145->26988|39219->27045|39260->27047|39314->27072|39404->27134|39460->27173|39501->27175|39559->27205|39607->27243|39648->27245|39710->27279|39736->27295|39777->27297|39843->27334|39921->27384|39937->27390|39991->27421|40023->27424|40047->27425|40110->27468|40124->27472|40164->27473|40230->27510|40300->27552|40316->27558|40370->27589|40402->27592|40426->27593|40501->27636|40563->27666|40621->27692|40675->27717|40734->27744|40784->27765|41291->28244|41365->28301|41406->28303|41460->28328|41550->28390|41606->28429|41647->28431|41705->28461|41753->28499|41794->28501|41856->28535|41882->28551|41923->28553|41989->28590|42067->28640|42083->28646|42155->28695|42187->28698|42211->28699|42274->28742|42288->28746|42328->28747|42394->28784|42464->28826|42480->28832|42552->28881|42584->28884|42608->28885|42683->28928|42745->28958|42803->28984|42857->29009|42916->29036|42966->29057|43473->29536|43547->29593|43588->29595|43642->29620|43732->29682|43788->29721|43829->29723|43887->29753|43935->29791|43976->29793|44038->29827|44064->29843|44105->29845|44171->29882|44274->29956|44298->29957|44337->29967|44370->29977|44404->29982|44428->29983|44491->30026|44505->30030|44545->30031|44611->30068|44706->30134|44730->30135|44769->30145|44802->30155|44836->30160|44860->30161|44935->30204|44997->30234|45055->30260|45109->30285|45168->30312|45218->30333|45515->30599
                  LINES: 35->1|47->11|48->12|49->13|51->15|51->15|53->15|54->16|54->16|54->16|54->16|58->20|58->20|59->21|60->22|60->22|60->22|61->23|61->23|61->23|61->23|62->24|62->24|62->24|65->27|65->27|65->27|68->30|69->31|77->39|77->39|79->41|79->41|81->43|98->60|98->60|100->62|100->62|100->62|102->64|105->67|105->67|106->68|107->69|107->69|107->69|115->77|115->77|116->78|118->80|118->80|119->81|121->83|121->83|123->85|124->86|124->86|126->88|128->90|128->90|129->91|132->94|132->94|133->95|135->10|136->14|137->96|139->98|139->98|139->98|140->99|142->101|142->101|142->101|143->102|151->110|151->110|151->110|152->111|160->119|162->121|162->121|162->121|163->122|175->134|177->136|177->136|177->136|179->138|179->138|179->138|179->138|189->148|189->148|189->148|190->149|191->150|191->150|191->150|192->151|193->152|193->152|193->152|194->153|195->154|199->158|199->158|199->158|200->159|200->159|200->159|200->159|202->161|202->161|202->161|204->163|204->163|204->163|206->165|206->165|206->165|207->166|208->167|208->167|213->172|213->172|218->177|218->177|222->181|223->182|241->200|241->200|241->200|242->201|243->202|243->202|243->202|246->205|247->206|248->207|249->208|250->209|251->210|252->211|253->212|254->213|254->213|254->213|255->214|255->214|255->214|255->214|255->214|255->214|255->214|256->215|256->215|256->215|256->215|257->216|258->217|259->218|260->219|261->220|262->221|262->221|262->221|263->222|263->222|263->222|263->222|263->222|264->223|265->224|267->226|268->227|270->229|271->230|272->231|273->232|274->233|278->237|279->238|281->240|282->241|283->242|284->243|285->244|286->245|287->246|287->246|287->246|287->246|288->247|288->247|288->247|289->248|290->249|291->250|292->251|293->252|294->253|294->253|294->253|295->254|295->254|295->254|296->255|296->255|296->255|296->255|296->255|297->256|298->257|300->259|300->259|300->259|300->259|301->260|301->260|301->260|302->261|303->262|304->263|305->264|306->265|307->266|307->266|307->266|308->267|308->267|308->267|309->268|309->268|309->268|309->268|309->268|310->269|311->270|312->271|312->271|312->271|313->272|316->275|316->275|316->275|317->276|320->279|320->279|320->279|321->280|324->283|325->284|325->284|325->284|326->285|326->285|326->285|326->285|326->285|327->286|327->286|327->286|328->287|329->288|329->288|329->288|330->289|330->289|330->289|330->289|330->289|331->290|332->291|333->292|334->293|340->299|340->299|340->299|341->300|344->303|344->303|344->303|348->307|348->307|348->307|349->308|349->308|349->308|349->308|350->309|350->309|350->309|351->310|351->310|351->310|352->311|353->312|354->313|358->317|362->321|363->322|367->326|370->329|371->330|374->333|374->333|374->333|378->337|378->337|378->337|379->338|379->338|379->338|380->339|380->339|380->339|381->340|382->341|383->342|386->345|387->346|393->352|393->352|393->352|394->353|394->353|394->353|395->354|399->358|399->358|399->358|400->359|400->359|400->359|400->359|402->361|402->361|402->361|404->363|405->364|405->364|405->364|406->365|409->368|410->369|410->369|410->369|411->370|411->370|411->370|411->370|412->371|412->371|412->371|412->371|412->371|412->371|412->371|413->372|414->373|414->373|414->373|415->374|418->377|419->378|419->378|419->378|420->379|424->383|424->383|424->383|425->384|425->384|425->384|425->384|427->386|427->386|427->386|429->388|430->389|430->389|430->389|431->390|431->390|431->390|432->391|436->395|436->395|436->395|437->396|437->396|437->396|437->396|439->398|439->398|439->398|441->400|442->401|442->401|442->401|443->402|446->405|447->406|447->406|447->406|448->407|448->407|448->407|448->407|449->408|449->408|449->408|449->408|449->408|449->408|449->408|450->409|451->410|451->410|451->410|452->411|455->414|456->415|456->415|456->415|457->416|461->420|461->420|461->420|462->421|462->421|462->421|462->421|464->423|464->423|464->423|466->425|467->426|467->426|467->426|468->427|468->427|468->427|469->428|473->432|473->432|473->432|474->433|475->434|475->434|475->434|475->434|480->439|480->439|480->439|480->439|480->439|480->439|484->443|485->444|485->444|485->444|486->445|489->448|490->449|490->449|490->449|491->450|491->450|491->450|491->450|492->451|492->451|493->452|493->452|493->452|493->452|493->452|493->452|494->453|494->453|495->454|497->456|498->457|498->457|498->457|499->458|502->461|503->462|503->462|503->462|504->463|508->467|508->467|508->467|509->468|510->469|510->469|510->469|510->469|510->469|510->469|515->474|515->474|515->474|515->474|515->474|515->474|515->474|515->474|519->478|520->479|521->480|524->483|524->483|524->483|525->484|526->485|527->486|532->491|532->491|532->491|533->492|534->493|534->493|534->493|535->494|535->494|535->494|536->495|536->495|536->495|537->496|537->496|537->496|537->496|537->496|537->496|538->497|538->497|538->497|539->498|539->498|539->498|539->498|539->498|539->498|540->499|541->500|542->501|543->502|544->503|545->504|558->517|558->517|558->517|559->518|560->519|560->519|560->519|561->520|561->520|561->520|562->521|562->521|562->521|563->522|563->522|563->522|563->522|563->522|563->522|564->523|564->523|564->523|565->524|565->524|565->524|565->524|565->524|565->524|566->525|567->526|568->527|569->528|570->529|571->530|584->543|584->543|584->543|585->544|586->545|586->545|586->545|587->546|587->546|587->546|588->547|588->547|588->547|589->548|589->548|589->548|589->548|589->548|589->548|589->548|590->549|590->549|590->549|591->550|591->550|591->550|591->550|591->550|591->550|591->550|592->551|593->552|594->553|595->554|596->555|597->556|607->566
                  -- GENERATED --
              */
          