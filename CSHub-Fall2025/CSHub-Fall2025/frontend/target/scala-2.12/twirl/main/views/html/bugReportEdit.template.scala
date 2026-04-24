
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

object bugReportEdit extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[BugReport,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(bugReport: BugReport):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.24*/("""
"""),format.raw/*3.1*/("""


"""),_display_(/*6.2*/main("Update Datasets")/*6.25*/ {_display_(Seq[Any](format.raw/*6.27*/("""
    """),format.raw/*7.5*/("""<div class="container">
        <div class="row">
            <div class="col s12">
                <div class="card-panel">
                    <h4 class="center">"""),_display_(/*11.41*/bugReport/*11.50*/.getTitle),format.raw/*11.59*/("""</h4>
                    <div class="row">
                        <div class="col s12">
                            <form class="form-signin" id="update" enctype="multipart/form-data" method="post" action=""""),_display_(/*14.120*/routes/*14.126*/.BugReportController.bugReportEditPOST(bugReport.getId)),format.raw/*14.181*/("""">
                                <div class="row">
                                    <div class="col s12">

                                        <div class="col s12">
                                            <table class="striped responsive-table">
                                                <tbody>
                                                    <tr>
                                                        <th>Name</th>
                                                        <td>"""),_display_(/*23.62*/bugReport/*23.71*/.getReporter.getUserName),format.raw/*23.95*/("""</td>
                                                    </tr>
                                                    <tr>
                                                        <th>Email</th>
                                                        <td>"""),_display_(/*27.62*/bugReport/*27.71*/.getReporter.getEmail),format.raw/*27.92*/("""</td>
                                                    </tr>
                                                    """),_display_(/*29.54*/if(bugReport.getReporter.getOrganization != null && bugReport.getReporter.getOrganization != "")/*29.150*/ {_display_(Seq[Any](format.raw/*29.152*/("""
                                                        """),format.raw/*30.57*/("""<tr>
                                                            <th>Organization</th>
                                                            <td>"""),_display_(/*32.66*/bugReport/*32.75*/.getReporter.getOrganization),format.raw/*32.103*/("""</td>
                                                        </tr>
                                                    """)))}),format.raw/*34.54*/("""
                                                    """),format.raw/*35.53*/("""<tr>
                                                        <th>createdTime</th>
                                                        <td>"""),_display_(/*37.62*/bugReport/*37.71*/.getCreateTime),format.raw/*37.85*/("""</td>
                                                    </tr>
                                                    <tr>
                                                        <th>solvedTime</th>
                                                        """),_display_(/*41.58*/if(bugReport.getSolveTime == "")/*41.90*/{_display_(Seq[Any](format.raw/*41.91*/("""
                                                            """),format.raw/*42.61*/("""<td>Not Solved Yet</td>
                                                        """)))}/*43.58*/else/*43.63*/{_display_(Seq[Any](format.raw/*43.64*/("""
                                                            """),format.raw/*44.61*/("""<td>"""),_display_(/*44.66*/bugReport/*44.75*/.getSolveTime),format.raw/*44.88*/("""</td>
                                                        """)))}),format.raw/*45.58*/("""
                                                    """),format.raw/*46.53*/("""</tr>
                                                </tbody>
                                            </table>
                                        </div>
                                    </div>

                                </div>
                                <div class="row">
                                    <div class="col s12">
                                        <h6 class="col s6" align="left">Editable</h6>

                                        <input type="hidden" name="id" value=""""),_display_(/*57.80*/bugReport/*57.89*/.getId()),format.raw/*57.97*/("""">


                                        <input type="hidden" name="email" value=""""),_display_(/*60.83*/bugReport/*60.92*/.getReporter.getEmail()),format.raw/*60.115*/("""">
                                        <input type="hidden" name="name" value=""""),_display_(/*61.82*/bugReport/*61.91*/.getReporter.getUserName()),format.raw/*61.117*/("""">
                                        <input type="hidden" name="organization" value=""""),_display_(/*62.90*/bugReport/*62.99*/.getReporter.getOrganization()),format.raw/*62.129*/("""">



                                        <div class="row">
                                            <div class="input-field col s12">
                                                <input
                                                type="text" name="title" id="title" class="validate"
                                                value=""""),_display_(/*70.57*/bugReport/*70.66*/.getTitle),format.raw/*70.75*/("""" required="true">
                                                <label for="title" class="tootltipLabel">
                                                    title* <i class=" tiny material-icons tooltipped" data-position="bottom">
                                                    help</i></label>
                                                <span id="titleMsg" class="helper-text" data-error=""></span>
                                            </div>
                                        </div>

                                        <div class="row">
                                            <div class="input-field col s12">
                                                <input
                                                type="text" name="description" id="description" class="validate"
                                                value=""""),_display_(/*82.57*/bugReport/*82.66*/.getDescription),format.raw/*82.81*/("""" required="true">
                                                <label for="description" class="tootltipLabel">
                                                    description* <i class=" tiny material-icons tooltipped" data-position="bottom">
                                                    help</i></label>
                                                <span id="descriptionMsg" class="helper-text" data-error=""></span>
                                            </div>
                                        </div>

                                        <div class="row">
                                            <div class="input-field col s12">
                                                <input type="text" class="validate" id="longDescription" value=""""),_display_(/*92.114*/bugReport/*92.123*/.getLongDescription),format.raw/*92.142*/("""" name="longDescription" >
                                                <label for="longDescription">Long Description</label>
                                                <span id="shortDescriptionMsg" class="helper-text" data-error=""></span>
                                            </div>
                                        </div>
                                        <input type="hidden" name="solved" value=""""),_display_(/*97.84*/bugReport/*97.93*/.getSolved()),format.raw/*97.105*/("""">
                                        <input type="hidden" name="createdTime" value=""""),_display_(/*98.89*/bugReport/*98.98*/.getCreateTime()),format.raw/*98.114*/("""">
                                        <input type="hidden" name="createdTime" value=""""),_display_(/*99.89*/bugReport/*99.98*/.getSolveTime()),format.raw/*99.113*/("""">

                                        <div class="row center">
                                            <button type="submit" id="updateNotebook" class="center btn waves-effect waves-light blue darken-2">
                                                Update</button>
                                            """),format.raw/*104.98*/("""
                                            """),format.raw/*105.45*/("""<a class=" center btn waves-effect waves-light blue darken-2" href=""""),_display_(/*105.114*/routes/*105.120*/.BugReportController.bugReportList(1)),format.raw/*105.157*/("""">
                                                Back</a>
                                            <div class="helper-text red-text" id="submitErrorMsg"></div>
                                        </div>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

""")))}),format.raw/*119.2*/("""
"""))
      }
    }
  }

  def render(bugReport:BugReport): play.twirl.api.HtmlFormat.Appendable = apply(bugReport)

  def f:((BugReport) => play.twirl.api.HtmlFormat.Appendable) = (bugReport) => apply(bugReport)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:29 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/bugReportEdit.scala.html
                  HASH: d2f5204db36c113da708bc11c4d4610301f632c0
                  MATRIX: 1122->1|1217->25|1262->23|1289->41|1318->45|1349->68|1388->70|1419->75|1611->240|1629->249|1659->258|1896->467|1912->473|1989->528|2519->1031|2537->1040|2582->1064|2862->1317|2880->1326|2922->1347|3066->1464|3172->1560|3213->1562|3298->1619|3477->1771|3495->1780|3545->1808|3697->1929|3778->1982|3948->2125|3966->2134|4001->2148|4282->2402|4323->2434|4362->2435|4451->2496|4551->2577|4564->2582|4603->2583|4692->2644|4724->2649|4742->2658|4776->2671|4870->2734|4951->2787|5498->3307|5516->3316|5545->3324|5659->3411|5677->3420|5722->3443|5833->3527|5851->3536|5899->3562|6018->3654|6036->3663|6088->3693|6469->4047|6487->4056|6517->4065|7417->4938|7435->4947|7471->4962|8279->5742|8298->5751|8339->5770|8797->6201|8815->6210|8849->6222|8967->6313|8985->6322|9023->6338|9141->6429|9159->6438|9196->6453|9547->6828|9621->6873|9719->6942|9736->6948|9796->6985|10285->7443
                  LINES: 35->1|38->2|41->1|42->3|45->6|45->6|45->6|46->7|50->11|50->11|50->11|53->14|53->14|53->14|62->23|62->23|62->23|66->27|66->27|66->27|68->29|68->29|68->29|69->30|71->32|71->32|71->32|73->34|74->35|76->37|76->37|76->37|80->41|80->41|80->41|81->42|82->43|82->43|82->43|83->44|83->44|83->44|83->44|84->45|85->46|96->57|96->57|96->57|99->60|99->60|99->60|100->61|100->61|100->61|101->62|101->62|101->62|109->70|109->70|109->70|121->82|121->82|121->82|131->92|131->92|131->92|136->97|136->97|136->97|137->98|137->98|137->98|138->99|138->99|138->99|143->104|144->105|144->105|144->105|144->105|158->119
                  -- GENERATED --
              */
          