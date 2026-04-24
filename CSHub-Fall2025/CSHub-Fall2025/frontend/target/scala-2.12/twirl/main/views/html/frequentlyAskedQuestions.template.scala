
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

object frequentlyAskedQuestions extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*3.2*/main("Frequently Asked Questions")/*3.36*/ {_display_(Seq[Any](format.raw/*3.38*/("""
    """),format.raw/*4.5*/("""<div class="container">
        <div class="row">
            <div class="col s12">
                <div class="card-panel">
                    <h4 class="center">Frequently Asked Questions</h4>
                    <br>
                    <p>  <font size="4">This page provides answers to the following frequently asked questions in the SMU-Lyle-Sci-Hub Platform.</font> </p>
                    <ol list-style-type: circle>

                        <li><a href="#opennex">What is SMU-Lyle-Sci-Hub?</a></li>
                        <li><a href="#tutorial">How can I learn to use SMU-Lyle-Sci-Hub?</a></li>
                        <li><a href="#why-account">Why should I create an account at SMU-Lyle-Sci-Hub?</a></li>
                        <li><a href="#report-bug">How to report a bug I found?</a></li>
                        <li><a href="#make-suggestion">How to make a suggestion to SMU-Lyle-Sci-Hub?</a></li>
                        """),format.raw/*18.79*/("""
                    """),format.raw/*19.21*/("""</ol>



                    <h6 id="opennex">  <font size="4"><br>What is SMU-Lyle-Sci-Hub?</font></h6>
                    <p>  <font size="3">SMU Lyle Scientific Hub (SMU-Lyle-Sci-Hub) platform aims to support scientific/business collaboration, knowledge sharing and research between SMU and local industry in Dallas-Fort Worth Metropolitan Area.
                        Sci-Hub is powered by the most recent computer science techniques including machine learning/deep learning, artificial intelligence, text mining/information retrieval, knowledge graph, semantic web, natural language processing, cloud computing, and services computing techniques, In its first phase, we will focus on collaborations on computer science and related fields.</font></p>

                    <h6 id="tutorial">  <font size="4"><br>How can I learn to use SMU-Lyle-Sci-Hub?</font></h6>
                    <p>  <font size="3">The best and easiest way to learn to use SMU-Lyle-Sci-Hub is to start from the Video Tutorials under About menu (question mark),
                        which provides a collection of topic-focused video clips organized under categories. New video clips will be added with new features added.</font></p>

                    <h6 id="why-account">  <font size="4"><br>Why should I create an account at SMU-Lyle-Sci-Hub?</font></h6>
                    <p>  <font size="3">We provide customized views for registered users. As a registered user, you could manage your own space, follow your interested users/researchers, etc. We could also provide to you customized search results,
                        proactively push to you information you might be interested to know, etc. Without being a registered user, you can only view static SMU-Lyle-Sci-Hub information and study materials.</font></p>

                    <h6 id="report-bug">  <font size="4"><br>How to report a bug I found?</font></h6>
                    <p>  <font size="3">Under About menu (question mark), there is a menu item "Report a Bug." We will appreciate your reporting any issue that you might
                        encounter, and we will try our best to fix the issue as soon as possible. Status of your reported bug will be changed after we fix the problem.
                    </font></p>

                    <h6 id="make-suggestion">  <font size="4"><br>How to make a suggestion to SMU-Lyle-Sci-Hub?</font></h6>
                    <p>  <font size="3">Under About menu (question mark), there is a menu item "Add a Suggestion." If you would like any new feature/function of SMU-Lyle-Sci-Hub,
                        please use this form to let us know your requests. We will appreciate your letting us know any of your request since our sole goal is to satisfy our users'
                        requests. We will try our best to realize your suggestion as soon as possible. Status of your suggestion made will be changed after we achieve the goal.
                    </font></p>

                    """),format.raw/*50.34*/("""


                """),format.raw/*53.17*/("""</div>
            </div>
        </div>
    </div>
""")))}),format.raw/*57.2*/("""
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
                  DATE: Fri Apr 24 12:50:31 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/frequentlyAskedQuestions.scala.html
                  HASH: 92c726b505c47f9629292dc19dcb9424b42ff9c2
                  MATRIX: 814->1|1235->19|1277->53|1316->55|1347->60|2317->1056|2366->1077|5387->4564|5434->4583|5517->4636
                  LINES: 31->1|41->3|41->3|41->3|42->4|56->18|57->19|84->50|87->53|91->57
                  -- GENERATED --
              */
          