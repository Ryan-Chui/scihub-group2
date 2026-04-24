
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

object signup extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[play.data.Form[models.User],String,List[Organization],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: play.data.Form[models.User], regPattern: String , organizations: List[Organization]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._

def /*4.2*/scripts/*4.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*4.13*/("""
    """),format.raw/*5.5*/("""<script type="text/javascript" src='"""),_display_(/*5.42*/routes/*5.48*/.Assets.at("javascripts/database_field_length.js")),format.raw/*5.98*/("""'></script>
    <script type="text/javascript" src='"""),_display_(/*6.42*/routes/*6.48*/.Assets.at("javascripts/field_validation_helper.js")),format.raw/*6.100*/("""'></script>
"""),format.raw/*7.88*/("""
    """),format.raw/*8.5*/("""<script type="text/javascript">
            var isEmailEmpty = true;
            var isEmailInvalid = true;
            // var isEmailAlreadyRegistered = true;
            var isEmailAlreadyRegistered = false;
            var isPasswordNotMatched = true;
            var isPasswordNotSecure = false;
            var isSQ1hasNoContent = false;
            var isSQ2hasNoContent = false;
            var isFirstNameEmpty = true;
            var isLastNameEmpty = true;

            var passwordNotSecureError = "Password must contain at least one special character, one uppercase, and one lowercase letter, and at least 8 or more characters <br/>";
            var passwordsDoNotMatchError = "Your password and confirmation password do not match. <br/>";
            var emailAlreadyRegisteredError = "Your email address has already been registered.<br/>";
            var emailEmptyError = "Field 'Email' must be filled in.<br/>";
            var firstNameEmptyError = "Field 'First Name' must be filled in.<br/>";
            var organizationEmptyError = "Field 'Organization' must be filled in.<br/>";
            var lastNameEmptyError = "Field 'Last Name' must be filled in.<br/>";
            var emailInvalidError = "Your email address must be valid.<br/>";

            var isResearcherChecked = false;
            var isStudentChecked = false;

            function checkFormValid() """),format.raw/*32.39*/("""{"""),format.raw/*32.40*/("""

                """),format.raw/*34.17*/("""var userTypes = 0;
                var userTypesChecked = false;
                for (var i = 0; i < document.getElementsByName("userTypes").length; i++) """),format.raw/*36.90*/("""{"""),format.raw/*36.91*/("""
                    """),format.raw/*37.21*/("""var userType = document.getElementsByName("userTypes")[i];
                    if (userType.checked) """),format.raw/*38.43*/("""{"""),format.raw/*38.44*/("""
                        """),format.raw/*39.25*/("""userTypes = parseInt(userType.value);
                        userTypesChecked = true;
                    """),format.raw/*41.21*/("""}"""),format.raw/*41.22*/("""
                """),format.raw/*42.17*/("""}"""),format.raw/*42.18*/("""
                """),format.raw/*43.17*/("""document.getElementById("hiddenUserType").value = userTypes;

                if (!userTypesChecked) """),format.raw/*45.40*/("""{"""),format.raw/*45.41*/("""
                    """),format.raw/*46.21*/("""var userTypeError = document.getElementById("userTypeError");
                    userTypeError.style.display = "block";
                    userTypeError.innerText = "Please select at least one user type.";
                    return false;
                """),format.raw/*50.17*/("""}"""),format.raw/*50.18*/(""" """),format.raw/*50.19*/("""else """),format.raw/*50.24*/("""{"""),format.raw/*50.25*/("""
                    """),format.raw/*51.21*/("""document.getElementById("userTypeError").style.display = "none";
                """),format.raw/*52.17*/("""}"""),format.raw/*52.18*/("""

                """),format.raw/*54.17*/("""if(isEmailAlreadyRegistered)"""),format.raw/*54.45*/("""{"""),format.raw/*54.46*/("""
                    """),format.raw/*55.21*/("""document.getElementById("warningMessage").innerText = "Your email address has already been registered.";
                    $("#warningModal").modal();
                    $("#warningModal").modal('open');
                    return false;
                """),format.raw/*59.17*/("""}"""),format.raw/*59.18*/("""

                """),format.raw/*61.17*/("""if(isPasswordNotMatched)"""),format.raw/*61.41*/("""{"""),format.raw/*61.42*/("""
                    """),format.raw/*62.21*/("""document.getElementById("warningMessage").innerText = "Your password and confirmation password do not match.";
                    $("#warningModal").modal();
                    $("#warningModal").modal('open');
                    return false;
                """),format.raw/*66.17*/("""}"""),format.raw/*66.18*/("""

                """),format.raw/*68.17*/("""return true;
            """),format.raw/*69.13*/("""}"""),format.raw/*69.14*/("""

            """),format.raw/*71.13*/("""function hiddenOrNot(userType) """),format.raw/*71.44*/("""{"""),format.raw/*71.45*/("""
                """),format.raw/*72.17*/("""var hiddenDiv = "divHidden" + userType;
                for (var i = 0; i < document.getElementsByName(hiddenDiv).length; i++) """),format.raw/*73.88*/("""{"""),format.raw/*73.89*/("""
                    """),format.raw/*74.21*/("""var div = document.getElementsByName(hiddenDiv)[i];
                    div.hidden = !div.hidden;
                """),format.raw/*76.17*/("""}"""),format.raw/*76.18*/("""
            """),format.raw/*77.13*/("""}"""),format.raw/*77.14*/("""

            """),format.raw/*79.13*/("""// the "other organization" field
            function otherOrganization() """),format.raw/*80.42*/("""{"""),format.raw/*80.43*/("""
                """),format.raw/*81.17*/("""var inputOtherOrganization = document.getElementById("organization");
                var selectedIndex = inputOtherOrganization.selectedIndex;
                var selectedValue = inputOtherOrganization.options[selectedIndex].value;
                document.getElementById("hiddenOrganization").hidden = !(selectedValue == "-1");
                document.getElementsByName("hiddenOrganization")[0].required = (selectedValue == "-1");
            """),format.raw/*86.13*/("""}"""),format.raw/*86.14*/("""

            """),format.raw/*88.13*/("""/**
             * This function checks the password entries are the same
             */
            function checkPwd() """),format.raw/*91.33*/("""{"""),format.raw/*91.34*/("""
                """),format.raw/*92.17*/("""var p1 = document.getElementById("password").value;
                var p2 = document.getElementById("repassword").value;
                if (p1 !== p2) """),format.raw/*94.32*/("""{"""),format.raw/*94.33*/("""
                    """),format.raw/*95.21*/("""isPasswordNotMatched = true;
                    document.getElementById("repasswordMsg").innerHTML = "Your password and confirmation password do not match."
                """),format.raw/*97.17*/("""}"""),format.raw/*97.18*/(""" """),format.raw/*97.19*/("""else """),format.raw/*97.24*/("""{"""),format.raw/*97.25*/("""
                    """),format.raw/*98.21*/("""isPasswordNotMatched = false;
                    document.getElementById("repasswordMsg").innerHTML = ""
                """),format.raw/*100.17*/("""}"""),format.raw/*100.18*/("""
            """),format.raw/*101.13*/("""}"""),format.raw/*101.14*/("""
            """),format.raw/*102.13*/("""/**
             * This function checks the email validity and sets
             * isEmailEmpty
             * isEmailInvalid
             * isEmailAlreadyRegistered
             */
            function checkValidEmail() """),format.raw/*108.40*/("""{"""),format.raw/*108.41*/("""
                """),format.raw/*109.17*/("""var email = document.getElementById("email").value;
                var obj = """),format.raw/*110.27*/("""{"""),format.raw/*110.28*/("""
                    """),format.raw/*111.21*/("""email: email
                """),format.raw/*112.17*/("""}"""),format.raw/*112.18*/(""";
                if(!email)"""),format.raw/*113.27*/("""{"""),format.raw/*113.28*/("""
                    """),format.raw/*114.21*/("""isEmailEmpty = true;
                """),format.raw/*115.17*/("""}"""),format.raw/*115.18*/(""" """),format.raw/*115.19*/("""else """),format.raw/*115.24*/("""{"""),format.raw/*115.25*/("""
                    """),format.raw/*116.21*/("""isEmailEmpty = false;
                    $.ajax("""),format.raw/*117.28*/("""{"""),format.raw/*117.29*/("""
                        """),format.raw/*118.25*/("""url: "/user/isEmailExisted",
                        data: JSON.stringify(obj),
                        headers: """),format.raw/*120.34*/("""{"""),format.raw/*120.35*/("""
                            """),format.raw/*121.29*/("""'Content-Type': 'application/json'
                        """),format.raw/*122.25*/("""}"""),format.raw/*122.26*/(""",
                        type: "POST",
                        success: function (data) """),format.raw/*124.50*/("""{"""),format.raw/*124.51*/("""
                            """),format.raw/*125.29*/("""console.log(data);
                            var response = data;
                            if (false || "error" in response) """),format.raw/*127.63*/("""{"""),format.raw/*127.64*/("""
                                """),format.raw/*128.33*/("""isEmailAlreadyRegistered = true;
                                document.getElementById("emailMsg").innerHTML = "Your email address has already been registered."
                            """),format.raw/*130.29*/("""}"""),format.raw/*130.30*/(""" """),format.raw/*130.31*/("""else """),format.raw/*130.36*/("""{"""),format.raw/*130.37*/("""
                                """),format.raw/*131.33*/("""isEmailAlreadyRegistered = false;
                                document.getElementById("emailMsg").innerHTML = ""
                            """),format.raw/*133.29*/("""}"""),format.raw/*133.30*/("""
                        """),format.raw/*134.25*/("""}"""),format.raw/*134.26*/("""
                    """),format.raw/*135.21*/("""}"""),format.raw/*135.22*/(""")
                """),format.raw/*136.17*/("""}"""),format.raw/*136.18*/("""
            """),format.raw/*137.13*/("""}"""),format.raw/*137.14*/("""
            """),format.raw/*138.13*/("""/**
             * If the password fails any of these rules
             * the function returns true:
             * at least one lowercase character
             * at least one uppercase character
             * at least 8 characters total
             * at least one special character
             * TODO: At early stage, allow simple password
             */
            function doesPasswordFailRules()"""),format.raw/*147.45*/("""{"""),format.raw/*147.46*/("""
                """),format.raw/*173.19*/("""
                """),format.raw/*174.17*/("""return false;
            """),format.raw/*175.13*/("""}"""),format.raw/*175.14*/("""

    """),format.raw/*177.5*/("""</script>
""")))};
Seq[Any](format.raw/*1.97*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*178.2*/("""

"""),_display_(/*180.2*/main("User Register/Signup", scripts)/*180.39*/ {_display_(Seq[Any](format.raw/*180.41*/("""
        """),format.raw/*181.9*/("""<div class="container">
            <div class="row">
                <div class="col s12 l10 offset-l1">
                    <div class="card-panel z-depth-0">
                        <h4 class="form-signin-heading center">Sign up to SMU-Sci-Hub</h4>
                        <form data-parsley-validate class="form-signin" onsubmit="return checkFormValid();" enctype="multipart/form-data" method="get" action=""""),_display_(/*186.161*/routes/*186.167*/.UserController.userRegisterPOST()),format.raw/*186.201*/("""">
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
                                    <input type="email" name="email" id="email" class="validate" required onchange="checkValidEmail()">
                                    <label for="email">Email Address*</label>
                                    <span id="emailValidationMsg" class="helper-text" data-error="Please enter a valid email address"  data-success="✓"></span>
                                    <span id="emailMsg" style="color: red"></span>
                                </div>
                            </div>
                            <div class="row">
                                <div class="input-field col s12 m6">
                                    """),format.raw/*214.120*/("""
                                    """),format.raw/*215.37*/("""<input type="password" name="password" id="password" class="validate" required onchange="checkPwd()">
                                    <label for="password">Password*</label>
                                    <span id="passwordMsg" class="helper-text" data-error="" data-success="✓"></span>
                                    """),format.raw/*218.73*/("""
                                    """),format.raw/*219.245*/("""
                                    """),format.raw/*220.62*/("""
                                    """),format.raw/*221.48*/("""
                                """),format.raw/*222.33*/("""</div>
                                <div class="input-field col s12 m6">
                                    """),format.raw/*224.145*/("""
                                    """),format.raw/*225.37*/("""<input type="password" name="repassword"   id="repassword" class="validate" required onchange="checkPwd()">
                                    <label for="repassword">Re-enter Password*</label>
                                    <span id="repasswordMsg" class="helper-text" data-error=""  data-success="✓" style="color: red"></span>
                                </div>
                            </div>

"""),format.raw/*231.50*/("""
"""),format.raw/*232.70*/("""
"""),format.raw/*233.124*/("""
"""),format.raw/*234.88*/("""
"""),format.raw/*235.109*/("""
"""),format.raw/*236.43*/("""
"""),format.raw/*237.39*/("""

                            """),format.raw/*239.29*/("""<div class="row">
                                <div class="input-field col s12">
                                    <select id="organization" name="organization" onchange="otherOrganization()" required>
                                        """),_display_(/*242.42*/for((org, idx) <- organizations.zipWithIndex) yield /*242.87*/ {_display_(Seq[Any](format.raw/*242.89*/("""
                                            """),format.raw/*243.45*/("""<option value=""""),_display_(/*243.61*/org/*243.64*/.getId()),format.raw/*243.72*/("""">"""),_display_(/*243.75*/org/*243.78*/.getOrganizationName()),format.raw/*243.100*/("""</option>
                                        """)))}),format.raw/*244.42*/("""
"""),format.raw/*245.160*/("""
"""),format.raw/*246.74*/("""
                                    """),format.raw/*247.37*/("""</select>
                                    <input type="text" name="organization" id="organization" class="validate">
                                    <label for="organization">Organization</label>
                                    <span id="organizationMsg" class="helper-text" data-error=""></span>
                                </div>
                            </div>

                            <div class="row" hidden="true" id="hiddenOrganization">
                                <div class="input-field col s12">
                                    <input type="text" name="hiddenOrganization" class="validate">
                                    <label for="hiddenOrganization">Other Organization*</label>
                                    <span id="hiddenOrganizationMsg" class="helper-text" data-error=""></span>
                                </div>
                            </div>

"""),format.raw/*262.50*/("""
"""),format.raw/*263.70*/("""
"""),format.raw/*264.119*/("""
"""),format.raw/*265.92*/("""
"""),format.raw/*266.111*/("""
"""),format.raw/*267.43*/("""
"""),format.raw/*268.39*/("""


"""),format.raw/*271.50*/("""
"""),format.raw/*272.70*/("""
"""),format.raw/*273.113*/("""
"""),format.raw/*274.85*/("""
"""),format.raw/*275.108*/("""
"""),format.raw/*276.43*/("""
"""),format.raw/*277.39*/("""
                            """),format.raw/*278.29*/("""<div class="row">
                                <div class="input-field col s12">
                                    <input type="text" name="mailingAddress" id="mailingAddress" class="validate">
                                    <label for="mailingAddress">Mailing Address</label>
                                    <span id="mailingAddressMsg" class="helper-text" data-error=""></span>
                                </div>
                            </div>
                            <div class="row">
                                <div class="input-field col s12">
                                    <input type="tel" name="phoneNumber" id="phoneNumber" class="validate" pattern="^(\+\d"""),format.raw/*287.123*/("""{"""),format.raw/*287.124*/("""1,2"""),format.raw/*287.127*/("""}"""),format.raw/*287.128*/("""\s)?\(?\d"""),format.raw/*287.137*/("""{"""),format.raw/*287.138*/("""3"""),format.raw/*287.139*/("""}"""),format.raw/*287.140*/("""\)?[\s.-]?\d"""),format.raw/*287.152*/("""{"""),format.raw/*287.153*/("""3"""),format.raw/*287.154*/("""}"""),format.raw/*287.155*/("""[\s.-]?\d"""),format.raw/*287.164*/("""{"""),format.raw/*287.165*/("""4"""),format.raw/*287.166*/("""}"""),format.raw/*287.167*/("""$">
                                    <label for="phoneNumber">Phone Number</label>
                                    <span id="phoneNumberMsg" class="helper-text" data-error="Please enter a valid phone number" data-success="✓"></span>
                                </div>
                            </div>
"""),format.raw/*292.50*/("""
"""),format.raw/*293.70*/("""
"""),format.raw/*294.117*/("""
"""),format.raw/*295.90*/("""
"""),format.raw/*296.110*/("""
"""),format.raw/*297.43*/("""
"""),format.raw/*298.39*/("""

                            """),format.raw/*300.29*/("""<div class="row">
                                <div class="input-field col s12">
                                    <input type="url" name="homepage" id="homepage" class="validate">
                                    <label for="homepage">URL</label>
                                    <span id="urlMsg" class="helper-text" data-error="Please enter a valid URL, start from http:// or https://" data-success="✓"></span>
                                </div>
                            </div>

                            <div class="row">
                                <fieldset>
                                    <legend>Sign up as*</legend>
                                <div class="col s12 m4">
                                    <label>
                                        <input type="radio" name="userTypes" id="userType1" value="1" onchange='hiddenOrNot("Researcher")'>
                                        <span>Researcher/Professor</span>
                                    </label>
                                </div>
                                <div class="col s12 m4">
                                    <label><input type="radio" name="userTypes" id="userType2" value="2"><span>Sponsor</span></label>
                                </div>
                                <div class="col s12 m4">
                                    <label><input type="radio" name="userTypes" id="userType4" value="4" onchange='hiddenOrNot("Student")'><span>Student</span></label>
                                </div>
                                </fieldset>
                                <span id="userTypeError" style="color: red; display: none;">Please select at least one user type.</span>
                            </div>
                            <div class="row" hidden="true">
                                <div class="input-field col s12">
                                    <input type="text" name="hiddenUserType" id="hiddenUserType">
                                </div>
                            </div>

"""),format.raw/*332.50*/("""
"""),format.raw/*333.44*/("""
"""),format.raw/*334.135*/("""
"""),format.raw/*335.72*/("""
"""),format.raw/*336.45*/("""
"""),format.raw/*337.39*/("""

                            """),format.raw/*339.29*/("""<div class="row" hidden="true" name="divHiddenResearcher">
                                <div class="input-field col s12">
                                    <input type="text" name="highestDegree" id="highestDegree" class="validate">
                                    <label for="highestDegree">Highest Degree</label>
                                    <span id="highestDegreeMsg" class="helper-text" data-error=""></span>
                                </div>
                            </div>

                            <div class="row" hidden="true" name="divHiddenResearcher">
                                <div class="input-field col s12">
                                    <input type="text" name="orcid" id="orcid" class="validate">
                                    <label for="orcid">ORC ID</label>
                                    <span id="orcidMsg" class="helper-text" data-error=""></span>
                                </div>
                            </div>

                            <div class="row" hidden="true" name="divHiddenResearcher">
                                <div class="input-field col s12">
                                    <input type="text" name="researchFields" id="researchFields" class="validate">
                                    <label for="researchFields">Research Fields</label>
                                    <span id="researchFieldsMsg" class="helper-text" data-error=""></span>
                                </div>
                            </div>

                            <div class="row" hidden="true" name="divHiddenResearcher">
                                <div class="input-field col s12">
                                    <input type="text" name="school" id="school" class="validate">
                                    <label for="school">School</label>
                                    <span id="schoolMsg" class="helper-text" data-error=""></span>
                                </div>
                            </div>

                            <div class="row" hidden="true" name="divHiddenResearcher">
                                <div class="input-field col s12">
                                    <input type="text" name="department" id="department" class="validate">
                                    <label for="department">Department</label>
                                    <span id="departmentMsg" class="helper-text" data-error=""></span>
                                </div>
                            </div>

                            <div class="row" hidden="true" name="divHiddenStudent">
                                <div class="input-field col s12">
                                    <input type="text" name="studentIdNumber" id="studentIdNumber" class="validate">
                                    <label for="studentIdNumber">ID #</label>
                                    <span id="studentIdNumberMsg" class="helper-text" data-error=""></span>
                                </div>
                            </div>

                            <div class="row" hidden="true" name="divHiddenStudent">
                                <div class="input-field col s12">
                                    <select id="studentType" name="studentType">
                                        <option value="Undergraduate">Undergraduate</option>
                                        <option value="Master">Master</option>
                                        <option value="Ph.D.">Ph.D.</option>
                                        <option value="Other">Other</option>
                                    </select>
                                    <label for="studentType">Type</label>
                                    <span id="studentTypeMsg" class="helper-text" data-error=""></span>
                                </div>
                            </div>

                            <div class="row" hidden="true" name="divHiddenStudent">
                                <div class="input-field col s12">
                                    <select id="studentYear" name="studentYear">
                                        <option value="First">First year</option>
                                        <option value="Second">Second year</option>
                                        <option value="Third">Third year</option>
                                        <option value="Forth">Forth year</option>
                                        <option value="Fifth">Fifth year</option>
                                        <option value="Other">Other</option>
                                    </select>
                                    <label for="studentYear">Current academic year</label>
                                    <span id="studentYearNumberMsg" class="helper-text" data-error=""></span>
                                </div>
                            </div>

                            <div class="row" hidden="true" name="divHiddenStudent">
                                <div class="input-field col s12">
                                    <input type="text" name="studentMajor" id="studentMajor" class="validate">
                                    <label for="studentMajor">Major</label>
                                    <span id="studentMajorMsg" class="helper-text" data-error=""></span>
                                </div>
                            </div>

                            <div class="row" hidden="true" name="divHiddenStudent">
                                <div class="input-field col s12">
                                    <input type="date" name="studentEnrollDate" id="studentEnrollDate" class="validate">
                                    <label for="studentEnrollDate">First Enrollment Date</label>
                                    <span id="studentEnrollDateMsg" class="helper-text" data-error=""></span>
                                </div>
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
                                    <a href=""""),_display_(/*441.47*/routes/*441.53*/.Application.home()),format.raw/*441.72*/("""" class="btn waves-effect waves-light red darken-2">Cancel</a>
                                    <div class="helper-text red-text" id="submitErrorMsg"></div>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    <script >
            var requiredFieldList = ["firstName", "lastName", "email", "password", "repassword", "organization"];
            var notRequiredFieldList = ["middleInitial", "researchFields", "mailingAddress", "highestDegree", "phoneNumber"];
            setPattern(requiredFieldList, notRequiredFieldList, 'user');
    </script>
""")))}))
      }
    }
  }

  def render(userForm:play.data.Form[models.User],regPattern:String,organizations:List[Organization]): play.twirl.api.HtmlFormat.Appendable = apply(userForm,regPattern,organizations)

  def f:((play.data.Form[models.User],String,List[Organization]) => play.twirl.api.HtmlFormat.Appendable) = (userForm,regPattern,organizations) => apply(userForm,regPattern,organizations)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:36 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/signup.scala.html
                  HASH: 659952bffe50fedd73b79179e089fc34ed847e71
                  MATRIX: 1159->1|1327->98|1355->116|1369->123|1449->127|1480->132|1543->169|1557->175|1627->225|1706->278|1720->284|1793->336|1832->435|1863->440|3281->1830|3310->1831|3356->1849|3538->2003|3567->2004|3616->2025|3745->2126|3774->2127|3827->2152|3962->2259|3991->2260|4036->2277|4065->2278|4110->2295|4239->2396|4268->2397|4317->2418|4603->2676|4632->2677|4661->2678|4694->2683|4723->2684|4772->2705|4881->2786|4910->2787|4956->2805|5012->2833|5041->2834|5090->2855|5375->3112|5404->3113|5450->3131|5502->3155|5531->3156|5580->3177|5871->3440|5900->3441|5946->3459|5999->3484|6028->3485|6070->3499|6129->3530|6158->3531|6203->3548|6358->3675|6387->3676|6436->3697|6578->3811|6607->3812|6648->3825|6677->3826|6719->3840|6822->3915|6851->3916|6896->3933|7370->4379|7399->4380|7441->4394|7591->4516|7620->4517|7665->4534|7846->4687|7875->4688|7924->4709|8126->4883|8155->4884|8184->4885|8217->4890|8246->4891|8295->4912|8446->5034|8476->5035|8518->5048|8548->5049|8590->5062|8840->5283|8870->5284|8916->5301|9023->5379|9053->5380|9103->5401|9161->5430|9191->5431|9248->5459|9278->5460|9328->5481|9394->5518|9424->5519|9454->5520|9488->5525|9518->5526|9568->5547|9646->5596|9676->5597|9730->5622|9872->5735|9902->5736|9960->5765|10048->5824|10078->5825|10196->5914|10226->5915|10284->5944|10443->6074|10473->6075|10535->6108|10755->6299|10785->6300|10815->6301|10849->6306|10879->6307|10941->6340|11115->6485|11145->6486|11199->6511|11229->6512|11279->6533|11309->6534|11356->6552|11386->6553|11428->6566|11458->6567|11500->6580|11935->6986|11965->6987|12011->7894|12057->7911|12112->7937|12142->7938|12176->7944|12226->96|12253->114|12282->7955|12312->7958|12359->7995|12400->7997|12437->8006|12878->8418|12895->8424|12952->8458|15071->10630|15137->10667|15498->11035|15565->11280|15631->11342|15697->11390|15759->11423|15901->11643|15967->11680|16406->12139|16436->12209|16467->12333|16497->12421|16528->12530|16558->12573|16588->12612|16647->12642|16923->12890|16985->12935|17026->12937|17100->12982|17144->12998|17157->13001|17187->13009|17218->13012|17231->13015|17276->13037|17359->13088|17390->13248|17420->13322|17486->13359|18430->14323|18460->14393|18491->14512|18521->14604|18552->14715|18582->14758|18612->14797|18644->14849|18674->14919|18705->15032|18735->15117|18766->15225|18796->15268|18826->15307|18884->15336|19616->16038|19647->16039|19680->16042|19711->16043|19750->16052|19781->16053|19812->16054|19843->16055|19885->16067|19916->16068|19947->16069|19978->16070|20017->16079|20048->16080|20079->16081|20110->16082|20453->16445|20483->16515|20514->16632|20544->16722|20575->16832|20605->16875|20635->16914|20694->16944|22785->19055|22815->19099|22846->19234|22876->19306|22906->19351|22936->19390|22995->19420|29815->26212|29831->26218|29872->26237
                  LINES: 35->1|38->2|40->4|40->4|42->4|43->5|43->5|43->5|43->5|44->6|44->6|44->6|45->7|46->8|70->32|70->32|72->34|74->36|74->36|75->37|76->38|76->38|77->39|79->41|79->41|80->42|80->42|81->43|83->45|83->45|84->46|88->50|88->50|88->50|88->50|88->50|89->51|90->52|90->52|92->54|92->54|92->54|93->55|97->59|97->59|99->61|99->61|99->61|100->62|104->66|104->66|106->68|107->69|107->69|109->71|109->71|109->71|110->72|111->73|111->73|112->74|114->76|114->76|115->77|115->77|117->79|118->80|118->80|119->81|124->86|124->86|126->88|129->91|129->91|130->92|132->94|132->94|133->95|135->97|135->97|135->97|135->97|135->97|136->98|138->100|138->100|139->101|139->101|140->102|146->108|146->108|147->109|148->110|148->110|149->111|150->112|150->112|151->113|151->113|152->114|153->115|153->115|153->115|153->115|153->115|154->116|155->117|155->117|156->118|158->120|158->120|159->121|160->122|160->122|162->124|162->124|163->125|165->127|165->127|166->128|168->130|168->130|168->130|168->130|168->130|169->131|171->133|171->133|172->134|172->134|173->135|173->135|174->136|174->136|175->137|175->137|176->138|185->147|185->147|186->173|187->174|188->175|188->175|190->177|192->1|193->3|194->178|196->180|196->180|196->180|197->181|202->186|202->186|202->186|230->214|231->215|234->218|235->219|236->220|237->221|238->222|240->224|241->225|247->231|248->232|249->233|250->234|251->235|252->236|253->237|255->239|258->242|258->242|258->242|259->243|259->243|259->243|259->243|259->243|259->243|259->243|260->244|261->245|262->246|263->247|278->262|279->263|280->264|281->265|282->266|283->267|284->268|287->271|288->272|289->273|290->274|291->275|292->276|293->277|294->278|303->287|303->287|303->287|303->287|303->287|303->287|303->287|303->287|303->287|303->287|303->287|303->287|303->287|303->287|303->287|303->287|308->292|309->293|310->294|311->295|312->296|313->297|314->298|316->300|348->332|349->333|350->334|351->335|352->336|353->337|355->339|457->441|457->441|457->441
                  -- GENERATED --
              */
          