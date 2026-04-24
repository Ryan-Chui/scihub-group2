
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

object rajobDetail extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template8[RAJob,Long,String,String,String,String,String,Boolean,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(rajob: RAJob, userId: Long, userTypes: String, tableName: String, rajobFileType: String, tableRecorderId: String, backendPort: String, rajobDocument: Boolean):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import helper._


Seq[Any](format.raw/*2.161*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("RAJob Profile")/*6.23*/ {_display_(Seq[Any](format.raw/*6.25*/("""

    """),format.raw/*8.5*/("""<link href='"""),_display_(/*8.18*/routes/*8.24*/.Assets.at("stylesheets/textarea-resize.css")),format.raw/*8.69*/("""'
    rel="stylesheet" />

    <div class="container">
        <div class="row">
            <div class="col s12">
                <div class="card-panel">

                    <h4 class="center">RA Job: """),_display_(/*16.49*/rajob/*16.54*/.getTitle),format.raw/*16.63*/("""</h4>

                    <div class="row">
                        <div class="col s4">
                            <div class="center">
                                <img class="circle" id="showImg" src=""""),_display_(/*21.72*/routes/*21.78*/.Assets.at("images/smu.jpeg")),format.raw/*21.107*/("""" width="360" height="360" style="border-width: 1px;
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
                                        <th style="max-width: 50px">RA Job Title</th>
                                        <td style="word-wrap: break-word;">"""),_display_(/*33.77*/rajob/*33.82*/.getTitle),format.raw/*33.91*/("""</td>
                                    </tr>

                                    <tr>
                                        <th style="max-width: 50px">Department/Lab Name</th>
                                        """),_display_(/*38.42*/if(rajob.getOrganization!="null" && rajob.getOrganization != "")/*38.106*/ {_display_(Seq[Any](format.raw/*38.108*/("""
                                            """),format.raw/*39.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*39.81*/rajob/*39.86*/.getOrganization),format.raw/*39.102*/("""</td>
                                        """)))}/*40.43*/else/*40.48*/{_display_(Seq[Any](format.raw/*40.49*/("""
                                            """),format.raw/*41.45*/("""<td>-</td>
                                        """)))}),format.raw/*42.42*/("""
                                    """),format.raw/*43.37*/("""</tr>

                                    <tr>
                                        <th style="max-width: 50px">Goals</th>
                                        """),_display_(/*47.42*/if(rajob.getGoals!="null" && rajob.getGoals != "")/*47.92*/ {_display_(Seq[Any](format.raw/*47.94*/("""
                                            """),format.raw/*48.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*48.81*/rajob/*48.86*/.getGoals),format.raw/*48.95*/("""</td>
                                        """)))}/*49.43*/else/*49.48*/{_display_(Seq[Any](format.raw/*49.49*/("""
                                            """),format.raw/*50.45*/("""<td>-</td>
                                        """)))}),format.raw/*51.42*/("""
                                    """),format.raw/*52.37*/("""</tr>
                                    <tr>
                                        <th style="width: 200px;">Short Description</th>
                                        """),_display_(/*55.42*/if(rajob.getShortDescription != "null" && rajob.getShortDescription != "")/*55.116*/ {_display_(Seq[Any](format.raw/*55.118*/("""
                                            """),format.raw/*56.45*/("""<td style="white-space: pre-wrap; word-wrap: break-word; text-align: left;">"""),_display_(/*56.122*/rajob/*56.127*/.getShortDescription),format.raw/*56.147*/("""</td>
                                        """)))}/*57.43*/else/*57.48*/{_display_(Seq[Any](format.raw/*57.49*/("""
                                            """),format.raw/*58.45*/("""<td>-</td>
                                        """)))}),format.raw/*59.42*/("""
                                    """),format.raw/*60.37*/("""</tr>

                                    <tr>
                                        <th style="width: 200px;">Long Description</th>
                                        """),_display_(/*64.42*/if(rajob.getLongDescription != "null" && rajob.getLongDescription != "")/*64.114*/ {_display_(Seq[Any](format.raw/*64.116*/("""
                                            """),format.raw/*65.45*/("""<td style="white-space: pre-wrap; word-wrap: break-word; text-align: left;">"""),_display_(/*65.122*/rajob/*65.127*/.getLongDescription),format.raw/*65.146*/("""</td>
                                        """)))}/*66.43*/else/*66.48*/{_display_(Seq[Any](format.raw/*66.49*/("""
                                            """),format.raw/*67.45*/("""<td>-</td>
                                        """)))}),format.raw/*68.42*/("""
                                    """),format.raw/*69.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">Fields</th>
                                        """),_display_(/*72.42*/if(rajob.getFields!="null" && rajob.getFields != "")/*72.94*/ {_display_(Seq[Any](format.raw/*72.96*/("""
                                            """),format.raw/*73.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*73.81*/rajob/*73.86*/.getFields),format.raw/*73.96*/("""</td>
                                        """)))}/*74.43*/else/*74.48*/{_display_(Seq[Any](format.raw/*74.49*/("""
                                            """),format.raw/*75.45*/("""<td>-</td>
                                        """)))}),format.raw/*76.42*/("""
                                    """),format.raw/*77.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">Required Expertise</th>
                                        """),_display_(/*80.42*/if(rajob.getRequiredExpertise!="null" && rajob.getRequiredExpertise != "")/*80.116*/ {_display_(Seq[Any](format.raw/*80.118*/("""
                                            """),format.raw/*81.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*81.81*/rajob/*81.86*/.getRequiredExpertise),format.raw/*81.107*/("""</td>
                                        """)))}/*82.43*/else/*82.48*/{_display_(Seq[Any](format.raw/*82.49*/("""
                                            """),format.raw/*83.45*/("""<td>-</td>
                                        """)))}),format.raw/*84.42*/("""
                                    """),format.raw/*85.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">Preferred Expertise</th>
                                        """),_display_(/*88.42*/if(rajob.getPreferredExpertise!="null" && rajob.getPreferredExpertise != "")/*88.118*/ {_display_(Seq[Any](format.raw/*88.120*/("""
                                            """),format.raw/*89.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*89.81*/rajob/*89.86*/.getPreferredExpertise),format.raw/*89.108*/("""</td>
                                        """)))}/*90.43*/else/*90.48*/{_display_(Seq[Any](format.raw/*90.49*/("""
                                            """),format.raw/*91.45*/("""<td>-</td>
                                        """)))}),format.raw/*92.42*/("""
                                    """),format.raw/*93.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">Location</th>
                                        """),_display_(/*96.42*/if(rajob.getLocation!="null" && rajob.getLocation != "")/*96.98*/ {_display_(Seq[Any](format.raw/*96.100*/("""
                                            """),format.raw/*97.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*97.81*/rajob/*97.86*/.getLocation),format.raw/*97.98*/("""</td>
                                        """)))}/*98.43*/else/*98.48*/{_display_(Seq[Any](format.raw/*98.49*/("""
                                            """),format.raw/*99.45*/("""<td>-</td>
                                        """)))}),format.raw/*100.42*/("""
                                    """),format.raw/*101.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">RA Job Type</th>
                                        <td style="word-wtap: break-word;">
                                        """),_display_(/*105.42*/if(rajob.getRaTypes!="null" && rajob.getRaTypes != "" )/*105.97*/ {_display_(Seq[Any](format.raw/*105.99*/("""
                                            """),_display_(/*106.46*/if(rajob.getRaTypes == 1)/*106.71*/{_display_(Seq[Any](format.raw/*106.72*/("""
                                                """),format.raw/*107.49*/("""Hourly RA (Graduate Students: $20/Hour; Undergraduate Student: $15/Hour)
                                            """)))}),format.raw/*108.46*/("""
                                            """),_display_(/*109.46*/if(rajob.getRaTypes == 2)/*109.71*/ {_display_(Seq[Any](format.raw/*109.73*/("""
                                                """),format.raw/*110.49*/("""Full-time RA (Tuition waiver + $2500/Month)
                                            """)))}),format.raw/*111.46*/("""
                                        """)))}/*112.43*/else/*112.47*/{_display_(Seq[Any](format.raw/*112.48*/("""
                                            """),format.raw/*113.45*/("""N/A
                                        """)))}),format.raw/*114.42*/("""
                                        """),format.raw/*115.41*/("""</td>
                                    </tr>
                                    """),format.raw/*117.81*/("""
                                    """),format.raw/*118.126*/("""
                                    """),format.raw/*119.116*/("""
                                    """),format.raw/*120.147*/("""
                                    """),format.raw/*121.108*/("""
                                    """),format.raw/*122.93*/("""
                                    """),format.raw/*123.92*/("""
                                    """),format.raw/*124.86*/("""
                                    """),format.raw/*125.82*/("""
                                    """),format.raw/*126.147*/("""
                                    """),format.raw/*127.108*/("""
                                    """),format.raw/*128.93*/("""
                                    """),format.raw/*129.92*/("""
                                    """),format.raw/*130.86*/("""
                                    """),format.raw/*131.86*/("""
                                    """),format.raw/*132.82*/("""
                                    """),format.raw/*133.37*/("""<tr>
                                        <th style="max-width: 50px">RA Job URL</th>
                                        """),_display_(/*135.42*/if(rajob.getUrl !=null && rajob.getUrl != "")/*135.87*/ {_display_(Seq[Any](format.raw/*135.89*/("""
                                            """),format.raw/*136.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*136.81*/rajob/*136.86*/.getUrl),format.raw/*136.93*/("""</td>
                                        """)))}/*137.43*/else/*137.48*/{_display_(Seq[Any](format.raw/*137.49*/("""
                                            """),format.raw/*138.45*/("""<td>-</td>
                                        """)))}),format.raw/*139.42*/("""
                                    """),format.raw/*140.37*/("""</tr>

                                    <tr>
                                        <th style="max-width: 50px">RA Job Publisher</th>
                                        """),_display_(/*144.42*/if(rajob.getRajobPublisher!="null" && rajob.getRajobPublisher != "")/*144.110*/ {_display_(Seq[Any](format.raw/*144.112*/("""
                                            """),format.raw/*145.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*145.81*/rajob/*145.86*/.getRajobPublisher.getUserName),format.raw/*145.116*/("""</td>
                                        """)))}/*146.43*/else/*146.48*/{_display_(Seq[Any](format.raw/*146.49*/("""
                                            """),format.raw/*147.45*/("""<td>-</td>
                                        """)))}),format.raw/*148.42*/("""
                                    """),format.raw/*149.37*/("""</tr>
                                    """),format.raw/*157.44*/("""
                                    """),_display_(/*158.38*/if(rajobDocument)/*158.55*/ {_display_(Seq[Any](format.raw/*158.57*/("""
                                        """),format.raw/*159.41*/("""<tr>
                                            <th style="max-width: 50px">RA Job Document</th>
                                            <td style="word-wrap: break-word;">
                                                <a href="javascript:void(0);"
                                                data-url=""""),_display_(/*163.60*/routes/*163.66*/.FileController.getFile(tableName, rajobFileType, tableRecorderId)),format.raw/*163.132*/(""""
                                                class="blue-text text-darken-3"
                                                onclick="openAndCheckNewTabUrl(this)">
                                                    Download RA Job Document
                                                </a>
                                            </td>
                                        </tr>
                                    """)))}),format.raw/*170.38*/("""
                                """),format.raw/*171.33*/("""</tbody>
                            </table>
                        </div>
                    </div>
                    <div class="row center">
                        """),format.raw/*176.47*/("""
                        """),_display_(/*177.26*/if(userTypes == "0")/*177.46*/ {_display_(Seq[Any](format.raw/*177.48*/("""
                            """),format.raw/*178.29*/("""<a href=""""),_display_(/*178.39*/routes/*178.45*/.AdminController.jobManagement(1, "id")),format.raw/*178.84*/("""" class="btn waves-effect waves-light blue darken-2">
                                Back to job management
                            </a>
                        """)))}),format.raw/*181.26*/("""
                        """),_display_(/*182.26*/if((userTypes == "1" && rajob.getRajobPublisher().getId().equals(userId)) || userTypes == "0")/*182.120*/ {_display_(Seq[Any](format.raw/*182.122*/("""
                            """),format.raw/*183.29*/("""<a href=""""),_display_(/*183.39*/routes/*183.45*/.RAJobController.rajobEditPage(rajob.getId, rajob.getStatus())),format.raw/*183.107*/("""" class="btn waves-effect waves-light blue darken-2">
                                Edit RA Job Info</a>
                        """)))}),format.raw/*185.26*/("""
                        """),format.raw/*186.25*/("""<a href=""""),_display_(/*186.35*/routes/*186.41*/.RAJobController.rajobList(1, "id")),format.raw/*186.76*/("""" class="btn waves-effect waves-light blue darken-2">
                            Back to RA Job List</a>

                        """),_display_(/*189.26*/if((userTypes == "4" || userTypes == "0") && !rajob.getRajobApplicationIdList.contains(userId) && rajob.getStatus != "closed"  )/*189.154*/ {_display_(Seq[Any](format.raw/*189.156*/("""
                            """),format.raw/*190.29*/("""<a href=""""),_display_(/*190.39*/routes/*190.45*/.RAJobController.rajobApplyPage(rajob.getId)),format.raw/*190.89*/("""" class="btn waves-effect waves-light green darken-2">
                                Apply Job
                            </a>
                        """)))}),format.raw/*193.26*/("""
                        """),_display_(/*194.26*/if((userTypes == "1" && rajob.getRajobPublisher().getId().equals(userId)) || userTypes == "0" )/*194.121*/ {_display_(Seq[Any](format.raw/*194.123*/("""
                            """),format.raw/*195.29*/("""<a href=""""),_display_(/*195.39*/routes/*195.45*/.RAJobController.closeRAJob(rajob.getId)),format.raw/*195.85*/("""" class="btn waves-effect waves-light blue darken-2">
                                Close RA Job</a>
                        """)))}),format.raw/*197.26*/("""

                    """),format.raw/*199.21*/("""</div>
                </div>
            </div>
        </div>
    </div>

    <script>
            function openAndCheckNewTabUrl(link) """),format.raw/*206.50*/("""{"""),format.raw/*206.51*/("""const url = link.getAttribute('data-url');

                fetch(url, """),format.raw/*208.28*/("""{"""),format.raw/*208.29*/(""" """),format.raw/*208.30*/("""method: 'HEAD' """),format.raw/*208.45*/("""}"""),format.raw/*208.46*/(""").then(response => """),format.raw/*208.65*/("""{"""),format.raw/*208.66*/("""
                    """),format.raw/*209.21*/("""if (response.ok) """),format.raw/*209.38*/("""{"""),format.raw/*209.39*/("""
                        """),format.raw/*210.25*/("""const newTab = window.open(url, '_blank');
                        if (!newTab) """),format.raw/*211.38*/("""{"""),format.raw/*211.39*/("""
                            """),format.raw/*212.29*/("""alert("Please allow pop-ups in your browser to view this file.");
                        """),format.raw/*213.25*/("""}"""),format.raw/*213.26*/("""
                    """),format.raw/*214.21*/("""}"""),format.raw/*214.22*/(""" """),format.raw/*214.23*/("""else """),format.raw/*214.28*/("""{"""),format.raw/*214.29*/("""
                        """),format.raw/*215.25*/("""alert("The user did not upload this file");
                    """),format.raw/*216.21*/("""}"""),format.raw/*216.22*/("""
                """),format.raw/*217.17*/("""}"""),format.raw/*217.18*/(""")
                        .catch(error => """),format.raw/*218.41*/("""{"""),format.raw/*218.42*/("""
                            """),format.raw/*219.29*/("""console.error("Error checking the URL:", error);
                            alert("Failed to check the file. Please try again later.");
                        """),format.raw/*221.25*/("""}"""),format.raw/*221.26*/(""");
            """),format.raw/*222.13*/("""}"""),format.raw/*222.14*/("""
    """),format.raw/*223.5*/("""</script>

""")))}))
      }
    }
  }

  def render(rajob:RAJob,userId:Long,userTypes:String,tableName:String,rajobFileType:String,tableRecorderId:String,backendPort:String,rajobDocument:Boolean): play.twirl.api.HtmlFormat.Appendable = apply(rajob,userId,userTypes,tableName,rajobFileType,tableRecorderId,backendPort,rajobDocument)

  def f:((RAJob,Long,String,String,String,String,String,Boolean) => play.twirl.api.HtmlFormat.Appendable) = (rajob,userId,userTypes,tableName,rajobFileType,tableRecorderId,backendPort,rajobDocument) => apply(rajob,userId,userTypes,tableName,rajobFileType,tableRecorderId,backendPort,rajobDocument)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:35 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/rajobDetail.scala.html
                  HASH: e9510d7b5b6efaf7f13f3f41d69863e6038cf43f
                  MATRIX: 814->1|1215->46|1447->208|1493->205|1521->224|1548->226|1577->247|1616->249|1648->255|1687->268|1701->274|1766->319|1998->524|2012->529|2042->538|2279->748|2294->754|2345->783|3061->1472|3075->1477|3105->1486|3356->1710|3430->1774|3471->1776|3544->1821|3607->1857|3621->1862|3659->1878|3725->1926|3738->1931|3777->1932|3850->1977|3933->2029|3998->2066|4193->2234|4252->2284|4292->2286|4365->2331|4428->2367|4442->2372|4472->2381|4538->2429|4551->2434|4590->2435|4663->2480|4746->2532|4811->2569|5015->2746|5099->2820|5140->2822|5213->2867|5318->2944|5333->2949|5375->2969|5441->3017|5454->3022|5493->3023|5566->3068|5649->3120|5714->3157|5918->3334|6000->3406|6041->3408|6114->3453|6219->3530|6234->3535|6275->3554|6341->3602|6354->3607|6393->3608|6466->3653|6549->3705|6614->3742|6809->3910|6870->3962|6910->3964|6983->4009|7046->4045|7060->4050|7091->4060|7157->4108|7170->4113|7209->4114|7282->4159|7365->4211|7430->4248|7637->4428|7721->4502|7762->4504|7835->4549|7898->4585|7912->4590|7955->4611|8021->4659|8034->4664|8073->4665|8146->4710|8229->4762|8294->4799|8502->4980|8588->5056|8629->5058|8702->5103|8765->5139|8779->5144|8823->5166|8889->5214|8902->5219|8941->5220|9014->5265|9097->5317|9162->5354|9359->5524|9424->5580|9465->5582|9538->5627|9601->5663|9615->5668|9648->5680|9714->5728|9727->5733|9766->5734|9839->5779|9923->5831|9989->5868|10266->6117|10331->6172|10372->6174|10446->6220|10481->6245|10521->6246|10599->6295|10749->6413|10823->6459|10858->6484|10899->6486|10977->6535|11098->6624|11160->6667|11174->6671|11214->6672|11288->6717|11365->6762|11435->6803|11548->6931|11615->7057|11682->7173|11749->7320|11816->7428|11882->7521|11948->7613|12014->7699|12080->7781|12147->7928|12214->8036|12280->8129|12346->8221|12412->8307|12478->8393|12544->8475|12610->8512|12768->8642|12823->8687|12864->8689|12938->8734|13002->8770|13017->8775|13046->8782|13113->8830|13127->8835|13167->8836|13241->8881|13325->8933|13391->8970|13598->9149|13677->9217|13719->9219|13793->9264|13857->9300|13872->9305|13925->9335|13992->9383|14006->9388|14046->9389|14120->9434|14204->9486|14270->9523|14341->10000|14407->10038|14434->10055|14475->10057|14545->10098|14888->10413|14904->10419|14993->10485|15457->10917|15519->10950|15721->11145|15775->11171|15805->11191|15846->11193|15904->11222|15942->11232|15958->11238|16019->11277|16218->11444|16272->11470|16377->11564|16419->11566|16477->11595|16515->11605|16531->11611|16616->11673|16780->11805|16834->11830|16872->11840|16888->11846|16945->11881|17105->12013|17244->12141|17286->12143|17344->12172|17382->12182|17398->12188|17464->12232|17651->12387|17705->12413|17811->12508|17853->12510|17911->12539|17949->12549|17965->12555|18027->12595|18187->12723|18238->12745|18405->12883|18435->12884|18535->12955|18565->12956|18595->12957|18639->12972|18669->12973|18717->12992|18747->12993|18797->13014|18843->13031|18873->13032|18927->13057|19036->13137|19066->13138|19124->13167|19243->13257|19273->13258|19323->13279|19353->13280|19383->13281|19417->13286|19447->13287|19501->13312|19594->13376|19624->13377|19670->13394|19700->13395|19771->13437|19801->13438|19859->13467|20049->13628|20079->13629|20123->13644|20153->13645|20186->13650
                  LINES: 31->1|36->2|39->4|42->2|44->5|45->6|45->6|45->6|47->8|47->8|47->8|47->8|55->16|55->16|55->16|60->21|60->21|60->21|72->33|72->33|72->33|77->38|77->38|77->38|78->39|78->39|78->39|78->39|79->40|79->40|79->40|80->41|81->42|82->43|86->47|86->47|86->47|87->48|87->48|87->48|87->48|88->49|88->49|88->49|89->50|90->51|91->52|94->55|94->55|94->55|95->56|95->56|95->56|95->56|96->57|96->57|96->57|97->58|98->59|99->60|103->64|103->64|103->64|104->65|104->65|104->65|104->65|105->66|105->66|105->66|106->67|107->68|108->69|111->72|111->72|111->72|112->73|112->73|112->73|112->73|113->74|113->74|113->74|114->75|115->76|116->77|119->80|119->80|119->80|120->81|120->81|120->81|120->81|121->82|121->82|121->82|122->83|123->84|124->85|127->88|127->88|127->88|128->89|128->89|128->89|128->89|129->90|129->90|129->90|130->91|131->92|132->93|135->96|135->96|135->96|136->97|136->97|136->97|136->97|137->98|137->98|137->98|138->99|139->100|140->101|144->105|144->105|144->105|145->106|145->106|145->106|146->107|147->108|148->109|148->109|148->109|149->110|150->111|151->112|151->112|151->112|152->113|153->114|154->115|156->117|157->118|158->119|159->120|160->121|161->122|162->123|163->124|164->125|165->126|166->127|167->128|168->129|169->130|170->131|171->132|172->133|174->135|174->135|174->135|175->136|175->136|175->136|175->136|176->137|176->137|176->137|177->138|178->139|179->140|183->144|183->144|183->144|184->145|184->145|184->145|184->145|185->146|185->146|185->146|186->147|187->148|188->149|189->157|190->158|190->158|190->158|191->159|195->163|195->163|195->163|202->170|203->171|208->176|209->177|209->177|209->177|210->178|210->178|210->178|210->178|213->181|214->182|214->182|214->182|215->183|215->183|215->183|215->183|217->185|218->186|218->186|218->186|218->186|221->189|221->189|221->189|222->190|222->190|222->190|222->190|225->193|226->194|226->194|226->194|227->195|227->195|227->195|227->195|229->197|231->199|238->206|238->206|240->208|240->208|240->208|240->208|240->208|240->208|240->208|241->209|241->209|241->209|242->210|243->211|243->211|244->212|245->213|245->213|246->214|246->214|246->214|246->214|246->214|247->215|248->216|248->216|249->217|249->217|250->218|250->218|251->219|253->221|253->221|254->222|254->222|255->223
                  -- GENERATED --
              */
          