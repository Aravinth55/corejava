package com.chainsys.thread;


class  Book extends Thread{
	public void run()  {
		for(int i=1;i<=5;i++) {
			System.out.println("updating Db");
			try{Thread.sleep(3000);
		}catch(InterruptedException e) {}
		
	}
}
class  Num{
	void print() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			try{Thread.sleep(5000);
			}catch(InterruptedException e) {}
		}
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
  Book book=new Book();
  Num num=new Num();
book.start();
num.print();
}
}
}