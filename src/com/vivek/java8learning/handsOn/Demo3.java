package com.vivek.java8learning.handsOn;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(2);
		al.add(6);
		al.add(3);
		al.add(4);
		al.add(20);
		
		System.out.println("Printing the collection : " + al);
		
		System.out.println();
		
		List<Integer> ls = al.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		
		System.out.println("Printing the collection only even : " + ls);
		
        List<Integer> ls1 = al.stream().sorted().collect(Collectors.toList());
		
		System.out.println("Printing the collection after sort : " + ls1);
	}

}
