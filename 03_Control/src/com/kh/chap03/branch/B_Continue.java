package com.kh.chap03.branch;

public class B_Continue {

	// continue : ���� ���� ����� �ݺ������� �ö󰡶�� �ǹ�

	public void method1() { // s.m1

		// 1���� 10������ Ȧ������ ���
		// 1 3 5 7 9

		/*
		 * for(int i=1; i<=10; i++) { // s.f 
		 * if(i%2 == 1) { // i�� Ȧ���� ��츸
		 * System.out.print(i + " "); // ��� } 
		 * } 
		 * 
		 * //e.f
		 */

		for (int i = 1; i <= 10; i++) {

			if (i % 2 == 0) { // ¦���� ���
				continue; // ���� ���๮�� �ǳʶٰ� �ݺ��� ���� �ö󰡶�!! -->(������)
			}

			System.out.print(i + " ");
		}

	} // e.m1

	public void method2() {		//s.m2
		// 1~100������ �������� �� �հ�
		// ��, 6�� ������� ���� ��������
		
		int sum = 0; 
		
		for(int i=1; i<=100;i++) {
			if(i % 6==0) {		// 6�� ����� ��� 
				continue;		// 6�� ����� ��� continue�� ������ �ڿ� �ִ� sum�� �����ϰ� �ٽ� �� for������ ���� ����. �� 6�� ����� ���� ��Ű�� ���̴�. 
			}
			sum += i;
		}
		System.out.println("�� �հ�: " + sum);
		
	}	//e.m2
	
	public void method3() {		//s.m3
		// 2~9�� ������ ������ ��� ��
		// 4�� ������� ���� ���
		
		// �� �� : 2~9���� 1�� ����		=> �ٱ��� for��
		// �������� �� : �� �ܸ��� 1~9���� 1�� ���� 		=> ���� for�� 
		
		
		for(int dan=2; dan<=9; dan++) {	//out.for
			
			if(dan % 4 == 0) {
				continue;
			}
			
			System.out.println("===" + dan + "��===");
			
			for(int su=1; su<=9; su++) {	// in.for
				//3�� ��� ���� �ǳʶ�� ���ϰڴ�.
				if(su % 3==0) {
					continue;
				}
				
				System.out.printf("%d x %d = %d\n", dan, su, (dan*su));
			}		// e.in.for
			
			System.out.println("==========");
		}		// out.for 
		
		
	}	//e.m3
	
}
