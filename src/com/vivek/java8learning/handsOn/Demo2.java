package com.vivek.java8learning.handsOn;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Demo2 {
	
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Vivek", "Singh", "Zain", "Anwar", "Vikas");
		Predicate<String> p = (s)-> s.startsWith("V");
		
		for(String str : names) {
			if(p.test(str))
				System.out.println(str);
		}

	}

}
