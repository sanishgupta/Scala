package com.dev.study.scala

object ScalaLogicalOperatorsEx1 {
  def main(args: Array[String]) {
    
    var a = true;
    var b = false;

    println("a && b = " + (a && b));

    println("a || b = " + (a || b));

    println("!(a && b) = " + !(a && b));
  }

}