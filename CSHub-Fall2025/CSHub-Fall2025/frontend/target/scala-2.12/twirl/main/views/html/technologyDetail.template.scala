
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

object technologyDetail extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[Technology,String,String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(technology: Technology, currentUserId: String, backendPort: String, tableName: String, technologyFileType: String, tableRecorderId: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.142*/("""


"""),_display_(/*8.2*/main("Technology Profile")/*8.28*/ {_display_(Seq[Any](format.raw/*8.30*/("""
"""),format.raw/*9.1*/("""<div class="container">
    <div class="row">
        <div class="col s12">
            <div class="card-panel">

                <h4 class="center">Technology: """),_display_(/*14.49*/technology/*14.59*/.getTechnologyTitle),format.raw/*14.78*/("""</h4>

                <div class="row">
                    <div class="col s4">
                        <div class="center">
                            <img class="circle" id="showImg" src=""""),_display_(/*19.68*/routes/*19.74*/.Assets.at("images/smu.jpeg")),format.raw/*19.103*/("""" width="360" height="360" style="border-width: 1px;
                                border-style: solid;
                                border-radius: 50%;
                                height: auto;
                                width: 70%;">
                        </div>
                    </div>
                    <div class="col s8">
                        <table class="striped responsive-table">
                            <tbody>
                                <tr>
                                    <th style="max-width: 50px">Technology Title</th>
                                    """),_display_(/*31.38*/if(technology.getTechnologyTitle!="null" && technology.getTechnologyTitle != "")/*31.118*/ {_display_(Seq[Any](format.raw/*31.120*/("""
                                        """),format.raw/*32.41*/("""<td style="word-wrap: break-word;">"""),_display_(/*32.77*/technology/*32.87*/.getTechnologyTitle),format.raw/*32.106*/("""</td>
                                    """)))}/*33.39*/else/*33.44*/{_display_(Seq[Any](format.raw/*33.45*/("""
                                        """),format.raw/*34.41*/("""<td>-</td>
                                    """)))}),format.raw/*35.38*/("""
                                """),format.raw/*36.33*/("""</tr>
                                <tr>
                                    <th style="max-width: 50px">Goals</th>
                                    """),_display_(/*39.38*/if(technology.getGoals!="null" && technology.getGoals != "")/*39.98*/ {_display_(Seq[Any](format.raw/*39.100*/("""
                                        """),format.raw/*40.41*/("""<td style="word-wrap: break-word;">"""),_display_(/*40.77*/technology/*40.87*/.getGoals),format.raw/*40.96*/("""</td>
                                    """)))}/*41.39*/else/*41.44*/{_display_(Seq[Any](format.raw/*41.45*/("""
                                        """),format.raw/*42.41*/("""<td>-</td>
                                    """)))}),format.raw/*43.38*/("""
                                """),format.raw/*44.33*/("""</tr>
                                """),_display_(/*45.34*/if(technology.getPdf != null && technology.getPdf != "")/*45.90*/ {_display_(Seq[Any](format.raw/*45.92*/("""
                                    """),format.raw/*46.37*/("""<a href=""""),_display_(/*46.47*/routes/*46.53*/.TechnologyController.downloadTechnologyFile(technology.getId)),format.raw/*46.115*/("""" class="btn waves-effect waves-light blue darken-3">
                                        Download Technology Representative Paper
                                    </a>
                                    <p><br/></p>
                                """)))}),format.raw/*50.34*/("""

                                """),format.raw/*52.33*/("""<tr>
                                    <th style="max-width: 50px">Short Description</th>
                                    """),_display_(/*54.38*/if(technology.getShortDescription!="null" && technology.getShortDescription != "")/*54.120*/ {_display_(Seq[Any](format.raw/*54.122*/("""
                                        """),format.raw/*55.41*/("""<td style="word-wrap: break-word;">"""),_display_(/*55.77*/technology/*55.87*/.getShortDescription),format.raw/*55.107*/("""</td>
                                    """)))}/*56.39*/else/*56.44*/{_display_(Seq[Any](format.raw/*56.45*/("""
                                        """),format.raw/*57.41*/("""<td>-</td>
                                    """)))}),format.raw/*58.38*/("""
                                """),format.raw/*59.33*/("""</tr>
                                <tr>
                                    <th style="max-width: 50px">Long Description</th>
                                    """),_display_(/*62.38*/if(technology.getLongDescription!="null" && technology.getLongDescription != "")/*62.118*/ {_display_(Seq[Any](format.raw/*62.120*/("""
                                        """),format.raw/*63.41*/("""<td style="word-wrap: break-word;">"""),_display_(/*63.77*/technology/*63.87*/.getLongDescription),format.raw/*63.106*/("""</td>
                                    """)))}/*64.39*/else/*64.44*/{_display_(Seq[Any](format.raw/*64.45*/("""
                                        """),format.raw/*65.41*/("""<td>-</td>
                                    """)))}),format.raw/*66.38*/("""
                                """),format.raw/*67.33*/("""</tr>
                                <tr>
                                    <th style="max-width: 50px">Representative Paper URL</th>
                                    """),_display_(/*70.38*/if(technology.getRepresentativePaperURL!="null" && technology.getRepresentativePaperURL != "")/*70.132*/ {_display_(Seq[Any](format.raw/*70.134*/("""
                                        """),format.raw/*71.41*/("""<td style="word-wrap: break-word;">"""),_display_(/*71.77*/technology/*71.87*/.getRepresentativePaperURL),format.raw/*71.113*/("""</td>
                                    """)))}/*72.39*/else/*72.44*/{_display_(Seq[Any](format.raw/*72.45*/("""
                                        """),format.raw/*73.41*/("""<td>-</td>
                                    """)))}),format.raw/*74.38*/("""
                                """),format.raw/*75.33*/("""</tr>
                                <tr>
                                    <th style="max-width: 50px">Keywords</th>
                                    """),_display_(/*78.38*/if(technology.getKeywords!=null && technology.getKeywords != "")/*78.102*/ {_display_(Seq[Any](format.raw/*78.104*/("""
                                        """),format.raw/*79.41*/("""<td style="word-wrap: break-word;">"""),_display_(/*79.77*/technology/*79.87*/.getKeywords),format.raw/*79.99*/("""</td>
                                    """)))}/*80.39*/else/*80.44*/{_display_(Seq[Any](format.raw/*80.45*/("""
                                        """),format.raw/*81.41*/("""<td>-</td>
                                    """)))}),format.raw/*82.38*/("""
                                """),format.raw/*83.33*/("""</tr>
                                <tr>
                                    <th style="max-width: 50px">Fields</th>
                                    """),_display_(/*86.38*/if(technology.getFields!="null" && technology.getFields != "")/*86.100*/ {_display_(Seq[Any](format.raw/*86.102*/("""
                                        """),format.raw/*87.41*/("""<td style="word-wrap: break-word;">"""),_display_(/*87.77*/technology/*87.87*/.getFields),format.raw/*87.97*/("""</td>
                                    """)))}/*88.39*/else/*88.44*/{_display_(Seq[Any](format.raw/*88.45*/("""
                                        """),format.raw/*89.41*/("""<td>-</td>
                                    """)))}),format.raw/*90.38*/("""
                                """),format.raw/*91.33*/("""</tr>
                                <tr>
                                    <th style="max-width: 50px">PI Name</th>
                                    """),_display_(/*94.38*/if(technology.getPIName != "null" && technology.getPIName != "")/*94.102*/ {_display_(Seq[Any](format.raw/*94.104*/("""
                                        """),format.raw/*95.41*/("""<td style="word-wrap: break-word;">"""),_display_(/*95.77*/technology/*95.87*/.getPIName),format.raw/*95.97*/("""</td>
                                    """)))}/*96.39*/else/*96.44*/{_display_(Seq[Any](format.raw/*96.45*/("""
                                        """),format.raw/*97.41*/("""<td>-</td>
                                    """)))}),format.raw/*98.38*/("""
                                """),format.raw/*99.33*/("""</tr>
                                <tr>
                                    <th style="max-width: 50px">Team Members</th>
                                    """),_display_(/*102.38*/if(technology.getTeamMembers!="null" && technology.getTeamMembers != "")/*102.110*/ {_display_(Seq[Any](format.raw/*102.112*/("""
                                        """),format.raw/*103.41*/("""<td style="word-wrap: break-word;">"""),_display_(/*103.77*/technology/*103.87*/.getTeamMembers),format.raw/*103.102*/("""</td>
                                    """)))}/*104.39*/else/*104.44*/{_display_(Seq[Any](format.raw/*104.45*/("""
                                        """),format.raw/*105.41*/("""<td>-</td>
                                    """)))}),format.raw/*106.38*/("""
                                """),format.raw/*107.33*/("""</tr>
                                <tr>
                                    <th style="max-width: 50px">Job Publisher</th>
                                    """),_display_(/*110.38*/if(technology.getTechnologyPublisher!="null" && technology.getTechnologyPublisher != "")/*110.126*/ {_display_(Seq[Any](format.raw/*110.128*/("""
                                        """),format.raw/*111.41*/("""<td style="word-wrap: break-word;">"""),_display_(/*111.77*/technology/*111.87*/.getTechnologyPublisher.getUserName),format.raw/*111.122*/("""</td>
                                    """)))}/*112.39*/else/*112.44*/{_display_(Seq[Any](format.raw/*112.45*/("""
                                        """),format.raw/*113.41*/("""<td>-</td>
                                    """)))}),format.raw/*114.38*/("""
                                """),format.raw/*115.33*/("""</tr>
                            </tbody>
                        </table>
                    </div>
                </div>
                <div class="row center">


                    """),_display_(/*123.22*/if(currentUserId == "109" || technology.getTechnologyPublisher().getId().equals(Long.valueOf(currentUserId)))/*123.131*/ {_display_(Seq[Any](format.raw/*123.133*/("""
                        """),format.raw/*124.25*/("""<a href=""""),_display_(/*124.35*/routes/*124.41*/.TechnologyController.technologyEditPage(technology.getId)),format.raw/*124.99*/("""" class="btn waves-effect waves-light blue darken-2">
                            Edit Technology Info</a>
                    """)))}),format.raw/*126.22*/("""

                    """),format.raw/*128.21*/("""<a href=""""),_display_(/*128.31*/routes/*128.37*/.TechnologyController.technologyList(1, "id")),format.raw/*128.82*/("""" class="btn waves-effect waves-light blue darken-2">
                        Back to Technology List</a>

                </div>
            </div>
        </div>
    </div>
</div>

    """)))}))
      }
    }
  }

  def render(technology:Technology,currentUserId:String,backendPort:String,tableName:String,technologyFileType:String,tableRecorderId:String): play.twirl.api.HtmlFormat.Appendable = apply(technology,currentUserId,backendPort,tableName,technologyFileType,tableRecorderId)

  def f:((Technology,String,String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (technology,currentUserId,backendPort,tableName,technologyFileType,tableRecorderId) => apply(technology,currentUserId,backendPort,tableName,technologyFileType,tableRecorderId)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:39 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/technologyDetail.scala.html
                  HASH: 2d3adde98bf8aa011b8450414157b0059a6c91b3
                  MATRIX: 814->1|837->18|860->35|1239->62|1475->202|1504->206|1538->232|1577->234|1604->235|1793->397|1812->407|1852->426|2073->620|2088->626|2139->655|2776->1265|2866->1345|2907->1347|2976->1388|3039->1424|3058->1434|3099->1453|3161->1497|3174->1502|3213->1503|3282->1544|3361->1592|3422->1625|3604->1780|3673->1840|3714->1842|3783->1883|3846->1919|3865->1929|3895->1938|3957->1982|3970->1987|4009->1988|4078->2029|4157->2077|4218->2110|4284->2149|4349->2205|4389->2207|4454->2244|4491->2254|4506->2260|4590->2322|4879->2580|4941->2614|5097->2743|5189->2825|5230->2827|5299->2868|5362->2904|5381->2914|5423->2934|5485->2978|5498->2983|5537->2984|5606->3025|5685->3073|5746->3106|5939->3272|6029->3352|6070->3354|6139->3395|6202->3431|6221->3441|6262->3460|6324->3504|6337->3509|6376->3510|6445->3551|6524->3599|6585->3632|6786->3806|6890->3900|6931->3902|7000->3943|7063->3979|7082->3989|7130->4015|7192->4059|7205->4064|7244->4065|7313->4106|7392->4154|7453->4187|7638->4345|7712->4409|7753->4411|7822->4452|7885->4488|7904->4498|7937->4510|7999->4554|8012->4559|8051->4560|8120->4601|8199->4649|8260->4682|8443->4838|8515->4900|8556->4902|8625->4943|8688->4979|8707->4989|8738->4999|8800->5043|8813->5048|8852->5049|8921->5090|9000->5138|9061->5171|9245->5328|9319->5392|9360->5394|9429->5435|9492->5471|9511->5481|9542->5491|9604->5535|9617->5540|9656->5541|9725->5582|9804->5630|9865->5663|10055->5825|10138->5897|10180->5899|10250->5940|10314->5976|10334->5986|10372->6001|10435->6045|10449->6050|10489->6051|10559->6092|10639->6140|10701->6173|10892->6336|10991->6424|11033->6426|11103->6467|11167->6503|11187->6513|11245->6548|11308->6592|11322->6597|11362->6598|11432->6639|11512->6687|11574->6720|11792->6910|11912->7019|11954->7021|12008->7046|12046->7056|12062->7062|12142->7120|12302->7248|12353->7270|12391->7280|12407->7286|12474->7331
                  LINES: 31->1|32->2|33->3|38->5|43->5|46->8|46->8|46->8|47->9|52->14|52->14|52->14|57->19|57->19|57->19|69->31|69->31|69->31|70->32|70->32|70->32|70->32|71->33|71->33|71->33|72->34|73->35|74->36|77->39|77->39|77->39|78->40|78->40|78->40|78->40|79->41|79->41|79->41|80->42|81->43|82->44|83->45|83->45|83->45|84->46|84->46|84->46|84->46|88->50|90->52|92->54|92->54|92->54|93->55|93->55|93->55|93->55|94->56|94->56|94->56|95->57|96->58|97->59|100->62|100->62|100->62|101->63|101->63|101->63|101->63|102->64|102->64|102->64|103->65|104->66|105->67|108->70|108->70|108->70|109->71|109->71|109->71|109->71|110->72|110->72|110->72|111->73|112->74|113->75|116->78|116->78|116->78|117->79|117->79|117->79|117->79|118->80|118->80|118->80|119->81|120->82|121->83|124->86|124->86|124->86|125->87|125->87|125->87|125->87|126->88|126->88|126->88|127->89|128->90|129->91|132->94|132->94|132->94|133->95|133->95|133->95|133->95|134->96|134->96|134->96|135->97|136->98|137->99|140->102|140->102|140->102|141->103|141->103|141->103|141->103|142->104|142->104|142->104|143->105|144->106|145->107|148->110|148->110|148->110|149->111|149->111|149->111|149->111|150->112|150->112|150->112|151->113|152->114|153->115|161->123|161->123|161->123|162->124|162->124|162->124|162->124|164->126|166->128|166->128|166->128|166->128
                  -- GENERATED --
              */
          