package com.github.pndgz.gradle.plugins

/**
 * Created by gordondu on 15/12/2017.
 */
class MavenRefreshPluginExtension {

    String localRepository
    List<String> dependencies = new ArrayList<>()

    MavenRefreshPluginExtension() {
        localRepository = System.properties['user.home'] + "/.m2/repository/"
    }

    void setLocalRepository(String localRepository) {
        this.localRepository = localRepository
    }

    void setDependencies(List<String> dependencies) {
        this.dependencies = dependencies
    }
}
