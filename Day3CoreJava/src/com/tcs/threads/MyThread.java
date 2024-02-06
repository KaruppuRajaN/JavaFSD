package com.tcs.threads;

public class MyThread  extends Thread{
	String name;

	public MyThread(String name) {
		super();
		this.name = name;
	}
	public void run() {
		for(int i=0;i<=4;i++) {
			System.out.println(this.name+" - "+i);
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String args[]) {
		System.out.println("Start");
		MyThread mt=new MyThread("Thread2");
		mt.start();
		MyThread mt1=new MyThread("Thread1");
		mt1.start();
		try {
			System.out.println(Thread.currentThread().getName());
			//Thread.currentThread().join();
		}catch(Exception e) {}
		System.out.println("Exit");
		System.exit(0);
		
		
	}

}
