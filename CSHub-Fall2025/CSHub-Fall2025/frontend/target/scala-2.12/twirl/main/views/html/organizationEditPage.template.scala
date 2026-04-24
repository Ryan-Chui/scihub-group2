
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

object organizationEditPage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Organization,play.data.Form[models.Organization],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(organization: Organization, organizationForm: play.data.Form[models.Organization], regPattern: String ):play.twirl.api.HtmlFormat.Appendable = {
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
Seq[Any](format.raw/*1.106*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*157.2*/("""

"""),_display_(/*159.2*/main("Organization Edit Page", scripts)/*159.41*/ {_display_(Seq[Any](format.raw/*159.43*/("""
    """),format.raw/*160.5*/("""<div class="container">
        <div class="row">
            <div class="col s12 l10 offset-l1">
                <div class="card-panel z-depth-0">
                    <h4 class="form-signin-heading center">Edit Organization Details</h4>
                    <form class="form-signin" onsubmit="return checkFormValid();" enctype="multipart/form-data" method="post" action=""""),_display_(/*165.136*/routes/*165.142*/.OrganizationController.organizationEditPOST(organization.getId)),format.raw/*165.206*/("""">
                        <div class="row">
                            <div class="input-field col s12">
                                <input type="text" name="organizationName" id="organizationName" class="validate" value=""""),_display_(/*168.123*/organization/*168.135*/.getOrganizationName),format.raw/*168.155*/("""" required>
                                <label for="organizationName">Organization Name*</label>
                                <span id="organizationNameMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>

                            <!-- State, City, Zipcode -->
                        <div class="row">
                            <div class="input-field col s12 m4">
                                <input type="text" name="state" id="state" class="validate" value=""""),_display_(/*177.101*/organization/*177.113*/.getState),format.raw/*177.122*/("""" required>
                                <label for="state">State*</label>
                                <span id="stateMsg" class="helper-text" data-error=""></span>
                            </div>

                            <div class="input-field col s12 m4">
                                <input type="text" name="city" id="city" class="validate" value=""""),_display_(/*183.99*/organization/*183.111*/.getCity),format.raw/*183.119*/("""" required>
                                <label for="city">City*</label>
                                <span id="cityMsg" class="helper-text" data-error=""></span>
                            </div>

                            <div class="input-field col s12 m4">
                                <input type="text" name="zipCode" id="zipCode" class="validate" value=""""),_display_(/*189.105*/organization/*189.117*/.getZipCode),format.raw/*189.128*/("""" required>
                                <label for="zipCode">Zipcode*</label>
                                <span id="zipCodeMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>

                            <!-- Street Address 1 -->
                        <div class="row">
                            <div class="input-field col s12">
                                <input type="text" name="streetAddress1" id="streetAddress1" class="validate" value=""""),_display_(/*198.119*/organization/*198.131*/.getStreetAddress1),format.raw/*198.149*/("""" required>
                                <label for="streetAddress1">Street Address 1*</label>
                                <span id="streetAddress1Msg" class="helper-text" data-error=""></span>
                            </div>
                        </div>

                            <!-- Street Address 2 -->
                        <div class="row">
                            <div class="input-field col s12">
                                <input type="text" name="streetAddress2" id="streetAddress2" class="validate" value=""""),_display_(/*207.119*/organization/*207.131*/.getStreetAddress2),format.raw/*207.149*/("""">
                                <label for="streetAddress2">Street Address 2</label>
                                <span id="streetAddress2Msg" class="helper-text" data-error=""></span>
                            </div>
                        </div>

                            <!-- Short Description -->
                        <div class="row">
                            <div class="input-field col s12">
                                <input type="text" name="shortDescription" id="shortDescription" class="validate" value=""""),_display_(/*216.123*/organization/*216.135*/.getShortDescription),format.raw/*216.155*/("""" required>
                                <label for="shortDescription">Short Description*</label>
                                <span id="shortDescriptionMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>

                            <!-- Long Description -->
                        <div class="row">
                            <div class="input-field col s12">
                                <input type="text" name="longDescription" id="longDescription" class="validate" value=""""),_display_(/*225.121*/organization/*225.133*/.getLongDescription),format.raw/*225.152*/("""" required>
                                <label for="longDescription">Long Description*</label>
                                <span id="longDescriptionMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>

                            <!-- Contact Info -->
                        <h5>Contact Info:</h5>
                        <div class="row">
                            <div class="input-field col s12 m4">
                                <input type="text" name="contactPersonName" id="contactPersonName" class="validate" value=""""),_display_(/*235.125*/organization/*235.137*/.getContactPersonName),format.raw/*235.158*/("""" required>
                                <label for="contactPersonName">Contact Person Name*</label>
                                <span id="contactPersonNameMsg" class="helper-text" data-error=""></span>
                            </div>

                            <div class="input-field col s12 m4">
                                <input type="email" name="contactPersonEmail" id="contactPersonEmail" class="validate" value=""""),_display_(/*241.128*/organization/*241.140*/.getContactPersonEmail),format.raw/*241.162*/("""" required>
                                <label for="contactPersonEmail">Contact Person Email*</label>
                                <span id="contactPersonEmailMsg" class="helper-text" data-error=""></span>
                            </div>

                            <div class="input-field col s12 m4">
                                <input type="tel" name="contactPersonPhone" id="contactPersonPhone" class="validate" value=""""),_display_(/*247.126*/organization/*247.138*/.getContactPersonPhone),format.raw/*247.160*/("""" required>
                                <label for="contactPersonPhone">Contact Person Phone*</label>
                                <span id="contactPersonPhoneMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>

                            <!-- Fields -->
                        <div class="row">
                            <div class="input-field col s12">
                                <input type="text" name="fields" id="fields" class="validate" value=""""),_display_(/*256.103*/organization/*256.115*/.getFields),format.raw/*256.125*/("""" required>
                                <label for="fields">Fields*</label>
                                <span id="fieldsMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>

                            <!-- Focuses -->
                        <div class="row">
                            <div class="input-field col s12">
                                <input type="text" name="focuses" id="focuses" class="validate" value=""""),_display_(/*265.105*/organization/*265.117*/.getFocuses),format.raw/*265.128*/("""" required>
                                <label for="focuses">Focuses*</label>
                                <span id="focusesMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>

                            <!-- Organization History -->
                        <div class="row">
                            <div class="input-field col s12">
                                <input type="text" name="organizationHistory" id="organizationHistory" class="validate" value=""""),_display_(/*274.129*/organization/*274.141*/.getOrganizationHistory),format.raw/*274.164*/("""">
                                <label for="organizationHistory">Organization History</label>
                                <span id="organizationHistoryMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>

                            <!-- Number of Employees -->
                        <div class="row">
                            <div class="input-field col s12">
                                <input type="number" name="numberOfEmployees" id="numberOfEmployees" class="validate" value=""""),_display_(/*283.127*/organization/*283.139*/.getNumberOfEmployees),format.raw/*283.160*/("""" min="1">
                                <label for="numberOfEmployees">Number of Employees</label>
                                <span id="numberOfEmployeesMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>

                            <!-- URL -->
                        <div class="row">
                            <div class="input-field col s12">
                                <input type="url" name="URL" id="url" class="validate" value=""""),_display_(/*292.96*/organization/*292.108*/.getURL),format.raw/*292.115*/("""">
                                <label for="url">URL</label>
                                <span id="urlMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>
                        <div class="center actions row">
                            <div class="input-field col s12">
                                <button type="submit" class="btn waves-effect waves-light blue darken-2" id="create">
                                    Update</button>
                                <a href=""""),_display_(/*301.43*/routes/*301.49*/.Application.home()),format.raw/*301.68*/("""" class="btn waves-effect waves-light red darken-2">Cancel</a>
                                <div class="helper-text red-text" id="submitErrorMsg"></div>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>

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
            document.addEventListener('DOMContentLoaded', function() """),format.raw/*322.70*/("""{"""),format.raw/*322.71*/("""
                """),format.raw/*323.17*/("""// Initialize Materialize Modal
                var elems = document.querySelectorAll('.modal');
                var instances = M.Modal.init(elems);
            """),format.raw/*326.13*/("""}"""),format.raw/*326.14*/(""");
    </script>
""")))}))
      }
    }
  }

  def render(organization:Organization,organizationForm:play.data.Form[models.Organization],regPattern:String): play.twirl.api.HtmlFormat.Appendable = apply(organization,organizationForm,regPattern)

  def f:((Organization,play.data.Form[models.Organization],String) => play.twirl.api.HtmlFormat.Appendable) = (organization,organizationForm,regPattern) => apply(organization,organizationForm,regPattern)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:33 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/organizationEditPage.scala.html
                  HASH: ebe99ab0be9aa10bc62220bfb7e8976aa5202d29
                  MATRIX: 1175->1|1352->107|1380->125|1394->132|1474->136|1505->141|1568->178|1582->184|1652->234|1731->287|1745->293|1818->345|3046->1545|3075->1546|3120->1563|4550->2965|4579->2966|4637->2996|4666->2997|4711->3014|4759->3034|4788->3035|4817->3036|4846->3037|4910->3073|4939->3074|4968->3075|4997->3076|5224->3279|5253->3280|5283->3282|5312->3283|5481->3424|5510->3425|5539->3426|5568->3427|5605->3436|5634->3437|5666->3441|5695->3442|5755->3474|5784->3475|5878->3541|5907->3542|5952->3559|6217->3796|6246->3797|6295->3818|6531->4026|6560->4027|6589->4028|6675->4086|6704->4087|6753->4108|6972->4299|7001->4300|7030->4301|7063->4306|7092->4307|7141->4328|7359->4518|7388->4519|7429->4532|7458->4533|7500->4547|7552->4571|7581->4572|7626->4589|9374->6308|9404->6309|9454->6330|9689->6536|9719->6537|9767->6556|9846->6606|9876->6607|9919->6621|10005->6678|10035->6679|10081->6696|10155->6741|10185->6742|10294->6821|10325->6822|10376->6844|10406->6845|10502->6912|10532->6913|10583->6935|10613->6936|10697->6991|10727->6992|10778->7014|10808->7015|10910->7088|10940->7089|10991->7111|11021->7112|11125->7187|11155->7188|11206->7210|11236->7211|11340->7286|11370->7287|11421->7309|11451->7310|11560->7389|11591->7390|11642->7412|11672->7413|11778->7490|11809->7491|11860->7513|11890->7514|12023->7617|12054->7618|12105->7640|12135->7641|12271->7747|12302->7748|12353->7770|12383->7771|12519->7877|12550->7878|12601->7900|12631->7901|12719->7960|12749->7961|12800->7983|12830->7984|12920->8045|12950->8046|13001->8068|13031->8069|13164->8172|13195->8173|13246->8195|13276->8196|13366->8257|13396->8258|13442->8275|13532->8336|13562->8337|13612->8358|13750->8467|13780->8468|13834->8493|13939->8569|13969->8570|14064->8636|14094->8637|14148->8662|14253->8738|14283->8739|14331->8758|14361->8759|14405->8774|14435->8775|14520->8831|14550->8832|14596->8849|14654->8878|14684->8879|14734->8900|15012->9149|15042->9150|15088->9167|15142->9192|15172->9193|15216->9208|15274->105|15301->123|15330->9226|15360->9229|15409->9268|15450->9270|15483->9275|15886->9649|15903->9655|15990->9719|16248->9948|16271->9960|16314->9980|16881->10518|16904->10530|16936->10539|17335->10910|17358->10922|17389->10930|17792->11304|17815->11316|17849->11327|18399->11848|18422->11860|18463->11878|19036->12422|19059->12434|19100->12452|19668->12991|19691->13003|19734->13023|20314->13574|20337->13586|20379->13605|21006->14203|21029->14215|21073->14236|21540->14674|21563->14686|21608->14708|22076->15147|22099->15159|22144->15181|22703->15711|22726->15723|22759->15733|23283->16228|23306->16240|23340->16251|23904->16786|23927->16798|23973->16821|24561->17380|24584->17392|24628->17413|25171->17928|25194->17940|25224->17947|25805->18500|25821->18506|25862->18525|26597->19231|26627->19232|26673->19249|26864->19411|26894->19412
                  LINES: 35->1|38->2|40->4|40->4|42->4|43->5|43->5|43->5|43->5|44->6|44->6|44->6|63->25|63->25|64->26|84->46|84->46|86->48|86->48|87->49|87->49|87->49|87->49|87->49|88->50|88->50|88->50|88->50|92->54|92->54|92->54|92->54|95->57|95->57|95->57|95->57|95->57|95->57|95->57|95->57|96->58|96->58|98->60|98->60|99->61|103->65|103->65|104->66|108->70|108->70|108->70|108->70|108->70|109->71|113->75|113->75|113->75|113->75|113->75|114->76|118->80|118->80|119->81|119->81|121->83|121->83|121->83|122->84|142->104|142->104|143->105|146->108|146->108|148->110|151->113|151->113|153->115|153->115|153->115|154->116|155->117|155->117|155->117|155->117|156->118|156->118|156->118|156->118|157->119|157->119|157->119|157->119|158->120|158->120|158->120|158->120|159->121|159->121|159->121|159->121|160->122|160->122|160->122|160->122|161->123|161->123|161->123|161->123|162->124|162->124|162->124|162->124|163->125|163->125|163->125|163->125|164->126|164->126|164->126|164->126|165->127|165->127|165->127|165->127|166->128|166->128|166->128|166->128|167->129|167->129|167->129|167->129|168->130|168->130|168->130|168->130|169->131|169->131|169->131|169->131|170->132|172->134|172->134|173->135|174->136|174->136|175->137|176->138|176->138|177->139|177->139|178->140|179->141|179->141|180->142|180->142|181->143|181->143|183->145|183->145|184->146|184->146|184->146|185->147|189->151|189->151|190->152|191->153|191->153|193->155|196->1|197->3|198->157|200->159|200->159|200->159|201->160|206->165|206->165|206->165|209->168|209->168|209->168|218->177|218->177|218->177|224->183|224->183|224->183|230->189|230->189|230->189|239->198|239->198|239->198|248->207|248->207|248->207|257->216|257->216|257->216|266->225|266->225|266->225|276->235|276->235|276->235|282->241|282->241|282->241|288->247|288->247|288->247|297->256|297->256|297->256|306->265|306->265|306->265|315->274|315->274|315->274|324->283|324->283|324->283|333->292|333->292|333->292|342->301|342->301|342->301|363->322|363->322|364->323|367->326|367->326
                  -- GENERATED --
              */
          