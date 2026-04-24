
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
/*3.2*/import models.RAJob
/*4.2*/import com.fasterxml.jackson.databind.JsonNode

object rajobRegister extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[String,String,String,JsonNode,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(userTypes: String, userId: String, userEmail: String, professors: JsonNode):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*7.2*/scripts/*7.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*7.13*/("""
    """),format.raw/*8.5*/("""<style>
            tr """),format.raw/*9.16*/("""{"""),format.raw/*9.17*/("""
                """),format.raw/*10.17*/("""border-bottom: none;
            """),format.raw/*11.13*/("""}"""),format.raw/*11.14*/("""
            """),format.raw/*12.13*/("""td """),format.raw/*12.16*/("""{"""),format.raw/*12.17*/("""
                """),format.raw/*13.17*/("""text-align: center;
            """),format.raw/*14.13*/("""}"""),format.raw/*14.14*/("""
            """),format.raw/*15.13*/(""".ql-editor strong"""),format.raw/*15.30*/("""{"""),format.raw/*15.31*/("""
                """),format.raw/*16.17*/("""font-weight:bold;
            """),format.raw/*17.13*/("""}"""),format.raw/*17.14*/("""
            """),format.raw/*18.13*/("""#editor """),format.raw/*18.21*/("""{"""),format.raw/*18.22*/("""
                """),format.raw/*19.17*/("""height: 375px;
            """),format.raw/*20.13*/("""}"""),format.raw/*20.14*/("""
    """),format.raw/*21.5*/("""</style>

    <script type="text/javascript" src='"""),_display_(/*23.42*/routes/*23.48*/.Assets.at("javascripts/database_field_length.js")),format.raw/*23.98*/("""'></script>
    <script type="text/javascript" src='"""),_display_(/*24.42*/routes/*24.48*/.Assets.at("javascripts/field_validation_helper.js")),format.raw/*24.100*/("""'></script>
    <script type="text/javascript">
            count = 0;
            var quill;
            $(document).ready(function () """),format.raw/*28.43*/("""{"""),format.raw/*28.44*/("""
                """),format.raw/*29.17*/("""$("#addPanel").hide();
                $("#showPanel").click(function () """),format.raw/*30.51*/("""{"""),format.raw/*30.52*/("""
                    """),format.raw/*31.21*/("""var panel = document.getElementById("addPanel");
                    if (panel.style.display == "none") """),format.raw/*32.56*/("""{"""),format.raw/*32.57*/("""
                        """),format.raw/*33.25*/("""$("#btnName").attr("style", "transform:rotate(-45deg);transition:transform 0.3s linear;");
                        $("#buttonText").text("Close Window");
                    """),format.raw/*35.21*/("""}"""),format.raw/*35.22*/("""
                    """),format.raw/*36.21*/("""else """),format.raw/*36.26*/("""{"""),format.raw/*36.27*/("""
                        """),format.raw/*37.25*/("""$("#btnName").attr("style", "transform:rotate(0deg);transition:transform 0.3s linear;");
                        $("#buttonText").text("Add Members");
                        document.getElementById("memberName").value = "";
                        document.getElementById("email").value = "";
                        document.getElementById("email").classList.remove("invalid");
                        document.getElementById("memberName").classList.remove("invalid");
                    """),format.raw/*43.21*/("""}"""),format.raw/*43.22*/("""
                    """),format.raw/*44.21*/("""$("#addPanel").slideToggle();
                """),format.raw/*45.17*/("""}"""),format.raw/*45.18*/(""");



            """),format.raw/*49.13*/("""}"""),format.raw/*49.14*/(""");

            function checkValidJobTitle() """),format.raw/*51.43*/("""{"""),format.raw/*51.44*/("""
                """),format.raw/*52.17*/("""var title = document.getElementById("title").value;
                var obj = """),format.raw/*53.27*/("""{"""),format.raw/*53.28*/("""
                    """),format.raw/*54.21*/("""title: title
                """),format.raw/*55.17*/("""}"""),format.raw/*55.18*/(""";

                $.ajax("""),format.raw/*57.24*/("""{"""),format.raw/*57.25*/("""
                    """),format.raw/*58.21*/("""url: "/job/isJobNameExisted",
                    data: JSON.stringify(obj),
                    headers: """),format.raw/*60.30*/("""{"""),format.raw/*60.31*/("""
                        """),format.raw/*61.25*/("""'Content-Type': 'application/json'
                    """),format.raw/*62.21*/("""}"""),format.raw/*62.22*/(""",
                    type: "POST",
                    success: function (data) """),format.raw/*64.46*/("""{"""),format.raw/*64.47*/("""
                        """),format.raw/*65.25*/("""console.log(data);
                        var response = data;
                        if ("error" in response) """),format.raw/*67.50*/("""{"""),format.raw/*67.51*/("""
                            """),format.raw/*68.29*/("""document.getElementById("titleMsg").innerHTML = "Replicated job name, please change another name!"
                        """),format.raw/*69.25*/("""}"""),format.raw/*69.26*/(""" """),format.raw/*69.27*/("""else """),format.raw/*69.32*/("""{"""),format.raw/*69.33*/("""
                            """),format.raw/*70.29*/("""document.getElementById("titleMsg").innerHTML = ""
                        """),format.raw/*71.25*/("""}"""),format.raw/*71.26*/("""
                    """),format.raw/*72.21*/("""}"""),format.raw/*72.22*/("""
                """),format.raw/*73.17*/("""}"""),format.raw/*73.18*/(""")

            """),format.raw/*75.13*/("""}"""),format.raw/*75.14*/("""


            """),format.raw/*78.13*/("""function cancelAdd()"""),format.raw/*78.33*/("""{"""),format.raw/*78.34*/("""
                """),format.raw/*79.17*/("""$("#warningModal2").modal('close');
            """),format.raw/*80.13*/("""}"""),format.raw/*80.14*/("""



            """),format.raw/*84.13*/("""$("#showPanel").click(function () """),format.raw/*84.47*/("""{"""),format.raw/*84.48*/("""
                """),format.raw/*85.17*/("""$("#warningModal2").modal('close');
            """),format.raw/*86.13*/("""}"""),format.raw/*86.14*/(""")

            function prepareFormForSubmission() //display current HTML
            """),format.raw/*89.13*/("""{"""),format.raw/*89.14*/("""
                """),format.raw/*90.17*/("""if(document.getElementById("titleMsg").innerText.length != 0)
                    return false;
                var ajaxflag = true;
                $.ajax("""),format.raw/*93.24*/("""{"""),format.raw/*93.25*/("""
                    """),format.raw/*94.21*/("""type: "GET",
                    success: function (data) """),format.raw/*95.46*/("""{"""),format.raw/*95.47*/("""
                        """),format.raw/*96.25*/("""var response = data;
                        console.log(data);
                        if('badFormat' in response) """),format.raw/*98.53*/("""{"""),format.raw/*98.54*/("""
                            """),format.raw/*99.29*/("""console.log(response['badFormat']);
                            ajaxflag = false;
                        """),format.raw/*101.25*/("""}"""),format.raw/*101.26*/(""" """),format.raw/*101.27*/("""else"""),format.raw/*101.31*/("""{"""),format.raw/*101.32*/("""
                            """),format.raw/*102.29*/("""if('notExisted' in response)"""),format.raw/*102.57*/("""{"""),format.raw/*102.58*/("""
                                """),format.raw/*103.33*/("""ajaxflag = false;
                            """),format.raw/*104.29*/("""}"""),format.raw/*104.30*/("""else"""),format.raw/*104.34*/("""{"""),format.raw/*104.35*/("""

                            """),format.raw/*106.29*/("""}"""),format.raw/*106.30*/("""

                        """),format.raw/*108.25*/("""}"""),format.raw/*108.26*/("""
                    """),format.raw/*109.21*/("""}"""),format.raw/*109.22*/("""
                """),format.raw/*110.17*/("""}"""),format.raw/*110.18*/(""");
                if(!ajaxflag)"""),format.raw/*111.30*/("""{"""),format.raw/*111.31*/("""
                    """),format.raw/*112.21*/("""return false;
                """),format.raw/*113.17*/("""}"""),format.raw/*113.18*/("""


                """),format.raw/*116.17*/("""// if (document.getElementById("agreement").checked == false) """),format.raw/*116.79*/("""{"""),format.raw/*116.80*/("""
                """),format.raw/*117.17*/("""//     document.getElementById("warningMessage").innerText = "You must accept the terms and conditions before you can register a project!";
                //     $("#warningModal").modal();
                //     $("#warningModal").modal('open');
                //     return false;
                // """),format.raw/*121.20*/("""}"""),format.raw/*121.21*/("""

                """),format.raw/*123.17*/("""return true;
            """),format.raw/*124.13*/("""}"""),format.raw/*124.14*/("""

            """),format.raw/*126.13*/("""function deletePDF() """),format.raw/*126.34*/("""{"""),format.raw/*126.35*/("""
                """),format.raw/*127.17*/("""document.getElementById('showImg').src = "";
                $('#pdfRecord').val("delete");
                $("#pdfDeleteBtn").hide();
                $("#pdfDownload").hide();
                $('#pdfPreviewMsg').text("The PDF is deleted. You need to click \"UPDATE\" button below if you want to save the changes.");
            """),format.raw/*132.13*/("""}"""),format.raw/*132.14*/("""

            """),format.raw/*134.13*/("""function clearPDF(inputId, textId) """),format.raw/*134.48*/("""{"""),format.raw/*134.49*/("""
                """),format.raw/*135.17*/("""console.log("clearFile called for", inputId, textId);
                var fileInput = document.getElementById(inputId);
                if(fileInput) """),format.raw/*137.31*/("""{"""),format.raw/*137.32*/("""
                    """),format.raw/*138.21*/("""fileInput.value = "";
                """),format.raw/*139.17*/("""}"""),format.raw/*139.18*/(""" """),format.raw/*139.19*/("""else """),format.raw/*139.24*/("""{"""),format.raw/*139.25*/("""
                    """),format.raw/*140.21*/("""console.error("Cannot find element with id", inputId);
                """),format.raw/*141.17*/("""}"""),format.raw/*141.18*/("""
                """),format.raw/*142.17*/("""var textInput = document.getElementById(textId);
                if(textInput) """),format.raw/*143.31*/("""{"""),format.raw/*143.32*/("""
                    """),format.raw/*144.21*/("""textInput.value = "";
                    $('#' + textId).trigger('change');
                """),format.raw/*146.17*/("""}"""),format.raw/*146.18*/(""" """),format.raw/*146.19*/("""else """),format.raw/*146.24*/("""{"""),format.raw/*146.25*/("""
                    """),format.raw/*147.21*/("""console.error("Cannot find element with id", textId);
                """),format.raw/*148.17*/("""}"""),format.raw/*148.18*/("""
            """),format.raw/*149.13*/("""}"""),format.raw/*149.14*/("""
            """),format.raw/*150.13*/("""document.addEventListener('DOMContentLoaded', function () """),format.raw/*150.71*/("""{"""),format.raw/*150.72*/("""
                """),format.raw/*151.17*/("""var elems = document.querySelectorAll('.modal');
                M.Modal.init(elems);

                fetch('"""),_display_(/*154.25*/routes/*154.31*/.Assets.at("data/cc_contacts.json")),format.raw/*154.66*/("""')
                        .then(response => response.json())
                        .then(data => """),format.raw/*156.39*/("""{"""),format.raw/*156.40*/("""
                            """),format.raw/*157.29*/("""const ccList = document.getElementById("ccList");
                            data.forEach(contact => """),format.raw/*158.53*/("""{"""),format.raw/*158.54*/("""
                                """),format.raw/*159.33*/("""const li = document.createElement("li");
                                li.innerHTML = `
                    <label>
                        <input type="checkbox" name="ccSelected" value="$"""),format.raw/*162.74*/("""{"""),format.raw/*162.75*/("""contact.email"""),format.raw/*162.88*/("""}"""),format.raw/*162.89*/("""" />
                        <span>$"""),format.raw/*163.32*/("""{"""),format.raw/*163.33*/("""contact.firstname"""),format.raw/*163.50*/("""}"""),format.raw/*163.51*/(""" """),format.raw/*163.52*/("""$"""),format.raw/*163.53*/("""{"""),format.raw/*163.54*/("""contact.lastname"""),format.raw/*163.70*/("""}"""),format.raw/*163.71*/(""" """),format.raw/*163.72*/("""($"""),format.raw/*163.74*/("""{"""),format.raw/*163.75*/("""contact.email"""),format.raw/*163.88*/("""}"""),format.raw/*163.89*/(""")</span>
                    </label>
                `;
                                ccList.appendChild(li);
                            """),format.raw/*167.29*/("""}"""),format.raw/*167.30*/(""");
                        """),format.raw/*168.25*/("""}"""),format.raw/*168.26*/(""")
                        .catch(error => """),format.raw/*169.41*/("""{"""),format.raw/*169.42*/("""
                            """),format.raw/*170.29*/("""console.error("Failed to load CC contacts:", error);
                        """),format.raw/*171.25*/("""}"""),format.raw/*171.26*/(""");

                $('#jobForm').on('submit', function() """),format.raw/*173.55*/("""{"""),format.raw/*173.56*/("""
                    """),format.raw/*174.21*/("""$(this).find('input[type=hidden][name="ccSelected"]').remove();
                    $('#ccList input[name="ccSelected"]:checked').each(function() """),format.raw/*175.83*/("""{"""),format.raw/*175.84*/("""
                        """),format.raw/*176.25*/("""$('<input>')
                                .attr('type', 'hidden')
                                .attr('name', 'ccSelected')
                                .val(this.value)
                                .appendTo('#jobForm');
                    """),format.raw/*181.21*/("""}"""),format.raw/*181.22*/(""");
                """),format.raw/*182.17*/("""}"""),format.raw/*182.18*/(""");
            """),format.raw/*183.13*/("""}"""),format.raw/*183.14*/(""");
    </script>
""")))};
Seq[Any](format.raw/*5.78*/("""

"""),format.raw/*185.2*/("""

"""),_display_(/*187.2*/main("Post RA Job", scripts)/*187.30*/ {_display_(Seq[Any](format.raw/*187.32*/("""
    """),format.raw/*188.5*/("""<link href='"""),_display_(/*188.18*/routes/*188.24*/.Assets.at("stylesheets/quill.snow.css")),format.raw/*188.64*/("""'
    rel="stylesheet" />
    <script type="text/javascript" src='"""),_display_(/*190.42*/routes/*190.48*/.Assets.at("javascripts/plugins/quill.js")),format.raw/*190.90*/("""'></script>
    <script type="text/javascript" src='"""),_display_(/*191.42*/routes/*191.48*/.Assets.at("javascripts/field_validation_helper.js")),format.raw/*191.100*/("""'></script>

    <div class="container">
        <div class="row">
            <div class="col  s12 m10 offset-m1">
                <div class="card-panel">
                    <h4 class="center form-signin-heading" align="center">
                        Post RA Job</h4>
                    <form class="form-signin" enctype="multipart/form-data" id="jobForm" onsubmit="return prepareFormForSubmission()" method="post" action=""""),_display_(/*199.158*/routes/*199.164*/.RAJobController.rajobRegisterPOST()),format.raw/*199.200*/("""">
                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="title" id="title" class="validate" required onchange="checkValidJobTitle()">
                                <label for="title">Title* </label>
                                <span id="titleMsg" class="helper-text" data-success="✓" data-error="Please input a title"></span>
                            </div>
                        </div>
                        """),_display_(/*208.26*/if(userTypes == "0")/*208.46*/ {_display_(Seq[Any](format.raw/*208.48*/("""
                            """),format.raw/*209.29*/("""<div class="row">
                                <div class="input-field col s12">
                                    <input list="profList" id="profInput" class="validate" required>
                                    <datalist id="profList">
                                    """),_display_(/*213.38*/for(prof <- professors.elements()) yield /*213.72*/ {_display_(Seq[Any](format.raw/*213.74*/("""
                                        """),format.raw/*214.41*/("""<option
                                        data-id=""""),_display_(/*215.51*/prof/*215.55*/.get("id").asText()),format.raw/*215.74*/(""""
                                        data-email=""""),_display_(/*216.54*/prof/*216.58*/.get("email").asText()),format.raw/*216.80*/(""""
                                        value=""""),_display_(/*217.49*/prof/*217.53*/.get("userName").asText()),format.raw/*217.78*/("""">
                                        </option>
                                    """)))}),format.raw/*219.38*/("""
                                    """),format.raw/*220.37*/("""</datalist>
                                    <label for="profInput">Rajob Publisher*</label>
                                </div>
                            </div>
                            <input type="hidden" name="rajobPublisher.id"    id="rajobPublisherId"    />
                            <input type="hidden" name="rajobPublisher.email" id="rajobPublisherEmail" />

                            <script>
                                    document.addEventListener('DOMContentLoaded', function()"""),format.raw/*228.93*/("""{"""),format.raw/*228.94*/("""
                                        """),format.raw/*229.41*/("""M.updateTextFields();

                                        var inp = document.getElementById('profInput');
                                        var lbl = document.querySelector('label[for="profInput"]');
                                        inp.addEventListener('input', function() """),format.raw/*233.82*/("""{"""),format.raw/*233.83*/("""
                                            """),format.raw/*234.45*/("""var val = this.value, opts = document.getElementById('profList').options;
                                            for (var i = 0; i < opts.length; i++) """),format.raw/*235.83*/("""{"""),format.raw/*235.84*/("""
                                                """),format.raw/*236.49*/("""if (opts[i].value === val) """),format.raw/*236.76*/("""{"""),format.raw/*236.77*/("""
                                                    """),format.raw/*237.53*/("""document.getElementById('rajobPublisherId').value    = opts[i].dataset.id;
                                                    document.getElementById('rajobPublisherEmail').value = opts[i].dataset.email;
                                                    break;
                                                """),format.raw/*240.49*/("""}"""),format.raw/*240.50*/("""
                                            """),format.raw/*241.45*/("""}"""),format.raw/*241.46*/("""
                                            """),format.raw/*242.45*/("""if (this.value) lbl.classList.add('active');
                                            else           lbl.classList.remove('active');
                                        """),format.raw/*244.41*/("""}"""),format.raw/*244.42*/(""");
                                    """),format.raw/*245.37*/("""}"""),format.raw/*245.38*/(""");
                            </script>
                        """)))}/*247.27*/else/*247.32*/{_display_(Seq[Any](format.raw/*247.33*/("""
                            """),format.raw/*248.29*/("""<input type="hidden" name="rajobPublisher.id"    value=""""),_display_(/*248.86*/userId),format.raw/*248.92*/(""""    />
                            <input type="hidden" name="rajobPublisher.email" value=""""),_display_(/*249.86*/userEmail),format.raw/*249.95*/("""" />
                        """)))}),format.raw/*250.26*/("""
                        """),format.raw/*251.25*/("""<div class="row">
                            <div class="input-field col s12">
                                <input type="text" name="goals" id="goals"  class="validate" required>
                                <label for="goals">
                                    Goals* </label>
                                <span id="goalsMsg" class="helper-text" data-success="✓" data-error="Please input goals"></span>
                            </div>
                        </div>

                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="organization" id="organization" class="validate" required>
                                <label for="organization">
                                    Department/Lab Name* </label>
                                <span id="organizationMsg" class="helper-text" data-success="✓" data-error="Please input the department/lab name"></span>
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
                                type="text" name="shortDescription" id="shortDescription" class="validate" required onchange="validateRegex(this.id, /."""),format.raw/*281.152*/("""{"""),format.raw/*281.153*/("""0,100"""),format.raw/*281.158*/("""}"""),format.raw/*281.159*/("""/)">
                                <label for="shortDescription">
                                    Short Description* </label>
                                <span id="shortDescriptionMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <textarea type="text" style="height: 200px;
                                    word-wtap: break-word; margin-top: 10px;" id="longDescription" placeholder="" name="longDescription" onchange="validateRegex(this.id, /."""),format.raw/*290.173*/("""{"""),format.raw/*290.174*/("""0,100"""),format.raw/*290.179*/("""}"""),format.raw/*290.180*/("""/)"></textarea>
                                <label for="longDescription">Long Description</label>
                                <span id="longDescriptionMsg" class="helper-text" data-success="✓" data-error="The long description must be under 600 characters" style="color: red; font-size: 12px"></span>
                            </div>
                        </div>

                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="requiredExpertise" id="requiredExpertise" class="validate" required>
                                <label for="requiredExpertise">
                                    Required Expertise* </label>
                                <span id="requiredExpertiseMsg" class="helper-text" data-success="✓" data-error="Please enter some required expertise"></span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="preferredExpertise" id="preferredExpertise" class="validate" required>
                                <label for="preferredExpertise">
                                    Preferred Expertise* </label>
                                <span id="preferredExpertise" class="helper-text" data-success="✓" data-error="Please enter some preferred expertise"></span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="fields" id="fields" class="validate" required>
                                <label for="fields">
                                    Fields* </label>
                                <span id="fieldsMsg" class="helper-text" data-success="✓" data-error="Please enter some fields of work"></span>
                            </div>
                        </div>

                        <div class="row">
                            <fieldset>
                                <legend>TA Type</legend>
                                <div class="col s12 m12">
                                    <label>
                                        <input type="radio" name="raTypes" id="raType1" value="1" checked>
                                        <span>Hourly RA (Graduate Students: $20/Hour; Undergraduate Student: $15/Hour)</span>
                                    </label>
                                </div>
                                <div class="col s12 m12">
                                    <label>
                                        <input type="radio" name="raTypes" id="raType2" value="2">
                                        <span>Full-time RA (Tuition waiver + $2500/Month)</span>
                                    </label>
                                </div>
                            </fieldset>
                        </div>

                        """),format.raw/*342.66*/("""
                        """),format.raw/*343.70*/("""
                        """),format.raw/*344.93*/("""
                        """),format.raw/*345.166*/("""
                        """),format.raw/*346.103*/("""
                        """),format.raw/*347.126*/("""
                        """),format.raw/*348.63*/("""
                        """),format.raw/*349.100*/("""

                        """),format.raw/*351.93*/("""
                        """),format.raw/*352.166*/("""
                        """),format.raw/*353.103*/("""
                        """),format.raw/*354.145*/("""
                        """),format.raw/*355.63*/("""
                        """),format.raw/*356.59*/("""

                        """),format.raw/*358.25*/("""<div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="url" id="url" class="validate" onchange="validateRegex(this.id, 'URL')">
                                <label for="url">
                                    RA Job URL </label>
                                <span id="urlMsg" class="helper-text" data-success="✓" data-error="Please input a valid URL"></span>
                            </div>
                        </div>

                        <div class="row">
                            <div class="file-field input-field col s12">
                                <div style="display: flex; align-items: center;">
                                    <div class="btn waves-effect waves-light blue darken-2" style="margin-right: 10px;">
                                        <span>Upload RA Job PDF</span>
                                        <input type="file" accept=".pdf" id="rajobPdf" name="rajobPdf">
                                    </div>
                                    <div class="file-path-wrapper" style="flex-grow: 1;">
                                        <input class="file-path validate" type="text" placeholder="Upload RA job PDF" id="filePathRaJobPdf" readonly>
                                    </div>
                                    <button type="button" class="btn-small red" onclick="clearPDF('rajobPdf','filePathRaJobPdf')" style="margin-left: 10px;">
                                    Cancel
                                    </button>
                                    </div>
                                    </div>
                                    </div>
                                    </div>
"""),format.raw/*385.49*/("""
"""),format.raw/*386.137*/("""
"""),format.raw/*387.31*/("""

                    """),format.raw/*389.21*/("""<div id="ccModal" class="modal">
                        <div class="modal-content">
                            <h5>Select Contacts to CC</h5>
                            <div id="ccForm">
                                <div class="input-field">
                                    <ul id="ccList"></ul>
                                </div>
                            </div>
                        </div>
                    <div class="modal-footer">
                        <button type="button" class="modal-close waves-effect waves-green btn-flat">Done</button>
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
                                <a href=""""),_display_(/*414.43*/routes/*414.49*/.Application.home()),format.raw/*414.68*/("""" class="btn waves-effect waves-light red darken-2">
                                    Cancel</a>

                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
""")))}),format.raw/*424.2*/("""
"""))
      }
    }
  }

  def render(userTypes:String,userId:String,userEmail:String,professors:JsonNode): play.twirl.api.HtmlFormat.Appendable = apply(userTypes,userId,userEmail,professors)

  def f:((String,String,String,JsonNode) => play.twirl.api.HtmlFormat.Appendable) = (userTypes,userId,userEmail,professors) => apply(userTypes,userId,userEmail,professors)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:36 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/rajobRegister.scala.html
                  HASH: fcaea9477a86e593c433bed89e2c70836374a6e4
                  MATRIX: 814->1|837->18|860->35|887->56|1269->104|1423->183|1437->190|1517->194|1548->199|1598->222|1626->223|1671->240|1732->273|1761->274|1802->287|1833->290|1862->291|1907->308|1967->340|1996->341|2037->354|2082->371|2111->372|2156->389|2214->419|2243->420|2284->433|2320->441|2349->442|2394->459|2449->486|2478->487|2510->492|2588->543|2603->549|2674->599|2754->652|2769->658|2843->710|3007->846|3036->847|3081->864|3182->937|3211->938|3260->959|3392->1063|3421->1064|3474->1089|3676->1263|3705->1264|3754->1285|3787->1290|3816->1291|3869->1316|4388->1807|4417->1808|4466->1829|4540->1875|4569->1876|4615->1894|4644->1895|4718->1941|4747->1942|4792->1959|4898->2037|4927->2038|4976->2059|5033->2088|5062->2089|5116->2115|5145->2116|5194->2137|5328->2243|5357->2244|5410->2269|5493->2324|5522->2325|5631->2406|5660->2407|5713->2432|5854->2545|5883->2546|5940->2575|6091->2698|6120->2699|6149->2700|6182->2705|6211->2706|6268->2735|6371->2810|6400->2811|6449->2832|6478->2833|6523->2850|6552->2851|6595->2866|6624->2867|6667->2882|6715->2902|6744->2903|6789->2920|6865->2968|6894->2969|6938->2985|7000->3019|7029->3020|7074->3037|7150->3085|7179->3086|7293->3172|7322->3173|7367->3190|7551->3346|7580->3347|7629->3368|7715->3426|7744->3427|7797->3452|7941->3568|7970->3569|8027->3598|8162->3704|8192->3705|8222->3706|8255->3710|8285->3711|8343->3740|8400->3768|8430->3769|8492->3802|8567->3848|8597->3849|8630->3853|8660->3854|8719->3884|8749->3885|8804->3911|8834->3912|8884->3933|8914->3934|8960->3951|8990->3952|9051->3984|9081->3985|9131->4006|9190->4036|9220->4037|9268->4056|9359->4118|9389->4119|9435->4136|9768->4440|9798->4441|9845->4459|9899->4484|9929->4485|9972->4499|10022->4520|10052->4521|10098->4538|10456->4867|10486->4868|10529->4882|10593->4917|10623->4918|10669->4935|10848->5085|10878->5086|10928->5107|10995->5145|11025->5146|11055->5147|11089->5152|11119->5153|11169->5174|11269->5245|11299->5246|11345->5263|11453->5342|11483->5343|11533->5364|11655->5457|11685->5458|11715->5459|11749->5464|11779->5465|11829->5486|11928->5556|11958->5557|12000->5570|12030->5571|12072->5584|12159->5642|12189->5643|12235->5660|12374->5771|12390->5777|12447->5812|12576->5912|12606->5913|12664->5942|12795->6044|12825->6045|12887->6078|13107->6269|13137->6270|13179->6283|13209->6284|13274->6320|13304->6321|13350->6338|13380->6339|13410->6340|13440->6341|13470->6342|13515->6358|13545->6359|13575->6360|13606->6362|13636->6363|13678->6376|13708->6377|13878->6518|13908->6519|13964->6546|13994->6547|14065->6589|14095->6590|14153->6619|14259->6696|14289->6697|14376->6755|14406->6756|14456->6777|14631->6923|14661->6924|14715->6949|14997->7202|15027->7203|15075->7222|15105->7223|15149->7238|15179->7239|15236->180|15266->7257|15296->7260|15334->7288|15375->7290|15408->7295|15449->7308|15465->7314|15527->7354|15622->7421|15638->7427|15702->7469|15783->7522|15799->7528|15874->7580|16333->8010|16350->8016|16409->8052|16999->8614|17029->8634|17070->8636|17128->8665|17439->8948|17490->8982|17531->8984|17601->9025|17687->9083|17701->9087|17742->9106|17825->9161|17839->9165|17883->9187|17961->9237|17975->9241|18022->9266|18144->9356|18210->9393|18749->9903|18779->9904|18849->9945|19170->10237|19200->10238|19274->10283|19459->10439|19489->10440|19567->10489|19623->10516|19653->10517|19735->10570|20076->10882|20106->10883|20180->10928|20210->10929|20284->10974|20489->11150|20519->11151|20587->11190|20617->11191|20703->11258|20717->11263|20757->11264|20815->11293|20900->11350|20928->11356|21049->11449|21080->11458|21142->11488|21196->11513|23179->13466|23210->13467|23245->13472|23276->13473|23961->14128|23992->14129|24027->14134|24058->14135|27289->17378|27343->17448|27397->17541|27452->17707|27507->17810|27562->17936|27616->17999|27671->18099|27726->18193|27781->18359|27836->18462|27891->18607|27945->18670|27999->18729|28054->18755|29869->20589|29900->20726|29930->20757|29981->20779|31344->22114|31360->22120|31401->22139|31696->22403
                  LINES: 31->1|32->2|33->3|34->4|39->5|43->7|43->7|45->7|46->8|47->9|47->9|48->10|49->11|49->11|50->12|50->12|50->12|51->13|52->14|52->14|53->15|53->15|53->15|54->16|55->17|55->17|56->18|56->18|56->18|57->19|58->20|58->20|59->21|61->23|61->23|61->23|62->24|62->24|62->24|66->28|66->28|67->29|68->30|68->30|69->31|70->32|70->32|71->33|73->35|73->35|74->36|74->36|74->36|75->37|81->43|81->43|82->44|83->45|83->45|87->49|87->49|89->51|89->51|90->52|91->53|91->53|92->54|93->55|93->55|95->57|95->57|96->58|98->60|98->60|99->61|100->62|100->62|102->64|102->64|103->65|105->67|105->67|106->68|107->69|107->69|107->69|107->69|107->69|108->70|109->71|109->71|110->72|110->72|111->73|111->73|113->75|113->75|116->78|116->78|116->78|117->79|118->80|118->80|122->84|122->84|122->84|123->85|124->86|124->86|127->89|127->89|128->90|131->93|131->93|132->94|133->95|133->95|134->96|136->98|136->98|137->99|139->101|139->101|139->101|139->101|139->101|140->102|140->102|140->102|141->103|142->104|142->104|142->104|142->104|144->106|144->106|146->108|146->108|147->109|147->109|148->110|148->110|149->111|149->111|150->112|151->113|151->113|154->116|154->116|154->116|155->117|159->121|159->121|161->123|162->124|162->124|164->126|164->126|164->126|165->127|170->132|170->132|172->134|172->134|172->134|173->135|175->137|175->137|176->138|177->139|177->139|177->139|177->139|177->139|178->140|179->141|179->141|180->142|181->143|181->143|182->144|184->146|184->146|184->146|184->146|184->146|185->147|186->148|186->148|187->149|187->149|188->150|188->150|188->150|189->151|192->154|192->154|192->154|194->156|194->156|195->157|196->158|196->158|197->159|200->162|200->162|200->162|200->162|201->163|201->163|201->163|201->163|201->163|201->163|201->163|201->163|201->163|201->163|201->163|201->163|201->163|201->163|205->167|205->167|206->168|206->168|207->169|207->169|208->170|209->171|209->171|211->173|211->173|212->174|213->175|213->175|214->176|219->181|219->181|220->182|220->182|221->183|221->183|224->5|226->185|228->187|228->187|228->187|229->188|229->188|229->188|229->188|231->190|231->190|231->190|232->191|232->191|232->191|240->199|240->199|240->199|249->208|249->208|249->208|250->209|254->213|254->213|254->213|255->214|256->215|256->215|256->215|257->216|257->216|257->216|258->217|258->217|258->217|260->219|261->220|269->228|269->228|270->229|274->233|274->233|275->234|276->235|276->235|277->236|277->236|277->236|278->237|281->240|281->240|282->241|282->241|283->242|285->244|285->244|286->245|286->245|288->247|288->247|288->247|289->248|289->248|289->248|290->249|290->249|291->250|292->251|322->281|322->281|322->281|322->281|331->290|331->290|331->290|331->290|383->342|384->343|385->344|386->345|387->346|388->347|389->348|390->349|392->351|393->352|394->353|395->354|396->355|397->356|399->358|426->385|427->386|428->387|430->389|455->414|455->414|455->414|465->424
                  -- GENERATED --
              */
          