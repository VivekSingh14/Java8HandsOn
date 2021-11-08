package com.arrayString.vivek.learn;

import java.util.Scanner;

/*
 * to optimize the code to check all characters are unique in string or not.
 * author: Vivek Singh
 * time complexity: O(n)
 */
public class Demo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String.");
		String strIn = sc.nextLine();
		
		boolean result = isallCharsUnique(strIn);
		System.out.println("is all characters are unique: "+ result);

	}

	private static boolean isallCharsUnique(String strIn) {
		boolean[] charHashtable = new boolean[26];
		
		for(int i=0;i<strIn.length();i++) {
			if(charHashtable[strIn.charAt(i)- 'a'] == true) {
				return false;
			}else {
				charHashtable[strIn.charAt(i)- 'a'] = true;
			}
		}
		return true;
	}

}
