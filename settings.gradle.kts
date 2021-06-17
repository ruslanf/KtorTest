pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
    }
    resolutionStrategy {
        eachPlugin {
            if (requested.id.namespace == "com.android")
                useModule("com.android.tools.build:gradle:${requested.version}")
        }
    }
}

include(":app")
rootProject.name = "KtorTest"