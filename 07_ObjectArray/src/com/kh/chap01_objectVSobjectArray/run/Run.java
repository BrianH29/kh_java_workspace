package com.kh.chap01_objectVSobjectArray.run;

import com.kh.chap01_objectVSobjectArray.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		
		// ��ǰ��ü 3���� ������ arr �迭 ����
		Product[] arr = new Product[3];
		
		// �� �ε����� ��ǰ ��ü�� ���
		arr[0] = new Product("���ϼ�", "����", 100000);
		arr[1] = new Product("������", "���", 130000);
		arr[2] = new Product("����", "����", 80000);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i].information());
		}
		
		// �ܼ��� for��
		// �� ������ �ʿ� ���� � �κи� �ʿ��Ҷ� get�� ��� 
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i].getName());
		}
		
		// ���� for��
		int[] iArr = new int[3];
		
		for(int num : iArr ) {	// int i = iArr[0]; -- > int i - iArr[1]; --> int i = iArr[2];
			System.out.println(num);
		}
		
		// Product[] arr = new Product[3];
		for(Product p : arr) {	// Product p = arr[0]; --> Product p = arr[1]; --> Product p =arr[2];
			System.out.println(p.information());
		}
		
	}
	
}
