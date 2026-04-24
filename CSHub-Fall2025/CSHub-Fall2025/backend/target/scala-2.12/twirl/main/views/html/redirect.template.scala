
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
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object redirect extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(url: String, msg: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Redirecting...")/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/("""

"""),format.raw/*5.1*/("""<div>"""),_display_(/*5.7*/msg),format.raw/*5.10*/("""</div>

<script>window.location.href = """"),_display_(/*7.34*/url),format.raw/*7.37*/("""";</script>

""")))}),format.raw/*9.2*/("""
"""))
      }
    }
  }

  def render(url:String,msg:String): play.twirl.api.HtmlFormat.Appendable = apply(url,msg)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (url,msg) => apply(url,msg)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 10 13:06:00 CDT 2026
                  SOURCE: C:/Users/ryan1/CSHub-Fall2025/CSHub-Fall2025/backend/app/views/redirect.scala.html
                  HASH: d2d2ed659eb03e05de1a5b397846e11ea106fb9d
                  MATRIX: 1121->1|1241->28|1268->30|1298->52|1337->54|1365->56|1396->62|1419->65|1486->106|1509->109|1552->123
                  LINES: 35->1|40->2|41->3|41->3|41->3|43->5|43->5|43->5|45->7|45->7|47->9
                  -- GENERATED --
              */
          