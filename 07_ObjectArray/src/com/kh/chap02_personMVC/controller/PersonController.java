package com.kh.chap02_personMVC.controller;

import com.kh.chap02_personMVC.model.vo.Person;

// Controller : ����ڰ� view(ȭ��)�� ���ؼ� ��û�� �͵��� �޾Ƽ� ó�����ִ� ��ɿ� Ŭ����

public class PersonController {

	// ������ ȸ�� ��ü���� ������ �� �ִ� Person[] �迭 ����
	private Person[] people = new Person[3];

	// ���� �߰��� ������� ��Ÿ���� ����
	private int count = 0;

	// ** ȸ�� �߰� ��û�� ó���ϴ� �޼ҵ�
	public int insertPerson(String name, int age, int wealth) {

		int result = 0; // ���� ������ �Ǵ��ϱ� ���� ����

		if (count < people.length) { // count ���� 2�϶������� ȸ���߰� ����
			people[count++] = new Person(name, age, wealth);
			// System.out.println("ȸ�� �߰� ����!!"); ---> ������ view���� ����ؾ� �ϱ� ������ ��⼭ ���� ����
			result = 1;

		} else { // ȸ���߰� �Ұ���
			// System.out.println("ȸ�� �߰� ����!!"); --> �� ����� ����
			result = 0;

		} // e.if

		// result 1 or 0�� ��.
		return result;

	}// e.insertPerson

	// ** ���� ȸ�� ���� ��ȸ�ϴ� ��û�� ó���ϴ� �޼ҵ�
	public int selectCount() {
//		System.out.println("���� ȸ���� "+ count + "���Դϴ�.");
		return count;

	}// e.selectCount

	// ** ���� ȸ�� ��ü��ȸ ��û�� ó���ϴ� �޼ҵ�
	public Person[] selectPeople() {
		/*
		 * for(int i=0; i<people.length; i++) {
		 * System.out.println(people[i].information()); }
		 */
		return people;

	}

	public Person searchPerson(String search) {

		
		Person searchPerson = null; // ���� ���� --> �˻��ؼ� ��ġ�ϴ� ȸ�� ����� ���� 
		
		for (int i = 0; i < count; i++) {
			if (people[i].getName().equals(search)) {
				//System.out.println(people[i].information()); --> view���� ��� �ؾ���
				searchPerson = people[i];
				
			}//e.if
		}//e.for
		
		// ���� ��ġ�ϴ� ȸ���� ã�� ���ߴٸ� �� ���������� searchPerson�� null
		return searchPerson;
		
	}// e.searchPerson
	
	public int selectAvgWealth() {
		
		//���� �߰��� ȸ������ �� ��� 
		int sum = 0; 
		/*
		sum += people[0].getWealth();
		sum += people[1].getWealth();
		sum += people[2].getWealth();
		*/
		for(int i=0; i<count;i++) {
			sum += people[i].getWealth();
			
		} //e.for
		
		//System.out.println("������ : " + sum/count); --> view���� ����ؾ���.
		
		return sum/count; 
	}//e.selectAvgWealth
	
}
