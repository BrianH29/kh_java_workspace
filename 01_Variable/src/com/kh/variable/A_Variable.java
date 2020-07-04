package com.kh.variable;

// �ٸ� ��Ű����� ���� Ŭ���������� ����� �� ���
public class A_Variable {  // class start 
	
	/*
	 *  *�н���ǥ
	 *  1. ������°� �����?
	 *  2. ������ �� ����� �ϴ���
	 *  3. ������ ��� ���� �Ǵ��� (����ϴ� ���)
	 *  4. �������� ��� ������ �Ǵ���
	 */
	
	public void printVariable() {  // printVariable method start
		
		System.out.println("===���� ��� ��===");
		System.out.println(100 + 10);
		System.out.println((100 + 10) * 10);
		System.out.println(((100 + 10) * 10) - 10);
		// ������� �� ��µ����� �����ǹ����� �� �� ����
		
		// 1. ������ ? >> � ���� �޸𸮿� ����ϱ� ���� ����(�ڽ��͵� ���� ����)
		
		int point = 100;   // point, bonus, personCount, fees�� �ڽ� �̸� (���� �̸�)
		int bonus = 10;   // int �� �ڷ����̴�. 
		int personCount = 10; 
		int fees = 10; 
		
		System.out.println("===���� ��� �� ===");
		System.out.println(point + bonus);
		System.out.println((point + bonus) * personCount);
		System.out.println(((point + bonus) * personCount) - fees);
		// ���� (�ڽ��̸�) ���� ������ �ǹ��ϴ��� �����ϱ� ����.
		
		/*
		 *  2. ������ ����ϴ� ����
		 *      - ������ �켱������ ���� �ǹ̸� �ο��ϱ� ���� �������� ���(�������� ������) 
		 *      - �ѹ� ���� �����صΰ� ��� ����� �������� ���
		 *      - ���������� ���� �ϱ� ���� ����
		 */
		
	}  // end printVariable method
	
	public void declareVariable() {   // start declareVariable method
		
		/*
		 *  *���� ����(declare) >> ������ �޸� ������ Ȯ���س��� ���� == �ڽ�����ž�!!!
		 *  
		 *  [ǥ����] �ڷ��� ������;  (�޸𸮻� ������ �ڽ��� ����ž� ��� ����) 
		 *  
		 *  �ڷ���: ����� ��������, � ũ���� ���� ���������� ���� ����(�ڽ�)�� ũ�� �� ����� ���ϴ� �κ�
		 *  ������: ����(�ڽ�)�� �̸��� ���ϴ� �κ�(�ǹ̺ο�) 
		 *  
		 * *������ ��
		 *   - �������� �ݵ�� ù ���ڰ� �ҹ��ڿ����Ѵ�.
		 *   - �����ܾ�� ���յ� ��� ��Ÿǥ��� ��Ű�� (testVariable)
		 *   - ���� �������� ������ ���������� ���� �Ұ�
		 *   - �ش� ���� ({})�� ������ ������ �ش� �����ȿ����� ���� �� �� �ִ�.  (��������)
		 *  
		 */
		
		// --- �ڷ����� ���� ���� ---
		
		// 1. ���� 
		boolean isTrue; 				// 1byte
		
		// 2. ������
		// 2-1. ������ (4����)
		byte bNum; 						// 1byte
		short sNum; 						// 2byte
		int iNum; 							// 4byte >> �������߿� ���� ��ǥ���� �ڷ���(�⺻��)
		long lNum; 						// 8byte 
		
		// 2-2. �Ǽ��� (2����)
		float fNum; 						// 4byte
		double dNum;					// 8byte >> �Ǽ��� �߿� ���� ��ǥ���� �ڷ���(�⺻��)
		// float ���� double �� ū ���� ������ �� �� �ִ°� �ƴ϶� �� ��Ȯ�� ���� ���� �� �� �־ ��ǥ������ ���. 
		
		
		
		// 3. ����(�ѱ���) ��
		char ch; 							// 2byte
		
		// -------------------- ���� ���� �⺻ �ڷ���(8��) ------------------------------
		
		// 4. ���ڿ� (�����ڷ���)
		String str; 
		
		/*
		 *  * ������ �� ����(���) <�ʱ� ���� ��ڴ�> 
		 *  
		 *  [ǥ����] ������ = ������ϴ� ��; <�ڿ� �� �տ� �ִ°����� ����>
		 */
		
		isTrue = true;		// ���� �������� true/false ���� ���尡��
		// boolean is True = true; �տ� boolean �ڷ����� �̹� �տ� �߱� ������ �� ���� �� �ʿ� ����. ������ �� �Ұ�� ������ ����°���.
		
		bNum = 1; 
		sNum = 2;
		iNum = 4;
		lNum = 8L;				// long�� �������� ���ڵڿ� �빮�� L�� ǥ���ϴ°� ���� ������. 
										// ���ʰ� ������ ���� ���°� �Ȱ��ƾ� �ϱ� ������ LONG �ڷ����� ��� ���� �ڿ� L ǥ�� 
		
		fNum = 4.0f; 			//  float ���� ���ڵڿ� fǥ�� �ݵ�� �ٿ��� �Ѵ�. >> �ڵ����� �� ������ �ȵǱ� ������ f ǥ�� �ʿ�
		dNum = 8.0; 
		
		ch = 'A'; 
		ch = 'Ȳ';
		
		str = "ABC";
		str = "A"; 
		
		// * ������ ���� �� ������ ���
		System.out.println("is True�� �� : " + isTrue);
		System.out.println("bNum�� �� : " + bNum);
		System.out.println("sNum�� �� : " + sNum);
		System.out.println("iNum�� ��  :" + iNum);
		System.out.println("lNum�� �� : " + lNum);
		System.out.println("fNum�� �� : " + fNum);
		System.out.println("dNum�� �� : " + dNum);
		System.out.println("ch�� �� : " + ch);
		System.out.println("str�� �� : " + str);
		
		
	} // end declareVariable method 
	
	public void initVariable() {    			// init = �ʱ�ȭ  start initVariable 
		
		// * ���� ����� ���ÿ� �ʱ�ȭ 
		// [ǥ����] �ڷ��� ������ = ��;
		
		// 1. ����
		boolean isTrue = false;  //  1byte
		// 2-1. ������
		byte bNum = 1;				// 1byte
		short sNum = 2; 				// 2byte
		int iNum = 4; 					// 4byte		>> �⺻�� 
		long lNum = 8L;				// 8byte 
		// 2-2. �Ǽ���
		float fNum = 4.0f;				// 4byte
		double dNum = 8.0;			// 8byte		>> �⺻�� 
		// 3. ������
		char ch = '��';					// 2byte
		
		// ------- �⺻ �ڷ��� (8��)----------			
		
		// ------- �����ڷ��� --------------
		String str = "�ȳ��ϼ���";
		
		System.out.println("isTrue�� �� : " + isTrue);
		System.out.println("bNum�� �� : " + bNum);
		System.out.println("sNum�� �� : " + sNum);
		System.out.println("iNum�� �� : " + iNum);
		System.out.println("lNum�� �� : " + lNum);
		System.out.println("fNum�� �� : " + fNum);
		System.out.println("dNum�� �� : " + dNum);
		System.out.println("ch�� �� : " + ch);
		System.out.println("str�� �� : " + str);
		
		
		// 4. ���� ��� ��Ģ
		int number; 
		//int,double number;  
		
		// 1. �������� �ߺ��Ǽ��� �ȵ� ( �ٸ��ڷ����̿��� �ȵ� ) 
		//	��, ��ҹ��ڷ� ������ 
		int numBer; // ��ҹ��� ���� �ϱ� ������ �ߺ� �ȵ� ���� �ܾ�� 
		
		// 2. �����(�̹� �ڹٿ��� ���ǰ� �ִ� key word) ��� �Ұ� 
		// int public; 
		// int void;
		// int abstract;
		// int true;
		
		
		// 3. ���� ��� ���� (��, ���ڷ� �����ϴ� �� �ȵ�)
		int age1; // ������ ���� ��밡�� �׷��� �������� ����
		//int 1age; // ���ڷ� �����ϴ°��� �ȵ� 
		
		
		// 4. _ or $ Ư�� ���� ��� ���� (�� ���� Ư������ ��� �Ұ�)
		int number_1; 
		int number$1; 
		//int number#1; 
		
		// *��Ÿ ǥ��� ��Ű�°� �������
		String username;  
		String userName; 
		
		// * �ѱ��� ������� �ʴ°� �������
		String �̸�; 
		
		
	} // end initVariable 
	
	
	
	
}  // end class 
