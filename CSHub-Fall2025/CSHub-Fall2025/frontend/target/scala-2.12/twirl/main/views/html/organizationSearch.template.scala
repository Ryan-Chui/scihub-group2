
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

object organizationSearch extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[play.data.Form[Organization],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(organizationForm: play.data.Form[Organization]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._

def /*4.2*/scripts/*4.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*4.13*/("""

    """),format.raw/*6.5*/("""<script type="text/javascript">
            $(document).ready(function()"""),format.raw/*7.41*/("""{"""),format.raw/*7.42*/("""

                """),format.raw/*9.17*/("""$( "#preview" ).click(function() """),format.raw/*9.50*/("""{"""),format.raw/*9.51*/("""
                    """),format.raw/*10.21*/("""var target = $("#show")[0];
                    console.log(target);
                    if(target.style.display=="none")"""),format.raw/*12.53*/("""{"""),format.raw/*12.54*/("""
                        """),format.raw/*13.25*/("""target.style.display="block";
                        $( "#preview" ).text("Hide");
                        var organizationName = $("#organizationName").val();
                        // var affiliation = $("#affiliation").val();
                        var email = $("#email").val();
                        var mailingAdd = $("#mailingAdd").val();
                        var phoneNum = $("$phoneNum").val();
                        // var researchFields = $("#researchFields").val();

                        if(organizationName != "" && organizationName != null) """),format.raw/*22.80*/("""{"""),format.raw/*22.81*/("""
                            """),format.raw/*23.29*/("""$("#content").append(" Organization Name = " + organizationName);
                        """),format.raw/*24.25*/("""}"""),format.raw/*24.26*/("""
                        """),format.raw/*25.25*/("""// if(affiliation != "" && affiliation != null) """),format.raw/*25.73*/("""{"""),format.raw/*25.74*/("""
                        """),format.raw/*26.25*/("""//     $("#content").append(" Affiliation = " + affiliation);
                        // """),format.raw/*27.28*/("""}"""),format.raw/*27.29*/("""
                        """),format.raw/*28.25*/("""if(email != "" && email != null) """),format.raw/*28.58*/("""{"""),format.raw/*28.59*/("""
                            """),format.raw/*29.29*/("""$("#content").append(" Email = " + email);
                        """),format.raw/*30.25*/("""}"""),format.raw/*30.26*/("""
                        """),format.raw/*31.25*/("""if(mailingAdd != "" && mailingAdd != null) """),format.raw/*31.68*/("""{"""),format.raw/*31.69*/("""
                            """),format.raw/*32.29*/("""$("#mailingAdd").append(" Mailing Address = " + mailingAdd);
                        """),format.raw/*33.25*/("""}"""),format.raw/*33.26*/("""
                        """),format.raw/*34.25*/("""if(phoneNum != "" && phoneNum != null) """),format.raw/*34.64*/("""{"""),format.raw/*34.65*/("""
                            """),format.raw/*35.29*/("""$("#phoneNum").append(" Phone Number = " + phoneNum);
                        """),format.raw/*36.25*/("""}"""),format.raw/*36.26*/("""
                        """),format.raw/*37.25*/("""// if(researchFields != "" && researchFields != null)"""),format.raw/*37.78*/("""{"""),format.raw/*37.79*/("""
                        """),format.raw/*38.25*/("""//     $("#content").append(" Research Area = " + researchFields);
                        // """),format.raw/*39.28*/("""}"""),format.raw/*39.29*/("""

                    """),format.raw/*41.21*/("""}"""),format.raw/*41.22*/("""else """),format.raw/*41.27*/("""{"""),format.raw/*41.28*/("""
                        """),format.raw/*42.25*/("""$("#content").val('');

                        target.style.display="none";
                        $("#preview" ).text("Preview");
                    """),format.raw/*46.21*/("""}"""),format.raw/*46.22*/("""
                """),format.raw/*47.17*/("""}"""),format.raw/*47.18*/(""");
            """),format.raw/*48.13*/("""}"""),format.raw/*48.14*/(""");

    </script>
""")))};
Seq[Any](format.raw/*1.50*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*51.2*/("""


"""),_display_(/*54.2*/main("Search Organization", scripts)/*54.38*/{_display_(Seq[Any](format.raw/*54.39*/("""
    """),_display_(/*55.6*/helper/*55.12*/.form(routes.OrganizationController.searchPOST(1, "id"))/*55.68*/ {_display_(Seq[Any](format.raw/*55.70*/("""
        """),format.raw/*56.9*/("""<div class="container">
            <div class="row">
                <div class="col s12 m10 offset-m1" id="search-form">
                    <div class="card-panel center">
                        <form class="form-signin">
                            <h4 class="center">Search Organization</h4>
                            <div class="row">
                                <div class="input-field col s12">
                                    <input
                                    type="text" name="name" id="organizationName" class="validate"
                                    >
                                    <label for="organizationName">Organization Name</label>
                                </div>
                            </div>
                            <div class="center">
                                """),format.raw/*71.139*/("""
                                """),format.raw/*72.33*/("""<button class="btn waves-effect waves-light blue darken-2" type="submit" value="Search"> Submit </button>
                                <a href=""""),_display_(/*73.43*/routes/*73.49*/.Application.home()),format.raw/*73.68*/("""" class="btn waves-effect waves-light red darken-2">
                                    Cancel</a>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    """)))}),format.raw/*81.6*/("""
""")))}),format.raw/*82.2*/("""
"""))
      }
    }
  }

  def render(organizationForm:play.data.Form[Organization]): play.twirl.api.HtmlFormat.Appendable = apply(organizationForm)

  def f:((play.data.Form[Organization]) => play.twirl.api.HtmlFormat.Appendable) = (organizationForm) => apply(organizationForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:33 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/organizationSearch.scala.html
                  HASH: 51c54f82e1589dfa6af83083ccdb478155a15744
                  MATRIX: 1146->1|1267->51|1295->69|1309->76|1389->80|1421->86|1520->158|1548->159|1593->177|1653->210|1681->211|1730->232|1879->353|1908->354|1961->379|2557->947|2586->948|2643->977|2761->1067|2790->1068|2843->1093|2919->1141|2948->1142|3001->1167|3118->1256|3147->1257|3200->1282|3261->1315|3290->1316|3347->1345|3442->1412|3471->1413|3524->1438|3595->1481|3624->1482|3681->1511|3794->1596|3823->1597|3876->1622|3943->1661|3972->1662|4029->1691|4135->1769|4164->1770|4217->1795|4298->1848|4327->1849|4380->1874|4502->1968|4531->1969|4581->1991|4610->1992|4643->1997|4672->1998|4725->2023|4906->2176|4935->2177|4980->2194|5009->2195|5052->2210|5081->2211|5139->49|5166->67|5194->2230|5224->2234|5269->2270|5308->2271|5340->2277|5355->2283|5420->2339|5460->2341|5496->2350|6362->3293|6423->3326|6598->3474|6613->3480|6653->3499|6939->3755|6971->3757
                  LINES: 35->1|38->2|40->4|40->4|42->4|44->6|45->7|45->7|47->9|47->9|47->9|48->10|50->12|50->12|51->13|60->22|60->22|61->23|62->24|62->24|63->25|63->25|63->25|64->26|65->27|65->27|66->28|66->28|66->28|67->29|68->30|68->30|69->31|69->31|69->31|70->32|71->33|71->33|72->34|72->34|72->34|73->35|74->36|74->36|75->37|75->37|75->37|76->38|77->39|77->39|79->41|79->41|79->41|79->41|80->42|84->46|84->46|85->47|85->47|86->48|86->48|90->1|91->3|92->51|95->54|95->54|95->54|96->55|96->55|96->55|96->55|97->56|112->71|113->72|114->73|114->73|114->73|122->81|123->82
                  -- GENERATED --
              */
          