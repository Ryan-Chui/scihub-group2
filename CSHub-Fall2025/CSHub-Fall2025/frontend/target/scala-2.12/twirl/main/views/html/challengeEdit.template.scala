
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

object challengeEdit extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[Challenge,String,String,String,String,Boolean,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(challenge: Challenge, tableName: String, challengeFileType: String, tableRecorderId: String, backendPort: String, challengeDocument: Boolean):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._
/*3.2*/import models._
/*4.6*/import models.Challenge

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
            """),format.raw/*28.76*/("""
            """),format.raw/*29.13*/("""var quill;
            function checkCreator() """),format.raw/*30.37*/("""{"""),format.raw/*30.38*/("""
                """),format.raw/*31.17*/("""$("#warningModal").modal("open");
                $("#challengeCreatorMsg").text("");
            """),format.raw/*33.13*/("""}"""),format.raw/*33.14*/("""
            """),format.raw/*34.35*/("""
            """),format.raw/*35.34*/("""
            """),format.raw/*36.24*/("""
            """),format.raw/*37.121*/("""
            """),format.raw/*38.60*/("""
            """),format.raw/*39.24*/("""
            """),format.raw/*40.86*/("""
            """),format.raw/*41.76*/("""
            """),format.raw/*42.76*/("""
            """),format.raw/*43.82*/("""
            """),format.raw/*44.77*/("""
            """),format.raw/*45.75*/("""
            """),format.raw/*46.126*/("""

            """),format.raw/*48.76*/("""
            """),format.raw/*49.68*/("""
            """),format.raw/*50.67*/("""
            """),format.raw/*51.23*/("""
            """),format.raw/*52.69*/("""
            """),format.raw/*53.70*/("""
            """),format.raw/*54.23*/("""

            """),format.raw/*56.51*/("""
            """),format.raw/*57.35*/("""
            """),format.raw/*58.39*/("""
            """),format.raw/*59.50*/("""
            """),format.raw/*60.101*/("""
            """),format.raw/*61.101*/("""
            """),format.raw/*62.119*/("""
            """),format.raw/*63.48*/("""

            """),format.raw/*65.78*/("""
            """),format.raw/*66.107*/("""
            """),format.raw/*67.100*/("""
            """),format.raw/*68.99*/("""
            """),format.raw/*69.51*/("""
            """),format.raw/*70.50*/("""
            """),format.raw/*71.30*/("""
            """),format.raw/*72.27*/("""
            """),format.raw/*73.71*/("""
            """),format.raw/*74.38*/("""
            """),format.raw/*75.24*/("""

            """),format.raw/*77.63*/("""
            """),format.raw/*78.76*/("""
            """),format.raw/*79.59*/("""
            """),format.raw/*80.139*/("""
            """),format.raw/*81.31*/("""
            """),format.raw/*82.86*/("""
            """),format.raw/*83.26*/("""
            """),format.raw/*84.24*/("""

            """),format.raw/*86.76*/("""
            """),format.raw/*87.47*/("""
            """),format.raw/*88.43*/("""
            """),format.raw/*89.47*/("""
            """),format.raw/*90.58*/("""
            """),format.raw/*91.55*/("""
            """),format.raw/*92.22*/("""
            """),format.raw/*93.56*/("""
            """),format.raw/*94.73*/("""
            """),format.raw/*95.61*/("""
            """),format.raw/*96.119*/("""
            """),format.raw/*97.67*/("""
            """),format.raw/*98.26*/("""
            """),format.raw/*99.31*/("""
            """),format.raw/*100.117*/("""
            """),format.raw/*101.66*/("""
            """),format.raw/*102.78*/("""
            """),format.raw/*103.73*/("""
            """),format.raw/*104.90*/("""
            """),format.raw/*105.95*/("""
            """),format.raw/*106.26*/("""
            """),format.raw/*107.54*/("""

            """),format.raw/*109.24*/("""


            """),format.raw/*112.48*/("""
            """),format.raw/*113.68*/("""
            """),format.raw/*114.94*/("""
            """),format.raw/*115.95*/("""
            """),format.raw/*116.29*/("""
            """),format.raw/*117.89*/("""
            """),format.raw/*118.90*/("""
            """),format.raw/*119.29*/("""
            """),format.raw/*120.89*/("""
            """),format.raw/*121.124*/("""
            """),format.raw/*122.120*/("""
            """),format.raw/*123.23*/("""
            """),format.raw/*124.59*/("""
            """),format.raw/*125.79*/("""
            """),format.raw/*126.81*/("""
            """),format.raw/*127.49*/("""
            """),format.raw/*128.39*/("""
            """),format.raw/*129.29*/("""
            """),format.raw/*130.57*/("""
            """),format.raw/*131.74*/("""
            """),format.raw/*132.51*/("""
            """),format.raw/*133.57*/("""
            """),format.raw/*134.57*/("""
            """),format.raw/*135.23*/("""
            """),format.raw/*136.30*/("""
            """),format.raw/*137.27*/("""
            """),format.raw/*138.86*/("""
            """),format.raw/*139.20*/("""

            """),format.raw/*141.13*/("""function entityToString()"""),format.raw/*141.38*/("""{"""),format.raw/*141.39*/("""
                """),format.raw/*142.17*/("""var div=document.createElement('div');
                """),_display_(/*143.18*/if(challenge.getShortDescription!=null)/*143.57*/{_display_(Seq[Any](format.raw/*143.58*/("""
                    """),format.raw/*144.21*/("""div.innerHTML = """"),_display_(/*144.39*/challenge/*144.48*/.getShortDescription),format.raw/*144.68*/("""";
                """)))}),format.raw/*145.18*/("""
                """),format.raw/*146.17*/("""var res=div.innerText||div.textContent;
                return res;
            """),format.raw/*148.13*/("""}"""),format.raw/*148.14*/("""

            """),format.raw/*150.13*/("""function getHTML() //display current HTML
            """),format.raw/*151.13*/("""{"""),format.raw/*151.14*/("""
                """),format.raw/*152.17*/("""if(document.getElementById("descriptionMsg").innerText.length != 0)
                    return false;
                console.log(Number.isInteger('fjidsao'));
                //console.log("isnan:" + isNaN($("#challengeCreator").text());
                var cid = $("#challengeCreator").val()
                console.log("cid" + $("#challengeCreator").val());
                console.log("typeof" + typeof($("#challengeCreator").val()));

                if(isNaN(cid))"""),format.raw/*160.31*/("""{"""),format.raw/*160.32*/("""
                    """),format.raw/*161.21*/("""//document.getElementById(urlMsgId).setAttribute('data-error', msg);
                    console.log("cidddMSg:" + $("#challengeCreatorMsg").text())
                    $("#challengeCreatorMsg").text("Please specify correct id format");

                    return false;
                """),format.raw/*166.17*/("""}"""),format.raw/*166.18*/("""
                """),format.raw/*167.17*/("""exist = false;
                $.ajax("""),format.raw/*168.24*/("""{"""),format.raw/*168.25*/("""
                    """),format.raw/*169.21*/("""url: "/user/allUserIds",
                    headers: """),format.raw/*170.30*/("""{"""),format.raw/*170.31*/("""
                        """),format.raw/*171.25*/("""'Content-Type': 'application/json'
                    """),format.raw/*172.21*/("""}"""),format.raw/*172.22*/(""",
                    async: false,
                    type: "GET"
                """),format.raw/*175.17*/("""}"""),format.raw/*175.18*/(""").done(function (data) """),format.raw/*175.41*/("""{"""),format.raw/*175.42*/("""
                    """),format.raw/*176.21*/("""console.log("data:" + data)
                    console.log("id:" + cid)
                    for(i in data)"""),format.raw/*178.35*/("""{"""),format.raw/*178.36*/("""
                        """),format.raw/*179.25*/("""console.log(Number(data[i]) + "," + Number(cid))
                        if(Number(data[i]) == Number(cid))"""),format.raw/*180.59*/("""{"""),format.raw/*180.60*/("""
                            """),format.raw/*181.29*/("""exist = true;
                            console.log("loop:" + exist);
                        """),format.raw/*183.25*/("""}"""),format.raw/*183.26*/("""
                    """),format.raw/*184.21*/("""}"""),format.raw/*184.22*/("""

                """),format.raw/*186.17*/("""}"""),format.raw/*186.18*/(""");
                console.log("out" + exist)
                if(!exist)"""),format.raw/*188.27*/("""{"""),format.raw/*188.28*/("""
                    """),format.raw/*189.21*/("""$("#challengeCreatorMsg").text("This user does not exist!");
                    return false;
                """),format.raw/*191.17*/("""}"""),format.raw/*191.18*/("""
                """),format.raw/*192.17*/("""$("#editor").find("img").each(function () """),format.raw/*192.59*/("""{"""),format.raw/*192.60*/("""
                   """),format.raw/*193.20*/("""if($(this).attr("width") == null) """),format.raw/*193.54*/("""{"""),format.raw/*193.55*/("""
                       """),format.raw/*194.24*/("""// If this is a new image
                       var img = this;
                       var dataurl = $(this).attr("src");
                       var arr = dataurl.split(','), mime = arr[0].match(/:(.*?);/)[1],
                            bstr = atob(arr[1]), n = bstr.length, u8arr = new Uint8Array(n);
                       while (n--) """),format.raw/*199.36*/("""{"""),format.raw/*199.37*/("""
                           """),format.raw/*200.28*/("""u8arr[n] = bstr.charCodeAt(n);
                       """),format.raw/*201.24*/("""}"""),format.raw/*201.25*/("""
                       """),format.raw/*202.24*/("""var f = new File([u8arr], "file", """),format.raw/*202.58*/("""{"""),format.raw/*202.59*/("""type: mime"""),format.raw/*202.69*/("""}"""),format.raw/*202.70*/(""");
                       var fd = new FormData();
                       fd.append('file', f);
                       countImagesInDescription ++;
                       $.ajax("""),format.raw/*206.31*/("""{"""),format.raw/*206.32*/("""
                           """),format.raw/*207.28*/("""url: "/challenge/uploadDescriptionImg/"""),_display_(/*207.67*/challenge/*207.76*/.getId),format.raw/*207.82*/("""/" + (countImagesInDescription-1) ,
                           data: fd,
                           contentType: false,
                           dataType: "text",
                           processData: false,
                           async: false,
                           type: "POST",
                           success: function (data) """),format.raw/*214.53*/("""{"""),format.raw/*214.54*/("""
                               """),format.raw/*215.32*/("""console.log(data);
                               $(img).attr("src", data);
                               $(img).attr("width", "50%");
                           """),format.raw/*218.28*/("""}"""),format.raw/*218.29*/(""",
                           error: function (msg) """),format.raw/*219.50*/("""{"""),format.raw/*219.51*/("""
                               """),format.raw/*220.32*/("""console.log("123123123");
                           """),format.raw/*221.28*/("""}"""),format.raw/*221.29*/("""
                       """),format.raw/*222.24*/("""}"""),format.raw/*222.25*/(""");
                   """),format.raw/*223.20*/("""}"""),format.raw/*223.21*/("""



               """),format.raw/*227.16*/("""}"""),format.raw/*227.17*/(""");

                var ajaxflag = true;
                var parentChallengeId = $("#parentChallengeId").val();
                if(parentChallengeId !== "0") """),format.raw/*231.47*/("""{"""),format.raw/*231.48*/("""
                    """),format.raw/*232.21*/("""$.ajax("""),format.raw/*232.28*/("""{"""),format.raw/*232.29*/("""
                        """),format.raw/*233.25*/("""url: "/challenge/checkParentChallenge/" + parentChallengeId,
                        async: false,
                        headers: """),format.raw/*235.34*/("""{"""),format.raw/*235.35*/("""
                            """),format.raw/*236.29*/("""'Content-Type': 'application/json'
                        """),format.raw/*237.25*/("""}"""),format.raw/*237.26*/(""",
                        type: "GET",
                        success: function (data) """),format.raw/*239.50*/("""{"""),format.raw/*239.51*/("""
                            """),format.raw/*240.29*/("""var response = data;
                            console.log(data);
                            if ('badFormat' in response) """),format.raw/*242.58*/("""{"""),format.raw/*242.59*/("""
                                """),format.raw/*243.33*/("""console.log(response['badFormat']);
                                $("#parentChallengeIdMsg").text(response['badFormat']);
                                ajaxflag = false;
                            """),format.raw/*246.29*/("""}"""),format.raw/*246.30*/(""" """),format.raw/*246.31*/("""else """),format.raw/*246.36*/("""{"""),format.raw/*246.37*/("""
                                """),format.raw/*247.33*/("""if ('notExisted' in response) """),format.raw/*247.63*/("""{"""),format.raw/*247.64*/("""
                                    """),format.raw/*248.37*/("""$("#parentChallengeIdMsg").text(response['notExisted']);
                                    ajaxflag = false;
                                """),format.raw/*250.33*/("""}"""),format.raw/*250.34*/(""" """),format.raw/*250.35*/("""else """),format.raw/*250.40*/("""{"""),format.raw/*250.41*/("""

                                """),format.raw/*252.33*/("""}"""),format.raw/*252.34*/("""

                            """),format.raw/*254.29*/("""}"""),format.raw/*254.30*/("""
                        """),format.raw/*255.25*/("""}"""),format.raw/*255.26*/("""
                    """),format.raw/*256.21*/("""}"""),format.raw/*256.22*/(""");
                """),format.raw/*257.17*/("""}"""),format.raw/*257.18*/("""
                """),format.raw/*258.17*/("""if(!ajaxflag)"""),format.raw/*258.30*/("""{"""),format.raw/*258.31*/("""
                    """),format.raw/*259.21*/("""return false;
                """),format.raw/*260.17*/("""}"""),format.raw/*260.18*/("""

               """),format.raw/*262.16*/("""var html = quill.root.innerHTML;
               $("#description").val(html);
               $("#countImagesInDescription").val(countImagesInDescription);




                return true;
            """),format.raw/*270.13*/("""}"""),format.raw/*270.14*/("""

            """),format.raw/*272.13*/("""// function showProPreview(obj) """),format.raw/*272.45*/("""{"""),format.raw/*272.46*/("""
            """),format.raw/*273.13*/("""//     if($("#showImg").attr("src") == "") """),format.raw/*273.56*/("""{"""),format.raw/*273.57*/("""
            """),format.raw/*274.13*/("""//         $("#deleteBtn").hide();
            //     """),format.raw/*275.20*/("""}"""),format.raw/*275.21*/("""
            """),format.raw/*276.13*/("""//     else """),format.raw/*276.25*/("""{"""),format.raw/*276.26*/("""
            """),format.raw/*277.13*/("""//         $("#deleteBtn").show();
            //         //$('#previewMsg').text("");
            //     """),format.raw/*279.20*/("""}"""),format.raw/*279.21*/("""
            """),format.raw/*280.13*/("""//         var panel = document.getElementById("previewPanel");
            //         if (panel.style.display == "none") """),format.raw/*281.59*/("""{"""),format.raw/*281.60*/("""
            """),format.raw/*282.13*/("""//             $(obj).text("Close Preview");
            //         """),format.raw/*283.24*/("""}"""),format.raw/*283.25*/("""
            """),format.raw/*284.13*/("""//         else """),format.raw/*284.29*/("""{"""),format.raw/*284.30*/("""
            """),format.raw/*285.13*/("""//             $(obj).text("Preview Or Delete Picture");
            //         """),format.raw/*286.24*/("""}"""),format.raw/*286.25*/("""
            """),format.raw/*287.13*/("""//         $("#previewPanel").slideToggle();
            //
            // """),format.raw/*289.16*/("""}"""),format.raw/*289.17*/("""

            """),format.raw/*291.13*/("""// function deleteMember(obj) """),format.raw/*291.43*/("""{"""),format.raw/*291.44*/("""
            """),format.raw/*292.13*/("""//     var tr  = $(obj).parent().parent();
            //     if(tr.attr("id") != null) """),format.raw/*293.46*/("""{"""),format.raw/*293.47*/("""
            """),format.raw/*294.13*/("""//         tr.append("<td style='display: none;' > <input name ='delete" + delc + "' value='" + tr.attr("id") + "'></td>")
            //         //tr.attr("name", "delete" + delc);
            //         delc++;
            //         $("#delc").val(delc);
            //         tr.hide();
            //     """),format.raw/*299.20*/("""}"""),format.raw/*299.21*/("""
            """),format.raw/*300.13*/("""//     else tr.remove();
            // """),format.raw/*301.16*/("""}"""),format.raw/*301.17*/("""

            """),format.raw/*303.13*/("""// function showPreview(url) """),format.raw/*303.42*/("""{"""),format.raw/*303.43*/("""
            """),format.raw/*304.13*/("""//     if($("#memberName").val() == "")"""),format.raw/*304.52*/("""{"""),format.raw/*304.53*/("""
            """),format.raw/*305.13*/("""//         $("#msg").text("Member Name cannot be null.");
            //         document.getElementById("addmember").disabled = true;
            //         return;
            //     """),format.raw/*308.20*/("""}"""),format.raw/*308.21*/("""
            """),format.raw/*309.13*/("""//     $("#msg").text("");
            //     document.getElementById("addmember").disabled = false;
            //     var appendItem = "<tr><td><img src=\"" + url + "\" height='35px' style=\"width:35px;border-radius:50%;\"</td>" +
            //             "<td>" + $("#memberName").val() + "<input type=\"text\" name='member" + count + "' id='member" + count + "' value=\""+ $("#memberName").val() +"\" style=\"display: none;\"></td>" +
            //             "<td>" + $("#email").val() + "<input type=\"text\" name='email" + count + "' id='email" + count + "' value=\""+ $("#email").val() +"\" style=\"display: none;\"></td>" +
            //             "<td><a href='javascript:void(0)' onclick='deleteMember(this)'><i style='color:red;' class=\"material-icons\">delete</i></a></td><td id='clone"+count+"'></td></tr>";
            //     $("#previewTable").append(appendItem);
            //     var td = $("#clone" + count);
            //     var obj = $("#photo").clone();
            //     obj.attr("id", "photo" + count);
            //     obj.attr("name", "photo" + count);
            //     td.append(obj);
            //     td.attr("style","display:none;");
            //     count++;
            //     $("#count").val(count);
            //     $("#memberName").val("");
            //     $("#email").val("");
            //     $("#showpath").val("");
            //     $("#photo").val("");
            // """),format.raw/*328.16*/("""}"""),format.raw/*328.17*/("""

            """),format.raw/*330.13*/("""//preview the updated image
            // function changChallengePic() """),format.raw/*331.45*/("""{"""),format.raw/*331.46*/("""
            """),format.raw/*332.13*/("""//     if(document.getElementById("picture").value == "") return;
            //     var reads = new FileReader();
            //     f = document.getElementById("picture").files[0];
            //     reads.readAsDataURL(f);
            //     reads.onload = function(e) """),format.raw/*336.47*/("""{"""),format.raw/*336.48*/("""
            """),format.raw/*337.13*/("""//         document.getElementById('showImg').src = this.result;
            //         $('#record').val("update");
            //         $('#previewMsg').text("This is the preview image. You need to click \"UPDATE\" button below if you want to save the changes.");
            //         $("#deleteBtn").show();
            //         $("#challengePreview").show();
            //     """),format.raw/*342.20*/("""}"""),format.raw/*342.21*/(""";
            // """),format.raw/*343.16*/("""}"""),format.raw/*343.17*/("""

            """),format.raw/*345.13*/("""// function deleteImg() """),format.raw/*345.37*/("""{"""),format.raw/*345.38*/("""
            """),format.raw/*346.13*/("""//     document.getElementById('showImg').src = "";
            //     $('#record').val("delete");
            //     $("#deleteBtn").hide();
            //     $("#challengePreview").hide();
            //     showProPreview("#challengePreview");
            //     $('#previewMsg').text("The image is deleted. You need to click \"UPDATE\" button below if you want to save the changes.");
            // """),format.raw/*352.16*/("""}"""),format.raw/*352.17*/("""

            """),format.raw/*354.13*/("""// function deletePDF() """),format.raw/*354.37*/("""{"""),format.raw/*354.38*/("""
            """),format.raw/*355.13*/("""//     document.getElementById('showImg').src = "";
            //     $('#pdfRecord').val("delete");
            //     $("#pdfDeleteBtn").hide();
            //     $("#pdfDownload").hide();
            //     $('#pdfPreviewMsg').text("The PDF is deleted. You need to click \"UPDATE\" button below if you want to save the changes.");
            // """),format.raw/*360.16*/("""}"""),format.raw/*360.17*/("""

            """),format.raw/*362.13*/("""function markAsPrivate() """),format.raw/*362.38*/("""{"""),format.raw/*362.39*/("""

            """),format.raw/*364.13*/("""}"""),format.raw/*364.14*/("""

            """),format.raw/*366.13*/("""function deletePDF() """),format.raw/*366.34*/("""{"""),format.raw/*366.35*/("""
                """),format.raw/*367.17*/("""document.getElementById('showImg').src = "";
                $('#pdfRecord').val("delete");
                $("#pdfDeleteBtn").hide();
                $("#pdfDownload").hide();
                $('#pdfPreviewMsg').text("The PDF is deleted. You need to click \"UPDATE\" button below if you want to save the changes.");
            """),format.raw/*372.13*/("""}"""),format.raw/*372.14*/("""

            """),format.raw/*374.13*/("""function clearPDF(inputId, textId) """),format.raw/*374.48*/("""{"""),format.raw/*374.49*/("""
                """),format.raw/*375.17*/("""console.log("clearFile called for", inputId, textId);
                var fileInput = document.getElementById(inputId);
                if(fileInput) """),format.raw/*377.31*/("""{"""),format.raw/*377.32*/("""
                    """),format.raw/*378.21*/("""fileInput.value = "";
                """),format.raw/*379.17*/("""}"""),format.raw/*379.18*/(""" """),format.raw/*379.19*/("""else """),format.raw/*379.24*/("""{"""),format.raw/*379.25*/("""
                    """),format.raw/*380.21*/("""console.error("Cannot find element with id", inputId);
                """),format.raw/*381.17*/("""}"""),format.raw/*381.18*/("""
                """),format.raw/*382.17*/("""var textInput = document.getElementById(textId);
                if(textInput) """),format.raw/*383.31*/("""{"""),format.raw/*383.32*/("""
                    """),format.raw/*384.21*/("""textInput.value = "";
                    $('#' + textId).trigger('change');
                """),format.raw/*386.17*/("""}"""),format.raw/*386.18*/(""" """),format.raw/*386.19*/("""else """),format.raw/*386.24*/("""{"""),format.raw/*386.25*/("""
                    """),format.raw/*387.21*/("""console.error("Cannot find element with id", textId);
                """),format.raw/*388.17*/("""}"""),format.raw/*388.18*/("""
            """),format.raw/*389.13*/("""}"""),format.raw/*389.14*/("""
    """),format.raw/*390.5*/("""</script>
""")))};
Seq[Any](format.raw/*1.144*/("""
"""),format.raw/*4.1*/("""    """),format.raw/*5.1*/("""
"""),format.raw/*391.2*/("""

"""),_display_(/*393.2*/main("Challenge Edit", scripts)/*393.33*/ {_display_(Seq[Any](format.raw/*393.35*/("""

    """),format.raw/*395.5*/("""<link href='"""),_display_(/*395.18*/routes/*395.24*/.Assets.at("stylesheets/quill.snow.css")),format.raw/*395.64*/("""'
    rel="stylesheet" />
    <script type="text/javascript" src='"""),_display_(/*397.42*/routes/*397.48*/.Assets.at("public/javascripts/plugins/quill.js")),format.raw/*397.97*/("""'></script>

    <div class="container">
        <div class="row">
            <div class="col  s12 m10 offset-m1">
                <div class="card-panel">
                    <h4 class="center form-signin-heading" align="center">
                        Edit Challenge Information</h4>
                    <div id="warningModal" class="modal">
                        <div class="modal-content">
                            <h5 style="color: red">Warning!</h5>
                            <p style="font-weight: bold">Do you really want to change the creator of this challenge?
                                Please note that after this change, You <span style="color: red">
                                MAY NOT</span> edit this challenge again.</p>
                        </div>
                        <div class="modal-footer">
                            <a id="cancel-change-creator" class="modal-close waves-effect waves-green btn-flat">
                                Cancel</a>
                            <a id="confirm-change-creator"
                            class="modal-close waves-effect waves-green btn-flat">Confirm</a>
                        </div>
                    </div>
                    <form class="form-signin" enctype="multipart/form-data" id="editChallengeForm" method="post" onsubmit="return getHTML()" action=""""),_display_(/*419.151*/routes/*419.157*/.ChallengeController.challengeEditPOST(challenge.getId)),format.raw/*419.212*/("""">

                        <div id="hiddenDiv" style="display: none;">
                            <input name="id" id="id" class="validate" value=""""),_display_(/*422.79*/challenge/*422.88*/.getId),format.raw/*422.94*/("""">
                            <input name="isActive" id="isActive" class="validate" value=""""),_display_(/*423.91*/challenge/*423.100*/.getIsActive),format.raw/*423.112*/("""">
                        </div>

                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="challengeTitle" id="challengeTitle" class="validate" value=""""),_display_(/*429.112*/challenge/*429.121*/.getChallengeTitle),format.raw/*429.139*/("""" required onchange="checkValidChallengeTitle()">
                                <label for="challengeTitle">Title*</label>
                                <span id="challengeTitleMsg" class="helper-text" data-error="" style="color: red;"></span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="shortDescription" id="shortDescription" class="validate" value=""""),_display_(/*437.116*/challenge/*437.125*/.getShortDescription),format.raw/*437.145*/("""" required>
                                <label for="shortDescription">
                                    Short Description* </label>
                                <span id="shortDescriptionMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="longDescription" id="longDescription" class="validate" value=""""),_display_(/*446.114*/challenge/*446.123*/.getLongDescription),format.raw/*446.142*/("""" required>
                                <label for="longDescription">
                                    Long Description* </label>
                                <span id="longDescriptionMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="location" id="location" class="validate" value=""""),_display_(/*455.100*/challenge/*455.109*/.getLocation),format.raw/*455.121*/("""" required>
                                <label for="location">
                                    Location* </label>
                                <span id="locationMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>

                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="requiredExpertise" id="requiredExpertise" class="validate" value=""""),_display_(/*465.118*/challenge/*465.127*/.getRequiredExpertise),format.raw/*465.148*/("""" required>
                                <label for="requiredExpertise">
                                    Required Expertise* </label>
                                <span id="requiredExpertiseMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>

                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="preferredExpertise" id="preferredExpertise" class="validate" value=""""),_display_(/*475.120*/challenge/*475.129*/.getPreferredExpertise),format.raw/*475.151*/("""" required>
                                <label for="preferredExpertise">
                                    Preferred Expertise* </label>
                                <span id="preferredExpertiseMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="preferredTime" id="preferredTime" class="validate" value=""""),_display_(/*484.110*/challenge/*484.119*/.getPreferredTime),format.raw/*484.136*/("""" required>
                                <label for="preferredTime">
                                    Preferred Time* </label>
                                <span id="preferredTimeMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>

                        Budget Range
                        <div class="row">
                            <div class="input-field col s12 m5">
                                """),format.raw/*494.116*/("""
                                """),format.raw/*495.33*/("""<input type="number" name="minBudget" id="minBudget" class="validate" value = """),_display_(/*495.112*/challenge/*495.121*/.getMinBudget),format.raw/*495.134*/(""">
                                <label for="minBudget">Min Budget*</label>
                                <span id="minBudgetMsg" class="helper-text" data-success="✓" data-error="" style="color: red"></span>
                                """),format.raw/*498.69*/("""
                                """),format.raw/*499.241*/("""
                                """),format.raw/*500.58*/("""
                                """),format.raw/*501.44*/("""
                            """),format.raw/*502.29*/("""</div>
                            <div class="input-field col s12 m2">_</div>

                            <div class="input-field col s12 m5">
                                """),format.raw/*506.141*/("""
                                """),format.raw/*507.33*/("""<input type="number" name="maxBudget" id="maxBudget" class="validate" value = """),_display_(/*507.112*/challenge/*507.121*/.getMaxBudget),format.raw/*507.134*/(""">
                                <label for="maxBudget">Max Budget*</label>
                                <span id="maxBudgetMsg" class="helper-text" data-success="✓" data-error="" style="color: red"></span>
                            </div>
                        </div>

                        <div class="row">
                            <div class="input-field col s12">
                                <input type="text" name="tech" id="tech" class="validate" value=""""),_display_(/*515.99*/challenge/*515.108*/.getTech),format.raw/*515.116*/("""" >
                                <label for="tech">
                                    Technologies Used* </label>
                                <span id="techMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>

                        <div class="row">
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
                        """),_display_(/*538.26*/if(challengeDocument)/*538.47*/ {_display_(Seq[Any](format.raw/*538.49*/("""
                            """),format.raw/*539.29*/("""<div class="row" style="margin-top: 10px;">
                                <div class="col s12">
                                    <a href="javascript:void(0);"
                                    data-url=""""),_display_(/*542.48*/routes/*542.54*/.FileController.getFile(tableName, challengeFileType, tableRecorderId)),format.raw/*542.124*/(""""
                                    class="blue-text text-darken-3"
                                    onclick="openAndCheckNewTabUrl(this)">
                                        Download Current Challenge Document
                                    </a>
                                </div>
                            </div>
                        """)))}),format.raw/*549.26*/("""

"""),format.raw/*551.46*/("""
"""),format.raw/*552.78*/("""
"""),format.raw/*553.94*/("""
"""),format.raw/*554.75*/("""
"""),format.raw/*555.94*/("""
"""),format.raw/*556.43*/("""
"""),format.raw/*557.68*/("""
"""),format.raw/*558.87*/("""
"""),format.raw/*559.43*/("""
"""),format.raw/*560.86*/("""
"""),format.raw/*561.112*/("""
"""),format.raw/*562.99*/("""
"""),format.raw/*563.83*/("""
"""),format.raw/*564.133*/("""
"""),format.raw/*565.107*/("""
"""),format.raw/*566.38*/("""
"""),format.raw/*567.102*/("""
"""),format.raw/*568.39*/("""
"""),format.raw/*569.35*/("""

"""),format.raw/*571.46*/("""
"""),format.raw/*572.66*/("""
"""),format.raw/*573.43*/("""
"""),format.raw/*574.121*/("""
"""),format.raw/*575.56*/("""
"""),format.raw/*576.59*/("""
"""),format.raw/*577.98*/("""
"""),format.raw/*578.39*/("""
"""),format.raw/*579.35*/("""
"""),format.raw/*580.46*/("""
"""),format.raw/*581.66*/("""
"""),format.raw/*582.43*/("""
"""),format.raw/*583.126*/("""
"""),format.raw/*584.57*/("""
"""),format.raw/*585.60*/("""
"""),format.raw/*586.99*/("""
"""),format.raw/*587.39*/("""
"""),format.raw/*588.35*/("""
"""),format.raw/*589.46*/("""
"""),format.raw/*590.66*/("""
"""),format.raw/*591.43*/("""
"""),format.raw/*592.117*/("""
"""),format.raw/*593.60*/("""
"""),format.raw/*594.63*/("""
"""),format.raw/*595.102*/("""
"""),format.raw/*596.39*/("""
"""),format.raw/*597.35*/("""

"""),format.raw/*599.46*/("""
"""),format.raw/*600.66*/("""
"""),format.raw/*601.78*/("""
"""),format.raw/*602.54*/("""
"""),format.raw/*603.43*/("""
"""),format.raw/*604.140*/("""
"""),format.raw/*605.46*/("""
"""),format.raw/*606.135*/("""
"""),format.raw/*607.125*/("""
"""),format.raw/*608.39*/("""
"""),format.raw/*609.35*/("""

"""),format.raw/*611.46*/("""
"""),format.raw/*612.66*/("""
"""),format.raw/*613.43*/("""
"""),format.raw/*614.156*/("""
"""),format.raw/*615.68*/("""
"""),format.raw/*616.68*/("""
"""),format.raw/*617.128*/("""
"""),format.raw/*618.39*/("""
"""),format.raw/*619.35*/("""


                        """),format.raw/*622.25*/("""<div class="actions row center">
                            <div class="input-field col s12">
                                <button type="submit" id="challengeRegister" class="btn waves-effect waves-light blue darken-2">
                                    Update</button>
                                <a href=""""),_display_(/*626.43*/routes/*626.49*/.ChallengeController.challengeDetail(challenge.getId)),format.raw/*626.102*/("""" class="btn waves-effect waves-light red darken-2">
                                    Cancel</a>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>

    <script>
            function openAndCheckNewTabUrl(link) """),format.raw/*637.50*/("""{"""),format.raw/*637.51*/("""const url = link.getAttribute('data-url');

                fetch(url, """),format.raw/*639.28*/("""{"""),format.raw/*639.29*/(""" """),format.raw/*639.30*/("""method: 'HEAD' """),format.raw/*639.45*/("""}"""),format.raw/*639.46*/(""").then(response => """),format.raw/*639.65*/("""{"""),format.raw/*639.66*/("""
                    """),format.raw/*640.21*/("""if (response.ok) """),format.raw/*640.38*/("""{"""),format.raw/*640.39*/("""
                        """),format.raw/*641.25*/("""const newTab = window.open(url, '_blank');
                        if (!newTab) """),format.raw/*642.38*/("""{"""),format.raw/*642.39*/("""
                            """),format.raw/*643.29*/("""alert("Please allow pop-ups in your browser to view this file.");
                        """),format.raw/*644.25*/("""}"""),format.raw/*644.26*/("""
                    """),format.raw/*645.21*/("""}"""),format.raw/*645.22*/(""" """),format.raw/*645.23*/("""else """),format.raw/*645.28*/("""{"""),format.raw/*645.29*/("""
                        """),format.raw/*646.25*/("""alert("The user did not upload this file");
                    """),format.raw/*647.21*/("""}"""),format.raw/*647.22*/("""
                """),format.raw/*648.17*/("""}"""),format.raw/*648.18*/(""")
                        .catch(error => """),format.raw/*649.41*/("""{"""),format.raw/*649.42*/("""
                            """),format.raw/*650.29*/("""console.error("Error checking the URL:", error);
                            alert("Failed to check the file. Please try again later.");
                        """),format.raw/*652.25*/("""}"""),format.raw/*652.26*/(""");
            """),format.raw/*653.13*/("""}"""),format.raw/*653.14*/("""
    """),format.raw/*654.5*/("""</script>

""")))}),format.raw/*656.2*/("""
"""))
      }
    }
  }

  def render(challenge:Challenge,tableName:String,challengeFileType:String,tableRecorderId:String,backendPort:String,challengeDocument:Boolean): play.twirl.api.HtmlFormat.Appendable = apply(challenge,tableName,challengeFileType,tableRecorderId,backendPort,challengeDocument)

  def f:((Challenge,String,String,String,String,Boolean) => play.twirl.api.HtmlFormat.Appendable) = (challenge,tableName,challengeFileType,tableRecorderId,backendPort,challengeDocument) => apply(challenge,tableName,challengeFileType,tableRecorderId,backendPort,challengeDocument)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:30 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/challengeEdit.scala.html
                  HASH: d41b5ba52cfc5146431f91431e7cb3b54c2ecb6f
                  MATRIX: 1158->1|1373->145|1396->162|1419->183|1455->209|1469->216|1549->220|1580->225|1630->248|1658->249|1702->266|1763->299|1792->300|1833->313|1864->316|1893->317|1938->334|1998->366|2027->367|2068->380|2113->397|2142->398|2187->415|2245->445|2274->446|2315->459|2351->467|2380->468|2425->485|2480->512|2509->513|2541->518|2618->568|2633->574|2704->624|2784->677|2799->683|2873->735|3038->935|3079->948|3154->995|3183->996|3228->1013|3354->1111|3383->1112|3424->1147|3465->1181|3506->1205|3548->1326|3589->1386|3630->1410|3671->1496|3712->1572|3753->1648|3794->1730|3835->1807|3876->1882|3918->2008|3960->2085|4001->2153|4042->2220|4083->2243|4124->2312|4165->2382|4206->2405|4248->2457|4289->2492|4330->2531|4371->2581|4413->2682|4455->2783|4497->2902|4538->2950|4580->3029|4622->3136|4664->3236|4705->3335|4746->3386|4787->3436|4828->3466|4869->3493|4910->3564|4951->3602|4992->3626|5034->3690|5075->3766|5116->3825|5158->3964|5199->3995|5240->4081|5281->4107|5322->4131|5364->4208|5405->4255|5446->4298|5487->4345|5528->4403|5569->4458|5610->4480|5651->4536|5692->4609|5733->4670|5775->4789|5816->4856|5857->4882|5898->4913|5941->5030|5983->5096|6025->5174|6067->5247|6109->5337|6151->5432|6193->5458|6235->5512|6278->5537|6322->5587|6364->5655|6406->5749|6448->5844|6490->5873|6532->5962|6574->6052|6616->6081|6658->6170|6701->6294|6744->6414|6786->6437|6828->6496|6870->6575|6912->6656|6954->6705|6996->6744|7038->6773|7080->6830|7122->6904|7164->6955|7206->7012|7248->7069|7290->7092|7332->7122|7374->7149|7416->7235|7458->7255|7501->7269|7555->7294|7585->7295|7631->7312|7715->7368|7764->7407|7804->7408|7854->7429|7900->7447|7919->7456|7961->7476|8013->7496|8059->7513|8168->7593|8198->7594|8241->7608|8324->7662|8354->7663|8400->7680|8899->8150|8929->8151|8979->8172|9296->8460|9326->8461|9372->8478|9439->8516|9469->8517|9519->8538|9602->8592|9632->8593|9686->8618|9770->8673|9800->8674|9913->8758|9943->8759|9995->8782|10025->8783|10075->8804|10211->8911|10241->8912|10295->8937|10431->9044|10461->9045|10519->9074|10644->9170|10674->9171|10724->9192|10754->9193|10801->9211|10831->9212|10932->9284|10962->9285|11012->9306|11152->9417|11182->9418|11228->9435|11299->9477|11329->9478|11378->9498|11441->9532|11471->9533|11524->9557|11892->9896|11922->9897|11979->9925|12062->9979|12092->9980|12145->10004|12208->10038|12238->10039|12277->10049|12307->10050|12514->10228|12544->10229|12601->10257|12668->10296|12687->10305|12715->10311|13090->10657|13120->10658|13181->10690|13373->10853|13403->10854|13483->10905|13513->10906|13574->10938|13656->10991|13686->10992|13739->11016|13769->11017|13820->11039|13850->11040|13898->11059|13928->11060|14115->11218|14145->11219|14195->11240|14231->11247|14261->11248|14315->11273|14476->11405|14506->11406|14564->11435|14652->11494|14682->11495|14799->11583|14829->11584|14887->11613|15041->11738|15071->11739|15133->11772|15364->11974|15394->11975|15424->11976|15458->11981|15488->11982|15550->12015|15609->12045|15639->12046|15705->12083|15877->12226|15907->12227|15937->12228|15971->12233|16001->12234|16064->12268|16094->12269|16153->12299|16183->12300|16237->12325|16267->12326|16317->12347|16347->12348|16395->12367|16425->12368|16471->12385|16513->12398|16543->12399|16593->12420|16652->12450|16682->12451|16728->12468|16956->12667|16986->12668|17029->12682|17090->12714|17120->12715|17162->12728|17234->12771|17264->12772|17306->12785|17389->12839|17419->12840|17461->12853|17502->12865|17532->12866|17574->12879|17709->12985|17739->12986|17781->12999|17932->13121|17962->13122|18004->13135|18101->13203|18131->13204|18173->13217|18218->13233|18248->13234|18290->13247|18399->13327|18429->13328|18471->13341|18575->13416|18605->13417|18648->13431|18707->13461|18737->13462|18779->13475|18896->13563|18926->13564|18968->13577|19308->13888|19338->13889|19380->13902|19449->13942|19479->13943|19522->13957|19580->13986|19610->13987|19652->14000|19720->14039|19750->14040|19792->14053|20006->14238|20036->14239|20078->14252|21542->15687|21572->15688|21615->15702|21716->15774|21746->15775|21788->15788|22089->16060|22119->16061|22161->16074|22577->16461|22607->16462|22653->16479|22683->16480|22726->16494|22779->16518|22809->16519|22851->16532|23285->16937|23315->16938|23358->16952|23411->16976|23441->16977|23483->16990|23863->17341|23893->17342|23936->17356|23990->17381|24020->17382|24063->17396|24093->17397|24136->17411|24186->17432|24216->17433|24262->17450|24620->17779|24650->17780|24693->17794|24757->17829|24787->17830|24833->17847|25012->17997|25042->17998|25092->18019|25159->18057|25189->18058|25219->18059|25253->18064|25283->18065|25333->18086|25433->18157|25463->18158|25509->18175|25617->18254|25647->18255|25697->18276|25819->18369|25849->18370|25879->18371|25913->18376|25943->18377|25993->18398|26092->18468|26122->18469|26164->18482|26194->18483|26227->18488|26278->143|26305->178|26335->207|26364->18499|26394->18502|26435->18533|26476->18535|26510->18541|26551->18554|26567->18560|26629->18600|26724->18667|26740->18673|26811->18722|28195->20077|28212->20083|28290->20138|28468->20288|28487->20297|28515->20303|28636->20396|28656->20405|28691->20417|29009->20706|29029->20715|29070->20733|29671->21305|29691->21314|29734->21334|30329->21900|30349->21909|30391->21928|30969->22477|30989->22486|31024->22498|31599->23044|31619->23053|31663->23074|32268->23650|32288->23659|32333->23681|32930->24249|32950->24258|32990->24275|33498->24836|33560->24869|33668->24948|33688->24957|33724->24970|33996->25249|34059->25490|34121->25548|34183->25592|34241->25621|34448->25906|34510->25939|34618->26018|34638->26027|34674->26040|35182->26520|35202->26529|35233->26537|36766->28042|36797->28063|36838->28065|36896->28094|37135->28305|37151->28311|37244->28381|37637->28742|37668->28789|37698->28867|37728->28961|37758->29036|37788->29130|37818->29173|37848->29241|37878->29328|37908->29371|37938->29457|37969->29569|37999->29668|38029->29751|38060->29884|38091->29991|38121->30029|38152->30131|38182->30170|38212->30205|38243->30252|38273->30318|38303->30361|38334->30482|38364->30538|38394->30597|38424->30695|38454->30734|38484->30769|38514->30815|38544->30881|38574->30924|38605->31050|38635->31107|38665->31167|38695->31266|38725->31305|38755->31340|38785->31386|38815->31452|38845->31495|38876->31612|38906->31672|38936->31735|38967->31837|38997->31876|39027->31911|39058->31958|39088->32024|39118->32102|39148->32156|39178->32199|39209->32339|39239->32385|39270->32520|39301->32645|39331->32684|39361->32719|39392->32766|39422->32832|39452->32875|39483->33031|39513->33099|39543->33167|39574->33295|39604->33334|39634->33369|39690->33396|40036->33714|40052->33720|40128->33773|40482->34098|40512->34099|40612->34170|40642->34171|40672->34172|40716->34187|40746->34188|40794->34207|40824->34208|40874->34229|40920->34246|40950->34247|41004->34272|41113->34352|41143->34353|41201->34382|41320->34472|41350->34473|41400->34494|41430->34495|41460->34496|41494->34501|41524->34502|41578->34527|41671->34591|41701->34592|41747->34609|41777->34610|41848->34652|41878->34653|41936->34682|42126->34843|42156->34844|42200->34859|42230->34860|42263->34865|42306->34877
                  LINES: 35->1|38->2|39->3|40->4|42->6|42->6|44->6|45->7|46->8|46->8|47->9|48->10|48->10|49->11|49->11|49->11|50->12|51->13|51->13|52->14|52->14|52->14|53->15|54->16|54->16|55->17|55->17|55->17|56->18|57->19|57->19|58->20|59->21|59->21|59->21|60->22|60->22|60->22|66->28|67->29|68->30|68->30|69->31|71->33|71->33|72->34|73->35|74->36|75->37|76->38|77->39|78->40|79->41|80->42|81->43|82->44|83->45|84->46|86->48|87->49|88->50|89->51|90->52|91->53|92->54|94->56|95->57|96->58|97->59|98->60|99->61|100->62|101->63|103->65|104->66|105->67|106->68|107->69|108->70|109->71|110->72|111->73|112->74|113->75|115->77|116->78|117->79|118->80|119->81|120->82|121->83|122->84|124->86|125->87|126->88|127->89|128->90|129->91|130->92|131->93|132->94|133->95|134->96|135->97|136->98|137->99|138->100|139->101|140->102|141->103|142->104|143->105|144->106|145->107|147->109|150->112|151->113|152->114|153->115|154->116|155->117|156->118|157->119|158->120|159->121|160->122|161->123|162->124|163->125|164->126|165->127|166->128|167->129|168->130|169->131|170->132|171->133|172->134|173->135|174->136|175->137|176->138|177->139|179->141|179->141|179->141|180->142|181->143|181->143|181->143|182->144|182->144|182->144|182->144|183->145|184->146|186->148|186->148|188->150|189->151|189->151|190->152|198->160|198->160|199->161|204->166|204->166|205->167|206->168|206->168|207->169|208->170|208->170|209->171|210->172|210->172|213->175|213->175|213->175|213->175|214->176|216->178|216->178|217->179|218->180|218->180|219->181|221->183|221->183|222->184|222->184|224->186|224->186|226->188|226->188|227->189|229->191|229->191|230->192|230->192|230->192|231->193|231->193|231->193|232->194|237->199|237->199|238->200|239->201|239->201|240->202|240->202|240->202|240->202|240->202|244->206|244->206|245->207|245->207|245->207|245->207|252->214|252->214|253->215|256->218|256->218|257->219|257->219|258->220|259->221|259->221|260->222|260->222|261->223|261->223|265->227|265->227|269->231|269->231|270->232|270->232|270->232|271->233|273->235|273->235|274->236|275->237|275->237|277->239|277->239|278->240|280->242|280->242|281->243|284->246|284->246|284->246|284->246|284->246|285->247|285->247|285->247|286->248|288->250|288->250|288->250|288->250|288->250|290->252|290->252|292->254|292->254|293->255|293->255|294->256|294->256|295->257|295->257|296->258|296->258|296->258|297->259|298->260|298->260|300->262|308->270|308->270|310->272|310->272|310->272|311->273|311->273|311->273|312->274|313->275|313->275|314->276|314->276|314->276|315->277|317->279|317->279|318->280|319->281|319->281|320->282|321->283|321->283|322->284|322->284|322->284|323->285|324->286|324->286|325->287|327->289|327->289|329->291|329->291|329->291|330->292|331->293|331->293|332->294|337->299|337->299|338->300|339->301|339->301|341->303|341->303|341->303|342->304|342->304|342->304|343->305|346->308|346->308|347->309|366->328|366->328|368->330|369->331|369->331|370->332|374->336|374->336|375->337|380->342|380->342|381->343|381->343|383->345|383->345|383->345|384->346|390->352|390->352|392->354|392->354|392->354|393->355|398->360|398->360|400->362|400->362|400->362|402->364|402->364|404->366|404->366|404->366|405->367|410->372|410->372|412->374|412->374|412->374|413->375|415->377|415->377|416->378|417->379|417->379|417->379|417->379|417->379|418->380|419->381|419->381|420->382|421->383|421->383|422->384|424->386|424->386|424->386|424->386|424->386|425->387|426->388|426->388|427->389|427->389|428->390|430->1|431->4|431->5|432->391|434->393|434->393|434->393|436->395|436->395|436->395|436->395|438->397|438->397|438->397|460->419|460->419|460->419|463->422|463->422|463->422|464->423|464->423|464->423|470->429|470->429|470->429|478->437|478->437|478->437|487->446|487->446|487->446|496->455|496->455|496->455|506->465|506->465|506->465|516->475|516->475|516->475|525->484|525->484|525->484|535->494|536->495|536->495|536->495|536->495|539->498|540->499|541->500|542->501|543->502|547->506|548->507|548->507|548->507|548->507|556->515|556->515|556->515|579->538|579->538|579->538|580->539|583->542|583->542|583->542|590->549|592->551|593->552|594->553|595->554|596->555|597->556|598->557|599->558|600->559|601->560|602->561|603->562|604->563|605->564|606->565|607->566|608->567|609->568|610->569|612->571|613->572|614->573|615->574|616->575|617->576|618->577|619->578|620->579|621->580|622->581|623->582|624->583|625->584|626->585|627->586|628->587|629->588|630->589|631->590|632->591|633->592|634->593|635->594|636->595|637->596|638->597|640->599|641->600|642->601|643->602|644->603|645->604|646->605|647->606|648->607|649->608|650->609|652->611|653->612|654->613|655->614|656->615|657->616|658->617|659->618|660->619|663->622|667->626|667->626|667->626|678->637|678->637|680->639|680->639|680->639|680->639|680->639|680->639|680->639|681->640|681->640|681->640|682->641|683->642|683->642|684->643|685->644|685->644|686->645|686->645|686->645|686->645|686->645|687->646|688->647|688->647|689->648|689->648|690->649|690->649|691->650|693->652|693->652|694->653|694->653|695->654|697->656
                  -- GENERATED --
              */
          