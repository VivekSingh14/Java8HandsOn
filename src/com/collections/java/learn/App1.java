package com.collections.java.learn;

import java.util.HashMap;
import java.util.Map;

public class App1 {

	public static void main(String[] args) {
		HashMap<Integer, String > hm = new HashMap<>();
		hm.put(1, "Mayur");
		hm.put(2, "Sharma");
		hm.put(3, "Nitin");
		
		
		for(Integer temp: hm.keySet()) {
			System.out.println(temp+" "+hm.get(temp));
		}
		
		
		for(Map.Entry<Integer, String> e : hm.entrySet()) {
			System.out.println(e.getKey()+" "+ e.getValue());
		}
	}

}
