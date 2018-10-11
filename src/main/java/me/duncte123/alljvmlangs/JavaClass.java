package me.duncte123.alljvmlangs;

import static me.duncte123.alljvmlangs.MessageHandler.printMln;

public class JavaClass extends LangBase {
    @Override
    public void printMessage() {
        printMln("Hello from java");
    }
}
