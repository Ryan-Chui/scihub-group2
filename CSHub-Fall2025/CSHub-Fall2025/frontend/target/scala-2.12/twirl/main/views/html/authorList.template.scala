
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

object authorList extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template15[List[User],Boolean,Boolean,Integer,String,Integer,Integer,Integer,String,Integer,String,String,Long,Integer,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(entries: List[User],
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
        authorName: String,
        id: Long, beginIndexForPagination: Integer, endIndexForPagination: Integer ):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*14.2*/import helper._

def /*16.2*/scripts/*16.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*16.13*/("""
    """),format.raw/*17.5*/("""<script type = "module" src='"""),_display_(/*17.35*/routes/*17.41*/.Assets.at("javascripts/voiceJump.js")),format.raw/*17.79*/("""'></script>
    <link rel="stylesheet" href="/assets/stylesheets/responsive-table.css">
    <script type="text/javascript">
            $(document).ready(function () """),format.raw/*20.43*/("""{"""),format.raw/*20.44*/("""
                """),format.raw/*21.17*/("""$('.tooltipped').tooltip();
                $('.dropdown-trigger').dropdown();

                var nasaEndorsedAPIArray = []
                """),_display_(/*25.18*/for(i <- 0 until entries.size) yield /*25.48*/ {_display_(Seq[Any](format.raw/*25.50*/("""
                """),format.raw/*26.17*/("""var json = """),format.raw/*26.28*/("""{"""),format.raw/*26.29*/("""}"""),format.raw/*26.30*/(""";
                json.id = '"""),_display_(/*27.29*/entries/*27.36*/.get(i).getId()),format.raw/*27.51*/("""';
                json.url = "/author/userDetailPage/" + json.id;

                json.name = '"""),_display_(/*30.31*/entries/*30.38*/.get(i).getFirstName()),format.raw/*30.60*/(""" """),_display_(/*30.62*/entries/*30.69*/.get(i).getLastName()),format.raw/*30.90*/("""'.replace(/[^a-zA-Z0-9]/g, " ").replace(/  +/g, " ").trim();
                console.log("jsonhere:" + json)
                nasaEndorsedAPIArray.push(json)
                """)))}),format.raw/*33.18*/("""
                """),format.raw/*34.17*/("""$("#nasaText").text(JSON.stringify(nasaEndorsedAPIArray));

                $('.tooltipped').tooltip();

                // $("#speak-from-filter").click();
                // $("#speak-nasa").click();
                // $("#speak-from-filter").click();

            """),format.raw/*42.13*/("""}"""),format.raw/*42.14*/(""");

            var currentSort = """),format.raw/*44.31*/("""{"""),format.raw/*44.32*/("""
                """),format.raw/*45.17*/("""criteria: 'id',
                order: 'asc'
            """),format.raw/*47.13*/("""}"""),format.raw/*47.14*/(""";

            function sortTable(criteria) """),format.raw/*49.42*/("""{"""),format.raw/*49.43*/("""
                """),format.raw/*50.17*/("""var table = $('#userTable tbody');
                var rows = table.find('tr').get();
                var order = 'asc';

                if(currentSort.criteria === criteria) """),format.raw/*54.55*/("""{"""),format.raw/*54.56*/("""
                    """),format.raw/*55.21*/("""order = currentSort.order === 'asc' ? 'desc' : 'asc';
                """),format.raw/*56.17*/("""}"""),format.raw/*56.18*/("""

                """),format.raw/*58.17*/("""rows.sort(function(a, b) """),format.raw/*58.42*/("""{"""),format.raw/*58.43*/("""
                    """),format.raw/*59.21*/("""var keyA, keyB;

                    if(criteria === 'id') """),format.raw/*61.43*/("""{"""),format.raw/*61.44*/("""
                        """),format.raw/*62.25*/("""keyA = parseInt($(a).children('td').eq(0).text(), 10);
                        keyB = parseInt($(b).children('td').eq(0).text(), 10);
                    """),format.raw/*64.21*/("""}"""),format.raw/*64.22*/(""" """),format.raw/*64.23*/("""else if(criteria === 'firstName') """),format.raw/*64.57*/("""{"""),format.raw/*64.58*/("""
                        """),format.raw/*65.25*/("""keyA = $(a).children('td').eq(1).text().toUpperCase();
                        keyB = $(b).children('td').eq(1).text().toUpperCase();
                    """),format.raw/*67.21*/("""}"""),format.raw/*67.22*/("""

                    """),format.raw/*69.21*/("""if(order === 'asc') """),format.raw/*69.41*/("""{"""),format.raw/*69.42*/("""
                        """),format.raw/*70.25*/("""if(keyA < keyB) return -1;
                        if(keyA > keyB) return 1;
                    """),format.raw/*72.21*/("""}"""),format.raw/*72.22*/(""" """),format.raw/*72.23*/("""else """),format.raw/*72.28*/("""{"""),format.raw/*72.29*/("""
                        """),format.raw/*73.25*/("""if(keyA > keyB) return -1;
                        if(keyA < keyB) return 1;
                    """),format.raw/*75.21*/("""}"""),format.raw/*75.22*/("""
                    """),format.raw/*76.21*/("""return 0;
                """),format.raw/*77.17*/("""}"""),format.raw/*77.18*/(""");

                $.each(rows, function(index, row) """),format.raw/*79.51*/("""{"""),format.raw/*79.52*/("""
                    """),format.raw/*80.21*/("""table.append(row);
                """),format.raw/*81.17*/("""}"""),format.raw/*81.18*/(""");

                currentSort.criteria = criteria;
                currentSort.order = order;

                updateSortIcons(criteria, order);
            """),format.raw/*87.13*/("""}"""),format.raw/*87.14*/("""

            """),format.raw/*89.13*/("""function updateSortIcons(criteria, order) """),format.raw/*89.55*/("""{"""),format.raw/*89.56*/("""
                """),format.raw/*90.17*/("""$('#sortIconId').text('arrow_upward');
                $('#sortIconFirstName').text('arrow_upward');

                if(criteria === 'id') """),format.raw/*93.39*/("""{"""),format.raw/*93.40*/("""
                    """),format.raw/*94.21*/("""$('#sortIconId').text(order === 'asc' ? 'arrow_upward' : 'arrow_downward');
                """),format.raw/*95.17*/("""}"""),format.raw/*95.18*/(""" """),format.raw/*95.19*/("""else if(criteria === 'firstName') """),format.raw/*95.53*/("""{"""),format.raw/*95.54*/("""
                    """),format.raw/*96.21*/("""$('#sortIconFirstName').text(order === 'asc' ? 'arrow_upward' : 'arrow_downward');
                """),format.raw/*97.17*/("""}"""),format.raw/*97.18*/("""
            """),format.raw/*98.13*/("""}"""),format.raw/*98.14*/("""

            """),format.raw/*100.13*/("""function jumpToPage(pageNum, sort, searchString) """),format.raw/*100.62*/("""{"""),format.raw/*100.63*/("""
                """),format.raw/*101.17*/("""pageNum = Math.floor(pageNum);
                var url = "/author/searchPOST?pageNum=" + (pageNum) + "&sortCriteria="+sort;
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
            """),format.raw/*117.13*/("""}"""),format.raw/*117.14*/("""



            """),format.raw/*121.76*/("""
            """),format.raw/*122.13*/("""function changeView(view) """),format.raw/*122.39*/("""{"""),format.raw/*122.40*/("""
                """),format.raw/*123.17*/("""$.ajax("""),format.raw/*123.24*/("""{"""),format.raw/*123.25*/("""
                    """),format.raw/*124.21*/("""url: "/updateProjectZone/" + view,
                    headers: """),format.raw/*125.30*/("""{"""),format.raw/*125.31*/("""
                        """),format.raw/*126.25*/("""'Content-Type': 'application/json'
                    """),format.raw/*127.21*/("""}"""),format.raw/*127.22*/(""",
                    type: "GET"
                """),format.raw/*129.17*/("""}"""),format.raw/*129.18*/(""").done(function (data) """),format.raw/*129.41*/("""{"""),format.raw/*129.42*/("""
                    """),format.raw/*130.21*/("""window.location.href = "/author/authorList/1?sortCriteria=id";
                """),format.raw/*131.17*/("""}"""),format.raw/*131.18*/(""");
            """),format.raw/*132.13*/("""}"""),format.raw/*132.14*/("""
    """),format.raw/*133.5*/("""</script>
    <style>
            .follow-fab """),format.raw/*135.25*/("""{"""),format.raw/*135.26*/("""
                """),format.raw/*136.17*/("""top: -20px !important;
                bottom: auto !important;
                right: -20px !important;
            """),format.raw/*139.13*/("""}"""),format.raw/*139.14*/("""
    """),format.raw/*140.5*/("""</style>
""")))};
Seq[Any](format.raw/*13.85*/("""
"""),format.raw/*15.1*/("""
"""),format.raw/*141.2*/("""

"""),_display_(/*143.2*/main("All Users", scripts)/*143.28*/ {_display_(Seq[Any](format.raw/*143.30*/("""
    """),format.raw/*144.5*/("""<div class="container">
        <div class="card-panel center">
            """),_display_(/*146.14*/if(isCallerMySpacePage)/*146.37*/ {_display_(Seq[Any](format.raw/*146.39*/("""
                """),format.raw/*147.17*/("""<div class="row card-panel z-depth-0 project-zone-panel">
                    <div class="col s12" style="margin-top: -10px;
                        margin-bottom: -10px;">
                        <h6 class="left tooltipped" data-position="bottom" data-tooltip="This list shows all the APIs associated with your current project zone." >
                            Current Project Zone :
                            """),_display_(/*152.30*/if(isPrivateZone)/*152.47*/{_display_(Seq[Any](format.raw/*152.48*/("""
                                """),format.raw/*153.33*/("""Your Private Zone
                            """)))}/*154.31*/else/*154.36*/{_display_(Seq[Any](format.raw/*154.37*/("""
                                """),format.raw/*155.33*/("""OpenNEX
                        """)))}),format.raw/*156.26*/("""
                        """),format.raw/*157.25*/("""</h6>

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
            """)))}),format.raw/*179.14*/("""


            """),_display_(/*182.14*/if(entries.size() > 0)/*182.36*/ {_display_(Seq[Any](format.raw/*182.38*/("""
                """),format.raw/*183.17*/("""<div class="col s8 offset-s2">
                    <h4>Researcher List</h4>

                </div>
                <div class="col s2">
                    <button id = "speak-from-filter" hidden></button>

                    <div id="nasaText" hidden></div>
                    <div id="requestField"></div>
                    <div id="replyField"></div>
                </div>
                <div class="row">
                    <div class="col s6">
                        <h6 class="left">Showing results: """),_display_(/*196.60*/{
                            offset + 1
                        }),format.raw/*198.26*/(""" """),format.raw/*198.27*/("""to """),_display_(/*198.31*/{
                            offset + count
                        }),format.raw/*200.26*/(""" """),format.raw/*200.27*/("""of """),_display_(/*200.31*/total),format.raw/*200.36*/("""</h6>
                    </div>
                    <div class="col s6" style="padding-top: -5px;
                        margin-top: -2px">
                        <a class='dropdown-trigger btn-flat right' href='#' data-target='dropdown2' style="text-transform: none;
                            font-weight: bold;
                            color: black;
                            font-family: AmazonEmberBold, Helvetica Neue Bold, Helvetica Neue, Helvetica, Arial, sans-serif;
                        !important; ">
                            Sort By: &nbsp; <font color="#3a5dc3">
                        """),_display_(/*210.26*/if(sort.equals("id"))/*210.47*/{_display_(Seq[Any](format.raw/*210.48*/("""
                            """),format.raw/*211.29*/("""Researcher ID
                        """)))}/*212.26*/else/*212.31*/{_display_(Seq[Any](format.raw/*212.32*/("""
                            """),format.raw/*213.29*/("""Researcher Name
                        """)))}),format.raw/*214.26*/("""</font> <i class="material-icons right">expand_more</i></a>

                            <!-- Dropdown Structure -->
                        <ul id='dropdown2' class='dropdown-content'>
                        """),_display_(/*218.26*/if(listType.equals("all"))/*218.52*/{_display_(Seq[Any](format.raw/*218.53*/("""
                            """),format.raw/*224.31*/("""
                            """),format.raw/*225.29*/("""<li>
                                <a href="#" onclick="sortTable('id')" class="grey-text text-darken-4">
                                    <i class="material-icons">event</i>Researcher ID
                                </a>
                            </li>
                            <li>
                                <a href="#" onclick="sortTable('firstName')" class="grey-text text-darken-4">
                                    <i class="material-icons">sort_by_alpha</i>Researcher Name
                                </a>
                            </li>
                        """)))}/*235.26*/else/*235.30*/{_display_(Seq[Any](format.raw/*235.31*/("""
                            """),format.raw/*236.29*/("""<li>
                                <a onclick="jumpToPage(1, 'id', '"""),_display_(/*237.67*/searchBody),format.raw/*237.77*/("""')">
                                    <i class="material-icons">event</i>Date Created
                                </a>
                            </li>
                            <li>
                                <a onclick="jumpToPage(1,  'firstName', '"""),_display_(/*242.75*/searchBody),format.raw/*242.85*/("""')">
                                    <i class="material-icons">sort_by_alpha</i>Name
                                </a>
                            </li>
                        """)))}),format.raw/*246.26*/("""
                        """),format.raw/*247.25*/("""</ul>
                    </div>
                </div>
                <div class="desktop-table-view">
                    <div class="table-responsive">
                        <table class="centered responsive-table striped" id="projectTable" >
                            <thead>
                                <tr class="list-header" style="border-bottom: 1px solid; !important;">
                                    <th style="cursor: pointer;">Researcher Id</th>
                                    <th style="cursor: pointer;">Researcher Name</th>
                            """),format.raw/*257.110*/("""
                                    """),format.raw/*258.37*/("""<th style="cursor: pointer;">Email</th>
                                    <th style="cursor: pointer;">Research Areas</th>
                                </tr>
                            </thead>
                            <tbody>
                            """),_display_(/*263.30*/for((entry, index) <- entries.zipWithIndex) yield /*263.73*/ {_display_(Seq[Any](format.raw/*263.75*/("""
                                """),format.raw/*264.33*/("""<tr>
                                    <td>"""),_display_(/*265.42*/entry/*265.47*/.getId()),format.raw/*265.55*/("""</td>

                            """),format.raw/*267.170*/("""
                                    """),format.raw/*268.37*/("""<td><a href = """"),_display_(/*268.53*/routes/*268.59*/.AuthorController.authorDetailPage(entry.getId())),format.raw/*268.108*/("""">"""),_display_(/*268.111*/entry/*268.116*/.getUserName()),format.raw/*268.130*/(""" """),format.raw/*268.131*/("""</a></td>

                            """),format.raw/*270.100*/("""
                            """),format.raw/*271.138*/("""
                            """),format.raw/*272.96*/("""
                            """),format.raw/*273.74*/("""
                            """),format.raw/*274.73*/("""
                            """),format.raw/*275.151*/("""
                            """),format.raw/*276.66*/("""

                                    """),format.raw/*278.37*/("""<td>"""),_display_(/*278.42*/entry/*278.47*/.getEmail()),format.raw/*278.58*/("""</td>

                                    """),_display_(/*280.38*/if(entry.getResearchFields() !="null" && entry.getResearchFields() != "")/*280.111*/ {_display_(Seq[Any](format.raw/*280.113*/("""
                                        """),format.raw/*281.41*/("""<td>"""),_display_(/*281.46*/entry/*281.51*/.getResearchFields()),format.raw/*281.71*/("""</td>
                                    """)))}/*282.38*/else/*282.42*/{_display_(Seq[Any](format.raw/*282.43*/("""
                                        """),format.raw/*283.41*/("""<td>-</td>
                                    """)))}),format.raw/*284.38*/("""
                                """),format.raw/*285.33*/("""</tr>
                            """)))}),format.raw/*286.30*/("""
                            """),format.raw/*287.29*/("""</tbody>
                        </table>
                    </div>
                </div>

                <div class="mobile-table-view">
                    """),_display_(/*293.22*/for(entry <- entries.asScala) yield /*293.51*/ {_display_(Seq[Any](format.raw/*293.53*/("""
                        """),format.raw/*294.25*/("""<div class="card-panel z-depth-1" style="margin-bottom: 16px;">

                                <!-- Researcher Id -->
                            <div><h6>Researcher Id:</h6> """),_display_(/*297.59*/entry/*297.64*/.getId()),format.raw/*297.72*/("""</div>

                                <!-- Researcher Name -->
                            <div><h6>Researcher Name:</h6>
                                <a href = """"),_display_(/*301.45*/routes/*301.51*/.AuthorController.authorDetailPage(entry.getId())),format.raw/*301.100*/("""">"""),_display_(/*301.103*/entry/*301.108*/.getUserName()),format.raw/*301.122*/(""" """),format.raw/*301.123*/("""</a>
                            </div>

                                <!-- Email -->
                            <div><h6>Email:</h6> """),_display_(/*305.51*/entry/*305.56*/.getEmail()),format.raw/*305.67*/("""</div>


                                <!-- Research Areas -->
                            <div><h6>Research Areas:</h6>
                                """),_display_(/*310.34*/if(entry.getResearchFields() !="null" && entry.getResearchFields() != "")/*310.107*/ {_display_(Seq[Any](format.raw/*310.109*/("""
                                    """),format.raw/*311.37*/("""<td>"""),_display_(/*311.42*/entry/*311.47*/.getResearchFields()),format.raw/*311.67*/("""</td>
                                """)))}/*312.34*/else/*312.38*/{_display_(Seq[Any](format.raw/*312.39*/("""
                                    """),format.raw/*313.37*/("""<td>-</td>
                                """)))}),format.raw/*314.34*/("""
                            """),format.raw/*315.29*/("""</div>

                        </div>
                    """)))}),format.raw/*318.22*/("""
                """),format.raw/*319.17*/("""</div>

                <div class="row">
                    <div class="col s12">
                        <ul class="pagination center-align">

                        """),_display_(/*325.26*/if(listType.equals("all"))/*325.52*/ {_display_(Seq[Any](format.raw/*325.54*/("""
                            """),_display_(/*326.30*/if(pageNum == 1)/*326.46*/ {_display_(Seq[Any](format.raw/*326.48*/("""
                                """),format.raw/*327.33*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">first_page</i></li>
                                <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">chevron_left</i></li>
                            """)))}/*329.30*/else/*329.34*/{_display_(Seq[Any](format.raw/*329.35*/("""
                                """),format.raw/*330.33*/("""<li class="waves-effect"><a href=""""),_display_(/*330.68*/routes/*330.74*/.AuthorController.authorList(1, sort)),format.raw/*330.111*/(""""><i class="material-icons">first_page</i></a></li>
                                <li class="waves-effect"><a href=""""),_display_(/*331.68*/routes/*331.74*/.AuthorController.authorList(pageNum - 1, sort)),format.raw/*331.121*/(""""><i class="material-icons">chevron_left</i></a></li>
                            """)))}),format.raw/*332.30*/("""
                            """),_display_(/*333.30*/if(beginIndexForPagination>1)/*333.59*/{_display_(Seq[Any](format.raw/*333.60*/("""
                                """),format.raw/*334.33*/("""<li class="waves-effect modal-trigger" href="#allPageModal" style="cursor: pointer;
                                    font-size: 20px;
                                    font-weight: bold">...</li>
                            """)))}),format.raw/*337.30*/("""
                            """),_display_(/*338.30*/for(i <- (beginIndexForPagination + 0) to (endIndexForPagination + 0)) yield /*338.100*/ {_display_(Seq[Any](format.raw/*338.102*/("""
                                """),format.raw/*339.33*/("""<li """),_display_(/*339.38*/if(pageNum == i)/*339.54*/ {_display_(Seq[Any](format.raw/*339.56*/("""
                                    """),format.raw/*340.37*/("""class="active"""")))}),format.raw/*340.52*/("""><a href=""""),_display_(/*340.63*/routes/*340.69*/.AuthorController.authorList(i, sort)),format.raw/*340.106*/("""">"""),_display_(/*340.109*/i),format.raw/*340.110*/("""</a></li>
                            """)))}),format.raw/*341.30*/("""
                            """),_display_(/*342.30*/if(endIndexForPagination< ((total - 1) / pageLimit + 1))/*342.86*/{_display_(Seq[Any](format.raw/*342.87*/("""
                                """),format.raw/*343.33*/("""<li class="waves-effect modal-trigger" href="#allPageModal" style="cursor: pointer;
                                    font-size: 20px;
                                    font-weight: bold">...</li>
                            """)))}),format.raw/*346.30*/("""
                            """),_display_(/*347.30*/if((offset + count) >= total)/*347.59*/ {_display_(Seq[Any](format.raw/*347.61*/("""
                                """),format.raw/*348.33*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">chevron_right</i></li>
                                <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">last_page</i></li>
                            """)))}/*350.30*/else/*350.35*/{_display_(Seq[Any](format.raw/*350.36*/("""
                                """),format.raw/*351.33*/("""<li class="waves-effect"><a href=""""),_display_(/*351.68*/routes/*351.74*/.AuthorController.authorList(pageNum + 1, sort)),format.raw/*351.121*/(""""><i class="material-icons">chevron_right</i></a></li>
                                <li class="waves-effect"><a href=""""),_display_(/*352.68*/routes/*352.74*/.AuthorController.authorList((total-1)/pageLimit+1, sort)),format.raw/*352.131*/(""""><i class="material-icons">last_page</i></a></li>
                            """)))}),format.raw/*353.30*/("""
                        """)))}/*354.26*/else/*354.30*/{_display_(Seq[Any](format.raw/*354.31*/("""
                            """),_display_(/*355.30*/if(pageNum == 1)/*355.46*/ {_display_(Seq[Any](format.raw/*355.48*/("""
                                """),format.raw/*356.33*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">first_page</i></li>
                                <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">chevron_left</i></li>
                            """)))}/*358.30*/else/*358.34*/{_display_(Seq[Any](format.raw/*358.35*/("""
                                """),format.raw/*359.33*/("""<li class="waves-effect">
                                    <a href="#!" onclick="jumpToPage(1, '"""),_display_(/*360.75*/sort),format.raw/*360.79*/("""', '"""),_display_(/*360.84*/searchBody),format.raw/*360.94*/("""')">
                                        <i class="material-icons">first_page</i>
                                    </a>
                                </li>
                                <li class="waves-effect">
                                    <a href="#!" onclick="jumpToPage("""),_display_(/*365.71*/pageNum),format.raw/*365.78*/("""-1, '"""),_display_(/*365.84*/sort),format.raw/*365.88*/("""', '"""),_display_(/*365.93*/searchBody),format.raw/*365.103*/("""')">
                                        <i class="material-icons">chevron_left</i>
                                    </a>
                                </li>
                            """)))}),format.raw/*369.30*/("""
                            """),_display_(/*370.30*/if(beginIndexForPagination>1)/*370.59*/{_display_(Seq[Any](format.raw/*370.60*/("""
                                """),format.raw/*371.33*/("""<li class="waves-effect modal-trigger" href="#searchPageModal" style="cursor: pointer;
                                    font-size: 20px;
                                    font-weight: bold">...</li>
                            """)))}),format.raw/*374.30*/("""
                            """),_display_(/*375.30*/for(i <- (beginIndexForPagination + 0) to (endIndexForPagination + 0)) yield /*375.100*/ {_display_(Seq[Any](format.raw/*375.102*/("""
                                """),format.raw/*376.33*/("""<li """),_display_(/*376.38*/if(pageNum == i)/*376.54*/ {_display_(Seq[Any](format.raw/*376.56*/("""
                                    """),format.raw/*377.37*/("""class="active"""")))}),format.raw/*377.52*/(""">
                                    <a href="#!" onclick="jumpToPage("""),_display_(/*378.71*/i),format.raw/*378.72*/(""", '"""),_display_(/*378.76*/sort),format.raw/*378.80*/("""', '"""),_display_(/*378.85*/searchBody),format.raw/*378.95*/("""')">
                                    """),_display_(/*379.38*/i),format.raw/*379.39*/("""
                                    """),format.raw/*380.37*/("""</a>
                                </li>
                            """)))}),format.raw/*382.30*/("""
                            """),_display_(/*383.30*/if(endIndexForPagination< ((total - 1) / pageLimit + 1))/*383.86*/{_display_(Seq[Any](format.raw/*383.87*/("""
                                """),format.raw/*384.33*/("""<li class="waves-effect modal-trigger" href="#searchPageModal" style="cursor: pointer;
                                    font-size: 20px;
                                    font-weight: bold">...</li>
                            """)))}),format.raw/*387.30*/("""
                            """),_display_(/*388.30*/if((offset + count) >= total)/*388.59*/ {_display_(Seq[Any](format.raw/*388.61*/("""
                                """),format.raw/*389.33*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">chevron_right</i></li>
                                <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">last_page</i></li>
                            """)))}/*391.30*/else/*391.35*/{_display_(Seq[Any](format.raw/*391.36*/("""
                                """),format.raw/*392.33*/("""<li class="waves-effect">
                                    <a href="#!" onclick="jumpToPage("""),_display_(/*393.71*/pageNum),format.raw/*393.78*/("""+1, '"""),_display_(/*393.84*/sort),format.raw/*393.88*/("""', '"""),_display_(/*393.93*/searchBody),format.raw/*393.103*/("""')">
                                        <i class="material-icons">chevron_right</i>
                                    </a>
                                </li>
                                <li class="waves-effect">
                                    <a href="#!" onclick="jumpToPage(("""),_display_(/*398.72*/total),format.raw/*398.77*/("""-1)/("""),_display_(/*398.83*/pageLimit),format.raw/*398.92*/(""")+1, '"""),_display_(/*398.99*/sort),format.raw/*398.103*/("""', '"""),_display_(/*398.108*/searchBody),format.raw/*398.118*/("""')">
                                        <i class="material-icons">last_page</i>
                                    </a>
                                </li>
                            """)))}),format.raw/*402.30*/("""
                        """)))}),format.raw/*403.26*/("""
                        """),format.raw/*404.25*/("""</ul>
                    </div>
                </div>
            """)))}/*407.14*/else/*407.19*/{_display_(Seq[Any](format.raw/*407.20*/("""
                """),format.raw/*408.17*/("""<h5>No researcher was found.</h5>
            """)))}),format.raw/*409.14*/("""

            """),format.raw/*411.13*/("""<div id="allPageModal" class="modal">
                <div class="modal-content">
                    <h6>Select the page number you want to jump to</h6>
                    <div class="card z-depth-0">

                    """),_display_(/*416.22*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*416.79*/ {_display_(Seq[Any](format.raw/*416.81*/("""
                        """),format.raw/*417.25*/("""<ul class="pagination center-align">
                        """),_display_(/*418.26*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*418.65*/ {_display_(Seq[Any](format.raw/*418.67*/("""
                            """),_display_(/*419.30*/if(j <= ((total - 1)/(pageLimit) + 1))/*419.68*/ {_display_(Seq[Any](format.raw/*419.70*/("""
                                """),_display_(/*420.34*/if(j != pageNum)/*420.50*/ {_display_(Seq[Any](format.raw/*420.52*/("""
                                    """),format.raw/*421.37*/("""<li class="waves-effect grey lighten-3"><a href='"""),_display_(/*421.87*/routes/*421.93*/.AuthorController.authorList(j, sort)),format.raw/*421.130*/("""'>"""),_display_(/*421.133*/j),format.raw/*421.134*/("""</a></li>
                                """)))}/*422.34*/else/*422.38*/{_display_(Seq[Any](format.raw/*422.39*/("""
                                    """),format.raw/*423.37*/("""<li class="waves-effect active"><a href=""""),_display_(/*423.79*/routes/*423.85*/.AuthorController.authorList(j, sort)),format.raw/*423.122*/("""">"""),_display_(/*423.125*/j),format.raw/*423.126*/("""</a></li>
                                """)))}),format.raw/*424.34*/("""
                            """)))}),format.raw/*425.30*/("""
                        """)))}),format.raw/*426.26*/("""
                        """),format.raw/*427.25*/("""</ul>
                    """)))}),format.raw/*428.22*/("""
                    """),format.raw/*429.21*/("""</div>
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

                    """),_display_(/*442.22*/for(i <- (0) to ((((total - 1)/(pageLimit) + 1) - 1)/10)) yield /*442.79*/ {_display_(Seq[Any](format.raw/*442.81*/("""
                        """),format.raw/*443.25*/("""<ul class="pagination center-align">
                        """),_display_(/*444.26*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*444.65*/ {_display_(Seq[Any](format.raw/*444.67*/("""
                            """),_display_(/*445.30*/if(j <= ((total - 1)/(pageLimit) + 1))/*445.68*/ {_display_(Seq[Any](format.raw/*445.70*/("""
                                """),_display_(/*446.34*/if(j != pageNum)/*446.50*/ {_display_(Seq[Any](format.raw/*446.52*/("""
                                    """),format.raw/*447.37*/("""<li class="waves-effect grey lighten-3"><a href='#!' onclick="jumpToPage("""),_display_(/*447.111*/j),format.raw/*447.112*/(""", 'id', '"""),_display_(/*447.122*/searchBody),format.raw/*447.132*/("""')">"""),_display_(/*447.137*/j),format.raw/*447.138*/("""</a></li>
                                """)))}/*448.34*/else/*448.38*/{_display_(Seq[Any](format.raw/*448.39*/("""
                                    """),format.raw/*449.37*/("""<li class="waves-effect active"><a href="#!" onclick="jumpToPage("""),_display_(/*449.103*/j),format.raw/*449.104*/(""", 'id', '"""),_display_(/*449.114*/searchBody),format.raw/*449.124*/("""')">"""),_display_(/*449.129*/j),format.raw/*449.130*/("""</a></li>
                                """)))}),format.raw/*450.34*/("""
                            """)))}),format.raw/*451.30*/("""
                        """)))}),format.raw/*452.26*/("""
                        """),format.raw/*453.25*/("""</ul>
                    """)))}),format.raw/*454.22*/("""
                    """),format.raw/*455.21*/("""</div>
                </div>
                <div class="modal-footer">
                    <a href="#!" class="modal-close waves-effect waves-green btn-flat">
                        Cancel</a>
                </div>
            </div>


        </div>
    </div>
""")))}),format.raw/*466.2*/("""

"""))
      }
    }
  }

  def render(entries:List[User],isPrivateZone:Boolean,isCallerMySpacePage:Boolean,pageNum:Integer,sort:String,offset:Integer,total:Integer,count:Integer,listType:String,pageLimit:Integer,searchBody:String,authorName:String,id:Long,beginIndexForPagination:Integer,endIndexForPagination:Integer): play.twirl.api.HtmlFormat.Appendable = apply(entries,isPrivateZone,isCallerMySpacePage,pageNum,sort,offset,total,count,listType,pageLimit,searchBody,authorName,id,beginIndexForPagination,endIndexForPagination)

  def f:((List[User],Boolean,Boolean,Integer,String,Integer,Integer,Integer,String,Integer,String,String,Long,Integer,Integer) => play.twirl.api.HtmlFormat.Appendable) = (entries,isPrivateZone,isCallerMySpacePage,pageNum,sort,offset,total,count,listType,pageLimit,searchBody,authorName,id,beginIndexForPagination,endIndexForPagination) => apply(entries,isPrivateZone,isCallerMySpacePage,pageNum,sort,offset,total,count,listType,pageLimit,searchBody,authorName,id,beginIndexForPagination,endIndexForPagination)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:29 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/authorList.scala.html
                  HASH: 74c085ac2a0caaff36038707d3700ff4e930747f
                  MATRIX: 1226->1|1707->410|1736->428|1751->435|1832->439|1864->444|1921->474|1936->480|1995->518|2189->684|2218->685|2263->702|2433->845|2479->875|2519->877|2564->894|2603->905|2632->906|2661->907|2718->937|2734->944|2770->959|2895->1057|2911->1064|2954->1086|2983->1088|2999->1095|3041->1116|3246->1290|3291->1307|3586->1574|3615->1575|3677->1609|3706->1610|3751->1627|3836->1684|3865->1685|3937->1729|3966->1730|4011->1747|4215->1923|4244->1924|4293->1945|4391->2015|4420->2016|4466->2034|4519->2059|4548->2060|4597->2081|4684->2140|4713->2141|4766->2166|4948->2320|4977->2321|5006->2322|5068->2356|5097->2357|5150->2382|5332->2536|5361->2537|5411->2559|5459->2579|5488->2580|5541->2605|5666->2702|5695->2703|5724->2704|5757->2709|5786->2710|5839->2735|5964->2832|5993->2833|6042->2854|6096->2880|6125->2881|6207->2935|6236->2936|6285->2957|6348->2992|6377->2993|6564->3152|6593->3153|6635->3167|6705->3209|6734->3210|6779->3227|6947->3367|6976->3368|7025->3389|7145->3481|7174->3482|7203->3483|7265->3517|7294->3518|7343->3539|7470->3638|7499->3639|7540->3652|7569->3653|7612->3667|7690->3716|7720->3717|7766->3734|8470->4409|8500->4410|8545->4489|8587->4502|8642->4528|8672->4529|8718->4546|8754->4553|8784->4554|8834->4575|8927->4639|8957->4640|9011->4665|9095->4720|9125->4721|9204->4771|9234->4772|9286->4795|9316->4796|9366->4817|9474->4896|9504->4897|9548->4912|9578->4913|9611->4918|9686->4964|9716->4965|9762->4982|9908->5099|9938->5100|9971->5105|10021->408|10049->426|10078->5115|10108->5118|10144->5144|10185->5146|10218->5151|10323->5228|10356->5251|10397->5253|10443->5270|10888->5687|10915->5704|10955->5705|11017->5738|11084->5786|11098->5791|11138->5792|11200->5825|11265->5858|11319->5883|12843->7375|12887->7391|12919->7413|12960->7415|13006->7432|13550->7948|13638->8014|13668->8015|13700->8019|13792->8089|13822->8090|13854->8094|13881->8099|14525->8715|14556->8736|14596->8737|14654->8766|14713->8805|14727->8810|14767->8811|14825->8840|14898->8881|15137->9092|15173->9118|15213->9119|15271->9607|15329->9636|15947->10234|15961->10238|16001->10239|16059->10268|16158->10339|16190->10349|16485->10616|16517->10626|16734->10811|16788->10836|17404->11503|17470->11540|17763->11805|17823->11848|17864->11850|17926->11883|18000->11929|18015->11934|18045->11942|18110->12118|18176->12155|18220->12171|18236->12177|18308->12226|18340->12229|18356->12234|18393->12248|18424->12249|18493->12359|18552->12497|18610->12593|18668->12667|18726->12740|18785->12891|18843->12957|18910->12995|18943->13000|18958->13005|18991->13016|19063->13060|19147->13133|19189->13135|19259->13176|19292->13181|19307->13186|19349->13206|19412->13249|19426->13253|19466->13254|19536->13295|19616->13343|19678->13376|19745->13411|19803->13440|19993->13602|20039->13631|20080->13633|20134->13658|20340->13836|20355->13841|20385->13849|20581->14017|20597->14023|20669->14072|20701->14075|20717->14080|20754->14094|20785->14095|20951->14233|20966->14238|20999->14249|21183->14405|21267->14478|21309->14480|21375->14517|21408->14522|21423->14527|21465->14547|21524->14586|21538->14590|21578->14591|21644->14628|21720->14672|21778->14701|21870->14761|21916->14778|22115->14949|22151->14975|22192->14977|22250->15007|22276->15023|22317->15025|22379->15058|22670->15329|22684->15333|22724->15334|22786->15367|22849->15402|22865->15408|22925->15445|23072->15564|23088->15570|23158->15617|23273->15700|23331->15730|23370->15759|23410->15760|23472->15793|23734->16023|23792->16053|23880->16123|23922->16125|23984->16158|24017->16163|24043->16179|24084->16181|24150->16218|24197->16233|24236->16244|24252->16250|24312->16287|24344->16290|24368->16291|24439->16330|24497->16360|24563->16416|24603->16417|24665->16450|24927->16680|24985->16710|25024->16739|25065->16741|25127->16774|25418->17045|25432->17050|25472->17051|25534->17084|25597->17119|25613->17125|25683->17172|25833->17294|25849->17300|25929->17357|26041->17437|26087->17463|26101->17467|26141->17468|26199->17498|26225->17514|26266->17516|26328->17549|26619->17820|26633->17824|26673->17825|26735->17858|26863->17958|26889->17962|26922->17967|26954->17977|27275->18270|27304->18277|27338->18283|27364->18287|27397->18292|27430->18302|27658->18498|27716->18528|27755->18557|27795->18558|27857->18591|28122->18824|28180->18854|28268->18924|28310->18926|28372->18959|28405->18964|28431->18980|28472->18982|28538->19019|28585->19034|28685->19106|28708->19107|28740->19111|28766->19115|28799->19120|28831->19130|28901->19172|28924->19173|28990->19210|29094->19282|29152->19312|29218->19368|29258->19369|29320->19402|29585->19635|29643->19665|29682->19694|29723->19696|29785->19729|30076->20000|30090->20005|30130->20006|30192->20039|30316->20135|30345->20142|30379->20148|30405->20152|30438->20157|30471->20167|30796->20464|30823->20469|30857->20475|30888->20484|30923->20491|30950->20495|30984->20500|31017->20510|31242->20703|31300->20729|31354->20754|31443->20823|31457->20828|31497->20829|31543->20846|31622->20893|31665->20907|31918->21132|31992->21189|32033->21191|32087->21216|32177->21278|32233->21317|32274->21319|32332->21349|32380->21387|32421->21389|32483->21423|32509->21439|32550->21441|32616->21478|32694->21528|32710->21534|32770->21571|32802->21574|32826->21575|32889->21618|32903->21622|32943->21623|33009->21660|33079->21702|33095->21708|33155->21745|33187->21748|33211->21749|33286->21792|33348->21822|33406->21848|33460->21873|33519->21900|33569->21921|34076->22400|34150->22457|34191->22459|34245->22484|34335->22546|34391->22585|34432->22587|34490->22617|34538->22655|34579->22657|34641->22691|34667->22707|34708->22709|34774->22746|34877->22820|34901->22821|34940->22831|34973->22841|35007->22846|35031->22847|35094->22890|35108->22894|35148->22895|35214->22932|35309->22998|35333->22999|35372->23009|35405->23019|35439->23024|35463->23025|35538->23068|35600->23098|35658->23124|35712->23149|35771->23176|35821->23197|36119->23464
                  LINES: 35->1|50->14|52->16|52->16|54->16|55->17|55->17|55->17|55->17|58->20|58->20|59->21|63->25|63->25|63->25|64->26|64->26|64->26|64->26|65->27|65->27|65->27|68->30|68->30|68->30|68->30|68->30|68->30|71->33|72->34|80->42|80->42|82->44|82->44|83->45|85->47|85->47|87->49|87->49|88->50|92->54|92->54|93->55|94->56|94->56|96->58|96->58|96->58|97->59|99->61|99->61|100->62|102->64|102->64|102->64|102->64|102->64|103->65|105->67|105->67|107->69|107->69|107->69|108->70|110->72|110->72|110->72|110->72|110->72|111->73|113->75|113->75|114->76|115->77|115->77|117->79|117->79|118->80|119->81|119->81|125->87|125->87|127->89|127->89|127->89|128->90|131->93|131->93|132->94|133->95|133->95|133->95|133->95|133->95|134->96|135->97|135->97|136->98|136->98|138->100|138->100|138->100|139->101|155->117|155->117|159->121|160->122|160->122|160->122|161->123|161->123|161->123|162->124|163->125|163->125|164->126|165->127|165->127|167->129|167->129|167->129|167->129|168->130|169->131|169->131|170->132|170->132|171->133|173->135|173->135|174->136|177->139|177->139|178->140|180->13|181->15|182->141|184->143|184->143|184->143|185->144|187->146|187->146|187->146|188->147|193->152|193->152|193->152|194->153|195->154|195->154|195->154|196->155|197->156|198->157|220->179|223->182|223->182|223->182|224->183|237->196|239->198|239->198|239->198|241->200|241->200|241->200|241->200|251->210|251->210|251->210|252->211|253->212|253->212|253->212|254->213|255->214|259->218|259->218|259->218|260->224|261->225|271->235|271->235|271->235|272->236|273->237|273->237|278->242|278->242|282->246|283->247|293->257|294->258|299->263|299->263|299->263|300->264|301->265|301->265|301->265|303->267|304->268|304->268|304->268|304->268|304->268|304->268|304->268|304->268|306->270|307->271|308->272|309->273|310->274|311->275|312->276|314->278|314->278|314->278|314->278|316->280|316->280|316->280|317->281|317->281|317->281|317->281|318->282|318->282|318->282|319->283|320->284|321->285|322->286|323->287|329->293|329->293|329->293|330->294|333->297|333->297|333->297|337->301|337->301|337->301|337->301|337->301|337->301|337->301|341->305|341->305|341->305|346->310|346->310|346->310|347->311|347->311|347->311|347->311|348->312|348->312|348->312|349->313|350->314|351->315|354->318|355->319|361->325|361->325|361->325|362->326|362->326|362->326|363->327|365->329|365->329|365->329|366->330|366->330|366->330|366->330|367->331|367->331|367->331|368->332|369->333|369->333|369->333|370->334|373->337|374->338|374->338|374->338|375->339|375->339|375->339|375->339|376->340|376->340|376->340|376->340|376->340|376->340|376->340|377->341|378->342|378->342|378->342|379->343|382->346|383->347|383->347|383->347|384->348|386->350|386->350|386->350|387->351|387->351|387->351|387->351|388->352|388->352|388->352|389->353|390->354|390->354|390->354|391->355|391->355|391->355|392->356|394->358|394->358|394->358|395->359|396->360|396->360|396->360|396->360|401->365|401->365|401->365|401->365|401->365|401->365|405->369|406->370|406->370|406->370|407->371|410->374|411->375|411->375|411->375|412->376|412->376|412->376|412->376|413->377|413->377|414->378|414->378|414->378|414->378|414->378|414->378|415->379|415->379|416->380|418->382|419->383|419->383|419->383|420->384|423->387|424->388|424->388|424->388|425->389|427->391|427->391|427->391|428->392|429->393|429->393|429->393|429->393|429->393|429->393|434->398|434->398|434->398|434->398|434->398|434->398|434->398|434->398|438->402|439->403|440->404|443->407|443->407|443->407|444->408|445->409|447->411|452->416|452->416|452->416|453->417|454->418|454->418|454->418|455->419|455->419|455->419|456->420|456->420|456->420|457->421|457->421|457->421|457->421|457->421|457->421|458->422|458->422|458->422|459->423|459->423|459->423|459->423|459->423|459->423|460->424|461->425|462->426|463->427|464->428|465->429|478->442|478->442|478->442|479->443|480->444|480->444|480->444|481->445|481->445|481->445|482->446|482->446|482->446|483->447|483->447|483->447|483->447|483->447|483->447|483->447|484->448|484->448|484->448|485->449|485->449|485->449|485->449|485->449|485->449|485->449|486->450|487->451|488->452|489->453|490->454|491->455|502->466
                  -- GENERATED --
              */
          