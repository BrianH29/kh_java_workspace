package com.kh.chap02_encapsulation.model.vo;

public class Student {

	private String name; // (name = field 명)
	private int age;
	private double height;
	
	
	
	// setter 메소드
	// -호출시 전달값을 각 필드에 대입시켜주는 메소드 
	// setName 내가 만들고 싶은데로~~~ 
	/* public void setName(String newName) {		//(newName==매개변수 == 메소드 호출 시 전달값을 받아주기 위한 변수 )
		 name = newName; 
	 }*/
	 
	 // ** 권장사항**
	 // setter메소드 이름지을떄 setXXXX로 낙타표기법 지킨채로 지어준다. ex) setName, setAge, setHeight
	 // setter메소드 매개변수명을 지을때 필드명과 동일하게 지어준다. 
	public void setName(String name) { 
		//name = name; // 매개변수 name = 매개변수 name
					 //{} 영역에서는 해당 영역에 만들어진 변수가 우선권을 가짐
		
		this.name = name; 	// this.name --> 필드명
		
	}
	 
	public void setAge(int age) {	//나이값을 변경시켜주는 메소드
		this.age = age; 
	}
	
	public void setHeight(double height) {
		this.height = height; 
		
		//return --> 보이지는 않지만 존재한다. jvm 이 만들어줌. basic code that is already in place
	}
	
	
	// getter메소드: 각 필드에 담겨있는 값을 반환시켜주는 메소드 
	public String getName() {
		return this.name;	// name 필드에 담긴값을 반환시켜주는 메소드  // 색깔로 구별하면 어떤것을 지시 하는지 알수 있음. 
	}
	
	public int getAge() {
		return this.age; 	// age 필드에 담긴값을 반환시켜주는 메소드
	}
	public double getHeight() {
		return this.height; 	// height 필드에 담긴값을 반환시켜주는 메소드 
	}
	
	
	// 모든 필드값들을 다 합친 문자열을 반환하는 메소드
	public String information() {
		
		// XXX님은 XX살이고, 키는 XXXcm입니다. 
		String info = name + "님은 " + age + "살이고, 키는 " + height + "cm입니다.";
		return info; 
		
	}
	
	
	
	
	
	
	
}
