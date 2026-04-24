// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/ryan1/CSHub-Fall2025/CSHub-Fall2025/backend/conf/routes
// @DATE:Fri Apr 10 13:06:00 CDT 2026


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
