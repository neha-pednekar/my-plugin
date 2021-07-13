package com.github.nehapednekar.myplugin.services

import com.github.nehapednekar.myplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
