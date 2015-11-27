package com.jk.util.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SimpleLock {

	public static void main(String[] args) {
		
		final  ReentrantLock lock = new ReentrantLock();
		
		ExecutorService  service = Executors.newFixedThreadPool(2);
		
		class Worker implements Runnable{
			
			private String name;

	         Worker(String name)
	         {
	            this.name = name;
	         }
			
			@Override
			public void run() {
			
				lock.lock();
				if(lock.isHeldByCurrentThread()){
					System.out.println("The Thread " + name +"  entered into crecical section.");
				}
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("The Thread " + name +"  exited from crecical section.");
				lock.unlock();
			}
		}
		
		service.execute(new Worker("A"));
		service.execute(new Worker("B"));
		
		service.shutdown();
	}

}
