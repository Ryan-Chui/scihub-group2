
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

object taJobApplicationList extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template12[util.List[TAJobApplication],Integer,String,Integer,Integer,Integer,String,Integer,String,Long,Integer,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(entries: util.List[TAJobApplication],
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
/*13.2*/import helper._

def /*15.2*/scripts/*15.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*15.13*/("""
    """),format.raw/*16.5*/("""<script type = "module" src='"""),_display_(/*16.35*/routes/*16.41*/.Assets.at("javascripts/voiceJump.js")),format.raw/*16.79*/("""'></script>
    <script type="text/javascript">
            $(document).ready(function () """),format.raw/*18.43*/("""{"""),format.raw/*18.44*/("""
                """),format.raw/*19.17*/("""var nasaEndorsedAPIArray = []
                """),_display_(/*20.18*/for(i <- 0 until entries.size) yield /*20.48*/ {_display_(Seq[Any](format.raw/*20.50*/("""
                """),format.raw/*21.17*/("""var json = """),format.raw/*21.28*/("""{"""),format.raw/*21.29*/("""}"""),format.raw/*21.30*/(""";
                json.id = '"""),_display_(/*22.29*/entries/*22.36*/.get(i).getId()),format.raw/*22.51*/("""';
                json.url = "/user/userDetailPage/" + json.id;

                """),format.raw/*25.154*/("""
                """),format.raw/*26.17*/("""console.log("jsonhere:" + json)
                nasaEndorsedAPIArray.push(json)
                """)))}),format.raw/*28.18*/("""
                """),format.raw/*29.17*/("""$("#nasaText").text(JSON.stringify(nasaEndorsedAPIArray));

                $('.tooltipped').tooltip();
            """),format.raw/*32.13*/("""}"""),format.raw/*32.14*/(""");

            function jumpToPage(pageNum, sort, searchString) """),format.raw/*34.62*/("""{"""),format.raw/*34.63*/("""
                """),format.raw/*35.17*/("""pageNum = Math.floor(pageNum);
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
            """),format.raw/*51.13*/("""}"""),format.raw/*51.14*/("""


            """),format.raw/*54.76*/("""

            """),format.raw/*56.13*/("""function changeView(view) """),format.raw/*56.39*/("""{"""),format.raw/*56.40*/("""
                """),format.raw/*57.17*/("""$.ajax("""),format.raw/*57.24*/("""{"""),format.raw/*57.25*/("""
                    """),format.raw/*58.21*/("""url: "/updateProjectZone/" + view,
                    headers: """),format.raw/*59.30*/("""{"""),format.raw/*59.31*/("""
                        """),format.raw/*60.25*/("""'Content-Type': 'application/json'
                    """),format.raw/*61.21*/("""}"""),format.raw/*61.22*/(""",
                    type: "GET"
                """),format.raw/*63.17*/("""}"""),format.raw/*63.18*/(""").done(function (data) """),format.raw/*63.41*/("""{"""),format.raw/*63.42*/("""
                    """),format.raw/*64.21*/("""window.location.href = "/user/userList/1?sortCriteria=id";
                """),format.raw/*65.17*/("""}"""),format.raw/*65.18*/(""");
            """),format.raw/*66.13*/("""}"""),format.raw/*66.14*/("""
    """),format.raw/*67.5*/("""</script>
    <style>
            .follow-fab """),format.raw/*69.25*/("""{"""),format.raw/*69.26*/("""
                """),format.raw/*70.17*/("""top: -20px !important;
                bottom: auto !important;
                right: -20px !important;
            """),format.raw/*73.13*/("""}"""),format.raw/*73.14*/("""
    """),format.raw/*74.5*/("""</style>
""")))};
Seq[Any](format.raw/*12.74*/("""
"""),format.raw/*14.1*/("""
"""),format.raw/*75.2*/("""

"""),_display_(/*77.2*/main("TA Job Applications", scripts)/*77.38*/ {_display_(Seq[Any](format.raw/*77.40*/("""
    """),format.raw/*78.5*/("""<div class="container">
        <div class="row">
            <div class="col s12 m10 offset-m1">
                <div class="card-panel center">
                    """),_display_(/*82.22*/if(entries.size() > 0)/*82.44*/ {_display_(Seq[Any](format.raw/*82.46*/("""
                        """),format.raw/*83.25*/("""<div class="col s8 offset-s2">
                            <h4>TA Job Applications</h4>

                        </div>
                        <div class="col s2">
                            <button id = "speak-from-filter" hidden></button>

                            <div id="nasaText" hidden></div>
                            <div id="requestField"></div>
                            <div id="replyField"></div>
                        </div>
                        <div class="row">
                            <div class="col s6">
                                <h6 class="left">Showing results: """),_display_(/*96.68*/{
                                    offset + 1
                                }),format.raw/*98.34*/(""" """),format.raw/*98.35*/("""to """),_display_(/*98.39*/{
                                    offset + count
                                }),format.raw/*100.34*/(""" """),format.raw/*100.35*/("""of """),_display_(/*100.39*/total),format.raw/*100.44*/("""</h6>
                            </div>
                            <div class="col s6" style="padding-top: -5px;
                                margin-top: -2px">
                                <a class='dropdown-trigger btn-flat right' href='#' data-target='dropdown2' style="text-transform: none;
                                    font-weight: bold;
                                    color: black;
                                    font-family: AmazonEmberBold, Helvetica Neue Bold, Helvetica Neue, Helvetica, Arial, sans-serif;
                                !important; ">
                                    Sort By: &nbsp; <font color="#3a5dc3">
                                """),_display_(/*110.34*/if(sort.equals("id"))/*110.55*/ {_display_(Seq[Any](format.raw/*110.57*/("""
                                    """),format.raw/*111.37*/("""Job Application ID
                                """)))}),format.raw/*112.34*/(""" """),format.raw/*112.35*/("""</font> <i class="material-icons right">expand_more</i></a>

                                    <!-- Dropdown Structure -->
                                <ul id='dropdown2' class='dropdown-content'>
                                    <li>
                                        <a onclick="jumpToPage(1, 'id', '"""),_display_(/*117.75*/searchBody),format.raw/*117.85*/("""')">
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
                                    <th style="cursor: pointer;">Applied Time</th>
                                    <th style="cursor: pointer;">Operations</th>
                                </tr>
                            </thead>
                            <tbody>
                            """),_display_(/*138.30*/for((entry, index) <- entries.zipWithIndex) yield /*138.73*/ {_display_(Seq[Any](format.raw/*138.75*/("""
                                """),format.raw/*139.33*/("""<tr>
                                    <td><a href=""""),_display_(/*140.51*/routes/*140.57*/.TAJobController.tajobApplicationDetail(entry.getId())),format.raw/*140.111*/("""">"""),_display_(/*140.114*/(index + 1)),format.raw/*140.125*/("""</a></td>
                                    <td>"""),_display_(/*141.42*/entry/*141.47*/.getApplicant().getFirstName()),format.raw/*141.77*/("""</td>
                                    <td>"""),_display_(/*142.42*/entry/*142.47*/.getApplicant().getLastName()),format.raw/*142.76*/("""</td>
                                    <td>"""),_display_(/*143.42*/entry/*143.47*/.getApplicant().getOrganization()),format.raw/*143.80*/("""</td>
                                    <td>"""),_display_(/*144.42*/entry/*144.47*/.getApplicantTypeInfo()),format.raw/*144.70*/("""</td>
                                    <td>"""),_display_(/*145.42*/entry/*145.47*/.getCreatedTime()),format.raw/*145.64*/("""</td>
                                    <td><a href=""""),_display_(/*146.51*/routes/*146.57*/.TAJobController.tajobApplicationDetail(entry.getId())),format.raw/*146.111*/("""">View Details</a></td>
                                </tr>
                            """)))}),format.raw/*148.30*/("""
                            """),format.raw/*149.29*/("""</tbody>
                        </table>

                        <div class="row">
                            <div class="col s12">
                                <ul class="pagination center-align">
                                    """),_display_(/*155.38*/if(pageNum == 1)/*155.54*/ {_display_(Seq[Any](format.raw/*155.56*/("""
                                        """),format.raw/*156.41*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                            first_page</i></li>
                                        <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                            chevron_left</i></li>
                                    """)))}/*160.39*/else/*160.44*/{_display_(Seq[Any](format.raw/*160.45*/("""
                                        """),format.raw/*161.41*/("""<li class="waves-effect">
                                            <a href="#!" onclick="jumpToPage(1, '"""),_display_(/*162.83*/sort),format.raw/*162.87*/("""', '"""),_display_(/*162.92*/searchBody),format.raw/*162.102*/("""')">
                                                <i class="material-icons">first_page</i>
                                            </a>
                                        </li>
                                        <li class="waves-effect">
                                            <a href="#!" onclick="jumpToPage("""),_display_(/*167.79*/pageNum),format.raw/*167.86*/("""-1, '"""),_display_(/*167.92*/sort),format.raw/*167.96*/("""', '"""),_display_(/*167.101*/searchBody),format.raw/*167.111*/("""')">
                                                <i class="material-icons">chevron_left</i>
                                            </a>
                                        </li>
                                    """)))}),format.raw/*171.38*/("""
                                    """),_display_(/*172.38*/if(beginIndexForPagination > 1)/*172.69*/ {_display_(Seq[Any](format.raw/*172.71*/("""
                                        """),format.raw/*173.41*/("""<li class="waves-effect modal-trigger" href="#searchPageModal" style="cursor: pointer;
                                            font-size: 20px;
                                            font-weight: bold">...</li>
                                    """)))}),format.raw/*176.38*/("""
                                    """),_display_(/*177.38*/for(i <- (beginIndexForPagination + 0) to (endIndexForPagination + 0)) yield /*177.108*/ {_display_(Seq[Any](format.raw/*177.110*/("""
                                        """),format.raw/*178.41*/("""<li """),_display_(/*178.46*/if(pageNum == i)/*178.62*/ {_display_(Seq[Any](format.raw/*178.64*/("""
                                            """),format.raw/*179.45*/("""class="active"""")))}),format.raw/*179.60*/(""">
                                            <a href="#!" onclick="jumpToPage("""),_display_(/*180.79*/i),format.raw/*180.80*/(""", '"""),_display_(/*180.84*/sort),format.raw/*180.88*/("""', '"""),_display_(/*180.93*/searchBody),format.raw/*180.103*/("""')">
                                            """),_display_(/*181.46*/i),format.raw/*181.47*/("""
                                            """),format.raw/*182.45*/("""</a>
                                        </li>
                                    """)))}),format.raw/*184.38*/("""
                                    """),_display_(/*185.38*/if(endIndexForPagination < ((total - 1) / pageLimit + 1))/*185.95*/ {_display_(Seq[Any](format.raw/*185.97*/("""
                                        """),format.raw/*186.41*/("""<li class="waves-effect modal-trigger" href="#searchPageModal" style="cursor: pointer;
                                            font-size: 20px;
                                            font-weight: bold">...</li>
                                    """)))}),format.raw/*189.38*/("""
                                    """),_display_(/*190.38*/if((offset + count) >= total)/*190.67*/ {_display_(Seq[Any](format.raw/*190.69*/("""
                                        """),format.raw/*191.41*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                            chevron_right</i></li>
                                        <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                            last_page</i></li>
                                    """)))}/*195.39*/else/*195.44*/{_display_(Seq[Any](format.raw/*195.45*/("""
                                        """),format.raw/*196.41*/("""<li class="waves-effect">
                                            <a href="#!" onclick="jumpToPage("""),_display_(/*197.79*/pageNum),format.raw/*197.86*/("""+1, '"""),_display_(/*197.92*/sort),format.raw/*197.96*/("""', '"""),_display_(/*197.101*/searchBody),format.raw/*197.111*/("""')">
                                                <i class="material-icons">chevron_right</i>
                                            </a>
                                        </li>
                                        <li class="waves-effect">
                                            <a href="#!" onclick="jumpToPage(("""),_display_(/*202.80*/total),format.raw/*202.85*/("""-1) / ("""),_display_(/*202.93*/pageLimit),format.raw/*202.102*/(""") + 1, '"""),_display_(/*202.111*/sort),format.raw/*202.115*/("""', '"""),_display_(/*202.120*/searchBody),format.raw/*202.130*/("""')">
                                                <i class="material-icons">last_page</i>
                                            </a>
                                        </li>
                                    """)))}),format.raw/*206.38*/("""
                                """),format.raw/*207.33*/("""</ul>
                            </div>
                        </div>
                    """)))}/*210.23*/else/*210.28*/{_display_(Seq[Any](format.raw/*210.29*/("""
                        """),format.raw/*211.25*/("""<h5>No TA job application was found.</h5>
                    """)))}),format.raw/*212.22*/("""

                    """),format.raw/*214.21*/("""<div id="allPageModal" class="modal">
                        <div class="modal-content">
                            <h6>Select the page number you want to jump to</h6>
                            <div class="card z-depth-0">

                            """),_display_(/*219.30*/for(i <- (0) to ((((total - 1) / (pageLimit) + 1) - 1) / 10)) yield /*219.91*/ {_display_(Seq[Any](format.raw/*219.93*/("""
                                """),format.raw/*220.33*/("""<ul class="pagination center-align">
                                """),_display_(/*221.34*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*221.73*/ {_display_(Seq[Any](format.raw/*221.75*/("""
                                    """),_display_(/*222.38*/if(j <= ((total - 1) / (pageLimit) + 1))/*222.78*/ {_display_(Seq[Any](format.raw/*222.80*/("""
                                        """),_display_(/*223.42*/if(j != pageNum)/*223.58*/ {_display_(Seq[Any](format.raw/*223.60*/("""
                                            """),format.raw/*224.45*/("""<li class="waves-effect grey lighten-3"><a href='"""),_display_(/*224.95*/routes/*224.101*/.UserController.userList(j, sort)),format.raw/*224.134*/("""'>"""),_display_(/*224.137*/j),format.raw/*224.138*/("""</a></li>
                                        """)))}/*225.43*/else/*225.48*/{_display_(Seq[Any](format.raw/*225.49*/("""
                                            """),format.raw/*226.45*/("""<li class="waves-effect active"><a href=""""),_display_(/*226.87*/routes/*226.93*/.UserController.userList(j, sort)),format.raw/*226.126*/("""">"""),_display_(/*226.129*/j),format.raw/*226.130*/("""</a></li>
                                        """)))}),format.raw/*227.42*/("""
                                    """)))}),format.raw/*228.38*/("""
                                """)))}),format.raw/*229.34*/("""
                                """),format.raw/*230.33*/("""</ul>
                            """)))}),format.raw/*231.30*/("""
                            """),format.raw/*232.29*/("""</div>
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

                            """),_display_(/*245.30*/for(i <- (0) to ((((total - 1) / (pageLimit) + 1) - 1) / 10)) yield /*245.91*/ {_display_(Seq[Any](format.raw/*245.93*/("""
                                """),format.raw/*246.33*/("""<ul class="pagination center-align">
                                """),_display_(/*247.34*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*247.73*/ {_display_(Seq[Any](format.raw/*247.75*/("""
                                    """),_display_(/*248.38*/if(j <= ((total - 1) / (pageLimit) + 1))/*248.78*/ {_display_(Seq[Any](format.raw/*248.80*/("""
                                        """),_display_(/*249.42*/if(j != pageNum)/*249.58*/ {_display_(Seq[Any](format.raw/*249.60*/("""
                                            """),format.raw/*250.45*/("""<li class="waves-effect grey lighten-3"><a href='#!' onclick="jumpToPage("""),_display_(/*250.119*/j),format.raw/*250.120*/(""", 'id', '"""),_display_(/*250.130*/searchBody),format.raw/*250.140*/("""')">"""),_display_(/*250.145*/j),format.raw/*250.146*/("""</a></li>
                                        """)))}/*251.43*/else/*251.48*/{_display_(Seq[Any](format.raw/*251.49*/("""
                                            """),format.raw/*252.45*/("""<li class="waves-effect active"><a href="#!" onclick="jumpToPage("""),_display_(/*252.111*/j),format.raw/*252.112*/(""", 'id', '"""),_display_(/*252.122*/searchBody),format.raw/*252.132*/("""')">"""),_display_(/*252.137*/j),format.raw/*252.138*/("""</a></li>
                                        """)))}),format.raw/*253.42*/("""
                                    """)))}),format.raw/*254.38*/("""
                                """)))}),format.raw/*255.34*/("""
                                """),format.raw/*256.33*/("""</ul>
                            """)))}),format.raw/*257.30*/("""
                            """),format.raw/*258.29*/("""</div>
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
""")))}),format.raw/*271.2*/("""

"""))
      }
    }
  }

  def render(entries:util.List[TAJobApplication],pageNum:Integer,sort:String,offset:Integer,total:Integer,count:Integer,listType:String,pageLimit:Integer,searchBody:String,userId:Long,beginIndexForPagination:Integer,endIndexForPagination:Integer): play.twirl.api.HtmlFormat.Appendable = apply(entries,pageNum,sort,offset,total,count,listType,pageLimit,searchBody,userId,beginIndexForPagination,endIndexForPagination)

  def f:((util.List[TAJobApplication],Integer,String,Integer,Integer,Integer,String,Integer,String,Long,Integer,Integer) => play.twirl.api.HtmlFormat.Appendable) = (entries,pageNum,sort,offset,total,count,listType,pageLimit,searchBody,userId,beginIndexForPagination,endIndexForPagination) => apply(entries,pageNum,sort,offset,total,count,listType,pageLimit,searchBody,userId,beginIndexForPagination,endIndexForPagination)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:38 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/taJobApplicationList.scala.html
                  HASH: 2a5a143e5d1e72616c2fa8c89d8b3226faa3325c
                  MATRIX: 814->1|1254->19|1665->358|1694->376|1709->383|1790->387|1822->392|1879->422|1894->428|1953->466|2071->556|2100->557|2145->574|2219->621|2265->651|2305->653|2350->670|2389->681|2418->682|2447->683|2504->713|2520->720|2556->735|2667->954|2712->971|2840->1068|2885->1085|3029->1201|3058->1202|3151->1267|3180->1268|3225->1285|3926->1958|3955->1959|3998->2037|4040->2051|4094->2077|4123->2078|4168->2095|4203->2102|4232->2103|4281->2124|4373->2188|4402->2189|4455->2214|4538->2269|4567->2270|4645->2320|4674->2321|4725->2344|4754->2345|4803->2366|4906->2441|4935->2442|4978->2457|5007->2458|5039->2463|5113->2509|5142->2510|5187->2527|5332->2644|5361->2645|5393->2650|5443->356|5471->374|5499->2660|5528->2663|5573->2699|5613->2701|5645->2706|5839->2873|5870->2895|5910->2897|5963->2922|6598->3530|6701->3612|6730->3613|6761->3617|6869->3703|6899->3704|6931->3708|6958->3713|7682->4409|7713->4430|7754->4432|7820->4469|7904->4521|7934->4522|8279->4839|8311->4849|9613->6123|9673->6166|9714->6168|9776->6201|9859->6256|9875->6262|9952->6316|9984->6319|10018->6330|10097->6381|10112->6386|10164->6416|10239->6463|10254->6468|10305->6497|10380->6544|10395->6549|10450->6582|10525->6629|10540->6634|10585->6657|10660->6704|10675->6709|10714->6726|10798->6782|10814->6788|10891->6842|11014->6933|11072->6962|11341->7203|11367->7219|11408->7221|11478->7262|11875->7640|11889->7645|11929->7646|11999->7687|12135->7795|12161->7799|12194->7804|12227->7814|12588->8147|12617->8154|12651->8160|12677->8164|12711->8169|12744->8179|13004->8407|13070->8445|13111->8476|13152->8478|13222->8519|13511->8776|13577->8814|13665->8884|13707->8886|13777->8927|13810->8932|13836->8948|13877->8950|13951->8995|13998->9010|14106->9090|14129->9091|14161->9095|14187->9099|14220->9104|14253->9114|14331->9164|14354->9165|14428->9210|14548->9298|14614->9336|14681->9393|14722->9395|14792->9436|15081->9693|15147->9731|15186->9760|15227->9762|15297->9803|15694->10181|15708->10186|15748->10187|15818->10228|15950->10332|15979->10339|16013->10345|16039->10349|16073->10354|16106->10364|16471->10701|16498->10706|16534->10714|16566->10723|16604->10732|16631->10736|16665->10741|16698->10751|16955->10976|17017->11009|17130->11103|17144->11108|17184->11109|17238->11134|17333->11197|17384->11219|17669->11476|17747->11537|17788->11539|17850->11572|17948->11642|18004->11681|18045->11683|18111->11721|18161->11761|18202->11763|18272->11805|18298->11821|18339->11823|18413->11868|18491->11918|18508->11924|18564->11957|18596->11960|18620->11961|18691->12013|18705->12018|18745->12019|18819->12064|18889->12106|18905->12112|18961->12145|18993->12148|19017->12149|19100->12200|19170->12238|19236->12272|19298->12305|19365->12340|19423->12369|20018->12936|20096->12997|20137->12999|20199->13032|20297->13102|20353->13141|20394->13143|20460->13181|20510->13221|20551->13223|20621->13265|20647->13281|20688->13283|20762->13328|20865->13402|20889->13403|20928->13413|20961->13423|20995->13428|21019->13429|21090->13481|21104->13486|21144->13487|21218->13532|21313->13598|21337->13599|21376->13609|21409->13619|21443->13624|21467->13625|21550->13676|21620->13714|21686->13748|21748->13781|21815->13816|21873->13845|22261->14202
                  LINES: 31->1|36->2|49->13|51->15|51->15|53->15|54->16|54->16|54->16|54->16|56->18|56->18|57->19|58->20|58->20|58->20|59->21|59->21|59->21|59->21|60->22|60->22|60->22|63->25|64->26|66->28|67->29|70->32|70->32|72->34|72->34|73->35|89->51|89->51|92->54|94->56|94->56|94->56|95->57|95->57|95->57|96->58|97->59|97->59|98->60|99->61|99->61|101->63|101->63|101->63|101->63|102->64|103->65|103->65|104->66|104->66|105->67|107->69|107->69|108->70|111->73|111->73|112->74|114->12|115->14|116->75|118->77|118->77|118->77|119->78|123->82|123->82|123->82|124->83|137->96|139->98|139->98|139->98|141->100|141->100|141->100|141->100|151->110|151->110|151->110|152->111|153->112|153->112|158->117|158->117|179->138|179->138|179->138|180->139|181->140|181->140|181->140|181->140|181->140|182->141|182->141|182->141|183->142|183->142|183->142|184->143|184->143|184->143|185->144|185->144|185->144|186->145|186->145|186->145|187->146|187->146|187->146|189->148|190->149|196->155|196->155|196->155|197->156|201->160|201->160|201->160|202->161|203->162|203->162|203->162|203->162|208->167|208->167|208->167|208->167|208->167|208->167|212->171|213->172|213->172|213->172|214->173|217->176|218->177|218->177|218->177|219->178|219->178|219->178|219->178|220->179|220->179|221->180|221->180|221->180|221->180|221->180|221->180|222->181|222->181|223->182|225->184|226->185|226->185|226->185|227->186|230->189|231->190|231->190|231->190|232->191|236->195|236->195|236->195|237->196|238->197|238->197|238->197|238->197|238->197|238->197|243->202|243->202|243->202|243->202|243->202|243->202|243->202|243->202|247->206|248->207|251->210|251->210|251->210|252->211|253->212|255->214|260->219|260->219|260->219|261->220|262->221|262->221|262->221|263->222|263->222|263->222|264->223|264->223|264->223|265->224|265->224|265->224|265->224|265->224|265->224|266->225|266->225|266->225|267->226|267->226|267->226|267->226|267->226|267->226|268->227|269->228|270->229|271->230|272->231|273->232|286->245|286->245|286->245|287->246|288->247|288->247|288->247|289->248|289->248|289->248|290->249|290->249|290->249|291->250|291->250|291->250|291->250|291->250|291->250|291->250|292->251|292->251|292->251|293->252|293->252|293->252|293->252|293->252|293->252|293->252|294->253|295->254|296->255|297->256|298->257|299->258|312->271
                  -- GENERATED --
              */
          