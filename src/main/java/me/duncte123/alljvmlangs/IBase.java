package me.duncte123.alljvmlangs;

import static me.duncte123.alljvmlangs.MessageHandler.printMf;

public interface IBase {

    void printMessage();

    default void handleMessage() {
        printMf("Class: %s > ", getClass().getName());
        printMessage();
    }
}
