
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

object jobDetail extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template8[Job,Long,String,String,String,String,String,Boolean,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(job: Job, userId: Long, userTypes: String, tableName: String, jobFileType: String, tableRecorderId: String, backendPort: String, jobDocument: Boolean):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import helper._


Seq[Any](format.raw/*2.153*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("Job Profile")/*6.21*/ {_display_(Seq[Any](format.raw/*6.23*/("""
    """),format.raw/*7.5*/("""<div class="container">
        <div class="row">
            <div class="col s12">
                <div class="card-panel">

                    <h4 class="center">Job: """),_display_(/*12.46*/job/*12.49*/.getTitle),format.raw/*12.58*/("""</h4>

                    <div class="row">
                        <div class="col s4">
                            <div class="center">
                                <img class="circle" id="showImg" src=""""),_display_(/*17.72*/routes/*17.78*/.Assets.at("images/smu.jpeg")),format.raw/*17.107*/("""" width="360" height="360" style="border-width: 1px;
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
                                        <th style="max-width: 50px">Job Title</th>
                                        <td style="word-wrap: break-word;">"""),_display_(/*29.77*/job/*29.80*/.getTitle),format.raw/*29.89*/("""</td>
                                    </tr>

                                    <tr>
                                        <th style="max-width: 50px">Organization Name</th>
                                        """),_display_(/*34.42*/if(job.getOrganization!="null" && job.getOrganization != "")/*34.102*/ {_display_(Seq[Any](format.raw/*34.104*/("""
                                            """),format.raw/*35.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*35.81*/job/*35.84*/.getOrganization),format.raw/*35.100*/("""</td>
                                        """)))}/*36.43*/else/*36.48*/{_display_(Seq[Any](format.raw/*36.49*/("""
                                            """),format.raw/*37.45*/("""<td>-</td>
                                        """)))}),format.raw/*38.42*/("""
                                    """),format.raw/*39.37*/("""</tr>

                                    <tr>
                                        <th style="max-width: 50px">Goals</th>
                                        """),_display_(/*43.42*/if(job.getGoals!="null" && job.getGoals != "")/*43.88*/ {_display_(Seq[Any](format.raw/*43.90*/("""
                                            """),format.raw/*44.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*44.81*/job/*44.84*/.getGoals),format.raw/*44.93*/("""</td>
                                        """)))}/*45.43*/else/*45.48*/{_display_(Seq[Any](format.raw/*45.49*/("""
                                            """),format.raw/*46.45*/("""<td>-</td>
                                        """)))}),format.raw/*47.42*/("""
                                    """),format.raw/*48.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">Short Description</th>
                                        """),_display_(/*51.42*/if(job.getShortDescription!="null" && job.getShortDescription != "")/*51.110*/ {_display_(Seq[Any](format.raw/*51.112*/("""
                                            """),format.raw/*52.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*52.81*/job/*52.84*/.getShortDescription),format.raw/*52.104*/("""</td>
                                        """)))}/*53.43*/else/*53.48*/{_display_(Seq[Any](format.raw/*53.49*/("""
                                            """),format.raw/*54.45*/("""<td>-</td>
                                        """)))}),format.raw/*55.42*/("""
                                    """),format.raw/*56.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">Long Description</th>
                                        """),_display_(/*59.42*/if(job.getLongDescription!="null" && job.getLongDescription != "")/*59.108*/ {_display_(Seq[Any](format.raw/*59.110*/("""
                                            """),format.raw/*60.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*60.81*/job/*60.84*/.getLongDescription),format.raw/*60.103*/("""</td>
                                        """)))}/*61.43*/else/*61.48*/{_display_(Seq[Any](format.raw/*61.49*/("""
                                            """),format.raw/*62.45*/("""<td>-</td>
                                        """)))}),format.raw/*63.42*/("""
                                    """),format.raw/*64.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">Fields</th>
                                        """),_display_(/*67.42*/if(job.getFields!="null" && job.getFields != "")/*67.90*/ {_display_(Seq[Any](format.raw/*67.92*/("""
                                            """),format.raw/*68.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*68.81*/job/*68.84*/.getFields),format.raw/*68.94*/("""</td>
                                        """)))}/*69.43*/else/*69.48*/{_display_(Seq[Any](format.raw/*69.49*/("""
                                            """),format.raw/*70.45*/("""<td>-</td>
                                        """)))}),format.raw/*71.42*/("""
                                    """),format.raw/*72.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">Required Expertise</th>
                                        """),_display_(/*75.42*/if(job.getRequiredExpertise!="null" && job.getRequiredExpertise != "")/*75.112*/ {_display_(Seq[Any](format.raw/*75.114*/("""
                                            """),format.raw/*76.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*76.81*/job/*76.84*/.getRequiredExpertise),format.raw/*76.105*/("""</td>
                                        """)))}/*77.43*/else/*77.48*/{_display_(Seq[Any](format.raw/*77.49*/("""
                                            """),format.raw/*78.45*/("""<td>-</td>
                                        """)))}),format.raw/*79.42*/("""
                                    """),format.raw/*80.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">Preferred Expertise</th>
                                        """),_display_(/*83.42*/if(job.getPreferredExpertise!="null" && job.getPreferredExpertise != "")/*83.114*/ {_display_(Seq[Any](format.raw/*83.116*/("""
                                            """),format.raw/*84.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*84.81*/job/*84.84*/.getPreferredExpertise),format.raw/*84.106*/("""</td>
                                        """)))}/*85.43*/else/*85.48*/{_display_(Seq[Any](format.raw/*85.49*/("""
                                            """),format.raw/*86.45*/("""<td>-</td>
                                        """)))}),format.raw/*87.42*/("""
                                    """),format.raw/*88.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">Location</th>
                                        """),_display_(/*91.42*/if(job.getLocation!="null" && job.getLocation != "")/*91.94*/ {_display_(Seq[Any](format.raw/*91.96*/("""
                                            """),format.raw/*92.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*92.81*/job/*92.84*/.getLocation),format.raw/*92.96*/("""</td>
                                        """)))}/*93.43*/else/*93.48*/{_display_(Seq[Any](format.raw/*93.49*/("""
                                            """),format.raw/*94.45*/("""<td>-</td>
                                        """)))}),format.raw/*95.42*/("""
                                    """),format.raw/*96.37*/("""</tr>

                                    <tr>
                                        <th style="max-width: 50px">Salary Range</th>
                                        <td style="word-wtap: break-word;">
                                            """),_display_(/*101.46*/if(job.getMinSalary!="null" && job.getMinSalary != "" )/*101.101*/ {_display_(Seq[Any](format.raw/*101.103*/("""
                                                """),_display_(/*102.50*/job/*102.53*/.getMinSalary),format.raw/*102.66*/("""
                                            """)))}/*103.47*/else/*103.52*/{_display_(Seq[Any](format.raw/*103.53*/("""
                                                """),format.raw/*104.49*/("""N/A
                                            """)))}),format.raw/*105.46*/("""
                                        """),format.raw/*106.41*/("""-
                                            """),_display_(/*107.46*/if(job.getMaxSalary!="null" && job.getMaxSalary != "" )/*107.101*/ {_display_(Seq[Any](format.raw/*107.103*/("""
                                                """),_display_(/*108.50*/job/*108.53*/.getMaxSalary),format.raw/*108.66*/("""
                                            """)))}/*109.47*/else/*109.52*/{_display_(Seq[Any](format.raw/*109.53*/("""
                                                """),format.raw/*110.49*/("""N/A
                                            """)))}),format.raw/*111.46*/("""
                                        """),format.raw/*112.41*/("""</td>
                                    </tr>

                                    <tr>
                                        <th style="max-width: 50px">Job URL</th>
                                        """),_display_(/*117.42*/if(job.getUrl!="null" && job.getUrl != "")/*117.84*/ {_display_(Seq[Any](format.raw/*117.86*/("""
                                            """),format.raw/*118.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*118.81*/job/*118.84*/.getUrl),format.raw/*118.91*/("""</td>
                                        """)))}/*119.43*/else/*119.48*/{_display_(Seq[Any](format.raw/*119.49*/("""
                                            """),format.raw/*120.45*/("""<td>-</td>
                                        """)))}),format.raw/*121.42*/("""
                                    """),format.raw/*122.37*/("""</tr>

                                    <tr>
                                        <th style="max-width: 50px">Job Publisher</th>
                                        """),_display_(/*126.42*/if(job.getJobPublisher!="null" && job.getJobPublisher != "")/*126.102*/ {_display_(Seq[Any](format.raw/*126.104*/("""
                                            """),format.raw/*127.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*127.81*/job/*127.84*/.getJobPublisher.getUserName),format.raw/*127.112*/("""</td>
                                        """)))}/*128.43*/else/*128.48*/{_display_(Seq[Any](format.raw/*128.49*/("""
                                            """),format.raw/*129.45*/("""<td>-</td>
                                        """)))}),format.raw/*130.42*/("""
                                    """),format.raw/*131.37*/("""</tr>
                                    """),format.raw/*146.39*/("""
                                    """),_display_(/*147.38*/if(jobDocument)/*147.53*/ {_display_(Seq[Any](format.raw/*147.55*/("""
                                        """),format.raw/*148.41*/("""<tr>
                                            <th style="max-width: 50px">Job Document</th>
                                            <td style="word-wrap: break-word;">
                                                <a href="javascript:void(0);"
                                                data-url=""""),_display_(/*152.60*/routes/*152.66*/.FileController.getFile(tableName, jobFileType, tableRecorderId)),format.raw/*152.130*/(""""
                                                class="blue-text text-darken-3"
                                                onclick="openAndCheckNewTabUrl(this)">
                                                    Download Job Document
                                                </a>
                                            </td>
                                        </tr>
                                    """)))}),format.raw/*159.38*/("""
                                """),format.raw/*160.33*/("""</tbody>
                            </table>
                        </div>
                    </div>
                    <div class="row center">
                        """),_display_(/*165.26*/if(userTypes == "0")/*165.46*/ {_display_(Seq[Any](format.raw/*165.48*/("""
                            """),format.raw/*166.29*/("""<a href=""""),_display_(/*166.39*/routes/*166.45*/.AdminController.jobManagement(1, "id")),format.raw/*166.84*/("""" class="btn waves-effect waves-light blue darken-2">
                                back to job management
                            </a>
                        """)))}),format.raw/*169.26*/("""
                        """),_display_(/*170.26*/if((userTypes == "1" && job.getJobPublisher().getId().equals(userId)) || userTypes == "0")/*170.116*/ {_display_(Seq[Any](format.raw/*170.118*/("""
                            """),format.raw/*171.29*/("""<a href=""""),_display_(/*171.39*/routes/*171.45*/.JobController.jobEditPage(job.getId)),format.raw/*171.82*/("""" class="btn waves-effect waves-light blue darken-2">
                                Edit Job Info
                            </a>
                        """)))}),format.raw/*174.26*/("""
                        """),format.raw/*175.25*/("""<a href=""""),_display_(/*175.35*/routes/*175.41*/.JobController.jobList(1, "id")),format.raw/*175.72*/("""" class="btn waves-effect waves-light blue darken-2">
                            Back to Job List</a>
                        """),_display_(/*177.26*/if(userTypes == "4" || ( userTypes == "1" && !job.getjobApplicationIdList.contains(userId) && !job.getJobPublisher().getId().equals(userId)) || userTypes == "0")/*177.187*/ {_display_(Seq[Any](format.raw/*177.189*/("""
                            """),format.raw/*178.29*/("""<a href=""""),_display_(/*178.39*/routes/*178.45*/.JobController.jobApplyPage(job.getId)),format.raw/*178.83*/("""" class="btn waves-effect waves-light green darken-2">
                                Apply Job
                            </a>
                        """)))}),format.raw/*181.26*/("""
                    """),format.raw/*182.21*/("""</div>
                </div>
            </div>
        </div>
    </div>

    <script>
            function openAndCheckNewTabUrl(link) """),format.raw/*189.50*/("""{"""),format.raw/*189.51*/("""const url = link.getAttribute('data-url');

                fetch(url, """),format.raw/*191.28*/("""{"""),format.raw/*191.29*/(""" """),format.raw/*191.30*/("""method: 'HEAD' """),format.raw/*191.45*/("""}"""),format.raw/*191.46*/(""").then(response => """),format.raw/*191.65*/("""{"""),format.raw/*191.66*/("""
                    """),format.raw/*192.21*/("""if (response.ok) """),format.raw/*192.38*/("""{"""),format.raw/*192.39*/("""
                        """),format.raw/*193.25*/("""const newTab = window.open(url, '_blank');
                        if (!newTab) """),format.raw/*194.38*/("""{"""),format.raw/*194.39*/("""
                            """),format.raw/*195.29*/("""alert("Please allow pop-ups in your browser to view this file.");
                        """),format.raw/*196.25*/("""}"""),format.raw/*196.26*/("""
                    """),format.raw/*197.21*/("""}"""),format.raw/*197.22*/(""" """),format.raw/*197.23*/("""else """),format.raw/*197.28*/("""{"""),format.raw/*197.29*/("""
                        """),format.raw/*198.25*/("""alert("The user did not upload this file");
                    """),format.raw/*199.21*/("""}"""),format.raw/*199.22*/("""
                """),format.raw/*200.17*/("""}"""),format.raw/*200.18*/(""")
                        .catch(error => """),format.raw/*201.41*/("""{"""),format.raw/*201.42*/("""
                            """),format.raw/*202.29*/("""console.error("Error checking the URL:", error);
                            alert("Failed to check the file. Please try again later.");
                        """),format.raw/*204.25*/("""}"""),format.raw/*204.26*/(""");
            """),format.raw/*205.13*/("""}"""),format.raw/*205.14*/("""
    """),format.raw/*206.5*/("""</script>
""")))}))
      }
    }
  }

  def render(job:Job,userId:Long,userTypes:String,tableName:String,jobFileType:String,tableRecorderId:String,backendPort:String,jobDocument:Boolean): play.twirl.api.HtmlFormat.Appendable = apply(job,userId,userTypes,tableName,jobFileType,tableRecorderId,backendPort,jobDocument)

  def f:((Job,Long,String,String,String,String,String,Boolean) => play.twirl.api.HtmlFormat.Appendable) = (job,userId,userTypes,tableName,jobFileType,tableRecorderId,backendPort,jobDocument) => apply(job,userId,userTypes,tableName,jobFileType,tableRecorderId,backendPort,jobDocument)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:32 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/jobDetail.scala.html
                  HASH: c24cab1f3749f7b6b64ba39059a517fa3c2e0cfc
                  MATRIX: 814->1|1211->46|1435->200|1481->197|1509->216|1536->218|1563->237|1602->239|1633->244|1831->415|1843->418|1873->427|2110->637|2125->643|2176->672|2889->1358|2901->1361|2931->1370|3180->1592|3250->1652|3291->1654|3364->1699|3427->1735|3439->1738|3477->1754|3543->1802|3556->1807|3595->1808|3668->1853|3751->1905|3816->1942|4011->2110|4066->2156|4106->2158|4179->2203|4242->2239|4254->2242|4284->2251|4350->2299|4363->2304|4402->2305|4475->2350|4558->2402|4623->2439|4829->2618|4907->2686|4948->2688|5021->2733|5084->2769|5096->2772|5138->2792|5204->2840|5217->2845|5256->2846|5329->2891|5412->2943|5477->2980|5682->3158|5758->3224|5799->3226|5872->3271|5935->3307|5947->3310|5988->3329|6054->3377|6067->3382|6106->3383|6179->3428|6262->3480|6327->3517|6522->3685|6579->3733|6619->3735|6692->3780|6755->3816|6767->3819|6798->3829|6864->3877|6877->3882|6916->3883|6989->3928|7072->3980|7137->4017|7344->4197|7424->4267|7465->4269|7538->4314|7601->4350|7613->4353|7656->4374|7722->4422|7735->4427|7774->4428|7847->4473|7930->4525|7995->4562|8203->4743|8285->4815|8326->4817|8399->4862|8462->4898|8474->4901|8518->4923|8584->4971|8597->4976|8636->4977|8709->5022|8792->5074|8857->5111|9054->5281|9115->5333|9155->5335|9228->5380|9291->5416|9303->5419|9336->5431|9402->5479|9415->5484|9454->5485|9527->5530|9610->5582|9675->5619|9958->5874|10024->5929|10066->5931|10144->5981|10157->5984|10192->5997|10258->6044|10272->6049|10312->6050|10390->6099|10471->6148|10541->6189|10616->6236|10682->6291|10724->6293|10802->6343|10815->6346|10850->6359|10916->6406|10930->6411|10970->6412|11048->6461|11129->6510|11199->6551|11439->6763|11491->6805|11532->6807|11606->6852|11670->6888|11683->6891|11712->6898|11779->6946|11793->6951|11833->6952|11907->6997|11991->7049|12057->7086|12261->7262|12332->7322|12374->7324|12448->7369|12512->7405|12525->7408|12576->7436|12643->7484|12657->7489|12697->7490|12771->7535|12855->7587|12921->7624|12992->8536|13058->8574|13083->8589|13124->8591|13194->8632|13534->8944|13550->8950|13637->9014|14098->9443|14160->9476|14362->9650|14392->9670|14433->9672|14491->9701|14529->9711|14545->9717|14606->9756|14805->9923|14859->9949|14960->10039|15002->10041|15060->10070|15098->10080|15114->10086|15173->10123|15363->10281|15417->10306|15455->10316|15471->10322|15524->10353|15680->10481|15852->10642|15894->10644|15952->10673|15990->10683|16006->10689|16066->10727|16253->10882|16303->10903|16470->11041|16500->11042|16600->11113|16630->11114|16660->11115|16704->11130|16734->11131|16782->11150|16812->11151|16862->11172|16908->11189|16938->11190|16992->11215|17101->11295|17131->11296|17189->11325|17308->11415|17338->11416|17388->11437|17418->11438|17448->11439|17482->11444|17512->11445|17566->11470|17659->11534|17689->11535|17735->11552|17765->11553|17836->11595|17866->11596|17924->11625|18114->11786|18144->11787|18188->11802|18218->11803|18251->11808
                  LINES: 31->1|36->2|39->4|42->2|44->5|45->6|45->6|45->6|46->7|51->12|51->12|51->12|56->17|56->17|56->17|68->29|68->29|68->29|73->34|73->34|73->34|74->35|74->35|74->35|74->35|75->36|75->36|75->36|76->37|77->38|78->39|82->43|82->43|82->43|83->44|83->44|83->44|83->44|84->45|84->45|84->45|85->46|86->47|87->48|90->51|90->51|90->51|91->52|91->52|91->52|91->52|92->53|92->53|92->53|93->54|94->55|95->56|98->59|98->59|98->59|99->60|99->60|99->60|99->60|100->61|100->61|100->61|101->62|102->63|103->64|106->67|106->67|106->67|107->68|107->68|107->68|107->68|108->69|108->69|108->69|109->70|110->71|111->72|114->75|114->75|114->75|115->76|115->76|115->76|115->76|116->77|116->77|116->77|117->78|118->79|119->80|122->83|122->83|122->83|123->84|123->84|123->84|123->84|124->85|124->85|124->85|125->86|126->87|127->88|130->91|130->91|130->91|131->92|131->92|131->92|131->92|132->93|132->93|132->93|133->94|134->95|135->96|140->101|140->101|140->101|141->102|141->102|141->102|142->103|142->103|142->103|143->104|144->105|145->106|146->107|146->107|146->107|147->108|147->108|147->108|148->109|148->109|148->109|149->110|150->111|151->112|156->117|156->117|156->117|157->118|157->118|157->118|157->118|158->119|158->119|158->119|159->120|160->121|161->122|165->126|165->126|165->126|166->127|166->127|166->127|166->127|167->128|167->128|167->128|168->129|169->130|170->131|171->146|172->147|172->147|172->147|173->148|177->152|177->152|177->152|184->159|185->160|190->165|190->165|190->165|191->166|191->166|191->166|191->166|194->169|195->170|195->170|195->170|196->171|196->171|196->171|196->171|199->174|200->175|200->175|200->175|200->175|202->177|202->177|202->177|203->178|203->178|203->178|203->178|206->181|207->182|214->189|214->189|216->191|216->191|216->191|216->191|216->191|216->191|216->191|217->192|217->192|217->192|218->193|219->194|219->194|220->195|221->196|221->196|222->197|222->197|222->197|222->197|222->197|223->198|224->199|224->199|225->200|225->200|226->201|226->201|227->202|229->204|229->204|230->205|230->205|231->206
                  -- GENERATED --
              */
          