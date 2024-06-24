pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenLocal()
    }
}

plugins {
    id("com.gradle.develocity") version "3.17.5"
}

develocity {
    server = "https://ge.solutions-team.gradle.com"
}

rootProject.name = "lombok-plugin-test"
