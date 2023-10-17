pluginManagement {
    repositories {
        maven("https://nexus.vinted.net/repository/maven-all-repos-group/")
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven("https://nexus.vinted.net/repository/maven-all-repos-group/")
        google()
        mavenCentral()
    }
}

rootProject.name = "Vinted UI Workshop"
include(":app")
 