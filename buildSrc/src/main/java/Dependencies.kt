object Dependencies {
    val coreKtx by lazy { "androidx.core:core-ktx:${Versions.coreKtx}" }
    val appcompat by lazy { "androidx.appcompat:appcompat:${Versions.appcompat}" }
    val lifecycleRuntimeKtx by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleRuntimeKtx}" }
    val activityCompose by lazy { "androidx.activity:activity-compose:${Versions.activityCompose}" }
    val composeBom by lazy {"androidx.compose:compose-bom:${Versions.compose}"}
    val composeUi by lazy { "androidx.compose.ui:ui:" }
    val composeUiGraphics by lazy { "androidx.compose.ui:ui-graphics:" }
    val composeUiToolingPreview by lazy { "androidx.compose.ui:ui-tooling-preview:${Versions.composeUiToolingPreview}" }
    val composeMaterial3 by lazy { "androidx.compose.material3:material3:${Versions.material}" }
    val navigationCompose by lazy { "androidx.navigation:navigation-compose:${Versions.navigationCompose}" }
    val composeTestJunit4 by lazy { "androidx.compose.ui:ui-test-junit4:${Versions.compose}" }
    val composeUiTooling by lazy { "androidx.compose.ui:ui-tooling:${Versions.compose}" }
    val composeUiTestManifest by lazy { "android.compose.ui:ui-test-manifest:${Versions.compose}" }
    val lifecycleViewModelKtx by lazy { "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycleViewModelKtx}" }

    val hiltAndroid by lazy {"com.google.dagger:hilt-android:${Versions.hilt}"}
    val hiltAndroidCompiler by lazy { "com.google.dagger:hilt-android-compiler${Versions.hilt}" }
    val hiltCompiler by lazy {"com.google.dagger:hilt-compiler:${Versions.hiltCompiler}"}

    val hiltNavigationCompose by lazy { "androidx.hilt:hilt-navigation-compose:${Versions.hiltNavigationCompose}" }

    val retrofit by lazy { "com.squareup.retrofit2:retrofit:${Versions.retrofit}" }
    val okhttp by lazy {"com.squareup.okhttp3:okhttp:${Versions.okhttp}"}
    val gsonConverter by lazy { "com.squareup.retroffit2:gson-converter:${Versions.gsonConverter}"}
    val moshi by lazy {"com.squareup.moshi:moshi:${Versions.moshi}"}
    val moshiConverter by lazy { "com.squareup.retrofit2:converter-moshi:${Versions.moshiConverter}" }
    val loggingConverter by lazy { "com.squareup.okhttp3:logging-interceptor:${Versions.loggingInterceptor}"}

    val coroutineCore by lazy { "org.jetbrainsx.kotlinx:kotlinx-coroutines-core:${Versions.coroutineCore}" }
    val coroutineAndroid by lazy { "org.jetbrainsx.kotlinx:kotlinx-coroutines-android:${Versions.coroutineCore}" }
}

object Modules {
    const val utilities = ":utilities"
}