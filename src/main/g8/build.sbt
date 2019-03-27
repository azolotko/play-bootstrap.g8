name := "$name$"

organization := "$organization$"

version := "0.1-SNAPSHOT"

description := "$summary$"

scalaVersion := "2.12.8"

scalacOptions ++= Seq("-feature",
                      "-unchecked",
                      "-deprecation",
                      "-Ywarn-value-discard",
                      "-Ywarn-unused-import")

licenses := Seq(
  "Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0.html"))

enablePlugins(PlayScala)

lazy val circeVersion = "0.11.1"

libraryDependencies ++= Seq(
  guice,
  "com.github.pureconfig" %% "pureconfig" % "0.10.2",
  "org.webjars" %% "webjars-play" % "2.7.0",
  "org.webjars" % "bootstrap" % "4.3.1",
  "com.adrianhurt" %% "play-bootstrap" % "1.5-P27-B4-SNAPSHOT",
  "io.circe" %% "circe-core" % circeVersion,
  "io.circe" %% "circe-generic" % circeVersion,
  "io.circe" %% "circe-parser" % circeVersion,
  "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2",
  "ch.qos.logback" % "logback-classic" % "1.2.3",
  "org.scalatest" %% "scalatest" % "3.0.7" % "test",
  "org.scalatestplus.play" %% "scalatestplus-play" % "4.0.1" % Test
)

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"
