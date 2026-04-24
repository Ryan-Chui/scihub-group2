
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
/*3.2*/import models.Project
/*4.2*/import models.Challenge

object challengeSearch extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*6.6*/scripts/*6.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.17*/("""
    """),format.raw/*7.5*/("""<script type="text/javascript">
        function disableOtherFields() """),format.raw/*8.39*/("""{"""),format.raw/*8.40*/("""
            """),format.raw/*9.13*/("""var keywords = document.getElementById("keywords").value;
            keywords = keywords.trim();
            if (keywords !== "") """),format.raw/*11.34*/("""{"""),format.raw/*11.35*/("""
                """),format.raw/*12.17*/("""document.getElementById("keyword-msg").innerText = "Specifying keywords for search would disable other search criteria options.";
                document.getElementById("name").disabled = true;
                document.getElementById("name").value = "";
                document.getElementById("description").disabled = true;
                document.getElementById("description").value = "";
                document.getElementById("location").disabled = true;
                document.getElementById("location").value = "";
                document.getElementById("goals").disabled = true;
                document.getElementById("goals").value = "";
            """),format.raw/*21.13*/("""}"""),format.raw/*21.14*/(""" """),format.raw/*21.15*/("""else """),format.raw/*21.20*/("""{"""),format.raw/*21.21*/("""
                """),format.raw/*22.17*/("""document.getElementById("keyword-msg").innerText = "";
                document.getElementById("name").disabled = false;
                document.getElementById("description").disabled = false;
                document.getElementById("location").disabled = false;
                document.getElementById("goals").disabled = false;
            """),format.raw/*27.13*/("""}"""),format.raw/*27.14*/("""
        """),format.raw/*28.9*/("""}"""),format.raw/*28.10*/("""

        """),format.raw/*30.9*/("""function validateSearch() """),format.raw/*30.35*/("""{"""),format.raw/*30.36*/("""
            """),format.raw/*31.13*/("""var keywords = document.getElementById("keywords").value.trim();
            var name = document.getElementById("name").value.trim();
            var description = document.getElementById("description").value.trim();
            var location = document.getElementById("location").value.trim();
            var goals = document.getElementById("goals").value.trim();

            if (keywords === "" && name === "" && description === "" && location === "" && goals === "") """),format.raw/*37.106*/("""{"""),format.raw/*37.107*/("""
                """),format.raw/*38.17*/("""alert("Please fill in at least one search criterion!");
                return false;
            """),format.raw/*40.13*/("""}"""),format.raw/*40.14*/("""
            """),format.raw/*41.13*/("""return true;
        """),format.raw/*42.9*/("""}"""),format.raw/*42.10*/("""
    """),format.raw/*43.5*/("""</script>
""")))};
Seq[Any](format.raw/*44.2*/("""

"""),_display_(/*46.2*/main("Search Challenge", scripts)/*46.35*/ {_display_(Seq[Any](format.raw/*46.37*/("""

    """),_display_(/*48.6*/helper/*48.12*/.form(routes.ChallengeController.searchPOST(1, "id"), 'onsubmit -> "return validateSearch();")/*48.106*/ {_display_(Seq[Any](format.raw/*48.108*/("""

        """),format.raw/*50.9*/("""<div class="container">
            <div class="row">
                <div class="col s12 m10 offset-m1">
                    <div class="card-panel">
                        <h3 class="form-signin-heading" align="center">Search Challenge</h3>
                        <div class="row">
                            <div class="input-field col s12">
                                <input type="text" name="keywords" id="keywords" onchange="disableOtherFields()">
                                <label for="keywords">
                                    Keywords (Searching based on keywords, returns the challenges having the specified keywords in any part of the challenge details)
                                </label>
                                <div class="form-group" id="keyword-msg" style="color: blue;"></div>
                            </div>
                        </div>

                        <div class="row">
                            <div class="input-field col s12">
                                <input type="text" name="name" id="name">
                                <label for="name">Challenge Name</label>
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
                                <input type="text" name="location" id="location">
                                <label for="location">Location</label>
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
                                Search
                            </button>
                            <a href=""""),_display_(/*105.39*/routes/*105.45*/.Application.home()),format.raw/*105.64*/("""" class="btn waves-effect waves-light red darken-2">
                                Cancel
                            </a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    """)))}),format.raw/*113.6*/("""
""")))}),format.raw/*114.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:31 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/challengeSearch.scala.html
                  HASH: ef317afe6e677725e7d8f9456ab449f3d75e0de7
                  MATRIX: 814->1|837->18|860->35|889->58|1293->88|1308->95|1388->99|1419->104|1516->174|1544->175|1584->188|1743->319|1772->320|1817->337|2511->1003|2540->1004|2569->1005|2602->1010|2631->1011|2676->1028|3047->1371|3076->1372|3112->1381|3141->1382|3178->1392|3232->1418|3261->1419|3302->1432|3802->1903|3832->1904|3877->1921|4003->2019|4032->2020|4073->2033|4121->2054|4150->2055|4182->2060|4232->2071|4261->2074|4303->2107|4343->2109|4376->2116|4391->2122|4495->2216|4536->2218|4573->2228|7460->5087|7476->5093|7517->5112|7793->5357|7826->5359
                  LINES: 31->1|32->2|33->3|34->4|43->6|43->6|45->6|46->7|47->8|47->8|48->9|50->11|50->11|51->12|60->21|60->21|60->21|60->21|60->21|61->22|66->27|66->27|67->28|67->28|69->30|69->30|69->30|70->31|76->37|76->37|77->38|79->40|79->40|80->41|81->42|81->42|82->43|84->44|86->46|86->46|86->46|88->48|88->48|88->48|88->48|90->50|145->105|145->105|145->105|153->113|154->114
                  -- GENERATED --
              */
          