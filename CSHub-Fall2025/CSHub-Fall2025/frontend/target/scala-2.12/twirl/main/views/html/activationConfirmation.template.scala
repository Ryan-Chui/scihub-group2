
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

object activationConfirmation extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import models._
/*4.2*/import models.Project
/*5.2*/import models.Challenge


Seq[Any](format.raw/*1.4*/("""

"""),format.raw/*6.1*/("""
"""),format.raw/*7.182*/("""
"""),_display_(/*8.2*/main("Activation confirmation page")/*8.38*/ {_display_(Seq[Any](format.raw/*8.40*/("""
    """),format.raw/*9.5*/("""<div class="container">
        <div class="center">
            <div class="col s12 m10 offset-m1">
                <div class="card-panel">
                    <h4>Congratulations!</h4>
                        <h5>Your user account has been successfully activated onto SMU-Hub.</h5>
                    <br>
                    <br>
                    <span id="show"></span>
                </div>
            </div>
        </div>
    </div>

    <script type="text/javascript">
            var t=5; // set the time of re-direction to be 5 seconds
            setInterval("refer()",1000); // 1s start up
            function refer()"""),format.raw/*26.29*/("""{"""),format.raw/*26.30*/("""
                """),format.raw/*27.17*/("""if(t==0)"""),format.raw/*27.25*/("""{"""),format.raw/*27.26*/("""
                    """),format.raw/*28.21*/("""location='"""),_display_(/*28.32*/routes/*28.38*/.Application.home()),format.raw/*28.57*/("""';
                """),format.raw/*29.17*/("""}"""),format.raw/*29.18*/("""

                """),format.raw/*31.17*/("""document.getElementById('show').innerHTML="The page will be redirected to the user login page in "
                        +""+t+" seconds";
                t--;
            """),format.raw/*34.13*/("""}"""),format.raw/*34.14*/("""
    """),format.raw/*35.5*/("""</script>
""")))}),format.raw/*36.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:27 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/activationConfirmation.scala.html
                  HASH: e91da543ade324109d4fb262cfccef74186e18d0
                  MATRIX: 1121->1|1196->6|1219->23|1248->46|1300->3|1328->70|1357->252|1384->254|1428->290|1467->292|1498->297|2163->934|2192->935|2237->952|2273->960|2302->961|2351->982|2389->993|2404->999|2444->1018|2491->1037|2520->1038|2566->1056|2768->1230|2797->1231|2829->1236|2870->1247
                  LINES: 35->1|38->3|39->4|40->5|43->1|45->6|46->7|47->8|47->8|47->8|48->9|65->26|65->26|66->27|66->27|66->27|67->28|67->28|67->28|67->28|68->29|68->29|70->31|73->34|73->34|74->35|75->36
                  -- GENERATED --
              */
          