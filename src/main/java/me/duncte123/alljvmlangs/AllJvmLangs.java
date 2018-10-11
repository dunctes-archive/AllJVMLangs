package me.duncte123.alljvmlangs;

import java.util.List;

import static me.duncte123.alljvmlangs.MessageHandler.printMln;

public class AllJvmLangs {

    private static final List<IBase> classes = List.of(
            new JavaClass(),
            new GroovyClass(),
            new KotlinClass(),
            new ScalaClass()
    );

    public static void main(String[] args) {

        printMln("Welcome to AllJVMLangs");
        printMln("Trying to run this is a waste of your time");
        printMln("This file contains the output generated from all the messages in the classes");
        printMln("");
        printMln("");

        for(IBase base : classes) {
            base.handleMessage();
        }
    }

}
