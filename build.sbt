name := "sbt-stups"

version := "0.4.0"

crossSbtVersions := Vector("0.13.16", "1.0.4")

sbtPlugin := true

organization := "org.zalando"

scalafmtVersion in ThisBuild := "1.1.0"

publishMavenStyle := true

// Publish snapshots to a different repository
publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

publishArtifact in Test := false

pomIncludeRepository := { _ =>
  false
}

pomExtra := <url>https://github.com/zalando-incubator/sbt-stups</url>
  <licenses>
    <license>
      <name>Apache 2</name>
      <url>https://opensource.org/licenses/Apache-2.0</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
    <url>https://github.com/zalando-incubator/sbt-stups</url>
    <connection>scm:git:git@github.com:zalando-incubator/sbt-stups.git</connection>
  </scm>
  <developers>
    <developer>
      <id>mdedetrich</id>
      <name>Matthew de Detrich</name>
      <email>matthew.de.detrich@zalando.de</email>
    </developer>
  </developers>

resolvers += Resolver.jcenterRepo
