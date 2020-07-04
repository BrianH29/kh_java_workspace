package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

public class ElectronicController {

	// 용산전자상가 가게 
	//1. 다형성 적용 안했을 떄 
	
	private Desktop desk;
	private NoteBook note; 
	private Tablet tab; 
	
	// 각각의 객체 전달받아서 필드에 초기화 시키는 메소드 3개 
	public void insert(Desktop d) {
		desk = d; 
	}
	
	public void insert(NoteBook n) {
		note = n; 
	}
	
	public void insert(Tablet t) {
		tab = t; 
	}
	
	
	// 각 필드에 담긴값 반환 시키는 메소드 3개 
	public Desktop selectDesktop() {
//		System.out.println(desk); --> run 에서 실행해야 하기 때문에 리턴으로 받아서 run에서 출력한다. 
		return desk;
	}
	
	public NoteBook selectNoteBook() {
		return note; 
	}
	
	public Tablet selectTablet() {
		return tab; 
	}
}














