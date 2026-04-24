
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

object bugReportList extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template11[List[BugReport],String,Long,Long,Integer,Integer,Integer,Integer,Integer,Integer,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(bugReports: List[BugReport], userEmail: String, userId: Long, pageNum: Long, offset: Integer,
        total: Integer,
        count: Integer, pageLimit: Integer, beginIndexForPagination: Integer, endIndexForPagination: Integer, sort: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*5.2*/import helper._

def /*6.2*/scripts/*6.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.13*/("""
    """),format.raw/*7.5*/("""<script type="text/javascript">
    </script>
""")))};
Seq[Any](format.raw/*3.124*/("""

"""),format.raw/*9.2*/("""

"""),_display_(/*11.2*/main("Bug Reports", scripts)/*11.30*/ {_display_(Seq[Any](format.raw/*11.32*/("""
    """),format.raw/*12.5*/("""<div class="container">
    """),_display_(/*13.6*/if(bugReports == null || bugReports.size() == 0)/*13.54*/ {_display_(Seq[Any](format.raw/*13.56*/("""
        """),format.raw/*14.9*/("""<div class="row">
            <div class="col s12">
                <div class="card-panel">
                    <h5 class="center">No Bugs Has Been Reported Yet :)</h5>
                </div>
            </div>
        </div>
    """)))}/*21.7*/else/*21.12*/{_display_(Seq[Any](format.raw/*21.13*/("""
        """),format.raw/*22.9*/("""<div class="card-panel">
            <div class="row card-panel z-depth-0 project-zone-panel">
                <div class="col s12" style="margin-top: -10px;
                    margin-bottom: -10px;">
                    <h6 class="center tooltipped" data-position="bottom" data-tooltip="This list shows all the bug reports." >
                        Bug Reports Registered at SMU-Lyle-Sci-Hub
                    </h6>
                </div>
            </div>
            <h4 class="center">Bug Reports</h4>
            <div class="row">
                <div class="col s6">
                    <h6 class="left">Showing results: """),_display_(/*34.56*/{
                        offset + 1
                    }),format.raw/*36.22*/(""" """),format.raw/*36.23*/("""to """),_display_(/*36.27*/{
                        offset + count
                    }),format.raw/*38.22*/(""" """),format.raw/*38.23*/("""of """),_display_(/*38.27*/total),format.raw/*38.32*/("""</h6>
                </div>
                <div class="col s6" style="padding-top: -5px;
                    margin-top: -2px">
                    <a class='dropdown-trigger btn-flat right' href='#' data-target='dropdown11' style="text-transform: none;
                        font-weight: bold;
                        color: black;
                        font-family: AmazonEmberBold, Helvetica Neue Bold, Helvetica Neue, Helvetica, Arial, sans-serif;
                    !important; ">
                        Sort By &nbsp; <font color="#3a5dc3">
                        """),_display_(/*48.26*/if(sort.equals("date_created") || sort.equals("publish_time_stamp"))/*48.94*/ {_display_(Seq[Any](format.raw/*48.96*/("""
                            """),format.raw/*49.29*/("""Date Created
                        """)))}/*50.26*/else if(sort.equals("title"))/*50.55*/{_display_(Seq[Any](format.raw/*50.56*/("""
                    """),format.raw/*51.21*/("""Title
                    """)))}/*52.22*/else/*52.27*/{_display_(Seq[Any](format.raw/*52.28*/("""
                    """),format.raw/*53.21*/("""Reporter Name
                    """)))}),format.raw/*54.22*/("""</font><i class="material-icons right">expand_more</i></a>

                        <!-- Dropdown Structure -->
                    <ul id='dropdown11' class='dropdown-content'>

                        <li><a href=""""),_display_(/*59.39*/routes/*59.45*/.BugReportController.bugReportList(1, "date_created")),format.raw/*59.98*/("""" class="grey-text text-darken-4"><i class="material-icons">
                            event</i>Date Created</a></li>
                        <li><a href=""""),_display_(/*61.39*/routes/*61.45*/.BugReportController.bugReportList(1, "title")),format.raw/*61.91*/("""" class="grey-text text-darken-4"><i class="material-icons">
                            sort_by_alpha</i>Title </a></li>
                        <li><a href=""""),_display_(/*63.39*/routes/*63.45*/.BugReportController.bugReportList(1, "reporter_name")),format.raw/*63.99*/("""" class="grey-text text-darken-4"><i class="material-icons">
                            star_rate</i>Reporter Name </a></li>

                    </ul>
                </div>
            </div>
            <div class="card-panel z-depth-0">
                <table class="striped centered responsive-table" id ="postsTable">
                    <thead>
                        <tr class="info">
                            <th style = "cursor: pointer;">Id</th>
                            <th style = "cursor: pointer;">Bug Title</th>
                            <th style = "cursor: pointer;">Reporter Name</th>
                            <th style = "cursor: pointer;">Reporter Organization</th>
                            <th style = "cursor: pointer;">Bug Content</th>
                            <th style = "cursor: pointer;">Report Time</th>
                            <th style = "cursor: pointer;">Solved Time</th>
                            """),format.raw/*80.78*/("""
                            """),format.raw/*81.29*/("""<th style = "vertical-align: top;">Operation</th>

                        </tr>
                    </thead>
                    <tbody>
                    """),_display_(/*86.22*/for(bugReport <- bugReports) yield /*86.50*/ {_display_(Seq[Any](format.raw/*86.52*/("""
                        """),format.raw/*87.25*/("""<tr>
                            <td style="word-wrap: break-word;">
                                """),format.raw/*96.78*/("""
                                """),_display_(/*97.34*/bugReport/*97.43*/.getId()),format.raw/*97.51*/("""
                            """),format.raw/*98.29*/("""</td>

                            </td>
                            """),_display_(/*101.30*/if(session.get("level") == "admin" || session.get("level") == "developer" || bugReport.getReporter.getEmail().equals(userEmail))/*101.158*/ {_display_(Seq[Any](format.raw/*101.160*/("""
                                """),format.raw/*102.33*/("""<td style="word-wrap: break-word;"><a href = """"),_display_(/*102.80*/routes/*102.86*/.BugReportController.bugReportDetail(bugReport.getId())),format.raw/*102.141*/("""">"""),_display_(/*102.144*/bugReport/*102.153*/.getTitle()),format.raw/*102.164*/("""</a></td>
                            """)))}/*103.31*/else/*103.36*/{_display_(Seq[Any](format.raw/*103.37*/("""
                                """),format.raw/*104.33*/("""<td style="word-wrap: break-word;">"""),_display_(/*104.69*/bugReport/*104.78*/.getTitle()),format.raw/*104.89*/("""</td>
                            """)))}),format.raw/*105.30*/("""

                            """),format.raw/*107.29*/("""<td style="word-wrap: break-word;">
                            """),_display_(/*108.30*/bugReport/*108.39*/.getReporter.getUserName()),format.raw/*108.65*/("""
                            """),format.raw/*109.29*/("""</td>

                            <td style="word-wrap: break-word;">
                            """),_display_(/*112.30*/if(bugReport.getReporter.getOrganization != "")/*112.77*/ {_display_(Seq[Any](format.raw/*112.79*/("""
                                """),_display_(/*113.34*/bugReport/*113.43*/.getReporter.getOrganization()),format.raw/*113.73*/("""
                            """)))}/*114.31*/else/*114.36*/{_display_(Seq[Any](format.raw/*114.37*/("""
                                """),format.raw/*115.33*/("""-
                            """)))}),format.raw/*116.30*/("""
                            """),format.raw/*117.29*/("""</td>
                            <td style="word-wrap: break-word;">
                            """),_display_(/*119.30*/if(bugReport.getDescription != "")/*119.64*/ {_display_(Seq[Any](format.raw/*119.66*/("""
                                """),format.raw/*120.33*/("""<div class="tooltip"> """),_display_(/*120.56*/bugReport/*120.65*/.getTruncDescription()),format.raw/*120.87*/("""
                                    """),format.raw/*121.37*/("""<span class="tooltiptext"> """),_display_(/*121.65*/bugReport/*121.74*/.getDescription()),format.raw/*121.91*/("""</span>
                                </div>
                            """)))}/*123.31*/else/*123.36*/{_display_(Seq[Any](format.raw/*123.37*/("""
                                """),format.raw/*124.33*/("""-
                            """)))}),format.raw/*125.30*/("""
                            """),format.raw/*126.29*/("""</td>
                            <td>
                                """),_display_(/*128.34*/bugReport/*128.43*/.getCreateTime()),format.raw/*128.59*/(""" """),format.raw/*128.60*/("""GMT
                            </td>
                            <td>
                            """),_display_(/*131.30*/if((bugReport.getSolveTime()!=null) && (bugReport.getSolveTime() != ""))/*131.102*/ {_display_(Seq[Any](format.raw/*131.104*/("""
                                """),_display_(/*132.34*/bugReport/*132.43*/.getSolveTime()),format.raw/*132.58*/(""" """),format.raw/*132.59*/("""GMT
                            """)))}/*133.31*/else/*133.36*/{_display_(Seq[Any](format.raw/*133.37*/("""
                                """),format.raw/*134.33*/("""Not Solved Yet.
                            """)))}),format.raw/*135.30*/("""
                            """),format.raw/*136.29*/("""</td>
                            """),format.raw/*137.37*/("""
                            """),format.raw/*138.55*/("""
                            """),format.raw/*139.38*/("""
                            """),format.raw/*140.29*/("""<td>
                            """),_display_(/*141.30*/if(bugReport.getReporter.getEmail().equals(userEmail))/*141.84*/ {_display_(Seq[Any](format.raw/*141.86*/("""
                                """),format.raw/*142.33*/("""<div class="input-group input-group-sm">
                                    """),_display_(/*143.38*/if(bugReport.getSolved() == 0)/*143.68*/ {_display_(Seq[Any](format.raw/*143.70*/("""
                                        """),format.raw/*144.41*/("""<span>
                                            <a class="btn waves-effect waves-light blue darken-2 modal-trigger" title="Delete" href="#warningModal2">
                                                Solved?</a>

                                                <!-- Inactive Warning Modal Structure -->
                                            <div id="warningModal2" class="modal">
                                                <div class="modal-content" style="text-align: left">
                                                    <h5 style="color: red">Warning</h5>
                                                    <p style="font-weight: bold">
                                                        Do you really want to mark this bug report as solved: """),_display_(/*153.112*/bugReport/*153.121*/.getTitle),format.raw/*153.130*/(""" """),format.raw/*153.131*/("""?
                                                    </p>
                                                </div>
                                                <div class="modal-footer">
                                                    <a href="#!" class="modal-close waves-effect waves-green btn-flat">
                                                        Cancel</a>
                                                    <a href='"""),_display_(/*159.63*/routes/*159.69*/.BugReportController.markAsSolved(bugReport.getId, userId)),format.raw/*159.127*/("""'
                                                    class="modal-close waves-effect waves-green btn-flat">
                                                        Confirm</a>
                                                </div>
                                            </div>
                                        </span>
                                    """)))}),format.raw/*165.38*/("""
                                    """),format.raw/*166.37*/("""<span>
                                        <a class="btn waves-effect waves-light red modal-trigger" title="Delete" style="margin-top: 5px;" href="#warningModal">
                                            Delete</a>

                                            <!-- Inactive Warning Modal Structure -->
                                        <div id="warningModal" class="modal">
                                            <div class="modal-content" style="text-align: left">
                                                <h5 style="color: red">Warning</h5>
                                                <p style="font-weight: bold">
                                                    Do you really want to delete this bug report: """),_display_(/*175.100*/bugReport/*175.109*/.getTitle),format.raw/*175.118*/(""" """),format.raw/*175.119*/("""?
                                                    Please note that after deletion, this  bug report <span style="color: red">
                                                    CANNOT</span> be recovered.</p>
                                            </div>
                                            <div class="modal-footer">
                                                <a href="#!" class="modal-close waves-effect waves-green btn-flat">
                                                    Cancel</a>
                                                <a href='"""),_display_(/*182.59*/routes/*182.65*/.BugReportController.bugReportDelete(bugReport.getId)),format.raw/*182.118*/("""'
                                                class="modal-close waves-effect waves-green btn-flat">
                                                    Confirm</a>
                                            </div>
                                        </div>
                                    </span>
                                </div>
                            """)))}/*189.31*/else/*189.36*/{_display_(Seq[Any](format.raw/*189.37*/("""
                                """),format.raw/*190.33*/("""<div>-</div>
                            """)))}),format.raw/*191.30*/("""
                            """),format.raw/*192.29*/("""</td>
                        </tr>
                    """)))}),format.raw/*194.22*/("""
                    """),format.raw/*195.21*/("""</tbody>
                </table>

                """),_display_(/*198.18*/if(bugReports.size != 0)/*198.42*/ {_display_(Seq[Any](format.raw/*198.44*/("""
                    """),format.raw/*199.21*/("""<div class="row">
                        <div class="col s12">
                            <ul class="pagination center-align">
                                """),_display_(/*202.34*/if(pageNum == 1)/*202.50*/ {_display_(Seq[Any](format.raw/*202.52*/("""
                                    """),format.raw/*203.37*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                        first_page</i></li>
                                    <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                        chevron_left</i></li>
                                """)))}/*207.35*/else/*207.40*/{_display_(Seq[Any](format.raw/*207.41*/("""
                                    """),format.raw/*208.37*/("""<li class="waves-effect"><a href=""""),_display_(/*208.72*/routes/*208.78*/.BugReportController.bugReportList(1, sort)),format.raw/*208.121*/(""""><i class="material-icons">
                                        first_page</i></a></li>
                                    </li>
                                    <li class="waves-effect"><a href=""""),_display_(/*211.72*/routes/*211.78*/.BugReportController.bugReportList(pageNum - 1, sort)),format.raw/*211.131*/(""""><i class="material-icons">
                                        chevron_left</i></a></li>
                                """)))}),format.raw/*213.34*/("""
                                """),_display_(/*214.34*/if(beginIndexForPagination > 1)/*214.65*/ {_display_(Seq[Any](format.raw/*214.67*/("""
                                    """),format.raw/*215.37*/("""<li class="waves-effect disabled" style="cursor: default;
                                        font-size: 20px;
                                        font-weight: bold">...</li>
                                """)))}),format.raw/*218.34*/("""
                                """),_display_(/*219.34*/for(i <- (beginIndexForPagination + 0) to (endIndexForPagination + 0)) yield /*219.104*/ {_display_(Seq[Any](format.raw/*219.106*/("""
                                    """),format.raw/*220.37*/("""<li """),_display_(/*220.42*/if(pageNum == i)/*220.58*/ {_display_(Seq[Any](format.raw/*220.60*/("""
                                        """),format.raw/*221.41*/("""class="active"""")))}),format.raw/*221.56*/("""><a href=""""),_display_(/*221.67*/routes/*221.73*/.BugReportController.bugReportList(i, sort)),format.raw/*221.116*/("""">"""),_display_(/*221.119*/i),format.raw/*221.120*/("""</a></li>
                                """)))}),format.raw/*222.34*/("""
                                """),_display_(/*223.34*/if(endIndexForPagination < ((total - 1) / pageLimit + 1))/*223.91*/ {_display_(Seq[Any](format.raw/*223.93*/("""
                                    """),format.raw/*224.37*/("""<li class="waves-effect disabled" style="cursor: default;
                                        font-size: 20px;
                                        font-weight: bold">...</li>
                                """)))}),format.raw/*227.34*/("""
                                """),_display_(/*228.34*/if((offset + count) >= total)/*228.63*/ {_display_(Seq[Any](format.raw/*228.65*/("""
                                    """),format.raw/*229.37*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                        chevron_right</i></li>
                                    <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                        last_page</i></li>
                                """)))}/*233.35*/else/*233.40*/{_display_(Seq[Any](format.raw/*233.41*/("""
                                    """),format.raw/*234.37*/("""<li class="waves-effect"><a href=""""),_display_(/*234.72*/routes/*234.78*/.BugReportController.bugReportList(pageNum + 1, sort)),format.raw/*234.131*/(""""><i class="material-icons">
                                        chevron_right</i></a></li>
                                    <li class="waves-effect"><a href=""""),_display_(/*236.72*/routes/*236.78*/.BugReportController.bugReportList((total - 1) / pageLimit + 1, sort)),format.raw/*236.147*/(""""><i class="material-icons">
                                        last_page</i></a></li>
                                """)))}),format.raw/*238.34*/("""
                            """),format.raw/*239.29*/("""</ul>
                        </div>
                    </div>
                """)))}),format.raw/*242.18*/("""
            """),format.raw/*243.13*/("""</div>
        </div>
    </div>
""")))}),format.raw/*246.2*/("""
    """),format.raw/*247.5*/("""</div>
""")))}))
      }
    }
  }

  def render(bugReports:List[BugReport],userEmail:String,userId:Long,pageNum:Long,offset:Integer,total:Integer,count:Integer,pageLimit:Integer,beginIndexForPagination:Integer,endIndexForPagination:Integer,sort:String): play.twirl.api.HtmlFormat.Appendable = apply(bugReports,userEmail,userId,pageNum,offset,total,count,pageLimit,beginIndexForPagination,endIndexForPagination,sort)

  def f:((List[BugReport],String,Long,Long,Integer,Integer,Integer,Integer,Integer,Integer,String) => play.twirl.api.HtmlFormat.Appendable) = (bugReports,userEmail,userId,pageNum,offset,total,count,pageLimit,beginIndexForPagination,endIndexForPagination,sort) => apply(bugReports,userEmail,userId,pageNum,offset,total,count,pageLimit,beginIndexForPagination,endIndexForPagination,sort)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:29 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/bugReportList.scala.html
                  HASH: a8410951f2e5ade416c28b25e97afc283d9c4a5e
                  MATRIX: 1201->1|1516->246|1544->263|1558->270|1638->274|1669->279|1756->243|1784->326|1813->329|1850->357|1890->359|1922->364|1977->393|2034->441|2074->443|2110->452|2360->685|2373->690|2412->691|2448->700|3109->1334|3188->1392|3217->1393|3248->1397|3331->1459|3360->1460|3391->1464|3417->1469|4024->2049|4101->2117|4141->2119|4198->2148|4255->2186|4293->2215|4332->2216|4381->2237|4427->2264|4440->2269|4479->2270|4528->2291|4594->2326|4838->2543|4853->2549|4927->2602|5112->2760|5127->2766|5194->2812|5381->2972|5396->2978|5471->3032|6455->4037|6512->4066|6698->4225|6742->4253|6782->4255|6835->4280|6964->4993|7025->5027|7043->5036|7072->5044|7129->5073|7227->5143|7366->5271|7408->5273|7470->5306|7545->5353|7561->5359|7639->5414|7671->5417|7691->5426|7725->5437|7784->5477|7798->5482|7838->5483|7900->5516|7964->5552|7983->5561|8016->5572|8083->5607|8142->5637|8235->5702|8254->5711|8302->5737|8360->5766|8488->5866|8545->5913|8586->5915|8648->5949|8667->5958|8719->5988|8769->6019|8783->6024|8823->6025|8885->6058|8948->6089|9006->6118|9133->6217|9177->6251|9218->6253|9280->6286|9331->6309|9350->6318|9394->6340|9460->6377|9516->6405|9535->6414|9574->6431|9670->6508|9684->6513|9724->6514|9786->6547|9849->6578|9907->6607|10007->6679|10026->6688|10064->6704|10094->6705|10222->6805|10305->6877|10347->6879|10409->6913|10428->6922|10465->6937|10495->6938|10548->6972|10562->6977|10602->6978|10664->7011|10741->7056|10799->7085|10862->7127|10920->7182|10978->7220|11036->7249|11098->7283|11162->7337|11203->7339|11265->7372|11371->7450|11411->7480|11452->7482|11522->7523|12324->8296|12344->8305|12376->8314|12407->8315|12873->8753|12889->8759|12970->8817|13370->9185|13436->9222|14210->9967|14230->9976|14262->9985|14293->9986|14894->10559|14910->10565|14986->10618|15385->10998|15399->11003|15439->11004|15501->11037|15575->11079|15633->11108|15722->11165|15772->11186|15852->11238|15886->11262|15927->11264|15977->11285|16167->11447|16193->11463|16234->11465|16300->11502|16681->11864|16695->11869|16735->11870|16801->11907|16864->11942|16880->11948|16946->11991|17180->12197|17196->12203|17272->12256|17432->12384|17494->12418|17535->12449|17576->12451|17642->12488|17890->12704|17952->12738|18040->12808|18082->12810|18148->12847|18181->12852|18207->12868|18248->12870|18318->12911|18365->12926|18404->12937|18420->12943|18486->12986|18518->12989|18542->12990|18617->13033|18679->13067|18746->13124|18787->13126|18853->13163|19101->13379|19163->13413|19202->13442|19243->13444|19309->13481|19690->13843|19704->13848|19744->13849|19810->13886|19873->13921|19889->13927|19965->13980|20160->14147|20176->14153|20268->14222|20425->14347|20483->14376|20596->14457|20638->14470|20703->14504|20736->14509
                  LINES: 35->1|40->5|42->6|42->6|44->6|45->7|48->3|50->9|52->11|52->11|52->11|53->12|54->13|54->13|54->13|55->14|62->21|62->21|62->21|63->22|75->34|77->36|77->36|77->36|79->38|79->38|79->38|79->38|89->48|89->48|89->48|90->49|91->50|91->50|91->50|92->51|93->52|93->52|93->52|94->53|95->54|100->59|100->59|100->59|102->61|102->61|102->61|104->63|104->63|104->63|121->80|122->81|127->86|127->86|127->86|128->87|130->96|131->97|131->97|131->97|132->98|135->101|135->101|135->101|136->102|136->102|136->102|136->102|136->102|136->102|136->102|137->103|137->103|137->103|138->104|138->104|138->104|138->104|139->105|141->107|142->108|142->108|142->108|143->109|146->112|146->112|146->112|147->113|147->113|147->113|148->114|148->114|148->114|149->115|150->116|151->117|153->119|153->119|153->119|154->120|154->120|154->120|154->120|155->121|155->121|155->121|155->121|157->123|157->123|157->123|158->124|159->125|160->126|162->128|162->128|162->128|162->128|165->131|165->131|165->131|166->132|166->132|166->132|166->132|167->133|167->133|167->133|168->134|169->135|170->136|171->137|172->138|173->139|174->140|175->141|175->141|175->141|176->142|177->143|177->143|177->143|178->144|187->153|187->153|187->153|187->153|193->159|193->159|193->159|199->165|200->166|209->175|209->175|209->175|209->175|216->182|216->182|216->182|223->189|223->189|223->189|224->190|225->191|226->192|228->194|229->195|232->198|232->198|232->198|233->199|236->202|236->202|236->202|237->203|241->207|241->207|241->207|242->208|242->208|242->208|242->208|245->211|245->211|245->211|247->213|248->214|248->214|248->214|249->215|252->218|253->219|253->219|253->219|254->220|254->220|254->220|254->220|255->221|255->221|255->221|255->221|255->221|255->221|255->221|256->222|257->223|257->223|257->223|258->224|261->227|262->228|262->228|262->228|263->229|267->233|267->233|267->233|268->234|268->234|268->234|268->234|270->236|270->236|270->236|272->238|273->239|276->242|277->243|280->246|281->247
                  -- GENERATED --
              */
          