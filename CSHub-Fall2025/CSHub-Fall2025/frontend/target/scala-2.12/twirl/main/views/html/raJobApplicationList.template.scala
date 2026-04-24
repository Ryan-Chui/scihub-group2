
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
/*1.2*/import java.util

object raJobApplicationList extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template12[util.List[RAJobApplication],Integer,String,Integer,Integer,Integer,String,Integer,String,Long,Integer,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(entries: util.List[RAJobApplication],
        pageNum: Integer,
        sort: String,
        offset: Integer,
        total: Integer,
        count: Integer,
        listType: String,
        pageLimit: Integer,
        searchBody: String,
        userId: Long,
        beginIndexForPagination: Integer,
        endIndexForPagination: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*14.2*/import helper._

def /*16.2*/scripts/*16.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*16.13*/("""
    """),format.raw/*17.5*/("""<script type = "module" src='"""),_display_(/*17.35*/routes/*17.41*/.Assets.at("javascripts/voiceJump.js")),format.raw/*17.79*/("""'></script>
    <script type="text/javascript">
            $(document).ready(function () """),format.raw/*19.43*/("""{"""),format.raw/*19.44*/("""
                """),format.raw/*20.17*/("""var nasaEndorsedAPIArray = []
                """),_display_(/*21.18*/for(i <- 0 until entries.size) yield /*21.48*/ {_display_(Seq[Any](format.raw/*21.50*/("""
                """),format.raw/*22.17*/("""var json = """),format.raw/*22.28*/("""{"""),format.raw/*22.29*/("""}"""),format.raw/*22.30*/(""";
                json.id = '"""),_display_(/*23.29*/entries/*23.36*/.get(i).getId()),format.raw/*23.51*/("""';
                json.url = "/user/userDetailPage/" + json.id;

                """),format.raw/*26.154*/("""
                """),format.raw/*27.17*/("""console.log("jsonhere:" + json)
                nasaEndorsedAPIArray.push(json)
                """)))}),format.raw/*29.18*/("""
                """),format.raw/*30.17*/("""$("#nasaText").text(JSON.stringify(nasaEndorsedAPIArray));

                $('.tooltipped').tooltip();
            """),format.raw/*33.13*/("""}"""),format.raw/*33.14*/(""");

            function jumpToPage(pageNum, sort, searchString) """),format.raw/*35.62*/("""{"""),format.raw/*35.63*/("""
                """),format.raw/*36.17*/("""pageNum = Math.floor(pageNum);
                var url = "/user/searchPOST?pageNum=" + (pageNum) + "&sortCriteria=" + sort;
                var form = $(document.createElement('form'));
                $(form).attr("action", url);
                $(form).attr("method", "POST");
                $(form).css("display", "none");


                var form_searchString = $("<input>")
                        .attr("type", "text")
                        .attr("name", "searchString")
                        .val(searchString);
                $(form).append($(form_searchString));

                form.appendTo(document.body);
                $(form).submit();
            """),format.raw/*52.13*/("""}"""),format.raw/*52.14*/("""


            """),format.raw/*55.76*/("""

            """),format.raw/*57.13*/("""function changeView(view) """),format.raw/*57.39*/("""{"""),format.raw/*57.40*/("""
                """),format.raw/*58.17*/("""$.ajax("""),format.raw/*58.24*/("""{"""),format.raw/*58.25*/("""
                    """),format.raw/*59.21*/("""url: "/updateProjectZone/" + view,
                    headers: """),format.raw/*60.30*/("""{"""),format.raw/*60.31*/("""
                        """),format.raw/*61.25*/("""'Content-Type': 'application/json'
                    """),format.raw/*62.21*/("""}"""),format.raw/*62.22*/(""",
                    type: "GET"
                """),format.raw/*64.17*/("""}"""),format.raw/*64.18*/(""").done(function (data) """),format.raw/*64.41*/("""{"""),format.raw/*64.42*/("""
                    """),format.raw/*65.21*/("""window.location.href = "/user/userList/1?sortCriteria=id";
                """),format.raw/*66.17*/("""}"""),format.raw/*66.18*/(""");
            """),format.raw/*67.13*/("""}"""),format.raw/*67.14*/("""
    """),format.raw/*68.5*/("""</script>
    <style>
            .follow-fab """),format.raw/*70.25*/("""{"""),format.raw/*70.26*/("""
                """),format.raw/*71.17*/("""top: -20px !important;
                bottom: auto !important;
                right: -20px !important;
            """),format.raw/*74.13*/("""}"""),format.raw/*74.14*/("""
    """),format.raw/*75.5*/("""</style>
""")))};
Seq[Any](format.raw/*13.40*/("""
"""),format.raw/*15.1*/("""
"""),format.raw/*76.2*/("""

"""),_display_(/*78.2*/main("RA Job Applications", scripts)/*78.38*/ {_display_(Seq[Any](format.raw/*78.40*/("""
    """),format.raw/*79.5*/("""<div class="container">
        <div class="row">
            <div class="col s12 m10 offset-m1">
                <div class="card-panel center">
                    """),_display_(/*83.22*/if(entries.size() > 0)/*83.44*/ {_display_(Seq[Any](format.raw/*83.46*/("""
                        """),format.raw/*84.25*/("""<div class="col s8 offset-s2">
                            <h4>RA Job Applications</h4>

                        </div>
                        <div class="col s2">
                            <button id = "speak-from-filter" hidden></button>

                            <div id="nasaText" hidden></div>
                            <div id="requestField"></div>
                            <div id="replyField"></div>
                        </div>
                        <div class="row">
                            <div class="col s6">
                                <h6 class="left">Showing results: """),_display_(/*97.68*/{
                                    offset + 1
                                }),format.raw/*99.34*/(""" """),format.raw/*99.35*/("""to """),_display_(/*99.39*/{
                                    offset + count
                                }),format.raw/*101.34*/(""" """),format.raw/*101.35*/("""of """),_display_(/*101.39*/total),format.raw/*101.44*/("""</h6>
                            </div>
                            <div class="col s6" style="padding-top: -5px;
                                margin-top: -2px">
                                <a class='dropdown-trigger btn-flat right' href='#' data-target='dropdown2' style="text-transform: none;
                                    font-weight: bold;
                                    color: black;
                                    font-family: AmazonEmberBold, Helvetica Neue Bold, Helvetica Neue, Helvetica, Arial, sans-serif;
                                !important; ">
                                    Sort By: &nbsp; <font color="#3a5dc3">
                                """),_display_(/*111.34*/if(sort.equals("id"))/*111.55*/ {_display_(Seq[Any](format.raw/*111.57*/("""
                                    """),format.raw/*112.37*/("""Job Application ID
                                """)))}),format.raw/*113.34*/(""" """),format.raw/*113.35*/("""</font> <i class="material-icons right">expand_more</i></a>

                                    <!-- Dropdown Structure -->
                                <ul id='dropdown2' class='dropdown-content'>
                                    <li>
                                        <a onclick="jumpToPage(1, 'id', '"""),_display_(/*118.75*/searchBody),format.raw/*118.85*/("""')">
                                            <i class="material-icons">event</i>Date Created
                                        </a>
                                    </li>
                                </ul>
                            </div>
                        </div>
                        <table class="centered responsive-table striped" id="userTable" >
                            <thead>
                                <tr class="list-header" style="border-bottom: 1px solid;
                                !important;">
                                    <th style="cursor: pointer;">#</th>
                                    <th style="cursor: pointer;">Applicant First Name</th>
                                    <th style="cursor: pointer;">Applicant Last Name</th>
                                    <th style="cursor: pointer;">Organization</th>
                                    <th style="cursor: pointer;">Applicant Type</th>
                                    <th style="cursor: pointer;">Applicant Status</th>
                                    <th style="cursor: pointer;">Applied Time</th>
                                    <th style="cursor: pointer;">Operations</th>
                                </tr>
                            </thead>
                            <tbody>
                            """),_display_(/*140.30*/for((entry, index) <- entries.zipWithIndex) yield /*140.73*/ {_display_(Seq[Any](format.raw/*140.75*/("""
                                """),format.raw/*141.33*/("""<tr>
                                    <td><a href=""""),_display_(/*142.51*/routes/*142.57*/.RAJobController.rajobApplicationDetail(entry.getId())),format.raw/*142.111*/("""">"""),_display_(/*142.114*/(index + 1)),format.raw/*142.125*/("""</a></td>
                                    <td>"""),_display_(/*143.42*/entry/*143.47*/.getApplicant().getFirstName()),format.raw/*143.77*/("""</td>
                                    <td>"""),_display_(/*144.42*/entry/*144.47*/.getApplicant().getLastName()),format.raw/*144.76*/("""</td>
                                    <td>"""),_display_(/*145.42*/entry/*145.47*/.getApplicant().getOrganization()),format.raw/*145.80*/("""</td>
                                    <td>"""),_display_(/*146.42*/entry/*146.47*/.getApplicantTypeInfo()),format.raw/*146.70*/("""</td>
                                    """),_display_(/*147.38*/if(entry.getStatus() == "open")/*147.69*/ {_display_(Seq[Any](format.raw/*147.71*/("""
                                        """),format.raw/*148.41*/("""<td>
                                            <span class="new badge light-green darken-1" data-badge-caption="open"></span>
                                        </td>
                                    """)))}/*151.39*/else if(entry.getStatus() == "pending")/*151.78*/{_display_(Seq[Any](format.raw/*151.79*/("""
                                    """),format.raw/*152.37*/("""<td>
                                        <span class="new badge purple darken-1" data-badge-caption="pending"></span>
                                    </td>
                                    """)))}/*155.38*/else if(entry.getStatus() == "closed")/*155.76*/{_display_(Seq[Any](format.raw/*155.77*/("""
                                    """),format.raw/*156.37*/("""<td>
                                        <span class="new badge grey darken-3" data-badge-caption="closed"></span>
                                    </td>
                                    """)))}/*159.38*/else/*159.43*/{_display_(Seq[Any](format.raw/*159.44*/("""
                                    """),format.raw/*160.37*/("""<td>&ensp; -</td>
                                    """)))}),format.raw/*161.38*/("""
                                    """),format.raw/*162.37*/("""<td>"""),_display_(/*162.42*/entry/*162.47*/.getCreatedTime()),format.raw/*162.64*/("""</td>
                                    <td><a href=""""),_display_(/*163.51*/routes/*163.57*/.RAJobController.rajobApplicationDetail(entry.getId())),format.raw/*163.111*/("""">View Details</a></td>
                                </tr>
                            """)))}),format.raw/*165.30*/("""
                            """),format.raw/*166.29*/("""</tbody>
                        </table>

                        <div class="row">
                            <div class="col s12">
                                <ul class="pagination center-align">
                                    """),_display_(/*172.38*/if(pageNum == 1)/*172.54*/ {_display_(Seq[Any](format.raw/*172.56*/("""
                                        """),format.raw/*173.41*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                            first_page</i></li>
                                        <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                            chevron_left</i></li>
                                    """)))}/*177.39*/else/*177.44*/{_display_(Seq[Any](format.raw/*177.45*/("""
                                        """),format.raw/*178.41*/("""<li class="waves-effect">
                                            <a href="#!" onclick="jumpToPage(1, '"""),_display_(/*179.83*/sort),format.raw/*179.87*/("""', '"""),_display_(/*179.92*/searchBody),format.raw/*179.102*/("""')">
                                                <i class="material-icons">first_page</i>
                                            </a>
                                        </li>
                                        <li class="waves-effect">
                                            <a href="#!" onclick="jumpToPage("""),_display_(/*184.79*/pageNum),format.raw/*184.86*/("""-1, '"""),_display_(/*184.92*/sort),format.raw/*184.96*/("""', '"""),_display_(/*184.101*/searchBody),format.raw/*184.111*/("""')">
                                                <i class="material-icons">chevron_left</i>
                                            </a>
                                        </li>
                                    """)))}),format.raw/*188.38*/("""
                                    """),_display_(/*189.38*/if(beginIndexForPagination > 1)/*189.69*/ {_display_(Seq[Any](format.raw/*189.71*/("""
                                        """),format.raw/*190.41*/("""<li class="waves-effect modal-trigger" href="#searchPageModal" style="cursor: pointer;
                                            font-size: 20px;
                                            font-weight: bold">...</li>
                                    """)))}),format.raw/*193.38*/("""
                                    """),_display_(/*194.38*/for(i <- (beginIndexForPagination + 0) to (endIndexForPagination + 0)) yield /*194.108*/ {_display_(Seq[Any](format.raw/*194.110*/("""
                                        """),format.raw/*195.41*/("""<li """),_display_(/*195.46*/if(pageNum == i)/*195.62*/ {_display_(Seq[Any](format.raw/*195.64*/("""
                                            """),format.raw/*196.45*/("""class="active"""")))}),format.raw/*196.60*/(""">
                                            <a href="#!" onclick="jumpToPage("""),_display_(/*197.79*/i),format.raw/*197.80*/(""", '"""),_display_(/*197.84*/sort),format.raw/*197.88*/("""', '"""),_display_(/*197.93*/searchBody),format.raw/*197.103*/("""')">
                                            """),_display_(/*198.46*/i),format.raw/*198.47*/("""
                                            """),format.raw/*199.45*/("""</a>
                                        </li>
                                    """)))}),format.raw/*201.38*/("""
                                    """),_display_(/*202.38*/if(endIndexForPagination < ((total - 1) / pageLimit + 1))/*202.95*/ {_display_(Seq[Any](format.raw/*202.97*/("""
                                        """),format.raw/*203.41*/("""<li class="waves-effect modal-trigger" href="#searchPageModal" style="cursor: pointer;
                                            font-size: 20px;
                                            font-weight: bold">...</li>
                                    """)))}),format.raw/*206.38*/("""
                                    """),_display_(/*207.38*/if((offset + count) >= total)/*207.67*/ {_display_(Seq[Any](format.raw/*207.69*/("""
                                        """),format.raw/*208.41*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                            chevron_right</i></li>
                                        <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                            last_page</i></li>
                                    """)))}/*212.39*/else/*212.44*/{_display_(Seq[Any](format.raw/*212.45*/("""
                                        """),format.raw/*213.41*/("""<li class="waves-effect">
                                            <a href="#!" onclick="jumpToPage("""),_display_(/*214.79*/pageNum),format.raw/*214.86*/("""+1, '"""),_display_(/*214.92*/sort),format.raw/*214.96*/("""', '"""),_display_(/*214.101*/searchBody),format.raw/*214.111*/("""')">
                                                <i class="material-icons">chevron_right</i>
                                            </a>
                                        </li>
                                        <li class="waves-effect">
                                            <a href="#!" onclick="jumpToPage(("""),_display_(/*219.80*/total),format.raw/*219.85*/("""-1) / ("""),_display_(/*219.93*/pageLimit),format.raw/*219.102*/(""") + 1, '"""),_display_(/*219.111*/sort),format.raw/*219.115*/("""', '"""),_display_(/*219.120*/searchBody),format.raw/*219.130*/("""')">
                                                <i class="material-icons">last_page</i>
                                            </a>
                                        </li>
                                    """)))}),format.raw/*223.38*/("""
                                """),format.raw/*224.33*/("""</ul>
                            </div>
                        </div>
                    """)))}/*227.23*/else/*227.28*/{_display_(Seq[Any](format.raw/*227.29*/("""
                        """),format.raw/*228.25*/("""<h5>No RA job application was found.</h5>
                    """)))}),format.raw/*229.22*/("""

                    """),format.raw/*231.21*/("""<div id="allPageModal" class="modal">
                        <div class="modal-content">
                            <h6>Select the page number you want to jump to</h6>
                            <div class="card z-depth-0">

                            """),_display_(/*236.30*/for(i <- (0) to ((((total - 1) / (pageLimit) + 1) - 1) / 10)) yield /*236.91*/ {_display_(Seq[Any](format.raw/*236.93*/("""
                                """),format.raw/*237.33*/("""<ul class="pagination center-align">
                                """),_display_(/*238.34*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*238.73*/ {_display_(Seq[Any](format.raw/*238.75*/("""
                                    """),_display_(/*239.38*/if(j <= ((total - 1) / (pageLimit) + 1))/*239.78*/ {_display_(Seq[Any](format.raw/*239.80*/("""
                                        """),_display_(/*240.42*/if(j != pageNum)/*240.58*/ {_display_(Seq[Any](format.raw/*240.60*/("""
                                            """),format.raw/*241.45*/("""<li class="waves-effect grey lighten-3"><a href='"""),_display_(/*241.95*/routes/*241.101*/.UserController.userList(j, sort)),format.raw/*241.134*/("""'>"""),_display_(/*241.137*/j),format.raw/*241.138*/("""</a></li>
                                        """)))}/*242.43*/else/*242.48*/{_display_(Seq[Any](format.raw/*242.49*/("""
                                            """),format.raw/*243.45*/("""<li class="waves-effect active"><a href=""""),_display_(/*243.87*/routes/*243.93*/.UserController.userList(j, sort)),format.raw/*243.126*/("""">"""),_display_(/*243.129*/j),format.raw/*243.130*/("""</a></li>
                                        """)))}),format.raw/*244.42*/("""
                                    """)))}),format.raw/*245.38*/("""
                                """)))}),format.raw/*246.34*/("""
                                """),format.raw/*247.33*/("""</ul>
                            """)))}),format.raw/*248.30*/("""
                            """),format.raw/*249.29*/("""</div>
                        </div>
                        <div class="modal-footer">
                            <a href="#!" class="modal-close waves-effect waves-green btn-flat">
                                Cancel</a>
                        </div>
                    </div>

                    <div id="searchPageModal" class="modal">
                        <div class="modal-content">
                            <h6>Select the page number you want to jump to</h6>
                            <div class="card z-depth-0">

                            """),_display_(/*262.30*/for(i <- (0) to ((((total - 1) / (pageLimit) + 1) - 1) / 10)) yield /*262.91*/ {_display_(Seq[Any](format.raw/*262.93*/("""
                                """),format.raw/*263.33*/("""<ul class="pagination center-align">
                                """),_display_(/*264.34*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*264.73*/ {_display_(Seq[Any](format.raw/*264.75*/("""
                                    """),_display_(/*265.38*/if(j <= ((total - 1) / (pageLimit) + 1))/*265.78*/ {_display_(Seq[Any](format.raw/*265.80*/("""
                                        """),_display_(/*266.42*/if(j != pageNum)/*266.58*/ {_display_(Seq[Any](format.raw/*266.60*/("""
                                            """),format.raw/*267.45*/("""<li class="waves-effect grey lighten-3"><a href='#!' onclick="jumpToPage("""),_display_(/*267.119*/j),format.raw/*267.120*/(""", 'id', '"""),_display_(/*267.130*/searchBody),format.raw/*267.140*/("""')">"""),_display_(/*267.145*/j),format.raw/*267.146*/("""</a></li>
                                        """)))}/*268.43*/else/*268.48*/{_display_(Seq[Any](format.raw/*268.49*/("""
                                            """),format.raw/*269.45*/("""<li class="waves-effect active"><a href="#!" onclick="jumpToPage("""),_display_(/*269.111*/j),format.raw/*269.112*/(""", 'id', '"""),_display_(/*269.122*/searchBody),format.raw/*269.132*/("""')">"""),_display_(/*269.137*/j),format.raw/*269.138*/("""</a></li>
                                        """)))}),format.raw/*270.42*/("""
                                    """)))}),format.raw/*271.38*/("""
                                """)))}),format.raw/*272.34*/("""
                                """),format.raw/*273.33*/("""</ul>
                            """)))}),format.raw/*274.30*/("""
                            """),format.raw/*275.29*/("""</div>
                        </div>
                        <div class="modal-footer">
                            <a href="#!" class="modal-close waves-effect waves-green btn-flat">
                                Cancel</a>
                        </div>
                    </div>


                </div>
            </div>
        </div>
    </div>
""")))}),format.raw/*288.2*/("""

"""))
      }
    }
  }

  def render(entries:util.List[RAJobApplication],pageNum:Integer,sort:String,offset:Integer,total:Integer,count:Integer,listType:String,pageLimit:Integer,searchBody:String,userId:Long,beginIndexForPagination:Integer,endIndexForPagination:Integer): play.twirl.api.HtmlFormat.Appendable = apply(entries,pageNum,sort,offset,total,count,listType,pageLimit,searchBody,userId,beginIndexForPagination,endIndexForPagination)

  def f:((util.List[RAJobApplication],Integer,String,Integer,Integer,Integer,String,Integer,String,Long,Integer,Integer) => play.twirl.api.HtmlFormat.Appendable) = (entries,pageNum,sort,offset,total,count,listType,pageLimit,searchBody,userId,beginIndexForPagination,endIndexForPagination) => apply(entries,pageNum,sort,offset,total,count,listType,pageLimit,searchBody,userId,beginIndexForPagination,endIndexForPagination)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:35 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/raJobApplicationList.scala.html
                  HASH: b032c3d0085d0d27e7f2875cb9061999e48ed8b7
                  MATRIX: 814->1|1254->19|1673->366|1702->384|1717->391|1798->395|1830->400|1887->430|1902->436|1961->474|2079->564|2108->565|2153->582|2227->629|2273->659|2313->661|2358->678|2397->689|2426->690|2455->691|2512->721|2528->728|2564->743|2675->962|2720->979|2848->1076|2893->1093|3037->1209|3066->1210|3159->1275|3188->1276|3233->1293|3934->1966|3963->1967|4006->2045|4048->2059|4102->2085|4131->2086|4176->2103|4211->2110|4240->2111|4289->2132|4381->2196|4410->2197|4463->2222|4546->2277|4575->2278|4653->2328|4682->2329|4733->2352|4762->2353|4811->2374|4914->2449|4943->2450|4986->2465|5015->2466|5047->2471|5121->2517|5150->2518|5195->2535|5340->2652|5369->2653|5401->2658|5451->364|5479->382|5507->2668|5536->2671|5581->2707|5621->2709|5653->2714|5847->2881|5878->2903|5918->2905|5971->2930|6606->3538|6709->3620|6738->3621|6769->3625|6877->3711|6907->3712|6939->3716|6966->3721|7690->4417|7721->4438|7762->4440|7828->4477|7912->4529|7942->4530|8287->4847|8319->4857|9708->6218|9768->6261|9809->6263|9871->6296|9954->6351|9970->6357|10047->6411|10079->6414|10113->6425|10192->6476|10207->6481|10259->6511|10334->6558|10349->6563|10400->6592|10475->6639|10490->6644|10545->6677|10620->6724|10635->6729|10680->6752|10751->6795|10792->6826|10833->6828|10903->6869|11134->7081|11183->7120|11223->7121|11289->7158|11510->7359|11558->7397|11598->7398|11664->7435|11882->7633|11896->7638|11936->7639|12002->7676|12089->7731|12155->7768|12188->7773|12203->7778|12242->7795|12326->7851|12342->7857|12419->7911|12542->8002|12600->8031|12869->8272|12895->8288|12936->8290|13006->8331|13403->8709|13417->8714|13457->8715|13527->8756|13663->8864|13689->8868|13722->8873|13755->8883|14116->9216|14145->9223|14179->9229|14205->9233|14239->9238|14272->9248|14532->9476|14598->9514|14639->9545|14680->9547|14750->9588|15039->9845|15105->9883|15193->9953|15235->9955|15305->9996|15338->10001|15364->10017|15405->10019|15479->10064|15526->10079|15634->10159|15657->10160|15689->10164|15715->10168|15748->10173|15781->10183|15859->10233|15882->10234|15956->10279|16076->10367|16142->10405|16209->10462|16250->10464|16320->10505|16609->10762|16675->10800|16714->10829|16755->10831|16825->10872|17222->11250|17236->11255|17276->11256|17346->11297|17478->11401|17507->11408|17541->11414|17567->11418|17601->11423|17634->11433|17999->11770|18026->11775|18062->11783|18094->11792|18132->11801|18159->11805|18193->11810|18226->11820|18483->12045|18545->12078|18658->12172|18672->12177|18712->12178|18766->12203|18861->12266|18912->12288|19197->12545|19275->12606|19316->12608|19378->12641|19476->12711|19532->12750|19573->12752|19639->12790|19689->12830|19730->12832|19800->12874|19826->12890|19867->12892|19941->12937|20019->12987|20036->12993|20092->13026|20124->13029|20148->13030|20219->13082|20233->13087|20273->13088|20347->13133|20417->13175|20433->13181|20489->13214|20521->13217|20545->13218|20628->13269|20698->13307|20764->13341|20826->13374|20893->13409|20951->13438|21546->14005|21624->14066|21665->14068|21727->14101|21825->14171|21881->14210|21922->14212|21988->14250|22038->14290|22079->14292|22149->14334|22175->14350|22216->14352|22290->14397|22393->14471|22417->14472|22456->14482|22489->14492|22523->14497|22547->14498|22618->14550|22632->14555|22672->14556|22746->14601|22841->14667|22865->14668|22904->14678|22937->14688|22971->14693|22995->14694|23078->14745|23148->14783|23214->14817|23276->14850|23343->14885|23401->14914|23789->15271
                  LINES: 31->1|36->2|50->14|52->16|52->16|54->16|55->17|55->17|55->17|55->17|57->19|57->19|58->20|59->21|59->21|59->21|60->22|60->22|60->22|60->22|61->23|61->23|61->23|64->26|65->27|67->29|68->30|71->33|71->33|73->35|73->35|74->36|90->52|90->52|93->55|95->57|95->57|95->57|96->58|96->58|96->58|97->59|98->60|98->60|99->61|100->62|100->62|102->64|102->64|102->64|102->64|103->65|104->66|104->66|105->67|105->67|106->68|108->70|108->70|109->71|112->74|112->74|113->75|115->13|116->15|117->76|119->78|119->78|119->78|120->79|124->83|124->83|124->83|125->84|138->97|140->99|140->99|140->99|142->101|142->101|142->101|142->101|152->111|152->111|152->111|153->112|154->113|154->113|159->118|159->118|181->140|181->140|181->140|182->141|183->142|183->142|183->142|183->142|183->142|184->143|184->143|184->143|185->144|185->144|185->144|186->145|186->145|186->145|187->146|187->146|187->146|188->147|188->147|188->147|189->148|192->151|192->151|192->151|193->152|196->155|196->155|196->155|197->156|200->159|200->159|200->159|201->160|202->161|203->162|203->162|203->162|203->162|204->163|204->163|204->163|206->165|207->166|213->172|213->172|213->172|214->173|218->177|218->177|218->177|219->178|220->179|220->179|220->179|220->179|225->184|225->184|225->184|225->184|225->184|225->184|229->188|230->189|230->189|230->189|231->190|234->193|235->194|235->194|235->194|236->195|236->195|236->195|236->195|237->196|237->196|238->197|238->197|238->197|238->197|238->197|238->197|239->198|239->198|240->199|242->201|243->202|243->202|243->202|244->203|247->206|248->207|248->207|248->207|249->208|253->212|253->212|253->212|254->213|255->214|255->214|255->214|255->214|255->214|255->214|260->219|260->219|260->219|260->219|260->219|260->219|260->219|260->219|264->223|265->224|268->227|268->227|268->227|269->228|270->229|272->231|277->236|277->236|277->236|278->237|279->238|279->238|279->238|280->239|280->239|280->239|281->240|281->240|281->240|282->241|282->241|282->241|282->241|282->241|282->241|283->242|283->242|283->242|284->243|284->243|284->243|284->243|284->243|284->243|285->244|286->245|287->246|288->247|289->248|290->249|303->262|303->262|303->262|304->263|305->264|305->264|305->264|306->265|306->265|306->265|307->266|307->266|307->266|308->267|308->267|308->267|308->267|308->267|308->267|308->267|309->268|309->268|309->268|310->269|310->269|310->269|310->269|310->269|310->269|310->269|311->270|312->271|313->272|314->273|315->274|316->275|329->288
                  -- GENERATED --
              */
          