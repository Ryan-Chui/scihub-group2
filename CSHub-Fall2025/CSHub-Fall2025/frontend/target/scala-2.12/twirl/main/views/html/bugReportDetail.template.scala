
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
/*1.2*/import org.apache.commons.lang3.StringUtils

object bugReportDetail extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[BugReport,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(bugReport: BugReport):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import helper._

def /*6.2*/scripts/*6.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.13*/("""
  """),format.raw/*7.3*/("""<script type="text/javascript">
  </script>
""")))};
Seq[Any](format.raw/*2.24*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*9.2*/("""

"""),_display_(/*11.2*/main("Bug Detail", scripts)/*11.29*/ {_display_(Seq[Any](format.raw/*11.31*/("""
  """),format.raw/*12.3*/("""<script type="text/javascript" src='"""),_display_(/*12.40*/routes/*12.46*/.Assets.at("javascripts/starrs.js")),format.raw/*12.81*/("""'></script>

  <div class="container">
    <div class="row">
      <div class="col s12">
        <div class="card-panel">
          <h4 class="center">"""),_display_(/*18.31*/bugReport/*18.40*/.getTitle),format.raw/*18.49*/("""</h4>

          <div class="row">
            <div class="col s12">
              <table class="striped responsive-table">
                <tbody>
                  <tr>
                    <th>Title</th>
                    <td name="tablefield" id="title" style="word-wrap: break-word;" contenteditable="false">"""),_display_(/*26.110*/bugReport/*26.119*/.getTitle),format.raw/*26.128*/("""</td>
                  </tr>
                  <tr>
                    <th>Reporter Name</th>
                    <td name="tablefield" id="name" style="word-wrap: break-word;" contenteditable="false">"""),_display_(/*30.109*/bugReport/*30.118*/.getReporter.getUserName),format.raw/*30.142*/("""</td>
                  </tr>
                  <tr>
                    <th>Reporter Email</th>
                    <td name="tablefield" id="email" style="word-wrap: break-word;" contenteditable="false">"""),_display_(/*34.110*/bugReport/*34.119*/.getReporter.getEmail),format.raw/*34.140*/("""</td>
                  </tr>
                  """),_display_(/*36.20*/if(bugReport.getReporter.getOrganization != null&&bugReport.getReporter.getOrganization != "")/*36.114*/ {_display_(Seq[Any](format.raw/*36.116*/("""
                    """),format.raw/*37.21*/("""<tr>
                      <th>Reporter Organization</th>
                      <td name="tablefield" id="organization" style=" word-wrap: break-word;" contenteditable="false">"""),_display_(/*39.120*/bugReport/*39.129*/.getReporter.getOrganization),format.raw/*39.157*/("""</td>
                    </tr>
                  """)))}),format.raw/*41.20*/("""
                  """),format.raw/*42.19*/("""<tr>
                    <th>Short Description</th>
                    <td name="tablefield" id="description" style="word-wrap: break-word;" contenteditable="false">"""),_display_(/*44.116*/bugReport/*44.125*/.getDescription),format.raw/*44.140*/("""</td>
                  </tr>
                  <tr>
                    <th>Long Description</th>
                    """),_display_(/*48.22*/if(bugReport.getLongDescription != "null" && bugReport.getLongDescription != "")/*48.102*/ {_display_(Seq[Any](format.raw/*48.104*/("""
                      """),format.raw/*49.23*/("""<td name="tablefield" id="longDescription" style="word-wrap: break-word;" contenteditable="false">"""),_display_(/*49.122*/bugReport/*49.131*/.getLongDescription),format.raw/*49.150*/("""</td>
                    """)))}/*50.23*/else/*50.28*/{_display_(Seq[Any](format.raw/*50.29*/("""
                      """),format.raw/*51.23*/("""<td name="tablefield" id="longDescription" style="word-wrap: break-word;" contenteditable="false">-</td>
                    """)))}),format.raw/*52.22*/("""
                  """),format.raw/*53.19*/("""</tr>
                  <tr>
                    <th>Report Time</th>
                    <td name="tablefield" id="createdTime" style="word-wrap: break-word;" contenteditable="false">"""),_display_(/*56.116*/bugReport/*56.125*/.getCreateTime),format.raw/*56.139*/("""</td>
                  </tr>
                  <tr>
                    <th>Reporter's Actions</th>
                    <td>
                      <a class="btn-floating waves-effect waves-light blue darken-2" title="Edit" href=""""),_display_(/*61.106*/routes/*61.112*/.BugReportController.bugReportEditPage(bugReport.getId)),format.raw/*61.167*/(""""><i class="material-icons">
                        edit</i></a>  &nbsp;
                      <a class="btn-floating waves-effect waves-light red modal-trigger" title="Delete" href="#warningModal"><i class="material-icons">
                        delete</i></a>



                        <!-- Inactive Warning Modal Structure -->
                      <div id="warningModal" class="modal">
                        <div class="modal-content">
                          <h5 style="color: red">Warning</h5>
                          <p style="font-weight: bold">
                            Do you really want to delete this bug report: """),_display_(/*73.76*/bugReport/*73.85*/.getTitle),format.raw/*73.94*/(""" """),format.raw/*73.95*/("""?
                            Please note that after deletion, this bug report<span style="color: red">
                            CANNOT</span> be recovered.</p>
                        </div>
                        <div class="modal-footer">
                          <a href="#!" class="modal-close waves-effect waves-green btn-flat">
                            Cancel</a>
                          <a href='"""),_display_(/*80.37*/routes/*80.43*/.BugReportController.bugReportDelete(bugReport.getId)),format.raw/*80.96*/("""'
                          class="modal-close waves-effect waves-green btn-flat">Confirm</a>
                        </div>
                      </div>
                    </td>
                  </tr>
                </tbody>
              </table>
            </div>
            <br>
            <div class="row col s12 center">
              <br/>


              <a href=""""),_display_(/*94.25*/routes/*94.31*/.BugReportController.bugReportList(1)),format.raw/*94.68*/("""" class="btn waves-effect waves-light blue darken-2">Bug Report List</a>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>

""")))}),format.raw/*102.2*/("""

"""),format.raw/*104.1*/("""<script>
        function editAPITable()
        """),format.raw/*106.9*/("""{"""),format.raw/*106.10*/("""
          """),format.raw/*107.11*/("""$("td[name=tablefield]").attr("contenteditable", "true");
          //document.getElementById("editSubmit").style.visibility = "visible";

        """),format.raw/*110.9*/("""}"""),format.raw/*110.10*/("""

        """),format.raw/*112.9*/("""function submitUpdate()"""),format.raw/*112.32*/("""{"""),format.raw/*112.33*/("""
          """),format.raw/*113.11*/("""var id = '"""),_display_(/*113.22*/bugReport/*113.31*/.getId),format.raw/*113.37*/("""';
          var title = document.getElementById("title").innerHTML;
          var email = document.getElementById("email").innerHTML;
          var name = document.getElementById("name").innerHTML;
          var organization = document.getElementById("organization").innerHTML;
          var description = document.getElementById("description").innerHTML;
          var longDescription = document.getElementById("longDescription").innerHTML;
          var createdTime = document.getElementById("createdTime").innerHTML;
          var obj = """),format.raw/*121.21*/("""{"""),format.raw/*121.22*/("""
            """),format.raw/*122.13*/("""id: id,
            title: title,
            email : email,
            name:name,
            orgnization:organization,
            description:description,
            longDescription:longDescription,
            createdTime:createdTime
          """),format.raw/*130.11*/("""}"""),format.raw/*130.12*/("""
          """),format.raw/*131.11*/("""console.log(JSON.stringify(obj));
          $.ajax("""),format.raw/*132.18*/("""{"""),format.raw/*132.19*/("""
            """),format.raw/*133.13*/("""url: "/bugUpdate",
            data: JSON.stringify(obj),
            headers: """),format.raw/*135.22*/("""{"""),format.raw/*135.23*/("""
              """),format.raw/*136.15*/("""'Content-Type': 'application/json'
            """),format.raw/*137.13*/("""}"""),format.raw/*137.14*/(""",
            type: "POST"
          """),format.raw/*139.11*/("""}"""),format.raw/*139.12*/(""").done(function(data) """),format.raw/*139.34*/("""{"""),format.raw/*139.35*/("""
            """),format.raw/*140.13*/("""console.log(data);
            if(data == false)"""),format.raw/*141.30*/("""{"""),format.raw/*141.31*/("""
              """),format.raw/*142.15*/("""$("#mainPage").hide();
              $("#updateSuccess").attr("class","alert alert-danger")
              """),format.raw/*144.105*/("""
              """),format.raw/*145.103*/("""
              """),format.raw/*146.35*/("""
              """),format.raw/*147.84*/("""

            """),format.raw/*149.13*/("""}"""),format.raw/*149.14*/("""else"""),format.raw/*149.18*/("""{"""),format.raw/*149.19*/("""
              """),format.raw/*150.15*/("""$("#mainPage").hide();
              $("#updateSuccess").attr("class","alert alert-info")

              """),format.raw/*153.99*/("""
              """),format.raw/*154.103*/("""
              """),format.raw/*155.35*/("""
              """),format.raw/*156.84*/("""
            """),format.raw/*157.13*/("""}"""),format.raw/*157.14*/("""
          """),format.raw/*158.11*/("""}"""),format.raw/*158.12*/(""");
        """),format.raw/*159.9*/("""}"""),format.raw/*159.10*/("""
"""),format.raw/*160.1*/("""</script>
"""))
      }
    }
  }

  def render(bugReport:BugReport): play.twirl.api.HtmlFormat.Appendable = apply(bugReport)

  def f:((BugReport) => play.twirl.api.HtmlFormat.Appendable) = (bugReport) => apply(bugReport)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:29 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/bugReportDetail.scala.html
                  HASH: 351a160233c3b115429c1759ad9e02d7c52241c7
                  MATRIX: 814->1|1175->46|1270->71|1298->89|1312->96|1392->100|1421->103|1505->68|1533->87|1560->148|1589->151|1625->178|1665->180|1695->183|1759->220|1774->226|1830->261|2009->413|2027->422|2057->431|2400->746|2419->755|2450->764|2682->968|2701->977|2747->1001|2981->1207|3000->1216|3043->1237|3119->1286|3223->1380|3264->1382|3313->1403|3518->1580|3537->1589|3587->1617|3669->1668|3716->1687|3911->1854|3930->1863|3967->1878|4114->1998|4204->2078|4245->2080|4296->2103|4423->2202|4442->2211|4483->2230|4529->2258|4542->2263|4581->2264|4632->2287|4789->2413|4836->2432|5049->2617|5068->2626|5104->2640|5363->2871|5379->2877|5456->2932|6122->3571|6140->3580|6170->3589|6199->3590|6641->4005|6656->4011|6730->4064|7136->4443|7151->4449|7209->4486|7399->4645|7429->4647|7506->4696|7536->4697|7576->4708|7751->4855|7781->4856|7819->4866|7871->4889|7901->4890|7941->4901|7980->4912|7999->4921|8027->4927|8597->5468|8627->5469|8669->5482|8948->5732|8978->5733|9018->5744|9098->5795|9128->5796|9170->5809|9278->5888|9308->5889|9352->5904|9428->5951|9458->5952|9524->5989|9554->5990|9605->6012|9635->6013|9677->6026|9754->6074|9784->6075|9828->6090|9964->6286|10009->6389|10053->6424|10097->6508|10140->6522|10170->6523|10203->6527|10233->6528|10277->6543|10411->6732|10456->6835|10500->6870|10544->6954|10586->6967|10616->6968|10656->6979|10686->6980|10725->6991|10755->6992|10784->6993
                  LINES: 31->1|36->2|39->4|41->6|41->6|43->6|44->7|47->2|49->5|50->9|52->11|52->11|52->11|53->12|53->12|53->12|53->12|59->18|59->18|59->18|67->26|67->26|67->26|71->30|71->30|71->30|75->34|75->34|75->34|77->36|77->36|77->36|78->37|80->39|80->39|80->39|82->41|83->42|85->44|85->44|85->44|89->48|89->48|89->48|90->49|90->49|90->49|90->49|91->50|91->50|91->50|92->51|93->52|94->53|97->56|97->56|97->56|102->61|102->61|102->61|114->73|114->73|114->73|114->73|121->80|121->80|121->80|135->94|135->94|135->94|143->102|145->104|147->106|147->106|148->107|151->110|151->110|153->112|153->112|153->112|154->113|154->113|154->113|154->113|162->121|162->121|163->122|171->130|171->130|172->131|173->132|173->132|174->133|176->135|176->135|177->136|178->137|178->137|180->139|180->139|180->139|180->139|181->140|182->141|182->141|183->142|185->144|186->145|187->146|188->147|190->149|190->149|190->149|190->149|191->150|194->153|195->154|196->155|197->156|198->157|198->157|199->158|199->158|200->159|200->159|201->160
                  -- GENERATED --
              */
          