
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
/*1.2*/import org.apache.commons.lang3.StringUtils

object tajobDetail extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[TAJob,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(tajob: TAJob):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import helper._


Seq[Any](format.raw/*2.16*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("TAJob Profile")/*6.23*/ {_display_(Seq[Any](format.raw/*6.25*/("""
    """),format.raw/*7.5*/("""<div class="container">
        <div class="row">
            <div class="col s12">
                <div class="card-panel">

                    <h4 class="center">TA Job: """),_display_(/*12.49*/tajob/*12.54*/.getTitle),format.raw/*12.63*/("""</h4>

                    <div class="row">
                        <div class="col s4">
                            <div class="center">
                                <img class="circle" id="showImg" src=""""),_display_(/*17.72*/routes/*17.78*/.Assets.at("images/smu.jpeg")),format.raw/*17.107*/("""" width="360" height="360" style="border-width: 1px;
                                    border-style: solid;
                                    border-tadius: 50%;
                                    height: auto;
                                    width: 70%;">
                            </div>
                        </div>
                        <div class="col s8">
                            <table class="striped responsive-table">
                                <tbody>
                                    <tr>
                                        <th style="max-width: 50px">TA Job Title</th>
                                        <td style="word-wtap: break-word;">"""),_display_(/*29.77*/tajob/*29.82*/.getTitle),format.raw/*29.91*/("""</td>
                                    </tr>

                                    <tr>
                                        <th style="max-width: 50px">TA Job Semester</th>
                                        """),_display_(/*34.42*/if(tajob.getTaJobSemesterTypes!="null" && tajob.getTaJobSemesterTypes != "")/*34.118*/ {_display_(Seq[Any](format.raw/*34.120*/("""
                                            """),_display_(/*35.46*/if(tajob.getTaJobSemesterTypes == 1)/*35.82*/{_display_(Seq[Any](format.raw/*35.83*/("""
                                                """),format.raw/*36.49*/("""<td style="word-wrap: break-word;">Fall</td>
                                            """)))}),format.raw/*37.46*/("""
                                            """),_display_(/*38.46*/if(tajob.getTaJobSemesterTypes == 2)/*38.82*/{_display_(Seq[Any](format.raw/*38.83*/("""
                                                """),format.raw/*39.49*/("""<td style="word-wrap: break-word;">Spring</td>
                                            """)))}),format.raw/*40.46*/("""
                                            """),_display_(/*41.46*/if(tajob.getTaJobSemesterTypes == 3)/*41.82*/{_display_(Seq[Any](format.raw/*41.83*/("""
                                                """),format.raw/*42.49*/("""<td style="word-wrap: break-word;">Summer</td>
                                            """)))}),format.raw/*43.46*/("""
                                        """)))}/*44.43*/else/*44.48*/{_display_(Seq[Any](format.raw/*44.49*/("""
                                            """),format.raw/*45.45*/("""<td>-</td>
                                        """)))}),format.raw/*46.42*/("""
                                    """),format.raw/*47.37*/("""</tr>

                                    <tr>
                                        <th style="max-width: 50px">Department/Lab Name</th>
                                        """),_display_(/*51.42*/if(tajob.getOrganization!="null" && tajob.getOrganization != "")/*51.106*/ {_display_(Seq[Any](format.raw/*51.108*/("""
                                            """),format.raw/*52.45*/("""<td style="word-wrap: break-word;">"""),_display_(/*52.81*/tajob/*52.86*/.getOrganization),format.raw/*52.102*/("""</td>
                                        """)))}/*53.43*/else/*53.48*/{_display_(Seq[Any](format.raw/*53.49*/("""
                                            """),format.raw/*54.45*/("""<td>-</td>
                                        """)))}),format.raw/*55.42*/("""
                                    """),format.raw/*56.37*/("""</tr>

                                    <tr>
                                        <th style="max-width: 50px">Goals</th>
                                        """),_display_(/*60.42*/if(tajob.getGoals!="null" && tajob.getGoals != "")/*60.92*/ {_display_(Seq[Any](format.raw/*60.94*/("""
                                            """),format.raw/*61.45*/("""<td style="word-wtap: break-word;">"""),_display_(/*61.81*/tajob/*61.86*/.getGoals),format.raw/*61.95*/("""</td>
                                        """)))}/*62.43*/else/*62.48*/{_display_(Seq[Any](format.raw/*62.49*/("""
                                            """),format.raw/*63.45*/("""<td>-</td>
                                        """)))}),format.raw/*64.42*/("""
                                    """),format.raw/*65.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">Short Description</th>
                                        """),_display_(/*68.42*/if(tajob.getShortDescription!="null" && tajob.getShortDescription != "")/*68.114*/ {_display_(Seq[Any](format.raw/*68.116*/("""
                                            """),format.raw/*69.45*/("""<td style="word-wtap: break-word;">"""),_display_(/*69.81*/tajob/*69.86*/.getShortDescription),format.raw/*69.106*/("""</td>
                                        """)))}/*70.43*/else/*70.48*/{_display_(Seq[Any](format.raw/*70.49*/("""
                                            """),format.raw/*71.45*/("""<td>-</td>
                                        """)))}),format.raw/*72.42*/("""
                                    """),format.raw/*73.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">Long Description</th>
                                        """),_display_(/*76.42*/if(tajob.getLongDescription!="null" && tajob.getLongDescription != "")/*76.112*/ {_display_(Seq[Any](format.raw/*76.114*/("""
                                            """),format.raw/*77.45*/("""<td style="word-wtap: break-word;">"""),_display_(/*77.81*/tajob/*77.86*/.getLongDescription),format.raw/*77.105*/("""</td>
                                        """)))}/*78.43*/else/*78.48*/{_display_(Seq[Any](format.raw/*78.49*/("""
                                            """),format.raw/*79.45*/("""<td>-</td>
                                        """)))}),format.raw/*80.42*/("""
                                    """),format.raw/*81.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">Fields</th>
                                        """),_display_(/*84.42*/if(tajob.getFields!="null" && tajob.getFields != "")/*84.94*/ {_display_(Seq[Any](format.raw/*84.96*/("""
                                            """),format.raw/*85.45*/("""<td style="word-wtap: break-word;">"""),_display_(/*85.81*/tajob/*85.86*/.getFields),format.raw/*85.96*/("""</td>
                                        """)))}/*86.43*/else/*86.48*/{_display_(Seq[Any](format.raw/*86.49*/("""
                                            """),format.raw/*87.45*/("""<td>-</td>
                                        """)))}),format.raw/*88.42*/("""
                                    """),format.raw/*89.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">Required Expertise</th>
                                        """),_display_(/*92.42*/if(tajob.getRequiredExpertise!="null" && tajob.getRequiredExpertise != "")/*92.116*/ {_display_(Seq[Any](format.raw/*92.118*/("""
                                            """),format.raw/*93.45*/("""<td style="word-wtap: break-word;">"""),_display_(/*93.81*/tajob/*93.86*/.getRequiredExpertise),format.raw/*93.107*/("""</td>
                                        """)))}/*94.43*/else/*94.48*/{_display_(Seq[Any](format.raw/*94.49*/("""
                                            """),format.raw/*95.45*/("""<td>-</td>
                                        """)))}),format.raw/*96.42*/("""
                                    """),format.raw/*97.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">Preferred Expertise</th>
                                        """),_display_(/*100.42*/if(tajob.getPreferredExpertise!="null" && tajob.getPreferredExpertise != "")/*100.118*/ {_display_(Seq[Any](format.raw/*100.120*/("""
                                            """),format.raw/*101.45*/("""<td style="word-wtap: break-word;">"""),_display_(/*101.81*/tajob/*101.86*/.getPreferredExpertise),format.raw/*101.108*/("""</td>
                                        """)))}/*102.43*/else/*102.48*/{_display_(Seq[Any](format.raw/*102.49*/("""
                                            """),format.raw/*103.45*/("""<td>-</td>
                                        """)))}),format.raw/*104.42*/("""
                                    """),format.raw/*105.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">Location</th>
                                        """),_display_(/*108.42*/if(tajob.getLocation!="null" && tajob.getLocation != "")/*108.98*/ {_display_(Seq[Any](format.raw/*108.100*/("""
                                            """),format.raw/*109.45*/("""<td style="word-wtap: break-word;">"""),_display_(/*109.81*/tajob/*109.86*/.getLocation),format.raw/*109.98*/("""</td>
                                        """)))}/*110.43*/else/*110.48*/{_display_(Seq[Any](format.raw/*110.49*/("""
                                            """),format.raw/*111.45*/("""<td>-</td>
                                        """)))}),format.raw/*112.42*/("""
                                    """),format.raw/*113.37*/("""</tr>

                                    <tr>
                                        <th style="max-width: 50px">TA Hours/Week</th>
                                        """),_display_(/*117.42*/if(tajob.getWorkTime!="null" && tajob.getWorkTime != "")/*117.98*/ {_display_(Seq[Any](format.raw/*117.100*/("""
                                            """),format.raw/*118.45*/("""<td style="word-wtap: break-word;">"""),_display_(/*118.81*/tajob/*118.86*/.getWorkTime),format.raw/*118.98*/("""</td>
                                        """)))}/*119.43*/else/*119.48*/{_display_(Seq[Any](format.raw/*119.49*/("""
                                            """),format.raw/*120.45*/("""<td>-</td>
                                        """)))}),format.raw/*121.42*/("""
                                    """),format.raw/*122.37*/("""</tr>
                                    <tr>
                                        <th style="max-width: 50px">TA Job Type</th>
                                        <td style="word-wtap: break-word;">
                                        """),_display_(/*126.42*/if(tajob.getTaTypes!="null" && tajob.getTaTypes != "" )/*126.97*/ {_display_(Seq[Any](format.raw/*126.99*/("""
                                            """),_display_(/*127.46*/if(tajob.getTaTypes == 1)/*127.71*/{_display_(Seq[Any](format.raw/*127.72*/("""
                                                """),format.raw/*128.49*/("""Grading, TA Office House, Recitation/Lab
                                            """)))}),format.raw/*129.46*/("""
                                            """),_display_(/*130.46*/if(tajob.getTaTypes == 2)/*130.71*/ {_display_(Seq[Any](format.raw/*130.73*/("""
                                                """),format.raw/*131.49*/("""Grading Only
                                            """)))}),format.raw/*132.46*/("""
                                        """)))}/*133.43*/else/*133.47*/{_display_(Seq[Any](format.raw/*133.48*/("""
                                            """),format.raw/*134.45*/("""N/A
                                        """)))}),format.raw/*135.42*/("""
                                        """),format.raw/*136.41*/("""</td>
                                    </tr>
                                    """),_display_(/*138.38*/if(tajob.getTaJobCourseSelections == 1)/*138.77*/ {_display_(Seq[Any](format.raw/*138.79*/("""
                                        """),format.raw/*139.41*/("""<tr>
                                            <th style="max-width: 50px">Available TA Job Course</th>
                                            <td style="word-wtap: break-word;">
                                            """),_display_(/*142.46*/if(tajob.getTaCoursesSelectionHidden != "null" && tajob.getTaCoursesSelectionHidden != "")/*142.136*/ {_display_(Seq[Any](format.raw/*142.138*/("""
                                                """),_display_(/*143.50*/tajob/*143.55*/.getTaCoursesSelectionHidden),format.raw/*143.83*/("""
                                            """)))}/*144.47*/else/*144.52*/{_display_(Seq[Any](format.raw/*144.53*/("""
                                                """),format.raw/*145.49*/("""N/A
                                            """)))}),format.raw/*146.46*/("""
                                            """),format.raw/*147.45*/("""</td>
                                        </tr>
                                    """)))}),format.raw/*149.38*/("""
"""),format.raw/*150.45*/("""
"""),format.raw/*151.90*/("""
"""),format.raw/*152.80*/("""
"""),format.raw/*153.107*/("""
"""),format.raw/*154.68*/("""
"""),format.raw/*155.53*/("""
"""),format.raw/*156.52*/("""
"""),format.raw/*157.46*/("""
"""),format.raw/*158.46*/("""
"""),format.raw/*159.107*/("""
"""),format.raw/*160.68*/("""
"""),format.raw/*161.53*/("""
"""),format.raw/*162.52*/("""
"""),format.raw/*163.46*/("""
"""),format.raw/*164.50*/("""

"""),format.raw/*166.46*/("""
                                    """),format.raw/*167.37*/("""<tr>
                                        <th style="max-width: 50px">TA Job URL</th>
                                        """),_display_(/*169.42*/if(tajob.getUrl !=null && tajob.getUrl != "")/*169.87*/ {_display_(Seq[Any](format.raw/*169.89*/("""
                                            """),format.raw/*170.45*/("""<td style="word-wtap: break-word;">"""),_display_(/*170.81*/tajob/*170.86*/.getUrl),format.raw/*170.93*/("""</td>
                                        """)))}/*171.43*/else/*171.48*/{_display_(Seq[Any](format.raw/*171.49*/("""
                                            """),format.raw/*172.45*/("""<td>-</td>
                                        """)))}),format.raw/*173.42*/("""
                                    """),format.raw/*174.37*/("""</tr>
                                    """),format.raw/*182.44*/("""
                                    """),format.raw/*183.37*/("""<tr>
                                        <th style="max-width: 50px">TA Job Publisher</th>
                                        """),_display_(/*185.42*/if(tajob.getTajobPublisher!="null" && tajob.getTajobPublisher != "")/*185.110*/ {_display_(Seq[Any](format.raw/*185.112*/("""
                                            """),format.raw/*186.45*/("""<td><a href = """"),_display_(/*186.61*/routes/*186.67*/.UserController.userDetailPage(tajob.getTajobPublisher.getId)),format.raw/*186.128*/("""">"""),_display_(/*186.131*/tajob/*186.136*/.getTajobPublisher.getUserName),format.raw/*186.166*/("""</a></td>
                                        """)))}/*187.43*/else/*187.48*/{_display_(Seq[Any](format.raw/*187.49*/("""
                                            """),format.raw/*188.45*/("""<td>-</td>
                                        """)))}),format.raw/*189.42*/("""
                                    """),format.raw/*190.37*/("""</tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                    <div class="row center">
                        <a href=""""),_display_(/*196.35*/routes/*196.41*/.TAJobController.tajobEditPage(tajob.getId)),format.raw/*196.84*/("""" class="btn waves-effect waves-light blue darken-2">
                            Edit TA Job Info</a>

                        <a href=""""),_display_(/*199.35*/routes/*199.41*/.TAJobController.tajobList(1, "id")),format.raw/*199.76*/("""" class="btn waves-effect waves-light blue darken-2">
                            Back to TA Job List</a>
                        <a href=""""),_display_(/*201.35*/routes/*201.41*/.TAJobController.tajobApplyPage(tajob.getId)),format.raw/*201.85*/("""" class="btn waves-effect waves-light green darken-2">
                            Apply Job
                        </a>

                    </div>
                </div>
            </div>
        </div>
    </div>

""")))}))
      }
    }
  }

  def render(tajob:TAJob): play.twirl.api.HtmlFormat.Appendable = apply(tajob)

  def f:((TAJob) => play.twirl.api.HtmlFormat.Appendable) = (tajob) => apply(tajob)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:38 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/tajobDetail.scala.html
                  HASH: ed134289ddc1a64888ff767e3dc3a7557358d23c
                  MATRIX: 814->1|1167->46|1254->63|1299->60|1327->79|1354->81|1383->102|1422->104|1453->109|1654->283|1668->288|1698->297|1935->507|1950->513|2001->542|2717->1231|2731->1236|2761->1245|3008->1465|3094->1541|3135->1543|3208->1589|3253->1625|3292->1626|3369->1675|3490->1765|3563->1811|3608->1847|3647->1848|3724->1897|3847->1989|3920->2035|3965->2071|4004->2072|4081->2121|4204->2213|4265->2256|4278->2261|4317->2262|4390->2307|4473->2359|4538->2396|4747->2578|4821->2642|4862->2644|4935->2689|4998->2725|5012->2730|5050->2746|5116->2794|5129->2799|5168->2800|5241->2845|5324->2897|5389->2934|5584->3102|5643->3152|5683->3154|5756->3199|5819->3235|5833->3240|5863->3249|5929->3297|5942->3302|5981->3303|6054->3348|6137->3400|6202->3437|6408->3616|6490->3688|6531->3690|6604->3735|6667->3771|6681->3776|6723->3796|6789->3844|6802->3849|6841->3850|6914->3895|6997->3947|7062->3984|7267->4162|7347->4232|7388->4234|7461->4279|7524->4315|7538->4320|7579->4339|7645->4387|7658->4392|7697->4393|7770->4438|7853->4490|7918->4527|8113->4695|8174->4747|8214->4749|8287->4794|8350->4830|8364->4835|8395->4845|8461->4893|8474->4898|8513->4899|8586->4944|8669->4996|8734->5033|8941->5213|9025->5287|9066->5289|9139->5334|9202->5370|9216->5375|9259->5396|9325->5444|9338->5449|9377->5450|9450->5495|9533->5547|9598->5584|9807->5765|9894->5841|9936->5843|10010->5888|10074->5924|10089->5929|10134->5951|10201->5999|10215->6004|10255->6005|10329->6050|10413->6102|10479->6139|10677->6309|10743->6365|10785->6367|10859->6412|10923->6448|10938->6453|10972->6465|11039->6513|11053->6518|11093->6519|11167->6564|11251->6616|11317->6653|11521->6829|11587->6885|11629->6887|11703->6932|11767->6968|11782->6973|11816->6985|11883->7033|11897->7038|11937->7039|12011->7084|12095->7136|12161->7173|12438->7422|12503->7477|12544->7479|12618->7525|12653->7550|12693->7551|12771->7600|12889->7686|12963->7732|12998->7757|13039->7759|13117->7808|13207->7866|13269->7909|13283->7913|13323->7914|13397->7959|13474->8004|13544->8045|13657->8130|13706->8169|13747->8171|13817->8212|14076->8443|14177->8533|14219->8535|14297->8585|14312->8590|14362->8618|14428->8665|14442->8670|14482->8671|14560->8720|14641->8769|14715->8814|14836->8903|14866->8948|14896->9038|14926->9118|14957->9225|14987->9293|15017->9346|15047->9398|15077->9444|15107->9490|15138->9597|15168->9665|15198->9718|15228->9770|15258->9816|15288->9866|15319->9913|15385->9950|15543->10080|15598->10125|15639->10127|15713->10172|15777->10208|15792->10213|15821->10220|15888->10268|15902->10273|15942->10274|16016->10319|16100->10371|16166->10408|16237->10917|16303->10954|16467->11090|16546->11158|16588->11160|16662->11205|16706->11221|16722->11227|16806->11288|16838->11291|16854->11296|16907->11326|16978->11378|16992->11383|17032->11384|17106->11429|17190->11481|17256->11518|17505->11739|17521->11745|17586->11788|17752->11926|17768->11932|17825->11967|17993->12107|18009->12113|18075->12157
                  LINES: 31->1|36->2|39->4|42->2|44->5|45->6|45->6|45->6|46->7|51->12|51->12|51->12|56->17|56->17|56->17|68->29|68->29|68->29|73->34|73->34|73->34|74->35|74->35|74->35|75->36|76->37|77->38|77->38|77->38|78->39|79->40|80->41|80->41|80->41|81->42|82->43|83->44|83->44|83->44|84->45|85->46|86->47|90->51|90->51|90->51|91->52|91->52|91->52|91->52|92->53|92->53|92->53|93->54|94->55|95->56|99->60|99->60|99->60|100->61|100->61|100->61|100->61|101->62|101->62|101->62|102->63|103->64|104->65|107->68|107->68|107->68|108->69|108->69|108->69|108->69|109->70|109->70|109->70|110->71|111->72|112->73|115->76|115->76|115->76|116->77|116->77|116->77|116->77|117->78|117->78|117->78|118->79|119->80|120->81|123->84|123->84|123->84|124->85|124->85|124->85|124->85|125->86|125->86|125->86|126->87|127->88|128->89|131->92|131->92|131->92|132->93|132->93|132->93|132->93|133->94|133->94|133->94|134->95|135->96|136->97|139->100|139->100|139->100|140->101|140->101|140->101|140->101|141->102|141->102|141->102|142->103|143->104|144->105|147->108|147->108|147->108|148->109|148->109|148->109|148->109|149->110|149->110|149->110|150->111|151->112|152->113|156->117|156->117|156->117|157->118|157->118|157->118|157->118|158->119|158->119|158->119|159->120|160->121|161->122|165->126|165->126|165->126|166->127|166->127|166->127|167->128|168->129|169->130|169->130|169->130|170->131|171->132|172->133|172->133|172->133|173->134|174->135|175->136|177->138|177->138|177->138|178->139|181->142|181->142|181->142|182->143|182->143|182->143|183->144|183->144|183->144|184->145|185->146|186->147|188->149|189->150|190->151|191->152|192->153|193->154|194->155|195->156|196->157|197->158|198->159|199->160|200->161|201->162|202->163|203->164|205->166|206->167|208->169|208->169|208->169|209->170|209->170|209->170|209->170|210->171|210->171|210->171|211->172|212->173|213->174|214->182|215->183|217->185|217->185|217->185|218->186|218->186|218->186|218->186|218->186|218->186|218->186|219->187|219->187|219->187|220->188|221->189|222->190|228->196|228->196|228->196|231->199|231->199|231->199|233->201|233->201|233->201
                  -- GENERATED --
              */
          