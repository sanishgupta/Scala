package com.dev.study.java_scala;

public class JavaMainTest1
{
	public static void main(String[] args)
	{
		JavaClassA JavaClassA = new JavaClassA();
		System.out.println(JavaClassA.getClassName());
		
		ScalaClassA ScalaClassA = new ScalaClassA();
		System.out.println(ScalaClassA.getClassName());
		
		JavaClassA.setClassName("This is me from JavaClassA");
		ScalaClassA.setClassName("This is me from ScalaClassA");
		
		System.out.println(JavaClassA.getClassName());
		System.out.println(ScalaClassA.getClassName());
	}

}
