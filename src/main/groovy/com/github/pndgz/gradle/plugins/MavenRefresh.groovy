package com.github.pndgz.gradle.plugins

import org.gradle.api.DefaultTask
import org.gradle.api.Project
import org.gradle.api.artifacts.DependencyResolveDetails
import org.gradle.api.tasks.TaskAction

/**
 * Created by gordondu on 15/12/2017.
 */
class MavenRefresh extends DefaultTask {

    @TaskAction
    void doTask() {
        String root = project.mavenRefresh.localRepository
        if (!root.endsWith(File.separator)) {
            root += File.separator
        }
        println "Local Maven Repository: ${root}"
        String depTmp
        File snapshot
        project.configurations.each { conf ->
            if (conf.name == "compile") {
                conf.allDependencies.each { dep ->
                    if (dep.version != null && dep.version.endsWith("SNAPSHOT")) {
                        depTmp = dep.group.replaceAll("\\.", File.separator) + File.separator + dep.name
                        snapshot = new File(root, depTmp)
                        if (snapshot.exists() && snapshot.deleteDir()) {
                            println "Clean Local SNAPSHOT ${dep.group}:${dep.name}:${dep.version}"
                            logger.debug("Removing Local SNAPSHOT {}{}", root, depTmp)
                        }
                    }
                }
            }
        }
    }

}
