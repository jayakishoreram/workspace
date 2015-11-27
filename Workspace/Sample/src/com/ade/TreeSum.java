package com.ade;

import java.util.concurrent.atomic.AtomicBoolean;



public class TreeSum extends Thread{/*
	
	private static AtomicBoolean interrruptTask=false;
	
	public void run() {
		//synchronized (TreeSum.class) {
		try {
			Thread.sleep(6000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			while (!interrruptTask) {
				try {
					Thread.sleep(1000);
					System.out.println("inside while");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			//}
		}
		
		System.out.println("runDone");
	}
	
	public static void main(String[] args) throws Exception{
		
		TreeSum t = new TreeSum();
		t.start();
		
	//	try {
			Thread.sleep(5000);
			synchronized (TreeSum.class) {
				interrruptTask = true;	
			}
			
			
			t.join();
			System.out.println("joining");
		//} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
		//}
		System.out.println("end");
		
	}

*/}
