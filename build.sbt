ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.1.3"

lazy val root = (project in file("."))
  .settings(
    name := "RockTadpole-IDEA",
    idePackagePrefix := Some("az.rock")
  )

libraryDependencies += "com.formdev" % "flatlaf" % "2.4"
libraryDependencies += "com.formdev" % "flatlaf-intellij-themes" % "2.4"
libraryDependencies += "org.postgresql" % "postgresql" % "42.5.0"
libraryDependencies += "org.projectlombok" % "lombok" % "1.18.24"