package com.vivek.java8learning.handsOn;

@FunctionalInterface
interface Square{
	int calculate(int x);
	
}

public class Demo1 {

	public static void main(String[] args) {
		int num = 5;
		
		//lambda expression to define the calculate method
		Square s = (int x)->x*x;
		
		Square ss = (int y) -> y /2;
		
		int ans = s.calculate(num);
		System.out.println(ans);
		
		int ans2 = ss.calculate(6);
		System.out.println(ans2);

	}

}
