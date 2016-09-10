package mfp.report

import akka.http.scaladsl.testkit.ScalatestRouteTest
import org.scalatest.{ FreeSpec, Matchers, WordSpec }
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.testkit.ScalatestRouteTest
import akka.http.scaladsl.server._
import Directives._
import akka.http.scaladsl.model.HttpHeader.ParsingResult.Ok
import io.github.yeghishe.ServiceTestBase

class ReportServiceSpec extends ServiceTestBase with Matchers with ScalatestRouteTest with ReportService {

  "The service" should {

    "return a status 200 for report request" in {
      Get("/mfp") ~> reportRoutes ~> check {
        status should be(StatusCodes.OK)
      }
    }
  }
}
