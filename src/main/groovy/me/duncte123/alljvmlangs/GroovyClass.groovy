package me.duncte123.alljvmlangs

import static me.duncte123.alljvmlangs.MessageHandler.printMln

class GroovyClass extends LangBase {
    @Override
    void printMessage() {
        printMln "Hello from groovy"
    }
}
