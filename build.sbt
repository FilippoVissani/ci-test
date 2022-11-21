ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "it.unibo"
ThisBuild / scalaVersion := "3.2.0"

lazy val root = (project in file("."))
  .settings(
    name := "ci-test",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.12" % Test,
    libraryDependencies += "org.scala-lang" %% "scala3-library" % "3.2.0",
    assembly / mainClass := Some("it.unibo.test.Main"),
    assembly / assemblyJarName := "ci-test.jar",
    assembly / test := (Test / test).value,
)
