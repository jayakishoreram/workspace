package com.jk.corejava.threads;

public class ThreadSleepSyncLockDemo {

	private static Object lockMoniter = new Object();
	
	public static void main(String[] args) {
		Thread threadA = new Thread(new ThreadA(), "ThreadA");
		Thread threadB = new Thread(new ThreadB(), "ThreadB");
		threadA.start();threadB.start();
		
	}

static class ThreadA implements Runnable {

		public void run() {

			System.out.println(Thread.currentThread().getName() + " Start");
			
			synchronized (lockMoniter) {
				System.out.println(Thread.currentThread().getName() + " Lock Enter");
				for (int i = 0; i < 20; i++) {
					System.out.println(Thread.currentThread().getName() + " "
							+ i);

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				}
				System.out.println(Thread.currentThread().getName() + " Lock Exit");
			}

			System.out.println(Thread.currentThread().getName() + " End");
		}

	}
	
static class ThreadB implements Runnable {

		public void run() {

			System.out.println(Thread.currentThread().getName() + " Start");
			
			synchronized (lockMoniter) {
				System.out.println(Thread.currentThread().getName() + " Lock Enter");
				for (int i = 100; i < 120; i++) {
					System.out.println(Thread.currentThread().getName() + " "
							+ i);

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				}
				System.out.println(Thread.currentThread().getName() + " Lock Exit");
			}

			System.out.println(Thread.currentThread().getName() + " End");
		}

	}

}
