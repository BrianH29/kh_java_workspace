package com.kh.chap01_inherit.model.vo;

public class Vehicle {

	// 필드 
	private String name;
	private double mileage;
	private String kind; 
	
	//생성자
	public Vehicle() {
		
	}
	
	//매게 변수 생성자
	public Vehicle(String name, double mileage, String kind) {
		this.name = name;
		this.mileage = mileage;
		this.kind = kind;
		
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
		
	}
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	//getter
	public String getName() {
		return name;
		
	}
	public double getMileage() {
		return mileage;
	}
	public String getKind() {
		return kind;
	}
	
	public String info() {
		return "이름: " +  name + ", 마일리지: " + mileage + ", 종류: " + kind;
	}
	public void howToMove() {
		System.out.println("움직인다");
	}
	
}
	
