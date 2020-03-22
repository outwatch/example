package $name;format="camel"$

import org.scalatest._
import org.scalajs.dom._

abstract class JSDomSpec extends FlatSpec with Matchers with BeforeAndAfterEach {

  override def beforeEach(): Unit = {

    document.body.innerHTML = ""

    // prepare body with <div id="app"></div>
    val root = document.createElement("div")
    root.id = "app"
    document.body.appendChild(root)
    ()
  }
}
