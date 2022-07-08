buildscript{
    repositories{
        gradlePluginPortal()
        google()
        mavenCentral()
    }

    dependencies {
        classpath(Build.androidBuildTools)
        classpath(Build.kotlinGradlePlugin)
        classpath(Build.hiltAndroid)
        classpath(Build.sqlDelightGradlePlugin)
        classpath("com.android.tools.build:gradle:7.2.1")
    }


}


tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}