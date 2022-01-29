// This build is for this Giter8 template.
// To test the template run `g8` or `g8Test` from the sbt session.
// See http://www.foundweekends.org/giter8/testing.html#Using+the+Giter8Plugin for more details.
lazy val root = (project in file("."))
  .aggregate(scalaStewardUpdater)
  .enablePlugins(ScriptedPlugin)
  .settings(
    name := "outwatch",
    Test / Keys.test := {
      val _ = (Test / g8Test).toTask("").value
    },
    scriptedLaunchOpts ++= List("-Xms1024m", "-Xmx1024m", "-XX:ReservedCodeCacheSize=128m", "-Xss2m", "-Dfile.encoding=UTF-8"),
    resolvers += Resolver.url("typesafe", url("https://repo.typesafe.com/typesafe/ivy-releases/"))(Resolver.ivyStylePatterns)
  )

val versions = new {
  val outwatch          = "1.0.0-RC5"
  val funPack           = "0.1.4"
  val scalaTest         = "3.2.11"
  val macrotaskExecutor = "1.0.0"
}

lazy val scalaStewardUpdater = project
  .enablePlugins(ScalaJSPlugin)
  .disablePlugins(Giter8Plugin, Giter8TemplatePlugin)
  .settings(
    scalaVersion := "2.13.8",
    // replicate all dependencies here, so scala-steward can update them
    libraryDependencies              ++= Seq(
      "org.scala-js" %%% "scala-js-macrotask-executor" % versions.macrotaskExecutor,
      "io.github.outwatch" %%% "outwatch"      % versions.outwatch,
      "io.github.outwatch" %%% "outwatch-util" % versions.outwatch,
      "org.scalatest"      %%% "scalatest"     % versions.scalaTest % Test,
      ),
    )

