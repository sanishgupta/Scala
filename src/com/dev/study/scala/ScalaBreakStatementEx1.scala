package com.dev.study.scala

import scala.util.control.Breaks

/**
 * import scala.util.control._
 *
 * // create a Breaks object as follows
 * val loop = new Breaks;
 *
 * // Keep the loop inside breakable as follows
 * loop.breakable {
 * // Loop will go here
 * for(...){
 * ....
 *
 * // Break will go here
 * loop.break;
 * }
 * }
 */
object ScalaBreakStatementEx1 {
  def main(args: Array[String]) {
    var a = 0;
    val numList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    val loop = new Breaks;

    loop.breakable {
      for (a <- numList) {
        println("Value of a: " + a);

        if (a == 4) {
          loop.break;
        }
      }
    }
    println("After the loop");

    //Breaking Nested Loops
        a = 0;
    var b = 0;
    val numList1 = List(1, 2, 3, 4, 5);
    val numList2 = List(11, 12, 13);

    val outer = new Breaks;
    val inner = new Breaks;

    outer.breakable {
      for (a <- numList1) {
        println("Value of a: " + a);

        inner.breakable {
          for (b <- numList2) {
            println("Value of b: " + b);

            if (b == 12) {
              inner.break;
            }
          }
        } // inner breakable
      }
    } // outer breakable.

  }

}