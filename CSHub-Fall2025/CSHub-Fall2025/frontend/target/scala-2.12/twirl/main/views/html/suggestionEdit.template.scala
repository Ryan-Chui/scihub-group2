
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

object suggestionEdit extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Suggestion,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(suggestion: Suggestion):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.26*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Update Suggestion")/*4.27*/ {_display_(Seq[Any](format.raw/*4.29*/("""
    """),format.raw/*5.5*/("""<div class="container">
        <div class="row">
            <div class="col s12">
                <div class="card-panel">
                    <h4 class="center">"""),_display_(/*9.41*/suggestion/*9.51*/.getTitle),format.raw/*9.60*/("""</h4>
                    <div class="row">
                        <div class="col s12">
                            <form class="form-signin" id="update" enctype="multipart/form-data" method="post" action=""""),_display_(/*12.120*/routes/*12.126*/.SuggestionController.suggestionEditPOST(suggestion.getId)),format.raw/*12.184*/("""">
                                <div class="row">
                                    <div class="col s12">
                                        <h6 class="col s6" align="left">Immutable</h6>
                                        <div class="col s12">
                                            <table class="striped responsive-table">
                                                <tbody>
                                                    <tr>
                                                        <th>Name</th>
                                                        <td>"""),_display_(/*21.62*/suggestion/*21.72*/.getSuggestionReporter.getUserName),format.raw/*21.106*/("""</td>
                                                    </tr>
                                                    <tr>
                                                        <th>Email</th>
                                                        <td>"""),_display_(/*25.62*/suggestion/*25.72*/.getSuggestionReporter.getEmail),format.raw/*25.103*/("""</td>
                                                    </tr>
                                                    """),_display_(/*27.54*/if(suggestion.getSuggestionReporter.getOrganization != null && suggestion.getSuggestionReporter.getOrganization != "")/*27.172*/ {_display_(Seq[Any](format.raw/*27.174*/("""
                                                        """),format.raw/*28.57*/("""<tr>
                                                            <th>Organization</th>
                                                            <td>"""),_display_(/*30.66*/suggestion/*30.76*/.getSuggestionReporter.getOrganization),format.raw/*30.114*/("""</td>
                                                        </tr>
                                                    """)))}),format.raw/*32.54*/("""
                                                    """),format.raw/*33.53*/("""<tr>
                                                        <th>createdTime</th>
                                                        <td>"""),_display_(/*35.62*/suggestion/*35.72*/.getCreateTime),format.raw/*35.86*/("""</td>
                                                    </tr>
                                                    <tr>
                                                        <th>solvedTime</th>
                                                        """),_display_(/*39.58*/if(suggestion.getSolveTime == "")/*39.91*/{_display_(Seq[Any](format.raw/*39.92*/("""
                                                            """),format.raw/*40.61*/("""<td>Not Realized Yet</td>
                                                        """)))}/*41.58*/else/*41.63*/{_display_(Seq[Any](format.raw/*41.64*/("""
                                                            """),format.raw/*42.61*/("""<td>"""),_display_(/*42.66*/suggestion/*42.76*/.getSolveTime),format.raw/*42.89*/("""</td>
                                                        """)))}),format.raw/*43.58*/("""
                                                    """),format.raw/*44.53*/("""</tr>
                                                </tbody>
                                            </table>
                                        </div>
                                    </div>

                                </div>
                                <div class="row">
                                    <div class="col s12">
                                        <h6 class="col s6" align="left">Editable</h6>
                                        <input type="hidden" name="id" value=""""),_display_(/*54.80*/suggestion/*54.90*/.getId()),format.raw/*54.98*/("""">
                                        <input type="hidden" name="email" value=""""),_display_(/*55.83*/suggestion/*55.93*/.getSuggestionReporter.getEmail()),format.raw/*55.126*/("""">
                                        <input type="hidden" name="name" value=""""),_display_(/*56.82*/suggestion/*56.92*/.getSuggestionReporter.getUserName()),format.raw/*56.128*/("""">
                                        <input type="hidden" name="organization" value=""""),_display_(/*57.90*/suggestion/*57.100*/.getSuggestionReporter.getOrganization()),format.raw/*57.140*/("""">

                                        <div class="row">
                                            <div class="input-field col s12">
                                                <input
                                                type="text" name="title" id="title" class="validate"
                                                value=""""),_display_(/*63.57*/suggestion/*63.67*/.getTitle),format.raw/*63.76*/("""" required="true">
                                                <label for="title" class="tootltipLabel">
                                                    title* <i class=" tiny material-icons tooltipped" data-position="bottom">
                                                    help</i></label>
                                                <span id="titleMsg" class="helper-text" data-error=""></span>
                                            </div>
                                        </div>

                                        <div class="row">
                                            <div class="input-field col s12">
                                                <input
                                                type="text" name="description" id="description" class="validate"
                                                value=""""),_display_(/*75.57*/suggestion/*75.67*/.getDescription),format.raw/*75.82*/("""" required="true">
                                                <label for="description" class="tootltipLabel">
                                                    description* <i class=" tiny material-icons tooltipped" data-position="bottom">
                                                    help</i></label>
                                                <span id="descriptionMsg" class="helper-text" data-error=""></span>
                                            </div>
                                        </div>

                                        <div class="row">
                                            <div class="input-field col s12">
                                                <input type="text" class="validate" id="longDescription" value=""""),_display_(/*85.114*/suggestion/*85.124*/.getLongDescription),format.raw/*85.143*/("""" name="longDescription" >
                                                <label for="longDescription">Long Description</label>
                                                <span id="longDescriptionMsg" class="helper-text" data-error=""></span>
                                            </div>
                                        </div>
                                        <input type="hidden" name="solved" value=""""),_display_(/*90.84*/suggestion/*90.94*/.getSolved()),format.raw/*90.106*/("""">
                                        <input type="hidden" name="createdTime" value=""""),_display_(/*91.89*/suggestion/*91.99*/.getCreateTime()),format.raw/*91.115*/("""">
                                        <input type="hidden" name="createdTime" value=""""),_display_(/*92.89*/suggestion/*92.99*/.getSolveTime()),format.raw/*92.114*/("""">

                                        <div class="row center">
                                            <button type="submit" id="updateNotebook" class="center btn waves-effect waves-light blue darken-2">
                                                Update</button>
                                            """),format.raw/*97.98*/("""
                                            """),format.raw/*98.45*/("""<a class=" center btn waves-effect waves-light blue darken-2" href=""""),_display_(/*98.114*/routes/*98.120*/.SuggestionController.suggestionList(1)),format.raw/*98.159*/("""">
                                                Back</a>
                                            <div class="helper-text red-text" id="submitErrorMsg"></div>
                                        </div>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

""")))}),format.raw/*112.2*/("""
"""))
      }
    }
  }

  def render(suggestion:Suggestion): play.twirl.api.HtmlFormat.Appendable = apply(suggestion)

  def f:((Suggestion) => play.twirl.api.HtmlFormat.Appendable) = (suggestion) => apply(suggestion)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:36 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/suggestionEdit.scala.html
                  HASH: 32f1bf9ce8689403d558e5259b13edef6662b7a9
                  MATRIX: 1124->1|1221->27|1266->25|1293->43|1320->45|1353->70|1392->72|1423->77|1614->242|1632->252|1661->261|1898->470|1914->476|1994->534|2610->1123|2629->1133|2685->1167|2965->1420|2984->1430|3037->1461|3181->1578|3309->1696|3350->1698|3435->1755|3614->1907|3633->1917|3693->1955|3845->2076|3926->2129|4096->2272|4115->2282|4150->2296|4431->2550|4473->2583|4512->2584|4601->2645|4703->2728|4716->2733|4755->2734|4844->2795|4876->2800|4895->2810|4929->2823|5023->2886|5104->2939|5650->3458|5669->3468|5698->3476|5810->3561|5829->3571|5884->3604|5995->3688|6014->3698|6072->3734|6191->3826|6211->3836|6273->3876|6652->4228|6671->4238|6701->4247|7601->5120|7620->5130|7656->5145|8464->5925|8484->5935|8525->5954|8982->6384|9001->6394|9035->6406|9153->6497|9172->6507|9210->6523|9328->6614|9347->6624|9384->6639|9734->7014|9807->7059|9904->7128|9920->7134|9981->7173|10470->7631
                  LINES: 35->1|38->2|41->1|42->3|43->4|43->4|43->4|44->5|48->9|48->9|48->9|51->12|51->12|51->12|60->21|60->21|60->21|64->25|64->25|64->25|66->27|66->27|66->27|67->28|69->30|69->30|69->30|71->32|72->33|74->35|74->35|74->35|78->39|78->39|78->39|79->40|80->41|80->41|80->41|81->42|81->42|81->42|81->42|82->43|83->44|93->54|93->54|93->54|94->55|94->55|94->55|95->56|95->56|95->56|96->57|96->57|96->57|102->63|102->63|102->63|114->75|114->75|114->75|124->85|124->85|124->85|129->90|129->90|129->90|130->91|130->91|130->91|131->92|131->92|131->92|136->97|137->98|137->98|137->98|137->98|151->112
                  -- GENERATED --
              */
          