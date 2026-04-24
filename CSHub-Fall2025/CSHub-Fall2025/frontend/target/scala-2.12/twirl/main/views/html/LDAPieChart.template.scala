
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

object LDAPieChart extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(relation:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.6*/import helper._


Seq[Any](format.raw/*1.19*/("""
    """),format.raw/*3.1*/("""    """),_display_(/*3.6*/main("Relationship graph")/*3.32*/ {_display_(Seq[Any](format.raw/*3.34*/("""
        """),format.raw/*4.9*/("""<link href='"""),_display_(/*4.22*/routes/*4.28*/.Assets.at("stylesheets/quill.snow.css")),format.raw/*4.68*/("""'
        rel="stylesheet" />
        <script type="text/javascript" src='"""),_display_(/*6.46*/routes/*6.52*/.Assets.at("javascripts/plugins/quill.js")),format.raw/*6.94*/("""'></script>
        <script type="text/javascript" src='"""),_display_(/*7.46*/routes/*7.52*/.Assets.at("javascripts/plugins/d3.js")),format.raw/*7.91*/("""'></script>
        <div id='pie-chart'>

        </div>
        <script type="text/javascript" src='"""),_display_(/*11.46*/routes/*11.52*/.Assets.at("javascripts/plugins/d3-v3.js")),format.raw/*11.94*/("""'></script>

        <script src="//d3js.org/d3.v3.min.js" charset="utf-8"></script>
        <title>Node Relationship Graph</title>
        <h4 class="center form-signin-heading" align="center">
            Topic Distribution</h4>
        <style> #chart """),format.raw/*17.24*/("""{"""),format.raw/*17.25*/("""
            """),format.raw/*18.13*/("""height: 360px;
            /* NEW */
            position: relative;
            width: 360px;
            align:center;
        """),format.raw/*23.9*/("""}"""),format.raw/*23.10*/("""
        """),format.raw/*24.9*/(""".tooltip """),format.raw/*24.18*/("""{"""),format.raw/*24.19*/("""
            """),format.raw/*25.13*/("""background: #eee;
            box-shadow: 0 0 5px #999999;
            color: #333;
            display: none;
            font-size: 12px;
            left: 130px;
            padding: 10px;
            position: absolute;
            text-align: center;
            top: 95px;
            width: 180px;
            z-index: 10;
        """),format.raw/*37.9*/("""}"""),format.raw/*37.10*/("""
        """),format.raw/*38.9*/(""".legend"""),format.raw/*38.16*/("""{"""),format.raw/*38.17*/("""
            """),format.raw/*39.13*/("""height: 1060px;
            margin: 0 auto;
            /* NEW */
            position: relative;
            width: 1060px;
            font-size: 12px;
        """),format.raw/*45.9*/("""}"""),format.raw/*45.10*/("""
        """),format.raw/*46.9*/("""rect """),format.raw/*46.14*/("""{"""),format.raw/*46.15*/("""
            """),format.raw/*47.13*/("""cursor: pointer;
            /* NEW */
            stroke-width: 2;
        """),format.raw/*50.9*/("""}"""),format.raw/*50.10*/("""
        """),format.raw/*51.9*/("""rect.disabled """),format.raw/*51.23*/("""{"""),format.raw/*51.24*/("""
            """),format.raw/*52.13*/("""/* NEW */
            fill: transparent !important;
            /* NEW */
        """),format.raw/*55.9*/("""}"""),format.raw/*55.10*/("""
        """),format.raw/*56.9*/("""/* NEW */
        h1 """),format.raw/*57.12*/("""{"""),format.raw/*57.13*/("""
            """),format.raw/*58.13*/("""/* NEW */
            font-size: 14px;
            /* NEW */
            text-align: center;
            /* NEW */
        """),format.raw/*63.9*/("""}"""),format.raw/*63.10*/("""
        """),format.raw/*64.9*/(""".flex-container"""),format.raw/*64.24*/("""{"""),format.raw/*64.25*/("""
            """),format.raw/*65.13*/("""flex: 1;
        """),format.raw/*66.9*/("""}"""),format.raw/*66.10*/("""
        """),format.raw/*67.9*/("""main"""),format.raw/*67.13*/("""{"""),format.raw/*67.14*/("""
            """),format.raw/*68.13*/("""height:600px !important
        """),format.raw/*69.9*/("""}"""),format.raw/*69.10*/("""
        """),format.raw/*70.9*/("""</style>

        <div id="chart"></div>
        <div id="legend"></div>


        <script>


                var dataset = """),_display_(/*79.32*/Html(relation)),format.raw/*79.46*/(""";

                var width = 550;
                var height = 550;
                var radius = 400 / 2;
                var donutWidth = 75;
                var legendRectSize = 20;
                var legendSpacing = 4;

                var color = d3.scale.category20b();

                var svg = d3.select('#chart')
                        .append('svg')
                        .attr('width', 900)
                        .attr('height', height)
                        .append('g')
                        .attr('class','flex-container')
                        .attr('transform', 'translate(' + (width / 2) +
                                ',' + (height / 2) + ')');
                $("svg").css("""),format.raw/*98.30*/("""{"""),format.raw/*98.31*/("""top: 0, left: '90%', position: 'relative'"""),format.raw/*98.72*/("""}"""),format.raw/*98.73*/(""");

                var arc = d3.svg.arc()
                        .innerRadius(radius - donutWidth)
                        .outerRadius(radius);

                var pie = d3.layout.pie()
                        .value(function (d) """),format.raw/*105.45*/("""{"""),format.raw/*105.46*/("""
                            """),format.raw/*106.29*/("""return d.count;
                        """),format.raw/*107.25*/("""}"""),format.raw/*107.26*/(""")
                        .sort(null);

                var tooltip = d3.select('#chart')
                        .append('div')
                        .attr('class', 'tooltip');

                tooltip.append('div')
                        .attr('class', 'label');

                tooltip.append('div')
                        .attr('class', 'count');

                tooltip.append('div')
                        .attr('class', 'percent');

                //d3.csv('weekdays.csv', function (error, dataset) """),format.raw/*123.68*/("""{"""),format.raw/*123.69*/("""
                """),format.raw/*124.17*/("""dataset.forEach(function (d) """),format.raw/*124.46*/("""{"""),format.raw/*124.47*/("""
                    """),format.raw/*125.21*/("""d.count = +d.count;
                    d.enabled = true; // NEW
                """),format.raw/*127.17*/("""}"""),format.raw/*127.18*/(""");

                var path = svg.selectAll('path')
                        .data(pie(dataset))
                        .enter()
                        .append('path')
                        .attr('d', arc)
                        .attr('fill', function (d, i) """),format.raw/*134.55*/("""{"""),format.raw/*134.56*/("""
                            """),format.raw/*135.29*/("""return color(d.data.label);
                        """),format.raw/*136.25*/("""}"""),format.raw/*136.26*/(""") // UPDATED (removed semicolon)
                        .each(function (d) """),format.raw/*137.44*/("""{"""),format.raw/*137.45*/("""
                            """),format.raw/*138.29*/("""this._current = d;
                        """),format.raw/*139.25*/("""}"""),format.raw/*139.26*/("""); // NEW

                path.on('mouseover', function (d) """),format.raw/*141.51*/("""{"""),format.raw/*141.52*/("""
                    """),format.raw/*142.21*/("""var total = d3.sum(dataset.map(function (d) """),format.raw/*142.65*/("""{"""),format.raw/*142.66*/("""
                        """),format.raw/*143.25*/("""return (d.enabled) ? d.count : 0; // UPDATED
                    """),format.raw/*144.21*/("""}"""),format.raw/*144.22*/("""));
                    var percent = Math.round(1000 * d.data.count / total) / 10;
                    tooltip.select('.label').html(d.data.label);
                    tooltip.select('.count').html(d.data.count);
                    tooltip.select('.percent').html(percent + '%');
                    tooltip.style('display', 'block');
                """),format.raw/*150.17*/("""}"""),format.raw/*150.18*/(""");

                path.on('mouseout', function () """),format.raw/*152.49*/("""{"""),format.raw/*152.50*/("""
                    """),format.raw/*153.21*/("""tooltip.style('display', 'none');
                """),format.raw/*154.17*/("""}"""),format.raw/*154.18*/(""");

                /* OPTIONAL
              path.on('mousemove', function(d) """),format.raw/*157.48*/("""{"""),format.raw/*157.49*/("""
                """),format.raw/*158.17*/("""tooltip.style('top', (d3.event.pageY + 10) + 'px')
                  .style('left', (d3.event.pageX + 10) + 'px');
              """),format.raw/*160.15*/("""}"""),format.raw/*160.16*/(""");
              */

                var legend = svg.selectAll('.legend')
                        .data(color.domain())
                        .enter()
                        .append('g')
                        .attr('class', 'legend')
                        .attr('transform', function (d, i) """),format.raw/*168.60*/("""{"""),format.raw/*168.61*/("""
                            """),format.raw/*169.29*/("""var height = legendRectSize + legendSpacing;
                            var offset = height * color.domain().length / 2;
                            var horz = -2 * legendRectSize+250;
                            var vert = i * height - offset;
                            return 'translate(' + horz + ',' + vert + ')';
                        """),format.raw/*174.25*/("""}"""),format.raw/*174.26*/(""");

                legend.append('rect')
                        .attr('width', legendRectSize)
                        .attr('height', legendRectSize)
                        .style('fill', color)
                        .style('stroke', color) // UPDATED (removed semicolon)
                        .on('click', function (label) """),format.raw/*181.55*/("""{"""),format.raw/*181.56*/(""" """),format.raw/*181.57*/("""// NEW
                            var rect = d3.select(this); // NEW
                            var enabled = true; // NEW
                            var totalEnabled = d3.sum(dataset.map(function (d) """),format.raw/*184.80*/("""{"""),format.raw/*184.81*/(""" """),format.raw/*184.82*/("""// NEW
                                return (d.enabled) ? 1 : 0; // NEW
                            """),format.raw/*186.29*/("""}"""),format.raw/*186.30*/(""")); // NEW

                            if (rect.attr('class') === 'disabled') """),format.raw/*188.68*/("""{"""),format.raw/*188.69*/(""" """),format.raw/*188.70*/("""// NEW
                                rect.attr('class', ''); // NEW
                            """),format.raw/*190.29*/("""}"""),format.raw/*190.30*/(""" """),format.raw/*190.31*/("""else """),format.raw/*190.36*/("""{"""),format.raw/*190.37*/(""" """),format.raw/*190.38*/("""// NEW
                                if (totalEnabled < 2) return; // NEW
                                rect.attr('class', 'disabled'); // NEW
                                enabled = false; // NEW
                            """),format.raw/*194.29*/("""}"""),format.raw/*194.30*/(""" """),format.raw/*194.31*/("""// NEW

                            pie.value(function (d) """),format.raw/*196.52*/("""{"""),format.raw/*196.53*/(""" """),format.raw/*196.54*/("""// NEW
                                if (d.label === label) d.enabled = enabled; // NEW
                                return (d.enabled) ? d.count : 0; // NEW
                            """),format.raw/*199.29*/("""}"""),format.raw/*199.30*/("""); // NEW

                            path = path.data(pie(dataset)); // NEW

                            path.transition() // NEW
                                    .duration(750) // NEW
                                    .attrTween('d', function (d) """),format.raw/*205.66*/("""{"""),format.raw/*205.67*/(""" """),format.raw/*205.68*/("""// NEW
                                        var interpolate = d3.interpolate(this._current, d); // NEW
                                        this._current = interpolate(0); // NEW
                                        return function (t) """),format.raw/*208.61*/("""{"""),format.raw/*208.62*/(""" """),format.raw/*208.63*/("""// NEW
                                            return arc(interpolate(t)); // NEW
                                        """),format.raw/*210.41*/("""}"""),format.raw/*210.42*/("""; // NEW
                                    """),format.raw/*211.37*/("""}"""),format.raw/*211.38*/("""); // NEW
                        """),format.raw/*212.25*/("""}"""),format.raw/*212.26*/("""); // NEW

                legend.append('text')
                        .attr('x', legendRectSize + legendSpacing)
                        .attr('y', legendRectSize - legendSpacing)
                        .text(function (d) """),format.raw/*217.44*/("""{"""),format.raw/*217.45*/("""
                            """),format.raw/*218.29*/("""return d;
                        """),format.raw/*219.25*/("""}"""),format.raw/*219.26*/(""");





        </script>

        """),format.raw/*227.9*/("""}""")))}))
      }
    }
  }

  def render(relation:String): play.twirl.api.HtmlFormat.Appendable = apply(relation)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (relation) => apply(relation)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:33 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/LDAPieChart.scala.html
                  HASH: 9a914f96e46f03d2a51cc30a6fa0571ce9c80131
                  MATRIX: 1117->1|1207->24|1252->18|1283->40|1313->45|1347->71|1386->73|1421->82|1460->95|1474->101|1534->141|1635->216|1649->222|1711->264|1794->321|1808->327|1867->366|1996->468|2011->474|2074->516|2356->770|2385->771|2426->784|2582->913|2611->914|2647->923|2684->932|2713->933|2754->946|3119->1284|3148->1285|3184->1294|3219->1301|3248->1302|3289->1315|3478->1477|3507->1478|3543->1487|3576->1492|3605->1493|3646->1506|3749->1582|3778->1583|3814->1592|3856->1606|3885->1607|3926->1620|4035->1702|4064->1703|4100->1712|4149->1733|4178->1734|4219->1747|4369->1870|4398->1871|4434->1880|4477->1895|4506->1896|4547->1909|4591->1926|4620->1927|4656->1936|4688->1940|4717->1941|4758->1954|4817->1986|4846->1987|4882->1996|5034->2121|5069->2135|5806->2844|5835->2845|5904->2886|5933->2887|6196->3121|6226->3122|6284->3151|6353->3191|6383->3192|6926->3706|6956->3707|7002->3724|7060->3753|7090->3754|7140->3775|7250->3856|7280->3857|7573->4121|7603->4122|7661->4151|7742->4203|7772->4204|7877->4280|7907->4281|7965->4310|8037->4353|8067->4354|8157->4415|8187->4416|8237->4437|8310->4481|8340->4482|8394->4507|8488->4572|8518->4573|8900->4926|8930->4927|9011->4979|9041->4980|9091->5001|9170->5051|9200->5052|9308->5131|9338->5132|9384->5149|9542->5278|9572->5279|9900->5578|9930->5579|9988->5608|10362->5953|10392->5954|10753->6286|10783->6287|10813->6288|11046->6492|11076->6493|11106->6494|11237->6596|11267->6597|11375->6676|11405->6677|11435->6678|11562->6776|11592->6777|11622->6778|11656->6783|11686->6784|11716->6785|11976->7016|12006->7017|12036->7018|12124->7077|12154->7078|12184->7079|12404->7270|12434->7271|12718->7526|12748->7527|12778->7528|13052->7773|13082->7774|13112->7775|13267->7901|13297->7902|13371->7947|13401->7948|13464->7982|13494->7983|13749->8209|13779->8210|13837->8239|13900->8273|13930->8274|13993->8309
                  LINES: 35->1|38->2|41->1|42->3|42->3|42->3|42->3|43->4|43->4|43->4|43->4|45->6|45->6|45->6|46->7|46->7|46->7|50->11|50->11|50->11|56->17|56->17|57->18|62->23|62->23|63->24|63->24|63->24|64->25|76->37|76->37|77->38|77->38|77->38|78->39|84->45|84->45|85->46|85->46|85->46|86->47|89->50|89->50|90->51|90->51|90->51|91->52|94->55|94->55|95->56|96->57|96->57|97->58|102->63|102->63|103->64|103->64|103->64|104->65|105->66|105->66|106->67|106->67|106->67|107->68|108->69|108->69|109->70|118->79|118->79|137->98|137->98|137->98|137->98|144->105|144->105|145->106|146->107|146->107|162->123|162->123|163->124|163->124|163->124|164->125|166->127|166->127|173->134|173->134|174->135|175->136|175->136|176->137|176->137|177->138|178->139|178->139|180->141|180->141|181->142|181->142|181->142|182->143|183->144|183->144|189->150|189->150|191->152|191->152|192->153|193->154|193->154|196->157|196->157|197->158|199->160|199->160|207->168|207->168|208->169|213->174|213->174|220->181|220->181|220->181|223->184|223->184|223->184|225->186|225->186|227->188|227->188|227->188|229->190|229->190|229->190|229->190|229->190|229->190|233->194|233->194|233->194|235->196|235->196|235->196|238->199|238->199|244->205|244->205|244->205|247->208|247->208|247->208|249->210|249->210|250->211|250->211|251->212|251->212|256->217|256->217|257->218|258->219|258->219|266->227
                  -- GENERATED --
              */
          