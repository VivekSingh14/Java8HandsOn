package com.vivek.java8interface.handson;

public class Circle implements Shape {
	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return this.radius;
	}
	@Override
	public int area() {
		int r = getRadius();
		return (int)3.14 * r * r;
	}
	
	public void display() {
		System.out.println("Hey! this is default method from Circle class. ");
	}
	
}
