/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("dev.amrw.playground.java.java-application-conventions")
}

dependencies {
    implementation("org.apache.commons:commons-text")
    implementation(project(":utilities"))
}

application {
    // Define the main class for the application.
    mainClass.set("dev.amrw.playground.java.app.App")
}
