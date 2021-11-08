package com.vivek.multithreading.handsOn;

public class App {

	public static void main(String[] args) {
		
		Demo demo1 = new Demo();
		demo1.setName("demo1");
		System.out.println(demo1.getId()+" "+ demo1.getName());
		demo1.start();
		
		System.out.println("*******************************************");
		
		Thread thread = new Thread(new Demo2());
		thread.setName("thread");
		System.out.println(thread.getId()+ " from main thread. "+ thread.getName());
		thread.start();
		
		
		

	}

}
