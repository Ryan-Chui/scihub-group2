
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

object authorRegister extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[play.data.Form[models.Author],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: play.data.Form[models.Author], regPattern: String ):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._

def /*4.2*/scripts/*4.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*4.13*/("""
    """),format.raw/*5.5*/("""<script type="text/javascript" src='"""),_display_(/*5.42*/routes/*5.48*/.Assets.at("javascripts/database_field_length.js")),format.raw/*5.98*/("""'></script>
    <script type="text/javascript" src='"""),_display_(/*6.42*/routes/*6.48*/.Assets.at("javascripts/field_validation_helper.js")),format.raw/*6.100*/("""'></script>
    <script type="text/javascript">
            var isEmailEmpty = true;
            var isEmailInvalid = true;
            var isEmailAlreadyRegistered = true;
            var isSQ1hasNoContent = false;
            var isSQ2hasNoContent = false;
            var isFirstNameEmpty = true;
            var isLastNameEmpty = true;
            var passwordNotSecureError = "Password must contain at least one special character, one uppercase, and lowercase letter, and at least 8 or more characters <br/>";
            var passwordsDoNotMatchError = "Your password and confirmation password do not match. <br/>";
            var emailAlreadyRegisteredError = "Your email address is already registered.<br/>";
            var emailEmptyError = "Field 'Email' must be filled in.<br/>";
            var firstNameEmptyError = "Field 'First Name' must be filled in.<br/>";
            var lastNameEmptyError = "Field 'Last Name' must be filled in.<br/>";
            var emailInvalidError = "Your email address must be valid.<br/>";

            function checkFormValid() """),format.raw/*23.39*/("""{"""),format.raw/*23.40*/("""



                """),format.raw/*27.17*/("""if (document.getElementById("agreement").checked == false) """),format.raw/*27.76*/("""{"""),format.raw/*27.77*/("""
                    """),format.raw/*28.21*/("""document.getElementById("warningMessage").innerText = "You must accept the terms and conditions before you can sign up!";
                    $("#warningModal").modal();
                    $("#warningModal").modal('open');
                    return false;
                """),format.raw/*32.17*/("""}"""),format.raw/*32.18*/("""
                """),format.raw/*33.17*/("""return true;
            """),format.raw/*34.13*/("""}"""),format.raw/*34.14*/("""

    """),format.raw/*36.5*/("""</script>
""")))};
Seq[Any](format.raw/*1.64*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*37.2*/("""

"""),_display_(/*39.2*/main("Author Register", scripts)/*39.34*/ {_display_(Seq[Any](format.raw/*39.36*/("""
        """),format.raw/*40.9*/("""<div class="container">
            <div class="row">
                <div class="col s12 l10 offset-l1">
                    <div class="card-panel z-depth-0">
                        <h4 class="form-signin-heading center">Sign up</h4>
                        <form class="form-signin" onsubmit="return checkFormValid();" enctype="multipart/form-data" method="get" action=""""),_display_(/*45.139*/routes/*45.145*/.AuthorController.authorRegisterPOST()),format.raw/*45.183*/("""">
                            <div class="row">
                                <div class="input-field col s12 m4">
                                    <input type="text" name="firstName" id="firstName" class="validate" required>
                                    <label for="firstName">First Name*</label>
                                    <span id="firstNameMsg" class="helper-text" data-error=""></span>
                                </div>
                                <div class="input-field col s12 m4">
                                    <input type="text" name="middleInitial" id="middleInitial" class="validate">
                                    <label for="middleInitial">Middle Name</label>
                                    <span id="middleInitialMsg" class="helper-text" data-error=""></span>
                                </div>
                                <div class="input-field col s12 m4">
                                    <input type="text" name="lastName" id="lastName" class="validate" required>
                                    <label for="lastName">Last Name*</label>
                                    <span id="lastNameMsg" class="helper-text" data-error=""></span>
                                </div>
                            </div>
                            <div class="row">
                                <div class="input-field col s12">
                                    <input type="email" name="email" id="email" class="validate" required="" onchange="checkValidEmail()">
                                    <label for="email">Email Address*</label>
                                    <span id="emailMsg" class="helper-text" data-error="" style="color: red"></span>
                                </div>
                            </div>

                            <div class="row">
                                <div class="input-field col s12">
                                    <input type="text" name="researchFields" id="researchFields" class="validate">
                                    <label for="researchFields">Research Fields</label>
                                    <span id="researchFieldsMsg" class="helper-text" data-error=""></span>
                                </div>
                            </div>


                            <div class="row">
                                <div class="input-field col s12">
                                    <input type="text" name="affiliation" id="affiliation" class="validate">
                                    <label for="affiliation">Affiliation</label>
                                    <span id="affiliationMsg" class="helper-text" data-error=""></span>
                                </div>
                            </div>
                            <div class="row">
                                <div class="input-field col s12">
                                    <input type="text" name="title" id="title" class="validate">
                                    <label for="title">Title</label>
                                    <span id="titleMsg" class="helper-text" data-error=""></span>
                                </div>
                            </div>
                            <div class="row">
                                <div class="input-field col s12">
                                    <input type="text" name="mailingAddress" id="mailingAddress" class="validate">
                                    <label for="mailingAddress">Mailing Address</label>
                                    <span id="mailingAddressMsg" class="helper-text" data-error=""></span>
                                </div>
                            </div>
                            <div class="row">
                                <div class="input-field col s12">
                                    <input type="text" name="phoneNumber" id="phoneNumber" class="validate">
                                    <label for="phoneNumber">Phone Number</label>
                                    <span id="phoneNumberMsg" class="helper-text" data-error=""></span>
                                </div>
                            </div>

                            <div class="row">
                                <div class="input-field col s12">
                                    <input type="text" name="highestDegree" id="highestDegree" class="validate">
                                    <label for="highestDegree">Highest Degree</label>
                                    <span id="highestDegreeMsg" class="helper-text" data-error=""></span>
                                </div>
                            </div>

                            <div class="row">
                                <label>
                                    <input id="agreement" type="checkbox" />
                                    <span>
                                        I acknowledge that I have read the <a href="https://www.nasa.gov/about/highlights/HP_Privacy.html" target="_blank">
                                        NASA Web Privacy Policy </a>
                                        and <a href="https://nex.nasa.gov/nex/terms/" target="_blank">NEX Policy</a>
                                        , and do hereby accept the Terms and Conditions contained in these documents.</span>
                                </label>
                            </div>
                            <div id="warningModal" class="modal">
                                <div class="modal-content">
                                    <h5 class="center" style="color: red">Warning!</h5>
                                    <h6 class="center" style="font-weight: bold" id="warningMessage"></h6>
                                </div>
                            </div>
                            <div class="center actions row">
                                <div class="input-field col s12">
                                    <button type="submit" class="btn waves-effect waves-light blue darken-2" id="create">
                                        Create</button>
                                    <a href=""""),_display_(/*137.47*/routes/*137.53*/.Application.home()),format.raw/*137.72*/("""" class="btn waves-effect waves-light red darken-2">Cancel</a>
                                    <div class="helper-text red-text" id="submitErrorMsg"></div>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    <script >
            var requiredFieldList = ["firstName", "lastName", "email", "password", "repassword"];
            var notRequiredFieldList = ["middleInitial", "researchFields", "affiliation", "mailingAddress", "highestDegree", "phoneNumber"];
            setPattern(requiredFieldList, notRequiredFieldList, 'user');
    </script>
""")))}))
      }
    }
  }

  def render(userForm:play.data.Form[models.Author],regPattern:String): play.twirl.api.HtmlFormat.Appendable = apply(userForm,regPattern)

  def f:((play.data.Form[models.Author],String) => play.twirl.api.HtmlFormat.Appendable) = (userForm,regPattern) => apply(userForm,regPattern)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:29 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/authorRegister.scala.html
                  HASH: 5cee71221e835c5ced904494f99ce8a9014ad6ac
                  MATRIX: 1150->1|1285->65|1313->83|1327->90|1407->94|1438->99|1501->136|1515->142|1585->192|1664->245|1678->251|1751->303|2854->1378|2883->1379|2931->1399|3018->1458|3047->1459|3096->1480|3398->1754|3427->1755|3472->1772|3525->1797|3554->1798|3587->1804|3637->63|3664->81|3692->1815|3721->1818|3762->1850|3802->1852|3838->1861|4241->2236|4257->2242|4317->2280|10554->8489|10570->8495|10611->8514
                  LINES: 35->1|38->2|40->4|40->4|42->4|43->5|43->5|43->5|43->5|44->6|44->6|44->6|61->23|61->23|65->27|65->27|65->27|66->28|70->32|70->32|71->33|72->34|72->34|74->36|76->1|77->3|78->37|80->39|80->39|80->39|81->40|86->45|86->45|86->45|178->137|178->137|178->137
                  -- GENERATED --
              */
          