ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.12"

lazy val macros = (project in file("macros")).settings(
  libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVersion.value
)

lazy val core = (project in file("core")) dependsOn macros