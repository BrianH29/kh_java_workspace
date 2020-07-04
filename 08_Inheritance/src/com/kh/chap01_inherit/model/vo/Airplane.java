package com.kh.chap01_inherit.model.vo;

public class Airplane extends Vehicle { // inherit from Vehicle

	// field
	private int tire;
	private int wing;

	// ������
	public Airplane() {

	}

	// �ŰԻ�����
	public Airplane(String name, double mileage, String kind, int tire, int wing) {
		super(name, mileage, kind);
		this.tire = tire;
		this.wing = wing;

	}

	// setter
	public void setTire(int tire) {
		this.tire = tire;
	}

	public void setWing(int wing) {
		this.wing = wing;
	}

	// setter
	public int getTire() {
		return tire;
	}

	public int getWing() {
		return wing;

	}
	
	//info �������̵�
	public String info() {
		return super.info() + ", Ÿ�̾�: " + tire;
	}
	
	@Override
	public void howToMove() {
		System.out.println("������ �����ϸ� �����δ�.");
	}
}

