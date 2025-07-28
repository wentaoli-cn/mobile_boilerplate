plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.compose) apply false
    alias(libs.plugins.kotlin.serialization) apply false
    alias(libs.plugins.google.ksp) apply false
    alias(libs.plugins.google.gms) apply false
    alias(libs.plugins.google.crashlytics) apply false
    alias(libs.plugins.github.versions) apply true // TODO: Remove if unnecessary.
}
