
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

object challengeDetail extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template9[Challenge,String,Long,String,String,String,String,String,Boolean,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(challenge: Challenge, userTypes: String, userId: Long, userIdStr: String, tableName: String, challengeFileType: String, tableRecorderId: String, backendPort: String, challengeDocument: Boolean):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import helper._


Seq[Any](format.raw/*2.196*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("Challenge Profile")/*6.27*/ {_display_(Seq[Any](format.raw/*6.29*/("""
    """),format.raw/*7.5*/("""<div class="container">
        <div class="row">
            <div class="col s12">
                <div class="card-panel">

                    <h4 class="center">Challenge: """),_display_(/*12.52*/challenge/*12.61*/.getChallengeTitle),format.raw/*12.79*/("""</h4>

                    <div class="row">
                        <div class="col s4">
                            <div class="center">

                                <img class="circle" id="showImg" src='"""),_display_(/*18.72*/routes/*18.78*/.Assets.at("images/challenge.jpg")),format.raw/*18.112*/("""' width="360" height="360" style="border-width: 1px;
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
                                        <th style="max-width: 50px">Challenge Title</th>
                                        <td style="word-wrap: break-word;">"""),_display_(/*30.77*/challenge/*30.86*/.getChallengeTitle),format.raw/*30.104*/("""</td>
                                    </tr>
                                    <tr>
                                        <th style="max-width: 50px">Short Description</th>
                                        <td style="word-wrap: break-word;">"""),_display_(/*34.77*/challenge/*34.86*/.getShortDescription),format.raw/*34.106*/("""</td>
                                    </tr>
                                    <tr>
                                        <th style="max-width: 50px">Long Description</th>
                                        <td style="word-wrap: break-word;">"""),_display_(/*38.77*/challenge/*38.86*/.getLongDescription),format.raw/*38.105*/("""</td>
                                    </tr>
                                    <tr>
                                        <th style="max-width: 50px">Required Expertise</th>
                                        <td style="word-wrap: break-word;">"""),_display_(/*42.77*/challenge/*42.86*/.getRequiredExpertise),format.raw/*42.107*/("""</td>
                                    </tr>
                                    <tr>
                                        <th style="max-width: 50px">Preferred Expertise</th>
                                        <td style="word-wrap: break-word;">"""),_display_(/*46.77*/challenge/*46.86*/.getPreferredExpertise),format.raw/*46.108*/("""</td>
                                    </tr>
                                    <tr>
                                        <th style="max-width: 50px">Preferred Time</th>
                                        <td style="word-wrap: break-word;">"""),_display_(/*50.77*/challenge/*50.86*/.getPreferredTime),format.raw/*50.103*/("""</td>
                                    </tr>
                                    <tr>
                                        <th style="max-width: 50px">Technology Used</th>
                                        <td style="word-wrap: break-word;">"""),_display_(/*54.77*/challenge/*54.86*/.getTech),format.raw/*54.94*/("""</td>
                                    </tr>
                                    <tr>
                                        <th style="max-width: 50px">Location</th>
                                        <td style="word-wrap: break-word;">"""),_display_(/*58.77*/challenge/*58.86*/.getLocation),format.raw/*58.98*/("""</td>
                                    </tr>
                                    <tr>
                                        <th style="max-width: 50px">Budget</th>
                                        <td style="word-wrap: break-word;">"""),_display_(/*62.77*/challenge/*62.86*/.getMinBudget),format.raw/*62.99*/(""" """),format.raw/*62.100*/("""- """),_display_(/*62.103*/challenge/*62.112*/.getMaxBudget),format.raw/*62.125*/("""</td>
                                    </tr>
"""),format.raw/*64.45*/("""
"""),format.raw/*65.87*/("""
"""),format.raw/*66.129*/("""
"""),format.raw/*67.46*/("""
                                    """),_display_(/*68.38*/if(challengeDocument)/*68.59*/ {_display_(Seq[Any](format.raw/*68.61*/("""
                                        """),format.raw/*69.41*/("""<tr>
                                            <th style="max-width: 50px">Challenge Document</th>
                                            <td style="word-wrap: break-word;">
                                                <a href="javascript:void(0);"
                                                data-url=""""),_display_(/*73.60*/routes/*73.66*/.FileController.getFile(tableName, challengeFileType, tableRecorderId)),format.raw/*73.136*/(""""
                                                class="blue-text text-darken-3"
                                                onclick="openAndCheckNewTabUrl(this)">
                                                    Download Challenge Document
                                                </a>
                                            </td>
                                        </tr>
                                    """)))}),format.raw/*80.38*/("""
                                """),format.raw/*81.33*/("""</tbody>
                            </table>
                        </div>
                    </div>
                    <div class="row center">
                        """),_display_(/*86.26*/if((userTypes == "2" && challenge.getChallengePublisher().getId().equals(userId)) || userTypes == "0")/*86.128*/ {_display_(Seq[Any](format.raw/*86.130*/("""
                            """),format.raw/*87.29*/("""<a href=""""),_display_(/*87.39*/routes/*87.45*/.ChallengeController.challengeEditPage(challenge.getId)),format.raw/*87.100*/("""" class="btn waves-effect waves-light blue darken-2">
                                Edit Challenge Info
                            </a>
                        """)))}),format.raw/*90.26*/("""

                        """),format.raw/*92.25*/("""<a href=""""),_display_(/*92.35*/routes/*92.41*/.ChallengeController.challengeList(1, "id")),format.raw/*92.84*/("""" class="btn waves-effect waves-light blue darken-2">
                            Back to Challenge List</a>
                        """),_display_(/*94.26*/if(userTypes == "1" || userTypes == "0")/*94.66*/ {_display_(Seq[Any](format.raw/*94.68*/("""
                           """),format.raw/*95.28*/("""<a href=""""),_display_(/*95.38*/routes/*95.44*/.ChallengeController.challengeApplyPage(challenge.getId)),format.raw/*95.100*/("""" class="btn waves-effect waves-light green darken-2">
                                Bid Challenge
                            </a>
                        """)))}),format.raw/*98.26*/("""
                        """),_display_(/*99.26*/if((userTypes == "2" && challenge.getChallengePublisher().getId().equals(userId)) || userTypes == "0" )/*99.129*/ {_display_(Seq[Any](format.raw/*99.131*/("""
                            """),format.raw/*100.29*/("""<a href=""""),_display_(/*100.39*/routes/*100.45*/.ChallengeController.closeChallenge(challenge.getId)),format.raw/*100.97*/("""" class="btn waves-effect waves-light blue darken-2">
                                Close Challenge</a>
                        """)))}),format.raw/*102.26*/("""
                    """),format.raw/*103.21*/("""</div>
                </div>
            </div>
        </div>
    </div>


    <script>
        function openAndCheckNewTabUrl(link) """),format.raw/*111.46*/("""{"""),format.raw/*111.47*/("""const url = link.getAttribute('data-url');

        fetch(url, """),format.raw/*113.20*/("""{"""),format.raw/*113.21*/(""" """),format.raw/*113.22*/("""method: 'HEAD' """),format.raw/*113.37*/("""}"""),format.raw/*113.38*/(""").then(response => """),format.raw/*113.57*/("""{"""),format.raw/*113.58*/("""
            """),format.raw/*114.13*/("""if (response.ok) """),format.raw/*114.30*/("""{"""),format.raw/*114.31*/("""
                """),format.raw/*115.17*/("""const newTab = window.open(url, '_blank');
                if (!newTab) """),format.raw/*116.30*/("""{"""),format.raw/*116.31*/("""
                    """),format.raw/*117.21*/("""alert("Please allow pop-ups in your browser to view this file.");
                """),format.raw/*118.17*/("""}"""),format.raw/*118.18*/("""
            """),format.raw/*119.13*/("""}"""),format.raw/*119.14*/(""" """),format.raw/*119.15*/("""else """),format.raw/*119.20*/("""{"""),format.raw/*119.21*/("""
                """),format.raw/*120.17*/("""alert("The user did not upload this file");
            """),format.raw/*121.13*/("""}"""),format.raw/*121.14*/("""
        """),format.raw/*122.9*/("""}"""),format.raw/*122.10*/(""")
                .catch(error => """),format.raw/*123.33*/("""{"""),format.raw/*123.34*/("""
                    """),format.raw/*124.21*/("""console.error("Error checking the URL:", error);
                    alert("Failed to check the file. Please try again later.");
                """),format.raw/*126.17*/("""}"""),format.raw/*126.18*/(""");
        """),format.raw/*127.9*/("""}"""),format.raw/*127.10*/("""
    """),format.raw/*128.5*/("""</script>

""")))}),format.raw/*130.2*/("""
"""))
      }
    }
  }

  def render(challenge:Challenge,userTypes:String,userId:Long,userIdStr:String,tableName:String,challengeFileType:String,tableRecorderId:String,backendPort:String,challengeDocument:Boolean): play.twirl.api.HtmlFormat.Appendable = apply(challenge,userTypes,userId,userIdStr,tableName,challengeFileType,tableRecorderId,backendPort,challengeDocument)

  def f:((Challenge,String,Long,String,String,String,String,String,Boolean) => play.twirl.api.HtmlFormat.Appendable) = (challenge,userTypes,userId,userIdStr,tableName,challengeFileType,tableRecorderId,backendPort,challengeDocument) => apply(challenge,userTypes,userId,userIdStr,tableName,challengeFileType,tableRecorderId,backendPort,challengeDocument)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:30 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/challengeDetail.scala.html
                  HASH: b3ba91f196cdbbb1bd9883b9791aa87ec8ca8a40
                  MATRIX: 814->1|1230->46|1497->243|1543->240|1571->259|1598->261|1631->286|1670->288|1701->293|1905->470|1923->479|1962->497|2200->708|2215->714|2271->748|2990->1440|3008->1449|3048->1467|3331->1723|3349->1732|3391->1752|3673->2007|3691->2016|3732->2035|4016->2292|4034->2301|4077->2322|4362->2580|4380->2589|4424->2611|4704->2864|4722->2873|4761->2890|5042->3144|5060->3153|5089->3161|5363->3408|5381->3417|5414->3429|5686->3674|5704->3683|5738->3696|5768->3697|5799->3700|5818->3709|5853->3722|5929->3814|5958->3901|5988->4030|6017->4076|6082->4114|6112->4135|6152->4137|6221->4178|6566->4496|6581->4502|6673->4572|7139->5007|7200->5040|7401->5214|7513->5316|7554->5318|7611->5347|7648->5357|7663->5363|7740->5418|7935->5582|7989->5608|8026->5618|8041->5624|8105->5667|8266->5801|8315->5841|8355->5843|8411->5871|8448->5881|8463->5887|8541->5943|8731->6102|8784->6128|8897->6231|8938->6233|8996->6262|9034->6272|9050->6278|9124->6330|9287->6461|9337->6482|9501->6617|9531->6618|9623->6681|9653->6682|9683->6683|9727->6698|9757->6699|9805->6718|9835->6719|9877->6732|9923->6749|9953->6750|9999->6767|10100->6839|10130->6840|10180->6861|10291->6943|10321->6944|10363->6957|10393->6958|10423->6959|10457->6964|10487->6965|10533->6982|10618->7038|10648->7039|10685->7048|10715->7049|10778->7083|10808->7084|10858->7105|11032->7250|11062->7251|11101->7262|11131->7263|11164->7268|11207->7280
                  LINES: 31->1|36->2|39->4|42->2|44->5|45->6|45->6|45->6|46->7|51->12|51->12|51->12|57->18|57->18|57->18|69->30|69->30|69->30|73->34|73->34|73->34|77->38|77->38|77->38|81->42|81->42|81->42|85->46|85->46|85->46|89->50|89->50|89->50|93->54|93->54|93->54|97->58|97->58|97->58|101->62|101->62|101->62|101->62|101->62|101->62|101->62|103->64|104->65|105->66|106->67|107->68|107->68|107->68|108->69|112->73|112->73|112->73|119->80|120->81|125->86|125->86|125->86|126->87|126->87|126->87|126->87|129->90|131->92|131->92|131->92|131->92|133->94|133->94|133->94|134->95|134->95|134->95|134->95|137->98|138->99|138->99|138->99|139->100|139->100|139->100|139->100|141->102|142->103|150->111|150->111|152->113|152->113|152->113|152->113|152->113|152->113|152->113|153->114|153->114|153->114|154->115|155->116|155->116|156->117|157->118|157->118|158->119|158->119|158->119|158->119|158->119|159->120|160->121|160->121|161->122|161->122|162->123|162->123|163->124|165->126|165->126|166->127|166->127|167->128|169->130
                  -- GENERATED --
              */
          