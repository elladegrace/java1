package ch15_02;

import java.util.Scanner;//java.util��Ű��

public class StaticMember {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("ȯ��(1�޷�)>> ");
		double rate = scanner.nextDouble();//double�� �Է�
		CurrencyConverter.setRate(rate); // �̱� �޷� ȯ�� ���� - Ŭ������.�޼ҵ�()
		System.out.println("�鸸���� $" 
		                + CurrencyConverter.toDollar(1000000) +"�Դϴ�.");
		System.out.println("$100�� " 
		                 + CurrencyConverter.toKWR(100) + "���Դϴ�.");
		scanner.close();

	}

}
