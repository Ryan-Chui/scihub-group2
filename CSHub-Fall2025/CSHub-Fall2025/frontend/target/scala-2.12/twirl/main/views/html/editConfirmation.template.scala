
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

object editConfirmation extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Long,Long,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, entryId: Long, editType: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.45*/("""

"""),format.raw/*3.150*/("""

"""),_display_(/*5.2*/main("Edit Successfully")/*5.27*/ {_display_(Seq[Any](format.raw/*5.29*/("""
    """),format.raw/*6.5*/("""<div class="container">
        <div class="center">
            <div class="col s12 m10 offset-m1">
                <div class="card-panel">
                    <h4>Congratulations! </h4>

                    """),_display_(/*12.22*/if(editType=="Notebook")/*12.46*/{_display_(Seq[Any](format.raw/*12.47*/("""
                        """),format.raw/*13.25*/("""<h5>Your notebook (ID: """),_display_(/*13.49*/id),format.raw/*13.51*/(""") has been successfully updated.</h5>
                    """)))}),_display_(/*14.23*/if(editType=="Project")/*14.46*/{_display_(Seq[Any](format.raw/*14.47*/("""
                        """),format.raw/*15.25*/("""<h5>Your project (ID: """),_display_(/*15.48*/id),format.raw/*15.50*/(""") has been successfully updated.</h5>
                    """)))}),_display_(/*16.23*/if(editType=="Challenge")/*16.48*/{_display_(Seq[Any](format.raw/*16.49*/("""
                        """),format.raw/*17.25*/("""<h5>Your Challenge (ID: """),_display_(/*17.50*/id),format.raw/*17.52*/(""") has been successfully Applied.</h5>
                    """)))}),_display_(/*18.23*/if(editType=="BidChallenge")/*18.51*/{_display_(Seq[Any](format.raw/*18.52*/("""
                        """),format.raw/*19.25*/("""<h5>Your Bid Challenge (ID: """),_display_(/*19.54*/id),format.raw/*19.56*/(""") has been successfully Applied.</h5>
                    """)))}),_display_(/*20.23*/if(editType=="Job")/*20.42*/{_display_(Seq[Any](format.raw/*20.43*/("""
                        """),format.raw/*21.25*/("""<h5>Your Job (ID: """),_display_(/*21.44*/id),format.raw/*21.46*/(""") has been successfully Applied.</h5>
                    """)))}),_display_(/*22.23*/if(editType=="Rajob")/*22.44*/{_display_(Seq[Any](format.raw/*22.45*/("""
                        """),format.raw/*23.25*/("""<h5>Your RA Job (ID: """),_display_(/*23.47*/id),format.raw/*23.49*/(""") has been successfully Applied.</h5>
                    """)))}),_display_(/*24.23*/if(editType=="Tajob")/*24.44*/{_display_(Seq[Any](format.raw/*24.45*/("""
                        """),format.raw/*25.25*/("""<h5>Your TA Job (ID: """),_display_(/*25.47*/id),format.raw/*25.49*/(""") has been successfully Applied.</h5>
                    """)))}),_display_(/*26.23*/if(editType=="TajobOffer")/*26.49*/{_display_(Seq[Any](format.raw/*26.50*/("""
                        """),format.raw/*27.25*/("""<h5>Your TA Job Application (ID: """),_display_(/*27.59*/id),format.raw/*27.61*/(""") has been successfully offered.</h5>
                    """)))}),_display_(/*28.23*/if(editType=="RajobOffer")/*28.49*/{_display_(Seq[Any](format.raw/*28.50*/("""
                        """),format.raw/*29.25*/("""<h5>Your RA Job Application (ID: """),_display_(/*29.59*/id),format.raw/*29.61*/(""") has been successfully offered.</h5>
                    """)))}),_display_(/*30.23*/if(editType=="JobOffer")/*30.47*/{_display_(Seq[Any](format.raw/*30.48*/("""
                        """),format.raw/*31.25*/("""<h5>Your Job Application (ID: """),_display_(/*31.56*/id),format.raw/*31.58*/(""") has been successfully offered.</h5>
                    """)))}),_display_(/*32.23*/if(editType=="ChallengeOffer")/*32.53*/{_display_(Seq[Any](format.raw/*32.54*/("""
                        """),format.raw/*33.25*/("""<h5>Your Challenge Application (ID: """),_display_(/*33.62*/id),format.raw/*33.64*/(""") has been successfully offered.</h5>
                    """)))}),_display_(/*34.23*/if(editType=="SendOffer")/*34.48*/{_display_(Seq[Any](format.raw/*34.49*/("""
                    """),format.raw/*35.21*/("""<h5>The offer email for Applicant (ID: """),_display_(/*35.61*/id),format.raw/*35.63*/(""") has been successfully sent.</h5>
                    """)))}),format.raw/*36.22*/("""

                    """),format.raw/*38.21*/("""<br>
                    <br>
                    <span id="show"></span>
                </div>
            </div>
        </div>
    </div>
    <script type="text/javascript">
            var t = 5;
            var timer = setInterval(refer, 1000);
            function refer() """),format.raw/*48.30*/("""{"""),format.raw/*48.31*/("""
                """),format.raw/*49.17*/("""if (t <= 0) """),format.raw/*49.29*/("""{"""),format.raw/*49.30*/("""
                    """),format.raw/*50.21*/("""clearInterval(timer);
                    if('"""),_display_(/*51.26*/editType),format.raw/*51.34*/("""' =="Project")"""),format.raw/*51.48*/("""{"""),format.raw/*51.49*/("""
                        """),format.raw/*52.25*/("""location='"""),_display_(/*52.36*/routes/*52.42*/.ProjectController.projectDetail(id)),format.raw/*52.78*/("""';
                    """),format.raw/*53.21*/("""}"""),format.raw/*53.22*/("""else if('"""),_display_(/*53.32*/editType),format.raw/*53.40*/("""' == "Challenge")"""),format.raw/*53.57*/("""{"""),format.raw/*53.58*/("""
                        """),format.raw/*54.25*/("""location='"""),_display_(/*54.36*/routes/*54.42*/.ChallengeController.challengeDetail(id)),format.raw/*54.82*/("""';
                    """),format.raw/*55.21*/("""}"""),format.raw/*55.22*/("""else if('"""),_display_(/*55.32*/editType),format.raw/*55.40*/("""' == "BidChallenge")"""),format.raw/*55.60*/("""{"""),format.raw/*55.61*/("""
                        """),format.raw/*56.25*/("""location='"""),_display_(/*56.36*/routes/*56.42*/.ChallengeController.challengeDetail(id)),format.raw/*56.82*/("""';
                    """),format.raw/*57.21*/("""}"""),format.raw/*57.22*/("""else if('"""),_display_(/*57.32*/editType),format.raw/*57.40*/("""' == "Job")"""),format.raw/*57.51*/("""{"""),format.raw/*57.52*/("""
                        """),format.raw/*58.25*/("""location='"""),_display_(/*58.36*/routes/*58.42*/.JobController.jobDetail(id)),format.raw/*58.70*/("""';
                    """),format.raw/*59.21*/("""}"""),format.raw/*59.22*/("""else if('"""),_display_(/*59.32*/editType),format.raw/*59.40*/("""' == "Tajob")"""),format.raw/*59.53*/("""{"""),format.raw/*59.54*/("""
                        """),format.raw/*60.25*/("""location='"""),_display_(/*60.36*/routes/*60.42*/.TAJobController.tajobDetail(id)),format.raw/*60.74*/("""';
                    """),format.raw/*61.21*/("""}"""),format.raw/*61.22*/("""else if('"""),_display_(/*61.32*/editType),format.raw/*61.40*/("""' == "Rajob")"""),format.raw/*61.53*/("""{"""),format.raw/*61.54*/("""
                        """),format.raw/*62.25*/("""location='"""),_display_(/*62.36*/routes/*62.42*/.RAJobController.rajobDetail(id)),format.raw/*62.74*/("""';
                    """),format.raw/*63.21*/("""}"""),format.raw/*63.22*/("""else if('"""),_display_(/*63.32*/editType),format.raw/*63.40*/("""' == "ChallengeOffer")"""),format.raw/*63.62*/("""{"""),format.raw/*63.63*/("""
                        """),format.raw/*64.25*/("""location='"""),_display_(/*64.36*/routes/*64.42*/.UserController.mySpacePage()),format.raw/*64.71*/("""';
                    """),format.raw/*65.21*/("""}"""),format.raw/*65.22*/("""else if('"""),_display_(/*65.32*/editType),format.raw/*65.40*/("""' == "JobOffer")"""),format.raw/*65.56*/("""{"""),format.raw/*65.57*/("""
                        """),format.raw/*66.25*/("""location='"""),_display_(/*66.36*/routes/*66.42*/.UserController.mySpacePage()),format.raw/*66.71*/("""';
                    """),format.raw/*67.21*/("""}"""),format.raw/*67.22*/("""else if('"""),_display_(/*67.32*/editType),format.raw/*67.40*/("""' == "TajobOffer")"""),format.raw/*67.58*/("""{"""),format.raw/*67.59*/("""
                        """),format.raw/*68.25*/("""location='"""),_display_(/*68.36*/routes/*68.42*/.UserController.mySpacePage()),format.raw/*68.71*/("""';
                    """),format.raw/*69.21*/("""}"""),format.raw/*69.22*/("""else if('"""),_display_(/*69.32*/editType),format.raw/*69.40*/("""' == "RajobOffer")"""),format.raw/*69.58*/("""{"""),format.raw/*69.59*/("""
                        """),format.raw/*70.25*/("""location='"""),_display_(/*70.36*/routes/*70.42*/.UserController.mySpacePage()),format.raw/*70.71*/("""';
                    """),format.raw/*71.21*/("""}"""),format.raw/*71.22*/("""else if('"""),_display_(/*71.32*/editType),format.raw/*71.40*/("""' == "SendOffer")"""),format.raw/*71.57*/("""{"""),format.raw/*71.58*/("""
                        """),format.raw/*72.25*/("""location='"""),_display_(/*72.36*/routes/*72.42*/.UserController.mySpacePage()),format.raw/*72.71*/("""';
                    """),format.raw/*73.21*/("""}"""),format.raw/*73.22*/("""
                    """),format.raw/*74.21*/("""return;
                """),format.raw/*75.17*/("""}"""),format.raw/*75.18*/("""

                """),format.raw/*77.17*/("""if ('"""),_display_(/*77.23*/editType),format.raw/*77.31*/("""' == "Project") """),format.raw/*77.47*/("""{"""),format.raw/*77.48*/("""
                    """),format.raw/*78.21*/("""document.getElementById('show').innerHTML =
                            "The page will be redirected to the Project detail page in " + t + " seconds";
                """),format.raw/*80.17*/("""}"""),format.raw/*80.18*/(""" """),format.raw/*80.19*/("""else if ('"""),_display_(/*80.30*/editType),format.raw/*80.38*/("""' == "Challenge") """),format.raw/*80.56*/("""{"""),format.raw/*80.57*/("""
                    """),format.raw/*81.21*/("""document.getElementById('show').innerHTML =
                            "The page will be redirected to the Challenge detail page in " + t + " seconds";
                """),format.raw/*83.17*/("""}"""),format.raw/*83.18*/(""" """),format.raw/*83.19*/("""else if ('"""),_display_(/*83.30*/editType),format.raw/*83.38*/("""' == "BidChallenge") """),format.raw/*83.59*/("""{"""),format.raw/*83.60*/("""
                    """),format.raw/*84.21*/("""document.getElementById('show').innerHTML =
                            "The page will be redirected to the Challenge detail page in " + t + " seconds";
                """),format.raw/*86.17*/("""}"""),format.raw/*86.18*/(""" """),format.raw/*86.19*/("""else if ('"""),_display_(/*86.30*/editType),format.raw/*86.38*/("""' == "Job") """),format.raw/*86.50*/("""{"""),format.raw/*86.51*/("""
                    """),format.raw/*87.21*/("""document.getElementById('show').innerHTML =
                            "The page will be redirected to the job detail page in " + t + " seconds";
                """),format.raw/*89.17*/("""}"""),format.raw/*89.18*/(""" """),format.raw/*89.19*/("""else if ('"""),_display_(/*89.30*/editType),format.raw/*89.38*/("""' == "Tajob") """),format.raw/*89.52*/("""{"""),format.raw/*89.53*/("""
                    """),format.raw/*90.21*/("""document.getElementById('show').innerHTML =
                            "The page will be redirected to the TA job detail page in " + t + " seconds";
                """),format.raw/*92.17*/("""}"""),format.raw/*92.18*/(""" """),format.raw/*92.19*/("""else if ('"""),_display_(/*92.30*/editType),format.raw/*92.38*/("""' == "Rajob") """),format.raw/*92.52*/("""{"""),format.raw/*92.53*/("""
                    """),format.raw/*93.21*/("""document.getElementById('show').innerHTML =
                            "The page will be redirected to the RA job detail page in " + t + " seconds";
                """),format.raw/*95.17*/("""}"""),format.raw/*95.18*/(""" """),format.raw/*95.19*/("""else if ('"""),_display_(/*95.30*/editType),format.raw/*95.38*/("""' == "JobOffer") """),format.raw/*95.55*/("""{"""),format.raw/*95.56*/("""
                    """),format.raw/*96.21*/("""document.getElementById('show').innerHTML =
                            "The page will be redirected to the user My Space page in " + t + " seconds";
                """),format.raw/*98.17*/("""}"""),format.raw/*98.18*/(""" """),format.raw/*98.19*/("""else if ('"""),_display_(/*98.30*/editType),format.raw/*98.38*/("""' == "RajobOffer") """),format.raw/*98.57*/("""{"""),format.raw/*98.58*/("""
                    """),format.raw/*99.21*/("""document.getElementById('show').innerHTML =
                            "The page will be redirected to the user My Space page in " + t + " seconds";
                """),format.raw/*101.17*/("""}"""),format.raw/*101.18*/(""" """),format.raw/*101.19*/("""else if ('"""),_display_(/*101.30*/editType),format.raw/*101.38*/("""' == "ChallengeOffer") """),format.raw/*101.61*/("""{"""),format.raw/*101.62*/("""
                    """),format.raw/*102.21*/("""document.getElementById('show').innerHTML =
                            "The page will be redirected to the user My Space page in " + t + " seconds";
                """),format.raw/*104.17*/("""}"""),format.raw/*104.18*/(""" """),format.raw/*104.19*/("""else if ('"""),_display_(/*104.30*/editType),format.raw/*104.38*/("""' == "TajobOffer") """),format.raw/*104.57*/("""{"""),format.raw/*104.58*/("""
                    """),format.raw/*105.21*/("""document.getElementById('show').innerHTML =
                            "The page will be redirected to the user My Space page in " + t + " seconds";
                """),format.raw/*107.17*/("""}"""),format.raw/*107.18*/(""" """),format.raw/*107.19*/("""else if ('"""),_display_(/*107.30*/editType),format.raw/*107.38*/("""' == "SendOffer") """),format.raw/*107.56*/("""{"""),format.raw/*107.57*/("""
                    """),format.raw/*108.21*/("""document.getElementById('show').innerHTML =
                            "The page will be redirected to the user My Space page in " + t + " seconds";
                """),format.raw/*110.17*/("""}"""),format.raw/*110.18*/("""
                """),format.raw/*111.17*/("""t--;
            """),format.raw/*112.13*/("""}"""),format.raw/*112.14*/("""
    """),format.raw/*113.5*/("""</script>

""")))}),format.raw/*115.2*/("""
"""),format.raw/*116.40*/("""

"""),format.raw/*118.73*/("""
"""),format.raw/*119.16*/("""
"""),format.raw/*120.60*/("""
"""),format.raw/*121.34*/("""
"""),format.raw/*122.30*/("""
"""),format.raw/*123.53*/("""
"""),format.raw/*124.84*/("""
"""),format.raw/*125.61*/("""
"""),format.raw/*126.88*/("""
"""),format.raw/*127.63*/("""
"""),format.raw/*128.92*/("""
"""),format.raw/*129.55*/("""
"""),format.raw/*130.76*/("""
"""),format.raw/*131.57*/("""
"""),format.raw/*132.80*/("""
"""),format.raw/*133.57*/("""
"""),format.raw/*134.80*/("""
"""),format.raw/*135.66*/("""
"""),format.raw/*136.77*/("""
"""),format.raw/*137.60*/("""
"""),format.raw/*138.77*/("""
"""),format.raw/*139.62*/("""
"""),format.raw/*140.77*/("""
"""),format.raw/*141.62*/("""
"""),format.raw/*142.77*/("""
"""),format.raw/*143.61*/("""
"""),format.raw/*144.77*/("""
"""),format.raw/*145.26*/("""
"""),format.raw/*146.22*/("""

"""),format.raw/*148.50*/("""
"""),format.raw/*149.127*/("""
"""),format.raw/*150.50*/("""
"""),format.raw/*151.57*/("""
"""),format.raw/*152.129*/("""
"""),format.raw/*153.50*/("""
"""),format.raw/*154.22*/("""
"""),format.raw/*155.50*/("""
"""),format.raw/*156.123*/("""
"""),format.raw/*157.50*/("""
"""),format.raw/*158.22*/("""
"""),format.raw/*159.52*/("""
"""),format.raw/*160.126*/("""
"""),format.raw/*161.50*/("""
"""),format.raw/*162.22*/("""
"""),format.raw/*163.52*/("""
"""),format.raw/*164.126*/("""
"""),format.raw/*165.50*/("""
"""),format.raw/*166.22*/("""

"""),format.raw/*168.55*/("""
"""),format.raw/*169.126*/("""
"""),format.raw/*170.50*/("""
"""),format.raw/*171.22*/("""
"""),format.raw/*172.57*/("""
"""),format.raw/*173.126*/("""
"""),format.raw/*174.50*/("""
"""),format.raw/*175.60*/("""
"""),format.raw/*176.129*/("""
"""),format.raw/*177.50*/("""
"""),format.raw/*178.22*/("""
"""),format.raw/*179.62*/("""
"""),format.raw/*180.129*/("""
"""),format.raw/*181.50*/("""
"""),format.raw/*182.22*/("""
"""),format.raw/*183.56*/("""
"""),format.raw/*184.126*/("""
"""),format.raw/*185.50*/("""
"""),format.raw/*186.22*/("""
"""),format.raw/*187.57*/("""
"""),format.raw/*188.126*/("""
"""),format.raw/*189.50*/("""
"""),format.raw/*190.22*/("""
"""),format.raw/*191.25*/("""
"""),format.raw/*192.18*/("""
"""),format.raw/*193.18*/("""

"""))
      }
    }
  }

  def render(id:Long,entryId:Long,editType:String): play.twirl.api.HtmlFormat.Appendable = apply(id,entryId,editType)

  def f:((Long,Long,String) => play.twirl.api.HtmlFormat.Appendable) = (id,entryId,editType) => apply(id,entryId,editType)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:31 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/editConfirmation.scala.html
                  HASH: 34f4e2a35a5211886558dc1ca473092b8affed80
                  MATRIX: 1132->1|1270->44|1300->195|1328->198|1361->223|1400->225|1431->230|1669->441|1702->465|1741->466|1794->491|1845->515|1868->517|1958->577|1990->600|2029->601|2082->626|2132->649|2155->651|2245->711|2279->736|2318->737|2371->762|2423->787|2446->789|2536->849|2573->877|2612->878|2665->903|2721->932|2744->934|2834->994|2862->1013|2901->1014|2954->1039|3000->1058|3023->1060|3113->1120|3143->1141|3182->1142|3235->1167|3284->1189|3307->1191|3397->1251|3427->1272|3466->1273|3519->1298|3568->1320|3591->1322|3681->1382|3716->1408|3755->1409|3808->1434|3869->1468|3892->1470|3982->1530|4017->1556|4056->1557|4109->1582|4170->1616|4193->1618|4283->1678|4316->1702|4355->1703|4408->1728|4466->1759|4489->1761|4579->1821|4618->1851|4657->1852|4710->1877|4774->1914|4797->1916|4887->1976|4921->2001|4960->2002|5009->2023|5076->2063|5099->2065|5186->2121|5236->2143|5544->2423|5573->2424|5618->2441|5658->2453|5687->2454|5736->2475|5810->2522|5839->2530|5881->2544|5910->2545|5963->2570|6001->2581|6016->2587|6073->2623|6124->2646|6153->2647|6190->2657|6219->2665|6264->2682|6293->2683|6346->2708|6384->2719|6399->2725|6460->2765|6511->2788|6540->2789|6577->2799|6606->2807|6654->2827|6683->2828|6736->2853|6774->2864|6789->2870|6850->2910|6901->2933|6930->2934|6967->2944|6996->2952|7035->2963|7064->2964|7117->2989|7155->3000|7170->3006|7219->3034|7270->3057|7299->3058|7336->3068|7365->3076|7406->3089|7435->3090|7488->3115|7526->3126|7541->3132|7594->3164|7645->3187|7674->3188|7711->3198|7740->3206|7781->3219|7810->3220|7863->3245|7901->3256|7916->3262|7969->3294|8020->3317|8049->3318|8086->3328|8115->3336|8165->3358|8194->3359|8247->3384|8285->3395|8300->3401|8350->3430|8401->3453|8430->3454|8467->3464|8496->3472|8540->3488|8569->3489|8622->3514|8660->3525|8675->3531|8725->3560|8776->3583|8805->3584|8842->3594|8871->3602|8917->3620|8946->3621|8999->3646|9037->3657|9052->3663|9102->3692|9153->3715|9182->3716|9219->3726|9248->3734|9294->3752|9323->3753|9376->3778|9414->3789|9429->3795|9479->3824|9530->3847|9559->3848|9596->3858|9625->3866|9670->3883|9699->3884|9752->3909|9790->3920|9805->3926|9855->3955|9906->3978|9935->3979|9984->4000|10036->4024|10065->4025|10111->4043|10144->4049|10173->4057|10217->4073|10246->4074|10295->4095|10490->4262|10519->4263|10548->4264|10586->4275|10615->4283|10661->4301|10690->4302|10739->4323|10936->4492|10965->4493|10994->4494|11032->4505|11061->4513|11110->4534|11139->4535|11188->4556|11385->4725|11414->4726|11443->4727|11481->4738|11510->4746|11550->4758|11579->4759|11628->4780|11819->4943|11848->4944|11877->4945|11915->4956|11944->4964|11986->4978|12015->4979|12064->5000|12258->5166|12287->5167|12316->5168|12354->5179|12383->5187|12425->5201|12454->5202|12503->5223|12697->5389|12726->5390|12755->5391|12793->5402|12822->5410|12867->5427|12896->5428|12945->5449|13139->5615|13168->5616|13197->5617|13235->5628|13264->5636|13311->5655|13340->5656|13389->5677|13584->5843|13614->5844|13644->5845|13683->5856|13713->5864|13765->5887|13795->5888|13845->5909|14040->6075|14070->6076|14100->6077|14139->6088|14169->6096|14217->6115|14247->6116|14297->6137|14492->6303|14522->6304|14552->6305|14591->6316|14621->6324|14668->6342|14698->6343|14748->6364|14943->6530|14973->6531|15019->6548|15065->6565|15095->6566|15128->6571|15171->6583|15201->6623|15232->6697|15262->6713|15292->6773|15322->6807|15352->6837|15382->6890|15412->6974|15442->7035|15472->7123|15502->7186|15532->7278|15562->7333|15592->7409|15622->7466|15652->7546|15682->7603|15712->7683|15742->7749|15772->7826|15802->7886|15832->7963|15862->8025|15892->8102|15922->8164|15952->8241|15982->8302|16012->8379|16042->8405|16072->8427|16103->8478|16134->8605|16164->8655|16194->8712|16225->8841|16255->8891|16285->8913|16315->8963|16346->9086|16376->9136|16406->9158|16436->9210|16467->9336|16497->9386|16527->9408|16557->9460|16588->9586|16618->9636|16648->9658|16679->9714|16710->9840|16740->9890|16770->9912|16800->9969|16831->10095|16861->10145|16891->10205|16922->10334|16952->10384|16982->10406|17012->10468|17043->10597|17073->10647|17103->10669|17133->10725|17164->10851|17194->10901|17224->10923|17254->10980|17285->11106|17315->11156|17345->11178|17375->11203|17405->11221|17435->11239
                  LINES: 35->1|40->1|42->3|44->5|44->5|44->5|45->6|51->12|51->12|51->12|52->13|52->13|52->13|53->14|53->14|53->14|54->15|54->15|54->15|55->16|55->16|55->16|56->17|56->17|56->17|57->18|57->18|57->18|58->19|58->19|58->19|59->20|59->20|59->20|60->21|60->21|60->21|61->22|61->22|61->22|62->23|62->23|62->23|63->24|63->24|63->24|64->25|64->25|64->25|65->26|65->26|65->26|66->27|66->27|66->27|67->28|67->28|67->28|68->29|68->29|68->29|69->30|69->30|69->30|70->31|70->31|70->31|71->32|71->32|71->32|72->33|72->33|72->33|73->34|73->34|73->34|74->35|74->35|74->35|75->36|77->38|87->48|87->48|88->49|88->49|88->49|89->50|90->51|90->51|90->51|90->51|91->52|91->52|91->52|91->52|92->53|92->53|92->53|92->53|92->53|92->53|93->54|93->54|93->54|93->54|94->55|94->55|94->55|94->55|94->55|94->55|95->56|95->56|95->56|95->56|96->57|96->57|96->57|96->57|96->57|96->57|97->58|97->58|97->58|97->58|98->59|98->59|98->59|98->59|98->59|98->59|99->60|99->60|99->60|99->60|100->61|100->61|100->61|100->61|100->61|100->61|101->62|101->62|101->62|101->62|102->63|102->63|102->63|102->63|102->63|102->63|103->64|103->64|103->64|103->64|104->65|104->65|104->65|104->65|104->65|104->65|105->66|105->66|105->66|105->66|106->67|106->67|106->67|106->67|106->67|106->67|107->68|107->68|107->68|107->68|108->69|108->69|108->69|108->69|108->69|108->69|109->70|109->70|109->70|109->70|110->71|110->71|110->71|110->71|110->71|110->71|111->72|111->72|111->72|111->72|112->73|112->73|113->74|114->75|114->75|116->77|116->77|116->77|116->77|116->77|117->78|119->80|119->80|119->80|119->80|119->80|119->80|119->80|120->81|122->83|122->83|122->83|122->83|122->83|122->83|122->83|123->84|125->86|125->86|125->86|125->86|125->86|125->86|125->86|126->87|128->89|128->89|128->89|128->89|128->89|128->89|128->89|129->90|131->92|131->92|131->92|131->92|131->92|131->92|131->92|132->93|134->95|134->95|134->95|134->95|134->95|134->95|134->95|135->96|137->98|137->98|137->98|137->98|137->98|137->98|137->98|138->99|140->101|140->101|140->101|140->101|140->101|140->101|140->101|141->102|143->104|143->104|143->104|143->104|143->104|143->104|143->104|144->105|146->107|146->107|146->107|146->107|146->107|146->107|146->107|147->108|149->110|149->110|150->111|151->112|151->112|152->113|154->115|155->116|157->118|158->119|159->120|160->121|161->122|162->123|163->124|164->125|165->126|166->127|167->128|168->129|169->130|170->131|171->132|172->133|173->134|174->135|175->136|176->137|177->138|178->139|179->140|180->141|181->142|182->143|183->144|184->145|185->146|187->148|188->149|189->150|190->151|191->152|192->153|193->154|194->155|195->156|196->157|197->158|198->159|199->160|200->161|201->162|202->163|203->164|204->165|205->166|207->168|208->169|209->170|210->171|211->172|212->173|213->174|214->175|215->176|216->177|217->178|218->179|219->180|220->181|221->182|222->183|223->184|224->185|225->186|226->187|227->188|228->189|229->190|230->191|231->192|232->193
                  -- GENERATED --
              */
          