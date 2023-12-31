plugins {
    id("com.android.application")
}   //

android {
    namespace = "pe.edu.idat.appformularios"   // nombre de paquete
    compileSdk = 33              // version de SDK

    defaultConfig {     //
        applicationId = "pe.edu.idat.appformularios"
        minSdk = 24    // version nivel Api - inf importante para la tienda App Store
        targetSdk = 33
        versionCode = 1        // version de produccion - aumenta segun actualizaciones
        versionName = "1.0"     // version de la App

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
    compileOptions {         // versiones de java
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}

//