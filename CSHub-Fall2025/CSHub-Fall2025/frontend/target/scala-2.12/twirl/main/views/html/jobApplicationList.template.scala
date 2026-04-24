
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

object jobApplicationList extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template13[util.List[JobApplication],util.List[Job],Integer,String,Integer,Integer,Integer,String,Integer,String,Long,Integer,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(entries: util.List[JobApplication],
        jobs: util.List[Job],
        pageNum: Integer,
        sort: String,
        offset: Integer,
        total: Integer,
        count: Integer,
        listType: String,
        pageLimit: Integer,
        searchBody: String,
        userId: Long,
        beginIndexForPagination: Integer, endIndexForPagination: Integer):play.twirl.api.HtmlFormat.Appendable = {
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
Seq[Any](format.raw/*13.74*/("""
"""),format.raw/*15.1*/("""
"""),format.raw/*76.2*/("""

"""),_display_(/*78.2*/main("Job Applications", scripts)/*78.35*/ {_display_(Seq[Any](format.raw/*78.37*/("""
    """),format.raw/*79.5*/("""<div class="container">
        <div class="row">
            <div class="col s12 m10 offset-m1">
                <div class="card-panel center">
                    """),_display_(/*83.22*/if(entries.size() > 0)/*83.44*/ {_display_(Seq[Any](format.raw/*83.46*/("""
                        """),format.raw/*84.25*/("""<div class="col s8 offset-s2">
                            <h4>Job Applications</h4>

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
                                    <td><a href=""""),_display_(/*142.51*/routes/*142.57*/.JobController.jobApplicationDetail(entry.getId())),format.raw/*142.107*/("""">"""),_display_(/*142.110*/(index + 1)),format.raw/*142.121*/("""</a></td>
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
                                    <td><a href=""""),_display_(/*163.51*/routes/*163.57*/.JobController.jobApplicationDetail(entry.getId())),format.raw/*163.107*/("""">View Details</a></td>
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
                        """),format.raw/*228.25*/("""<h5>No job application was found.</h5>
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

  def render(entries:util.List[JobApplication],jobs:util.List[Job],pageNum:Integer,sort:String,offset:Integer,total:Integer,count:Integer,listType:String,pageLimit:Integer,searchBody:String,userId:Long,beginIndexForPagination:Integer,endIndexForPagination:Integer): play.twirl.api.HtmlFormat.Appendable = apply(entries,jobs,pageNum,sort,offset,total,count,listType,pageLimit,searchBody,userId,beginIndexForPagination,endIndexForPagination)

  def f:((util.List[JobApplication],util.List[Job],Integer,String,Integer,Integer,Integer,String,Integer,String,Long,Integer,Integer) => play.twirl.api.HtmlFormat.Appendable) = (entries,jobs,pageNum,sort,offset,total,count,listType,pageLimit,searchBody,userId,beginIndexForPagination,endIndexForPagination) => apply(entries,jobs,pageNum,sort,offset,total,count,listType,pageLimit,searchBody,userId,beginIndexForPagination,endIndexForPagination)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:32 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/jobApplicationList.scala.html
                  HASH: afab6166b9c94c301dc50d844dd72da6ff8c1541
                  MATRIX: 814->1|1265->19|1704->386|1733->404|1748->411|1829->415|1861->420|1918->450|1933->456|1992->494|2110->584|2139->585|2184->602|2258->649|2304->679|2344->681|2389->698|2428->709|2457->710|2486->711|2543->741|2559->748|2595->763|2706->982|2751->999|2879->1096|2924->1113|3068->1229|3097->1230|3190->1295|3219->1296|3264->1313|3965->1986|3994->1987|4037->2065|4079->2079|4133->2105|4162->2106|4207->2123|4242->2130|4271->2131|4320->2152|4412->2216|4441->2217|4494->2242|4577->2297|4606->2298|4684->2348|4713->2349|4764->2372|4793->2373|4842->2394|4945->2469|4974->2470|5017->2485|5046->2486|5078->2491|5152->2537|5181->2538|5226->2555|5371->2672|5400->2673|5432->2678|5482->384|5510->402|5538->2688|5567->2691|5609->2724|5649->2726|5681->2731|5875->2898|5906->2920|5946->2922|5999->2947|6631->3552|6734->3634|6763->3635|6794->3639|6902->3725|6932->3726|6964->3730|6991->3735|7715->4431|7746->4452|7787->4454|7853->4491|7937->4543|7967->4544|8312->4861|8344->4871|9733->6232|9793->6275|9834->6277|9896->6310|9979->6365|9995->6371|10068->6421|10100->6424|10134->6435|10213->6486|10228->6491|10280->6521|10355->6568|10370->6573|10421->6602|10496->6649|10511->6654|10566->6687|10641->6734|10656->6739|10701->6762|10772->6805|10813->6836|10854->6838|10924->6879|11155->7091|11204->7130|11244->7131|11310->7168|11531->7369|11579->7407|11619->7408|11685->7445|11903->7643|11917->7648|11957->7649|12023->7686|12110->7741|12176->7778|12209->7783|12224->7788|12263->7805|12347->7861|12363->7867|12436->7917|12559->8008|12617->8037|12886->8278|12912->8294|12953->8296|13023->8337|13420->8715|13434->8720|13474->8721|13544->8762|13680->8870|13706->8874|13739->8879|13772->8889|14133->9222|14162->9229|14196->9235|14222->9239|14256->9244|14289->9254|14549->9482|14615->9520|14656->9551|14697->9553|14767->9594|15056->9851|15122->9889|15210->9959|15252->9961|15322->10002|15355->10007|15381->10023|15422->10025|15496->10070|15543->10085|15651->10165|15674->10166|15706->10170|15732->10174|15765->10179|15798->10189|15876->10239|15899->10240|15973->10285|16093->10373|16159->10411|16226->10468|16267->10470|16337->10511|16626->10768|16692->10806|16731->10835|16772->10837|16842->10878|17239->11256|17253->11261|17293->11262|17363->11303|17495->11407|17524->11414|17558->11420|17584->11424|17618->11429|17651->11439|18016->11776|18043->11781|18079->11789|18111->11798|18149->11807|18176->11811|18210->11816|18243->11826|18500->12051|18562->12084|18675->12178|18689->12183|18729->12184|18783->12209|18875->12269|18926->12291|19211->12548|19289->12609|19330->12611|19392->12644|19490->12714|19546->12753|19587->12755|19653->12793|19703->12833|19744->12835|19814->12877|19840->12893|19881->12895|19955->12940|20033->12990|20050->12996|20106->13029|20138->13032|20162->13033|20233->13085|20247->13090|20287->13091|20361->13136|20431->13178|20447->13184|20503->13217|20535->13220|20559->13221|20642->13272|20712->13310|20778->13344|20840->13377|20907->13412|20965->13441|21560->14008|21638->14069|21679->14071|21741->14104|21839->14174|21895->14213|21936->14215|22002->14253|22052->14293|22093->14295|22163->14337|22189->14353|22230->14355|22304->14400|22407->14474|22431->14475|22470->14485|22503->14495|22537->14500|22561->14501|22632->14553|22646->14558|22686->14559|22760->14604|22855->14670|22879->14671|22918->14681|22951->14691|22985->14696|23009->14697|23092->14748|23162->14786|23228->14820|23290->14853|23357->14888|23415->14917|23803->15274
                  LINES: 31->1|36->2|50->14|52->16|52->16|54->16|55->17|55->17|55->17|55->17|57->19|57->19|58->20|59->21|59->21|59->21|60->22|60->22|60->22|60->22|61->23|61->23|61->23|64->26|65->27|67->29|68->30|71->33|71->33|73->35|73->35|74->36|90->52|90->52|93->55|95->57|95->57|95->57|96->58|96->58|96->58|97->59|98->60|98->60|99->61|100->62|100->62|102->64|102->64|102->64|102->64|103->65|104->66|104->66|105->67|105->67|106->68|108->70|108->70|109->71|112->74|112->74|113->75|115->13|116->15|117->76|119->78|119->78|119->78|120->79|124->83|124->83|124->83|125->84|138->97|140->99|140->99|140->99|142->101|142->101|142->101|142->101|152->111|152->111|152->111|153->112|154->113|154->113|159->118|159->118|181->140|181->140|181->140|182->141|183->142|183->142|183->142|183->142|183->142|184->143|184->143|184->143|185->144|185->144|185->144|186->145|186->145|186->145|187->146|187->146|187->146|188->147|188->147|188->147|189->148|192->151|192->151|192->151|193->152|196->155|196->155|196->155|197->156|200->159|200->159|200->159|201->160|202->161|203->162|203->162|203->162|203->162|204->163|204->163|204->163|206->165|207->166|213->172|213->172|213->172|214->173|218->177|218->177|218->177|219->178|220->179|220->179|220->179|220->179|225->184|225->184|225->184|225->184|225->184|225->184|229->188|230->189|230->189|230->189|231->190|234->193|235->194|235->194|235->194|236->195|236->195|236->195|236->195|237->196|237->196|238->197|238->197|238->197|238->197|238->197|238->197|239->198|239->198|240->199|242->201|243->202|243->202|243->202|244->203|247->206|248->207|248->207|248->207|249->208|253->212|253->212|253->212|254->213|255->214|255->214|255->214|255->214|255->214|255->214|260->219|260->219|260->219|260->219|260->219|260->219|260->219|260->219|264->223|265->224|268->227|268->227|268->227|269->228|270->229|272->231|277->236|277->236|277->236|278->237|279->238|279->238|279->238|280->239|280->239|280->239|281->240|281->240|281->240|282->241|282->241|282->241|282->241|282->241|282->241|283->242|283->242|283->242|284->243|284->243|284->243|284->243|284->243|284->243|285->244|286->245|287->246|288->247|289->248|290->249|303->262|303->262|303->262|304->263|305->264|305->264|305->264|306->265|306->265|306->265|307->266|307->266|307->266|308->267|308->267|308->267|308->267|308->267|308->267|308->267|309->268|309->268|309->268|310->269|310->269|310->269|310->269|310->269|310->269|310->269|311->270|312->271|313->272|314->273|315->274|316->275|329->288
                  -- GENERATED --
              */
          