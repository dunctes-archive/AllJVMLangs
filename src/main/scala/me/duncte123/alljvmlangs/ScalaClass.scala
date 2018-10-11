package me.duncte123.alljvmlangs

import me.duncte123.alljvmlangs.MessageHandler.printMln

class ScalaClass extends LangBase {
  override def printMessage(): Unit = {
    printMln("Hello from scala")
  }
}
