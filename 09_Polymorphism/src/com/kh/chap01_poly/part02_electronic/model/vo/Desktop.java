package com.kh.chap01_poly.part02_electronic.model.vo;

public class Desktop extends Electronic{

	public static final String CPU = "intel"; 
	
	private String graphic;
	
	//Constructor
	public Desktop() {
		
	}
	
	//매개변수 Constructor
	public Desktop(String brand, String name, int price, String graphic) {
		super(brand,name,price);
		this.graphic = graphic;
	}
	
	//set/get
	public void setGraphic(String graphic) {
		this.graphic = graphic;
	}
	public String getGraphic() {
		return graphic;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", CPU:" + CPU + ", 그래픽:" + graphic; 
	}
}
