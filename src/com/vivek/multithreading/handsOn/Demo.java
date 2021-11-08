package com.vivek.multithreading.handsOn;

public class Demo extends Thread {
	public void run() {
		try {
			System.out.println("Thread: "+Thread.currentThread().getId()+" name is "+ Thread.currentThread().getName());
		}catch(Exception e) {
			System.out.println("Exception is caught.");
		}
	}
}
