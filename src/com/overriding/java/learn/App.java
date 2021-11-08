package com.overriding.java.learn;

public class App extends Test{
		public void myMethod() {
			System.out.println("Inside App");
		}
		
		protected void getValue() {
			System.out.println("Inside App but value ");
		}

}
