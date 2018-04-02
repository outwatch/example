package $name;format="camel"$

import outwatch.dom._
import outwatch.dom.dsl._
import monix.execution.Scheduler.Implicits.global

object $name;format="Camel"$ {
  def main(args: Array[String]): Unit = {

    OutWatch.renderInto("#app", h1("Hello World")).unsafeRunSync()
  }
}
