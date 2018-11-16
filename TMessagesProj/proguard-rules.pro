-keep public class com.google.android.gms.* { public *; }
-keepnames @com.google.android.gms.common.annotation.KeepName class *
-keepclassmembernames class * {
    @com.google.android.gms.common.annotation.KeepName *;
}
-keep class org.skoarcery.** { *; }
-keep class com.google.android.exoplayer2.** { *; }
-keep class com.coremedia.** { *; }
-keep class com.googlecode.mp4parser.** { *; }
-dontwarn com.coremedia.**
-dontwarn org.skoarcery.**
-dontwarn com.google.android.exoplayer2.**
-dontwarn com.google.android.gms.**
-dontwarn com.google.common.cache.**
-dontwarn com.google.common.primitives.**
-dontwarn com.googlecode.mp4parser.**
-dontwarn com.amazon.**

# Remove this line if you are using SupportMapFragment
-dontwarn com.amazon.geo.mapsv2.SupportMapFragment

# Keep all Maps internal interfaces
-keep public class com.amazon.geo.mapsv2.**internal.* {
    *;
}

# Keep all Parcelable Creators
-keepnames class * implements android.os.Parcelable {
    public static final ** CREATOR;
}

# Keep all resource identifiers
-keepclassmembers class **.R$* {
    public static <fields>;
}

# Use -keep to explicitly keep any other classes shrinking would remove
-dontoptimize
-dontobfuscate

