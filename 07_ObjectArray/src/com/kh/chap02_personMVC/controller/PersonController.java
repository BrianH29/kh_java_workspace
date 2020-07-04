package com.kh.chap02_personMVC.controller;

import com.kh.chap02_personMVC.model.vo.Person;

// Controller : 사용자가 view(화면)를 통해서 요청한 것들을 받아서 처리해주는 기능용 클래스

public class PersonController {

	// 세명의 회원 객체들을 보관할 수 있는 Person[] 배열 셋팅
	private Person[] people = new Person[3];

	// 현재 추가된 사람수를 나타내는 변수
	private int count = 0;

	// ** 회원 추가 요청을 처리하는 메소드
	public int insertPerson(String name, int age, int wealth) {

		int result = 0; // 성공 유무를 판단하기 위한 변수

		if (count < people.length) { // count 값이 2일때까지만 회원추가 가능
			people[count++] = new Person(name, age, wealth);
			// System.out.println("회원 추가 성공!!"); ---> 무조건 view에서 출력해야 하기 때문에 요기서 하지 않음
			result = 1;

		} else { // 회원추가 불가능
			// System.out.println("회원 추가 실해!!"); --> 위 내용과 동일
			result = 0;

		} // e.if

		// result 1 or 0일 것.
		return result;

	}// e.insertPerson

	// ** 현재 회원 수를 조회하는 요청을 처리하는 메소드
	public int selectCount() {
//		System.out.println("현재 회원은 "+ count + "명입니다.");
		return count;

	}// e.selectCount

	// ** 현재 회원 전체조회 요청을 처리하는 메소드
	public Person[] selectPeople() {
		/*
		 * for(int i=0; i<people.length; i++) {
		 * System.out.println(people[i].information()); }
		 */
		return people;

	}

	public Person searchPerson(String search) {

		
		Person searchPerson = null; // 변수 세팅 --> 검색해서 일치하는 회원 담아줄 변수 
		
		for (int i = 0; i < count; i++) {
			if (people[i].getName().equals(search)) {
				//System.out.println(people[i].information()); --> view에서 출력 해야함
				searchPerson = people[i];
				
			}//e.if
		}//e.for
		
		// 만약 일치하는 회원을 찾지 못했다면 이 시점에서의 searchPerson는 null
		return searchPerson;
		
	}// e.searchPerson
	
	public int selectAvgWealth() {
		
		//현재 추가된 회원들의 총 재산 
		int sum = 0; 
		/*
		sum += people[0].getWealth();
		sum += people[1].getWealth();
		sum += people[2].getWealth();
		*/
		for(int i=0; i<count;i++) {
			sum += people[i].getWealth();
			
		} //e.for
		
		//System.out.println("평균재산 : " + sum/count); --> view에서 출력해야함.
		
		return sum/count; 
	}//e.selectAvgWealth
	
}
