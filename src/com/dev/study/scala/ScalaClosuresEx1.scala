package com.dev.study.scala

/**
 * A closure is a function, whose return value depends on the value of one or more
 * variables declared outside this function.
 *
 * The following piece of code with anonymous function.
 * val multiplier = (i:Int) => i * 10
 *
 *
 *
 */
object ScalaClosuresEx1 {

  def main(args: Array[String]) {
    println("multiplier(1) value = " + multiplier(1))
    println("multiplier(2) value = " + multiplier(2))
  }
  var factor = 3
  val multiplier = (i: Int) => i * factor

}