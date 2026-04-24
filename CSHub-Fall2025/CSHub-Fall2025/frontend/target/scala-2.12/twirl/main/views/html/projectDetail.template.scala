
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
/*3.2*/import models.Project

object projectDetail extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Project,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(project: Project):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*8.2*/scripts/*8.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*8.13*/("""
    """),format.raw/*9.5*/("""<style>
        tr """),format.raw/*10.12*/("""{"""),format.raw/*10.13*/("""
            """),format.raw/*11.13*/("""border-bottom: none;
        """),format.raw/*12.9*/("""}"""),format.raw/*12.10*/("""
        """),format.raw/*13.9*/("""td """),format.raw/*13.12*/("""{"""),format.raw/*13.13*/("""
            """),format.raw/*14.13*/("""text-align: center;
        """),format.raw/*15.9*/("""}"""),format.raw/*15.10*/("""
        """),format.raw/*16.9*/("""p """),format.raw/*16.11*/("""{"""),format.raw/*16.12*/("""
            """),format.raw/*17.13*/("""margin-bottom : 5px;
        """),format.raw/*18.9*/("""}"""),format.raw/*18.10*/("""
    """),format.raw/*19.5*/("""</style>
    <script type="text/javascript">
            // $(document).ready(function () """),format.raw/*21.46*/("""{"""),format.raw/*21.47*/("""
            """),format.raw/*22.13*/("""//     // var doc = document.getElementById('description').contentWindow.document;
            //     // doc.open();
            //     var quill = new Quill('#quill-container', """),format.raw/*24.62*/("""{"""),format.raw/*24.63*/("""
            """),format.raw/*25.13*/("""//         scrollingContainer: '#scrolling-container'
            //     """),format.raw/*26.20*/("""}"""),format.raw/*26.21*/(""");
            //
            //     quill.clipboard.dangerouslyPasteHTML(entityToString());
            //     quill.enable(false);
            //     document.body.scrollTop = document.documentElement.scrollTop = 0;
            // """),format.raw/*31.16*/("""}"""),format.raw/*31.17*/(""");

            // function reinitIframe()"""),format.raw/*33.39*/("""{"""),format.raw/*33.40*/("""
            """),format.raw/*34.13*/("""//     var iframe = document.getElementById("description");
            //     try"""),format.raw/*35.23*/("""{"""),format.raw/*35.24*/("""
            """),format.raw/*36.13*/("""//         var bHeight = iframe.contentWindow.document.body.scrollHeight;
            //         var dHeight = iframe.contentWindow.document.documentElement.scrollHeight;
            //         var height = Math.max(bHeight, dHeight);
            //         iframe.height = height;
            //     """),format.raw/*40.20*/("""}"""),format.raw/*40.21*/("""catch (ex)"""),format.raw/*40.31*/("""{"""),format.raw/*40.32*/("""}"""),format.raw/*40.33*/("""
            """),format.raw/*41.13*/("""// """),format.raw/*41.16*/("""}"""),format.raw/*41.17*/("""
            """),format.raw/*42.59*/("""
            """),format.raw/*43.43*/("""
            """),format.raw/*44.59*/("""
            """),format.raw/*45.61*/("""
            """),format.raw/*46.60*/("""
            """),format.raw/*47.32*/("""
            """),format.raw/*48.18*/("""

            """),format.raw/*50.76*/("""
            """),format.raw/*51.13*/("""// function changeView(view)"""),format.raw/*51.41*/("""{"""),format.raw/*51.42*/("""
            """),format.raw/*52.13*/("""//     $.ajax("""),format.raw/*52.27*/("""{"""),format.raw/*52.28*/("""
            """),format.raw/*53.13*/("""//         url: "/updateProjectZone/" + view,
            //         headers: """),format.raw/*54.33*/("""{"""),format.raw/*54.34*/("""
            """),format.raw/*55.13*/("""//             'Content-Type': 'application/json'
            //         """),format.raw/*56.24*/("""}"""),format.raw/*56.25*/(""",
            //         type: "GET"
            //     """),format.raw/*58.20*/("""}"""),format.raw/*58.21*/(""").done(function (data) """),format.raw/*58.44*/("""{"""),format.raw/*58.45*/("""
            """),format.raw/*59.13*/("""//         window.location.href = "/";
            //     """),format.raw/*60.20*/("""}"""),format.raw/*60.21*/(""");
            // """),format.raw/*61.16*/("""}"""),format.raw/*61.17*/("""
    """),format.raw/*62.5*/("""</script>
""")))};
Seq[Any](format.raw/*5.20*/("""


"""),format.raw/*63.2*/("""

"""),_display_(/*65.2*/main("Project Detail", scripts)/*65.33*/ {_display_(Seq[Any](format.raw/*65.35*/("""
    """),format.raw/*66.5*/("""<link href='"""),_display_(/*66.18*/routes/*66.24*/.Assets.at("stylesheets/quill.snow.css")),format.raw/*66.64*/("""'
    rel="stylesheet" />
    <script type="text/javascript" src='"""),_display_(/*68.42*/routes/*68.48*/.Assets.at("javascripts/plugins/quill.js")),format.raw/*68.90*/("""'></script>
    <div class="container">
        <div class="row">
            <div class="col s12 m10 offset-m1">
                <div class="card-panel">
                    <h4 class="center form-signin-heading" align="center">
                    """),_display_(/*74.22*/project/*74.29*/.getTitle),format.raw/*74.38*/(""" """),format.raw/*74.39*/("""</h4>
                    """),_display_(/*75.22*/if(!project.getGoals.isEmpty)/*75.51*/ {_display_(Seq[Any](format.raw/*75.53*/("""
                        """),format.raw/*76.25*/("""<div class="row">
                            <div class="col s12">
                                <h6>Goals</h6>
                                <p>"""),_display_(/*79.37*/project/*79.44*/.getGoals),format.raw/*79.53*/("""</p>
                            </div>
                        </div>
                    """)))}),format.raw/*82.22*/("""
                    """),_display_(/*83.22*/if(project.getStartDate()!=null && !project.getStartDate.isEmpty)/*83.87*/ {_display_(Seq[Any](format.raw/*83.89*/("""
                        """),format.raw/*84.25*/("""<div class="row">
                            <div class=" col s12">
                                <h6>Start Date </h6>
                                <textarea class="materialize-textarea" style="border-bottom: none" readonly>"""),_display_(/*87.110*/project/*87.117*/.getStartDate),format.raw/*87.130*/("""</textarea>
                            </div>
                        </div>
                    """)))}),format.raw/*90.22*/("""

                    """),_display_(/*92.22*/if(project.getEndDate()!=null && !project.getEndDate.isEmpty)/*92.83*/ {_display_(Seq[Any](format.raw/*92.85*/("""
                        """),format.raw/*93.25*/("""<div class="row">
                            <div class=" col s12">
                                <h6>End Date </h6>
                                <textarea class="materialize-textarea" style="border-bottom: none" readonly>"""),_display_(/*96.110*/project/*96.117*/.getEndDate),format.raw/*96.128*/("""</textarea>
                            </div>
                        </div>
                    """)))}),format.raw/*99.22*/("""
"""),format.raw/*100.93*/("""
"""),format.raw/*101.46*/("""
"""),format.raw/*102.54*/("""
"""),format.raw/*103.51*/("""
"""),format.raw/*104.43*/("""
"""),format.raw/*105.122*/("""
"""),format.raw/*106.88*/("""
"""),format.raw/*107.46*/("""
"""),format.raw/*108.39*/("""
"""),format.raw/*109.35*/("""
"""),format.raw/*110.26*/("""

"""),format.raw/*112.91*/("""
"""),format.raw/*113.46*/("""
"""),format.raw/*114.54*/("""
"""),format.raw/*115.59*/("""
"""),format.raw/*116.77*/("""
"""),format.raw/*117.59*/("""
"""),format.raw/*118.91*/("""
"""),format.raw/*119.39*/("""
"""),format.raw/*120.35*/("""
"""),format.raw/*121.26*/("""
"""),format.raw/*122.78*/("""
"""),format.raw/*123.106*/("""
"""),format.raw/*124.57*/("""
"""),format.raw/*125.41*/("""
"""),format.raw/*126.26*/("""

"""),format.raw/*128.53*/("""
"""),format.raw/*129.46*/("""
"""),format.raw/*130.54*/("""
"""),format.raw/*131.61*/("""
"""),format.raw/*132.158*/("""
"""),format.raw/*133.39*/("""
"""),format.raw/*134.35*/("""
"""),format.raw/*135.26*/("""

"""),format.raw/*137.140*/("""
"""),format.raw/*138.46*/("""
"""),format.raw/*139.55*/("""
"""),format.raw/*140.65*/("""
"""),format.raw/*141.63*/("""
"""),format.raw/*142.43*/("""
"""),format.raw/*143.104*/("""
"""),format.raw/*144.39*/("""
"""),format.raw/*145.35*/("""
"""),format.raw/*146.26*/("""

"""),format.raw/*148.97*/("""
"""),format.raw/*149.46*/("""
"""),format.raw/*150.54*/("""
"""),format.raw/*151.57*/("""
"""),format.raw/*152.117*/("""
"""),format.raw/*153.39*/("""
"""),format.raw/*154.35*/("""
"""),format.raw/*155.26*/("""

"""),format.raw/*157.96*/("""
"""),format.raw/*158.46*/("""
"""),format.raw/*159.54*/("""
"""),format.raw/*160.60*/("""
"""),format.raw/*161.121*/("""
"""),format.raw/*162.39*/("""
"""),format.raw/*163.35*/("""
"""),format.raw/*164.26*/("""

                        """),_display_(/*166.26*/if(project.getTechnology()!=null && !project.getTechnology.isEmpty)/*166.93*/ {_display_(Seq[Any](format.raw/*166.95*/("""
                            """),format.raw/*167.29*/("""<div class="row">
                                <div class=" col s12">
                                    <h6>Technologies Used </h6>
                                    <textarea class="materialize-textarea" style="border-bottom: none" readonly>"""),_display_(/*170.114*/project/*170.121*/.getTechnology),format.raw/*170.135*/("""</textarea>
                                </div>
                            </div>
                        """)))}),format.raw/*173.26*/("""

                        """),_display_(/*175.26*/if(project.getLocation!=null && !project.getLocation.isEmpty)/*175.87*/ {_display_(Seq[Any](format.raw/*175.89*/("""
                            """),format.raw/*176.29*/("""<div class="row">
                                <div class="col s12">
                                    <h6>Location </h6>
                                    <p>"""),_display_(/*179.41*/project/*179.48*/.getLocation),format.raw/*179.60*/("""<p>
                                </div>
                            </div>
                        """)))}),format.raw/*182.26*/("""


"""),format.raw/*185.42*/("""
"""),format.raw/*186.50*/("""
"""),format.raw/*187.49*/("""
"""),format.raw/*188.36*/("""
"""),format.raw/*189.154*/("""
"""),format.raw/*190.84*/("""
"""),format.raw/*191.118*/("""
"""),format.raw/*192.45*/("""
"""),format.raw/*193.187*/("""
"""),format.raw/*194.34*/("""
"""),format.raw/*195.36*/("""
"""),format.raw/*196.35*/("""
"""),format.raw/*197.31*/("""


"""),format.raw/*200.100*/("""
"""),format.raw/*201.46*/("""
"""),format.raw/*202.54*/("""
"""),format.raw/*203.58*/("""
"""),format.raw/*204.44*/("""
"""),format.raw/*205.45*/("""
"""),format.raw/*206.60*/("""
"""),format.raw/*207.58*/("""
"""),format.raw/*208.59*/("""
"""),format.raw/*209.46*/("""
"""),format.raw/*210.48*/("""
"""),format.raw/*211.85*/("""
"""),format.raw/*212.49*/("""
"""),format.raw/*213.106*/("""
"""),format.raw/*214.65*/("""
"""),format.raw/*215.80*/("""
"""),format.raw/*216.54*/("""
"""),format.raw/*217.83*/("""
"""),format.raw/*218.120*/("""
"""),format.raw/*219.54*/("""
"""),format.raw/*220.56*/("""
"""),format.raw/*221.75*/("""
"""),format.raw/*222.55*/("""
"""),format.raw/*223.50*/("""
"""),format.raw/*224.42*/("""
"""),format.raw/*225.49*/("""
"""),format.raw/*226.45*/("""
"""),format.raw/*227.39*/("""
"""),format.raw/*228.35*/("""
"""),format.raw/*229.26*/("""
                        """),format.raw/*230.25*/("""<div class="actions row center">
                            <div class="col s12">
                                <a class="btn waves-effect waves-light blue accent-2"
                                href=""""),_display_(/*233.40*/routes/*233.46*/.ProjectController.projectEditPage(project.getId)),format.raw/*233.95*/("""">Edit</a>
                                <a class="btn waves-effect waves-light red accent-2 modal-trigger" title="Delete" href="#warningModal">Delete</a>
                                """),_display_(/*235.34*/if(session.get("id").equalsIgnoreCase(project.getSponsorContact.toString))/*235.108*/ {_display_(Seq[Any](format.raw/*235.110*/("""
                                    """),format.raw/*236.37*/("""<a class="btn waves-effect waves-light indigo lighten-2"
                                    href=""""),_display_(/*237.44*/routes/*237.50*/.ProjectController.addProjectFollowersPage(project.getId)),format.raw/*237.107*/("""">Invite Followers</a>
                                """)))}),format.raw/*238.34*/("""
                                    """),format.raw/*239.37*/("""<!-- Inactive Warning Modal Structure -->
                                <div id="warningModal" class="modal">
                                    <div class="modal-content">
                                        <h5 style="color: red">Warning!</h5>
                                        <p style="font-weight: bold">Do you really want to delete this project: """),_display_(/*243.114*/project/*243.121*/.getTitle),format.raw/*243.130*/(""" """),format.raw/*243.131*/("""?
                                            Please note that after deletion, this project <span style="color: red">
                                            CANNOT</span> be recovered.</p>
                                    </div>
                                    <div class="modal-footer">
                                        <a href="#!" class="modal-close waves-effect waves-green btn-flat">
                                            Cancel</a>
                                        <a href='"""),_display_(/*250.51*/routes/*250.57*/.ProjectController.deleteProject(project.getId)),format.raw/*250.104*/("""'
                                        class="modal-close waves-effect waves-green btn-flat">Confirm</a>
                                    </div>
                                </div>
                                <br>
                                <br>
                                <a class="btn waves-effect waves-light blue darken-2"
                                href=""""),_display_(/*257.40*/routes/*257.46*/.ProjectController.projectList(1, "")),format.raw/*257.83*/("""">Project List</a>

                                <button class='btn waves-effect waves-light green darken-2' style="font-weight: bold; !important;" href='#' onclick="changeView('"""),_display_(/*259.163*/project/*259.170*/.getId()),format.raw/*259.178*/("""')"
                                title="Selecting this option allows you to only view APIs, containers, and Datasets associated with this project.">Set as Project Zone</button>
                            </div>
                        </div>

                    </form>
                </div>
            </div>
        </div>
    </div>
""")))}),format.raw/*269.2*/("""
"""))
      }
    }
  }

  def render(project:Project): play.twirl.api.HtmlFormat.Appendable = apply(project)

  def f:((Project) => play.twirl.api.HtmlFormat.Appendable) = (project) => apply(project)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:34 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/projectDetail.scala.html
                  HASH: 49363764db1e3760faae90129212f005197b7784
                  MATRIX: 814->1|837->18|860->35|1195->59|1291->81|1305->88|1385->92|1416->97|1463->116|1492->117|1533->130|1589->159|1618->160|1654->169|1685->172|1714->173|1755->186|1810->214|1839->215|1875->224|1905->226|1934->227|1975->240|2031->269|2060->270|2092->275|2210->365|2239->366|2280->379|2486->557|2515->558|2556->571|2657->644|2686->645|2947->878|2976->879|3046->921|3075->922|3116->935|3226->1017|3255->1018|3296->1031|3625->1332|3654->1333|3692->1343|3721->1344|3750->1345|3791->1358|3822->1361|3851->1362|3892->1421|3933->1464|3974->1523|4015->1584|4056->1644|4097->1676|4138->1694|4180->1771|4221->1784|4277->1812|4306->1813|4347->1826|4389->1840|4418->1841|4459->1854|4565->1932|4594->1933|4635->1946|4736->2019|4765->2020|4849->2076|4878->2077|4929->2100|4958->2101|4999->2114|5085->2172|5114->2173|5160->2191|5189->2192|5221->2197|5271->77|5301->2208|5330->2211|5370->2242|5410->2244|5442->2249|5482->2262|5497->2268|5558->2308|5652->2375|5667->2381|5730->2423|6008->2674|6024->2681|6054->2690|6083->2691|6137->2718|6175->2747|6215->2749|6268->2774|6446->2925|6462->2932|6492->2941|6615->3033|6664->3055|6738->3120|6778->3122|6831->3147|7090->3378|7107->3385|7142->3398|7272->3497|7322->3520|7392->3581|7432->3583|7485->3608|7742->3837|7759->3844|7792->3855|7922->3954|7952->4047|7982->4093|8012->4147|8042->4198|8072->4241|8103->4363|8133->4451|8163->4497|8193->4536|8223->4571|8253->4597|8284->4689|8314->4735|8344->4789|8374->4848|8404->4925|8434->4984|8464->5075|8494->5114|8524->5149|8554->5175|8584->5253|8615->5359|8645->5416|8675->5457|8705->5483|8736->5537|8766->5583|8796->5637|8826->5698|8857->5856|8887->5895|8917->5930|8947->5956|8979->6097|9009->6143|9039->6198|9069->6263|9099->6326|9129->6369|9160->6473|9190->6512|9220->6547|9250->6573|9281->6671|9311->6717|9341->6771|9371->6828|9402->6945|9432->6984|9462->7019|9492->7045|9523->7142|9553->7188|9583->7242|9613->7302|9644->7423|9674->7462|9704->7497|9734->7523|9789->7550|9866->7617|9907->7619|9965->7648|10244->7898|10262->7905|10299->7919|10442->8030|10497->8057|10568->8118|10609->8120|10667->8149|10862->8316|10879->8323|10913->8335|11048->8438|11080->8482|11110->8532|11140->8581|11170->8617|11201->8771|11231->8855|11262->8973|11292->9018|11323->9205|11353->9239|11383->9275|11413->9310|11443->9341|11476->9443|11506->9489|11536->9543|11566->9601|11596->9645|11626->9690|11656->9750|11686->9808|11716->9867|11746->9913|11776->9961|11806->10046|11836->10095|11867->10201|11897->10266|11927->10346|11957->10400|11987->10483|12018->10603|12048->10657|12078->10713|12108->10788|12138->10843|12168->10893|12198->10935|12228->10984|12258->11029|12288->11068|12318->11103|12348->11129|12402->11154|12638->11362|12654->11368|12725->11417|12943->11607|13028->11681|13070->11683|13136->11720|13264->11820|13280->11826|13360->11883|13448->11939|13514->11976|13909->12342|13927->12349|13959->12358|13990->12359|14531->12872|14547->12878|14617->12925|15034->13314|15050->13320|15109->13357|15320->13539|15338->13546|15369->13554|15744->13898
                  LINES: 31->1|32->2|33->3|38->5|42->8|42->8|44->8|45->9|46->10|46->10|47->11|48->12|48->12|49->13|49->13|49->13|50->14|51->15|51->15|52->16|52->16|52->16|53->17|54->18|54->18|55->19|57->21|57->21|58->22|60->24|60->24|61->25|62->26|62->26|67->31|67->31|69->33|69->33|70->34|71->35|71->35|72->36|76->40|76->40|76->40|76->40|76->40|77->41|77->41|77->41|78->42|79->43|80->44|81->45|82->46|83->47|84->48|86->50|87->51|87->51|87->51|88->52|88->52|88->52|89->53|90->54|90->54|91->55|92->56|92->56|94->58|94->58|94->58|94->58|95->59|96->60|96->60|97->61|97->61|98->62|100->5|103->63|105->65|105->65|105->65|106->66|106->66|106->66|106->66|108->68|108->68|108->68|114->74|114->74|114->74|114->74|115->75|115->75|115->75|116->76|119->79|119->79|119->79|122->82|123->83|123->83|123->83|124->84|127->87|127->87|127->87|130->90|132->92|132->92|132->92|133->93|136->96|136->96|136->96|139->99|140->100|141->101|142->102|143->103|144->104|145->105|146->106|147->107|148->108|149->109|150->110|152->112|153->113|154->114|155->115|156->116|157->117|158->118|159->119|160->120|161->121|162->122|163->123|164->124|165->125|166->126|168->128|169->129|170->130|171->131|172->132|173->133|174->134|175->135|177->137|178->138|179->139|180->140|181->141|182->142|183->143|184->144|185->145|186->146|188->148|189->149|190->150|191->151|192->152|193->153|194->154|195->155|197->157|198->158|199->159|200->160|201->161|202->162|203->163|204->164|206->166|206->166|206->166|207->167|210->170|210->170|210->170|213->173|215->175|215->175|215->175|216->176|219->179|219->179|219->179|222->182|225->185|226->186|227->187|228->188|229->189|230->190|231->191|232->192|233->193|234->194|235->195|236->196|237->197|240->200|241->201|242->202|243->203|244->204|245->205|246->206|247->207|248->208|249->209|250->210|251->211|252->212|253->213|254->214|255->215|256->216|257->217|258->218|259->219|260->220|261->221|262->222|263->223|264->224|265->225|266->226|267->227|268->228|269->229|270->230|273->233|273->233|273->233|275->235|275->235|275->235|276->236|277->237|277->237|277->237|278->238|279->239|283->243|283->243|283->243|283->243|290->250|290->250|290->250|297->257|297->257|297->257|299->259|299->259|299->259|309->269
                  -- GENERATED --
              */
          