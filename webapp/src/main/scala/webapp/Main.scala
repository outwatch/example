package webapp

import cats.effect.SyncIO
import colibri.Subject
import outwatch._
import outwatch.dsl._
import webapp.Main.StyledComponents.{basicButton, basicTextInput}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

// Outwatch documentation:
// https://outwatch.github.io/docs/readme.html

@js.native
@JSImport("../../../../src/main/css/index.css", JSImport.Namespace)
object Css         extends js.Object
//
@js.native
@JSImport("../../../../src/main/css/tailwind.css", JSImport.Namespace)
object TailwindCss extends js.Object

object Main {

  // keep these references even though IntelliJ thinks they're not used
  // noinspection ScalaUnusedExpression
  TailwindCss
  // noinspection ScalaUnusedExpression
  Css // load css
  def main(args: Array[String]): Unit =
    Outwatch.renderInto[SyncIO]("#app", app).unsafeRunSync()

  def app = div(
    cls := "p-24 flex flex-col gap-4 w-1/2",
    h1(cls := "text-3xl font-bold", "Hello World!"),
    counter,
    inputField,
  )

  def counter = SyncIO {
    // https://outwatch.github.io/docs/readme.html#example-counter
    val number = Subject.behavior(0)
    div(
      basicButton("+", onClick(number.map(_ + 1)) --> number)(cls := "mr-2.5"),
      number,
    )
  }

  def inputField = SyncIO {
    // https://outwatch.github.io/docs/readme.html#example-input-field
    val text = Subject.behavior("")
    div(
      cls := "flex flex-col gap-2",
      div(
        cls := "flex flex-row gap-2",
        basicTextInput(
          tpe         := "text",
          value <-- text,
          placeholder := "Enter something to see the subject change...",
          onInput.value --> text,
        ),
        basicButton("clear", onClick.as("") --> text),
      ),
      div("text: ", text),
      div("length: ", text.map(_.length)),
    )

  }

  object StyledComponents {

    val basicButton: VNode = button(
      cls :=
        """inline-block
          |px-6
          |py-2
          |border-2
          |border-gray-800
          |text-gray-800
          |font-medium
          |text-xs
          |leading-tight
          |uppercase
          |rounded
          |hover:bg-black
          |hover:bg-opacity-5
          |focus:outline-none focus:ring-0 transition duration-150 ease-in-out""".stripMargin,
    )

    val basicTextInput: VNode = input(
      cls :=
        """
          |form-control
          |block
          |w-full
          |px-3
          |py-1.5
          |text-base
          |font-normal
          |text-gray-700
          |bg-white bg-clip-padding
          |border border-solid border-gray-300
          |rounded
          |transition
          |ease-in-out
          |m-0
          |focus:text-gray-700 focus:bg-white focus:border-blue-600 focus:outline-none""".stripMargin,
    )

  }
}
