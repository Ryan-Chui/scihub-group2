
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

object suggestionList extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template11[List[Suggestion],String,Long,Long,Integer,Integer,Integer,Integer,Integer,Integer,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(suggestionList: List[Suggestion], userEmail: String, userId: Long, pageNum: Long, offset: Integer,
        total: Integer,
        count: Integer, pageLimit: Integer, beginIndexForPagination: Integer, endIndexForPagination: Integer, sort:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*5.2*/import helper._

def /*6.2*/scripts/*6.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.13*/("""
    """),format.raw/*7.5*/("""<script type="text/javascript">
    </script>
""")))};
Seq[Any](format.raw/*3.123*/("""

"""),format.raw/*9.2*/("""

"""),_display_(/*11.2*/main("Suggestion List", scripts)/*11.34*/ {_display_(Seq[Any](format.raw/*11.36*/("""
    """),format.raw/*12.5*/("""<div class="container">
    """),_display_(/*13.6*/if(suggestionList == null || suggestionList.size() == 0)/*13.62*/ {_display_(Seq[Any](format.raw/*13.64*/("""
        """),format.raw/*14.9*/("""<div class="row">
            <div class="col s12">
                <div class="card-panel">
                    <h5 class="center">No Suggestions Have Been Registered Yet :)</h5>
                </div>
            </div>
        </div>
    """)))}/*21.7*/else/*21.12*/{_display_(Seq[Any](format.raw/*21.13*/("""
       """),format.raw/*22.8*/("""<div class="card-panel">
            """),_display_(/*23.14*/if(suggestionList.size() < 1)/*23.43*/ {_display_(Seq[Any](format.raw/*23.45*/("""
                """),format.raw/*24.17*/("""<h5 class="center">No suggestions has been registered for SMU-Lyle-Sci-Hub Appstore yet.</h5>
            """)))}/*25.15*/else/*25.20*/{_display_(Seq[Any](format.raw/*25.21*/("""
                """),format.raw/*26.17*/("""<div class="row card-panel z-depth-0 project-zone-panel">
                    <div class="col s12" style="margin-top: -10px;
                        margin-bottom: -10px;">
                        <h6 class="center tooltipped" data-position="bottom" data-tooltip="This list shows all suggestions." >
                            Suggestions Registered at SMU-Lyle-Sci-Hub
                        </h6>
                    </div>
                </div>
                <div class="row">
                    <div class="col s6">
                        <h6 class="left">Showing results: """),_display_(/*36.60*/{
                            offset + 1
                        }),format.raw/*38.26*/(""" """),format.raw/*38.27*/("""to """),_display_(/*38.31*/{
                            offset + count
                        }),format.raw/*40.26*/(""" """),format.raw/*40.27*/("""of """),_display_(/*40.31*/total),format.raw/*40.36*/("""</h6>
                    </div>

                    <div class="col s6" style="padding-top: -5px;
                        margin-top: -2px">
                        <a class='dropdown-trigger btn-flat right' href='#' data-target='dropdown11' style="text-transform: none;
                            font-weight: bold;
                            color: black;
                            font-family: AmazonEmberBold, Helvetica Neue Bold, Helvetica Neue, Helvetica, Arial, sans-serif;
                        !important; ">
                            Sort By &nbsp; <font color="#3a5dc3">
                            """),_display_(/*51.30*/if(sort.equals("date_created") || sort.equals("publish_time_stamp"))/*51.98*/ {_display_(Seq[Any](format.raw/*51.100*/("""
                                """),format.raw/*52.33*/("""Date Created
                            """)))}/*53.30*/else if(sort.equals("title"))/*53.59*/{_display_(Seq[Any](format.raw/*53.60*/("""
                        """),format.raw/*54.25*/("""Title
                        """)))}/*55.26*/else/*55.31*/{_display_(Seq[Any](format.raw/*55.32*/("""
                        """),format.raw/*56.25*/("""Reporter Name
                        """)))}),format.raw/*57.26*/("""</font><i class="material-icons right">expand_more</i></a>

                            <!-- Dropdown Structure -->
                        <ul id='dropdown11' class='dropdown-content'>

                            <li><a href=""""),_display_(/*62.43*/routes/*62.49*/.SuggestionController.suggestionList(1, "date_created")),format.raw/*62.104*/("""" class="grey-text text-darken-4"><i class="material-icons">
                                event</i>Date Created</a></li>
                            <li><a href=""""),_display_(/*64.43*/routes/*64.49*/.SuggestionController.suggestionList(1, "title")),format.raw/*64.97*/("""" class="grey-text text-darken-4"><i class="material-icons">
                                sort_by_alpha</i>Title </a></li>
                            <li><a href=""""),_display_(/*66.43*/routes/*66.49*/.SuggestionController.suggestionList(1, "reporter_name")),format.raw/*66.105*/("""" class="grey-text text-darken-4"><i class="material-icons">
                                star_rate</i>Reporter Name </a></li>

                        </ul>
                    </div>
                </div>
                """),format.raw/*72.120*/("""
                """),format.raw/*73.17*/("""<table class="striped centered responsive-table" id ="postsTable">
                    <thead>
                        <tr class="info">
                            <th>Id</th>
                            <th style = "cursor: pointer;">Title</th>
                            <th style = "cursor: pointer;">Reporter Name</th>
                            <th style = "cursor: pointer;">Reporter Organization</th>
                            <th style = "cursor: pointer;">Short Description</th>
                            <th style = "cursor: pointer;">Report Time</th>
                            <th style = "cursor: pointer;">Realize Time</th>
                            """),_display_(/*83.30*/if(session.get("level") == "admin")/*83.65*/ {_display_(Seq[Any](format.raw/*83.67*/("""
                                """),format.raw/*84.33*/("""<th style = "vertical-align: center;">Operation</th>
                            """)))}),format.raw/*85.30*/("""
                        """),format.raw/*86.25*/("""</tr>
                    </thead>
                    <tbody>

                    """),_display_(/*90.22*/for(suggestion <- suggestionList) yield /*90.55*/ {_display_(Seq[Any](format.raw/*90.57*/("""
                        """),format.raw/*91.25*/("""<tr>
                            <td>"""),_display_(/*92.34*/suggestion/*92.44*/.getId()),format.raw/*92.52*/("""</td>
                            """),_display_(/*93.30*/if(session.get("level") == "admin" || session.get("level") == "developer" || suggestion.getSuggestionReporter.getEmail().equals(userEmail))/*93.169*/ {_display_(Seq[Any](format.raw/*93.171*/("""
                                """),format.raw/*94.33*/("""<td style="word-wrap: break-word;"><a href = """"),_display_(/*94.80*/routes/*94.86*/.SuggestionController.suggestionDetail(suggestion.getId())),format.raw/*94.144*/("""">"""),_display_(/*94.147*/suggestion/*94.157*/.getTitle()),format.raw/*94.168*/("""</a></td>
                            """)))}/*95.31*/else/*95.36*/{_display_(Seq[Any](format.raw/*95.37*/("""
                                """),format.raw/*96.33*/("""<td style="word-wrap: break-word;">"""),_display_(/*96.69*/suggestion/*96.79*/.getTitle()),format.raw/*96.90*/("""</td>
                            """)))}),format.raw/*97.30*/("""
                            """),format.raw/*98.29*/("""<td style="word-wrap: break-word;">
                            """),_display_(/*99.30*/suggestion/*99.40*/.getSuggestionReporter.getUserName()),format.raw/*99.76*/("""
                            """),format.raw/*100.29*/("""</td>
                            <td style="word-wrap: break-word;">
                            """),_display_(/*102.30*/if(suggestion.getSuggestionReporter.getOrganization != "")/*102.88*/ {_display_(Seq[Any](format.raw/*102.90*/("""
                                """),_display_(/*103.34*/suggestion/*103.44*/.getSuggestionReporter.getOrganization()),format.raw/*103.84*/("""
                            """)))}/*104.31*/else/*104.36*/{_display_(Seq[Any](format.raw/*104.37*/("""
                                """),format.raw/*105.33*/("""-
                            """)))}),format.raw/*106.30*/("""
                            """),format.raw/*107.29*/("""</td>
                            <td style="word-wrap: break-word;">
                            """),_display_(/*109.30*/if(suggestion.getDescription != "")/*109.65*/ {_display_(Seq[Any](format.raw/*109.67*/("""
                                """),format.raw/*110.33*/("""<div class="tooltip"> """),_display_(/*110.56*/suggestion/*110.66*/.getTruncDescription()),format.raw/*110.88*/("""
                                    """),format.raw/*111.37*/("""<span class="tooltiptext"> """),_display_(/*111.65*/suggestion/*111.75*/.getDescription()),format.raw/*111.92*/("""</span>
                                </div>
                            """)))}/*113.31*/else/*113.36*/{_display_(Seq[Any](format.raw/*113.37*/("""
                                """),format.raw/*114.33*/("""-
                            """)))}),format.raw/*115.30*/("""
                            """),format.raw/*116.29*/("""</td>
                            <td>
                            """),_display_(/*118.30*/suggestion/*118.40*/.getCreateTime()),format.raw/*118.56*/("""
                            """),format.raw/*119.29*/("""</td>
                            <td>
                            """),_display_(/*121.30*/if(suggestion.getSolveTime != null && suggestion.getSolveTime != "")/*121.98*/ {_display_(Seq[Any](format.raw/*121.100*/("""
                                """),_display_(/*122.34*/suggestion/*122.44*/.getSolveTime()),format.raw/*122.59*/("""
                            """)))}/*123.31*/else/*123.36*/{_display_(Seq[Any](format.raw/*123.37*/("""
                                """),format.raw/*124.33*/("""-
                            """)))}),format.raw/*125.30*/("""
                            """),format.raw/*126.29*/("""</td>

                            <td>
                            """),_display_(/*129.30*/if(suggestion.getSuggestionReporter.getEmail().equals(userEmail))/*129.95*/ {_display_(Seq[Any](format.raw/*129.97*/("""
                                """),format.raw/*130.33*/("""<div class="input-group input-group-sm">
                                    """),_display_(/*131.38*/if(suggestion.getSolved() == 0)/*131.69*/ {_display_(Seq[Any](format.raw/*131.71*/("""
                                        """),format.raw/*132.41*/("""<span>
                                            <a class="btn waves-effect waves-light blue darken-2 modal-trigger" title="Delete" href="#warningModal2">Solved?</a>

                                                <!-- Inactive Warning Modal Structure -->
                                            <div id="warningModal2" class="modal">
                                                <div class="modal-content" style="text-align: left">
                                                    <h5 style="color: red">Warning</h5>
                                                    <p style="font-weight: bold">
                                                        Do you really want to mark this suggestion as solved: """),_display_(/*140.112*/suggestion/*140.122*/.getTitle),format.raw/*140.131*/(""" """),format.raw/*140.132*/("""?
                                                    </p>
                                                </div>
                                                <div class="modal-footer">
                                                    <a href="#!" class="modal-close waves-effect waves-green btn-flat">
                                                        Cancel</a>
                                                    <a href='"""),_display_(/*146.63*/routes/*146.69*/.SuggestionController.markAsSolved(suggestion.getId, userId)),format.raw/*146.129*/("""'
                                                    class="modal-close waves-effect waves-green btn-flat">Confirm</a>
                                                </div>
                                            </div>
                                        </span>
                                    """)))}),format.raw/*151.38*/("""
                                    """),format.raw/*152.37*/("""<span>
                                        <a class="btn waves-effect waves-light red modal-trigger" title="Delete" style="margin-top: 5px;" href="#warningModal">Delete</a>

                                            <!-- Inactive Warning Modal Structure -->
                                        <div id="warningModal" class="modal">
                                            <div class="modal-content" style="text-align: left">
                                                <h5 style="color: red">Warning</h5>
                                                <p style="font-weight: bold">
                                                    Do you really want to delete this suggestion: """),_display_(/*160.100*/suggestion/*160.110*/.getTitle),format.raw/*160.119*/(""" """),format.raw/*160.120*/("""?
                                                    Please note that after deletion, this  suggestion <span style="color: red">
                                                    CANNOT</span> be recovered.</p>
                                            </div>
                                            <div class="modal-footer">
                                                <a href="#!" class="modal-close waves-effect waves-green btn-flat">
                                                    Cancel</a>
                                                <a href='"""),_display_(/*167.59*/routes/*167.65*/.SuggestionController.suggestionDelete(suggestion.getId)),format.raw/*167.121*/("""'
                                                class="modal-close waves-effect waves-green btn-flat">Confirm</a>
                                            </div>
                                        </div>
                                    </span>
                                </div>
                            """)))}/*173.31*/else/*173.36*/{_display_(Seq[Any](format.raw/*173.37*/("""
                                """),format.raw/*174.33*/("""-
                            """)))}),format.raw/*175.30*/("""
                            """),format.raw/*176.29*/("""</td>
                                <!-- """),_display_(/*177.39*/if(session.get("level") == "admin")/*177.74*/ {_display_(Seq[Any](format.raw/*177.76*/(""" """),format.raw/*177.77*/("""-->
                                <!--
                            """)))}),format.raw/*179.30*/(""" """),format.raw/*179.31*/("""-->
                        </tr>
                    """)))}),format.raw/*181.22*/("""
                    """),format.raw/*182.21*/("""</tbody>
                </table>
            """)))}),format.raw/*184.14*/("""
            """),_display_(/*185.14*/if(suggestionList.size != 0)/*185.42*/ {_display_(Seq[Any](format.raw/*185.44*/("""
                """),format.raw/*186.17*/("""<div class="row">
                    <div class="col s12">
                        <ul class="pagination center-align">
                            """),_display_(/*189.30*/if(pageNum == 1)/*189.46*/ {_display_(Seq[Any](format.raw/*189.48*/("""
                                """),format.raw/*190.33*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    first_page</i></li>
                                <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    chevron_left</i></li>
                            """)))}/*194.31*/else/*194.36*/{_display_(Seq[Any](format.raw/*194.37*/("""
                                """),format.raw/*195.33*/("""<li class="waves-effect"><a href=""""),_display_(/*195.68*/routes/*195.74*/.SuggestionController.suggestionList(1, sort)),format.raw/*195.119*/(""""><i class="material-icons">
                                    first_page</i></a></li>
                                </li>
                                <li class="waves-effect"><a href=""""),_display_(/*198.68*/routes/*198.74*/.SuggestionController.suggestionList(pageNum - 1, sort)),format.raw/*198.129*/(""""><i class="material-icons">
                                    chevron_left</i></a></li>
                            """)))}),format.raw/*200.30*/("""
                            """),_display_(/*201.30*/if(beginIndexForPagination > 1)/*201.61*/ {_display_(Seq[Any](format.raw/*201.63*/("""
                                """),format.raw/*202.33*/("""<li class="waves-effect disabled" style="cursor: default;
                                    font-size: 20px;
                                    font-weight: bold">...</li>
                            """)))}),format.raw/*205.30*/("""
                            """),_display_(/*206.30*/for(i <- (beginIndexForPagination + 0) to (endIndexForPagination + 0)) yield /*206.100*/ {_display_(Seq[Any](format.raw/*206.102*/("""
                                """),format.raw/*207.33*/("""<li """),_display_(/*207.38*/if(pageNum == i)/*207.54*/ {_display_(Seq[Any](format.raw/*207.56*/("""
                                    """),format.raw/*208.37*/("""class="active"""")))}),format.raw/*208.52*/("""><a href=""""),_display_(/*208.63*/routes/*208.69*/.SuggestionController.suggestionList(i, sort)),format.raw/*208.114*/("""">"""),_display_(/*208.117*/i),format.raw/*208.118*/("""</a></li>
                            """)))}),format.raw/*209.30*/("""
                            """),_display_(/*210.30*/if(endIndexForPagination < ((total - 1) / pageLimit + 1))/*210.87*/ {_display_(Seq[Any](format.raw/*210.89*/("""
                                """),format.raw/*211.33*/("""<li class="waves-effect disabled" style="cursor: default;
                                    font-size: 20px;
                                    font-weight: bold">...</li>
                            """)))}),format.raw/*214.30*/("""
                            """),_display_(/*215.30*/if((offset + count) >= total)/*215.59*/ {_display_(Seq[Any](format.raw/*215.61*/("""
                                """),format.raw/*216.33*/("""<li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    chevron_right</i></li>
                                <li class="waves-effect disabled" style="color: #c3bfbf;"><i class="material-icons">
                                    last_page</i></li>
                            """)))}/*220.31*/else/*220.36*/{_display_(Seq[Any](format.raw/*220.37*/("""
                                """),format.raw/*221.33*/("""<li class="waves-effect"><a href=""""),_display_(/*221.68*/routes/*221.74*/.SuggestionController.suggestionList(pageNum + 1, sort)),format.raw/*221.129*/(""""><i class="material-icons">
                                    chevron_right</i></a></li>
                                <li class="waves-effect"><a href=""""),_display_(/*223.68*/routes/*223.74*/.SuggestionController.suggestionList((total - 1) / pageLimit + 1, sort)),format.raw/*223.145*/(""""><i class="material-icons">
                                    last_page</i></a></li>
                            """)))}),format.raw/*225.30*/("""
                        """),format.raw/*226.25*/("""</ul>
                    </div>
                </div>
            """)))}),format.raw/*229.14*/("""
        """),format.raw/*230.9*/("""</div>
    """)))}),format.raw/*231.6*/("""
    """),format.raw/*232.5*/("""</div>

""")))}),format.raw/*234.2*/("""
"""))
      }
    }
  }

  def render(suggestionList:List[Suggestion],userEmail:String,userId:Long,pageNum:Long,offset:Integer,total:Integer,count:Integer,pageLimit:Integer,beginIndexForPagination:Integer,endIndexForPagination:Integer,sort:String): play.twirl.api.HtmlFormat.Appendable = apply(suggestionList,userEmail,userId,pageNum,offset,total,count,pageLimit,beginIndexForPagination,endIndexForPagination,sort)

  def f:((List[Suggestion],String,Long,Long,Integer,Integer,Integer,Integer,Integer,Integer,String) => play.twirl.api.HtmlFormat.Appendable) = (suggestionList,userEmail,userId,pageNum,offset,total,count,pageLimit,beginIndexForPagination,endIndexForPagination,sort) => apply(suggestionList,userEmail,userId,pageNum,offset,total,count,pageLimit,beginIndexForPagination,endIndexForPagination,sort)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 24 12:50:36 CDT 2026
                  SOURCE: C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/app/views/suggestionList.scala.html
                  HASH: 84e72752ea35eef32b990105fe0d0c0c000f752b
                  MATRIX: 1203->1|1522->250|1550->267|1564->274|1644->278|1675->283|1762->247|1790->330|1819->333|1860->365|1900->367|1932->372|1987->401|2052->457|2092->459|2128->468|2388->711|2401->716|2440->717|2475->725|2540->763|2578->792|2618->794|2663->811|2789->919|2802->924|2841->925|2886->942|3498->1527|3585->1593|3614->1594|3645->1598|3736->1668|3765->1669|3796->1673|3822->1678|4470->2299|4547->2367|4588->2369|4649->2402|4710->2444|4748->2473|4787->2474|4840->2499|4890->2530|4903->2535|4942->2536|4995->2561|5065->2600|5321->2829|5336->2835|5413->2890|5606->3056|5621->3062|5690->3110|5885->3278|5900->3284|5978->3340|6234->3670|6279->3687|6981->4362|7025->4397|7065->4399|7126->4432|7239->4514|7292->4539|7404->4624|7453->4657|7493->4659|7546->4684|7611->4722|7630->4732|7659->4740|7721->4775|7870->4914|7911->4916|7972->4949|8046->4996|8061->5002|8141->5060|8172->5063|8192->5073|8225->5084|8283->5124|8296->5129|8335->5130|8396->5163|8459->5199|8478->5209|8510->5220|8576->5255|8633->5284|8725->5349|8744->5359|8801->5395|8859->5424|8986->5523|9054->5581|9095->5583|9157->5617|9177->5627|9239->5667|9289->5698|9303->5703|9343->5704|9405->5737|9468->5768|9526->5797|9653->5896|9698->5931|9739->5933|9801->5966|9852->5989|9872->5999|9916->6021|9982->6058|10038->6086|10058->6096|10097->6113|10193->6190|10207->6195|10247->6196|10309->6229|10372->6260|10430->6289|10526->6357|10546->6367|10584->6383|10642->6412|10738->6480|10816->6548|10858->6550|10920->6584|10940->6594|10977->6609|11027->6640|11041->6645|11081->6646|11143->6679|11206->6710|11264->6739|11361->6808|11436->6873|11477->6875|11539->6908|11645->6986|11686->7017|11727->7019|11797->7060|12550->7784|12571->7794|12603->7803|12634->7804|13100->8242|13116->8248|13199->8308|13542->8619|13608->8656|14337->9356|14358->9366|14390->9375|14421->9376|15022->9949|15038->9955|15117->10011|15463->10338|15477->10343|15517->10344|15579->10377|15642->10408|15700->10437|15772->10481|15817->10516|15858->10518|15888->10519|15990->10589|16020->10590|16107->10645|16157->10666|16236->10713|16278->10727|16316->10755|16357->10757|16403->10774|16581->10924|16607->10940|16648->10942|16710->10975|17075->11321|17089->11326|17129->11327|17191->11360|17254->11395|17270->11401|17338->11446|17560->11640|17576->11646|17654->11701|17806->11821|17864->11851|17905->11882|17946->11884|18008->11917|18244->12121|18302->12151|18390->12221|18432->12223|18494->12256|18527->12261|18553->12277|18594->12279|18660->12316|18707->12331|18746->12342|18762->12348|18830->12393|18862->12396|18886->12397|18957->12436|19015->12466|19082->12523|19123->12525|19185->12558|19421->12762|19479->12792|19518->12821|19559->12823|19621->12856|19986->13202|20000->13207|20040->13208|20102->13241|20165->13276|20181->13282|20259->13337|20446->13496|20462->13502|20556->13573|20705->13690|20759->13715|20860->13784|20897->13793|20940->13805|20973->13810|21013->13819
                  LINES: 35->1|40->5|42->6|42->6|44->6|45->7|48->3|50->9|52->11|52->11|52->11|53->12|54->13|54->13|54->13|55->14|62->21|62->21|62->21|63->22|64->23|64->23|64->23|65->24|66->25|66->25|66->25|67->26|77->36|79->38|79->38|79->38|81->40|81->40|81->40|81->40|92->51|92->51|92->51|93->52|94->53|94->53|94->53|95->54|96->55|96->55|96->55|97->56|98->57|103->62|103->62|103->62|105->64|105->64|105->64|107->66|107->66|107->66|113->72|114->73|124->83|124->83|124->83|125->84|126->85|127->86|131->90|131->90|131->90|132->91|133->92|133->92|133->92|134->93|134->93|134->93|135->94|135->94|135->94|135->94|135->94|135->94|135->94|136->95|136->95|136->95|137->96|137->96|137->96|137->96|138->97|139->98|140->99|140->99|140->99|141->100|143->102|143->102|143->102|144->103|144->103|144->103|145->104|145->104|145->104|146->105|147->106|148->107|150->109|150->109|150->109|151->110|151->110|151->110|151->110|152->111|152->111|152->111|152->111|154->113|154->113|154->113|155->114|156->115|157->116|159->118|159->118|159->118|160->119|162->121|162->121|162->121|163->122|163->122|163->122|164->123|164->123|164->123|165->124|166->125|167->126|170->129|170->129|170->129|171->130|172->131|172->131|172->131|173->132|181->140|181->140|181->140|181->140|187->146|187->146|187->146|192->151|193->152|201->160|201->160|201->160|201->160|208->167|208->167|208->167|214->173|214->173|214->173|215->174|216->175|217->176|218->177|218->177|218->177|218->177|220->179|220->179|222->181|223->182|225->184|226->185|226->185|226->185|227->186|230->189|230->189|230->189|231->190|235->194|235->194|235->194|236->195|236->195|236->195|236->195|239->198|239->198|239->198|241->200|242->201|242->201|242->201|243->202|246->205|247->206|247->206|247->206|248->207|248->207|248->207|248->207|249->208|249->208|249->208|249->208|249->208|249->208|249->208|250->209|251->210|251->210|251->210|252->211|255->214|256->215|256->215|256->215|257->216|261->220|261->220|261->220|262->221|262->221|262->221|262->221|264->223|264->223|264->223|266->225|267->226|270->229|271->230|272->231|273->232|275->234
                  -- GENERATED --
              */
          