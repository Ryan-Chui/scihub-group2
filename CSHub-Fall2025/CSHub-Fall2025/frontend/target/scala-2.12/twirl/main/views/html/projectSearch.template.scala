
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

object projectSearch extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
                    document.getElementById("name").disabled = true;
                    document.getElementById("name").value = "";
                    document.getElementById("description").disabled = true;
                    document.getElementById("description").value = "";

                    document.getElementById("location").disabled = true;
                    document.getElementById("location").value = "";
                    document.getElementById("goals").disabled = true;
                    document.getElementById("goals").value = ""

                """),format.raw/*23.17*/("""}"""),format.raw/*23.18*/(""" """),format.raw/*23.19*/("""else """),format.raw/*23.24*/("""{"""),format.raw/*23.25*/("""
                    """),format.raw/*24.21*/("""document.getElementById("keyword-msg").innerText = "";
                    document.getElementById("name").disabled = false;
                    document.getElementById("description").disabled = false;
                    document.getElementById("location").disabled = false;
                    document.getElementById("goals").disabled = false;


                """),format.raw/*31.17*/("""}"""),format.raw/*31.18*/("""
            """),format.raw/*32.13*/("""}"""),format.raw/*32.14*/("""





    """),format.raw/*38.5*/("""</script>
""")))};
Seq[Any](format.raw/*39.2*/("""

"""),_display_(/*41.2*/main("Search Project", scripts)/*41.33*/ {_display_(Seq[Any](format.raw/*41.35*/("""

    """),_display_(/*43.6*/helper/*43.12*/.form(routes.ProjectController.searchPOST(1, "id"))/*43.63*/ {_display_(Seq[Any](format.raw/*43.65*/("""

        """),format.raw/*45.9*/("""<div class="container">
            <div class="row">
                <div class="col s12 m10 offset-m1">
                    <div class="card-panel">
                        <form class="form-signin">
                            <h3 class="form-signin-heading" align="center">Search Project</h3>
                            <div class="row">
                                <div class="input-field col s12">
                                    <input type="text" name="keywords" id="keywords" onchange="disableOtherFields()">
                                    <label for="keywords">
                                        Keywords (Searching based on keywords, returns the projects having the specified keywords in any part of the project details).</label>
                                    <div class="form-group" id="keyword-msg" style="color: blue;"></div>
                                </div>
                            </div>

                            <div class="row">
                                <div class="input-field col s12">
                                    <input type="text" name="name" id="name">
                                    <label for="name">Project Name</label>
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
                                    Search</button>
                                <a href=""""),_display_(/*102.43*/routes/*102.49*/.Application.home()),format.raw/*102.68*/("""" class="btn waves-effect waves-light red darken-2">
                                    Cancel</a>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    """)))}),format.raw/*110.6*/("""
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
                  DATE: Fri Apr 24 12:50:34 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/projectSearch.scala.html
                  HASH: 425cbfa16b494b2726402998afb7b93b635b501e
                  MATRIX: 814->1|837->18|860->35|1260->59|1274->66|1354->70|1385->75|1487->150|1515->151|1559->168|1731->312|1760->313|1809->334|2540->1037|2569->1038|2598->1039|2631->1044|2660->1045|2709->1066|3102->1431|3131->1432|3172->1445|3201->1446|3238->1456|3288->1467|3317->1470|3357->1501|3397->1503|3430->1510|3445->1516|3505->1567|3545->1569|3582->1579|6630->4599|6646->4605|6687->4624|6974->4880
                  LINES: 31->1|32->2|33->3|42->5|42->5|44->5|45->6|47->8|47->8|48->9|50->11|50->11|51->12|62->23|62->23|62->23|62->23|62->23|63->24|70->31|70->31|71->32|71->32|77->38|79->39|81->41|81->41|81->41|83->43|83->43|83->43|83->43|85->45|142->102|142->102|142->102|150->110
                  -- GENERATED --
              */
          