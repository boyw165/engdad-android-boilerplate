import org.gradle.kotlin.dsl.`kotlin-dsl`

val kotlinVersion = "1.3.72"

plugins {
    `kotlin-dsl`
}

// Required since Gradle 4.10+.
repositories {
    mavenCentral()
    google()
    jcenter()
}

dependencies {
    implementation(gradleApi())
    implementation(localGroovy())

    implementation("org.jet")
}