package com.kh.chap04_field.run;

import com.kh.chap04_field.model.vo.FieldTest1;
import com.kh.chap04_field.model.vo.FieldTest2;
import com.kh.chap04_field.model.vo.FieldTest3;
import com.kh.chap04_field.model.vo.FieldTest4;

public class Run {

	public static void main(String[] args) {
	
		/*FieldTest1 f1 = new FieldTest1();
		f1.test(5);*/
		
		
		// ======= FieldTest2 =======
		FieldTest2 f2 = new FieldTest2();
		
		// public --> 어디서든 직접 접근 가능  
		System.out.println(f2.pub);
		
		// protected--> run이랑 fieldtest2 다른 패키지 이기 때문에 public처럼 실행이 불가능하다. 같은 패키지 내에서 만 실행 가능. 다른 패키지 일 경우 상속패키지 일떄 가능 
		//System.out.println(f2.pro);
		
		// default --> 같은 패키지에서만 가능. 
		// System.out.println(f2.def);
		
		//private --> 오로지 그 클래스에서만 접근 가능
		// System.out.println(f2.pri);
		
		// ------ FieldTest3 ------
		// static 예약어가 붙은 순간 해당 클래스로 궂이 객체생성 안해도 프로그램 구동과 동시에 static 메모리영역에 변수가 할당
		
		// 해당 public static 변수에 접근하가고자 한다면 ---클래스명.변수명---
		System.out.println(FieldTest2.sta);
		System.out.println(FieldTest3.sta);
		
		FieldTest2.sta="ss";
		
		//FieldTest4.NUM = 10; 
		System.out.println(FieldTest4.NUM);
		System.out.println(Math.PI);
		
	}

}
