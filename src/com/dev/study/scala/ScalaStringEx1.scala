package com.dev.study.scala

object ScalaStringEx1 {
  def main(args: Array[String]) {
    var palindrome = "Dot saw I was Tod";
    var len = palindrome.length();

    println("String Length is : " + len);

    //string1.concat(string2);
    //"My name is ".concat("Zara");
    //"Hello," + " world" + "!"
    var str1 = "Dot saw I was ";
    var str2 = "Tod";

    println("Dot " + str1 + str2);

    //Creating Format Strings
    var floatVar = 12.456
    var intVar = 2000
    var stringVar = "Hello, Scala!"

    var fs = printf("The value of the float variable is" +
      "%f, while the value of the integer " +
      "variable is %d, and the string" +
      "is %s", floatVar, intVar, stringVar)

    println(fs)

  }

  //String Interpolation
  val name = "James";
  println(s"Hello, $name") //output: Hello, James
  println(s"1 + 1 = ${1 + 1}") //output: 1 + 1 = 2

  //The ‘ f ’ Interpolator : printf  in C-lang
  val height = 1.9d;
  //val name = "James";
  println(f"$name%s is $height%2.2f meters tall") //James is 1.90 meters tall

  //‘raw’ Interpolator
  /**
   * The ‘raw’ interpolator is similar to ‘s’ interpolator except that it performs no
   * escaping of literals within a string. The following code snippets in a table will
   * differ the usage of ‘s’ and ‘raw’ interpolators. In outputs of ‘s’ usage ‘\n’ effects
   * as new line and in output of ‘raw’ usage the ‘\n’ will not effect. It will print the
   * complete string with escape letters.
   */

  println(s"Result = \n a \n b")
  //Result =
  //a
  //b  //all in new lines

  println(raw"Result = \n a \n b") //Result = \n a \n b

  /**
   * String Methods
   * 
   * char charAt(int index)
   * int compareTo(Object o)
   * int compareTo(String anotherString)
   * int compareToIgnoreCase(String str)
   * String concat(String str)
   * boolean contentEquals(StringBuffer sb)
   * static String copyValueOf(char[] data)
   * static String copyValueOf(char[] data, int offset, int count)
   * boolean endsWith(String suffix)
   * boolean equals(Object anObject)
   * boolean equalsIgnoreCase(String anotherString)
   * byte getBytes()
   * byte[] getBytes(String charsetName)
   * void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
   * int hashCode()
   * int indexOf(int ch)
   * int indexOf(int ch, int fromIndex)
   * int indexOf(String str)
   * int indexOf(String str, int fromIndex)
   * String intern()
   * int lastIndexOf(int ch)
   * int lastIndexOf(int ch, int fromIndex)
   * int lastIndexOf(String str)
   * int lastIndexOf(String str, int fromIndex)
   * int length()
   * boolean matches(String regex)
   * boolean regionMatches(boolean ignoreCase, int toffset, String other, int offset, int len)
   * boolean regionMatches(int toffset, String other, int offset, int len)
   * String replace(char oldChar, char newChar)
   * String replaceAll(String regex, String replacement
   * String replaceFirst(String regex, String replacement)
   * String[] split(String regex)
   * String[] split(String regex, int limit)
   *  so many other
   *  https://www.tutorialspoint.com/scala/scala_strings.htm
   * 
   */
  
}