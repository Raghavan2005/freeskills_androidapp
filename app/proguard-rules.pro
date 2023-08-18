# Keep the org.conscrypt package and its classes
-keep class org.conscrypt.** { *; }

# Keep okhttp3 and its internal platform classes
-keep class okhttp3.** { *; }
-keep class okhttp3.internal.** { *; }

# Keep classes related to ConscryptPlatform in okhttp3
-keep class okhttp3.internal.platform.Platform
-keep class okhttp3.internal.platform.ConscryptPlatform {
    public *;
}

# Keep Conscrypt classes referenced by okhttp3
-keep class org.conscrypt.** { *; }
# Keep SSLParametersImpl class from conscrypt
-keep class com.android.org.conscrypt.SSLParametersImpl { *; }

