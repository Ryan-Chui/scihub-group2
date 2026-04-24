
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

object authorAuthorRelation extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(relation:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._

def /*4.2*/scripts/*4.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*4.13*/("""
    """),format.raw/*5.5*/("""<link rel="stylesheet" href='"""),_display_(/*5.35*/routes/*5.41*/.Assets.at("stylesheets/vis.css")),format.raw/*5.74*/("""'>
    <style type="text/css">
            html, body """),format.raw/*7.24*/("""{"""),format.raw/*7.25*/("""
                """),format.raw/*8.17*/("""font: 10pt arial;
            """),format.raw/*9.13*/("""}"""),format.raw/*9.14*/("""
            """),format.raw/*10.13*/("""#mynetwork """),format.raw/*10.24*/("""{"""),format.raw/*10.25*/("""
                """),format.raw/*11.17*/("""width: 900px;
                height: 900px;
                border: 1px solid lightgray;
            """),format.raw/*14.13*/("""}"""),format.raw/*14.14*/("""
            """),format.raw/*15.13*/("""#loadingBar """),format.raw/*15.25*/("""{"""),format.raw/*15.26*/("""
                """),format.raw/*16.17*/("""position:absolute;

                width: 910px;
                height: 910px;
                background-color:rgba(200,200,200,0.8);
                -webkit-transition: all 0.5s ease;
                -moz-transition: all 0.5s ease;
                -ms-transition: all 0.5s ease;
                -o-transition: all 0.5s ease;
                transition: all 0.5s ease;
                opacity:1;
            """),format.raw/*27.13*/("""}"""),format.raw/*27.14*/("""
            """),format.raw/*28.13*/("""#wrapper """),format.raw/*28.22*/("""{"""),format.raw/*28.23*/("""
                """),format.raw/*29.17*/("""position:relative;
                width:900px;
                height:900px;
            """),format.raw/*32.13*/("""}"""),format.raw/*32.14*/("""

            """),format.raw/*34.13*/("""#text """),format.raw/*34.19*/("""{"""),format.raw/*34.20*/("""
                """),format.raw/*35.17*/("""position:absolute;
                top:0px;
                left:830px;
                width:30px;
                height:50px;
                margin:auto auto auto auto;
                font-size:22px;
                color: #000000;
            """),format.raw/*43.13*/("""}"""),format.raw/*43.14*/("""


            """),format.raw/*46.13*/("""div.outerBorder """),format.raw/*46.29*/("""{"""),format.raw/*46.30*/("""
                """),format.raw/*47.17*/("""position:relative;
                top:450px;
                width:900px;
                height:44px;
                margin:auto auto auto auto;
                border:8px solid rgba(0,0,0,0.1);
                background: rgb(252,252,252); /* Old browsers */
                background: -moz-linear-gradient(top,  rgba(252,252,252,1) 0%, rgba(237,237,237,1) 100%); /* FF3.6+ */
                background: -webkit-gradient(linear, left top, left bottom, color-stop(0%,rgba(252,252,252,1)), color-stop(100%,rgba(237,237,237,1))); /* Chrome,Safari4+ */
                background: -webkit-linear-gradient(top,  rgba(252,252,252,1) 0%,rgba(237,237,237,1) 100%); /* Chrome10+,Safari5.1+ */
                background: -o-linear-gradient(top,  rgba(252,252,252,1) 0%,rgba(237,237,237,1) 100%); /* Opera 11.10+ */
                background: -ms-linear-gradient(top,  rgba(252,252,252,1) 0%,rgba(237,237,237,1) 100%); /* IE10+ */
                background: linear-gradient(to bottom,  rgba(252,252,252,1) 0%,rgba(237,237,237,1) 100%); /* W3C */
                filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#fcfcfc', endColorstr='#ededed',GradientType=0 ); /* IE6-9 */
                border-radius:72px;
                box-shadow: 0px 0px 10px rgba(0,0,0,0.2);
            """),format.raw/*63.13*/("""}"""),format.raw/*63.14*/("""

            """),format.raw/*65.13*/("""#border """),format.raw/*65.21*/("""{"""),format.raw/*65.22*/("""
                """),format.raw/*66.17*/("""position:absolute;
                top:2px;
                left:2px;
                width:800px;
                height:23px;
                margin:auto auto auto auto;
                box-shadow: 0px 0px 4px rgba(0,0,0,0.2);
                border-radius:10px;
            """),format.raw/*74.13*/("""}"""),format.raw/*74.14*/("""

            """),format.raw/*76.13*/("""#bar """),format.raw/*76.18*/("""{"""),format.raw/*76.19*/("""
                """),format.raw/*77.17*/("""position:absolute;

                width:10px;
                height:20px;
                margin:auto auto auto auto;
                border-radius:11px;
                border:2px solid rgba(30,30,30,0.05);
                background: rgb(153, 255, 255); /* Old browsers */
                box-shadow: 2px 2px 4px rgba(0,0,0,0.4);
            """),format.raw/*86.13*/("""}"""),format.raw/*86.14*/("""

            """),format.raw/*88.13*/("""#config """),format.raw/*88.21*/("""{"""),format.raw/*88.22*/("""

                """),format.raw/*90.17*/("""width: 400px;
                height: 600px;

            """),format.raw/*93.13*/("""}"""),format.raw/*93.14*/("""
            """),format.raw/*94.13*/("""#config input """),format.raw/*94.27*/("""{"""),format.raw/*94.28*/("""
                """),format.raw/*95.17*/("""display: inline-block;
            """),format.raw/*96.13*/("""}"""),format.raw/*96.14*/("""
            """),format.raw/*97.13*/("""#config input.vis-configuration.vis-config-rangeinput """),format.raw/*97.67*/("""{"""),format.raw/*97.68*/("""
                """),format.raw/*98.17*/("""height: 15px;
            """),format.raw/*99.13*/("""}"""),format.raw/*99.14*/("""
            """),format.raw/*100.13*/("""#config button, input, select, textarea """),format.raw/*100.53*/("""{"""),format.raw/*100.54*/("""
                """),format.raw/*101.17*/("""line-height: 100%;
            """),format.raw/*102.13*/("""}"""),format.raw/*102.14*/("""
    """),format.raw/*103.5*/("""</style>

    <script type="text/javascript" src='"""),_display_(/*105.42*/routes/*105.48*/.Assets.at("javascripts/exampleUtil.js")),format.raw/*105.88*/("""'></script>
    <script type="text/javascript" src='"""),_display_(/*106.42*/routes/*106.48*/.Assets.at("javascripts/plugins/vis.js")),format.raw/*106.88*/("""'></script>
    <script type="text/javascript">

            var responseJson = null;
            var jsonString = null;
            var edgeData = null;

            $(document).ready(function() """),format.raw/*113.42*/("""{"""),format.raw/*113.43*/("""
                """),format.raw/*114.17*/("""$("#panel").hide();
                $("#edgeDataPanel").hide();


                $("#config").hide();
                $("#related").hide();
                $("#basicConf").hide();
                jsonString =  $('#jsonData').text();
                draw();
            """),format.raw/*123.13*/("""}"""),format.raw/*123.14*/(""")

            var p1 = "User";
            var p2 = "Dataset";
            var p3 = "Service";


            var degrees = 1;// graph level setting
            var nodes = null;
            var edges = null;
            var network = null;
            var allNodes;
            var allEdges;
            var highlightActive = false;
            var test = """),_display_(/*137.25*/Html(relation)),format.raw/*137.39*/(""";
            var nodes = test.nodes;

            var edges = test.links;
            var nodesDataset = new vis.DataSet(nodes);
            var edgesDataset = new vis.DataSet(edges);
            var visAdvancedConfig = 1;
            var visBasicConfig = 1;

            function getParameters() """),format.raw/*146.38*/("""{"""),format.raw/*146.39*/("""
                """),format.raw/*147.17*/("""var temp1 = document.getElementById("paramCombination").value;
                var choice = null;
                var temp2 = temp1.split(" ");
                if (document.getElementById('filterCombination') != null) """),format.raw/*150.75*/("""{"""),format.raw/*150.76*/("""
                    """),format.raw/*151.21*/("""var filteredChoice = document.getElementById("filterCombination").value;
                """),format.raw/*152.17*/("""}"""),format.raw/*152.18*/(""" """),format.raw/*152.19*/("""else """),format.raw/*152.24*/("""{"""),format.raw/*152.25*/("""
                    """),format.raw/*153.21*/("""var filteredChoice = null;
                """),format.raw/*154.17*/("""}"""),format.raw/*154.18*/("""
                """),format.raw/*155.17*/("""if (document.getElementById('filterId') != null) """),format.raw/*155.66*/("""{"""),format.raw/*155.67*/("""
                    """),format.raw/*156.21*/("""var filteredId = document.getElementById("filterId").value;
                """),format.raw/*157.17*/("""}"""),format.raw/*157.18*/(""" """),format.raw/*157.19*/("""else """),format.raw/*157.24*/("""{"""),format.raw/*157.25*/("""
                    """),format.raw/*158.21*/("""var filteredId = null;
                """),format.raw/*159.17*/("""}"""),format.raw/*159.18*/("""
                """),format.raw/*160.17*/("""if (document.getElementById('fStartTime') != null) """),format.raw/*160.68*/("""{"""),format.raw/*160.69*/("""
                    """),format.raw/*161.21*/("""var fStartTime = document.getElementById("fStartTime").value;
                """),format.raw/*162.17*/("""}"""),format.raw/*162.18*/(""" """),format.raw/*162.19*/("""else """),format.raw/*162.24*/("""{"""),format.raw/*162.25*/("""
                    """),format.raw/*163.21*/("""var fStartTime = null;
                """),format.raw/*164.17*/("""}"""),format.raw/*164.18*/("""
                """),format.raw/*165.17*/("""if (document.getElementById('fEndTime') != null) """),format.raw/*165.66*/("""{"""),format.raw/*165.67*/("""
                    """),format.raw/*166.21*/("""var fEndTime = document.getElementById("fEndTime").value;
                """),format.raw/*167.17*/("""}"""),format.raw/*167.18*/(""" """),format.raw/*167.19*/("""else """),format.raw/*167.24*/("""{"""),format.raw/*167.25*/("""
                    """),format.raw/*168.21*/("""var fEndTime = null;
                """),format.raw/*169.17*/("""}"""),format.raw/*169.18*/("""
                """),format.raw/*175.22*/("""
                """),format.raw/*176.17*/("""p1 = temp2[0];
                p2 = temp2[1];
                p3 = temp2[2];
                if(p1 == "Dataset" || p2 == "Dataset") """),format.raw/*179.56*/("""{"""),format.raw/*179.57*/("""
                    """),format.raw/*180.21*/("""choice = $('input[name="customizedChoiceW"]:checked').val();
                """),format.raw/*181.17*/("""}"""),format.raw/*181.18*/("""

                """),format.raw/*183.17*/("""if(choice == "variableNameW") """),format.raw/*183.47*/("""{"""),format.raw/*183.48*/("""

                    """),format.raw/*185.21*/("""if(p1 == "Dataset")
                        document.getElementById("header").innerHTML =  "Variable × " + p2.toLowerCase() + " | " + p3.toLowerCase() + " <img src=\"/assets/images/Legend.jpg\" height=\"20\" width=\"190\"/><span class=\"glyphicon glyphicon-question-sign\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"... ...\"></span>";
                    if(p2 == "Dataset")
                        document.getElementById("header").innerHTML =  p1.toLowerCase() + " × Variable" + " | " + p3.toLowerCase() + " <img src=\"/assets/images/Legend.jpg\" height=\"20\" width=\"190\"/><span class=\"glyphicon glyphicon-question-sign\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"... ...\"></span>";
                """),format.raw/*189.17*/("""}"""),format.raw/*189.18*/("""
                """),format.raw/*190.17*/("""else """),format.raw/*190.22*/("""{"""),format.raw/*190.23*/("""
                    """),format.raw/*191.21*/("""document.getElementById("header").innerHTML = "Network of " + p1.toLowerCase() + " and " + p2.toLowerCase() + " based on " + p3.toLowerCase() + " usage <img src=\"/assets/images/Legend.jpg\" height=\"20\" width=\"190\"/><span class=\"glyphicon glyphicon-question-sign\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"... ...\"></span>";
                """),format.raw/*192.17*/("""}"""),format.raw/*192.18*/("""

                """),format.raw/*194.17*/("""var parameters = """),format.raw/*194.34*/("""{"""),format.raw/*194.35*/("""
                    """),format.raw/*195.21*/("""param1:p1,
                    param2:p2,
                    param3:p3,
                    choice:choice,
                    fChoice:filteredChoice,
                    startTime:fStartTime,
                    endTime:fEndTime
                """),format.raw/*202.17*/("""}"""),format.raw/*202.18*/("""
                """),format.raw/*203.17*/("""console.log(parameters);
                $.ajax("""),format.raw/*204.24*/("""{"""),format.raw/*204.25*/("""
                    """),format.raw/*205.21*/("""url: "/getSpecifiedKnowledgeGraph",
                    type: "POST",
                    contentType: "application/json",
                    data: JSON.stringify(parameters),
                    dataType: "text"
                """),format.raw/*210.17*/("""}"""),format.raw/*210.18*/(""").done(function(data1) """),format.raw/*210.41*/("""{"""),format.raw/*210.42*/("""
                    """),format.raw/*211.21*/("""console.log("success");
                    jsonString = data1;
                    if(p1 == "Dataset" || p2 == "Dataset") """),format.raw/*213.60*/("""{"""),format.raw/*213.61*/("""
                        """),format.raw/*214.25*/("""$("#setShownName").show();
                    """),format.raw/*215.21*/("""}"""),format.raw/*215.22*/("""else """),format.raw/*215.27*/("""{"""),format.raw/*215.28*/("""
                        """),format.raw/*216.25*/("""$("#setShownName").hide();
                    """),format.raw/*217.21*/("""}"""),format.raw/*217.22*/("""
                    """),format.raw/*218.21*/("""draw();
                """),format.raw/*219.17*/("""}"""),format.raw/*219.18*/(""").fail(function(xhr, textStatus, errorThrown) """),format.raw/*219.64*/("""{"""),format.raw/*219.65*/("""
                    """),format.raw/*220.21*/("""console.log("error!");
                    console.log(xhr);
                    console.log(textStatus);
                    console.log(errorThrown);
                """),format.raw/*224.17*/("""}"""),format.raw/*224.18*/(""")

            """),format.raw/*226.13*/("""}"""),format.raw/*226.14*/("""


            """),format.raw/*229.13*/("""function showBasicConfig() """),format.raw/*229.40*/("""{"""),format.raw/*229.41*/("""
                """),format.raw/*230.17*/("""if (visBasicConfig == 0) """),format.raw/*230.42*/("""{"""),format.raw/*230.43*/("""
                    """),format.raw/*231.21*/("""$("#basicConf").hide();
                    visBasicConfig =1;
                """),format.raw/*233.17*/("""}"""),format.raw/*233.18*/("""else """),format.raw/*233.23*/("""{"""),format.raw/*233.24*/("""
                    """),format.raw/*234.21*/("""$("#basicConf").show();
                    visBasicConfig =0;
                """),format.raw/*236.17*/("""}"""),format.raw/*236.18*/("""
            """),format.raw/*237.13*/("""}"""),format.raw/*237.14*/("""

            """),format.raw/*239.13*/("""function showAdvancedConfig() """),format.raw/*239.43*/("""{"""),format.raw/*239.44*/("""
                """),format.raw/*240.17*/("""if (visAdvancedConfig == 0) """),format.raw/*240.45*/("""{"""),format.raw/*240.46*/("""
                    """),format.raw/*241.21*/("""$("#config").hide();
                    visAdvancedConfig =1;
                """),format.raw/*243.17*/("""}"""),format.raw/*243.18*/("""else """),format.raw/*243.23*/("""{"""),format.raw/*243.24*/("""
                    """),format.raw/*244.21*/("""$("#config").show();
                    visAdvancedConfig =0;
                """),format.raw/*246.17*/("""}"""),format.raw/*246.18*/("""
            """),format.raw/*247.13*/("""}"""),format.raw/*247.14*/("""

            """),format.raw/*249.13*/("""function setGraphLevel() """),format.raw/*249.38*/("""{"""),format.raw/*249.39*/("""
                """),format.raw/*250.17*/("""degrees = $("#graphLevel").val();
                //alert(degrees);
            """),format.raw/*252.13*/("""}"""),format.raw/*252.14*/("""

            """),format.raw/*254.13*/("""function draw() """),format.raw/*254.29*/("""{"""),format.raw/*254.30*/("""
                """),format.raw/*255.17*/(""""use strict";
                console.log("draw");
                // create people.
                // value corresponds with the age of the person

                var test = """),_display_(/*260.29*/Html(relation)),format.raw/*260.43*/(""";
                var nodes = test.nodes;

                var edges = test.links;


                nodesDataset = new vis.DataSet(nodes);
                edgesDataset = new vis.DataSet(edges);

                // Instantiate our network object.
                var container = document.getElementById('mynetwork');
                var data = """),format.raw/*271.28*/("""{"""),format.raw/*271.29*/("""
                    """),format.raw/*272.21*/("""nodes: nodesDataset,
                    edges: edgesDataset
                """),format.raw/*274.17*/("""}"""),format.raw/*274.18*/(""";
                var options = """),format.raw/*275.31*/("""{"""),format.raw/*275.32*/("""
                    """),format.raw/*276.21*/("""nodes: """),format.raw/*276.28*/("""{"""),format.raw/*276.29*/("""
                        """),format.raw/*277.25*/("""color: """),format.raw/*277.32*/("""{"""),format.raw/*277.33*/("""
                            """),format.raw/*278.29*/("""highlight: """),format.raw/*278.40*/("""{"""),format.raw/*278.41*/("""
                                """),format.raw/*279.33*/("""border: "rgba(255,0,255,0.3)",
                                background: "rgba(255,0,255,0.3)"
                            """),format.raw/*281.29*/("""}"""),format.raw/*281.30*/("""
                        """),format.raw/*282.25*/("""}"""),format.raw/*282.26*/(""",

                        font: """),format.raw/*284.31*/("""{"""),format.raw/*284.32*/("""
                            """),format.raw/*285.29*/("""color: "rgba(52,52,52,1)",
                            size: 12
                        """),format.raw/*287.25*/("""}"""),format.raw/*287.26*/(""",
                        shape: "circle"
                    """),format.raw/*289.21*/("""}"""),format.raw/*289.22*/(""",
                    edges: """),format.raw/*290.28*/("""{"""),format.raw/*290.29*/("""
                        """),format.raw/*291.25*/("""color: 'rgba(120,120,120,1)',
                        arrows: """),format.raw/*292.33*/("""{"""),format.raw/*292.34*/("""

                            """),format.raw/*294.29*/("""to: """),format.raw/*294.33*/("""{"""),format.raw/*294.34*/("""
                                """),format.raw/*295.33*/("""enabled: false,
                                scaleFactor: 0.4
                            """),format.raw/*297.29*/("""}"""),format.raw/*297.30*/("""
                        """),format.raw/*298.25*/("""}"""),format.raw/*298.26*/(""",

                        smooth: """),format.raw/*300.33*/("""{"""),format.raw/*300.34*/("""
                            """),format.raw/*301.29*/("""type: "continuous",
                            forceDirection: "vertical"
                        """),format.raw/*303.25*/("""}"""),format.raw/*303.26*/("""
                    """),format.raw/*304.21*/("""}"""),format.raw/*304.22*/(""",
                    interaction: """),format.raw/*305.34*/("""{"""),format.raw/*305.35*/("""
                        """),format.raw/*306.25*/("""multiselect: true
                    """),format.raw/*307.21*/("""}"""),format.raw/*307.22*/(""",
                    groups: """),format.raw/*308.29*/("""{"""),format.raw/*308.30*/("""
                        """),format.raw/*309.25*/("""dataset: """),format.raw/*309.34*/("""{"""),format.raw/*309.35*/("""
                            """),format.raw/*310.29*/("""color:"rgba(0,0,255,0.7)"
                        """),format.raw/*311.25*/("""}"""),format.raw/*311.26*/(""",
                        user: """),format.raw/*312.31*/("""{"""),format.raw/*312.32*/("""
                            """),format.raw/*313.29*/("""color:"rgba(255,0,0,0.7)"
                        """),format.raw/*314.25*/("""}"""),format.raw/*314.26*/(""",
                        service: """),format.raw/*315.34*/("""{"""),format.raw/*315.35*/("""
                            """),format.raw/*316.29*/("""color:"rgba(0,255,0,0.7)"
                        """),format.raw/*317.25*/("""}"""),format.raw/*317.26*/("""
                    """),format.raw/*318.21*/("""}"""),format.raw/*318.22*/(""",

                    physics: """),format.raw/*320.30*/("""{"""),format.raw/*320.31*/("""
                        """),format.raw/*321.25*/("""hierarchicalRepulsion: """),format.raw/*321.48*/("""{"""),format.raw/*321.49*/("""
                            """),format.raw/*322.29*/("""springConstant: 0.01,
                            centralGravity: 1.75,

                            nodeDistance: 140,


                        """),format.raw/*328.25*/("""}"""),format.raw/*328.26*/(""",
                        maxVelocity: 10,
                        minVelocity: 0.75,
                        solver: "hierarchicalRepulsion",
                        stabilization: """),format.raw/*332.40*/("""{"""),format.raw/*332.41*/("""
                            """),format.raw/*333.29*/("""enabled:true,
                            iterations:200,
                            updateInterval:1
                        """),format.raw/*336.25*/("""}"""),format.raw/*336.26*/("""
                    """),format.raw/*337.21*/("""}"""),format.raw/*337.22*/(""",
                    configure: """),format.raw/*338.32*/("""{"""),format.raw/*338.33*/("""
                        """),format.raw/*339.25*/("""filter:function (option, path) """),format.raw/*339.56*/("""{"""),format.raw/*339.57*/("""
                            """),format.raw/*340.29*/("""if (path.indexOf('physics') !== -1 || option === 'physics') """),format.raw/*340.89*/("""{"""),format.raw/*340.90*/("""
                                """),format.raw/*341.33*/("""return true;
                            """),format.raw/*342.29*/("""}"""),format.raw/*342.30*/("""
                            """),format.raw/*343.29*/("""if (path.indexOf('smooth') !== -1 || option === 'smooth') """),format.raw/*343.87*/("""{"""),format.raw/*343.88*/("""
                                """),format.raw/*344.33*/("""return true;
                            """),format.raw/*345.29*/("""}"""),format.raw/*345.30*/("""
                            """),format.raw/*346.29*/("""if (path.indexOf('layout') !== -1 || option === 'layout') """),format.raw/*346.87*/("""{"""),format.raw/*346.88*/("""
                                """),format.raw/*347.33*/("""return true;
                            """),format.raw/*348.29*/("""}"""),format.raw/*348.30*/("""
                            """),format.raw/*349.29*/("""return false;
                        """),format.raw/*350.25*/("""}"""),format.raw/*350.26*/(""",
                        container: document.getElementById('config')
                    """),format.raw/*352.21*/("""}"""),format.raw/*352.22*/("""
                """),format.raw/*353.17*/("""}"""),format.raw/*353.18*/(""";



                $("#config").html("");

                network = new vis.Network(container, data, options);

                network.on("stabilizationProgress", function(params) """),format.raw/*361.70*/("""{"""),format.raw/*361.71*/("""
                    """),format.raw/*362.21*/("""var maxWidth = 796;
                    var minWidth = 20;
                    var widthFactor = params.iterations/params.total;
                    var width = Math.max(minWidth,maxWidth * widthFactor);

                    document.getElementById('bar').style.width = width + 'px';
                    document.getElementById('text').innerHTML = Math.round(widthFactor*100) + '%';
                """),format.raw/*369.17*/("""}"""),format.raw/*369.18*/(""");
                network.once("stabilizationIterationsDone", function() """),format.raw/*370.72*/("""{"""),format.raw/*370.73*/("""
                    """),format.raw/*371.21*/("""document.getElementById('text').innerHTML = '100%';
                    document.getElementById('bar').style.width = '796px';
                    document.getElementById('loadingBar').style.opacity = 0;
                    // really clean the dom element
                    setTimeout(function () """),format.raw/*375.44*/("""{"""),format.raw/*375.45*/("""document.getElementById('loadingBar').style.display = 'none';"""),format.raw/*375.106*/("""}"""),format.raw/*375.107*/(""", 800);
                """),format.raw/*376.17*/("""}"""),format.raw/*376.18*/(""");

                allNodes = nodesDataset.get("""),format.raw/*378.45*/("""{"""),format.raw/*378.46*/("""returnType:"Object""""),format.raw/*378.65*/("""}"""),format.raw/*378.66*/(""");
                allEdges = edgesDataset.get("""),format.raw/*379.45*/("""{"""),format.raw/*379.46*/("""returnType:"Object""""),format.raw/*379.65*/("""}"""),format.raw/*379.66*/(""");
                network.on('selectNode', neighbourhoodHighlight);
                network.on('select', recover);
                network.on('doubleClick', selectDoubleClickedNode);
                network.on('selectEdge', selectTheEdge);

            """),format.raw/*385.13*/("""}"""),format.raw/*385.14*/("""

            """),format.raw/*387.13*/("""function findShortestPath() """),format.raw/*387.41*/("""{"""),format.raw/*387.42*/("""
                """),format.raw/*388.17*/("""var startId = $("#startPoint").val();
                var endId = $("#endPoint").val();

                var ids = """),format.raw/*391.27*/("""{"""),format.raw/*391.28*/("""
                    """),format.raw/*392.21*/("""startId : startId,
                    endId : endId
                """),format.raw/*394.17*/("""}"""),format.raw/*394.18*/("""

                """),format.raw/*396.17*/("""$.ajax("""),format.raw/*396.24*/("""{"""),format.raw/*396.25*/("""
                    """),format.raw/*397.21*/("""url: "/getShortestPath",
                    type: "POST",
                    contentType: "application/json",
                    data: JSON.stringify(ids),
                    dataType: "text"
                """),format.raw/*402.17*/("""}"""),format.raw/*402.18*/(""").done(function(data1) """),format.raw/*402.41*/("""{"""),format.raw/*402.42*/("""
                    """),format.raw/*403.21*/("""console.log("success");
                    jsonString = data1;
                    draw();
                """),format.raw/*406.17*/("""}"""),format.raw/*406.18*/(""").fail(function(xhr, textStatus, errorThrown) """),format.raw/*406.64*/("""{"""),format.raw/*406.65*/("""
                    """),format.raw/*407.21*/("""console.log("error!");
                    console.log(xhr);
                    console.log(textStatus);
                    console.log(errorThrown);
                """),format.raw/*411.17*/("""}"""),format.raw/*411.18*/(""")
            """),format.raw/*412.13*/("""}"""),format.raw/*412.14*/("""

            """),format.raw/*414.13*/("""function findKthShortestPath() """),format.raw/*414.44*/("""{"""),format.raw/*414.45*/("""
                """),format.raw/*415.17*/("""var startId = $("#startPoint").val();
                var endId = $("#endPoint").val();
                var kth = $("#kth").val();
                var k = parseInt(kth) - 1;
                var ids = """),format.raw/*419.27*/("""{"""),format.raw/*419.28*/("""
                    """),format.raw/*420.21*/("""startId : startId,
                    endId : endId,
                    kth : kth
                """),format.raw/*423.17*/("""}"""),format.raw/*423.18*/("""

                """),format.raw/*425.17*/("""$.ajax("""),format.raw/*425.24*/("""{"""),format.raw/*425.25*/("""
                    """),format.raw/*426.21*/("""url: "/getKthShortestPath",
                    type: "POST",
                    contentType: "application/json",
                    data: JSON.stringify(ids),
                    dataType: "text"
                """),format.raw/*431.17*/("""}"""),format.raw/*431.18*/(""").done(function(data1) """),format.raw/*431.41*/("""{"""),format.raw/*431.42*/("""
                    """),format.raw/*432.21*/("""console.log("success");
                    var jsonTmp = JSON.parse(data1);
                    jsonString = JSON.stringify(jsonTmp[k]);
                    console.log(JSON.stringify(jsonTmp[k]));
                    draw();
                """),format.raw/*437.17*/("""}"""),format.raw/*437.18*/(""").fail(function(xhr, textStatus, errorThrown) """),format.raw/*437.64*/("""{"""),format.raw/*437.65*/("""
                    """),format.raw/*438.21*/("""console.log("error!");
                    console.log(xhr);
                    console.log(textStatus);
                    console.log(errorThrown);
                """),format.raw/*442.17*/("""}"""),format.raw/*442.18*/(""")
            """),format.raw/*443.13*/("""}"""),format.raw/*443.14*/("""

            """),format.raw/*445.13*/("""function selectDoubleClickedNode(params) """),format.raw/*445.54*/("""{"""),format.raw/*445.55*/("""
                """),format.raw/*446.17*/("""$("#edgeDataPanel").hide();
                if (params.nodes.length > 0) """),format.raw/*447.46*/("""{"""),format.raw/*447.47*/("""

                    """),format.raw/*449.21*/("""var node1 = params.nodes[0];
                    var group = allNodes[node1].group;
                    var startTime = "";
                    var endTime = "";

                    var id = null;

                    switch(group) """),format.raw/*456.35*/("""{"""),format.raw/*456.36*/("""
                        case "service":
                            id = allNodes[node1].serviceId;
                            break;
                        case "dataset":
                            id = allNodes[node1].datasetId;
                            break;
                        case "user":
                            id = allNodes[node1].userId;
                            break;
                        case "variable":
                            id = allNodes[node1].variableId;
                            break;
                        default:
                            break;
                    """),format.raw/*471.21*/("""}"""),format.raw/*471.22*/("""

                    """),format.raw/*473.21*/("""var parameters = """),format.raw/*473.38*/("""{"""),format.raw/*473.39*/("""
                        """),format.raw/*474.25*/("""param1:p1,
                        param2:p2,
                        id:id,
                        groupName:group,
                        startTime:startTime,
                        endTime:endTime
                    """),format.raw/*480.21*/("""}"""),format.raw/*480.22*/("""
                    """),format.raw/*481.21*/("""$.ajax("""),format.raw/*481.28*/("""{"""),format.raw/*481.29*/("""
                        """),format.raw/*482.25*/("""url: "/getDoubleClickedNodeKnowledgeGraph",
                        type: "POST",
                        contentType: "application/json",
                        data: JSON.stringify(parameters),
                        dataType: "text"
                    """),format.raw/*487.21*/("""}"""),format.raw/*487.22*/(""").done(function(data1) """),format.raw/*487.45*/("""{"""),format.raw/*487.46*/("""
                        """),format.raw/*488.25*/("""console.log("success");
                        jsonString = data1;
                        draw();
                    """),format.raw/*491.21*/("""}"""),format.raw/*491.22*/(""").fail(function(xhr, textStatus, errorThrown) """),format.raw/*491.68*/("""{"""),format.raw/*491.69*/("""
                        """),format.raw/*492.25*/("""console.log("error!");
                        console.log(xhr);
                        console.log(textStatus);
                        console.log(errorThrown);
                    """),format.raw/*496.21*/("""}"""),format.raw/*496.22*/(""")

                """),format.raw/*498.17*/("""}"""),format.raw/*498.18*/("""

            """),format.raw/*500.13*/("""}"""),format.raw/*500.14*/("""

            """),format.raw/*502.13*/("""function schedule(selectedValue)"""),format.raw/*502.45*/("""{"""),format.raw/*502.46*/("""
                """),format.raw/*503.17*/("""var parameter = selectedValue.split(" ");
                // When selecting an option, update filtered combinations accordingly
                document.getElementById("filterCombination").options.length = 0;
                document.getElementById("filterCombination").options[0] = new Option("Choose Filter","",true,false);
                document.getElementById("filterCombination").options[0].disabled = true;

                if (parameter[0] === "Dataset" || parameter[1] == "Dataset") """),format.raw/*509.78*/("""{"""),format.raw/*509.79*/("""
                    """),format.raw/*510.21*/("""$("#setWholeShownName").show();
                    document.getElementById("filterCombination").options[document.getElementById("filterCombination").options.length] =
                            new Option("Dataset","dataset");
                """),format.raw/*513.17*/("""}"""),format.raw/*513.18*/(""" """),format.raw/*513.19*/("""else """),format.raw/*513.24*/("""{"""),format.raw/*513.25*/("""
                    """),format.raw/*514.21*/("""$ ("#setWholeShownName").hide();
                """),format.raw/*515.17*/("""}"""),format.raw/*515.18*/("""
                """),format.raw/*516.17*/("""if (parameter[0] === "User" || parameter[1] == "User") """),format.raw/*516.72*/("""{"""),format.raw/*516.73*/("""
                    """),format.raw/*517.21*/("""document.getElementById("filterCombination").options[document.getElementById("filterCombination").options.length] =
                            new Option("User","user");
                """),format.raw/*519.17*/("""}"""),format.raw/*519.18*/("""
                """),format.raw/*520.17*/("""if (parameter[0] === "Service" || parameter[1] == "Service") """),format.raw/*520.78*/("""{"""),format.raw/*520.79*/("""
                    """),format.raw/*521.21*/("""document.getElementById("filterCombination").options[document.getElementById("filterCombination").options.length] =
                            new Option("Service","service");
                """),format.raw/*523.17*/("""}"""),format.raw/*523.18*/("""
            """),format.raw/*524.13*/("""}"""),format.raw/*524.14*/("""

            """),format.raw/*526.13*/("""function selectTheEdge(params) """),format.raw/*526.44*/("""{"""),format.raw/*526.45*/("""
                """),format.raw/*527.17*/("""console.log("Edge!!!");
                // reset all nodes and edges
                for (var nodeId in allNodes) """),format.raw/*529.46*/("""{"""),format.raw/*529.47*/("""
                    """),format.raw/*530.21*/("""allNodes[nodeId].color = 'rgba(192,192,192,0.3)';
                    if (allNodes[nodeId].hiddenLabel !== undefined) """),format.raw/*531.69*/("""{"""),format.raw/*531.70*/("""
                        """),format.raw/*532.25*/("""allNodes[nodeId].label = allNodes[nodeId].hiddenLabel;
                        allNodes[nodeId].hiddenLabel = undefined;
                    """),format.raw/*534.21*/("""}"""),format.raw/*534.22*/("""
                """),format.raw/*535.17*/("""}"""),format.raw/*535.18*/("""

                """),format.raw/*537.17*/("""for (var edgeId in allEdges) """),format.raw/*537.46*/("""{"""),format.raw/*537.47*/("""
                    """),format.raw/*538.21*/("""if (params.edges.length > 0) """),format.raw/*538.50*/("""{"""),format.raw/*538.51*/("""
                        """),format.raw/*539.25*/("""allEdges[edgeId].color = 'rgba(192,192,192,0.3)';
                    """),format.raw/*540.21*/("""}"""),format.raw/*540.22*/("""
                    """),format.raw/*541.21*/("""else"""),format.raw/*541.25*/("""{"""),format.raw/*541.26*/("""
                        """),format.raw/*542.25*/("""allEdges[edgeId].color = undefined;
                    """),format.raw/*543.21*/("""}"""),format.raw/*543.22*/("""
                    """),format.raw/*544.21*/("""allEdges[edgeId].label = allEdges[edgeId].hiddenLabel;
                    allEdges[edgeId].hiddenLabel = undefined;
                """),format.raw/*546.17*/("""}"""),format.raw/*546.18*/("""
                """),format.raw/*547.17*/("""highlightActive = false;
                var updateArray = [];
                for (nodeId in allNodes) """),format.raw/*549.42*/("""{"""),format.raw/*549.43*/("""
                    """),format.raw/*550.21*/("""if (allNodes.hasOwnProperty(nodeId)) """),format.raw/*550.58*/("""{"""),format.raw/*550.59*/("""
                        """),format.raw/*551.25*/("""updateArray.push(allNodes[nodeId]);
                    """),format.raw/*552.21*/("""}"""),format.raw/*552.22*/("""
                """),format.raw/*553.17*/("""}"""),format.raw/*553.18*/("""

                """),format.raw/*555.17*/("""nodesDataset.update(updateArray);


                updateArray = [];
                for (edgeId in allEdges) """),format.raw/*559.42*/("""{"""),format.raw/*559.43*/("""
                    """),format.raw/*560.21*/("""if (allEdges.hasOwnProperty(edgeId)) """),format.raw/*560.58*/("""{"""),format.raw/*560.59*/("""
                        """),format.raw/*561.25*/("""updateArray.push(allEdges[edgeId]);
                    """),format.raw/*562.21*/("""}"""),format.raw/*562.22*/("""
                """),format.raw/*563.17*/("""}"""),format.raw/*563.18*/("""

                """),format.raw/*565.17*/("""edgesDataset.update(updateArray);

                // select edges
                $("#panel").hide();
                //$("#edgeDataPanel").show();
                if (params.edges.length > 0) """),format.raw/*570.46*/("""{"""),format.raw/*570.47*/("""
                    """),format.raw/*571.21*/("""var selectedEdge = allEdges[params.edges[0]];
                    selectedEdge.color = 'rgba(255,0,0,1)';
                    var node1 = allNodes[selectedEdge.source];
                    var node2 = allNodes[selectedEdge.target];
                    var userId1 = null, serviceId1 = null, datasetId1 = null, userId2 = null, serviceId2 = null, datasetId2 = null;
                    if(node1.group == "user")	    userId1 = node1.userId, node1.color = 'rgba(255,0,0,0.7)'; //changed
                    if(node1.group == "dataset")	datasetId1 = node1.datasetId, node1.color = 'rgba(0,0,255,0.7)';
                    if(node1.group == "service")	serviceId1 = node1.serviceId, node1.color = 'rgba(0,255,0,0.7)';
                    if(node2.group == "user")	    userId2 = node2.userId, node2.color = 'rgba(255,0,0,0.7)';
                    if(node2.group == "dataset")	datasetId2 = node2.datasetId, node2.color = 'rgba(0,0,255,0.7)';
                    if(node2.group == "service")	serviceId2 = node2.serviceId, node2.color = 'rgba(0,255,0,0.7)';

                    if (p3 == "Service") """),format.raw/*583.42*/("""{"""),format.raw/*583.43*/(""" """),format.raw/*583.44*/("""//prevent errors in parsing JSON
                        var p3number = 1;
                    """),format.raw/*585.21*/("""}"""),format.raw/*585.22*/("""else if(p3 == "Dataset") """),format.raw/*585.47*/("""{"""),format.raw/*585.48*/("""
                        """),format.raw/*586.25*/("""var p3number = 2;
                    """),format.raw/*587.21*/("""}"""),format.raw/*587.22*/("""else """),format.raw/*587.27*/("""{"""),format.raw/*587.28*/("""
                        """),format.raw/*588.25*/("""var p3number = 3;
                    """),format.raw/*589.21*/("""}"""),format.raw/*589.22*/("""


                    """),format.raw/*592.21*/("""var parameters = """),format.raw/*592.38*/("""{"""),format.raw/*592.39*/("""
                        """),format.raw/*593.25*/("""userId1: userId1,
                        datasetId1: datasetId1,
                        serviceId1: serviceId1,
                        userId2: userId2,
                        datasetId2: datasetId2,
                        serviceId2: serviceId2,
                        p3number: p3number
                    """),format.raw/*600.21*/("""}"""),format.raw/*600.22*/("""

                    """),format.raw/*602.21*/("""$.ajax("""),format.raw/*602.28*/("""{"""),format.raw/*602.29*/("""
                        """),format.raw/*603.25*/("""url: "/getEdgeData",
                        type: "POST",
                        contentType: "application/json",
                        data: JSON.stringify(parameters),
                        dataType: "text"
                    """),format.raw/*608.21*/("""}"""),format.raw/*608.22*/(""").done(function(data) """),format.raw/*608.44*/("""{"""),format.raw/*608.45*/("""
                        """),format.raw/*609.25*/("""console.log("success");
                        edgeDatas = JSON.parse(data);
                        console.log(edgeDatas.toString());
                        $('#edgeDataPanel').html("");
                        var tr = null;
                        console.log(edgeDatas);
                        if (data.length == 2) """),format.raw/*615.47*/("""{"""),format.raw/*615.48*/("""
                            """),format.raw/*616.29*/("""$('#edgeDataPanel').append("<table class=\"table table-striped\"><thead>" +
                                    "<tr><th>Not</th><th>Found</th></tr></thead><tbody>");
                        """),format.raw/*618.25*/("""}"""),format.raw/*618.26*/("""else if(userId1 != null && userId2 != null && p3number == 2) """),format.raw/*618.87*/("""{"""),format.raw/*618.88*/("""

                            """),format.raw/*620.29*/("""tr = "<table class=\"table table-striped\"><thead>" +
                                    "<tr><th>Dataset Name</th><th>Dataset Start Time</th></tr></thead><tbody>";
                            for(var i=0; i<Object.keys(edgeDatas).length; i++) """),format.raw/*622.80*/("""{"""),format.raw/*622.81*/("""
                                """),format.raw/*623.33*/("""tr += "<tr><td>"+edgeDatas[i].name+"</td>";
                                tr += "<td>"+edgeDatas[i].startTime+"</td>";
                                tr += "<tr><td>"+node1.group.toUpperCase()+": "+node1.title+"</td><td>"+node2.group.toUpperCase()+": "+node2.title+"</td></tr>";
                            """),format.raw/*626.29*/("""}"""),format.raw/*626.30*/("""
                            """),format.raw/*627.29*/("""tr += "</tbody></table>";
                        """),format.raw/*628.25*/("""}"""),format.raw/*628.26*/("""else if(userId1 != null && userId2 != null && p3number == 1) """),format.raw/*628.87*/("""{"""),format.raw/*628.88*/("""
                            """),format.raw/*629.29*/("""tr = "<table class=\"table table-striped\"><thead>" +
                                    "<tr><th>Service Name</th><th>Execution Time</th><th>Details</th></tr></thead><tbody>";
                            for(var i=0; i<Object.keys(edgeDatas).length; i++) """),format.raw/*631.80*/("""{"""),format.raw/*631.81*/("""
                                """),format.raw/*632.33*/("""tr += "<tr><td>"+edgeDatas[i].climateService.name+"</td>";
                                tr += "<td>"+edgeDatas[i].executionStartTime+"</td>";

                                tr += "<td>";
                                tr += "<form action=\"/getConfigurationByConfId\" method=\"GET\">";
                                tr += "<input name=\"logId\" class=\"hidden\" type=\"hidden\"";
                                tr += "value=\"" + edgeDatas[i].id + "\">";
                                tr += "<input type=\"submit\"  value=\"see details\"></form></td></tr>";
                                tr += "<tr><td>"+node1.group.toUpperCase()+": "+node1.title+"</td><td>"+node2.group.toUpperCase()+": "+node2.title+"</td></tr>";
                            """),format.raw/*641.29*/("""}"""),format.raw/*641.30*/("""
                            """),format.raw/*642.29*/("""tr += "</tbody></table>";
                        """),format.raw/*643.25*/("""}"""),format.raw/*643.26*/("""else if(datasetId1 != null && datasetId2 != null && p3number == 3) """),format.raw/*643.93*/("""{"""),format.raw/*643.94*/("""
                            """),format.raw/*644.29*/("""tr = "<table class=\"table table-striped\"><thead>" +
                                    "<tr><th>User Name</th><th>First Name</th><th>Last Name</th></tr></thead><tbody>";
                            for(var i=0; i<Object.keys(edgeDatas).length; i++) """),format.raw/*646.80*/("""{"""),format.raw/*646.81*/("""
                                """),format.raw/*647.33*/("""tr += "<tr><td>"+edgeDatas[i].userName+"</td>";
                                tr += "<td>"+edgeDatas[i].firstName+"</td>";
                                tr += "<td>"+edgeDatas[i].lastName+"</td></tr>";
                                tr += "<tr><td>"+node1.group.toUpperCase()+": "+node1.title+"</td><td>"+node2.group.toUpperCase()+": "+node2.title+"</td></tr>";
                            """),format.raw/*651.29*/("""}"""),format.raw/*651.30*/("""
                            """),format.raw/*652.29*/("""tr += "</tbody></table>";
                        """),format.raw/*653.25*/("""}"""),format.raw/*653.26*/("""else if(datasetId1 != null && datasetId2 != null && p3number == 1) """),format.raw/*653.93*/("""{"""),format.raw/*653.94*/("""
                            """),format.raw/*654.29*/("""tr = "<table class=\"table table-striped\"><thead>" +
                                    "<tr><th>Service Name</th><th>Execution Time</th><th>Details</th></tr></thead><tbody>";
                            for(var i=0; i<Object.keys(edgeDatas).length; i++) """),format.raw/*656.80*/("""{"""),format.raw/*656.81*/("""
                                """),format.raw/*657.33*/("""tr += "<tr><td>"+edgeDatas[i].climateService.name+"</td>";
                                tr += "<td>"+edgeDatas[i].executionStartTime+"</td>";

                                tr += "<td>";
                                tr += "<form action=\"/getConfigurationByConfId\" method=\"GET\">";
                                tr += "<input name=\"logId\" class=\"hidden\" type=\"hidden\"";
                                tr += "value=\"" + edgeDatas[i].id + "\">";
                                tr += "<input type=\"submit\"  value=\"see details\"></form></td></tr>";
                                tr += "<tr><td>"+node1.group.toUpperCase()+": "+node1.title+"</td><td>"+node2.group.toUpperCase()+": "+node2.title+"</td></tr>";
                            """),format.raw/*666.29*/("""}"""),format.raw/*666.30*/("""
                            """),format.raw/*667.29*/("""tr += "</tbody></table>";
                        """),format.raw/*668.25*/("""}"""),format.raw/*668.26*/("""else if(serviceId1 != null && serviceId2 != null && p3number == 3) """),format.raw/*668.93*/("""{"""),format.raw/*668.94*/("""
                            """),format.raw/*669.29*/("""tr = "<table class=\"table table-striped\"><thead>" +
                                    "<tr><th>User Name</th><th>First Name</th><th>Last Name</th></tr></thead><tbody>";
                            for(var i=0; i<Object.keys(edgeDatas).length; i++) """),format.raw/*671.80*/("""{"""),format.raw/*671.81*/("""
                                """),format.raw/*672.33*/("""tr += "<tr><td>"+edgeDatas[i].userName+"</td>";
                                tr += "<td>"+edgeDatas[i].firstName+"</td>";
                                tr += "<td>"+edgeDatas[i].lastName+"</td></tr>";
                                tr += "<tr><td>"+node1.group.toUpperCase()+": "+node1.title+"</td><td>"+node2.group.toUpperCase()+": "+node2.title+"</td></tr>";
                            """),format.raw/*676.29*/("""}"""),format.raw/*676.30*/("""
                            """),format.raw/*677.29*/("""tr += "</tbody></table>";
                        """),format.raw/*678.25*/("""}"""),format.raw/*678.26*/("""else if(serviceId1 != null && serviceId2 != null && p3number == 2) """),format.raw/*678.93*/("""{"""),format.raw/*678.94*/("""
                            """),format.raw/*679.29*/("""tr = "<table class=\"table table-striped\"><thead>" +
                                    "<tr><th>Dataset Name</th><th>Execution Time</th><th>Details</th></tr></thead><tbody>";
                            for(var i=0; i<Object.keys(edgeDatas).length; i++) """),format.raw/*681.80*/("""{"""),format.raw/*681.81*/("""
                                """),format.raw/*682.33*/("""tr += "<tr><td>"+edgeDatas[i].name+"</td>";
                                tr += "<td>"+edgeDatas[i].startTime+"</td>";
                                tr += "<tr><td>"+node1.group.toUpperCase()+": "+node1.title+"</td><td>"+node2.group.toUpperCase()+": "+node2.title+"</td></tr>";
                                /*
                        tr += "<td>";
                        tr += "<form action=\"/getConfigurationByConfId\" method=\"GET\">";
                        tr += "<input name=\"logId\" class=\"hidden\" type=\"hidden\"";
                        tr += "value=\"" + edgeDatas[i].serviceExecutionLog.id + "\">";
                        tr += "<input type=\"submit\"  value=\"see details\"></form></td></tr>";
                                */
                            """),format.raw/*692.29*/("""}"""),format.raw/*692.30*/("""
                            """),format.raw/*693.29*/("""tr += "</tbody></table>";
                        """),format.raw/*694.25*/("""}"""),format.raw/*694.26*/("""else if(p3 == "Service") """),format.raw/*694.51*/("""{"""),format.raw/*694.52*/("""//change
                            tr = "<table class=\"table table-striped\"><thead>" +
                                    "<tr><th>Service Name</th><th>Execution Time</th><th>Details</th></tr></thead><tbody>";
                            for(var i=0; i<Object.keys(edgeDatas).length; i++) """),format.raw/*697.80*/("""{"""),format.raw/*697.81*/("""
                                """),format.raw/*698.33*/("""tr += "<tr><td>"+edgeDatas[i].climateService.name+"</td>";
                                tr += "<td>"+edgeDatas[i].executionStartTime+"</td>";

                                tr += "<td>";
                                tr += "<form action=\"/getServiceExecutionLogUrlById\" method=\"GET\">";
                                tr += "<input name=\"logId\" class=\"hidden\" type=\"hidden\"";
                                tr += "value=\"" + edgeDatas[i].id + "\">";
                                tr += "<input type=\"submit\"  value=\"see details\"></form></td></tr>";
                                tr += "<tr><td>"+node1.group.toUpperCase()+": "+node1.title+"</td><td>"+node2.group.toUpperCase()+": "+node2.title+"</td></tr>";
                            """),format.raw/*707.29*/("""}"""),format.raw/*707.30*/("""
                            """),format.raw/*708.29*/("""tr += "</tbody></table>";
                        """),format.raw/*709.25*/("""}"""),format.raw/*709.26*/("""else if(p3 == "Dataset") """),format.raw/*709.51*/("""{"""),format.raw/*709.52*/("""
                            """),format.raw/*710.29*/("""tr = "<table class=\"table table-striped\"><thead>" +
                                    "<tr><th>Dataset Name</th><th>Execution Time</th></tr></thead><tbody>";
                            for(var i=0; i<Object.keys(edgeDatas).length; i++) """),format.raw/*712.80*/("""{"""),format.raw/*712.81*/("""
                                """),format.raw/*713.33*/("""tr += "<tr><td>"+edgeDatas[i].dataset.name+"</td>";
                                tr += "<td>"+edgeDatas[i].serviceExecutionLog.executionStartTime+"</td>";
                                tr += "<tr><td>"+node1.group.toUpperCase()+": "+node1.title+"</td><td>"+node2.group.toUpperCase()+": "+node2.title+"</td></tr>";

                                /* tr += "<td>";
                                tr += "<form action=\"/getConfigurationByConfId\" method=\"GET\">";
                                tr += "<input name=\"logId\" class=\"hidden\" type=\"hidden\"";
                                tr += "value=\"" + edgeDatas[i].serviceExecutionLog.id + "\">";
                                tr += "<input type=\"submit\"  value=\"see details\"></form></td></tr>"; */
                            """),format.raw/*722.29*/("""}"""),format.raw/*722.30*/("""
                            """),format.raw/*723.29*/("""tr += "</tbody></table>";
                        """),format.raw/*724.25*/("""}"""),format.raw/*724.26*/("""else if(p3 == "User") """),format.raw/*724.48*/("""{"""),format.raw/*724.49*/("""
                            """),format.raw/*725.29*/("""tr = "<table class=\"table table-striped\"><thead>" +
                                    "<tr><th>User Name</th><th>First Name</th><th>Last Name</th></tr></thead><tbody>";
                            for(var i=0; i<Object.keys(edgeDatas).length; i++) """),format.raw/*727.80*/("""{"""),format.raw/*727.81*/("""
                                """),format.raw/*728.33*/("""tr += "<tr><td>"+edgeDatas[i].userName+"</td>";
                                tr += "<td>"+edgeDatas[i].firstName+"</td>";
                                tr += "<td>"+edgeDatas[i].lastName+"</td></tr>";
                                tr += "<tr><td>"+node1.group.toUpperCase()+": "+node1.title+"</td><td>"+node2.group.toUpperCase()+": "+node2.title+"</td></tr>";
                            """),format.raw/*732.29*/("""}"""),format.raw/*732.30*/("""
                            """),format.raw/*733.29*/("""tr += "</tbody></table>";
                            /****************************************
                             *****************************************
                             *****************************************/
                        """),format.raw/*737.25*/("""}"""),format.raw/*737.26*/("""

                        """),format.raw/*739.25*/("""$('#edgeDataPanel').append(tr);
                        $("#edgeDataPanel").show();

                    """),format.raw/*742.21*/("""}"""),format.raw/*742.22*/(""").fail(function(xhr, textStatus, errorThrown) """),format.raw/*742.68*/("""{"""),format.raw/*742.69*/("""
                        """),format.raw/*743.25*/("""console.log("error!");
                        console.log(xhr);
                        console.log(textStatus);
                        console.log(errorThrown);
                    """),format.raw/*747.21*/("""}"""),format.raw/*747.22*/(""")
                """),format.raw/*748.17*/("""}"""),format.raw/*748.18*/("""
            """),format.raw/*749.13*/("""}"""),format.raw/*749.14*/("""

            """),format.raw/*751.13*/("""function recover(params) """),format.raw/*751.38*/("""{"""),format.raw/*751.39*/("""
                """),format.raw/*752.17*/("""if(params.nodes.length == 0 && params.edges.length == 0) """),format.raw/*752.74*/("""{"""),format.raw/*752.75*/("""
                    """),format.raw/*753.21*/("""for (var nodeId in allNodes) """),format.raw/*753.50*/("""{"""),format.raw/*753.51*/("""
                        """),format.raw/*754.25*/("""allNodes[nodeId].color = undefined;

                        if (allNodes[nodeId].hiddenLabel !== undefined) """),format.raw/*756.73*/("""{"""),format.raw/*756.74*/("""
                            """),format.raw/*757.29*/("""allNodes[nodeId].label = allNodes[nodeId].hiddenLabel;
                            allNodes[nodeId].hiddenLabel = undefined;
                        """),format.raw/*759.25*/("""}"""),format.raw/*759.26*/("""
                    """),format.raw/*760.21*/("""}"""),format.raw/*760.22*/("""

                    """),format.raw/*762.21*/("""for (var edgeId in allEdges) """),format.raw/*762.50*/("""{"""),format.raw/*762.51*/("""
                        """),format.raw/*763.25*/("""allEdges[edgeId].color = 'rgba(120,120,120,1)';
                        allEdges[edgeId].label = allEdges[edgeId].hiddenLabel;
                        allEdges[edgeId].hiddenLabel = undefined;

                    """),format.raw/*767.21*/("""}"""),format.raw/*767.22*/("""
                    """),format.raw/*768.21*/("""highlightActive = false;
                """),format.raw/*769.17*/("""}"""),format.raw/*769.18*/("""

                """),format.raw/*771.17*/("""var updateArray = [];
                for (nodeId in allNodes) """),format.raw/*772.42*/("""{"""),format.raw/*772.43*/("""
                    """),format.raw/*773.21*/("""if (allNodes.hasOwnProperty(nodeId)) """),format.raw/*773.58*/("""{"""),format.raw/*773.59*/("""
                        """),format.raw/*774.25*/("""updateArray.push(allNodes[nodeId]);
                    """),format.raw/*775.21*/("""}"""),format.raw/*775.22*/("""
                """),format.raw/*776.17*/("""}"""),format.raw/*776.18*/("""

                """),format.raw/*778.17*/("""nodesDataset.update(updateArray);


                updateArray = [];
                for (edgeId in allEdges) """),format.raw/*782.42*/("""{"""),format.raw/*782.43*/("""
                    """),format.raw/*783.21*/("""if (allEdges.hasOwnProperty(edgeId)) """),format.raw/*783.58*/("""{"""),format.raw/*783.59*/("""
                        """),format.raw/*784.25*/("""updateArray.push(allEdges[edgeId]);
                    """),format.raw/*785.21*/("""}"""),format.raw/*785.22*/("""
                """),format.raw/*786.17*/("""}"""),format.raw/*786.18*/("""

                """),format.raw/*788.17*/("""edgesDataset.update(updateArray);
            """),format.raw/*789.13*/("""}"""),format.raw/*789.14*/("""

            """),format.raw/*791.13*/("""function neighbourhoodHighlight(params) """),format.raw/*791.53*/("""{"""),format.raw/*791.54*/("""
                """),format.raw/*792.17*/("""console.log("Node!!!");
                $("#edgeDataPanel").hide();
                // if something is selected:
                if (params.nodes.length > 0) """),format.raw/*795.46*/("""{"""),format.raw/*795.47*/("""
                    """),format.raw/*796.21*/("""highlightActive = true;
                    var i,j;
                    var selectedNode = params.nodes[0];
                    var selectedNodeGroup = allNodes[selectedNode].group;
                    var firstLevelNodeGroup = null;

                    // mark all nodes as hard to read.
                    for (var nodeId in allNodes) """),format.raw/*803.50*/("""{"""),format.raw/*803.51*/("""
                        """),format.raw/*804.25*/("""allNodes[nodeId].color = 'rgba(192,192,192,0.3)';
                        if (allNodes[nodeId].hiddenLabel == undefined) """),format.raw/*805.72*/("""{"""),format.raw/*805.73*/("""
                            """),format.raw/*806.29*/("""allNodes[nodeId].hiddenLabel = allNodes[nodeId].label;
                            allNodes[nodeId].label = undefined;
                        """),format.raw/*808.25*/("""}"""),format.raw/*808.26*/("""
                    """),format.raw/*809.21*/("""}"""),format.raw/*809.22*/("""

                    """),format.raw/*811.21*/("""for (var edgeId in allEdges) """),format.raw/*811.50*/("""{"""),format.raw/*811.51*/("""
                        """),format.raw/*812.25*/("""allEdges[edgeId].color = 'rgba(192,192,192,0.3)';
                        if (allEdges[edgeId].hiddenLabel == undefined) """),format.raw/*813.72*/("""{"""),format.raw/*813.73*/("""
                            """),format.raw/*814.29*/("""allEdges[edgeId].hiddenLabel = allEdges[edgeId].label;
                            allEdges[edgeId].label = undefined;
                        """),format.raw/*816.25*/("""}"""),format.raw/*816.26*/("""
                    """),format.raw/*817.21*/("""}"""),format.raw/*817.22*/("""

                    """),format.raw/*819.21*/("""allNodes[selectedNode].label = allNodes[selectedNode].hiddenLabel;

                    var connectedNodes = network.getConnectedNodes(selectedNode);
                    if(connectedNodes.length != 0) """),format.raw/*822.52*/("""{"""),format.raw/*822.53*/("""
                        """),format.raw/*823.25*/("""firstLevelNodeGroup = allNodes[connectedNodes[0]].group;
                    """),format.raw/*824.21*/("""}"""),format.raw/*824.22*/("""
                    """),format.raw/*825.21*/("""var allConnectedNodes = [];

                    // get the second degree nodes
                    for (i = 1; i < degrees; i++) """),format.raw/*828.51*/("""{"""),format.raw/*828.52*/("""
                        """),format.raw/*829.25*/("""for (j = 0; j < connectedNodes.length; j++) """),format.raw/*829.69*/("""{"""),format.raw/*829.70*/("""
                            """),format.raw/*830.29*/("""allConnectedNodes = allConnectedNodes.concat(network.getConnectedNodes(connectedNodes[j]));
                        """),format.raw/*831.25*/("""}"""),format.raw/*831.26*/("""
                    """),format.raw/*832.21*/("""}"""),format.raw/*832.22*/("""

                    """),format.raw/*834.21*/("""var connectedEdges = network.getConnectedEdges(selectedNode);
                    for (i = 0; i < connectedEdges.length; i++) """),format.raw/*835.65*/("""{"""),format.raw/*835.66*/("""
                        """),format.raw/*836.25*/("""allEdges[connectedEdges[i]].color = 'rgba(255,0,0,1)';
                    """),format.raw/*837.21*/("""}"""),format.raw/*837.22*/("""

                    """),format.raw/*839.21*/("""// all second degree nodes get a different color and their label back
                    for (i = 0; i < allConnectedNodes.length; i++) """),format.raw/*840.68*/("""{"""),format.raw/*840.69*/("""
                        """),format.raw/*841.25*/("""if(selectedNodeGroup == "user") """),format.raw/*841.57*/("""{"""),format.raw/*841.58*/("""
                            """),format.raw/*842.29*/("""allNodes[allConnectedNodes[i]].color = 'rgba(255,0,0,0.2)';
                        """),format.raw/*843.25*/("""}"""),format.raw/*843.26*/("""else if(selectedNodeGroup == "dataset")"""),format.raw/*843.65*/("""{"""),format.raw/*843.66*/("""
                            """),format.raw/*844.29*/("""allNodes[allConnectedNodes[i]].color = 'rgba(0,0,255,0.2)';
                        """),format.raw/*845.25*/("""}"""),format.raw/*845.26*/("""else """),format.raw/*845.31*/("""{"""),format.raw/*845.32*/("""
                            """),format.raw/*846.29*/("""allNodes[allConnectedNodes[i]].color = 'rgba(0,255,0,0.2)';
                        """),format.raw/*847.25*/("""}"""),format.raw/*847.26*/("""
                        """),format.raw/*848.25*/("""if (allNodes[allConnectedNodes[i]].hiddenLabel !== undefined) """),format.raw/*848.87*/("""{"""),format.raw/*848.88*/("""
                            """),format.raw/*849.29*/("""allNodes[allConnectedNodes[i]].label = allNodes[allConnectedNodes[i]].hiddenLabel;
                            allNodes[allConnectedNodes[i]].hiddenLabel = undefined;
                        """),format.raw/*851.25*/("""}"""),format.raw/*851.26*/("""
                    """),format.raw/*852.21*/("""}"""),format.raw/*852.22*/("""

                    """),format.raw/*854.21*/("""// all first degree nodes get their own color and their label back
                    for (i = 0; i < connectedNodes.length; i++) """),format.raw/*855.65*/("""{"""),format.raw/*855.66*/("""
                        """),format.raw/*856.25*/("""if(firstLevelNodeGroup == "user") """),format.raw/*856.59*/("""{"""),format.raw/*856.60*/("""
                            """),format.raw/*857.29*/("""allNodes[connectedNodes[i]].color = 'rgba(255,0,0,0.7)';
                        """),format.raw/*858.25*/("""}"""),format.raw/*858.26*/("""else if(firstLevelNodeGroup == "dataset") """),format.raw/*858.68*/("""{"""),format.raw/*858.69*/("""
                            """),format.raw/*859.29*/("""allNodes[connectedNodes[i]].color = 'rgba(0,0,255,0.7)';
                        """),format.raw/*860.25*/("""}"""),format.raw/*860.26*/("""else """),format.raw/*860.31*/("""{"""),format.raw/*860.32*/("""
                            """),format.raw/*861.29*/("""allNodes[connectedNodes[i]].color = 'rgba(0,255,0,0.7)';
                        """),format.raw/*862.25*/("""}"""),format.raw/*862.26*/("""
                        """),format.raw/*863.25*/("""if (allNodes[connectedNodes[i]].hiddenLabel !== undefined) """),format.raw/*863.84*/("""{"""),format.raw/*863.85*/("""
                            """),format.raw/*864.29*/("""allNodes[connectedNodes[i]].label = allNodes[connectedNodes[i]].hiddenLabel;
                            allNodes[connectedNodes[i]].hiddenLabel = undefined;
                        """),format.raw/*866.25*/("""}"""),format.raw/*866.26*/("""
                    """),format.raw/*867.21*/("""}"""),format.raw/*867.22*/("""

                    """),format.raw/*869.21*/("""var curNode = allNodes[selectedNode];
                    var group = curNode.group;
                    var id = null;
                    switch(group) """),format.raw/*872.35*/("""{"""),format.raw/*872.36*/("""
                        case "service":
                            $("#panelsub").attr("class", "well col-lg-5");
                            id = curNode.serviceId;
                            $("#description").text("Service ");
                            $("#groupId").text(group.charAt(0).toUpperCase()+group.substring(1) + " Id:" );
                            $("#nodeName").text(curNode.title);
                            $("#id").text(id);
                            $("#nodeId").text(curNode.id);
                            $("#cluster").text(curNode.cluster);
                            $("#label").text(curNode.label);
                            $("#panel").show();
                            $("#related").hide();
                            break;
                        case "dataset":
                            $("#panelsub").attr("class", "well col-lg-8");
                            id = curNode.datasetId;
                            $("#description").text("Dataset ");
                            $("#groupId").text(group.charAt(0).toUpperCase()+group.substring(1) + " Id:" );
                            $("#nodeName").text(curNode.title);
                            $("#id").text(id);
                            $("#nodeId").text(curNode.id);
                            $("#cluster").text(curNode.cluster);
                            $("#label").text(curNode.label);

                            var obj = """),format.raw/*897.39*/("""{"""),format.raw/*897.40*/("""
                                """),format.raw/*898.33*/("""datasetName : curNode.title,
                                datasetId : id
                            """),format.raw/*900.29*/("""}"""),format.raw/*900.30*/("""
                            """),format.raw/*901.29*/("""$.ajax("""),format.raw/*901.36*/("""{"""),format.raw/*901.37*/("""
                                """),format.raw/*902.33*/("""url: "getRelatedServiceOfDataset",
                                type: "POST",
                                contentType: "application/json",
                                data: JSON.stringify(obj),
                                dataType: "text"
                            """),format.raw/*907.29*/("""}"""),format.raw/*907.30*/(""").done(function(data) """),format.raw/*907.52*/("""{"""),format.raw/*907.53*/("""
                                """),format.raw/*908.33*/("""data = JSON.parse(data);
                                $("#relatedServiceHref1").attr("href", data.url0);
                                $("#relatedServiceImg1").attr("src", data.imageUrl0);
                                $("#relatedServiceName1").html(data.name0);

                                if (data.name1 == null) """),format.raw/*913.57*/("""{"""),format.raw/*913.58*/("""
                                    """),format.raw/*914.37*/("""$("#related2").hide();
                                """),format.raw/*915.33*/("""}"""),format.raw/*915.34*/("""else """),format.raw/*915.39*/("""{"""),format.raw/*915.40*/("""
                                    """),format.raw/*916.37*/("""$("#related2").show();
                                """),format.raw/*917.33*/("""}"""),format.raw/*917.34*/("""
                                """),format.raw/*918.33*/("""$("#relatedServiceHref2").attr("href", data.url1);
                                $("#relatedServiceImg2").attr("src", data.imageUrl1);
                                $("#relatedServiceName2").html(data.name1);

                                $("#related").show();
                                $("#panel").show();
                            """),format.raw/*924.29*/("""}"""),format.raw/*924.30*/(""");

                            break;
                        case "user":
                            $("#panelsub").attr("class", "well col-lg-5");
                            id = curNode.userId;
                            $("#description").text("User");
                            $("#groupId").text(group.charAt(0).toUpperCase()+group.substring(1) + " Id:" );
                            $("#nodeName").text(curNode.title);
                            $("#id").text(id);
                            $("#nodeId").text(curNode.id);
                            $("#cluster").text(curNode.cluster);
                            $("#label").text(curNode.label);
                            $("#panel").show();
                            $("#related").hide();
                            break;
                        case "variable":
                            id = curNode.variableId;
                            $("#description").text("Variable");
                            break;
                        default:
                            break;
                    """),format.raw/*946.21*/("""}"""),format.raw/*946.22*/("""

                    """),format.raw/*948.21*/("""// the main node gets its own color and its label back.
                    if(selectedNodeGroup == "user") """),format.raw/*949.53*/("""{"""),format.raw/*949.54*/("""
                        """),format.raw/*950.25*/("""allNodes[selectedNode].color = 'rgba(255,0,0,0.7)';
                    """),format.raw/*951.21*/("""}"""),format.raw/*951.22*/("""else if(selectedNodeGroup == "dataset")"""),format.raw/*951.61*/("""{"""),format.raw/*951.62*/("""
                        """),format.raw/*952.25*/("""allNodes[selectedNode].color = 'rgba(0,0,255,0.7)';
                    """),format.raw/*953.21*/("""}"""),format.raw/*953.22*/("""else """),format.raw/*953.27*/("""{"""),format.raw/*953.28*/("""
                        """),format.raw/*954.25*/("""allNodes[selectedNode].color = 'rgba(0,255,0,0.7)';
                    """),format.raw/*955.21*/("""}"""),format.raw/*955.22*/("""
                    """),format.raw/*956.21*/("""if (allNodes[selectedNode].hiddenLabel !== undefined) """),format.raw/*956.75*/("""{"""),format.raw/*956.76*/("""
                        """),format.raw/*957.25*/("""allNodes[selectedNode].label = allNodes[selectedNode].hiddenLabel;
                        allNodes[selectedNode].hiddenLabel = undefined;
                    """),format.raw/*959.21*/("""}"""),format.raw/*959.22*/("""
                """),format.raw/*960.17*/("""}"""),format.raw/*960.18*/("""

                """),format.raw/*962.17*/("""// transform the object into an array
                var updateArray = [];
                for (nodeId in allNodes) """),format.raw/*964.42*/("""{"""),format.raw/*964.43*/("""
                    """),format.raw/*965.21*/("""if (allNodes.hasOwnProperty(nodeId)) """),format.raw/*965.58*/("""{"""),format.raw/*965.59*/("""
                        """),format.raw/*966.25*/("""updateArray.push(allNodes[nodeId]);
                    """),format.raw/*967.21*/("""}"""),format.raw/*967.22*/("""
                """),format.raw/*968.17*/("""}"""),format.raw/*968.18*/("""

                """),format.raw/*970.17*/("""nodesDataset.update(updateArray);

                updateArray = [];
                for (edgeId in allEdges) """),format.raw/*973.42*/("""{"""),format.raw/*973.43*/("""
                    """),format.raw/*974.21*/("""if (allEdges.hasOwnProperty(edgeId)) """),format.raw/*974.58*/("""{"""),format.raw/*974.59*/("""
                        """),format.raw/*975.25*/("""updateArray.push(allEdges[edgeId]);
                    """),format.raw/*976.21*/("""}"""),format.raw/*976.22*/("""
                """),format.raw/*977.17*/("""}"""),format.raw/*977.18*/("""

                """),format.raw/*979.17*/("""edgesDataset.update(updateArray);

                if (connectedEdges.length > 1) """),format.raw/*981.48*/("""{"""),format.raw/*981.49*/("""
                    """),format.raw/*982.21*/("""network.selectEdges([1]);
                """),format.raw/*983.17*/("""}"""),format.raw/*983.18*/("""
            """),format.raw/*984.13*/("""}"""),format.raw/*984.14*/("""

            """),format.raw/*986.13*/("""//  draw();
    </script>
    <script type="text/javascript" src='"""),_display_(/*988.42*/routes/*988.48*/.Assets.at("javascripts/googleAnalytics.js")),format.raw/*988.92*/("""'></script>
""")))};
Seq[Any](format.raw/*1.19*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*989.2*/("""

"""),_display_(/*991.2*/main("Knowledge Graph", scripts)/*991.34*/{_display_(Seq[Any](format.raw/*991.35*/("""
    """),format.raw/*992.5*/("""<div class="container">
        <div class="row">
            <div class="col s12">
                <div class="card-panel center">
                <h4 id="header">Network of user and dataset based on service usage <img src="/assets/images/Legend.jpg" height="20" width="190"/><span class="glyphicon glyphicon-question-sign" data-toggle="tooltip" data-placement="right" title="... ..."></span></h4>
                <div class = "col s12" id="knowledgeGraph" >
                    <div id="loadingBar" class="col-lg-3">
                        <div class="outerBorder" >
                            <div id="text">0%</div>
                            <div id="border">
                                <div id="bar"></div>
                            </div>
                        </div>
                    </div>

                    <div id="mynetwork" class="col s12 m10 offset-m1">


                    <div class = "col-lg-offset-7">
                        <button type="button" onclick="showAdvancedConfig()" class="btn btn-default  "><span class="glyphicon glyphicon-wrench" aria-hidden="true">
                        </span> Show Advanced Settings </button>
                    </div>

                    <div id="basicConf" class="col-lg-offset-7">
                        <br>
                        <div class="col-lg-8">
                            <label>Graph Level</label>
                            <div class="input-group col-lg-5">
                                <input type="number" class="form-control" placeholder="1~2" id = "graphLevel">
                                <span class="input-group-btn">
                                    <button class="btn btn-default" type="button" onclick="setGraphLevel()">Go!</button>
                                </span>
                            </div>
                            <br>
                            <div class="input-group col-lg-6">
                                <label>Actions</label>
                                <button type="button" onclick="getParameters()" class="btn btn-default  ">
                                    <span class="glyphicon glyphicon-star" aria-hidden="true"></span> Refresh All Node
                                </button>
                            </div>
                            <br>
                            <div class="input-group">
                                <span class="input-group-addon" id="basic-addon1">Start Point</span>
                                <input type="text" class="form-control" placeholder="Type in Node Id" aria-describedby="basic-addon1" id="startPoint">
                            </div>
                            <br>
                            <div class="input-group">
                                <span class="input-group-addon" id="basic-addon2">End Point</span>
                                <input type="text" class="form-control" placeholder="Type in Node Id" aria-describedby="basic-addon2" id="endPoint">
                            </div>
                            <br>
                            <div class="input-group">
                                <span class="input-group-addon" id="basic-addon3">Kth</span>
                                <input type="number" class="form-control" placeholder="kth" aria-describedby="basic-addon3" id="kth">
                            </div>
                            <br>
                            <div class="text-center">
                                <button type="button" class="btn btn-primary" onclick="findShortestPath()">Shortest Path</button>
                            </div>
                            <br>
                            <div class="text-center">
                                <button type="button" class="btn btn-primary" onclick="findKthShortestPath()">Kth Shortest Path</button>
                            </div>
                            <br>
                            <div class="col-lg-offset-0">
                                <form>
                                    <label>Rational Graph</label>
                                    <div class="form-group">
                                        <select onchange="schedule(this.value)" class="form-control" id="paramCombination">
                                            <option value="User Dataset Service">User × Dataset | Service</option>
                                            <option value="User Service Dataset">User × Service | Dataset</option>
                                            <option value="Dataset Service User">Dataset × Service | User</option>
                                            <option value="User User Dataset">User × User | Dataset</option>
                                            <option value="User User Service">User × User | Service</option>
                                            <option value="Dataset Dataset User">Dataset × Dataset | User</option>
                                            <option value="Dataset Dataset Service">Dataset × Dataset | Service</option>
                                            <option value="Service Service User">Service × Service | User</option>
                                            <option value="Service Service Dataset">Service × Service | Dataset</option>
                                        </select>
                                    </div>
                                    <div id = "setWholeShownName" class="row col-sm-offset-0 col-md-offset-0 col-lg-offset-0">
                                        <div>
                                            <input type="radio" id="datasetNameW" name="customizedChoiceW" checked="checked" value="datasetNameW" > Dataset Name &nbsp;
                                            <input type="radio" id="variableNameW" name="customizedChoiceW" value="variableNameW" > Variable Name
                                        </div>
                                        <br>
                                    </div>
                                    <div id="filter" style="display: none;">
                                        <label>Filter Results</label>
                                        <div class="form-group">
                                            <select class="form-control" id="filterCombination">
                                                <option disabled selected>Choose Filter</option>
                                                <option value="user">User</option>
                                                <option value="dataset">Dataset</option>
                                            </select>
                                        </div>
                                        <br>
                                        <label>Id</label>
                                        <input type="text" class="form-control col-lg-4" id="filterId" placeholder="User/Dataset/Service Id">
                                    </div>
                                    <br>
                                    <div id="filterTime" style="display: none;">
                                        <label>Start Time</label>
                                        <input type="text" class="form-control col-lg-4" id="fStartTime" placeholder="MM/DD/YY HH:mm AM">

                                        <br>
                                        <br>
                                        <br>
                                        <label>End Time</label>
                                        <input type="text" class="form-control col-lg-4" id="fEndTime" placeholder="MM/DD/YY HH:mm AM">
                                    </div>
                                    <div class="text-center" >
                                        <button type="button" class="btn btn-primary" onclick="Javascript:getParameters()">Finish</button>
                                    </div>
                                </form>
                                <br>
                                <br>
                            </div>
                        </div>
                    </div>
                    </div>
                    <div id="config" class="row col-lg-offset-7"></div>
                </div>
                <div class = "row">
                    <br>
                    <div id="edgeDataPanel" class="col-lg-offset-7"></div>
                    <div id="panel" class="col-lg-offset-7">

                        <div id="panelsub" class="well col-lg-5">

                                <!-- <div class="text-center">
                  <img class="card-img-top" style=" width:60%;" src="/assets/images/data.png">
                </div> -->

                            <div class="card-block text-center">
                                <h4 class="card-title" id="nodeName">card</h4>
                                <p class="card-text text-muted" ><code id="description"></code></p>
                            </div>
                            <ul class="list-group list-group-flush">
                                <li class="list-group-item"><strong id="groupId"></strong><code id="id"></code></li>
                                <li class="list-group-item"><strong>Node Id:</strong><code id="nodeId"></code></li>
                                <li class="list-group-item"><strong>Cluster:</strong><code id="cluster"></code></li>
                                <li class="list-group-item"><strong>Label:</strong><code id="label"></code></li>
                            </ul>


                            <div id="related">
                                <div>
                                    <h4 class="card-title text-center"><strong>Mostly used by services</strong></h4>
                                </div>

                                <div class="row" >

                                    <div class="col-md-6" id="related1">
                                        <div class="thumbnail">
                                            <a id="relatedServiceHref1" href="climateService.getUrl()">
                                                <img id="relatedServiceImg1" src='"""),_display_(/*1148.84*/routes/*1148.90*/.Assets.at("images/bug.png")),format.raw/*1148.118*/("""' style="height: 150px; width: 150px">
                                                </a>
                                                <div class="caption">
                                                <h5 id="relatedServiceName1">null</h5>
                                                </div>
                                                </div>
                                                </div>

                                                <div class="col-md-6" id="related2">
                                                <div class="thumbnail">
                                                <a id="relatedServiceHref2" href="climateService.getUrl()">
                                                <img id="relatedServiceImg2" src='"""),_display_(/*1159.84*/routes/*1159.90*/.Assets.at("images/bug.png")),format.raw/*1159.118*/("""' style="height: 150px; width: 150px"/>
                                            </a>
                                            <div class="caption">
                                                <h5 id="relatedServiceName2">null</h5>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <br>
                </div>
            </div>
        </div>
    </div>
""")))}))
      }
    }
  }

  def render(relation:String): play.twirl.api.HtmlFormat.Appendable = apply(relation)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (relation) => apply(relation)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:29 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/authorAuthorRelation.scala.html
                  HASH: 1b3d27b62c029692a4e8a5e1c5d99feb27e94c0a
                  MATRIX: 1126->1|1216->20|1244->38|1258->45|1338->49|1369->54|1425->84|1439->90|1492->123|1573->177|1601->178|1645->195|1702->225|1730->226|1771->239|1810->250|1839->251|1884->268|2014->370|2043->371|2084->384|2124->396|2153->397|2198->414|2637->825|2666->826|2707->839|2744->848|2773->849|2818->866|2936->956|2965->957|3007->971|3041->977|3070->978|3115->995|3392->1244|3421->1245|3464->1260|3508->1276|3537->1277|3582->1294|4905->2589|4934->2590|4976->2604|5012->2612|5041->2613|5086->2630|5391->2907|5420->2908|5462->2922|5495->2927|5524->2928|5569->2945|5944->3292|5973->3293|6015->3307|6051->3315|6080->3316|6126->3334|6212->3392|6241->3393|6282->3406|6324->3420|6353->3421|6398->3438|6461->3473|6490->3474|6531->3487|6613->3541|6642->3542|6687->3559|6741->3585|6770->3586|6812->3599|6881->3639|6911->3640|6957->3657|7017->3688|7047->3689|7080->3694|7159->3745|7175->3751|7237->3791|7318->3844|7334->3850|7396->3890|7621->4086|7651->4087|7697->4104|7996->4374|8026->4375|8412->4733|8448->4747|8775->5045|8805->5046|8851->5063|9098->5281|9128->5282|9178->5303|9296->5392|9326->5393|9356->5394|9390->5399|9420->5400|9470->5421|9542->5464|9572->5465|9618->5482|9696->5531|9726->5532|9776->5553|9881->5629|9911->5630|9941->5631|9975->5636|10005->5637|10055->5658|10123->5697|10153->5698|10199->5715|10279->5766|10309->5767|10359->5788|10466->5866|10496->5867|10526->5868|10560->5873|10590->5874|10640->5895|10708->5934|10738->5935|10784->5952|10862->6001|10892->6002|10942->6023|11045->6097|11075->6098|11105->6099|11139->6104|11169->6105|11219->6126|11285->6163|11315->6164|11361->6447|11407->6464|11568->6596|11598->6597|11648->6618|11754->6695|11784->6696|11831->6714|11890->6744|11920->6745|11971->6767|12736->7503|12766->7504|12812->7521|12846->7526|12876->7527|12926->7548|13318->7911|13348->7912|13395->7930|13441->7947|13471->7948|13521->7969|13797->8216|13827->8217|13873->8234|13950->8282|13980->8283|14030->8304|14289->8534|14319->8535|14371->8558|14401->8559|14451->8580|14603->8703|14633->8704|14687->8729|14763->8776|14793->8777|14827->8782|14857->8783|14911->8808|14987->8855|15017->8856|15067->8877|15120->8901|15150->8902|15225->8948|15255->8949|15305->8970|15502->9138|15532->9139|15576->9154|15606->9155|15650->9170|15706->9197|15736->9198|15782->9215|15836->9240|15866->9241|15916->9262|16024->9341|16054->9342|16088->9347|16118->9348|16168->9369|16276->9448|16306->9449|16348->9462|16378->9463|16421->9477|16480->9507|16510->9508|16556->9525|16613->9553|16643->9554|16693->9575|16801->9654|16831->9655|16865->9660|16895->9661|16945->9682|17053->9761|17083->9762|17125->9775|17155->9776|17198->9790|17252->9815|17282->9816|17328->9833|17437->9913|17467->9914|17510->9928|17555->9944|17585->9945|17631->9962|17837->10140|17873->10154|18246->10498|18276->10499|18326->10520|18432->10597|18462->10598|18523->10630|18553->10631|18603->10652|18639->10659|18669->10660|18723->10685|18759->10692|18789->10693|18847->10722|18887->10733|18917->10734|18979->10767|19133->10892|19163->10893|19217->10918|19247->10919|19309->10952|19339->10953|19397->10982|19514->11070|19544->11071|19635->11133|19665->11134|19723->11163|19753->11164|19807->11189|19898->11251|19928->11252|19987->11282|20020->11286|20050->11287|20112->11320|20234->11413|20264->11414|20318->11439|20348->11440|20412->11475|20442->11476|20500->11505|20628->11604|20658->11605|20708->11626|20738->11627|20802->11662|20832->11663|20886->11688|20953->11726|20983->11727|21042->11757|21072->11758|21126->11783|21164->11792|21194->11793|21252->11822|21331->11872|21361->11873|21422->11905|21452->11906|21510->11935|21589->11985|21619->11986|21683->12021|21713->12022|21771->12051|21850->12101|21880->12102|21930->12123|21960->12124|22021->12156|22051->12157|22105->12182|22157->12205|22187->12206|22245->12235|22420->12381|22450->12382|22661->12564|22691->12565|22749->12594|22905->12721|22935->12722|22985->12743|23015->12744|23077->12777|23107->12778|23161->12803|23221->12834|23251->12835|23309->12864|23398->12924|23428->12925|23490->12958|23560->12999|23590->13000|23648->13029|23735->13087|23765->13088|23827->13121|23897->13162|23927->13163|23985->13192|24072->13250|24102->13251|24164->13284|24234->13325|24264->13326|24322->13355|24389->13393|24419->13394|24539->13485|24569->13486|24615->13503|24645->13504|24858->13688|24888->13689|24938->13710|25366->14109|25396->14110|25499->14184|25529->14185|25579->14206|25906->14504|25936->14505|26027->14566|26058->14567|26111->14591|26141->14592|26218->14640|26248->14641|26296->14660|26326->14661|26402->14708|26432->14709|26480->14728|26510->14729|26793->14983|26823->14984|26866->14998|26923->15026|26953->15027|26999->15044|27143->15159|27173->15160|27223->15181|27321->15250|27351->15251|27398->15269|27434->15276|27464->15277|27514->15298|27755->15510|27785->15511|27837->15534|27867->15535|27917->15556|28054->15664|28084->15665|28159->15711|28189->15712|28239->15733|28436->15901|28466->15902|28509->15916|28539->15917|28582->15931|28642->15962|28672->15963|28718->15980|28947->16180|28977->16181|29027->16202|29156->16302|29186->16303|29233->16321|29269->16328|29299->16329|29349->16350|29593->16565|29623->16566|29675->16589|29705->16590|29755->16611|30027->16854|30057->16855|30132->16901|30162->16902|30212->16923|30409->17091|30439->17092|30482->17106|30512->17107|30555->17121|30625->17162|30655->17163|30701->17180|30803->17253|30833->17254|30884->17276|31146->17509|31176->17510|31830->18135|31860->18136|31911->18158|31957->18175|31987->18176|32041->18201|32293->18424|32323->18425|32373->18446|32409->18453|32439->18454|32493->18479|32780->18737|32810->18738|32862->18761|32892->18762|32946->18787|33095->18907|33125->18908|33200->18954|33230->18955|33284->18980|33497->19164|33527->19165|33575->19184|33605->19185|33648->19199|33678->19200|33721->19214|33782->19246|33812->19247|33858->19264|34380->19757|34410->19758|34460->19779|34734->20024|34764->20025|34794->20026|34828->20031|34858->20032|34908->20053|34986->20102|35016->20103|35062->20120|35146->20175|35176->20176|35226->20197|35442->20384|35472->20385|35518->20402|35608->20463|35638->20464|35688->20485|35910->20678|35940->20679|35982->20692|36012->20693|36055->20707|36115->20738|36145->20739|36191->20756|36334->20870|36364->20871|36414->20892|36561->21010|36591->21011|36645->21036|36815->21177|36845->21178|36891->21195|36921->21196|36968->21214|37026->21243|37056->21244|37106->21265|37164->21294|37194->21295|37248->21320|37347->21390|37377->21391|37427->21412|37460->21416|37490->21417|37544->21442|37629->21498|37659->21499|37709->21520|37871->21653|37901->21654|37947->21671|38080->21775|38110->21776|38160->21797|38226->21834|38256->21835|38310->21860|38395->21916|38425->21917|38471->21934|38501->21935|38548->21953|38688->22064|38718->22065|38768->22086|38834->22123|38864->22124|38918->22149|39003->22205|39033->22206|39079->22223|39109->22224|39156->22242|39379->22436|39409->22437|39459->22458|40578->23548|40608->23549|40638->23550|40762->23645|40792->23646|40846->23671|40876->23672|40930->23697|40997->23735|41027->23736|41061->23741|41091->23742|41145->23767|41212->23805|41242->23806|41294->23829|41340->23846|41370->23847|41424->23872|41768->24187|41798->24188|41849->24210|41885->24217|41915->24218|41969->24243|42233->24478|42263->24479|42314->24501|42344->24502|42398->24527|42751->24851|42781->24852|42839->24881|43059->25072|43089->25073|43179->25134|43209->25135|43268->25165|43542->25410|43572->25411|43634->25444|43973->25754|44003->25755|44061->25784|44140->25834|44170->25835|44260->25896|44290->25897|44348->25926|44634->26183|44664->26184|44726->26217|45513->26975|45543->26976|45601->27005|45680->27055|45710->27056|45806->27123|45836->27124|45894->27153|46175->27405|46205->27406|46267->27439|46691->27834|46721->27835|46779->27864|46858->27914|46888->27915|46984->27982|47014->27983|47072->28012|47358->28269|47388->28270|47450->28303|48237->29061|48267->29062|48325->29091|48404->29141|48434->29142|48530->29209|48560->29210|48618->29239|48899->29491|48929->29492|48991->29525|49415->29920|49445->29921|49503->29950|49582->30000|49612->30001|49708->30068|49738->30069|49796->30098|50082->30355|50112->30356|50174->30389|50986->31172|51016->31173|51074->31202|51153->31252|51183->31253|51237->31278|51267->31279|51590->31573|51620->31574|51682->31607|52474->32370|52504->32371|52562->32400|52641->32450|52671->32451|52725->32476|52755->32477|52813->32506|53083->32747|53113->32748|53175->32781|54001->33578|54031->33579|54089->33608|54168->33658|54198->33659|54249->33681|54279->33682|54337->33711|54618->33963|54648->33964|54710->33997|55134->34392|55164->34393|55222->34422|55514->34685|55544->34686|55599->34712|55733->34817|55763->34818|55838->34864|55868->34865|55922->34890|56135->35074|56165->35075|56212->35093|56242->35094|56284->35107|56314->35108|56357->35122|56411->35147|56441->35148|56487->35165|56573->35222|56603->35223|56653->35244|56711->35273|56741->35274|56795->35299|56933->35408|56963->35409|57021->35438|57199->35587|57229->35588|57279->35609|57309->35610|57360->35632|57418->35661|57448->35662|57502->35687|57745->35901|57775->35902|57825->35923|57895->35964|57925->35965|57972->35983|58064->36046|58094->36047|58144->36068|58210->36105|58240->36106|58294->36131|58379->36187|58409->36188|58455->36205|58485->36206|58532->36224|58672->36335|58702->36336|58752->36357|58818->36394|58848->36395|58902->36420|58987->36476|59017->36477|59063->36494|59093->36495|59140->36513|59215->36559|59245->36560|59288->36574|59357->36614|59387->36615|59433->36632|59620->36790|59650->36791|59700->36812|60069->37152|60099->37153|60153->37178|60303->37299|60333->37300|60391->37329|60563->37472|60593->37473|60643->37494|60673->37495|60724->37517|60782->37546|60812->37547|60866->37572|61016->37693|61046->37694|61104->37723|61276->37866|61306->37867|61356->37888|61386->37889|61437->37911|61667->38112|61697->38113|61751->38138|61857->38215|61887->38216|61937->38237|62096->38367|62126->38368|62180->38393|62253->38437|62283->38438|62341->38467|62486->38583|62516->38584|62566->38605|62596->38606|62647->38628|62802->38754|62832->38755|62886->38780|62990->38855|63020->38856|63071->38878|63237->39015|63267->39016|63321->39041|63382->39073|63412->39074|63470->39103|63583->39187|63613->39188|63681->39227|63711->39228|63769->39257|63882->39341|63912->39342|63946->39347|63976->39348|64034->39377|64147->39461|64177->39462|64231->39487|64322->39549|64352->39550|64410->39579|64630->39770|64660->39771|64710->39792|64740->39793|64791->39815|64951->39946|64981->39947|65035->39972|65098->40006|65128->40007|65186->40036|65296->40117|65326->40118|65397->40160|65427->40161|65485->40190|65595->40271|65625->40272|65659->40277|65689->40278|65747->40307|65857->40388|65887->40389|65941->40414|66029->40473|66059->40474|66117->40503|66328->40685|66358->40686|66408->40707|66438->40708|66489->40730|66672->40884|66702->40885|68174->42328|68204->42329|68266->42362|68399->42466|68429->42467|68487->42496|68523->42503|68553->42504|68615->42537|68926->42819|68956->42820|69007->42842|69037->42843|69099->42876|69455->43203|69485->43204|69551->43241|69635->43296|69665->43297|69699->43302|69729->43303|69795->43340|69879->43395|69909->43396|69971->43429|70348->43777|70378->43778|71485->44856|71515->44857|71566->44879|71703->44987|71733->44988|71787->45013|71888->45085|71918->45086|71986->45125|72016->45126|72070->45151|72171->45223|72201->45224|72235->45229|72265->45230|72319->45255|72420->45327|72450->45328|72500->45349|72583->45403|72613->45404|72667->45429|72855->45588|72885->45589|72931->45606|72961->45607|73008->45625|73154->45742|73184->45743|73234->45764|73300->45801|73330->45802|73384->45827|73469->45883|73499->45884|73545->45901|73575->45902|73622->45920|73761->46030|73791->46031|73841->46052|73907->46089|73937->46090|73991->46115|74076->46171|74106->46172|74152->46189|74182->46190|74229->46208|74340->46290|74370->46291|74420->46312|74491->46354|74521->46355|74563->46368|74593->46369|74636->46383|74731->46450|74747->46456|74813->46500|74865->18|74892->36|74921->46513|74951->46516|74993->46548|75033->46549|75066->46554|85272->56731|85289->56737|85341->56765|86133->57528|86150->57534|86202->57562
                  LINES: 35->1|38->2|40->4|40->4|42->4|43->5|43->5|43->5|43->5|45->7|45->7|46->8|47->9|47->9|48->10|48->10|48->10|49->11|52->14|52->14|53->15|53->15|53->15|54->16|65->27|65->27|66->28|66->28|66->28|67->29|70->32|70->32|72->34|72->34|72->34|73->35|81->43|81->43|84->46|84->46|84->46|85->47|101->63|101->63|103->65|103->65|103->65|104->66|112->74|112->74|114->76|114->76|114->76|115->77|124->86|124->86|126->88|126->88|126->88|128->90|131->93|131->93|132->94|132->94|132->94|133->95|134->96|134->96|135->97|135->97|135->97|136->98|137->99|137->99|138->100|138->100|138->100|139->101|140->102|140->102|141->103|143->105|143->105|143->105|144->106|144->106|144->106|151->113|151->113|152->114|161->123|161->123|175->137|175->137|184->146|184->146|185->147|188->150|188->150|189->151|190->152|190->152|190->152|190->152|190->152|191->153|192->154|192->154|193->155|193->155|193->155|194->156|195->157|195->157|195->157|195->157|195->157|196->158|197->159|197->159|198->160|198->160|198->160|199->161|200->162|200->162|200->162|200->162|200->162|201->163|202->164|202->164|203->165|203->165|203->165|204->166|205->167|205->167|205->167|205->167|205->167|206->168|207->169|207->169|208->175|209->176|212->179|212->179|213->180|214->181|214->181|216->183|216->183|216->183|218->185|222->189|222->189|223->190|223->190|223->190|224->191|225->192|225->192|227->194|227->194|227->194|228->195|235->202|235->202|236->203|237->204|237->204|238->205|243->210|243->210|243->210|243->210|244->211|246->213|246->213|247->214|248->215|248->215|248->215|248->215|249->216|250->217|250->217|251->218|252->219|252->219|252->219|252->219|253->220|257->224|257->224|259->226|259->226|262->229|262->229|262->229|263->230|263->230|263->230|264->231|266->233|266->233|266->233|266->233|267->234|269->236|269->236|270->237|270->237|272->239|272->239|272->239|273->240|273->240|273->240|274->241|276->243|276->243|276->243|276->243|277->244|279->246|279->246|280->247|280->247|282->249|282->249|282->249|283->250|285->252|285->252|287->254|287->254|287->254|288->255|293->260|293->260|304->271|304->271|305->272|307->274|307->274|308->275|308->275|309->276|309->276|309->276|310->277|310->277|310->277|311->278|311->278|311->278|312->279|314->281|314->281|315->282|315->282|317->284|317->284|318->285|320->287|320->287|322->289|322->289|323->290|323->290|324->291|325->292|325->292|327->294|327->294|327->294|328->295|330->297|330->297|331->298|331->298|333->300|333->300|334->301|336->303|336->303|337->304|337->304|338->305|338->305|339->306|340->307|340->307|341->308|341->308|342->309|342->309|342->309|343->310|344->311|344->311|345->312|345->312|346->313|347->314|347->314|348->315|348->315|349->316|350->317|350->317|351->318|351->318|353->320|353->320|354->321|354->321|354->321|355->322|361->328|361->328|365->332|365->332|366->333|369->336|369->336|370->337|370->337|371->338|371->338|372->339|372->339|372->339|373->340|373->340|373->340|374->341|375->342|375->342|376->343|376->343|376->343|377->344|378->345|378->345|379->346|379->346|379->346|380->347|381->348|381->348|382->349|383->350|383->350|385->352|385->352|386->353|386->353|394->361|394->361|395->362|402->369|402->369|403->370|403->370|404->371|408->375|408->375|408->375|408->375|409->376|409->376|411->378|411->378|411->378|411->378|412->379|412->379|412->379|412->379|418->385|418->385|420->387|420->387|420->387|421->388|424->391|424->391|425->392|427->394|427->394|429->396|429->396|429->396|430->397|435->402|435->402|435->402|435->402|436->403|439->406|439->406|439->406|439->406|440->407|444->411|444->411|445->412|445->412|447->414|447->414|447->414|448->415|452->419|452->419|453->420|456->423|456->423|458->425|458->425|458->425|459->426|464->431|464->431|464->431|464->431|465->432|470->437|470->437|470->437|470->437|471->438|475->442|475->442|476->443|476->443|478->445|478->445|478->445|479->446|480->447|480->447|482->449|489->456|489->456|504->471|504->471|506->473|506->473|506->473|507->474|513->480|513->480|514->481|514->481|514->481|515->482|520->487|520->487|520->487|520->487|521->488|524->491|524->491|524->491|524->491|525->492|529->496|529->496|531->498|531->498|533->500|533->500|535->502|535->502|535->502|536->503|542->509|542->509|543->510|546->513|546->513|546->513|546->513|546->513|547->514|548->515|548->515|549->516|549->516|549->516|550->517|552->519|552->519|553->520|553->520|553->520|554->521|556->523|556->523|557->524|557->524|559->526|559->526|559->526|560->527|562->529|562->529|563->530|564->531|564->531|565->532|567->534|567->534|568->535|568->535|570->537|570->537|570->537|571->538|571->538|571->538|572->539|573->540|573->540|574->541|574->541|574->541|575->542|576->543|576->543|577->544|579->546|579->546|580->547|582->549|582->549|583->550|583->550|583->550|584->551|585->552|585->552|586->553|586->553|588->555|592->559|592->559|593->560|593->560|593->560|594->561|595->562|595->562|596->563|596->563|598->565|603->570|603->570|604->571|616->583|616->583|616->583|618->585|618->585|618->585|618->585|619->586|620->587|620->587|620->587|620->587|621->588|622->589|622->589|625->592|625->592|625->592|626->593|633->600|633->600|635->602|635->602|635->602|636->603|641->608|641->608|641->608|641->608|642->609|648->615|648->615|649->616|651->618|651->618|651->618|651->618|653->620|655->622|655->622|656->623|659->626|659->626|660->627|661->628|661->628|661->628|661->628|662->629|664->631|664->631|665->632|674->641|674->641|675->642|676->643|676->643|676->643|676->643|677->644|679->646|679->646|680->647|684->651|684->651|685->652|686->653|686->653|686->653|686->653|687->654|689->656|689->656|690->657|699->666|699->666|700->667|701->668|701->668|701->668|701->668|702->669|704->671|704->671|705->672|709->676|709->676|710->677|711->678|711->678|711->678|711->678|712->679|714->681|714->681|715->682|725->692|725->692|726->693|727->694|727->694|727->694|727->694|730->697|730->697|731->698|740->707|740->707|741->708|742->709|742->709|742->709|742->709|743->710|745->712|745->712|746->713|755->722|755->722|756->723|757->724|757->724|757->724|757->724|758->725|760->727|760->727|761->728|765->732|765->732|766->733|770->737|770->737|772->739|775->742|775->742|775->742|775->742|776->743|780->747|780->747|781->748|781->748|782->749|782->749|784->751|784->751|784->751|785->752|785->752|785->752|786->753|786->753|786->753|787->754|789->756|789->756|790->757|792->759|792->759|793->760|793->760|795->762|795->762|795->762|796->763|800->767|800->767|801->768|802->769|802->769|804->771|805->772|805->772|806->773|806->773|806->773|807->774|808->775|808->775|809->776|809->776|811->778|815->782|815->782|816->783|816->783|816->783|817->784|818->785|818->785|819->786|819->786|821->788|822->789|822->789|824->791|824->791|824->791|825->792|828->795|828->795|829->796|836->803|836->803|837->804|838->805|838->805|839->806|841->808|841->808|842->809|842->809|844->811|844->811|844->811|845->812|846->813|846->813|847->814|849->816|849->816|850->817|850->817|852->819|855->822|855->822|856->823|857->824|857->824|858->825|861->828|861->828|862->829|862->829|862->829|863->830|864->831|864->831|865->832|865->832|867->834|868->835|868->835|869->836|870->837|870->837|872->839|873->840|873->840|874->841|874->841|874->841|875->842|876->843|876->843|876->843|876->843|877->844|878->845|878->845|878->845|878->845|879->846|880->847|880->847|881->848|881->848|881->848|882->849|884->851|884->851|885->852|885->852|887->854|888->855|888->855|889->856|889->856|889->856|890->857|891->858|891->858|891->858|891->858|892->859|893->860|893->860|893->860|893->860|894->861|895->862|895->862|896->863|896->863|896->863|897->864|899->866|899->866|900->867|900->867|902->869|905->872|905->872|930->897|930->897|931->898|933->900|933->900|934->901|934->901|934->901|935->902|940->907|940->907|940->907|940->907|941->908|946->913|946->913|947->914|948->915|948->915|948->915|948->915|949->916|950->917|950->917|951->918|957->924|957->924|979->946|979->946|981->948|982->949|982->949|983->950|984->951|984->951|984->951|984->951|985->952|986->953|986->953|986->953|986->953|987->954|988->955|988->955|989->956|989->956|989->956|990->957|992->959|992->959|993->960|993->960|995->962|997->964|997->964|998->965|998->965|998->965|999->966|1000->967|1000->967|1001->968|1001->968|1003->970|1006->973|1006->973|1007->974|1007->974|1007->974|1008->975|1009->976|1009->976|1010->977|1010->977|1012->979|1014->981|1014->981|1015->982|1016->983|1016->983|1017->984|1017->984|1019->986|1021->988|1021->988|1021->988|1023->1|1024->3|1025->989|1027->991|1027->991|1027->991|1028->992|1184->1148|1184->1148|1184->1148|1195->1159|1195->1159|1195->1159
                  -- GENERATED --
              */
          