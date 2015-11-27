package com.jk.thread;

public class SimpleThread {
	
	static volatile A a = null;
	
	public static void main(String[] args) {
		new Thread(new AnotherStupidThread()).start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		new Thread(new StupidThread()).start();
	}
	
}

class StupidThread implements Runnable{
	@Override
	public void run() {
	
		System.out.println(SimpleThread.a);
	}
}

class AnotherStupidThread implements Runnable{
	@Override
	public void run() {
	
		SimpleThread.a = new A();
	}
}

class A{
	public A() {
	
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}