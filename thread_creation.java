package com.gsv.project;

class A extends Thread{
	@Override
	public void run() {
		System.out.println("chaman");
	}
}

public class thread_creation {
	public static void main(String args[]) {
		A th = new A();
		th.start();
		
		System.out.println("this is run by main thread");
		
	}

}
