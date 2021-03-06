buildscript{
    repositories{
        gradlePluginPortal()
        google()
        mavenCentral()
    }

    dependencies {
        classpath(Build.hiltAndroid)
        classpath(Build.sqlDelightGradlePlugin)
        classpath("com.android.tools.build:gradle:7.2.1")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")
    }

}


tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}