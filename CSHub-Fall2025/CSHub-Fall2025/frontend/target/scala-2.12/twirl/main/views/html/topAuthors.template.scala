
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

object topAuthors extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[User],play.twirl.api.HtmlFormat.Appendable] {

  /*@(entries: List[Author])*/
  def apply/*2.2*/(entries: List[User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.23*/("""
"""),_display_(/*4.2*/main("Top Author")/*4.20*/ {_display_(Seq[Any](format.raw/*4.22*/("""
    """),format.raw/*5.5*/("""<div class="container">
        <div class="card-panel center">


        <table class="centered responsive-table striped" id="userTable" >
        <thead>
            <tr class="list-header" style="border-bottom: 1px solid; !important;">
                <th style="cursor: pointer;">Researcher Id</th>
                <th style="cursor: pointer;">Researcher Name</th>
"""),format.raw/*14.66*/("""
                """),format.raw/*15.17*/("""<th style="cursor: pointer;">Email</th>
                <th style="cursor: pointer;">Research Areas</th>
            </tr>
        </thead>
        <tbody>
        """),_display_(/*20.10*/for((entry, index) <- entries.zipWithIndex) yield /*20.53*/ {_display_(Seq[Any](format.raw/*20.55*/("""
            """),_display_(/*21.14*/if(index<21)/*21.26*/{_display_(Seq[Any](format.raw/*21.27*/("""

            """),format.raw/*23.13*/("""<tr>
                <td>"""),_display_(/*24.22*/entry/*24.27*/.getId()),format.raw/*24.35*/("""</td>

"""),format.raw/*26.126*/("""
                """),format.raw/*27.17*/("""<td><a href = """"),_display_(/*27.33*/routes/*27.39*/.AuthorController.authorDetailPage(entry.getId())),format.raw/*27.88*/("""">"""),_display_(/*27.91*/entry/*27.96*/.getFirstName()),format.raw/*27.111*/(""" """),format.raw/*27.112*/("""</a></td>

"""),format.raw/*29.56*/("""
"""),format.raw/*30.94*/("""
"""),format.raw/*31.52*/("""
"""),format.raw/*32.30*/("""
"""),format.raw/*33.29*/("""
"""),format.raw/*34.107*/("""
"""),format.raw/*35.22*/("""

                """),format.raw/*37.17*/("""<td>"""),_display_(/*37.22*/entry/*37.27*/.getEmail()),format.raw/*37.38*/("""</td>

                """),_display_(/*39.18*/if(entry.getResearchFields() !="null" && entry.getResearchFields() != "")/*39.91*/ {_display_(Seq[Any](format.raw/*39.93*/("""
                    """),format.raw/*40.21*/("""<td>"""),_display_(/*40.26*/entry/*40.31*/.getResearchFields()),format.raw/*40.51*/("""</td>
                """)))}/*41.18*/else/*41.22*/{_display_(Seq[Any](format.raw/*41.23*/("""
                    """),format.raw/*42.21*/("""<td>-</td>
                """)))}),format.raw/*43.18*/("""


                """),format.raw/*46.17*/("""</td>

            </tr>
            """)))}),format.raw/*49.14*/("""
        """)))}),format.raw/*50.10*/("""
        """),format.raw/*51.9*/("""</tbody>
    </table>
        </div>
    </div>
""")))}))
      }
    }
  }

  def render(entries:List[User]): play.twirl.api.HtmlFormat.Appendable = apply(entries)

  def f:((List[User]) => play.twirl.api.HtmlFormat.Appendable) = (entries) => apply(entries)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:39 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/topAuthors.scala.html
                  HASH: 9ed7eb4c9a1947ce163f74cea245078bb3fd8584
                  MATRIX: 1144->30|1238->53|1283->51|1310->70|1336->88|1375->90|1406->95|1803->529|1848->546|2040->711|2099->754|2139->756|2180->770|2201->782|2240->783|2282->797|2335->823|2349->828|2378->836|2414->968|2459->985|2502->1001|2517->1007|2587->1056|2617->1059|2631->1064|2668->1079|2698->1080|2737->1146|2766->1240|2795->1292|2824->1322|2853->1351|2883->1458|2912->1480|2958->1498|2990->1503|3004->1508|3036->1519|3087->1543|3169->1616|3209->1618|3258->1639|3290->1644|3304->1649|3345->1669|3387->1692|3400->1696|3439->1697|3488->1718|3547->1746|3594->1765|3663->1803|3704->1813|3740->1822
                  LINES: 35->2|38->3|41->2|42->4|42->4|42->4|43->5|52->14|53->15|58->20|58->20|58->20|59->21|59->21|59->21|61->23|62->24|62->24|62->24|64->26|65->27|65->27|65->27|65->27|65->27|65->27|65->27|65->27|67->29|68->30|69->31|70->32|71->33|72->34|73->35|75->37|75->37|75->37|75->37|77->39|77->39|77->39|78->40|78->40|78->40|78->40|79->41|79->41|79->41|80->42|81->43|84->46|87->49|88->50|89->51
                  -- GENERATED --
              */
          