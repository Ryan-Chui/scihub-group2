
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

object tajobApplicationDetail extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[TAJobApplication,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(tajobApplication: TAJobApplication):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import helper._


Seq[Any](format.raw/*2.38*/("""

"""),format.raw/*5.1*/("""<script type="text/javascript">
    function performClick(elemId) """),format.raw/*6.35*/("""{"""),format.raw/*6.36*/("""
        """),format.raw/*7.9*/("""var elem = document.getElementById(elemId);
        if(elem && document.createEvent) """),format.raw/*8.42*/("""{"""),format.raw/*8.43*/("""
            """),format.raw/*9.13*/("""var evt = document.createEvent("MouseEvents");
            evt.initEvent("click", true, false);
            elem.dispatchEvent(evt);
        """),format.raw/*12.9*/("""}"""),format.raw/*12.10*/("""
    """),format.raw/*13.5*/("""}"""),format.raw/*13.6*/("""
    """),format.raw/*14.5*/("""function browseFolder(path)"""),format.raw/*14.32*/("""{"""),format.raw/*14.33*/("""
        """),format.raw/*15.9*/("""try"""),format.raw/*15.12*/("""{"""),format.raw/*15.13*/("""
            """),format.raw/*16.13*/("""var Message = "\u8bf7";
            var Shell = new ActiveXObject("Shell.Application");
            var Folder = Shell.BrowseForFolder(0, Message, 64, 17);
            if(Folder != null)"""),format.raw/*19.31*/("""{"""),format.raw/*19.32*/("""
                """),format.raw/*20.17*/("""Folder = Folder.items();
                Folder = Folder.item();
                Folder = Folder.Path;
                if (Folder.charAt(Folder.length -1) != "\\")"""),format.raw/*23.61*/("""{"""),format.raw/*23.62*/("""
                    """),format.raw/*24.21*/("""Folder = Folder + "\\";
                """),format.raw/*25.17*/("""}"""),format.raw/*25.18*/("""
                """),format.raw/*26.17*/("""document.getElementById(path).value = Folder;
                return Folder;
            """),format.raw/*28.13*/("""}"""),format.raw/*28.14*/("""
        """),format.raw/*29.9*/("""}"""),format.raw/*29.10*/("""catch (e)"""),format.raw/*29.19*/("""{"""),format.raw/*29.20*/("""
            """),format.raw/*30.13*/("""alert(e.message);
        """),format.raw/*31.9*/("""}"""),format.raw/*31.10*/("""
    """),format.raw/*32.5*/("""}"""),format.raw/*32.6*/("""

    """),format.raw/*34.5*/("""function download(src) """),format.raw/*34.28*/("""{"""),format.raw/*34.29*/("""
        """),format.raw/*35.9*/("""var $a = document.createElement('a');
        $a.setAttribute("href", src);
        $a.setAttribute("download", "");
        var evObj = document.createEvent('MouseEvents');
        evObj.initMouseEvent( 'click', true, true, window, 0, 0, 0, 0, 0, false, false, true, false, 0, null);
        $a.dispatchEvent(evObj);
    """),format.raw/*41.5*/("""}"""),format.raw/*41.6*/(""";


</script>

"""),_display_(/*46.2*/main("tajobApplication Profile")/*46.34*/ {_display_(Seq[Any](format.raw/*46.36*/("""
    """),format.raw/*47.5*/("""<div class="container">
        <div class="row">
            <div class="col s12">
                <div class="card-panel">
                    <h4 class="center">TA Job Application Detail Page</h4>

                    <div class="row">
"""),format.raw/*54.49*/("""
"""),format.raw/*55.53*/("""
"""),format.raw/*56.163*/("""
"""),format.raw/*57.61*/("""
"""),format.raw/*58.60*/("""
"""),format.raw/*59.54*/("""
"""),format.raw/*60.54*/("""
"""),format.raw/*61.39*/("""
"""),format.raw/*62.35*/("""
                        """),format.raw/*63.25*/("""<div class="col s12">
                            <table class="striped responsive-table" >
                                <tbody>
                                    <tr>
                                        <th style="max-width: 50px">TA Job Name</th>
                                        <td style="word-wrap: break-word;">"""),_display_(/*68.77*/tajobApplication/*68.93*/.getAppliedTAJob.getTitle),format.raw/*68.118*/("""</td>
                                    </tr>
                                    <tr>
                                        <th style="max-width: 50px">Apply Date</th>
                                        """),_display_(/*72.42*/if(tajobApplication.getApplyDate!="null" && tajobApplication.getApplyDate != "")/*72.122*/ {_display_(Seq[Any](format.raw/*72.124*/("""
                                            """),format.raw/*73.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*73.81*/tajobApplication/*73.97*/.getApplyDate),format.raw/*73.110*/("""</td>
                                        """)))}/*74.43*/else/*74.48*/{_display_(Seq[Any](format.raw/*74.49*/("""
                                            """),format.raw/*75.45*/("""<td>-</td>
                                        """)))}),format.raw/*76.42*/("""
                                    """),format.raw/*77.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">Applicant Name</th>
                                        """),_display_(/*80.42*/if(tajobApplication.getApplicant!="null" && tajobApplication.getApplicant != "")/*80.122*/ {_display_(Seq[Any](format.raw/*80.124*/("""
                                            """),format.raw/*81.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*81.81*/tajobApplication/*81.97*/.getApplicant.getUserName),format.raw/*81.122*/("""</td>
                                        """)))}/*82.43*/else/*82.48*/{_display_(Seq[Any](format.raw/*82.49*/("""
                                            """),format.raw/*83.45*/("""<td>-</td>
                                        """)))}),format.raw/*84.42*/("""
                                    """),format.raw/*85.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">Applicant Email</th>
                                        """),_display_(/*88.42*/if(tajobApplication.getApplicant!="null" && tajobApplication.getApplicant != "")/*88.122*/ {_display_(Seq[Any](format.raw/*88.124*/("""
                                            """),format.raw/*89.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*89.81*/tajobApplication/*89.97*/.getApplicant.getEmail),format.raw/*89.119*/("""</td>
                                        """)))}/*90.43*/else/*90.48*/{_display_(Seq[Any](format.raw/*90.49*/("""
                                            """),format.raw/*91.45*/("""<td>-</td>
                                        """)))}),format.raw/*92.42*/("""
                                    """),format.raw/*93.37*/("""</tr>

                                    <tr>
                                        <th style="max-width: 50px">Applicant Phone Number</th>
                                        """),_display_(/*97.42*/if(tajobApplication.getApplicant!="null" && tajobApplication.getApplicant != "")/*97.122*/ {_display_(Seq[Any](format.raw/*97.124*/("""
                                            """),format.raw/*98.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*98.81*/tajobApplication/*98.97*/.getApplicant.getPhoneNumber),format.raw/*98.125*/("""</td>
                                        """)))}/*99.43*/else/*99.48*/{_display_(Seq[Any](format.raw/*99.49*/("""
                                            """),format.raw/*100.45*/("""<td>-</td>
                                        """)))}),format.raw/*101.42*/("""
                                    """),format.raw/*102.37*/("""</tr>


                                    <tr>
                                        <th style="max-width: 50px">Applicant SMU ID</th>
                                        """),_display_(/*107.42*/if(tajobApplication.getSmuID!="null" && tajobApplication.getSmuID != "")/*107.114*/ {_display_(Seq[Any](format.raw/*107.116*/("""
                                            """),format.raw/*108.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*108.81*/tajobApplication/*108.97*/.getSmuID),format.raw/*108.106*/("""</td>
                                        """)))}/*109.43*/else/*109.48*/{_display_(Seq[Any](format.raw/*109.49*/("""
                                            """),format.raw/*110.45*/("""<td>-</td>
                                        """)))}),format.raw/*111.42*/("""
                                    """),format.raw/*112.37*/("""</tr>

                                    """),format.raw/*130.44*/("""

                                    """),format.raw/*132.37*/("""<tr>
                                        <th style="max-width: 50px">Applicant Student Type</th>
                                        """),_display_(/*134.42*/if(tajobApplication.getTaStudentTypes!="null" && tajobApplication.getTaStudentTypes != "")/*134.132*/ {_display_(Seq[Any](format.raw/*134.134*/("""
                                            """),_display_(/*135.46*/if(tajobApplication.getTaStudentTypes == 1)/*135.89*/{_display_(Seq[Any](format.raw/*135.90*/("""
                                                """),format.raw/*136.49*/("""<td style="word-wrap: break-word;">New Student</td>
                                            """)))}),format.raw/*137.46*/("""
                                            """),_display_(/*138.46*/if(tajobApplication.getTaStudentTypes == 2)/*138.89*/{_display_(Seq[Any](format.raw/*138.90*/("""
                                                """),format.raw/*139.49*/("""<td style="word-wrap: break-word;">Continuing Student</td>
                                            """)))}),format.raw/*140.46*/("""
                                        """)))}/*141.43*/else/*141.48*/{_display_(Seq[Any](format.raw/*141.49*/("""
                                            """),format.raw/*142.45*/("""<td>-</td>
                                        """)))}),format.raw/*143.42*/("""
                                    """),format.raw/*144.37*/("""</tr>

                                    <tr>
                                        <th style="max-width: 50px">New student completed application for admission</th>
                                        """),_display_(/*148.42*/if(tajobApplication.getTaStudentAdmissionTypes!="null" && tajobApplication.getTaStudentAdmissionTypes != "")/*148.150*/ {_display_(Seq[Any](format.raw/*148.152*/("""
                                            """),_display_(/*149.46*/if(tajobApplication.getTaStudentAdmissionTypes == 1)/*149.98*/{_display_(Seq[Any](format.raw/*149.99*/("""
                                                """),format.raw/*150.49*/("""<td style="word-wrap: break-word;">Yes</td>
                                            """)))}),format.raw/*151.46*/("""
                                            """),_display_(/*152.46*/if(tajobApplication.getTaStudentAdmissionTypes == 2)/*152.98*/{_display_(Seq[Any](format.raw/*152.99*/("""
                                                """),format.raw/*153.49*/("""<td style="word-wrap: break-word;">No</td>
                                            """)))}),format.raw/*154.46*/("""
                                        """)))}/*155.43*/else/*155.48*/{_display_(Seq[Any](format.raw/*155.49*/("""
                                            """),format.raw/*156.45*/("""<td>-</td>
                                        """)))}),format.raw/*157.42*/("""
                                    """),format.raw/*158.37*/("""</tr>
                                    <td style="word-wrap: break-word;">G.R.E. Score: </td>
                                    <tr>
                                        <th style="max-width: 50px">G.R.E. V.</th>
                                        """),_display_(/*162.42*/if(tajobApplication.getGreV!="null" && tajobApplication.getGreV != "")/*162.112*/ {_display_(Seq[Any](format.raw/*162.114*/("""
                                            """),format.raw/*163.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*163.81*/tajobApplication/*163.97*/.getGreV),format.raw/*163.105*/("""</td>
                                        """)))}/*164.43*/else/*164.48*/{_display_(Seq[Any](format.raw/*164.49*/("""
                                            """),format.raw/*165.45*/("""<td>-</td>
                                        """)))}),format.raw/*166.42*/("""
                                    """),format.raw/*167.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">G.R.E. Q.</th>
                                        """),_display_(/*170.42*/if(tajobApplication.getGreQ!="null" && tajobApplication.getGreQ != "")/*170.112*/ {_display_(Seq[Any](format.raw/*170.114*/("""
                                            """),format.raw/*171.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*171.81*/tajobApplication/*171.97*/.getGreQ),format.raw/*171.105*/("""</td>
                                        """)))}/*172.43*/else/*172.48*/{_display_(Seq[Any](format.raw/*172.49*/("""
                                            """),format.raw/*173.45*/("""<td>-</td>
                                        """)))}),format.raw/*174.42*/("""
                                    """),format.raw/*175.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">G.R.E. A.</th>
                                        """),_display_(/*178.42*/if(tajobApplication.getGreA!="null" && tajobApplication.getGreA != "")/*178.112*/ {_display_(Seq[Any](format.raw/*178.114*/("""
                                            """),format.raw/*179.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*179.81*/tajobApplication/*179.97*/.getGreA),format.raw/*179.105*/("""</td>
                                        """)))}/*180.43*/else/*180.48*/{_display_(Seq[Any](format.raw/*180.49*/("""
                                            """),format.raw/*181.45*/("""<td>-</td>
                                        """)))}),format.raw/*182.42*/("""

                                    """),format.raw/*184.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">G.R.E. Date</th>

                                        """),_display_(/*188.42*/if(tajobApplication.getGreDate!="null" && tajobApplication.getGreDate != "")/*188.118*/ {_display_(Seq[Any](format.raw/*188.120*/("""
                                            """),format.raw/*189.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*189.81*/tajobApplication/*189.97*/.getGreDate),format.raw/*189.108*/("""</td>
                                        """)))}/*190.43*/else/*190.48*/{_display_(Seq[Any](format.raw/*190.49*/("""
                                            """),format.raw/*191.45*/("""<td>-</td>
                                        """)))}),format.raw/*192.42*/("""
                                    """),format.raw/*193.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">Undergraduate GPA</th>

                                        """),_display_(/*197.42*/if(tajobApplication.getUndergraduateGPA!="null" && tajobApplication.getUndergraduateGPA != "")/*197.136*/ {_display_(Seq[Any](format.raw/*197.138*/("""
                                            """),format.raw/*198.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*198.81*/tajobApplication/*198.97*/.getUndergraduateGPA),format.raw/*198.117*/("""</td>
                                        """)))}/*199.43*/else/*199.48*/{_display_(Seq[Any](format.raw/*199.49*/("""
                                            """),format.raw/*200.45*/("""<td>-</td>
                                        """)))}),format.raw/*201.42*/("""
                                    """),format.raw/*202.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">Undergraduate School</th>

                                        """),_display_(/*206.42*/if(tajobApplication.getUndergraduateSchool!="null" && tajobApplication.getUndergraduateSchool != "")/*206.142*/ {_display_(Seq[Any](format.raw/*206.144*/("""
                                            """),format.raw/*207.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*207.81*/tajobApplication/*207.97*/.getUndergraduateSchool),format.raw/*207.120*/("""</td>
                                        """)))}/*208.43*/else/*208.48*/{_display_(Seq[Any](format.raw/*208.49*/("""
                                            """),format.raw/*209.45*/("""<td>-</td>
                                        """)))}),format.raw/*210.42*/("""
                                    """),format.raw/*211.37*/("""</tr>

                                    <tr>
                                        <th style="max-width: 50px">Graduate GPA</th>

                                        """),_display_(/*216.42*/if(tajobApplication.getGraduateGPA!="null" && tajobApplication.getGraduateGPA != "")/*216.126*/ {_display_(Seq[Any](format.raw/*216.128*/("""
                                            """),format.raw/*217.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*217.81*/tajobApplication/*217.97*/.getGraduateGPA),format.raw/*217.112*/("""</td>
                                        """)))}/*218.43*/else/*218.48*/{_display_(Seq[Any](format.raw/*218.49*/("""
                                            """),format.raw/*219.45*/("""<td>-</td>
                                        """)))}),format.raw/*220.42*/("""
                                    """),format.raw/*221.37*/("""</tr>

                                    <tr>
                                        <th style="max-width: 50px">Graduate School</th>

                                        """),_display_(/*226.42*/if(tajobApplication.getGraduateSchool!="null" && tajobApplication.getGraduateSchool != "")/*226.132*/ {_display_(Seq[Any](format.raw/*226.134*/("""
                                            """),format.raw/*227.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*227.81*/tajobApplication/*227.97*/.getGraduateSchool),format.raw/*227.115*/("""</td>
                                        """)))}/*228.43*/else/*228.48*/{_display_(Seq[Any](format.raw/*228.49*/("""
                                            """),format.raw/*229.45*/("""<td>-</td>
                                        """)))}),format.raw/*230.42*/("""
                                    """),format.raw/*231.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">Class Rank</th>

                                        """),_display_(/*235.42*/if(tajobApplication.getClassRankNoGPA!="null" && tajobApplication.getClassRankNoGPA != "")/*235.132*/ {_display_(Seq[Any](format.raw/*235.134*/("""
                                            """),format.raw/*236.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*236.81*/tajobApplication/*236.97*/.getClassRankNoGPA),format.raw/*236.115*/("""</td>
                                        """)))}/*237.43*/else/*237.48*/{_display_(Seq[Any](format.raw/*237.49*/("""
                                            """),format.raw/*238.45*/("""<td>-</td>
                                        """)))}),format.raw/*239.42*/("""
                                    """),format.raw/*240.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">Score Percentage in Final Year of Graduation</th>

                                        """),_display_(/*244.42*/if(tajobApplication.getScorePercentageNoGPA!="null" && tajobApplication.getScorePercentageNoGPA != "")/*244.144*/ {_display_(Seq[Any](format.raw/*244.146*/("""
                                            """),format.raw/*245.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*245.81*/tajobApplication/*245.97*/.getScorePercentageNoGPA),format.raw/*245.121*/("""</td>
                                        """)))}/*246.43*/else/*246.48*/{_display_(Seq[Any](format.raw/*246.49*/("""
                                            """),format.raw/*247.45*/("""<td>-</td>
                                        """)))}),format.raw/*248.42*/("""
                                    """),format.raw/*249.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">Grade in Final Year of Graduation</th>

                                        """),_display_(/*253.42*/if(tajobApplication.getGradeNoGPA!="null" && tajobApplication.getGradeNoGPA != "")/*253.124*/ {_display_(Seq[Any](format.raw/*253.126*/("""
                                            """),format.raw/*254.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*254.81*/tajobApplication/*254.97*/.getGradeNoGPA),format.raw/*254.111*/("""</td>
                                        """)))}/*255.43*/else/*255.48*/{_display_(Seq[Any](format.raw/*255.49*/("""
                                            """),format.raw/*256.45*/("""<td>-</td>
                                        """)))}),format.raw/*257.42*/("""
                                    """),format.raw/*258.37*/("""</tr>

                                    <tr>
                                        <th style="max-width: 50px">Others Info</th>

                                        """),_display_(/*263.42*/if(tajobApplication.getOtherInfoNoGPA!="null" && tajobApplication.getOtherInfoNoGPA != "")/*263.132*/ {_display_(Seq[Any](format.raw/*263.134*/("""
                                            """),format.raw/*264.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*264.81*/tajobApplication/*264.97*/.getOtherInfoNoGPA),format.raw/*264.115*/("""</td>
                                        """)))}/*265.43*/else/*265.48*/{_display_(Seq[Any](format.raw/*265.49*/("""
                                            """),format.raw/*266.45*/("""<td>-</td>
                                        """)))}),format.raw/*267.42*/("""
                                    """),format.raw/*268.37*/("""</tr>

                                    <tr>
                                        <th style="max-width: 50px">Enrolled Degree Program</th>
                                        """),_display_(/*272.42*/if(tajobApplication.getEnrolledDegree!="null" && tajobApplication.getEnrolledDegree != "")/*272.132*/ {_display_(Seq[Any](format.raw/*272.134*/("""
                                            """),_display_(/*273.46*/if(tajobApplication.getEnrolledDegree == 1)/*273.89*/{_display_(Seq[Any](format.raw/*273.90*/("""
                                                """),format.raw/*274.49*/("""<td style="word-wrap: break-word;">MS Computer Science</td>
                                            """)))}),format.raw/*275.46*/("""
                                            """),_display_(/*276.46*/if(tajobApplication.getEnrolledDegree == 2)/*276.89*/{_display_(Seq[Any](format.raw/*276.90*/("""
                                                """),format.raw/*277.49*/("""<td style="word-wrap: break-word;">MS Security Engineering/Cyber Security</td>
                                            """)))}),format.raw/*278.46*/("""
                                            """),_display_(/*279.46*/if(tajobApplication.getEnrolledDegree == 3)/*279.89*/{_display_(Seq[Any](format.raw/*279.90*/("""
                                                """),format.raw/*280.49*/("""<td style="word-wrap: break-word;">MS Software Engineering</td>
                                            """)))}),format.raw/*281.46*/("""
                                            """),_display_(/*282.46*/if(tajobApplication.getEnrolledDegree == 4)/*282.89*/{_display_(Seq[Any](format.raw/*282.90*/("""
                                                """),format.raw/*283.49*/("""<td style="word-wrap: break-word;">D.Eng. Software Engineering</td>
                                            """)))}),format.raw/*284.46*/("""
                                            """),_display_(/*285.46*/if(tajobApplication.getEnrolledDegree == 5)/*285.89*/{_display_(Seq[Any](format.raw/*285.90*/("""
                                                """),format.raw/*286.49*/("""<td style="word-wrap: break-word;">Ph.D. Computer Science</td>
                                            """)))}),format.raw/*287.46*/("""
                                            """),_display_(/*288.46*/if(tajobApplication.getEnrolledDegree == 6)/*288.89*/{_display_(Seq[Any](format.raw/*288.90*/("""
                                                """),format.raw/*289.49*/("""<td style="word-wrap: break-word;">Other</td>
                                            """)))}),format.raw/*290.46*/("""
                                        """)))}/*291.43*/else/*291.48*/{_display_(Seq[Any](format.raw/*291.49*/("""
                                            """),format.raw/*292.45*/("""<td>-</td>
                                        """)))}),format.raw/*293.42*/("""
                                    """),format.raw/*294.37*/("""</tr>

                                    <tr>
                                        <th style="max-width: 50px">Plan to Ph.D. CS Program</th>
                                        """),_display_(/*298.42*/if(tajobApplication.getEnrolledPhdDegree!="null" && tajobApplication.getEnrolledPhdDegree != "")/*298.138*/ {_display_(Seq[Any](format.raw/*298.140*/("""
                                            """),_display_(/*299.46*/if(tajobApplication.getEnrolledPhdDegree == 1)/*299.92*/{_display_(Seq[Any](format.raw/*299.93*/("""
                                                """),format.raw/*300.49*/("""<td style="word-wrap: break-word;">Yes</td>
                                            """)))}),format.raw/*301.46*/("""
                                            """),_display_(/*302.46*/if(tajobApplication.getEnrolledPhdDegree == 2)/*302.92*/{_display_(Seq[Any](format.raw/*302.93*/("""
                                                """),format.raw/*303.49*/("""<td style="word-wrap: break-word;">No</td>
                                            """)))}),format.raw/*304.46*/("""
                                        """)))}/*305.43*/else/*305.48*/{_display_(Seq[Any](format.raw/*305.49*/("""
                                            """),format.raw/*306.45*/("""<td>-</td>
                                        """)))}),format.raw/*307.42*/("""
                                    """),format.raw/*308.37*/("""</tr>
                                    <th>Areas of Research Interest in order of Preference</th>
                                    <tr>
                                        <th style="max-width: 50px">1</th>

                                        """),_display_(/*313.42*/if(tajobApplication.getAreasResearchInterest1!="null" && tajobApplication.getAreasResearchInterest1 != "")/*313.148*/ {_display_(Seq[Any](format.raw/*313.150*/("""
                                            """),format.raw/*314.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*314.81*/tajobApplication/*314.97*/.getAreasResearchInterest1),format.raw/*314.123*/("""</td>
                                        """)))}/*315.43*/else/*315.48*/{_display_(Seq[Any](format.raw/*315.49*/("""
                                            """),format.raw/*316.45*/("""<td>-</td>
                                        """)))}),format.raw/*317.42*/("""
                                    """),format.raw/*318.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">2</th>

                                        """),_display_(/*322.42*/if(tajobApplication.getAreasResearchInterest2!="null" && tajobApplication.getAreasResearchInterest2 != "")/*322.148*/ {_display_(Seq[Any](format.raw/*322.150*/("""
                                            """),format.raw/*323.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*323.81*/tajobApplication/*323.97*/.getAreasResearchInterest2),format.raw/*323.123*/("""</td>
                                        """)))}/*324.43*/else/*324.48*/{_display_(Seq[Any](format.raw/*324.49*/("""
                                            """),format.raw/*325.45*/("""<td>-</td>
                                        """)))}),format.raw/*326.42*/("""
                                    """),format.raw/*327.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">3</th>

                                        """),_display_(/*331.42*/if(tajobApplication.getAreasResearchInterest3!="null" && tajobApplication.getAreasResearchInterest3 != "")/*331.148*/ {_display_(Seq[Any](format.raw/*331.150*/("""
                                            """),format.raw/*332.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*332.81*/tajobApplication/*332.97*/.getAreasResearchInterest3),format.raw/*332.123*/("""</td>
                                        """)))}/*333.43*/else/*333.48*/{_display_(Seq[Any](format.raw/*333.49*/("""
                                            """),format.raw/*334.45*/("""<td>-</td>
                                        """)))}),format.raw/*335.42*/("""
                                    """),format.raw/*336.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">4</th>

                                        """),_display_(/*340.42*/if(tajobApplication.getAreasResearchInterest4!="null" && tajobApplication.getAreasResearchInterest4 != "")/*340.148*/ {_display_(Seq[Any](format.raw/*340.150*/("""
                                            """),format.raw/*341.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*341.81*/tajobApplication/*341.97*/.getAreasResearchInterest4),format.raw/*341.123*/("""</td>
                                        """)))}/*342.43*/else/*342.48*/{_display_(Seq[Any](format.raw/*342.49*/("""
                                            """),format.raw/*343.45*/("""<td>-</td>
                                        """)))}),format.raw/*344.42*/("""
                                    """),format.raw/*345.37*/("""</tr>

                                    <tr>
                                        <th style="max-width: 50px">Have Research Assistant Experience</th>
                                        """),_display_(/*349.42*/if(tajobApplication.getRaSMU!="null" && tajobApplication.getRaSMU != "")/*349.114*/ {_display_(Seq[Any](format.raw/*349.116*/("""
                                            """),_display_(/*350.46*/if(tajobApplication.getRaSMU == 1)/*350.80*/{_display_(Seq[Any](format.raw/*350.81*/("""
                                                """),format.raw/*351.49*/("""<td style="word-wrap: break-word;">Yes</td>
                                            """)))}),format.raw/*352.46*/("""
                                            """),_display_(/*353.46*/if(tajobApplication.getRaSMU == 2)/*353.80*/{_display_(Seq[Any](format.raw/*353.81*/("""
                                                """),format.raw/*354.49*/("""<td style="word-wrap: break-word;">No</td>
                                            """)))}),format.raw/*355.46*/("""
                                        """)))}/*356.43*/else/*356.48*/{_display_(Seq[Any](format.raw/*356.49*/("""
                                            """),format.raw/*357.45*/("""<td>-</td>
                                        """)))}),format.raw/*358.42*/("""

                                    """),format.raw/*360.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">RAship Time</th>
                                        """),_display_(/*363.42*/if(tajobApplication.getRaSMUTime!="null" && tajobApplication.getRaSMUTime != "")/*363.122*/ {_display_(Seq[Any](format.raw/*363.124*/("""
                                            """),format.raw/*364.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*364.81*/tajobApplication/*364.97*/.getRaSMUTime),format.raw/*364.110*/("""</td>
                                        """)))}/*365.43*/else/*365.48*/{_display_(Seq[Any](format.raw/*365.49*/("""
                                            """),format.raw/*366.45*/("""<td>-</td>
                                        """)))}),format.raw/*367.42*/("""
                                    """),format.raw/*368.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">RA Advisor Name</th>
                                        """),_display_(/*371.42*/if(tajobApplication.getRaSMUAdvisorName!="null" && tajobApplication.getRaSMUAdvisorName != "")/*371.136*/ {_display_(Seq[Any](format.raw/*371.138*/("""
                                            """),format.raw/*372.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*372.81*/tajobApplication/*372.97*/.getRaSMUAdvisorName),format.raw/*372.117*/("""</td>
                                        """)))}/*373.43*/else/*373.48*/{_display_(Seq[Any](format.raw/*373.49*/("""
                                            """),format.raw/*374.45*/("""<td>-</td>
                                        """)))}),format.raw/*375.42*/("""
                                    """),format.raw/*376.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">RA Advisor Email</th>
                                        """),_display_(/*379.42*/if(tajobApplication.getRaSMUAdvisorEmail!="null" && tajobApplication.getRaSMUAdvisorEmail != "")/*379.138*/ {_display_(Seq[Any](format.raw/*379.140*/("""
                                            """),format.raw/*380.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*380.81*/tajobApplication/*380.97*/.getRaSMUAdvisorEmail),format.raw/*380.118*/("""</td>
                                        """)))}/*381.43*/else/*381.48*/{_display_(Seq[Any](format.raw/*381.49*/("""
                                            """),format.raw/*382.45*/("""<td>-</td>
                                        """)))}),format.raw/*383.42*/("""
                                    """),format.raw/*384.37*/("""</tr>

                                    <tr>
                                        <th style="max-width: 50px">Have Teaching Assistant Experience</th>
                                        """),_display_(/*388.42*/if(tajobApplication.getTaSMU!="null" && tajobApplication.getTaSMU != "")/*388.114*/ {_display_(Seq[Any](format.raw/*388.116*/("""
                                            """),_display_(/*389.46*/if(tajobApplication.getTaSMU == 1)/*389.80*/{_display_(Seq[Any](format.raw/*389.81*/("""
                                                """),format.raw/*390.49*/("""<td style="word-wrap: break-word;">Yes</td>
                                            """)))}),format.raw/*391.46*/("""
                                            """),_display_(/*392.46*/if(tajobApplication.getTaSMU == 2)/*392.80*/{_display_(Seq[Any](format.raw/*392.81*/("""
                                                """),format.raw/*393.49*/("""<td style="word-wrap: break-word;">No</td>
                                            """)))}),format.raw/*394.46*/("""
                                        """)))}/*395.43*/else/*395.48*/{_display_(Seq[Any](format.raw/*395.49*/("""
                                            """),format.raw/*396.45*/("""<td>-</td>
                                        """)))}),format.raw/*397.42*/("""
                                    """),format.raw/*398.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">TAship Time</th>
                                        """),_display_(/*401.42*/if(tajobApplication.getTaSMUTime!="null" && tajobApplication.getTaSMUTime != "")/*401.122*/ {_display_(Seq[Any](format.raw/*401.124*/("""
                                            """),format.raw/*402.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*402.81*/tajobApplication/*402.97*/.getTaSMUTime),format.raw/*402.110*/("""</td>
                                        """)))}/*403.43*/else/*403.48*/{_display_(Seq[Any](format.raw/*403.49*/("""
                                            """),format.raw/*404.45*/("""<td>-</td>
                                        """)))}),format.raw/*405.42*/("""
                                    """),format.raw/*406.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">TA Supervisor Name</th>
                                        """),_display_(/*409.42*/if(tajobApplication.getTaSMUAdvisorName!="null" && tajobApplication.getTaSMUAdvisorName != "")/*409.136*/ {_display_(Seq[Any](format.raw/*409.138*/("""
                                            """),format.raw/*410.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*410.81*/tajobApplication/*410.97*/.getTaSMUAdvisorName),format.raw/*410.117*/("""</td>
                                        """)))}/*411.43*/else/*411.48*/{_display_(Seq[Any](format.raw/*411.49*/("""
                                            """),format.raw/*412.45*/("""<td>-</td>
                                        """)))}),format.raw/*413.42*/("""
                                    """),format.raw/*414.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">TA Supervisor Email</th>
                                        """),_display_(/*417.42*/if(tajobApplication.getTaSMUAdvisorEmail!="null" && tajobApplication.getTaSMUAdvisorEmail != "")/*417.138*/ {_display_(Seq[Any](format.raw/*417.140*/("""
                                            """),format.raw/*418.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*418.81*/tajobApplication/*418.97*/.getTaSMUAdvisorEmail),format.raw/*418.118*/("""</td>
                                        """)))}/*419.43*/else/*419.48*/{_display_(Seq[Any](format.raw/*419.49*/("""
                                            """),format.raw/*420.45*/("""<td>-</td>
                                        """)))}),format.raw/*421.42*/("""
                                    """),format.raw/*422.37*/("""</tr>

                                    <th>Programming Language</th>
                                    <tr>
                                        <th style="max-width: 50px">C++</th>
                                        """),_display_(/*427.42*/if(tajobApplication.getProgrammingLanguageCpp!="null" && tajobApplication.getProgrammingLanguageCpp != "")/*427.148*/ {_display_(Seq[Any](format.raw/*427.150*/("""
                                            """),_display_(/*428.46*/if(tajobApplication.getProgrammingLanguageCpp == 1)/*428.97*/{_display_(Seq[Any](format.raw/*428.98*/("""
                                                """),format.raw/*429.49*/("""<td style="word-wrap: break-word;">Expert</td>
                                            """)))}),format.raw/*430.46*/("""
                                            """),_display_(/*431.46*/if(tajobApplication.getProgrammingLanguageCpp == 2)/*431.97*/{_display_(Seq[Any](format.raw/*431.98*/("""
                                                """),format.raw/*432.49*/("""<td style="word-wrap: break-word;">Knowledgeable</td>
                                            """)))}),format.raw/*433.46*/("""
                                            """),_display_(/*434.46*/if(tajobApplication.getProgrammingLanguageCpp == 3)/*434.97*/{_display_(Seq[Any](format.raw/*434.98*/("""
                                                """),format.raw/*435.49*/("""<td style="word-wrap: break-word;">Familiar</td>
                                            """)))}),format.raw/*436.46*/("""
                                            """),_display_(/*437.46*/if(tajobApplication.getProgrammingLanguageCpp == 4)/*437.97*/ {_display_(Seq[Any](format.raw/*437.99*/("""
                                                """),format.raw/*438.49*/("""<td style="word-wrap: break-word;">Not Familiar</td>
                                            """)))}),format.raw/*439.46*/("""
                                        """)))}/*440.43*/else/*440.48*/{_display_(Seq[Any](format.raw/*440.49*/("""
                                            """),format.raw/*441.45*/("""<td>-</td>
                                        """)))}),format.raw/*442.42*/("""
                                    """),format.raw/*443.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">Java</th>
                                        """),_display_(/*446.42*/if(tajobApplication.getProgrammingLanguageJava!="null" && tajobApplication.getProgrammingLanguageJava != "")/*446.150*/ {_display_(Seq[Any](format.raw/*446.152*/("""
                                            """),_display_(/*447.46*/if(tajobApplication.getProgrammingLanguageJava == 1)/*447.98*/ {_display_(Seq[Any](format.raw/*447.100*/("""
                                                """),format.raw/*448.49*/("""<td style="word-wrap: break-word;">Expert</td>
                                            """)))}),format.raw/*449.46*/("""
                                            """),_display_(/*450.46*/if(tajobApplication.getProgrammingLanguageJava == 2)/*450.98*/ {_display_(Seq[Any](format.raw/*450.100*/("""
                                                """),format.raw/*451.49*/("""<td style="word-wrap: break-word;">Knowledgeable</td>
                                            """)))}),format.raw/*452.46*/("""
                                            """),_display_(/*453.46*/if(tajobApplication.getProgrammingLanguageJava == 3)/*453.98*/ {_display_(Seq[Any](format.raw/*453.100*/("""
                                                """),format.raw/*454.49*/("""<td style="word-wrap: break-word;">Familiar</td>
                                            """)))}),format.raw/*455.46*/("""
                                            """),_display_(/*456.46*/if(tajobApplication.getProgrammingLanguageJava == 4)/*456.98*/ {_display_(Seq[Any](format.raw/*456.100*/("""
                                                """),format.raw/*457.49*/("""<td style="word-wrap: break-word;">Not Familiar</td>
                                            """)))}),format.raw/*458.46*/("""
                                        """)))}/*459.43*/else/*459.48*/{_display_(Seq[Any](format.raw/*459.49*/("""
                                            """),format.raw/*460.45*/("""<td>-</td>
                                        """)))}),format.raw/*461.42*/("""
                                    """),format.raw/*462.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">Python</th>
                                        """),_display_(/*465.42*/if(tajobApplication.getProgrammingLanguagePython!="null" && tajobApplication.getProgrammingLanguagePython != "")/*465.154*/ {_display_(Seq[Any](format.raw/*465.156*/("""
                                            """),_display_(/*466.46*/if(tajobApplication.getProgrammingLanguagePython == 1)/*466.100*/ {_display_(Seq[Any](format.raw/*466.102*/("""
                                                """),format.raw/*467.49*/("""<td style="word-wrap: break-word;">Expert</td>
                                            """)))}),format.raw/*468.46*/("""
                                            """),_display_(/*469.46*/if(tajobApplication.getProgrammingLanguagePython == 2)/*469.100*/ {_display_(Seq[Any](format.raw/*469.102*/("""
                                                """),format.raw/*470.49*/("""<td style="word-wrap: break-word;">Knowledgeable</td>
                                            """)))}),format.raw/*471.46*/("""
                                            """),_display_(/*472.46*/if(tajobApplication.getProgrammingLanguagePython == 3)/*472.100*/ {_display_(Seq[Any](format.raw/*472.102*/("""
                                                """),format.raw/*473.49*/("""<td style="word-wrap: break-word;">Familiar</td>
                                            """)))}),format.raw/*474.46*/("""
                                            """),_display_(/*475.46*/if(tajobApplication.getProgrammingLanguagePython == 4)/*475.100*/ {_display_(Seq[Any](format.raw/*475.102*/("""
                                                """),format.raw/*476.49*/("""<td style="word-wrap: break-word;">Not Familiar</td>
                                            """)))}),format.raw/*477.46*/("""
                                        """)))}/*478.43*/else/*478.48*/{_display_(Seq[Any](format.raw/*478.49*/("""
                                            """),format.raw/*479.45*/("""<td>-</td>
                                        """)))}),format.raw/*480.42*/("""
                                    """),format.raw/*481.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">R</th>
                                        """),_display_(/*484.42*/if(tajobApplication.getProgrammingLanguageR!="null" && tajobApplication.getProgrammingLanguageR != "")/*484.144*/ {_display_(Seq[Any](format.raw/*484.146*/("""
                                            """),_display_(/*485.46*/if(tajobApplication.getProgrammingLanguageR == 1)/*485.95*/ {_display_(Seq[Any](format.raw/*485.97*/("""
                                                """),format.raw/*486.49*/("""<td style="word-wrap: break-word;">Expert</td>
                                            """)))}),format.raw/*487.46*/("""
                                            """),_display_(/*488.46*/if(tajobApplication.getProgrammingLanguageR == 2)/*488.95*/ {_display_(Seq[Any](format.raw/*488.97*/("""
                                                """),format.raw/*489.49*/("""<td style="word-wrap: break-word;">Knowledgeable</td>
                                            """)))}),format.raw/*490.46*/("""
                                            """),_display_(/*491.46*/if(tajobApplication.getProgrammingLanguageR == 3)/*491.95*/ {_display_(Seq[Any](format.raw/*491.97*/("""
                                                """),format.raw/*492.49*/("""<td style="word-wrap: break-word;">Familiar</td>
                                            """)))}),format.raw/*493.46*/("""
                                            """),_display_(/*494.46*/if(tajobApplication.getProgrammingLanguageR == 4)/*494.95*/ {_display_(Seq[Any](format.raw/*494.97*/("""
                                                """),format.raw/*495.49*/("""<td style="word-wrap: break-word;">Not Familiar</td>
                                            """)))}),format.raw/*496.46*/("""
                                        """)))}/*497.43*/else/*497.48*/{_display_(Seq[Any](format.raw/*497.49*/("""
                                            """),format.raw/*498.45*/("""<td>-</td>
                                        """)))}),format.raw/*499.42*/("""
                                    """),format.raw/*500.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">SQL</th>
                                        """),_display_(/*503.42*/if(tajobApplication.getProgrammingLanguageSQL !="null" && tajobApplication.getProgrammingLanguageSQL != "")/*503.149*/ {_display_(Seq[Any](format.raw/*503.151*/("""
                                            """),_display_(/*504.46*/if(tajobApplication.getProgrammingLanguageSQL == 1)/*504.97*/ {_display_(Seq[Any](format.raw/*504.99*/("""
                                                """),format.raw/*505.49*/("""<td style="word-wrap: break-word;">Expert</td>
                                            """)))}),format.raw/*506.46*/("""
                                            """),_display_(/*507.46*/if(tajobApplication.getProgrammingLanguageSQL == 2)/*507.97*/ {_display_(Seq[Any](format.raw/*507.99*/("""
                                                """),format.raw/*508.49*/("""<td style="word-wrap: break-word;">Knowledgeable</td>
                                            """)))}),format.raw/*509.46*/("""
                                            """),_display_(/*510.46*/if(tajobApplication.getProgrammingLanguageSQL == 3)/*510.97*/ {_display_(Seq[Any](format.raw/*510.99*/("""
                                                """),format.raw/*511.49*/("""<td style="word-wrap: break-word;">Familiar</td>
                                            """)))}),format.raw/*512.46*/("""
                                            """),_display_(/*513.46*/if(tajobApplication.getProgrammingLanguageSQL == 4)/*513.97*/ {_display_(Seq[Any](format.raw/*513.99*/("""
                                                """),format.raw/*514.49*/("""<td style="word-wrap: break-word;">Not Familiar</td>
                                            """)))}),format.raw/*515.46*/("""
                                        """)))}/*516.43*/else/*516.48*/{_display_(Seq[Any](format.raw/*516.49*/("""
                                            """),format.raw/*517.45*/("""<td>-</td>
                                        """)))}),format.raw/*518.42*/("""
                                    """),format.raw/*519.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">Javascript</th>
                                        """),_display_(/*522.42*/if(tajobApplication.getProgrammingLanguageJavascript !="null" && tajobApplication.getProgrammingLanguageJavascript != "")/*522.163*/ {_display_(Seq[Any](format.raw/*522.165*/("""
                                            """),_display_(/*523.46*/if(tajobApplication.getProgrammingLanguageJavascript == 1)/*523.104*/ {_display_(Seq[Any](format.raw/*523.106*/("""
                                                """),format.raw/*524.49*/("""<td style="word-wrap: break-word;">Expert</td>
                                            """)))}),format.raw/*525.46*/("""
                                            """),_display_(/*526.46*/if(tajobApplication.getProgrammingLanguageJavascript == 2)/*526.104*/ {_display_(Seq[Any](format.raw/*526.106*/("""
                                                """),format.raw/*527.49*/("""<td style="word-wrap: break-word;">Knowledgeable</td>
                                            """)))}),format.raw/*528.46*/("""
                                            """),_display_(/*529.46*/if(tajobApplication.getProgrammingLanguageJavascript == 3)/*529.104*/ {_display_(Seq[Any](format.raw/*529.106*/("""
                                                """),format.raw/*530.49*/("""<td style="word-wrap: break-word;">Familiar</td>
                                            """)))}),format.raw/*531.46*/("""
                                            """),_display_(/*532.46*/if(tajobApplication.getProgrammingLanguageJavascript == 4)/*532.104*/ {_display_(Seq[Any](format.raw/*532.106*/("""
                                                """),format.raw/*533.49*/("""<td style="word-wrap: break-word;">Not Familiar</td>
                                            """)))}),format.raw/*534.46*/("""
                                        """)))}/*535.43*/else/*535.48*/{_display_(Seq[Any](format.raw/*535.49*/("""
                                            """),format.raw/*536.45*/("""<td>-</td>
                                        """)))}),format.raw/*537.42*/("""
                                    """),format.raw/*538.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">Verilog</th>
                                        """),_display_(/*541.42*/if(tajobApplication.getProgrammingLanguageVerilog!="null" && tajobApplication.getProgrammingLanguageVerilog != "")/*541.156*/ {_display_(Seq[Any](format.raw/*541.158*/("""
                                            """),_display_(/*542.46*/if(tajobApplication.getProgrammingLanguageVerilog == 1)/*542.101*/ {_display_(Seq[Any](format.raw/*542.103*/("""
                                                """),format.raw/*543.49*/("""<td style="word-wrap: break-word;">Expert</td>
                                            """)))}),format.raw/*544.46*/("""
                                            """),_display_(/*545.46*/if(tajobApplication.getProgrammingLanguageVerilog == 2)/*545.101*/ {_display_(Seq[Any](format.raw/*545.103*/("""
                                                """),format.raw/*546.49*/("""<td style="word-wrap: break-word;">Knowledgeable</td>
                                            """)))}),format.raw/*547.46*/("""
                                            """),_display_(/*548.46*/if(tajobApplication.getProgrammingLanguageVerilog == 3)/*548.101*/ {_display_(Seq[Any](format.raw/*548.103*/("""
                                                """),format.raw/*549.49*/("""<td style="word-wrap: break-word;">Familiar</td>
                                            """)))}),format.raw/*550.46*/("""
                                            """),_display_(/*551.46*/if(tajobApplication.getProgrammingLanguageVerilog == 4)/*551.101*/ {_display_(Seq[Any](format.raw/*551.103*/("""
                                                """),format.raw/*552.49*/("""<td style="word-wrap: break-word;">Not Familiar</td>
                                            """)))}),format.raw/*553.46*/("""
                                        """)))}/*554.43*/else/*554.48*/{_display_(Seq[Any](format.raw/*554.49*/("""
                                            """),format.raw/*555.45*/("""<td>-</td>
                                        """)))}),format.raw/*556.42*/("""
                                    """),format.raw/*557.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">Assembler</th>
                                        """),_display_(/*560.42*/if(tajobApplication.getProgrammingLanguageAssembler!="null" && tajobApplication.getProgrammingLanguageAssembler != "")/*560.160*/ {_display_(Seq[Any](format.raw/*560.162*/("""
                                            """),_display_(/*561.46*/if(tajobApplication.getProgrammingLanguageAssembler == 1)/*561.103*/ {_display_(Seq[Any](format.raw/*561.105*/("""
                                                """),format.raw/*562.49*/("""<td style="word-wrap: break-word;">Expert</td>
                                            """)))}),format.raw/*563.46*/("""
                                            """),_display_(/*564.46*/if(tajobApplication.getProgrammingLanguageAssembler == 2)/*564.103*/ {_display_(Seq[Any](format.raw/*564.105*/("""
                                                """),format.raw/*565.49*/("""<td style="word-wrap: break-word;">Knowledgeable</td>
                                            """)))}),format.raw/*566.46*/("""
                                            """),_display_(/*567.46*/if(tajobApplication.getProgrammingLanguageAssembler == 3)/*567.103*/ {_display_(Seq[Any](format.raw/*567.105*/("""
                                                """),format.raw/*568.49*/("""<td style="word-wrap: break-word;">Familiar</td>
                                            """)))}),format.raw/*569.46*/("""
                                            """),_display_(/*570.46*/if(tajobApplication.getProgrammingLanguageAssembler == 4)/*570.103*/ {_display_(Seq[Any](format.raw/*570.105*/("""
                                                """),format.raw/*571.49*/("""<td style="word-wrap: break-word;">Not Familiar</td>
                                            """)))}),format.raw/*572.46*/("""
                                        """)))}/*573.43*/else/*573.48*/{_display_(Seq[Any](format.raw/*573.49*/("""
                                            """),format.raw/*574.45*/("""<td>-</td>
                                        """)))}),format.raw/*575.42*/("""
                                    """),format.raw/*576.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">Assembler: List Type</th>

                                        """),_display_(/*580.42*/if(tajobApplication.getProgrammingLanguageAssemblerType!="null" && tajobApplication.getProgrammingLanguageAssemblerType != "")/*580.168*/ {_display_(Seq[Any](format.raw/*580.170*/("""
                                            """),format.raw/*581.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*581.81*/tajobApplication/*581.97*/.getProgrammingLanguageAssemblerType),format.raw/*581.133*/("""</td>
                                        """)))}/*582.43*/else/*582.48*/{_display_(Seq[Any](format.raw/*582.49*/("""
                                            """),format.raw/*583.45*/("""<td>-</td>
                                        """)))}),format.raw/*584.42*/("""
                                    """),format.raw/*585.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">Computer Systems: List Type</th>

                                        """),_display_(/*589.42*/if(tajobApplication.getComputerSystemsType!="null" && tajobApplication.getComputerSystemsType != "")/*589.142*/ {_display_(Seq[Any](format.raw/*589.144*/("""
                                            """),format.raw/*590.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*590.81*/tajobApplication/*590.97*/.getComputerSystemsType),format.raw/*590.120*/("""</td>
                                        """)))}/*591.43*/else/*591.48*/{_display_(Seq[Any](format.raw/*591.49*/("""
                                            """),format.raw/*592.45*/("""<td>-</td>
                                        """)))}),format.raw/*593.42*/("""
                                    """),format.raw/*594.37*/("""</tr>

                                    <tr>
                                        <th style="max-width: 50px">Courses TA Preferred</th>

                                        """),_display_(/*599.42*/if(tajobApplication.getTaCoursesPreferenceHidden!="null" && tajobApplication.getTaCoursesPreferenceHidden != "")/*599.154*/ {_display_(Seq[Any](format.raw/*599.156*/("""
                                            """),format.raw/*600.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*600.81*/tajobApplication/*600.97*/.getTaCoursesPreferenceHidden),format.raw/*600.126*/("""</td>
                                        """)))}/*601.43*/else/*601.48*/{_display_(Seq[Any](format.raw/*601.49*/("""
                                            """),format.raw/*602.45*/("""<td>-</td>
                                        """)))}),format.raw/*603.42*/("""
                                    """),format.raw/*604.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">Courses TA Not Preferred</th>

                                        """),_display_(/*608.42*/if(tajobApplication.getTaCoursesNotPreferenceHidden!="null" && tajobApplication.getTaCoursesNotPreferenceHidden != "")/*608.160*/ {_display_(Seq[Any](format.raw/*608.162*/("""
                                            """),format.raw/*609.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*609.81*/tajobApplication/*609.97*/.getTaCoursesNotPreferenceHidden),format.raw/*609.129*/("""</td>
                                        """)))}/*610.43*/else/*610.48*/{_display_(Seq[Any](format.raw/*610.49*/("""
                                            """),format.raw/*611.45*/("""<td>-</td>
                                        """)))}),format.raw/*612.42*/("""
                                    """),format.raw/*613.37*/("""</tr>

                                    <th>Previous Teaching Experience</th>
                                    <tr>
                                        <th style="max-width: 50px">1. Course Title</th>

                                        """),_display_(/*619.42*/if(tajobApplication.getPreviousTeachingExp1Title!="null" && tajobApplication.getPreviousTeachingExp1Title != "")/*619.154*/ {_display_(Seq[Any](format.raw/*619.156*/("""
                                            """),format.raw/*620.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*620.81*/tajobApplication/*620.97*/.getPreviousTeachingExp1Title),format.raw/*620.126*/("""</td>
                                        """)))}/*621.43*/else/*621.48*/{_display_(Seq[Any](format.raw/*621.49*/("""
                                            """),format.raw/*622.45*/("""<td>-</td>
                                        """)))}),format.raw/*623.42*/("""

                                    """),format.raw/*625.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">1. Course Place</th>

                                        """),_display_(/*629.42*/if(tajobApplication.getPreviousTeachingExp1Where!="null" && tajobApplication.getPreviousTeachingExp1Where != "")/*629.154*/ {_display_(Seq[Any](format.raw/*629.156*/("""
                                            """),format.raw/*630.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*630.81*/tajobApplication/*630.97*/.getPreviousTeachingExp1Where),format.raw/*630.126*/("""</td>
                                        """)))}/*631.43*/else/*631.48*/{_display_(Seq[Any](format.raw/*631.49*/("""
                                            """),format.raw/*632.45*/("""<td>-</td>
                                        """)))}),format.raw/*633.42*/("""

                                    """),format.raw/*635.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">1. Course Date</th>

                                        """),_display_(/*639.42*/if(tajobApplication.getPreviousTeachingExp1Date!="null" && tajobApplication.getPreviousTeachingExp1Date != "")/*639.152*/ {_display_(Seq[Any](format.raw/*639.154*/("""
                                            """),format.raw/*640.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*640.81*/tajobApplication/*640.97*/.getPreviousTeachingExp1Date),format.raw/*640.125*/("""</td>
                                        """)))}/*641.43*/else/*641.48*/{_display_(Seq[Any](format.raw/*641.49*/("""
                                            """),format.raw/*642.45*/("""<td>-</td>
                                        """)))}),format.raw/*643.42*/("""

                                    """),format.raw/*645.37*/("""</tr>

                                    <tr>
                                        <th style="max-width: 50px">2. Course Title</th>

                                        """),_display_(/*650.42*/if(tajobApplication.getPreviousTeachingExp2Title!="null" && tajobApplication.getPreviousTeachingExp2Title != "")/*650.154*/ {_display_(Seq[Any](format.raw/*650.156*/("""
                                            """),format.raw/*651.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*651.81*/tajobApplication/*651.97*/.getPreviousTeachingExp2Title),format.raw/*651.126*/("""</td>
                                        """)))}/*652.43*/else/*652.48*/{_display_(Seq[Any](format.raw/*652.49*/("""
                                            """),format.raw/*653.45*/("""<td>-</td>
                                        """)))}),format.raw/*654.42*/("""

                                    """),format.raw/*656.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">2. Course Place</th>

                                        """),_display_(/*660.42*/if(tajobApplication.getPreviousTeachingExp2Where!="null" && tajobApplication.getPreviousTeachingExp2Where != "")/*660.154*/ {_display_(Seq[Any](format.raw/*660.156*/("""
                                            """),format.raw/*661.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*661.81*/tajobApplication/*661.97*/.getPreviousTeachingExp2Where),format.raw/*661.126*/("""</td>
                                        """)))}/*662.43*/else/*662.48*/{_display_(Seq[Any](format.raw/*662.49*/("""
                                            """),format.raw/*663.45*/("""<td>-</td>
                                        """)))}),format.raw/*664.42*/("""

                                    """),format.raw/*666.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">2. Course Date</th>

                                        """),_display_(/*670.42*/if(tajobApplication.getPreviousTeachingExp2Date!="null" && tajobApplication.getPreviousTeachingExp2Date != "")/*670.152*/ {_display_(Seq[Any](format.raw/*670.154*/("""
                                            """),format.raw/*671.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*671.81*/tajobApplication/*671.97*/.getPreviousTeachingExp2Date),format.raw/*671.125*/("""</td>
                                        """)))}/*672.43*/else/*672.48*/{_display_(Seq[Any](format.raw/*672.49*/("""
                                            """),format.raw/*673.45*/("""<td>-</td>
                                        """)))}),format.raw/*674.42*/("""

                                    """),format.raw/*676.37*/("""</tr>

                                    <tr>
                                        <th style="max-width: 50px">3. Course Title</th>

                                        """),_display_(/*681.42*/if(tajobApplication.getPreviousTeachingExp3Title!="null" && tajobApplication.getPreviousTeachingExp3Title != "")/*681.154*/ {_display_(Seq[Any](format.raw/*681.156*/("""
                                            """),format.raw/*682.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*682.81*/tajobApplication/*682.97*/.getPreviousTeachingExp3Title),format.raw/*682.126*/("""</td>
                                        """)))}/*683.43*/else/*683.48*/{_display_(Seq[Any](format.raw/*683.49*/("""
                                            """),format.raw/*684.45*/("""<td>-</td>
                                        """)))}),format.raw/*685.42*/("""

                                    """),format.raw/*687.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">3. Course Place</th>

                                        """),_display_(/*691.42*/if(tajobApplication.getPreviousTeachingExp3Where!="null" && tajobApplication.getPreviousTeachingExp3Where != "")/*691.154*/ {_display_(Seq[Any](format.raw/*691.156*/("""
                                            """),format.raw/*692.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*692.81*/tajobApplication/*692.97*/.getPreviousTeachingExp3Where),format.raw/*692.126*/("""</td>
                                        """)))}/*693.43*/else/*693.48*/{_display_(Seq[Any](format.raw/*693.49*/("""
                                            """),format.raw/*694.45*/("""<td>-</td>
                                        """)))}),format.raw/*695.42*/("""

                                    """),format.raw/*697.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">3. Course Date</th>

                                        """),_display_(/*701.42*/if(tajobApplication.getPreviousTeachingExp3Date!="null" && tajobApplication.getPreviousTeachingExp3Date != "")/*701.152*/ {_display_(Seq[Any](format.raw/*701.154*/("""
                                            """),format.raw/*702.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*702.81*/tajobApplication/*702.97*/.getPreviousTeachingExp3Date),format.raw/*702.125*/("""</td>
                                        """)))}/*703.43*/else/*703.48*/{_display_(Seq[Any](format.raw/*703.49*/("""
                                            """),format.raw/*704.45*/("""<td>-</td>
                                        """)))}),format.raw/*705.42*/("""

                                    """),format.raw/*707.37*/("""</tr>

                                    <tr>
                                        <th style="max-width: 50px">US Citizen/Permanent Resident</th>
                                        """),_display_(/*711.42*/if(tajobApplication.getTaUSCitizen!="null" && tajobApplication.getTaUSCitizen != "")/*711.126*/ {_display_(Seq[Any](format.raw/*711.128*/("""
                                            """),_display_(/*712.46*/if(tajobApplication.getTaUSCitizen == 1)/*712.86*/ {_display_(Seq[Any](format.raw/*712.88*/("""
                                                """),format.raw/*713.49*/("""<td style="word-wrap: break-word;">Yes</td>
                                            """)))}),format.raw/*714.46*/("""
                                            """),_display_(/*715.46*/if(tajobApplication.getTaUSCitizen == 2)/*715.86*/ {_display_(Seq[Any](format.raw/*715.88*/("""
                                                """),format.raw/*716.49*/("""<td style="word-wrap: break-word;">No</td>
                                            """)))}),format.raw/*717.46*/("""

                                        """)))}/*719.43*/else/*719.48*/{_display_(Seq[Any](format.raw/*719.49*/("""
                                            """),format.raw/*720.45*/("""<td>-</td>
                                        """)))}),format.raw/*721.42*/("""
                                    """),format.raw/*722.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">English as Native Language</th>
                                        """),_display_(/*725.42*/if(tajobApplication.getTaNativeLanguage!="null" && tajobApplication.getTaNativeLanguage != "")/*725.136*/ {_display_(Seq[Any](format.raw/*725.138*/("""
                                            """),_display_(/*726.46*/if(tajobApplication.getTaNativeLanguage == 1)/*726.91*/ {_display_(Seq[Any](format.raw/*726.93*/("""
                                                """),format.raw/*727.49*/("""<td style="word-wrap: break-word;">Yes</td>
                                            """)))}),format.raw/*728.46*/("""
                                            """),_display_(/*729.46*/if(tajobApplication.getTaNativeLanguage == 2)/*729.91*/ {_display_(Seq[Any](format.raw/*729.93*/("""
                                                """),format.raw/*730.49*/("""<td style="word-wrap: break-word;">No</td>
                                            """)))}),format.raw/*731.46*/("""

                                        """)))}/*733.43*/else/*733.48*/{_display_(Seq[Any](format.raw/*733.49*/("""
                                            """),format.raw/*734.45*/("""<td>-</td>
                                        """)))}),format.raw/*735.42*/("""
                                    """),format.raw/*736.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">English Proficiency Test</th>
                                        """),_display_(/*739.42*/if(tajobApplication.getTaEnglishProficiencyTest!="null" && tajobApplication.getTaEnglishProficiencyTest != "")/*739.152*/ {_display_(Seq[Any](format.raw/*739.154*/("""
                                            """),_display_(/*740.46*/if(tajobApplication.getTaEnglishProficiencyTest == 1)/*740.99*/ {_display_(Seq[Any](format.raw/*740.101*/("""
                                                """),format.raw/*741.49*/("""<td style="word-wrap: break-word;">Yes</td>
                                            """)))}),format.raw/*742.46*/("""
                                            """),_display_(/*743.46*/if(tajobApplication.getTaEnglishProficiencyTest == 2)/*743.99*/ {_display_(Seq[Any](format.raw/*743.101*/("""
                                                """),format.raw/*744.49*/("""<td style="word-wrap: break-word;">No</td>
                                            """)))}),format.raw/*745.46*/("""

                                        """)))}/*747.43*/else/*747.48*/{_display_(Seq[Any](format.raw/*747.49*/("""
                                            """),format.raw/*748.45*/("""<td>-</td>
                                        """)))}),format.raw/*749.42*/("""
                                    """),format.raw/*750.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">English Proficiency Name</th>

                                        """),_display_(/*754.42*/if(tajobApplication.getTaEnglishProficiencyTestName!="null" && tajobApplication.getTaEnglishProficiencyTestName != "")/*754.160*/ {_display_(Seq[Any](format.raw/*754.162*/("""
                                            """),format.raw/*755.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*755.81*/tajobApplication/*755.97*/.getTaEnglishProficiencyTestName),format.raw/*755.129*/("""</td>
                                        """)))}/*756.43*/else/*756.48*/{_display_(Seq[Any](format.raw/*756.49*/("""
                                            """),format.raw/*757.45*/("""<td>-</td>
                                        """)))}),format.raw/*758.42*/("""

                                    """),format.raw/*760.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">English Proficiency Score</th>

                                        """),_display_(/*764.42*/if(tajobApplication.getTaEnglishProficiencyTestScore!="null" && tajobApplication.getTaEnglishProficiencyTestScore != "")/*764.162*/ {_display_(Seq[Any](format.raw/*764.164*/("""
                                            """),format.raw/*765.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*765.81*/tajobApplication/*765.97*/.getTaEnglishProficiencyTestScore),format.raw/*765.130*/("""</td>
                                        """)))}/*766.43*/else/*766.48*/{_display_(Seq[Any](format.raw/*766.49*/("""
                                            """),format.raw/*767.45*/("""<td>-</td>
                                        """)))}),format.raw/*768.42*/("""

                                    """),format.raw/*770.37*/("""</tr>

                                    <tr>
                                        <th style="max-width: 50px">English Proficiency Date</th>

                                        """),_display_(/*775.42*/if(tajobApplication.getTaEnglishProficiencyTestDate!="null" && tajobApplication.getTaEnglishProficiencyTestDate != "")/*775.160*/ {_display_(Seq[Any](format.raw/*775.162*/("""
                                            """),format.raw/*776.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*776.81*/tajobApplication/*776.97*/.getTaEnglishProficiencyTestDate),format.raw/*776.129*/("""</td>
                                        """)))}/*777.43*/else/*777.48*/{_display_(Seq[Any](format.raw/*777.49*/("""
                                            """),format.raw/*778.45*/("""<td>-</td>
                                        """)))}),format.raw/*779.42*/("""

                                    """),format.raw/*781.37*/("""</tr>

                                    <tr>
                                        <th style="max-width: 50px">Cover Letter</th>

                                        """),_display_(/*786.42*/if(tajobApplication.getApplyCoverLetter!="null" && tajobApplication.getApplyCoverLetter != "")/*786.136*/ {_display_(Seq[Any](format.raw/*786.138*/("""
                                            """),format.raw/*787.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*787.81*/tajobApplication/*787.97*/.getApplyCoverLetter),format.raw/*787.117*/("""</td>
                                        """)))}/*788.43*/else/*788.48*/{_display_(Seq[Any](format.raw/*788.49*/("""
                                            """),format.raw/*789.45*/("""<td>-</td>
                                        """)))}),format.raw/*790.42*/("""

                                    """),format.raw/*792.37*/("""</tr>
                                    """),format.raw/*793.81*/("""
"""),format.raw/*794.90*/("""
"""),format.raw/*795.142*/("""
"""),format.raw/*796.126*/("""
"""),format.raw/*797.53*/("""
"""),format.raw/*798.59*/("""
"""),format.raw/*799.46*/("""
"""),format.raw/*800.46*/("""

"""),format.raw/*802.45*/("""

"""),format.raw/*804.91*/("""
"""),format.raw/*805.325*/("""
"""),format.raw/*806.201*/("""
"""),format.raw/*807.53*/("""
"""),format.raw/*808.59*/("""
"""),format.raw/*809.46*/("""
"""),format.raw/*810.46*/("""
"""),format.raw/*811.45*/("""
"""),format.raw/*812.85*/("""
"""),format.raw/*813.136*/("""
"""),format.raw/*814.123*/("""
"""),format.raw/*815.53*/("""
"""),format.raw/*816.59*/("""
"""),format.raw/*817.46*/("""
"""),format.raw/*818.46*/("""
"""),format.raw/*819.45*/("""
"""),format.raw/*820.85*/("""
"""),format.raw/*821.136*/("""
"""),format.raw/*822.123*/("""
"""),format.raw/*823.53*/("""
"""),format.raw/*824.59*/("""
"""),format.raw/*825.46*/("""
"""),format.raw/*826.46*/("""


"""),format.raw/*829.45*/("""
"""),format.raw/*830.91*/("""
"""),format.raw/*831.325*/("""
"""),format.raw/*832.201*/("""
"""),format.raw/*833.53*/("""
"""),format.raw/*834.59*/("""
"""),format.raw/*835.46*/("""
"""),format.raw/*836.46*/("""
"""),format.raw/*837.45*/("""
"""),format.raw/*838.85*/("""
"""),format.raw/*839.136*/("""
"""),format.raw/*840.123*/("""
"""),format.raw/*841.53*/("""
"""),format.raw/*842.59*/("""
"""),format.raw/*843.46*/("""


"""),format.raw/*846.46*/("""
"""),format.raw/*847.45*/("""
"""),format.raw/*848.85*/("""
"""),format.raw/*849.136*/("""
"""),format.raw/*850.123*/("""
"""),format.raw/*851.53*/("""
"""),format.raw/*852.59*/("""
"""),format.raw/*853.46*/("""
"""),format.raw/*854.46*/("""


"""),format.raw/*857.45*/("""
"""),format.raw/*858.91*/("""
"""),format.raw/*859.325*/("""
"""),format.raw/*860.201*/("""
"""),format.raw/*861.53*/("""
"""),format.raw/*862.59*/("""
"""),format.raw/*863.46*/("""
"""),format.raw/*864.46*/("""
"""),format.raw/*865.45*/("""
"""),format.raw/*866.85*/("""
"""),format.raw/*867.136*/("""
"""),format.raw/*868.123*/("""
"""),format.raw/*869.53*/("""
"""),format.raw/*870.59*/("""
"""),format.raw/*871.46*/("""


"""),format.raw/*874.46*/("""
"""),format.raw/*875.45*/("""
"""),format.raw/*876.85*/("""
"""),format.raw/*877.136*/("""
"""),format.raw/*878.123*/("""
"""),format.raw/*879.53*/("""
"""),format.raw/*880.59*/("""
"""),format.raw/*881.46*/("""
"""),format.raw/*882.46*/("""
                                """),format.raw/*883.33*/("""</tbody>
                            </table>
                        </div>
                    </div>
                    <div class="row center">
                        <form class="form-signin" enctype="multipart/form-data" id="editTechnologyForm" method="post" onsubmit="return getHTML()" action=""""),_display_(/*888.156*/routes/*888.162*/.TAJobController.tajobStatueChange(tajobApplication.getAppliedTAJob.getId, "pending")),format.raw/*888.247*/("""">
                            <button type="submit" id="technologyRegister" class="btn waves-effect waves-light blue darken-2">
                                Offer</button>
                            <a href=""""),_display_(/*891.39*/routes/*891.45*/.JobController.jobApplicationsList("tajob", tajobApplication.getAppliedTAJob.getId(), 1, "")),format.raw/*891.137*/("""" class="btn waves-effect waves-light red darken-2">
                                Reject</a>

                            <a href=""""),_display_(/*894.39*/routes/*894.45*/.JobController.jobApplicationsList("tajob", tajobApplication.getAppliedTAJob.getId(), 1, "")),format.raw/*894.137*/("""" class="btn waves-effect waves-light green darken-2">
                                Cancel</a>
                        </form>
                    </div>
                    <div class="row center">
                        <form class="form-signin" enctype="multipart/form-data" id="tajobApplicationExport" method="post" action=""""),_display_(/*899.132*/routes/*899.138*/.TAJobController.saveTAJobPdf(tajobApplication.getId)),format.raw/*899.191*/("""">
                            <button type="submit" id="tajobApplicationExportButton" class="btn waves-effect waves-light blue darken-2">
                                Export PDF</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>

""")))}))
      }
    }
  }

  def render(tajobApplication:TAJobApplication): play.twirl.api.HtmlFormat.Appendable = apply(tajobApplication)

  def f:((TAJobApplication) => play.twirl.api.HtmlFormat.Appendable) = (tajobApplication) => apply(tajobApplication)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:38 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/tajobApplicationDetail.scala.html
                  HASH: 7f84915651a2a7d3b26c98c3de882d2ce959b6cc
                  MATRIX: 814->1|1189->46|1298->85|1343->82|1371->101|1464->167|1492->168|1527->177|1639->262|1667->263|1707->276|1875->417|1904->418|1936->423|1964->424|1996->429|2051->456|2080->457|2116->466|2147->469|2176->470|2217->483|2431->669|2460->670|2505->687|2696->850|2725->851|2774->872|2842->912|2871->913|2916->930|3033->1019|3062->1020|3098->1029|3127->1030|3164->1039|3193->1040|3234->1053|3287->1079|3316->1080|3348->1085|3376->1086|3409->1092|3460->1115|3489->1116|3525->1125|3874->1447|3902->1448|3944->1464|3985->1496|4025->1498|4057->1503|4324->1790|4353->1843|4383->2006|4412->2067|4441->2127|4470->2181|4499->2235|4528->2274|4557->2309|4610->2334|4971->2668|4996->2684|5043->2709|5284->2923|5374->3003|5415->3005|5488->3050|5551->3086|5576->3102|5611->3115|5677->3163|5690->3168|5729->3169|5802->3214|5885->3266|5950->3303|6153->3479|6243->3559|6284->3561|6357->3606|6420->3642|6445->3658|6492->3683|6558->3731|6571->3736|6610->3737|6683->3782|6766->3834|6831->3871|7035->4048|7125->4128|7166->4130|7239->4175|7302->4211|7327->4227|7371->4249|7437->4297|7450->4302|7489->4303|7562->4348|7645->4400|7710->4437|7922->4622|8012->4702|8053->4704|8126->4749|8189->4785|8214->4801|8264->4829|8330->4877|8343->4882|8382->4883|8456->4928|8540->4980|8606->5017|8814->5197|8897->5269|8939->5271|9013->5316|9077->5352|9103->5368|9135->5377|9202->5425|9216->5430|9256->5431|9330->5476|9414->5528|9480->5565|9552->6726|9619->6764|9789->6906|9890->6996|9932->6998|10006->7044|10059->7087|10099->7088|10177->7137|10306->7234|10380->7280|10433->7323|10473->7324|10551->7373|10687->7477|10749->7520|10763->7525|10803->7526|10877->7571|10961->7623|11027->7660|11265->7870|11384->7978|11426->7980|11500->8026|11562->8078|11602->8079|11680->8128|11801->8217|11875->8263|11937->8315|11977->8316|12055->8365|12175->8453|12237->8496|12251->8501|12291->8502|12365->8547|12449->8599|12515->8636|12805->8898|12886->8968|12928->8970|13002->9015|13066->9051|13092->9067|13123->9075|13190->9123|13204->9128|13244->9129|13318->9174|13402->9226|13468->9263|13667->9434|13748->9504|13790->9506|13864->9551|13928->9587|13954->9603|13985->9611|14052->9659|14066->9664|14106->9665|14180->9710|14264->9762|14330->9799|14529->9970|14610->10040|14652->10042|14726->10087|14790->10123|14816->10139|14847->10147|14914->10195|14928->10200|14968->10201|15042->10246|15126->10298|15193->10336|15395->10510|15482->10586|15524->10588|15598->10633|15662->10669|15688->10685|15722->10696|15789->10744|15803->10749|15843->10750|15917->10795|16001->10847|16067->10884|16275->11064|16380->11158|16422->11160|16496->11205|16560->11241|16586->11257|16629->11277|16696->11325|16710->11330|16750->11331|16824->11376|16908->11428|16974->11465|17185->11648|17296->11748|17338->11750|17412->11795|17476->11831|17502->11847|17548->11870|17615->11918|17629->11923|17669->11924|17743->11969|17827->12021|17893->12058|18097->12234|18192->12318|18234->12320|18308->12365|18372->12401|18398->12417|18436->12432|18503->12480|18517->12485|18557->12486|18631->12531|18715->12583|18781->12620|18988->12799|19089->12889|19131->12891|19205->12936|19269->12972|19295->12988|19336->13006|19403->13054|19417->13059|19457->13060|19531->13105|19615->13157|19681->13194|19882->13367|19983->13457|20025->13459|20099->13504|20163->13540|20189->13556|20230->13574|20297->13622|20311->13627|20351->13628|20425->13673|20509->13725|20575->13762|20810->13969|20923->14071|20965->14073|21039->14118|21103->14154|21129->14170|21176->14194|21243->14242|21257->14247|21297->14248|21371->14293|21455->14345|21521->14382|21745->14578|21838->14660|21880->14662|21954->14707|22018->14743|22044->14759|22081->14773|22148->14821|22162->14826|22202->14827|22276->14872|22360->14924|22426->14961|22629->15136|22730->15226|22772->15228|22846->15273|22910->15309|22936->15325|22977->15343|23044->15391|23058->15396|23098->15397|23172->15442|23256->15494|23322->15531|23536->15717|23637->15807|23679->15809|23753->15855|23806->15898|23846->15899|23924->15948|24061->16053|24135->16099|24188->16142|24228->16143|24306->16192|24462->16316|24536->16362|24589->16405|24629->16406|24707->16455|24848->16564|24922->16610|24975->16653|25015->16654|25093->16703|25238->16816|25312->16862|25365->16905|25405->16906|25483->16955|25623->17063|25697->17109|25750->17152|25790->17153|25868->17202|25991->17293|26053->17336|26067->17341|26107->17342|26181->17387|26265->17439|26331->17476|26546->17663|26653->17759|26695->17761|26769->17807|26825->17853|26865->17854|26943->17903|27064->17992|27138->18038|27194->18084|27234->18085|27312->18134|27432->18222|27494->18265|27508->18270|27548->18271|27622->18316|27706->18368|27772->18405|28059->18664|28176->18770|28218->18772|28292->18817|28356->18853|28382->18869|28431->18895|28498->18943|28512->18948|28552->18949|28626->18994|28710->19046|28776->19083|28968->19247|29085->19353|29127->19355|29201->19400|29265->19436|29291->19452|29340->19478|29407->19526|29421->19531|29461->19532|29535->19577|29619->19629|29685->19666|29877->19830|29994->19936|30036->19938|30110->19983|30174->20019|30200->20035|30249->20061|30316->20109|30330->20114|30370->20115|30444->20160|30528->20212|30594->20249|30786->20413|30903->20519|30945->20521|31019->20566|31083->20602|31109->20618|31158->20644|31225->20692|31239->20697|31279->20698|31353->20743|31437->20795|31503->20832|31728->21029|31811->21101|31853->21103|31927->21149|31971->21183|32011->21184|32089->21233|32210->21322|32284->21368|32328->21402|32368->21403|32446->21452|32566->21540|32628->21583|32642->21588|32682->21589|32756->21634|32840->21686|32907->21724|33108->21897|33199->21977|33241->21979|33315->22024|33379->22060|33405->22076|33441->22089|33508->22137|33522->22142|33562->22143|33636->22188|33720->22240|33786->22277|33991->22454|34096->22548|34138->22550|34212->22595|34276->22631|34302->22647|34345->22667|34412->22715|34426->22720|34466->22721|34540->22766|34624->22818|34690->22855|34896->23033|35003->23129|35045->23131|35119->23176|35183->23212|35209->23228|35253->23249|35320->23297|35334->23302|35374->23303|35448->23348|35532->23400|35598->23437|35823->23634|35906->23706|35948->23708|36022->23754|36066->23788|36106->23789|36184->23838|36305->23927|36379->23973|36423->24007|36463->24008|36541->24057|36661->24145|36723->24188|36737->24193|36777->24194|36851->24239|36935->24291|37001->24328|37202->24501|37293->24581|37335->24583|37409->24628|37473->24664|37499->24680|37535->24693|37602->24741|37616->24746|37656->24747|37730->24792|37814->24844|37880->24881|38088->25061|38193->25155|38235->25157|38309->25202|38373->25238|38399->25254|38442->25274|38509->25322|38523->25327|38563->25328|38637->25373|38721->25425|38787->25462|38996->25643|39103->25739|39145->25741|39219->25786|39283->25822|39309->25838|39353->25859|39420->25907|39434->25912|39474->25913|39548->25958|39632->26010|39698->26047|39958->26279|40075->26385|40117->26387|40191->26433|40252->26484|40292->26485|40370->26534|40494->26626|40568->26672|40629->26723|40669->26724|40747->26773|40878->26872|40952->26918|41013->26969|41053->26970|41131->27019|41257->27113|41331->27159|41392->27210|41433->27212|41511->27261|41641->27359|41703->27402|41717->27407|41757->27408|41831->27453|41915->27505|41981->27542|42175->27708|42294->27816|42336->27818|42410->27864|42472->27916|42514->27918|42592->27967|42716->28059|42790->28105|42852->28157|42894->28159|42972->28208|43103->28307|43177->28353|43239->28405|43281->28407|43359->28456|43485->28550|43559->28596|43621->28648|43663->28650|43741->28699|43871->28797|43933->28840|43947->28845|43987->28846|44061->28891|44145->28943|44211->28980|44407->29148|44530->29260|44572->29262|44646->29308|44711->29362|44753->29364|44831->29413|44955->29505|45029->29551|45094->29605|45136->29607|45214->29656|45345->29755|45419->29801|45484->29855|45526->29857|45604->29906|45730->30000|45804->30046|45869->30100|45911->30102|45989->30151|46119->30249|46181->30292|46195->30297|46235->30298|46309->30343|46393->30395|46459->30432|46650->30595|46763->30697|46805->30699|46879->30745|46938->30794|46979->30796|47057->30845|47181->30937|47255->30983|47314->31032|47355->31034|47433->31083|47564->31182|47638->31228|47697->31277|47738->31279|47816->31328|47942->31422|48016->31468|48075->31517|48116->31519|48194->31568|48324->31666|48386->31709|48400->31714|48440->31715|48514->31760|48598->31812|48664->31849|48857->32014|48975->32121|49017->32123|49091->32169|49152->32220|49193->32222|49271->32271|49395->32363|49469->32409|49530->32460|49571->32462|49649->32511|49780->32610|49854->32656|49915->32707|49956->32709|50034->32758|50160->32852|50234->32898|50295->32949|50336->32951|50414->33000|50544->33098|50606->33141|50620->33146|50660->33147|50734->33192|50818->33244|50884->33281|51084->33453|51216->33574|51258->33576|51332->33622|51401->33680|51443->33682|51521->33731|51645->33823|51719->33869|51788->33927|51830->33929|51908->33978|52039->34077|52113->34123|52182->34181|52224->34183|52302->34232|52428->34326|52502->34372|52571->34430|52613->34432|52691->34481|52821->34579|52883->34622|52897->34627|52937->34628|53011->34673|53095->34725|53161->34762|53358->34931|53483->35045|53525->35047|53599->35093|53665->35148|53707->35150|53785->35199|53909->35291|53983->35337|54049->35392|54091->35394|54169->35443|54300->35542|54374->35588|54440->35643|54482->35645|54560->35694|54686->35788|54760->35834|54826->35889|54868->35891|54946->35940|55076->36038|55138->36081|55152->36086|55192->36087|55266->36132|55350->36184|55416->36221|55615->36392|55744->36510|55786->36512|55860->36558|55928->36615|55970->36617|56048->36666|56172->36758|56246->36804|56314->36861|56356->36863|56434->36912|56565->37011|56639->37057|56707->37114|56749->37116|56827->37165|56953->37259|57027->37305|57095->37362|57137->37364|57215->37413|57345->37511|57407->37554|57421->37559|57461->37560|57535->37605|57619->37657|57685->37694|57896->37877|58033->38003|58075->38005|58149->38050|58213->38086|58239->38102|58298->38138|58365->38186|58379->38191|58419->38192|58493->38237|58577->38289|58643->38326|58861->38516|58972->38616|59014->38618|59088->38663|59152->38699|59178->38715|59224->38738|59291->38786|59305->38791|59345->38792|59419->38837|59503->38889|59569->38926|59781->39110|59904->39222|59946->39224|60020->39269|60084->39305|60110->39321|60162->39350|60229->39398|60243->39403|60283->39404|60357->39449|60441->39501|60507->39538|60722->39725|60851->39843|60893->39845|60967->39890|61031->39926|61057->39942|61112->39974|61179->40022|61193->40027|61233->40028|61307->40073|61391->40125|61457->40162|61738->40415|61861->40527|61903->40529|61977->40574|62041->40610|62067->40626|62119->40655|62186->40703|62200->40708|62240->40709|62314->40754|62398->40806|62465->40844|62671->41022|62794->41134|62836->41136|62910->41181|62974->41217|63000->41233|63052->41262|63119->41310|63133->41315|63173->41316|63247->41361|63331->41413|63398->41451|63603->41628|63724->41738|63766->41740|63840->41785|63904->41821|63930->41837|63981->41865|64048->41913|64062->41918|64102->41919|64176->41964|64260->42016|64327->42054|64534->42233|64657->42345|64699->42347|64773->42392|64837->42428|64863->42444|64915->42473|64982->42521|64996->42526|65036->42527|65110->42572|65194->42624|65261->42662|65467->42840|65590->42952|65632->42954|65706->42999|65770->43035|65796->43051|65848->43080|65915->43128|65929->43133|65969->43134|66043->43179|66127->43231|66194->43269|66399->43446|66520->43556|66562->43558|66636->43603|66700->43639|66726->43655|66777->43683|66844->43731|66858->43736|66898->43737|66972->43782|67056->43834|67123->43872|67330->44051|67453->44163|67495->44165|67569->44210|67633->44246|67659->44262|67711->44291|67778->44339|67792->44344|67832->44345|67906->44390|67990->44442|68057->44480|68263->44658|68386->44770|68428->44772|68502->44817|68566->44853|68592->44869|68644->44898|68711->44946|68725->44951|68765->44952|68839->44997|68923->45049|68990->45087|69195->45264|69316->45374|69358->45376|69432->45421|69496->45457|69522->45473|69573->45501|69640->45549|69654->45554|69694->45555|69768->45600|69852->45652|69919->45690|70139->45882|70234->45966|70276->45968|70350->46014|70400->46054|70441->46056|70519->46105|70640->46194|70714->46240|70764->46280|70805->46282|70883->46331|71003->46419|71066->46463|71080->46468|71120->46469|71194->46514|71278->46566|71344->46603|71560->46791|71665->46885|71707->46887|71781->46933|71836->46978|71877->46980|71955->47029|72076->47118|72150->47164|72205->47209|72246->47211|72324->47260|72444->47348|72507->47392|72521->47397|72561->47398|72635->47443|72719->47495|72785->47532|72999->47718|73120->47828|73162->47830|73236->47876|73299->47929|73341->47931|73419->47980|73540->48069|73614->48115|73677->48168|73719->48170|73797->48219|73917->48307|73980->48351|73994->48356|74034->48357|74108->48402|74192->48454|74258->48491|74473->48678|74602->48796|74644->48798|74718->48843|74782->48879|74808->48895|74863->48927|74930->48975|74944->48980|74984->48981|75058->49026|75142->49078|75209->49116|75425->49304|75556->49424|75598->49426|75672->49471|75736->49507|75762->49523|75818->49556|75885->49604|75899->49609|75939->49610|76013->49655|76097->49707|76164->49745|76380->49933|76509->50051|76551->50053|76625->50098|76689->50134|76715->50150|76770->50182|76837->50230|76851->50235|76891->50236|76965->50281|77049->50333|77116->50371|77320->50547|77425->50641|77467->50643|77541->50688|77605->50724|77631->50740|77674->50760|77741->50808|77755->50813|77795->50814|77869->50859|77953->50911|78020->50949|78091->51035|78121->51125|78152->51267|78183->51393|78213->51446|78243->51505|78273->51551|78303->51597|78334->51643|78365->51735|78396->52060|78427->52261|78457->52314|78487->52373|78517->52419|78547->52465|78577->52510|78607->52595|78638->52731|78669->52854|78699->52907|78729->52966|78759->53012|78789->53058|78819->53103|78849->53188|78880->53324|78911->53447|78941->53500|78971->53559|79001->53605|79031->53651|79063->53698|79093->53789|79124->54114|79155->54315|79185->54368|79215->54427|79245->54473|79275->54519|79305->54564|79335->54649|79366->54785|79397->54908|79427->54961|79457->55020|79487->55066|79519->55114|79549->55159|79579->55244|79610->55380|79641->55503|79671->55556|79701->55615|79731->55661|79761->55707|79793->55754|79823->55845|79854->56170|79885->56371|79915->56424|79945->56483|79975->56529|80005->56575|80035->56620|80065->56705|80096->56841|80127->56964|80157->57017|80187->57076|80217->57122|80249->57170|80279->57215|80309->57300|80340->57436|80371->57559|80401->57612|80431->57671|80461->57717|80491->57763|80553->57796|80886->58100|80903->58106|81011->58191|81253->58405|81269->58411|81384->58503|81547->58638|81563->58644|81678->58736|82040->59069|82057->59075|82133->59128
                  LINES: 31->1|36->2|39->4|42->2|44->5|45->6|45->6|46->7|47->8|47->8|48->9|51->12|51->12|52->13|52->13|53->14|53->14|53->14|54->15|54->15|54->15|55->16|58->19|58->19|59->20|62->23|62->23|63->24|64->25|64->25|65->26|67->28|67->28|68->29|68->29|68->29|68->29|69->30|70->31|70->31|71->32|71->32|73->34|73->34|73->34|74->35|80->41|80->41|85->46|85->46|85->46|86->47|93->54|94->55|95->56|96->57|97->58|98->59|99->60|100->61|101->62|102->63|107->68|107->68|107->68|111->72|111->72|111->72|112->73|112->73|112->73|112->73|113->74|113->74|113->74|114->75|115->76|116->77|119->80|119->80|119->80|120->81|120->81|120->81|120->81|121->82|121->82|121->82|122->83|123->84|124->85|127->88|127->88|127->88|128->89|128->89|128->89|128->89|129->90|129->90|129->90|130->91|131->92|132->93|136->97|136->97|136->97|137->98|137->98|137->98|137->98|138->99|138->99|138->99|139->100|140->101|141->102|146->107|146->107|146->107|147->108|147->108|147->108|147->108|148->109|148->109|148->109|149->110|150->111|151->112|153->130|155->132|157->134|157->134|157->134|158->135|158->135|158->135|159->136|160->137|161->138|161->138|161->138|162->139|163->140|164->141|164->141|164->141|165->142|166->143|167->144|171->148|171->148|171->148|172->149|172->149|172->149|173->150|174->151|175->152|175->152|175->152|176->153|177->154|178->155|178->155|178->155|179->156|180->157|181->158|185->162|185->162|185->162|186->163|186->163|186->163|186->163|187->164|187->164|187->164|188->165|189->166|190->167|193->170|193->170|193->170|194->171|194->171|194->171|194->171|195->172|195->172|195->172|196->173|197->174|198->175|201->178|201->178|201->178|202->179|202->179|202->179|202->179|203->180|203->180|203->180|204->181|205->182|207->184|211->188|211->188|211->188|212->189|212->189|212->189|212->189|213->190|213->190|213->190|214->191|215->192|216->193|220->197|220->197|220->197|221->198|221->198|221->198|221->198|222->199|222->199|222->199|223->200|224->201|225->202|229->206|229->206|229->206|230->207|230->207|230->207|230->207|231->208|231->208|231->208|232->209|233->210|234->211|239->216|239->216|239->216|240->217|240->217|240->217|240->217|241->218|241->218|241->218|242->219|243->220|244->221|249->226|249->226|249->226|250->227|250->227|250->227|250->227|251->228|251->228|251->228|252->229|253->230|254->231|258->235|258->235|258->235|259->236|259->236|259->236|259->236|260->237|260->237|260->237|261->238|262->239|263->240|267->244|267->244|267->244|268->245|268->245|268->245|268->245|269->246|269->246|269->246|270->247|271->248|272->249|276->253|276->253|276->253|277->254|277->254|277->254|277->254|278->255|278->255|278->255|279->256|280->257|281->258|286->263|286->263|286->263|287->264|287->264|287->264|287->264|288->265|288->265|288->265|289->266|290->267|291->268|295->272|295->272|295->272|296->273|296->273|296->273|297->274|298->275|299->276|299->276|299->276|300->277|301->278|302->279|302->279|302->279|303->280|304->281|305->282|305->282|305->282|306->283|307->284|308->285|308->285|308->285|309->286|310->287|311->288|311->288|311->288|312->289|313->290|314->291|314->291|314->291|315->292|316->293|317->294|321->298|321->298|321->298|322->299|322->299|322->299|323->300|324->301|325->302|325->302|325->302|326->303|327->304|328->305|328->305|328->305|329->306|330->307|331->308|336->313|336->313|336->313|337->314|337->314|337->314|337->314|338->315|338->315|338->315|339->316|340->317|341->318|345->322|345->322|345->322|346->323|346->323|346->323|346->323|347->324|347->324|347->324|348->325|349->326|350->327|354->331|354->331|354->331|355->332|355->332|355->332|355->332|356->333|356->333|356->333|357->334|358->335|359->336|363->340|363->340|363->340|364->341|364->341|364->341|364->341|365->342|365->342|365->342|366->343|367->344|368->345|372->349|372->349|372->349|373->350|373->350|373->350|374->351|375->352|376->353|376->353|376->353|377->354|378->355|379->356|379->356|379->356|380->357|381->358|383->360|386->363|386->363|386->363|387->364|387->364|387->364|387->364|388->365|388->365|388->365|389->366|390->367|391->368|394->371|394->371|394->371|395->372|395->372|395->372|395->372|396->373|396->373|396->373|397->374|398->375|399->376|402->379|402->379|402->379|403->380|403->380|403->380|403->380|404->381|404->381|404->381|405->382|406->383|407->384|411->388|411->388|411->388|412->389|412->389|412->389|413->390|414->391|415->392|415->392|415->392|416->393|417->394|418->395|418->395|418->395|419->396|420->397|421->398|424->401|424->401|424->401|425->402|425->402|425->402|425->402|426->403|426->403|426->403|427->404|428->405|429->406|432->409|432->409|432->409|433->410|433->410|433->410|433->410|434->411|434->411|434->411|435->412|436->413|437->414|440->417|440->417|440->417|441->418|441->418|441->418|441->418|442->419|442->419|442->419|443->420|444->421|445->422|450->427|450->427|450->427|451->428|451->428|451->428|452->429|453->430|454->431|454->431|454->431|455->432|456->433|457->434|457->434|457->434|458->435|459->436|460->437|460->437|460->437|461->438|462->439|463->440|463->440|463->440|464->441|465->442|466->443|469->446|469->446|469->446|470->447|470->447|470->447|471->448|472->449|473->450|473->450|473->450|474->451|475->452|476->453|476->453|476->453|477->454|478->455|479->456|479->456|479->456|480->457|481->458|482->459|482->459|482->459|483->460|484->461|485->462|488->465|488->465|488->465|489->466|489->466|489->466|490->467|491->468|492->469|492->469|492->469|493->470|494->471|495->472|495->472|495->472|496->473|497->474|498->475|498->475|498->475|499->476|500->477|501->478|501->478|501->478|502->479|503->480|504->481|507->484|507->484|507->484|508->485|508->485|508->485|509->486|510->487|511->488|511->488|511->488|512->489|513->490|514->491|514->491|514->491|515->492|516->493|517->494|517->494|517->494|518->495|519->496|520->497|520->497|520->497|521->498|522->499|523->500|526->503|526->503|526->503|527->504|527->504|527->504|528->505|529->506|530->507|530->507|530->507|531->508|532->509|533->510|533->510|533->510|534->511|535->512|536->513|536->513|536->513|537->514|538->515|539->516|539->516|539->516|540->517|541->518|542->519|545->522|545->522|545->522|546->523|546->523|546->523|547->524|548->525|549->526|549->526|549->526|550->527|551->528|552->529|552->529|552->529|553->530|554->531|555->532|555->532|555->532|556->533|557->534|558->535|558->535|558->535|559->536|560->537|561->538|564->541|564->541|564->541|565->542|565->542|565->542|566->543|567->544|568->545|568->545|568->545|569->546|570->547|571->548|571->548|571->548|572->549|573->550|574->551|574->551|574->551|575->552|576->553|577->554|577->554|577->554|578->555|579->556|580->557|583->560|583->560|583->560|584->561|584->561|584->561|585->562|586->563|587->564|587->564|587->564|588->565|589->566|590->567|590->567|590->567|591->568|592->569|593->570|593->570|593->570|594->571|595->572|596->573|596->573|596->573|597->574|598->575|599->576|603->580|603->580|603->580|604->581|604->581|604->581|604->581|605->582|605->582|605->582|606->583|607->584|608->585|612->589|612->589|612->589|613->590|613->590|613->590|613->590|614->591|614->591|614->591|615->592|616->593|617->594|622->599|622->599|622->599|623->600|623->600|623->600|623->600|624->601|624->601|624->601|625->602|626->603|627->604|631->608|631->608|631->608|632->609|632->609|632->609|632->609|633->610|633->610|633->610|634->611|635->612|636->613|642->619|642->619|642->619|643->620|643->620|643->620|643->620|644->621|644->621|644->621|645->622|646->623|648->625|652->629|652->629|652->629|653->630|653->630|653->630|653->630|654->631|654->631|654->631|655->632|656->633|658->635|662->639|662->639|662->639|663->640|663->640|663->640|663->640|664->641|664->641|664->641|665->642|666->643|668->645|673->650|673->650|673->650|674->651|674->651|674->651|674->651|675->652|675->652|675->652|676->653|677->654|679->656|683->660|683->660|683->660|684->661|684->661|684->661|684->661|685->662|685->662|685->662|686->663|687->664|689->666|693->670|693->670|693->670|694->671|694->671|694->671|694->671|695->672|695->672|695->672|696->673|697->674|699->676|704->681|704->681|704->681|705->682|705->682|705->682|705->682|706->683|706->683|706->683|707->684|708->685|710->687|714->691|714->691|714->691|715->692|715->692|715->692|715->692|716->693|716->693|716->693|717->694|718->695|720->697|724->701|724->701|724->701|725->702|725->702|725->702|725->702|726->703|726->703|726->703|727->704|728->705|730->707|734->711|734->711|734->711|735->712|735->712|735->712|736->713|737->714|738->715|738->715|738->715|739->716|740->717|742->719|742->719|742->719|743->720|744->721|745->722|748->725|748->725|748->725|749->726|749->726|749->726|750->727|751->728|752->729|752->729|752->729|753->730|754->731|756->733|756->733|756->733|757->734|758->735|759->736|762->739|762->739|762->739|763->740|763->740|763->740|764->741|765->742|766->743|766->743|766->743|767->744|768->745|770->747|770->747|770->747|771->748|772->749|773->750|777->754|777->754|777->754|778->755|778->755|778->755|778->755|779->756|779->756|779->756|780->757|781->758|783->760|787->764|787->764|787->764|788->765|788->765|788->765|788->765|789->766|789->766|789->766|790->767|791->768|793->770|798->775|798->775|798->775|799->776|799->776|799->776|799->776|800->777|800->777|800->777|801->778|802->779|804->781|809->786|809->786|809->786|810->787|810->787|810->787|810->787|811->788|811->788|811->788|812->789|813->790|815->792|816->793|817->794|818->795|819->796|820->797|821->798|822->799|823->800|825->802|827->804|828->805|829->806|830->807|831->808|832->809|833->810|834->811|835->812|836->813|837->814|838->815|839->816|840->817|841->818|842->819|843->820|844->821|845->822|846->823|847->824|848->825|849->826|852->829|853->830|854->831|855->832|856->833|857->834|858->835|859->836|860->837|861->838|862->839|863->840|864->841|865->842|866->843|869->846|870->847|871->848|872->849|873->850|874->851|875->852|876->853|877->854|880->857|881->858|882->859|883->860|884->861|885->862|886->863|887->864|888->865|889->866|890->867|891->868|892->869|893->870|894->871|897->874|898->875|899->876|900->877|901->878|902->879|903->880|904->881|905->882|906->883|911->888|911->888|911->888|914->891|914->891|914->891|917->894|917->894|917->894|922->899|922->899|922->899
                  -- GENERATED --
              */
          