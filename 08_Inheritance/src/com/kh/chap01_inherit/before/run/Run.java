package com.kh.chap01_inherit.before.run;

import com.kh.chap01_inherit.before.model.vo.Desktop;
import com.kh.chap01_inherit.before.model.vo.SmartPhone;
import com.kh.chap01_inherit.before.model.vo.Tv;

public class Run {
	public static void main(String[] args) {
		
		// Desktop 기본 생성자로 객체 생성 --> setter로 각각 가져 와야 함. 
		// but 매게 변수생성자를 불러 오면 간단하게 사용 할 수 있음. 
		// 매개변수는 불러오는 클라스에 매게변수생성자에 작성 해둔 순서 맞춰서 작성해야 함. 
		Desktop d = new Desktop("삼성","d-01","짱짱데스크탑",1000000,true);
		
		
		// SmartPhone 객체생성(메개변수)
		// SmartPhone s = new SmartPhone(); --> 기본생성자 불러 오기
		SmartPhone s = new SmartPhone("애플","s-01","아이폰",1300000,"KT"); // 매개변수 생성자로 객체생성
		
		//Tv 객체 생성
		Tv t = new Tv("LG","t-01","겁나얇은티비",3500000,60);
		
		System.out.println(d); // --> 출력을 해보면 com.kh.chap01_inherit.before.model.vo.Desktop@15db9742
		System.out.println(s); // --> com.kh.chap01_inherit.before.model.vo.SmartPhone@6d06d69c
		System.out.println(t); // --> com.kh.chap01_inherit.before.model.vo.Tv@7852e922
		// 위와 같이 할 경우 주소 값만 나온다. 
		
		System.out.println("==================================================");
		
		System.out.println(d.information()); // --> 브랜드 :삼성, 제품코드: d-01, 상품명: 짱짱데스크탑, 가격: 1000000, 일체형: true
		System.out.println(s.information());
		System.out.println(t.information());
		
		// 이 세 개의 클래스에는 공통적인 필드, 메소드 존재함
		// 이런 중복된 코드를 부모 클래스로 한번만 저의를 해두고 
		// 그 부모꺼 가져다 쓰겠다느는 개념의 상속을 배워볼꺼임! 
		
		// 나중에 유지보수를 하게될 때 일일히 찾아가서 수정할 필요없이
		// 부모클래스만 수정해주면 모든 곳에 반영됨
		
		// 세 클래스가 가지고 있는 공통적인 필드
		// brand, pCode, pName, price
		// 세 클래스가 가지고 있는 공통적인 메소드 
		// 위의 공통적인 필드 때문에 작성된 set/getter메소드, information메소드 
		
		// --> Product 부모 클래스로 단 한번만 정의 해두겠음! 
		
		
		
	}

}
