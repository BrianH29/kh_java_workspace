package com.kh.chap04_assist.part02_object.model.vo;

import java.io.Serializable;

public class Phone implements Serializable{

	//����ȭ �����ؾߵ�!! (��ü ��ü�� ����� �ϰ��� �Ѵٸ� ) 
	
	
	//field
	private String brand;
	private String name;
	private int price;
	
	//constructor
	public Phone() {
		
	}
	//parameter
	public Phone(String brand, String name, int price) {
		this.brand = brand;
		this.name = name;
		this.price = price;
	}
	
	//set get
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override 
	public String toString() {
		return "Phone  " + "[�귣��:" + brand + " ,����:" + name + ", �ݾ�:" + price + "]"; 
	}
	
}
