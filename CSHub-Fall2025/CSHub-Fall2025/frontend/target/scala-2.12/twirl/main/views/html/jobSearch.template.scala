
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
/*3.2*/import models.Technology

object jobSearch extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*5.2*/scripts/*5.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.13*/("""
    """),format.raw/*6.5*/("""<script type="text/javascript">

            function disableOtherFields() """),format.raw/*8.43*/("""{"""),format.raw/*8.44*/("""
                """),format.raw/*9.17*/("""var keywords = "" + document.getElementById("keywords").value;
                keywords = keywords.trim();
                if (keywords !== "") """),format.raw/*11.38*/("""{"""),format.raw/*11.39*/("""
                    """),format.raw/*12.21*/("""document.getElementById("keyword-msg").innerText = "Specifying keywords for search would disable other search criteria options.";
                    document.getElementById("title").disabled = true;
                    document.getElementById("title").value = "";
                    document.getElementById("description").disabled = true;
                    document.getElementById("description").value = "";

                    document.getElementById("location").disabled = true;
                    document.getElementById("location").value = "";
                    document.getElementById("goals").disabled = true;
                    document.getElementById("goals").value = ""

                """),format.raw/*23.17*/("""}"""),format.raw/*23.18*/(""" """),format.raw/*23.19*/("""else """),format.raw/*23.24*/("""{"""),format.raw/*23.25*/("""
                    """),format.raw/*24.21*/("""document.getElementById("keyword-msg").innerText = "";
                    document.getElementById("title").disabled = false;
                    document.getElementById("description").disabled = false;
                    document.getElementById("location").disabled = false;
                    document.getElementById("goals").disabled = false;


                """),format.raw/*31.17*/("""}"""),format.raw/*31.18*/("""
            """),format.raw/*32.13*/("""}"""),format.raw/*32.14*/("""

            """),format.raw/*34.13*/("""function validateSearch() """),format.raw/*34.39*/("""{"""),format.raw/*34.40*/("""
                """),format.raw/*35.17*/("""var keywords = document.getElementById("keywords")?.value.trim() || "";
                var title = document.getElementById("title")?.value.trim() || "";
                var description = document.getElementById("description")?.value.trim() || "";
                var location = document.getElementById("location")?.value.trim() || "";
                var goals = document.getElementById("goals")?.value.trim() || "";

                if (keywords === "" && title === "" && description === "" && location === "" && goals === "") """),format.raw/*41.111*/("""{"""),format.raw/*41.112*/("""
                    """),format.raw/*42.21*/("""alert("Please fill in at least one search criterion!");
                    return false;
                """),format.raw/*44.17*/("""}"""),format.raw/*44.18*/("""
                """),format.raw/*45.17*/("""return true;
            """),format.raw/*46.13*/("""}"""),format.raw/*46.14*/("""

    """),format.raw/*48.5*/("""</script>
""")))};
Seq[Any](format.raw/*49.2*/("""

"""),_display_(/*51.2*/main("Search Job", scripts)/*51.29*/ {_display_(Seq[Any](format.raw/*51.31*/("""

    """),_display_(/*53.6*/helper/*53.12*/.form(routes.JobController.searchPOST(1, "id"), 'onsubmit -> "return validateSearch();")/*53.100*/ {_display_(Seq[Any](format.raw/*53.102*/("""

        """),format.raw/*55.9*/("""<div class="container">
            <div class="row">
                <div class="col s12 m10 offset-m1">
                    <div class="card-panel">
                        <form class="form-signin">
                            <h3 class="form-signin-heading" align="center">Search Job</h3>
                            <div class="row">
                                <div class="input-field col s12">
                                    <input type="text" name="keywords" id="keywords" onchange="disableOtherFields()">
                                    <label for="keywords">
                                        Keywords (Searching based on keywords, returns the jobs having the specified keywords in any part of the job details).</label>
                                    <div class="form-group" id="keyword-msg" style="color: blue;"></div>
                                </div>
                            </div>

                            <div class="row">
                                <div class="input-field col s12">
                                    <input type="text" name="title" id="title">
                                    <label for="name">Job Title</label>
                                </div>
                            </div>

                            <div class="row">
                                <div class="input-field col s12">
                                    <input type="text" name="description" id="description">
                                    <label for="description">Description</label>
                                </div>
                            </div>


"""),format.raw/*85.50*/("""
"""),format.raw/*86.70*/("""
"""),format.raw/*87.90*/("""
"""),format.raw/*88.79*/("""
"""),format.raw/*89.43*/("""
"""),format.raw/*90.39*/("""

                            """),format.raw/*92.29*/("""<div class="row">
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
                                <a href=""""),_display_(/*112.43*/routes/*112.49*/.Application.home()),format.raw/*112.68*/("""" class="btn waves-effect waves-light red darken-2">
                                    Cancel</a>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    """)))}),format.raw/*120.6*/("""
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
                  DATE: Fri Apr 24 12:50:33 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/jobSearch.scala.html
                  HASH: 3e2bf46791661f19f7d487708c3c1bf29ca55b3f
                  MATRIX: 814->1|837->18|860->35|1259->62|1273->69|1353->73|1384->78|1486->153|1514->154|1558->171|1730->315|1759->316|1808->337|2541->1042|2570->1043|2599->1044|2632->1049|2661->1050|2710->1071|3104->1437|3133->1438|3174->1451|3203->1452|3245->1466|3299->1492|3328->1493|3373->1510|3931->2039|3961->2040|4010->2061|4144->2167|4173->2168|4218->2185|4271->2210|4300->2211|4333->2217|4383->2228|4412->2231|4448->2258|4488->2260|4521->2267|4536->2273|4634->2361|4675->2363|4712->2373|6369->4051|6398->4121|6427->4211|6456->4290|6485->4333|6514->4372|6572->4402|7602->5404|7618->5410|7659->5429|7946->5685
                  LINES: 31->1|32->2|33->3|42->5|42->5|44->5|45->6|47->8|47->8|48->9|50->11|50->11|51->12|62->23|62->23|62->23|62->23|62->23|63->24|70->31|70->31|71->32|71->32|73->34|73->34|73->34|74->35|80->41|80->41|81->42|83->44|83->44|84->45|85->46|85->46|87->48|89->49|91->51|91->51|91->51|93->53|93->53|93->53|93->53|95->55|125->85|126->86|127->87|128->88|129->89|130->90|132->92|152->112|152->112|152->112|160->120
                  -- GENERATED --
              */
          