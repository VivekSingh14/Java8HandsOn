package com.string.vivek.learn;

public class Demo {

	public static void main(String[] args) {
		String s1 = "ram";
		String str =  new String("ram");
		
		
	    System.out.println(s1 == str);
		System.out.println(s1.equals(str));
			
		System.out.println("**************");
		String s2 = "ram";
			
		System.out.println(s1==s2);
		
		String str2 = new String("ram");
		System.out.println("********************");
		System.out.println(str == str2);
		System.out.println(str.equals(str2));
		

	}

}
