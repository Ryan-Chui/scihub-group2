
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
/*1.2*/import java.util
/*2.2*/import models._
/*4.2*/import helper._
/*5.2*/import models.Project

object generalError extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*7.2*/main("General Error Page")/*7.28*/ {_display_(Seq[Any](format.raw/*7.30*/("""
    """),format.raw/*8.5*/("""<div class="container">
        <div class="center">
            <div class="col s12 m10 offset-m1">
                <div class="card-panel">
                    <h5>General Error Page</h5>
                    <h6>Sorry,
                        """),_display_(/*14.26*/if(flash.contains("user_general_error"))/*14.66*/ {_display_(Seq[Any](format.raw/*14.68*/("""
                            """),_display_(/*15.30*/flash/*15.35*/.get("user_general_error")),format.raw/*15.61*/("""
                        """)))}/*16.26*/else/*16.31*/{_display_(Seq[Any](format.raw/*16.32*/("""
                            """),format.raw/*17.29*/("""Your action did not go through.
                        """)))}),format.raw/*18.26*/("""
                        """),format.raw/*19.25*/("""Please try again later.</h6>
                    <br>
                    <span id="show"></span>
                </div>
            </div>
        </div>
    </div>

    """),format.raw/*27.68*/("""
    """),format.raw/*28.5*/("""<script type="text/javascript">
            var t=5; // set the time of re-direction to be 5 seconds
            setInterval("refer()",1000); // 1s start up
            function refer()"""),format.raw/*31.29*/("""{"""),format.raw/*31.30*/("""
                """),format.raw/*32.17*/("""if(t==0)"""),format.raw/*32.25*/("""{"""),format.raw/*32.26*/("""
                    """),format.raw/*33.21*/("""location='"""),_display_(/*33.32*/routes/*33.38*/.Application.home()),format.raw/*33.57*/("""';
                """),format.raw/*34.17*/("""}"""),format.raw/*34.18*/("""

                """),format.raw/*36.17*/("""document.getElementById('show').innerHTML="This page will be redirected to the homepage in "
                        +""+t+" seconds";
                t--;
            """),format.raw/*39.13*/("""}"""),format.raw/*39.14*/("""
    """),format.raw/*40.5*/("""</script>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:31 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/generalError.scala.html
                  HASH: 01e70e16a25f6ecd6d6ef78e2cf3607c56bc4456
                  MATRIX: 814->1|838->19|861->37|884->54|1299->78|1333->104|1372->106|1403->111|1676->357|1725->397|1765->399|1822->429|1836->434|1883->460|1928->486|1941->491|1980->492|2037->521|2125->578|2178->603|2377->837|2409->842|2622->1027|2651->1028|2696->1045|2732->1053|2761->1054|2810->1075|2848->1086|2863->1092|2903->1111|2950->1130|2979->1131|3025->1149|3221->1317|3250->1318|3282->1323
                  LINES: 31->1|32->2|33->4|34->5|44->7|44->7|44->7|45->8|51->14|51->14|51->14|52->15|52->15|52->15|53->16|53->16|53->16|54->17|55->18|56->19|64->27|65->28|68->31|68->31|69->32|69->32|69->32|70->33|70->33|70->33|70->33|71->34|71->34|73->36|76->39|76->39|77->40
                  -- GENERATED --
              */
          