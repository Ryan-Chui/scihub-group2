
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

object userDetailAdmin extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[Long,play.data.Form[models.User],User,List[Organization],ResearcherInfo,StudentInfo,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(id: Long, userForm: play.data.Form[models.User], user: User, organizations: List[Organization], researcherInfo: ResearcherInfo, studentInfo: StudentInfo):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import helper._


Seq[Any](format.raw/*2.156*/("""

"""),format.raw/*5.1*/("""

"""),_display_(/*7.2*/main("User Profile")/*7.22*/ {_display_(Seq[Any](format.raw/*7.24*/("""
    """),format.raw/*8.5*/("""<div class="container">
        <div class="row">
            <div class="col s12">
                <div class="card-panel">
                    """),_display_(/*12.22*/if(session.get("id").equalsIgnoreCase(user.getId.toString))/*12.81*/ {_display_(Seq[Any](format.raw/*12.83*/("""
                        """),format.raw/*13.25*/("""<h4 class="center">My Space</h4>
                    """)))}/*14.23*/else/*14.28*/{_display_(Seq[Any](format.raw/*14.29*/("""
                        """),format.raw/*15.25*/("""<h4 class="center">"""),_display_(/*15.45*/user/*15.49*/.getUserName),format.raw/*15.61*/("""</h4>
                    """)))}),format.raw/*16.22*/("""
                    """),format.raw/*17.21*/("""<div class="row">
                        <div class="col s4">
                            <div class="center">
                                <img class="circle" id="showImg" src=""""),_display_(/*20.72*/routes/*20.78*/.Application.getImageFromPath(user.getAvatar())),format.raw/*20.125*/("""" width="360" height="360" style="border-width: 1px;
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
                                        <td style="word-wrap: break-word;">"""),_display_(/*32.77*/user/*32.81*/.getFirstName),format.raw/*32.94*/("""</td>
                                    </tr>
                                    <tr>
                                        <th style="max-width: 50px">Middle Initial</th>
                                        """),_display_(/*36.42*/if(user.getMiddleInitial!="null" && user.getMiddleInitial != "")/*36.106*/ {_display_(Seq[Any](format.raw/*36.108*/("""
                                            """),format.raw/*37.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*37.81*/user/*37.85*/.getMiddleInitial),format.raw/*37.102*/("""</td>
                                        """)))}/*38.43*/else/*38.48*/{_display_(Seq[Any](format.raw/*38.49*/("""
                                            """),format.raw/*39.45*/("""<td>-</td>
                                        """)))}),format.raw/*40.42*/("""
                                    """),format.raw/*41.37*/("""</tr>

                                    <tr>
                                        <th style="max-width: 50px">Last Name</th>
                                        <td style="word-wrap: break-word;">"""),_display_(/*45.77*/user/*45.81*/.getLastName),format.raw/*45.93*/("""</td>
                                    </tr>
                                    <tr>
                                        <th style="max-width: 50px">Organization</th>
                                        """),_display_(/*49.42*/if(user.getOrganization!="null" && user.getOrganization != "")/*49.104*/ {_display_(Seq[Any](format.raw/*49.106*/("""
                                            """),format.raw/*50.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*50.81*/user/*50.85*/.getOrganization),format.raw/*50.101*/("""</td>
                                        """)))}/*51.43*/else/*51.48*/{_display_(Seq[Any](format.raw/*51.49*/("""
                                            """),format.raw/*52.45*/("""<td>-</td>
                                        """)))}),format.raw/*53.42*/("""
                                    """),format.raw/*54.37*/("""</tr>
                                    <tr>
                                        <th>Personal URL</th>
                                        """),_display_(/*57.42*/if(user.getHomepage != "null" && user.getHomepage != "")/*57.98*/ {_display_(Seq[Any](format.raw/*57.100*/("""
                                            """),format.raw/*58.45*/("""<td><a href=""""),_display_(/*58.59*/user/*58.63*/.getHomepage),format.raw/*58.75*/("""" target="_blank">"""),_display_(/*58.94*/user/*58.98*/.getHomepage),format.raw/*58.110*/("""</a></td>
                                        """)))}/*59.43*/else/*59.48*/{_display_(Seq[Any](format.raw/*59.49*/("""
                                            """),format.raw/*60.45*/("""<td>-</td>
                                        """)))}),format.raw/*61.42*/("""
                                    """),format.raw/*62.37*/("""</tr>
                                    """),format.raw/*63.81*/("""
                                    """),format.raw/*64.119*/("""
                                    """),format.raw/*65.134*/("""
                                    """),format.raw/*66.139*/("""
                                    """),format.raw/*67.89*/("""
                                    """),format.raw/*68.95*/("""
                                    """),format.raw/*69.82*/("""
                                    """),format.raw/*70.82*/("""
                                    """),format.raw/*71.81*/("""
                                    """),format.raw/*72.129*/("""
                                    """),format.raw/*73.152*/("""
                                    """),format.raw/*74.148*/("""
                                    """),format.raw/*75.89*/("""
                                    """),format.raw/*76.95*/("""
                                    """),format.raw/*77.82*/("""
                                    """),format.raw/*78.82*/("""
                                    """),format.raw/*79.81*/("""
                                    """),format.raw/*80.128*/("""
                                    """),format.raw/*81.150*/("""
                                    """),format.raw/*82.147*/("""
                                    """),format.raw/*83.89*/("""
                                    """),format.raw/*84.95*/("""
                                    """),format.raw/*85.82*/("""
                                    """),format.raw/*86.82*/("""


                                """),format.raw/*89.33*/("""</tbody>
                            </table>
                        </div>
                    </div>
                    <div class="row center">
                        <a href=""""),_display_(/*94.35*/routes/*94.41*/.AuthorController.userEditPageAdmin(user.getId())),format.raw/*94.90*/("""" class="btn waves-effect waves-light blue darken-2">
                            Edit Profile</a>
                        <a href='"""),_display_(/*96.35*/routes/*96.41*/.AuthorController.userListAdmin(1, "id")),format.raw/*96.81*/("""' class="btn waves-effect waves-light blue darken-2">
                            Back to User List</a>
                    </div>
                </div>
            </div>
        </div>


""")))}))
      }
    }
  }

  def render(id:Long,userForm:play.data.Form[models.User],user:User,organizations:List[Organization],researcherInfo:ResearcherInfo,studentInfo:StudentInfo): play.twirl.api.HtmlFormat.Appendable = apply(id,userForm,user,organizations,researcherInfo,studentInfo)

  def f:((Long,play.data.Form[models.User],User,List[Organization],ResearcherInfo,StudentInfo) => play.twirl.api.HtmlFormat.Appendable) = (id,userForm,user,organizations,researcherInfo,studentInfo) => apply(id,userForm,user,organizations,researcherInfo,studentInfo)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:39 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/userDetailAdmin.scala.html
                  HASH: 297c83af5308f4684436bc4585a13649e228ff7a
                  MATRIX: 814->1|1249->46|1476->203|1522->200|1550->219|1578->222|1606->242|1645->244|1676->249|1849->395|1917->454|1957->456|2010->481|2083->536|2096->541|2135->542|2188->567|2235->587|2248->591|2281->603|2339->630|2388->651|2598->834|2613->840|2682->887|3396->1574|3409->1578|3443->1591|3688->1809|3762->1873|3803->1875|3876->1920|3939->1956|3952->1960|3991->1977|4057->2025|4070->2030|4109->2031|4182->2076|4265->2128|4330->2165|4564->2372|4577->2376|4610->2388|4853->2604|4925->2666|4966->2668|5039->2713|5102->2749|5115->2753|5153->2769|5219->2817|5232->2822|5271->2823|5344->2868|5427->2920|5492->2957|5669->3107|5734->3163|5775->3165|5848->3210|5889->3224|5902->3228|5935->3240|5981->3259|5994->3263|6028->3275|6098->3327|6111->3332|6150->3333|6223->3378|6306->3430|6371->3467|6441->3553|6507->3672|6573->3806|6639->3945|6704->4034|6769->4129|6834->4211|6899->4293|6964->4374|7030->4503|7096->4655|7162->4803|7227->4892|7292->4987|7357->5069|7422->5151|7487->5232|7553->5360|7619->5510|7685->5657|7750->5746|7815->5841|7880->5923|7945->6005|8008->6040|8218->6223|8233->6229|8303->6278|8463->6411|8478->6417|8539->6457
                  LINES: 31->1|36->2|39->4|42->2|44->5|46->7|46->7|46->7|47->8|51->12|51->12|51->12|52->13|53->14|53->14|53->14|54->15|54->15|54->15|54->15|55->16|56->17|59->20|59->20|59->20|71->32|71->32|71->32|75->36|75->36|75->36|76->37|76->37|76->37|76->37|77->38|77->38|77->38|78->39|79->40|80->41|84->45|84->45|84->45|88->49|88->49|88->49|89->50|89->50|89->50|89->50|90->51|90->51|90->51|91->52|92->53|93->54|96->57|96->57|96->57|97->58|97->58|97->58|97->58|97->58|97->58|97->58|98->59|98->59|98->59|99->60|100->61|101->62|102->63|103->64|104->65|105->66|106->67|107->68|108->69|109->70|110->71|111->72|112->73|113->74|114->75|115->76|116->77|117->78|118->79|119->80|120->81|121->82|122->83|123->84|124->85|125->86|128->89|133->94|133->94|133->94|135->96|135->96|135->96
                  -- GENERATED --
              */
          