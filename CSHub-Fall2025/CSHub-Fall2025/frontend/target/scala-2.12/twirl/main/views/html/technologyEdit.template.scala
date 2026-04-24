
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

object technologyEdit extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Technology,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(technology: Technology):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._
/*3.2*/import models._
/*4.2*/import models.Technology

def /*6.2*/scripts/*6.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.13*/("""
"""),format.raw/*7.1*/("""<style>
    tr """),format.raw/*8.8*/("""{"""),format.raw/*8.9*/("""
        """),format.raw/*9.9*/("""border-bottom: none;
    """),format.raw/*10.5*/("""}"""),format.raw/*10.6*/("""
    """),format.raw/*11.5*/("""td """),format.raw/*11.8*/("""{"""),format.raw/*11.9*/("""
        """),format.raw/*12.9*/("""text-align: center;
    """),format.raw/*13.5*/("""}"""),format.raw/*13.6*/("""
    """),format.raw/*14.5*/(""".ql-editor strong"""),format.raw/*14.22*/("""{"""),format.raw/*14.23*/("""
        """),format.raw/*15.9*/("""font-weight:bold;
    """),format.raw/*16.5*/("""}"""),format.raw/*16.6*/("""
    """),format.raw/*17.5*/("""#editor """),format.raw/*17.13*/("""{"""),format.raw/*17.14*/("""
        """),format.raw/*18.9*/("""height: 375px;
    """),format.raw/*19.5*/("""}"""),format.raw/*19.6*/("""
"""),format.raw/*20.1*/("""</style>
<script type="text/javascript" src='"""),_display_(/*21.38*/routes/*21.44*/.Assets.at("javascripts/database_field_length.js")),format.raw/*21.94*/("""'></script>
<script type="text/javascript" src='"""),_display_(/*22.38*/routes/*22.44*/.Assets.at("javascripts/field_validation_helper.js")),format.raw/*22.96*/("""'></script>

<script type="text/javascript">
    count = 0;
    delc = 0;
    var originCreator;
    var quill;
    function checkCreator() """),format.raw/*29.29*/("""{"""),format.raw/*29.30*/("""
        """),format.raw/*30.9*/("""$("#warningModal").modal("open");
        $("#challengeCreatorMsg").text("");
    """),format.raw/*32.5*/("""}"""),format.raw/*32.6*/("""
    """),format.raw/*33.5*/("""$(document).ready(function () """),format.raw/*33.35*/("""{"""),format.raw/*33.36*/("""
        """),format.raw/*34.9*/("""/**
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



        quill = new Quill('#editor', """),format.raw/*51.38*/("""{"""),format.raw/*51.39*/("""
            """),format.raw/*52.13*/("""modules: """),format.raw/*52.22*/("""{"""),format.raw/*52.23*/("""
                """),format.raw/*53.17*/("""toolbar: [
                    ["""),format.raw/*54.22*/("""{"""),format.raw/*54.23*/(""" """),format.raw/*54.24*/("""'font': [] """),format.raw/*54.35*/("""}"""),format.raw/*54.36*/("""],
                    ["""),format.raw/*55.22*/("""{"""),format.raw/*55.23*/(""" """),format.raw/*55.24*/("""'size': ['small', false, 'large', 'huge'] """),format.raw/*55.66*/("""}"""),format.raw/*55.67*/("""],  // custom dropdown
                    ['bold', 'italic', 'underline', 'strike'],        // toggled buttons
                    ["""),format.raw/*57.22*/("""{"""),format.raw/*57.23*/(""" """),format.raw/*57.24*/("""'color': [] """),format.raw/*57.36*/("""}"""),format.raw/*57.37*/(""", """),format.raw/*57.39*/("""{"""),format.raw/*57.40*/(""" """),format.raw/*57.41*/("""'background': [] """),format.raw/*57.58*/("""}"""),format.raw/*57.59*/("""],          // dropdown with defaults from theme
                    ['blockquote'],

                    ["""),format.raw/*60.22*/("""{"""),format.raw/*60.23*/(""" """),format.raw/*60.24*/("""'list': 'ordered'"""),format.raw/*60.41*/("""}"""),format.raw/*60.42*/(""", """),format.raw/*60.44*/("""{"""),format.raw/*60.45*/(""" """),format.raw/*60.46*/("""'list': 'bullet' """),format.raw/*60.63*/("""}"""),format.raw/*60.64*/("""],
                    ["""),format.raw/*61.22*/("""{"""),format.raw/*61.23*/(""" """),format.raw/*61.24*/("""'script': 'sub'"""),format.raw/*61.39*/("""}"""),format.raw/*61.40*/(""", """),format.raw/*61.42*/("""{"""),format.raw/*61.43*/(""" """),format.raw/*61.44*/("""'script': 'super' """),format.raw/*61.62*/("""}"""),format.raw/*61.63*/("""],      // superscript/subscript
                    ["""),format.raw/*62.22*/("""{"""),format.raw/*62.23*/(""" """),format.raw/*62.24*/("""'indent': '-1'"""),format.raw/*62.38*/("""}"""),format.raw/*62.39*/(""", """),format.raw/*62.41*/("""{"""),format.raw/*62.42*/(""" """),format.raw/*62.43*/("""'indent': '+1' """),format.raw/*62.58*/("""}"""),format.raw/*62.59*/("""],          // outdent/indent
                    ["""),format.raw/*63.22*/("""{"""),format.raw/*63.23*/(""" """),format.raw/*63.24*/("""'direction': 'rtl' """),format.raw/*63.43*/("""}"""),format.raw/*63.44*/("""],                         // text directio
                    ["""),format.raw/*64.22*/("""{"""),format.raw/*64.23*/(""" """),format.raw/*64.24*/("""'align': [] """),format.raw/*64.36*/("""}"""),format.raw/*64.37*/("""],
                    ['link', 'image']
                ]
            """),format.raw/*67.13*/("""}"""),format.raw/*67.14*/(""",
            placeholder: 'Enter project description...',
            theme: 'snow'
        """),format.raw/*70.9*/("""}"""),format.raw/*70.10*/(""");

        var limit = technologyDescriptionMaxLength;
        quill.on('text-change', function (delta, old, source) """),format.raw/*73.63*/("""{"""),format.raw/*73.64*/("""
            """),format.raw/*74.13*/("""if (quill.getLength() > limit+1) """),format.raw/*74.46*/("""{"""),format.raw/*74.47*/("""
                """),format.raw/*75.17*/("""document.getElementById("descriptionMsg").innerHTML = "Field should be no longer than "+ limit +" characters";
            """),format.raw/*76.13*/("""}"""),format.raw/*76.14*/("""else"""),format.raw/*76.18*/("""{"""),format.raw/*76.19*/("""
                """),format.raw/*77.17*/("""document.getElementById("descriptionMsg").innerHTML = "";
            """),format.raw/*78.13*/("""}"""),format.raw/*78.14*/("""
        """),format.raw/*79.9*/("""}"""),format.raw/*79.10*/(""");

        quill.clipboard.dangerouslyPasteHTML(entityToString());
        //  $("#description").val();
        $("#addPanel").hide();
        $("#previewPanel").hide();
        if($("#showImg").attr("src") == "") """),format.raw/*85.45*/("""{"""),format.raw/*85.46*/("""
            """),format.raw/*86.13*/("""$("#projectPreview").hide();
        """),format.raw/*87.9*/("""}"""),format.raw/*87.10*/("""
        """),format.raw/*88.9*/("""$("#showPanel").click(function () """),format.raw/*88.43*/("""{"""),format.raw/*88.44*/("""
            """),format.raw/*89.13*/("""var panel = document.getElementById("addPanel");
            if (panel.style.display == "none") """),format.raw/*90.48*/("""{"""),format.raw/*90.49*/("""
                """),format.raw/*91.17*/("""$("#btnName").attr("style", "transform:rotate(-45deg);transition:transform 0.3s linear;");
                $("#buttonText").text("Close Window");
            """),format.raw/*93.13*/("""}"""),format.raw/*93.14*/("""
            """),format.raw/*94.13*/("""else """),format.raw/*94.18*/("""{"""),format.raw/*94.19*/("""
                """),format.raw/*95.17*/("""$("#btnName").attr("style", "transform:rotate(0deg);transition:transform 0.3s linear;");
                $("#buttonText").text("Add Members");
                document.getElementById("memberName").value = "";
                document.getElementById("email").value = "";
                document.getElementById("email").classList.remove("invalid");
                document.getElementById("memberName").classList.remove("invalid");
            """),format.raw/*101.13*/("""}"""),format.raw/*101.14*/("""
            """),format.raw/*102.13*/("""$("#addPanel").slideToggle();

        """),format.raw/*104.9*/("""}"""),format.raw/*104.10*/(""");


        //preview the updated image
        $("#addmember").click(function changepic() """),format.raw/*108.52*/("""{"""),format.raw/*108.53*/("""
            """),format.raw/*109.13*/("""if (document.getElementById("memberName").value.trim().length==0)"""),format.raw/*109.78*/("""{"""),format.raw/*109.79*/("""
                """),format.raw/*110.17*/("""document.getElementById("memberName").classList.add("invalid");
            """),format.raw/*111.13*/("""}"""),format.raw/*111.14*/("""
            """),format.raw/*112.13*/("""if (document.getElementById("email").value.trim().length==0)"""),format.raw/*112.73*/("""{"""),format.raw/*112.74*/("""
                """),format.raw/*113.17*/("""document.getElementById("email").classList.add("invalid");
            """),format.raw/*114.13*/("""}"""),format.raw/*114.14*/("""
            """),format.raw/*115.13*/("""// document.getElementById("email").value.trim().length()==0;
            var isName = document.getElementById("memberName").classList.contains("invalid") ? false : true;
            var isEmail = document.getElementById("email").classList.contains("invalid") ? false : true;

            if(!isName || !isEmail) return;
            if (document.getElementById("photo").value == "") """),format.raw/*120.63*/("""{"""),format.raw/*120.64*/("""
                """),format.raw/*121.17*/("""var url = "../../../../assets/images/person.jpg";
                showPreview(url);
                return;
            """),format.raw/*124.13*/("""}"""),format.raw/*124.14*/("""
            """),format.raw/*125.13*/("""var reads = new FileReader();
            f = document.getElementById("photo").files[0];
            reads.readAsDataURL(f);
            reads.onload = function (e) """),format.raw/*128.41*/("""{"""),format.raw/*128.42*/("""
                """),format.raw/*129.17*/("""showPreview(this.result);

            """),format.raw/*131.13*/("""}"""),format.raw/*131.14*/(""";
        """),format.raw/*132.9*/("""}"""),format.raw/*132.10*/(""");
        document.body.scrollTop = document.documentElement.scrollTop = 0;
    """),format.raw/*134.5*/("""}"""),format.raw/*134.6*/(""");

    function entityToString()"""),format.raw/*136.30*/("""{"""),format.raw/*136.31*/("""
        """),format.raw/*137.9*/("""var div=document.createElement('div');
    """),_display_(/*138.6*/if(technology.getShortDescription!=null)/*138.46*/{_display_(Seq[Any](format.raw/*138.47*/("""
            """),format.raw/*139.13*/("""div.innerHTML = """"),_display_(/*139.31*/technology/*139.41*/.getShortDescription),format.raw/*139.61*/("""";
        """)))}),format.raw/*140.10*/("""
        """),format.raw/*141.9*/("""var res=div.innerText||div.textContent;
        return res;
    """),format.raw/*143.5*/("""}"""),format.raw/*143.6*/("""

    """),format.raw/*145.5*/("""function getHTML() //display current HTML
    """),format.raw/*146.5*/("""{"""),format.raw/*146.6*/("""
        """),format.raw/*147.9*/("""if(document.getElementById("descriptionMsg").innerText.length != 0)
            return false;
        console.log(Number.isInteger('fjidsao'));
        //console.log("isnan:" + isNaN($("#challengeCreator").text());
        var cid = $("#challengeCreator").val()
        console.log("cid" + $("#challengeCreator").val());
        console.log("typeof" + typeof($("#challengeCreator").val()));

        if(isNaN(cid))"""),format.raw/*155.23*/("""{"""),format.raw/*155.24*/("""
            """),format.raw/*156.13*/("""//document.getElementById(urlMsgId).setAttribute('data-error', msg);
            console.log("cidddMSg:" + $("#challengeCreatorMsg").text())
            $("#challengeCreatorMsg").text("Please specify correct id format");

            return false;
        """),format.raw/*161.9*/("""}"""),format.raw/*161.10*/("""
        """),format.raw/*162.9*/("""exist = false;
        $.ajax("""),format.raw/*163.16*/("""{"""),format.raw/*163.17*/("""
            """),format.raw/*164.13*/("""url: "/user/allUserIds",
            headers: """),format.raw/*165.22*/("""{"""),format.raw/*165.23*/("""
                """),format.raw/*166.17*/("""'Content-Type': 'application/json'
            """),format.raw/*167.13*/("""}"""),format.raw/*167.14*/(""",
            async: false,
            type: "GET"
        """),format.raw/*170.9*/("""}"""),format.raw/*170.10*/(""").done(function (data) """),format.raw/*170.33*/("""{"""),format.raw/*170.34*/("""
            """),format.raw/*171.13*/("""console.log("data:" + data)
            console.log("id:" + cid)
            for(i in data)"""),format.raw/*173.27*/("""{"""),format.raw/*173.28*/("""
                """),format.raw/*174.17*/("""console.log(Number(data[i]) + "," + Number(cid))
                if(Number(data[i]) == Number(cid))"""),format.raw/*175.51*/("""{"""),format.raw/*175.52*/("""
                    """),format.raw/*176.21*/("""exist = true;
                    console.log("loop:" + exist);
                """),format.raw/*178.17*/("""}"""),format.raw/*178.18*/("""
            """),format.raw/*179.13*/("""}"""),format.raw/*179.14*/("""

        """),format.raw/*181.9*/("""}"""),format.raw/*181.10*/(""");
        console.log("out" + exist)
        if(!exist)"""),format.raw/*183.19*/("""{"""),format.raw/*183.20*/("""
            """),format.raw/*184.13*/("""$("#challengeCreatorMsg").text("This user does not exist!");
            return false;
        """),format.raw/*186.9*/("""}"""),format.raw/*186.10*/("""
        """),format.raw/*187.9*/("""$("#editor").find("img").each(function () """),format.raw/*187.51*/("""{"""),format.raw/*187.52*/("""
            """),format.raw/*188.13*/("""if($(this).attr("width") == null) """),format.raw/*188.47*/("""{"""),format.raw/*188.48*/("""
                """),format.raw/*189.17*/("""// If this is a new image
                var img = this;
                var dataurl = $(this).attr("src");
                var arr = dataurl.split(','), mime = arr[0].match(/:(.*?);/)[1],
                    bstr = atob(arr[1]), n = bstr.length, u8arr = new Uint8Array(n);
                while (n--) """),format.raw/*194.29*/("""{"""),format.raw/*194.30*/("""
                    """),format.raw/*195.21*/("""u8arr[n] = bstr.charCodeAt(n);
                """),format.raw/*196.17*/("""}"""),format.raw/*196.18*/("""
                """),format.raw/*197.17*/("""var f = new File([u8arr], "file", """),format.raw/*197.51*/("""{"""),format.raw/*197.52*/("""type: mime"""),format.raw/*197.62*/("""}"""),format.raw/*197.63*/(""");
                var fd = new FormData();
                fd.append('file', f);
                countImagesInDescription ++;
                $.ajax("""),format.raw/*201.24*/("""{"""),format.raw/*201.25*/("""
                    """),format.raw/*202.21*/("""url: "/project/uploadDescriptionImg/"""),_display_(/*202.58*/technology/*202.68*/.getId),format.raw/*202.74*/("""/" + (countImagesInDescription-1) ,
                    data: fd,
                    contentType: false,
                    dataType: "text",
                    processData: false,
                    async: false,
                    type: "POST",
                    success: function (data) """),format.raw/*209.46*/("""{"""),format.raw/*209.47*/("""
                        """),format.raw/*210.25*/("""console.log(data);
                        $(img).attr("src", data);
                        $(img).attr("width", "50%");
                    """),format.raw/*213.21*/("""}"""),format.raw/*213.22*/(""",
                    error: function (msg) """),format.raw/*214.43*/("""{"""),format.raw/*214.44*/("""
                        """),format.raw/*215.25*/("""console.log("123123123");
                    """),format.raw/*216.21*/("""}"""),format.raw/*216.22*/("""
                """),format.raw/*217.17*/("""}"""),format.raw/*217.18*/(""");
            """),format.raw/*218.13*/("""}"""),format.raw/*218.14*/("""



        """),format.raw/*222.9*/("""}"""),format.raw/*222.10*/(""");

        var ajaxflag = true;
        var parentProjectId = $("#parentProjectId").val();
        if(parentProjectId !== "0") """),format.raw/*226.37*/("""{"""),format.raw/*226.38*/("""
            """),format.raw/*227.13*/("""$.ajax("""),format.raw/*227.20*/("""{"""),format.raw/*227.21*/("""
                """),format.raw/*228.17*/("""url: "/project/checkParentProject/" + parentProjectId,
                async: false,
                headers: """),format.raw/*230.26*/("""{"""),format.raw/*230.27*/("""
                    """),format.raw/*231.21*/("""'Content-Type': 'application/json'
                """),format.raw/*232.17*/("""}"""),format.raw/*232.18*/(""",
                type: "GET",
                success: function (data) """),format.raw/*234.42*/("""{"""),format.raw/*234.43*/("""
                    """),format.raw/*235.21*/("""var response = data;
                    console.log(data);
                    if ('badFormat' in response) """),format.raw/*237.50*/("""{"""),format.raw/*237.51*/("""
                        """),format.raw/*238.25*/("""console.log(response['badFormat']);
                        $("#parentProjectIdMsg").text(response['badFormat']);
                        ajaxflag = false;
                    """),format.raw/*241.21*/("""}"""),format.raw/*241.22*/(""" """),format.raw/*241.23*/("""else """),format.raw/*241.28*/("""{"""),format.raw/*241.29*/("""
                        """),format.raw/*242.25*/("""if ('notExisted' in response) """),format.raw/*242.55*/("""{"""),format.raw/*242.56*/("""
                            """),format.raw/*243.29*/("""$("#parentProjectIdMsg").text(response['notExisted']);
                            ajaxflag = false;
                        """),format.raw/*245.25*/("""}"""),format.raw/*245.26*/(""" """),format.raw/*245.27*/("""else """),format.raw/*245.32*/("""{"""),format.raw/*245.33*/("""

                        """),format.raw/*247.25*/("""}"""),format.raw/*247.26*/("""

                    """),format.raw/*249.21*/("""}"""),format.raw/*249.22*/("""
                """),format.raw/*250.17*/("""}"""),format.raw/*250.18*/("""
            """),format.raw/*251.13*/("""}"""),format.raw/*251.14*/(""");
        """),format.raw/*252.9*/("""}"""),format.raw/*252.10*/("""
        """),format.raw/*253.9*/("""if(!ajaxflag)"""),format.raw/*253.22*/("""{"""),format.raw/*253.23*/("""
            """),format.raw/*254.13*/("""return false;
        """),format.raw/*255.9*/("""}"""),format.raw/*255.10*/("""

        """),format.raw/*257.9*/("""var html = quill.root.innerHTML;
        $("#description").val(html);
        $("#countImagesInDescription").val(countImagesInDescription);




        return true;
    """),format.raw/*265.5*/("""}"""),format.raw/*265.6*/("""

    """),format.raw/*267.5*/("""function showProPreview(obj) """),format.raw/*267.34*/("""{"""),format.raw/*267.35*/("""
        """),format.raw/*268.9*/("""if($("#showImg").attr("src") == "") """),format.raw/*268.45*/("""{"""),format.raw/*268.46*/("""
            """),format.raw/*269.13*/("""$("#deleteBtn").hide();
        """),format.raw/*270.9*/("""}"""),format.raw/*270.10*/("""
        """),format.raw/*271.9*/("""else """),format.raw/*271.14*/("""{"""),format.raw/*271.15*/("""
            """),format.raw/*272.13*/("""$("#deleteBtn").show();
            //$('#previewMsg').text("");
        """),format.raw/*274.9*/("""}"""),format.raw/*274.10*/("""
        """),format.raw/*275.9*/("""var panel = document.getElementById("previewPanel");
        if (panel.style.display == "none") """),format.raw/*276.44*/("""{"""),format.raw/*276.45*/("""
            """),format.raw/*277.13*/("""$(obj).text("Close Preview");
        """),format.raw/*278.9*/("""}"""),format.raw/*278.10*/("""
        """),format.raw/*279.9*/("""else """),format.raw/*279.14*/("""{"""),format.raw/*279.15*/("""
            """),format.raw/*280.13*/("""$(obj).text("Preview Or Delete Picture");
        """),format.raw/*281.9*/("""}"""),format.raw/*281.10*/("""
        """),format.raw/*282.9*/("""$("#previewPanel").slideToggle();

    """),format.raw/*284.5*/("""}"""),format.raw/*284.6*/("""


    """),format.raw/*287.5*/("""function deletePDF() """),format.raw/*287.26*/("""{"""),format.raw/*287.27*/("""
        """),format.raw/*288.9*/("""document.getElementById('showImg').src = "";
        $('#pdfRecord').val("delete");
        $("#pdfDeleteBtn").hide();
        $("#pdfDownload").hide();
        $('#pdfPreviewMsg').text("The PDF is deleted. You need to click \"UPDATE\" button below if you want to save the changes.");
    """),format.raw/*293.5*/("""}"""),format.raw/*293.6*/("""

    """),format.raw/*295.5*/("""function markAsPrivate() """),format.raw/*295.30*/("""{"""),format.raw/*295.31*/("""

    """),format.raw/*297.5*/("""}"""),format.raw/*297.6*/("""


"""),format.raw/*300.1*/("""</script>
""")))};
Seq[Any](format.raw/*1.26*/("""
"""),format.raw/*5.1*/("""
"""),format.raw/*301.2*/("""

"""),_display_(/*303.2*/main("Technology Edit", scripts)/*303.34*/ {_display_(Seq[Any](format.raw/*303.36*/("""

"""),format.raw/*305.1*/("""<link href='"""),_display_(/*305.14*/routes/*305.20*/.Assets.at("stylesheets/quill.snow.css")),format.raw/*305.60*/("""'
      rel="stylesheet" />
<script type="text/javascript" src='"""),_display_(/*307.38*/routes/*307.44*/.Assets.at("javascripts/plugins/quill.js")),format.raw/*307.86*/("""'></script>

<div class="container">
    <div class="row">
        <div class="col  s12 m10 offset-m1">
            <div class="card-panel">
                <h4 class="center form-signin-heading" align="center">
                    Edit Technology Information</h4>
                <div id="warningModal" class="modal">
                    <div class="modal-content">
                        <h5 style="color: red">Warning!</h5>
                        <p style="font-weight: bold">Do you really want to change the creator of this project?
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
                <form class="form-signin" enctype="multipart/form-data" id="editTechnologyForm" method="post" onsubmit="return getHTML()" action=""""),_display_(/*329.148*/routes/*329.154*/.TechnologyController.technologyEditPOST(technology.getId)),format.raw/*329.212*/("""">
                    <div id="hiddenDiv" style="display: none;">
                        <input name="id" id="id" class="validate" value=""""),_display_(/*331.75*/technology/*331.85*/.getId),format.raw/*331.91*/("""">
                        <input name="isActive" id="isActive" class="validate" value=""""),_display_(/*332.87*/technology/*332.97*/.getIsActive),format.raw/*332.109*/("""">
                        """),format.raw/*336.122*/("""
                    """),format.raw/*337.21*/("""</div>
                    <div class="row">
                        <div class="input-field col s12">
                            <input
                                    type="text" name="technologyTitle" id="technologyTitle" class="validate" value=""""),_display_(/*341.118*/technology/*341.128*/.getTechnologyTitle),format.raw/*341.147*/("""" required>
                            <label for="title">Title* </label>
                            <span id="technologyTitleMsg" class="helper-text" data-error=""></span>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s12">
                            <input type="text" name="goals" id="goals"  class="validate" required value=""""),_display_(/*348.107*/technology/*348.117*/.getGoals),format.raw/*348.126*/("""">
                            <label for="goals">
                                Goals* </label>
                            <span id="goalsMsg" class="helper-text" data-error=""></span>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s12">
                            <input
                                    type="text" name="shortDescription" id="shortDescription" value = """"),_display_(/*357.105*/technology/*357.115*/.getShortDescription),format.raw/*357.135*/(""""  class="validate" required>
                            <label for="shortDescription">
                                Short Description* </label>
                            <span id="shortDescriptionMsg" class="helper-text" data-error=""></span>
                        </div>
                    </div>


                    <div class="row">
                        <div class="input-field col s12">
                            <input type="text" name="keywords" id="keywords" class="validate" value=""""),_display_(/*367.103*/technology/*367.113*/.getKeywords),format.raw/*367.125*/("""" class="validate" required>
                            <label for="keywords">
                                Keywords* </label>
                            <span id="keywordsMsg" class="helper-text" data-error=""></span>
                        </div>
                    </div>

                    <div class="row">
                        <div class="input-field col s12">
                            <input type="text" name="fields" id="fields" class="validate" value=""""),_display_(/*376.99*/technology/*376.109*/.getFields),format.raw/*376.119*/("""" class="validate" required>
                            <label for="fields">
                                Fields* </label>
                            <span id="fieldsMsg" class="helper-text" data-error=""></span>
                        </div>
                    </div>

                    <div class="row">
                        <div class="file-field input-field col s12" >
                            <div class="btn waves-effect waves-light blue darken-2" >
                                <span >Change Representative Paper PDF</span>
                                <input type="file" accept=".pdf" id="pdf" name="pdf">
                            </div>
                            <div class="file-path-wrapper">
                                <input class="file-path validate" type="text">
                            </div>
                            <div id="pdfPreviewMsg" style="color:blue"></div>
                            """),_display_(/*393.30*/if(technology.getPdf != null && technology.getPdf != "")/*393.86*/ {_display_(Seq[Any](format.raw/*393.88*/("""
                            """),format.raw/*394.29*/("""<a id="pdfDownload" href=""""),_display_(/*394.56*/technology/*394.66*/.getPdf),format.raw/*394.73*/("""">
                                Download Current Representative Paper PDF</a>
                            <a id = "pdfDeleteBtn" class="right" href="#" style="color: red;" onclick="deletePDF()">
                                <i class="material-icons">cross</i> Delete Current PDF</a>
                            """)))}),format.raw/*398.30*/("""
                            """),format.raw/*399.29*/("""<input id="pdfRecord" name = "pdfRecord" style="display: none;"/>
                        </div>
                    </div>

                    <div class="row">
                        <div class="input-field col s12">
                            <input
                                    type="text" name="representativePaperURL" id="representativePaperURL" value=""""),_display_(/*406.115*/technology/*406.125*/.getRepresentativePaperURL),format.raw/*406.151*/("""" class="validate">
                            <label for="representativePaperURL">
                                Representative Paper URL </label>
                            <span id="representativePaperURLMsg" class="helper-text" data-error=""></span>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s12">
                            <input
                                    type="text" name="teamMembers" id="teamMembers" value = """"),_display_(/*415.95*/technology/*415.105*/.getTeamMembers),format.raw/*415.120*/("""" class="validate">
                            <label for="teamMembers">
                                Team Members </label>
                            <span id="githubMsg" class="helper-text" data-error=""></span>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s12">
                            <input
                                    type="text" name="pIName" id="pIName" value = """"),_display_(/*424.85*/technology/*424.95*/.getPIName),format.raw/*424.105*/("""" class="validate" required>
                            <label for="pIName">
                                PI Name* </label>
                            <span id="pINameMsg" class="helper-text" data-error=""></span>
                        </div>
                    </div>


                    <div class="row">
                        <div class="input-field col s12">
                            <textarea type="text" style="height: 200px;
                                word-wrap: break-word; margin-top: 10px;" id="longDescription" placeholder="" name="longDescription"  onchange="validateTextarea('longDescription', 'technology', 'addTechnology')">"""),_display_(/*435.214*/technology/*435.224*/.getLongDescription),format.raw/*435.243*/("""</textarea>
                            <label for="longDescription">Long Description</label>
                            <span id="longDescriptionMsg" class="helper-text" data-error="" style="color: red; font-size: 12px"></span>
                        </div>
                    </div>

                    <div class="actions row center">
                        <div class="input-field col s12">
                            <button type="submit" id="technologyRegister" class="btn waves-effect waves-light blue darken-2">
                                Update</button>
                            <a href=""""),_display_(/*445.39*/routes/*445.45*/.TechnologyController.technologyDetail(technology.getId)),format.raw/*445.101*/("""" class="btn waves-effect waves-light red darken-2">
                                Cancel</a>

                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>

""")))}),format.raw/*456.2*/("""
"""))
      }
    }
  }

  def render(technology:Technology): play.twirl.api.HtmlFormat.Appendable = apply(technology)

  def f:((Technology) => play.twirl.api.HtmlFormat.Appendable) = (technology) => apply(technology)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:39 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/technologyEdit.scala.html
                  HASH: 8f4381ec658ed43eeda981a0636ea16c7431b7f6
                  MATRIX: 1124->1|1221->27|1244->44|1267->61|1304->88|1318->95|1398->99|1425->100|1466->115|1493->116|1528->125|1580->150|1608->151|1640->156|1670->159|1698->160|1734->169|1785->193|1813->194|1845->199|1890->216|1919->217|1955->226|2004->248|2032->249|2064->254|2100->262|2129->263|2165->272|2211->291|2239->292|2267->293|2340->339|2355->345|2426->395|2502->444|2517->450|2590->502|2758->642|2787->643|2823->652|2932->734|2960->735|2992->740|3050->770|3079->771|3115->780|4084->1721|4113->1722|4154->1735|4191->1744|4220->1745|4265->1762|4325->1794|4354->1795|4383->1796|4422->1807|4451->1808|4503->1832|4532->1833|4561->1834|4631->1876|4660->1877|4821->2010|4850->2011|4879->2012|4919->2024|4948->2025|4978->2027|5007->2028|5036->2029|5081->2046|5110->2047|5245->2154|5274->2155|5303->2156|5348->2173|5377->2174|5407->2176|5436->2177|5465->2178|5510->2195|5539->2196|5591->2220|5620->2221|5649->2222|5692->2237|5721->2238|5751->2240|5780->2241|5809->2242|5855->2260|5884->2261|5966->2315|5995->2316|6024->2317|6066->2331|6095->2332|6125->2334|6154->2335|6183->2336|6226->2351|6255->2352|6334->2403|6363->2404|6392->2405|6439->2424|6468->2425|6561->2490|6590->2491|6619->2492|6659->2504|6688->2505|6787->2576|6816->2577|6936->2670|6965->2671|7111->2789|7140->2790|7181->2803|7242->2836|7271->2837|7316->2854|7467->2977|7496->2978|7528->2982|7557->2983|7602->3000|7700->3070|7729->3071|7765->3080|7794->3081|8037->3296|8066->3297|8107->3310|8171->3347|8200->3348|8236->3357|8298->3391|8327->3392|8368->3405|8492->3501|8521->3502|8566->3519|8752->3677|8781->3678|8822->3691|8855->3696|8884->3697|8929->3714|9401->4157|9431->4158|9473->4171|9540->4210|9570->4211|9691->4303|9721->4304|9763->4317|9857->4382|9887->4383|9933->4400|10038->4476|10068->4477|10110->4490|10199->4550|10229->4551|10275->4568|10375->4639|10405->4640|10447->4653|10859->5036|10889->5037|10935->5054|11084->5174|11114->5175|11156->5188|11350->5353|11380->5354|11426->5371|11494->5410|11524->5411|11562->5421|11592->5422|11701->5503|11730->5504|11792->5537|11822->5538|11859->5547|11930->5591|11980->5631|12020->5632|12062->5645|12108->5663|12128->5673|12170->5693|12214->5705|12251->5714|12343->5778|12372->5779|12406->5785|12480->5831|12509->5832|12546->5841|12989->6255|13019->6256|13061->6269|13345->6525|13375->6526|13412->6535|13471->6565|13501->6566|13543->6579|13618->6625|13648->6626|13694->6643|13770->6690|13800->6691|13888->6751|13918->6752|13970->6775|14000->6776|14042->6789|14162->6880|14192->6881|14238->6898|14366->6997|14396->6998|14446->7019|14555->7099|14585->7100|14627->7113|14657->7114|14695->7124|14725->7125|14810->7181|14840->7182|14882->7195|15005->7290|15035->7291|15072->7300|15143->7342|15173->7343|15215->7356|15278->7390|15308->7391|15354->7408|15686->7711|15716->7712|15766->7733|15842->7780|15872->7781|15918->7798|15981->7832|16011->7833|16050->7843|16080->7844|16259->7994|16289->7995|16339->8016|16404->8053|16424->8063|16452->8069|16778->8366|16808->8367|16862->8392|17033->8534|17063->8535|17136->8579|17166->8580|17220->8605|17295->8651|17325->8652|17371->8669|17401->8670|17445->8685|17475->8686|17515->8698|17545->8699|17702->8827|17732->8828|17774->8841|17810->8848|17840->8849|17886->8866|18025->8976|18055->8977|18105->8998|18185->9049|18215->9050|18316->9122|18346->9123|18396->9144|18534->9253|18564->9254|18618->9279|18823->9455|18853->9456|18883->9457|18917->9462|18947->9463|19001->9488|19060->9518|19090->9519|19148->9548|19302->9673|19332->9674|19362->9675|19396->9680|19426->9681|19481->9707|19511->9708|19562->9730|19592->9731|19638->9748|19668->9749|19710->9762|19740->9763|19779->9774|19809->9775|19846->9784|19888->9797|19918->9798|19960->9811|20010->9833|20040->9834|20078->9844|20275->10013|20304->10014|20338->10020|20396->10049|20426->10050|20463->10059|20528->10095|20558->10096|20600->10109|20660->10141|20690->10142|20727->10151|20761->10156|20791->10157|20833->10170|20934->10243|20964->10244|21001->10253|21126->10349|21156->10350|21198->10363|21264->10401|21294->10402|21331->10411|21365->10416|21395->10417|21437->10430|21515->10480|21545->10481|21582->10490|21649->10529|21678->10530|21713->10537|21763->10558|21793->10559|21830->10568|22147->10857|22176->10858|22210->10864|22264->10889|22294->10890|22328->10896|22357->10897|22388->10900|22438->25|22465->86|22494->10911|22524->10914|22566->10946|22607->10948|22637->10950|22678->10963|22694->10969|22756->11009|22849->11074|22865->11080|22929->11122|24234->12398|24251->12404|24332->12462|24501->12603|24521->12613|24549->12619|24666->12708|24686->12718|24721->12730|24778->13228|24828->13249|25112->13504|25133->13514|25175->13533|25639->13968|25660->13978|25692->13987|26203->14469|26224->14479|26267->14499|26804->15007|26825->15017|26860->15029|27365->15506|27386->15516|27419->15526|28398->16477|28464->16533|28505->16535|28563->16564|28618->16591|28638->16601|28667->16608|29017->16926|29075->16955|29474->17325|29495->17335|29544->17361|30113->17902|30134->17912|30172->17927|30692->18419|30712->18429|30745->18439|31434->19099|31455->19109|31497->19128|32137->19740|32153->19746|32232->19802|32496->20035
                  LINES: 35->1|38->2|39->3|40->4|42->6|42->6|44->6|45->7|46->8|46->8|47->9|48->10|48->10|49->11|49->11|49->11|50->12|51->13|51->13|52->14|52->14|52->14|53->15|54->16|54->16|55->17|55->17|55->17|56->18|57->19|57->19|58->20|59->21|59->21|59->21|60->22|60->22|60->22|67->29|67->29|68->30|70->32|70->32|71->33|71->33|71->33|72->34|89->51|89->51|90->52|90->52|90->52|91->53|92->54|92->54|92->54|92->54|92->54|93->55|93->55|93->55|93->55|93->55|95->57|95->57|95->57|95->57|95->57|95->57|95->57|95->57|95->57|95->57|98->60|98->60|98->60|98->60|98->60|98->60|98->60|98->60|98->60|98->60|99->61|99->61|99->61|99->61|99->61|99->61|99->61|99->61|99->61|99->61|100->62|100->62|100->62|100->62|100->62|100->62|100->62|100->62|100->62|100->62|101->63|101->63|101->63|101->63|101->63|102->64|102->64|102->64|102->64|102->64|105->67|105->67|108->70|108->70|111->73|111->73|112->74|112->74|112->74|113->75|114->76|114->76|114->76|114->76|115->77|116->78|116->78|117->79|117->79|123->85|123->85|124->86|125->87|125->87|126->88|126->88|126->88|127->89|128->90|128->90|129->91|131->93|131->93|132->94|132->94|132->94|133->95|139->101|139->101|140->102|142->104|142->104|146->108|146->108|147->109|147->109|147->109|148->110|149->111|149->111|150->112|150->112|150->112|151->113|152->114|152->114|153->115|158->120|158->120|159->121|162->124|162->124|163->125|166->128|166->128|167->129|169->131|169->131|170->132|170->132|172->134|172->134|174->136|174->136|175->137|176->138|176->138|176->138|177->139|177->139|177->139|177->139|178->140|179->141|181->143|181->143|183->145|184->146|184->146|185->147|193->155|193->155|194->156|199->161|199->161|200->162|201->163|201->163|202->164|203->165|203->165|204->166|205->167|205->167|208->170|208->170|208->170|208->170|209->171|211->173|211->173|212->174|213->175|213->175|214->176|216->178|216->178|217->179|217->179|219->181|219->181|221->183|221->183|222->184|224->186|224->186|225->187|225->187|225->187|226->188|226->188|226->188|227->189|232->194|232->194|233->195|234->196|234->196|235->197|235->197|235->197|235->197|235->197|239->201|239->201|240->202|240->202|240->202|240->202|247->209|247->209|248->210|251->213|251->213|252->214|252->214|253->215|254->216|254->216|255->217|255->217|256->218|256->218|260->222|260->222|264->226|264->226|265->227|265->227|265->227|266->228|268->230|268->230|269->231|270->232|270->232|272->234|272->234|273->235|275->237|275->237|276->238|279->241|279->241|279->241|279->241|279->241|280->242|280->242|280->242|281->243|283->245|283->245|283->245|283->245|283->245|285->247|285->247|287->249|287->249|288->250|288->250|289->251|289->251|290->252|290->252|291->253|291->253|291->253|292->254|293->255|293->255|295->257|303->265|303->265|305->267|305->267|305->267|306->268|306->268|306->268|307->269|308->270|308->270|309->271|309->271|309->271|310->272|312->274|312->274|313->275|314->276|314->276|315->277|316->278|316->278|317->279|317->279|317->279|318->280|319->281|319->281|320->282|322->284|322->284|325->287|325->287|325->287|326->288|331->293|331->293|333->295|333->295|333->295|335->297|335->297|338->300|340->1|341->5|342->301|344->303|344->303|344->303|346->305|346->305|346->305|346->305|348->307|348->307|348->307|370->329|370->329|370->329|372->331|372->331|372->331|373->332|373->332|373->332|374->336|375->337|379->341|379->341|379->341|386->348|386->348|386->348|395->357|395->357|395->357|405->367|405->367|405->367|414->376|414->376|414->376|431->393|431->393|431->393|432->394|432->394|432->394|432->394|436->398|437->399|444->406|444->406|444->406|453->415|453->415|453->415|462->424|462->424|462->424|473->435|473->435|473->435|483->445|483->445|483->445|494->456
                  -- GENERATED --
              */
          