plugins{
    id("com.android.library")
}
val versionName = "1.0.2"

android {
    namespace = "spa.lyh.cn.lib_lifecycle"
    compileSdk =  34

    defaultConfig {
        minSdk =  19
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
