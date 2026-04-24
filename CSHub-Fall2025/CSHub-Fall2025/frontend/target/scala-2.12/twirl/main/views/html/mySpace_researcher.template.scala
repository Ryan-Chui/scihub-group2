
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

object mySpace_researcher extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
"""),_display_(/*6.2*/main("My Space (Researcher)", scripts)/*6.40*/ {_display_(Seq[Any](format.raw/*6.42*/("""
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
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/mySpace_researcher.scala.html
                  HASH: d3e74e56ed89458d1d71c36e5b35916c6d9575f3
                  MATRIX: 1190->1|1204->8|1284->12|1315->17|1354->30|1368->36|1428->76|1521->143|1535->149|1597->191|1648->204|1675->206|1721->244|1760->246|1791->251|2222->655|2237->661|2307->710|2579->955|2594->961|2652->998|2932->1251|2947->1257|3009->1298|3294->1556|3309->1562|3371->1603|3659->1864|3674->1870|3729->1904
                  LINES: 39->1|39->1|41->1|42->2|42->2|42->2|42->2|44->4|44->4|44->4|46->5|47->6|47->6|47->6|48->7|58->17|58->17|58->17|63->22|63->22|63->22|69->28|69->28|69->28|75->34|75->34|75->34|81->40|81->40|81->40
                  -- GENERATED --
              */
          