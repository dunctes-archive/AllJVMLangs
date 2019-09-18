package me.duncte123.alljvmlangs

import org.eclipse.golo.compiler.GoloClassLoader

class RunGolo {
    String  printMessage() {
        def loader = new GoloClassLoader()
        def module = loader.load("GoloClass.golo", new FileInputStream("src/main/golo/GoloClass.golo"))
        def method = module.getMethod("printMessage")


        return method.invoke(null) as String
    }
}