package com.jk.util.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;
import java.util.concurrent.Executors;

public class SimpleExchanger {

	static Exchanger<Buffer> exchanger = new Exchanger<>();
	
	static Buffer initialEmptyBuffer = new Buffer("PEPSI", false);
	
	static Buffer initialFullBuffer = new Buffer("COLA", true);
	
	
	public static void main(String[] args) {
		
		class FillingLoop implements Runnable{
			
			int count = 0;
			
			@Override
			public void run() {
			
				Buffer buffer = initialEmptyBuffer;
				
				while (true) {
					try {
						Thread.sleep(10);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					addToBuffer(buffer);
					if(buffer.isFull())
						try {
							System.out.println("filling loop thread wants to exchange");
							buffer =  exchanger.exchange(buffer);
							System.out.println("filling loop thread observes an exchange");
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				}
				
			}
			
			void addToBuffer(Buffer buffer){
					buffer.add("PEPSI"+count++);
			}
		}
		
		
		class EmptyingLoop implements Runnable{
			
			@Override
			public void run() {
			
			Buffer buffer = initialFullBuffer;
			
			while (true) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				removeFromBuffer(buffer);
				if(buffer.isEmpty())
					try {
						System.out.println("emptying loop thread wants to exchange");
						buffer = exchanger.exchange(buffer);
						System.out.println("emptying loop thread observes an exchange");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
			
			}
			
			private void removeFromBuffer(Buffer buffer){
				
				buffer.remove();
			}
		}
		Executors.newSingleThreadExecutor().execute(new EmptyingLoop());
		Executors.newSingleThreadExecutor().execute(new FillingLoop());
		
		System.out.println(initialEmptyBuffer.isEmpty());
		System.out.println(initialFullBuffer.isFull());
	}
	
	static class Buffer{
		
		private final int MAX_LENGTH = 10;
		
		List<String> buffer = new ArrayList<>();
		
		Buffer(){}
		
		Buffer(String prefix, boolean initilize){
			if(initilize)
				for(int i=0; i < MAX_LENGTH; i++){
					buffer.add(prefix+i);
				}
		}
		
		public boolean isFull(){
			return buffer.size() >= MAX_LENGTH;
		}
		
		public boolean isEmpty(){
			return buffer.size() == 0;
		}
		
		public void add(String item){
			if(!isFull()){
				System.out.println("ADD ITEM: "+ item);
				buffer.add(item);
			}
		}
		
		public void remove(){
			if(!isEmpty()){
				System.out.println("REMOVE ITEM: "+ buffer.get(0));
				buffer.remove(0);
			}
		}
	}
}
