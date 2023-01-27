addSbtPlugin("org.scala-js"  % "sbt-scalajs"         % "1.13.0")
addSbtPlugin("ch.epfl.scala" % "sbt-scalajs-bundler" % "0.21.1")

addSbtPlugin("org.scalameta"             % "sbt-scalafmt" % "2.5.0")
addSbtPlugin("io.github.davidgregory084" % "sbt-tpolecat" % "0.4.2")

// for reading npmDependencies from package.json
libraryDependencies ++= Seq("com.lihaoyi" %% "upickle" % "2.0.0")
