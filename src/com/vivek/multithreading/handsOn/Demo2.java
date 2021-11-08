package com.vivek.multithreading.handsOn;

public class Demo2 implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread: "+ Thread.currentThread().getId()+" name is " + Thread.currentThread().getName());
		
	}

}
