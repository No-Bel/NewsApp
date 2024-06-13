// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    extra.apply {
        set("room_version", "2.6.1")
        set("coroutines_version", "1.7.3")
        set("lifecycle_version", "2.7.0")
        set("room_version", "2.5.2")
        set("di_hilt", "2.47")
        set("retrofit_version", "2.11.0")
        set("retrofit_okhttp3_version", "5.0.0-alpha.13")
        set("navigation_version", "2.7.7")
        set("glide_version", "4.12.0")
    }

    dependencies {
        //noinspection UseTomlInstead
        classpath ("androidx.navigation:navigation-safe-args-gradle-plugin:2.5.0")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}
plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
}