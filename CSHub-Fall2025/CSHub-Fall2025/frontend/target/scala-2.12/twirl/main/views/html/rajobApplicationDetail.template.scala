
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

object rajobApplicationDetail extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template13[RAJobApplication,String,String,String,String,String,String,String,String,Boolean,Boolean,Boolean,Boolean,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(rajobApplication: RAJobApplication, userTypes: String, tableName: String, resumeFileType: String, coverLetterFileType: String, transcriptFileType: String, degreeCertificateFileType: String, tableRecorderId: String, backendPort: String, resume: Boolean, coverLetter: Boolean, transcript: Boolean, degreeCertificate: Boolean):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import helper._


Seq[Any](format.raw/*2.326*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("rajobApplication Profile")/*6.34*/ {_display_(Seq[Any](format.raw/*6.36*/("""
    """),format.raw/*7.5*/("""<div class="container">
        <div class="row">
            <div class="col s12">
                <div class="card-panel">
                    <h4 class="center">RA Job Application Detail Page</h4>

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
                                        <th style="max-width: 50px">RA Job Name</th>
                                        <td style="word-wrap: break-word;">"""),_display_(/*28.77*/rajobApplication/*28.93*/.getAppliedRAJob.getTitle),format.raw/*28.118*/("""</td>
                                    </tr>

                                    <tr>
                                        <th style="max-width: 50px">Applicant Name</th>
                                        """),_display_(/*33.42*/if(rajobApplication.getApplicant!="null" && rajobApplication.getApplicant != "")/*33.122*/ {_display_(Seq[Any](format.raw/*33.124*/("""
                                            """),format.raw/*34.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*34.81*/rajobApplication/*34.97*/.getApplicant.getUserName),format.raw/*34.122*/("""</td>
                                        """)))}/*35.43*/else/*35.48*/{_display_(Seq[Any](format.raw/*35.49*/("""
                                            """),format.raw/*36.45*/("""<td>-</td>
                                        """)))}),format.raw/*37.42*/("""
                                    """),format.raw/*38.37*/("""</tr>

                                    <tr>
                                        <th style="max-width: 50px">Apply Headline</th>
                                        """),_display_(/*42.42*/if(rajobApplication.getApplyHeadline!="null" && rajobApplication.getApplyHeadline != "")/*42.130*/ {_display_(Seq[Any](format.raw/*42.132*/("""
                                            """),format.raw/*43.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*43.81*/rajobApplication/*43.97*/.getApplyHeadline),format.raw/*43.114*/("""</td>
                                        """)))}/*44.43*/else/*44.48*/{_display_(Seq[Any](format.raw/*44.49*/("""
                                            """),format.raw/*45.45*/("""<td>-</td>
                                        """)))}),format.raw/*46.42*/("""
                                    """),format.raw/*47.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">Cover Letter</th>
                                        """),_display_(/*50.42*/if(rajobApplication.getApplyCoverLetter!="null" && rajobApplication.getApplyCoverLetter != "")/*50.136*/ {_display_(Seq[Any](format.raw/*50.138*/("""
                                            """),format.raw/*51.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*51.81*/rajobApplication/*51.97*/.getApplyCoverLetter),format.raw/*51.117*/("""</td>
                                        """)))}/*52.43*/else/*52.48*/{_display_(Seq[Any](format.raw/*52.49*/("""
                                            """),format.raw/*53.45*/("""<td>-</td>
                                        """)))}),format.raw/*54.42*/("""
                                    """),format.raw/*55.37*/("""</tr>

                                    <tr>

                                        <th style="max-width: 50px">Referee1 Name</th>
                                        """),_display_(/*60.42*/if(rajobApplication.getReferee1Title!="null" && rajobApplication.getReferee1Title!= "" && rajobApplication.getReferee1FirstName!="null" && rajobApplication.getReferee1FirstName != "" && rajobApplication.getReferee1LastName!="null" && rajobApplication.getReferee1LastName != "")/*60.319*/ {_display_(Seq[Any](format.raw/*60.321*/("""
                                            """),format.raw/*61.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*61.81*/rajobApplication/*61.97*/.getReferee1Title),format.raw/*61.114*/(""". """),_display_(/*61.117*/rajobApplication/*61.133*/.getReferee1FirstName),format.raw/*61.154*/(""" """),_display_(/*61.156*/rajobApplication/*61.172*/.getReferee1LastName),format.raw/*61.192*/("""</td>
                                        """)))}/*62.43*/else/*62.48*/{_display_(Seq[Any](format.raw/*62.49*/("""
                                            """),format.raw/*63.45*/("""<td>-</td>
                                        """)))}),format.raw/*64.42*/("""
                                    """),format.raw/*65.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">Email: </th>
                                        """),_display_(/*68.42*/if(rajobApplication.getReferee1Email!="null" && rajobApplication.getReferee1Email != "")/*68.130*/ {_display_(Seq[Any](format.raw/*68.132*/("""
                                            """),format.raw/*69.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*69.81*/rajobApplication/*69.97*/.getReferee1Email),format.raw/*69.114*/("""</td>
                                        """)))}/*70.43*/else/*70.48*/{_display_(Seq[Any](format.raw/*70.49*/("""
                                            """),format.raw/*71.45*/("""<td>-</td>
                                        """)))}),format.raw/*72.42*/("""
                                    """),format.raw/*73.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">Phone: </th>
                                        """),_display_(/*76.42*/if(rajobApplication.getReferee1Phone!="null" && rajobApplication.getReferee1Phone != "")/*76.130*/ {_display_(Seq[Any](format.raw/*76.132*/("""
                                            """),format.raw/*77.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*77.81*/rajobApplication/*77.97*/.getReferee1Phone),format.raw/*77.114*/("""</td>
                                        """)))}/*78.43*/else/*78.48*/{_display_(Seq[Any](format.raw/*78.49*/("""
                                            """),format.raw/*79.45*/("""<td>-</td>
                                        """)))}),format.raw/*80.42*/("""
                                    """),format.raw/*81.37*/("""</tr>


                                    <tr>
                                        <th style="max-width: 50px">Referee2 Name</th>
                                        """),_display_(/*86.42*/if(rajobApplication.getReferee2Title!="null" && rajobApplication.getReferee2Title!= "" && rajobApplication.getReferee2FirstName!="null" && rajobApplication.getReferee2FirstName != "" && rajobApplication.getReferee2LastName!="null" && rajobApplication.getReferee2LastName != "")/*86.319*/ {_display_(Seq[Any](format.raw/*86.321*/("""
                                            """),format.raw/*87.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*87.81*/rajobApplication/*87.97*/.getReferee2Title),format.raw/*87.114*/(""". """),_display_(/*87.117*/rajobApplication/*87.133*/.getReferee2FirstName),format.raw/*87.154*/(""" """),_display_(/*87.156*/rajobApplication/*87.172*/.getReferee2LastName),format.raw/*87.192*/("""</td>
                                        """)))}/*88.43*/else/*88.48*/{_display_(Seq[Any](format.raw/*88.49*/("""
                                            """),format.raw/*89.45*/("""<td>-</td>
                                        """)))}),format.raw/*90.42*/("""
                                    """),format.raw/*91.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 25px">Email: </th>
                                        """),_display_(/*94.42*/if(rajobApplication.getReferee2Email!="null" && rajobApplication.getReferee2Email != "")/*94.130*/ {_display_(Seq[Any](format.raw/*94.132*/("""
                                            """),format.raw/*95.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*95.81*/rajobApplication/*95.97*/.getReferee2Email),format.raw/*95.114*/("""</td>
                                        """)))}/*96.43*/else/*96.48*/{_display_(Seq[Any](format.raw/*96.49*/("""
                                            """),format.raw/*97.45*/("""<td>-</td>
                                        """)))}),format.raw/*98.42*/("""


                                    """),format.raw/*101.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 25px">Phone: </th>
                                        """),_display_(/*104.42*/if(rajobApplication.getReferee2Phone!="null" && rajobApplication.getReferee2Phone != "")/*104.130*/ {_display_(Seq[Any](format.raw/*104.132*/("""
                                            """),format.raw/*105.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*105.81*/rajobApplication/*105.97*/.getReferee2Phone),format.raw/*105.114*/("""</td>
                                        """)))}/*106.43*/else/*106.48*/{_display_(Seq[Any](format.raw/*106.49*/("""
                                            """),format.raw/*107.45*/("""<td>-</td>
                                        """)))}),format.raw/*108.42*/("""
                                    """),format.raw/*109.37*/("""</tr>


                                    <tr>
                                        <th style="max-width: 50px">Referee3 Name</th>
                                        """),_display_(/*114.42*/if(rajobApplication.getReferee3Title!="null" && rajobApplication.getReferee3Title!= "" && rajobApplication.getReferee3FirstName!="null" && rajobApplication.getReferee3FirstName != "" && rajobApplication.getReferee3LastName!="null" && rajobApplication.getReferee3LastName != "")/*114.319*/ {_display_(Seq[Any](format.raw/*114.321*/("""
                                            """),format.raw/*115.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*115.81*/rajobApplication/*115.97*/.getReferee3Title),format.raw/*115.114*/(""". """),_display_(/*115.117*/rajobApplication/*115.133*/.getReferee3FirstName),format.raw/*115.154*/(""" """),_display_(/*115.156*/rajobApplication/*115.172*/.getReferee3LastName),format.raw/*115.192*/("""</td>
                                        """)))}/*116.43*/else/*116.48*/{_display_(Seq[Any](format.raw/*116.49*/("""
                                            """),format.raw/*117.45*/("""<td>-</td>
                                        """)))}),format.raw/*118.42*/("""
                                    """),format.raw/*119.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">Email: </th>
                                        """),_display_(/*122.42*/if(rajobApplication.getReferee3Email!="null" && rajobApplication.getReferee3Email != "")/*122.130*/ {_display_(Seq[Any](format.raw/*122.132*/("""
                                            """),format.raw/*123.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*123.81*/rajobApplication/*123.97*/.getReferee3Email),format.raw/*123.114*/("""</td>
                                        """)))}/*124.43*/else/*124.48*/{_display_(Seq[Any](format.raw/*124.49*/("""
                                            """),format.raw/*125.45*/("""<td>-</td>
                                        """)))}),format.raw/*126.42*/("""


                                    """),format.raw/*129.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">Phone: </th>
                                        """),_display_(/*132.42*/if(rajobApplication.getReferee3Phone!="null" && rajobApplication.getReferee3Phone != "")/*132.130*/ {_display_(Seq[Any](format.raw/*132.132*/("""
                                            """),format.raw/*133.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*133.81*/rajobApplication/*133.97*/.getReferee3Phone),format.raw/*133.114*/("""</td>
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

"""),format.raw/*197.253*/("""
                        """),format.raw/*198.25*/("""<form class="form-signin"
                                id="editTechnologyForm"
                                method="post"
                                onsubmit="return getHTML()"
                                action=""""),_display_(/*202.42*/routes/*202.48*/.RAJobController.rajobApplicationStatusChange(rajobApplication.getId, "pending")),format.raw/*202.128*/("""">

                            """),_display_(/*204.30*/if(userTypes == "1" && rajobApplication.getAppliedRAJob.getStatus() !="closed" )/*204.110*/ {_display_(Seq[Any](format.raw/*204.112*/("""
                                """),format.raw/*205.33*/("""<a class="waves-effect waves-light btn modal-trigger blue darken-2"
                                href="#ccModal">Select CC Recipients</a>
                                <input type="hidden" name="ccSelected" id="ccSelectedHidden" value="" />
                            """)))}),format.raw/*208.30*/("""


                            """),_display_(/*211.30*/if(userTypes == "1" && rajobApplication.getAppliedRAJob.getStatus() !="closed" )/*211.110*/ {_display_(Seq[Any](format.raw/*211.112*/("""
                                """),format.raw/*212.33*/("""<button type="submit" id="RajobOffer" class="btn waves-effect waves-light blue darken-2">
                                    Offer</button>
                            """)))}),format.raw/*214.30*/("""
"""),format.raw/*215.193*/("""
"""),format.raw/*216.47*/("""
                            """),_display_(/*217.30*/if(userTypes == "1")/*217.50*/{_display_(Seq[Any](format.raw/*217.51*/("""
                                """),format.raw/*218.33*/("""<a href=""""),_display_(/*218.43*/routes/*218.49*/.JobController.jobApplicationsList("rajob", rajobApplication.getAppliedRAJob.getId(), 1, "")),format.raw/*218.141*/("""" class="btn waves-effect waves-light green darken-2">
                                Cancel</a>
                            """)))}),format.raw/*220.30*/("""
                            """),_display_(/*221.30*/if(userTypes == "4")/*221.50*/ {_display_(Seq[Any](format.raw/*221.52*/("""
                                """),format.raw/*222.33*/("""<a href=""""),_display_(/*222.43*/routes/*222.49*/.RAJobController.rajobListAppliedByUser(1)),format.raw/*222.91*/("""" class="btn waves-effect waves-light blue darken-2">
                                Back to Applied RA Job List</a>
                            """)))}),format.raw/*224.30*/("""
                        """),format.raw/*225.25*/("""</form>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <div id="ccModal" class="modal">
        <div class="modal-content">
            <h5>Select Contacts to CC</h5>
            <ul id="ccList"></ul>
        </div>
        <div class="modal-footer">
            <button type="button" class="modal-close waves-effect waves-green btn-flat"
            onclick="collectSelectedCC()">
                Done
            </button>
        </div>
    </div>


    <script>
            function openAndCheckNewTabUrl(link) """),format.raw/*247.50*/("""{"""),format.raw/*247.51*/("""const url = link.getAttribute('data-url');

                fetch(url, """),format.raw/*249.28*/("""{"""),format.raw/*249.29*/(""" """),format.raw/*249.30*/("""method: 'HEAD' """),format.raw/*249.45*/("""}"""),format.raw/*249.46*/(""").then(response => """),format.raw/*249.65*/("""{"""),format.raw/*249.66*/("""
                    """),format.raw/*250.21*/("""if (response.ok) """),format.raw/*250.38*/("""{"""),format.raw/*250.39*/("""
                        """),format.raw/*251.25*/("""const newTab = window.open(url, '_blank');
                        if (!newTab) """),format.raw/*252.38*/("""{"""),format.raw/*252.39*/("""
                            """),format.raw/*253.29*/("""alert("Please allow pop-ups in your browser to view this file.");
                        """),format.raw/*254.25*/("""}"""),format.raw/*254.26*/("""
                    """),format.raw/*255.21*/("""}"""),format.raw/*255.22*/(""" """),format.raw/*255.23*/("""else """),format.raw/*255.28*/("""{"""),format.raw/*255.29*/("""
                        """),format.raw/*256.25*/("""alert("The user did not upload this file");
                    """),format.raw/*257.21*/("""}"""),format.raw/*257.22*/("""
                """),format.raw/*258.17*/("""}"""),format.raw/*258.18*/(""")
                        .catch(error => """),format.raw/*259.41*/("""{"""),format.raw/*259.42*/("""
                            """),format.raw/*260.29*/("""console.error("Error checking the URL:", error);
                            alert("Failed to check the file. Please try again later.");
                        """),format.raw/*262.25*/("""}"""),format.raw/*262.26*/(""");
            """),format.raw/*263.13*/("""}"""),format.raw/*263.14*/("""

            """),format.raw/*265.13*/("""document.addEventListener('DOMContentLoaded', function () """),format.raw/*265.71*/("""{"""),format.raw/*265.72*/("""
                """),format.raw/*266.17*/("""var elems = document.querySelectorAll('.modal');
                M.Modal.init(elems);

                fetch('"""),_display_(/*269.25*/routes/*269.31*/.Assets.at("data/cc_contacts.json")),format.raw/*269.66*/("""')
                        .then(response => response.json())
                        .then(data => """),format.raw/*271.39*/("""{"""),format.raw/*271.40*/("""
                            """),format.raw/*272.29*/("""const ccList = document.getElementById("ccList");
                            data.forEach(contact => """),format.raw/*273.53*/("""{"""),format.raw/*273.54*/("""
                                """),format.raw/*274.33*/("""const li = document.createElement("li");
                                li.innerHTML = `
                            <label>
                                <input type="checkbox" name="ccSelected" value="$"""),format.raw/*277.82*/("""{"""),format.raw/*277.83*/("""contact.email"""),format.raw/*277.96*/("""}"""),format.raw/*277.97*/("""" />
                                <span>$"""),format.raw/*278.40*/("""{"""),format.raw/*278.41*/("""contact.firstname"""),format.raw/*278.58*/("""}"""),format.raw/*278.59*/(""" """),format.raw/*278.60*/("""$"""),format.raw/*278.61*/("""{"""),format.raw/*278.62*/("""contact.lastname"""),format.raw/*278.78*/("""}"""),format.raw/*278.79*/(""" """),format.raw/*278.80*/("""($"""),format.raw/*278.82*/("""{"""),format.raw/*278.83*/("""contact.email"""),format.raw/*278.96*/("""}"""),format.raw/*278.97*/(""")</span>
                            </label>
                        `;
                                ccList.appendChild(li);
                            """),format.raw/*282.29*/("""}"""),format.raw/*282.30*/(""");
                        """),format.raw/*283.25*/("""}"""),format.raw/*283.26*/(""")
                        .catch(error => """),format.raw/*284.41*/("""{"""),format.raw/*284.42*/("""
                            """),format.raw/*285.29*/("""console.error("Failed to load CC contacts:", error);
                        """),format.raw/*286.25*/("""}"""),format.raw/*286.26*/(""");
            """),format.raw/*287.13*/("""}"""),format.raw/*287.14*/(""");

            function collectSelectedCC() """),format.raw/*289.42*/("""{"""),format.raw/*289.43*/("""
                """),format.raw/*290.17*/("""let selectedValues = [];
                document.querySelectorAll('#ccList input[name="ccSelected"]:checked')
                        .forEach(item => selectedValues.push(item.value));

                document.getElementById('ccSelectedHidden').value = selectedValues.join(',');
            """),format.raw/*295.13*/("""}"""),format.raw/*295.14*/("""
    """),format.raw/*296.5*/("""</script>

""")))}))
      }
    }
  }

  def render(rajobApplication:RAJobApplication,userTypes:String,tableName:String,resumeFileType:String,coverLetterFileType:String,transcriptFileType:String,degreeCertificateFileType:String,tableRecorderId:String,backendPort:String,resume:Boolean,coverLetter:Boolean,transcript:Boolean,degreeCertificate:Boolean): play.twirl.api.HtmlFormat.Appendable = apply(rajobApplication,userTypes,tableName,resumeFileType,coverLetterFileType,transcriptFileType,degreeCertificateFileType,tableRecorderId,backendPort,resume,coverLetter,transcript,degreeCertificate)

  def f:((RAJobApplication,String,String,String,String,String,String,String,String,Boolean,Boolean,Boolean,Boolean) => play.twirl.api.HtmlFormat.Appendable) = (rajobApplication,userTypes,tableName,resumeFileType,coverLetterFileType,transcriptFileType,degreeCertificateFileType,tableRecorderId,backendPort,resume,coverLetter,transcript,degreeCertificate) => apply(rajobApplication,userTypes,tableName,resumeFileType,coverLetterFileType,transcriptFileType,degreeCertificateFileType,tableRecorderId,backendPort,resume,coverLetter,transcript,degreeCertificate)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:35 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/rajobApplicationDetail.scala.html
                  HASH: 3cdcc03b6f409153fc08e2453e05a31f3670053e
                  MATRIX: 814->1|1278->46|1675->373|1721->370|1749->389|1776->391|1816->423|1855->425|1886->430|2153->717|2182->770|2212->933|2241->994|2270->1054|2299->1108|2328->1162|2357->1201|2386->1236|2439->1261|2796->1591|2821->1607|2868->1632|3114->1851|3204->1931|3245->1933|3318->1978|3381->2014|3406->2030|3453->2055|3519->2103|3532->2108|3571->2109|3644->2154|3727->2206|3792->2243|3996->2420|4094->2508|4135->2510|4208->2555|4271->2591|4296->2607|4335->2624|4401->2672|4414->2677|4453->2678|4526->2723|4609->2775|4674->2812|4875->2986|4979->3080|5020->3082|5093->3127|5156->3163|5181->3179|5223->3199|5289->3247|5302->3252|5341->3253|5414->3298|5497->3350|5562->3387|5766->3564|6053->3841|6094->3843|6167->3888|6230->3924|6255->3940|6294->3957|6325->3960|6351->3976|6394->3997|6424->3999|6450->4015|6492->4035|6558->4083|6571->4088|6610->4089|6683->4134|6766->4186|6831->4223|7027->4392|7125->4480|7166->4482|7239->4527|7302->4563|7327->4579|7366->4596|7432->4644|7445->4649|7484->4650|7557->4695|7640->4747|7705->4784|7901->4953|7999->5041|8040->5043|8113->5088|8176->5124|8201->5140|8240->5157|8306->5205|8319->5210|8358->5211|8431->5256|8514->5308|8579->5345|8783->5522|9070->5799|9111->5801|9184->5846|9247->5882|9272->5898|9311->5915|9342->5918|9368->5934|9411->5955|9441->5957|9467->5973|9509->5993|9575->6041|9588->6046|9627->6047|9700->6092|9783->6144|9848->6181|10044->6350|10142->6438|10183->6440|10256->6485|10319->6521|10344->6537|10383->6554|10449->6602|10462->6607|10501->6608|10574->6653|10657->6705|10725->6744|10922->6913|11021->7001|11063->7003|11137->7048|11201->7084|11227->7100|11267->7117|11334->7165|11348->7170|11388->7171|11462->7216|11546->7268|11612->7305|11817->7482|12105->7759|12147->7761|12221->7806|12285->7842|12311->7858|12351->7875|12383->7878|12410->7894|12454->7915|12485->7917|12512->7933|12555->7953|12622->8001|12636->8006|12676->8007|12750->8052|12834->8104|12900->8141|13097->8310|13196->8398|13238->8400|13312->8445|13376->8481|13402->8497|13442->8514|13509->8562|13523->8567|13563->8568|13637->8613|13721->8665|13789->8704|13986->8873|14085->8961|14127->8963|14201->9008|14265->9044|14291->9060|14331->9077|14398->9125|14412->9130|14452->9131|14526->9176|14610->9228|14676->9265|14743->9304|14763->9314|14804->9316|14870->9353|15197->9652|15213->9658|15303->9725|15739->10129|15801->10163|15826->10178|15867->10180|15933->10217|16266->10522|16282->10528|16377->10600|16819->11010|16881->11044|16905->11058|16946->11060|17012->11097|17339->11396|17355->11402|17449->11473|17885->11877|17947->11911|17978->11932|18019->11934|18085->11971|18415->12273|18431->12279|18532->12357|18971->12764|19034->12798|19214->13200|19268->13225|19525->13454|19541->13460|19644->13540|19705->13573|19796->13653|19838->13655|19900->13688|20207->13963|20267->13995|20358->14075|20400->14077|20462->14110|20664->14280|20695->14473|20725->14520|20783->14550|20813->14570|20853->14571|20915->14604|20953->14614|20969->14620|21084->14712|21243->14839|21301->14869|21331->14889|21372->14891|21434->14924|21472->14934|21488->14940|21552->14982|21731->15129|21785->15154|22382->15722|22412->15723|22512->15794|22542->15795|22572->15796|22616->15811|22646->15812|22694->15831|22724->15832|22774->15853|22820->15870|22850->15871|22904->15896|23013->15976|23043->15977|23101->16006|23220->16096|23250->16097|23300->16118|23330->16119|23360->16120|23394->16125|23424->16126|23478->16151|23571->16215|23601->16216|23647->16233|23677->16234|23748->16276|23778->16277|23836->16306|24026->16467|24056->16468|24100->16483|24130->16484|24173->16498|24260->16556|24290->16557|24336->16574|24475->16685|24491->16691|24548->16726|24677->16826|24707->16827|24765->16856|24896->16958|24926->16959|24988->16992|25224->17199|25254->17200|25296->17213|25326->17214|25399->17258|25429->17259|25475->17276|25505->17277|25535->17278|25565->17279|25595->17280|25640->17296|25670->17297|25700->17298|25731->17300|25761->17301|25803->17314|25833->17315|26019->17472|26049->17473|26105->17500|26135->17501|26206->17543|26236->17544|26294->17573|26400->17650|26430->17651|26474->17666|26504->17667|26578->17712|26608->17713|26654->17730|26976->18023|27006->18024|27039->18029
                  LINES: 31->1|36->2|39->4|42->2|44->5|45->6|45->6|45->6|46->7|53->14|54->15|55->16|56->17|57->18|58->19|59->20|60->21|61->22|62->23|67->28|67->28|67->28|72->33|72->33|72->33|73->34|73->34|73->34|73->34|74->35|74->35|74->35|75->36|76->37|77->38|81->42|81->42|81->42|82->43|82->43|82->43|82->43|83->44|83->44|83->44|84->45|85->46|86->47|89->50|89->50|89->50|90->51|90->51|90->51|90->51|91->52|91->52|91->52|92->53|93->54|94->55|99->60|99->60|99->60|100->61|100->61|100->61|100->61|100->61|100->61|100->61|100->61|100->61|100->61|101->62|101->62|101->62|102->63|103->64|104->65|107->68|107->68|107->68|108->69|108->69|108->69|108->69|109->70|109->70|109->70|110->71|111->72|112->73|115->76|115->76|115->76|116->77|116->77|116->77|116->77|117->78|117->78|117->78|118->79|119->80|120->81|125->86|125->86|125->86|126->87|126->87|126->87|126->87|126->87|126->87|126->87|126->87|126->87|126->87|127->88|127->88|127->88|128->89|129->90|130->91|133->94|133->94|133->94|134->95|134->95|134->95|134->95|135->96|135->96|135->96|136->97|137->98|140->101|143->104|143->104|143->104|144->105|144->105|144->105|144->105|145->106|145->106|145->106|146->107|147->108|148->109|153->114|153->114|153->114|154->115|154->115|154->115|154->115|154->115|154->115|154->115|154->115|154->115|154->115|155->116|155->116|155->116|156->117|157->118|158->119|161->122|161->122|161->122|162->123|162->123|162->123|162->123|163->124|163->124|163->124|164->125|165->126|168->129|171->132|171->132|171->132|172->133|172->133|172->133|172->133|173->134|173->134|173->134|174->135|175->136|176->137|177->138|177->138|177->138|178->139|182->143|182->143|182->143|189->150|190->151|190->151|190->151|191->152|195->156|195->156|195->156|202->163|203->164|203->164|203->164|204->165|208->169|208->169|208->169|215->176|216->177|216->177|216->177|217->178|221->182|221->182|221->182|228->189|230->191|236->197|237->198|241->202|241->202|241->202|243->204|243->204|243->204|244->205|247->208|250->211|250->211|250->211|251->212|253->214|254->215|255->216|256->217|256->217|256->217|257->218|257->218|257->218|257->218|259->220|260->221|260->221|260->221|261->222|261->222|261->222|261->222|263->224|264->225|286->247|286->247|288->249|288->249|288->249|288->249|288->249|288->249|288->249|289->250|289->250|289->250|290->251|291->252|291->252|292->253|293->254|293->254|294->255|294->255|294->255|294->255|294->255|295->256|296->257|296->257|297->258|297->258|298->259|298->259|299->260|301->262|301->262|302->263|302->263|304->265|304->265|304->265|305->266|308->269|308->269|308->269|310->271|310->271|311->272|312->273|312->273|313->274|316->277|316->277|316->277|316->277|317->278|317->278|317->278|317->278|317->278|317->278|317->278|317->278|317->278|317->278|317->278|317->278|317->278|317->278|321->282|321->282|322->283|322->283|323->284|323->284|324->285|325->286|325->286|326->287|326->287|328->289|328->289|329->290|334->295|334->295|335->296
                  -- GENERATED --
              */
          