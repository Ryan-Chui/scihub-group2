
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

object forgotPassword extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[play.data.Form[models.User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: play.data.Form[models.User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.41*/("""

"""),_display_(/*3.2*/main("Forgot password")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
    """),_display_(/*4.6*/helper/*4.12*/.form(routes.UserController.userResetPassword)/*4.58*/ {_display_(Seq[Any](format.raw/*4.60*/("""
        """),format.raw/*5.9*/("""<div class="container">
            <div class="row">
                <div class="col m6 s12 offset-m3" style="top: ">
                    <div class="card-panel z-depth-0">
                        <form class="form-forgot-password">
                        <h3 class="form-forgot-password-heading" align="center">Reset password</h3>
                            <div class="row">
                                <div class="input-field col s12">
                                    <input type="email" name="email" id="email" class="validate"
                                    required="" autofocus="" value='"""),_display_(/*14.70*/userForm("email")/*14.87*/.value),format.raw/*14.93*/("""'>
                                    <label for="email">Email address</label>
                                </div>
                            </div>
                            <div class="row">
                                """),_display_(/*19.34*/if(flash.contains("error"))/*19.61*/ {_display_(Seq[Any](format.raw/*19.63*/("""
                                    """),format.raw/*20.37*/("""<p class="center" style="color: red">"""),_display_(/*20.75*/flash/*20.80*/.get("error")),format.raw/*20.93*/("""</p>
                                """)))}),format.raw/*21.34*/("""
                            """),format.raw/*22.29*/("""</div>
                            <div class="actions row center">
                                <button class="btn waves-effect waves-light blue darken-2" type="submit">
                                    Reset password <i class="material-icons right">exit_to_app</i></button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
   """)))}),format.raw/*32.5*/("""

""")))}),format.raw/*34.2*/("""

"""),format.raw/*36.1*/("""<script>

        // Get the <span> element that closes the modal
        var span = document.getElementsByClassName("close")[0];

        // When the user clicks the button, open the modal
        btn.onclick = function () """),format.raw/*42.35*/("""{"""),format.raw/*42.36*/("""
            """),format.raw/*43.13*/("""modal.style.display = "block";
        """),format.raw/*44.9*/("""}"""),format.raw/*44.10*/("""

        """),format.raw/*46.9*/("""// When the user clicks on <span> (x), close the modal
        span.onclick = function () """),format.raw/*47.36*/("""{"""),format.raw/*47.37*/("""
            """),format.raw/*48.13*/("""modal.style.display = "none";
        """),format.raw/*49.9*/("""}"""),format.raw/*49.10*/("""

        """),format.raw/*51.9*/("""// When the user clicks anywhere outside of the modal, close it
        window.onclick = function (event) """),format.raw/*52.43*/("""{"""),format.raw/*52.44*/("""
            """),format.raw/*53.13*/("""if (event.target == modal) """),format.raw/*53.40*/("""{"""),format.raw/*53.41*/("""
                """),format.raw/*54.17*/("""modal.style.display = "none";
            """),format.raw/*55.13*/("""}"""),format.raw/*55.14*/("""
        """),format.raw/*56.9*/("""}"""),format.raw/*56.10*/("""
"""),format.raw/*57.1*/("""</script>
"""))
      }
    }
  }

  def render(userForm:play.data.Form[models.User]): play.twirl.api.HtmlFormat.Appendable = apply(userForm)

  def f:((play.data.Form[models.User]) => play.twirl.api.HtmlFormat.Appendable) = (userForm) => apply(userForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:31 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/forgotPassword.scala.html
                  HASH: b33cb525192452db66e1f8513acfadb89807b0bc
                  MATRIX: 1141->1|1275->40|1303->43|1334->66|1373->68|1404->74|1418->80|1472->126|1511->128|1546->137|2185->749|2211->766|2238->772|2498->1005|2534->1032|2574->1034|2639->1071|2704->1109|2718->1114|2752->1127|2821->1165|2878->1194|3345->1631|3378->1634|3407->1636|3659->1860|3688->1861|3729->1874|3795->1913|3824->1914|3861->1924|3979->2014|4008->2015|4049->2028|4114->2066|4143->2067|4180->2077|4314->2183|4343->2184|4384->2197|4439->2224|4468->2225|4513->2242|4583->2284|4612->2285|4648->2294|4677->2295|4705->2296
                  LINES: 35->1|40->1|42->3|42->3|42->3|43->4|43->4|43->4|43->4|44->5|53->14|53->14|53->14|58->19|58->19|58->19|59->20|59->20|59->20|59->20|60->21|61->22|71->32|73->34|75->36|81->42|81->42|82->43|83->44|83->44|85->46|86->47|86->47|87->48|88->49|88->49|90->51|91->52|91->52|92->53|92->53|92->53|93->54|94->55|94->55|95->56|95->56|96->57
                  -- GENERATED --
              */
          