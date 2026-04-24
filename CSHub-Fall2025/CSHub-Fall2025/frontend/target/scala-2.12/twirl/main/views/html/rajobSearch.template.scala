
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
/*3.2*/import models.RAJob

object rajobSearch extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
              document.getElementById("title").disabled = true;
              document.getElementById("title").value = "";
              document.getElementById("description").disabled = true;
              document.getElementById("description").value = "";

              document.getElementById("location").disabled = true;
              document.getElementById("location").value = "";
              document.getElementById("goals").disabled = true;
              document.getElementById("goals").value = ""

            """),format.raw/*23.13*/("""}"""),format.raw/*23.14*/(""" """),format.raw/*23.15*/("""else """),format.raw/*23.20*/("""{"""),format.raw/*23.21*/("""
              """),format.raw/*24.15*/("""document.getElementById("keyword-msg").innerText = "";
              document.getElementById("title").disabled = false;
              document.getElementById("description").disabled = false;
              document.getElementById("location").disabled = false;
              document.getElementById("goals").disabled = false;


            """),format.raw/*31.13*/("""}"""),format.raw/*31.14*/("""
          """),format.raw/*32.11*/("""}"""),format.raw/*32.12*/("""

          """),format.raw/*34.11*/("""function validateSearch() """),format.raw/*34.37*/("""{"""),format.raw/*34.38*/("""
            """),format.raw/*35.13*/("""var keywords = document.getElementById("keywords")?.value.trim() || "";
            var title = document.getElementById("title")?.value.trim() || "";
            var description = document.getElementById("description")?.value.trim() || "";
            var location = document.getElementById("location")?.value.trim() || "";
            var goals = document.getElementById("goals")?.value.trim() || "";

            if (keywords === "" && title === "" && description === "" && location === "" && goals === "") """),format.raw/*41.107*/("""{"""),format.raw/*41.108*/("""
              """),format.raw/*42.15*/("""alert("Please fill in at least one search criterion!");
              return false;
            """),format.raw/*44.13*/("""}"""),format.raw/*44.14*/("""
            """),format.raw/*45.13*/("""return true;
          """),format.raw/*46.11*/("""}"""),format.raw/*46.12*/("""


  """),format.raw/*49.3*/("""</script>
""")))};
Seq[Any](format.raw/*50.2*/("""

"""),_display_(/*52.2*/main("Search RA Job", scripts)/*52.32*/ {_display_(Seq[Any](format.raw/*52.34*/("""

  """),_display_(/*54.4*/helper/*54.10*/.form(routes.RAJobController.searchPOST(1, "id"), 'onsubmit -> "return validateSearch();")/*54.100*/ {_display_(Seq[Any](format.raw/*54.102*/("""

    """),format.raw/*56.5*/("""<div class="container">
      <div class="row">
        <div class="col s12 m10 offset-m1">
          <div class="card-panel">
            <form class="form-signin">
              <h3 class="form-signin-heading" align="center">Search RA Job</h3>
              <div class="row">
                <div class="input-field col s12">
                  <input type="text" name="keywords" id="keywords" onchange="disableOtherFields()">
                  <label for="keywords">
                    Keywords (Searching based on keywords, returns the jobs having the specified keywords in any part of the RA job details).</label>
                  <div class="form-group" id="keyword-msg" style="color: blue;"></div>
                </div>
              </div>

              <div class="row">
                <div class="input-field col s12">
                  <input type="text" name="title" id="title">
                  <label for="name">RA Job Title</label>
                </div>
              </div>

              <div class="row">
                <div class="input-field col s12">
                  <input type="text" name="description" id="description">
                  <label for="description">Description</label>
                </div>
              </div>


"""),format.raw/*86.36*/("""
"""),format.raw/*87.54*/("""
"""),format.raw/*88.72*/("""
"""),format.raw/*89.61*/("""
"""),format.raw/*90.27*/("""
"""),format.raw/*91.25*/("""

              """),format.raw/*93.15*/("""<div class="row">
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
                <a href=""""),_display_(/*113.27*/routes/*113.33*/.Application.home()),format.raw/*113.52*/("""" class="btn waves-effect waves-light red darken-2">
                  Cancel</a>
              </div>
            </form>
          </div>
        </div>
      </div>
    </div>
  """)))}),format.raw/*121.4*/("""
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
                  DATE: Fri Apr 24 12:50:36 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/rajobSearch.scala.html
                  HASH: 0cf61c9025a08222fc51cad4cdc9d7a56133d7e0
                  MATRIX: 814->1|837->18|860->35|1256->57|1270->64|1350->68|1379->71|1479->144|1507->145|1547->158|1711->294|1740->295|1783->310|2464->963|2493->964|2522->965|2555->970|2584->971|2627->986|2993->1324|3022->1325|3061->1336|3090->1337|3130->1349|3184->1375|3213->1376|3254->1389|3792->1898|3822->1899|3865->1914|3989->2010|4018->2011|4059->2024|4110->2047|4139->2048|4171->2053|4221->2064|4250->2067|4289->2097|4329->2099|4360->2104|4375->2110|4475->2200|4516->2202|4549->2208|5839->3505|5868->3559|5897->3631|5926->3692|5955->3719|5984->3744|6028->3760|6796->4500|6812->4506|6853->4525|7066->4707
                  LINES: 31->1|32->2|33->3|42->5|42->5|44->5|45->6|47->8|47->8|48->9|50->11|50->11|51->12|62->23|62->23|62->23|62->23|62->23|63->24|70->31|70->31|71->32|71->32|73->34|73->34|73->34|74->35|80->41|80->41|81->42|83->44|83->44|84->45|85->46|85->46|88->49|90->50|92->52|92->52|92->52|94->54|94->54|94->54|94->54|96->56|126->86|127->87|128->88|129->89|130->90|131->91|133->93|153->113|153->113|153->113|161->121
                  -- GENERATED --
              */
          