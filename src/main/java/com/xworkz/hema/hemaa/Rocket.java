package com.xworkz.hema.hemaa;

public class Rocket {
	private Fuel fl;
	private Satalite sat;
	private String CountryName;
	
	
	public Rocket(Fuel fl) {
		this.fl=fl;
		System.out.println("created"+fl);
	}
	
	public void setSat(Satalite sat) {
		this.sat=sat;
		System.out.println(sat);
	}
	public void setCountryName(String countryName) {
		this.CountryName=CountryName;
		System.out.println(countryName);
	}
	public void start() {
		this.fl.Fire();
	}
	public void launch() {
		this.sat.launch(22);
	}

	@Override
	public String toString() {
		return "Rocket [fl=" + fl + ", sat=" + sat + ", CountryName=" + CountryName + "]";
	}
	
}
