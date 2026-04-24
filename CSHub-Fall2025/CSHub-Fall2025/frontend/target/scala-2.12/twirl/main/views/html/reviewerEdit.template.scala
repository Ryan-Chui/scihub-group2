
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

object reviewerEdit extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,play.data.Form[models.Reviewer],Reviewer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: String, userForm: play.data.Form[models.Reviewer], user: Reviewer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.6*/import helper._

def /*3.6*/scripts/*3.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.17*/("""
        """),format.raw/*4.9*/("""<script type="text/javascript" src='"""),_display_(/*4.46*/routes/*4.52*/.Assets.at("javascripts/database_field_length.js")),format.raw/*4.102*/("""'></script>
        <script type="text/javascript" src='"""),_display_(/*5.46*/routes/*5.52*/.Assets.at("javascripts/field_validation_helper.js")),format.raw/*5.104*/("""'></script>
        <script type="text/javascript">
                var projectList = [];
                $(document).ready(function () """),format.raw/*8.47*/("""{"""),format.raw/*8.48*/("""
                    """),format.raw/*9.21*/("""/**
                     * This portion defines all the (non)required fields that need validation on max lengths and special
                     * characters, as well as URL validity.
                     */
                    validateField("firstName", "firstNameMsg", "varChar255", true);
                    validateField("lastName", "lastNameMsg", "varChar255", true);
                    validateField("middleInitial", "middleInitialMsg", "varChar255", false);
                    validateField("researchFields", "researchFieldsMsg", "varChar255", false);
                    validateField("affiliation", "affiliationMsg", "varChar255", false);
                    validateField("title", "titleMsg", "varChar255", false);
                    validateField("mailingAddress", "mailingAddressMsg", "varChar255", false);
                    validateField("highestDegree", "highestDegreeMsg", "varChar255", false);
                    validateField("phoneNumber", "phoneNumberMsg", "varChar20", false);
                    /****************************** End of Validation Portion ******************************************/

                    $.get("/project/getProjects", function (res) """),format.raw/*24.66*/("""{"""),format.raw/*24.67*/("""
                        """),format.raw/*25.25*/("""projectList = res;
                        var availableObj = """),format.raw/*26.44*/("""{"""),format.raw/*26.45*/("""}"""),format.raw/*26.46*/(""";
                        for (var i = 0; i < projectList.length; i++) """),format.raw/*27.70*/("""{"""),format.raw/*27.71*/("""
                            """),format.raw/*28.29*/("""availableObj[projectList[i]['text']] = null;
                        """),format.raw/*29.25*/("""}"""),format.raw/*29.26*/("""
                        """),format.raw/*30.25*/("""$('#projectName').autocomplete("""),format.raw/*30.56*/("""{"""),format.raw/*30.57*/("""
                            """),format.raw/*31.29*/("""data: availableObj
                        """),format.raw/*32.25*/("""}"""),format.raw/*32.26*/(""");
                    """),format.raw/*33.21*/("""}"""),format.raw/*33.22*/(""");
                """),format.raw/*34.17*/("""}"""),format.raw/*34.18*/(""");

                /**
                 * This method triggers the user image change
                 */
                function updateImg() """),format.raw/*39.38*/("""{"""),format.raw/*39.39*/("""
                    """),format.raw/*40.21*/("""document.getElementById("Img").click();
                """),format.raw/*41.17*/("""}"""),format.raw/*41.18*/("""

                """),format.raw/*43.17*/("""/**
                 * This method previews the selected image for update
                 */
                function changepic() """),format.raw/*46.38*/("""{"""),format.raw/*46.39*/("""
                    """),format.raw/*47.21*/("""if (document.getElementById("Img").value == "") return;
                    var reads = new FileReader();
                    f = document.getElementById("Img").files[0];
                    reads.readAsDataURL(f);
                    reads.onload = function (e) """),format.raw/*51.49*/("""{"""),format.raw/*51.50*/("""
                        """),format.raw/*52.25*/("""document.getElementById('showImg').src = this.result;
                        $('#record').val("update");
                        $('#previewMsg').text("This is the preview image. You need to click \"UPDATE\" button below if you want to save the changes.");

                    """),format.raw/*56.21*/("""}"""),format.raw/*56.22*/(""";
                """),format.raw/*57.17*/("""}"""),format.raw/*57.18*/("""

                """),format.raw/*59.17*/("""/**
                 * This method deletes the image and provides the default image for user
                 */
                function deleteImg() """),format.raw/*62.38*/("""{"""),format.raw/*62.39*/("""
                    """),format.raw/*63.21*/("""url = "../../../../assets/images/user.png";
                    document.getElementById('showImg').src = url;
                    $('#record').val("delete");
                    $('#previewMsg').text("This is the default image. You need to click \"UPDATE\" button below if you want to save the changes.");
                """),format.raw/*67.17*/("""}"""),format.raw/*67.18*/("""

                """),format.raw/*69.17*/("""/**
                 * This method parses and sets up default project based on input.
                 * If not set or opennex typed, the project is set to OpenNEX. Otherwise check the name.
                 */
                function projectValidation() """),format.raw/*73.46*/("""{"""),format.raw/*73.47*/("""
                    """),format.raw/*74.21*/("""if ($("#projectName").val() == "") """),format.raw/*74.56*/("""{"""),format.raw/*74.57*/("""
                        """),format.raw/*75.25*/("""document.getElementById("project-msg").innerHTML = "";
                        document.getElementById("projectName").value = "OpenNEX";
                        document.getElementById("projectId").value = "0";
                        if ($('#msg').text() == "" && $('#homepage-msg').text() == "") """),format.raw/*78.88*/("""{"""),format.raw/*78.89*/("""
                            """),format.raw/*79.29*/("""document.getElementById("Save").disabled = false;
                        """),format.raw/*80.25*/("""}"""),format.raw/*80.26*/("""
                        """),format.raw/*81.25*/("""return;
                    """),format.raw/*82.21*/("""}"""),format.raw/*82.22*/("""
                    """),format.raw/*83.21*/("""var project = $("#projectName").val();
                    var pid = 0;
                    if (project.toLowerCase() === "opennex") """),format.raw/*85.62*/("""{"""),format.raw/*85.63*/("""
                        """),format.raw/*86.25*/("""document.getElementById("projectId").value = "0";
                        document.getElementById("project-msg").innerHTML = "";
                        if ($('#msg').text() == "" && $('#homepage-msg').text() == "") """),format.raw/*88.88*/("""{"""),format.raw/*88.89*/("""
                            """),format.raw/*89.29*/("""document.getElementById("Save").disabled = false;
                        """),format.raw/*90.25*/("""}"""),format.raw/*90.26*/("""
                    """),format.raw/*91.21*/("""}"""),format.raw/*91.22*/(""" """),format.raw/*91.23*/("""else """),format.raw/*91.28*/("""{"""),format.raw/*91.29*/("""
                        """),format.raw/*92.25*/("""found = false;
                        for (var i = 0; i < projectList.length; i++) """),format.raw/*93.70*/("""{"""),format.raw/*93.71*/("""
                            """),format.raw/*94.29*/("""if (projectList[i]['text'].toLowerCase().trim() === project.toLowerCase().trim()) """),format.raw/*94.111*/("""{"""),format.raw/*94.112*/("""
                                """),format.raw/*95.33*/("""found = true;
                                document.getElementById("projectId").value = projectList[i]['id'];
                                break;
                            """),format.raw/*98.29*/("""}"""),format.raw/*98.30*/("""
                        """),format.raw/*99.25*/("""}"""),format.raw/*99.26*/("""
                        """),format.raw/*100.25*/("""if (!found) """),format.raw/*100.37*/("""{"""),format.raw/*100.38*/("""
                            """),format.raw/*101.29*/("""document.getElementById("project-msg").innerHTML = "Project does not exist";
                            document.getElementById("Save").disabled = true;
                        """),format.raw/*103.25*/("""}"""),format.raw/*103.26*/(""" """),format.raw/*103.27*/("""else """),format.raw/*103.32*/("""{"""),format.raw/*103.33*/("""
                            """),format.raw/*104.29*/("""document.getElementById("project-msg").innerHTML = "";
                            if ($('#msg').text() == "" && $('#homepage-msg').text() == "") """),format.raw/*105.92*/("""{"""),format.raw/*105.93*/("""
                                """),format.raw/*106.33*/("""document.getElementById("Save").disabled = false;
                            """),format.raw/*107.29*/("""}"""),format.raw/*107.30*/("""
                        """),format.raw/*108.25*/("""}"""),format.raw/*108.26*/("""
                    """),format.raw/*109.21*/("""}"""),format.raw/*109.22*/("""

                """),format.raw/*111.17*/("""}"""),format.raw/*111.18*/("""
        """),format.raw/*112.9*/("""</script>
    """)))};
Seq[Any](format.raw/*1.73*/("""
    """),format.raw/*3.1*/("""    """),format.raw/*113.6*/("""

"""),_display_(/*115.2*/main("Account Management", scripts)/*115.37*/ {_display_(Seq[Any](format.raw/*115.39*/("""
    """),format.raw/*116.5*/("""<div class="container row">
        <div class="col s12">
            <div class="card-panel">
                <form class="form-signin" id="update" enctype="multipart/form-data" method="post" action=""""),_display_(/*119.108*/routes/*119.114*/.ReviewerController.reviewerEditPOST()),format.raw/*119.152*/("""">
                    <h4 class="form-signin-heading" align="center">Edit Your Profile</h4>
                    <div class="row">
                        <div class="col s8">
                            <h6 class="col s6" align="left">Immutable</h6>
                            <div class="col s12">
                                <table class="striped responsive-table">
                                    <tbody>
                                        <tr>
                                            <th>User ID</th>
                                            <td>"""),_display_(/*129.50*/user/*129.54*/.getId),format.raw/*129.60*/("""</td>
                                        </tr>
                                        <tr>
                                            <th>User Email Address</th>
                                            <td>"""),_display_(/*133.50*/user/*133.54*/.getEmail),format.raw/*133.63*/("""</td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                        <div class="col center s3">
                            <tr>
                                <th>Picture:</th>
                                <td>
                                    <img class="circle" id="showImg" src=""""),_display_(/*143.76*/user/*143.80*/.getAvatar),format.raw/*143.90*/("""" width="360" height="360" style="border-width:1px; border-style:solid; border-radius: 50%;
                                        height: auto;
                                        width: 80%;">
                                    <div id="previewMsg" style="color: blue"></div>
                                    <br>
                                    <div>
                                        <a class="btn-floating waves-effect waves-light blue darken-2" title="Update Image" href="javascript:void(0)" onclick="updateImg("""),_display_(/*149.171*/user/*149.175*/.getId),format.raw/*149.181*/(""")"><i class="material-icons">
                                            edit</i><input type="file" id="Img" name="Img" style="display: none;" accept=".jpeg,.png,.jpg" onchange="changepic(this)"/></a>  &nbsp;
                                        <a class="btn-floating waves-effect waves-light red modal-trigger" title="Delete Image" href="javascript:void(0)" onclick="deleteImg("""),_display_(/*151.175*/user/*151.179*/.getId),format.raw/*151.185*/(""")"><i class="material-icons">
                                            delete</i></a>
                                        <input id="record" name = "record" style="display: none;"/>
                                    </div>
                                </td>
                            </tr>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col s12">
                            <h6 class="col s12" align="left">Editable</h6>
                            <div class="row">
                                <div class="input-field col s12 m4 l4">
                                    <input id="firstName" type="text" class="validate" name="firstName"
                                    onkeypress="return (event.charCode > 64 && event.charCode < 91) || (event.charCode > 96 && event.charCode < 123) || event.charCode === 32" onpaste="return false" value=""""),_display_(/*165.207*/user/*165.211*/.getFirstName),format.raw/*165.224*/("""" required>
                                    <label for="firstName">First Name* </label>
                                    <span id="firstNameMsg" class="helper-text" data-error=""></span>
                                </div>
                                <div class="input-field col s12 m4 l4">
                                    <input id="middleInitial" type="text" class="validate" name="middleInitial"
                                    onkeypress="return (event.charCode > 64 && event.charCode < 91) || (event.charCode > 96 && event.charCode < 123) || event.charCode === 32" onpaste="return false" value=""""),_display_(/*171.207*/if(user.getMiddleInitial!="null")/*171.240*/ {_display_(_display_(/*171.243*/user/*171.247*/.getMiddleInitial))}),format.raw/*171.265*/("""">
                                    <label for="middleInitial">Middle Name</label>
                                    <span id="middleInitialMsg" class="helper-text" data-error=""></span>
                                </div>
                                <div class="input-field col s12 m4 l4">
                                    <input id="lastName" type="text" class="validate" name="lastName"
                                    onkeypress="return (event.charCode > 64 && event.charCode < 91) || (event.charCode > 96 && event.charCode < 123) || event.charCode === 32" onpaste="return false" value=""""),_display_(/*177.207*/user/*177.211*/.getLastName),format.raw/*177.223*/("""" required>
                                    <label for="lastName">Last Name*</label>
                                    <span id="lastNameMsg" class="helper-text" data-error=""></span>
                                </div>
                            </div>
                            <div class="row">
                                <div class="input-field col s12">
                                    """),_display_(/*184.38*/if(user.getProjectZone() != null && user.getProjectZone().getId()!=0)/*184.107*/ {_display_(Seq[Any](format.raw/*184.109*/("""
                                        """),format.raw/*185.41*/("""<input type="text" name="projectName" id = "projectName" onchange="projectValidation()" class="validate autocomplete" value=""""),_display_(/*185.167*/user/*185.171*/.getProjectZone().getTitle()),format.raw/*185.199*/("""">
                                    """)))}/*186.39*/else/*186.44*/{_display_(Seq[Any](format.raw/*186.45*/("""
                                        """),format.raw/*187.41*/("""<input type="text" name="projectName" id = "projectName" onchange="projectValidation()" class="validate autocomplete" value="OpenNEX">
                                    """)))}),format.raw/*188.38*/("""
                                    """),format.raw/*189.37*/("""<label for="project">
                                        Default Project Zone<i class=" tiny material-icons tooltipped" data-position="bottom" data-tooltip="Selecting a default project allows you to only view APIs, dockers, notebooks, and datasets associated with the given project while you work in OpenNEX.">
                                        help</i></label>
                                    <div class="form-group" id="project-msg" style="color: red;"></div>
                                    <input hidden name="projectId" id="projectId" value='0'>
                                </div>
                            </div>
                            <div class="row">
                                <div class="input-field col s12">
                                    <input type="text" name="affiliation" id="affiliation" class="validate" value='"""),_display_(/*198.117*/if(user.getAffiliation!="null")/*198.148*/ {_display_(_display_(/*198.151*/user/*198.155*/.getAffiliation))}),format.raw/*198.171*/("""'>
                                    <label for="affiliation">Affiliation</label>
                                    <span id="affiliationMsg" class="helper-text" data-error=""></span>
                                </div>
                            </div>
                            <div class="row">
                                <div class="input-field col s12">
                                    <input type="text" name="title" id="title" class="validate" value='"""),_display_(/*205.105*/if(user.getTitle!="null")/*205.130*/ {_display_(_display_(/*205.133*/user/*205.137*/.getTitle))}),format.raw/*205.147*/("""'>
                                    <label for="title">Title</label>
                                    <span id="titleMsg" class="helper-text" data-error=""></span>
                                </div>
                            </div>
                            <div class="row">
                                <div class="input-field col s12">
                                    <input type="text" name="mailingAddress" id="mailingAddress" class="validate" value='"""),_display_(/*212.123*/if(user.getMailingAddress!="null")/*212.157*/ {_display_(_display_(/*212.160*/user/*212.164*/.getMailingAddress))}),format.raw/*212.183*/("""'>
                                    <label for="mailingAddress">Mailing Address</label>
                                    <span id="mailingAddressMsg" class="helper-text" data-error=""></span>
                                </div>
                            </div>
                            <div class="row">
                                <div class="input-field col s12">
                                    <input type="text" name="phoneNumber" id="phoneNumber" class="validate" value='"""),_display_(/*219.117*/if(user.getPhoneNumber!="null")/*219.148*/ {_display_(_display_(/*219.151*/user/*219.155*/.getPhoneNumber))}),format.raw/*219.171*/("""'>
                                    <label for="phoneNumber">Phone Number</label>
                                    <span id="phoneNumberMsg" class="helper-text" data-error=""></span>
                                </div>
                            </div>
                            <div class="row">
                                <div class="input-field col s12">
                                    <input type="text" name="researchFields" id="researchFields" class="validate" value='"""),_display_(/*226.123*/if(user.getResearchFields!="null")/*226.157*/ {_display_(_display_(/*226.160*/user/*226.164*/.getResearchFields))}),format.raw/*226.183*/("""'>
                                    <label for="researchFields">Research Fields</label>
                                    <span id="researchFieldsMsg" class="helper-text" data-error=""></span>
                                </div>
                            </div>
                            <div class="row">
                                <div class="input-field col s12">
                                    <input type="text" name="highestDegree" id="highestDegree" class="validate" value='"""),_display_(/*233.121*/if(user.getHighestDegree!="null")/*233.154*/ {_display_(_display_(/*233.157*/user/*233.161*/.getHighestDegree))}),format.raw/*233.179*/("""'>
                                    <label for="highestDegree">Highest Degree</label>
                                    <span id="highestDegreeMsg" class="helper-text" data-error=""></span>
                                </div>
                            </div>
                            <input type="text" name="email" hidden value=""""),_display_(/*238.76*/user/*238.80*/.getEmail),format.raw/*238.89*/("""">

                            <div class="actions row">
                                <button id="Save" type="submit" class="btn waves-effect waves-light col s12 blue darken-2">
                                    Save<i class="material-icons right">save_alt</i></button>
                            </div>
                            <div class="actions row">
                                <a href="#warningModal" class="btn waves-effect waves-light col s5 red  modal-trigger">
                                    Delete Account<i class="material-icons right">delete_outline</i></a>
                                <div id="warningModal" class="modal">
                                    <div class="modal-content">
                                        <h5 style="color: red">Warning</h5>
                                        <p style="font-weight: bold">
                                            Do you really want to delete your account?
                                            Please note that after deletion, this account <span style="color: red">
                                            CANNOT</span> be recovered!</p>
                                    </div>
                                    <div class="modal-footer">
                                        <a href="#!" class="modal-close waves-effect waves-green btn-flat">
                                            Cancel</a>
                                        <a href='"""),_display_(/*258.51*/routes/*258.57*/.ReviewerController.reviewerDelete()),format.raw/*258.93*/("""'
                                        class="modal-close waves-effect waves-green btn-flat">Confirm</a>
                                    </div>
                                </div>
                                <a href="/" class="btn waves-effect waves-light col s5 offset-s2 grey">
                                    Cancel<i class="material-icons right">cancel</i></a>
                            </div>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
""")))}))
      }
    }
  }

  def render(id:String,userForm:play.data.Form[models.Reviewer],user:Reviewer): play.twirl.api.HtmlFormat.Appendable = apply(id,userForm,user)

  def f:((String,play.data.Form[models.Reviewer],Reviewer) => play.twirl.api.HtmlFormat.Appendable) = (id,userForm,user) => apply(id,userForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:36 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/reviewerEdit.scala.html
                  HASH: 51bd15429e3e59cec547e5f7f85308b4ab06c820
                  MATRIX: 1159->1|1303->78|1331->99|1346->106|1426->110|1461->119|1524->156|1538->162|1609->212|1692->269|1706->275|1779->327|1942->463|1970->464|2018->485|3239->1678|3268->1679|3321->1704|3411->1766|3440->1767|3469->1768|3568->1839|3597->1840|3654->1869|3751->1938|3780->1939|3833->1964|3892->1995|3921->1996|3978->2025|4049->2068|4078->2069|4129->2092|4158->2093|4205->2112|4234->2113|4405->2256|4434->2257|4483->2278|4567->2334|4596->2335|4642->2353|4801->2484|4830->2485|4879->2506|5170->2769|5199->2770|5252->2795|5559->3074|5588->3075|5634->3093|5663->3094|5709->3112|5887->3262|5916->3263|5965->3284|6315->3606|6344->3607|6390->3625|6674->3881|6703->3882|6752->3903|6815->3938|6844->3939|6897->3964|7223->4262|7252->4263|7309->4292|7411->4366|7440->4367|7493->4392|7549->4420|7578->4421|7627->4442|7788->4575|7817->4576|7870->4601|8114->4817|8143->4818|8200->4847|8302->4921|8331->4922|8380->4943|8409->4944|8438->4945|8471->4950|8500->4951|8553->4976|8665->5060|8694->5061|8751->5090|8862->5172|8892->5173|8953->5206|9161->5386|9190->5387|9243->5412|9272->5413|9326->5438|9367->5450|9397->5451|9455->5480|9662->5658|9692->5659|9722->5660|9756->5665|9786->5666|9844->5695|10019->5841|10049->5842|10111->5875|10218->5953|10248->5954|10302->5979|10332->5980|10382->6001|10412->6002|10459->6020|10489->6021|10526->6030|10580->72|10611->94|10643->6045|10673->6048|10718->6083|10759->6085|10792->6090|11023->6292|11040->6298|11101->6336|11702->6909|11716->6913|11744->6919|11990->7137|12004->7141|12035->7150|12514->7601|12528->7605|12560->7615|13126->8152|13141->8156|13170->8162|13583->8546|13598->8550|13627->8556|14605->9505|14620->9509|14656->9522|15308->10145|15352->10178|15385->10181|15400->10185|15443->10203|16083->10814|16098->10818|16133->10830|16574->11243|16654->11312|16696->11314|16766->11355|16921->11481|16936->11485|16987->11513|17047->11554|17061->11559|17101->11560|17171->11601|17375->11773|17441->11810|18342->12682|18384->12713|18417->12716|18432->12720|18473->12736|18980->13214|19016->13239|19049->13242|19064->13246|19099->13256|19606->13734|19651->13768|19684->13771|19699->13775|19743->13794|20272->14294|20314->14325|20347->14328|20362->14332|20403->14348|20929->14845|20974->14879|21007->14882|21022->14886|21066->14905|21599->15409|21643->15442|21676->15445|21691->15449|21734->15467|22106->15811|22120->15815|22151->15824|23647->17292|23663->17298|23721->17334
                  LINES: 35->1|38->2|40->3|40->3|42->3|43->4|43->4|43->4|43->4|44->5|44->5|44->5|47->8|47->8|48->9|63->24|63->24|64->25|65->26|65->26|65->26|66->27|66->27|67->28|68->29|68->29|69->30|69->30|69->30|70->31|71->32|71->32|72->33|72->33|73->34|73->34|78->39|78->39|79->40|80->41|80->41|82->43|85->46|85->46|86->47|90->51|90->51|91->52|95->56|95->56|96->57|96->57|98->59|101->62|101->62|102->63|106->67|106->67|108->69|112->73|112->73|113->74|113->74|113->74|114->75|117->78|117->78|118->79|119->80|119->80|120->81|121->82|121->82|122->83|124->85|124->85|125->86|127->88|127->88|128->89|129->90|129->90|130->91|130->91|130->91|130->91|130->91|131->92|132->93|132->93|133->94|133->94|133->94|134->95|137->98|137->98|138->99|138->99|139->100|139->100|139->100|140->101|142->103|142->103|142->103|142->103|142->103|143->104|144->105|144->105|145->106|146->107|146->107|147->108|147->108|148->109|148->109|150->111|150->111|151->112|153->1|154->3|154->113|156->115|156->115|156->115|157->116|160->119|160->119|160->119|170->129|170->129|170->129|174->133|174->133|174->133|184->143|184->143|184->143|190->149|190->149|190->149|192->151|192->151|192->151|206->165|206->165|206->165|212->171|212->171|212->171|212->171|212->171|218->177|218->177|218->177|225->184|225->184|225->184|226->185|226->185|226->185|226->185|227->186|227->186|227->186|228->187|229->188|230->189|239->198|239->198|239->198|239->198|239->198|246->205|246->205|246->205|246->205|246->205|253->212|253->212|253->212|253->212|253->212|260->219|260->219|260->219|260->219|260->219|267->226|267->226|267->226|267->226|267->226|274->233|274->233|274->233|274->233|274->233|279->238|279->238|279->238|299->258|299->258|299->258
                  -- GENERATED --
              */
          