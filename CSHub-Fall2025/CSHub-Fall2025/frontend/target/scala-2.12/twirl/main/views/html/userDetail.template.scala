
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

object userDetail extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import helper._

def /*6.2*/scripts/*6.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.13*/("""
    """),format.raw/*7.5*/("""<link rel="stylesheet" href=""""),_display_(/*7.35*/routes/*7.41*/.Assets.at("stylesheets/responsive-table.css")),format.raw/*7.87*/("""">
    <link rel="stylesheet" href="/assets/stylesheets/responsive-table.css">
""")))};
Seq[Any](format.raw/*2.14*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*9.2*/("""

"""),_display_(/*11.2*/main("User Profile", scripts)/*11.31*/ {_display_(Seq[Any](format.raw/*11.33*/("""
    """),format.raw/*12.5*/("""<div class="container">
        <div class="row">
            <div class="col s12">
                <div class="card-panel">
                    """),_display_(/*16.22*/if(session.get("id").equalsIgnoreCase(user.getId.toString))/*16.81*/ {_display_(Seq[Any](format.raw/*16.83*/("""
                        """),format.raw/*17.25*/("""<h4 class="center">My Profile</h4>
                    """)))}/*18.23*/else/*18.28*/{_display_(Seq[Any](format.raw/*18.29*/("""
                        """),format.raw/*19.25*/("""<h4 class="center">"""),_display_(/*19.45*/user/*19.49*/.getUserName),format.raw/*19.61*/("""</h4>
                    """)))}),format.raw/*20.22*/("""
                """),format.raw/*21.17*/("""<div class="detail-desktop">
                    <div class="row">
                        <div class="col s4">
                            <div class="center">
                                <img class="circle" id="showImg" src=""""),_display_(/*25.72*/routes/*25.78*/.Application.getImageFromPath(user.getAvatar())),format.raw/*25.125*/("""" style="border-width: 1px;
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
                                        <td style="word-wrap: break-word;">"""),_display_(/*37.77*/user/*37.81*/.getFirstName),format.raw/*37.94*/("""</td>
                                    </tr>
                                    <tr>
                                        <th style="max-width: 50px">Middle Initial</th>
                                        """),_display_(/*41.42*/if(user.getMiddleInitial!="null" && user.getMiddleInitial != "")/*41.106*/ {_display_(Seq[Any](format.raw/*41.108*/("""
                                            """),format.raw/*42.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*42.81*/user/*42.85*/.getMiddleInitial),format.raw/*42.102*/("""</td>
                                        """)))}/*43.43*/else/*43.48*/{_display_(Seq[Any](format.raw/*43.49*/("""
                                            """),format.raw/*44.45*/("""<td>-</td>
                                        """)))}),format.raw/*45.42*/("""
                                    """),format.raw/*46.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">Last Name</th>
                                        <td style="word-wrap: break-word;">"""),_display_(/*49.77*/user/*49.81*/.getLastName),format.raw/*49.93*/("""</td>
                                    </tr>
                                    <tr>
                                        <th style="max-width: 50px">Organization</th>
                                        """),_display_(/*53.42*/if(user.getOrganization!="null" && user.getOrganization != "")/*53.104*/ {_display_(Seq[Any](format.raw/*53.106*/("""
                                            """),format.raw/*54.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*54.81*/user/*54.85*/.getOrganization),format.raw/*54.101*/("""</td>
                                        """)))}/*55.43*/else/*55.48*/{_display_(Seq[Any](format.raw/*55.49*/("""
                                            """),format.raw/*56.45*/("""<td>-</td>
                                        """)))}),format.raw/*57.42*/("""
                                    """),format.raw/*58.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">Personal URL</th>
                                        """),_display_(/*61.42*/if(user.getHomepage!="null" && user.getHomepage != "")/*61.96*/ {_display_(Seq[Any](format.raw/*61.98*/("""
                                            """),format.raw/*62.45*/("""<td style="word-wrap: break-word;"><a href=""""),_display_(/*62.90*/user/*62.94*/.getHomepage),format.raw/*62.106*/("""" target="_blank">"""),_display_(/*62.125*/user/*62.129*/.getHomepage),format.raw/*62.141*/("""</a></td>
                                        """)))}/*63.43*/else/*63.48*/{_display_(Seq[Any](format.raw/*63.49*/("""
                                            """),format.raw/*64.45*/("""<td>-</td>
                                        """)))}),format.raw/*65.42*/("""
                                    """),format.raw/*66.37*/("""</tr>
                                </tbody>
                            </table>
                       </div>
                    </div>
                </div>

                <!-- Mobile Cards -->
                <div class="detail-mobile">
                    <div class="card-panel detail-card">
                        <div class="center">
                            <img class="circle" id="showImg" src=""""),_display_(/*77.68*/routes/*77.74*/.Application.getImageFromPath(user.getAvatar())),format.raw/*77.121*/("""" style="border: 1px solid; border-radius: 50%; width: 100px; height: 100px;">
                        </div>

                        <div><h6>First Name:</h6> """),_display_(/*80.52*/user/*80.56*/.getFirstName),format.raw/*80.69*/(""" """),format.raw/*80.70*/("""</div>

                        <div><h6>Middle initial:</h6> """),_display_(/*82.56*/if(user.getMiddleInitial != "null" && user.getMiddleInitial != "")/*82.122*/ {_display_(Seq[Any](format.raw/*82.124*/(""" """),_display_(/*82.126*/user/*82.130*/.getMiddleInitial),format.raw/*82.147*/(""" """)))}/*82.150*/else/*82.155*/{_display_(Seq[Any](format.raw/*82.156*/(""" """),format.raw/*82.157*/("""- """)))}),format.raw/*82.160*/("""</div>

                        <div><h6>Last Name:</h6> """),_display_(/*84.51*/user/*84.55*/.getLastName),format.raw/*84.67*/(""" """),format.raw/*84.68*/("""</div>

                        <div><h6>Organization:</h6> """),_display_(/*86.54*/if(user.getOrganization != "null" && user.getOrganization != "")/*86.118*/ {_display_(Seq[Any](format.raw/*86.120*/(""" """),_display_(/*86.122*/user/*86.126*/.getOrganization),format.raw/*86.142*/(""" """)))}/*86.145*/else/*86.150*/{_display_(Seq[Any](format.raw/*86.151*/(""" """),format.raw/*86.152*/("""- """)))}),format.raw/*86.155*/("""</div>

                        <div><h6>Personal URL:</h6> """),_display_(/*88.54*/if(user.getHomepage != "null" && user.getHomepage != "")/*88.110*/ {_display_(Seq[Any](format.raw/*88.112*/("""
                            """),format.raw/*89.29*/("""<a href=""""),_display_(/*89.39*/user/*89.43*/.getHomepage),format.raw/*89.55*/("""" target="_blank">"""),_display_(/*89.74*/user/*89.78*/.getHomepage),format.raw/*89.90*/("""</a>
                        """)))}/*90.27*/else/*90.32*/{_display_(Seq[Any](format.raw/*90.33*/(""" """),format.raw/*90.34*/("""- """)))}),format.raw/*90.37*/("""
                        """),format.raw/*91.25*/("""</div>
                    </div>
                </div>

                <div class=“center”>
                """),_display_(/*96.18*/if(session.get("id").equalsIgnoreCase(user.getId.toString))/*96.77*/ {_display_(Seq[Any](format.raw/*96.79*/("""
                    """),format.raw/*97.21*/("""<center><a href=""""),_display_(/*97.39*/routes/*97.45*/.UserController.userEditPage()),format.raw/*97.75*/("""" class="btn waves-effect waves-light blue darken-2">
                        Edit Profile</a></center>
                """)))}/*99.19*/else/*99.23*/{_display_(Seq[Any](format.raw/*99.24*/("""
                    """),format.raw/*100.21*/("""<a href=""""),_display_(/*100.31*/routes/*100.37*/.UserController.userList(1, "id")),format.raw/*100.70*/("""" class="btn waves-effect waves-light blue darken-2">
                        Back to User List</a>
                """)))}),format.raw/*102.18*/("""
                """),format.raw/*103.17*/("""</div>
                </div>
            </div>
            </div>
        </div>
    </div>
</div>
""")))}),format.raw/*110.2*/("""

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
                  DATE: Fri Apr 24 12:50:39 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/userDetail.scala.html
                  HASH: 1ed4425d7376b43694d49dcee70028c74fadfce9
                  MATRIX: 814->1|1165->46|1250->61|1278->79|1292->86|1372->90|1403->95|1459->125|1473->131|1539->177|1658->58|1686->77|1713->257|1742->260|1780->289|1820->291|1852->296|2025->442|2093->501|2133->503|2186->528|2261->585|2274->590|2313->591|2366->616|2413->636|2426->640|2459->652|2517->679|2562->696|2821->928|2836->934|2905->981|3610->1659|3623->1663|3657->1676|3902->1894|3976->1958|4017->1960|4090->2005|4153->2041|4166->2045|4205->2062|4271->2110|4284->2115|4323->2116|4396->2161|4479->2213|4544->2250|4777->2456|4790->2460|4823->2472|5066->2688|5138->2750|5179->2752|5252->2797|5315->2833|5328->2837|5366->2853|5432->2901|5445->2906|5484->2907|5557->2952|5640->3004|5705->3041|5906->3215|5969->3269|6009->3271|6082->3316|6154->3361|6167->3365|6201->3377|6248->3396|6262->3400|6296->3412|6366->3464|6379->3469|6418->3470|6491->3515|6574->3567|6639->3604|7082->4020|7097->4026|7166->4073|7355->4235|7368->4239|7402->4252|7431->4253|7521->4316|7597->4382|7638->4384|7668->4386|7682->4390|7721->4407|7743->4410|7757->4415|7797->4416|7827->4417|7862->4420|7947->4478|7960->4482|7993->4494|8022->4495|8110->4556|8184->4620|8225->4622|8255->4624|8269->4628|8307->4644|8329->4647|8343->4652|8383->4653|8413->4654|8448->4657|8536->4718|8602->4774|8643->4776|8700->4805|8737->4815|8750->4819|8783->4831|8829->4850|8842->4854|8875->4866|8924->4897|8937->4902|8976->4903|9005->4904|9039->4907|9092->4932|9231->5044|9299->5103|9339->5105|9388->5126|9433->5144|9448->5150|9499->5180|9639->5302|9652->5306|9691->5307|9741->5328|9779->5338|9795->5344|9850->5377|9999->5494|10045->5511|10178->5613
                  LINES: 31->1|36->2|39->4|41->6|41->6|43->6|44->7|44->7|44->7|44->7|47->2|49->5|50->9|52->11|52->11|52->11|53->12|57->16|57->16|57->16|58->17|59->18|59->18|59->18|60->19|60->19|60->19|60->19|61->20|62->21|66->25|66->25|66->25|78->37|78->37|78->37|82->41|82->41|82->41|83->42|83->42|83->42|83->42|84->43|84->43|84->43|85->44|86->45|87->46|90->49|90->49|90->49|94->53|94->53|94->53|95->54|95->54|95->54|95->54|96->55|96->55|96->55|97->56|98->57|99->58|102->61|102->61|102->61|103->62|103->62|103->62|103->62|103->62|103->62|103->62|104->63|104->63|104->63|105->64|106->65|107->66|118->77|118->77|118->77|121->80|121->80|121->80|121->80|123->82|123->82|123->82|123->82|123->82|123->82|123->82|123->82|123->82|123->82|123->82|125->84|125->84|125->84|125->84|127->86|127->86|127->86|127->86|127->86|127->86|127->86|127->86|127->86|127->86|127->86|129->88|129->88|129->88|130->89|130->89|130->89|130->89|130->89|130->89|130->89|131->90|131->90|131->90|131->90|131->90|132->91|137->96|137->96|137->96|138->97|138->97|138->97|138->97|140->99|140->99|140->99|141->100|141->100|141->100|141->100|143->102|144->103|151->110
                  -- GENERATED --
              */
          