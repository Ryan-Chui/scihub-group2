
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

object userList extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template15[util.List[User],Boolean,Boolean,Integer,String,Integer,Integer,Integer,String,Integer,String,String,Long,Integer,Integer,play.twirl.api.HtmlFormat.Appendable] {

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
                json.url = "/user/userDetailPage/" + json.id;

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
                                    """),format.raw/*162.37*/("""<li><a href=""""),_display_(/*162.51*/routes/*162.57*/.UserController.userList(1, "id")),format.raw/*162.90*/("""" class="grey-text text-darken-4"><i class="material-icons">
                                        event</i>User ID</a></li>
                                    <li><a href=""""),_display_(/*164.51*/routes/*164.57*/.UserController.userList(1, "user_name")),format.raw/*164.97*/("""" class="grey-text text-darken-4"><i class="material-icons">
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
"""),format.raw/*187.86*/("""
                                    """),format.raw/*188.37*/("""<th style="cursor: pointer;">Email</th>
"""),format.raw/*189.89*/("""
                                    """),format.raw/*190.37*/("""<th style="cursor: pointer;">Organization</th>
                                </tr>
                            </thead>
                            <tbody>
                            """),_display_(/*194.30*/for((entry, index) <- entries.zipWithIndex) yield /*194.73*/ {_display_(Seq[Any](format.raw/*194.75*/("""
                                """),format.raw/*195.33*/("""<tr>
                                    <td>"""),_display_(/*196.42*/entry/*196.47*/.getId()),format.raw/*196.55*/("""</td>

                                    <td><a href = """"),_display_(/*198.53*/routes/*198.59*/.UserController.userDetailPage(entry.getId())),format.raw/*198.104*/("""">"""),_display_(/*198.107*/entry/*198.112*/.getUserName()),format.raw/*198.126*/("""</a></td>

"""),format.raw/*200.76*/("""
"""),format.raw/*201.114*/("""
"""),format.raw/*202.72*/("""
"""),format.raw/*203.50*/("""
"""),format.raw/*204.49*/("""
"""),format.raw/*205.127*/("""
"""),format.raw/*206.42*/("""

                                    """),format.raw/*208.37*/("""<td>"""),_display_(/*208.42*/entry/*208.47*/.getEmail()),format.raw/*208.58*/("""</td>

"""),format.raw/*210.118*/("""
"""),format.raw/*211.80*/("""
"""),format.raw/*212.49*/("""
"""),format.raw/*213.55*/("""
"""),format.raw/*214.42*/("""

                                    """),format.raw/*216.37*/("""<td>"""),_display_(/*216.42*/entry/*216.47*/.getOrganization()),format.raw/*216.65*/("""</td>
                                    </td>

                                </tr>
                            """)))}),format.raw/*220.30*/("""
                            """),format.raw/*221.29*/("""</tbody>
                        </table>

                        <div class="row">
                            <div class="col s12">
                                <ul class="pagination center-align">

                                """),_display_(/*228.34*/if(listType.equals("all"))/*228.60*/ {_display_(Seq[Any](format.raw/*228.62*/("""
                                    """),_display_(/*229.38*/if(pageNum == 1)/*229.54*/ {_display_(Seq[Any](format.raw/*229.56*/("""
                                        """),format.raw/*230.41*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                            first_page</i></li>
                                        <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                            chevron_left</i></li>
                                    """)))}/*234.39*/else/*234.44*/{_display_(Seq[Any](format.raw/*234.45*/("""
                                        """),format.raw/*235.41*/("""<li class="waves-effect"><a href=""""),_display_(/*235.76*/routes/*235.82*/.UserController.userList(1, sort)),format.raw/*235.115*/(""""><i class="material-icons">
                                            first_page</i></a></li>
                                        <li class="waves-effect"><a href=""""),_display_(/*237.76*/routes/*237.82*/.UserController.userList(pageNum - 1, sort)),format.raw/*237.125*/(""""><i class="material-icons">
                                            chevron_left</i></a></li>
                                    """)))}),format.raw/*239.38*/("""
                                    """),_display_(/*240.38*/if(beginIndexForPagination > 1)/*240.69*/ {_display_(Seq[Any](format.raw/*240.71*/("""
                                        """),format.raw/*241.41*/("""<li class="waves-effect modal-trigger" href="#allPageModal" style="cursor: pointer;
                                            font-size: 20px;
                                            font-weight: bold">...</li>
                                    """)))}),format.raw/*244.38*/("""
                                    """),_display_(/*245.38*/for(i <- (beginIndexForPagination + 0) to (endIndexForPagination + 0)) yield /*245.108*/ {_display_(Seq[Any](format.raw/*245.110*/("""
                                        """),format.raw/*246.41*/("""<li """),_display_(/*246.46*/if(pageNum == i)/*246.62*/ {_display_(Seq[Any](format.raw/*246.64*/("""
                                            """),format.raw/*247.45*/("""class="active"""")))}),format.raw/*247.60*/("""><a href=""""),_display_(/*247.71*/routes/*247.77*/.UserController.userList(i, sort)),format.raw/*247.110*/("""">"""),_display_(/*247.113*/i),format.raw/*247.114*/("""</a></li>
                                    """)))}),format.raw/*248.38*/("""
                                    """),_display_(/*249.38*/if(endIndexForPagination < ((total - 1) / pageLimit + 1))/*249.95*/ {_display_(Seq[Any](format.raw/*249.97*/("""
                                        """),format.raw/*250.41*/("""<li class="waves-effect modal-trigger" href="#allPageModal" style="cursor: pointer;
                                            font-size: 20px;
                                            font-weight: bold">...</li>
                                    """)))}),format.raw/*253.38*/("""
                                    """),_display_(/*254.38*/if((offset + count) >= total)/*254.67*/ {_display_(Seq[Any](format.raw/*254.69*/("""
                                        """),format.raw/*255.41*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                            chevron_right</i></li>
                                        <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                            last_page</i></li>
                                    """)))}/*259.39*/else/*259.44*/{_display_(Seq[Any](format.raw/*259.45*/("""
                                        """),format.raw/*260.41*/("""<li class="waves-effect"><a href=""""),_display_(/*260.76*/routes/*260.82*/.UserController.userList(pageNum + 1, sort)),format.raw/*260.125*/(""""><i class="material-icons">
                                            chevron_right</i></a></li>
                                        <li class="waves-effect"><a href=""""),_display_(/*262.76*/routes/*262.82*/.UserController.userList((total - 1) / pageLimit + 1, sort)),format.raw/*262.141*/(""""><i class="material-icons">
                                            last_page</i></a></li>
                                    """)))}),format.raw/*264.38*/("""
                                """)))}/*265.35*/else/*265.40*/{_display_(Seq[Any](format.raw/*265.41*/("""
                                    """),_display_(/*266.38*/if(pageNum == 1)/*266.54*/ {_display_(Seq[Any](format.raw/*266.56*/("""
                                        """),format.raw/*267.41*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                            first_page</i></li>
                                        <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                            chevron_left</i></li>
                                    """)))}/*271.39*/else/*271.44*/{_display_(Seq[Any](format.raw/*271.45*/("""
                                        """),format.raw/*272.41*/("""<li class="waves-effect">
                                            <a href="#!" onclick="jumpToPage(1, '"""),_display_(/*273.83*/sort),format.raw/*273.87*/("""', '"""),_display_(/*273.92*/searchBody),format.raw/*273.102*/("""')">
                                                <i class="material-icons">first_page</i>
                                            </a>
                                        </li>
                                        <li class="waves-effect">
                                            <a href="#!" onclick="jumpToPage("""),_display_(/*278.79*/pageNum),format.raw/*278.86*/("""-1, '"""),_display_(/*278.92*/sort),format.raw/*278.96*/("""', '"""),_display_(/*278.101*/searchBody),format.raw/*278.111*/("""')">
                                                <i class="material-icons">chevron_left</i>
                                            </a>
                                        </li>
                                    """)))}),format.raw/*282.38*/("""
                                    """),_display_(/*283.38*/if(beginIndexForPagination > 1)/*283.69*/ {_display_(Seq[Any](format.raw/*283.71*/("""
                                        """),format.raw/*284.41*/("""<li class="waves-effect modal-trigger" href="#searchPageModal" style="cursor: pointer;
                                            font-size: 20px;
                                            font-weight: bold">...</li>
                                    """)))}),format.raw/*287.38*/("""
                                    """),_display_(/*288.38*/for(i <- (beginIndexForPagination + 0) to (endIndexForPagination + 0)) yield /*288.108*/ {_display_(Seq[Any](format.raw/*288.110*/("""
                                        """),format.raw/*289.41*/("""<li """),_display_(/*289.46*/if(pageNum == i)/*289.62*/ {_display_(Seq[Any](format.raw/*289.64*/("""
                                            """),format.raw/*290.45*/("""class="active"""")))}),format.raw/*290.60*/(""">
                                            <a href="#!" onclick="jumpToPage("""),_display_(/*291.79*/i),format.raw/*291.80*/(""", '"""),_display_(/*291.84*/sort),format.raw/*291.88*/("""', '"""),_display_(/*291.93*/searchBody),format.raw/*291.103*/("""')">
                                            """),_display_(/*292.46*/i),format.raw/*292.47*/("""
                                            """),format.raw/*293.45*/("""</a>
                                        </li>
                                    """)))}),format.raw/*295.38*/("""
                                    """),_display_(/*296.38*/if(endIndexForPagination < ((total - 1) / pageLimit + 1))/*296.95*/ {_display_(Seq[Any](format.raw/*296.97*/("""
                                        """),format.raw/*297.41*/("""<li class="waves-effect modal-trigger" href="#searchPageModal" style="cursor: pointer;
                                            font-size: 20px;
                                            font-weight: bold">...</li>
                                    """)))}),format.raw/*300.38*/("""
                                    """),_display_(/*301.38*/if((offset + count) >= total)/*301.67*/ {_display_(Seq[Any](format.raw/*301.69*/("""
                                        """),format.raw/*302.41*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                            chevron_right</i></li>
                                        <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                            last_page</i></li>
                                    """)))}/*306.39*/else/*306.44*/{_display_(Seq[Any](format.raw/*306.45*/("""
                                        """),format.raw/*307.41*/("""<li class="waves-effect">
                                            <a href="#!" onclick="jumpToPage("""),_display_(/*308.79*/pageNum),format.raw/*308.86*/("""+1, '"""),_display_(/*308.92*/sort),format.raw/*308.96*/("""', '"""),_display_(/*308.101*/searchBody),format.raw/*308.111*/("""')">
                                                <i class="material-icons">chevron_right</i>
                                            </a>
                                        </li>
                                        <li class="waves-effect">
                                            <a href="#!" onclick="jumpToPage(("""),_display_(/*313.80*/total),format.raw/*313.85*/("""-1) / ("""),_display_(/*313.93*/pageLimit),format.raw/*313.102*/(""") + 1, '"""),_display_(/*313.111*/sort),format.raw/*313.115*/("""', '"""),_display_(/*313.120*/searchBody),format.raw/*313.130*/("""')">
                                                <i class="material-icons">last_page</i>
                                            </a>
                                        </li>
                                    """)))}),format.raw/*317.38*/("""
                                """)))}),format.raw/*318.34*/("""
                                """),format.raw/*319.33*/("""</ul>
                            </div>
                        </div>
                    """)))}/*322.23*/else/*322.28*/{_display_(Seq[Any](format.raw/*322.29*/("""
                        """),format.raw/*323.25*/("""<h5>No user was found.</h5>
                    """)))}),format.raw/*324.22*/("""

                    """),format.raw/*326.21*/("""<div id="allPageModal" class="modal">
                        <div class="modal-content">
                            <h6>Select the page number you want to jump to</h6>
                            <div class="card z-depth-0">

                            """),_display_(/*331.30*/for(i <- (0) to ((((total - 1) / (pageLimit) + 1) - 1) / 10)) yield /*331.91*/ {_display_(Seq[Any](format.raw/*331.93*/("""
                                """),format.raw/*332.33*/("""<ul class="pagination center-align">
                                """),_display_(/*333.34*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*333.73*/ {_display_(Seq[Any](format.raw/*333.75*/("""
                                    """),_display_(/*334.38*/if(j <= ((total - 1) / (pageLimit) + 1))/*334.78*/ {_display_(Seq[Any](format.raw/*334.80*/("""
                                        """),_display_(/*335.42*/if(j != pageNum)/*335.58*/ {_display_(Seq[Any](format.raw/*335.60*/("""
                                            """),format.raw/*336.45*/("""<li class="waves-effect grey lighten-3"><a href='"""),_display_(/*336.95*/routes/*336.101*/.UserController.userList(j, sort)),format.raw/*336.134*/("""'>"""),_display_(/*336.137*/j),format.raw/*336.138*/("""</a></li>
                                        """)))}/*337.43*/else/*337.48*/{_display_(Seq[Any](format.raw/*337.49*/("""
                                            """),format.raw/*338.45*/("""<li class="waves-effect active"><a href=""""),_display_(/*338.87*/routes/*338.93*/.UserController.userList(j, sort)),format.raw/*338.126*/("""">"""),_display_(/*338.129*/j),format.raw/*338.130*/("""</a></li>
                                        """)))}),format.raw/*339.42*/("""
                                    """)))}),format.raw/*340.38*/("""
                                """)))}),format.raw/*341.34*/("""
                                """),format.raw/*342.33*/("""</ul>
                            """)))}),format.raw/*343.30*/("""
                            """),format.raw/*344.29*/("""</div>
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

                            """),_display_(/*357.30*/for(i <- (0) to ((((total - 1) / (pageLimit) + 1) - 1) / 10)) yield /*357.91*/ {_display_(Seq[Any](format.raw/*357.93*/("""
                                """),format.raw/*358.33*/("""<ul class="pagination center-align">
                                """),_display_(/*359.34*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*359.73*/ {_display_(Seq[Any](format.raw/*359.75*/("""
                                    """),_display_(/*360.38*/if(j <= ((total - 1) / (pageLimit) + 1))/*360.78*/ {_display_(Seq[Any](format.raw/*360.80*/("""
                                        """),_display_(/*361.42*/if(j != pageNum)/*361.58*/ {_display_(Seq[Any](format.raw/*361.60*/("""
                                            """),format.raw/*362.45*/("""<li class="waves-effect grey lighten-3"><a href='#!' onclick="jumpToPage("""),_display_(/*362.119*/j),format.raw/*362.120*/(""", 'id', '"""),_display_(/*362.130*/searchBody),format.raw/*362.140*/("""')">"""),_display_(/*362.145*/j),format.raw/*362.146*/("""</a></li>
                                        """)))}/*363.43*/else/*363.48*/{_display_(Seq[Any](format.raw/*363.49*/("""
                                            """),format.raw/*364.45*/("""<li class="waves-effect active"><a href="#!" onclick="jumpToPage("""),_display_(/*364.111*/j),format.raw/*364.112*/(""", 'id', '"""),_display_(/*364.122*/searchBody),format.raw/*364.132*/("""')">"""),_display_(/*364.137*/j),format.raw/*364.138*/("""</a></li>
                                        """)))}),format.raw/*365.42*/("""
                                    """)))}),format.raw/*366.38*/("""
                                """)))}),format.raw/*367.34*/("""
                                """),format.raw/*368.33*/("""</ul>
                            """)))}),format.raw/*369.30*/("""
                            """),format.raw/*370.29*/("""</div>
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
""")))}),format.raw/*383.2*/("""

"""))
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
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/userList.scala.html
                  HASH: 31d0dc744841e2ced663ea7a9ffaab8efef215cb
                  MATRIX: 814->1|1253->19|1736->430|1765->448|1780->455|1861->459|1893->464|1950->494|1965->500|2024->538|2142->628|2171->629|2216->646|2290->693|2336->723|2376->725|2421->742|2460->753|2489->754|2518->755|2575->785|2591->792|2627->807|2750->903|2766->910|2809->932|2838->934|2854->941|2896->962|3101->1136|3146->1153|3441->1420|3470->1421|3563->1486|3592->1487|3637->1504|4338->2177|4367->2178|4410->2256|4452->2270|4506->2296|4535->2297|4580->2314|4615->2321|4644->2322|4693->2343|4785->2407|4814->2408|4867->2433|4950->2488|4979->2489|5057->2539|5086->2540|5137->2563|5166->2564|5215->2585|5318->2660|5347->2661|5390->2676|5419->2677|5451->2682|5525->2728|5554->2729|5599->2746|5744->2863|5773->2864|5805->2869|5855->428|5883->446|5911->2879|5940->2882|5975->2908|6015->2910|6047->2915|6241->3082|6273->3105|6313->3107|6366->3132|6850->3589|6876->3606|6916->3608|6985->3649|7059->3705|7072->3710|7111->3711|7180->3752|7252->3793|7314->3826|9047->5527|9098->5550|9130->5572|9171->5574|9225->5599|9851->6197|9955->6279|9985->6280|10017->6284|10125->6370|10155->6371|10187->6375|10214->6380|10938->7076|10969->7097|11010->7099|11076->7136|11137->7178|11151->7183|11191->7184|11257->7221|11332->7264|11595->7499|11631->7525|11672->7527|11738->7564|11780->7578|11796->7584|11851->7617|12056->7794|12072->7800|12134->7840|12325->8012|12339->8017|12379->8018|12445->8055|12552->8134|12584->8144|12918->8450|12950->8460|13199->8677|13261->8710|13781->9286|13847->9323|13916->9451|13982->9488|14197->9675|14257->9718|14298->9720|14360->9753|14434->9799|14449->9804|14479->9812|14566->9871|14582->9877|14650->9922|14682->9925|14698->9930|14735->9944|14775->10030|14806->10144|14836->10216|14866->10266|14896->10315|14927->10442|14957->10484|15024->10522|15057->10527|15072->10532|15105->10543|15142->10667|15172->10747|15202->10796|15232->10851|15262->10893|15329->10931|15362->10936|15377->10941|15417->10959|15565->11075|15623->11104|15889->11342|15925->11368|15966->11370|16032->11408|16058->11424|16099->11426|16169->11467|16566->11845|16580->11850|16620->11851|16690->11892|16753->11927|16769->11933|16825->11966|17025->12138|17041->12144|17107->12187|17275->12323|17341->12361|17382->12392|17423->12394|17493->12435|17779->12689|17845->12727|17933->12797|17975->12799|18045->12840|18078->12845|18104->12861|18145->12863|18219->12908|18266->12923|18305->12934|18321->12940|18377->12973|18409->12976|18433->12977|18512->13024|18578->13062|18645->13119|18686->13121|18756->13162|19042->13416|19108->13454|19147->13483|19188->13485|19258->13526|19655->13904|19669->13909|19709->13910|19779->13951|19842->13986|19858->13992|19924->14035|20127->14210|20143->14216|20225->14275|20390->14408|20444->14443|20458->14448|20498->14449|20564->14487|20590->14503|20631->14505|20701->14546|21098->14924|21112->14929|21152->14930|21222->14971|21358->15079|21384->15083|21417->15088|21450->15098|21811->15431|21840->15438|21874->15444|21900->15448|21934->15453|21967->15463|22227->15691|22293->15729|22334->15760|22375->15762|22445->15803|22734->16060|22800->16098|22888->16168|22930->16170|23000->16211|23033->16216|23059->16232|23100->16234|23174->16279|23221->16294|23329->16374|23352->16375|23384->16379|23410->16383|23443->16388|23476->16398|23554->16448|23577->16449|23651->16494|23771->16582|23837->16620|23904->16677|23945->16679|24015->16720|24304->16977|24370->17015|24409->17044|24450->17046|24520->17087|24917->17465|24931->17470|24971->17471|25041->17512|25173->17616|25202->17623|25236->17629|25262->17633|25296->17638|25329->17648|25694->17985|25721->17990|25757->17998|25789->18007|25827->18016|25854->18020|25888->18025|25921->18035|26178->18260|26244->18294|26306->18327|26419->18421|26433->18426|26473->18427|26527->18452|26608->18501|26659->18523|26944->18780|27022->18841|27063->18843|27125->18876|27223->18946|27279->18985|27320->18987|27386->19025|27436->19065|27477->19067|27547->19109|27573->19125|27614->19127|27688->19172|27766->19222|27783->19228|27839->19261|27871->19264|27895->19265|27966->19317|27980->19322|28020->19323|28094->19368|28164->19410|28180->19416|28236->19449|28268->19452|28292->19453|28375->19504|28445->19542|28511->19576|28573->19609|28640->19644|28698->19673|29293->20240|29371->20301|29412->20303|29474->20336|29572->20406|29628->20445|29669->20447|29735->20485|29785->20525|29826->20527|29896->20569|29922->20585|29963->20587|30037->20632|30140->20706|30164->20707|30203->20717|30236->20727|30270->20732|30294->20733|30365->20785|30379->20790|30419->20791|30493->20836|30588->20902|30612->20903|30651->20913|30684->20923|30718->20928|30742->20929|30825->20980|30895->21018|30961->21052|31023->21085|31090->21120|31148->21149|31536->21506
                  LINES: 31->1|36->2|51->15|53->17|53->17|55->17|56->18|56->18|56->18|56->18|58->20|58->20|59->21|60->22|60->22|60->22|61->23|61->23|61->23|61->23|62->24|62->24|62->24|65->27|65->27|65->27|65->27|65->27|65->27|68->30|69->31|77->39|77->39|79->41|79->41|80->42|96->58|96->58|99->61|101->63|101->63|101->63|102->64|102->64|102->64|103->65|104->66|104->66|105->67|106->68|106->68|108->70|108->70|108->70|108->70|109->71|110->72|110->72|111->73|111->73|112->74|114->76|114->76|115->77|118->80|118->80|119->81|121->14|122->16|123->82|125->84|125->84|125->84|126->85|130->89|130->89|130->89|131->90|136->95|136->95|136->95|137->96|138->97|138->97|138->97|139->98|140->99|141->100|164->123|166->125|166->125|166->125|167->126|180->139|182->141|182->141|182->141|184->143|184->143|184->143|184->143|194->153|194->153|194->153|195->154|196->155|196->155|196->155|197->156|198->157|202->161|202->161|202->161|203->162|203->162|203->162|203->162|205->164|205->164|205->164|207->166|207->166|207->166|208->167|209->168|209->168|214->173|214->173|218->177|219->178|228->187|229->188|230->189|231->190|235->194|235->194|235->194|236->195|237->196|237->196|237->196|239->198|239->198|239->198|239->198|239->198|239->198|241->200|242->201|243->202|244->203|245->204|246->205|247->206|249->208|249->208|249->208|249->208|251->210|252->211|253->212|254->213|255->214|257->216|257->216|257->216|257->216|261->220|262->221|269->228|269->228|269->228|270->229|270->229|270->229|271->230|275->234|275->234|275->234|276->235|276->235|276->235|276->235|278->237|278->237|278->237|280->239|281->240|281->240|281->240|282->241|285->244|286->245|286->245|286->245|287->246|287->246|287->246|287->246|288->247|288->247|288->247|288->247|288->247|288->247|288->247|289->248|290->249|290->249|290->249|291->250|294->253|295->254|295->254|295->254|296->255|300->259|300->259|300->259|301->260|301->260|301->260|301->260|303->262|303->262|303->262|305->264|306->265|306->265|306->265|307->266|307->266|307->266|308->267|312->271|312->271|312->271|313->272|314->273|314->273|314->273|314->273|319->278|319->278|319->278|319->278|319->278|319->278|323->282|324->283|324->283|324->283|325->284|328->287|329->288|329->288|329->288|330->289|330->289|330->289|330->289|331->290|331->290|332->291|332->291|332->291|332->291|332->291|332->291|333->292|333->292|334->293|336->295|337->296|337->296|337->296|338->297|341->300|342->301|342->301|342->301|343->302|347->306|347->306|347->306|348->307|349->308|349->308|349->308|349->308|349->308|349->308|354->313|354->313|354->313|354->313|354->313|354->313|354->313|354->313|358->317|359->318|360->319|363->322|363->322|363->322|364->323|365->324|367->326|372->331|372->331|372->331|373->332|374->333|374->333|374->333|375->334|375->334|375->334|376->335|376->335|376->335|377->336|377->336|377->336|377->336|377->336|377->336|378->337|378->337|378->337|379->338|379->338|379->338|379->338|379->338|379->338|380->339|381->340|382->341|383->342|384->343|385->344|398->357|398->357|398->357|399->358|400->359|400->359|400->359|401->360|401->360|401->360|402->361|402->361|402->361|403->362|403->362|403->362|403->362|403->362|403->362|403->362|404->363|404->363|404->363|405->364|405->364|405->364|405->364|405->364|405->364|405->364|406->365|407->366|408->367|409->368|410->369|411->370|424->383
                  -- GENERATED --
              */
          