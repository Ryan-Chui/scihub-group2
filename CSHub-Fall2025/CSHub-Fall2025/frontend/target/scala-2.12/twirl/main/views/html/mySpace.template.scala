
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

object mySpace extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userTypes: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*3.2*/scripts/*3.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.13*/("""
    """),format.raw/*4.5*/("""<link href='"""),_display_(/*4.18*/routes/*4.24*/.Assets.at("stylesheets/quill.snow.css")),format.raw/*4.64*/("""'
    rel="stylesheet" />
    <script type="text/javascript" src='"""),_display_(/*6.42*/routes/*6.48*/.Assets.at("javascripts/plugins/quill.js")),format.raw/*6.90*/("""'></script>
""")))};
Seq[Any](format.raw/*1.21*/("""

"""),format.raw/*7.2*/("""
"""),_display_(/*8.2*/main("My Space", scripts)/*8.27*/ {_display_(Seq[Any](format.raw/*8.29*/("""
    """),format.raw/*9.5*/("""<div class="container">
        <div class="row">
            <div class="card-panel">
                <div class="row center">
                    <h4 class="center form-signin-heading" align="center">
                        My Space
                    </h4>
                </div>
                <div class="row center">
"""),format.raw/*18.44*/("""
"""),format.raw/*19.48*/("""
"""),format.raw/*20.97*/("""
"""),format.raw/*21.79*/("""
"""),format.raw/*22.73*/("""
"""),format.raw/*23.31*/("""
"""),format.raw/*24.22*/("""
                    """),_display_(/*25.22*/if(userTypes == "1")/*25.42*/ {_display_(Seq[Any](format.raw/*25.44*/("""
                        """),format.raw/*26.25*/("""<div class="col s6 m3">
                            <a href=""""),_display_(/*27.39*/routes/*27.45*/.ChallengeController.challengeListAppliedByUser(1)),format.raw/*27.95*/("""">
                                <i class="material-icons large">assignment</i>
                                <p>Applied Challenges</p></a>
                        </div>
                    """)))}),format.raw/*31.22*/("""
                    """),_display_(/*32.22*/if(userTypes != "4")/*32.42*/ {_display_(Seq[Any](format.raw/*32.44*/("""
                        """),format.raw/*33.25*/("""<div class="col s6 m3">
                            <a href=""""),_display_(/*34.39*/routes/*34.45*/.JobController.jobListPostedByUser(1)),format.raw/*34.82*/("""">
                                <i class="material-icons large">work</i>
                                <p>Posted Jobs</p>
                            </a>
                        </div>
                    """)))}),format.raw/*39.22*/("""
                    """),_display_(/*40.22*/if(userTypes == "2")/*40.42*/ {_display_(Seq[Any](format.raw/*40.44*/("""
                        """),format.raw/*41.25*/("""<div class="col s6 m3">
                            <a href=""""),_display_(/*42.39*/routes/*42.45*/.ChallengeController.challengeListPostedByUser(1)),format.raw/*42.94*/("""">
                                <i class="material-icons large">work</i>
                                <p>Posted Challenges</p>
                            </a>
                        </div>
                    """)))}),format.raw/*47.22*/("""
                    """),format.raw/*55.23*/("""
                    """),_display_(/*56.22*/if(userTypes != "2")/*56.42*/ {_display_(Seq[Any](format.raw/*56.44*/("""
                        """),format.raw/*57.25*/("""<div class="col s6 m3">
                            <a href=""""),_display_(/*58.39*/routes/*58.45*/.JobController.jobListAppliedByUser(1)),format.raw/*58.83*/("""">
                                <i class="material-icons large">school</i>
                                <p>Applied Jobs</p>
                            </a>
                        </div>
                    """)))}),format.raw/*63.22*/("""
                    """),_display_(/*64.22*/if(userTypes == "1")/*64.42*/ {_display_(Seq[Any](format.raw/*64.44*/("""
                        """),format.raw/*65.25*/("""<div class="col s6 m3">
                            <a href=""""),_display_(/*66.39*/routes/*66.45*/.RAJobController.rajobListPostedByUser(1)),format.raw/*66.86*/("""">
                                <i class="material-icons large">live_help</i>
                                <p>Posted RA Jobs</p>
                            </a>
                        </div>
                    """)))}),format.raw/*71.22*/("""
                    """),format.raw/*79.23*/("""
                    """),_display_(/*80.22*/if(userTypes == "4")/*80.42*/ {_display_(Seq[Any](format.raw/*80.44*/("""
                        """),format.raw/*81.25*/("""<div class="col s6 m3">
                            <a href=""""),_display_(/*82.39*/routes/*82.45*/.RAJobController.rajobListAppliedByUser(1)),format.raw/*82.87*/("""">
                                <i class="material-icons large">person_add</i>
                                <p>Applied RA Jobs</p>
                            </a>
                        </div>
                    """)))}),format.raw/*87.22*/("""
                """),format.raw/*88.17*/("""</div>
            </div>
        </div>
    </div>
""")))}))
      }
    }
  }

  def render(userTypes:String): play.twirl.api.HtmlFormat.Appendable = apply(userTypes)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (userTypes) => apply(userTypes)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:33 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/mySpace.scala.html
                  HASH: c60f271d3dc20017967086521216863b697abef7
                  MATRIX: 1113->1|1210->23|1224->30|1304->34|1335->39|1374->52|1388->58|1448->98|1541->165|1555->171|1617->213|1669->20|1697->226|1724->228|1757->253|1796->255|1827->260|2181->629|2210->677|2239->774|2268->853|2297->926|2326->957|2355->979|2404->1001|2433->1021|2473->1023|2526->1048|2615->1110|2630->1116|2701->1166|2928->1362|2977->1384|3006->1404|3046->1406|3099->1431|3188->1493|3203->1499|3261->1536|3504->1748|3553->1770|3582->1790|3622->1792|3675->1817|3764->1879|3779->1885|3849->1934|4098->2152|4147->2503|4196->2525|4225->2545|4265->2547|4318->2572|4407->2634|4422->2640|4481->2678|4727->2893|4776->2915|4805->2935|4845->2937|4898->2962|4987->3024|5002->3030|5064->3071|5315->3291|5364->3644|5413->3666|5442->3686|5482->3688|5535->3713|5624->3775|5639->3781|5702->3823|5955->4045|6000->4062
                  LINES: 35->1|39->3|39->3|41->3|42->4|42->4|42->4|42->4|44->6|44->6|44->6|46->1|48->7|49->8|49->8|49->8|50->9|59->18|60->19|61->20|62->21|63->22|64->23|65->24|66->25|66->25|66->25|67->26|68->27|68->27|68->27|72->31|73->32|73->32|73->32|74->33|75->34|75->34|75->34|80->39|81->40|81->40|81->40|82->41|83->42|83->42|83->42|88->47|89->55|90->56|90->56|90->56|91->57|92->58|92->58|92->58|97->63|98->64|98->64|98->64|99->65|100->66|100->66|100->66|105->71|106->79|107->80|107->80|107->80|108->81|109->82|109->82|109->82|114->87|115->88
                  -- GENERATED --
              */
          