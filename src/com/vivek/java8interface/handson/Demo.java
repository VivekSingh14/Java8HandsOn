package com.vivek.java8interface.handson;

public class Demo {

	public static void main(String[] args) {
		Square sq = new Square(4);
		System.out.println(sq.area());
		sq.display();
		
		System.out.println("***************************");
		
		Circle cc = new Circle(3);
		System.out.println(cc.area());
		cc.display();
		
		System.out.println("****************************");
		
		Shape sh = new Circle(7);
		sh.display();
		System.out.println(sh.area());
		
		System.out.println("****************************");
		
		Shape sha = new Square(2);
		sha.display();
		System.out.println(sha.area());
		
		
		

	}

}
