
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

object reviewerList extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template15[List[Reviewer],Boolean,Boolean,Integer,String,Integer,Integer,Integer,String,Integer,String,String,Long,Integer,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(entries: List[Reviewer],
        isPrivateZone: Boolean,
        isCallerMySpacePage: Boolean,
        pageNum: Integer,
        sort: String,
        offset: Integer,
        total: Integer,
        count: Integer,
        listType: String,
        pageLimit: Integer,
        searchBody: String,
        reviewerName: String,
        id: Long, beginIndexForPagination: Integer, endIndexForPagination: Integer ):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*14.6*/import helper._

def /*16.6*/scripts/*16.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*16.17*/("""
        """),format.raw/*17.9*/("""<script type = "module" src='"""),_display_(/*17.39*/routes/*17.45*/.Assets.at("javascripts/voiceJump.js")),format.raw/*17.83*/("""'></script>
        <script type="text/javascript">
            $(document).ready(function () """),format.raw/*19.43*/("""{"""),format.raw/*19.44*/("""
                """),format.raw/*20.17*/("""var nasaEndorsedAPIArray = []
                """),_display_(/*21.18*/for(i <- 0 until entries.size) yield /*21.48*/ {_display_(Seq[Any](format.raw/*21.50*/("""
                """),format.raw/*22.17*/("""var json = """),format.raw/*22.28*/("""{"""),format.raw/*22.29*/("""}"""),format.raw/*22.30*/(""";
                json.id = '"""),_display_(/*23.29*/entries/*23.36*/.get(i).getId()),format.raw/*23.51*/("""';
                json.url = "/reviewer/reviewerDetailPage/" + json.id;

                json.name = '"""),_display_(/*26.31*/entries/*26.38*/.get(i).getFirstName()),format.raw/*26.60*/(""" """),_display_(/*26.62*/entries/*26.69*/.get(i).getLastName()),format.raw/*26.90*/("""'.replace(/[^a-zA-Z0-9]/g, " ").replace(/  +/g, " ").trim();
                console.log("jsonhere:" + json)
                nasaEndorsedAPIArray.push(json)
                """)))}),format.raw/*29.18*/("""
                """),format.raw/*30.17*/("""$("#nasaText").text(JSON.stringify(nasaEndorsedAPIArray));

                $('.tooltipped').tooltip();

                // $("#speak-from-filter").click();
                // $("#speak-nasa").click();
                // $("#speak-from-filter").click();

            """),format.raw/*38.13*/("""}"""),format.raw/*38.14*/(""");
            function jumpToPage(pageNum, sort, searchString) """),format.raw/*39.62*/("""{"""),format.raw/*39.63*/("""
                """),format.raw/*40.17*/("""pageNum = Math.floor(pageNum);
                var url = "/reviewer/searchPOST?pageNum=" + (pageNum) + "&sortCriteria="+sort;
                var form = $(document.createElement('form'));
                $(form).attr("action", url);
                $(form).attr("method", "POST");
                $(form).css("display", "none");


                var form_searchString = $("<input>")
                        .attr("type", "text")
                        .attr("name", "searchString")
                        .val(searchString);
                $(form).append($(form_searchString));

                form.appendTo( document.body );
                $(form).submit();
            """),format.raw/*56.13*/("""}"""),format.raw/*56.14*/("""



            """),format.raw/*60.76*/("""
            """),format.raw/*61.13*/("""function changeView(view) """),format.raw/*61.39*/("""{"""),format.raw/*61.40*/("""
                """),format.raw/*62.17*/("""$.ajax("""),format.raw/*62.24*/("""{"""),format.raw/*62.25*/("""
                    """),format.raw/*63.21*/("""url: "/updateProjectZone/" + view,
                    headers: """),format.raw/*64.30*/("""{"""),format.raw/*64.31*/("""
                        """),format.raw/*65.25*/("""'Content-Type': 'application/json'
                    """),format.raw/*66.21*/("""}"""),format.raw/*66.22*/(""",
                    type: "GET"
                """),format.raw/*68.17*/("""}"""),format.raw/*68.18*/(""").done(function (data) """),format.raw/*68.41*/("""{"""),format.raw/*68.42*/("""
                    """),format.raw/*69.21*/("""window.location.href = "/reviewer/reviewerList/1?sortCriteria=id";
                """),format.raw/*70.17*/("""}"""),format.raw/*70.18*/(""");
            """),format.raw/*71.13*/("""}"""),format.raw/*71.14*/("""
    """),format.raw/*72.5*/("""</script>
        <style>
            .follow-fab """),format.raw/*74.25*/("""{"""),format.raw/*74.26*/("""
                """),format.raw/*75.17*/("""top: -20px !important;
                bottom: auto !important;
                right: -20px !important;
            """),format.raw/*78.13*/("""}"""),format.raw/*78.14*/("""
    """),format.raw/*79.5*/("""</style>
    """)))};
Seq[Any](format.raw/*13.85*/("""
    """),format.raw/*15.1*/("""
    """),format.raw/*80.6*/("""

    """),_display_(/*82.6*/main("All Users", scripts)/*82.32*/ {_display_(Seq[Any](format.raw/*82.34*/("""
        """),format.raw/*83.9*/("""<div class="container">
            <div class="card-panel center">



                """),_display_(/*88.18*/if(isCallerMySpacePage)/*88.41*/ {_display_(Seq[Any](format.raw/*88.43*/("""
                    """),format.raw/*89.21*/("""<div class="row card-panel z-depth-0 project-zone-panel">
                        <div class="col s12" style="margin-top: -10px;
                            margin-bottom: -10px;">
                            <h6 class="left tooltipped" data-position="bottom" data-tooltip="This list shows all the APIs associated with your current project zone." >
                                Current Project Zone :
                                """),_display_(/*94.34*/if(isPrivateZone)/*94.51*/{_display_(Seq[Any](format.raw/*94.52*/("""
                                    """),format.raw/*95.37*/("""Your Private Zone
                                """)))}/*96.35*/else/*96.40*/{_display_(Seq[Any](format.raw/*96.41*/("""
                                    """),format.raw/*97.37*/("""OpenNEX
                                """)))}),format.raw/*98.34*/("""
                            """),format.raw/*99.29*/("""</h6>

                            <a class='dropdown-trigger right' href='#' data-target='dropdown1' style="text-transform: none;
                                font-weight: bold;
                                color: white;
                                padding-top: 8px;
                                font-family: AmazonEmberBold, Helvetica Neue Bold, Helvetica Neue, Helvetica, Arial, sans-serif;
                            !important;"><font style="weight: bold;"> <u>
                                Change Project Zone </u></font><i class="material-icons right">expand_more</i>
                            </a>
                                <!-- Dropdown Structure -->
                            <ul id='dropdown1' class='dropdown-content'>
                                <li style="font-family: AmazonEmberLight, Helvetica Neue Bold, Helvetica Neue, Helvetica, Arial, sans-serif;
                                !important;"><a href="#!" onclick="changeView('normal')"><i class="material-icons">
                                    view_module </i>
                                    OpenNEX project zone</a></li>
                                <li style="font-family: AmazonEmberLight, Helvetica Neue Bold, Helvetica Neue, Helvetica, Arial, sans-serif;
                                !important;"><a href="#!" onclick="changeView('private')"><i class="material-icons">security</i>
                                    Your private zone</a></li>
                            </ul>
                        </div>
                    </div>
                """)))}),format.raw/*121.18*/("""


                """),_display_(/*124.18*/if(entries.size() > 0)/*124.40*/ {_display_(Seq[Any](format.raw/*124.42*/("""
                    """),format.raw/*125.21*/("""<div class="col s8 offset-s2">
                        <h4>Reviewer List</h4>

                    </div>
                    <div class="col s2">
                        <button id = "speak-from-filter" hidden></button>

                        <div id="nasaText" hidden></div>
                        <div id="requestField"></div>
                        <div id="replyField"></div>
                    </div>
                    <div class="row">
                        <div class="col s6">
                            <h6 class="left">Showing results: """),_display_(/*138.64*/{
                                offset + 1
                            }),format.raw/*140.30*/(""" """),format.raw/*140.31*/("""to """),_display_(/*140.35*/{
                                offset + count
                            }),format.raw/*142.30*/(""" """),format.raw/*142.31*/("""of """),_display_(/*142.35*/total),format.raw/*142.40*/("""</h6>
                        </div>
                        <div class="col s6" style="padding-top: -5px;
                            margin-top: -2px">
                            <a class='dropdown-trigger btn-flat right' href='#' data-target='dropdown2' style="text-transform: none;
                                font-weight: bold;
                                color: black;
                                font-family: AmazonEmberBold, Helvetica Neue Bold, Helvetica Neue, Helvetica, Arial, sans-serif;
                            !important; ">
                                Sort By: &nbsp; <font color="#3a5dc3">
                                """),_display_(/*152.34*/if(sort.equals("id"))/*152.55*/{_display_(Seq[Any](format.raw/*152.56*/("""
                                    """),format.raw/*153.37*/("""Reviewer ID
                                """)))}/*154.34*/else/*154.39*/{_display_(Seq[Any](format.raw/*154.40*/("""
                                    """),format.raw/*155.37*/("""Reviewer Name
                                """)))}),format.raw/*156.34*/("""</font> <i class="material-icons right">expand_more</i></a>

                                <!-- Dropdown Structure -->
                            <ul id='dropdown2' class='dropdown-content'>
                                """),_display_(/*160.34*/if(listType.equals("all"))/*160.60*/{_display_(Seq[Any](format.raw/*160.61*/("""
                                    """),format.raw/*161.37*/("""<li><a href=""""),_display_(/*161.51*/routes/*161.57*/.ReviewerController.reviewerList(1, "id")),format.raw/*161.98*/("""" class="grey-text text-darken-4"><i class="material-icons">
                                        event</i>Reviewer ID</a></li>
                                    <li><a href=""""),_display_(/*163.51*/routes/*163.57*/.ReviewerController.reviewerList(1, "firstName")),format.raw/*163.105*/("""" class="grey-text text-darken-4"><i class="material-icons">
                                        sort_by_alpha</i>Reviewer Name </a></li>
                                """)))}/*165.34*/else/*165.38*/{_display_(Seq[Any](format.raw/*165.39*/("""
                                """),format.raw/*166.33*/("""<li>
                                    <a onclick="jumpToPage(1, 'id', '"""),_display_(/*167.71*/searchBody),format.raw/*167.81*/("""')">
                                        <i class="material-icons">event</i>Date Created
                                    </a>
                                </li>
                                <li>
                                    <a onclick="jumpToPage(1,  'firstName', '"""),_display_(/*172.79*/searchBody),format.raw/*172.89*/("""')">
                                        <i class="material-icons">sort_by_alpha</i>Name
                                    </a>
                                </li>
                                """)))}),format.raw/*176.34*/("""
                            """),format.raw/*177.29*/("""</ul>
                        </div>
                    </div>
                    <table class="centered responsive-table striped" id="userTable" >
                        <thead>
                            <tr class="list-header" style="border-bottom: 1px solid; !important;">
                                <th style="cursor: pointer;">Reviewer Id</th>
                                <th style="cursor: pointer;">Reviewer Name</th>
                                <th style="cursor: pointer;">Affiliation</th>
                                <th style="cursor: pointer;">Email</th>
                                <th style="cursor: pointer;">Research Areas</th>
                            </tr>
                        </thead>
                        <tbody>
                        """),_display_(/*191.26*/for((entry, index) <- entries.zipWithIndex) yield /*191.69*/ {_display_(Seq[Any](format.raw/*191.71*/("""
                            """),format.raw/*192.29*/("""<tr>
                                <td>"""),_display_(/*193.38*/entry/*193.43*/.getId()),format.raw/*193.51*/("""</td>

                                <td><a href = """"),_display_(/*195.49*/routes/*195.55*/.ReviewerController.reviewerDetailPage(entry.getId())),format.raw/*195.108*/("""">"""),_display_(/*195.111*/entry/*195.116*/.getFirstName()),format.raw/*195.131*/(""" """),_display_(/*195.133*/entry/*195.138*/.getLastName()),format.raw/*195.152*/("""</a></td>

                                """),_display_(/*197.34*/if(entry.getAffiliation() != "")/*197.66*/ {_display_(Seq[Any](format.raw/*197.68*/("""
                                    """),format.raw/*198.37*/("""<td><span class=""""),_display_(/*198.55*/entry/*198.60*/.getId()),format.raw/*198.68*/(""" """),format.raw/*198.69*/("""editable" data-name='summary'></span>
                                        """),_display_(/*199.42*/entry/*199.47*/.getAffiliation()),format.raw/*199.64*/("""
                                    """),format.raw/*200.37*/("""</td>
                                """)))}/*201.35*/else/*201.40*/{_display_(Seq[Any](format.raw/*201.41*/("""
                                    """),format.raw/*202.37*/("""<td><span class=""""),_display_(/*202.55*/entry/*202.60*/.getId()),format.raw/*202.68*/(""" """),format.raw/*202.69*/("""editable" data-name='summary'>&ensp; -</span></td>
                                """)))}),format.raw/*203.34*/("""

                                """),format.raw/*205.33*/("""<td>"""),_display_(/*205.38*/entry/*205.43*/.getEmail()),format.raw/*205.54*/("""</td>

                                """),_display_(/*207.34*/if(entry.getResearchFields() !="null" && entry.getResearchFields() != "")/*207.107*/ {_display_(Seq[Any](format.raw/*207.109*/("""
                                    """),format.raw/*208.37*/("""<td>"""),_display_(/*208.42*/entry/*208.47*/.getResearchFields()),format.raw/*208.67*/("""</td>
                                """)))}/*209.34*/else/*209.38*/{_display_(Seq[Any](format.raw/*209.39*/("""
                                    """),format.raw/*210.37*/("""<td>-</td>
                                """)))}),format.raw/*211.34*/("""


                                """),format.raw/*214.33*/("""</td>

                            </tr>
                        """)))}),format.raw/*217.26*/("""
                        """),format.raw/*218.25*/("""</tbody>
                    </table>

                    <div class="row">
                        <div class="col s12">
                            <ul class="pagination center-align">

                                """),_display_(/*225.34*/if(listType.equals("all"))/*225.60*/ {_display_(Seq[Any](format.raw/*225.62*/("""
                                    """),_display_(/*226.38*/if(pageNum == 1)/*226.54*/ {_display_(Seq[Any](format.raw/*226.56*/("""
                                        """),format.raw/*227.41*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">first_page</i></li>
                                        <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">chevron_left</i></li>
                                    """)))}/*229.38*/else/*229.42*/{_display_(Seq[Any](format.raw/*229.43*/("""
                                        """),format.raw/*230.41*/("""<li class="waves-effect"><a href=""""),_display_(/*230.76*/routes/*230.82*/.ReviewerController.reviewerList(1, sort)),format.raw/*230.123*/(""""><i class="material-icons">first_page</i></a></li>
                                        <li class="waves-effect"><a href=""""),_display_(/*231.76*/routes/*231.82*/.ReviewerController.reviewerList(pageNum - 1, sort)),format.raw/*231.133*/(""""><i class="material-icons">chevron_left</i></a></li>
                                    """)))}),format.raw/*232.38*/("""
                                    """),_display_(/*233.38*/if(beginIndexForPagination>1)/*233.67*/{_display_(Seq[Any](format.raw/*233.68*/("""
                                        """),format.raw/*234.41*/("""<li class="waves-effect modal-trigger" href="#allPageModal" style="cursor: pointer;
                                            font-size: 20px;
                                            font-weight: bold">...</li>
                                    """)))}),format.raw/*237.38*/("""
                                    """),_display_(/*238.38*/for(i <- (beginIndexForPagination + 0) to (endIndexForPagination + 0)) yield /*238.108*/ {_display_(Seq[Any](format.raw/*238.110*/("""
                                        """),format.raw/*239.41*/("""<li """),_display_(/*239.46*/if(pageNum == i)/*239.62*/ {_display_(Seq[Any](format.raw/*239.64*/("""
                                            """),format.raw/*240.45*/("""class="active"""")))}),format.raw/*240.60*/("""><a href=""""),_display_(/*240.71*/routes/*240.77*/.ReviewerController.reviewerList(i, sort)),format.raw/*240.118*/("""">"""),_display_(/*240.121*/i),format.raw/*240.122*/("""</a></li>
                                    """)))}),format.raw/*241.38*/("""
                                    """),_display_(/*242.38*/if(endIndexForPagination< ((total - 1) / pageLimit + 1))/*242.94*/{_display_(Seq[Any](format.raw/*242.95*/("""
                                        """),format.raw/*243.41*/("""<li class="waves-effect modal-trigger" href="#allPageModal" style="cursor: pointer;
                                            font-size: 20px;
                                            font-weight: bold">...</li>
                                    """)))}),format.raw/*246.38*/("""
                                    """),_display_(/*247.38*/if((offset + count) >= total)/*247.67*/ {_display_(Seq[Any](format.raw/*247.69*/("""
                                        """),format.raw/*248.41*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">chevron_right</i></li>
                                        <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">last_page</i></li>
                                    """)))}/*250.38*/else/*250.43*/{_display_(Seq[Any](format.raw/*250.44*/("""
                                        """),format.raw/*251.41*/("""<li class="waves-effect"><a href=""""),_display_(/*251.76*/routes/*251.82*/.ReviewerController.reviewerList(pageNum + 1, sort)),format.raw/*251.133*/(""""><i class="material-icons">chevron_right</i></a></li>
                                        <li class="waves-effect"><a href=""""),_display_(/*252.76*/routes/*252.82*/.ReviewerController.reviewerList((total-1)/pageLimit+1, sort)),format.raw/*252.143*/(""""><i class="material-icons">last_page</i></a></li>
                                    """)))}),format.raw/*253.38*/("""
                                """)))}/*254.34*/else/*254.38*/{_display_(Seq[Any](format.raw/*254.39*/("""
                                    """),_display_(/*255.38*/if(pageNum == 1)/*255.54*/ {_display_(Seq[Any](format.raw/*255.56*/("""
                                        """),format.raw/*256.41*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">first_page</i></li>
                                        <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">chevron_left</i></li>
                                    """)))}/*258.38*/else/*258.42*/{_display_(Seq[Any](format.raw/*258.43*/("""
                                        """),format.raw/*259.41*/("""<li class="waves-effect">
                                            <a href="#!" onclick="jumpToPage(1, '"""),_display_(/*260.83*/sort),format.raw/*260.87*/("""', '"""),_display_(/*260.92*/searchBody),format.raw/*260.102*/("""')">
                                                <i class="material-icons">first_page</i>
                                            </a>
                                        </li>
                                        <li class="waves-effect">
                                            <a href="#!" onclick="jumpToPage("""),_display_(/*265.79*/pageNum),format.raw/*265.86*/("""-1, '"""),_display_(/*265.92*/sort),format.raw/*265.96*/("""', '"""),_display_(/*265.101*/searchBody),format.raw/*265.111*/("""')">
                                                <i class="material-icons">chevron_left</i>
                                            </a>
                                        </li>
                                    """)))}),format.raw/*269.38*/("""
                                    """),_display_(/*270.38*/if(beginIndexForPagination>1)/*270.67*/{_display_(Seq[Any](format.raw/*270.68*/("""
                                        """),format.raw/*271.41*/("""<li class="waves-effect modal-trigger" href="#searchPageModal" style="cursor: pointer;
                                            font-size: 20px;
                                            font-weight: bold">...</li>
                                    """)))}),format.raw/*274.38*/("""
                                    """),_display_(/*275.38*/for(i <- (beginIndexForPagination + 0) to (endIndexForPagination + 0)) yield /*275.108*/ {_display_(Seq[Any](format.raw/*275.110*/("""
                                        """),format.raw/*276.41*/("""<li """),_display_(/*276.46*/if(pageNum == i)/*276.62*/ {_display_(Seq[Any](format.raw/*276.64*/("""
                                            """),format.raw/*277.45*/("""class="active"""")))}),format.raw/*277.60*/(""">
                                            <a href="#!" onclick="jumpToPage("""),_display_(/*278.79*/i),format.raw/*278.80*/(""", '"""),_display_(/*278.84*/sort),format.raw/*278.88*/("""', '"""),_display_(/*278.93*/searchBody),format.raw/*278.103*/("""')">
                                            """),_display_(/*279.46*/i),format.raw/*279.47*/("""
                                            """),format.raw/*280.45*/("""</a>
                                        </li>
                                    """)))}),format.raw/*282.38*/("""
                                    """),_display_(/*283.38*/if(endIndexForPagination< ((total - 1) / pageLimit + 1))/*283.94*/{_display_(Seq[Any](format.raw/*283.95*/("""
                                        """),format.raw/*284.41*/("""<li class="waves-effect modal-trigger" href="#searchPageModal" style="cursor: pointer;
                                            font-size: 20px;
                                            font-weight: bold">...</li>
                                    """)))}),format.raw/*287.38*/("""
                                    """),_display_(/*288.38*/if((offset + count) >= total)/*288.67*/ {_display_(Seq[Any](format.raw/*288.69*/("""
                                        """),format.raw/*289.41*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">chevron_right</i></li>
                                        <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">last_page</i></li>
                                    """)))}/*291.38*/else/*291.43*/{_display_(Seq[Any](format.raw/*291.44*/("""
                                        """),format.raw/*292.41*/("""<li class="waves-effect">
                                            <a href="#!" onclick="jumpToPage("""),_display_(/*293.79*/pageNum),format.raw/*293.86*/("""+1, '"""),_display_(/*293.92*/sort),format.raw/*293.96*/("""', '"""),_display_(/*293.101*/searchBody),format.raw/*293.111*/("""')">
                                                <i class="material-icons">chevron_right</i>
                                            </a>
                                        </li>
                                        <li class="waves-effect">
                                            <a href="#!" onclick="jumpToPage(("""),_display_(/*298.80*/total),format.raw/*298.85*/("""-1)/("""),_display_(/*298.91*/pageLimit),format.raw/*298.100*/(""")+1, '"""),_display_(/*298.107*/sort),format.raw/*298.111*/("""', '"""),_display_(/*298.116*/searchBody),format.raw/*298.126*/("""')">
                                                <i class="material-icons">last_page</i>
                                            </a>
                                        </li>
                                    """)))}),format.raw/*302.38*/("""
                                """)))}),format.raw/*303.34*/("""
                            """),format.raw/*304.29*/("""</ul>
                        </div>
                    </div>
                """)))}/*307.18*/else/*307.23*/{_display_(Seq[Any](format.raw/*307.24*/("""
                    """),format.raw/*308.21*/("""<h5>No Reviewer was found.</h5>
                """)))}),format.raw/*309.18*/("""

                """),format.raw/*311.17*/("""<div id="allPageModal" class="modal">
                    <div class="modal-content">
                        <h6>Select the page number you want to jump to</h6>
                        <div class="card z-depth-0">

                        """),_display_(/*316.26*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*316.83*/ {_display_(Seq[Any](format.raw/*316.85*/("""
                            """),format.raw/*317.29*/("""<ul class="pagination center-align">
                            """),_display_(/*318.30*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*318.69*/ {_display_(Seq[Any](format.raw/*318.71*/("""
                                """),_display_(/*319.34*/if(j <= ((total - 1)/(pageLimit) + 1))/*319.72*/ {_display_(Seq[Any](format.raw/*319.74*/("""
                                    """),_display_(/*320.38*/if(j != pageNum)/*320.54*/ {_display_(Seq[Any](format.raw/*320.56*/("""
                                        """),format.raw/*321.41*/("""<li class="waves-effect grey lighten-3"><a href='"""),_display_(/*321.91*/routes/*321.97*/.ReviewerController.reviewerList(j, sort)),format.raw/*321.138*/("""'>"""),_display_(/*321.141*/j),format.raw/*321.142*/("""</a></li>
                                    """)))}/*322.38*/else/*322.42*/{_display_(Seq[Any](format.raw/*322.43*/("""
                                        """),format.raw/*323.41*/("""<li class="waves-effect active"><a href=""""),_display_(/*323.83*/routes/*323.89*/.ReviewerController.reviewerList(j, sort)),format.raw/*323.130*/("""">"""),_display_(/*323.133*/j),format.raw/*323.134*/("""</a></li>
                                    """)))}),format.raw/*324.38*/("""
                                """)))}),format.raw/*325.34*/("""
                            """)))}),format.raw/*326.30*/("""
                            """),format.raw/*327.29*/("""</ul>
                        """)))}),format.raw/*328.26*/("""
                        """),format.raw/*329.25*/("""</div>
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

                        """),_display_(/*342.26*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*342.83*/ {_display_(Seq[Any](format.raw/*342.85*/("""
                            """),format.raw/*343.29*/("""<ul class="pagination center-align">
                            """),_display_(/*344.30*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*344.69*/ {_display_(Seq[Any](format.raw/*344.71*/("""
                                """),_display_(/*345.34*/if(j <= ((total - 1)/(pageLimit) + 1))/*345.72*/ {_display_(Seq[Any](format.raw/*345.74*/("""
                                    """),_display_(/*346.38*/if(j != pageNum)/*346.54*/ {_display_(Seq[Any](format.raw/*346.56*/("""
                                        """),format.raw/*347.41*/("""<li class="waves-effect grey lighten-3"><a href='#!' onclick="jumpToPage("""),_display_(/*347.115*/j),format.raw/*347.116*/(""", 'id', '"""),_display_(/*347.126*/searchBody),format.raw/*347.136*/("""')">"""),_display_(/*347.141*/j),format.raw/*347.142*/("""</a></li>
                                    """)))}/*348.38*/else/*348.42*/{_display_(Seq[Any](format.raw/*348.43*/("""
                                        """),format.raw/*349.41*/("""<li class="waves-effect active"><a href="#!" onclick="jumpToPage("""),_display_(/*349.107*/j),format.raw/*349.108*/(""", 'id', '"""),_display_(/*349.118*/searchBody),format.raw/*349.128*/("""')">"""),_display_(/*349.133*/j),format.raw/*349.134*/("""</a></li>
                                    """)))}),format.raw/*350.38*/("""
                                """)))}),format.raw/*351.34*/("""
                            """)))}),format.raw/*352.30*/("""
                            """),format.raw/*353.29*/("""</ul>
                        """)))}),format.raw/*354.26*/("""
                        """),format.raw/*355.25*/("""</div>
                    </div>
                    <div class="modal-footer">
                        <a href="#!" class="modal-close waves-effect waves-green btn-flat">
                            Cancel</a>
                    </div>
                </div>


            </div>
        </div>
    """)))}),format.raw/*366.6*/("""

"""))
      }
    }
  }

  def render(entries:List[Reviewer],isPrivateZone:Boolean,isCallerMySpacePage:Boolean,pageNum:Integer,sort:String,offset:Integer,total:Integer,count:Integer,listType:String,pageLimit:Integer,searchBody:String,reviewerName:String,id:Long,beginIndexForPagination:Integer,endIndexForPagination:Integer): play.twirl.api.HtmlFormat.Appendable = apply(entries,isPrivateZone,isCallerMySpacePage,pageNum,sort,offset,total,count,listType,pageLimit,searchBody,reviewerName,id,beginIndexForPagination,endIndexForPagination)

  def f:((List[Reviewer],Boolean,Boolean,Integer,String,Integer,Integer,Integer,String,Integer,String,String,Long,Integer,Integer) => play.twirl.api.HtmlFormat.Appendable) = (entries,isPrivateZone,isCallerMySpacePage,pageNum,sort,offset,total,count,listType,pageLimit,searchBody,reviewerName,id,beginIndexForPagination,endIndexForPagination) => apply(entries,isPrivateZone,isCallerMySpacePage,pageNum,sort,offset,total,count,listType,pageLimit,searchBody,reviewerName,id,beginIndexForPagination,endIndexForPagination)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:36 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/reviewerList.scala.html
                  HASH: 254bff768cb399ea15178d5a81aefe0d4299364b
                  MATRIX: 1232->1|1719->420|1748->442|1764->449|1845->453|1881->462|1938->492|1953->498|2012->536|2134->630|2163->631|2208->648|2282->695|2328->725|2368->727|2413->744|2452->755|2481->756|2510->757|2567->787|2583->794|2619->809|2750->913|2766->920|2809->942|2838->944|2854->951|2896->972|3101->1146|3146->1163|3441->1430|3470->1431|3562->1495|3591->1496|3636->1513|4341->2190|4370->2191|4414->2270|4455->2283|4509->2309|4538->2310|4583->2327|4618->2334|4647->2335|4696->2356|4788->2420|4817->2421|4870->2446|4953->2501|4982->2502|5060->2552|5089->2553|5140->2576|5169->2577|5218->2598|5329->2681|5358->2682|5401->2697|5430->2698|5462->2703|5540->2753|5569->2754|5614->2771|5759->2888|5788->2889|5820->2894|5874->414|5906->436|5938->2908|5971->2915|6006->2941|6046->2943|6082->2952|6197->3040|6229->3063|6269->3065|6318->3086|6782->3523|6808->3540|6847->3541|6912->3578|6982->3630|6995->3635|7034->3636|7099->3673|7171->3714|7228->3743|8836->5319|8884->5339|8916->5361|8957->5363|9007->5384|9593->5942|9689->6016|9719->6017|9751->6021|9851->6099|9881->6100|9913->6104|9940->6109|10628->6769|10659->6790|10699->6791|10765->6828|10830->6873|10844->6878|10884->6879|10950->6916|11029->6963|11284->7190|11320->7216|11360->7217|11426->7254|11468->7268|11484->7274|11547->7315|11756->7496|11772->7502|11843->7550|12038->7725|12052->7729|12092->7730|12154->7763|12257->7838|12289->7848|12604->8135|12636->8145|12873->8350|12931->8379|13753->9173|13813->9216|13854->9218|13912->9247|13982->9289|13997->9294|14027->9302|14110->9357|14126->9363|14202->9416|14234->9419|14250->9424|14288->9439|14319->9441|14335->9446|14372->9460|14444->9504|14486->9536|14527->9538|14593->9575|14639->9593|14654->9598|14684->9606|14714->9607|14821->9686|14836->9691|14875->9708|14941->9745|15000->9785|15014->9790|15054->9791|15120->9828|15166->9846|15181->9851|15211->9859|15241->9860|15357->9944|15420->9978|15453->9983|15468->9988|15501->9999|15569->10039|15653->10112|15695->10114|15761->10151|15794->10156|15809->10161|15851->10181|15910->10220|15924->10224|15964->10225|16030->10262|16106->10306|16170->10341|16268->10407|16322->10432|16572->10654|16608->10680|16649->10682|16715->10720|16741->10736|16782->10738|16852->10779|17159->11066|17173->11070|17213->11071|17283->11112|17346->11147|17362->11153|17426->11194|17581->11321|17597->11327|17671->11378|17794->11469|17860->11507|17899->11536|17939->11537|18009->11578|18295->11832|18361->11870|18449->11940|18491->11942|18561->11983|18594->11988|18620->12004|18661->12006|18735->12051|18782->12066|18821->12077|18837->12083|18901->12124|18933->12127|18957->12128|19036->12175|19102->12213|19168->12269|19208->12270|19278->12311|19564->12565|19630->12603|19669->12632|19710->12634|19780->12675|20087->12962|20101->12967|20141->12968|20211->13009|20274->13044|20290->13050|20364->13101|20522->13231|20538->13237|20622->13298|20742->13386|20796->13420|20810->13424|20850->13425|20916->13463|20942->13479|20983->13481|21053->13522|21360->13809|21374->13813|21414->13814|21484->13855|21620->13963|21646->13967|21679->13972|21712->13982|22073->14315|22102->14322|22136->14328|22162->14332|22196->14337|22229->14347|22489->14575|22555->14613|22594->14642|22634->14643|22704->14684|22993->14941|23059->14979|23147->15049|23189->15051|23259->15092|23292->15097|23318->15113|23359->15115|23433->15160|23480->15175|23588->15255|23611->15256|23643->15260|23669->15264|23702->15269|23735->15279|23813->15329|23836->15330|23910->15375|24030->15463|24096->15501|24162->15557|24202->15558|24272->15599|24561->15856|24627->15894|24666->15923|24707->15925|24777->15966|25084->16253|25098->16258|25138->16259|25208->16300|25340->16404|25369->16411|25403->16417|25429->16421|25463->16426|25496->16436|25861->16773|25888->16778|25922->16784|25954->16793|25990->16800|26017->16804|26051->16809|26084->16819|26341->17044|26407->17078|26465->17107|26566->17188|26580->17193|26620->17194|26670->17215|26751->17264|26798->17282|27067->17523|27141->17580|27182->17582|27240->17611|27334->17677|27390->17716|27431->17718|27493->17752|27541->17790|27582->17792|27648->17830|27674->17846|27715->17848|27785->17889|27863->17939|27879->17945|27943->17986|27975->17989|27999->17990|28066->18037|28080->18041|28120->18042|28190->18083|28260->18125|28276->18131|28340->18172|28372->18175|28396->18176|28475->18223|28541->18257|28603->18287|28661->18316|28724->18347|28778->18372|29329->18895|29403->18952|29444->18954|29502->18983|29596->19049|29652->19088|29693->19090|29755->19124|29803->19162|29844->19164|29910->19202|29936->19218|29977->19220|30047->19261|30150->19335|30174->19336|30213->19346|30246->19356|30280->19361|30304->19362|30371->19409|30385->19413|30425->19414|30495->19455|30590->19521|30614->19522|30653->19532|30686->19542|30720->19547|30744->19548|30823->19595|30889->19629|30951->19659|31009->19688|31072->19719|31126->19744|31460->20047
                  LINES: 35->1|50->14|52->16|52->16|54->16|55->17|55->17|55->17|55->17|57->19|57->19|58->20|59->21|59->21|59->21|60->22|60->22|60->22|60->22|61->23|61->23|61->23|64->26|64->26|64->26|64->26|64->26|64->26|67->29|68->30|76->38|76->38|77->39|77->39|78->40|94->56|94->56|98->60|99->61|99->61|99->61|100->62|100->62|100->62|101->63|102->64|102->64|103->65|104->66|104->66|106->68|106->68|106->68|106->68|107->69|108->70|108->70|109->71|109->71|110->72|112->74|112->74|113->75|116->78|116->78|117->79|119->13|120->15|121->80|123->82|123->82|123->82|124->83|129->88|129->88|129->88|130->89|135->94|135->94|135->94|136->95|137->96|137->96|137->96|138->97|139->98|140->99|162->121|165->124|165->124|165->124|166->125|179->138|181->140|181->140|181->140|183->142|183->142|183->142|183->142|193->152|193->152|193->152|194->153|195->154|195->154|195->154|196->155|197->156|201->160|201->160|201->160|202->161|202->161|202->161|202->161|204->163|204->163|204->163|206->165|206->165|206->165|207->166|208->167|208->167|213->172|213->172|217->176|218->177|232->191|232->191|232->191|233->192|234->193|234->193|234->193|236->195|236->195|236->195|236->195|236->195|236->195|236->195|236->195|236->195|238->197|238->197|238->197|239->198|239->198|239->198|239->198|239->198|240->199|240->199|240->199|241->200|242->201|242->201|242->201|243->202|243->202|243->202|243->202|243->202|244->203|246->205|246->205|246->205|246->205|248->207|248->207|248->207|249->208|249->208|249->208|249->208|250->209|250->209|250->209|251->210|252->211|255->214|258->217|259->218|266->225|266->225|266->225|267->226|267->226|267->226|268->227|270->229|270->229|270->229|271->230|271->230|271->230|271->230|272->231|272->231|272->231|273->232|274->233|274->233|274->233|275->234|278->237|279->238|279->238|279->238|280->239|280->239|280->239|280->239|281->240|281->240|281->240|281->240|281->240|281->240|281->240|282->241|283->242|283->242|283->242|284->243|287->246|288->247|288->247|288->247|289->248|291->250|291->250|291->250|292->251|292->251|292->251|292->251|293->252|293->252|293->252|294->253|295->254|295->254|295->254|296->255|296->255|296->255|297->256|299->258|299->258|299->258|300->259|301->260|301->260|301->260|301->260|306->265|306->265|306->265|306->265|306->265|306->265|310->269|311->270|311->270|311->270|312->271|315->274|316->275|316->275|316->275|317->276|317->276|317->276|317->276|318->277|318->277|319->278|319->278|319->278|319->278|319->278|319->278|320->279|320->279|321->280|323->282|324->283|324->283|324->283|325->284|328->287|329->288|329->288|329->288|330->289|332->291|332->291|332->291|333->292|334->293|334->293|334->293|334->293|334->293|334->293|339->298|339->298|339->298|339->298|339->298|339->298|339->298|339->298|343->302|344->303|345->304|348->307|348->307|348->307|349->308|350->309|352->311|357->316|357->316|357->316|358->317|359->318|359->318|359->318|360->319|360->319|360->319|361->320|361->320|361->320|362->321|362->321|362->321|362->321|362->321|362->321|363->322|363->322|363->322|364->323|364->323|364->323|364->323|364->323|364->323|365->324|366->325|367->326|368->327|369->328|370->329|383->342|383->342|383->342|384->343|385->344|385->344|385->344|386->345|386->345|386->345|387->346|387->346|387->346|388->347|388->347|388->347|388->347|388->347|388->347|388->347|389->348|389->348|389->348|390->349|390->349|390->349|390->349|390->349|390->349|390->349|391->350|392->351|393->352|394->353|395->354|396->355|407->366
                  -- GENERATED --
              */
          