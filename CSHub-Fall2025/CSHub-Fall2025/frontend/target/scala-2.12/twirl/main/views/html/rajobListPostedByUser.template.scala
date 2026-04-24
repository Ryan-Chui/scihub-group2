
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

object rajobListPostedByUser extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template9[List[RAJob],Integer,Integer,Integer,Integer,Integer,Long,Integer,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(rajobs: List[RAJob],
        pageNum: Integer,
        offset: Integer,
        total: Integer,
        count: Integer,
        pageLimit: Integer,
        id: Long,
        beginIndexForPagination: Integer,
        endIndexForPagination: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*10.2*/import helper._;
/*11.2*/import models._;
/*12.2*/import models.RAJob;

def /*14.2*/scripts/*14.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*14.13*/("""
    """),format.raw/*15.5*/("""<script type = "module" src='"""),_display_(/*15.35*/routes/*15.41*/.Assets.at("javascripts/voiceJump.js")),format.raw/*15.79*/("""'></script>
    <script type="text/javascript">

            $(document).ready(function () """),format.raw/*18.43*/("""{"""),format.raw/*18.44*/("""
                """),format.raw/*19.17*/("""var technologiesArray = []
                """),_display_(/*20.18*/for(i <- 0 until rajobs.size) yield /*20.47*/ {_display_(Seq[Any](format.raw/*20.49*/("""
                """),format.raw/*21.17*/("""var json = """),format.raw/*21.28*/("""{"""),format.raw/*21.29*/("""}"""),format.raw/*21.30*/(""";
                json.id = '"""),_display_(/*22.29*/rajobs/*22.35*/.get(i).getId()),format.raw/*22.50*/("""';
                json.url = "/job/jobDetail/" + json.id;

                json.name = '"""),_display_(/*25.31*/rajobs/*25.37*/.get(i).getTitle),format.raw/*25.53*/("""'.replace(/[^a-zA-Z0-9]/g, " ").replace(/  +/g, " ").trim();
                console.log("jsonhere:" + json)
                technologiesArray.push(json)
                """)))}),format.raw/*28.18*/("""
                """),format.raw/*29.17*/("""$("#nasaText").text(JSON.stringify(technologiesArray));

                $('.tooltipped').tooltip();

                // $("#speak-from-filter").click();
                // $("#speak-nasa").click();
                // $("#speak-from-filter").click();

            """),format.raw/*37.13*/("""}"""),format.raw/*37.14*/(""");

            function jumpToPage(pageNum) """),format.raw/*39.42*/("""{"""),format.raw/*39.43*/("""

                """),format.raw/*41.17*/("""pageNum =  parseInt(pageNum);

                var url = "/job/searchPOST?pageNum=" + (pageNum);
                var form = $(document.createElement('form'));
                $(form).attr("action", url);
                $(form).attr("method", "GET");
                $(form).css("display", "none");


                var form_searchString = $("<input>")
                        .attr("type", "text")
                        .attr("name", "searchString")
                        .val(searchString);
                $(form).append($(form_searchString));

                form.appendTo(document.body);
                $(form).submit();
            """),format.raw/*58.13*/("""}"""),format.raw/*58.14*/("""

            """),format.raw/*60.13*/("""function string2Map(str) """),format.raw/*60.38*/("""{"""),format.raw/*60.39*/("""

                """),format.raw/*62.17*/("""var map = new Map();
                var splitedString = str.replace(new RegExp("],", 'g'), ";");
                var array = splitedString.split(";");
                for(var i=0; i<array.length; i++)"""),format.raw/*65.50*/("""{"""),format.raw/*65.51*/("""
                    """),format.raw/*66.21*/("""var idAndEventsString = array[i];
                    idAndEventsString = idAndEventsString.replace(/["""),format.raw/*67.69*/("""{"""),format.raw/*67.70*/("""}"""),format.raw/*67.71*/("""[\]\\]/g, " ");
                    var idAndEvents = idAndEventsString.split("=");
                    var id = idAndEvents[0];
                    var eventsString = idAndEvents[1];
                    var events = eventsString.split(",");
                    console.log("events:" + events + "," + i);

                    var formatedEvents = "";
                    for(var j=0; j<events.length; j++)"""),format.raw/*75.55*/("""{"""),format.raw/*75.56*/("""
                        """),format.raw/*76.25*/("""events[j] = events[j].trim();
                        formatedEvents = formatedEvents + events[j] + ";";
                    """),format.raw/*78.21*/("""}"""),format.raw/*78.22*/("""
                    """),format.raw/*79.21*/("""if(formatedEvents.length > 1)
                        map.set(id.trim(), formatedEvents);
                """),format.raw/*81.17*/("""}"""),format.raw/*81.18*/("""

                """),format.raw/*83.17*/("""return map;
            """),format.raw/*84.13*/("""}"""),format.raw/*84.14*/("""

    """),format.raw/*86.5*/("""</script>
    <style>
            .follow-fab """),format.raw/*88.25*/("""{"""),format.raw/*88.26*/("""
                """),format.raw/*89.17*/("""top: -20px !important;
                bottom: auto !important;
                right: -20px !important;
            """),format.raw/*92.13*/("""}"""),format.raw/*92.14*/("""

            """),format.raw/*94.13*/(""".truncate-text """),format.raw/*94.28*/("""{"""),format.raw/*94.29*/("""
                """),format.raw/*95.17*/("""display: -webkit-box;
                -webkit-line-clamp: 3;
                -webkit-box-orient: vertical;
                overflow: hidden;
                text-overflow: ellipsis;
                max-height: 4.5em; /* 3 lines approx if line-height is 1.5em */
                line-height: 1.5em;
                cursor: pointer;
                white-space: normal;
            """),format.raw/*104.13*/("""}"""),format.raw/*104.14*/("""
    """),format.raw/*105.5*/("""</style>
""")))};
Seq[Any](format.raw/*9.40*/("""
"""),format.raw/*13.1*/("""
"""),format.raw/*106.2*/("""

"""),_display_(/*108.2*/main("My Posted RAJobs", scripts)/*108.35*/ {_display_(Seq[Any](format.raw/*108.37*/("""
    """),format.raw/*109.5*/("""<div class="container">
        <div class="card-panel center">
            <div class="row card-panel z-depth-0 project-zone-panel">
                <div class="col s12" style="margin-top: -10px;
                    margin-bottom: -10px;">
                    <h6 class="center tooltipped" data-position="bottom" data-tooltip="This list shows the my posted job lists." >
                        My Posted RAJobs
                    </h6>
                </div>
            </div>

            """),_display_(/*120.14*/if(rajobs.size() > 0)/*120.35*/ {_display_(Seq[Any](format.raw/*120.37*/("""
                """),format.raw/*121.17*/("""<div class="col s8 offset-s2">
                    <h4>RAJob List</h4>

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
                </div>
                <table class="centered responsive-table striped" id="projectTable" >
                    <thead>
                        <tr class="list-header" style="border-bottom: 1px solid;
                        !important;">
                            <th style="cursor: pointer;">RAJob Id</th>
                            <th style="cursor: pointer;">Title</th>
                            <th style="cursor: pointer;">Short Description</th>
                            <th style="cursor: pointer;">Fields</th>
                            <th style="cursor: pointer;">Status</th>
                            <th style="cursor: pointer;">View Applications</th>

                        </tr>
                    </thead>
                    <tbody>
                    """),_display_(/*154.22*/for((entry, index) <- rajobs.zipWithIndex if entry.getStatus() != "closed") yield /*154.97*/ {_display_(Seq[Any](format.raw/*154.99*/("""
                        """),format.raw/*155.25*/("""<tr>
                            <td>"""),_display_(/*156.34*/entry/*156.39*/.getId()),format.raw/*156.47*/("""</td>


                            """),format.raw/*159.90*/("""
                            """),format.raw/*160.132*/("""
                            """),format.raw/*161.86*/("""
                            """),format.raw/*162.70*/("""
                            """),format.raw/*163.69*/("""
                            """),format.raw/*164.145*/("""
                            """),format.raw/*165.62*/("""
                            """),format.raw/*166.29*/("""<td>

                            """),_display_(/*168.30*/if(entry.getTitle() != null && entry.getTitle().nonEmpty)/*168.87*/ {_display_(Seq[Any](format.raw/*168.89*/("""
                                """),format.raw/*169.33*/("""<a href = """"),_display_(/*169.45*/routes/*169.51*/.RAJobController.rajobDetail(entry.getId())),format.raw/*169.94*/("""">"""),_display_(/*169.97*/entry/*169.102*/.getTitle()),format.raw/*169.113*/("""</a>
                                <span class=""""),_display_(/*170.47*/entry/*170.52*/.getId()),format.raw/*170.60*/(""" """),format.raw/*170.61*/("""editable" data-name="title"></span>
                                """),format.raw/*171.108*/("""
                                """),format.raw/*172.114*/("""
                                """),format.raw/*173.81*/("""
                                """),format.raw/*174.94*/("""
                                """),format.raw/*175.74*/("""
                            """)))}/*176.31*/else/*176.36*/{_display_(Seq[Any](format.raw/*176.37*/("""
                                """),format.raw/*177.33*/("""<span class=""""),_display_(/*177.47*/entry/*177.52*/.getId()),format.raw/*177.60*/(""" """),format.raw/*177.61*/("""editable" data-name="title">&ensp; -</span>
                            """)))}),format.raw/*178.30*/("""
                            """),format.raw/*179.29*/("""</td>

                            """),format.raw/*181.101*/("""
                            """),format.raw/*182.143*/("""

                            """),format.raw/*184.97*/("""
                            """),format.raw/*185.70*/("""
                            """),format.raw/*186.69*/("""
                            """),format.raw/*187.156*/("""
                            """),format.raw/*188.62*/("""

                            """),format.raw/*190.29*/("""<td>

                            """),_display_(/*192.30*/if(entry.getShortDescription() != null && entry.getShortDescription().nonEmpty)/*192.109*/ {_display_(Seq[Any](format.raw/*192.111*/("""
                                """),format.raw/*193.33*/("""<span class=""""),_display_(/*193.47*/entry/*193.52*/.getId()),format.raw/*193.60*/(""" """),format.raw/*193.61*/("""editable truncate-text" data-name="shortDescription" title=""""),_display_(/*193.122*/entry/*193.127*/.getShortDescription()),format.raw/*193.149*/("""">
                                    """),format.raw/*194.123*/("""
                                    """),format.raw/*195.129*/("""
                                    """),format.raw/*196.85*/("""
                                    """),format.raw/*197.109*/("""
                                    """),format.raw/*198.78*/("""
                                    """),_display_(/*199.38*/entry/*199.43*/.getShortDescription()),format.raw/*199.65*/("""
                                """),format.raw/*200.33*/("""</span>
                            """)))}/*201.31*/else/*201.36*/{_display_(Seq[Any](format.raw/*201.37*/("""
                                """),format.raw/*202.33*/("""<span class=""""),_display_(/*202.47*/entry/*202.52*/.getId()),format.raw/*202.60*/(""" """),format.raw/*202.61*/("""editable truncate-text" data-name="shortDescription">&ensp; -</span>
                            """)))}),format.raw/*203.30*/("""
                            """),format.raw/*204.29*/("""</td>

                            """),format.raw/*206.91*/("""
                            """),format.raw/*207.133*/("""

                            """),format.raw/*209.87*/("""
                            """),format.raw/*210.70*/("""
                            """),format.raw/*211.69*/("""
                            """),format.raw/*212.146*/("""
                            """),format.raw/*213.62*/("""
                            """),format.raw/*214.29*/("""<td>
                            """),_display_(/*215.30*/if(entry.getFields() != null && entry.getFields().nonEmpty)/*215.89*/ {_display_(Seq[Any](format.raw/*215.91*/("""
                                """),format.raw/*216.33*/("""<span class=""""),_display_(/*216.47*/entry/*216.52*/.getId()),format.raw/*216.60*/(""" """),format.raw/*216.61*/("""editable truncate-text" data-name="fields" title=""""),_display_(/*216.112*/entry/*216.117*/.getFields()),format.raw/*216.129*/("""">
                                    """),format.raw/*217.113*/("""
                                    """),format.raw/*218.119*/("""
                                    """),format.raw/*219.85*/("""
                                    """),format.raw/*220.99*/("""
                                    """),format.raw/*221.78*/("""
                                    """),_display_(/*222.38*/entry/*222.43*/.getFields()),format.raw/*222.55*/("""
                                """),format.raw/*223.33*/("""</span>
                            """)))}/*224.31*/else/*224.36*/{_display_(Seq[Any](format.raw/*224.37*/("""
                                """),format.raw/*225.33*/("""<span class=""""),_display_(/*225.47*/entry/*225.52*/.getId()),format.raw/*225.60*/(""" """),format.raw/*225.61*/("""editable truncate-text" data-name="fields">&ensp; -</span>
                            """)))}),format.raw/*226.30*/("""
                            """),format.raw/*227.29*/("""</td>

                            """),format.raw/*229.95*/("""
                            """),format.raw/*230.69*/("""
                            """),format.raw/*231.147*/("""
                            """),format.raw/*232.70*/("""
                            """),format.raw/*233.103*/("""
                            """),format.raw/*234.65*/("""
                            """),format.raw/*235.141*/("""
                            """),format.raw/*236.66*/("""
                            """),format.raw/*237.67*/("""
                            """),format.raw/*238.65*/("""
                            """),format.raw/*239.138*/("""
                            """),format.raw/*240.66*/("""
                            """),format.raw/*241.62*/("""



                            """),_display_(/*245.30*/if(entry.getStatus() == "open")/*245.61*/ {_display_(Seq[Any](format.raw/*245.63*/("""
                                """),format.raw/*246.33*/("""<td>
                                    <span class="new badge light-green darken-1" data-badge-caption="open"></span>
                                </td>
                            """)))}/*249.31*/else if(entry.getStatus() == "pending")/*249.70*/{_display_(Seq[Any](format.raw/*249.71*/("""
                            """),format.raw/*250.29*/("""<td>
                                <span class="new badge purple darken-1" data-badge-caption="pending"></span>
                            </td>
                            """),format.raw/*253.101*/("""
                            """),format.raw/*254.69*/("""
                            """),format.raw/*255.142*/("""
                            """),format.raw/*256.70*/("""
                            """)))}/*257.30*/else/*257.34*/{_display_(Seq[Any](format.raw/*257.35*/("""
                            """),format.raw/*258.29*/("""<td>
                                <span class="new badge blue darken-3" data-badge-caption="updated"></span>
                            </td>
                            """)))}),format.raw/*261.30*/("""

                            """),_display_(/*263.30*/if(entry.getNumberOfApplicants()>0)/*263.65*/ {_display_(Seq[Any](format.raw/*263.67*/("""
                                """),format.raw/*264.33*/("""<td>
                                    <a class="waves-effect waves-light green darken-3 btn" href=""""),_display_(/*265.99*/routes/*265.105*/.JobController.jobApplicationsList("rajob", entry.getId(), 1, "")),format.raw/*265.170*/("""">view</a>
                                </td>
                            """)))}/*267.31*/else/*267.36*/{_display_(Seq[Any](format.raw/*267.37*/("""
                                """),format.raw/*268.33*/("""<td>
                                    <a class="btn disabled">view</a>
                                </td>
                            """)))}),format.raw/*271.30*/("""

                        """),format.raw/*273.25*/("""</tr>
                    """)))}),format.raw/*274.22*/("""
                    """),format.raw/*275.21*/("""</tbody>
                </table>

                <div class="row">
                    <div class="col s12">
                        <ul class="pagination center-align">
                            """),_display_(/*281.30*/if(pageNum == 1)/*281.46*/ {_display_(Seq[Any](format.raw/*281.48*/("""
                                """),format.raw/*282.33*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    first_page</i></li>
                                <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    chevron_left</i></li>
                            """)))}/*286.31*/else/*286.36*/{_display_(Seq[Any](format.raw/*286.37*/("""
                                """),format.raw/*287.33*/("""<li class="waves-effect"><a href=""""),_display_(/*287.68*/routes/*287.74*/.RAJobController.rajobListPostedByUser(1)),format.raw/*287.115*/(""""><i class="material-icons">
                                    first_page</i></a></li>
                                <li class="waves-effect"><a href=""""),_display_(/*289.68*/routes/*289.74*/.RAJobController.rajobListPostedByUser(pageNum - 1)),format.raw/*289.125*/(""""><i class="material-icons">
                                    chevron_left</i></a></li>
                            """)))}),format.raw/*291.30*/("""
                            """),_display_(/*292.30*/if(beginIndexForPagination > 1)/*292.61*/ {_display_(Seq[Any](format.raw/*292.63*/("""
                                """),format.raw/*293.33*/("""<li class="waves-effect modal-trigger" href="#allPageModal" style="cursor: pointer;
                                    font-size: 20px;
                                    font-weight: bold">...</li>
                            """)))}),format.raw/*296.30*/("""
                            """),_display_(/*297.30*/for(i <- (beginIndexForPagination + 0) to (endIndexForPagination + 0)) yield /*297.100*/ {_display_(Seq[Any](format.raw/*297.102*/("""
                                """),format.raw/*298.33*/("""<li """),_display_(/*298.38*/if(pageNum == i)/*298.54*/ {_display_(Seq[Any](format.raw/*298.56*/("""
                                    """),format.raw/*299.37*/("""class="active"""")))}),format.raw/*299.52*/("""><a href=""""),_display_(/*299.63*/routes/*299.69*/.RAJobController.rajobListPostedByUser(i)),format.raw/*299.110*/("""">"""),_display_(/*299.113*/i),format.raw/*299.114*/("""</a></li>
                            """)))}),format.raw/*300.30*/("""
                            """),_display_(/*301.30*/if(endIndexForPagination < ((total - 1) / pageLimit + 1))/*301.87*/ {_display_(Seq[Any](format.raw/*301.89*/("""
                                """),format.raw/*302.33*/("""<li class="waves-effect modal-trigger" href="#allPageModal" style="cursor: pointer;
                                    font-size: 20px;
                                    font-weight: bold">...</li>
                            """)))}),format.raw/*305.30*/("""
                            """),_display_(/*306.30*/if((offset + count) >= total)/*306.59*/ {_display_(Seq[Any](format.raw/*306.61*/("""
                                """),format.raw/*307.33*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    chevron_right</i></li>
                                <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    last_page</i></li>
                            """)))}/*311.31*/else/*311.36*/{_display_(Seq[Any](format.raw/*311.37*/("""
                                """),format.raw/*312.33*/("""<li class="waves-effect"><a href=""""),_display_(/*312.68*/routes/*312.74*/.RAJobController.rajobListPostedByUser(pageNum + 1)),format.raw/*312.125*/(""""><i class="material-icons">
                                    chevron_right</i></a></li>
                                <li class="waves-effect"><a href=""""),_display_(/*314.68*/routes/*314.74*/.RAJobController.rajobListPostedByUser((total - 1) / pageLimit + 1)),format.raw/*314.141*/(""""><i class="material-icons">
                                    last_page</i></a></li>
                            """)))}),format.raw/*316.30*/("""
                        """),format.raw/*317.25*/("""</ul>
                    </div>
                </div>
            """)))}/*320.15*/else/*320.20*/{_display_(Seq[Any](format.raw/*320.21*/("""
                """),format.raw/*321.17*/("""<h5>No rajobs registered yet.</h5>
            """)))}),format.raw/*322.14*/("""
            """),format.raw/*323.13*/("""<div id="allPageModal" class="modal">
                <div class="modal-content">
                    <h6>Select the page number you want to jump to</h6>
                    <div class="card z-depth-0">

                    """),_display_(/*328.22*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*328.79*/ {_display_(Seq[Any](format.raw/*328.81*/("""
                        """),format.raw/*329.25*/("""<ul class="pagination center-align">
                        """),_display_(/*330.26*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*330.65*/ {_display_(Seq[Any](format.raw/*330.67*/("""
                            """),_display_(/*331.30*/if(j <= ((total - 1)/(pageLimit) + 1))/*331.68*/ {_display_(Seq[Any](format.raw/*331.70*/("""
                                """),_display_(/*332.34*/if(j != pageNum)/*332.50*/ {_display_(Seq[Any](format.raw/*332.52*/("""
                                    """),format.raw/*333.37*/("""<li class="waves-effect grey lighten-3"><a href='"""),_display_(/*333.87*/routes/*333.93*/.RAJobController.rajobListPostedByUser(j)),format.raw/*333.134*/("""'>"""),_display_(/*333.137*/j),format.raw/*333.138*/("""</a></li>
                                """)))}/*334.34*/else/*334.38*/{_display_(Seq[Any](format.raw/*334.39*/("""
                                    """),format.raw/*335.37*/("""<li class="waves-effect active"><a href=""""),_display_(/*335.79*/routes/*335.85*/.RAJobController.rajobListPostedByUser(j)),format.raw/*335.126*/("""">"""),_display_(/*335.129*/j),format.raw/*335.130*/("""</a></li>
                                """)))}),format.raw/*336.34*/("""
                            """)))}),format.raw/*337.30*/("""
                        """)))}),format.raw/*338.26*/("""
                        """),format.raw/*339.25*/("""</ul>
                    """)))}),format.raw/*340.22*/("""
                    """),format.raw/*341.21*/("""</div>
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

                    """),_display_(/*354.22*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*354.79*/ {_display_(Seq[Any](format.raw/*354.81*/("""
                        """),format.raw/*355.25*/("""<ul class="pagination center-align">
                        """),_display_(/*356.26*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*356.65*/ {_display_(Seq[Any](format.raw/*356.67*/("""
                            """),_display_(/*357.30*/if(j <= ((total - 1)/(pageLimit) + 1))/*357.68*/ {_display_(Seq[Any](format.raw/*357.70*/("""
                                """),_display_(/*358.34*/if(j != pageNum)/*358.50*/ {_display_(Seq[Any](format.raw/*358.52*/("""
                                    """),format.raw/*359.37*/("""<li class="waves-effect grey lighten-3"><a href='"""),_display_(/*359.87*/routes/*359.93*/.ProjectController.getMyEnrolledProjects(j, "")),format.raw/*359.140*/("""'>"""),_display_(/*359.143*/j),format.raw/*359.144*/("""</a></li>
                                """)))}/*360.34*/else/*360.38*/{_display_(Seq[Any](format.raw/*360.39*/("""
                                    """),format.raw/*361.37*/("""<li class="waves-effect active"><a href=""""),_display_(/*361.79*/routes/*361.85*/.ProjectController.getMyEnrolledProjects(j, "")),format.raw/*361.132*/("""">"""),_display_(/*361.135*/j),format.raw/*361.136*/("""</a></li>
                                """)))}),format.raw/*362.34*/("""
                            """)))}),format.raw/*363.30*/("""
                        """)))}),format.raw/*364.26*/("""
                        """),format.raw/*365.25*/("""</ul>
                    """)))}),format.raw/*366.22*/("""
                    """),format.raw/*367.21*/("""</div>
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

                    """),_display_(/*380.22*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*380.79*/ {_display_(Seq[Any](format.raw/*380.81*/("""
                        """),format.raw/*381.25*/("""<ul class="pagination center-align">
                        """),_display_(/*382.26*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*382.65*/ {_display_(Seq[Any](format.raw/*382.67*/("""
                            """),_display_(/*383.30*/if(j <= ((total - 1)/(pageLimit) + 1))/*383.68*/ {_display_(Seq[Any](format.raw/*383.70*/("""
                                """),_display_(/*384.34*/if(j != pageNum)/*384.50*/ {_display_(Seq[Any](format.raw/*384.52*/("""
                                    """),format.raw/*385.37*/("""<li class="waves-effect grey lighten-3"><a href='#!' onclick="jumpToPage("""),_display_(/*385.111*/j),format.raw/*385.112*/(""")">"""),_display_(/*385.116*/j),format.raw/*385.117*/("""</a></li>
                                """)))}/*386.34*/else/*386.38*/{_display_(Seq[Any](format.raw/*386.39*/("""
                                    """),format.raw/*387.37*/("""<li class="waves-effect active"><a href="#!" onclick="jumpToPage("""),_display_(/*387.103*/j),format.raw/*387.104*/(""")">"""),_display_(/*387.108*/j),format.raw/*387.109*/("""</a></li>
                                """)))}),format.raw/*388.34*/("""
                            """)))}),format.raw/*389.30*/("""
                        """)))}),format.raw/*390.26*/("""
                        """),format.raw/*391.25*/("""</ul>
                    """)))}),format.raw/*392.22*/("""
                    """),format.raw/*393.21*/("""</div>
                </div>
                <div class="modal-footer">
                    <a href="#!" class="modal-close waves-effect waves-green btn-flat">
                        Cancel</a>
                </div>
            </div>

        </div>
    </div>
""")))}),format.raw/*403.2*/("""
"""))
      }
    }
  }

  def render(rajobs:List[RAJob],pageNum:Integer,offset:Integer,total:Integer,count:Integer,pageLimit:Integer,id:Long,beginIndexForPagination:Integer,endIndexForPagination:Integer): play.twirl.api.HtmlFormat.Appendable = apply(rajobs,pageNum,offset,total,count,pageLimit,id,beginIndexForPagination,endIndexForPagination)

  def f:((List[RAJob],Integer,Integer,Integer,Integer,Integer,Long,Integer,Integer) => play.twirl.api.HtmlFormat.Appendable) = (rajobs,pageNum,offset,total,count,pageLimit,id,beginIndexForPagination,endIndexForPagination) => apply(rajobs,pageNum,offset,total,count,pageLimit,id,beginIndexForPagination,endIndexForPagination)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:35 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/rajobListPostedByUser.scala.html
                  HASH: be1899991d6fd75adf3e18f1a74e91603480f81d
                  MATRIX: 1193->1|1515->251|1540->269|1565->287|1599->310|1614->317|1695->321|1727->326|1784->356|1799->362|1858->400|1977->491|2006->492|2051->509|2122->553|2167->582|2207->584|2252->601|2291->612|2320->613|2349->614|2406->644|2421->650|2457->665|2574->755|2589->761|2626->777|2828->948|2873->965|3165->1229|3194->1230|3267->1275|3296->1276|3342->1294|4015->1939|4044->1940|4086->1954|4139->1979|4168->1980|4214->1998|4443->2199|4472->2200|4521->2221|4651->2323|4680->2324|4709->2325|5142->2730|5171->2731|5224->2756|5377->2881|5406->2882|5455->2903|5589->3009|5618->3010|5664->3028|5716->3052|5745->3053|5778->3059|5852->3105|5881->3106|5926->3123|6071->3240|6100->3241|6142->3255|6185->3270|6214->3271|6259->3288|6668->3668|6698->3669|6731->3674|6780->249|6808->308|6837->3684|6867->3687|6910->3720|6951->3722|6984->3727|7507->4222|7538->4243|7579->4245|7625->4262|8163->4772|8251->4838|8281->4839|8313->4843|8405->4913|8435->4914|8467->4918|8494->4923|9356->5757|9448->5832|9489->5834|9543->5859|9609->5897|9624->5902|9654->5910|9719->6007|9778->6139|9836->6225|9894->6295|9952->6364|10011->6509|10069->6571|10127->6600|10190->6635|10257->6692|10298->6694|10360->6727|10400->6739|10416->6745|10481->6788|10512->6791|10528->6796|10562->6807|10641->6858|10656->6863|10686->6871|10716->6872|10814->7015|10877->7129|10939->7210|11001->7304|11063->7378|11113->7409|11127->7414|11167->7415|11229->7448|11271->7462|11286->7467|11316->7475|11346->7476|11451->7549|11509->7578|11574->7685|11633->7828|11692->7926|11750->7996|11808->8065|11867->8221|11925->8283|11984->8313|12047->8348|12137->8427|12179->8429|12241->8462|12283->8476|12298->8481|12328->8489|12358->8490|12448->8551|12464->8556|12509->8578|12578->8703|12645->8832|12711->8917|12778->9026|12844->9104|12910->9142|12925->9147|12969->9169|13031->9202|13088->9240|13102->9245|13142->9246|13204->9279|13246->9293|13261->9298|13291->9306|13321->9307|13451->9405|13509->9434|13573->9531|13632->9664|13691->9752|13749->9822|13807->9891|13866->10037|13924->10099|13982->10128|14044->10162|14113->10221|14154->10223|14216->10256|14258->10270|14273->10275|14303->10283|14333->10284|14413->10335|14429->10340|14464->10352|14533->10467|14600->10586|14666->10671|14732->10770|14798->10848|14864->10886|14879->10891|14913->10903|14975->10936|15032->10974|15046->10979|15086->10980|15148->11013|15190->11027|15205->11032|15235->11040|15265->11041|15385->11129|15443->11158|15507->11259|15565->11328|15624->11475|15682->11545|15741->11648|15799->11713|15858->11854|15916->11920|15974->11987|16032->12052|16091->12190|16149->12256|16207->12318|16268->12351|16309->12382|16350->12384|16412->12417|16619->12605|16668->12644|16708->12645|16766->12674|16972->12922|17030->12991|17089->13133|17147->13203|17197->13233|17211->13237|17251->13238|17309->13267|17516->13442|17575->13473|17620->13508|17661->13510|17723->13543|17854->13646|17871->13652|17959->13717|18057->13796|18071->13801|18111->13802|18173->13835|18346->13976|18401->14002|18460->14029|18510->14050|18739->14251|18765->14267|18806->14269|18868->14302|19233->14648|19247->14653|19287->14654|19349->14687|19412->14722|19428->14728|19492->14769|19676->14925|19692->14931|19766->14982|19918->15102|19976->15132|20017->15163|20058->15165|20120->15198|20382->15428|20440->15458|20528->15528|20570->15530|20632->15563|20665->15568|20691->15584|20732->15586|20798->15623|20845->15638|20884->15649|20900->15655|20964->15696|20996->15699|21020->15700|21091->15739|21149->15769|21216->15826|21257->15828|21319->15861|21581->16091|21639->16121|21678->16150|21719->16152|21781->16185|22146->16531|22160->16536|22200->16537|22262->16570|22325->16605|22341->16611|22415->16662|22602->16821|22618->16827|22708->16894|22857->17011|22911->17036|23000->17106|23014->17111|23054->17112|23100->17129|23180->17177|23222->17190|23475->17415|23549->17472|23590->17474|23644->17499|23734->17561|23790->17600|23831->17602|23889->17632|23937->17670|23978->17672|24040->17706|24066->17722|24107->17724|24173->17761|24251->17811|24267->17817|24331->17858|24363->17861|24387->17862|24450->17905|24464->17909|24504->17910|24570->17947|24640->17989|24656->17995|24720->18036|24752->18039|24776->18040|24851->18083|24913->18113|24971->18139|25025->18164|25084->18191|25134->18212|25641->18691|25715->18748|25756->18750|25810->18775|25900->18837|25956->18876|25997->18878|26055->18908|26103->18946|26144->18948|26206->18982|26232->18998|26273->19000|26339->19037|26417->19087|26433->19093|26503->19140|26535->19143|26559->19144|26622->19187|26636->19191|26676->19192|26742->19229|26812->19271|26828->19277|26898->19324|26930->19327|26954->19328|27029->19371|27091->19401|27149->19427|27203->19452|27262->19479|27312->19500|27819->19979|27893->20036|27934->20038|27988->20063|28078->20125|28134->20164|28175->20166|28233->20196|28281->20234|28322->20236|28384->20270|28410->20286|28451->20288|28517->20325|28620->20399|28644->20400|28677->20404|28701->20405|28764->20448|28778->20452|28818->20453|28884->20490|28979->20556|29003->20557|29036->20561|29060->20562|29135->20605|29197->20635|29255->20661|29309->20686|29368->20713|29418->20734|29715->21000
                  LINES: 35->1|46->10|47->11|48->12|50->14|50->14|52->14|53->15|53->15|53->15|53->15|56->18|56->18|57->19|58->20|58->20|58->20|59->21|59->21|59->21|59->21|60->22|60->22|60->22|63->25|63->25|63->25|66->28|67->29|75->37|75->37|77->39|77->39|79->41|96->58|96->58|98->60|98->60|98->60|100->62|103->65|103->65|104->66|105->67|105->67|105->67|113->75|113->75|114->76|116->78|116->78|117->79|119->81|119->81|121->83|122->84|122->84|124->86|126->88|126->88|127->89|130->92|130->92|132->94|132->94|132->94|133->95|142->104|142->104|143->105|145->9|146->13|147->106|149->108|149->108|149->108|150->109|161->120|161->120|161->120|162->121|174->133|176->135|176->135|176->135|178->137|178->137|178->137|178->137|195->154|195->154|195->154|196->155|197->156|197->156|197->156|200->159|201->160|202->161|203->162|204->163|205->164|206->165|207->166|209->168|209->168|209->168|210->169|210->169|210->169|210->169|210->169|210->169|210->169|211->170|211->170|211->170|211->170|212->171|213->172|214->173|215->174|216->175|217->176|217->176|217->176|218->177|218->177|218->177|218->177|218->177|219->178|220->179|222->181|223->182|225->184|226->185|227->186|228->187|229->188|231->190|233->192|233->192|233->192|234->193|234->193|234->193|234->193|234->193|234->193|234->193|234->193|235->194|236->195|237->196|238->197|239->198|240->199|240->199|240->199|241->200|242->201|242->201|242->201|243->202|243->202|243->202|243->202|243->202|244->203|245->204|247->206|248->207|250->209|251->210|252->211|253->212|254->213|255->214|256->215|256->215|256->215|257->216|257->216|257->216|257->216|257->216|257->216|257->216|257->216|258->217|259->218|260->219|261->220|262->221|263->222|263->222|263->222|264->223|265->224|265->224|265->224|266->225|266->225|266->225|266->225|266->225|267->226|268->227|270->229|271->230|272->231|273->232|274->233|275->234|276->235|277->236|278->237|279->238|280->239|281->240|282->241|286->245|286->245|286->245|287->246|290->249|290->249|290->249|291->250|294->253|295->254|296->255|297->256|298->257|298->257|298->257|299->258|302->261|304->263|304->263|304->263|305->264|306->265|306->265|306->265|308->267|308->267|308->267|309->268|312->271|314->273|315->274|316->275|322->281|322->281|322->281|323->282|327->286|327->286|327->286|328->287|328->287|328->287|328->287|330->289|330->289|330->289|332->291|333->292|333->292|333->292|334->293|337->296|338->297|338->297|338->297|339->298|339->298|339->298|339->298|340->299|340->299|340->299|340->299|340->299|340->299|340->299|341->300|342->301|342->301|342->301|343->302|346->305|347->306|347->306|347->306|348->307|352->311|352->311|352->311|353->312|353->312|353->312|353->312|355->314|355->314|355->314|357->316|358->317|361->320|361->320|361->320|362->321|363->322|364->323|369->328|369->328|369->328|370->329|371->330|371->330|371->330|372->331|372->331|372->331|373->332|373->332|373->332|374->333|374->333|374->333|374->333|374->333|374->333|375->334|375->334|375->334|376->335|376->335|376->335|376->335|376->335|376->335|377->336|378->337|379->338|380->339|381->340|382->341|395->354|395->354|395->354|396->355|397->356|397->356|397->356|398->357|398->357|398->357|399->358|399->358|399->358|400->359|400->359|400->359|400->359|400->359|400->359|401->360|401->360|401->360|402->361|402->361|402->361|402->361|402->361|402->361|403->362|404->363|405->364|406->365|407->366|408->367|421->380|421->380|421->380|422->381|423->382|423->382|423->382|424->383|424->383|424->383|425->384|425->384|425->384|426->385|426->385|426->385|426->385|426->385|427->386|427->386|427->386|428->387|428->387|428->387|428->387|428->387|429->388|430->389|431->390|432->391|433->392|434->393|444->403
                  -- GENERATED --
              */
          