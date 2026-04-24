
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

object rajobApplication extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[RAJob,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(rajob: RAJob,userTypes: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._
/*3.2*/import models._
/*4.2*/import models.Project
/*5.2*/import models.RAJob

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
            function checkCreator() """),format.raw/*31.37*/("""{"""),format.raw/*31.38*/("""
                """),format.raw/*32.17*/("""$("#warningModal").modal("open");
                $("#JobCreatorMsg").text("");
            """),format.raw/*34.13*/("""}"""),format.raw/*34.14*/("""
            """),format.raw/*35.13*/("""$(document).ready(function () """),format.raw/*35.43*/("""{"""),format.raw/*35.44*/("""
                """),format.raw/*36.17*/("""originCreator = '"""),_display_(/*36.35*/rajob/*36.40*/.getRajobPublisher.getId),format.raw/*36.64*/("""';
                $("#cancel-change-creator").click(function () """),format.raw/*37.63*/("""{"""),format.raw/*37.64*/("""
                    """),format.raw/*38.21*/("""$("#JobCreator").val(originCreator);
                """),format.raw/*39.17*/("""}"""),format.raw/*39.18*/(""")
                $("#confirm-change-creator").click(function () """),format.raw/*40.64*/("""{"""),format.raw/*40.65*/("""
                    """),format.raw/*41.21*/("""originCreator = $("#JobCreator").val();
                """),format.raw/*42.17*/("""}"""),format.raw/*42.18*/(""")

                quill = new Quill('#editor', """),format.raw/*44.46*/("""{"""),format.raw/*44.47*/("""
                    """),format.raw/*45.21*/("""modules: """),format.raw/*45.30*/("""{"""),format.raw/*45.31*/("""
                        """),format.raw/*46.25*/("""toolbar: [
                            ["""),format.raw/*47.30*/("""{"""),format.raw/*47.31*/(""" """),format.raw/*47.32*/("""'font': [] """),format.raw/*47.43*/("""}"""),format.raw/*47.44*/("""],
                            ["""),format.raw/*48.30*/("""{"""),format.raw/*48.31*/(""" """),format.raw/*48.32*/("""'size': ['small', false, 'large', 'huge'] """),format.raw/*48.74*/("""}"""),format.raw/*48.75*/("""],  // custom dropdown
                            ['bold', 'italic', 'underline', 'strike'],        // toggled buttons
                            ["""),format.raw/*50.30*/("""{"""),format.raw/*50.31*/(""" """),format.raw/*50.32*/("""'color': [] """),format.raw/*50.44*/("""}"""),format.raw/*50.45*/(""", """),format.raw/*50.47*/("""{"""),format.raw/*50.48*/(""" """),format.raw/*50.49*/("""'background': [] """),format.raw/*50.66*/("""}"""),format.raw/*50.67*/("""],          // dropdown with defaults from theme
                            ['blockquote'],

                            ["""),format.raw/*53.30*/("""{"""),format.raw/*53.31*/(""" """),format.raw/*53.32*/("""'list': 'ordered'"""),format.raw/*53.49*/("""}"""),format.raw/*53.50*/(""", """),format.raw/*53.52*/("""{"""),format.raw/*53.53*/(""" """),format.raw/*53.54*/("""'list': 'bullet' """),format.raw/*53.71*/("""}"""),format.raw/*53.72*/("""],
                            ["""),format.raw/*54.30*/("""{"""),format.raw/*54.31*/(""" """),format.raw/*54.32*/("""'script': 'sub'"""),format.raw/*54.47*/("""}"""),format.raw/*54.48*/(""", """),format.raw/*54.50*/("""{"""),format.raw/*54.51*/(""" """),format.raw/*54.52*/("""'script': 'super' """),format.raw/*54.70*/("""}"""),format.raw/*54.71*/("""],      // superscript/subscript
                            ["""),format.raw/*55.30*/("""{"""),format.raw/*55.31*/(""" """),format.raw/*55.32*/("""'indent': '-1'"""),format.raw/*55.46*/("""}"""),format.raw/*55.47*/(""", """),format.raw/*55.49*/("""{"""),format.raw/*55.50*/(""" """),format.raw/*55.51*/("""'indent': '+1' """),format.raw/*55.66*/("""}"""),format.raw/*55.67*/("""],          // outdent/indent
                            ["""),format.raw/*56.30*/("""{"""),format.raw/*56.31*/(""" """),format.raw/*56.32*/("""'direction': 'rtl' """),format.raw/*56.51*/("""}"""),format.raw/*56.52*/("""],                         // text directio
                            ["""),format.raw/*57.30*/("""{"""),format.raw/*57.31*/(""" """),format.raw/*57.32*/("""'align': [] """),format.raw/*57.44*/("""}"""),format.raw/*57.45*/("""],
                            ['link', 'image']
                        ]
                    """),format.raw/*60.21*/("""}"""),format.raw/*60.22*/(""",
                    placeholder: 'Enter editor description...',
                    theme: 'snow'
                """),format.raw/*63.17*/("""}"""),format.raw/*63.18*/(""");

                var limit = JobDescriptionMaxLength;
                quill.on('text-change', function (delta, old, source) """),format.raw/*66.71*/("""{"""),format.raw/*66.72*/("""
                    """),format.raw/*67.21*/("""if (quill.getLength() > limit+1) """),format.raw/*67.54*/("""{"""),format.raw/*67.55*/("""
                        """),format.raw/*68.25*/("""document.getElementById("longDescriptionMsg").innerHTML = "Field should be no longer than "+ limit +" characters";
                    """),format.raw/*69.21*/("""}"""),format.raw/*69.22*/("""else"""),format.raw/*69.26*/("""{"""),format.raw/*69.27*/("""
                        """),format.raw/*70.25*/("""document.getElementById("longDescriptionMsg").innerHTML = "";
                    """),format.raw/*71.21*/("""}"""),format.raw/*71.22*/("""
                """),format.raw/*72.17*/("""}"""),format.raw/*72.18*/(""");

                // quill.clipboard.dangerouslyPasteHTML(entityToString());
                //  $("#description").val();
                $("#addPanel").hide();
                $("#previewPanel").hide();
                if($("#showImg").attr("src") == "") """),format.raw/*78.53*/("""{"""),format.raw/*78.54*/("""
                    """),format.raw/*79.21*/("""$("#JobPreview").hide();
                """),format.raw/*80.17*/("""}"""),format.raw/*80.18*/("""
                """),format.raw/*81.17*/("""$("#showPanel").click(function () """),format.raw/*81.51*/("""{"""),format.raw/*81.52*/("""
                    """),format.raw/*82.21*/("""var panel = document.getElementById("addPanel");
                    if (panel.style.display == "none") """),format.raw/*83.56*/("""{"""),format.raw/*83.57*/("""
                        """),format.raw/*84.25*/("""$("#btnName").attr("style", "transform:rotate(-45deg);transition:transform 0.3s linear;");
                        $("#buttonText").text("Close Window");
                    """),format.raw/*86.21*/("""}"""),format.raw/*86.22*/("""
                    """),format.raw/*87.21*/("""else """),format.raw/*87.26*/("""{"""),format.raw/*87.27*/("""
                        """),format.raw/*88.25*/("""$("#btnName").attr("style", "transform:rotate(0deg);transition:transform 0.3s linear;");
                        $("#buttonText").text("Add Members");
                        document.getElementById("memberName").value = "";
                        document.getElementById("email").value = "";
                        document.getElementById("email").classList.remove("invalid");
                        document.getElementById("memberName").classList.remove("invalid");
                    """),format.raw/*94.21*/("""}"""),format.raw/*94.22*/("""
                    """),format.raw/*95.21*/("""$("#addPanel").slideToggle();

                """),format.raw/*97.17*/("""}"""),format.raw/*97.18*/(""");


                //preview the updated image
                $("#addmember").click(function changepic() """),format.raw/*101.60*/("""{"""),format.raw/*101.61*/("""
                    """),format.raw/*102.21*/("""if (document.getElementById("memberName").value.trim().length==0)"""),format.raw/*102.86*/("""{"""),format.raw/*102.87*/("""
                        """),format.raw/*103.25*/("""document.getElementById("memberName").classList.add("invalid");
                    """),format.raw/*104.21*/("""}"""),format.raw/*104.22*/("""
                    """),format.raw/*105.21*/("""if (document.getElementById("email").value.trim().length==0)"""),format.raw/*105.81*/("""{"""),format.raw/*105.82*/("""
                        """),format.raw/*106.25*/("""document.getElementById("email").classList.add("invalid");
                    """),format.raw/*107.21*/("""}"""),format.raw/*107.22*/("""
                    """),format.raw/*108.21*/("""// document.getElementById("email").value.trim().length()==0;
                    var isName = document.getElementById("memberName").classList.contains("invalid") ? false : true;
                    var isEmail = document.getElementById("email").classList.contains("invalid") ? false : true;

                    if(!isName || !isEmail) return;
                    if (document.getElementById("photo").value == "") """),format.raw/*113.71*/("""{"""),format.raw/*113.72*/("""
                        """),format.raw/*114.25*/("""var url = "../../../../assets/images/person.jpg";
                        showPreview(url);
                        return;
                    """),format.raw/*117.21*/("""}"""),format.raw/*117.22*/("""
                    """),format.raw/*118.21*/("""var reads = new FileReader();
                    f = document.getElementById("photo").files[0];
                    reads.readAsDataURL(f);
                    reads.onload = function (e) """),format.raw/*121.49*/("""{"""),format.raw/*121.50*/("""
                        """),format.raw/*122.25*/("""showPreview(this.result);

                    """),format.raw/*124.21*/("""}"""),format.raw/*124.22*/(""";
                """),format.raw/*125.17*/("""}"""),format.raw/*125.18*/(""");
                document.body.scrollTop = document.documentElement.scrollTop = 0;
            """),format.raw/*127.13*/("""}"""),format.raw/*127.14*/(""");

            function entityToString()"""),format.raw/*129.38*/("""{"""),format.raw/*129.39*/("""
                """),format.raw/*130.17*/("""var div=document.createElement('div');
                """),_display_(/*131.18*/if(rajob.getShortDescription!=null)/*131.53*/{_display_(Seq[Any](format.raw/*131.54*/("""
                """),format.raw/*132.17*/("""div.innerHTML = """"),_display_(/*132.35*/rajob/*132.40*/.getShortDescription),format.raw/*132.60*/("""";
                """)))}),format.raw/*133.18*/("""
                """),format.raw/*134.17*/("""var res=div.innerText||div.textContent;
                return res;
            """),format.raw/*136.13*/("""}"""),format.raw/*136.14*/("""

            """),format.raw/*138.13*/("""function getHTML() //display current HTML
            """),format.raw/*139.13*/("""{"""),format.raw/*139.14*/("""
                """),format.raw/*140.17*/("""if(document.getElementById("descriptionMsg").innerText.length != 0)
                    return false;
                console.log(Number.isInteger('fjidsao'));
                //console.log("isnan:" + isNaN($("#JobCreator").text());
                var cid = $("#JobCreator").val()
                console.log("cid" + $("#JobCreator").val());
                console.log("typeof" + typeof($("#JobCreator").val()));

                if(isNaN(cid))"""),format.raw/*148.31*/("""{"""),format.raw/*148.32*/("""
                    """),format.raw/*149.21*/("""//document.getElementById(urlMsgId).setAttribute('data-error', msg);
                    console.log("cidddMSg:" + $("#JobCreatorMsg").text())
                    $("#JobCreatorMsg").text("Please specify correct id format");

                    return false;
                """),format.raw/*154.17*/("""}"""),format.raw/*154.18*/("""
                """),format.raw/*155.17*/("""exist = false;
                $.ajax("""),format.raw/*156.24*/("""{"""),format.raw/*156.25*/("""
                    """),format.raw/*157.21*/("""url: "/user/allUserIds",
                    headers: """),format.raw/*158.30*/("""{"""),format.raw/*158.31*/("""
                        """),format.raw/*159.25*/("""'Content-Type': 'application/json'
                    """),format.raw/*160.21*/("""}"""),format.raw/*160.22*/(""",
                    async: false,
                    type: "GET"
                """),format.raw/*163.17*/("""}"""),format.raw/*163.18*/(""").done(function (data) """),format.raw/*163.41*/("""{"""),format.raw/*163.42*/("""
                    """),format.raw/*164.21*/("""console.log("data:" + data)
                    console.log("id:" + cid)
                    for(i in data)"""),format.raw/*166.35*/("""{"""),format.raw/*166.36*/("""
                        """),format.raw/*167.25*/("""console.log(Number(data[i]) + "," + Number(cid))
                        if(Number(data[i]) == Number(cid))"""),format.raw/*168.59*/("""{"""),format.raw/*168.60*/("""
                            """),format.raw/*169.29*/("""exist = true;
                            console.log("loop:" + exist);
                        """),format.raw/*171.25*/("""}"""),format.raw/*171.26*/("""
                    """),format.raw/*172.21*/("""}"""),format.raw/*172.22*/("""

                """),format.raw/*174.17*/("""}"""),format.raw/*174.18*/(""");
                console.log("out" + exist)
                if(!exist)"""),format.raw/*176.27*/("""{"""),format.raw/*176.28*/("""
                    """),format.raw/*177.21*/("""$("#JobCreatorMsg").text("This user does not exist!");
                    return false;
                """),format.raw/*179.17*/("""}"""),format.raw/*179.18*/("""
                """),format.raw/*180.64*/("""
                """),format.raw/*181.60*/("""
                """),format.raw/*182.54*/("""
                """),format.raw/*183.44*/("""
                """),format.raw/*184.63*/("""
                """),format.raw/*185.93*/("""
                """),format.raw/*186.101*/("""
                """),format.raw/*187.42*/("""
                """),format.raw/*188.63*/("""
                """),format.raw/*189.30*/("""
                """),format.raw/*190.77*/("""
                """),format.raw/*191.53*/("""
                """),format.raw/*192.50*/("""
                """),format.raw/*193.57*/("""
                """),format.raw/*194.37*/("""
                """),format.raw/*195.110*/("""
                """),format.raw/*196.42*/("""
                """),format.raw/*197.52*/("""
                """),format.raw/*198.50*/("""
                """),format.raw/*199.52*/("""
                """),format.raw/*200.46*/("""
                """),format.raw/*201.46*/("""
                """),format.raw/*202.59*/("""
                """),format.raw/*203.55*/("""
                """),format.raw/*204.62*/("""
                """),format.raw/*205.65*/("""
                """),format.raw/*206.35*/("""
                """),format.raw/*207.56*/("""
                """),format.raw/*208.62*/("""
                """),format.raw/*209.34*/("""
                """),format.raw/*210.32*/("""
                """),format.raw/*211.26*/("""
                """),format.raw/*212.24*/("""

                """),format.raw/*214.17*/("""var ajaxflag = true;
                var parentProjectId = $("#parentProjectId").val();
                if(parentProjectId !== "0") """),format.raw/*216.45*/("""{"""),format.raw/*216.46*/("""
                    """),format.raw/*217.21*/("""$.ajax("""),format.raw/*217.28*/("""{"""),format.raw/*217.29*/("""
                        """),format.raw/*218.25*/("""url: "/job/checkParentProject/" + parentProjectId,
                        async: false,
                        headers: """),format.raw/*220.34*/("""{"""),format.raw/*220.35*/("""
                            """),format.raw/*221.29*/("""'Content-Type': 'application/json'
                        """),format.raw/*222.25*/("""}"""),format.raw/*222.26*/(""",
                        type: "GET",
                        success: function (data) """),format.raw/*224.50*/("""{"""),format.raw/*224.51*/("""
                            """),format.raw/*225.29*/("""var response = data;
                            console.log(data);
                            if ('badFormat' in response) """),format.raw/*227.58*/("""{"""),format.raw/*227.59*/("""
                                """),format.raw/*228.33*/("""console.log(response['badFormat']);
                                $("#parentProjectIdMsg").text(response['badFormat']);
                                ajaxflag = false;
                            """),format.raw/*231.29*/("""}"""),format.raw/*231.30*/(""" """),format.raw/*231.31*/("""else """),format.raw/*231.36*/("""{"""),format.raw/*231.37*/("""
                                """),format.raw/*232.33*/("""if ('notExisted' in response) """),format.raw/*232.63*/("""{"""),format.raw/*232.64*/("""
                                    """),format.raw/*233.37*/("""$("#parentProjectIdMsg").text(response['notExisted']);
                                    ajaxflag = false;
                                """),format.raw/*235.33*/("""}"""),format.raw/*235.34*/(""" """),format.raw/*235.35*/("""else """),format.raw/*235.40*/("""{"""),format.raw/*235.41*/("""

                                """),format.raw/*237.33*/("""}"""),format.raw/*237.34*/("""

                            """),format.raw/*239.29*/("""}"""),format.raw/*239.30*/("""
                        """),format.raw/*240.25*/("""}"""),format.raw/*240.26*/("""
                    """),format.raw/*241.21*/("""}"""),format.raw/*241.22*/(""");
                """),format.raw/*242.17*/("""}"""),format.raw/*242.18*/("""
                """),format.raw/*243.17*/("""if(!ajaxflag)"""),format.raw/*243.30*/("""{"""),format.raw/*243.31*/("""
                    """),format.raw/*244.21*/("""return false;
                """),format.raw/*245.17*/("""}"""),format.raw/*245.18*/("""

                """),format.raw/*247.17*/("""var html = quill.root.innerHTML;
                $("#description").val(html);
                $("#countImagesInDescription").val(countImagesInDescription);

                return true;
            """),format.raw/*252.13*/("""}"""),format.raw/*252.14*/("""

            """),format.raw/*254.13*/("""function showProPreview(obj) """),format.raw/*254.42*/("""{"""),format.raw/*254.43*/("""
                """),format.raw/*255.17*/("""if($("#showImg").attr("src") == "") """),format.raw/*255.53*/("""{"""),format.raw/*255.54*/("""
                    """),format.raw/*256.21*/("""$("#deleteBtn").hide();
                """),format.raw/*257.17*/("""}"""),format.raw/*257.18*/("""
                """),format.raw/*258.17*/("""else """),format.raw/*258.22*/("""{"""),format.raw/*258.23*/("""
                    """),format.raw/*259.21*/("""$("#deleteBtn").show();
                    //$('#previewMsg').text("");
                """),format.raw/*261.17*/("""}"""),format.raw/*261.18*/("""
                """),format.raw/*262.17*/("""var panel = document.getElementById("previewPanel");
                if (panel.style.display == "none") """),format.raw/*263.52*/("""{"""),format.raw/*263.53*/("""
                    """),format.raw/*264.21*/("""$(obj).text("Close Preview");
                """),format.raw/*265.17*/("""}"""),format.raw/*265.18*/("""
                """),format.raw/*266.17*/("""else """),format.raw/*266.22*/("""{"""),format.raw/*266.23*/("""
                    """),format.raw/*267.21*/("""$(obj).text("Preview Or Delete Picture");
                """),format.raw/*268.17*/("""}"""),format.raw/*268.18*/("""
                """),format.raw/*269.17*/("""$("#previewPanel").slideToggle();

            """),format.raw/*271.13*/("""}"""),format.raw/*271.14*/("""

            """),format.raw/*273.13*/("""function deleteMember(obj) """),format.raw/*273.40*/("""{"""),format.raw/*273.41*/("""
                """),format.raw/*274.17*/("""var tr  = $(obj).parent().parent();
                if(tr.attr("id") != null) """),format.raw/*275.43*/("""{"""),format.raw/*275.44*/("""
                    """),format.raw/*276.21*/("""tr.append("<td style='display: none;' > <input name ='delete" + delc + "' value='" + tr.attr("id") + "'></td>")
                    //tr.attr("name", "delete" + delc);
                    delc++;
                    $("#delc").val(delc);
                    tr.hide();
                """),format.raw/*281.17*/("""}"""),format.raw/*281.18*/("""
                """),format.raw/*282.17*/("""else tr.remove();
            """),format.raw/*283.13*/("""}"""),format.raw/*283.14*/("""
            """),format.raw/*284.13*/("""function showPreview(url) """),format.raw/*284.39*/("""{"""),format.raw/*284.40*/("""
                """),format.raw/*285.17*/("""if($("#memberName").val() == "")"""),format.raw/*285.49*/("""{"""),format.raw/*285.50*/("""
                    """),format.raw/*286.21*/("""$("#msg").text("Member Name cannot be null.");
                    document.getElementById("addmember").disabled = true;
                    return;
                """),format.raw/*289.17*/("""}"""),format.raw/*289.18*/("""
                """),format.raw/*290.17*/("""$("#msg").text("");
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
            """),format.raw/*309.13*/("""}"""),format.raw/*309.14*/("""

            """),format.raw/*311.13*/("""//preview the updated image
            function changProjectPic() """),format.raw/*312.40*/("""{"""),format.raw/*312.41*/("""
                """),format.raw/*313.17*/("""if(document.getElementById("picture").value == "") return;
                var reads = new FileReader();
                f = document.getElementById("picture").files[0];
                reads.readAsDataURL(f);
                reads.onload = function(e) """),format.raw/*317.44*/("""{"""),format.raw/*317.45*/("""
                    """),format.raw/*318.21*/("""document.getElementById('showImg').src = this.result;
                    $('#record').val("update");
                    $('#previewMsg').text("This is the preview image. You need to click \"UPDATE\" button below if you want to save the changes.");
                    $("#deleteBtn").show();
                    $("#projectPreview").show();
                """),format.raw/*323.17*/("""}"""),format.raw/*323.18*/(""";
            """),format.raw/*324.13*/("""}"""),format.raw/*324.14*/("""

            """),format.raw/*326.13*/("""function deleteImg() """),format.raw/*326.34*/("""{"""),format.raw/*326.35*/("""
                """),format.raw/*327.17*/("""document.getElementById('showImg').src = "";
                $('#record').val("delete");
                $("#deleteBtn").hide();
                $("#projectPreview").hide();
                showProPreview("#projectPreview");
                $('#previewMsg').text("The image is deleted. You need to click \"UPDATE\" button below if you want to save the changes.");
            """),format.raw/*333.13*/("""}"""),format.raw/*333.14*/("""

            """),format.raw/*335.13*/("""function deletePDF() """),format.raw/*335.34*/("""{"""),format.raw/*335.35*/("""
                """),format.raw/*336.17*/("""document.getElementById('showImg').src = "";
                $('#pdfRecord').val("delete");
                $("#pdfDeleteBtn").hide();
                $("#pdfDownload").hide();
                $('#pdfPreviewMsg').text("The PDF is deleted. You need to click \"UPDATE\" button below if you want to save the changes.");
            """),format.raw/*341.13*/("""}"""),format.raw/*341.14*/("""

            """),format.raw/*343.13*/("""function clearPDF(inputId, textId) """),format.raw/*343.48*/("""{"""),format.raw/*343.49*/("""
                """),format.raw/*344.17*/("""console.log("clearFile called for", inputId, textId);
                var fileInput = document.getElementById(inputId);
                if(fileInput) """),format.raw/*346.31*/("""{"""),format.raw/*346.32*/("""
                    """),format.raw/*347.21*/("""fileInput.value = "";
                """),format.raw/*348.17*/("""}"""),format.raw/*348.18*/(""" """),format.raw/*348.19*/("""else """),format.raw/*348.24*/("""{"""),format.raw/*348.25*/("""
                    """),format.raw/*349.21*/("""console.error("Cannot find element with id", inputId);
                """),format.raw/*350.17*/("""}"""),format.raw/*350.18*/("""
                """),format.raw/*351.17*/("""var textInput = document.getElementById(textId);
                if(textInput) """),format.raw/*352.31*/("""{"""),format.raw/*352.32*/("""
                    """),format.raw/*353.21*/("""textInput.value = "";
                    $('#' + textId).trigger('change');
                """),format.raw/*355.17*/("""}"""),format.raw/*355.18*/(""" """),format.raw/*355.19*/("""else """),format.raw/*355.24*/("""{"""),format.raw/*355.25*/("""
                    """),format.raw/*356.21*/("""console.error("Cannot find element with id", textId);
                """),format.raw/*357.17*/("""}"""),format.raw/*357.18*/("""
            """),format.raw/*358.13*/("""}"""),format.raw/*358.14*/("""


    """),format.raw/*361.5*/("""</script>
""")))};
Seq[Any](format.raw/*1.34*/("""
"""),format.raw/*6.1*/("""

"""),format.raw/*362.2*/("""

"""),_display_(/*364.2*/main("Job Apply", scripts)/*364.28*/ {_display_(Seq[Any](format.raw/*364.30*/("""

    """),format.raw/*366.5*/("""<link href='"""),_display_(/*366.18*/routes/*366.24*/.Assets.at("stylesheets/quill.snow.css")),format.raw/*366.64*/("""'
    rel="stylesheet" />
    <script type="text/javascript" src='"""),_display_(/*368.42*/routes/*368.48*/.Assets.at("javascripts/plugins/quill.js")),format.raw/*368.90*/("""'></script>
    <script type="text/javascript" src='"""),_display_(/*369.42*/routes/*369.48*/.Assets.at("javascripts/field_validation_helper.js")),format.raw/*369.100*/("""'></script>

    <div class="container">
        <div class="row">
            <div class="col  s12 m10 offset-m1">
                <div class="card-panel">
                    <h4 class="center form-signin-heading" align="center">
                        RA Job Application Page</h4>
                    <div id="warningModal" class="modal">
                        <div class="modal-content">
                            <h5 style="color: red">Warning!</h5>
                            <p style="font-weight: bold">Do you really want to change the creator of this job?
                                Please note that after this change, You <span style="color: red">
                                MAY NOT</span> edit this job again.</p>
                        </div>
                        <div class="modal-footer">
                            <a id="cancel-change-creator" class="modal-close waves-effect waves-green btn-flat">
                                Cancel</a>
                            <a id="confirm-change-creator"
                            class="modal-close waves-effect waves-green btn-flat">Confirm</a>
                        </div>
                    </div>
                    <form class="form-signin" enctype="multipart/form-data" id="editProjectForm" method="post" onsubmit="return getHTML()" action=""""),_display_(/*391.149*/routes/*391.155*/.RAJobController.rajobApplyPOST(rajob.getId)),format.raw/*391.199*/("""">
                        <div id="hiddenDiv" style="display: none;">
                            <input name="isActive" id="isActive" class="validate" value=""""),_display_(/*393.91*/rajob/*393.96*/.getIsActive),format.raw/*393.108*/("""">
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <label>RA Job Title: """),_display_(/*397.55*/rajob/*397.60*/.getTitle),format.raw/*397.69*/(""" """),format.raw/*397.70*/("""</label>
                                <span id="JobTitleMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>

                        <div class="row">
                            <div class="input-field col s12">
                                <input type="text" name="applyHeadline" id="applyHeadline" class="validate" required>
                                <label for="applyHeadline">
                                    Apply Headline* </label>
                                <span id="applyHeadlineMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>

                        <div class="row">
                            <div class="input-field col s12">
                                <textarea type="text" style="height: 200px;
                                    word-wtap: break-word; margin-top: 10px;" id="applyCoverLetter" placeholder="" name="applyCoverLetter" required></textarea>
                                <label for="applyCoverLetter">Cover Letter*</label>
                                <span id="applyCoverLetterMsg" class="helper-text" data-error="" style="color: red; font-size: 12px"></span>
                            </div>
                        </div>

                        Referees1 Info:
                        <div class="row">
                            <div class="input-field col s12 m2">
                                <input type="text" name="referee1Title" id="referee1Title" class="validate">
                                <label for="referee1Title">
                                    Title </label>
                                <span id="referee1TitleMsg" class="helper-text" data-error=""></span>
                            </div>
                            <div class="input-field col s12 m5">
                                <input type="text" name="referee1FirstName" id="referee1FirstName" class="validate">
                                <label for="referee1FirstName">
                                    First name </label>
                                <span id="referee1FirstNameMsg" class="helper-text" data-error=""></span>
                            </div>
                            <div class="input-field col s12 m5">
                                <input type="text" name="referee1LastName" id="referee1LastName" class="validate">
                                <label for="referee1LastName">
                                    Last name </label>
                                <span id="referee1LastNameMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>

                        <div class="row">
                            <div class="input-field col s12 m6">
                                <input type="text" name="referee1Email" id="referee1Email" class="validate" onchange="validateRegex(this.id, 'EMAIL')">
                                <label for="referee1Email">
                                    Email </label>
                                <span id="referee1EmailMsg" class="helper-text" data-success="✓" data-error="Please input a valid email"></span>
                            </div>

                            <div class="input-field col s12 m6">
                                <input type="text" name="referee1Phone" id="referee1Phone" class="validate" onchange="validateRegex(this.id, 'PHONE')">
                                <label for="referee1Phone">
                                    Phone </label>
                                <span id="referee1PhoneMsg" class="helper-text" data-success="✓" data-error="Please input a valid phone number"></span>
                            </div>
                        </div>

                        Referees2 Info:
                        <div class="row">
                            <div class="input-field col s12 m2">
                                <input type="text" name="referee2Title" id="referee2Title">
                                <label for="referee2Title">
                                    Title </label>
                                <span id="referee2TitleMsg" class="helper-text" data-error=""></span>
                            </div>
                            <div class="input-field col s12 m5">
                                <input type="text" name="referee2FirstName" id="referee2FirstName" >
                                <label for="referee2FirstName">
                                    First name </label>
                                <span id="referee2FirstNameMsg" class="helper-text" data-error=""></span>
                            </div>
                            <div class="input-field col s12 m5">
                                <input type="text" name="referee2LastName" id="referee2LastName">
                                <label for="referee2LastName">
                                    Last name </label>
                                <span id="referee2LastNameMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>

                        <div class="row">
                            <div class="input-field col s12 m6">
                                <input type="text" name="referee2Email" id="referee2Email" class="validate" onchange="validateRegex(this.id, 'EMAIL')">
                                <label for="referee2Email">
                                    Email </label>
                                <span id="referee2EmailMsg" class="helper-text" data-success="✓" data-error="Please input a valid email"></span>
                            </div>

                            <div class="input-field col s12 m6">
                                <input type="text" name="referee2Phone" id="referee2Phone" class="validate" onchange="validateRegex(this.id, 'PHONE')">
                                <label for="referee2Phone">
                                    Phone </label>
                                <span id="referee2PhoneMsg" class="helper-text" data-success="✓" data-error="Please input a valid phone number"></span>
                            </div>
                        </div>

                        Referees3 Info:
                        <div class="row">
                            <div class="input-field col s12 m2">
                                <input type="text" name="referee3Title" id="referee3Title">
                                <label for="referee3Title">
                                    Title </label>
                                <span id="referee3TitleMsg" class="helper-text" data-error=""></span>
                            </div>
                            <div class="input-field col s12 m5">
                                <input type="text" name="referee3FirstName" id="referee3FirstName" >
                                <label for="referee3FirstName">
                                    First name </label>
                                <span id="referee3FirstNameMsg" class="helper-text" data-error=""></span>
                            </div>
                            <div class="input-field col s12 m5">
                                <input type="text" name="referee3LastName" id="referee3LastName">
                                <label for="referee3LastName">
                                    Last name </label>
                                <span id="referee3LastNameMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>

                        <div class="row">
                            <div class="input-field col s12 m6">
                                <input type="text" name="referee3Email" id="referee3Email" class="validate" onchange="validateRegex(this.id, 'EMAIL')">
                                <label for="referee3Email">
                                    Email </label>
                                <span id="referee3EmailMsg" class="helper-text" data-success="✓" data-error="Please input a valid email"></span>
                            </div>

                            <div class="input-field col s12 m6">
                                <input type="text" name="referee3Phone" id="referee3Phone" class="validate" onchange="validateRegex(this.id, 'PHONE')">
                                <label for="referee3Phone">
                                    Phone </label>
                                <span id="referee3PhoneMsg" class="helper-text" data-success="✓" data-error="Please input a valid phone number"></span>
                            </div>
                        </div>


                        Personal Document Upload
                        <div class="row">

                            <div class="file-field input-field col s12">
                                <div style="display: flex; align-items: center;">
                                    <div class="btn waves-effect waves-light blue darken-2" style="margin-right: 10px;">
                                        <span>Resume</span>
                                        <input type="file" accept=".pdf" id="resumePdf" name="resumePdf">
                                    </div>
                                    <div class="file-path-wrapper" style="flex-grow: 1;">
                                        <input class="file-path validate" type="text" placeholder="Upload resume PDF" id="filePathResume" readonly>
                                    </div>
                                    <button type="button" class="btn-small red" onclick="clearPDF('resumePdf', 'filePathResume')" style="margin-left: 10px;">
                                    Cancel
                                    </button>
                                    </div>
                                    <div id="resumePreviewMsg" style="color:blue"></div>
                                    <input id="resumePdfRecord" name="resumePdfRecord" style="display: none;"/>
                                    </div>

                                    <div class="file-field input-field col s12">
                                    <div style="display: flex; align-items: center;">
                                    <div class="btn waves-effect waves-light blue darken-2" style="margin-right: 10px;">
                                    <span>Cover Letter</span>
                                    <input type="file" accept=".pdf" id="coverLetterPdf" name="coverLetterPdf">
                                    </div>
                                    <div class="file-path-wrapper" style="flex-grow: 1;">
                                    <input class="file-path validate" type="text" placeholder="Upload cover letter PDF" id="filePathCoverLetter" readonly>
                                    </div>
                                    <button type="button" class="btn-small red" onclick="clearPDF('coverLetterPdf', 'filePathCoverLetter')" style="margin-left: 10px;">
                                    Cancel
                                    </button>
                                    </div>
                                    <div id="coverLetterPreviewMsg" style="color:blue"></div>
                                    <input id="coverLetterPdfRecord" name="coverLetterPdfRecord" style="display: none;"/>
                                    </div>

                                    <div class="file-field input-field col s12">
                                    <div style="display: flex; align-items: center;">
                                    <div class="btn waves-effect waves-light blue darken-2" style="margin-right: 10px;">
                                    <span>Transcript File</span>
                                    <input type="file" accept=".pdf" id="transcriptFile" name="transcriptFile">
                                    </div>
                                    <div class="file-path-wrapper" style="flex-grow: 1;">
                                    <input class="file-path validate" type="text" placeholder="Upload transcript PDF" id="filePathTranscript" readonly>
                                    </div>
                                    <button type="button" class="btn-small red" onclick="clearPDF('transcriptFile', 'filePathTranscript')" style="margin-left: 10px;">
                                    Cancel
                                    </button>
                                    </div>
                                    <div id="transcriptPreviewMsg" style="color:blue"></div>
                                    <input id="transcriptFileRecord" name="transcriptFileRecord" style="display: none;"/>
                                    </div>

                                    <div class="file-field input-field col s12">
                                    <div style="display: flex; align-items: center;">
                                    <div class="btn waves-effect waves-light blue darken-2" style="margin-right: 10px;">
                                    <span>Degree Certificate</span>
                                    <input type="file" accept=".pdf" id="degreeCertificatePdf" name="degreeCertificatePdf">
                                    </div>
                                    <div class="file-path-wrapper" style="flex-grow: 1;">
                                    <input class="file-path validate" type="text" placeholder="Upload degree certificate PDF" id="filePathDegreeCertificate" readonly>
                                    </div>
                                    <button type="button" class="btn-small red" onclick="clearPDF('degreeCertificatePdf', 'filePathDegreeCertificate')" style="margin-left: 10px;">
                                    Cancel
                                    </button>
                                    </div>
                                    <div id="degreeCertificatePreviewMsg" style="color:blue"></div>
                                    <input id="degreeCertificatePdfRecord" name="degreeCertificatePdfRecord" style="display: none;"/>
                                    </div>

                                    </div>

                        <div class="actions row center">
                            <div class="input-field col s12">
                                <button type="submit" id="JobApplication" class="btn waves-effect waves-light blue darken-2">
                                    Submit</button>
                                <a href=""""),_display_(/*612.43*/routes/*612.49*/.RAJobController.rajobDetail(rajob.getId)),format.raw/*612.90*/("""" class="btn waves-effect waves-light red darken-2">
                                    Cancel</a>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>

""")))}),format.raw/*622.2*/("""
"""))
      }
    }
  }

  def render(rajob:RAJob,userTypes:String): play.twirl.api.HtmlFormat.Appendable = apply(rajob,userTypes)

  def f:((RAJob,String) => play.twirl.api.HtmlFormat.Appendable) = (rajob,userTypes) => apply(rajob,userTypes)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:35 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/rajobApplication.scala.html
                  HASH: 7c159d31c3dae7724d7b8f395981075446e13196
                  MATRIX: 1128->1|1233->35|1256->52|1279->69|1308->92|1340->115|1354->122|1434->126|1465->131|1516->154|1545->155|1590->172|1651->205|1680->206|1721->219|1752->222|1781->223|1826->240|1886->272|1915->273|1956->286|2001->303|2030->304|2075->321|2133->351|2162->352|2203->365|2239->373|2268->374|2313->391|2368->418|2397->419|2429->424|2506->474|2521->480|2592->530|2672->583|2687->589|2761->641|2973->825|3002->826|3047->843|3167->935|3196->936|3237->949|3295->979|3324->980|3369->997|3414->1015|3428->1020|3473->1044|3566->1109|3595->1110|3644->1131|3725->1184|3754->1185|3847->1250|3876->1251|3925->1272|4009->1328|4038->1329|4114->1377|4143->1378|4192->1399|4229->1408|4258->1409|4311->1434|4379->1474|4408->1475|4437->1476|4476->1487|4505->1488|4565->1520|4594->1521|4623->1522|4693->1564|4722->1565|4899->1714|4928->1715|4957->1716|4997->1728|5026->1729|5056->1731|5085->1732|5114->1733|5159->1750|5188->1751|5339->1874|5368->1875|5397->1876|5442->1893|5471->1894|5501->1896|5530->1897|5559->1898|5604->1915|5633->1916|5693->1948|5722->1949|5751->1950|5794->1965|5823->1966|5853->1968|5882->1969|5911->1970|5957->1988|5986->1989|6076->2051|6105->2052|6134->2053|6176->2067|6205->2068|6235->2070|6264->2071|6293->2072|6336->2087|6365->2088|6452->2147|6481->2148|6510->2149|6557->2168|6586->2169|6687->2242|6716->2243|6745->2244|6785->2256|6814->2257|6937->2352|6966->2353|7110->2469|7139->2470|7294->2597|7323->2598|7372->2619|7433->2652|7462->2653|7515->2678|7678->2813|7707->2814|7739->2818|7768->2819|7821->2844|7931->2926|7960->2927|8005->2944|8034->2945|8320->3203|8349->3204|8398->3225|8467->3266|8496->3267|8541->3284|8603->3318|8632->3319|8681->3340|8813->3444|8842->3445|8895->3470|9097->3644|9126->3645|9175->3666|9208->3671|9237->3672|9290->3697|9809->4188|9838->4189|9887->4210|9962->4257|9991->4258|10128->4366|10158->4367|10208->4388|10302->4453|10332->4454|10386->4479|10499->4563|10529->4564|10579->4585|10668->4645|10698->4646|10752->4671|10860->4750|10890->4751|10940->4772|11384->5187|11414->5188|11468->5213|11641->5357|11671->5358|11721->5379|11939->5568|11969->5569|12023->5594|12099->5641|12129->5642|12176->5660|12206->5661|12332->5758|12362->5759|12432->5800|12462->5801|12508->5818|12592->5874|12637->5909|12677->5910|12723->5927|12769->5945|12784->5950|12826->5970|12878->5990|12924->6007|13033->6087|13063->6088|13106->6102|13189->6156|13219->6157|13265->6174|13740->6620|13770->6621|13820->6642|14125->6918|14155->6919|14201->6936|14268->6974|14298->6975|14348->6996|14431->7050|14461->7051|14515->7076|14599->7131|14629->7132|14742->7216|14772->7217|14824->7240|14854->7241|14904->7262|15040->7369|15070->7370|15124->7395|15260->7502|15290->7503|15348->7532|15473->7628|15503->7629|15553->7650|15583->7651|15630->7669|15660->7670|15761->7742|15791->7743|15841->7764|15975->7869|16005->7870|16051->7934|16097->7994|16143->8048|16189->8092|16235->8155|16281->8248|16328->8349|16374->8391|16420->8454|16466->8484|16512->8561|16558->8614|16604->8664|16650->8721|16696->8758|16743->8868|16789->8910|16835->8962|16881->9012|16927->9064|16973->9110|17019->9156|17065->9215|17111->9270|17157->9332|17203->9397|17249->9432|17295->9488|17341->9550|17387->9584|17433->9616|17479->9642|17525->9666|17572->9684|17733->9816|17763->9817|17813->9838|17849->9845|17879->9846|17933->9871|18084->9993|18114->9994|18172->10023|18260->10082|18290->10083|18407->10171|18437->10172|18495->10201|18649->10326|18679->10327|18741->10360|18970->10560|19000->10561|19030->10562|19064->10567|19094->10568|19156->10601|19215->10631|19245->10632|19311->10669|19481->10810|19511->10811|19541->10812|19575->10817|19605->10818|19668->10852|19698->10853|19757->10883|19787->10884|19841->10909|19871->10910|19921->10931|19951->10932|19999->10951|20029->10952|20075->10969|20117->10982|20147->10983|20197->11004|20256->11034|20286->11035|20333->11053|20560->11251|20590->11252|20633->11266|20691->11295|20721->11296|20767->11313|20832->11349|20862->11350|20912->11371|20981->11411|21011->11412|21057->11429|21091->11434|21121->11435|21171->11456|21289->11545|21319->11546|21365->11563|21498->11667|21528->11668|21578->11689|21653->11735|21683->11736|21729->11753|21763->11758|21793->11759|21843->11780|21930->11838|21960->11839|22006->11856|22082->11903|22112->11904|22155->11918|22211->11945|22241->11946|22287->11963|22394->12041|22424->12042|22474->12063|22788->12348|22818->12349|22864->12366|22923->12396|22953->12397|22995->12410|23050->12436|23080->12437|23126->12454|23187->12486|23217->12487|23267->12508|23461->12673|23491->12674|23537->12691|24937->14062|24967->14063|25010->14077|25106->14144|25136->14145|25182->14162|25464->14415|25494->14416|25544->14437|25932->14796|25962->14797|26005->14811|26035->14812|26078->14826|26128->14847|26158->14848|26204->14865|26609->15241|26639->15242|26682->15256|26732->15277|26762->15278|26808->15295|27166->15624|27196->15625|27239->15639|27303->15674|27333->15675|27379->15692|27558->15842|27588->15843|27638->15864|27705->15902|27735->15903|27765->15904|27799->15909|27829->15910|27879->15931|27979->16002|28009->16003|28055->16020|28163->16099|28193->16100|28243->16121|28365->16214|28395->16215|28425->16216|28459->16221|28489->16222|28539->16243|28638->16313|28668->16314|28710->16327|28740->16328|28775->16335|28825->33|28852->112|28882->16346|28912->16349|28948->16375|28989->16377|29023->16383|29064->16396|29080->16402|29142->16442|29237->16509|29253->16515|29317->16557|29398->16610|29414->16616|29489->16668|30856->18006|30873->18012|30940->18056|31129->18217|31144->18222|31179->18234|31399->18426|31414->18431|31445->18440|31475->18441|46159->33097|46175->33103|46238->33144|46533->33408
                  LINES: 35->1|38->2|39->3|40->4|41->5|43->8|43->8|45->8|46->9|47->10|47->10|48->11|49->12|49->12|50->13|50->13|50->13|51->14|52->15|52->15|53->16|53->16|53->16|54->17|55->18|55->18|56->19|56->19|56->19|57->20|58->21|58->21|59->22|60->23|60->23|60->23|61->24|61->24|61->24|68->31|68->31|69->32|71->34|71->34|72->35|72->35|72->35|73->36|73->36|73->36|73->36|74->37|74->37|75->38|76->39|76->39|77->40|77->40|78->41|79->42|79->42|81->44|81->44|82->45|82->45|82->45|83->46|84->47|84->47|84->47|84->47|84->47|85->48|85->48|85->48|85->48|85->48|87->50|87->50|87->50|87->50|87->50|87->50|87->50|87->50|87->50|87->50|90->53|90->53|90->53|90->53|90->53|90->53|90->53|90->53|90->53|90->53|91->54|91->54|91->54|91->54|91->54|91->54|91->54|91->54|91->54|91->54|92->55|92->55|92->55|92->55|92->55|92->55|92->55|92->55|92->55|92->55|93->56|93->56|93->56|93->56|93->56|94->57|94->57|94->57|94->57|94->57|97->60|97->60|100->63|100->63|103->66|103->66|104->67|104->67|104->67|105->68|106->69|106->69|106->69|106->69|107->70|108->71|108->71|109->72|109->72|115->78|115->78|116->79|117->80|117->80|118->81|118->81|118->81|119->82|120->83|120->83|121->84|123->86|123->86|124->87|124->87|124->87|125->88|131->94|131->94|132->95|134->97|134->97|138->101|138->101|139->102|139->102|139->102|140->103|141->104|141->104|142->105|142->105|142->105|143->106|144->107|144->107|145->108|150->113|150->113|151->114|154->117|154->117|155->118|158->121|158->121|159->122|161->124|161->124|162->125|162->125|164->127|164->127|166->129|166->129|167->130|168->131|168->131|168->131|169->132|169->132|169->132|169->132|170->133|171->134|173->136|173->136|175->138|176->139|176->139|177->140|185->148|185->148|186->149|191->154|191->154|192->155|193->156|193->156|194->157|195->158|195->158|196->159|197->160|197->160|200->163|200->163|200->163|200->163|201->164|203->166|203->166|204->167|205->168|205->168|206->169|208->171|208->171|209->172|209->172|211->174|211->174|213->176|213->176|214->177|216->179|216->179|217->180|218->181|219->182|220->183|221->184|222->185|223->186|224->187|225->188|226->189|227->190|228->191|229->192|230->193|231->194|232->195|233->196|234->197|235->198|236->199|237->200|238->201|239->202|240->203|241->204|242->205|243->206|244->207|245->208|246->209|247->210|248->211|249->212|251->214|253->216|253->216|254->217|254->217|254->217|255->218|257->220|257->220|258->221|259->222|259->222|261->224|261->224|262->225|264->227|264->227|265->228|268->231|268->231|268->231|268->231|268->231|269->232|269->232|269->232|270->233|272->235|272->235|272->235|272->235|272->235|274->237|274->237|276->239|276->239|277->240|277->240|278->241|278->241|279->242|279->242|280->243|280->243|280->243|281->244|282->245|282->245|284->247|289->252|289->252|291->254|291->254|291->254|292->255|292->255|292->255|293->256|294->257|294->257|295->258|295->258|295->258|296->259|298->261|298->261|299->262|300->263|300->263|301->264|302->265|302->265|303->266|303->266|303->266|304->267|305->268|305->268|306->269|308->271|308->271|310->273|310->273|310->273|311->274|312->275|312->275|313->276|318->281|318->281|319->282|320->283|320->283|321->284|321->284|321->284|322->285|322->285|322->285|323->286|326->289|326->289|327->290|346->309|346->309|348->311|349->312|349->312|350->313|354->317|354->317|355->318|360->323|360->323|361->324|361->324|363->326|363->326|363->326|364->327|370->333|370->333|372->335|372->335|372->335|373->336|378->341|378->341|380->343|380->343|380->343|381->344|383->346|383->346|384->347|385->348|385->348|385->348|385->348|385->348|386->349|387->350|387->350|388->351|389->352|389->352|390->353|392->355|392->355|392->355|392->355|392->355|393->356|394->357|394->357|395->358|395->358|398->361|400->1|401->6|403->362|405->364|405->364|405->364|407->366|407->366|407->366|407->366|409->368|409->368|409->368|410->369|410->369|410->369|432->391|432->391|432->391|434->393|434->393|434->393|438->397|438->397|438->397|438->397|653->612|653->612|653->612|663->622
                  -- GENERATED --
              */
          