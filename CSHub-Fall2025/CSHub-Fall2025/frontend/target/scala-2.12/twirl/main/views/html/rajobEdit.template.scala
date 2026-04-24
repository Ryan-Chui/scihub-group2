
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

object rajobEdit extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template7[RAJob,String,String,String,String,String,Boolean,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(rajob: RAJob, status: String, tableName: String, rajobFileType: String, tableRecorderId: String, backendPort: String, rajobDocument: Boolean):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._
/*3.2*/import models._
/*4.2*/import models.RAJob

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
                """),_display_(/*121.18*/if(rajob.getShortDescription!=null)/*121.53*/{_display_(Seq[Any](format.raw/*121.54*/("""
                """),format.raw/*122.17*/("""div.innerHTML = """"),_display_(/*122.35*/rajob/*122.40*/.getShortDescription),format.raw/*122.60*/("""";
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
                            """),format.raw/*185.29*/("""url: "/rajob/uploadImg/"""),_display_(/*185.53*/rajob/*185.58*/.getId),format.raw/*185.64*/("""/" + (countImagesInDescription-1) ,
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

            """),format.raw/*268.13*/("""function markAsPrivate() """),format.raw/*268.38*/("""{"""),format.raw/*268.39*/("""

            """),format.raw/*270.13*/("""}"""),format.raw/*270.14*/("""


    """),format.raw/*273.5*/("""</script>
""")))};
Seq[Any](format.raw/*1.144*/("""
"""),format.raw/*5.1*/("""
"""),format.raw/*274.2*/("""

"""),_display_(/*276.2*/main("RA Job Edit", scripts)/*276.30*/ {_display_(Seq[Any](format.raw/*276.32*/("""

    """),format.raw/*278.5*/("""<link href='"""),_display_(/*278.18*/routes/*278.24*/.Assets.at("stylesheets/quill.snow.css")),format.raw/*278.64*/("""'
    rel="stylesheet" />
    <script type="text/javascript" src='"""),_display_(/*280.42*/routes/*280.48*/.Assets.at("javascripts/plugins/quill.js")),format.raw/*280.90*/("""'></script>
    <script type="text/javascript" src='"""),_display_(/*281.42*/routes/*281.48*/.Assets.at("javascripts/field_validation_helper.js")),format.raw/*281.100*/("""'></script>

    <div class="container">
        <div class="row">
            <div class="col  s12 m10 offset-m1">
                <div class="card-panel">
                    <h4 class="center form-signin-heading" align="center">
                        Edit RA Job Information</h4>
                    <div id="warningModal" class="modal">
                        <div class="modal-content">
                            <h5 style="color: red">Warning!</h5>
                            <p style="font-weight: bold">Do you really want to change the publisher of this RA job?
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
                    <form class="form-signin" enctype="multipart/form-data" id="editTechnologyForm" method="post" onsubmit="return getHTML()" action=""""),_display_(/*303.152*/routes/*303.158*/.RAJobController.rajobEditPOST(rajob.getId)),format.raw/*303.201*/("""">
                        <div id="hiddenDiv" style="display: none;">
                            <input name="id" id="id" class="validate" value=""""),_display_(/*305.79*/rajob/*305.84*/.getId),format.raw/*305.90*/("""">
                            <input name="isActive" id="isActive" class="validate" value=""""),_display_(/*306.91*/rajob/*306.96*/.getIsActive),format.raw/*306.108*/("""">
                            """),format.raw/*310.126*/("""
                        """),format.raw/*311.25*/("""</div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="title" id="title" class="validate" value=""""),_display_(/*315.94*/rajob/*315.99*/.getTitle),format.raw/*315.108*/("""" required>
                                <label for="title">Title* </label>
                                <span id="titleMsg" class="helper-text" data-success="✓" data-error="Please input a title"></span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input type="text" name="goals" id="goals"  class="validate" required value=""""),_display_(/*322.111*/rajob/*322.116*/.getGoals),format.raw/*322.125*/("""">
                                <label for="goals">
                                    Goals* </label>
                                <span id="goalsMsg" class="helper-text" data-success="✓" data-error="Please input goals"></span>
                            </div>
                        </div>

                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="organization" id="organization" value=""""),_display_(/*332.91*/rajob/*332.96*/.getOrganization),format.raw/*332.112*/("""" class="validate" required>
                                <label for="organization">
                                    Department/Lab Name* </label>
                                <span id="organizationMsg" class="helper-text" data-success="✓" data-error="Please input the department/lab name"></span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="location" id="location" value=""""),_display_(/*341.83*/rajob/*341.88*/.getLocation),format.raw/*341.100*/("""" class="validate" required>
                                <label for="location">
                                    Location* </label>
                                <span id="locationMsg" class="helper-text" data-success="✓" data-error="Please input the location" style="color: red;"></span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="shortDescription" id="shortDescription" value = """"),_display_(/*350.101*/rajob/*350.106*/.getShortDescription),format.raw/*350.126*/("""" class="validate" required onchange="validateRegex(this.id, /."""),format.raw/*350.189*/("""{"""),format.raw/*350.190*/("""0,100"""),format.raw/*350.195*/("""}"""),format.raw/*350.196*/("""/)">
                                <label for="shortDescription">
                                    Short Description* </label>
                                <span id="shortDescriptionMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <textarea type="text" style="height: 200px;
                                    word-wtap: break-word; margin-top: 10px;" id="longDescription" placeholder="" name="longDescription" value=""""),_display_(/*359.146*/rajob/*359.151*/.getLongDescription),format.raw/*359.170*/("""" onchange="validateRegex(this.id, /."""),format.raw/*359.207*/("""{"""),format.raw/*359.208*/("""0,600"""),format.raw/*359.213*/("""}"""),format.raw/*359.214*/("""/)">"""),_display_(/*359.219*/rajob/*359.224*/.getLongDescription),format.raw/*359.243*/("""</textarea>
                                <label for="longDescription">Long Description</label>
                                <span id="longDescriptionMsg" class="helper-text" data-success="✓" data-error="The long description must be under 600 characters" style="color: red; font-size: 12px"></span>
                            </div>
                        </div>

                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="requiredExpertise" id="location" value = """"),_display_(/*368.94*/rajob/*368.99*/.getRequiredExpertise),format.raw/*368.120*/(""""  class="validate" required>
                                <label for="requiredExpertise">
                                    Required Expertise* </label>
                                <span id="requiredExpertiseMsg" class="helper-text" data-success="✓" data-error="Please enter some required expertise"></span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="preferredExpertise" id="location" value = """"),_display_(/*377.95*/rajob/*377.100*/.getPreferredExpertise),format.raw/*377.122*/(""""  class="validate" required>
                                <label for="preferredExpertise">
                                    Preferred Expertise* </label>
                                <span id="preferredExpertise" class="helper-text" data-success="✓" data-error="Please enter some preferred expertise"></span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="fields" id="fields" value = """"),_display_(/*386.81*/rajob/*386.86*/.getFields),format.raw/*386.96*/(""""  class="validate" required>
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

"""),format.raw/*411.42*/("""
"""),format.raw/*412.46*/("""
"""),format.raw/*413.69*/("""
"""),format.raw/*414.142*/("""
"""),format.raw/*415.79*/("""
"""),format.raw/*416.102*/("""
"""),format.raw/*417.39*/("""
"""),format.raw/*418.76*/("""

"""),format.raw/*420.69*/("""
"""),format.raw/*421.142*/("""
"""),format.raw/*422.79*/("""
"""),format.raw/*423.121*/("""
"""),format.raw/*424.39*/("""
"""),format.raw/*425.35*/("""

                        """),format.raw/*427.25*/("""<div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="url" id="url" value=""""),_display_(/*430.73*/rajob/*430.78*/.getUrl),format.raw/*430.85*/("""" class="validate" onchange="validateRegex(this.id, 'URL')">
                                <label for="url">
                                    RA Job URL </label>
                                <span id="urlMsg" class="helper-text" data-success="✓" data-error="Please input a valid URL"></span>
                            </div>
                        </div>
                        """),format.raw/*456.27*/("""

                        """),format.raw/*458.25*/("""<div class="row">
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
                                        """),_display_(/*474.42*/if(rajobDocument)/*474.59*/ {_display_(Seq[Any](format.raw/*474.61*/("""
                                            """),format.raw/*475.45*/("""<div class="row" style="margin-top: 10px;">
                                                <div class="col s12">
                                                    <a href="javascript:void(0);"
                                                    data-url=""""),_display_(/*478.64*/routes/*478.70*/.FileController.getFile(tableName, rajobFileType, tableRecorderId)),format.raw/*478.136*/(""""
                                                    class="blue-text text-darken-3"
                                                    onclick="openAndCheckNewTabUrl(this)">
                                                        Download Current RA Job Document
                                                    </a>
                                                </div>
                                            </div>
                                        """)))}),format.raw/*485.42*/("""



                        """),format.raw/*489.25*/("""<div class="actions row center">
                            <div class="input-field col s12">
                                <button type="submit" id="jobRegister" class="btn waves-effect waves-light blue darken-2">
                                    Update</button>
                                <a href=""""),_display_(/*493.43*/routes/*493.49*/.RAJobController.rajobDetail(rajob.getId)),format.raw/*493.90*/("""" class="btn waves-effect waves-light red darken-2">
                                    Cancel</a>

                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>

    <script>
            function openAndCheckNewTabUrl(link) """),format.raw/*505.50*/("""{"""),format.raw/*505.51*/("""const url = link.getAttribute('data-url');

                fetch(url, """),format.raw/*507.28*/("""{"""),format.raw/*507.29*/(""" """),format.raw/*507.30*/("""method: 'HEAD' """),format.raw/*507.45*/("""}"""),format.raw/*507.46*/(""").then(response => """),format.raw/*507.65*/("""{"""),format.raw/*507.66*/("""
                    """),format.raw/*508.21*/("""if (response.ok) """),format.raw/*508.38*/("""{"""),format.raw/*508.39*/("""
                        """),format.raw/*509.25*/("""const newTab = window.open(url, '_blank');
                        if (!newTab) """),format.raw/*510.38*/("""{"""),format.raw/*510.39*/("""
                            """),format.raw/*511.29*/("""alert("Please allow pop-ups in your browser to view this file.");
                        """),format.raw/*512.25*/("""}"""),format.raw/*512.26*/("""
                    """),format.raw/*513.21*/("""}"""),format.raw/*513.22*/(""" """),format.raw/*513.23*/("""else """),format.raw/*513.28*/("""{"""),format.raw/*513.29*/("""
                        """),format.raw/*514.25*/("""alert("The user did not upload this file");
                    """),format.raw/*515.21*/("""}"""),format.raw/*515.22*/("""
                """),format.raw/*516.17*/("""}"""),format.raw/*516.18*/(""")
                        .catch(error => """),format.raw/*517.41*/("""{"""),format.raw/*517.42*/("""
                            """),format.raw/*518.29*/("""console.error("Error checking the URL:", error);
                            alert("Failed to check the file. Please try again later.");
                        """),format.raw/*520.25*/("""}"""),format.raw/*520.26*/(""");
            """),format.raw/*521.13*/("""}"""),format.raw/*521.14*/("""
    """),format.raw/*522.5*/("""</script>

""")))}))
      }
    }
  }

  def render(rajob:RAJob,status:String,tableName:String,rajobFileType:String,tableRecorderId:String,backendPort:String,rajobDocument:Boolean): play.twirl.api.HtmlFormat.Appendable = apply(rajob,status,tableName,rajobFileType,tableRecorderId,backendPort,rajobDocument)

  def f:((RAJob,String,String,String,String,String,Boolean) => play.twirl.api.HtmlFormat.Appendable) = (rajob,status,tableName,rajobFileType,tableRecorderId,backendPort,rajobDocument) => apply(rajob,status,tableName,rajobFileType,tableRecorderId,backendPort,rajobDocument)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:35 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/rajobEdit.scala.html
                  HASH: f9d0c5a662bb57f6e204049cee22f999dcdace97
                  MATRIX: 1157->1|1372->145|1395->162|1418->179|1450->201|1464->208|1544->212|1575->217|1625->240|1653->241|1697->258|1758->291|1787->292|1828->305|1859->308|1888->309|1933->326|1993->358|2022->359|2063->372|2108->389|2137->390|2182->407|2240->437|2269->438|2310->451|2346->459|2375->460|2420->477|2475->504|2504->505|2536->510|2613->560|2628->566|2699->616|2779->669|2794->675|2868->727|3080->911|3109->912|3154->929|3280->1027|3309->1028|3350->1041|3408->1071|3437->1072|3482->1089|3539->1118|3568->1119|3617->1140|3654->1149|3683->1150|3736->1175|3804->1215|3833->1216|3862->1217|3901->1228|3930->1229|3990->1261|4019->1262|4048->1263|4118->1305|4147->1306|4324->1455|4353->1456|4382->1457|4422->1469|4451->1470|4481->1472|4510->1473|4539->1474|4584->1491|4613->1492|4764->1615|4793->1616|4822->1617|4867->1634|4896->1635|4926->1637|4955->1638|4984->1639|5029->1656|5058->1657|5118->1689|5147->1690|5176->1691|5219->1706|5248->1707|5278->1709|5307->1710|5336->1711|5382->1729|5411->1730|5501->1792|5530->1793|5559->1794|5601->1808|5630->1809|5660->1811|5689->1812|5718->1813|5761->1828|5790->1829|5877->1888|5906->1889|5935->1890|5982->1909|6011->1910|6112->1983|6141->1984|6170->1985|6210->1997|6239->1998|6362->2093|6391->2094|6536->2211|6565->2212|6720->2339|6749->2340|6798->2361|6859->2394|6888->2395|6941->2420|7100->2551|7129->2552|7161->2556|7190->2557|7243->2582|7349->2660|7378->2661|7423->2678|7452->2679|7735->2934|7764->2935|7813->2956|7886->3001|7915->3002|7960->3019|8022->3053|8051->3054|8100->3075|8232->3179|8261->3180|8314->3205|8516->3379|8545->3380|8594->3401|8627->3406|8656->3407|8709->3432|9228->3923|9257->3924|9306->3945|9381->3992|9410->3993|9546->4101|9575->4102|9624->4123|9717->4188|9746->4189|9799->4214|9911->4298|9940->4299|9989->4320|10077->4380|10106->4381|10159->4406|10266->4485|10295->4486|10344->4507|10788->4922|10818->4923|10872->4948|11045->5092|11075->5093|11125->5114|11343->5303|11373->5304|11427->5329|11503->5376|11533->5377|11580->5395|11610->5396|11736->5493|11766->5494|11836->5535|11866->5536|11912->5553|11996->5609|12041->5644|12081->5645|12127->5662|12173->5680|12188->5685|12230->5705|12282->5725|12328->5742|12437->5822|12467->5823|12510->5837|12593->5891|12623->5892|12669->5909|13168->6379|13198->6380|13248->6401|13565->6689|13595->6690|13641->6707|13708->6745|13738->6746|13788->6767|13871->6821|13901->6822|13955->6847|14039->6902|14069->6903|14182->6987|14212->6988|14264->7011|14294->7012|14344->7033|14480->7140|14510->7141|14564->7166|14700->7273|14730->7274|14788->7303|14913->7399|14943->7400|14993->7421|15023->7422|15070->7440|15100->7441|15201->7513|15231->7514|15281->7535|15421->7646|15451->7647|15497->7664|15568->7706|15598->7707|15648->7728|15711->7762|15741->7763|15795->7788|16171->8135|16201->8136|16259->8165|16343->8220|16373->8221|16427->8246|16490->8280|16520->8281|16559->8291|16589->8292|16800->8474|16830->8475|16888->8504|16940->8528|16955->8533|16983->8539|17365->8892|17395->8893|17457->8926|17652->9092|17682->9093|17763->9145|17793->9146|17855->9179|17938->9233|17968->9234|18022->9259|18052->9260|18104->9283|18134->9284|18183->9304|18213->9305|18313->9376|18343->9377|18393->9398|18452->9428|18482->9429|18529->9447|18759->9648|18789->9649|18832->9663|18890->9692|18920->9693|18966->9710|19031->9746|19061->9747|19111->9768|19180->9808|19210->9809|19256->9826|19290->9831|19320->9832|19370->9853|19488->9942|19518->9943|19564->9960|19697->10064|19727->10065|19777->10086|19852->10132|19882->10133|19928->10150|19962->10155|19992->10156|20042->10177|20129->10235|20159->10236|20205->10253|20281->10300|20311->10301|20355->10316|20405->10337|20435->10338|20481->10355|20839->10684|20869->10685|20912->10699|20976->10734|21006->10735|21052->10752|21231->10902|21261->10903|21311->10924|21378->10962|21408->10963|21438->10964|21472->10969|21502->10970|21552->10991|21652->11062|21682->11063|21728->11080|21836->11159|21866->11160|21916->11181|22038->11274|22068->11275|22098->11276|22132->11281|22162->11282|22212->11303|22311->11373|22341->11374|22383->11387|22413->11388|22456->11402|22510->11427|22540->11428|22583->11442|22613->11443|22648->11450|22699->143|22726->199|22755->11461|22785->11464|22823->11492|22864->11494|22898->11500|22939->11513|22955->11519|23017->11559|23112->11626|23128->11632|23192->11674|23273->11727|23289->11733|23364->11785|24743->13135|24760->13141|24826->13184|25003->13333|25018->13338|25046->13344|25167->13437|25182->13442|25217->13454|25278->13968|25332->13993|25603->14236|25618->14241|25650->14250|26169->14740|26185->14745|26217->14754|26781->15290|26796->15295|26835->15311|27462->15910|27477->15915|27512->15927|28148->16534|28164->16539|28207->16559|28300->16622|28331->16623|28366->16628|28397->16629|29054->17257|29070->17262|29112->17281|29179->17318|29210->17319|29245->17324|29276->17325|29310->17330|29326->17335|29368->17354|30003->17961|30018->17966|30062->17987|30711->18608|30727->18613|30772->18635|31408->19243|31423->19248|31455->19258|32842->20657|32872->20703|32902->20772|32933->20914|32963->20993|32994->21095|33024->21134|33054->21210|33085->21280|33116->21422|33146->21501|33177->21622|33207->21661|33237->21696|33292->21722|33511->21913|33526->21918|33555->21925|33974->23684|34029->23710|35269->24922|35296->24939|35337->24941|35411->24986|35698->25245|35714->25251|35803->25317|36305->25787|36362->25815|36702->26127|36718->26133|36781->26174|37136->26500|37166->26501|37266->26572|37296->26573|37326->26574|37370->26589|37400->26590|37448->26609|37478->26610|37528->26631|37574->26648|37604->26649|37658->26674|37767->26754|37797->26755|37855->26784|37974->26874|38004->26875|38054->26896|38084->26897|38114->26898|38148->26903|38178->26904|38232->26929|38325->26993|38355->26994|38401->27011|38431->27012|38502->27054|38532->27055|38590->27084|38780->27245|38810->27246|38854->27261|38884->27262|38917->27267
                  LINES: 35->1|38->2|39->3|40->4|42->6|42->6|44->6|45->7|46->8|46->8|47->9|48->10|48->10|49->11|49->11|49->11|50->12|51->13|51->13|52->14|52->14|52->14|53->15|54->16|54->16|55->17|55->17|55->17|56->18|57->19|57->19|58->20|59->21|59->21|59->21|60->22|60->22|60->22|67->29|67->29|68->30|70->32|70->32|71->33|71->33|71->33|72->34|72->34|72->34|73->35|73->35|73->35|74->36|75->37|75->37|75->37|75->37|75->37|76->38|76->38|76->38|76->38|76->38|78->40|78->40|78->40|78->40|78->40|78->40|78->40|78->40|78->40|78->40|81->43|81->43|81->43|81->43|81->43|81->43|81->43|81->43|81->43|81->43|82->44|82->44|82->44|82->44|82->44|82->44|82->44|82->44|82->44|82->44|83->45|83->45|83->45|83->45|83->45|83->45|83->45|83->45|83->45|83->45|84->46|84->46|84->46|84->46|84->46|85->47|85->47|85->47|85->47|85->47|88->50|88->50|91->53|91->53|94->56|94->56|95->57|95->57|95->57|96->58|97->59|97->59|97->59|97->59|98->60|99->61|99->61|100->62|100->62|106->68|106->68|107->69|108->70|108->70|109->71|109->71|109->71|110->72|111->73|111->73|112->74|114->76|114->76|115->77|115->77|115->77|116->78|122->84|122->84|123->85|125->87|125->87|129->91|129->91|130->92|130->92|130->92|131->93|132->94|132->94|133->95|133->95|133->95|134->96|135->97|135->97|136->98|141->103|141->103|142->104|145->107|145->107|146->108|149->111|149->111|150->112|152->114|152->114|153->115|153->115|155->117|155->117|157->119|157->119|158->120|159->121|159->121|159->121|160->122|160->122|160->122|160->122|161->123|162->124|164->126|164->126|166->128|167->129|167->129|168->130|176->138|176->138|177->139|182->144|182->144|183->145|184->146|184->146|185->147|186->148|186->148|187->149|188->150|188->150|191->153|191->153|191->153|191->153|192->154|194->156|194->156|195->157|196->158|196->158|197->159|199->161|199->161|200->162|200->162|202->164|202->164|204->166|204->166|205->167|207->169|207->169|208->170|208->170|208->170|209->171|209->171|209->171|210->172|215->177|215->177|216->178|217->179|217->179|218->180|218->180|218->180|218->180|218->180|222->184|222->184|223->185|223->185|223->185|223->185|230->192|230->192|231->193|234->196|234->196|235->197|235->197|236->198|237->199|237->199|238->200|238->200|239->201|239->201|243->205|243->205|247->209|247->209|248->210|249->211|249->211|251->213|259->221|259->221|261->223|261->223|261->223|262->224|262->224|262->224|263->225|264->226|264->226|265->227|265->227|265->227|266->228|268->230|268->230|269->231|270->232|270->232|271->233|272->234|272->234|273->235|273->235|273->235|274->236|275->237|275->237|276->238|278->240|278->240|281->243|281->243|281->243|282->244|287->249|287->249|289->251|289->251|289->251|290->252|292->254|292->254|293->255|294->256|294->256|294->256|294->256|294->256|295->257|296->258|296->258|297->259|298->260|298->260|299->261|301->263|301->263|301->263|301->263|301->263|302->264|303->265|303->265|304->266|304->266|306->268|306->268|306->268|308->270|308->270|311->273|313->1|314->5|315->274|317->276|317->276|317->276|319->278|319->278|319->278|319->278|321->280|321->280|321->280|322->281|322->281|322->281|344->303|344->303|344->303|346->305|346->305|346->305|347->306|347->306|347->306|348->310|349->311|353->315|353->315|353->315|360->322|360->322|360->322|370->332|370->332|370->332|379->341|379->341|379->341|388->350|388->350|388->350|388->350|388->350|388->350|388->350|397->359|397->359|397->359|397->359|397->359|397->359|397->359|397->359|397->359|397->359|406->368|406->368|406->368|415->377|415->377|415->377|424->386|424->386|424->386|449->411|450->412|451->413|452->414|453->415|454->416|455->417|456->418|458->420|459->421|460->422|461->423|462->424|463->425|465->427|468->430|468->430|468->430|474->456|476->458|492->474|492->474|492->474|493->475|496->478|496->478|496->478|503->485|507->489|511->493|511->493|511->493|523->505|523->505|525->507|525->507|525->507|525->507|525->507|525->507|525->507|526->508|526->508|526->508|527->509|528->510|528->510|529->511|530->512|530->512|531->513|531->513|531->513|531->513|531->513|532->514|533->515|533->515|534->516|534->516|535->517|535->517|536->518|538->520|538->520|539->521|539->521|540->522
                  -- GENERATED --
              */
          