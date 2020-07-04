package com.kh.chap06_method.run;

import java.util.Scanner;

import com.kh.chap06_method.part01_methodTest.controller.MethodTest2;


public class Run {
	public static void main(String[] args) {
	
		// ----- ------------MethodTest1-----------------------
		/*
		MethodTest1 m1 = new MethodTest1();
		
		//method1 호출
		m1.method1();
		
		// System.out.println(m1.method1());  --> 빨간 줄 뜨는 이유는 다시 돌아 오는 반환값이 없기 때문에 이렇게 실행 할 수 없다. 
		
		System.out.println("============");
		
		//method2 호출
		String str = m1.method2();
		System.out.println(str);
		
		System.out.println("============");
		
		System.out.println(m1.method2()); // ---> 반환 갑이 있기 때문에 이렇게 한번에 호출 할 수 있다. 
		
		System.out.println("============");
		// method3
		// m1.method3();	--> 빨간줄 생기는 이유는 메소드에 int가 매개변수에 있는데 전달 값을 작성하지 안했기 때문에 그렇다 그러므로 숫자를 입력해야 함. 
		m1.method3(10, 5);
		
		System.out.println("============");
		//method4
		 int result = m1.method4(5, 2);
		 System.out.println(result);
		
		System.out.println(m1.method4(5, 2));
		
		System.out.println("============");
		
		User u = new User("user01", "pass01", "홍길동");
		System.out.println("현재의 u - " + u.info());
		
		m1.test(u);
		System.out.println(u.info());
		
		int[] arr = new int[4];
		
		m1.test2(arr);
		System.out.println(Arrays.toString(arr));
		*/
		
		// -------------------------MethodTest2---------------------------------
		
		//static 메소드이기 떄문에 객체가 필요없음.
		
		MethodTest2.method1();
		System.out.println("============");
		MethodTest2.method2();
		System.out.println(MethodTest2.method2());
		System.out.println("============");
		
		MethodTest2.method3("Brian");
		
		String str = MethodTest2.method4("Max");
		System.out.println(str);
		
		// method3 & method4 차이는 동일한 코드 인거 같지만 반환값이 있고 없고의 차이에서 나타난다 그래서 4는 str에 다시 받아서 내보내야 
		//하기 때문에 다시 프린트 아웃 해야 하는것이다. 그런데 3는 그런거 없이도 그냥 출력이 가능한다 왜냐하면 반환하는 값이 없기 때문이다. 
		
		// public static 메소드 호출시
		// 클래스명, 메소드명([전달값]);
		
		System.out.println(Math.random());
		
		//Math m = new Math(); // Math 클래스 모든게 다 public static
							// 즉, 클래스명. 으로 접근 가능 == 객체생성할 필요 없음
							// 아싸리 생성이 안되게끔 기본생성자의 접근제한자를 private으로 해놓음
		
		//Scanner sc = new Scanner(System.in);
	}

}
