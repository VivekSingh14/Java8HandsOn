package com.arrayString.vivek.learn;


public class Demo6 {

	public static void main(String[] args) {
		int a = 1234567;
		int b = a;
		int count = 0;
		while(b > 0) {
			b = b / 10;
			count++;	
		}
		
		
		int arr[] = new int[count];
		int len = arr.length-1;
		while( a > 0 ) {
		 int temp =  a % 10;
		 arr[len] = temp;
		 a = a/10;
		 len--;
		}
		
		
		int sum = 0;
		for(int i = 0 ; i < arr.length; i++) {
			if(i % 2 == 0) {
				sum = sum+arr[i];
			}
		}
		
		System.out.println(sum);
		
		

	}

}
