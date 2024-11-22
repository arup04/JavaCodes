package com.gsv.project;

class B implements Runnable{
	public void run() {
		System.out.println("Chaman don ");
	}
}

public class thread_runnable {
	public static void main(String args[]) {
		B r = new B();
		Thread t = new Thread(r);
		t.start();
		System.out.println("this is run by main thread");
	}

}
