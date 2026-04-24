
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

object technologyManagement extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[List[Technology],Integer,String,Integer,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(technologies: List[Technology], pageNum: Integer, sortCriteria: String, totalCount: Integer, totalPages: Integer):play.twirl.api.HtmlFormat.Appendable = {
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
Seq[Any](format.raw/*1.116*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*12.2*/("""

"""),_display_(/*14.2*/main("Technology - Admin Dashboard", scripts)/*14.47*/ {_display_(Seq[Any](format.raw/*14.49*/("""
    """),format.raw/*15.5*/("""<div class="container">
        <div class="row">
            <div class="col s12">
                <nav class="breadcrumb-nav">
                    <div class="nav-wrapper">
                    </div>
                </nav>
            </div>
        </div>

        <div class="card-panel">
            <div class="row">
                <div class="col s12">
                    <h4 class="center">Technology Management</h4>
                </div>
            </div>

            """),_display_(/*32.14*/if(technologies.size() > 0)/*32.41*/ {_display_(Seq[Any](format.raw/*32.43*/("""
                """),format.raw/*33.17*/("""<div class="row">
                    <div class="col s6">
                        <h6 class="left"> """),_display_(/*35.44*/totalCount),format.raw/*35.54*/(""" """),format.raw/*35.55*/("""techonolies in total,Page """),_display_(/*35.82*/pageNum),format.raw/*35.89*/(""" """),format.raw/*35.90*/("""</h6>
                    </div>
                    <div class="col s6" style="padding-top: -5px; margin-top: -2px">
                        <a class='dropdown-trigger btn-flat right' href='#' data-target='dropdown-sort' style="text-transform: none; font-weight: bold; color: black;">
                            Sort: &nbsp; <font color="#3a5dc3">
                            """),_display_(/*40.30*/if(sortCriteria.equals("id"))/*40.59*/ {_display_(Seq[Any](format.raw/*40.61*/("""
                                """),format.raw/*41.33*/("""ID
                            """)))}/*42.31*/else if(sortCriteria.equals("technologyTitle"))/*42.78*/ {_display_(Seq[Any](format.raw/*42.80*/("""
                        """),format.raw/*43.25*/("""title
                        """)))}/*44.27*/else if(sortCriteria.equals("registeredTime"))/*44.73*/ {_display_(Seq[Any](format.raw/*44.75*/("""
                        """),format.raw/*45.25*/("""registered time
                        """)))}/*46.27*/else/*46.32*/{_display_(Seq[Any](format.raw/*46.33*/("""
                        """),format.raw/*47.25*/("""ID
                        """)))}),format.raw/*48.26*/("""
                        """),format.raw/*49.25*/("""</font> <i class="material-icons right">expand_more</i>
                        </a>

                        <ul id='dropdown-sort' class='dropdown-content'>
                            <li><a href=""""),_display_(/*53.43*/routes/*53.49*/.AdminController.technologyManagement(1, "id")),format.raw/*53.95*/("""" class="grey-text text-darken-4">
                                <i class="material-icons">tag</i>ID</a></li>
                            <li><a href=""""),_display_(/*55.43*/routes/*55.49*/.AdminController.technologyManagement(1, "technologyTitle")),format.raw/*55.108*/("""" class="grey-text text-darken-4">
                                <i class="material-icons">title</i>title</a></li>
                            <li><a href=""""),_display_(/*57.43*/routes/*57.49*/.AdminController.technologyManagement(1, "registeredTime")),format.raw/*57.107*/("""" class="grey-text text-darken-4">
                                <i class="material-icons">schedule</i>registered time</a></li>
                        </ul>
                    </div>
                </div>

                <table class="centered responsive-table striped">
                    <thead>
                        <tr class="list-header">
                            <th>ID</th>
                            <th>title</th>
                            <th>Goals</th>
                            <th>Keywords</th>
                            <th>PIName</th>
                            <th>TeamMembers</th>
                            <th>Organizations</th>
                            <th>Rating</th>
                            <th>IsActive</th>
                            <th>RegisteredTime</th>
                            <th>Action</th>
                        </tr>
                    </thead>
                    <tbody>
                    """),_display_(/*80.22*/for(tech <- technologies) yield /*80.47*/ {_display_(Seq[Any](format.raw/*80.49*/("""
                        """),format.raw/*81.25*/("""<tr>
                            <td>"""),_display_(/*82.34*/tech/*82.38*/.getId()),format.raw/*82.46*/("""</td>
                            <td>
                                <div class="truncate" style="max-width: 200px;" title=""""),_display_(/*84.89*/tech/*84.93*/.getTechnologyTitle()),format.raw/*84.114*/("""">
                                    <a href=""""),_display_(/*85.47*/routes/*85.53*/.TechnologyController.technologyDetail(tech.getId())),format.raw/*85.105*/("""" class="blue-text">
                                    """),_display_(/*86.38*/tech/*86.42*/.getTechnologyTitle()),format.raw/*86.63*/("""
                                    """),format.raw/*87.37*/("""</a>
                                </div>
                            </td>
                            <td>
                                <div class="truncate" style="max-width: 150px;" title=""""),_display_(/*91.89*/tech/*91.93*/.getGoals()),format.raw/*91.104*/("""">
                                """),_display_(/*92.34*/tech/*92.38*/.getGoals()),format.raw/*92.49*/("""
                                """),format.raw/*93.33*/("""</div>
                            </td>
                            <td>
                                <div class="truncate" style="max-width: 150px;" title=""""),_display_(/*96.89*/tech/*96.93*/.getKeywords()),format.raw/*96.107*/("""">
                                """),_display_(/*97.34*/tech/*97.38*/.getKeywords()),format.raw/*97.52*/("""
                                """),format.raw/*98.33*/("""</div>
                            </td>
                            <td>"""),_display_(/*100.34*/tech/*100.38*/.getPIName()),format.raw/*100.50*/("""</td>
                            <td>
                                <div class="truncate" style="max-width: 150px;" title=""""),_display_(/*102.89*/tech/*102.93*/.getTeamMembers()),format.raw/*102.110*/("""">
                                """),_display_(/*103.34*/tech/*103.38*/.getTeamMembers()),format.raw/*103.55*/("""
                                """),format.raw/*104.33*/("""</div>
                            </td>
                            <td>
                                <div class="truncate" style="max-width: 150px;" title=""""),_display_(/*107.89*/tech/*107.93*/.getOrganizations()),format.raw/*107.112*/("""">
                                """),_display_(/*108.34*/tech/*108.38*/.getOrganizations()),format.raw/*108.57*/("""
                                """),format.raw/*109.33*/("""</div>
                            </td>
                            <td>
                            """),_display_(/*112.30*/if(tech.getIsActive() == "True")/*112.62*/ {_display_(Seq[Any](format.raw/*112.64*/("""
                                """),format.raw/*113.33*/("""<span class="chip green white-text">active</span>
                            """)))}/*114.31*/else/*114.36*/{_display_(Seq[Any](format.raw/*114.37*/("""
                                """),format.raw/*115.33*/("""<span class="chip red white-text">inactive</span>
                            """)))}),format.raw/*116.30*/("""
                            """),format.raw/*117.29*/("""</td>
                            <td>"""),_display_(/*118.34*/tech/*118.38*/.getRegisteredTime()),format.raw/*118.58*/("""</td>
                            <td>
                                <a href=""""),_display_(/*120.43*/routes/*120.49*/.TechnologyController.technologyDetail(tech.getId())),format.raw/*120.101*/(""""
                                class="btn-small blue tooltipped" data-position="top" data-tooltip="view detail">
                                    <i class="material-icons">visibility</i>
                                </a>
                            </td>
                        </tr>
                    """)))}),format.raw/*126.22*/("""
                    """),format.raw/*127.21*/("""</tbody>
                </table>

                    <!-- Pagination -->
                """),_display_(/*131.18*/if(totalPages > 1)/*131.36*/ {_display_(Seq[Any](format.raw/*131.38*/("""
                    """),format.raw/*132.21*/("""<div class="row">
                        <div class="col s12">
                            <ul class="pagination center-align">
                                """),_display_(/*135.34*/if(pageNum == 1)/*135.50*/ {_display_(Seq[Any](format.raw/*135.52*/("""
                                    """),format.raw/*136.37*/("""<li class="waves-effect disabled">
                                        <i class="material-icons">chevron_left</i>
                                    </li>
                                """)))}/*139.35*/else/*139.40*/{_display_(Seq[Any](format.raw/*139.41*/("""
                                    """),format.raw/*140.37*/("""<li class="waves-effect">
                                        <a href=""""),_display_(/*141.51*/routes/*141.57*/.AdminController.technologyManagement(pageNum - 1, sortCriteria)),format.raw/*141.121*/("""">
                                            <i class="material-icons">chevron_left</i>
                                        </a>
                                    </li>
                                """)))}),format.raw/*145.34*/("""

                                """),_display_(/*147.34*/for(i <- 1 to totalPages) yield /*147.59*/ {_display_(Seq[Any](format.raw/*147.61*/("""
                                    """),_display_(/*148.38*/if(i == pageNum)/*148.54*/ {_display_(Seq[Any](format.raw/*148.56*/("""
                                        """),format.raw/*149.41*/("""<li class="active">
                                            <a href=""""),_display_(/*150.55*/routes/*150.61*/.AdminController.technologyManagement(i, sortCriteria)),format.raw/*150.115*/("""">"""),_display_(/*150.118*/i),format.raw/*150.119*/("""</a>
                                        </li>
                                    """)))}/*152.39*/else/*152.44*/{_display_(Seq[Any](format.raw/*152.45*/("""
                                        """),format.raw/*153.41*/("""<li class="waves-effect">
                                            <a href=""""),_display_(/*154.55*/routes/*154.61*/.AdminController.technologyManagement(i, sortCriteria)),format.raw/*154.115*/("""">"""),_display_(/*154.118*/i),format.raw/*154.119*/("""</a>
                                        </li>
                                    """)))}),format.raw/*156.38*/("""
                                """)))}),format.raw/*157.34*/("""

                                """),_display_(/*159.34*/if(pageNum == totalPages)/*159.59*/ {_display_(Seq[Any](format.raw/*159.61*/("""
                                    """),format.raw/*160.37*/("""<li class="waves-effect disabled">
                                        <i class="material-icons">chevron_right</i>
                                    </li>
                                """)))}/*163.35*/else/*163.40*/{_display_(Seq[Any](format.raw/*163.41*/("""
                                    """),format.raw/*164.37*/("""<li class="waves-effect">
                                        <a href=""""),_display_(/*165.51*/routes/*165.57*/.AdminController.technologyManagement(pageNum + 1, sortCriteria)),format.raw/*165.121*/("""">
                                            <i class="material-icons">chevron_right</i>
                                        </a>
                                    </li>
                                """)))}),format.raw/*169.34*/("""
                            """),format.raw/*170.29*/("""</ul>
                        </div>
                    </div>
                """)))}),format.raw/*173.18*/("""
            """)))}/*174.15*/else/*174.20*/{_display_(Seq[Any](format.raw/*174.21*/("""
                """),format.raw/*175.17*/("""<div class="row">
                    <div class="col s12 center">
                        <h5>No technology data</h5>
                    </div>
                </div>
            """)))}),format.raw/*180.14*/("""
        """),format.raw/*181.9*/("""</div>
    </div>
""")))}))
      }
    }
  }

  def render(technologies:List[Technology],pageNum:Integer,sortCriteria:String,totalCount:Integer,totalPages:Integer): play.twirl.api.HtmlFormat.Appendable = apply(technologies,pageNum,sortCriteria,totalCount,totalPages)

  def f:((List[Technology],Integer,String,Integer,Integer) => play.twirl.api.HtmlFormat.Appendable) = (technologies,pageNum,sortCriteria,totalCount,totalPages) => apply(technologies,pageNum,sortCriteria,totalCount,totalPages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:39 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/technologyManagement.scala.html
                  HASH: 229c7a2b988753fba28d1951cc9eaf982e2d7d7d
                  MATRIX: 1167->1|1354->118|1377->135|1405->153|1419->160|1499->164|1530->169|1630->242|1658->243|1702->260|1770->300|1799->301|1857->115|1885->151|1913->319|1942->322|1996->367|2036->369|2068->374|2578->857|2614->884|2654->886|2699->903|2828->1005|2859->1015|2888->1016|2942->1043|2970->1050|2999->1051|3405->1430|3443->1459|3483->1461|3544->1494|3595->1527|3651->1574|3691->1576|3744->1601|3794->1633|3849->1679|3889->1681|3942->1706|4002->1748|4015->1753|4054->1754|4107->1779|4166->1807|4219->1832|4447->2033|4462->2039|4529->2085|4710->2239|4725->2245|4806->2304|4992->2463|5007->2469|5087->2527|6078->3491|6119->3516|6159->3518|6212->3543|6277->3581|6290->3585|6319->3593|6473->3720|6486->3724|6529->3745|6605->3794|6620->3800|6694->3852|6779->3910|6792->3914|6834->3935|6899->3972|7125->4171|7138->4175|7171->4186|7234->4222|7247->4226|7279->4237|7340->4270|7529->4432|7542->4436|7578->4450|7641->4486|7654->4490|7689->4504|7750->4537|7852->4611|7866->4615|7900->4627|8055->4754|8069->4758|8109->4775|8173->4811|8187->4815|8226->4832|8288->4865|8478->5027|8492->5031|8534->5050|8598->5086|8612->5090|8653->5109|8715->5142|8846->5245|8888->5277|8929->5279|8991->5312|9090->5392|9104->5397|9144->5398|9206->5431|9317->5510|9375->5539|9442->5578|9456->5582|9498->5602|9607->5683|9623->5689|9698->5741|10045->6056|10095->6077|10215->6169|10243->6187|10284->6189|10334->6210|10524->6372|10550->6388|10591->6390|10657->6427|10870->6621|10884->6626|10924->6627|10990->6664|11094->6740|11110->6746|11197->6810|11439->7020|11502->7055|11544->7080|11585->7082|11651->7120|11677->7136|11718->7138|11788->7179|11890->7253|11906->7259|11983->7313|12015->7316|12039->7317|12147->7406|12161->7411|12201->7412|12271->7453|12379->7533|12395->7539|12472->7593|12504->7596|12528->7597|12648->7685|12714->7719|12777->7754|12812->7779|12853->7781|12919->7818|13133->8013|13147->8018|13187->8019|13253->8056|13357->8132|13373->8138|13460->8202|13703->8413|13761->8442|13874->8523|13908->8538|13922->8543|13962->8544|14008->8561|14222->8743|14259->8752
                  LINES: 35->1|38->3|39->4|41->6|41->6|43->6|44->7|45->8|45->8|46->9|47->10|47->10|50->1|52->5|53->12|55->14|55->14|55->14|56->15|73->32|73->32|73->32|74->33|76->35|76->35|76->35|76->35|76->35|76->35|81->40|81->40|81->40|82->41|83->42|83->42|83->42|84->43|85->44|85->44|85->44|86->45|87->46|87->46|87->46|88->47|89->48|90->49|94->53|94->53|94->53|96->55|96->55|96->55|98->57|98->57|98->57|121->80|121->80|121->80|122->81|123->82|123->82|123->82|125->84|125->84|125->84|126->85|126->85|126->85|127->86|127->86|127->86|128->87|132->91|132->91|132->91|133->92|133->92|133->92|134->93|137->96|137->96|137->96|138->97|138->97|138->97|139->98|141->100|141->100|141->100|143->102|143->102|143->102|144->103|144->103|144->103|145->104|148->107|148->107|148->107|149->108|149->108|149->108|150->109|153->112|153->112|153->112|154->113|155->114|155->114|155->114|156->115|157->116|158->117|159->118|159->118|159->118|161->120|161->120|161->120|167->126|168->127|172->131|172->131|172->131|173->132|176->135|176->135|176->135|177->136|180->139|180->139|180->139|181->140|182->141|182->141|182->141|186->145|188->147|188->147|188->147|189->148|189->148|189->148|190->149|191->150|191->150|191->150|191->150|191->150|193->152|193->152|193->152|194->153|195->154|195->154|195->154|195->154|195->154|197->156|198->157|200->159|200->159|200->159|201->160|204->163|204->163|204->163|205->164|206->165|206->165|206->165|210->169|211->170|214->173|215->174|215->174|215->174|216->175|221->180|222->181
                  -- GENERATED --
              */
          