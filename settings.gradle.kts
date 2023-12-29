pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "BitHub"
include(":app")
include(":features:home:data")
include(":features:home:domain")
include(":features:home:ui")
include(":features:loginregister:data")
include(":features:loginregister:domain")
include(":features:loginregister:ui")
include(":core:common")