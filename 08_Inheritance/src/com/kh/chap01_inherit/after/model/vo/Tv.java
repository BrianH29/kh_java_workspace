package com.kh.chap01_inherit.after.model.vo;

public class Tv extends Product {

	//필드
	private int inch;
	
	//기본생성자
	public Tv() {
		
	}
	//매게변수 생성자
	public Tv(String brand, String pCode, String pName, int price, int inch) {
		super(brand,pCode,pName,price);
		this.inch = inch; 
	}
	
	//setter
	public void setInch(int inch) {
		this.inch = inch;
	}
	
	//getter
	public int getInch() {
		return inch;
	}
	
	public String information() {
		return super.information() + ", 인치: " + inch;
	}
}
