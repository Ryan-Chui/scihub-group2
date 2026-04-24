
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

object userListAdmin extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template15[util.List[User],Boolean,Boolean,Integer,String,Integer,Integer,Integer,String,Integer,String,String,Long,Integer,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(entries: util.List[User],
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
        userName: String,
        id: Long, beginIndexForPagination: Integer, endIndexForPagination: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*15.2*/import helper._

def /*17.2*/scripts/*17.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*17.13*/("""
    """),format.raw/*18.5*/("""<script type = "module" src='"""),_display_(/*18.35*/routes/*18.41*/.Assets.at("javascripts/voiceJump.js")),format.raw/*18.79*/("""'></script>
    <script type="text/javascript">
            $(document).ready(function () """),format.raw/*20.43*/("""{"""),format.raw/*20.44*/("""
                """),format.raw/*21.17*/("""var nasaEndorsedAPIArray = []
                """),_display_(/*22.18*/for(i <- 0 until entries.size) yield /*22.48*/ {_display_(Seq[Any](format.raw/*22.50*/("""
                """),format.raw/*23.17*/("""var json = """),format.raw/*23.28*/("""{"""),format.raw/*23.29*/("""}"""),format.raw/*23.30*/(""";
                json.id = '"""),_display_(/*24.29*/entries/*24.36*/.get(i).getId()),format.raw/*24.51*/("""';
                json.url = "/author/userDetailPageAdmin/" + json.id;

                json.name = '"""),_display_(/*27.31*/entries/*27.38*/.get(i).getFirstName()),format.raw/*27.60*/(""" """),_display_(/*27.62*/entries/*27.69*/.get(i).getLastName()),format.raw/*27.90*/("""'.replace(/[^a-zA-Z0-9]/g, " ").replace(/  +/g, " ").trim();
                console.log("jsonhere:" + json)
                nasaEndorsedAPIArray.push(json)
                """)))}),format.raw/*30.18*/("""
                """),format.raw/*31.17*/("""$("#nasaText").text(JSON.stringify(nasaEndorsedAPIArray));

                $('.tooltipped').tooltip();

                // $("#speak-from-filter").click();
                // $("#speak-nasa").click();
                // $("#speak-from-filter").click();

            """),format.raw/*39.13*/("""}"""),format.raw/*39.14*/(""");

            function jumpToPage(pageNum, sort, searchString) """),format.raw/*41.62*/("""{"""),format.raw/*41.63*/("""
                """),format.raw/*42.17*/("""pageNum = Math.floor(pageNum);
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
            """),format.raw/*58.13*/("""}"""),format.raw/*58.14*/("""


            """),format.raw/*61.76*/("""

            """),format.raw/*63.13*/("""function changeView(view) """),format.raw/*63.39*/("""{"""),format.raw/*63.40*/("""
                """),format.raw/*64.17*/("""$.ajax("""),format.raw/*64.24*/("""{"""),format.raw/*64.25*/("""
                    """),format.raw/*65.21*/("""url: "/updateProjectZone/" + view,
                    headers: """),format.raw/*66.30*/("""{"""),format.raw/*66.31*/("""
                        """),format.raw/*67.25*/("""'Content-Type': 'application/json'
                    """),format.raw/*68.21*/("""}"""),format.raw/*68.22*/(""",
                    type: "GET"
                """),format.raw/*70.17*/("""}"""),format.raw/*70.18*/(""").done(function (data) """),format.raw/*70.41*/("""{"""),format.raw/*70.42*/("""
                    """),format.raw/*71.21*/("""window.location.href = "/user/userList/1?sortCriteria=id";
                """),format.raw/*72.17*/("""}"""),format.raw/*72.18*/(""");
            """),format.raw/*73.13*/("""}"""),format.raw/*73.14*/("""
    """),format.raw/*74.5*/("""</script>
    <style>
            .follow-fab """),format.raw/*76.25*/("""{"""),format.raw/*76.26*/("""
                """),format.raw/*77.17*/("""top: -20px !important;
                bottom: auto !important;
                right: -20px !important;
            """),format.raw/*80.13*/("""}"""),format.raw/*80.14*/("""
    """),format.raw/*81.5*/("""</style>
""")))};
Seq[Any](format.raw/*14.84*/("""
"""),format.raw/*16.1*/("""
"""),format.raw/*82.2*/("""

"""),_display_(/*84.2*/main("All Users", scripts)/*84.28*/ {_display_(Seq[Any](format.raw/*84.30*/("""
    """),format.raw/*85.5*/("""<div class="container">
        <div class="row">
            <div class="col s12 m10 offset-m1">
                <div class="card-panel center">
                    """),_display_(/*89.22*/if(isCallerMySpacePage)/*89.45*/ {_display_(Seq[Any](format.raw/*89.47*/("""
                        """),format.raw/*90.25*/("""<div class="row card-panel z-depth-0 project-zone-panel">
                            <div class="col s12" style="margin-top: -10px;
                                margin-bottom: -10px;">
                                <h6 class="left tooltipped" data-position="bottom" data-tooltip="This list shows all the APIs associated with your current project zone." >
                                    Current Project Zone :
                                    """),_display_(/*95.38*/if(isPrivateZone)/*95.55*/ {_display_(Seq[Any](format.raw/*95.57*/("""
                                        """),format.raw/*96.41*/("""Your Private Zone
                                    """)))}/*97.39*/else/*97.44*/{_display_(Seq[Any](format.raw/*97.45*/("""
                                        """),format.raw/*98.41*/("""OpenNEX
                                """)))}),format.raw/*99.34*/("""
                                """),format.raw/*100.33*/("""</h6>

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
                                    !important;"><a href="#!" onclick="changeView('private')"><i class="material-icons">
                                        security</i>
                                        Your private zone</a></li>
                                </ul>
                            </div>
                        </div>
                    """)))}),format.raw/*123.22*/("""

                    """),_display_(/*125.22*/if(entries.size() > 0)/*125.44*/ {_display_(Seq[Any](format.raw/*125.46*/("""
                        """),format.raw/*126.25*/("""<div class="col s8 offset-s2">
                            <h4>User List</h4>

                        </div>
                        <div class="col s2">
                            <button id = "speak-from-filter" hidden></button>

                            <div id="nasaText" hidden></div>
                            <div id="requestField"></div>
                            <div id="replyField"></div>
                        </div>
                        <div class="row">
                            <div class="col s6">
                                <h6 class="left">Showing results: """),_display_(/*139.68*/{
                                    offset + 1
                                }),format.raw/*141.34*/(""" """),format.raw/*141.35*/("""to """),_display_(/*141.39*/{
                                    offset + count
                                }),format.raw/*143.34*/(""" """),format.raw/*143.35*/("""of """),_display_(/*143.39*/total),format.raw/*143.44*/("""</h6>
                            </div>
                            <div class="col s6" style="padding-top: -5px;
                                margin-top: -2px">
                                <a class='dropdown-trigger btn-flat right' href='#' data-target='dropdown2' style="text-transform: none;
                                    font-weight: bold;
                                    color: black;
                                    font-family: AmazonEmberBold, Helvetica Neue Bold, Helvetica Neue, Helvetica, Arial, sans-serif;
                                !important; ">
                                    Sort By: &nbsp; <font color="#3a5dc3">
                                """),_display_(/*153.34*/if(sort.equals("id"))/*153.55*/ {_display_(Seq[Any](format.raw/*153.57*/("""
                                    """),format.raw/*154.37*/("""User ID
                                """)))}/*155.35*/else/*155.40*/{_display_(Seq[Any](format.raw/*155.41*/("""
                                    """),format.raw/*156.37*/("""User Name
                                """)))}),format.raw/*157.34*/("""</font> <i class="material-icons right">expand_more</i></a>

                                    <!-- Dropdown Structure -->
                                <ul id='dropdown2' class='dropdown-content'>
                                """),_display_(/*161.34*/if(listType.equals("all"))/*161.60*/ {_display_(Seq[Any](format.raw/*161.62*/("""
                                    """),format.raw/*162.37*/("""<li><a href=""""),_display_(/*162.51*/routes/*162.57*/.AuthorController.userListAdmin(1, "id")),format.raw/*162.97*/("""" class="grey-text text-darken-4"><i class="material-icons">
                                        event</i>User ID</a></li>
                                    <li><a href=""""),_display_(/*164.51*/routes/*164.57*/.AuthorController.userListAdmin(1, "user_name")),format.raw/*164.104*/("""" class="grey-text text-darken-4"><i class="material-icons">
                                        sort_by_alpha</i>User Name </a></li>
                                """)))}/*166.35*/else/*166.40*/{_display_(Seq[Any](format.raw/*166.41*/("""
                                    """),format.raw/*167.37*/("""<li>
                                        <a onclick="jumpToPage(1, 'id', '"""),_display_(/*168.75*/searchBody),format.raw/*168.85*/("""')">
                                            <i class="material-icons">event</i>Date Created
                                        </a>
                                    </li>
                                    <li>
                                        <a onclick="jumpToPage(1, 'user_name', '"""),_display_(/*173.82*/searchBody),format.raw/*173.92*/("""')">
                                            <i class="material-icons">sort_by_alpha</i>Name
                                        </a>
                                    </li>
                                """)))}),format.raw/*177.34*/("""
                                """),format.raw/*178.33*/("""</ul>
                            </div>
                        </div>
                        <table class="centered responsive-table striped" id="userTable" >
                            <thead>
                                <tr class="list-header" style="border-bottom: 1px solid;
                                !important;">
                                    <th style="cursor: pointer;">User Id</th>
                                    <th style="cursor: pointer;">User Name</th>
                                    """),format.raw/*187.122*/("""
                                    """),format.raw/*188.37*/("""<th style="cursor: pointer;">Email</th>
                                    """),format.raw/*189.125*/("""
                                    """),format.raw/*190.37*/("""<th style="cursor: pointer;">Organization</th>
                                </tr>
                            </thead>
                            <tbody>
                            """),_display_(/*194.30*/for((entry, index) <- entries.zipWithIndex) yield /*194.73*/ {_display_(Seq[Any](format.raw/*194.75*/("""
                                """),format.raw/*195.33*/("""<tr>
                                        <!-- 1) ID column -->
                                    <td>
                                    """),_display_(/*198.38*/{entry.getId()}),format.raw/*198.53*/("""
                                    """),format.raw/*199.37*/("""</td>

                                        <!-- 2) Name column with correct link -->
                                    <td>
                                        <a href=""""),_display_(/*203.51*/routes/*203.57*/.AuthorController.userDetailPageAdmin(entry.getId())),format.raw/*203.109*/("""">
                                        """),_display_(/*204.42*/{entry.getUserName()}),format.raw/*204.63*/("""
                                        """),format.raw/*205.41*/("""</a>
                                    </td>

                                        <!-- 3) Email column -->
                                    <td>
                                    """),_display_(/*210.38*/{entry.getEmail()}),format.raw/*210.56*/("""
                                    """),format.raw/*211.37*/("""</td>

                                        <!-- 4) Organization column -->
                                    <td>
                                    """),_display_(/*215.38*/{entry.getOrganization()}),format.raw/*215.63*/("""
                                    """),format.raw/*216.37*/("""</td>
                                </tr>
                            """)))}),format.raw/*218.30*/("""
                            """),format.raw/*219.29*/("""</tbody>
                        </table>

                        <div class="row">
                            <div class="col s12">
                                <ul class="pagination center-align">

                                """),_display_(/*226.34*/if(listType.equals("all"))/*226.60*/ {_display_(Seq[Any](format.raw/*226.62*/("""
                                    """),_display_(/*227.38*/if(pageNum == 1)/*227.54*/ {_display_(Seq[Any](format.raw/*227.56*/("""
                                        """),format.raw/*228.41*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                            first_page</i></li>
                                        <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                            chevron_left</i></li>
                                    """)))}/*232.39*/else/*232.44*/{_display_(Seq[Any](format.raw/*232.45*/("""
                                        """),format.raw/*233.41*/("""<li class="waves-effect"><a href=""""),_display_(/*233.76*/routes/*233.82*/.AuthorController.userListAdmin(1, sort)),format.raw/*233.122*/(""""><i class="material-icons">
                                            first_page</i></a></li>
                                        <li class="waves-effect"><a href=""""),_display_(/*235.76*/routes/*235.82*/.AuthorController.userListAdmin(pageNum - 1, sort)),format.raw/*235.132*/(""""><i class="material-icons">
                                            chevron_left</i></a></li>
                                    """)))}),format.raw/*237.38*/("""
                                    """),_display_(/*238.38*/if(beginIndexForPagination > 1)/*238.69*/ {_display_(Seq[Any](format.raw/*238.71*/("""
                                        """),format.raw/*239.41*/("""<li class="waves-effect modal-trigger" href="#allPageModal" style="cursor: pointer;
                                            font-size: 20px;
                                            font-weight: bold">...</li>
                                    """)))}),format.raw/*242.38*/("""
                                    """),_display_(/*243.38*/for(i <- (beginIndexForPagination + 0) to (endIndexForPagination + 0)) yield /*243.108*/ {_display_(Seq[Any](format.raw/*243.110*/("""
                                        """),format.raw/*244.41*/("""<li """),_display_(/*244.46*/if(pageNum == i)/*244.62*/ {_display_(Seq[Any](format.raw/*244.64*/("""
                                            """),format.raw/*245.45*/("""class="active"""")))}),format.raw/*245.60*/("""><a href=""""),_display_(/*245.71*/routes/*245.77*/.AuthorController.userListAdmin(i, sort)),format.raw/*245.117*/("""">"""),_display_(/*245.120*/i),format.raw/*245.121*/("""</a></li>
                                    """)))}),format.raw/*246.38*/("""
                                    """),_display_(/*247.38*/if(endIndexForPagination < ((total - 1) / pageLimit + 1))/*247.95*/ {_display_(Seq[Any](format.raw/*247.97*/("""
                                        """),format.raw/*248.41*/("""<li class="waves-effect modal-trigger" href="#allPageModal" style="cursor: pointer;
                                            font-size: 20px;
                                            font-weight: bold">...</li>
                                    """)))}),format.raw/*251.38*/("""
                                    """),_display_(/*252.38*/if((offset + count) >= total)/*252.67*/ {_display_(Seq[Any](format.raw/*252.69*/("""
                                        """),format.raw/*253.41*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                            chevron_right</i></li>
                                        <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                            last_page</i></li>
                                    """)))}/*257.39*/else/*257.44*/{_display_(Seq[Any](format.raw/*257.45*/("""
                                        """),format.raw/*258.41*/("""<li class="waves-effect"><a href=""""),_display_(/*258.76*/routes/*258.82*/.AuthorController.userListAdmin(pageNum + 1, sort)),format.raw/*258.132*/(""""><i class="material-icons">
                                            chevron_right</i></a></li>
                                        <li class="waves-effect"><a href=""""),_display_(/*260.76*/routes/*260.82*/.AuthorController.userListAdmin((total - 1) / pageLimit + 1, sort)),format.raw/*260.148*/(""""><i class="material-icons">
                                            last_page</i></a></li>
                                    """)))}),format.raw/*262.38*/("""
                                """)))}/*263.35*/else/*263.40*/{_display_(Seq[Any](format.raw/*263.41*/("""
                                    """),_display_(/*264.38*/if(pageNum == 1)/*264.54*/ {_display_(Seq[Any](format.raw/*264.56*/("""
                                        """),format.raw/*265.41*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                            first_page</i></li>
                                        <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                            chevron_left</i></li>
                                    """)))}/*269.39*/else/*269.44*/{_display_(Seq[Any](format.raw/*269.45*/("""
                                        """),format.raw/*270.41*/("""<li class="waves-effect">
                                            <a href="#!" onclick="jumpToPage(1, '"""),_display_(/*271.83*/sort),format.raw/*271.87*/("""', '"""),_display_(/*271.92*/searchBody),format.raw/*271.102*/("""')">
                                                <i class="material-icons">first_page</i>
                                            </a>
                                        </li>
                                        <li class="waves-effect">
                                            <a href="#!" onclick="jumpToPage("""),_display_(/*276.79*/pageNum),format.raw/*276.86*/("""-1, '"""),_display_(/*276.92*/sort),format.raw/*276.96*/("""', '"""),_display_(/*276.101*/searchBody),format.raw/*276.111*/("""')">
                                                <i class="material-icons">chevron_left</i>
                                            </a>
                                        </li>
                                    """)))}),format.raw/*280.38*/("""
                                    """),_display_(/*281.38*/if(beginIndexForPagination > 1)/*281.69*/ {_display_(Seq[Any](format.raw/*281.71*/("""
                                        """),format.raw/*282.41*/("""<li class="waves-effect modal-trigger" href="#searchPageModal" style="cursor: pointer;
                                            font-size: 20px;
                                            font-weight: bold">...</li>
                                    """)))}),format.raw/*285.38*/("""
                                    """),_display_(/*286.38*/for(i <- (beginIndexForPagination + 0) to (endIndexForPagination + 0)) yield /*286.108*/ {_display_(Seq[Any](format.raw/*286.110*/("""
                                        """),format.raw/*287.41*/("""<li """),_display_(/*287.46*/if(pageNum == i)/*287.62*/ {_display_(Seq[Any](format.raw/*287.64*/("""
                                            """),format.raw/*288.45*/("""class="active"""")))}),format.raw/*288.60*/(""">
                                            <a href="#!" onclick="jumpToPage("""),_display_(/*289.79*/i),format.raw/*289.80*/(""", '"""),_display_(/*289.84*/sort),format.raw/*289.88*/("""', '"""),_display_(/*289.93*/searchBody),format.raw/*289.103*/("""')">
                                            """),_display_(/*290.46*/i),format.raw/*290.47*/("""
                                            """),format.raw/*291.45*/("""</a>
                                        </li>
                                    """)))}),format.raw/*293.38*/("""
                                    """),_display_(/*294.38*/if(endIndexForPagination < ((total - 1) / pageLimit + 1))/*294.95*/ {_display_(Seq[Any](format.raw/*294.97*/("""
                                        """),format.raw/*295.41*/("""<li class="waves-effect modal-trigger" href="#searchPageModal" style="cursor: pointer;
                                            font-size: 20px;
                                            font-weight: bold">...</li>
                                    """)))}),format.raw/*298.38*/("""
                                    """),_display_(/*299.38*/if((offset + count) >= total)/*299.67*/ {_display_(Seq[Any](format.raw/*299.69*/("""
                                        """),format.raw/*300.41*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                            chevron_right</i></li>
                                        <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                            last_page</i></li>
                                    """)))}/*304.39*/else/*304.44*/{_display_(Seq[Any](format.raw/*304.45*/("""
                                        """),format.raw/*305.41*/("""<li class="waves-effect">
                                            <a href="#!" onclick="jumpToPage("""),_display_(/*306.79*/pageNum),format.raw/*306.86*/("""+1, '"""),_display_(/*306.92*/sort),format.raw/*306.96*/("""', '"""),_display_(/*306.101*/searchBody),format.raw/*306.111*/("""')">
                                                <i class="material-icons">chevron_right</i>
                                            </a>
                                        </li>
                                        <li class="waves-effect">
                                            <a href="#!" onclick="jumpToPage(("""),_display_(/*311.80*/total),format.raw/*311.85*/("""-1) / ("""),_display_(/*311.93*/pageLimit),format.raw/*311.102*/(""") + 1, '"""),_display_(/*311.111*/sort),format.raw/*311.115*/("""', '"""),_display_(/*311.120*/searchBody),format.raw/*311.130*/("""')">
                                                <i class="material-icons">last_page</i>
                                            </a>
                                        </li>
                                    """)))}),format.raw/*315.38*/("""
                                """)))}),format.raw/*316.34*/("""
                                """),format.raw/*317.33*/("""</ul>
                            </div>
                        </div>
                    """)))}/*320.23*/else/*320.28*/{_display_(Seq[Any](format.raw/*320.29*/("""
                        """),format.raw/*321.25*/("""<h5>No user was found.</h5>
                    """)))}),format.raw/*322.22*/("""

                    """),format.raw/*324.21*/("""<div id="allPageModal" class="modal">
                        <div class="modal-content">
                            <h6>Select the page number you want to jump to</h6>
                            <div class="card z-depth-0">

                            """),_display_(/*329.30*/for(i <- (0) to ((((total - 1) / (pageLimit) + 1) - 1) / 10)) yield /*329.91*/ {_display_(Seq[Any](format.raw/*329.93*/("""
                                """),format.raw/*330.33*/("""<ul class="pagination center-align">
                                """),_display_(/*331.34*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*331.73*/ {_display_(Seq[Any](format.raw/*331.75*/("""
                                    """),_display_(/*332.38*/if(j <= ((total - 1) / (pageLimit) + 1))/*332.78*/ {_display_(Seq[Any](format.raw/*332.80*/("""
                                        """),_display_(/*333.42*/if(j != pageNum)/*333.58*/ {_display_(Seq[Any](format.raw/*333.60*/("""
                                            """),format.raw/*334.45*/("""<li class="waves-effect grey lighten-3"><a href='"""),_display_(/*334.95*/routes/*334.101*/.AuthorController.userListAdmin(j, sort)),format.raw/*334.141*/("""'>"""),_display_(/*334.144*/j),format.raw/*334.145*/("""</a></li>
                                        """)))}/*335.43*/else/*335.48*/{_display_(Seq[Any](format.raw/*335.49*/("""
                                            """),format.raw/*336.45*/("""<li class="waves-effect active"><a href=""""),_display_(/*336.87*/routes/*336.93*/.AuthorController.userListAdmin(j, sort)),format.raw/*336.133*/("""">"""),_display_(/*336.136*/j),format.raw/*336.137*/("""</a></li>
                                        """)))}),format.raw/*337.42*/("""
                                    """)))}),format.raw/*338.38*/("""
                                """)))}),format.raw/*339.34*/("""
                                """),format.raw/*340.33*/("""</ul>
                            """)))}),format.raw/*341.30*/("""
                            """),format.raw/*342.29*/("""</div>
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

                            """),_display_(/*355.30*/for(i <- (0) to ((((total - 1) / (pageLimit) + 1) - 1) / 10)) yield /*355.91*/ {_display_(Seq[Any](format.raw/*355.93*/("""
                                """),format.raw/*356.33*/("""<ul class="pagination center-align">
                                """),_display_(/*357.34*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*357.73*/ {_display_(Seq[Any](format.raw/*357.75*/("""
                                    """),_display_(/*358.38*/if(j <= ((total - 1) / (pageLimit) + 1))/*358.78*/ {_display_(Seq[Any](format.raw/*358.80*/("""
                                        """),_display_(/*359.42*/if(j != pageNum)/*359.58*/ {_display_(Seq[Any](format.raw/*359.60*/("""
                                            """),format.raw/*360.45*/("""<li class="waves-effect grey lighten-3"><a href='#!' onclick="jumpToPage("""),_display_(/*360.119*/j),format.raw/*360.120*/(""", 'id', '"""),_display_(/*360.130*/searchBody),format.raw/*360.140*/("""')">"""),_display_(/*360.145*/j),format.raw/*360.146*/("""</a></li>
                                        """)))}/*361.43*/else/*361.48*/{_display_(Seq[Any](format.raw/*361.49*/("""
                                            """),format.raw/*362.45*/("""<li class="waves-effect active"><a href="#!" onclick="jumpToPage("""),_display_(/*362.111*/j),format.raw/*362.112*/(""", 'id', '"""),_display_(/*362.122*/searchBody),format.raw/*362.132*/("""')">"""),_display_(/*362.137*/j),format.raw/*362.138*/("""</a></li>
                                        """)))}),format.raw/*363.42*/("""
                                    """)))}),format.raw/*364.38*/("""
                                """)))}),format.raw/*365.34*/("""
                                """),format.raw/*366.33*/("""</ul>
                            """)))}),format.raw/*367.30*/("""
                            """),format.raw/*368.29*/("""</div>
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
""")))}))
      }
    }
  }

  def render(entries:util.List[User],isPrivateZone:Boolean,isCallerMySpacePage:Boolean,pageNum:Integer,sort:String,offset:Integer,total:Integer,count:Integer,listType:String,pageLimit:Integer,searchBody:String,userName:String,id:Long,beginIndexForPagination:Integer,endIndexForPagination:Integer): play.twirl.api.HtmlFormat.Appendable = apply(entries,isPrivateZone,isCallerMySpacePage,pageNum,sort,offset,total,count,listType,pageLimit,searchBody,userName,id,beginIndexForPagination,endIndexForPagination)

  def f:((util.List[User],Boolean,Boolean,Integer,String,Integer,Integer,Integer,String,Integer,String,String,Long,Integer,Integer) => play.twirl.api.HtmlFormat.Appendable) = (entries,isPrivateZone,isCallerMySpacePage,pageNum,sort,offset,total,count,listType,pageLimit,searchBody,userName,id,beginIndexForPagination,endIndexForPagination) => apply(entries,isPrivateZone,isCallerMySpacePage,pageNum,sort,offset,total,count,listType,pageLimit,searchBody,userName,id,beginIndexForPagination,endIndexForPagination)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:40 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/userListAdmin.scala.html
                  HASH: 55b9a63d346ee9ba3419c872ff3d5bf75fd3228c
                  MATRIX: 814->1|1258->19|1741->430|1770->448|1785->455|1866->459|1898->464|1955->494|1970->500|2029->538|2147->628|2176->629|2221->646|2295->693|2341->723|2381->725|2426->742|2465->753|2494->754|2523->755|2580->785|2596->792|2632->807|2762->910|2778->917|2821->939|2850->941|2866->948|2908->969|3113->1143|3158->1160|3453->1427|3482->1428|3575->1493|3604->1494|3649->1511|4350->2184|4379->2185|4422->2263|4464->2277|4518->2303|4547->2304|4592->2321|4627->2328|4656->2329|4705->2350|4797->2414|4826->2415|4879->2440|4962->2495|4991->2496|5069->2546|5098->2547|5149->2570|5178->2571|5227->2592|5330->2667|5359->2668|5402->2683|5431->2684|5463->2689|5537->2735|5566->2736|5611->2753|5756->2870|5785->2871|5817->2876|5867->428|5895->446|5923->2886|5952->2889|5987->2915|6027->2917|6059->2922|6253->3089|6285->3112|6325->3114|6378->3139|6862->3596|6888->3613|6928->3615|6997->3656|7071->3712|7084->3717|7123->3718|7192->3759|7264->3800|7326->3833|9059->5534|9110->5557|9142->5579|9183->5581|9237->5606|9863->6204|9967->6286|9997->6287|10029->6291|10137->6377|10167->6378|10199->6382|10226->6387|10950->7083|10981->7104|11022->7106|11088->7143|11149->7185|11163->7190|11203->7191|11269->7228|11344->7271|11607->7506|11643->7532|11684->7534|11750->7571|11792->7585|11808->7591|11870->7631|12075->7808|12091->7814|12161->7861|12352->8033|12366->8038|12406->8039|12472->8076|12579->8155|12611->8165|12945->8471|12977->8481|13226->8698|13288->8731|13845->9343|13911->9380|14017->9544|14083->9581|14298->9768|14358->9811|14399->9813|14461->9846|14634->9991|14671->10006|14737->10043|14945->10223|14961->10229|15036->10281|15108->10325|15151->10346|15221->10387|15440->10578|15480->10596|15546->10633|15731->10790|15778->10815|15844->10852|15949->10925|16007->10954|16273->11192|16309->11218|16350->11220|16416->11258|16442->11274|16483->11276|16553->11317|16950->11695|16964->11700|17004->11701|17074->11742|17137->11777|17153->11783|17216->11823|17416->11995|17432->12001|17505->12051|17673->12187|17739->12225|17780->12256|17821->12258|17891->12299|18177->12553|18243->12591|18331->12661|18373->12663|18443->12704|18476->12709|18502->12725|18543->12727|18617->12772|18664->12787|18703->12798|18719->12804|18782->12844|18814->12847|18838->12848|18917->12895|18983->12933|19050->12990|19091->12992|19161->13033|19447->13287|19513->13325|19552->13354|19593->13356|19663->13397|20060->13775|20074->13780|20114->13781|20184->13822|20247->13857|20263->13863|20336->13913|20539->14088|20555->14094|20644->14160|20809->14293|20863->14328|20877->14333|20917->14334|20983->14372|21009->14388|21050->14390|21120->14431|21517->14809|21531->14814|21571->14815|21641->14856|21777->14964|21803->14968|21836->14973|21869->14983|22230->15316|22259->15323|22293->15329|22319->15333|22353->15338|22386->15348|22646->15576|22712->15614|22753->15645|22794->15647|22864->15688|23153->15945|23219->15983|23307->16053|23349->16055|23419->16096|23452->16101|23478->16117|23519->16119|23593->16164|23640->16179|23748->16259|23771->16260|23803->16264|23829->16268|23862->16273|23895->16283|23973->16333|23996->16334|24070->16379|24190->16467|24256->16505|24323->16562|24364->16564|24434->16605|24723->16862|24789->16900|24828->16929|24869->16931|24939->16972|25336->17350|25350->17355|25390->17356|25460->17397|25592->17501|25621->17508|25655->17514|25681->17518|25715->17523|25748->17533|26113->17870|26140->17875|26176->17883|26208->17892|26246->17901|26273->17905|26307->17910|26340->17920|26597->18145|26663->18179|26725->18212|26838->18306|26852->18311|26892->18312|26946->18337|27027->18386|27078->18408|27363->18665|27441->18726|27482->18728|27544->18761|27642->18831|27698->18870|27739->18872|27805->18910|27855->18950|27896->18952|27966->18994|27992->19010|28033->19012|28107->19057|28185->19107|28202->19113|28265->19153|28297->19156|28321->19157|28392->19209|28406->19214|28446->19215|28520->19260|28590->19302|28606->19308|28669->19348|28701->19351|28725->19352|28808->19403|28878->19441|28944->19475|29006->19508|29073->19543|29131->19572|29726->20139|29804->20200|29845->20202|29907->20235|30005->20305|30061->20344|30102->20346|30168->20384|30218->20424|30259->20426|30329->20468|30355->20484|30396->20486|30470->20531|30573->20605|30597->20606|30636->20616|30669->20626|30703->20631|30727->20632|30798->20684|30812->20689|30852->20690|30926->20735|31021->20801|31045->20802|31084->20812|31117->20822|31151->20827|31175->20828|31258->20879|31328->20917|31394->20951|31456->20984|31523->21019|31581->21048
                  LINES: 31->1|36->2|51->15|53->17|53->17|55->17|56->18|56->18|56->18|56->18|58->20|58->20|59->21|60->22|60->22|60->22|61->23|61->23|61->23|61->23|62->24|62->24|62->24|65->27|65->27|65->27|65->27|65->27|65->27|68->30|69->31|77->39|77->39|79->41|79->41|80->42|96->58|96->58|99->61|101->63|101->63|101->63|102->64|102->64|102->64|103->65|104->66|104->66|105->67|106->68|106->68|108->70|108->70|108->70|108->70|109->71|110->72|110->72|111->73|111->73|112->74|114->76|114->76|115->77|118->80|118->80|119->81|121->14|122->16|123->82|125->84|125->84|125->84|126->85|130->89|130->89|130->89|131->90|136->95|136->95|136->95|137->96|138->97|138->97|138->97|139->98|140->99|141->100|164->123|166->125|166->125|166->125|167->126|180->139|182->141|182->141|182->141|184->143|184->143|184->143|184->143|194->153|194->153|194->153|195->154|196->155|196->155|196->155|197->156|198->157|202->161|202->161|202->161|203->162|203->162|203->162|203->162|205->164|205->164|205->164|207->166|207->166|207->166|208->167|209->168|209->168|214->173|214->173|218->177|219->178|228->187|229->188|230->189|231->190|235->194|235->194|235->194|236->195|239->198|239->198|240->199|244->203|244->203|244->203|245->204|245->204|246->205|251->210|251->210|252->211|256->215|256->215|257->216|259->218|260->219|267->226|267->226|267->226|268->227|268->227|268->227|269->228|273->232|273->232|273->232|274->233|274->233|274->233|274->233|276->235|276->235|276->235|278->237|279->238|279->238|279->238|280->239|283->242|284->243|284->243|284->243|285->244|285->244|285->244|285->244|286->245|286->245|286->245|286->245|286->245|286->245|286->245|287->246|288->247|288->247|288->247|289->248|292->251|293->252|293->252|293->252|294->253|298->257|298->257|298->257|299->258|299->258|299->258|299->258|301->260|301->260|301->260|303->262|304->263|304->263|304->263|305->264|305->264|305->264|306->265|310->269|310->269|310->269|311->270|312->271|312->271|312->271|312->271|317->276|317->276|317->276|317->276|317->276|317->276|321->280|322->281|322->281|322->281|323->282|326->285|327->286|327->286|327->286|328->287|328->287|328->287|328->287|329->288|329->288|330->289|330->289|330->289|330->289|330->289|330->289|331->290|331->290|332->291|334->293|335->294|335->294|335->294|336->295|339->298|340->299|340->299|340->299|341->300|345->304|345->304|345->304|346->305|347->306|347->306|347->306|347->306|347->306|347->306|352->311|352->311|352->311|352->311|352->311|352->311|352->311|352->311|356->315|357->316|358->317|361->320|361->320|361->320|362->321|363->322|365->324|370->329|370->329|370->329|371->330|372->331|372->331|372->331|373->332|373->332|373->332|374->333|374->333|374->333|375->334|375->334|375->334|375->334|375->334|375->334|376->335|376->335|376->335|377->336|377->336|377->336|377->336|377->336|377->336|378->337|379->338|380->339|381->340|382->341|383->342|396->355|396->355|396->355|397->356|398->357|398->357|398->357|399->358|399->358|399->358|400->359|400->359|400->359|401->360|401->360|401->360|401->360|401->360|401->360|401->360|402->361|402->361|402->361|403->362|403->362|403->362|403->362|403->362|403->362|403->362|404->363|405->364|406->365|407->366|408->367|409->368
                  -- GENERATED --
              */
          