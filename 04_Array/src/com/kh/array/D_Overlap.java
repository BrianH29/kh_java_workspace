package com.kh.array;

import java.util.Scanner;
import java.util.Arrays;

public class D_Overlap {

	//�ߺ�����
	
	public void method1() {
		
		//����ڿ��� �Է¹��� ���� �Ź� 0�� �ε������� ���� �������� ���
		//��, ������ ���� �߿��� ��� �Է¹��� ���� �ߺ��� ���� ���� ��� �ٽ� �Է¹ްԲ�
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i=0; i<arr.length; i++) {	//outside ����ü
			
			System.out.print(i + "��° ������: ");
			arr[i] = sc.nextInt();
			
			for(int j=0; j<i; j++) {	//inside �񱳴��
				if(arr[i] == arr[j]) {	// �ߺ��Ȱ��� Ȯ�� 
					System.out.println("�����Ȱ��� �����մϴ�. �ٽ��Է����ּ���");
					i--;
					break;
				}	// e.if
				
			}	//inside for
					
		}//outside for
		//Arrays.sort(arr);	�������� ����
		System.out.println(Arrays.toString(arr));
				
	}
	
	public void method2() {	
		
		int[] arr = new int[5];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*10+1);
			
			for(int j=0;j<i;j++) {
				if(arr[i] == arr[j]) {
					System.out.println("�ߺ����߻�! �ٽ� ���� �� �߻�.");
					i--;
					break; 
					
				}// e.if
			}//inside for
		}//outside for 
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}	//e.m2
	
}
