package com.xworkz.hema.hemaa;

public class Fuel {
	private int liters;
	
	public Fuel(int liters) {
		this.liters=liters;
		System.out.println("created "+liters);
	}
	
	public void Fire() {
		System.out.println("invoked");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Fuel[liters="+liters+"]";
	}
	
	

}
