
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

object challengeEditAdmin extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[com.fasterxml.jackson.databind.JsonNode,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(data: com.fasterxml.jackson.databind.JsonNode):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._
/*3.2*/import scala.collection.JavaConverters._


Seq[Any](format.raw/*1.49*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Challenge Edit")/*5.24*/ {_display_(Seq[Any](format.raw/*5.26*/("""
    """),format.raw/*6.5*/("""<div class="container">
        <div class="row">
            <div class="col s12 m10 offset-m1">
                <div class="card-panel">
                    <h4 class="center">Edit Challenge Information</h4>

                    <form action=""""),_display_(/*12.36*/routes/*12.42*/.ChallengeController.challengeEditPOSTAdmin((data.get("id").asText().toLong))),format.raw/*12.119*/("""" method="post">
                        <table class="striped responsive-table">
                            <thead>
                                <tr>
                                    <th>Field</th>
                                    <th>Value</th>
                                </tr>
                            </thead>
                            <tbody>
                                """),_display_(/*21.34*/for(fieldName <- data.fieldNames().asScala) yield /*21.77*/ {_display_(Seq[Any](format.raw/*21.79*/("""
                                    """),_display_(/*22.38*/defining(data.get(fieldName))/*22.67*/ { fieldValue =>_display_(Seq[Any](format.raw/*22.83*/("""
                                        """),_display_(/*23.42*/if(fieldName == "id")/*23.63*/ {_display_(Seq[Any](format.raw/*23.65*/("""
                                            """),format.raw/*24.45*/("""<tr>
                                                <td>
                                                    <label for=""""),_display_(/*26.66*/fieldName),format.raw/*26.75*/("""">"""),_display_(/*26.78*/fieldName),format.raw/*26.87*/(""" """),format.raw/*26.88*/("""(read-only)</label>
                                                </td>
                                                <td>
                                                    <input type="text"
                                                    id=""""),_display_(/*30.58*/fieldName),format.raw/*30.67*/(""""
                                                    name=""""),_display_(/*31.60*/fieldName),format.raw/*31.69*/(""""
                                                    value='"""),_display_(/*32.61*/fieldValue/*32.71*/.asText()),format.raw/*32.80*/("""'
                                                    readonly />
                                                </td>
                                            </tr>
                                        """)))}/*36.43*/else/*36.48*/{_display_(Seq[Any](format.raw/*36.49*/("""
                                            """),format.raw/*37.45*/("""<tr>
                                                <td>
                                                    <label for=""""),_display_(/*39.66*/fieldName),format.raw/*39.75*/("""">"""),_display_(/*39.78*/fieldName),format.raw/*39.87*/("""</label>
                                                </td>
                                                <td>
                                                    <input type="text"
                                                    id=""""),_display_(/*43.58*/fieldName),format.raw/*43.67*/(""""
                                                    name=""""),_display_(/*44.60*/fieldName),format.raw/*44.69*/(""""
                                                    value='"""),_display_(/*45.61*/fieldValue/*45.71*/.asText()),format.raw/*45.80*/("""' />
                                                </td>
                                            </tr>
                                        """)))}),format.raw/*48.42*/("""
                                    """)))}),format.raw/*49.38*/("""
                                """)))}),format.raw/*50.34*/("""
                            """),format.raw/*51.29*/("""</tbody>
                        </table>

                        <div class="row center" style="margin-top:20px;">
                            <button type="submit" class="btn waves-effect waves-light blue darken-2">
                                Update
                            </button>
                            <a href=""""),_display_(/*58.39*/routes/*58.45*/.ChallengeController.challengeDetail((data.get("id").asText().toLong))),format.raw/*58.115*/(""""
                            class="btn waves-effect waves-light red darken-2">
                                Cancel
                            </a>
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

  def render(data:com.fasterxml.jackson.databind.JsonNode): play.twirl.api.HtmlFormat.Appendable = apply(data)

  def f:((com.fasterxml.jackson.databind.JsonNode) => play.twirl.api.HtmlFormat.Appendable) = (data) => apply(data)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:30 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/challengeEditAdmin.scala.html
                  HASH: 0e4bbaf8078002fedf6d5fb3e514837e05c1b0a6
                  MATRIX: 1157->1|1277->50|1300->67|1370->48|1397->108|1424->110|1454->132|1493->134|1524->139|1797->385|1812->391|1911->468|2339->869|2398->912|2438->914|2503->952|2541->981|2595->997|2664->1039|2694->1060|2734->1062|2807->1107|2957->1230|2987->1239|3017->1242|3047->1251|3076->1252|3358->1507|3388->1516|3476->1577|3506->1586|3595->1648|3614->1658|3644->1667|3874->1879|3887->1884|3926->1885|3999->1930|4149->2053|4179->2062|4209->2065|4239->2074|4510->2318|4540->2327|4628->2388|4658->2397|4747->2459|4766->2469|4796->2478|4977->2628|5046->2666|5111->2700|5168->2729|5529->3063|5544->3069|5636->3139
                  LINES: 35->1|38->2|39->3|42->1|43->4|44->5|44->5|44->5|45->6|51->12|51->12|51->12|60->21|60->21|60->21|61->22|61->22|61->22|62->23|62->23|62->23|63->24|65->26|65->26|65->26|65->26|65->26|69->30|69->30|70->31|70->31|71->32|71->32|71->32|75->36|75->36|75->36|76->37|78->39|78->39|78->39|78->39|82->43|82->43|83->44|83->44|84->45|84->45|84->45|87->48|88->49|89->50|90->51|97->58|97->58|97->58
                  -- GENERATED --
              */
          