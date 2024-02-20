plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.android.libraries.mapsplatform.secrets-gradle-plugin")
}

android {
    namespace = "com.mis.route.locationexample"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.mis.route.locationexample"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

    // Location SDK
    implementation("com.google.android.gms:play-services-location:21.1.0")
    // Maps SDK
    implementation("com.google.android.gms:play-services-maps:18.2.0")
    // Gson
    implementation("com.google.code.gson:gson:2.10.1")
    // Maps SDK for Android Utility Library
    implementation("com.google.maps.android:android-maps-utils:1.1.0")


    // For Kotlin apps using one or more Google Maps Platform Android SDKs, Kotlin extension or
    // KTX libraries are available to enable you to take advantage of Kotlin language features
    // such as coroutines, extension properties/functions, and more. Each Google Maps SDK has a
    // corresponding KTX library:
    // Maps SDK for Android KTX Library
    implementation("com.google.maps.android:maps-ktx:3.0.0")
    // Maps SDK for Android Utility Library KTX Library
    implementation("com.google.maps.android:maps-utils-ktx:3.0.0")
    // Lifecycle Runtime KTX Library
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.7.0")
    // Maps SDK for Android KTX Library
    implementation("com.google.maps.android:maps-ktx:3.0.0")
    // Maps SDK for Android Utility Library KTX Library
    implementation("com.google.maps.android:maps-utils-ktx:3.0.0")
    // Lifecycle Runtime KTX Library
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.7.0")

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}