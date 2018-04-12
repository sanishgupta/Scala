package com.dev.study.scala

object ScalaImplicitEx1 {
  implicit class IntTimes(x: Int) {
    def times[A](f: => A): Unit = {
      def loop(current: Int): Unit =

        if (current > 0) {
          f
          loop(current - 1)
        }
      loop(x)
    }
  }

  /**
   * Implicit classes allow implicit conversations with class’s primary constructor 
   * when the class is in scope. Implicit class is a class marked with ‘implicit’ keyword.
   * This feature is introduced in Scala 2.10.
   */
  def main(args: Array[String]) {
    //4 times println("hello")
    
    val i:Int = 5;
    i times println("hello");
    
    val j:Int = 5;
    
    while( j > 5)
    {
      j times println("hello");
      j - 1;
      
    }
  }

}