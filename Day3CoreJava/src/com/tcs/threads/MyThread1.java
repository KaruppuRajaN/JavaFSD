package com.tcs.threads;

public class MyThread1 implements Runnable {
	String name;

	public MyThread1(String name) {
		super();
		this.name = name;
	}
	public void run() {
		for(int i=0;i<=4;i++) {
			System.out.println(this.name+" - "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String args[]) {
		System.out.println("Start");
		MyThread1 ma=new MyThread1("Raja");
		Thread a=new Thread(ma);
		a.start();
		
		System.out.println("Exit");
		
		
	}
}
