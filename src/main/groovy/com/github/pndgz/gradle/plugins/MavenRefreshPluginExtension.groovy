package com.github.pndgz.gradle.plugins

/**
 * Created by gordondu on 15/12/2017.
 */
class MavenRefreshPluginExtension {

    String localRepository

    MavenRefreshPluginExtension() {
        localRepository = System.properties['user.home'] + File.separator + ".m2" + File.separator + "repository" + File.separator
    }

    void setLocalRepository(String localRepository) {
        this.localRepository = localRepository
    }

}
