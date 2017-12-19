package com.github.pndgz.gradle.plugins

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Created by gordondu on 15/12/2017.
 */
class MavenRefreshPlugin implements Plugin<Project> {

    void apply(Project project) {
        project.extensions.create('mavenRefresh', MavenRefreshPluginExtension)
        project.tasks.create('mavenRefresh', MavenRefresh)
    }

}
