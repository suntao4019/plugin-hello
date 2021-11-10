package com.github.suntao4019.pluginhello.services

import com.intellij.openapi.project.Project
import com.github.suntao4019.pluginhello.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
