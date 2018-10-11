package me.duncte123.alljvmlangs

import me.duncte123.alljvmlangs.MessageHandler.printMln

class KotlinClass : LangBase() {
    override fun printMessage() = printMln("Hello from kotlin")
}