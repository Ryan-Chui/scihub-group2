
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

object projectEdit extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Project,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(project: Project):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._
/*3.2*/import models._
/*4.6*/import models.Project

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
            countImagesInDescription = """),_display_(/*28.41*/project/*28.48*/.getNextImageIndex),format.raw/*28.66*/(""";
            var quill;
            function checkCreator() """),format.raw/*30.37*/("""{"""),format.raw/*30.38*/("""
                """),format.raw/*31.17*/("""$("#warningModal").modal("open");
                $("#challengeCreatorMsg").text("");
            """),format.raw/*33.13*/("""}"""),format.raw/*33.14*/("""
            """),format.raw/*34.13*/("""$(document).ready(function () """),format.raw/*34.43*/("""{"""),format.raw/*34.44*/("""
                """),format.raw/*35.17*/("""/**
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

                originCreator = '"""),_display_(/*50.35*/project/*50.42*/.getSponsorContact.getId),format.raw/*50.66*/("""';
                $("#cancel-change-creator").click(function () """),format.raw/*51.63*/("""{"""),format.raw/*51.64*/("""
                    """),format.raw/*52.21*/("""$("#projectCreator").val(originCreator);
                """),format.raw/*53.17*/("""}"""),format.raw/*53.18*/(""")
                $("#confirm-change-creator").click(function () """),format.raw/*54.64*/("""{"""),format.raw/*54.65*/("""
                    """),format.raw/*55.21*/("""originCreator = $("#projectCreator").val();
                """),format.raw/*56.17*/("""}"""),format.raw/*56.18*/(""")

                quill = new Quill('#editor', """),format.raw/*58.46*/("""{"""),format.raw/*58.47*/("""
                    """),format.raw/*59.21*/("""modules: """),format.raw/*59.30*/("""{"""),format.raw/*59.31*/("""
                        """),format.raw/*60.25*/("""toolbar: [
                            ["""),format.raw/*61.30*/("""{"""),format.raw/*61.31*/(""" """),format.raw/*61.32*/("""'font': [] """),format.raw/*61.43*/("""}"""),format.raw/*61.44*/("""],
                            ["""),format.raw/*62.30*/("""{"""),format.raw/*62.31*/(""" """),format.raw/*62.32*/("""'size': ['small', false, 'large', 'huge'] """),format.raw/*62.74*/("""}"""),format.raw/*62.75*/("""],  // custom dropdown
                            ['bold', 'italic', 'underline', 'strike'],        // toggled buttons
                            ["""),format.raw/*64.30*/("""{"""),format.raw/*64.31*/(""" """),format.raw/*64.32*/("""'color': [] """),format.raw/*64.44*/("""}"""),format.raw/*64.45*/(""", """),format.raw/*64.47*/("""{"""),format.raw/*64.48*/(""" """),format.raw/*64.49*/("""'background': [] """),format.raw/*64.66*/("""}"""),format.raw/*64.67*/("""],          // dropdown with defaults from theme
                            ['blockquote'],

                            ["""),format.raw/*67.30*/("""{"""),format.raw/*67.31*/(""" """),format.raw/*67.32*/("""'list': 'ordered'"""),format.raw/*67.49*/("""}"""),format.raw/*67.50*/(""", """),format.raw/*67.52*/("""{"""),format.raw/*67.53*/(""" """),format.raw/*67.54*/("""'list': 'bullet' """),format.raw/*67.71*/("""}"""),format.raw/*67.72*/("""],
                            ["""),format.raw/*68.30*/("""{"""),format.raw/*68.31*/(""" """),format.raw/*68.32*/("""'script': 'sub'"""),format.raw/*68.47*/("""}"""),format.raw/*68.48*/(""", """),format.raw/*68.50*/("""{"""),format.raw/*68.51*/(""" """),format.raw/*68.52*/("""'script': 'super' """),format.raw/*68.70*/("""}"""),format.raw/*68.71*/("""],      // superscript/subscript
                            ["""),format.raw/*69.30*/("""{"""),format.raw/*69.31*/(""" """),format.raw/*69.32*/("""'indent': '-1'"""),format.raw/*69.46*/("""}"""),format.raw/*69.47*/(""", """),format.raw/*69.49*/("""{"""),format.raw/*69.50*/(""" """),format.raw/*69.51*/("""'indent': '+1' """),format.raw/*69.66*/("""}"""),format.raw/*69.67*/("""],          // outdent/indent
                            ["""),format.raw/*70.30*/("""{"""),format.raw/*70.31*/(""" """),format.raw/*70.32*/("""'direction': 'rtl' """),format.raw/*70.51*/("""}"""),format.raw/*70.52*/("""],                         // text directio
                            ["""),format.raw/*71.30*/("""{"""),format.raw/*71.31*/(""" """),format.raw/*71.32*/("""'align': [] """),format.raw/*71.44*/("""}"""),format.raw/*71.45*/("""],
                            ['link', 'image']
                        ]
                    """),format.raw/*74.21*/("""}"""),format.raw/*74.22*/(""",
                    placeholder: 'Enter project description...',
                    theme: 'snow'
                """),format.raw/*77.17*/("""}"""),format.raw/*77.18*/(""");

                var limit = projectDescriptionMaxLength;
                quill.on('text-change', function (delta, old, source) """),format.raw/*80.71*/("""{"""),format.raw/*80.72*/("""
                    """),format.raw/*81.21*/("""if (quill.getLength() > limit+1) """),format.raw/*81.54*/("""{"""),format.raw/*81.55*/("""
                        """),format.raw/*82.25*/("""document.getElementById("descriptionMsg").innerHTML = "Field should be no longer than "+ limit +" characters";
                    """),format.raw/*83.21*/("""}"""),format.raw/*83.22*/("""else"""),format.raw/*83.26*/("""{"""),format.raw/*83.27*/("""
                        """),format.raw/*84.25*/("""document.getElementById("descriptionMsg").innerHTML = "";
                    """),format.raw/*85.21*/("""}"""),format.raw/*85.22*/("""
                """),format.raw/*86.17*/("""}"""),format.raw/*86.18*/(""");

                quill.clipboard.dangerouslyPasteHTML(entityToString());
              //  $("#description").val();
                $("#addPanel").hide();
                $("#previewPanel").hide();
                if($("#showImg").attr("src") == "") """),format.raw/*92.53*/("""{"""),format.raw/*92.54*/("""
                    """),format.raw/*93.21*/("""$("#projectPreview").hide();
                """),format.raw/*94.17*/("""}"""),format.raw/*94.18*/("""
                """),format.raw/*95.17*/("""$("#showPanel").click(function () """),format.raw/*95.51*/("""{"""),format.raw/*95.52*/("""
                    """),format.raw/*96.21*/("""var panel = document.getElementById("addPanel");
                    if (panel.style.display == "none") """),format.raw/*97.56*/("""{"""),format.raw/*97.57*/("""
                        """),format.raw/*98.25*/("""$("#btnName").attr("style", "transform:rotate(-45deg);transition:transform 0.3s linear;");
                        $("#buttonText").text("Close Window");
                    """),format.raw/*100.21*/("""}"""),format.raw/*100.22*/("""
                    """),format.raw/*101.21*/("""else """),format.raw/*101.26*/("""{"""),format.raw/*101.27*/("""
                        """),format.raw/*102.25*/("""$("#btnName").attr("style", "transform:rotate(0deg);transition:transform 0.3s linear;");
                        $("#buttonText").text("Add Members");
                        document.getElementById("memberName").value = "";
                        document.getElementById("email").value = "";
                        document.getElementById("email").classList.remove("invalid");
                        document.getElementById("memberName").classList.remove("invalid");
                    """),format.raw/*108.21*/("""}"""),format.raw/*108.22*/("""
                    """),format.raw/*109.21*/("""$("#addPanel").slideToggle();

                """),format.raw/*111.17*/("""}"""),format.raw/*111.18*/(""");


                //preview the updated image
                $("#addmember").click(function changepic() """),format.raw/*115.60*/("""{"""),format.raw/*115.61*/("""
                    """),format.raw/*116.21*/("""if (document.getElementById("memberName").value.trim().length==0)"""),format.raw/*116.86*/("""{"""),format.raw/*116.87*/("""
                        """),format.raw/*117.25*/("""document.getElementById("memberName").classList.add("invalid");
                    """),format.raw/*118.21*/("""}"""),format.raw/*118.22*/("""
                    """),format.raw/*119.21*/("""if (document.getElementById("email").value.trim().length==0)"""),format.raw/*119.81*/("""{"""),format.raw/*119.82*/("""
                        """),format.raw/*120.25*/("""document.getElementById("email").classList.add("invalid");
                    """),format.raw/*121.21*/("""}"""),format.raw/*121.22*/("""
                    """),format.raw/*122.21*/("""// document.getElementById("email").value.trim().length()==0;
                    var isName = document.getElementById("memberName").classList.contains("invalid") ? false : true;
                    var isEmail = document.getElementById("email").classList.contains("invalid") ? false : true;

                    if(!isName || !isEmail) return;
                    if (document.getElementById("photo").value == "") """),format.raw/*127.71*/("""{"""),format.raw/*127.72*/("""
                        """),format.raw/*128.25*/("""var url = "../../../../assets/images/person.jpg";
                        showPreview(url);
                        return;
                    """),format.raw/*131.21*/("""}"""),format.raw/*131.22*/("""
                    """),format.raw/*132.21*/("""var reads = new FileReader();
                    f = document.getElementById("photo").files[0];
                    reads.readAsDataURL(f);
                    reads.onload = function (e) """),format.raw/*135.49*/("""{"""),format.raw/*135.50*/("""
                        """),format.raw/*136.25*/("""showPreview(this.result);

                    """),format.raw/*138.21*/("""}"""),format.raw/*138.22*/(""";
                """),format.raw/*139.17*/("""}"""),format.raw/*139.18*/(""");
                document.body.scrollTop = document.documentElement.scrollTop = 0;
            """),format.raw/*141.13*/("""}"""),format.raw/*141.14*/(""");

            function entityToString()"""),format.raw/*143.38*/("""{"""),format.raw/*143.39*/("""
                """),format.raw/*144.17*/("""var div=document.createElement('div');
                """),_display_(/*145.18*/if(project.getDescription!=null)/*145.50*/{_display_(Seq[Any](format.raw/*145.51*/("""
                    """),format.raw/*146.21*/("""div.innerHTML = """"),_display_(/*146.39*/project/*146.46*/.getDescription),format.raw/*146.61*/("""";
                """)))}),format.raw/*147.18*/("""
                """),format.raw/*148.17*/("""var res=div.innerText||div.textContent;
                return res;
            """),format.raw/*150.13*/("""}"""),format.raw/*150.14*/("""

            """),format.raw/*152.13*/("""function getHTML() //display current HTML
            """),format.raw/*153.13*/("""{"""),format.raw/*153.14*/("""
                """),format.raw/*154.17*/("""if(document.getElementById("descriptionMsg").innerText.length != 0)
                    return false;
                console.log(Number.isInteger('fjidsao'));
                //console.log("isnan:" + isNaN($("#challengeCreator").text());
                var cid = $("#challengeCreator").val()
                console.log("cid" + $("#challengeCreator").val());
                console.log("typeof" + typeof($("#challengeCreator").val()));

                if(isNaN(cid))"""),format.raw/*162.31*/("""{"""),format.raw/*162.32*/("""
                    """),format.raw/*163.21*/("""//document.getElementById(urlMsgId).setAttribute('data-error', msg);
                    console.log("cidddMSg:" + $("#challengeCreatorMsg").text())
                    $("#challengeCreatorMsg").text("Please specify correct id format");

                    return false;
                """),format.raw/*168.17*/("""}"""),format.raw/*168.18*/("""
                """),format.raw/*169.17*/("""exist = false;
                $.ajax("""),format.raw/*170.24*/("""{"""),format.raw/*170.25*/("""
                    """),format.raw/*171.21*/("""url: "/user/allUserIds",
                    headers: """),format.raw/*172.30*/("""{"""),format.raw/*172.31*/("""
                        """),format.raw/*173.25*/("""'Content-Type': 'application/json'
                    """),format.raw/*174.21*/("""}"""),format.raw/*174.22*/(""",
                    async: false,
                    type: "GET"
                """),format.raw/*177.17*/("""}"""),format.raw/*177.18*/(""").done(function (data) """),format.raw/*177.41*/("""{"""),format.raw/*177.42*/("""
                    """),format.raw/*178.21*/("""console.log("data:" + data)
                    console.log("id:" + cid)
                    for(i in data)"""),format.raw/*180.35*/("""{"""),format.raw/*180.36*/("""
                        """),format.raw/*181.25*/("""console.log(Number(data[i]) + "," + Number(cid))
                        if(Number(data[i]) == Number(cid))"""),format.raw/*182.59*/("""{"""),format.raw/*182.60*/("""
                            """),format.raw/*183.29*/("""exist = true;
                            console.log("loop:" + exist);
                        """),format.raw/*185.25*/("""}"""),format.raw/*185.26*/("""
                    """),format.raw/*186.21*/("""}"""),format.raw/*186.22*/("""

                """),format.raw/*188.17*/("""}"""),format.raw/*188.18*/(""");
                console.log("out" + exist)
                if(!exist)"""),format.raw/*190.27*/("""{"""),format.raw/*190.28*/("""
                    """),format.raw/*191.21*/("""$("#challengeCreatorMsg").text("This user does not exist!");
                    return false;
                """),format.raw/*193.17*/("""}"""),format.raw/*193.18*/("""
                """),format.raw/*194.17*/("""$("#editor").find("img").each(function () """),format.raw/*194.59*/("""{"""),format.raw/*194.60*/("""
                   """),format.raw/*195.20*/("""if($(this).attr("width") == null) """),format.raw/*195.54*/("""{"""),format.raw/*195.55*/("""
                       """),format.raw/*196.24*/("""// If this is a new image
                       var img = this;
                       var dataurl = $(this).attr("src");
                       var arr = dataurl.split(','), mime = arr[0].match(/:(.*?);/)[1],
                            bstr = atob(arr[1]), n = bstr.length, u8arr = new Uint8Array(n);
                       while (n--) """),format.raw/*201.36*/("""{"""),format.raw/*201.37*/("""
                           """),format.raw/*202.28*/("""u8arr[n] = bstr.charCodeAt(n);
                       """),format.raw/*203.24*/("""}"""),format.raw/*203.25*/("""
                       """),format.raw/*204.24*/("""var f = new File([u8arr], "file", """),format.raw/*204.58*/("""{"""),format.raw/*204.59*/("""type: mime"""),format.raw/*204.69*/("""}"""),format.raw/*204.70*/(""");
                       var fd = new FormData();
                       fd.append('file', f);
                       countImagesInDescription ++;
                       $.ajax("""),format.raw/*208.31*/("""{"""),format.raw/*208.32*/("""
                           """),format.raw/*209.28*/("""url: "/project/uploadDescriptionImg/"""),_display_(/*209.65*/project/*209.72*/.getId),format.raw/*209.78*/("""/" + (countImagesInDescription-1) ,
                           data: fd,
                           contentType: false,
                           dataType: "text",
                           processData: false,
                           async: false,
                           type: "POST",
                           success: function (data) """),format.raw/*216.53*/("""{"""),format.raw/*216.54*/("""
                               """),format.raw/*217.32*/("""console.log(data);
                               $(img).attr("src", data);
                               $(img).attr("width", "50%");
                           """),format.raw/*220.28*/("""}"""),format.raw/*220.29*/(""",
                           error: function (msg) """),format.raw/*221.50*/("""{"""),format.raw/*221.51*/("""
                               """),format.raw/*222.32*/("""console.log("123123123");
                           """),format.raw/*223.28*/("""}"""),format.raw/*223.29*/("""
                       """),format.raw/*224.24*/("""}"""),format.raw/*224.25*/(""");
                   """),format.raw/*225.20*/("""}"""),format.raw/*225.21*/("""
               """),format.raw/*226.16*/("""}"""),format.raw/*226.17*/(""");

                var ajaxflag = true;
                var parentProjectId = $("#parentProjectId").val();
                if(parentProjectId !== "0") """),format.raw/*230.45*/("""{"""),format.raw/*230.46*/("""
                    """),format.raw/*231.21*/("""$.ajax("""),format.raw/*231.28*/("""{"""),format.raw/*231.29*/("""
                        """),format.raw/*232.25*/("""url: "/project/checkParentProject/" + parentProjectId,
                        async: false,
                        headers: """),format.raw/*234.34*/("""{"""),format.raw/*234.35*/("""
                            """),format.raw/*235.29*/("""'Content-Type': 'application/json'
                        """),format.raw/*236.25*/("""}"""),format.raw/*236.26*/(""",
                        type: "GET",
                        success: function (data) """),format.raw/*238.50*/("""{"""),format.raw/*238.51*/("""
                            """),format.raw/*239.29*/("""var response = data;
                            console.log(data);
                            if ('badFormat' in response) """),format.raw/*241.58*/("""{"""),format.raw/*241.59*/("""
                                """),format.raw/*242.33*/("""console.log(response['badFormat']);
                                $("#parentProjectIdMsg").text(response['badFormat']);
                                ajaxflag = false;
                            """),format.raw/*245.29*/("""}"""),format.raw/*245.30*/(""" """),format.raw/*245.31*/("""else """),format.raw/*245.36*/("""{"""),format.raw/*245.37*/("""
                                """),format.raw/*246.33*/("""if ('notExisted' in response) """),format.raw/*246.63*/("""{"""),format.raw/*246.64*/("""
                                    """),format.raw/*247.37*/("""$("#parentProjectIdMsg").text(response['notExisted']);
                                    ajaxflag = false;
                                """),format.raw/*249.33*/("""}"""),format.raw/*249.34*/(""" """),format.raw/*249.35*/("""else """),format.raw/*249.40*/("""{"""),format.raw/*249.41*/("""

                                """),format.raw/*251.33*/("""}"""),format.raw/*251.34*/("""

                            """),format.raw/*253.29*/("""}"""),format.raw/*253.30*/("""
                        """),format.raw/*254.25*/("""}"""),format.raw/*254.26*/("""
                    """),format.raw/*255.21*/("""}"""),format.raw/*255.22*/(""");
                """),format.raw/*256.17*/("""}"""),format.raw/*256.18*/("""
                """),format.raw/*257.17*/("""if(!ajaxflag)"""),format.raw/*257.30*/("""{"""),format.raw/*257.31*/("""
                    """),format.raw/*258.21*/("""return false;
                """),format.raw/*259.17*/("""}"""),format.raw/*259.18*/("""

               """),format.raw/*261.16*/("""var html = quill.root.innerHTML;
               $("#description").val(html);
               $("#countImagesInDescription").val(countImagesInDescription);




                return true;
            """),format.raw/*269.13*/("""}"""),format.raw/*269.14*/("""

            """),format.raw/*271.13*/("""function showProPreview(obj) """),format.raw/*271.42*/("""{"""),format.raw/*271.43*/("""
                """),format.raw/*272.17*/("""if($("#showImg").attr("src") == "") """),format.raw/*272.53*/("""{"""),format.raw/*272.54*/("""
                    """),format.raw/*273.21*/("""$("#deleteBtn").hide();
                """),format.raw/*274.17*/("""}"""),format.raw/*274.18*/("""
                """),format.raw/*275.17*/("""else """),format.raw/*275.22*/("""{"""),format.raw/*275.23*/("""
                    """),format.raw/*276.21*/("""$("#deleteBtn").show();
                    //$('#previewMsg').text("");
                """),format.raw/*278.17*/("""}"""),format.raw/*278.18*/("""
                    """),format.raw/*279.21*/("""var panel = document.getElementById("previewPanel");
                    if (panel.style.display == "none") """),format.raw/*280.56*/("""{"""),format.raw/*280.57*/("""
                        """),format.raw/*281.25*/("""$(obj).text("Close Preview");
                    """),format.raw/*282.21*/("""}"""),format.raw/*282.22*/("""
                    """),format.raw/*283.21*/("""else """),format.raw/*283.26*/("""{"""),format.raw/*283.27*/("""
                        """),format.raw/*284.25*/("""$(obj).text("Preview Or Delete Picture");
                    """),format.raw/*285.21*/("""}"""),format.raw/*285.22*/("""
                    """),format.raw/*286.21*/("""$("#previewPanel").slideToggle();

            """),format.raw/*288.13*/("""}"""),format.raw/*288.14*/("""

            """),format.raw/*290.13*/("""function deleteMember(obj) """),format.raw/*290.40*/("""{"""),format.raw/*290.41*/("""
                """),format.raw/*291.17*/("""var tr  = $(obj).parent().parent();
                if(tr.attr("id") != null) """),format.raw/*292.43*/("""{"""),format.raw/*292.44*/("""
                    """),format.raw/*293.21*/("""tr.append("<td style='display: none;' > <input name ='delete" + delc + "' value='" + tr.attr("id") + "'></td>")
                    //tr.attr("name", "delete" + delc);
                    delc++;
                    $("#delc").val(delc);
                    tr.hide();
                """),format.raw/*298.17*/("""}"""),format.raw/*298.18*/("""
                """),format.raw/*299.17*/("""else tr.remove();
            """),format.raw/*300.13*/("""}"""),format.raw/*300.14*/("""
            """),format.raw/*301.13*/("""function showPreview(url) """),format.raw/*301.39*/("""{"""),format.raw/*301.40*/("""
                """),format.raw/*302.17*/("""if($("#memberName").val() == "")"""),format.raw/*302.49*/("""{"""),format.raw/*302.50*/("""
                    """),format.raw/*303.21*/("""$("#msg").text("Member Name cannot be null.");
                    document.getElementById("addmember").disabled = true;
                    return;
                """),format.raw/*306.17*/("""}"""),format.raw/*306.18*/("""
                """),format.raw/*307.17*/("""$("#msg").text("");
                document.getElementById("addmember").disabled = false;
                var appendItem = "<tr><td><img src=\"" + url + "\" height='35px' style=\"width:35px;border-radius:50%;\"</td>" +
                        "<td>" + $("#memberName").val() + "<input type=\"text\" name='member" + count + "' id='member" + count + "' value=\""+ $("#memberName").val() +"\" style=\"display: none;\"></td>" +
                        "<td>" + $("#email").val() + "<input type=\"text\" name='email" + count + "' id='email" + count + "' value=\""+ $("#email").val() +"\" style=\"display: none;\"></td>" +
                        "<td><a href='javascript:void(0)' onclick='deleteMember(this)'><i style='color:red;' class=\"material-icons\">delete</i></a></td><td id='clone"+count+"'></td></tr>";
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
            """),format.raw/*326.13*/("""}"""),format.raw/*326.14*/("""

            """),format.raw/*328.13*/("""//preview the updated image
            function changProjectPic() """),format.raw/*329.40*/("""{"""),format.raw/*329.41*/("""
                """),format.raw/*330.17*/("""if(document.getElementById("picture").value == "") return;
                var reads = new FileReader();
                f = document.getElementById("picture").files[0];
                reads.readAsDataURL(f);
                reads.onload = function(e) """),format.raw/*334.44*/("""{"""),format.raw/*334.45*/("""
                    """),format.raw/*335.21*/("""document.getElementById('showImg').src = this.result;
                    $('#record').val("update");
                    $('#previewMsg').text("This is the preview image. You need to click \"UPDATE\" button below if you want to save the changes.");
                    $("#deleteBtn").show();
                    $("#projectPreview").show();
                """),format.raw/*340.17*/("""}"""),format.raw/*340.18*/(""";
            """),format.raw/*341.13*/("""}"""),format.raw/*341.14*/("""

            """),format.raw/*343.13*/("""function deleteImg() """),format.raw/*343.34*/("""{"""),format.raw/*343.35*/("""
                """),format.raw/*344.17*/("""document.getElementById('showImg').src = "";
                $('#record').val("delete");
                $("#deleteBtn").hide();
                $("#projectPreview").hide();
                showProPreview("#projectPreview");
                $('#previewMsg').text("The image is deleted. You need to click \"UPDATE\" button below if you want to save the changes.");
            """),format.raw/*350.13*/("""}"""),format.raw/*350.14*/("""

            """),format.raw/*352.13*/("""function deletePDF() """),format.raw/*352.34*/("""{"""),format.raw/*352.35*/("""
                """),format.raw/*353.17*/("""document.getElementById('showImg').src = "";
                $('#pdfRecord').val("delete");
                $("#pdfDeleteBtn").hide();
                $("#pdfDownload").hide();
                $('#pdfPreviewMsg').text("The PDF is deleted. You need to click \"UPDATE\" button below if you want to save the changes.");
            """),format.raw/*358.13*/("""}"""),format.raw/*358.14*/("""

            """),format.raw/*360.13*/("""function markAsPrivate() """),format.raw/*360.38*/("""{"""),format.raw/*360.39*/("""

            """),format.raw/*362.13*/("""}"""),format.raw/*362.14*/("""


    """),format.raw/*365.5*/("""</script>
""")))};
Seq[Any](format.raw/*1.20*/("""
"""),format.raw/*4.1*/("""    """),format.raw/*5.1*/("""
"""),format.raw/*366.2*/("""

"""),_display_(/*368.2*/main("Project Edit", scripts)/*368.31*/ {_display_(Seq[Any](format.raw/*368.33*/("""

    """),format.raw/*370.5*/("""<link href='"""),_display_(/*370.18*/routes/*370.24*/.Assets.at("stylesheets/quill.snow.css")),format.raw/*370.64*/("""'
    rel="stylesheet" />
    <script type="text/javascript" src='"""),_display_(/*372.42*/routes/*372.48*/.Assets.at("javascripts/plugins/quill.js")),format.raw/*372.90*/("""'></script>

    <div class="container">
        <div class="row">
            <div class="col  s12 m10 offset-m1">
                <div class="card-panel">
                    <h4 class="center form-signin-heading" align="center">
                        Edit Project Information</h4>
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
                    <form class="form-signin" enctype="multipart/form-data" id="editProjectForm" method="post" onsubmit="return getHTML()" action=""""),_display_(/*394.149*/routes/*394.155*/.ProjectController.projectEditPOST(project.getId)),format.raw/*394.204*/("""">
                        <div id="hiddenDiv" style="display: none;">
                            <input name="id" id="id" class="validate" value=""""),_display_(/*396.79*/project/*396.86*/.getId),format.raw/*396.92*/("""">
                            <input name="isActive" id="isActive" class="validate" value=""""),_display_(/*397.91*/project/*397.98*/.getIsActive),format.raw/*397.110*/("""">
                            <input name="isPopular" id="isPopular" class="validate" value=""""),_display_(/*398.93*/project/*398.100*/.getIsPopular),format.raw/*398.113*/("""">
                            <input name="popularRanking" id="popularRanking" class="validate" value=""""),_display_(/*399.103*/project/*399.110*/.getPopularRanking),format.raw/*399.128*/("""">
                            <input name="authentication" id="authentication" class="validate" value=""""),_display_(/*400.103*/project/*400.110*/.getAuthentication),format.raw/*400.128*/("""">
                            <input name="accessTimes" id="accessTimes" class="validate" value=""""),_display_(/*401.97*/project/*401.104*/.getAccessTimes),format.raw/*401.119*/("""">
                            <input name="nextImageIndex" id="nextImageIndex" class="validate" value=""""),_display_(/*402.103*/project/*402.110*/.getNextImageIndex),format.raw/*402.128*/("""">
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="title" id="title" class="validate" value=""""),_display_(/*407.94*/project/*407.101*/.getTitle),format.raw/*407.110*/("""" required>
                                <label for="title">Title* </label>
                                <span id="titleMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input type="text" name="goals" id="goals"  class="validate" required value=""""),_display_(/*414.111*/project/*414.118*/.getGoals),format.raw/*414.127*/("""">
                                <label for="goals">
                                    Goals* </label>
                                <span id="goalsMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="location" id="location" value = """"),_display_(/*423.85*/project/*423.92*/.getLocation),format.raw/*423.104*/(""""  class="validate" required>
                                <label for="location">
                                    Location* </label>
                                <span id="locationMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="challengeCreator" id="challengeCreator" value = """"),_display_(/*432.101*/project/*432.108*/.getSponsorContact.getId),format.raw/*432.132*/(""""  class="validate" onchange="checkCreator()" required>
                                <label for="location">
                                    Creator ID* (Change the ownership of this project. Please note that you will not have edit access if you transfer it out.)</label>
                                <span id="challengeCreatorMsg" style="color:red" class="helper-text" data-error=""></span>
                            </div>
                        </div>




                        <div class="row">
                            <div class="col s12">
                                <p style="color: #000;">
                                    Team Members: <a id="showPanel" class="close" href="javascript:void(0)" style="float: right;
                                    color: #000;"><i id="btnName" class="material-icons">
                                    add</i>
                                </a><a id="buttonText" style="float: right;">Edit Members</a></p>
                            </div>
                            <div id="addPanel" style="display: inline-block;">
                                <div class="col s1"><input type="text" name="count" id="count" value="0" style="display: none;"> </div>
                                <div class="col s1"><input type="text" name="delc" id="delc" value="0" style="display: none;"> </div>
                                <div class="col s10">
                                    <div class="input-field col s12">
                                        <input
                                        type="text" name="memberName" id="memberName" class="validate">
                                        <label for="memberName">Member Name</label>
                                        <span id="memberNameMsg" class="helper-text" data-error=""></span>
                                    </div>
                                    <div class="input-field col s12">
                                        <input type="email" name="email" id="email" class="validate">
                                        <label for="email">Email</label>
                                        <span id="emailMsg" class="helper-text" data-error=""></span>
                                    </div>
                                    <div class="file-field input-field col s12" >
                                        <div class="btn waves-effect waves-light blue darken-2" >
                                            <span >Upload Member Photo</span>
                                            <input type="file" accept=".jpeg,.png,.jpg" id="photo" name="photo">
                                        </div>
                                        <div class="file-path-wrapper">
                                            <input id="showpath" class="file-path validate" type="text">
                                        </div>
                                    </div>
                                    <div class="center input-field col s12">
                                        <a id="addmember" class="btn waves-effect waves-light blue darken-2">
                                            Add Member</a>

                                    </div>

                                </div>
                            </div>
                            <div class="col s12">
                                <Table class="highlight">
                                    <tbody id="previewTable">
                                        """),_display_(/*485.42*/if(project.getTeamMembers!=null)/*485.74*/ {_display_(Seq[Any](format.raw/*485.76*/("""
                                            """),_display_(/*486.46*/for(teamMember <- project.getTeamMembers) yield /*486.87*/ {_display_(Seq[Any](format.raw/*486.89*/("""
                                                """),format.raw/*487.49*/("""<tr id=""""),_display_(/*487.58*/teamMember/*487.68*/.getId),format.raw/*487.74*/("""">
                                                    <td><img src=""""),_display_(/*488.68*/teamMember/*488.78*/.getAvatar),format.raw/*488.88*/("""" style="height: 35px;
                                                        width: 35px;
                                                        border-radius: 50%;"></img>
                                                    </td>
                                                    <td>"""),_display_(/*492.58*/teamMember/*492.68*/.getUserName()),format.raw/*492.82*/("""</td>
                                                    <td>"""),_display_(/*493.58*/if(teamMember.getEmail() == "" || teamMember.getEmail() == null)/*493.122*/ {_display_(Seq[Any](format.raw/*493.124*/("""
                                                        """),format.raw/*494.57*/("""-
                                                    """)))}/*495.55*/else/*495.60*/{_display_(Seq[Any](format.raw/*495.61*/("""
                                                        """),_display_(/*496.58*/teamMember/*496.68*/.getEmail()),format.raw/*496.79*/("""
                                                    """)))}),format.raw/*497.54*/("""</td>
                                                    <td><a href='javascript:void(0)' onclick='deleteMember(this)'><i style='color: red;' class="material-icons">delete</i></a></td>
                                                </tr>
                                            """)))}),format.raw/*500.46*/("""
                                        """)))}),format.raw/*501.42*/("""
                                    """),format.raw/*502.37*/("""</tbody>
                                </Table>
                            </div>
                        </div>

                        <div class="row">
                            <div class="input-field col s12">
                                <input type="text" name="tech" id="tech" class="validate" value=""""),_display_(/*509.99*/project/*509.106*/.getTechnology),format.raw/*509.120*/("""">
                                <label for="tech">
                                    Technologies Used </label>
                                <span id="techMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>

                        <div class="row">

                            <div class="file-field input-field col s12" >
                                <div class="btn waves-effect waves-light blue darken-2" >
                                    <span >Change Project Picture</span>
                                    <input type="file" accept=".jpeg,.png,.jpg" id="picture" name="picture" onchange="changProjectPic()">
                                </div>
                                <div class="file-path-wrapper">
                                    <input class="file-path validate" type="text">
                                </div>

                                <div id="previewMsg" style="color:blue"></div>
                                """),_display_(/*528.34*/if(project.getImageUrl != null && project.getImageUrl != "")/*528.94*/ {_display_(Seq[Any](format.raw/*528.96*/("""
                                    """),format.raw/*529.37*/("""<div>
                                        <a href="javascript:void(0)" id="projectPreview" onclick="showProPreview(this)">
                                            Preview Or Delete Picture</a>
                                    </div>
                                """)))}),format.raw/*533.34*/("""
                            """),format.raw/*534.29*/("""</div>
                            <div id="previewPanel" class="center" style="display: inline-block; text-align: center;">
                                <img id="showImg" src=""""),_display_(/*536.57*/project/*536.64*/.getImageUrl),format.raw/*536.76*/("""" width="360" height="350" style="height: auto;
                                    width: 80%;" >
                                <a id = "deleteBtn" class="btn waves-effect waves-light red darken-2" onclick="deleteImg()">
                                    Delete Picture</a>
                                <input id="record" name = "record" style="display: none;"/>
                            </div>
                        </div>

                        <div class="row">
                            <div class="file-field input-field col s12" >
                                <div class="btn waves-effect waves-light blue darken-2" >
                                    <span >Change Project PDF</span>
                                    <input type="file" accept=".pdf" id="pdf" name="pdf">
                                </div>
                                <div class="file-path-wrapper">
                                    <input class="file-path validate" type="text">
                                </div>
                                <div id="pdfPreviewMsg" style="color:blue"></div>
                                """),_display_(/*554.34*/if(project.getPdf != null && project.getPdf != "")/*554.84*/ {_display_(Seq[Any](format.raw/*554.86*/("""
                                        """),format.raw/*555.41*/("""<a id="pdfDownload" href=""""),_display_(/*555.68*/project/*555.75*/.getPdf),format.raw/*555.82*/("""">
                                            Download Current Project PDF</a>
                                        <a id = "pdfDeleteBtn" class="right" href="#" style="color: red;" onclick="deletePDF()">
                                            <i class="material-icons">cross</i> Delete Current PDF</a>
                                """)))}),format.raw/*559.34*/("""
                                """),format.raw/*560.33*/("""<input id="pdfRecord" name = "pdfRecord" style="display: none;"/>
                            </div>
                        </div>

                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="video" id="video" value=""""),_display_(/*567.77*/project/*567.84*/.getVideoUrl),format.raw/*567.96*/("""" class="validate">
                                <label for="video">
                                    Video URL </label>
                                <span id="videoMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="github" id="github" value = """"),_display_(/*576.81*/project/*576.88*/.getGithubUrl),format.raw/*576.101*/("""" class="validate">
                                <label for="github">
                                    Github URL </label>
                                <span id="githubMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="team_page" id="team_page" value = """"),_display_(/*585.87*/project/*585.94*/.getTeamPageUrl),format.raw/*585.109*/("""">
                                <label for="team_page">
                                    Team Page URL </label>
                                <span id="team_pageMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>

                        <div class="row">
                            <div class="input-field col s12">
                                <p style="color: #000;">Description: </p>
                                <div id="editor">
                                </div>
                                <span id="descriptionMsg" class="helper-text" data-error="" style="color: red; font-size: 12px"></span>
                                <textarea
                                class="materialize-textarea" name="description" style="display: none" id="description">
                                </textarea>

                            </div>
                        </div>

                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="parentProjectId" id="parentProjectId" value = """"),_display_(/*608.99*/project/*608.106*/.getParentProjectId),format.raw/*608.125*/("""" class="validate">
                                <label for="parentProjectId">
                                    Parent Project Id</label>
                                <span id="parentProjectIdMsg" class="helper-text" style="color:red" data-error=""></span>
                            </div>
                        </div>


                        <div class="actions row center">
                            <div class="input-field col s12">
                                <button type="submit" id="projectRegister" class="btn waves-effect waves-light blue darken-2">
                                    Update</button>
                                <a href=""""),_display_(/*620.43*/routes/*620.49*/.ProjectController.projectDetail(project.getId)),format.raw/*620.96*/("""" class="btn waves-effect waves-light red darken-2">
                                    Cancel</a>

                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>

""")))}),format.raw/*631.2*/("""
"""))
      }
    }
  }

  def render(project:Project): play.twirl.api.HtmlFormat.Appendable = apply(project)

  def f:((Project) => play.twirl.api.HtmlFormat.Appendable) = (project) => apply(project)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:34 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/projectEdit.scala.html
                  HASH: 8c6bdb81c18d17e67f1f0c217df9ecb693402e40
                  MATRIX: 1118->1|1209->21|1232->38|1255->59|1289->83|1303->90|1383->94|1414->99|1464->122|1492->123|1536->140|1597->173|1626->174|1667->187|1698->190|1727->191|1772->208|1832->240|1861->241|1902->254|1947->271|1976->272|2021->289|2079->319|2108->320|2149->333|2185->341|2214->342|2259->359|2314->386|2343->387|2375->392|2452->442|2467->448|2538->498|2618->551|2633->557|2707->609|2899->774|2915->781|2954->799|3043->860|3072->861|3117->878|3243->976|3272->977|3313->990|3371->1020|3400->1021|3445->1038|4512->2078|4528->2085|4573->2109|4666->2174|4695->2175|4744->2196|4829->2253|4858->2254|4951->2319|4980->2320|5029->2341|5117->2401|5146->2402|5222->2450|5251->2451|5300->2472|5337->2481|5366->2482|5419->2507|5487->2547|5516->2548|5545->2549|5584->2560|5613->2561|5673->2593|5702->2594|5731->2595|5801->2637|5830->2638|6007->2787|6036->2788|6065->2789|6105->2801|6134->2802|6164->2804|6193->2805|6222->2806|6267->2823|6296->2824|6447->2947|6476->2948|6505->2949|6550->2966|6579->2967|6609->2969|6638->2970|6667->2971|6712->2988|6741->2989|6801->3021|6830->3022|6859->3023|6902->3038|6931->3039|6961->3041|6990->3042|7019->3043|7065->3061|7094->3062|7184->3124|7213->3125|7242->3126|7284->3140|7313->3141|7343->3143|7372->3144|7401->3145|7444->3160|7473->3161|7560->3220|7589->3221|7618->3222|7665->3241|7694->3242|7795->3315|7824->3316|7853->3317|7893->3329|7922->3330|8045->3425|8074->3426|8219->3543|8248->3544|8407->3675|8436->3676|8485->3697|8546->3730|8575->3731|8628->3756|8787->3887|8816->3888|8848->3892|8877->3893|8930->3918|9036->3996|9065->3997|9110->4014|9139->4015|9420->4268|9449->4269|9498->4290|9571->4335|9600->4336|9645->4353|9707->4387|9736->4388|9785->4409|9917->4513|9946->4514|9999->4539|10202->4713|10232->4714|10282->4735|10316->4740|10346->4741|10400->4766|10920->5257|10950->5258|11000->5279|11076->5326|11106->5327|11243->5435|11273->5436|11323->5457|11417->5522|11447->5523|11501->5548|11614->5632|11644->5633|11694->5654|11783->5714|11813->5715|11867->5740|11975->5819|12005->5820|12055->5841|12499->6256|12529->6257|12583->6282|12756->6426|12786->6427|12836->6448|13054->6637|13084->6638|13138->6663|13214->6710|13244->6711|13291->6729|13321->6730|13447->6827|13477->6828|13547->6869|13577->6870|13623->6887|13707->6943|13749->6975|13789->6976|13839->6997|13885->7015|13902->7022|13939->7037|13991->7057|14037->7074|14146->7154|14176->7155|14219->7169|14302->7223|14332->7224|14378->7241|14877->7711|14907->7712|14957->7733|15274->8021|15304->8022|15350->8039|15417->8077|15447->8078|15497->8099|15580->8153|15610->8154|15664->8179|15748->8234|15778->8235|15891->8319|15921->8320|15973->8343|16003->8344|16053->8365|16189->8472|16219->8473|16273->8498|16409->8605|16439->8606|16497->8635|16622->8731|16652->8732|16702->8753|16732->8754|16779->8772|16809->8773|16910->8845|16940->8846|16990->8867|17130->8978|17160->8979|17206->8996|17277->9038|17307->9039|17356->9059|17419->9093|17449->9094|17502->9118|17870->9457|17900->9458|17957->9486|18040->9540|18070->9541|18123->9565|18186->9599|18216->9600|18255->9610|18285->9611|18492->9789|18522->9790|18579->9818|18644->9855|18661->9862|18689->9868|19064->10214|19094->10215|19155->10247|19347->10410|19377->10411|19457->10462|19487->10463|19548->10495|19630->10548|19660->10549|19713->10573|19743->10574|19794->10596|19824->10597|19869->10613|19899->10614|20080->10766|20110->10767|20160->10788|20196->10795|20226->10796|20280->10821|20435->10947|20465->10948|20523->10977|20611->11036|20641->11037|20758->11125|20788->11126|20846->11155|21000->11280|21030->11281|21092->11314|21321->11514|21351->11515|21381->11516|21415->11521|21445->11522|21507->11555|21566->11585|21596->11586|21662->11623|21832->11764|21862->11765|21892->11766|21926->11771|21956->11772|22019->11806|22049->11807|22108->11837|22138->11838|22192->11863|22222->11864|22272->11885|22302->11886|22350->11905|22380->11906|22426->11923|22468->11936|22498->11937|22548->11958|22607->11988|22637->11989|22683->12006|22911->12205|22941->12206|22984->12220|23042->12249|23072->12250|23118->12267|23183->12303|23213->12304|23263->12325|23332->12365|23362->12366|23408->12383|23442->12388|23472->12389|23522->12410|23640->12499|23670->12500|23720->12521|23857->12629|23887->12630|23941->12655|24020->12705|24050->12706|24100->12727|24134->12732|24164->12733|24218->12758|24309->12820|24339->12821|24389->12842|24465->12889|24495->12890|24538->12904|24594->12931|24624->12932|24670->12949|24777->13027|24807->13028|24857->13049|25171->13334|25201->13335|25247->13352|25306->13382|25336->13383|25378->13396|25433->13422|25463->13423|25509->13440|25570->13472|25600->13473|25650->13494|25844->13659|25874->13660|25920->13677|27320->15048|27350->15049|27393->15063|27489->15130|27519->15131|27565->15148|27847->15401|27877->15402|27927->15423|28315->15782|28345->15783|28388->15797|28418->15798|28461->15812|28511->15833|28541->15834|28587->15851|28992->16227|29022->16228|29065->16242|29115->16263|29145->16264|29191->16281|29549->16610|29579->16611|29622->16625|29676->16650|29706->16651|29749->16665|29779->16666|29814->16673|29864->19|29891->54|29921->81|29950->16684|29980->16687|30019->16716|30060->16718|30094->16724|30135->16737|30151->16743|30213->16783|30308->16850|30324->16856|30388->16898|31764->18245|31781->18251|31853->18300|32030->18449|32047->18456|32075->18462|32196->18555|32213->18562|32248->18574|32371->18669|32389->18676|32425->18689|32559->18794|32577->18801|32618->18819|32752->18924|32770->18931|32811->18949|32938->19048|32956->19055|32994->19070|33128->19175|33146->19182|33187->19200|33485->19470|33503->19477|33535->19486|34017->19939|34035->19946|34067->19955|34589->20449|34606->20456|34641->20468|35216->21014|35234->21021|35281->21045|38834->24570|38876->24602|38917->24604|38991->24650|39049->24691|39090->24693|39168->24742|39205->24751|39225->24761|39253->24767|39351->24837|39371->24847|39403->24857|39722->25148|39742->25158|39778->25172|39869->25235|39944->25299|39986->25301|40072->25358|40147->25414|40161->25419|40201->25420|40287->25478|40307->25488|40340->25499|40426->25553|40743->25838|40817->25880|40883->25917|41230->26236|41248->26243|41285->26257|42346->27290|42416->27350|42457->27352|42523->27389|42832->27666|42890->27695|43099->27876|43116->27883|43150->27895|44321->29038|44381->29088|44422->29090|44492->29131|44547->29158|44564->29165|44593->29172|44970->29517|45032->29550|45412->29902|45429->29909|45463->29921|46001->30431|46018->30438|46054->30451|46601->30970|46618->30977|46656->30992|47885->32193|47903->32200|47945->32219|48647->32893|48663->32899|48732->32946|49028->33211
                  LINES: 35->1|38->2|39->3|40->4|42->6|42->6|44->6|45->7|46->8|46->8|47->9|48->10|48->10|49->11|49->11|49->11|50->12|51->13|51->13|52->14|52->14|52->14|53->15|54->16|54->16|55->17|55->17|55->17|56->18|57->19|57->19|58->20|59->21|59->21|59->21|60->22|60->22|60->22|66->28|66->28|66->28|68->30|68->30|69->31|71->33|71->33|72->34|72->34|72->34|73->35|88->50|88->50|88->50|89->51|89->51|90->52|91->53|91->53|92->54|92->54|93->55|94->56|94->56|96->58|96->58|97->59|97->59|97->59|98->60|99->61|99->61|99->61|99->61|99->61|100->62|100->62|100->62|100->62|100->62|102->64|102->64|102->64|102->64|102->64|102->64|102->64|102->64|102->64|102->64|105->67|105->67|105->67|105->67|105->67|105->67|105->67|105->67|105->67|105->67|106->68|106->68|106->68|106->68|106->68|106->68|106->68|106->68|106->68|106->68|107->69|107->69|107->69|107->69|107->69|107->69|107->69|107->69|107->69|107->69|108->70|108->70|108->70|108->70|108->70|109->71|109->71|109->71|109->71|109->71|112->74|112->74|115->77|115->77|118->80|118->80|119->81|119->81|119->81|120->82|121->83|121->83|121->83|121->83|122->84|123->85|123->85|124->86|124->86|130->92|130->92|131->93|132->94|132->94|133->95|133->95|133->95|134->96|135->97|135->97|136->98|138->100|138->100|139->101|139->101|139->101|140->102|146->108|146->108|147->109|149->111|149->111|153->115|153->115|154->116|154->116|154->116|155->117|156->118|156->118|157->119|157->119|157->119|158->120|159->121|159->121|160->122|165->127|165->127|166->128|169->131|169->131|170->132|173->135|173->135|174->136|176->138|176->138|177->139|177->139|179->141|179->141|181->143|181->143|182->144|183->145|183->145|183->145|184->146|184->146|184->146|184->146|185->147|186->148|188->150|188->150|190->152|191->153|191->153|192->154|200->162|200->162|201->163|206->168|206->168|207->169|208->170|208->170|209->171|210->172|210->172|211->173|212->174|212->174|215->177|215->177|215->177|215->177|216->178|218->180|218->180|219->181|220->182|220->182|221->183|223->185|223->185|224->186|224->186|226->188|226->188|228->190|228->190|229->191|231->193|231->193|232->194|232->194|232->194|233->195|233->195|233->195|234->196|239->201|239->201|240->202|241->203|241->203|242->204|242->204|242->204|242->204|242->204|246->208|246->208|247->209|247->209|247->209|247->209|254->216|254->216|255->217|258->220|258->220|259->221|259->221|260->222|261->223|261->223|262->224|262->224|263->225|263->225|264->226|264->226|268->230|268->230|269->231|269->231|269->231|270->232|272->234|272->234|273->235|274->236|274->236|276->238|276->238|277->239|279->241|279->241|280->242|283->245|283->245|283->245|283->245|283->245|284->246|284->246|284->246|285->247|287->249|287->249|287->249|287->249|287->249|289->251|289->251|291->253|291->253|292->254|292->254|293->255|293->255|294->256|294->256|295->257|295->257|295->257|296->258|297->259|297->259|299->261|307->269|307->269|309->271|309->271|309->271|310->272|310->272|310->272|311->273|312->274|312->274|313->275|313->275|313->275|314->276|316->278|316->278|317->279|318->280|318->280|319->281|320->282|320->282|321->283|321->283|321->283|322->284|323->285|323->285|324->286|326->288|326->288|328->290|328->290|328->290|329->291|330->292|330->292|331->293|336->298|336->298|337->299|338->300|338->300|339->301|339->301|339->301|340->302|340->302|340->302|341->303|344->306|344->306|345->307|364->326|364->326|366->328|367->329|367->329|368->330|372->334|372->334|373->335|378->340|378->340|379->341|379->341|381->343|381->343|381->343|382->344|388->350|388->350|390->352|390->352|390->352|391->353|396->358|396->358|398->360|398->360|398->360|400->362|400->362|403->365|405->1|406->4|406->5|407->366|409->368|409->368|409->368|411->370|411->370|411->370|411->370|413->372|413->372|413->372|435->394|435->394|435->394|437->396|437->396|437->396|438->397|438->397|438->397|439->398|439->398|439->398|440->399|440->399|440->399|441->400|441->400|441->400|442->401|442->401|442->401|443->402|443->402|443->402|448->407|448->407|448->407|455->414|455->414|455->414|464->423|464->423|464->423|473->432|473->432|473->432|526->485|526->485|526->485|527->486|527->486|527->486|528->487|528->487|528->487|528->487|529->488|529->488|529->488|533->492|533->492|533->492|534->493|534->493|534->493|535->494|536->495|536->495|536->495|537->496|537->496|537->496|538->497|541->500|542->501|543->502|550->509|550->509|550->509|569->528|569->528|569->528|570->529|574->533|575->534|577->536|577->536|577->536|595->554|595->554|595->554|596->555|596->555|596->555|596->555|600->559|601->560|608->567|608->567|608->567|617->576|617->576|617->576|626->585|626->585|626->585|649->608|649->608|649->608|661->620|661->620|661->620|672->631
                  -- GENERATED --
              */
          