sourceGenerators in Compile += (avroScalaGenerateSpecific in Compile).taskValue

avroSpecificScalaSource in Compile := new java.io.File(s"${baseDirectory.value}/myoutputdir")

avroScalaSpecificCustomNamespace in Compile := Map("example"->"overridden")

organization := "com.julianpeeters"

name := "override-settings"

version := "0.1-SNAPSHOT"

crossScalaVersions := Seq("2.10.6", "2.11.11", "2.12.4")

libraryDependencies += "org.apache.avro" % "avro" % "1.7.7"

