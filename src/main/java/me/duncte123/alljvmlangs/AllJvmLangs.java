package me.duncte123.alljvmlangs;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;

public class AllJvmLangs {

    private static final String[] classNames = {
            "JavaClass",
            "GroovyClass",
            "KotlinClass",
            "ScalaClass",
            "RunRhino",
            "RunGolo",
    };

    public static void main(String[] args) throws Exception {
        File file = new File("output.txt");
        FileOutputStream fis = new FileOutputStream(file);
        PrintStream out = new PrintStream(fis);

        System.setOut(out);

        System.out.println("Welcome to AllJVMLangs");
        System.out.println("Don't ask me why I made this");
        System.out.println("This file contains the output generated from all the messages in the classes");
        System.out.println();
        System.out.println();

        for (String clsn : classNames) {
            if (clsn.isBlank()) {
                continue;
            }

            String className = "me.duncte123.alljvmlangs." + clsn;
            Class<?> cls = Class.forName(className);
            Object o = cls.getDeclaredConstructor().newInstance();
            Method m = cls.getDeclaredMethod("getMessage");

            String ret = (String) m.invoke(o);

            System.out.printf("Class: %s > ", cls.getName());
            System.out.println(ret);

        }
    }

}
