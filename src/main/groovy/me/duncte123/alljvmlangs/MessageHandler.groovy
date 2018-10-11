package me.duncte123.alljvmlangs

class MessageHandler {

    private static PrintStream out

    static {
        def file = new File("output.txt")
        def fis = new FileOutputStream(file)
        out = new PrintStream(fis)
    }

    static void printMf(String message, Object... args) {
        out.printf(message, args)
        printf( message, args)
    }

    static void printMln(String message) {
        out.println(message)
        println message
    }

}
