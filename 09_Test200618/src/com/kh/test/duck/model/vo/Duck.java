package com.kh.test.duck.model.vo;

public class Duck {
	
	//필드 
	private String name;
	private String kinds;
	
	//생성자
	public Duck() {
		
	}
	
	//매개변수 생성자
	public Duck(String name, String kinds) {
		this.name = name;
		this.kinds = kinds;
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setKinds(String kinds) {
		this.kinds = kinds; 
	}
	
	//getter
	public String getName() {
		return name;
	}
	public String getKinds() {
		return kinds; 
	}
	
	public String toString() {
		return "저는" + kinds + "이고, 이름은 " + name + "입니다.";
	}
}
