package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class Run {

	public static void main(String[] args) {
		
		User a = new User();
		a.setUserId("litoman29");
		a.setUserPwd("123456");
		a.setUserName("홍길동");
		a.setAge(21);
		a.setGender('M');

		System.out.println("id: " + a.getUserId());
		System.out.println("pwd: " + a.getUserPwd());
		System.out.println("name: " + a.getUserName());
		System.out.println("age: " + a.getAge());
		System.out.println("gender: " + a.getGender());
		
		System.out.println(a.info());
		
		//1.기본생성자로 생성한 후에 각 필드에 setter 메소드를 통행 일일히 초기화 
		//User u1 = new User();
		// 단지 생성만 하고 출력해보면 JVM의 기본값들이 담겨있는거 확인 가능.
		//System.out.println(a.info());
		
		System.out.println("=========================");
		
		// 2. 매개변수 3개짜리 생성자로 객체 생성
		User u2 = new User("user02","pass02","황학천");
		// 생성과 동시에 userId userPwd userName에 초기화됨
		// 뭘로? 내가 전달한 값으로! 
		System.out.println(u2.info());
		
		System.out.println("=========================");
		
		//3. 매개변수 5개짜리 생서자로 객체생성
		User u3 = new User("user03","pass03","김말똥",10,'M');
		System.out.println(u3.info());
		
		u3.setAge(21); // ----> setter 메소드를 통해서 기존에 있던 정보를 수정 할수 있기 때문에 꼭 알아둬야 한다. 
		System.out.println(u3.info());
	}

	
	
}
