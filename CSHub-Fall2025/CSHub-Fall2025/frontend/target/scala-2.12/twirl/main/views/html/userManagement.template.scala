
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

object userManagement extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[List[User],Integer,String,Integer,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(users: List[User], pageNum: Integer, sortCriteria: String, totalCount: Integer, totalPages: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import helper._
/*5.2*/import models._

def /*7.2*/scripts/*7.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*7.13*/("""
    """),format.raw/*8.5*/("""<script type="text/javascript">
            $(document).ready(function() """),format.raw/*9.42*/("""{"""),format.raw/*9.43*/("""
                """),format.raw/*10.17*/("""$('.tooltipped').tooltip();

                $('.status-toggle').click(function() """),format.raw/*12.54*/("""{"""),format.raw/*12.55*/("""
                    """),format.raw/*13.21*/("""var userId = $(this).data('user-id');
                    var newStatus = $(this).data('new-status');
                    var currentElement = $(this);

                    $.ajax("""),format.raw/*17.28*/("""{"""),format.raw/*17.29*/("""
                        """),format.raw/*18.25*/("""url: '/backend/admin/users/' + userId + '/status',
                        method: 'PUT',
                        contentType: 'application/json',
                        data: JSON.stringify("""),format.raw/*21.46*/("""{"""),format.raw/*21.47*/("""
                            """),format.raw/*22.29*/("""isActive: newStatus
                        """),format.raw/*23.25*/("""}"""),format.raw/*23.26*/("""),
                        success: function(response) """),format.raw/*24.53*/("""{"""),format.raw/*24.54*/("""
                            """),format.raw/*25.29*/("""location.reload();
                        """),format.raw/*26.25*/("""}"""),format.raw/*26.26*/(""",
                        error: function(xhr, status, error) """),format.raw/*27.61*/("""{"""),format.raw/*27.62*/("""
                            """),format.raw/*28.29*/("""alert('Fail to update status' + error);
                        """),format.raw/*29.25*/("""}"""),format.raw/*29.26*/("""
                    """),format.raw/*30.21*/("""}"""),format.raw/*30.22*/(""");
                """),format.raw/*31.17*/("""}"""),format.raw/*31.18*/(""");
            """),format.raw/*32.13*/("""}"""),format.raw/*32.14*/(""");
    </script>
""")))};
Seq[Any](format.raw/*1.103*/("""


"""),format.raw/*6.1*/("""
"""),format.raw/*34.2*/("""

"""),_display_(/*36.2*/main("User Management - Admin Dashboard", scripts)/*36.52*/ {_display_(Seq[Any](format.raw/*36.54*/("""
    """),format.raw/*37.5*/("""<div class="container">
        <div class="row">
        </div>

        <div class="card-panel">
            <div class="row">
                <div class="col s12">
                    <h4 class="center">User Management</h4>
                </div>
            </div>

            <div class="row">
                <div class="col s6">
                    <h6 class="left">Page """),_display_(/*50.44*/pageNum),format.raw/*50.51*/(""" """),format.raw/*50.52*/("""</h6>
                </div>
                <div class="col s6" style="padding-top: -5px; margin-top: -2px">
                    <a class='dropdown-trigger btn-flat right' href='#' data-target='dropdown-sort' style="text-transform: none; font-weight: bold; color: black;">
                        Sort: &nbsp; <font color="#3a5dc3">
                        """),_display_(/*55.26*/if(sortCriteria.equals("id"))/*55.55*/ {_display_(Seq[Any](format.raw/*55.57*/("""
                            """),format.raw/*56.29*/("""userID
                        """)))}/*57.27*/else if(sortCriteria.equals("userName"))/*57.67*/ {_display_(Seq[Any](format.raw/*57.69*/("""
                    """),format.raw/*58.21*/("""userName
                    """)))}/*59.23*/else if(sortCriteria.equals("email"))/*59.60*/ {_display_(Seq[Any](format.raw/*59.62*/("""
                    """),format.raw/*60.21*/("""email
                    """)))}),format.raw/*61.22*/("""
                    """),format.raw/*62.21*/("""</font> <i class="material-icons right">expand_more</i>
                    </a>

                    <ul id='dropdown-sort' class='dropdown-content'>
                        <li><a href=""""),_display_(/*66.39*/routes/*66.45*/.AdminController.userManagement(1, "id")),format.raw/*66.85*/("""" class="grey-text text-darken-4">
                            <i class="material-icons">tag</i>userID</a></li>
                        <li><a href=""""),_display_(/*68.39*/routes/*68.45*/.AdminController.userManagement(1, "userName")),format.raw/*68.91*/("""" class="grey-text text-darken-4">
                            <i class="material-icons">person</i>name</a></li>
                        <li><a href=""""),_display_(/*70.39*/routes/*70.45*/.AdminController.userManagement(1, "email")),format.raw/*70.88*/("""" class="grey-text text-darken-4">
                            <i class="material-icons">email</i>email</a></li>
                    </ul>
                </div>
            </div>

            <table class="centered responsive-table striped">
                <thead>
                    <tr class="list-header">
                        <th>userID</th>
                        <th>user name</th>
                        <th>name</th>
                        <th>email</th>
                        <th>organization</th>
                        <th>user type</th>
                    </tr>
                </thead>
                <tbody>
                """),_display_(/*88.18*/for(user <- users) yield /*88.36*/ {_display_(Seq[Any](format.raw/*88.38*/("""
                    """),format.raw/*89.21*/("""<tr>
                        <td>"""),_display_(/*90.30*/user/*90.34*/.getId()),format.raw/*90.42*/("""</td>
                        <td>
                            <a href=""""),_display_(/*92.39*/routes/*92.45*/.AuthorController.userEditPageAdmin(user.getId())),format.raw/*92.94*/("""">
                            """),_display_(/*93.30*/user/*93.34*/.getUserName()),format.raw/*93.48*/("""
                            """),format.raw/*94.29*/("""</a>
                        </td>
                        <td>"""),_display_(/*96.30*/user/*96.34*/.getFirstName()),format.raw/*96.49*/(""" """),_display_(/*96.51*/user/*96.55*/.getLastName()),format.raw/*96.69*/("""</td>
                        <td>"""),_display_(/*97.30*/user/*97.34*/.getEmail()),format.raw/*97.45*/("""</td>
                        <td>"""),_display_(/*98.30*/user/*98.34*/.getOrganization()),format.raw/*98.52*/("""</td>
                        <td>
                            """),_display_(/*100.30*/if(user.getUserType() == 4)/*100.57*/ {_display_(Seq[Any](format.raw/*100.59*/("""
                                """),format.raw/*101.33*/("""<span class="chip blue white-text">student</span>
                            """)))}),format.raw/*102.30*/("""
                            """),_display_(/*103.30*/if(user.getUserType() == 1)/*103.57*/ {_display_(Seq[Any](format.raw/*103.59*/("""
                                """),format.raw/*104.33*/("""<span class="chip green white-text">Researcher</span>
                            """)))}),format.raw/*105.30*/("""
                            """),_display_(/*106.30*/if(user.getUserType() == 2)/*106.57*/ {_display_(Seq[Any](format.raw/*106.59*/("""
                                """),format.raw/*107.33*/("""<span class="chip orange white-text">Sponsor</span>
                            """)))}),format.raw/*108.30*/("""
                        """),format.raw/*109.25*/("""</td>
                        <td>
                            <a href=""""),_display_(/*111.39*/routes/*111.45*/.AuthorController.userEditPageAdmin(user.getId())),format.raw/*111.94*/(""""
                            class="btn-small blue tooltipped" data-position="top" data-tooltip="check details">
                                <i class="material-icons">visibility</i>
                            </a>
                            """),_display_(/*115.30*/if(user.getIsActive() == "True")/*115.62*/ {_display_(Seq[Any](format.raw/*115.64*/("""
                                """),format.raw/*116.33*/("""<a href="#" class="btn-small red status-toggle tooltipped"
                                data-user-id=""""),_display_(/*117.48*/user/*117.52*/.getId()),format.raw/*117.60*/("""" data-new-status="False"
                                data-position="top" data-tooltip="inactivate users">
                                    <i class="material-icons">block</i>
                                </a>
                            """)))}/*121.31*/else/*121.36*/{_display_(Seq[Any](format.raw/*121.37*/("""
                                """),format.raw/*122.33*/("""<a href="#" class="btn-small green status-toggle tooltipped"
                                data-user-id=""""),_display_(/*123.48*/user/*123.52*/.getId()),format.raw/*123.60*/("""" data-new-status="True"
                                data-position="top" data-tooltip="Activate user">
                                    <i class="material-icons">check_circle</i>
                                </a>
                            """)))}),format.raw/*127.30*/("""
                        """),format.raw/*128.25*/("""</td>
                    </tr>
                """)))}),format.raw/*130.18*/("""
                """),format.raw/*131.17*/("""</tbody>
            </table>

                <!-- pagination -->
            """),_display_(/*135.14*/if(totalPages > 1)/*135.32*/ {_display_(Seq[Any](format.raw/*135.34*/("""
                """),format.raw/*136.17*/("""<div class="row">
                    <div class="col s12">
                        <ul class="pagination center-align">
                            """),_display_(/*139.30*/if(pageNum == 1)/*139.46*/ {_display_(Seq[Any](format.raw/*139.48*/("""
                                """),format.raw/*140.33*/("""<li class="waves-effect disabled">
                                    <i class="material-icons">chevron_left</i>
                                </li>
                            """)))}/*143.31*/else/*143.36*/{_display_(Seq[Any](format.raw/*143.37*/("""
                                """),format.raw/*144.33*/("""<li class="waves-effect">
                                    <a href=""""),_display_(/*145.47*/routes/*145.53*/.AdminController.userManagement(pageNum - 1, sortCriteria)),format.raw/*145.111*/("""">
                                        <i class="material-icons">chevron_left</i>
                                    </a>
                                </li>
                            """)))}),format.raw/*149.30*/("""

                            """),_display_(/*151.30*/for(i <- 1 to totalPages) yield /*151.55*/ {_display_(Seq[Any](format.raw/*151.57*/("""
                                """),_display_(/*152.34*/if(i == pageNum)/*152.50*/ {_display_(Seq[Any](format.raw/*152.52*/("""
                                    """),format.raw/*153.37*/("""<li class="active">
                                        <a href=""""),_display_(/*154.51*/routes/*154.57*/.AdminController.userManagement(i, sortCriteria)),format.raw/*154.105*/("""">"""),_display_(/*154.108*/i),format.raw/*154.109*/("""</a>
                                    </li>
                                """)))}/*156.35*/else/*156.40*/{_display_(Seq[Any](format.raw/*156.41*/("""
                                    """),format.raw/*157.37*/("""<li class="waves-effect">
                                        <a href=""""),_display_(/*158.51*/routes/*158.57*/.AdminController.userManagement(i, sortCriteria)),format.raw/*158.105*/("""">"""),_display_(/*158.108*/i),format.raw/*158.109*/("""</a>
                                    </li>
                                """)))}),format.raw/*160.34*/("""
                            """)))}),format.raw/*161.30*/("""

                            """),_display_(/*163.30*/if(pageNum == totalPages)/*163.55*/ {_display_(Seq[Any](format.raw/*163.57*/("""
                                """),format.raw/*164.33*/("""<li class="waves-effect disabled">
                                    <i class="material-icons">chevron_right</i>
                                </li>
                            """)))}/*167.31*/else/*167.36*/{_display_(Seq[Any](format.raw/*167.37*/("""
                                """),format.raw/*168.33*/("""<li class="waves-effect">
                                    <a href=""""),_display_(/*169.47*/routes/*169.53*/.AdminController.userManagement(pageNum + 1, sortCriteria)),format.raw/*169.111*/("""">
                                        <i class="material-icons">chevron_right</i>
                                    </a>
                                </li>
                            """)))}),format.raw/*173.30*/("""
                        """),format.raw/*174.25*/("""</ul>
                    </div>
                </div>
            """)))}),format.raw/*177.14*/("""

        """),format.raw/*179.9*/("""</div>
    </div>
""")))}))
      }
    }
  }

  def render(users:List[User],pageNum:Integer,sortCriteria:String,totalCount:Integer,totalPages:Integer): play.twirl.api.HtmlFormat.Appendable = apply(users,pageNum,sortCriteria,totalCount,totalPages)

  def f:((List[User],Integer,String,Integer,Integer) => play.twirl.api.HtmlFormat.Appendable) = (users,pageNum,sortCriteria,totalCount,totalPages) => apply(users,pageNum,sortCriteria,totalCount,totalPages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:40 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/userManagement.scala.html
                  HASH: e93a4e008802c793f32bb5109fcf192e805141d7
                  MATRIX: 1155->1|1329->106|1352->123|1380->141|1394->148|1474->152|1505->157|1605->230|1633->231|1678->248|1788->330|1817->331|1866->352|2074->532|2103->533|2156->558|2376->750|2405->751|2462->780|2534->824|2563->825|2646->880|2675->881|2732->910|2803->953|2832->954|2922->1016|2951->1017|3008->1046|3100->1110|3129->1111|3178->1132|3207->1133|3254->1152|3283->1153|3326->1168|3355->1169|3413->102|3442->139|3470->1187|3499->1190|3558->1240|3598->1242|3630->1247|4037->1627|4065->1634|4094->1635|4480->1994|4518->2023|4558->2025|4615->2054|4666->2087|4715->2127|4755->2129|4804->2150|4853->2181|4899->2218|4939->2220|4988->2241|5046->2268|5095->2289|5311->2478|5326->2484|5387->2524|5564->2674|5579->2680|5646->2726|5824->2877|5839->2883|5903->2926|6584->3580|6618->3598|6658->3600|6707->3621|6768->3655|6781->3659|6810->3667|6910->3740|6925->3746|6995->3795|7054->3827|7067->3831|7102->3845|7159->3874|7250->3938|7263->3942|7299->3957|7328->3959|7341->3963|7376->3977|7438->4012|7451->4016|7483->4027|7545->4062|7558->4066|7597->4084|7689->4148|7726->4175|7767->4177|7829->4210|7940->4289|7998->4319|8035->4346|8076->4348|8138->4381|8253->4464|8311->4494|8348->4521|8389->4523|8451->4556|8564->4637|8618->4662|8719->4735|8735->4741|8806->4790|9083->5039|9125->5071|9166->5073|9228->5106|9362->5212|9376->5216|9406->5224|9675->5474|9689->5479|9729->5480|9791->5513|9927->5621|9941->5625|9971->5633|10255->5885|10309->5910|10390->5959|10436->5976|10544->6056|10572->6074|10613->6076|10659->6093|10837->6243|10863->6259|10904->6261|10966->6294|11167->6476|11181->6481|11221->6482|11283->6515|11383->6587|11399->6593|11480->6651|11706->6845|11765->6876|11807->6901|11848->6903|11910->6937|11936->6953|11977->6955|12043->6992|12141->7062|12157->7068|12228->7116|12260->7119|12284->7120|12384->7201|12398->7206|12438->7207|12504->7244|12608->7320|12624->7326|12695->7374|12727->7377|12751->7378|12863->7458|12925->7488|12984->7519|13019->7544|13060->7546|13122->7579|13324->7762|13338->7767|13378->7768|13440->7801|13540->7873|13556->7879|13637->7937|13864->8132|13918->8157|14019->8226|14057->8236
                  LINES: 35->1|38->4|39->5|41->7|41->7|43->7|44->8|45->9|45->9|46->10|48->12|48->12|49->13|53->17|53->17|54->18|57->21|57->21|58->22|59->23|59->23|60->24|60->24|61->25|62->26|62->26|63->27|63->27|64->28|65->29|65->29|66->30|66->30|67->31|67->31|68->32|68->32|71->1|74->6|75->34|77->36|77->36|77->36|78->37|91->50|91->50|91->50|96->55|96->55|96->55|97->56|98->57|98->57|98->57|99->58|100->59|100->59|100->59|101->60|102->61|103->62|107->66|107->66|107->66|109->68|109->68|109->68|111->70|111->70|111->70|129->88|129->88|129->88|130->89|131->90|131->90|131->90|133->92|133->92|133->92|134->93|134->93|134->93|135->94|137->96|137->96|137->96|137->96|137->96|137->96|138->97|138->97|138->97|139->98|139->98|139->98|141->100|141->100|141->100|142->101|143->102|144->103|144->103|144->103|145->104|146->105|147->106|147->106|147->106|148->107|149->108|150->109|152->111|152->111|152->111|156->115|156->115|156->115|157->116|158->117|158->117|158->117|162->121|162->121|162->121|163->122|164->123|164->123|164->123|168->127|169->128|171->130|172->131|176->135|176->135|176->135|177->136|180->139|180->139|180->139|181->140|184->143|184->143|184->143|185->144|186->145|186->145|186->145|190->149|192->151|192->151|192->151|193->152|193->152|193->152|194->153|195->154|195->154|195->154|195->154|195->154|197->156|197->156|197->156|198->157|199->158|199->158|199->158|199->158|199->158|201->160|202->161|204->163|204->163|204->163|205->164|208->167|208->167|208->167|209->168|210->169|210->169|210->169|214->173|215->174|218->177|220->179
                  -- GENERATED --
              */
          