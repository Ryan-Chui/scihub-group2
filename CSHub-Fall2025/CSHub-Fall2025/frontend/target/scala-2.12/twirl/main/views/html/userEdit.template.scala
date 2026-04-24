
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

object userEdit extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[String,play.data.Form[models.User],User,List[Organization],ResearcherInfo,StudentInfo,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: String, userForm: play.data.Form[models.User], user: User, organizations: List[Organization], researcherInfo: ResearcherInfo, studentInfo: StudentInfo):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.6*/import helper._

def /*3.6*/scripts/*3.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.17*/("""
        """),format.raw/*4.9*/("""<script type="text/javascript" src='"""),_display_(/*4.46*/routes/*4.52*/.Assets.at("javascripts/database_field_length.js")),format.raw/*4.102*/("""'></script>
        <script type="text/javascript" src='"""),_display_(/*5.46*/routes/*5.52*/.Assets.at("javascripts/field_validation_helper.js")),format.raw/*5.104*/("""'></script>
        <script type="text/javascript">
                var projectList = [];
                $(document).ready(function () """),format.raw/*8.47*/("""{"""),format.raw/*8.48*/("""
                    """),format.raw/*9.21*/("""/**
                     * This portion defines all the (non)required fields that need validation on max lengths and special
                     * characters, as well as URL validity.
                     */
                    validateField("firstName", "firstNameMsg", "varChar255", true);
                    validateField("lastName", "lastNameMsg", "varChar255", true);
                    validateField("middleInitial", "middleInitialMsg", "varChar255", false);
                    validateField("researchFields", "researchFieldsMsg", "varChar255", false);
                    validateField("organization", "organizationMsg", "varChar255", false);
                    validateField("mailingAddress", "mailingAddressMsg", "varChar255", false);
                    // validateField("highestDegree", "highestDegreeMsg", "varChar255", false);
                    validateField("phoneNumber", "phoneNumberMsg", "varChar20", false);
                    /****************************** End of Validation Portion ******************************************/

                    // $.get("/project/getProjects", function (res) """),format.raw/*23.69*/("""{"""),format.raw/*23.70*/("""
                    """),format.raw/*24.21*/("""//     projectList = res;
                    //     var availableObj = """),format.raw/*25.47*/("""{"""),format.raw/*25.48*/("""}"""),format.raw/*25.49*/(""";
                    //     for (var i = 0; i < projectList.length; i++) """),format.raw/*26.73*/("""{"""),format.raw/*26.74*/("""
                    """),format.raw/*27.21*/("""//         availableObj[projectList[i]['text']] = null;
                    //     """),format.raw/*28.28*/("""}"""),format.raw/*28.29*/("""
                    """),format.raw/*29.21*/("""//     $('#projectName').autocomplete("""),format.raw/*29.59*/("""{"""),format.raw/*29.60*/("""
                    """),format.raw/*30.21*/("""//         data: availableObj
                    //     """),format.raw/*31.28*/("""}"""),format.raw/*31.29*/(""");
                    // """),format.raw/*32.24*/("""}"""),format.raw/*32.25*/(""");
                """),format.raw/*33.17*/("""}"""),format.raw/*33.18*/(""");

                /**
                 * This method triggers the user image change
                 */
                function updateImg() """),format.raw/*38.38*/("""{"""),format.raw/*38.39*/("""
                    """),format.raw/*39.21*/("""document.getElementById("Img").click();
                """),format.raw/*40.17*/("""}"""),format.raw/*40.18*/("""

                """),format.raw/*42.17*/("""/**
                 * This method previews the selected image for update
                 */
                function changepic() """),format.raw/*45.38*/("""{"""),format.raw/*45.39*/("""
                    """),format.raw/*46.21*/("""if (document.getElementById("Img").value == "") return;
                    var reads = new FileReader();
                    f = document.getElementById("Img").files[0];
                    reads.readAsDataURL(f);
                    reads.onload = function (e) """),format.raw/*50.49*/("""{"""),format.raw/*50.50*/("""
                        """),format.raw/*51.25*/("""document.getElementById('showImg').src = this.result;
                        $('#record').val("update");
                        $('#previewMsg').text("This is the preview image. You need to click \"SAVE\" button below if you want to save the changes.");

                    """),format.raw/*55.21*/("""}"""),format.raw/*55.22*/(""";
                """),format.raw/*56.17*/("""}"""),format.raw/*56.18*/("""

                """),format.raw/*58.17*/("""/**
                 * This method deletes the image and provides the default image for user
                 */
                function deleteImg() """),format.raw/*61.38*/("""{"""),format.raw/*61.39*/("""
                    """),format.raw/*62.21*/("""url = "../../../../assets/images/user.png";
                    document.getElementById('showImg').src = url;
                    $('#record').val("delete");
                    $('#previewMsg').text("This is the default image. You need to click \"UPDATE\" button below if you want to save the changes.");
                """),format.raw/*66.17*/("""}"""),format.raw/*66.18*/("""

                """),format.raw/*68.17*/("""function otherOrganization() """),format.raw/*68.46*/("""{"""),format.raw/*68.47*/("""
                    """),format.raw/*69.21*/("""var inputOtherOrganization = document.getElementById("organization");
                    var selectedIndex = inputOtherOrganization.selectedIndex;
                    var selectedValue = inputOtherOrganization.options[selectedIndex].value;
                    document.getElementById("hiddenOrganization").hidden = !(selectedValue == "-1");
                    document.getElementsByName("hiddenOrganization")[0].required = (selectedValue == "-1");
                """),format.raw/*74.17*/("""}"""),format.raw/*74.18*/("""

                """),format.raw/*76.17*/("""/**
                 * This method parses and sets up default project based on input.
                 * If not set or opennex typed, the project is set to OpenNEX. Otherwise check the name.
                 */
                function projectValidation() """),format.raw/*80.46*/("""{"""),format.raw/*80.47*/("""
                    """),format.raw/*81.21*/("""if ($("#projectName").val() == "") """),format.raw/*81.56*/("""{"""),format.raw/*81.57*/("""
                        """),format.raw/*82.25*/("""document.getElementById("project-msg").innerHTML = "";
                        document.getElementById("projectName").value = "OpenNEX";
                        document.getElementById("projectId").value = "0";
                        if ($('#msg').text() == "" && $('#homepage-msg').text() == "") """),format.raw/*85.88*/("""{"""),format.raw/*85.89*/("""
                            """),format.raw/*86.29*/("""document.getElementById("Save").disabled = false;
                        """),format.raw/*87.25*/("""}"""),format.raw/*87.26*/("""
                        """),format.raw/*88.25*/("""return;
                    """),format.raw/*89.21*/("""}"""),format.raw/*89.22*/("""
                    """),format.raw/*90.21*/("""var project = $("#projectName").val();
                    var pid = 0;
                    if (project.toLowerCase() === "opennex") """),format.raw/*92.62*/("""{"""),format.raw/*92.63*/("""
                        """),format.raw/*93.25*/("""document.getElementById("projectId").value = "0";
                        document.getElementById("project-msg").innerHTML = "";
                        if ($('#msg').text() == "" && $('#homepage-msg').text() == "") """),format.raw/*95.88*/("""{"""),format.raw/*95.89*/("""
                            """),format.raw/*96.29*/("""document.getElementById("Save").disabled = false;
                        """),format.raw/*97.25*/("""}"""),format.raw/*97.26*/("""
                    """),format.raw/*98.21*/("""}"""),format.raw/*98.22*/(""" """),format.raw/*98.23*/("""else """),format.raw/*98.28*/("""{"""),format.raw/*98.29*/("""
                        """),format.raw/*99.25*/("""found = false;
                        for (var i = 0; i < projectList.length; i++) """),format.raw/*100.70*/("""{"""),format.raw/*100.71*/("""
                            """),format.raw/*101.29*/("""if (projectList[i]['text'].toLowerCase().trim() === project.toLowerCase().trim()) """),format.raw/*101.111*/("""{"""),format.raw/*101.112*/("""
                                """),format.raw/*102.33*/("""found = true;
                                document.getElementById("projectId").value = projectList[i]['id'];
                                break;
                            """),format.raw/*105.29*/("""}"""),format.raw/*105.30*/("""
                        """),format.raw/*106.25*/("""}"""),format.raw/*106.26*/("""
                        """),format.raw/*107.25*/("""if (!found) """),format.raw/*107.37*/("""{"""),format.raw/*107.38*/("""
                            """),format.raw/*108.29*/("""document.getElementById("project-msg").innerHTML = "Project does not exist";
                            document.getElementById("Save").disabled = true;
                        """),format.raw/*110.25*/("""}"""),format.raw/*110.26*/(""" """),format.raw/*110.27*/("""else """),format.raw/*110.32*/("""{"""),format.raw/*110.33*/("""
                            """),format.raw/*111.29*/("""document.getElementById("project-msg").innerHTML = "";
                            if ($('#msg').text() == "" && $('#homepage-msg').text() == "") """),format.raw/*112.92*/("""{"""),format.raw/*112.93*/("""
                                """),format.raw/*113.33*/("""document.getElementById("Save").disabled = false;
                            """),format.raw/*114.29*/("""}"""),format.raw/*114.30*/("""
                        """),format.raw/*115.25*/("""}"""),format.raw/*115.26*/("""
                    """),format.raw/*116.21*/("""}"""),format.raw/*116.22*/("""

                """),format.raw/*118.17*/("""}"""),format.raw/*118.18*/("""

                """),format.raw/*120.17*/("""function checkFileSizeBeforeSubmit() """),format.raw/*120.54*/("""{"""),format.raw/*120.55*/("""
                    """),format.raw/*121.21*/("""var fileInput = document.getElementById("Img");
                    if (!fileInput.value) """),format.raw/*122.43*/("""{"""),format.raw/*122.44*/("""
                        """),format.raw/*123.25*/("""return true;
                    """),format.raw/*124.21*/("""}"""),format.raw/*124.22*/("""
                    """),format.raw/*125.21*/("""var file = fileInput.files[0];
                    if (file && file.size > 3 * 1024 * 1024) """),format.raw/*126.62*/("""{"""),format.raw/*126.63*/("""
                        """),format.raw/*127.25*/("""alert("The image size cannot exceed 3MB, please reselect.");
                        return false;
                    """),format.raw/*129.21*/("""}"""),format.raw/*129.22*/("""
                    """),format.raw/*130.21*/("""return true;
                """),format.raw/*131.17*/("""}"""),format.raw/*131.18*/("""
        """),format.raw/*132.9*/("""</script>
    """)))};
Seq[Any](format.raw/*1.158*/("""
    """),format.raw/*3.1*/("""    """),format.raw/*133.6*/("""

"""),_display_(/*135.2*/main("Account Management", scripts)/*135.37*/ {_display_(Seq[Any](format.raw/*135.39*/("""
    """),format.raw/*136.5*/("""<div class="container row">
        <div class="col s12">
            <div class="card-panel">
                <form class="form-signin" id="update" enctype="multipart/form-data" method="post" action=""""),_display_(/*139.108*/routes/*139.114*/.UserController.userEditPOST()),format.raw/*139.144*/("""" onsubmit="return checkFileSizeBeforeSubmit()">
                    <h4 class="form-signin-heading" align="center">Edit Your Profile</h4>
                    <div class="row">
                        <div class="col s8">
                            <h6 class="col s6" align="left">Immutable</h6>
                            <div class="col s12">
                                <table class="striped responsive-table">
                                    <tbody>
                                        <tr>
                                            <th>User ID</th>
                                            <td>"""),_display_(/*149.50*/user/*149.54*/.getId),format.raw/*149.60*/("""</td>
                                        </tr>
                                        <tr>
                                            <th>User Email Address</th>
                                            <td>"""),_display_(/*153.50*/user/*153.54*/.getEmail),format.raw/*153.63*/("""</td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                        <div class="col center s3">
                            <tr>
                                <th>Picture:</th>
                                <td>
                                    <img class="circle" id="showImg" src=""""),_display_(/*163.76*/routes/*163.82*/.Application.getImageFromPath(user.getAvatar())),format.raw/*163.129*/("""" width="360" height="360" style="border-width: 1px;
                                        border-style: solid;
                                        border-radius: 50%;
                                        height: auto;
                                        width: 70%;">
                                    <div id="previewMsg" style="color: blue"></div>
                                    <br>
                                    <div>
                                        <a class="btn-floating waves-effect waves-light blue darken-2" title="Update Image" href="javascript:void(0)" onclick="updateImg("""),_display_(/*171.171*/user/*171.175*/.getId),format.raw/*171.181*/(""")"><i class="material-icons">
                                            edit</i><input type="file" id="Img" name="avatar" style="display: none;" accept=".jpeg,.png,.jpg" onchange="changepic(this)"/></a>  &nbsp;
"""),format.raw/*173.218*/("""
"""),format.raw/*174.63*/("""
                                        """),format.raw/*175.41*/("""<input id="record" name = "record" style="display: none;"/>
                                    </div>
                                </td>
                            </tr>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col s12">
                            <h6 class="col s12" align="left">Editable</h6>
                            <div class="row">
                                <div class="input-field col s12 m4 l4">
                                    <input id="firstName" type="text" class="validate" name="firstName"
                                    onkeypress="return (event.charCode > 64 && event.charCode < 91) || (event.charCode > 96 && event.charCode < 123) || event.charCode === 32" onpaste="return false" value=""""),_display_(/*187.207*/user/*187.211*/.getFirstName),format.raw/*187.224*/("""" required>
                                    <label for="firstName">First Name* </label>
                                    <span id="firstNameMsg" class="helper-text" data-error=""></span>
                                </div>
                                <div class="input-field col s12 m4 l4">
                                    <input id="middleInitial" type="text" class="validate" name="middleInitial"
                                    onkeypress="return (event.charCode > 64 && event.charCode < 91) || (event.charCode > 96 && event.charCode < 123) || event.charCode === 32" onpaste="return false" value=""""),_display_(/*193.207*/if(user.getMiddleInitial!="null")/*193.240*/ {_display_(_display_(/*193.243*/user/*193.247*/.getMiddleInitial))}),format.raw/*193.265*/("""">
                                    <label for="middleInitial">Middle Name</label>
                                    <span id="middleInitialMsg" class="helper-text" data-error=""></span>
                                </div>
                                <div class="input-field col s12 m4 l4">
                                    <input id="lastName" type="text" class="validate" name="lastName"
                                    onkeypress="return (event.charCode > 64 && event.charCode < 91) || (event.charCode > 96 && event.charCode < 123) || event.charCode === 32" onpaste="return false" value=""""),_display_(/*199.207*/user/*199.211*/.getLastName),format.raw/*199.223*/("""" required>
                                    <label for="lastName">Last Name*</label>
                                    <span id="lastNameMsg" class="helper-text" data-error=""></span>
                                </div>
                            </div>
"""),format.raw/*204.50*/("""
"""),format.raw/*205.70*/("""
"""),format.raw/*206.113*/("""
"""),format.raw/*207.205*/("""
"""),format.raw/*208.49*/("""
"""),format.raw/*209.179*/("""
"""),format.raw/*210.42*/("""
"""),format.raw/*211.62*/("""
"""),format.raw/*212.298*/("""
"""),format.raw/*213.61*/("""
"""),format.raw/*214.108*/("""
"""),format.raw/*215.97*/("""
"""),format.raw/*216.43*/("""
"""),format.raw/*217.39*/("""
"""),format.raw/*218.50*/("""
"""),format.raw/*219.70*/("""
"""),format.raw/*220.181*/("""
"""),format.raw/*221.87*/("""
"""),format.raw/*222.109*/("""
"""),format.raw/*223.43*/("""
                            """),format.raw/*224.29*/("""<div class="row">
                                <div class="input-field col s12">
                                    <select id="organization" name="organization" onchange="otherOrganization()" required>
                                        """),_display_(/*227.42*/for((org, idx) <- organizations.zipWithIndex) yield /*227.87*/ {_display_(Seq[Any](format.raw/*227.89*/("""
                                            """),format.raw/*228.45*/("""<option value=""""),_display_(/*228.61*/org/*228.64*/.getId()),format.raw/*228.72*/("""">"""),_display_(/*228.75*/org/*228.78*/.getOrganizationName()),format.raw/*228.100*/("""</option>
                                        """)))}),format.raw/*229.42*/("""
                                        """),format.raw/*230.200*/("""
                                        """),format.raw/*231.114*/("""
                                    """),format.raw/*232.37*/("""</select>
                                    """),format.raw/*233.151*/("""
                                    """),format.raw/*234.37*/("""<label for="organization">Organization</label>
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

"""),format.raw/*247.39*/("""
"""),format.raw/*248.50*/("""
"""),format.raw/*249.70*/("""
"""),format.raw/*250.153*/("""
"""),format.raw/*251.73*/("""
"""),format.raw/*252.102*/("""
"""),format.raw/*253.43*/("""
"""),format.raw/*254.39*/("""
                            """),format.raw/*255.29*/("""<div class="row">
                                <div class="input-field col s12">
                                    <input type="text" name="homepage" id="homepage" class="validate" value='"""),_display_(/*257.111*/if(user.getHomepage != "null")/*257.141*/ {_display_(_display_(/*257.144*/user/*257.148*/.getHomepage))}),format.raw/*257.161*/("""'>
                                    <label for="homepage">Personal Website URL</label>
                                    <span id="urlMsg" class="helper-text" data-error=""></span>
                                </div>
                            </div>
                            """),format.raw/*270.37*/("""
                            """),format.raw/*271.29*/("""<div class="row">
                                <div class="input-field col s12">
                                    <input type="text" name="mailingAddress" id="mailingAddress" class="validate" value='"""),_display_(/*273.123*/if(user.getMailingAddress!="null")/*273.157*/ {_display_(_display_(/*273.160*/user/*273.164*/.getMailingAddress))}),format.raw/*273.183*/("""'>
                                    <label for="mailingAddress">Mailing Address</label>
                                    <span id="mailingAddressMsg" class="helper-text" data-error=""></span>
                                </div>
                            </div>
                            <div class="row">
                                <div class="input-field col s12">
                                    <input type="text" name="phoneNumber" id="phoneNumber" class="validate" value='"""),_display_(/*280.117*/if(user.getPhoneNumber!="null")/*280.148*/ {_display_(_display_(/*280.151*/user/*280.155*/.getPhoneNumber))}),format.raw/*280.171*/("""'>
                                    <label for="phoneNumber">Phone Number</label>
                                    <span id="phoneNumberMsg" class="helper-text" data-error=""></span>
                                </div>
                            </div>

                            """),_display_(/*286.30*/if(user.getUserType() == 1)/*286.57*/ {_display_(Seq[Any](format.raw/*286.59*/("""
                                """),format.raw/*287.33*/("""<div class="row">
                                    <div class="input-field col s12">
                                        <input type="text" name="highestDegree" id="highestDegree" class="validate"
                                        value='"""),_display_(/*290.49*/if(researcherInfo != null && researcherInfo.getHighestDegree() != "null")/*290.122*/ {_display_(Seq[Any](format.raw/*290.124*/(""" """),_display_(/*290.126*/researcherInfo/*290.140*/.getHighestDegree()),format.raw/*290.159*/(""" """)))}),format.raw/*290.161*/("""'>
                                        <label for="highestDegree">Highest Degree</label>
                                        <span id="highestDegreeMsg" class="helper-text" data-error=""></span>
                                    </div>
                                    <div class="input-field col s12">
                                        <input type="text" name="orcid" id="orcid" class="validate"
                                        value='"""),_display_(/*296.49*/if(researcherInfo != null && researcherInfo.getOrcid() != "null")/*296.114*/ {_display_(Seq[Any](format.raw/*296.116*/(""" """),_display_(/*296.118*/researcherInfo/*296.132*/.getOrcid()),format.raw/*296.143*/(""" """)))}),format.raw/*296.145*/("""'>
                                        <label for="orcid">ORCID</label>
                                        <span id="orcidMsg" class="helper-text" data-error=""></span>
                                    </div>
                                    <div class="input-field col s12">
                                        <input type="text" name="researchFields" id="researchFields" class="validate"
                                        value='"""),_display_(/*302.49*/if(researcherInfo != null && researcherInfo.getResearchFields() != "null")/*302.123*/ {_display_(Seq[Any](format.raw/*302.125*/(""" """),_display_(/*302.127*/researcherInfo/*302.141*/.getResearchFields()),format.raw/*302.161*/(""" """)))}),format.raw/*302.163*/("""'>
                                        <label for="researchFields">Research Fields</label>
                                        <span id="researchFieldsMsg" class="helper-text" data-error=""></span>
                                    </div>
                                    <div class="input-field col s12">
                                        <input type="text" name="school" id="school" class="validate"
                                        value='"""),_display_(/*308.49*/if(researcherInfo != null && researcherInfo.getSchool() != "null")/*308.115*/ {_display_(Seq[Any](format.raw/*308.117*/(""" """),_display_(/*308.119*/researcherInfo/*308.133*/.getSchool()),format.raw/*308.145*/(""" """)))}),format.raw/*308.147*/("""'>
                                        <label for="school">School</label>
                                        <span id="schoolMsg" class="helper-text" data-error=""></span>
                                    </div>
                                    <div class="input-field col s12">
                                        <input type="text" name="department" id="department" class="validate"
                                        value='"""),_display_(/*314.49*/if(researcherInfo != null && researcherInfo.getDepartment() != "null")/*314.119*/ {_display_(Seq[Any](format.raw/*314.121*/(""" """),_display_(/*314.123*/researcherInfo/*314.137*/.getDepartment()),format.raw/*314.153*/(""" """)))}),format.raw/*314.155*/("""'>
                                        <label for="department">Department</label>
                                        <span id="departmentMsg" class="helper-text" data-error=""></span>
                                    </div>
                                </div>
                            """)))}),format.raw/*319.30*/("""

                            """),_display_(/*321.30*/if(user.getUserType() == 4)/*321.57*/ {_display_(Seq[Any](format.raw/*321.59*/("""
                                """),format.raw/*322.33*/("""<div class="row">
                                    <div class="input-field col s12">
                                        <input type="text" name="studentIdNumber" id="studentIdNumber" class="validate"
                                        value='"""),_display_(/*325.49*/if(studentInfo != null && studentInfo.getIdNumber() != "null")/*325.111*/ {_display_(Seq[Any](format.raw/*325.113*/(""" """),_display_(/*325.115*/studentInfo/*325.126*/.getIdNumber()),format.raw/*325.140*/(""" """)))}),format.raw/*325.142*/("""'>
                                        <label for="studentIdNumber">ID #</label>
                                        <span id="studentIdNumberMsg" class="helper-text" data-error=""></span>
                                    </div>
                                    <div class="input-field col s12">
                                        <select id="studentType" name="studentType">
                                            <option value="Undergraduate" """),_display_(/*331.76*/if(studentInfo != null && studentInfo.getStudentType() == "Undergraduate")/*331.150*/ {_display_(Seq[Any](format.raw/*331.152*/(""" """),format.raw/*331.153*/("""selected """)))}),format.raw/*331.163*/(""">Undergraduate</option>
                                            <option value="Master" """),_display_(/*332.69*/if(studentInfo != null && studentInfo.getStudentType() == "Master")/*332.136*/ {_display_(Seq[Any](format.raw/*332.138*/(""" """),format.raw/*332.139*/("""selected """)))}),format.raw/*332.149*/(""">Master</option>
                                            <option value="Ph.D." """),_display_(/*333.68*/if(studentInfo != null && studentInfo.getStudentType() == "Ph.D.")/*333.134*/ {_display_(Seq[Any](format.raw/*333.136*/(""" """),format.raw/*333.137*/("""selected """)))}),format.raw/*333.147*/(""">Ph.D.</option>
                                            <option value="Other" """),_display_(/*334.68*/if(studentInfo != null && studentInfo.getStudentType() == "Other")/*334.134*/ {_display_(Seq[Any](format.raw/*334.136*/(""" """),format.raw/*334.137*/("""selected """)))}),format.raw/*334.147*/(""">Other</option>
                                        </select>
                                        <label for="studentType">Type</label>
                                        <span id="studentTypeMsg" class="helper-text" data-error=""></span>
                                    </div>
                                    <div class="input-field col s12">
                                        <select id="studentYear" name="studentYear">
                                            <option value="First" """),_display_(/*341.68*/if(studentInfo != null && studentInfo.getStudentYear() == "First")/*341.134*/ {_display_(Seq[Any](format.raw/*341.136*/(""" """),format.raw/*341.137*/("""selected """)))}),format.raw/*341.147*/(""">First year</option>
                                            <option value="Second" """),_display_(/*342.69*/if(studentInfo != null && studentInfo.getStudentYear() == "Second")/*342.136*/ {_display_(Seq[Any](format.raw/*342.138*/(""" """),format.raw/*342.139*/("""selected """)))}),format.raw/*342.149*/(""">Second year</option>
                                            <option value="Third" """),_display_(/*343.68*/if(studentInfo != null && studentInfo.getStudentYear() == "Third")/*343.134*/ {_display_(Seq[Any](format.raw/*343.136*/(""" """),format.raw/*343.137*/("""selected """)))}),format.raw/*343.147*/(""">Third year</option>
                                            <option value="Forth" """),_display_(/*344.68*/if(studentInfo != null && studentInfo.getStudentYear() == "Forth")/*344.134*/ {_display_(Seq[Any](format.raw/*344.136*/(""" """),format.raw/*344.137*/("""selected """)))}),format.raw/*344.147*/(""">Forth year</option>
                                            <option value="Fifth" """),_display_(/*345.68*/if(studentInfo != null && studentInfo.getStudentYear() == "Fifth")/*345.134*/ {_display_(Seq[Any](format.raw/*345.136*/(""" """),format.raw/*345.137*/("""selected """)))}),format.raw/*345.147*/(""">Fifth year</option>
                                            <option value="Other" """),_display_(/*346.68*/if(studentInfo != null && studentInfo.getStudentYear() == "Other")/*346.134*/ {_display_(Seq[Any](format.raw/*346.136*/(""" """),format.raw/*346.137*/("""selected """)))}),format.raw/*346.147*/(""">Other</option>
                                        </select>
                                        <label for="studentYear">Current academic year</label>
                                        <span id="studentYearMsg" class="helper-text" data-error=""></span>
                                    </div>
                                    <div class="input-field col s12">
                                        <input type="text" name="studentMajor" id="studentMajor" class="validate"
                                        value='"""),_display_(/*353.49*/if(studentInfo != null && studentInfo.getMajor() != "null")/*353.108*/ {_display_(Seq[Any](format.raw/*353.110*/(""" """),_display_(/*353.112*/studentInfo/*353.123*/.getMajor()),format.raw/*353.134*/(""" """)))}),format.raw/*353.136*/("""'>
                                        <label for="studentMajor">Major</label>
                                        <span id="studentMajorMsg" class="helper-text" data-error=""></span>
                                    </div>
                                    <div class="input-field col s12">
                                        <input type="date" name="studentEnrollDate" id="studentEnrollDate" class="validate"
                                        value='"""),_display_(/*359.49*/if(studentInfo != null && studentInfo.getFirstEnrollDate() != "null")/*359.118*/ {_display_(Seq[Any](format.raw/*359.120*/(""" """),_display_(/*359.122*/studentInfo/*359.133*/.getFirstEnrollDate()),format.raw/*359.154*/(""" """)))}),format.raw/*359.156*/("""'>
                                        <label for="studentEnrollDate">First Enrollment Date</label>
                                        <span id="studentEnrollDateMsg" class="helper-text" data-error=""></span>
                                    </div>
                                </div>
                            """)))}),format.raw/*364.30*/("""

"""),format.raw/*366.50*/("""
"""),format.raw/*367.70*/("""
"""),format.raw/*368.189*/("""
"""),format.raw/*369.92*/("""
"""),format.raw/*370.111*/("""
"""),format.raw/*371.43*/("""
"""),format.raw/*372.39*/("""
"""),format.raw/*373.50*/("""
"""),format.raw/*374.70*/("""
"""),format.raw/*375.185*/("""
"""),format.raw/*376.90*/("""
"""),format.raw/*377.110*/("""
"""),format.raw/*378.43*/("""
"""),format.raw/*379.39*/("""
                            """),format.raw/*380.29*/("""<input type="hidden" name="email" hidden value=""""),_display_(/*380.78*/user/*380.82*/.getEmail),format.raw/*380.91*/("""">

                            <div class="actions row">
                                <button id="Save" type="submit" class="btn waves-effect waves-light col s12 blue darken-2">
                                    Save<i class="material-icons right">save_alt</i></button>
                            </div>
                            <div class="actions row">
"""),format.raw/*387.124*/("""
"""),format.raw/*388.109*/("""
"""),format.raw/*389.74*/("""
"""),format.raw/*390.68*/("""
"""),format.raw/*391.80*/("""
"""),format.raw/*392.74*/("""
"""),format.raw/*393.91*/("""
"""),format.raw/*394.120*/("""
"""),format.raw/*395.80*/("""
"""),format.raw/*396.47*/("""
"""),format.raw/*397.67*/("""
"""),format.raw/*398.112*/("""
"""),format.raw/*399.59*/("""
"""),format.raw/*400.90*/("""
"""),format.raw/*401.110*/("""
"""),format.raw/*402.47*/("""
"""),format.raw/*403.43*/("""
                                """),format.raw/*404.33*/("""<div style="display: flex; justify-content: center; align-items: center; height: 100%;">
                                    <a href="/" class="btn waves-effect waves-light col s5 offset-s2 grey"
                                    style="transform: translateX(-90px);">
                                        Cancel<i class="material-icons right">cancel</i>
                                    </a>
                                </div>
                            </div>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
""")))}))
      }
    }
  }

  def render(id:String,userForm:play.data.Form[models.User],user:User,organizations:List[Organization],researcherInfo:ResearcherInfo,studentInfo:StudentInfo): play.twirl.api.HtmlFormat.Appendable = apply(id,userForm,user,organizations,researcherInfo,studentInfo)

  def f:((String,play.data.Form[models.User],User,List[Organization],ResearcherInfo,StudentInfo) => play.twirl.api.HtmlFormat.Appendable) = (id,userForm,user,organizations,researcherInfo,studentInfo) => apply(id,userForm,user,organizations,researcherInfo,studentInfo)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:39 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/userEdit.scala.html
                  HASH: 8f37b254f983a976f45cc6ec48f6994dd6b1f254
                  MATRIX: 1193->1|1422->163|1450->184|1465->191|1545->195|1580->204|1643->241|1657->247|1728->297|1811->354|1825->360|1898->412|2061->548|2089->549|2137->570|3289->1694|3318->1695|3367->1716|3467->1788|3496->1789|3525->1790|3627->1864|3656->1865|3705->1886|3816->1969|3845->1970|3894->1991|3960->2029|3989->2030|4038->2051|4123->2108|4152->2109|4206->2135|4235->2136|4282->2155|4311->2156|4482->2299|4511->2300|4560->2321|4644->2377|4673->2378|4719->2396|4878->2527|4907->2528|4956->2549|5247->2812|5276->2813|5329->2838|5634->3115|5663->3116|5709->3134|5738->3135|5784->3153|5962->3303|5991->3304|6040->3325|6390->3647|6419->3648|6465->3666|6522->3695|6551->3696|6600->3717|7094->4183|7123->4184|7169->4202|7453->4458|7482->4459|7531->4480|7594->4515|7623->4516|7676->4541|8002->4839|8031->4840|8088->4869|8190->4943|8219->4944|8272->4969|8328->4997|8357->4998|8406->5019|8567->5152|8596->5153|8649->5178|8893->5394|8922->5395|8979->5424|9081->5498|9110->5499|9159->5520|9188->5521|9217->5522|9250->5527|9279->5528|9332->5553|9445->5637|9475->5638|9533->5667|9645->5749|9676->5750|9738->5783|9947->5963|9977->5964|10031->5989|10061->5990|10115->6015|10156->6027|10186->6028|10244->6057|10451->6235|10481->6236|10511->6237|10545->6242|10575->6243|10633->6272|10808->6418|10838->6419|10900->6452|11007->6530|11037->6531|11091->6556|11121->6557|11171->6578|11201->6579|11248->6597|11278->6598|11325->6616|11391->6653|11421->6654|11471->6675|11590->6765|11620->6766|11674->6791|11736->6824|11766->6825|11816->6846|11937->6938|11967->6939|12021->6964|12169->7083|12199->7084|12249->7105|12307->7134|12337->7135|12374->7144|12429->157|12460->179|12492->7159|12522->7162|12567->7197|12608->7199|12641->7204|12872->7406|12889->7412|12942->7442|13589->8061|13603->8065|13631->8071|13877->8289|13891->8293|13922->8302|14401->8753|14417->8759|14487->8806|15135->9425|15150->9429|15179->9435|15422->9865|15452->9928|15522->9969|16371->10789|16386->10793|16422->10806|17074->11429|17118->11462|17151->11465|17166->11469|17209->11487|17849->12098|17864->12102|17899->12114|18192->12427|18222->12497|18253->12610|18284->12815|18314->12864|18345->13043|18375->13085|18405->13147|18436->13445|18466->13506|18497->13614|18527->13711|18557->13754|18587->13793|18617->13843|18647->13913|18678->14094|18708->14181|18739->14290|18769->14333|18827->14362|19103->14610|19165->14655|19206->14657|19280->14702|19324->14718|19337->14721|19367->14729|19398->14732|19411->14735|19456->14757|19539->14808|19610->15008|19681->15122|19747->15159|19823->15319|19889->15356|20676->16152|20706->16202|20736->16272|20767->16425|20797->16498|20828->16600|20858->16643|20888->16682|20946->16711|21169->16905|21210->16935|21243->16938|21258->16942|21296->16955|21613->17841|21671->17870|21906->18076|21951->18110|21984->18113|21999->18117|22043->18136|22572->18636|22614->18667|22647->18670|22662->18674|22703->18690|23024->18983|23061->19010|23102->19012|23164->19045|23444->19297|23528->19370|23570->19372|23601->19374|23626->19388|23668->19407|23703->19409|24195->19873|24271->19938|24313->19940|24344->19942|24369->19956|24403->19967|24438->19969|24923->20426|25008->20500|25050->20502|25081->20504|25106->20518|25149->20538|25184->20540|25681->21009|25758->21075|25800->21077|25831->21079|25856->21093|25891->21105|25926->21107|26406->21559|26487->21629|26529->21631|26560->21633|26585->21647|26624->21663|26659->21665|26995->21969|27054->22000|27091->22027|27132->22029|27194->22062|27478->22318|27551->22380|27593->22382|27624->22384|27646->22395|27683->22409|27718->22411|28216->22881|28301->22955|28343->22957|28374->22958|28417->22968|28537->23060|28615->23127|28657->23129|28688->23130|28731->23140|28843->23224|28920->23290|28962->23292|28993->23293|29036->23303|29147->23386|29224->23452|29266->23454|29297->23455|29340->23465|29885->23982|29962->24048|30004->24050|30035->24051|30078->24061|30195->24150|30273->24217|30315->24219|30346->24220|30389->24230|30506->24319|30583->24385|30625->24387|30656->24388|30699->24398|30815->24486|30892->24552|30934->24554|30965->24555|31008->24565|31124->24653|31201->24719|31243->24721|31274->24722|31317->24732|31433->24820|31510->24886|31552->24888|31583->24889|31626->24899|32198->25443|32268->25502|32310->25504|32341->25506|32363->25517|32397->25528|32432->25530|32937->26007|33017->26076|33059->26078|33090->26080|33112->26091|33156->26112|33191->26114|33552->26443|33583->26494|33613->26564|33644->26753|33674->26845|33705->26956|33735->26999|33765->27038|33795->27088|33825->27158|33856->27343|33886->27433|33917->27543|33947->27586|33977->27625|34035->27654|34112->27703|34126->27707|34157->27716|34552->28204|34583->28313|34613->28387|34643->28455|34673->28535|34703->28609|34733->28700|34764->28820|34794->28900|34824->28947|34854->29014|34885->29126|34915->29185|34945->29275|34976->29385|35006->29432|35036->29475|35098->29508
                  LINES: 35->1|38->2|40->3|40->3|42->3|43->4|43->4|43->4|43->4|44->5|44->5|44->5|47->8|47->8|48->9|62->23|62->23|63->24|64->25|64->25|64->25|65->26|65->26|66->27|67->28|67->28|68->29|68->29|68->29|69->30|70->31|70->31|71->32|71->32|72->33|72->33|77->38|77->38|78->39|79->40|79->40|81->42|84->45|84->45|85->46|89->50|89->50|90->51|94->55|94->55|95->56|95->56|97->58|100->61|100->61|101->62|105->66|105->66|107->68|107->68|107->68|108->69|113->74|113->74|115->76|119->80|119->80|120->81|120->81|120->81|121->82|124->85|124->85|125->86|126->87|126->87|127->88|128->89|128->89|129->90|131->92|131->92|132->93|134->95|134->95|135->96|136->97|136->97|137->98|137->98|137->98|137->98|137->98|138->99|139->100|139->100|140->101|140->101|140->101|141->102|144->105|144->105|145->106|145->106|146->107|146->107|146->107|147->108|149->110|149->110|149->110|149->110|149->110|150->111|151->112|151->112|152->113|153->114|153->114|154->115|154->115|155->116|155->116|157->118|157->118|159->120|159->120|159->120|160->121|161->122|161->122|162->123|163->124|163->124|164->125|165->126|165->126|166->127|168->129|168->129|169->130|170->131|170->131|171->132|173->1|174->3|174->133|176->135|176->135|176->135|177->136|180->139|180->139|180->139|190->149|190->149|190->149|194->153|194->153|194->153|204->163|204->163|204->163|212->171|212->171|212->171|214->173|215->174|216->175|228->187|228->187|228->187|234->193|234->193|234->193|234->193|234->193|240->199|240->199|240->199|245->204|246->205|247->206|248->207|249->208|250->209|251->210|252->211|253->212|254->213|255->214|256->215|257->216|258->217|259->218|260->219|261->220|262->221|263->222|264->223|265->224|268->227|268->227|268->227|269->228|269->228|269->228|269->228|269->228|269->228|269->228|270->229|271->230|272->231|273->232|274->233|275->234|288->247|289->248|290->249|291->250|292->251|293->252|294->253|295->254|296->255|298->257|298->257|298->257|298->257|298->257|303->270|304->271|306->273|306->273|306->273|306->273|306->273|313->280|313->280|313->280|313->280|313->280|319->286|319->286|319->286|320->287|323->290|323->290|323->290|323->290|323->290|323->290|323->290|329->296|329->296|329->296|329->296|329->296|329->296|329->296|335->302|335->302|335->302|335->302|335->302|335->302|335->302|341->308|341->308|341->308|341->308|341->308|341->308|341->308|347->314|347->314|347->314|347->314|347->314|347->314|347->314|352->319|354->321|354->321|354->321|355->322|358->325|358->325|358->325|358->325|358->325|358->325|358->325|364->331|364->331|364->331|364->331|364->331|365->332|365->332|365->332|365->332|365->332|366->333|366->333|366->333|366->333|366->333|367->334|367->334|367->334|367->334|367->334|374->341|374->341|374->341|374->341|374->341|375->342|375->342|375->342|375->342|375->342|376->343|376->343|376->343|376->343|376->343|377->344|377->344|377->344|377->344|377->344|378->345|378->345|378->345|378->345|378->345|379->346|379->346|379->346|379->346|379->346|386->353|386->353|386->353|386->353|386->353|386->353|386->353|392->359|392->359|392->359|392->359|392->359|392->359|392->359|397->364|399->366|400->367|401->368|402->369|403->370|404->371|405->372|406->373|407->374|408->375|409->376|410->377|411->378|412->379|413->380|413->380|413->380|413->380|420->387|421->388|422->389|423->390|424->391|425->392|426->393|427->394|428->395|429->396|430->397|431->398|432->399|433->400|434->401|435->402|436->403|437->404
                  -- GENERATED --
              */
          