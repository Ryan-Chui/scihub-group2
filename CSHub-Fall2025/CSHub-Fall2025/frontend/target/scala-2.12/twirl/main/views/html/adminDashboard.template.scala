
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

object adminDashboard extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[com.fasterxml.jackson.databind.node.ObjectNode,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(stats: com.fasterxml.jackson.databind.node.ObjectNode):play.twirl.api.HtmlFormat.Appendable = {
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
Seq[Any](format.raw/*1.57*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*12.2*/("""

"""),_display_(/*14.2*/main("Admin Dashboard", scripts)/*14.34*/ {_display_(Seq[Any](format.raw/*14.36*/("""
    """),format.raw/*15.5*/("""<div class="container">
        <div class="row">
            <div class="col s12">
                <h4 class="center">Admin Dashboard</h4>
                <p class="center">Welcome to use admin dashboard, you can manage all the data here</p>
            </div>
        </div>

        <div class="row">
            <div class="col s12">
                <div class="card">
                    <div class="card-content">
                        <div class="row">
                            <div class="col s12 m6 l3">
                                <a href=""""),_display_(/*29.43*/routes/*29.49*/.AdminController.userManagement(1, "id")),format.raw/*29.89*/("""" class="btn-large blue waves-effect waves-light full-width">
                                    <i class="material-icons left">people</i>
                                    User Management
                                </a>
                            </div>
                            <div class="col s12 m6 l3">
                                <a href=""""),_display_(/*35.43*/routes/*35.49*/.AdminController.jobManagement(1, "id")),format.raw/*35.88*/("""" class="btn-large green waves-effect waves-light full-width">
                                    <i class="material-icons left">work</i>
                                    Job Management
                                </a>
                            </div>
                            <div class="col s12 m6 l3">
                                <a href=""""),_display_(/*41.43*/routes/*41.49*/.ChallengeController.challengeListAdmin(1, "id")),format.raw/*41.97*/("""" class="btn-large orange waves-effect waves-light full-width">
                                    <i class="material-icons left">description</i>
                                    Challenge Management
                                </a>
                            </div>
                            <div class="col s12 m6 l3">
                                <a href=""""),_display_(/*47.43*/routes/*47.49*/.AdminController.organizationManagement(1, "id")),format.raw/*47.97*/("""" class="btn-large purple waves-effect waves-light full-width">
                                    <i class="material-icons left">business</i>
                                    Organization Management
                                </a>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col s12 m6 l3">
                                <a href=""""),_display_(/*55.43*/routes/*55.49*/.AdminController.technologyManagement(1, "id")),format.raw/*55.95*/("""" class="btn-large red waves-effect waves-light full-width">
                                    <i class="material-icons left">computer</i>
                                    Technology Management
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <style>
                .full-width """),format.raw/*67.29*/("""{"""),format.raw/*67.30*/("""
                    """),format.raw/*68.21*/("""width: 100%;
                    margin-bottom: 10px;
                """),format.raw/*70.17*/("""}"""),format.raw/*70.18*/("""
                """),format.raw/*71.17*/(""".card-panel """),format.raw/*71.29*/("""{"""),format.raw/*71.30*/("""
                    """),format.raw/*72.21*/("""height: 150px;
                    display: flex;
                    align-items: center;
                    justify-content: center;
                """),format.raw/*76.17*/("""}"""),format.raw/*76.18*/("""
                """),format.raw/*77.17*/(""".card-panel .card-content """),format.raw/*77.43*/("""{"""),format.raw/*77.44*/("""
                    """),format.raw/*78.21*/("""text-align: center;
                """),format.raw/*79.17*/("""}"""),format.raw/*79.18*/("""
                """),format.raw/*80.17*/(""".card-panel h4 """),format.raw/*80.32*/("""{"""),format.raw/*80.33*/("""
                    """),format.raw/*81.21*/("""margin: 10px 0;
                    font-weight: bold;
                """),format.raw/*83.17*/("""}"""),format.raw/*83.18*/("""
        """),format.raw/*84.9*/("""</style>
""")))}))
      }
    }
  }

  def render(stats:com.fasterxml.jackson.databind.node.ObjectNode): play.twirl.api.HtmlFormat.Appendable = apply(stats)

  def f:((com.fasterxml.jackson.databind.node.ObjectNode) => play.twirl.api.HtmlFormat.Appendable) = (stats) => apply(stats)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:27 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/adminDashboard.scala.html
                  HASH: 21e41d24f7be9cb5c9289792728fd04ecc3f8a33
                  MATRIX: 1160->1|1288->59|1311->76|1339->94|1353->101|1433->105|1464->110|1564->183|1592->184|1636->201|1704->241|1733->242|1790->56|1818->92|1846->260|1875->263|1916->295|1956->297|1988->302|2575->862|2590->868|2651->908|3040->1270|3055->1276|3115->1315|3502->1675|3517->1681|3586->1729|3987->2103|4002->2109|4071->2157|4545->2604|4560->2610|4627->2656|5086->3087|5115->3088|5164->3109|5262->3179|5291->3180|5336->3197|5376->3209|5405->3210|5454->3231|5634->3383|5663->3384|5708->3401|5762->3427|5791->3428|5840->3449|5904->3485|5933->3486|5978->3503|6021->3518|6050->3519|6099->3540|6198->3611|6227->3612|6263->3621
                  LINES: 35->1|38->3|39->4|41->6|41->6|43->6|44->7|45->8|45->8|46->9|47->10|47->10|50->1|52->5|53->12|55->14|55->14|55->14|56->15|70->29|70->29|70->29|76->35|76->35|76->35|82->41|82->41|82->41|88->47|88->47|88->47|96->55|96->55|96->55|108->67|108->67|109->68|111->70|111->70|112->71|112->71|112->71|113->72|117->76|117->76|118->77|118->77|118->77|119->78|120->79|120->79|121->80|121->80|121->80|122->81|124->83|124->83|125->84
                  -- GENERATED --
              */
          