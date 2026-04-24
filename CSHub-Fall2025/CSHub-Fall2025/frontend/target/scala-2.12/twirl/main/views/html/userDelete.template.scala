
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

object userDelete extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.3*/import helper._


Seq[Any](format.raw/*1.14*/("""
	"""),format.raw/*3.1*/("""
	"""),_display_(/*4.3*/main("Delete Account")/*4.25*/{_display_(Seq[Any](format.raw/*4.26*/("""
		"""),format.raw/*5.3*/("""<div class="container">
			<div class="row">
				<div class="col s12 m10 offset-m1">
					<div class="card-panel">
						<br><br><br>
						<h4 class="center">Are you sure you want to delete your account?</h4>
						<br><br>
						<form class="form-horizontal" action=""""),_display_(/*12.46*/routes/*12.52*/.UserController.userDelete()),format.raw/*12.80*/("""" method="POST">
							<div class="form-group center">
								<div class="col-md-6 col-md-offset-3">
									<button type="submit" class="btn waves-effect waves-light blue darken-2" style="padding-left: 28px; padding-right: 28px;">Yes</button> <a href="/" class="btn waves-effect waves-light red">Cancel</a>
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	""")))}))
      }
    }
  }

  def render(id:String): play.twirl.api.HtmlFormat.Appendable = apply(id)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (id) => apply(id)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:39 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/userDelete.scala.html
                  HASH: ec23eee4e5bff032072e1f4f07ace6ee28c37243
                  MATRIX: 1116->1|1201->16|1246->13|1274->32|1302->35|1332->57|1370->58|1399->61|1696->331|1711->337|1760->365
                  LINES: 35->1|38->2|41->1|42->3|43->4|43->4|43->4|44->5|51->12|51->12|51->12
                  -- GENERATED --
              */
          