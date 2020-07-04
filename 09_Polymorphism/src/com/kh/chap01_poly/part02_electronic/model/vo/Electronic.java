package com.kh.chap01_poly.part02_electronic.model.vo;

public class Electronic {
	
	//field
	private String brand;
	private String name;
	private int price; 
	
	//constructor 
	public Electronic() {
		
	}
	
	//매개변수 constructor
	public Electronic(String brand, String name, int price) {
		this.brand = brand;
		this.name = name;
		this.price = price; 
	}
	
	//set/get
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand; 
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price; 
		
	}
	@Override
	public String toString() {
		return "브래드 : " + brand + ", 제품명: " + name + ", 가격: " +price; 
	}
}
