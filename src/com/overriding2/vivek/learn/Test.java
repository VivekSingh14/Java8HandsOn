package com.overriding2.vivek.learn;

public class Test extends Geeks {

	@Override
	public void myMethod() {
		System.out.println("GeeksforGeeks");

	}

	@Override
	public void getInfo() {
		System.out.println("Geeks");
	}
	public void testMethod() {
		System.out.println("Test class method");
	}


	public static void main(String args[]) {
		Geeks obj = new Test();
		obj.getInfo();
		
		GFG obj1 = new Test();
		obj1.getInfo();
		
		
	}

}
