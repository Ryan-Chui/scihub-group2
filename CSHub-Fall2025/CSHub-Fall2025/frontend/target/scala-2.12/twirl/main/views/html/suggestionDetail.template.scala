
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
/*1.2*/import org.apache.commons.lang3.StringUtils

object suggestionDetail extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Suggestion,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(suggestion: Suggestion):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import helper._

def /*6.2*/scripts/*6.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.13*/("""
    """),format.raw/*7.5*/("""<script type="text/javascript">
    </script>
""")))};
Seq[Any](format.raw/*2.26*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*9.2*/("""

"""),_display_(/*11.2*/main("Suggestion Detail", scripts)/*11.36*/ {_display_(Seq[Any](format.raw/*11.38*/("""
    """),format.raw/*12.5*/("""<script type="text/javascript" src='"""),_display_(/*12.42*/routes/*12.48*/.Assets.at("javascripts/starrs.js")),format.raw/*12.83*/("""'></script>

    <div class="container">
        <div class="row">
            <div class="col s12">
                <div class="card-panel">
                    <h4 class="center">"""),_display_(/*18.41*/suggestion/*18.51*/.getTitle),format.raw/*18.60*/("""</h4>
                    <div class="row">
                        <div class="col s12">
                            <table class="striped responsive-table">
                                <tbody>
                                    <tr>
                                        <th>Title</th>
                                        <td style="word-wrap: break-word;">"""),_display_(/*25.77*/suggestion/*25.87*/.getTitle),format.raw/*25.96*/("""</td>
                                    </tr>
                                    <tr>
                                        <th>Reporter Name</th>
                                        <td style="word-wrap: break-word;">"""),_display_(/*29.77*/suggestion/*29.87*/.getSuggestionReporter.getUserName),format.raw/*29.121*/("""</td>
                                    </tr>
                                    <tr>
                                        <th>Reporter Email</th>
                                        <td style="word-wrap: break-word;">"""),_display_(/*33.77*/suggestion/*33.87*/.getSuggestionReporter.getEmail),format.raw/*33.118*/("""</td>
                                    </tr>

                                    """),_display_(/*36.38*/if(suggestion.getSuggestionReporter.getOrganization != null && suggestion.getSuggestionReporter.getOrganization != "")/*36.156*/ {_display_(Seq[Any](format.raw/*36.158*/("""

                                        """),format.raw/*38.41*/("""<tr>
                                            <th>Reporter Organization</th>
                                            <td style=" word-wrap: break-word;">"""),_display_(/*40.82*/suggestion/*40.92*/.getSuggestionReporter.getOrganization),format.raw/*40.130*/("""</td>
                                        </tr>
                                    """)))}),format.raw/*42.38*/("""
                                    """),format.raw/*43.37*/("""<tr>
                                        <th>Short Description</th>
                                        <td style="word-wrap: break-word;">"""),_display_(/*45.77*/suggestion/*45.87*/.getDescription),format.raw/*45.102*/("""</td>
                                    </tr>
                                    <tr>
                                        <th>Long Description</th>
                                        """),_display_(/*49.42*/if(suggestion.getLongDescription != "null" && suggestion.getLongDescription!="")/*49.122*/ {_display_(Seq[Any](format.raw/*49.124*/("""
                                            """),format.raw/*50.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*50.81*/suggestion/*50.91*/.getLongDescription),format.raw/*50.110*/("""</td>
                                        """)))}/*51.43*/else/*51.48*/{_display_(Seq[Any](format.raw/*51.49*/("""
                                            """),format.raw/*52.45*/("""<td style="word-wrap: break-word;">-</td>
                                        """)))}),format.raw/*53.42*/("""
                                    """),format.raw/*54.37*/("""</tr>
                                    <tr>
                                        <th>Create Time</th>
                                        <td style="word-wrap: break-word;">"""),_display_(/*57.77*/suggestion/*57.87*/.getCreateTime),format.raw/*57.101*/("""</td>
                                    </tr>

                                    <tr>
                                        <th>Reporter's Actions</th>
                                        <td>
                                            <a class="btn-floating waves-effect waves-light blue darken-2" title="Edit" href=""""),_display_(/*63.128*/routes/*63.134*/.SuggestionController.suggestionEditPage(suggestion.getId)),format.raw/*63.192*/(""""><i class="material-icons">
                                                edit</i></a>  &nbsp;
                                            <a class="btn-floating waves-effect waves-light red modal-trigger" title="Delete" href="#warningModal"><i class="material-icons">
                                                delete</i></a>



                                                <!-- Inactive Warning Modal Structure -->
                                            <div id="warningModal" class="modal">
                                                <div class="modal-content">
                                                    <h5 style="color: red">Warning</h5>
                                                    <p style="font-weight: bold">
                                                        Do you really want to delete this suggestion report: """),_display_(/*75.111*/suggestion/*75.121*/.getTitle),format.raw/*75.130*/(""" """),format.raw/*75.131*/("""?
                                                        Please note that after deletion, this suggestion report<span style="color: red">
                                                        CANNOT</span> be recovered.</p>
                                                </div>
                                                <div class="modal-footer">
                                                    <a href="#!" class="modal-close waves-effect waves-green btn-flat">
                                                        Cancel</a>
                                                    <a href='"""),_display_(/*82.63*/routes/*82.69*/.SuggestionController.suggestionDelete(suggestion.getId)),format.raw/*82.125*/("""'
                                                    class="modal-close waves-effect waves-green btn-flat">Confirm</a>
                                                </div>
                                            </div>
                                        </td>
                                    </tr>

                                </tbody>
                            </table>
                        </div>
                        <div class="row col s12 center">
                            <br/>
                            <a href=""""),_display_(/*94.39*/routes/*94.45*/.SuggestionController.suggestionList(1)),format.raw/*94.84*/("""" class="btn waves-effect waves-light blue darken-2">Back to Suggestion List</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

""")))}),format.raw/*102.2*/("""
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
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/suggestionDetail.scala.html
                  HASH: 44b140dfec627e6248a2e035fbc173f1b6e9a053
                  MATRIX: 814->1|1177->46|1274->73|1302->91|1316->98|1396->102|1427->107|1513->70|1541->89|1568->154|1597->157|1640->191|1680->193|1712->198|1776->235|1791->241|1847->276|2056->458|2075->468|2105->477|2503->848|2522->858|2552->867|2807->1095|2826->1105|2882->1139|3138->1368|3157->1378|3210->1409|3323->1495|3451->1613|3492->1615|3562->1657|3750->1818|3769->1828|3829->1866|3949->1955|4014->1992|4189->2140|4208->2150|4245->2165|4468->2361|4558->2441|4599->2443|4672->2488|4735->2524|4754->2534|4795->2553|4861->2601|4874->2606|4913->2607|4986->2652|5100->2735|5165->2772|5376->2956|5395->2966|5431->2980|5789->3310|5805->3316|5885->3374|6779->4240|6799->4250|6830->4259|6860->4260|7493->4866|7508->4872|7586->4928|8166->5481|8181->5487|8241->5526|8481->5735
                  LINES: 31->1|36->2|39->4|41->6|41->6|43->6|44->7|47->2|49->5|50->9|52->11|52->11|52->11|53->12|53->12|53->12|53->12|59->18|59->18|59->18|66->25|66->25|66->25|70->29|70->29|70->29|74->33|74->33|74->33|77->36|77->36|77->36|79->38|81->40|81->40|81->40|83->42|84->43|86->45|86->45|86->45|90->49|90->49|90->49|91->50|91->50|91->50|91->50|92->51|92->51|92->51|93->52|94->53|95->54|98->57|98->57|98->57|104->63|104->63|104->63|116->75|116->75|116->75|116->75|123->82|123->82|123->82|135->94|135->94|135->94|143->102
                  -- GENERATED --
              */
          