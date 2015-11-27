package com.jk.util.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SimpleReadWriteLock {
	
	
	
	public static void main(String[] args) {
		
		final Names names = new Names();
		
		Runnable readRunnable = new Runnable() {
			
			@Override
			public void run() {
				names.read();
				
			}
		};
		
		Runnable writeRunnable = new Runnable() {
					
					@Override
					public void run() {
						for(int i = 0; i<20; i++){
							
							names.write("name"+i);
						}
					}
				};
				
				ExecutorService executor = Executors.newFixedThreadPool(3);
				executor.execute(writeRunnable);
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				executor.execute(readRunnable);
				executor.execute(readRunnable);
				executor.shutdown();
			}
		 
	
	static class Names{
		
		List<String> names = new ArrayList<>();
		ReentrantReadWriteLock RWlock = new ReentrantReadWriteLock();
		Lock readLock = RWlock.readLock();
		Lock writeLock = RWlock.writeLock();
		
		/*Lock readLock = new ReentrantLock();
				Lock writeLock = new ReentrantLock();*/
		
		
		/*Lock readLock = new ReentrantLock();
		Lock writeLock = readLock;*/
		
		
		public void write(String name){
			
			writeLock.lock();
			
			System.out.println("WRITE"+ "THREAD NAME: "+ Thread.currentThread().getName()+  "NAME: "+name);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			names.add(name);
			
			writeLock.unlock();
			
		}
		
		public void read(){
			
			readLock.lock();
			System.out.println("READ"+ "THREAD NAME: "+ Thread.currentThread().getName()+  "  SIZE OF NAMES: "+names.size());
			for(String name:names){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("READ"+ "THREAD NAME: "+ Thread.currentThread().getName()+  "NAME: "+name);
			}
			
			readLock.unlock();
		}
		
		
		
	}

}
