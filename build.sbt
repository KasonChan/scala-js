name := "Scalajs"

version := "1.0"

lazy val `scalajs` = (project in file("."))
  .enablePlugins(PlayScala)

scalaVersion := "2.11.5"

libraryDependencies ++= Seq(jdbc,
  anorm,
  cache,
  ws)

unmanagedResourceDirectories in Test <+= baseDirectory(_ / "target/web/public/test")