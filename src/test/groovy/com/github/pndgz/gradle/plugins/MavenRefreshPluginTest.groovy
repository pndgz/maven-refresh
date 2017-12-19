package com.github.pndgz.gradle.plugins

import org.gradle.api.Project
import org.gradle.internal.impldep.org.junit.Test
import org.gradle.testfixtures.ProjectBuilder

/**
 * Created by gordondu on 15/12/2017.
 */
class MavenRefreshPluginTest {

    @Test
    public void mavenRefreshPluginAddsMavenRefreshTaskToProject() {
        Project project = ProjectBuilder.builder().build()
        project.pluginManager.apply 'com.github.pndgz.maven-refresh'

        assertTrue(project.tasks.hello instanceof MavenRefresh)
    }

}
