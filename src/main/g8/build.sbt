enablePlugins(ScalaJSPlugin)

name := "$name;format="Camel"$"

version := "$version$"

organization := "$organization$"

scalaVersion := "2.12.1"

libraryDependencies ++= Seq(
  "io.github.outwatch" %%% "outwatch" % "0.7.1",
  "org.scalatest" %%% "scalatest" % "3.0.1" % Test
)
