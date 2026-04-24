
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

object registerConfirmation extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Long,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(newId: Long, registeredType: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import models._
/*4.2*/import models.Project
/*5.2*/import models.Challenge


Seq[Any](format.raw/*1.39*/("""

"""),format.raw/*6.1*/("""
"""),format.raw/*7.182*/("""
"""),_display_(/*8.2*/main("General registerPage confirmation page")/*8.48*/ {_display_(Seq[Any](format.raw/*8.50*/("""
    """),format.raw/*9.5*/("""<div class="container">
        <div class="center">
            <div class="col s12 m10 offset-m1">
                <div class="card-panel">
                    <h4>Congratulations!</h4>

                    """),_display_(/*15.22*/if(registeredType=="Project")/*15.51*/ {_display_(Seq[Any](format.raw/*15.53*/("""
                        """),format.raw/*16.25*/("""<h5>Your project has been successfully registered onto SMU-Hub.</h5>
                        <h6>Your project ID is """),_display_(/*17.49*/newId),format.raw/*17.54*/("""</h6>
                    """)))}),format.raw/*18.22*/("""
                    """),_display_(/*19.22*/if(registeredType=="User")/*19.48*/{_display_(Seq[Any](format.raw/*19.49*/("""
                        """),format.raw/*20.25*/("""<h5>Your user account has been successfully created onto SMU-Hub.</h5>
                        <h6>Your user ID is """),_display_(/*21.46*/newId),format.raw/*21.51*/("""</h6>
                    """)))}),format.raw/*22.22*/("""
                    """),_display_(/*23.22*/if(registeredType=="Challenge")/*23.53*/{_display_(Seq[Any](format.raw/*23.54*/("""
                        """),format.raw/*24.25*/("""<h5>Your challenge has been successfully registered onto SMU-Hub.</h5>
                        <h6>Your challenge ID is """),_display_(/*25.51*/newId),format.raw/*25.56*/("""</h6>
                    """)))}),format.raw/*26.22*/("""
                    """),_display_(/*27.22*/if(registeredType=="Reviewer")/*27.52*/{_display_(Seq[Any](format.raw/*27.53*/("""
                        """),format.raw/*28.25*/("""<h5>Your Reviewer has been successfully registered onto SMU-Hub.</h5>
                        <h6>Your Reviewer ID is """),_display_(/*29.50*/newId),format.raw/*29.55*/("""</h6>
                    """)))}),format.raw/*30.22*/("""
                    """),_display_(/*31.22*/if(registeredType=="Job")/*31.47*/{_display_(Seq[Any](format.raw/*31.48*/("""
                        """),format.raw/*32.25*/("""<h5>Your Job has been successfully registered onto SMU-Hub.</h5>
                        <h6>Your Job ID is """),_display_(/*33.45*/newId),format.raw/*33.50*/("""</h6>
                    """)))}),format.raw/*34.22*/("""
                    """),_display_(/*35.22*/if(registeredType=="Rajob")/*35.49*/{_display_(Seq[Any](format.raw/*35.50*/("""
                        """),format.raw/*36.25*/("""<h5>Your RA Job has been successfully registered onto SMU-Hub.</h5>
                        <h6>Your RA Job ID is """),_display_(/*37.48*/newId),format.raw/*37.53*/("""</h6>
                    """)))}),format.raw/*38.22*/("""
                    """),_display_(/*39.22*/if(registeredType=="Tajob")/*39.49*/{_display_(Seq[Any](format.raw/*39.50*/("""
                        """),format.raw/*40.25*/("""<h5>Your TA Job has been successfully registered onto SMU-Hub.</h5>
                        <h6>Your TA Job ID is """),_display_(/*41.48*/newId),format.raw/*41.53*/("""</h6>
                    """)))}),format.raw/*42.22*/("""
                    """),_display_(/*43.22*/if(registeredType=="Tacandidate")/*43.55*/{_display_(Seq[Any](format.raw/*43.56*/("""
                        """),format.raw/*44.25*/("""<h5>Your TA application has been successfully registered onto SMU-Hub.</h5>
                        <h6>Your candidate ID is """),_display_(/*45.51*/newId),format.raw/*45.56*/("""</h6>
                    """)))}),format.raw/*46.22*/("""
                    """),_display_(/*47.22*/if(registeredType=="CourseTAAssignment")/*47.62*/{_display_(Seq[Any](format.raw/*47.63*/("""
                        """),format.raw/*48.25*/("""<h5>An hiring email has been sent to Monique, we are working on the hiring process now.</h5>
                    """)))}),format.raw/*49.22*/("""

                    """),_display_(/*51.22*/if(registeredType=="Organization")/*51.56*/{_display_(Seq[Any](format.raw/*51.57*/("""
                        """),format.raw/*52.25*/("""<h5>Your organization has been successfully created onto SMU-Hub.</h5>
                        <h6>Your organization ID is """),_display_(/*53.54*/newId),format.raw/*53.59*/("""</h6>
                    """)))}),format.raw/*54.22*/("""

                    """),_display_(/*56.22*/if(registeredType=="Technology")/*56.54*/{_display_(Seq[Any](format.raw/*56.55*/("""
                        """),format.raw/*57.25*/("""<h5>Your technology has been successfully created onto SMU-Hub.</h5>
                        <h6>Your technology ID is """),_display_(/*58.52*/newId),format.raw/*58.57*/("""</h6>
                    """)))}),format.raw/*59.22*/("""

                    """),format.raw/*61.21*/("""<br>
                    <br>
                    <span id="show"></span>
                </div>
            </div>
        </div>
    </div>

    <script type="text/javascript">
            var t = 5;
            var timer = setInterval(refer, 1000);
            function refer() """),format.raw/*72.30*/("""{"""),format.raw/*72.31*/("""
                """),format.raw/*73.17*/("""if (t <= 0) """),format.raw/*73.29*/("""{"""),format.raw/*73.30*/("""
                    """),format.raw/*74.21*/("""clearInterval(timer);
                    if('"""),_display_(/*75.26*/registeredType),format.raw/*75.40*/("""' =="Project")"""),format.raw/*75.54*/("""{"""),format.raw/*75.55*/("""
                        """),format.raw/*76.25*/("""location='"""),_display_(/*76.36*/routes/*76.42*/.ProjectController.projectList(1)),format.raw/*76.75*/("""';
                    """),format.raw/*77.21*/("""}"""),format.raw/*77.22*/("""else if('"""),_display_(/*77.32*/registeredType),format.raw/*77.46*/("""' =="User")"""),format.raw/*77.57*/("""{"""),format.raw/*77.58*/("""
                        """),format.raw/*78.25*/("""location='"""),_display_(/*78.36*/routes/*78.42*/.Application.home()),format.raw/*78.61*/("""';
                    """),format.raw/*79.21*/("""}"""),format.raw/*79.22*/("""else if('"""),_display_(/*79.32*/registeredType),format.raw/*79.46*/("""' == "Reviewer")"""),format.raw/*79.62*/("""{"""),format.raw/*79.63*/("""
                        """),format.raw/*80.25*/("""location='"""),_display_(/*80.36*/routes/*80.42*/.ReviewerController.reviewerList(1,"id")),format.raw/*80.82*/("""';
                    """),format.raw/*81.21*/("""}"""),format.raw/*81.22*/("""else if('"""),_display_(/*81.32*/registeredType),format.raw/*81.46*/("""' == "Challenge")"""),format.raw/*81.63*/("""{"""),format.raw/*81.64*/("""
                        """),format.raw/*82.25*/("""location='"""),_display_(/*82.36*/routes/*82.42*/.ChallengeController.challengeList(1,"")),format.raw/*82.82*/("""';
                    """),format.raw/*83.21*/("""}"""),format.raw/*83.22*/("""else if('"""),_display_(/*83.32*/registeredType),format.raw/*83.46*/("""' == "Job")"""),format.raw/*83.57*/("""{"""),format.raw/*83.58*/("""
                        """),format.raw/*84.25*/("""location='"""),_display_(/*84.36*/routes/*84.42*/.JobController.jobList(1, "")),format.raw/*84.71*/("""';
                    """),format.raw/*85.21*/("""}"""),format.raw/*85.22*/("""else if('"""),_display_(/*85.32*/registeredType),format.raw/*85.46*/("""' == "Tajob")"""),format.raw/*85.59*/("""{"""),format.raw/*85.60*/("""
                        """),format.raw/*86.25*/("""location='"""),_display_(/*86.36*/routes/*86.42*/.TAJobController.tajobList(1,"")),format.raw/*86.74*/("""';
                    """),format.raw/*87.21*/("""}"""),format.raw/*87.22*/("""else if('"""),_display_(/*87.32*/registeredType),format.raw/*87.46*/("""' == "Rajob")"""),format.raw/*87.59*/("""{"""),format.raw/*87.60*/("""
                        """),format.raw/*88.25*/("""location='"""),_display_(/*88.36*/routes/*88.42*/.RAJobController.rajobList(1,"")),format.raw/*88.74*/("""';
                    """),format.raw/*89.21*/("""}"""),format.raw/*89.22*/("""else if('"""),_display_(/*89.32*/registeredType),format.raw/*89.46*/("""' == "Organization")"""),format.raw/*89.66*/("""{"""),format.raw/*89.67*/("""
                        """),format.raw/*90.25*/("""location='"""),_display_(/*90.36*/routes/*90.42*/.Application.home()),format.raw/*90.61*/("""';
                    """),format.raw/*91.21*/("""}"""),format.raw/*91.22*/("""else if('"""),_display_(/*91.32*/registeredType),format.raw/*91.46*/("""' == "Technology")"""),format.raw/*91.64*/("""{"""),format.raw/*91.65*/("""
                        """),format.raw/*92.25*/("""location='"""),_display_(/*92.36*/routes/*92.42*/.Application.home()),format.raw/*92.61*/("""';
                    """),format.raw/*93.21*/("""}"""),format.raw/*93.22*/("""
                """),format.raw/*94.17*/("""}"""),format.raw/*94.18*/("""

                """),format.raw/*96.17*/("""if('"""),_display_(/*96.22*/registeredType),format.raw/*96.36*/("""' =="Project")"""),format.raw/*96.50*/("""{"""),format.raw/*96.51*/("""
                    """),format.raw/*97.21*/("""document.getElementById('show').innerHTML="The page will be redirected to the project list page in "
                            +""+t+" seconds";
                """),format.raw/*99.17*/("""}"""),format.raw/*99.18*/("""else if('"""),_display_(/*99.28*/registeredType),format.raw/*99.42*/("""' =="User")"""),format.raw/*99.53*/("""{"""),format.raw/*99.54*/("""
                    """),format.raw/*100.21*/("""document.getElementById('show').innerHTML="The page will be redirected to the user login page in "
                            +""+t+" seconds";
                """),format.raw/*102.17*/("""}"""),format.raw/*102.18*/(""" """),format.raw/*102.19*/("""else if('"""),_display_(/*102.29*/registeredType),format.raw/*102.43*/("""' =="Reviewer")"""),format.raw/*102.58*/("""{"""),format.raw/*102.59*/("""
                    """),format.raw/*103.21*/("""document.getElementById('show').innerHTML="The page will be redirected to the reviewer list page in "
                            +""+t+" seconds";
                """),format.raw/*105.17*/("""}"""),format.raw/*105.18*/("""else if('"""),_display_(/*105.28*/registeredType),format.raw/*105.42*/("""' =="Challenge")"""),format.raw/*105.58*/("""{"""),format.raw/*105.59*/("""
                    """),format.raw/*106.21*/("""document.getElementById('show').innerHTML="The page will be redirected to the Challenge List in "
                            +""+t+" seconds";
                """),format.raw/*108.17*/("""}"""),format.raw/*108.18*/("""else if('"""),_display_(/*108.28*/registeredType),format.raw/*108.42*/("""' =="Job")"""),format.raw/*108.52*/("""{"""),format.raw/*108.53*/("""
                    """),format.raw/*109.21*/("""document.getElementById('show').innerHTML="The page will be redirected to the Home page in "
                            +""+t+" seconds";
                """),format.raw/*111.17*/("""}"""),format.raw/*111.18*/("""else if('"""),_display_(/*111.28*/registeredType),format.raw/*111.42*/("""' =="Tajob")"""),format.raw/*111.54*/("""{"""),format.raw/*111.55*/("""
                    """),format.raw/*112.21*/("""document.getElementById('show').innerHTML="The page will be redirected to the Home page in "
                            +""+t+" seconds";
                """),format.raw/*114.17*/("""}"""),format.raw/*114.18*/("""else if('"""),_display_(/*114.28*/registeredType),format.raw/*114.42*/("""' =="Rajob")"""),format.raw/*114.54*/("""{"""),format.raw/*114.55*/("""
                    """),format.raw/*115.21*/("""document.getElementById('show').innerHTML="The page will be redirected to the Home page in "
                            +""+t+" seconds";
                """),format.raw/*117.17*/("""}"""),format.raw/*117.18*/("""else if('"""),_display_(/*117.28*/registeredType),format.raw/*117.42*/("""' =="Organization")"""),format.raw/*117.61*/("""{"""),format.raw/*117.62*/("""
                    """),format.raw/*118.21*/("""document.getElementById('show').innerHTML="The page will be redirected to the Home page in "
                            +""+t+" seconds";
                """),format.raw/*120.17*/("""}"""),format.raw/*120.18*/("""else if('"""),_display_(/*120.28*/registeredType),format.raw/*120.42*/("""' =="Technology")"""),format.raw/*120.59*/("""{"""),format.raw/*120.60*/("""
                    """),format.raw/*121.21*/("""document.getElementById('show').innerHTML="The page will be redirected to the Home page in "
                            +""+t+" seconds";
                """),format.raw/*123.17*/("""}"""),format.raw/*123.18*/("""
                """),format.raw/*124.17*/("""t--;
            """),format.raw/*125.13*/("""}"""),format.raw/*125.14*/("""
    """),format.raw/*126.5*/("""</script>
""")))}),format.raw/*127.2*/("""
"""))
      }
    }
  }

  def render(newId:Long,registeredType:String): play.twirl.api.HtmlFormat.Appendable = apply(newId,registeredType)

  def f:((Long,String) => play.twirl.api.HtmlFormat.Appendable) = (newId,registeredType) => apply(newId,registeredType)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:36 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/registerConfirmation.scala.html
                  HASH: ed2926c184a9a3f325aab920fb4d6a672aaf2c7f
                  MATRIX: 1131->1|1241->41|1264->58|1293->81|1346->38|1374->105|1403->287|1430->289|1484->335|1523->337|1554->342|1791->552|1829->581|1869->583|1922->608|2066->725|2092->730|2150->757|2199->779|2234->805|2273->806|2326->831|2469->947|2495->952|2553->979|2602->1001|2642->1032|2681->1033|2734->1058|2882->1179|2908->1184|2966->1211|3015->1233|3054->1263|3093->1264|3146->1289|3292->1408|3318->1413|3376->1440|3425->1462|3459->1487|3498->1488|3551->1513|3687->1622|3713->1627|3771->1654|3820->1676|3856->1703|3895->1704|3948->1729|4090->1844|4116->1849|4174->1876|4223->1898|4259->1925|4298->1926|4351->1951|4493->2066|4519->2071|4577->2098|4626->2120|4668->2153|4707->2154|4760->2179|4913->2305|4939->2310|4997->2337|5046->2359|5095->2399|5134->2400|5187->2425|5332->2539|5382->2562|5425->2596|5464->2597|5517->2622|5668->2746|5694->2751|5752->2778|5802->2801|5843->2833|5882->2834|5935->2859|6082->2979|6108->2984|6166->3011|6216->3033|6525->3314|6554->3315|6599->3332|6639->3344|6668->3345|6717->3366|6791->3413|6826->3427|6868->3441|6897->3442|6950->3467|6988->3478|7003->3484|7057->3517|7108->3540|7137->3541|7174->3551|7209->3565|7248->3576|7277->3577|7330->3602|7368->3613|7383->3619|7423->3638|7474->3661|7503->3662|7540->3672|7575->3686|7619->3702|7648->3703|7701->3728|7739->3739|7754->3745|7815->3785|7866->3808|7895->3809|7932->3819|7967->3833|8012->3850|8041->3851|8094->3876|8132->3887|8147->3893|8208->3933|8259->3956|8288->3957|8325->3967|8360->3981|8399->3992|8428->3993|8481->4018|8519->4029|8534->4035|8584->4064|8635->4087|8664->4088|8701->4098|8736->4112|8777->4125|8806->4126|8859->4151|8897->4162|8912->4168|8965->4200|9016->4223|9045->4224|9082->4234|9117->4248|9158->4261|9187->4262|9240->4287|9278->4298|9293->4304|9346->4336|9397->4359|9426->4360|9463->4370|9498->4384|9546->4404|9575->4405|9628->4430|9666->4441|9681->4447|9721->4466|9772->4489|9801->4490|9838->4500|9873->4514|9919->4532|9948->4533|10001->4558|10039->4569|10054->4575|10094->4594|10145->4617|10174->4618|10219->4635|10248->4636|10294->4654|10326->4659|10361->4673|10403->4687|10432->4688|10481->4709|10672->4872|10701->4873|10738->4883|10773->4897|10812->4908|10841->4909|10891->4930|11081->5091|11111->5092|11141->5093|11179->5103|11215->5117|11259->5132|11289->5133|11339->5154|11532->5318|11562->5319|11600->5329|11636->5343|11681->5359|11711->5360|11761->5381|11950->5541|11980->5542|12018->5552|12054->5566|12093->5576|12123->5577|12173->5598|12357->5753|12387->5754|12425->5764|12461->5778|12502->5790|12532->5791|12582->5812|12766->5967|12796->5968|12834->5978|12870->5992|12911->6004|12941->6005|12991->6026|13175->6181|13205->6182|13243->6192|13279->6206|13327->6225|13357->6226|13407->6247|13591->6402|13621->6403|13659->6413|13695->6427|13741->6444|13771->6445|13821->6466|14005->6621|14035->6622|14081->6639|14127->6656|14157->6657|14190->6662|14232->6673
                  LINES: 35->1|38->3|39->4|40->5|43->1|45->6|46->7|47->8|47->8|47->8|48->9|54->15|54->15|54->15|55->16|56->17|56->17|57->18|58->19|58->19|58->19|59->20|60->21|60->21|61->22|62->23|62->23|62->23|63->24|64->25|64->25|65->26|66->27|66->27|66->27|67->28|68->29|68->29|69->30|70->31|70->31|70->31|71->32|72->33|72->33|73->34|74->35|74->35|74->35|75->36|76->37|76->37|77->38|78->39|78->39|78->39|79->40|80->41|80->41|81->42|82->43|82->43|82->43|83->44|84->45|84->45|85->46|86->47|86->47|86->47|87->48|88->49|90->51|90->51|90->51|91->52|92->53|92->53|93->54|95->56|95->56|95->56|96->57|97->58|97->58|98->59|100->61|111->72|111->72|112->73|112->73|112->73|113->74|114->75|114->75|114->75|114->75|115->76|115->76|115->76|115->76|116->77|116->77|116->77|116->77|116->77|116->77|117->78|117->78|117->78|117->78|118->79|118->79|118->79|118->79|118->79|118->79|119->80|119->80|119->80|119->80|120->81|120->81|120->81|120->81|120->81|120->81|121->82|121->82|121->82|121->82|122->83|122->83|122->83|122->83|122->83|122->83|123->84|123->84|123->84|123->84|124->85|124->85|124->85|124->85|124->85|124->85|125->86|125->86|125->86|125->86|126->87|126->87|126->87|126->87|126->87|126->87|127->88|127->88|127->88|127->88|128->89|128->89|128->89|128->89|128->89|128->89|129->90|129->90|129->90|129->90|130->91|130->91|130->91|130->91|130->91|130->91|131->92|131->92|131->92|131->92|132->93|132->93|133->94|133->94|135->96|135->96|135->96|135->96|135->96|136->97|138->99|138->99|138->99|138->99|138->99|138->99|139->100|141->102|141->102|141->102|141->102|141->102|141->102|141->102|142->103|144->105|144->105|144->105|144->105|144->105|144->105|145->106|147->108|147->108|147->108|147->108|147->108|147->108|148->109|150->111|150->111|150->111|150->111|150->111|150->111|151->112|153->114|153->114|153->114|153->114|153->114|153->114|154->115|156->117|156->117|156->117|156->117|156->117|156->117|157->118|159->120|159->120|159->120|159->120|159->120|159->120|160->121|162->123|162->123|163->124|164->125|164->125|165->126|166->127
                  -- GENERATED --
              */
          