package com.kh;

import com.kh.test.person.model.vo.Person;

public class Test {
	public static void main(String[] args) {
	
		Person[] pArr = new Person[3];
		
		pArr[0] = new Person("Brian",'M');
		pArr[1] = new Person("Max",'M');
		pArr[2] = new Person("Jen",'F');
		
		for(int i=0; i<pArr.length;i++) {
			System.out.println(pArr[i].getName());
		}
		
	}
	

}
