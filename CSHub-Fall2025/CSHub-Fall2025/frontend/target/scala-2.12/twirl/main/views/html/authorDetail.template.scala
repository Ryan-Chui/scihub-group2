
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

object authorDetail extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[User,play.twirl.api.HtmlFormat.Appendable] {

  /*
@(user: Author)
*/
  def apply/*5.2*/(user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*7.2*/import helper._


Seq[Any](format.raw/*5.14*/("""

"""),format.raw/*8.1*/("""
"""),_display_(/*9.2*/main("User Profile")/*9.22*/ {_display_(Seq[Any](format.raw/*9.24*/("""
    """),format.raw/*10.5*/("""<div class="container">
        <div class="row">
            <div class="col s12">
                <div class="card-panel">
                    <h4 class="center">Researcher Profile</h4>
                    """),format.raw/*20.24*/("""
                    """),format.raw/*21.21*/("""<div class="row">
                        <div class="col s4">
                            <div class="center">
                                <td>
                                <img class="circle" id="showImg" src=""""),_display_(/*25.72*/routes/*25.78*/.Application.getImageFromPath(user.getAvatar())),format.raw/*25.125*/("""" width="360" height="360" style="border-width: 1px;
                                    border-style: solid;
                                    border-radius: 50%;
                                    height: auto;
                                    width: 70%;">
                                </td>
                            </div>
                        </div>
                        <div class="col s8">
                            <table class="striped responsive-table">
                                <tbody>
                                    <tr>
                                        <th style="max-width: 50px">First Name</th>
                                        <td style="word-wrap: break-word;">"""),_display_(/*38.77*/user/*38.81*/.getFirstName),format.raw/*38.94*/("""</td>
                                    </tr>
                                    <tr>
                                        <th style="max-width: 50px">Middle Initial</th>
                                        """),_display_(/*42.42*/if(user.getMiddleInitial!="null" && user.getMiddleInitial != "")/*42.106*/ {_display_(Seq[Any](format.raw/*42.108*/("""
                                            """),format.raw/*43.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*43.81*/user/*43.85*/.getMiddleInitial),format.raw/*43.102*/("""</td>
                                        """)))}/*44.43*/else/*44.48*/{_display_(Seq[Any](format.raw/*44.49*/("""
                                            """),format.raw/*45.45*/("""<td>-</td>
                                        """)))}),format.raw/*46.42*/("""
                                    """),format.raw/*47.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">Last Name</th>
                                        <td style="word-wrap: break-word;">"""),_display_(/*50.77*/user/*50.81*/.getLastName),format.raw/*50.93*/("""</td>
                                    </tr>
"""),format.raw/*52.45*/("""
"""),format.raw/*53.89*/("""
"""),format.raw/*54.108*/("""
"""),format.raw/*55.109*/("""
"""),format.raw/*56.53*/("""
"""),format.raw/*57.59*/("""
"""),format.raw/*58.46*/("""
"""),format.raw/*59.46*/("""
"""),format.raw/*60.45*/("""
"""),format.raw/*61.83*/("""
"""),format.raw/*62.98*/("""
"""),format.raw/*63.103*/("""
"""),format.raw/*64.53*/("""
"""),format.raw/*65.59*/("""
"""),format.raw/*66.46*/("""
"""),format.raw/*67.46*/("""
                                    """),format.raw/*68.37*/("""<tr>
                                        <th style="max-width: 50px">Research Fields</th>
                                        """),_display_(/*70.42*/if(user.getResearchFields != "null" && user.getResearchFields != "")/*70.110*/ {_display_(Seq[Any](format.raw/*70.112*/("""
                                            """),format.raw/*71.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*71.81*/user/*71.85*/.getResearchFields),format.raw/*71.103*/("""</td>
                                        """)))}/*72.43*/else/*72.48*/{_display_(Seq[Any](format.raw/*72.49*/("""
                                            """),format.raw/*73.45*/("""<td>-</td>
                                        """)))}),format.raw/*74.42*/("""
                                    """),format.raw/*75.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">Highest Degree</th>
                                        """),_display_(/*78.42*/if(user.getHighestDegree != "null" && user.getHighestDegree != "")/*78.108*/ {_display_(Seq[Any](format.raw/*78.110*/("""
                                            """),format.raw/*79.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*79.81*/user/*79.85*/.getHighestDegree),format.raw/*79.102*/("""</td>
                                        """)))}/*80.43*/else/*80.48*/{_display_(Seq[Any](format.raw/*80.49*/("""
                                            """),format.raw/*81.45*/("""<td>-</td>
                                        """)))}),format.raw/*82.42*/("""
                                    """),format.raw/*83.37*/("""</tr>
                                    <tr>
                                        <th>Personal URL</th>
                                        """),_display_(/*86.42*/if(user.getHomepage != "null" && user.getHomepage != "")/*86.98*/ {_display_(Seq[Any](format.raw/*86.100*/("""
                                            """),format.raw/*87.45*/("""<td><a href=""""),_display_(/*87.59*/user/*87.63*/.getHomepage),format.raw/*87.75*/("""" target="_blank">"""),_display_(/*87.94*/user/*87.98*/.getHomepage),format.raw/*87.110*/("""</a></td>
                                        """)))}/*88.43*/else/*88.48*/{_display_(Seq[Any](format.raw/*88.49*/("""
                                            """),format.raw/*89.45*/("""<td>-</td>
                                        """)))}),format.raw/*90.42*/("""
                                    """),format.raw/*91.37*/("""</tr>

                                </tbody>
                            </table>
                        </div>
                    </div>
                    <div class="row center">
                        <a href=""""),_display_(/*98.35*/routes/*98.41*/.AuthorController.authorList(1, "id")),format.raw/*98.78*/("""" class="btn waves-effect waves-light blue darken-2">
                            Back to Author List</a>

                    </div>
                </div>
            </div>
        </div>


""")))}),format.raw/*107.2*/("""
"""))
      }
    }
  }

  def render(user:User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:29 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/authorDetail.scala.html
                  HASH: 54a9acdd9c195aeedf260b7d9b79c495705a5275
                  MATRIX: 814->1|1184->68|1269->83|1314->80|1342->99|1369->101|1397->121|1436->123|1468->128|1704->646|1753->667|2000->887|2015->893|2084->940|2836->1665|2849->1669|2883->1682|3128->1900|3202->1964|3243->1966|3316->2011|3379->2047|3392->2051|3431->2068|3497->2116|3510->2121|3549->2122|3622->2167|3705->2219|3770->2256|4003->2462|4016->2466|4049->2478|4125->2570|4154->2659|4184->2767|4214->2876|4243->2929|4272->2988|4301->3034|4330->3080|4359->3125|4388->3208|4417->3306|4447->3409|4476->3462|4505->3521|4534->3567|4563->3613|4628->3650|4790->3785|4868->3853|4909->3855|4982->3900|5045->3936|5058->3940|5098->3958|5164->4006|5177->4011|5216->4012|5289->4057|5372->4109|5437->4146|5640->4322|5716->4388|5757->4390|5830->4435|5893->4471|5906->4475|5945->4492|6011->4540|6024->4545|6063->4546|6136->4591|6219->4643|6284->4680|6461->4830|6526->4886|6567->4888|6640->4933|6681->4947|6694->4951|6727->4963|6773->4982|6786->4986|6820->4998|6890->5050|6903->5055|6942->5056|7015->5101|7098->5153|7163->5190|7412->5412|7427->5418|7485->5455|7710->5649
                  LINES: 31->1|38->5|41->7|44->5|46->8|47->9|47->9|47->9|48->10|53->20|54->21|58->25|58->25|58->25|71->38|71->38|71->38|75->42|75->42|75->42|76->43|76->43|76->43|76->43|77->44|77->44|77->44|78->45|79->46|80->47|83->50|83->50|83->50|85->52|86->53|87->54|88->55|89->56|90->57|91->58|92->59|93->60|94->61|95->62|96->63|97->64|98->65|99->66|100->67|101->68|103->70|103->70|103->70|104->71|104->71|104->71|104->71|105->72|105->72|105->72|106->73|107->74|108->75|111->78|111->78|111->78|112->79|112->79|112->79|112->79|113->80|113->80|113->80|114->81|115->82|116->83|119->86|119->86|119->86|120->87|120->87|120->87|120->87|120->87|120->87|120->87|121->88|121->88|121->88|122->89|123->90|124->91|131->98|131->98|131->98|140->107
                  -- GENERATED --
              */
          