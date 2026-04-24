
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
/*1.2*/import helper._
/*2.2*/import models._
/*3.2*/import models.Technology

object jobRegister extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*5.2*/scripts/*5.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.13*/("""
    """),format.raw/*6.5*/("""<style>
            tr """),format.raw/*7.16*/("""{"""),format.raw/*7.17*/("""
                """),format.raw/*8.17*/("""border-bottom: none;
            """),format.raw/*9.13*/("""}"""),format.raw/*9.14*/("""
            """),format.raw/*10.13*/("""td """),format.raw/*10.16*/("""{"""),format.raw/*10.17*/("""
                """),format.raw/*11.17*/("""text-align: center;
            """),format.raw/*12.13*/("""}"""),format.raw/*12.14*/("""
            """),format.raw/*13.13*/(""".ql-editor strong"""),format.raw/*13.30*/("""{"""),format.raw/*13.31*/("""
                """),format.raw/*14.17*/("""font-weight:bold;
            """),format.raw/*15.13*/("""}"""),format.raw/*15.14*/("""
            """),format.raw/*16.13*/("""#editor """),format.raw/*16.21*/("""{"""),format.raw/*16.22*/("""
                """),format.raw/*17.17*/("""height: 375px;
            """),format.raw/*18.13*/("""}"""),format.raw/*18.14*/("""
    """),format.raw/*19.5*/("""</style>

    <script type="text/javascript" src='"""),_display_(/*21.42*/routes/*21.48*/.Assets.at("javascripts/database_field_length.js")),format.raw/*21.98*/("""'></script>
    <script type="text/javascript" src='"""),_display_(/*22.42*/routes/*22.48*/.Assets.at("javascripts/field_validation_helper.js")),format.raw/*22.100*/("""'></script>
    <script type="text/javascript">
            count = 0;
            var quill;
            var isSalaryNotMatched;
            $(document).ready(function () """),format.raw/*27.43*/("""{"""),format.raw/*27.44*/("""
                """),format.raw/*28.17*/("""$("#addPanel").hide();
                $("#showPanel").click(function () """),format.raw/*29.51*/("""{"""),format.raw/*29.52*/("""
                    """),format.raw/*30.21*/("""var panel = document.getElementById("addPanel");
                    if (panel.style.display == "none") """),format.raw/*31.56*/("""{"""),format.raw/*31.57*/("""
                        """),format.raw/*32.25*/("""$("#btnName").attr("style", "transform:rotate(-45deg);transition:transform 0.3s linear;");
                        $("#buttonText").text("Close Window");
                    """),format.raw/*34.21*/("""}"""),format.raw/*34.22*/("""
                    """),format.raw/*35.21*/("""else """),format.raw/*35.26*/("""{"""),format.raw/*35.27*/("""
                        """),format.raw/*36.25*/("""$("#btnName").attr("style", "transform:rotate(0deg);transition:transform 0.3s linear;");
                        $("#buttonText").text("Add Members");
                        document.getElementById("memberName").value = "";
                        document.getElementById("email").value = "";
                        document.getElementById("email").classList.remove("invalid");
                        document.getElementById("memberName").classList.remove("invalid");
                    """),format.raw/*42.21*/("""}"""),format.raw/*42.22*/("""
                    """),format.raw/*43.21*/("""$("#addPanel").slideToggle();
                """),format.raw/*44.17*/("""}"""),format.raw/*44.18*/(""");



            """),format.raw/*48.13*/("""}"""),format.raw/*48.14*/(""");

            function checkValidJobTitle() """),format.raw/*50.43*/("""{"""),format.raw/*50.44*/("""
                """),format.raw/*51.17*/("""var title = document.getElementById("title").value;
                var obj = """),format.raw/*52.27*/("""{"""),format.raw/*52.28*/("""
                    """),format.raw/*53.21*/("""title: title
                """),format.raw/*54.17*/("""}"""),format.raw/*54.18*/(""";

                $.ajax("""),format.raw/*56.24*/("""{"""),format.raw/*56.25*/("""
                    """),format.raw/*57.21*/("""url: "/job/isJobNameExisted",
                    data: JSON.stringify(obj),
                    headers: """),format.raw/*59.30*/("""{"""),format.raw/*59.31*/("""
                        """),format.raw/*60.25*/("""'Content-Type': 'application/json'
                    """),format.raw/*61.21*/("""}"""),format.raw/*61.22*/(""",
                    type: "POST",
                    success: function (data) """),format.raw/*63.46*/("""{"""),format.raw/*63.47*/("""
                        """),format.raw/*64.25*/("""console.log(data);
                        var response = data;
                        if ("error" in response) """),format.raw/*66.50*/("""{"""),format.raw/*66.51*/("""
                            """),format.raw/*67.29*/("""document.getElementById("titleMsg").innerHTML = "Replicated job name, please change another name!"
                        """),format.raw/*68.25*/("""}"""),format.raw/*68.26*/(""" """),format.raw/*68.27*/("""else """),format.raw/*68.32*/("""{"""),format.raw/*68.33*/("""
                            """),format.raw/*69.29*/("""document.getElementById("titleMsg").innerHTML = ""
                        """),format.raw/*70.25*/("""}"""),format.raw/*70.26*/("""
                    """),format.raw/*71.21*/("""}"""),format.raw/*71.22*/("""
                """),format.raw/*72.17*/("""}"""),format.raw/*72.18*/(""")

            """),format.raw/*74.13*/("""}"""),format.raw/*74.14*/("""

            """),format.raw/*76.13*/("""function compareSalaryRange()"""),format.raw/*76.42*/("""{"""),format.raw/*76.43*/("""
                """),format.raw/*77.17*/("""var value1;
                var value2;
                value1 = document.getElementById("minSalary").value;
                value2 = document.getElementById("maxSalary").value;
                if (value1 > value2)"""),format.raw/*81.37*/("""{"""),format.raw/*81.38*/("""
                    """),format.raw/*82.21*/("""isSalaryNotMatched = true;
                    document.getElementById("maxSalaryMsg").innerHTML = "Max Salary should more than or equal to Min Salary"
                    document.getElementById("minSalaryMsg").innerHTML = "Min Salary should less than or equal to Max Salary"
                    return false
                """),format.raw/*86.17*/("""}"""),format.raw/*86.18*/(""" """),format.raw/*86.19*/("""else """),format.raw/*86.24*/("""{"""),format.raw/*86.25*/("""
                    """),format.raw/*87.21*/("""isSalaryNotMatched = false;
                    return true
                """),format.raw/*89.17*/("""}"""),format.raw/*89.18*/("""
            """),format.raw/*90.13*/("""}"""),format.raw/*90.14*/("""



            """),format.raw/*94.13*/("""function cancelAdd()"""),format.raw/*94.33*/("""{"""),format.raw/*94.34*/("""
                """),format.raw/*95.17*/("""$("#warningModal2").modal('close');
            """),format.raw/*96.13*/("""}"""),format.raw/*96.14*/("""

            """),format.raw/*98.13*/("""function updateTxt() """),format.raw/*98.34*/("""{"""),format.raw/*98.35*/("""
                """),format.raw/*99.17*/("""document.getElementById("jobtxt").click();
            """),format.raw/*100.13*/("""}"""),format.raw/*100.14*/("""

            """),format.raw/*102.13*/("""function camelize(s) """),format.raw/*102.34*/("""{"""),format.raw/*102.35*/("""
                """),format.raw/*103.17*/("""var ss = s.split(' ');
                for(var i = 1; i < ss.length; i++) ss[i] = ss[i].charAt(0).toUpperCase() + ss[i].substring(1);
                return ss.join('');
            """),format.raw/*106.13*/("""}"""),format.raw/*106.14*/("""

            """),format.raw/*108.13*/("""function changeTxt() """),format.raw/*108.34*/("""{"""),format.raw/*108.35*/("""
                """),format.raw/*109.17*/("""if (document.getElementById("jobtxt").value == "") return;
                var reads = new FileReader();
                f = document.getElementById("jobtxt").files[0];
                // reads.readAsDataURL(f);
                reads.readAsText(f);
                reads.onload = function (e) """),format.raw/*114.45*/("""{"""),format.raw/*114.46*/("""
                    """),format.raw/*115.21*/("""var content = e.target.result;
                    var lowerContent = content.toLowerCase();

                    var dic = new Array();
                    dic['title'] = 20;
                    dic['organization'] = 20;
                    dic['location'] = 30;
                    dic['goals'] = 30;
                    dic['short description'] = 20;
                    dic['long description'] = 100;
                    dic['required expertise'] = 30;
                    dic['preferred expertise'] = 30;
                    dic['fields'] = 30;
                    dic['url'] = 100;

                    for (var k in dic) """),format.raw/*130.40*/("""{"""),format.raw/*130.41*/("""
                        """),format.raw/*131.25*/("""var kIndex = lowerContent.indexOf(k + ":");
                        if (kIndex == -1 && k == 'url') """),format.raw/*132.57*/("""{"""),format.raw/*132.58*/("""
                            """),format.raw/*133.29*/("""k = 'http';
                            kIndex = lowerContent.indexOf(k + ":");
                        """),format.raw/*135.25*/("""}"""),format.raw/*135.26*/("""
                        """),format.raw/*136.25*/("""if (kIndex != -1) """),format.raw/*136.43*/("""{"""),format.raw/*136.44*/("""
                            """),format.raw/*137.29*/("""var inputEntry = content.substring(kIndex + k.length + 1).trim();
                            var encloseIndex = inputEntry.indexOf("\n");
                            if (encloseIndex == -1 || encloseIndex > dic[k]) encloseIndex = dic[k];
                            inputEntry = inputEntry.substring(0, encloseIndex).trim();
                            if (k == 'http') """),format.raw/*141.46*/("""{"""),format.raw/*141.47*/("""
                                """),format.raw/*142.33*/("""k = 'url';
                                inputEntry = 'http:' + inputEntry;
                            """),format.raw/*144.29*/("""}"""),format.raw/*144.30*/("""
                            """),format.raw/*145.29*/("""var tagId = camelize(k);
                            $('#' + tagId).val(inputEntry);
                            $("label[for='" + tagId + "']").attr("class", "active");
                        """),format.raw/*148.25*/("""}"""),format.raw/*148.26*/("""
                    """),format.raw/*149.21*/("""}"""),format.raw/*149.22*/("""
                """),format.raw/*150.17*/("""}"""),format.raw/*150.18*/(""";
            """),format.raw/*151.13*/("""}"""),format.raw/*151.14*/("""

            """),format.raw/*153.13*/("""$("#showPanel").click(function () """),format.raw/*153.47*/("""{"""),format.raw/*153.48*/("""
                """),format.raw/*154.17*/("""$("#warningModal2").modal('close');
            """),format.raw/*155.13*/("""}"""),format.raw/*155.14*/(""")

            function prepareFormForSubmission() //display current HTML
            """),format.raw/*158.13*/("""{"""),format.raw/*158.14*/("""
                """),format.raw/*159.17*/("""if(document.getElementById("titleMsg").innerText.length != 0)
                    return false;
                var ajaxflag = true;
                $.ajax("""),format.raw/*162.24*/("""{"""),format.raw/*162.25*/("""
                    """),format.raw/*163.21*/("""type: "GET",
                    success: function (data) """),format.raw/*164.46*/("""{"""),format.raw/*164.47*/("""
                        """),format.raw/*165.25*/("""var response = data;
                        console.log(data);
                        if('badFormat' in response) """),format.raw/*167.53*/("""{"""),format.raw/*167.54*/("""
                            """),format.raw/*168.29*/("""console.log(response['badFormat']);
                            ajaxflag = false;
                        """),format.raw/*170.25*/("""}"""),format.raw/*170.26*/(""" """),format.raw/*170.27*/("""else"""),format.raw/*170.31*/("""{"""),format.raw/*170.32*/("""
                            """),format.raw/*171.29*/("""if('notExisted' in response)"""),format.raw/*171.57*/("""{"""),format.raw/*171.58*/("""
                                """),format.raw/*172.33*/("""ajaxflag = false;
                            """),format.raw/*173.29*/("""}"""),format.raw/*173.30*/("""else"""),format.raw/*173.34*/("""{"""),format.raw/*173.35*/("""

                            """),format.raw/*175.29*/("""}"""),format.raw/*175.30*/("""

                        """),format.raw/*177.25*/("""}"""),format.raw/*177.26*/("""
                    """),format.raw/*178.21*/("""}"""),format.raw/*178.22*/("""
                """),format.raw/*179.17*/("""}"""),format.raw/*179.18*/(""");
                if(!ajaxflag)"""),format.raw/*180.30*/("""{"""),format.raw/*180.31*/("""
                    """),format.raw/*181.21*/("""return false;
                """),format.raw/*182.17*/("""}"""),format.raw/*182.18*/("""


                """),format.raw/*185.17*/("""// if (document.getElementById("agreement").checked == false) """),format.raw/*185.79*/("""{"""),format.raw/*185.80*/("""
                """),format.raw/*186.17*/("""//     document.getElementById("warningMessage").innerText = "You must accept the terms and conditions before you can register a project!";
                //     $("#warningModal").modal();
                //     $("#warningModal").modal('open');
                //     return false;
                // """),format.raw/*190.20*/("""}"""),format.raw/*190.21*/("""

                """),format.raw/*192.17*/("""return true;
            """),format.raw/*193.13*/("""}"""),format.raw/*193.14*/("""

            """),format.raw/*195.13*/("""function deletePDF() """),format.raw/*195.34*/("""{"""),format.raw/*195.35*/("""
                """),format.raw/*196.17*/("""document.getElementById('showImg').src = "";
                $('#pdfRecord').val("delete");
                $("#pdfDeleteBtn").hide();
                $("#pdfDownload").hide();
                $('#pdfPreviewMsg').text("The PDF is deleted. You need to click \"UPDATE\" button below if you want to save the changes.");
            """),format.raw/*201.13*/("""}"""),format.raw/*201.14*/("""

            """),format.raw/*203.13*/("""function clearPDF(inputId, textId) """),format.raw/*203.48*/("""{"""),format.raw/*203.49*/("""
                """),format.raw/*204.17*/("""console.log("clearFile called for", inputId, textId);
                var fileInput = document.getElementById(inputId);
                if(fileInput) """),format.raw/*206.31*/("""{"""),format.raw/*206.32*/("""
                    """),format.raw/*207.21*/("""fileInput.value = "";
                """),format.raw/*208.17*/("""}"""),format.raw/*208.18*/(""" """),format.raw/*208.19*/("""else """),format.raw/*208.24*/("""{"""),format.raw/*208.25*/("""
                    """),format.raw/*209.21*/("""console.error("Cannot find element with id", inputId);
                """),format.raw/*210.17*/("""}"""),format.raw/*210.18*/("""
                """),format.raw/*211.17*/("""var textInput = document.getElementById(textId);
                if(textInput) """),format.raw/*212.31*/("""{"""),format.raw/*212.32*/("""
                    """),format.raw/*213.21*/("""textInput.value = "";
                    $('#' + textId).trigger('change');
                """),format.raw/*215.17*/("""}"""),format.raw/*215.18*/(""" """),format.raw/*215.19*/("""else """),format.raw/*215.24*/("""{"""),format.raw/*215.25*/("""
                    """),format.raw/*216.21*/("""console.error("Cannot find element with id", textId);
                """),format.raw/*217.17*/("""}"""),format.raw/*217.18*/("""
            """),format.raw/*218.13*/("""}"""),format.raw/*218.14*/("""
    """),format.raw/*219.5*/("""</script>
""")))};
Seq[Any](format.raw/*220.2*/("""

"""),_display_(/*222.2*/main("Post Job", scripts)/*222.27*/ {_display_(Seq[Any](format.raw/*222.29*/("""
    """),format.raw/*223.5*/("""<link href='"""),_display_(/*223.18*/routes/*223.24*/.Assets.at("stylesheets/quill.snow.css")),format.raw/*223.64*/("""'
    rel="stylesheet" />
    <script type="text/javascript" src='"""),_display_(/*225.42*/routes/*225.48*/.Assets.at("../../public/javascripts/plugins/quill.js")),format.raw/*225.103*/("""'></script>
    <script type="text/javascript" src='"""),_display_(/*226.42*/routes/*226.48*/.Assets.at("javascripts/field_validation_helper.js")),format.raw/*226.100*/("""'></script>

    <div class="container">
        <div class="row">
            <div class="col  s12 m10 offset-m1">
                <div class="card-panel">
                    <h4 class="center form-signin-heading" align="center">
                        Post Job</h4>
                    <!-- <h6 class="left form-signin-heading" align="center">
                        You can just upload a text file, and our Intelligent Assistant will apply Natural Language Processing to extract core requirements for you to edit/revise.</h6>
                    <div class="row"> -->
                    """),format.raw/*237.31*/("""

"""),format.raw/*239.77*/("""
"""),format.raw/*240.91*/("""
"""),format.raw/*241.42*/("""
"""),format.raw/*242.82*/("""
"""),format.raw/*243.186*/("""
"""),format.raw/*244.69*/("""
"""),format.raw/*245.139*/("""
"""),format.raw/*246.33*/("""
"""),format.raw/*247.31*/("""

                    """),format.raw/*249.21*/("""<!-- <h6 class="left form-signin-heading" align="center">
                        Or you could fill in the following information in-person:</h6> -->
                    <form class="form-signin" enctype="multipart/form-data" id="jobForm" onsubmit="return prepareFormForSubmission()" method="post" action=""""),_display_(/*251.158*/routes/*251.164*/.JobController.jobRegisterPOST()),format.raw/*251.196*/("""">
                        """),format.raw/*269.47*/("""

                        """),format.raw/*271.25*/("""<div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="title" id="title" class="validate" required onchange="checkValidJobTitle()">
                                <label for="title">Title* </label>
                                <span id="titleMsg" class="helper-text" data-success="✓" data-error="Please input a title" style="color: red;"></span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="goals" id="goals" class="validate" required>
                                <label for="goals">Goals* </label>
                                <span id="goalsMsg" class="helper-text" data-success="✓" data-error="Please input goals" style="color: red;"></span>
                            </div>
                        </div>

                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="organization" id="organization" class="validate" required>
                                <label for="organization">
                                    Department/Lab Name* </label>
                                <span id="organizationMsg" class="helper-text" data-success="✓" data-error="Please input the department/lab name" style="color: red;"></span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="location" id="location" class="validate" required>
                                <label for="location">
                                    Location* </label>
                                <span id="locationMsg" class="helper-text" data-success="✓" data-error="Please input the location" style="color: red;"></span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="shortDescription" id="shortDescription" class="validate" required onchange="validateRegex(this.id, /."""),format.raw/*309.152*/("""{"""),format.raw/*309.153*/("""0,100"""),format.raw/*309.158*/("""}"""),format.raw/*309.159*/("""/)">
                                <label for="shortDescription">Short Description* </label>
                                <span id="shortDescriptionMsg" class="helper-text" data-success="✓" data-error="The short description must be under 100 characters" style="color: red;"></span>
                            </div>
                        </div>

                        <div class="row">
                            <div class="input-field col s12">
                                <textarea type="text" style="height: 200px;
                                    word-wtap: break-word; margin-top: 10px;" id="longDescription" placeholder="" name="longDescription" required onchange="validateRegex(this.id, /."""),format.raw/*318.182*/("""{"""),format.raw/*318.183*/("""0,600"""),format.raw/*318.188*/("""}"""),format.raw/*318.189*/("""/)"></textarea>
                                <label for="longDescription">Long Description*</label>
                                <span id="longDescriptionMsg" class="helper-text" data-success="✓" data-error="The long description must be under 600 characters" style="color: red; font-size: 12px"></span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="requiredExpertise" id="keywords" class="validate" required>
                                <label for="requiredExpertise">
                                    Required Expertise* </label>
                                <span id="requiredExpertiseMsg" class="helper-text" data-success="✓" data-error="Please enter some required expertise"></span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="preferredExpertise" id="keywords" class="validate" required>
                                <label for="preferredExpertise">
                                    Preferred Expertise* </label>
                                <span id="preferredExpertise" class="helper-text" data-success="✓" data-error="Please enter some preferred expertise"></span>
                            </div>
                        </div>


                        <div class="row">
                            <div class="input-field col s12">
                                <input type="text" name="fields" id="fields" class="validate" required>
                                <label for="fields">
                                    Fields* </label>
                                <span id="fieldsMsg" class="helper-text" data-success="✓" data-error="Please enter some fields of work"></span>
                            </div>
                        </div>

                        Salary Range
                        <div class="row">
                            <div class="input-field col s12 m5">
                                <input type="number" name="minSalary" id="minSalary" class="validate" value=0 required>
                                <label for="minSalary">Min Salary</label>
                                <span id="minSalaryMsg" class="helper-text" data-success="✓" data-error="Please input a minimum salary" style="color: red"></span>
                            </div>
                            <div class="input-field col s12 m2">_</div>

                            <div class="input-field col s12 m5">
                                <input type="number" name="maxSalary" id="maxSalary" class="validate" value=0 required>
                                <label for="maxSalary">Max Salary</label>
                                <span id="maxSalaryMsg" class="helper-text" data-success="✓" data-error="Please input a maximum salary" style="color: red"></span>
                            </div>
                        </div>

                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="url" id="url" class="validate" onchange="validateRegex(this.id, 'URL')">
                                <label for="url">
                                    TA Job URL </label>
                                <span id="urlMsg" class="helper-text" data-success="✓" data-error="Please input a valid URL"></span>
                            </div>
                        </div>


                        <div class="row">
                            <div class="file-field input-field col s12">
                                <div style="display: flex; align-items: center;">
                                    <div class="btn waves-effect waves-light blue darken-2" style="margin-right: 10px;">
                                        <span>Upload Job PDF</span>
                                        <input type="file" accept=".pdf" id="jobPdf" name="jobPdf">
                                    </div>
                                    <div class="file-path-wrapper" style="flex-grow: 1;">
                                        <input class="file-path validate" type="text" placeholder="Upload job PDF" id="filePathJobPdf" readonly>
                                    </div>
                                        <button type="button" class="btn-small red" onclick="clearPDF('jobPdf','filePathJobPdf')" style="margin-left: 10px;">
                                            Cancel
                                        </button>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div id="warningModal" class="modal">
                            <div class="modal-content">
                                <h5 class="center" style="color: red">Warning!</h5>
                                <h6 class="center" style="font-weight: bold" id="warningMessage"></h6>
                            </div>
                        </div>


                        <div class="actions row center">
                            <div class="input-field col s12">
                                <button type="submit" id="jobRegister" class="btn waves-effect waves-light blue darken-2">
                                    Submit</button>
                                <a href=""""),_display_(/*409.43*/routes/*409.49*/.Application.home()),format.raw/*409.68*/("""" class="btn waves-effect waves-light red darken-2">
                                    Cancel</a>

                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
""")))}),format.raw/*419.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:33 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/jobRegister.scala.html
                  HASH: 65192450ee012b4b41f62883c473a70b947f0a4c
                  MATRIX: 814->1|837->18|860->35|1261->62|1275->69|1355->73|1386->78|1436->101|1464->102|1508->119|1568->152|1596->153|1637->166|1668->169|1697->170|1742->187|1802->219|1831->220|1872->233|1917->250|1946->251|1991->268|2049->298|2078->299|2119->312|2155->320|2184->321|2229->338|2284->365|2313->366|2345->371|2423->422|2438->428|2509->478|2589->531|2604->537|2678->589|2878->761|2907->762|2952->779|3053->852|3082->853|3131->874|3263->978|3292->979|3345->1004|3547->1178|3576->1179|3625->1200|3658->1205|3687->1206|3740->1231|4259->1722|4288->1723|4337->1744|4411->1790|4440->1791|4486->1809|4515->1810|4589->1856|4618->1857|4663->1874|4769->1952|4798->1953|4847->1974|4904->2003|4933->2004|4987->2030|5016->2031|5065->2052|5199->2158|5228->2159|5281->2184|5364->2239|5393->2240|5502->2321|5531->2322|5584->2347|5725->2460|5754->2461|5811->2490|5962->2613|5991->2614|6020->2615|6053->2620|6082->2621|6139->2650|6242->2725|6271->2726|6320->2747|6349->2748|6394->2765|6423->2766|6466->2781|6495->2782|6537->2796|6594->2825|6623->2826|6668->2843|6910->3057|6939->3058|6988->3079|7342->3405|7371->3406|7400->3407|7433->3412|7462->3413|7511->3434|7615->3510|7644->3511|7685->3524|7714->3525|7758->3541|7806->3561|7835->3562|7880->3579|7956->3627|7985->3628|8027->3642|8076->3663|8105->3664|8150->3681|8234->3736|8264->3737|8307->3751|8357->3772|8387->3773|8433->3790|8644->3972|8674->3973|8717->3987|8767->4008|8797->4009|8843->4026|9165->4319|9195->4320|9245->4341|9902->4969|9932->4970|9986->4995|10115->5095|10145->5096|10203->5125|10336->5229|10366->5230|10420->5255|10467->5273|10497->5274|10555->5303|10955->5674|10985->5675|11047->5708|11182->5814|11212->5815|11270->5844|11493->6038|11523->6039|11573->6060|11603->6061|11649->6078|11679->6079|11722->6093|11752->6094|11795->6108|11858->6142|11888->6143|11934->6160|12011->6208|12041->6209|12156->6295|12186->6296|12232->6313|12417->6469|12447->6470|12497->6491|12584->6549|12614->6550|12668->6575|12813->6691|12843->6692|12901->6721|13036->6827|13066->6828|13096->6829|13129->6833|13159->6834|13217->6863|13274->6891|13304->6892|13366->6925|13441->6971|13471->6972|13504->6976|13534->6977|13593->7007|13623->7008|13678->7034|13708->7035|13758->7056|13788->7057|13834->7074|13864->7075|13925->7107|13955->7108|14005->7129|14064->7159|14094->7160|14142->7179|14233->7241|14263->7242|14309->7259|14642->7563|14672->7564|14719->7582|14773->7607|14803->7608|14846->7622|14896->7643|14926->7644|14972->7661|15330->7990|15360->7991|15403->8005|15467->8040|15497->8041|15543->8058|15722->8208|15752->8209|15802->8230|15869->8268|15899->8269|15929->8270|15963->8275|15993->8276|16043->8297|16143->8368|16173->8369|16219->8386|16327->8465|16357->8466|16407->8487|16529->8580|16559->8581|16589->8582|16623->8587|16653->8588|16703->8609|16802->8679|16832->8680|16874->8693|16904->8694|16937->8699|16988->8710|17018->8713|17053->8738|17094->8740|17127->8745|17168->8758|17184->8764|17246->8804|17341->8871|17357->8877|17435->8932|17516->8985|17532->8991|17607->9043|18230->9647|18261->9725|18291->9816|18321->9858|18351->9940|18382->10126|18412->10195|18443->10334|18473->10367|18503->10398|18554->10420|18889->10726|18906->10732|18961->10764|19017->12078|19072->12104|21643->14645|21674->14646|21709->14651|21740->14652|22485->15367|22516->15368|22551->15373|22582->15374|28323->21087|28339->21093|28380->21112|28675->21376
                  LINES: 31->1|32->2|33->3|42->5|42->5|44->5|45->6|46->7|46->7|47->8|48->9|48->9|49->10|49->10|49->10|50->11|51->12|51->12|52->13|52->13|52->13|53->14|54->15|54->15|55->16|55->16|55->16|56->17|57->18|57->18|58->19|60->21|60->21|60->21|61->22|61->22|61->22|66->27|66->27|67->28|68->29|68->29|69->30|70->31|70->31|71->32|73->34|73->34|74->35|74->35|74->35|75->36|81->42|81->42|82->43|83->44|83->44|87->48|87->48|89->50|89->50|90->51|91->52|91->52|92->53|93->54|93->54|95->56|95->56|96->57|98->59|98->59|99->60|100->61|100->61|102->63|102->63|103->64|105->66|105->66|106->67|107->68|107->68|107->68|107->68|107->68|108->69|109->70|109->70|110->71|110->71|111->72|111->72|113->74|113->74|115->76|115->76|115->76|116->77|120->81|120->81|121->82|125->86|125->86|125->86|125->86|125->86|126->87|128->89|128->89|129->90|129->90|133->94|133->94|133->94|134->95|135->96|135->96|137->98|137->98|137->98|138->99|139->100|139->100|141->102|141->102|141->102|142->103|145->106|145->106|147->108|147->108|147->108|148->109|153->114|153->114|154->115|169->130|169->130|170->131|171->132|171->132|172->133|174->135|174->135|175->136|175->136|175->136|176->137|180->141|180->141|181->142|183->144|183->144|184->145|187->148|187->148|188->149|188->149|189->150|189->150|190->151|190->151|192->153|192->153|192->153|193->154|194->155|194->155|197->158|197->158|198->159|201->162|201->162|202->163|203->164|203->164|204->165|206->167|206->167|207->168|209->170|209->170|209->170|209->170|209->170|210->171|210->171|210->171|211->172|212->173|212->173|212->173|212->173|214->175|214->175|216->177|216->177|217->178|217->178|218->179|218->179|219->180|219->180|220->181|221->182|221->182|224->185|224->185|224->185|225->186|229->190|229->190|231->192|232->193|232->193|234->195|234->195|234->195|235->196|240->201|240->201|242->203|242->203|242->203|243->204|245->206|245->206|246->207|247->208|247->208|247->208|247->208|247->208|248->209|249->210|249->210|250->211|251->212|251->212|252->213|254->215|254->215|254->215|254->215|254->215|255->216|256->217|256->217|257->218|257->218|258->219|260->220|262->222|262->222|262->222|263->223|263->223|263->223|263->223|265->225|265->225|265->225|266->226|266->226|266->226|277->237|279->239|280->240|281->241|282->242|283->243|284->244|285->245|286->246|287->247|289->249|291->251|291->251|291->251|292->269|294->271|332->309|332->309|332->309|332->309|341->318|341->318|341->318|341->318|432->409|432->409|432->409|442->419
                  -- GENERATED --
              */
          