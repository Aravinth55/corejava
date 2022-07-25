package com.chainsys.thread;

//class Book implements Runnable {
	/*
	 * public void run() { for (int i = 1; i <= 5; i++) {
	 * System.out.println("updating Db"); try { Thread.sleep(3000); } catch
	 * (InterruptedException e) { }
	 * 
	 * } }
	 */


class Num extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}

public class ThreadDemo {
	public static void main(String[] args) throws InterruptedException {
		Runnable book = () -> // lamda function
		{

			for (int i = 1; i <= 5; i++) {
				System.out.println("Aravinth");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}

		};
		Num num = new Num();

		// book thread

		Thread t1 = new Thread(book);
		// book.updateDb();=

		//t1.setName("tamil book");
		//t1.setPriority(Thread.MAX_PRIORITY);
		//t1.setPriority(Thread.MIN_PRIORITY);
		//System.out.println(t1.getName());
		t1.start();

		num.start();
		/*
		 * if(book.isAlive()) { System.out.println("still executing"); }
		 * if(num.isAlive()) { System.out.println("still 2executing");} book.join();
		 * num.join(); System.out.println("bye bye");
		 */
	}
}
