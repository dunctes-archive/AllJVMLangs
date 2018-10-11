package me.duncte123.alljvmlangs

import org.eclipse.golo.compiler.GoloClassLoader

class RunGolo extends LangBase {
    @Override
    void printMessage() {

        def loader = new GoloClassLoader()
        def module = loader.load("GoloClass.golo", new FileInputStream("src/main/golo/GoloClass.golo"))
        def method = module.getMethod("printMessage")
        method.invoke(null)

    }
}
