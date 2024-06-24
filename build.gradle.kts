import io.freefair.gradle.plugins.lombok.tasks.LombokConfig

plugins {
    id("java-library")
    id("io.freefair.lombok") version "caching-updates-SNAPSHOT"
}

repositories {
    mavenCentral()
}
