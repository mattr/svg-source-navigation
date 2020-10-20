package com.github.mattr.svgsourcenavigation.services

import com.intellij.openapi.project.Project
import com.github.mattr.svgsourcenavigation.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
