
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

object mySpace_student extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*1.2*/scripts/*1.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*1.13*/("""
    """),format.raw/*2.5*/("""<link href='"""),_display_(/*2.18*/routes/*2.24*/.Assets.at("stylesheets/quill.snow.css")),format.raw/*2.64*/("""'
    rel="stylesheet" />
    <script type="text/javascript" src='"""),_display_(/*4.42*/routes/*4.48*/.Assets.at("javascripts/plugins/quill.js")),format.raw/*4.90*/("""'></script>
""")))};
Seq[Any](format.raw/*5.2*/("""
"""),_display_(/*6.2*/main("My Space (Student)", scripts)/*6.37*/ {_display_(Seq[Any](format.raw/*6.39*/("""
    """),format.raw/*7.5*/("""<div class="container">
        <div class="row">
            <div class="card-panel">
                <div class="row center">
                    <h4 class="center form-signin-heading" align="center">
                        My Space
                    </h4>
                </div>
                <div class="row center">
                    <div class="col s6 m3">
                        <a href=""""),_display_(/*17.35*/routes/*17.41*/.ChallengeController.challengeListPostedByUser(1)),format.raw/*17.90*/("""">
                            <i class="material-icons large">assignment</i>
                            <p>Challenge Applications</p></a>
                    </div>
                    <div class="col s6 m3">
                        <a href=""""),_display_(/*22.35*/routes/*22.41*/.JobController.jobListPostedByUser(1)),format.raw/*22.78*/("""">
                            <i class="material-icons large">work</i>
                            <p>Posted Jobs</p>
                        </a>
                    </div>
                    <div class="col s6 m3">
                        <a href=""""),_display_(/*28.35*/routes/*28.41*/.TAJobController.tajobListPostedByUser(1)),format.raw/*28.82*/("""">
                            <i class="material-icons large">school</i>
                            <p>Posted TA Jobs</p>
                        </a>
                    </div>
                    <div class="col s6 m3">
                        <a href=""""),_display_(/*34.35*/routes/*34.41*/.RAJobController.rajobListPostedByUser(1)),format.raw/*34.82*/("""">
                            <i class="material-icons large">live_help</i>
                            <p>Posted RA Jobs</p>
                        </a>
                    </div>
                    <div class="col s6 m3">
                        <a href=""""),_display_(/*40.35*/routes/*40.41*/.UserController.userRegisterPage()),format.raw/*40.75*/("""">
                            <i class="material-icons large">person_add</i>
                            <p>Register Researcher</p>
                        </a>
                    </div>
                </div>
            </div>
        </div>
    </div>
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
                  DATE: Fri Apr 24 12:50:33 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/mySpace_student.scala.html
                  HASH: 0c6e4dc311897ae6794f222002b8f6e0a0894cdd
                  MATRIX: 1187->1|1201->8|1281->12|1312->17|1351->30|1365->36|1425->76|1518->143|1532->149|1594->191|1645->204|1672->206|1715->241|1754->243|1785->248|2216->652|2231->658|2301->707|2573->952|2588->958|2646->995|2926->1248|2941->1254|3003->1295|3288->1553|3303->1559|3365->1600|3653->1861|3668->1867|3723->1901
                  LINES: 39->1|39->1|41->1|42->2|42->2|42->2|42->2|44->4|44->4|44->4|46->5|47->6|47->6|47->6|48->7|58->17|58->17|58->17|63->22|63->22|63->22|69->28|69->28|69->28|75->34|75->34|75->34|81->40|81->40|81->40
                  -- GENERATED --
              */
          