
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

object challengeApplicationDetail extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template9[ChallengeApplication,String,String,String,String,String,String,Boolean,Boolean,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(challengeApplication: ChallengeApplication,
        userTypes: String,
        tableName: String,
        resumeFileType: String,
        coverFileType: String,
        tableRecorderId: String,
        backendPort: String,
        resume: Boolean,
        coverLetter: Boolean):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*12.2*/import helper._


Seq[Any](format.raw/*10.30*/("""

"""),format.raw/*13.1*/("""
"""),_display_(/*14.2*/main("ChallengeApplication Profile")/*14.38*/ {_display_(Seq[Any](format.raw/*14.40*/("""
    """),format.raw/*15.5*/("""<div class="container">
        <div class="row">
            <div class="col s12">
                <div class="card-panel">
                    <h4 class="center">Challenge Application Detail Page</h4>

                    <div class="row">
                        <div class="col s12">
                            <table class="striped responsive-table">
                                <tbody>
                                    <tr>
                                        <th style="max-width: 50px">Challenge Name</th>
                                        <td style="word-wrap: break-word;">
                                        """),_display_(/*28.42*/challengeApplication/*28.62*/.getAppliedChallenge.getChallengeTitle),format.raw/*28.100*/("""
                                        """),format.raw/*29.41*/("""</td>
                                    </tr>

                                    <tr>
                                        <th style="max-width: 50px">Applicant Name</th>
                                        """),_display_(/*34.42*/if(challengeApplication.getApplicant != null && StringUtils.isNotBlank(challengeApplication.getApplicant.getUserName))/*34.160*/ {_display_(Seq[Any](format.raw/*34.162*/("""
                                            """),format.raw/*35.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*35.81*/challengeApplication/*35.101*/.getApplicant.getUserName),format.raw/*35.126*/("""</td>
                                        """)))}/*36.43*/else/*36.48*/{_display_(Seq[Any](format.raw/*36.49*/("""
                                            """),format.raw/*37.45*/("""<td>-</td>
                                        """)))}),format.raw/*38.42*/("""
                                    """),format.raw/*39.37*/("""</tr>

                                    <tr>
                                        <th style="max-width: 50px">Apply Headline</th>
                                        """),_display_(/*43.42*/if(StringUtils.isNotBlank(challengeApplication.getApplyHeadline))/*43.107*/ {_display_(Seq[Any](format.raw/*43.109*/("""
                                            """),format.raw/*44.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*44.81*/challengeApplication/*44.101*/.getApplyHeadline),format.raw/*44.118*/("""</td>
                                        """)))}/*45.43*/else/*45.48*/{_display_(Seq[Any](format.raw/*45.49*/("""
                                            """),format.raw/*46.45*/("""<td>-</td>
                                        """)))}),format.raw/*47.42*/("""
                                    """),format.raw/*48.37*/("""</tr>

                                    <tr>
                                        <th style="max-width: 50px">Cover Letter</th>
                                        """),_display_(/*52.42*/if(StringUtils.isNotBlank(challengeApplication.getApplyCoverLetter))/*52.110*/ {_display_(Seq[Any](format.raw/*52.112*/("""
                                            """),format.raw/*53.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*53.81*/challengeApplication/*53.101*/.getApplyCoverLetter),format.raw/*53.121*/("""</td>
                                        """)))}/*54.43*/else/*54.48*/{_display_(Seq[Any](format.raw/*54.49*/("""
                                            """),format.raw/*55.45*/("""<td>-</td>
                                        """)))}),format.raw/*56.42*/("""
                                    """),format.raw/*57.37*/("""</tr>
                                    """),_display_(/*58.38*/if(resume)/*58.48*/ {_display_(Seq[Any](format.raw/*58.50*/("""
                                        """),format.raw/*59.41*/("""<tr>
                                            <th style="max-width: 50px">Resume PDF</th>
                                            <td style="word-wrap: break-word;">
                                                <a href="javascript:void(0);"
                                                data-url=""""),_display_(/*63.60*/routes/*63.66*/.FileController.getFile(tableName, resumeFileType, tableRecorderId)),format.raw/*63.133*/(""""
                                                class="blue-text text-darken-3"
                                                onclick="openAndCheckNewTabUrl(this)">
                                                    Download Resume
                                                </a>
                                            </td>
                                        </tr>
                                    """)))}),format.raw/*70.38*/("""
                                    """),_display_(/*71.38*/if(coverLetter)/*71.53*/ {_display_(Seq[Any](format.raw/*71.55*/("""
                                        """),format.raw/*72.41*/("""<tr>
                                            <th style="max-width: 50px">Cover Letter PDF</th>
                                            <td style="word-wrap: break-word;">
                                                <a href="javascript:void(0);"
                                                data-url=""""),_display_(/*76.60*/routes/*76.66*/.FileController.getFile(tableName, coverFileType, tableRecorderId)),format.raw/*76.132*/(""""
                                                class="blue-text text-darken-3"
                                                onclick="openAndCheckNewTabUrl(this)">
                                                    Download Cover Letter
                                                </a>
                                            </td>
                                        </tr>
                                    """)))}),format.raw/*83.38*/("""
                                """),format.raw/*84.33*/("""</tbody>
                            </table>
                        </div>
                    </div>

                    <div class="row center">
                        <form class="form-signin" enctype="multipart/form-data" id="editTechnologyForm" method="post" onsubmit="return getHTML()"
                        action=""""),_display_(/*91.34*/routes/*91.40*/.ChallengeController.challengeApplicationStatusChange(challengeApplication.getId, "pending")),format.raw/*91.132*/("""">
                            """),_display_(/*92.30*/if(userTypes == "2" && challengeApplication.getAppliedChallenge.getStatus() !="closed" )/*92.118*/ {_display_(Seq[Any](format.raw/*92.120*/("""
                                """),format.raw/*93.33*/("""<button type="submit" id="challengeOffer" class="btn waves-effect waves-light blue darken-2">
                                    Offer</button>
                            """)))}),format.raw/*95.30*/("""
                            """),_display_(/*96.30*/if(userTypes == "2")/*96.50*/ {_display_(Seq[Any](format.raw/*96.52*/("""
                                """),format.raw/*97.33*/("""<a href=""""),_display_(/*97.43*/routes/*97.49*/.ChallengeController.challengeApplicationsList("challenge", challengeApplication.getAppliedChallenge.getId, 1, "id")),format.raw/*97.165*/(""""
                                class="btn waves-effect waves-light green darken-2">
                                    Cancel
                                </a>
                            """)))}),format.raw/*101.30*/("""
                            """),_display_(/*102.30*/if(userTypes == "1")/*102.50*/ {_display_(Seq[Any](format.raw/*102.52*/("""
                                """),format.raw/*103.33*/("""<a href=""""),_display_(/*103.43*/routes/*103.49*/.ChallengeController.challengeListAppliedByUser(1)),format.raw/*103.99*/("""" class="btn waves-effect waves-light blue darken-2">
                                    Back to Applied Challenge List</a>
                            """)))}),format.raw/*105.30*/("""
                            """),_display_(/*106.30*/if(userTypes == "4")/*106.50*/ {_display_(Seq[Any](format.raw/*106.52*/("""
                               """),format.raw/*107.32*/("""<a href=""""),_display_(/*107.42*/routes/*107.48*/.ChallengeController.challengeApplicationsList("challenge", challengeApplication.getAppliedChallenge.getId, 1, "id")),format.raw/*107.164*/("""" class="btn waves-effect waves-light blue darken-2">
"""),format.raw/*108.155*/("""
                                    """),format.raw/*109.37*/("""Back to Challenge Applications List</a>
                            """)))}),format.raw/*110.30*/("""

                        """),format.raw/*112.25*/("""</form>
                    </div>

                </div>
            </div>
        </div>
    </div>

    <script>
        function openAndCheckNewTabUrl(link) """),format.raw/*121.46*/("""{"""),format.raw/*121.47*/("""const url = link.getAttribute('data-url');

            fetch(url, """),format.raw/*123.24*/("""{"""),format.raw/*123.25*/(""" """),format.raw/*123.26*/("""method: 'HEAD' """),format.raw/*123.41*/("""}"""),format.raw/*123.42*/(""").then(response => """),format.raw/*123.61*/("""{"""),format.raw/*123.62*/("""
                """),format.raw/*124.17*/("""if (response.ok) """),format.raw/*124.34*/("""{"""),format.raw/*124.35*/("""
                    """),format.raw/*125.21*/("""const newTab = window.open(url, '_blank');
                    if (!newTab) """),format.raw/*126.34*/("""{"""),format.raw/*126.35*/("""
                        """),format.raw/*127.25*/("""alert("Please allow pop-ups in your browser to view this file.");
                    """),format.raw/*128.21*/("""}"""),format.raw/*128.22*/("""
                """),format.raw/*129.17*/("""}"""),format.raw/*129.18*/(""" """),format.raw/*129.19*/("""else """),format.raw/*129.24*/("""{"""),format.raw/*129.25*/("""
                    """),format.raw/*130.21*/("""alert("The user did not upload this file");
                """),format.raw/*131.17*/("""}"""),format.raw/*131.18*/("""
            """),format.raw/*132.13*/("""}"""),format.raw/*132.14*/(""")
            .catch(error => """),format.raw/*133.29*/("""{"""),format.raw/*133.30*/("""
                """),format.raw/*134.17*/("""console.error("Error checking the URL:", error);
                alert("Failed to check the file. Please try again later.");
            """),format.raw/*136.13*/("""}"""),format.raw/*136.14*/(""");
        """),format.raw/*137.9*/("""}"""),format.raw/*137.10*/("""
    """),format.raw/*138.5*/("""</script>
""")))}),format.raw/*139.2*/("""
"""))
      }
    }
  }

  def render(challengeApplication:ChallengeApplication,userTypes:String,tableName:String,resumeFileType:String,coverFileType:String,tableRecorderId:String,backendPort:String,resume:Boolean,coverLetter:Boolean): play.twirl.api.HtmlFormat.Appendable = apply(challengeApplication,userTypes,tableName,resumeFileType,coverFileType,tableRecorderId,backendPort,resume,coverLetter)

  def f:((ChallengeApplication,String,String,String,String,String,String,Boolean,Boolean) => play.twirl.api.HtmlFormat.Appendable) = (challengeApplication,userTypes,tableName,resumeFileType,coverFileType,tableRecorderId,backendPort,resume,coverLetter) => apply(challengeApplication,userTypes,tableName,resumeFileType,coverFileType,tableRecorderId,backendPort,resume,coverLetter)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:30 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/challengeApplicationDetail.scala.html
                  HASH: 2a7897be930b722f524b7bdb716fe0e8f17b8604
                  MATRIX: 814->1|1255->46|1607->327|1653->324|1682->343|1710->345|1755->381|1795->383|1827->388|2497->1031|2526->1051|2586->1089|2655->1130|2901->1349|3029->1467|3070->1469|3143->1514|3206->1550|3236->1570|3283->1595|3349->1643|3362->1648|3401->1649|3474->1694|3557->1746|3622->1783|3826->1960|3901->2025|3942->2027|4015->2072|4078->2108|4108->2128|4147->2145|4213->2193|4226->2198|4265->2199|4338->2244|4421->2296|4486->2333|4688->2508|4766->2576|4807->2578|4880->2623|4943->2659|4973->2679|5015->2699|5081->2747|5094->2752|5133->2753|5206->2798|5289->2850|5354->2887|5424->2930|5443->2940|5483->2942|5552->2983|5889->3293|5904->3299|5993->3366|6447->3789|6512->3827|6536->3842|6576->3844|6645->3885|6988->4201|7003->4207|7091->4273|7551->4702|7612->4735|7968->5064|7983->5070|8097->5162|8156->5194|8254->5282|8295->5284|8356->5317|8561->5491|8618->5521|8647->5541|8687->5543|8748->5576|8785->5586|8800->5592|8938->5708|9166->5904|9224->5934|9254->5954|9295->5956|9357->5989|9395->5999|9411->6005|9483->6055|9669->6209|9727->6239|9757->6259|9798->6261|9859->6293|9897->6303|9913->6309|10052->6425|10136->6633|10202->6670|10303->6739|10358->6765|10550->6928|10580->6929|10676->6996|10706->6997|10736->6998|10780->7013|10810->7014|10858->7033|10888->7034|10934->7051|10980->7068|11010->7069|11060->7090|11165->7166|11195->7167|11249->7192|11364->7278|11394->7279|11440->7296|11470->7297|11500->7298|11534->7303|11564->7304|11614->7325|11703->7385|11733->7386|11775->7399|11805->7400|11864->7430|11894->7431|11940->7448|12106->7585|12136->7586|12175->7597|12205->7598|12238->7603|12280->7614
                  LINES: 31->1|36->2|47->12|50->10|52->13|53->14|53->14|53->14|54->15|67->28|67->28|67->28|68->29|73->34|73->34|73->34|74->35|74->35|74->35|74->35|75->36|75->36|75->36|76->37|77->38|78->39|82->43|82->43|82->43|83->44|83->44|83->44|83->44|84->45|84->45|84->45|85->46|86->47|87->48|91->52|91->52|91->52|92->53|92->53|92->53|92->53|93->54|93->54|93->54|94->55|95->56|96->57|97->58|97->58|97->58|98->59|102->63|102->63|102->63|109->70|110->71|110->71|110->71|111->72|115->76|115->76|115->76|122->83|123->84|130->91|130->91|130->91|131->92|131->92|131->92|132->93|134->95|135->96|135->96|135->96|136->97|136->97|136->97|136->97|140->101|141->102|141->102|141->102|142->103|142->103|142->103|142->103|144->105|145->106|145->106|145->106|146->107|146->107|146->107|146->107|147->108|148->109|149->110|151->112|160->121|160->121|162->123|162->123|162->123|162->123|162->123|162->123|162->123|163->124|163->124|163->124|164->125|165->126|165->126|166->127|167->128|167->128|168->129|168->129|168->129|168->129|168->129|169->130|170->131|170->131|171->132|171->132|172->133|172->133|173->134|175->136|175->136|176->137|176->137|177->138|178->139
                  -- GENERATED --
              */
          