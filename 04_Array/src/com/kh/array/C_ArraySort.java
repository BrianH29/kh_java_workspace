package com.kh.array;

import java.util.Arrays;

//�迭 ����
public class C_ArraySort {

	public void method1() {
		//������ ������ ���� �����غ���
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.println("====������====");
		System.out.println("num1 : "+ num1);
		System.out.println("num2 : "+ num2);
	
		/*
		num1 = num2;	// num1 = 20
		num2 = num1;	// num2 = 20
		*/
		
		int temp = num1;	// temp = 10;		// �ӽ÷� �Ѱ��� ���� �����ص� ����  
		
		num1 = num2;	// num1=20
		num2 = temp;	// num2=10;
		
		
		
		System.out.println("====������===");
		System.out.println("num1 : "+ num1);
		System.out.println("num2 : "+ num2);
	}
	
	public void method2() {
		
		int[] arr = {2, 1, 3};		// 0�� �ε��� ���� 1�� �ε��� ������ �ʿ�
		// arr[0] <-> arr[1]
		
		//arr[0] = arr[1];	// arr[0] = 1
		//arr[1] = arr[0];	// arr[1] = 1
		
		int temp = arr[0];
		
		arr[0] = arr[1];	//arr[0] = 1
		arr[1] = temp;		//arr[1] = 2
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " " );
		}
		
	}
	
	public void method3() {
		
		int[] arr = {2, 5, 4, 1, 3};
		
		// ����ü(��) => �ٱ��� for�� (i)
		// �񱳴��(��) => ���� for��	 (j)
		
		/*
		 * ����ü �񱳴��
		 * i=0�϶� j=x
		 * i=1�϶� j=0~0
		 * i=2�϶� j=0~1
		 * i=3�϶� j=0~2
		 * i=4�϶� j=0~3
		 * 
		 * i=0~�������ε���		 j=0~i-1
		 */
		
		//�������� ����
		
		//1. �� ��ü�� ���ϴ� for�� 
		for(int i=0; i<arr.length;i++) {
			
			//2. �ش� �� ��ü�� ���� �񱳴���� ���ϴ� for��
			for(int j=0; j<i; j++) {	// 0�������� i-1�� ���� 1�� ���� �ݺ�
				
				// ����ü (��)�� �񱳴��(��)���� ���� ��� �� ��ȯ
				if(arr[i] < arr[j]) {		// ����� �������������� ���������ÿ��� ������ ���⸸ �ٲ��ָ� ��. 
					
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
					System.out.println("===��ȯ�߻�===");
					
				}//if 
			}// ���� for��
		}//�ٱ�for
		
		//���� �� �Ǿ����� ���
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
		
	}
	
	public void method4() {
		
		int[] arr = {2, 5, 4, 1, 3};
		
		Arrays.sort(arr);	// �������� ���� ��
		
		System.out.println("===��������===");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}//for
		
		System.out.println();
		
		/*System.out.println("===��������===");
		for(int i=arr.length;i<0;i--) {
			System.out.print(arr[i] + " ");
		}//for*/
		
		
		System.out.println("====���ڿ�ȭ====");
		System.out.println(Arrays.toString(arr));		//���ڿ� ȭ ��Ű�� ���
		
		//Arrays.toString(�迭) --> "[" + �迭�� ���ε������� + "," + .... + "]" 
	}
	
		
	}
	