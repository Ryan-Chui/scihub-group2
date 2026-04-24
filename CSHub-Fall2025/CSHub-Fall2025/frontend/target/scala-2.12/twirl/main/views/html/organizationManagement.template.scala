
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

object organizationManagement extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[List[Organization],Integer,String,Integer,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(organizations: List[Organization], pageNum: Integer, sortCriteria: String, totalCount: Integer, totalPages: Integer):play.twirl.api.HtmlFormat.Appendable = {
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
Seq[Any](format.raw/*1.119*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*12.2*/("""

"""),_display_(/*14.2*/main("Organization Management - Admin Dashboard", scripts)/*14.60*/ {_display_(Seq[Any](format.raw/*14.62*/("""
    """),format.raw/*15.5*/("""<div class="container">
        <div class="row">
            <div class="col s12">
            </div>
        </div>

        <div class="card-panel">
            <div class="row">
                <div class="col s12">
                    <h4 class="center">Organization Management</h4>
                </div>
            </div>

            """),_display_(/*28.14*/if(organizations.size() > 0)/*28.42*/ {_display_(Seq[Any](format.raw/*28.44*/("""
                """),format.raw/*29.17*/("""<div class="row">
                    <div class="col s6">
                        <h6 class="left">"""),_display_(/*31.43*/totalCount),format.raw/*31.53*/(""" """),format.raw/*31.54*/("""Organizations，Page"""),_display_(/*31.73*/pageNum),format.raw/*31.80*/(""" """),format.raw/*31.81*/("""</h6>
                    </div>
                    <div class="col s6" style="padding-top: -5px; margin-top: -2px">
                        <a class='dropdown-trigger btn-flat right' href='#' data-target='dropdown-sort' style="text-transform: none; font-weight: bold; color: black;">
                            sort: &nbsp; <font color="#3a5dc3">
                            """),_display_(/*36.30*/if(sortCriteria.equals("id"))/*36.59*/ {_display_(Seq[Any](format.raw/*36.61*/("""
                                """),format.raw/*37.33*/("""ID
                            """)))}/*38.31*/else if(sortCriteria.equals("organizationName"))/*38.79*/ {_display_(Seq[Any](format.raw/*38.81*/("""
                        """),format.raw/*39.25*/("""Name
                        """)))}/*40.27*/else if(sortCriteria.equals("numberOfEmployees"))/*40.76*/ {_display_(Seq[Any](format.raw/*40.78*/("""
                        """),format.raw/*41.25*/("""number of employees
                        """)))}/*42.27*/else/*42.32*/{_display_(Seq[Any](format.raw/*42.33*/("""
                        """),format.raw/*43.25*/("""ID
                        """)))}),format.raw/*44.26*/("""
                        """),format.raw/*45.25*/("""</font> <i class="material-icons right">expand_more</i>
                        </a>

                        <ul id='dropdown-sort' class='dropdown-content'>
                            <li><a href=""""),_display_(/*49.43*/routes/*49.49*/.AdminController.organizationManagement(1, "id")),format.raw/*49.97*/("""" class="grey-text text-darken-4">
                                <i class="material-icons">tag</i>ID</a></li>
                            <li><a href=""""),_display_(/*51.43*/routes/*51.49*/.AdminController.organizationManagement(1, "organizationName")),format.raw/*51.111*/("""" class="grey-text text-darken-4">
                                <i class="material-icons">business</i>name</a></li>
                            <li><a href=""""),_display_(/*53.43*/routes/*53.49*/.AdminController.organizationManagement(1, "numberOfEmployees")),format.raw/*53.112*/("""" class="grey-text text-darken-4">
                                <i class="material-icons">people</i>number of employees</a></li>
                        </ul>
                    </div>
                </div>

                <table class="centered responsive-table striped">
                    <thead>
                        <tr class="list-header">
                            <th>ID</th>
                            <th>name</th>
                            <th>address</th>
                            <th>focus area</th>
                            <th>number of employees</th>
                            <th>contact</th>
                            <th>email</th>
                            <th>website</th>
                        </tr>
                    </thead>
                    <tbody>
                    """),_display_(/*73.22*/for(org <- organizations) yield /*73.47*/ {_display_(Seq[Any](format.raw/*73.49*/("""
                        """),format.raw/*74.25*/("""<tr>
                            <td>"""),_display_(/*75.34*/org/*75.37*/.getId()),format.raw/*75.45*/("""</td>
                            <td><a href=""""),_display_(/*76.43*/routes/*76.49*/.OrganizationController.organizationDetailPageAdmin(org.getId())),format.raw/*76.113*/("""">"""),_display_(/*76.116*/org/*76.119*/.getOrganizationName()),format.raw/*76.141*/("""</a></td>
                            <td>
                                <div class="truncate" style="max-width: 150px;" title=""""),_display_(/*78.89*/org/*78.92*/.getOrganizationName()),format.raw/*78.114*/("""">
                                """),_display_(/*79.34*/org/*79.37*/.getOrganizationName()),format.raw/*79.59*/("""
                                """),format.raw/*80.33*/("""</div>
                            </td>
                            <td>
                                <div class="truncate" style="max-width: 150px;" title=""""),_display_(/*83.89*/org/*83.92*/.getAddress()),format.raw/*83.105*/("""">
                                """),_display_(/*84.34*/org/*84.37*/.getAddress()),format.raw/*84.50*/("""
                                """),format.raw/*85.33*/("""</div>
                            </td>
                            <td>
                                <div class="truncate" style="max-width: 150px;" title=""""),_display_(/*88.89*/org/*88.92*/.getFocuses()),format.raw/*88.105*/("""">
                                """),_display_(/*89.34*/org/*89.37*/.getFocuses()),format.raw/*89.50*/("""
                                """),format.raw/*90.33*/("""</div>
                            </td>
                            <td>"""),_display_(/*92.34*/org/*92.37*/.getNumberOfEmployees()),format.raw/*92.60*/("""</td>
                            <td>"""),_display_(/*93.34*/org/*93.37*/.getContactPersonName()),format.raw/*93.60*/("""</td>
                            <td>"""),_display_(/*94.34*/org/*94.37*/.getContactPersonEmail()),format.raw/*94.61*/("""</td>
                            <td>
                            """),_display_(/*96.30*/if(org.getURL() != null && org.getURL().nonEmpty)/*96.79*/ {_display_(Seq[Any](format.raw/*96.81*/("""
                                """),format.raw/*97.33*/("""<a href=""""),_display_(/*97.43*/org/*97.46*/.getURL()),format.raw/*97.55*/("""" target="_blank" class="btn-small blue">
                                    <i class="material-icons">link</i>
                                </a>
                            """)))}/*100.31*/else/*100.36*/{_display_(Seq[Any](format.raw/*100.37*/("""
                                """),format.raw/*101.33*/("""-
                            """)))}),format.raw/*102.30*/("""
                            """),format.raw/*103.29*/("""</td>
                        </tr>
                    """)))}),format.raw/*105.22*/("""
                    """),format.raw/*106.21*/("""</tbody>
                </table>

                    <!-- pagination -->
                """),_display_(/*110.18*/if(totalPages > 1)/*110.36*/ {_display_(Seq[Any](format.raw/*110.38*/("""
                    """),format.raw/*111.21*/("""<div class="row">
                        <div class="col s12">
                            <ul class="pagination center-align">
                                """),_display_(/*114.34*/if(pageNum == 1)/*114.50*/ {_display_(Seq[Any](format.raw/*114.52*/("""
                                    """),format.raw/*115.37*/("""<li class="waves-effect disabled">
                                        <i class="material-icons">chevron_left</i>
                                    </li>
                                """)))}/*118.35*/else/*118.40*/{_display_(Seq[Any](format.raw/*118.41*/("""
                                    """),format.raw/*119.37*/("""<li class="waves-effect">
                                        <a href=""""),_display_(/*120.51*/routes/*120.57*/.AdminController.organizationManagement(pageNum - 1, sortCriteria)),format.raw/*120.123*/("""">
                                            <i class="material-icons">chevron_left</i>
                                        </a>
                                    </li>
                                """)))}),format.raw/*124.34*/("""

                                """),_display_(/*126.34*/for(i <- 1 to totalPages) yield /*126.59*/ {_display_(Seq[Any](format.raw/*126.61*/("""
                                    """),_display_(/*127.38*/if(i == pageNum)/*127.54*/ {_display_(Seq[Any](format.raw/*127.56*/("""
                                        """),format.raw/*128.41*/("""<li class="active">
                                            <a href=""""),_display_(/*129.55*/routes/*129.61*/.AdminController.organizationManagement(i, sortCriteria)),format.raw/*129.117*/("""">"""),_display_(/*129.120*/i),format.raw/*129.121*/("""</a>
                                        </li>
                                    """)))}/*131.39*/else/*131.44*/{_display_(Seq[Any](format.raw/*131.45*/("""
                                        """),format.raw/*132.41*/("""<li class="waves-effect">
                                            <a href=""""),_display_(/*133.55*/routes/*133.61*/.AdminController.organizationManagement(i, sortCriteria)),format.raw/*133.117*/("""">"""),_display_(/*133.120*/i),format.raw/*133.121*/("""</a>
                                        </li>
                                    """)))}),format.raw/*135.38*/("""
                                """)))}),format.raw/*136.34*/("""

                                """),_display_(/*138.34*/if(pageNum == totalPages)/*138.59*/ {_display_(Seq[Any](format.raw/*138.61*/("""
                                    """),format.raw/*139.37*/("""<li class="waves-effect disabled">
                                        <i class="material-icons">chevron_right</i>
                                    </li>
                                """)))}/*142.35*/else/*142.40*/{_display_(Seq[Any](format.raw/*142.41*/("""
                                    """),format.raw/*143.37*/("""<li class="waves-effect">
                                        <a href=""""),_display_(/*144.51*/routes/*144.57*/.AdminController.organizationManagement(pageNum + 1, sortCriteria)),format.raw/*144.123*/("""">
                                            <i class="material-icons">chevron_right</i>
                                        </a>
                                    </li>
                                """)))}),format.raw/*148.34*/("""
                            """),format.raw/*149.29*/("""</ul>
                        </div>
                    </div>
                """)))}),format.raw/*152.18*/("""
            """)))}/*153.15*/else/*153.20*/{_display_(Seq[Any](format.raw/*153.21*/("""
                """),format.raw/*154.17*/("""<div class="row">
                    <div class="col s12 center">
                        <h5>no organization data</h5>
                    </div>
                </div>
            """)))}),format.raw/*159.14*/("""
        """),format.raw/*160.9*/("""</div>
    </div>
""")))}))
      }
    }
  }

  def render(organizations:List[Organization],pageNum:Integer,sortCriteria:String,totalCount:Integer,totalPages:Integer): play.twirl.api.HtmlFormat.Appendable = apply(organizations,pageNum,sortCriteria,totalCount,totalPages)

  def f:((List[Organization],Integer,String,Integer,Integer) => play.twirl.api.HtmlFormat.Appendable) = (organizations,pageNum,sortCriteria,totalCount,totalPages) => apply(organizations,pageNum,sortCriteria,totalCount,totalPages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:33 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/organizationManagement.scala.html
                  HASH: d7086964d45e086d1d207edda2b881ac43bb888b
                  MATRIX: 1171->1|1361->121|1384->138|1412->156|1426->163|1506->167|1537->172|1637->245|1665->246|1709->263|1777->303|1806->304|1864->118|1892->154|1920->322|1949->325|2016->383|2056->385|2088->390|2459->734|2496->762|2536->764|2581->781|2709->882|2740->892|2769->893|2815->912|2843->919|2872->920|3278->1299|3316->1328|3356->1330|3417->1363|3468->1396|3525->1444|3565->1446|3618->1471|3667->1502|3725->1551|3765->1553|3818->1578|3882->1624|3895->1629|3934->1630|3987->1655|4046->1683|4099->1708|4327->1909|4342->1915|4411->1963|4592->2117|4607->2123|4691->2185|4879->2346|4894->2352|4979->2415|5835->3244|5876->3269|5916->3271|5969->3296|6034->3334|6046->3337|6075->3345|6150->3393|6165->3399|6251->3463|6282->3466|6295->3469|6339->3491|6497->3622|6509->3625|6553->3647|6616->3683|6628->3686|6671->3708|6732->3741|6921->3903|6933->3906|6968->3919|7031->3955|7043->3958|7077->3971|7138->4004|7327->4166|7339->4169|7374->4182|7437->4218|7449->4221|7483->4234|7544->4267|7645->4341|7657->4344|7701->4367|7767->4406|7779->4409|7823->4432|7889->4471|7901->4474|7946->4498|8041->4566|8099->4615|8139->4617|8200->4650|8237->4660|8249->4663|8279->4672|8478->4852|8492->4857|8532->4858|8594->4891|8657->4922|8715->4951|8804->5008|8854->5029|8974->5121|9002->5139|9043->5141|9093->5162|9283->5324|9309->5340|9350->5342|9416->5379|9629->5573|9643->5578|9683->5579|9749->5616|9853->5692|9869->5698|9958->5764|10200->5974|10263->6009|10305->6034|10346->6036|10412->6074|10438->6090|10479->6092|10549->6133|10651->6207|10667->6213|10746->6269|10778->6272|10802->6273|10910->6362|10924->6367|10964->6368|11034->6409|11142->6489|11158->6495|11237->6551|11269->6554|11293->6555|11413->6643|11479->6677|11542->6712|11577->6737|11618->6739|11684->6776|11898->6971|11912->6976|11952->6977|12018->7014|12122->7090|12138->7096|12227->7162|12470->7373|12528->7402|12641->7483|12675->7498|12689->7503|12729->7504|12775->7521|12991->7705|13028->7714
                  LINES: 35->1|38->3|39->4|41->6|41->6|43->6|44->7|45->8|45->8|46->9|47->10|47->10|50->1|52->5|53->12|55->14|55->14|55->14|56->15|69->28|69->28|69->28|70->29|72->31|72->31|72->31|72->31|72->31|72->31|77->36|77->36|77->36|78->37|79->38|79->38|79->38|80->39|81->40|81->40|81->40|82->41|83->42|83->42|83->42|84->43|85->44|86->45|90->49|90->49|90->49|92->51|92->51|92->51|94->53|94->53|94->53|114->73|114->73|114->73|115->74|116->75|116->75|116->75|117->76|117->76|117->76|117->76|117->76|117->76|119->78|119->78|119->78|120->79|120->79|120->79|121->80|124->83|124->83|124->83|125->84|125->84|125->84|126->85|129->88|129->88|129->88|130->89|130->89|130->89|131->90|133->92|133->92|133->92|134->93|134->93|134->93|135->94|135->94|135->94|137->96|137->96|137->96|138->97|138->97|138->97|138->97|141->100|141->100|141->100|142->101|143->102|144->103|146->105|147->106|151->110|151->110|151->110|152->111|155->114|155->114|155->114|156->115|159->118|159->118|159->118|160->119|161->120|161->120|161->120|165->124|167->126|167->126|167->126|168->127|168->127|168->127|169->128|170->129|170->129|170->129|170->129|170->129|172->131|172->131|172->131|173->132|174->133|174->133|174->133|174->133|174->133|176->135|177->136|179->138|179->138|179->138|180->139|183->142|183->142|183->142|184->143|185->144|185->144|185->144|189->148|190->149|193->152|194->153|194->153|194->153|195->154|200->159|201->160
                  -- GENERATED --
              */
          