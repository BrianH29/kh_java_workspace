package com.kh.first;

/*
 * ��Ģ
 * 1. Ŭ������ --> �빮�ڷ� ����
 * 2. ��Ű���� --> �ҹ��ڷ� ����
 * 3. �޼ҵ�� --> �ҹ��ڷ� ����
 * 4. ������ --> �ҹ��ڷ� ����
 * 
 *  > ��, �������� �ܾ ���յǾ� ���� ���� �ܾ� ���ڸ� ���� �빮�ڷ�! == ��Ÿǥ���
 *  ex) Ŭ������ Methodprinter => MethodPrinter
 *  	  �޼ҵ�� testprinter => TestPrint
 *  
 *  > �׻� �ǹ��ְ� �̸�����!
 *  >�ѱ۸� ������� �ɼ� ������ ����� 
 *  
 */


public class B_ValuePrinter { 	        // class start [B_ValuePrinter >> �޼ҵ��]
	
	// �پ��� ������ ���� ����ϴ� ����� �����ϴ� �޼ҵ� 
	public void printValue() {         
	
		// 1. ���� ��� >> ����ǥ ���� ���� ����
		System.out.println(123);								 // ������ ��� ����
		System.out.println(1.23); 							// �Ǽ��� ��� ���� 
	
		// 2. ����(�ѱ���) ��� >> Ȭ ����ǥ �̿�
		System.out.println('a');
		System.out.println('��');
		
		// 3. ���ڿ�(��������) ��� >> �ֵ���ǥ �̿� / �ٸ� ���α׷����� ���� ���� ���ϱ⵵ ��
		System.out.println("Ȳ��õ");
		System.out.println("�ȳ��ϼ���");       
		
		// 4. ������ ��� ���� ��� ����
		System.out.println(123 + 456);
		System.out.println(1.23 - 0.12); // ��ǻ�Ϳ����� �Ǽ��� ������ �ҿ����ϰ� �̼��� ���� �߻����� 
		
		// 5. ���ڿ� ���ڴ� ���갡�� >> ���ڿ� ���� ����� ���ڸ� �ڵ����� ���ڷ� �ν� 
		System.out.println('a' + 1 );  // �� ���ڸ��� ��ǻ�Ͱ� �ν��ϴ� ������ ���ڰ� (a=97)
		
		// 6. ���ڿ� (" ")�� �� ���� ������ ��������
		System.out.println("����" + 'a');							// "����a"
		System.out.println("�ȳ��ϼ���" + 123); 
		System.out.println("�ݰ����ϴ�" + 111 + 222);
		System.out.println("�ݰ����ϴ�111");
		
	}
	
	// ���ڿ��� ������ �������� ��ɿ� �޼ҵ� 
	public void sumStringNumber() {
		
		System.out.println(9 + 9);           //  18
		System.out.println(9 + "9");        //   "99"
		System.out.println("9" + 9);       //   "99"
		System.out.println("9" + "9");    //   "99"
		
		System.out.println("------------");
		
		System.out.println(9 + 9 + "9");
		System.out.println(9+"9"+9);
		System.out.println("9"+9+9);
		
		
		
	}
	
	

} // end class 
