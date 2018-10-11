package me.duncte123.alljvmlangs

import me.duncte123.alljvmlangs.MessageHandler.printMln

class KotlinClass : IBase {
    override fun printMessage() = printMln("Hello from kotlin")
}