
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

object jobApplication extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Job,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(job: Job,userTypes: String):play.twirl.api.HtmlFormat.Appendable = {
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
            function checkCreator() """),format.raw/*31.37*/("""{"""),format.raw/*31.38*/("""
                """),format.raw/*32.17*/("""$("#warningModal").modal("open");
                $("#JobCreatorMsg").text("");
            """),format.raw/*34.13*/("""}"""),format.raw/*34.14*/("""
            """),format.raw/*35.13*/("""$(document).ready(function () """),format.raw/*35.43*/("""{"""),format.raw/*35.44*/("""
                """),format.raw/*36.17*/("""originCreator = '"""),_display_(/*36.35*/job/*36.38*/.getJobPublisher.getId),format.raw/*36.60*/("""';
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
                """),_display_(/*131.18*/if(job.getShortDescription!=null)/*131.51*/{_display_(Seq[Any](format.raw/*131.52*/("""
                """),format.raw/*132.17*/("""div.innerHTML = """"),_display_(/*132.35*/job/*132.38*/.getShortDescription),format.raw/*132.58*/("""";
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
Seq[Any](format.raw/*1.30*/("""
"""),format.raw/*6.1*/("""

"""),format.raw/*362.2*/("""

"""),_display_(/*364.2*/main("Job Apply", scripts)/*364.28*/ {_display_(Seq[Any](format.raw/*364.30*/("""

    """),format.raw/*366.5*/("""<link href='"""),_display_(/*366.18*/routes/*366.24*/.Assets.at("stylesheets/quill.snow.css")),format.raw/*366.64*/("""'
    rel="stylesheet" />
    <script type="text/javascript" src='"""),_display_(/*368.42*/routes/*368.48*/.Assets.at("../../public/javascripts/plugins/quill.js")),format.raw/*368.103*/("""'></script>
    <script type="text/javascript" src='"""),_display_(/*369.42*/routes/*369.48*/.Assets.at("javascripts/field_validation_helper.js")),format.raw/*369.100*/("""'></script>

    <div class="container">
        <div class="row">
            <div class="col  s12 m10 offset-m1">
                <div class="card-panel">
                    <h4 class="center form-signin-heading" align="center">
                        Job Application Page</h4>
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

                    <form "form-signin" enctype="multipart/form-data" id="applyJobForm" method="post" onsubmit="return getHTML()" action=""""),_display_(/*392.140*/routes/*392.146*/.JobController.jobApplyPOST(job.getId)),format.raw/*392.184*/("""">
                        <div id="hiddenDiv" style="display: none;">
                            <input name="isActive" id="isActive" class="validate" value=""""),_display_(/*394.91*/job/*394.94*/.getIsActive),format.raw/*394.106*/("""">
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <label>Job Title: """),_display_(/*398.52*/job/*398.55*/.getTitle),format.raw/*398.64*/(""" """),format.raw/*398.65*/("""</label>
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
                                <a href=""""),_display_(/*612.43*/routes/*612.49*/.JobController.jobDetail(job.getId)),format.raw/*612.84*/("""" class="btn waves-effect waves-light red darken-2">
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

  def render(job:Job,userTypes:String): play.twirl.api.HtmlFormat.Appendable = apply(job,userTypes)

  def f:((Job,String) => play.twirl.api.HtmlFormat.Appendable) = (job,userTypes) => apply(job,userTypes)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:32 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/jobApplication.scala.html
                  HASH: 5c410f1a2df3a846459cce19525b95418c42c263
                  MATRIX: 1124->1|1225->31|1248->48|1271->65|1300->88|1330->109|1344->116|1424->120|1455->125|1506->148|1535->149|1580->166|1641->199|1670->200|1711->213|1742->216|1771->217|1816->234|1876->266|1905->267|1946->280|1991->297|2020->298|2065->315|2123->345|2152->346|2193->359|2229->367|2258->368|2303->385|2358->412|2387->413|2419->418|2496->468|2511->474|2582->524|2662->577|2677->583|2751->635|2963->819|2992->820|3037->837|3157->929|3186->930|3227->943|3285->973|3314->974|3359->991|3404->1009|3416->1012|3459->1034|3552->1099|3581->1100|3630->1121|3711->1174|3740->1175|3833->1240|3862->1241|3911->1262|3995->1318|4024->1319|4100->1367|4129->1368|4178->1389|4215->1398|4244->1399|4297->1424|4365->1464|4394->1465|4423->1466|4462->1477|4491->1478|4551->1510|4580->1511|4609->1512|4679->1554|4708->1555|4885->1704|4914->1705|4943->1706|4983->1718|5012->1719|5042->1721|5071->1722|5100->1723|5145->1740|5174->1741|5325->1864|5354->1865|5383->1866|5428->1883|5457->1884|5487->1886|5516->1887|5545->1888|5590->1905|5619->1906|5679->1938|5708->1939|5737->1940|5780->1955|5809->1956|5839->1958|5868->1959|5897->1960|5943->1978|5972->1979|6062->2041|6091->2042|6120->2043|6162->2057|6191->2058|6221->2060|6250->2061|6279->2062|6322->2077|6351->2078|6438->2137|6467->2138|6496->2139|6543->2158|6572->2159|6673->2232|6702->2233|6731->2234|6771->2246|6800->2247|6923->2342|6952->2343|7096->2459|7125->2460|7280->2587|7309->2588|7358->2609|7419->2642|7448->2643|7501->2668|7664->2803|7693->2804|7725->2808|7754->2809|7807->2834|7917->2916|7946->2917|7991->2934|8020->2935|8306->3193|8335->3194|8384->3215|8453->3256|8482->3257|8527->3274|8589->3308|8618->3309|8667->3330|8799->3434|8828->3435|8881->3460|9083->3634|9112->3635|9161->3656|9194->3661|9223->3662|9276->3687|9795->4178|9824->4179|9873->4200|9948->4247|9977->4248|10114->4356|10144->4357|10194->4378|10288->4443|10318->4444|10372->4469|10485->4553|10515->4554|10565->4575|10654->4635|10684->4636|10738->4661|10846->4740|10876->4741|10926->4762|11370->5177|11400->5178|11454->5203|11627->5347|11657->5348|11707->5369|11925->5558|11955->5559|12009->5584|12085->5631|12115->5632|12162->5650|12192->5651|12318->5748|12348->5749|12418->5790|12448->5791|12494->5808|12578->5864|12621->5897|12661->5898|12707->5915|12753->5933|12766->5936|12808->5956|12860->5976|12906->5993|13015->6073|13045->6074|13088->6088|13171->6142|13201->6143|13247->6160|13722->6606|13752->6607|13802->6628|14107->6904|14137->6905|14183->6922|14250->6960|14280->6961|14330->6982|14413->7036|14443->7037|14497->7062|14581->7117|14611->7118|14724->7202|14754->7203|14806->7226|14836->7227|14886->7248|15022->7355|15052->7356|15106->7381|15242->7488|15272->7489|15330->7518|15455->7614|15485->7615|15535->7636|15565->7637|15612->7655|15642->7656|15743->7728|15773->7729|15823->7750|15957->7855|15987->7856|16033->7920|16079->7980|16125->8034|16171->8078|16217->8141|16263->8234|16310->8335|16356->8377|16402->8440|16448->8470|16494->8547|16540->8600|16586->8650|16632->8707|16678->8744|16725->8854|16771->8896|16817->8948|16863->8998|16909->9050|16955->9096|17001->9142|17047->9201|17093->9256|17139->9318|17185->9383|17231->9418|17277->9474|17323->9536|17369->9570|17415->9602|17461->9628|17507->9652|17554->9670|17715->9802|17745->9803|17795->9824|17831->9831|17861->9832|17915->9857|18066->9979|18096->9980|18154->10009|18242->10068|18272->10069|18389->10157|18419->10158|18477->10187|18631->10312|18661->10313|18723->10346|18952->10546|18982->10547|19012->10548|19046->10553|19076->10554|19138->10587|19197->10617|19227->10618|19293->10655|19463->10796|19493->10797|19523->10798|19557->10803|19587->10804|19650->10838|19680->10839|19739->10869|19769->10870|19823->10895|19853->10896|19903->10917|19933->10918|19981->10937|20011->10938|20057->10955|20099->10968|20129->10969|20179->10990|20238->11020|20268->11021|20315->11039|20542->11237|20572->11238|20615->11252|20673->11281|20703->11282|20749->11299|20814->11335|20844->11336|20894->11357|20963->11397|20993->11398|21039->11415|21073->11420|21103->11421|21153->11442|21271->11531|21301->11532|21347->11549|21480->11653|21510->11654|21560->11675|21635->11721|21665->11722|21711->11739|21745->11744|21775->11745|21825->11766|21912->11824|21942->11825|21988->11842|22064->11889|22094->11890|22137->11904|22193->11931|22223->11932|22269->11949|22376->12027|22406->12028|22456->12049|22770->12334|22800->12335|22846->12352|22905->12382|22935->12383|22977->12396|23032->12422|23062->12423|23108->12440|23169->12472|23199->12473|23249->12494|23443->12659|23473->12660|23519->12677|24919->14048|24949->14049|24992->14063|25088->14130|25118->14131|25164->14148|25446->14401|25476->14402|25526->14423|25914->14782|25944->14783|25987->14797|26017->14798|26060->14812|26110->14833|26140->14834|26186->14851|26591->15227|26621->15228|26664->15242|26714->15263|26744->15264|26790->15281|27148->15610|27178->15611|27221->15625|27285->15660|27315->15661|27361->15678|27540->15828|27570->15829|27620->15850|27687->15888|27717->15889|27747->15890|27781->15895|27811->15896|27861->15917|27961->15988|27991->15989|28037->16006|28145->16085|28175->16086|28225->16107|28347->16200|28377->16201|28407->16202|28441->16207|28471->16208|28521->16229|28620->16299|28650->16300|28692->16313|28722->16314|28757->16321|28807->29|28834->106|28864->16332|28894->16335|28930->16361|28971->16363|29005->16369|29046->16382|29062->16388|29124->16428|29219->16495|29235->16501|29313->16556|29394->16609|29410->16615|29485->16667|30841->17994|30858->18000|30919->18038|31108->18199|31121->18202|31156->18214|31373->18403|31386->18406|31417->18415|31447->18416|46118->33059|46134->33065|46191->33100|46486->33364
                  LINES: 35->1|38->2|39->3|40->4|41->5|43->8|43->8|45->8|46->9|47->10|47->10|48->11|49->12|49->12|50->13|50->13|50->13|51->14|52->15|52->15|53->16|53->16|53->16|54->17|55->18|55->18|56->19|56->19|56->19|57->20|58->21|58->21|59->22|60->23|60->23|60->23|61->24|61->24|61->24|68->31|68->31|69->32|71->34|71->34|72->35|72->35|72->35|73->36|73->36|73->36|73->36|74->37|74->37|75->38|76->39|76->39|77->40|77->40|78->41|79->42|79->42|81->44|81->44|82->45|82->45|82->45|83->46|84->47|84->47|84->47|84->47|84->47|85->48|85->48|85->48|85->48|85->48|87->50|87->50|87->50|87->50|87->50|87->50|87->50|87->50|87->50|87->50|90->53|90->53|90->53|90->53|90->53|90->53|90->53|90->53|90->53|90->53|91->54|91->54|91->54|91->54|91->54|91->54|91->54|91->54|91->54|91->54|92->55|92->55|92->55|92->55|92->55|92->55|92->55|92->55|92->55|92->55|93->56|93->56|93->56|93->56|93->56|94->57|94->57|94->57|94->57|94->57|97->60|97->60|100->63|100->63|103->66|103->66|104->67|104->67|104->67|105->68|106->69|106->69|106->69|106->69|107->70|108->71|108->71|109->72|109->72|115->78|115->78|116->79|117->80|117->80|118->81|118->81|118->81|119->82|120->83|120->83|121->84|123->86|123->86|124->87|124->87|124->87|125->88|131->94|131->94|132->95|134->97|134->97|138->101|138->101|139->102|139->102|139->102|140->103|141->104|141->104|142->105|142->105|142->105|143->106|144->107|144->107|145->108|150->113|150->113|151->114|154->117|154->117|155->118|158->121|158->121|159->122|161->124|161->124|162->125|162->125|164->127|164->127|166->129|166->129|167->130|168->131|168->131|168->131|169->132|169->132|169->132|169->132|170->133|171->134|173->136|173->136|175->138|176->139|176->139|177->140|185->148|185->148|186->149|191->154|191->154|192->155|193->156|193->156|194->157|195->158|195->158|196->159|197->160|197->160|200->163|200->163|200->163|200->163|201->164|203->166|203->166|204->167|205->168|205->168|206->169|208->171|208->171|209->172|209->172|211->174|211->174|213->176|213->176|214->177|216->179|216->179|217->180|218->181|219->182|220->183|221->184|222->185|223->186|224->187|225->188|226->189|227->190|228->191|229->192|230->193|231->194|232->195|233->196|234->197|235->198|236->199|237->200|238->201|239->202|240->203|241->204|242->205|243->206|244->207|245->208|246->209|247->210|248->211|249->212|251->214|253->216|253->216|254->217|254->217|254->217|255->218|257->220|257->220|258->221|259->222|259->222|261->224|261->224|262->225|264->227|264->227|265->228|268->231|268->231|268->231|268->231|268->231|269->232|269->232|269->232|270->233|272->235|272->235|272->235|272->235|272->235|274->237|274->237|276->239|276->239|277->240|277->240|278->241|278->241|279->242|279->242|280->243|280->243|280->243|281->244|282->245|282->245|284->247|289->252|289->252|291->254|291->254|291->254|292->255|292->255|292->255|293->256|294->257|294->257|295->258|295->258|295->258|296->259|298->261|298->261|299->262|300->263|300->263|301->264|302->265|302->265|303->266|303->266|303->266|304->267|305->268|305->268|306->269|308->271|308->271|310->273|310->273|310->273|311->274|312->275|312->275|313->276|318->281|318->281|319->282|320->283|320->283|321->284|321->284|321->284|322->285|322->285|322->285|323->286|326->289|326->289|327->290|346->309|346->309|348->311|349->312|349->312|350->313|354->317|354->317|355->318|360->323|360->323|361->324|361->324|363->326|363->326|363->326|364->327|370->333|370->333|372->335|372->335|372->335|373->336|378->341|378->341|380->343|380->343|380->343|381->344|383->346|383->346|384->347|385->348|385->348|385->348|385->348|385->348|386->349|387->350|387->350|388->351|389->352|389->352|390->353|392->355|392->355|392->355|392->355|392->355|393->356|394->357|394->357|395->358|395->358|398->361|400->1|401->6|403->362|405->364|405->364|405->364|407->366|407->366|407->366|407->366|409->368|409->368|409->368|410->369|410->369|410->369|433->392|433->392|433->392|435->394|435->394|435->394|439->398|439->398|439->398|439->398|653->612|653->612|653->612|663->622
                  -- GENERATED --
              */
          