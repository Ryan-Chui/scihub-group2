
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
/*3.2*/import models.TACandidate

object tacandidateRegister extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
            $(document).ready(function () """),format.raw/*26.43*/("""{"""),format.raw/*26.44*/("""
                """),format.raw/*27.17*/("""$("#addPanel").hide();
                $("#showPanel").click(function () """),format.raw/*28.51*/("""{"""),format.raw/*28.52*/("""
                    """),format.raw/*29.21*/("""var panel = document.getElementById("addPanel");
                    if (panel.style.display == "none") """),format.raw/*30.56*/("""{"""),format.raw/*30.57*/("""
                        """),format.raw/*31.25*/("""$("#btnName").attr("style", "transform:rotate(-45deg);transition:transform 0.3s linear;");
                        $("#buttonText").text("Close Window");
                    """),format.raw/*33.21*/("""}"""),format.raw/*33.22*/("""
                    """),format.raw/*34.21*/("""else """),format.raw/*34.26*/("""{"""),format.raw/*34.27*/("""
                        """),format.raw/*35.25*/("""$("#btnName").attr("style", "transform:rotate(0deg);transition:transform 0.3s linear;");
                        $("#buttonText").text("Add Members");
                        document.getElementById("memberName").value = "";
                        document.getElementById("email").value = "";
                        document.getElementById("email").classList.remove("invalid");
                        document.getElementById("memberName").classList.remove("invalid");
                    """),format.raw/*41.21*/("""}"""),format.raw/*41.22*/("""
                    """),format.raw/*42.21*/("""$("#addPanel").slideToggle();
                """),format.raw/*43.17*/("""}"""),format.raw/*43.18*/(""");



            """),format.raw/*47.13*/("""}"""),format.raw/*47.14*/(""");



            function cancelAdd()"""),format.raw/*51.33*/("""{"""),format.raw/*51.34*/("""
                """),format.raw/*52.17*/("""$("#warningModal2").modal('close');
            """),format.raw/*53.13*/("""}"""),format.raw/*53.14*/("""

            """),format.raw/*55.13*/("""function hiddenOrNot(taJobCourseType) """),format.raw/*55.51*/("""{"""),format.raw/*55.52*/("""
                """),format.raw/*56.17*/("""// divHiddentaJobCourseSelection1
                var hiddenDiv = "divHidden" + taJobCourseType;


                if (hiddenDiv == "divHiddentaJobCourseSelection1")"""),format.raw/*60.67*/("""{"""),format.raw/*60.68*/("""
                    """),format.raw/*61.21*/("""var div = document.getElementById(hiddenDiv);
                    if(div.hidden == true) """),format.raw/*62.44*/("""{"""),format.raw/*62.45*/("""
                        """),format.raw/*63.25*/("""div.hidden = false;
                    """),format.raw/*64.21*/("""}"""),format.raw/*64.22*/("""
                """),format.raw/*65.17*/("""}"""),format.raw/*65.18*/("""else"""),format.raw/*65.22*/("""{"""),format.raw/*65.23*/("""
                    """),format.raw/*66.21*/("""hiddenDiv = "divHiddentaJobCourseSelection1";
                    var div = document.getElementById(hiddenDiv);
                    div.hidden = true;

                    for (var i = 0; i < document.getElementsByName("preferenceCheckbox").length; i++) """),format.raw/*70.103*/("""{"""),format.raw/*70.104*/("""
                        """),format.raw/*71.25*/("""var div = document.getElementsByName("preferenceCheckbox")[i];
                        div.checked = false;
                    """),format.raw/*73.21*/("""}"""),format.raw/*73.22*/("""
                """),format.raw/*74.17*/("""}"""),format.raw/*74.18*/("""
            """),format.raw/*75.13*/("""}"""),format.raw/*75.14*/("""

            """),format.raw/*77.13*/("""function getMultipleCheckBoxPreference() """),format.raw/*77.54*/("""{"""),format.raw/*77.55*/("""
                """),format.raw/*78.17*/("""var taCoursesSelectionHiddenList = [];
                var arr = document.getElementsByName("preferenceCheckbox");

                for (var i = 0; i < arr.length; i++) """),format.raw/*81.54*/("""{"""),format.raw/*81.55*/("""
                    """),format.raw/*82.21*/("""if (arr[i].checked)"""),format.raw/*82.40*/("""{"""),format.raw/*82.41*/("""
                        """),format.raw/*83.25*/("""taCoursesSelectionHiddenList.push(arr[i].value);
                    """),format.raw/*84.21*/("""}"""),format.raw/*84.22*/("""
                """),format.raw/*85.17*/("""}"""),format.raw/*85.18*/("""

                """),format.raw/*87.17*/("""// if (taCoursesSelectionHiddenList.length == 0)
                //     taCoursesSelectionHiddenList = [
                //         "CS 1340 Introduction to Computing Concepts Python",
                //         "CS 1341 Principles of Computer Science Java",
                //         "CS 1342 Programming Concepts C++",
                //         "CS 2353 Discrete Math",
                //         "CS 2340 H/W Core",
                //         "CS 2341 Data Structures",
                //         "CS 3341 S/W Core",
                //         "CS 3377 Ethics",
                //         "CS 5/7312 UI/UX",
                //         "CS 5/7314 Software Testing and Quality Assurance",
                //         "CS 5/7315 Software Project Planning and Management",
                //         "CS 5/7320 Artificial Intelligence",
                //         "CS 5/7331 Data Mining",
                //         "CS 5/7392 Web App Development",
                //         "CS 5/7390 Virtual and Augmented Reality",
                //         "CS 5/7322 NLP",
                //         "CS 8321 ML and Neural Networks",
                //         "CS 5/7324 ML in Python",
                //         "CS/AI Online 7310/7311/7330/7343/7350"
                //     ];

                // for(var i = 0; i <taCoursesSelectionHiddenList.length; i++)"""),format.raw/*110.79*/("""{"""),format.raw/*110.80*/("""
                """),format.raw/*111.17*/("""//     document.getElementById("taCoursesSelectionHidden").value = document.getElementById("taCoursesSelectionHidden").value + taCoursesSelectionHiddenList[i] + "; "
                // """),format.raw/*112.20*/("""}"""),format.raw/*112.21*/("""
                """),format.raw/*113.17*/("""// document.getElementById("taCoursesSelectionHidden").value = document.getElementById("taCoursesSelectionHidden").value.trim();

                var taCoursesSelectionHiddenString = taCoursesSelectionHiddenList.join("; ");

                document.getElementById("taCoursesSelectionHidden").value = taCoursesSelectionHiddenString;

            """),format.raw/*119.13*/("""}"""),format.raw/*119.14*/("""


            """),format.raw/*122.13*/("""function getMultipleCheckBoxUnwanted() """),format.raw/*122.52*/("""{"""),format.raw/*122.53*/("""
                """),format.raw/*123.17*/("""var taCoursesUnwantedList = [];
                var checkboxes = document.getElementsByName("unwantedCheckBox");

                for (var i = 0; i < checkboxes.length; i++) """),format.raw/*126.61*/("""{"""),format.raw/*126.62*/("""
                    """),format.raw/*127.21*/("""if (checkboxes[i].checked) """),format.raw/*127.48*/("""{"""),format.raw/*127.49*/("""
                        """),format.raw/*128.25*/("""taCoursesUnwantedList.push(checkboxes[i].value);
                    """),format.raw/*129.21*/("""}"""),format.raw/*129.22*/("""
                """),format.raw/*130.17*/("""}"""),format.raw/*130.18*/("""

                """),format.raw/*132.17*/("""var unwantedCoursesString = taCoursesUnwantedList.join("; ");

                document.getElementById("taCoursesUnwantedHidden").value = unwantedCoursesString;

            """),format.raw/*136.13*/("""}"""),format.raw/*136.14*/("""



            """),format.raw/*140.13*/("""$("#showPanel").click(function () """),format.raw/*140.47*/("""{"""),format.raw/*140.48*/("""
                """),format.raw/*141.17*/("""$("#warningModal2").modal('close');
            """),format.raw/*142.13*/("""}"""),format.raw/*142.14*/(""")

            function prepareFormForSubmission() //display current HTML
            """),format.raw/*145.13*/("""{"""),format.raw/*145.14*/("""
                """),format.raw/*146.17*/("""getMultipleCheckBoxPreference();
                getMultipleCheckBoxUnwanted();
                if(document.getElementById("smuIdMsg").innerText.length != 0)
                    return false;
                var ajaxflag = true;
                $.ajax("""),format.raw/*151.24*/("""{"""),format.raw/*151.25*/("""
                    """),format.raw/*152.21*/("""type: "GET",
                    success: function (data) """),format.raw/*153.46*/("""{"""),format.raw/*153.47*/("""
                        """),format.raw/*154.25*/("""var response = data;
                        console.log(data);
                        if('badFormat' in response) """),format.raw/*156.53*/("""{"""),format.raw/*156.54*/("""
                            """),format.raw/*157.29*/("""console.log(response['badFormat']);
                            ajaxflag = false;
                        """),format.raw/*159.25*/("""}"""),format.raw/*159.26*/(""" """),format.raw/*159.27*/("""else"""),format.raw/*159.31*/("""{"""),format.raw/*159.32*/("""
                            """),format.raw/*160.29*/("""if('notExisted' in response)"""),format.raw/*160.57*/("""{"""),format.raw/*160.58*/("""
                                """),format.raw/*161.33*/("""ajaxflag = false;
                            """),format.raw/*162.29*/("""}"""),format.raw/*162.30*/("""else"""),format.raw/*162.34*/("""{"""),format.raw/*162.35*/("""

                            """),format.raw/*164.29*/("""}"""),format.raw/*164.30*/("""

                        """),format.raw/*166.25*/("""}"""),format.raw/*166.26*/("""
                    """),format.raw/*167.21*/("""}"""),format.raw/*167.22*/("""
                """),format.raw/*168.17*/("""}"""),format.raw/*168.18*/(""");
                if(!ajaxflag)"""),format.raw/*169.30*/("""{"""),format.raw/*169.31*/("""
                    """),format.raw/*170.21*/("""return false;
                """),format.raw/*171.17*/("""}"""),format.raw/*171.18*/("""


                """),format.raw/*174.17*/("""// if (document.getElementById("agreement").checked == false) """),format.raw/*174.79*/("""{"""),format.raw/*174.80*/("""
                """),format.raw/*175.17*/("""//     document.getElementById("warningMessage").innerText = "You must accept the terms and conditions before you can register a project!";
                //     $("#warningModal").modal();
                //     $("#warningModal").modal('open');
                //     return false;
                // """),format.raw/*179.20*/("""}"""),format.raw/*179.21*/("""

                """),format.raw/*181.17*/("""return true;
            """),format.raw/*182.13*/("""}"""),format.raw/*182.14*/("""
    """),format.raw/*183.5*/("""</script>
""")))};
Seq[Any](format.raw/*184.2*/("""

"""),_display_(/*186.2*/main("General TA Application", scripts)/*186.41*/ {_display_(Seq[Any](format.raw/*186.43*/("""
    """),format.raw/*187.5*/("""<link href='"""),_display_(/*187.18*/routes/*187.24*/.Assets.at("stylesheets/quill.snow.css")),format.raw/*187.64*/("""'
    rel="stylesheet" />
    <script type="text/javascript" src='"""),_display_(/*189.42*/routes/*189.48*/.Assets.at("javascripts/plugins/quill.js")),format.raw/*189.90*/("""'></script>
    <script type="text/javascript" src='"""),_display_(/*190.42*/routes/*190.48*/.Assets.at("javascripts/field_validation_helper.js")),format.raw/*190.100*/("""'></script>

    <div class="container">
        <div class="row">
            <div class="col  s12 m10 offset-m1">
                <div class="card-panel">
                    <h4 class="center form-signin-heading" align="center">
                        General TA Application</h4>
                    <form class="form-signin" enctype="multipart/form-data" id="jobForm" onsubmit="return prepareFormForSubmission()" method="post" action=""""),_display_(/*198.158*/routes/*198.164*/.TACandidateController.tacandidateRegisterPOST()),format.raw/*198.212*/("""">

                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="smuId" id="smuId" class="validate" required>
                                <label for="smuId">SMU ID* </label>
                                <span id="smuIdMsg" class="helper-text" data-success="✓" data-error="Please input smu id" style="color: red;"></span>
                            </div>
                        </div>

                        <div class="row">
                            <fieldset>
                                <legend>Your status</legend>
                                <div class="col s12 m6">
                                    <label>
                                        <input type="radio" name="status" id="taStatus1" value="Ph.D. student">
                                        <span>Ph.D. student</span>
                                    </label>
                                </div>
                                <div class="col s12 m6">
                                    <label>
                                        <input type="radio" name="status" id="taStatus2" value="MS-CS student (2nd year)">
                                        <span>MS-CS student (2nd year)</span>
                                    </label>
                                </div>
                                <div class="col s12 m6">
                                    <label>
                                        <input type="radio" name="status" id="taStatus3" value="MS-CS student (1st year)">
                                        <span>MS-CS student (1st year)</span>
                                    </label>
                                </div>
                                <div class="col s12 m6">
                                    <label>
                                        <input type="radio" name="status" id="taStatus4" value="MS-Cybersecurity student (2nd year)">
                                        <span>MS-Cybersecurity student (2nd year)</span>
                                    </label>
                                </div>
                                <div class="col s12 m6">
                                    <label>
                                        <input type="radio" name="status" id="taStatus5" value="MS-SE student (2nd year)">
                                        <span>MS-SE student (2nd year)</span>
                                    </label>
                                </div>
                                <div class="col s12 m6">
                                    <label>
                                        <input type="radio" name="status" id="taStatus6" value="MS-SE student (1st year)">
                                        <span>MS-SE student (1st year)</span>
                                    </label>
                                </div>
                                <div class="col s12 m6">
                                    <label>
                                        <input type="radio" name="status" id="taStatus7" value="Senior">
                                        <span>Senior</span>
                                    </label>
                                </div>
                                <div class="col s12 m6">
                                    <label>
                                        <input type="radio" name="status" id="taStatus8" value="Junior">
                                        <span>Junior</span>
                                    </label>
                                </div>
                                <div class="col s12 m6">
                                    <label>
                                        <input type="radio" name="status" id="taStatus0" value="Sophmore">
                                        <span>Sophmore</span>
                                    </label>
                                </div>
                                <div class="col s12 m6">
                                    <label>
                                        <input type="radio" name="status" id="taStatus10" value="Freshman">
                                        <span>Freshman</span>
                                    </label>
                                </div>


                            </fieldset>
                        </div>

                        <div class="row">
                            <fieldset>
                                <legend>How many hours you could work as a TA per week?</legend>
                                <div class="col s12 m4">
                                    <label>
                                        <input type="radio" name="hours" id="taCandidateHours1" value="5">
                                        <span>5 hours/week</span>
                                    </label>
                                </div>
                                <div class="col s12 m4">
                                    <label>
                                        <input type="radio" name="hours" id="taCandidateHours2" value="10">
                                        <span>10 hours/week</span>
                                    </label>
                                </div>
                                <div class="col s12 m4">
                                    <label>
                                        <input type="radio" name="hours" id="taCandidateHours3" value="15">
                                        <span>15 hours/week</span>
                                    </label>
                                </div>
                                <div class="col s12 m4">
                                    <label>
                                        <input type="radio" name="hours" id="taCandidateHours4" value="20">
                                        <span>20 hours/week</span>
                                    </label>
                                </div>
                            </fieldset>
                        </div>


                        <div class="row">
                            <div class="input-field col s12">
                                <textarea type="text" style="height: 200px;
                                    word-wtap: break-word; margin-top: 10px;" id="taCandidateCourses" placeholder="" name="courses" required onchange="validateRegex(this.id, /."""),format.raw/*311.177*/("""{"""),format.raw/*311.178*/("""0,600"""),format.raw/*311.183*/("""}"""),format.raw/*311.184*/("""/)"></textarea>
                                <label for="longDescription">Please list CS courses you have completed:*</label>
                                <span id="taCandidateCoursesMsg" class="helper-text" data-success="✓" data-error="The couses must be under 600 characters" style="color: red; font-size: 12px"></span>
                            </div>
                        </div>



                        <div class="row">
                            <fieldset>
                                <legend>Do you have specific preferences for the courses?</legend>
                                <div class="col s12 m4">
                                    <label>
                                        <input type="radio" name="taCoursePreferenceSelection" id="taCoursePreferenceSelection1" value="1" onchange='hiddenOrNot("taJobCourseSelection1")'>
                                        <span>Yes</span>
                                    </label>
                                </div>
                                <div class="col s12 m4">
                                    <label>
                                        <input type="radio" name="taCoursePreferenceSelection" id="taCoursePreferenceSelection2" value="2" onchange='hiddenOrNot("taJobCourseSelection2")'>
                                        <span>No</span>
                                    </label>
                                </div>
                            </fieldset>
                        </div>

                        <div class="row" hidden="true" name="divHiddentaJobCourseSelection" id="divHiddentaJobCourseSelection1">
                            <h5>Courses listed below are all CS courses that need Teaching Assistants</h5>
                            <fieldset>
                                <legend>Please list the courses you would like to be a TA for:</legend>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="preferenceCheckbox" id="taCoursesSelection1" value="CS 1340 Introduction to Computing Concepts Python">
                                        <span>CS 1340 Introduction to Computing Concepts Python</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="preferenceCheckbox" id="taCoursesSelection2" value="CS 1341 Principles of Computer Science Java">
                                        <span>CS 1341 Principles of Computer Science Java</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="preferenceCheckbox" id="taCoursesSelection3" value="CS 1342 Programming Concepts C++">
                                        <span>CS 1342 Programming Concepts C++</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="preferenceCheckbox" id="taCoursesSelection4" value="CS 2353 Discrete Math">
                                        <span>CS 2353 Discrete Math</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="preferenceCheckbox" id="taCoursesSelection5" value="CS 2340 H/W Core">
                                        <span>CS 2340 H/W Core</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="preferenceCheckbox" id="taCoursesSelection6" value="CS 2341 Data Structures">
                                        <span>CS 2341 Data Structures</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="preferenceCheckbox" id="taCoursesSelection9" value="CS 3341 S/W Core">
                                        <span>CS 3341 S/W Core</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="preferenceCheckbox" id="taCoursesSelection9" value="CS 3377 Ethics">
                                        <span>CS 3377 Ethics</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="preferenceCheckbox" id="taCoursesSelection16" value="CS 5/7-312 UI/UX">
                                        <span>CS 5/7312 UI/UX</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="preferenceCheckbox" id="taCoursesSelection16" value="CS 5/7314 Software Testing and Quality Assurance">
                                        <span>CS 5/7314 Software Testing and Quality Assurance</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="preferenceCheckbox" id="taCoursesSelection17" value="CS 5/7315 Software Project Planning and Management">
                                        <span>CS 5/7315 Software Project Planning and Management</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="preferenceCheckbox" id="taCoursesSelection21" value="CS 5/7320 Artificial Intelligence">
                                        <span>CS 5/7320 Artificial Intelligence</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="preferenceCheckbox" id="taCoursesSelection23" value="CS 5/7331 Data Mining">
                                        <span>CS 5/7331 Data Mining</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="preferenceCheckbox" id="taCoursesSelection23" value="CS 5/7392 Web App Development">
                                        <span>CS 5/7392 Web App Development</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="preferenceCheckbox" id="taCoursesSelection23" value="CS 5/7390 Virtual and Augmented Reality">
                                        <span>CS 5/7390 Virtual and Augmented Reality</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="preferenceCheckbox" id="taCoursesSelection23" value="CS 5/7322 NLP">
                                        <span>CS 5/7322 NLP</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="preferenceCheckbox" id="taCoursesSelection23" value="CS 8321 ML and Neural Networks">
                                        <span>CS 8321 ML and Neural Networks</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="preferenceCheckbox" id="taCoursesSelection23" value="CS 5/7324 ML in Python">
                                        <span>CS 5/7324 ML in Python</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="preferenceCheckbox" id="taCoursesSelection23" value="CS/AI Online 7310/7311/7330/7343/7350">
                                        <span>CS/AI Online 7310/7311/7330/7343/7350</span>
                                    </label>
                                </div>

                            </fieldset>
                        </div>

                        <div class="row">
                            <fieldset>
                                <legend>Please list the courses you DO NOT want to be a TA for:</legend>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="unwantedCheckBox" id="taCoursesUnwanted1340" value="CS 1340">
                                        <span>CS 1340</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="unwantedCheckBox" id="taCoursesUnwanted1341" value="CS 1341">
                                        <span>CS 1341</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="unwantedCheckBox" id="taCoursesUnwanted1342" value="CS 1342">
                                        <span>CS 1342</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="unwantedCheckBox" id="taCoursesUnwanted2340" value="CS 2340">
                                        <span>CS 2340</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="unwantedCheckBox" id="taCoursesUnwanted2341" value="CS 2341">
                                        <span>CS 2341</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="unwantedCheckBox" id="taCoursesUnwanted2353" value="CS 2353">
                                        <span>CS 2353</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="unwantedCheckBox" id="taCoursesUnwanted3377" value="CS 3377">
                                        <span>CS 3377</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="unwantedCheckBox" id="taCoursesUnwanted7312" value="CS 5/7-312">
                                        <span>CS 5/7-312</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="unwantedCheckBox" id="taCoursesUnwanted7314" value="CS 5/7-314">
                                        <span>CS 5/7-314</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="unwantedCheckBox" id="taCoursesUnwanted7315" value="CS 5/7-315">
                                        <span>CS 5/7-315</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="unwantedCheckBox" id="taCoursesUnwanted7316" value="CS 5/7-316">
                                        <span>CS 5/7-316</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="unwantedCheckBox" id="taCoursesUnwanted7320" value="CS 5/7-320">
                                        <span>CS 5/7-320</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="unwantedCheckBox" id="taCoursesUnwanted7322" value="CS 5/7-322">
                                        <span>CS 5/7-322</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="unwantedCheckBox" id="taCoursesUnwanted8321" value="CS 8321">
                                        <span>CS 8321</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="unwantedCheckBox" id="taCoursesUnwanted7324" value="CS 5/7-324">
                                        <span>CS 5/7-324</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="unwantedCheckBox" id="taCoursesUnwanted7331" value="CS 5/7-331">
                                        <span>CS 5/7-331</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="unwantedCheckBox" id="taCoursesUnwanted7390" value="CS 5/7-390">
                                        <span>CS 5/7-390</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="unwantedCheckBox" id="taCoursesUnwanted7392" value="CS 5/7-392">
                                        <span>CS 5/7-392</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="unwantedCheckBox" id="taCoursesUnwanted7310" value="CS/AI Online 7310/7311/7330/7343/7350">
                                        <span>CS/AI Online 7310/7311/7330/7343/7350</span>
                                    </label>
                                </div>
                            </fieldset>
                        </div>
                        <div class="row" hidden="true">
                            <div class="input-field col s12">
                                <input type="text" name="preference" id="taCoursesSelectionHidden" >
                            </div>
                        </div>


                        <div class="row" hidden="true">
                            <div class="input-field col s12">
                                <input type="text" name="unwanted" id="taCoursesUnwantedHidden" >
                            </div>
                        </div>





                        <div class="row">
                            <div class="input-field col s12">
                                <textarea type="text" style="height: 200px;
                                    word-wrap: break-word; margin-top: 10px;" id="taCandidateComments" placeholder="" name="comment" onchange="validateRegex(this.id, /."""),format.raw/*598.169*/("""{"""),format.raw/*598.170*/("""0,600"""),format.raw/*598.175*/("""}"""),format.raw/*598.176*/("""/)"></textarea>
                                <label for="longDescription">Please indicate any comments/requests/constraints etc:</label>
                                <span id="taCandidateCoursesMsg" class="helper-text" data-success="✓" data-error="The couses must be under 600 characters" style="color: red; font-size: 12px"></span>
                            </div>
                        </div>

                        <div class="row">
                            <fieldset>
                                <legend>Have you email to Dr. Manikas your resume? (Naming format of your resume file:<\last_name>_<\first_name>.pdf)</legend>
                                <div class="col s12 m4">
                                    <label>
                                        <input type="radio" name="isResumeSent" id="isResumeSent1" value="1">
                                        <span>Yes, I have sent to Dr. Manikas</span>
                                    </label>
                                </div>
                                <div class="col s12 m4">
                                    <label>
                                        <input type="radio" name="isResumeSent" id="isResumeSent2" value="0">
                                        <span>No, I have not sent to Dr. Manikas</span>
                                    </label>
                                </div>
                            </fieldset>
                        </div>


                        <div id="warningModal" class="modal">
                            <div class="modal-content">
                                <h5 class="center" style="color: red">Warning!</h5>
                                <h6 class="center" style="font-weight: bold" id="warningMessage"></h6>
                            </div>
                        </div>


                        <div class="actions row center">
                            <div class="input-field col s12">
                                <button type="submit" id="candidateRegister" class="btn waves-effect waves-light blue darken-2">
                                    Submit</button>
                                <a href=""""),_display_(/*635.43*/routes/*635.49*/.Application.home()),format.raw/*635.68*/("""" class="btn waves-effect waves-light red darken-2">
                                    Cancel</a>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
""")))}),format.raw/*644.2*/("""
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
                  DATE: Fri Apr 24 12:50:36 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/tacandidateRegister.scala.html
                  HASH: c17988cb70c448cfe6cc951905856626fadf6a12
                  MATRIX: 814->1|837->18|860->35|1270->63|1284->70|1364->74|1395->79|1445->102|1473->103|1517->120|1577->153|1605->154|1646->167|1677->170|1706->171|1751->188|1811->220|1840->221|1881->234|1926->251|1955->252|2000->269|2058->299|2087->300|2128->313|2164->321|2193->322|2238->339|2293->366|2322->367|2354->372|2432->423|2447->429|2518->479|2598->532|2613->538|2687->590|2851->726|2880->727|2925->744|3026->817|3055->818|3104->839|3236->943|3265->944|3318->969|3520->1143|3549->1144|3598->1165|3631->1170|3660->1171|3713->1196|4232->1687|4261->1688|4310->1709|4384->1755|4413->1756|4459->1774|4488->1775|4554->1813|4583->1814|4628->1831|4704->1879|4733->1880|4775->1894|4841->1932|4870->1933|4915->1950|5108->2115|5137->2116|5186->2137|5303->2226|5332->2227|5385->2252|5453->2292|5482->2293|5527->2310|5556->2311|5588->2315|5617->2316|5666->2337|5949->2591|5979->2592|6032->2617|6188->2745|6217->2746|6262->2763|6291->2764|6332->2777|6361->2778|6403->2792|6472->2833|6501->2834|6546->2851|6743->3020|6772->3021|6821->3042|6868->3061|6897->3062|6950->3087|7047->3156|7076->3157|7121->3174|7150->3175|7196->3193|8574->4542|8604->4543|8650->4560|8864->4745|8894->4746|8940->4763|9315->5109|9345->5110|9389->5125|9457->5164|9487->5165|9533->5182|9736->5356|9766->5357|9816->5378|9872->5405|9902->5406|9956->5431|10054->5500|10084->5501|10130->5518|10160->5519|10207->5537|10410->5711|10440->5712|10485->5728|10548->5762|10578->5763|10624->5780|10701->5828|10731->5829|10846->5915|10876->5916|10922->5933|11203->6185|11233->6186|11283->6207|11370->6265|11400->6266|11454->6291|11599->6407|11629->6408|11687->6437|11822->6543|11852->6544|11882->6545|11915->6549|11945->6550|12003->6579|12060->6607|12090->6608|12152->6641|12227->6687|12257->6688|12290->6692|12320->6693|12379->6723|12409->6724|12464->6750|12494->6751|12544->6772|12574->6773|12620->6790|12650->6791|12711->6823|12741->6824|12791->6845|12850->6875|12880->6876|12928->6895|13019->6957|13049->6958|13095->6975|13428->7279|13458->7280|13505->7298|13559->7323|13589->7324|13622->7329|13673->7340|13703->7343|13752->7382|13793->7384|13826->7389|13867->7402|13883->7408|13945->7448|14040->7515|14056->7521|14120->7563|14201->7616|14217->7622|14292->7674|14762->8115|14779->8121|14850->8169|21393->14682|21424->14683|21459->14688|21490->14689|39839->33008|39870->33009|39905->33014|39936->33015|42161->35212|42177->35218|42218->35237|42512->35500
                  LINES: 31->1|32->2|33->3|42->5|42->5|44->5|45->6|46->7|46->7|47->8|48->9|48->9|49->10|49->10|49->10|50->11|51->12|51->12|52->13|52->13|52->13|53->14|54->15|54->15|55->16|55->16|55->16|56->17|57->18|57->18|58->19|60->21|60->21|60->21|61->22|61->22|61->22|65->26|65->26|66->27|67->28|67->28|68->29|69->30|69->30|70->31|72->33|72->33|73->34|73->34|73->34|74->35|80->41|80->41|81->42|82->43|82->43|86->47|86->47|90->51|90->51|91->52|92->53|92->53|94->55|94->55|94->55|95->56|99->60|99->60|100->61|101->62|101->62|102->63|103->64|103->64|104->65|104->65|104->65|104->65|105->66|109->70|109->70|110->71|112->73|112->73|113->74|113->74|114->75|114->75|116->77|116->77|116->77|117->78|120->81|120->81|121->82|121->82|121->82|122->83|123->84|123->84|124->85|124->85|126->87|149->110|149->110|150->111|151->112|151->112|152->113|158->119|158->119|161->122|161->122|161->122|162->123|165->126|165->126|166->127|166->127|166->127|167->128|168->129|168->129|169->130|169->130|171->132|175->136|175->136|179->140|179->140|179->140|180->141|181->142|181->142|184->145|184->145|185->146|190->151|190->151|191->152|192->153|192->153|193->154|195->156|195->156|196->157|198->159|198->159|198->159|198->159|198->159|199->160|199->160|199->160|200->161|201->162|201->162|201->162|201->162|203->164|203->164|205->166|205->166|206->167|206->167|207->168|207->168|208->169|208->169|209->170|210->171|210->171|213->174|213->174|213->174|214->175|218->179|218->179|220->181|221->182|221->182|222->183|224->184|226->186|226->186|226->186|227->187|227->187|227->187|227->187|229->189|229->189|229->189|230->190|230->190|230->190|238->198|238->198|238->198|351->311|351->311|351->311|351->311|638->598|638->598|638->598|638->598|675->635|675->635|675->635|684->644
                  -- GENERATED --
              */
          