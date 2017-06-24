enablePlugins(ScalaJSPlugin, ScalaJSBundlerPlugin)

name := "$name;format="Camel"$"

version := "$version$"

organization := "$organization$"

scalaVersion := "2.12.2"

requiresDOM in Test := true

libraryDependencies ++= Seq(
  "io.github.outwatch" %%% "outwatch" % "0.10.1",
  "org.scalatest" %%% "scalatest" % "3.0.1" % Test
)
