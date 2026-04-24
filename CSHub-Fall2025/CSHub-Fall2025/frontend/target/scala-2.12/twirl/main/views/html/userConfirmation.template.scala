
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

object userConfirmation extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(createTitle: String, createMessage: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.46*/("""

"""),_display_(/*3.2*/main("Create User Successfully")/*3.34*/ {_display_(Seq[Any](format.raw/*3.36*/("""

	"""),format.raw/*5.2*/("""<div class="container">
		<div class="center">
			<div class="card-panel">
				<h4>"""),_display_(/*8.10*/createTitle),format.raw/*8.21*/("""</h4>
				<h5>"""),_display_(/*9.10*/createMessage),format.raw/*9.23*/("""</h5>
				<span id="show"></span>
			</div>
		</div>
	</div>
	<script type="text/javascript">
			var t=5; // set the time of re-directing
			setInterval("refer()",1000); // 1s start up
			function refer()"""),format.raw/*17.20*/("""{"""),format.raw/*17.21*/("""
				"""),format.raw/*18.5*/("""if(t === 0)"""),format.raw/*18.16*/("""{"""),format.raw/*18.17*/("""
					"""),format.raw/*19.6*/("""location='"""),_display_(/*19.17*/routes/*19.23*/.Application.login()),format.raw/*19.43*/("""';
				"""),format.raw/*20.5*/("""}"""),format.raw/*20.6*/("""
				"""),format.raw/*21.5*/("""document.getElementById('show').innerHTML="The page will be redirected to the home page in "
						+""+t+" seconds";
				t--;
			"""),format.raw/*24.4*/("""}"""),format.raw/*24.5*/("""
	"""),format.raw/*25.2*/("""</script>
""")))}))
      }
    }
  }

  def render(createTitle:String,createMessage:String): play.twirl.api.HtmlFormat.Appendable = apply(createTitle,createMessage)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (createTitle,createMessage) => apply(createTitle,createMessage)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:39 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/userConfirmation.scala.html
                  HASH: a243af50786d3413f8bf81a46c81f57d0f2f72b2
                  MATRIX: 1129->1|1268->45|1296->48|1336->80|1375->82|1404->85|1514->169|1545->180|1586->195|1619->208|1851->412|1880->413|1912->418|1951->429|1980->430|2013->436|2051->447|2066->453|2107->473|2141->480|2169->481|2201->486|2357->615|2385->616|2414->618
                  LINES: 35->1|40->1|42->3|42->3|42->3|44->5|47->8|47->8|48->9|48->9|56->17|56->17|57->18|57->18|57->18|58->19|58->19|58->19|58->19|59->20|59->20|60->21|63->24|63->24|64->25
                  -- GENERATED --
              */
          