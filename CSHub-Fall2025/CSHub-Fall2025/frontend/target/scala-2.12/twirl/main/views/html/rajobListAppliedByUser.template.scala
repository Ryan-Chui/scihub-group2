
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

object rajobListAppliedByUser extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template10[List[RAJob],List[String],Integer,Integer,Integer,Integer,Integer,Long,Integer,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(rajobs: List[RAJob], applicationStatuses: List[String], pageNum: Integer, offset: Integer,
        total: Integer,
        count: Integer,
        pageLimit: Integer,
        id: Long,
        beginIndexForPagination: Integer,
        endIndexForPagination: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*8.2*/import helper._
/*9.2*/import models._
/*10.2*/import models.RAJob
/*11.2*/import scala.collection.immutable.Range

def /*13.2*/scripts/*13.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*13.13*/("""
    """),format.raw/*14.5*/("""<script type="module" src='"""),_display_(/*14.33*/routes/*14.39*/.Assets.at("javascripts/voiceJump.js")),format.raw/*14.77*/("""'></script>
    <script type="text/javascript">
            $(document).ready(function () """),format.raw/*16.43*/("""{"""),format.raw/*16.44*/("""
                """),format.raw/*17.17*/("""$('.tooltipped').tooltip();
            """),format.raw/*18.13*/("""}"""),format.raw/*18.14*/(""");
    </script>
""")))};
Seq[Any](format.raw/*7.40*/("""
"""),format.raw/*12.1*/("""
"""),format.raw/*20.2*/("""

"""),_display_(/*22.2*/main("My Applied RAJobs", scripts)/*22.36*/ {_display_(Seq[Any](format.raw/*22.38*/("""
    """),format.raw/*23.5*/("""<div class="container">
        <div class="card-panel center">
            <div class="row card-panel z-depth-0 project-zone-panel">
                <div class="col s12">
                    <h6 class="center tooltipped" data-position="bottom" data-tooltip="This list shows the RAJobs you applied for.">
                        My Applied RAJobs
                    </h6>
                </div>
            </div>

            """),_display_(/*33.14*/if(rajobs.size() > 0)/*33.35*/ {_display_(Seq[Any](format.raw/*33.37*/("""
                """),format.raw/*34.17*/("""<div class="col s12">
                    <h4>RAJob List</h4>
                </div>

                <div class="row">
                    <div class="col s6">
                        <h6 class="left">Showing results: """),_display_(/*40.60*/{offset + 1}),format.raw/*40.72*/(""" """),format.raw/*40.73*/("""to """),_display_(/*40.77*/{offset + count}),format.raw/*40.93*/(""" """),format.raw/*40.94*/("""of """),_display_(/*40.98*/total),format.raw/*40.103*/("""</h6>
                    </div>
                </div>

                <table class="centered responsive-table striped" id="appliedRAJobTable">
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
                    """),_display_(/*58.22*/for((entry, index) <- rajobs.zipWithIndex if entry.getStatus() != "closed" ) yield /*58.98*/ {_display_(Seq[Any](format.raw/*58.100*/("""
                        """),format.raw/*59.25*/("""<tr>
                            <td>"""),_display_(/*60.34*/entry/*60.39*/.getId()),format.raw/*60.47*/("""</td>


"""),format.raw/*63.62*/("""
"""),format.raw/*64.104*/("""
"""),format.raw/*65.58*/("""
"""),format.raw/*66.42*/("""
"""),format.raw/*67.41*/("""
"""),format.raw/*68.117*/("""
"""),format.raw/*69.34*/("""
                            """),format.raw/*70.29*/("""<td>
                                """),_display_(/*71.34*/if(entry.getTitle() != null && entry.getTitle().nonEmpty)/*71.91*/ {_display_(Seq[Any](format.raw/*71.93*/("""
                                    """),format.raw/*72.37*/("""<a href = """"),_display_(/*72.49*/routes/*72.55*/.RAJobController.rajobDetail(entry.getId())),format.raw/*72.98*/("""">"""),_display_(/*72.101*/entry/*72.106*/.getTitle()),format.raw/*72.117*/("""</a>
                                    <span class=""""),_display_(/*73.51*/entry/*73.56*/.getId()),format.raw/*73.64*/(""" """),format.raw/*73.65*/("""editable" data-name="title"></span>
"""),format.raw/*74.76*/("""
"""),format.raw/*75.82*/("""
"""),format.raw/*76.49*/("""
"""),format.raw/*77.62*/("""
"""),format.raw/*78.42*/("""
                                """)))}/*79.35*/else/*79.40*/{_display_(Seq[Any](format.raw/*79.41*/("""
                                    """),format.raw/*80.37*/("""<span class=""""),_display_(/*80.51*/entry/*80.56*/.getId()),format.raw/*80.64*/(""" """),format.raw/*80.65*/("""editable" data-name="title">&ensp; -</span>
                                """)))}),format.raw/*81.34*/("""
                            """),format.raw/*82.29*/("""</td>


                            """),format.raw/*85.101*/("""
"""),format.raw/*86.115*/("""

"""),format.raw/*88.69*/("""
"""),format.raw/*89.42*/("""
"""),format.raw/*90.41*/("""
"""),format.raw/*91.128*/("""
"""),format.raw/*92.34*/("""
                            """),format.raw/*93.29*/("""<td>
                                <span class=""""),_display_(/*94.47*/entry/*94.52*/.getId()),format.raw/*94.60*/(""" """),format.raw/*94.61*/("""editable" data-name="shortDescription"></span>
                                """),_display_(/*95.34*/if(entry.getShortDescription() != null && entry.getShortDescription().nonEmpty)/*95.113*/ {_display_(Seq[Any](format.raw/*95.115*/("""
"""),format.raw/*96.87*/("""
"""),format.raw/*97.93*/("""
"""),format.raw/*98.49*/("""
"""),format.raw/*99.73*/("""
"""),format.raw/*100.42*/("""
                                    """),_display_(/*101.38*/entry/*101.43*/.getShortDescription()),format.raw/*101.65*/("""
                                """)))}/*102.35*/else/*102.40*/{_display_(Seq[Any](format.raw/*102.41*/("""
                                    """),format.raw/*103.37*/("""<span class=""""),_display_(/*103.51*/entry/*103.56*/.getId()),format.raw/*103.64*/(""" """),format.raw/*103.65*/("""editable" data-name="shortDescription">&ensp; -</span>
                                """)))}),format.raw/*104.34*/("""
                            """),format.raw/*105.29*/("""</td>

"""),format.raw/*107.63*/("""
"""),format.raw/*108.105*/("""

"""),format.raw/*110.59*/("""
"""),format.raw/*111.42*/("""
"""),format.raw/*112.41*/("""
"""),format.raw/*113.118*/("""
"""),format.raw/*114.34*/("""
                            """),format.raw/*115.29*/("""<td>
                                <span class=""""),_display_(/*116.47*/entry/*116.52*/.getId()),format.raw/*116.60*/(""" """),format.raw/*116.61*/("""editable" data-name="fields"></span>
                                """),_display_(/*117.34*/if(entry.getFields() != null && entry.getFields().nonEmpty)/*117.93*/ {_display_(Seq[Any](format.raw/*117.95*/("""
"""),format.raw/*118.77*/("""
"""),format.raw/*119.83*/("""
"""),format.raw/*120.49*/("""
"""),format.raw/*121.63*/("""
"""),format.raw/*122.42*/("""
                                    """),_display_(/*123.38*/entry/*123.43*/.getFields()),format.raw/*123.55*/("""
                                """)))}/*124.35*/else/*124.40*/{_display_(Seq[Any](format.raw/*124.41*/("""
                                    """),format.raw/*125.37*/("""<span class=""""),_display_(/*125.51*/entry/*125.56*/.getId()),format.raw/*125.64*/(""" """),format.raw/*125.65*/("""editable" data-name="fields">&ensp; -</span>
                                """)))}),format.raw/*126.34*/("""
                            """),format.raw/*127.29*/("""</td>

"""),format.raw/*129.67*/("""
"""),format.raw/*130.41*/("""
"""),format.raw/*131.119*/("""
"""),format.raw/*132.42*/("""
"""),format.raw/*133.75*/("""
"""),format.raw/*134.37*/("""
"""),format.raw/*135.113*/("""
"""),format.raw/*136.38*/("""
"""),format.raw/*137.39*/("""
"""),format.raw/*138.37*/("""
"""),format.raw/*139.110*/("""
"""),format.raw/*140.38*/("""
"""),format.raw/*141.34*/("""
                            """),_display_(/*142.30*/if(entry.getStatus() == "closed")/*142.63*/ {_display_(Seq[Any](format.raw/*142.65*/("""
                                """),format.raw/*143.33*/("""<td>
                                    <span class="new badge grey darken-3" data-badge-caption="closed"></span>
                                </td>
                            """)))}/*146.31*/else if(applicationStatuses(index) == "open")/*146.76*/ {_display_(Seq[Any](format.raw/*146.78*/("""
                            """),format.raw/*147.29*/("""<td>
                                <span class="new badge light-green darken-1" data-badge-caption="open"></span>
                            </td>
                            """)))}/*150.31*/else if(applicationStatuses(index) == "pending")/*150.79*/ {_display_(Seq[Any](format.raw/*150.81*/("""
                            """),format.raw/*151.29*/("""<td>
                                <span class="new badge purple darken-1" data-badge-caption="pending"></span>
                            </td>
                            """)))}/*154.31*/else/*154.36*/{_display_(Seq[Any](format.raw/*154.37*/("""
                            """),format.raw/*155.29*/("""<td>&ensp; -</td>
                            """)))}),format.raw/*156.30*/("""



                            """),format.raw/*160.29*/("""<td>
                                <a class="waves-effect waves-light green darken-3 btn" href=""""),_display_(/*161.95*/routes/*161.101*/.RAJobController.rajobApplicationDetail(entry.getRajobApplicationId())),format.raw/*161.171*/("""">View </a>
                            </td>
                        </tr>
                    """)))}),format.raw/*164.22*/("""
                    """),format.raw/*165.21*/("""</tbody>
                </table>

                <div class="row">
                    <div class="col s12">
                        <ul class="pagination center-align">
                            """),_display_(/*171.30*/if(pageNum == 1)/*171.46*/ {_display_(Seq[Any](format.raw/*171.48*/("""
                                """),format.raw/*172.33*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    first_page</i></li>
                                <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    chevron_left</i></li>
                            """)))}/*176.31*/else/*176.36*/{_display_(Seq[Any](format.raw/*176.37*/("""
                                """),format.raw/*177.33*/("""<li class="waves-effect"><a href=""""),_display_(/*177.68*/routes/*177.74*/.RAJobController.rajobListAppliedByUser(1)),format.raw/*177.116*/(""""><i class="material-icons">
                                    first_page</i></a></li>
                                <li class="waves-effect"><a href=""""),_display_(/*179.68*/routes/*179.74*/.RAJobController.rajobListAppliedByUser(pageNum - 1)),format.raw/*179.126*/(""""><i class="material-icons">
                                    chevron_left</i></a></li>
                            """)))}),format.raw/*181.30*/("""
                            """),_display_(/*182.30*/if(beginIndexForPagination > 1)/*182.61*/ {_display_(Seq[Any](format.raw/*182.63*/("""
                                """),format.raw/*183.33*/("""<li class="waves-effect modal-trigger" href="#allPageModal" style="cursor: pointer;
                                    font-size: 20px;
                                    font-weight: bold">...</li>
                            """)))}),format.raw/*186.30*/("""
                            """),_display_(/*187.30*/for(i <- (beginIndexForPagination + 0) to (endIndexForPagination + 0)) yield /*187.100*/ {_display_(Seq[Any](format.raw/*187.102*/("""
                                """),format.raw/*188.33*/("""<li """),_display_(/*188.38*/if(pageNum == i)/*188.54*/ {_display_(Seq[Any](format.raw/*188.56*/("""
                                    """),format.raw/*189.37*/("""class="active"""")))}),format.raw/*189.52*/("""><a href=""""),_display_(/*189.63*/routes/*189.69*/.RAJobController.rajobListAppliedByUser(i)),format.raw/*189.111*/("""">"""),_display_(/*189.114*/i),format.raw/*189.115*/("""</a></li>
                            """)))}),format.raw/*190.30*/("""
                            """),_display_(/*191.30*/if(endIndexForPagination < ((total - 1) / pageLimit + 1))/*191.87*/ {_display_(Seq[Any](format.raw/*191.89*/("""
                                """),format.raw/*192.33*/("""<li class="waves-effect modal-trigger" href="#allPageModal" style="cursor: pointer;
                                    font-size: 20px;
                                    font-weight: bold">...</li>
                            """)))}),format.raw/*195.30*/("""
                            """),_display_(/*196.30*/if((offset + count) >= total)/*196.59*/ {_display_(Seq[Any](format.raw/*196.61*/("""
                                """),format.raw/*197.33*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    chevron_right</i></li>
                                <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    last_page</i></li>
                            """)))}/*201.31*/else/*201.36*/{_display_(Seq[Any](format.raw/*201.37*/("""
                                """),format.raw/*202.33*/("""<li class="waves-effect"><a href=""""),_display_(/*202.68*/routes/*202.74*/.RAJobController.rajobListAppliedByUser(pageNum + 1)),format.raw/*202.126*/(""""><i class="material-icons">
                                    chevron_right</i></a></li>
                                <li class="waves-effect"><a href=""""),_display_(/*204.68*/routes/*204.74*/.RAJobController.rajobListAppliedByUser((total - 1) / pageLimit + 1)),format.raw/*204.142*/(""""><i class="material-icons">
                                    last_page</i></a></li>
                            """)))}),format.raw/*206.30*/("""
                        """),format.raw/*207.25*/("""</ul>
                    </div>
                </div>
            """)))}/*210.15*/else/*210.20*/{_display_(Seq[Any](format.raw/*210.21*/("""
                """),format.raw/*211.17*/("""<h5>No RAjobs applied yet.</h5>
            """)))}),format.raw/*212.14*/("""
            """),format.raw/*213.13*/("""<div id="allPageModal" class="modal">
                <div class="modal-content">
                    <h6>Select the page number you want to jump to</h6>
                    <div class="card z-depth-0">

                    """),_display_(/*218.22*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*218.79*/ {_display_(Seq[Any](format.raw/*218.81*/("""
                        """),format.raw/*219.25*/("""<ul class="pagination center-align">
                        """),_display_(/*220.26*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*220.65*/ {_display_(Seq[Any](format.raw/*220.67*/("""
                            """),_display_(/*221.30*/if(j <= ((total - 1)/(pageLimit) + 1))/*221.68*/ {_display_(Seq[Any](format.raw/*221.70*/("""
                                """),_display_(/*222.34*/if(j != pageNum)/*222.50*/ {_display_(Seq[Any](format.raw/*222.52*/("""
                                    """),format.raw/*223.37*/("""<li class="waves-effect grey lighten-3"><a href='"""),_display_(/*223.87*/routes/*223.93*/.RAJobController.rajobListAppliedByUser(j)),format.raw/*223.135*/("""'>"""),_display_(/*223.138*/j),format.raw/*223.139*/("""</a></li>
                                """)))}/*224.34*/else/*224.38*/{_display_(Seq[Any](format.raw/*224.39*/("""
                                    """),format.raw/*225.37*/("""<li class="waves-effect active"><a href=""""),_display_(/*225.79*/routes/*225.85*/.RAJobController.rajobListAppliedByUser(j)),format.raw/*225.127*/("""">"""),_display_(/*225.130*/j),format.raw/*225.131*/("""</a></li>
                                """)))}),format.raw/*226.34*/("""
                            """)))}),format.raw/*227.30*/("""
                        """)))}),format.raw/*228.26*/("""
                        """),format.raw/*229.25*/("""</ul>
                    """)))}),format.raw/*230.22*/("""
                    """),format.raw/*231.21*/("""</div>
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

                    """),_display_(/*244.22*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*244.79*/ {_display_(Seq[Any](format.raw/*244.81*/("""
                        """),format.raw/*245.25*/("""<ul class="pagination center-align">
                        """),_display_(/*246.26*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*246.65*/ {_display_(Seq[Any](format.raw/*246.67*/("""
                            """),_display_(/*247.30*/if(j <= ((total - 1)/(pageLimit) + 1))/*247.68*/ {_display_(Seq[Any](format.raw/*247.70*/("""
                                """),_display_(/*248.34*/if(j != pageNum)/*248.50*/ {_display_(Seq[Any](format.raw/*248.52*/("""
                                    """),format.raw/*249.37*/("""<li class="waves-effect grey lighten-3"><a href='"""),_display_(/*249.87*/routes/*249.93*/.ProjectController.getMyEnrolledProjects(j, "")),format.raw/*249.140*/("""'>"""),_display_(/*249.143*/j),format.raw/*249.144*/("""</a></li>
                                """)))}/*250.34*/else/*250.38*/{_display_(Seq[Any](format.raw/*250.39*/("""
                                    """),format.raw/*251.37*/("""<li class="waves-effect active"><a href=""""),_display_(/*251.79*/routes/*251.85*/.ProjectController.getMyEnrolledProjects(j, "")),format.raw/*251.132*/("""">"""),_display_(/*251.135*/j),format.raw/*251.136*/("""</a></li>
                                """)))}),format.raw/*252.34*/("""
                            """)))}),format.raw/*253.30*/("""
                        """)))}),format.raw/*254.26*/("""
                        """),format.raw/*255.25*/("""</ul>
                    """)))}),format.raw/*256.22*/("""
                    """),format.raw/*257.21*/("""</div>
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

                    """),_display_(/*270.22*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*270.79*/ {_display_(Seq[Any](format.raw/*270.81*/("""
                        """),format.raw/*271.25*/("""<ul class="pagination center-align">
                        """),_display_(/*272.26*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*272.65*/ {_display_(Seq[Any](format.raw/*272.67*/("""
                            """),_display_(/*273.30*/if(j <= ((total - 1)/(pageLimit) + 1))/*273.68*/ {_display_(Seq[Any](format.raw/*273.70*/("""
                                """),_display_(/*274.34*/if(j != pageNum)/*274.50*/ {_display_(Seq[Any](format.raw/*274.52*/("""
                                    """),format.raw/*275.37*/("""<li class="waves-effect grey lighten-3"><a href='#!' onclick="jumpToPage("""),_display_(/*275.111*/j),format.raw/*275.112*/(""")">"""),_display_(/*275.116*/j),format.raw/*275.117*/("""</a></li>
                                """)))}/*276.34*/else/*276.38*/{_display_(Seq[Any](format.raw/*276.39*/("""
                                    """),format.raw/*277.37*/("""<li class="waves-effect active"><a href="#!" onclick="jumpToPage("""),_display_(/*277.103*/j),format.raw/*277.104*/(""")">"""),_display_(/*277.108*/j),format.raw/*277.109*/("""</a></li>
                                """)))}),format.raw/*278.34*/("""
                            """)))}),format.raw/*279.30*/("""
                        """)))}),format.raw/*280.26*/("""
                        """),format.raw/*281.25*/("""</ul>
                    """)))}),format.raw/*282.22*/("""
                    """),format.raw/*283.21*/("""</div>
                </div>
                <div class="modal-footer">
                    <a href="#!" class="modal-close waves-effect waves-green btn-flat">
                        Cancel</a>
                </div>
            </div>

        </div>
    </div>
""")))}),format.raw/*293.2*/("""
"""))
      }
    }
  }

  def render(rajobs:List[RAJob],applicationStatuses:List[String],pageNum:Integer,offset:Integer,total:Integer,count:Integer,pageLimit:Integer,id:Long,beginIndexForPagination:Integer,endIndexForPagination:Integer): play.twirl.api.HtmlFormat.Appendable = apply(rajobs,applicationStatuses,pageNum,offset,total,count,pageLimit,id,beginIndexForPagination,endIndexForPagination)

  def f:((List[RAJob],List[String],Integer,Integer,Integer,Integer,Integer,Long,Integer,Integer) => play.twirl.api.HtmlFormat.Appendable) = (rajobs,applicationStatuses,pageNum,offset,total,count,pageLimit,id,beginIndexForPagination,endIndexForPagination) => apply(rajobs,applicationStatuses,pageNum,offset,total,count,pageLimit,id,beginIndexForPagination,endIndexForPagination)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:35 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/rajobListAppliedByUser.scala.html
                  HASH: 592385571af0c06385b252bf279fbc09afbb6dbb
                  MATRIX: 1208->1|1548->270|1571->287|1595->304|1623->325|1676->367|1691->374|1772->378|1804->383|1859->411|1874->417|1933->455|2051->545|2080->546|2125->563|2193->603|2222->604|2279->268|2307->365|2335->622|2364->625|2407->659|2447->661|2479->666|2935->1095|2965->1116|3005->1118|3050->1135|3297->1355|3330->1367|3359->1368|3390->1372|3427->1388|3456->1389|3487->1393|3514->1398|4380->2237|4472->2313|4513->2315|4566->2340|4631->2378|4645->2383|4674->2391|4710->2460|4740->2564|4769->2622|4798->2664|4827->2705|4857->2822|4886->2856|4943->2885|5008->2923|5074->2980|5114->2982|5179->3019|5218->3031|5233->3037|5297->3080|5328->3083|5343->3088|5376->3099|5458->3154|5472->3159|5501->3167|5530->3168|5594->3279|5623->3361|5652->3410|5681->3472|5710->3514|5763->3549|5776->3554|5815->3555|5880->3592|5921->3606|5935->3611|5964->3619|5993->3620|6101->3697|6158->3726|6223->3834|6253->3949|6283->4019|6312->4061|6341->4102|6371->4230|6400->4264|6457->4293|6535->4344|6549->4349|6578->4357|6607->4358|6714->4438|6803->4517|6844->4519|6873->4606|6902->4699|6931->4748|6960->4821|6990->4863|7056->4901|7071->4906|7115->4928|7169->4963|7183->4968|7223->4969|7289->5006|7331->5020|7346->5025|7376->5033|7406->5034|7526->5122|7584->5151|7620->5220|7651->5325|7682->5385|7712->5427|7742->5468|7773->5586|7803->5620|7861->5649|7940->5700|7955->5705|7985->5713|8015->5714|8113->5784|8182->5843|8223->5845|8253->5922|8283->6005|8313->6054|8343->6117|8373->6159|8439->6197|8454->6202|8488->6214|8542->6249|8556->6254|8596->6255|8662->6292|8704->6306|8719->6311|8749->6319|8779->6320|8889->6398|8947->6427|8983->6500|9013->6541|9044->6660|9074->6702|9104->6777|9134->6814|9165->6927|9195->6965|9225->7004|9255->7041|9286->7151|9316->7189|9346->7223|9404->7253|9447->7286|9488->7288|9550->7321|9752->7504|9807->7549|9848->7551|9906->7580|10105->7760|10163->7808|10204->7810|10262->7839|10459->8017|10473->8022|10513->8023|10571->8052|10650->8099|10711->8131|10838->8230|10855->8236|10948->8306|11077->8403|11127->8424|11356->8625|11382->8641|11423->8643|11485->8676|11850->9022|11864->9027|11904->9028|11966->9061|12029->9096|12045->9102|12110->9144|12294->9300|12310->9306|12385->9358|12537->9478|12595->9508|12636->9539|12677->9541|12739->9574|13001->9804|13059->9834|13147->9904|13189->9906|13251->9939|13284->9944|13310->9960|13351->9962|13417->9999|13464->10014|13503->10025|13519->10031|13584->10073|13616->10076|13640->10077|13711->10116|13769->10146|13836->10203|13877->10205|13939->10238|14201->10468|14259->10498|14298->10527|14339->10529|14401->10562|14766->10908|14780->10913|14820->10914|14882->10947|14945->10982|14961->10988|15036->11040|15223->11199|15239->11205|15330->11273|15479->11390|15533->11415|15622->11485|15636->11490|15676->11491|15722->11508|15799->11553|15841->11566|16094->11791|16168->11848|16209->11850|16263->11875|16353->11937|16409->11976|16450->11978|16508->12008|16556->12046|16597->12048|16659->12082|16685->12098|16726->12100|16792->12137|16870->12187|16886->12193|16951->12235|16983->12238|17007->12239|17070->12282|17084->12286|17124->12287|17190->12324|17260->12366|17276->12372|17341->12414|17373->12417|17397->12418|17472->12461|17534->12491|17592->12517|17646->12542|17705->12569|17755->12590|18262->13069|18336->13126|18377->13128|18431->13153|18521->13215|18577->13254|18618->13256|18676->13286|18724->13324|18765->13326|18827->13360|18853->13376|18894->13378|18960->13415|19038->13465|19054->13471|19124->13518|19156->13521|19180->13522|19243->13565|19257->13569|19297->13570|19363->13607|19433->13649|19449->13655|19519->13702|19551->13705|19575->13706|19650->13749|19712->13779|19770->13805|19824->13830|19883->13857|19933->13878|20440->14357|20514->14414|20555->14416|20609->14441|20699->14503|20755->14542|20796->14544|20854->14574|20902->14612|20943->14614|21005->14648|21031->14664|21072->14666|21138->14703|21241->14777|21265->14778|21298->14782|21322->14783|21385->14826|21399->14830|21439->14831|21505->14868|21600->14934|21624->14935|21657->14939|21681->14940|21756->14983|21818->15013|21876->15039|21930->15064|21989->15091|22039->15112|22336->15378
                  LINES: 35->1|44->8|45->9|46->10|47->11|49->13|49->13|51->13|52->14|52->14|52->14|52->14|54->16|54->16|55->17|56->18|56->18|59->7|60->12|61->20|63->22|63->22|63->22|64->23|74->33|74->33|74->33|75->34|81->40|81->40|81->40|81->40|81->40|81->40|81->40|81->40|99->58|99->58|99->58|100->59|101->60|101->60|101->60|104->63|105->64|106->65|107->66|108->67|109->68|110->69|111->70|112->71|112->71|112->71|113->72|113->72|113->72|113->72|113->72|113->72|113->72|114->73|114->73|114->73|114->73|115->74|116->75|117->76|118->77|119->78|120->79|120->79|120->79|121->80|121->80|121->80|121->80|121->80|122->81|123->82|126->85|127->86|129->88|130->89|131->90|132->91|133->92|134->93|135->94|135->94|135->94|135->94|136->95|136->95|136->95|137->96|138->97|139->98|140->99|141->100|142->101|142->101|142->101|143->102|143->102|143->102|144->103|144->103|144->103|144->103|144->103|145->104|146->105|148->107|149->108|151->110|152->111|153->112|154->113|155->114|156->115|157->116|157->116|157->116|157->116|158->117|158->117|158->117|159->118|160->119|161->120|162->121|163->122|164->123|164->123|164->123|165->124|165->124|165->124|166->125|166->125|166->125|166->125|166->125|167->126|168->127|170->129|171->130|172->131|173->132|174->133|175->134|176->135|177->136|178->137|179->138|180->139|181->140|182->141|183->142|183->142|183->142|184->143|187->146|187->146|187->146|188->147|191->150|191->150|191->150|192->151|195->154|195->154|195->154|196->155|197->156|201->160|202->161|202->161|202->161|205->164|206->165|212->171|212->171|212->171|213->172|217->176|217->176|217->176|218->177|218->177|218->177|218->177|220->179|220->179|220->179|222->181|223->182|223->182|223->182|224->183|227->186|228->187|228->187|228->187|229->188|229->188|229->188|229->188|230->189|230->189|230->189|230->189|230->189|230->189|230->189|231->190|232->191|232->191|232->191|233->192|236->195|237->196|237->196|237->196|238->197|242->201|242->201|242->201|243->202|243->202|243->202|243->202|245->204|245->204|245->204|247->206|248->207|251->210|251->210|251->210|252->211|253->212|254->213|259->218|259->218|259->218|260->219|261->220|261->220|261->220|262->221|262->221|262->221|263->222|263->222|263->222|264->223|264->223|264->223|264->223|264->223|264->223|265->224|265->224|265->224|266->225|266->225|266->225|266->225|266->225|266->225|267->226|268->227|269->228|270->229|271->230|272->231|285->244|285->244|285->244|286->245|287->246|287->246|287->246|288->247|288->247|288->247|289->248|289->248|289->248|290->249|290->249|290->249|290->249|290->249|290->249|291->250|291->250|291->250|292->251|292->251|292->251|292->251|292->251|292->251|293->252|294->253|295->254|296->255|297->256|298->257|311->270|311->270|311->270|312->271|313->272|313->272|313->272|314->273|314->273|314->273|315->274|315->274|315->274|316->275|316->275|316->275|316->275|316->275|317->276|317->276|317->276|318->277|318->277|318->277|318->277|318->277|319->278|320->279|321->280|322->281|323->282|324->283|334->293
                  -- GENERATED --
              */
          