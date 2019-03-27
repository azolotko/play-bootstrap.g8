enablePlugins(JavaServerAppPackaging,
              DebianPlugin,
              SystemdPlugin,
              GitVersioning)

maintainer := "$author_name$ <$author_email$>"

packageSummary := "$summary$"

packageDescription := "$summary$"

defaultLinuxInstallLocation := "/srv"

version in Linux := {
  import com.typesafe.sbt.SbtGit.git
  val branch = git.gitCurrentBranch.value
  val sha =
    git.formattedShaVersion.value
      .map("-".concat(_).substring(0, 11))
      .getOrElse("-unknown")
  s"\${git.formattedDateVersion.value}-\$branch\$sha"
}
