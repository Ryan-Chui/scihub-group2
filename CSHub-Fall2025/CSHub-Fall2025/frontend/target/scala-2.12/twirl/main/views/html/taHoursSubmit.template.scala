
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

object taHoursSubmit extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[SimpleCourseTAAssignment],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(taCourses: List[SimpleCourseTAAssignment]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import models.SimpleCourseTAAssignment

def /*5.2*/scripts/*5.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.13*/("""
    """),format.raw/*6.5*/("""<script type = "module" src='"""),_display_(/*6.35*/routes/*6.41*/.Assets.at("javascripts/voiceJump.js")),format.raw/*6.79*/("""'></script>
    <script type="text/javascript">
            $(document).ready(function() """),format.raw/*8.42*/("""{"""),format.raw/*8.43*/("""
                """),format.raw/*9.17*/("""$('.course-button').click(function() """),format.raw/*9.54*/("""{"""),format.raw/*9.55*/("""
                    """),format.raw/*10.21*/("""var courseId = $(this).data('course-id');
                    loadCourseDetails(courseId);
                """),format.raw/*12.17*/("""}"""),format.raw/*12.18*/(""");
            """),format.raw/*13.13*/("""}"""),format.raw/*13.14*/(""");

            function loadCourseDetails(courseId) """),format.raw/*15.50*/("""{"""),format.raw/*15.51*/("""
                """),format.raw/*16.17*/("""$.ajax("""),format.raw/*16.24*/("""{"""),format.raw/*16.25*/("""
                    """),format.raw/*17.21*/("""url: '/getCourseDetails/' + courseId,
                    type: 'GET',
                    success: function(data) """),format.raw/*19.45*/("""{"""),format.raw/*19.46*/("""
                        """),format.raw/*20.25*/("""var courseDetails = JSON.parse(data);
                        var startDate = new Date('2024-01-05');  // Fixed start date of week 1
                        var detailsHtml = '<table>';
                        detailsHtml += '<tr><th>Week</th><th>Start Date</th><th>Approved Hours</th><th>Total Hours Used</th><th>Submit Hours</th></tr>';

                        for (var week = 1; week <= 4; week++) """),format.raw/*25.63*/("""{"""),format.raw/*25.64*/("""
                            """),format.raw/*26.29*/("""var weekStartDate = new Date(startDate);
                            weekStartDate.setDate(startDate.getDate() + (week - 1) * 7);
                            var dateString = weekStartDate.getFullYear() + '-' + (weekStartDate.getMonth() + 1) + '-' + weekStartDate.getDate();

                            var approvedHours = courseDetails.approvedHours;
                            var totalHoursUsed = courseDetails.usedHours[week] ? courseDetails.usedHours[week] : '';

                            detailsHtml += '<tr>';
                            detailsHtml += '<td>' + week + '</td>';
                            detailsHtml += '<td>' + dateString + '</td>';
                            detailsHtml += '<td>' + approvedHours + '</td>';
                            detailsHtml += '<td id="hours-' + courseId + '-' + week + '">' + totalHoursUsed + '</td>';

                            if (!totalHoursUsed) """),format.raw/*39.50*/("""{"""),format.raw/*39.51*/("""
                                """),format.raw/*40.33*/("""detailsHtml += '<td><input type="number" id="hours-input-' + courseId + '-' + week + '" />';
                                detailsHtml += '<button onclick="submitHours(\'' + courseId + '\', ' + week + ')">Submit</button></td>';
                            """),format.raw/*42.29*/("""}"""),format.raw/*42.30*/(""" """),format.raw/*42.31*/("""else """),format.raw/*42.36*/("""{"""),format.raw/*42.37*/("""
                                """),format.raw/*43.33*/("""detailsHtml += '<td>Submitted</td>';
                            """),format.raw/*44.29*/("""}"""),format.raw/*44.30*/("""

                            """),format.raw/*46.29*/("""detailsHtml += '</tr>';
                        """),format.raw/*47.25*/("""}"""),format.raw/*47.26*/("""
                        """),format.raw/*48.25*/("""detailsHtml += '</table>';
                        $('#course-detail').html(detailsHtml);
                    """),format.raw/*50.21*/("""}"""),format.raw/*50.22*/(""",
                    error: function() """),format.raw/*51.39*/("""{"""),format.raw/*51.40*/("""
                        """),format.raw/*52.25*/("""console.error('Error loading course details.');
                    """),format.raw/*53.21*/("""}"""),format.raw/*53.22*/("""
                """),format.raw/*54.17*/("""}"""),format.raw/*54.18*/(""");
            """),format.raw/*55.13*/("""}"""),format.raw/*55.14*/("""

            """),format.raw/*57.13*/("""function submitHours(courseId, week) """),format.raw/*57.50*/("""{"""),format.raw/*57.51*/("""
                """),format.raw/*58.17*/("""var hours = $('#hours-input-' + courseId + '-' + week).val();
                $.ajax("""),format.raw/*59.24*/("""{"""),format.raw/*59.25*/("""
                    """),format.raw/*60.21*/("""url: '/submitHours/' + courseId + '/' + week,
                    type: 'POST',
                    data: """),format.raw/*62.27*/("""{"""),format.raw/*62.28*/(""" """),format.raw/*62.29*/("""hours: hours """),format.raw/*62.42*/("""}"""),format.raw/*62.43*/(""",
                    success: function(response) """),format.raw/*63.49*/("""{"""),format.raw/*63.50*/("""
                        """),format.raw/*64.25*/("""console.log('Hours submitted successfully:', response);
                        $('#hours-' + courseId + '-' + week).text(hours);
                        $('#hours-input-' + courseId + '-' + week).remove();
                        $('#submit-button-' + courseId + '-' + week).remove();
                    """),format.raw/*68.21*/("""}"""),format.raw/*68.22*/(""",
                    error: function(xhr, status, error) """),format.raw/*69.57*/("""{"""),format.raw/*69.58*/("""
                        """),format.raw/*70.25*/("""console.error("Failed to submit hours:", status, error);
                    """),format.raw/*71.21*/("""}"""),format.raw/*71.22*/("""
                """),format.raw/*72.17*/("""}"""),format.raw/*72.18*/(""");
            """),format.raw/*73.13*/("""}"""),format.raw/*73.14*/("""
    """),format.raw/*74.5*/("""</script>
""")))};
Seq[Any](format.raw/*1.45*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*75.2*/("""

"""),_display_(/*77.2*/main("TA Weekly Hours Submission", scripts)/*77.45*/ {_display_(Seq[Any](format.raw/*77.47*/("""
    """),format.raw/*78.5*/("""<div class="page-container">
        <div class="course-list">
        """),_display_(/*80.10*/for(assignment <- taCourses) yield /*80.38*/ {_display_(Seq[Any](format.raw/*80.40*/("""
            """),format.raw/*81.13*/("""<button class="course-button" data-course-id=""""),_display_(/*81.60*/assignment/*81.70*/.getCourseId),format.raw/*81.82*/("""">
            """),_display_(/*82.14*/assignment/*82.24*/.getCourseNum),format.raw/*82.37*/("""
            """),format.raw/*83.13*/("""</button>
        """)))}),format.raw/*84.10*/("""
        """),format.raw/*85.9*/("""</div>
        <div class="course-details">
            <div id="course-detail">
                    <!-- Details will be rendered here by the JavaScript above -->
            </div>
        </div>
    </div>
""")))}),format.raw/*92.2*/("""
"""))
      }
    }
  }

  def render(taCourses:List[SimpleCourseTAAssignment]): play.twirl.api.HtmlFormat.Appendable = apply(taCourses)

  def f:((List[SimpleCourseTAAssignment]) => play.twirl.api.HtmlFormat.Appendable) = (taCourses) => apply(taCourses)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:37 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/taHoursSubmit.scala.html
                  HASH: e39ecc50766ca7f8d54897c7fe8dfded560fe030
                  MATRIX: 1143->1|1259->47|1310->88|1324->95|1404->99|1435->104|1491->134|1505->140|1563->178|1679->267|1707->268|1751->285|1815->322|1843->323|1892->344|2027->451|2056->452|2099->467|2128->468|2209->521|2238->522|2283->539|2318->546|2347->547|2396->568|2539->683|2568->684|2621->709|3051->1111|3080->1112|3137->1141|4075->2051|4104->2052|4165->2085|4451->2343|4480->2344|4509->2345|4542->2350|4571->2351|4632->2384|4725->2449|4754->2450|4812->2480|4888->2528|4917->2529|4970->2554|5108->2664|5137->2665|5205->2705|5234->2706|5287->2731|5383->2799|5412->2800|5457->2817|5486->2818|5529->2833|5558->2834|5600->2848|5665->2885|5694->2886|5739->2903|5852->2988|5881->2989|5930->3010|6064->3116|6093->3117|6122->3118|6163->3131|6192->3132|6270->3182|6299->3183|6352->3208|6686->3514|6715->3515|6801->3573|6830->3574|6883->3599|6988->3676|7017->3677|7062->3694|7091->3695|7134->3710|7163->3711|7195->3716|7245->44|7273->86|7301->3727|7330->3730|7382->3773|7422->3775|7454->3780|7553->3852|7597->3880|7637->3882|7678->3895|7752->3942|7771->3952|7804->3964|7847->3980|7866->3990|7900->4003|7941->4016|7991->4035|8027->4044|8267->4254
                  LINES: 35->1|38->3|40->5|40->5|42->5|43->6|43->6|43->6|43->6|45->8|45->8|46->9|46->9|46->9|47->10|49->12|49->12|50->13|50->13|52->15|52->15|53->16|53->16|53->16|54->17|56->19|56->19|57->20|62->25|62->25|63->26|76->39|76->39|77->40|79->42|79->42|79->42|79->42|79->42|80->43|81->44|81->44|83->46|84->47|84->47|85->48|87->50|87->50|88->51|88->51|89->52|90->53|90->53|91->54|91->54|92->55|92->55|94->57|94->57|94->57|95->58|96->59|96->59|97->60|99->62|99->62|99->62|99->62|99->62|100->63|100->63|101->64|105->68|105->68|106->69|106->69|107->70|108->71|108->71|109->72|109->72|110->73|110->73|111->74|113->1|115->4|116->75|118->77|118->77|118->77|119->78|121->80|121->80|121->80|122->81|122->81|122->81|122->81|123->82|123->82|123->82|124->83|125->84|126->85|133->92
                  -- GENERATED --
              */
          