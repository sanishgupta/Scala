package com.dev.study.scala

import Array._

/**
 * var z:Array[String] = new Array[String](3)
 *
 * or
 *
 * var z = new Array[String](3)
 * z(0) = "Zara"; z(1) = "Nuha"; z(4/2) = "Ayan"
 * var z = Array("Zara", "Nuha", "Ayan")
 *
 *
 */
object ScalaArraysEx1 {
  def main(args: Array[String]) {
    var myList = Array(1.9, 2.9, 3.4, 3.5)

    // Print all the array elements
    for (x <- myList) {
      println(x)
    }

    // Summing all elements
    var total = 0.0;

    for (i <- 0 to (myList.length - 1)) {
      total += myList(i);
    }
    println("Total is " + total);

    // Finding the largest element
    var max = myList(0);

    for (i <- 1 to (myList.length - 1)) {
      if (myList(i) > max) max = myList(i);
    }

    println("Max is " + max);
  }

  //Multi-Dimensional Arrays
  //var myMatrix = ofDim[Int](3,3)

  var myMatrix = ofDim[Int](3, 3)

  // build a matrix
  for (i <- 0 to 2) {
    for (j <- 0 to 2) {
      myMatrix(i)(j) = j;
    }
  }

  // Print two dimensional array
  for (i <- 0 to 2) {
    for (j <- 0 to 2) {
      print(" " + myMatrix(i)(j));
    }
    println();
  }
  //Concatenate Arrays
  var myList1 = Array(1.9, 2.9, 3.4, 3.5)
  var myList2 = Array(8.9, 7.9, 0.4, 1.5)

  var myList3 = concat(myList1, myList2)

  // Print all the array elements
  for (x <- myList3) {
    println(x)
  }
  //Create Array with Range
  var myList11 = range(10, 20, 2)
  var myList22 = range(10, 20)

  // Print all the array elements
  for (x <- myList11) {
    print(" " + x)
  }

  println()
  for (x <- myList22) {
    print(" " + x)
  }
  // for more informatioon on Arrays methods
  //https://www.tutorialspoint.com/scala/scala_arrays.htm
}