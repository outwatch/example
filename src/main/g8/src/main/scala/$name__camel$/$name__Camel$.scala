package $name;format="camel"$

import outwatch._
import outwatch.dsl._

import cats.effect.IO

object $name;format="Camel"$ {

  def main(args: Array[String]): Unit = {

    OutWatch.renderInto[IO]("#app", h1("Hello World")).unsafeRunSync()
  }
}
