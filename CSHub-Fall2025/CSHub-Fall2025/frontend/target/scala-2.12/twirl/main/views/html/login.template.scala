
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[play.data.Form[models.User],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: play.data.Form[models.User], siteKey: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.6*/import helper._

def /*4.6*/scripts/*4.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*4.17*/("""
        """),format.raw/*5.9*/("""<script type="text/javascript" src='"""),_display_(/*5.46*/routes/*5.52*/.Assets.at("javascripts/database_field_length.js")),format.raw/*5.102*/("""'></script>
        <script type="text/javascript" src='"""),_display_(/*6.46*/routes/*6.52*/.Assets.at("javascripts/field_validation_helper.js")),format.raw/*6.104*/("""'></script>
        <script type="text/javascript" src='"""),_display_(/*7.46*/routes/*7.52*/.Assets.at("javascripts/cshub_login.js")),format.raw/*7.92*/("""'></script>
    """)))};
Seq[Any](format.raw/*1.58*/("""
    """),format.raw/*3.1*/("""
    """),format.raw/*8.6*/("""

"""),_display_(/*10.2*/main("Login", scripts)/*10.24*/ {_display_(Seq[Any](format.raw/*10.26*/("""
    """),_display_(/*11.6*/helper/*11.12*/.form(routes.UserController.userLogin)/*11.50*/ {_display_(Seq[Any](format.raw/*11.52*/("""
        """),format.raw/*12.9*/("""<div class="container">
            <div class="row">
                <div class="col m6 s12 offset-m3" style="top: ">
                    <div class="card-panel z-depth-0">
                        <form class="form-signin" onsubmit="return checkFormValid();">
                        """),format.raw/*17.143*/("""
                        """),format.raw/*18.25*/("""<h3 class="form-signin-heading" align="center">Log in</h3>

                            <div class="row">
                                <div class="input-field col s12">
                                    <input type="email" name="email" id="email" class="validate"
                                    required="" autofocus="" value='"""),_display_(/*23.70*/userForm("email")/*23.87*/.value),format.raw/*23.93*/("""' onchange="checkValidEmail()">
                                    <label for="email">Email address</label>
                                    <span id="emailMsg" class="helper-text" data-error="" style="color: red"></span>
                                </div>
                            </div>
                            <div class="row">
                                <div class="input-field col s12">
                                    <input type="password" name="password" id="password" class="validate"
                                    required="" value='"""),_display_(/*31.57*/userForm("password")/*31.77*/.value),format.raw/*31.83*/("""'>
                                    <label for="password">Password</label>
                                </div>
                            </div>
"""),format.raw/*35.50*/("""
"""),format.raw/*36.44*/("""
"""),format.raw/*37.104*/("""
"""),format.raw/*38.72*/("""
"""),format.raw/*39.45*/("""
"""),format.raw/*40.39*/("""
                            """),format.raw/*41.29*/("""<div class="row">
                                """),_display_(/*42.34*/if(flash.contains("error"))/*42.61*/ {_display_(Seq[Any](format.raw/*42.63*/("""
                                    """),format.raw/*43.37*/("""<p class="center" style="color: red">"""),_display_(/*43.75*/flash/*43.80*/.get("error")),format.raw/*43.93*/("""</p>
                                """)))}),format.raw/*44.34*/("""
                                """),_display_(/*45.34*/if(flash.contains("showResendActivation") && flash.get("showResendActivation") == "true")/*45.123*/ {_display_(Seq[Any](format.raw/*45.125*/("""
                                    """),format.raw/*46.37*/("""<p class="center" style="margin-top: 10px;">
                                        Didn't receive the activation email?
                                        <a id="resendActivationLink" href="javascript:void(0);" onclick="resendActivationEmail('"""),_display_(/*48.130*/userForm("email")/*48.147*/.value),format.raw/*48.153*/("""')">
                                            Click here to resend.
                                        </a>
                                    </p>
                                """)))}),format.raw/*52.34*/("""

                                """),format.raw/*54.33*/("""<div class="g-recaptcha col s12" data-sitekey=""""),_display_(/*54.81*/siteKey),format.raw/*54.88*/(""""></div>
                            </div>
                            <div class="actions row center">
                                <button class="btn waves-effect waves-light blue darken-2" type="submit">
                                    Sign in <i class="material-icons right">exit_to_app</i></button>
                            </div>
                          <div class="row center">
                                <span>
                                    <a href='"""),_display_(/*62.47*/routes/*62.53*/.UserController.userForgotPasswordPage()),format.raw/*62.93*/("""'>Forgot password?</a>
                                </span>
                            </div>
                            <div class="row center">
                                <span>
                                    New User?
                                    <a href='"""),_display_(/*68.47*/routes/*68.53*/.UserController.userRegisterPage()),format.raw/*68.87*/("""'>Sign up</a>
                                </span>
                            </div>

                        </form>
                    </div>
                </div>
            </div>
        </div>
   """)))}),format.raw/*77.5*/("""

""")))}),format.raw/*79.2*/("""

"""),format.raw/*81.1*/("""<script>

        // Get the <span> element that closes the modal
        var span = document.getElementsByClassName("close")[0];

        // When the user clicks the button, open the modal
        btn.onclick = function () """),format.raw/*87.35*/("""{"""),format.raw/*87.36*/("""
            """),format.raw/*88.13*/("""modal.style.display = "block";
        """),format.raw/*89.9*/("""}"""),format.raw/*89.10*/("""

        """),format.raw/*91.9*/("""// When the user clicks on <span> (x), close the modal
        span.onclick = function () """),format.raw/*92.36*/("""{"""),format.raw/*92.37*/("""
            """),format.raw/*93.13*/("""modal.style.display = "none";
        """),format.raw/*94.9*/("""}"""),format.raw/*94.10*/("""

        """),format.raw/*96.9*/("""// When the user clicks anywhere outside of the modal, close it
        window.onclick = function (event) """),format.raw/*97.43*/("""{"""),format.raw/*97.44*/("""
            """),format.raw/*98.13*/("""if (event.target == modal) """),format.raw/*98.40*/("""{"""),format.raw/*98.41*/("""
                """),format.raw/*99.17*/("""modal.style.display = "none";
            """),format.raw/*100.13*/("""}"""),format.raw/*100.14*/("""
        """),format.raw/*101.9*/("""}"""),format.raw/*101.10*/("""

        """),format.raw/*103.9*/("""function resendActivationEmail(email) """),format.raw/*103.47*/("""{"""),format.raw/*103.48*/("""
            """),format.raw/*104.13*/("""$.get('"""),_display_(/*104.21*/routes/*104.27*/.UserController.resendActivationEmail()),format.raw/*104.66*/("""', """),format.raw/*104.69*/("""{"""),format.raw/*104.70*/(""" """),format.raw/*104.71*/("""email: email """),format.raw/*104.84*/("""}"""),format.raw/*104.85*/(""")
                    .done(function(data) """),format.raw/*105.42*/("""{"""),format.raw/*105.43*/("""
                        """),format.raw/*106.25*/("""alert(data);
                    """),format.raw/*107.21*/("""}"""),format.raw/*107.22*/(""")
                    .fail(function(xhr, status, error) """),format.raw/*108.56*/("""{"""),format.raw/*108.57*/("""
                        """),format.raw/*109.25*/("""alert("Error: " + xhr.responseText);
                    """),format.raw/*110.21*/("""}"""),format.raw/*110.22*/(""");
        """),format.raw/*111.9*/("""}"""),format.raw/*111.10*/("""
"""),format.raw/*112.1*/("""</script>
"""))
      }
    }
  }

  def render(userForm:play.data.Form[models.User],siteKey:String): play.twirl.api.HtmlFormat.Appendable = apply(userForm,siteKey)

  def f:((play.data.Form[models.User],String) => play.twirl.api.HtmlFormat.Appendable) = (userForm,siteKey) => apply(userForm,siteKey)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:33 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/login.scala.html
                  HASH: 539995047c6c04bd577436e3dcf22bb29523c291
                  MATRIX: 1139->1|1268->63|1296->85|1311->92|1391->96|1426->105|1489->142|1503->148|1574->198|1657->255|1671->261|1744->313|1827->370|1841->376|1901->416|1957->57|1988->79|2019->433|2048->436|2079->458|2119->460|2151->466|2166->472|2213->510|2253->512|2289->521|2603->924|2656->949|3021->1287|3047->1304|3074->1310|3675->1884|3704->1904|3731->1910|3911->2111|3940->2155|3970->2259|3999->2331|4028->2376|4057->2415|4114->2444|4192->2495|4228->2522|4268->2524|4333->2561|4398->2599|4412->2604|4446->2617|4515->2655|4576->2689|4675->2778|4716->2780|4781->2817|5060->3068|5087->3085|5115->3091|5336->3281|5398->3315|5473->3363|5501->3370|6011->3853|6026->3859|6087->3899|6396->4181|6411->4187|6466->4221|6706->4431|6739->4434|6768->4436|7020->4660|7049->4661|7090->4674|7156->4713|7185->4714|7222->4724|7340->4814|7369->4815|7410->4828|7475->4866|7504->4867|7541->4877|7675->4983|7704->4984|7745->4997|7800->5024|7829->5025|7874->5042|7945->5084|7975->5085|8012->5094|8042->5095|8080->5105|8147->5143|8177->5144|8219->5157|8255->5165|8271->5171|8332->5210|8364->5213|8394->5214|8424->5215|8466->5228|8496->5229|8568->5272|8598->5273|8652->5298|8714->5331|8744->5332|8830->5389|8860->5390|8914->5415|9000->5472|9030->5473|9069->5484|9099->5485|9128->5486
                  LINES: 35->1|38->2|40->4|40->4|42->4|43->5|43->5|43->5|43->5|44->6|44->6|44->6|45->7|45->7|45->7|47->1|48->3|49->8|51->10|51->10|51->10|52->11|52->11|52->11|52->11|53->12|58->17|59->18|64->23|64->23|64->23|72->31|72->31|72->31|76->35|77->36|78->37|79->38|80->39|81->40|82->41|83->42|83->42|83->42|84->43|84->43|84->43|84->43|85->44|86->45|86->45|86->45|87->46|89->48|89->48|89->48|93->52|95->54|95->54|95->54|103->62|103->62|103->62|109->68|109->68|109->68|118->77|120->79|122->81|128->87|128->87|129->88|130->89|130->89|132->91|133->92|133->92|134->93|135->94|135->94|137->96|138->97|138->97|139->98|139->98|139->98|140->99|141->100|141->100|142->101|142->101|144->103|144->103|144->103|145->104|145->104|145->104|145->104|145->104|145->104|145->104|145->104|145->104|146->105|146->105|147->106|148->107|148->107|149->108|149->108|150->109|151->110|151->110|152->111|152->111|153->112
                  -- GENERATED --
              */
          