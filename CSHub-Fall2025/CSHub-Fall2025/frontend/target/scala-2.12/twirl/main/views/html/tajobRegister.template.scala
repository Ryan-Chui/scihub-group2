
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
/*3.2*/import models.TAJob

object tajobRegister extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
                        """),format.raw/*31.25*/("""$("#btnName").attr("style", "ttansform:rotate(-45deg);ttansition:ttansform 0.3s linear;");
                        $("#buttonText").text("Close Window");
                    """),format.raw/*33.21*/("""}"""),format.raw/*33.22*/("""
                    """),format.raw/*34.21*/("""else """),format.raw/*34.26*/("""{"""),format.raw/*34.27*/("""
                        """),format.raw/*35.25*/("""$("#btnName").attr("style", "ttansform:rotate(0deg);ttansition:ttansform 0.3s linear;");
                        $("#buttonText").text("Add Members");
                        document.getElementById("memberName").value = "";
                        document.getElementById("email").value = "";
                        document.getElementById("email").classList.remove("invalid");
                        document.getElementById("memberName").classList.remove("invalid");
                    """),format.raw/*41.21*/("""}"""),format.raw/*41.22*/("""
                    """),format.raw/*42.21*/("""$("#addPanel").slideToggle();
                """),format.raw/*43.17*/("""}"""),format.raw/*43.18*/(""");



            """),format.raw/*47.13*/("""}"""),format.raw/*47.14*/(""");

            function checkValidJobTitle() """),format.raw/*49.43*/("""{"""),format.raw/*49.44*/("""
                """),format.raw/*50.17*/("""var title = document.getElementById("title").value;
                var obj = """),format.raw/*51.27*/("""{"""),format.raw/*51.28*/("""
                    """),format.raw/*52.21*/("""title: title
                """),format.raw/*53.17*/("""}"""),format.raw/*53.18*/(""";

                $.ajax("""),format.raw/*55.24*/("""{"""),format.raw/*55.25*/("""
                    """),format.raw/*56.21*/("""url: "/job/isJobNameExisted",
                    data: JSON.stringify(obj),
                    headers: """),format.raw/*58.30*/("""{"""),format.raw/*58.31*/("""
                        """),format.raw/*59.25*/("""'Content-Type': 'application/json'
                    """),format.raw/*60.21*/("""}"""),format.raw/*60.22*/(""",
                    type: "POST",
                    success: function (data) """),format.raw/*62.46*/("""{"""),format.raw/*62.47*/("""
                        """),format.raw/*63.25*/("""console.log(data);
                        var response = data;
                        if ("error" in response) """),format.raw/*65.50*/("""{"""),format.raw/*65.51*/("""
                            """),format.raw/*66.29*/("""document.getElementById("titleMsg").innerHTML = "Replicated job name, please change another name!"
                        """),format.raw/*67.25*/("""}"""),format.raw/*67.26*/(""" """),format.raw/*67.27*/("""else """),format.raw/*67.32*/("""{"""),format.raw/*67.33*/("""
                            """),format.raw/*68.29*/("""document.getElementById("titleMsg").innerHTML = ""
                        """),format.raw/*69.25*/("""}"""),format.raw/*69.26*/("""
                    """),format.raw/*70.21*/("""}"""),format.raw/*70.22*/("""
                """),format.raw/*71.17*/("""}"""),format.raw/*71.18*/(""")

            """),format.raw/*73.13*/("""}"""),format.raw/*73.14*/("""


            """),format.raw/*76.13*/("""function cancelAdd()"""),format.raw/*76.33*/("""{"""),format.raw/*76.34*/("""
                """),format.raw/*77.17*/("""$("#warningModal2").modal('close');
            """),format.raw/*78.13*/("""}"""),format.raw/*78.14*/("""

            """),format.raw/*80.13*/("""function hiddenOrNot(taJobCourseType) """),format.raw/*80.51*/("""{"""),format.raw/*80.52*/("""
                """),format.raw/*81.17*/("""// divHiddentaJobCourseSelection1
                var hiddenDiv = "divHidden" + taJobCourseType;


                if (hiddenDiv == "divHiddentaJobCourseSelection1")"""),format.raw/*85.67*/("""{"""),format.raw/*85.68*/("""
                    """),format.raw/*86.21*/("""var div = document.getElementById(hiddenDiv);
                    if(div.hidden == true) """),format.raw/*87.44*/("""{"""),format.raw/*87.45*/("""
                        """),format.raw/*88.25*/("""div.hidden = false;
                    """),format.raw/*89.21*/("""}"""),format.raw/*89.22*/("""
                """),format.raw/*90.17*/("""}"""),format.raw/*90.18*/("""else"""),format.raw/*90.22*/("""{"""),format.raw/*90.23*/("""
                    """),format.raw/*91.21*/("""hiddenDiv = "divHiddentaJobCourseSelection1";
                    var div = document.getElementById(hiddenDiv);
                    div.hidden = true;

                    for (var i = 0; i < document.getElementsByName("taCoursesSelection").length; i++) """),format.raw/*95.103*/("""{"""),format.raw/*95.104*/("""
                        """),format.raw/*96.25*/("""var div = document.getElementsByName("taCoursesSelection")[i];
                        div.checked = false;
                    """),format.raw/*98.21*/("""}"""),format.raw/*98.22*/("""
                """),format.raw/*99.17*/("""}"""),format.raw/*99.18*/("""
            """),format.raw/*100.13*/("""}"""),format.raw/*100.14*/("""

            """),format.raw/*102.13*/("""function getMultipleCheckBox() """),format.raw/*102.44*/("""{"""),format.raw/*102.45*/("""
                """),format.raw/*103.17*/("""var taCoursesSelectionHiddenList = [];
                var arr = document.getElementsByName("taCoursesSelection");

                for (var i = 0; i < arr.length; i++) """),format.raw/*106.54*/("""{"""),format.raw/*106.55*/("""
                    """),format.raw/*107.21*/("""if (arr[i].checked)"""),format.raw/*107.40*/("""{"""),format.raw/*107.41*/("""
                        """),format.raw/*108.25*/("""taCoursesSelectionHiddenList.push(arr[i].value);
                    """),format.raw/*109.21*/("""}"""),format.raw/*109.22*/("""
                """),format.raw/*110.17*/("""}"""),format.raw/*110.18*/("""

                """),format.raw/*112.17*/("""if (taCoursesSelectionHiddenList.length == 0)
                    taCoursesSelectionHiddenList = [
                        "CS 1340 Introduction to Computing Concepts Python",
                        "CS 1341 Principles of Computer Science Java",
                        "CS 1342 Programming Concepts C++",
                        "CS 2353 Discrete Math",
                        "CS 2240 Assembly Language ARM",
                        "CS 2341 Data Structures",
                        "CS 3330 Database Concepts",
                        "CS 3339 Information Assurance and Security",
                        "CS 3342 Programming Language",
                        "CS 3345 Graphical User Interface Design and Implementation",
                        "CS 3353 Fundamentals of Algorithms",
                        "CS 4344 Computer Networks and Distributed Systems",
                        "CS 4345 Software Engineering Principles",
                        "CS 4351/4352 Senior Design",
                        "CS 4381 Digital Computer Design",
                        "CS 5/7314 Software Testing and Quality Assurance",
                        "CS 5/7315 Software Project Planning and Management",
                        "CS 5/7316 Software Requirements",
                        "CS 5/7317 Leadership for Architecting Software Systems",
                        "CS 5/7319 Software Architecture and Design",
                        "CS 5/7320 Artificial Intelligence",
                        "CS 5/7323 Mobile Applications for Sensing and Learning",
                        "CS 5/7331 Data Mining",
                        "CS 5/7339 Computer System Security",
                        "CS 5/7343 Operating Systems and System Software",
                        "CS 5/7345 Advanced Application Programming",
                        "CS 5/7350 Algorithm Engineering",
                        "CS 5/7383 Computer Graphics",
                        "CS 8313 Object Oriented Analysis and Design"
                    ];

                for(var i = 0; i <taCoursesSelectionHiddenList.length; i++)"""),format.raw/*145.76*/("""{"""),format.raw/*145.77*/("""
                    """),format.raw/*146.21*/("""document.getElementById("taCoursesSelectionHidden").value = document.getElementById("taCoursesSelectionHidden").value + taCoursesSelectionHiddenList[i] + "; "
                """),format.raw/*147.17*/("""}"""),format.raw/*147.18*/("""
                """),format.raw/*148.17*/("""document.getElementById("taCoursesSelectionHidden").value = document.getElementById("taCoursesSelectionHidden").value.trim();

            """),format.raw/*150.13*/("""}"""),format.raw/*150.14*/("""



            """),format.raw/*154.13*/("""$("#showPanel").click(function () """),format.raw/*154.47*/("""{"""),format.raw/*154.48*/("""
                """),format.raw/*155.17*/("""$("#warningModal2").modal('close');
            """),format.raw/*156.13*/("""}"""),format.raw/*156.14*/(""")

            function prepareFormForSubmission() //display current HTML
            """),format.raw/*159.13*/("""{"""),format.raw/*159.14*/("""
                """),format.raw/*160.17*/("""getMultipleCheckBox();
                if(document.getElementById("titleMsg").innerText.length != 0)
                    return false;
                var ajaxflag = true;
                $.ajax("""),format.raw/*164.24*/("""{"""),format.raw/*164.25*/("""
                    """),format.raw/*165.21*/("""type: "GET",
                    success: function (data) """),format.raw/*166.46*/("""{"""),format.raw/*166.47*/("""
                        """),format.raw/*167.25*/("""var response = data;
                        console.log(data);
                        if('badFormat' in response) """),format.raw/*169.53*/("""{"""),format.raw/*169.54*/("""
                            """),format.raw/*170.29*/("""console.log(response['badFormat']);
                            ajaxflag = false;
                        """),format.raw/*172.25*/("""}"""),format.raw/*172.26*/(""" """),format.raw/*172.27*/("""else"""),format.raw/*172.31*/("""{"""),format.raw/*172.32*/("""
                            """),format.raw/*173.29*/("""if('notExisted' in response)"""),format.raw/*173.57*/("""{"""),format.raw/*173.58*/("""
                                """),format.raw/*174.33*/("""ajaxflag = false;
                            """),format.raw/*175.29*/("""}"""),format.raw/*175.30*/("""else"""),format.raw/*175.34*/("""{"""),format.raw/*175.35*/("""

                            """),format.raw/*177.29*/("""}"""),format.raw/*177.30*/("""

                        """),format.raw/*179.25*/("""}"""),format.raw/*179.26*/("""
                    """),format.raw/*180.21*/("""}"""),format.raw/*180.22*/("""
                """),format.raw/*181.17*/("""}"""),format.raw/*181.18*/(""");
                if(!ajaxflag)"""),format.raw/*182.30*/("""{"""),format.raw/*182.31*/("""
                    """),format.raw/*183.21*/("""return false;
                """),format.raw/*184.17*/("""}"""),format.raw/*184.18*/("""


                """),format.raw/*187.17*/("""// if (document.getElementById("agreement").checked == false) """),format.raw/*187.79*/("""{"""),format.raw/*187.80*/("""
                """),format.raw/*188.17*/("""//     document.getElementById("warningMessage").innerText = "You must accept the terms and conditions before you can register a project!";
                //     $("#warningModal").modal();
                //     $("#warningModal").modal('open');
                //     return false;
                // """),format.raw/*192.20*/("""}"""),format.raw/*192.21*/("""

                """),format.raw/*194.17*/("""return true;
            """),format.raw/*195.13*/("""}"""),format.raw/*195.14*/("""
    """),format.raw/*196.5*/("""</script>
""")))};
Seq[Any](format.raw/*197.2*/("""

"""),_display_(/*199.2*/main("Post TA Job", scripts)/*199.30*/ {_display_(Seq[Any](format.raw/*199.32*/("""
    """),format.raw/*200.5*/("""<link href='"""),_display_(/*200.18*/routes/*200.24*/.Assets.at("stylesheets/quill.snow.css")),format.raw/*200.64*/("""'
    rel="stylesheet" />
    <script type="text/javascript" src='"""),_display_(/*202.42*/routes/*202.48*/.Assets.at("javascripts/plugins/quill.js")),format.raw/*202.90*/("""'></script>
    <script type="text/javascript" src='"""),_display_(/*203.42*/routes/*203.48*/.Assets.at("javascripts/field_validation_helper.js")),format.raw/*203.100*/("""'></script>

    <div class="container">
        <div class="row">
            <div class="col  s12 m10 offset-m1">
                <div class="card-panel">
                    <h4 class="center form-signin-heading" align="center">
                        Post TA Job</h4>
                    <form class="form-signin" enctype="multipart/form-data" id="jobForm" onsubmit="return prepareFormForSubmission()" method="post" action=""""),_display_(/*211.158*/routes/*211.164*/.TAJobController.tajobRegisterPOST()),format.raw/*211.200*/("""">
                        <div class="row">
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
                                type="text" name="shortDescription" id="shortDescription" class="validate" required onchange="validateRegex(this.id, /."""),format.raw/*251.152*/("""{"""),format.raw/*251.153*/("""0,100"""),format.raw/*251.158*/("""}"""),format.raw/*251.159*/("""/)">
                                <label for="shortDescription">Short Description* </label>
                                <span id="shortDescriptionMsg" class="helper-text" data-success="✓" data-error="The short description must be under 100 characters" style="color: red;"></span>
                            </div>
                        </div>

                        <div class="row">
                            <div class="input-field col s12">
                                <textarea type="text" style="height: 200px;
                                    word-wtap: break-word; margin-top: 10px;" id="longDescription" placeholder="" name="longDescription" required onchange="validateRegex(this.id, /."""),format.raw/*260.182*/("""{"""),format.raw/*260.183*/("""0,600"""),format.raw/*260.188*/("""}"""),format.raw/*260.189*/("""/)"></textarea>
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

                        <div class="row">
                            <div class="input-field col s12">
                                <input type="number" name="workTime" id="workTime" min="0" max="20" value="0" class="validate" required>
                                <label for="fields">
                                    TA Hours/Week* </label>
                                <span id="workTimeMsg" class="helper-text" data-success="✓" data-error="Please input a positive number and less than or equal to 20 hours"></span>
                            </div>
                        </div>


                        <div class="row">
                            <fieldset>
                                <legend>TA Type</legend>
                                <div class="col s12 m6">
                                    <label>
                                        <input type="radio" name="taTypes" id="taType1" value="1">
                                        <span>Grading, TA Office House, Recitation/Lab</span>
                                    </label>
                                </div>
                                <div class="col s12 m6">
                                    <label>
                                        <input type="radio" name="taTypes" id="taType2" value="2">
                                        <span>Grading Only</span>
                                    </label>
                                </div>

                            </fieldset>
                        </div>

                        <div class="row">
                            <fieldset>
                                <legend>For which semester are you Posting?</legend>
                                <div class="col s12 m4">
                                    <label>
                                        <input type="radio" name="taJobSemesterTypes" id="taJobSemesterTypes1" value="1">
                                        <span>Fall</span>
                                    </label>
                                </div>
                                <div class="col s12 m4">
                                    <label>
                                        <input type="radio" name="taJobSemesterTypes" id="taJobSemesterTypes2" value="2">
                                        <span>Spring</span>
                                    </label>
                                </div>
                                <div class="col s12 m4">
                                    <label>
                                        <input type="radio" name="taJobSemesterTypes" id="taJobSemesterTypes3" value="3">
                                        <span>Summer</span>
                                    </label>
                                </div>
                            </fieldset>
                        </div>

                        <div class="row">
                            <fieldset>
                                <legend>Teaching Assistant for Specific Courses</legend>
                                <div class="col s12 m4">
                                    <label>
                                        <input type="radio" name="taJobCourseSelections" id="taJobCourseSelection1" value="1" onchange='hiddenOrNot("taJobCourseSelection1")'>
                                        <span>Yes</span>
                                    </label>
                                </div>
                                <div class="col s12 m4">
                                    <label>
                                        <input type="radio" name="taJobCourseSelections" id="taJobCourseSelection2" value="2" onchange='hiddenOrNot("taJobCourseSelection2")'>
                                        <span>No</span>
                                    </label>
                                </div>
                            </fieldset>
                        </div>

                        <div class="row" hidden="true" name="divHiddentaJobCourseSelection1" id="divHiddentaJobCourseSelection1">
                            <h5>Courses listed below are all CS courses that need Teaching Assistants</h5>
                            <fieldset>
                                <legend>Which Courses do you want to have a TA?</legend>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="taCoursesSelection" id="taCoursesSelection1" value="CS 1340 Introduction to Computing Concepts Python">
                                        <span>CS 1340 Introduction to Computing Concepts Python</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="taCoursesSelection" id="taCoursesSelection2" value="CS 1341 Principles of Computer Science Java">
                                        <span>CS 1341 Principles of Computer Science Java</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="taCoursesSelection" id="taCoursesSelection3" value="CS 1342 Programming Concepts C++">
                                        <span>CS 1342 Programming Concepts C++</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="taCoursesSelection" id="taCoursesSelection4" value="CS 2353 Discrete Math">
                                        <span>CS 2353 Discrete Math</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="taCoursesSelection" id="taCoursesSelection5" value="CS 2240 Assembly Language ARM">
                                        <span>CS 2240 Assembly Language ARM</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="taCoursesSelection" id="taCoursesSelection6" value="CS 2341 Data Structures">
                                        <span>CS 2341 Data Structures</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="taCoursesSelection" id="taCoursesSelection7" value="CS 3330 Database Concepts">
                                        <span>CS 3330 Database Concepts</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="taCoursesSelection" id="taCoursesSelection8" value="CS 3339 Information Assurance and Security">
                                        <span>CS 3339 Information Assurance and Security</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="taCoursesSelection" id="taCoursesSelection9" value="CS 3342 Programming Language">
                                        <span>CS 3342 Programming Language</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="taCoursesSelection" id="taCoursesSelection10" value="CS 3345 Graphical User Interface Design and Implementation">
                                        <span>CS 3345 Graphical User Interface Design and Implementation</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="taCoursesSelection" id="taCoursesSelection11" value="CS 3353 Fundamentals of Algorithms">
                                        <span>CS 3353 Fundamentals of Algorithms</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="taCoursesSelection" id="taCoursesSelection12" value="CS 4344 Computer Networks and Distributed Systems">
                                        <span>CS 4344 Computer Networks and Distributed Systems</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="taCoursesSelection" id="taCoursesSelection13" value="CS 4345 Software Engineering Principles">
                                        <span>CS 4345 Software Engineering Principles</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="taCoursesSelection" id="taCoursesSelection14" value="CS 4351/4352 Senior Design">
                                        <span>CS 4351/4352 Senior Design</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="taCoursesSelection" id="taCoursesSelection15" value="CS 4381 Digital Computer Design">
                                        <span>CS 4381 Digital Computer Design</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="taCoursesSelection" id="taCoursesSelection16" value="CS 5/7314 Software Testing and Quality Assurance">
                                        <span>CS 5/7314 Software Testing and Quality Assurance</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="taCoursesSelection" id="taCoursesSelection17" value="CS 5/7315 Software Project Planning and Management">
                                        <span>CS 5/7315 Software Project Planning and Management</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="taCoursesSelection" id="taCoursesSelection18" value="CS 5/7316 Software Requirements">
                                        <span>CS 5/7316 Software Requirements</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="taCoursesSelection" id="taCoursesSelection19" value="CS 5/7317 Leadership for Architecting Software Systems">
                                        <span>CS 5/7317 Leadership for Architecting Software Systems</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="taCoursesSelection" id="taCoursesSelection20" value="CS 5/7319 Software Architecture and Design">
                                        <span>CS 5/7319 Software Architecture and Design</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="taCoursesSelection" id="taCoursesSelection21" value="CS 5/7320 Artificial Intelligence">
                                        <span>CS 5/7320 Artificial Intelligence</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="taCoursesSelection" id="taCoursesSelection22" value="CS 5/7323 Mobile Applications for Sensing and Learning">
                                        <span>CS 5/7323 Mobile Applications for Sensing and Learning</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="taCoursesSelection" id="taCoursesSelection23" value="CS 5/7331 Data Mining">
                                        <span>CS 5/7331 Data Mining</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="taCoursesSelection" id="taCoursesSelection24" value="CS 5/7339 Computer System Security">
                                        <span>CS 5/7339 Computer System Security</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="taCoursesSelection" id="taCoursesSelection25" value="CS 5/7343 Operating Systems and System Software">
                                        <span>CS 5/7343 Operating Systems and System Software</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="taCoursesSelection" id="taCoursesSelection26" value="CS 5/7345 Advanced Application Programming">
                                        <span>CS 5/7345 Advanced Application Programming</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="taCoursesSelection" id="taCoursesSelection27" value="CS 5/7350 Algorithm Engineering">
                                        <span>CS 5/7350 Algorithm Engineering</span>
                                    </label>
                                </div>

                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="taCoursesSelection" id="taCoursesSelection28" value="CS 5/7383 Computer Graphics">
                                        <span>CS 5/7383 Computer Graphics</span>
                                    </label>
                                </div>

                                <div class="col s12">
                                    <label>
                                        <input type="checkbox" name="taCoursesSelection" id="taCoursesSelection29" value="CS 8313 Object Oriented Analysis and Design">
                                        <span>CS 8313 Object Oriented Analysis and Design</span>
                                    </label>
                                </div>
                            </fieldset>
                        </div>
                        <div class="row" hidden="true">
                            <div class="input-field col s12">
                                <input type="text" name="taCoursesSelectionHidden" id="taCoursesSelectionHidden" >
                            </div>
                        </div>
"""),format.raw/*553.42*/("""
"""),format.raw/*554.46*/("""
"""),format.raw/*555.69*/("""
"""),format.raw/*556.120*/("""
"""),format.raw/*557.114*/("""
"""),format.raw/*558.79*/("""
"""),format.raw/*559.102*/("""
"""),format.raw/*560.73*/("""
"""),format.raw/*561.245*/("""
"""),format.raw/*562.62*/("""
"""),format.raw/*563.48*/("""
"""),format.raw/*564.39*/("""
"""),format.raw/*565.76*/("""

"""),format.raw/*567.69*/("""
"""),format.raw/*568.145*/("""
"""),format.raw/*569.114*/("""
"""),format.raw/*570.79*/("""
"""),format.raw/*571.121*/("""
"""),format.raw/*572.39*/("""
"""),format.raw/*573.35*/("""


                        """),format.raw/*576.25*/("""<div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="url" id="url" class="validate" onchange="validateRegex(this.id, 'URL')">
                                <label for="url">
                                    TA Job URL </label>
                                <span id="urlMsg" class="helper-text" data-success="✓" data-error="Please input a valid URL"></span>
                            </div>
                        </div>

                        <div class="row">
                            <div class="file-field input-field col s12" >
                                <div class="btn waves-effect waves-light blue darken-2" >
                                    <span >Upload TA Job PDF</span>
                                    <input type="file" accept=".pdf" id="pdf" name="pdf">
                                </div>
                                <div class="file-path-wtapper">
                                    <input class="file-path validate" type="text">
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
                                <a href=""""),_display_(/*610.43*/routes/*610.49*/.Application.home()),format.raw/*610.68*/("""" class="btn waves-effect waves-light red darken-2">
                                    Cancel</a>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
""")))}),format.raw/*619.2*/("""
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
                  DATE: Fri Apr 24 12:50:38 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/tajobRegister.scala.html
                  HASH: 4fb61f97cef1ff5473084c03c373f80164d55b50
                  MATRIX: 814->1|837->18|860->35|1258->57|1272->64|1352->68|1383->73|1433->96|1461->97|1505->114|1565->147|1593->148|1634->161|1665->164|1694->165|1739->182|1799->214|1828->215|1869->228|1914->245|1943->246|1988->263|2046->293|2075->294|2116->307|2152->315|2181->316|2226->333|2281->360|2310->361|2342->366|2420->417|2435->423|2506->473|2586->526|2601->532|2675->584|2839->720|2868->721|2913->738|3014->811|3043->812|3092->833|3224->937|3253->938|3306->963|3508->1137|3537->1138|3586->1159|3619->1164|3648->1165|3701->1190|4220->1681|4249->1682|4298->1703|4372->1749|4401->1750|4447->1768|4476->1769|4550->1815|4579->1816|4624->1833|4730->1911|4759->1912|4808->1933|4865->1962|4894->1963|4948->1989|4977->1990|5026->2011|5160->2117|5189->2118|5242->2143|5325->2198|5354->2199|5463->2280|5492->2281|5545->2306|5686->2419|5715->2420|5772->2449|5923->2572|5952->2573|5981->2574|6014->2579|6043->2580|6100->2609|6203->2684|6232->2685|6281->2706|6310->2707|6355->2724|6384->2725|6427->2740|6456->2741|6499->2756|6547->2776|6576->2777|6621->2794|6697->2842|6726->2843|6768->2857|6834->2895|6863->2896|6908->2913|7101->3078|7130->3079|7179->3100|7296->3189|7325->3190|7378->3215|7446->3255|7475->3256|7520->3273|7549->3274|7581->3278|7610->3279|7659->3300|7942->3554|7972->3555|8025->3580|8181->3708|8210->3709|8255->3726|8284->3727|8326->3740|8356->3741|8399->3755|8459->3786|8489->3787|8535->3804|8733->3973|8763->3974|8813->3995|8861->4014|8891->4015|8945->4040|9043->4109|9073->4110|9119->4127|9149->4128|9196->4146|11320->6241|11350->6242|11400->6263|11604->6438|11634->6439|11680->6456|11848->6595|11878->6596|11923->6612|11986->6646|12016->6647|12062->6664|12139->6712|12169->6713|12284->6799|12314->6800|12360->6817|12584->7012|12614->7013|12664->7034|12751->7092|12781->7093|12835->7118|12980->7234|13010->7235|13068->7264|13203->7370|13233->7371|13263->7372|13296->7376|13326->7377|13384->7406|13441->7434|13471->7435|13533->7468|13608->7514|13638->7515|13671->7519|13701->7520|13760->7550|13790->7551|13845->7577|13875->7578|13925->7599|13955->7600|14001->7617|14031->7618|14092->7650|14122->7651|14172->7672|14231->7702|14261->7703|14309->7722|14400->7784|14430->7785|14476->7802|14809->8106|14839->8107|14886->8125|14940->8150|14970->8151|15003->8156|15054->8167|15084->8170|15122->8198|15163->8200|15196->8205|15237->8218|15253->8224|15315->8264|15410->8331|15426->8337|15490->8379|15571->8432|15587->8438|15662->8490|16121->8920|16138->8926|16197->8962|18796->11531|18827->11532|18862->11537|18893->11538|19638->12253|19669->12254|19704->12259|19735->12260|39204->31741|39234->31787|39264->31856|39295->31976|39326->32090|39356->32169|39387->32271|39417->32344|39448->32589|39478->32651|39508->32699|39538->32738|39568->32814|39599->32884|39630->33029|39661->33143|39691->33222|39722->33343|39752->33382|39782->33417|39838->33444|41779->35357|41795->35363|41836->35382|42130->35645
                  LINES: 31->1|32->2|33->3|42->5|42->5|44->5|45->6|46->7|46->7|47->8|48->9|48->9|49->10|49->10|49->10|50->11|51->12|51->12|52->13|52->13|52->13|53->14|54->15|54->15|55->16|55->16|55->16|56->17|57->18|57->18|58->19|60->21|60->21|60->21|61->22|61->22|61->22|65->26|65->26|66->27|67->28|67->28|68->29|69->30|69->30|70->31|72->33|72->33|73->34|73->34|73->34|74->35|80->41|80->41|81->42|82->43|82->43|86->47|86->47|88->49|88->49|89->50|90->51|90->51|91->52|92->53|92->53|94->55|94->55|95->56|97->58|97->58|98->59|99->60|99->60|101->62|101->62|102->63|104->65|104->65|105->66|106->67|106->67|106->67|106->67|106->67|107->68|108->69|108->69|109->70|109->70|110->71|110->71|112->73|112->73|115->76|115->76|115->76|116->77|117->78|117->78|119->80|119->80|119->80|120->81|124->85|124->85|125->86|126->87|126->87|127->88|128->89|128->89|129->90|129->90|129->90|129->90|130->91|134->95|134->95|135->96|137->98|137->98|138->99|138->99|139->100|139->100|141->102|141->102|141->102|142->103|145->106|145->106|146->107|146->107|146->107|147->108|148->109|148->109|149->110|149->110|151->112|184->145|184->145|185->146|186->147|186->147|187->148|189->150|189->150|193->154|193->154|193->154|194->155|195->156|195->156|198->159|198->159|199->160|203->164|203->164|204->165|205->166|205->166|206->167|208->169|208->169|209->170|211->172|211->172|211->172|211->172|211->172|212->173|212->173|212->173|213->174|214->175|214->175|214->175|214->175|216->177|216->177|218->179|218->179|219->180|219->180|220->181|220->181|221->182|221->182|222->183|223->184|223->184|226->187|226->187|226->187|227->188|231->192|231->192|233->194|234->195|234->195|235->196|237->197|239->199|239->199|239->199|240->200|240->200|240->200|240->200|242->202|242->202|242->202|243->203|243->203|243->203|251->211|251->211|251->211|291->251|291->251|291->251|291->251|300->260|300->260|300->260|300->260|593->553|594->554|595->555|596->556|597->557|598->558|599->559|600->560|601->561|602->562|603->563|604->564|605->565|607->567|608->568|609->569|610->570|611->571|612->572|613->573|616->576|650->610|650->610|650->610|659->619
                  -- GENERATED --
              */
          