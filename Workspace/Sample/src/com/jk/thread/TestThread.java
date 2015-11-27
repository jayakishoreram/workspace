package com.jk.thread;

public class TestThread extends Thread {
	
	static volatile int a = 10;
	
	@Override
	public void run() {
		
		for(int i = 0; i<10; i++){
			inc();
			getA();
		}
	}
	public static void main(String[] args) {
			
		TestThread thread = new TestThread();
		thread.setName("A");
		thread.start();
		
		TestThread thread1 = new TestThread();
		thread1.setName("B");
		thread1.start();
	}
	
	private  static void inc(){
		System.out.println(Thread.currentThread().getName()+ " INC "+a);
		a = a + 1;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(Thread.currentThread().getName()+ " INC ++ "+a);
	}
	
	
	private void dec(){
		a--;
	}
	
	private static int getA(){
		System.out.println(Thread.currentThread().getName()+ " "+a);
		return a;
	}
	

}
