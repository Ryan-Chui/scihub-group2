
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

object organizationDetail extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Organization,String,play.twirl.api.HtmlFormat.Appendable] {

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

                    """),format.raw/*22.21*/("""<!-- desktop table -->
                    <div class="detail-desktop">
                            <div class="row">
                                <div class="col s4 center">
                                    <img class="circle" id="showImg" src='"""),_display_(/*26.76*/routes/*26.82*/.Assets.at("/images/SMULogoRrgb.png")),format.raw/*26.119*/("""' style="border-width: 1px; border-style: solid; border-radius: 50%; height: auto; width: 70%;">
                                </div>
                                <div class="col s8">
                                    <table class="striped responsive-table">
                                        <tbody>
                                            <tr>
                                                <th style="max-width: 50px">Organization Name</th>
                                                <td style="word-wrap: break-word;">"""),_display_(/*33.85*/organization/*33.97*/.getOrganizationName),format.raw/*33.117*/("""</td>
                                            </tr>
                                            <tr>
                                                <th style="max-width: 50px">Address</th>
                                                """),_display_(/*37.50*/if(organization.getAddress!="null" && organization.getAddress != "")/*37.118*/ {_display_(Seq[Any](format.raw/*37.120*/("""
                                                    """),format.raw/*38.53*/("""<td style="word-wrap: break-word;">"""),_display_(/*38.89*/organization/*38.101*/.getAddress),format.raw/*38.112*/("""</td>
                                                """)))}/*39.51*/else/*39.56*/{_display_(Seq[Any](format.raw/*39.57*/("""
                                                    """),format.raw/*40.53*/("""<td>-</td>
                                                """)))}),format.raw/*41.50*/("""
                                            """),format.raw/*42.45*/("""</tr>

                                            <tr>
                                                <th style="max-width: 50px">State</th>
                                                """),_display_(/*46.50*/if(organization.getState!="null" && organization.getState != "")/*46.114*/ {_display_(Seq[Any](format.raw/*46.116*/("""
                                                    """),format.raw/*47.53*/("""<td style="word-wrap: break-word;">"""),_display_(/*47.89*/organization/*47.101*/.getState),format.raw/*47.110*/("""</td>
                                                """)))}/*48.51*/else/*48.56*/{_display_(Seq[Any](format.raw/*48.57*/("""
                                                    """),format.raw/*49.53*/("""<td>-</td>
                                                """)))}),format.raw/*50.50*/("""
                                            """),format.raw/*51.45*/("""</tr>
                                            <tr>
                                                <th style="max-width: 50px">City</th>
                                                """),_display_(/*54.50*/if(organization.getCity!="null" && organization.getCity != "")/*54.112*/ {_display_(Seq[Any](format.raw/*54.114*/("""
                                                    """),format.raw/*55.53*/("""<td style="word-wrap: break-word;">"""),_display_(/*55.89*/organization/*55.101*/.getCity),format.raw/*55.109*/("""</td>
                                                """)))}/*56.51*/else/*56.56*/{_display_(Seq[Any](format.raw/*56.57*/("""
                                                    """),format.raw/*57.53*/("""<td>-</td>
                                                """)))}),format.raw/*58.50*/("""
                                            """),format.raw/*59.45*/("""</tr>

                                            <tr>
                                                <th style="max-width: 50px">Zipcode</th>
                                                """),_display_(/*63.50*/if(organization.getZipCode!="null" && organization.getZipCode != "")/*63.118*/ {_display_(Seq[Any](format.raw/*63.120*/("""
                                                    """),format.raw/*64.53*/("""<td style="word-wrap: break-word;">"""),_display_(/*64.89*/organization/*64.101*/.getZipCode),format.raw/*64.112*/("""</td>
                                                """)))}/*65.51*/else/*65.56*/{_display_(Seq[Any](format.raw/*65.57*/("""
                                                    """),format.raw/*66.53*/("""<td>-</td>
                                                """)))}),format.raw/*67.50*/("""
                                            """),format.raw/*68.45*/("""</tr>

                                            <tr>
                                                <th style="max-width: 50px">Street Address 1</th>
                                                """),_display_(/*72.50*/if(organization.getStreetAddress1!="null" && organization.getStreetAddress1 != "")/*72.132*/ {_display_(Seq[Any](format.raw/*72.134*/("""
                                                    """),format.raw/*73.53*/("""<td style="word-wrap: break-word;">"""),_display_(/*73.89*/organization/*73.101*/.getStreetAddress1),format.raw/*73.119*/("""</td>
                                                """)))}/*74.51*/else/*74.56*/{_display_(Seq[Any](format.raw/*74.57*/("""
                                                    """),format.raw/*75.53*/("""<td>-</td>
                                                """)))}),format.raw/*76.50*/("""
                                            """),format.raw/*77.45*/("""</tr>

                                            <tr>
                                                <th style="max-width: 50px">Street Address 2</th>
                                                """),_display_(/*81.50*/if(organization.getStreetAddress2!="null" && organization.getStreetAddress2 != "")/*81.132*/ {_display_(Seq[Any](format.raw/*81.134*/("""
                                                    """),format.raw/*82.53*/("""<td style="word-wrap: break-word;">"""),_display_(/*82.89*/organization/*82.101*/.getStreetAddress2),format.raw/*82.119*/("""</td>
                                                """)))}/*83.51*/else/*83.56*/{_display_(Seq[Any](format.raw/*83.57*/("""
                                                    """),format.raw/*84.53*/("""<td>-</td>
                                                """)))}),format.raw/*85.50*/("""
                                            """),format.raw/*86.45*/("""</tr>

                                            <tr>
                                                <th style="max-width: 50px">Short Description</th>
                                                """),_display_(/*90.50*/if(organization.getShortDescription!="null" && organization.getShortDescription != "")/*90.136*/ {_display_(Seq[Any](format.raw/*90.138*/("""
                                                    """),format.raw/*91.53*/("""<td style="word-wrap: break-word;">"""),_display_(/*91.89*/organization/*91.101*/.getShortDescription),format.raw/*91.121*/("""</td>
                                                """)))}/*92.51*/else/*92.56*/{_display_(Seq[Any](format.raw/*92.57*/("""
                                                    """),format.raw/*93.53*/("""<td>-</td>
                                                """)))}),format.raw/*94.50*/("""
                                            """),format.raw/*95.45*/("""</tr>

                                            <tr>
                                                <th style="max-width: 50px">Long Description</th>
                                                """),_display_(/*99.50*/if(organization.getLongDescription!="null" && organization.getLongDescription != "")/*99.134*/ {_display_(Seq[Any](format.raw/*99.136*/("""
                                                    """),format.raw/*100.53*/("""<td style="word-wrap: break-word;">"""),_display_(/*100.89*/organization/*100.101*/.getLongDescription),format.raw/*100.120*/("""</td>
                                                """)))}/*101.51*/else/*101.56*/{_display_(Seq[Any](format.raw/*101.57*/("""
                                                    """),format.raw/*102.53*/("""<td>-</td>
                                                """)))}),format.raw/*103.50*/("""
                                            """),format.raw/*104.45*/("""</tr>

                                            <tr>
                                                <th style="max-width: 50px">Contact Person Name</th>
                                                """),_display_(/*108.50*/if(organization.getContactPersonName!="null" && organization.getContactPersonName != "")/*108.138*/ {_display_(Seq[Any](format.raw/*108.140*/("""
                                                    """),format.raw/*109.53*/("""<td style="word-wrap: break-word;">"""),_display_(/*109.89*/organization/*109.101*/.getContactPersonName),format.raw/*109.122*/("""</td>
                                                """)))}/*110.51*/else/*110.56*/{_display_(Seq[Any](format.raw/*110.57*/("""
                                                    """),format.raw/*111.53*/("""<td>-</td>
                                                """)))}),format.raw/*112.50*/("""


                                            """),format.raw/*115.45*/("""</tr>
                                            <tr>
                                                <th style="max-width: 50px">Contact Person Email</th>
                                                """),_display_(/*118.50*/if(organization.getContactPersonEmail!="null" && organization.getContactPersonEmail != "")/*118.140*/ {_display_(Seq[Any](format.raw/*118.142*/("""
                                                    """),format.raw/*119.53*/("""<td style="word-wrap: break-word;">"""),_display_(/*119.89*/organization/*119.101*/.getContactPersonEmail),format.raw/*119.123*/("""</td>
                                                """)))}/*120.51*/else/*120.56*/{_display_(Seq[Any](format.raw/*120.57*/("""
                                                    """),format.raw/*121.53*/("""<td>-</td>
                                                """)))}),format.raw/*122.50*/("""
                                            """),format.raw/*123.45*/("""</tr>

                                            <tr>
                                                <th style="max-width: 50px">Contact Person Phone</th>
                                                """),_display_(/*127.50*/if(organization.getContactPersonPhone!="null" && organization.getContactPersonPhone != "")/*127.140*/ {_display_(Seq[Any](format.raw/*127.142*/("""
                                                    """),format.raw/*128.53*/("""<td style="word-wrap: break-word;">"""),_display_(/*128.89*/organization/*128.101*/.getContactPersonPhone),format.raw/*128.123*/("""</td>
                                                """)))}/*129.51*/else/*129.56*/{_display_(Seq[Any](format.raw/*129.57*/("""
                                                    """),format.raw/*130.53*/("""<td>-</td>
                                                """)))}),format.raw/*131.50*/("""
                                            """),format.raw/*132.45*/("""</tr>


                                            <tr>
                                                <th style="max-width: 50px">Fields</th>
                                                """),_display_(/*137.50*/if(organization.getFields!="null" && organization.getFields != "")/*137.116*/ {_display_(Seq[Any](format.raw/*137.118*/("""
                                                    """),format.raw/*138.53*/("""<td style="word-wrap: break-word;">"""),_display_(/*138.89*/organization/*138.101*/.getFields),format.raw/*138.111*/("""</td>
                                                """)))}/*139.51*/else/*139.56*/{_display_(Seq[Any](format.raw/*139.57*/("""
                                                    """),format.raw/*140.53*/("""<td>-</td>
                                                """)))}),format.raw/*141.50*/("""
                                            """),format.raw/*142.45*/("""</tr>

                                            <tr>
                                                <th style="max-width: 50px">Focuses</th>
                                                """),_display_(/*146.50*/if(organization.getFocuses!="null" && organization.getFocuses != "")/*146.118*/ {_display_(Seq[Any](format.raw/*146.120*/("""
                                                    """),format.raw/*147.53*/("""<td style="word-wrap: break-word;">"""),_display_(/*147.89*/organization/*147.101*/.getFocuses),format.raw/*147.112*/("""</td>
                                                """)))}/*148.51*/else/*148.56*/{_display_(Seq[Any](format.raw/*148.57*/("""
                                                    """),format.raw/*149.53*/("""<td>-</td>
                                                """)))}),format.raw/*150.50*/("""
                                            """),format.raw/*151.45*/("""</tr>

                                            <tr>
                                                <th style="max-width: 50px">Organization History</th>
                                                """),_display_(/*155.50*/if(organization.getOrganizationHistory!="null" && organization.getOrganizationHistory != "")/*155.142*/ {_display_(Seq[Any](format.raw/*155.144*/("""
                                                    """),format.raw/*156.53*/("""<td style="word-wrap: break-word;">"""),_display_(/*156.89*/organization/*156.101*/.getOrganizationHistory),format.raw/*156.124*/("""</td>
                                                """)))}/*157.51*/else/*157.56*/{_display_(Seq[Any](format.raw/*157.57*/("""
                                                    """),format.raw/*158.53*/("""<td>-</td>
                                                """)))}),format.raw/*159.50*/("""
                                            """),format.raw/*160.45*/("""</tr>

                                            <tr>
                                                <th style="max-width: 50px">Number of Employee</th>
                                                """),_display_(/*164.50*/if(organization.getNumberOfEmployees!="null" && organization.getNumberOfEmployees != "")/*164.138*/ {_display_(Seq[Any](format.raw/*164.140*/("""
                                                    """),format.raw/*165.53*/("""<td style="word-wrap: break-word;">"""),_display_(/*165.89*/organization/*165.101*/.getNumberOfEmployees),format.raw/*165.122*/("""</td>
                                                """)))}/*166.51*/else/*166.56*/{_display_(Seq[Any](format.raw/*166.57*/("""
                                                    """),format.raw/*167.53*/("""<td>-</td>
                                                """)))}),format.raw/*168.50*/("""
                                            """),format.raw/*169.45*/("""</tr>


                                            <tr>
                                                <th style="max-width: 49px">URL</th>
                                                <td style="word-wrap: break-word;">"""),_display_(/*174.85*/organization/*174.97*/.getURL),format.raw/*174.104*/("""</td>
                                            </tr>
        """),format.raw/*176.53*/("""
        """),format.raw/*177.231*/("""
        """),format.raw/*178.119*/("""
        """),format.raw/*179.54*/("""
                                        """),format.raw/*180.41*/("""</tbody>
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

                            <div><h6>Organization Name:</h6> """),_display_(/*194.63*/organization/*194.75*/.getOrganizationName),format.raw/*194.95*/("""</div>
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
                        """),_display_(/*215.26*/if(organization.getOrganizationName() == userOrganization)/*215.84*/ {_display_(Seq[Any](format.raw/*215.86*/("""
                            """),format.raw/*216.29*/("""<a href=""""),_display_(/*216.39*/routes/*216.45*/.OrganizationController.organizationEditPage()),format.raw/*216.91*/("""" class="btn waves-effect waves-light blue darken-2">
                                Edit Profile</a>
                        """)))}),format.raw/*218.26*/("""
                        """),format.raw/*219.25*/("""<a href=""""),_display_(/*219.35*/routes/*219.41*/.OrganizationController.organizationListPage(1, "id")),format.raw/*219.94*/("""" class="btn waves-effect waves-light blue darken-2">
                            Back to List</a>
"""),format.raw/*221.95*/("""

"""),format.raw/*223.144*/("""
"""),format.raw/*224.49*/("""
"""),format.raw/*225.33*/("""
"""),format.raw/*226.147*/("""
"""),format.raw/*227.62*/("""
"""),format.raw/*228.26*/("""
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
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/organizationDetail.scala.html
                  HASH: 03b92dfecb0835cd05735da31946a7445f5edf6d
                  MATRIX: 814->1|838->19|1184->36|1316->93|1330->100|1410->104|1441->109|1497->139|1511->145|1577->191|1696->90|1724->271|1754->275|1800->312|1840->314|1872->319|2045->465|2121->532|2161->534|2214->559|2287->614|2300->619|2339->620|2392->645|2439->665|2460->677|2501->697|2559->724|2609->746|2889->999|2904->1005|2963->1042|3536->1588|3557->1600|3599->1620|3869->1863|3947->1931|3988->1933|4069->1986|4132->2022|4154->2034|4187->2045|4261->2101|4274->2106|4313->2107|4394->2160|4485->2220|4558->2265|4777->2457|4851->2521|4892->2523|4973->2576|5036->2612|5058->2624|5089->2633|5163->2689|5176->2694|5215->2695|5296->2748|5387->2808|5460->2853|5677->3043|5749->3105|5790->3107|5871->3160|5934->3196|5956->3208|5986->3216|6060->3272|6073->3277|6112->3278|6193->3331|6284->3391|6357->3436|6578->3630|6656->3698|6697->3700|6778->3753|6841->3789|6863->3801|6896->3812|6970->3868|6983->3873|7022->3874|7103->3927|7194->3987|7267->4032|7497->4235|7589->4317|7630->4319|7711->4372|7774->4408|7796->4420|7836->4438|7910->4494|7923->4499|7962->4500|8043->4553|8134->4613|8207->4658|8437->4861|8529->4943|8570->4945|8651->4998|8714->5034|8736->5046|8776->5064|8850->5120|8863->5125|8902->5126|8983->5179|9074->5239|9147->5284|9378->5488|9474->5574|9515->5576|9596->5629|9659->5665|9681->5677|9723->5697|9797->5753|9810->5758|9849->5759|9930->5812|10021->5872|10094->5917|10324->6120|10418->6204|10459->6206|10541->6259|10605->6295|10628->6307|10670->6326|10745->6382|10759->6387|10799->6388|10881->6441|10973->6501|11047->6546|11281->6752|11380->6840|11422->6842|11504->6895|11568->6931|11591->6943|11635->6964|11710->7020|11724->7025|11764->7026|11846->7079|11938->7139|12014->7186|12248->7392|12349->7482|12391->7484|12473->7537|12537->7573|12560->7585|12605->7607|12680->7663|12694->7668|12734->7669|12816->7722|12908->7782|12982->7827|13217->8034|13318->8124|13360->8126|13442->8179|13506->8215|13529->8227|13574->8249|13649->8305|13663->8310|13703->8311|13785->8364|13877->8424|13951->8469|14173->8663|14250->8729|14292->8731|14374->8784|14438->8820|14461->8832|14494->8842|14569->8898|14583->8903|14623->8904|14705->8957|14797->9017|14871->9062|15093->9256|15172->9324|15214->9326|15296->9379|15360->9415|15383->9427|15417->9438|15492->9494|15506->9499|15546->9500|15628->9553|15720->9613|15794->9658|16029->9865|16132->9957|16174->9959|16256->10012|16320->10048|16343->10060|16389->10083|16464->10139|16478->10144|16518->10145|16600->10198|16692->10258|16766->10303|16999->10508|17098->10596|17140->10598|17222->10651|17286->10687|17309->10699|17353->10720|17428->10776|17442->10781|17482->10782|17564->10835|17656->10895|17730->10940|17984->11166|18006->11178|18036->11185|18129->11293|18168->11524|18207->11643|18245->11697|18315->11738|18758->12153|18774->12159|18834->12196|19039->12373|19061->12385|19103->12405|19190->12464|19212->12476|19245->12487|19330->12544|19352->12556|19383->12565|19467->12621|19489->12633|19519->12641|19606->12700|19628->12712|19661->12723|19757->12791|19779->12803|19819->12821|19915->12889|19937->12901|19977->12919|20074->12988|20096->13000|20138->13020|20234->13088|20256->13100|20297->13119|20396->13190|20418->13202|20461->13223|20561->13295|20583->13307|20628->13329|20728->13401|20750->13413|20795->13435|20881->13493|20903->13505|20935->13515|21022->13574|21044->13586|21077->13597|21177->13669|21199->13681|21245->13704|21344->13775|21366->13787|21409->13808|21501->13872|21523->13884|21552->13891|21583->13894|21605->13906|21634->13913|21802->14053|21870->14111|21911->14113|21969->14142|22007->14152|22023->14158|22091->14204|22251->14332|22305->14357|22343->14367|22359->14373|22434->14426|22562->14619|22594->14764|22624->14813|22654->14846|22685->14993|22715->15055|22745->15081|22795->15102
                  LINES: 31->1|32->2|37->3|41->5|41->5|43->5|44->6|44->6|44->6|44->6|47->3|49->8|52->11|52->11|52->11|53->12|57->16|57->16|57->16|58->17|59->18|59->18|59->18|60->19|60->19|60->19|60->19|61->20|63->22|67->26|67->26|67->26|74->33|74->33|74->33|78->37|78->37|78->37|79->38|79->38|79->38|79->38|80->39|80->39|80->39|81->40|82->41|83->42|87->46|87->46|87->46|88->47|88->47|88->47|88->47|89->48|89->48|89->48|90->49|91->50|92->51|95->54|95->54|95->54|96->55|96->55|96->55|96->55|97->56|97->56|97->56|98->57|99->58|100->59|104->63|104->63|104->63|105->64|105->64|105->64|105->64|106->65|106->65|106->65|107->66|108->67|109->68|113->72|113->72|113->72|114->73|114->73|114->73|114->73|115->74|115->74|115->74|116->75|117->76|118->77|122->81|122->81|122->81|123->82|123->82|123->82|123->82|124->83|124->83|124->83|125->84|126->85|127->86|131->90|131->90|131->90|132->91|132->91|132->91|132->91|133->92|133->92|133->92|134->93|135->94|136->95|140->99|140->99|140->99|141->100|141->100|141->100|141->100|142->101|142->101|142->101|143->102|144->103|145->104|149->108|149->108|149->108|150->109|150->109|150->109|150->109|151->110|151->110|151->110|152->111|153->112|156->115|159->118|159->118|159->118|160->119|160->119|160->119|160->119|161->120|161->120|161->120|162->121|163->122|164->123|168->127|168->127|168->127|169->128|169->128|169->128|169->128|170->129|170->129|170->129|171->130|172->131|173->132|178->137|178->137|178->137|179->138|179->138|179->138|179->138|180->139|180->139|180->139|181->140|182->141|183->142|187->146|187->146|187->146|188->147|188->147|188->147|188->147|189->148|189->148|189->148|190->149|191->150|192->151|196->155|196->155|196->155|197->156|197->156|197->156|197->156|198->157|198->157|198->157|199->158|200->159|201->160|205->164|205->164|205->164|206->165|206->165|206->165|206->165|207->166|207->166|207->166|208->167|209->168|210->169|215->174|215->174|215->174|217->176|218->177|219->178|220->179|221->180|232->191|232->191|232->191|235->194|235->194|235->194|236->195|236->195|236->195|237->196|237->196|237->196|238->197|238->197|238->197|239->198|239->198|239->198|240->199|240->199|240->199|241->200|241->200|241->200|242->201|242->201|242->201|243->202|243->202|243->202|244->203|244->203|244->203|245->204|245->204|245->204|246->205|246->205|246->205|247->206|247->206|247->206|248->207|248->207|248->207|249->208|249->208|249->208|250->209|250->209|250->209|251->210|251->210|251->210|251->210|251->210|251->210|256->215|256->215|256->215|257->216|257->216|257->216|257->216|259->218|260->219|260->219|260->219|260->219|262->221|264->223|265->224|266->225|267->226|268->227|269->228|270->229
                  -- GENERATED --
              */
          