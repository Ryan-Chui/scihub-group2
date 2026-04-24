
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

object suggestionRegister extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*2.2*/scripts/*2.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*2.14*/("""
    """),format.raw/*3.5*/("""<script type="text/javascript" src='"""),_display_(/*3.42*/routes/*3.48*/.Assets.at("javascripts/database_field_length.js")),format.raw/*3.98*/("""'></script>
    <script type="text/javascript" src='"""),_display_(/*4.42*/routes/*4.48*/.Assets.at("javascripts/field_validation_helper.js")),format.raw/*4.100*/("""'></script>
    <script type="text/javascript">
            function validateFormBeforeSubmit() """),format.raw/*6.49*/("""{"""),format.raw/*6.50*/("""
                """),format.raw/*7.17*/("""if (document.getElementById("longDescriptionMsg").innerText !== "") """),format.raw/*7.85*/("""{"""),format.raw/*7.86*/("""
                    """),format.raw/*8.21*/("""return false;
                """),format.raw/*9.17*/("""}"""),format.raw/*9.18*/("""
                """),format.raw/*10.17*/("""return true;
            """),format.raw/*11.13*/("""}"""),format.raw/*11.14*/("""
    """),format.raw/*12.5*/("""</script>
""")))};
Seq[Any](format.raw/*13.2*/("""

"""),_display_(/*15.2*/main("Suggestion Register", scripts)/*15.38*/ {_display_(Seq[Any](format.raw/*15.40*/("""
    """),format.raw/*16.5*/("""<div class="container">
        <div class="row">
            <div class="col s12">
                <div class="card-panel z-depth-0">
                    <form class="form-signin" enctype="multipart/form-data" method="post" onsubmit="return validateFormBeforeSubmit();" action=""""),_display_(/*20.146*/routes/*20.152*/.SuggestionController.suggestionRegisterPOST()),format.raw/*20.198*/("""">
                        <h4 class="center">Add a Suggestion</h4>
                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="title" id="title" class="validate"
                                required >
                                <label for="title">Suggestion Title*</label>
                                <span class="helper-text red-text" id="titleMsg"></span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="description" id="description" class="validate"
                                required="true">
                                <label for="description">Suggestion Short Description*</label>
                                <span class="helper-text red-text" id="descriptionMsg"></span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                """),format.raw/*42.172*/("""
                                """),format.raw/*43.33*/("""<br/>
                                <textarea style="height: 200px;
                                    word-wrap: break-word" name="longDescription" id="longDescription" placeholder=""  onchange="validateTextarea('longDescription', 'suggestion', 'addASuggestion')"></textarea>
                                <label for="description">Suggestion Long Description</label>
                                <span class="helper-text red-text" id="longDescriptionMsg"></span>
                            </div>
                        </div>

                        <div class="actions row">
                            <div class="input-field col s12 center">
                                <button type="submit" class="btn waves-effect waves-light blue darken-2" id="addASuggestion">Submit</button>
                                <a href=""""),_display_(/*54.43*/routes/*54.49*/.Application.home()),format.raw/*54.68*/("""" class="btn waves-effect waves-light red darken-2">Cancel</a>
                                <div class="helper-text red-text" id="submitErrorMsg"></div>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
    <script >
            var requiredFieldList = ["title", "description"];
            var notRequiredFieldList = [];
            setPattern(requiredFieldList, notRequiredFieldList, 'suggestion');
    </script>
""")))}),format.raw/*68.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:36 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/suggestionRegister.scala.html
                  HASH: a830358e1476eb5d3da2a9fcc0637e424c1e5bd5
                  MATRIX: 814->1|1213->18|1227->25|1307->30|1338->35|1401->72|1415->78|1485->128|1564->181|1578->187|1651->239|1774->335|1802->336|1846->353|1941->421|1969->422|2017->443|2074->473|2102->474|2147->491|2200->516|2229->517|2261->522|2311->533|2340->536|2385->572|2425->574|2457->579|2765->859|2781->865|2849->911|4130->2302|4191->2335|5059->3176|5074->3182|5114->3201|5675->3732
                  LINES: 31->1|40->2|40->2|42->2|43->3|43->3|43->3|43->3|44->4|44->4|44->4|46->6|46->6|47->7|47->7|47->7|48->8|49->9|49->9|50->10|51->11|51->11|52->12|54->13|56->15|56->15|56->15|57->16|61->20|61->20|61->20|83->42|84->43|95->54|95->54|95->54|109->68
                  -- GENERATED --
              */
          