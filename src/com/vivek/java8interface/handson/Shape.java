package com.vivek.java8interface.handson;

public interface Shape {
	
	public int area();
	default void display() {
		System.out.println("Hey ! this is default method from Shape interface.");
	}
}
