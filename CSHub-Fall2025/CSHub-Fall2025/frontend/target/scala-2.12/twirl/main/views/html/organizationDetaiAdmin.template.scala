
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
/*1.2*/import java.util
/*2.2*/import helper._

object organizationDetaiAdmin extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Organization,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(organization: Organization, userOrganization: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*5.2*/scripts/*5.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.13*/("""
    """),format.raw/*6.5*/("""<link rel="stylesheet" href=""""),_display_(/*6.35*/routes/*6.41*/.Assets.at("stylesheets/responsive-table.css")),format.raw/*6.87*/("""">
    <link rel="stylesheet" href="/assets/stylesheets/responsive-table.css">
""")))};
Seq[Any](format.raw/*3.56*/("""

"""),format.raw/*8.2*/("""


"""),_display_(/*11.2*/main("Organization Profile", scripts)/*11.39*/ {_display_(Seq[Any](format.raw/*11.41*/("""
    """),format.raw/*12.5*/("""<div class="container">
        <div class="row">
            <div class="col s12">
                <div class="card-panel">
                    """),_display_(/*16.22*/if(session.get("id").equalsIgnoreCase(organization.getId.toString))/*16.89*/ {_display_(Seq[Any](format.raw/*16.91*/("""
                        """),format.raw/*17.25*/("""<h4 class="center">My Space</h4>
                    """)))}/*18.23*/else/*18.28*/{_display_(Seq[Any](format.raw/*18.29*/("""
                        """),format.raw/*19.25*/("""<h4 class="center">"""),_display_(/*19.45*/organization/*19.57*/.getOrganizationName),format.raw/*19.77*/("""</h4>
                    """)))}),format.raw/*20.22*/("""

                        """),format.raw/*22.25*/("""<!-- desktop table -->
                    <div class="detail-desktop">
                        <div class="row">
                            <div class="col s4 center">
                                <img class="circle" id="showImg" src='"""),_display_(/*26.72*/routes/*26.78*/.Assets.at("/images/SMULogoRrgb.png")),format.raw/*26.115*/("""' style="border-width: 1px; border-style: solid; border-radius: 50%; height: auto; width: 70%;">
                                </div>
                                <div class="col s8">
                                <table class="striped responsive-table">
                                <tbody>
                                <tr>
                                <th style="max-width: 50px">Organization Name</th>
                                <td style="word-wrap: break-word;">"""),_display_(/*33.69*/organization/*33.81*/.getOrganizationName),format.raw/*33.101*/("""</td>
                                </tr>
                                <tr>
                                    <th style="max-width: 50px">Address</th>
                                    """),_display_(/*37.38*/if(organization.getAddress!="null" && organization.getAddress != "")/*37.106*/ {_display_(Seq[Any](format.raw/*37.108*/("""
                                        """),format.raw/*38.41*/("""<td style="word-wrap: break-word;">"""),_display_(/*38.77*/organization/*38.89*/.getAddress),format.raw/*38.100*/("""</td>
                                    """)))}/*39.39*/else/*39.44*/{_display_(Seq[Any](format.raw/*39.45*/("""
                                        """),format.raw/*40.41*/("""<td>-</td>
                                    """)))}),format.raw/*41.38*/("""
                                """),format.raw/*42.33*/("""</tr>

                                <tr>
                                    <th style="max-width: 50px">State</th>
                                    """),_display_(/*46.38*/if(organization.getState!="null" && organization.getState != "")/*46.102*/ {_display_(Seq[Any](format.raw/*46.104*/("""
                                        """),format.raw/*47.41*/("""<td style="word-wrap: break-word;">"""),_display_(/*47.77*/organization/*47.89*/.getState),format.raw/*47.98*/("""</td>
                                    """)))}/*48.39*/else/*48.44*/{_display_(Seq[Any](format.raw/*48.45*/("""
                                        """),format.raw/*49.41*/("""<td>-</td>
                                    """)))}),format.raw/*50.38*/("""
                                """),format.raw/*51.33*/("""</tr>
                                <tr>
                                    <th style="max-width: 50px">City</th>
                                    """),_display_(/*54.38*/if(organization.getCity!="null" && organization.getCity != "")/*54.100*/ {_display_(Seq[Any](format.raw/*54.102*/("""
                                        """),format.raw/*55.41*/("""<td style="word-wrap: break-word;">"""),_display_(/*55.77*/organization/*55.89*/.getCity),format.raw/*55.97*/("""</td>
                                    """)))}/*56.39*/else/*56.44*/{_display_(Seq[Any](format.raw/*56.45*/("""
                                        """),format.raw/*57.41*/("""<td>-</td>
                                    """)))}),format.raw/*58.38*/("""
                                """),format.raw/*59.33*/("""</tr>

                                <tr>
                                    <th style="max-width: 50px">Zipcode</th>
                                    """),_display_(/*63.38*/if(organization.getZipCode!="null" && organization.getZipCode != "")/*63.106*/ {_display_(Seq[Any](format.raw/*63.108*/("""
                                        """),format.raw/*64.41*/("""<td style="word-wrap: break-word;">"""),_display_(/*64.77*/organization/*64.89*/.getZipCode),format.raw/*64.100*/("""</td>
                                    """)))}/*65.39*/else/*65.44*/{_display_(Seq[Any](format.raw/*65.45*/("""
                                        """),format.raw/*66.41*/("""<td>-</td>
                                    """)))}),format.raw/*67.38*/("""
                                """),format.raw/*68.33*/("""</tr>

                                <tr>
                                    <th style="max-width: 50px">Street Address 1</th>
                                    """),_display_(/*72.38*/if(organization.getStreetAddress1!="null" && organization.getStreetAddress1 != "")/*72.120*/ {_display_(Seq[Any](format.raw/*72.122*/("""
                                        """),format.raw/*73.41*/("""<td style="word-wrap: break-word;">"""),_display_(/*73.77*/organization/*73.89*/.getStreetAddress1),format.raw/*73.107*/("""</td>
                                    """)))}/*74.39*/else/*74.44*/{_display_(Seq[Any](format.raw/*74.45*/("""
                                        """),format.raw/*75.41*/("""<td>-</td>
                                    """)))}),format.raw/*76.38*/("""
                                """),format.raw/*77.33*/("""</tr>

                                <tr>
                                    <th style="max-width: 50px">Street Address 2</th>
                                    """),_display_(/*81.38*/if(organization.getStreetAddress2!="null" && organization.getStreetAddress2 != "")/*81.120*/ {_display_(Seq[Any](format.raw/*81.122*/("""
                                        """),format.raw/*82.41*/("""<td style="word-wrap: break-word;">"""),_display_(/*82.77*/organization/*82.89*/.getStreetAddress2),format.raw/*82.107*/("""</td>
                                    """)))}/*83.39*/else/*83.44*/{_display_(Seq[Any](format.raw/*83.45*/("""
                                        """),format.raw/*84.41*/("""<td>-</td>
                                    """)))}),format.raw/*85.38*/("""
                                """),format.raw/*86.33*/("""</tr>

                                <tr>
                                    <th style="max-width: 50px">Short Description</th>
                                    """),_display_(/*90.38*/if(organization.getShortDescription!="null" && organization.getShortDescription != "")/*90.124*/ {_display_(Seq[Any](format.raw/*90.126*/("""
                                        """),format.raw/*91.41*/("""<td style="word-wrap: break-word;">"""),_display_(/*91.77*/organization/*91.89*/.getShortDescription),format.raw/*91.109*/("""</td>
                                    """)))}/*92.39*/else/*92.44*/{_display_(Seq[Any](format.raw/*92.45*/("""
                                        """),format.raw/*93.41*/("""<td>-</td>
                                    """)))}),format.raw/*94.38*/("""
                                """),format.raw/*95.33*/("""</tr>

                                <tr>
                                    <th style="max-width: 50px">Long Description</th>
                                    """),_display_(/*99.38*/if(organization.getLongDescription!="null" && organization.getLongDescription != "")/*99.122*/ {_display_(Seq[Any](format.raw/*99.124*/("""
                                        """),format.raw/*100.41*/("""<td style="word-wrap: break-word;">"""),_display_(/*100.77*/organization/*100.89*/.getLongDescription),format.raw/*100.108*/("""</td>
                                    """)))}/*101.39*/else/*101.44*/{_display_(Seq[Any](format.raw/*101.45*/("""
                                        """),format.raw/*102.41*/("""<td>-</td>
                                    """)))}),format.raw/*103.38*/("""
                                """),format.raw/*104.33*/("""</tr>

                                <tr>
                                    <th style="max-width: 50px">Contact Person Name</th>
                                    """),_display_(/*108.38*/if(organization.getContactPersonName!="null" && organization.getContactPersonName != "")/*108.126*/ {_display_(Seq[Any](format.raw/*108.128*/("""
                                        """),format.raw/*109.41*/("""<td style="word-wrap: break-word;">"""),_display_(/*109.77*/organization/*109.89*/.getContactPersonName),format.raw/*109.110*/("""</td>
                                    """)))}/*110.39*/else/*110.44*/{_display_(Seq[Any](format.raw/*110.45*/("""
                                        """),format.raw/*111.41*/("""<td>-</td>
                                    """)))}),format.raw/*112.38*/("""


                                """),format.raw/*115.33*/("""</tr>
                                <tr>
                                    <th style="max-width: 50px">Contact Person Email</th>
                                    """),_display_(/*118.38*/if(organization.getContactPersonEmail!="null" && organization.getContactPersonEmail != "")/*118.128*/ {_display_(Seq[Any](format.raw/*118.130*/("""
                                        """),format.raw/*119.41*/("""<td style="word-wrap: break-word;">"""),_display_(/*119.77*/organization/*119.89*/.getContactPersonEmail),format.raw/*119.111*/("""</td>
                                    """)))}/*120.39*/else/*120.44*/{_display_(Seq[Any](format.raw/*120.45*/("""
                                        """),format.raw/*121.41*/("""<td>-</td>
                                    """)))}),format.raw/*122.38*/("""
                                """),format.raw/*123.33*/("""</tr>

                                <tr>
                                    <th style="max-width: 50px">Contact Person Phone</th>
                                    """),_display_(/*127.38*/if(organization.getContactPersonPhone!="null" && organization.getContactPersonPhone != "")/*127.128*/ {_display_(Seq[Any](format.raw/*127.130*/("""
                                        """),format.raw/*128.41*/("""<td style="word-wrap: break-word;">"""),_display_(/*128.77*/organization/*128.89*/.getContactPersonPhone),format.raw/*128.111*/("""</td>
                                    """)))}/*129.39*/else/*129.44*/{_display_(Seq[Any](format.raw/*129.45*/("""
                                        """),format.raw/*130.41*/("""<td>-</td>
                                    """)))}),format.raw/*131.38*/("""
                                """),format.raw/*132.33*/("""</tr>


                                <tr>
                                    <th style="max-width: 50px">Fields</th>
                                    """),_display_(/*137.38*/if(organization.getFields!="null" && organization.getFields != "")/*137.104*/ {_display_(Seq[Any](format.raw/*137.106*/("""
                                        """),format.raw/*138.41*/("""<td style="word-wrap: break-word;">"""),_display_(/*138.77*/organization/*138.89*/.getFields),format.raw/*138.99*/("""</td>
                                    """)))}/*139.39*/else/*139.44*/{_display_(Seq[Any](format.raw/*139.45*/("""
                                        """),format.raw/*140.41*/("""<td>-</td>
                                    """)))}),format.raw/*141.38*/("""
                                """),format.raw/*142.33*/("""</tr>

                                <tr>
                                    <th style="max-width: 50px">Focuses</th>
                                    """),_display_(/*146.38*/if(organization.getFocuses!="null" && organization.getFocuses != "")/*146.106*/ {_display_(Seq[Any](format.raw/*146.108*/("""
                                        """),format.raw/*147.41*/("""<td style="word-wrap: break-word;">"""),_display_(/*147.77*/organization/*147.89*/.getFocuses),format.raw/*147.100*/("""</td>
                                    """)))}/*148.39*/else/*148.44*/{_display_(Seq[Any](format.raw/*148.45*/("""
                                        """),format.raw/*149.41*/("""<td>-</td>
                                    """)))}),format.raw/*150.38*/("""
                                """),format.raw/*151.33*/("""</tr>

                                <tr>
                                    <th style="max-width: 50px">Organization History</th>
                                    """),_display_(/*155.38*/if(organization.getOrganizationHistory!="null" && organization.getOrganizationHistory != "")/*155.130*/ {_display_(Seq[Any](format.raw/*155.132*/("""
                                        """),format.raw/*156.41*/("""<td style="word-wrap: break-word;">"""),_display_(/*156.77*/organization/*156.89*/.getOrganizationHistory),format.raw/*156.112*/("""</td>
                                    """)))}/*157.39*/else/*157.44*/{_display_(Seq[Any](format.raw/*157.45*/("""
                                        """),format.raw/*158.41*/("""<td>-</td>
                                    """)))}),format.raw/*159.38*/("""
                                """),format.raw/*160.33*/("""</tr>

                                <tr>
                                    <th style="max-width: 50px">Number of Employee</th>
                                    """),_display_(/*164.38*/if(organization.getNumberOfEmployees!="null" && organization.getNumberOfEmployees != "")/*164.126*/ {_display_(Seq[Any](format.raw/*164.128*/("""
                                        """),format.raw/*165.41*/("""<td style="word-wrap: break-word;">"""),_display_(/*165.77*/organization/*165.89*/.getNumberOfEmployees),format.raw/*165.110*/("""</td>
                                    """)))}/*166.39*/else/*166.44*/{_display_(Seq[Any](format.raw/*166.45*/("""
                                        """),format.raw/*167.41*/("""<td>-</td>
                                    """)))}),format.raw/*168.38*/("""
                                """),format.raw/*169.33*/("""</tr>


                                <tr>
                                    <th style="max-width: 49px">URL</th>
                                    <td style="word-wrap: break-word;">"""),_display_(/*174.73*/organization/*174.85*/.getURL),format.raw/*174.92*/("""</td>
                                </tr>
                                """),format.raw/*176.77*/("""
                                """),format.raw/*177.255*/("""
                                """),format.raw/*178.143*/("""
                                """),format.raw/*179.78*/("""
                                """),format.raw/*180.33*/("""</tbody>
                                </table>
                            </div>
                        </div>

                    </div>

                        <!-- Mobile Cards -->
                    <div class="detail-mobile">
                        <div class="card-panel detail-card">
                            <div class="center">
                                <img class="circle" src='"""),_display_(/*191.59*/routes/*191.65*/.Assets.at("/images/SMULogoRrgb.png")),format.raw/*191.102*/("""' style="border: 1px solid; border-radius: 50%; width: 100px; height: 100px;">
                                </div>

                                <div><h6>Organization Name:</h6> """),_display_(/*194.67*/organization/*194.79*/.getOrganizationName),format.raw/*194.99*/("""</div>
                            <div><h6>Address:</h6> """),_display_(/*195.53*/organization/*195.65*/.getAddress),format.raw/*195.76*/("""</div>
                            <div><h6>State:</h6> """),_display_(/*196.51*/organization/*196.63*/.getState),format.raw/*196.72*/("""</div>
                            <div><h6>City:</h6> """),_display_(/*197.50*/organization/*197.62*/.getCity),format.raw/*197.70*/("""</div>
                            <div><h6>Zipcode:</h6> """),_display_(/*198.53*/organization/*198.65*/.getZipCode),format.raw/*198.76*/("""</div>
                            <div><h6>Street Address 1:</h6> """),_display_(/*199.62*/organization/*199.74*/.getStreetAddress1),format.raw/*199.92*/("""</div>
                            <div><h6>Street Address 2:</h6> """),_display_(/*200.62*/organization/*200.74*/.getStreetAddress2),format.raw/*200.92*/("""</div>
                            <div><h6>Short Description:</h6> """),_display_(/*201.63*/organization/*201.75*/.getShortDescription),format.raw/*201.95*/("""</div>
                            <div><h6>Long Description:</h6> """),_display_(/*202.62*/organization/*202.74*/.getLongDescription),format.raw/*202.93*/("""</div>
                            <div><h6>Contact Person Name:</h6> """),_display_(/*203.65*/organization/*203.77*/.getContactPersonName),format.raw/*203.98*/("""</div>
                            <div><h6>Contact Person Email:</h6> """),_display_(/*204.66*/organization/*204.78*/.getContactPersonEmail),format.raw/*204.100*/("""</div>
                            <div><h6>Contact Person Phone:</h6> """),_display_(/*205.66*/organization/*205.78*/.getContactPersonPhone),format.raw/*205.100*/("""</div>
                            <div><h6>Fields:</h6> """),_display_(/*206.52*/organization/*206.64*/.getFields),format.raw/*206.74*/("""</div>
                            <div><h6>Focuses:</h6> """),_display_(/*207.53*/organization/*207.65*/.getFocuses),format.raw/*207.76*/("""</div>
                            <div><h6>Organization History:</h6> """),_display_(/*208.66*/organization/*208.78*/.getOrganizationHistory),format.raw/*208.101*/("""</div>
                            <div><h6>Number of Employees:</h6> """),_display_(/*209.65*/organization/*209.77*/.getNumberOfEmployees),format.raw/*209.98*/("""</div>
                            <div><h6>URL:</h6> <a href=""""),_display_(/*210.58*/organization/*210.70*/.getURL),format.raw/*210.77*/("""">"""),_display_(/*210.80*/organization/*210.92*/.getURL),format.raw/*210.99*/("""</a></div>
                        </div>
                    </div>

                    <div class="row center">

                        <a href=""""),_display_(/*216.35*/routes/*216.41*/.OrganizationController.organizationEditPage()),format.raw/*216.87*/("""" class="btn waves-effect waves-light blue darken-2">
                            Edit Profile</a>

                        <a href=""""),_display_(/*219.35*/routes/*219.41*/.OrganizationController.organizationListPage(1, "id")),format.raw/*219.94*/("""" class="btn waves-effect waves-light blue darken-2">
                            Back to List</a>
                        """),format.raw/*221.119*/("""

                        """),format.raw/*223.168*/("""
                        """),format.raw/*224.73*/("""
                        """),format.raw/*225.57*/("""
                        """),format.raw/*226.171*/("""
                        """),format.raw/*227.86*/("""
                        """),format.raw/*228.50*/("""
                    """),format.raw/*229.21*/("""</div>
                </div>
            </div>
        </div>
""")))}))
      }
    }
  }

  def render(organization:Organization,userOrganization:String): play.twirl.api.HtmlFormat.Appendable = apply(organization,userOrganization)

  def f:((Organization,String) => play.twirl.api.HtmlFormat.Appendable) = (organization,userOrganization) => apply(organization,userOrganization)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:33 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/organizationDetaiAdmin.scala.html
                  HASH: f1c57d5ae053bd522a3ab28227e13f51a44c498d
                  MATRIX: 814->1|838->19|1188->36|1320->93|1334->100|1414->104|1445->109|1501->139|1515->145|1581->191|1700->90|1728->271|1758->275|1804->312|1844->314|1876->319|2049->465|2125->532|2165->534|2218->559|2291->614|2304->619|2343->620|2396->645|2443->665|2464->677|2505->697|2563->724|2617->750|2885->991|2900->997|2959->1034|3476->1524|3497->1536|3539->1556|3761->1751|3839->1819|3880->1821|3949->1862|4012->1898|4033->1910|4066->1921|4128->1965|4141->1970|4180->1971|4249->2012|4328->2060|4389->2093|4572->2249|4646->2313|4687->2315|4756->2356|4819->2392|4840->2404|4870->2413|4932->2457|4945->2462|4984->2463|5053->2504|5132->2552|5193->2585|5374->2739|5446->2801|5487->2803|5556->2844|5619->2880|5640->2892|5669->2900|5731->2944|5744->2949|5783->2950|5852->2991|5931->3039|5992->3072|6177->3230|6255->3298|6296->3300|6365->3341|6428->3377|6449->3389|6482->3400|6544->3444|6557->3449|6596->3450|6665->3491|6744->3539|6805->3572|6999->3739|7091->3821|7132->3823|7201->3864|7264->3900|7285->3912|7325->3930|7387->3974|7400->3979|7439->3980|7508->4021|7587->4069|7648->4102|7842->4269|7934->4351|7975->4353|8044->4394|8107->4430|8128->4442|8168->4460|8230->4504|8243->4509|8282->4510|8351->4551|8430->4599|8491->4632|8686->4800|8782->4886|8823->4888|8892->4929|8955->4965|8976->4977|9018->4997|9080->5041|9093->5046|9132->5047|9201->5088|9280->5136|9341->5169|9535->5336|9629->5420|9670->5422|9740->5463|9804->5499|9826->5511|9868->5530|9931->5574|9945->5579|9985->5580|10055->5621|10135->5669|10197->5702|10395->5872|10494->5960|10536->5962|10606->6003|10670->6039|10692->6051|10736->6072|10799->6116|10813->6121|10853->6122|10923->6163|11003->6211|11067->6246|11265->6416|11366->6506|11408->6508|11478->6549|11542->6585|11564->6597|11609->6619|11672->6663|11686->6668|11726->6669|11796->6710|11876->6758|11938->6791|12137->6962|12238->7052|12280->7054|12350->7095|12414->7131|12436->7143|12481->7165|12544->7209|12558->7214|12598->7215|12668->7256|12748->7304|12810->7337|12996->7495|13073->7561|13115->7563|13185->7604|13249->7640|13271->7652|13303->7662|13366->7706|13380->7711|13420->7712|13490->7753|13570->7801|13632->7834|13818->7992|13897->8060|13939->8062|14009->8103|14073->8139|14095->8151|14129->8162|14192->8206|14206->8211|14246->8212|14316->8253|14396->8301|14458->8334|14657->8505|14760->8597|14802->8599|14872->8640|14936->8676|14958->8688|15004->8711|15067->8755|15081->8760|15121->8761|15191->8802|15271->8850|15333->8883|15530->9052|15629->9140|15671->9142|15741->9183|15805->9219|15827->9231|15871->9252|15934->9296|15948->9301|15988->9302|16058->9343|16138->9391|16200->9424|16418->9614|16440->9626|16469->9633|16574->9753|16637->10008|16700->10151|16762->10229|16824->10262|17259->10669|17275->10675|17335->10712|17548->10897|17570->10909|17612->10929|17699->10988|17721->11000|17754->11011|17839->11068|17861->11080|17892->11089|17976->11145|17998->11157|18028->11165|18115->11224|18137->11236|18170->11247|18266->11315|18288->11327|18328->11345|18424->11413|18446->11425|18486->11443|18583->11512|18605->11524|18647->11544|18743->11612|18765->11624|18806->11643|18905->11714|18927->11726|18970->11747|19070->11819|19092->11831|19137->11853|19237->11925|19259->11937|19304->11959|19390->12017|19412->12029|19444->12039|19531->12098|19553->12110|19586->12121|19686->12193|19708->12205|19754->12228|19853->12299|19875->12311|19918->12332|20010->12396|20032->12408|20061->12415|20092->12418|20114->12430|20143->12437|20321->12587|20337->12593|20405->12639|20567->12773|20583->12779|20658->12832|20811->13049|20867->13218|20921->13291|20975->13348|21030->13519|21084->13605|21138->13655|21188->13676
                  LINES: 31->1|32->2|37->3|41->5|41->5|43->5|44->6|44->6|44->6|44->6|47->3|49->8|52->11|52->11|52->11|53->12|57->16|57->16|57->16|58->17|59->18|59->18|59->18|60->19|60->19|60->19|60->19|61->20|63->22|67->26|67->26|67->26|74->33|74->33|74->33|78->37|78->37|78->37|79->38|79->38|79->38|79->38|80->39|80->39|80->39|81->40|82->41|83->42|87->46|87->46|87->46|88->47|88->47|88->47|88->47|89->48|89->48|89->48|90->49|91->50|92->51|95->54|95->54|95->54|96->55|96->55|96->55|96->55|97->56|97->56|97->56|98->57|99->58|100->59|104->63|104->63|104->63|105->64|105->64|105->64|105->64|106->65|106->65|106->65|107->66|108->67|109->68|113->72|113->72|113->72|114->73|114->73|114->73|114->73|115->74|115->74|115->74|116->75|117->76|118->77|122->81|122->81|122->81|123->82|123->82|123->82|123->82|124->83|124->83|124->83|125->84|126->85|127->86|131->90|131->90|131->90|132->91|132->91|132->91|132->91|133->92|133->92|133->92|134->93|135->94|136->95|140->99|140->99|140->99|141->100|141->100|141->100|141->100|142->101|142->101|142->101|143->102|144->103|145->104|149->108|149->108|149->108|150->109|150->109|150->109|150->109|151->110|151->110|151->110|152->111|153->112|156->115|159->118|159->118|159->118|160->119|160->119|160->119|160->119|161->120|161->120|161->120|162->121|163->122|164->123|168->127|168->127|168->127|169->128|169->128|169->128|169->128|170->129|170->129|170->129|171->130|172->131|173->132|178->137|178->137|178->137|179->138|179->138|179->138|179->138|180->139|180->139|180->139|181->140|182->141|183->142|187->146|187->146|187->146|188->147|188->147|188->147|188->147|189->148|189->148|189->148|190->149|191->150|192->151|196->155|196->155|196->155|197->156|197->156|197->156|197->156|198->157|198->157|198->157|199->158|200->159|201->160|205->164|205->164|205->164|206->165|206->165|206->165|206->165|207->166|207->166|207->166|208->167|209->168|210->169|215->174|215->174|215->174|217->176|218->177|219->178|220->179|221->180|232->191|232->191|232->191|235->194|235->194|235->194|236->195|236->195|236->195|237->196|237->196|237->196|238->197|238->197|238->197|239->198|239->198|239->198|240->199|240->199|240->199|241->200|241->200|241->200|242->201|242->201|242->201|243->202|243->202|243->202|244->203|244->203|244->203|245->204|245->204|245->204|246->205|246->205|246->205|247->206|247->206|247->206|248->207|248->207|248->207|249->208|249->208|249->208|250->209|250->209|250->209|251->210|251->210|251->210|251->210|251->210|251->210|257->216|257->216|257->216|260->219|260->219|260->219|262->221|264->223|265->224|266->225|267->226|268->227|269->228|270->229
                  -- GENERATED --
              */
          