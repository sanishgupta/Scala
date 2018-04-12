package com.dev.study.scala

object ScalaTest {

class Point(val xc: Int, val yc: Int) {
   var x: Int = xc
   var y: Int = yc
   
   def move(dx: Int, dy: Int) {
      x = x + dx
      y = y + dy
      println ("Point x location : " + x);
      println ("Point y location : " + y);
   }
}
  def main(args: Array[String]) {
    
    //String Literals
    println("Hello,\nWorld!");
    println("This string contains a \" character.");

    val x = 1; val y = 2;

    val pintVar = new Point(1, 2);
    pintVar.move(x, y);
    println("x : " + x + "|| y : " + y);

  }

}