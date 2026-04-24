
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

object userPasswordUpdate extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[play.data.Form[models.User],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: play.data.Form[models.User], email: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*2.2*/scripts/*2.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*2.13*/("""
    """),format.raw/*3.5*/("""<script type="text/javascript">
        var passwordIsValid = false;
            function checkpwd()"""),format.raw/*5.32*/("""{"""),format.raw/*5.33*/("""
                """),format.raw/*6.17*/("""var p1=document.getElementById("new_password").value;
                var p2=document.getElementById("confirm_password").value;
                if(p1!=p2)"""),format.raw/*8.27*/("""{"""),format.raw/*8.28*/("""
                    """),format.raw/*9.21*/("""document.getElementById("msg").innerHTML="Please check that your passwords match";
                    document.getElementById("submitBtn").disabled = true;

                """),format.raw/*12.17*/("""}"""),format.raw/*12.18*/("""else"""),format.raw/*12.22*/("""{"""),format.raw/*12.23*/("""
                    """),format.raw/*13.21*/("""document.getElementById("msg").innerHTML = "";
                    document.getElementById("submitBtn").disabled = false;
                    return true;
                """),format.raw/*16.17*/("""}"""),format.raw/*16.18*/("""
            """),format.raw/*17.13*/("""}"""),format.raw/*17.14*/("""
            """),format.raw/*18.13*/("""function checkTempwd() """),format.raw/*18.36*/("""{"""),format.raw/*18.37*/("""
                """),format.raw/*19.17*/("""document.getElementById("submitMsg").innerHTML = "";
                var obj =  """),format.raw/*20.28*/("""{"""),format.raw/*20.29*/("""
                    """),format.raw/*21.21*/(""""pwd" : $("#current_password").val(),
                    "email" : """"),_display_(/*22.33*/email),format.raw/*22.38*/(""""
                """),format.raw/*23.17*/("""}"""),format.raw/*23.18*/(""";
                $.ajax("""),format.raw/*24.24*/("""{"""),format.raw/*24.25*/("""
                    """),format.raw/*25.21*/("""url: "/user/checkCurPassword",
                    data: JSON.stringify(obj),
                    type: "POST",
                    headers: """),format.raw/*28.30*/("""{"""),format.raw/*28.31*/("""
                        """),format.raw/*29.25*/("""'Content-Type': 'application/json'
                    """),format.raw/*30.21*/("""}"""),format.raw/*30.22*/(""",
                    success: function(response) """),format.raw/*31.49*/("""{"""),format.raw/*31.50*/("""
                        """),format.raw/*32.25*/("""if ("error" === response) """),format.raw/*32.51*/("""{"""),format.raw/*32.52*/("""
                            """),format.raw/*33.29*/("""document.getElementById("msg1").innerHTML = "Temporary password is invalid.";
                            document.getElementById("submitBtn").disabled = true;
                            passwordIsValid = false;
                            return;
                        """),format.raw/*37.25*/("""}"""),format.raw/*37.26*/("""
                        """),format.raw/*38.25*/("""document.getElementById("submitBtn").disabled = false;
                        document.getElementById("msg1").innerHTML = "";
                        passwordIsValid = true;
                    """),format.raw/*41.21*/("""}"""),format.raw/*41.22*/("""
                """),format.raw/*42.17*/("""}"""),format.raw/*42.18*/(""")

            """),format.raw/*44.13*/("""}"""),format.raw/*44.14*/("""

            """),format.raw/*46.13*/("""function validateAgreement()"""),format.raw/*46.41*/("""{"""),format.raw/*46.42*/("""
                """),format.raw/*47.17*/("""if(!passwordIsValid)"""),format.raw/*47.37*/("""{"""),format.raw/*47.38*/("""
                    """),format.raw/*48.21*/("""document.getElementById("submitMsg").innerHTML = "Temporary password is invalid.";
                """),format.raw/*49.17*/("""}"""),format.raw/*49.18*/("""
                """),format.raw/*50.17*/("""return passwordIsValid;
            """),format.raw/*51.13*/("""}"""),format.raw/*51.14*/("""
    """),format.raw/*52.5*/("""</script>
""")))};
Seq[Any](format.raw/*1.56*/("""
"""),format.raw/*53.2*/("""
"""),_display_(/*54.2*/main("Update Password", scripts)/*54.34*/ {_display_(Seq[Any](format.raw/*54.36*/("""
        """),format.raw/*55.9*/("""<div class="container">
            <div class="row">
                <div class="col s12 m10 offset-m1">
                    <div class="card-panel">
                        <form class="form-signin" enctype="multipart/form-data" onsubmit="return validateAgreement();" id="registerationForm" method="post" action=""""),_display_(/*59.166*/routes/*59.172*/.UserController.updatePassword),format.raw/*59.202*/("""">
                            <h4 class="center">Please check your mailbox.</h4>
                            <h6 class="center">A temporary password has been sent to your provided email address.</h6>
                            <div class="row">
                                <div class="input-field col s12">
                                    <input type="password" onchange = "checkTempwd()" name="current_password" id="current_password" class="validate" required>
                                    <label for="current_password">Temporary Password</label>
                                    <div class="helper-text red-text" id="msg1"></div>
                                    <div class="helper-text red-text" id="msg1"></div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="input-field col s12">
                                    <input type="password" name="new_password" id="new_password" class="validate" required>
                                    <label for="new_password">New Password</label>
                                </div>
                            </div>
                            <div class="row">
                                <div class="input-field col s12">
                                    <input type="password" name="confirm_password" id="confirm_password" class="form-control" required="" oninput="checkpwd()">
                                    <label for="confirm_password">Confirm Password</label>
                                    <div class="helper-text red-text" id="msg"></div>
                                </div>
                            </div>
                            <input type="hidden" name="email"  value='"""),_display_(/*83.72*/email),format.raw/*83.77*/("""'>
                            <div class="actions row">
                                <div class="input-field col s12 center">
                                    <button class="btn waves-effect waves-light blue darken-2" type = "submit" id="submitBtn">Submit</button>
                                    <div class="helper-text red-text" id="submitMsg"></div>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
""")))}))
      }
    }
  }

  def render(userForm:play.data.Form[models.User],email:String): play.twirl.api.HtmlFormat.Appendable = apply(userForm,email)

  def f:((play.data.Form[models.User],String) => play.twirl.api.HtmlFormat.Appendable) = (userForm,email) => apply(userForm,email)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:40 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/userPasswordUpdate.scala.html
                  HASH: b7b919353392a8358efe9aa82ccad8a715cc9639
                  MATRIX: 1152->1|1284->57|1298->64|1378->68|1409->73|1536->173|1564->174|1608->191|1789->345|1817->346|1865->367|2067->541|2096->542|2128->546|2157->547|2206->568|2405->739|2434->740|2475->753|2504->754|2545->767|2596->790|2625->791|2670->808|2778->888|2807->889|2856->910|2953->980|2979->985|3025->1003|3054->1004|3107->1029|3136->1030|3185->1051|3354->1192|3383->1193|3436->1218|3519->1273|3548->1274|3626->1324|3655->1325|3708->1350|3762->1376|3791->1377|3848->1406|4149->1679|4178->1680|4231->1705|4454->1900|4483->1901|4528->1918|4557->1919|4600->1934|4629->1935|4671->1949|4727->1977|4756->1978|4801->1995|4849->2015|4878->2016|4927->2037|5054->2136|5083->2137|5128->2154|5192->2190|5221->2191|5253->2196|5303->55|5331->2207|5359->2209|5400->2241|5440->2243|5476->2252|5820->2568|5836->2574|5888->2604|7715->4404|7741->4409
                  LINES: 35->1|39->2|39->2|41->2|42->3|44->5|44->5|45->6|47->8|47->8|48->9|51->12|51->12|51->12|51->12|52->13|55->16|55->16|56->17|56->17|57->18|57->18|57->18|58->19|59->20|59->20|60->21|61->22|61->22|62->23|62->23|63->24|63->24|64->25|67->28|67->28|68->29|69->30|69->30|70->31|70->31|71->32|71->32|71->32|72->33|76->37|76->37|77->38|80->41|80->41|81->42|81->42|83->44|83->44|85->46|85->46|85->46|86->47|86->47|86->47|87->48|88->49|88->49|89->50|90->51|90->51|91->52|93->1|94->53|95->54|95->54|95->54|96->55|100->59|100->59|100->59|124->83|124->83
                  -- GENERATED --
              */
          