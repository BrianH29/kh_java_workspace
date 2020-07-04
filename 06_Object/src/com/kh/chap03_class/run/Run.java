package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Person;
import com.kh.chap03_class.model.vo.Product;

public class Run {
	public static void main(String[] args) {
		
		// 자료형 변수명
		Person p = new Person();
			
		// 필드 값 초기화
		p.setId("user01");
		p.setPwd("pass01");
		p.setName("황학천");
		p.setAge(20);
		p.setGender('M');
		p.setPhone("010-4606-2929");
		p.setEmail("brian@naver.com");
		
		System.out.println("이름: " + p.getName());
		System.out.println("age: " + p.getAge());
		
		// 위와 같이 다 하기 귀찮으면
		System.out.println(p.information());
		
		Product pro1 = new Product();
		pro1.setpName("Galaxy");
		pro1.setPrice(900000);
		pro1.setBrand("Samsung");
		
		/*System.out.println(pro1);
		
		int[] arr = new int[4];
		System.out.println(arr);*/
		
		Product pro2 = new Product();
		pro2.setpName("Iphone");
		pro2.setPrice(1300000);
		pro2.setBrand("Apple");
		
		System.out.println(pro1.info());
		System.out.println(pro2.info());
		
		// 1년이 흘렀습니다... 가격이 기존가격보다 100000 감소..
		//pro1.setPrice(800000);
		pro1.setPrice(pro1.getPrice() - 100000);
		pro2.setPrice(pro2.getPrice() - 100000);
		
		System.out.println("===1년 후 ..====");
		System.out.println(pro1.info());
		System.out.println(pro2.info());
		
		// 클래스 앞에 public: 어디서든 다 쓸 수 있음
		// 클래스 앞에 default = 같은 패키지안에 있는 클래스만 쓸 수 있음 (다른 패키지에서는 사용 불가)
		
	}

}
