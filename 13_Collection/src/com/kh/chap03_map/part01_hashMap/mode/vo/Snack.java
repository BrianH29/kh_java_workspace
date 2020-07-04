package com.kh.chap03_map.part01_hashMap.mode.vo;

public class Snack {

	private String flavor;
	private int calory;

	public Snack() {}
	
	public Snack(String flavor, int calory) {
		this.flavor = flavor;
		this.calory = calory;
	}
	
	public int getCalory() {
		return calory;
	}

	public void setCalory(int calory) {
		this.calory = calory;
	}



	@Override
	public String toString() {
		return "Snack [flavor=" + flavor + ", calory=" + calory + "]";
	}
}
