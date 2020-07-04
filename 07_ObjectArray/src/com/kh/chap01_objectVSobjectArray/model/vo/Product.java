package com.kh.chap01_objectVSobjectArray.model.vo;

public class Product {
	
	private String name;
	private String brand;
	private int price;
	
	//기본생성자
	public Product() { // -> 객체 생성의 목적 
		
	}
	// 매개변수생성자
	public Product(String name, String brand, int price) {
		this.name = name;	// -> 필드에 대입하기 위해 적어둬야 함. 
		this.brand = brand;
		this.price = price; 
		
	}
	// setter메소드
	public void setName(String name) {
		this.name = name;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	// getter메소드
	public String getName() {
		return name;
	}
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price; 
	}
	
	// information메소드 
	public String information() {
		return "제품: " +name + "  브랜드: " +brand + " 가겨: " + price;
	}

}
