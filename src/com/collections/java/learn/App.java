package com.collections.java.learn;

import java.util.Stack;

public class App {

	public static void main(String[] args) {
		Stack<Character> st= new Stack<>();
		String expression = "((a+b)*(c-d))";
		
		boolean flag = true;
		for(int i=0;i<expression.length();i++) {
			if(expression.charAt(i) == '(') {
				st.push(expression.charAt(i));
			}else if(expression.charAt(i)==')') {
				if(st.isEmpty()) {
					flag = false;
				}else {
					st.pop();
				}
			}
		}
		
		if(flag) {
			System.out.println("Expression is balanced.");
		}else {
			System.out.println("Expression is not balacned.");
		}

	}

}
