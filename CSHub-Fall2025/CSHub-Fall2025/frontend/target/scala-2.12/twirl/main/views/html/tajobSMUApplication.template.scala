
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

object tajobSMUApplication extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[TAJob,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(tajob: TAJob):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._
/*3.2*/import models._
/*4.2*/import models.Project
/*5.2*/import models.Job

def /*8.2*/scripts/*8.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*8.13*/("""
    """),format.raw/*9.5*/("""<style>
            tr """),format.raw/*10.16*/("""{"""),format.raw/*10.17*/("""
                """),format.raw/*11.17*/("""border-bottom: none;
            """),format.raw/*12.13*/("""}"""),format.raw/*12.14*/("""
            """),format.raw/*13.13*/("""td """),format.raw/*13.16*/("""{"""),format.raw/*13.17*/("""
                """),format.raw/*14.17*/("""text-align: center;
            """),format.raw/*15.13*/("""}"""),format.raw/*15.14*/("""
            """),format.raw/*16.13*/(""".ql-editor strong"""),format.raw/*16.30*/("""{"""),format.raw/*16.31*/("""
                """),format.raw/*17.17*/("""font-weight:bold;
            """),format.raw/*18.13*/("""}"""),format.raw/*18.14*/("""
            """),format.raw/*19.13*/("""#editor """),format.raw/*19.21*/("""{"""),format.raw/*19.22*/("""
                """),format.raw/*20.17*/("""height: 375px;
            """),format.raw/*21.13*/("""}"""),format.raw/*21.14*/("""
    """),format.raw/*22.5*/("""</style>
    <script type="text/javascript" src='"""),_display_(/*23.42*/routes/*23.48*/.Assets.at("javascripts/database_field_length.js")),format.raw/*23.98*/("""'></script>
    <script type="text/javascript" src='"""),_display_(/*24.42*/routes/*24.48*/.Assets.at("javascripts/field_validation_helper.js")),format.raw/*24.100*/("""'></script>

    <script type="text/javascript">
            count = 0;
            delc = 0;
            var originCreator;
            var quill;

            function checkCreator() """),format.raw/*32.37*/("""{"""),format.raw/*32.38*/("""
                """),format.raw/*33.17*/("""$("#warningModal").modal("open");
                $("#JobCreatorMsg").text("");
            """),format.raw/*35.13*/("""}"""),format.raw/*35.14*/("""
            """),format.raw/*36.13*/("""$(document).ready(function () """),format.raw/*36.43*/("""{"""),format.raw/*36.44*/("""
                """),format.raw/*37.17*/("""originCreator = '"""),_display_(/*37.35*/tajob/*37.40*/.getTajobPublisher.getId),format.raw/*37.64*/("""';

                $("#cancel-change-creator").click(function () """),format.raw/*39.63*/("""{"""),format.raw/*39.64*/("""
                    """),format.raw/*40.21*/("""$("#JobCreator").val(originCreator);
                """),format.raw/*41.17*/("""}"""),format.raw/*41.18*/(""")
                $("#confirm-change-creator").click(function () """),format.raw/*42.64*/("""{"""),format.raw/*42.65*/("""
                    """),format.raw/*43.21*/("""originCreator = $("#JobCreator").val();
                """),format.raw/*44.17*/("""}"""),format.raw/*44.18*/(""")

                quill = new Quill('#editor', """),format.raw/*46.46*/("""{"""),format.raw/*46.47*/("""
                    """),format.raw/*47.21*/("""modules: """),format.raw/*47.30*/("""{"""),format.raw/*47.31*/("""
                        """),format.raw/*48.25*/("""toolbar: [
                            ["""),format.raw/*49.30*/("""{"""),format.raw/*49.31*/(""" """),format.raw/*49.32*/("""'font': [] """),format.raw/*49.43*/("""}"""),format.raw/*49.44*/("""],
                            ["""),format.raw/*50.30*/("""{"""),format.raw/*50.31*/(""" """),format.raw/*50.32*/("""'size': ['small', false, 'large', 'huge'] """),format.raw/*50.74*/("""}"""),format.raw/*50.75*/("""],  // custom dropdown
                            ['bold', 'italic', 'underline', 'strike'],        // toggled buttons
                            ["""),format.raw/*52.30*/("""{"""),format.raw/*52.31*/(""" """),format.raw/*52.32*/("""'color': [] """),format.raw/*52.44*/("""}"""),format.raw/*52.45*/(""", """),format.raw/*52.47*/("""{"""),format.raw/*52.48*/(""" """),format.raw/*52.49*/("""'background': [] """),format.raw/*52.66*/("""}"""),format.raw/*52.67*/("""],          // dropdown with defaults from theme
                            ['blockquote'],

                            ["""),format.raw/*55.30*/("""{"""),format.raw/*55.31*/(""" """),format.raw/*55.32*/("""'list': 'ordered'"""),format.raw/*55.49*/("""}"""),format.raw/*55.50*/(""", """),format.raw/*55.52*/("""{"""),format.raw/*55.53*/(""" """),format.raw/*55.54*/("""'list': 'bullet' """),format.raw/*55.71*/("""}"""),format.raw/*55.72*/("""],
                            ["""),format.raw/*56.30*/("""{"""),format.raw/*56.31*/(""" """),format.raw/*56.32*/("""'script': 'sub'"""),format.raw/*56.47*/("""}"""),format.raw/*56.48*/(""", """),format.raw/*56.50*/("""{"""),format.raw/*56.51*/(""" """),format.raw/*56.52*/("""'script': 'super' """),format.raw/*56.70*/("""}"""),format.raw/*56.71*/("""],      // superscript/subscript
                            ["""),format.raw/*57.30*/("""{"""),format.raw/*57.31*/(""" """),format.raw/*57.32*/("""'indent': '-1'"""),format.raw/*57.46*/("""}"""),format.raw/*57.47*/(""", """),format.raw/*57.49*/("""{"""),format.raw/*57.50*/(""" """),format.raw/*57.51*/("""'indent': '+1' """),format.raw/*57.66*/("""}"""),format.raw/*57.67*/("""],          // outdent/indent
                            ["""),format.raw/*58.30*/("""{"""),format.raw/*58.31*/(""" """),format.raw/*58.32*/("""'direction': 'rtl' """),format.raw/*58.51*/("""}"""),format.raw/*58.52*/("""],                         // text directio
                            ["""),format.raw/*59.30*/("""{"""),format.raw/*59.31*/(""" """),format.raw/*59.32*/("""'align': [] """),format.raw/*59.44*/("""}"""),format.raw/*59.45*/("""],
                            ['link', 'image']
                        ]
                    """),format.raw/*62.21*/("""}"""),format.raw/*62.22*/(""",
                    placeholder: 'Enter editor description...',
                    theme: 'snow'
                """),format.raw/*65.17*/("""}"""),format.raw/*65.18*/(""");

                var limit = JobDescriptionMaxLength;
                quill.on('text-change', function (delta, old, source) """),format.raw/*68.71*/("""{"""),format.raw/*68.72*/("""
                    """),format.raw/*69.21*/("""if (quill.getLength() > limit+1) """),format.raw/*69.54*/("""{"""),format.raw/*69.55*/("""
                        """),format.raw/*70.25*/("""document.getElementById("longDescriptionMsg").innerHTML = "Field should be no longer than "+ limit +" characters";
                    """),format.raw/*71.21*/("""}"""),format.raw/*71.22*/("""else"""),format.raw/*71.26*/("""{"""),format.raw/*71.27*/("""
                        """),format.raw/*72.25*/("""document.getElementById("longDescriptionMsg").innerHTML = "";
                    """),format.raw/*73.21*/("""}"""),format.raw/*73.22*/("""
                """),format.raw/*74.17*/("""}"""),format.raw/*74.18*/(""");

                // quill.clipboard.dangerouslyPasteHTML(entityToString());
                //  $("#description").val();
                $("#addPanel").hide();
                $("#previewPanel").hide();
                if($("#showImg").attr("src") == "") """),format.raw/*80.53*/("""{"""),format.raw/*80.54*/("""
                    """),format.raw/*81.21*/("""$("#JobPreview").hide();
                """),format.raw/*82.17*/("""}"""),format.raw/*82.18*/("""
                """),format.raw/*83.17*/("""$("#showPanel").click(function () """),format.raw/*83.51*/("""{"""),format.raw/*83.52*/("""
                    """),format.raw/*84.21*/("""var panel = document.getElementById("addPanel");
                    if (panel.style.display == "none") """),format.raw/*85.56*/("""{"""),format.raw/*85.57*/("""
                        """),format.raw/*86.25*/("""$("#btnName").attr("style", "transform:rotate(-45deg);transition:transform 0.3s linear;");
                        $("#buttonText").text("Close Window");
                    """),format.raw/*88.21*/("""}"""),format.raw/*88.22*/("""
                    """),format.raw/*89.21*/("""else """),format.raw/*89.26*/("""{"""),format.raw/*89.27*/("""
                        """),format.raw/*90.25*/("""$("#btnName").attr("style", "transform:rotate(0deg);transition:transform 0.3s linear;");
                        $("#buttonText").text("Add Members");
                        document.getElementById("memberName").value = "";
                        document.getElementById("email").value = "";
                        document.getElementById("email").classList.remove("invalid");
                        document.getElementById("memberName").classList.remove("invalid");
                    """),format.raw/*96.21*/("""}"""),format.raw/*96.22*/("""
                    """),format.raw/*97.21*/("""$("#addPanel").slideToggle();

                """),format.raw/*99.17*/("""}"""),format.raw/*99.18*/(""");


                //preview the updated image
                $("#addmember").click(function changepic() """),format.raw/*103.60*/("""{"""),format.raw/*103.61*/("""
                    """),format.raw/*104.21*/("""if (document.getElementById("memberName").value.trim().length==0)"""),format.raw/*104.86*/("""{"""),format.raw/*104.87*/("""
                        """),format.raw/*105.25*/("""document.getElementById("memberName").classList.add("invalid");
                    """),format.raw/*106.21*/("""}"""),format.raw/*106.22*/("""
                    """),format.raw/*107.21*/("""if (document.getElementById("email").value.trim().length==0)"""),format.raw/*107.81*/("""{"""),format.raw/*107.82*/("""
                        """),format.raw/*108.25*/("""document.getElementById("email").classList.add("invalid");
                    """),format.raw/*109.21*/("""}"""),format.raw/*109.22*/("""
                    """),format.raw/*110.21*/("""// document.getElementById("email").value.trim().length()==0;
                    var isName = document.getElementById("memberName").classList.contains("invalid") ? false : true;
                    var isEmail = document.getElementById("email").classList.contains("invalid") ? false : true;

                    if(!isName || !isEmail) return;
                    if (document.getElementById("photo").value == "") """),format.raw/*115.71*/("""{"""),format.raw/*115.72*/("""
                        """),format.raw/*116.25*/("""var url = "../../../../assets/images/person.jpg";
                        showPreview(url);
                        return;
                    """),format.raw/*119.21*/("""}"""),format.raw/*119.22*/("""
                    """),format.raw/*120.21*/("""var reads = new FileReader();
                    f = document.getElementById("photo").files[0];
                    reads.readAsDataURL(f);
                    reads.onload = function (e) """),format.raw/*123.49*/("""{"""),format.raw/*123.50*/("""
                        """),format.raw/*124.25*/("""showPreview(this.result);

                    """),format.raw/*126.21*/("""}"""),format.raw/*126.22*/(""";
                """),format.raw/*127.17*/("""}"""),format.raw/*127.18*/(""");
                document.body.scrollTop = document.documentElement.scrollTop = 0;
            """),format.raw/*129.13*/("""}"""),format.raw/*129.14*/(""");

            function entityToString()"""),format.raw/*131.38*/("""{"""),format.raw/*131.39*/("""
                """),format.raw/*132.17*/("""var div=document.createElement('div');
                """),_display_(/*133.18*/if(tajob.getShortDescription!=null)/*133.53*/{_display_(Seq[Any](format.raw/*133.54*/("""
                """),format.raw/*134.17*/("""div.innerHTML = """"),_display_(/*134.35*/tajob/*134.40*/.getShortDescription),format.raw/*134.60*/("""";
                """)))}),format.raw/*135.18*/("""
                """),format.raw/*136.17*/("""var res=div.innerText||div.textContent;
                return res;
            """),format.raw/*138.13*/("""}"""),format.raw/*138.14*/("""

            """),format.raw/*140.13*/("""function getHTML() //display current HTML
            """),format.raw/*141.13*/("""{"""),format.raw/*141.14*/("""


                """),format.raw/*144.17*/("""if(document.getElementById("descriptionMsg").innerText.length != 0)
                    return false;
                console.log(Number.isInteger('fjidsao'));
                //console.log("isnan:" + isNaN($("#JobCreator").text());
                var cid = $("#JobCreator").val()
                console.log("cid" + $("#JobCreator").val());
                console.log("typeof" + typeof($("#JobCreator").val()));

                if(isNaN(cid))"""),format.raw/*152.31*/("""{"""),format.raw/*152.32*/("""
                    """),format.raw/*153.21*/("""//document.getElementById(urlMsgId).setAttribute('data-error', msg);
                    console.log("cidddMSg:" + $("#JobCreatorMsg").text())
                    $("#JobCreatorMsg").text("Please specify correct id format");

                    return false;
                """),format.raw/*158.17*/("""}"""),format.raw/*158.18*/("""
                """),format.raw/*159.17*/("""exist = false;
                $.ajax("""),format.raw/*160.24*/("""{"""),format.raw/*160.25*/("""
                    """),format.raw/*161.21*/("""url: "/user/allUserIds",
                    headers: """),format.raw/*162.30*/("""{"""),format.raw/*162.31*/("""
                        """),format.raw/*163.25*/("""'Content-Type': 'application/json'
                    """),format.raw/*164.21*/("""}"""),format.raw/*164.22*/(""",
                    async: false,
                    type: "GET"
                """),format.raw/*167.17*/("""}"""),format.raw/*167.18*/(""").done(function (data) """),format.raw/*167.41*/("""{"""),format.raw/*167.42*/("""
                    """),format.raw/*168.21*/("""console.log("data:" + data)
                    console.log("id:" + cid)
                    for(i in data)"""),format.raw/*170.35*/("""{"""),format.raw/*170.36*/("""
                        """),format.raw/*171.25*/("""console.log(Number(data[i]) + "," + Number(cid))
                        if(Number(data[i]) == Number(cid))"""),format.raw/*172.59*/("""{"""),format.raw/*172.60*/("""
                            """),format.raw/*173.29*/("""exist = true;
                            console.log("loop:" + exist);
                        """),format.raw/*175.25*/("""}"""),format.raw/*175.26*/("""
                    """),format.raw/*176.21*/("""}"""),format.raw/*176.22*/("""

                """),format.raw/*178.17*/("""}"""),format.raw/*178.18*/(""");
                console.log("out" + exist)
                if(!exist)"""),format.raw/*180.27*/("""{"""),format.raw/*180.28*/("""
                    """),format.raw/*181.21*/("""$("#JobCreatorMsg").text("This user does not exist!");
                    return false;
                """),format.raw/*183.17*/("""}"""),format.raw/*183.18*/("""
                """),format.raw/*184.64*/("""
                """),format.raw/*185.60*/("""
                """),format.raw/*186.54*/("""
                """),format.raw/*187.44*/("""
                """),format.raw/*188.63*/("""
                """),format.raw/*189.93*/("""
                """),format.raw/*190.101*/("""
                """),format.raw/*191.42*/("""
                """),format.raw/*192.63*/("""
                """),format.raw/*193.30*/("""
                """),format.raw/*194.77*/("""
                """),format.raw/*195.53*/("""
                """),format.raw/*196.50*/("""
                """),format.raw/*197.57*/("""
                """),format.raw/*198.37*/("""
                """),format.raw/*199.110*/("""
                """),format.raw/*200.42*/("""
                """),format.raw/*201.52*/("""
                """),format.raw/*202.50*/("""
                """),format.raw/*203.52*/("""
                """),format.raw/*204.46*/("""
                """),format.raw/*205.46*/("""
                """),format.raw/*206.59*/("""
                """),format.raw/*207.55*/("""
                """),format.raw/*208.62*/("""
                """),format.raw/*209.65*/("""
                """),format.raw/*210.35*/("""
                """),format.raw/*211.56*/("""
                """),format.raw/*212.62*/("""
                """),format.raw/*213.34*/("""
                """),format.raw/*214.32*/("""
                """),format.raw/*215.26*/("""
                """),format.raw/*216.24*/("""

                """),format.raw/*218.17*/("""var ajaxflag = true;
                var parentProjectId = $("#parentProjectId").val();
                if(parentProjectId !== "0") """),format.raw/*220.45*/("""{"""),format.raw/*220.46*/("""
                    """),format.raw/*221.21*/("""$.ajax("""),format.raw/*221.28*/("""{"""),format.raw/*221.29*/("""
                        """),format.raw/*222.25*/("""url: "/tajob/checkParentProject/" + parentProjectId,
                        async: false,
                        headers: """),format.raw/*224.34*/("""{"""),format.raw/*224.35*/("""
                            """),format.raw/*225.29*/("""'Content-Type': 'application/json'
                        """),format.raw/*226.25*/("""}"""),format.raw/*226.26*/(""",
                        type: "GET",
                        success: function (data) """),format.raw/*228.50*/("""{"""),format.raw/*228.51*/("""
                            """),format.raw/*229.29*/("""var response = data;
                            console.log(data);
                            if ('badFormat' in response) """),format.raw/*231.58*/("""{"""),format.raw/*231.59*/("""
                                """),format.raw/*232.33*/("""console.log(response['badFormat']);
                                $("#parentProjectIdMsg").text(response['badFormat']);
                                ajaxflag = false;
                            """),format.raw/*235.29*/("""}"""),format.raw/*235.30*/(""" """),format.raw/*235.31*/("""else """),format.raw/*235.36*/("""{"""),format.raw/*235.37*/("""
                                """),format.raw/*236.33*/("""if ('notExisted' in response) """),format.raw/*236.63*/("""{"""),format.raw/*236.64*/("""
                                    """),format.raw/*237.37*/("""$("#parentProjectIdMsg").text(response['notExisted']);
                                    ajaxflag = false;
                                """),format.raw/*239.33*/("""}"""),format.raw/*239.34*/(""" """),format.raw/*239.35*/("""else """),format.raw/*239.40*/("""{"""),format.raw/*239.41*/("""

                                """),format.raw/*241.33*/("""}"""),format.raw/*241.34*/("""

                            """),format.raw/*243.29*/("""}"""),format.raw/*243.30*/("""
                        """),format.raw/*244.25*/("""}"""),format.raw/*244.26*/("""
                    """),format.raw/*245.21*/("""}"""),format.raw/*245.22*/(""");
                """),format.raw/*246.17*/("""}"""),format.raw/*246.18*/("""
                """),format.raw/*247.17*/("""if(!ajaxflag)"""),format.raw/*247.30*/("""{"""),format.raw/*247.31*/("""
                    """),format.raw/*248.21*/("""return false;
                """),format.raw/*249.17*/("""}"""),format.raw/*249.18*/("""

                """),format.raw/*251.17*/("""var html = quill.root.innerHTML;
                $("#description").val(html);
                $("#countImagesInDescription").val(countImagesInDescription);

                return true;
            """),format.raw/*256.13*/("""}"""),format.raw/*256.14*/("""

            """),format.raw/*258.13*/("""function showProPreview(obj) """),format.raw/*258.42*/("""{"""),format.raw/*258.43*/("""
                """),format.raw/*259.17*/("""if($("#showImg").attr("src") == "") """),format.raw/*259.53*/("""{"""),format.raw/*259.54*/("""
                    """),format.raw/*260.21*/("""$("#deleteBtn").hide();
                """),format.raw/*261.17*/("""}"""),format.raw/*261.18*/("""
                """),format.raw/*262.17*/("""else """),format.raw/*262.22*/("""{"""),format.raw/*262.23*/("""
                    """),format.raw/*263.21*/("""$("#deleteBtn").show();
                    //$('#previewMsg').text("");
                """),format.raw/*265.17*/("""}"""),format.raw/*265.18*/("""
                """),format.raw/*266.17*/("""var panel = document.getElementById("previewPanel");
                if (panel.style.display == "none") """),format.raw/*267.52*/("""{"""),format.raw/*267.53*/("""
                    """),format.raw/*268.21*/("""$(obj).text("Close Preview");
                """),format.raw/*269.17*/("""}"""),format.raw/*269.18*/("""
                """),format.raw/*270.17*/("""else """),format.raw/*270.22*/("""{"""),format.raw/*270.23*/("""
                    """),format.raw/*271.21*/("""$(obj).text("Preview Or Delete Picture");
                """),format.raw/*272.17*/("""}"""),format.raw/*272.18*/("""
                """),format.raw/*273.17*/("""$("#previewPanel").slideToggle();

            """),format.raw/*275.13*/("""}"""),format.raw/*275.14*/("""

            """),format.raw/*277.13*/("""function deleteMember(obj) """),format.raw/*277.40*/("""{"""),format.raw/*277.41*/("""
                """),format.raw/*278.17*/("""var tr  = $(obj).parent().parent();
                if(tr.attr("id") != null) """),format.raw/*279.43*/("""{"""),format.raw/*279.44*/("""
                    """),format.raw/*280.21*/("""tr.append("<td style='display: none;' > <input name ='delete" + delc + "' value='" + tr.attr("id") + "'></td>")
                    //tr.attr("name", "delete" + delc);
                    delc++;
                    $("#delc").val(delc);
                    tr.hide();
                """),format.raw/*285.17*/("""}"""),format.raw/*285.18*/("""
                """),format.raw/*286.17*/("""else tr.remove();
            """),format.raw/*287.13*/("""}"""),format.raw/*287.14*/("""
            """),format.raw/*288.13*/("""function showPreview(url) """),format.raw/*288.39*/("""{"""),format.raw/*288.40*/("""
                """),format.raw/*289.17*/("""if($("#memberName").val() == "")"""),format.raw/*289.49*/("""{"""),format.raw/*289.50*/("""
                    """),format.raw/*290.21*/("""$("#msg").text("Member Name cannot be null.");
                    document.getElementById("addmember").disabled = true;
                    return;
                """),format.raw/*293.17*/("""}"""),format.raw/*293.18*/("""
                """),format.raw/*294.17*/("""$("#msg").text("");
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
            """),format.raw/*313.13*/("""}"""),format.raw/*313.14*/("""

            """),format.raw/*315.13*/("""//preview the updated image
            function changProjectPic() """),format.raw/*316.40*/("""{"""),format.raw/*316.41*/("""
                """),format.raw/*317.17*/("""if(document.getElementById("picture").value == "") return;
                var reads = new FileReader();
                f = document.getElementById("picture").files[0];
                reads.readAsDataURL(f);
                reads.onload = function(e) """),format.raw/*321.44*/("""{"""),format.raw/*321.45*/("""
                    """),format.raw/*322.21*/("""document.getElementById('showImg').src = this.result;
                    $('#record').val("update");
                    $('#previewMsg').text("This is the preview image. You need to click \"UPDATE\" button below if you want to save the changes.");
                    $("#deleteBtn").show();
                    $("#projectPreview").show();
                """),format.raw/*327.17*/("""}"""),format.raw/*327.18*/(""";
            """),format.raw/*328.13*/("""}"""),format.raw/*328.14*/("""

            """),format.raw/*330.13*/("""function deleteImg() """),format.raw/*330.34*/("""{"""),format.raw/*330.35*/("""
                """),format.raw/*331.17*/("""document.getElementById('showImg').src = "";
                $('#record').val("delete");
                $("#deleteBtn").hide();
                $("#projectPreview").hide();
                showProPreview("#projectPreview");
                $('#previewMsg').text("The image is deleted. You need to click \"UPDATE\" button below if you want to save the changes.");
            """),format.raw/*337.13*/("""}"""),format.raw/*337.14*/("""

            """),format.raw/*339.13*/("""function deletePDF() """),format.raw/*339.34*/("""{"""),format.raw/*339.35*/("""
                """),format.raw/*340.17*/("""document.getElementById('showImg').src = "";
                $('#pdfRecord').val("delete");
                $("#pdfDeleteBtn").hide();
                $("#pdfDownload").hide();
                $('#pdfPreviewMsg').text("The PDF is deleted. You need to click \"UPDATE\" button below if you want to save the changes.");
            """),format.raw/*345.13*/("""}"""),format.raw/*345.14*/("""

            """),format.raw/*347.13*/("""function getMultipleCheckBox() """),format.raw/*347.44*/("""{"""),format.raw/*347.45*/("""

                """),format.raw/*349.17*/("""var taCoursesPreferenceHiddenList = [];
                var arr = document.getElementsByName("taCoursesPreference");
                for (var i = 0; i < arr.length; i++) """),format.raw/*351.54*/("""{"""),format.raw/*351.55*/("""
                    """),format.raw/*352.21*/("""if (arr[i].checked)"""),format.raw/*352.40*/("""{"""),format.raw/*352.41*/("""
                        """),format.raw/*353.25*/("""taCoursesPreferenceHiddenList.push(arr[i].value);
                    """),format.raw/*354.21*/("""}"""),format.raw/*354.22*/("""
                """),format.raw/*355.17*/("""}"""),format.raw/*355.18*/("""

                """),format.raw/*357.17*/("""for(var i = 0; i <taCoursesPreferenceHiddenList.length; i++)"""),format.raw/*357.77*/("""{"""),format.raw/*357.78*/("""
                    """),format.raw/*358.21*/("""document.getElementById("taCoursesPreferenceHidden").value = document.getElementById("taCoursesPreferenceHidden").value + taCoursesPreferenceHiddenList[i] + "; ";
                """),format.raw/*359.17*/("""}"""),format.raw/*359.18*/("""
                """),format.raw/*360.17*/("""document.getElementById("taCoursesPreferenceHidden").value = document.getElementById("taCoursesPreferenceHidden").value.trim();



                var taCoursesNotPreferenceHiddenList = [];
                var arr1 = document.getElementsByName("taCoursesNotPreference");
                for (var i = 0; i < arr1.length; i++) """),format.raw/*366.55*/("""{"""),format.raw/*366.56*/("""
                    """),format.raw/*367.21*/("""if (arr1[i].checked)"""),format.raw/*367.41*/("""{"""),format.raw/*367.42*/("""
                        """),format.raw/*368.25*/("""taCoursesNotPreferenceHiddenList.push(arr1[i].value);
                    """),format.raw/*369.21*/("""}"""),format.raw/*369.22*/("""
                """),format.raw/*370.17*/("""}"""),format.raw/*370.18*/("""

                """),format.raw/*372.17*/("""for(var i = 0; i <taCoursesNotPreferenceHiddenList.length; i++)"""),format.raw/*372.80*/("""{"""),format.raw/*372.81*/("""
                    """),format.raw/*373.21*/("""document.getElementById("taCoursesNotPreferenceHidden").value = document.getElementById("taCoursesNotPreferenceHidden").value + taCoursesNotPreferenceHiddenList[i] + "; ";
                """),format.raw/*374.17*/("""}"""),format.raw/*374.18*/("""
                """),format.raw/*375.17*/("""document.getElementById("taCoursesNotPreferenceHidden").value = document.getElementById("taCoursesNotPreferenceHidden").value.trim();



                return true;
            """),format.raw/*380.13*/("""}"""),format.raw/*380.14*/("""


    """),format.raw/*383.5*/("""</script>
""")))};
Seq[Any](format.raw/*1.16*/("""
"""),format.raw/*6.1*/("""

"""),format.raw/*384.2*/("""

"""),_display_(/*386.2*/main("TAJob Apply", scripts)/*386.30*/ {_display_(Seq[Any](format.raw/*386.32*/("""

    """),format.raw/*388.5*/("""<link href='"""),_display_(/*388.18*/routes/*388.24*/.Assets.at("stylesheets/quill.snow.css")),format.raw/*388.64*/("""'
    rel="stylesheet" />
    <script type="text/javascript" src='"""),_display_(/*390.42*/routes/*390.48*/.Assets.at("../../public/javascripts/plugins/quill.js")),format.raw/*390.103*/("""'></script>
    <script type="text/javascript" src='"""),_display_(/*391.42*/routes/*391.48*/.Assets.at("javascripts/field_validation_helper.js")),format.raw/*391.100*/("""'></script>

    <div class="container">
        <div class="row">
            <div class="col s12 m10 offset-m1">
                <div class="card-panel">
                    <h4 class="center form-signin-heading" align="center">
                        CS Graduate Teaching Assistant Application Page</h4>
                    <div id="warningModal" class="modal">
                        <div class="modal-content">
                            <h5 style="color: red">Warning!</h5>
                            <p style="font-weight: bold">Do you really want to change the creator of this tajob?
                                Please note that after this change, You <span style="color: red">
                                MAY NOT</span> edit this tajob again.</p>
                        </div>
                        <div class="modal-footer">
                            <a id="cancel-change-creator" class="modal-close waves-effect waves-green btn-flat">
                                Cancel</a>
                            <a id="confirm-change-creator"
                            class="modal-close waves-effect waves-green btn-flat">Confirm</a>
                        </div>
                    </div>

                    <!-- declare form -->
                    <form class="form-signin" onsubmit="return getMultipleCheckBox()" id="applyTAJobForm" method="get"  action=""""),_display_(/*415.130*/routes/*415.136*/.TAJobController.tajobApplyPOST(tajob.getId)),format.raw/*415.180*/("""">
                        <div id="hiddenDiv" style="display: none;">
                            <input name="isActive" id="isActive" class="validate" value=""""),_display_(/*417.91*/tajob/*417.96*/.getIsActive),format.raw/*417.108*/("""">
                        </div>

                        <!-- read-only portion -->
                        <div class="row">
                            <div class="input-field col s12">
                                <label>TA Job Title: """),_display_(/*423.55*/tajob/*423.60*/.getTitle),format.raw/*423.69*/(""" """),format.raw/*423.70*/("""</label>
                                <span id="JobTitleMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>

                        <!-- SMU ID -->
                        <div class="row">
                            <div class="input-field col s12">
                                <input type="number" name="smuID" id="smuID" class="validate" required onchange="validateRegex(this.id, 'SMUID')"/>
                                <label for="smuID">SMU ID* </label>
                                <span id="smuIDMsg" class="helper-text" data-success="✓" data-error="Please input correct ID"></span>
                            </div>
                        </div>

                        <!-- Student Type -->
                        <div class="row">
                            <fieldset>
                                <legend>Student Type</legend>
                                <div class="col s12 m4">
                                    <label>
                                        <input type="radio" name="taStudentTypes" id="taStudentTypes1" value="1">
                                        <span>New Student</span>
                                    </label>
                                </div>
                                <div class="col s12 m4">
                                    <label>
                                        <input type="radio" name="taStudentTypes" id="taStudentTypes1" value="2">
                                        <span>Continuing Student</span>
                                    </label>
                                </div>
                            </fieldset>
                        </div>

                        <!-- Applied to Lyle? -->
                        <div class="row">
                            <fieldset>
                                <legend>If new student, have you submitted a completed application for admission to the Lyle School of Engineering Graduate Admissions office?</legend>
                                <div class="col s12 m4">
                                    <label>
                                        <input type="radio" name="taStudentAdmissionTypes" id="taStudentAdmissionTypes1" value="1">
                                        <span>Yes</span>
                                    </label>
                                </div>
                                <div class="col s12 m4">
                                    <label>
                                        <input type="radio" name="taStudentAdmissionTypes" id="taStudentAdmissionTypes2" value="2">
                                        <span>No</span>
                                    </label>
                                </div>
                            </fieldset>
                        </div>

                        <!-- GRE Section -->
                        <div class="row">
                            <h6>G.R.E. Score</h6>
                            <div class="input-field col s12 m3">
                                <input type="number" name="greV" id="greV" class="validate">
                                <label for="greV">V.</label>
                                <span id="greVMsg" class="helper-text" data-success="✓" data-error="Please input correct number" style="color: red"></span>
                            </div>
                            <div class="input-field col s12 m3">
                                <input type="number" name="greQ" id="greQ" class="validate">
                                <label for="greQ">Q.</label>
                                <span id="greQMsg" class="helper-text" data-success="✓" data-error="Please input correct number" style="color: red"></span>
                            </div>
                            <div class="input-field col s12 m3">
                                <input type="number" name="greA" id="greA" class="validate">
                                <label for="greA">A.</label>
                                <span id="greAMsg" class="helper-text" data-success="✓" data-error="Please input correct number" style="color: red"></span>
                            </div>
                            <div class="input-field col s12 m3">
                                <input type="date" name="greDate" id="greDate">
                                <label for="greDate">G.R.E. Date</label>
                                <span id="greDateMsg" class="helper-text" data-success="✓" data-error="This date is invalid" style="color: red"></span>
                            </div>
                        </div>

                        <!-- GPA and Grades -->
                        <div class="row">
                            <h6> If your current educational institution uses a GPA system, please provide the following:</h6>
                            <div class="input-field col s12 m6">
                                <input type="number" step="0.01" name="undergraduateGPA" id="undergraduateGPA" class="validate" onchange="validateRegex(this.id, 'GPA')">
                                <label for="undergraduateGPA">Undergraduate GPA:</label>
                                <span id="undergraduateGPAMsg" class="helper-text" data-success="✓" data-error="Not correct undergraduate GPA" style="color: red"></span>
                            </div>
                            <div class="input-field col s12 m6">
                                <input type="text" name="undergraduateSchool" id="undergraduateSchool">
                                <label for="undergraduateSchool">School:</label>
                                <span id="undergraduateSchoolMsg" class="helper-text" data-success="✓" data-error="Not correct undergraduate school" style="color: red"></span>
                            </div>

                            <div class="input-field col s12 m6">
                                <input type="number" step="0.01" name="graduateGPA" id="graduateGPA" class="validate" onchange="validateRegex(this.id, 'GPA')">
                                <label for="graduateGPA">Graduate GPA:</label>
                                <span id="graduateGPAMsg" class="helper-text" data-success="✓" data-error="Not correct graduate GPA" style="color: red"></span>
                            </div>
                            <div class="input-field col s12 m6">
                                <input type="text" name="graduateSchool" id="graduateSchool">
                                <label for="graduateSchool">School:</label>
                                <span id="graduateSchoolMsg" class="helper-text" data-success="✓" data-error="Not correct graduate school" style="color: red"></span>
                            </div>
                        </div>

                        <!-- Other Grading Info -->
                        <div class="row">
                            <h6>If your current educational institution does NOT use a GPA system, please answer all that may apply:</h6>
                            <div class="input-field col s12">
                                <input type="number" name="classRankNoGPA" id="classRankNoGPA" class="validate" onchange="validateRegex(this.id, /^[0-9]|[1-9][0-9]|[1-9][0-9][0-9]$/)">
                                <label for="classRankNoGPA">What was your class rank? (e.g. #2 out of 50)</label>
                                <span id="classRankNoGPAMsg" class="helper-text" data-success="✓" data-error="Not correct class rank" style="color: red"></span>
                            </div>
                            <div class="input-field col s12">
                                <input type="text" name="scorePercentageNoGPA" id="scorePercentageNoGPA" class="validate", onchange="validateRegex(this.id, /^[0-9]|[1-9][0-9]$/)">
                                <label for="scorePercentageNoGPA">What was your score percentage in your year of graduation? (e.g. 90%)</label>
                                <span id="scorePercentageNoGPAMsg" class="helper-text" data-success="✓" data-error="Not correct score percentage" style="color: red"></span>
                            </div>
                            <div class="input-field col s12">
                                <input type="text" name="gradeNoGPA" id="gradeNoGPA" class="validate">
                                <label for="gradeNoGPA">What was your grade in the year of graduation? (e.g. Distinction with Honor)</label>
                                <span id="gradeNoGPAMsg" class="helper-text" data-success="✓" data-error="Not correct grade" style="color: red"></span>
                            </div>
                            <div class="input-field col s12 m12">
                                <input type="text" name="otherInfoNoGPA" id="otherInfoNoGPA" class="validate">
                                <label for="otherInfoNoGPA">Others:</label>
                                <span id="otherInfoNoGPAMsg" class="helper-text" data-success="✓" data-error="Not correct other info" style="color: red"></span>
                            </div>
                        </div>

                        <!-- Degree Info -->
                        <div class="row">
                            <fieldset>
                                <legend>Enrolled in which degree program?</legend>
                                <div class="col s12 m6">
                                    <label>
                                        <input type="radio" name="enrolledDegree" id="enrolledDegree1" value="1">
                                        <span>MS Computer Science</span>
                                    </label>
                                </div>
                                <div class="col s12 m6">
                                    I plan to continue in Ph.D. CS program
                                    <label>
                                        <input type="radio" name="enrolledPhdDegree" id="enrolledPhdDegree1" value="1">
                                        <span>Yes</span>
                                    </label>
                                    <label>
                                        <input type="radio" name="enrolledPhdDegree" id="enrolledPhdDegree2" value="2">
                                        <span>no</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="radio" name="enrolledDegree" id="enrolledDegree2" value="2">
                                        <span>MS Security Engineering/Cyber Security</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="radio" name="enrolledDegree" id="enrolledDegree3" value="3">
                                        <span>MS Software Engineering</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="radio" name="enrolledDegree" id="enrolledDegree4" value="4">
                                        <span>D.Eng. Software Engineering</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="radio" name="enrolledDegree" id="enrolledDegree5" value="5">
                                        <span>Ph.D. Computer Science</span>
                                    </label>
                                </div>
                                <div class="col s12">
                                    <label>
                                        <input type="radio" name="enrolledDegree" id="enrolledDegree6" value="6">
                                        <span>Other</span>
                                    </label>
                                </div>
                            </fieldset>
                        </div>

                        <!-- Research Info -->
                        <div class="row">
                            <h6>Areas of Research Interest in order of preference:</h6>
                            <div class="input-field col s12">
                                <input type="text" name="areasResearchInterest1" id="areasResearchInterest1" class="validate">
                                <label for="areasResearchInterest1">1.</label>
                                <span id="areasResearchInterest1Msg" class="helper-text" data-success="✓" data-error="Not correct areas research interest" style="color: red"></span>
                            </div>
                            <div class="input-field col s12">
                                <input type="text" name="areasResearchInterest2" id="areasResearchInterest2" class="validate">
                                <label for="areasResearchInterest1">2.</label>
                                <span id="areasResearchInterest2Msg" class="helper-text" data-success="✓" data-error="Not correct areas research interest" style="color: red"></span>
                            </div>
                            <div class="input-field col s12">
                                <input type="text" name="areasResearchInterest3" id="areasResearchInterest3" class="validate">
                                <label for="areasResearchInterest3">3.</label>
                                <span id="areasResearchInterest3Msg" class="helper-text" data-success="✓" data-error="Not correct areas research interest" style="color: red"></span>
                            </div>
                            <div class="input-field col s12 m12">
                                <input type="text" name="areasResearchInterest4" id="areasResearchInterest4" class="validate">
                                <label for="areasResearchInterest4">4.</label>
                                <span id="areasResearchInterest4Msg" class="helper-text" data-success="✓" data-error="Not correct areas research interest" style="color: red"></span>
                            </div>
                        </div>

                        <!-- RA Info -->
                        <div class="row">
                            <fieldset class="col s12 m6">
                                <legend>Have you ever been a Research Assistant at SMU?</legend>
                                <div>
                                    <label>
                                        <input type="radio" name="raSMU" id="raSMU1" value="1">
                                        <span>Yes</span>
                                    </label>
                                </div>
                                <div>
                                    <label>
                                        <input type="radio" name="raSMU" id="raSMU2" value="2">
                                        <span>No</span>
                                    </label>
                                </div>
                            </fieldset>
                            <div class="input-field col s12 m5">
                                <input type="date" name="raSMUTime" id="raSMUTime" class="validate">
                                <label for="raSMUTime">If yes, when?</label>
                                <span id="raSMUTimeMsg" class="helper-text" data-success="✓" data-error="Not correct time" style="color: red"></span>
                            </div>
                            <div class="input-field col s12 m12">
                                <input type="text" name="raSMUAdvisorName" id="raSMUAdvisorName" class="validate">
                                <label for="raSMUAdvisorName">Name of Faculty Research Advisor:</label>
                                <span id="raSMUAdvisorNameMsg" class="helper-text" data-success="✓" data-error="Not correct name" style="color: red"></span>
                            </div>
                            <div class="input-field col s12 m12">
                                <input type="text" name="raSMUAdvisorEmail" id="raSMUAdvisorEmail" class="validate" onchange="validateRegex(this.id, 'EMAIL')">
                                <label for="raSMUAdvisorEmail">Advisor's E-mail address:</label>
                                <span id="raSMUAdvisorEmailMsg" class="helper-text" data-success="✓" data-error="Not correct Email" style="color: red"></span>
                            </div>
                        </div>

                        <!-- TA Info -->
                        <div class="row">
                            <fieldset class="col s12 m6">
                                <legend>Have you ever been a Teaching Assistant at SMU?</legend>
                                <div>
                                    <label>
                                        <input type="radio" name="taSMU" id="taSMU1" value="1">
                                        <span>Yes</span>
                                    </label>
                                </div>
                                <div>
                                    <label>
                                        <input type="radio" name="taSMU" id="taSMU2" value="2">
                                        <span>No</span>
                                    </label>
                                </div>
                            </fieldset>
                            <div class="input-field col s12 m5">
                                <input type="date" name="taSMUTime" id="taSMUTime" class="validate">
                                <label for="taSMUTime">If yes, when?</label>
                                <span id="taSMUTimeMsg" class="helper-text" data-success="✓" data-error="Not correct time" style="color: red"></span>
                            </div>
                            <div class="input-field col s12 m12">
                                <input type="text" name="taSMUAdvisorName" id="taSMUAdvisorName" class="validate">
                                <label for="taSMUAdvisorName">Name of TA Supervisor:</label>
                                <span id="taSMUAdvisorNameMsg" class="helper-text" data-success="✓" data-error="Not correct name" style="color: red"></span>
                            </div>
                            <div class="input-field col s12 m12">
                                <input type="text" name="taSMUAdvisorEmail" id="taSMUAdvisorEmail" class="validate" onchange="validateRegex(this.id, 'EMAIL')">
                                <label for="taSMUAdvisorEmail">Supervisor's E-mail address:</label>
                                <span id="taSMUAdvisorEmailMsg" class="helper-text" data-success="✓" data-error="Not correct Email" style="color: red"></span>
                            </div>
                        </div>

                        <!-- Programming Languages -->
                        <div class="row">
                            <fieldset>
                                <legend>Programming Languages: (Please identify your level of experience in each language)</legend>

                                <!-- C++ -->
                                <div class="input-field col s12">
                                    <div class="input-field col s12 m3"><h6>C++</h6></div>
                                    <div class="input-field col s12 m2">
                                        <label>
                                            <input type="radio" name="programmingLanguageCpp" id="program"""),
format.raw("""mingLanguageCpp1" value="1">
                                            <span>Expert</span>
                                        </label>
                                    </div>
                                    <div class="input-field col s2 m2">
                                        <label>
                                            <input type="radio" name="programmingLanguageCpp" id="programmingLanguageCpp2" value="2">
                                            <span>Knowledgeable</span>
                                        </label>
                                    </div>
                                    <div class="input-field col s2 m2">
                                        <label>
                                            <input type="radio" name="programmingLanguageCpp" id="programmingLanguageCpp3" value="3">
                                            <span>Familiar</span>
                                        </label>
                                    </div>
                                    <div class="input-field col s2 m2">
                                        <label>
                                            <input type="radio" name="programmingLanguageCpp" id="programmingLanguageCpp4" value="4">
                                            <span>Not Familiar</span>
                                        </label>
                                    </div>
                                </div>

                                <!-- Java -->
                                <div class="input-field col s12">
                                    <div class="input-field col s12 m3"><h6>Java</h6></div>
                                    <div class="input-field col s12 m2">
                                        <label>
                                            <input type="radio" name="programmingLanguageJava" id="programmingLanguageJava1" value="1">
                                            <span>Expert</span>
                                        </label>
                                    </div>
                                    <div class="input-field col s2 m2">
                                        <label>
                                            <input type="radio" name="programmingLanguageJava" id="programmingLanguageJava2" value="2">
                                            <span>Knowledgeable</span>
                                        </label>
                                    </div>
                                    <div class="input-field col s2 m2">
                                        <label>
                                            <input type="radio" name="programmingLanguageJava" id="programmingLanguageJava3" value="3">
                                            <span>Familiar</span>
                                        </label>
                                    </div>
                                    <div class="input-field col s2 m2">
                                        <label>
                                            <input type="radio" name="programmingLanguageJava" id="programmingLanguageJava4" value="4">
                                            <span>Not Familiar</span>
                                        </label>
                                    </div>
                                </div>

                                <!-- Python -->
                                <div class="input-field col s12">
                                    <div class="input-field col s12 m3"><h6>Python</h6></div>
                                    <div class="input-field col s12 m2">
                                        <label>
                                            <input type="radio" name="programmingLanguagePython" id="programmingLanguagePython1" value="1">
                                            <span>Expert</span>
                                        </label>
                                    </div>
                                    <div class="input-field col s2 m2">
                                        <label>
                                            <input type="radio" name="programmingLanguagePython" id="programmingLanguagePython2" value="2">
                                            <span>Knowledgeable</span>
                                        </label>
                                    </div>
                                    <div class="input-field col s2 m2">
                                        <label>
                                            <input type="radio" name="programmingLanguagePython" id="programmingLanguagePython3" value="3">
                                            <span>Familiar</span>
                                        </label>
                                    </div>
                                    <div class="input-field col s2 m2">
                                        <label>
                                            <input type="radio" name="programmingLanguagePython" id="programmingLanguagePython4" value="4">
                                            <span>Not Familiar</span>
                                        </label>
                                    </div>
                                </div>

                                <!-- R -->
                                <div class="input-field col s12">
                                    <div class="input-field col s12 m3"><h6>R</h6></div>
                                    <div class="input-field col s12 m2">
                                        <label>
                                            <input type="radio" name="programmingLanguageR" id="programmingLanguageR1" value="1">
                                            <span>Expert</span>
                                        </label>
                                    </div>
                                    <div class="input-field col s2 m2">
                                        <label>
                                            <input type="radio" name="programmingLanguageR" id="programmingLanguageR2" value="2">
                                            <span>Knowledgeable</span>
                                        </label>
                                    </div>
                                    <div class="input-field col s2 m2">
                                        <label>
                                            <input type="radio" name="programmingLanguageR" id="programmingLanguageR3" value="3">
                                            <span>Familiar</span>
                                        </label>
                                    </div>
                                    <div class="input-field col s2 m2">
                                        <label>
                                            <input type="radio" name="programmingLanguageR" id="programmingLanguageR4" value="4">
                                            <span>Not Familiar</span>
                                        </label>
                                    </div>
                                </div>

                                <!-- SQL -->
                                <div class="input-field col s12">
                                    <div class="input-field col s12 m3"><h6>SQL</h6></div>
                                    <div class="input-field col s12 m2">
                                        <label>
                                            <input type="radio" name="programmingLanguageSQL" id="programmingLanguageSQL1" value="1">
                                            <span>Expert</span>
                                        </label>
                                    </div>
                                    <div class="input-field col s2 m2">
                                        <label>
                                            <input type="radio" name="programmingLanguageSQL" id="programmingLanguageSQL2" value="2">
                                            <span>Knowledgeable</span>
                                        </label>
                                    </div>
                                    <div class="input-field col s2 m2">
                                        <label>
                                            <input type="radio" name="programmingLanguageSQL" id="programmingLanguageSQL3" value="3">
                                            <span>Familiar</span>
                                        </label>
                                    </div>
                                    <div class="input-field col s2 m2">
                                        <label>
                                            <input type="radio" name="programmingLanguageSQL" id="programmingLanguageSQL4" value="4">
                                            <span>Not Familiar</span>
                                        </label>
                                    </div>
                                </div>

                                <!-- Javascript -->
                                <div class="input-field col s12">
                                    <div class="input-field col s12 m3"><h6>Javascript</h6></div>
                                    <div class="input-field col s12 m2">
                                        <label>
                                            <input type="radio" name="programmingLanguageJavascript" id="programmingLanguageJavascript1" value="1">
                                            <span>Expert</span>
                                        </label>
                                    </div>
                                    <div class="input-field col s2 m2">
                                        <label>
                                            <input type="radio" name="programmingLanguageJavascript" id="programmingLanguageJavascript2" value="2">
                                            <span>Knowledgeable</span>
                                        </label>
                                    </div>
                                    <div class="input-field col s2 m2">
                                        <label>
                                            <input type="radio" name="programmingLanguageJavascript" id="programmingLanguageJavascript3" value="3">
                                            <span>Familiar</span>
                                        </label>
                                    </div>
                                    <div class="input-field col s2 m2">
                                        <label>
                                            <input type="radio" name="programmingLanguageJavascript" id="programmingLanguageJavascript4" value="4">
                                            <span>Not Familiar</span>
                                        </label>
                                    </div>
                                </div>

                                <!-- Verilog -->
                                <div class="input-field col s12">
                                    <div class="input-field col s12 m3"><h6>Verilog</h6></div>
                                    <div class="input-field col s12 m2">
                                        <label>
                                            <input type="radio" name="programmingLanguageVerilog" id="programmingLanguageVerilog1" value="1">
                                            <span>Expert</span>
                                        </label>
                                    </div>
                                    <div class="input-field col s2 m2">
                                        <label>
                                            <input type="radio" name="programmingLanguageVerilog" id="programmingLanguageVerilog2" value="2">
                                            <span>Knowledgeable</span>
                                        </label>
                                    </div>
                                    <div class="input-field col s2 m2">
                                        <label>
                                            <input type="radio" name="programmingLanguageVerilog" id="programmingLanguageVerilog3" value="3">
                                            <span>Familiar</span>
                                        </label>
                                    </div>
                                    <div class="input-field col s2 m2">
                                        <label>
                                            <input type="radio" name="programmingLanguageVerilog" id="programmingLanguageVerilog4" value="4">
                                            <span>Not Familiar</span>
                                        </label>
                                    </div>
                                </div>

                                <!-- Assembler -->
                                <div class="input-field col s12">
                                    <div class="input-field col s12 m3"><h6>Assembler*</h6></div>
                                    <div class="input-field col s12 m2">
                                        <label>
                                            <input type="radio" name="programmingLanguageAssembler" id="programmingLanguageAssembler1" value="1">
                                            <span>Expert</span>
                                        </label>
                                    </div>
                                    <div class="input-field col s2 m2">
                                        <label>
                                            <input type="radio" name="programmingLanguageAssembler" id="programmingLanguageAssembler2" value="2">
                                            <span>Knowledgeable</span>
                                        </label>
                                    </div>
                                    <div class="input-field col s2 m2">
                                        <label>
                                            <input type="radio" name="programmingLanguageAssembler" id="programmingLanguageAssembler3" value="3">
                                            <span>Familiar</span>
                                        </label>
                                    </div>
                                    <div class="input-field col s2 m2">
                                        <label>
                                            <input type="radio" name="programmingLanguageAssembler" id="programmingLanguageAssembler4" value="4">
                                            <span>Not Familiar</span>
                                        </label>
                                    </div>
                                </div>
                            </fieldset>

                            <!-- Assembler Type Info -->
                            <div class="input-field col s12 m12">
                                <input type="text" name="programmingLanguageAssemblerType" id="programmingLanguageAssemblerType" class="validate">
                                <label for="programmingLanguageAssemblerType">Assembler: List Type (ARM, MIPS, etc.):</label>
                                <span id="programmingLanguageAssemblerTypeMsg" class="helper-text" data-success="✓" data-error="Not correct Assembler type" style="color: red"></span>
                            </div>
                        </div>

                        <!-- Computer Systems Type -->
                        <div class="row">
                            <div class="input-field col s12 m12">
                                <input type="text" name="computerSystemsType" id="computerSystemsType" class="validate">
                                <label for="computerSystemsType">Computer Systems: List Type (Linux, MAC OS, Windows, etc.): </label>
                                <span id="computerSystemsTypeMsg" class="helper-text" data-success="✓" data-error="Not correct computer systems type" style="color: red"></span>
                            </div>
                        </div>

                        <!-- Course List -->
                        """),_display_(/*954.26*/if(tajob.getTaJobCourseSelections == 2)/*954.65*/{_display_(Seq[Any](format.raw/*954.66*/("""
                            """),format.raw/*955.29*/("""<div class="row">
                                <h5>Courses listed below are all CS courses that need Teaching Assistants</h5>
                                <fieldset>
                                    <legend>Which Courses would you like to TA?</legend>
                                    <div class="col s12">
                                        <label>
                                            <input type="checkbox" name="taCoursesPreference" id="taCoursesPreference1" value="CS 1340 Introduction to Computing Concepts Python">
                                            <span>CS 1340 Introduction to Computing Concepts Python</span>
                                        </label>
                                    </div>
                                    <div class="col s12">
                                        <label>
                                            <input type="checkbox" name="taCoursesPreference" id="taCoursesPreference2" value="CS 1341 Principles of Computer Science Java">
                                            <span>CS 1341 Principles of Computer Science Java</span>
                                        </label>
                                    </div>
                                    <div class="col s12">
                                        <label>
                                            <input type="checkbox" name="taCoursesPreference" id="taCoursesPreference3" value="CS 1342 Programming Concepts C++">
                                            <span>CS 1342 Programming Concepts C++</span>
                                        </label>
                                    </div>
                                    <div class="col s12">
                                        <label>
                                            <input type="checkbox" name="taCoursesPreference" id="taCoursesPreference4" value="CS 2353 Discrete Math">
                                            <span>CS 2353 Discrete Math</span>
                                        </label>
                                    </div>
                                    <div class="col s12">
                                        <label>
                                            <input type="checkbox" name="taCoursesPreference" id="taCoursesPreference5" value="CS 2240 Assembly Language ARM">
                                            <span>CS 2240 Assembly Language ARM</span>
                                        </label>
                                    </div>
                                    <div class="col s12">
                                        <label>
                                            <input type="checkbox" name="taCoursesPreference" id="taCoursesPreference6" value="CS 2341 Data Structures">
                                            <span>CS 2341 Data Structures</span>
                                        </label>
                                    </div>
                                    <div class="col s12">
                                        <label>
                                            <input type="checkbox" name="taCoursesPreference" id="taCoursesPreference7" value="CS 3330 Database Concepts">
                                            <span>CS 3330 Database Concepts</span>
                                        </label>
                                    </div>
                                    <div class="col s12">
                                        <label>
                                            <input type="checkbox" name="taCoursesPreference" id="taCoursesPreference8" value="CS 3339 Information Assurance and Security">
                                            <span>CS 3339 Information Assurance and Security</span>
                                        </label>
                                    </div>
                                    <div class="col s12">
                                        <label>
                                            <input type="checkbox" name="taCoursesPreference" id="taCoursesPreference9" value="CS 3342 Programming Language">
                                            <span>CS 3342 Programming Language</span>
                                        </label>
                                    </div>
                                    <div class="col s12">
                                        <label>
                                            <input type="checkbox" name="taCoursesPreference" id="taCoursesPreference10" value="CS 3345 Graphical User Interface Design and Implementation">
                                            <span>CS 3345 Graphical User Interface Design and Implementation</span>
                                        </label>
                                    </div>
                                    <div class="col s12">
                                        <label>
                                            <input type="checkbox" name="taCoursesPreference" id="taCoursesPreference11" value="CS 3353 Fundamentals of Algorithms">
                                            <span>CS 3353 Fundamentals of Algorithms</span>
                                        </label>
                                    </div>
                                    <div class="col s12">
                                        <label>
                                            <input type="checkbox" name="taCoursesPreference" id="taCoursesPreference12" value="CS 4344 Computer Networks and Distributed Systems">
                                            <span>CS 4344 Computer Networks and Distributed Systems</span>
                                        </label>
                                    </div>
                                    <div class="col s12">
                                        <label>
                                            <input type="checkbox" name="taCoursesPreference" id="taCoursesPreference13" value="CS 4345 Software Engineering Principles">
                                            <span>CS 4345 Software Engineering Principles</span>
                                        </label>
                                    </div>
                                    <div class="col s12">
                                        <label>
                                            <input type="checkbox" name="taCoursesPreference" id="taCoursesPreference14" value="CS 4351/4352 Senior Design">
                                            <span>CS 4351/4352 Senior Design</span>
                                        </label>
                                    </div>
                                    <div class="col s12">
                                        <label>
                                            <input type="checkbox" name="taCoursesPreference" id="taCoursesPreference15" value="CS 4381 Digital Computer Design">
                                            <span>CS 4381 Digital Computer Design</span>
                                        </label>
                                    </div>
                                    <div class="col s12">
                                        <label>
                                            <input type="checkbox" name="taCoursesPreference" id="taCoursesPreference16" value="CS 5/7314 Software Testing and Quality Assurance">
                                            <span>CS 5/7314 Software Testing and Quality Assurance</span>
                                        </label>
                                    </div>
                                    <div class="col s12">
                                        <label>
                                            <input type="checkbox" name="taCoursesPreference" id="taCoursesPreference17" value="CS 5/7315 Software Project Planning and Management">
                                            <span>CS 5/7315 Software Project Planning and Management</span>
                                        </label>
                                    </div>
                                    <div class="col s12">
                                        <label>
                                            <input type="checkbox" name="taCoursesPreference" id="taCoursesPreference18" value="CS 5/7316 Software Requirements">
                                            <span>CS 5/7316 Software Requirements</span>
                                        </label>
                                    </div>
                                    <div class="col s12">
                                        <label>
                                            <input type="checkbox" name="taCoursesPreference" id="taCoursesPreference19" value="CS 5/7317 Leadership for Architecting Software Systems">
                                            <span>CS 5/7317 Leadership for Architecting Software Systems</span>
                                        </label>
                                    </div>
                                    <div class="col s12">
                                        <label>
                                            <input type="checkbox" name="taCoursesPreference" id="taCoursesPreference20" value="CS 5/7319 Software Architecture and Design">
                                            <span>CS 5/7319 Software Architecture and Design</span>
                                        </label>
                                    </div>
                                    <div class="col s12">
                                        <label>
                                            <input type="checkbox" name="taCoursesPreference" id="taCoursesPreference21" value="CS 5/7320 Artificial Intelligence">
                                            <span>CS 5/7320 Artificial Intelligence</span>
                                        </label>
                                    </div>
                                    <div class="col s12">
                                        <label>
                                            <input type="checkbox" name="taCoursesPreference" id="taCoursesPreference22" value="CS 5/7323 Mobile Applications for Sensing and Learning">
                                            <span>CS 5/7323 Mobile Applications for Sensing and Learning</span>
                                        </label>
                                    </div>
                                    <div class="col s12">
                                        <label>
                                            <input type="checkbox" name="taCoursesPreference" id="taCoursesPreference23" value="CS 5/7331 Data Mining">
                                            <span>CS 5/7331 Data Mining</span>
                                        </label>
                                    </div>
                                    <div class="col s12">
                                        <label>
                                            <input type="checkbox" name="taCoursesPreference" id="taCoursesPreference24" value="CS 5/7339 Computer System Security">
                                            <span>CS 5/7339 Computer System Security</span>
                                        </label>
                                    </div>
                                    <div class="col s12">
                                        <label>
                                            <input type="checkbox" name="taCoursesPreference" id="taCoursesPreference25" value="CS 5/7343 Operating Systems and System Software">
                                            <span>CS 5/7343 Operating Systems and System Software</span>
                                        </label>
                                    </div>
                                    <div class="col s12">
                                        <label>
                                            <input type="checkbox" name="taCoursesPreference" id="taCoursesPreference26" value="CS 5/7345 Advanced Application Programming">
                                            <span>CS 5/7345 Advanced Application Programming</span>
                                        </label>
                                    </div>
                                    <div class="col s12">
                                        <label>
                                            <input type="checkbox" name="taCoursesPreference" id="taCoursesPreference27" value="CS 5/7350 Algorithm Engineering">
                                            <span>CS 5/7350 Algorithm Engineering</span>
                                        </label>
                                    </div>

                                    <div class="col s12">
                                        <label>
                                            <input type="checkbox" name="taCoursesPreference" id="taCoursesPreference28" value="CS 5/7383 Computer Graphics">
                                            <span>CS 5/7383 Computer Graphics</span>
                                        </label>
                                    </div>

                                    <div class="col s12">
                                        <label>
                                            <input type="checkbox" name="taCoursesPreference" id="taCoursesPreference29" value="CS 8313 Object Oriented Analysis and Design">
                                            <span>CS 8313 Object Oriented Analysis and Design</span>
                                        </label>
                                    </div>
                                </fieldset>

                                <fieldset>
                                    <legend>Which courses would you not mind TA-ing?</legend>
                                    <div class="col s12">
                                        <label>
                                            <input type="checkbox" name="taCoursesNotPreference" id="taCoursesNotPreference1" value="CS 1340 Introduction to Computing Concepts Python">
                                            <span>CS 1340 Introduction to Computing Concepts Python</span>
                                        </label>
                                    </div>
                                    <div class="col s12">
                                        <label>
                                            <input type="checkbox" name="taCoursesNotPreference" id="taCoursesNotPreference2" value="CS 1341 Principles of Computer Science Java">
                                            <span>CS 1341 Principles of Computer Science Java</span>
                                        </label>
                                    </div>
                                    <div class="col s12">
                                        <label>
                                            <input type="checkbox" name="taCoursesNotPreference" id="taCoursesNotPreference3" value="CS 1342 Programming Concepts C++">
                                            <span>CS 1342 Programming Concepts C++</span>
                                        </label>
                                    </div>
                                    <div class="col s12">
                                        <label>
                                            <input type="checkbox" name="taCoursesNotPreference" id="taCoursesNotPreference4" value="CS 2353 Discrete Math">
                                            <span>CS 2353 Discrete Math</span>
                                        </label>
                                    </div>
                                    <div class="col s12">
                                        <label>
                                            <input type="checkbox" name="taCoursesNotPreference" id="taCoursesNotPreference5" value="CS 2240 Assembly Language ARM">
                                            <span>CS 2240 Assembly Language ARM</span>
                                        </label>
                                    </div>
                                    <div class="col s12">
                                        <label>
                                            <input type="checkbox" name="taCoursesNotPreference" id="taCoursesNotPreference6" value="CS 2341 Data Structures">
                                            <span>CS 2341 Data Structures</span>
                                        </label>
                                    </div>
                                    <div class="col s12">
                                        <label>
                                            <input type="checkbox" name="taCoursesNotPreference" id="taCoursesNotPreference7" value="CS 3330 Database Concepts">
                                            <span>CS 3330 Database Concepts</span>
                                        </label>
                                    </div>
                                    <div class="col s12">
                                        <label>
                                            <input type="checkbox" name="taCoursesNotPreference" id="taCoursesNotPreference8" value="CS 3339 Information Assurance and Security">
                                            <span>CS 3339 Information Assurance and Security</span>
                                        </label>
                                    </div>
                                    <div class="col s12">
                                        <label>
                                            <input type="checkbox" name="taCoursesNotPreference" id="taCoursesNotPreference9" value="CS 3342 Programming Language">
                                            <span>CS 3342 Programming Language</span>
                                        </label>
                                    </div>
                                    <div class="col s12">
                                        <label>
                                            <input type="checkbox" name="taCoursesNotPreference" id="taCoursesNotPreference10" value="CS 3345 Graphical User Interface Design and Implementation">
                                            <span>CS 3345 Graphical User Interface Design and Implementation</span>
                                        </label>
                                    </div>
                                    <div class="col s12">
                                        <label>
                                            <input type="checkbox" name="taCoursesNotPreference" id="taCoursesNotPreference11" value="CS 3353 Fundamentals of Algorithms">
                                            <span>CS 3353 Fundamentals of Algorithms</span>
                                        </label>
                                    </div>
                                    <div class="col s12">
                                        <label>
                                            <input type="checkbox" name="taCoursesNotPreference" id="taCoursesNotPreference12" value="CS 4344 Computer Networks and Distributed Systems">
                                            <span>CS 4344 Computer Networks and Distributed Systems</span>
                                        </label>
                                    </div>
                                    <div class="col s12">
                                        <label>
                                            <input type="checkbox" name="taCoursesNotPreference" id="taCoursesNotPreference13" value="CS 4345 Software Engineering Principles">
                                            <span>CS 4345 Software Engineering Principles</span>
                                        </label>
                                    </div>
                                    <div class="col s12">
                                        <label>
                   """),
format.raw("""                         <input type="checkbox" name="taCoursesNotPreference" id="taCoursesNotPreference14" value="CS 4351/4352 Senior Design">
                                            <span>CS 4351/4352 Senior Design</span>
                                        </label>
                                    </div>
                                    <div class="col s12">
                                        <label>
                                            <input type="checkbox" name="taCoursesNotPreference" id="taCoursesNotPreference15" value="CS 4381 Digital Computer Design">
                                            <span>CS 4381 Digital Computer Design</span>
                                        </label>
                                    </div>
                                    <div class="col s12">
                                        <label>
                                            <input type="checkbox" name="taCoursesNotPreference" id="taCoursesNotPreference16" value="CS 5/7314 Software Testing and Quality Assurance">
                                            <span>CS 5/7314 Software Testing and Quality Assurance</span>
                                        </label>
                                    </div>
                                    <div class="col s12">
                                        <label>
                                            <input type="checkbox" name="taCoursesNotPreference" id="taCoursesNotPreference17" value="CS 5/7315 Software Project Planning and Management">
                                            <span>CS 5/7315 Software Project Planning and Management</span>
                                        </label>
                                    </div>
                                    <div class="col s12">
                                        <label>
                                            <input type="checkbox" name="taCoursesNotPreference" id="taCoursesNotPreference18" value="CS 5/7316 Software Requirements">
                                            <span>CS 5/7316 Software Requirements</span>
                                        </label>
                                    </div>
                                    <div class="col s12">
                                        <label>
                                            <input type="checkbox" name="taCoursesNotPreference" id="taCoursesNotPreference19" value="CS 5/7317 Leadership for Architecting Software Systems">
                                            <span>CS 5/7317 Leadership for Architecting Software Systems</span>
                                        </label>
                                    </div>
                                    <div class="col s12">
                                        <label>
                                            <input type="checkbox" name="taCoursesNotPreference" id="taCoursesNotPreference20" value="CS 5/7319 Software Architecture and Design">
                                            <span>CS 5/7319 Software Architecture and Design</span>
                                        </label>
                                    </div>
                                    <div class="col s12">
                                        <label>
                                            <input type="checkbox" name="taCoursesNotPreference" id="taCoursesNotPreference21" value="CS 5/7320 Artificial Intelligence">
                                            <span>CS 5/7320 Artificial Intelligence</span>
                                        </label>
                                    </div>
                                    <div class="col s12">
                                        <label>
                                            <input type="checkbox" name="taCoursesNotPreference" id="taCoursesNotPreference22" value="CS 5/7323 Mobile Applications for Sensing and Learning">
                                            <span>CS 5/7323 Mobile Applications for Sensing and Learning</span>
                                        </label>
                                    </div>
                                    <div class="col s12">
                                        <label>
                                            <input type="checkbox" name="taCoursesNotPreference" id="taCoursesNotPreference23" value="CS 5/7331 Data Mining">
                                            <span>CS 5/7331 Data Mining</span>
                                        </label>
                                    </div>
                                    <div class="col s12">
                                        <label>
                                            <input type="checkbox" name="taCoursesNotPreference" id="taCoursesNotPreference24" value="CS 5/7339 Computer System Security">
                                            <span>CS 5/7339 Computer System Security</span>
                                        </label>
                                    </div>
                                    <div class="col s12">
                                        <label>
                                            <input type="checkbox" name="taCoursesNotPreference" id="taCoursesNotPreference25" value="CS 5/7343 Operating Systems and System Software">
                                            <span>CS 5/7343 Operating Systems and System Software</span>
                                        </label>
                                    </div>
                                    <div class="col s12">
                                        <label>
                                            <input type="checkbox" name="taCoursesNotPreference" id="taCoursesNotPreference26" value="CS 5/7345 Advanced Application Programming">
                                            <span>CS 5/7345 Advanced Application Programming</span>
                                        </label>
                                    </div>
                                    <div class="col s12">
                                        <label>
                                            <input type="checkbox" name="taCoursesNotPreference" id="taCoursesNotPreference27" value="CS 5/7350 Algorithm Engineering">
                                            <span>CS 5/7350 Algorithm Engineering</span>
                                        </label>
                                    </div>

                                    <div class="col s12">
                                        <label>
                                            <input type="checkbox" name="taCoursesNotPreference" id="taCoursesNotPreference28" value="CS 5/7383 Computer Graphics">
                                            <span>CS 5/7383 Computer Graphics</span>
                                        </label>
                                    </div>

                                    <div class="col s12">
                                        <label>
                                            <input type="checkbox" name="taCoursesNotPreference" id="taCoursesNotPreference29" value="CS 8313 Object Oriented Analysis and Design">
                                            <span>CS 8313 Object Oriented Analysis and Design</span>
                                        </label>
                                    </div>

                                </fieldset>
                            </div>
                        """)))}/*1318.27*/else/*1318.32*/{_display_(Seq[Any](format.raw/*1318.33*/("""
                            """),format.raw/*1319.29*/("""<div class="row">
                                <h5>Courses listed below are all CS courses that need Teaching Assistants</h5>
                                <fieldset>
                                    <legend>Which Courses would you like to TA?</legend>
                                    """),_display_(/*1323.38*/for(i <- tajob.getTaCoursesSelectionHidden.split(";")) yield /*1323.92*/{_display_(Seq[Any](format.raw/*1323.93*/("""
                                        """),format.raw/*1324.41*/("""<div class="col s12">
                                            <label>
                                                <input type="checkbox" name="taCoursesPreference" id="taCoursesPreference"""),_display_(/*1326.123*/tajob/*1326.128*/.getTaCoursesSelectionHidden.split(";").indexOf(i).toString()),format.raw/*1326.189*/(""""  value=""""),_display_(/*1326.200*/i/*1326.201*/.trim()),format.raw/*1326.208*/("""">
                                                <span>"""),_display_(/*1327.56*/i/*1327.57*/.trim()),format.raw/*1327.64*/("""</span>
                                            </label>
                                        </div>
                                    """)))}),format.raw/*1330.38*/("""
                                """),format.raw/*1331.33*/("""</fieldset>

                                <fieldset>
                                    <legend>Which courses would you not mind TA-ing?</legend>
                                    """),_display_(/*1335.38*/for(j <- tajob.getTaCoursesSelectionHidden.split(";")) yield /*1335.92*/{_display_(Seq[Any](format.raw/*1335.93*/("""
                                        """),format.raw/*1336.41*/("""<div class="col s12">
                                            <label>
                                                <input type="checkbox" name="taCoursesNotPreference" id="taCoursesNotPreference"""),_display_(/*1338.129*/tajob/*1338.134*/.getTaCoursesSelectionHidden.split(";").indexOf(j).toString()),format.raw/*1338.195*/(""""  value=""""),_display_(/*1338.206*/j/*1338.207*/.trim()),format.raw/*1338.214*/("""">
                                                <span>"""),_display_(/*1339.56*/j/*1339.57*/.trim()),format.raw/*1339.64*/("""</span>
                                            </label>
                                        </div>
                                    """)))}),format.raw/*1342.38*/("""
                                """),format.raw/*1343.33*/("""</fieldset>
                            </div>
                        """)))}),format.raw/*1345.26*/("""

                        """),format.raw/*1347.25*/("""<div class="row" hidden="true">
                            <div class="input-field col s12">
                                <input type="text" name="taCoursesPreferenceHidden" id="taCoursesPreferenceHidden" >
                            </div>
                        </div>
                        <div class="row" hidden="true">
                            <div class="input-field col s12">
                                <input type="text" name="taCoursesNotPreferenceHidden" id="taCoursesNotPreferenceHidden">
                            </div>
                        </div>
                        <div class="row">
                            <h6>Previous Teaching Experience:</h6>
                            <div class="input-field col s12 m12">
                                <input type="text" name="previousTeachingExp1Title" id="previousTeachingExp1Title" class="validate">
                                <label for="previousTeachingExp1Title">Course Title: </label>
                                <span id="previousTeachingExp1TitleMsg" class="helper-text" data-success="✓" data-error="" style="color: red"></span>
                            </div>
                            <div class="input-field col s12 m6">
                                <input type="text" name="previousTeachingExp1Where" id="previousTeachingExp1Where" class="validate">
                                <label for="previousTeachingExp1Where">Where:</label>
                                <span id="previousTeachingExp1WhereMsg" class="helper-text" data-success="✓" data-error="" style="color: red"></span>
                            </div>
                            <div class="input-field col s12 m6">
                                <input type="date" name="previousTeachingExp1Date" id="previousTeachingExp1Date" class="validate">
                                <label for="previousTeachingExp1Date">Date:</label>
                                <span id="previousTeachingExp1DateMsg" class="helper-text" data-success="✓" data-error="" style="color: red"></span>
                            </div>

                            <div class="input-field col s12 m12">
                                <input type="text" name="previousTeachingExp2Title" id="previousTeachingExp2Title" class="validate">
                                <label for="previousTeachingExp2Title">Course Title: </label>
                                <span id="previousTeachingExp2TitleMsg" class="helper-text" data-success="✓" data-error="" style="color: red"></span>
                            </div>
                            <div class="input-field col s12 m6">
                                <input type="text" name="previousTeachingExp2Where" id="previousTeachingExp2Where" class="validate">
                                <label for="previousTeachingExp2Where">Where:</label>
                                <span id="previousTeachingExp2WhereMsg" class="helper-text" data-success="✓" data-error="" style="color: red"></span>
                            </div>
                            <div class="input-field col s12 m6">
                                <input type="date" name="previousTeachingExp2Date" id="previousTeachingExp2Date" class="validate">
                                <label for="previousTeachingExp2Date">Date:</label>
                                <span id="previousTeachingExp2DateMsg" class="helper-text" data-success="✓" data-error="" style="color: red"></span>
                            </div>

                            <div class="input-field col s12 m12">
                                <input type="text" name="previousTeachingExp3Title" id="previousTeachingExp3Title" class="validate">
                                <label for="previousTeachingExp3Title">Course Title: </label>
                                <span id="previousTeachingExp3TitleMsg" class="helper-text" data-success="✓" data-error="" style="color: red"></span>
                            </div>
                            <div class="input-field col s12 m6">
                                <input type="text" name="previousTeachingExp3Where" id="previousTeachingExp3Where" class="validate">
                                <label for="previousTeachingExp3Where">Where:</label>
                                <span id="previousTeachingExp3WhereMsg" class="helper-text" data-success="✓" data-error="" style="color: red"></span>
                            </div>
                            <div class="input-field col s12 m6">
                                <input type="date" name="previousTeachingExp3Date" id="previousTeachingExp3Date" class="validate">
                                <label for="previousTeachingExp3Date">Date:</label>
                                <span id="previousTeachingExp3DateMsg" class="helper-text" data-success="✓" data-error="" style="color: red"></span>
                            </div>
                        </div>
                        <div class="row">
                            <h6>Please answer all questions (REQUIRED):</h6>
                            <fieldset>
                                <legend>Are you a US citizen/permanent resident?</legend>
                                <div class="col s12 m6">
                                    <label>
                                        <input type="radio" name="taUSCitizen" id="taUSCitizen1" value="1">
                                        <span>Yes</span>
                                    </label>
                                </div>
                                <div class="col s12 m6">
                                    <label>
                                        <input type="radio" name="taUSCitizen" id="taUSCitizen2" value="2">
                                        <span>No</span>
                                    </label>
                                </div>
                            </fieldset>

                            <fieldset>
                                <legend>Do you speak English as your native language? (If your answer is "yes" you may skip the following questions)</legend>
                                <div class="col s12 m6">
                                    <label>
                                        <input type="radio" name="taNativeLanguage" id="taNativeLanguage1" value="1">
                                        <span>Yes</span>
                                    </label>
                                </div>
                                <div class="col s12 m6">
                                    <label>
                                        <input type="radio" name="taNativeLanguage" id="taNativeLanguage2" value="2">
                                        <span>No</span>
                                    </label>
                                </div>
                            </fieldset>
                            <fieldset>
                                <legend>Have you taken an English proficiency test?</legend>
                                <div class="col s12 m6">
                                    <label>
                                        <input type="radio" name="taEnglishProficiencyTest" id="taEnglishProficiencyTest1" value="1">
                                        <span>Yes</span>
                                    </label>
                                </div>
                                <div class="col s12 m6">
                                    <label>
                                        <input type="radio" name="taEnglishProficiencyTest" id="taEnglishProficiencyTest2" value="2">
                                        <span>No</span>
                                    </label>
                                </div>
                            </fieldset>
                            <div class="input-field col s12 m6">
                                <input type="text" name="taEnglishProficiencyTestName" id="taEnglishProficiencyTestName" class="validate">
                                <label for="taEnglishProficiencyTestName">If yes, what test did you take (e.g. TOEFL, IELTS, Duolingo)</label>
                                <span id="taEnglishProficiencyTestNameMsg" class="helper-text" data-success="✓" data-error="" style="color: red"></span>
                            </div>
                            <div class="input-field col s12 m3">
                                <input type="number" name="taEnglishProficiencyTestScore" id="taEnglishProficiencyTestScore" class="validate">
                                <label for="taEnglishProficiencyTestScore">Score:</label>
                                <span id="taEnglishProficiencyTestScoreMsg" class="helper-text" data-success="✓" data-error="" style="color: red"></span>
                            </div>
                            <div class="input-field col s12 m3">
                                <input type="date" name="taEnglishProficiencyTestDate" id="taEnglishProficiencyTestDate" class="validate">
                                <label for="taEnglishProficiencyTestDate">Date:</label>
                                <span id="taEnglishProficiencyTestDateMsg" class="helper-text" data-success="✓" data-error="" style="color: red"></span>
                            </div>
                        </div>

                        <div>
                            <h6>Other information that will help us to evaluate your qualifications for a TA position:</h6>
                            You may attach a resume to this application
                            <div class="row">
                                <div class="input-field col s12">
                                    <textarea type="text" style="height: 200px;
                                        word-wtap: break-word; margin-top: 10px;" id="applyCoverLetter" placeholder="" name="applyCoverLetter"class="validate"> </textarea>
                                    <label for="applyCoverLetter">Cover Letter</label>
                                    <span id="applyCoverLetterMsg" class="helper-text" data-error="" style="color: red; font-size: 12px"></span>
                                </div>
                            </div>
                        </div>


                        Personal Document Upload
                        <div class="row">
                            <div class="file-field input-field col s12" >
                                <div class="btn waves-effect waves-light blue darken-2" >
                                    <span >Resume</span>
                                    <input type="file" accept=".pdf" id="pdf" name="pdf">
                                </div>
                                <div class="file-path-wrapper">
                                    <input class="file-path validate" type="text">
                                </div>
                                <div id="pdfPreviewMsg" style="color:blue"></div>
                                """),_display_(/*1497.34*/if(tajob.getPdf != null && tajob.getPdf != "")/*1497.80*/ {_display_(Seq[Any](format.raw/*1497.82*/("""
                                    """),format.raw/*1498.37*/("""<a id="pdfDownload" href=""""),_display_(/*1498.64*/tajob/*1498.69*/.getPdf),format.raw/*1498.76*/("""">
                                        Download Current Current PDF</a>
                                    <a id = "pdfDeleteBtn" class="right" href="#" style="color: red;" onclick="deletePDF()">
                                        <i class="material-icons">cross</i> Delete Current TA Job PDF</a>
                                """)))}),format.raw/*1502.34*/("""
                                """),format.raw/*1503.33*/("""<input id="pdfRecord" name = "pdfRecord" style="display: none;"/>
                            </div>

                            <div class="file-field input-field col s12" >
                                <div class="btn waves-effect waves-light blue darken-2" >
                                    <span >Cover Letter</span>
                                    <input type="file" accept=".pdf" id="pdf" name="pdf">
                                </div>
                                <div class="file-path-wrapper">
                                    <input class="file-path validate" type="text">
                                </div>
                                <div id="pdfPreviewMsg" style="color:blue"></div>
                                """),_display_(/*1515.34*/if(tajob.getPdf != null && tajob.getPdf != "")/*1515.80*/ {_display_(Seq[Any](format.raw/*1515.82*/("""
                                    """),format.raw/*1516.37*/("""<a id="pdfDownload" href=""""),_display_(/*1516.64*/tajob/*1516.69*/.getPdf),format.raw/*1516.76*/("""">
                                        Download Current Current PDF</a>
                                    <a id = "pdfDeleteBtn" class="right" href="#" style="color: red;" onclick="deletePDF()">
                                        <i class="material-icons">cross</i> Delete Current TA Job PDF</a>
                                """)))}),format.raw/*1520.34*/("""
                                """),format.raw/*1521.33*/("""<input id="pdfRecord" name = "pdfRecord" style="display: none;"/>
                            </div>

                            <div class="file-field input-field col s12" >
                                <div class="btn waves-effect waves-light blue darken-2" >
                                    <span >Transcript File</span>
                                    <input type="file" accept=".pdf" id="pdf" name="pdf">
                                </div>
                                <div class="file-path-wrapper">
                                    <input class="file-path validate" type="text">
                                </div>
                                <div id="pdfPreviewMsg" style="color:blue"></div>
                                """),_display_(/*1533.34*/if(tajob.getPdf != null && tajob.getPdf != "")/*1533.80*/ {_display_(Seq[Any](format.raw/*1533.82*/("""
                                    """),format.raw/*1534.37*/("""<a id="pdfDownload" href=""""),_display_(/*1534.64*/tajob/*1534.69*/.getPdf),format.raw/*1534.76*/("""">
                                        Download Current Current PDF PDF</a>
                                    <a id = "pdfDeleteBtn" class="right" href="#" style="color: red;" onclick="deletePDF()">
                                        <i class="material-icons">cross</i> Delete Current TA Job PDF</a>
                                """)))}),format.raw/*1538.34*/("""
                                """),format.raw/*1539.33*/("""<input id="pdfRecord" name = "pdfRecord" style="display: none;"/>
                            </div>



                            <div class="file-field input-field col s12" >
                                <div class="btn waves-effect waves-light blue darken-2" >
                                    <span >Degree Certificate</span>
                                    <input type="file" accept=".pdf" id="pdf" name="pdf">
                                </div>
                                <div class="file-path-wrapper">
                                    <input class="file-path validate" type="text">
                                </div>
                                <div id="pdfPreviewMsg" style="color:blue"></div>
                                """),_display_(/*1553.34*/if(tajob.getPdf != null && tajob.getPdf != "")/*1553.80*/ {_display_(Seq[Any](format.raw/*1553.82*/("""
                                    """),format.raw/*1554.37*/("""<a id="pdfDownload" href=""""),_display_(/*1554.64*/tajob/*1554.69*/.getPdf),format.raw/*1554.76*/("""">
                                        Download Current Current PDF PDF</a>
                                    <a id = "pdfDeleteBtn" class="right" href="#" style="color: red;" onclick="deletePDF()">
                                        <i class="material-icons">cross</i> Delete Current TA Job PDF</a>
                                """)))}),format.raw/*1558.34*/("""
                                """),format.raw/*1559.33*/("""<input id="pdfRecord" name = "pdfRecord" style="display: none;"/>
                            </div>

                        </div>

                        <div class="actions row center">
                            <div class="input-field col s12">
                                <button type="submit" id="TAJobApplication" class="btn waves-effect waves-light blue darken-2">
                                    Submit</button>
                                <a href=""""),_display_(/*1568.43*/routes/*1568.49*/.TAJobController.tajobDetail(tajob.getId)),format.raw/*1568.90*/("""" class="btn waves-effect waves-light red darken-2">
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
                  DATE: Fri Apr 24 12:50:39 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/tajobSMUApplication.scala.html
                  HASH: 6ac7ad6c09213f366738597a283fea03e0ac42e0
                  MATRIX: 1124->1|1211->17|1234->34|1257->51|1286->74|1316->95|1330->102|1410->106|1441->111|1492->134|1521->135|1566->152|1627->185|1656->186|1697->199|1728->202|1757->203|1802->220|1862->252|1891->253|1932->266|1977->283|2006->284|2051->301|2109->331|2138->332|2179->345|2215->353|2244->354|2289->371|2344->398|2373->399|2405->404|2482->454|2497->460|2568->510|2648->563|2663->569|2737->621|2950->806|2979->807|3024->824|3144->916|3173->917|3214->930|3272->960|3301->961|3346->978|3391->996|3405->1001|3450->1025|3544->1091|3573->1092|3622->1113|3703->1166|3732->1167|3825->1232|3854->1233|3903->1254|3987->1310|4016->1311|4092->1359|4121->1360|4170->1381|4207->1390|4236->1391|4289->1416|4357->1456|4386->1457|4415->1458|4454->1469|4483->1470|4543->1502|4572->1503|4601->1504|4671->1546|4700->1547|4877->1696|4906->1697|4935->1698|4975->1710|5004->1711|5034->1713|5063->1714|5092->1715|5137->1732|5166->1733|5317->1856|5346->1857|5375->1858|5420->1875|5449->1876|5479->1878|5508->1879|5537->1880|5582->1897|5611->1898|5671->1930|5700->1931|5729->1932|5772->1947|5801->1948|5831->1950|5860->1951|5889->1952|5935->1970|5964->1971|6054->2033|6083->2034|6112->2035|6154->2049|6183->2050|6213->2052|6242->2053|6271->2054|6314->2069|6343->2070|6430->2129|6459->2130|6488->2131|6535->2150|6564->2151|6665->2224|6694->2225|6723->2226|6763->2238|6792->2239|6915->2334|6944->2335|7088->2451|7117->2452|7272->2579|7301->2580|7350->2601|7411->2634|7440->2635|7493->2660|7656->2795|7685->2796|7717->2800|7746->2801|7799->2826|7909->2908|7938->2909|7983->2926|8012->2927|8298->3185|8327->3186|8376->3207|8445->3248|8474->3249|8519->3266|8581->3300|8610->3301|8659->3322|8791->3426|8820->3427|8873->3452|9075->3626|9104->3627|9153->3648|9186->3653|9215->3654|9268->3679|9787->4170|9816->4171|9865->4192|9940->4239|9969->4240|10106->4348|10136->4349|10186->4370|10280->4435|10310->4436|10364->4461|10477->4545|10507->4546|10557->4567|10646->4627|10676->4628|10730->4653|10838->4732|10868->4733|10918->4754|11362->5169|11392->5170|11446->5195|11619->5339|11649->5340|11699->5361|11917->5550|11947->5551|12001->5576|12077->5623|12107->5624|12154->5642|12184->5643|12310->5740|12340->5741|12410->5782|12440->5783|12486->5800|12570->5856|12615->5891|12655->5892|12701->5909|12747->5927|12762->5932|12804->5952|12856->5972|12902->5989|13011->6069|13041->6070|13084->6084|13167->6138|13197->6139|13245->6158|13720->6604|13750->6605|13800->6626|14105->6902|14135->6903|14181->6920|14248->6958|14278->6959|14328->6980|14411->7034|14441->7035|14495->7060|14579->7115|14609->7116|14722->7200|14752->7201|14804->7224|14834->7225|14884->7246|15020->7353|15050->7354|15104->7379|15240->7486|15270->7487|15328->7516|15453->7612|15483->7613|15533->7634|15563->7635|15610->7653|15640->7654|15741->7726|15771->7727|15821->7748|15955->7853|15985->7854|16031->7918|16077->7978|16123->8032|16169->8076|16215->8139|16261->8232|16308->8333|16354->8375|16400->8438|16446->8468|16492->8545|16538->8598|16584->8648|16630->8705|16676->8742|16723->8852|16769->8894|16815->8946|16861->8996|16907->9048|16953->9094|16999->9140|17045->9199|17091->9254|17137->9316|17183->9381|17229->9416|17275->9472|17321->9534|17367->9568|17413->9600|17459->9626|17505->9650|17552->9668|17713->9800|17743->9801|17793->9822|17829->9829|17859->9830|17913->9855|18066->9979|18096->9980|18154->10009|18242->10068|18272->10069|18389->10157|18419->10158|18477->10187|18631->10312|18661->10313|18723->10346|18952->10546|18982->10547|19012->10548|19046->10553|19076->10554|19138->10587|19197->10617|19227->10618|19293->10655|19463->10796|19493->10797|19523->10798|19557->10803|19587->10804|19650->10838|19680->10839|19739->10869|19769->10870|19823->10895|19853->10896|19903->10917|19933->10918|19981->10937|20011->10938|20057->10955|20099->10968|20129->10969|20179->10990|20238->11020|20268->11021|20315->11039|20542->11237|20572->11238|20615->11252|20673->11281|20703->11282|20749->11299|20814->11335|20844->11336|20894->11357|20963->11397|20993->11398|21039->11415|21073->11420|21103->11421|21153->11442|21271->11531|21301->11532|21347->11549|21480->11653|21510->11654|21560->11675|21635->11721|21665->11722|21711->11739|21745->11744|21775->11745|21825->11766|21912->11824|21942->11825|21988->11842|22064->11889|22094->11890|22137->11904|22193->11931|22223->11932|22269->11949|22376->12027|22406->12028|22456->12049|22770->12334|22800->12335|22846->12352|22905->12382|22935->12383|22977->12396|23032->12422|23062->12423|23108->12440|23169->12472|23199->12473|23249->12494|23443->12659|23473->12660|23519->12677|24919->14048|24949->14049|24992->14063|25088->14130|25118->14131|25164->14148|25446->14401|25476->14402|25526->14423|25914->14782|25944->14783|25987->14797|26017->14798|26060->14812|26110->14833|26140->14834|26186->14851|26591->15227|26621->15228|26664->15242|26714->15263|26744->15264|26790->15281|27148->15610|27178->15611|27221->15625|27281->15656|27311->15657|27358->15675|27557->15845|27587->15846|27637->15867|27685->15886|27715->15887|27769->15912|27868->15982|27898->15983|27944->16000|27974->16001|28021->16019|28110->16079|28140->16080|28190->16101|28398->16280|28428->16281|28474->16298|28828->16623|28858->16624|28908->16645|28957->16665|28987->16666|29041->16691|29144->16765|29174->16766|29220->16783|29250->16784|29297->16802|29389->16865|29419->16866|29469->16887|29686->17075|29716->17076|29762->17093|29969->17271|29999->17272|30034->17279|30084->15|30111->92|30141->17290|30171->17293|30209->17321|30250->17323|30284->17329|30325->17342|30341->17348|30403->17388|30498->17455|30514->17461|30592->17516|30673->17569|30689->17575|30764->17627|32182->19016|32199->19022|32266->19066|32455->19227|32470->19232|32505->19244|32777->19488|32792->19493|32823->19502|32853->19503|69266->55868|69315->55907|69355->55908|69413->55937|96952->83436|96967->83441|97008->83442|97067->83471|97394->83769|97466->83823|97507->83824|97578->83865|97804->84061|97821->84066|97906->84127|97947->84138|97960->84139|97991->84146|98078->84204|98090->84205|98120->84212|98298->84357|98361->84390|98577->84577|98649->84631|98690->84632|98761->84673|98993->84875|99010->84880|99095->84941|99136->84952|99149->84953|99180->84960|99267->85018|99279->85019|99309->85026|99487->85171|99550->85204|99655->85276|99711->85302|110770->96332|110827->96378|110869->96380|110936->96417|110992->96444|111008->96449|111038->96456|111411->96796|111474->96829|112262->97588|112319->97634|112361->97636|112428->97673|112484->97700|112500->97705|112530->97712|112903->98052|112966->98085|113757->98847|113814->98893|113856->98895|113923->98932|113979->98959|113995->98964|114025->98971|114402->99315|114465->99348|115261->100115|115318->100161|115360->100163|115427->100200|115483->100227|115499->100232|115529->100239|115906->100583|115969->100616|116473->101091|116490->101097|116554->101138
                  LINES: 35->1|38->2|39->3|40->4|41->5|43->8|43->8|45->8|46->9|47->10|47->10|48->11|49->12|49->12|50->13|50->13|50->13|51->14|52->15|52->15|53->16|53->16|53->16|54->17|55->18|55->18|56->19|56->19|56->19|57->20|58->21|58->21|59->22|60->23|60->23|60->23|61->24|61->24|61->24|69->32|69->32|70->33|72->35|72->35|73->36|73->36|73->36|74->37|74->37|74->37|74->37|76->39|76->39|77->40|78->41|78->41|79->42|79->42|80->43|81->44|81->44|83->46|83->46|84->47|84->47|84->47|85->48|86->49|86->49|86->49|86->49|86->49|87->50|87->50|87->50|87->50|87->50|89->52|89->52|89->52|89->52|89->52|89->52|89->52|89->52|89->52|89->52|92->55|92->55|92->55|92->55|92->55|92->55|92->55|92->55|92->55|92->55|93->56|93->56|93->56|93->56|93->56|93->56|93->56|93->56|93->56|93->56|94->57|94->57|94->57|94->57|94->57|94->57|94->57|94->57|94->57|94->57|95->58|95->58|95->58|95->58|95->58|96->59|96->59|96->59|96->59|96->59|99->62|99->62|102->65|102->65|105->68|105->68|106->69|106->69|106->69|107->70|108->71|108->71|108->71|108->71|109->72|110->73|110->73|111->74|111->74|117->80|117->80|118->81|119->82|119->82|120->83|120->83|120->83|121->84|122->85|122->85|123->86|125->88|125->88|126->89|126->89|126->89|127->90|133->96|133->96|134->97|136->99|136->99|140->103|140->103|141->104|141->104|141->104|142->105|143->106|143->106|144->107|144->107|144->107|145->108|146->109|146->109|147->110|152->115|152->115|153->116|156->119|156->119|157->120|160->123|160->123|161->124|163->126|163->126|164->127|164->127|166->129|166->129|168->131|168->131|169->132|170->133|170->133|170->133|171->134|171->134|171->134|171->134|172->135|173->136|175->138|175->138|177->140|178->141|178->141|181->144|189->152|189->152|190->153|195->158|195->158|196->159|197->160|197->160|198->161|199->162|199->162|200->163|201->164|201->164|204->167|204->167|204->167|204->167|205->168|207->170|207->170|208->171|209->172|209->172|210->173|212->175|212->175|213->176|213->176|215->178|215->178|217->180|217->180|218->181|220->183|220->183|221->184|222->185|223->186|224->187|225->188|226->189|227->190|228->191|229->192|230->193|231->194|232->195|233->196|234->197|235->198|236->199|237->200|238->201|239->202|240->203|241->204|242->205|243->206|244->207|245->208|246->209|247->210|248->211|249->212|250->213|251->214|252->215|253->216|255->218|257->220|257->220|258->221|258->221|258->221|259->222|261->224|261->224|262->225|263->226|263->226|265->228|265->228|266->229|268->231|268->231|269->232|272->235|272->235|272->235|272->235|272->235|273->236|273->236|273->236|274->237|276->239|276->239|276->239|276->239|276->239|278->241|278->241|280->243|280->243|281->244|281->244|282->245|282->245|283->246|283->246|284->247|284->247|284->247|285->248|286->249|286->249|288->251|293->256|293->256|295->258|295->258|295->258|296->259|296->259|296->259|297->260|298->261|298->261|299->262|299->262|299->262|300->263|302->265|302->265|303->266|304->267|304->267|305->268|306->269|306->269|307->270|307->270|307->270|308->271|309->272|309->272|310->273|312->275|312->275|314->277|314->277|314->277|315->278|316->279|316->279|317->280|322->285|322->285|323->286|324->287|324->287|325->288|325->288|325->288|326->289|326->289|326->289|327->290|330->293|330->293|331->294|350->313|350->313|352->315|353->316|353->316|354->317|358->321|358->321|359->322|364->327|364->327|365->328|365->328|367->330|367->330|367->330|368->331|374->337|374->337|376->339|376->339|376->339|377->340|382->345|382->345|384->347|384->347|384->347|386->349|388->351|388->351|389->352|389->352|389->352|390->353|391->354|391->354|392->355|392->355|394->357|394->357|394->357|395->358|396->359|396->359|397->360|403->366|403->366|404->367|404->367|404->367|405->368|406->369|406->369|407->370|407->370|409->372|409->372|409->372|410->373|411->374|411->374|412->375|417->380|417->380|420->383|422->1|423->6|425->384|427->386|427->386|427->386|429->388|429->388|429->388|429->388|431->390|431->390|431->390|432->391|432->391|432->391|456->415|456->415|456->415|458->417|458->417|458->417|464->423|464->423|464->423|464->423|996->954|996->954|996->954|997->955|1361->1318|1361->1318|1361->1318|1362->1319|1366->1323|1366->1323|1366->1323|1367->1324|1369->1326|1369->1326|1369->1326|1369->1326|1369->1326|1369->1326|1370->1327|1370->1327|1370->1327|1373->1330|1374->1331|1378->1335|1378->1335|1378->1335|1379->1336|1381->1338|1381->1338|1381->1338|1381->1338|1381->1338|1381->1338|1382->1339|1382->1339|1382->1339|1385->1342|1386->1343|1388->1345|1390->1347|1540->1497|1540->1497|1540->1497|1541->1498|1541->1498|1541->1498|1541->1498|1545->1502|1546->1503|1558->1515|1558->1515|1558->1515|1559->1516|1559->1516|1559->1516|1559->1516|1563->1520|1564->1521|1576->1533|1576->1533|1576->1533|1577->1534|1577->1534|1577->1534|1577->1534|1581->1538|1582->1539|1596->1553|1596->1553|1596->1553|1597->1554|1597->1554|1597->1554|1597->1554|1601->1558|1602->1559|1611->1568|1611->1568|1611->1568
                  -- GENERATED --
              */
          