import sbt._
import Keys._
import sbtandroid.AndroidPlugin._

object General {

  val baseSettings: Seq[Project.Setting[_]] = Seq(
    name := "NullStaticVar",
    version := "0.1.0",
    versionCode := 0,
    scalaVersion := "2.10.3",
    platformName := "android-19",
    keyalias := "alias",
    useProguard := true
  )

  val resolvers = Seq(
    "sonatype" at "https://oss.sonatype.org/content/repositories/snapshots/"
  )

  val libraryDependencies = Seq(
    "org.scaloid" %% "scaloid" % "3.2-8"
  )

  val scalacOptions = Seq("-feature")

  val proguardOptions = Seq()

}

object AndroidBuild extends Build {

  lazy val main = AndroidProject(
    id = "NullStaticVar",
    base = file("."),
    settings = General.baseSettings ++ Seq(
      resolvers           ++= General.resolvers,
      libraryDependencies ++= General.libraryDependencies,
      scalacOptions ++= General.scalacOptions,
      proguardOptions := General.proguardOptions
    )
  ).settings(net.virtualvoid.sbt.graph.Plugin.graphSettings: _*)

}
