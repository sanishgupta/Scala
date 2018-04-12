package com.dev.study.java_scala

class ScalaClassA {

  //  var  className : String;
  //OR
  //var className : String = "Class Name is \"ScalaClassA\"";
  //OR
  var className = "Class Name is \"ScalaClassA\"";

  def getClassName(): String =
    {
      return className;
    }
  
    def setClassName( className : String): Unit =
    {
      this.className <= className;
      //OR
      this.className = className;
    }
}