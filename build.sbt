enablePlugins(ScriptedPlugin)

name := "play-bootstrap"

test in Test := {
  val _ = (g8Test in Test).toTask("").value
}

scriptedLaunchOpts ++= List("-Xms1g",
                            "-Xmx1g",
                            "-XX:ReservedCodeCacheSize=128m",
                            "-Xss2m",
                            "-Dfile.encoding=UTF-8")

resolvers += Resolver.url(
  "typesafe",
  url("http://repo.typesafe.com/typesafe/ivy-releases/"))(
  Resolver.ivyStylePatterns)
