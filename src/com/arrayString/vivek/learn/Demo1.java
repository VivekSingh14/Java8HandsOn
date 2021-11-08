package com.arrayString.vivek.learn;

import java.util.Scanner;

/*
 * To learn if string has unique characters or not
 * Author: Vivek Singh
 * Time Complexity: O(n^2)
 */
public class Demo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string ");
		String strIn = sc.nextLine();
		boolean flag = false;
		for(int i=0;i<strIn.length();i++) {
			for(int j=i+1;j<strIn.length()-1;j++) {
				if(strIn.charAt(i) == strIn.charAt(j)) {
					flag = true;
				}
			}
		}
		
		if(flag == true) {
			System.out.println("String does not have all characters Unique.");
		}else {
			System.out.println("All characters are unique in the string.");
		}

	}

}
