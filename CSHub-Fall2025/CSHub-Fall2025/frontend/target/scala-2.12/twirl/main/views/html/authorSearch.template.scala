
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

object authorSearch extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[play.data.Form[Author],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: play.data.Form[Author]):play.twirl.api.HtmlFormat.Appendable = {
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
                        var authorName = $("#userName").val();
                        var affiliation = $("#affiliation").val();
                        var email = $("#email").val();
                        var mailingAdd = $("#mailingAdd").val();
                        var phoneNum = $("$phoneNum").val();
                        var researchFields = $("#researchFields").val();

                        if(authorName != "" && authorName != null) """),format.raw/*22.68*/("""{"""),format.raw/*22.69*/("""
                            """),format.raw/*23.29*/("""$("#content").append(" Author Name = " + authorName);
                        """),format.raw/*24.25*/("""}"""),format.raw/*24.26*/("""
                        """),format.raw/*25.25*/("""if(affiliation != "" && affiliation != null) """),format.raw/*25.70*/("""{"""),format.raw/*25.71*/("""
                            """),format.raw/*26.29*/("""$("#content").append(" Affiliation = " + affiliation);
                        """),format.raw/*27.25*/("""}"""),format.raw/*27.26*/("""
                        """),format.raw/*28.25*/("""if(email != "" && email != null) """),format.raw/*28.58*/("""{"""),format.raw/*28.59*/("""
                            """),format.raw/*29.29*/("""$("#content").append(" Email = " + email);
                        """),format.raw/*30.25*/("""}"""),format.raw/*30.26*/("""
                        """),format.raw/*31.25*/("""if(mailingAdd != "" && mailingAdd != null) """),format.raw/*31.68*/("""{"""),format.raw/*31.69*/("""
                            """),format.raw/*32.29*/("""$("#mailingAdd").append(" Mailing Address = " + mailingAdd);
                        """),format.raw/*33.25*/("""}"""),format.raw/*33.26*/("""
                        """),format.raw/*34.25*/("""if(phoneNum != "" && phoneNum != null) """),format.raw/*34.64*/("""{"""),format.raw/*34.65*/("""
                            """),format.raw/*35.29*/("""$("#phoneNum").append(" Phone Number = " + phoneNum);
                        """),format.raw/*36.25*/("""}"""),format.raw/*36.26*/("""
                        """),format.raw/*37.25*/("""if(researchFields != "" && researchFields != null)"""),format.raw/*37.75*/("""{"""),format.raw/*37.76*/("""
                            """),format.raw/*38.29*/("""$("#content").append(" Research Area = " + researchFields);
                        """),format.raw/*39.25*/("""}"""),format.raw/*39.26*/("""

                    """),format.raw/*41.21*/("""}"""),format.raw/*41.22*/("""else """),format.raw/*41.27*/("""{"""),format.raw/*41.28*/("""
                        """),format.raw/*42.25*/("""$("#content").val('');

                        target.style.display="none";
                        $("#preview" ).text("Preview");
                    """),format.raw/*46.21*/("""}"""),format.raw/*46.22*/("""
                """),format.raw/*47.17*/("""}"""),format.raw/*47.18*/(""");
            """),format.raw/*48.13*/("""}"""),format.raw/*48.14*/(""");

    </script>
""")))};
Seq[Any](format.raw/*1.36*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*51.2*/("""

"""),_display_(/*53.2*/main("Search User", scripts)/*53.30*/{_display_(Seq[Any](format.raw/*53.31*/("""
    """),_display_(/*54.6*/helper/*54.12*/.form(routes.AuthorController.searchPOST(1, "id"))/*54.62*/ {_display_(Seq[Any](format.raw/*54.64*/("""
        """),format.raw/*55.9*/("""<div class="container">
            <div class="row">
                <div class="col s12 m10  offset-m1"id="search-form">
                    <div class="card-panel">

                            <h4 class="center">Search User</h4>
                            <div class="row">
                                <div class="input-field col s12">
                                    <input
                                    type="text" name="name" id="userName" class="validate"
                                    >
                                    <label for="userName">User Name</label>
                                </div>
                            </div>

"""),format.raw/*70.50*/("""
"""),format.raw/*71.70*/("""
"""),format.raw/*72.47*/("""
"""),format.raw/*73.105*/("""
"""),format.raw/*74.81*/("""
"""),format.raw/*75.85*/("""
"""),format.raw/*76.43*/("""
"""),format.raw/*77.39*/("""
                            """),format.raw/*78.29*/("""<div class="row">
                                <div class="input-field col s12">
                                    <input
                                    type="text" name="Email" id="Email" class="validate"
                                    value='"""),_display_(/*82.45*/userForm("Email")/*82.62*/.value),format.raw/*82.68*/("""'>
                                    <label for="Email">Email</label>
                                </div>
                            </div>

                            <div class="row">
                                <div class="input-field col s12">
                                    <input
                                    type="text" name="MailingAdd" id="Mailing Address" class="validate"
                                    value= '"""),_display_(/*91.46*/userForm("MailingAdd")/*91.68*/.value),format.raw/*91.74*/("""'>
                                    <label for="Mailing Address">Mailing Address</label>
                                </div>
                            </div>

                            <div class="row">
                                <div class="input-field col s12">
                                    <input
                                    type="text" name="PhoneNum" id="phoneNum" class="validate"
                                    value='"""),_display_(/*100.45*/userForm("PhoneNum")/*100.65*/.value),format.raw/*100.71*/("""'>
                                    <label for="phoneNum">Phone Number</label>
                                </div>
                            </div>

                            <div class="row">
                                <div class="input-field col s12">
                                    <input
                                    type="text" name="Research Area" id="Research Area" class="validate"
                                    value='"""),_display_(/*109.45*/userForm("Research Area")/*109.70*/.value),format.raw/*109.76*/("""'>
                                    <label for="Research Area">Research Areas</label>
                                </div>
                            </div>
                            <div class="row" id="show" style="display: none;">
                                <div class="input-field col s12">
                                    <textarea  id="content"></textarea>
                                </div>
                            </div>
                            <div class="center">
                                """),format.raw/*119.139*/("""
                                """),format.raw/*120.33*/("""<button class="btn waves-effect waves-light blue darken-2" type="submit" value="Search"> Submit </button>
                                <a href=""""),_display_(/*121.43*/routes/*121.49*/.Application.home()),format.raw/*121.68*/("""" class="btn waves-effect waves-light red darken-2">
                                    Cancel</a>
                            </div>


                    </div>
                </div>
            </div>
        </div>
    """)))}),format.raw/*130.6*/("""
""")))}),format.raw/*131.2*/("""
"""))
      }
    }
  }

  def render(userForm:play.data.Form[Author]): play.twirl.api.HtmlFormat.Appendable = apply(userForm)

  def f:((play.data.Form[Author]) => play.twirl.api.HtmlFormat.Appendable) = (userForm) => apply(userForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:29 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/authorSearch.scala.html
                  HASH: 49e8c904703a36e47998b9a8ed26981cbbca9902
                  MATRIX: 1134->1|1241->37|1269->55|1283->62|1363->66|1395->72|1494->144|1522->145|1567->163|1627->196|1655->197|1704->218|1853->339|1882->340|1935->365|2499->901|2528->902|2585->931|2691->1009|2720->1010|2773->1035|2846->1080|2875->1081|2932->1110|3039->1189|3068->1190|3121->1215|3182->1248|3211->1249|3268->1278|3363->1345|3392->1346|3445->1371|3516->1414|3545->1415|3602->1444|3715->1529|3744->1530|3797->1555|3864->1594|3893->1595|3950->1624|4056->1702|4085->1703|4138->1728|4216->1778|4245->1779|4302->1808|4414->1892|4443->1893|4493->1915|4522->1916|4555->1921|4584->1922|4637->1947|4818->2100|4847->2101|4892->2118|4921->2119|4964->2134|4993->2135|5051->35|5078->53|5106->2154|5135->2157|5172->2185|5211->2186|5243->2192|5258->2198|5317->2248|5357->2250|5393->2259|6089->2976|6118->3046|6147->3093|6177->3198|6206->3279|6235->3364|6264->3407|6293->3446|6350->3475|6637->3735|6663->3752|6690->3758|7168->4209|7199->4231|7226->4237|7715->4698|7745->4718|7773->4724|8262->5185|8297->5210|8325->5216|8890->5857|8952->5890|9128->6038|9144->6044|9185->6063|9442->6289|9475->6291
                  LINES: 35->1|38->2|40->4|40->4|42->4|44->6|45->7|45->7|47->9|47->9|47->9|48->10|50->12|50->12|51->13|60->22|60->22|61->23|62->24|62->24|63->25|63->25|63->25|64->26|65->27|65->27|66->28|66->28|66->28|67->29|68->30|68->30|69->31|69->31|69->31|70->32|71->33|71->33|72->34|72->34|72->34|73->35|74->36|74->36|75->37|75->37|75->37|76->38|77->39|77->39|79->41|79->41|79->41|79->41|80->42|84->46|84->46|85->47|85->47|86->48|86->48|90->1|91->3|92->51|94->53|94->53|94->53|95->54|95->54|95->54|95->54|96->55|111->70|112->71|113->72|114->73|115->74|116->75|117->76|118->77|119->78|123->82|123->82|123->82|132->91|132->91|132->91|141->100|141->100|141->100|150->109|150->109|150->109|160->119|161->120|162->121|162->121|162->121|171->130|172->131
                  -- GENERATED --
              */
          