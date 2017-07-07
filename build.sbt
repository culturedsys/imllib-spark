name := "Imllib"

organization := "com.intel"

version := "0.0.1"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
    "org.apache.spark" %% "spark-core" % "2.1.1" % "provided",
    "org.apache.spark" % "spark-mllib_2.11" % "2.1.1" % "provided",
    "org.specs2" %% "specs2-core" % "3.8.8" % "test"
)

resolvers += Resolver.sonatypeRepo("public")

scalacOptions in Test ++= Seq("-Yrangepos")

parallelExecution := false
