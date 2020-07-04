package com.kh.chap01_inherit.model.vo;

public class Car extends Vehicle { // inherit from Vehicle

	//field
	private int tire;
	
	// ������
	public Car() {
		
	}
	
	//�ް�����������
	public Car(String name,double mileage, String kind, int tire) {
		super(name, mileage, kind);
		this.tire = tire; 
		
	}
	//setter
	public void setTire(int tire) {
		this.tire = tire;
	}
	//getter
	public int getTire() {
		return tire; 
	}
	
	//info over-writing
	public String info() {
		return super.info() + ", Ÿ�̾�: " + tire;
	}
	
	@Override
	public void howToMove() {
		System.out.println("������ �����ϸ� �����δ�.");
}
}