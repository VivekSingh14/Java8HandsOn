package com.overriding.java.learn;

public class Test {
	protected void myMethod() throws Exception{
		System.out.println("Inside Test");
		throw new Exception ("Hey! this is exception. ");
	}
}
