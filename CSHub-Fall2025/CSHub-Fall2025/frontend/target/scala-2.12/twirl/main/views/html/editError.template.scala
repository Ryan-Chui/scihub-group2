
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

object editError extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(editType: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*5.2*/import helper._
/*6.2*/import models.Project


Seq[Any](format.raw/*4.20*/("""
"""),format.raw/*7.1*/("""
"""),_display_(/*8.2*/main("General Edit Error")/*8.28*/ {_display_(Seq[Any](format.raw/*8.30*/("""
    """),format.raw/*9.5*/("""<div class="container">
        <div class="center">
            <div class="col s12 m10 offset-m1">
                <div class="card-panel">
                    <h5>"""),_display_(/*13.26*/editType),format.raw/*13.34*/(""" """),format.raw/*13.35*/("""not updated!</h5>
                    <h6>Unfortunately, your """),_display_(/*14.46*/editType),format.raw/*14.54*/(""" """),format.raw/*14.55*/("""could not be updated. Please try again later.</h6>
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
"""))
      }
    }
  }

  def render(editType:String): play.twirl.api.HtmlFormat.Appendable = apply(editType)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (editType) => apply(editType)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:31 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/editError.scala.html
                  HASH: dc8d182cf9dc2f68f8e7a7345899ca012b064b90
                  MATRIX: 814->1|838->19|1162->37|1253->57|1276->74|1327->55|1354->96|1381->98|1415->124|1454->126|1485->131|1679->298|1708->306|1737->307|1827->370|1856->378|1885->379|2106->635|2138->640|2351->825|2380->826|2425->843|2461->851|2490->852|2539->873|2577->884|2592->890|2632->909|2679->928|2708->929|2754->947|2950->1115|2979->1116|3011->1121|3052->1132
                  LINES: 31->1|32->2|37->4|40->5|41->6|44->4|45->7|46->8|46->8|46->8|47->9|51->13|51->13|51->13|52->14|52->14|52->14|60->22|61->23|64->26|64->26|65->27|65->27|65->27|66->28|66->28|66->28|66->28|67->29|67->29|69->31|72->34|72->34|73->35|74->36
                  -- GENERATED --
              */
          