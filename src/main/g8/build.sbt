organization := "$organization$"
name := "$name;format="Camel"$"
version := "$version$"

scalaVersion := "2.12.5"

libraryDependencies ++= Seq(
  "io.github.outwatch" %%% "outwatch" % "1.0.0-RC2",
  "org.scalatest" %%% "scalatest" % "3.0.5" % Test
)

enablePlugins(ScalaJSPlugin, ScalaJSBundlerPlugin)
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
requiresDOM in Test := true


scalacOptions ++=
  "-encoding" :: "UTF-8" ::
  "-unchecked" ::
  "-deprecation" ::
  "-explaintypes" ::
  "-feature" ::
  "-language:_" ::
  "-Xfuture" ::
  "-Xlint" ::
  "-Ypartial-unification" ::
  "-Yno-adapted-args" ::
  "-Ywarn-extra-implicit" ::
  "-Ywarn-infer-any" ::
  "-Ywarn-value-discard" ::
  "-Ywarn-nullary-override" ::
  "-Ywarn-nullary-unit" ::
  Nil
