
plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.tamilnature.vattikadaimagic"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.tamilnature.vattikadaimagic"
        minSdk = 23
        targetSdk = 35
        versionCode = 67
        versionName = "67"
    }

    signingConfigs {
        create("release") {
            storeFile = rootProject.file("keystore.jks")
            storePassword = System.getenv("ANDROID_KEYSTORE_PASSWORD") ?: ""
            keyAlias = System.getenv("ANDROID_KEY_ALIAS") ?: ""
            keyPassword = System.getenv("ANDROID_KEY_PASSWORD") ?: ""
        }
    }

    buildTypes {
        getByName("release") {
            signingConfig = signingConfigs.getByName("release")
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }
}
