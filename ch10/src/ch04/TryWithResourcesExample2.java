package ch04;

import java.util.Scanner;

public class TryWithResourcesExample2 {
	public static void main(String[] args) {
		
		//try-with-resources��
		//try()������ ���𰡴��� ��ü�� ����
		//��ü�� AutoCloseable�ؾ���.
		try(Scanner scanner = new Scanner(System.in);) {
		System.out.println("�޼������");
		String msg=scanner.next();
		System.out.println("�Է³���:"+msg);
		}catch(Exception e) {
			
		}
     
	}
}
