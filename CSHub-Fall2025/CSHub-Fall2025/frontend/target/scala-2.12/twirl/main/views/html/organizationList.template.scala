
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

object organizationList extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template15[util.List[Organization],Boolean,Boolean,Integer,String,Integer,Integer,Integer,String,Integer,String,String,Long,Integer,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(entries: util.List[Organization],
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
        organizationName: String,
        id: Long, beginIndexForPagination: Integer, endIndexForPagination: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*15.2*/import helper._

def /*18.2*/scripts/*18.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*18.13*/("""
    """),format.raw/*19.5*/("""<script type = "module" src='"""),_display_(/*19.35*/routes/*19.41*/.Assets.at("javascripts/voiceJump.js")),format.raw/*19.79*/("""'></script>
    <link rel="stylesheet" href="/assets/stylesheets/responsive-table.css">

    <script type="text/javascript">
            $(document).ready(function () """),format.raw/*23.43*/("""{"""),format.raw/*23.44*/("""
                """),format.raw/*24.17*/("""var nasaEndorsedAPIArray = []
                """),_display_(/*25.18*/for(i <- 0 until entries.size) yield /*25.48*/ {_display_(Seq[Any](format.raw/*25.50*/("""
                """),format.raw/*26.17*/("""var json = """),format.raw/*26.28*/("""{"""),format.raw/*26.29*/("""}"""),format.raw/*26.30*/(""";
                json.id = '"""),_display_(/*27.29*/entries/*27.36*/.get(i).getId()),format.raw/*27.51*/("""';
                json.url = "/organization/organizationDetailPage/" + json.id;

                json.name = '"""),_display_(/*30.31*/entries/*30.38*/.get(i).getOrganizationName()),format.raw/*30.67*/("""'.replace(/[^a-zA-Z0-9]/g, " ").replace(/  +/g, " ").trim();
                console.log("jsonhere:" + json)
                nasaEndorsedAPIArray.push(json)
                """)))}),format.raw/*33.18*/("""
                """),format.raw/*34.17*/("""$("#nasaText").text(JSON.stringify(nasaEndorsedAPIArray));

                $('.tooltipped').tooltip();

                // $("#speak-from-filter").click();
                // $("#speak-nasa").click();
                // $("#speak-from-filter").click();

            """),format.raw/*42.13*/("""}"""),format.raw/*42.14*/(""");

            function jumpToPage(pageNum, sort, searchString) """),format.raw/*44.62*/("""{"""),format.raw/*44.63*/("""
                """),format.raw/*45.17*/("""pageNum = Math.floor(pageNum);
                var url = "/organization/searchPOST?pageNum=" + (pageNum) + "&sortCriteria=" + sort;
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
            """),format.raw/*61.13*/("""}"""),format.raw/*61.14*/("""


            """),format.raw/*64.76*/("""

            """),format.raw/*66.13*/("""function changeView(view) """),format.raw/*66.39*/("""{"""),format.raw/*66.40*/("""
                """),format.raw/*67.17*/("""$.ajax("""),format.raw/*67.24*/("""{"""),format.raw/*67.25*/("""
                    """),format.raw/*68.21*/("""url: "/updateProjectZone/" + view,
                    headers: """),format.raw/*69.30*/("""{"""),format.raw/*69.31*/("""
                        """),format.raw/*70.25*/("""'Content-Type': 'application/json'
                    """),format.raw/*71.21*/("""}"""),format.raw/*71.22*/(""",
                    type: "GET"
                """),format.raw/*73.17*/("""}"""),format.raw/*73.18*/(""").done(function (data) """),format.raw/*73.41*/("""{"""),format.raw/*73.42*/("""
                    """),format.raw/*74.21*/("""window.location.href = "/organization/organizationListPage/1?sortCriteria=id";
                """),format.raw/*75.17*/("""}"""),format.raw/*75.18*/(""");
            """),format.raw/*76.13*/("""}"""),format.raw/*76.14*/("""
    """),format.raw/*77.5*/("""</script>
    <style>
            .follow-fab """),format.raw/*79.25*/("""{"""),format.raw/*79.26*/("""
                """),format.raw/*80.17*/("""top: -20px !important;
                bottom: auto !important;
                right: -20px !important;
            """),format.raw/*83.13*/("""}"""),format.raw/*83.14*/("""

            """),format.raw/*85.13*/(""".table-responsive """),format.raw/*85.31*/("""{"""),format.raw/*85.32*/("""
                """),format.raw/*86.17*/("""overflow-x: auto;
                -webkit-overflow-scrolling: touch;
            """),format.raw/*88.13*/("""}"""),format.raw/*88.14*/("""

            """),format.raw/*90.13*/(""".truncate-multiline """),format.raw/*90.33*/("""{"""),format.raw/*90.34*/("""
                """),format.raw/*91.17*/("""display: -webkit-box;
                -webkit-line-clamp: 3;
                -webkit-box-orient: vertical;
                overflow: hidden;
                text-overflow: ellipsis;
                white-space: normal;
            """),format.raw/*97.13*/("""}"""),format.raw/*97.14*/("""

    """),format.raw/*99.5*/("""</style>
""")))};
Seq[Any](format.raw/*14.84*/("""
"""),format.raw/*16.1*/("""

"""),format.raw/*100.2*/("""

"""),_display_(/*102.2*/main("All Organizations", scripts)/*102.36*/ {_display_(Seq[Any](format.raw/*102.38*/("""
    """),format.raw/*103.5*/("""<div class="container">
        <div class="row">
            <div class="col s12 m12">
                <div class="card-panel center">
                    """),_display_(/*107.22*/if(isCallerMySpacePage)/*107.45*/ {_display_(Seq[Any](format.raw/*107.47*/("""
                        """),format.raw/*108.25*/("""<div class="row card-panel z-depth-0 project-zone-panel">
                            <div class="col s12" style="margin-top: -10px;
                                margin-bottom: -10px;">
                                <h6 class="left tooltipped" data-position="bottom" data-tooltip="This list shows all the APIs associated with your current project zone." >
                                    Current Project Zone :
                                    """),_display_(/*113.38*/if(isPrivateZone)/*113.55*/ {_display_(Seq[Any](format.raw/*113.57*/("""
                                        """),format.raw/*114.41*/("""Your Private Zone
                                    """)))}/*115.39*/else/*115.44*/{_display_(Seq[Any](format.raw/*115.45*/("""
                                        """),format.raw/*116.41*/("""OpenNEX
                                """)))}),format.raw/*117.34*/("""
                                """),format.raw/*118.33*/("""</h6>

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
                    """)))}),format.raw/*141.22*/("""

                    """),_display_(/*143.22*/if(entries.size() > 0)/*143.44*/ {_display_(Seq[Any](format.raw/*143.46*/("""
                        """),format.raw/*144.25*/("""<div class="col s8 offset-s2">
                            <h4>Organization List</h4>

                        </div>
                        <div class="col s2">
                            <button id = "speak-from-filter" hidden></button>

                            <div id="nasaText" hidden></div>
                            <div id="requestField"></div>
                            <div id="replyField"></div>
                        </div>
                        <div class="row">
                            <div class="col s6">
                                <h6 class="left">Showing results: """),_display_(/*157.68*/{
                                    offset + 1
                                }),format.raw/*159.34*/(""" """),format.raw/*159.35*/("""to """),_display_(/*159.39*/{
                                    offset + count
                                }),format.raw/*161.34*/(""" """),format.raw/*161.35*/("""of """),_display_(/*161.39*/total),format.raw/*161.44*/("""</h6>
                            </div>
                            <div class="col s6" style="padding-top: -5px;
                                margin-top: -2px">
                                <a class='dropdown-trigger btn-flat right' href='#' data-target='dropdown2' style="text-transform: none;
                                    font-weight: bold;
                                    color: black;
                                    font-family: AmazonEmberBold, Helvetica Neue Bold, Helvetica Neue, Helvetica, Arial, sans-serif;
                                !important; ">
                                    Sort By: &nbsp; <font color="#3a5dc3">
                                """),_display_(/*171.34*/if(sort.equals("id"))/*171.55*/ {_display_(Seq[Any](format.raw/*171.57*/("""
                                    """),format.raw/*172.37*/("""ID
                                """)))}/*173.35*/else if(sort.equals("organization_name"))/*173.76*/ {_display_(Seq[Any](format.raw/*173.78*/("""
                                    """),format.raw/*174.37*/("""Organization Name
                                """)))}/*175.35*/else if(sort.equals("address"))/*175.66*/ {_display_(Seq[Any](format.raw/*175.68*/("""
                                    """),format.raw/*176.37*/("""Address
                                """)))}/*177.35*/else if(sort.equals("focuses"))/*177.66*/ {_display_(Seq[Any](format.raw/*177.68*/("""
                                    """),format.raw/*178.37*/("""Focuses
                                """)))}/*179.35*/else if(sort.equals("url"))/*179.62*/ {_display_(Seq[Any](format.raw/*179.64*/("""
                                    """),format.raw/*180.37*/("""Url
                                """)))}/*181.35*/else/*181.40*/{_display_(Seq[Any](format.raw/*181.41*/("""
                                    """),format.raw/*182.37*/("""Organization Name
                                """)))}),format.raw/*183.34*/("""</font> <i class="material-icons right">expand_more</i></a>

                                    <!-- Dropdown Structure -->
                                <ul id='dropdown2' class='dropdown-content'>
                                """),_display_(/*187.34*/if(listType.equals("all"))/*187.60*/ {_display_(Seq[Any](format.raw/*187.62*/("""
                                    """),format.raw/*188.37*/("""<li><a href=""""),_display_(/*188.51*/routes/*188.57*/.OrganizationController.organizationListPage(1, "id")),format.raw/*188.110*/("""" class="grey-text text-darken-4"><i class="material-icons">
                                        event</i>ID</a></li>
                                    <li><a href=""""),_display_(/*190.51*/routes/*190.57*/.OrganizationController.organizationListPage(1, "organization_name")),format.raw/*190.125*/("""" class="grey-text text-darken-4"><i class="material-icons">
                                        sort_by_alpha</i>Organization Name </a></li>
                                    <li><a href=""""),_display_(/*192.51*/routes/*192.57*/.OrganizationController.organizationListPage(1, "address")),format.raw/*192.115*/("""" class="grey-text text-darken-4"><i class="material-icons">
                                        sort_by_alpha</i>Address</a></li>
                                    <li><a href=""""),_display_(/*194.51*/routes/*194.57*/.OrganizationController.organizationListPage(1, "focuses")),format.raw/*194.115*/("""" class="grey-text text-darken-4"><i class="material-icons">
                                        sort_by_alpha</i>Focuses</a></li>
                                    <li><a href=""""),_display_(/*196.51*/routes/*196.57*/.OrganizationController.organizationListPage(1, "url")),format.raw/*196.111*/("""" class="grey-text text-darken-4"><i class="material-icons">
                                        sort_by_alpha</i>Url</a></li>
                                """)))}/*198.35*/else/*198.40*/{_display_(Seq[Any](format.raw/*198.41*/("""
                                    """),format.raw/*199.37*/("""<li>
                                        <a onclick="jumpToPage(1, 'id', '"""),_display_(/*200.75*/searchBody),format.raw/*200.85*/("""')">
                                            <i class="material-icons">event</i>Date Created
                                        </a>
                                    </li>
                                    <li>
                                        <a onclick="jumpToPage(1, 'organization_name', '"""),_display_(/*205.90*/searchBody),format.raw/*205.100*/("""')">
                                            <i class="material-icons">sort_by_alpha</i>Name
                                        </a>
                                    </li>
                                """)))}),format.raw/*209.34*/("""
                                """),format.raw/*210.33*/("""</ul>
                            </div>
                        </div>

"""),format.raw/*214.59*/("""
"""),format.raw/*215.102*/("""
"""),format.raw/*216.40*/("""
"""),format.raw/*217.93*/("""
"""),format.raw/*218.50*/("""
"""),format.raw/*219.92*/("""
"""),format.raw/*220.82*/("""
"""),format.raw/*221.126*/("""
"""),format.raw/*222.82*/("""
"""),format.raw/*223.129*/("""
"""),format.raw/*224.78*/("""
"""),format.raw/*225.42*/("""
"""),format.raw/*226.41*/("""
"""),format.raw/*227.40*/("""
"""),format.raw/*228.79*/("""
"""),format.raw/*229.41*/("""
"""),format.raw/*230.45*/("""
"""),format.raw/*231.124*/("""
"""),format.raw/*232.73*/("""
"""),format.raw/*233.49*/("""
"""),format.raw/*234.46*/("""
"""),format.raw/*235.45*/("""
"""),format.raw/*236.47*/("""
"""),format.raw/*237.65*/("""
"""),format.raw/*238.115*/("""
"""),format.raw/*239.115*/("""
"""),format.raw/*240.105*/("""
"""),format.raw/*241.106*/("""
"""),format.raw/*242.107*/("""
"""),format.raw/*243.79*/("""
"""),format.raw/*244.69*/("""
"""),format.raw/*245.46*/("""
"""),format.raw/*246.46*/("""
"""),format.raw/*247.45*/("""
"""),format.raw/*248.47*/("""
"""),format.raw/*249.105*/("""
"""),format.raw/*250.84*/("""
"""),format.raw/*251.67*/("""
"""),format.raw/*252.98*/("""
"""),format.raw/*253.96*/("""
"""),format.raw/*254.57*/("""
"""),format.raw/*255.62*/("""
"""),format.raw/*256.50*/("""
"""),format.raw/*257.60*/("""
"""),format.raw/*258.46*/("""
"""),format.raw/*259.46*/("""
"""),format.raw/*260.45*/("""
"""),format.raw/*261.100*/("""
"""),format.raw/*262.81*/("""
"""),format.raw/*263.49*/("""
"""),format.raw/*264.60*/("""
"""),format.raw/*265.42*/("""
"""),format.raw/*266.46*/("""
"""),format.raw/*267.42*/("""
"""),format.raw/*268.34*/("""
"""),format.raw/*269.41*/("""
"""),format.raw/*270.37*/("""
"""),format.raw/*271.35*/("""
"""),format.raw/*272.61*/("""
"""),format.raw/*273.59*/("""
"""),format.raw/*274.105*/("""
"""),format.raw/*275.44*/("""
"""),format.raw/*276.99*/("""
"""),format.raw/*277.96*/("""
"""),format.raw/*278.86*/("""
"""),format.raw/*279.86*/("""
"""),format.raw/*280.82*/("""
"""),format.raw/*281.46*/("""
"""),format.raw/*282.45*/("""
"""),format.raw/*283.44*/("""
"""),format.raw/*284.83*/("""
"""),format.raw/*285.45*/("""
"""),format.raw/*286.80*/("""
"""),format.raw/*287.128*/("""
"""),format.raw/*288.77*/("""
"""),format.raw/*289.53*/("""
"""),format.raw/*290.50*/("""
"""),format.raw/*291.70*/("""
"""),format.raw/*292.47*/("""
"""),format.raw/*293.65*/("""
"""),format.raw/*294.115*/("""
"""),format.raw/*295.115*/("""
"""),format.raw/*296.105*/("""
"""),format.raw/*297.106*/("""
"""),format.raw/*298.107*/("""
"""),format.raw/*299.74*/("""
"""),format.raw/*300.69*/("""
"""),format.raw/*301.46*/("""
"""),format.raw/*302.50*/("""
"""),format.raw/*303.70*/("""
"""),format.raw/*304.47*/("""
"""),format.raw/*305.105*/("""
"""),format.raw/*306.84*/("""
"""),format.raw/*307.67*/("""
"""),format.raw/*308.98*/("""
"""),format.raw/*309.96*/("""
"""),format.raw/*310.57*/("""
"""),format.raw/*311.62*/("""
"""),format.raw/*312.50*/("""
"""),format.raw/*313.60*/("""
"""),format.raw/*314.46*/("""
"""),format.raw/*315.50*/("""
"""),format.raw/*316.66*/("""
"""),format.raw/*317.104*/("""
"""),format.raw/*318.89*/("""
"""),format.raw/*319.53*/("""
"""),format.raw/*320.64*/("""
"""),format.raw/*321.46*/("""
"""),format.raw/*322.50*/("""
"""),format.raw/*323.46*/("""
"""),format.raw/*324.38*/("""
"""),format.raw/*325.45*/("""
"""),format.raw/*326.41*/("""
"""),format.raw/*327.77*/("""
"""),format.raw/*328.79*/("""
"""),format.raw/*329.100*/("""
"""),format.raw/*330.81*/("""
"""),format.raw/*331.124*/("""
"""),format.raw/*332.73*/("""
"""),format.raw/*333.49*/("""
"""),format.raw/*334.47*/("""
"""),format.raw/*335.71*/("""

"""),format.raw/*337.47*/("""
"""),format.raw/*338.71*/("""
"""),format.raw/*339.47*/("""
"""),format.raw/*340.105*/("""
"""),format.raw/*341.84*/("""
"""),format.raw/*342.141*/("""
"""),format.raw/*343.60*/("""
"""),format.raw/*344.46*/("""
"""),format.raw/*345.47*/("""
"""),format.raw/*346.67*/("""
"""),format.raw/*347.104*/("""
"""),format.raw/*348.89*/("""
"""),format.raw/*349.53*/("""
"""),format.raw/*350.64*/("""
"""),format.raw/*351.46*/("""
"""),format.raw/*352.47*/("""
"""),format.raw/*353.43*/("""
"""),format.raw/*354.34*/("""
"""),format.raw/*355.39*/("""

"""),format.raw/*357.35*/("""
"""),format.raw/*358.35*/("""

                        """),format.raw/*360.25*/("""<!-- Desktop Table -->
                        <div class="desktop-table-view">
                            <div class="table-responsive">
                                <table class="centered responsive-table striped" id="organizationTable">
                                    <thead>
                                        <tr class="list-header">
                                            <th>ID</th>
                                            <th>Organization Name</th>
                                            <th>Address</th>
                                            <th>Focuses</th>
                                            <th>URL</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                    """),_display_(/*374.38*/for((entry, index) <- entries.zipWithIndex) yield /*374.81*/ {_display_(Seq[Any](format.raw/*374.83*/("""
                                        """),format.raw/*375.41*/("""<tr>
                                            <td>"""),_display_(/*376.50*/entry/*376.55*/.getId()),format.raw/*376.63*/("""</td>
                                            <td><a href=""""),_display_(/*377.59*/routes/*377.65*/.OrganizationController.organizationDetailPage(entry.getId())),format.raw/*377.126*/("""">"""),_display_(/*377.129*/entry/*377.134*/.getOrganizationName()),format.raw/*377.156*/("""</a></td>
                                            <td>
                                            """),_display_(/*379.46*/{
                                                val parts = Seq(
                                                    Option(entry.getStreetAddress1).map(_.toString).getOrElse(""),
                                                    Option(entry.getStreetAddress2).map(_.toString).getOrElse(""),
                                                    Option(entry.getCity).map(_.toString).getOrElse(""),
                                                    Option(entry.getState).map(_.toString).getOrElse(""),
                                                    Option(entry.getZipCode).map(_.toString).getOrElse("")
                                                ).filter(_.trim.nonEmpty)
                                                parts.mkString(", ")
                                            }),format.raw/*388.46*/("""
                                            """),format.raw/*389.45*/("""</td>
"""),format.raw/*390.55*/("""
"""),format.raw/*391.103*/("""
"""),format.raw/*392.84*/("""
"""),format.raw/*393.123*/("""
"""),format.raw/*394.55*/("""
                                            """),format.raw/*395.45*/("""<td>
                                                """),_display_(/*396.50*/defining(Option(entry.getFocuses).getOrElse(""))/*396.98*/ { focusText =>_display_(Seq[Any](format.raw/*396.113*/("""
                                                    """),format.raw/*397.53*/("""<span class="tooltipped truncate-multiline"
                                                    data-position="bottom"
                                                    data-tooltip=""""),_display_(/*399.68*/focusText),format.raw/*399.77*/("""">
                                                    """),_display_(/*400.54*/focusText),format.raw/*400.63*/("""
                                                    """),format.raw/*401.53*/("""</span>
                                                """)))}),format.raw/*402.50*/("""
                                            """),format.raw/*403.45*/("""</td>
                                            <td>"""),_display_(/*404.50*/if(entry.getURL != null && entry.getURL.length > 50)/*404.102*/ {_display_(Seq[Any](format.raw/*404.104*/(""" """),_display_(/*404.106*/entry/*404.111*/.getURL.substring(0, 50)),format.raw/*404.135*/(""" """),format.raw/*404.136*/("""+ "..." """)))}/*404.146*/else/*404.151*/{_display_(Seq[Any](format.raw/*404.152*/(""" """),_display_(/*404.154*/entry/*404.159*/.getURL),format.raw/*404.166*/(""" """)))}),format.raw/*404.168*/("""</td>
                                        </tr>
                                    """)))}),format.raw/*406.38*/("""
                                    """),format.raw/*407.37*/("""</tbody>
                                </table>
                            </div>
                        </div>

                        <!-- Mobile Cards -->
                        <div class="mobile-table-view">
                        """),_display_(/*414.26*/for(entry <- entries.asScala) yield /*414.55*/ {_display_(Seq[Any](format.raw/*414.57*/("""
                            """),format.raw/*415.29*/("""<div class="card-panel z-depth-1" style="margin-bottom: 16px;">
                                <div><h6>ID:</h6> """),_display_(/*416.52*/entry/*416.57*/.getId()),format.raw/*416.65*/("""</div>
                                <div><h6>Organization Name:</h6> <a href=""""),_display_(/*417.76*/routes/*417.82*/.OrganizationController.organizationDetailPage(entry.getId())),format.raw/*417.143*/("""">"""),_display_(/*417.146*/entry/*417.151*/.getOrganizationName()),format.raw/*417.173*/("""</a></div>
                                <div><h6>Address:</h6>
                                    """),_display_(/*419.38*/{
                                        val parts = Seq(
                                            Option(entry.getStreetAddress1).map(_.toString).getOrElse(""),
                                            Option(entry.getStreetAddress2).map(_.toString).getOrElse(""),
                                            Option(entry.getCity).map(_.toString).getOrElse(""),
                                            Option(entry.getState).map(_.toString).getOrElse(""),
                                            Option(entry.getZipCode).map(_.toString).getOrElse("")
                                        ).filter(_.trim.nonEmpty)
                                        parts.mkString(", ")
                                    }),format.raw/*428.38*/("""
                                """),format.raw/*429.33*/("""</div>
                                <div><h6>Focuses:</h6> """),_display_(/*430.57*/{
                                    val focus = Option(entry.getFocuses).getOrElse("")
                                    val words = focus.split("\\s+")
                                    if (words.length > 30) words.take(30).mkString(" ") + "..." else focus
                                }),format.raw/*434.34*/("""</div>
                                <div><h6>URL:</h6> """),_display_(/*435.53*/if(entry.getURL != null && entry.getURL.length > 50)/*435.105*/ {_display_(Seq[Any](format.raw/*435.107*/(""" """),_display_(/*435.109*/entry/*435.114*/.getURL.substring(0, 50)),format.raw/*435.138*/(""" """),format.raw/*435.139*/("""+ "..." """)))}/*435.149*/else/*435.154*/{_display_(Seq[Any](format.raw/*435.155*/(""" """),_display_(/*435.157*/entry/*435.162*/.getURL),format.raw/*435.169*/(""" """)))}),format.raw/*435.171*/("""</div>
                            </div>
                        """)))}),format.raw/*437.26*/("""
                        """),format.raw/*438.25*/("""</div>

                        <div class="row">
                            <div class="col s12">
                                <ul class="pagination center-align">

                                """),_display_(/*444.34*/if(listType.equals("all"))/*444.60*/ {_display_(Seq[Any](format.raw/*444.62*/("""
                                    """),_display_(/*445.38*/if(pageNum == 1)/*445.54*/ {_display_(Seq[Any](format.raw/*445.56*/("""
                                        """),format.raw/*446.41*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                            first_page</i></li>
                                        <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                            chevron_left</i></li>
                                    """)))}/*450.39*/else/*450.44*/{_display_(Seq[Any](format.raw/*450.45*/("""
                                        """),format.raw/*451.41*/("""<li class="waves-effect"><a href=""""),_display_(/*451.76*/routes/*451.82*/.OrganizationController.organizationListPage(1, sort)),format.raw/*451.135*/(""""><i class="material-icons">
                                            first_page</i></a></li>
                                        <li class="waves-effect"><a href=""""),_display_(/*453.76*/routes/*453.82*/.OrganizationController.organizationListPage(pageNum - 1, sort)),format.raw/*453.145*/(""""><i class="material-icons">
                                            chevron_left</i></a></li>
                                    """)))}),format.raw/*455.38*/("""
                                    """),_display_(/*456.38*/if(beginIndexForPagination > 1)/*456.69*/ {_display_(Seq[Any](format.raw/*456.71*/("""
                                        """),format.raw/*457.41*/("""<li class="waves-effect modal-trigger" href="#allPageModal" style="cursor: pointer;
                                            font-size: 20px;
                                            font-weight: bold">...</li>
                                    """)))}),format.raw/*460.38*/("""
                                    """),_display_(/*461.38*/for(i <- (beginIndexForPagination + 0) to (endIndexForPagination + 0)) yield /*461.108*/ {_display_(Seq[Any](format.raw/*461.110*/("""
                                        """),format.raw/*462.41*/("""<li """),_display_(/*462.46*/if(pageNum == i)/*462.62*/ {_display_(Seq[Any](format.raw/*462.64*/("""
                                            """),format.raw/*463.45*/("""class="active"""")))}),format.raw/*463.60*/("""><a href=""""),_display_(/*463.71*/routes/*463.77*/.OrganizationController.organizationListPage(i, sort)),format.raw/*463.130*/("""">"""),_display_(/*463.133*/i),format.raw/*463.134*/("""</a></li>
                                    """)))}),format.raw/*464.38*/("""
                                    """),_display_(/*465.38*/if(endIndexForPagination < ((total - 1) / pageLimit + 1))/*465.95*/ {_display_(Seq[Any](format.raw/*465.97*/("""
                                        """),format.raw/*466.41*/("""<li class="waves-effect modal-trigger" href="#allPageModal" style="cursor: pointer;
                                            font-size: 20px;
                                            font-weight: bold">...</li>
                                    """)))}),format.raw/*469.38*/("""
                                    """),_display_(/*470.38*/if((offset + count) >= total)/*470.67*/ {_display_(Seq[Any](format.raw/*470.69*/("""
                                        """),format.raw/*471.41*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                            chevron_right</i></li>
                                        <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                            last_page</i></li>
                                    """)))}/*475.39*/else/*475.44*/{_display_(Seq[Any](format.raw/*475.45*/("""
                                        """),format.raw/*476.41*/("""<li class="waves-effect"><a href=""""),_display_(/*476.76*/routes/*476.82*/.OrganizationController.organizationListPage(pageNum + 1, sort)),format.raw/*476.145*/(""""><i class="material-icons">
                                            chevron_right</i></a></li>
                                        <li class="waves-effect"><a href=""""),_display_(/*478.76*/routes/*478.82*/.OrganizationController.organizationListPage((total - 1) / pageLimit + 1, sort)),format.raw/*478.161*/(""""><i class="material-icons">
                                            last_page</i></a></li>
                                    """)))}),format.raw/*480.38*/("""
                                """)))}/*481.35*/else/*481.40*/{_display_(Seq[Any](format.raw/*481.41*/("""
                                    """),_display_(/*482.38*/if(pageNum == 1)/*482.54*/ {_display_(Seq[Any](format.raw/*482.56*/("""
                                        """),format.raw/*483.41*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                            first_page</i></li>
                                        <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                            chevron_left</i></li>
                                    """)))}/*487.39*/else/*487.44*/{_display_(Seq[Any](format.raw/*487.45*/("""
                                        """),format.raw/*488.41*/("""<li class="waves-effect">
                                            <a href="#!" onclick="jumpToPage(1, '"""),_display_(/*489.83*/sort),format.raw/*489.87*/("""', '"""),_display_(/*489.92*/searchBody),format.raw/*489.102*/("""')">
                                                <i class="material-icons">first_page</i>
                                            </a>
                                        </li>
                                        <li class="waves-effect">
                                            <a href="#!" onclick="jumpToPage("""),_display_(/*494.79*/pageNum),format.raw/*494.86*/("""-1, '"""),_display_(/*494.92*/sort),format.raw/*494.96*/("""', '"""),_display_(/*494.101*/searchBody),format.raw/*494.111*/("""')">
                                                <i class="material-icons">chevron_left</i>
                                            </a>
                                        </li>
                                    """)))}),format.raw/*498.38*/("""
                                    """),_display_(/*499.38*/if(beginIndexForPagination > 1)/*499.69*/ {_display_(Seq[Any](format.raw/*499.71*/("""
                                        """),format.raw/*500.41*/("""<li class="waves-effect modal-trigger" href="#searchPageModal" style="cursor: pointer;
                                            font-size: 20px;
                                            font-weight: bold">...</li>
                                    """)))}),format.raw/*503.38*/("""
                                    """),_display_(/*504.38*/for(i <- (beginIndexForPagination + 0) to (endIndexForPagination + 0)) yield /*504.108*/ {_display_(Seq[Any](format.raw/*504.110*/("""
                                        """),format.raw/*505.41*/("""<li """),_display_(/*505.46*/if(pageNum == i)/*505.62*/ {_display_(Seq[Any](format.raw/*505.64*/("""
                                            """),format.raw/*506.45*/("""class="active"""")))}),format.raw/*506.60*/(""">
                                            <a href="#!" onclick="jumpToPage("""),_display_(/*507.79*/i),format.raw/*507.80*/(""", '"""),_display_(/*507.84*/sort),format.raw/*507.88*/("""', '"""),_display_(/*507.93*/searchBody),format.raw/*507.103*/("""')">
                                            """),_display_(/*508.46*/i),format.raw/*508.47*/("""
                                            """),format.raw/*509.45*/("""</a>
                                        </li>
                                    """)))}),format.raw/*511.38*/("""
                                    """),_display_(/*512.38*/if(endIndexForPagination < ((total - 1) / pageLimit + 1))/*512.95*/ {_display_(Seq[Any](format.raw/*512.97*/("""
                                        """),format.raw/*513.41*/("""<li class="waves-effect modal-trigger" href="#searchPageModal" style="cursor: pointer;
                                            font-size: 20px;
                                            font-weight: bold">...</li>
                                    """)))}),format.raw/*516.38*/("""
                                    """),_display_(/*517.38*/if((offset + count) >= total)/*517.67*/ {_display_(Seq[Any](format.raw/*517.69*/("""
                                        """),format.raw/*518.41*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                            chevron_right</i></li>
                                        <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                            last_page</i></li>
                                    """)))}/*522.39*/else/*522.44*/{_display_(Seq[Any](format.raw/*522.45*/("""
                                        """),format.raw/*523.41*/("""<li class="waves-effect">
                                            <a href="#!" onclick="jumpToPage("""),_display_(/*524.79*/pageNum),format.raw/*524.86*/("""+1, '"""),_display_(/*524.92*/sort),format.raw/*524.96*/("""', '"""),_display_(/*524.101*/searchBody),format.raw/*524.111*/("""')">
                                                <i class="material-icons">chevron_right</i>
                                            </a>
                                        </li>
                                        <li class="waves-effect">
                                            <a href="#!" onclick="jumpToPage(("""),_display_(/*529.80*/total),format.raw/*529.85*/("""-1) / ("""),_display_(/*529.93*/pageLimit),format.raw/*529.102*/(""") + 1, '"""),_display_(/*529.111*/sort),format.raw/*529.115*/("""', '"""),_display_(/*529.120*/searchBody),format.raw/*529.130*/("""')">
                                                <i class="material-icons">last_page</i>
                                            </a>
                                        </li>
                                    """)))}),format.raw/*533.38*/("""
                                """)))}),format.raw/*534.34*/("""
                                """),format.raw/*535.33*/("""</ul>
                            </div>
                        </div>
                    """)))}/*538.23*/else/*538.28*/{_display_(Seq[Any](format.raw/*538.29*/("""
                        """),format.raw/*539.25*/("""<h5>No organization was found.</h5>
                    """)))}),format.raw/*540.22*/("""

                    """),format.raw/*542.21*/("""<div id="allPageModal" class="modal">
                        <div class="modal-content">
                            <h6>Select the page number you want to jump to</h6>
                            <div class="card z-depth-0">

                            """),_display_(/*547.30*/for(i <- (0) to ((((total - 1) / (pageLimit) + 1) - 1) / 10)) yield /*547.91*/ {_display_(Seq[Any](format.raw/*547.93*/("""
                                """),format.raw/*548.33*/("""<ul class="pagination center-align">
                                """),_display_(/*549.34*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*549.73*/ {_display_(Seq[Any](format.raw/*549.75*/("""
                                    """),_display_(/*550.38*/if(j <= ((total - 1) / (pageLimit) + 1))/*550.78*/ {_display_(Seq[Any](format.raw/*550.80*/("""
                                        """),_display_(/*551.42*/if(j != pageNum)/*551.58*/ {_display_(Seq[Any](format.raw/*551.60*/("""
                                            """),format.raw/*552.45*/("""<li class="waves-effect grey lighten-3"><a href='"""),_display_(/*552.95*/routes/*552.101*/.OrganizationController.organizationListPage(j, sort)),format.raw/*552.154*/("""'>"""),_display_(/*552.157*/j),format.raw/*552.158*/("""</a></li>
                                        """)))}/*553.43*/else/*553.48*/{_display_(Seq[Any](format.raw/*553.49*/("""
                                            """),format.raw/*554.45*/("""<li class="waves-effect active"><a href=""""),_display_(/*554.87*/routes/*554.93*/.OrganizationController.organizationListPage(j, sort)),format.raw/*554.146*/("""">"""),_display_(/*554.149*/j),format.raw/*554.150*/("""</a></li>
                                        """)))}),format.raw/*555.42*/("""
                                    """)))}),format.raw/*556.38*/("""
                                """)))}),format.raw/*557.34*/("""
                                """),format.raw/*558.33*/("""</ul>
                            """)))}),format.raw/*559.30*/("""
                            """),format.raw/*560.29*/("""</div>
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

                            """),_display_(/*573.30*/for(i <- (0) to ((((total - 1) / (pageLimit) + 1) - 1) / 10)) yield /*573.91*/ {_display_(Seq[Any](format.raw/*573.93*/("""
                                """),format.raw/*574.33*/("""<ul class="pagination center-align">
                                """),_display_(/*575.34*/for(j <- (i * 10 + 1) to (i * 10 + 10)) yield /*575.73*/ {_display_(Seq[Any](format.raw/*575.75*/("""
                                    """),_display_(/*576.38*/if(j <= ((total - 1) / (pageLimit) + 1))/*576.78*/ {_display_(Seq[Any](format.raw/*576.80*/("""
                                        """),_display_(/*577.42*/if(j != pageNum)/*577.58*/ {_display_(Seq[Any](format.raw/*577.60*/("""
                                            """),format.raw/*578.45*/("""<li class="waves-effect grey lighten-3"><a href='#!' onclick="jumpToPage("""),_display_(/*578.119*/j),format.raw/*578.120*/(""", 'id', '"""),_display_(/*578.130*/searchBody),format.raw/*578.140*/("""')">"""),_display_(/*578.145*/j),format.raw/*578.146*/("""</a></li>
                                        """)))}/*579.43*/else/*579.48*/{_display_(Seq[Any](format.raw/*579.49*/("""
                                            """),format.raw/*580.45*/("""<li class="waves-effect active"><a href="#!" onclick="jumpToPage("""),_display_(/*580.111*/j),format.raw/*580.112*/(""", 'id', '"""),_display_(/*580.122*/searchBody),format.raw/*580.132*/("""')">"""),_display_(/*580.137*/j),format.raw/*580.138*/("""</a></li>
                                        """)))}),format.raw/*581.42*/("""
                                    """)))}),format.raw/*582.38*/("""
                                """)))}),format.raw/*583.34*/("""
                                """),format.raw/*584.33*/("""</ul>
                            """)))}),format.raw/*585.30*/("""
                            """),format.raw/*586.29*/("""</div>
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
""")))}),format.raw/*597.2*/("""

"""))
      }
    }
  }

  def render(entries:util.List[Organization],isPrivateZone:Boolean,isCallerMySpacePage:Boolean,pageNum:Integer,sort:String,offset:Integer,total:Integer,count:Integer,listType:String,pageLimit:Integer,searchBody:String,organizationName:String,id:Long,beginIndexForPagination:Integer,endIndexForPagination:Integer): play.twirl.api.HtmlFormat.Appendable = apply(entries,isPrivateZone,isCallerMySpacePage,pageNum,sort,offset,total,count,listType,pageLimit,searchBody,organizationName,id,beginIndexForPagination,endIndexForPagination)

  def f:((util.List[Organization],Boolean,Boolean,Integer,String,Integer,Integer,Integer,String,Integer,String,String,Long,Integer,Integer) => play.twirl.api.HtmlFormat.Appendable) = (entries,isPrivateZone,isCallerMySpacePage,pageNum,sort,offset,total,count,listType,pageLimit,searchBody,organizationName,id,beginIndexForPagination,endIndexForPagination) => apply(entries,isPrivateZone,isCallerMySpacePage,pageNum,sort,offset,total,count,listType,pageLimit,searchBody,organizationName,id,beginIndexForPagination,endIndexForPagination)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:33 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/organizationList.scala.html
                  HASH: d6c75b9a16a0d04730ff0cff3e27d8f525ecaea1
                  MATRIX: 814->1|1269->19|1768->446|1797->465|1812->472|1893->476|1925->481|1982->511|1997->517|2056->555|2251->722|2280->723|2325->740|2399->787|2445->817|2485->819|2530->836|2569->847|2598->848|2627->849|2684->879|2700->886|2736->901|2875->1013|2891->1020|2941->1049|3146->1223|3191->1240|3486->1507|3515->1508|3608->1573|3637->1574|3682->1591|4391->2272|4420->2273|4463->2351|4505->2365|4559->2391|4588->2392|4633->2409|4668->2416|4697->2417|4746->2438|4838->2502|4867->2503|4920->2528|5003->2583|5032->2584|5110->2634|5139->2635|5190->2658|5219->2659|5268->2680|5391->2775|5420->2776|5463->2791|5492->2792|5524->2797|5598->2843|5627->2844|5672->2861|5817->2978|5846->2979|5888->2993|5934->3011|5963->3012|6008->3029|6117->3110|6146->3111|6188->3125|6236->3145|6265->3146|6310->3163|6569->3394|6598->3395|6631->3401|6681->444|6709->462|6739->3411|6769->3414|6813->3448|6854->3450|6887->3455|7072->3612|7105->3635|7146->3637|7200->3662|7685->4119|7712->4136|7753->4138|7823->4179|7898->4235|7912->4240|7952->4241|8022->4282|8095->4323|8157->4356|9890->6057|9941->6080|9973->6102|10014->6104|10068->6129|10702->6735|10806->6817|10836->6818|10868->6822|10976->6908|11006->6909|11038->6913|11065->6918|11789->7614|11820->7635|11861->7637|11927->7674|11983->7711|12034->7752|12075->7754|12141->7791|12212->7843|12253->7874|12294->7876|12360->7913|12421->7955|12462->7986|12503->7988|12569->8025|12630->8067|12667->8094|12708->8096|12774->8133|12831->8171|12845->8176|12885->8177|12951->8214|13034->8265|13297->8500|13333->8526|13374->8528|13440->8565|13482->8579|13498->8585|13574->8638|13774->8810|13790->8816|13881->8884|14105->9080|14121->9086|14202->9144|14415->9329|14431->9335|14512->9393|14725->9578|14741->9584|14818->9638|15002->9803|15016->9808|15056->9809|15122->9846|15229->9925|15261->9935|15603->10249|15636->10259|15885->10476|15947->10509|16049->10640|16080->10742|16110->10782|16140->10875|16170->10925|16200->11017|16230->11099|16261->11225|16291->11307|16322->11436|16352->11514|16382->11556|16412->11597|16442->11637|16472->11716|16502->11757|16532->11802|16563->11926|16593->11999|16623->12048|16653->12094|16683->12139|16713->12186|16743->12251|16774->12366|16805->12481|16836->12586|16867->12692|16898->12799|16928->12878|16958->12947|16988->12993|17018->13039|17048->13084|17078->13131|17109->13236|17139->13320|17169->13387|17199->13485|17229->13581|17259->13638|17289->13700|17319->13750|17349->13810|17379->13856|17409->13902|17439->13947|17470->14047|17500->14128|17530->14177|17560->14237|17590->14279|17620->14325|17650->14367|17680->14401|17710->14442|17740->14479|17770->14514|17800->14575|17830->14634|17861->14739|17891->14783|17921->14882|17951->14978|17981->15064|18011->15150|18041->15232|18071->15278|18101->15323|18131->15367|18161->15450|18191->15495|18221->15575|18252->15703|18282->15780|18312->15833|18342->15883|18372->15953|18402->16000|18432->16065|18463->16180|18494->16295|18525->16400|18556->16506|18587->16613|18617->16687|18647->16756|18677->16802|18707->16852|18737->16922|18767->16969|18798->17074|18828->17158|18858->17225|18888->17323|18918->17419|18948->17476|18978->17538|19008->17588|19038->17648|19068->17694|19098->17744|19128->17810|19159->17914|19189->18003|19219->18056|19249->18120|19279->18166|19309->18216|19339->18262|19369->18300|19399->18345|19429->18386|19459->18463|19489->18542|19520->18642|19550->18723|19581->18847|19611->18920|19641->18969|19671->19016|19701->19087|19732->19135|19762->19206|19792->19253|19823->19358|19853->19442|19884->19583|19914->19643|19944->19689|19974->19736|20004->19803|20035->19907|20065->19996|20095->20049|20125->20113|20155->20159|20185->20206|20215->20249|20245->20283|20275->20322|20306->20358|20336->20393|20391->20419|21250->21250|21310->21293|21351->21295|21421->21336|21503->21390|21518->21395|21548->21403|21640->21467|21656->21473|21740->21534|21772->21537|21788->21542|21833->21564|21965->21668|22790->22471|22864->22516|22899->22576|22930->22679|22960->22763|22991->22886|23021->22941|23095->22986|23177->23040|23235->23088|23290->23103|23372->23156|23586->23342|23617->23351|23701->23407|23732->23416|23814->23469|23903->23526|23977->23571|24060->23626|24123->23678|24165->23680|24196->23682|24212->23687|24259->23711|24290->23712|24320->23722|24335->23727|24376->23728|24407->23730|24423->23735|24453->23742|24488->23744|24609->23833|24675->23870|24947->24114|24993->24143|25034->24145|25092->24174|25235->24289|25250->24294|25280->24302|25390->24384|25406->24390|25490->24451|25522->24454|25538->24459|25583->24481|25714->24584|26467->25315|26529->25348|26620->25411|26939->25708|27026->25767|27089->25819|27131->25821|27162->25823|27178->25828|27225->25852|27256->25853|27286->25863|27301->25868|27342->25869|27373->25871|27389->25876|27419->25883|27454->25885|27553->25952|27607->25977|27838->26180|27874->26206|27915->26208|27981->26246|28007->26262|28048->26264|28118->26305|28515->26683|28529->26688|28569->26689|28639->26730|28702->26765|28718->26771|28794->26824|28994->26996|29010->27002|29096->27065|29264->27201|29330->27239|29371->27270|29412->27272|29482->27313|29768->27567|29834->27605|29922->27675|29964->27677|30034->27718|30067->27723|30093->27739|30134->27741|30208->27786|30255->27801|30294->27812|30310->27818|30386->27871|30418->27874|30442->27875|30521->27922|30587->27960|30654->28017|30695->28019|30765->28060|31051->28314|31117->28352|31156->28381|31197->28383|31267->28424|31664->28802|31678->28807|31718->28808|31788->28849|31851->28884|31867->28890|31953->28953|32156->29128|32172->29134|32274->29213|32439->29346|32493->29381|32507->29386|32547->29387|32613->29425|32639->29441|32680->29443|32750->29484|33147->29862|33161->29867|33201->29868|33271->29909|33407->30017|33433->30021|33466->30026|33499->30036|33860->30369|33889->30376|33923->30382|33949->30386|33983->30391|34016->30401|34276->30629|34342->30667|34383->30698|34424->30700|34494->30741|34783->30998|34849->31036|34937->31106|34979->31108|35049->31149|35082->31154|35108->31170|35149->31172|35223->31217|35270->31232|35378->31312|35401->31313|35433->31317|35459->31321|35492->31326|35525->31336|35603->31386|35626->31387|35700->31432|35820->31520|35886->31558|35953->31615|35994->31617|36064->31658|36353->31915|36419->31953|36458->31982|36499->31984|36569->32025|36966->32403|36980->32408|37020->32409|37090->32450|37222->32554|37251->32561|37285->32567|37311->32571|37345->32576|37378->32586|37743->32923|37770->32928|37806->32936|37838->32945|37876->32954|37903->32958|37937->32963|37970->32973|38227->33198|38293->33232|38355->33265|38468->33359|38482->33364|38522->33365|38576->33390|38665->33447|38716->33469|39001->33726|39079->33787|39120->33789|39182->33822|39280->33892|39336->33931|39377->33933|39443->33971|39493->34011|39534->34013|39604->34055|39630->34071|39671->34073|39745->34118|39823->34168|39840->34174|39916->34227|39948->34230|39972->34231|40043->34283|40057->34288|40097->34289|40171->34334|40241->34376|40257->34382|40333->34435|40365->34438|40389->34439|40472->34490|40542->34528|40608->34562|40670->34595|40737->34630|40795->34659|41390->35226|41468->35287|41509->35289|41571->35322|41669->35392|41725->35431|41766->35433|41832->35471|41882->35511|41923->35513|41993->35555|42019->35571|42060->35573|42134->35618|42237->35692|42261->35693|42300->35703|42333->35713|42367->35718|42391->35719|42462->35771|42476->35776|42516->35777|42590->35822|42685->35888|42709->35889|42748->35899|42781->35909|42815->35914|42839->35915|42922->35966|42992->36004|43058->36038|43120->36071|43187->36106|43245->36135|43631->36490
                  LINES: 31->1|36->2|51->15|53->18|53->18|55->18|56->19|56->19|56->19|56->19|60->23|60->23|61->24|62->25|62->25|62->25|63->26|63->26|63->26|63->26|64->27|64->27|64->27|67->30|67->30|67->30|70->33|71->34|79->42|79->42|81->44|81->44|82->45|98->61|98->61|101->64|103->66|103->66|103->66|104->67|104->67|104->67|105->68|106->69|106->69|107->70|108->71|108->71|110->73|110->73|110->73|110->73|111->74|112->75|112->75|113->76|113->76|114->77|116->79|116->79|117->80|120->83|120->83|122->85|122->85|122->85|123->86|125->88|125->88|127->90|127->90|127->90|128->91|134->97|134->97|136->99|138->14|139->16|141->100|143->102|143->102|143->102|144->103|148->107|148->107|148->107|149->108|154->113|154->113|154->113|155->114|156->115|156->115|156->115|157->116|158->117|159->118|182->141|184->143|184->143|184->143|185->144|198->157|200->159|200->159|200->159|202->161|202->161|202->161|202->161|212->171|212->171|212->171|213->172|214->173|214->173|214->173|215->174|216->175|216->175|216->175|217->176|218->177|218->177|218->177|219->178|220->179|220->179|220->179|221->180|222->181|222->181|222->181|223->182|224->183|228->187|228->187|228->187|229->188|229->188|229->188|229->188|231->190|231->190|231->190|233->192|233->192|233->192|235->194|235->194|235->194|237->196|237->196|237->196|239->198|239->198|239->198|240->199|241->200|241->200|246->205|246->205|250->209|251->210|255->214|256->215|257->216|258->217|259->218|260->219|261->220|262->221|263->222|264->223|265->224|266->225|267->226|268->227|269->228|270->229|271->230|272->231|273->232|274->233|275->234|276->235|277->236|278->237|279->238|280->239|281->240|282->241|283->242|284->243|285->244|286->245|287->246|288->247|289->248|290->249|291->250|292->251|293->252|294->253|295->254|296->255|297->256|298->257|299->258|300->259|301->260|302->261|303->262|304->263|305->264|306->265|307->266|308->267|309->268|310->269|311->270|312->271|313->272|314->273|315->274|316->275|317->276|318->277|319->278|320->279|321->280|322->281|323->282|324->283|325->284|326->285|327->286|328->287|329->288|330->289|331->290|332->291|333->292|334->293|335->294|336->295|337->296|338->297|339->298|340->299|341->300|342->301|343->302|344->303|345->304|346->305|347->306|348->307|349->308|350->309|351->310|352->311|353->312|354->313|355->314|356->315|357->316|358->317|359->318|360->319|361->320|362->321|363->322|364->323|365->324|366->325|367->326|368->327|369->328|370->329|371->330|372->331|373->332|374->333|375->334|376->335|378->337|379->338|380->339|381->340|382->341|383->342|384->343|385->344|386->345|387->346|388->347|389->348|390->349|391->350|392->351|393->352|394->353|395->354|396->355|398->357|399->358|401->360|415->374|415->374|415->374|416->375|417->376|417->376|417->376|418->377|418->377|418->377|418->377|418->377|418->377|420->379|429->388|430->389|431->390|432->391|433->392|434->393|435->394|436->395|437->396|437->396|437->396|438->397|440->399|440->399|441->400|441->400|442->401|443->402|444->403|445->404|445->404|445->404|445->404|445->404|445->404|445->404|445->404|445->404|445->404|445->404|445->404|445->404|445->404|447->406|448->407|455->414|455->414|455->414|456->415|457->416|457->416|457->416|458->417|458->417|458->417|458->417|458->417|458->417|460->419|469->428|470->429|471->430|475->434|476->435|476->435|476->435|476->435|476->435|476->435|476->435|476->435|476->435|476->435|476->435|476->435|476->435|476->435|478->437|479->438|485->444|485->444|485->444|486->445|486->445|486->445|487->446|491->450|491->450|491->450|492->451|492->451|492->451|492->451|494->453|494->453|494->453|496->455|497->456|497->456|497->456|498->457|501->460|502->461|502->461|502->461|503->462|503->462|503->462|503->462|504->463|504->463|504->463|504->463|504->463|504->463|504->463|505->464|506->465|506->465|506->465|507->466|510->469|511->470|511->470|511->470|512->471|516->475|516->475|516->475|517->476|517->476|517->476|517->476|519->478|519->478|519->478|521->480|522->481|522->481|522->481|523->482|523->482|523->482|524->483|528->487|528->487|528->487|529->488|530->489|530->489|530->489|530->489|535->494|535->494|535->494|535->494|535->494|535->494|539->498|540->499|540->499|540->499|541->500|544->503|545->504|545->504|545->504|546->505|546->505|546->505|546->505|547->506|547->506|548->507|548->507|548->507|548->507|548->507|548->507|549->508|549->508|550->509|552->511|553->512|553->512|553->512|554->513|557->516|558->517|558->517|558->517|559->518|563->522|563->522|563->522|564->523|565->524|565->524|565->524|565->524|565->524|565->524|570->529|570->529|570->529|570->529|570->529|570->529|570->529|570->529|574->533|575->534|576->535|579->538|579->538|579->538|580->539|581->540|583->542|588->547|588->547|588->547|589->548|590->549|590->549|590->549|591->550|591->550|591->550|592->551|592->551|592->551|593->552|593->552|593->552|593->552|593->552|593->552|594->553|594->553|594->553|595->554|595->554|595->554|595->554|595->554|595->554|596->555|597->556|598->557|599->558|600->559|601->560|614->573|614->573|614->573|615->574|616->575|616->575|616->575|617->576|617->576|617->576|618->577|618->577|618->577|619->578|619->578|619->578|619->578|619->578|619->578|619->578|620->579|620->579|620->579|621->580|621->580|621->580|621->580|621->580|621->580|621->580|622->581|623->582|624->583|625->584|626->585|627->586|638->597
                  -- GENERATED --
              */
          