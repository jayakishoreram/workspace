package com.jk.corejava.threads;

import java.util.ArrayList;
import java.util.List;

public class ThreadWaitNotifyDemoPC {

	private static List<Integer> l = new ArrayList<>();
	private static boolean read = false;
	private static boolean end = false;
	public static void main(String[] args) {
		Thread proThread = new Thread(new ThreadProducer(), "Producer Thread");
		Thread conThread = new Thread(new ThreadConsumer(), "Consumer Thread");
		proThread.start();
		conThread.start();
	}

	static class ThreadProducer implements Runnable {

		public void run() {
			System.out.println(Thread.currentThread().getName() + "Start");

			for (int i = 10; i < 20; i++) {
				synchronized (l) {
					while (read) {
						try {
							l.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					System.out.println(Thread.currentThread().getName() + " produced: "+ i);
					l.add(0, i);
					read = true;
					l.notify();
				}
			}
			System.out.println(Thread.currentThread().getName() + "End");
			end = true;
		}

	}

	static class ThreadConsumer implements Runnable {

		public void run() {
			System.out.println(Thread.currentThread().getName() + "Start");
			do {
				synchronized (l) {
					while (!read) {
						try {
							l.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.println("A: " + l.get(0));
					System.out.println(Thread.currentThread().getName() + " consumed: "+ l.get(0));
					read = false;
					l.notify();
				}
			}while(!end);
			
		}

	}

}
