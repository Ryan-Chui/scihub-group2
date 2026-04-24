
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

object challengeApplication extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Challenge,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(challenge: Challenge):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._
/*3.2*/import models._
/*4.2*/import models.Project
/*5.2*/import models.Challenge

def /*7.2*/scripts/*7.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*7.13*/("""
    """),format.raw/*8.5*/("""<style>
            tr """),format.raw/*9.16*/("""{"""),format.raw/*9.17*/("""
                """),format.raw/*10.17*/("""border-bottom: none;
            """),format.raw/*11.13*/("""}"""),format.raw/*11.14*/("""
            """),format.raw/*12.13*/("""td """),format.raw/*12.16*/("""{"""),format.raw/*12.17*/("""
                """),format.raw/*13.17*/("""text-align: center;
            """),format.raw/*14.13*/("""}"""),format.raw/*14.14*/("""
            """),format.raw/*15.13*/(""".ql-editor strong"""),format.raw/*15.30*/("""{"""),format.raw/*15.31*/("""
                """),format.raw/*16.17*/("""font-weight:bold;
            """),format.raw/*17.13*/("""}"""),format.raw/*17.14*/("""
            """),format.raw/*18.13*/("""#editor """),format.raw/*18.21*/("""{"""),format.raw/*18.22*/("""
                """),format.raw/*19.17*/("""height: 375px;
            """),format.raw/*20.13*/("""}"""),format.raw/*20.14*/("""
    """),format.raw/*21.5*/("""</style>
    <script type="text/javascript" src='"""),_display_(/*22.42*/routes/*22.48*/.Assets.at("javascripts/database_field_length.js")),format.raw/*22.98*/("""'></script>
    <script type="text/javascript" src='"""),_display_(/*23.42*/routes/*23.48*/.Assets.at("javascripts/field_validation_helper.js")),format.raw/*23.100*/("""'></script>

    <script type="text/javascript">
            count = 0;
            delc = 0;
            var originCreator;
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
                // validateField("memberName", "memberNameMsg", "varChar255", true);
                // validateField("email", "emailMsg", "varChar255", true);
                // validateField("challengeTitle", "challengeTitleMsg", "varChar500", true);
                // validateField("location", "locationMsg", "varChar200", true);
                // validateField("shortDescription", "shortDescriptionMsg", "varChar1000", true);
                // validateField("tech", "techMsg", "varChar500", false);
                // validateNoneRequiredUrl('github', 'githubMsg', 'varChar500');
                // validateNoneRequiredUrl('team_page', 'team_pageMsg', 'varChar500');
                // validateNoneRequiredUrl('video', 'videoMsg', 'varChar500');
                /****************************** End of Validation Portion **********************************************/

                originCreator = '"""),_display_(/*50.35*/challenge/*50.44*/.getChallengePublisher.getId),format.raw/*50.72*/("""';
                $("#cancel-change-creator").click(function () """),format.raw/*51.63*/("""{"""),format.raw/*51.64*/("""
                    """),format.raw/*52.21*/("""$("#challengeCreator").val(originCreator);
                """),format.raw/*53.17*/("""}"""),format.raw/*53.18*/(""")
                $("#confirm-change-creator").click(function () """),format.raw/*54.64*/("""{"""),format.raw/*54.65*/("""
                    """),format.raw/*55.21*/("""originCreator = $("#challengeCreator").val();
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
                    placeholder: 'Enter editor description...',
                    theme: 'snow'
                """),format.raw/*77.17*/("""}"""),format.raw/*77.18*/(""");

                var limit = challengeDescriptionMaxLength;
                quill.on('text-change', function (delta, old, source) """),format.raw/*80.71*/("""{"""),format.raw/*80.72*/("""
                    """),format.raw/*81.21*/("""if (quill.getLength() > limit+1) """),format.raw/*81.54*/("""{"""),format.raw/*81.55*/("""
                        """),format.raw/*82.25*/("""document.getElementById("longDescriptionMsg").innerHTML = "Field should be no longer than "+ limit +" characters";
                    """),format.raw/*83.21*/("""}"""),format.raw/*83.22*/("""else"""),format.raw/*83.26*/("""{"""),format.raw/*83.27*/("""
                        """),format.raw/*84.25*/("""document.getElementById("longDescriptionMsg").innerHTML = "";
                    """),format.raw/*85.21*/("""}"""),format.raw/*85.22*/("""
                """),format.raw/*86.17*/("""}"""),format.raw/*86.18*/(""");

                // quill.clipboard.dangerouslyPasteHTML(entityToString());
                //  $("#description").val();
                $("#addPanel").hide();
                $("#previewPanel").hide();
                if($("#showImg").attr("src") == "") """),format.raw/*92.53*/("""{"""),format.raw/*92.54*/("""
                    """),format.raw/*93.21*/("""$("#challengePreview").hide();
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
                """),_display_(/*145.18*/if(challenge.getShortDescription!=null)/*145.57*/{_display_(Seq[Any](format.raw/*145.58*/("""
                """),format.raw/*146.17*/("""div.innerHTML = """"),_display_(/*146.35*/challenge/*146.44*/.getShortDescription),format.raw/*146.64*/("""";
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
                """),format.raw/*194.64*/("""
                """),format.raw/*195.60*/("""
                """),format.raw/*196.54*/("""
                """),format.raw/*197.44*/("""
                """),format.raw/*198.63*/("""
                """),format.raw/*199.93*/("""
                """),format.raw/*200.101*/("""
                """),format.raw/*201.42*/("""
                """),format.raw/*202.63*/("""
                """),format.raw/*203.30*/("""
                """),format.raw/*204.77*/("""
                """),format.raw/*205.53*/("""
                """),format.raw/*206.50*/("""
                """),format.raw/*207.57*/("""
                """),format.raw/*208.37*/("""
                """),format.raw/*209.122*/("""
                """),format.raw/*210.42*/("""
                """),format.raw/*211.52*/("""
                """),format.raw/*212.50*/("""
                """),format.raw/*213.52*/("""
                """),format.raw/*214.46*/("""
                """),format.raw/*215.46*/("""
                """),format.raw/*216.59*/("""
                """),format.raw/*217.55*/("""
                """),format.raw/*218.62*/("""
                """),format.raw/*219.65*/("""
                """),format.raw/*220.35*/("""
                """),format.raw/*221.56*/("""
                """),format.raw/*222.62*/("""
                """),format.raw/*223.34*/("""
                """),format.raw/*224.32*/("""
                """),format.raw/*225.26*/("""
                """),format.raw/*226.24*/("""

                """),format.raw/*228.17*/("""var ajaxflag = true;
                var parentProjectId = $("#parentProjectId").val();
                if(parentProjectId !== "0") """),format.raw/*230.45*/("""{"""),format.raw/*230.46*/("""
                    """),format.raw/*231.21*/("""$.ajax("""),format.raw/*231.28*/("""{"""),format.raw/*231.29*/("""
                        """),format.raw/*232.25*/("""url: "/challenge/checkParentProject/" + parentProjectId,
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

                """),format.raw/*261.17*/("""var html = quill.root.innerHTML;
                $("#description").val(html);
                $("#countImagesInDescription").val(countImagesInDescription);

                return true;
            """),format.raw/*266.13*/("""}"""),format.raw/*266.14*/("""

            """),format.raw/*268.13*/("""function showProPreview(obj) """),format.raw/*268.42*/("""{"""),format.raw/*268.43*/("""
                """),format.raw/*269.17*/("""if($("#showImg").attr("src") == "") """),format.raw/*269.53*/("""{"""),format.raw/*269.54*/("""
                    """),format.raw/*270.21*/("""$("#deleteBtn").hide();
                """),format.raw/*271.17*/("""}"""),format.raw/*271.18*/("""
                """),format.raw/*272.17*/("""else """),format.raw/*272.22*/("""{"""),format.raw/*272.23*/("""
                    """),format.raw/*273.21*/("""$("#deleteBtn").show();
                    //$('#previewMsg').text("");
                """),format.raw/*275.17*/("""}"""),format.raw/*275.18*/("""
                """),format.raw/*276.17*/("""var panel = document.getElementById("previewPanel");
                if (panel.style.display == "none") """),format.raw/*277.52*/("""{"""),format.raw/*277.53*/("""
                    """),format.raw/*278.21*/("""$(obj).text("Close Preview");
                """),format.raw/*279.17*/("""}"""),format.raw/*279.18*/("""
                """),format.raw/*280.17*/("""else """),format.raw/*280.22*/("""{"""),format.raw/*280.23*/("""
                    """),format.raw/*281.21*/("""$(obj).text("Preview Or Delete Picture");
                """),format.raw/*282.17*/("""}"""),format.raw/*282.18*/("""
                """),format.raw/*283.17*/("""$("#previewPanel").slideToggle();

            """),format.raw/*285.13*/("""}"""),format.raw/*285.14*/("""

            """),format.raw/*287.13*/("""function deleteMember(obj) """),format.raw/*287.40*/("""{"""),format.raw/*287.41*/("""
                """),format.raw/*288.17*/("""var tr  = $(obj).parent().parent();
                if(tr.attr("id") != null) """),format.raw/*289.43*/("""{"""),format.raw/*289.44*/("""
                    """),format.raw/*290.21*/("""tr.append("<td style='display: none;' > <input name ='delete" + delc + "' value='" + tr.attr("id") + "'></td>")
                    //tr.attr("name", "delete" + delc);
                    delc++;
                    $("#delc").val(delc);
                    tr.hide();
                """),format.raw/*295.17*/("""}"""),format.raw/*295.18*/("""
                """),format.raw/*296.17*/("""else tr.remove();
            """),format.raw/*297.13*/("""}"""),format.raw/*297.14*/("""
            """),format.raw/*298.13*/("""function showPreview(url) """),format.raw/*298.39*/("""{"""),format.raw/*298.40*/("""
                """),format.raw/*299.17*/("""if($("#memberName").val() == "")"""),format.raw/*299.49*/("""{"""),format.raw/*299.50*/("""
                    """),format.raw/*300.21*/("""$("#msg").text("Member Name cannot be null.");
                    document.getElementById("addmember").disabled = true;
                    return;
                """),format.raw/*303.17*/("""}"""),format.raw/*303.18*/("""
                """),format.raw/*304.17*/("""$("#msg").text("");
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
            """),format.raw/*323.13*/("""}"""),format.raw/*323.14*/("""

            """),format.raw/*325.13*/("""//preview the updated image
            function changProjectPic() """),format.raw/*326.40*/("""{"""),format.raw/*326.41*/("""
                """),format.raw/*327.17*/("""if(document.getElementById("picture").value == "") return;
                var reads = new FileReader();
                f = document.getElementById("picture").files[0];
                reads.readAsDataURL(f);
                reads.onload = function(e) """),format.raw/*331.44*/("""{"""),format.raw/*331.45*/("""
                    """),format.raw/*332.21*/("""document.getElementById('showImg').src = this.result;
                    $('#record').val("update");
                    $('#previewMsg').text("This is the preview image. You need to click \"UPDATE\" button below if you want to save the changes.");
                    $("#deleteBtn").show();
                    $("#projectPreview").show();
                """),format.raw/*337.17*/("""}"""),format.raw/*337.18*/(""";
            """),format.raw/*338.13*/("""}"""),format.raw/*338.14*/("""

            """),format.raw/*340.13*/("""function deleteImg() """),format.raw/*340.34*/("""{"""),format.raw/*340.35*/("""
                """),format.raw/*341.17*/("""document.getElementById('showImg').src = "";
                $('#record').val("delete");
                $("#deleteBtn").hide();
                $("#projectPreview").hide();
                showProPreview("#projectPreview");
                $('#previewMsg').text("The image is deleted. You need to click \"UPDATE\" button below if you want to save the changes.");
            """),format.raw/*347.13*/("""}"""),format.raw/*347.14*/("""

            """),format.raw/*349.13*/("""function deletePDF() """),format.raw/*349.34*/("""{"""),format.raw/*349.35*/("""
                """),format.raw/*350.17*/("""document.getElementById('showImg').src = "";
                $('#pdfRecord').val("delete");
                $("#pdfDeleteBtn").hide();
                $("#pdfDownload").hide();
                $('#pdfPreviewMsg').text("The PDF is deleted. You need to click \"UPDATE\" button below if you want to save the changes.");
            """),format.raw/*355.13*/("""}"""),format.raw/*355.14*/("""

            """),format.raw/*357.13*/("""function clearPDF(inputId, textId) """),format.raw/*357.48*/("""{"""),format.raw/*357.49*/("""
                """),format.raw/*358.17*/("""console.log("clearFile called for", inputId, textId);
                var fileInput = document.getElementById(inputId);
                if(fileInput) """),format.raw/*360.31*/("""{"""),format.raw/*360.32*/("""
                    """),format.raw/*361.21*/("""fileInput.value = "";
                """),format.raw/*362.17*/("""}"""),format.raw/*362.18*/(""" """),format.raw/*362.19*/("""else """),format.raw/*362.24*/("""{"""),format.raw/*362.25*/("""
                    """),format.raw/*363.21*/("""console.error("Cannot find element with id", inputId);
                """),format.raw/*364.17*/("""}"""),format.raw/*364.18*/("""
                """),format.raw/*365.17*/("""var textInput = document.getElementById(textId);
                if(textInput) """),format.raw/*366.31*/("""{"""),format.raw/*366.32*/("""
                    """),format.raw/*367.21*/("""textInput.value = "";
                    $('#' + textId).trigger('change');
                """),format.raw/*369.17*/("""}"""),format.raw/*369.18*/(""" """),format.raw/*369.19*/("""else """),format.raw/*369.24*/("""{"""),format.raw/*369.25*/("""
                    """),format.raw/*370.21*/("""console.error("Cannot find element with id", textId);
                """),format.raw/*371.17*/("""}"""),format.raw/*371.18*/("""
            """),format.raw/*372.13*/("""}"""),format.raw/*372.14*/("""

    """),format.raw/*374.5*/("""</script>
""")))};
Seq[Any](format.raw/*1.24*/("""
"""),format.raw/*6.1*/("""
"""),format.raw/*375.2*/("""

"""),_display_(/*377.2*/main("Challenge Apply", scripts)/*377.34*/ {_display_(Seq[Any](format.raw/*377.36*/("""

    """),format.raw/*379.5*/("""<link href='"""),_display_(/*379.18*/routes/*379.24*/.Assets.at("stylesheets/quill.snow.css")),format.raw/*379.64*/("""'
    rel="stylesheet" />
    <script type="text/javascript" src='"""),_display_(/*381.42*/routes/*381.48*/.Assets.at("../../public/javascripts/plugins/quill.js")),format.raw/*381.103*/("""'></script>

    <div class="container">
        <div class="row">
            <div class="col  s12 m10 offset-m1">
                <div class="card-panel">
                    <h4 class="center form-signin-heading" align="center">
                        Bid Challenge</h4>
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
                    <form class="form-signin" enctype="multipart/form-data" id="editProjectForm" method="post" onsubmit="return getHTML()" action=""""),_display_(/*403.149*/routes/*403.155*/.ChallengeController.challengeApplyPOST(challenge.getId)),format.raw/*403.211*/("""">
                        <div id="hiddenDiv" style="display: none;">
                            <input name="isActive" id="isActive" class="validate" value=""""),_display_(/*405.91*/challenge/*405.100*/.getIsActive),format.raw/*405.112*/("""">
                        </div>



                        <div class="row">
                            <div class="input-field col s12">
                                <label for="challengeTitle">Title: """),_display_(/*412.69*/challenge/*412.78*/.getChallengeTitle),format.raw/*412.96*/(""" """),format.raw/*412.97*/("""</label>
                                <span id="challengeTitleMsg" class="helper-text" data-error=""></span>
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
                                <input
                                type="text" name="applyDescription" id="applyDescription"  class="validate" required>
                                <label for="location">
                                    Apply Description* </label>
                                <span id="applyDescriptionMsg" class="helper-text" data-error=""></span>
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

                        Document Upload
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
                        </div>

                                    <div class="actions row center">
                                    <div class="input-field col s12">
                                    <button type="submit" id="challengeApplication" class="btn waves-effect waves-light blue darken-2">Submit</button>
                                    <a href=""""),_display_(/*487.47*/routes/*487.53*/.ChallengeController.challengeDetail(challenge.getId)),format.raw/*487.106*/("""" class="btn waves-effect waves-light red darken-2">Cancel</a>
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

  def render(challenge:Challenge): play.twirl.api.HtmlFormat.Appendable = apply(challenge)

  def f:((Challenge) => play.twirl.api.HtmlFormat.Appendable) = (challenge) => apply(challenge)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:30 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/challengeApplication.scala.html
                  HASH: eb50527bdaf201d04c5d24e94a1a3cf42eddb721
                  MATRIX: 1129->1|1224->25|1247->42|1270->59|1299->82|1335->108|1349->115|1429->119|1460->124|1510->147|1538->148|1583->165|1644->198|1673->199|1714->212|1745->215|1774->216|1819->233|1879->265|1908->266|1949->279|1994->296|2023->297|2068->314|2126->344|2155->345|2196->358|2232->366|2261->367|2306->384|2361->411|2390->412|2422->417|2499->467|2514->473|2585->523|2665->576|2680->582|2754->634|2966->818|2995->819|3040->836|3166->934|3195->935|3236->948|3294->978|3323->979|3368->996|4502->2103|4520->2112|4569->2140|4662->2205|4691->2206|4740->2227|4827->2286|4856->2287|4949->2352|4978->2353|5027->2374|5117->2436|5146->2437|5222->2485|5251->2486|5300->2507|5337->2516|5366->2517|5419->2542|5487->2582|5516->2583|5545->2584|5584->2595|5613->2596|5673->2628|5702->2629|5731->2630|5801->2672|5830->2673|6007->2822|6036->2823|6065->2824|6105->2836|6134->2837|6164->2839|6193->2840|6222->2841|6267->2858|6296->2859|6447->2982|6476->2983|6505->2984|6550->3001|6579->3002|6609->3004|6638->3005|6667->3006|6712->3023|6741->3024|6801->3056|6830->3057|6859->3058|6902->3073|6931->3074|6961->3076|6990->3077|7019->3078|7065->3096|7094->3097|7184->3159|7213->3160|7242->3161|7284->3175|7313->3176|7343->3178|7372->3179|7401->3180|7444->3195|7473->3196|7560->3255|7589->3256|7618->3257|7665->3276|7694->3277|7795->3350|7824->3351|7853->3352|7893->3364|7922->3365|8045->3460|8074->3461|8218->3577|8247->3578|8408->3711|8437->3712|8486->3733|8547->3766|8576->3767|8629->3792|8792->3927|8821->3928|8853->3932|8882->3933|8935->3958|9045->4040|9074->4041|9119->4058|9148->4059|9434->4317|9463->4318|9512->4339|9587->4386|9616->4387|9661->4404|9723->4438|9752->4439|9801->4460|9933->4564|9962->4565|10015->4590|10218->4764|10248->4765|10298->4786|10332->4791|10362->4792|10416->4817|10936->5308|10966->5309|11016->5330|11092->5377|11122->5378|11259->5486|11289->5487|11339->5508|11433->5573|11463->5574|11517->5599|11630->5683|11660->5684|11710->5705|11799->5765|11829->5766|11883->5791|11991->5870|12021->5871|12071->5892|12515->6307|12545->6308|12599->6333|12772->6477|12802->6478|12852->6499|13070->6688|13100->6689|13154->6714|13230->6761|13260->6762|13307->6780|13337->6781|13463->6878|13493->6879|13563->6920|13593->6921|13639->6938|13723->6994|13772->7033|13812->7034|13858->7051|13904->7069|13923->7078|13965->7098|14017->7118|14063->7135|14172->7215|14202->7216|14245->7230|14328->7284|14358->7285|14404->7302|14903->7772|14933->7773|14983->7794|15300->8082|15330->8083|15376->8100|15443->8138|15473->8139|15523->8160|15606->8214|15636->8215|15690->8240|15774->8295|15804->8296|15917->8380|15947->8381|15999->8404|16029->8405|16079->8426|16215->8533|16245->8534|16299->8559|16435->8666|16465->8667|16523->8696|16648->8792|16678->8793|16728->8814|16758->8815|16805->8833|16835->8834|16936->8906|16966->8907|17016->8928|17156->9039|17186->9040|17232->9104|17278->9164|17324->9218|17370->9262|17416->9325|17462->9418|17509->9519|17555->9561|17601->9624|17647->9654|17693->9731|17739->9784|17785->9834|17831->9891|17877->9928|17924->10050|17970->10092|18016->10144|18062->10194|18108->10246|18154->10292|18200->10338|18246->10397|18292->10452|18338->10514|18384->10579|18430->10614|18476->10670|18522->10732|18568->10766|18614->10798|18660->10824|18706->10848|18753->10866|18914->10998|18944->10999|18994->11020|19030->11027|19060->11028|19114->11053|19271->11181|19301->11182|19359->11211|19447->11270|19477->11271|19594->11359|19624->11360|19682->11389|19836->11514|19866->11515|19928->11548|20157->11748|20187->11749|20217->11750|20251->11755|20281->11756|20343->11789|20402->11819|20432->11820|20498->11857|20668->11998|20698->11999|20728->12000|20762->12005|20792->12006|20855->12040|20885->12041|20944->12071|20974->12072|21028->12097|21058->12098|21108->12119|21138->12120|21186->12139|21216->12140|21262->12157|21304->12170|21334->12171|21384->12192|21443->12222|21473->12223|21520->12241|21747->12439|21777->12440|21820->12454|21878->12483|21908->12484|21954->12501|22019->12537|22049->12538|22099->12559|22168->12599|22198->12600|22244->12617|22278->12622|22308->12623|22358->12644|22476->12733|22506->12734|22552->12751|22685->12855|22715->12856|22765->12877|22840->12923|22870->12924|22916->12941|22950->12946|22980->12947|23030->12968|23117->13026|23147->13027|23193->13044|23269->13091|23299->13092|23342->13106|23398->13133|23428->13134|23474->13151|23581->13229|23611->13230|23661->13251|23975->13536|24005->13537|24051->13554|24110->13584|24140->13585|24182->13598|24237->13624|24267->13625|24313->13642|24374->13674|24404->13675|24454->13696|24648->13861|24678->13862|24724->13879|26124->15250|26154->15251|26197->15265|26293->15332|26323->15333|26369->15350|26651->15603|26681->15604|26731->15625|27119->15984|27149->15985|27192->15999|27222->16000|27265->16014|27315->16035|27345->16036|27391->16053|27796->16429|27826->16430|27869->16444|27919->16465|27949->16466|27995->16483|28353->16812|28383->16813|28426->16827|28490->16862|28520->16863|28566->16880|28745->17030|28775->17031|28825->17052|28892->17090|28922->17091|28952->17092|28986->17097|29016->17098|29066->17119|29166->17190|29196->17191|29242->17208|29350->17287|29380->17288|29430->17309|29552->17402|29582->17403|29612->17404|29646->17409|29676->17410|29726->17431|29825->17501|29855->17502|29897->17515|29927->17516|29961->17522|30011->23|30038->106|30067->17533|30097->17536|30139->17568|30180->17570|30214->17576|30255->17589|30271->17595|30333->17635|30428->17702|30444->17708|30522->17763|31891->19103|31908->19109|31987->19165|32176->19326|32196->19335|32231->19347|32468->19556|32487->19565|32527->19583|32557->19584|37505->24504|37521->24510|37597->24563
                  LINES: 35->1|38->2|39->3|40->4|41->5|43->7|43->7|45->7|46->8|47->9|47->9|48->10|49->11|49->11|50->12|50->12|50->12|51->13|52->14|52->14|53->15|53->15|53->15|54->16|55->17|55->17|56->18|56->18|56->18|57->19|58->20|58->20|59->21|60->22|60->22|60->22|61->23|61->23|61->23|68->30|68->30|69->31|71->33|71->33|72->34|72->34|72->34|73->35|88->50|88->50|88->50|89->51|89->51|90->52|91->53|91->53|92->54|92->54|93->55|94->56|94->56|96->58|96->58|97->59|97->59|97->59|98->60|99->61|99->61|99->61|99->61|99->61|100->62|100->62|100->62|100->62|100->62|102->64|102->64|102->64|102->64|102->64|102->64|102->64|102->64|102->64|102->64|105->67|105->67|105->67|105->67|105->67|105->67|105->67|105->67|105->67|105->67|106->68|106->68|106->68|106->68|106->68|106->68|106->68|106->68|106->68|106->68|107->69|107->69|107->69|107->69|107->69|107->69|107->69|107->69|107->69|107->69|108->70|108->70|108->70|108->70|108->70|109->71|109->71|109->71|109->71|109->71|112->74|112->74|115->77|115->77|118->80|118->80|119->81|119->81|119->81|120->82|121->83|121->83|121->83|121->83|122->84|123->85|123->85|124->86|124->86|130->92|130->92|131->93|132->94|132->94|133->95|133->95|133->95|134->96|135->97|135->97|136->98|138->100|138->100|139->101|139->101|139->101|140->102|146->108|146->108|147->109|149->111|149->111|153->115|153->115|154->116|154->116|154->116|155->117|156->118|156->118|157->119|157->119|157->119|158->120|159->121|159->121|160->122|165->127|165->127|166->128|169->131|169->131|170->132|173->135|173->135|174->136|176->138|176->138|177->139|177->139|179->141|179->141|181->143|181->143|182->144|183->145|183->145|183->145|184->146|184->146|184->146|184->146|185->147|186->148|188->150|188->150|190->152|191->153|191->153|192->154|200->162|200->162|201->163|206->168|206->168|207->169|208->170|208->170|209->171|210->172|210->172|211->173|212->174|212->174|215->177|215->177|215->177|215->177|216->178|218->180|218->180|219->181|220->182|220->182|221->183|223->185|223->185|224->186|224->186|226->188|226->188|228->190|228->190|229->191|231->193|231->193|232->194|233->195|234->196|235->197|236->198|237->199|238->200|239->201|240->202|241->203|242->204|243->205|244->206|245->207|246->208|247->209|248->210|249->211|250->212|251->213|252->214|253->215|254->216|255->217|256->218|257->219|258->220|259->221|260->222|261->223|262->224|263->225|264->226|266->228|268->230|268->230|269->231|269->231|269->231|270->232|272->234|272->234|273->235|274->236|274->236|276->238|276->238|277->239|279->241|279->241|280->242|283->245|283->245|283->245|283->245|283->245|284->246|284->246|284->246|285->247|287->249|287->249|287->249|287->249|287->249|289->251|289->251|291->253|291->253|292->254|292->254|293->255|293->255|294->256|294->256|295->257|295->257|295->257|296->258|297->259|297->259|299->261|304->266|304->266|306->268|306->268|306->268|307->269|307->269|307->269|308->270|309->271|309->271|310->272|310->272|310->272|311->273|313->275|313->275|314->276|315->277|315->277|316->278|317->279|317->279|318->280|318->280|318->280|319->281|320->282|320->282|321->283|323->285|323->285|325->287|325->287|325->287|326->288|327->289|327->289|328->290|333->295|333->295|334->296|335->297|335->297|336->298|336->298|336->298|337->299|337->299|337->299|338->300|341->303|341->303|342->304|361->323|361->323|363->325|364->326|364->326|365->327|369->331|369->331|370->332|375->337|375->337|376->338|376->338|378->340|378->340|378->340|379->341|385->347|385->347|387->349|387->349|387->349|388->350|393->355|393->355|395->357|395->357|395->357|396->358|398->360|398->360|399->361|400->362|400->362|400->362|400->362|400->362|401->363|402->364|402->364|403->365|404->366|404->366|405->367|407->369|407->369|407->369|407->369|407->369|408->370|409->371|409->371|410->372|410->372|412->374|414->1|415->6|416->375|418->377|418->377|418->377|420->379|420->379|420->379|420->379|422->381|422->381|422->381|444->403|444->403|444->403|446->405|446->405|446->405|453->412|453->412|453->412|453->412|528->487|528->487|528->487
                  -- GENERATED --
              */
          