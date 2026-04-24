
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

object reviewerRegister extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[play.data.Form[models.Reviewer],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: play.data.Form[models.Reviewer], regPattern: String ):play.twirl.api.HtmlFormat.Appendable = {
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

                """),format.raw/*25.17*/("""if (document.getElementById("agreement").checked == false) """),format.raw/*25.76*/("""{"""),format.raw/*25.77*/("""
                    """),format.raw/*26.21*/("""document.getElementById("warningMessage").innerText = "You must accept the terms and conditions before you can sign up!";
                    $("#warningModal").modal();
                    $("#warningModal").modal('open');
                    return false;
                """),format.raw/*30.17*/("""}"""),format.raw/*30.18*/("""
                """),format.raw/*31.17*/("""return true;
            """),format.raw/*32.13*/("""}"""),format.raw/*32.14*/("""

    """),format.raw/*34.5*/("""</script>
""")))};
Seq[Any](format.raw/*1.66*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*35.2*/("""

"""),_display_(/*37.2*/main("Author Register", scripts)/*37.34*/ {_display_(Seq[Any](format.raw/*37.36*/("""
        """),format.raw/*38.9*/("""<div class="container">
            <div class="row">
                <div class="col s12 l10 offset-l1">
                    <div class="card-panel z-depth-0">
                        <h4 class="form-signin-heading center">Sign up</h4>
                        <form class="form-signin" onsubmit="return checkFormValid();" enctype="multipart/form-data" method="get" action=""""),_display_(/*43.139*/routes/*43.145*/.ReviewerController.reviewerRegisterPOST()),format.raw/*43.187*/("""">
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
                                    <a href=""""),_display_(/*135.47*/routes/*135.53*/.Application.home()),format.raw/*135.72*/("""" class="btn waves-effect waves-light red darken-2">Cancel</a>
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
            var notRequiredFieldList = ["middleInitial", "researchFields", "affiliation", "title", "mailingAddress", "highestDegree", "phoneNumber"];
            setPattern(requiredFieldList, notRequiredFieldList, 'user');
    </script>
""")))}))
      }
    }
  }

  def render(userForm:play.data.Form[models.Reviewer],regPattern:String): play.twirl.api.HtmlFormat.Appendable = apply(userForm,regPattern)

  def f:((play.data.Form[models.Reviewer],String) => play.twirl.api.HtmlFormat.Appendable) = (userForm,regPattern) => apply(userForm,regPattern)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:36 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/reviewerRegister.scala.html
                  HASH: 87f1012ff62b4e302390840128d081055e5f2238
                  MATRIX: 1154->1|1291->67|1319->85|1333->92|1413->96|1444->101|1507->138|1521->144|1591->194|1670->247|1684->253|1757->305|2860->1380|2889->1381|2935->1399|3022->1458|3051->1459|3100->1480|3402->1754|3431->1755|3476->1772|3529->1797|3558->1798|3591->1804|3641->65|3668->83|3696->1815|3725->1818|3766->1850|3806->1852|3842->1861|4245->2236|4261->2242|4325->2284|10562->8493|10578->8499|10619->8518
                  LINES: 35->1|38->2|40->4|40->4|42->4|43->5|43->5|43->5|43->5|44->6|44->6|44->6|61->23|61->23|63->25|63->25|63->25|64->26|68->30|68->30|69->31|70->32|70->32|72->34|74->1|75->3|76->35|78->37|78->37|78->37|79->38|84->43|84->43|84->43|176->135|176->135|176->135
                  -- GENERATED --
              */
          