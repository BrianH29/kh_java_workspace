package com.kh.chap03_class.model.vo;

// 접근제한자 : public > protected > default > private

// 클래스 앞에 기술할 수 있는 접근제한자 : public / default (생량 하는게 생성) 

public class Product {
	
	//필드부
	private String pName; 
	private int price; 
	private String brand; 
	
	//생성자부
	public Product() {	// 기본생성자 
		
		
	}
	
	// 메소드부
	
	public void setpName(String pName) {
		this.pName = pName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getpName() {
		return pName;
	}
	public int getPrice() {
		return price;
	
	}
	public String getBrand() {
		return brand;
	}
	
	public String info() {
		return pName + " " + price + " " + brand;
	}
}
