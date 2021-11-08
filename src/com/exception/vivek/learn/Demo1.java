package com.exception.vivek.learn;

public class Demo1 {

	public static void main(String[] args) {
		method1();
		System.out.println();
	}
	
	public static void method1() {
		
		try {
			System.out.println("Hey");
			int i = 1/0;
			System.exit(0);
		}catch(Exception e) {
			System.out.println("Exception caught");
			//return 1;
		}finally {
			System.exit(1);
			
			
		}
	} 

}
