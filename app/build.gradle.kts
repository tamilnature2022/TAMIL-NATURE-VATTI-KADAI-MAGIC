
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
        versionCode = 66
        versionName = "66"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }
}
