//organization := "$organization$"
//name := "$name;format="Camel"$"
//version := "$version$"

scalaVersion := "2.13.6"

resolvers += "jitpack" at "https://jitpack.io"
libraryDependencies ++= Seq(
  "io.github.outwatch" %%% "outwatch-util" % "1.0.0-RC4",
  "org.scalatest" %%% "scalatest" % "3.2.9" % Test
)

enablePlugins(ScalaJSBundlerPlugin)
useYarn := true // makes scalajs-bundler use yarn instead of npm
Test / requireJsDomEnv := true
scalaJSUseMainModuleInitializer := true
scalaJSLinkerConfig ~= (_.withModuleKind(ModuleKind.CommonJSModule)) // configure Scala.js to emit a JavaScript module instead of a top-level script


// hot reloading configuration:
// https://github.com/scalacenter/scalajs-bundler/issues/180
addCommandAlias("dev", "; compile; fastOptJS::startWebpackDevServer; devwatch; fastOptJS::stopWebpackDevServer")
addCommandAlias("devwatch", "~; fastOptJS; copyFastOptJS")

webpack / version := "4.46.0"
startWebpackDevServer / version := "3.11.2"
webpackDevServerExtraArgs := Seq("--color")
webpackDevServerPort := 8080
fastOptJS / webpackConfigFile := Some(baseDirectory.value / "webpack.config.dev.js")
fastOptJS / webpackBundlingMode := BundlingMode.LibraryOnly() // https://scalacenter.github.io/scalajs-bundler/cookbook.html#performance

// when running the "dev" alias, after every fastOptJS compile all artifacts are copied into
// a folder which is served and watched by the webpack devserver.
// this is a workaround for: https://github.com/scalacenter/scalajs-bundler/issues/180
lazy val copyFastOptJS = TaskKey[Unit]("copyFastOptJS", "Copy javascript files to target directory")
copyFastOptJS := {
  val inDir = (Compile / fastOptJS / crossTarget).value
  val outDir = (Compile / fastOptJS / crossTarget).value / "dev"
  val files = Seq(name.value.toLowerCase + "-fastopt-loader.js", name.value.toLowerCase + "-fastopt.js") map { p => (inDir / p, outDir / p) }
  IO.copy(files, overwrite = true, preserveLastModified = true, preserveExecutable = true)
}
