package com.kh.chap01_inherit.after.model.vo;

public class Tv extends Product {

	//�ʵ�
	private int inch;
	
	//�⺻������
	public Tv() {
		
	}
	//�ŰԺ��� ������
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
		return super.information() + ", ��ġ: " + inch;
	}
}
