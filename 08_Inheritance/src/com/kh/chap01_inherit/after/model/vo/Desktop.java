package com.kh.chap01_inherit.after.model.vo;

// 자식클래스 extends 부모클래스
// 하위 클래스 extends 상위클래스 
public class Desktop extends Product {		// 클래스명에 부모클래스 가져온 것. 기존 클래스는 public class Desktop 이였음 
	
	// product 기입하지 않은 나머지 필드명
	private boolean allInOne;
	
	//기본생성자
	public Desktop() {
		
	}
	
	//매게 변수 생성자
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		
		//부모클래스에 접근하고자 할 떄 super.  으로 접근!! 
		
		//단, 접근하고자 하는 필드가  private일 경우는 직접 접근 불가!! public은 범위 가 너무 광범위 하기 때문에 protected을 사용
		
		// 1.부모클래스의 필드의 접근제한자를 상속구조에서 접근 가능한  protected ==> 부모필드에 직접접근 가능 
		/*
		super.brand = brand; // this 대신 super(상속 할때 사용)
		super.pCode = pCode;
		super.pName = pName;
		super.price = price; 
		*/
		
		//2. private일 경우는 어떻게? --> 간접적으로나마 접근할 수 있는 setter 메소드 호출하기 
		/*
		super.setBrand(brand);
		super.setpCode(pCode);
		super.setpName(pName);
		super.setPrice(price);
		*/
		
		//3.부모 생성자 호출하는 방법 
		super(brand, pCode, pName, price);
		
		this.allInOne = allInOne;
	}
	
	// setter
	public void setAllInOne(boolean allInOne) {
		this.allInOne =allInOne;
	}
	// getter 
	public boolean isAllInOne() {
		return allInOne;
	}
	
	// 부모 클래스와 동일한 메소드 만들었음 (반환형, 메소드명도 같은)
	//부모클래스꺼보다 자식클래스께 우선권을 가짐!!
	// ** 오버라이딩 **
	// 부모메소드 재정의하겠다!!
	public String information() {
		// 재정의 할꺼임!! 브랜드 ~ 일체여부까지 다 하나의 문자열로 합쳐서 반환하는 메소드로 재정의 하겠다
//		return	"브래드: "+ super.getBrand() + "제품코드: " + super.getpCode() + ", 제품명: "
//				+ super.getpName() + ", 가격: "+ super.getPrice() + ", 일체형: " + allInOne;
		
		return super.information() + ", 일체형: "  + allInOne; // 위와 같이 일일이 다 쓰는것 보다는 간다하게 정리하기 
	}

}
