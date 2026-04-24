
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

object challengeApplicationList extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template12[List[ChallengeApplication],Integer,String,Integer,Integer,Integer,String,Integer,String,Long,Integer,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(entries: List[ChallengeApplication],
        pageNum: Integer,
        sort: String,
        offset: Integer,
        total: Integer,
        count: Integer, 
        listType: String,
        pageLimit: Integer,
        searchBody: String,
        userid: Long,
        beginIndexForPagination: Integer,
        endIndexForPagination: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*14.6*/import helper._;
/*15.6*/import models._
/*16.2*/import models.Challenge

def /*18.2*/scripts/*18.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*18.13*/("""
    """),format.raw/*19.5*/("""<script type = "module" src='"""),_display_(/*19.35*/routes/*19.41*/.Assets.at("javascripts/voiceJump.js")),format.raw/*19.79*/("""'></script>
    <script type="text/javascript">
        $(document).ready(function () """),format.raw/*21.39*/("""{"""),format.raw/*21.40*/("""
            """),format.raw/*22.13*/("""var nasaEndorsedAPIArray = []
            """),_display_(/*23.14*/for(i <- 0 until entries.size) yield /*23.44*/ {_display_(Seq[Any](format.raw/*23.46*/("""
            """),format.raw/*24.13*/("""var json = """),format.raw/*24.24*/("""{"""),format.raw/*24.25*/("""}"""),format.raw/*24.26*/(""";
            json.id = '"""),_display_(/*25.25*/entries/*25.32*/.get(i).getId()),format.raw/*25.47*/("""';
            json.url = "/project/projectDetail/" + json.id;

            /*json.name = '"""),_display_(/*28.29*/entries/*28.36*/.get(i).getAppliedChallenge),format.raw/*28.63*/("""'.replace(/[^a-zA-Z0-9]/g, " ").replace(/  +/g, " ").trim();*/
            console.log("jsonhere:" + json)
            nasaEndorsedAPIArray.push(json)
            """)))}),format.raw/*31.14*/("""
            """),format.raw/*32.13*/("""$("#nasaText").text(JSON.stringify(nasaEndorsedAPIArray));

            $('.tooltipped').tooltip();

            // $("#speak-from-filter").click();
            // $("#speak-nasa").click();
            // $("#speak-from-filter").click();

        """),format.raw/*40.9*/("""}"""),format.raw/*40.10*/(""");

        """),format.raw/*64.11*/("""

        """),format.raw/*66.9*/("""function jumpToPage(pageNum, sort, searchString) """),format.raw/*66.58*/("""{"""),format.raw/*66.59*/("""
            """),format.raw/*67.13*/("""pageNum = parseInt(pageNum);
            const baseUrl = window.location.href.split('?')[0];

            let url = `$"""),format.raw/*70.25*/("""{"""),format.raw/*70.26*/("""baseUrl"""),format.raw/*70.33*/("""}"""),format.raw/*70.34*/("""?pageNum=$"""),format.raw/*70.44*/("""{"""),format.raw/*70.45*/("""pageNum"""),format.raw/*70.52*/("""}"""),format.raw/*70.53*/("""`;
            if (sort && sort.trim() !== '') """),format.raw/*71.45*/("""{"""),format.raw/*71.46*/("""
                """),format.raw/*72.17*/("""url += `&sortCriteria=$"""),format.raw/*72.40*/("""{"""),format.raw/*72.41*/("""sort"""),format.raw/*72.45*/("""}"""),format.raw/*72.46*/("""`;
            """),format.raw/*73.13*/("""}"""),format.raw/*73.14*/("""
            """),format.raw/*74.13*/("""if (searchString && searchString.trim() !== '') """),format.raw/*74.61*/("""{"""),format.raw/*74.62*/("""
                """),format.raw/*75.17*/("""url += `&searchString=$"""),format.raw/*75.40*/("""{"""),format.raw/*75.41*/("""encodeURIComponent(searchString)"""),format.raw/*75.73*/("""}"""),format.raw/*75.74*/("""`;
            """),format.raw/*76.13*/("""}"""),format.raw/*76.14*/("""

            """),format.raw/*78.13*/("""window.location.href = url;
        """),format.raw/*79.9*/("""}"""),format.raw/*79.10*/("""

        """),format.raw/*81.9*/("""var serialSortAscending = true;

        function sortTableBySerial() """),format.raw/*83.38*/("""{"""),format.raw/*83.39*/("""
            """),format.raw/*84.13*/("""var rows = $('#userTable tbody tr').get();

            rows.sort(function(a, b) """),format.raw/*86.38*/("""{"""),format.raw/*86.39*/("""
                """),format.raw/*87.17*/("""var serialA = parseInt($(a).find('td:first').text().trim(), 10);
                var serialB = parseInt($(b).find('td:first').text().trim(), 10);
                return serialSortAscending ? serialA - serialB : serialB - serialA;
            """),format.raw/*90.13*/("""}"""),format.raw/*90.14*/(""");
            $.each(rows, function(index, row) """),format.raw/*91.47*/("""{"""),format.raw/*91.48*/("""
                """),format.raw/*92.17*/("""$('#userTable tbody').append(row);
            """),format.raw/*93.13*/("""}"""),format.raw/*93.14*/(""");

            serialSortAscending = !serialSortAscending;
        """),format.raw/*96.9*/("""}"""),format.raw/*96.10*/("""



        """),format.raw/*100.9*/("""function string2Map(str) """),format.raw/*100.34*/("""{"""),format.raw/*100.35*/("""
            """),format.raw/*101.13*/("""var map = new Map();
            var splitedString = str.replace(new RegExp("],", 'g'), ";");
            var array = splitedString.split(";");
            for(var i=0; i<array.length; i++)"""),format.raw/*104.46*/("""{"""),format.raw/*104.47*/("""
                """),format.raw/*105.17*/("""var idAndEventsString = array[i];
                idAndEventsString = idAndEventsString.replace(/["""),format.raw/*106.65*/("""{"""),format.raw/*106.66*/("""}"""),format.raw/*106.67*/("""[\]\\]/g, " ");
                var idAndEvents = idAndEventsString.split("=");
                var id = idAndEvents[0];
                var eventsString = idAndEvents[1];
                var events = eventsString.split(",");
                console.log("events:" + events + "," + i);

                var formatedEvents = "";
                for(var j=0; j<events.length; j++)"""),format.raw/*114.51*/("""{"""),format.raw/*114.52*/("""
                    """),format.raw/*115.21*/("""events[j] = events[j].trim();
                    formatedEvents = formatedEvents + events[j] + ";";
                """),format.raw/*117.17*/("""}"""),format.raw/*117.18*/("""
                """),format.raw/*118.17*/("""if(formatedEvents.length > 1)
                    map.set(id.trim(), formatedEvents);
            """),format.raw/*120.13*/("""}"""),format.raw/*120.14*/("""

            """),format.raw/*122.13*/("""return map;
        """),format.raw/*123.9*/("""}"""),format.raw/*123.10*/("""
    """),format.raw/*124.5*/("""</script>
    <style>
            .follow-fab """),format.raw/*126.25*/("""{"""),format.raw/*126.26*/("""
                """),format.raw/*127.17*/("""top: -20px !important;
                bottom: auto !important;
                right: -20px !important;
            """),format.raw/*130.13*/("""}"""),format.raw/*130.14*/("""
    """),format.raw/*131.5*/("""</style>
""")))};
Seq[Any](format.raw/*13.40*/("""
    """),format.raw/*15.1*/("""    """),format.raw/*17.1*/("""
"""),format.raw/*132.2*/("""

"""),_display_(/*134.2*/main("Challenge Applications", scripts)/*134.41*/ {_display_(Seq[Any](format.raw/*134.43*/("""
    """),format.raw/*135.5*/("""<div class="container">
        <div class="row">
            <div class="col s12 m10 offset-m1">
                <div class="card-panel center">
                    """),_display_(/*139.22*/if(entries.size() > 0)/*139.44*/ {_display_(Seq[Any](format.raw/*139.46*/("""
                        """),format.raw/*140.25*/("""<div class="col s8 offset-s2">
                            <h4>Challenge Applications</h4>

                        </div>
                        <div class="col s2">
                            <button id = "speak-from-filter" hidden></button>

                            <div id="nasaText" hidden></div>
                            <div id="requestField"></div>
                            <div id="replyField"></div>
                        </div>
                        <div class="row">
                            <div class="col s6">
                                <h6 class="left">Showing results: """),_display_(/*153.68*/{
                                    offset + 1
                                }),format.raw/*155.34*/(""" """),format.raw/*155.35*/("""to """),_display_(/*155.39*/{
                                    offset + count
                                }),format.raw/*157.34*/(""" """),format.raw/*157.35*/("""of """),_display_(/*157.39*/total),format.raw/*157.44*/("""</h6>
                            </div>
                            <div class="col s6" style="padding-top: -5px;
                                margin-top: -2px">
                                <a class='dropdown-trigger btn-flat right' href='#' data-target='dropdown2' style="text-transform: none;
                                    font-weight: bold;
                                    color: black;
                                    font-family: AmazonEmberBold, Helvetica Neue Bold, Helvetica Neue, Helvetica, Arial, sans-serif;
                                !important; ">
                                    Sort By: &nbsp; <font color="#3a5dc3">
                                """),_display_(/*167.34*/if(sort.equals("id"))/*167.55*/ {_display_(Seq[Any](format.raw/*167.57*/("""
                                    """),format.raw/*168.37*/("""Challenge Application ID
                                """)))}),format.raw/*169.34*/(""" """),format.raw/*169.35*/("""</font> <i class="material-icons right">expand_more</i></a>

                                    <!-- Dropdown Structure -->
                                <ul id='dropdown2' class='dropdown-content'>
                                    <li>
                                        <a onclick="sortTableBySerial()">
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
                                    <th style="cursor: pointer;">Challenge Application Id</th>
                                    <th style="cursor: pointer;">Applicant First Name</th>
                                    <th style="cursor: pointer;">Applicant Last Name</th>
                                    <th style="cursor: pointer;">Organization</th>
                                    <th style="cursor: pointer;">Applicant Type</th>
                                    <th style="cursor: pointer;">Applied Status</th>
                                    <th style="cursor: pointer;">Applied Time</th>
                                    <th style="cursor: pointer;">Operations</th>
                                </tr>
                            </thead>
                            <tbody>
                            """),_display_(/*196.30*/for((entry, index) <- entries.zipWithIndex) yield /*196.73*/ {_display_(Seq[Any](format.raw/*196.75*/("""
                                """),format.raw/*197.33*/("""<tr>
                                    <td>"""),_display_(/*198.42*/entry/*198.47*/.getId()),format.raw/*198.55*/("""</td>
"""),format.raw/*199.147*/("""
                                    """),format.raw/*200.37*/("""<td>"""),_display_(/*200.42*/entry/*200.47*/.getApplicant().getFirstName()),format.raw/*200.77*/("""</td>
                                    <td>"""),_display_(/*201.42*/entry/*201.47*/.getApplicant().getLastName()),format.raw/*201.76*/("""</td>
                                    <td>"""),_display_(/*202.42*/entry/*202.47*/.getApplicant().getOrganization()),format.raw/*202.80*/("""</td>
                                    <td>"""),_display_(/*203.42*/entry/*203.47*/.getApplicantTypeInfo()),format.raw/*203.70*/("""</td>
                                    """),_display_(/*204.38*/if(entry.getStatus() == "open")/*204.69*/ {_display_(Seq[Any](format.raw/*204.71*/("""
                                        """),format.raw/*205.41*/("""<td>
                                            <span class="new badge light-green darken-1" data-badge-caption="open"></span>
                                        </td>
                                    """)))}/*208.39*/else if(entry.getStatus() == "pending")/*208.78*/{_display_(Seq[Any](format.raw/*208.79*/("""
                                    """),format.raw/*209.37*/("""<td>
                                        <span class="new badge purple darken-1" data-badge-caption="pending"></span>
                                    </td>
                                    """)))}/*212.38*/else if(entry.getStatus() == "closed")/*212.76*/{_display_(Seq[Any](format.raw/*212.77*/("""
                                    """),format.raw/*213.37*/("""<td>
                                        <span class="new badge grey darken-3" data-badge-caption="closed"></span>
                                    </td>
                                    """)))}/*216.38*/else/*216.43*/{_display_(Seq[Any](format.raw/*216.44*/("""
                                    """),format.raw/*217.37*/("""<td>&ensp; -</td>
                                    """)))}),format.raw/*218.38*/("""
                                    """),format.raw/*219.37*/("""<td>"""),_display_(/*219.42*/entry/*219.47*/.getCreatedTime()),format.raw/*219.64*/("""</td>
                                    <td><a href=""""),_display_(/*220.51*/routes/*220.57*/.ChallengeController.challengeApplicationsDetail(entry.getId())),format.raw/*220.120*/("""">View Details</a></td>

                                </tr>
                            """)))}),format.raw/*223.30*/("""
                            """),format.raw/*224.29*/("""</tbody>
                        </table>

                        <div class="row">
                            <div class="col s12">
                                <ul class="pagination center-align">
                                    """),_display_(/*230.38*/if(pageNum == 1)/*230.54*/ {_display_(Seq[Any](format.raw/*230.56*/("""
                                        """),format.raw/*231.41*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                            first_page</i></li>
                                        <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                            chevron_left</i></li>
                                    """)))}/*235.39*/else/*235.44*/{_display_(Seq[Any](format.raw/*235.45*/("""
                                        """),format.raw/*236.41*/("""<li class="waves-effect">
                                            <a href="#!" onclick="jumpToPage(1, '"""),_display_(/*237.83*/sort),format.raw/*237.87*/("""', '"""),_display_(/*237.92*/searchBody),format.raw/*237.102*/("""')">
                                                <i class="material-icons">first_page</i>
                                            </a>
                                        </li>
                                        <li class="waves-effect">
                                            <a href="#!" onclick="jumpToPage("""),_display_(/*242.79*/pageNum),format.raw/*242.86*/("""-1, '"""),_display_(/*242.92*/sort),format.raw/*242.96*/("""', '"""),_display_(/*242.101*/searchBody),format.raw/*242.111*/("""')">
                                                <i class="material-icons">chevron_left</i>
                                            </a>
                                        </li>
                                    """)))}),format.raw/*246.38*/("""
                                    """),_display_(/*247.38*/if(beginIndexForPagination > 1)/*247.69*/ {_display_(Seq[Any](format.raw/*247.71*/("""
                                        """),format.raw/*248.41*/("""<li class="waves-effect modal-trigger" href="#searchPageModal" style="cursor: pointer;
                                            font-size: 20px;
                                            font-weight: bold">...</li>
                                    """)))}),format.raw/*251.38*/("""
                                    """),_display_(/*252.38*/for(i <- (beginIndexForPagination + 0) to (endIndexForPagination + 0)) yield /*252.108*/ {_display_(Seq[Any](format.raw/*252.110*/("""
                                        """),format.raw/*253.41*/("""<li """),_display_(/*253.46*/if(pageNum == i)/*253.62*/ {_display_(Seq[Any](format.raw/*253.64*/("""
                                            """),format.raw/*254.45*/("""class="active"""")))}),format.raw/*254.60*/(""">
                                            <a href="#!" onclick="jumpToPage("""),_display_(/*255.79*/i),format.raw/*255.80*/(""", '"""),_display_(/*255.84*/sort),format.raw/*255.88*/("""', '"""),_display_(/*255.93*/searchBody),format.raw/*255.103*/("""')">
                                            """),_display_(/*256.46*/i),format.raw/*256.47*/("""
                                            """),format.raw/*257.45*/("""</a>
                                        </li>
                                    """)))}),format.raw/*259.38*/("""
                                    """),_display_(/*260.38*/if(endIndexForPagination < ((total - 1) / pageLimit + 1))/*260.95*/ {_display_(Seq[Any](format.raw/*260.97*/("""
                                        """),format.raw/*261.41*/("""<li class="waves-effect modal-trigger" href="#searchPageModal" style="cursor: pointer;
                                            font-size: 20px;
                                            font-weight: bold">...</li>
                                    """)))}),format.raw/*264.38*/("""
                                    """),_display_(/*265.38*/if((offset + count) >= total)/*265.67*/ {_display_(Seq[Any](format.raw/*265.69*/("""
                                        """),format.raw/*266.41*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                            chevron_right</i></li>
                                        <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                            last_page</i></li>
                                    """)))}/*270.39*/else/*270.44*/{_display_(Seq[Any](format.raw/*270.45*/("""
                                        """),format.raw/*271.41*/("""<li class="waves-effect">
                                            <a href="#!" onclick="jumpToPage("""),_display_(/*272.79*/pageNum),format.raw/*272.86*/("""+1, '"""),_display_(/*272.92*/sort),format.raw/*272.96*/("""', '"""),_display_(/*272.101*/searchBody),format.raw/*272.111*/("""')">
                                                <i class="material-icons">chevron_right</i>
                                            </a>
                                        </li>
                                        <li class="waves-effect">
                                            <a href="#!" onclick="jumpToPage(("""),_display_(/*277.80*/total),format.raw/*277.85*/("""-1) / ("""),_display_(/*277.93*/pageLimit),format.raw/*277.102*/(""") + 1, '"""),_display_(/*277.111*/sort),format.raw/*277.115*/("""', '"""),_display_(/*277.120*/searchBody),format.raw/*277.130*/("""')">
                                                <i class="material-icons">last_page</i>
                                            </a>
                                        </li>
                                    """)))}),format.raw/*281.38*/("""
                                """),format.raw/*282.33*/("""</ul>
                            </div>
                        </div>
                    """)))}/*285.23*/else/*285.28*/{_display_(Seq[Any](format.raw/*285.29*/("""
                        """),format.raw/*286.25*/("""<h5>No challenge application was found.</h5>
                    """)))}),format.raw/*287.22*/("""

                    """),format.raw/*289.21*/("""<div id="allPageModal" class="modal">
                        <div class="modal-content">
                            <h6>Select the page number you want to jump to</h6>
                            <div class="card z-depth-0">

                            """),_display_(/*294.30*/for(i <- (0) to ((((total - 1) / (pageLimit) + 1) - 1) / 10)) yield /*294.91*/ {_display_(Seq[Any](format.raw/*294.93*/("""
                                """),format.raw/*295.33*/("""<ul class="pagination center-align">
                                """),_display_(/*296.34*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*296.73*/ {_display_(Seq[Any](format.raw/*296.75*/("""
                                    """),_display_(/*297.38*/if(j <= ((total - 1) / (pageLimit) + 1))/*297.78*/ {_display_(Seq[Any](format.raw/*297.80*/("""
                                        """),_display_(/*298.42*/if(j != pageNum)/*298.58*/ {_display_(Seq[Any](format.raw/*298.60*/("""
                                            """),format.raw/*299.45*/("""<li class="waves-effect grey lighten-3"><a href='"""),_display_(/*299.95*/routes/*299.101*/.UserController.userList(j, sort)),format.raw/*299.134*/("""'>"""),_display_(/*299.137*/j),format.raw/*299.138*/("""</a></li>
                                        """)))}/*300.43*/else/*300.48*/{_display_(Seq[Any](format.raw/*300.49*/("""
                                            """),format.raw/*301.45*/("""<li class="waves-effect active"><a href=""""),_display_(/*301.87*/routes/*301.93*/.UserController.userList(j, sort)),format.raw/*301.126*/("""">"""),_display_(/*301.129*/j),format.raw/*301.130*/("""</a></li>
                                        """)))}),format.raw/*302.42*/("""
                                    """)))}),format.raw/*303.38*/("""
                                """)))}),format.raw/*304.34*/("""
                                """),format.raw/*305.33*/("""</ul>
                            """)))}),format.raw/*306.30*/("""
                            """),format.raw/*307.29*/("""</div>
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

                            """),_display_(/*320.30*/for(i <- (0) to ((((total - 1) / (pageLimit) + 1) - 1) / 10)) yield /*320.91*/ {_display_(Seq[Any](format.raw/*320.93*/("""
                                """),format.raw/*321.33*/("""<ul class="pagination center-align">
                                """),_display_(/*322.34*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*322.73*/ {_display_(Seq[Any](format.raw/*322.75*/("""
                                    """),_display_(/*323.38*/if(j <= ((total - 1) / (pageLimit) + 1))/*323.78*/ {_display_(Seq[Any](format.raw/*323.80*/("""
                                        """),_display_(/*324.42*/if(j != pageNum)/*324.58*/ {_display_(Seq[Any](format.raw/*324.60*/("""
                                            """),format.raw/*325.45*/("""<li class="waves-effect grey lighten-3"><a href='#!' onclick="jumpToPage("""),_display_(/*325.119*/j),format.raw/*325.120*/(""", 'id', '"""),_display_(/*325.130*/searchBody),format.raw/*325.140*/("""')">"""),_display_(/*325.145*/j),format.raw/*325.146*/("""</a></li>
                                        """)))}/*326.43*/else/*326.48*/{_display_(Seq[Any](format.raw/*326.49*/("""
                                            """),format.raw/*327.45*/("""<li class="waves-effect active"><a href="#!" onclick="jumpToPage("""),_display_(/*327.111*/j),format.raw/*327.112*/(""", 'id', '"""),_display_(/*327.122*/searchBody),format.raw/*327.132*/("""')">"""),_display_(/*327.137*/j),format.raw/*327.138*/("""</a></li>
                                        """)))}),format.raw/*328.42*/("""
                                    """)))}),format.raw/*329.38*/("""
                                """)))}),format.raw/*330.34*/("""
                                """),format.raw/*331.33*/("""</ul>
                            """)))}),format.raw/*332.30*/("""
                            """),format.raw/*333.29*/("""</div>
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
""")))}),format.raw/*346.2*/("""

"""))
      }
    }
  }

  def render(entries:List[ChallengeApplication],pageNum:Integer,sort:String,offset:Integer,total:Integer,count:Integer,listType:String,pageLimit:Integer,searchBody:String,userid:Long,beginIndexForPagination:Integer,endIndexForPagination:Integer): play.twirl.api.HtmlFormat.Appendable = apply(entries,pageNum,sort,offset,total,count,listType,pageLimit,searchBody,userid,beginIndexForPagination,endIndexForPagination)

  def f:((List[ChallengeApplication],Integer,String,Integer,Integer,Integer,String,Integer,String,Long,Integer,Integer) => play.twirl.api.HtmlFormat.Appendable) = (entries,pageNum,sort,offset,total,count,listType,pageLimit,searchBody,userid,beginIndexForPagination,endIndexForPagination) => apply(entries,pageNum,sort,offset,total,count,listType,pageLimit,searchBody,userid,beginIndexForPagination,endIndexForPagination)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:30 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/challengeApplicationList.scala.html
                  HASH: 1daff2d8106c21266a78b2f0b59dd85a28c1d7b6
                  MATRIX: 1233->2|1652->353|1677->375|1701->392|1738->418|1753->425|1834->429|1866->434|1923->464|1938->470|1997->508|2111->594|2140->595|2181->608|2251->651|2297->681|2337->683|2378->696|2417->707|2446->708|2475->709|2528->735|2544->742|2580->757|2699->849|2715->856|2763->883|2958->1047|2999->1060|3273->1307|3302->1308|3342->2093|3379->2103|3456->2152|3485->2153|3526->2166|3672->2284|3701->2285|3736->2292|3765->2293|3803->2303|3832->2304|3867->2311|3896->2312|3971->2359|4000->2360|4045->2377|4096->2400|4125->2401|4157->2405|4186->2406|4229->2421|4258->2422|4299->2435|4375->2483|4404->2484|4449->2501|4500->2524|4529->2525|4589->2557|4618->2558|4661->2573|4690->2574|4732->2588|4795->2624|4824->2625|4861->2635|4959->2705|4988->2706|5029->2719|5138->2800|5167->2801|5212->2818|5482->3060|5511->3061|5588->3110|5617->3111|5662->3128|5737->3175|5766->3176|5861->3244|5890->3245|5930->3257|5984->3282|6014->3283|6056->3296|6274->3485|6304->3486|6350->3503|6477->3601|6507->3602|6537->3603|6943->3980|6973->3981|7023->4002|7169->4119|7199->4120|7245->4137|7372->4235|7402->4236|7445->4250|7493->4270|7523->4271|7556->4276|7631->4322|7661->4323|7707->4340|7853->4457|7883->4458|7916->4463|7966->347|7998->370|8029->416|8058->4473|8088->4476|8137->4515|8178->4517|8211->4522|8406->4689|8438->4711|8479->4713|8533->4738|9172->5349|9276->5431|9306->5432|9338->5436|9446->5522|9476->5523|9508->5527|9535->5532|10259->6228|10290->6249|10331->6251|10397->6288|10487->6346|10517->6347|12239->8041|12299->8084|12340->8086|12402->8119|12476->8165|12491->8170|12521->8178|12557->8330|12623->8367|12656->8372|12671->8377|12723->8407|12798->8454|12813->8459|12864->8488|12939->8535|12954->8540|13009->8573|13084->8620|13099->8625|13144->8648|13215->8691|13256->8722|13297->8724|13367->8765|13598->8977|13647->9016|13687->9017|13753->9054|13974->9255|14022->9293|14062->9294|14128->9331|14346->9529|14360->9534|14400->9535|14466->9572|14553->9627|14619->9664|14652->9669|14667->9674|14706->9691|14790->9747|14806->9753|14892->9816|15016->9908|15074->9937|15343->10178|15369->10194|15410->10196|15480->10237|15877->10615|15891->10620|15931->10621|16001->10662|16137->10770|16163->10774|16196->10779|16229->10789|16590->11122|16619->11129|16653->11135|16679->11139|16713->11144|16746->11154|17006->11382|17072->11420|17113->11451|17154->11453|17224->11494|17513->11751|17579->11789|17667->11859|17709->11861|17779->11902|17812->11907|17838->11923|17879->11925|17953->11970|18000->11985|18108->12065|18131->12066|18163->12070|18189->12074|18222->12079|18255->12089|18333->12139|18356->12140|18430->12185|18550->12273|18616->12311|18683->12368|18724->12370|18794->12411|19083->12668|19149->12706|19188->12735|19229->12737|19299->12778|19696->13156|19710->13161|19750->13162|19820->13203|19952->13307|19981->13314|20015->13320|20041->13324|20075->13329|20108->13339|20473->13676|20500->13681|20536->13689|20568->13698|20606->13707|20633->13711|20667->13716|20700->13726|20957->13951|21019->13984|21132->14078|21146->14083|21186->14084|21240->14109|21338->14175|21389->14197|21674->14454|21752->14515|21793->14517|21855->14550|21953->14620|22009->14659|22050->14661|22116->14699|22166->14739|22207->14741|22277->14783|22303->14799|22344->14801|22418->14846|22496->14896|22513->14902|22569->14935|22601->14938|22625->14939|22696->14991|22710->14996|22750->14997|22824->15042|22894->15084|22910->15090|22966->15123|22998->15126|23022->15127|23105->15178|23175->15216|23241->15250|23303->15283|23370->15318|23428->15347|24023->15914|24101->15975|24142->15977|24204->16010|24302->16080|24358->16119|24399->16121|24465->16159|24515->16199|24556->16201|24626->16243|24652->16259|24693->16261|24767->16306|24870->16380|24894->16381|24933->16391|24966->16401|25000->16406|25024->16407|25095->16459|25109->16464|25149->16465|25223->16510|25318->16576|25342->16577|25381->16587|25414->16597|25448->16602|25472->16603|25555->16654|25625->16692|25691->16726|25753->16759|25820->16794|25878->16823|26266->17180
                  LINES: 35->2|49->14|50->15|51->16|53->18|53->18|55->18|56->19|56->19|56->19|56->19|58->21|58->21|59->22|60->23|60->23|60->23|61->24|61->24|61->24|61->24|62->25|62->25|62->25|65->28|65->28|65->28|68->31|69->32|77->40|77->40|79->64|81->66|81->66|81->66|82->67|85->70|85->70|85->70|85->70|85->70|85->70|85->70|85->70|86->71|86->71|87->72|87->72|87->72|87->72|87->72|88->73|88->73|89->74|89->74|89->74|90->75|90->75|90->75|90->75|90->75|91->76|91->76|93->78|94->79|94->79|96->81|98->83|98->83|99->84|101->86|101->86|102->87|105->90|105->90|106->91|106->91|107->92|108->93|108->93|111->96|111->96|115->100|115->100|115->100|116->101|119->104|119->104|120->105|121->106|121->106|121->106|129->114|129->114|130->115|132->117|132->117|133->118|135->120|135->120|137->122|138->123|138->123|139->124|141->126|141->126|142->127|145->130|145->130|146->131|148->13|149->15|149->17|150->132|152->134|152->134|152->134|153->135|157->139|157->139|157->139|158->140|171->153|173->155|173->155|173->155|175->157|175->157|175->157|175->157|185->167|185->167|185->167|186->168|187->169|187->169|214->196|214->196|214->196|215->197|216->198|216->198|216->198|217->199|218->200|218->200|218->200|218->200|219->201|219->201|219->201|220->202|220->202|220->202|221->203|221->203|221->203|222->204|222->204|222->204|223->205|226->208|226->208|226->208|227->209|230->212|230->212|230->212|231->213|234->216|234->216|234->216|235->217|236->218|237->219|237->219|237->219|237->219|238->220|238->220|238->220|241->223|242->224|248->230|248->230|248->230|249->231|253->235|253->235|253->235|254->236|255->237|255->237|255->237|255->237|260->242|260->242|260->242|260->242|260->242|260->242|264->246|265->247|265->247|265->247|266->248|269->251|270->252|270->252|270->252|271->253|271->253|271->253|271->253|272->254|272->254|273->255|273->255|273->255|273->255|273->255|273->255|274->256|274->256|275->257|277->259|278->260|278->260|278->260|279->261|282->264|283->265|283->265|283->265|284->266|288->270|288->270|288->270|289->271|290->272|290->272|290->272|290->272|290->272|290->272|295->277|295->277|295->277|295->277|295->277|295->277|295->277|295->277|299->281|300->282|303->285|303->285|303->285|304->286|305->287|307->289|312->294|312->294|312->294|313->295|314->296|314->296|314->296|315->297|315->297|315->297|316->298|316->298|316->298|317->299|317->299|317->299|317->299|317->299|317->299|318->300|318->300|318->300|319->301|319->301|319->301|319->301|319->301|319->301|320->302|321->303|322->304|323->305|324->306|325->307|338->320|338->320|338->320|339->321|340->322|340->322|340->322|341->323|341->323|341->323|342->324|342->324|342->324|343->325|343->325|343->325|343->325|343->325|343->325|343->325|344->326|344->326|344->326|345->327|345->327|345->327|345->327|345->327|345->327|345->327|346->328|347->329|348->330|349->331|350->332|351->333|364->346
                  -- GENERATED --
              */
          