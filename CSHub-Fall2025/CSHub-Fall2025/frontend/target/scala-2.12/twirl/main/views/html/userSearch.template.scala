
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

object userSearch extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[play.data.Form[User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: play.data.Form[User]):play.twirl.api.HtmlFormat.Appendable = {
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
                        // var affiliation = $("#affiliation").val();
                        var email = $("#email").val();
                        var mailingAdd = $("#mailingAdd").val();
                        var phoneNum = $("$phoneNum").val();
                        // var researchFields = $("#researchFields").val();

                        if(userName != "" && userName != null) """),format.raw/*22.64*/("""{"""),format.raw/*22.65*/("""
                            """),format.raw/*23.29*/("""$("#content").append(" User Name = " + userName);
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
Seq[Any](format.raw/*1.34*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*51.2*/("""


"""),_display_(/*54.2*/main("Search User", scripts)/*54.30*/{_display_(Seq[Any](format.raw/*54.31*/("""
    """),_display_(/*55.6*/helper/*55.12*/.form(routes.UserController.searchPOST(1, "id"))/*55.60*/ {_display_(Seq[Any](format.raw/*55.62*/("""
        """),format.raw/*56.9*/("""<div class="container">
            <div class="row">
                <div class="col s12 m10 offset-m1" id="search-form">
                    <div class="card-panel center">
                        <form class="form-signin">
                            <h4 class="center">Search User</h4>
                            <div class="row">
                                <div class="input-field col s12">
                                    <input
                                    type="text" name="name" id="userName" class="validate"
                                    >
                                    <label for="userName">User Name</label>
                                </div>
                            </div>

"""),format.raw/*71.50*/("""
"""),format.raw/*72.70*/("""
"""),format.raw/*73.47*/("""
"""),format.raw/*74.105*/("""
"""),format.raw/*75.81*/("""
"""),format.raw/*76.85*/("""
"""),format.raw/*77.43*/("""
"""),format.raw/*78.39*/("""
                            """),format.raw/*79.29*/("""<div class="row">
                                <div class="input-field col s12">
                                    <input
                                    type="text" name="Email" id="Email" class="validate"
                                    value='"""),_display_(/*83.45*/userForm("Email")/*83.62*/.value),format.raw/*83.68*/("""'>
                                    <label for="Email">Email</label>
                                </div>
                            </div>

                            <div class="row">
                                <div class="input-field col s12">
                                    <input
                                    type="text" name="MailingAdd" id="Mailing Address" class="validate"
                                    value= '"""),_display_(/*92.46*/userForm("MailingAdd")/*92.68*/.value),format.raw/*92.74*/("""'>
                                    <label for="Mailing Address">Mailing Address</label>
                                </div>
                            </div>

                            <div class="row">
                                <div class="input-field col s12">
                                    <input
                                    type="text" name="PhoneNum" id="phoneNum" class="validate"
                                    value='"""),_display_(/*101.45*/userForm("PhoneNum")/*101.65*/.value),format.raw/*101.71*/("""'>
                                    <label for="phoneNum">Phone Number</label>
                                </div>
                            </div>

"""),format.raw/*106.50*/("""
"""),format.raw/*107.70*/("""
"""),format.raw/*108.47*/("""
"""),format.raw/*109.109*/("""
"""),format.raw/*110.82*/("""
"""),format.raw/*111.90*/("""
"""),format.raw/*112.43*/("""
"""),format.raw/*113.39*/("""
                            """),format.raw/*114.29*/("""<div class="row" id="show" style="display: none;">
                                <div class="input-field col s12">
                                    <textarea  id="content"></textarea>
                                </div>
                            </div>
                            <div class="center">
                                """),format.raw/*120.139*/("""
                                """),format.raw/*121.33*/("""<button class="btn waves-effect waves-light blue darken-2" type="submit" value="Search"> Submit </button>
                                <a href=""""),_display_(/*122.43*/routes/*122.49*/.Application.home()),format.raw/*122.68*/("""" class="btn waves-effect waves-light red darken-2">
                                    Cancel</a>
                            </div>
                        </form>
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

  def render(userForm:play.data.Form[User]): play.twirl.api.HtmlFormat.Appendable = apply(userForm)

  def f:((play.data.Form[User]) => play.twirl.api.HtmlFormat.Appendable) = (userForm) => apply(userForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:40 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/userSearch.scala.html
                  HASH: 2508b0e85b5caa1b00484e7756b2ae8bb5401e78
                  MATRIX: 1130->1|1235->35|1263->53|1277->60|1357->64|1389->70|1488->142|1516->143|1561->161|1621->194|1649->195|1698->216|1847->337|1876->338|1929->363|2493->899|2522->900|2579->929|2681->1003|2710->1004|2763->1029|2839->1077|2868->1078|2921->1103|3038->1192|3067->1193|3120->1218|3181->1251|3210->1252|3267->1281|3362->1348|3391->1349|3444->1374|3515->1417|3544->1418|3601->1447|3714->1532|3743->1533|3796->1558|3863->1597|3892->1598|3949->1627|4055->1705|4084->1706|4137->1731|4218->1784|4247->1785|4300->1810|4422->1904|4451->1905|4501->1927|4530->1928|4563->1933|4592->1934|4645->1959|4826->2112|4855->2113|4900->2130|4929->2131|4972->2146|5001->2147|5059->33|5086->51|5114->2166|5144->2170|5181->2198|5220->2199|5252->2205|5267->2211|5324->2259|5364->2261|5400->2270|6153->3044|6182->3114|6211->3161|6241->3266|6270->3347|6299->3432|6328->3475|6357->3514|6414->3543|6701->3803|6727->3820|6754->3826|7232->4277|7263->4299|7290->4305|7779->4766|7809->4786|7837->4792|8023->4998|8053->5068|8083->5115|8114->5224|8144->5306|8174->5396|8204->5439|8234->5478|8292->5507|8666->5957|8728->5990|8904->6138|8920->6144|8961->6163|9248->6419|9281->6421
                  LINES: 35->1|38->2|40->4|40->4|42->4|44->6|45->7|45->7|47->9|47->9|47->9|48->10|50->12|50->12|51->13|60->22|60->22|61->23|62->24|62->24|63->25|63->25|63->25|64->26|65->27|65->27|66->28|66->28|66->28|67->29|68->30|68->30|69->31|69->31|69->31|70->32|71->33|71->33|72->34|72->34|72->34|73->35|74->36|74->36|75->37|75->37|75->37|76->38|77->39|77->39|79->41|79->41|79->41|79->41|80->42|84->46|84->46|85->47|85->47|86->48|86->48|90->1|91->3|92->51|95->54|95->54|95->54|96->55|96->55|96->55|96->55|97->56|112->71|113->72|114->73|115->74|116->75|117->76|118->77|119->78|120->79|124->83|124->83|124->83|133->92|133->92|133->92|142->101|142->101|142->101|147->106|148->107|149->108|150->109|151->110|152->111|153->112|154->113|155->114|161->120|162->121|163->122|163->122|163->122|171->130|172->131
                  -- GENERATED --
              */
          