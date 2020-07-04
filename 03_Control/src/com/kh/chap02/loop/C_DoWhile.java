package com.kh.chap02.loop;

public class C_DoWhile {
	
	/*
	 * * do - while�� 
	 * 
	 * �ʱ��;
	 * 
	 * do {
	 * 		�ݺ������� ������ �ڵ�;
	 * 
	 * 		������;
	 * 
	 * }while(���ǽ�);
	 * 
	 * �ʱ�� --> ������ �ѹ��� ���� --> ������ -->
	 * ���ǽ� --> true�� ���� 	--> ������ -->
	 * ���ǽ� --> false�� ��� �ݺ��� ��������
	 * 
	 */

	public void method1() {
		int num = 1; 
		
		do {
			
			System.out.println("hi");	// ������ ���� �ʾƵ� ����.
			
		}while(num==0);
		
	}// end m1
	
	public void method2() {
		// 1 2 3 4 5
		
		int i = 1;
		do {
			
			System.out.println(i++ + " ");
			
		}while(i<=5);
		
		/*
		 *  i=1 ������1output i++
		 *  i=2 true 2output i++
		 *  i=3 true 3output i++
		 *  i=4 true 4output i++
		 *  i=5 true 5output i++
		 *  i=6 false 
		 */
		
	}// end m2
	
	public void method3() {
		// 1�������� ������ (1~100)������ �� �հ�
		
		int random = (int)(Math.random()*100+1);
		
		int sum = 0;
		
		int i = 1;
		
		do {
			//sum +=i;
			//i++;
			sum += i++;  // sum = sum + i++ 
		}while(i<=random);
		
		System.out.println("1����" + random + "������ �� �հ� : " + sum);
		
	}
	
}
