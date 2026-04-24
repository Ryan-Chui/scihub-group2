
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
/*1.2*/import helper._

object researchInterest extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*3.2*/main("Research Interest Graph")/*3.33*/ {_display_(Seq[Any](format.raw/*3.35*/("""

    """),format.raw/*5.5*/("""<!-- MAIN CONTAINER -->
    <div class="container" style="max-width: 1200px; margin: 0 auto; padding: 2rem 1rem; background-color: #f9f9f9; border-radius: 8px;">

        <!-- Research Dashboard Heading -->
        <h2 style="text-align: center; margin-bottom: 2rem; font-weight: 700; font-size: 2rem;">
            Research Dashboard
        </h2>

        <!-- CARD 1: Research Interests (Word Cloud) -->
        <div class="section-card"
             style="
                background: #fff;
                border-radius: 12px;
                box-shadow: 0 4px 10px rgba(0,0,0,0.1);
                padding: 2rem;
                margin-bottom: 2rem;
             ">
            <h5 style="font-weight: 700; text-align: center; margin-bottom: 1.5rem; font-size: 1.5rem;">
                Research Interests
            </h5>
            <div style="text-align: center;">
                <img
                  src=""""),_display_(/*27.25*/routes/*27.31*/.Assets.at("resource/acm_category_wordcloud.png")),format.raw/*27.80*/(""""
                  alt="Combined Topic Word Cloud"
                  style="max-width: 90%; height: auto;"
                />
            </div>
        </div>

        <!-- CARD 2: Donut Chart + Year Selector -->
        <div class="section-card"
             style="
                background: #fff;
                border-radius: 12px;
                box-shadow: 0 4px 10px rgba(0,0,0,0.1);
                padding: 2rem;
                margin-bottom: 2rem;
             ">
            <h5 style="font-weight: 700; text-align: center; margin-bottom: 1.5rem; font-size: 1.5rem;">
                Research Areas Distribution
            </h5>
            <div style="
                display: flex;
                flex-wrap: wrap;
                justify-content: center;
                align-items: center;
                gap: 2rem;
            ">
                <!-- Donut Chart Container -->
                <div
                  id="pieChart"
                  style="
                    width: 400px;
                    height: 400px;
                    border: 2px solid #ddd;
                    border-radius: 12px;
                    padding: 1rem;
                  ">
                </div>

                <!-- Year Selector using Select2 -->
                <div style="display: flex; flex-direction: column; align-items: center;">
                    <label for="yearSelector" style="font-weight: 600; margin-bottom: 0.5rem; font-size: 1.1rem;">
                        Select Year
                    </label>
                    <select id="yearSelector" style="width: 240px;">
                        <!-- Options will be populated dynamically -->
                    </select>
                </div>
            </div>
        </div>

        <!-- CARD 3: Stacked Bar Chart -->
        <div class="section-card"
             style="
                background: #fff;
                border-radius: 12px;
                box-shadow: 0 4px 10px rgba(0,0,0,0.1);
                padding: 2rem;
             ">
            <h5 style="font-weight: 700; text-align: center; margin-bottom: 1.5rem; font-size: 1.5rem;">
                Research Areas by Year
            </h5>
            <div
              id="stackedBarChart"
              style="
                width: 100%;
                height: 500px;
                margin: 0 auto;
                border: 2px solid #ddd;
                border-radius: 12px;
                padding: 1rem;
                overflow: hidden;
              ">
            </div>
        </div>

    </div> <!-- End Container -->

    <!-- *********************
         PAGE-SPECIFIC SCRIPTS
         ********************* -->

    <!-- Select2 CSS -->
    <link
      href="https://cdn.jsdelivr.net/npm/select2@4.1.0-rc.0/dist/css/select2.min.css"
      rel="stylesheet"
    />

    <!-- Select2 JS -->
    <script src="https://cdn.jsdelivr.net/npm/select2@4.1.0-rc.0/dist/js/select2.min.js"></script>

    <!-- ApexCharts JS -->
    <script src="https://cdn.jsdelivr.net/npm/apexcharts"></script>

    <script type="text/javascript">
        let yearTopicData = """),format.raw/*121.29*/("""{"""),format.raw/*121.30*/("""}"""),format.raw/*121.31*/(""";
        let allYears = [];
        let allTopicsSet = new Set();

        let donutChart, stackedBarChart;  // Chart instances

        // 1) A color palette large enough for all topics
        const colorPalette = [
            '#008FFB', '#00E396', '#FEB019', '#FF4560', '#775DD0',
            '#546E7A', '#26A69A', '#D10CE8', '#2E93fA', '#66DA26',
            '#E91E63', '#FF9800', '#8E44AD', '#2ECC71', '#3498DB',
            '#1ABC9C', '#F39C12', '#7F8C8D', '#C0392B', '#8E44AD'
            // Add more if you have more than 20 unique topics
        ];

        // 2) Map each topic to one color from the palette
        //    We'll build this map once we know all unique topics
        let topicColorMap = """),format.raw/*138.29*/("""{"""),format.raw/*138.30*/("""}"""),format.raw/*138.31*/(""";

        document.addEventListener('DOMContentLoaded', function() """),format.raw/*140.66*/("""{"""),format.raw/*140.67*/("""
            """),format.raw/*141.13*/("""// Fetch the JSON data
            fetch('"""),_display_(/*142.21*/routes/*142.27*/.Assets.at("resource/yearly_lda_acm_distribution.json")),format.raw/*142.82*/("""')
                .then(response => """),format.raw/*143.35*/("""{"""),format.raw/*143.36*/("""
                    """),format.raw/*144.21*/("""if (!response.ok) """),format.raw/*144.39*/("""{"""),format.raw/*144.40*/("""
                        """),format.raw/*145.25*/("""throw new Error("Network response was not ok: " + response.statusText);
                    """),format.raw/*146.21*/("""}"""),format.raw/*146.22*/("""
                    """),format.raw/*147.21*/("""return response.json();
                """),format.raw/*148.17*/("""}"""),format.raw/*148.18*/(""")
                .then(jsonData => """),format.raw/*149.35*/("""{"""),format.raw/*149.36*/("""
                    """),format.raw/*150.21*/("""yearTopicData = jsonData;

                    // Extract year keys, convert to int, sort them
                    allYears = Object.keys(jsonData)
                                     .map(yStr => parseInt(yStr, 10))
                                     .filter(y => !isNaN(y))
                                     .sort((a,b) => a - b);

                    // Collect all unique topic names
                    for (let yearStr of Object.keys(jsonData)) """),format.raw/*159.64*/("""{"""),format.raw/*159.65*/("""
                        """),format.raw/*160.25*/("""const topicObj = jsonData[yearStr];
                        for (let topicName in topicObj) """),format.raw/*161.57*/("""{"""),format.raw/*161.58*/("""
                            """),format.raw/*162.29*/("""allTopicsSet.add(topicName);
                        """),format.raw/*163.25*/("""}"""),format.raw/*163.26*/("""
                    """),format.raw/*164.21*/("""}"""),format.raw/*164.22*/("""

                    """),format.raw/*166.21*/("""// Create a color mapping for each unique topic
                    const allTopics = Array.from(allTopicsSet).sort();
                    let colorIndex = 0;
                    allTopics.forEach((topic) => """),format.raw/*169.50*/("""{"""),format.raw/*169.51*/("""
                        """),format.raw/*170.25*/("""topicColorMap[topic] = colorPalette[colorIndex % colorPalette.length];
                        colorIndex++;
                    """),format.raw/*172.21*/("""}"""),format.raw/*172.22*/(""");

                    // Build the dropdown using Select2 & attach to donut
                    buildYearSelector(allYears);
                    if (allYears.length > 0) """),format.raw/*176.46*/("""{"""),format.raw/*176.47*/("""
                        """),format.raw/*177.25*/("""updateDonutChart(allYears[0]);
                    """),format.raw/*178.21*/("""}"""),format.raw/*178.22*/("""

                    """),format.raw/*180.21*/("""// Build stacked bar chart
                    buildStackedBarChart(allTopics);
                """),format.raw/*182.17*/("""}"""),format.raw/*182.18*/(""")
                .catch(err => """),format.raw/*183.31*/("""{"""),format.raw/*183.32*/("""
                    """),format.raw/*184.21*/("""console.error("Error loading JSON:", err);
                """),format.raw/*185.17*/("""}"""),format.raw/*185.18*/(""");
        """),format.raw/*186.9*/("""}"""),format.raw/*186.10*/(""");

        // Build year selector using Select2
        function buildYearSelector(years) """),format.raw/*189.43*/("""{"""),format.raw/*189.44*/("""
            """),format.raw/*190.13*/("""const selector = document.getElementById("yearSelector");
            selector.innerHTML = "";  // Clear any existing options

            years.forEach(y => """),format.raw/*193.32*/("""{"""),format.raw/*193.33*/("""
                """),format.raw/*194.17*/("""const opt = document.createElement("option");
                opt.value = y;   // integer
                opt.text = y;
                selector.appendChild(opt);
            """),format.raw/*198.13*/("""}"""),format.raw/*198.14*/(""");

            // Remove any leftover Materialize triggers if they exist
            const matDropdownTrigger = document.querySelector('.select-dropdown.dropdown-trigger');
            if (matDropdownTrigger) """),format.raw/*202.37*/("""{"""),format.raw/*202.38*/("""
                """),format.raw/*203.17*/("""matDropdownTrigger.remove();
            """),format.raw/*204.13*/("""}"""),format.raw/*204.14*/("""
            """),format.raw/*205.13*/("""const matWrapper = document.querySelector('.select-wrapper');
            if (matWrapper) """),format.raw/*206.29*/("""{"""),format.raw/*206.30*/("""
                """),format.raw/*207.17*/("""matWrapper.parentNode.replaceChild(selector, matWrapper);
            """),format.raw/*208.13*/("""}"""),format.raw/*208.14*/("""

            """),format.raw/*210.13*/("""// Initialize Select2
            $('#yearSelector').select2("""),format.raw/*211.40*/("""{"""),format.raw/*211.41*/(""" """),format.raw/*211.42*/("""width: '100%' """),format.raw/*211.56*/("""}"""),format.raw/*211.57*/(""").on('change', function() """),format.raw/*211.83*/("""{"""),format.raw/*211.84*/("""
                """),format.raw/*212.17*/("""const chosenYear = parseInt($(this).val(), 10);
                updateDonutChart(chosenYear);
            """),format.raw/*214.13*/("""}"""),format.raw/*214.14*/(""");
        """),format.raw/*215.9*/("""}"""),format.raw/*215.10*/("""

        """),format.raw/*217.9*/("""// Donut Chart
        function updateDonutChart(year) """),format.raw/*218.41*/("""{"""),format.raw/*218.42*/("""
            """),format.raw/*219.13*/("""const yearStr = String(year);
            const dataObj = yearTopicData[yearStr] || """),format.raw/*220.55*/("""{"""),format.raw/*220.56*/("""}"""),format.raw/*220.57*/(""";
            const labels = Object.keys(dataObj);
            const series = Object.values(dataObj);

            const donutOptions = """),format.raw/*224.34*/("""{"""),format.raw/*224.35*/("""
                """),format.raw/*225.17*/("""chart: """),format.raw/*225.24*/("""{"""),format.raw/*225.25*/("""
                    """),format.raw/*226.21*/("""type: 'donut',
                    width: '100%',
                    height: '100%'
                """),format.raw/*229.17*/("""}"""),format.raw/*229.18*/(""",
                series: series,
                labels: labels,
                legend: """),format.raw/*232.25*/("""{"""),format.raw/*232.26*/("""
                    """),format.raw/*233.21*/("""position: 'bottom',
                    offsetY: -10
                """),format.raw/*235.17*/("""}"""),format.raw/*235.18*/(""",
                plotOptions: """),format.raw/*236.30*/("""{"""),format.raw/*236.31*/("""
                    """),format.raw/*237.21*/("""pie: """),format.raw/*237.26*/("""{"""),format.raw/*237.27*/("""
                        """),format.raw/*238.25*/("""donut: """),format.raw/*238.32*/("""{"""),format.raw/*238.33*/("""
                            """),format.raw/*239.29*/("""size: '65%'
                        """),format.raw/*240.25*/("""}"""),format.raw/*240.26*/("""
                    """),format.raw/*241.21*/("""}"""),format.raw/*241.22*/("""
                """),format.raw/*242.17*/("""}"""),format.raw/*242.18*/(""",
                // Map each topic label to its assigned color
                colors: labels.map(label => topicColorMap[label] || '#999999')
            """),format.raw/*245.13*/("""}"""),format.raw/*245.14*/(""";

            if (donutChart) """),format.raw/*247.29*/("""{"""),format.raw/*247.30*/("""
                """),format.raw/*248.17*/("""donutChart.destroy();
            """),format.raw/*249.13*/("""}"""),format.raw/*249.14*/("""
            """),format.raw/*250.13*/("""donutChart = new ApexCharts(document.getElementById("pieChart"), donutOptions);
            donutChart.render();
        """),format.raw/*252.9*/("""}"""),format.raw/*252.10*/("""

        """),format.raw/*254.9*/("""// Stacked Bar Chart
        function buildStackedBarChart(allTopics) """),format.raw/*255.50*/("""{"""),format.raw/*255.51*/("""
            """),format.raw/*256.13*/("""// Prepare series data: each topic => array of frequencies across years
            const series = allTopics.map(topic => """),format.raw/*257.51*/("""{"""),format.raw/*257.52*/("""
                """),format.raw/*258.17*/("""const dataArr = allYears.map(year => """),format.raw/*258.54*/("""{"""),format.raw/*258.55*/("""
                    """),format.raw/*259.21*/("""const yearStr = String(year);
                    const yearObj = yearTopicData[yearStr] || """),format.raw/*260.63*/("""{"""),format.raw/*260.64*/("""}"""),format.raw/*260.65*/(""";
                    return yearObj[topic] || 0;
                """),format.raw/*262.17*/("""}"""),format.raw/*262.18*/(""");
                return """),format.raw/*263.24*/("""{"""),format.raw/*263.25*/(""" """),format.raw/*263.26*/("""name: topic, data: dataArr """),format.raw/*263.53*/("""}"""),format.raw/*263.54*/(""";
            """),format.raw/*264.13*/("""}"""),format.raw/*264.14*/(""");

            const stackedOptions = """),format.raw/*266.36*/("""{"""),format.raw/*266.37*/("""
                """),format.raw/*267.17*/("""chart: """),format.raw/*267.24*/("""{"""),format.raw/*267.25*/("""
                    """),format.raw/*268.21*/("""type: 'bar',
                    stacked: true,
                    height: '450px'
                """),format.raw/*271.17*/("""}"""),format.raw/*271.18*/(""",
                series: series,
                xaxis: """),format.raw/*273.24*/("""{"""),format.raw/*273.25*/("""
                    """),format.raw/*274.21*/("""categories: allYears
                """),format.raw/*275.17*/("""}"""),format.raw/*275.18*/(""",
                legend: """),format.raw/*276.25*/("""{"""),format.raw/*276.26*/("""
                    """),format.raw/*277.21*/("""position: 'right'
                """),format.raw/*278.17*/("""}"""),format.raw/*278.18*/(""",
                plotOptions: """),format.raw/*279.30*/("""{"""),format.raw/*279.31*/("""
                    """),format.raw/*280.21*/("""bar: """),format.raw/*280.26*/("""{"""),format.raw/*280.27*/("""
                        """),format.raw/*281.25*/("""horizontal: false
                    """),format.raw/*282.21*/("""}"""),format.raw/*282.22*/("""
                """),format.raw/*283.17*/("""}"""),format.raw/*283.18*/(""",
                // Use each series name (topic) to pick the corresponding color
                colors: series.map(s => topicColorMap[s.name] || '#999999')
            """),format.raw/*286.13*/("""}"""),format.raw/*286.14*/(""";

            if (stackedBarChart) """),format.raw/*288.34*/("""{"""),format.raw/*288.35*/("""
                """),format.raw/*289.17*/("""stackedBarChart.destroy();
            """),format.raw/*290.13*/("""}"""),format.raw/*290.14*/("""
            """),format.raw/*291.13*/("""stackedBarChart = new ApexCharts(document.getElementById("stackedBarChart"), stackedOptions);
            stackedBarChart.render();
        """),format.raw/*293.9*/("""}"""),format.raw/*293.10*/("""
    """),format.raw/*294.5*/("""</script>
""")))}),format.raw/*295.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:36 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/researchInterest.scala.html
                  HASH: 8b1b515b367eb2874f37ce8090eb87d967535ce7
                  MATRIX: 814->1|1227->19|1266->50|1305->52|1337->58|2286->980|2301->986|2371->1035|5531->4168|5561->4169|5591->4170|6334->4884|6364->4885|6394->4886|6491->4954|6521->4955|6563->4968|6634->5011|6650->5017|6727->5072|6793->5109|6823->5110|6873->5131|6920->5149|6950->5150|7004->5175|7125->5267|7155->5268|7205->5289|7274->5329|7304->5330|7369->5366|7399->5367|7449->5388|7935->5845|7965->5846|8019->5871|8140->5963|8170->5964|8228->5993|8310->6046|8340->6047|8390->6068|8420->6069|8471->6091|8708->6299|8738->6300|8792->6325|8950->6454|8980->6455|9181->6627|9211->6628|9265->6653|9345->6704|9375->6705|9426->6727|9551->6823|9581->6824|9642->6856|9672->6857|9722->6878|9810->6937|9840->6938|9879->6949|9909->6950|10029->7041|10059->7042|10101->7055|10288->7213|10318->7214|10364->7231|10568->7406|10598->7407|10837->7617|10867->7618|10913->7635|10983->7676|11013->7677|11055->7690|11174->7780|11204->7781|11250->7798|11349->7868|11379->7869|11422->7883|11512->7944|11542->7945|11572->7946|11615->7960|11645->7961|11700->7987|11730->7988|11776->8005|11911->8111|11941->8112|11980->8123|12010->8124|12048->8134|12132->8189|12162->8190|12204->8203|12317->8287|12347->8288|12377->8289|12542->8425|12572->8426|12618->8443|12654->8450|12684->8451|12734->8472|12864->8573|12894->8574|13013->8664|13043->8665|13093->8686|13191->8755|13221->8756|13281->8787|13311->8788|13361->8809|13395->8814|13425->8815|13479->8840|13515->8847|13545->8848|13603->8877|13668->8913|13698->8914|13748->8935|13778->8936|13824->8953|13854->8954|14038->9109|14068->9110|14128->9141|14158->9142|14204->9159|14267->9193|14297->9194|14339->9207|14488->9328|14518->9329|14556->9339|14655->9409|14685->9410|14727->9423|14878->9545|14908->9546|14954->9563|15020->9600|15050->9601|15100->9622|15221->9714|15251->9715|15281->9716|15376->9782|15406->9783|15461->9809|15491->9810|15521->9811|15577->9838|15607->9839|15650->9853|15680->9854|15748->9893|15778->9894|15824->9911|15860->9918|15890->9919|15940->9940|16069->10040|16099->10041|16185->10098|16215->10099|16265->10120|16331->10157|16361->10158|16416->10184|16446->10185|16496->10206|16559->10240|16589->10241|16649->10272|16679->10273|16729->10294|16763->10299|16793->10300|16847->10325|16914->10363|16944->10364|16990->10381|17020->10382|17219->10552|17249->10553|17314->10589|17344->10590|17390->10607|17458->10646|17488->10647|17530->10660|17698->10800|17728->10801|17761->10806|17803->10817
                  LINES: 31->1|41->3|41->3|41->3|43->5|65->27|65->27|65->27|159->121|159->121|159->121|176->138|176->138|176->138|178->140|178->140|179->141|180->142|180->142|180->142|181->143|181->143|182->144|182->144|182->144|183->145|184->146|184->146|185->147|186->148|186->148|187->149|187->149|188->150|197->159|197->159|198->160|199->161|199->161|200->162|201->163|201->163|202->164|202->164|204->166|207->169|207->169|208->170|210->172|210->172|214->176|214->176|215->177|216->178|216->178|218->180|220->182|220->182|221->183|221->183|222->184|223->185|223->185|224->186|224->186|227->189|227->189|228->190|231->193|231->193|232->194|236->198|236->198|240->202|240->202|241->203|242->204|242->204|243->205|244->206|244->206|245->207|246->208|246->208|248->210|249->211|249->211|249->211|249->211|249->211|249->211|249->211|250->212|252->214|252->214|253->215|253->215|255->217|256->218|256->218|257->219|258->220|258->220|258->220|262->224|262->224|263->225|263->225|263->225|264->226|267->229|267->229|270->232|270->232|271->233|273->235|273->235|274->236|274->236|275->237|275->237|275->237|276->238|276->238|276->238|277->239|278->240|278->240|279->241|279->241|280->242|280->242|283->245|283->245|285->247|285->247|286->248|287->249|287->249|288->250|290->252|290->252|292->254|293->255|293->255|294->256|295->257|295->257|296->258|296->258|296->258|297->259|298->260|298->260|298->260|300->262|300->262|301->263|301->263|301->263|301->263|301->263|302->264|302->264|304->266|304->266|305->267|305->267|305->267|306->268|309->271|309->271|311->273|311->273|312->274|313->275|313->275|314->276|314->276|315->277|316->278|316->278|317->279|317->279|318->280|318->280|318->280|319->281|320->282|320->282|321->283|321->283|324->286|324->286|326->288|326->288|327->289|328->290|328->290|329->291|331->293|331->293|332->294|333->295
                  -- GENERATED --
              */
          