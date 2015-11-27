package com.jk.util.concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class SimpleExecutor {

	public static void main(String[] args) throws Exception{
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		/*executorService.execute(run);
		executorService.execute(run2);
		executorService.execute(run);
		executorService.execute(run2);*/
		//	run.start();
		//	run2.start();
		executorService.shutdown();
		
		executorService = Executors.newCachedThreadPool();
		/*executorService.execute(run);
		executorService.execute(run2);
		executorService.execute(run);
		executorService.execute(run2);
		executorService.execute(run);
		executorService.execute(run2);
		executorService.execute(run);
		executorService.execute(run2);
		executorService.execute(run);
		executorService.execute(run2);*/
		
		Future<?> future = executorService.submit(run3);
		Object objFuture = null;
		try {
			objFuture = future.get(15, TimeUnit.SECONDS);
		} catch (InterruptedException | ExecutionException | TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
		System.out.println("Future Object: "+ objFuture);
		executorService.shutdownNow();
		//future = executorService.submit(run3);
	}
	
	static Thread run = new Thread("A") {
		
		@Override
		public void run() {
			for(int i = 0; i<20; i++){
				System.out.println("Thread Name: "+ Thread.currentThread().getName() + "    I: "+i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	};
	
static Thread run2 = new Thread("B") {
		
		@Override
		public void run() {
			for(int i = 0; i<20; i++){
				System.out.println("Thread Name: "+ Thread.currentThread().getName() + "    A: "+i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	};
	
	
static Thread run3 = new Thread("B") {
		
		@Override
		public void run() {
			for(int i = 0; i<10; i++){
				System.out.println("Thread Name: "+ Thread.currentThread().getName() + "    A: "+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	};

}
