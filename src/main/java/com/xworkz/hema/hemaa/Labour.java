package com.xworkz.hema.hemaa;

public class Labour {
	private String name;
	private int exprience;
	private ThreadImpl threadImpl;
	
	public Labour(String name) {
		this.name=name;
		System.out.println("created "+name);
	}
	public void setExprience(int exprience) {
		this.exprience=exprience;
		System.out.println("created"+exprience);
	}
	public void setThreadImpl(ThreadImpl threadImpl) {
		this.threadImpl=threadImpl;
		System.out.println("created+threadImpl");
	}
	public void work() {
		this.threadImpl.start();
		this.threadImpl.run();
	}
}
