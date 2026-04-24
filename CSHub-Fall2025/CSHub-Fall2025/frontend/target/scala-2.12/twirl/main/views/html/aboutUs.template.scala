
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

object aboutUs extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("About Us")/*2.18*/ {_display_(Seq[Any](format.raw/*2.20*/("""

    """),format.raw/*4.5*/("""<div class="container">
        <div class="row">
            <div class="col s12">
                <div class="card-panel">
                    <h4 class="center">About Us</h4>
                    <div class="row">
                        <div class="col m8 s12 offset-l2">
                            <div class="row">


                                    <div class="col s12 card-panel">
                                        <div>
                                            <h6 class="center">Computer Science Team
                                                <span>
                                                    <h6>
                                                        <a href="https://lab.smudsi.org/" target="_blank" class="blue-text text-darken-2">(Data Science Infrastructure Lab Website)</a>
                                                    </h6>
                                                </span>
                                            </h6>
                                        </div>
                                        <div class="row">
                                            <div class="col s12 m10 offset-m1">
                                                <ul class="collection" id="currentContributors">
                                                    <li class="collection-item avatar">
                                                        <img src='"""),_display_(/*28.68*/routes/*28.74*/.Assets.at("images/users/github.png")),format.raw/*28.111*/("""' alt="Jia Zhang" class="circle">
                                                        <span class="title" style="font-weight: bold"><a href="https://s2.smu.edu/~jiazhang/" class="blue-text text-darken-2">Jia Zhang</a></span>
                                                        <p>
                                                            <small>Cruse C. and Marjorie F. Calahan Centennial Chair in Engineering, Professor, Department of Computer Science</small>
                                                        </p>
                                                    </li>
                                                    <li class="collection-item avatar">
                                                        <img src='"""),_display_(/*35.68*/routes/*35.74*/.Assets.at("images/users/github.png")),format.raw/*35.111*/("""' alt="Nahed Abdelgaber" class="circle">
                                                        <span class="title" style="font-weight: bold">Nahed Abdelgaber</span>
                                                        <p>
                                                            <small>Ph.D. student</small>
                                                        </p>
                                                    </li>

                                                    <li class="collection-item avatar">
                                                        <img src='"""),_display_(/*43.68*/routes/*43.74*/.Assets.at("images/users/github.jpg")),format.raw/*43.111*/("""' alt="Chang Liu" class="circle">
                                                        <span class="title" style="font-weight: bold">Chang Liu</span>
                                                        <p>
                                                            <small>Ph.D. student</small>
                                                        </p>
                                                    </li>
                                                    <li class="collection-item avatar">
                                                        <img src='"""),_display_(/*50.68*/routes/*50.74*/.Assets.at("images/users/github.JPG")),format.raw/*50.111*/("""' alt="Yuxuan Sun" class="circle">
                                                        <span class="title" style="font-weight: bold">Yuxuan Sun</span>
                                                        <p>
                                                            <small>Ph.D. student</small>
                                                        </p>
                                                    </li>

                                                    <li class="collection-item avatar">
                                                        <img src='"""),_display_(/*58.68*/routes/*58.74*/.Assets.at("images/users/github.jpg")),format.raw/*58.111*/("""' alt="Ali Haqqani" class="circle">
                                                        <span class="title" style="font-weight: bold">Ali Haqqani</span>
                                                        <p>
                                                            <small>M.S. student</small>
                                                        </p>
                                                    </li>


                                                    <li class="collection-item avatar">
                                                        <img src='"""),_display_(/*67.68*/routes/*67.74*/.Assets.at("images/users/github.jpeg")),format.raw/*67.112*/("""' alt="Weizheng Xie" class="circle">
                                                        <span class="title" style="font-weight: bold">Weizheng Xie</span>
                                                        <p>
                                                            <small>M.S. student</small>
                                                        </p>
                                                    </li>
                                                </ul>
                                            </div>
                                        </div>
                                    </div>




                                <div class="col s12 card-panel">
                                        <div>
                                            <h6 class="center">CS Industry Advisory Board
                                                <span>
                                                </span>
                                            </h6>
                                        </div>
                                        <div class="row">
                                            <div class="col s12 m10 offset-m1">
                                                <ul class="collection" id="currentContributors">
                                                    <li class="collection-item avatar">
                                                        <img src='"""),_display_(/*92.68*/routes/*92.74*/.Assets.at("images/users/github.jpeg")),format.raw/*92.112*/("""' alt="Andrew Dickerson" class="circle">
                                                        <div class="title" style="margin-left:20px; padding-top:13px; font-weight: bold">Andrew Dickerson</div>
                                                    </li>

                                                </ul>
                                            </div>
                                        </div>
                                    </div>

                                <div class="col s12 card-panel">
                                    <div>
                                        <h6 class="center">Alumni
                                            <span>
                                            </span>
                                        </h6>
                                    </div>
                                    <div class="row">
                                        <div class="col s12 m10 offset-m1">
                                            <ul class="collection" id="currentContributors">
                                                <li class="collection-item avatar">
                                                    <img src='"""),_display_(/*112.64*/routes/*112.70*/.Assets.at("images/users/github.jpeg")),format.raw/*112.108*/("""' alt="Xihao Xie" class="circle">
                                                    <div class="title" style="margin-left:20px; padding-top:13px; font-weight: bold">Dr. Xihao Xie</div>
                                                </li>
                                                <li class="collection-item avatar">
                                                    <img src='"""),_display_(/*116.64*/routes/*116.70*/.Assets.at("images/users/github.png")),format.raw/*116.107*/("""' alt="Beichen Hu" class="circle">
                                                    <div class="title" style="margin-left:20px; padding-top:13px; font-weight: bold">Dr. Beichen Hu</div>
                                                </li>
                                                <li class="collection-item avatar">
                                                    <img src='"""),_display_(/*120.64*/routes/*120.70*/.Assets.at("images/users/github.jpeg")),format.raw/*120.108*/("""' alt="Junhao Shen" class="circle">
                                                    <div class="title" style="margin-left:20px; padding-top:13px; font-weight: bold">Dr. Junhao Shen</div>
                                                </li>
                                                <li class="collection-item avatar">
                                                    <img src='"""),_display_(/*124.64*/routes/*124.70*/.Assets.at("images/users/github.png")),format.raw/*124.107*/("""' alt="Qiuyu Luo" class="circle">
                                                    <div class="title" style="margin-left:20px; padding-top:13px; font-weight: bold">Qiuyu Luo</div>
                                                    <p class="title" style="margin-left:20px; font-weight: bold">
                                                        <small>M.S. student</small>
                                                    </p>
                                                </li>

                                                    </p>
                                                </li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>

                                """),format.raw/*142.41*/("""

                        """),format.raw/*144.25*/("""</div>
                    </div>
                </div>
            </div>
        </div>
    </div>
""")))}),format.raw/*150.2*/("""
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
                  DATE: Fri Apr 24 12:50:27 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/aboutUs.scala.html
                  HASH: e10c3e6371044616d0c9efed4de3fc2bf936e37b
                  MATRIX: 814->1|1218->18|1242->34|1281->36|1313->42|2760->1462|2775->1468|2834->1505|3607->2251|3622->2257|3681->2294|4299->2885|4314->2891|4373->2928|4976->3504|4991->3510|5050->3547|5656->4126|5671->4132|5730->4169|6338->4750|6353->4756|6413->4794|7864->6218|7879->6224|7939->6262|9158->7453|9174->7459|9235->7497|9651->7885|9667->7891|9727->7928|10145->8318|10161->8324|10222->8362|10642->8754|10658->8760|10718->8797|11563->9910|11618->9936|11752->10039
                  LINES: 31->1|41->2|41->2|41->2|43->4|67->28|67->28|67->28|74->35|74->35|74->35|82->43|82->43|82->43|89->50|89->50|89->50|97->58|97->58|97->58|106->67|106->67|106->67|131->92|131->92|131->92|151->112|151->112|151->112|155->116|155->116|155->116|159->120|159->120|159->120|163->124|163->124|163->124|177->142|179->144|185->150
                  -- GENERATED --
              */
          