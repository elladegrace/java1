package ch12;

import java.util.Scanner;

public class EnumUseExample2 {
	public static void main(String[] args) {
		//���ż���
		Blood blood;
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("�������� �Է��ϼ���(A,B,AB,O)>");
       
       blood = Blood.valueOf(scanner.next());
       
       System.out.println("�Է��� �������� : "+blood.name()+"Ÿ���Դϴ�.");
		
	}
}
