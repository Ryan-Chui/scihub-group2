
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
/*1.2*/import helper._
/*2.2*/import models._

object primeConnections extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(id: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.14*/("""



"""),_display_(/*7.2*/main("Prime Connections")/*7.27*/ {_display_(Seq[Any](format.raw/*7.29*/("""
    """),format.raw/*8.5*/("""<link href='"""),_display_(/*8.18*/routes/*8.24*/.Assets.at("stylesheets/quill.snow.css")),format.raw/*8.64*/("""'
    rel="stylesheet" />
    <script type="text/javascript" src='"""),_display_(/*10.42*/routes/*10.48*/.Assets.at("javascripts/plugins/quill.js")),format.raw/*10.90*/("""'></script>

    <div class="container">
        <div class="row">
            <div class="col  s12 m10 offset-m1">
                <div class="card-panel">
                    <h4 class="center form-signin-heading" align="center">
                        Prime Connection Author Names
                    </h4>s
                </div>
            </div>
            <div class="row card-panel z-depth-0 paper-zone-panel">
                <div class="col s12" style="margin-top: -10px;
                    margin-bottom: -10px;">
                    <h6 class="center tooltipped" data-position="bottom" data-tooltip="This list shows all the papers." >
                    """),_display_(/*25.22*/id),format.raw/*25.24*/("""
                    """),format.raw/*26.21*/("""</h6>
                </div>
            </div>
        </div>
    </div>
""")))}))
      }
    }
  }

  def render(id:String): play.twirl.api.HtmlFormat.Appendable = apply(id)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (id) => apply(id)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:34 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/primeConnections.scala.html
                  HASH: 118b5a7b7e52df5062da2e4d2c8f48e3c48bb138
                  MATRIX: 814->1|837->18|1168->35|1275->47|1305->52|1338->77|1377->79|1408->84|1447->97|1461->103|1521->143|1615->210|1630->216|1693->258|2393->931|2416->933|2465->954
                  LINES: 31->1|32->2|37->3|42->3|46->7|46->7|46->7|47->8|47->8|47->8|47->8|49->10|49->10|49->10|64->25|64->25|65->26
                  -- GENERATED --
              */
          