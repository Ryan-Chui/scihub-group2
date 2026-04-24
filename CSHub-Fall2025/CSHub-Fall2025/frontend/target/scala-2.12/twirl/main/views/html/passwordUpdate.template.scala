
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

object passwordUpdate extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[play.data.Form[models.User],String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: play.data.Form[models.User], userId: String, email: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._

def /*4.2*/scripts/*4.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*4.13*/("""
    """),format.raw/*5.5*/("""<script type="text/javascript" src='"""),_display_(/*5.42*/routes/*5.48*/.Assets.at("javascripts/database_field_length.js")),format.raw/*5.98*/("""'></script>
    <script type="text/javascript" src='"""),_display_(/*6.42*/routes/*6.48*/.Assets.at("javascripts/field_validation_helper.js")),format.raw/*6.100*/("""'></script>
    <script type="text/javascript">
            var isPasswordNotMatched = true;
            var isPasswordNotSecure = false;

            var passwordNotSecureError = "Password must contain at least one special character, one uppercase, and one lowercase letter, and at least 8 or more characters <br/>";
            var passwordsDoNotMatchError = "Your password and confirmation password do not match. <br/>";


            function checkFormValid() """),format.raw/*15.39*/("""{"""),format.raw/*15.40*/("""
                """),format.raw/*16.17*/("""if(isPasswordNotMatched)"""),format.raw/*16.41*/("""{"""),format.raw/*16.42*/("""
                    """),format.raw/*17.21*/("""document.getElementById("warningMessage").innerText = "Your password and confirmation password do not match.";
                    $("#warningModal").modal();
                    $("#warningModal").modal('open');
                    return false;
                """),format.raw/*21.17*/("""}"""),format.raw/*21.18*/("""

                """),format.raw/*23.17*/("""return true;
            """),format.raw/*24.13*/("""}"""),format.raw/*24.14*/("""

            """),format.raw/*26.13*/("""/**
             * This function checks the password entries are the same
             */
            function checkPwd() """),format.raw/*29.33*/("""{"""),format.raw/*29.34*/("""
                """),format.raw/*30.17*/("""var p1 = document.getElementById("password").value;
                var p2 = document.getElementById("repassword").value;
                if (p1 !== p2) """),format.raw/*32.32*/("""{"""),format.raw/*32.33*/("""
                    """),format.raw/*33.21*/("""isPasswordNotMatched = true;
                    document.getElementById("repasswordMsg").innerHTML = "Your password and confirmation password do not match."
                """),format.raw/*35.17*/("""}"""),format.raw/*35.18*/(""" """),format.raw/*35.19*/("""else """),format.raw/*35.24*/("""{"""),format.raw/*35.25*/("""
                    """),format.raw/*36.21*/("""isPasswordNotMatched = false;
                    document.getElementById("repasswordMsg").innerHTML = ""
                """),format.raw/*38.17*/("""}"""),format.raw/*38.18*/("""
            """),format.raw/*39.13*/("""}"""),format.raw/*39.14*/("""

            """),format.raw/*41.13*/("""function doesPasswordFailRules()"""),format.raw/*41.45*/("""{"""),format.raw/*41.46*/("""
                """),format.raw/*42.17*/("""return false;
            """),format.raw/*43.13*/("""}"""),format.raw/*43.14*/("""

    """),format.raw/*45.5*/("""</script>
""")))};
Seq[Any](format.raw/*1.72*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*46.2*/("""

"""),_display_(/*48.2*/main("Update password", scripts)/*48.34*/ {_display_(Seq[Any](format.raw/*48.36*/("""
    """),format.raw/*49.5*/("""<div class="container">
        <div class="row">
            <div class="col s12 l10 offset-l1">
                <div class="card-panel z-depth-0">
                    <h4 class="form-update-password-heading center">Update your new password</h4>
                    <form class="form-update-password" onsubmit="return checkFormValid();" enctype="multipart/form-data" method="post" action=""""),_display_(/*54.145*/routes/*54.151*/.UserController.updatePasswordForUser()),format.raw/*54.190*/("""">
                        <div class="row">
                            <div class="input-field col s12 m6">
                                <input type="password" name="password" id="password" class="validate" required  onchange="checkPwd()">
                                <label for="password">Password*</label>
                                <span id="passwordMsg" class="helper-text" data-error=""></span>
                            </div>
"""),format.raw/*61.35*/("""
"""),format.raw/*62.46*/("""
                            """),format.raw/*63.29*/("""<div class="input-field col s12 m6">
                                <input type="password" name="repassword"   id="repassword" class="validate" required onchange="checkPwd()">
                                <label for="repassword">Re-enter Password*</label>
                                <span id="repasswordMsg" class="helper-text" data-error="" style="color: red"></span>
                            </div>
                        </div>
                        <div class="row" hidden="true">
                            <input type="text" name="email" id="email" value=""""),_display_(/*70.80*/email),format.raw/*70.85*/("""" />
                            <input type="text" name="id" id="id" value=""""),_display_(/*71.74*/userId),format.raw/*71.80*/("""" />
                        </div>

                        <div id="warningModal" class="modal">
                            <div class="modal-content">
                                <h5 class="center" style="color: red">Warning!</h5>
                                <h6 class="center" style="font-weight: bold" id="warningMessage"></h6>
                            </div>
                        </div>
                        <div class="center actions row">
                            <div class="input-field col s12">
                                <button type="submit" class="btn waves-effect waves-light blue darken-2" id="save">
                                    Save</button>
                                <a href=""""),_display_(/*84.43*/routes/*84.49*/.Application.home()),format.raw/*84.68*/("""" class="btn waves-effect waves-light red darken-2">Cancel</a>
                                <div class="helper-text red-text" id="submitErrorMsg"></div>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
    <script >
            var requiredFieldList = ["password", "repassword"];
            var notRequiredFieldList = [];
            setPattern(requiredFieldList, notRequiredFieldList, 'user');
    </script>
""")))}))
      }
    }
  }

  def render(userForm:play.data.Form[models.User],userId:String,email:String): play.twirl.api.HtmlFormat.Appendable = apply(userForm,userId,email)

  def f:((play.data.Form[models.User],String,String) => play.twirl.api.HtmlFormat.Appendable) = (userForm,userId,email) => apply(userForm,userId,email)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:34 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/passwordUpdate.scala.html
                  HASH: 2df58316c05438f7895b124a8aa4204c20d27bf7
                  MATRIX: 1155->1|1298->73|1326->91|1340->98|1420->102|1451->107|1514->144|1528->150|1598->200|1677->253|1691->259|1764->311|2256->775|2285->776|2330->793|2382->817|2411->818|2460->839|2751->1102|2780->1103|2826->1121|2879->1146|2908->1147|2950->1161|3100->1283|3129->1284|3174->1301|3355->1454|3384->1455|3433->1476|3635->1650|3664->1651|3693->1652|3726->1657|3755->1658|3804->1679|3954->1801|3983->1802|4024->1815|4053->1816|4095->1830|4155->1862|4184->1863|4229->1880|4283->1906|4312->1907|4345->1913|4395->71|4422->89|4450->1924|4479->1927|4520->1959|4560->1961|4592->1966|5011->2357|5027->2363|5088->2402|5565->2885|5594->2931|5651->2960|6257->3539|6283->3544|6388->3622|6415->3628|7177->4363|7192->4369|7232->4388
                  LINES: 35->1|38->2|40->4|40->4|42->4|43->5|43->5|43->5|43->5|44->6|44->6|44->6|53->15|53->15|54->16|54->16|54->16|55->17|59->21|59->21|61->23|62->24|62->24|64->26|67->29|67->29|68->30|70->32|70->32|71->33|73->35|73->35|73->35|73->35|73->35|74->36|76->38|76->38|77->39|77->39|79->41|79->41|79->41|80->42|81->43|81->43|83->45|85->1|86->3|87->46|89->48|89->48|89->48|90->49|95->54|95->54|95->54|102->61|103->62|104->63|111->70|111->70|112->71|112->71|125->84|125->84|125->84
                  -- GENERATED --
              */
          