
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

object search extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(searchType: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*2.6*/scripts/*2.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*2.17*/("""
        """),format.raw/*3.9*/("""<script type="text/javascript">
            $(document)
                    .ready();
    </script>
    """)))};
Seq[Any](format.raw/*1.22*/("""
    """),format.raw/*7.6*/("""
    """),_display_(/*8.6*/main("General Search Page", scripts)/*8.42*/ {_display_(Seq[Any](format.raw/*8.44*/("""
        """),format.raw/*9.9*/("""<div class="container">
            <div class="row">
                <div class="col s12 m10 offset-m1">
                    <div class="card-panel">
                        """),_display_(/*13.26*/if(searchType.equals("user"))/*13.55*/ {_display_(Seq[Any](format.raw/*13.57*/("""
                            """),format.raw/*14.29*/("""<form class="form-signin" enctype="multipart/form-data" method="post" action=""""),_display_(/*14.108*/routes/*14.114*/.UserController.searchPOST(1, "id")),format.raw/*14.149*/("""">
                                <h4 class="center">Search User</h4>
                                <div class="row">
                                    <div class="input-field col s12">
                                        <input
                                        type="text" name="name" id="userName" class="validate">
                                        <label for="userName">User Name</label>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="input-field col s12">
                                        <input
                                        type="text" name="Email" id="Email" class="validate">
                                        <label for="Email">Email</label>
                                    </div>
                                </div>

                                <div class="row">
                                    <div class="input-field col s12">
                                        <input
                                        type="text" name="MailingAdd" id="Mailing Address" class="validate">
                                        <label for="Mailing Address">Mailing Address</label>
                                    </div>
                                </div>
                                """)))}),format.raw/*38.34*/("""
                        """),_display_(/*39.26*/if(searchType.equals("organization"))/*39.63*/ {_display_(Seq[Any](format.raw/*39.65*/("""
                            """),format.raw/*40.29*/("""<form class="form-signin" enctype="multipart/form-data" method="post" action=""""),_display_(/*40.108*/routes/*40.114*/.OrganizationController.searchPOST(1, "id")),format.raw/*40.157*/("""">
                                <h4 class="center">Search Organzation</h4>
                                <div class="row">
                                    <div class="input-field col s12">
                                        <input
                                        type="text" name="organizationName" id="title" class="validate">
                                        <label for="userName">Organization Name</label>
                                    </div>
                                </div>
                                """)))}),format.raw/*49.34*/("""
                        """),_display_(/*50.26*/if(searchType.equals("author"))/*50.57*/ {_display_(Seq[Any](format.raw/*50.59*/("""
                            """),format.raw/*51.29*/("""<form class="form-signin" enctype="multipart/form-data" method="post" action=""""),_display_(/*51.108*/routes/*51.114*/.AuthorController.searchPOST(1, "id")),format.raw/*51.151*/("""">
                                <h4 class="center">Search Researcher</h4>
                                <div class="row">
                                    <div class="input-field col s12">
                                        <input
                                        type="text" name="AuthorName" id="AuthorName" class="validate">
                                        <label for="AuthorName">Researcher Name</label>
                                    </div>
                                </div>

"""),format.raw/*61.54*/("""
"""),format.raw/*62.74*/("""
"""),format.raw/*63.51*/("""
"""),format.raw/*64.110*/("""
"""),format.raw/*65.89*/("""
"""),format.raw/*66.47*/("""
"""),format.raw/*67.43*/("""
                                """),format.raw/*68.33*/("""<div class="row">
                                    <div class="input-field col s12">
                                        <input
                                        type="text" name="Email" id="Email" class="validate">
                                        <label for="Email">Email</label>
                                    </div>
                                </div>

                                <div class="row">
                                    <div class="input-field col s12">
                                        <input
                                        type="text" name="MailingAdd" id="Mailing Address" class="validate">
                                        <label for="Mailing Address">Mailing Address</label>
                                    </div>
                                </div>

                                <div class="row">
                                    <div class="input-field col s12">
                                        <input
                                        type="text" name="PhoneNum" id="phoneNum" class="validate">
                                        <label for="phoneNum">Phone Number</label>
                                    </div>
                                </div>

                                <div class="row">
                                    <div class="input-field col s12">
                                        <input
                                        type="text" name="ResearchArea" id="Research Area" class="validate">
                                        <label for="Research Area">Research Areas</label>
                                    </div>
                                </div>
                                """)))}),format.raw/*99.34*/("""
                        """),_display_(/*100.26*/if(searchType.equals("paper"))/*100.56*/ {_display_(Seq[Any](format.raw/*100.58*/("""
                            """),format.raw/*101.29*/("""<form class="form-signin" enctype="multipart/form-data" method="post" action=""""),_display_(/*101.108*/routes/*101.114*/.PaperController.searchPaper(1, "id")),format.raw/*101.151*/("""">
                                <h4 class="center">Search Paper</h4>
                                <div class="row">
                                    <div class="input-field col s12">
                                        <input
                                        type="text" name="Title" id="Title" class="validate">
                                        <label for="Title">Title</label>
                                    </div>
                                </div>

                                <div class="row">
                                    <div class="input-field col s12">
                                        <input
                                        type="text" name="PublicationChannel" id="PublicationChannel" class="validate">
                                        <label for="PublicationChannel">Publication Channel</label>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="input-field col s12">
                                        <input
                                        type="text" name="PublicationType" id="PublicationType" class="validate">
                                        <label for="PublicationType">Publication Type</label>
                                    </div>
                                </div>

                                <div class="row">
                                    <div class="input-field col s12">
                                        <input
                                        type="text" name="BookTitle" id="BookTitle" class="validate">
                                        <label for="BookTitle">Book Title</label>
                                    </div>
                                </div>



                                <div class="row">
                                    <div class="input-field col s12">
                                        <input
                                        type="text" name="AbstractText" id="AbstractText" class="validate">
                                        <label for="AbstractText">Abstract Text</label>
                                    </div>
                                </div>
                                """)))}),format.raw/*143.34*/("""
                        """),_display_(/*144.26*/if(searchType.equals("Reviewer"))/*144.59*/ {_display_(Seq[Any](format.raw/*144.61*/("""
                            """),format.raw/*145.29*/("""<form class="form-signin" enctype="multipart/form-data" method="post" action=""""),_display_(/*145.108*/routes/*145.114*/.ReviewerController.searchPOST(1, "id")),format.raw/*145.153*/("""">
                                <h4 class="center">Search Reviewer</h4>
                                <div class="row">
                                    <div class="input-field col s12">
                                        <input
                                        type="text" name="name" id="userName" class="validate">
                                        <label for="userName">Reviewer Name</label>
                                    </div>
                                </div>

                                <div class="row">
                                    <div class="input-field col s12">
                                        <input
                                        type="text" name="Affiliation" id="Affiliation" class="validate">
                                        <label for="Affiliation">Affiliation</label>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="input-field col s12">
                                        <input
                                        type="text" name="Email" id="Email" class="validate">
                                        <label for="Email">Email</label>
                                    </div>
                                </div>

                                <div class="row">
                                    <div class="input-field col s12">
                                        <input
                                        type="text" name="MailingAdd" id="Mailing Address" class="validate">
                                        <label for="Mailing Address">Mailing Address</label>
                                    </div>
                                </div>

                                <div class="row">
                                    <div class="input-field col s12">
                                        <input
                                        type="text" name="PhoneNum" id="phoneNum" class="validate">
                                        <label for="phoneNum">Phone Number</label>
                                    </div>
                                </div>

                                <div class="row">
                                    <div class="input-field col s12">
                                        <input
                                        type="text" name="Research Area" id="Research Area" class="validate">
                                        <label for="Research Area">Research Areas</label>
                                    </div>
                                </div>
                                """)))}),format.raw/*193.34*/("""
                        """),_display_(/*194.26*/if(searchType.equals("project"))/*194.58*/ {_display_(Seq[Any](format.raw/*194.60*/("""
                            """),format.raw/*195.29*/("""<form class="form-signin" enctype="multipart/form-data" method="post" action=""""),_display_(/*195.108*/routes/*195.114*/.ProjectController.searchPOST(1, "id")),format.raw/*195.152*/("""">
                                <h4 class="center">Search Project</h4>
                                <div class="row">
                                    <div class="input-field col s12">
                                        <input
                                        type="text" name="title" id="title" class="validate">
                                        <label for="userName">Project Title</label>
                                    </div>
                                </div>

                                <div class="row">
                                    <div class="input-field col s12">
                                        <input
                                        type="text" name="goals" id="goals" class="validate">
                                        <label for="goals">Goals</label>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="input-field col s12">
                                        <input
                                        type="text" name="location" id="location" class="validate">
                                        <label for="location">Location</label>
                                    </div>
                                </div>
                                """)))}),format.raw/*219.34*/("""



                        """),format.raw/*223.25*/("""<div class="center">
                            <button class="hidden btn waves-effect waves-light blue darken-2" type="submit" value="Search">
                                Search</button>
                            <a href=""""),_display_(/*226.39*/routes/*226.45*/.Application.home()),format.raw/*226.64*/("""" class="btn waves-effect waves-light red darken-2">
                                Cancel</a>
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

  def render(searchType:String): play.twirl.api.HtmlFormat.Appendable = apply(searchType)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (searchType) => apply(searchType)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:36 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/search.scala.html
                  HASH: bc7a25bc56b4eea350598d303d8db83299dfb92f
                  MATRIX: 1112->1|1210->27|1225->34|1305->38|1340->47|1484->21|1515->152|1546->158|1590->194|1629->196|1664->205|1867->381|1905->410|1945->412|2002->441|2109->520|2125->526|2182->561|3610->1958|3663->1984|3709->2021|3749->2023|3806->2052|3913->2131|3929->2137|3994->2180|4578->2733|4631->2759|4671->2790|4711->2792|4768->2821|4875->2900|4891->2906|4950->2943|5497->3515|5526->3589|5555->3640|5585->3750|5614->3839|5643->3886|5672->3929|5733->3962|7515->5713|7569->5739|7609->5769|7650->5771|7708->5800|7816->5879|7833->5885|7893->5922|10255->8252|10309->8278|10352->8311|10393->8313|10451->8342|10559->8421|10576->8427|10638->8466|13399->11195|13453->11221|13495->11253|13536->11255|13594->11284|13702->11363|13719->11369|13780->11407|15191->12786|15248->12814|15507->13045|15523->13051|15564->13070
                  LINES: 35->1|39->2|39->2|41->2|42->3|47->1|48->7|49->8|49->8|49->8|50->9|54->13|54->13|54->13|55->14|55->14|55->14|55->14|79->38|80->39|80->39|80->39|81->40|81->40|81->40|81->40|90->49|91->50|91->50|91->50|92->51|92->51|92->51|92->51|102->61|103->62|104->63|105->64|106->65|107->66|108->67|109->68|140->99|141->100|141->100|141->100|142->101|142->101|142->101|142->101|184->143|185->144|185->144|185->144|186->145|186->145|186->145|186->145|234->193|235->194|235->194|235->194|236->195|236->195|236->195|236->195|260->219|264->223|267->226|267->226|267->226
                  -- GENERATED --
              */
          