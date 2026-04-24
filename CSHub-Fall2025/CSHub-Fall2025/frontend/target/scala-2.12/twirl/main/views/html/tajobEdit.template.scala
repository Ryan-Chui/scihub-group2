
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

object tajobEdit extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[TAJob,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(tajob: TAJob):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._
/*3.2*/import models._
/*4.2*/import models.TAJob

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
                        """),format.raw/*58.25*/("""document.getElementById("descriptionMsg").innerHTML = "Field should be no longer than "+ limit +" chatacters";
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
                        """),format.raw/*74.25*/("""$("#btnName").attr("style", "ttansform:rotate(-45deg);ttansition:ttansform 0.3s linear;");
                        $("#buttonText").text("Close Window");
                    """),format.raw/*76.21*/("""}"""),format.raw/*76.22*/("""
                    """),format.raw/*77.21*/("""else """),format.raw/*77.26*/("""{"""),format.raw/*77.27*/("""
                        """),format.raw/*78.25*/("""$("#btnName").attr("style", "ttansform:rotate(0deg);ttansition:ttansform 0.3s linear;");
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
                """),_display_(/*121.18*/if(tajob.getShortDescription!=null)/*121.53*/{_display_(Seq[Any](format.raw/*121.54*/("""
                """),format.raw/*122.17*/("""div.innerHTML = """"),_display_(/*122.35*/tajob/*122.40*/.getShortDescription),format.raw/*122.60*/("""";
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
                                bstr = atob(arr[1]), n = bstr.length, u8arr = new Uint8Artay(n);
                        while (n--) """),format.raw/*177.37*/("""{"""),format.raw/*177.38*/("""
                            """),format.raw/*178.29*/("""u8arr[n] = bstr.charCodeAt(n);
                        """),format.raw/*179.25*/("""}"""),format.raw/*179.26*/("""
                        """),format.raw/*180.25*/("""var f = new File([u8arr], "file", """),format.raw/*180.59*/("""{"""),format.raw/*180.60*/("""type: mime"""),format.raw/*180.70*/("""}"""),format.raw/*180.71*/(""");
                        var fd = new FormData();
                        fd.append('file', f);
                        countImagesInDescription ++;
                        $.ajax("""),format.raw/*184.32*/("""{"""),format.raw/*184.33*/("""
                            """),format.raw/*185.29*/("""url: "/tajob/uploadImg/"""),_display_(/*185.53*/tajob/*185.58*/.getId),format.raw/*185.64*/("""/" + (countImagesInDescription-1) ,
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

            """),format.raw/*251.13*/("""function markAsPrivate() """),format.raw/*251.38*/("""{"""),format.raw/*251.39*/("""

            """),format.raw/*253.13*/("""}"""),format.raw/*253.14*/("""


    """),format.raw/*256.5*/("""</script>
""")))};
Seq[Any](format.raw/*1.16*/("""
"""),format.raw/*5.1*/("""
"""),format.raw/*257.2*/("""

"""),_display_(/*259.2*/main("TA Job Edit", scripts)/*259.30*/ {_display_(Seq[Any](format.raw/*259.32*/("""

    """),format.raw/*261.5*/("""<link href='"""),_display_(/*261.18*/routes/*261.24*/.Assets.at("stylesheets/quill.snow.css")),format.raw/*261.64*/("""'
    rel="stylesheet" />
    <script type="text/javascript" src='"""),_display_(/*263.42*/routes/*263.48*/.Assets.at("javascripts/plugins/quill.js")),format.raw/*263.90*/("""'></script>
    <script type="text/javascript" src='"""),_display_(/*264.42*/routes/*264.48*/.Assets.at("javascripts/field_validation_helper.js")),format.raw/*264.100*/("""'></script>

    <div class="container">
        <div class="row">
            <div class="col  s12 m10 offset-m1">
                <div class="card-panel">
                    <h4 class="center form-signin-heading" align="center">
                        Edit TA Job Information</h4>
                    <div id="warningModal" class="modal">
                        <div class="modal-content">
                            <h5 style="color: red">Warning!</h5>
                            <p style="font-weight: bold">Do you really want to change the publisher of this TA job?
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
                    <form class="form-signin" enctype="multipart/form-data" id="editTechnologyForm" method="post" onsubmit="return getHTML()" action=""""),_display_(/*286.152*/routes/*286.158*/.TAJobController.tajobEditPOST(tajob.getId)),format.raw/*286.201*/("""">
                        <div id="hiddenDiv" style="display: none;">
                            <input name="id" id="id" class="validate" value=""""),_display_(/*288.79*/tajob/*288.84*/.getId),format.raw/*288.90*/("""">
                            <input name="isActive" id="isActive" class="validate" value=""""),_display_(/*289.91*/tajob/*289.96*/.getIsActive),format.raw/*289.108*/("""">
                            """),format.raw/*293.126*/("""
                        """),format.raw/*294.25*/("""</div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="title" id="title" class="validate" value=""""),_display_(/*298.94*/tajob/*298.99*/.getTitle),format.raw/*298.108*/("""" required>
                                <label for="title">Title* </label>
                                <span id="titleMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>

                        <div class="row">
                            <div class="input-field col s12">
                                <input type="text" name="goals" id="goals"  class="validate" required value=""""),_display_(/*306.111*/tajob/*306.116*/.getGoals),format.raw/*306.125*/("""">
                                <label for="goals">
                                    Goals* </label>
                                <span id="goalsMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>

                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="organization" id="organization" value=""""),_display_(/*316.91*/tajob/*316.96*/.getOrganization),format.raw/*316.112*/("""" class="validate" required>
                                <label for="organization">
                                    Department/Lab Name* </label>
                                <span id="organizationMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>


                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="shortDescription" id="shortDescription" value = """"),_display_(/*327.101*/tajob/*327.106*/.getShortDescription),format.raw/*327.126*/(""""  class="validate" required onchange="validateRegex(this.id, /."""),format.raw/*327.190*/("""{"""),format.raw/*327.191*/(""",100"""),format.raw/*327.195*/("""}"""),format.raw/*327.196*/("""/)">
                                <label for="shortDescription">
                                    Short Description* </label>
                                <span id="shortDescriptionMsg" class="helper-text" data-success="✓" data-error="The short description must be under 100 characters"></span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <textarea type="text" style="height: 200px;
                                    word-wtap: break-word; margin-top: 10px;" id="longDescription" placeholder="" name="longDescription" value=""""),_display_(/*336.146*/tajob/*336.151*/.getLongDescription),format.raw/*336.170*/("""" onchange="validateRegex(this.id, /."""),format.raw/*336.207*/("""{"""),format.raw/*336.208*/(""",600"""),format.raw/*336.212*/("""}"""),format.raw/*336.213*/("""/)">"""),_display_(/*336.218*/tajob/*336.223*/.getLongDescription),format.raw/*336.242*/("""</textarea>
                                <label for="longDescription">Long Description</label>
                                <span id="longDescriptionMsg" class="helper-text" data-success="✓" data-error="The long description must be under 600 characters" style="color: red; font-size: 12px"></span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="location" id="location" value=""""),_display_(/*344.83*/tajob/*344.88*/.getLocation),format.raw/*344.100*/("""" class="validate" required>
                                <label for="location">
                                    Location* </label>
                                <span id="locationMsg" class="helper-text" data-success="✓" data-error=""></span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="fields" id="fields" value=""""),_display_(/*353.79*/tajob/*353.84*/.getFields),format.raw/*353.94*/("""" class="validate" required>
                                <label for="fields">
                                    Fields* </label>
                                <span id="fieldsMsg" class="helper-text" data-success="✓" data-error=""></span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="requiredExpertise" id="location" value = """"),_display_(/*362.94*/tajob/*362.99*/.getRequiredExpertise),format.raw/*362.120*/(""""  class="validate" required>
                                <label for="requiredExpertise">
                                    Required Expertise* </label>
                                <span id="requiredExpertiseMsg" class="helper-text" data-success="✓" data-error=""></span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="preferredExpertise" id="location" value = """"),_display_(/*371.95*/tajob/*371.100*/.getPreferredExpertise),format.raw/*371.122*/(""""  class="validate" required>
                                <label for="preferredExpertise">
                                    Preferred Expertise* </label>
                                <span id="preferredExpertiseMsg" class="helper-text" data-success="✓" data-error=""></span>
                            </div>
                        </div>

                        <div class="row">
                            <div class="input-field col s12">
                                <input type="number" name="workTime" id="workTime" min="0" max="20" value=""""),_display_(/*380.109*/tajob/*380.114*/.getWorkTime),format.raw/*380.126*/("""" class="validate" required>
                                <label for="fields">
                                    TA Hours/Week* </label>
                                <span id="workTimeMsg" class="helper-text" data-success="✓"  data-error="Please input a positive number and less than or equal to 20 hours"></span>
                            </div>
                        </div>


                        <div class="row">
                            <fieldset>
                                <legend>TA Type</legend>
                                <div class="col s12 m6">
                                    <label>
                                        <input type="radio" name="taTypes" id="taType1" value="1" checked>
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
                            <div class="input-field col s12">
                                <input
                                type="text" name="url" id="url" value=""""),_display_(/*411.73*/tajob/*411.78*/.getUrl),format.raw/*411.85*/("""" class="validate" onchange="validateRegex(this.id, 'URL')">
                                <label for="url">
                                    TA Job URL </label>
                                <span id="urlMsg" class="helper-text" data-success="✓" data-error="Please input a valid URL"></span>
                            </div>
                        </div>

                        <div class="row">
                            <div class="file-field input-field col s12" >
                                <div class="btn waves-effect waves-light blue darken-2" >
                                    <span >Change TA Job PDF</span>
                                    <input type="file" accept=".pdf" id="pdf" name="pdf">
                                </div>
                                <div class="file-path-wtapper">
                                    <input class="file-path validate" type="text">
                                </div>
                                <div id="pdfPreviewMsg" style="color:blue"></div>
                                """),_display_(/*428.34*/if(tajob.getPdf != null && tajob.getPdf != "")/*428.80*/ {_display_(Seq[Any](format.raw/*428.82*/("""
                                    """),format.raw/*429.37*/("""<a id="pdfDownload" href=""""),_display_(/*429.64*/tajob/*429.69*/.getPdf),format.raw/*429.76*/("""">
                                        Download Current Current TA Job PDF</a>
                                    <a id = "pdfDeleteBtn" class="right" href="#" style="color: red;" onclick="deletePDF()">
                                        <i class="material-icons">cross</i> Delete Current TA Job PDF</a>
                                """)))}),format.raw/*433.34*/("""
                                """),format.raw/*434.33*/("""<input id="pdfRecord" name = "pdfRecord" style="display: none;"/>
                            </div>
                        </div>

                        <div class="actions row center">
                            <div class="input-field col s12">
                                <button type="submit" id="jobRegister" class="btn waves-effect waves-light blue darken-2">
                                    Update</button>
                                <a href=""""),_display_(/*442.43*/routes/*442.49*/.TAJobController.tajobDetail(tajob.getId)),format.raw/*442.90*/("""" class="btn waves-effect waves-light red darken-2">
                                    Cancel</a>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>

""")))}))
      }
    }
  }

  def render(tajob:TAJob): play.twirl.api.HtmlFormat.Appendable = apply(tajob)

  def f:((TAJob) => play.twirl.api.HtmlFormat.Appendable) = (tajob) => apply(tajob)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:38 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/tajobEdit.scala.html
                  HASH: 5613003ad230f161d1afecdc8c9dd71b909e3c84
                  MATRIX: 1114->1|1201->17|1224->34|1247->51|1279->73|1293->80|1373->84|1404->89|1454->112|1482->113|1526->130|1587->163|1616->164|1657->177|1688->180|1717->181|1762->198|1822->230|1851->231|1892->244|1937->261|1966->262|2011->279|2069->309|2098->310|2139->323|2175->331|2204->332|2249->349|2304->376|2333->377|2365->382|2442->432|2457->438|2528->488|2608->541|2623->547|2697->599|2909->783|2938->784|2983->801|3109->899|3138->900|3179->913|3237->943|3266->944|3311->961|3368->990|3397->991|3446->1012|3483->1021|3512->1022|3565->1047|3633->1087|3662->1088|3691->1089|3730->1100|3759->1101|3819->1133|3848->1134|3877->1135|3947->1177|3976->1178|4153->1327|4182->1328|4211->1329|4251->1341|4280->1342|4310->1344|4339->1345|4368->1346|4413->1363|4442->1364|4593->1487|4622->1488|4651->1489|4696->1506|4725->1507|4755->1509|4784->1510|4813->1511|4858->1528|4887->1529|4947->1561|4976->1562|5005->1563|5048->1578|5077->1579|5107->1581|5136->1582|5165->1583|5211->1601|5240->1602|5330->1664|5359->1665|5388->1666|5430->1680|5459->1681|5489->1683|5518->1684|5547->1685|5590->1700|5619->1701|5706->1760|5735->1761|5764->1762|5811->1781|5840->1782|5941->1855|5970->1856|5999->1857|6039->1869|6068->1870|6191->1965|6220->1966|6365->2083|6394->2084|6549->2211|6578->2212|6627->2233|6688->2266|6717->2267|6770->2292|6929->2423|6958->2424|6990->2428|7019->2429|7072->2454|7178->2532|7207->2533|7252->2550|7281->2551|7564->2806|7593->2807|7642->2828|7715->2873|7744->2874|7789->2891|7851->2925|7880->2926|7929->2947|8061->3051|8090->3052|8143->3077|8345->3251|8374->3252|8423->3273|8456->3278|8485->3279|8538->3304|9057->3795|9086->3796|9135->3817|9210->3864|9239->3865|9375->3973|9404->3974|9453->3995|9546->4060|9575->4061|9628->4086|9740->4170|9769->4171|9818->4192|9906->4252|9935->4253|9988->4278|10095->4357|10124->4358|10173->4379|10617->4794|10647->4795|10701->4820|10874->4964|10904->4965|10954->4986|11172->5175|11202->5176|11256->5201|11332->5248|11362->5249|11409->5267|11439->5268|11565->5365|11595->5366|11665->5407|11695->5408|11741->5425|11825->5481|11870->5516|11910->5517|11956->5534|12002->5552|12017->5557|12059->5577|12111->5597|12157->5614|12266->5694|12296->5695|12339->5709|12422->5763|12452->5764|12498->5781|12997->6251|13027->6252|13077->6273|13394->6561|13424->6562|13470->6579|13537->6617|13567->6618|13617->6639|13700->6693|13730->6694|13784->6719|13868->6774|13898->6775|14011->6859|14041->6860|14093->6883|14123->6884|14173->6905|14309->7012|14339->7013|14393->7038|14529->7145|14559->7146|14617->7175|14742->7271|14772->7272|14822->7293|14852->7294|14899->7312|14929->7313|15030->7385|15060->7386|15110->7407|15250->7518|15280->7519|15326->7536|15397->7578|15427->7579|15477->7600|15540->7634|15570->7635|15624->7660|16000->8007|16030->8008|16088->8037|16172->8092|16202->8093|16256->8118|16319->8152|16349->8153|16388->8163|16418->8164|16629->8346|16659->8347|16717->8376|16769->8400|16784->8405|16812->8411|17194->8764|17224->8765|17286->8798|17481->8964|17511->8965|17592->9017|17622->9018|17684->9051|17767->9105|17797->9106|17851->9131|17881->9132|17933->9155|17963->9156|18012->9176|18042->9177|18142->9248|18172->9249|18222->9270|18281->9300|18311->9301|18358->9319|18588->9520|18618->9521|18661->9535|18719->9564|18749->9565|18795->9582|18860->9618|18890->9619|18940->9640|19009->9680|19039->9681|19085->9698|19119->9703|19149->9704|19199->9725|19317->9814|19347->9815|19393->9832|19526->9936|19556->9937|19606->9958|19681->10004|19711->10005|19757->10022|19791->10027|19821->10028|19871->10049|19958->10107|19988->10108|20034->10125|20110->10172|20140->10173|20184->10188|20234->10209|20264->10210|20310->10227|20668->10556|20698->10557|20741->10571|20795->10596|20825->10597|20868->10611|20898->10612|20933->10619|20983->15|21010->71|21039->10630|21069->10633|21107->10661|21148->10663|21182->10669|21223->10682|21239->10688|21301->10728|21396->10795|21412->10801|21476->10843|21557->10896|21573->10902|21648->10954|23027->12304|23044->12310|23110->12353|23287->12502|23302->12507|23330->12513|23451->12606|23466->12611|23501->12623|23562->13137|23616->13162|23887->13405|23902->13410|23934->13419|24417->13873|24433->13878|24465->13887|24994->14388|25009->14393|25048->14409|25643->14975|25659->14980|25702->15000|25796->15064|25827->15065|25861->15069|25892->15070|26616->15765|26632->15770|26674->15789|26741->15826|26772->15827|26806->15831|26837->15832|26871->15837|26887->15842|26929->15861|27552->16456|27567->16461|27602->16473|28170->17013|28185->17018|28217->17028|28794->17577|28809->17582|28853->17603|29466->18188|29482->18193|29527->18215|30120->18779|30136->18784|30171->18796|31752->20349|31767->20354|31796->20361|32895->21432|32951->21478|32992->21480|33058->21517|33113->21544|33128->21549|33157->21556|33536->21903|33598->21936|34095->22405|34111->22411|34174->22452
                  LINES: 35->1|38->2|39->3|40->4|42->6|42->6|44->6|45->7|46->8|46->8|47->9|48->10|48->10|49->11|49->11|49->11|50->12|51->13|51->13|52->14|52->14|52->14|53->15|54->16|54->16|55->17|55->17|55->17|56->18|57->19|57->19|58->20|59->21|59->21|59->21|60->22|60->22|60->22|67->29|67->29|68->30|70->32|70->32|71->33|71->33|71->33|72->34|72->34|72->34|73->35|73->35|73->35|74->36|75->37|75->37|75->37|75->37|75->37|76->38|76->38|76->38|76->38|76->38|78->40|78->40|78->40|78->40|78->40|78->40|78->40|78->40|78->40|78->40|81->43|81->43|81->43|81->43|81->43|81->43|81->43|81->43|81->43|81->43|82->44|82->44|82->44|82->44|82->44|82->44|82->44|82->44|82->44|82->44|83->45|83->45|83->45|83->45|83->45|83->45|83->45|83->45|83->45|83->45|84->46|84->46|84->46|84->46|84->46|85->47|85->47|85->47|85->47|85->47|88->50|88->50|91->53|91->53|94->56|94->56|95->57|95->57|95->57|96->58|97->59|97->59|97->59|97->59|98->60|99->61|99->61|100->62|100->62|106->68|106->68|107->69|108->70|108->70|109->71|109->71|109->71|110->72|111->73|111->73|112->74|114->76|114->76|115->77|115->77|115->77|116->78|122->84|122->84|123->85|125->87|125->87|129->91|129->91|130->92|130->92|130->92|131->93|132->94|132->94|133->95|133->95|133->95|134->96|135->97|135->97|136->98|141->103|141->103|142->104|145->107|145->107|146->108|149->111|149->111|150->112|152->114|152->114|153->115|153->115|155->117|155->117|157->119|157->119|158->120|159->121|159->121|159->121|160->122|160->122|160->122|160->122|161->123|162->124|164->126|164->126|166->128|167->129|167->129|168->130|176->138|176->138|177->139|182->144|182->144|183->145|184->146|184->146|185->147|186->148|186->148|187->149|188->150|188->150|191->153|191->153|191->153|191->153|192->154|194->156|194->156|195->157|196->158|196->158|197->159|199->161|199->161|200->162|200->162|202->164|202->164|204->166|204->166|205->167|207->169|207->169|208->170|208->170|208->170|209->171|209->171|209->171|210->172|215->177|215->177|216->178|217->179|217->179|218->180|218->180|218->180|218->180|218->180|222->184|222->184|223->185|223->185|223->185|223->185|230->192|230->192|231->193|234->196|234->196|235->197|235->197|236->198|237->199|237->199|238->200|238->200|239->201|239->201|243->205|243->205|247->209|247->209|248->210|249->211|249->211|251->213|259->221|259->221|261->223|261->223|261->223|262->224|262->224|262->224|263->225|264->226|264->226|265->227|265->227|265->227|266->228|268->230|268->230|269->231|270->232|270->232|271->233|272->234|272->234|273->235|273->235|273->235|274->236|275->237|275->237|276->238|278->240|278->240|281->243|281->243|281->243|282->244|287->249|287->249|289->251|289->251|289->251|291->253|291->253|294->256|296->1|297->5|298->257|300->259|300->259|300->259|302->261|302->261|302->261|302->261|304->263|304->263|304->263|305->264|305->264|305->264|327->286|327->286|327->286|329->288|329->288|329->288|330->289|330->289|330->289|331->293|332->294|336->298|336->298|336->298|344->306|344->306|344->306|354->316|354->316|354->316|365->327|365->327|365->327|365->327|365->327|365->327|365->327|374->336|374->336|374->336|374->336|374->336|374->336|374->336|374->336|374->336|374->336|382->344|382->344|382->344|391->353|391->353|391->353|400->362|400->362|400->362|409->371|409->371|409->371|418->380|418->380|418->380|449->411|449->411|449->411|466->428|466->428|466->428|467->429|467->429|467->429|467->429|471->433|472->434|480->442|480->442|480->442
                  -- GENERATED --
              */
          