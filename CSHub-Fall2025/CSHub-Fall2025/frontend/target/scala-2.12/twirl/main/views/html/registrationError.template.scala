
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

object registrationError extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(registeredType: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*5.2*/import helper._
/*6.6*/import models.Project


Seq[Any](format.raw/*4.26*/("""
"""),format.raw/*6.1*/("""    """),format.raw/*7.1*/("""
"""),_display_(/*8.2*/main("Registration Error")/*8.28*/ {_display_(Seq[Any](format.raw/*8.30*/("""
    """),format.raw/*9.5*/("""<div class="container">
        <div class="center">
            <div class="col s12 m10 offset-m1">
                <div class="card-panel">
                <h5>"""),_display_(/*13.22*/registeredType),format.raw/*13.36*/(""" """),format.raw/*13.37*/("""not registered!</h5>
                    <h6>Unfortunately, your """),_display_(/*14.46*/registeredType),format.raw/*14.60*/(""" """),format.raw/*14.61*/("""could not be registered. Please try again later.</h6>
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

  def render(registeredType:String): play.twirl.api.HtmlFormat.Appendable = apply(registeredType)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (registeredType) => apply(registeredType)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:36 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/registrationError.scala.html
                  HASH: 9d638ec4d2b6516d06c936771c7809a90f91806c
                  MATRIX: 814->1|838->19|1170->37|1267->63|1290->84|1341->61|1368->79|1398->106|1425->108|1459->134|1498->136|1529->141|1719->304|1754->318|1783->319|1876->385|1911->399|1940->400|2164->659|2196->664|2409->849|2438->850|2483->867|2519->875|2548->876|2597->897|2635->908|2650->914|2690->933|2737->952|2766->953|2812->971|3012->1143|3041->1144|3073->1149|3114->1160|3144->1197|3174->1342|3203->1384|3233->1517|3262->1532|3292->1670|3322->1826
                  LINES: 31->1|32->2|37->4|40->5|41->6|44->4|45->6|45->7|46->8|46->8|46->8|47->9|51->13|51->13|51->13|52->14|52->14|52->14|60->22|61->23|64->26|64->26|65->27|65->27|65->27|66->28|66->28|66->28|66->28|67->29|67->29|69->31|72->34|72->34|73->35|74->36|76->38|77->39|78->40|79->41|80->42|81->43|82->44
                  -- GENERATED --
              */
          