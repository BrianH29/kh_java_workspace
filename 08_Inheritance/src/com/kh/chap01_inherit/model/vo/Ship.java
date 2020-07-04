package com.kh.chap01_inherit.model.vo;

public class Ship extends Vehicle { // inherit from Vehicle

	//field
	private int propeller;
	
	//Constructor
	public Ship() {
		
	}
	
	// 메개변수생서자
	public Ship(String name, double mileage, String kind, int propeller) {
		super(name,mileage,kind);
		this.propeller = propeller;
	}
	
	//setter
	public void setPropeller(int propeller) {
		this.propeller = propeller;
	}
	//getter
	public int getPropeller() {
		return propeller;
	}
	
	//info
	public String info() {
		return super.info() + ", 프로펠럴: " + propeller; 
	}
	
	@Override
	public void howToMove() {
		System.out.println("플로펠러를 구동하며 움직인다.");
	}
}
