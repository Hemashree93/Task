package com.xworkz.hema.hemaa;

public class Satalite {
	private int launched;
	private String location;
	
	public Satalite() {
		System.out.println("invoked satalite"+this.getClass().getSimpleName());
	}
	
	public void setLaunched(int launched) {
		this.launched = launched;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public void launch(int time) {
		System.out.println("invoked"+time);
		
	}
	
		
	

	@Override
	public String toString() {
		return "Satalite [launched=" + launched + ", location=" + location + "]";
	}

	

	
	

}
