name := "scala-template"

organization := "jafaeldon"

version := "0.0.1"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "org.scalatest"  %% "scalatest"  % "2.2.6"  % Test,
  "org.scalacheck" %% "scalacheck" % "1.13.0" % Test
)

scalacOptions in Test ++= Seq("-Yrangepos")

// Read here for optional dependencies:
// http://etorreborre.github.io/specs2/guide/org.specs2.guide.Runners.html#Dependencies

resolvers ++= Seq("snapshots", "releases").map(Resolver.sonatypeRepo)

initialCommands := "import jafaeldon.scalatemplate._"
