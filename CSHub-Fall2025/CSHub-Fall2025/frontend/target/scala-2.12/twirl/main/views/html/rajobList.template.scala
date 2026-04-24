
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

object rajobList extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template12[List[RAJob],Integer,String,Integer,Integer,Integer,String,Integer,String,Long,Integer,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(rajobs: List[RAJob],
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
/*13.2*/import models.RAJob

def /*15.2*/scripts/*15.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*15.13*/("""
    """),format.raw/*16.5*/("""<script type = "module" src='"""),_display_(/*16.35*/routes/*16.41*/.Assets.at("javascripts/voiceJump.js")),format.raw/*16.79*/("""'></script>
    <link rel="stylesheet" href="/assets/stylesheets/responsive-table.css">
    <script type="text/javascript">

            $(document).ready(function () """),format.raw/*20.43*/("""{"""),format.raw/*20.44*/("""
                """),format.raw/*21.17*/("""var technologiesArray = []
                """),_display_(/*22.18*/for(i <- 0 until rajobs.size) yield /*22.47*/ {_display_(Seq[Any](format.raw/*22.49*/("""
                """),format.raw/*23.17*/("""var json = """),format.raw/*23.28*/("""{"""),format.raw/*23.29*/("""}"""),format.raw/*23.30*/(""";
                json.id = '"""),_display_(/*24.29*/rajobs/*24.35*/.get(i).getId()),format.raw/*24.50*/("""';
                json.url = "/rajob/rajobDetail/" + json.id;

                json.name = '"""),_display_(/*27.31*/rajobs/*27.37*/.get(i).getTitle),format.raw/*27.53*/("""'.replace(/[^a-zA-Z0-9]/g, " ").replace(/  +/g, " ").trim();
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

                var url = "/rajob/searchPOST?pageNum=" + (pageNum) + "&sortCriteria=" + sort;
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

            """),format.raw/*96.13*/(""".truncate-text """),format.raw/*96.28*/("""{"""),format.raw/*96.29*/("""
                """),format.raw/*97.17*/("""display: -webkit-box;
                -webkit-line-clamp: 3;
                -webkit-box-orient: vertical;
                overflow: hidden;
                text-overflow: ellipsis;
                max-height: 4.5em; /* 3 lines approx if line-height is 1.5em */
                line-height: 1.5em;
                cursor: pointer;
                white-space: normal;
            """),format.raw/*106.13*/("""}"""),format.raw/*106.14*/("""
    """),format.raw/*107.5*/("""</style>
""")))};
Seq[Any](format.raw/*10.84*/("""
"""),format.raw/*14.1*/("""
"""),format.raw/*108.2*/("""

"""),_display_(/*110.2*/main("All RA Jobs", scripts)/*110.30*/ {_display_(Seq[Any](format.raw/*110.32*/("""
    """),format.raw/*111.5*/("""<div class="container">
        <div class="card-panel center">
            """),_display_(/*113.14*/if(listType.equals("search"))/*113.43*/ {_display_(Seq[Any](format.raw/*113.45*/("""
                """),format.raw/*114.17*/("""<div class="row card-panel z-depth-0 project-zone-panel">
                    <div class="col s12" style="margin-top: -10px;
                        margin-bottom: -10px;">
                        <h6 class="center tooltipped" data-position="bottom" data-tooltip="This list shows the search results." >
                            Search Result
                        </h6>
                    </div>
                </div>
            """)))}/*122.14*/else if(listType.equals("all"))/*122.46*/ {_display_(Seq[Any](format.raw/*122.48*/("""
            """),format.raw/*123.13*/("""<div class="row card-panel z-depth-0 project-zone-panel">
                <div class="col s12" style="margin-top: -10px;
                    margin-bottom: -10px;">
                    <h6 class="center tooltipped" data-position="bottom" data-tooltip="This list shows all the RA jobs." >
                        List of RA Jobs Posted at SMU-Lyle-Sci-Hub
                    </h6>
                </div>
            </div>
            """)))}),format.raw/*131.14*/("""

            """),_display_(/*133.14*/if(rajobs.size() > 0)/*133.35*/ {_display_(Seq[Any](format.raw/*133.37*/("""
                """),format.raw/*134.17*/("""<div class="col s8 offset-s2">
                    <h4>RA Job List</h4>

                </div>
                <div class="col s2">
                    <button id = "speak-from-filter" hidden></button>
                    <div id="nasaText" hidden></div>
                    <div id="requestField"></div>
                    <div id="replyField"></div>
                </div>
                <div class="row">
                    <div class="col s6">
                        <h6 class="left">Showing results: """),_display_(/*146.60*/{
                            offset + 1
                        }),format.raw/*148.26*/(""" """),format.raw/*148.27*/("""to """),_display_(/*148.31*/{
                            offset + count
                        }),format.raw/*150.26*/(""" """),format.raw/*150.27*/("""of """),_display_(/*150.31*/total),format.raw/*150.36*/("""</h6>
                    </div>
                    <div class="col s6" style="padding-top: -5px;
                        margin-top: -2px">
                        <a class='dropdown-trigger btn-flat right' href='#' data-target='dropdown2' style="text-transform: none;
                            font-weight: bold;
                            color: black;
                            font-family: AmazonEmberBold, Helvetica Neue Bold, Helvetica Neue, Helvetica, Arial, sans-serif;
                        !important; ">
                            Sort By: &nbsp; <font color="#3a5dc3">
                            """),_display_(/*160.30*/if(sort.equals("id"))/*160.51*/ {_display_(Seq[Any](format.raw/*160.53*/("""
                                """),format.raw/*161.33*/("""Job ID
                            """)))}/*162.30*/else if(sort.equals("jobTitle"))/*162.62*/{_display_(Seq[Any](format.raw/*162.63*/("""
                        """),format.raw/*163.25*/("""Job Title
                        """)))}/*164.26*/else/*164.31*/{_display_(Seq[Any](format.raw/*164.32*/("""
                        """),format.raw/*165.25*/("""Job Keywords
                        """)))}),format.raw/*166.26*/("""</font> <i class="material-icons right">expand_more</i></a>

                            <!-- Dropdown Structure -->
                        <ul id='dropdown2' class='dropdown-content'>
                        """),_display_(/*170.26*/if(listType.equals("all"))/*170.52*/ {_display_(Seq[Any](format.raw/*170.54*/("""
                            """),format.raw/*171.29*/("""<li><a href=""""),_display_(/*171.43*/routes/*171.49*/.RAJobController.rajobList(1, "id")),format.raw/*171.84*/("""" class="grey-text text-darken-4"><i class="material-icons">
                                event</i>Job ID</a></li>
                            <li><a href=""""),_display_(/*173.43*/routes/*173.49*/.RAJobController.rajobList(1, "title")),format.raw/*173.87*/("""" class="grey-text text-darken-4"><i class="material-icons">
                                sort_by_alpha</i>Job Title </a></li>
                            <li><a href=""""),_display_(/*175.43*/routes/*175.49*/.RAJobController.rajobList(1, "fields")),format.raw/*175.88*/("""" class="grey-text text-darken-4"><i class="material-icons">
                                sort_by_alpha</i>Job Fields </a></li>
                        """)))}/*177.26*/else/*177.31*/{_display_(Seq[Any](format.raw/*177.32*/("""
                            """),format.raw/*178.29*/("""<li>
                                <a onclick="jumpToPage(1, 'id', '"""),_display_(/*179.67*/searchBody),format.raw/*179.77*/("""')">
                                    <i class="material-icons">event</i>Job ID
                                </a>
                            </li>
                            <li>
                                <a onclick="jumpToPage(1, 'title', '"""),_display_(/*184.70*/searchBody),format.raw/*184.80*/("""')">
                                    <i class="material-icons">sort_by_alpha</i>Job Title
                                </a>
                            </li>
                            <li>
                                <a onclick="jumpToPage(1, 'location', '"""),_display_(/*189.73*/searchBody),format.raw/*189.83*/("""')">
                                    <i class="material-icons">sort_by_alpha</i>Job Location
                                </a>
                            </li>
                        """)))}),format.raw/*193.26*/("""
                        """),format.raw/*194.25*/("""</ul>
                    </div>
                </div>
                <div class="desktop-table-view">
                    <div class="table-responsive">
                        <table class="centered responsive-table striped" id="projectTable" >
                            <thead>
                                <tr class="list-header" style="border-bottom: 1px solid;
                                !important;">
                                    <th style="cursor: pointer;">RA Job Id</th>
                                    <th style="cursor: pointer;">Title</th>
                                    <th style="cursor: pointer;">Short Description</th>
                                    <th style="cursor: pointer;">Fields</th>
                                    <th style="cursor: pointer;">Status</th>
                                    <th style="cursor: pointer;">updateTime</th>
                                </tr>
                            </thead>
                            <tbody>
                            """),_display_(/*212.30*/for((entry, index) <- rajobs.zipWithIndex if entry.getStatus() != "closed" ) yield /*212.106*/ {_display_(Seq[Any](format.raw/*212.108*/("""
                                """),format.raw/*213.33*/("""<tr>
                                    <td>"""),_display_(/*214.42*/entry/*214.47*/.getId()),format.raw/*214.55*/("""</td>

                                    """),format.raw/*216.98*/("""
                                    """),format.raw/*217.140*/("""
                                    """),format.raw/*218.94*/("""
                                    """),format.raw/*219.78*/("""
                                    """),format.raw/*220.77*/("""
                                    """),format.raw/*221.153*/("""
                                    """),format.raw/*222.70*/("""

                                    """),format.raw/*224.109*/("""
                                    """),format.raw/*225.151*/("""

                                    """),format.raw/*227.105*/("""
                                    """),format.raw/*228.78*/("""
                                    """),format.raw/*229.77*/("""
                                    """),format.raw/*230.164*/("""
                                    """),format.raw/*231.70*/("""



                                    """),format.raw/*235.99*/("""
                                    """),format.raw/*236.141*/("""

                                    """),format.raw/*238.95*/("""
                                    """),format.raw/*239.78*/("""
                                    """),format.raw/*240.77*/("""
                                    """),format.raw/*241.154*/("""
                                    """),format.raw/*242.70*/("""
                                    """),format.raw/*243.37*/("""<td>
                                    """),_display_(/*244.38*/if(entry.getTitle() != null && entry.getTitle().nonEmpty)/*244.95*/ {_display_(Seq[Any](format.raw/*244.97*/("""
                                        """),format.raw/*245.41*/("""<a href=""""),_display_(/*245.51*/routes/*245.57*/.RAJobController.rajobDetail(entry.getId())),format.raw/*245.100*/("""">"""),_display_(/*245.103*/entry/*245.108*/.getTitle()),format.raw/*245.119*/("""</a>
                                        <span class=""""),_display_(/*246.55*/entry/*246.60*/.getId()),format.raw/*246.68*/(""" """),format.raw/*246.69*/("""editable" data-name="title"></span>
                                        """),format.raw/*247.116*/("""
                                        """),format.raw/*248.122*/("""
                                        """),format.raw/*249.89*/("""
                                        """),format.raw/*250.102*/("""
                                        """),format.raw/*251.82*/("""
                                    """)))}/*252.39*/else/*252.44*/{_display_(Seq[Any](format.raw/*252.45*/("""
                                        """),format.raw/*253.41*/("""<span class=""""),_display_(/*253.55*/entry/*253.60*/.getId()),format.raw/*253.68*/(""" """),format.raw/*253.69*/("""editable" data-name="title">&ensp; -</span>
                                    """)))}),format.raw/*254.38*/("""
                                    """),format.raw/*255.37*/("""</td>

                                    <td>

                                    """),_display_(/*259.38*/if(entry.getShortDescription() != null && entry.getShortDescription().nonEmpty)/*259.117*/ {_display_(Seq[Any](format.raw/*259.119*/("""
                                        """),format.raw/*260.41*/("""<span class=""""),_display_(/*260.55*/entry/*260.60*/.getId()),format.raw/*260.68*/(""" """),format.raw/*260.69*/("""editable truncate-text" data-name="shortDescription" title=""""),_display_(/*260.130*/entry/*260.135*/.getShortDescription()),format.raw/*260.157*/("""" >
                                        """),_display_(/*261.42*/entry/*261.47*/.getShortDescription()),format.raw/*261.69*/("""
                                        """),format.raw/*262.41*/("""</span>
                                    """)))}/*263.39*/else/*263.44*/{_display_(Seq[Any](format.raw/*263.45*/("""
                                        """),format.raw/*264.41*/("""<span class=""""),_display_(/*264.55*/entry/*264.60*/.getId()),format.raw/*264.68*/(""" """),format.raw/*264.69*/("""editable truncate-text" data-name="shortDescription">&ensp; -</span>
                                    """)))}),format.raw/*265.38*/("""
                                    """),format.raw/*266.37*/("""</td>

                                    <td>
                                    """),_display_(/*269.38*/if(entry.getFields() != null && entry.getFields().nonEmpty)/*269.97*/ {_display_(Seq[Any](format.raw/*269.99*/("""
                                        """),format.raw/*270.41*/("""<span class=""""),_display_(/*270.55*/entry/*270.60*/.getId()),format.raw/*270.68*/(""" """),format.raw/*270.69*/("""editable truncate-text" data-name="fields" title=""""),_display_(/*270.120*/entry/*270.125*/.getFields()),format.raw/*270.137*/("""">
                                            """),format.raw/*271.121*/("""
                                            """),format.raw/*272.127*/("""
                                            """),format.raw/*273.93*/("""
                                            """),format.raw/*274.107*/("""
                                            """),format.raw/*275.86*/("""
                                            """),_display_(/*276.46*/entry/*276.51*/.getFields()),format.raw/*276.63*/("""
                                        """),format.raw/*277.41*/("""</span>
                                    """)))}/*278.39*/else/*278.44*/{_display_(Seq[Any](format.raw/*278.45*/("""
                                        """),format.raw/*279.41*/("""<span class=""""),_display_(/*279.55*/entry/*279.60*/.getId()),format.raw/*279.68*/(""" """),format.raw/*279.69*/("""editable truncate-text" data-name="fields">&ensp; -</span>
                                    """)))}),format.raw/*280.38*/("""
                                    """),format.raw/*281.37*/("""</td>


                                    """),_display_(/*284.38*/if(entry.getStatus() == "open")/*284.69*/ {_display_(Seq[Any](format.raw/*284.71*/("""
                                        """),format.raw/*285.41*/("""<td>
                                            <span class="new badge light-green darken-1" data-badge-caption="open"></span>
                                        </td>
                                    """)))}/*288.39*/else if(entry.getStatus() == "pending")/*288.78*/{_display_(Seq[Any](format.raw/*288.79*/("""
                                    """),format.raw/*289.37*/("""<td>
                                        <span class="new badge purple darken-1" data-badge-caption="pending"></span>
                                    </td>
                                    """),format.raw/*292.109*/("""
                                    """),format.raw/*293.77*/("""
                                    """),format.raw/*294.150*/("""
                                    """),format.raw/*295.78*/("""
                                    """)))}/*296.38*/else/*296.42*/{_display_(Seq[Any](format.raw/*296.43*/("""
                                    """),format.raw/*297.37*/("""<td>
                                        <span class="new badge blue darken-3" data-badge-caption="updated"></span>
                                    </td>
                                    """)))}),format.raw/*300.38*/("""
                                    """),_display_(/*301.38*/if(entry.getUpdateTime() != "")/*301.69*/ {_display_(Seq[Any](format.raw/*301.71*/("""
                                        """),format.raw/*302.41*/("""<td><span class=""""),_display_(/*302.59*/entry/*302.64*/.getId()),format.raw/*302.72*/(""" """),format.raw/*302.73*/("""editable" data-name='updateTime'></span>
                                            """),_display_(/*303.46*/entry/*303.51*/.getUpdateTime()),format.raw/*303.67*/("""
                                        """),format.raw/*304.41*/("""</td>
                                    """)))}/*305.39*/else/*305.44*/{_display_(Seq[Any](format.raw/*305.45*/("""
                                        """),format.raw/*306.41*/("""<td><span class=""""),_display_(/*306.59*/entry/*306.64*/.getId()),format.raw/*306.72*/(""" """),format.raw/*306.73*/("""editable" data-name='updateTime'>&ensp; -</span></td>
                                    """)))}),format.raw/*307.38*/("""
                                """),format.raw/*308.33*/("""</tr>
                            """)))}),format.raw/*309.30*/("""
                            """),format.raw/*310.29*/("""</tbody>
                        </table>
                    </div>
                </div>

                    <!-- Mobile Cards for RAJob List -->
                <div class="mobile-table-view">
                """),_display_(/*317.18*/for(entry <- rajobs.asScala) yield /*317.46*/ {_display_(Seq[Any](format.raw/*317.48*/("""
                    """),format.raw/*318.21*/("""<div class="card-panel z-depth-1" style="margin-bottom: 16px;">

                            <!-- RA Job Id -->
                        <div><h6>RA Job Id:</h6> """),_display_(/*321.51*/entry/*321.56*/.getId()),format.raw/*321.64*/("""</div>

                            <!-- Title -->
                        <div><h6>Title:</h6>
                            """),_display_(/*325.30*/if(entry.getTitle() != null && entry.getTitle().nonEmpty)/*325.87*/ {_display_(Seq[Any](format.raw/*325.89*/("""
                                """),format.raw/*326.33*/("""<a href=""""),_display_(/*326.43*/routes/*326.49*/.RAJobController.rajobDetail(entry.getId())),format.raw/*326.92*/("""">
                                """),_display_(/*327.34*/entry/*327.39*/.getTitle()),format.raw/*327.50*/("""
                                """),format.raw/*328.33*/("""</a>
                            """)))}/*329.31*/else/*329.36*/{_display_(Seq[Any](format.raw/*329.37*/("""
                                """),format.raw/*330.33*/("""<span>&ensp; -</span>
                            """)))}),format.raw/*331.30*/("""
                        """),format.raw/*332.25*/("""</div>

                            <!-- Short Description (Truncated if too long) -->
                        <div><h6>Short Description:</h6>
                            """),_display_(/*336.30*/{
                                val desc = Option(entry.getShortDescription).getOrElse("")
                                val words = desc.split("\\s+")
                                if (words.length > 30) words.take(30).mkString(" ") + "..." else desc
                            }),format.raw/*340.30*/("""
                        """),format.raw/*341.25*/("""</div>

                            <!-- Fields (Truncated if too long) -->
                        <div><h6>Fields:</h6>
                            """),_display_(/*345.30*/{
                                val fields = Option(entry.getFields).getOrElse("")
                                if (fields.length > 50) fields.take(50) + "..." else fields
                            }),format.raw/*348.30*/("""
                        """),format.raw/*349.25*/("""</div>

                            <!-- Status -->
                        <div><h6>Status:</h6> """),_display_(/*352.48*/entry/*352.53*/.getStatus()),format.raw/*352.65*/("""</div>

                            <!-- Update Time -->
                        <div><h6>Update Time:</h6>
                            """),_display_(/*356.30*/if(entry.getUpdateTime() != null && entry.getUpdateTime().nonEmpty)/*356.97*/ {_display_(Seq[Any](format.raw/*356.99*/("""
                                """),_display_(/*357.34*/entry/*357.39*/.getUpdateTime()),format.raw/*357.55*/("""
                            """)))}/*358.31*/else/*358.36*/{_display_(Seq[Any](format.raw/*358.37*/("""
                                """),format.raw/*359.33*/("""<span>&ensp; -</span>
                            """)))}),format.raw/*360.30*/("""
                        """),format.raw/*361.25*/("""</div>

                    </div>
                """)))}),format.raw/*364.18*/("""
                """),format.raw/*365.17*/("""</div>

                <div class="row">
                    <div class="col s12">
                        <ul class="pagination center-align">

                            """),_display_(/*371.30*/if(listType.equals("all"))/*371.56*/ {_display_(Seq[Any](format.raw/*371.58*/("""
                                """),_display_(/*372.34*/if(pageNum == 1)/*372.50*/ {_display_(Seq[Any](format.raw/*372.52*/("""
                                    """),format.raw/*373.37*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                        first_page</i></li>
                                    <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                        chevron_left</i></li>
                                """)))}/*377.35*/else/*377.40*/{_display_(Seq[Any](format.raw/*377.41*/("""
                                    """),format.raw/*378.37*/("""<li class="waves-effect"><a href=""""),_display_(/*378.72*/routes/*378.78*/.RAJobController.rajobList(1, sort)),format.raw/*378.113*/(""""><i class="material-icons">
                                        first_page</i></a></li>
                                    <li class="waves-effect"><a href=""""),_display_(/*380.72*/routes/*380.78*/.RAJobController.rajobList(pageNum - 1, sort)),format.raw/*380.123*/(""""><i class="material-icons">
                                        chevron_left</i></a></li>
                                """)))}),format.raw/*382.34*/("""
                                """),_display_(/*383.34*/if(beginIndexForPagination > 1)/*383.65*/ {_display_(Seq[Any](format.raw/*383.67*/("""
                                    """),format.raw/*384.37*/("""<li class="waves-effect modal-trigger" href="#allPageModal" style="cursor: pointer;
                                        font-size: 20px;
                                        font-weight: bold">...</li>
                                """)))}),format.raw/*387.34*/("""
                                """),_display_(/*388.34*/for(i <- (beginIndexForPagination + 0) to (endIndexForPagination + 0)) yield /*388.104*/ {_display_(Seq[Any](format.raw/*388.106*/("""
                                    """),format.raw/*389.37*/("""<li """),_display_(/*389.42*/if(pageNum == i)/*389.58*/ {_display_(Seq[Any](format.raw/*389.60*/("""
                                        """),format.raw/*390.41*/("""class="active"""")))}),format.raw/*390.56*/("""><a href=""""),_display_(/*390.67*/routes/*390.73*/.RAJobController.rajobList(i, sort)),format.raw/*390.108*/("""">"""),_display_(/*390.111*/i),format.raw/*390.112*/("""</a></li>
                                """)))}),format.raw/*391.34*/("""
                                """),_display_(/*392.34*/if(endIndexForPagination < ((total - 1) / pageLimit + 1))/*392.91*/ {_display_(Seq[Any](format.raw/*392.93*/("""
                                    """),format.raw/*393.37*/("""<li class="waves-effect modal-trigger" href="#allPageModal" style="cursor: pointer;
                                        font-size: 20px;
                                        font-weight: bold">...</li>
                                """)))}),format.raw/*396.34*/("""
                                """),_display_(/*397.34*/if((offset + count) >= total)/*397.63*/ {_display_(Seq[Any](format.raw/*397.65*/("""
                                    """),format.raw/*398.37*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                        chevron_right</i></li>
                                    <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                        last_page</i></li>
                                """)))}/*402.35*/else/*402.40*/{_display_(Seq[Any](format.raw/*402.41*/("""
                                    """),format.raw/*403.37*/("""<li class="waves-effect"><a href=""""),_display_(/*403.72*/routes/*403.78*/.RAJobController.rajobList(pageNum + 1, sort)),format.raw/*403.123*/(""""><i class="material-icons">
                                        chevron_right</i></a></li>
                                    <li class="waves-effect"><a href=""""),_display_(/*405.72*/routes/*405.78*/.RAJobController.rajobList((total - 1) / pageLimit + 1, sort)),format.raw/*405.139*/(""""><i class="material-icons">
                                        last_page</i></a></li>
                                """)))}),format.raw/*407.34*/("""
                            """)))}/*408.30*/else if(listType.equals("my enroll"))/*408.67*/{_display_(Seq[Any](format.raw/*408.68*/("""
                            """),_display_(/*409.30*/if(pageNum == 1)/*409.46*/ {_display_(Seq[Any](format.raw/*409.48*/("""
                                """),format.raw/*410.33*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    first_page</i></li>
                                <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    chevron_left</i></li>
                            """)))}),format.raw/*414.30*/("""
                            """),_display_(/*415.30*/if(beginIndexForPagination > 1)/*415.61*/ {_display_(Seq[Any](format.raw/*415.63*/("""
                                """),format.raw/*416.33*/("""<li class="waves-effect modal-trigger" href="#enrollPageModal" style="cursor: pointer;
                                    font-size: 20px;
                                    font-weight: bold">...</li>
                            """)))}),format.raw/*419.30*/("""

                            """),_display_(/*421.30*/if(endIndexForPagination < ((total - 1) / pageLimit + 1))/*421.87*/ {_display_(Seq[Any](format.raw/*421.89*/("""
                                """),format.raw/*422.33*/("""<li class="waves-effect modal-trigger" href="#enrollPageModal" style="cursor: pointer;
                                    font-size: 20px;
                                    font-weight: bold">...</li>
                            """)))}),format.raw/*425.30*/("""

                            """)))}/*427.30*/else/*427.34*/{_display_(Seq[Any](format.raw/*427.35*/("""
                            """),_display_(/*428.30*/if(pageNum == 1)/*428.46*/ {_display_(Seq[Any](format.raw/*428.48*/("""
                                """),format.raw/*429.33*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    first_page</i></li>
                                <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    chevron_left</i></li>
                            """)))}/*433.31*/else/*433.36*/{_display_(Seq[Any](format.raw/*433.37*/("""
                                """),format.raw/*434.33*/("""<li class="waves-effect">
                                    <a href="#!" onclick="jumpToPage(1, '"""),_display_(/*435.75*/sort),format.raw/*435.79*/("""', '"""),_display_(/*435.84*/searchBody),format.raw/*435.94*/("""')">
                                        <i class="material-icons">first_page</i>
                                    </a>
                                </li>
                                <li class="waves-effect">
                                    <a href="#!" onclick="jumpToPage("""),_display_(/*440.71*/pageNum),format.raw/*440.78*/("""-1, '"""),_display_(/*440.84*/sort),format.raw/*440.88*/("""', '"""),_display_(/*440.93*/searchBody),format.raw/*440.103*/("""')">
                                        <i class="material-icons">chevron_left</i>
                                    </a>
                                </li>
                            """)))}),format.raw/*444.30*/("""
                            """),_display_(/*445.30*/if(beginIndexForPagination > 1)/*445.61*/ {_display_(Seq[Any](format.raw/*445.63*/("""
                                """),format.raw/*446.33*/("""<li class="waves-effect modal-trigger" href="#searchPageModal" style="cursor: pointer;
                                    font-size: 20px;
                                    font-weight: bold">...</li>
                            """)))}),format.raw/*449.30*/("""
                            """),_display_(/*450.30*/for(i <- (beginIndexForPagination + 0) to (endIndexForPagination + 0)) yield /*450.100*/ {_display_(Seq[Any](format.raw/*450.102*/("""
                                """),format.raw/*451.33*/("""<li """),_display_(/*451.38*/if(pageNum == i)/*451.54*/ {_display_(Seq[Any](format.raw/*451.56*/("""
                                    """),format.raw/*452.37*/("""class="active"""")))}),format.raw/*452.52*/(""">
                                    <a href="#!" onclick="jumpToPage("""),_display_(/*453.71*/i),format.raw/*453.72*/(""", '"""),_display_(/*453.76*/sort),format.raw/*453.80*/("""', '"""),_display_(/*453.85*/searchBody),format.raw/*453.95*/("""')">
                                    """),_display_(/*454.38*/i),format.raw/*454.39*/("""
                                    """),format.raw/*455.37*/("""</a>
                                </li>
                            """)))}),format.raw/*457.30*/("""
                            """),_display_(/*458.30*/if(endIndexForPagination < ((total - 1) / pageLimit + 1))/*458.87*/ {_display_(Seq[Any](format.raw/*458.89*/("""
                                """),format.raw/*459.33*/("""<li class="waves-effect modal-trigger" href="#searchPageModal" style="cursor: pointer;
                                    font-size: 20px;
                                    font-weight: bold">...</li>
                            """)))}),format.raw/*462.30*/("""
                            """),_display_(/*463.30*/if((offset + count) >= total)/*463.59*/ {_display_(Seq[Any](format.raw/*463.61*/("""
                                """),format.raw/*464.33*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    chevron_right</i></li>
                                <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    last_page</i></li>
                            """)))}/*468.31*/else/*468.36*/{_display_(Seq[Any](format.raw/*468.37*/("""
                                """),format.raw/*469.33*/("""<li class="waves-effect">
                                    <a href="#!" onclick="jumpToPage("""),_display_(/*470.71*/pageNum),format.raw/*470.78*/("""+1, '"""),_display_(/*470.84*/sort),format.raw/*470.88*/("""', '"""),_display_(/*470.93*/searchBody),format.raw/*470.103*/("""')">
                                        <i class="material-icons">chevron_right</i>
                                    </a>
                                </li>
                                <li class="waves-effect">
                                    <a href="#!" onclick="jumpToPage(("""),_display_(/*475.72*/total),format.raw/*475.77*/("""-1)/("""),_display_(/*475.83*/pageLimit),format.raw/*475.92*/(""")+1, '"""),_display_(/*475.99*/sort),format.raw/*475.103*/("""', '"""),_display_(/*475.108*/searchBody),format.raw/*475.118*/("""')">
                                        <i class="material-icons">last_page</i>
                                    </a>
                                </li>
                            """)))}),format.raw/*479.30*/("""
                            """)))}),format.raw/*480.30*/("""
                        """),format.raw/*481.25*/("""</ul>
                    </div>
                </div>
            """)))}/*484.15*/else/*484.20*/{_display_(Seq[Any](format.raw/*484.21*/("""
                """),format.raw/*485.17*/("""<h5>No RA jobs registered yet.</h5>
            """)))}),format.raw/*486.14*/("""
            """),format.raw/*487.13*/("""<div id="allPageModal" class="modal">
                <div class="modal-content">
                    <h6>Select the page number you want to jump to</h6>
                    <div class="card z-depth-0">

                    """),_display_(/*492.22*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*492.79*/ {_display_(Seq[Any](format.raw/*492.81*/("""
                        """),format.raw/*493.25*/("""<ul class="pagination center-align">
                        """),_display_(/*494.26*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*494.65*/ {_display_(Seq[Any](format.raw/*494.67*/("""
                            """),_display_(/*495.30*/if(j <= ((total - 1)/(pageLimit) + 1))/*495.68*/ {_display_(Seq[Any](format.raw/*495.70*/("""
                                """),_display_(/*496.34*/if(j != pageNum)/*496.50*/ {_display_(Seq[Any](format.raw/*496.52*/("""
                                    """),format.raw/*497.37*/("""<li class="waves-effect grey lighten-3"><a href='"""),_display_(/*497.87*/routes/*497.93*/.RAJobController.rajobList(j, sort)),format.raw/*497.128*/("""'>"""),_display_(/*497.131*/j),format.raw/*497.132*/("""</a></li>
                                """)))}/*498.34*/else/*498.38*/{_display_(Seq[Any](format.raw/*498.39*/("""
                                    """),format.raw/*499.37*/("""<li class="waves-effect active"><a href=""""),_display_(/*499.79*/routes/*499.85*/.RAJobController.rajobList(j, sort)),format.raw/*499.120*/("""">"""),_display_(/*499.123*/j),format.raw/*499.124*/("""</a></li>
                                """)))}),format.raw/*500.34*/("""
                            """)))}),format.raw/*501.30*/("""
                        """)))}),format.raw/*502.26*/("""
                        """),format.raw/*503.25*/("""</ul>
                    """)))}),format.raw/*504.22*/("""
                    """),format.raw/*505.21*/("""</div>
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

                    """),_display_(/*518.22*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*518.79*/ {_display_(Seq[Any](format.raw/*518.81*/("""
                        """),format.raw/*519.25*/("""<ul class="pagination center-align">
                        """),_display_(/*520.26*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*520.65*/ {_display_(Seq[Any](format.raw/*520.67*/("""
                            """),_display_(/*521.30*/if(j <= ((total - 1)/(pageLimit) + 1))/*521.68*/ {_display_(Seq[Any](format.raw/*521.70*/("""
                                """),_display_(/*522.34*/if(j != pageNum)/*522.50*/ {_display_(Seq[Any](format.raw/*522.52*/("""
                                    """),format.raw/*523.37*/("""<li class="waves-effect grey lighten-3"><a href='"""),_display_(/*523.87*/routes/*523.93*/.ProjectController.getMyEnrolledProjects(j, sort)),format.raw/*523.142*/("""'>"""),_display_(/*523.145*/j),format.raw/*523.146*/("""</a></li>
                                """)))}/*524.34*/else/*524.38*/{_display_(Seq[Any](format.raw/*524.39*/("""
                                    """),format.raw/*525.37*/("""<li class="waves-effect active"><a href=""""),_display_(/*525.79*/routes/*525.85*/.ProjectController.getMyEnrolledProjects(j, sort)),format.raw/*525.134*/("""">"""),_display_(/*525.137*/j),format.raw/*525.138*/("""</a></li>
                                """)))}),format.raw/*526.34*/("""
                            """)))}),format.raw/*527.30*/("""
                        """)))}),format.raw/*528.26*/("""
                        """),format.raw/*529.25*/("""</ul>
                    """)))}),format.raw/*530.22*/("""
                    """),format.raw/*531.21*/("""</div>
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

                    """),_display_(/*544.22*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*544.79*/ {_display_(Seq[Any](format.raw/*544.81*/("""
                        """),format.raw/*545.25*/("""<ul class="pagination center-align">
                        """),_display_(/*546.26*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*546.65*/ {_display_(Seq[Any](format.raw/*546.67*/("""
                            """),_display_(/*547.30*/if(j <= ((total - 1)/(pageLimit) + 1))/*547.68*/ {_display_(Seq[Any](format.raw/*547.70*/("""
                                """),_display_(/*548.34*/if(j != pageNum)/*548.50*/ {_display_(Seq[Any](format.raw/*548.52*/("""
                                    """),format.raw/*549.37*/("""<li class="waves-effect grey lighten-3"><a href='#!' onclick="jumpToPage("""),_display_(/*549.111*/j),format.raw/*549.112*/(""", 'id', '"""),_display_(/*549.122*/searchBody),format.raw/*549.132*/("""')">"""),_display_(/*549.137*/j),format.raw/*549.138*/("""</a></li>
                                """)))}/*550.34*/else/*550.38*/{_display_(Seq[Any](format.raw/*550.39*/("""
                                    """),format.raw/*551.37*/("""<li class="waves-effect active"><a href="#!" onclick="jumpToPage("""),_display_(/*551.103*/j),format.raw/*551.104*/(""", 'id', '"""),_display_(/*551.114*/searchBody),format.raw/*551.124*/("""')">"""),_display_(/*551.129*/j),format.raw/*551.130*/("""</a></li>
                                """)))}),format.raw/*552.34*/("""
                            """)))}),format.raw/*553.30*/("""
                        """)))}),format.raw/*554.26*/("""
                        """),format.raw/*555.25*/("""</ul>
                    """)))}),format.raw/*556.22*/("""
                    """),format.raw/*557.21*/("""</div>
                </div>
                <div class="modal-footer">
                    <a href="#!" class="modal-close waves-effect waves-green btn-flat">
                        Cancel</a>
                </div>
            </div>

        </div>
    </div>
""")))}),format.raw/*567.2*/("""
"""))
      }
    }
  }

  def render(rajobs:List[RAJob],pageNum:Integer,sort:String,offset:Integer,total:Integer,count:Integer,listType:String,pageLimit:Integer,searchBody:String,id:Long,beginIndexForPagination:Integer,endIndexForPagination:Integer): play.twirl.api.HtmlFormat.Appendable = apply(rajobs,pageNum,sort,offset,total,count,listType,pageLimit,searchBody,id,beginIndexForPagination,endIndexForPagination)

  def f:((List[RAJob],Integer,String,Integer,Integer,Integer,String,Integer,String,Long,Integer,Integer) => play.twirl.api.HtmlFormat.Appendable) = (rajobs,pageNum,sort,offset,total,count,listType,pageLimit,searchBody,id,beginIndexForPagination,endIndexForPagination) => apply(rajobs,pageNum,sort,offset,total,count,listType,pageLimit,searchBody,id,beginIndexForPagination,endIndexForPagination)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:35 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/rajobList.scala.html
                  HASH: 4f9a85483dfd25bb98147b52ba5579a88e469b78
                  MATRIX: 1203->1|1585->311|1610->329|1634->346|1667->368|1682->375|1763->379|1795->384|1852->414|1867->420|1926->458|2121->625|2150->626|2195->643|2266->687|2311->716|2351->718|2396->735|2435->746|2464->747|2493->748|2550->778|2565->784|2601->799|2722->893|2737->899|2774->915|2976->1086|3021->1103|3313->1367|3342->1368|3435->1433|3464->1434|3510->1452|4212->2126|4241->2127|4283->2141|4336->2166|4365->2167|4411->2185|4640->2386|4669->2387|4718->2408|4848->2510|4877->2511|4906->2512|5339->2917|5368->2918|5421->2943|5574->3068|5603->3069|5652->3090|5786->3196|5815->3197|5861->3215|5913->3239|5942->3240|5975->3246|6049->3292|6078->3293|6123->3310|6268->3427|6297->3428|6339->3442|6382->3457|6411->3458|6456->3475|6865->3855|6895->3856|6928->3861|6978->309|7006->366|7035->3871|7065->3874|7103->3902|7144->3904|7177->3909|7282->3986|7321->4015|7362->4017|7408->4034|7866->4472|7907->4504|7948->4506|7990->4519|8458->4955|8501->4970|8532->4991|8573->4993|8619->5010|9158->5521|9246->5587|9276->5588|9308->5592|9400->5662|9430->5663|9462->5667|9489->5672|10137->6292|10168->6313|10209->6315|10271->6348|10327->6384|10369->6416|10409->6417|10463->6442|10518->6477|10532->6482|10572->6483|10626->6508|10696->6546|10935->6757|10971->6783|11012->6785|11070->6814|11112->6828|11128->6834|11185->6869|11373->7029|11389->7035|11449->7073|11649->7245|11665->7251|11726->7290|11902->7446|11916->7451|11956->7452|12014->7481|12113->7552|12145->7562|12429->7818|12461->7828|12759->8098|12791->8108|13016->8301|13070->8326|14137->9365|14231->9441|14273->9443|14335->9476|14409->9522|14424->9527|14454->9535|14526->9639|14593->9779|14659->9873|14725->9951|14791->10028|14858->10181|14924->10251|14992->10361|15059->10512|15127->10618|15193->10696|15259->10773|15326->10937|15392->11007|15461->11109|15528->11250|15595->11346|15661->11424|15727->11501|15794->11655|15860->11725|15926->11762|15996->11804|16063->11861|16104->11863|16174->11904|16212->11914|16228->11920|16294->11963|16326->11966|16342->11971|16376->11982|16463->12041|16478->12046|16508->12054|16538->12055|16644->12206|16715->12328|16785->12417|16856->12519|16926->12601|16984->12640|16998->12645|17038->12646|17108->12687|17150->12701|17165->12706|17195->12714|17225->12715|17338->12796|17404->12833|17518->12919|17608->12998|17650->13000|17720->13041|17762->13055|17777->13060|17807->13068|17837->13069|17927->13130|17943->13135|17988->13157|18061->13202|18076->13207|18120->13229|18190->13270|18255->13316|18269->13321|18309->13322|18379->13363|18421->13377|18436->13382|18466->13390|18496->13391|18634->13497|18700->13534|18813->13619|18882->13678|18923->13680|18993->13721|19035->13735|19050->13740|19080->13748|19110->13749|19190->13800|19206->13805|19241->13817|19318->13940|19393->14067|19467->14160|19542->14267|19616->14353|19690->14399|19705->14404|19739->14416|19809->14457|19874->14503|19888->14508|19928->14509|19998->14550|20040->14564|20055->14569|20085->14577|20115->14578|20243->14674|20309->14711|20382->14756|20423->14787|20464->14789|20534->14830|20765->15042|20814->15081|20854->15082|20920->15119|21150->15391|21216->15468|21283->15618|21349->15696|21407->15734|21421->15738|21461->15739|21527->15776|21758->15975|21824->16013|21865->16044|21906->16046|21976->16087|22022->16105|22037->16110|22067->16118|22097->16119|22211->16205|22226->16210|22264->16226|22334->16267|22397->16311|22411->16316|22451->16317|22521->16358|22567->16376|22582->16381|22612->16389|22642->16390|22765->16481|22827->16514|22894->16549|22952->16578|23195->16793|23240->16821|23281->16823|23331->16844|23521->17006|23536->17011|23566->17019|23719->17144|23786->17201|23827->17203|23889->17236|23927->17246|23943->17252|24008->17295|24072->17331|24087->17336|24120->17347|24182->17380|24236->17415|24250->17420|24290->17421|24352->17454|24435->17505|24489->17530|24690->17703|24999->17990|25053->18015|25232->18166|25460->18372|25514->18397|25641->18496|25656->18501|25690->18513|25855->18650|25932->18717|25973->18719|26035->18753|26050->18758|26088->18774|26138->18805|26152->18810|26192->18811|26254->18844|26337->18895|26391->18920|26475->18972|26521->18989|26724->19164|26760->19190|26801->19192|26863->19226|26889->19242|26930->19244|26996->19281|27377->19643|27391->19648|27431->19649|27497->19686|27560->19721|27576->19727|27634->19762|27826->19926|27842->19932|27910->19977|28070->20105|28132->20139|28173->20170|28214->20172|28280->20209|28554->20451|28616->20485|28704->20555|28746->20557|28812->20594|28845->20599|28871->20615|28912->20617|28982->20658|29029->20673|29068->20684|29084->20690|29142->20725|29174->20728|29198->20729|29273->20772|29335->20806|29402->20863|29443->20865|29509->20902|29783->21144|29845->21178|29884->21207|29925->21209|29991->21246|30372->21608|30386->21613|30426->21614|30492->21651|30555->21686|30571->21692|30639->21737|30834->21904|30850->21910|30934->21971|31091->22096|31141->22126|31188->22163|31228->22164|31286->22194|31312->22210|31353->22212|31415->22245|31792->22590|31850->22620|31891->22651|31932->22653|31994->22686|32259->22919|32318->22950|32385->23007|32426->23009|32488->23042|32753->23275|32804->23306|32818->23310|32858->23311|32916->23341|32942->23357|32983->23359|33045->23392|33410->23738|33424->23743|33464->23744|33526->23777|33654->23877|33680->23881|33713->23886|33745->23896|34066->24189|34095->24196|34129->24202|34155->24206|34188->24211|34221->24221|34449->24417|34507->24447|34548->24478|34589->24480|34651->24513|34916->24746|34974->24776|35062->24846|35104->24848|35166->24881|35199->24886|35225->24902|35266->24904|35332->24941|35379->24956|35479->25028|35502->25029|35534->25033|35560->25037|35593->25042|35625->25052|35695->25094|35718->25095|35784->25132|35888->25204|35946->25234|36013->25291|36054->25293|36116->25326|36381->25559|36439->25589|36478->25618|36519->25620|36581->25653|36946->25999|36960->26004|37000->26005|37062->26038|37186->26134|37215->26141|37249->26147|37275->26151|37308->26156|37341->26166|37666->26463|37693->26468|37727->26474|37758->26483|37793->26490|37820->26494|37854->26499|37887->26509|38112->26702|38174->26732|38228->26757|38317->26827|38331->26832|38371->26833|38417->26850|38498->26899|38540->26912|38793->27137|38867->27194|38908->27196|38962->27221|39052->27283|39108->27322|39149->27324|39207->27354|39255->27392|39296->27394|39358->27428|39384->27444|39425->27446|39491->27483|39569->27533|39585->27539|39643->27574|39675->27577|39699->27578|39762->27621|39776->27625|39816->27626|39882->27663|39952->27705|39968->27711|40026->27746|40058->27749|40082->27750|40157->27793|40219->27823|40277->27849|40331->27874|40390->27901|40440->27922|40947->28401|41021->28458|41062->28460|41116->28485|41206->28547|41262->28586|41303->28588|41361->28618|41409->28656|41450->28658|41512->28692|41538->28708|41579->28710|41645->28747|41723->28797|41739->28803|41811->28852|41843->28855|41867->28856|41930->28899|41944->28903|41984->28904|42050->28941|42120->28983|42136->28989|42208->29038|42240->29041|42264->29042|42339->29085|42401->29115|42459->29141|42513->29166|42572->29193|42622->29214|43129->29693|43203->29750|43244->29752|43298->29777|43388->29839|43444->29878|43485->29880|43543->29910|43591->29948|43632->29950|43694->29984|43720->30000|43761->30002|43827->30039|43930->30113|43954->30114|43993->30124|44026->30134|44060->30139|44084->30140|44147->30183|44161->30187|44201->30188|44267->30225|44362->30291|44386->30292|44425->30302|44458->30312|44492->30317|44516->30318|44591->30361|44653->30391|44711->30417|44765->30442|44824->30469|44874->30490|45171->30756
                  LINES: 35->1|47->11|48->12|49->13|51->15|51->15|53->15|54->16|54->16|54->16|54->16|58->20|58->20|59->21|60->22|60->22|60->22|61->23|61->23|61->23|61->23|62->24|62->24|62->24|65->27|65->27|65->27|68->30|69->31|77->39|77->39|79->41|79->41|81->43|98->60|98->60|100->62|100->62|100->62|102->64|105->67|105->67|106->68|107->69|107->69|107->69|115->77|115->77|116->78|118->80|118->80|119->81|121->83|121->83|123->85|124->86|124->86|126->88|128->90|128->90|129->91|132->94|132->94|134->96|134->96|134->96|135->97|144->106|144->106|145->107|147->10|148->14|149->108|151->110|151->110|151->110|152->111|154->113|154->113|154->113|155->114|163->122|163->122|163->122|164->123|172->131|174->133|174->133|174->133|175->134|187->146|189->148|189->148|189->148|191->150|191->150|191->150|191->150|201->160|201->160|201->160|202->161|203->162|203->162|203->162|204->163|205->164|205->164|205->164|206->165|207->166|211->170|211->170|211->170|212->171|212->171|212->171|212->171|214->173|214->173|214->173|216->175|216->175|216->175|218->177|218->177|218->177|219->178|220->179|220->179|225->184|225->184|230->189|230->189|234->193|235->194|253->212|253->212|253->212|254->213|255->214|255->214|255->214|257->216|258->217|259->218|260->219|261->220|262->221|263->222|265->224|266->225|268->227|269->228|270->229|271->230|272->231|276->235|277->236|279->238|280->239|281->240|282->241|283->242|284->243|285->244|285->244|285->244|286->245|286->245|286->245|286->245|286->245|286->245|286->245|287->246|287->246|287->246|287->246|288->247|289->248|290->249|291->250|292->251|293->252|293->252|293->252|294->253|294->253|294->253|294->253|294->253|295->254|296->255|300->259|300->259|300->259|301->260|301->260|301->260|301->260|301->260|301->260|301->260|301->260|302->261|302->261|302->261|303->262|304->263|304->263|304->263|305->264|305->264|305->264|305->264|305->264|306->265|307->266|310->269|310->269|310->269|311->270|311->270|311->270|311->270|311->270|311->270|311->270|311->270|312->271|313->272|314->273|315->274|316->275|317->276|317->276|317->276|318->277|319->278|319->278|319->278|320->279|320->279|320->279|320->279|320->279|321->280|322->281|325->284|325->284|325->284|326->285|329->288|329->288|329->288|330->289|333->292|334->293|335->294|336->295|337->296|337->296|337->296|338->297|341->300|342->301|342->301|342->301|343->302|343->302|343->302|343->302|343->302|344->303|344->303|344->303|345->304|346->305|346->305|346->305|347->306|347->306|347->306|347->306|347->306|348->307|349->308|350->309|351->310|358->317|358->317|358->317|359->318|362->321|362->321|362->321|366->325|366->325|366->325|367->326|367->326|367->326|367->326|368->327|368->327|368->327|369->328|370->329|370->329|370->329|371->330|372->331|373->332|377->336|381->340|382->341|386->345|389->348|390->349|393->352|393->352|393->352|397->356|397->356|397->356|398->357|398->357|398->357|399->358|399->358|399->358|400->359|401->360|402->361|405->364|406->365|412->371|412->371|412->371|413->372|413->372|413->372|414->373|418->377|418->377|418->377|419->378|419->378|419->378|419->378|421->380|421->380|421->380|423->382|424->383|424->383|424->383|425->384|428->387|429->388|429->388|429->388|430->389|430->389|430->389|430->389|431->390|431->390|431->390|431->390|431->390|431->390|431->390|432->391|433->392|433->392|433->392|434->393|437->396|438->397|438->397|438->397|439->398|443->402|443->402|443->402|444->403|444->403|444->403|444->403|446->405|446->405|446->405|448->407|449->408|449->408|449->408|450->409|450->409|450->409|451->410|455->414|456->415|456->415|456->415|457->416|460->419|462->421|462->421|462->421|463->422|466->425|468->427|468->427|468->427|469->428|469->428|469->428|470->429|474->433|474->433|474->433|475->434|476->435|476->435|476->435|476->435|481->440|481->440|481->440|481->440|481->440|481->440|485->444|486->445|486->445|486->445|487->446|490->449|491->450|491->450|491->450|492->451|492->451|492->451|492->451|493->452|493->452|494->453|494->453|494->453|494->453|494->453|494->453|495->454|495->454|496->455|498->457|499->458|499->458|499->458|500->459|503->462|504->463|504->463|504->463|505->464|509->468|509->468|509->468|510->469|511->470|511->470|511->470|511->470|511->470|511->470|516->475|516->475|516->475|516->475|516->475|516->475|516->475|516->475|520->479|521->480|522->481|525->484|525->484|525->484|526->485|527->486|528->487|533->492|533->492|533->492|534->493|535->494|535->494|535->494|536->495|536->495|536->495|537->496|537->496|537->496|538->497|538->497|538->497|538->497|538->497|538->497|539->498|539->498|539->498|540->499|540->499|540->499|540->499|540->499|540->499|541->500|542->501|543->502|544->503|545->504|546->505|559->518|559->518|559->518|560->519|561->520|561->520|561->520|562->521|562->521|562->521|563->522|563->522|563->522|564->523|564->523|564->523|564->523|564->523|564->523|565->524|565->524|565->524|566->525|566->525|566->525|566->525|566->525|566->525|567->526|568->527|569->528|570->529|571->530|572->531|585->544|585->544|585->544|586->545|587->546|587->546|587->546|588->547|588->547|588->547|589->548|589->548|589->548|590->549|590->549|590->549|590->549|590->549|590->549|590->549|591->550|591->550|591->550|592->551|592->551|592->551|592->551|592->551|592->551|592->551|593->552|594->553|595->554|596->555|597->556|598->557|608->567
                  -- GENERATED --
              */
          