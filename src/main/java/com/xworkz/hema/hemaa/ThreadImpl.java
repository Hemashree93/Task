package com.xworkz.hema.hemaa;

public class ThreadImpl extends Thread{

	@Override
	public void run() {
		System.out.println("Running");
	}
	
	public void start() {
		System.out.println("invoked start");
	}

}
