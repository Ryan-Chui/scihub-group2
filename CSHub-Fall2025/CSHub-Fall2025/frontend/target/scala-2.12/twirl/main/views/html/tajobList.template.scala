
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

object tajobList extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template12[List[TAJob],Integer,String,Integer,Integer,Integer,String,Integer,String,Long,Integer,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(tajobs: List[TAJob],
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
/*13.2*/import models.TAJob

def /*15.2*/scripts/*15.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*15.13*/("""
    """),format.raw/*16.5*/("""<script type = "module" src='"""),_display_(/*16.35*/routes/*16.41*/.Assets.at("javascripts/voiceJump.js")),format.raw/*16.79*/("""'></script>
    <script type="text/javascript">

            $(document).ready(function () """),format.raw/*19.43*/("""{"""),format.raw/*19.44*/("""
                """),format.raw/*20.17*/("""var technologiesArtay = []
                """),_display_(/*21.18*/for(i <- 0 until tajobs.size) yield /*21.47*/ {_display_(Seq[Any](format.raw/*21.49*/("""
                """),format.raw/*22.17*/("""var json = """),format.raw/*22.28*/("""{"""),format.raw/*22.29*/("""}"""),format.raw/*22.30*/(""";
                json.id = '"""),_display_(/*23.29*/tajobs/*23.35*/.get(i).getId()),format.raw/*23.50*/("""';
                json.url = "/tajob/tajobDetail/" + json.id;

                json.name = '"""),_display_(/*26.31*/tajobs/*26.37*/.get(i).getTitle),format.raw/*26.53*/("""'.replace(/[^a-zA-Z0-9]/g, " ").replace(/  +/g, " ").trim();
                console.log("jsonhere:" + json)
                technologiesArtay.push(json)
                """)))}),format.raw/*29.18*/("""
                """),format.raw/*30.17*/("""$("#nasaText").text(JSON.stringify(technologiesArtay));

                $('.tooltipped').tooltip();

                // $("#speak-from-filter").click();
                // $("#speak-nasa").click();
                // $("#speak-from-filter").click();

            """),format.raw/*38.13*/("""}"""),format.raw/*38.14*/(""");

            function jumpToPage(pageNum, sort, searchString) """),format.raw/*40.62*/("""{"""),format.raw/*40.63*/("""

                """),format.raw/*42.17*/("""pageNum =  parseInt(pageNum);

                var url = "/tajob/searchPOST?pageNum=" + (pageNum) + "&sortCriteria=" + sort;
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
            """),format.raw/*59.13*/("""}"""),format.raw/*59.14*/("""

            """),format.raw/*61.13*/("""function string2Map(str) """),format.raw/*61.38*/("""{"""),format.raw/*61.39*/("""

                """),format.raw/*63.17*/("""var map = new Map();
                var splitedString = str.replace(new RegExp("],", 'g'), ";");
                var artay = splitedString.split(";");
                for(var i=0; i<artay.length; i++)"""),format.raw/*66.50*/("""{"""),format.raw/*66.51*/("""
                    """),format.raw/*67.21*/("""var idAndEventsString = artay[i];
                    idAndEventsString = idAndEventsString.replace(/["""),format.raw/*68.69*/("""{"""),format.raw/*68.70*/("""}"""),format.raw/*68.71*/("""[\]\\]/g, " ");
                    var idAndEvents = idAndEventsString.split("=");
                    var id = idAndEvents[0];
                    var eventsString = idAndEvents[1];
                    var events = eventsString.split(",");
                    console.log("events:" + events + "," + i);

                    var formatedEvents = "";
                    for(var j=0; j<events.length; j++)"""),format.raw/*76.55*/("""{"""),format.raw/*76.56*/("""
                        """),format.raw/*77.25*/("""events[j] = events[j].trim();
                        formatedEvents = formatedEvents + events[j] + ";";
                    """),format.raw/*79.21*/("""}"""),format.raw/*79.22*/("""
                    """),format.raw/*80.21*/("""if(formatedEvents.length > 1)
                        map.set(id.trim(), formatedEvents);
                """),format.raw/*82.17*/("""}"""),format.raw/*82.18*/("""

                """),format.raw/*84.17*/("""return map;
            """),format.raw/*85.13*/("""}"""),format.raw/*85.14*/("""

    """),format.raw/*87.5*/("""</script>
    <style>
            .follow-fab """),format.raw/*89.25*/("""{"""),format.raw/*89.26*/("""
                """),format.raw/*90.17*/("""top: -20px !important;
                bottom: auto !important;
                right: -20px !important;
            """),format.raw/*93.13*/("""}"""),format.raw/*93.14*/("""
    """),format.raw/*94.5*/("""</style>
""")))};
Seq[Any](format.raw/*10.84*/("""
"""),format.raw/*14.1*/("""
"""),format.raw/*95.2*/("""

"""),_display_(/*97.2*/main("All TA Jobs", scripts)/*97.30*/ {_display_(Seq[Any](format.raw/*97.32*/("""
    """),format.raw/*98.5*/("""<div class="container">
        <div class="card-panel center">
            """),_display_(/*100.14*/if(listType.equals("search"))/*100.43*/ {_display_(Seq[Any](format.raw/*100.45*/("""
                """),format.raw/*101.17*/("""<div class="row card-panel z-depth-0 project-zone-panel">
                    <div class="col s12" style="margin-top: -10px;
                        margin-bottom: -10px;">
                        <h6 class="center tooltipped" data-position="bottom" data-tooltip="This list shows the search results." >
                            Search Result
                        </h6>
                    </div>
                </div>
            """)))}/*109.14*/else if(listType.equals("all"))/*109.46*/ {_display_(Seq[Any](format.raw/*109.48*/("""
            """),format.raw/*110.13*/("""<div class="row card-panel z-depth-0 project-zone-panel">
                <div class="col s12" style="margin-top: -10px;
                    margin-bottom: -10px;">
                    <h6 class="center tooltipped" data-position="bottom" data-tooltip="This list shows all the TA jobs." >
                        List of TA Jobs Posted at SMU-Sci-Hub
                    </h6>
                </div>
            </div>
            """)))}),format.raw/*118.14*/("""

            """),_display_(/*120.14*/if(tajobs.size() > 0)/*120.35*/ {_display_(Seq[Any](format.raw/*120.37*/("""
                """),format.raw/*121.17*/("""<div class="col s8 offset-s2">
                    <h4>TA Job List</h4>

                </div>
                <div class="col s2">
                    <button id = "speak-from-filter" hidden></button>
                    <div id="nasaText" hidden></div>
                    <div id="requestField"></div>
                    <div id="replyField"></div>
                </div>
                <div class="row">
                    <div class="col s6">
                        <h6 class="left">Showing results: """),_display_(/*133.60*/{
                            offset + 1
                        }),format.raw/*135.26*/(""" """),format.raw/*135.27*/("""to """),_display_(/*135.31*/{
                            offset + count
                        }),format.raw/*137.26*/(""" """),format.raw/*137.27*/("""of """),_display_(/*137.31*/total),format.raw/*137.36*/("""</h6>
                    </div>
                    <div class="col s6" style="padding-top: -5px;
                        margin-top: -2px">
                        <a class='dropdown-trigger btn-flat right' href='#' data-target='dropdown2' style="text-ttansform: none;
                            font-weight: bold;
                            color: black;
                            font-family: AmazonEmberBold, Helvetica Neue Bold, Helvetica Neue, Helvetica, Arial, sans-serif;
                        !important; ">
                            Sort By: &nbsp; <font color="#3a5dc3">
                            """),_display_(/*147.30*/if(sort.equals("id"))/*147.51*/ {_display_(Seq[Any](format.raw/*147.53*/("""
                                """),format.raw/*148.33*/("""Job ID
                            """)))}/*149.30*/else if(sort.equals("jobTitle"))/*149.62*/{_display_(Seq[Any](format.raw/*149.63*/("""
                        """),format.raw/*150.25*/("""Job Title
                        """)))}/*151.26*/else if(sort.equals("access_times"))/*151.62*/{_display_(Seq[Any](format.raw/*151.63*/("""
                        """),format.raw/*152.25*/("""Popularity
                        """)))}/*153.26*/else/*153.31*/{_display_(Seq[Any](format.raw/*153.32*/("""
                        """),format.raw/*154.25*/("""Job Keywords
                        """)))}),format.raw/*155.26*/("""</font> <i class="material-icons right">expand_more</i></a>

                            <!-- Dropdown Structure -->
                        <ul id='dropdown2' class='dropdown-content'>
                        """),_display_(/*159.26*/if(listType.equals("all"))/*159.52*/ {_display_(Seq[Any](format.raw/*159.54*/("""
                            """),format.raw/*160.29*/("""<li><a href=""""),_display_(/*160.43*/routes/*160.49*/.TAJobController.tajobList(1, "id")),format.raw/*160.84*/("""" class="grey-text text-darken-4"><i class="material-icons">
                                event</i>Job ID</a></li>
                            <li><a href=""""),_display_(/*162.43*/routes/*162.49*/.TAJobController.tajobList(1, "title")),format.raw/*162.87*/("""" class="grey-text text-darken-4"><i class="material-icons">
                                sort_by_alpha</i>Job Title </a></li>
                            <li><a href=""""),_display_(/*164.43*/routes/*164.49*/.TAJobController.tajobList(1, "fields")),format.raw/*164.88*/("""" class="grey-text text-darken-4"><i class="material-icons">
                                sort_by_alpha</i>Job Fields </a></li>
                            <li><a href=""""),_display_(/*166.43*/routes/*166.49*/.TAJobController.tajobList(1, "access_times")),format.raw/*166.94*/("""" class="grey-text text-darken-4"><i class="material-icons">
                                sort_by_alpha</i>Popularity </a></li>
                        """)))}/*168.26*/else/*168.31*/{_display_(Seq[Any](format.raw/*168.32*/("""
                            """),format.raw/*169.29*/("""<li>
                                <a onclick="jumpToPage(1, 'id', '"""),_display_(/*170.67*/searchBody),format.raw/*170.77*/("""')">
                                    <i class="material-icons">event</i>Job ID
                                </a>
                            </li>
                            <li>
                                <a onclick="jumpToPage(1, 'title', '"""),_display_(/*175.70*/searchBody),format.raw/*175.80*/("""')">
                                    <i class="material-icons">sort_by_alpha</i>Job Title
                                </a>
                            </li>
                            <li>
                                <a onclick="jumpToPage(1, 'location', '"""),_display_(/*180.73*/searchBody),format.raw/*180.83*/("""')">
                                    <i class="material-icons">sort_by_alpha</i>Job Location
                                </a>
                            </li>
                            <li>
                                <a onclick="jumpToPage(1, 'access_times', '"""),_display_(/*185.77*/searchBody),format.raw/*185.87*/("""')">
                                    <i class="material-icons">sort_by_alpha</i>Popularity
                                </a>
                            </li>
                        """)))}),format.raw/*189.26*/("""
                        """),format.raw/*190.25*/("""</ul>
                    </div>
                </div>
                <table class="centered responsive-table striped" id="projectTable" >
                    <thead>
                        <tr class="list-header" style="border-bottom: 1px solid;
                        !important;">
                            <th style="cursor: pointer;">TA Job Id</th>
                            <th style="cursor: pointer;">Title</th>
                            <th style="cursor: pointer;">Short Description</th>
                            <th style="cursor: pointer;">Fields</th>
                        </tr>
                    </thead>
                    <tbody>
                    """),_display_(/*204.22*/for((entry, index) <- tajobs.zipWithIndex) yield /*204.64*/ {_display_(Seq[Any](format.raw/*204.66*/("""
                        """),format.raw/*205.25*/("""<tr>
                            <td><a href = """"),_display_(/*206.45*/routes/*206.51*/.TAJobController.tajobDetail(entry.getId())),format.raw/*206.94*/("""">"""),_display_(/*206.97*/entry/*206.102*/.getId()),format.raw/*206.110*/("""</a></td>


                            """),_display_(/*209.30*/if(entry.getTitle() != "")/*209.56*/ {_display_(Seq[Any](format.raw/*209.58*/("""
                                """),format.raw/*210.33*/("""<td><span class=""""),_display_(/*210.51*/entry/*210.56*/.getId()),format.raw/*210.64*/(""" """),format.raw/*210.65*/("""editable" data-name='title'></span>
                                    """),_display_(/*211.38*/entry/*211.43*/.getTitle()),format.raw/*211.54*/("""
                                """),format.raw/*212.33*/("""</td>
                            """)))}/*213.31*/else/*213.36*/{_display_(Seq[Any](format.raw/*213.37*/("""
                                """),format.raw/*214.33*/("""<td><span class=""""),_display_(/*214.51*/entry/*214.56*/.getId()),format.raw/*214.64*/(""" """),format.raw/*214.65*/("""editable" data-name='title'>&ensp; -</span></td>
                            """)))}),format.raw/*215.30*/("""

                            """),_display_(/*217.30*/if(entry.getShortDescription() != "")/*217.67*/ {_display_(Seq[Any](format.raw/*217.69*/("""
                                """),format.raw/*218.33*/("""<td><span class=""""),_display_(/*218.51*/entry/*218.56*/.getId()),format.raw/*218.64*/(""" """),format.raw/*218.65*/("""editable" data-name='shortDescription'></span>

                                    """),_display_(/*220.38*/entry/*220.43*/.getShortDescription()),format.raw/*220.65*/("""
                                """),format.raw/*221.33*/("""</td>
                            """)))}/*222.31*/else/*222.36*/{_display_(Seq[Any](format.raw/*222.37*/("""
                                """),format.raw/*223.33*/("""<td><span class=""""),_display_(/*223.51*/entry/*223.56*/.getId()),format.raw/*223.64*/(""" """),format.raw/*223.65*/("""editable" data-name='shortDescription'>&ensp; -</span></td>
                            """)))}),format.raw/*224.30*/("""



                            """),_display_(/*228.30*/if(entry.getFields() != "")/*228.57*/ {_display_(Seq[Any](format.raw/*228.59*/("""
                                """),format.raw/*229.33*/("""<td><span class=""""),_display_(/*229.51*/entry/*229.56*/.getId()),format.raw/*229.64*/(""" """),format.raw/*229.65*/("""editable" data-name='fields'></span>

                                    """),_display_(/*231.38*/entry/*231.43*/.getFields()),format.raw/*231.55*/("""
                                """),format.raw/*232.33*/("""</td>
                            """)))}/*233.31*/else/*233.36*/{_display_(Seq[Any](format.raw/*233.37*/("""
                                """),format.raw/*234.33*/("""<td><span class=""""),_display_(/*234.51*/entry/*234.56*/.getId()),format.raw/*234.64*/(""" """),format.raw/*234.65*/("""editable" data-name='fields'>&ensp; -</span></td>
                            """)))}),format.raw/*235.30*/("""

                        """),format.raw/*237.25*/("""</tr>
                    """)))}),format.raw/*238.22*/("""
                    """),format.raw/*239.21*/("""</tbody>
                </table>

                <div class="row">
                    <div class="col s12">
                        <ul class="pagination center-align">

                            """),_display_(/*246.30*/if(listType.equals("all"))/*246.56*/ {_display_(Seq[Any](format.raw/*246.58*/("""
                                """),_display_(/*247.34*/if(pageNum == 1)/*247.50*/ {_display_(Seq[Any](format.raw/*247.52*/("""
                                    """),format.raw/*248.37*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                        first_page</i></li>
                                    <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                        chevron_left</i></li>
                                """)))}/*252.35*/else/*252.40*/{_display_(Seq[Any](format.raw/*252.41*/("""
                                    """),format.raw/*253.37*/("""<li class="waves-effect"><a href=""""),_display_(/*253.72*/routes/*253.78*/.TAJobController.tajobList(1, sort)),format.raw/*253.113*/(""""><i class="material-icons">
                                        first_page</i></a></li>
                                    <li class="waves-effect"><a href=""""),_display_(/*255.72*/routes/*255.78*/.TAJobController.tajobList(pageNum - 1, sort)),format.raw/*255.123*/(""""><i class="material-icons">
                                        chevron_left</i></a></li>
                                """)))}),format.raw/*257.34*/("""
                                """),_display_(/*258.34*/if(beginIndexForPagination > 1)/*258.65*/ {_display_(Seq[Any](format.raw/*258.67*/("""
                                    """),format.raw/*259.37*/("""<li class="waves-effect modal-trigger" href="#allPageModal" style="cursor: pointer;
                                        font-size: 20px;
                                        font-weight: bold">...</li>
                                """)))}),format.raw/*262.34*/("""
                                """),_display_(/*263.34*/for(i <- (beginIndexForPagination + 0) to (endIndexForPagination + 0)) yield /*263.104*/ {_display_(Seq[Any](format.raw/*263.106*/("""
                                    """),format.raw/*264.37*/("""<li """),_display_(/*264.42*/if(pageNum == i)/*264.58*/ {_display_(Seq[Any](format.raw/*264.60*/("""
                                        """),format.raw/*265.41*/("""class="active"""")))}),format.raw/*265.56*/("""><a href=""""),_display_(/*265.67*/routes/*265.73*/.TAJobController.tajobList(i, sort)),format.raw/*265.108*/("""">"""),_display_(/*265.111*/i),format.raw/*265.112*/("""</a></li>
                                """)))}),format.raw/*266.34*/("""
                                """),_display_(/*267.34*/if(endIndexForPagination < ((total - 1) / pageLimit + 1))/*267.91*/ {_display_(Seq[Any](format.raw/*267.93*/("""
                                    """),format.raw/*268.37*/("""<li class="waves-effect modal-trigger" href="#allPageModal" style="cursor: pointer;
                                        font-size: 20px;
                                        font-weight: bold">...</li>
                                """)))}),format.raw/*271.34*/("""
                                """),_display_(/*272.34*/if((offset + count) >= total)/*272.63*/ {_display_(Seq[Any](format.raw/*272.65*/("""
                                    """),format.raw/*273.37*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                        chevron_right</i></li>
                                    <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                        last_page</i></li>
                                """)))}/*277.35*/else/*277.40*/{_display_(Seq[Any](format.raw/*277.41*/("""
                                    """),format.raw/*278.37*/("""<li class="waves-effect"><a href=""""),_display_(/*278.72*/routes/*278.78*/.TAJobController.tajobList(pageNum + 1, sort)),format.raw/*278.123*/(""""><i class="material-icons">
                                        chevron_right</i></a></li>
                                    <li class="waves-effect"><a href=""""),_display_(/*280.72*/routes/*280.78*/.TAJobController.tajobList((total - 1) / pageLimit + 1, sort)),format.raw/*280.139*/(""""><i class="material-icons">
                                        last_page</i></a></li>
                                """)))}),format.raw/*282.34*/("""
                            """)))}/*283.30*/else if(listType.equals("my enroll"))/*283.67*/{_display_(Seq[Any](format.raw/*283.68*/("""
                            """),_display_(/*284.30*/if(pageNum == 1)/*284.46*/ {_display_(Seq[Any](format.raw/*284.48*/("""
                                """),format.raw/*285.33*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    first_page</i></li>
                                <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    chevron_left</i></li>
                            """)))}),format.raw/*289.30*/("""
                            """),_display_(/*290.30*/if(beginIndexForPagination > 1)/*290.61*/ {_display_(Seq[Any](format.raw/*290.63*/("""
                                """),format.raw/*291.33*/("""<li class="waves-effect modal-trigger" href="#enrollPageModal" style="cursor: pointer;
                                    font-size: 20px;
                                    font-weight: bold">...</li>
                            """)))}),format.raw/*294.30*/("""

                            """),_display_(/*296.30*/if(endIndexForPagination < ((total - 1) / pageLimit + 1))/*296.87*/ {_display_(Seq[Any](format.raw/*296.89*/("""
                                """),format.raw/*297.33*/("""<li class="waves-effect modal-trigger" href="#enrollPageModal" style="cursor: pointer;
                                    font-size: 20px;
                                    font-weight: bold">...</li>
                            """)))}),format.raw/*300.30*/("""

                        """)))}/*302.26*/else/*302.30*/{_display_(Seq[Any](format.raw/*302.31*/("""
                            """),_display_(/*303.30*/if(pageNum == 1)/*303.46*/ {_display_(Seq[Any](format.raw/*303.48*/("""
                                """),format.raw/*304.33*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    first_page</i></li>
                                <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    chevron_left</i></li>
                            """)))}/*308.31*/else/*308.36*/{_display_(Seq[Any](format.raw/*308.37*/("""
                                """),format.raw/*309.33*/("""<li class="waves-effect">
                                    <a href="#!" onclick="jumpToPage(1, '"""),_display_(/*310.75*/sort),format.raw/*310.79*/("""', '"""),_display_(/*310.84*/searchBody),format.raw/*310.94*/("""')">
                                        <i class="material-icons">first_page</i>
                                    </a>
                                </li>
                                <li class="waves-effect">
                                    <a href="#!" onclick="jumpToPage("""),_display_(/*315.71*/pageNum),format.raw/*315.78*/("""-1, '"""),_display_(/*315.84*/sort),format.raw/*315.88*/("""', '"""),_display_(/*315.93*/searchBody),format.raw/*315.103*/("""')">
                                        <i class="material-icons">chevron_left</i>
                                    </a>
                                </li>
                            """)))}),format.raw/*319.30*/("""
                            """),_display_(/*320.30*/if(beginIndexForPagination > 1)/*320.61*/ {_display_(Seq[Any](format.raw/*320.63*/("""
                                """),format.raw/*321.33*/("""<li class="waves-effect modal-trigger" href="#searchPageModal" style="cursor: pointer;
                                    font-size: 20px;
                                    font-weight: bold">...</li>
                            """)))}),format.raw/*324.30*/("""
                            """),_display_(/*325.30*/for(i <- (beginIndexForPagination + 0) to (endIndexForPagination + 0)) yield /*325.100*/ {_display_(Seq[Any](format.raw/*325.102*/("""
                                """),format.raw/*326.33*/("""<li """),_display_(/*326.38*/if(pageNum == i)/*326.54*/ {_display_(Seq[Any](format.raw/*326.56*/("""
                                    """),format.raw/*327.37*/("""class="active"""")))}),format.raw/*327.52*/(""">
                                    <a href="#!" onclick="jumpToPage("""),_display_(/*328.71*/i),format.raw/*328.72*/(""", '"""),_display_(/*328.76*/sort),format.raw/*328.80*/("""', '"""),_display_(/*328.85*/searchBody),format.raw/*328.95*/("""')">
                                    """),_display_(/*329.38*/i),format.raw/*329.39*/("""
                                    """),format.raw/*330.37*/("""</a>
                                </li>
                            """)))}),format.raw/*332.30*/("""
                            """),_display_(/*333.30*/if(endIndexForPagination < ((total - 1) / pageLimit + 1))/*333.87*/ {_display_(Seq[Any](format.raw/*333.89*/("""
                                """),format.raw/*334.33*/("""<li class="waves-effect modal-trigger" href="#searchPageModal" style="cursor: pointer;
                                    font-size: 20px;
                                    font-weight: bold">...</li>
                            """)))}),format.raw/*337.30*/("""
                            """),_display_(/*338.30*/if((offset + count) >= total)/*338.59*/ {_display_(Seq[Any](format.raw/*338.61*/("""
                                """),format.raw/*339.33*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    chevron_right</i></li>
                                <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    last_page</i></li>
                            """)))}/*343.31*/else/*343.36*/{_display_(Seq[Any](format.raw/*343.37*/("""
                                """),format.raw/*344.33*/("""<li class="waves-effect">
                                    <a href="#!" onclick="jumpToPage("""),_display_(/*345.71*/pageNum),format.raw/*345.78*/("""+1, '"""),_display_(/*345.84*/sort),format.raw/*345.88*/("""', '"""),_display_(/*345.93*/searchBody),format.raw/*345.103*/("""')">
                                        <i class="material-icons">chevron_right</i>
                                    </a>
                                </li>
                                <li class="waves-effect">
                                    <a href="#!" onclick="jumpToPage(("""),_display_(/*350.72*/total),format.raw/*350.77*/("""-1)/("""),_display_(/*350.83*/pageLimit),format.raw/*350.92*/(""")+1, '"""),_display_(/*350.99*/sort),format.raw/*350.103*/("""', '"""),_display_(/*350.108*/searchBody),format.raw/*350.118*/("""')">
                                        <i class="material-icons">last_page</i>
                                    </a>
                                </li>
                            """)))}),format.raw/*354.30*/("""
                            """)))}),format.raw/*355.30*/("""
                        """),format.raw/*356.25*/("""</ul>
                    </div>
                </div>
            """)))}/*359.15*/else/*359.20*/{_display_(Seq[Any](format.raw/*359.21*/("""
                """),format.raw/*360.17*/("""<h5>No jobs registered yet.</h5>
            """)))}),format.raw/*361.14*/("""
            """),format.raw/*362.13*/("""<div id="allPageModal" class="modal">
                <div class="modal-content">
                    <h6>Select the page number you want to jump to</h6>
                    <div class="card z-depth-0">

                    """),_display_(/*367.22*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*367.79*/ {_display_(Seq[Any](format.raw/*367.81*/("""
                        """),format.raw/*368.25*/("""<ul class="pagination center-align">
                        """),_display_(/*369.26*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*369.65*/ {_display_(Seq[Any](format.raw/*369.67*/("""
                            """),_display_(/*370.30*/if(j <= ((total - 1)/(pageLimit) + 1))/*370.68*/ {_display_(Seq[Any](format.raw/*370.70*/("""
                                """),_display_(/*371.34*/if(j != pageNum)/*371.50*/ {_display_(Seq[Any](format.raw/*371.52*/("""
                                    """),format.raw/*372.37*/("""<li class="waves-effect grey lighten-3"><a href='"""),_display_(/*372.87*/routes/*372.93*/.TAJobController.tajobList(j, sort)),format.raw/*372.128*/("""'>"""),_display_(/*372.131*/j),format.raw/*372.132*/("""</a></li>
                                """)))}/*373.34*/else/*373.38*/{_display_(Seq[Any](format.raw/*373.39*/("""
                                    """),format.raw/*374.37*/("""<li class="waves-effect active"><a href=""""),_display_(/*374.79*/routes/*374.85*/.TAJobController.tajobList(j, sort)),format.raw/*374.120*/("""">"""),_display_(/*374.123*/j),format.raw/*374.124*/("""</a></li>
                                """)))}),format.raw/*375.34*/("""
                            """)))}),format.raw/*376.30*/("""
                        """)))}),format.raw/*377.26*/("""
                        """),format.raw/*378.25*/("""</ul>
                    """)))}),format.raw/*379.22*/("""
                    """),format.raw/*380.21*/("""</div>
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

                    """),_display_(/*393.22*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*393.79*/ {_display_(Seq[Any](format.raw/*393.81*/("""
                        """),format.raw/*394.25*/("""<ul class="pagination center-align">
                        """),_display_(/*395.26*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*395.65*/ {_display_(Seq[Any](format.raw/*395.67*/("""
                            """),_display_(/*396.30*/if(j <= ((total - 1)/(pageLimit) + 1))/*396.68*/ {_display_(Seq[Any](format.raw/*396.70*/("""
                                """),_display_(/*397.34*/if(j != pageNum)/*397.50*/ {_display_(Seq[Any](format.raw/*397.52*/("""
                                    """),format.raw/*398.37*/("""<li class="waves-effect grey lighten-3"><a href='"""),_display_(/*398.87*/routes/*398.93*/.ProjectController.getMyEnrolledProjects(j, sort)),format.raw/*398.142*/("""'>"""),_display_(/*398.145*/j),format.raw/*398.146*/("""</a></li>
                                """)))}/*399.34*/else/*399.38*/{_display_(Seq[Any](format.raw/*399.39*/("""
                                    """),format.raw/*400.37*/("""<li class="waves-effect active"><a href=""""),_display_(/*400.79*/routes/*400.85*/.ProjectController.getMyEnrolledProjects(j, sort)),format.raw/*400.134*/("""">"""),_display_(/*400.137*/j),format.raw/*400.138*/("""</a></li>
                                """)))}),format.raw/*401.34*/("""
                            """)))}),format.raw/*402.30*/("""
                        """)))}),format.raw/*403.26*/("""
                        """),format.raw/*404.25*/("""</ul>
                    """)))}),format.raw/*405.22*/("""
                    """),format.raw/*406.21*/("""</div>
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

                    """),_display_(/*419.22*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*419.79*/ {_display_(Seq[Any](format.raw/*419.81*/("""
                        """),format.raw/*420.25*/("""<ul class="pagination center-align">
                        """),_display_(/*421.26*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*421.65*/ {_display_(Seq[Any](format.raw/*421.67*/("""
                            """),_display_(/*422.30*/if(j <= ((total - 1)/(pageLimit) + 1))/*422.68*/ {_display_(Seq[Any](format.raw/*422.70*/("""
                                """),_display_(/*423.34*/if(j != pageNum)/*423.50*/ {_display_(Seq[Any](format.raw/*423.52*/("""
                                    """),format.raw/*424.37*/("""<li class="waves-effect grey lighten-3"><a href='#!' onclick="jumpToPage("""),_display_(/*424.111*/j),format.raw/*424.112*/(""", 'id', '"""),_display_(/*424.122*/searchBody),format.raw/*424.132*/("""')">"""),_display_(/*424.137*/j),format.raw/*424.138*/("""</a></li>
                                """)))}/*425.34*/else/*425.38*/{_display_(Seq[Any](format.raw/*425.39*/("""
                                    """),format.raw/*426.37*/("""<li class="waves-effect active"><a href="#!" onclick="jumpToPage("""),_display_(/*426.103*/j),format.raw/*426.104*/(""", 'id', '"""),_display_(/*426.114*/searchBody),format.raw/*426.124*/("""')">"""),_display_(/*426.129*/j),format.raw/*426.130*/("""</a></li>
                                """)))}),format.raw/*427.34*/("""
                            """)))}),format.raw/*428.30*/("""
                        """)))}),format.raw/*429.26*/("""
                        """),format.raw/*430.25*/("""</ul>
                    """)))}),format.raw/*431.22*/("""
                    """),format.raw/*432.21*/("""</div>
                </div>
                <div class="modal-footer">
                    <a href="#!" class="modal-close waves-effect waves-green btn-flat">
                        Cancel</a>
                </div>
            </div>

        </div>
    </div>
""")))}),format.raw/*442.2*/("""

"""))
      }
    }
  }

  def render(tajobs:List[TAJob],pageNum:Integer,sort:String,offset:Integer,total:Integer,count:Integer,listType:String,pageLimit:Integer,searchBody:String,id:Long,beginIndexForPagination:Integer,endIndexForPagination:Integer): play.twirl.api.HtmlFormat.Appendable = apply(tajobs,pageNum,sort,offset,total,count,listType,pageLimit,searchBody,id,beginIndexForPagination,endIndexForPagination)

  def f:((List[TAJob],Integer,String,Integer,Integer,Integer,String,Integer,String,Long,Integer,Integer) => play.twirl.api.HtmlFormat.Appendable) = (tajobs,pageNum,sort,offset,total,count,listType,pageLimit,searchBody,id,beginIndexForPagination,endIndexForPagination) => apply(tajobs,pageNum,sort,offset,total,count,listType,pageLimit,searchBody,id,beginIndexForPagination,endIndexForPagination)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:38 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/tajobList.scala.html
                  HASH: a2d7d7801b61d6403925bd993d15ace2eb2aea86
                  MATRIX: 1203->1|1585->311|1610->329|1634->346|1667->368|1682->375|1763->379|1795->384|1852->414|1867->420|1926->458|2045->549|2074->550|2119->567|2190->611|2235->640|2275->642|2320->659|2359->670|2388->671|2417->672|2474->702|2489->708|2525->723|2646->817|2661->823|2698->839|2900->1010|2945->1027|3237->1291|3266->1292|3359->1357|3388->1358|3434->1376|4136->2050|4165->2051|4207->2065|4260->2090|4289->2091|4335->2109|4564->2310|4593->2311|4642->2332|4772->2434|4801->2435|4830->2436|5263->2841|5292->2842|5345->2867|5498->2992|5527->2993|5576->3014|5710->3120|5739->3121|5785->3139|5837->3163|5866->3164|5899->3170|5973->3216|6002->3217|6047->3234|6192->3351|6221->3352|6253->3357|6303->309|6331->366|6359->3367|6388->3370|6425->3398|6465->3400|6497->3405|6602->3482|6641->3511|6682->3513|6728->3530|7186->3968|7227->4000|7268->4002|7310->4015|7773->4446|7816->4461|7847->4482|7888->4484|7934->4501|8473->5012|8561->5078|8591->5079|8623->5083|8715->5153|8745->5154|8777->5158|8804->5163|9452->5783|9483->5804|9524->5806|9586->5839|9642->5875|9684->5907|9724->5908|9778->5933|9833->5968|9879->6004|9919->6005|9973->6030|10029->6066|10043->6071|10083->6072|10137->6097|10207->6135|10446->6346|10482->6372|10523->6374|10581->6403|10623->6417|10639->6423|10696->6458|10884->6618|10900->6624|10960->6662|11160->6834|11176->6840|11237->6879|11438->7052|11454->7058|11521->7103|11697->7259|11711->7264|11751->7265|11809->7294|11908->7365|11940->7375|12224->7631|12256->7641|12554->7911|12586->7921|12891->8198|12923->8208|13146->8399|13200->8424|13913->9109|13972->9151|14013->9153|14067->9178|14144->9227|14160->9233|14225->9276|14256->9279|14272->9284|14303->9292|14372->9333|14408->9359|14449->9361|14511->9394|14557->9412|14572->9417|14602->9425|14632->9426|14733->9499|14748->9504|14781->9515|14843->9548|14898->9584|14912->9589|14952->9590|15014->9623|15060->9641|15075->9646|15105->9654|15135->9655|15245->9733|15304->9764|15351->9801|15392->9803|15454->9836|15500->9854|15515->9859|15545->9867|15575->9868|15688->9953|15703->9958|15747->9980|15809->10013|15864->10049|15878->10054|15918->10055|15980->10088|16026->10106|16041->10111|16071->10119|16101->10120|16222->10209|16283->10242|16320->10269|16361->10271|16423->10304|16469->10322|16484->10327|16514->10335|16544->10336|16647->10411|16662->10416|16696->10428|16758->10461|16813->10497|16827->10502|16867->10503|16929->10536|16975->10554|16990->10559|17020->10567|17050->10568|17161->10647|17216->10673|17275->10700|17325->10721|17555->10923|17591->10949|17632->10951|17694->10985|17720->11001|17761->11003|17827->11040|18208->11402|18222->11407|18262->11408|18328->11445|18391->11480|18407->11486|18465->11521|18657->11685|18673->11691|18741->11736|18901->11864|18963->11898|19004->11929|19045->11931|19111->11968|19385->12210|19447->12244|19535->12314|19577->12316|19643->12353|19676->12358|19702->12374|19743->12376|19813->12417|19860->12432|19899->12443|19915->12449|19973->12484|20005->12487|20029->12488|20104->12531|20166->12565|20233->12622|20274->12624|20340->12661|20614->12903|20676->12937|20715->12966|20756->12968|20822->13005|21203->13367|21217->13372|21257->13373|21323->13410|21386->13445|21402->13451|21470->13496|21665->13663|21681->13669|21765->13730|21922->13855|21972->13885|22019->13922|22059->13923|22117->13953|22143->13969|22184->13971|22246->14004|22623->14349|22681->14379|22722->14410|22763->14412|22825->14445|23090->14678|23149->14709|23216->14766|23257->14768|23319->14801|23584->15034|23631->15061|23645->15065|23685->15066|23743->15096|23769->15112|23810->15114|23872->15147|24237->15493|24251->15498|24291->15499|24353->15532|24481->15632|24507->15636|24540->15641|24572->15651|24893->15944|24922->15951|24956->15957|24982->15961|25015->15966|25048->15976|25276->16172|25334->16202|25375->16233|25416->16235|25478->16268|25743->16501|25801->16531|25889->16601|25931->16603|25993->16636|26026->16641|26052->16657|26093->16659|26159->16696|26206->16711|26306->16783|26329->16784|26361->16788|26387->16792|26420->16797|26452->16807|26522->16849|26545->16850|26611->16887|26715->16959|26773->16989|26840->17046|26881->17048|26943->17081|27208->17314|27266->17344|27305->17373|27346->17375|27408->17408|27773->17754|27787->17759|27827->17760|27889->17793|28013->17889|28042->17896|28076->17902|28102->17906|28135->17911|28168->17921|28493->18218|28520->18223|28554->18229|28585->18238|28620->18245|28647->18249|28681->18254|28714->18264|28939->18457|29001->18487|29055->18512|29144->18582|29158->18587|29198->18588|29244->18605|29322->18651|29364->18664|29617->18889|29691->18946|29732->18948|29786->18973|29876->19035|29932->19074|29973->19076|30031->19106|30079->19144|30120->19146|30182->19180|30208->19196|30249->19198|30315->19235|30393->19285|30409->19291|30467->19326|30499->19329|30523->19330|30586->19373|30600->19377|30640->19378|30706->19415|30776->19457|30792->19463|30850->19498|30882->19501|30906->19502|30981->19545|31043->19575|31101->19601|31155->19626|31214->19653|31264->19674|31771->20153|31845->20210|31886->20212|31940->20237|32030->20299|32086->20338|32127->20340|32185->20370|32233->20408|32274->20410|32336->20444|32362->20460|32403->20462|32469->20499|32547->20549|32563->20555|32635->20604|32667->20607|32691->20608|32754->20651|32768->20655|32808->20656|32874->20693|32944->20735|32960->20741|33032->20790|33064->20793|33088->20794|33163->20837|33225->20867|33283->20893|33337->20918|33396->20945|33446->20966|33953->21445|34027->21502|34068->21504|34122->21529|34212->21591|34268->21630|34309->21632|34367->21662|34415->21700|34456->21702|34518->21736|34544->21752|34585->21754|34651->21791|34754->21865|34778->21866|34817->21876|34850->21886|34884->21891|34908->21892|34971->21935|34985->21939|35025->21940|35091->21977|35186->22043|35210->22044|35249->22054|35282->22064|35316->22069|35340->22070|35415->22113|35477->22143|35535->22169|35589->22194|35648->22221|35698->22242|35995->22508
                  LINES: 35->1|47->11|48->12|49->13|51->15|51->15|53->15|54->16|54->16|54->16|54->16|57->19|57->19|58->20|59->21|59->21|59->21|60->22|60->22|60->22|60->22|61->23|61->23|61->23|64->26|64->26|64->26|67->29|68->30|76->38|76->38|78->40|78->40|80->42|97->59|97->59|99->61|99->61|99->61|101->63|104->66|104->66|105->67|106->68|106->68|106->68|114->76|114->76|115->77|117->79|117->79|118->80|120->82|120->82|122->84|123->85|123->85|125->87|127->89|127->89|128->90|131->93|131->93|132->94|134->10|135->14|136->95|138->97|138->97|138->97|139->98|141->100|141->100|141->100|142->101|150->109|150->109|150->109|151->110|159->118|161->120|161->120|161->120|162->121|174->133|176->135|176->135|176->135|178->137|178->137|178->137|178->137|188->147|188->147|188->147|189->148|190->149|190->149|190->149|191->150|192->151|192->151|192->151|193->152|194->153|194->153|194->153|195->154|196->155|200->159|200->159|200->159|201->160|201->160|201->160|201->160|203->162|203->162|203->162|205->164|205->164|205->164|207->166|207->166|207->166|209->168|209->168|209->168|210->169|211->170|211->170|216->175|216->175|221->180|221->180|226->185|226->185|230->189|231->190|245->204|245->204|245->204|246->205|247->206|247->206|247->206|247->206|247->206|247->206|250->209|250->209|250->209|251->210|251->210|251->210|251->210|251->210|252->211|252->211|252->211|253->212|254->213|254->213|254->213|255->214|255->214|255->214|255->214|255->214|256->215|258->217|258->217|258->217|259->218|259->218|259->218|259->218|259->218|261->220|261->220|261->220|262->221|263->222|263->222|263->222|264->223|264->223|264->223|264->223|264->223|265->224|269->228|269->228|269->228|270->229|270->229|270->229|270->229|270->229|272->231|272->231|272->231|273->232|274->233|274->233|274->233|275->234|275->234|275->234|275->234|275->234|276->235|278->237|279->238|280->239|287->246|287->246|287->246|288->247|288->247|288->247|289->248|293->252|293->252|293->252|294->253|294->253|294->253|294->253|296->255|296->255|296->255|298->257|299->258|299->258|299->258|300->259|303->262|304->263|304->263|304->263|305->264|305->264|305->264|305->264|306->265|306->265|306->265|306->265|306->265|306->265|306->265|307->266|308->267|308->267|308->267|309->268|312->271|313->272|313->272|313->272|314->273|318->277|318->277|318->277|319->278|319->278|319->278|319->278|321->280|321->280|321->280|323->282|324->283|324->283|324->283|325->284|325->284|325->284|326->285|330->289|331->290|331->290|331->290|332->291|335->294|337->296|337->296|337->296|338->297|341->300|343->302|343->302|343->302|344->303|344->303|344->303|345->304|349->308|349->308|349->308|350->309|351->310|351->310|351->310|351->310|356->315|356->315|356->315|356->315|356->315|356->315|360->319|361->320|361->320|361->320|362->321|365->324|366->325|366->325|366->325|367->326|367->326|367->326|367->326|368->327|368->327|369->328|369->328|369->328|369->328|369->328|369->328|370->329|370->329|371->330|373->332|374->333|374->333|374->333|375->334|378->337|379->338|379->338|379->338|380->339|384->343|384->343|384->343|385->344|386->345|386->345|386->345|386->345|386->345|386->345|391->350|391->350|391->350|391->350|391->350|391->350|391->350|391->350|395->354|396->355|397->356|400->359|400->359|400->359|401->360|402->361|403->362|408->367|408->367|408->367|409->368|410->369|410->369|410->369|411->370|411->370|411->370|412->371|412->371|412->371|413->372|413->372|413->372|413->372|413->372|413->372|414->373|414->373|414->373|415->374|415->374|415->374|415->374|415->374|415->374|416->375|417->376|418->377|419->378|420->379|421->380|434->393|434->393|434->393|435->394|436->395|436->395|436->395|437->396|437->396|437->396|438->397|438->397|438->397|439->398|439->398|439->398|439->398|439->398|439->398|440->399|440->399|440->399|441->400|441->400|441->400|441->400|441->400|441->400|442->401|443->402|444->403|445->404|446->405|447->406|460->419|460->419|460->419|461->420|462->421|462->421|462->421|463->422|463->422|463->422|464->423|464->423|464->423|465->424|465->424|465->424|465->424|465->424|465->424|465->424|466->425|466->425|466->425|467->426|467->426|467->426|467->426|467->426|467->426|467->426|468->427|469->428|470->429|471->430|472->431|473->432|483->442
                  -- GENERATED --
              */
          