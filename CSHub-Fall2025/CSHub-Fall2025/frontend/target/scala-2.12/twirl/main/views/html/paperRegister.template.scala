
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
/*1.2*/import helper._
/*2.2*/import models._
/*3.2*/import models.Paper

object paperRegister extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*5.6*/scripts/*5.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.17*/("""
    """),format.raw/*6.5*/("""<style>
        tr """),format.raw/*7.12*/("""{"""),format.raw/*7.13*/("""
            """),format.raw/*8.13*/("""border-bottom: none;
        """),format.raw/*9.9*/("""}"""),format.raw/*9.10*/("""
        """),format.raw/*10.9*/("""td """),format.raw/*10.12*/("""{"""),format.raw/*10.13*/("""
            """),format.raw/*11.13*/("""text-align: center;
        """),format.raw/*12.9*/("""}"""),format.raw/*12.10*/("""
        """),format.raw/*13.9*/(""".ql-editor strong"""),format.raw/*13.26*/("""{"""),format.raw/*13.27*/("""
            """),format.raw/*14.13*/("""font-weight:bold;
        """),format.raw/*15.9*/("""}"""),format.raw/*15.10*/("""
        """),format.raw/*16.9*/("""/*
        #editor """),format.raw/*17.17*/("""{"""),format.raw/*17.18*/("""
            """),format.raw/*18.13*/("""height: 375px;
        """),format.raw/*19.9*/("""}"""),format.raw/*19.10*/("""
        """),format.raw/*20.9*/("""*/
    </style>

    <script type="text/javascript" src='"""),_display_(/*23.42*/routes/*23.48*/.Assets.at("javascripts/database_field_length.js")),format.raw/*23.98*/("""'></script>
    <script type="text/javascript" src='"""),_display_(/*24.42*/routes/*24.48*/.Assets.at("javascripts/field_validation_helper.js")),format.raw/*24.100*/("""'></script>
    <script type="text/javascript">
            count = 0;
            var quill;
            $(document).ready(function () """),format.raw/*28.43*/("""{"""),format.raw/*28.44*/("""
                """),format.raw/*29.17*/("""/**
                 * This portion defines all the (non)required fields that need validation on max lengths and special
                 * characters, as well as URL validity.
                 */
                validateField("memberName", "memberNameMsg", "varChar255", true);
                validateField("email", "emailMsg", "varChar255", true);
                validateField("title", "titleMsg", "varChar500", true);
                validateField("year", "yearMsg", "varChar200", true);
                validateField("publicationChannel", "publicationChannelMsg", "varChar1000", true);
                validateField("date", "dateMsg", "varChar500", false);
                /****************************** End of Validation Portion **********************************************/

                $("#addPanel").hide();
                $("#showPanel").click(function () """),format.raw/*42.51*/("""{"""),format.raw/*42.52*/("""
                    """),format.raw/*43.21*/("""var panel = document.getElementById("addPanel");
                    if (panel.style.display == "none") """),format.raw/*44.56*/("""{"""),format.raw/*44.57*/("""
                        """),format.raw/*45.25*/("""$("#btnName").attr("style", "transform:rotate(-45deg);transition:transform 0.3s linear;");
                        $("#buttonText").text("Close Window");
                    """),format.raw/*47.21*/("""}"""),format.raw/*47.22*/("""
                    """),format.raw/*48.21*/("""else """),format.raw/*48.26*/("""{"""),format.raw/*48.27*/("""
                        """),format.raw/*49.25*/("""$("#btnName").attr("style", "transform:rotate(0deg);transition:transform 0.3s linear;");
                        $("#buttonText").text("Add Members");
                        document.getElementById("memberName").value = "";
                        document.getElementById("email").value = "";
                        document.getElementById("email").classList.remove("invalid");
                        document.getElementById("memberName").classList.remove("invalid");
                    """),format.raw/*55.21*/("""}"""),format.raw/*55.22*/("""
                    """),format.raw/*56.21*/("""$("#addPanel").slideToggle();
                """),format.raw/*57.17*/("""}"""),format.raw/*57.18*/(""");


                //preview the updated image
                $("#addmember").click(function changepic() """),format.raw/*61.60*/("""{"""),format.raw/*61.61*/("""
                    """),format.raw/*62.21*/("""if (document.getElementById("memberName").value.trim().length==0)"""),format.raw/*62.86*/("""{"""),format.raw/*62.87*/("""
                        """),format.raw/*63.25*/("""document.getElementById("memberName").classList.add("invalid");
                    """),format.raw/*64.21*/("""}"""),format.raw/*64.22*/("""
                    """),format.raw/*65.21*/("""if (document.getElementById("email").value.trim().length==0)"""),format.raw/*65.81*/("""{"""),format.raw/*65.82*/("""
                        """),format.raw/*66.25*/("""document.getElementById("email").classList.add("invalid");
                    """),format.raw/*67.21*/("""}"""),format.raw/*67.22*/("""
                    """),format.raw/*68.21*/("""// document.getElementById("email").value.trim().length()==0;
                    var isName = document.getElementById("memberName").classList.contains("invalid") ? false : true;
                    var isEmail = document.getElementById("email").classList.contains("invalid") ? false : true;

                    if(!isName || !isEmail) return;
                    if (document.getElementById("photo").value == "") """),format.raw/*73.71*/("""{"""),format.raw/*73.72*/("""
                        """),format.raw/*74.25*/("""var url = "../../../../assets/images/person.jpg";
                        showPreview(url);
                        return;
                    """),format.raw/*77.21*/("""}"""),format.raw/*77.22*/("""
                    """),format.raw/*78.21*/("""var reads = new FileReader();
                    f = document.getElementById("photo").files[0];
                    reads.readAsDataURL(f);
                    reads.onload = function (e) """),format.raw/*81.49*/("""{"""),format.raw/*81.50*/("""
                        """),format.raw/*82.25*/("""showPreview(this.result);

                    """),format.raw/*84.21*/("""}"""),format.raw/*84.22*/(""";
                """),format.raw/*85.17*/("""}"""),format.raw/*85.18*/(""");
            """),format.raw/*86.13*/("""}"""),format.raw/*86.14*/(""");


            function deleteMember(obj) """),format.raw/*89.40*/("""{"""),format.raw/*89.41*/("""
                """),format.raw/*90.17*/("""var tr  = $(obj).parent().parent();
                tr.remove();
            """),format.raw/*92.13*/("""}"""),format.raw/*92.14*/("""

            """),format.raw/*94.13*/("""function showPreview(url) """),format.raw/*94.39*/("""{"""),format.raw/*94.40*/("""
                """),format.raw/*95.17*/("""var appendItem = "<tr><td><img src=\"" + url + "\" height='35px' style=\"width:35px;border-radius:50%;\"</td>" +
                        "<td>" + $("#memberName").val() + "<input type=\"text\" name='member" + count + "' id='member" + count + "' value=\""+ $("#memberName").val() +"\" style=\"display: none;\"></td>" +
                        "<td>" + $("#email").val() + "<input type=\"text\" name='email" + count + "' id='email" + count + "' value=\""+ $("#email").val() +"\" style=\"display: none;\"></td>" +
                        "<td><a href='javascript:void(0)' onclick='deleteMember(this)'><i style='color:red;' class=\"material-icons\">delete<\i><a></td><td id='clone"+count+"'></td></tr>";
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
            """),format.raw/*112.13*/("""}"""),format.raw/*112.14*/("""

            """),format.raw/*114.13*/("""function cancelAdd()"""),format.raw/*114.33*/("""{"""),format.raw/*114.34*/("""
                """),format.raw/*115.17*/("""$("#warningModal2").modal('close');
            """),format.raw/*116.13*/("""}"""),format.raw/*116.14*/("""

            """),format.raw/*118.13*/("""function addMember()"""),format.raw/*118.33*/("""{"""),format.raw/*118.34*/("""
                """),format.raw/*119.17*/("""var email = document.getElementById("email").value.trim();
                var obj = """),format.raw/*120.27*/("""{"""),format.raw/*120.28*/("""
                    """),format.raw/*121.21*/("""email: email
                """),format.raw/*122.17*/("""}"""),format.raw/*122.18*/(""";
                $.ajax("""),format.raw/*123.24*/("""{"""),format.raw/*123.25*/("""
                    """),format.raw/*124.21*/("""url: "/user/isEmailExisted",
                    data: JSON.stringify(obj),
                    headers: """),format.raw/*126.30*/("""{"""),format.raw/*126.31*/("""
                        """),format.raw/*127.25*/("""'Content-Type': 'application/json'
                    """),format.raw/*128.21*/("""}"""),format.raw/*128.22*/(""",
                    type: "POST",
                    success: function (data) """),format.raw/*130.46*/("""{"""),format.raw/*130.47*/("""
                        """),format.raw/*131.25*/("""var username = data.error.substring(data.error.indexOf('user:')+5, data.error.length);
                        var input = document.getElementById("memberName");
                        input.value = username;
                        if (document.getElementById("photo").value == "") """),format.raw/*134.75*/("""{"""),format.raw/*134.76*/("""
                            """),format.raw/*135.29*/("""var url = "../../../assets/images/person.jpg";
                            showPreview(url);
                            return;
                        """),format.raw/*138.25*/("""}"""),format.raw/*138.26*/("""
                        """),format.raw/*139.25*/("""var reads = new FileReader();
                        f = document.getElementById("photo").files[0];
                        reads.readAsDataURL(f);
                        reads.onload = function (e) """),format.raw/*142.53*/("""{"""),format.raw/*142.54*/("""
                            """),format.raw/*143.29*/("""showPreview(this.result);
                        """),format.raw/*144.25*/("""}"""),format.raw/*144.26*/(""";

                    """),format.raw/*146.21*/("""}"""),format.raw/*146.22*/("""
                """),format.raw/*147.17*/("""}"""),format.raw/*147.18*/(""")
                cancelAdd();
            """),format.raw/*149.13*/("""}"""),format.raw/*149.14*/("""

            """),format.raw/*151.13*/("""$("#showPanel").click(function () """),format.raw/*151.47*/("""{"""),format.raw/*151.48*/("""
                """),format.raw/*152.17*/("""$("#warningModal2").modal('close');
            """),format.raw/*153.13*/("""}"""),format.raw/*153.14*/(""")

            function prepareFormForSubmission() //display current HTML
            """),format.raw/*156.13*/("""{"""),format.raw/*156.14*/("""

                """),format.raw/*158.17*/("""return true;
            """),format.raw/*159.13*/("""}"""),format.raw/*159.14*/("""
    """),format.raw/*160.5*/("""</script>
""")))};
Seq[Any](format.raw/*161.2*/("""

"""),_display_(/*163.2*/main("Register Project", scripts)/*163.35*/ {_display_(Seq[Any](format.raw/*163.37*/("""
    """),format.raw/*164.5*/("""<link href='"""),_display_(/*164.18*/routes/*164.24*/.Assets.at("stylesheets/quill.snow.css")),format.raw/*164.64*/("""'
    rel="stylesheet" />
    <script type="text/javascript" src='"""),_display_(/*166.42*/routes/*166.48*/.Assets.at("javascripts/plugins/quill.js")),format.raw/*166.90*/("""'></script>

    <div class="container">
        <div class="row">
            <div class="col  s12 m10 offset-m1">
                <div class="card-panel">
                    <h4 class="center form-signin-heading" align="center">
                        Register a Paper</h4>
                    <form class="form-signin" enctype="multipart/form-data" id="projectForm" onsubmit="return prepareFormForSubmission()" method="post" action=""""),_display_(/*174.162*/routes/*174.168*/.PaperController.paperRegisterPOST()),format.raw/*174.204*/("""">
                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="title" id="title" class="validate" required >
                                <label for="title">Title*</label>
                                <span id="titleMsg" class="helper-text" data-error="" style="color: red;"></span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="publicationChannel" id="publicationChannel" class="validate" required>
                                <label for="publicationChannel">
                                    Publication Channel* </label>
                                <span id="publicationChannelMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="year" id="year" class="validate" required>
                                <label for="year">
                                    Year* </label>
                                <span id="yearMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col s12">
                                <p style="color: #000;">
                                    Team Members: <a id="showPanel" class="close" href="javascript:void(0)" style="float: right;
                                    color: #000;"><i id="btnName" class="material-icons">
                                    add</i>
                                </a><a id="buttonText" style="float: right;">Add Members</a></p>
                            </div>
                            <div id="addPanel" style="display: inline-block;">
                                <div class="col s1"><input type="text" name="count" id="count" value="0" style="display: none;"> </div>
                                <div class="col s10">
                                    <div class="input-field col s12">
                                        <input
                                        type="text" name="memberName" id="memberName" class="validate" >
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
                                    <tbody id="previewTable"></tbody>
                                </Table>
                            </div>
                        </div>

                        <div class="row">
                            <div class="input-field col s12">
                                <input type="text" name="date" id="date" class="validate">
                                <label for="date">
                                    Date </label>
                                <span id="dateMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input type="text" name="pages" id="text" class="validate">
                                <label for="pages">
                                    Pages </label>

                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input type="text" name="editor" id="editor" class="validate">
                                <label for="editor">
                                    Editor </label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input type="text" name="publicationType" id="publicationType" class="validate">
                                <label for="publicationType">
                                    Publication Type </label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input type="text" name="month" id="month" class="validate">
                                <label for="month">
                                    Month </label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input type="text" name="url" id="url" class="validate">
                                <label for="url">
                                    URL </label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input type="text" name="publisher" id="publisher" class="validate">
                                <label for="publisher">
                                    Publisher </label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input type="text" name="address" id="address" class="validate">
                                <label for="address">
                                    Address </label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input type="text" name="isbn" id="isbn" class="validate">
                                <label for="isbn">
                                    ISBN </label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input type="text" name="series" id="series" class="validate">
                                <label for="series">
                                    Series </label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input type="text" name="school" id="school" class="validate">
                                <label for="school">
                                    School </label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input type="text" name="chapter" id="chapter" class="validate">
                                <label for="chapter">
                                    Chapter </label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input type="text" name="volume" id="volume" class="validate">
                                <label for="volume">
                                    Volume </label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input type="text" name="number" id="number" class="validate">
                                <label for="number">
                                    Number </label>
                            </div>
                        </div>
                        """),format.raw/*348.46*/("""
                        """),format.raw/*349.36*/("""
                        """),format.raw/*350.69*/("""
                        """),format.raw/*351.35*/("""
                        """),format.raw/*352.144*/("""
                        """),format.raw/*353.57*/("""
                        """),format.raw/*354.105*/("""
                        """),format.raw/*355.113*/("""
                        """),format.raw/*356.37*/("""
                        """),format.raw/*357.35*/("""

                        """),format.raw/*359.25*/("""<div id="warningModal" class="modal">
                            <div class="modal-content">
                                <h5 class="center" style="color: red">Warning!</h5>
                                <h6 class="center" style="font-weight: bold" id="warningMessage"></h6>
                            </div>
                        </div>

                        <div id="warningModal2" class="modal">
                            <div class="modal-content">
                                <h6 class="center" style="font-weight: bold" id="warningMessage2"></h6>
                                <div class="actions row center">
                                    <div class="input-field col s12">
                                        <div class="btn waves-effect waves-light blue darken-2" >
                                            <span id="addMember" onclick="addMember()">Yes</span>
                                        </div>
                                        <div class="btn waves-effect waves-light red darken-2" >
                                            <span id="cancelAdd" onclick="cancelAdd()">No</span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>


                        <div class="actions row center">
                            <div class="input-field col s12">
                                <button type="submit" id="projectRegister" class="btn waves-effect waves-light blue darken-2">
                                    Submit</button>
                                <a href=""""),_display_(/*387.43*/routes/*387.49*/.Application.home()),format.raw/*387.68*/("""" class="btn waves-effect waves-light red darken-2">
                                    Cancel</a>

                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
""")))}),format.raw/*397.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:34 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/paperRegister.scala.html
                  HASH: aac9a55fa4ec8a22153807033693caa1da106609
                  MATRIX: 814->1|837->18|860->35|1258->61|1273->68|1353->72|1384->77|1430->96|1458->97|1498->110|1553->139|1581->140|1617->149|1648->152|1677->153|1718->166|1773->194|1802->195|1838->204|1883->221|1912->222|1953->235|2006->261|2035->262|2071->271|2118->290|2147->291|2188->304|2238->327|2267->328|2303->337|2388->395|2403->401|2474->451|2554->504|2569->510|2643->562|2807->698|2836->699|2881->716|3784->1591|3813->1592|3862->1613|3994->1717|4023->1718|4076->1743|4278->1917|4307->1918|4356->1939|4389->1944|4418->1945|4471->1970|4990->2461|5019->2462|5068->2483|5142->2529|5171->2530|5307->2638|5336->2639|5385->2660|5478->2725|5507->2726|5560->2751|5672->2835|5701->2836|5750->2857|5838->2917|5867->2918|5920->2943|6027->3022|6056->3023|6105->3044|6548->3459|6577->3460|6630->3485|6802->3629|6831->3630|6880->3651|7097->3840|7126->3841|7179->3866|7254->3913|7283->3914|7329->3932|7358->3933|7401->3948|7430->3949|7502->3993|7531->3994|7576->4011|7681->4088|7710->4089|7752->4103|7806->4129|7835->4130|7880->4147|9172->5410|9202->5411|9245->5425|9294->5445|9324->5446|9370->5463|9447->5511|9477->5512|9520->5526|9569->5546|9599->5547|9645->5564|9759->5649|9789->5650|9839->5671|9897->5700|9927->5701|9981->5726|10011->5727|10061->5748|10195->5853|10225->5854|10279->5879|10363->5934|10393->5935|10503->6016|10533->6017|10587->6042|10900->6326|10930->6327|10988->6356|11170->6509|11200->6510|11254->6535|11484->6736|11514->6737|11572->6766|11651->6816|11681->6817|11733->6840|11763->6841|11809->6858|11839->6859|11911->6902|11941->6903|11984->6917|12047->6951|12077->6952|12123->6969|12200->7017|12230->7018|12345->7104|12375->7105|12422->7123|12476->7148|12506->7149|12539->7154|12590->7165|12620->7168|12663->7201|12704->7203|12737->7208|12778->7221|12794->7227|12856->7267|12951->7334|12967->7340|13031->7382|13499->7821|13516->7827|13575->7863|23471->17751|23525->17787|23579->17856|23633->17891|23688->18035|23742->18092|23797->18197|23852->18310|23906->18347|23960->18382|24015->18408|25723->20088|25739->20094|25780->20113|26075->20377
                  LINES: 31->1|32->2|33->3|42->5|42->5|44->5|45->6|46->7|46->7|47->8|48->9|48->9|49->10|49->10|49->10|50->11|51->12|51->12|52->13|52->13|52->13|53->14|54->15|54->15|55->16|56->17|56->17|57->18|58->19|58->19|59->20|62->23|62->23|62->23|63->24|63->24|63->24|67->28|67->28|68->29|81->42|81->42|82->43|83->44|83->44|84->45|86->47|86->47|87->48|87->48|87->48|88->49|94->55|94->55|95->56|96->57|96->57|100->61|100->61|101->62|101->62|101->62|102->63|103->64|103->64|104->65|104->65|104->65|105->66|106->67|106->67|107->68|112->73|112->73|113->74|116->77|116->77|117->78|120->81|120->81|121->82|123->84|123->84|124->85|124->85|125->86|125->86|128->89|128->89|129->90|131->92|131->92|133->94|133->94|133->94|134->95|151->112|151->112|153->114|153->114|153->114|154->115|155->116|155->116|157->118|157->118|157->118|158->119|159->120|159->120|160->121|161->122|161->122|162->123|162->123|163->124|165->126|165->126|166->127|167->128|167->128|169->130|169->130|170->131|173->134|173->134|174->135|177->138|177->138|178->139|181->142|181->142|182->143|183->144|183->144|185->146|185->146|186->147|186->147|188->149|188->149|190->151|190->151|190->151|191->152|192->153|192->153|195->156|195->156|197->158|198->159|198->159|199->160|201->161|203->163|203->163|203->163|204->164|204->164|204->164|204->164|206->166|206->166|206->166|214->174|214->174|214->174|388->348|389->349|390->350|391->351|392->352|393->353|394->354|395->355|396->356|397->357|399->359|427->387|427->387|427->387|437->397
                  -- GENERATED --
              */
          