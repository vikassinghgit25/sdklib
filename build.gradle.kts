// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    // Define the Kotlin version explicitly
    val kotlin_version by extra("1.7.20")

    repositories {
        google()
        mavenCentral()
        mavenLocal()  // Add mavenLocal repository
    }

    dependencies {
        classpath("com.android.tools.build:gradle:7.1.3")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version")  // Use the Kotlin version
    }
}


plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
}