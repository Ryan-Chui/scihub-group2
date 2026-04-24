
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

object passwordReset extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(msg: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.15*/("""

"""),_display_(/*3.2*/main("Password reset")/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/("""
        """),format.raw/*4.9*/("""<div class="container">
                <div class="row">
                        <div class="col m6 s12 offset-m3" style="top: ">
                                <div class="card-panel z-depth-0">
                                        <span>"""),_display_(/*8.48*/msg),format.raw/*8.51*/("""</span>
                                </div>
                        </div>
                </div>
        </div>

""")))}),format.raw/*14.2*/("""
"""))
      }
    }
  }

  def render(msg:String): play.twirl.api.HtmlFormat.Appendable = apply(msg)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (msg) => apply(msg)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:34 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/passwordReset.scala.html
                  HASH: 97fc4b4b1c019f4f0fce50b74d43fb7f8d565f1c
                  MATRIX: 1119->1|1227->14|1255->17|1285->39|1324->41|1359->50|1630->295|1653->298|1801->416
                  LINES: 35->1|40->1|42->3|42->3|42->3|43->4|47->8|47->8|53->14
                  -- GENERATED --
              */
          