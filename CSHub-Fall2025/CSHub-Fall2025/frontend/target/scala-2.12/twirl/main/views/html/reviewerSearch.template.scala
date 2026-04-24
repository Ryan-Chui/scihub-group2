
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

object reviewerSearch extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[play.data.Form[Reviewer],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: play.data.Form[Reviewer]):play.twirl.api.HtmlFormat.Appendable = {
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
                        var userName = $("#userName").val();
                        var affiliation = $("#affiliation").val();
                        var email = $("#email").val();
                        var mailingAdd = $("#mailingAdd").val();
                        var phoneNum = $("$phoneNum").val();
                        var researchFields = $("#researchFields").val();
                        if(userName != "" && userName != null) """),format.raw/*21.64*/("""{"""),format.raw/*21.65*/("""
                            """),format.raw/*22.29*/("""$("#content").append(" User Name = " + userName);
                        """),format.raw/*23.25*/("""}"""),format.raw/*23.26*/("""
                        """),format.raw/*24.25*/("""if(affiliation != "" && affiliation != null) """),format.raw/*24.70*/("""{"""),format.raw/*24.71*/("""
                            """),format.raw/*25.29*/("""$("#content").append(" Affiliation = " + affiliation);
                        """),format.raw/*26.25*/("""}"""),format.raw/*26.26*/("""
                        """),format.raw/*27.25*/("""if(email != "" && email != null) """),format.raw/*27.58*/("""{"""),format.raw/*27.59*/("""
                            """),format.raw/*28.29*/("""$("#content").append(" Email = " + email);
                        """),format.raw/*29.25*/("""}"""),format.raw/*29.26*/("""
                        """),format.raw/*30.25*/("""if(mailingAdd != "" && mailingAdd != null) """),format.raw/*30.68*/("""{"""),format.raw/*30.69*/("""
                            """),format.raw/*31.29*/("""$("#mailingAdd").append(" Mailing Address = " + mailingAdd);
                        """),format.raw/*32.25*/("""}"""),format.raw/*32.26*/("""
                        """),format.raw/*33.25*/("""if(phoneNum != "" && phoneNum != null) """),format.raw/*33.64*/("""{"""),format.raw/*33.65*/("""
                            """),format.raw/*34.29*/("""$("#phoneNum").append(" Phone Number = " + phoneNum);
                        """),format.raw/*35.25*/("""}"""),format.raw/*35.26*/("""
                        """),format.raw/*36.25*/("""if(researchFields != "" && researchFields != null)"""),format.raw/*36.75*/("""{"""),format.raw/*36.76*/("""
                            """),format.raw/*37.29*/("""$("#content").append(" Research Area = " + researchFields);
                        """),format.raw/*38.25*/("""}"""),format.raw/*38.26*/("""

                    """),format.raw/*40.21*/("""}"""),format.raw/*40.22*/("""else """),format.raw/*40.27*/("""{"""),format.raw/*40.28*/("""
                        """),format.raw/*41.25*/("""$("#content").val('');

                        target.style.display="none";
                        $("#preview" ).text("Preview");
                    """),format.raw/*45.21*/("""}"""),format.raw/*45.22*/("""
                """),format.raw/*46.17*/("""}"""),format.raw/*46.18*/(""");
            """),format.raw/*47.13*/("""}"""),format.raw/*47.14*/(""");

    </script>
""")))};
Seq[Any](format.raw/*1.38*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*50.2*/("""

"""),_display_(/*52.2*/main("Search User", scripts)/*52.30*/{_display_(Seq[Any](format.raw/*52.31*/("""
    """),_display_(/*53.6*/helper/*53.12*/.form(routes.AuthorController.searchPOST(1, "id"))/*53.62*/ {_display_(Seq[Any](format.raw/*53.64*/("""
        """),format.raw/*54.9*/("""<div class="container">
            <div class="row">
                <div class="col s12 m10  offset-m1"id="search-form">
                    <div class="card-panel">
                        <form class="form-signin">
                            <h4 class="center">Search User</h4>
                            <div class="row">
                                <div class="input-field col s12">
                                    <input
                                    type="text" name="name" id="userName" class="validate"
                                    >
                                    <label for="userName">Reviewer Name</label>
                                </div>
                            </div>

                            <div class="row">
                                <div class="input-field col s12">
                                    <input
                                    type="text" name="Affiliation" id="Affiliation" class="validate"
                                    value ='"""),_display_(/*73.46*/userForm("Affiliation")/*73.69*/.value),format.raw/*73.75*/("""'>
                                    <label for="Affiliation">Affiliation</label>
                                </div>
                            </div>
                            <div class="row">
                                <div class="input-field col s12">
                                    <input
                                    type="text" name="Email" id="Email" class="validate"
                                    value='"""),_display_(/*81.45*/userForm("Email")/*81.62*/.value),format.raw/*81.68*/("""'>
                                    <label for="Email">Email</label>
                                </div>
                            </div>

                            <div class="row">
                                <div class="input-field col s12">
                                    <input
                                    type="text" name="MailingAdd" id="Mailing Address" class="validate"
                                    value= '"""),_display_(/*90.46*/userForm("MailingAdd")/*90.68*/.value),format.raw/*90.74*/("""'>
                                    <label for="Mailing Address">Mailing Address</label>
                                </div>
                            </div>

                            <div class="row">
                                <div class="input-field col s12">
                                    <input
                                    type="text" name="PhoneNum" id="phoneNum" class="validate"
                                    value='"""),_display_(/*99.45*/userForm("PhoneNum")/*99.65*/.value),format.raw/*99.71*/("""'>
                                    <label for="phoneNum">Phone Number</label>
                                </div>
                            </div>

                            <div class="row">
                                <div class="input-field col s12">
                                    <input
                                    type="text" name="Research Area" id="Research Area" class="validate"
                                    value='"""),_display_(/*108.45*/userForm("Research Area")/*108.70*/.value),format.raw/*108.76*/("""'>
                                    <label for="Research Area">Research Areas</label>
                                </div>
                            </div>
                            <div class="row" id="show" style="display: none;">
                                <div class="input-field col s12">
                                    <textarea  id="content"></textarea>
                                </div>
                            </div>
                            <div class="center">
                                """),format.raw/*118.139*/("""
                                """),format.raw/*119.33*/("""<button class="btn waves-effect waves-light blue darken-2" type="submit" value="Search"> Submit </button>
                                <a href=""""),_display_(/*120.43*/routes/*120.49*/.Application.home()),format.raw/*120.68*/("""" class="btn waves-effect waves-light red darken-2">
                                    Cancel</a>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    """)))}),format.raw/*128.6*/("""
""")))}),format.raw/*129.2*/("""
"""))
      }
    }
  }

  def render(userForm:play.data.Form[Reviewer]): play.twirl.api.HtmlFormat.Appendable = apply(userForm)

  def f:((play.data.Form[Reviewer]) => play.twirl.api.HtmlFormat.Appendable) = (userForm) => apply(userForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:36 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/reviewerSearch.scala.html
                  HASH: b162b0c8892fc619822a3f6e32ee00d8ba45f7ce
                  MATRIX: 1138->1|1247->39|1275->57|1289->64|1369->68|1401->74|1500->146|1528->147|1573->165|1633->198|1661->199|1710->220|1859->341|1888->342|1941->367|2498->896|2527->897|2584->926|2686->1000|2715->1001|2768->1026|2841->1071|2870->1072|2927->1101|3034->1180|3063->1181|3116->1206|3177->1239|3206->1240|3263->1269|3358->1336|3387->1337|3440->1362|3511->1405|3540->1406|3597->1435|3710->1520|3739->1521|3792->1546|3859->1585|3888->1586|3945->1615|4051->1693|4080->1694|4133->1719|4211->1769|4240->1770|4297->1799|4409->1883|4438->1884|4488->1906|4517->1907|4550->1912|4579->1913|4632->1938|4813->2091|4842->2092|4887->2109|4916->2110|4959->2125|4988->2126|5046->37|5073->55|5101->2145|5130->2148|5167->2176|5206->2177|5238->2183|5253->2189|5312->2239|5352->2241|5388->2250|6438->3273|6470->3296|6497->3302|6970->3748|6996->3765|7023->3771|7501->4222|7532->4244|7559->4250|8047->4711|8076->4731|8103->4737|8592->5198|8627->5223|8655->5229|9220->5870|9282->5903|9458->6051|9474->6057|9515->6076|9802->6332|9835->6334
                  LINES: 35->1|38->2|40->4|40->4|42->4|44->6|45->7|45->7|47->9|47->9|47->9|48->10|50->12|50->12|51->13|59->21|59->21|60->22|61->23|61->23|62->24|62->24|62->24|63->25|64->26|64->26|65->27|65->27|65->27|66->28|67->29|67->29|68->30|68->30|68->30|69->31|70->32|70->32|71->33|71->33|71->33|72->34|73->35|73->35|74->36|74->36|74->36|75->37|76->38|76->38|78->40|78->40|78->40|78->40|79->41|83->45|83->45|84->46|84->46|85->47|85->47|89->1|90->3|91->50|93->52|93->52|93->52|94->53|94->53|94->53|94->53|95->54|114->73|114->73|114->73|122->81|122->81|122->81|131->90|131->90|131->90|140->99|140->99|140->99|149->108|149->108|149->108|159->118|160->119|161->120|161->120|161->120|169->128|170->129
                  -- GENERATED --
              */
          