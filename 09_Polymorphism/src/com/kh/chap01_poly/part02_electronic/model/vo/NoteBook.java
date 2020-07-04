package com.kh.chap01_poly.part02_electronic.model.vo;

public class NoteBook extends Electronic{

	private int usbPort;
	
	//constructor
	public NoteBook() {
		
	}
	
	
	//�Ű����� constructor
	public NoteBook(String brand, String name, int price, int usbPort) {
		super(brand,name,price);
		this.usbPort = usbPort;
	}
	
	//set get
	public void setusbPort(int usbPort) {
		this.usbPort = usbPort;
	}
	public int getusbPort() {
		return usbPort; 
		
	}
	
	@Override
	public String toString() {
		return super.toString() + ", �������� : "+ usbPort;
	}
}
