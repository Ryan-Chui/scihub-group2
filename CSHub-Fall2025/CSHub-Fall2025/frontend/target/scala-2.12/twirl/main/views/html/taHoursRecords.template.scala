
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

object taHoursRecords extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[Course],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(courses: List[Course],
        listType: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import models.Course

def /*6.2*/scripts/*6.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.12*/("""
    """),format.raw/*7.5*/("""<script type = "module" src='"""),_display_(/*7.35*/routes/*7.41*/.Assets.at("javascripts/voiceJump.js")),format.raw/*7.79*/("""'></script>
    <script type="text/javascript">
            console.log('Scripts loaded.');

            function loadCourseDetails(courseId) """),format.raw/*11.50*/("""{"""),format.raw/*11.51*/("""
                """),format.raw/*12.17*/("""console.log('Loading details for course ID:', courseId);
                $('.course-button').removeClass('active');
                var activeButton = $('button[data-course-id="' + courseId + '"]');
                if (activeButton.length === 0) """),format.raw/*15.48*/("""{"""),format.raw/*15.49*/("""
                    """),format.raw/*16.21*/("""console.error("No active button found for course ID:", courseId);
                    return;
                """),format.raw/*18.17*/("""}"""),format.raw/*18.18*/("""
                """),format.raw/*19.17*/("""activeButton.addClass('active');

                $.ajax("""),format.raw/*21.24*/("""{"""),format.raw/*21.25*/("""
                    """),format.raw/*22.21*/("""url: 'http://localhost:9037/courses/details/' + courseId,
                    type: 'GET',
                    success: function(data) """),format.raw/*24.45*/("""{"""),format.raw/*24.46*/("""
                        """),format.raw/*25.25*/("""try """),format.raw/*25.29*/("""{"""),format.raw/*25.30*/("""
                            """),format.raw/*26.29*/("""console.log('Data received:', data);
                            var detailsHtml = '<table>';
                            detailsHtml += '<tr><th>Week</th><th>Start Date</th><th>Total Approved Hours</th><th>Total Hours Used</th><th>TA Details</th><th>Approval</th></tr>';
                            Object.keys(data.weeks).forEach(function(week) """),format.raw/*29.76*/("""{"""),format.raw/*29.77*/("""
                                """),format.raw/*30.33*/("""detailsHtml += '<tr>';
                                detailsHtml += '<td>' + week + '</td>';
                                detailsHtml += '<td>' + data.weeks[week].startDate + '</td>';
                                detailsHtml += '<td>' + data.weeks[week].totalApprovedHours + '</td>';
                                detailsHtml += '<td>' + data.weeks[week].totalHoursUsed + '</td>';
                                detailsHtml += '<td>';
                                data.weeks[week].taDetails.forEach(function(ta) """),format.raw/*36.81*/("""{"""),format.raw/*36.82*/("""
                                    """),format.raw/*37.37*/("""detailsHtml += ta.name + ': ' + ta.usedHours + ' hrs<br>';
                                """),format.raw/*38.33*/("""}"""),format.raw/*38.34*/(""");
                                detailsHtml += '</td>';
                                // detailsHtml += '<td><button onclick="approveTA(' + week.replace('Week ', '') + ')">Approve</button></td>';
                                if (data.weeks[week].approved) """),format.raw/*41.64*/("""{"""),format.raw/*41.65*/("""
                                    """),format.raw/*42.37*/("""detailsHtml += '<td>Approved</td>';
                                """),format.raw/*43.33*/("""}"""),format.raw/*43.34*/(""" """),format.raw/*43.35*/("""else """),format.raw/*43.40*/("""{"""),format.raw/*43.41*/("""
                                    """),format.raw/*44.37*/("""detailsHtml += '<td><button onclick="approveTA(' + week.replace('Week ', '') + ')">Approve</button></td>';
                                """),format.raw/*45.33*/("""}"""),format.raw/*45.34*/("""
                                """),format.raw/*46.33*/("""detailsHtml += '</tr>';
                            """),format.raw/*47.29*/("""}"""),format.raw/*47.30*/(""");
                            detailsHtml += '</table><br><br>';
                            $('#course-detail').html(detailsHtml);
                        """),format.raw/*50.25*/("""}"""),format.raw/*50.26*/(""" """),format.raw/*50.27*/("""catch (renderError) """),format.raw/*50.47*/("""{"""),format.raw/*50.48*/("""
                            """),format.raw/*51.29*/("""console.error("Error during rendering course details:", renderError);
                        """),format.raw/*52.25*/("""}"""),format.raw/*52.26*/("""
                    """),format.raw/*53.21*/("""}"""),format.raw/*53.22*/(""",
                    error: function(xhr, status, error) """),format.raw/*54.57*/("""{"""),format.raw/*54.58*/("""
                        """),format.raw/*55.25*/("""console.error("Error fetching course details:", error, status, xhr.responseText);
                    """),format.raw/*56.21*/("""}"""),format.raw/*56.22*/("""
                """),format.raw/*57.17*/("""}"""),format.raw/*57.18*/(""");
            """),format.raw/*58.13*/("""}"""),format.raw/*58.14*/("""

            """),format.raw/*60.13*/("""function approveTA(week) """),format.raw/*60.38*/("""{"""),format.raw/*60.39*/("""
                """),format.raw/*61.17*/("""var confirmApproval = confirm('Are you sure you want to approve all the TA hours for week ' + week + '?');
                if (confirmApproval) """),format.raw/*62.38*/("""{"""),format.raw/*62.39*/("""
                    """),format.raw/*63.21*/("""var courseId = $('.course-button.active').data('course-id');
                    $.ajax("""),format.raw/*64.28*/("""{"""),format.raw/*64.29*/("""
                        """),format.raw/*65.25*/("""url: 'http://localhost:9037/courses/approve/' + courseId + '/' + week,
                        type: 'POST',
                        success: function(data) """),format.raw/*67.49*/("""{"""),format.raw/*67.50*/("""
                            """),format.raw/*68.29*/("""console.log('Approval successful for week:', week);
                            $('button[onclick="approveTA(' + week + ')"]').hide();
                            $('button[onclick="approveTA(' + week + ')"]').closest('td').text('Approved');
                        """),format.raw/*71.25*/("""}"""),format.raw/*71.26*/(""",
                        error: function(xhr, status, error) """),format.raw/*72.61*/("""{"""),format.raw/*72.62*/("""
                            """),format.raw/*73.29*/("""console.error("Error approving TA hours:", error, status, xhr.responseText);
                        """),format.raw/*74.25*/("""}"""),format.raw/*74.26*/("""
                    """),format.raw/*75.21*/("""}"""),format.raw/*75.22*/(""");
                """),format.raw/*76.17*/("""}"""),format.raw/*76.18*/(""" """),format.raw/*76.19*/("""else """),format.raw/*76.24*/("""{"""),format.raw/*76.25*/("""
                    """),format.raw/*77.21*/("""console.log('Approval cancelled for week:', week);
                """),format.raw/*78.17*/("""}"""),format.raw/*78.18*/("""
            """),format.raw/*79.13*/("""}"""),format.raw/*79.14*/("""



    """),format.raw/*83.5*/("""</script>


    <style>
            .page-container """),format.raw/*87.29*/("""{"""),format.raw/*87.30*/("""
                """),format.raw/*88.17*/("""display: flex;
                justify-content: start;
            """),format.raw/*90.13*/("""}"""),format.raw/*90.14*/("""

            """),format.raw/*92.13*/(""".course-list """),format.raw/*92.26*/("""{"""),format.raw/*92.27*/("""
                """),format.raw/*93.17*/("""flex-basis: 13%;
                padding: 10px;
                margin-right: 20px;
                border-right: 1px solid #ccc;
            """),format.raw/*97.13*/("""}"""),format.raw/*97.14*/("""

            """),format.raw/*99.13*/(""".course-button """),format.raw/*99.28*/("""{"""),format.raw/*99.29*/("""
                """),format.raw/*100.17*/("""width: 100%;
                padding: 10px;
                margin-bottom: 5px;
                border: 1px solid #ddd;
                background-color: #f8f8f8;
                cursor: pointer;
            """),format.raw/*106.13*/("""}"""),format.raw/*106.14*/("""

            """),format.raw/*108.13*/(""".course-button.active """),format.raw/*108.35*/("""{"""),format.raw/*108.36*/("""
                """),format.raw/*109.17*/("""background-color: #e7e7e7;
            """),format.raw/*110.13*/("""}"""),format.raw/*110.14*/("""

            """),format.raw/*112.13*/(""".course-details """),format.raw/*112.29*/("""{"""),format.raw/*112.30*/("""
                """),format.raw/*113.17*/("""flex-basis: 80%;
                padding: 1px;
            """),format.raw/*115.13*/("""}"""),format.raw/*115.14*/("""


            """),format.raw/*118.13*/(""".course-details table """),format.raw/*118.35*/("""{"""),format.raw/*118.36*/("""
                """),format.raw/*119.17*/("""width: 100%;
                border-collapse: collapse;
            """),format.raw/*121.13*/("""}"""),format.raw/*121.14*/("""

            """),format.raw/*123.13*/(""".course-details th, .course-details td """),format.raw/*123.52*/("""{"""),format.raw/*123.53*/("""
                """),format.raw/*124.17*/("""border: 1px solid #ddd;
                padding: 8px;
                text-align: left;
            """),format.raw/*127.13*/("""}"""),format.raw/*127.14*/("""

            """),format.raw/*129.13*/(""".course-details th """),format.raw/*129.32*/("""{"""),format.raw/*129.33*/("""
                """),format.raw/*130.17*/("""background-color: #f2f2f2;
            """),format.raw/*131.13*/("""}"""),format.raw/*131.14*/("""

            """),format.raw/*133.13*/(""".active """),format.raw/*133.21*/("""{"""),format.raw/*133.22*/("""
                """),format.raw/*134.17*/("""/* change the background color of course button */
                background-color: #4CAF50; /* green */
                color: white;
            """),format.raw/*137.13*/("""}"""),format.raw/*137.14*/("""
    """),format.raw/*138.5*/("""</style>


""")))};
Seq[Any](format.raw/*2.26*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*141.2*/("""

"""),_display_(/*143.2*/main("Course List", scripts)/*143.30*/ {_display_(Seq[Any](format.raw/*143.32*/("""

    """),format.raw/*145.5*/("""<div class="row card-panel z-depth-0 project-zone-panel">
        <div class="col s12" style="margin-top: -10px;
            margin-bottom: -10px;">
            <h6 class="center tooltipped" data-position="bottom" data-tooltip="This list shows all the TA candidates." >
                <br>
                TA Weekly Hours Records
            </h6>
        </div>
    </div>

    <br>

    """),_display_(/*157.6*/if(courses.size() > 0)/*157.28*/ {_display_(Seq[Any](format.raw/*157.30*/("""
        """),format.raw/*158.9*/("""<div class="page-container">
            <div class="course-list">
            """),_display_(/*160.14*/for(course <- courses) yield /*160.36*/ {_display_(Seq[Any](format.raw/*160.38*/("""
                """),format.raw/*161.17*/("""<button class="course-button" data-course-id=""""),_display_(/*161.64*/course/*161.70*/.getId),format.raw/*161.76*/("""" onclick="loadCourseDetails('"""),_display_(/*161.107*/course/*161.113*/.getId),format.raw/*161.119*/("""')">"""),_display_(/*161.124*/course/*161.130*/.getCourseId),format.raw/*161.142*/("""</button>
            """)))}),format.raw/*162.14*/("""

            """),format.raw/*164.13*/("""</div>
            <div class="course-details">
                <div id="course-detail">
                        <!-- Detailed information will be rendered by js scripts above -->
                </div>
            </div>
        </div>
    """)))}/*171.7*/else/*171.12*/{_display_(Seq[Any](format.raw/*171.13*/("""
        """),format.raw/*172.9*/("""<h5>No courses in database.</h5>
    """)))}),format.raw/*173.6*/("""


""")))}),format.raw/*176.2*/("""
"""))
      }
    }
  }

  def render(courses:List[Course],listType:String): play.twirl.api.HtmlFormat.Appendable = apply(courses,listType)

  def f:((List[Course],String) => play.twirl.api.HtmlFormat.Appendable) = (courses,listType) => apply(courses,listType)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:36 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/taHoursRecords.scala.html
                  HASH: fa1cfdfd21ac01b8d296fec86d8bcf9627dc36e9
                  MATRIX: 1133->1|1255->53|1288->76|1302->83|1382->86|1413->91|1469->121|1483->127|1541->165|1711->307|1740->308|1785->325|2059->571|2088->572|2137->593|2275->703|2304->704|2349->721|2434->778|2463->779|2512->800|2675->935|2704->936|2757->961|2789->965|2818->966|2875->995|3250->1342|3279->1343|3340->1376|3894->1902|3923->1903|3988->1940|4107->2031|4136->2032|4428->2296|4457->2297|4522->2334|4618->2402|4647->2403|4676->2404|4709->2409|4738->2410|4803->2447|4970->2586|4999->2587|5060->2620|5140->2672|5169->2673|5354->2830|5383->2831|5412->2832|5460->2852|5489->2853|5546->2882|5668->2976|5697->2977|5746->2998|5775->2999|5861->3057|5890->3058|5943->3083|6073->3185|6102->3186|6147->3203|6176->3204|6219->3219|6248->3220|6290->3234|6343->3259|6372->3260|6417->3277|6589->3421|6618->3422|6667->3443|6783->3531|6812->3532|6865->3557|7050->3714|7079->3715|7136->3744|7430->4010|7459->4011|7549->4073|7578->4074|7635->4103|7764->4204|7793->4205|7842->4226|7871->4227|7918->4246|7947->4247|7976->4248|8009->4253|8038->4254|8087->4275|8182->4342|8211->4343|8252->4356|8281->4357|8316->4365|8396->4417|8425->4418|8470->4435|8565->4502|8594->4503|8636->4517|8677->4530|8706->4531|8751->4548|8921->4690|8950->4691|8992->4705|9035->4720|9064->4721|9110->4738|9347->4946|9377->4947|9420->4961|9471->4983|9501->4984|9547->5001|9615->5040|9645->5041|9688->5055|9733->5071|9763->5072|9809->5089|9897->5148|9927->5149|9971->5164|10022->5186|10052->5187|10098->5204|10195->5272|10225->5273|10268->5287|10336->5326|10366->5327|10412->5344|10541->5444|10571->5445|10614->5459|10662->5478|10692->5479|10738->5496|10806->5535|10836->5536|10879->5550|10916->5558|10946->5559|10992->5576|11169->5724|11199->5725|11232->5730|11283->50|11311->74|11340->5742|11370->5745|11408->5773|11449->5775|11483->5781|11901->6172|11933->6194|11974->6196|12011->6205|12119->6285|12158->6307|12199->6309|12245->6326|12320->6373|12336->6379|12364->6385|12424->6416|12441->6422|12470->6428|12504->6433|12521->6439|12556->6451|12611->6474|12654->6488|12915->6731|12929->6736|12969->6737|13006->6746|13075->6784|13110->6788
                  LINES: 35->1|39->4|41->6|41->6|43->6|44->7|44->7|44->7|44->7|48->11|48->11|49->12|52->15|52->15|53->16|55->18|55->18|56->19|58->21|58->21|59->22|61->24|61->24|62->25|62->25|62->25|63->26|66->29|66->29|67->30|73->36|73->36|74->37|75->38|75->38|78->41|78->41|79->42|80->43|80->43|80->43|80->43|80->43|81->44|82->45|82->45|83->46|84->47|84->47|87->50|87->50|87->50|87->50|87->50|88->51|89->52|89->52|90->53|90->53|91->54|91->54|92->55|93->56|93->56|94->57|94->57|95->58|95->58|97->60|97->60|97->60|98->61|99->62|99->62|100->63|101->64|101->64|102->65|104->67|104->67|105->68|108->71|108->71|109->72|109->72|110->73|111->74|111->74|112->75|112->75|113->76|113->76|113->76|113->76|113->76|114->77|115->78|115->78|116->79|116->79|120->83|124->87|124->87|125->88|127->90|127->90|129->92|129->92|129->92|130->93|134->97|134->97|136->99|136->99|136->99|137->100|143->106|143->106|145->108|145->108|145->108|146->109|147->110|147->110|149->112|149->112|149->112|150->113|152->115|152->115|155->118|155->118|155->118|156->119|158->121|158->121|160->123|160->123|160->123|161->124|164->127|164->127|166->129|166->129|166->129|167->130|168->131|168->131|170->133|170->133|170->133|171->134|174->137|174->137|175->138|179->2|181->5|182->141|184->143|184->143|184->143|186->145|198->157|198->157|198->157|199->158|201->160|201->160|201->160|202->161|202->161|202->161|202->161|202->161|202->161|202->161|202->161|202->161|202->161|203->162|205->164|212->171|212->171|212->171|213->172|214->173|217->176
                  -- GENERATED --
              */
          