package com.kh.test.duck.controller;

import com.kh.test.duck.model.vo.Duck;

public class DuckManager {
	public static void main(String[] args) {
		
		Duck[] arr = new Duck[5];
		
		arr[0] = new Duck("������", "������");
		arr[1] = new Duck("û�տ���", "�в�");
		arr[2] = new Duck("������", "����");
		arr[3] = new Duck("û�տ���", "û��");
		arr[4] = new Duck("û�տ���", "�̼�����");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i].toString());
		}
	}

}
