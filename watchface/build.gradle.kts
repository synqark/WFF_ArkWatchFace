plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.packetbird.arkface"
    compileSdk {
        version = release(37)
    }

    defaultConfig {
        applicationId = "com.packetbird.arkface"
        // Watch Face Format v4 (complication colors / color transforms) requires Wear OS 6 (API 36)
        minSdk = 36
        targetSdk = 37
        versionCode = 1
        versionName = "1.0"

    }

    buildTypes {
        release {
            optimization {
                enable = true
                packageScope = setOf("androidx.**", "kotlin.**", "kotlinx.**")
            }
        }
    }
    enableKotlin = false
}

dependencies {
}