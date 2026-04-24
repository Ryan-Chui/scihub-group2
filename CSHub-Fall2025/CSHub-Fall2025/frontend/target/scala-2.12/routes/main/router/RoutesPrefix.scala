
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ryan1/scihub-group2/CSHub-Fall2025/CSHub-Fall2025/frontend/conf/routes
// @DATE:Fri Apr 24 12:50:26 CDT 2026


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
