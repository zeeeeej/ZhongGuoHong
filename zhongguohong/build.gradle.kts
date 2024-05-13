import com.android.build.gradle.internal.utils.createPublishingInfoForLibrary

plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.jetbrains.kotlin.android)
    id("maven-publish")
}
group = "com.github.zeeeeej"
version = "1.0.0"

android {
    namespace = "com.zeeeej.android"
    compileSdk = 34

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}

afterEvaluate{
    publishing {
        publications {
            create<MavenPublication>("release") {
                from(components["release"])
                // 设置构件 ID、组 ID 和版本
                groupId = "com.github.zeeeeej"
                artifactId = "zhongguohong"
                version = "1.0.0"
            }
        }
        repositories {
            maven {
                // 配置 Maven 仓库 URL
                url = uri("http://your-repository-url.com")
            }
        }
    }

}