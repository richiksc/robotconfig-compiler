pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        jcenter()
    }
}

rootProject.name = ("robotconfig-compiler")

include(":example")
includeBuild("plugin-build")
