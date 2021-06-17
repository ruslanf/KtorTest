import AppDependencies.androidTestLibraries
import AppDependencies.appLibraries
import AppDependencies.testLibraries
import AppDependencies.uiLibraries
import AppDependencies.androidXLibraries
import AppDependencies.firebase
//import AppDependencies.hms
import AppDependencies.kaptLibraries
import AppDependencies.moduleLibraries
import AppDependencies.retrofitLibraries
import AppDependencies.room

plugins {
    id("com.android.application")
    kotlin("android")
    id("kotlin-kapt")
}

android {
    compileSdkVersion(AppConfig.compileSdk)
    buildToolsVersion(AppConfig.buildToolsVersion)
    defaultConfig {
        applicationId = AppConfig.applicationId
        minSdkVersion(AppConfig.minSdk)
        targetSdkVersion(AppConfig.targetSdk)
        versionCode = AppConfig.verCode
        versionName = AppConfig.verName
        testInstrumentationRunner = AppConfig.androidTestInstrumentation
        vectorDrawables.useSupportLibrary = true
    }

    buildTypes {
        getByName("debug") {
            // ...
        }
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
//            signingConfig = signingConfigs.getByName("release")
            isDebuggable = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
        freeCompilerArgs = listOfNotNull(
            "-Xopt-in=kotlin.RequiresOptIn",
            "-Xopt-in=kotlin.OptIn"
        )
    }
    viewBinding {
        android.buildFeatures.viewBinding = true
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(appLibraries)
    kapt(kaptLibraries)

    testImplementation(testLibraries)
    androidTestImplementation(androidTestLibraries)

    implementation(uiLibraries)
    implementation(androidXLibraries)
    implementation(moduleLibraries)
    implementation(retrofitLibraries)
    implementation(room)
    implementation(firebase)
}