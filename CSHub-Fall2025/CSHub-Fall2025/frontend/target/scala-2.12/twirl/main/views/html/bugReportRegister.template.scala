
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
/*2.2*/import helper._

object bugReportRegister extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*4.2*/scripts/*4.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*4.14*/("""
    """),format.raw/*5.5*/("""<script type="text/javascript" src='"""),_display_(/*5.42*/routes/*5.48*/.Assets.at("javascripts/database_field_length.js")),format.raw/*5.98*/("""'></script>
    <script type="text/javascript" src='"""),_display_(/*6.42*/routes/*6.48*/.Assets.at("javascripts/field_validation_helper.js")),format.raw/*6.100*/("""'></script>
    <script type="text/javascript">
            $(document).ready(function () """),format.raw/*8.43*/("""{"""),format.raw/*8.44*/("""
                """),format.raw/*9.17*/("""/**
                 * This portion defines all the (non)required fields that need validation on max lengths and special
                 * characters, as well as URL validity.
                 */
                validateField("description", "descriptionMsg", "varChar255", true);
                validateField("title", "titleMsg", "varChar255", true);
                /****************************** End of Validation Portion **********************************************/
            """),format.raw/*16.13*/("""}"""),format.raw/*16.14*/(""");

            function validateFormBeforeSubmit() """),format.raw/*18.49*/("""{"""),format.raw/*18.50*/("""
                """),format.raw/*19.17*/("""if (document.getElementById("longDescriptionMsg").innerText !== "") """),format.raw/*19.85*/("""{"""),format.raw/*19.86*/("""
                    """),format.raw/*20.21*/("""return false;
                """),format.raw/*21.17*/("""}"""),format.raw/*21.18*/("""
                """),format.raw/*22.17*/("""return true;
            """),format.raw/*23.13*/("""}"""),format.raw/*23.14*/("""
    """),format.raw/*24.5*/("""</script>
""")))};
Seq[Any](format.raw/*25.2*/("""

"""),_display_(/*27.2*/main("Bug Report", scripts)/*27.29*/ {_display_(Seq[Any](format.raw/*27.31*/("""
    """),format.raw/*28.5*/("""<div class="container">
        <div class="row">
            <div class="col s12">
                <div class="card-panel">
                    <form enctype="multipart/form-data" method="post" onsubmit="return validateFormBeforeSubmit();" action=""""),_display_(/*32.126*/routes/*32.132*/.BugReportController.bugReportRegisterPOST()),format.raw/*32.176*/("""">
                        <h4 class="center">Report Bug</h4>

                        <div class="row">
                            <div class="input-field col s12">
                                <input type="text" class="validate" required id="title" name="title">
                                <label for="title">Bug title*</label>
                                <span id="titleMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="description" id="description" class="validate"
                                required="true">
                                <label for="description">Bug Short Description*</label>
                                <span class="helper-text red-text" id="descriptionMsg"></span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                """),format.raw/*53.172*/("""
                                """),format.raw/*54.33*/("""<br/>
                                <textarea style="height: 200px;
                                    word-wrap: break-word" name="longDescription" id="longDescription" onchange="validateTextarea('longDescription', 'bug', 'addABug')" placeholder=""></textarea>
                                <label for="description">Bug Long Description</label>
                                <span class="helper-text red-text" id="longDescriptionMsg"></span>
                            </div>
                        </div>

                        <div class="actions row">
                            <div class="input-field col s12 center">
                                <button type="submit" class="btn waves-effect waves-light blue darken-2" id="addABug">
                                    Submit</button>
                                <div class="helper-text red-text" id="submitErrorMsg"></div>
                            </div>
                        </div>

                    </form>
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
                  DATE: Fri Apr 24 12:50:29 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/bugReportRegister.scala.html
                  HASH: f5b66fbe99a6261e9a5c4a6018ad9ef699856758
                  MATRIX: 814->2|1212->20|1226->27|1306->32|1337->37|1400->74|1414->80|1484->130|1563->183|1577->189|1650->241|1767->331|1795->332|1839->349|2354->836|2383->837|2463->889|2492->890|2537->907|2633->975|2662->976|2711->997|2769->1027|2798->1028|2843->1045|2896->1070|2925->1071|2957->1076|3007->1087|3036->1090|3072->1117|3112->1119|3144->1124|3422->1374|3438->1380|3504->1424|4706->2736|4767->2769
                  LINES: 31->2|40->4|40->4|42->4|43->5|43->5|43->5|43->5|44->6|44->6|44->6|46->8|46->8|47->9|54->16|54->16|56->18|56->18|57->19|57->19|57->19|58->20|59->21|59->21|60->22|61->23|61->23|62->24|64->25|66->27|66->27|66->27|67->28|71->32|71->32|71->32|92->53|93->54
                  -- GENERATED --
              */
          