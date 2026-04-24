
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
/*3.2*/import models.Technology

object technologyRegister extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*5.2*/scripts/*5.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.13*/("""
    """),format.raw/*6.5*/("""<style>
            tr """),format.raw/*7.16*/("""{"""),format.raw/*7.17*/("""
                """),format.raw/*8.17*/("""border-bottom: none;
            """),format.raw/*9.13*/("""}"""),format.raw/*9.14*/("""
            """),format.raw/*10.13*/("""td """),format.raw/*10.16*/("""{"""),format.raw/*10.17*/("""
                """),format.raw/*11.17*/("""text-align: center;
            """),format.raw/*12.13*/("""}"""),format.raw/*12.14*/("""
            """),format.raw/*13.13*/(""".ql-editor strong"""),format.raw/*13.30*/("""{"""),format.raw/*13.31*/("""
                """),format.raw/*14.17*/("""font-weight:bold;
            """),format.raw/*15.13*/("""}"""),format.raw/*15.14*/("""
            """),format.raw/*16.13*/("""#editor """),format.raw/*16.21*/("""{"""),format.raw/*16.22*/("""
                """),format.raw/*17.17*/("""height: 375px;
            """),format.raw/*18.13*/("""}"""),format.raw/*18.14*/("""
    """),format.raw/*19.5*/("""</style>

    <script type="text/javascript" src='"""),_display_(/*21.42*/routes/*21.48*/.Assets.at("javascripts/database_field_length.js")),format.raw/*21.98*/("""'></script>
    <script type="text/javascript" src='"""),_display_(/*22.42*/routes/*22.48*/.Assets.at("javascripts/field_validation_helper.js")),format.raw/*22.100*/("""'></script>
    <script type="text/javascript">
            count = 0;
            var quill;
            $(document).ready(function () """),format.raw/*26.43*/("""{"""),format.raw/*26.44*/("""
                """),format.raw/*27.17*/("""/**
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

                $("#addPanel").hide();
                $("#showPanel").click(function () """),format.raw/*43.51*/("""{"""),format.raw/*43.52*/("""
                    """),format.raw/*44.21*/("""var panel = document.getElementById("addPanel");
                    if (panel.style.display == "none") """),format.raw/*45.56*/("""{"""),format.raw/*45.57*/("""
                        """),format.raw/*46.25*/("""$("#btnName").attr("style", "transform:rotate(-45deg);transition:transform 0.3s linear;");
                        $("#buttonText").text("Close Window");
                    """),format.raw/*48.21*/("""}"""),format.raw/*48.22*/("""
                    """),format.raw/*49.21*/("""else """),format.raw/*49.26*/("""{"""),format.raw/*49.27*/("""
                        """),format.raw/*50.25*/("""$("#btnName").attr("style", "transform:rotate(0deg);transition:transform 0.3s linear;");
                        $("#buttonText").text("Add Members");
                        document.getElementById("memberName").value = "";
                        document.getElementById("email").value = "";
                        document.getElementById("email").classList.remove("invalid");
                        document.getElementById("memberName").classList.remove("invalid");
                    """),format.raw/*56.21*/("""}"""),format.raw/*56.22*/("""
                    """),format.raw/*57.21*/("""$("#addPanel").slideToggle();
                """),format.raw/*58.17*/("""}"""),format.raw/*58.18*/(""");



            """),format.raw/*62.13*/("""}"""),format.raw/*62.14*/(""");

            function checkValidTechnologyTitle() """),format.raw/*64.50*/("""{"""),format.raw/*64.51*/("""
                """),format.raw/*65.17*/("""var title = document.getElementById("title").value;
                var obj = """),format.raw/*66.27*/("""{"""),format.raw/*66.28*/("""
                    """),format.raw/*67.21*/("""title: title
                """),format.raw/*68.17*/("""}"""),format.raw/*68.18*/(""";

                $.ajax("""),format.raw/*70.24*/("""{"""),format.raw/*70.25*/("""
                    """),format.raw/*71.21*/("""url: "/user/isEmailExisted",
                    url: "/project/isProjectNameExisted",
                    data: JSON.stringify(obj),
                    headers: """),format.raw/*74.30*/("""{"""),format.raw/*74.31*/("""
                        """),format.raw/*75.25*/("""'Content-Type': 'application/json'
                    """),format.raw/*76.21*/("""}"""),format.raw/*76.22*/(""",
                    type: "POST",
                    success: function (data) """),format.raw/*78.46*/("""{"""),format.raw/*78.47*/("""
                        """),format.raw/*79.25*/("""console.log(data);
                        var response = data;
                        if ("error" in response) """),format.raw/*81.50*/("""{"""),format.raw/*81.51*/("""
                            """),format.raw/*82.29*/("""document.getElementById("titleMsg").innerHTML = "Replicated technology name, please change another name!"
                        """),format.raw/*83.25*/("""}"""),format.raw/*83.26*/(""" """),format.raw/*83.27*/("""else """),format.raw/*83.32*/("""{"""),format.raw/*83.33*/("""
                            """),format.raw/*84.29*/("""document.getElementById("titleMsg").innerHTML = ""
                        """),format.raw/*85.25*/("""}"""),format.raw/*85.26*/("""
                    """),format.raw/*86.21*/("""}"""),format.raw/*86.22*/("""
                """),format.raw/*87.17*/("""}"""),format.raw/*87.18*/(""")

            """),format.raw/*89.13*/("""}"""),format.raw/*89.14*/("""


            """),format.raw/*92.13*/("""function cancelAdd()"""),format.raw/*92.33*/("""{"""),format.raw/*92.34*/("""
                """),format.raw/*93.17*/("""$("#warningModal2").modal('close');
            """),format.raw/*94.13*/("""}"""),format.raw/*94.14*/("""



            """),format.raw/*98.13*/("""$("#showPanel").click(function () """),format.raw/*98.47*/("""{"""),format.raw/*98.48*/("""
                """),format.raw/*99.17*/("""$("#warningModal2").modal('close');
            """),format.raw/*100.13*/("""}"""),format.raw/*100.14*/(""")

            function prepareFormForSubmission() //display current HTML
            """),format.raw/*103.13*/("""{"""),format.raw/*103.14*/("""
                """),format.raw/*104.17*/("""if(document.getElementById("titleMsg").innerText.length != 0)
                    return false;
                var ajaxflag = true;
                $.ajax("""),format.raw/*107.24*/("""{"""),format.raw/*107.25*/("""
                    """),format.raw/*108.21*/("""type: "GET",
                    success: function (data) """),format.raw/*109.46*/("""{"""),format.raw/*109.47*/("""
                        """),format.raw/*110.25*/("""var response = data;
                        console.log(data);
                        if('badFormat' in response) """),format.raw/*112.53*/("""{"""),format.raw/*112.54*/("""
                            """),format.raw/*113.29*/("""console.log(response['badFormat']);
                            ajaxflag = false;
                        """),format.raw/*115.25*/("""}"""),format.raw/*115.26*/(""" """),format.raw/*115.27*/("""else"""),format.raw/*115.31*/("""{"""),format.raw/*115.32*/("""
                            """),format.raw/*116.29*/("""if('notExisted' in response)"""),format.raw/*116.57*/("""{"""),format.raw/*116.58*/("""
                                """),format.raw/*117.33*/("""ajaxflag = false;
                            """),format.raw/*118.29*/("""}"""),format.raw/*118.30*/("""else"""),format.raw/*118.34*/("""{"""),format.raw/*118.35*/("""

                            """),format.raw/*120.29*/("""}"""),format.raw/*120.30*/("""

                        """),format.raw/*122.25*/("""}"""),format.raw/*122.26*/("""
                    """),format.raw/*123.21*/("""}"""),format.raw/*123.22*/("""
                """),format.raw/*124.17*/("""}"""),format.raw/*124.18*/(""");
                if(!ajaxflag)"""),format.raw/*125.30*/("""{"""),format.raw/*125.31*/("""
                    """),format.raw/*126.21*/("""return false;
                """),format.raw/*127.17*/("""}"""),format.raw/*127.18*/("""


                """),format.raw/*130.17*/("""// if (document.getElementById("agreement").checked == false) """),format.raw/*130.79*/("""{"""),format.raw/*130.80*/("""
                """),format.raw/*131.17*/("""//     document.getElementById("warningMessage").innerText = "You must accept the terms and conditions before you can register a project!";
                //     $("#warningModal").modal();
                //     $("#warningModal").modal('open');
                //     return false;
                // """),format.raw/*135.20*/("""}"""),format.raw/*135.21*/("""

                """),format.raw/*137.17*/("""return true;
            """),format.raw/*138.13*/("""}"""),format.raw/*138.14*/("""
    """),format.raw/*139.5*/("""</script>
""")))};
Seq[Any](format.raw/*140.2*/("""

"""),_display_(/*142.2*/main("Register Technology", scripts)/*142.38*/ {_display_(Seq[Any](format.raw/*142.40*/("""
    """),format.raw/*143.5*/("""<link href='"""),_display_(/*143.18*/routes/*143.24*/.Assets.at("stylesheets/quill.snow.css")),format.raw/*143.64*/("""'
    rel="stylesheet" />
    <script type="text/javascript" src='"""),_display_(/*145.42*/routes/*145.48*/.Assets.at("javascripts/plugins/quill.js")),format.raw/*145.90*/("""'></script>

    <div class="container">
        <div class="row">
            <div class="col  s12 m10 offset-m1">
                <div class="card-panel">
                    <h4 class="center form-signin-heading" align="center">
                        Register a Technology</h4>
                    <form class="form-signin" enctype="multipart/form-data" id="technologyForm" onsubmit="return prepareFormForSubmission()" method="post" action=""""),_display_(/*153.165*/routes/*153.171*/.TechnologyController.technologyRegisterPOST()),format.raw/*153.217*/("""">
                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="technologyTitle" id="technologyTitle" class="validate" required onchange="checkValidTechnologyTitle()">
                                <label for="technologyTitle">Title*</label>
                                <span id="titleMsg" class="helper-text" data-error="" style="color: red;"></span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="goals" id="goals" class="validate" required>
                                <label for="goals">
                                    Goals* </label>
                                <span id="goalsMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="shortDescription" id="shortDescription" class="validate" required>
                                <label for="shortDescription">
                                    Short Description* </label>
                                <span id="shortDescriptionMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="longDescription" id="longDescription" class="validate" required>
                                <label for="longDescription">
                                    Long Description* </label>
                                <span id="longDescriptionMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="keywords" id="keywords" class="validate" required>
                                <label for="keywords">
                                    Keywords* </label>
                                <span id="keywordsMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>



                        <div class="row">
                            <div class="input-field col s12">
                                <input type="text" name="fields" id="fields" class="validate">
                                <label for="fields">
                                    Fields </label>
                                <span id="fieldsMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>


                        <div class="row">
                            <div class="file-field input-field col s12" >
                                <div class="btn waves-effect waves-light blue darken-2" >
                                    <span >Upload Representative Paper PDF</span>
                                    <input type="file" accept=".pdf" id="pdf" name="pdf">
                                </div>
                                <div class="file-path-wrapper">
                                    <input class="file-path validate" type="text">
                                </div>
                            </div>
                        </div>

                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="representativePaperURL" id="representativePaperURL" class="validate">
                                <label for="representativePaperURL">
                                    Representative Paper URL </label>
                                <span id="representativePaperURLMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="teamMembers" id="teamMembers" class="validate">
                                <label for="teamMembers">
                                    Team Members </label>
                                <span id="teamMembersMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input
                                type="text" name="organization" id="organization" class="validate">
                                <label for="organization">
                                    Organization Name </label>
                                <span id="organizationMsg" class="helper-text" data-error=""></span>
                            </div>
                        </div>


                        """),format.raw/*252.46*/("""
                        """),format.raw/*253.36*/("""
                        """),format.raw/*254.69*/("""
                        """),format.raw/*255.35*/("""
                        """),format.raw/*256.144*/("""
                        """),format.raw/*257.57*/("""
                        """),format.raw/*258.105*/("""
                        """),format.raw/*259.113*/("""
                        """),format.raw/*260.37*/("""
                        """),format.raw/*261.35*/("""

                        """),format.raw/*263.25*/("""<div id="warningModal" class="modal">
                            <div class="modal-content">
                                <h5 class="center" style="color: red">Warning!</h5>
                                <h6 class="center" style="font-weight: bold" id="warningMessage"></h6>
                            </div>
                        </div>


                        <div class="actions row center">
                            <div class="input-field col s12">
                                <button type="submit" id="technologyRegister" class="btn waves-effect waves-light blue darken-2">
                                    Submit</button>
                                <a href=""""),_display_(/*275.43*/routes/*275.49*/.Application.home()),format.raw/*275.68*/("""" class="btn waves-effect waves-light red darken-2">
                                    Cancel</a>

                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
""")))}),format.raw/*285.2*/("""
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
                  DATE: Fri Apr 24 12:50:39 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/technologyRegister.scala.html
                  HASH: c0ce515620615cc0ccd43f7f0aa9e352e7565a2e
                  MATRIX: 814->1|837->18|860->35|1268->62|1282->69|1362->73|1393->78|1443->101|1471->102|1515->119|1575->152|1603->153|1644->166|1675->169|1704->170|1749->187|1809->219|1838->220|1879->233|1924->250|1953->251|1998->268|2056->298|2085->299|2126->312|2162->320|2191->321|2236->338|2291->365|2320->366|2352->371|2430->422|2445->428|2516->478|2596->531|2611->537|2685->589|2849->725|2878->726|2923->743|4046->1838|4075->1839|4124->1860|4256->1964|4285->1965|4338->1990|4540->2164|4569->2165|4618->2186|4651->2191|4680->2192|4733->2217|5252->2708|5281->2709|5330->2730|5404->2776|5433->2777|5479->2795|5508->2796|5589->2849|5618->2850|5663->2867|5769->2945|5798->2946|5847->2967|5904->2996|5933->2997|5987->3023|6016->3024|6065->3045|6256->3208|6285->3209|6338->3234|6421->3289|6450->3290|6559->3371|6588->3372|6641->3397|6782->3510|6811->3511|6868->3540|7026->3670|7055->3671|7084->3672|7117->3677|7146->3678|7203->3707|7306->3782|7335->3783|7384->3804|7413->3805|7458->3822|7487->3823|7530->3838|7559->3839|7602->3854|7650->3874|7679->3875|7724->3892|7800->3940|7829->3941|7873->3957|7935->3991|7964->3992|8009->4009|8086->4057|8116->4058|8231->4144|8261->4145|8307->4162|8492->4318|8522->4319|8572->4340|8659->4398|8689->4399|8743->4424|8888->4540|8918->4541|8976->4570|9111->4676|9141->4677|9171->4678|9204->4682|9234->4683|9292->4712|9349->4740|9379->4741|9441->4774|9516->4820|9546->4821|9579->4825|9609->4826|9668->4856|9698->4857|9753->4883|9783->4884|9833->4905|9863->4906|9909->4923|9939->4924|10000->4956|10030->4957|10080->4978|10139->5008|10169->5009|10217->5028|10308->5090|10338->5091|10384->5108|10717->5412|10747->5413|10794->5431|10848->5456|10878->5457|10911->5462|10962->5473|10992->5476|11038->5512|11079->5514|11112->5519|11153->5532|11169->5538|11231->5578|11326->5645|11342->5651|11406->5693|11882->6140|11899->6146|11968->6192|17483->11699|17537->11735|17591->11804|17645->11839|17700->11983|17754->12040|17809->12145|17864->12258|17918->12295|17972->12330|18027->12356|18747->13048|18763->13054|18804->13073|19099->13337
                  LINES: 31->1|32->2|33->3|42->5|42->5|44->5|45->6|46->7|46->7|47->8|48->9|48->9|49->10|49->10|49->10|50->11|51->12|51->12|52->13|52->13|52->13|53->14|54->15|54->15|55->16|55->16|55->16|56->17|57->18|57->18|58->19|60->21|60->21|60->21|61->22|61->22|61->22|65->26|65->26|66->27|82->43|82->43|83->44|84->45|84->45|85->46|87->48|87->48|88->49|88->49|88->49|89->50|95->56|95->56|96->57|97->58|97->58|101->62|101->62|103->64|103->64|104->65|105->66|105->66|106->67|107->68|107->68|109->70|109->70|110->71|113->74|113->74|114->75|115->76|115->76|117->78|117->78|118->79|120->81|120->81|121->82|122->83|122->83|122->83|122->83|122->83|123->84|124->85|124->85|125->86|125->86|126->87|126->87|128->89|128->89|131->92|131->92|131->92|132->93|133->94|133->94|137->98|137->98|137->98|138->99|139->100|139->100|142->103|142->103|143->104|146->107|146->107|147->108|148->109|148->109|149->110|151->112|151->112|152->113|154->115|154->115|154->115|154->115|154->115|155->116|155->116|155->116|156->117|157->118|157->118|157->118|157->118|159->120|159->120|161->122|161->122|162->123|162->123|163->124|163->124|164->125|164->125|165->126|166->127|166->127|169->130|169->130|169->130|170->131|174->135|174->135|176->137|177->138|177->138|178->139|180->140|182->142|182->142|182->142|183->143|183->143|183->143|183->143|185->145|185->145|185->145|193->153|193->153|193->153|292->252|293->253|294->254|295->255|296->256|297->257|298->258|299->259|300->260|301->261|303->263|315->275|315->275|315->275|325->285
                  -- GENERATED --
              */
          