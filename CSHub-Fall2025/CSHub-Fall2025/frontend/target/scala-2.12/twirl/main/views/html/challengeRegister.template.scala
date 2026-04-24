
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
/*4.2*/import models.Challenge

object challengeRegister extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*6.2*/scripts/*6.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.13*/("""
    """),format.raw/*7.5*/("""<style>
        tr """),format.raw/*8.12*/("""{"""),format.raw/*8.13*/("""
            """),format.raw/*9.13*/("""border-bottom: none;
        """),format.raw/*10.9*/("""}"""),format.raw/*10.10*/("""
        """),format.raw/*11.9*/("""td """),format.raw/*11.12*/("""{"""),format.raw/*11.13*/("""
            """),format.raw/*12.13*/("""text-align: center;
        """),format.raw/*13.9*/("""}"""),format.raw/*13.10*/("""
        """),format.raw/*14.9*/(""".ql-editor strong"""),format.raw/*14.26*/("""{"""),format.raw/*14.27*/("""
            """),format.raw/*15.13*/("""font-weight:bold;
        """),format.raw/*16.9*/("""}"""),format.raw/*16.10*/("""
        """),format.raw/*17.9*/("""#editor """),format.raw/*17.17*/("""{"""),format.raw/*17.18*/("""
            """),format.raw/*18.13*/("""height: 375px;
        """),format.raw/*19.9*/("""}"""),format.raw/*19.10*/("""
    """),format.raw/*20.5*/("""</style>

    <script type="text/javascript" src='"""),_display_(/*22.42*/routes/*22.48*/.Assets.at("javascripts/database_field_length.js")),format.raw/*22.98*/("""'></script>
    <script type="text/javascript" src='"""),_display_(/*23.42*/routes/*23.48*/.Assets.at("javascripts/field_validation_helper.js")),format.raw/*23.100*/("""'></script>
    <script type="text/javascript" src='"""),_display_(/*24.42*/routes/*24.48*/.Assets.at("javascripts/budgetValidation.js")),format.raw/*24.93*/("""'></script>
    <script type="text/javascript">
            count = 0;
            var quill;
            $(document).ready(function () """),format.raw/*28.43*/("""{"""),format.raw/*28.44*/("""
                """),format.raw/*29.17*/("""/**
                 * This portion defines all the (non)required fields that need validation on max lengths and special
                 * characters, as well as URL validity.
                 */
                validateField("memberName", "memberNameMsg", "varChar255", true);
                validateField("email", "emailMsg", "varChar255", true);
                validateField("title", "titleMsg", "varChar500", true);
                validateField("location", "locationMsg", "varChar3", true);
                validateField("goals", "goalsMsg", "varChar1000", true);
                validateField("tech", "techMsg", "varChar500", false);
                validateNoneRequiredUrl('github', 'githubMsg', 'varChar500');
                validateNoneRequiredUrl('team_page', 'team_pageMsg', 'varChar500');
                validateNoneRequiredUrl('video', 'videoMsg', 'varChar500');
                validateNoneRequiredFloat('budget','budgetMsg', 'FLOAT20');
                /****************************** End of Validation Portion **********************************************/

                $("#addPanel").hide();
                $("#showPanel").click(function () """),format.raw/*46.51*/("""{"""),format.raw/*46.52*/("""
                    """),format.raw/*47.21*/("""var panel = document.getElementById("addPanel");
                    if (panel.style.display == "none") """),format.raw/*48.56*/("""{"""),format.raw/*48.57*/("""
                        """),format.raw/*49.25*/("""$("#btnName").attr("style", "transform:rotate(-45deg);transition:transform 0.3s linear;");
                        $("#buttonText").text("Close Window");
                    """),format.raw/*51.21*/("""}"""),format.raw/*51.22*/("""
                    """),format.raw/*52.21*/("""else """),format.raw/*52.26*/("""{"""),format.raw/*52.27*/("""
                        """),format.raw/*53.25*/("""$("#btnName").attr("style", "transform:rotate(0deg);transition:transform 0.3s linear;");
                        $("#buttonText").text("Add Members");
                        document.getElementById("memberName").value = "";
                        document.getElementById("email").value = "";
                        document.getElementById("email").classList.remove("invalid");
                        document.getElementById("memberName").classList.remove("invalid");
                    """),format.raw/*59.21*/("""}"""),format.raw/*59.22*/("""
                    """),format.raw/*60.21*/("""$("#addPanel").slideToggle();
                """),format.raw/*61.17*/("""}"""),format.raw/*61.18*/(""");


                //preview the updated image
                $("#addmember").click(function changepic() """),format.raw/*65.60*/("""{"""),format.raw/*65.61*/("""
                    """),format.raw/*66.21*/("""if (document.getElementById("memberName").value.trim().length==0)"""),format.raw/*66.86*/("""{"""),format.raw/*66.87*/("""
                        """),format.raw/*67.25*/("""document.getElementById("memberName").classList.add("invalid");
                    """),format.raw/*68.21*/("""}"""),format.raw/*68.22*/("""
                    """),format.raw/*69.21*/("""if (document.getElementById("email").value.trim().length==0)"""),format.raw/*69.81*/("""{"""),format.raw/*69.82*/("""
                        """),format.raw/*70.25*/("""document.getElementById("email").classList.add("invalid");
                    """),format.raw/*71.21*/("""}"""),format.raw/*71.22*/("""
                    """),format.raw/*72.21*/("""// document.getElementById("email").value.trim().length()==0;
                    var isName = document.getElementById("memberName").classList.contains("invalid") ? false : true;
                    var isEmail = document.getElementById("email").classList.contains("invalid") ? false : true;

                    if(!isName || !isEmail) return;
                    if (document.getElementById("photo").value == "") """),format.raw/*77.71*/("""{"""),format.raw/*77.72*/("""
                        """),format.raw/*78.25*/("""var url = "../../../../assets/images/person.jpg";
                        showPreview(url);
                        return;
                    """),format.raw/*81.21*/("""}"""),format.raw/*81.22*/("""
                    """),format.raw/*82.21*/("""var reads = new FileReader();
                    f = document.getElementById("photo").files[0];
                    reads.readAsDataURL(f);
                    reads.onload = function (e) """),format.raw/*85.49*/("""{"""),format.raw/*85.50*/("""
                        """),format.raw/*86.25*/("""showPreview(this.result);

                    """),format.raw/*88.21*/("""}"""),format.raw/*88.22*/(""";
                """),format.raw/*89.17*/("""}"""),format.raw/*89.18*/(""");
            """),format.raw/*90.13*/("""}"""),format.raw/*90.14*/(""");

            function checkValidChallengeTitle() """),format.raw/*92.49*/("""{"""),format.raw/*92.50*/("""
                """),format.raw/*93.17*/("""var title = document.getElementById("title").value;
                var obj = """),format.raw/*94.27*/("""{"""),format.raw/*94.28*/("""
                    """),format.raw/*95.21*/("""title: title
                """),format.raw/*96.17*/("""}"""),format.raw/*96.18*/(""";

                $.ajax("""),format.raw/*98.24*/("""{"""),format.raw/*98.25*/("""
                    """),format.raw/*99.21*/("""url: "/user/isEmailExisted",
                    url: "/project/isProjectNameExisted",
                    data: JSON.stringify(obj),
                    headers: """),format.raw/*102.30*/("""{"""),format.raw/*102.31*/("""
                        """),format.raw/*103.25*/("""'Content-Type': 'application/json'
                    """),format.raw/*104.21*/("""}"""),format.raw/*104.22*/(""",
                    type: "POST",
                    success: function (data) """),format.raw/*106.46*/("""{"""),format.raw/*106.47*/("""
                        """),format.raw/*107.25*/("""console.log(data);
                        var response = data;
                        if ("error" in response) """),format.raw/*109.50*/("""{"""),format.raw/*109.51*/("""
                            """),format.raw/*110.29*/("""document.getElementById("titleMsg").innerHTML = "Replicated project name, please change another name!"
                        """),format.raw/*111.25*/("""}"""),format.raw/*111.26*/(""" """),format.raw/*111.27*/("""else """),format.raw/*111.32*/("""{"""),format.raw/*111.33*/("""
                            """),format.raw/*112.29*/("""document.getElementById("titleMsg").innerHTML = ""
                        """),format.raw/*113.25*/("""}"""),format.raw/*113.26*/("""
                    """),format.raw/*114.21*/("""}"""),format.raw/*114.22*/("""
                """),format.raw/*115.17*/("""}"""),format.raw/*115.18*/(""")

            """),format.raw/*117.13*/("""}"""),format.raw/*117.14*/("""

            """),format.raw/*119.13*/("""function deleteMember(obj) """),format.raw/*119.40*/("""{"""),format.raw/*119.41*/("""
                """),format.raw/*120.17*/("""var tr  = $(obj).parent().parent();
                tr.remove();
            """),format.raw/*122.13*/("""}"""),format.raw/*122.14*/("""

            """),format.raw/*124.13*/("""function showPreview(url) """),format.raw/*124.39*/("""{"""),format.raw/*124.40*/("""
                """),format.raw/*125.17*/("""var appendItem = "<tr><td><img src=\"" + url + "\" height='35px' style=\"width:35px;border-radius:50%;\"</td>" +
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
            """),format.raw/*142.13*/("""}"""),format.raw/*142.14*/("""

            """),format.raw/*144.13*/("""function cancelAdd()"""),format.raw/*144.33*/("""{"""),format.raw/*144.34*/("""
                """),format.raw/*145.17*/("""$("#warningModal2").modal('close');
            """),format.raw/*146.13*/("""}"""),format.raw/*146.14*/("""

            """),format.raw/*148.13*/("""function addMember()"""),format.raw/*148.33*/("""{"""),format.raw/*148.34*/("""
                """),format.raw/*149.17*/("""var email = document.getElementById("email").value.trim();
                var obj = """),format.raw/*150.27*/("""{"""),format.raw/*150.28*/("""
                    """),format.raw/*151.21*/("""email: email
                """),format.raw/*152.17*/("""}"""),format.raw/*152.18*/(""";
                $.ajax("""),format.raw/*153.24*/("""{"""),format.raw/*153.25*/("""
                    """),format.raw/*154.21*/("""url: "/user/isEmailExisted",
                    data: JSON.stringify(obj),
                    headers: """),format.raw/*156.30*/("""{"""),format.raw/*156.31*/("""
                        """),format.raw/*157.25*/("""'Content-Type': 'application/json'
                    """),format.raw/*158.21*/("""}"""),format.raw/*158.22*/(""",
                    type: "POST",
                    success: function (data) """),format.raw/*160.46*/("""{"""),format.raw/*160.47*/("""
                        """),format.raw/*161.25*/("""var username = data.error.substring(data.error.indexOf('user:')+5, data.error.length);
                        var input = document.getElementById("memberName");
                        input.value = username;
                        if (document.getElementById("photo").value == "") """),format.raw/*164.75*/("""{"""),format.raw/*164.76*/("""
                            """),format.raw/*165.29*/("""var url = "../../../assets/images/person.jpg";
                            showPreview(url);
                            return;
                        """),format.raw/*168.25*/("""}"""),format.raw/*168.26*/("""
                        """),format.raw/*169.25*/("""var reads = new FileReader();
                        f = document.getElementById("photo").files[0];
                        reads.readAsDataURL(f);
                        reads.onload = function (e) """),format.raw/*172.53*/("""{"""),format.raw/*172.54*/("""
                            """),format.raw/*173.29*/("""showPreview(this.result);
                        """),format.raw/*174.25*/("""}"""),format.raw/*174.26*/(""";

                    """),format.raw/*176.21*/("""}"""),format.raw/*176.22*/("""
                """),format.raw/*177.17*/("""}"""),format.raw/*177.18*/(""")
                cancelAdd();
            """),format.raw/*179.13*/("""}"""),format.raw/*179.14*/("""

            """),format.raw/*181.13*/("""$("#showPanel").click(function () """),format.raw/*181.47*/("""{"""),format.raw/*181.48*/("""
                """),format.raw/*182.17*/("""$("#warningModal2").modal('close');
            """),format.raw/*183.13*/("""}"""),format.raw/*183.14*/(""")

            function prepareFormForSubmission() //display current HTML
            """),format.raw/*186.13*/("""{"""),format.raw/*186.14*/("""
                """),format.raw/*187.17*/("""if(document.getElementById("titleMsg").innerText.length != 0)
                    return false;
                var ajaxflag = true;
                var parentChallengeId = $("#parentChallengeId").val();
                $.ajax("""),format.raw/*191.24*/("""{"""),format.raw/*191.25*/("""
                    """),format.raw/*192.21*/("""url: "/challenge/checkChallengeProject/" + parentChallengeId,
                    async: false,
                    headers: """),format.raw/*194.30*/("""{"""),format.raw/*194.31*/("""
                        """),format.raw/*195.25*/("""'Content-Type': 'application/json'
                    """),format.raw/*196.21*/("""}"""),format.raw/*196.22*/(""",
                    type: "GET",
                    success: function (data) """),format.raw/*198.46*/("""{"""),format.raw/*198.47*/("""
                        """),format.raw/*199.25*/("""var response = data;
                        console.log(data);
                        if('badFormat' in response) """),format.raw/*201.53*/("""{"""),format.raw/*201.54*/("""
                            """),format.raw/*202.29*/("""console.log(response['badFormat']);
                            $("#parentChallengeIdMsg").text(response['badFormat']);
                            ajaxflag = false;
                        """),format.raw/*205.25*/("""}"""),format.raw/*205.26*/(""" """),format.raw/*205.27*/("""else"""),format.raw/*205.31*/("""{"""),format.raw/*205.32*/("""
                            """),format.raw/*206.29*/("""if('notExisted' in response)"""),format.raw/*206.57*/("""{"""),format.raw/*206.58*/("""
                                """),format.raw/*207.33*/("""$("#parentChallengeIdMsg").text(response['notExisted']);
                                ajaxflag = false;
                            """),format.raw/*209.29*/("""}"""),format.raw/*209.30*/("""else"""),format.raw/*209.34*/("""{"""),format.raw/*209.35*/("""

                            """),format.raw/*211.29*/("""}"""),format.raw/*211.30*/("""

                        """),format.raw/*213.25*/("""}"""),format.raw/*213.26*/("""
                    """),format.raw/*214.21*/("""}"""),format.raw/*214.22*/("""
                """),format.raw/*215.17*/("""}"""),format.raw/*215.18*/(""");
                if(!ajaxflag)"""),format.raw/*216.30*/("""{"""),format.raw/*216.31*/("""
                    """),format.raw/*217.21*/("""return false;
                """),format.raw/*218.17*/("""}"""),format.raw/*218.18*/("""


                """),format.raw/*221.17*/("""// if (document.getElementById("agreement").checked == false) """),format.raw/*221.79*/("""{"""),format.raw/*221.80*/("""
                """),format.raw/*222.17*/("""//     document.getElementById("warningMessage").innerText = "You must accept the terms and conditions before you can register a project!";
                //     $("#warningModal").modal();
                //     $("#warningModal").modal('open');
                //     return false;
                // """),format.raw/*226.20*/("""}"""),format.raw/*226.21*/("""

                """),format.raw/*228.17*/("""return true;
            """),format.raw/*229.13*/("""}"""),format.raw/*229.14*/("""

            """),format.raw/*231.13*/("""function deletePDF() """),format.raw/*231.34*/("""{"""),format.raw/*231.35*/("""
                """),format.raw/*232.17*/("""document.getElementById('showImg').src = "";
                $('#pdfRecord').val("delete");
                $("#pdfDeleteBtn").hide();
                $("#pdfDownload").hide();
                $('#pdfPreviewMsg').text("The PDF is deleted. You need to click \"UPDATE\" button below if you want to save the changes.");
            """),format.raw/*237.13*/("""}"""),format.raw/*237.14*/("""

            """),format.raw/*239.13*/("""function clearPDF(inputId, textId) """),format.raw/*239.48*/("""{"""),format.raw/*239.49*/("""
                """),format.raw/*240.17*/("""console.log("clearFile called for", inputId, textId);
                var fileInput = document.getElementById(inputId);
                if(fileInput) """),format.raw/*242.31*/("""{"""),format.raw/*242.32*/("""
                    """),format.raw/*243.21*/("""fileInput.value = "";
                """),format.raw/*244.17*/("""}"""),format.raw/*244.18*/(""" """),format.raw/*244.19*/("""else """),format.raw/*244.24*/("""{"""),format.raw/*244.25*/("""
                    """),format.raw/*245.21*/("""console.error("Cannot find element with id", inputId);
                """),format.raw/*246.17*/("""}"""),format.raw/*246.18*/("""
                """),format.raw/*247.17*/("""var textInput = document.getElementById(textId);
                if(textInput) """),format.raw/*248.31*/("""{"""),format.raw/*248.32*/("""
                    """),format.raw/*249.21*/("""textInput.value = "";
                    $('#' + textId).trigger('change');
                """),format.raw/*251.17*/("""}"""),format.raw/*251.18*/(""" """),format.raw/*251.19*/("""else """),format.raw/*251.24*/("""{"""),format.raw/*251.25*/("""
                    """),format.raw/*252.21*/("""console.error("Cannot find element with id", textId);
                """),format.raw/*253.17*/("""}"""),format.raw/*253.18*/("""
            """),format.raw/*254.13*/("""}"""),format.raw/*254.14*/("""
    """),format.raw/*255.5*/("""</script>
""")))};
Seq[Any](format.raw/*256.2*/("""

"""),_display_(/*258.2*/main("Register Challenge", scripts)/*258.37*/ {_display_(Seq[Any](format.raw/*258.39*/("""
    """),format.raw/*259.5*/("""<link href='"""),_display_(/*259.18*/routes/*259.24*/.Assets.at("stylesheets/quill.snow.css")),format.raw/*259.64*/("""'
    rel="stylesheet" />
    <script type="text/javascript" src='"""),_display_(/*261.42*/routes/*261.48*/.Assets.at("../../public/javascripts/plugins/quill.js")),format.raw/*261.103*/("""'></script>

    <div class="container">
        <div class="row">
            <div class="col  s12 m10 offset-m1">
                <div class="card-panel">
                    <h4 class="center form-signin-heading" align="center">
                        Register a Challenge</h4>
                    <form class="form-signin" id="challengeForm" onsubmit="return prepareFormForSubmission()" method="post" action=""""),_display_(/*269.134*/routes/*269.140*/.ChallengeController.challengeRegisterPOST()),format.raw/*269.184*/("""" enctype="multipart/form-data">
                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="challengeTitle" id="challengeTitle" class="validate" required onchange="checkValidChallengeTitle()">
                                <label for="challengeTitle">Title*</label>
                                <span id="challengeTitleMsg" class="helper-text" data-error="" style="color: red;"></span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="shortDescription" id="shortDescription" class="validate" required>
                                <label for="shortDescription">
                                    Short Description* </label>
                                <span id="shortDescriptionMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <textarea type="text" style="height: 200px; word-wtap: break-word; margin-top: 10px;"  name="longDescription" id="longDescription" class="validate" required></textarea>
                                <label for="longDescription">
                                    Long Description* </label>
                                <span id="longDescriptionMsg" class="helper-text" data-error=""></span>
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
                                type="text" name="requiredExpertise" id="requiredExpertise" class="validate" required>
                                <label for="requiredExpertise">
                                    Required Expertise* </label>
                                <span id="requiredExpertiseMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>

                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="preferredExpertise" id="preferredExpertise" class="validate" required>
                                <label for="preferredExpertise">
                                    Preferred Expertise* </label>
                                <span id="preferredExpertiseMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="preferredTime" id="preferredTime" class="validate" required>
                                <label for="preferredTime">
                                    Preferred Time* </label>
                                <span id="preferredTimeMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>

                        Budget Range
                        <div class="row">
                            <div class="input-field col s12 m5">
                                """),format.raw/*337.116*/("""
                                """),format.raw/*338.33*/("""<input type="number" name="minBudget" id="minBudget" class="validate">
                                <label for="minBudget">Min Budget*</label>
                                <span id="minBudgetMsg" class="helper-text" style="color: red;"></span>
                                """),format.raw/*341.69*/("""
                                """),format.raw/*342.241*/("""
                                """),format.raw/*343.58*/("""
                                """),format.raw/*344.44*/("""
                            """),format.raw/*345.29*/("""</div>
                            <div class="input-field col s12 m2">_</div>

                            <div class="input-field col s12 m5">
                                """),format.raw/*349.141*/("""
                                """),format.raw/*350.33*/("""<input type="number" name="maxBudget" id="maxBudget" class="validate">
                                <label for="maxBudget">Max Budget*</label>
                                <span id="maxBudgetMsg" class="helper-text" style="color: red;"></span>
                            </div>
                        </div>


                       """),format.raw/*364.33*/("""


"""),format.raw/*367.46*/("""
"""),format.raw/*368.54*/("""
"""),format.raw/*369.61*/("""
"""),format.raw/*370.133*/("""
"""),format.raw/*371.98*/("""
"""),format.raw/*372.48*/("""
"""),format.raw/*373.101*/("""
"""),format.raw/*374.39*/("""
"""),format.raw/*375.83*/("""
"""),format.raw/*376.140*/("""
"""),format.raw/*377.58*/("""
"""),format.raw/*378.74*/("""
"""),format.raw/*379.51*/("""
"""),format.raw/*380.109*/("""
"""),format.raw/*381.88*/("""
"""),format.raw/*382.111*/("""
"""),format.raw/*383.47*/("""
"""),format.raw/*384.74*/("""
"""),format.raw/*385.106*/("""
"""),format.raw/*386.77*/("""
"""),format.raw/*387.106*/("""
"""),format.raw/*388.47*/("""
"""),format.raw/*389.86*/("""
"""),format.raw/*390.102*/("""
"""),format.raw/*391.82*/("""
"""),format.raw/*392.117*/("""
"""),format.raw/*393.51*/("""
"""),format.raw/*394.76*/("""
"""),format.raw/*395.109*/("""
"""),format.raw/*396.51*/("""
"""),format.raw/*397.47*/("""
"""),format.raw/*398.81*/("""
"""),format.raw/*399.114*/("""
"""),format.raw/*400.63*/("""
"""),format.raw/*401.47*/("""
"""),format.raw/*402.43*/("""
"""),format.raw/*403.39*/("""
"""),format.raw/*404.54*/("""
"""),format.raw/*405.62*/("""
"""),format.raw/*406.74*/("""
"""),format.raw/*407.45*/("""
"""),format.raw/*408.39*/("""
"""),format.raw/*409.35*/("""

                        """),format.raw/*411.25*/("""<div class="row">
                            <div class="input-field col s12">
                                <input type="text" name="tech" id="tech" class="validate" required>
                                <label for="tech">
                                    Technologies Used* </label>
                                <span id="techMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>

                        """),format.raw/*432.27*/("""


                        """),format.raw/*435.25*/("""<div class="row">
                            <div class="file-field input-field col s12">
                                <div style="display: flex; align-items: center;">
                                    <div class="btn waves-effect waves-light blue darken-2" style="margin-right: 10px;">
                                        <span>Upload Challenge PDF</span>
                                        <input type="file" accept=".pdf" id="challengePdf" name="challengePdf">
                                    </div>
                                    <div class="file-path-wrapper" style="flex-grow: 1;">
                                        <input class="file-path validate" type="text" placeholder="Upload challenge PDF" id="filePathChallengePdf" readonly>
                                    </div>
                                    <button type="button" class="btn-small red" onclick="clearPDF('challengePdf','filePathChallengePdf')" style="margin-left: 10px;">
                                        Cancel
                                    </button>
                                </div>
                            </div>
                        </div>



                                        """),format.raw/*454.86*/("""
"""),format.raw/*455.66*/("""
"""),format.raw/*456.43*/("""
"""),format.raw/*457.90*/("""
"""),format.raw/*458.56*/("""
"""),format.raw/*459.59*/("""
"""),format.raw/*460.98*/("""
"""),format.raw/*461.39*/("""
"""),format.raw/*462.35*/("""
"""),format.raw/*463.46*/("""
"""),format.raw/*464.66*/("""
"""),format.raw/*465.43*/("""
"""),format.raw/*466.92*/("""
"""),format.raw/*467.57*/("""
"""),format.raw/*468.60*/("""
"""),format.raw/*469.99*/("""
"""),format.raw/*470.39*/("""
"""),format.raw/*471.35*/("""
"""),format.raw/*472.46*/("""
"""),format.raw/*473.66*/("""
"""),format.raw/*474.43*/("""
"""),format.raw/*475.98*/("""
"""),format.raw/*476.60*/("""
"""),format.raw/*477.71*/("""
"""),format.raw/*478.102*/("""
"""),format.raw/*479.39*/("""
"""),format.raw/*480.35*/("""
"""),format.raw/*481.46*/("""
"""),format.raw/*482.66*/("""
"""),format.raw/*483.43*/("""
"""),format.raw/*484.114*/("""
"""),format.raw/*485.68*/("""
"""),format.raw/*486.68*/("""
"""),format.raw/*487.128*/("""
"""),format.raw/*488.39*/("""
"""),format.raw/*489.35*/("""

                        """),format.raw/*491.46*/("""
                            """),format.raw/*492.40*/("""
                                """),format.raw/*493.77*/("""
                                """),format.raw/*494.43*/("""
                                    """),format.raw/*495.156*/("""
                                    """),format.raw/*496.69*/("""
                                    """),format.raw/*497.117*/("""
                                    """),format.raw/*498.125*/("""
                            """),format.raw/*499.41*/("""
                        """),format.raw/*500.35*/("""

                        """),format.raw/*502.25*/("""<div id="warningModal" class="modal">
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
                                <button type="submit" id="challengeRegister" class="btn waves-effect waves-light blue darken-2">
                                    Submit</button>
                                <a href=""""),_display_(/*530.43*/routes/*530.49*/.Application.home()),format.raw/*530.68*/("""" class="btn waves-effect waves-light red darken-2">
                                    Cancel</a>

                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
""")))}),format.raw/*540.2*/("""
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
                  DATE: Fri Apr 24 12:50:31 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/challengeRegister.scala.html
                  HASH: b0265594d63c5641e4265a2effea96c439213da1
                  MATRIX: 814->1|837->18|860->35|889->58|1295->84|1309->91|1389->95|1420->100|1466->119|1494->120|1534->133|1590->162|1619->163|1655->172|1686->175|1715->176|1756->189|1811->217|1840->218|1876->227|1921->244|1950->245|1991->258|2044->284|2073->285|2109->294|2145->302|2174->303|2215->316|2265->339|2294->340|2326->345|2404->396|2419->402|2490->452|2570->505|2585->511|2659->563|2739->616|2754->622|2820->667|2984->803|3013->804|3058->821|4255->1990|4284->1991|4333->2012|4465->2116|4494->2117|4547->2142|4749->2316|4778->2317|4827->2338|4860->2343|4889->2344|4942->2369|5461->2860|5490->2861|5539->2882|5613->2928|5642->2929|5778->3037|5807->3038|5856->3059|5949->3124|5978->3125|6031->3150|6143->3234|6172->3235|6221->3256|6309->3316|6338->3317|6391->3342|6498->3421|6527->3422|6576->3443|7019->3858|7048->3859|7101->3884|7273->4028|7302->4029|7351->4050|7568->4239|7597->4240|7650->4265|7725->4312|7754->4313|7800->4331|7829->4332|7872->4347|7901->4348|7981->4400|8010->4401|8055->4418|8161->4496|8190->4497|8239->4518|8296->4547|8325->4548|8379->4574|8408->4575|8457->4596|8649->4759|8679->4760|8733->4785|8817->4840|8847->4841|8957->4922|8987->4923|9041->4948|9183->5061|9213->5062|9271->5091|9427->5218|9457->5219|9487->5220|9521->5225|9551->5226|9609->5255|9713->5330|9743->5331|9793->5352|9823->5353|9869->5370|9899->5371|9943->5386|9973->5387|10016->5401|10072->5428|10102->5429|10148->5446|10254->5523|10284->5524|10327->5538|10382->5564|10412->5565|10458->5582|11750->6845|11780->6846|11823->6860|11872->6880|11902->6881|11948->6898|12025->6946|12055->6947|12098->6961|12147->6981|12177->6982|12223->6999|12337->7084|12367->7085|12417->7106|12475->7135|12505->7136|12559->7161|12589->7162|12639->7183|12773->7288|12803->7289|12857->7314|12941->7369|12971->7370|13081->7451|13111->7452|13165->7477|13478->7761|13508->7762|13566->7791|13748->7944|13778->7945|13832->7970|14062->8171|14092->8172|14150->8201|14229->8251|14259->8252|14311->8275|14341->8276|14387->8293|14417->8294|14489->8337|14519->8338|14562->8352|14625->8386|14655->8387|14701->8404|14778->8452|14808->8453|14923->8539|14953->8540|14999->8557|15255->8784|15285->8785|15335->8806|15489->8931|15519->8932|15573->8957|15657->9012|15687->9013|15796->9093|15826->9094|15880->9119|16025->9235|16055->9236|16113->9265|16332->9455|16362->9456|16392->9457|16425->9461|16455->9462|16513->9491|16570->9519|16600->9520|16662->9553|16826->9688|16856->9689|16889->9693|16919->9694|16978->9724|17008->9725|17063->9751|17093->9752|17143->9773|17173->9774|17219->9791|17249->9792|17310->9824|17340->9825|17390->9846|17449->9876|17479->9877|17527->9896|17618->9958|17648->9959|17694->9976|18027->10280|18057->10281|18104->10299|18158->10324|18188->10325|18231->10339|18281->10360|18311->10361|18357->10378|18715->10707|18745->10708|18788->10722|18852->10757|18882->10758|18928->10775|19107->10925|19137->10926|19187->10947|19254->10985|19284->10986|19314->10987|19348->10992|19378->10993|19428->11014|19528->11085|19558->11086|19604->11103|19712->11182|19742->11183|19792->11204|19914->11297|19944->11298|19974->11299|20008->11304|20038->11305|20088->11326|20187->11396|20217->11397|20259->11410|20289->11411|20322->11416|20373->11427|20403->11430|20448->11465|20489->11467|20522->11472|20563->11485|20579->11491|20641->11531|20736->11598|20752->11604|20830->11659|21274->12074|21291->12080|21358->12124|25507->16326|25569->16359|25880->16677|25943->16918|26005->16976|26067->17020|26125->17049|26332->17334|26394->17367|26764->18163|26796->18211|26826->18265|26856->18326|26887->18459|26917->18557|26947->18605|26978->18706|27008->18745|27038->18828|27069->18968|27099->19026|27129->19100|27159->19151|27190->19260|27220->19348|27251->19459|27281->19506|27311->19580|27342->19686|27372->19763|27403->19869|27433->19916|27463->20002|27494->20104|27524->20186|27555->20303|27585->20354|27615->20430|27646->20539|27676->20590|27706->20637|27736->20718|27767->20832|27797->20895|27827->20942|27857->20985|27887->21024|27917->21078|27947->21140|27977->21214|28007->21259|28037->21298|28067->21333|28122->21359|28630->22561|28686->22588|29935->23853|29965->23919|29995->23962|30025->24052|30055->24108|30085->24167|30115->24265|30145->24304|30175->24339|30205->24385|30235->24451|30265->24494|30295->24586|30325->24643|30355->24703|30385->24802|30415->24841|30445->24876|30475->24922|30505->24988|30535->25031|30565->25129|30595->25189|30625->25260|30656->25362|30686->25401|30716->25436|30746->25482|30776->25548|30806->25591|30837->25705|30867->25773|30897->25841|30928->25969|30958->26008|30988->26043|31043->26090|31101->26130|31163->26207|31225->26250|31292->26406|31358->26475|31425->26592|31492->26717|31550->26758|31604->26793|31659->26819|33369->28501|33385->28507|33426->28526|33721->28790
                  LINES: 31->1|32->2|33->3|34->4|43->6|43->6|45->6|46->7|47->8|47->8|48->9|49->10|49->10|50->11|50->11|50->11|51->12|52->13|52->13|53->14|53->14|53->14|54->15|55->16|55->16|56->17|56->17|56->17|57->18|58->19|58->19|59->20|61->22|61->22|61->22|62->23|62->23|62->23|63->24|63->24|63->24|67->28|67->28|68->29|85->46|85->46|86->47|87->48|87->48|88->49|90->51|90->51|91->52|91->52|91->52|92->53|98->59|98->59|99->60|100->61|100->61|104->65|104->65|105->66|105->66|105->66|106->67|107->68|107->68|108->69|108->69|108->69|109->70|110->71|110->71|111->72|116->77|116->77|117->78|120->81|120->81|121->82|124->85|124->85|125->86|127->88|127->88|128->89|128->89|129->90|129->90|131->92|131->92|132->93|133->94|133->94|134->95|135->96|135->96|137->98|137->98|138->99|141->102|141->102|142->103|143->104|143->104|145->106|145->106|146->107|148->109|148->109|149->110|150->111|150->111|150->111|150->111|150->111|151->112|152->113|152->113|153->114|153->114|154->115|154->115|156->117|156->117|158->119|158->119|158->119|159->120|161->122|161->122|163->124|163->124|163->124|164->125|181->142|181->142|183->144|183->144|183->144|184->145|185->146|185->146|187->148|187->148|187->148|188->149|189->150|189->150|190->151|191->152|191->152|192->153|192->153|193->154|195->156|195->156|196->157|197->158|197->158|199->160|199->160|200->161|203->164|203->164|204->165|207->168|207->168|208->169|211->172|211->172|212->173|213->174|213->174|215->176|215->176|216->177|216->177|218->179|218->179|220->181|220->181|220->181|221->182|222->183|222->183|225->186|225->186|226->187|230->191|230->191|231->192|233->194|233->194|234->195|235->196|235->196|237->198|237->198|238->199|240->201|240->201|241->202|244->205|244->205|244->205|244->205|244->205|245->206|245->206|245->206|246->207|248->209|248->209|248->209|248->209|250->211|250->211|252->213|252->213|253->214|253->214|254->215|254->215|255->216|255->216|256->217|257->218|257->218|260->221|260->221|260->221|261->222|265->226|265->226|267->228|268->229|268->229|270->231|270->231|270->231|271->232|276->237|276->237|278->239|278->239|278->239|279->240|281->242|281->242|282->243|283->244|283->244|283->244|283->244|283->244|284->245|285->246|285->246|286->247|287->248|287->248|288->249|290->251|290->251|290->251|290->251|290->251|291->252|292->253|292->253|293->254|293->254|294->255|296->256|298->258|298->258|298->258|299->259|299->259|299->259|299->259|301->261|301->261|301->261|309->269|309->269|309->269|377->337|378->338|381->341|382->342|383->343|384->344|385->345|389->349|390->350|397->364|400->367|401->368|402->369|403->370|404->371|405->372|406->373|407->374|408->375|409->376|410->377|411->378|412->379|413->380|414->381|415->382|416->383|417->384|418->385|419->386|420->387|421->388|422->389|423->390|424->391|425->392|426->393|427->394|428->395|429->396|430->397|431->398|432->399|433->400|434->401|435->402|436->403|437->404|438->405|439->406|440->407|441->408|442->409|444->411|453->432|456->435|475->454|476->455|477->456|478->457|479->458|480->459|481->460|482->461|483->462|484->463|485->464|486->465|487->466|488->467|489->468|490->469|491->470|492->471|493->472|494->473|495->474|496->475|497->476|498->477|499->478|500->479|501->480|502->481|503->482|504->483|505->484|506->485|507->486|508->487|509->488|510->489|512->491|513->492|514->493|515->494|516->495|517->496|518->497|519->498|520->499|521->500|523->502|551->530|551->530|551->530|561->540
                  -- GENERATED --
              */
          