
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

object challengeListAppliedByUser extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template10[List[Challenge],List[String],Integer,Integer,Integer,Integer,Integer,Long,Integer,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(challenges: List[Challenge],
        applicationStatuses: List[String],
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
/*13.2*/import helper._
/*14.2*/import models._
/*15.2*/import models.Challenge
/*16.2*/import scala.collection.immutable.Range

def /*18.2*/scripts/*18.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*18.13*/("""
    """),format.raw/*19.5*/("""<script type="module" src='"""),_display_(/*19.33*/routes/*19.39*/.Assets.at("javascripts/voiceJump.js")),format.raw/*19.77*/("""'></script>
    <script type="text/javascript">
            $(document).ready(function () """),format.raw/*21.43*/("""{"""),format.raw/*21.44*/("""
                """),format.raw/*22.17*/("""$('.tooltipped').tooltip();
            """),format.raw/*23.13*/("""}"""),format.raw/*23.14*/(""");
    </script>
""")))};
Seq[Any](format.raw/*10.40*/("""


"""),format.raw/*17.1*/("""
"""),format.raw/*25.2*/("""

"""),_display_(/*27.2*/main("My Applied Challenges", scripts)/*27.40*/ {_display_(Seq[Any](format.raw/*27.42*/("""
    """),format.raw/*28.5*/("""<div class="container">
        <div class="card-panel center">
            <div class="row card-panel z-depth-0 project-zone-panel">
                <div class="col s12">
                    <h6 class="center tooltipped" data-position="bottom" data-tooltip="This list shows the Challenges you applied for.">
                        My Applied Challenges
                    </h6>
                </div>
            </div>

            """),_display_(/*38.14*/if(challenges.size() > 0)/*38.39*/ {_display_(Seq[Any](format.raw/*38.41*/("""
                """),format.raw/*39.17*/("""<div class="col s12">
                    <h4>Challenge List</h4>
                </div>

                <div class="row">
                    <div class="col s6">
                        <h6 class="left">Showing results: """),_display_(/*45.60*/{offset + 1}),format.raw/*45.72*/(""" """),format.raw/*45.73*/("""to """),_display_(/*45.77*/{offset + count}),format.raw/*45.93*/(""" """),format.raw/*45.94*/("""of """),_display_(/*45.98*/total),format.raw/*45.103*/("""</h6>
                    </div>
                </div>

                <table class="centered responsive-table striped" id="appliedChallengeTable">
                    <thead>
                        <tr class="list-header" style="border-bottom: 1px solid;
                        !important;">
                            <th style="cursor: pointer;">Challenge Id</th>
                            <th style="cursor: pointer;">Challenge Title</th>
                            <th style="cursor: pointer;">Short Description</th>
                            <th style="cursor: pointer;">Status</th>
                            <th style="cursor: pointer;">Location</th>
                            <th style="cursor: pointer;">View Applications</th>

                        </tr>
                    </thead>
                    <tbody>
                    """),_display_(/*63.22*/for((entry, index) <- challenges.zipWithIndex if entry.getStatus() != "closed" ) yield /*63.102*/ {_display_(Seq[Any](format.raw/*63.104*/("""
                        """),format.raw/*64.25*/("""<tr>
                            <td><a href = """"),_display_(/*65.45*/routes/*65.51*/.ChallengeController.challengeDetail(entry.getId())),format.raw/*65.102*/("""">"""),_display_(/*65.105*/entry/*65.110*/.getId()),format.raw/*65.118*/("""</a></td>


"""),format.raw/*68.71*/("""
"""),format.raw/*69.104*/("""
"""),format.raw/*70.67*/("""
"""),format.raw/*71.42*/("""
"""),format.raw/*72.41*/("""
"""),format.raw/*73.117*/("""
"""),format.raw/*74.34*/("""
                            """),format.raw/*75.29*/("""<td>
                                <span class=""""),_display_(/*76.47*/entry/*76.52*/.getId()),format.raw/*76.60*/(""" """),format.raw/*76.61*/("""editable" data-name="challengeTitle"></span>
                                """),_display_(/*77.34*/if(entry.getChallengeTitle() != null && entry.getChallengeTitle().nonEmpty)/*77.109*/ {_display_(Seq[Any](format.raw/*77.111*/("""
"""),format.raw/*78.85*/("""
"""),format.raw/*79.91*/("""
"""),format.raw/*80.49*/("""
"""),format.raw/*81.71*/("""
"""),format.raw/*82.42*/("""
                                    """),_display_(/*83.38*/entry/*83.43*/.getChallengeTitle()),format.raw/*83.63*/("""
                                """)))}/*84.35*/else/*84.40*/{_display_(Seq[Any](format.raw/*84.41*/("""
                                    """),format.raw/*85.37*/("""<span class=""""),_display_(/*85.51*/entry/*85.56*/.getId()),format.raw/*85.64*/(""" """),format.raw/*85.65*/("""editable" data-name="challengeTitle">&ensp; -</span>
                                """)))}),format.raw/*86.34*/("""
                            """),format.raw/*87.29*/("""</td>


                            """),format.raw/*90.101*/("""
"""),format.raw/*91.115*/("""

"""),format.raw/*93.69*/("""
"""),format.raw/*94.42*/("""
"""),format.raw/*95.41*/("""
"""),format.raw/*96.128*/("""
"""),format.raw/*97.34*/("""
                            """),format.raw/*98.29*/("""<td>
                                <span class=""""),_display_(/*99.47*/entry/*99.52*/.getId()),format.raw/*99.60*/(""" """),format.raw/*99.61*/("""editable" data-name="shortDescription"></span>
                                """),_display_(/*100.34*/if(entry.getShortDescription() != null && entry.getShortDescription().nonEmpty)/*100.113*/ {_display_(Seq[Any](format.raw/*100.115*/("""
"""),format.raw/*101.87*/("""
"""),format.raw/*102.93*/("""
"""),format.raw/*103.49*/("""
"""),format.raw/*104.73*/("""
"""),format.raw/*105.42*/("""
                                    """),_display_(/*106.38*/entry/*106.43*/.getShortDescription()),format.raw/*106.65*/("""
                                """)))}/*107.35*/else/*107.40*/{_display_(Seq[Any](format.raw/*107.41*/("""
                                    """),format.raw/*108.37*/("""<span class=""""),_display_(/*108.51*/entry/*108.56*/.getId()),format.raw/*108.64*/(""" """),format.raw/*108.65*/("""editable" data-name="shortDescription">&ensp; -</span>
                                """)))}),format.raw/*109.34*/("""
                            """),format.raw/*110.29*/("""</td>

"""),format.raw/*112.63*/("""
"""),format.raw/*113.105*/("""

"""),format.raw/*115.59*/("""
"""),format.raw/*116.42*/("""
"""),format.raw/*117.41*/("""
"""),format.raw/*118.118*/("""
"""),format.raw/*119.34*/("""
"""),format.raw/*120.37*/("""
"""),format.raw/*121.101*/("""
"""),format.raw/*122.99*/("""
"""),format.raw/*123.77*/("""
"""),format.raw/*124.83*/("""
"""),format.raw/*125.49*/("""
"""),format.raw/*126.63*/("""
"""),format.raw/*127.42*/("""
"""),format.raw/*128.59*/("""
"""),format.raw/*129.45*/("""
"""),format.raw/*130.113*/("""
"""),format.raw/*131.38*/("""
"""),format.raw/*132.38*/("""

"""),format.raw/*134.67*/("""
"""),format.raw/*135.41*/("""
"""),format.raw/*136.119*/("""
"""),format.raw/*137.42*/("""
"""),format.raw/*138.75*/("""
"""),format.raw/*139.37*/("""
"""),format.raw/*140.113*/("""
"""),format.raw/*141.38*/("""
"""),format.raw/*142.39*/("""
"""),format.raw/*143.37*/("""
"""),format.raw/*144.110*/("""
"""),format.raw/*145.38*/("""
"""),format.raw/*146.34*/("""
                            """),_display_(/*147.30*/if(entry.getStatus() == "closed")/*147.63*/ {_display_(Seq[Any](format.raw/*147.65*/("""
                                """),format.raw/*148.33*/("""<td>
                                    <span class="new badge grey darken-3" data-badge-caption="closed"></span>
                                </td>
                            """)))}/*151.31*/else if(applicationStatuses(index) == "open")/*151.76*/ {_display_(Seq[Any](format.raw/*151.78*/("""
                            """),format.raw/*152.29*/("""<td>
                                <span class="new badge light-green darken-1" data-badge-caption="open"></span>
                            </td>
                            """)))}/*155.31*/else if(applicationStatuses(index) == "pending")/*155.79*/ {_display_(Seq[Any](format.raw/*155.81*/("""
                            """),format.raw/*156.29*/("""<td>
                                <span class="new badge purple darken-1" data-badge-caption="pending"></span>
                            </td>
                            """)))}/*159.31*/else/*159.36*/{_display_(Seq[Any](format.raw/*159.37*/("""
                            """),format.raw/*160.29*/("""<td>&ensp; -</td>
                            """)))}),format.raw/*161.30*/("""




                            """),_display_(/*166.30*/if(entry.getLocation() != "")/*166.59*/ {_display_(Seq[Any](format.raw/*166.61*/("""
                                """),format.raw/*167.33*/("""<td>
                                    <span class=""""),_display_(/*168.51*/entry/*168.56*/.getId()),format.raw/*168.64*/(""" """),format.raw/*168.65*/("""editable" data-name="location"></span>
                                    """),_display_(/*169.38*/entry/*169.43*/.getLocation()),format.raw/*169.57*/("""
                                """),format.raw/*170.33*/("""</td>
                            """)))}/*171.31*/else/*171.36*/{_display_(Seq[Any](format.raw/*171.37*/("""
                                """),format.raw/*172.33*/("""<td><span class=""""),_display_(/*172.51*/entry/*172.56*/.getId()),format.raw/*172.64*/(""" """),format.raw/*172.65*/("""editable" data-name="location"> -</span></td>
                            """)))}),format.raw/*173.30*/("""



                            """),format.raw/*177.29*/("""<td>
                                <a class="waves-effect waves-light green darken-3 btn" href=""""),_display_(/*178.95*/routes/*178.101*/.ChallengeController.challengeApplicationsDetail(entry.getId())),format.raw/*178.164*/("""">View </a>
                            </td>
                        </tr>
                    """)))}),format.raw/*181.22*/("""
                    """),format.raw/*182.21*/("""</tbody>
                </table>

                <div class="row">
                    <div class="col s12">
                        <ul class="pagination center-align">
                            """),_display_(/*188.30*/if(pageNum == 1)/*188.46*/ {_display_(Seq[Any](format.raw/*188.48*/("""
                                """),format.raw/*189.33*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    first_page</i></li>
                                <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    chevron_left</i></li>
                            """)))}/*193.31*/else/*193.36*/{_display_(Seq[Any](format.raw/*193.37*/("""
                                """),format.raw/*194.33*/("""<li class="waves-effect"><a href=""""),_display_(/*194.68*/routes/*194.74*/.ChallengeController.challengeListAppliedByUser(1)),format.raw/*194.124*/(""""><i class="material-icons">
                                    first_page</i></a></li>
                                <li class="waves-effect"><a href=""""),_display_(/*196.68*/routes/*196.74*/.ChallengeController.challengeListAppliedByUser(pageNum - 1)),format.raw/*196.134*/(""""><i class="material-icons">
                                    chevron_left</i></a></li>
                            """)))}),format.raw/*198.30*/("""
                            """),_display_(/*199.30*/if(beginIndexForPagination > 1)/*199.61*/ {_display_(Seq[Any](format.raw/*199.63*/("""
                                """),format.raw/*200.33*/("""<li class="waves-effect modal-trigger" href="#allPageModal" style="cursor: pointer;
                                    font-size: 20px;
                                    font-weight: bold">...</li>
                            """)))}),format.raw/*203.30*/("""
                            """),_display_(/*204.30*/for(i <- (beginIndexForPagination + 0) to (endIndexForPagination + 0)) yield /*204.100*/ {_display_(Seq[Any](format.raw/*204.102*/("""
                                """),format.raw/*205.33*/("""<li """),_display_(/*205.38*/if(pageNum == i)/*205.54*/ {_display_(Seq[Any](format.raw/*205.56*/("""
                                    """),format.raw/*206.37*/("""class="active"""")))}),format.raw/*206.52*/("""><a href=""""),_display_(/*206.63*/routes/*206.69*/.ChallengeController.challengeListAppliedByUser(i)),format.raw/*206.119*/("""">"""),_display_(/*206.122*/i),format.raw/*206.123*/("""</a></li>
                            """)))}),format.raw/*207.30*/("""
                            """),_display_(/*208.30*/if(endIndexForPagination < ((total - 1) / pageLimit + 1))/*208.87*/ {_display_(Seq[Any](format.raw/*208.89*/("""
                                """),format.raw/*209.33*/("""<li class="waves-effect modal-trigger" href="#allPageModal" style="cursor: pointer;
                                    font-size: 20px;
                                    font-weight: bold">...</li>
                            """)))}),format.raw/*212.30*/("""
                            """),_display_(/*213.30*/if((offset + count) >= total)/*213.59*/ {_display_(Seq[Any](format.raw/*213.61*/("""
                                """),format.raw/*214.33*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    chevron_right</i></li>
                                <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    last_page</i></li>
                            """)))}/*218.31*/else/*218.36*/{_display_(Seq[Any](format.raw/*218.37*/("""
                                """),format.raw/*219.33*/("""<li class="waves-effect"><a href=""""),_display_(/*219.68*/routes/*219.74*/.ChallengeController.challengeListAppliedByUser(pageNum + 1)),format.raw/*219.134*/(""""><i class="material-icons">
                                    chevron_right</i></a></li>
                                <li class="waves-effect"><a href=""""),_display_(/*221.68*/routes/*221.74*/.ChallengeController.challengeListAppliedByUser((total - 1) / pageLimit + 1)),format.raw/*221.150*/(""""><i class="material-icons">
                                    last_page</i></a></li>
                            """)))}),format.raw/*223.30*/("""
                        """),format.raw/*224.25*/("""</ul>
                    </div>
                </div>
            """)))}/*227.15*/else/*227.20*/{_display_(Seq[Any](format.raw/*227.21*/("""
                """),format.raw/*228.17*/("""<h5>No Challenges applied yet.</h5>
            """)))}),format.raw/*229.14*/("""
            """),format.raw/*230.13*/("""<div id="allPageModal" class="modal">
                <div class="modal-content">
                    <h6>Select the page number you want to jump to</h6>
                    <div class="card z-depth-0">

                    """),_display_(/*235.22*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*235.79*/ {_display_(Seq[Any](format.raw/*235.81*/("""
                        """),format.raw/*236.25*/("""<ul class="pagination center-align">
                        """),_display_(/*237.26*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*237.65*/ {_display_(Seq[Any](format.raw/*237.67*/("""
                            """),_display_(/*238.30*/if(j <= ((total - 1)/(pageLimit) + 1))/*238.68*/ {_display_(Seq[Any](format.raw/*238.70*/("""
                                """),_display_(/*239.34*/if(j != pageNum)/*239.50*/ {_display_(Seq[Any](format.raw/*239.52*/("""
                                    """),format.raw/*240.37*/("""<li class="waves-effect grey lighten-3"><a href='"""),_display_(/*240.87*/routes/*240.93*/.ChallengeController.challengeListAppliedByUser(j)),format.raw/*240.143*/("""'>"""),_display_(/*240.146*/j),format.raw/*240.147*/("""</a></li>
                                """)))}/*241.34*/else/*241.38*/{_display_(Seq[Any](format.raw/*241.39*/("""
                                    """),format.raw/*242.37*/("""<li class="waves-effect active"><a href=""""),_display_(/*242.79*/routes/*242.85*/.ChallengeController.challengeListAppliedByUser(j)),format.raw/*242.135*/("""">"""),_display_(/*242.138*/j),format.raw/*242.139*/("""</a></li>
                                """)))}),format.raw/*243.34*/("""
                            """)))}),format.raw/*244.30*/("""
                        """)))}),format.raw/*245.26*/("""
                        """),format.raw/*246.25*/("""</ul>
                    """)))}),format.raw/*247.22*/("""
                    """),format.raw/*248.21*/("""</div>
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

                    """),_display_(/*261.22*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*261.79*/ {_display_(Seq[Any](format.raw/*261.81*/("""
                        """),format.raw/*262.25*/("""<ul class="pagination center-align">
                        """),_display_(/*263.26*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*263.65*/ {_display_(Seq[Any](format.raw/*263.67*/("""
                            """),_display_(/*264.30*/if(j <= ((total - 1)/(pageLimit) + 1))/*264.68*/ {_display_(Seq[Any](format.raw/*264.70*/("""
                                """),_display_(/*265.34*/if(j != pageNum)/*265.50*/ {_display_(Seq[Any](format.raw/*265.52*/("""
                                    """),format.raw/*266.37*/("""<li class="waves-effect grey lighten-3"><a href='"""),_display_(/*266.87*/routes/*266.93*/.ProjectController.getMyEnrolledProjects(j, "")),format.raw/*266.140*/("""'>"""),_display_(/*266.143*/j),format.raw/*266.144*/("""</a></li>
                                """)))}/*267.34*/else/*267.38*/{_display_(Seq[Any](format.raw/*267.39*/("""
                                    """),format.raw/*268.37*/("""<li class="waves-effect active"><a href=""""),_display_(/*268.79*/routes/*268.85*/.ProjectController.getMyEnrolledProjects(j, "")),format.raw/*268.132*/("""">"""),_display_(/*268.135*/j),format.raw/*268.136*/("""</a></li>
                                """)))}),format.raw/*269.34*/("""
                            """)))}),format.raw/*270.30*/("""
                        """)))}),format.raw/*271.26*/("""
                        """),format.raw/*272.25*/("""</ul>
                    """)))}),format.raw/*273.22*/("""
                    """),format.raw/*274.21*/("""</div>
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

                    """),_display_(/*287.22*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*287.79*/ {_display_(Seq[Any](format.raw/*287.81*/("""
                        """),format.raw/*288.25*/("""<ul class="pagination center-align">
                        """),_display_(/*289.26*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*289.65*/ {_display_(Seq[Any](format.raw/*289.67*/("""
                            """),_display_(/*290.30*/if(j <= ((total - 1)/(pageLimit) + 1))/*290.68*/ {_display_(Seq[Any](format.raw/*290.70*/("""
                                """),_display_(/*291.34*/if(j != pageNum)/*291.50*/ {_display_(Seq[Any](format.raw/*291.52*/("""
                                    """),format.raw/*292.37*/("""<li class="waves-effect grey lighten-3"><a href='#!' onclick="jumpToPage("""),_display_(/*292.111*/j),format.raw/*292.112*/(""")">"""),_display_(/*292.116*/j),format.raw/*292.117*/("""</a></li>
                                """)))}/*293.34*/else/*293.38*/{_display_(Seq[Any](format.raw/*293.39*/("""
                                    """),format.raw/*294.37*/("""<li class="waves-effect active"><a href="#!" onclick="jumpToPage("""),_display_(/*294.103*/j),format.raw/*294.104*/(""")">"""),_display_(/*294.108*/j),format.raw/*294.109*/("""</a></li>
                                """)))}),format.raw/*295.34*/("""
                            """)))}),format.raw/*296.30*/("""
                        """)))}),format.raw/*297.26*/("""
                        """),format.raw/*298.25*/("""</ul>
                    """)))}),format.raw/*299.22*/("""
                    """),format.raw/*300.21*/("""</div>
                </div>
                <div class="modal-footer">
                    <a href="#!" class="modal-close waves-effect waves-green btn-flat">
                        Cancel</a>
                </div>
            </div>

        </div>
    </div>
""")))}),format.raw/*310.2*/("""
"""))
      }
    }
  }

  def render(challenges:List[Challenge],applicationStatuses:List[String],pageNum:Integer,offset:Integer,total:Integer,count:Integer,pageLimit:Integer,id:Long,beginIndexForPagination:Integer,endIndexForPagination:Integer): play.twirl.api.HtmlFormat.Appendable = apply(challenges,applicationStatuses,pageNum,offset,total,count,pageLimit,id,beginIndexForPagination,endIndexForPagination)

  def f:((List[Challenge],List[String],Integer,Integer,Integer,Integer,Integer,Long,Integer,Integer) => play.twirl.api.HtmlFormat.Appendable) = (challenges,applicationStatuses,pageNum,offset,total,count,pageLimit,id,beginIndexForPagination,endIndexForPagination) => apply(challenges,applicationStatuses,pageNum,offset,total,count,pageLimit,id,beginIndexForPagination,endIndexForPagination)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:31 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/challengeListAppliedByUser.scala.html
                  HASH: 6a13efee85f00740aa3ed937809543658db3f258
                  MATRIX: 1216->1|1589->304|1613->321|1637->338|1669->363|1722->405|1737->412|1818->416|1850->421|1905->449|1920->455|1979->493|2097->583|2126->584|2171->601|2239->641|2268->642|2326->300|2356->403|2384->660|2413->663|2460->701|2500->703|2532->708|2996->1145|3030->1170|3070->1172|3115->1189|3366->1413|3399->1425|3428->1426|3459->1430|3496->1446|3525->1447|3556->1451|3583->1456|4469->2315|4566->2395|4607->2397|4660->2422|4736->2471|4751->2477|4824->2528|4855->2531|4870->2536|4900->2544|4940->2626|4970->2730|4999->2797|5028->2839|5057->2880|5087->2997|5116->3031|5173->3060|5251->3111|5265->3116|5294->3124|5323->3125|5428->3203|5513->3278|5554->3280|5583->3365|5612->3456|5641->3505|5670->3576|5699->3618|5764->3656|5778->3661|5819->3681|5872->3716|5885->3721|5924->3722|5989->3759|6030->3773|6044->3778|6073->3786|6102->3787|6219->3873|6276->3902|6341->4010|6371->4125|6401->4195|6430->4237|6459->4278|6489->4406|6518->4440|6575->4469|6653->4520|6667->4525|6696->4533|6725->4534|6833->4614|6923->4693|6965->4695|6995->4782|7025->4875|7055->4924|7085->4997|7115->5039|7181->5077|7196->5082|7240->5104|7294->5139|7308->5144|7348->5145|7414->5182|7456->5196|7471->5201|7501->5209|7531->5210|7651->5298|7709->5327|7745->5396|7776->5501|7807->5561|7837->5603|7867->5644|7898->5762|7928->5796|7958->5833|7989->5934|8019->6033|8049->6110|8079->6193|8109->6242|8139->6305|8169->6347|8199->6406|8229->6451|8260->6564|8290->6602|8320->6640|8351->6708|8381->6749|8412->6868|8442->6910|8472->6985|8502->7022|8533->7135|8563->7173|8593->7212|8623->7249|8654->7359|8684->7397|8714->7431|8772->7461|8815->7494|8856->7496|8918->7529|9120->7712|9175->7757|9216->7759|9274->7788|9473->7968|9531->8016|9572->8018|9630->8047|9827->8225|9841->8230|9881->8231|9939->8260|10018->8307|10080->8341|10119->8370|10160->8372|10222->8405|10305->8460|10320->8465|10350->8473|10380->8474|10484->8550|10499->8555|10535->8569|10597->8602|10652->8638|10666->8643|10706->8644|10768->8677|10814->8695|10829->8700|10859->8708|10889->8709|10996->8784|11057->8816|11184->8915|11201->8921|11287->8984|11416->9081|11466->9102|11695->9303|11721->9319|11762->9321|11824->9354|12189->9700|12203->9705|12243->9706|12305->9739|12368->9774|12384->9780|12457->9830|12641->9986|12657->9992|12740->10052|12892->10172|12950->10202|12991->10233|13032->10235|13094->10268|13356->10498|13414->10528|13502->10598|13544->10600|13606->10633|13639->10638|13665->10654|13706->10656|13772->10693|13819->10708|13858->10719|13874->10725|13947->10775|13979->10778|14003->10779|14074->10818|14132->10848|14199->10905|14240->10907|14302->10940|14564->11170|14622->11200|14661->11229|14702->11231|14764->11264|15129->11610|15143->11615|15183->11616|15245->11649|15308->11684|15324->11690|15407->11750|15594->11909|15610->11915|15709->11991|15858->12108|15912->12133|16001->12203|16015->12208|16055->12209|16101->12226|16182->12275|16224->12288|16477->12513|16551->12570|16592->12572|16646->12597|16736->12659|16792->12698|16833->12700|16891->12730|16939->12768|16980->12770|17042->12804|17068->12820|17109->12822|17175->12859|17253->12909|17269->12915|17342->12965|17374->12968|17398->12969|17461->13012|17475->13016|17515->13017|17581->13054|17651->13096|17667->13102|17740->13152|17772->13155|17796->13156|17871->13199|17933->13229|17991->13255|18045->13280|18104->13307|18154->13328|18661->13807|18735->13864|18776->13866|18830->13891|18920->13953|18976->13992|19017->13994|19075->14024|19123->14062|19164->14064|19226->14098|19252->14114|19293->14116|19359->14153|19437->14203|19453->14209|19523->14256|19555->14259|19579->14260|19642->14303|19656->14307|19696->14308|19762->14345|19832->14387|19848->14393|19918->14440|19950->14443|19974->14444|20049->14487|20111->14517|20169->14543|20223->14568|20282->14595|20332->14616|20839->15095|20913->15152|20954->15154|21008->15179|21098->15241|21154->15280|21195->15282|21253->15312|21301->15350|21342->15352|21404->15386|21430->15402|21471->15404|21537->15441|21640->15515|21664->15516|21697->15520|21721->15521|21784->15564|21798->15568|21838->15569|21904->15606|21999->15672|22023->15673|22056->15677|22080->15678|22155->15721|22217->15751|22275->15777|22329->15802|22388->15829|22438->15850|22735->16116
                  LINES: 35->1|47->13|48->14|49->15|50->16|52->18|52->18|54->18|55->19|55->19|55->19|55->19|57->21|57->21|58->22|59->23|59->23|62->10|65->17|66->25|68->27|68->27|68->27|69->28|79->38|79->38|79->38|80->39|86->45|86->45|86->45|86->45|86->45|86->45|86->45|86->45|104->63|104->63|104->63|105->64|106->65|106->65|106->65|106->65|106->65|106->65|109->68|110->69|111->70|112->71|113->72|114->73|115->74|116->75|117->76|117->76|117->76|117->76|118->77|118->77|118->77|119->78|120->79|121->80|122->81|123->82|124->83|124->83|124->83|125->84|125->84|125->84|126->85|126->85|126->85|126->85|126->85|127->86|128->87|131->90|132->91|134->93|135->94|136->95|137->96|138->97|139->98|140->99|140->99|140->99|140->99|141->100|141->100|141->100|142->101|143->102|144->103|145->104|146->105|147->106|147->106|147->106|148->107|148->107|148->107|149->108|149->108|149->108|149->108|149->108|150->109|151->110|153->112|154->113|156->115|157->116|158->117|159->118|160->119|161->120|162->121|163->122|164->123|165->124|166->125|167->126|168->127|169->128|170->129|171->130|172->131|173->132|175->134|176->135|177->136|178->137|179->138|180->139|181->140|182->141|183->142|184->143|185->144|186->145|187->146|188->147|188->147|188->147|189->148|192->151|192->151|192->151|193->152|196->155|196->155|196->155|197->156|200->159|200->159|200->159|201->160|202->161|207->166|207->166|207->166|208->167|209->168|209->168|209->168|209->168|210->169|210->169|210->169|211->170|212->171|212->171|212->171|213->172|213->172|213->172|213->172|213->172|214->173|218->177|219->178|219->178|219->178|222->181|223->182|229->188|229->188|229->188|230->189|234->193|234->193|234->193|235->194|235->194|235->194|235->194|237->196|237->196|237->196|239->198|240->199|240->199|240->199|241->200|244->203|245->204|245->204|245->204|246->205|246->205|246->205|246->205|247->206|247->206|247->206|247->206|247->206|247->206|247->206|248->207|249->208|249->208|249->208|250->209|253->212|254->213|254->213|254->213|255->214|259->218|259->218|259->218|260->219|260->219|260->219|260->219|262->221|262->221|262->221|264->223|265->224|268->227|268->227|268->227|269->228|270->229|271->230|276->235|276->235|276->235|277->236|278->237|278->237|278->237|279->238|279->238|279->238|280->239|280->239|280->239|281->240|281->240|281->240|281->240|281->240|281->240|282->241|282->241|282->241|283->242|283->242|283->242|283->242|283->242|283->242|284->243|285->244|286->245|287->246|288->247|289->248|302->261|302->261|302->261|303->262|304->263|304->263|304->263|305->264|305->264|305->264|306->265|306->265|306->265|307->266|307->266|307->266|307->266|307->266|307->266|308->267|308->267|308->267|309->268|309->268|309->268|309->268|309->268|309->268|310->269|311->270|312->271|313->272|314->273|315->274|328->287|328->287|328->287|329->288|330->289|330->289|330->289|331->290|331->290|331->290|332->291|332->291|332->291|333->292|333->292|333->292|333->292|333->292|334->293|334->293|334->293|335->294|335->294|335->294|335->294|335->294|336->295|337->296|338->297|339->298|340->299|341->300|351->310
                  -- GENERATED --
              */
          