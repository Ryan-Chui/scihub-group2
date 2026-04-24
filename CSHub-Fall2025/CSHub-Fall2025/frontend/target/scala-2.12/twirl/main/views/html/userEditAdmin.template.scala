
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

object userEditAdmin extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[Long,play.data.Form[models.User],User,List[Organization],ResearcherInfo,StudentInfo,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, userForm: play.data.Form[models.User], user: User, organizations: List[Organization], researcherInfo: ResearcherInfo, studentInfo: StudentInfo):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._

def /*3.2*/scripts/*3.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.13*/("""
    """),format.raw/*4.5*/("""<script type="text/javascript" src='"""),_display_(/*4.42*/routes/*4.48*/.Assets.at("javascripts/database_field_length.js")),format.raw/*4.98*/("""'></script>
    <script type="text/javascript" src='"""),_display_(/*5.42*/routes/*5.48*/.Assets.at("javascripts/field_validation_helper.js")),format.raw/*5.100*/("""'></script>
    <script type="text/javascript">
            var projectList = [];
            $(document).ready(function () """),format.raw/*8.43*/("""{"""),format.raw/*8.44*/("""
                """),format.raw/*9.17*/("""/**
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

                // $.get("/project/getProjects", function (res) """),format.raw/*23.65*/("""{"""),format.raw/*23.66*/("""
                """),format.raw/*24.17*/("""//     projectList = res;
                //     var availableObj = """),format.raw/*25.43*/("""{"""),format.raw/*25.44*/("""}"""),format.raw/*25.45*/(""";
                //     for (var i = 0; i < projectList.length; i++) """),format.raw/*26.69*/("""{"""),format.raw/*26.70*/("""
                """),format.raw/*27.17*/("""//         availableObj[projectList[i]['text']] = null;
                //     """),format.raw/*28.24*/("""}"""),format.raw/*28.25*/("""
                """),format.raw/*29.17*/("""//     $('#projectName').autocomplete("""),format.raw/*29.55*/("""{"""),format.raw/*29.56*/("""
                """),format.raw/*30.17*/("""//         data: availableObj
                //     """),format.raw/*31.24*/("""}"""),format.raw/*31.25*/(""");
                // """),format.raw/*32.20*/("""}"""),format.raw/*32.21*/(""");
            """),format.raw/*33.13*/("""}"""),format.raw/*33.14*/(""");

            /**
             * This method triggers the user image change
             */
            function updateImg() """),format.raw/*38.34*/("""{"""),format.raw/*38.35*/("""
                """),format.raw/*39.17*/("""document.getElementById("Img").click();
            """),format.raw/*40.13*/("""}"""),format.raw/*40.14*/("""

            """),format.raw/*42.13*/("""/**
             * This method previews the selected image for update
             */
            function changepic() """),format.raw/*45.34*/("""{"""),format.raw/*45.35*/("""
                """),format.raw/*46.17*/("""if (document.getElementById("Img").value == "") return;
                var reads = new FileReader();
                f = document.getElementById("Img").files[0];
                reads.readAsDataURL(f);
                reads.onload = function (e) """),format.raw/*50.45*/("""{"""),format.raw/*50.46*/("""
                    """),format.raw/*51.21*/("""document.getElementById('showImg').src = this.result;
                    $('#record').val("update");
                    $('#previewMsg').text("This is the preview image. You need to click \"SAVE\" button below if you want to save the changes.");

                """),format.raw/*55.17*/("""}"""),format.raw/*55.18*/(""";
            """),format.raw/*56.13*/("""}"""),format.raw/*56.14*/("""

            """),format.raw/*58.13*/("""/**
             * This method deletes the image and provides the default image for user
             */
            function deleteImg() """),format.raw/*61.34*/("""{"""),format.raw/*61.35*/("""
                """),format.raw/*62.17*/("""url = "../../../../assets/images/user.png";
                document.getElementById('showImg').src = url;
                $('#record').val("delete");
                $('#previewMsg').text("This is the default image. You need to click \"UPDATE\" button below if you want to save the changes.");
            """),format.raw/*66.13*/("""}"""),format.raw/*66.14*/("""

            """),format.raw/*68.13*/("""function otherOrganization() """),format.raw/*68.42*/("""{"""),format.raw/*68.43*/("""
                """),format.raw/*69.17*/("""var inputOtherOrganization = document.getElementById("organization");
                var selectedIndex = inputOtherOrganization.selectedIndex;
                var selectedValue = inputOtherOrganization.options[selectedIndex].value;
                document.getElementById("hiddenOrganization").hidden = !(selectedValue == "-1");
                document.getElementsByName("hiddenOrganization")[0].required = (selectedValue == "-1");
            """),format.raw/*74.13*/("""}"""),format.raw/*74.14*/("""

            """),format.raw/*76.13*/("""/**
             * This method parses and sets up default project based on input.
             * If not set or opennex typed, the project is set to OpenNEX. Otherwise check the name.
             */
            function projectValidation() """),format.raw/*80.42*/("""{"""),format.raw/*80.43*/("""
                """),format.raw/*81.17*/("""if ($("#projectName").val() == "") """),format.raw/*81.52*/("""{"""),format.raw/*81.53*/("""
                    """),format.raw/*82.21*/("""document.getElementById("project-msg").innerHTML = "";
                    document.getElementById("projectName").value = "OpenNEX";
                    document.getElementById("projectId").value = "0";
                    if ($('#msg').text() == "" && $('#homepage-msg').text() == "") """),format.raw/*85.84*/("""{"""),format.raw/*85.85*/("""
                        """),format.raw/*86.25*/("""document.getElementById("Save").disabled = false;
                    """),format.raw/*87.21*/("""}"""),format.raw/*87.22*/("""
                    """),format.raw/*88.21*/("""return;
                """),format.raw/*89.17*/("""}"""),format.raw/*89.18*/("""
                """),format.raw/*90.17*/("""var project = $("#projectName").val();
                var pid = 0;
                if (project.toLowerCase() === "opennex") """),format.raw/*92.58*/("""{"""),format.raw/*92.59*/("""
                    """),format.raw/*93.21*/("""document.getElementById("projectId").value = "0";
                    document.getElementById("project-msg").innerHTML = "";
                    if ($('#msg').text() == "" && $('#homepage-msg').text() == "") """),format.raw/*95.84*/("""{"""),format.raw/*95.85*/("""
                        """),format.raw/*96.25*/("""document.getElementById("Save").disabled = false;
                    """),format.raw/*97.21*/("""}"""),format.raw/*97.22*/("""
                """),format.raw/*98.17*/("""}"""),format.raw/*98.18*/(""" """),format.raw/*98.19*/("""else """),format.raw/*98.24*/("""{"""),format.raw/*98.25*/("""
                    """),format.raw/*99.21*/("""found = false;
                    for (var i = 0; i < projectList.length; i++) """),format.raw/*100.66*/("""{"""),format.raw/*100.67*/("""
                        """),format.raw/*101.25*/("""if (projectList[i]['text'].toLowerCase().trim() === project.toLowerCase().trim()) """),format.raw/*101.107*/("""{"""),format.raw/*101.108*/("""
                            """),format.raw/*102.29*/("""found = true;
                            document.getElementById("projectId").value = projectList[i]['id'];
                            break;
                        """),format.raw/*105.25*/("""}"""),format.raw/*105.26*/("""
                    """),format.raw/*106.21*/("""}"""),format.raw/*106.22*/("""
                    """),format.raw/*107.21*/("""if (!found) """),format.raw/*107.33*/("""{"""),format.raw/*107.34*/("""
                        """),format.raw/*108.25*/("""document.getElementById("project-msg").innerHTML = "Project does not exist";
                        document.getElementById("Save").disabled = true;
                    """),format.raw/*110.21*/("""}"""),format.raw/*110.22*/(""" """),format.raw/*110.23*/("""else """),format.raw/*110.28*/("""{"""),format.raw/*110.29*/("""
                        """),format.raw/*111.25*/("""document.getElementById("project-msg").innerHTML = "";
                        if ($('#msg').text() == "" && $('#homepage-msg').text() == "") """),format.raw/*112.88*/("""{"""),format.raw/*112.89*/("""
                            """),format.raw/*113.29*/("""document.getElementById("Save").disabled = false;
                        """),format.raw/*114.25*/("""}"""),format.raw/*114.26*/("""
                    """),format.raw/*115.21*/("""}"""),format.raw/*115.22*/("""
                """),format.raw/*116.17*/("""}"""),format.raw/*116.18*/("""

            """),format.raw/*118.13*/("""}"""),format.raw/*118.14*/("""

            """),format.raw/*120.13*/("""function checkFileSizeBeforeSubmit() """),format.raw/*120.50*/("""{"""),format.raw/*120.51*/("""
                """),format.raw/*121.17*/("""var fileInput = document.getElementById("Img");
                if (!fileInput.value) """),format.raw/*122.39*/("""{"""),format.raw/*122.40*/("""
                    """),format.raw/*123.21*/("""return true;
                """),format.raw/*124.17*/("""}"""),format.raw/*124.18*/("""
                """),format.raw/*125.17*/("""var file = fileInput.files[0];
                if (file && file.size > 3 * 1024 * 1024) """),format.raw/*126.58*/("""{"""),format.raw/*126.59*/("""
                    """),format.raw/*127.21*/("""alert("The image size cannot exceed 3MB, please reselect.");
                    return false;
                """),format.raw/*129.17*/("""}"""),format.raw/*129.18*/("""
                """),format.raw/*130.17*/("""return true;
            """),format.raw/*131.13*/("""}"""),format.raw/*131.14*/("""
    """),format.raw/*132.5*/("""</script>
""")))};
Seq[Any](format.raw/*1.156*/("""
"""),format.raw/*133.2*/("""

"""),_display_(/*135.2*/main("Account Management", scripts)/*135.37*/ {_display_(Seq[Any](format.raw/*135.39*/("""
    """),format.raw/*136.5*/("""<div class="container row">
        <div class="col s12">
            <div class="card-panel">
                <form class="form-signin" id="update" enctype="multipart/form-data" method="post" action=""""),_display_(/*139.108*/routes/*139.114*/.AuthorController.userEditPOSTAdmin(id)),format.raw/*139.153*/("""" onsubmit="return checkFileSizeBeforeSubmit()">
                    <h4 class="form-signin-heading" align="center">User Profile</h4>
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
                                        <tr>
                                            """),_display_(/*156.46*/if(user.getUserType() == 4)/*156.73*/ {_display_(Seq[Any](format.raw/*156.75*/("""
                                                """),format.raw/*157.49*/("""<span class="chip blue white-text">student</span>
                                            """)))}),format.raw/*158.46*/("""
                                            """),_display_(/*159.46*/if(user.getUserType() == 1)/*159.73*/ {_display_(Seq[Any](format.raw/*159.75*/("""
                                                """),format.raw/*160.49*/("""<span class="chip green white-text">Researcher</span>
                                            """)))}),format.raw/*161.46*/("""
                                            """),_display_(/*162.46*/if(user.getUserType() == 2)/*162.73*/ {_display_(Seq[Any](format.raw/*162.75*/("""
                                                """),format.raw/*163.49*/("""<span class="chip orange white-text">Sponsor</span>
                                            """)))}),format.raw/*164.46*/("""
                                        """),format.raw/*165.41*/("""</tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                        <div class="col center s3">
                            <tr>
                                <th>Picture:</th>
                                <td>
                                    <img class="circle" id="showImg" src=""""),_display_(/*174.76*/routes/*174.82*/.Application.getImageFromPath(user.getAvatar())),format.raw/*174.129*/("""" width="360" height="360" style="border-width: 1px;
                                        border-style: solid;
                                        border-radius: 50%;
                                        height: auto;
                                        width: 70%;">
                                    <div id="previewMsg" style="color: blue"></div>
                                    <br>
                                    <div>
                                        <a class="btn-floating waves-effect waves-light blue darken-2" title="Update Image" href="javascript:void(0)" onclick="updateImg("""),_display_(/*182.171*/user/*182.175*/.getId),format.raw/*182.181*/(""")"><i class="material-icons">
                                            edit</i><input type="file" id="Img" name="avatar" style="display: none;" accept=".jpeg,.png,.jpg" onchange="changepic(this)"/></a>  &nbsp;
                                        """),format.raw/*184.258*/("""
                                        """),format.raw/*185.103*/("""
                                        """),format.raw/*186.41*/("""<input id="record" name = "record" style="display: none;"/>
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
                                    onkeypress="return (event.charCode > 64 && event.charCode < 91) || (event.charCode > 96 && event.charCode < 123) || event.charCode === 32" onpaste="return false" value=""""),_display_(/*198.207*/user/*198.211*/.getFirstName),format.raw/*198.224*/("""" required>
                                    <label for="firstName">First Name* </label>
                                    <span id="firstNameMsg" class="helper-text" data-error=""></span>
                                </div>
                                <div class="input-field col s12 m4 l4">
                                    <input id="middleInitial" type="text" class="validate" name="middleInitial"
                                    onkeypress="return (event.charCode > 64 && event.charCode < 91) || (event.charCode > 96 && event.charCode < 123) || event.charCode === 32" onpaste="return false" value=""""),_display_(/*204.207*/if(user.getMiddleInitial!="null")/*204.240*/ {_display_(_display_(/*204.243*/user/*204.247*/.getMiddleInitial))}),format.raw/*204.265*/("""">
                                    <label for="middleInitial">Middle Name</label>
                                    <span id="middleInitialMsg" class="helper-text" data-error=""></span>
                                </div>
                                <div class="input-field col s12 m4 l4">
                                    <input id="lastName" type="text" class="validate" name="lastName"
                                    onkeypress="return (event.charCode > 64 && event.charCode < 91) || (event.charCode > 96 && event.charCode < 123) || event.charCode === 32" onpaste="return false" value=""""),_display_(/*210.207*/user/*210.211*/.getLastName),format.raw/*210.223*/("""" required>
                                    <label for="lastName">Last Name*</label>
                                    <span id="lastNameMsg" class="helper-text" data-error=""></span>
                                </div>
                            </div>
                            """),format.raw/*215.78*/("""
                            """),format.raw/*216.98*/("""
                            """),format.raw/*217.141*/("""
                            """),format.raw/*218.233*/("""
                            """),format.raw/*219.77*/("""
                            """),format.raw/*220.207*/("""
                            """),format.raw/*221.70*/("""
                            """),format.raw/*222.90*/("""
                            """),format.raw/*223.326*/("""
                            """),format.raw/*224.89*/("""
                            """),format.raw/*225.136*/("""
                            """),format.raw/*226.125*/("""
                            """),format.raw/*227.71*/("""
                            """),format.raw/*228.67*/("""
                            """),format.raw/*229.78*/("""
                            """),format.raw/*230.98*/("""
                            """),format.raw/*231.209*/("""
                            """),format.raw/*232.115*/("""
                            """),format.raw/*233.137*/("""
                            """),format.raw/*234.71*/("""
                            """),format.raw/*235.29*/("""<div class="row">
                                <div class="input-field col s12">
                                    <select id="organization" name="organization" onchange="otherOrganization()" required>
                                        """),_display_(/*238.42*/for((org, idx) <- organizations.zipWithIndex) yield /*238.87*/ {_display_(Seq[Any](format.raw/*238.89*/("""
                                            """),format.raw/*239.45*/("""<option value=""""),_display_(/*239.61*/org/*239.64*/.getId()),format.raw/*239.72*/("""">"""),_display_(/*239.75*/org/*239.78*/.getOrganizationName()),format.raw/*239.100*/("""</option>
                                        """)))}),format.raw/*240.42*/("""
                                        """),format.raw/*241.200*/("""
                                        """),format.raw/*242.114*/("""
                                    """),format.raw/*243.37*/("""</select>
                                    """),format.raw/*244.151*/("""
                                    """),format.raw/*245.37*/("""<label for="organization">Organization</label>
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

                            """),format.raw/*258.67*/("""
                            """),format.raw/*259.78*/("""
                            """),format.raw/*260.98*/("""
                            """),format.raw/*261.181*/("""
                            """),format.raw/*262.101*/("""
                            """),format.raw/*263.130*/("""
                            """),format.raw/*264.71*/("""
                            """),format.raw/*265.67*/("""
                            """),format.raw/*266.29*/("""<div class="row">
                                <div class="input-field col s12">
                                    <input type="text" name="homepage" id="homepage" class="validate" value='"""),_display_(/*268.111*/if(user.getHomepage != "null")/*268.141*/ {_display_(_display_(/*268.144*/user/*268.148*/.getHomepage))}),format.raw/*268.161*/("""'>
                                    <label for="homepage">Personal Website URL</label>
                                    <span id="urlMsg" class="helper-text" data-error=""></span>
                                </div>
                            </div>
                            """),format.raw/*280.37*/("""
                        """),format.raw/*281.25*/("""</div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input type="text" name="mailingAddress" id="mailingAddress" class="validate" value='"""),_display_(/*284.119*/if(user.getMailingAddress!="null")/*284.153*/ {_display_(_display_(/*284.156*/user/*284.160*/.getMailingAddress))}),format.raw/*284.179*/("""'>
                                <label for="mailingAddress">Mailing Address</label>
                                <span id="mailingAddressMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input type="text" name="phoneNumber" id="phoneNumber" class="validate" value='"""),_display_(/*291.113*/if(user.getPhoneNumber!="null")/*291.144*/ {_display_(_display_(/*291.147*/user/*291.151*/.getPhoneNumber))}),format.raw/*291.167*/("""'>
                                <label for="phoneNumber">Phone Number</label>
                                <span id="phoneNumberMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>

                        """),_display_(/*297.26*/if(user.getUserType() == 1)/*297.53*/ {_display_(Seq[Any](format.raw/*297.55*/("""
                            """),format.raw/*298.29*/("""<div class="row">
                                <div class="input-field col s12">
                                    <input type="text" name="highestDegree" id="highestDegree" class="validate"
                                    value='"""),_display_(/*301.45*/if(researcherInfo != null && researcherInfo.getHighestDegree() != "null")/*301.118*/ {_display_(Seq[Any](format.raw/*301.120*/(""" """),_display_(/*301.122*/researcherInfo/*301.136*/.getHighestDegree()),format.raw/*301.155*/(""" """)))}),format.raw/*301.157*/("""'>
                                    <label for="highestDegree">Highest Degree</label>
                                    <span id="highestDegreeMsg" class="helper-text" data-error=""></span>
                                </div>
                                <div class="input-field col s12">
                                    <input type="text" name="orcid" id="orcid" class="validate"
                                    value='"""),_display_(/*307.45*/if(researcherInfo != null && researcherInfo.getOrcid() != "null")/*307.110*/ {_display_(Seq[Any](format.raw/*307.112*/(""" """),_display_(/*307.114*/researcherInfo/*307.128*/.getOrcid()),format.raw/*307.139*/(""" """)))}),format.raw/*307.141*/("""'>
                                    <label for="orcid">ORCID</label>
                                    <span id="orcidMsg" class="helper-text" data-error=""></span>
                                </div>
                                <div class="input-field col s12">
                                    <input type="text" name="researchFields" id="researchFields" class="validate"
                                    value='"""),_display_(/*313.45*/if(researcherInfo != null && researcherInfo.getResearchFields() != "null")/*313.119*/ {_display_(Seq[Any](format.raw/*313.121*/(""" """),_display_(/*313.123*/researcherInfo/*313.137*/.getResearchFields()),format.raw/*313.157*/(""" """)))}),format.raw/*313.159*/("""'>
                                    <label for="researchFields">Research Fields</label>
                                    <span id="researchFieldsMsg" class="helper-text" data-error=""></span>
                                </div>
                                <div class="input-field col s12">
                                    <input type="text" name="school" id="school" class="validate"
                                    value='"""),_display_(/*319.45*/if(researcherInfo != null && researcherInfo.getSchool() != "null")/*319.111*/ {_display_(Seq[Any](format.raw/*319.113*/(""" """),_display_(/*319.115*/researcherInfo/*319.129*/.getSchool()),format.raw/*319.141*/(""" """)))}),format.raw/*319.143*/("""'>
                                    <label for="school">School</label>
                                    <span id="schoolMsg" class="helper-text" data-error=""></span>
                                </div>
                                <div class="input-field col s12">
                                    <input type="text" name="department" id="department" class="validate"
                                    value='"""),_display_(/*325.45*/if(researcherInfo != null && researcherInfo.getDepartment() != "null")/*325.115*/ {_display_(Seq[Any](format.raw/*325.117*/(""" """),_display_(/*325.119*/researcherInfo/*325.133*/.getDepartment()),format.raw/*325.149*/(""" """)))}),format.raw/*325.151*/("""'>
                                    <label for="department">Department</label>
                                    <span id="departmentMsg" class="helper-text" data-error=""></span>
                                </div>
                            </div>
                        """)))}),format.raw/*330.26*/("""

                        """),_display_(/*332.26*/if(user.getUserType() == 4)/*332.53*/ {_display_(Seq[Any](format.raw/*332.55*/("""
                            """),format.raw/*333.29*/("""<div class="row">
                                <div class="input-field col s12">
                                    <input type="text" name="studentIdNumber" id="studentIdNumber" class="validate"
                                    value='"""),_display_(/*336.45*/if(studentInfo != null && studentInfo.getIdNumber() != "null")/*336.107*/ {_display_(Seq[Any](format.raw/*336.109*/(""" """),_display_(/*336.111*/studentInfo/*336.122*/.getIdNumber()),format.raw/*336.136*/(""" """)))}),format.raw/*336.138*/("""'>
                                    <label for="studentIdNumber">ID #</label>
                                    <span id="studentIdNumberMsg" class="helper-text" data-error=""></span>
                                </div>
                                <div class="input-field col s12">
                                    <select id="studentType" name="studentType">
                                        <option value="Undergraduate" """),_display_(/*342.72*/if(studentInfo != null && studentInfo.getStudentType() == "Undergraduate")/*342.146*/ {_display_(Seq[Any](format.raw/*342.148*/(""" """),format.raw/*342.149*/("""selected """)))}),format.raw/*342.159*/(""">Undergraduate</option>
                                        <option value="Master" """),_display_(/*343.65*/if(studentInfo != null && studentInfo.getStudentType() == "Master")/*343.132*/ {_display_(Seq[Any](format.raw/*343.134*/(""" """),format.raw/*343.135*/("""selected """)))}),format.raw/*343.145*/(""">Master</option>
                                        <option value="Ph.D." """),_display_(/*344.64*/if(studentInfo != null && studentInfo.getStudentType() == "Ph.D.")/*344.130*/ {_display_(Seq[Any](format.raw/*344.132*/(""" """),format.raw/*344.133*/("""selected """)))}),format.raw/*344.143*/(""">Ph.D.</option>
                                        <option value="Other" """),_display_(/*345.64*/if(studentInfo != null && studentInfo.getStudentType() == "Other")/*345.130*/ {_display_(Seq[Any](format.raw/*345.132*/(""" """),format.raw/*345.133*/("""selected """)))}),format.raw/*345.143*/(""">Other</option>
                                    </select>
                                    <label for="studentType">Type</label>
                                    <span id="studentTypeMsg" class="helper-text" data-error=""></span>
                                </div>
                                <div class="input-field col s12">
                                    <select id="studentYear" name="studentYear">
                                        <option value="First" """),_display_(/*352.64*/if(studentInfo != null && studentInfo.getStudentYear() == "First")/*352.130*/ {_display_(Seq[Any](format.raw/*352.132*/(""" """),format.raw/*352.133*/("""selected """)))}),format.raw/*352.143*/(""">First year</option>
                                        <option value="Second" """),_display_(/*353.65*/if(studentInfo != null && studentInfo.getStudentYear() == "Second")/*353.132*/ {_display_(Seq[Any](format.raw/*353.134*/(""" """),format.raw/*353.135*/("""selected """)))}),format.raw/*353.145*/(""">Second year</option>
                                        <option value="Third" """),_display_(/*354.64*/if(studentInfo != null && studentInfo.getStudentYear() == "Third")/*354.130*/ {_display_(Seq[Any](format.raw/*354.132*/(""" """),format.raw/*354.133*/("""selected """)))}),format.raw/*354.143*/(""">Third year</option>
                                        <option value="Forth" """),_display_(/*355.64*/if(studentInfo != null && studentInfo.getStudentYear() == "Forth")/*355.130*/ {_display_(Seq[Any](format.raw/*355.132*/(""" """),format.raw/*355.133*/("""selected """)))}),format.raw/*355.143*/(""">Forth year</option>
                                        <option value="Fifth" """),_display_(/*356.64*/if(studentInfo != null && studentInfo.getStudentYear() == "Fifth")/*356.130*/ {_display_(Seq[Any](format.raw/*356.132*/(""" """),format.raw/*356.133*/("""selected """)))}),format.raw/*356.143*/(""">Fifth year</option>
                                        <option value="Other" """),_display_(/*357.64*/if(studentInfo != null && studentInfo.getStudentYear() == "Other")/*357.130*/ {_display_(Seq[Any](format.raw/*357.132*/(""" """),format.raw/*357.133*/("""selected """)))}),format.raw/*357.143*/(""">Other</option>
                                    </select>
                                    <label for="studentYear">Current academic year</label>
                                    <span id="studentYearMsg" class="helper-text" data-error=""></span>
                                </div>
                                <div class="input-field col s12">
                                    <input type="text" name="studentMajor" id="studentMajor" class="validate"
                                    value='"""),_display_(/*364.45*/if(studentInfo != null && studentInfo.getMajor() != "null")/*364.104*/ {_display_(Seq[Any](format.raw/*364.106*/(""" """),_display_(/*364.108*/studentInfo/*364.119*/.getMajor()),format.raw/*364.130*/(""" """)))}),format.raw/*364.132*/("""'>
                                    <label for="studentMajor">Major</label>
                                    <span id="studentMajorMsg" class="helper-text" data-error=""></span>
                                </div>
                                <div class="input-field col s12">
                                    <input type="date" name="studentEnrollDate" id="studentEnrollDate" class="validate"
                                    value='"""),_display_(/*370.45*/if(studentInfo != null && studentInfo.getFirstEnrollDate() != "null")/*370.114*/ {_display_(Seq[Any](format.raw/*370.116*/(""" """),_display_(/*370.118*/studentInfo/*370.129*/.getFirstEnrollDate()),format.raw/*370.150*/(""" """)))}),format.raw/*370.152*/("""'>
                                    <label for="studentEnrollDate">First Enrollment Date</label>
                                    <span id="studentEnrollDateMsg" class="helper-text" data-error=""></span>
                                </div>
                            </div>
                        """)))}),format.raw/*375.26*/("""

                        """),format.raw/*377.74*/("""
                        """),format.raw/*378.94*/("""
                        """),format.raw/*379.213*/("""
                        """),format.raw/*380.116*/("""
                        """),format.raw/*381.135*/("""
                        """),format.raw/*382.67*/("""
                        """),format.raw/*383.63*/("""
                        """),format.raw/*384.74*/("""
                        """),format.raw/*385.94*/("""
                        """),format.raw/*386.209*/("""
                        """),format.raw/*387.114*/("""
                        """),format.raw/*388.134*/("""
                        """),format.raw/*389.67*/("""
                        """),format.raw/*390.63*/("""
                        """),format.raw/*391.25*/("""<input type="hidden" name="email" hidden value=""""),_display_(/*391.74*/user/*391.78*/.getEmail),format.raw/*391.87*/("""">

                        <div class="actions row">
                            <button id="Save" type="submit" class="btn waves-effect waves-light col s12 blue darken-2">
                                Save<i class="material-icons right">save_alt</i></button>
                        </div>

                        <div class="actions row">
                            """),format.raw/*399.152*/("""
                            """),format.raw/*400.137*/("""
                            """),format.raw/*401.102*/("""
                            """),format.raw/*402.96*/("""
                            """),format.raw/*403.108*/("""
                            """),format.raw/*404.102*/("""
                            """),format.raw/*405.119*/("""
                            """),format.raw/*406.148*/("""
                            """),format.raw/*407.108*/("""
                            """),format.raw/*408.75*/("""
                            """),format.raw/*409.95*/("""
                            """),format.raw/*410.140*/("""
                            """),format.raw/*411.87*/("""
                            """),format.raw/*412.118*/("""
                            """),format.raw/*413.138*/("""
                            """),format.raw/*414.75*/("""
                            """),format.raw/*415.71*/("""
                            """),format.raw/*416.29*/("""<div style="display: flex; justify-content: center; align-items: center; height: 100%;">
                                <a href="/" class="btn waves-effect waves-light col s5 offset-s2 grey"
                                style="transform: translateX(-90px);">
                                    Cancel<i class="material-icons right">cancel</i>
                                </a>
                            </div>
                        </div>
                        <a href=""""),_display_(/*423.35*/routes/*423.41*/.AdminController.userManagement(1, "id")),format.raw/*423.81*/("""" class="btn blue">
                            <i class="material-icons left">arrow_back</i>
                            back to user management
                        </a>
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

  def render(id:Long,userForm:play.data.Form[models.User],user:User,organizations:List[Organization],researcherInfo:ResearcherInfo,studentInfo:StudentInfo): play.twirl.api.HtmlFormat.Appendable = apply(id,userForm,user,organizations,researcherInfo,studentInfo)

  def f:((Long,play.data.Form[models.User],User,List[Organization],ResearcherInfo,StudentInfo) => play.twirl.api.HtmlFormat.Appendable) = (id,userForm,user,organizations,researcherInfo,studentInfo) => apply(id,userForm,user,organizations,researcherInfo,studentInfo)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:40 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/userEditAdmin.scala.html
                  HASH: f35a92226aa710f3dbe2ae0d6eedc183b7ca9f67
                  MATRIX: 1196->1|1423->157|1451->174|1465->181|1545->185|1576->190|1639->227|1653->233|1723->283|1802->336|1816->342|1889->394|2040->518|2068->519|2112->536|3212->1608|3241->1609|3286->1626|3382->1694|3411->1695|3440->1696|3538->1766|3567->1767|3612->1784|3719->1863|3748->1864|3793->1881|3859->1919|3888->1920|3933->1937|4014->1990|4043->1991|4093->2013|4122->2014|4165->2029|4194->2030|4349->2157|4378->2158|4423->2175|4503->2227|4532->2228|4574->2242|4721->2361|4750->2362|4795->2379|5070->2626|5099->2627|5148->2648|5441->2913|5470->2914|5512->2928|5541->2929|5583->2943|5749->3081|5778->3082|5823->3099|6157->3405|6186->3406|6228->3420|6285->3449|6314->3450|6359->3467|6833->3913|6862->3914|6904->3928|7172->4168|7201->4169|7246->4186|7309->4221|7338->4222|7387->4243|7701->4529|7730->4530|7783->4555|7881->4625|7910->4626|7959->4647|8011->4671|8040->4672|8085->4689|8238->4814|8267->4815|8316->4836|8552->5044|8581->5045|8634->5070|8732->5140|8761->5141|8806->5158|8835->5159|8864->5160|8897->5165|8926->5166|8975->5187|9084->5267|9114->5268|9168->5293|9280->5375|9311->5376|9369->5405|9566->5573|9596->5574|9646->5595|9676->5596|9726->5617|9767->5629|9797->5630|9851->5655|10050->5825|10080->5826|10110->5827|10144->5832|10174->5833|10228->5858|10399->6000|10429->6001|10487->6030|10590->6104|10620->6105|10670->6126|10700->6127|10746->6144|10776->6145|10819->6159|10849->6160|10892->6174|10958->6211|10988->6212|11034->6229|11149->6315|11179->6316|11229->6337|11287->6366|11317->6367|11363->6384|11480->6472|11510->6473|11560->6494|11700->6605|11730->6606|11776->6623|11830->6648|11860->6649|11893->6654|11944->155|11973->6665|12003->6668|12048->6703|12089->6705|12122->6710|12353->6912|12370->6918|12432->6957|13074->7571|13088->7575|13116->7581|13362->7799|13376->7803|13407->7812|13577->7954|13614->7981|13655->7983|13733->8032|13860->8127|13934->8173|13971->8200|14012->8202|14090->8251|14221->8350|14295->8396|14332->8423|14373->8425|14451->8474|14580->8571|14650->8612|15083->9017|15099->9023|15169->9070|15817->9689|15832->9693|15861->9699|16144->10169|16215->10272|16285->10313|17134->11133|17149->11137|17185->11150|17837->11773|17881->11806|17914->11809|17929->11813|17972->11831|18612->12442|18627->12446|18662->12458|18983->12799|19041->12897|19100->13038|19159->13271|19217->13348|19276->13555|19334->13625|19392->13715|19451->14041|19509->14130|19568->14266|19627->14391|19685->14462|19743->14529|19801->14607|19859->14705|19918->14914|19977->15029|20036->15166|20094->15237|20152->15266|20428->15514|20490->15559|20531->15561|20605->15606|20649->15622|20662->15625|20692->15633|20723->15636|20736->15639|20781->15661|20864->15712|20935->15912|21006->16026|21072->16063|21148->16223|21214->16260|22029->17084|22087->17162|22145->17260|22204->17441|22263->17542|22322->17672|22380->17743|22438->17810|22496->17839|22719->18033|22760->18063|22793->18066|22808->18070|22846->18083|23163->18882|23217->18907|23475->19136|23520->19170|23553->19173|23568->19177|23612->19196|24113->19668|24155->19699|24188->19702|24203->19706|24244->19722|24545->19995|24582->20022|24623->20024|24681->20053|24949->20293|25033->20366|25075->20368|25106->20370|25131->20384|25173->20403|25208->20405|25676->20845|25752->20910|25794->20912|25825->20914|25850->20928|25884->20939|25919->20941|26380->21374|26465->21448|26507->21450|26538->21452|26563->21466|26606->21486|26641->21488|27114->21933|27191->21999|27233->22001|27264->22003|27289->22017|27324->22029|27359->22031|27815->22459|27896->22529|27938->22531|27969->22533|27994->22547|28033->22563|28068->22565|28384->22849|28439->22876|28476->22903|28517->22905|28575->22934|28847->23178|28920->23240|28962->23242|28993->23244|29015->23255|29052->23269|29087->23271|29561->23717|29646->23791|29688->23793|29719->23794|29762->23804|29878->23892|29956->23959|29998->23961|30029->23962|30072->23972|30180->24052|30257->24118|30299->24120|30330->24121|30373->24131|30480->24210|30557->24276|30599->24278|30630->24279|30673->24289|31190->24778|31267->24844|31309->24846|31340->24847|31383->24857|31496->24942|31574->25009|31616->25011|31647->25012|31690->25022|31803->25107|31880->25173|31922->25175|31953->25176|31996->25186|32108->25270|32185->25336|32227->25338|32258->25339|32301->25349|32413->25433|32490->25499|32532->25501|32563->25502|32606->25512|32718->25596|32795->25662|32837->25664|32868->25665|32911->25675|33455->26191|33525->26250|33567->26252|33598->26254|33620->26265|33654->26276|33689->26278|34170->26731|34250->26800|34292->26802|34323->26804|34345->26815|34389->26836|34424->26838|34765->27147|34820->27222|34874->27316|34929->27529|34984->27645|35039->27780|35093->27847|35147->27910|35201->27984|35255->28078|35310->28287|35365->28401|35420->28535|35474->28602|35528->28665|35582->28690|35659->28739|35673->28743|35704->28752|36108->29249|36167->29386|36226->29488|36284->29584|36343->29692|36402->29794|36461->29913|36520->30061|36579->30169|36637->30244|36695->30339|36754->30479|36812->30566|36871->30684|36930->30822|36988->30897|37046->30968|37104->30997|37617->31482|37633->31488|37695->31528
                  LINES: 35->1|38->2|40->3|40->3|42->3|43->4|43->4|43->4|43->4|44->5|44->5|44->5|47->8|47->8|48->9|62->23|62->23|63->24|64->25|64->25|64->25|65->26|65->26|66->27|67->28|67->28|68->29|68->29|68->29|69->30|70->31|70->31|71->32|71->32|72->33|72->33|77->38|77->38|78->39|79->40|79->40|81->42|84->45|84->45|85->46|89->50|89->50|90->51|94->55|94->55|95->56|95->56|97->58|100->61|100->61|101->62|105->66|105->66|107->68|107->68|107->68|108->69|113->74|113->74|115->76|119->80|119->80|120->81|120->81|120->81|121->82|124->85|124->85|125->86|126->87|126->87|127->88|128->89|128->89|129->90|131->92|131->92|132->93|134->95|134->95|135->96|136->97|136->97|137->98|137->98|137->98|137->98|137->98|138->99|139->100|139->100|140->101|140->101|140->101|141->102|144->105|144->105|145->106|145->106|146->107|146->107|146->107|147->108|149->110|149->110|149->110|149->110|149->110|150->111|151->112|151->112|152->113|153->114|153->114|154->115|154->115|155->116|155->116|157->118|157->118|159->120|159->120|159->120|160->121|161->122|161->122|162->123|163->124|163->124|164->125|165->126|165->126|166->127|168->129|168->129|169->130|170->131|170->131|171->132|173->1|174->133|176->135|176->135|176->135|177->136|180->139|180->139|180->139|190->149|190->149|190->149|194->153|194->153|194->153|197->156|197->156|197->156|198->157|199->158|200->159|200->159|200->159|201->160|202->161|203->162|203->162|203->162|204->163|205->164|206->165|215->174|215->174|215->174|223->182|223->182|223->182|225->184|226->185|227->186|239->198|239->198|239->198|245->204|245->204|245->204|245->204|245->204|251->210|251->210|251->210|256->215|257->216|258->217|259->218|260->219|261->220|262->221|263->222|264->223|265->224|266->225|267->226|268->227|269->228|270->229|271->230|272->231|273->232|274->233|275->234|276->235|279->238|279->238|279->238|280->239|280->239|280->239|280->239|280->239|280->239|280->239|281->240|282->241|283->242|284->243|285->244|286->245|299->258|300->259|301->260|302->261|303->262|304->263|305->264|306->265|307->266|309->268|309->268|309->268|309->268|309->268|314->280|315->281|318->284|318->284|318->284|318->284|318->284|325->291|325->291|325->291|325->291|325->291|331->297|331->297|331->297|332->298|335->301|335->301|335->301|335->301|335->301|335->301|335->301|341->307|341->307|341->307|341->307|341->307|341->307|341->307|347->313|347->313|347->313|347->313|347->313|347->313|347->313|353->319|353->319|353->319|353->319|353->319|353->319|353->319|359->325|359->325|359->325|359->325|359->325|359->325|359->325|364->330|366->332|366->332|366->332|367->333|370->336|370->336|370->336|370->336|370->336|370->336|370->336|376->342|376->342|376->342|376->342|376->342|377->343|377->343|377->343|377->343|377->343|378->344|378->344|378->344|378->344|378->344|379->345|379->345|379->345|379->345|379->345|386->352|386->352|386->352|386->352|386->352|387->353|387->353|387->353|387->353|387->353|388->354|388->354|388->354|388->354|388->354|389->355|389->355|389->355|389->355|389->355|390->356|390->356|390->356|390->356|390->356|391->357|391->357|391->357|391->357|391->357|398->364|398->364|398->364|398->364|398->364|398->364|398->364|404->370|404->370|404->370|404->370|404->370|404->370|404->370|409->375|411->377|412->378|413->379|414->380|415->381|416->382|417->383|418->384|419->385|420->386|421->387|422->388|423->389|424->390|425->391|425->391|425->391|425->391|433->399|434->400|435->401|436->402|437->403|438->404|439->405|440->406|441->407|442->408|443->409|444->410|445->411|446->412|447->413|448->414|449->415|450->416|457->423|457->423|457->423
                  -- GENERATED --
              */
          