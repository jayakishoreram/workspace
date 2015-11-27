package com.jk.util.concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProdConsumer{
	
	public static void main(String[] args) {
		
		Shared shared = new Shared();
		
		Executor executor = Executors.newSingleThreadExecutor();
		
		executor.execute(new Producer(shared));
		
		Executor executor1 = Executors.newSingleThreadExecutor();
		
		executor1.execute(new Consumer(shared));
		
	}
	
	static class Shared{
		
		volatile char c = '\u0000';
		volatile boolean available = false;
		Lock lock = new ReentrantLock();
		Condition condition = lock.newCondition();
		
		
		
		Lock getLock(){
			return lock;
			
		}
		
		public void set(char c){
			lock.lock();
			System.out.println("set called");
			while(available){
				
				try {
					condition.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			this.c = c;
			available = true;
			condition.signal();
			lock.unlock();
		}
		
		public char get(){
			
			char c;
			lock.lock();
			
			while(!available){
				try {
					condition.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			c = this.c;
			available = false;
			condition.signal();
			lock.unlock();
			return c;
		}
	}
	
	static class Consumer implements Runnable{
		
		Lock lock;
		
		Shared shared;
		
		public Consumer(Shared shared) {
			
			this.shared = shared;
			
			this.lock = shared.lock;
		}
		
		@Override
		public void run() {
			char c;
			do{
				lock.lock();
				c = shared.get();
				System.out.println(c + " consumed by consumer.");
				lock.unlock();
				
				
			}while(c != 'z');
			
			
			
			
			
		}
	}
	
	
	
static class Producer implements Runnable{
		
		Lock lock;
		
		Shared shared;
		
		public Producer(Shared shared) {
			
			this.shared = shared;
			
			this.lock = shared.lock;
		}
		
		@Override
		public void run() {
			
			for(char c = 'A'; c <= 'z'; c++){
				lock.lock();
			    shared.set(c);
			    System.out.println(c + " produced by producer.");
			    lock.unlock();
			}
			
		}
	}
	
	
	
	
	
	
}