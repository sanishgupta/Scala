package com.dev.study.scala

/**
 * Singleton Objects
 *
 * Scala is more object-oriented than Java because in Scala,
 * we cannot have static members. Instead, Scala has singleton objects.
 * A singleton is a class that can have only one instance, i.e., Object.
 * You create singleton using the keyword object instead of class keyword.
 * Since you can't instantiate a singleton object, you can't pass parameters
 * to the primary constructor. You already have seen all the examples using
 * singleton objects where you called Scala's main method.
 *
 */
import java.io._

class Point2(val xc: Int, val yc: Int) {
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int) {
    x = x + dx
    y = y + dy
  }
}

object ScalaSingletonObjects {
  def main(args: Array[String]) {
    val point = new Point2(10, 20)
    printPoint

    
    
    def printPoint {
      println("Point x location : " + point.x);
      println("Point y location : " + point.y);
    }
    
    abc
    
    def abc { println ("Test method abc()");}
  }
}

