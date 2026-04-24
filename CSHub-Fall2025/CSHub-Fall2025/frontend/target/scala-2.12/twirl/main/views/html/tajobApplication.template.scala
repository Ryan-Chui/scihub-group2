
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

object tajobApplication extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[TAJob,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(tajob: TAJob):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._
/*3.2*/import models._
/*4.2*/import models.Project
/*5.2*/import models.TAJob

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
                """),format.raw/*36.17*/("""originCreator = '"""),_display_(/*36.35*/tajob/*36.40*/.getTajobPublisher.getId),format.raw/*36.64*/("""';
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
                        """),format.raw/*68.25*/("""document.getElementById("longDescriptionMsg").innerHTML = "Field should be no longer than "+ limit +" chatacters";
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
                        """),format.raw/*84.25*/("""$("#btnName").attr("style", "ttansform:rotate(-45deg);ttansition:ttansform 0.3s linear;");
                        $("#buttonText").text("Close Window");
                    """),format.raw/*86.21*/("""}"""),format.raw/*86.22*/("""
                    """),format.raw/*87.21*/("""else """),format.raw/*87.26*/("""{"""),format.raw/*87.27*/("""
                        """),format.raw/*88.25*/("""$("#btnName").attr("style", "ttansform:rotate(0deg);ttansition:ttansform 0.3s linear;");
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
                """),_display_(/*131.18*/if(tajob.getShortDescription!=null)/*131.53*/{_display_(Seq[Any](format.raw/*131.54*/("""
                """),format.raw/*132.17*/("""div.innerHTML = """"),_display_(/*132.35*/tajob/*132.40*/.getShortDescription),format.raw/*132.60*/("""";
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
                var appendItem = "<tr><td><img src=\"" + url + "\" height='35px' style=\"width:35px;border-tadius:50%;\"</td>" +
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

            """),format.raw/*343.13*/("""function markAsPrivate() """),format.raw/*343.38*/("""{"""),format.raw/*343.39*/("""

            """),format.raw/*345.13*/("""}"""),format.raw/*345.14*/("""


    """),format.raw/*348.5*/("""</script>
""")))};
Seq[Any](format.raw/*1.16*/("""
"""),format.raw/*6.1*/("""

"""),format.raw/*349.2*/("""

"""),_display_(/*351.2*/main("Job Apply", scripts)/*351.28*/ {_display_(Seq[Any](format.raw/*351.30*/("""

    """),format.raw/*353.5*/("""<link href='"""),_display_(/*353.18*/routes/*353.24*/.Assets.at("stylesheets/quill.snow.css")),format.raw/*353.64*/("""'
    rel="stylesheet" />
    <script type="text/javascript" src='"""),_display_(/*355.42*/routes/*355.48*/.Assets.at("javascripts/plugins/quill.js")),format.raw/*355.90*/("""'></script>
    <script type="text/javascript" src='"""),_display_(/*356.42*/routes/*356.48*/.Assets.at("javascripts/field_validation_helper.js")),format.raw/*356.100*/("""'></script>

    <div class="container">
        <div class="row">
            <div class="col  s12 m10 offset-m1">
                <div class="card-panel">
                    <h4 class="center form-signin-heading" align="center">
                        TA Job Application Page</h4>
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
                    <form class="form-signin" enctype="multipart/form-data" id="editProjectForm" method="post" onsubmit="return getHTML()" action=""""),_display_(/*378.149*/routes/*378.155*/.TAJobController.tajobApplyPOST(tajob.getId)),format.raw/*378.199*/("""">
                        <div id="hiddenDiv" style="display: none;">
                            <input name="isActive" id="isActive" class="validate" value=""""),_display_(/*380.91*/tajob/*380.96*/.getIsActive),format.raw/*380.108*/("""">
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <label>TA Job Title: """),_display_(/*384.55*/tajob/*384.60*/.getTitle),format.raw/*384.69*/(""" """),format.raw/*384.70*/("""</label>
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
                                <span id="applyCoverLetterMsg" class="helper-text" data-success="✓" data-error="" style="color: red; font-size: 12px"></span>
                            </div>
                        </div>

                        Referees1 Info:
                        <div class="row">
                            <div class="input-field col s12 m2">
                                <input type="text" name="referee1Title" id="referee1Title" class="validate" >
                                <label for="referee1Title">
                                    Title </label>
                                <span id="referee1TitleMsg" class="helper-text" data-success="✓" data-error=""></span>
                            </div>
                            <div class="input-field col s12 m5">
                                <input type="text" name="referee1FirstName" id="referee1FirstName" class="validate" >
                                <label for="referee1FirstName">
                                    First name </label>
                                <span id="referee1FirstNameMsg" class="helper-text" data-success="✓" data-error=""></span>
                            </div>
                            <div class="input-field col s12 m5">
                                <input type="text" name="referee1LastName" id="referee1LastName" class="validate" >
                                <label for="referee1LastName">
                                    Last name </label>
                                <span id="referee1LastNameMsg" class="helper-text" data-success="✓" data-error=""></span>
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
                                <span id="referee2TitleMsg" class="helper-text" data-success="✓" data-error=""></span>
                            </div>
                            <div class="input-field col s12 m5">
                                <input type="text" name="referee2FirstName" id="referee2FirstName" >
                                <label for="referee2FirstName">
                                    First name </label>
                                <span id="referee2FirstNameMsg" class="helper-text" data-success="✓" data-error=""></span>
                            </div>
                            <div class="input-field col s12 m5">
                                <input type="text" name="referee2LastName" id="referee2LastName">
                                <label for="referee2LastName">
                                    Last name </label>
                                <span id="referee2LastNameMsg" class="helper-text" data-success="✓" data-error=""></span>
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
                                <span id="referee3TitleMsg" class="helper-text" data-success="✓" data-error=""></span>
                            </div>
                            <div class="input-field col s12 m5">
                                <input type="text" name="referee3FirstName" id="referee3FirstName" >
                                <label for="referee3FirstName">
                                    First name </label>
                                <span id="referee3FirstNameMsg" class="helper-text" data-success="✓" data-error=""></span>
                            </div>
                            <div class="input-field col s12 m5">
                                <input type="text" name="referee3LastName" id="referee3LastName">
                                <label for="referee3LastName">
                                    Last name </label>
                                <span id="referee3LastNameMsg" class="helper-text" data-success="✓" data-error=""></span>
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
                            <div class="file-field input-field col s12" >
                                <div class="btn waves-effect waves-light blue darken-2" >
                                    <span >Resume</span>
                                    <input type="file" accept=".pdf" id="pdf" name="pdf">
                                </div>
                                <div class="file-path-wrapper">
                                    <input class="file-path validate" type="text">
                                </div>
                                <div id="pdfPreviewMsg" style="color:blue"></div>
                                """),_display_(/*532.34*/if(tajob.getPdf != null && tajob.getPdf != "")/*532.80*/ {_display_(Seq[Any](format.raw/*532.82*/("""
                                    """),format.raw/*533.37*/("""<a id="pdfDownload" href=""""),_display_(/*533.64*/tajob/*533.69*/.getPdf),format.raw/*533.76*/("""">
                                        Download Current Current PDF PDF</a>
                                    <a id = "pdfDeleteBtn" class="right" href="#" style="color: red;" onclick="deletePDF()">
                                        <i class="material-icons">cross</i> Delete Current Job PDF</a>
                                """)))}),format.raw/*537.34*/("""
                                """),format.raw/*538.33*/("""<input id="pdfRecord" name = "pdfRecord" style="display: none;"/>
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
                                """),_display_(/*550.34*/if(tajob.getPdf != null && tajob.getPdf != "")/*550.80*/ {_display_(Seq[Any](format.raw/*550.82*/("""
                                    """),format.raw/*551.37*/("""<a id="pdfDownload" href=""""),_display_(/*551.64*/tajob/*551.69*/.getPdf),format.raw/*551.76*/("""">
                                        Download Current Current PDF PDF</a>
                                    <a id = "pdfDeleteBtn" class="right" href="#" style="color: red;" onclick="deletePDF()">
                                        <i class="material-icons">cross</i> Delete Current Job PDF</a>
                                """)))}),format.raw/*555.34*/("""
                                """),format.raw/*556.33*/("""<input id="pdfRecord" name = "pdfRecord" style="display: none;"/>
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
                                """),_display_(/*568.34*/if(tajob.getPdf != null && tajob.getPdf != "")/*568.80*/ {_display_(Seq[Any](format.raw/*568.82*/("""
                                    """),format.raw/*569.37*/("""<a id="pdfDownload" href=""""),_display_(/*569.64*/tajob/*569.69*/.getPdf),format.raw/*569.76*/("""">
                                        Download Current Current PDF PDF</a>
                                    <a id = "pdfDeleteBtn" class="right" href="#" style="color: red;" onclick="deletePDF()">
                                        <i class="material-icons">cross</i> Delete Current Job PDF</a>
                                """)))}),format.raw/*573.34*/("""
                                """),format.raw/*574.33*/("""<input id="pdfRecord" name = "pdfRecord" style="display: none;"/>
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
                                """),_display_(/*588.34*/if(tajob.getPdf != null && tajob.getPdf != "")/*588.80*/ {_display_(Seq[Any](format.raw/*588.82*/("""
                                    """),format.raw/*589.37*/("""<a id="pdfDownload" href=""""),_display_(/*589.64*/tajob/*589.69*/.getPdf),format.raw/*589.76*/("""">
                                        Download Current Current PDF PDF</a>
                                    <a id = "pdfDeleteBtn" class="right" href="#" style="color: red;" onclick="deletePDF()">
                                        <i class="material-icons">cross</i> Delete Current Job PDF</a>
                                """)))}),format.raw/*593.34*/("""
                                """),format.raw/*594.33*/("""<input id="pdfRecord" name = "pdfRecord" style="display: none;"/>
                            </div>

                        </div>
                        <div class="actions row center">
                            <div class="input-field col s12">
                                <button type="submit" id="JobApplication" class="btn waves-effect waves-light blue darken-2">
                                    Submit</button>
                                <a href=""""),_display_(/*602.43*/routes/*602.49*/.TAJobController.tajobDetail(tajob.getId)),format.raw/*602.90*/("""" class="btn waves-effect waves-light red darken-2">
                                    Cancel</a>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>

""")))}),format.raw/*612.2*/("""
"""))
      }
    }
  }

  def render(tajob:TAJob): play.twirl.api.HtmlFormat.Appendable = apply(tajob)

  def f:((TAJob) => play.twirl.api.HtmlFormat.Appendable) = (tajob) => apply(tajob)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:37 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/tajobApplication.scala.html
                  HASH: 1b9acb235fc8dae76d0e6bb1bba1c0efeb234976
                  MATRIX: 1121->1|1208->17|1231->34|1254->51|1283->74|1315->97|1329->104|1409->108|1440->113|1491->136|1520->137|1565->154|1626->187|1655->188|1696->201|1727->204|1756->205|1801->222|1861->254|1890->255|1931->268|1976->285|2005->286|2050->303|2108->333|2137->334|2178->347|2214->355|2243->356|2288->373|2343->400|2372->401|2404->406|2481->456|2496->462|2567->512|2647->565|2662->571|2736->623|2948->807|2977->808|3022->825|3142->917|3171->918|3212->931|3270->961|3299->962|3344->979|3389->997|3403->1002|3448->1026|3541->1091|3570->1092|3619->1113|3700->1166|3729->1167|3822->1232|3851->1233|3900->1254|3984->1310|4013->1311|4089->1359|4118->1360|4167->1381|4204->1390|4233->1391|4286->1416|4354->1456|4383->1457|4412->1458|4451->1469|4480->1470|4540->1502|4569->1503|4598->1504|4668->1546|4697->1547|4874->1696|4903->1697|4932->1698|4972->1710|5001->1711|5031->1713|5060->1714|5089->1715|5134->1732|5163->1733|5314->1856|5343->1857|5372->1858|5417->1875|5446->1876|5476->1878|5505->1879|5534->1880|5579->1897|5608->1898|5668->1930|5697->1931|5726->1932|5769->1947|5798->1948|5828->1950|5857->1951|5886->1952|5932->1970|5961->1971|6051->2033|6080->2034|6109->2035|6151->2049|6180->2050|6210->2052|6239->2053|6268->2054|6311->2069|6340->2070|6427->2129|6456->2130|6485->2131|6532->2150|6561->2151|6662->2224|6691->2225|6720->2226|6760->2238|6789->2239|6912->2334|6941->2335|7085->2451|7114->2452|7269->2579|7298->2580|7347->2601|7408->2634|7437->2635|7490->2660|7653->2795|7682->2796|7714->2800|7743->2801|7796->2826|7906->2908|7935->2909|7980->2926|8009->2927|8295->3185|8324->3186|8373->3207|8442->3248|8471->3249|8516->3266|8578->3300|8607->3301|8656->3322|8788->3426|8817->3427|8870->3452|9072->3626|9101->3627|9150->3648|9183->3653|9212->3654|9265->3679|9784->4170|9813->4171|9862->4192|9937->4239|9966->4240|10103->4348|10133->4349|10183->4370|10277->4435|10307->4436|10361->4461|10474->4545|10504->4546|10554->4567|10643->4627|10673->4628|10727->4653|10835->4732|10865->4733|10915->4754|11359->5169|11389->5170|11443->5195|11616->5339|11646->5340|11696->5361|11914->5550|11944->5551|11998->5576|12074->5623|12104->5624|12151->5642|12181->5643|12307->5740|12337->5741|12407->5782|12437->5783|12483->5800|12567->5856|12612->5891|12652->5892|12698->5909|12744->5927|12759->5932|12801->5952|12853->5972|12899->5989|13008->6069|13038->6070|13081->6084|13164->6138|13194->6139|13240->6156|13715->6602|13745->6603|13795->6624|14100->6900|14130->6901|14176->6918|14243->6956|14273->6957|14323->6978|14406->7032|14436->7033|14490->7058|14574->7113|14604->7114|14717->7198|14747->7199|14799->7222|14829->7223|14879->7244|15015->7351|15045->7352|15099->7377|15235->7484|15265->7485|15323->7514|15448->7610|15478->7611|15528->7632|15558->7633|15605->7651|15635->7652|15736->7724|15766->7725|15816->7746|15950->7851|15980->7852|16026->7916|16072->7976|16118->8030|16164->8074|16210->8137|16256->8230|16303->8331|16349->8373|16395->8436|16441->8466|16487->8543|16533->8596|16579->8646|16625->8703|16671->8740|16718->8850|16764->8892|16810->8944|16856->8994|16902->9046|16948->9092|16994->9138|17040->9197|17086->9252|17132->9314|17178->9379|17224->9414|17270->9470|17316->9532|17362->9566|17408->9598|17454->9624|17500->9648|17547->9666|17708->9798|17738->9799|17788->9820|17824->9827|17854->9828|17908->9853|18059->9975|18089->9976|18147->10005|18235->10064|18265->10065|18382->10153|18412->10154|18470->10183|18624->10308|18654->10309|18716->10342|18945->10542|18975->10543|19005->10544|19039->10549|19069->10550|19131->10583|19190->10613|19220->10614|19286->10651|19456->10792|19486->10793|19516->10794|19550->10799|19580->10800|19643->10834|19673->10835|19732->10865|19762->10866|19816->10891|19846->10892|19896->10913|19926->10914|19974->10933|20004->10934|20050->10951|20092->10964|20122->10965|20172->10986|20231->11016|20261->11017|20308->11035|20535->11233|20565->11234|20608->11248|20666->11277|20696->11278|20742->11295|20807->11331|20837->11332|20887->11353|20956->11393|20986->11394|21032->11411|21066->11416|21096->11417|21146->11438|21264->11527|21294->11528|21340->11545|21473->11649|21503->11650|21553->11671|21628->11717|21658->11718|21704->11735|21738->11740|21768->11741|21818->11762|21905->11820|21935->11821|21981->11838|22057->11885|22087->11886|22130->11900|22186->11927|22216->11928|22262->11945|22369->12023|22399->12024|22449->12045|22763->12330|22793->12331|22839->12348|22898->12378|22928->12379|22970->12392|23025->12418|23055->12419|23101->12436|23162->12468|23192->12469|23242->12490|23436->12655|23466->12656|23512->12673|24912->14044|24942->14045|24985->14059|25081->14126|25111->14127|25157->14144|25439->14397|25469->14398|25519->14419|25907->14778|25937->14779|25980->14793|26010->14794|26053->14808|26103->14829|26133->14830|26179->14847|26584->15223|26614->15224|26657->15238|26707->15259|26737->15260|26783->15277|27141->15606|27171->15607|27214->15621|27268->15646|27298->15647|27341->15661|27371->15662|27406->15669|27456->15|27483->94|27513->15680|27543->15683|27579->15709|27620->15711|27654->15717|27695->15730|27711->15736|27773->15776|27868->15843|27884->15849|27948->15891|28029->15944|28045->15950|28120->16002|29487->17340|29504->17346|29571->17390|29760->17551|29775->17556|29810->17568|30030->17760|30045->17765|30076->17774|30106->17775|39811->27452|39867->27498|39908->27500|39974->27537|40029->27564|40044->27569|40073->27576|40446->27917|40508->27950|41295->28709|41351->28755|41392->28757|41458->28794|41513->28821|41528->28826|41557->28833|41930->29174|41992->29207|42782->29969|42838->30015|42879->30017|42945->30054|43000->30081|43015->30086|43044->30093|43417->30434|43479->30467|44274->31234|44330->31280|44371->31282|44437->31319|44492->31346|44507->31351|44536->31358|44909->31699|44971->31732|45471->32204|45487->32210|45550->32251|45845->32515
                  LINES: 35->1|38->2|39->3|40->4|41->5|43->8|43->8|45->8|46->9|47->10|47->10|48->11|49->12|49->12|50->13|50->13|50->13|51->14|52->15|52->15|53->16|53->16|53->16|54->17|55->18|55->18|56->19|56->19|56->19|57->20|58->21|58->21|59->22|60->23|60->23|60->23|61->24|61->24|61->24|68->31|68->31|69->32|71->34|71->34|72->35|72->35|72->35|73->36|73->36|73->36|73->36|74->37|74->37|75->38|76->39|76->39|77->40|77->40|78->41|79->42|79->42|81->44|81->44|82->45|82->45|82->45|83->46|84->47|84->47|84->47|84->47|84->47|85->48|85->48|85->48|85->48|85->48|87->50|87->50|87->50|87->50|87->50|87->50|87->50|87->50|87->50|87->50|90->53|90->53|90->53|90->53|90->53|90->53|90->53|90->53|90->53|90->53|91->54|91->54|91->54|91->54|91->54|91->54|91->54|91->54|91->54|91->54|92->55|92->55|92->55|92->55|92->55|92->55|92->55|92->55|92->55|92->55|93->56|93->56|93->56|93->56|93->56|94->57|94->57|94->57|94->57|94->57|97->60|97->60|100->63|100->63|103->66|103->66|104->67|104->67|104->67|105->68|106->69|106->69|106->69|106->69|107->70|108->71|108->71|109->72|109->72|115->78|115->78|116->79|117->80|117->80|118->81|118->81|118->81|119->82|120->83|120->83|121->84|123->86|123->86|124->87|124->87|124->87|125->88|131->94|131->94|132->95|134->97|134->97|138->101|138->101|139->102|139->102|139->102|140->103|141->104|141->104|142->105|142->105|142->105|143->106|144->107|144->107|145->108|150->113|150->113|151->114|154->117|154->117|155->118|158->121|158->121|159->122|161->124|161->124|162->125|162->125|164->127|164->127|166->129|166->129|167->130|168->131|168->131|168->131|169->132|169->132|169->132|169->132|170->133|171->134|173->136|173->136|175->138|176->139|176->139|177->140|185->148|185->148|186->149|191->154|191->154|192->155|193->156|193->156|194->157|195->158|195->158|196->159|197->160|197->160|200->163|200->163|200->163|200->163|201->164|203->166|203->166|204->167|205->168|205->168|206->169|208->171|208->171|209->172|209->172|211->174|211->174|213->176|213->176|214->177|216->179|216->179|217->180|218->181|219->182|220->183|221->184|222->185|223->186|224->187|225->188|226->189|227->190|228->191|229->192|230->193|231->194|232->195|233->196|234->197|235->198|236->199|237->200|238->201|239->202|240->203|241->204|242->205|243->206|244->207|245->208|246->209|247->210|248->211|249->212|251->214|253->216|253->216|254->217|254->217|254->217|255->218|257->220|257->220|258->221|259->222|259->222|261->224|261->224|262->225|264->227|264->227|265->228|268->231|268->231|268->231|268->231|268->231|269->232|269->232|269->232|270->233|272->235|272->235|272->235|272->235|272->235|274->237|274->237|276->239|276->239|277->240|277->240|278->241|278->241|279->242|279->242|280->243|280->243|280->243|281->244|282->245|282->245|284->247|289->252|289->252|291->254|291->254|291->254|292->255|292->255|292->255|293->256|294->257|294->257|295->258|295->258|295->258|296->259|298->261|298->261|299->262|300->263|300->263|301->264|302->265|302->265|303->266|303->266|303->266|304->267|305->268|305->268|306->269|308->271|308->271|310->273|310->273|310->273|311->274|312->275|312->275|313->276|318->281|318->281|319->282|320->283|320->283|321->284|321->284|321->284|322->285|322->285|322->285|323->286|326->289|326->289|327->290|346->309|346->309|348->311|349->312|349->312|350->313|354->317|354->317|355->318|360->323|360->323|361->324|361->324|363->326|363->326|363->326|364->327|370->333|370->333|372->335|372->335|372->335|373->336|378->341|378->341|380->343|380->343|380->343|382->345|382->345|385->348|387->1|388->6|390->349|392->351|392->351|392->351|394->353|394->353|394->353|394->353|396->355|396->355|396->355|397->356|397->356|397->356|419->378|419->378|419->378|421->380|421->380|421->380|425->384|425->384|425->384|425->384|573->532|573->532|573->532|574->533|574->533|574->533|574->533|578->537|579->538|591->550|591->550|591->550|592->551|592->551|592->551|592->551|596->555|597->556|609->568|609->568|609->568|610->569|610->569|610->569|610->569|614->573|615->574|629->588|629->588|629->588|630->589|630->589|630->589|630->589|634->593|635->594|643->602|643->602|643->602|653->612
                  -- GENERATED --
              */
          