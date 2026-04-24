
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

object loadPaper extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*1.2*/scripts/*1.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*1.13*/("""
    """),format.raw/*2.5*/("""<link href='"""),_display_(/*2.18*/routes/*2.24*/.Assets.at("stylesheets/quill.snow.css")),format.raw/*2.64*/("""'
    rel="stylesheet" />
    <script type="text/javascript" src='"""),_display_(/*4.42*/routes/*4.48*/.Assets.at("javascripts/plugins/quill.js")),format.raw/*4.90*/("""'></script>
    <script type="text/javascript" src='"""),_display_(/*5.42*/routes/*5.48*/.Assets.at("javascripts/field_validation_helper.js")),format.raw/*5.100*/("""'></script>


""")))};
Seq[Any](format.raw/*8.2*/("""
"""),_display_(/*9.2*/main("Register Paper", scripts)/*9.33*/ {_display_(Seq[Any](format.raw/*9.35*/("""
    """),format.raw/*10.5*/("""<div class="container">
        <div class="row">
            <div class="col  s12 m10 offset-m1">
                <div class="card-panel">
                    <h4 class="center form-signin-heading" align="center">
                        Load paper from DBLP
                    </h4>
                </div>
            </div>
            <div class="container h-100">
                <div class="row h-100 justify-content-center align-items-center">
                    <div class="col-sm-5">
                        <form class="form-signin" enctype="multipart/form-data" id="paperLoadForm"  method="post" action=""""),_display_(/*22.124*/routes/*22.130*/.PaperController.processDBPLFile()),format.raw/*22.164*/("""">

                        <div class="file-field input-field col s12" >
                                <div class="btn waves-effect waves-light blue darken-2" >
                                    <span >Upload DBLP XML File</span>
                                    <input type="file" accept=".xml" class="form-control" id="data" name="data"></input>
                                </div>
                                <div class="file-path-wrapper">
                                    <input id="showpath" class="file-path validate" type="text">
                                </div>
                            </div>
                            <div class="file-field input-field col s12" >
                                <div class="btn waves-effect waves-light blue darken-2" >
                                    <span >Upload DBLP Data Definition File</span>
                                    <input type="file" accept=".dtd" class="form-control" id="schema" name="schema"></input>
                                </div>
                                <div class="file-path-wrapper">
                                    <input id="showpath" class="file-path validate" type="text">
                                </div>
                            </div>
                            <div class="file-field input-field col s12" >
                                <button type="submit" class="btn btn-default" id="btnSubmit">Upload</button>
                            </div>
                        <div id="listFiles">
                        </div>
                        </form>
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
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/loadPaper.scala.html
                  HASH: 865460012ff179acc71b053016f62f0a2c00be46
                  MATRIX: 1181->1|1195->8|1275->12|1306->17|1345->30|1359->36|1419->76|1512->143|1526->149|1588->191|1667->244|1681->250|1754->302|1807->317|1834->319|1873->350|1912->352|1944->357|2590->975|2606->981|2662->1015
                  LINES: 39->1|39->1|41->1|42->2|42->2|42->2|42->2|44->4|44->4|44->4|45->5|45->5|45->5|49->8|50->9|50->9|50->9|51->10|63->22|63->22|63->22
                  -- GENERATED --
              */
          