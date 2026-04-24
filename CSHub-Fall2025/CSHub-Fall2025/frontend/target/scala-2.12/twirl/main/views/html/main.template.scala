
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,Html,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, moreScripts: Html = Html(""))(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.62*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
<head>

<title>"""),_display_(/*8.9*/title),format.raw/*8.14*/("""</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet"
	href='"""),_display_(/*15.9*/routes/*15.15*/.Assets.at("stylesheets/materialize.css")),format.raw/*15.56*/("""'>

<link rel="stylesheet"
	href='"""),_display_(/*18.9*/routes/*18.15*/.Assets.at("stylesheets/custom.css")),format.raw/*18.51*/("""'>
<link rel="stylesheet" media="screen"
	href='"""),_display_(/*20.9*/routes/*20.15*/.Assets.at("stylesheets/main.css")),format.raw/*20.49*/("""'>
<link rel="shortcut icon" type="image/png"
	href='"""),_display_(/*22.9*/routes/*22.15*/.Assets.at("images/favicon.png")),format.raw/*22.47*/("""'>
<link href='"""),_display_(/*23.14*/routes/*23.20*/.Assets.at("stylesheets/style.css")),format.raw/*23.55*/("""'
	rel="stylesheet" />
<link rel="stylesheet"
	href='"""),_display_(/*26.9*/routes/*26.15*/.Assets.at("stylesheets/livefitler.css")),format.raw/*26.55*/("""'>
<link rel="stylesheet"
    href='"""),_display_(/*28.12*/routes/*28.18*/.Assets.at("stylesheets/custom_recommend.css")),format.raw/*28.64*/("""'>
<link rel="stylesheet" href='"""),_display_(/*29.31*/routes/*29.37*/.Assets.at("stylesheets/detail.css")),format.raw/*29.73*/("""'>
<link rel="stylesheet" href='"""),_display_(/*30.31*/routes/*30.37*/.Assets.at("stylesheets/chatbox-materialize.css")),format.raw/*30.86*/("""'>

<script type="text/javascript" src='"""),_display_(/*32.38*/routes/*32.44*/.Assets.at("javascripts/plugins/jquery-1.11.3.min.js")),format.raw/*32.98*/("""'></script>
<script type="text/javascript" src='"""),_display_(/*33.38*/routes/*33.44*/.Assets.at("javascripts/plugins/materialize.js")),format.raw/*33.92*/("""'></script>
<script type="text/javascript" src='"""),_display_(/*34.38*/routes/*34.44*/.Assets.at("javascripts/parameter.js")),format.raw/*34.82*/("""'></script>

<script type="text/javascript" src='"""),_display_(/*36.38*/routes/*36.44*/.Assets.at("javascripts/tablesort.js")),format.raw/*36.82*/("""'></script>
<script type="text/javascript" src='"""),_display_(/*37.38*/routes/*37.44*/.Assets.at("javascripts/forum.js")),format.raw/*37.78*/("""'></script>
	<script type="text/javascript" src='"""),_display_(/*38.39*/routes/*38.45*/.Assets.at("javascripts/plugins/d3.js")),format.raw/*38.84*/("""'></script>
<script type="text/javascript" src='"""),_display_(/*39.38*/routes/*39.44*/.Assets.at("javascripts/init.js")),format.raw/*39.77*/("""'></script>
	<script type="text/javascript" src="https://www.google.com/recaptcha/api.js"></script>

	<script type="text/javascript">
		$(document).ready(function() """),format.raw/*43.32*/("""{"""),format.raw/*43.33*/("""
			"""),format.raw/*44.4*/("""$.ajax("""),format.raw/*44.11*/("""{"""),format.raw/*44.12*/("""
				"""),format.raw/*45.5*/("""url: "/notification/checkRead",
				headers: """),format.raw/*46.14*/("""{"""),format.raw/*46.15*/("""
					"""),format.raw/*47.6*/("""'Content-Type': 'application/json'
				"""),format.raw/*48.5*/("""}"""),format.raw/*48.6*/(""",
				type: "GET"
			"""),format.raw/*50.4*/("""}"""),format.raw/*50.5*/(""").done(function(data) """),format.raw/*50.27*/("""{"""),format.raw/*50.28*/("""
				"""),format.raw/*51.5*/("""var readJson = JSON.parse(data);
				console.log(readJson);
				console.log(readJson.length);
				if (readJson.length > 0) """),format.raw/*54.30*/("""{"""),format.raw/*54.31*/("""
					"""),format.raw/*55.6*/("""$("#red-icon").show();
					$("#gray-icon").hide();
				"""),format.raw/*57.5*/("""}"""),format.raw/*57.6*/(""" """),format.raw/*57.7*/("""else """),format.raw/*57.12*/("""{"""),format.raw/*57.13*/("""
					"""),format.raw/*58.6*/("""$("#red-icon").hide();
					$("#gray-icon").show();
				"""),format.raw/*60.5*/("""}"""),format.raw/*60.6*/("""
			"""),format.raw/*61.4*/("""}"""),format.raw/*61.5*/(""");

			$.ajax("""),format.raw/*63.11*/("""{"""),format.raw/*63.12*/("""
				"""),format.raw/*64.5*/("""url: "/broadcastMessage/checkRead",
				headers: """),format.raw/*65.14*/("""{"""),format.raw/*65.15*/("""
					"""),format.raw/*66.6*/("""'Content-Type': 'application/json'
				"""),format.raw/*67.5*/("""}"""),format.raw/*67.6*/(""",
				type: "GET"
			"""),format.raw/*69.4*/("""}"""),format.raw/*69.5*/(""").done(function(data) """),format.raw/*69.27*/("""{"""),format.raw/*69.28*/("""
				"""),format.raw/*70.5*/("""var readJson = JSON.parse(data);
				console.log(readJson);
				console.log(readJson.length);
				if (readJson.length > 0) """),format.raw/*73.30*/("""{"""),format.raw/*73.31*/("""
					"""),format.raw/*74.6*/("""$("#red-icon").show();
					$("#gray-icon").hide();
				"""),format.raw/*76.5*/("""}"""),format.raw/*76.6*/(""" """),format.raw/*76.7*/("""else """),format.raw/*76.12*/("""{"""),format.raw/*76.13*/("""
					"""),format.raw/*77.6*/("""$("#red-icon").hide();
					$("#gray-icon").show();
				"""),format.raw/*79.5*/("""}"""),format.raw/*79.6*/("""
			"""),format.raw/*80.4*/("""}"""),format.raw/*80.5*/(""");

		"""),format.raw/*82.3*/("""}"""),format.raw/*82.4*/(""")
	</script>

"""),_display_(/*85.2*/moreScripts),format.raw/*85.13*/("""

"""),format.raw/*87.1*/("""</head>

<body style="display: flex; min-height: 100vh; flex-direction: column;">
	<header>	
		"""),_display_(/*91.4*/header()),format.raw/*91.12*/("""
	"""),format.raw/*92.2*/("""</header>

	<!-- <div class="container-fluid col-md-offset-1 col-md-10 col-sm-offset-1 col-sm-10 col-lg-offset-1 col-lg-10"> -->
	<main style="flex: 1 0 auto;">
		"""),_display_(/*96.4*/content),format.raw/*96.11*/("""
				"""),format.raw/*97.5*/("""<ul id="slide-chatbox" class="sidenav chatbox-body">
					<li class="grey darken-4 white-text"><div style="margin-left: 10px;"><i class="tiny material-icons green-text">brightness_1</i><span style="margin-left: 8px;">Public Chat</span><a href="#!" class="sidenav-close right white-text"><i class="tiny material-icons">close</i>&nbsp;</a></div></li>

					<li style="min-height: calc(100% - 100px);"><a class="subheader">
						<div class="chatbox_body">
						</div>
					</a></li>
					<li><a class="modal-fixed-footer white"><input class="chatbox_message" placeholder="Say Something Here" id="chatInputBox"></input></a></li>
				</ul>

		"""),format.raw/*107.28*/("""
			"""),format.raw/*108.134*/("""
				"""),format.raw/*109.49*/("""
			"""),format.raw/*110.12*/("""
		"""),format.raw/*111.13*/("""
	"""),format.raw/*112.2*/("""</main>

	

	

	<footer class="page-footer grey darken-4" style='background: url(""""),_display_(/*118.69*/routes/*118.75*/.Assets.at("images/starfield-banner-blue.jpg")),format.raw/*118.121*/("""") repeat;'>
	"""),_display_(/*119.3*/footer()),format.raw/*119.11*/("""
	"""),format.raw/*120.2*/("""</footer>

		<!-- <div class="chatbox__title">
			<h5><a href="#">Public Chat</a></h5>
			<button class="chatbox__title__tray">
				<span></span>
			</button>

		</div>
		<input class="chatbox__message" placeholder="Say Something Here" id="chatInputBox"></input> -->

	<script>
			(function ($) """),format.raw/*132.18*/("""{"""),format.raw/*132.19*/("""
				"""),format.raw/*133.5*/("""$(document).ready(function () """),format.raw/*133.35*/("""{"""),format.raw/*133.36*/("""
					"""),format.raw/*134.6*/("""var $messages = $(".chatbox_body"), $message = $("#chatInputBox");
					var connection = null;
					$.ajax("""),format.raw/*136.13*/("""{"""),format.raw/*136.14*/("""
						"""),format.raw/*137.7*/("""url: "/chatWsUrl",
						type: "GET",
						success: function (wsUrl) """),format.raw/*139.33*/("""{"""),format.raw/*139.34*/("""
							"""),format.raw/*140.8*/("""connection = new WebSocket(wsUrl);
							connection.onopen = function () """),format.raw/*141.40*/("""{"""),format.raw/*141.41*/("""
								"""),format.raw/*142.9*/("""$messages.prepend($("<div class='green-text' style='font-size: 0.75em'>Connected</div>"));
								$message.keypress(function (event) """),format.raw/*143.44*/("""{"""),format.raw/*143.45*/("""
									"""),format.raw/*144.10*/("""var keycode = (event.keyCode ? event.keyCode : event.which);
									if (keycode == '13') """),format.raw/*145.31*/("""{"""),format.raw/*145.32*/("""
										"""),format.raw/*146.11*/("""send();
									"""),format.raw/*147.10*/("""}"""),format.raw/*147.11*/("""
								"""),format.raw/*148.9*/("""}"""),format.raw/*148.10*/(""");
							"""),format.raw/*149.8*/("""}"""),format.raw/*149.9*/(""";
							connection.onerror = function (error) """),format.raw/*150.46*/("""{"""),format.raw/*150.47*/("""
								"""),format.raw/*151.9*/("""console.log('WebSocket Error ', error);
							"""),format.raw/*152.8*/("""}"""),format.raw/*152.9*/(""";
							connection.onmessage = function (event) """),format.raw/*153.48*/("""{"""),format.raw/*153.49*/("""
								"""),format.raw/*154.9*/("""$messages.append($("<div style='font-size: 1.0em'>" + event.data + "</div>"))
							"""),format.raw/*155.8*/("""}"""),format.raw/*155.9*/("""
						"""),format.raw/*156.7*/("""}"""),format.raw/*156.8*/("""
					"""),format.raw/*157.6*/("""}"""),format.raw/*157.7*/(""");

					function send(username, message) """),format.raw/*159.39*/("""{"""),format.raw/*159.40*/("""
						"""),format.raw/*160.7*/("""var text = $message.val().replace(/\n/, "");
						$message.val('');
						if (text === '')
							return;
						var who = """"),_display_(/*164.19*/session/*164.26*/.get("username")),format.raw/*164.42*/("""";
						who = who.length === 0 ? "Anonymous" : who;
						who = "<b>" + who +": </b>";
						connection.send(who + text);
					"""),format.raw/*168.6*/("""}"""),format.raw/*168.7*/("""


					"""),format.raw/*171.6*/("""// var $chatbox = $('.chatbox'),
					// 		$chatboxTitle = $('.chatbox__title'),
					// 		$chatboxTitleClose = $('.chatbox__title__close'),
					// 		$chatboxCredentials = $('.chatbox__credentials');
					// $chatboxTitle.on('click', function () """),format.raw/*175.47*/("""{"""),format.raw/*175.48*/("""
					"""),format.raw/*176.6*/("""// 	$chatbox.toggleClass('chatbox--tray');
					// """),format.raw/*177.9*/("""}"""),format.raw/*177.10*/(""");
					// $chatboxTitleClose.on('click', function (e) """),format.raw/*178.53*/("""{"""),format.raw/*178.54*/("""
					"""),format.raw/*179.6*/("""// 	e.stopPropagation();
					// 	$chatbox.addClass('chatbox--closed');
					// """),format.raw/*181.9*/("""}"""),format.raw/*181.10*/(""");
					// $chatbox.on('transitionend', function () """),format.raw/*182.50*/("""{"""),format.raw/*182.51*/("""
					"""),format.raw/*183.6*/("""// 	if ($chatbox.hasClass('chatbox--closed')) $chatbox.remove();
					// """),format.raw/*184.9*/("""}"""),format.raw/*184.10*/(""");
					// $chatbox.removeClass('chatbox--empty');
				"""),format.raw/*186.5*/("""}"""),format.raw/*186.6*/(""");
			"""),format.raw/*187.4*/("""}"""),format.raw/*187.5*/(""")(jQuery);

	</script>
</body>
</html>
"""))
      }
    }
  }

  def render(title:String,moreScripts:Html,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,moreScripts)(content)

  def f:((String,Html) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,moreScripts) => (content) => apply(title,moreScripts)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:33 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/main.scala.html
                  HASH: 246870540ce47c83953aae51639a46fb24346609
                  MATRIX: 1120->1|1275->61|1303->63|1368->103|1393->108|1694->383|1709->389|1771->430|1832->465|1847->471|1904->507|1979->556|1994->562|2049->596|2129->650|2144->656|2197->688|2240->704|2255->710|2311->745|2391->799|2406->805|2467->845|2531->882|2546->888|2613->934|2673->967|2688->973|2745->1009|2805->1042|2820->1048|2890->1097|2958->1138|2973->1144|3048->1198|3124->1247|3139->1253|3208->1301|3284->1350|3299->1356|3358->1394|3435->1444|3450->1450|3509->1488|3585->1537|3600->1543|3655->1577|3732->1627|3747->1633|3807->1672|3883->1721|3898->1727|3952->1760|4145->1925|4174->1926|4205->1930|4240->1937|4269->1938|4301->1943|4374->1988|4403->1989|4436->1995|4502->2034|4530->2035|4578->2056|4606->2057|4656->2079|4685->2080|4717->2085|4868->2208|4897->2209|4930->2215|5013->2271|5041->2272|5069->2273|5102->2278|5131->2279|5164->2285|5247->2341|5275->2342|5306->2346|5334->2347|5376->2361|5405->2362|5437->2367|5514->2416|5543->2417|5576->2423|5642->2462|5670->2463|5718->2484|5746->2485|5796->2507|5825->2508|5857->2513|6008->2636|6037->2637|6070->2643|6153->2699|6181->2700|6209->2701|6242->2706|6271->2707|6304->2713|6387->2769|6415->2770|6446->2774|6474->2775|6507->2781|6535->2782|6576->2797|6608->2808|6637->2810|6759->2906|6788->2914|6817->2916|7007->3080|7035->3087|7067->3092|7736->3757|7770->3891|7804->3940|7837->3952|7869->3965|7899->3967|8010->4050|8026->4056|8095->4102|8137->4117|8167->4125|8197->4127|8521->4422|8551->4423|8584->4428|8643->4458|8673->4459|8707->4465|8843->4572|8873->4573|8908->4580|9007->4650|9037->4651|9073->4659|9176->4733|9206->4734|9243->4743|9406->4877|9436->4878|9475->4888|9595->4979|9625->4980|9665->4991|9711->5008|9741->5009|9778->5018|9808->5019|9846->5029|9875->5030|9951->5077|9981->5078|10018->5087|10093->5134|10122->5135|10200->5184|10230->5185|10267->5194|10380->5279|10409->5280|10444->5287|10473->5288|10507->5294|10536->5295|10607->5337|10637->5338|10672->5345|10825->5470|10842->5477|10880->5493|11036->5621|11065->5622|11101->5630|11377->5877|11407->5878|11441->5884|11520->5935|11550->5936|11634->5991|11664->5992|11698->5998|11806->6078|11836->6079|11917->6131|11947->6132|11981->6138|12082->6211|12112->6212|12195->6267|12224->6268|12258->6274|12287->6275
                  LINES: 35->1|40->1|42->3|47->8|47->8|54->15|54->15|54->15|57->18|57->18|57->18|59->20|59->20|59->20|61->22|61->22|61->22|62->23|62->23|62->23|65->26|65->26|65->26|67->28|67->28|67->28|68->29|68->29|68->29|69->30|69->30|69->30|71->32|71->32|71->32|72->33|72->33|72->33|73->34|73->34|73->34|75->36|75->36|75->36|76->37|76->37|76->37|77->38|77->38|77->38|78->39|78->39|78->39|82->43|82->43|83->44|83->44|83->44|84->45|85->46|85->46|86->47|87->48|87->48|89->50|89->50|89->50|89->50|90->51|93->54|93->54|94->55|96->57|96->57|96->57|96->57|96->57|97->58|99->60|99->60|100->61|100->61|102->63|102->63|103->64|104->65|104->65|105->66|106->67|106->67|108->69|108->69|108->69|108->69|109->70|112->73|112->73|113->74|115->76|115->76|115->76|115->76|115->76|116->77|118->79|118->79|119->80|119->80|121->82|121->82|124->85|124->85|126->87|130->91|130->91|131->92|135->96|135->96|136->97|146->107|147->108|148->109|149->110|150->111|151->112|157->118|157->118|157->118|158->119|158->119|159->120|171->132|171->132|172->133|172->133|172->133|173->134|175->136|175->136|176->137|178->139|178->139|179->140|180->141|180->141|181->142|182->143|182->143|183->144|184->145|184->145|185->146|186->147|186->147|187->148|187->148|188->149|188->149|189->150|189->150|190->151|191->152|191->152|192->153|192->153|193->154|194->155|194->155|195->156|195->156|196->157|196->157|198->159|198->159|199->160|203->164|203->164|203->164|207->168|207->168|210->171|214->175|214->175|215->176|216->177|216->177|217->178|217->178|218->179|220->181|220->181|221->182|221->182|222->183|223->184|223->184|225->186|225->186|226->187|226->187
                  -- GENERATED --
              */
          