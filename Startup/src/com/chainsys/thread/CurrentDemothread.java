package com.chainsys.thread;

public class CurrentDemothread {

	public static void main(String[] args) {
try {
	Thread t1=Thread.currentThread();
	System.out.println("mainThread ID:"+t1.getId());
	Worker w=new Worker();
	w.callme();
	System.out.println("In main after callme");
}catch(Exception e)
{
	System.out.println(e.getMessage());
}
	}
}
