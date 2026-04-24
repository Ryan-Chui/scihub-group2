
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

object tajobListPostedByUser extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template9[List[TAJob],Integer,Integer,Integer,Integer,Integer,Long,Integer,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(tajobs: List[TAJob],
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
/*10.2*/import models.TAJob

def /*12.2*/scripts/*12.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*12.13*/("""
    """),format.raw/*13.5*/("""<script type = "module" src='"""),_display_(/*13.35*/routes/*13.41*/.Assets.at("javascripts/voiceJump.js")),format.raw/*13.79*/("""'></script>
    <script type="text/javascript">

            $(document).ready(function () """),format.raw/*16.43*/("""{"""),format.raw/*16.44*/("""
                """),format.raw/*17.17*/("""var technologiesArray = []
                """),_display_(/*18.18*/for(i <- 0 until tajobs.size) yield /*18.47*/ {_display_(Seq[Any](format.raw/*18.49*/("""
                """),format.raw/*19.17*/("""var json = """),format.raw/*19.28*/("""{"""),format.raw/*19.29*/("""}"""),format.raw/*19.30*/(""";
                json.id = '"""),_display_(/*20.29*/tajobs/*20.35*/.get(i).getId()),format.raw/*20.50*/("""';
                json.url = "/job/jobDetail/" + json.id;

                json.name = '"""),_display_(/*23.31*/tajobs/*23.37*/.get(i).getTitle),format.raw/*23.53*/("""'.replace(/[^a-zA-Z0-9]/g, " ").replace(/  +/g, " ").trim();
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

"""),_display_(/*94.2*/main("My Posted TAJobs", scripts)/*94.35*/ {_display_(Seq[Any](format.raw/*94.37*/("""
    """),format.raw/*95.5*/("""<div class="container">
        <div class="card-panel center">
            <div class="row card-panel z-depth-0 project-zone-panel">
                <div class="col s12" style="margin-top: -10px;
                    margin-bottom: -10px;">
                    <h6 class="center tooltipped" data-position="bottom" data-tooltip="This list shows the my posted job lists." >
                        My Posted TAJobs
                    </h6>
                </div>
            </div>

            """),_display_(/*106.14*/if(tajobs.size() > 0)/*106.35*/ {_display_(Seq[Any](format.raw/*106.37*/("""
                """),format.raw/*107.17*/("""<div class="col s8 offset-s2">
                    <h4>TAJob List</h4>

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
                            <th style="cursor: pointer;">TAJob Id</th>
                            <th style="cursor: pointer;">Title</th>
                            <th style="cursor: pointer;">Short Description</th>
                            <th style="cursor: pointer;">Fields</th>
                            <th style="cursor: pointer;">Status</th>
                            <th style="cursor: pointer;">View Applications</th>

                        </tr>
                    </thead>
                    <tbody>
                    """),_display_(/*140.22*/for((entry, index) <- tajobs.zipWithIndex) yield /*140.64*/ {_display_(Seq[Any](format.raw/*140.66*/("""
                        """),format.raw/*141.25*/("""<tr>
                            <td><a href = """"),_display_(/*142.45*/routes/*142.51*/.TAJobController.tajobDetail(entry.getId())),format.raw/*142.94*/("""">"""),_display_(/*142.97*/entry/*142.102*/.getId()),format.raw/*142.110*/("""</a></td>


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

                            """),_display_(/*187.30*/if(entry.getNumberOfApplicants()>0)/*187.65*/ {_display_(Seq[Any](format.raw/*187.67*/("""
                                """),format.raw/*188.33*/("""<td>
                                    <a class="waves-effect waves-light green darken-3 btn" href=""""),_display_(/*189.99*/routes/*189.105*/.JobController.jobApplicationsList("tajob", entry.getId(), 1, "")),format.raw/*189.170*/("""">view</a>
                                </td>
                            """)))}/*191.31*/else/*191.36*/{_display_(Seq[Any](format.raw/*191.37*/("""
                                """),format.raw/*192.33*/("""<td>
                                    <a class="btn disabled">view</a>
                                </td>
                            """)))}),format.raw/*195.30*/("""

                        """),format.raw/*197.25*/("""</tr>
                    """)))}),format.raw/*198.22*/("""
                    """),format.raw/*199.21*/("""</tbody>
                </table>

                <div class="row">
                    <div class="col s12">
                        <ul class="pagination center-align">
                            """),_display_(/*205.30*/if(pageNum == 1)/*205.46*/ {_display_(Seq[Any](format.raw/*205.48*/("""
                                """),format.raw/*206.33*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    first_page</i></li>
                                <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    chevron_left</i></li>
                            """)))}/*210.31*/else/*210.36*/{_display_(Seq[Any](format.raw/*210.37*/("""
                                """),format.raw/*211.33*/("""<li class="waves-effect"><a href=""""),_display_(/*211.68*/routes/*211.74*/.TAJobController.tajobListPostedByUser(1)),format.raw/*211.115*/(""""><i class="material-icons">
                                    first_page</i></a></li>
                                <li class="waves-effect"><a href=""""),_display_(/*213.68*/routes/*213.74*/.TAJobController.tajobListPostedByUser(pageNum - 1)),format.raw/*213.125*/(""""><i class="material-icons">
                                    chevron_left</i></a></li>
                            """)))}),format.raw/*215.30*/("""
                            """),_display_(/*216.30*/if(beginIndexForPagination > 1)/*216.61*/ {_display_(Seq[Any](format.raw/*216.63*/("""
                                """),format.raw/*217.33*/("""<li class="waves-effect modal-trigger" href="#allPageModal" style="cursor: pointer;
                                    font-size: 20px;
                                    font-weight: bold">...</li>
                            """)))}),format.raw/*220.30*/("""
                            """),_display_(/*221.30*/for(i <- (beginIndexForPagination + 0) to (endIndexForPagination + 0)) yield /*221.100*/ {_display_(Seq[Any](format.raw/*221.102*/("""
                                """),format.raw/*222.33*/("""<li """),_display_(/*222.38*/if(pageNum == i)/*222.54*/ {_display_(Seq[Any](format.raw/*222.56*/("""
                                    """),format.raw/*223.37*/("""class="active"""")))}),format.raw/*223.52*/("""><a href=""""),_display_(/*223.63*/routes/*223.69*/.TAJobController.tajobListPostedByUser(i)),format.raw/*223.110*/("""">"""),_display_(/*223.113*/i),format.raw/*223.114*/("""</a></li>
                            """)))}),format.raw/*224.30*/("""
                            """),_display_(/*225.30*/if(endIndexForPagination < ((total - 1) / pageLimit + 1))/*225.87*/ {_display_(Seq[Any](format.raw/*225.89*/("""
                                """),format.raw/*226.33*/("""<li class="waves-effect modal-trigger" href="#allPageModal" style="cursor: pointer;
                                    font-size: 20px;
                                    font-weight: bold">...</li>
                            """)))}),format.raw/*229.30*/("""
                            """),_display_(/*230.30*/if((offset + count) >= total)/*230.59*/ {_display_(Seq[Any](format.raw/*230.61*/("""
                                """),format.raw/*231.33*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    chevron_right</i></li>
                                <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    last_page</i></li>
                            """)))}/*235.31*/else/*235.36*/{_display_(Seq[Any](format.raw/*235.37*/("""
                                """),format.raw/*236.33*/("""<li class="waves-effect"><a href=""""),_display_(/*236.68*/routes/*236.74*/.TAJobController.tajobListPostedByUser(pageNum + 1)),format.raw/*236.125*/(""""><i class="material-icons">
                                    chevron_right</i></a></li>
                                <li class="waves-effect"><a href=""""),_display_(/*238.68*/routes/*238.74*/.TAJobController.tajobListPostedByUser((total - 1) / pageLimit + 1)),format.raw/*238.141*/(""""><i class="material-icons">
                                    last_page</i></a></li>
                            """)))}),format.raw/*240.30*/("""
                        """),format.raw/*241.25*/("""</ul>
                    </div>
                </div>
            """)))}/*244.15*/else/*244.20*/{_display_(Seq[Any](format.raw/*244.21*/("""
                """),format.raw/*245.17*/("""<h5>No tajobs registered yet.</h5>
            """)))}),format.raw/*246.14*/("""
            """),format.raw/*247.13*/("""<div id="allPageModal" class="modal">
                <div class="modal-content">
                    <h6>Select the page number you want to jump to</h6>
                    <div class="card z-depth-0">

                    """),_display_(/*252.22*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*252.79*/ {_display_(Seq[Any](format.raw/*252.81*/("""
                        """),format.raw/*253.25*/("""<ul class="pagination center-align">
                        """),_display_(/*254.26*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*254.65*/ {_display_(Seq[Any](format.raw/*254.67*/("""
                            """),_display_(/*255.30*/if(j <= ((total - 1)/(pageLimit) + 1))/*255.68*/ {_display_(Seq[Any](format.raw/*255.70*/("""
                                """),_display_(/*256.34*/if(j != pageNum)/*256.50*/ {_display_(Seq[Any](format.raw/*256.52*/("""
                                    """),format.raw/*257.37*/("""<li class="waves-effect grey lighten-3"><a href='"""),_display_(/*257.87*/routes/*257.93*/.TAJobController.tajobListPostedByUser(j)),format.raw/*257.134*/("""'>"""),_display_(/*257.137*/j),format.raw/*257.138*/("""</a></li>
                                """)))}/*258.34*/else/*258.38*/{_display_(Seq[Any](format.raw/*258.39*/("""
                                    """),format.raw/*259.37*/("""<li class="waves-effect active"><a href=""""),_display_(/*259.79*/routes/*259.85*/.TAJobController.tajobListPostedByUser(j)),format.raw/*259.126*/("""">"""),_display_(/*259.129*/j),format.raw/*259.130*/("""</a></li>
                                """)))}),format.raw/*260.34*/("""
                            """)))}),format.raw/*261.30*/("""
                        """)))}),format.raw/*262.26*/("""
                        """),format.raw/*263.25*/("""</ul>
                    """)))}),format.raw/*264.22*/("""
                    """),format.raw/*265.21*/("""</div>
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

                    """),_display_(/*278.22*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*278.79*/ {_display_(Seq[Any](format.raw/*278.81*/("""
                        """),format.raw/*279.25*/("""<ul class="pagination center-align">
                        """),_display_(/*280.26*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*280.65*/ {_display_(Seq[Any](format.raw/*280.67*/("""
                            """),_display_(/*281.30*/if(j <= ((total - 1)/(pageLimit) + 1))/*281.68*/ {_display_(Seq[Any](format.raw/*281.70*/("""
                                """),_display_(/*282.34*/if(j != pageNum)/*282.50*/ {_display_(Seq[Any](format.raw/*282.52*/("""
                                    """),format.raw/*283.37*/("""<li class="waves-effect grey lighten-3"><a href='"""),_display_(/*283.87*/routes/*283.93*/.ProjectController.getMyEnrolledProjects(j, "")),format.raw/*283.140*/("""'>"""),_display_(/*283.143*/j),format.raw/*283.144*/("""</a></li>
                                """)))}/*284.34*/else/*284.38*/{_display_(Seq[Any](format.raw/*284.39*/("""
                                    """),format.raw/*285.37*/("""<li class="waves-effect active"><a href=""""),_display_(/*285.79*/routes/*285.85*/.ProjectController.getMyEnrolledProjects(j, "")),format.raw/*285.132*/("""">"""),_display_(/*285.135*/j),format.raw/*285.136*/("""</a></li>
                                """)))}),format.raw/*286.34*/("""
                            """)))}),format.raw/*287.30*/("""
                        """)))}),format.raw/*288.26*/("""
                        """),format.raw/*289.25*/("""</ul>
                    """)))}),format.raw/*290.22*/("""
                    """),format.raw/*291.21*/("""</div>
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

                    """),_display_(/*304.22*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*304.79*/ {_display_(Seq[Any](format.raw/*304.81*/("""
                        """),format.raw/*305.25*/("""<ul class="pagination center-align">
                        """),_display_(/*306.26*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*306.65*/ {_display_(Seq[Any](format.raw/*306.67*/("""
                            """),_display_(/*307.30*/if(j <= ((total - 1)/(pageLimit) + 1))/*307.68*/ {_display_(Seq[Any](format.raw/*307.70*/("""
                                """),_display_(/*308.34*/if(j != pageNum)/*308.50*/ {_display_(Seq[Any](format.raw/*308.52*/("""
                                    """),format.raw/*309.37*/("""<li class="waves-effect grey lighten-3"><a href='#!' onclick="jumpToPage("""),_display_(/*309.111*/j),format.raw/*309.112*/(""")">"""),_display_(/*309.116*/j),format.raw/*309.117*/("""</a></li>
                                """)))}/*310.34*/else/*310.38*/{_display_(Seq[Any](format.raw/*310.39*/("""
                                    """),format.raw/*311.37*/("""<li class="waves-effect active"><a href="#!" onclick="jumpToPage("""),_display_(/*311.103*/j),format.raw/*311.104*/(""")">"""),_display_(/*311.108*/j),format.raw/*311.109*/("""</a></li>
                                """)))}),format.raw/*312.34*/("""
                            """)))}),format.raw/*313.30*/("""
                        """)))}),format.raw/*314.26*/("""
                        """),format.raw/*315.25*/("""</ul>
                    """)))}),format.raw/*316.22*/("""
                    """),format.raw/*317.21*/("""</div>
                </div>
                <div class="modal-footer">
                    <a href="#!" class="modal-close waves-effect waves-green btn-flat">
                        Cancel</a>
                </div>
            </div>

        </div>
    </div>
""")))}),format.raw/*327.2*/("""

"""))
      }
    }
  }

  def render(tajobs:List[TAJob],pageNum:Integer,offset:Integer,total:Integer,count:Integer,pageLimit:Integer,id:Long,beginIndexForPagination:Integer,endIndexForPagination:Integer): play.twirl.api.HtmlFormat.Appendable = apply(tajobs,pageNum,offset,total,count,pageLimit,id,beginIndexForPagination,endIndexForPagination)

  def f:((List[TAJob],Integer,Integer,Integer,Integer,Integer,Long,Integer,Integer) => play.twirl.api.HtmlFormat.Appendable) = (tajobs,pageNum,offset,total,count,pageLimit,id,beginIndexForPagination,endIndexForPagination) => apply(tajobs,pageNum,offset,total,count,pageLimit,id,beginIndexForPagination,endIndexForPagination)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:38 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/tajobListPostedByUser.scala.html
                  HASH: 6c65ec8059d492333cb11efb0e5fb02c604bd348
                  MATRIX: 1193->1|1498->235|1522->253|1546->270|1579->292|1594->299|1675->303|1707->308|1764->338|1779->344|1838->382|1957->473|1986->474|2031->491|2102->535|2147->564|2187->566|2232->583|2271->594|2300->595|2329->596|2386->626|2401->632|2437->647|2554->737|2569->743|2606->759|2808->930|2853->947|3145->1211|3174->1212|3247->1257|3276->1258|3322->1276|3995->1921|4024->1922|4066->1936|4119->1961|4148->1962|4194->1980|4423->2181|4452->2182|4501->2203|4631->2305|4660->2306|4689->2307|5122->2712|5151->2713|5204->2738|5357->2863|5386->2864|5435->2885|5569->2991|5598->2992|5644->3010|5696->3034|5725->3035|5758->3041|5832->3087|5861->3088|5906->3105|6051->3222|6080->3223|6112->3228|6161->233|6189->290|6217->3238|6246->3241|6288->3274|6328->3276|6360->3281|6883->3776|6914->3797|6955->3799|7001->3816|7539->4326|7627->4392|7657->4393|7689->4397|7781->4467|7811->4468|7843->4472|7870->4477|8732->5311|8791->5353|8832->5355|8886->5380|8963->5429|8979->5435|9044->5478|9075->5481|9091->5486|9122->5494|9191->5535|9227->5561|9268->5563|9330->5596|9376->5614|9391->5619|9421->5627|9451->5628|9552->5701|9567->5706|9600->5717|9662->5750|9717->5786|9731->5791|9771->5792|9833->5825|9879->5843|9894->5848|9924->5856|9954->5857|10064->5935|10123->5966|10170->6003|10211->6005|10273->6038|10319->6056|10334->6061|10364->6069|10394->6070|10507->6155|10522->6160|10566->6182|10628->6215|10683->6251|10697->6256|10737->6257|10799->6290|10845->6308|10860->6313|10890->6321|10920->6322|11041->6411|11102->6444|11139->6471|11180->6473|11242->6506|11288->6524|11303->6529|11333->6537|11363->6538|11466->6613|11481->6618|11515->6630|11577->6663|11632->6699|11646->6704|11686->6705|11748->6738|11794->6756|11809->6761|11839->6769|11869->6770|11980->6849|12039->6880|12080->6911|12121->6913|12183->6946|12390->7134|12439->7173|12479->7174|12537->7203|12734->7380|12748->7384|12788->7385|12846->7414|13052->7588|13111->7619|13156->7654|13197->7656|13259->7689|13390->7792|13407->7798|13495->7863|13593->7942|13607->7947|13647->7948|13709->7981|13882->8122|13937->8148|13996->8175|14046->8196|14275->8397|14301->8413|14342->8415|14404->8448|14769->8794|14783->8799|14823->8800|14885->8833|14948->8868|14964->8874|15028->8915|15212->9071|15228->9077|15302->9128|15454->9248|15512->9278|15553->9309|15594->9311|15656->9344|15918->9574|15976->9604|16064->9674|16106->9676|16168->9709|16201->9714|16227->9730|16268->9732|16334->9769|16381->9784|16420->9795|16436->9801|16500->9842|16532->9845|16556->9846|16627->9885|16685->9915|16752->9972|16793->9974|16855->10007|17117->10237|17175->10267|17214->10296|17255->10298|17317->10331|17682->10677|17696->10682|17736->10683|17798->10716|17861->10751|17877->10757|17951->10808|18138->10967|18154->10973|18244->11040|18393->11157|18447->11182|18536->11252|18550->11257|18590->11258|18636->11275|18716->11323|18758->11336|19011->11561|19085->11618|19126->11620|19180->11645|19270->11707|19326->11746|19367->11748|19425->11778|19473->11816|19514->11818|19576->11852|19602->11868|19643->11870|19709->11907|19787->11957|19803->11963|19867->12004|19899->12007|19923->12008|19986->12051|20000->12055|20040->12056|20106->12093|20176->12135|20192->12141|20256->12182|20288->12185|20312->12186|20387->12229|20449->12259|20507->12285|20561->12310|20620->12337|20670->12358|21177->12837|21251->12894|21292->12896|21346->12921|21436->12983|21492->13022|21533->13024|21591->13054|21639->13092|21680->13094|21742->13128|21768->13144|21809->13146|21875->13183|21953->13233|21969->13239|22039->13286|22071->13289|22095->13290|22158->13333|22172->13337|22212->13338|22278->13375|22348->13417|22364->13423|22434->13470|22466->13473|22490->13474|22565->13517|22627->13547|22685->13573|22739->13598|22798->13625|22848->13646|23355->14125|23429->14182|23470->14184|23524->14209|23614->14271|23670->14310|23711->14312|23769->14342|23817->14380|23858->14382|23920->14416|23946->14432|23987->14434|24053->14471|24156->14545|24180->14546|24213->14550|24237->14551|24300->14594|24314->14598|24354->14599|24420->14636|24515->14702|24539->14703|24572->14707|24596->14708|24671->14751|24733->14781|24791->14807|24845->14832|24904->14859|24954->14880|25251->15146
                  LINES: 35->1|44->8|45->9|46->10|48->12|48->12|50->12|51->13|51->13|51->13|51->13|54->16|54->16|55->17|56->18|56->18|56->18|57->19|57->19|57->19|57->19|58->20|58->20|58->20|61->23|61->23|61->23|64->26|65->27|73->35|73->35|75->37|75->37|77->39|94->56|94->56|96->58|96->58|96->58|98->60|101->63|101->63|102->64|103->65|103->65|103->65|111->73|111->73|112->74|114->76|114->76|115->77|117->79|117->79|119->81|120->82|120->82|122->84|124->86|124->86|125->87|128->90|128->90|129->91|131->7|132->11|133->92|135->94|135->94|135->94|136->95|147->106|147->106|147->106|148->107|160->119|162->121|162->121|162->121|164->123|164->123|164->123|164->123|181->140|181->140|181->140|182->141|183->142|183->142|183->142|183->142|183->142|183->142|186->145|186->145|186->145|187->146|187->146|187->146|187->146|187->146|188->147|188->147|188->147|189->148|190->149|190->149|190->149|191->150|191->150|191->150|191->150|191->150|192->151|194->153|194->153|194->153|195->154|195->154|195->154|195->154|195->154|197->156|197->156|197->156|198->157|199->158|199->158|199->158|200->159|200->159|200->159|200->159|200->159|201->160|205->164|205->164|205->164|206->165|206->165|206->165|206->165|206->165|208->167|208->167|208->167|209->168|210->169|210->169|210->169|211->170|211->170|211->170|211->170|211->170|212->171|214->173|214->173|214->173|215->174|218->177|218->177|218->177|219->178|222->181|222->181|222->181|223->182|226->185|228->187|228->187|228->187|229->188|230->189|230->189|230->189|232->191|232->191|232->191|233->192|236->195|238->197|239->198|240->199|246->205|246->205|246->205|247->206|251->210|251->210|251->210|252->211|252->211|252->211|252->211|254->213|254->213|254->213|256->215|257->216|257->216|257->216|258->217|261->220|262->221|262->221|262->221|263->222|263->222|263->222|263->222|264->223|264->223|264->223|264->223|264->223|264->223|264->223|265->224|266->225|266->225|266->225|267->226|270->229|271->230|271->230|271->230|272->231|276->235|276->235|276->235|277->236|277->236|277->236|277->236|279->238|279->238|279->238|281->240|282->241|285->244|285->244|285->244|286->245|287->246|288->247|293->252|293->252|293->252|294->253|295->254|295->254|295->254|296->255|296->255|296->255|297->256|297->256|297->256|298->257|298->257|298->257|298->257|298->257|298->257|299->258|299->258|299->258|300->259|300->259|300->259|300->259|300->259|300->259|301->260|302->261|303->262|304->263|305->264|306->265|319->278|319->278|319->278|320->279|321->280|321->280|321->280|322->281|322->281|322->281|323->282|323->282|323->282|324->283|324->283|324->283|324->283|324->283|324->283|325->284|325->284|325->284|326->285|326->285|326->285|326->285|326->285|326->285|327->286|328->287|329->288|330->289|331->290|332->291|345->304|345->304|345->304|346->305|347->306|347->306|347->306|348->307|348->307|348->307|349->308|349->308|349->308|350->309|350->309|350->309|350->309|350->309|351->310|351->310|351->310|352->311|352->311|352->311|352->311|352->311|353->312|354->313|355->314|356->315|357->316|358->317|368->327
                  -- GENERATED --
              */
          