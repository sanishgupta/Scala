package com.dev.study.java_scala

object ScalaMainTest1 {

  def main(args: Array[String]): Unit = {

    //ScalaClassA ScalaClassA = new ScalaClassA(); //OR
    val ScalaClassA = new ScalaClassA();
    print(ScalaClassA.getClassName());
    
    val JavaClassA = new JavaClassA();
    println(JavaClassA.getClassName) //OR
    //println(); print(javaClassA.getClassName);
        
    
    JavaClassA.setClassName("This is me from JavaClassA");
		ScalaClassA.setClassName("This is me from ScalaClassA");
		
		//Java Syntex
		System.out.println(JavaClassA.getClassName());
		System.out.println(ScalaClassA.getClassName());
		//OR
		
		//Scala syntax
		println(JavaClassA.getClassName());
		println(ScalaClassA.getClassName());

  }

}