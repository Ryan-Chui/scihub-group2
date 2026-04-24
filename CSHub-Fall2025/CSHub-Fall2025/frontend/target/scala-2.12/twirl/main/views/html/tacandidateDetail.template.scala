
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

object tacandidateDetail extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[TACandidate,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(taCandidate: TACandidate):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._
/*4.2*/import models._
/*5.2*/import models.TACandidate
/*6.2*/import services._


Seq[Any](format.raw/*1.28*/("""

"""),format.raw/*7.1*/("""


"""),_display_(/*10.2*/main("TA Candidate Profile")/*10.30*/ {_display_(Seq[Any](format.raw/*10.32*/("""

    """),format.raw/*12.5*/("""<script>
            function showHireForm() """),format.raw/*13.37*/("""{"""),format.raw/*13.38*/("""
                """),format.raw/*14.17*/("""var modal = document.getElementById('hireModal');
                modal.style.display = 'block';

                $.ajax("""),format.raw/*17.24*/("""{"""),format.raw/*17.25*/("""
                    """),format.raw/*18.21*/("""url: "http://localhost:9037/courses",
                    type: 'GET',
                    dataType: 'json',
                    success: function(data) """),format.raw/*21.45*/("""{"""),format.raw/*21.46*/("""
                        """),format.raw/*22.25*/("""console.log(data);
                        var coursesHtml = '';
                        data.forEach(function(course) """),format.raw/*24.55*/("""{"""),format.raw/*24.56*/("""
                            """),format.raw/*25.29*/("""coursesHtml += '<div class="col s12 m4">' +
                                    '<label>' +
                                    '<input type="radio" name="courseId" value="' + course.id + '">' +
                                    '<span>' + course.courseId + '</span>' +
                                    '</label>' +
                                    '</div>';
                        """),format.raw/*31.25*/("""}"""),format.raw/*31.26*/(""");
                        $('#coursesContainer').html(coursesHtml);
                    """),format.raw/*33.21*/("""}"""),format.raw/*33.22*/(""",
                    error: function(error) """),format.raw/*34.44*/("""{"""),format.raw/*34.45*/("""
                        """),format.raw/*35.25*/("""console.log("Error fetching courses: ", error);
                    """),format.raw/*36.21*/("""}"""),format.raw/*36.22*/("""
                """),format.raw/*37.17*/("""}"""),format.raw/*37.18*/(""");
            """),format.raw/*38.13*/("""}"""),format.raw/*38.14*/("""

            """),format.raw/*40.13*/("""function hideHireForm() """),format.raw/*40.37*/("""{"""),format.raw/*40.38*/("""
                """),format.raw/*41.17*/("""var modal = document.getElementById('hireModal');
                modal.style.display = 'none';
            """),format.raw/*43.13*/("""}"""),format.raw/*43.14*/("""

            """),format.raw/*45.13*/("""// No longer need submitHireForm function
            // Since the form is now submitted natively by the browser

            document.addEventListener('DOMContentLoaded', function() """),format.raw/*48.70*/("""{"""),format.raw/*48.71*/("""
                """),format.raw/*49.17*/("""document.getElementById('hireNowButton').addEventListener('click', showHireForm);
                document.getElementById('hireFormCancel').addEventListener('click', hideHireForm);
                // Remove the event listener for hireFormSubmit
            """),format.raw/*52.13*/("""}"""),format.raw/*52.14*/(""");
    </script>



    <div class="container">
        <div class="row">
            <div class="col s12">
                <div class="card-panel">
                    <h4 class="center">"""),_display_(/*61.41*/taCandidate/*61.52*/.getApplicant.getUserName()),format.raw/*61.79*/("""</h4>
                    <div class="row">
                        <div class="col s4">
                            <div class="center">
                                <img class="circle" id="showImg" src=""""),_display_(/*65.72*/taCandidate/*65.83*/.getApplicant.getAvatar()),format.raw/*65.108*/("""" width="360" height="360" style="border-width: 1px;
                                    border-style: solid;
                                    border-radius: 50%;
                                    height: auto;
                                    width: 70%;">
                            </div>
                        </div>
                        <div class="col s8">
                            <table class="striped responsive-table">
                                <tr>
                                    <th>SMU ID</th>
                                    <td>"""),_display_(/*76.42*/taCandidate/*76.53*/.getSmuId()),format.raw/*76.64*/("""</td>
                                </tr>
                                <tr>
                                    <th>Student Status</th>
                                    <td>"""),_display_(/*80.42*/taCandidate/*80.53*/.getStatus()),format.raw/*80.65*/("""</td>
                                </tr>

                                    <tr>
                                        <th style="max-width: 50px">Available Hours</th>
                                        <td style="word-wtap: break-word;">"""),_display_(/*85.77*/(taCandidate.getHours - taCandidate.computeTotalApprovedHours)),format.raw/*85.139*/("""</td>
                                    </tr>


                                <tr>
                                    <th style="max-width: 50px">Hired by</th>
                                    """),_display_(/*91.38*/if(taCandidate.getAssignments.filter(assignment => assignment.getCourse.isActive && assignment.getYear == "2024" && assignment.getSemester == "spring").nonEmpty)/*91.199*/ {_display_(Seq[Any](format.raw/*91.201*/("""
                                        """),format.raw/*92.41*/("""<td style="word-wrap: break-word;">
                                        """),_display_(/*93.42*/taCandidate/*93.53*/.getAssignments.filter(assignment => assignment.getCourse.isActive && assignment.getYear == "2024" && assignment.getSemester == "spring").map(assignment => assignment.getCourse().getCourseId()).mkString(", ")),format.raw/*93.261*/("""
                                        """),format.raw/*94.41*/("""</td>
                                    """)))}/*95.39*/else/*95.44*/{_display_(Seq[Any](format.raw/*95.45*/("""
                                        """),format.raw/*96.41*/("""<td>This candidate is not hired by any courses.</td>
                                    """)))}),format.raw/*97.38*/("""
                                """),format.raw/*98.33*/("""</tr>


                                <tr>
                                    <th style="max-width: 50px">Hired History</th>
                                    """),_display_(/*103.38*/if(taCandidate.getAssignments.filter(assignment => !assignment.getCourse.isActive || assignment.getYear != "2024" || assignment.getSemester != "spring").nonEmpty)/*103.200*/ {_display_(Seq[Any](format.raw/*103.202*/("""
                                        """),format.raw/*104.41*/("""<td style="word-wrap: break-word;">
                                        """),_display_(/*105.42*/taCandidate/*105.53*/.getAssignments.filter(assignment => !assignment.getCourse.isActive || assignment.getYear != "2024" || assignment.getSemester != "spring").map(assignment => assignment.getCourse().getCourseId()).mkString(", ")),format.raw/*105.262*/("""
                                        """),format.raw/*106.41*/("""</td>
                                    """)))}/*107.39*/else/*107.44*/{_display_(Seq[Any](format.raw/*107.45*/("""
                                        """),format.raw/*108.41*/("""<td>This candidate has no hired history.</td>
                                    """)))}),format.raw/*109.38*/("""
                                """),format.raw/*110.33*/("""</tr>




                                <tr>
                                        <th style="max-width: 50px">Courses Completed</th>
                                        """),_display_(/*117.42*/if(taCandidate.getCourses!="")/*117.72*/ {_display_(Seq[Any](format.raw/*117.74*/("""
                                            """),format.raw/*118.45*/("""<td style="word-wtap: break-word;">"""),_display_(/*118.81*/taCandidate/*118.92*/.getCourses),format.raw/*118.103*/("""</td>
                                        """)))}/*119.43*/else/*119.48*/{_display_(Seq[Any](format.raw/*119.49*/("""
                                            """),format.raw/*120.45*/("""<td>No information.</td>
                                        """)))}),format.raw/*121.42*/("""
                                    """),format.raw/*122.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">Preference</th>
                                        """),_display_(/*125.42*/if(taCandidate.getPreference!="")/*125.75*/ {_display_(Seq[Any](format.raw/*125.77*/("""
                                            """),format.raw/*126.45*/("""<td style="word-wrap: break-word;">
                                            """),_display_(/*127.46*/Html(taCandidate.getPreference.split(";").map(_.trim).mkString("<br>"))),format.raw/*127.117*/("""
                                            """),format.raw/*128.45*/("""</td>
                                        """)))}/*129.43*/else/*129.48*/{_display_(Seq[Any](format.raw/*129.49*/("""
                                            """),format.raw/*130.45*/("""<td>No preference.</td>
                                        """)))}),format.raw/*131.42*/("""
                                    """),format.raw/*132.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">Unwanted</th>
                                        """),_display_(/*135.42*/if(taCandidate.getUnwanted!="")/*135.73*/ {_display_(Seq[Any](format.raw/*135.75*/("""
                                            """),format.raw/*136.45*/("""<td style="word-wrap: break-word;">
                                            """),_display_(/*137.46*/Html(taCandidate.getUnwanted.split(";").map(_.trim).mkString("<br>"))),format.raw/*137.115*/("""
                                        """)))}/*138.43*/else/*138.48*/{_display_(Seq[Any](format.raw/*138.49*/("""
                                            """),format.raw/*139.45*/("""<td>-</td>
                                        """)))}),format.raw/*140.42*/("""
                                    """),format.raw/*141.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">Comment</th>
                                        """),_display_(/*144.42*/if(taCandidate.getComment!="")/*144.72*/ {_display_(Seq[Any](format.raw/*144.74*/("""
                                            """),format.raw/*145.45*/("""<td style="word-wtap: break-word;">"""),_display_(/*145.81*/taCandidate/*145.92*/.getComment),format.raw/*145.103*/("""</td>
                                        """)))}/*146.43*/else/*146.48*/{_display_(Seq[Any](format.raw/*146.49*/("""
                                            """),format.raw/*147.45*/("""<td>-</td>
                                        """)))}),format.raw/*148.42*/("""
                                    """),format.raw/*149.37*/("""</tr>
                            </table>
                        </div>
                    </div>
                    <div class="row center">
                        <a class="btn waves-effect waves-light green darken-2" id="hireNowButton">Hire Now</a>
                        <a href=""""),_display_(/*155.35*/routes/*155.41*/.TACandidateController.tacandidateList(1, "id")),format.raw/*155.88*/("""" class="btn waves-effect waves-light blue darken-2">
                            Back to TA Pool List</a>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <div id="hireModal" style="display:none; position: fixed; z-index: 1; left: 0; top: 0; width: 100%; height: 100%; overflow: auto; background-color: rgb(0,0,0); background-color: rgba(0,0,0,0.4);">
        <div style="background-color: #fefefe; margin: 15% auto; padding: 20px; border: 1px solid #888; width: 80%;">
            <form method="post" action=""""),_display_(/*165.42*/routes/*165.48*/.CourseTAAssignmentController.assignmentRegisterPOST()),format.raw/*165.102*/("""">
                <h4>Hire """),_display_(/*166.27*/taCandidate/*166.38*/.getApplicant.getUserName),format.raw/*166.63*/(""" """),format.raw/*166.64*/("""now</h4>
                    <div class="row">
                        <h6>Once you submit the hiring decision, Monique will receive an email and start the hiring process.</h6>
                        <br>
                        <div class="row">

                            <fieldset>
                                <legend>Select a course to hire:</legend>
                                <div id="coursesContainer">
                                        <!-- The course list that dynamically generated will be filled in here -->
                                </div>
                            </fieldset>

                        </div>

                        <div class="row">
                            <div class="input-field col s12">
                                <input type="number" name="approvedHours" id="approvedHours" min="0" max="""),_display_(/*183.107*/(taCandidate.getHours - taCandidate.computeTotalApprovedHours)),format.raw/*183.169*/(""" """),format.raw/*183.170*/("""value="0" class="validate" required>
                                <label for="fields" style="font-size: larger;">
                                    How many hours/week do you want to approve </label>
                                <span id="hoursMsg" class="helper-text" data-success="✓" data-error="Please input a positive number and less than or equal to available hours"></span>
                            </div>
                        </div>

                </div>
                <br><br>
                    <!-- Include the TACandidate ID as a hidden field -->
                <input type="hidden" name="taCandidateId" value=""""),_display_(/*193.67*/taCandidate/*193.78*/.getId()),format.raw/*193.86*/("""">
                    <!-- Include a submit button instead of an anchor -->
                <button type="submit" class="btn waves-effect waves-light green darken-2">Submit</button>
                <a class="btn waves-effect waves-light blue darken-2" id="hireFormCancel">Cancel</a>
            </form>
        </div>
    </div>
""")))}))
      }
    }
  }

  def render(taCandidate:TACandidate): play.twirl.api.HtmlFormat.Appendable = apply(taCandidate)

  def f:((TACandidate) => play.twirl.api.HtmlFormat.Appendable) = (taCandidate) => apply(taCandidate)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:36 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/tacandidateDetail.scala.html
                  HASH: 6dca0a60714f9f347ffc2089a40857ed6d2ef8e4
                  MATRIX: 1128->1|1227->30|1250->47|1273->64|1306->91|1353->27|1381->109|1411->113|1448->141|1488->143|1521->149|1594->194|1623->195|1668->212|1817->333|1846->334|1895->355|2076->508|2105->509|2158->534|2305->653|2334->654|2391->683|2810->1074|2839->1075|2956->1164|2985->1165|3058->1210|3087->1211|3140->1236|3236->1304|3265->1305|3310->1322|3339->1323|3382->1338|3411->1339|3453->1353|3505->1377|3534->1378|3579->1395|3715->1503|3744->1504|3786->1518|3997->1701|4026->1702|4071->1719|4356->1976|4385->1977|4601->2166|4621->2177|4669->2204|4905->2413|4925->2424|4972->2449|5575->3025|5595->3036|5627->3047|5836->3229|5856->3240|5889->3252|6167->3503|6251->3565|6480->3767|6651->3928|6692->3930|6761->3971|6865->4048|6885->4059|7115->4267|7184->4308|7246->4352|7259->4357|7298->4358|7367->4399|7488->4489|7549->4522|7742->4687|7915->4849|7957->4851|8027->4892|8132->4969|8153->4980|8385->5189|8455->5230|8518->5274|8532->5279|8572->5280|8642->5321|8757->5404|8819->5437|9026->5616|9066->5646|9107->5648|9181->5693|9245->5729|9266->5740|9300->5751|9367->5799|9381->5804|9421->5805|9495->5850|9593->5916|9659->5953|9859->6125|9902->6158|9943->6160|10017->6205|10126->6286|10220->6357|10294->6402|10361->6450|10375->6455|10415->6456|10489->6501|10586->6566|10652->6603|10850->6773|10891->6804|10932->6806|11006->6851|11115->6932|11207->7001|11269->7044|11283->7049|11323->7050|11397->7095|11481->7147|11547->7184|11744->7353|11784->7383|11825->7385|11899->7430|11963->7466|11984->7477|12018->7488|12085->7536|12099->7541|12139->7542|12213->7587|12297->7639|12363->7676|12682->7967|12698->7973|12767->8020|13358->8583|13374->8589|13451->8643|13508->8672|13529->8683|13576->8708|13606->8709|14494->9568|14579->9630|14610->9631|15281->10274|15302->10285|15332->10293
                  LINES: 35->1|38->3|39->4|40->5|41->6|44->1|46->7|49->10|49->10|49->10|51->12|52->13|52->13|53->14|56->17|56->17|57->18|60->21|60->21|61->22|63->24|63->24|64->25|70->31|70->31|72->33|72->33|73->34|73->34|74->35|75->36|75->36|76->37|76->37|77->38|77->38|79->40|79->40|79->40|80->41|82->43|82->43|84->45|87->48|87->48|88->49|91->52|91->52|100->61|100->61|100->61|104->65|104->65|104->65|115->76|115->76|115->76|119->80|119->80|119->80|124->85|124->85|130->91|130->91|130->91|131->92|132->93|132->93|132->93|133->94|134->95|134->95|134->95|135->96|136->97|137->98|142->103|142->103|142->103|143->104|144->105|144->105|144->105|145->106|146->107|146->107|146->107|147->108|148->109|149->110|156->117|156->117|156->117|157->118|157->118|157->118|157->118|158->119|158->119|158->119|159->120|160->121|161->122|164->125|164->125|164->125|165->126|166->127|166->127|167->128|168->129|168->129|168->129|169->130|170->131|171->132|174->135|174->135|174->135|175->136|176->137|176->137|177->138|177->138|177->138|178->139|179->140|180->141|183->144|183->144|183->144|184->145|184->145|184->145|184->145|185->146|185->146|185->146|186->147|187->148|188->149|194->155|194->155|194->155|204->165|204->165|204->165|205->166|205->166|205->166|205->166|222->183|222->183|222->183|232->193|232->193|232->193
                  -- GENERATED --
              */
          