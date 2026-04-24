
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

object jobApplicationDetail extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template13[JobApplication,String,String,String,String,String,String,String,String,Boolean,Boolean,Boolean,Boolean,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(jobApplication: JobApplication, userId: String, tableName: String, resumeFileType: String, coverLetterFileType: String, transcriptFileType: String, degreeCertificateFileType: String, tableRecorderId: String, backendPort: String, resume: Boolean, coverLetter: Boolean, transcript: Boolean, degreeCertificate: Boolean):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import helper._


Seq[Any](format.raw/*2.319*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("JobApplication Profile")/*6.32*/ {_display_(Seq[Any](format.raw/*6.34*/("""
    """),format.raw/*7.5*/("""<div class="container">
        <div class="row">
            <div class="col s12">
                <div class="card-panel">
                    <h4 class="center">Job Application Detail Page</h4>

                    <div class="row">
"""),format.raw/*14.49*/("""
"""),format.raw/*15.53*/("""
"""),format.raw/*16.163*/("""
"""),format.raw/*17.61*/("""
"""),format.raw/*18.60*/("""
"""),format.raw/*19.54*/("""
"""),format.raw/*20.54*/("""
"""),format.raw/*21.39*/("""
"""),format.raw/*22.35*/("""
                        """),format.raw/*23.25*/("""<div class="col s12">
                            <table class="striped responsive-table">
                                <tr>
                                    <tr>
                                        <th style="max-width: 50px">Job Name</th>
                                        <td style="word-wrap: break-word;">"""),_display_(/*28.77*/jobApplication/*28.91*/.getAppliedJob.getTitle),format.raw/*28.114*/("""</td>
                                    </tr>

                                    <tr>
                                        <th style="max-width: 50px">Applicant Name</th>
                                        """),_display_(/*33.42*/if(jobApplication.getApplicant!="null" && jobApplication.getApplicant != "")/*33.118*/ {_display_(Seq[Any](format.raw/*33.120*/("""
                                            """),format.raw/*34.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*34.81*/jobApplication/*34.95*/.getApplicant.getUserName),format.raw/*34.120*/("""</td>
                                        """)))}/*35.43*/else/*35.48*/{_display_(Seq[Any](format.raw/*35.49*/("""
                                            """),format.raw/*36.45*/("""<td>-</td>
                                        """)))}),format.raw/*37.42*/("""
                                    """),format.raw/*38.37*/("""</tr>

                                    <tr>
                                        <th style="max-width: 50px">Apply Headline</th>
                                        """),_display_(/*42.42*/if(jobApplication.getApplyHeadline!="null" && jobApplication.getApplyHeadline != "")/*42.126*/ {_display_(Seq[Any](format.raw/*42.128*/("""
                                            """),format.raw/*43.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*43.81*/jobApplication/*43.95*/.getApplyHeadline),format.raw/*43.112*/("""</td>
                                        """)))}/*44.43*/else/*44.48*/{_display_(Seq[Any](format.raw/*44.49*/("""
                                            """),format.raw/*45.45*/("""<td>-</td>
                                        """)))}),format.raw/*46.42*/("""
                                    """),format.raw/*47.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">Cover Letter</th>
                                        """),_display_(/*50.42*/if(jobApplication.getApplyCoverLetter!="null" && jobApplication.getApplyCoverLetter != "")/*50.132*/ {_display_(Seq[Any](format.raw/*50.134*/("""
                                            """),format.raw/*51.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*51.81*/jobApplication/*51.95*/.getApplyCoverLetter),format.raw/*51.115*/("""</td>
                                        """)))}/*52.43*/else/*52.48*/{_display_(Seq[Any](format.raw/*52.49*/("""
                                            """),format.raw/*53.45*/("""<td>-</td>
                                        """)))}),format.raw/*54.42*/("""
                                    """),format.raw/*55.37*/("""</tr>

                                    <tr>

                                        <th style="max-width: 50px">Referee1 Name</th>
                                        """),_display_(/*60.42*/if(jobApplication.getReferee1Title!="null" && jobApplication.getReferee1Title!= "" && jobApplication.getReferee1FirstName!="null" && jobApplication.getReferee1FirstName != "" && jobApplication.getReferee1LastName!="null" && jobApplication.getReferee1LastName != "")/*60.307*/ {_display_(Seq[Any](format.raw/*60.309*/("""
                                            """),format.raw/*61.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*61.81*/jobApplication/*61.95*/.getReferee1Title),format.raw/*61.112*/(""". """),_display_(/*61.115*/jobApplication/*61.129*/.getReferee1FirstName),format.raw/*61.150*/(""" """),_display_(/*61.152*/jobApplication/*61.166*/.getReferee1LastName),format.raw/*61.186*/("""</td>
                                        """)))}/*62.43*/else/*62.48*/{_display_(Seq[Any](format.raw/*62.49*/("""
                                            """),format.raw/*63.45*/("""<td>-</td>
                                        """)))}),format.raw/*64.42*/("""
                                    """),format.raw/*65.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">Email: </th>
                                        """),_display_(/*68.42*/if(jobApplication.getReferee1Email!="null" && jobApplication.getReferee1Email != "")/*68.126*/ {_display_(Seq[Any](format.raw/*68.128*/("""
                                            """),format.raw/*69.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*69.81*/jobApplication/*69.95*/.getReferee1Email),format.raw/*69.112*/("""</td>
                                        """)))}/*70.43*/else/*70.48*/{_display_(Seq[Any](format.raw/*70.49*/("""
                                            """),format.raw/*71.45*/("""<td>-</td>
                                        """)))}),format.raw/*72.42*/("""
                                    """),format.raw/*73.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">Phone: </th>
                                        """),_display_(/*76.42*/if(jobApplication.getReferee1Phone!="null" && jobApplication.getReferee1Phone != "")/*76.126*/ {_display_(Seq[Any](format.raw/*76.128*/("""
                                            """),format.raw/*77.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*77.81*/jobApplication/*77.95*/.getReferee1Phone),format.raw/*77.112*/("""</td>
                                        """)))}/*78.43*/else/*78.48*/{_display_(Seq[Any](format.raw/*78.49*/("""
                                            """),format.raw/*79.45*/("""<td>-</td>
                                        """)))}),format.raw/*80.42*/("""
                                    """),format.raw/*81.37*/("""</tr>


                                    <tr>
                                        <th style="max-width: 50px">Referee2 Name</th>
                                        """),_display_(/*86.42*/if(jobApplication.getReferee2Title!="null" && jobApplication.getReferee2Title!= "" && jobApplication.getReferee2FirstName!="null" && jobApplication.getReferee2FirstName != "" && jobApplication.getReferee2LastName!="null" && jobApplication.getReferee2LastName != "")/*86.307*/ {_display_(Seq[Any](format.raw/*86.309*/("""
                                            """),format.raw/*87.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*87.81*/jobApplication/*87.95*/.getReferee2Title),format.raw/*87.112*/(""". """),_display_(/*87.115*/jobApplication/*87.129*/.getReferee2FirstName),format.raw/*87.150*/(""" """),_display_(/*87.152*/jobApplication/*87.166*/.getReferee2LastName),format.raw/*87.186*/("""</td>
                                        """)))}/*88.43*/else/*88.48*/{_display_(Seq[Any](format.raw/*88.49*/("""
                                            """),format.raw/*89.45*/("""<td>-</td>
                                        """)))}),format.raw/*90.42*/("""
                                    """),format.raw/*91.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 25px">Email: </th>
                                        """),_display_(/*94.42*/if(jobApplication.getReferee2Email!="null" && jobApplication.getReferee2Email != "")/*94.126*/ {_display_(Seq[Any](format.raw/*94.128*/("""
                                            """),format.raw/*95.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*95.81*/jobApplication/*95.95*/.getReferee2Email),format.raw/*95.112*/("""</td>
                                        """)))}/*96.43*/else/*96.48*/{_display_(Seq[Any](format.raw/*96.49*/("""
                                            """),format.raw/*97.45*/("""<td>-</td>
                                        """)))}),format.raw/*98.42*/("""


                                    """),format.raw/*101.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 25px">Phone: </th>
                                        """),_display_(/*104.42*/if(jobApplication.getReferee2Phone!="null" && jobApplication.getReferee2Phone != "")/*104.126*/ {_display_(Seq[Any](format.raw/*104.128*/("""
                                            """),format.raw/*105.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*105.81*/jobApplication/*105.95*/.getReferee2Phone),format.raw/*105.112*/("""</td>
                                        """)))}/*106.43*/else/*106.48*/{_display_(Seq[Any](format.raw/*106.49*/("""
                                            """),format.raw/*107.45*/("""<td>-</td>
                                        """)))}),format.raw/*108.42*/("""
                                    """),format.raw/*109.37*/("""</tr>


                                    <tr>
                                        <th style="max-width: 50px">Referee3 Name</th>
                                        """),_display_(/*114.42*/if(jobApplication.getReferee3Title!="null" && jobApplication.getReferee3Title!= "" && jobApplication.getReferee3FirstName!="null" && jobApplication.getReferee3FirstName != "" && jobApplication.getReferee3LastName!="null" && jobApplication.getReferee3LastName != "")/*114.307*/ {_display_(Seq[Any](format.raw/*114.309*/("""
                                            """),format.raw/*115.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*115.81*/jobApplication/*115.95*/.getReferee3Title),format.raw/*115.112*/(""". """),_display_(/*115.115*/jobApplication/*115.129*/.getReferee3FirstName),format.raw/*115.150*/(""" """),_display_(/*115.152*/jobApplication/*115.166*/.getReferee3LastName),format.raw/*115.186*/("""</td>
                                        """)))}/*116.43*/else/*116.48*/{_display_(Seq[Any](format.raw/*116.49*/("""
                                            """),format.raw/*117.45*/("""<td>-</td>
                                        """)))}),format.raw/*118.42*/("""
                                    """),format.raw/*119.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">Email: </th>
                                        """),_display_(/*122.42*/if(jobApplication.getReferee3Email!="null" && jobApplication.getReferee3Email != "")/*122.126*/ {_display_(Seq[Any](format.raw/*122.128*/("""
                                            """),format.raw/*123.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*123.81*/jobApplication/*123.95*/.getReferee3Email),format.raw/*123.112*/("""</td>
                                        """)))}/*124.43*/else/*124.48*/{_display_(Seq[Any](format.raw/*124.49*/("""
                                            """),format.raw/*125.45*/("""<td>-</td>
                                        """)))}),format.raw/*126.42*/("""


                                    """),format.raw/*129.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">Phone: </th>
                                        """),_display_(/*132.42*/if(jobApplication.getReferee3Phone!="null" && jobApplication.getReferee3Phone != "")/*132.126*/ {_display_(Seq[Any](format.raw/*132.128*/("""
                                            """),format.raw/*133.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*133.81*/jobApplication/*133.95*/.getReferee3Phone),format.raw/*133.112*/("""</td>
                                        """)))}/*134.43*/else/*134.48*/{_display_(Seq[Any](format.raw/*134.49*/("""
                                            """),format.raw/*135.45*/("""<td>-</td>
                                        """)))}),format.raw/*136.42*/("""
                                    """),format.raw/*137.37*/("""</tr>
                                """),_display_(/*138.34*/if(resume)/*138.44*/ {_display_(Seq[Any](format.raw/*138.46*/("""
                                    """),format.raw/*139.37*/("""<tr>
                                        <th style="max-width: 50px">Resume Document</th>
                                        <td style="word-wrap: break-word;">
                                            <a href="javascript:void(0);"
                                            data-url=""""),_display_(/*143.56*/routes/*143.62*/.FileController.getFile(tableName, resumeFileType, tableRecorderId)),format.raw/*143.129*/(""""
                                            class="blue-text text-darken-3"
                                            onclick="openAndCheckNewTabUrl(this)">
                                                Download Resume Document
                                            </a>
                                        </td>
                                    </tr>
                                """)))}),format.raw/*150.34*/("""
                                """),_display_(/*151.34*/if(coverLetter)/*151.49*/ {_display_(Seq[Any](format.raw/*151.51*/("""
                                    """),format.raw/*152.37*/("""<tr>
                                        <th style="max-width: 50px">Cover Letter Document</th>
                                        <td style="word-wrap: break-word;">
                                            <a href="javascript:void(0);"
                                            data-url=""""),_display_(/*156.56*/routes/*156.62*/.FileController.getFile(tableName, coverLetterFileType, tableRecorderId)),format.raw/*156.134*/(""""
                                            class="blue-text text-darken-3"
                                            onclick="openAndCheckNewTabUrl(this)">
                                                Download Cover Letter Document
                                            </a>
                                        </td>
                                    </tr>
                                """)))}),format.raw/*163.34*/("""
                                """),_display_(/*164.34*/if(transcript)/*164.48*/ {_display_(Seq[Any](format.raw/*164.50*/("""
                                    """),format.raw/*165.37*/("""<tr>
                                        <th style="max-width: 50px">Transcript File</th>
                                        <td style="word-wrap: break-word;">
                                            <a href="javascript:void(0);"
                                            data-url=""""),_display_(/*169.56*/routes/*169.62*/.FileController.getFile(tableName, transcriptFileType, tableRecorderId)),format.raw/*169.133*/(""""
                                            class="blue-text text-darken-3"
                                            onclick="openAndCheckNewTabUrl(this)">
                                                Download Transcript File
                                            </a>
                                        </td>
                                    </tr>
                                """)))}),format.raw/*176.34*/("""
                                """),_display_(/*177.34*/if(degreeCertificate)/*177.55*/ {_display_(Seq[Any](format.raw/*177.57*/("""
                                    """),format.raw/*178.37*/("""<tr>
                                        <th style="max-width: 50px">Degree Certificate</th>
                                        <td style="word-wrap: break-word;">
                                            <a href="javascript:void(0);"
                                            data-url=""""),_display_(/*182.56*/routes/*182.62*/.FileController.getFile(tableName, degreeCertificateFileType, tableRecorderId)),format.raw/*182.140*/(""""
                                            class="blue-text text-darken-3"
                                            onclick="openAndCheckNewTabUrl(this)">
                                                Download Degree Certificate
                                            </a>
                                        </td>
                                    </tr>
                                """)))}),format.raw/*189.34*/("""

                                """),format.raw/*191.33*/("""</tbody>
                            </table>
                        </div>
                    </div>
                    <div class="row center">

                        <form class="form-signin" enctype="multipart/form-data" id="editTechnologyForm" method="post" onsubmit="return getHTML()" action=""""),_display_(/*197.156*/routes/*197.162*/.JobController.jobStatueChange(jobApplication.getAppliedJob.getId, "pending")),format.raw/*197.239*/("""">
                            """),_display_(/*198.30*/if(userId.toLong == jobApplication.getJobPublisher.getId())/*198.89*/ {_display_(Seq[Any](format.raw/*198.91*/("""
                                """),format.raw/*199.33*/("""<button type="submit" id="technologyRegister" class="btn waves-effect waves-light blue darken-2">
                                    Offer</button>
                            """)))}),format.raw/*201.30*/("""
"""),format.raw/*202.187*/("""
"""),format.raw/*203.47*/("""
                            """),_display_(/*204.30*/if(userId.toLong == jobApplication.getJobPublisher.getId())/*204.89*/ {_display_(Seq[Any](format.raw/*204.91*/("""
                            """),format.raw/*205.29*/("""<a href=""""),_display_(/*205.39*/routes/*205.45*/.JobController.jobApplicationsList("job", jobApplication.getAppliedJob.getId, 1, "id")),format.raw/*205.131*/("""" class="btn waves-effect waves-light green darken-2">
                                Cancel</a>
                            """)))}),format.raw/*207.30*/("""
                            """),_display_(/*208.30*/if(userId.toLong != jobApplication.getJobPublisher.getId())/*208.89*/ {_display_(Seq[Any](format.raw/*208.91*/("""
                                """),format.raw/*209.33*/("""<a href=""""),_display_(/*209.43*/routes/*209.49*/.JobController.jobListAppliedByUser(1)),format.raw/*209.87*/("""" class="btn waves-effect waves-light blue darken-2">
                                    Back to Applied Job List</a>
                            """)))}),format.raw/*211.30*/("""

                        """),format.raw/*213.25*/("""</form>
                    </div>
                </div>
            </div>
        </div>
    </div>


    <script>
            function openAndCheckNewTabUrl(link) """),format.raw/*222.50*/("""{"""),format.raw/*222.51*/("""const url = link.getAttribute('data-url');

                fetch(url, """),format.raw/*224.28*/("""{"""),format.raw/*224.29*/(""" """),format.raw/*224.30*/("""method: 'HEAD' """),format.raw/*224.45*/("""}"""),format.raw/*224.46*/(""").then(response => """),format.raw/*224.65*/("""{"""),format.raw/*224.66*/("""
                    """),format.raw/*225.21*/("""if (response.ok) """),format.raw/*225.38*/("""{"""),format.raw/*225.39*/("""
                        """),format.raw/*226.25*/("""const newTab = window.open(url, '_blank');
                        if (!newTab) """),format.raw/*227.38*/("""{"""),format.raw/*227.39*/("""
                            """),format.raw/*228.29*/("""alert("Please allow pop-ups in your browser to view this file.");
                        """),format.raw/*229.25*/("""}"""),format.raw/*229.26*/("""
                    """),format.raw/*230.21*/("""}"""),format.raw/*230.22*/(""" """),format.raw/*230.23*/("""else """),format.raw/*230.28*/("""{"""),format.raw/*230.29*/("""
                        """),format.raw/*231.25*/("""alert("The user did not upload this file");
                    """),format.raw/*232.21*/("""}"""),format.raw/*232.22*/("""
                """),format.raw/*233.17*/("""}"""),format.raw/*233.18*/(""")
                        .catch(error => """),format.raw/*234.41*/("""{"""),format.raw/*234.42*/("""
                            """),format.raw/*235.29*/("""console.error("Error checking the URL:", error);
                            alert("Failed to check the file. Please try again later.");
                        """),format.raw/*237.25*/("""}"""),format.raw/*237.26*/(""");
            """),format.raw/*238.13*/("""}"""),format.raw/*238.14*/("""
    """),format.raw/*239.5*/("""</script>

""")))}))
      }
    }
  }

  def render(jobApplication:JobApplication,userId:String,tableName:String,resumeFileType:String,coverLetterFileType:String,transcriptFileType:String,degreeCertificateFileType:String,tableRecorderId:String,backendPort:String,resume:Boolean,coverLetter:Boolean,transcript:Boolean,degreeCertificate:Boolean): play.twirl.api.HtmlFormat.Appendable = apply(jobApplication,userId,tableName,resumeFileType,coverLetterFileType,transcriptFileType,degreeCertificateFileType,tableRecorderId,backendPort,resume,coverLetter,transcript,degreeCertificate)

  def f:((JobApplication,String,String,String,String,String,String,String,String,Boolean,Boolean,Boolean,Boolean) => play.twirl.api.HtmlFormat.Appendable) = (jobApplication,userId,tableName,resumeFileType,coverLetterFileType,transcriptFileType,degreeCertificateFileType,tableRecorderId,backendPort,resume,coverLetter,transcript,degreeCertificate) => apply(jobApplication,userId,tableName,resumeFileType,coverLetterFileType,transcriptFileType,degreeCertificateFileType,tableRecorderId,backendPort,resume,coverLetter,transcript,degreeCertificate)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:32 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/jobApplicationDetail.scala.html
                  HASH: 3dae888055d69b9e47be34bc77d47f91a17d4ef2
                  MATRIX: 814->1|1274->46|1664->366|1710->363|1738->382|1765->384|1803->414|1842->416|1873->421|2137->705|2166->758|2196->921|2225->982|2254->1042|2283->1096|2312->1150|2341->1189|2370->1224|2423->1249|2777->1576|2800->1590|2845->1613|3091->1832|3177->1908|3218->1910|3291->1955|3354->1991|3377->2005|3424->2030|3490->2078|3503->2083|3542->2084|3615->2129|3698->2181|3763->2218|3967->2395|4061->2479|4102->2481|4175->2526|4238->2562|4261->2576|4300->2593|4366->2641|4379->2646|4418->2647|4491->2692|4574->2744|4639->2781|4840->2955|4940->3045|4981->3047|5054->3092|5117->3128|5140->3142|5182->3162|5248->3210|5261->3215|5300->3216|5373->3261|5456->3313|5521->3350|5725->3527|6000->3792|6041->3794|6114->3839|6177->3875|6200->3889|6239->3906|6270->3909|6294->3923|6337->3944|6367->3946|6391->3960|6433->3980|6499->4028|6512->4033|6551->4034|6624->4079|6707->4131|6772->4168|6968->4337|7062->4421|7103->4423|7176->4468|7239->4504|7262->4518|7301->4535|7367->4583|7380->4588|7419->4589|7492->4634|7575->4686|7640->4723|7836->4892|7930->4976|7971->4978|8044->5023|8107->5059|8130->5073|8169->5090|8235->5138|8248->5143|8287->5144|8360->5189|8443->5241|8508->5278|8712->5455|8987->5720|9028->5722|9101->5767|9164->5803|9187->5817|9226->5834|9257->5837|9281->5851|9324->5872|9354->5874|9378->5888|9420->5908|9486->5956|9499->5961|9538->5962|9611->6007|9694->6059|9759->6096|9955->6265|10049->6349|10090->6351|10163->6396|10226->6432|10249->6446|10288->6463|10354->6511|10367->6516|10406->6517|10479->6562|10562->6614|10630->6653|10827->6822|10922->6906|10964->6908|11038->6953|11102->6989|11126->7003|11166->7020|11233->7068|11247->7073|11287->7074|11361->7119|11445->7171|11511->7208|11716->7385|11992->7650|12034->7652|12108->7697|12172->7733|12196->7747|12236->7764|12268->7767|12293->7781|12337->7802|12368->7804|12393->7818|12436->7838|12503->7886|12517->7891|12557->7892|12631->7937|12715->7989|12781->8026|12978->8195|13073->8279|13115->8281|13189->8326|13253->8362|13277->8376|13317->8393|13384->8441|13398->8446|13438->8447|13512->8492|13596->8544|13664->8583|13861->8752|13956->8836|13998->8838|14072->8883|14136->8919|14160->8933|14200->8950|14267->8998|14281->9003|14321->9004|14395->9049|14479->9101|14545->9138|14612->9177|14632->9187|14673->9189|14739->9226|15066->9525|15082->9531|15172->9598|15608->10002|15670->10036|15695->10051|15736->10053|15802->10090|16135->10395|16151->10401|16246->10473|16688->10883|16750->10917|16774->10931|16815->10933|16881->10970|17208->11269|17224->11275|17318->11346|17754->11750|17816->11784|17847->11805|17888->11807|17954->11844|18284->12146|18300->12152|18401->12230|18840->12637|18903->12671|19237->12976|19254->12982|19354->13059|19414->13091|19483->13150|19524->13152|19586->13185|19796->13363|19827->13550|19857->13597|19915->13627|19984->13686|20025->13688|20083->13717|20121->13727|20137->13733|20246->13819|20405->13946|20463->13976|20532->14035|20573->14037|20635->14070|20673->14080|20689->14086|20749->14124|20929->14272|20984->14298|21180->14465|21210->14466|21310->14537|21340->14538|21370->14539|21414->14554|21444->14555|21492->14574|21522->14575|21572->14596|21618->14613|21648->14614|21702->14639|21811->14719|21841->14720|21899->14749|22018->14839|22048->14840|22098->14861|22128->14862|22158->14863|22192->14868|22222->14869|22276->14894|22369->14958|22399->14959|22445->14976|22475->14977|22546->15019|22576->15020|22634->15049|22824->15210|22854->15211|22898->15226|22928->15227|22961->15232
                  LINES: 31->1|36->2|39->4|42->2|44->5|45->6|45->6|45->6|46->7|53->14|54->15|55->16|56->17|57->18|58->19|59->20|60->21|61->22|62->23|67->28|67->28|67->28|72->33|72->33|72->33|73->34|73->34|73->34|73->34|74->35|74->35|74->35|75->36|76->37|77->38|81->42|81->42|81->42|82->43|82->43|82->43|82->43|83->44|83->44|83->44|84->45|85->46|86->47|89->50|89->50|89->50|90->51|90->51|90->51|90->51|91->52|91->52|91->52|92->53|93->54|94->55|99->60|99->60|99->60|100->61|100->61|100->61|100->61|100->61|100->61|100->61|100->61|100->61|100->61|101->62|101->62|101->62|102->63|103->64|104->65|107->68|107->68|107->68|108->69|108->69|108->69|108->69|109->70|109->70|109->70|110->71|111->72|112->73|115->76|115->76|115->76|116->77|116->77|116->77|116->77|117->78|117->78|117->78|118->79|119->80|120->81|125->86|125->86|125->86|126->87|126->87|126->87|126->87|126->87|126->87|126->87|126->87|126->87|126->87|127->88|127->88|127->88|128->89|129->90|130->91|133->94|133->94|133->94|134->95|134->95|134->95|134->95|135->96|135->96|135->96|136->97|137->98|140->101|143->104|143->104|143->104|144->105|144->105|144->105|144->105|145->106|145->106|145->106|146->107|147->108|148->109|153->114|153->114|153->114|154->115|154->115|154->115|154->115|154->115|154->115|154->115|154->115|154->115|154->115|155->116|155->116|155->116|156->117|157->118|158->119|161->122|161->122|161->122|162->123|162->123|162->123|162->123|163->124|163->124|163->124|164->125|165->126|168->129|171->132|171->132|171->132|172->133|172->133|172->133|172->133|173->134|173->134|173->134|174->135|175->136|176->137|177->138|177->138|177->138|178->139|182->143|182->143|182->143|189->150|190->151|190->151|190->151|191->152|195->156|195->156|195->156|202->163|203->164|203->164|203->164|204->165|208->169|208->169|208->169|215->176|216->177|216->177|216->177|217->178|221->182|221->182|221->182|228->189|230->191|236->197|236->197|236->197|237->198|237->198|237->198|238->199|240->201|241->202|242->203|243->204|243->204|243->204|244->205|244->205|244->205|244->205|246->207|247->208|247->208|247->208|248->209|248->209|248->209|248->209|250->211|252->213|261->222|261->222|263->224|263->224|263->224|263->224|263->224|263->224|263->224|264->225|264->225|264->225|265->226|266->227|266->227|267->228|268->229|268->229|269->230|269->230|269->230|269->230|269->230|270->231|271->232|271->232|272->233|272->233|273->234|273->234|274->235|276->237|276->237|277->238|277->238|278->239
                  -- GENERATED --
              */
          