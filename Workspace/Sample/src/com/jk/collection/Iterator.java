package com.jk.collection;

import java.util.ArrayList;
import java.util.List;

public class Iterator {

	static List<Integer> intList = new ArrayList<>();
	
	public static void main(String[] args) {
		
		for(int i=0; i<20; i++)
			intList.add(i);
		System.out.println("*************************"+intList.size());
		new ThreadA(intList.iterator()).start();
		new ThreadA(intList.listIterator()).start();
		/*for (Integer intt : intList) {
			System.out.println(intt);
		}*/
		
		
	}
	
	static class ThreadA extends Thread{
		
		java.util.Iterator<Integer> itr = null;
		
		public ThreadA(java.util.Iterator<Integer> itr) {
			this.itr = itr;
		}
		@Override
		public void run() {
			while(itr.hasNext()){
				if(itr.next() > 15){
				break;
				//	System.out.println("**************");
				//	itr.remove();
				}
			}
		}
	}
	
static class ThreadB extends Thread{
		
		java.util.ListIterator<Integer> itr = null;
		
		public ThreadB(java.util.ListIterator<Integer> itr) {
			this.itr = itr;
		}
		@Override
		public void run() {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int j = 100;
			while (itr.hasNext()) {
				Integer integer = (Integer) itr.next();
				//if(integer > 10){
					System.out.println(integer);
				//}
			}
		}
	}
	
}
