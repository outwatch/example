package webapp

import org.scalajs.dom._
import outwatch._
import outwatch.dsl._

import cats.effect.IO

class WebappSpec extends JSDomSpec {

  "You" should "probably add some tests" in {

    val message = "Hello World!"
    OutWatch.renderInto[IO]("#app", h1(message)).unsafeRunSync()

    document.body.innerHTML.contains(message) shouldBe true
  }
}
