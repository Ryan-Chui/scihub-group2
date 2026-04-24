
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
/*1.2*/import helper._
/*2.2*/import models._
/*3.2*/import models.TAJob

object tajobSearch extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*5.2*/scripts/*5.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.13*/("""
  """),format.raw/*6.3*/("""<script type="text/javascript">

          function disableOtherFields() """),format.raw/*8.41*/("""{"""),format.raw/*8.42*/("""
            """),format.raw/*9.13*/("""var keywords = "" + document.getElementById("keywords").value;
            keywords = keywords.trim();
            if (keywords !== "") """),format.raw/*11.34*/("""{"""),format.raw/*11.35*/("""
              """),format.raw/*12.15*/("""document.getElementById("keyword-msg").innerText = "Specifying keywords for search would disable other search criteria options.";
              document.getElementById("name").disabled = true;
              document.getElementById("name").value = "";
              document.getElementById("description").disabled = true;
              document.getElementById("description").value = "";

              document.getElementById("location").disabled = true;
              document.getElementById("location").value = "";
              document.getElementById("goals").disabled = true;
              document.getElementById("goals").value = ""

            """),format.raw/*23.13*/("""}"""),format.raw/*23.14*/(""" """),format.raw/*23.15*/("""else """),format.raw/*23.20*/("""{"""),format.raw/*23.21*/("""
              """),format.raw/*24.15*/("""document.getElementById("keyword-msg").innerText = "";
              document.getElementById("name").disabled = false;
              document.getElementById("description").disabled = false;
              document.getElementById("location").disabled = false;
              document.getElementById("goals").disabled = false;


            """),format.raw/*31.13*/("""}"""),format.raw/*31.14*/("""
          """),format.raw/*32.11*/("""}"""),format.raw/*32.12*/("""





  """),format.raw/*38.3*/("""</script>
""")))};
Seq[Any](format.raw/*39.2*/("""

"""),_display_(/*41.2*/main("Search TA Job", scripts)/*41.32*/ {_display_(Seq[Any](format.raw/*41.34*/("""

  """),_display_(/*43.4*/helper/*43.10*/.form(routes.JobController.searchPOST(1, "id"))/*43.57*/ {_display_(Seq[Any](format.raw/*43.59*/("""

    """),format.raw/*45.5*/("""<div class="container">
      <div class="row">
        <div class="col s12 m10 offset-m1">
          <div class="card-panel">
            <form class="form-signin">
              <h3 class="form-signin-heading" align="center">Search Job</h3>
              <div class="row">
                <div class="input-field col s12">
                  <input type="text" name="keywords" id="keywords" onchange="disableOtherFields()">
                  <label for="keywords">
                    Keywords (Searching based on keywords, returns the jobs having the specified keywords in any part of the TA job details).</label>
                  <div class="form-group" id="keyword-msg" style="color: blue;"></div>
                </div>
              </div>

              <div class="row">
                <div class="input-field col s12">
                  <input type="text" name="name" id="name">
                  <label for="name">TA Job Name</label>
                </div>
              </div>

              <div class="row">
                <div class="input-field col s12">
                  <input type="text" name="description" id="description">
                  <label for="description">Description</label>
                </div>
              </div>


              <div class="row">
                <div class="input-field col s12">
                  <input type="text" name="keywords" id="keywords">
                  <label for="keywords">Keywords</label>
                </div>
              </div>

              <div class="row">
                <div class="input-field col s12">
                  <input type="text" name="goals" id="goals">
                  <label for="goals">Goals</label>
                </div>
              </div>


              <div class="row">
                <div class="input-field col s12">
                  <div id="show" style="display: none;">
                    <textarea class="materialize-textarea" id="content"></textarea>
                  </div>
                </div>
              </div>


              <div class="center">
                <button id="search" class="hidden btn waves-effect waves-light blue darken-2" type="submit" value="Search">
                  Search</button>
                <a href=""""),_display_(/*102.27*/routes/*102.33*/.Application.home()),format.raw/*102.52*/("""" class="btn waves-effect waves-light red darken-2">
                  Cancel</a>
              </div>
            </form>
          </div>
        </div>
      </div>
    </div>
  """)))}),format.raw/*110.4*/("""
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:38 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/tajobSearch.scala.html
                  HASH: 7165dca7b8a2db384742048066058100d7dbc9ff
                  MATRIX: 814->1|837->18|860->35|1256->57|1270->64|1350->68|1379->71|1479->144|1507->145|1547->158|1711->294|1740->295|1783->310|2462->961|2491->962|2520->963|2553->968|2582->969|2625->984|2990->1321|3019->1322|3058->1333|3087->1334|3122->1342|3172->1353|3201->1356|3240->1386|3280->1388|3311->1393|3326->1399|3382->1446|3422->1448|3455->1454|5745->3716|5761->3722|5802->3741|6015->3923
                  LINES: 31->1|32->2|33->3|42->5|42->5|44->5|45->6|47->8|47->8|48->9|50->11|50->11|51->12|62->23|62->23|62->23|62->23|62->23|63->24|70->31|70->31|71->32|71->32|77->38|79->39|81->41|81->41|81->41|83->43|83->43|83->43|83->43|85->45|142->102|142->102|142->102|150->110
                  -- GENERATED --
              */
          