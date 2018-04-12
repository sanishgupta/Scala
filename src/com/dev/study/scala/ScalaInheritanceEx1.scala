package com.dev.study.scala

/**
 * Scala allows the inheritance from just one class only.
 */
class Point1(val xc: Int, val yc: Int) {
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int) {
    x = x + dx
    y = y + dy
    println("Point x location : " + x);
    println("Point y location : " + y);
  }
}

class Location(override val xc: Int, override val yc: Int,
    val zc: Int) extends Point1(xc, yc) {
  var z: Int = zc

  def move(dx: Int, dy: Int, dz: Int) {
    x = x + dx
    y = y + dy
    z = z + dz
    println("Point x location : " + x);
    println("Point y location : " + y);
    println("Point z location : " + z);
  }
}

object ScalaInheritanceEx1 {
  def main(args: Array[String]) {
    val loc = new Location(10, 20, 15);

    // Move to a new location
    loc.move(10, 10, 5);
    loc.move(11, 12);
  }

}