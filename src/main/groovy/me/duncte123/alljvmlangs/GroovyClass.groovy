package me.duncte123.alljvmlangs

import static me.duncte123.alljvmlangs.MessageHandler.printMln

class GroovyClass implements IBase {
    @Override
    void printMessage() {
        printMln "Hello from groovy"
    }
}
