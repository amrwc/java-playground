plugins {
  id("dev.amrw.playground.java.java-application-conventions")
}

dependencies {
  implementation("org.apache.commons:commons-text")
  implementation(project(":utilities"))

  testImplementation(libs.assertj.core)
}

application {
  mainClass.set("dev.amrw.playground.java.app.App")
}

tasks.withType<JavaCompile>().configureEach {
  options.compilerArgs.addAll(listOf("--enable-preview"))
}

tasks.withType<Test>().configureEach {
  jvmArgs("--enable-preview")
}
