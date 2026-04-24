
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

object paperDetail extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Paper,Paper,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(paper: Paper, parentPaper: Paper):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*8.6*/scripts/*8.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*8.17*/("""
        """),format.raw/*9.9*/("""<style>
                tr """),format.raw/*10.20*/("""{"""),format.raw/*10.21*/("""
                    """),format.raw/*11.21*/("""border-bottom: none;
                """),format.raw/*12.17*/("""}"""),format.raw/*12.18*/("""

                """),format.raw/*14.17*/("""td """),format.raw/*14.20*/("""{"""),format.raw/*14.21*/("""
                    """),format.raw/*15.21*/("""text-align: center;
                """),format.raw/*16.17*/("""}"""),format.raw/*16.18*/("""

                """),format.raw/*18.17*/("""p """),format.raw/*18.19*/("""{"""),format.raw/*18.20*/("""
                    """),format.raw/*19.21*/("""margin-bottom: 5px;
                """),format.raw/*20.17*/("""}"""),format.raw/*20.18*/("""
        """),format.raw/*21.9*/("""</style>
        <script type="text/javascript">
                $(document).ready(function () """),format.raw/*23.47*/("""{"""),format.raw/*23.48*/("""
                    """),format.raw/*24.21*/("""// var doc = document.getElementById('description').contentWindow.document;
                    // doc.open();
                    var quill = new Quill('#quill-container', """),format.raw/*26.63*/("""{"""),format.raw/*26.64*/("""
                        """),format.raw/*27.25*/("""scrollingContainer: '#scrolling-container'
                    """),format.raw/*28.21*/("""}"""),format.raw/*28.22*/(""");

                    quill.clipboard.dangerouslyPasteHTML(entityToString());
                    quill.enable(false);
                    document.body.scrollTop = document.documentElement.scrollTop = 0;
                """),format.raw/*33.17*/("""}"""),format.raw/*33.18*/(""");

                function reinitIframe() """),format.raw/*35.41*/("""{"""),format.raw/*35.42*/("""
                    """),format.raw/*36.21*/("""var iframe = document.getElementById("description");
                    try """),format.raw/*37.25*/("""{"""),format.raw/*37.26*/("""
                        """),format.raw/*38.25*/("""var bHeight = iframe.contentWindow.document.body.scrollHeight;
                        var dHeight = iframe.contentWindow.document.documentElement.scrollHeight;
                        var height = Math.max(bHeight, dHeight);
                        iframe.height = height;
                    """),format.raw/*42.21*/("""}"""),format.raw/*42.22*/(""" """),format.raw/*42.23*/("""catch (ex) """),format.raw/*42.34*/("""{"""),format.raw/*42.35*/("""
                    """),format.raw/*43.21*/("""}"""),format.raw/*43.22*/("""
                """),format.raw/*44.17*/("""}"""),format.raw/*44.18*/("""

                """),format.raw/*46.17*/("""window.setInterval("reinitIframe()", 200);


        </script>

    """)))};
Seq[Any](format.raw/*5.36*/("""


    """),format.raw/*51.6*/("""

    """),_display_(/*53.6*/main("Paper Detail", scripts)/*53.35*/ {_display_(Seq[Any](format.raw/*53.37*/("""
"""),format.raw/*54.73*/("""
"""),format.raw/*55.32*/("""
"""),format.raw/*56.101*/("""
"""),format.raw/*57.103*/("""
"""),format.raw/*58.20*/("""
"""),format.raw/*59.25*/("""
"""),format.raw/*60.47*/("""
"""),format.raw/*61.22*/("""

"""),format.raw/*63.25*/("""
"""),format.raw/*64.47*/("""
"""),format.raw/*65.42*/("""
"""),format.raw/*66.22*/("""

"""),format.raw/*68.34*/("""
"""),format.raw/*69.53*/("""
"""),format.raw/*70.69*/("""
"""),format.raw/*71.22*/("""

"""),format.raw/*73.43*/("""
"""),format.raw/*74.39*/("""
"""),format.raw/*75.22*/("""

"""),format.raw/*77.40*/("""
"""),format.raw/*78.39*/("""
"""),format.raw/*79.22*/("""

"""),format.raw/*81.47*/("""
"""),format.raw/*82.40*/("""
"""),format.raw/*83.22*/("""

"""),format.raw/*85.39*/("""
"""),format.raw/*86.39*/("""
"""),format.raw/*87.22*/("""

"""),format.raw/*89.33*/("""
"""),format.raw/*90.40*/("""
"""),format.raw/*91.22*/("""

"""),format.raw/*93.32*/("""
"""),format.raw/*94.49*/("""
"""),format.raw/*95.40*/("""
"""),format.raw/*96.22*/("""

"""),format.raw/*98.34*/("""
"""),format.raw/*99.50*/("""
"""),format.raw/*100.22*/("""

"""),format.raw/*102.25*/("""
"""),format.raw/*103.49*/("""
"""),format.raw/*104.22*/("""

"""),format.raw/*106.34*/("""
"""),format.raw/*107.44*/("""
"""),format.raw/*108.48*/("""
"""),format.raw/*109.22*/("""
"""),format.raw/*110.21*/("""
        """),format.raw/*111.9*/("""<div class="container">
            <div class="center">
                <div class="row">
                    <div class="col s12">
                        <div class="card-panel center">
                            <h4 class="center">"""),_display_(/*116.49*/paper/*116.54*/.getTitle),format.raw/*116.63*/("""</h4>
                            <div class="row">
                                <div class="col s3 ">
                                    <div class="center">
                                        <img width="360" height="350" style="height: auto;
                                            width: 80%;" class="card-panel responsive-img" id="dataset-image" src='"""),_display_(/*121.117*/routes/*121.123*/.Assets.at("images/docker.png")),format.raw/*121.154*/("""'></img>
                                        <div class="rating_self clearfix" typeof="v:Rating">
                                            <div class="rating_right">
                                                <strong class="ll rating_num">0.0</strong>
                                                <div id="hearts" class="starrs"></div>
                                                You gave a rating of <span id="count">0</span> star(s)
                                                <div class="rating_sum">
                                                    <span class="rating_sum">0</span> user(s) rated
                                                </div>

                                            </div>
                                        </div>
                                        <br>
                                    </div>
                                    <div class="center">


                                        <br>
                                        <a class="btn waves-effect waves-light blue darken-2 modal-trigger" >
                                            Add User Tags</a>

                                            <!-- Modal Structure -->
                                        <div id="modal" class="modal center">
                                            <div class="center modal-content">
                                                <h5>Add tags for dataset:  </h5>
                                                <lable class="left">Tags should be seperated by ","</lable>
                                                <input type="text" name="tags" class="form-control" placeholder="">
                                            </div>
                                            <div class="modal-fixed-footer">
                                                <a href="#!" class="modal-close btn waves-effect waves-light blue darken-2" >
                                                    Add Tags</a>
                                            </div>
                                            <br>
                                        </div>
                                    </div>
                                    <div class="row col s11" id="citation">
                                        <p class="center" style="color: red;
                                            font-weight: bold">Recommended Citation to This Dataset*:</p>
                                        <p>
                                            . Provided by:   - Accessed via:
                                            https://opennex.org/dataset/datasetDetail/ on <script> document.write(new Date().toLocaleDateString()); </script>
                                            .
                                        </p>
                                        <p ><i>
                                            * When users make use of a dataset, they should cite both the dataset and the scientific publication, if available. Such a practice gives credit to the dataset providers and advances principles of transparency and reproducibility. </i></p>
                                        """),format.raw/*166.109*/("""
                                    """),format.raw/*167.37*/("""</div>
                                </div>
                                <div class="col s9" >
                                    <table class="striped responsive-table" style="margin-top: 10px;
                                        margin-bottom: 10px;">
                                        <tbody>
                                            <tr>
                                                <th>Title</th>
                                                <td style="word-wrap: break-word;
                                                    text-align: left;">"""),_display_(/*176.73*/paper/*176.78*/.getTitle),format.raw/*176.87*/("""</td>
                                            </tr>
                                            <tr>
                                                <th>Publication Channel</th>
                                                <td style="word-wrap: break-word;
                                                    text-align: left;">"""),_display_(/*181.73*/paper/*181.78*/.getPublicationChannel),format.raw/*181.100*/("""</td>
                                            </tr>
                                            <tr>
                                                <th>Date</th>
                                                <td style="word-wrap: break-word;
                                                    text-align: left;">"""),_display_(/*186.73*/paper/*186.78*/.getYear),format.raw/*186.86*/("""</td>
                                            </tr>


                                            <tr>
                                                <th>Pages</th>
                                                <td style="word-wrap: break-word;
                                                    text-align: left;">"""),_display_(/*193.73*/paper/*193.78*/.getPages),format.raw/*193.87*/("""</td>
                                            </tr>
                                            <tr>
                                                <th>Book Title</th>
                                                <td style="word-wrap: break-word;
                                                    text-align: left;">
                                                """),_display_(/*199.50*/paper/*199.55*/.getBookTitle),format.raw/*199.68*/(""" """),format.raw/*199.69*/("""</td>
                                            </tr>
                                            <tr>
                                                <th>Url</th>
                                                <td style="word-wrap: break-word;
                                                    text-align: left;">
                                                """),_display_(/*205.50*/paper/*205.55*/.getUrl),format.raw/*205.62*/(""" """),format.raw/*205.63*/("""</td>
                                            </tr>
                                            <tr>
                                                <th>Authors</th>
                                                <td style="word-wrap: break-word">"""),_display_(/*209.84*/if(paper.getAuthors != null && paper.getAuthors.size() != 0)/*209.144*/ {_display_(Seq[Any](format.raw/*209.146*/("""
                                                    """),format.raw/*210.53*/("""<div class="row">
                                                        <div class="col s12">

                                                            <table>
                                                                <tr>
                                                                    <td style="width: 40px;
                                                                        text-align: left;">Avatar</td>
                                                                    <td style="width: 40px;
                                                                        text-align: left;">Name</td>
                                                                    <td style="width: 40px;
                                                                        text-align: left;">Email</td>
                                                                </tr>
                                                                <tbody>
                                                                """),_display_(/*223.66*/for(teamMember <- paper.getAuthors) yield /*223.101*/ {_display_(Seq[Any](format.raw/*223.103*/("""
                                                                    """),format.raw/*224.69*/("""<tr>
                                                                        <td style="width: 40px;
                                                                            text-align: left;"><img src=""""),_display_(/*226.107*/teamMember/*226.117*/.getAvatar),format.raw/*226.127*/("""" style="height: 35px;
                                                                            width: 35px;
                                                                            border-radius: 50%;"></img>
                                                                        </td>
                                                                        <td style = "width:40px;text-align:left;" > """),_display_(/*230.118*/teamMember/*230.128*/.getAuthorName()),format.raw/*230.144*/("""
                                                                        """),format.raw/*231.73*/("""</td>
                                                                        <td style="width: 40px;
                                                                            text-align: left;">"""),_display_(/*233.97*/if(teamMember.getEmail() == null || teamMember.getEmail() == "")/*233.161*/ {_display_(Seq[Any](format.raw/*233.163*/("""
                                                                            """),format.raw/*234.77*/("""-
                                                                        """)))}/*235.75*/else/*235.80*/{_display_(Seq[Any](format.raw/*235.81*/("""
                                                                            """),_display_(/*236.78*/teamMember/*236.88*/.getEmail()),format.raw/*236.99*/("""
                                                                        """)))}),format.raw/*237.74*/("""</td>
                                                                    </tr>
                                                                """)))}),format.raw/*239.66*/("""
                                                                """),format.raw/*240.65*/("""</tbody>
                                                            </table>
                                                        </div>
                                                    </div>
                                                """)))}),format.raw/*244.50*/("""</td>
                                            </tr>
                                            <tr>
                                                <th>Abstract</th>
                                                <td style="word-wrap: break-word;
                                                    text-align: left;">
                                                """),_display_(/*250.50*/paper/*250.55*/.getAbstractText),format.raw/*250.71*/(""" """),format.raw/*250.72*/("""</td>
                                            </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                            <div class="row center">
                                <a href=""""),_display_(/*257.43*/routes/*257.49*/.PaperController.paperList(1, "")),format.raw/*257.82*/("""" class="btn waves-effect waves-light blue darken-2">
                                    Back to Paper List</a>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
        </div>

    """)))}),format.raw/*267.6*/("""
"""))
      }
    }
  }

  def render(paper:Paper,parentPaper:Paper): play.twirl.api.HtmlFormat.Appendable = apply(paper,parentPaper)

  def f:((Paper,Paper) => play.twirl.api.HtmlFormat.Appendable) = (paper,parentPaper) => apply(paper,parentPaper)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:33 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/paperDetail.scala.html
                  HASH: 4ea1766a2cb37208cf16cde13747eefbe857edf6
                  MATRIX: 814->1|837->18|860->35|1197->59|1309->101|1324->108|1404->112|1439->121|1494->148|1523->149|1572->170|1637->207|1666->208|1712->226|1743->229|1772->230|1821->251|1885->287|1914->288|1960->306|1990->308|2019->309|2068->330|2132->366|2161->367|2197->376|2320->471|2349->472|2398->493|2599->666|2628->667|2681->692|2772->755|2801->756|3052->979|3081->980|3153->1024|3182->1025|3231->1046|3336->1123|3365->1124|3418->1149|3740->1443|3769->1444|3798->1445|3837->1456|3866->1457|3915->1478|3944->1479|3989->1496|4018->1497|4064->1515|4172->93|4206->1584|4239->1591|4277->1620|4317->1622|4346->1695|4375->1727|4405->1828|4435->1931|4464->1951|4493->1976|4522->2023|4551->2045|4581->2071|4610->2118|4639->2160|4668->2182|4698->2217|4727->2270|4756->2339|4785->2361|4815->2405|4844->2444|4873->2466|4903->2507|4932->2546|4961->2568|4991->2616|5020->2656|5049->2678|5079->2718|5108->2757|5137->2779|5167->2813|5196->2853|5225->2875|5255->2908|5284->2957|5313->2997|5342->3019|5372->3054|5401->3104|5431->3126|5462->3152|5492->3201|5522->3223|5553->3258|5583->3302|5613->3350|5643->3372|5673->3393|5710->3402|5975->3639|5990->3644|6021->3653|6420->4023|6437->4029|6491->4060|9708->7315|9774->7352|10380->7930|10395->7935|10426->7944|10790->8280|10805->8285|10850->8307|11199->8628|11214->8633|11244->8641|11596->8965|11611->8970|11642->8979|12046->9355|12061->9360|12096->9373|12126->9374|12523->9743|12538->9748|12567->9755|12597->9756|12878->10009|12949->10069|12991->10071|13073->10124|14124->11147|14177->11182|14219->11184|14317->11253|14553->11460|14574->11470|14607->11480|15047->11891|15068->11901|15107->11917|15209->11990|15435->12188|15510->12252|15552->12254|15658->12331|15753->12407|15767->12412|15807->12413|15913->12491|15933->12501|15966->12512|16072->12586|16249->12731|16343->12796|16624->13045|17026->13419|17041->13424|17079->13440|17109->13441|17456->13760|17472->13766|17527->13799|17828->14069
                  LINES: 31->1|32->2|33->3|38->5|42->8|42->8|44->8|45->9|46->10|46->10|47->11|48->12|48->12|50->14|50->14|50->14|51->15|52->16|52->16|54->18|54->18|54->18|55->19|56->20|56->20|57->21|59->23|59->23|60->24|62->26|62->26|63->27|64->28|64->28|69->33|69->33|71->35|71->35|72->36|73->37|73->37|74->38|78->42|78->42|78->42|78->42|78->42|79->43|79->43|80->44|80->44|82->46|88->5|91->51|93->53|93->53|93->53|94->54|95->55|96->56|97->57|98->58|99->59|100->60|101->61|103->63|104->64|105->65|106->66|108->68|109->69|110->70|111->71|113->73|114->74|115->75|117->77|118->78|119->79|121->81|122->82|123->83|125->85|126->86|127->87|129->89|130->90|131->91|133->93|134->94|135->95|136->96|138->98|139->99|140->100|142->102|143->103|144->104|146->106|147->107|148->108|149->109|150->110|151->111|156->116|156->116|156->116|161->121|161->121|161->121|206->166|207->167|216->176|216->176|216->176|221->181|221->181|221->181|226->186|226->186|226->186|233->193|233->193|233->193|239->199|239->199|239->199|239->199|245->205|245->205|245->205|245->205|249->209|249->209|249->209|250->210|263->223|263->223|263->223|264->224|266->226|266->226|266->226|270->230|270->230|270->230|271->231|273->233|273->233|273->233|274->234|275->235|275->235|275->235|276->236|276->236|276->236|277->237|279->239|280->240|284->244|290->250|290->250|290->250|290->250|297->257|297->257|297->257|307->267
                  -- GENERATED --
              */
          