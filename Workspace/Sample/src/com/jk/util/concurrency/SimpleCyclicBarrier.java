package com.jk.util.concurrency;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleCyclicBarrier {
	
	public static void main(String[] args) {
		
		Runnable action = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Action Thread: "+ Thread.currentThread().getName());
				
			}
		};
		
		final CyclicBarrier barrier = new CyclicBarrier(3, action);
		
		Runnable task = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Task Thread: "+Thread.currentThread().getName());
				
				try {
					barrier.await();
				} catch (InterruptedException | BrokenBarrierException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("IN EXCEPTION BLOCK");
				}
				
				System.out.println("Task Thread END: "+ Thread.currentThread().getName());
			}
		};
		
		ExecutorService[] service = new ExecutorService[]{
			Executors.newSingleThreadExecutor(),
			/*Executors.newSingleThreadExecutor(),
			Executors.newSingleThreadExecutor(),
			Executors.newSingleThreadExecutor(),
			Executors.newSingleThreadExecutor(),
			Executors.newSingleThreadExecutor(),
			Executors.newSingleThreadExecutor(),
			Executors.newSingleThreadExecutor(),
			Executors.newSingleThreadExecutor(),
			Executors.newSingleThreadExecutor(),*/
			Executors.newSingleThreadExecutor(),
			Executors.newSingleThreadExecutor()
		};
		
		for(Executor executor : service)
			executor.execute(task);
	}

}
