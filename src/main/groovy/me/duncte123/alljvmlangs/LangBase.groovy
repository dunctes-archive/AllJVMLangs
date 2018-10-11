package me.duncte123.alljvmlangs

import static me.duncte123.alljvmlangs.MessageHandler.printMf

abstract class LangBase {

    abstract void printMessage()

    void handleMessage() {
        printMf("Class: %s > ", getClass().getName())
        printMessage()
    }
}
