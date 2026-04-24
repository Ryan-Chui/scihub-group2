
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

object taAssignmentDetail extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[CourseTAAssignment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(taassignment: CourseTAAssignment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import models.CourseTAAssignment


Seq[Any](format.raw/*1.36*/("""

"""))
      }
    }
  }

  def render(taassignment:CourseTAAssignment): play.twirl.api.HtmlFormat.Appendable = apply(taassignment)

  def f:((CourseTAAssignment) => play.twirl.api.HtmlFormat.Appendable) = (taassignment) => apply(taassignment)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:36 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/taAssignmentDetail.scala.html
                  HASH: 328829e46f2f9910028cc915257fcc23b5372d18
                  MATRIX: 1136->1|1243->38|1305->35
                  LINES: 35->1|38->3|41->1
                  -- GENERATED --
              */
          