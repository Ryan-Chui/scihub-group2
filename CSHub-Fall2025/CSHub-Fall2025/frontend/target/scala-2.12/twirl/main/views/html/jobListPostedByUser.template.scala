
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

object jobListPostedByUser extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template9[List[Job],Integer,Integer,Integer,Integer,Integer,Long,Integer,Integer,play.twirl.api.HtmlFormat.Appendable] {

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
                            My Posted Jobs
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
                            <td>"""),_display_(/*142.34*/entry/*142.39*/.getId()),format.raw/*142.47*/("""</td>


                            """),_display_(/*145.30*/if(entry.getTitle() != "")/*145.56*/ {_display_(Seq[Any](format.raw/*145.58*/("""
                                """),format.raw/*146.33*/("""<td>
                                    <a href = """"),_display_(/*147.49*/routes/*147.55*/.JobController.jobDetail(entry.getId())),format.raw/*147.94*/("""">"""),_display_(/*147.97*/entry/*147.102*/.getTitle()),format.raw/*147.113*/("""</a>
                                    <span class=""""),_display_(/*148.51*/entry/*148.56*/.getId()),format.raw/*148.64*/(""" """),format.raw/*148.65*/("""editable" data-name='title'></span>
                                </td>
                            """)))}/*150.31*/else/*150.36*/{_display_(Seq[Any](format.raw/*150.37*/("""
                                """),format.raw/*151.33*/("""<td><span class=""""),_display_(/*151.51*/entry/*151.56*/.getId()),format.raw/*151.64*/(""" """),format.raw/*151.65*/("""editable" data-name='title'>&ensp; -</span></td>
                            """)))}),format.raw/*152.30*/("""

                            """),_display_(/*154.30*/if(entry.getShortDescription() != "")/*154.67*/ {_display_(Seq[Any](format.raw/*154.69*/("""
                                """),format.raw/*155.33*/("""<td><span class=""""),_display_(/*155.51*/entry/*155.56*/.getId()),format.raw/*155.64*/(""" """),format.raw/*155.65*/("""editable" data-name='shortDescription'></span>

                                    """),_display_(/*157.38*/entry/*157.43*/.getShortDescription()),format.raw/*157.65*/("""
                                """),format.raw/*158.33*/("""</td>
                            """)))}/*159.31*/else/*159.36*/{_display_(Seq[Any](format.raw/*159.37*/("""
                                """),format.raw/*160.33*/("""<td><span class=""""),_display_(/*160.51*/entry/*160.56*/.getId()),format.raw/*160.64*/(""" """),format.raw/*160.65*/("""editable" data-name='shortDescription'>&ensp; -</span></td>
                            """)))}),format.raw/*161.30*/("""



                            """),_display_(/*165.30*/if(entry.getFields() != "")/*165.57*/ {_display_(Seq[Any](format.raw/*165.59*/("""
                                """),format.raw/*166.33*/("""<td><span class=""""),_display_(/*166.51*/entry/*166.56*/.getId()),format.raw/*166.64*/(""" """),format.raw/*166.65*/("""editable" data-name='fields'></span>

                                    """),_display_(/*168.38*/entry/*168.43*/.getFields()),format.raw/*168.55*/("""
                                """),format.raw/*169.33*/("""</td>
                            """)))}/*170.31*/else/*170.36*/{_display_(Seq[Any](format.raw/*170.37*/("""
                                """),format.raw/*171.33*/("""<td><span class=""""),_display_(/*171.51*/entry/*171.56*/.getId()),format.raw/*171.64*/(""" """),format.raw/*171.65*/("""editable" data-name='fields'>&ensp; -</span></td>
                            """)))}),format.raw/*172.30*/("""

"""),format.raw/*174.67*/("""
"""),format.raw/*175.41*/("""
"""),format.raw/*176.119*/("""
"""),format.raw/*177.42*/("""
"""),format.raw/*178.75*/("""
"""),format.raw/*179.41*/("""
"""),format.raw/*180.117*/("""
"""),format.raw/*181.42*/("""
"""),format.raw/*182.39*/("""
"""),format.raw/*183.41*/("""
"""),format.raw/*184.114*/("""
"""),format.raw/*185.42*/("""
"""),format.raw/*186.34*/("""
                            """),_display_(/*187.30*/if(entry.getStatus() == "closed")/*187.63*/ {_display_(Seq[Any](format.raw/*187.65*/("""
                                """),format.raw/*188.33*/("""<td>
                                    <span class="new badge grey darken-3" data-badge-caption="closed"></span>
                                </td>
                            """)))}/*191.31*/else/*191.35*/{_display_(Seq[Any](format.raw/*191.36*/("""
                            """),format.raw/*192.29*/("""<td>
                                <span class="new badge light-green darken-1" data-badge-caption="open"></span>
                            </td>
                            """)))}),format.raw/*195.30*/("""

                            """),_display_(/*197.30*/if(entry.getNumberOfApplicants()>0)/*197.65*/ {_display_(Seq[Any](format.raw/*197.67*/("""
                                """),format.raw/*198.33*/("""<td>
                                    <a class="waves-effect waves-light green darken-3 btn" href=""""),_display_(/*199.99*/routes/*199.105*/.JobController.jobApplicationsList("job", entry.getId(), 1, "")),format.raw/*199.168*/("""">view</a>
                                </td>
                            """)))}/*201.31*/else/*201.36*/{_display_(Seq[Any](format.raw/*201.37*/("""
                                """),format.raw/*202.33*/("""<td>
                                    <a class="btn disabled">view</a>
                                </td>
                            """)))}),format.raw/*205.30*/("""

                        """),format.raw/*207.25*/("""</tr>
                    """)))}),format.raw/*208.22*/("""
                    """),format.raw/*209.21*/("""</tbody>
                </table>

                <div class="row">
                    <div class="col s12">
                        <ul class="pagination center-align">
                                """),_display_(/*215.34*/if(pageNum == 1)/*215.50*/ {_display_(Seq[Any](format.raw/*215.52*/("""
                                    """),format.raw/*216.37*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                        first_page</i></li>
                                    <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                        chevron_left</i></li>
                                """)))}/*220.35*/else/*220.40*/{_display_(Seq[Any](format.raw/*220.41*/("""
                                    """),format.raw/*221.37*/("""<li class="waves-effect"><a href=""""),_display_(/*221.72*/routes/*221.78*/.JobController.jobListPostedByUser(1)),format.raw/*221.115*/(""""><i class="material-icons">
                                        first_page</i></a></li>
                                    <li class="waves-effect"><a href=""""),_display_(/*223.72*/routes/*223.78*/.JobController.jobListPostedByUser(pageNum - 1)),format.raw/*223.125*/(""""><i class="material-icons">
                                        chevron_left</i></a></li>
                                """)))}),format.raw/*225.34*/("""
                                """),_display_(/*226.34*/if(beginIndexForPagination > 1)/*226.65*/ {_display_(Seq[Any](format.raw/*226.67*/("""
                                    """),format.raw/*227.37*/("""<li class="waves-effect modal-trigger" href="#allPageModal" style="cursor: pointer;
                                        font-size: 20px;
                                        font-weight: bold">...</li>
                                """)))}),format.raw/*230.34*/("""
                                """),_display_(/*231.34*/for(i <- (beginIndexForPagination + 0) to (endIndexForPagination + 0)) yield /*231.104*/ {_display_(Seq[Any](format.raw/*231.106*/("""
                                    """),format.raw/*232.37*/("""<li """),_display_(/*232.42*/if(pageNum == i)/*232.58*/ {_display_(Seq[Any](format.raw/*232.60*/("""
                                        """),format.raw/*233.41*/("""class="active"""")))}),format.raw/*233.56*/("""><a href=""""),_display_(/*233.67*/routes/*233.73*/.JobController.jobListPostedByUser(i)),format.raw/*233.110*/("""">"""),_display_(/*233.113*/i),format.raw/*233.114*/("""</a></li>
                                """)))}),format.raw/*234.34*/("""
                                """),_display_(/*235.34*/if(endIndexForPagination < ((total - 1) / pageLimit + 1))/*235.91*/ {_display_(Seq[Any](format.raw/*235.93*/("""
                                    """),format.raw/*236.37*/("""<li class="waves-effect modal-trigger" href="#allPageModal" style="cursor: pointer;
                                        font-size: 20px;
                                        font-weight: bold">...</li>
                                """)))}),format.raw/*239.34*/("""
                                """),_display_(/*240.34*/if((offset + count) >= total)/*240.63*/ {_display_(Seq[Any](format.raw/*240.65*/("""
                                    """),format.raw/*241.37*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                        chevron_right</i></li>
                                    <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                        last_page</i></li>
                                """)))}/*245.35*/else/*245.40*/{_display_(Seq[Any](format.raw/*245.41*/("""
                                    """),format.raw/*246.37*/("""<li class="waves-effect"><a href=""""),_display_(/*246.72*/routes/*246.78*/.JobController.jobListPostedByUser(pageNum + 1)),format.raw/*246.125*/(""""><i class="material-icons">
                                        chevron_right</i></a></li>
                                    <li class="waves-effect"><a href=""""),_display_(/*248.72*/routes/*248.78*/.JobController.jobListPostedByUser((total - 1) / pageLimit + 1)),format.raw/*248.141*/(""""><i class="material-icons">
                                        last_page</i></a></li>
                                """)))}),format.raw/*250.34*/("""
                        """),format.raw/*251.25*/("""</ul>
                    </div>
                </div>
            """)))}/*254.15*/else/*254.20*/{_display_(Seq[Any](format.raw/*254.21*/("""
                """),format.raw/*255.17*/("""<h5>No jobs registered yet.</h5>
            """)))}),format.raw/*256.14*/("""
            """),format.raw/*257.13*/("""<div id="allPageModal" class="modal">
                <div class="modal-content">
                    <h6>Select the page number you want to jump to</h6>
                    <div class="card z-depth-0">

                    """),_display_(/*262.22*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*262.79*/ {_display_(Seq[Any](format.raw/*262.81*/("""
                        """),format.raw/*263.25*/("""<ul class="pagination center-align">
                        """),_display_(/*264.26*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*264.65*/ {_display_(Seq[Any](format.raw/*264.67*/("""
                            """),_display_(/*265.30*/if(j <= ((total - 1)/(pageLimit) + 1))/*265.68*/ {_display_(Seq[Any](format.raw/*265.70*/("""
                                """),_display_(/*266.34*/if(j != pageNum)/*266.50*/ {_display_(Seq[Any](format.raw/*266.52*/("""
                                    """),format.raw/*267.37*/("""<li class="waves-effect grey lighten-3"><a href='"""),_display_(/*267.87*/routes/*267.93*/.JobController.jobListPostedByUser(j)),format.raw/*267.130*/("""'>"""),_display_(/*267.133*/j),format.raw/*267.134*/("""</a></li>
                                """)))}/*268.34*/else/*268.38*/{_display_(Seq[Any](format.raw/*268.39*/("""
                                    """),format.raw/*269.37*/("""<li class="waves-effect active"><a href=""""),_display_(/*269.79*/routes/*269.85*/.JobController.jobListPostedByUser(j)),format.raw/*269.122*/("""">"""),_display_(/*269.125*/j),format.raw/*269.126*/("""</a></li>
                                """)))}),format.raw/*270.34*/("""
                            """)))}),format.raw/*271.30*/("""
                        """)))}),format.raw/*272.26*/("""
                        """),format.raw/*273.25*/("""</ul>
                    """)))}),format.raw/*274.22*/("""
                    """),format.raw/*275.21*/("""</div>
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

                    """),_display_(/*288.22*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*288.79*/ {_display_(Seq[Any](format.raw/*288.81*/("""
                        """),format.raw/*289.25*/("""<ul class="pagination center-align">
                        """),_display_(/*290.26*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*290.65*/ {_display_(Seq[Any](format.raw/*290.67*/("""
                            """),_display_(/*291.30*/if(j <= ((total - 1)/(pageLimit) + 1))/*291.68*/ {_display_(Seq[Any](format.raw/*291.70*/("""
                                """),_display_(/*292.34*/if(j != pageNum)/*292.50*/ {_display_(Seq[Any](format.raw/*292.52*/("""
                                    """),format.raw/*293.37*/("""<li class="waves-effect grey lighten-3"><a href='"""),_display_(/*293.87*/routes/*293.93*/.ProjectController.getMyEnrolledProjects(j, "")),format.raw/*293.140*/("""'>"""),_display_(/*293.143*/j),format.raw/*293.144*/("""</a></li>
                                """)))}/*294.34*/else/*294.38*/{_display_(Seq[Any](format.raw/*294.39*/("""
                                    """),format.raw/*295.37*/("""<li class="waves-effect active"><a href=""""),_display_(/*295.79*/routes/*295.85*/.ProjectController.getMyEnrolledProjects(j, "")),format.raw/*295.132*/("""">"""),_display_(/*295.135*/j),format.raw/*295.136*/("""</a></li>
                                """)))}),format.raw/*296.34*/("""
                            """)))}),format.raw/*297.30*/("""
                        """)))}),format.raw/*298.26*/("""
                        """),format.raw/*299.25*/("""</ul>
                    """)))}),format.raw/*300.22*/("""
                    """),format.raw/*301.21*/("""</div>
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

                    """),_display_(/*314.22*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*314.79*/ {_display_(Seq[Any](format.raw/*314.81*/("""
                        """),format.raw/*315.25*/("""<ul class="pagination center-align">
                        """),_display_(/*316.26*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*316.65*/ {_display_(Seq[Any](format.raw/*316.67*/("""
                            """),_display_(/*317.30*/if(j <= ((total - 1)/(pageLimit) + 1))/*317.68*/ {_display_(Seq[Any](format.raw/*317.70*/("""
                                """),_display_(/*318.34*/if(j != pageNum)/*318.50*/ {_display_(Seq[Any](format.raw/*318.52*/("""
                                    """),format.raw/*319.37*/("""<li class="waves-effect grey lighten-3"><a href='#!' onclick="jumpToPage("""),_display_(/*319.111*/j),format.raw/*319.112*/(""")">"""),_display_(/*319.116*/j),format.raw/*319.117*/("""</a></li>
                                """)))}/*320.34*/else/*320.38*/{_display_(Seq[Any](format.raw/*320.39*/("""
                                    """),format.raw/*321.37*/("""<li class="waves-effect active"><a href="#!" onclick="jumpToPage("""),_display_(/*321.103*/j),format.raw/*321.104*/(""")">"""),_display_(/*321.108*/j),format.raw/*321.109*/("""</a></li>
                                """)))}),format.raw/*322.34*/("""
                            """)))}),format.raw/*323.30*/("""
                        """)))}),format.raw/*324.26*/("""
                        """),format.raw/*325.25*/("""</ul>
                    """)))}),format.raw/*326.22*/("""
                    """),format.raw/*327.21*/("""</div>
                </div>
                <div class="modal-footer">
                    <a href="#!" class="modal-close waves-effect waves-green btn-flat">
                        Cancel</a>
                </div>
            </div>

        </div>
    </div>
""")))}),format.raw/*337.2*/("""

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
                  DATE: Fri Apr 24 12:50:33 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/jobListPostedByUser.scala.html
                  HASH: b9616dfeb37bad17e92c6d09e96a0a76ecd879ac
                  MATRIX: 1189->1|1490->231|1514->249|1538->266|1569->286|1584->293|1665->297|1697->302|1754->332|1769->338|1828->376|1947->467|1976->468|2021->485|2092->529|2135->556|2175->558|2220->575|2259->586|2288->587|2317->588|2374->618|2387->622|2423->637|2540->727|2553->731|2590->747|2792->918|2837->935|3129->1199|3158->1200|3231->1245|3260->1246|3306->1264|3979->1909|4008->1910|4050->1924|4103->1949|4132->1950|4178->1968|4407->2169|4436->2170|4485->2191|4615->2293|4644->2294|4673->2295|5106->2700|5135->2701|5188->2726|5341->2851|5370->2852|5419->2873|5553->2979|5582->2980|5628->2998|5680->3022|5709->3023|5742->3029|5816->3075|5845->3076|5890->3093|6035->3210|6064->3211|6096->3216|6145->229|6173->284|6201->3226|6230->3229|6270->3260|6310->3262|6342->3267|6895->3792|6924->3811|6965->3813|7011->3830|7547->4338|7635->4404|7665->4405|7697->4409|7789->4479|7819->4480|7851->4484|7878->4489|8738->5321|8795->5361|8836->5363|8890->5388|8956->5426|8971->5431|9001->5439|9066->5476|9102->5502|9143->5504|9205->5537|9286->5590|9302->5596|9363->5635|9394->5638|9410->5643|9444->5654|9527->5709|9542->5714|9572->5722|9602->5723|9725->5827|9739->5832|9779->5833|9841->5866|9887->5884|9902->5889|9932->5897|9962->5898|10072->5976|10131->6007|10178->6044|10219->6046|10281->6079|10327->6097|10342->6102|10372->6110|10402->6111|10515->6196|10530->6201|10574->6223|10636->6256|10691->6292|10705->6297|10745->6298|10807->6331|10853->6349|10868->6354|10898->6362|10928->6363|11049->6452|11110->6485|11147->6512|11188->6514|11250->6547|11296->6565|11311->6570|11341->6578|11371->6579|11474->6654|11489->6659|11523->6671|11585->6704|11640->6740|11654->6745|11694->6746|11756->6779|11802->6797|11817->6802|11847->6810|11877->6811|11988->6890|12019->6958|12049->6999|12080->7118|12110->7160|12140->7235|12170->7276|12201->7393|12231->7435|12261->7474|12291->7515|12322->7629|12352->7671|12382->7705|12440->7735|12483->7768|12524->7770|12586->7803|12788->7986|12802->7990|12842->7991|12900->8020|13111->8199|13170->8230|13215->8265|13256->8267|13318->8300|13449->8403|13466->8409|13552->8472|13650->8551|13664->8556|13704->8557|13766->8590|13939->8731|13994->8757|14053->8784|14103->8805|14336->9010|14362->9026|14403->9028|14469->9065|14850->9427|14864->9432|14904->9433|14970->9470|15033->9505|15049->9511|15109->9548|15301->9712|15317->9718|15387->9765|15547->9893|15609->9927|15650->9958|15691->9960|15757->9997|16031->10239|16093->10273|16181->10343|16223->10345|16289->10382|16322->10387|16348->10403|16389->10405|16459->10446|16506->10461|16545->10472|16561->10478|16621->10515|16653->10518|16677->10519|16752->10562|16814->10596|16881->10653|16922->10655|16988->10692|17262->10934|17324->10968|17363->10997|17404->10999|17470->11036|17851->11398|17865->11403|17905->11404|17971->11441|18034->11476|18050->11482|18120->11529|18315->11696|18331->11702|18417->11765|18574->11890|18628->11915|18717->11985|18731->11990|18771->11991|18817->12008|18895->12054|18937->12067|19190->12292|19264->12349|19305->12351|19359->12376|19449->12438|19505->12477|19546->12479|19604->12509|19652->12547|19693->12549|19755->12583|19781->12599|19822->12601|19888->12638|19966->12688|19982->12694|20042->12731|20074->12734|20098->12735|20161->12778|20175->12782|20215->12783|20281->12820|20351->12862|20367->12868|20427->12905|20459->12908|20483->12909|20558->12952|20620->12982|20678->13008|20732->13033|20791->13060|20841->13081|21348->13560|21422->13617|21463->13619|21517->13644|21607->13706|21663->13745|21704->13747|21762->13777|21810->13815|21851->13817|21913->13851|21939->13867|21980->13869|22046->13906|22124->13956|22140->13962|22210->14009|22242->14012|22266->14013|22329->14056|22343->14060|22383->14061|22449->14098|22519->14140|22535->14146|22605->14193|22637->14196|22661->14197|22736->14240|22798->14270|22856->14296|22910->14321|22969->14348|23019->14369|23526->14848|23600->14905|23641->14907|23695->14932|23785->14994|23841->15033|23882->15035|23940->15065|23988->15103|24029->15105|24091->15139|24117->15155|24158->15157|24224->15194|24327->15268|24351->15269|24384->15273|24408->15274|24471->15317|24485->15321|24525->15322|24591->15359|24686->15425|24710->15426|24743->15430|24767->15431|24842->15474|24904->15504|24962->15530|25016->15555|25075->15582|25125->15603|25422->15869
                  LINES: 35->1|44->8|45->9|46->10|48->12|48->12|50->12|51->13|51->13|51->13|51->13|54->16|54->16|55->17|56->18|56->18|56->18|57->19|57->19|57->19|57->19|58->20|58->20|58->20|61->23|61->23|61->23|64->26|65->27|73->35|73->35|75->37|75->37|77->39|94->56|94->56|96->58|96->58|96->58|98->60|101->63|101->63|102->64|103->65|103->65|103->65|111->73|111->73|112->74|114->76|114->76|115->77|117->79|117->79|119->81|120->82|120->82|122->84|124->86|124->86|125->87|128->90|128->90|129->91|131->7|132->11|133->92|135->94|135->94|135->94|136->95|147->106|147->106|147->106|148->107|160->119|162->121|162->121|162->121|164->123|164->123|164->123|164->123|181->140|181->140|181->140|182->141|183->142|183->142|183->142|186->145|186->145|186->145|187->146|188->147|188->147|188->147|188->147|188->147|188->147|189->148|189->148|189->148|189->148|191->150|191->150|191->150|192->151|192->151|192->151|192->151|192->151|193->152|195->154|195->154|195->154|196->155|196->155|196->155|196->155|196->155|198->157|198->157|198->157|199->158|200->159|200->159|200->159|201->160|201->160|201->160|201->160|201->160|202->161|206->165|206->165|206->165|207->166|207->166|207->166|207->166|207->166|209->168|209->168|209->168|210->169|211->170|211->170|211->170|212->171|212->171|212->171|212->171|212->171|213->172|215->174|216->175|217->176|218->177|219->178|220->179|221->180|222->181|223->182|224->183|225->184|226->185|227->186|228->187|228->187|228->187|229->188|232->191|232->191|232->191|233->192|236->195|238->197|238->197|238->197|239->198|240->199|240->199|240->199|242->201|242->201|242->201|243->202|246->205|248->207|249->208|250->209|256->215|256->215|256->215|257->216|261->220|261->220|261->220|262->221|262->221|262->221|262->221|264->223|264->223|264->223|266->225|267->226|267->226|267->226|268->227|271->230|272->231|272->231|272->231|273->232|273->232|273->232|273->232|274->233|274->233|274->233|274->233|274->233|274->233|274->233|275->234|276->235|276->235|276->235|277->236|280->239|281->240|281->240|281->240|282->241|286->245|286->245|286->245|287->246|287->246|287->246|287->246|289->248|289->248|289->248|291->250|292->251|295->254|295->254|295->254|296->255|297->256|298->257|303->262|303->262|303->262|304->263|305->264|305->264|305->264|306->265|306->265|306->265|307->266|307->266|307->266|308->267|308->267|308->267|308->267|308->267|308->267|309->268|309->268|309->268|310->269|310->269|310->269|310->269|310->269|310->269|311->270|312->271|313->272|314->273|315->274|316->275|329->288|329->288|329->288|330->289|331->290|331->290|331->290|332->291|332->291|332->291|333->292|333->292|333->292|334->293|334->293|334->293|334->293|334->293|334->293|335->294|335->294|335->294|336->295|336->295|336->295|336->295|336->295|336->295|337->296|338->297|339->298|340->299|341->300|342->301|355->314|355->314|355->314|356->315|357->316|357->316|357->316|358->317|358->317|358->317|359->318|359->318|359->318|360->319|360->319|360->319|360->319|360->319|361->320|361->320|361->320|362->321|362->321|362->321|362->321|362->321|363->322|364->323|365->324|366->325|367->326|368->327|378->337
                  -- GENERATED --
              */
          