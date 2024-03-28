plugins{
    id("com.android.application")
}

android {
    namespace = "spa.lyh.cn.activitylifecycle"
    compileSdk =  34

    defaultConfig {
        applicationId = "spa.lyh.cn.activitylifecycle"
        minSdk = 19
        targetSdk = 34
        versionCode =  1
        versionName = "1.0"

    }

    buildTypes {
        release {
            isMinifyEnabled  = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"),"proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility =  JavaVersion.VERSION_1_8
    }

}

dependencies {
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation(project(":lib_lifecycle"))
}
