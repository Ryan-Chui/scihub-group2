
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

object organizationRegister extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[play.data.Form[models.Organization],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(organizationForm: play.data.Form[models.Organization], regPattern: String ):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._

def /*4.2*/scripts/*4.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*4.13*/("""
    """),format.raw/*5.5*/("""<script type="text/javascript" src='"""),_display_(/*5.42*/routes/*5.48*/.Assets.at("javascripts/database_field_length.js")),format.raw/*5.98*/("""'></script>
    <script type="text/javascript" src='"""),_display_(/*6.42*/routes/*6.48*/.Assets.at("javascripts/field_validation_helper.js")),format.raw/*6.100*/("""'></script>
    <script type="text/javascript">
            // var isEmailEmpty = true;
            // var isEmailInvalid = true;
            var isEmailAlreadyRegistered = true;
            // var isPasswordNotMatched = true;
            // var isPasswordNotSecure = false;
            // var isSQ1hasNoContent = false;
            // var isSQ2hasNoContent = false;
            // var isFirstNameEmpty = true;
            // var isLastNameEmpty = true;
            // var passwordNotSecureError = "Password must contain at least one special character, one uppercase, and lowercase letter, and at least 8 or more characters <br/>";
            // var passwordsDoNotMatchError = "Your password and confirmation password do not match. <br/>";
            // var urlAlreadyRegisteredError = "Your url address is already registered.<br/>";
            // var urlEmptyError = "Field 'Email' must be filled in.<br/>";
            // var organizationNameEmptyError = "Field 'First Name' must be filled in.<br/>";
            // var focusesEmptyError = "Field 'Last Name' must be filled in.<br/>";
            // var urlInvalidError = "Your url address must be valid.<br/>";

            var errorMessages = """),format.raw/*25.33*/("""{"""),format.raw/*25.34*/("""
                """),format.raw/*26.17*/("""organizationName: "Organization Name is required.",
                // state: "Please enter a valid state (e.g., two-letter code).",
                state: "State is required.",
                city: "City name is required.",
                // zipCode: "Please enter a valid Zipcode (5 digits).",
                zipCode: "Please enter a valid Zipcode (digits only).",
                streetAddress1: "Street Address 1 is required.",
                // streetAddress2: "Street Address 2 is required.",
                streetAddress2: "Please enter a valid street address.",
                shortDescription: "Short Description is required.",
                longDescription: "Long Description is required.",
                contactPersonName: "Contact Person Name is required and should contain only letters.",
                contactPersonEmail: "Please enter a valid email address.",
                // contactPersonPhone: "Please enter a valid phone number (10 digits).",
                contactPersonPhone: "Please enter a valid phone number (digits only).",
                fields: "Fields are required.",
                focuses: "Focuses are required.",
                // organizationHistory: "Organization History must be within allowed characters.",
                numberOfEmployees: "Please enter a valid number of employees.",
                url: "Please enter a valid URL."
            """),format.raw/*46.13*/("""}"""),format.raw/*46.14*/(""";

            var patterns = """),format.raw/*48.28*/("""{"""),format.raw/*48.29*/("""
                """),format.raw/*49.17*/("""// state: /^[A-Za-z]"""),format.raw/*49.37*/("""{"""),format.raw/*49.38*/("""2"""),format.raw/*49.39*/("""}"""),format.raw/*49.40*/("""$/,
                // zipCode: /^\d"""),format.raw/*50.33*/("""{"""),format.raw/*50.34*/("""5"""),format.raw/*50.35*/("""}"""),format.raw/*50.36*/("""$/,
                zipCode: /^\d+$/,
                contactPersonName: /^[A-Za-z\s]+$/,
                contactPersonEmail: /^[^\s@]+@[^\s@]+\.[^\s@]+$/,
                // contactPersonPhone: /^\d"""),format.raw/*54.44*/("""{"""),format.raw/*54.45*/("""10"""),format.raw/*54.47*/("""}"""),format.raw/*54.48*/("""$/,
                contactPersonPhone: /^\d+$/,
                numberOfEmployees: /^\d+$/,
                url: /^(https?:\/\/)?([\w\-])+\."""),format.raw/*57.49*/("""{"""),format.raw/*57.50*/("""1"""),format.raw/*57.51*/("""}"""),format.raw/*57.52*/("""([a-zA-Z]"""),format.raw/*57.61*/("""{"""),format.raw/*57.62*/("""2,63"""),format.raw/*57.66*/("""}"""),format.raw/*57.67*/(""")([\/\w\.-]*)*\/?$/
            """),format.raw/*58.13*/("""}"""),format.raw/*58.14*/(""";

            function validateField(fieldId, pattern, errorMsg) """),format.raw/*60.64*/("""{"""),format.raw/*60.65*/("""
                """),format.raw/*61.17*/("""var field = document.getElementById(fieldId);
                var errorSpan = document.getElementById(fieldId + "Msg");
                var value = field.value.trim();

                if (field.hasAttribute('required') && value === "") """),format.raw/*65.69*/("""{"""),format.raw/*65.70*/("""
                    """),format.raw/*66.21*/("""errorSpan.innerText = "This field is required.";
                    errorSpan.classList.add("red-text");
                    field.classList.add("invalid");
                    return false;
                """),format.raw/*70.17*/("""}"""),format.raw/*70.18*/(""" """),format.raw/*70.19*/("""else if (pattern && value !== "" && !pattern.test(value)) """),format.raw/*70.77*/("""{"""),format.raw/*70.78*/("""
                    """),format.raw/*71.21*/("""errorSpan.innerText = errorMsg;
                    errorSpan.classList.add("red-text");
                    field.classList.add("invalid");
                    return false;
                """),format.raw/*75.17*/("""}"""),format.raw/*75.18*/(""" """),format.raw/*75.19*/("""else """),format.raw/*75.24*/("""{"""),format.raw/*75.25*/("""
                    """),format.raw/*76.21*/("""errorSpan.innerText = "";
                    errorSpan.classList.remove("red-text");
                    field.classList.remove("invalid");
                    return true;
                """),format.raw/*80.17*/("""}"""),format.raw/*80.18*/("""
            """),format.raw/*81.13*/("""}"""),format.raw/*81.14*/("""

            """),format.raw/*83.13*/("""function validateForm() """),format.raw/*83.37*/("""{"""),format.raw/*83.38*/("""
                """),format.raw/*84.17*/("""var isValid = true;

                // Validate Required Fields with Patterns
                isValid &= validateField("organizationName", null, errorMessages.organizationName);
                // isValid &= validateField("state", patterns.state, errorMessages.state);
                isValid &= validateField("state", null, errorMessages.state);
                isValid &= validateField("city", null, errorMessages.city);
                isValid &= validateField("zipCode", patterns.zipCode, errorMessages.zipCode);
                isValid &= validateField("streetAddress1", null, errorMessages.streetAddress1);
                isValid &= validateField("streetAddress2", null, errorMessages.streetAddress2);
                isValid &= validateField("shortDescription", null, errorMessages.shortDescription);
                isValid &= validateField("longDescription", null, errorMessages.longDescription);
                isValid &= validateField("contactPersonName", patterns.contactPersonName, errorMessages.contactPersonName);
                isValid &= validateField("contactPersonEmail", patterns.contactPersonEmail, errorMessages.contactPersonEmail);
                isValid &= validateField("contactPersonPhone", patterns.contactPersonPhone, errorMessages.contactPersonPhone);
                isValid &= validateField("fields", null, errorMessages.fields);
                isValid &= validateField("focuses", null, errorMessages.focuses);
                isValid &= validateField("numberOfEmployees", patterns.numberOfEmployees, errorMessages.numberOfEmployees);
                isValid &= validateField("url", patterns.url, errorMessages.url);
                /*
                if (isEmailAlreadyRegistered) """),format.raw/*104.47*/("""{"""),format.raw/*104.48*/("""
                    """),format.raw/*105.21*/("""document.getElementById("warningMessage").innerText = "Your email address is already registered.";
                    $("#warningModal").modal('open');
                    isValid = false;
                """),format.raw/*108.17*/("""}"""),format.raw/*108.18*/("""

                 """),format.raw/*110.18*/("""*/

                return !!isValid;
            """),format.raw/*113.13*/("""}"""),format.raw/*113.14*/("""

            """),format.raw/*115.13*/("""document.addEventListener("DOMContentLoaded", function() """),format.raw/*115.70*/("""{"""),format.raw/*115.71*/("""
                """),format.raw/*116.17*/("""var fieldsToValidate = [
                    """),format.raw/*117.21*/("""{"""),format.raw/*117.22*/("""id: "organizationName", pattern: null, errorMsg: errorMessages.organizationName"""),format.raw/*117.101*/("""}"""),format.raw/*117.102*/(""",
                    """),format.raw/*118.21*/("""{"""),format.raw/*118.22*/("""id: "state", pattern: patterns.state, errorMsg: errorMessages.state"""),format.raw/*118.89*/("""}"""),format.raw/*118.90*/(""",
                    """),format.raw/*119.21*/("""{"""),format.raw/*119.22*/("""id: "city", pattern: null, errorMsg: errorMessages.city"""),format.raw/*119.77*/("""}"""),format.raw/*119.78*/(""",
                    """),format.raw/*120.21*/("""{"""),format.raw/*120.22*/("""id: "zipCode", pattern: patterns.zipCode, errorMsg: errorMessages.zipCode"""),format.raw/*120.95*/("""}"""),format.raw/*120.96*/(""",
                    """),format.raw/*121.21*/("""{"""),format.raw/*121.22*/("""id: "streetAddress1", pattern: null, errorMsg: errorMessages.streetAddress1"""),format.raw/*121.97*/("""}"""),format.raw/*121.98*/(""",
                    """),format.raw/*122.21*/("""{"""),format.raw/*122.22*/("""id: "streetAddress2", pattern: null, errorMsg: errorMessages.streetAddress2"""),format.raw/*122.97*/("""}"""),format.raw/*122.98*/(""",
                    """),format.raw/*123.21*/("""{"""),format.raw/*123.22*/("""id: "shortDescription", pattern: null, errorMsg: errorMessages.shortDescription"""),format.raw/*123.101*/("""}"""),format.raw/*123.102*/(""",
                    """),format.raw/*124.21*/("""{"""),format.raw/*124.22*/("""id: "longDescription", pattern: null, errorMsg: errorMessages.longDescription"""),format.raw/*124.99*/("""}"""),format.raw/*124.100*/(""",
                    """),format.raw/*125.21*/("""{"""),format.raw/*125.22*/("""id: "contactPersonName", pattern: patterns.contactPersonName, errorMsg: errorMessages.contactPersonName"""),format.raw/*125.125*/("""}"""),format.raw/*125.126*/(""",
                    """),format.raw/*126.21*/("""{"""),format.raw/*126.22*/("""id: "contactPersonEmail", pattern: patterns.contactPersonEmail, errorMsg: errorMessages.contactPersonEmail"""),format.raw/*126.128*/("""}"""),format.raw/*126.129*/(""",
                    """),format.raw/*127.21*/("""{"""),format.raw/*127.22*/("""id: "contactPersonPhone", pattern: patterns.contactPersonPhone, errorMsg: errorMessages.contactPersonPhone"""),format.raw/*127.128*/("""}"""),format.raw/*127.129*/(""",
                    """),format.raw/*128.21*/("""{"""),format.raw/*128.22*/("""id: "fields", pattern: null, errorMsg: errorMessages.fields"""),format.raw/*128.81*/("""}"""),format.raw/*128.82*/(""",
                    """),format.raw/*129.21*/("""{"""),format.raw/*129.22*/("""id: "focuses", pattern: null, errorMsg: errorMessages.focuses"""),format.raw/*129.83*/("""}"""),format.raw/*129.84*/(""",
                    """),format.raw/*130.21*/("""{"""),format.raw/*130.22*/("""id: "numberOfEmployees", pattern: patterns.numberOfEmployees, errorMsg: errorMessages.numberOfEmployees"""),format.raw/*130.125*/("""}"""),format.raw/*130.126*/(""",
                    """),format.raw/*131.21*/("""{"""),format.raw/*131.22*/("""id: "url", pattern: patterns.url, errorMsg: errorMessages.url"""),format.raw/*131.83*/("""}"""),format.raw/*131.84*/("""
                """),format.raw/*132.17*/("""];

                fieldsToValidate.forEach(function(field) """),format.raw/*134.58*/("""{"""),format.raw/*134.59*/("""
                    """),format.raw/*135.21*/("""var input = document.getElementById(field.id);
                    input.addEventListener("blur", function() """),format.raw/*136.63*/("""{"""),format.raw/*136.64*/("""
                        """),format.raw/*137.25*/("""validateField(field.id, field.pattern, field.errorMsg);
                    """),format.raw/*138.21*/("""}"""),format.raw/*138.22*/(""");
                    input.addEventListener("input", function() """),format.raw/*139.64*/("""{"""),format.raw/*139.65*/("""
                        """),format.raw/*140.25*/("""validateField(field.id, field.pattern, field.errorMsg);
                    """),format.raw/*141.21*/("""}"""),format.raw/*141.22*/(""");
                """),format.raw/*142.17*/("""}"""),format.raw/*142.18*/(""");
            """),format.raw/*143.13*/("""}"""),format.raw/*143.14*/(""");
            /*
            function checkFormValid() """),format.raw/*145.39*/("""{"""),format.raw/*145.40*/("""
                """),format.raw/*146.17*/("""if( isEmailAlreadyRegistered)"""),format.raw/*146.46*/("""{"""),format.raw/*146.47*/("""
                    """),format.raw/*147.21*/("""document.getElementById("warningMessage").innerText = "Your url address is already registered.";
                    $("#warningModal").modal();
                    $("#warningModal").modal('open');
                    return false;
                """),format.raw/*151.17*/("""}"""),format.raw/*151.18*/("""
                """),format.raw/*152.17*/("""return true;
            """),format.raw/*153.13*/("""}"""),format.raw/*153.14*/("""

             """),format.raw/*155.14*/("""*/
    </script>
""")))};
Seq[Any](format.raw/*1.78*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*157.2*/("""

"""),_display_(/*159.2*/main("Organization Register", scripts)/*159.40*/ {_display_(Seq[Any](format.raw/*159.42*/("""
    """),format.raw/*160.5*/("""<div class="container">
        <div class="row">
            <div class="col s12 l10 offset-l1">
                <div class="card-panel z-depth-0">
                    <h4 class="form-signin-heading center">Register Organization</h4>
                    <form class="form-signin" onsubmit="return checkFormValid();" enctype="multipart/form-data" method="post" action=""""),_display_(/*165.136*/routes/*165.142*/.OrganizationController.organizationRegisterPOST()),format.raw/*165.192*/("""">
                            <!-- Organization Name -->
                        <div class="row">
                            <div class="input-field col s12">
                                <input type="text" name="organizationName" id="organizationName" class="validate" required>
                                <label for="organizationName">Organization Name*</label>
                                <span id="organizationNameMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>

                            <!-- State, City, Zipcode -->
                        <div class="row">
                            <div class="input-field col s12 m4">
                                <input type="text" name="state" id="state" class="validate" required>
                                <label for="state">State*</label>
                                <span id="stateMsg" class="helper-text" data-error=""></span>
                            </div>

                            <div class="input-field col s12 m4">
                                <input type="text" name="city" id="city" class="validate" required>
                                <label for="city">City*</label>
                                <span id="cityMsg" class="helper-text" data-error=""></span>
                            </div>

                            <div class="input-field col s12 m4">
                                <input type="text" name="zipCode" id="zipCode" class="validate" required>
                                <label for="zipCode">Zipcode*</label>
                                <span id="zipCodeMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>

                            <!-- Street Address 1 -->
                        <div class="row">
                            <div class="input-field col s12">
                                <input type="text" name="streetAddress1" id="streetAddress1" class="validate" required>
                                <label for="streetAddress1">Street Address 1*</label>
                                <span id="streetAddress1Msg" class="helper-text" data-error=""></span>
                            </div>
                        </div>

                            <!-- Street Address 2 -->
                        <div class="row">
                            <div class="input-field col s12">
                                <input type="text" name="streetAddress2" id="streetAddress2" class="validate">
                                <label for="streetAddress2">Street Address 2</label>
                                <span id="streetAddress2Msg" class="helper-text" data-error=""></span>
                            </div>
                        </div>

                            <!-- Short Description -->
                        <div class="row">
                            <div class="input-field col s12">
                                <input type="text" name="shortDescription" id="shortDescription" class="validate" required>
                                <label for="shortDescription">Short Description*</label>
                                <span id="shortDescriptionMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>

                            <!-- Long Description -->
                        <div class="row">
                            <div class="input-field col s12">
                                <input type="text" name="longDescription" id="longDescription" class="validate" required>
                                <label for="longDescription">Long Description*</label>
                                <span id="longDescriptionMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>

                            <!-- Contact Info -->
                        <h5>Contact Info:</h5>
                        <div class="row">
                            <div class="input-field col s12 m4">
                                <input type="text" name="contactPersonName" id="contactPersonName" class="validate" required>
                                <label for="contactPersonName">Contact Person Name*</label>
                                <span id="contactPersonNameMsg" class="helper-text" data-error=""></span>
                            </div>

                            <div class="input-field col s12 m4">
                                <input type="email" name="contactPersonEmail" id="contactPersonEmail" class="validate" required>
                                <label for="contactPersonEmail">Contact Person Email*</label>
                                <span id="contactPersonEmailMsg" class="helper-text" data-error=""></span>
                            </div>

                            <div class="input-field col s12 m4">
                                <input type="tel" name="contactPersonPhone" id="contactPersonPhone" class="validate" required>
                                <label for="contactPersonPhone">Contact Person Phone*</label>
                                <span id="contactPersonPhoneMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>

                            <!-- Fields -->
                        <div class="row">
                            <div class="input-field col s12">
                                <input type="text" name="fields" id="fields" class="validate" required>
                                <label for="fields">Fields*</label>
                                <span id="fieldsMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>

                            <!-- Focuses -->
                        <div class="row">
                            <div class="input-field col s12">
                                <input type="text" name="focuses" id="focuses" class="validate" required>
                                <label for="focuses">Focuses*</label>
                                <span id="focusesMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>

                            <!-- Organization History -->
                        <div class="row">
                            <div class="input-field col s12">
                                <input type="text" name="organizationHistory" id="organizationHistory" class="validate">
                                <label for="organizationHistory">Organization History</label>
                                <span id="organizationHistoryMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>

                            <!-- Number of Employees -->
                        <div class="row">
                            <div class="input-field col s12">
                                <input type="number" name="numberOfEmployees" id="numberOfEmployees" class="validate" min="1">
                                <label for="numberOfEmployees">Number of Employees</label>
                                <span id="numberOfEmployeesMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>

                            <!-- URL -->
                        <div class="row">
                            <div class="input-field col s12">
                                <input type="url" name="URL" id="url" class="validate">
                                <label for="url">URL</label>
                                <span id="urlMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>

                            <!-- Submit Buttons -->
                        <div class="center actions row">
                            <div class="input-field col s12">
                                <button type="submit" class="btn waves-effect waves-light blue darken-2" id="create">
                                    Create
                                </button>
                                <a href=""""),_display_(/*305.43*/routes/*305.49*/.Application.home()),format.raw/*305.68*/("""" class="btn waves-effect waves-light red darken-2">Cancel</a>
                                <div class="helper-text red-text" id="submitErrorMsg"></div>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>

        <!-- Warning Modal -->
    <div id="warningModal" class="modal">
        <div class="modal-content">
            <h4>Warning</h4>
            <p id="warningMessage"></p>
        </div>
        <div class="modal-footer">
            <a href="#!" class="modal-close btn waves-effect waves-green">OK</a>
        </div>
    </div>

    <script>
            document.addEventListener('DOMContentLoaded', function() """),format.raw/*327.70*/("""{"""),format.raw/*327.71*/("""
                """),format.raw/*328.17*/("""// Initialize Materialize Modal
                var elems = document.querySelectorAll('.modal');
                var instances = M.Modal.init(elems);
            """),format.raw/*331.13*/("""}"""),format.raw/*331.14*/(""");
    </script>
""")))}))
      }
    }
  }

  def render(organizationForm:play.data.Form[models.Organization],regPattern:String): play.twirl.api.HtmlFormat.Appendable = apply(organizationForm,regPattern)

  def f:((play.data.Form[models.Organization],String) => play.twirl.api.HtmlFormat.Appendable) = (organizationForm,regPattern) => apply(organizationForm,regPattern)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:33 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/organizationRegister.scala.html
                  HASH: 16d5cbcce3b5898c7f2ec53a4da27a0c9294f208
                  MATRIX: 1162->1|1311->79|1339->97|1353->104|1433->108|1464->113|1527->150|1541->156|1611->206|1690->259|1704->265|1777->317|3005->1517|3034->1518|3079->1535|4509->2937|4538->2938|4596->2968|4625->2969|4670->2986|4718->3006|4747->3007|4776->3008|4805->3009|4869->3045|4898->3046|4927->3047|4956->3048|5183->3251|5212->3252|5242->3254|5271->3255|5440->3396|5469->3397|5498->3398|5527->3399|5564->3408|5593->3409|5625->3413|5654->3414|5714->3446|5743->3447|5837->3513|5866->3514|5911->3531|6176->3768|6205->3769|6254->3790|6490->3998|6519->3999|6548->4000|6634->4058|6663->4059|6712->4080|6931->4271|6960->4272|6989->4273|7022->4278|7051->4279|7100->4300|7318->4490|7347->4491|7388->4504|7417->4505|7459->4519|7511->4543|7540->4544|7585->4561|9333->6280|9363->6281|9413->6302|9648->6508|9678->6509|9726->6528|9805->6578|9835->6579|9878->6593|9964->6650|9994->6651|10040->6668|10114->6713|10144->6714|10253->6793|10284->6794|10335->6816|10365->6817|10461->6884|10491->6885|10542->6907|10572->6908|10656->6963|10686->6964|10737->6986|10767->6987|10869->7060|10899->7061|10950->7083|10980->7084|11084->7159|11114->7160|11165->7182|11195->7183|11299->7258|11329->7259|11380->7281|11410->7282|11519->7361|11550->7362|11601->7384|11631->7385|11737->7462|11768->7463|11819->7485|11849->7486|11982->7589|12013->7590|12064->7612|12094->7613|12230->7719|12261->7720|12312->7742|12342->7743|12478->7849|12509->7850|12560->7872|12590->7873|12678->7932|12708->7933|12759->7955|12789->7956|12879->8017|12909->8018|12960->8040|12990->8041|13123->8144|13154->8145|13205->8167|13235->8168|13325->8229|13355->8230|13401->8247|13491->8308|13521->8309|13571->8330|13709->8439|13739->8440|13793->8465|13898->8541|13928->8542|14023->8608|14053->8609|14107->8634|14212->8710|14242->8711|14290->8730|14320->8731|14364->8746|14394->8747|14479->8803|14509->8804|14555->8821|14613->8850|14643->8851|14693->8872|14971->9121|15001->9122|15047->9139|15101->9164|15131->9165|15175->9180|15232->77|15259->95|15288->9198|15318->9201|15366->9239|15407->9241|15440->9246|15839->9616|15856->9622|15929->9672|24267->17982|24283->17988|24324->18007|25090->18744|25120->18745|25166->18762|25357->18924|25387->18925
                  LINES: 35->1|38->2|40->4|40->4|42->4|43->5|43->5|43->5|43->5|44->6|44->6|44->6|63->25|63->25|64->26|84->46|84->46|86->48|86->48|87->49|87->49|87->49|87->49|87->49|88->50|88->50|88->50|88->50|92->54|92->54|92->54|92->54|95->57|95->57|95->57|95->57|95->57|95->57|95->57|95->57|96->58|96->58|98->60|98->60|99->61|103->65|103->65|104->66|108->70|108->70|108->70|108->70|108->70|109->71|113->75|113->75|113->75|113->75|113->75|114->76|118->80|118->80|119->81|119->81|121->83|121->83|121->83|122->84|142->104|142->104|143->105|146->108|146->108|148->110|151->113|151->113|153->115|153->115|153->115|154->116|155->117|155->117|155->117|155->117|156->118|156->118|156->118|156->118|157->119|157->119|157->119|157->119|158->120|158->120|158->120|158->120|159->121|159->121|159->121|159->121|160->122|160->122|160->122|160->122|161->123|161->123|161->123|161->123|162->124|162->124|162->124|162->124|163->125|163->125|163->125|163->125|164->126|164->126|164->126|164->126|165->127|165->127|165->127|165->127|166->128|166->128|166->128|166->128|167->129|167->129|167->129|167->129|168->130|168->130|168->130|168->130|169->131|169->131|169->131|169->131|170->132|172->134|172->134|173->135|174->136|174->136|175->137|176->138|176->138|177->139|177->139|178->140|179->141|179->141|180->142|180->142|181->143|181->143|183->145|183->145|184->146|184->146|184->146|185->147|189->151|189->151|190->152|191->153|191->153|193->155|196->1|197->3|198->157|200->159|200->159|200->159|201->160|206->165|206->165|206->165|346->305|346->305|346->305|368->327|368->327|369->328|372->331|372->331
                  -- GENERATED --
              */
          