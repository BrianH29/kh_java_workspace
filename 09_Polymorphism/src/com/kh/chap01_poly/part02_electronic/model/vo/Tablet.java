package com.kh.chap01_poly.part02_electronic.model.vo;

public class Tablet extends Electronic {

	private boolean penFlag;
	
	// constructor
	
	public Tablet() {
		
	}
	
	//매개변수 constructor
	public Tablet(String brand, String name, int price, boolean penFlag) {
		super(brand,name,price);
		this.penFlag = penFlag;
	}
	
	//set get
	public void setPenFlag(boolean penFlag) {
		this.penFlag = penFlag;
	}
	public boolean isPenFlag() {
		return penFlag;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", 펜플래그 :" + penFlag; 
	}
	
}
