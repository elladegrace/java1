package ch04;

import java.util.Scanner;

public class TryWithResourcesExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
		System.out.println("�޼������");
		String msg=scanner.next();
		System.out.println("�Է³���:"+msg);
		}catch(Exception e) {
			
		}finally {
			System.out.println("�ڿ������ϱ�");
			scanner.close();
		}
     
	}
}
