package com.dev.study.scala

object TimerAnonymous {
  def oncePerSecond(callback: () => Unit) {
    while (true) { callback(); Thread sleep 1000 }
  }
  def main(args: Array[String]) {
    
    /**
     * anonymous function
     */
    oncePerSecond(() =>
      println("time flies like an arrow..."))
  }
}