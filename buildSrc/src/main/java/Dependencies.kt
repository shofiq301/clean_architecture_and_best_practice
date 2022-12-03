object Versions{
    const val lifecycleVersion = "2.5.1"
    const val roomVersion = "2.4.3"
    const val coroutineVersion = "1.6.4"
    const val coroutineAndroidVersion = "1.3.9"
    const val daggerVersion = "2.44.2"
    const val retrofitVersion = "2.9.0"
    const val loggingVersion = "4.10.0"
    const val glideVersion = "4.14.2"
}
object Dependencies{
    const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycleVersion}"
    const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycleVersion}"
    const val savedState = "androidx.lifecycle:lifecycle-viewmodel-savedstate:${Versions.lifecycleVersion}"

    const val room = "androidx.room:room-runtime:${Versions.roomVersion}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.roomVersion}"

    const val coroutineCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutineVersion}"
    const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutineAndroidVersion}"

    const val dagger = "com.google.dagger:dagger:${Versions.daggerVersion}"
    const val daggerCompiler = "com.google.dagger:dagger-compiler:${Versions.daggerVersion}"

    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofitVersion}"
    const val converterGson = "com.squareup.retrofit2:converter-gson:${Versions.retrofitVersion}"
    const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.loggingVersion}"

    const val glide = "com.github.bumptech.glide:glide:${Versions.glideVersion}"
    const val glideCompiler = "com.github.bumptech.glide:compiler:${Versions.glideVersion}"
}