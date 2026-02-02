plugins {
    id("com.android.application")
    kotlin("android")
    id("com.google.gms.google-services") // Only if you're using Firebase
}

android {
    namespace = "com.example.smartemergencymedicalasistance"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.smartemergencymedicalasistance"
        minSdk = 21
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
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
}
dependencies {
    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.5.1")
    implementation("com.google.android.material:material:1.7.0")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.8.0")

    // Firebase dependencies
    implementation("com.google.firebase:firebase-auth:21.0.1")
    implementation("com.google.firebase:firebase-database:20.0.5")
    implementation("com.google.firebase:firebase-firestore:24.10.0")
    implementation("com.google.android.gms:play-services-maps:18.1.0")
    implementation("com.google.android.gms:play-services-location:21.0.1")
    implementation(platform("com.google.firebase:firebase-bom:32.7.0"))

    implementation ("com.google.firebase:firebase-bom:32.8.1")
    implementation("com.google.firebase:firebase-auth")
    implementation("com.google.firebase:firebase-database")
    implementation("com.google.firebase:firebase-appcheck")
    implementation ("com.google.firebase:firebase-appcheck-interop:17.0.1")




    // Glide for image loading
    implementation("com.github.bumptech.glide:glide:4.16.0")
    annotationProcessor("com.github.bumptech.glide:compiler:4.16.0")

    // AndroidX Test dependencies for instrumented tests
    androidTestImplementation("androidx.test:core:1.5.0")
    androidTestImplementation("androidx.test:runner:1.5.2")
    androidTestImplementation("androidx.test:rules:1.5.0")

    // AndroidX JUnit extension (needed for AndroidJUnit4 runner)
    androidTestImplementation("androidx.test.ext:junit:1.1.5")

    // Optional: Espresso for UI testing if needed
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    implementation ("com.squareup.okhttp3:okhttp:4.10.0")
    implementation ("de.hdodenhof:circleimageview:3.1.0")
    implementation ("com.google.firebase:firebase-auth:22.3.0")
    implementation ("com.google.firebase:firebase-database:20.3.0")

    implementation ("com.android.volley:volley:1.2.1")
    implementation ("commons-io:commons-io:2.11.0")


    // Firebase Realtime Database
    implementation ("com.google.firebase:firebase-database:20.2.0")

// Firebase Auth
    implementation ("com.google.firebase:firebase-auth:22.1.0")

// Firebase Storage (if uploading files)
    implementation ("com.google.firebase:firebase-storage:20.2.0")

// Firebase Firestore
    implementation ("com.google.firebase:firebase-firestore:24.4.1")

// Firebase Firestore
    implementation ("com.google.firebase:firebase-firestore:24.4.1")

// Firebase Auth
    implementation ("com.google.firebase:firebase-auth:22.3.0")

// RecyclerView
    implementation ("androidx.recyclerview:recyclerview:1.3.2")

// OkHttp for networking
    implementation ("com.squareup.okhttp3:okhttp:4.12.0")

    implementation ("com.google.firebase:firebase-firestore:24.4.5")


    implementation ("com.github.bumptech.glide:glide:4.15.1")
    annotationProcessor ("com.github.bumptech.glide:compiler:4.15.1")
    // other dependencies...

    implementation ("com.google.firebase:firebase-messaging:23.1.2") // Use latest stable version
    implementation ("com.google.android.material:material:1.6.0")


        implementation ("com.google.firebase:firebase-auth:22.3.1")
        implementation ("com.google.firebase:firebase-firestore:24.10.1")
        implementation ("com.google.firebase:firebase-database:20.3.0")
    implementation ("com.google.firebase:firebase-messaging:23.1.0") // Use latest version



    implementation ("com.google.android.material:material:1.6.0")
    implementation ("com.google.android.material:material:1.6.0")
    implementation ("androidx.cardview:cardview:1.0.0")



}






