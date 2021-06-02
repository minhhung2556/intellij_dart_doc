package com.github.minhhung2556.intellijdartdoc.services

import com.github.minhhung2556.intellijdartdoc.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
