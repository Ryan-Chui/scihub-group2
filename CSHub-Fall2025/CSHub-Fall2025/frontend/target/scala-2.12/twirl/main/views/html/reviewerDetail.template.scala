
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

object reviewerDetail extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Reviewer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(user: Reviewer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import helper._


Seq[Any](format.raw/*2.18*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("User Profile")/*6.22*/ {_display_(Seq[Any](format.raw/*6.24*/("""
    """),format.raw/*7.5*/("""<div class="container">
        <div class="row">
            <div class="col s12">
                <div class="card-panel">
                    """),_display_(/*11.22*/if(session.get("id").equalsIgnoreCase(user.getId.toString))/*11.81*/ {_display_(Seq[Any](format.raw/*11.83*/("""
                        """),format.raw/*12.25*/("""<h4 class="center">My Space</h4>
                    """)))}/*13.23*/else/*13.28*/{_display_(Seq[Any](format.raw/*13.29*/("""
                        """),format.raw/*14.25*/("""<h4 class="center">"""),_display_(/*14.45*/user/*14.49*/.getReviewerName),format.raw/*14.65*/("""</h4>
                    """)))}),format.raw/*15.22*/("""
                    """),format.raw/*16.21*/("""<div class="row">
                        <div class="col s4">
                            <div class="center">
                                <img class="circle" id="showImg" src=""""),_display_(/*19.72*/user/*19.76*/.getAvatar),format.raw/*19.86*/("""" width="360" height="360" style="border-width: 1px;
                                    border-style: solid;
                                    border-radius: 50%;
                                    height: auto;
                                    width: 70%;">
                            </div>
                        </div>
                        <div class="col s8">
                            <table class="striped responsive-table">
                                <tbody>
                                    <tr>
                                        <th style="max-width: 50px">First Name</th>
                                        <td style="word-wrap: break-word;">"""),_display_(/*31.77*/user/*31.81*/.getFirstName),format.raw/*31.94*/("""</td>
                                    </tr>
                                    <tr>
                                        <th style="max-width: 50px">Middle Initial</th>
                                        """),_display_(/*35.42*/if(user.getMiddleInitial!="null" && user.getMiddleInitial != "")/*35.106*/ {_display_(Seq[Any](format.raw/*35.108*/("""
                                            """),format.raw/*36.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*36.81*/user/*36.85*/.getMiddleInitial),format.raw/*36.102*/("""</td>
                                        """)))}/*37.43*/else/*37.48*/{_display_(Seq[Any](format.raw/*37.49*/("""
                                            """),format.raw/*38.45*/("""<td>-</td>
                                        """)))}),format.raw/*39.42*/("""
                                    """),format.raw/*40.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">Last Name</th>
                                        <td style="word-wrap: break-word;">"""),_display_(/*43.77*/user/*43.81*/.getLastName),format.raw/*43.93*/("""</td>
                                    </tr>
                                    <tr>
                                        <th style="max-width: 50px">Affiliation</th>
                                        """),_display_(/*47.42*/if(user.getAffiliation!="null" && user.getAffiliation != "")/*47.102*/ {_display_(Seq[Any](format.raw/*47.104*/("""
                                            """),format.raw/*48.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*48.81*/user/*48.85*/.getAffiliation),format.raw/*48.100*/("""</td>
                                        """)))}/*49.43*/else/*49.48*/{_display_(Seq[Any](format.raw/*49.49*/("""
                                            """),format.raw/*50.45*/("""<td>-</td>
                                        """)))}),format.raw/*51.42*/("""
                                    """),format.raw/*52.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">Title</th>
                                        """),_display_(/*55.42*/if(user.getTitle != "null" && user.getTitle != "")/*55.92*/ {_display_(Seq[Any](format.raw/*55.94*/("""
                                            """),format.raw/*56.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*56.81*/user/*56.85*/.getTitle),format.raw/*56.94*/("""</td>
                                        """)))}/*57.43*/else/*57.48*/{_display_(Seq[Any](format.raw/*57.49*/("""
                                            """),format.raw/*58.45*/("""<td>-</td>
                                        """)))}),format.raw/*59.42*/("""
                                    """),format.raw/*60.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">Research Fields</th>
                                        """),_display_(/*63.42*/if(user.getResearchFields != "null" && user.getResearchFields != "")/*63.110*/ {_display_(Seq[Any](format.raw/*63.112*/("""
                                            """),format.raw/*64.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*64.81*/user/*64.85*/.getResearchFields),format.raw/*64.103*/("""</td>
                                        """)))}/*65.43*/else/*65.48*/{_display_(Seq[Any](format.raw/*65.49*/("""
                                            """),format.raw/*66.45*/("""<td>-</td>
                                        """)))}),format.raw/*67.42*/("""
                                    """),format.raw/*68.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">Highest Degree</th>
                                        """),_display_(/*71.42*/if(user.getHighestDegree != "null" && user.getHighestDegree != "")/*71.108*/ {_display_(Seq[Any](format.raw/*71.110*/("""
                                            """),format.raw/*72.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*72.81*/user/*72.85*/.getHighestDegree),format.raw/*72.102*/("""</td>
                                        """)))}/*73.43*/else/*73.48*/{_display_(Seq[Any](format.raw/*73.49*/("""
                                            """),format.raw/*74.45*/("""<td>-</td>
                                        """)))}),format.raw/*75.42*/("""
                                    """),format.raw/*76.37*/("""</tr>


                                </tbody>
                            </table>
                        </div>
                    </div>
                    <div class="row center">

                        <a href=""""),_display_(/*85.35*/routes/*85.41*/.ReviewerController.reviewerList(1, "id")),format.raw/*85.82*/("""" class="btn waves-effect waves-light blue darken-2">
                            Back to Reviewer List</a>

                    </div>
                </div>
            </div>
        </div>


""")))}),format.raw/*94.2*/("""
"""))
      }
    }
  }

  def render(user:Reviewer): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((Reviewer) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:36 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/reviewerDetail.scala.html
                  HASH: 56d287dffae67612b3c96552f89c4a2807a33d10
                  MATRIX: 814->1|1173->46|1262->65|1307->62|1335->81|1362->83|1390->103|1429->105|1460->110|1633->256|1701->315|1741->317|1794->342|1867->397|1880->402|1919->403|1972->428|2019->448|2032->452|2069->468|2127->495|2176->516|2386->699|2399->703|2430->713|3144->1400|3157->1404|3191->1417|3436->1635|3510->1699|3551->1701|3624->1746|3687->1782|3700->1786|3739->1803|3805->1851|3818->1856|3857->1857|3930->1902|4013->1954|4078->1991|4311->2197|4324->2201|4357->2213|4599->2428|4669->2488|4710->2490|4783->2535|4846->2571|4859->2575|4896->2590|4962->2638|4975->2643|5014->2644|5087->2689|5170->2741|5235->2778|5429->2945|5488->2995|5528->2997|5601->3042|5664->3078|5677->3082|5707->3091|5773->3139|5786->3144|5825->3145|5898->3190|5981->3242|6046->3279|6250->3456|6328->3524|6369->3526|6442->3571|6505->3607|6518->3611|6558->3629|6624->3677|6637->3682|6676->3683|6749->3728|6832->3780|6897->3817|7100->3993|7176->4059|7217->4061|7290->4106|7353->4142|7366->4146|7405->4163|7471->4211|7484->4216|7523->4217|7596->4262|7679->4314|7744->4351|7995->4575|8010->4581|8072->4622|8298->4818
                  LINES: 31->1|36->2|39->4|42->2|44->5|45->6|45->6|45->6|46->7|50->11|50->11|50->11|51->12|52->13|52->13|52->13|53->14|53->14|53->14|53->14|54->15|55->16|58->19|58->19|58->19|70->31|70->31|70->31|74->35|74->35|74->35|75->36|75->36|75->36|75->36|76->37|76->37|76->37|77->38|78->39|79->40|82->43|82->43|82->43|86->47|86->47|86->47|87->48|87->48|87->48|87->48|88->49|88->49|88->49|89->50|90->51|91->52|94->55|94->55|94->55|95->56|95->56|95->56|95->56|96->57|96->57|96->57|97->58|98->59|99->60|102->63|102->63|102->63|103->64|103->64|103->64|103->64|104->65|104->65|104->65|105->66|106->67|107->68|110->71|110->71|110->71|111->72|111->72|111->72|111->72|112->73|112->73|112->73|113->74|114->75|115->76|124->85|124->85|124->85|133->94
                  -- GENERATED --
              */
          