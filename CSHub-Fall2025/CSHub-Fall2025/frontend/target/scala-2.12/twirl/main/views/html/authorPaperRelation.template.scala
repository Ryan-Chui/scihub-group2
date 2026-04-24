
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

object authorPaperRelation extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(relation:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.19*/("""
"""),_display_(/*3.2*/main("Relationship graph")/*3.28*/ {_display_(Seq[Any](format.raw/*3.30*/("""
    """),format.raw/*4.5*/("""<link href='"""),_display_(/*4.18*/routes/*4.24*/.Assets.at("stylesheets/quill.snow.css")),format.raw/*4.64*/("""'
    rel="stylesheet" />
    <script type="text/javascript" src='"""),_display_(/*6.42*/routes/*6.48*/.Assets.at("javascripts/plugins/quill.js")),format.raw/*6.90*/("""'></script>
    <script type="text/javascript" src='"""),_display_(/*7.42*/routes/*7.48*/.Assets.at("javascripts/plugins/d3.js")),format.raw/*7.87*/("""'></script>

    <title>Node Relationship Graph</title>
    <h4 class="center form-signin-heading" align="center">
        Author Paper Relation</h4>
    <style>
            .link """),format.raw/*13.19*/("""{"""),format.raw/*13.20*/("""
                """),format.raw/*14.17*/("""stroke: #000000;
                stroke-opacity: 1;
            """),format.raw/*16.13*/("""}"""),format.raw/*16.14*/("""


            """),format.raw/*19.13*/(""".nodetext """),format.raw/*19.23*/("""{"""),format.raw/*19.24*/("""
                """),format.raw/*20.17*/("""pointer-events: none;
                font: 10px sans-serif;
            """),format.raw/*22.13*/("""}"""),format.raw/*22.14*/("""

            """),format.raw/*24.13*/(""".nodeRect """),format.raw/*24.23*/("""{"""),format.raw/*24.24*/("""
                """),format.raw/*25.17*/("""fill: #9fa8da;
            """),format.raw/*26.13*/("""}"""),format.raw/*26.14*/("""

            """),format.raw/*28.13*/(""".nodeCircle """),format.raw/*28.25*/("""{"""),format.raw/*28.26*/("""
                """),format.raw/*29.17*/("""stroke: #ffffff;
                stroke-width: 1px;
            """),format.raw/*31.13*/("""}"""),format.raw/*31.14*/("""


            """),format.raw/*34.13*/("""image.circle """),format.raw/*34.26*/("""{"""),format.raw/*34.27*/("""
                """),format.raw/*35.17*/("""cursor: pointer;
            """),format.raw/*36.13*/("""}"""),format.raw/*36.14*/("""
    """),format.raw/*37.5*/("""</style>

    <div id="chart"></div>
    <script>
            var data = """),_display_(/*41.25*/Html(relation)),format.raw/*41.39*/(""";
            var w = 900,
                    h = 900,
                    radius = d3.scale.log().domain([0, 312000]).range(["10", "50"]);

            var color = d3.scale.category20();
            var vis = d3.select("body").append("svg")
                    .attr("width", w)
                    .attr("height", h);
            // svg repositioning
            $("svg").css("""),format.raw/*51.26*/("""{"""),format.raw/*51.27*/(""" """),format.raw/*51.28*/("""margin:'0 auto'"""),format.raw/*51.43*/("""}"""),format.raw/*51.44*/(""");

            vis.append("defs").append("marker")
                    .attr("id", "arrowhead")
                    .attr("refX", 17 + 3) /*must be smarter way to calculate shift*/
                    .attr("refY", 2)
                    .attr("markerWidth", 6)
                    .attr("markerHeight", 4)
                    .attr("orient", "auto")
                    .append("path")
                    .attr("d", "M 0,0 V 4 L6,2 Z"); //this is actual shape for arrowhead

            data.links.forEach(function(link, index, list) """),format.raw/*63.60*/("""{"""),format.raw/*63.61*/("""
                """),format.raw/*64.17*/("""if (typeof data.nodes[link.source] === 'undefined') """),format.raw/*64.69*/("""{"""),format.raw/*64.70*/("""
                    """),format.raw/*65.21*/("""console.log('undefined source', link);
                """),format.raw/*66.17*/("""}"""),format.raw/*66.18*/("""
                """),format.raw/*67.17*/("""if (typeof data.nodes[link.target] === 'undefined') """),format.raw/*67.69*/("""{"""),format.raw/*67.70*/("""
                    """),format.raw/*68.21*/("""console.log('undefined target', link);
                """),format.raw/*69.17*/("""}"""),format.raw/*69.18*/("""
            """),format.raw/*70.13*/("""}"""),format.raw/*70.14*/(""");
            var force = self.force = d3.layout.force()
                    .nodes(data.nodes)
                    .links(data.links)
                    .distance(40)
                    .charge(-400)
                    .size([w, h])
                    .start();



            var link = vis.selectAll("line.link")
                    .data(data.links)
                    .enter().append("svg:line")
                    .attr("class", function (d) """),format.raw/*84.49*/("""{"""),format.raw/*84.50*/("""
                        """),format.raw/*85.25*/("""return "link";
                    """),format.raw/*86.21*/("""}"""),format.raw/*86.22*/(""")
                    .attr("x1", function (d) """),format.raw/*87.46*/("""{"""),format.raw/*87.47*/("""
                        """),format.raw/*88.25*/("""return d.source.x;
                    """),format.raw/*89.21*/("""}"""),format.raw/*89.22*/(""")
                    .attr("y1", function (d) """),format.raw/*90.46*/("""{"""),format.raw/*90.47*/("""
                        """),format.raw/*91.25*/("""return d.source.y;
                    """),format.raw/*92.21*/("""}"""),format.raw/*92.22*/(""")
                    .attr("x2", function (d) """),format.raw/*93.46*/("""{"""),format.raw/*93.47*/("""
                        """),format.raw/*94.25*/("""return d.target.x;
                    """),format.raw/*95.21*/("""}"""),format.raw/*95.22*/(""")
                    .attr("y2", function (d) """),format.raw/*96.46*/("""{"""),format.raw/*96.47*/("""
                        """),format.raw/*97.25*/("""return d.target.y;
                    """),format.raw/*98.21*/("""}"""),format.raw/*98.22*/(""")
                    .attr("marker-end", function (d) """),format.raw/*99.54*/("""{"""),format.raw/*99.55*/("""
                        """),format.raw/*100.25*/("""if (d.value == 1) """),format.raw/*100.43*/("""{"""),format.raw/*100.44*/("""
                            """),format.raw/*101.29*/("""return "url(#arrowhead)"
                        """),format.raw/*102.25*/("""}"""),format.raw/*102.26*/(""" """),format.raw/*102.27*/("""else """),format.raw/*102.32*/("""{"""),format.raw/*102.33*/("""
                            """),format.raw/*103.29*/("""return " "
                        """),format.raw/*104.25*/("""}"""),format.raw/*104.26*/(""";
                    """),format.raw/*105.21*/("""}"""),format.raw/*105.22*/(""");


            // function openLink() """),format.raw/*108.36*/("""{"""),format.raw/*108.37*/("""
            """),format.raw/*109.13*/("""//     return function (d) """),format.raw/*109.40*/("""{"""),format.raw/*109.41*/("""
            """),format.raw/*110.13*/("""//         var url = "";
            //         if (d.slug != "") """),format.raw/*111.42*/("""{"""),format.raw/*111.43*/("""
            """),format.raw/*112.13*/("""//             url = d.slug
            //         """),format.raw/*113.24*/("""}"""),format.raw/*113.25*/(""" """),format.raw/*113.26*/("""//else if(d.type == 2) """),format.raw/*113.49*/("""{"""),format.raw/*113.50*/("""
            """),format.raw/*114.13*/("""//         //url = "clients/" + d.slug
            //         //"""),format.raw/*115.26*/("""}"""),format.raw/*115.27*/(""" """),format.raw/*115.28*/("""else if(d.type == 3) """),format.raw/*115.49*/("""{"""),format.raw/*115.50*/("""
            """),format.raw/*116.13*/("""//         //url = "agencies/" + d.slug
            //         //"""),format.raw/*117.26*/("""}"""),format.raw/*117.27*/("""
            """),format.raw/*118.13*/("""//         window.open("//" + url)
            //     """),format.raw/*119.20*/("""}"""),format.raw/*119.21*/("""
            """),format.raw/*120.13*/("""// """),format.raw/*120.16*/("""}"""),format.raw/*120.17*/("""url





            var node = vis.selectAll("g.node")
                    .data(data.nodes)
                    .enter().append("svg:g")
                    .attr("class", function (d) """),format.raw/*129.49*/("""{"""),format.raw/*129.50*/("""
                        """),format.raw/*130.25*/("""if (d.entity === "Paper") """),format.raw/*130.51*/("""{"""),format.raw/*130.52*/("""
                            """),format.raw/*131.29*/("""return "paper node";
                        """),format.raw/*132.25*/("""}"""),format.raw/*132.26*/(""" """),format.raw/*132.27*/("""else """),format.raw/*132.32*/("""{"""),format.raw/*132.33*/("""
                            """),format.raw/*133.29*/("""return "circle1 node";
                        """),format.raw/*134.25*/("""}"""),format.raw/*134.26*/("""
                    """),format.raw/*135.21*/("""}"""),format.raw/*135.22*/(""")
                    .call(force.drag);

            d3.selectAll(".paper").append("rect")
                    .data(data.nodes)
                    .attr("width", 20)
                    .attr("height", 20)
                    .attr("class", "nodeRect")


            d3.selectAll("rect").append("svg:title")
                    .text(function(d) """),format.raw/*146.39*/("""{"""),format.raw/*146.40*/(""" """),format.raw/*146.41*/("""return d.title; """),format.raw/*146.57*/("""}"""),format.raw/*146.58*/(""")



            d3.selectAll(".circle1").append("circle")
                    .data(data.links)
                    .attr("class","nodeCircle")
                    .attr("r", 15)
                    .style("fill", function(d) """),format.raw/*154.48*/("""{"""),format.raw/*154.49*/(""" """),format.raw/*154.50*/("""return color(d.value); """),format.raw/*154.73*/("""}"""),format.raw/*154.74*/(""")
                    .style("fill-opacity", 0.9)
                    .call(force.drag);
            d3.selectAll("circle").append("svg:title")
                    .text(function(d) """),format.raw/*158.39*/("""{"""),format.raw/*158.40*/(""" """),format.raw/*158.41*/("""return d.title; """),format.raw/*158.57*/("""}"""),format.raw/*158.58*/(""")

            // node.append("svg:image")
            //         .attr("class", "circle")
            //         .attr("xlink:href", function (d) """),format.raw/*162.57*/("""{"""),format.raw/*162.58*/("""
            """),format.raw/*163.13*/("""//             return d.img_href
            //         """),format.raw/*164.24*/("""}"""),format.raw/*164.25*/(""")
            //         .attr("x", "-16px")
            //         .attr("y", "-16px")
            //         .attr("width", "32px")
            //         .attr("height", "32px")
                  //  .on("click", openLink());

            node.append("svg:text")
                    .attr("class", "nodetext")
                    .attr("dx", 0)
                    .attr("dy", ".35em")
                    .attr("text-anchor", "middle")
                    .text(function (d) """),format.raw/*176.40*/("""{"""),format.raw/*176.41*/("""
                        """),format.raw/*177.25*/("""if (d.entity === "Paper") """),format.raw/*177.51*/("""{"""),format.raw/*177.52*/("""
                            """),format.raw/*178.29*/("""return ""
                        """),format.raw/*179.25*/("""}"""),format.raw/*179.26*/(""" """),format.raw/*179.27*/("""else """),format.raw/*179.32*/("""{"""),format.raw/*179.33*/("""
                            """),format.raw/*180.29*/("""return d.title.split(" ")[0].substring(0,5);
                        """),format.raw/*181.25*/("""}"""),format.raw/*181.26*/("""

                    """),format.raw/*183.21*/("""}"""),format.raw/*183.22*/(""");

            force.on("tick", function () """),format.raw/*185.42*/("""{"""),format.raw/*185.43*/("""
                """),format.raw/*186.17*/("""link.attr("x1", function (d) """),format.raw/*186.46*/("""{"""),format.raw/*186.47*/("""
                    """),format.raw/*187.21*/("""return d.source.x;
                """),format.raw/*188.17*/("""}"""),format.raw/*188.18*/(""")
                        .attr("y1", function (d) """),format.raw/*189.50*/("""{"""),format.raw/*189.51*/("""
                            """),format.raw/*190.29*/("""return d.source.y;
                        """),format.raw/*191.25*/("""}"""),format.raw/*191.26*/(""")
                        .attr("x2", function (d) """),format.raw/*192.50*/("""{"""),format.raw/*192.51*/("""
                            """),format.raw/*193.29*/("""return d.target.x;
                        """),format.raw/*194.25*/("""}"""),format.raw/*194.26*/(""")
                        .attr("y2", function (d) """),format.raw/*195.50*/("""{"""),format.raw/*195.51*/("""
                            """),format.raw/*196.29*/("""return d.target.y;
                        """),format.raw/*197.25*/("""}"""),format.raw/*197.26*/(""");

                node.attr("transform", function (d) """),format.raw/*199.53*/("""{"""),format.raw/*199.54*/("""
                    """),format.raw/*200.21*/("""return "translate(" + d.x + "," + d.y + ")";
                """),format.raw/*201.17*/("""}"""),format.raw/*201.18*/(""");
            """),format.raw/*202.13*/("""}"""),format.raw/*202.14*/(""");

    </script>
""")))}),format.raw/*205.2*/("""
"""))
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
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/authorPaperRelation.scala.html
                  HASH: 102e8ea06dee9ad5382c4b03e5af6ab70f176e0a
                  MATRIX: 1125->1|1215->20|1260->18|1287->37|1321->63|1360->65|1391->70|1430->83|1444->89|1504->129|1597->196|1611->202|1673->244|1752->297|1766->303|1825->342|2033->522|2062->523|2107->540|2199->604|2228->605|2271->620|2309->630|2338->631|2383->648|2484->721|2513->722|2555->736|2593->746|2622->747|2667->764|2722->791|2751->792|2793->806|2833->818|2862->819|2907->836|2999->900|3028->901|3071->916|3112->929|3141->930|3186->947|3243->976|3272->977|3304->982|3405->1056|3440->1070|3847->1449|3876->1450|3905->1451|3948->1466|3977->1467|4542->2004|4571->2005|4616->2022|4696->2074|4725->2075|4774->2096|4857->2151|4886->2152|4931->2169|5011->2221|5040->2222|5089->2243|5172->2298|5201->2299|5242->2312|5271->2313|5754->2768|5783->2769|5836->2794|5899->2829|5928->2830|6003->2877|6032->2878|6085->2903|6152->2942|6181->2943|6256->2990|6285->2991|6338->3016|6405->3055|6434->3056|6509->3103|6538->3104|6591->3129|6658->3168|6687->3169|6762->3216|6791->3217|6844->3242|6911->3281|6940->3282|7023->3337|7052->3338|7106->3363|7153->3381|7183->3382|7241->3411|7319->3460|7349->3461|7379->3462|7413->3467|7443->3468|7501->3497|7565->3532|7595->3533|7646->3555|7676->3556|7745->3596|7775->3597|7817->3610|7873->3637|7903->3638|7945->3651|8040->3717|8070->3718|8112->3731|8192->3782|8222->3783|8252->3784|8304->3807|8334->3808|8376->3821|8469->3885|8499->3886|8529->3887|8579->3908|8609->3909|8651->3922|8745->3987|8775->3988|8817->4001|8900->4055|8930->4056|8972->4069|9004->4072|9034->4073|9250->4260|9280->4261|9334->4286|9389->4312|9419->4313|9477->4342|9551->4387|9581->4388|9611->4389|9645->4394|9675->4395|9733->4424|9809->4471|9839->4472|9889->4493|9919->4494|10297->4843|10327->4844|10357->4845|10402->4861|10432->4862|10688->5089|10718->5090|10748->5091|10800->5114|10830->5115|11041->5297|11071->5298|11101->5299|11146->5315|11176->5316|11352->5463|11382->5464|11424->5477|11509->5533|11539->5534|12047->6013|12077->6014|12131->6039|12186->6065|12216->6066|12274->6095|12337->6129|12367->6130|12397->6131|12431->6136|12461->6137|12519->6166|12617->6235|12647->6236|12698->6258|12728->6259|12802->6304|12832->6305|12878->6322|12936->6351|12966->6352|13016->6373|13080->6408|13110->6409|13190->6460|13220->6461|13278->6490|13350->6533|13380->6534|13460->6585|13490->6586|13548->6615|13620->6658|13650->6659|13730->6710|13760->6711|13818->6740|13890->6783|13920->6784|14005->6840|14035->6841|14085->6862|14175->6923|14205->6924|14249->6939|14279->6940|14329->6959
                  LINES: 35->1|38->2|41->1|42->3|42->3|42->3|43->4|43->4|43->4|43->4|45->6|45->6|45->6|46->7|46->7|46->7|52->13|52->13|53->14|55->16|55->16|58->19|58->19|58->19|59->20|61->22|61->22|63->24|63->24|63->24|64->25|65->26|65->26|67->28|67->28|67->28|68->29|70->31|70->31|73->34|73->34|73->34|74->35|75->36|75->36|76->37|80->41|80->41|90->51|90->51|90->51|90->51|90->51|102->63|102->63|103->64|103->64|103->64|104->65|105->66|105->66|106->67|106->67|106->67|107->68|108->69|108->69|109->70|109->70|123->84|123->84|124->85|125->86|125->86|126->87|126->87|127->88|128->89|128->89|129->90|129->90|130->91|131->92|131->92|132->93|132->93|133->94|134->95|134->95|135->96|135->96|136->97|137->98|137->98|138->99|138->99|139->100|139->100|139->100|140->101|141->102|141->102|141->102|141->102|141->102|142->103|143->104|143->104|144->105|144->105|147->108|147->108|148->109|148->109|148->109|149->110|150->111|150->111|151->112|152->113|152->113|152->113|152->113|152->113|153->114|154->115|154->115|154->115|154->115|154->115|155->116|156->117|156->117|157->118|158->119|158->119|159->120|159->120|159->120|168->129|168->129|169->130|169->130|169->130|170->131|171->132|171->132|171->132|171->132|171->132|172->133|173->134|173->134|174->135|174->135|185->146|185->146|185->146|185->146|185->146|193->154|193->154|193->154|193->154|193->154|197->158|197->158|197->158|197->158|197->158|201->162|201->162|202->163|203->164|203->164|215->176|215->176|216->177|216->177|216->177|217->178|218->179|218->179|218->179|218->179|218->179|219->180|220->181|220->181|222->183|222->183|224->185|224->185|225->186|225->186|225->186|226->187|227->188|227->188|228->189|228->189|229->190|230->191|230->191|231->192|231->192|232->193|233->194|233->194|234->195|234->195|235->196|236->197|236->197|238->199|238->199|239->200|240->201|240->201|241->202|241->202|244->205
                  -- GENERATED --
              */
          