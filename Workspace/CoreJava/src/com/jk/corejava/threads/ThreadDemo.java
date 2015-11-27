package com.jk.corejava.threads;

public class ThreadDemo {

	public static void main(String[] args) {
		Thread threadA = new Thread(new ThreadA(), "ThreadA");
		Thread threadB = new Thread(new ThreadB(), "ThreadB");
		threadA.setPriority(Thread.MAX_PRIORITY);
		threadA.start();
		threadB.start();

	}
	
	
static class ThreadA implements Runnable{
		public void run(){
			
			for(int i=0; i< 20; i++){
				System.out.println(Thread.currentThread().getName() +"   "+ i);
				/*try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}*/
			}
			
		}
	}
	
static class ThreadB implements Runnable{
		public void run(){
			
			for(int i=100; i< 120; i++){
				System.out.println(Thread.currentThread().getName() +"   "+ i);
				/*try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}*/
			}
			
		}
	}

}
