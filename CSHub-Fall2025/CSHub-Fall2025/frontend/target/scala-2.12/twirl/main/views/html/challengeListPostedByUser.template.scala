
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

object challengeListPostedByUser extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template9[List[Challenge],Integer,Integer,Integer,Integer,Integer,Long,Integer,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(challenges: List[Challenge],
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
/*12.2*/import models.Challenge;

def /*14.2*/scripts/*14.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*14.13*/("""
    """),format.raw/*15.5*/("""<script type = "module" src='"""),_display_(/*15.35*/routes/*15.41*/.Assets.at("javascripts/voiceJump.js")),format.raw/*15.79*/("""'></script>
    <script type="text/javascript">

            $(document).ready(function () """),format.raw/*18.43*/("""{"""),format.raw/*18.44*/("""
                """),format.raw/*19.17*/("""var technologiesArray = []
                """),_display_(/*20.18*/for(i <- 0 until challenges.size) yield /*20.51*/ {_display_(Seq[Any](format.raw/*20.53*/("""
                """),format.raw/*21.17*/("""var json = """),format.raw/*21.28*/("""{"""),format.raw/*21.29*/("""}"""),format.raw/*21.30*/(""";
                json.id = '"""),_display_(/*22.29*/challenges/*22.39*/.get(i).getId()),format.raw/*22.54*/("""';
                json.url = "/job/jobDetail/" + json.id;

                json.name = '"""),_display_(/*25.31*/challenges/*25.41*/.get(i).getChallengeTitle),format.raw/*25.66*/("""'.replace(/[^a-zA-Z0-9]/g, " ").replace(/  +/g, " ").trim();
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


    """),format.raw/*61.5*/("""</script>
    <style>
            .follow-fab """),format.raw/*63.25*/("""{"""),format.raw/*63.26*/("""
                """),format.raw/*64.17*/("""top: -20px !important;
                bottom: auto !important;
                right: -20px !important;
            """),format.raw/*67.13*/("""}"""),format.raw/*67.14*/("""
    """),format.raw/*68.5*/("""</style>
""")))};
Seq[Any](format.raw/*9.40*/("""
"""),format.raw/*13.1*/("""
"""),format.raw/*69.2*/("""

"""),_display_(/*71.2*/main("My Posted Challenges", scripts)/*71.39*/ {_display_(Seq[Any](format.raw/*71.41*/("""
    """),format.raw/*72.5*/("""<div class="container">
        <div class="card-panel center">
            <div class="row card-panel z-depth-0 project-zone-panel">
                <div class="col s12" style="margin-top: -10px;
                    margin-bottom: -10px;">
                    <h6 class="center tooltipped" data-position="bottom" data-tooltip="This list shows the my posted job lists." >
                        My Posted Challenges
                    </h6>
                </div>
            </div>

            """),_display_(/*83.14*/if(challenges.size() > 0)/*83.39*/ {_display_(Seq[Any](format.raw/*83.41*/("""
                """),format.raw/*84.17*/("""<div class="col s8 offset-s2">
                    <h4>Challenges List</h4>

                </div>
                <div class="col s2">
                    <button id = "speak-from-filter" hidden></button>
                    <div id="nasaText" hidden></div>
                    <div id="requestField"></div>
                    <div id="replyField"></div>
                </div>
                <div class="row">
                    <div class="col s6">
                        <h6 class="left">Showing results: """),_display_(/*96.60*/{
                            offset + 1
                        }),format.raw/*98.26*/(""" """),format.raw/*98.27*/("""to """),_display_(/*98.31*/{
                            offset + count
                        }),format.raw/*100.26*/(""" """),format.raw/*100.27*/("""of """),_display_(/*100.31*/total),format.raw/*100.36*/("""</h6>
                    </div>
                </div>
                <table class="centered responsive-table striped" id="projectTable" >
                    <thead>
                        <tr class="list-header" style="border-bottom: 1px solid;
                        !important;">
                            <th style="cursor: pointer;">Challenge Id</th>
                            <th style="cursor: pointer;">Title</th>
                            <th style="cursor: pointer;">Short Description</th>
                            <th style="cursor: pointer;">Budget</th>
                            <th style="cursor: pointer;">Status</th>
                            <th style="cursor: pointer;">View Applications</th>

                        </tr>
                    </thead>
                    <tbody>
                    """),_display_(/*117.22*/for((entry, index) <- challenges.zipWithIndex) yield /*117.68*/ {_display_(Seq[Any](format.raw/*117.70*/("""
                        """),format.raw/*118.25*/("""<tr>
                            <td><a href = """"),_display_(/*119.45*/routes/*119.51*/.ChallengeController.challengeDetail(entry.getId())),format.raw/*119.102*/("""">"""),_display_(/*119.105*/entry/*119.110*/.getId()),format.raw/*119.118*/("""</a></td>


                            """),_display_(/*122.30*/if(entry.getChallengeTitle() != "")/*122.65*/ {_display_(Seq[Any](format.raw/*122.67*/("""
                                """),format.raw/*123.33*/("""<td><span class=""""),_display_(/*123.51*/entry/*123.56*/.getId()),format.raw/*123.64*/(""" """),format.raw/*123.65*/("""editable" data-name='title'></span>
                                    """),_display_(/*124.38*/entry/*124.43*/.getChallengeTitle()),format.raw/*124.63*/("""
                                """),format.raw/*125.33*/("""</td>
                            """)))}/*126.31*/else/*126.36*/{_display_(Seq[Any](format.raw/*126.37*/("""
                                """),format.raw/*127.33*/("""<td><span class=""""),_display_(/*127.51*/entry/*127.56*/.getId()),format.raw/*127.64*/(""" """),format.raw/*127.65*/("""editable" data-name='title'>&ensp; -</span></td>
                            """)))}),format.raw/*128.30*/("""

                            """),_display_(/*130.30*/if(entry.getShortDescription() != "")/*130.67*/ {_display_(Seq[Any](format.raw/*130.69*/("""
                                """),format.raw/*131.33*/("""<td><span class=""""),_display_(/*131.51*/entry/*131.56*/.getId()),format.raw/*131.64*/(""" """),format.raw/*131.65*/("""editable" data-name='shortDescription'></span>

                                    """),_display_(/*133.38*/entry/*133.43*/.getShortDescription()),format.raw/*133.65*/("""
                                """),format.raw/*134.33*/("""</td>
                            """)))}/*135.31*/else/*135.36*/{_display_(Seq[Any](format.raw/*135.37*/("""
                                """),format.raw/*136.33*/("""<td><span class=""""),_display_(/*136.51*/entry/*136.56*/.getId()),format.raw/*136.64*/(""" """),format.raw/*136.65*/("""editable" data-name='shortDescription'>&ensp; -</span></td>
                            """)))}),format.raw/*137.30*/("""



                            """),_display_(/*141.30*/if(entry.getBudget() != "")/*141.57*/ {_display_(Seq[Any](format.raw/*141.59*/("""
                                """),format.raw/*142.33*/("""<td>
                                    <span class=""""),_display_(/*143.51*/entry/*143.56*/.getId()),format.raw/*143.64*/(""" """),format.raw/*143.65*/("""editable" data-name="budget"></span>
                                    """),_display_(/*144.38*/entry/*144.43*/.getBudget()),format.raw/*144.55*/("""
                                """),format.raw/*145.33*/("""</td>
                            """)))}/*146.31*/else/*146.36*/{_display_(Seq[Any](format.raw/*146.37*/("""
                                """),format.raw/*147.33*/("""<td><span class=""""),_display_(/*147.51*/entry/*147.56*/.getId()),format.raw/*147.64*/(""" """),format.raw/*147.65*/("""editable" data-name="budget"> -</span></td>
                            """)))}),format.raw/*148.30*/("""

                            """),_display_(/*150.30*/if(entry.getStatus() == "closed")/*150.63*/ {_display_(Seq[Any](format.raw/*150.65*/("""
                                """),format.raw/*151.33*/("""<td>
                                    <span class="new badge grey darken-3" data-badge-caption="closed"></span>
                                </td>
                            """)))}/*154.31*/else/*154.35*/{_display_(Seq[Any](format.raw/*154.36*/("""
                                """),format.raw/*155.33*/("""<td>
                                    <span class="new badge light-green darken-1" data-badge-caption="open"></span>
                                </td>

                            """)))}),format.raw/*159.30*/("""


                            """),_display_(/*162.30*/if(entry.getNumberOfApplicants()>0)/*162.65*/ {_display_(Seq[Any](format.raw/*162.67*/("""
                                """),format.raw/*163.33*/("""<td>
                                    <a class="waves-effect waves-light green darken-3 btn" href=""""),_display_(/*164.99*/routes/*164.105*/.ChallengeController.challengeApplicationsList("challenge", entry.getId(), 1, "")),format.raw/*164.186*/("""">view</a>
"""),format.raw/*165.182*/("""
                                """),format.raw/*166.33*/("""</td>
                            """)))}/*167.31*/else/*167.36*/{_display_(Seq[Any](format.raw/*167.37*/("""
                                """),format.raw/*168.33*/("""<td>
                                    <a class="btn disabled">view</a>
                                </td>
                            """)))}),format.raw/*171.30*/("""

                        """),format.raw/*173.25*/("""</tr>
                    """)))}),format.raw/*174.22*/("""
                    """),format.raw/*175.21*/("""</tbody>
                </table>

                <div class="row">
                    <div class="col s12">
                        <ul class="pagination center-align">
                            """),_display_(/*181.30*/if(pageNum == 1)/*181.46*/ {_display_(Seq[Any](format.raw/*181.48*/("""
                                """),format.raw/*182.33*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    first_page</i></li>
                                <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    chevron_left</i></li>
                            """)))}/*186.31*/else/*186.36*/{_display_(Seq[Any](format.raw/*186.37*/("""
                                """),format.raw/*187.33*/("""<li class="waves-effect"><a href=""""),_display_(/*187.68*/routes/*187.74*/.ChallengeController.challengeListPostedByUser(1)),format.raw/*187.123*/(""""><i class="material-icons">
                                    first_page</i></a></li>
                                <li class="waves-effect"><a href=""""),_display_(/*189.68*/routes/*189.74*/.ChallengeController.challengeListPostedByUser(pageNum - 1)),format.raw/*189.133*/(""""><i class="material-icons">
                                    chevron_left</i></a></li>
                            """)))}),format.raw/*191.30*/("""
                            """),_display_(/*192.30*/if(beginIndexForPagination > 1)/*192.61*/ {_display_(Seq[Any](format.raw/*192.63*/("""
                                """),format.raw/*193.33*/("""<li class="waves-effect modal-trigger" href="#allPageModal" style="cursor: pointer;
                                    font-size: 20px;
                                    font-weight: bold">...</li>
                            """)))}),format.raw/*196.30*/("""
                            """),_display_(/*197.30*/for(i <- (beginIndexForPagination + 0) to (endIndexForPagination + 0)) yield /*197.100*/ {_display_(Seq[Any](format.raw/*197.102*/("""
                                """),format.raw/*198.33*/("""<li """),_display_(/*198.38*/if(pageNum == i)/*198.54*/ {_display_(Seq[Any](format.raw/*198.56*/("""
                                    """),format.raw/*199.37*/("""class="active"""")))}),format.raw/*199.52*/("""><a href=""""),_display_(/*199.63*/routes/*199.69*/.ChallengeController.challengeListPostedByUser(i)),format.raw/*199.118*/("""">"""),_display_(/*199.121*/i),format.raw/*199.122*/("""</a></li>
                            """)))}),format.raw/*200.30*/("""
                            """),_display_(/*201.30*/if(endIndexForPagination < ((total - 1) / pageLimit + 1))/*201.87*/ {_display_(Seq[Any](format.raw/*201.89*/("""
                                """),format.raw/*202.33*/("""<li class="waves-effect modal-trigger" href="#allPageModal" style="cursor: pointer;
                                    font-size: 20px;
                                    font-weight: bold">...</li>
                            """)))}),format.raw/*205.30*/("""
                            """),_display_(/*206.30*/if((offset + count) >= total)/*206.59*/ {_display_(Seq[Any](format.raw/*206.61*/("""
                                """),format.raw/*207.33*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    chevron_right</i></li>
                                <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    last_page</i></li>
                            """)))}/*211.31*/else/*211.36*/{_display_(Seq[Any](format.raw/*211.37*/("""
                                """),format.raw/*212.33*/("""<li class="waves-effect"><a href=""""),_display_(/*212.68*/routes/*212.74*/.ChallengeController.challengeListPostedByUser(pageNum + 1)),format.raw/*212.133*/(""""><i class="material-icons">
                                    chevron_right</i></a></li>
                                <li class="waves-effect"><a href=""""),_display_(/*214.68*/routes/*214.74*/.ChallengeController.challengeListPostedByUser((total - 1) / pageLimit + 1)),format.raw/*214.149*/(""""><i class="material-icons">
                                    last_page</i></a></li>
                            """)))}),format.raw/*216.30*/("""
                        """),format.raw/*217.25*/("""</ul>
                    </div>
                </div>
            """)))}/*220.15*/else/*220.20*/{_display_(Seq[Any](format.raw/*220.21*/("""
                """),format.raw/*221.17*/("""<h5>No challenges registered yet.</h5>
            """)))}),format.raw/*222.14*/("""
            """),format.raw/*223.13*/("""<div id="allPageModal" class="modal">
                <div class="modal-content">
                    <h6>Select the page number you want to jump to</h6>
                    <div class="card z-depth-0">

                    """),_display_(/*228.22*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*228.79*/ {_display_(Seq[Any](format.raw/*228.81*/("""
                        """),format.raw/*229.25*/("""<ul class="pagination center-align">
                        """),_display_(/*230.26*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*230.65*/ {_display_(Seq[Any](format.raw/*230.67*/("""
                            """),_display_(/*231.30*/if(j <= ((total - 1)/(pageLimit) + 1))/*231.68*/ {_display_(Seq[Any](format.raw/*231.70*/("""
                                """),_display_(/*232.34*/if(j != pageNum)/*232.50*/ {_display_(Seq[Any](format.raw/*232.52*/("""
                                    """),format.raw/*233.37*/("""<li class="waves-effect grey lighten-3"><a href='"""),_display_(/*233.87*/routes/*233.93*/.ChallengeController.challengeListPostedByUser(j)),format.raw/*233.142*/("""'>"""),_display_(/*233.145*/j),format.raw/*233.146*/("""</a></li>
                                """)))}/*234.34*/else/*234.38*/{_display_(Seq[Any](format.raw/*234.39*/("""
                                    """),format.raw/*235.37*/("""<li class="waves-effect active"><a href=""""),_display_(/*235.79*/routes/*235.85*/.ChallengeController.challengeListPostedByUser(j)),format.raw/*235.134*/("""">"""),_display_(/*235.137*/j),format.raw/*235.138*/("""</a></li>
                                """)))}),format.raw/*236.34*/("""
                            """)))}),format.raw/*237.30*/("""
                        """)))}),format.raw/*238.26*/("""
                        """),format.raw/*239.25*/("""</ul>
                    """)))}),format.raw/*240.22*/("""
                    """),format.raw/*241.21*/("""</div>
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

                    """),_display_(/*254.22*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*254.79*/ {_display_(Seq[Any](format.raw/*254.81*/("""
                        """),format.raw/*255.25*/("""<ul class="pagination center-align">
                        """),_display_(/*256.26*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*256.65*/ {_display_(Seq[Any](format.raw/*256.67*/("""
                            """),_display_(/*257.30*/if(j <= ((total - 1)/(pageLimit) + 1))/*257.68*/ {_display_(Seq[Any](format.raw/*257.70*/("""
                                """),_display_(/*258.34*/if(j != pageNum)/*258.50*/ {_display_(Seq[Any](format.raw/*258.52*/("""
                                    """),format.raw/*259.37*/("""<li class="waves-effect grey lighten-3"><a href='"""),_display_(/*259.87*/routes/*259.93*/.ProjectController.getMyEnrolledProjects(j, "")),format.raw/*259.140*/("""'>"""),_display_(/*259.143*/j),format.raw/*259.144*/("""</a></li>
                                """)))}/*260.34*/else/*260.38*/{_display_(Seq[Any](format.raw/*260.39*/("""
                                    """),format.raw/*261.37*/("""<li class="waves-effect active"><a href=""""),_display_(/*261.79*/routes/*261.85*/.ProjectController.getMyEnrolledProjects(j, "")),format.raw/*261.132*/("""">"""),_display_(/*261.135*/j),format.raw/*261.136*/("""</a></li>
                                """)))}),format.raw/*262.34*/("""
                            """)))}),format.raw/*263.30*/("""
                        """)))}),format.raw/*264.26*/("""
                        """),format.raw/*265.25*/("""</ul>
                    """)))}),format.raw/*266.22*/("""
                    """),format.raw/*267.21*/("""</div>
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

                    """),_display_(/*280.22*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*280.79*/ {_display_(Seq[Any](format.raw/*280.81*/("""
                        """),format.raw/*281.25*/("""<ul class="pagination center-align">
                        """),_display_(/*282.26*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*282.65*/ {_display_(Seq[Any](format.raw/*282.67*/("""
                            """),_display_(/*283.30*/if(j <= ((total - 1)/(pageLimit) + 1))/*283.68*/ {_display_(Seq[Any](format.raw/*283.70*/("""
                                """),_display_(/*284.34*/if(j != pageNum)/*284.50*/ {_display_(Seq[Any](format.raw/*284.52*/("""
                                    """),format.raw/*285.37*/("""<li class="waves-effect grey lighten-3"><a href='#!' onclick="jumpToPage("""),_display_(/*285.111*/j),format.raw/*285.112*/(""")">"""),_display_(/*285.116*/j),format.raw/*285.117*/("""</a></li>
                                """)))}/*286.34*/else/*286.38*/{_display_(Seq[Any](format.raw/*286.39*/("""
                                    """),format.raw/*287.37*/("""<li class="waves-effect active"><a href="#!" onclick="jumpToPage("""),_display_(/*287.103*/j),format.raw/*287.104*/(""")">"""),_display_(/*287.108*/j),format.raw/*287.109*/("""</a></li>
                                """)))}),format.raw/*288.34*/("""
                            """)))}),format.raw/*289.30*/("""
                        """)))}),format.raw/*290.26*/("""
                        """),format.raw/*291.25*/("""</ul>
                    """)))}),format.raw/*292.22*/("""
                    """),format.raw/*293.21*/("""</div>
                </div>
                <div class="modal-footer">
                    <a href="#!" class="modal-close waves-effect waves-green btn-flat">
                        Cancel</a>
                </div>
            </div>

        </div>
    </div>
""")))}),format.raw/*303.2*/("""

"""))
      }
    }
  }

  def render(challenges:List[Challenge],pageNum:Integer,offset:Integer,total:Integer,count:Integer,pageLimit:Integer,id:Long,beginIndexForPagination:Integer,endIndexForPagination:Integer): play.twirl.api.HtmlFormat.Appendable = apply(challenges,pageNum,offset,total,count,pageLimit,id,beginIndexForPagination,endIndexForPagination)

  def f:((List[Challenge],Integer,Integer,Integer,Integer,Integer,Long,Integer,Integer) => play.twirl.api.HtmlFormat.Appendable) = (challenges,pageNum,offset,total,count,pageLimit,id,beginIndexForPagination,endIndexForPagination) => apply(challenges,pageNum,offset,total,count,pageLimit,id,beginIndexForPagination,endIndexForPagination)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:31 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/challengeListPostedByUser.scala.html
                  HASH: afc1d1f7396720b93972199043ae3cfdc6f50557
                  MATRIX: 1201->1|1531->259|1556->277|1581->295|1619->322|1634->329|1715->333|1747->338|1804->368|1819->374|1878->412|1997->503|2026->504|2071->521|2142->565|2191->598|2231->600|2276->617|2315->628|2344->629|2373->630|2430->660|2449->670|2485->685|2602->775|2621->785|2667->810|2869->981|2914->998|3206->1262|3235->1263|3308->1308|3337->1309|3383->1327|4056->1972|4085->1973|4119->1980|4193->2026|4222->2027|4267->2044|4412->2161|4441->2162|4473->2167|4522->257|4550->320|4578->2177|4607->2180|4653->2217|4693->2219|4725->2224|5251->2723|5285->2748|5325->2750|5370->2767|5912->3282|5999->3348|6028->3349|6059->3353|6151->3423|6181->3424|6213->3428|6240->3433|7106->4271|7169->4317|7210->4319|7264->4344|7341->4393|7357->4399|7431->4450|7463->4453|7479->4458|7510->4466|7579->4507|7624->4542|7665->4544|7727->4577|7773->4595|7788->4600|7818->4608|7848->4609|7949->4682|7964->4687|8006->4707|8068->4740|8123->4776|8137->4781|8177->4782|8239->4815|8285->4833|8300->4838|8330->4846|8360->4847|8470->4925|8529->4956|8576->4993|8617->4995|8679->5028|8725->5046|8740->5051|8770->5059|8800->5060|8913->5145|8928->5150|8972->5172|9034->5205|9089->5241|9103->5246|9143->5247|9205->5280|9251->5298|9266->5303|9296->5311|9326->5312|9447->5401|9508->5434|9545->5461|9586->5463|9648->5496|9731->5551|9746->5556|9776->5564|9806->5565|9908->5639|9923->5644|9957->5656|10019->5689|10074->5725|10088->5730|10128->5731|10190->5764|10236->5782|10251->5787|10281->5795|10311->5796|10416->5869|10475->5900|10518->5933|10559->5935|10621->5968|10823->6151|10837->6155|10877->6156|10939->6189|11159->6377|11219->6409|11264->6444|11305->6446|11367->6479|11498->6582|11515->6588|11619->6669|11660->6861|11722->6894|11777->6930|11791->6935|11831->6936|11893->6969|12066->7110|12121->7136|12180->7163|12230->7184|12459->7385|12485->7401|12526->7403|12588->7436|12953->7782|12967->7787|13007->7788|13069->7821|13132->7856|13148->7862|13220->7911|13404->8067|13420->8073|13502->8132|13654->8252|13712->8282|13753->8313|13794->8315|13856->8348|14118->8578|14176->8608|14264->8678|14306->8680|14368->8713|14401->8718|14427->8734|14468->8736|14534->8773|14581->8788|14620->8799|14636->8805|14708->8854|14740->8857|14764->8858|14835->8897|14893->8927|14960->8984|15001->8986|15063->9019|15325->9249|15383->9279|15422->9308|15463->9310|15525->9343|15890->9689|15904->9694|15944->9695|16006->9728|16069->9763|16085->9769|16167->9828|16354->9987|16370->9993|16468->10068|16617->10185|16671->10210|16760->10280|16774->10285|16814->10286|16860->10303|16944->10355|16986->10368|17239->10593|17313->10650|17354->10652|17408->10677|17498->10739|17554->10778|17595->10780|17653->10810|17701->10848|17742->10850|17804->10884|17830->10900|17871->10902|17937->10939|18015->10989|18031->10995|18103->11044|18135->11047|18159->11048|18222->11091|18236->11095|18276->11096|18342->11133|18412->11175|18428->11181|18500->11230|18532->11233|18556->11234|18631->11277|18693->11307|18751->11333|18805->11358|18864->11385|18914->11406|19421->11885|19495->11942|19536->11944|19590->11969|19680->12031|19736->12070|19777->12072|19835->12102|19883->12140|19924->12142|19986->12176|20012->12192|20053->12194|20119->12231|20197->12281|20213->12287|20283->12334|20315->12337|20339->12338|20402->12381|20416->12385|20456->12386|20522->12423|20592->12465|20608->12471|20678->12518|20710->12521|20734->12522|20809->12565|20871->12595|20929->12621|20983->12646|21042->12673|21092->12694|21599->13173|21673->13230|21714->13232|21768->13257|21858->13319|21914->13358|21955->13360|22013->13390|22061->13428|22102->13430|22164->13464|22190->13480|22231->13482|22297->13519|22400->13593|22424->13594|22457->13598|22481->13599|22544->13642|22558->13646|22598->13647|22664->13684|22759->13750|22783->13751|22816->13755|22840->13756|22915->13799|22977->13829|23035->13855|23089->13880|23148->13907|23198->13928|23495->14194
                  LINES: 35->1|46->10|47->11|48->12|50->14|50->14|52->14|53->15|53->15|53->15|53->15|56->18|56->18|57->19|58->20|58->20|58->20|59->21|59->21|59->21|59->21|60->22|60->22|60->22|63->25|63->25|63->25|66->28|67->29|75->37|75->37|77->39|77->39|79->41|96->58|96->58|99->61|101->63|101->63|102->64|105->67|105->67|106->68|108->9|109->13|110->69|112->71|112->71|112->71|113->72|124->83|124->83|124->83|125->84|137->96|139->98|139->98|139->98|141->100|141->100|141->100|141->100|158->117|158->117|158->117|159->118|160->119|160->119|160->119|160->119|160->119|160->119|163->122|163->122|163->122|164->123|164->123|164->123|164->123|164->123|165->124|165->124|165->124|166->125|167->126|167->126|167->126|168->127|168->127|168->127|168->127|168->127|169->128|171->130|171->130|171->130|172->131|172->131|172->131|172->131|172->131|174->133|174->133|174->133|175->134|176->135|176->135|176->135|177->136|177->136|177->136|177->136|177->136|178->137|182->141|182->141|182->141|183->142|184->143|184->143|184->143|184->143|185->144|185->144|185->144|186->145|187->146|187->146|187->146|188->147|188->147|188->147|188->147|188->147|189->148|191->150|191->150|191->150|192->151|195->154|195->154|195->154|196->155|200->159|203->162|203->162|203->162|204->163|205->164|205->164|205->164|206->165|207->166|208->167|208->167|208->167|209->168|212->171|214->173|215->174|216->175|222->181|222->181|222->181|223->182|227->186|227->186|227->186|228->187|228->187|228->187|228->187|230->189|230->189|230->189|232->191|233->192|233->192|233->192|234->193|237->196|238->197|238->197|238->197|239->198|239->198|239->198|239->198|240->199|240->199|240->199|240->199|240->199|240->199|240->199|241->200|242->201|242->201|242->201|243->202|246->205|247->206|247->206|247->206|248->207|252->211|252->211|252->211|253->212|253->212|253->212|253->212|255->214|255->214|255->214|257->216|258->217|261->220|261->220|261->220|262->221|263->222|264->223|269->228|269->228|269->228|270->229|271->230|271->230|271->230|272->231|272->231|272->231|273->232|273->232|273->232|274->233|274->233|274->233|274->233|274->233|274->233|275->234|275->234|275->234|276->235|276->235|276->235|276->235|276->235|276->235|277->236|278->237|279->238|280->239|281->240|282->241|295->254|295->254|295->254|296->255|297->256|297->256|297->256|298->257|298->257|298->257|299->258|299->258|299->258|300->259|300->259|300->259|300->259|300->259|300->259|301->260|301->260|301->260|302->261|302->261|302->261|302->261|302->261|302->261|303->262|304->263|305->264|306->265|307->266|308->267|321->280|321->280|321->280|322->281|323->282|323->282|323->282|324->283|324->283|324->283|325->284|325->284|325->284|326->285|326->285|326->285|326->285|326->285|327->286|327->286|327->286|328->287|328->287|328->287|328->287|328->287|329->288|330->289|331->290|332->291|333->292|334->293|344->303
                  -- GENERATED --
              */
          