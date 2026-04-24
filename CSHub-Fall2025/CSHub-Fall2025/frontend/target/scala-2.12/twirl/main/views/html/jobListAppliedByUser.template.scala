
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

object jobListAppliedByUser extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template9[List[Job],Integer,Integer,Integer,Integer,Integer,Long,Integer,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(jobs: List[Job],
        pageNum: Integer,
        offset: Integer,
        total: Integer,
        count: Integer,
        pageLimit: Integer,
        id: Long, beginIndexForPagination: Integer, endIndexForPagination: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*8.2*/import helper._;
/*9.2*/import models._
/*10.2*/import models.Job

def /*12.2*/scripts/*12.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*12.13*/("""
    """),format.raw/*13.5*/("""<script type = "module" src='"""),_display_(/*13.35*/routes/*13.41*/.Assets.at("javascripts/voiceJump.js")),format.raw/*13.79*/("""'></script>
    <script type="text/javascript">

            $(document).ready(function () """),format.raw/*16.43*/("""{"""),format.raw/*16.44*/("""
                """),format.raw/*17.17*/("""var technologiesArray = []
                """),_display_(/*18.18*/for(i <- 0 until jobs.size) yield /*18.45*/ {_display_(Seq[Any](format.raw/*18.47*/("""
                """),format.raw/*19.17*/("""var json = """),format.raw/*19.28*/("""{"""),format.raw/*19.29*/("""}"""),format.raw/*19.30*/(""";
                json.id = '"""),_display_(/*20.29*/jobs/*20.33*/.get(i).getId()),format.raw/*20.48*/("""';
                json.url = "/job/jobDetail/" + json.id;

                json.name = '"""),_display_(/*23.31*/jobs/*23.35*/.get(i).getTitle),format.raw/*23.51*/("""'.replace(/[^a-zA-Z0-9]/g, " ").replace(/  +/g, " ").trim();
                console.log("jsonhere:" + json)
                technologiesArray.push(json)
                """)))}),format.raw/*26.18*/("""
                """),format.raw/*27.17*/("""$("#nasaText").text(JSON.stringify(technologiesArray));

                $('.tooltipped').tooltip();

                // $("#speak-from-filter").click();
                // $("#speak-nasa").click();
                // $("#speak-from-filter").click();

            """),format.raw/*35.13*/("""}"""),format.raw/*35.14*/(""");

            function jumpToPage(pageNum) """),format.raw/*37.42*/("""{"""),format.raw/*37.43*/("""

                """),format.raw/*39.17*/("""pageNum =  parseInt(pageNum);

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
            """),format.raw/*56.13*/("""}"""),format.raw/*56.14*/("""

            """),format.raw/*58.13*/("""function string2Map(str) """),format.raw/*58.38*/("""{"""),format.raw/*58.39*/("""

                """),format.raw/*60.17*/("""var map = new Map();
                var splitedString = str.replace(new RegExp("],", 'g'), ";");
                var array = splitedString.split(";");
                for(var i=0; i<array.length; i++)"""),format.raw/*63.50*/("""{"""),format.raw/*63.51*/("""
                    """),format.raw/*64.21*/("""var idAndEventsString = array[i];
                    idAndEventsString = idAndEventsString.replace(/["""),format.raw/*65.69*/("""{"""),format.raw/*65.70*/("""}"""),format.raw/*65.71*/("""[\]\\]/g, " ");
                    var idAndEvents = idAndEventsString.split("=");
                    var id = idAndEvents[0];
                    var eventsString = idAndEvents[1];
                    var events = eventsString.split(",");
                    console.log("events:" + events + "," + i);

                    var formatedEvents = "";
                    for(var j=0; j<events.length; j++)"""),format.raw/*73.55*/("""{"""),format.raw/*73.56*/("""
                        """),format.raw/*74.25*/("""events[j] = events[j].trim();
                        formatedEvents = formatedEvents + events[j] + ";";
                    """),format.raw/*76.21*/("""}"""),format.raw/*76.22*/("""
                    """),format.raw/*77.21*/("""if(formatedEvents.length > 1)
                        map.set(id.trim(), formatedEvents);
                """),format.raw/*79.17*/("""}"""),format.raw/*79.18*/("""

                """),format.raw/*81.17*/("""return map;
            """),format.raw/*82.13*/("""}"""),format.raw/*82.14*/("""

    """),format.raw/*84.5*/("""</script>
    <style>
            .follow-fab """),format.raw/*86.25*/("""{"""),format.raw/*86.26*/("""
                """),format.raw/*87.17*/("""top: -20px !important;
                bottom: auto !important;
                right: -20px !important;
            """),format.raw/*90.13*/("""}"""),format.raw/*90.14*/("""
    """),format.raw/*91.5*/("""</style>
""")))};
Seq[Any](format.raw/*7.84*/("""
"""),format.raw/*11.1*/("""
"""),format.raw/*92.2*/("""

"""),_display_(/*94.2*/main("My Posted Jobs", scripts)/*94.33*/ {_display_(Seq[Any](format.raw/*94.35*/("""
    """),format.raw/*95.5*/("""<div class="container">
        <div class="card-panel center">
            <div class="row card-panel z-depth-0 project-zone-panel">
                <div class="col s12" style="margin-top: -10px;
                    margin-bottom: -10px;">
                    <h6 class="center tooltipped" data-position="bottom" data-tooltip="This list shows the my posted job lists." >
                        My Applied Jobs
                    </h6>
                </div>
            </div>

            """),_display_(/*106.14*/if(jobs.size() > 0)/*106.33*/ {_display_(Seq[Any](format.raw/*106.35*/("""
                """),format.raw/*107.17*/("""<div class="col s8 offset-s2">
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
                        <h6 class="left">Showing results: """),_display_(/*119.60*/{
                            offset + 1
                        }),format.raw/*121.26*/(""" """),format.raw/*121.27*/("""to """),_display_(/*121.31*/{
                            offset + count
                        }),format.raw/*123.26*/(""" """),format.raw/*123.27*/("""of """),_display_(/*123.31*/total),format.raw/*123.36*/("""</h6>
                    </div>
                </div>
                <table class="centered responsive-table striped" id="projectTable" >
                    <thead>
                        <tr class="list-header" style="border-bottom: 1px solid;
                        !important;">
                            <th style="cursor: pointer;">Job Id</th>
                            <th style="cursor: pointer;">Title</th>
                            <th style="cursor: pointer;">Short Description</th>
                            <th style="cursor: pointer;">Fields</th>
                            <th style="cursor: pointer;">Status</th>
                            <th style="cursor: pointer;">View Applications</th>

                        </tr>
                    </thead>
                    <tbody>
                    """),_display_(/*140.22*/for((entry, index) <- jobs.zipWithIndex) yield /*140.62*/ {_display_(Seq[Any](format.raw/*140.64*/("""
                        """),format.raw/*141.25*/("""<tr>
                            <td><a href = """"),_display_(/*142.45*/routes/*142.51*/.JobController.jobDetail(entry.getId())),format.raw/*142.90*/("""">"""),_display_(/*142.93*/entry/*142.98*/.getId()),format.raw/*142.106*/("""</a></td>


                            """),_display_(/*145.30*/if(entry.getTitle() != "")/*145.56*/ {_display_(Seq[Any](format.raw/*145.58*/("""
                                """),format.raw/*146.33*/("""<td><span class=""""),_display_(/*146.51*/entry/*146.56*/.getId()),format.raw/*146.64*/(""" """),format.raw/*146.65*/("""editable" data-name='title'></span>
                                    """),_display_(/*147.38*/entry/*147.43*/.getTitle()),format.raw/*147.54*/("""
                                """),format.raw/*148.33*/("""</td>
                            """)))}/*149.31*/else/*149.36*/{_display_(Seq[Any](format.raw/*149.37*/("""
                                """),format.raw/*150.33*/("""<td><span class=""""),_display_(/*150.51*/entry/*150.56*/.getId()),format.raw/*150.64*/(""" """),format.raw/*150.65*/("""editable" data-name='title'>&ensp; -</span></td>
                            """)))}),format.raw/*151.30*/("""

                            """),_display_(/*153.30*/if(entry.getShortDescription() != "")/*153.67*/ {_display_(Seq[Any](format.raw/*153.69*/("""
                                """),format.raw/*154.33*/("""<td><span class=""""),_display_(/*154.51*/entry/*154.56*/.getId()),format.raw/*154.64*/(""" """),format.raw/*154.65*/("""editable" data-name='shortDescription'></span>

                                    """),_display_(/*156.38*/entry/*156.43*/.getShortDescription()),format.raw/*156.65*/("""
                                """),format.raw/*157.33*/("""</td>
                            """)))}/*158.31*/else/*158.36*/{_display_(Seq[Any](format.raw/*158.37*/("""
                                """),format.raw/*159.33*/("""<td><span class=""""),_display_(/*159.51*/entry/*159.56*/.getId()),format.raw/*159.64*/(""" """),format.raw/*159.65*/("""editable" data-name='shortDescription'>&ensp; -</span></td>
                            """)))}),format.raw/*160.30*/("""



                            """),_display_(/*164.30*/if(entry.getFields() != "")/*164.57*/ {_display_(Seq[Any](format.raw/*164.59*/("""
                                """),format.raw/*165.33*/("""<td><span class=""""),_display_(/*165.51*/entry/*165.56*/.getId()),format.raw/*165.64*/(""" """),format.raw/*165.65*/("""editable" data-name='fields'></span>

                                    """),_display_(/*167.38*/entry/*167.43*/.getFields()),format.raw/*167.55*/("""
                                """),format.raw/*168.33*/("""</td>
                            """)))}/*169.31*/else/*169.36*/{_display_(Seq[Any](format.raw/*169.37*/("""
                                """),format.raw/*170.33*/("""<td><span class=""""),_display_(/*170.51*/entry/*170.56*/.getId()),format.raw/*170.64*/(""" """),format.raw/*170.65*/("""editable" data-name='fields'>&ensp; -</span></td>
                            """)))}),format.raw/*171.30*/("""

                            """),_display_(/*173.30*/if(entry.getStatus() == "open")/*173.61*/ {_display_(Seq[Any](format.raw/*173.63*/("""
                                """),format.raw/*174.33*/("""<td>
                                    <span class="new badge light-green darken-1" data-badge-caption="open"></span>
                                </td>
                            """)))}/*177.31*/else if(entry.getStatus() == "pending")/*177.70*/{_display_(Seq[Any](format.raw/*177.71*/("""
                            """),format.raw/*178.29*/("""<td>
                                <span class="new badge purple darken-1" data-badge-caption="pending"></span>
                            </td>
                            """)))}/*181.30*/else/*181.34*/{_display_(Seq[Any](format.raw/*181.35*/("""
                            """),format.raw/*182.29*/("""<td>
                                <span class="new badge grey darken-3" data-badge-caption="closed"></span>
                            </td>
                            """)))}),format.raw/*185.30*/("""

"""),format.raw/*187.71*/("""
"""),format.raw/*188.41*/("""
"""),format.raw/*189.182*/("""
"""),format.raw/*190.42*/("""
"""),format.raw/*191.41*/("""
"""),format.raw/*192.41*/("""
"""),format.raw/*193.73*/("""
"""),format.raw/*194.42*/("""
"""),format.raw/*195.34*/("""
                            """),format.raw/*196.29*/("""<td>
                                <a class="waves-effect waves-light green darken-3 btn" href=""""),_display_(/*197.95*/routes/*197.101*/.JobController.jobApplicationDetail(entry.getjobApplicationId())),format.raw/*197.165*/("""">View </a>
                            </td>

                        </tr>
                    """)))}),format.raw/*201.22*/("""
                    """),format.raw/*202.21*/("""</tbody>
                </table>

                <div class="row">
                    <div class="col s12">
                        <ul class="pagination center-align">
                            """),_display_(/*208.30*/if(pageNum == 1)/*208.46*/ {_display_(Seq[Any](format.raw/*208.48*/("""
                                """),format.raw/*209.33*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    first_page</i></li>
                                <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    chevron_left</i></li>
                            """)))}/*213.31*/else/*213.36*/{_display_(Seq[Any](format.raw/*213.37*/("""
                                """),format.raw/*214.33*/("""<li class="waves-effect"><a href=""""),_display_(/*214.68*/routes/*214.74*/.JobController.jobListAppliedByUser(1)),format.raw/*214.112*/(""""><i class="material-icons">
                                    first_page</i></a></li>
                                <li class="waves-effect"><a href=""""),_display_(/*216.68*/routes/*216.74*/.JobController.jobListAppliedByUser(pageNum - 1)),format.raw/*216.122*/(""""><i class="material-icons">
                                    chevron_left</i></a></li>
                            """)))}),format.raw/*218.30*/("""
                            """),_display_(/*219.30*/if(beginIndexForPagination > 1)/*219.61*/ {_display_(Seq[Any](format.raw/*219.63*/("""
                                """),format.raw/*220.33*/("""<li class="waves-effect modal-trigger" href="#allPageModal" style="cursor: pointer;
                                    font-size: 20px;
                                    font-weight: bold">...</li>
                            """)))}),format.raw/*223.30*/("""
                            """),_display_(/*224.30*/for(i <- (beginIndexForPagination + 0) to (endIndexForPagination + 0)) yield /*224.100*/ {_display_(Seq[Any](format.raw/*224.102*/("""
                                """),format.raw/*225.33*/("""<li """),_display_(/*225.38*/if(pageNum == i)/*225.54*/ {_display_(Seq[Any](format.raw/*225.56*/("""
                                    """),format.raw/*226.37*/("""class="active"""")))}),format.raw/*226.52*/("""><a href=""""),_display_(/*226.63*/routes/*226.69*/.JobController.jobListAppliedByUser(i)),format.raw/*226.107*/("""">"""),_display_(/*226.110*/i),format.raw/*226.111*/("""</a></li>
                            """)))}),format.raw/*227.30*/("""
                            """),_display_(/*228.30*/if(endIndexForPagination < ((total - 1) / pageLimit + 1))/*228.87*/ {_display_(Seq[Any](format.raw/*228.89*/("""
                                """),format.raw/*229.33*/("""<li class="waves-effect modal-trigger" href="#allPageModal" style="cursor: pointer;
                                    font-size: 20px;
                                    font-weight: bold">...</li>
                            """)))}),format.raw/*232.30*/("""
                            """),_display_(/*233.30*/if((offset + count) >= total)/*233.59*/ {_display_(Seq[Any](format.raw/*233.61*/("""
                                """),format.raw/*234.33*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    chevron_right</i></li>
                                <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    last_page</i></li>
                            """)))}/*238.31*/else/*238.36*/{_display_(Seq[Any](format.raw/*238.37*/("""
                                """),format.raw/*239.33*/("""<li class="waves-effect"><a href=""""),_display_(/*239.68*/routes/*239.74*/.JobController.jobListAppliedByUser(pageNum + 1)),format.raw/*239.122*/(""""><i class="material-icons">
                                    chevron_right</i></a></li>
                                <li class="waves-effect"><a href=""""),_display_(/*241.68*/routes/*241.74*/.JobController.jobListAppliedByUser((total - 1) / pageLimit + 1)),format.raw/*241.138*/(""""><i class="material-icons">
                                    last_page</i></a></li>
                            """)))}),format.raw/*243.30*/("""
                        """),format.raw/*244.25*/("""</ul>
                    </div>
                </div>
            """)))}/*247.15*/else/*247.20*/{_display_(Seq[Any](format.raw/*247.21*/("""
                """),format.raw/*248.17*/("""<h5>No Jobs applied yet.</h5>
            """)))}),format.raw/*249.14*/("""
            """),format.raw/*250.13*/("""<div id="allPageModal" class="modal">
                <div class="modal-content">
                    <h6>Select the page number you want to jump to</h6>
                    <div class="card z-depth-0">

                    """),_display_(/*255.22*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*255.79*/ {_display_(Seq[Any](format.raw/*255.81*/("""
                        """),format.raw/*256.25*/("""<ul class="pagination center-align">
                        """),_display_(/*257.26*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*257.65*/ {_display_(Seq[Any](format.raw/*257.67*/("""
                            """),_display_(/*258.30*/if(j <= ((total - 1)/(pageLimit) + 1))/*258.68*/ {_display_(Seq[Any](format.raw/*258.70*/("""
                                """),_display_(/*259.34*/if(j != pageNum)/*259.50*/ {_display_(Seq[Any](format.raw/*259.52*/("""
                                    """),format.raw/*260.37*/("""<li class="waves-effect grey lighten-3"><a href='"""),_display_(/*260.87*/routes/*260.93*/.JobController.jobListAppliedByUser(j)),format.raw/*260.131*/("""'>"""),_display_(/*260.134*/j),format.raw/*260.135*/("""</a></li>
                                """)))}/*261.34*/else/*261.38*/{_display_(Seq[Any](format.raw/*261.39*/("""
                                    """),format.raw/*262.37*/("""<li class="waves-effect active"><a href=""""),_display_(/*262.79*/routes/*262.85*/.JobController.jobListAppliedByUser(j)),format.raw/*262.123*/("""">"""),_display_(/*262.126*/j),format.raw/*262.127*/("""</a></li>
                                """)))}),format.raw/*263.34*/("""
                            """)))}),format.raw/*264.30*/("""
                        """)))}),format.raw/*265.26*/("""
                        """),format.raw/*266.25*/("""</ul>
                    """)))}),format.raw/*267.22*/("""
                    """),format.raw/*268.21*/("""</div>
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

                    """),_display_(/*281.22*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*281.79*/ {_display_(Seq[Any](format.raw/*281.81*/("""
                        """),format.raw/*282.25*/("""<ul class="pagination center-align">
                        """),_display_(/*283.26*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*283.65*/ {_display_(Seq[Any](format.raw/*283.67*/("""
                            """),_display_(/*284.30*/if(j <= ((total - 1)/(pageLimit) + 1))/*284.68*/ {_display_(Seq[Any](format.raw/*284.70*/("""
                                """),_display_(/*285.34*/if(j != pageNum)/*285.50*/ {_display_(Seq[Any](format.raw/*285.52*/("""
                                    """),format.raw/*286.37*/("""<li class="waves-effect grey lighten-3"><a href='"""),_display_(/*286.87*/routes/*286.93*/.ProjectController.getMyEnrolledProjects(j, "")),format.raw/*286.140*/("""'>"""),_display_(/*286.143*/j),format.raw/*286.144*/("""</a></li>
                                """)))}/*287.34*/else/*287.38*/{_display_(Seq[Any](format.raw/*287.39*/("""
                                    """),format.raw/*288.37*/("""<li class="waves-effect active"><a href=""""),_display_(/*288.79*/routes/*288.85*/.ProjectController.getMyEnrolledProjects(j, "")),format.raw/*288.132*/("""">"""),_display_(/*288.135*/j),format.raw/*288.136*/("""</a></li>
                                """)))}),format.raw/*289.34*/("""
                            """)))}),format.raw/*290.30*/("""
                        """)))}),format.raw/*291.26*/("""
                        """),format.raw/*292.25*/("""</ul>
                    """)))}),format.raw/*293.22*/("""
                    """),format.raw/*294.21*/("""</div>
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

                    """),_display_(/*307.22*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*307.79*/ {_display_(Seq[Any](format.raw/*307.81*/("""
                        """),format.raw/*308.25*/("""<ul class="pagination center-align">
                        """),_display_(/*309.26*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*309.65*/ {_display_(Seq[Any](format.raw/*309.67*/("""
                            """),_display_(/*310.30*/if(j <= ((total - 1)/(pageLimit) + 1))/*310.68*/ {_display_(Seq[Any](format.raw/*310.70*/("""
                                """),_display_(/*311.34*/if(j != pageNum)/*311.50*/ {_display_(Seq[Any](format.raw/*311.52*/("""
                                    """),format.raw/*312.37*/("""<li class="waves-effect grey lighten-3"><a href='#!' onclick="jumpToPage("""),_display_(/*312.111*/j),format.raw/*312.112*/(""")">"""),_display_(/*312.116*/j),format.raw/*312.117*/("""</a></li>
                                """)))}/*313.34*/else/*313.38*/{_display_(Seq[Any](format.raw/*313.39*/("""
                                    """),format.raw/*314.37*/("""<li class="waves-effect active"><a href="#!" onclick="jumpToPage("""),_display_(/*314.103*/j),format.raw/*314.104*/(""")">"""),_display_(/*314.108*/j),format.raw/*314.109*/("""</a></li>
                                """)))}),format.raw/*315.34*/("""
                            """)))}),format.raw/*316.30*/("""
                        """)))}),format.raw/*317.26*/("""
                        """),format.raw/*318.25*/("""</ul>
                    """)))}),format.raw/*319.22*/("""
                    """),format.raw/*320.21*/("""</div>
                </div>
                <div class="modal-footer">
                    <a href="#!" class="modal-close waves-effect waves-green btn-flat">
                        Cancel</a>
                </div>
            </div>

        </div>
    </div>
""")))}),format.raw/*330.2*/("""

"""))
      }
    }
  }

  def render(jobs:List[Job],pageNum:Integer,offset:Integer,total:Integer,count:Integer,pageLimit:Integer,id:Long,beginIndexForPagination:Integer,endIndexForPagination:Integer): play.twirl.api.HtmlFormat.Appendable = apply(jobs,pageNum,offset,total,count,pageLimit,id,beginIndexForPagination,endIndexForPagination)

  def f:((List[Job],Integer,Integer,Integer,Integer,Integer,Long,Integer,Integer) => play.twirl.api.HtmlFormat.Appendable) = (jobs,pageNum,offset,total,count,pageLimit,id,beginIndexForPagination,endIndexForPagination) => apply(jobs,pageNum,offset,total,count,pageLimit,id,beginIndexForPagination,endIndexForPagination)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:32 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/jobListAppliedByUser.scala.html
                  HASH: 7a4993a68d47bb38360188b5964c59ab86789142
                  MATRIX: 1190->1|1491->231|1515->249|1539->266|1570->286|1585->293|1666->297|1698->302|1755->332|1770->338|1829->376|1948->467|1977->468|2022->485|2093->529|2136->556|2176->558|2221->575|2260->586|2289->587|2318->588|2375->618|2388->622|2424->637|2541->727|2554->731|2591->747|2793->918|2838->935|3130->1199|3159->1200|3232->1245|3261->1246|3307->1264|3980->1909|4009->1910|4051->1924|4104->1949|4133->1950|4179->1968|4408->2169|4437->2170|4486->2191|4616->2293|4645->2294|4674->2295|5107->2700|5136->2701|5189->2726|5342->2851|5371->2852|5420->2873|5554->2979|5583->2980|5629->2998|5681->3022|5710->3023|5743->3029|5817->3075|5846->3076|5891->3093|6036->3210|6065->3211|6097->3216|6146->229|6174->284|6202->3226|6231->3229|6271->3260|6311->3262|6343->3267|6865->3761|6894->3780|6935->3782|6981->3799|7517->4307|7605->4373|7635->4374|7667->4378|7759->4448|7789->4449|7821->4453|7848->4458|8708->5290|8765->5330|8806->5332|8860->5357|8937->5406|8953->5412|9014->5451|9045->5454|9060->5459|9091->5467|9160->5508|9196->5534|9237->5536|9299->5569|9345->5587|9360->5592|9390->5600|9420->5601|9521->5674|9536->5679|9569->5690|9631->5723|9686->5759|9700->5764|9740->5765|9802->5798|9848->5816|9863->5821|9893->5829|9923->5830|10033->5908|10092->5939|10139->5976|10180->5978|10242->6011|10288->6029|10303->6034|10333->6042|10363->6043|10476->6128|10491->6133|10535->6155|10597->6188|10652->6224|10666->6229|10706->6230|10768->6263|10814->6281|10829->6286|10859->6294|10889->6295|11010->6384|11071->6417|11108->6444|11149->6446|11211->6479|11257->6497|11272->6502|11302->6510|11332->6511|11435->6586|11450->6591|11484->6603|11546->6636|11601->6672|11615->6677|11655->6678|11717->6711|11763->6729|11778->6734|11808->6742|11838->6743|11949->6822|12008->6853|12049->6884|12090->6886|12152->6919|12359->7107|12408->7146|12448->7147|12506->7176|12703->7353|12717->7357|12757->7358|12815->7387|13021->7561|13052->7633|13082->7674|13113->7856|13143->7898|13173->7939|13203->7980|13233->8053|13263->8095|13293->8129|13351->8158|13478->8257|13495->8263|13582->8327|13712->8425|13762->8446|13991->8647|14017->8663|14058->8665|14120->8698|14485->9044|14499->9049|14539->9050|14601->9083|14664->9118|14680->9124|14741->9162|14925->9318|14941->9324|15012->9372|15164->9492|15222->9522|15263->9553|15304->9555|15366->9588|15628->9818|15686->9848|15774->9918|15816->9920|15878->9953|15911->9958|15937->9974|15978->9976|16044->10013|16091->10028|16130->10039|16146->10045|16207->10083|16239->10086|16263->10087|16334->10126|16392->10156|16459->10213|16500->10215|16562->10248|16824->10478|16882->10508|16921->10537|16962->10539|17024->10572|17389->10918|17403->10923|17443->10924|17505->10957|17568->10992|17584->10998|17655->11046|17842->11205|17858->11211|17945->11275|18094->11392|18148->11417|18237->11487|18251->11492|18291->11493|18337->11510|18412->11553|18454->11566|18707->11791|18781->11848|18822->11850|18876->11875|18966->11937|19022->11976|19063->11978|19121->12008|19169->12046|19210->12048|19272->12082|19298->12098|19339->12100|19405->12137|19483->12187|19499->12193|19560->12231|19592->12234|19616->12235|19679->12278|19693->12282|19733->12283|19799->12320|19869->12362|19885->12368|19946->12406|19978->12409|20002->12410|20077->12453|20139->12483|20197->12509|20251->12534|20310->12561|20360->12582|20867->13061|20941->13118|20982->13120|21036->13145|21126->13207|21182->13246|21223->13248|21281->13278|21329->13316|21370->13318|21432->13352|21458->13368|21499->13370|21565->13407|21643->13457|21659->13463|21729->13510|21761->13513|21785->13514|21848->13557|21862->13561|21902->13562|21968->13599|22038->13641|22054->13647|22124->13694|22156->13697|22180->13698|22255->13741|22317->13771|22375->13797|22429->13822|22488->13849|22538->13870|23045->14349|23119->14406|23160->14408|23214->14433|23304->14495|23360->14534|23401->14536|23459->14566|23507->14604|23548->14606|23610->14640|23636->14656|23677->14658|23743->14695|23846->14769|23870->14770|23903->14774|23927->14775|23990->14818|24004->14822|24044->14823|24110->14860|24205->14926|24229->14927|24262->14931|24286->14932|24361->14975|24423->15005|24481->15031|24535->15056|24594->15083|24644->15104|24941->15370
                  LINES: 35->1|44->8|45->9|46->10|48->12|48->12|50->12|51->13|51->13|51->13|51->13|54->16|54->16|55->17|56->18|56->18|56->18|57->19|57->19|57->19|57->19|58->20|58->20|58->20|61->23|61->23|61->23|64->26|65->27|73->35|73->35|75->37|75->37|77->39|94->56|94->56|96->58|96->58|96->58|98->60|101->63|101->63|102->64|103->65|103->65|103->65|111->73|111->73|112->74|114->76|114->76|115->77|117->79|117->79|119->81|120->82|120->82|122->84|124->86|124->86|125->87|128->90|128->90|129->91|131->7|132->11|133->92|135->94|135->94|135->94|136->95|147->106|147->106|147->106|148->107|160->119|162->121|162->121|162->121|164->123|164->123|164->123|164->123|181->140|181->140|181->140|182->141|183->142|183->142|183->142|183->142|183->142|183->142|186->145|186->145|186->145|187->146|187->146|187->146|187->146|187->146|188->147|188->147|188->147|189->148|190->149|190->149|190->149|191->150|191->150|191->150|191->150|191->150|192->151|194->153|194->153|194->153|195->154|195->154|195->154|195->154|195->154|197->156|197->156|197->156|198->157|199->158|199->158|199->158|200->159|200->159|200->159|200->159|200->159|201->160|205->164|205->164|205->164|206->165|206->165|206->165|206->165|206->165|208->167|208->167|208->167|209->168|210->169|210->169|210->169|211->170|211->170|211->170|211->170|211->170|212->171|214->173|214->173|214->173|215->174|218->177|218->177|218->177|219->178|222->181|222->181|222->181|223->182|226->185|228->187|229->188|230->189|231->190|232->191|233->192|234->193|235->194|236->195|237->196|238->197|238->197|238->197|242->201|243->202|249->208|249->208|249->208|250->209|254->213|254->213|254->213|255->214|255->214|255->214|255->214|257->216|257->216|257->216|259->218|260->219|260->219|260->219|261->220|264->223|265->224|265->224|265->224|266->225|266->225|266->225|266->225|267->226|267->226|267->226|267->226|267->226|267->226|267->226|268->227|269->228|269->228|269->228|270->229|273->232|274->233|274->233|274->233|275->234|279->238|279->238|279->238|280->239|280->239|280->239|280->239|282->241|282->241|282->241|284->243|285->244|288->247|288->247|288->247|289->248|290->249|291->250|296->255|296->255|296->255|297->256|298->257|298->257|298->257|299->258|299->258|299->258|300->259|300->259|300->259|301->260|301->260|301->260|301->260|301->260|301->260|302->261|302->261|302->261|303->262|303->262|303->262|303->262|303->262|303->262|304->263|305->264|306->265|307->266|308->267|309->268|322->281|322->281|322->281|323->282|324->283|324->283|324->283|325->284|325->284|325->284|326->285|326->285|326->285|327->286|327->286|327->286|327->286|327->286|327->286|328->287|328->287|328->287|329->288|329->288|329->288|329->288|329->288|329->288|330->289|331->290|332->291|333->292|334->293|335->294|348->307|348->307|348->307|349->308|350->309|350->309|350->309|351->310|351->310|351->310|352->311|352->311|352->311|353->312|353->312|353->312|353->312|353->312|354->313|354->313|354->313|355->314|355->314|355->314|355->314|355->314|356->315|357->316|358->317|359->318|360->319|361->320|371->330
                  -- GENERATED --
              */
          