
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

object jobEdit extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template7[Job,String,String,String,String,String,Boolean,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(job: Job,userTypes: String, tableName: String, jobFileType: String, tableRecorderId: String, backendPort: String, jobDocument: Boolean):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._
/*3.2*/import models._
/*4.2*/import models.Job

def /*6.2*/scripts/*6.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.13*/("""
    """),format.raw/*7.5*/("""<style>
            tr """),format.raw/*8.16*/("""{"""),format.raw/*8.17*/("""
                """),format.raw/*9.17*/("""border-bottom: none;
            """),format.raw/*10.13*/("""}"""),format.raw/*10.14*/("""
            """),format.raw/*11.13*/("""td """),format.raw/*11.16*/("""{"""),format.raw/*11.17*/("""
                """),format.raw/*12.17*/("""text-align: center;
            """),format.raw/*13.13*/("""}"""),format.raw/*13.14*/("""
            """),format.raw/*14.13*/(""".ql-editor strong"""),format.raw/*14.30*/("""{"""),format.raw/*14.31*/("""
                """),format.raw/*15.17*/("""font-weight:bold;
            """),format.raw/*16.13*/("""}"""),format.raw/*16.14*/("""
            """),format.raw/*17.13*/("""#editor """),format.raw/*17.21*/("""{"""),format.raw/*17.22*/("""
                """),format.raw/*18.17*/("""height: 375px;
            """),format.raw/*19.13*/("""}"""),format.raw/*19.14*/("""
    """),format.raw/*20.5*/("""</style>
    <script type="text/javascript" src='"""),_display_(/*21.42*/routes/*21.48*/.Assets.at("javascripts/database_field_length.js")),format.raw/*21.98*/("""'></script>
    <script type="text/javascript" src='"""),_display_(/*22.42*/routes/*22.48*/.Assets.at("javascripts/field_validation_helper.js")),format.raw/*22.100*/("""'></script>

    <script type="text/javascript">
            count = 0;
            delc = 0;
            var originCreator;
            var quill;
            function checkCreator() """),format.raw/*29.37*/("""{"""),format.raw/*29.38*/("""
                """),format.raw/*30.17*/("""$("#warningModal").modal("open");
                $("#challengeCreatorMsg").text("");
            """),format.raw/*32.13*/("""}"""),format.raw/*32.14*/("""
            """),format.raw/*33.13*/("""$(document).ready(function () """),format.raw/*33.43*/("""{"""),format.raw/*33.44*/("""
                """),format.raw/*34.17*/("""quill = new Quill('#editor', """),format.raw/*34.46*/("""{"""),format.raw/*34.47*/("""
                    """),format.raw/*35.21*/("""modules: """),format.raw/*35.30*/("""{"""),format.raw/*35.31*/("""
                        """),format.raw/*36.25*/("""toolbar: [
                            ["""),format.raw/*37.30*/("""{"""),format.raw/*37.31*/(""" """),format.raw/*37.32*/("""'font': [] """),format.raw/*37.43*/("""}"""),format.raw/*37.44*/("""],
                            ["""),format.raw/*38.30*/("""{"""),format.raw/*38.31*/(""" """),format.raw/*38.32*/("""'size': ['small', false, 'large', 'huge'] """),format.raw/*38.74*/("""}"""),format.raw/*38.75*/("""],  // custom dropdown
                            ['bold', 'italic', 'underline', 'strike'],        // toggled buttons
                            ["""),format.raw/*40.30*/("""{"""),format.raw/*40.31*/(""" """),format.raw/*40.32*/("""'color': [] """),format.raw/*40.44*/("""}"""),format.raw/*40.45*/(""", """),format.raw/*40.47*/("""{"""),format.raw/*40.48*/(""" """),format.raw/*40.49*/("""'background': [] """),format.raw/*40.66*/("""}"""),format.raw/*40.67*/("""],          // dropdown with defaults from theme
                            ['blockquote'],

                            ["""),format.raw/*43.30*/("""{"""),format.raw/*43.31*/(""" """),format.raw/*43.32*/("""'list': 'ordered'"""),format.raw/*43.49*/("""}"""),format.raw/*43.50*/(""", """),format.raw/*43.52*/("""{"""),format.raw/*43.53*/(""" """),format.raw/*43.54*/("""'list': 'bullet' """),format.raw/*43.71*/("""}"""),format.raw/*43.72*/("""],
                            ["""),format.raw/*44.30*/("""{"""),format.raw/*44.31*/(""" """),format.raw/*44.32*/("""'script': 'sub'"""),format.raw/*44.47*/("""}"""),format.raw/*44.48*/(""", """),format.raw/*44.50*/("""{"""),format.raw/*44.51*/(""" """),format.raw/*44.52*/("""'script': 'super' """),format.raw/*44.70*/("""}"""),format.raw/*44.71*/("""],      // superscript/subscript
                            ["""),format.raw/*45.30*/("""{"""),format.raw/*45.31*/(""" """),format.raw/*45.32*/("""'indent': '-1'"""),format.raw/*45.46*/("""}"""),format.raw/*45.47*/(""", """),format.raw/*45.49*/("""{"""),format.raw/*45.50*/(""" """),format.raw/*45.51*/("""'indent': '+1' """),format.raw/*45.66*/("""}"""),format.raw/*45.67*/("""],          // outdent/indent
                            ["""),format.raw/*46.30*/("""{"""),format.raw/*46.31*/(""" """),format.raw/*46.32*/("""'direction': 'rtl' """),format.raw/*46.51*/("""}"""),format.raw/*46.52*/("""],                         // text directio
                            ["""),format.raw/*47.30*/("""{"""),format.raw/*47.31*/(""" """),format.raw/*47.32*/("""'align': [] """),format.raw/*47.44*/("""}"""),format.raw/*47.45*/("""],
                            ['link', 'image']
                        ]
                    """),format.raw/*50.21*/("""}"""),format.raw/*50.22*/(""",
                    placeholder: 'Enter project description...',
                    theme: 'snow'
                """),format.raw/*53.17*/("""}"""),format.raw/*53.18*/(""");

                var limit = jobDescriptionMaxLength;
                quill.on('text-change', function (delta, old, source) """),format.raw/*56.71*/("""{"""),format.raw/*56.72*/("""
                    """),format.raw/*57.21*/("""if (quill.getLength() > limit+1) """),format.raw/*57.54*/("""{"""),format.raw/*57.55*/("""
                        """),format.raw/*58.25*/("""document.getElementById("descriptionMsg").innerHTML = "Field should be no longer than "+ limit +" characters";
                    """),format.raw/*59.21*/("""}"""),format.raw/*59.22*/("""else"""),format.raw/*59.26*/("""{"""),format.raw/*59.27*/("""
                        """),format.raw/*60.25*/("""document.getElementById("descriptionMsg").innerHTML = "";
                    """),format.raw/*61.21*/("""}"""),format.raw/*61.22*/("""
                """),format.raw/*62.17*/("""}"""),format.raw/*62.18*/(""");

                quill.clipboard.dangerouslyPasteHTML(entityToString());
                //  $("#description").val();
                $("#addPanel").hide();
                $("#previewPanel").hide();
                if($("#showImg").attr("src") == "") """),format.raw/*68.53*/("""{"""),format.raw/*68.54*/("""
                    """),format.raw/*69.21*/("""$("#projectPreview").hide();
                """),format.raw/*70.17*/("""}"""),format.raw/*70.18*/("""
                """),format.raw/*71.17*/("""$("#showPanel").click(function () """),format.raw/*71.51*/("""{"""),format.raw/*71.52*/("""
                    """),format.raw/*72.21*/("""var panel = document.getElementById("addPanel");
                    if (panel.style.display == "none") """),format.raw/*73.56*/("""{"""),format.raw/*73.57*/("""
                        """),format.raw/*74.25*/("""$("#btnName").attr("style", "transform:rotate(-45deg);transition:transform 0.3s linear;");
                        $("#buttonText").text("Close Window");
                    """),format.raw/*76.21*/("""}"""),format.raw/*76.22*/("""
                    """),format.raw/*77.21*/("""else """),format.raw/*77.26*/("""{"""),format.raw/*77.27*/("""
                        """),format.raw/*78.25*/("""$("#btnName").attr("style", "transform:rotate(0deg);transition:transform 0.3s linear;");
                        $("#buttonText").text("Add Members");
                        document.getElementById("memberName").value = "";
                        document.getElementById("email").value = "";
                        document.getElementById("email").classList.remove("invalid");
                        document.getElementById("memberName").classList.remove("invalid");
                    """),format.raw/*84.21*/("""}"""),format.raw/*84.22*/("""
                    """),format.raw/*85.21*/("""$("#addPanel").slideToggle();

                """),format.raw/*87.17*/("""}"""),format.raw/*87.18*/(""");


                //preview the updated image
                $("#addmember").click(function changepic() """),format.raw/*91.60*/("""{"""),format.raw/*91.61*/("""
                    """),format.raw/*92.21*/("""if (document.getElementById("memberName").value.trim().length==0)"""),format.raw/*92.86*/("""{"""),format.raw/*92.87*/("""
                        """),format.raw/*93.25*/("""document.getElementById("memberName").classList.add("invalid");
                    """),format.raw/*94.21*/("""}"""),format.raw/*94.22*/("""
                    """),format.raw/*95.21*/("""if (document.getElementById("email").value.trim().length==0)"""),format.raw/*95.81*/("""{"""),format.raw/*95.82*/("""
                        """),format.raw/*96.25*/("""document.getElementById("email").classList.add("invalid");
                    """),format.raw/*97.21*/("""}"""),format.raw/*97.22*/("""
                    """),format.raw/*98.21*/("""// document.getElementById("email").value.trim().length()==0;
                    var isName = document.getElementById("memberName").classList.contains("invalid") ? false : true;
                    var isEmail = document.getElementById("email").classList.contains("invalid") ? false : true;

                    if(!isName || !isEmail) return;
                    if (document.getElementById("photo").value == "") """),format.raw/*103.71*/("""{"""),format.raw/*103.72*/("""
                        """),format.raw/*104.25*/("""var url = "../../../../assets/images/person.jpg";
                        showPreview(url);
                        return;
                    """),format.raw/*107.21*/("""}"""),format.raw/*107.22*/("""
                    """),format.raw/*108.21*/("""var reads = new FileReader();
                    f = document.getElementById("photo").files[0];
                    reads.readAsDataURL(f);
                    reads.onload = function (e) """),format.raw/*111.49*/("""{"""),format.raw/*111.50*/("""
                        """),format.raw/*112.25*/("""showPreview(this.result);

                    """),format.raw/*114.21*/("""}"""),format.raw/*114.22*/(""";
                """),format.raw/*115.17*/("""}"""),format.raw/*115.18*/(""");
                document.body.scrollTop = document.documentElement.scrollTop = 0;
            """),format.raw/*117.13*/("""}"""),format.raw/*117.14*/(""");

            function entityToString()"""),format.raw/*119.38*/("""{"""),format.raw/*119.39*/("""
                """),format.raw/*120.17*/("""var div=document.createElement('div');
                """),_display_(/*121.18*/if(job.getShortDescription!=null)/*121.51*/{_display_(Seq[Any](format.raw/*121.52*/("""
                """),format.raw/*122.17*/("""div.innerHTML = """"),_display_(/*122.35*/job/*122.38*/.getShortDescription),format.raw/*122.58*/("""";
                """)))}),format.raw/*123.18*/("""
                """),format.raw/*124.17*/("""var res=div.innerText||div.textContent;
                return res;
            """),format.raw/*126.13*/("""}"""),format.raw/*126.14*/("""

            """),format.raw/*128.13*/("""function getHTML() //display current HTML
            """),format.raw/*129.13*/("""{"""),format.raw/*129.14*/("""
                """),format.raw/*130.17*/("""if(document.getElementById("descriptionMsg").innerText.length != 0)
                    return false;
                console.log(Number.isInteger('fjidsao'));
                //console.log("isnan:" + isNaN($("#challengeCreator").text());
                var cid = $("#challengeCreator").val()
                console.log("cid" + $("#challengeCreator").val());
                console.log("typeof" + typeof($("#challengeCreator").val()));

                if(isNaN(cid))"""),format.raw/*138.31*/("""{"""),format.raw/*138.32*/("""
                    """),format.raw/*139.21*/("""//document.getElementById(urlMsgId).setAttribute('data-error', msg);
                    console.log("cidddMSg:" + $("#challengeCreatorMsg").text())
                    $("#challengeCreatorMsg").text("Please specify correct id format");

                    return false;
                """),format.raw/*144.17*/("""}"""),format.raw/*144.18*/("""
                """),format.raw/*145.17*/("""exist = false;
                $.ajax("""),format.raw/*146.24*/("""{"""),format.raw/*146.25*/("""
                    """),format.raw/*147.21*/("""url: "/user/allUserIds",
                    headers: """),format.raw/*148.30*/("""{"""),format.raw/*148.31*/("""
                        """),format.raw/*149.25*/("""'Content-Type': 'application/json'
                    """),format.raw/*150.21*/("""}"""),format.raw/*150.22*/(""",
                    async: false,
                    type: "GET"
                """),format.raw/*153.17*/("""}"""),format.raw/*153.18*/(""").done(function (data) """),format.raw/*153.41*/("""{"""),format.raw/*153.42*/("""
                    """),format.raw/*154.21*/("""console.log("data:" + data)
                    console.log("id:" + cid)
                    for(i in data)"""),format.raw/*156.35*/("""{"""),format.raw/*156.36*/("""
                        """),format.raw/*157.25*/("""console.log(Number(data[i]) + "," + Number(cid))
                        if(Number(data[i]) == Number(cid))"""),format.raw/*158.59*/("""{"""),format.raw/*158.60*/("""
                            """),format.raw/*159.29*/("""exist = true;
                            console.log("loop:" + exist);
                        """),format.raw/*161.25*/("""}"""),format.raw/*161.26*/("""
                    """),format.raw/*162.21*/("""}"""),format.raw/*162.22*/("""

                """),format.raw/*164.17*/("""}"""),format.raw/*164.18*/(""");
                console.log("out" + exist)
                if(!exist)"""),format.raw/*166.27*/("""{"""),format.raw/*166.28*/("""
                    """),format.raw/*167.21*/("""$("#challengeCreatorMsg").text("This user does not exist!");
                    return false;
                """),format.raw/*169.17*/("""}"""),format.raw/*169.18*/("""
                """),format.raw/*170.17*/("""$("#editor").find("img").each(function () """),format.raw/*170.59*/("""{"""),format.raw/*170.60*/("""
                    """),format.raw/*171.21*/("""if($(this).attr("width") == null) """),format.raw/*171.55*/("""{"""),format.raw/*171.56*/("""
                        """),format.raw/*172.25*/("""// If this is a new image
                        var img = this;
                        var dataurl = $(this).attr("src");
                        var arr = dataurl.split(','), mime = arr[0].match(/:(.*?);/)[1],
                                bstr = atob(arr[1]), n = bstr.length, u8arr = new Uint8Array(n);
                        while (n--) """),format.raw/*177.37*/("""{"""),format.raw/*177.38*/("""
                            """),format.raw/*178.29*/("""u8arr[n] = bstr.charCodeAt(n);
                        """),format.raw/*179.25*/("""}"""),format.raw/*179.26*/("""
                        """),format.raw/*180.25*/("""var f = new File([u8arr], "file", """),format.raw/*180.59*/("""{"""),format.raw/*180.60*/("""type: mime"""),format.raw/*180.70*/("""}"""),format.raw/*180.71*/(""");
                        var fd = new FormData();
                        fd.append('file', f);
                        countImagesInDescription ++;
                        $.ajax("""),format.raw/*184.32*/("""{"""),format.raw/*184.33*/("""
                            """),format.raw/*185.29*/("""url: "/job/uploadImg/"""),_display_(/*185.51*/job/*185.54*/.getId),format.raw/*185.60*/("""/" + (countImagesInDescription-1) ,
                            data: fd,
                            contentType: false,
                            dataType: "text",
                            processData: false,
                            async: false,
                            type: "POST",
                            success: function (data) """),format.raw/*192.54*/("""{"""),format.raw/*192.55*/("""
                                """),format.raw/*193.33*/("""console.log(data);
                                $(img).attr("src", data);
                                $(img).attr("width", "50%");
                            """),format.raw/*196.29*/("""}"""),format.raw/*196.30*/(""",
                            error: function (msg) """),format.raw/*197.51*/("""{"""),format.raw/*197.52*/("""
                                """),format.raw/*198.33*/("""console.log("123123123");
                            """),format.raw/*199.29*/("""}"""),format.raw/*199.30*/("""
                        """),format.raw/*200.25*/("""}"""),format.raw/*200.26*/(""");
                    """),format.raw/*201.21*/("""}"""),format.raw/*201.22*/("""



                """),format.raw/*205.17*/("""}"""),format.raw/*205.18*/(""");

                var ajaxflag = true;

                if(!ajaxflag)"""),format.raw/*209.30*/("""{"""),format.raw/*209.31*/("""
                    """),format.raw/*210.21*/("""return false;
                """),format.raw/*211.17*/("""}"""),format.raw/*211.18*/("""

                """),format.raw/*213.17*/("""var html = quill.root.innerHTML;
                $("#description").val(html);
                $("#countImagesInDescription").val(countImagesInDescription);




                return true;
            """),format.raw/*221.13*/("""}"""),format.raw/*221.14*/("""

            """),format.raw/*223.13*/("""function showProPreview(obj) """),format.raw/*223.42*/("""{"""),format.raw/*223.43*/("""
                """),format.raw/*224.17*/("""if($("#showImg").attr("src") == "") """),format.raw/*224.53*/("""{"""),format.raw/*224.54*/("""
                    """),format.raw/*225.21*/("""$("#deleteBtn").hide();
                """),format.raw/*226.17*/("""}"""),format.raw/*226.18*/("""
                """),format.raw/*227.17*/("""else """),format.raw/*227.22*/("""{"""),format.raw/*227.23*/("""
                    """),format.raw/*228.21*/("""$("#deleteBtn").show();
                    //$('#previewMsg').text("");
                """),format.raw/*230.17*/("""}"""),format.raw/*230.18*/("""
                """),format.raw/*231.17*/("""var panel = document.getElementById("previewPanel");
                if (panel.style.display == "none") """),format.raw/*232.52*/("""{"""),format.raw/*232.53*/("""
                    """),format.raw/*233.21*/("""$(obj).text("Close Preview");
                """),format.raw/*234.17*/("""}"""),format.raw/*234.18*/("""
                """),format.raw/*235.17*/("""else """),format.raw/*235.22*/("""{"""),format.raw/*235.23*/("""
                    """),format.raw/*236.21*/("""$(obj).text("Preview Or Delete Picture");
                """),format.raw/*237.17*/("""}"""),format.raw/*237.18*/("""
                """),format.raw/*238.17*/("""$("#previewPanel").slideToggle();

            """),format.raw/*240.13*/("""}"""),format.raw/*240.14*/("""


            """),format.raw/*243.13*/("""function deletePDF() """),format.raw/*243.34*/("""{"""),format.raw/*243.35*/("""
                """),format.raw/*244.17*/("""document.getElementById('showImg').src = "";
                $('#pdfRecord').val("delete");
                $("#pdfDeleteBtn").hide();
                $("#pdfDownload").hide();
                $('#pdfPreviewMsg').text("The PDF is deleted. You need to click \"UPDATE\" button below if you want to save the changes.");
            """),format.raw/*249.13*/("""}"""),format.raw/*249.14*/("""

            """),format.raw/*251.13*/("""function clearPDF(inputId, textId) """),format.raw/*251.48*/("""{"""),format.raw/*251.49*/("""
                """),format.raw/*252.17*/("""console.log("clearFile called for", inputId, textId);
                var fileInput = document.getElementById(inputId);
                if(fileInput) """),format.raw/*254.31*/("""{"""),format.raw/*254.32*/("""
                    """),format.raw/*255.21*/("""fileInput.value = "";
                """),format.raw/*256.17*/("""}"""),format.raw/*256.18*/(""" """),format.raw/*256.19*/("""else """),format.raw/*256.24*/("""{"""),format.raw/*256.25*/("""
                    """),format.raw/*257.21*/("""console.error("Cannot find element with id", inputId);
                """),format.raw/*258.17*/("""}"""),format.raw/*258.18*/("""
                """),format.raw/*259.17*/("""var textInput = document.getElementById(textId);
                if(textInput) """),format.raw/*260.31*/("""{"""),format.raw/*260.32*/("""
                    """),format.raw/*261.21*/("""textInput.value = "";
                    $('#' + textId).trigger('change');
                """),format.raw/*263.17*/("""}"""),format.raw/*263.18*/(""" """),format.raw/*263.19*/("""else """),format.raw/*263.24*/("""{"""),format.raw/*263.25*/("""
                    """),format.raw/*264.21*/("""console.error("Cannot find element with id", textId);
                """),format.raw/*265.17*/("""}"""),format.raw/*265.18*/("""
            """),format.raw/*266.13*/("""}"""),format.raw/*266.14*/("""


    """),format.raw/*269.5*/("""</script>
""")))};
Seq[Any](format.raw/*1.138*/("""
"""),format.raw/*5.1*/("""
"""),format.raw/*270.2*/("""

"""),_display_(/*272.2*/main("Job Edit", scripts)/*272.27*/ {_display_(Seq[Any](format.raw/*272.29*/("""

    """),format.raw/*274.5*/("""<link href='"""),_display_(/*274.18*/routes/*274.24*/.Assets.at("stylesheets/quill.snow.css")),format.raw/*274.64*/("""'
    rel="stylesheet" />
    <script type="text/javascript" src='"""),_display_(/*276.42*/routes/*276.48*/.Assets.at("javascripts/plugins/quill.js")),format.raw/*276.90*/("""'></script>
    <script type="text/javascript" src='"""),_display_(/*277.42*/routes/*277.48*/.Assets.at("javascripts/field_validation_helper.js")),format.raw/*277.100*/("""'></script>

    <div class="container">
        <div class="row">
            <div class="col  s12 m10 offset-m1">
                <div class="card-panel">
                    <h4 class="center form-signin-heading" align="center">
                        Edit Job Information</h4>
                    <div id="warningModal" class="modal">
                        <div class="modal-content">
                            <h5 style="color: red">Warning!</h5>
                            <p style="font-weight: bold">Do you really want to change the publisher of this job?
                                Please note that after this change, You <span style="color: red">
                                MAY NOT</span> edit this project again.</p>
                        </div>
                        <div class="modal-footer">
                            <a id="cancel-change-creator" class="modal-close waves-effect waves-green btn-flat">
                                Cancel</a>
                            <a id="confirm-change-creator"
                            class="modal-close waves-effect waves-green btn-flat">Confirm</a>
                        </div>
                    </div>
                    <form class="form-signin" enctype="multipart/form-data" id="editTechnologyForm" method="post" onsubmit="return getHTML()" action=""""),_display_(/*299.152*/routes/*299.158*/.JobController.jobEditPOST(job.getId)),format.raw/*299.195*/("""">
                        <div id="hiddenDiv" style="display: none;">
                            <input name="id" id="id" class="validate" value=""""),_display_(/*301.79*/job/*301.82*/.getId),format.raw/*301.88*/("""">
                            <input name="isActive" id="isActive" class="validate" value=""""),_display_(/*302.91*/job/*302.94*/.getIsActive),format.raw/*302.106*/("""">
                            """),format.raw/*306.126*/("""
                        """),format.raw/*307.25*/("""</div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="title" id="title" class="validate" value=""""),_display_(/*311.94*/job/*311.97*/.getTitle),format.raw/*311.106*/("""" required>
                                <label for="title">Title* </label>
                                <span id="titleMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>

                        <div class="row">
                            <div class="input-field col s12">
                                <input type="text" name="organization" id="organization"  class="validate" required value=""""),_display_(/*319.125*/job/*319.128*/.getOrganization),format.raw/*319.144*/("""">
                                <label for="organization">
                                    Organization Name* </label>
                                <span id="organizationMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>

                        <div class="row">
                            <div class="input-field col s12">
                                <input type="text" name="goals" id="goals"  class="validate" required value=""""),_display_(/*328.111*/job/*328.114*/.getGoals),format.raw/*328.123*/("""">
                                <label for="goals">
                                    Goals* </label>
                                <span id="goalsMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="shortDescription" id="shortDescription" value = """"),_display_(/*337.101*/job/*337.104*/.getShortDescription),format.raw/*337.124*/(""""  class="validate" required onchange="validateRegex(this.id, /."""),format.raw/*337.188*/("""{"""),format.raw/*337.189*/("""0,100"""),format.raw/*337.194*/("""}"""),format.raw/*337.195*/("""/)">
                                <label for="shortDescription">
                                    Short Description* </label>
                                <span id="shortDescriptionMsg" class="helper-text" data-success="✓" data-error="The short description must be under 100 characterßs"></span>
                            </div>ß
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <textarea type="text" style="height: 200px;
                                    word-wrap: break-word; margin-top: 10px;" id="longDescription" placeholder="" name="longDescription" value=""""),_display_(/*346.146*/job/*346.149*/.getLongDescription),format.raw/*346.168*/("""" onchange="validateRegex(this.id, /."""),format.raw/*346.205*/("""{"""),format.raw/*346.206*/("""0,600"""),format.raw/*346.211*/("""}"""),format.raw/*346.212*/("""/)">"""),_display_(/*346.217*/job/*346.220*/.getLongDescription),format.raw/*346.239*/("""</textarea>
                                <label for="longDescription">Long Description</label>
                                <span id="longDescriptionMsg" class="helper-text" data-success="✓" data-error="The long description must be under 600 characters" style="color: red; font-size: 12px"></span>
                            </div>
                        </div>

                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="location" id="location" value=""""),_display_(/*355.83*/job/*355.86*/.getLocation),format.raw/*355.98*/("""" class="validate" required>
                                <label for="location">
                                    Location* </label>
                                <span id="locationMsg" class="helper-text" data-success="✓" data-error=""></span>
                            </div>
                        </div>

                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="fields" id="fields" value=""""),_display_(/*365.79*/job/*365.82*/.getFields),format.raw/*365.92*/("""" class="validate" required>
                                <label for="fields">
                                    Fields* </label>
                                <span id="fieldsMsg" class="helper-text" data-success="✓" data-error=""></span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="requiredExpertise" id="location" value = """"),_display_(/*374.94*/job/*374.97*/.getRequiredExpertise),format.raw/*374.118*/(""""  class="validate" required>
                                <label for="requiredExpertise">
                                    Required Expertise* </label>
                                <span id="requiredExpertiseMsg" class="helper-text" data-success="✓" data-error=""></span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="preferredExpertise" id="location" value = """"),_display_(/*383.95*/job/*383.98*/.getPreferredExpertise),format.raw/*383.120*/("""" class="validate" required>
                                <label for="preferredExpertise">
                                    Preferred Expertise* </label>
                                <span id="preferredExpertiseMsg" class="helper-text" data-success="✓" data-error=""></span>
                            </div>
                        </div>

                        Salary Range*
                        <div class="row">
                            <div class="input-field col s12 m5">
                                <input type="text" name="minSalary" id="minSalary" value=""""),_display_(/*393.92*/job/*393.95*/.getMinSalary),format.raw/*393.108*/("""" class="validate" required>
                                <label for="minSalary">Min Salary*</label>
                                <span id="minSalaryMsg" class="helper-text" data-success="✓" data-error="Please input a minimum salary" style="color: red"></span>
                            </div>
                            <div class="input-field col s12 m2">_</div>

                            <div class="input-field col s12 m5">
                                <input type="text" name="maxSalary" id="maxSalary" value=""""),_display_(/*400.92*/job/*400.95*/.getMaxSalary),format.raw/*400.108*/("""" class="validate" required>
                                <label for="maxSalary">Max Salary*</label>
                                <span id="maxSalaryMsg" class="helper-text" data-success="✓" data-error="Please input a maximum salary" style="color: red"></span>
                            </div>
                        </div>

                        """),format.raw/*426.27*/("""

                        """),format.raw/*428.25*/("""<div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="url" id="url" value=""""),_display_(/*431.73*/job/*431.76*/.getUrl),format.raw/*431.83*/("""" class="validate" onchange="validateRegex(this.id, 'URL')">
                                <label for="url">
                                    Job URL </label>
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
                                        """),_display_(/*455.42*/if(jobDocument)/*455.57*/ {_display_(Seq[Any](format.raw/*455.59*/("""
                                            """),format.raw/*456.45*/("""<div class="row" style="margin-top: 10px;">
                                                <div class="col s12">
                                                    <a href="javascript:void(0);"
                                                    data-url=""""),_display_(/*459.64*/routes/*459.70*/.FileController.getFile(tableName, jobFileType, tableRecorderId)),format.raw/*459.134*/(""""
                                                    class="blue-text text-darken-3"
                                                    onclick="openAndCheckNewTabUrl(this)">
                                                        Download Current Job Document
                                                    </a>
                                                </div>
                                            </div>
                                        """)))}),format.raw/*466.42*/("""


                        """),format.raw/*469.25*/("""<div class="actions row center">
                            <div class="input-field col s12">
                                <button type="submit" id="jobRegister" class="btn waves-effect waves-light blue darken-2">
                                    Update</button>
                                <a href=""""),_display_(/*473.43*/routes/*473.49*/.JobController.jobDetail(job.getId)),format.raw/*473.84*/("""" class="btn waves-effect waves-light red darken-2">
                                    Cancel</a>

                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>

    <script>
            function openAndCheckNewTabUrl(link) """),format.raw/*485.50*/("""{"""),format.raw/*485.51*/("""const url = link.getAttribute('data-url');

                fetch(url, """),format.raw/*487.28*/("""{"""),format.raw/*487.29*/(""" """),format.raw/*487.30*/("""method: 'HEAD' """),format.raw/*487.45*/("""}"""),format.raw/*487.46*/(""").then(response => """),format.raw/*487.65*/("""{"""),format.raw/*487.66*/("""
                    """),format.raw/*488.21*/("""if (response.ok) """),format.raw/*488.38*/("""{"""),format.raw/*488.39*/("""
                        """),format.raw/*489.25*/("""const newTab = window.open(url, '_blank');
                        if (!newTab) """),format.raw/*490.38*/("""{"""),format.raw/*490.39*/("""
                            """),format.raw/*491.29*/("""alert("Please allow pop-ups in your browser to view this file.");
                        """),format.raw/*492.25*/("""}"""),format.raw/*492.26*/("""
                    """),format.raw/*493.21*/("""}"""),format.raw/*493.22*/(""" """),format.raw/*493.23*/("""else """),format.raw/*493.28*/("""{"""),format.raw/*493.29*/("""
                        """),format.raw/*494.25*/("""alert("The user did not upload this file");
                    """),format.raw/*495.21*/("""}"""),format.raw/*495.22*/("""
                """),format.raw/*496.17*/("""}"""),format.raw/*496.18*/(""")
                        .catch(error => """),format.raw/*497.41*/("""{"""),format.raw/*497.42*/("""
                            """),format.raw/*498.29*/("""console.error("Error checking the URL:", error);
                            alert("Failed to check the file. Please try again later.");
                        """),format.raw/*500.25*/("""}"""),format.raw/*500.26*/(""");
            """),format.raw/*501.13*/("""}"""),format.raw/*501.14*/("""
    """),format.raw/*502.5*/("""</script>

""")))}))
      }
    }
  }

  def render(job:Job,userTypes:String,tableName:String,jobFileType:String,tableRecorderId:String,backendPort:String,jobDocument:Boolean): play.twirl.api.HtmlFormat.Appendable = apply(job,userTypes,tableName,jobFileType,tableRecorderId,backendPort,jobDocument)

  def f:((Job,String,String,String,String,String,Boolean) => play.twirl.api.HtmlFormat.Appendable) = (job,userTypes,tableName,jobFileType,tableRecorderId,backendPort,jobDocument) => apply(job,userTypes,tableName,jobFileType,tableRecorderId,backendPort,jobDocument)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:32 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/jobEdit.scala.html
                  HASH: e7a6c9537d147ce0f1ffed49b6c270fe1714ab34
                  MATRIX: 1153->1|1362->139|1385->156|1408->173|1438->193|1452->200|1532->204|1563->209|1613->232|1641->233|1685->250|1746->283|1775->284|1816->297|1847->300|1876->301|1921->318|1981->350|2010->351|2051->364|2096->381|2125->382|2170->399|2228->429|2257->430|2298->443|2334->451|2363->452|2408->469|2463->496|2492->497|2524->502|2601->552|2616->558|2687->608|2767->661|2782->667|2856->719|3068->903|3097->904|3142->921|3268->1019|3297->1020|3338->1033|3396->1063|3425->1064|3470->1081|3527->1110|3556->1111|3605->1132|3642->1141|3671->1142|3724->1167|3792->1207|3821->1208|3850->1209|3889->1220|3918->1221|3978->1253|4007->1254|4036->1255|4106->1297|4135->1298|4312->1447|4341->1448|4370->1449|4410->1461|4439->1462|4469->1464|4498->1465|4527->1466|4572->1483|4601->1484|4752->1607|4781->1608|4810->1609|4855->1626|4884->1627|4914->1629|4943->1630|4972->1631|5017->1648|5046->1649|5106->1681|5135->1682|5164->1683|5207->1698|5236->1699|5266->1701|5295->1702|5324->1703|5370->1721|5399->1722|5489->1784|5518->1785|5547->1786|5589->1800|5618->1801|5648->1803|5677->1804|5706->1805|5749->1820|5778->1821|5865->1880|5894->1881|5923->1882|5970->1901|5999->1902|6100->1975|6129->1976|6158->1977|6198->1989|6227->1990|6350->2085|6379->2086|6524->2203|6553->2204|6708->2331|6737->2332|6786->2353|6847->2386|6876->2387|6929->2412|7088->2543|7117->2544|7149->2548|7178->2549|7231->2574|7337->2652|7366->2653|7411->2670|7440->2671|7723->2926|7752->2927|7801->2948|7874->2993|7903->2994|7948->3011|8010->3045|8039->3046|8088->3067|8220->3171|8249->3172|8302->3197|8504->3371|8533->3372|8582->3393|8615->3398|8644->3399|8697->3424|9216->3915|9245->3916|9294->3937|9369->3984|9398->3985|9534->4093|9563->4094|9612->4115|9705->4180|9734->4181|9787->4206|9899->4290|9928->4291|9977->4312|10065->4372|10094->4373|10147->4398|10254->4477|10283->4478|10332->4499|10776->4914|10806->4915|10860->4940|11033->5084|11063->5085|11113->5106|11331->5295|11361->5296|11415->5321|11491->5368|11521->5369|11568->5387|11598->5388|11724->5485|11754->5486|11824->5527|11854->5528|11900->5545|11984->5601|12027->5634|12067->5635|12113->5652|12159->5670|12172->5673|12214->5693|12266->5713|12312->5730|12421->5810|12451->5811|12494->5825|12577->5879|12607->5880|12653->5897|13152->6367|13182->6368|13232->6389|13549->6677|13579->6678|13625->6695|13692->6733|13722->6734|13772->6755|13855->6809|13885->6810|13939->6835|14023->6890|14053->6891|14166->6975|14196->6976|14248->6999|14278->7000|14328->7021|14464->7128|14494->7129|14548->7154|14684->7261|14714->7262|14772->7291|14897->7387|14927->7388|14977->7409|15007->7410|15054->7428|15084->7429|15185->7501|15215->7502|15265->7523|15405->7634|15435->7635|15481->7652|15552->7694|15582->7695|15632->7716|15695->7750|15725->7751|15779->7776|16155->8123|16185->8124|16243->8153|16327->8208|16357->8209|16411->8234|16474->8268|16504->8269|16543->8279|16573->8280|16784->8462|16814->8463|16872->8492|16922->8514|16935->8517|16963->8523|17345->8876|17375->8877|17437->8910|17632->9076|17662->9077|17743->9129|17773->9130|17835->9163|17918->9217|17948->9218|18002->9243|18032->9244|18084->9267|18114->9268|18163->9288|18193->9289|18293->9360|18323->9361|18373->9382|18432->9412|18462->9413|18509->9431|18739->9632|18769->9633|18812->9647|18870->9676|18900->9677|18946->9694|19011->9730|19041->9731|19091->9752|19160->9792|19190->9793|19236->9810|19270->9815|19300->9816|19350->9837|19468->9926|19498->9927|19544->9944|19677->10048|19707->10049|19757->10070|19832->10116|19862->10117|19908->10134|19942->10139|19972->10140|20022->10161|20109->10219|20139->10220|20185->10237|20261->10284|20291->10285|20335->10300|20385->10321|20415->10322|20461->10339|20819->10668|20849->10669|20892->10683|20956->10718|20986->10719|21032->10736|21211->10886|21241->10887|21291->10908|21358->10946|21388->10947|21418->10948|21452->10953|21482->10954|21532->10975|21632->11046|21662->11047|21708->11064|21816->11143|21846->11144|21896->11165|22018->11258|22048->11259|22078->11260|22112->11265|22142->11266|22192->11287|22291->11357|22321->11358|22363->11371|22393->11372|22428->11379|22479->137|22506->191|22535->11390|22565->11393|22600->11418|22641->11420|22675->11426|22716->11439|22732->11445|22794->11485|22889->11552|22905->11558|22969->11600|23050->11653|23066->11659|23141->11711|24514->13055|24531->13061|24591->13098|24768->13247|24781->13250|24809->13256|24930->13349|24943->13352|24978->13364|25039->13878|25093->13903|25364->14146|25377->14149|25409->14158|25906->14626|25920->14629|25959->14645|26496->15153|26510->15156|26542->15165|27081->15675|27095->15678|27138->15698|27232->15762|27263->15763|27298->15768|27329->15769|28055->16466|28069->16469|28111->16488|28178->16525|28209->16526|28244->16531|28275->16532|28309->16537|28323->16540|28365->16559|28989->17155|29002->17158|29036->17170|29605->17711|29618->17714|29650->17724|30227->18273|30240->18276|30284->18297|30897->18882|30910->18885|30955->18907|31570->19494|31583->19497|31619->19510|32178->20041|32191->20044|32227->20057|32614->21769|32669->21795|32888->21986|32901->21989|32930->21996|34543->23581|34568->23596|34609->23598|34683->23643|34970->23902|34986->23908|35073->23972|35572->24439|35628->24466|35968->24778|35984->24784|36041->24819|36396->25145|36426->25146|36526->25217|36556->25218|36586->25219|36630->25234|36660->25235|36708->25254|36738->25255|36788->25276|36834->25293|36864->25294|36918->25319|37027->25399|37057->25400|37115->25429|37234->25519|37264->25520|37314->25541|37344->25542|37374->25543|37408->25548|37438->25549|37492->25574|37585->25638|37615->25639|37661->25656|37691->25657|37762->25699|37792->25700|37850->25729|38040->25890|38070->25891|38114->25906|38144->25907|38177->25912
                  LINES: 35->1|38->2|39->3|40->4|42->6|42->6|44->6|45->7|46->8|46->8|47->9|48->10|48->10|49->11|49->11|49->11|50->12|51->13|51->13|52->14|52->14|52->14|53->15|54->16|54->16|55->17|55->17|55->17|56->18|57->19|57->19|58->20|59->21|59->21|59->21|60->22|60->22|60->22|67->29|67->29|68->30|70->32|70->32|71->33|71->33|71->33|72->34|72->34|72->34|73->35|73->35|73->35|74->36|75->37|75->37|75->37|75->37|75->37|76->38|76->38|76->38|76->38|76->38|78->40|78->40|78->40|78->40|78->40|78->40|78->40|78->40|78->40|78->40|81->43|81->43|81->43|81->43|81->43|81->43|81->43|81->43|81->43|81->43|82->44|82->44|82->44|82->44|82->44|82->44|82->44|82->44|82->44|82->44|83->45|83->45|83->45|83->45|83->45|83->45|83->45|83->45|83->45|83->45|84->46|84->46|84->46|84->46|84->46|85->47|85->47|85->47|85->47|85->47|88->50|88->50|91->53|91->53|94->56|94->56|95->57|95->57|95->57|96->58|97->59|97->59|97->59|97->59|98->60|99->61|99->61|100->62|100->62|106->68|106->68|107->69|108->70|108->70|109->71|109->71|109->71|110->72|111->73|111->73|112->74|114->76|114->76|115->77|115->77|115->77|116->78|122->84|122->84|123->85|125->87|125->87|129->91|129->91|130->92|130->92|130->92|131->93|132->94|132->94|133->95|133->95|133->95|134->96|135->97|135->97|136->98|141->103|141->103|142->104|145->107|145->107|146->108|149->111|149->111|150->112|152->114|152->114|153->115|153->115|155->117|155->117|157->119|157->119|158->120|159->121|159->121|159->121|160->122|160->122|160->122|160->122|161->123|162->124|164->126|164->126|166->128|167->129|167->129|168->130|176->138|176->138|177->139|182->144|182->144|183->145|184->146|184->146|185->147|186->148|186->148|187->149|188->150|188->150|191->153|191->153|191->153|191->153|192->154|194->156|194->156|195->157|196->158|196->158|197->159|199->161|199->161|200->162|200->162|202->164|202->164|204->166|204->166|205->167|207->169|207->169|208->170|208->170|208->170|209->171|209->171|209->171|210->172|215->177|215->177|216->178|217->179|217->179|218->180|218->180|218->180|218->180|218->180|222->184|222->184|223->185|223->185|223->185|223->185|230->192|230->192|231->193|234->196|234->196|235->197|235->197|236->198|237->199|237->199|238->200|238->200|239->201|239->201|243->205|243->205|247->209|247->209|248->210|249->211|249->211|251->213|259->221|259->221|261->223|261->223|261->223|262->224|262->224|262->224|263->225|264->226|264->226|265->227|265->227|265->227|266->228|268->230|268->230|269->231|270->232|270->232|271->233|272->234|272->234|273->235|273->235|273->235|274->236|275->237|275->237|276->238|278->240|278->240|281->243|281->243|281->243|282->244|287->249|287->249|289->251|289->251|289->251|290->252|292->254|292->254|293->255|294->256|294->256|294->256|294->256|294->256|295->257|296->258|296->258|297->259|298->260|298->260|299->261|301->263|301->263|301->263|301->263|301->263|302->264|303->265|303->265|304->266|304->266|307->269|309->1|310->5|311->270|313->272|313->272|313->272|315->274|315->274|315->274|315->274|317->276|317->276|317->276|318->277|318->277|318->277|340->299|340->299|340->299|342->301|342->301|342->301|343->302|343->302|343->302|344->306|345->307|349->311|349->311|349->311|357->319|357->319|357->319|366->328|366->328|366->328|375->337|375->337|375->337|375->337|375->337|375->337|375->337|384->346|384->346|384->346|384->346|384->346|384->346|384->346|384->346|384->346|384->346|393->355|393->355|393->355|403->365|403->365|403->365|412->374|412->374|412->374|421->383|421->383|421->383|431->393|431->393|431->393|438->400|438->400|438->400|444->426|446->428|449->431|449->431|449->431|473->455|473->455|473->455|474->456|477->459|477->459|477->459|484->466|487->469|491->473|491->473|491->473|503->485|503->485|505->487|505->487|505->487|505->487|505->487|505->487|505->487|506->488|506->488|506->488|507->489|508->490|508->490|509->491|510->492|510->492|511->493|511->493|511->493|511->493|511->493|512->494|513->495|513->495|514->496|514->496|515->497|515->497|516->498|518->500|518->500|519->501|519->501|520->502
                  -- GENERATED --
              */
          