
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

object activationError extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*5.2*/import helper._
/*6.6*/import models.Project


Seq[Any](format.raw/*4.4*/("""
"""),format.raw/*6.1*/("""    """),format.raw/*7.1*/("""
"""),_display_(/*8.2*/main("Activation Error")/*8.26*/ {_display_(Seq[Any](format.raw/*8.28*/("""
    """),format.raw/*9.5*/("""<div class="container">
        <div class="center">
            <div class="col s12 m10 offset-m1">
                <div class="card-panel">
                <h5>User not activated!</h5>
                    <h6>Unfortunately, your user account could not be activated. Please check if the link is correct.</h6>
                    <br>
                    <span id="show"></span>
                </div>
            </div>
        </div>
    </div>

    """),format.raw/*22.68*/("""
    """),format.raw/*23.5*/("""<script type="text/javascript">
            var t=5; // set the time of re-direction to be 5 seconds
            setInterval("refer()",1000); // 1s start up
            function refer()"""),format.raw/*26.29*/("""{"""),format.raw/*26.30*/("""
                """),format.raw/*27.17*/("""if(t==0)"""),format.raw/*27.25*/("""{"""),format.raw/*27.26*/("""
                    """),format.raw/*28.21*/("""location='"""),_display_(/*28.32*/routes/*28.38*/.Application.home()),format.raw/*28.57*/("""';
                """),format.raw/*29.17*/("""}"""),format.raw/*29.18*/("""

                """),format.raw/*31.17*/("""document.getElementById('show').innerHTML="This page will be redirected to the homepage in "
                            +""+t+" seconds";
                t--;
            """),format.raw/*34.13*/("""}"""),format.raw/*34.14*/("""
    """),format.raw/*35.5*/("""</script>
""")))}),format.raw/*36.2*/("""

"""),format.raw/*38.36*/("""
"""),format.raw/*39.145*/("""
"""),format.raw/*40.42*/("""
"""),format.raw/*41.133*/("""
"""),format.raw/*42.15*/("""
"""),format.raw/*43.138*/("""
"""),format.raw/*44.156*/("""
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
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/activationError.scala.html
                  HASH: 3158f0391a72ea922cee2b65f0b94f475b6ebda0
                  MATRIX: 814->1|838->19|1161->37|1236->41|1259->62|1309->39|1336->57|1366->84|1393->86|1425->110|1464->112|1495->117|1975->632|2007->637|2220->822|2249->823|2294->840|2330->848|2359->849|2408->870|2446->881|2461->887|2501->906|2548->925|2577->926|2623->944|2823->1116|2852->1117|2884->1122|2925->1133|2955->1170|2985->1315|3014->1357|3044->1490|3073->1505|3103->1643|3133->1799
                  LINES: 31->1|32->2|37->4|40->5|41->6|44->4|45->6|45->7|46->8|46->8|46->8|47->9|60->22|61->23|64->26|64->26|65->27|65->27|65->27|66->28|66->28|66->28|66->28|67->29|67->29|69->31|72->34|72->34|73->35|74->36|76->38|77->39|78->40|79->41|80->42|81->43|82->44
                  -- GENERATED --
              */
          