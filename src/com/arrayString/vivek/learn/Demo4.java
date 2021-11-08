package com.arrayString.vivek.learn;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo4 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(12);
		list.add(17);
		list.add(18);
		list.add(19);
		list.add(5);
		list.add(6);
		list.add(28);
		list.add(27);
		list.add(19);
		list.add(10);
		
		List<Integer> li = list.stream().filter(x -> x *x >= 100).collect(Collectors.toList());
		System.out.println(list);
		System.out.println(li);
		

	}

}
