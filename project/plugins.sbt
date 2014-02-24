resolvers += "scalasbt releases" at "http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases"

addSbtPlugin("org.scala-sbt" % "sbt-android" % "0.7.1-SNAPSHOT")

resolvers += "Sonatype snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.7.0-SNAPSHOT")

addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.7.4")
