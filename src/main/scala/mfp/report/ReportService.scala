package mfp.report

import java.lang.management.ManagementFactory
import akka.http.scaladsl.server.Directives._
import io.github.yeghishe.{ BaseService, Status }
import scala.concurrent.duration._

trait ReportService extends BaseService {
  protected val reportRoutes = pathPrefix("mfp") {
    get {
      log.info("/mfp/report route has been hit")
      complete(Status(Duration(ManagementFactory.getRuntimeMXBean.getUptime, MILLISECONDS).toString()))
    }
  }
}
