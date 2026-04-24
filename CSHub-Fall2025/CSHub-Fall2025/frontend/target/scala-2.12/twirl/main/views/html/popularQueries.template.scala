
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

object popularQueries extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*3.2*/main("Popular Queries")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
    """),format.raw/*4.5*/("""<div class="container">
        <div class="row">
            <div class="col s12">
                <div class="card-panel">
                    <h4 class="center">Popular Queries</h4>
                    <br>
                    <p>  <font size="4">This page provides answers to the following frequently asked questions in the SMU-Sci-Hub Platform.</font> </p>
                    <ol list-style-type: circle>

                        <li><a href="#opennex">What is SMU-Sci-Hub?</a></li>
                        <li><a href="#opennex">Search challenges</a></li>
                        <li><a href="#opennex">Search researchers</a></li>
                        <li><a href="#opennex">Researcher interest change</a></li>
                        <li><a href="#opennex">Word cloud of researcher interest</a></li>

                    </ol>

                    <h3>This page is under development</h3>
                    <h6 id="opennex">  <font size="4"><br>What is SMU-Sci-Hub?</font></h6>
                    <p>  <font size="3">SMU Scientific Hub (SMU-Sci-Hub) platform aims to support scientific/business collaboration, knowledge sharing and research between SMU and local industry in Dallas-Fort Worth Metropolitan Area.
                        Sci-Hub is powered by the most recent computer science techniques including machine learning/deep learning, artificial intelligence, text mining/information retrieval, knowledge graph, semantic web, natural language processing, cloud computing, and services computing techniques, In its first phase, we will focus on collaborations on computer science and related fields.</font></p>

                </div>
            </div>
        </div>
    </div>
""")))}),format.raw/*30.2*/("""
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
                  DATE: Fri Apr 24 12:50:34 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/popularQueries.scala.html
                  HASH: 428219d141776bb8efc134e3e0e4dfba85bb409d
                  MATRIX: 814->1|1225->19|1256->42|1295->44|1326->49|3058->1751
                  LINES: 31->1|41->3|41->3|41->3|42->4|68->30
                  -- GENERATED --
              */
          