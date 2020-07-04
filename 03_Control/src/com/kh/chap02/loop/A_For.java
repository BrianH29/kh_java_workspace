package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {

	/*
	 * < �ݺ��� >
	 * ���α׷� ���� �帧�� �����ϴ� ��� �� �ϳ�
	 * � �����ڵ带 �ݺ������� ���� �����ش�. 
	 * 
	 * ũ�� �� ������ ���� (for�� / while��(do-while��) )
	 * 
	 *  * for��
	 *  
	 *  for(�ʱ��; ���ǽ�; ������) {
	 *  	.. �ݺ������� �����Ű���� �ϴ� ���� ���� .. 
	 * }
	 * 
	 * for ���� ������ ����
	 * �ʱ�� >> ���ǽ� �˻� >> true�� ��� ���౸�� ���� >> ������ >> 
	 * 				   ���ǽ� �˻� >> true�� ��� ���౸�� ���� >> ������ >>
	 * 				   ���ǽ� �˻� >> true�� ��� ���౸�� ���� >> ������ >>
	 * 				------------------- �� ������ ��� �ݺ� ------------------------
	 * 				   ���ǽ� �˻� >> false�� ��� ���౸�� ����X  >> �ݺ��� ��������
	 * 
	 * - �ʱ�� : �ݺ����� ����� �� "�� �ѹ��� ����Ǵ� ����"
	 * 				(���� �ݺ��� �ȿ��� ���� ������ ���� �� �ʱ�ȭ �ϴ� �κ�)
	 * 
	 * - ���ǽ� : "�ݺ����� ����� ����"�� �ۼ��ϴ� ����
	 * 				���ǽ��� true�� ��� �ش� ���� ������ ����
	 * 				���ǽ��� false�� �Ǵ� ���� �ݺ��� ���߰� ���������� ��
	 * 				(���� �ʱ�Ŀ��� ����� ������ ������ ���ǽ��� �ۼ���)
	 * 
	 * - ������ : �ݺ����� �����ϴ� ���� ���� ������Ű�� �κ�
	 * 				(���� ����������( ++, -- )�� ������ �ۼ���
	 * 
	 */
	
	public void method1() {
		// "hi" output 5x
		
		for(int i=1; i<=5; i++) {		// 1�������� 5���� 1�� ������ ���� �ݺ��Ѵ�.
			System.out.println("hi");
		}
		/*
		 * i=1, i(1)<=5 true [output]  i++;
		 * i=2, i(2)<=5 true [output]  i++;
		 * i=3, i(3)<=5 true [output]  i++;
		 * i=4, i(4)<=5 true [output]  i++;
		 * i=5, i(5)<=5 true [output]  i++;
		 * i=6, i(6)<=5 false �ݺ��� ��������. 
		 */
	
	}
	
	public void method2() {		// start m2
		// 1���� 5���� ���
		
		/*for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
		/*
		 *  i=1 true 1 output i++
		 *  i=2 true 2 output i++
		 *  i=3 true 3 output i++
		 *  i=4 true 4 output i++
		 *  i=5 true 5 output i++
		 *  i=6 false �ݺ��� ��������
		 */
		
		for(int i=1; i<=5; i++) {
			System.out.print(i + " ");
		}
		
		
	}		// end m2
	
	public void method3() {
		// 5 4 3 2 1
		
		for(int i=5; i>=1; i--) {
			System.out.print(i + " ");
		}
		/*
		 * i=5 true 5output i--
		 * i=4 true 4output i--
		 * i=3 true 3output i--
		 * i=2 true 2output i--
		 * i=1 true 1output i--
		 * i = 0 false , stop �ݺ����� ��������.
		 */
		
	}
	
	public void method4() {		// start m4
		
		// 1 2 3 4 5 ...... 9 10
		for(int i=0; i<=9; i++) {		// 0~9���� 1�� �����ϴ� ���� �ݺ� >> 10Ƚ��
			System.out.print(i+1 + " ");
		}
		
		for(int i=0; i<=9; i++) {		// 0~9���� 1�� �����ϴ� ���� �ݺ� >> 10Ƚ��
			System.out.print(i++ + " ");
		}
		/*
		 * i=0, i(0)<=5 true [output]  i++; 0
		 * i=1, i(1)<=5 true [output]  i++; 2
		 * i=2, i(3)<=5 true [output]  i++;
		 * i=4, i(4)<=5 true [output]  i++;
		 * i=5, i(5)<=5 true [output]  i++;
		 * i=6, i(6)<=5 false �ݺ��� ��������. 
		 */
		
	}	// end m4
	
	public void method5( ) {
		// 1���� 10 ������ Ȧ������ ���
		// 1 3 5 7 9
		
		/*for(int i=1; i<=10; i++) {
			if(i % 2 == 1) {
				System.out.print(i + " "); 
			}
			
			}*/
		for(int i =1; i<=10; i+=2) {	// 1�������� 10���� 2�� �����ϴµ��� �ݺ� 
			System.out.print(i + " ");
		}
		/*
		 *  i=1 i(1)true i+=2 (3)
		 *  i=3 i(3)true i+=2 (5)
		 *  i=5 i(5)true i+=2 (7)
		 *  i=7 i(7)true i+=2 (9)
		 *  i=9 i(9)true i+=2 (11)
		 *  i=11 i(11) false 
		 */
	}
	
	public void method6() {		// start m6
		// 1���� 10������ �������� �հ�
		// int sum = 1+2+3+4+5+6+7+8+9+10
		
		int sum = 0;
		// sum +=1;
		// sum +=2;
		// sum +=3;
		// ....
		// sum +=10;
		
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		System.out.println("�� : " + sum);
		
		/*
		 * 
		 */
		
	}		// end m6
	
	public void method7() {
		// 1���� ����ڰ� �Է��� �������� �հ踦 ���Ͻÿ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : " );
		int num = sc.nextInt();
		
		// sum += 1;
		// sum += 2;
		// ........
		// sum += num;
		
		int sum = 0;
		
		for(int i=1; i<=num; i++) {	// 1�������� num���� 1�� �����ϴ� ���� �ݺ�
			sum += i;
		}
		// 1���� XX ������ �� �հ� : XX
		System.out.println("1����" + num + "������  �� �հ� : " + sum);
	}
	
	public void method8( ) {
		// 1���� ���� ������(1~10������ ������ ����) ������ �հ�
		
		/*
		 * java.lang.Math Ŭ�������� �����ϴ� random() �޼ҵ带 ����ؼ� ������ �߻� ����
		 * Math.random() --> 0.0 ~ 0.999999 ������ ������ �߻� 
		 */
		
		// int random = Math.random(); // double���̶� int�� ������ ��°� �Ұ� 
			// 	0.0 <=______ < 1.0	---> 0.0 ~ 0.999999
		
		//int random = Math.random() *10;
				// 0.0<= ____<10.0	--> 0.0 ~ 9.999999
		
		//int random = Math.random() *10 + 1; 
				// 1.0 <=______<11.0 ---> 1.0 ~ 10.999999
		
		int random = (int)(Math.random() *10 + 1);
				// 1 <= ________ <11	 ---> 1 ~ 10
		
		//System.out.println(random);
		
		// sum+= 1;
		// sum+= 2;
		// sum+= 3;
		// .....
		// sum = += random;
		
		int sum = 0; 
		
		for(int i=1; i<=random; i++) {
			sum += i; 
		}
		
		System.out.println("1����" + random + "������ �� �հ� : " + sum);
		
	}		 // end m8
	
	public void method9() {
		// 2�� ����ϱ�
			
		for(int i=1; i<=9; i++) {
			//System.out.println(" 2 x " + i + " = " + 2*i);
			System.out.printf("2 x %d = %2d\n", i, 2*i);
		}
		
	}
	public void method10() {		// start m10
		// ����ڰ� �Է��� ���� ����ϱ�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �� (2��~9��)�� �Է����ּ��� : ");
		int dan = sc.nextInt();
		
		// dan x 1 = multiplication result
		// dan x 2 = multi result
		// .......
		// dan x 9 - multi result
		
		if(dan>=2 && dan<=9) {		// �� �Է����� ��� --> �ݸ��� ���� ��� 
			
			for(int i=1; i <=9; i++) {
				//System.out.println(dan + " x " + i + " = " + dan*i);
				System.out.printf("%d x %d = %2d\n", dan, i, dan*i);
			}
			
		}else {		// �߸� �Է����� ��� ..> Error ����
			System.out.println("�߸� �Է��߽��ϴ�. ");
		}
		

	} 		// end m10
	
	public void method11() {			// stat m11
		// 2~9 ������ �������� ����ϱ�
		
		int random = (int)(Math.random()*8+2);			// �������� ���� ���� �� �� ���� ���� �̴�. 
						// 2.0 <= ___ <10.0 ---> 2.0 ~ 9.999
						// 2<=____<10  ---> 2 ~ 9
		
		// random x 1 =
		// random x 2 =
		// ......
		// random x 9 =
		
		System.out.println("===" + random + "��===");
		
		for(int i=1; i<=9; i++) {			
			System.out.printf("%d x %d = %d\n", random, i, random*i);
		}
		
	}		// end m11
	
	public void method12() {		// start m12
		
		// ����ڿ��� ���ڿ��� �Է¹��� ��
		// �� ���ڿ��� �� �ε����� ���ڸ� ���� �� ���
		
		// apple�� �Է¹޾Ҵٸ�	--> str (����)
		// a	--> str.charAt(0) output
		// p	--> str.charAt(1) output
		// p	--> str.charAt(2) output
		// l	--> str.charAt(3) output
		// e	--> str.charAt(4) output
		
		// index ���� 0 ~ ���ڿ��� ���� -1 (�������ε���)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� �Է� : ");
		String str = sc.nextLine();
		
		System.out.println("str: " + str);
		System.out.println("���ڿ��� ���� : " + str.length()); 	// will b wise to use it on long 
		
		for(int i=0; i<=str.length()-1; i++) {		// 0�������� �������ε������� 1�� �����ϴ� ���� �ݺ�
			System.out.println(str.charAt(i));
		}
		
	} 		// end m12
	
	/*
	 * * ��ø for��
	 * 
	 * for(�ʱ��; ���ǽ�1; ������1) {
	 * 
	 * 			������ ����1; 
	 * 
	 * 		for(�ʱ��2; ���ǽ�2; ������2) {
	 * 			������ ����2; 
	 *		 }
	 * 		������ ����3
	 * }
	 */
	
	public void method13() {
		// 1���� 5���� ���̾ ��µǴ� ������ �� 3�� �ݺ�
		// 1 2 3 4 5		// �� 3�� �ݺ�
		// 1 2 3 4 5
		// 1 2 3 4 5
		
		for(int i=1; i<=3; i++) {		// �� 3�� �ݺ�(1���� 3���� 1������)
			for(int j=1; j<=5; j++) {	// �� 5�� �ݺ�(1���� 5���� 1������)
				System.out.print(j+" ");	
			}
		System.out.println();
		}
		
		/*
		 * i=1 true 
		 * 				j=1 true 1output j++
		 * 				j=2 true 2output j++
		 * 				j=3 true 3output j++
		 * 				j=4 true 4output j++
		 * 				j=5 true 5output j++
		 * 				j=6 false	���� �ݺ��� ����
		 * 				���� ��� i++
		 * 
		 * i =2 true
		 * 				j=1 true 1output j++
		 * 				j=2 true 2output j++
		 * 				j=3 true 3output j++
		 * 				j=4 true 4output j++
		 * 				j=5 true 5output j++
		 * 				j=6 false	���� �ݺ��� ����
		 * 				���� ��� i++
		 * 
		 * i=3 true
		 * 				j=1 true  1output j++
		 * 				j=2 true 2output j++
		 * 				j=3 true 3output j++
		 * 				j=4 true 4output j++
		 * 				j=5 true 5output j++
		 * 				j=6 false	���� �ݺ��� ����
		 * 				���� ��� i++
		 * 
		 * i=4 false 
		 */
	}
	public void method14() {		// start m14
		// ***** 
		// *****
		// *****
		
		// ���� 3�� �ݺ� (1�������� 3���� 1�� �����ϴ� ����)
		// �� �ະ�� ���� 5�� �ݺ�(1�������� 5���� 1�� �����ϴ� ����)
		
		for(int i =1; i<=3; i++) {		// ��
			for(int j=1; j<=5; j++) {	// ��
				System.out.print("��");
			}
			System.out.println();
		}
		
		
	}		// end m14
	
	public void method15() {		// start m15
		// 0��0�� ~ 23�� 59��
		
		// �� ---> 0~23�ñ��� 1�� ����			--> �ٱ��� for��
	// �Žø��� �� --> 0 ~59�б��� 1�� ����	--> ���� for��
		
		for (int hour=0; hour<=23; hour++) {			//  hour<24
			for (int min=0; min<=59; min++) {
				System.out.println(hour + "�� " + min + "�� �Դϴ�.");
			}
			System.out.println("=========");
		}
		
		
		
		
	}		// end m15
	
	public void method16() {
		// 2�� ~ 9�� ���
		
		// �� ---> 2 ~ 9���� 1�� ���� 		==> �ٱ��� for��
		// �� �� �������� �� --> 1 ~ 9���� 1�� ���� 	==> ���� for��
		
		for(int dan=2; dan<=9; dan++) {
			System.out.printf("===%d��===\n" , dan);
			for(int su=1; su<=9; su++) {
				System.out.printf("%d x %d = %d\n", dan,su,(dan*su));
			}
			
		}
		
		
	}
	
	public void method17() {		// start m17
		
		while(true) {
			
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �� (2��~9��)�� �Է����ּ��� : ");
		int dan = sc.nextInt();
		
		if(dan>=2 && dan<=9) {		// �� �Է����� ��� --> �ݸ��� ���� ��� --> ���α׷� ����(���ѹݺ��� ���������Բ�)
			
			for(int i=1; i <=9; i++) {
				//System.out.println(dan + " x " + i + " = " + dan*i);
				System.out.printf("%d x %d = %2d\n", dan, i, dan*i);
			}
			
			break;		// ���� ����� �ݺ��� ���������� �б⹮
			
		}else {		// �߸� �Է����� ��� ..> Error ����
			System.out.println("�߸� �Է��߽��ϴ�. �ٽ� �Է����ּ���. ");
		}
		
		}
	} 	// end m17
	
	
	
}


