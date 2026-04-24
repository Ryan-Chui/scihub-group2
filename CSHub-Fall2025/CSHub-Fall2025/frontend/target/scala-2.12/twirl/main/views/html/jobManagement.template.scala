
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

object jobManagement extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[List[com.fasterxml.jackson.databind.node.ObjectNode],Integer,String,Integer,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(jobs: List[com.fasterxml.jackson.databind.node.ObjectNode], pageNum: Integer, sortCriteria: String, totalCount: Integer, totalPages: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._
/*4.2*/import models._

def /*6.2*/scripts/*6.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.13*/("""
    """),format.raw/*7.5*/("""<script type="text/javascript">
            $(document).ready(function() """),format.raw/*8.42*/("""{"""),format.raw/*8.43*/("""
                """),format.raw/*9.17*/("""$('.tooltipped').tooltip();
            """),format.raw/*10.13*/("""}"""),format.raw/*10.14*/(""");
    </script>
""")))};
Seq[Any](format.raw/*1.144*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*12.2*/("""

"""),_display_(/*14.2*/main("Job Managemant - Admin Dashboard", scripts)/*14.51*/ {_display_(Seq[Any](format.raw/*14.53*/("""
    """),format.raw/*15.5*/("""<div class="container">
        <div class="card-panel">
            <div class="row">
                <div class="col s12">
                    <h4 class="center">Job Management</h4>
                </div>
            </div>

            """),_display_(/*23.14*/if(jobs.size() > 0)/*23.33*/ {_display_(Seq[Any](format.raw/*23.35*/("""
                """),format.raw/*24.17*/("""<div class="row">
                    <div class="col s6">
                        <h6 class="left"> """),_display_(/*26.44*/totalCount),format.raw/*26.54*/(""" """),format.raw/*26.55*/("""jobs，Page """),_display_(/*26.66*/pageNum),format.raw/*26.73*/(""" """),format.raw/*26.74*/("""</h6>
                    </div>
                    <div class="col s6" style="padding-top: -5px; margin-top: -2px">
                        <a class='dropdown-trigger btn-flat right' href='#' data-target='dropdown-sort' style="text-transform: none; font-weight: bold; color: black;">
                            Sort: &nbsp; <font color="#3a5dc3">
                            """),_display_(/*31.30*/if(sortCriteria.equals("id"))/*31.59*/ {_display_(Seq[Any](format.raw/*31.61*/("""
                                """),format.raw/*32.33*/("""jobID
                            """)))}/*33.31*/else if(sortCriteria.equals("title"))/*33.68*/ {_display_(Seq[Any](format.raw/*33.70*/("""
                        """),format.raw/*34.25*/("""title
                        """)))}/*35.27*/else if(sortCriteria.equals("publishDate"))/*35.70*/ {_display_(Seq[Any](format.raw/*35.72*/("""
                        """),format.raw/*36.25*/("""publishDate
                        """)))}/*37.27*/else if(sortCriteria.equals("status"))/*37.65*/ {_display_(Seq[Any](format.raw/*37.67*/("""
                        """),format.raw/*38.25*/("""status
                        """)))}/*39.27*/else/*39.32*/{_display_(Seq[Any](format.raw/*39.33*/("""
                        """),format.raw/*40.25*/("""jobID
                        """)))}),format.raw/*41.26*/("""
                        """),format.raw/*42.25*/("""</font> <i class="material-icons right">expand_more</i>
                        </a>

                        <ul id='dropdown-sort' class='dropdown-content'>
                            <li><a href=""""),_display_(/*46.43*/routes/*46.49*/.AdminController.jobManagement(1, "id")),format.raw/*46.88*/("""" class="grey-text text-darken-4">
                                <i class="material-icons">tag</i>ID</a></li>
                            <li><a href=""""),_display_(/*48.43*/routes/*48.49*/.AdminController.jobManagement(1, "title")),format.raw/*48.91*/("""" class="grey-text text-darken-4">
                                <i class="material-icons">work</i>title</a></li>
                            <li><a href=""""),_display_(/*50.43*/routes/*50.49*/.AdminController.jobManagement(1, "publishDate")),format.raw/*50.97*/("""" class="grey-text text-darken-4">
                                <i class="material-icons">schedule</i>publish Date</a></li>
                            <li><a href=""""),_display_(/*52.43*/routes/*52.49*/.AdminController.jobManagement(1, "status")),format.raw/*52.92*/("""" class="grey-text text-darken-4">
                                <i class="material-icons">info</i>status</a></li>
                        </ul>
                    </div>
                </div>

                <table class="centered responsive-table striped">
                    <thead>
                        <tr class="list-header">
                            <th>jobID</th>
                            <th>job Type</th>
                            <th>job Title</th>
                            <th>organization</th>
                            <th>location</th>
                            <th>publish date</th>
                            <th>status</th>
                            <th>applier amount</th>
                            <th>publisher</th>
                            <th>action</th>
                        </tr>
                    </thead>
                    <tbody>
                    """),_display_(/*74.22*/for(job <- jobs) yield /*74.38*/ {_display_(Seq[Any](format.raw/*74.40*/("""
                        """),format.raw/*75.25*/("""<tr>
                            <td>"""),_display_(/*76.34*/job/*76.37*/.get("id").asText()),format.raw/*76.56*/("""</td>
                            <td>
                            """),_display_(/*78.30*/if(job.get("type").asText() == "Job")/*78.67*/ {_display_(Seq[Any](format.raw/*78.69*/("""
                                """),format.raw/*79.33*/("""<span class="chip blue white-text">job</span>
                            """)))}/*80.31*/else/*80.36*/{_display_(Seq[Any](format.raw/*80.37*/("""
                                """),format.raw/*81.33*/("""<span class="chip green white-text">RA job</span>
                            """)))}),format.raw/*82.30*/("""
                            """),format.raw/*83.29*/("""</td>
                            <td>
                                <a href=""""),_display_(/*85.43*/routes/*85.49*/.AdminController.jobDetail(job.get("type").asText(), job.get("id").asLong())),format.raw/*85.125*/("""">
                                """),_display_(/*86.34*/job/*86.37*/.get("title").asText()),format.raw/*86.59*/("""
                                """),format.raw/*87.33*/("""</a>
                            </td>
                            <td>"""),_display_(/*89.34*/job/*89.37*/.get("organization").asText()),format.raw/*89.66*/("""</td>
                            <td>"""),_display_(/*90.34*/job/*90.37*/.get("location").asText()),format.raw/*90.62*/("""</td>
                            <td>"""),_display_(/*91.34*/job/*91.37*/.get("publishDate").asText()),format.raw/*91.65*/("""</td>
                            <td>
                                """),_display_(/*93.34*/if(job.get("status").asText() == "open")/*93.74*/ {_display_(Seq[Any](format.raw/*93.76*/("""
                                    """),format.raw/*94.37*/("""<span class="chip green white-text">open</span>
                                """)))}/*95.35*/else if(job.get("status").asText() == "closed")/*95.82*/ {_display_(Seq[Any](format.raw/*95.84*/("""
                            """),format.raw/*96.29*/("""<span class="chip red white-text">closed</span>
                                """)))}/*97.35*/else/*97.40*/{_display_(Seq[Any](format.raw/*97.41*/("""
                            """),format.raw/*98.29*/("""<span class="chip grey white-text">"""),_display_(/*98.65*/job/*98.68*/.get("status").asText()),format.raw/*98.91*/("""</span>
                                """)))}),format.raw/*99.34*/("""
                            """),format.raw/*100.29*/("""</td>
                            <td>"""),_display_(/*101.34*/job/*101.37*/.get("numberOfApplicants").asInt()),format.raw/*101.71*/("""</td>
                            <td>"""),_display_(/*102.34*/job/*102.37*/.get("publisher").asText()),format.raw/*102.63*/("""</td>
                            <td>
                                <a href=""""),_display_(/*104.43*/routes/*104.49*/.AdminController.jobDetail(job.get("type").asText(), job.get("id").asLong())),format.raw/*104.125*/(""""
                                class="btn-small blue tooltipped" data-position="top" data-tooltip="check detail">
                                    <i class="material-icons">visibility</i>
                                </a>
                            </td>
                        </tr>
                    """)))}),format.raw/*110.22*/("""
                    """),format.raw/*111.21*/("""</tbody>
                </table>

                    <!-- Pagination -->
                """),_display_(/*115.18*/if(totalPages > 1)/*115.36*/ {_display_(Seq[Any](format.raw/*115.38*/("""
                    """),format.raw/*116.21*/("""<div class="row">
                        <div class="col s12">
                            <ul class="pagination center-align">
                                """),_display_(/*119.34*/if(pageNum == 1)/*119.50*/ {_display_(Seq[Any](format.raw/*119.52*/("""
                                    """),format.raw/*120.37*/("""<li class="waves-effect disabled">
                                        <i class="material-icons">chevron_left</i>
                                    </li>
                                """)))}/*123.35*/else/*123.40*/{_display_(Seq[Any](format.raw/*123.41*/("""
                                    """),format.raw/*124.37*/("""<li class="waves-effect">
                                        <a href=""""),_display_(/*125.51*/routes/*125.57*/.AdminController.jobManagement(pageNum - 1, sortCriteria)),format.raw/*125.114*/("""">
                                            <i class="material-icons">chevron_left</i>
                                        </a>
                                    </li>
                                """)))}),format.raw/*129.34*/("""

                                """),_display_(/*131.34*/for(i <- 1 to totalPages) yield /*131.59*/ {_display_(Seq[Any](format.raw/*131.61*/("""
                                    """),_display_(/*132.38*/if(i == pageNum)/*132.54*/ {_display_(Seq[Any](format.raw/*132.56*/("""
                                        """),format.raw/*133.41*/("""<li class="active">
                                            <a href=""""),_display_(/*134.55*/routes/*134.61*/.AdminController.jobManagement(i, sortCriteria)),format.raw/*134.108*/("""">"""),_display_(/*134.111*/i),format.raw/*134.112*/("""</a>
                                        </li>
                                    """)))}/*136.39*/else/*136.44*/{_display_(Seq[Any](format.raw/*136.45*/("""
                                        """),format.raw/*137.41*/("""<li class="waves-effect">
                                            <a href=""""),_display_(/*138.55*/routes/*138.61*/.AdminController.jobManagement(i, sortCriteria)),format.raw/*138.108*/("""">"""),_display_(/*138.111*/i),format.raw/*138.112*/("""</a>
                                        </li>
                                    """)))}),format.raw/*140.38*/("""
                                """)))}),format.raw/*141.34*/("""

                                """),_display_(/*143.34*/if(pageNum == totalPages)/*143.59*/ {_display_(Seq[Any](format.raw/*143.61*/("""
                                    """),format.raw/*144.37*/("""<li class="waves-effect disabled">
                                        <i class="material-icons">chevron_right</i>
                                    </li>
                                """)))}/*147.35*/else/*147.40*/{_display_(Seq[Any](format.raw/*147.41*/("""
                                    """),format.raw/*148.37*/("""<li class="waves-effect">
                                        <a href=""""),_display_(/*149.51*/routes/*149.57*/.AdminController.jobManagement(pageNum + 1, sortCriteria)),format.raw/*149.114*/("""">
                                            <i class="material-icons">chevron_right</i>
                                        </a>
                                    </li>
                                """)))}),format.raw/*153.34*/("""
                            """),format.raw/*154.29*/("""</ul>
                        </div>
                    </div>
                """)))}),format.raw/*157.18*/("""
            """)))}/*158.15*/else/*158.20*/{_display_(Seq[Any](format.raw/*158.21*/("""
                """),format.raw/*159.17*/("""<div class="row">
                    <div class="col s12 center">
                        <h5>no job data</h5>
                    </div>
                </div>
            """)))}),format.raw/*164.14*/("""
        """),format.raw/*165.9*/("""</div>
    </div>
""")))}))
      }
    }
  }

  def render(jobs:List[com.fasterxml.jackson.databind.node.ObjectNode],pageNum:Integer,sortCriteria:String,totalCount:Integer,totalPages:Integer): play.twirl.api.HtmlFormat.Appendable = apply(jobs,pageNum,sortCriteria,totalCount,totalPages)

  def f:((List[com.fasterxml.jackson.databind.node.ObjectNode],Integer,String,Integer,Integer) => play.twirl.api.HtmlFormat.Appendable) = (jobs,pageNum,sortCriteria,totalCount,totalPages) => apply(jobs,pageNum,sortCriteria,totalCount,totalPages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:33 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/jobManagement.scala.html
                  HASH: aeff7d43f11c0df54f0c6cd7064ebcd2bc12d5d6
                  MATRIX: 1196->1|1411->146|1434->163|1462->181|1476->188|1556->192|1587->197|1687->270|1715->271|1759->288|1827->328|1856->329|1914->143|1942->179|1970->347|1999->350|2057->399|2097->401|2129->406|2396->646|2424->665|2464->667|2509->684|2638->786|2669->796|2698->797|2736->808|2764->815|2793->816|3199->1195|3237->1224|3277->1226|3338->1259|3392->1295|3438->1332|3478->1334|3531->1359|3581->1391|3633->1434|3673->1436|3726->1461|3782->1499|3829->1537|3869->1539|3922->1564|3973->1597|3986->1602|4025->1603|4078->1628|4140->1659|4193->1684|4421->1885|4436->1891|4496->1930|4677->2084|4692->2090|4755->2132|4940->2290|4955->2296|5024->2344|5220->2513|5235->2519|5299->2562|6244->3480|6276->3496|6316->3498|6369->3523|6434->3561|6446->3564|6486->3583|6581->3651|6627->3688|6667->3690|6728->3723|6822->3799|6835->3804|6874->3805|6935->3838|7045->3917|7102->3946|7210->4027|7225->4033|7323->4109|7386->4145|7398->4148|7441->4170|7502->4203|7601->4275|7613->4278|7663->4307|7729->4346|7741->4349|7787->4374|7853->4413|7865->4416|7914->4444|8013->4516|8062->4556|8102->4558|8167->4595|8267->4677|8323->4724|8363->4726|8420->4755|8520->4837|8533->4842|8572->4843|8629->4872|8692->4908|8704->4911|8748->4934|8820->4975|8878->5004|8945->5043|8958->5046|9014->5080|9081->5119|9094->5122|9142->5148|9251->5229|9267->5235|9366->5311|9714->5627|9764->5648|9884->5740|9912->5758|9953->5760|10003->5781|10193->5943|10219->5959|10260->5961|10326->5998|10539->6192|10553->6197|10593->6198|10659->6235|10763->6311|10779->6317|10859->6374|11101->6584|11164->6619|11206->6644|11247->6646|11313->6684|11339->6700|11380->6702|11450->6743|11552->6817|11568->6823|11638->6870|11670->6873|11694->6874|11802->6963|11816->6968|11856->6969|11926->7010|12034->7090|12050->7096|12120->7143|12152->7146|12176->7147|12296->7235|12362->7269|12425->7304|12460->7329|12501->7331|12567->7368|12781->7563|12795->7568|12835->7569|12901->7606|13005->7682|13021->7688|13101->7745|13344->7956|13402->7985|13515->8066|13549->8081|13563->8086|13603->8087|13649->8104|13856->8279|13893->8288
                  LINES: 35->1|38->3|39->4|41->6|41->6|43->6|44->7|45->8|45->8|46->9|47->10|47->10|50->1|52->5|53->12|55->14|55->14|55->14|56->15|64->23|64->23|64->23|65->24|67->26|67->26|67->26|67->26|67->26|67->26|72->31|72->31|72->31|73->32|74->33|74->33|74->33|75->34|76->35|76->35|76->35|77->36|78->37|78->37|78->37|79->38|80->39|80->39|80->39|81->40|82->41|83->42|87->46|87->46|87->46|89->48|89->48|89->48|91->50|91->50|91->50|93->52|93->52|93->52|115->74|115->74|115->74|116->75|117->76|117->76|117->76|119->78|119->78|119->78|120->79|121->80|121->80|121->80|122->81|123->82|124->83|126->85|126->85|126->85|127->86|127->86|127->86|128->87|130->89|130->89|130->89|131->90|131->90|131->90|132->91|132->91|132->91|134->93|134->93|134->93|135->94|136->95|136->95|136->95|137->96|138->97|138->97|138->97|139->98|139->98|139->98|139->98|140->99|141->100|142->101|142->101|142->101|143->102|143->102|143->102|145->104|145->104|145->104|151->110|152->111|156->115|156->115|156->115|157->116|160->119|160->119|160->119|161->120|164->123|164->123|164->123|165->124|166->125|166->125|166->125|170->129|172->131|172->131|172->131|173->132|173->132|173->132|174->133|175->134|175->134|175->134|175->134|175->134|177->136|177->136|177->136|178->137|179->138|179->138|179->138|179->138|179->138|181->140|182->141|184->143|184->143|184->143|185->144|188->147|188->147|188->147|189->148|190->149|190->149|190->149|194->153|195->154|198->157|199->158|199->158|199->158|200->159|205->164|206->165
                  -- GENERATED --
              */
          