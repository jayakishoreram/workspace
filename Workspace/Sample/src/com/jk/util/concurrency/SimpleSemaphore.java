package com.jk.util.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SimpleSemaphore {

	
	
	public static void main(String[] args) {
		System.out.println("**************************");
		Runnable  runnable = new Runnable() {
			Pool pool = new SimpleSemaphore.Pool();
			@Override
			public void run() {
				
				
				while(true){
					String item = pool.getItem();
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					pool.putItem(item);
				}
			}
		};
		
		ExecutorService[] services = new ExecutorService[50];
		
		for(int i=1; i<50; i++){
			services[i] = Executors.newSingleThreadExecutor();
			services[i].execute(runnable);
		}
		
	}
	
	
	static class Pool{
		
		private int max_length = 11;
		
		String[] items = null;
		
		boolean[] used = new boolean[max_length];
		
		Semaphore available = new Semaphore(max_length, true);
		
		Pool(){
			items = new String[max_length];
			for(int i=1; i<=10; i++)
				items[i] = "item" + i;
		}
		
		public  String getItem(){
			try {
				available.acquire();
				return getNextAvailableItem();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
		
		public  void putItem(String item){
			
			for(int i=1; i<11; i++){
				if(items[i].equals(item)){
					used[i] = false;
				}
			}
			System.out.println("Thread Name: "+Thread.currentThread().getName()+ "   Put Item = "+item);
			available.release();
		}
		
		
		 String getNextAvailableItem(){
			for(int i=1; i< 11; i++){
				if(!used[i]){
					used[i] = true;
					System.out.println("Thread Name: "+Thread.currentThread().getName()+ "      Get Item = "+items[i]);
					return items[i];
				}
			}
			return null;
		}
		
	}
}
