enablePlugins(ScalaJSPlugin, ScalaJSBundlerPlugin)

name := "$name;format="Camel"$"

version := "$version$"

organization := "$organization$"

scalaVersion := "2.12.3"

requiresDOM in Test := true

libraryDependencies ++= Seq(
  "io.github.outwatch" %%% "outwatch" % "0.10.2",
  "org.scalatest" %%% "scalatest" % "3.0.3" % Test
)
