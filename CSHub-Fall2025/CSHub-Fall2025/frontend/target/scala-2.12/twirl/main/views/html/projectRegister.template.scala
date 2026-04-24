
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
/*3.2*/import models.Project

object projectRegister extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*5.2*/scripts/*5.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.13*/("""
    """),format.raw/*6.5*/("""<style>
        tr """),format.raw/*7.12*/("""{"""),format.raw/*7.13*/("""
            """),format.raw/*8.13*/("""border-bottom: none;
        """),format.raw/*9.9*/("""}"""),format.raw/*9.10*/("""
        """),format.raw/*10.9*/("""td """),format.raw/*10.12*/("""{"""),format.raw/*10.13*/("""
            """),format.raw/*11.13*/("""text-align: center;
        """),format.raw/*12.9*/("""}"""),format.raw/*12.10*/("""
        """),format.raw/*13.9*/(""".ql-editor strong"""),format.raw/*13.26*/("""{"""),format.raw/*13.27*/("""
            """),format.raw/*14.13*/("""font-weight:bold;
        """),format.raw/*15.9*/("""}"""),format.raw/*15.10*/("""
        """),format.raw/*16.9*/("""#editor """),format.raw/*16.17*/("""{"""),format.raw/*16.18*/("""
            """),format.raw/*17.13*/("""height: 375px;
        """),format.raw/*18.9*/("""}"""),format.raw/*18.10*/("""
    """),format.raw/*19.5*/("""</style>

    <script type="text/javascript" src='"""),_display_(/*21.42*/routes/*21.48*/.Assets.at("javascripts/database_field_length.js")),format.raw/*21.98*/("""'></script>
    <script type="text/javascript" src='"""),_display_(/*22.42*/routes/*22.48*/.Assets.at("javascripts/field_validation_helper.js")),format.raw/*22.100*/("""'></script>
    <script type="text/javascript">
            count = 0;
            var quill;
            $(document).ready(function () """),format.raw/*26.43*/("""{"""),format.raw/*26.44*/("""
                """),format.raw/*27.17*/("""/**
                 * This portion defines all the (non)required fields that need validation on max lengths and special
                 * characters, as well as URL validity.
                 */
                validateField("memberName", "memberNameMsg", "varChar255", true);
                validateField("email", "emailMsg", "varChar255", true);
                validateField("title", "titleMsg", "varChar500", true);
                validateField("location", "locationMsg", "varChar200", true);
                validateField("goals", "goalsMsg", "varChar1000", true);
                validateField("tech", "techMsg", "varChar500", false);
                validateNoneRequiredUrl('github', 'githubMsg', 'varChar500');
                validateNoneRequiredUrl('team_page', 'team_pageMsg', 'varChar500');
                validateNoneRequiredUrl('video', 'videoMsg', 'varChar500');

                /****************************** End of Validation Portion **********************************************/

                $("#addPanel").hide();
                $("#showPanel").click(function () """),format.raw/*44.51*/("""{"""),format.raw/*44.52*/("""
                    """),format.raw/*45.21*/("""var panel = document.getElementById("addPanel");
                    if (panel.style.display == "none") """),format.raw/*46.56*/("""{"""),format.raw/*46.57*/("""
                        """),format.raw/*47.25*/("""$("#btnName").attr("style", "transform:rotate(-45deg);transition:transform 0.3s linear;");
                        $("#buttonText").text("Close Window");
                    """),format.raw/*49.21*/("""}"""),format.raw/*49.22*/("""
                    """),format.raw/*50.21*/("""else """),format.raw/*50.26*/("""{"""),format.raw/*50.27*/("""
                        """),format.raw/*51.25*/("""$("#btnName").attr("style", "transform:rotate(0deg);transition:transform 0.3s linear;");
                        $("#buttonText").text("Add Members");
                        document.getElementById("memberName").value = "";
                        document.getElementById("email").value = "";
                        document.getElementById("email").classList.remove("invalid");
                        document.getElementById("memberName").classList.remove("invalid");
                    """),format.raw/*57.21*/("""}"""),format.raw/*57.22*/("""
                    """),format.raw/*58.21*/("""$("#addPanel").slideToggle();
                """),format.raw/*59.17*/("""}"""),format.raw/*59.18*/(""");


                //preview the updated image
                $("#addmember").click(function changepic() """),format.raw/*63.60*/("""{"""),format.raw/*63.61*/("""
                    """),format.raw/*64.21*/("""if (document.getElementById("memberName").value.trim().length==0)"""),format.raw/*64.86*/("""{"""),format.raw/*64.87*/("""
                        """),format.raw/*65.25*/("""document.getElementById("memberName").classList.add("invalid");
                    """),format.raw/*66.21*/("""}"""),format.raw/*66.22*/("""
                    """),format.raw/*67.21*/("""if (document.getElementById("email").value.trim().length==0)"""),format.raw/*67.81*/("""{"""),format.raw/*67.82*/("""
                        """),format.raw/*68.25*/("""document.getElementById("email").classList.add("invalid");
                    """),format.raw/*69.21*/("""}"""),format.raw/*69.22*/("""
                    """),format.raw/*70.21*/("""// document.getElementById("email").value.trim().length()==0;
                    var isName = document.getElementById("memberName").classList.contains("invalid") ? false : true;
                    var isEmail = document.getElementById("email").classList.contains("invalid") ? false : true;

                    if(!isName || !isEmail) return;
                    if (document.getElementById("photo").value == "") """),format.raw/*75.71*/("""{"""),format.raw/*75.72*/("""
                        """),format.raw/*76.25*/("""var url = "../../../../assets/images/person.jpg";
                        showPreview(url);
                        return;
                    """),format.raw/*79.21*/("""}"""),format.raw/*79.22*/("""
                    """),format.raw/*80.21*/("""var reads = new FileReader();
                    f = document.getElementById("photo").files[0];
                    reads.readAsDataURL(f);
                    reads.onload = function (e) """),format.raw/*83.49*/("""{"""),format.raw/*83.50*/("""
                        """),format.raw/*84.25*/("""showPreview(this.result);

                    """),format.raw/*86.21*/("""}"""),format.raw/*86.22*/(""";
                """),format.raw/*87.17*/("""}"""),format.raw/*87.18*/(""");
            """),format.raw/*88.13*/("""}"""),format.raw/*88.14*/(""");

            function checkValidProjectTitle() """),format.raw/*90.47*/("""{"""),format.raw/*90.48*/("""
                """),format.raw/*91.17*/("""var title = document.getElementById("title").value;
                var obj = """),format.raw/*92.27*/("""{"""),format.raw/*92.28*/("""
                    """),format.raw/*93.21*/("""title: title
                """),format.raw/*94.17*/("""}"""),format.raw/*94.18*/(""";

                $.ajax("""),format.raw/*96.24*/("""{"""),format.raw/*96.25*/("""
                    """),format.raw/*97.21*/("""url: "/user/isEmailExisted",
                    url: "/project/isProjectNameExisted",
                    data: JSON.stringify(obj),
                    headers: """),format.raw/*100.30*/("""{"""),format.raw/*100.31*/("""
                        """),format.raw/*101.25*/("""'Content-Type': 'application/json'
                    """),format.raw/*102.21*/("""}"""),format.raw/*102.22*/(""",
                    type: "POST",
                    success: function (data) """),format.raw/*104.46*/("""{"""),format.raw/*104.47*/("""
                        """),format.raw/*105.25*/("""console.log(data);
                        var response = data;
                        if ("error" in response) """),format.raw/*107.50*/("""{"""),format.raw/*107.51*/("""
                            """),format.raw/*108.29*/("""document.getElementById("titleMsg").innerHTML = "Replicated project name, please change another name!"
                        """),format.raw/*109.25*/("""}"""),format.raw/*109.26*/(""" """),format.raw/*109.27*/("""else """),format.raw/*109.32*/("""{"""),format.raw/*109.33*/("""
                            """),format.raw/*110.29*/("""document.getElementById("titleMsg").innerHTML = ""
                        """),format.raw/*111.25*/("""}"""),format.raw/*111.26*/("""
                    """),format.raw/*112.21*/("""}"""),format.raw/*112.22*/("""
                """),format.raw/*113.17*/("""}"""),format.raw/*113.18*/(""")

            """),format.raw/*115.13*/("""}"""),format.raw/*115.14*/("""

            """),format.raw/*117.13*/("""function deleteMember(obj) """),format.raw/*117.40*/("""{"""),format.raw/*117.41*/("""
                """),format.raw/*118.17*/("""var tr  = $(obj).parent().parent();
                tr.remove();
            """),format.raw/*120.13*/("""}"""),format.raw/*120.14*/("""

            """),format.raw/*122.13*/("""function showPreview(url) """),format.raw/*122.39*/("""{"""),format.raw/*122.40*/("""
                """),format.raw/*123.17*/("""var appendItem = "<tr><td><img src=\"" + url + "\" height='35px' style=\"width:35px;border-radius:50%;\"</td>" +
                        "<td>" + $("#memberName").val() + "<input type=\"text\" name='member" + count + "' id='member" + count + "' value=\""+ $("#memberName").val() +"\" style=\"display: none;\"></td>" +
                        "<td>" + $("#email").val() + "<input type=\"text\" name='email" + count + "' id='email" + count + "' value=\""+ $("#email").val() +"\" style=\"display: none;\"></td>" +
                        "<td><a href='javascript:void(0)' onclick='deleteMember(this)'><i style='color:red;' class=\"material-icons\">delete<\i><a></td><td id='clone"+count+"'></td></tr>";
                $("#previewTable").append(appendItem);
                var td = $("#clone" + count);
                var obj = $("#photo").clone();
                obj.attr("id", "photo" + count);
                obj.attr("name", "photo" + count);
                td.append(obj);
                td.attr("style","display:none;");
                count++;
                $("#count").val(count);
                $("#memberName").val("");
                $("#email").val("");
                $("#showpath").val("");
                $("#photo").val("");
            """),format.raw/*140.13*/("""}"""),format.raw/*140.14*/("""

            """),format.raw/*142.13*/("""function cancelAdd()"""),format.raw/*142.33*/("""{"""),format.raw/*142.34*/("""
                """),format.raw/*143.17*/("""$("#warningModal2").modal('close');
            """),format.raw/*144.13*/("""}"""),format.raw/*144.14*/("""

            """),format.raw/*146.13*/("""function addMember()"""),format.raw/*146.33*/("""{"""),format.raw/*146.34*/("""
                """),format.raw/*147.17*/("""var email = document.getElementById("email").value.trim();
                var obj = """),format.raw/*148.27*/("""{"""),format.raw/*148.28*/("""
                    """),format.raw/*149.21*/("""email: email
                """),format.raw/*150.17*/("""}"""),format.raw/*150.18*/(""";
                $.ajax("""),format.raw/*151.24*/("""{"""),format.raw/*151.25*/("""
                    """),format.raw/*152.21*/("""url: "/user/isEmailExisted",
                    data: JSON.stringify(obj),
                    headers: """),format.raw/*154.30*/("""{"""),format.raw/*154.31*/("""
                        """),format.raw/*155.25*/("""'Content-Type': 'application/json'
                    """),format.raw/*156.21*/("""}"""),format.raw/*156.22*/(""",
                    type: "POST",
                    success: function (data) """),format.raw/*158.46*/("""{"""),format.raw/*158.47*/("""
                        """),format.raw/*159.25*/("""var username = data.error.substring(data.error.indexOf('user:')+5, data.error.length);
                        var input = document.getElementById("memberName");
                        input.value = username;
                        if (document.getElementById("photo").value == "") """),format.raw/*162.75*/("""{"""),format.raw/*162.76*/("""
                            """),format.raw/*163.29*/("""var url = "../../../assets/images/person.jpg";
                            showPreview(url);
                            return;
                        """),format.raw/*166.25*/("""}"""),format.raw/*166.26*/("""
                        """),format.raw/*167.25*/("""var reads = new FileReader();
                        f = document.getElementById("photo").files[0];
                        reads.readAsDataURL(f);
                        reads.onload = function (e) """),format.raw/*170.53*/("""{"""),format.raw/*170.54*/("""
                            """),format.raw/*171.29*/("""showPreview(this.result);
                        """),format.raw/*172.25*/("""}"""),format.raw/*172.26*/(""";

                    """),format.raw/*174.21*/("""}"""),format.raw/*174.22*/("""
                """),format.raw/*175.17*/("""}"""),format.raw/*175.18*/(""")
                cancelAdd();
            """),format.raw/*177.13*/("""}"""),format.raw/*177.14*/("""

            """),format.raw/*179.13*/("""$("#showPanel").click(function () """),format.raw/*179.47*/("""{"""),format.raw/*179.48*/("""
                """),format.raw/*180.17*/("""$("#warningModal2").modal('close');
            """),format.raw/*181.13*/("""}"""),format.raw/*181.14*/(""")

            function prepareFormForSubmission() //display current HTML
            """),format.raw/*184.13*/("""{"""),format.raw/*184.14*/("""
                """),format.raw/*185.17*/("""if(document.getElementById("titleMsg").innerText.length != 0)
                    return false;
                var ajaxflag = true;
                var parentProjectId = $("#parentProjectId").val();
                $.ajax("""),format.raw/*189.24*/("""{"""),format.raw/*189.25*/("""
                    """),format.raw/*190.21*/("""url: "/project/checkParentProject/" + parentProjectId,
                    async: false,
                    headers: """),format.raw/*192.30*/("""{"""),format.raw/*192.31*/("""
                        """),format.raw/*193.25*/("""'Content-Type': 'application/json'
                    """),format.raw/*194.21*/("""}"""),format.raw/*194.22*/(""",
                    type: "GET",
                    success: function (data) """),format.raw/*196.46*/("""{"""),format.raw/*196.47*/("""
                        """),format.raw/*197.25*/("""var response = data;
                        console.log(data);
                        if('badFormat' in response) """),format.raw/*199.53*/("""{"""),format.raw/*199.54*/("""
                            """),format.raw/*200.29*/("""console.log(response['badFormat']);
                            $("#parentProjectIdMsg").text(response['badFormat']);
                            ajaxflag = false;
                        """),format.raw/*203.25*/("""}"""),format.raw/*203.26*/(""" """),format.raw/*203.27*/("""else"""),format.raw/*203.31*/("""{"""),format.raw/*203.32*/("""
                            """),format.raw/*204.29*/("""if('notExisted' in response)"""),format.raw/*204.57*/("""{"""),format.raw/*204.58*/("""
                                """),format.raw/*205.33*/("""$("#parentProjectIdMsg").text(response['notExisted']);
                                ajaxflag = false;
                            """),format.raw/*207.29*/("""}"""),format.raw/*207.30*/("""else"""),format.raw/*207.34*/("""{"""),format.raw/*207.35*/("""

                            """),format.raw/*209.29*/("""}"""),format.raw/*209.30*/("""

                        """),format.raw/*211.25*/("""}"""),format.raw/*211.26*/("""
                    """),format.raw/*212.21*/("""}"""),format.raw/*212.22*/("""
                """),format.raw/*213.17*/("""}"""),format.raw/*213.18*/(""");
                if(!ajaxflag)"""),format.raw/*214.30*/("""{"""),format.raw/*214.31*/("""
                    """),format.raw/*215.21*/("""return false;
                """),format.raw/*216.17*/("""}"""),format.raw/*216.18*/("""


                """),format.raw/*219.17*/("""// if (document.getElementById("agreement").checked == false) """),format.raw/*219.79*/("""{"""),format.raw/*219.80*/("""
                """),format.raw/*220.17*/("""//     document.getElementById("warningMessage").innerText = "You must accept the terms and conditions before you can register a project!";
                //     $("#warningModal").modal();
                //     $("#warningModal").modal('open');
                //     return false;
                // """),format.raw/*224.20*/("""}"""),format.raw/*224.21*/("""

                """),format.raw/*226.17*/("""return true;
            """),format.raw/*227.13*/("""}"""),format.raw/*227.14*/("""
    """),format.raw/*228.5*/("""</script>
""")))};
Seq[Any](format.raw/*229.2*/("""

"""),_display_(/*231.2*/main("Register Project", scripts)/*231.35*/ {_display_(Seq[Any](format.raw/*231.37*/("""
    """),format.raw/*232.5*/("""<link href='"""),_display_(/*232.18*/routes/*232.24*/.Assets.at("stylesheets/quill.snow.css")),format.raw/*232.64*/("""'
    rel="stylesheet" />
    <script type="text/javascript" src='"""),_display_(/*234.42*/routes/*234.48*/.Assets.at("javascripts/plugins/quill.js")),format.raw/*234.90*/("""'></script>

    <div class="container">
        <div class="row">
            <div class="col  s12 m10 offset-m1">
                <div class="card-panel">
                    <h4 class="center form-signin-heading" align="center">
                        Register a Project</h4>
                    <form class="form-signin" enctype="multipart/form-data" id="projectForm" method="post" action=""""),_display_(/*242.117*/routes/*242.123*/.ProjectController.projectRegisterPOST()),format.raw/*242.163*/("""">
                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="title" id="title" class="validate" required onchange="checkValidProjectTitle()">
                                <label for="title">
                                    Title* </label>
                                <span id="titleMsg" class="helper-text" data-error="" style="color: red;"></span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="goals" id="goals" class="validate" required>
                                <label for="goal">
                                    Goals* </label>
                                <span id="goalsMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="location" id="location" class="validate" required>
                                <label for="location">
                                    Location* </label>
                                <span id="locationMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>

                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="startDate" id="startDate" class="validate" required>
                                <label for="startDate">
                                    Start Date* </label>
                                <span id="startDateMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>

                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="endDate" id="endDate" class="validate" required>
                                <label for="endDate">
                                    End Date* </label>
                                <span id="endDateMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>

"""),format.raw/*291.46*/("""
"""),format.raw/*292.54*/("""
"""),format.raw/*293.61*/("""
"""),format.raw/*294.138*/("""
"""),format.raw/*295.98*/("""
"""),format.raw/*296.48*/("""
"""),format.raw/*297.107*/("""
"""),format.raw/*298.39*/("""
"""),format.raw/*299.83*/("""
"""),format.raw/*300.140*/("""
"""),format.raw/*301.58*/("""
"""),format.raw/*302.74*/("""
"""),format.raw/*303.51*/("""
"""),format.raw/*304.109*/("""
"""),format.raw/*305.88*/("""
"""),format.raw/*306.111*/("""
"""),format.raw/*307.47*/("""
"""),format.raw/*308.74*/("""
"""),format.raw/*309.106*/("""
"""),format.raw/*310.77*/("""
"""),format.raw/*311.106*/("""
"""),format.raw/*312.47*/("""
"""),format.raw/*313.86*/("""
"""),format.raw/*314.102*/("""
"""),format.raw/*315.82*/("""
"""),format.raw/*316.117*/("""
"""),format.raw/*317.51*/("""
"""),format.raw/*318.76*/("""
"""),format.raw/*319.109*/("""
"""),format.raw/*320.51*/("""
"""),format.raw/*321.47*/("""
"""),format.raw/*322.81*/("""
"""),format.raw/*323.114*/("""
"""),format.raw/*324.63*/("""

"""),format.raw/*326.47*/("""

"""),format.raw/*328.43*/("""
"""),format.raw/*329.39*/("""
"""),format.raw/*330.54*/("""
"""),format.raw/*331.62*/("""
"""),format.raw/*332.74*/("""
"""),format.raw/*333.45*/("""
"""),format.raw/*334.39*/("""
"""),format.raw/*335.35*/("""

                        """),format.raw/*337.25*/("""<div class="row">
                            <div class="input-field col s12">
                                <input type="text" name="tech" id="tech" class="validate">
                                <label for="tech">
                                    Technologies Used* </label>
                                <span id="techMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>

                        <div class="row">

                            <div class="file-field input-field col s12" >
                                <div class="btn waves-effect waves-light blue darken-2" >
                                    <span >Upload Project Picture</span>
                                    <input type="file" accept=".jpeg,.png,.jpg" id="picture" name="picture">
                                </div>
                                <div class="file-path-wrapper">
                                    <input class="file-path validate" type="text">
                                </div>
                            </div>
                        </div>

                        <div class="row">
                            <div class="file-field input-field col s12" >
                                <div class="btn waves-effect waves-light blue darken-2" >
                                    <span >Upload Project PDF</span>
                                    <input type="file" accept=".pdf" id="pdf" name="pdf">
                                </div>
                                <div class="file-path-wrapper">
                                    <input class="file-path validate" type="text">
                                </div>
                            </div>
                        </div>

"""),format.raw/*371.46*/("""
"""),format.raw/*372.66*/("""
"""),format.raw/*373.43*/("""
"""),format.raw/*374.90*/("""
"""),format.raw/*375.56*/("""
"""),format.raw/*376.59*/("""
"""),format.raw/*377.98*/("""
"""),format.raw/*378.39*/("""
"""),format.raw/*379.35*/("""
"""),format.raw/*380.46*/("""
"""),format.raw/*381.66*/("""
"""),format.raw/*382.43*/("""
"""),format.raw/*383.92*/("""
"""),format.raw/*384.57*/("""
"""),format.raw/*385.60*/("""
"""),format.raw/*386.99*/("""
"""),format.raw/*387.39*/("""
"""),format.raw/*388.35*/("""
"""),format.raw/*389.46*/("""
"""),format.raw/*390.66*/("""
"""),format.raw/*391.43*/("""
"""),format.raw/*392.98*/("""
"""),format.raw/*393.60*/("""
"""),format.raw/*394.63*/("""
"""),format.raw/*395.102*/("""
"""),format.raw/*396.39*/("""
"""),format.raw/*397.35*/("""
"""),format.raw/*398.46*/("""
"""),format.raw/*399.66*/("""
"""),format.raw/*400.43*/("""
"""),format.raw/*401.110*/("""
"""),format.raw/*402.66*/("""
"""),format.raw/*403.66*/("""
"""),format.raw/*404.126*/("""
"""),format.raw/*405.39*/("""
"""),format.raw/*406.35*/("""

                        """),format.raw/*408.46*/("""
                            """),format.raw/*409.40*/("""
                                """),format.raw/*410.77*/("""
                                """),format.raw/*411.43*/("""
                                    """),format.raw/*412.156*/("""
                                    """),format.raw/*413.69*/("""
                                    """),format.raw/*414.117*/("""
                                    """),format.raw/*415.125*/("""
                            """),format.raw/*416.41*/("""
                        """),format.raw/*417.35*/("""

                        """),format.raw/*419.25*/("""<div id="warningModal" class="modal">
                            <div class="modal-content">
                                <h5 class="center" style="color: red">Warning!</h5>
                                <h6 class="center" style="font-weight: bold" id="warningMessage"></h6>
                            </div>
                        </div>

                        <div id="warningModal2" class="modal">
                            <div class="modal-content">
                                <h6 class="center" style="font-weight: bold" id="warningMessage2"></h6>
                                <div class="actions row center">
                                    <div class="input-field col s12">
                                        <div class="btn waves-effect waves-light blue darken-2" >
                                            <span id="addMember" onclick="addMember()">Yes</span>
                                        </div>
                                        <div class="btn waves-effect waves-light red darken-2" >
                                            <span id="cancelAdd" onclick="cancelAdd()">No</span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>


                        <div class="actions row center">
                            <div class="input-field col s12">
                                <button type="submit" id="projectRegister" class="btn waves-effect waves-light blue darken-2">
                                    Submit</button>
                                <a href=""""),_display_(/*447.43*/routes/*447.49*/.Application.home()),format.raw/*447.68*/("""" class="btn waves-effect waves-light red darken-2">
                                    Cancel</a>

                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
""")))}),format.raw/*457.2*/("""
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
                  DATE: Fri Apr 24 12:50:34 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/projectRegister.scala.html
                  HASH: cac1088a13fa64a93c14690988e86ab9c739fab3
                  MATRIX: 814->1|837->18|860->35|1262->59|1276->66|1356->70|1387->75|1433->94|1461->95|1501->108|1556->137|1584->138|1620->147|1651->150|1680->151|1721->164|1776->192|1805->193|1841->202|1886->219|1915->220|1956->233|2009->259|2038->260|2074->269|2110->277|2139->278|2180->291|2230->314|2259->315|2291->320|2369->371|2384->377|2455->427|2535->480|2550->486|2624->538|2788->674|2817->675|2862->692|3986->1788|4015->1789|4064->1810|4196->1914|4225->1915|4278->1940|4480->2114|4509->2115|4558->2136|4591->2141|4620->2142|4673->2167|5192->2658|5221->2659|5270->2680|5344->2726|5373->2727|5509->2835|5538->2836|5587->2857|5680->2922|5709->2923|5762->2948|5874->3032|5903->3033|5952->3054|6040->3114|6069->3115|6122->3140|6229->3219|6258->3220|6307->3241|6750->3656|6779->3657|6832->3682|7004->3826|7033->3827|7082->3848|7299->4037|7328->4038|7381->4063|7456->4110|7485->4111|7531->4129|7560->4130|7603->4145|7632->4146|7710->4196|7739->4197|7784->4214|7890->4292|7919->4293|7968->4314|8025->4343|8054->4344|8108->4370|8137->4371|8186->4392|8378->4555|8408->4556|8462->4581|8546->4636|8576->4637|8686->4718|8716->4719|8770->4744|8912->4857|8942->4858|9000->4887|9156->5014|9186->5015|9216->5016|9250->5021|9280->5022|9338->5051|9442->5126|9472->5127|9522->5148|9552->5149|9598->5166|9628->5167|9672->5182|9702->5183|9745->5197|9801->5224|9831->5225|9877->5242|9983->5319|10013->5320|10056->5334|10111->5360|10141->5361|10187->5378|11479->6641|11509->6642|11552->6656|11601->6676|11631->6677|11677->6694|11754->6742|11784->6743|11827->6757|11876->6777|11906->6778|11952->6795|12066->6880|12096->6881|12146->6902|12204->6931|12234->6932|12288->6957|12318->6958|12368->6979|12502->7084|12532->7085|12586->7110|12670->7165|12700->7166|12810->7247|12840->7248|12894->7273|13207->7557|13237->7558|13295->7587|13477->7740|13507->7741|13561->7766|13791->7967|13821->7968|13879->7997|13958->8047|13988->8048|14040->8071|14070->8072|14116->8089|14146->8090|14218->8133|14248->8134|14291->8148|14354->8182|14384->8183|14430->8200|14507->8248|14537->8249|14652->8335|14682->8336|14728->8353|14980->8576|15010->8577|15060->8598|15207->8716|15237->8717|15291->8742|15375->8797|15405->8798|15514->8878|15544->8879|15598->8904|15743->9020|15773->9021|15831->9050|16048->9238|16078->9239|16108->9240|16141->9244|16171->9245|16229->9274|16286->9302|16316->9303|16378->9336|16540->9469|16570->9470|16603->9474|16633->9475|16692->9505|16722->9506|16777->9532|16807->9533|16857->9554|16887->9555|16933->9572|16963->9573|17024->9605|17054->9606|17104->9627|17163->9657|17193->9658|17241->9677|17332->9739|17362->9740|17408->9757|17741->10061|17771->10062|17818->10080|17872->10105|17902->10106|17935->10111|17986->10122|18016->10125|18059->10158|18100->10160|18133->10165|18174->10178|18190->10184|18252->10224|18347->10291|18363->10297|18427->10339|18852->10735|18869->10741|18932->10781|21579->13444|21609->13498|21639->13559|21670->13697|21700->13795|21730->13843|21761->13950|21791->13989|21821->14072|21852->14212|21882->14270|21912->14344|21942->14395|21973->14504|22003->14592|22034->14703|22064->14750|22094->14824|22125->14930|22155->15007|22186->15113|22216->15160|22246->15246|22277->15348|22307->15430|22338->15547|22368->15598|22398->15674|22429->15783|22459->15834|22489->15881|22519->15962|22550->16076|22580->16139|22611->16187|22642->16231|22672->16270|22702->16324|22732->16386|22762->16460|22792->16505|22822->16544|22852->16579|22907->16605|24720->18434|24750->18500|24780->18543|24810->18633|24840->18689|24870->18748|24900->18846|24930->18885|24960->18920|24990->18966|25020->19032|25050->19075|25080->19167|25110->19224|25140->19284|25170->19383|25200->19422|25230->19457|25260->19503|25290->19569|25320->19612|25350->19710|25380->19770|25410->19833|25441->19935|25471->19974|25501->20009|25531->20055|25561->20121|25591->20164|25622->20274|25652->20340|25682->20406|25713->20532|25743->20571|25773->20606|25828->20653|25886->20693|25948->20770|26010->20813|26077->20969|26143->21038|26210->21155|26277->21280|26335->21321|26389->21356|26444->21382|28152->23062|28168->23068|28209->23087|28504->23351
                  LINES: 31->1|32->2|33->3|42->5|42->5|44->5|45->6|46->7|46->7|47->8|48->9|48->9|49->10|49->10|49->10|50->11|51->12|51->12|52->13|52->13|52->13|53->14|54->15|54->15|55->16|55->16|55->16|56->17|57->18|57->18|58->19|60->21|60->21|60->21|61->22|61->22|61->22|65->26|65->26|66->27|83->44|83->44|84->45|85->46|85->46|86->47|88->49|88->49|89->50|89->50|89->50|90->51|96->57|96->57|97->58|98->59|98->59|102->63|102->63|103->64|103->64|103->64|104->65|105->66|105->66|106->67|106->67|106->67|107->68|108->69|108->69|109->70|114->75|114->75|115->76|118->79|118->79|119->80|122->83|122->83|123->84|125->86|125->86|126->87|126->87|127->88|127->88|129->90|129->90|130->91|131->92|131->92|132->93|133->94|133->94|135->96|135->96|136->97|139->100|139->100|140->101|141->102|141->102|143->104|143->104|144->105|146->107|146->107|147->108|148->109|148->109|148->109|148->109|148->109|149->110|150->111|150->111|151->112|151->112|152->113|152->113|154->115|154->115|156->117|156->117|156->117|157->118|159->120|159->120|161->122|161->122|161->122|162->123|179->140|179->140|181->142|181->142|181->142|182->143|183->144|183->144|185->146|185->146|185->146|186->147|187->148|187->148|188->149|189->150|189->150|190->151|190->151|191->152|193->154|193->154|194->155|195->156|195->156|197->158|197->158|198->159|201->162|201->162|202->163|205->166|205->166|206->167|209->170|209->170|210->171|211->172|211->172|213->174|213->174|214->175|214->175|216->177|216->177|218->179|218->179|218->179|219->180|220->181|220->181|223->184|223->184|224->185|228->189|228->189|229->190|231->192|231->192|232->193|233->194|233->194|235->196|235->196|236->197|238->199|238->199|239->200|242->203|242->203|242->203|242->203|242->203|243->204|243->204|243->204|244->205|246->207|246->207|246->207|246->207|248->209|248->209|250->211|250->211|251->212|251->212|252->213|252->213|253->214|253->214|254->215|255->216|255->216|258->219|258->219|258->219|259->220|263->224|263->224|265->226|266->227|266->227|267->228|269->229|271->231|271->231|271->231|272->232|272->232|272->232|272->232|274->234|274->234|274->234|282->242|282->242|282->242|331->291|332->292|333->293|334->294|335->295|336->296|337->297|338->298|339->299|340->300|341->301|342->302|343->303|344->304|345->305|346->306|347->307|348->308|349->309|350->310|351->311|352->312|353->313|354->314|355->315|356->316|357->317|358->318|359->319|360->320|361->321|362->322|363->323|364->324|366->326|368->328|369->329|370->330|371->331|372->332|373->333|374->334|375->335|377->337|411->371|412->372|413->373|414->374|415->375|416->376|417->377|418->378|419->379|420->380|421->381|422->382|423->383|424->384|425->385|426->386|427->387|428->388|429->389|430->390|431->391|432->392|433->393|434->394|435->395|436->396|437->397|438->398|439->399|440->400|441->401|442->402|443->403|444->404|445->405|446->406|448->408|449->409|450->410|451->411|452->412|453->413|454->414|455->415|456->416|457->417|459->419|487->447|487->447|487->447|497->457
                  -- GENERATED --
              */
          