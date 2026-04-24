
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

object addProjectFollowers extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Project,List[User],User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(project: Project, followers: List[User], creator:User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._

def /*4.2*/scripts/*4.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*4.13*/("""
    """),format.raw/*5.5*/("""<style>
            tr """),format.raw/*6.16*/("""{"""),format.raw/*6.17*/("""
                """),format.raw/*7.17*/("""border-bottom: none;
            """),format.raw/*8.13*/("""}"""),format.raw/*8.14*/("""
            """),format.raw/*9.13*/("""td """),format.raw/*9.16*/("""{"""),format.raw/*9.17*/("""
                """),format.raw/*10.17*/("""text-align: center;
            """),format.raw/*11.13*/("""}"""),format.raw/*11.14*/("""
            """),format.raw/*12.13*/(""".ql-editor strong"""),format.raw/*12.30*/("""{"""),format.raw/*12.31*/("""
                """),format.raw/*13.17*/("""font-weight:bold;
            """),format.raw/*14.13*/("""}"""),format.raw/*14.14*/("""
            """),format.raw/*15.13*/("""#editor """),format.raw/*15.21*/("""{"""),format.raw/*15.22*/("""
                """),format.raw/*16.17*/("""height: 375px;
            """),format.raw/*17.13*/("""}"""),format.raw/*17.14*/("""
    """),format.raw/*18.5*/("""</style>
    <script type="text/javascript" src='"""),_display_(/*19.42*/routes/*19.48*/.Assets.at("javascripts/database_field_length.js")),format.raw/*19.98*/("""'></script>
    <script type="text/javascript" src='"""),_display_(/*20.42*/routes/*20.48*/.Assets.at("javascripts/field_validation_helper.js")),format.raw/*20.100*/("""'></script>
    <script type="text/javascript">
    var deleteId;
    function deleteOneFollower() """),format.raw/*23.34*/("""{"""),format.raw/*23.35*/("""
        """),format.raw/*24.9*/("""var events = "New versions published;News published;";
        $.ajax("""),format.raw/*25.16*/("""{"""),format.raw/*25.17*/("""
            """),format.raw/*26.13*/("""url: "/project/deleteOneFollower/" + deleteId + "/" + """),_display_(/*26.68*/project/*26.75*/.getId),format.raw/*26.81*/(""" """),format.raw/*26.82*/("""+"/" + events,
            headers: """),format.raw/*27.22*/("""{"""),format.raw/*27.23*/("""
                """),format.raw/*28.17*/("""'Content-Type': 'application/json'
            """),format.raw/*29.13*/("""}"""),format.raw/*29.14*/(""",
            async: false,
            type: "GET"
        """),format.raw/*32.9*/("""}"""),format.raw/*32.10*/(""").done(function (data) """),format.raw/*32.33*/("""{"""),format.raw/*32.34*/("""
            """),format.raw/*33.13*/("""$("#" + deleteId).hide();
        """),format.raw/*34.9*/("""}"""),format.raw/*34.10*/(""");
    """),format.raw/*35.5*/("""}"""),format.raw/*35.6*/("""

    """),format.raw/*37.5*/("""function addOneFollower()"""),format.raw/*37.30*/("""{"""),format.raw/*37.31*/("""
        """),format.raw/*38.9*/("""$("#emailMsg").text("")
        var firstName = $("#firstName").val();
        var lastName = $("#lastName").val();
        var email = $("#email").val();
        if(email == "")"""),format.raw/*42.24*/("""{"""),format.raw/*42.25*/("""
            """),format.raw/*43.13*/("""$("#emailMsg").text("Email is required field!")
            return;
        """),format.raw/*45.9*/("""}"""),format.raw/*45.10*/("""
        """),format.raw/*46.9*/("""var obj = """),format.raw/*46.19*/("""{"""),format.raw/*46.20*/("""
            """),format.raw/*47.13*/("""firstName:firstName,
            lastName:lastName,
            email:email
        """),format.raw/*50.9*/("""}"""),format.raw/*50.10*/("""

        """),format.raw/*52.9*/("""var events = "New versions published;News published;";
        $.ajax("""),format.raw/*53.16*/("""{"""),format.raw/*53.17*/("""
            """),format.raw/*54.13*/("""url: "/project/addOneFollower/" + '"""),_display_(/*54.49*/project/*54.56*/.getId),format.raw/*54.62*/("""' +"/" + events,
            data: JSON.stringify(obj),
            headers: """),format.raw/*56.22*/("""{"""),format.raw/*56.23*/("""
                """),format.raw/*57.17*/("""'Content-Type': 'application/json'
            """),format.raw/*58.13*/("""}"""),format.raw/*58.14*/(""",
            async: false,
            type: "POST"
        """),format.raw/*61.9*/("""}"""),format.raw/*61.10*/(""").done(function (data) """),format.raw/*61.33*/("""{"""),format.raw/*61.34*/("""
            """),format.raw/*62.13*/("""console.log(data);
            var response = data;
            if ("error" in response) """),format.raw/*64.38*/("""{"""),format.raw/*64.39*/("""
                """),format.raw/*65.17*/("""$("#emailMsg").text(response["error"]);
            """),format.raw/*66.13*/("""}"""),format.raw/*66.14*/(""" """),format.raw/*66.15*/("""else """),format.raw/*66.20*/("""{"""),format.raw/*66.21*/("""

                """),format.raw/*68.17*/("""var followerId = response["user"]["id"];
                var follwerEmail = response["user"]["email"];
                var followerName = response["user"]["userName"];

                var newFollower = "<tr id='" + followerId+ "'>"
                    +"<td>" + followerName + "</td>"
                    +"<td>" + follwerEmail + "</td>"
                    +"<td><a href='javascript:void(0)' onclick='deleteMember(this)'><i style='color: red;' class=\"material-icons\">delete</i></a></td>\n</tr>"
                $("#previewTable").append(newFollower);

            """),format.raw/*78.13*/("""}"""),format.raw/*78.14*/("""
        """),format.raw/*79.9*/("""}"""),format.raw/*79.10*/(""");
    """),format.raw/*80.5*/("""}"""),format.raw/*80.6*/("""

    """),format.raw/*82.5*/("""function deleteMember(obj) """),format.raw/*82.32*/("""{"""),format.raw/*82.33*/("""
        """),format.raw/*83.9*/("""deleteId  = $(obj).parent().parent().attr("id");

        $("#warningModal").modal();
        $("#warningModal").modal('open');
    """),format.raw/*87.5*/("""}"""),format.raw/*87.6*/("""


    """),format.raw/*90.5*/("""</script>
""")))};
Seq[Any](format.raw/*1.57*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*91.2*/("""

"""),_display_(/*93.2*/main("Project Edit", scripts)/*93.31*/ {_display_(Seq[Any](format.raw/*93.33*/("""

    """),format.raw/*95.5*/("""<link href='"""),_display_(/*95.18*/routes/*95.24*/.Assets.at("stylesheets/quill.snow.css")),format.raw/*95.64*/("""'
    rel="stylesheet" />
    <script type="text/javascript" src='"""),_display_(/*97.42*/routes/*97.48*/.Assets.at("javascripts/plugins/quill.js")),format.raw/*97.90*/("""'></script>

    <div class="container">
        <div class="row">
            <div class="col  s12 m10 offset-m1">
                <div class="card-panel">
                    <h4 class="center form-signin-heading" align="center">
                        Add Followers For """),_display_(/*104.44*/project/*104.51*/.getTitle),format.raw/*104.60*/("""</h4>




                    <div id="warningModal" class="modal">
                        <div class="modal-content">
                            <h5 style="color: red">Warning!</h5>
                            <p style="font-weight: bold">Do you really want delete this follower?
                                Please note that after this change, this user <span style="color: red">
                                MAY NOT</span> see this project again.</p>
                        </div>
                        <div class="modal-footer">
                            <a id="cancel-change-creator" class="modal-close waves-effect waves-green btn-flat">
                                Cancel</a>
                            <a id="confirm-change-creator" onclick="deleteOneFollower()"
                            class="modal-close waves-effect waves-green btn-flat">Confirm</a>
                        </div>
                    </div>


                        <div class="row">


                                <div class="col s10 offset-s1">
                                    <div class="input-field col s12">
                                        <input
                                        type="text" name="firstName" id="firstName" class="validate">
                                        <label for="firstName">First Name</label>
                                        <span id="firstNameMsg" class="helper-text" data-error=""></span>
                                    </div>
                                    <div class="input-field col s12">
                                        <input
                                        type="text" name="lastName" id="lastName" class="validate">
                                        <label for="lastName">Last Name</label>
                                        <span id="lastNameMsg" class="helper-text" data-error=""></span>
                                    </div>
                                    <div class="input-field col s12">
                                        <input type="email" name="email" id="email" class="validate">
                                        <label for="email">Email</label>
                                        <span id="emailMsg" class="helper-text" style="color: red" data-error=""></span>
                                    </div>

                                    <div class="center input-field col s12">
                                        <button id="addFollower" onclick="addOneFollower()" class="btn waves-effect waves-light blue darken-2">
                                            Add Follower</button>

                                    </div>

                                </div>

                            <div class="col s12">
                                <Table class="highlight">
                                    <tbody id="previewTable">
                                    """),_display_(/*158.38*/if(followers!=null)/*158.57*/ {_display_(Seq[Any](format.raw/*158.59*/("""
                                        """),_display_(/*159.42*/for(follower <- followers) yield /*159.68*/ {_display_(Seq[Any](format.raw/*159.70*/("""
                                            """),format.raw/*160.45*/("""<tr id=""""),_display_(/*160.54*/follower/*160.62*/.getId),format.raw/*160.68*/("""">

                                                <td>"""),_display_(/*162.54*/follower/*162.62*/.getUserName),format.raw/*162.74*/("""</td>
                                                <td>"""),_display_(/*163.54*/if(follower.getEmail() == "" || follower.getEmail() == null)/*163.114*/ {_display_(Seq[Any](format.raw/*163.116*/("""
                                                    """),format.raw/*164.53*/("""-
                                                """)))}/*165.51*/else/*165.56*/{_display_(Seq[Any](format.raw/*165.57*/("""
                                                    """),_display_(/*166.54*/follower/*166.62*/.getEmail()),format.raw/*166.73*/("""
                                                """)))}),format.raw/*167.50*/("""</td>
                                                <td><a href='javascript:void(0)' onclick='deleteMember(this)'><i style='color: red;' class="material-icons">delete</i></a></td>
                                            </tr>
                                        """)))}),format.raw/*170.42*/("""
                                    """)))}),format.raw/*171.38*/("""
                                    """),format.raw/*172.37*/("""</tbody>
                                </Table>
                            </div>
                        </div>



                        <div class="actions row center">
                            <div class="input-field col s12">
                                <a href=""""),_display_(/*181.43*/routes/*181.49*/.ProjectController.projectDetail(project.getId)),format.raw/*181.96*/("""" class="btn waves-effect waves-light blue darken-2">
                                    Project Detail</a>
                            </div>
                        </div>

                </div>
            </div>
        </div>
    </div>

""")))}),format.raw/*191.2*/("""
"""))
      }
    }
  }

  def render(project:Project,followers:List[User],creator:User): play.twirl.api.HtmlFormat.Appendable = apply(project,followers,creator)

  def f:((Project,List[User],User) => play.twirl.api.HtmlFormat.Appendable) = (project,followers,creator) => apply(project,followers,creator)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:27 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/addProjectFollowers.scala.html
                  HASH: bd355f7e846913efa58b05225118935bfe1ef09b
                  MATRIX: 1142->1|1270->58|1298->76|1312->83|1392->87|1423->92|1473->115|1501->116|1545->133|1605->166|1633->167|1673->180|1703->183|1731->184|1776->201|1836->233|1865->234|1906->247|1951->264|1980->265|2025->282|2083->312|2112->313|2153->326|2189->334|2218->335|2263->352|2318->379|2347->380|2379->385|2456->435|2471->441|2542->491|2622->544|2637->550|2711->602|2838->701|2867->702|2903->711|3001->781|3030->782|3071->795|3153->850|3169->857|3196->863|3225->864|3289->900|3318->901|3363->918|3438->965|3467->966|3554->1026|3583->1027|3634->1050|3663->1051|3704->1064|3765->1098|3794->1099|3828->1106|3856->1107|3889->1113|3942->1138|3971->1139|4007->1148|4213->1326|4242->1327|4283->1340|4386->1416|4415->1417|4451->1426|4489->1436|4518->1437|4559->1450|4670->1534|4699->1535|4736->1545|4834->1615|4863->1616|4904->1629|4967->1665|4983->1672|5010->1678|5115->1755|5144->1756|5189->1773|5264->1820|5293->1821|5381->1882|5410->1883|5461->1906|5490->1907|5531->1920|5648->2009|5677->2010|5722->2027|5802->2079|5831->2080|5860->2081|5893->2086|5922->2087|5968->2105|6564->2673|6593->2674|6629->2683|6658->2684|6692->2691|6720->2692|6753->2698|6808->2725|6837->2726|6873->2735|7032->2867|7060->2868|7094->2875|7144->56|7171->74|7199->2886|7228->2889|7266->2918|7306->2920|7339->2926|7379->2939|7394->2945|7455->2985|7549->3052|7564->3058|7627->3100|7930->3375|7947->3382|7978->3391|10941->6326|10970->6345|11011->6347|11081->6389|11124->6415|11165->6417|11239->6462|11276->6471|11294->6479|11322->6485|11407->6542|11425->6550|11459->6562|11546->6621|11617->6681|11659->6683|11741->6736|11812->6788|11826->6793|11866->6794|11948->6848|11966->6856|11999->6867|12081->6917|12386->7190|12456->7228|12522->7265|12830->7545|12846->7551|12915->7598|13192->7844
                  LINES: 35->1|38->2|40->4|40->4|42->4|43->5|44->6|44->6|45->7|46->8|46->8|47->9|47->9|47->9|48->10|49->11|49->11|50->12|50->12|50->12|51->13|52->14|52->14|53->15|53->15|53->15|54->16|55->17|55->17|56->18|57->19|57->19|57->19|58->20|58->20|58->20|61->23|61->23|62->24|63->25|63->25|64->26|64->26|64->26|64->26|64->26|65->27|65->27|66->28|67->29|67->29|70->32|70->32|70->32|70->32|71->33|72->34|72->34|73->35|73->35|75->37|75->37|75->37|76->38|80->42|80->42|81->43|83->45|83->45|84->46|84->46|84->46|85->47|88->50|88->50|90->52|91->53|91->53|92->54|92->54|92->54|92->54|94->56|94->56|95->57|96->58|96->58|99->61|99->61|99->61|99->61|100->62|102->64|102->64|103->65|104->66|104->66|104->66|104->66|104->66|106->68|116->78|116->78|117->79|117->79|118->80|118->80|120->82|120->82|120->82|121->83|125->87|125->87|128->90|130->1|131->3|132->91|134->93|134->93|134->93|136->95|136->95|136->95|136->95|138->97|138->97|138->97|145->104|145->104|145->104|199->158|199->158|199->158|200->159|200->159|200->159|201->160|201->160|201->160|201->160|203->162|203->162|203->162|204->163|204->163|204->163|205->164|206->165|206->165|206->165|207->166|207->166|207->166|208->167|211->170|212->171|213->172|222->181|222->181|222->181|232->191
                  -- GENERATED --
              */
          