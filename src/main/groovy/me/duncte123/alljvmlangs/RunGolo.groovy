package me.duncte123.alljvmlangs

import org.eclipse.golo.compiler.GoloClassLoader

class RunGolo {
    String getMessage() {
        def loader = new GoloClassLoader()
        def module = loader.load("GoloClass.golo", new FileInputStream("src/main/golo/GoloClass.golo"))
        def method = module.getMethod("getMessage")


        return method.invoke(null) as String
    }
}