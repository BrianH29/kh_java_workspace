package com.kh.array;

import java.util.Scanner;

public class A_Array1 {

	// �迭 : ���� �ڷ����� ������ �ϳ��� ������ ���� �� �ִ� ����
		// 		����� ������ �ε����� ������ (�ε����� 0���� ���۵�)
		
		public void method1() {
			// �迭�� �� ������
			int num1 = 0;
			int num2 = 1;
			int num3 = 2;			// ���� �ڷ����̱� ������ � �Ѱ����� �ʾ�θ� ���? �׷��� �迭 ���
			int num4 = 4;
			int num5 = 5;
			
			//����ϰ��� �Ҷ���
			/*System.out.println(num1);
			System.out.println(num2);
			System.out.println(num3);*/
			
			// �� �հ踦 ���ϰ��� �� ����
			int sum = num1 + num2 + num3;
			
			/*
			 * 1.�迭 ����(�������� ������ ������ �迭�� ����ڴ�!!)
			 * 	 �ڷ��� �迭��[];
			 *	�ڷ���[] �迭��;		// �� ��ȣ ��Ÿ��
			 *
			 *
			 * 
			 */
			
			//int a; 	// �ܼ��� ���� ����
			
			//int arr[];
			//int[] arr;
			
			/*
			 * 2.�迭 �Ҵ�(�� �迭�� �� ���� ������ �����Ұ��� ũ�� �����ϴ� ����, �� ������ŭ ���� �������)
			 * 	 �迭�� = new �ڷ���[�迭ũ��];
			 * 
			 */
			
			//arr = new int[5];
			
			// * �迭 ����� ���ÿ� �Ҵ� (�迭 ����� ���ÿ� ũ�� �����ϰڴ�.)
			int a = 10;
			
			int[] arr = new int[5];		// �� �濡 ����� �ϴ� ���� �Է��صδ� ����. 
			
			/*
			 * 3. �� �ʱ�ȭ(����)
			 * 	  �迭��[�ε���] = ��;
			 * 
			 * 
			 */
			
			/*arr[0] = 0;
			arr[1] = 1;
			arr[2] = 2;*/
			
			// �迭 ���� : �ݺ����� ����� �� �ִٴ� ����
			//for(int i=0; i<=4; i++) {		// 0���� ���� 4���� 1�� �����ϴ� ���� �ݺ��� ����ǰԲ�
			for(int i=0; i<arr.length; i++) {
			//for(int i=0; i<=arr.length-1; i++) {	// �迭�� ���� : �迭��.length
				arr[i] = i;
				
			}
			/*
			System.out.println(arr[0]);
			System.out.println(arr[1]);
			System.out.println(arr[2]);
			System.out.println(arr[3]);
			System.out.println(arr[4]);*/
			
			// ��¹� ���� �ݺ�������
			//for(int i=0; i<=arr.length-1;i++) {
			for(int i=0; i<arr.length;i++) {
				System.out.println(arr[i]);
			}
			
			System.out.println(arr);
			
			
		}
		
		public void method2() {
			
			int i =10;
			
			int[] iArr = new int[5];
			
			
		}
		public void method3() {
			
			int[] iArr = new int[3];	// 0~2
			
			double[] dArr = new double[5]; // 0~4
			
			// �迭 �����ϰ� ũ������(�Ҵ�)���� �� ����
			
			for(int i =0; i<iArr.length; i++) {
				System.out.println(iArr[i]);
			}
			
			for(int i=0; i<dArr.length;i++) {
				System.out.println(dArr[i]);
			}
			
			// ���� �ʱ�ȭ�� ���� ���� �ʾƵ� �� ��µ�
			// ��?
			
			// Heap�̶�� ������ ���� ������� ������ �� ����
			// ���� ������ ������� ��
			// JVM�� �⺻������ �ʱ�ȭ (����)�� ��������

		}
		public void method4() {
			
			int[] iArr = new int[5];		// �迭 ũ�� ������ �ص� �� for���� iArr.length�� ����ϸ� �� �κ��� �Ȱ��� ������ �������� �ʾƵ� �ȴ�. 
			
			/*
			iArr[0] = 1;
			iArr[1] = 2;
			iArr[2] = 3;
			iArr[3] = 4;
			iArr[4] = 5;
			*/
			
			for(int i=0;i<iArr.length;i++) {
				iArr[i] = i+1; 
				
				// i=0 true [0] 1
				// i=1 true [1] 2
				// i=2 true [2] 3
				// ......
				// i
			}
			for(int i=0; i<iArr.length; i++) {
				System.out.println(iArr[i]);
			}
			System.out.println(iArr);
			System.out.println(iArr.hashCode()); // �ּҰ��� 10���� Ȯ�� ������ 
			
		}
		public void method5() {
			// ����ڿ��� �Է¹��� �� ��ŭ �迭�� ũ�� �����ϱ�!
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("�迭�� ũ��: ");
			int size = sc.nextInt();
			
			double[] dArr = new double[size];		// �迭 �Ҵ��Ҷ� ���� �ϸ� ���� ����. 0��  �ϸ� �ȵ�. 
			
			System.out.println(dArr);
			System.out.println(dArr.hashCode());
			System.out.println(dArr.length);
			System.out.println(dArr[0]);
			
			
		}
		public void method6() {		//s.m6
			
			int[] iArr = new int[5];	// 0~4 �� �� Heap�� ����
			
			/*
			iArr[0] = 2;
			iArr[1] = 4;
			iArr[2] = 6;
			iArr[3] = 8;
			iArr[4] = 10;
			*/
			
			int num = 2;
			for(int i = 0; i<iArr.length;i++) {	//s.for
				iArr[i] = num;
				num +=2;
				
			}	//e.for
			
			for(int i=0; i<iArr.length;i++) {
				System.out.println(iArr[i]);
			}
//			System.out.println("iArr�� hashcode : " + iArr.hasCode());
			System.out.println("iArr�� length :" + iArr.length);
			
			//�迭 ũ�� ���� �� �־�� (���� ��ü�� �ȵ�!!)
			//iArr[5] = 12;		// �ѹ� ������ ũ��� ���� �Ұ��ϴ�. ���� ó�� �迩�� �ø��� �ʹٰ� �ص� �Ұ����ϴ�. 
			
			/*
			 * �迭�� ���� ū ����
			 * 1. �ѹ� ������ �迭�� ũ��� ���� �Ұ�!!
			 * 	  �迭�� ũ�⸦ �����ϰ��� �Ѵٸ� �ٽ� �������� �Ѵ�. 
			 */
			
			iArr = new int[7];
			
			System.out.println("====���� �� iArr====");
			System.out.println("iArr�� hashCode : " + iArr.hashCode());
			System.out.println("iArr�� length : " + iArr.length);
			
			/*
			 * ������ �����ϰ� �ִ� ������ ����� ���ο� �� ����
			 * 
			 * ������ ������ ���� �迭�� Heap ������ �յ� ���ٴѴ�.
			 * =>���� �ð��� ������ Garbage Collector ������
			 * 	(�ڵ� �޸� ����)
			 */
			
			
			// ���� ����Ǿ��ִ� ������ ������ �Ѵٸ� ��� ?
			iArr = null; // null = �ּ� ���� ���� �ϰڴ�. �ƹ��͵� �������� �ʰڴ�. 
			System.out.println("====���� �� iArr====");
			System.out.println(iArr);
			System.out.println("iArr�� hashCode : " + iArr.hashCode());
			System.out.println("iArr�� length : " + iArr.length);
			
			//null.xxx() => NullPointerException
			
		}		// e.m6
		
		public void method7() {
			
			// �迭 ���� �� �Ҵ� �� ���ÿ� �ʱ�ȭ �ع�����
			int[] arr1 = {1,2,3,4};			// ���� �����̿��� ����.. ����ڷ� ���� �Է� �޾Ƽ� �� �ÿ��� ���� �ٲ�� ������ ����ϱ� �����
											// ���� ������ŭ �ڵ����� ũ�Ⱑ �Ҵ��(���������� �����)
			int[] arr2 = new int[] {1,2,3,4};
			
			System.out.println("arr1�� ���� : " + arr1.length);
			System.out.println("arr2�� ���� : " + arr2.length);
			
			System.out.println(arr1 == arr2);
		
		}
		
		public void method8() {			// s.m8 // t����ڿ��� �Է¹��� ������ �迭�غ���
		
			String[] sArr = new String[5];	// 0~4
			
			Scanner sc = new Scanner(System.in);	// �Է¹ޱ�
			
			for(int i=0; i<sArr.length;i++) {		// s.for �Է� �޴°��� �������� �׾Ƶα� ����
				System.out.print("�����ϴ� ���� �Է�: ");
				sArr[i] = sc.nextLine();
	
			}		//e.for
			
			for(int i=0; i<sArr.length;i++) {	//s.for �� �迭 ����ϱ� ���� for
				System.out.println(sArr[i]);
				
			}	//e.for
		
		}		//e.m8
		
		public void method9() {	//s.m9		// �Ź� �������� �����°��� �迭�� �־�α�
			
			// ũ�� 10¥�� int�� �迭 ���� �� ������(1~100)�� ��Ƽ� ����ϱ�
			
			int[] arr = new int[10];
			
			for(int i=0; i<arr.length;i++) {	//s.for
				arr[i] = (int)(Math.random()*100+1);
				
			}	//e.for
		
			for(int i=0; i<arr.length;i++) {	//s.for
				//System.out.println("arr[" + i +"] :" + arr[i]); 
				System.out.printf("arr[%d] : %d\n",i,arr[i]);
			}	//e.for

		}	// e.m9
		
		public void method10() {
			
			// 3���� ����ڿ��� Ű�� ������ �Է¹޾� �迭�� ��Ƶα�
			// 3���� Ű�� ����, ��հ��� ���Ͻÿ�
			
			Scanner sc = new Scanner(System.in);
			
			double[] heights = new double[3];
			
			for(int i=0;i<heights.length;i++) {
				System.out.println("Ű �Է� : ");
				heights[i] = sc.nextDouble();
			}
			
			// ���� sum += heights[0];
			// 	  sum += heights[1];
			// 	  sum += heights[2];
						
			double sum = 0.0;
			for(int i=0;i<heights.length; i++) {
				sum += heights[i];
			}
			System.out.println("���� : " + sum);
			System.out.println("��� : " + sum/heights.length);
			
		}
		public void method11() {
			
			// 1. ����ڿ��� �Է¹��� ����ŭ �迭�� ũ�� ���� ��
			Scanner sc = new Scanner(System.in);
			
			System.out.println("�迭 ũ��: ");
			int size = sc.nextInt();
			
			int[] arr = new int[size];
			
			// 2. 0~�������ε������� ������ ���� ��
			for(int i=0; i<arr.length;i++) {
				arr[i] = (int)(Math.random()*100+1);
				
			}
			// 3. 0~�������ε��������� �� ��� �ϸ鼭 ¦������ ���� ���
			int sum = 0;
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i] + " ");
				
				if(arr[i] % 2 == 0) {
					sum += arr[i];	
				}
				
				
			}
			// 4. ���� ���
			System.out.println("\n¦���� ���� : " + sum);
			
		}
		
		public void method12() {
			
			// ����ڿ��� ���ڿ� �Է¹��� �� �� ���ڵ��� char�迭�� ���
			
			// 1. ����ڰԿ� ���ڿ� �Է¹ޱ� 
			Scanner sc = new Scanner(System.in);
			
			System.out.print("���ڿ� �Է� : ");
			String str = sc.nextLine(); // "apple"
			
			// 2. char�迭 ���� ( �迭 ũ�� == ���ڿ��� ���̸�ŭ)
			char[] arr = new char[str.length()];
			
			// 3. �ش� ���ڿ����� �� �ε����� ���ڸ� char�迭�� 0~�������ε������� ���
			// arr[0] = str.charAt(0);
			// arr[1] = str.charAt(1);
			// .....
			//arr[�������ε���] = str.charAt(�������ε���); 
			//arr[����-1] = str.charAt(����-1);
			for(int i=0;i<arr.length;i++) {
				arr[i] = str.charAt(i);
				
			}
			
			// 4. 0~�������ε��������� �� ��� 
			for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]);
			}
			
		}
		
}








