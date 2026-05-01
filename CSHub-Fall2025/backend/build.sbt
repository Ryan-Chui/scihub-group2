name := """basicframework"""

version := "1.0-SNAPSHOT"

resolvers ++= Seq(
  "Maven Central" at "https://repo1.maven.org/maven2/",
  "JCenter" at "https://jcenter.bintray.com/"
)

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean).enablePlugins(PlayScala)

scalaVersion := "2.12.12"

libraryDependencies += guice

// https://mvnrepository.com/artifact/commons-codec/commons-codec
libraryDependencies += "commons-codec" % "commons-codec" % "1.17.1"
// https://mvnrepository.com/artifact/com.amazonaws/aws-java-sdk-s3
libraryDependencies += "com.amazonaws" % "aws-java-sdk-s3" % "1.12.772"

libraryDependencies ++= Seq(
  javaJdbc,
  javaWs,

  "org.assertj" % "assertj-core" % "3.24.2" % Test
  ,
  "org.awaitility" % "awaitility" % "4.2.0" % Test
)


libraryDependencies += "com.h2database" % "h2" % "2.2.224"
libraryDependencies ++= Seq(
  "com.google.code.gson" % "gson" % "2.6.2",
  "org.projectlombok" % "lombok" % "1.18.34",
  "javax.mail" % "mail" % "1.4"
)

libraryDependencies += filters

PlayKeys.devSettings := Seq("play.akka.dev-mode.akka.http.parsing.max-uri-length" -> "20480")

PlayKeys.devSettings += "play.server.http.port" -> "9037"

fork in run := true
javaOptions += "-Djdk.tls.client.protocols=TLSv1.2"

libraryDependencies += "org.apache.commons" % "commons-email" % "1.5"

libraryDependencies ++= Seq(
  "org.assertj" % "assertj-core" % "3.26.3" % Test,
  "org.awaitility" % "awaitility" % "4.2.1" % Test,
  "com.h2database" % "h2" % "1.4.200" % Test
)
