package mfp.login

import org.scalatest.FreeSpec

class LoginSpec extends FreeSpec {

  "A Set" - {
    "when empty" - {
      "should have size 0" in {
        assert(Set.empty.size == 0)
      }
    }
  }
}