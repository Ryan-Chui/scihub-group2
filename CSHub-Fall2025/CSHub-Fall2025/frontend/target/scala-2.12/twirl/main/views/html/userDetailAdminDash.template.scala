
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

object userDetailAdminDash extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[com.fasterxml.jackson.databind.JsonNode,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userDetail: com.fasterxml.jackson.databind.JsonNode):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._
/*4.2*/import models._

def /*6.2*/scripts/*6.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.13*/("""
    """),format.raw/*7.5*/("""<script type="text/javascript">
            $(document).ready(function() """),format.raw/*8.42*/("""{"""),format.raw/*8.43*/("""
                """),format.raw/*9.17*/("""$('.tooltipped').tooltip();
            """),format.raw/*10.13*/("""}"""),format.raw/*10.14*/(""");
    </script>
""")))};
Seq[Any](format.raw/*1.55*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*12.2*/("""

"""),_display_(/*14.2*/main("User Detail - Admin Dashboard", scripts)/*14.48*/ {_display_(Seq[Any](format.raw/*14.50*/("""
    """),format.raw/*15.5*/("""<div class="container">
        <div class="row">
            <div class="col s12">
                <nav class="breadcrumb-nav">
                    <div class="nav-wrapper">
                        <div class="col s12">
                            <a href=""""),_display_(/*21.39*/routes/*21.45*/.AdminController.dashboard()),format.raw/*21.73*/("""" class="breadcrumb">Admin Dashboard</a>
                            <a href=""""),_display_(/*22.39*/routes/*22.45*/.AdminController.userManagement(1, "id")),format.raw/*22.85*/("""" class="breadcrumb">User Admin</a>
                            <a href="#" class="breadcrumb">User Detail</a>
                        </div>
                    </div>
                </nav>
            </div>
        </div>

        <div class="card-panel">
            <div class="row">
                <div class="col s12">
                    <h4 class="center">User Detail</h4>
                </div>
            </div>

                <!-- General Information -->
            <div class="row">
                <div class="col s12">
                    <div class="card">
                        <div class="card-content">
                            <span class="card-title">General Information</span>
                            <div class="row">
                                <div class="col s12">
                                    <table class="striped">
                                        <tbody>
                                            <tr>
                                                <td><strong>userID:</strong></td>
                                                <td>"""),_display_(/*49.54*/userDetail/*49.64*/.get("generalInfo").get("id").asText()),format.raw/*49.102*/("""</td>
                                            </tr>
                                            <tr>
                                                <td><strong>user name:</strong></td>
                                                <td>"""),_display_(/*53.54*/userDetail/*53.64*/.get("generalInfo").get("userName").asText()),format.raw/*53.108*/("""</td>
                                            </tr>
                                            <tr>
                                                <td><strong>firstName:</strong></td>
                                                <td>"""),_display_(/*57.54*/userDetail/*57.64*/.get("generalInfo").get("firstName").asText()),format.raw/*57.109*/(""" """),_display_(/*57.111*/userDetail/*57.121*/.get("generalInfo").get("lastName").asText()),format.raw/*57.165*/("""</td>
                                            </tr>
                                            <tr>
                                                <td><strong>middleInitial:</strong></td>
                                                <td>"""),_display_(/*61.54*/userDetail/*61.64*/.get("generalInfo").get("middleInitial").asText()),format.raw/*61.113*/("""</td>
                                            </tr>
                                            <tr>
                                                <td><strong>email:</strong></td>
                                                <td>"""),_display_(/*65.54*/userDetail/*65.64*/.get("generalInfo").get("email").asText()),format.raw/*65.105*/("""</td>
                                            </tr>
                                            <tr>
                                                <td><strong>phoneNumber:</strong></td>
                                                <td>"""),_display_(/*69.54*/userDetail/*69.64*/.get("generalInfo").get("phoneNumber").asText()),format.raw/*69.111*/("""</td>
                                            </tr>
                                            <tr>
                                                <td><strong>organization:</strong></td>
                                                <td>"""),_display_(/*73.54*/userDetail/*73.64*/.get("generalInfo").get("organization").asText()),format.raw/*73.112*/("""</td>
                                            </tr>
                                            <tr>
                                                <td><strong>mailingAddress:</strong></td>
                                                <td>"""),_display_(/*77.54*/userDetail/*77.64*/.get("generalInfo").get("mailingAddress").asText()),format.raw/*77.114*/("""</td>
                                            </tr>
                                            <tr>
                                                <td><strong>home page:</strong></td>
                                                <td>
                                                """),_display_(/*82.50*/if(userDetail.get("generalInfo").get("homepage").asText().nonEmpty)/*82.117*/ {_display_(Seq[Any](format.raw/*82.119*/("""
                                                    """),format.raw/*83.53*/("""<a href=""""),_display_(/*83.63*/userDetail/*83.73*/.get("generalInfo").get("homepage").asText()),format.raw/*83.117*/("""" target="_blank">
                                                    """),_display_(/*84.54*/userDetail/*84.64*/.get("generalInfo").get("homepage").asText()),format.raw/*84.108*/("""
                                                    """),format.raw/*85.53*/("""</a>
                                                """)))}/*86.51*/else/*86.56*/{_display_(Seq[Any](format.raw/*86.57*/("""
                                                    """),format.raw/*87.53*/("""-
                                                """)))}),format.raw/*88.50*/("""
                                                """),format.raw/*89.49*/("""</td>
                                            </tr>
                                            <tr>
                                                <td><strong>user level:</strong></td>
                                                <td>
                                                """),_display_(/*94.50*/if(userDetail.get("generalInfo").get("level").asText() == "admin")/*94.116*/ {_display_(Seq[Any](format.raw/*94.118*/("""
                                                    """),format.raw/*95.53*/("""<span class="chip red white-text">admin</span>
                                                """)))}/*96.51*/else/*96.56*/{_display_(Seq[Any](format.raw/*96.57*/("""
                                                    """),format.raw/*97.53*/("""<span class="chip grey white-text">normal user</span>
                                                """)))}),format.raw/*98.50*/("""
                                                """),format.raw/*99.49*/("""</td>
                                            </tr>
                                            <tr>
                                                <td><strong>isActive:</strong></td>
                                                <td>
                                                """),_display_(/*104.50*/if(userDetail.get("generalInfo").get("isActive").asText() == "True")/*104.118*/ {_display_(Seq[Any](format.raw/*104.120*/("""
                                                    """),format.raw/*105.53*/("""<span class="chip green white-text">Active</span>
                                                """)))}/*106.51*/else/*106.56*/{_display_(Seq[Any](format.raw/*106.57*/("""
                                                    """),format.raw/*107.53*/("""<span class="chip red white-text">not Active</span>
                                                """)))}),format.raw/*108.50*/("""
                                                """),format.raw/*109.49*/("""</td>
                                            </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

                <!-- Specific Information -->
            <div class="row">
                <div class="col s12">
                        <!-- studentInfo -->
                    """),_display_(/*124.22*/if(userDetail.has("studentInfo"))/*124.55*/ {_display_(Seq[Any](format.raw/*124.57*/("""
                        """),format.raw/*125.25*/("""<div class="card">
                            <div class="card-content">
                                <span class="card-title">Student Information</span>
                                <div class="row">
                                    <div class="col s12">
                                        <table class="striped">
                                            <tbody>
                                                <tr>
                                                    <td><strong>id:</strong></td>
                                                    <td>"""),_display_(/*134.58*/userDetail/*134.68*/.get("studentInfo").get("idNumber").asText()),format.raw/*134.112*/("""</td>
                                                </tr>
                                                <tr>
                                                    <td><strong>student year:</strong></td>
                                                    <td>"""),_display_(/*138.58*/userDetail/*138.68*/.get("studentInfo").get("studentYear").asText()),format.raw/*138.115*/("""</td>
                                                </tr>
                                                <tr>
                                                    <td><strong>student type:</strong></td>
                                                    <td>"""),_display_(/*142.58*/userDetail/*142.68*/.get("studentInfo").get("studentType").asText()),format.raw/*142.115*/("""</td>
                                                </tr>
                                                <tr>
                                                    <td><strong>major:</strong></td>
                                                    <td>"""),_display_(/*146.58*/userDetail/*146.68*/.get("studentInfo").get("major").asText()),format.raw/*146.109*/("""</td>
                                                </tr>
                                                <tr>
                                                    <td><strong>Enroll Date:</strong></td>
                                                    <td>"""),_display_(/*150.58*/userDetail/*150.68*/.get("studentInfo").get("firstEnrollDate").asText()),format.raw/*150.119*/("""</td>
                                                </tr>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>
                    """)))}),format.raw/*158.22*/("""

                        """),format.raw/*160.25*/("""<!-- researcherInfo -->
                    """),_display_(/*161.22*/if(userDetail.has("researcherInfo"))/*161.58*/ {_display_(Seq[Any](format.raw/*161.60*/("""
                        """),format.raw/*162.25*/("""<div class="card">
                            <div class="card-content">
                                <span class="card-title">Researcher Information</span>
                                <div class="row">
                                    <div class="col s12">
                                        <table class="striped">
                                            <tbody>
                                                <tr>
                                                    <td><strong>highest degree:</strong></td>
                                                    <td>"""),_display_(/*171.58*/userDetail/*171.68*/.get("researcherInfo").get("highestDegree").asText()),format.raw/*171.120*/("""</td>
                                                </tr>
                                                <tr>
                                                    <td><strong>ORCID:</strong></td>
                                                    <td>
                                                    """),_display_(/*176.54*/if(userDetail.get("researcherInfo").get("orcid").asText().nonEmpty)/*176.121*/ {_display_(Seq[Any](format.raw/*176.123*/("""
                                                        """),format.raw/*177.57*/("""<a href="https://orcid.org/"""),_display_(/*177.85*/userDetail/*177.95*/.get("researcherInfo").get("orcid").asText()),format.raw/*177.139*/("""" target="_blank">
                                                        """),_display_(/*178.58*/userDetail/*178.68*/.get("researcherInfo").get("orcid").asText()),format.raw/*178.112*/("""
                                                        """),format.raw/*179.57*/("""</a>
                                                    """)))}/*180.55*/else/*180.60*/{_display_(Seq[Any](format.raw/*180.61*/("""
                                                        """),format.raw/*181.57*/("""-
                                                    """)))}),format.raw/*182.54*/("""
                                                    """),format.raw/*183.53*/("""</td>
                                                </tr>
                                                <tr>
                                                    <td><strong>research fields:</strong></td>
                                                    <td>"""),_display_(/*187.58*/userDetail/*187.68*/.get("researcherInfo").get("researchFields").asText()),format.raw/*187.121*/("""</td>
                                                </tr>
                                                <tr>
                                                    <td><strong>school:</strong></td>
                                                    <td>"""),_display_(/*191.58*/userDetail/*191.68*/.get("researcherInfo").get("school").asText()),format.raw/*191.113*/("""</td>
                                                </tr>
                                                <tr>
                                                    <td><strong>department:</strong></td>
                                                    <td>"""),_display_(/*195.58*/userDetail/*195.68*/.get("researcherInfo").get("department").asText()),format.raw/*195.117*/("""</td>
                                                </tr>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>
                    """)))}),format.raw/*203.22*/("""

                        """),format.raw/*205.25*/("""<!-- sponsorInfo -->
                    """),_display_(/*206.22*/if(userDetail.has("sponsorInfo"))/*206.55*/ {_display_(Seq[Any](format.raw/*206.57*/("""
                        """),format.raw/*207.25*/("""<div class="card">
                            <div class="card-content">
                                <span class="card-title">Sponsor Information</span>
                                <div class="row">
                                    <div class="col s12">
                                        <table class="striped">
                                            <tbody>
                                                <tr>
                                                    <td><strong>expertises:</strong></td>
                                                    <td>"""),_display_(/*216.58*/userDetail/*216.68*/.get("sponsorInfo").get("expertises").asText()),format.raw/*216.114*/("""</td>
                                                </tr>
                                                <tr>
                                                    <td><strong>categories:</strong></td>
                                                    <td>"""),_display_(/*220.58*/userDetail/*220.68*/.get("sponsorInfo").get("categories").asText()),format.raw/*220.114*/("""</td>
                                                </tr>
                                                <tr>
                                                    <td><strong>detail:</strong></td>
                                                    <td>"""),_display_(/*224.58*/userDetail/*224.68*/.get("sponsorInfo").get("detail").asText()),format.raw/*224.110*/("""</td>
                                                </tr>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>
                    """)))}),format.raw/*232.22*/("""
                """),format.raw/*233.17*/("""</div>
            </div>

                <!-- back button -->
            <div class="row">
                <div class="col s12 center">
                    <a href='"""),_display_(/*239.31*/routes/*239.37*/.AuthorController.userEditPageAdmin(
                        userDetail.get("generalInfo").get("id").asLong())),format.raw/*240.74*/("""'
                    class="btn waves-effect waves-light blue darken-2">
                        Edit Profile
                    </a>
                    <a href=""""),_display_(/*244.31*/routes/*244.37*/.AdminController.userManagement(1, "id")),format.raw/*244.77*/("""" class="btn blue">
                        <i class="material-icons left">arrow_back</i>
                        back to user management
                    </a>
                </div>
            </div>
        </div>
    </div>
""")))}))
      }
    }
  }

  def render(userDetail:com.fasterxml.jackson.databind.JsonNode): play.twirl.api.HtmlFormat.Appendable = apply(userDetail)

  def f:((com.fasterxml.jackson.databind.JsonNode) => play.twirl.api.HtmlFormat.Appendable) = (userDetail) => apply(userDetail)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:39 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/userDetailAdminDash.scala.html
                  HASH: 517130988bdb15fefb228626bf761ce493db23ef
                  MATRIX: 1158->1|1284->57|1307->74|1335->92|1349->99|1429->103|1460->108|1560->181|1588->182|1632->199|1700->239|1729->240|1786->54|1814->90|1842->258|1871->261|1926->307|1966->309|1998->314|2284->573|2299->579|2348->607|2454->686|2469->692|2530->732|3659->1834|3678->1844|3738->1882|4008->2125|4027->2135|4093->2179|4363->2422|4382->2432|4449->2477|4479->2479|4499->2489|4565->2533|4839->2780|4858->2790|4929->2839|5195->3078|5214->3088|5277->3129|5549->3374|5568->3384|5637->3431|5910->3677|5929->3687|5999->3735|6274->3983|6293->3993|6365->4043|6684->4335|6761->4402|6802->4404|6883->4457|6920->4467|6939->4477|7005->4521|7104->4593|7123->4603|7189->4647|7270->4700|7343->4755|7356->4760|7395->4761|7476->4814|7558->4865|7635->4914|7955->5207|8031->5273|8072->5275|8153->5328|8268->5425|8281->5430|8320->5431|8401->5484|8535->5587|8612->5636|8931->5927|9010->5995|9052->5997|9134->6050|9253->6150|9267->6155|9307->6156|9389->6209|9522->6310|9600->6359|10133->6864|10176->6897|10217->6899|10271->6924|10873->7498|10893->7508|10960->7552|11250->7814|11270->7824|11340->7871|11630->8133|11650->8143|11720->8190|12003->8445|12023->8455|12087->8496|12376->8757|12396->8767|12470->8818|12833->9149|12888->9175|12961->9220|13007->9256|13048->9258|13102->9283|13719->9872|13739->9882|13814->9934|14150->10242|14228->10309|14270->10311|14356->10368|14412->10396|14432->10406|14499->10450|14603->10526|14623->10536|14690->10580|14776->10637|14854->10696|14868->10701|14908->10702|14994->10759|15081->10814|15163->10867|15456->11132|15476->11142|15552->11195|15836->11451|15856->11461|15924->11506|16212->11766|16232->11776|16304->11825|16667->12156|16722->12182|16792->12224|16835->12257|16876->12259|16930->12284|17540->12866|17560->12876|17629->12922|17917->13182|17937->13192|18006->13238|18290->13494|18310->13504|18375->13546|18738->13877|18784->13894|18981->14063|18997->14069|19129->14179|19323->14345|19339->14351|19401->14391
                  LINES: 35->1|38->3|39->4|41->6|41->6|43->6|44->7|45->8|45->8|46->9|47->10|47->10|50->1|52->5|53->12|55->14|55->14|55->14|56->15|62->21|62->21|62->21|63->22|63->22|63->22|90->49|90->49|90->49|94->53|94->53|94->53|98->57|98->57|98->57|98->57|98->57|98->57|102->61|102->61|102->61|106->65|106->65|106->65|110->69|110->69|110->69|114->73|114->73|114->73|118->77|118->77|118->77|123->82|123->82|123->82|124->83|124->83|124->83|124->83|125->84|125->84|125->84|126->85|127->86|127->86|127->86|128->87|129->88|130->89|135->94|135->94|135->94|136->95|137->96|137->96|137->96|138->97|139->98|140->99|145->104|145->104|145->104|146->105|147->106|147->106|147->106|148->107|149->108|150->109|165->124|165->124|165->124|166->125|175->134|175->134|175->134|179->138|179->138|179->138|183->142|183->142|183->142|187->146|187->146|187->146|191->150|191->150|191->150|199->158|201->160|202->161|202->161|202->161|203->162|212->171|212->171|212->171|217->176|217->176|217->176|218->177|218->177|218->177|218->177|219->178|219->178|219->178|220->179|221->180|221->180|221->180|222->181|223->182|224->183|228->187|228->187|228->187|232->191|232->191|232->191|236->195|236->195|236->195|244->203|246->205|247->206|247->206|247->206|248->207|257->216|257->216|257->216|261->220|261->220|261->220|265->224|265->224|265->224|273->232|274->233|280->239|280->239|281->240|285->244|285->244|285->244
                  -- GENERATED --
              */
          