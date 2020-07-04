package com.kh.chap02.loop;

import java.util.Scanner;

public class B_While {

	/*
	 * *for��
	 * 
	 * for(�ʱ��; ���ǽ�; ������) { �ݺ������� ������ �ڵ�; }
	 * 
	 * * while��
	 * 
	 * �ʱ��;
	 * 
	 * while(���ǽ�) { �ݺ������� ������ �ڵ�; ������;
	 *
	 * }
	 * 
	 */

	public void method1() { // start m1
		// �ȳ��ϼ��� 5�� ���

		int i = 1; // for�� �� �ٸ��� �ʱ���� �ۿ� �ֱ� ������ �ʱ���� ���� i�� ��� �� �� �ִ�. for �� while ����

		while (i <= 5) {
			System.out.println("hi");
			i++;

		}
		System.out.println("i : " + i);

		// 1 2 3 4 5

		int j = 1;
		while (j <= 5) {
			// System.out.print(j + " ");
			// j++;
			System.out.print(j++ + " ");
		}
		System.out.println();

		int h = 5;
		while (h >= 1) {
			// System.out.print(h + " ");
			// h--;
			System.out.print(h-- + " ");
		}

	} // end m1

	public void method2() { // start m2
		// 1 3 5 7 9

		int i = 1;
		while (i <= 10) {
			System.out.print(i + " ");
			i += 2;
		}

		System.out.println();

		int j = 1;
		while (j <= 10) {
			if (j % 2 == 1) {
				System.out.print(j + " ");
				j++;
			}

		}

	} // end m2

	public void method3() { // start m3
		int random = (int) (Math.random() * 10 + 1);

		int sum = 0;

		int i = 1;
		while (i <= random) {
			System.out.print(i + " ");
			sum += i;
			i++;
		}
		System.out.println("\n1����" + random + "������ �� �հ� : " + sum);
	} // end m3

	public void method4() { // start m4

		Scanner sc = new Scanner(System.in);
		System.out.print("�� �� (2��~9��)�� �Է����ּ��� : ");
		int dan = sc.nextInt();

		if (dan >= 2 && dan <= 9) { // true

			int su = 1;
			while (su <= 9) { // start while

				System.out.printf("%d x %d = %d\n", dan, su, (dan * su));
				su++;

			} // end while

		} else { // false
			System.out.println("�߸� �Է��߽��ϴ�.");
		}
	} // end m4
	
	public void method5() {		// start m5		// private ���� ������ private void method5()
		// ����ڿ��� ���ڿ� �Է¹��� �� �� �ε����� ���� �̾� ����ϱ�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� �Է�:");
		String ch = sc.nextLine();
		
		int i = 0;
			//==(i<ch.length())
		while(i<=ch.length()-1) {
			System.out.println(ch.charAt(i));
			i++;
		}
		
	}		// end m5

}
