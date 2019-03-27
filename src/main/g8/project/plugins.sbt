addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.3.2")
addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.9.0")
addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.3.4")
addSbtPlugin("com.typesafe.sbt" % "sbt-git" % "0.9.3")
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.7.0")
addSbtPlugin("com.geirsson" % "sbt-scalafmt" % "1.6.0-RC3")
addSbtPlugin("org.irundaia.sbt" % "sbt-sassify" % "1.4.12")

resolvers += Resolver.bintrayRepo("sbt", "sbt-plugin-releases")
