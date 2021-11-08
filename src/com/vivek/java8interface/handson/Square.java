package com.vivek.java8interface.handson;

public class Square implements Shape{
	private int side;

	public Square(int side) {
		this.side = side;
	}

	public int getSide() {
		return side;
	}

	@Override
	public int area() {
		int side = getSide();
		return side * side;
	}
	
	

}
