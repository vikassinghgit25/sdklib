plugins {
    id("com.android.library")
    id("maven-publish")  // Add maven-publish plugin
}

android {
    namespace = "com.filter.sdklib"
    compileSdk = 34

    defaultConfig {
        minSdk = 24
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            consumerProguardFiles("consumer-rules.pro")  // Add consumer-rules.pro
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17  // Update to Java 17
        targetCompatibility = JavaVersion.VERSION_17  // Update to Java 17
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))  // Set Java toolchain to use version 17
    }
    sourceCompatibility = JavaVersion.VERSION_17  // Ensure source compatibility with Java 17
    targetCompatibility = JavaVersion.VERSION_17  // Ensure target compatibility with Java 17
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "com.github.vikassinghgit25"
            artifactId = "sdklib"
            version = "4.0"
            pom {
                description.set("Hi this is lib")
            }
        }
    }
    repositories {
        mavenLocal()  // Publish to local Maven repository
    }
}

dependencies {
    implementation(libs.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}
