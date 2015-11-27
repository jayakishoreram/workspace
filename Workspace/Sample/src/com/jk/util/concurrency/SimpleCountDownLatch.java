package com.jk.util.concurrency;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleCountDownLatch {

	
	private final static int _N = 5;
	
	public static void main(String[] args) {
		
		CountDownLatch start = new CountDownLatch(1);
		CountDownLatch end = new CountDownLatch(_N);
		
		ExecutorService executorService = Executors.newFixedThreadPool(_N);
		
		executorService.execute(new Worker(start, end));
		executorService.execute(new Worker(start, end));
		executorService.execute(new Worker(start, end));
		executorService.execute(new Worker(start, end));
		executorService.execute(new Worker1(start, end));
		executorService.shutdown();
		
		start.countDown();
		
		System.out.println("WAIT FOR ALL THREADS ");
		
		try {
			end.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("END OF ALL THREADS ");
	}

	static class Worker implements Runnable{
		
		CountDownLatch start;
		CountDownLatch end;
		
		Worker(CountDownLatch start, CountDownLatch end){
			this.start = start;
			this.end = end;
		}
		
		@Override
		public void run() {
			System.out.println("Thread: "+ Thread.currentThread().getName() +"  START");
				
				try {
					start.await();
					System.out.println("Thread: "+ Thread.currentThread().getName() +" ACTUAL START");
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Thread: "+ Thread.currentThread().getName() +" ACTUAL END");
				end.countDown();
				System.out.println("Thread: "+ Thread.currentThread().getName() +"  END");
		}
	}
	
static class Worker1 implements Runnable{
		
		CountDownLatch start;
		CountDownLatch end;
		
		Worker1(CountDownLatch start, CountDownLatch end){
			this.start = start;
			this.end = end;
		}
		
		@Override
		public void run() {
			System.out.println("Thread: "+ Thread.currentThread().getName() +"  START");
				
				try {
					start.await();
					System.out.println("Thread: "+ Thread.currentThread().getName() +" ACTUAL START");
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Thread: "+ Thread.currentThread().getName() +" ACTUAL END");
				end.countDown();
				System.out.println("Thread: "+ Thread.currentThread().getName() +"  END");
		}
	}
}
