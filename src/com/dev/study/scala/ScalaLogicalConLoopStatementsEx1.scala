package com.dev.study.scala

object ScalaLogicalConLoopStatementsEx1 {

  def main(args: Array[String]) {
    var x = 10;

    if (x < 20) {
      println("This is if statement");
    }

    if (x < 20) {
      println("This is if statement");
    } else {
      println("This is else statement");
    }

    if (x == 10) {
      println("Value of X is 10");
    } else if (x == 20) {
      println("Value of X is 20");
    } else if (x == 30) {
      println("Value of X is 30");
    } else {
      println("This is else statement");
    }

    var y = 10;

    if (x == 30) {
      if (y == 10) {
        println("X = 30 and Y = 10");
      }
    }

    var a = 10;

    // An infinite loop.
    while (true) {
      println("Value of a: " + a);
    }

    // while loop execution
    while (a < 20) {
      println("Value of a: " + a);
      a = a + 1;
    }
    // do loop execution
    do {
      println("Value of a: " + a);
      a = a + 1;
    } while (a < 20)

    // for loop execution with a range
    for (a <- 1 to 10) {
      println("Value of a: " + a);
    }
    // for loop execution with a range
    for (a <- 1 until 10) {
      println("Value of a: " + a);
    }
    // for loop execution with a range
    for (a <- 1 to 3; b <- 1 to 3) {
      println("Value of a: " + a);
      println("Value of b: " + b);
    }

    val numList = List(1, 2, 3, 4, 5, 6);

    // for loop execution with a collection
    for (a <- numList) {
      println("Value of a: " + a);
    }

    // for loop execution with multiple filters
    /*for( var x <- List
      if condition1; if condition2...
     ){
     statement(s);
    }*/
    for ( a <- numList if a != 3; if a < 8 ) {
      println("Value of a: " + a);
    }

  }
}